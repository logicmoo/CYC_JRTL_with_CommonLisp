package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class fact_sheet_logs extends SubLTranslatedFile
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
    public static SubLObject fact_sheet_log_stream() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return fact_sheet_logs.$fact_sheet_log_stream$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 1141L)
    public static SubLObject with_quiet_fact_sheet_logging(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)fact_sheet_logs.$sym0$CLET, (SubLObject)fact_sheet_logs.$list1, ConsesLow.append(body, (SubLObject)fact_sheet_logs.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 1272L)
    public static SubLObject log_fact_sheet_message(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject msg_type = (SubLObject)fact_sheet_logs.NIL;
        SubLObject format_str = (SubLObject)fact_sheet_logs.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fact_sheet_logs.$list4);
        msg_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fact_sheet_logs.$list4);
        format_str = current.first();
        final SubLObject args;
        current = (args = current.rest());
        final SubLObject stream = (SubLObject)fact_sheet_logs.$sym5$STREAM;
        return (SubLObject)ConsesLow.list((SubLObject)fact_sheet_logs.$sym0$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(stream, (SubLObject)fact_sheet_logs.$list6)), (SubLObject)ConsesLow.list((SubLObject)fact_sheet_logs.$sym7$PWHEN, (SubLObject)ConsesLow.list((SubLObject)fact_sheet_logs.$sym8$COR, (SubLObject)ConsesLow.listS((SubLObject)fact_sheet_logs.$sym9$CAND, (SubLObject)ConsesLow.list((SubLObject)fact_sheet_logs.EQ, (SubLObject)fact_sheet_logs.T, stream), (SubLObject)fact_sheet_logs.$list10), (SubLObject)ConsesLow.list((SubLObject)fact_sheet_logs.$sym9$CAND, (SubLObject)ConsesLow.list((SubLObject)fact_sheet_logs.$sym11$STREAMP, stream), (SubLObject)ConsesLow.list((SubLObject)fact_sheet_logs.$sym12$OUTPUT_STREAM_P, stream))), (SubLObject)ConsesLow.list((SubLObject)fact_sheet_logs.$sym13$PRINT_FACT_SHEET_LOG_HEADER, msg_type, stream), (SubLObject)ConsesLow.listS((SubLObject)fact_sheet_logs.$sym14$FORMAT, stream, format_str, ConsesLow.append(args, (SubLObject)fact_sheet_logs.NIL)), (SubLObject)ConsesLow.list((SubLObject)fact_sheet_logs.$sym15$FORCE_OUTPUT, stream)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 1774L)
    public static SubLObject print_fact_sheet_log_header(final SubLObject msg_type, final SubLObject stream) {
        streams_high.terpri(stream);
        print_high.princ(numeric_date_utilities.datestring((SubLObject)fact_sheet_logs.UNPROVIDED), stream);
        print_high.princ((SubLObject)fact_sheet_logs.$str16$_, stream);
        print_high.princ(numeric_date_utilities.secondstring((SubLObject)fact_sheet_logs.UNPROVIDED), stream);
        print_high.princ((SubLObject)fact_sheet_logs.$str16$_, stream);
        print_high.princ(msg_type, stream);
        print_high.princ((SubLObject)fact_sheet_logs.$str17$__, stream);
        return (SubLObject)fact_sheet_logs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 2059L)
    public static SubLObject log_fact_sheet_warning(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_str = (SubLObject)fact_sheet_logs.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fact_sheet_logs.$list18);
        format_str = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)fact_sheet_logs.$sym2$LOG_FACT_SHEET_MESSAGE, (SubLObject)fact_sheet_logs.$str19$WARN, format_str, ConsesLow.append(args, (SubLObject)fact_sheet_logs.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 2213L)
    public static SubLObject log_fact_sheet_note(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_str = (SubLObject)fact_sheet_logs.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fact_sheet_logs.$list18);
        format_str = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)fact_sheet_logs.$sym2$LOG_FACT_SHEET_MESSAGE, (SubLObject)fact_sheet_logs.$str20$NOTE, format_str, ConsesLow.append(args, (SubLObject)fact_sheet_logs.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 2378L)
    public static SubLObject with_fact_sheet_log_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fact_sheet_logs.$list21);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject filename = (SubLObject)fact_sheet_logs.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fact_sheet_logs.$list21);
        filename = current.first();
        current = current.rest();
        if (fact_sheet_logs.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)fact_sheet_logs.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)fact_sheet_logs.$sym22$_FACT_SHEET_LOG_FILE_, filename)), (SubLObject)ConsesLow.listS((SubLObject)fact_sheet_logs.$sym23$WITH_PRIVATE_TEXT_FILE, (SubLObject)fact_sheet_logs.$list24, ConsesLow.append(body, (SubLObject)fact_sheet_logs.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)fact_sheet_logs.$list21);
        return (SubLObject)fact_sheet_logs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 2597L)
    public static SubLObject with_fact_sheet_logging(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject directory = (SubLObject)fact_sheet_logs.$sym25$DIRECTORY;
        final SubLObject filename = (SubLObject)fact_sheet_logs.$sym26$FILENAME;
        final SubLObject already_loggingP = (SubLObject)fact_sheet_logs.$sym27$ALREADY_LOGGING_;
        final SubLObject use_new_setupP = (SubLObject)fact_sheet_logs.$sym28$USE_NEW_SETUP_;
        return (SubLObject)ConsesLow.list((SubLObject)fact_sheet_logs.$sym0$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(already_loggingP, (SubLObject)fact_sheet_logs.$list29), directory, filename, use_new_setupP), (SubLObject)ConsesLow.list((SubLObject)fact_sheet_logs.$sym30$PUNLESS, already_loggingP, (SubLObject)ConsesLow.listS((SubLObject)fact_sheet_logs.$sym31$CMULTIPLE_VALUE_SETQ, (SubLObject)ConsesLow.list(directory, filename), (SubLObject)fact_sheet_logs.$list32), (SubLObject)ConsesLow.list((SubLObject)fact_sheet_logs.$sym33$CSETQ, use_new_setupP, (SubLObject)ConsesLow.list((SubLObject)fact_sheet_logs.$sym9$CAND, (SubLObject)ConsesLow.list((SubLObject)fact_sheet_logs.$sym34$DIRECTORY_P, directory), (SubLObject)ConsesLow.list((SubLObject)fact_sheet_logs.$sym35$STRINGP, filename)))), (SubLObject)ConsesLow.listS((SubLObject)fact_sheet_logs.$sym7$PWHEN, use_new_setupP, (SubLObject)ConsesLow.list((SubLObject)fact_sheet_logs.$sym14$FORMAT, (SubLObject)fact_sheet_logs.$sym36$_STANDARD_OUTPUT_, (SubLObject)fact_sheet_logs.$str37$__Logging_Fact_Sheet_generation_t, filename), (SubLObject)fact_sheet_logs.$list38), (SubLObject)ConsesLow.listS((SubLObject)fact_sheet_logs.$sym39$WITH_FACT_SHEET_LOG_FILE, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)fact_sheet_logs.$sym40$FIF, use_new_setupP, filename, (SubLObject)fact_sheet_logs.$list41)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)fact_sheet_logs.$sym7$PWHEN, use_new_setupP, (SubLObject)fact_sheet_logs.$list42)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 3509L)
    public static SubLObject note_fact_sheet_log_file_closed(SubLObject file) {
        if (file == fact_sheet_logs.UNPROVIDED) {
            file = fact_sheet_logs.$fact_sheet_log_file$.getDynamicValue();
        }
        fact_sheet_logs.$closed_fact_sheet_log_files$.setGlobalValue((SubLObject)ConsesLow.cons(file, fact_sheet_logs.$closed_fact_sheet_log_files$.getGlobalValue()));
        return fact_sheet_logs.$closed_fact_sheet_log_files$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 3723L)
    public static SubLObject fact_sheet_log_file_closed_p(final SubLObject file) {
        return subl_promotions.memberP(file, fact_sheet_logs.$closed_fact_sheet_log_files$.getGlobalValue(), Symbols.symbol_function((SubLObject)fact_sheet_logs.EQUAL), (SubLObject)fact_sheet_logs.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 4114L)
    public static SubLObject hourly_fact_sheet_stats() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return fact_sheet_logs.$hourly_fact_sheet_stats$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 4194L)
    public static SubLObject with_fact_sheet_logging_and_hourly_reporting(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)fact_sheet_logs.$sym45$WITH_FACT_SHEET_LOGGING, (SubLObject)ConsesLow.listS((SubLObject)fact_sheet_logs.$sym0$CLET, (SubLObject)fact_sheet_logs.$list46, (SubLObject)fact_sheet_logs.$list47, ConsesLow.append(body, (SubLObject)fact_sheet_logs.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 4452L)
    public static SubLObject fact_sheet_hourly_reporting_onP() {
        return Types.vectorp(hourly_fact_sheet_stats());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 4549L)
    public static SubLObject reset_hourly_report_time(SubLObject time) {
        if (time == fact_sheet_logs.UNPROVIDED) {
            time = numeric_date_utilities.universal_time_from_now((SubLObject)fact_sheet_logs.ZERO_INTEGER, (SubLObject)fact_sheet_logs.ZERO_INTEGER, (SubLObject)fact_sheet_logs.ONE_INTEGER);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        fact_sheet_logs.$next_fact_sheet_hourly_report_time$.setDynamicValue(time, thread);
        return fact_sheet_logs.$next_fact_sheet_hourly_report_time$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 4801L)
    public static SubLObject clear_hourly_fact_sheet_stats() {
        clear_hourly_fact_sheet_update_count();
        clear_hourly_fact_sheet_query_timeout_count();
        return hourly_fact_sheet_stats();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 4975L)
    public static SubLObject add_fact_sheet_info_to_hourly_stats(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hourly_fact_sheet_stats().isVector()) {
            Vectors.set_aref(fact_sheet_logs.$hourly_fact_sheet_stats$.getDynamicValue(thread), (SubLObject)fact_sheet_logs.ZERO_INTEGER, Numbers.add(Vectors.aref(fact_sheet_logs.$hourly_fact_sheet_stats$.getDynamicValue(thread), (SubLObject)fact_sheet_logs.ZERO_INTEGER), (SubLObject)fact_sheet_logs.ONE_INTEGER));
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 5159L)
    public static SubLObject get_hourly_fact_sheet_update_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Vectors.aref(fact_sheet_logs.$hourly_fact_sheet_stats$.getDynamicValue(thread), (SubLObject)fact_sheet_logs.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 5258L)
    public static SubLObject clear_hourly_fact_sheet_update_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Vectors.set_aref(fact_sheet_logs.$hourly_fact_sheet_stats$.getDynamicValue(thread), (SubLObject)fact_sheet_logs.ZERO_INTEGER, (SubLObject)fact_sheet_logs.ZERO_INTEGER);
        return (SubLObject)fact_sheet_logs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 5375L)
    public static SubLObject note_fact_sheet_query_timeout_in_hourly_stats() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (fact_sheet_logs.NIL != fact_sheet_hourly_reporting_onP()) {
            Vectors.set_aref(fact_sheet_logs.$hourly_fact_sheet_stats$.getDynamicValue(thread), (SubLObject)fact_sheet_logs.ONE_INTEGER, Numbers.add(Vectors.aref(fact_sheet_logs.$hourly_fact_sheet_stats$.getDynamicValue(thread), (SubLObject)fact_sheet_logs.ONE_INTEGER), (SubLObject)fact_sheet_logs.ONE_INTEGER));
        }
        return (SubLObject)fact_sheet_logs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 5546L)
    public static SubLObject get_hourly_fact_sheet_query_timeout_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Vectors.aref(fact_sheet_logs.$hourly_fact_sheet_stats$.getDynamicValue(thread), (SubLObject)fact_sheet_logs.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 5652L)
    public static SubLObject clear_hourly_fact_sheet_query_timeout_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Vectors.set_aref(fact_sheet_logs.$hourly_fact_sheet_stats$.getDynamicValue(thread), (SubLObject)fact_sheet_logs.ONE_INTEGER, (SubLObject)fact_sheet_logs.ZERO_INTEGER);
        return (SubLObject)fact_sheet_logs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 5776L)
    public static SubLObject maybe_log_fact_sheet_hourly_report() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (fact_sheet_logs.NIL != numeric_date_utilities.universal_time_p(fact_sheet_logs.$next_fact_sheet_hourly_report_time$.getDynamicValue(thread)) && Time.get_universal_time().numG(fact_sheet_logs.$next_fact_sheet_hourly_report_time$.getDynamicValue(thread))) {
            log_fact_sheet_hourly_report();
        }
        return (SubLObject)fact_sheet_logs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 6024L)
    public static SubLObject log_fact_sheet_hourly_report() {
        final SubLObject fact_sheet_count = get_hourly_fact_sheet_update_count();
        final SubLObject timeout_count = get_hourly_fact_sheet_query_timeout_count();
        final SubLObject stream = fact_sheet_log_stream();
        if ((fact_sheet_logs.T == stream && Threads.current_process().eql(subl_promotions.initial_process())) || (stream.isStream() && fact_sheet_logs.NIL != streams_high.output_stream_p(stream))) {
            print_fact_sheet_log_header((SubLObject)fact_sheet_logs.$str20$NOTE, stream);
            PrintLow.format(stream, (SubLObject)fact_sheet_logs.$str50$Hourly_report__Generated__S_fact_, fact_sheet_count, timeout_count);
            streams_high.force_output(stream);
        }
        clear_hourly_fact_sheet_stats();
        reset_hourly_report_time((SubLObject)fact_sheet_logs.UNPROVIDED);
        return (SubLObject)fact_sheet_logs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 6408L)
    public static SubLObject fact_sheet_log_directory_generated_count(final SubLObject log_directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = (SubLObject)fact_sheet_logs.ZERO_INTEGER;
        assert fact_sheet_logs.NIL != Filesys.directory_p(log_directory) : log_directory;
        SubLObject directory_contents_var = Filesys.directory(log_directory, (SubLObject)fact_sheet_logs.T);
        final SubLObject progress_message_var = Sequences.cconcatenate((SubLObject)fact_sheet_logs.$str51$Counting_fact_sheets_in_, format_nil.format_nil_s_no_copy(log_directory));
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
            if (fact_sheet_logs.NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$1 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((fact_sheet_logs.NIL != progress_message_var) ? progress_message_var : fact_sheet_logs.$str52$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)fact_sheet_logs.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)fact_sheet_logs.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)fact_sheet_logs.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)fact_sheet_logs.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = (SubLObject)fact_sheet_logs.NIL;
                    file = csome_list_var.first();
                    while (fact_sheet_logs.NIL != csome_list_var) {
                        total = Numbers.add(total, fact_sheet_log_file_generated_count(file, (SubLObject)fact_sheet_logs.UNPROVIDED));
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)fact_sheet_logs.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)fact_sheet_logs.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
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
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 6763L)
    public static SubLObject fact_sheet_log_file_generated_count(final SubLObject log_file, SubLObject data) {
        if (data == fact_sheet_logs.UNPROVIDED) {
            data = get_fact_sheet_log_file_data(log_file);
        }
        return Sequences.length(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 6920L)
    public static SubLObject fact_sheet_log_directory_average_total_time(final SubLObject log_directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)fact_sheet_logs.ZERO_INTEGER;
        SubLObject time = (SubLObject)fact_sheet_logs.ZERO_INTEGER;
        assert fact_sheet_logs.NIL != Filesys.directory_p(log_directory) : log_directory;
        SubLObject directory_contents_var = Filesys.directory(log_directory, (SubLObject)fact_sheet_logs.T);
        final SubLObject progress_message_var = Sequences.cconcatenate((SubLObject)fact_sheet_logs.$str53$Gathering_time_info_for_fact_shee, format_nil.format_nil_s_no_copy(log_directory));
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
            if (fact_sheet_logs.NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$3 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((fact_sheet_logs.NIL != progress_message_var) ? progress_message_var : fact_sheet_logs.$str52$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)fact_sheet_logs.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)fact_sheet_logs.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)fact_sheet_logs.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)fact_sheet_logs.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = (SubLObject)fact_sheet_logs.NIL;
                    file = csome_list_var.first();
                    while (fact_sheet_logs.NIL != csome_list_var) {
                        thread.resetMultipleValues();
                        final SubLObject this_count = fact_sheet_log_file_generated_count(file, (SubLObject)fact_sheet_logs.UNPROVIDED);
                        final SubLObject this_time = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        count = Numbers.add(count, this_count);
                        time = Numbers.add(time, this_time);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)fact_sheet_logs.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)fact_sheet_logs.T, thread);
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
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$3, thread);
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return Numbers.divide(time, count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 7367L)
    public static SubLObject fact_sheet_log_file_count_and_total_time(final SubLObject log_file, SubLObject data) {
        if (data == fact_sheet_logs.UNPROVIDED) {
            data = get_fact_sheet_log_file_data(log_file);
        }
        SubLObject count = fact_sheet_log_file_generated_count(log_file, data);
        SubLObject total_time = (SubLObject)fact_sheet_logs.ZERO_INTEGER;
        SubLObject cdolist_list_var = data;
        SubLObject plist = (SubLObject)fact_sheet_logs.NIL;
        plist = cdolist_list_var.first();
        while (fact_sheet_logs.NIL != cdolist_list_var) {
            final SubLObject this_time = conses_high.getf(plist, (SubLObject)fact_sheet_logs.$kw54$TOTAL_TIME, (SubLObject)fact_sheet_logs.NIL);
            if (fact_sheet_logs.NIL != this_time) {
                total_time = Numbers.add(total_time, this_time);
            }
            else {
                count = Numbers.subtract(count, (SubLObject)fact_sheet_logs.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            plist = cdolist_list_var.first();
        }
        return Values.values(count, total_time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 7885L)
    public static SubLObject plot_fact_sheet_log_directory_generated_count_by_date(final SubLObject log_directory, SubLObject output_file, SubLObject ensure_up_to_dateP) {
        if (output_file == fact_sheet_logs.UNPROVIDED) {
            output_file = (SubLObject)fact_sheet_logs.NIL;
        }
        if (ensure_up_to_dateP == fact_sheet_logs.UNPROVIDED) {
            ensure_up_to_dateP = (SubLObject)fact_sheet_logs.NIL;
        }
        final SubLObject v_dictionary = fact_sheet_log_directory_generated_count_by_date(log_directory, ensure_up_to_dateP);
        SubLObject data = (SubLObject)fact_sheet_logs.NIL;
        SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_keys(v_dictionary, (SubLObject)fact_sheet_logs.$sym56$DATESTRING_);
        SubLObject cons = (SubLObject)fact_sheet_logs.NIL;
        cons = cdolist_list_var.first();
        while (fact_sheet_logs.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject date_string = (SubLObject)fact_sheet_logs.NIL;
            SubLObject count = (SubLObject)fact_sheet_logs.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fact_sheet_logs.$list55);
            date_string = current.first();
            current = (count = current.rest());
            data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(date_string, count), data);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        plot_generation.generate_lines_graph((SubLObject)ConsesLow.list(Sequences.nreverse(data)), (SubLObject)ConsesLow.list(new SubLObject[] { fact_sheet_logs.$kw57$XDATA, fact_sheet_logs.$str58$time, fact_sheet_logs.$kw59$TIMEFMT, fact_sheet_logs.$str60$__m__d__Y_, fact_sheet_logs.$kw61$XLABEL, fact_sheet_logs.$str62$Date, fact_sheet_logs.$kw63$YLABEL, fact_sheet_logs.$str64$__of_Fact_Sheets, fact_sheet_logs.$kw65$PLOT_TITLE, log_directory, fact_sheet_logs.$kw66$LINE_LABELS, fact_sheet_logs.$list67, fact_sheet_logs.$kw68$OUTPUT_FILE, output_file }));
        return output_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 8567L)
    public static SubLObject fact_sheet_log_directory_generated_count_by_date(final SubLObject log_directory, SubLObject ensure_up_to_dateP) {
        if (ensure_up_to_dateP == fact_sheet_logs.UNPROVIDED) {
            ensure_up_to_dateP = (SubLObject)fact_sheet_logs.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert fact_sheet_logs.NIL != Filesys.directory_p(log_directory) : log_directory;
        final SubLObject directory_data = get_fact_sheet_log_directory_data(log_directory, ensure_up_to_dateP);
        final SubLObject v_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)fact_sheet_logs.EQUAL), (SubLObject)fact_sheet_logs.UNPROVIDED);
        final SubLObject progress_message = Sequences.cconcatenate((SubLObject)fact_sheet_logs.$str69$Categorizing_fact_sheets_in_, new SubLObject[] { format_nil.format_nil_s_no_copy(log_directory), fact_sheet_logs.$str70$_by_date });
        assert fact_sheet_logs.NIL != Filesys.directory_p(log_directory) : log_directory;
        SubLObject directory_contents_var = Filesys.directory(log_directory, (SubLObject)fact_sheet_logs.T);
        final SubLObject progress_message_var = progress_message;
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
            if (fact_sheet_logs.NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$5 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((fact_sheet_logs.NIL != progress_message_var) ? progress_message_var : fact_sheet_logs.$str52$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)fact_sheet_logs.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)fact_sheet_logs.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)fact_sheet_logs.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)fact_sheet_logs.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = (SubLObject)fact_sheet_logs.NIL;
                    file = csome_list_var.first();
                    while (fact_sheet_logs.NIL != csome_list_var) {
                        final SubLObject file_data = dictionary.dictionary_lookup(directory_data, file_utilities.pathstring_filename(file), (SubLObject)fact_sheet_logs.NIL);
                        fact_sheet_log_file_generated_count_by_date(file, v_dictionary, file_data);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)fact_sheet_logs.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)fact_sheet_logs.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
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
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$5, thread);
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 9250L)
    public static SubLObject fact_sheet_log_file_generated_count_by_date(final SubLObject log_file, SubLObject v_dictionary, SubLObject data) {
        if (v_dictionary == fact_sheet_logs.UNPROVIDED) {
            v_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)fact_sheet_logs.EQUAL), (SubLObject)fact_sheet_logs.UNPROVIDED);
        }
        if (data == fact_sheet_logs.UNPROVIDED) {
            data = get_fact_sheet_log_file_data(log_file);
        }
        SubLObject cdolist_list_var = data;
        SubLObject datum = (SubLObject)fact_sheet_logs.NIL;
        datum = cdolist_list_var.first();
        while (fact_sheet_logs.NIL != cdolist_list_var) {
            final SubLObject date_string = list_utilities.plist_lookup(datum, (SubLObject)fact_sheet_logs.$kw71$END_DATE, (SubLObject)fact_sheet_logs.UNPROVIDED);
            dictionary_utilities.dictionary_increment(v_dictionary, date_string, (SubLObject)fact_sheet_logs.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        }
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 9604L)
    public static SubLObject fact_sheet_log_directory_average_total_time_by_date(final SubLObject log_directory, SubLObject ensure_up_to_dateP) {
        if (ensure_up_to_dateP == fact_sheet_logs.UNPROVIDED) {
            ensure_up_to_dateP = (SubLObject)fact_sheet_logs.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert fact_sheet_logs.NIL != Filesys.directory_p(log_directory) : log_directory;
        final SubLObject directory_data = get_fact_sheet_log_directory_data(log_directory, ensure_up_to_dateP);
        final SubLObject v_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)fact_sheet_logs.EQUAL), (SubLObject)fact_sheet_logs.UNPROVIDED);
        final SubLObject progress_message = Sequences.cconcatenate((SubLObject)fact_sheet_logs.$str72$Analyzing_fact_sheet_times_in_, new SubLObject[] { format_nil.format_nil_s_no_copy(log_directory), fact_sheet_logs.$str70$_by_date });
        assert fact_sheet_logs.NIL != Filesys.directory_p(log_directory) : log_directory;
        SubLObject directory_contents_var = Filesys.directory(log_directory, (SubLObject)fact_sheet_logs.T);
        final SubLObject progress_message_var = progress_message;
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
            if (fact_sheet_logs.NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$7 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((fact_sheet_logs.NIL != progress_message_var) ? progress_message_var : fact_sheet_logs.$str52$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)fact_sheet_logs.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)fact_sheet_logs.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)fact_sheet_logs.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)fact_sheet_logs.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = (SubLObject)fact_sheet_logs.NIL;
                    file = csome_list_var.first();
                    while (fact_sheet_logs.NIL != csome_list_var) {
                        final SubLObject file_data = dictionary.dictionary_lookup(directory_data, file_utilities.pathstring_filename(file), (SubLObject)fact_sheet_logs.NIL);
                        fact_sheet_log_file_average_total_time_by_date(file, v_dictionary, file_data);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)fact_sheet_logs.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)fact_sheet_logs.T, thread);
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
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$7, thread);
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 10297L)
    public static SubLObject fact_sheet_log_file_average_total_time_by_date(final SubLObject log_file, SubLObject v_dictionary, SubLObject data) {
        if (v_dictionary == fact_sheet_logs.UNPROVIDED) {
            v_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)fact_sheet_logs.EQUAL), (SubLObject)fact_sheet_logs.UNPROVIDED);
        }
        if (data == fact_sheet_logs.UNPROVIDED) {
            data = get_fact_sheet_log_file_data(log_file);
        }
        SubLObject cdolist_list_var = data;
        SubLObject datum = (SubLObject)fact_sheet_logs.NIL;
        datum = cdolist_list_var.first();
        while (fact_sheet_logs.NIL != cdolist_list_var) {
            final SubLObject date_string = list_utilities.plist_lookup(datum, (SubLObject)fact_sheet_logs.$kw71$END_DATE, (SubLObject)fact_sheet_logs.UNPROVIDED);
            final SubLObject seconds = list_utilities.plist_lookup(datum, (SubLObject)fact_sheet_logs.$kw54$TOTAL_TIME, (SubLObject)fact_sheet_logs.ZERO_INTEGER);
            SubLObject date_string_data = dictionary.dictionary_lookup_without_values(v_dictionary, date_string, (SubLObject)fact_sheet_logs.NIL);
            if (fact_sheet_logs.NIL == date_string_data) {
                date_string_data = (SubLObject)ConsesLow.cons((SubLObject)fact_sheet_logs.ZERO_INTEGER, (SubLObject)fact_sheet_logs.ZERO_INTEGER);
                dictionary.dictionary_enter(v_dictionary, date_string, date_string_data);
            }
            final SubLObject new_data = (SubLObject)ConsesLow.cons(number_utilities.f_1X(date_string_data.first()), Numbers.add(seconds, date_string_data.rest()));
            dictionary.dictionary_enter(v_dictionary, date_string, new_data);
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        }
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 11098L)
    public static SubLObject fact_sheet_log_directory_average_category_count_by_date(final SubLObject log_directory, SubLObject ensure_up_to_dateP) {
        if (ensure_up_to_dateP == fact_sheet_logs.UNPROVIDED) {
            ensure_up_to_dateP = (SubLObject)fact_sheet_logs.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert fact_sheet_logs.NIL != Filesys.directory_p(log_directory) : log_directory;
        final SubLObject directory_data = get_fact_sheet_log_directory_data(log_directory, ensure_up_to_dateP);
        final SubLObject v_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)fact_sheet_logs.EQUAL), (SubLObject)fact_sheet_logs.UNPROVIDED);
        final SubLObject progress_message = Sequences.cconcatenate((SubLObject)fact_sheet_logs.$str73$Analyzing_fact_sheet_categorizati, new SubLObject[] { format_nil.format_nil_s_no_copy(log_directory), fact_sheet_logs.$str70$_by_date });
        assert fact_sheet_logs.NIL != Filesys.directory_p(log_directory) : log_directory;
        SubLObject directory_contents_var = Filesys.directory(log_directory, (SubLObject)fact_sheet_logs.T);
        final SubLObject progress_message_var = progress_message;
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
            if (fact_sheet_logs.NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$9 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((fact_sheet_logs.NIL != progress_message_var) ? progress_message_var : fact_sheet_logs.$str52$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)fact_sheet_logs.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)fact_sheet_logs.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)fact_sheet_logs.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)fact_sheet_logs.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = (SubLObject)fact_sheet_logs.NIL;
                    file = csome_list_var.first();
                    while (fact_sheet_logs.NIL != csome_list_var) {
                        final SubLObject file_data = dictionary.dictionary_lookup(directory_data, file_utilities.pathstring_filename(file), (SubLObject)fact_sheet_logs.NIL);
                        fact_sheet_log_file_average_category_count_by_date(file, v_dictionary, file_data);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)fact_sheet_logs.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)fact_sheet_logs.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
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
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$9, thread);
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 11805L)
    public static SubLObject fact_sheet_log_file_average_category_count_by_date(final SubLObject log_file, SubLObject v_dictionary, SubLObject data) {
        if (v_dictionary == fact_sheet_logs.UNPROVIDED) {
            v_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)fact_sheet_logs.EQUAL), (SubLObject)fact_sheet_logs.UNPROVIDED);
        }
        if (data == fact_sheet_logs.UNPROVIDED) {
            data = get_fact_sheet_log_file_data(log_file);
        }
        SubLObject cdolist_list_var = data;
        SubLObject datum = (SubLObject)fact_sheet_logs.NIL;
        datum = cdolist_list_var.first();
        while (fact_sheet_logs.NIL != cdolist_list_var) {
            final SubLObject date_string = list_utilities.plist_lookup(datum, (SubLObject)fact_sheet_logs.$kw71$END_DATE, (SubLObject)fact_sheet_logs.UNPROVIDED);
            final SubLObject count = list_utilities.plist_lookup(datum, (SubLObject)fact_sheet_logs.$kw74$CATEGORY_COUNT, (SubLObject)fact_sheet_logs.ZERO_INTEGER);
            SubLObject date_string_data = dictionary.dictionary_lookup_without_values(v_dictionary, date_string, (SubLObject)fact_sheet_logs.NIL);
            if (fact_sheet_logs.NIL == date_string_data) {
                date_string_data = (SubLObject)ConsesLow.cons((SubLObject)fact_sheet_logs.ZERO_INTEGER, (SubLObject)fact_sheet_logs.ZERO_INTEGER);
                dictionary.dictionary_enter(v_dictionary, date_string, date_string_data);
            }
            final SubLObject new_data = (SubLObject)ConsesLow.cons(number_utilities.f_1X(date_string_data.first()), Numbers.add(count, date_string_data.rest()));
            dictionary.dictionary_enter(v_dictionary, date_string, new_data);
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        }
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 12614L)
    public static SubLObject fact_sheet_log_directory_average_sentence_count_by_date(final SubLObject log_directory, SubLObject ensure_up_to_dateP) {
        if (ensure_up_to_dateP == fact_sheet_logs.UNPROVIDED) {
            ensure_up_to_dateP = (SubLObject)fact_sheet_logs.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert fact_sheet_logs.NIL != Filesys.directory_p(log_directory) : log_directory;
        final SubLObject directory_data = get_fact_sheet_log_directory_data(log_directory, ensure_up_to_dateP);
        final SubLObject v_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)fact_sheet_logs.EQUAL), (SubLObject)fact_sheet_logs.UNPROVIDED);
        final SubLObject progress_message = Sequences.cconcatenate((SubLObject)fact_sheet_logs.$str75$Analyzing_fact_sheet_sentence_cou, new SubLObject[] { format_nil.format_nil_s_no_copy(log_directory), fact_sheet_logs.$str70$_by_date });
        assert fact_sheet_logs.NIL != Filesys.directory_p(log_directory) : log_directory;
        SubLObject directory_contents_var = Filesys.directory(log_directory, (SubLObject)fact_sheet_logs.T);
        final SubLObject progress_message_var = progress_message;
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
            if (fact_sheet_logs.NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$11 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((fact_sheet_logs.NIL != progress_message_var) ? progress_message_var : fact_sheet_logs.$str52$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)fact_sheet_logs.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)fact_sheet_logs.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)fact_sheet_logs.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)fact_sheet_logs.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = (SubLObject)fact_sheet_logs.NIL;
                    file = csome_list_var.first();
                    while (fact_sheet_logs.NIL != csome_list_var) {
                        final SubLObject file_data = dictionary.dictionary_lookup(directory_data, file_utilities.pathstring_filename(file), (SubLObject)fact_sheet_logs.NIL);
                        fact_sheet_log_file_average_sentence_count_by_date(file, v_dictionary, file_data);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)fact_sheet_logs.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)fact_sheet_logs.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
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
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$11, thread);
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 13317L)
    public static SubLObject fact_sheet_log_file_average_sentence_count_by_date(final SubLObject log_file, SubLObject v_dictionary, SubLObject data) {
        if (v_dictionary == fact_sheet_logs.UNPROVIDED) {
            v_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)fact_sheet_logs.EQUAL), (SubLObject)fact_sheet_logs.UNPROVIDED);
        }
        if (data == fact_sheet_logs.UNPROVIDED) {
            data = get_fact_sheet_log_file_data(log_file);
        }
        SubLObject cdolist_list_var = data;
        SubLObject datum = (SubLObject)fact_sheet_logs.NIL;
        datum = cdolist_list_var.first();
        while (fact_sheet_logs.NIL != cdolist_list_var) {
            final SubLObject date_string = list_utilities.plist_lookup(datum, (SubLObject)fact_sheet_logs.$kw71$END_DATE, (SubLObject)fact_sheet_logs.UNPROVIDED);
            final SubLObject count = list_utilities.plist_lookup(datum, (SubLObject)fact_sheet_logs.$kw76$PPH_SENTENCE_COUNT, (SubLObject)fact_sheet_logs.ZERO_INTEGER);
            SubLObject date_string_data = dictionary.dictionary_lookup_without_values(v_dictionary, date_string, (SubLObject)fact_sheet_logs.NIL);
            if (fact_sheet_logs.NIL == date_string_data) {
                date_string_data = (SubLObject)ConsesLow.cons((SubLObject)fact_sheet_logs.ZERO_INTEGER, (SubLObject)fact_sheet_logs.ZERO_INTEGER);
                dictionary.dictionary_enter(v_dictionary, date_string, date_string_data);
            }
            final SubLObject new_data = (SubLObject)ConsesLow.cons(number_utilities.f_1X(date_string_data.first()), Numbers.add(count, date_string_data.rest()));
            dictionary.dictionary_enter(v_dictionary, date_string, new_data);
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        }
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 14142L)
    public static SubLObject fact_sheet_log_directory_average_uncategorized_sentence_count_by_date(final SubLObject log_directory, SubLObject ensure_up_to_dateP) {
        if (ensure_up_to_dateP == fact_sheet_logs.UNPROVIDED) {
            ensure_up_to_dateP = (SubLObject)fact_sheet_logs.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert fact_sheet_logs.NIL != Filesys.directory_p(log_directory) : log_directory;
        final SubLObject directory_data = get_fact_sheet_log_directory_data(log_directory, ensure_up_to_dateP);
        final SubLObject v_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)fact_sheet_logs.EQUAL), (SubLObject)fact_sheet_logs.UNPROVIDED);
        final SubLObject progress_message = Sequences.cconcatenate((SubLObject)fact_sheet_logs.$str77$Analyzing_fact_sheet_uncategorize, new SubLObject[] { format_nil.format_nil_s_no_copy(log_directory), fact_sheet_logs.$str70$_by_date });
        assert fact_sheet_logs.NIL != Filesys.directory_p(log_directory) : log_directory;
        SubLObject directory_contents_var = Filesys.directory(log_directory, (SubLObject)fact_sheet_logs.T);
        final SubLObject progress_message_var = progress_message;
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
            if (fact_sheet_logs.NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$13 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((fact_sheet_logs.NIL != progress_message_var) ? progress_message_var : fact_sheet_logs.$str52$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)fact_sheet_logs.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)fact_sheet_logs.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)fact_sheet_logs.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)fact_sheet_logs.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = (SubLObject)fact_sheet_logs.NIL;
                    file = csome_list_var.first();
                    while (fact_sheet_logs.NIL != csome_list_var) {
                        final SubLObject file_data = dictionary.dictionary_lookup(directory_data, file_utilities.pathstring_filename(file), (SubLObject)fact_sheet_logs.NIL);
                        fact_sheet_log_file_average_uncategorized_sentence_count_by_date(file, v_dictionary, file_data);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)fact_sheet_logs.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)fact_sheet_logs.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
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
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$13, thread);
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 14885L)
    public static SubLObject fact_sheet_log_file_average_uncategorized_sentence_count_by_date(final SubLObject log_file, SubLObject v_dictionary, SubLObject data) {
        if (v_dictionary == fact_sheet_logs.UNPROVIDED) {
            v_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)fact_sheet_logs.EQUAL), (SubLObject)fact_sheet_logs.UNPROVIDED);
        }
        if (data == fact_sheet_logs.UNPROVIDED) {
            data = get_fact_sheet_log_file_data(log_file);
        }
        SubLObject cdolist_list_var = data;
        SubLObject datum = (SubLObject)fact_sheet_logs.NIL;
        datum = cdolist_list_var.first();
        while (fact_sheet_logs.NIL != cdolist_list_var) {
            final SubLObject date_string = list_utilities.plist_lookup(datum, (SubLObject)fact_sheet_logs.$kw71$END_DATE, (SubLObject)fact_sheet_logs.UNPROVIDED);
            final SubLObject count = list_utilities.plist_lookup(datum, (SubLObject)fact_sheet_logs.$kw78$MISC_SENTENCE_COUNT, (SubLObject)fact_sheet_logs.ZERO_INTEGER);
            SubLObject date_string_data = dictionary.dictionary_lookup_without_values(v_dictionary, date_string, (SubLObject)fact_sheet_logs.NIL);
            if (fact_sheet_logs.NIL == date_string_data) {
                date_string_data = (SubLObject)ConsesLow.cons((SubLObject)fact_sheet_logs.ZERO_INTEGER, (SubLObject)fact_sheet_logs.ZERO_INTEGER);
                dictionary.dictionary_enter(v_dictionary, date_string, date_string_data);
            }
            final SubLObject new_data = (SubLObject)ConsesLow.cons(number_utilities.f_1X(date_string_data.first()), Numbers.add(count, date_string_data.rest()));
            dictionary.dictionary_enter(v_dictionary, date_string, new_data);
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        }
        return v_dictionary;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 15739L)
    public static SubLObject plot_fact_sheet_log_directory_query_failure_rate_by_date(final SubLObject log_directory, SubLObject top_n, SubLObject output_file, SubLObject ensure_up_to_dateP) {
        if (top_n == fact_sheet_logs.UNPROVIDED) {
            top_n = (SubLObject)fact_sheet_logs.FIVE_INTEGER;
        }
        if (output_file == fact_sheet_logs.UNPROVIDED) {
            output_file = (SubLObject)fact_sheet_logs.NIL;
        }
        if (ensure_up_to_dateP == fact_sheet_logs.UNPROVIDED) {
            ensure_up_to_dateP = (SubLObject)fact_sheet_logs.NIL;
        }
        SubLObject line_labels = (SubLObject)fact_sheet_logs.NIL;
        SubLObject all_data = (SubLObject)fact_sheet_logs.NIL;
        SubLObject line_data = (SubLObject)fact_sheet_logs.NIL;
        SubLObject top_n_queries = (SubLObject)fact_sheet_logs.NIL;
        SubLObject cdolist_list_var = fact_sheet_log_directory_query_failure_rate_by_date(log_directory, ensure_up_to_dateP);
        SubLObject cons = (SubLObject)fact_sheet_logs.NIL;
        cons = cdolist_list_var.first();
        while (fact_sheet_logs.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject date_string = (SubLObject)fact_sheet_logs.NIL;
            SubLObject failures = (SubLObject)fact_sheet_logs.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fact_sheet_logs.$list79);
            date_string = current.first();
            current = (failures = current.rest());
            all_data = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(date_string, failures), all_data);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        final SubLObject most_recent_failures = all_data.first().rest();
        final SubLObject sorted = dictionary_utilities.sort_dictionary_by_values(most_recent_failures, Symbols.symbol_function((SubLObject)fact_sheet_logs.$sym80$_));
        top_n_queries = (cdolist_list_var = list_utilities.first_n(top_n, list_utilities.alist_keys(sorted)));
        SubLObject top_query = (SubLObject)fact_sheet_logs.NIL;
        top_query = cdolist_list_var.first();
        while (fact_sheet_logs.NIL != cdolist_list_var) {
            SubLObject line_datum = (SubLObject)fact_sheet_logs.NIL;
            SubLObject cdolist_list_var_$15 = all_data;
            SubLObject datum2 = (SubLObject)fact_sheet_logs.NIL;
            datum2 = cdolist_list_var_$15.first();
            while (fact_sheet_logs.NIL != cdolist_list_var_$15) {
                SubLObject current2;
                final SubLObject datum_$16 = current2 = datum2;
                SubLObject date_string2 = (SubLObject)fact_sheet_logs.NIL;
                SubLObject failures2 = (SubLObject)fact_sheet_logs.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum_$16, (SubLObject)fact_sheet_logs.$list81);
                date_string2 = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum_$16, (SubLObject)fact_sheet_logs.$list81);
                failures2 = current2.first();
                current2 = current2.rest();
                if (fact_sheet_logs.NIL == current2) {
                    final SubLObject failure_rate_for_query_on_date = dictionary.dictionary_lookup_without_values(failures2, top_query, (SubLObject)fact_sheet_logs.UNPROVIDED);
                    line_datum = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(date_string2, failure_rate_for_query_on_date), line_datum);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$16, (SubLObject)fact_sheet_logs.$list81);
                }
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                datum2 = cdolist_list_var_$15.first();
            }
            line_data = (SubLObject)ConsesLow.cons(line_datum, line_data);
            line_labels = (SubLObject)ConsesLow.cons(print_high.princ_to_string(top_query), line_labels);
            cdolist_list_var = cdolist_list_var.rest();
            top_query = cdolist_list_var.first();
        }
        plot_generation.generate_lines_graph(line_data, (SubLObject)ConsesLow.list(new SubLObject[] { fact_sheet_logs.$kw57$XDATA, fact_sheet_logs.$str58$time, fact_sheet_logs.$kw59$TIMEFMT, fact_sheet_logs.$str60$__m__d__Y_, fact_sheet_logs.$kw61$XLABEL, fact_sheet_logs.$str62$Date, fact_sheet_logs.$kw63$YLABEL, fact_sheet_logs.$str82$Failure_Rate, fact_sheet_logs.$kw65$PLOT_TITLE, Sequences.cconcatenate((SubLObject)fact_sheet_logs.$str83$Query_Failure_Rates_by_Day, new SubLObject[] { format_nil.$format_nil_percent$.getGlobalValue(), format_nil.format_nil_s_no_copy(log_directory) }), fact_sheet_logs.$kw66$LINE_LABELS, line_labels, fact_sheet_logs.$kw68$OUTPUT_FILE, output_file }));
        return output_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 17234L)
    public static SubLObject fact_sheet_log_directory_query_failure_rate_by_date(final SubLObject log_directory, SubLObject ensure_up_to_dateP) {
        if (ensure_up_to_dateP == fact_sheet_logs.UNPROVIDED) {
            ensure_up_to_dateP = (SubLObject)fact_sheet_logs.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert fact_sheet_logs.NIL != Filesys.directory_p(log_directory) : log_directory;
        final SubLObject directory_data = get_fact_sheet_log_directory_data(log_directory, ensure_up_to_dateP);
        final SubLObject v_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)fact_sheet_logs.EQUAL), (SubLObject)fact_sheet_logs.UNPROVIDED);
        final SubLObject progress_message = Sequences.cconcatenate((SubLObject)fact_sheet_logs.$str84$Analyzing_query_failure_rates_in_, new SubLObject[] { format_nil.format_nil_s_no_copy(log_directory), fact_sheet_logs.$str70$_by_date });
        assert fact_sheet_logs.NIL != Filesys.directory_p(log_directory) : log_directory;
        SubLObject directory_contents_var = Filesys.directory(log_directory, (SubLObject)fact_sheet_logs.T);
        final SubLObject progress_message_var = progress_message;
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
            if (fact_sheet_logs.NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$17 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((fact_sheet_logs.NIL != progress_message_var) ? progress_message_var : fact_sheet_logs.$str52$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)fact_sheet_logs.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)fact_sheet_logs.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)fact_sheet_logs.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)fact_sheet_logs.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = (SubLObject)fact_sheet_logs.NIL;
                    file = csome_list_var.first();
                    while (fact_sheet_logs.NIL != csome_list_var) {
                        final SubLObject file_data = dictionary.dictionary_lookup(directory_data, file_utilities.pathstring_filename(file), (SubLObject)fact_sheet_logs.NIL);
                        fact_sheet_log_file_query_failure_rate_by_date(file, v_dictionary, file_data);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)fact_sheet_logs.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)fact_sheet_logs.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
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
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$17, thread);
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        SubLObject results = (SubLObject)fact_sheet_logs.NIL;
        SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_keys(v_dictionary, (SubLObject)fact_sheet_logs.$sym56$DATESTRING_);
        SubLObject cons = (SubLObject)fact_sheet_logs.NIL;
        cons = cdolist_list_var.first();
        while (fact_sheet_logs.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject date_string = (SubLObject)fact_sheet_logs.NIL;
            SubLObject info_cons = (SubLObject)fact_sheet_logs.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)fact_sheet_logs.$list85);
            date_string = current.first();
            current = (info_cons = current.rest());
            final SubLObject dictionary_for_date = dictionary.new_dictionary((SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
            SubLObject current_$20;
            final SubLObject datum_$19 = current_$20 = info_cons;
            SubLObject total_count = (SubLObject)fact_sheet_logs.NIL;
            SubLObject query_failure_dictionary = (SubLObject)fact_sheet_logs.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$20, datum_$19, (SubLObject)fact_sheet_logs.$list86);
            total_count = current_$20.first();
            current_$20 = (query_failure_dictionary = current_$20.rest());
            if (total_count.isPositive()) {
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(query_failure_dictionary)); fact_sheet_logs.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject query = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject failure_count = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    dictionary.dictionary_enter(dictionary_for_date, query, Numbers.divide(failure_count, total_count));
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(date_string, dictionary_for_date), results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return Sequences.nreverse(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 18554L)
    public static SubLObject fact_sheet_log_file_query_failure_rate_by_date(final SubLObject log_file, SubLObject v_dictionary, SubLObject data) {
        if (v_dictionary == fact_sheet_logs.UNPROVIDED) {
            v_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)fact_sheet_logs.EQUAL), (SubLObject)fact_sheet_logs.UNPROVIDED);
        }
        if (data == fact_sheet_logs.UNPROVIDED) {
            data = get_fact_sheet_log_file_data(log_file);
        }
        SubLObject cdolist_list_var = data;
        SubLObject datum = (SubLObject)fact_sheet_logs.NIL;
        datum = cdolist_list_var.first();
        while (fact_sheet_logs.NIL != cdolist_list_var) {
            final SubLObject date_string = list_utilities.plist_lookup(datum, (SubLObject)fact_sheet_logs.$kw71$END_DATE, (SubLObject)fact_sheet_logs.UNPROVIDED);
            SubLObject date_string_entry = dictionary.dictionary_lookup_without_values(v_dictionary, date_string, (SubLObject)fact_sheet_logs.$kw87$NOT_FOUND);
            if (fact_sheet_logs.$kw87$NOT_FOUND == date_string_entry) {
                date_string_entry = (SubLObject)ConsesLow.cons((SubLObject)fact_sheet_logs.ZERO_INTEGER, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)fact_sheet_logs.EQUAL), (SubLObject)fact_sheet_logs.UNPROVIDED));
                dictionary.dictionary_enter(v_dictionary, date_string, date_string_entry);
            }
            if (fact_sheet_logs.$kw88$NORMAL == list_utilities.plist_lookup(datum, (SubLObject)fact_sheet_logs.$kw89$VERBOSITY, (SubLObject)fact_sheet_logs.UNPROVIDED)) {
                ConsesLow.rplaca(date_string_entry, Numbers.add(date_string_entry.first(), (SubLObject)fact_sheet_logs.ONE_INTEGER));
                SubLObject cdolist_list_var_$21 = list_utilities.plist_lookup(datum, (SubLObject)fact_sheet_logs.$kw91$QUERY_TIMEOUT_INFO, (SubLObject)fact_sheet_logs.NIL);
                SubLObject query_info = (SubLObject)fact_sheet_logs.NIL;
                query_info = cdolist_list_var_$21.first();
                while (fact_sheet_logs.NIL != cdolist_list_var_$21) {
                    final SubLObject query = list_utilities.plist_lookup(query_info, (SubLObject)fact_sheet_logs.$kw90$QUERY, (SubLObject)fact_sheet_logs.UNPROVIDED);
                    dictionary_utilities.dictionary_increment(date_string_entry.rest(), query, (SubLObject)fact_sheet_logs.UNPROVIDED);
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
    public static SubLObject fact_sheet_log_directory_generated_count_for_date(final SubLObject log_directory, SubLObject universal_date) {
        if (universal_date == fact_sheet_logs.UNPROVIDED) {
            universal_date = numeric_date_utilities.get_universal_date((SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject directory_data = get_fact_sheet_log_directory_data(log_directory, (SubLObject)fact_sheet_logs.UNPROVIDED);
        SubLObject total = (SubLObject)fact_sheet_logs.ZERO_INTEGER;
        assert fact_sheet_logs.NIL != Filesys.directory_p(log_directory) : log_directory;
        SubLObject directory_contents_var = Filesys.directory(log_directory, (SubLObject)fact_sheet_logs.T);
        final SubLObject progress_message_var = Sequences.cconcatenate((SubLObject)fact_sheet_logs.$str51$Counting_fact_sheets_in_, new SubLObject[] { format_nil.format_nil_s_no_copy(log_directory), fact_sheet_logs.$str92$_generated_on_, format_nil.format_nil_s_no_copy(universal_date) });
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
            if (fact_sheet_logs.NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$22 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((fact_sheet_logs.NIL != progress_message_var) ? progress_message_var : fact_sheet_logs.$str52$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)fact_sheet_logs.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)fact_sheet_logs.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)fact_sheet_logs.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)fact_sheet_logs.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = (SubLObject)fact_sheet_logs.NIL;
                    file = csome_list_var.first();
                    while (fact_sheet_logs.NIL != csome_list_var) {
                        final SubLObject file_data = dictionary.dictionary_lookup(directory_data, file_utilities.pathstring_filename(file), (SubLObject)fact_sheet_logs.NIL);
                        total = Numbers.add(total, fact_sheet_log_file_generated_count_for_date(file, universal_date, file_data));
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)fact_sheet_logs.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)fact_sheet_logs.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
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
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$22, thread);
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 20098L)
    public static SubLObject fact_sheet_log_file_generated_count_for_date(final SubLObject log_file, SubLObject universal_date, SubLObject data) {
        if (universal_date == fact_sheet_logs.UNPROVIDED) {
            universal_date = numeric_date_utilities.get_universal_date((SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
        }
        if (data == fact_sheet_logs.UNPROVIDED) {
            data = get_fact_sheet_log_file_data(log_file);
        }
        SubLObject count = (SubLObject)fact_sheet_logs.ZERO_INTEGER;
        final SubLObject datestring = numeric_date_utilities.datestring(universal_date);
        SubLObject doneP = (SubLObject)fact_sheet_logs.NIL;
        if (fact_sheet_logs.NIL == doneP) {
            SubLObject csome_list_var = data;
            SubLObject datum = (SubLObject)fact_sheet_logs.NIL;
            datum = csome_list_var.first();
            while (fact_sheet_logs.NIL == doneP && fact_sheet_logs.NIL != csome_list_var) {
                if (fact_sheet_logs.NIL == numeric_date_utilities.datestringL(list_utilities.plist_lookup(datum, (SubLObject)fact_sheet_logs.$kw71$END_DATE, (SubLObject)fact_sheet_logs.UNPROVIDED), datestring)) {
                    if (list_utilities.plist_lookup(datum, (SubLObject)fact_sheet_logs.$kw71$END_DATE, (SubLObject)fact_sheet_logs.UNPROVIDED).equal(datestring)) {
                        count = Numbers.add(count, (SubLObject)fact_sheet_logs.ONE_INTEGER);
                    }
                    else {
                        doneP = (SubLObject)fact_sheet_logs.T;
                    }
                }
                csome_list_var = csome_list_var.rest();
                datum = csome_list_var.first();
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 20617L)
    public static SubLObject fact_sheet_log_file_generated_count_old(final SubLObject log_file) {
        return Sequences.length(regular_expression_utilities.file_grep((SubLObject)fact_sheet_logs.$str93$Finished_fact_sheet, log_file, (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 20746L)
    public static SubLObject fact_sheet_log_file_generated_count_for_date_old(final SubLObject log_file, SubLObject universal_date) {
        if (universal_date == fact_sheet_logs.UNPROVIDED) {
            universal_date = numeric_date_utilities.get_universal_date((SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
        }
        return Sequences.length(regular_expression_utilities.file_grep(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(numeric_date_utilities.datestring(universal_date)), (SubLObject)fact_sheet_logs.$str94$____Finished_fact_sheet), log_file, (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 22220L)
    public static SubLObject get_fact_sheet_log_file_data(final SubLObject log_file) {
        final SubLObject cfasl_file = parse_and_save_fact_sheet_log_file_data(log_file, (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
        final SubLObject dictionary_or_alist = cfasl_utilities.cfasl_load(cfasl_file);
        return (fact_sheet_logs.NIL != dictionary.dictionary_p(dictionary_or_alist)) ? dictionary.dictionary_lookup(dictionary_or_alist, file_utilities.pathstring_filename(log_file), (SubLObject)fact_sheet_logs.NIL) : list_utilities.alist_lookup(dictionary_or_alist, file_utilities.pathstring_filename(log_file), Symbols.symbol_function((SubLObject)fact_sheet_logs.EQUAL), (SubLObject)fact_sheet_logs.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 22761L)
    public static SubLObject get_fact_sheet_log_directory_data(final SubLObject log_directory, SubLObject ensure_up_to_dateP) {
        if (ensure_up_to_dateP == fact_sheet_logs.UNPROVIDED) {
            ensure_up_to_dateP = (SubLObject)fact_sheet_logs.NIL;
        }
        if (fact_sheet_logs.NIL != ensure_up_to_dateP) {
            remove_get_fact_sheet_log_directory_data_cached(log_directory, (SubLObject)fact_sheet_logs.T);
        }
        return get_fact_sheet_log_directory_data_cached(log_directory, ensure_up_to_dateP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 23249L)
    public static SubLObject clear_get_fact_sheet_log_directory_data_cached() {
        final SubLObject cs = fact_sheet_logs.$get_fact_sheet_log_directory_data_cached_caching_state$.getGlobalValue();
        if (fact_sheet_logs.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)fact_sheet_logs.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 23249L)
    public static SubLObject remove_get_fact_sheet_log_directory_data_cached(final SubLObject log_directory, final SubLObject ensure_up_to_dateP) {
        return memoization_state.caching_state_remove_function_results_with_args(fact_sheet_logs.$get_fact_sheet_log_directory_data_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(log_directory, ensure_up_to_dateP), (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 23249L)
    public static SubLObject get_fact_sheet_log_directory_data_cached_internal(final SubLObject log_directory, final SubLObject ensure_up_to_dateP) {
        final SubLObject cfasl_file = find_or_create_fact_sheet_log_directory_data_file(log_directory, ensure_up_to_dateP);
        final SubLObject data = cfasl_utilities.cfasl_load(cfasl_file);
        assert fact_sheet_logs.NIL != dictionary.dictionary_p(data) : data;
        return data;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 23249L)
    public static SubLObject get_fact_sheet_log_directory_data_cached(final SubLObject log_directory, final SubLObject ensure_up_to_dateP) {
        SubLObject caching_state = fact_sheet_logs.$get_fact_sheet_log_directory_data_cached_caching_state$.getGlobalValue();
        if (fact_sheet_logs.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)fact_sheet_logs.$sym96$GET_FACT_SHEET_LOG_DIRECTORY_DATA_CACHED, (SubLObject)fact_sheet_logs.$sym98$_GET_FACT_SHEET_LOG_DIRECTORY_DATA_CACHED_CACHING_STATE_, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.EQUALP, (SubLObject)fact_sheet_logs.TWO_INTEGER, (SubLObject)fact_sheet_logs.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(log_directory, ensure_up_to_dateP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)fact_sheet_logs.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)fact_sheet_logs.NIL;
            collision = cdolist_list_var.first();
            while (fact_sheet_logs.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (log_directory.equalp(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (fact_sheet_logs.NIL != cached_args && fact_sheet_logs.NIL == cached_args.rest() && ensure_up_to_dateP.equalp(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_fact_sheet_log_directory_data_cached_internal(log_directory, ensure_up_to_dateP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(log_directory, ensure_up_to_dateP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 23583L)
    public static SubLObject find_or_create_fact_sheet_log_directory_data_file(final SubLObject log_directory, SubLObject ensure_up_to_dateP) {
        if (ensure_up_to_dateP == fact_sheet_logs.UNPROVIDED) {
            ensure_up_to_dateP = (SubLObject)fact_sheet_logs.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert fact_sheet_logs.NIL != Filesys.directory_p(log_directory) : log_directory;
        final SubLObject cfasl_file = fact_sheet_log_directory_parsed_data_filename(log_directory);
        if (fact_sheet_logs.NIL == file_utilities.file_existsP(cfasl_file)) {
            return parse_and_save_fact_sheet_log_directory_data(log_directory);
        }
        final SubLObject file_write_date = Filesys.file_write_date(cfasl_file);
        SubLObject directory_data = (SubLObject)((fact_sheet_logs.NIL != file_utilities.file_existsP(cfasl_file)) ? cfasl_utilities.cfasl_load(cfasl_file) : fact_sheet_logs.NIL);
        final SubLObject progress_message = (SubLObject)fact_sheet_logs.$str99$Ensuring_data_file_is_up_to_date_;
        if (fact_sheet_logs.NIL == dictionary.dictionary_p(directory_data)) {
            directory_data = dictionary_utilities.new_dictionary_from_alist(directory_data, Symbols.symbol_function((SubLObject)fact_sheet_logs.EQUAL));
            cfasl_utilities.cfasl_save_externalized(directory_data, cfasl_file);
        }
        if (fact_sheet_logs.NIL != ensure_up_to_dateP) {
            assert fact_sheet_logs.NIL != Filesys.directory_p(log_directory) : log_directory;
            SubLObject directory_contents_var = Filesys.directory(log_directory, (SubLObject)fact_sheet_logs.T);
            final SubLObject progress_message_var = progress_message;
            final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
                if (fact_sheet_logs.NIL.isFunctionSpec()) {
                    directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.UNPROVIDED);
                }
                final SubLObject list_var = directory_contents_var;
                final SubLObject _prev_bind_0_$24 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)((fact_sheet_logs.NIL != progress_message_var) ? progress_message_var : fact_sheet_logs.$str52$cdolist), thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)fact_sheet_logs.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)fact_sheet_logs.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)fact_sheet_logs.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)fact_sheet_logs.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject log_file = (SubLObject)fact_sheet_logs.NIL;
                        log_file = csome_list_var.first();
                        while (fact_sheet_logs.NIL != csome_list_var) {
                            if (fact_sheet_logs.NIL != string_utilities.ends_with(log_file, (SubLObject)fact_sheet_logs.$str100$_log, (SubLObject)fact_sheet_logs.UNPROVIDED) && file_write_date.numL(Filesys.file_write_date(log_file))) {
                                parse_and_save_fact_sheet_log_file_data(log_file, cfasl_file, directory_data);
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)fact_sheet_logs.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            log_file = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)fact_sheet_logs.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
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
                    utilities_macros.$progress_note$.rebind(_prev_bind_0_$24, thread);
                }
            }
            finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
            }
        }
        return cfasl_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 24681L)
    public static SubLObject ensure_fact_sheet_log_directories_are_up_to_date() {
        SubLObject stopP = (SubLObject)fact_sheet_logs.NIL;
        SubLObject data_files = (SubLObject)fact_sheet_logs.NIL;
        if (fact_sheet_logs.NIL == stopP) {
            SubLObject kb = (SubLObject)fact_sheet_logs.NIL;
            kb = number_utilities.f_1_(control_vars.kb_loaded());
            while (fact_sheet_logs.NIL == stopP) {
                final SubLObject directory_list = fact_sheet_log_directory_path_for_kb(kb);
                final SubLObject directory = file_utilities.cyc_home_subdirectory(directory_list);
                if (fact_sheet_logs.NIL != Filesys.directory_p(directory)) {
                    data_files = (SubLObject)ConsesLow.cons(find_or_create_fact_sheet_log_directory_data_file(directory, (SubLObject)fact_sheet_logs.T), data_files);
                }
                else {
                    stopP = (SubLObject)fact_sheet_logs.T;
                }
                kb = Numbers.add(kb, (SubLObject)fact_sheet_logs.MINUS_ONE_INTEGER);
            }
        }
        return data_files;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 25154L)
    public static SubLObject parse_and_save_fact_sheet_log_directory_data(final SubLObject log_directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert fact_sheet_logs.NIL != Filesys.directory_p(log_directory) : log_directory;
        final SubLObject cfasl_file = fact_sheet_log_directory_parsed_data_filename(log_directory);
        SubLObject directory_data = (SubLObject)((fact_sheet_logs.NIL != file_utilities.file_existsP(cfasl_file)) ? cfasl_utilities.cfasl_load(cfasl_file) : fact_sheet_logs.NIL);
        final SubLObject progress_message = Sequences.cconcatenate((SubLObject)fact_sheet_logs.$str101$Parsing_data_from_, new SubLObject[] { format_nil.format_nil_a_no_copy(log_directory), fact_sheet_logs.$str102$___ });
        if (fact_sheet_logs.NIL == dictionary.dictionary_p(directory_data)) {
            directory_data = dictionary_utilities.new_dictionary_from_alist(directory_data, Symbols.symbol_function((SubLObject)fact_sheet_logs.EQUAL));
        }
        assert fact_sheet_logs.NIL != Filesys.directory_p(log_directory) : log_directory;
        SubLObject directory_contents_var = Filesys.directory(log_directory, (SubLObject)fact_sheet_logs.T);
        final SubLObject progress_message_var = progress_message;
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
            if (fact_sheet_logs.NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$26 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((fact_sheet_logs.NIL != progress_message_var) ? progress_message_var : fact_sheet_logs.$str52$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)fact_sheet_logs.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)fact_sheet_logs.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)fact_sheet_logs.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)fact_sheet_logs.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject log_file = (SubLObject)fact_sheet_logs.NIL;
                    log_file = csome_list_var.first();
                    while (fact_sheet_logs.NIL != csome_list_var) {
                        if (fact_sheet_logs.NIL != string_utilities.ends_with(log_file, (SubLObject)fact_sheet_logs.$str100$_log, (SubLObject)fact_sheet_logs.UNPROVIDED) && fact_sheet_logs.NIL != file_utilities.file_existsP(log_file)) {
                            parse_and_save_fact_sheet_log_file_data(log_file, cfasl_file, directory_data);
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)fact_sheet_logs.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        log_file = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)fact_sheet_logs.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
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
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$26, thread);
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return cfasl_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 25904L)
    public static SubLObject parse_and_save_fact_sheet_log_file_data(final SubLObject log_file, SubLObject cfasl_file, SubLObject directory_data) {
        if (cfasl_file == fact_sheet_logs.UNPROVIDED) {
            cfasl_file = fact_sheet_log_file_parsed_data_filename(log_file);
        }
        if (directory_data == fact_sheet_logs.UNPROVIDED) {
            directory_data = (SubLObject)((fact_sheet_logs.NIL != file_utilities.file_existsP(cfasl_file)) ? cfasl_utilities.cfasl_load(cfasl_file) : fact_sheet_logs.NIL);
        }
        assert fact_sheet_logs.NIL != file_utilities.file_existsP(log_file) : log_file;
        final SubLObject local_filename = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)fact_sheet_logs.ONE_INTEGER), file_utilities.deconstruct_path(log_file));
        final SubLObject new_data = fact_sheet_log_file_parse_data(log_file);
        dictionary.dictionary_enter(directory_data, local_filename, new_data);
        cfasl_utilities.cfasl_save_externalized(directory_data, cfasl_file);
        return cfasl_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 26488L)
    public static SubLObject fact_sheet_log_file_parsed_data_filename(final SubLObject log_file) {
        final SubLObject directory = file_utilities.reconstruct_path(file_utilities.deconstruct_path(log_file), (SubLObject)fact_sheet_logs.$str104$, (SubLObject)fact_sheet_logs.UNPROVIDED);
        return fact_sheet_log_directory_parsed_data_filename(directory);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 26699L)
    public static SubLObject fact_sheet_log_directory_parsed_data_filename(final SubLObject directory) {
        return Sequences.cconcatenate(directory, (SubLObject)fact_sheet_logs.$str105$parsed_data_cfasl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 26828L)
    public static SubLObject fact_sheet_log_file_parse_data(final SubLObject log_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data = (SubLObject)fact_sheet_logs.NIL;
        SubLObject current_datum = (SubLObject)fact_sheet_logs.NIL;
        SubLObject query_timeout_info = (SubLObject)fact_sheet_logs.NIL;
        SubLObject state = (SubLObject)fact_sheet_logs.NIL;
        SubLObject stale_fact_sheet_updater_logP = (SubLObject)fact_sheet_logs.NIL;
        SubLObject file_level_verbosity = (SubLObject)fact_sheet_logs.NIL;
        final SubLObject timestamp_length = Sequences.length((SubLObject)fact_sheet_logs.$str106$MM_DD_YYYY_HH_MM_SS_);
        SubLObject stream = (SubLObject)fact_sheet_logs.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)fact_sheet_logs.NIL, thread);
                stream = compatibility.open_text(log_file, (SubLObject)fact_sheet_logs.$kw107$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)fact_sheet_logs.$str108$Unable_to_open__S, log_file);
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
                for (line = (SubLObject)fact_sheet_logs.NIL, line = file_utilities.cdolines_get_next_line(infile); fact_sheet_logs.NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                    if (fact_sheet_logs.NIL == state && fact_sheet_logs.NIL != fact_sheet_log_line_starts_withP(line, (SubLObject)fact_sheet_logs.$str109$NOTE__Starting__, timestamp_length)) {
                        current_datum = fact_sheet_log_file_parse_start_line_data(line);
                        if (fact_sheet_logs.NIL != file_level_verbosity && fact_sheet_logs.NIL == list_utilities.plist_lookup(current_datum, (SubLObject)fact_sheet_logs.$kw89$VERBOSITY, (SubLObject)fact_sheet_logs.NIL)) {
                            current_datum = conses_high.putf(current_datum, (SubLObject)fact_sheet_logs.$kw89$VERBOSITY, file_level_verbosity);
                        }
                        state = (SubLObject)fact_sheet_logs.$kw110$PARSING_DATUM;
                    }
                    else if (fact_sheet_logs.NIL == state && fact_sheet_logs.NIL != fact_sheet_log_line_starts_withP(line, (SubLObject)fact_sheet_logs.$str111$_Verbosity__, (SubLObject)fact_sheet_logs.ZERO_INTEGER)) {
                        file_level_verbosity = reader.read_from_string(line, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.NIL, Sequences.length((SubLObject)fact_sheet_logs.$str111$_Verbosity__), (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
                    }
                    else if (fact_sheet_logs.NIL == state && fact_sheet_logs.NIL != fact_sheet_log_line_starts_withP(line, (SubLObject)fact_sheet_logs.$str112$NOTE__Dequeuing_, timestamp_length)) {
                        current_datum = fact_sheet_log_file_parse_dequeue_line_data(line, timestamp_length);
                        state = (SubLObject)fact_sheet_logs.$kw113$DEQUEUED_TERM;
                    }
                    else if (state == fact_sheet_logs.$kw113$DEQUEUED_TERM && fact_sheet_logs.NIL != fact_sheet_log_line_starts_withP(line, (SubLObject)fact_sheet_logs.$str114$NOTE__Skipping_, timestamp_length)) {
                        state = (SubLObject)fact_sheet_logs.NIL;
                    }
                    else if (state == fact_sheet_logs.$kw113$DEQUEUED_TERM && fact_sheet_logs.NIL != fact_sheet_log_line_starts_withP(line, (SubLObject)fact_sheet_logs.$str115$NOTE__Updating_, timestamp_length)) {
                        if (fact_sheet_logs.NIL != file_level_verbosity && fact_sheet_logs.NIL == list_utilities.plist_lookup(current_datum, (SubLObject)fact_sheet_logs.$kw89$VERBOSITY, (SubLObject)fact_sheet_logs.NIL)) {
                            current_datum = conses_high.putf(current_datum, (SubLObject)fact_sheet_logs.$kw89$VERBOSITY, file_level_verbosity);
                        }
                        state = (SubLObject)fact_sheet_logs.$kw110$PARSING_DATUM;
                    }
                    else if (fact_sheet_logs.NIL == state && fact_sheet_logs.NIL != fact_sheet_log_line_starts_withP(line, (SubLObject)fact_sheet_logs.$str116$NOTE__Updating_all_stale_fact_she, timestamp_length)) {
                        stale_fact_sheet_updater_logP = (SubLObject)fact_sheet_logs.T;
                    }
                    else if (fact_sheet_logs.NIL == state && fact_sheet_logs.NIL != fact_sheet_log_line_starts_withP(line, (SubLObject)fact_sheet_logs.$str117$NOTE__Updating_stale_fact_sheet_f, timestamp_length)) {
                        current_datum = fact_sheet_log_file_parse_stale_start_line_data(line, timestamp_length);
                        state = (SubLObject)fact_sheet_logs.$kw110$PARSING_DATUM;
                    }
                    else if (state == fact_sheet_logs.$kw110$PARSING_DATUM && fact_sheet_logs.NIL != fact_sheet_log_line_starts_withP(line, (SubLObject)fact_sheet_logs.$str118$WARN__Hit_soft_timeout_of_, timestamp_length)) {
                        current_datum = conses_high.putf(current_datum, (SubLObject)fact_sheet_logs.$kw119$QUERY_TIMEOUTS, Numbers.add(list_utilities.plist_lookup(current_datum, (SubLObject)fact_sheet_logs.$kw119$QUERY_TIMEOUTS, (SubLObject)fact_sheet_logs.ZERO_INTEGER), (SubLObject)fact_sheet_logs.ONE_INTEGER));
                        query_timeout_info = fact_sheet_log_file_parse_new_query_timeout_line_data(line);
                        if (!fact_sheet_logs.$kw120$MINI.eql(list_utilities.plist_lookup(current_datum, (SubLObject)fact_sheet_logs.$kw89$VERBOSITY, (SubLObject)fact_sheet_logs.UNPROVIDED))) {
                            state = (SubLObject)fact_sheet_logs.$kw121$HIT_QUERY_TIMEOUT;
                        }
                    }
                    else if (state == fact_sheet_logs.$kw121$HIT_QUERY_TIMEOUT) {
                        offset = Numbers.add(timestamp_length, Sequences.length((SubLObject)fact_sheet_logs.$str122$NOTE__));
                        term_end = Sequences.position((SubLObject)Characters.CHAR_colon, line, Symbols.symbol_function((SubLObject)fact_sheet_logs.EQ), Symbols.symbol_function((SubLObject)fact_sheet_logs.IDENTITY), offset, (SubLObject)fact_sheet_logs.UNPROVIDED);
                        timed_out_query = fact_sheet_term_from_string(line, offset, term_end, (SubLObject)fact_sheet_logs.NIL);
                        if (fact_sheet_logs.NIL != cycl_grammar.cycl_denotational_term_p(timed_out_query)) {
                            query_timeout_info = conses_high.putf(query_timeout_info, (SubLObject)fact_sheet_logs.$kw90$QUERY, timed_out_query);
                        }
                        state = (SubLObject)fact_sheet_logs.$kw123$LOOKING_FOR_TIMED_OUT_QUERY_YIELD;
                    }
                    else if (state == fact_sheet_logs.$kw123$LOOKING_FOR_TIMED_OUT_QUERY_YIELD) {
                        paragraph_count = reader.read_from_string_ignoring_errors(line, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.NIL, Sequences.length((SubLObject)fact_sheet_logs.$str124$_yielded_), (SubLObject)fact_sheet_logs.UNPROVIDED);
                        if (paragraph_count.isInteger()) {
                            query_timeout_info = conses_high.putf(query_timeout_info, (SubLObject)fact_sheet_logs.$kw125$PARAGRAPH_COUNT, paragraph_count);
                        }
                        current_datum = conses_high.putf(current_datum, (SubLObject)fact_sheet_logs.$kw91$QUERY_TIMEOUT_INFO, (SubLObject)ConsesLow.cons(query_timeout_info, list_utilities.plist_lookup(current_datum, (SubLObject)fact_sheet_logs.$kw91$QUERY_TIMEOUT_INFO, (SubLObject)fact_sheet_logs.NIL)));
                        state = (SubLObject)fact_sheet_logs.$kw110$PARSING_DATUM;
                    }
                    else if (fact_sheet_logs.NIL != fact_sheet_log_line_starts_withP(line, (SubLObject)fact_sheet_logs.$str126$WARN__Launching_make_up_updater, timestamp_length)) {
                        Errors.warn((SubLObject)fact_sheet_logs.$str127$We_appear_to_have_aborted_the_fac, list_utilities.plist_lookup(current_datum, (SubLObject)fact_sheet_logs.$kw128$TERM, (SubLObject)fact_sheet_logs.UNPROVIDED), log_file);
                        state = (SubLObject)fact_sheet_logs.NIL;
                    }
                    else if (state == fact_sheet_logs.$kw110$PARSING_DATUM && fact_sheet_logs.NIL != fact_sheet_log_line_starts_withP(line, (SubLObject)fact_sheet_logs.$str129$NOTE__Added_, timestamp_length)) {
                        current_datum = update_current_datum_for_misc_sentence_stats(current_datum, line, timestamp_length);
                    }
                    else if (state == fact_sheet_logs.$kw110$PARSING_DATUM && fact_sheet_logs.NIL != fact_sheet_log_line_starts_withP(line, (SubLObject)fact_sheet_logs.$str130$NOTE__Gathered_, timestamp_length)) {
                        current_datum = update_current_datum_for_info_gather_stats(current_datum, line, timestamp_length);
                    }
                    else if (state == fact_sheet_logs.$kw110$PARSING_DATUM && fact_sheet_logs.NIL != string_utilities.starts_with(line, (SubLObject)fact_sheet_logs.$str131$_implies_)) {
                        current_datum = conses_high.putf(current_datum, (SubLObject)fact_sheet_logs.$kw132$FILTERED_REDUNDANT_FACT_COUNT, Numbers.add(list_utilities.plist_lookup(current_datum, (SubLObject)fact_sheet_logs.$kw132$FILTERED_REDUNDANT_FACT_COUNT, (SubLObject)fact_sheet_logs.ZERO_INTEGER), (SubLObject)fact_sheet_logs.ONE_INTEGER));
                    }
                    else if (state == fact_sheet_logs.$kw110$PARSING_DATUM && fact_sheet_logs.NIL != fact_sheet_log_line_starts_withP(line, (SubLObject)fact_sheet_logs.$str133$NOTE__Generated_, timestamp_length)) {
                        current_datum = update_current_datum_for_pph_stats(current_datum, line, timestamp_length);
                        if (fact_sheet_logs.NIL != stale_fact_sheet_updater_logP) {
                            add_end_date_and_time_to_datum(current_datum, line);
                            add_total_time_to_datum(current_datum, (SubLObject)fact_sheet_logs.UNPROVIDED);
                            data = (SubLObject)ConsesLow.cons(current_datum, data);
                            state = (SubLObject)fact_sheet_logs.NIL;
                        }
                    }
                    else if (state == fact_sheet_logs.$kw110$PARSING_DATUM && fact_sheet_logs.NIL != fact_sheet_log_line_starts_withP(line, (SubLObject)fact_sheet_logs.$str134$WARN__Failed_to_paraphrase_, timestamp_length)) {
                        current_datum = update_current_datum_for_pph_failure_stats(current_datum, line, timestamp_length);
                    }
                    else if (fact_sheet_logs.NIL != fact_sheet_log_line_starts_withP(line, (SubLObject)fact_sheet_logs.$str135$WARN__Query_failed_to_get_mini_fa, timestamp_length)) {
                        state = (SubLObject)fact_sheet_logs.NIL;
                    }
                    else if (fact_sheet_logs.NIL != fact_sheet_log_line_starts_withP(line, (SubLObject)fact_sheet_logs.$str136$NOTE__Query_got_mini_fact_sheet_o, timestamp_length)) {
                        add_end_date_and_time_to_datum(current_datum, line);
                        add_total_time_to_datum(current_datum, (SubLObject)fact_sheet_logs.UNPROVIDED);
                        data = (SubLObject)ConsesLow.cons(current_datum, data);
                        state = (SubLObject)fact_sheet_logs.NIL;
                    }
                    else if (fact_sheet_logs.NIL != fact_sheet_log_line_starts_withP(line, (SubLObject)fact_sheet_logs.$str137$NOTE__Finished_fact_sheet_for_, timestamp_length)) {
                        if (state == fact_sheet_logs.$kw110$PARSING_DATUM) {
                            current_datum = finalize_current_datum(current_datum, line, timestamp_length);
                            data = (SubLObject)ConsesLow.cons(current_datum, data);
                        }
                        else {
                            finished_term = term_from_fact_sheet_log_finish_line(line, timestamp_length);
                            current_term = conses_high.getf(current_datum, (SubLObject)fact_sheet_logs.$kw128$TERM, (SubLObject)fact_sheet_logs.UNPROVIDED);
                            if (!finished_term.equal(current_term)) {
                                Errors.sublisp_break((SubLObject)fact_sheet_logs.$str138$Found_finish_line__but_state_is__, new SubLObject[] { state, current_datum, line, log_file });
                            }
                            current_datum = (SubLObject)fact_sheet_logs.NIL;
                        }
                        state = (SubLObject)fact_sheet_logs.NIL;
                    }
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)fact_sheet_logs.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)fact_sheet_logs.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (fact_sheet_logs.NIL != state) {
            Errors.warn((SubLObject)fact_sheet_logs.$str139$We_appear_to_have_aborted_the_fac, list_utilities.plist_lookup(current_datum, (SubLObject)fact_sheet_logs.$kw128$TERM, (SubLObject)fact_sheet_logs.UNPROVIDED), log_file);
        }
        return Sequences.nreverse(data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 33351L)
    public static SubLObject fact_sheet_log_line_starts_withP(final SubLObject line, final SubLObject string, final SubLObject timestamp_length) {
        final SubLObject end_pos = Numbers.add(timestamp_length, Sequences.length(string));
        return (SubLObject)SubLObjectFactory.makeBoolean(fact_sheet_logs.NIL != list_utilities.lengthG(line, end_pos, (SubLObject)fact_sheet_logs.UNPROVIDED) && string_utilities.substring(line, timestamp_length, end_pos).equal(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 33605L)
    public static SubLObject fact_sheet_log_file_parse_start_line_data(final SubLObject line) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_datum = (SubLObject)fact_sheet_logs.NIL;
        thread.resetMultipleValues();
        final SubLObject verbosity = reader.read_from_string(line, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.$int140$35, (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
        final SubLObject i = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject term_start = Numbers.add(i, Sequences.length((SubLObject)fact_sheet_logs.$str141$update_on_));
        final SubLObject term_end = Sequences.search((SubLObject)fact_sheet_logs.$str142$__Status, line, Symbols.symbol_function((SubLObject)fact_sheet_logs.EQUAL), Symbols.symbol_function((SubLObject)fact_sheet_logs.IDENTITY), (SubLObject)fact_sheet_logs.ZERO_INTEGER, (SubLObject)fact_sheet_logs.NIL, term_start, (SubLObject)fact_sheet_logs.UNPROVIDED);
        final SubLObject v_term = fact_sheet_term_from_string(line, term_start, term_end, (SubLObject)fact_sheet_logs.UNPROVIDED);
        final SubLObject status = reader.read_from_string(line, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.NIL, Numbers.add(term_end, Sequences.length((SubLObject)fact_sheet_logs.$str143$__Status__)), (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
        current_datum = (SubLObject)ConsesLow.list(new SubLObject[] { fact_sheet_logs.$kw89$VERBOSITY, verbosity, fact_sheet_logs.$kw128$TERM, v_term, fact_sheet_logs.$kw144$STATUS, status, fact_sheet_logs.$kw145$START_DATE, string_utilities.substring(line, (SubLObject)fact_sheet_logs.ZERO_INTEGER, (SubLObject)fact_sheet_logs.TEN_INTEGER), fact_sheet_logs.$kw146$START_TIME, string_utilities.substring(line, (SubLObject)fact_sheet_logs.ELEVEN_INTEGER, (SubLObject)fact_sheet_logs.NINETEEN_INTEGER) });
        return current_datum;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 34278L)
    public static SubLObject fact_sheet_log_file_parse_stale_start_line_data(final SubLObject line, final SubLObject timestamp_length) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_datum = (SubLObject)fact_sheet_logs.NIL;
        thread.resetMultipleValues();
        final SubLObject v_term = fact_sheet_term_from_string(line, Numbers.add(timestamp_length, Sequences.length((SubLObject)fact_sheet_logs.$str117$NOTE__Updating_stale_fact_sheet_f)), (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
        final SubLObject term_end = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (fact_sheet_logs.NIL != cycl_grammar.cycl_denotational_term_p(v_term)) {
            final SubLObject verbosity = reader.read_from_string(line, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.NIL, term_end, (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
            final SubLObject status = (SubLObject)fact_sheet_logs.$kw147$STALE;
            current_datum = (SubLObject)ConsesLow.list(new SubLObject[] { fact_sheet_logs.$kw89$VERBOSITY, verbosity, fact_sheet_logs.$kw128$TERM, v_term, fact_sheet_logs.$kw144$STATUS, status, fact_sheet_logs.$kw145$START_DATE, string_utilities.substring(line, (SubLObject)fact_sheet_logs.ZERO_INTEGER, (SubLObject)fact_sheet_logs.TEN_INTEGER), fact_sheet_logs.$kw146$START_TIME, string_utilities.substring(line, (SubLObject)fact_sheet_logs.ELEVEN_INTEGER, (SubLObject)fact_sheet_logs.NINETEEN_INTEGER) });
        }
        return current_datum;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 34902L)
    public static SubLObject fact_sheet_log_file_parse_dequeue_line_data(final SubLObject line, final SubLObject timestamp_length) {
        SubLObject current_datum = (SubLObject)fact_sheet_logs.NIL;
        final SubLObject term_start = Numbers.add(timestamp_length, Sequences.length((SubLObject)fact_sheet_logs.$str112$NOTE__Dequeuing_));
        final SubLObject term_end = constant_reader.constant_reader_prefix().equal(string_utilities.substring(line, term_start, Numbers.add(term_start, (SubLObject)fact_sheet_logs.TWO_INTEGER))) ? Sequences.position((SubLObject)Characters.CHAR_period, line, Symbols.symbol_function((SubLObject)fact_sheet_logs.EQL), Symbols.symbol_function((SubLObject)fact_sheet_logs.IDENTITY), term_start, (SubLObject)fact_sheet_logs.UNPROVIDED) : nart_end_from_string(line, term_start);
        final SubLObject v_term = fact_sheet_term_from_string(line, term_start, term_end, (SubLObject)fact_sheet_logs.UNPROVIDED);
        final SubLObject status_start = Numbers.add(term_end, Sequences.length((SubLObject)fact_sheet_logs.$str143$__Status__));
        final SubLObject status_end = Sequences.position((SubLObject)Characters.CHAR_period, line, Symbols.symbol_function((SubLObject)fact_sheet_logs.EQL), Symbols.symbol_function((SubLObject)fact_sheet_logs.IDENTITY), status_start, (SubLObject)fact_sheet_logs.UNPROVIDED);
        final SubLObject status = Symbols.make_keyword(Strings.string_upcase(string_utilities.substring(line, status_start, status_end), (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED));
        current_datum = (SubLObject)ConsesLow.list((SubLObject)fact_sheet_logs.$kw128$TERM, v_term, (SubLObject)fact_sheet_logs.$kw144$STATUS, status, (SubLObject)fact_sheet_logs.$kw145$START_DATE, string_utilities.substring(line, (SubLObject)fact_sheet_logs.ZERO_INTEGER, (SubLObject)fact_sheet_logs.TEN_INTEGER), (SubLObject)fact_sheet_logs.$kw146$START_TIME, string_utilities.substring(line, (SubLObject)fact_sheet_logs.ELEVEN_INTEGER, (SubLObject)fact_sheet_logs.NINETEEN_INTEGER));
        return current_datum;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 35711L)
    public static SubLObject fact_sheet_log_file_parse_new_query_timeout_line_data(final SubLObject line) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_timeout_info = (SubLObject)fact_sheet_logs.NIL;
        thread.resetMultipleValues();
        final SubLObject timeout_time = reader.read_from_string(line, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.$int148$46, (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
        final SubLObject i = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (timeout_time.isInteger()) {
            query_timeout_info = conses_high.putf(query_timeout_info, (SubLObject)fact_sheet_logs.$kw149$TIMEOUT_TIME, timeout_time);
            final SubLObject query_result_count = reader.read_from_string(line, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.NIL, Numbers.add(i, Sequences.length((SubLObject)fact_sheet_logs.$str150$seconds_after_getting)), (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
            query_timeout_info = conses_high.putf(query_timeout_info, (SubLObject)fact_sheet_logs.$kw151$RESULT_COUNT, query_result_count);
        }
        return query_timeout_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 36206L)
    public static SubLObject update_current_datum_for_misc_sentence_stats(SubLObject current_datum, final SubLObject line, final SubLObject timestamp_length) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence_count = reader.read_from_string(line, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.NIL, Numbers.add(timestamp_length, Sequences.length((SubLObject)fact_sheet_logs.$str129$NOTE__Added_)), (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
        final SubLObject i = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (sentence_count.isInteger()) {
            current_datum = conses_high.putf(current_datum, (SubLObject)fact_sheet_logs.$kw78$MISC_SENTENCE_COUNT, sentence_count);
            final SubLObject time = reader.read_from_string(line, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.NIL, Numbers.add(i, Sequences.length((SubLObject)fact_sheet_logs.$str152$THCL_sentences_in)), (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
            if (time.isNumber()) {
                current_datum = conses_high.putf(current_datum, (SubLObject)fact_sheet_logs.$kw153$MISC_SENTENCE_TIME, time);
            }
        }
        return current_datum;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 36733L)
    public static SubLObject update_current_datum_for_pph_stats(SubLObject current_datum, final SubLObject line, final SubLObject timestamp_length) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject pph_paragraph_count = reader.read_from_string(line, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.NIL, Numbers.add(timestamp_length, Sequences.length((SubLObject)fact_sheet_logs.$str133$NOTE__Generated_)), (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
        final SubLObject i = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (pph_paragraph_count.isInteger()) {
            current_datum = conses_high.putf(current_datum, (SubLObject)fact_sheet_logs.$kw154$PPH_PARAGRAPH_COUNT, pph_paragraph_count);
            thread.resetMultipleValues();
            final SubLObject pph_sentence_count = reader.read_from_string(line, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.NIL, Numbers.add(i, Sequences.length((SubLObject)fact_sheet_logs.$str155$paragraphs_containing_)), (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
            final SubLObject i_$28 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (pph_sentence_count.isInteger()) {
                current_datum = conses_high.putf(current_datum, (SubLObject)fact_sheet_logs.$kw76$PPH_SENTENCE_COUNT, pph_sentence_count);
                final SubLObject offset = Numbers.add(i_$28, Sequences.length((SubLObject)fact_sheet_logs.$str156$sentences_for_));
                thread.resetMultipleValues();
                final SubLObject v_term = fact_sheet_term_from_string(line, offset, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.UNPROVIDED);
                final SubLObject term_end = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (fact_sheet_logs.NIL != cycl_grammar.cycl_denotational_term_p(v_term)) {
                    if (!v_term.equal(list_utilities.plist_lookup(current_datum, (SubLObject)fact_sheet_logs.$kw128$TERM, (SubLObject)fact_sheet_logs.UNPROVIDED))) {
                        Errors.sublisp_break((SubLObject)fact_sheet_logs.$str157$Must_have_missed_the__Finished__l, new SubLObject[] { list_utilities.plist_lookup(current_datum, (SubLObject)fact_sheet_logs.$kw128$TERM, (SubLObject)fact_sheet_logs.UNPROVIDED) });
                    }
                    final SubLObject time = reader.read_from_string(line, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.NIL, Numbers.add(term_end, Sequences.length((SubLObject)fact_sheet_logs.$str158$_in_)), (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
                    if (time.isNumber()) {
                        current_datum = conses_high.putf(current_datum, (SubLObject)fact_sheet_logs.$kw159$PPH_TIME, time);
                    }
                }
            }
        }
        return current_datum;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 37840L)
    public static SubLObject update_current_datum_for_pph_failure_stats(SubLObject current_datum, final SubLObject line, final SubLObject timestamp_length) {
        final SubLObject start_char = Numbers.add(timestamp_length, Sequences.length((SubLObject)fact_sheet_logs.$str134$WARN__Failed_to_paraphrase_));
        final SubLObject sentence_count = reader.read_from_string(line, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.NIL, start_char, (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
        if (sentence_count.isInteger()) {
            current_datum = conses_high.putf(current_datum, (SubLObject)fact_sheet_logs.$kw160$PPH_FAILURE_COUNT, Numbers.add(list_utilities.plist_lookup(current_datum, (SubLObject)fact_sheet_logs.$kw160$PPH_FAILURE_COUNT, (SubLObject)fact_sheet_logs.ZERO_INTEGER), sentence_count));
        }
        return current_datum;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 38231L)
    public static SubLObject update_current_datum_for_info_gather_stats(SubLObject current_datum, final SubLObject line, final SubLObject timestamp_length) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject category_count = reader.read_from_string(line, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.NIL, Numbers.add(timestamp_length, Sequences.length((SubLObject)fact_sheet_logs.$str130$NOTE__Gathered_)), (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
        final SubLObject i = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (category_count.isInteger()) {
            current_datum = conses_high.putf(current_datum, (SubLObject)fact_sheet_logs.$kw74$CATEGORY_COUNT, category_count);
            final SubLObject offset = Numbers.add(i, Sequences.length((SubLObject)fact_sheet_logs.$str161$groups_of_sentences_for_));
            thread.resetMultipleValues();
            final SubLObject v_term = fact_sheet_term_from_string(line, offset, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.UNPROVIDED);
            final SubLObject term_end = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (fact_sheet_logs.NIL != cycl_grammar.cycl_denotational_term_p(v_term)) {
                if (!v_term.equal(list_utilities.plist_lookup(current_datum, (SubLObject)fact_sheet_logs.$kw128$TERM, (SubLObject)fact_sheet_logs.UNPROVIDED))) {
                    Errors.sublisp_break((SubLObject)fact_sheet_logs.$str157$Must_have_missed_the__Finished__l, new SubLObject[] { list_utilities.plist_lookup(current_datum, (SubLObject)fact_sheet_logs.$kw128$TERM, (SubLObject)fact_sheet_logs.UNPROVIDED) });
                }
                final SubLObject time = reader.read_from_string(line, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.NIL, Numbers.add(term_end, Sequences.length((SubLObject)fact_sheet_logs.$str158$_in_)), (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
                if (time.isNumber()) {
                    current_datum = conses_high.putf(current_datum, (SubLObject)fact_sheet_logs.$kw162$INFO_GATHERING_TIME, time);
                }
            }
        }
        return current_datum;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 39119L)
    public static SubLObject finalize_current_datum(final SubLObject current_datum, final SubLObject line, final SubLObject timestamp_length) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_term = term_from_fact_sheet_log_finish_line(line, timestamp_length);
        final SubLObject term_end = thread.secondMultipleValue();
        thread.resetMultipleValues();
        add_end_date_and_time_to_datum(current_datum, line);
        if (fact_sheet_logs.NIL != cycl_grammar.cycl_denotational_term_p(v_term) && !v_term.equal(list_utilities.plist_lookup(current_datum, (SubLObject)fact_sheet_logs.$kw128$TERM, (SubLObject)fact_sheet_logs.UNPROVIDED))) {
            Errors.sublisp_break((SubLObject)fact_sheet_logs.$str157$Must_have_missed_the__Finished__l, new SubLObject[] { list_utilities.plist_lookup(current_datum, (SubLObject)fact_sheet_logs.$kw128$TERM, (SubLObject)fact_sheet_logs.UNPROVIDED) });
        }
        if (term_end.isInteger()) {
            final SubLObject time = reader.read_from_string(line, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.NIL, Numbers.add(term_end, Sequences.length((SubLObject)fact_sheet_logs.$str158$_in_)), (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
            add_total_time_to_datum(current_datum, time);
        }
        return current_datum;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 39751L)
    public static SubLObject compute_total_time_from_start_and_end(final SubLObject current_datum) {
        SubLObject total_time = (SubLObject)fact_sheet_logs.NIL;
        final SubLObject start_time_tail = cdestructuring_bind.property_list_member((SubLObject)fact_sheet_logs.$kw146$START_TIME, current_datum);
        final SubLObject start_time = (SubLObject)((fact_sheet_logs.NIL != start_time_tail) ? conses_high.cadr(start_time_tail) : fact_sheet_logs.NIL);
        final SubLObject start_date_tail = cdestructuring_bind.property_list_member((SubLObject)fact_sheet_logs.$kw145$START_DATE, current_datum);
        final SubLObject start_date = (SubLObject)((fact_sheet_logs.NIL != start_date_tail) ? conses_high.cadr(start_date_tail) : fact_sheet_logs.NIL);
        final SubLObject end_time_tail = cdestructuring_bind.property_list_member((SubLObject)fact_sheet_logs.$kw163$END_TIME, current_datum);
        final SubLObject end_time = (SubLObject)((fact_sheet_logs.NIL != end_time_tail) ? conses_high.cadr(end_time_tail) : fact_sheet_logs.NIL);
        final SubLObject end_date_tail = cdestructuring_bind.property_list_member((SubLObject)fact_sheet_logs.$kw71$END_DATE, current_datum);
        final SubLObject end_date = (SubLObject)((fact_sheet_logs.NIL != end_date_tail) ? conses_high.cadr(end_date_tail) : fact_sheet_logs.NIL);
        if (start_time.isString() && start_date.isString() && end_time.isString() && end_date.isString()) {
            total_time = Numbers.add(numeric_date_utilities.secondstring_(end_time, start_time), numeric_date_utilities.datestring_(end_date, start_date));
        }
        return total_time;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 40210L)
    public static SubLObject term_from_fact_sheet_log_finish_line(final SubLObject line, final SubLObject timestamp_length) {
        final SubLObject offset = Numbers.add(timestamp_length, Sequences.length((SubLObject)fact_sheet_logs.$str137$NOTE__Finished_fact_sheet_for_));
        return fact_sheet_term_from_string(line, offset, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 40428L)
    public static SubLObject add_total_time_to_datum(SubLObject current_datum, SubLObject time) {
        if (time == fact_sheet_logs.UNPROVIDED) {
            time = (SubLObject)fact_sheet_logs.NIL;
        }
        if (!time.isNumber()) {
            time = compute_total_time_from_start_and_end(current_datum);
        }
        if (time.isNumber()) {
            current_datum = conses_high.putf(current_datum, (SubLObject)fact_sheet_logs.$kw54$TOTAL_TIME, time);
        }
        return current_datum;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 40695L)
    public static SubLObject add_end_date_and_time_to_datum(SubLObject current_datum, final SubLObject line) {
        current_datum = conses_high.putf(current_datum, (SubLObject)fact_sheet_logs.$kw71$END_DATE, string_utilities.substring(line, (SubLObject)fact_sheet_logs.ZERO_INTEGER, (SubLObject)fact_sheet_logs.TEN_INTEGER));
        current_datum = conses_high.putf(current_datum, (SubLObject)fact_sheet_logs.$kw163$END_TIME, string_utilities.substring(line, (SubLObject)fact_sheet_logs.ELEVEN_INTEGER, (SubLObject)fact_sheet_logs.NINETEEN_INTEGER));
        return current_datum;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 40912L)
    public static SubLObject fact_sheet_term_from_string(final SubLObject string, SubLObject term_start, SubLObject term_end, SubLObject warn_on_failureP) {
        if (term_start == fact_sheet_logs.UNPROVIDED) {
            term_start = (SubLObject)fact_sheet_logs.ZERO_INTEGER;
        }
        if (term_end == fact_sheet_logs.UNPROVIDED) {
            term_end = (SubLObject)fact_sheet_logs.NIL;
        }
        if (warn_on_failureP == fact_sheet_logs.UNPROVIDED) {
            warn_on_failureP = (SubLObject)fact_sheet_logs.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_term = (SubLObject)fact_sheet_logs.NIL;
        if (constant_reader.constant_reader_prefix().equal(string_utilities.substring(string, term_start, Numbers.add(term_start, (SubLObject)fact_sheet_logs.TWO_INTEGER)))) {
            thread.resetMultipleValues();
            final SubLObject value1 = reader.read_from_string_ignoring_errors(string, (SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.NIL, term_start, term_end);
            final SubLObject value2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (fact_sheet_logs.NIL != forts.fort_p(value1)) {
                v_term = value1;
                term_end = value2;
            }
        }
        else if (fact_sheet_logs.$str164$___.equal(string_utilities.substring(string, term_start, Numbers.add(term_start, (SubLObject)fact_sheet_logs.THREE_INTEGER)))) {
            final SubLObject unstripped = string_utilities.substring(string, term_start, term_end);
            final SubLObject stripped = string_utilities.remove_substring(Sequences.remove((SubLObject)Characters.CHAR_greater, unstripped, (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED), (SubLObject)fact_sheet_logs.$str165$__);
            final SubLObject possibly_naut = reader.read_from_string_ignoring_errors(stripped, (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
            v_term = (SubLObject)((fact_sheet_logs.NIL != possibly_naut) ? possibly_naut : fact_sheet_logs.NIL);
            if (fact_sheet_logs.NIL != v_term) {
                term_end = nart_end_from_string(string, term_start);
            }
        }
        if (fact_sheet_logs.NIL != warn_on_failureP && fact_sheet_logs.NIL == cycl_grammar.cycl_denotational_term_p(v_term)) {
            Errors.warn((SubLObject)fact_sheet_logs.$str166$Couldn_t_determine_term_from__S, string_utilities.substring(string, term_start, term_end));
        }
        return Values.values(v_term, term_end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 41946L)
    public static SubLObject nart_end_from_string(final SubLObject string, final SubLObject term_start) {
        SubLObject term_end = (SubLObject)fact_sheet_logs.NIL;
        SubLObject bracket_count = (SubLObject)fact_sheet_logs.ZERO_INTEGER;
        final SubLObject doneP = (SubLObject)fact_sheet_logs.NIL;
        final SubLObject end_var = Sequences.length(string);
        if (fact_sheet_logs.NIL == doneP) {
            SubLObject end_var_$29;
            SubLObject char_num;
            SubLObject pcase_var;
            SubLObject v_char;
            for (end_var_$29 = end_var, char_num = (SubLObject)fact_sheet_logs.NIL, char_num = term_start; fact_sheet_logs.NIL == doneP && !char_num.numGE(end_var_$29); char_num = number_utilities.f_1X(char_num)) {
                v_char = (pcase_var = Strings.sublisp_char(string, char_num));
                if (pcase_var.eql((SubLObject)Characters.CHAR_less)) {
                    bracket_count = Numbers.add(bracket_count, (SubLObject)fact_sheet_logs.ONE_INTEGER);
                }
                else if (pcase_var.eql((SubLObject)Characters.CHAR_greater)) {
                    bracket_count = Numbers.subtract(bracket_count, (SubLObject)fact_sheet_logs.ONE_INTEGER);
                    if (bracket_count.isZero()) {
                        term_end = number_utilities.f_1X(char_num);
                    }
                }
            }
        }
        return term_end;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 42512L)
    public static SubLObject open_new_unique_fact_sheet_log_file() {
        final SubLObject directory_list = fact_sheet_log_directory_path_for_kb(control_vars.kb_loaded());
        final SubLObject directory = physical_directory_from_path(directory_list);
        final SubLObject image_id_string = Strings.string_downcase(control_vars.cyc_image_id(), (SubLObject)fact_sheet_logs.UNPROVIDED, (SubLObject)fact_sheet_logs.UNPROVIDED);
        final SubLObject uniquifier = (SubLObject)fact_sheet_logs.ZERO_INTEGER;
        final SubLObject filename_base = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(image_id_string), new SubLObject[] { fact_sheet_logs.$str168$_, format_nil.format_nil_d_no_copy(uniquifier) });
        SubLObject filename = Sequences.cconcatenate(directory, new SubLObject[] { filename_base, fact_sheet_logs.$str100$_log });
        if (fact_sheet_logs.NIL == Filesys.directory_p(directory)) {
            file_utilities.make_directory_recursive(directory, (SubLObject)fact_sheet_logs.NIL, (SubLObject)((fact_sheet_logs.NIL != fact_sheets.chmod_safe_to_useP()) ? fact_sheet_logs.$str169$0775 : fact_sheet_logs.NIL));
        }
        SubLObject release = (SubLObject)fact_sheet_logs.NIL;
        try {
            release = Locks.seize_lock(fact_sheet_logs.$fact_sheet_log_file_uniquifier_lock$.getGlobalValue());
            filename = uniquify_fact_sheet_log_filename(directory, filename, image_id_string);
        }
        finally {
            if (fact_sheet_logs.NIL != release) {
                Locks.release_lock(fact_sheet_logs.$fact_sheet_log_file_uniquifier_lock$.getGlobalValue());
            }
        }
        return Values.values(directory, filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 43221L)
    public static SubLObject fact_sheet_log_directory_path_for_kb(SubLObject kb) {
        if (kb == fact_sheet_logs.UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        return ConsesLow.append(fact_sheets.fact_sheet_data_path(), (SubLObject)ConsesLow.list((SubLObject)fact_sheet_logs.$str170$logs, PrintLow.format((SubLObject)fact_sheet_logs.NIL, (SubLObject)fact_sheet_logs.$str171$_5__0D, kb)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 43384L)
    public static SubLObject uniquify_fact_sheet_log_filename(final SubLObject parent_directory, SubLObject filename, final SubLObject image_id_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject uniquifier = (SubLObject)fact_sheet_logs.ZERO_INTEGER;
        for (SubLObject filename_base = (SubLObject)fact_sheet_logs.NIL; fact_sheet_logs.NIL != file_utilities.file_existsP(filename); filename = Sequences.cconcatenate(parent_directory, new SubLObject[] { filename_base, fact_sheet_logs.$str100$_log })) {
            uniquifier = Numbers.add(uniquifier, (SubLObject)fact_sheet_logs.ONE_INTEGER);
            filename_base = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(image_id_string), new SubLObject[] { fact_sheet_logs.$str168$_, format_nil.format_nil_d_no_copy(uniquifier) });
        }
        final SubLObject _prev_bind_0 = fact_sheet_logs.$fact_sheet_log_file$.currentBinding(thread);
        try {
            fact_sheet_logs.$fact_sheet_log_file$.bind(filename, thread);
            SubLObject stream = (SubLObject)fact_sheet_logs.NIL;
            try {
                final SubLObject _prev_bind_0_$30 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)fact_sheet_logs.NIL, thread);
                    stream = compatibility.open_text(fact_sheet_logs.$fact_sheet_log_file$.getDynamicValue(thread), (SubLObject)fact_sheet_logs.$kw172$APPEND);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$30, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)fact_sheet_logs.$str108$Unable_to_open__S, fact_sheet_logs.$fact_sheet_log_file$.getDynamicValue(thread));
                }
                final SubLObject _prev_bind_0_$31 = fact_sheet_logs.$fact_sheet_log_stream$.currentBinding(thread);
                try {
                    fact_sheet_logs.$fact_sheet_log_stream$.bind(stream, thread);
                    final SubLObject stream_$32 = fact_sheet_log_stream();
                    if ((fact_sheet_logs.T == stream_$32 && Threads.current_process().eql(subl_promotions.initial_process())) || (stream_$32.isStream() && fact_sheet_logs.NIL != streams_high.output_stream_p(stream_$32))) {
                        print_fact_sheet_log_header((SubLObject)fact_sheet_logs.$str20$NOTE, stream_$32);
                        PrintLow.format(stream_$32, (SubLObject)fact_sheet_logs.$str173$Opening_log_);
                        streams_high.force_output(stream_$32);
                    }
                }
                finally {
                    fact_sheet_logs.$fact_sheet_log_stream$.rebind(_prev_bind_0_$31, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)fact_sheet_logs.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)fact_sheet_logs.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                }
            }
        }
        finally {
            fact_sheet_logs.$fact_sheet_log_file$.rebind(_prev_bind_0, thread);
        }
        if (fact_sheet_logs.NIL != fact_sheets.chmod_safe_to_useP()) {
            file_utilities.chmod(filename, (SubLObject)fact_sheet_logs.$str174$755);
        }
        return filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fact-sheet-logs.lisp", position = 43899L)
    public static SubLObject physical_directory_from_path(final SubLObject path) {
        assert fact_sheet_logs.NIL != string_utilities.list_of_string_p(path) : path;
        return Sequences.cconcatenate(string_utilities.bunge(path, (SubLObject)Characters.CHAR_slash), (SubLObject)fact_sheet_logs.$str176$_);
    }
    
    public static SubLObject declare_fact_sheet_logs_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_stream", "FACT-SHEET-LOG-STREAM", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.fact_sheet_logs", "with_quiet_fact_sheet_logging", "WITH-QUIET-FACT-SHEET-LOGGING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.fact_sheet_logs", "log_fact_sheet_message", "LOG-FACT-SHEET-MESSAGE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "print_fact_sheet_log_header", "PRINT-FACT-SHEET-LOG-HEADER", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.fact_sheet_logs", "log_fact_sheet_warning", "LOG-FACT-SHEET-WARNING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.fact_sheet_logs", "log_fact_sheet_note", "LOG-FACT-SHEET-NOTE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.fact_sheet_logs", "with_fact_sheet_log_file", "WITH-FACT-SHEET-LOG-FILE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.fact_sheet_logs", "with_fact_sheet_logging", "WITH-FACT-SHEET-LOGGING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "note_fact_sheet_log_file_closed", "NOTE-FACT-SHEET-LOG-FILE-CLOSED", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_file_closed_p", "FACT-SHEET-LOG-FILE-CLOSED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "hourly_fact_sheet_stats", "HOURLY-FACT-SHEET-STATS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.fact_sheet_logs", "with_fact_sheet_logging_and_hourly_reporting", "WITH-FACT-SHEET-LOGGING-AND-HOURLY-REPORTING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_hourly_reporting_onP", "FACT-SHEET-HOURLY-REPORTING-ON?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "reset_hourly_report_time", "RESET-HOURLY-REPORT-TIME", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "clear_hourly_fact_sheet_stats", "CLEAR-HOURLY-FACT-SHEET-STATS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "add_fact_sheet_info_to_hourly_stats", "ADD-FACT-SHEET-INFO-TO-HOURLY-STATS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "get_hourly_fact_sheet_update_count", "GET-HOURLY-FACT-SHEET-UPDATE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "clear_hourly_fact_sheet_update_count", "CLEAR-HOURLY-FACT-SHEET-UPDATE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "note_fact_sheet_query_timeout_in_hourly_stats", "NOTE-FACT-SHEET-QUERY-TIMEOUT-IN-HOURLY-STATS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "get_hourly_fact_sheet_query_timeout_count", "GET-HOURLY-FACT-SHEET-QUERY-TIMEOUT-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "clear_hourly_fact_sheet_query_timeout_count", "CLEAR-HOURLY-FACT-SHEET-QUERY-TIMEOUT-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "maybe_log_fact_sheet_hourly_report", "MAYBE-LOG-FACT-SHEET-HOURLY-REPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "log_fact_sheet_hourly_report", "LOG-FACT-SHEET-HOURLY-REPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_directory_generated_count", "FACT-SHEET-LOG-DIRECTORY-GENERATED-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_file_generated_count", "FACT-SHEET-LOG-FILE-GENERATED-COUNT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_directory_average_total_time", "FACT-SHEET-LOG-DIRECTORY-AVERAGE-TOTAL-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_file_count_and_total_time", "FACT-SHEET-LOG-FILE-COUNT-AND-TOTAL-TIME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "plot_fact_sheet_log_directory_generated_count_by_date", "PLOT-FACT-SHEET-LOG-DIRECTORY-GENERATED-COUNT-BY-DATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_directory_generated_count_by_date", "FACT-SHEET-LOG-DIRECTORY-GENERATED-COUNT-BY-DATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_file_generated_count_by_date", "FACT-SHEET-LOG-FILE-GENERATED-COUNT-BY-DATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_directory_average_total_time_by_date", "FACT-SHEET-LOG-DIRECTORY-AVERAGE-TOTAL-TIME-BY-DATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_file_average_total_time_by_date", "FACT-SHEET-LOG-FILE-AVERAGE-TOTAL-TIME-BY-DATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_directory_average_category_count_by_date", "FACT-SHEET-LOG-DIRECTORY-AVERAGE-CATEGORY-COUNT-BY-DATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_file_average_category_count_by_date", "FACT-SHEET-LOG-FILE-AVERAGE-CATEGORY-COUNT-BY-DATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_directory_average_sentence_count_by_date", "FACT-SHEET-LOG-DIRECTORY-AVERAGE-SENTENCE-COUNT-BY-DATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_file_average_sentence_count_by_date", "FACT-SHEET-LOG-FILE-AVERAGE-SENTENCE-COUNT-BY-DATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_directory_average_uncategorized_sentence_count_by_date", "FACT-SHEET-LOG-DIRECTORY-AVERAGE-UNCATEGORIZED-SENTENCE-COUNT-BY-DATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_file_average_uncategorized_sentence_count_by_date", "FACT-SHEET-LOG-FILE-AVERAGE-UNCATEGORIZED-SENTENCE-COUNT-BY-DATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "plot_fact_sheet_log_directory_query_failure_rate_by_date", "PLOT-FACT-SHEET-LOG-DIRECTORY-QUERY-FAILURE-RATE-BY-DATE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_directory_query_failure_rate_by_date", "FACT-SHEET-LOG-DIRECTORY-QUERY-FAILURE-RATE-BY-DATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_file_query_failure_rate_by_date", "FACT-SHEET-LOG-FILE-QUERY-FAILURE-RATE-BY-DATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_directory_generated_count_for_date", "FACT-SHEET-LOG-DIRECTORY-GENERATED-COUNT-FOR-DATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_file_generated_count_for_date", "FACT-SHEET-LOG-FILE-GENERATED-COUNT-FOR-DATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_file_generated_count_old", "FACT-SHEET-LOG-FILE-GENERATED-COUNT-OLD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_file_generated_count_for_date_old", "FACT-SHEET-LOG-FILE-GENERATED-COUNT-FOR-DATE-OLD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "get_fact_sheet_log_file_data", "GET-FACT-SHEET-LOG-FILE-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "get_fact_sheet_log_directory_data", "GET-FACT-SHEET-LOG-DIRECTORY-DATA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "clear_get_fact_sheet_log_directory_data_cached", "CLEAR-GET-FACT-SHEET-LOG-DIRECTORY-DATA-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "remove_get_fact_sheet_log_directory_data_cached", "REMOVE-GET-FACT-SHEET-LOG-DIRECTORY-DATA-CACHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "get_fact_sheet_log_directory_data_cached_internal", "GET-FACT-SHEET-LOG-DIRECTORY-DATA-CACHED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "get_fact_sheet_log_directory_data_cached", "GET-FACT-SHEET-LOG-DIRECTORY-DATA-CACHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "find_or_create_fact_sheet_log_directory_data_file", "FIND-OR-CREATE-FACT-SHEET-LOG-DIRECTORY-DATA-FILE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "ensure_fact_sheet_log_directories_are_up_to_date", "ENSURE-FACT-SHEET-LOG-DIRECTORIES-ARE-UP-TO-DATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "parse_and_save_fact_sheet_log_directory_data", "PARSE-AND-SAVE-FACT-SHEET-LOG-DIRECTORY-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "parse_and_save_fact_sheet_log_file_data", "PARSE-AND-SAVE-FACT-SHEET-LOG-FILE-DATA", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_file_parsed_data_filename", "FACT-SHEET-LOG-FILE-PARSED-DATA-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_directory_parsed_data_filename", "FACT-SHEET-LOG-DIRECTORY-PARSED-DATA-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_file_parse_data", "FACT-SHEET-LOG-FILE-PARSE-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_line_starts_withP", "FACT-SHEET-LOG-LINE-STARTS-WITH?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_file_parse_start_line_data", "FACT-SHEET-LOG-FILE-PARSE-START-LINE-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_file_parse_stale_start_line_data", "FACT-SHEET-LOG-FILE-PARSE-STALE-START-LINE-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_file_parse_dequeue_line_data", "FACT-SHEET-LOG-FILE-PARSE-DEQUEUE-LINE-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_file_parse_new_query_timeout_line_data", "FACT-SHEET-LOG-FILE-PARSE-NEW-QUERY-TIMEOUT-LINE-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "update_current_datum_for_misc_sentence_stats", "UPDATE-CURRENT-DATUM-FOR-MISC-SENTENCE-STATS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "update_current_datum_for_pph_stats", "UPDATE-CURRENT-DATUM-FOR-PPH-STATS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "update_current_datum_for_pph_failure_stats", "UPDATE-CURRENT-DATUM-FOR-PPH-FAILURE-STATS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "update_current_datum_for_info_gather_stats", "UPDATE-CURRENT-DATUM-FOR-INFO-GATHER-STATS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "finalize_current_datum", "FINALIZE-CURRENT-DATUM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "compute_total_time_from_start_and_end", "COMPUTE-TOTAL-TIME-FROM-START-AND-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "term_from_fact_sheet_log_finish_line", "TERM-FROM-FACT-SHEET-LOG-FINISH-LINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "add_total_time_to_datum", "ADD-TOTAL-TIME-TO-DATUM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "add_end_date_and_time_to_datum", "ADD-END-DATE-AND-TIME-TO-DATUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_term_from_string", "FACT-SHEET-TERM-FROM-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "nart_end_from_string", "NART-END-FROM-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "open_new_unique_fact_sheet_log_file", "OPEN-NEW-UNIQUE-FACT-SHEET-LOG-FILE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "fact_sheet_log_directory_path_for_kb", "FACT-SHEET-LOG-DIRECTORY-PATH-FOR-KB", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "uniquify_fact_sheet_log_filename", "UNIQUIFY-FACT-SHEET-LOG-FILENAME", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fact_sheet_logs", "physical_directory_from_path", "PHYSICAL-DIRECTORY-FROM-PATH", 1, 0, false);
        return (SubLObject)fact_sheet_logs.NIL;
    }
    
    public static SubLObject init_fact_sheet_logs_file() {
        fact_sheet_logs.$fact_sheet_log_file$ = SubLFiles.defparameter("*FACT-SHEET-LOG-FILE*", (SubLObject)fact_sheet_logs.NIL);
        fact_sheet_logs.$fact_sheet_log_stream$ = SubLFiles.defparameter("*FACT-SHEET-LOG-STREAM*", (SubLObject)fact_sheet_logs.T);
        fact_sheet_logs.$closed_fact_sheet_log_files$ = SubLFiles.deflexical("*CLOSED-FACT-SHEET-LOG-FILES*", (SubLObject)(maybeDefault((SubLObject)fact_sheet_logs.$sym43$_CLOSED_FACT_SHEET_LOG_FILES_, fact_sheet_logs.$closed_fact_sheet_log_files$, fact_sheet_logs.NIL)));
        fact_sheet_logs.$next_fact_sheet_hourly_report_time$ = SubLFiles.defparameter("*NEXT-FACT-SHEET-HOURLY-REPORT-TIME*", (SubLObject)fact_sheet_logs.NIL);
        fact_sheet_logs.$hourly_fact_sheet_stats$ = SubLFiles.defparameter("*HOURLY-FACT-SHEET-STATS*", (SubLObject)fact_sheet_logs.NIL);
        fact_sheet_logs.$fact_sheet_log_file_properties$ = SubLFiles.deflexical("*FACT-SHEET-LOG-FILE-PROPERTIES*", (SubLObject)fact_sheet_logs.$list95);
        fact_sheet_logs.$get_fact_sheet_log_directory_data_cached_caching_state$ = SubLFiles.deflexical("*GET-FACT-SHEET-LOG-DIRECTORY-DATA-CACHED-CACHING-STATE*", (SubLObject)fact_sheet_logs.NIL);
        fact_sheet_logs.$fact_sheet_log_file_uniquifier_lock$ = SubLFiles.deflexical("*FACT-SHEET-LOG-FILE-UNIQUIFIER-LOCK*", Locks.make_lock((SubLObject)fact_sheet_logs.$str167$fact_sheet_log_file_uniquifier_lo));
        return (SubLObject)fact_sheet_logs.NIL;
    }
    
    public static SubLObject setup_fact_sheet_logs_file() {
        access_macros.register_macro_helper((SubLObject)fact_sheet_logs.$sym2$LOG_FACT_SHEET_MESSAGE, (SubLObject)fact_sheet_logs.$list3);
        access_macros.register_macro_helper((SubLObject)fact_sheet_logs.$sym13$PRINT_FACT_SHEET_LOG_HEADER, (SubLObject)fact_sheet_logs.$sym2$LOG_FACT_SHEET_MESSAGE);
        subl_macro_promotions.declare_defglobal((SubLObject)fact_sheet_logs.$sym43$_CLOSED_FACT_SHEET_LOG_FILES_);
        access_macros.register_macro_helper((SubLObject)fact_sheet_logs.$sym44$NOTE_FACT_SHEET_LOG_FILE_CLOSED, (SubLObject)fact_sheet_logs.$sym45$WITH_FACT_SHEET_LOGGING);
        access_macros.register_macro_helper((SubLObject)fact_sheet_logs.$sym48$RESET_HOURLY_REPORT_TIME, (SubLObject)fact_sheet_logs.$sym49$WITH_FACT_SHEET_LOGGING_AND_HOURLY_REPORTING);
        memoization_state.note_globally_cached_function((SubLObject)fact_sheet_logs.$sym96$GET_FACT_SHEET_LOG_DIRECTORY_DATA_CACHED);
        return (SubLObject)fact_sheet_logs.NIL;
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
    
    static {
        me = (SubLFile)new fact_sheet_logs();
        fact_sheet_logs.$fact_sheet_log_file$ = null;
        fact_sheet_logs.$fact_sheet_log_stream$ = null;
        fact_sheet_logs.$closed_fact_sheet_log_files$ = null;
        fact_sheet_logs.$next_fact_sheet_hourly_report_time$ = null;
        fact_sheet_logs.$hourly_fact_sheet_stats$ = null;
        fact_sheet_logs.$fact_sheet_log_file_properties$ = null;
        fact_sheet_logs.$get_fact_sheet_log_directory_data_cached_caching_state$ = null;
        fact_sheet_logs.$fact_sheet_log_file_uniquifier_lock$ = null;
        $sym0$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*FACT-SHEET-LOG-STREAM*"), (SubLObject)SubLObjectFactory.makeSymbol("*NULL-OUTPUT*")));
        $sym2$LOG_FACT_SHEET_MESSAGE = SubLObjectFactory.makeSymbol("LOG-FACT-SHEET-MESSAGE");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOG-FACT-SHEET-WARNING"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-FACT-SHEET-NOTE"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MSG-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT-STR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym5$STREAM = SubLObjectFactory.makeUninternedSymbol("STREAM");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FACT-SHEET-LOG-STREAM")));
        $sym7$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym8$COR = SubLObjectFactory.makeSymbol("COR");
        $sym9$CAND = SubLObjectFactory.makeSymbol("CAND");
        $list10 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)fact_sheet_logs.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-PROCESS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIAL-PROCESS"))));
        $sym11$STREAMP = SubLObjectFactory.makeSymbol("STREAMP");
        $sym12$OUTPUT_STREAM_P = SubLObjectFactory.makeSymbol("OUTPUT-STREAM-P");
        $sym13$PRINT_FACT_SHEET_LOG_HEADER = SubLObjectFactory.makeSymbol("PRINT-FACT-SHEET-LOG-HEADER");
        $sym14$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $sym15$FORCE_OUTPUT = SubLObjectFactory.makeSymbol("FORCE-OUTPUT");
        $str16$_ = SubLObjectFactory.makeString(" ");
        $str17$__ = SubLObjectFactory.makeString(": ");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT-STR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $str19$WARN = SubLObjectFactory.makeString("WARN");
        $str20$NOTE = SubLObjectFactory.makeString("NOTE");
        $list21 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILENAME")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym22$_FACT_SHEET_LOG_FILE_ = SubLObjectFactory.makeSymbol("*FACT-SHEET-LOG-FILE*");
        $sym23$WITH_PRIVATE_TEXT_FILE = SubLObjectFactory.makeSymbol("WITH-PRIVATE-TEXT-FILE");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*FACT-SHEET-LOG-STREAM*"), (SubLObject)SubLObjectFactory.makeSymbol("*FACT-SHEET-LOG-FILE*"), (SubLObject)SubLObjectFactory.makeKeyword("APPEND"));
        $sym25$DIRECTORY = SubLObjectFactory.makeUninternedSymbol("DIRECTORY");
        $sym26$FILENAME = SubLObjectFactory.makeUninternedSymbol("FILENAME");
        $sym27$ALREADY_LOGGING_ = SubLObjectFactory.makeUninternedSymbol("ALREADY-LOGGING?");
        $sym28$USE_NEW_SETUP_ = SubLObjectFactory.makeUninternedSymbol("USE-NEW-SETUP?");
        $list29 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), (SubLObject)SubLObjectFactory.makeSymbol("*FACT-SHEET-LOG-FILE*")));
        $sym30$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym31$CMULTIPLE_VALUE_SETQ = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ");
        $list32 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPEN-NEW-UNIQUE-FACT-SHEET-LOG-FILE")));
        $sym33$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym34$DIRECTORY_P = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $sym35$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym36$_STANDARD_OUTPUT_ = SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*");
        $str37$__Logging_Fact_Sheet_generation_t = SubLObjectFactory.makeString("~&Logging Fact-Sheet generation to file:~% ~S~%");
        $list38 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORCE-OUTPUT"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*")));
        $sym39$WITH_FACT_SHEET_LOG_FILE = SubLObjectFactory.makeSymbol("WITH-FACT-SHEET-LOG-FILE");
        $sym40$FIF = SubLObjectFactory.makeSymbol("FIF");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*FACT-SHEET-LOG-FILE*"));
        $list42 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOG-FACT-SHEET-NOTE"), (SubLObject)SubLObjectFactory.makeString("Closing log.")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOTE-FACT-SHEET-LOG-FILE-CLOSED")));
        $sym43$_CLOSED_FACT_SHEET_LOG_FILES_ = SubLObjectFactory.makeSymbol("*CLOSED-FACT-SHEET-LOG-FILES*");
        $sym44$NOTE_FACT_SHEET_LOG_FILE_CLOSED = SubLObjectFactory.makeSymbol("NOTE-FACT-SHEET-LOG-FILE-CLOSED");
        $sym45$WITH_FACT_SHEET_LOGGING = SubLObjectFactory.makeSymbol("WITH-FACT-SHEET-LOGGING");
        $list46 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NEXT-FACT-SHEET-HOURLY-REPORT-TIME*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HOURLY-FACT-SHEET-STATS*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-VECTOR"), (SubLObject)fact_sheet_logs.TWO_INTEGER, (SubLObject)fact_sheet_logs.ZERO_INTEGER)));
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESET-HOURLY-REPORT-TIME"));
        $sym48$RESET_HOURLY_REPORT_TIME = SubLObjectFactory.makeSymbol("RESET-HOURLY-REPORT-TIME");
        $sym49$WITH_FACT_SHEET_LOGGING_AND_HOURLY_REPORTING = SubLObjectFactory.makeSymbol("WITH-FACT-SHEET-LOGGING-AND-HOURLY-REPORTING");
        $str50$Hourly_report__Generated__S_fact_ = SubLObjectFactory.makeString("Hourly report: Generated ~S fact sheets. Suffered ~S query timeouts.");
        $str51$Counting_fact_sheets_in_ = SubLObjectFactory.makeString("Counting fact sheets in ");
        $str52$cdolist = SubLObjectFactory.makeString("cdolist");
        $str53$Gathering_time_info_for_fact_shee = SubLObjectFactory.makeString("Gathering time info for fact sheets in ");
        $kw54$TOTAL_TIME = SubLObjectFactory.makeKeyword("TOTAL-TIME");
        $list55 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DATE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"));
        $sym56$DATESTRING_ = SubLObjectFactory.makeSymbol("DATESTRING<");
        $kw57$XDATA = SubLObjectFactory.makeKeyword("XDATA");
        $str58$time = SubLObjectFactory.makeString("time");
        $kw59$TIMEFMT = SubLObjectFactory.makeKeyword("TIMEFMT");
        $str60$__m__d__Y_ = SubLObjectFactory.makeString("\"%m/%d/%Y\"");
        $kw61$XLABEL = SubLObjectFactory.makeKeyword("XLABEL");
        $str62$Date = SubLObjectFactory.makeString("Date");
        $kw63$YLABEL = SubLObjectFactory.makeKeyword("YLABEL");
        $str64$__of_Fact_Sheets = SubLObjectFactory.makeString("# of Fact Sheets");
        $kw65$PLOT_TITLE = SubLObjectFactory.makeKeyword("PLOT-TITLE");
        $kw66$LINE_LABELS = SubLObjectFactory.makeKeyword("LINE-LABELS");
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Fact Sheets per Day"));
        $kw68$OUTPUT_FILE = SubLObjectFactory.makeKeyword("OUTPUT-FILE");
        $str69$Categorizing_fact_sheets_in_ = SubLObjectFactory.makeString("Categorizing fact sheets in ");
        $str70$_by_date = SubLObjectFactory.makeString(" by date");
        $kw71$END_DATE = SubLObjectFactory.makeKeyword("END-DATE");
        $str72$Analyzing_fact_sheet_times_in_ = SubLObjectFactory.makeString("Analyzing fact sheet times in ");
        $str73$Analyzing_fact_sheet_categorizati = SubLObjectFactory.makeString("Analyzing fact sheet categorization in ");
        $kw74$CATEGORY_COUNT = SubLObjectFactory.makeKeyword("CATEGORY-COUNT");
        $str75$Analyzing_fact_sheet_sentence_cou = SubLObjectFactory.makeString("Analyzing fact sheet sentence count in ");
        $kw76$PPH_SENTENCE_COUNT = SubLObjectFactory.makeKeyword("PPH-SENTENCE-COUNT");
        $str77$Analyzing_fact_sheet_uncategorize = SubLObjectFactory.makeString("Analyzing fact sheet uncategorized sentence count in ");
        $kw78$MISC_SENTENCE_COUNT = SubLObjectFactory.makeKeyword("MISC-SENTENCE-COUNT");
        $list79 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DATE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("FAILURES"));
        $sym80$_ = SubLObjectFactory.makeSymbol(">");
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("FAILURES"));
        $str82$Failure_Rate = SubLObjectFactory.makeString("Failure Rate");
        $str83$Query_Failure_Rates_by_Day = SubLObjectFactory.makeString("Query Failure Rates by Day");
        $str84$Analyzing_query_failure_rates_in_ = SubLObjectFactory.makeString("Analyzing query failure rates in ");
        $list85 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DATE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("INFO-CONS"));
        $list86 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("TOTAL-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-FAILURE-DICTIONARY"));
        $kw87$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $kw88$NORMAL = SubLObjectFactory.makeKeyword("NORMAL");
        $kw89$VERBOSITY = SubLObjectFactory.makeKeyword("VERBOSITY");
        $kw90$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $kw91$QUERY_TIMEOUT_INFO = SubLObjectFactory.makeKeyword("QUERY-TIMEOUT-INFO");
        $str92$_generated_on_ = SubLObjectFactory.makeString(" generated on ");
        $str93$Finished_fact_sheet = SubLObjectFactory.makeString("Finished fact sheet");
        $str94$____Finished_fact_sheet = SubLObjectFactory.makeString(" .* Finished fact sheet");
        $list95 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("VERBOSITY"), SubLObjectFactory.makeKeyword("TERM"), SubLObjectFactory.makeKeyword("STATUS"), SubLObjectFactory.makeKeyword("START-DATE"), SubLObjectFactory.makeKeyword("START-TIME"), SubLObjectFactory.makeKeyword("END-DATE"), SubLObjectFactory.makeKeyword("END-TIME"), SubLObjectFactory.makeKeyword("QUERY-TIMEOUTS"), SubLObjectFactory.makeKeyword("QUERY-TIMEOUT-INFO"), SubLObjectFactory.makeKeyword("MISC-SENTENCE-COUNT"), SubLObjectFactory.makeKeyword("MISC-SENTENCE-TIME"), SubLObjectFactory.makeKeyword("FILTERED-REDUNDANT-FACT-COUNT"), SubLObjectFactory.makeKeyword("CATEGORY-COUNT"), SubLObjectFactory.makeKeyword("INFO-GATHERING-TIME"), SubLObjectFactory.makeKeyword("PPH-PARAGRAPH-COUNT"), SubLObjectFactory.makeKeyword("PPH-SENTENCE-COUNT"), SubLObjectFactory.makeKeyword("PPH-FAILURE-COUNT"), SubLObjectFactory.makeKeyword("PPH-TIME"), SubLObjectFactory.makeKeyword("TOTAL-TIME") });
        $sym96$GET_FACT_SHEET_LOG_DIRECTORY_DATA_CACHED = SubLObjectFactory.makeSymbol("GET-FACT-SHEET-LOG-DIRECTORY-DATA-CACHED");
        $sym97$DICTIONARY_P = SubLObjectFactory.makeSymbol("DICTIONARY-P");
        $sym98$_GET_FACT_SHEET_LOG_DIRECTORY_DATA_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-FACT-SHEET-LOG-DIRECTORY-DATA-CACHED-CACHING-STATE*");
        $str99$Ensuring_data_file_is_up_to_date_ = SubLObjectFactory.makeString("Ensuring data file is up to date...");
        $str100$_log = SubLObjectFactory.makeString(".log");
        $str101$Parsing_data_from_ = SubLObjectFactory.makeString("Parsing data from ");
        $str102$___ = SubLObjectFactory.makeString("...");
        $sym103$FILE_EXISTS_ = SubLObjectFactory.makeSymbol("FILE-EXISTS?");
        $str104$ = SubLObjectFactory.makeString("");
        $str105$parsed_data_cfasl = SubLObjectFactory.makeString("parsed-data.cfasl");
        $str106$MM_DD_YYYY_HH_MM_SS_ = SubLObjectFactory.makeString("MM/DD/YYYY HH:MM:SS ");
        $kw107$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str108$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str109$NOTE__Starting__ = SubLObjectFactory.makeString("NOTE: Starting :");
        $kw110$PARSING_DATUM = SubLObjectFactory.makeKeyword("PARSING-DATUM");
        $str111$_Verbosity__ = SubLObjectFactory.makeString(" Verbosity: ");
        $str112$NOTE__Dequeuing_ = SubLObjectFactory.makeString("NOTE: Dequeuing ");
        $kw113$DEQUEUED_TERM = SubLObjectFactory.makeKeyword("DEQUEUED-TERM");
        $str114$NOTE__Skipping_ = SubLObjectFactory.makeString("NOTE: Skipping ");
        $str115$NOTE__Updating_ = SubLObjectFactory.makeString("NOTE: Updating ");
        $str116$NOTE__Updating_all_stale_fact_she = SubLObjectFactory.makeString("NOTE: Updating all stale fact sheets from ");
        $str117$NOTE__Updating_stale_fact_sheet_f = SubLObjectFactory.makeString("NOTE: Updating stale fact sheet for ");
        $str118$WARN__Hit_soft_timeout_of_ = SubLObjectFactory.makeString("WARN: Hit soft timeout of ");
        $kw119$QUERY_TIMEOUTS = SubLObjectFactory.makeKeyword("QUERY-TIMEOUTS");
        $kw120$MINI = SubLObjectFactory.makeKeyword("MINI");
        $kw121$HIT_QUERY_TIMEOUT = SubLObjectFactory.makeKeyword("HIT-QUERY-TIMEOUT");
        $str122$NOTE__ = SubLObjectFactory.makeString("NOTE: ");
        $kw123$LOOKING_FOR_TIMED_OUT_QUERY_YIELD = SubLObjectFactory.makeKeyword("LOOKING-FOR-TIMED-OUT-QUERY-YIELD");
        $str124$_yielded_ = SubLObjectFactory.makeString(" yielded ");
        $kw125$PARAGRAPH_COUNT = SubLObjectFactory.makeKeyword("PARAGRAPH-COUNT");
        $str126$WARN__Launching_make_up_updater = SubLObjectFactory.makeString("WARN: Launching make-up updater");
        $str127$We_appear_to_have_aborted_the_fac = SubLObjectFactory.makeString("We appear to have aborted the fact-sheet generation for~% ~S (launched make-up updater)~% ~S");
        $kw128$TERM = SubLObjectFactory.makeKeyword("TERM");
        $str129$NOTE__Added_ = SubLObjectFactory.makeString("NOTE: Added ");
        $str130$NOTE__Gathered_ = SubLObjectFactory.makeString("NOTE: Gathered ");
        $str131$_implies_ = SubLObjectFactory.makeString(" implies ");
        $kw132$FILTERED_REDUNDANT_FACT_COUNT = SubLObjectFactory.makeKeyword("FILTERED-REDUNDANT-FACT-COUNT");
        $str133$NOTE__Generated_ = SubLObjectFactory.makeString("NOTE: Generated ");
        $str134$WARN__Failed_to_paraphrase_ = SubLObjectFactory.makeString("WARN: Failed to paraphrase ");
        $str135$WARN__Query_failed_to_get_mini_fa = SubLObjectFactory.makeString("WARN: Query failed to get mini fact sheet for ");
        $str136$NOTE__Query_got_mini_fact_sheet_o = SubLObjectFactory.makeString("NOTE: Query got mini fact sheet of length 120 for ");
        $str137$NOTE__Finished_fact_sheet_for_ = SubLObjectFactory.makeString("NOTE: Finished fact sheet for ");
        $str138$Found_finish_line__but_state_is__ = SubLObjectFactory.makeString("Found finish line, but state is ~S~% Current datum: ~S~%~S~%~S");
        $str139$We_appear_to_have_aborted_the_fac = SubLObjectFactory.makeString("We appear to have aborted the fact-sheet generation for~% ~S (end of log file)~% ~S");
        $int140$35 = SubLObjectFactory.makeInteger(35);
        $str141$update_on_ = SubLObjectFactory.makeString("update on ");
        $str142$__Status = SubLObjectFactory.makeString(". Status");
        $str143$__Status__ = SubLObjectFactory.makeString(". Status: ");
        $kw144$STATUS = SubLObjectFactory.makeKeyword("STATUS");
        $kw145$START_DATE = SubLObjectFactory.makeKeyword("START-DATE");
        $kw146$START_TIME = SubLObjectFactory.makeKeyword("START-TIME");
        $kw147$STALE = SubLObjectFactory.makeKeyword("STALE");
        $int148$46 = SubLObjectFactory.makeInteger(46);
        $kw149$TIMEOUT_TIME = SubLObjectFactory.makeKeyword("TIMEOUT-TIME");
        $str150$seconds_after_getting = SubLObjectFactory.makeString("seconds after getting");
        $kw151$RESULT_COUNT = SubLObjectFactory.makeKeyword("RESULT-COUNT");
        $str152$THCL_sentences_in = SubLObjectFactory.makeString("THCL sentences in");
        $kw153$MISC_SENTENCE_TIME = SubLObjectFactory.makeKeyword("MISC-SENTENCE-TIME");
        $kw154$PPH_PARAGRAPH_COUNT = SubLObjectFactory.makeKeyword("PPH-PARAGRAPH-COUNT");
        $str155$paragraphs_containing_ = SubLObjectFactory.makeString("paragraphs containing ");
        $str156$sentences_for_ = SubLObjectFactory.makeString("sentences for ");
        $str157$Must_have_missed_the__Finished__l = SubLObjectFactory.makeString("Must have missed the 'Finished' line for ~S");
        $str158$_in_ = SubLObjectFactory.makeString(" in ");
        $kw159$PPH_TIME = SubLObjectFactory.makeKeyword("PPH-TIME");
        $kw160$PPH_FAILURE_COUNT = SubLObjectFactory.makeKeyword("PPH-FAILURE-COUNT");
        $str161$groups_of_sentences_for_ = SubLObjectFactory.makeString("groups of sentences for ");
        $kw162$INFO_GATHERING_TIME = SubLObjectFactory.makeKeyword("INFO-GATHERING-TIME");
        $kw163$END_TIME = SubLObjectFactory.makeKeyword("END-TIME");
        $str164$___ = SubLObjectFactory.makeString("#<(");
        $str165$__ = SubLObjectFactory.makeString("#<");
        $str166$Couldn_t_determine_term_from__S = SubLObjectFactory.makeString("Couldn't determine term from ~S");
        $str167$fact_sheet_log_file_uniquifier_lo = SubLObjectFactory.makeString("fact-sheet-log-file-uniquifier-lock");
        $str168$_ = SubLObjectFactory.makeString("-");
        $str169$0775 = SubLObjectFactory.makeString("0775");
        $str170$logs = SubLObjectFactory.makeString("logs");
        $str171$_5__0D = SubLObjectFactory.makeString("~5,'0D");
        $kw172$APPEND = SubLObjectFactory.makeKeyword("APPEND");
        $str173$Opening_log_ = SubLObjectFactory.makeString("Opening log.");
        $str174$755 = SubLObjectFactory.makeString("755");
        $sym175$LIST_OF_STRING_P = SubLObjectFactory.makeSymbol("LIST-OF-STRING-P");
        $str176$_ = SubLObjectFactory.makeString("/");
    }
}

/*

	Total time: 962 ms
	
*/