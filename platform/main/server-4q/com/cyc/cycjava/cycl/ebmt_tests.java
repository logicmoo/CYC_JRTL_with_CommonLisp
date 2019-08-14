/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_pretty$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_position;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.experiment_loop;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      EBMT-TESTS
 * source file: /cyc/top/cycl/ebmt-tests.lisp
 * created:     2019/07/03 17:38:59
 */
public final class ebmt_tests extends SubLTranslatedFile implements V12 {
    public static final SubLObject run_one_earnings_from_sentences_test(SubLObject earnings_reports_file, SubLObject table_extracted_earnings_reports_dir, SubLObject test_dir, SubLObject to_be_scored_lines_stream) {
        if (NIL != string_utilities.ends_with(earnings_reports_file, $cy_fi_earnings_reports_suffix$.getGlobalValue(), UNPROVIDED)) {
            {
                SubLObject pathname = cconcatenate(table_extracted_earnings_reports_dir, earnings_reports_file);
                SubLObject sentence_file = com.cyc.cycjava.cycl.ebmt_tests.cy_fi_sentencify_filemask(pathname, test_dir);
                SubLObject sentence_strings = file_utilities.slurp_file_lines(sentence_file);
                SubLObject earnings_string = funcall(EARNINGS_FROM_SENTENCES, sentence_strings);
                format_nil.force_format(to_be_scored_lines_stream, $str_alt211$__a___a__, earnings_string, sentence_strings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return earnings_string;
            }
        }
        return NIL;
    }

    public static final SubLObject run_end_to_end_ebmt_earnings_reports_tests(SubLObject testing_every_nth, SubLObject training_mt) {
        if (testing_every_nth == UNPROVIDED) {
            testing_every_nth = ONE_INTEGER;
        }
        if (training_mt == UNPROVIDED) {
            training_mt = $cy_fi_ebmt_input_mt$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject test_dir = com.cyc.cycjava.cycl.ebmt_tests.create_end_to_end_ebmt_earnings_reports_tests_output_dir();
                {
                    SubLObject _prev_bind_0 = $ebmt_keepalive_enabledP$.currentBinding(thread);
                    try {
                        $ebmt_keepalive_enabledP$.bind(T, thread);
                        com.cyc.cycjava.cycl.ebmt_tests.ebmt_possibly_update_keepalive_file();
                        {
                            SubLObject raw_earnings_reports_dir = $str_alt5$;
                            SubLObject table_extracted_earnings_reports_dir = com.cyc.cycjava.cycl.ebmt_tests.extract_tables_from_raw_earnings_reports(raw_earnings_reports_dir);
                            SubLObject sentence_file = com.cyc.cycjava.cycl.ebmt_tests.cy_fi_sentencify_directory(table_extracted_earnings_reports_dir, test_dir);
                            com.cyc.cycjava.cycl.ebmt_tests.ebmt_test_loop_single_corpus(test_dir, training_mt, sentence_file, ONE_INTEGER, testing_every_nth, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        $ebmt_keepalive_enabledP$.rebind(_prev_bind_0, thread);
                    }
                }
                return test_dir;
            }
        }
    }

    /**
     *
     *
     * @see run-end-to-end-ebmt-earnings-reports-tests
     */
    @LispMethod(comment = "@see run-end-to-end-ebmt-earnings-reports-tests")
    public static final SubLObject run_end_to_end_earnings_from_sentences_tests(SubLObject testing_every_nth) {
        if (testing_every_nth == UNPROVIDED) {
            testing_every_nth = ONE_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject test_dir = com.cyc.cycjava.cycl.ebmt_tests.create_end_to_end_earnings_from_sentences_tests_output_dir();
                {
                    SubLObject _prev_bind_0 = $ebmt_keepalive_enabledP$.currentBinding(thread);
                    try {
                        $ebmt_keepalive_enabledP$.bind(T, thread);
                        com.cyc.cycjava.cycl.ebmt_tests.ebmt_possibly_update_keepalive_file();
                        {
                            SubLObject raw_earnings_reports_dir = $str_alt5$;
                            SubLObject table_extracted_earnings_reports_dir = com.cyc.cycjava.cycl.ebmt_tests.extract_tables_from_raw_earnings_reports(raw_earnings_reports_dir);
                            SubLObject to_be_scored_lines_file = cconcatenate(test_dir, $ebmt_not_yet_scored_lines_filename$.getGlobalValue());
                            SubLObject every_nth_count = ZERO_INTEGER;
                            SubLObject stream = NIL;
                            try {
                                stream = compatibility.open_text(to_be_scored_lines_file, $OUTPUT, NIL);
                                if (!stream.isStream()) {
                                    Errors.error($str_alt57$Unable_to_open__S, to_be_scored_lines_file);
                                }
                                {
                                    SubLObject to_be_scored_lines_stream = stream;
                                    SubLTrampolineFile.checkType(table_extracted_earnings_reports_dir, DIRECTORY_P);
                                    {
                                        SubLObject directory_contents_var = Filesys.directory(table_extracted_earnings_reports_dir, NIL);
                                        SubLObject progress_message_var = $str_alt209$Processing_earnings_reports___;
                                        {
                                            SubLObject _prev_bind_0_46 = $silent_progressP$.currentBinding(thread);
                                            try {
                                                $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                                                {
                                                    SubLObject list_var = directory_contents_var;
                                                    $progress_note$.setDynamicValue(progress_message_var, thread);
                                                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                                    $progress_total$.setDynamicValue(length(list_var), thread);
                                                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                                    {
                                                        SubLObject _prev_bind_0_47 = $last_percent_progress_index$.currentBinding(thread);
                                                        SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                                        try {
                                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                                            $within_noting_percent_progress$.bind(T, thread);
                                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                                            {
                                                                SubLObject csome_list_var = list_var;
                                                                SubLObject file = NIL;
                                                                for (file = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , file = csome_list_var.first()) {
                                                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                    com.cyc.cycjava.cycl.ebmt_tests.ebmt_possibly_update_keepalive_file();
                                                                    every_nth_count = add(every_nth_count, ONE_INTEGER);
                                                                    if (every_nth_count.numGE(testing_every_nth)) {
                                                                        every_nth_count = ZERO_INTEGER;
                                                                        com.cyc.cycjava.cycl.ebmt_tests.run_one_earnings_from_sentences_test(file, table_extracted_earnings_reports_dir, test_dir, to_be_scored_lines_stream);
                                                                    }
                                                                }
                                                            }
                                                            noting_percent_progress_postamble();
                                                        } finally {
                                                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                            $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                                            $last_percent_progress_index$.rebind(_prev_bind_0_47, thread);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                $silent_progressP$.rebind(_prev_bind_0_46, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_48, thread);
                                    }
                                }
                            }
                            com.cyc.cycjava.cycl.ebmt_tests.ebmt_score_lines_file_automatically(test_dir);
                        }
                    } finally {
                        $ebmt_keepalive_enabledP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return directory-p; the directory containing the output of extracting the tables from
    the earnings reports in RAW-EARNINGS-REPORTS-DIR
     */
    @LispMethod(comment = "@return directory-p; the directory containing the output of extracting the tables from\r\nthe earnings reports in RAW-EARNINGS-REPORTS-DIR")
    public static final SubLObject extract_tables_from_raw_earnings_reports(SubLObject raw_earnings_reports_dir) {
        return $str_alt203$_home_pace_work_cy_fi_earnings_te;
    }

    public static final SubLObject end_to_end_ebmt_earnings_reports_tests_output_dir() {
        {
            SubLObject datestring = experiment_loop.experiment_loop_datestring();
            return cconcatenate($end_to_end_ebmt_earnings_reports_tests_dir$.getGlobalValue(), new SubLObject[]{ datestring, $str_alt59$_ });
        }
    }

    public static final SubLObject end_to_end_earnings_from_sentences_tests_output_dir() {
        {
            SubLObject datestring = experiment_loop.experiment_loop_datestring();
            return cconcatenate($end_to_end_earnings_from_sentences_tests_dir$.getGlobalValue(), new SubLObject[]{ datestring, $str_alt59$_ });
        }
    }

    public static final SubLObject ebmt_slurp_scored_lines_cache() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_cache = make_hash_table($int$2000, symbol_function(EQUALP), UNPROVIDED);
                SubLObject file_var = $ebmt_scored_lines_cache_pathname$.getGlobalValue();
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(file_var, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt57$Unable_to_open__S, file_var);
                    }
                    {
                        SubLObject stream_var = stream;
                        if (stream_var.isStream()) {
                            {
                                SubLObject stream_var_43 = stream_var;
                                SubLObject n = NIL;
                                SubLObject line = NIL;
                                for (n = ZERO_INTEGER, line = read_line(stream_var_43, NIL, NIL, UNPROVIDED); NIL != line; n = number_utilities.f_1X(n) , line = read_line(stream_var_43, NIL, NIL, UNPROVIDED)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject tag = com.cyc.cycjava.cycl.ebmt_tests.eat_one_xml_tag(line);
                                        SubLObject rest_of_line = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject result = com.cyc.cycjava.cycl.ebmt_tests.ebmt_scoring_tag_to_keyword(tag);
                                            if ($ERROR == result) {
                                                Errors.warn($str_alt196$Ill_formed_line___a___a, n, line);
                                            } else {
                                                sethash(rest_of_line, v_cache, result);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return v_cache;
            }
        }
    }

    public static final SubLObject ebmt_scoring_tag_to_keyword(SubLObject tag) {
        if ($$$True.equalp(tag)) {
            return $SUCCESS;
        } else {
            if ($$$Almost.equalp(tag)) {
                return $ALMOST;
            } else {
                if ($str_alt191$Can_t_Tag.equalp(tag)) {
                    return $UNKNOWN;
                } else {
                    if ($$$null.equalp(tag)) {
                        return $UNKNOWN;
                    } else {
                        if ($$$False.equalp(tag)) {
                            return $FAILURE;
                        } else {
                            return $ERROR;
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject ebmt_scored_lines_cache_lookup(SubLObject string, SubLObject v_cache) {
        return gethash_without_values(string, v_cache, $UNKNOWN);
    }

    /**
     * Merges the results of the human-assisted scoring tool with the testing-output
     * and writes the results to SCORED-DATA-FILE.
     */
    @LispMethod(comment = "Merges the results of the human-assisted scoring tool with the testing-output\r\nand writes the results to SCORED-DATA-FILE.\nMerges the results of the human-assisted scoring tool with the testing-output\nand writes the results to SCORED-DATA-FILE.")
    public static final SubLObject ebmt_score_testing_output(SubLObject test_dir) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = com.cyc.cycjava.cycl.ebmt_tests.ebmt_extract_results_from_scored_lines_file(test_dir);
                SubLObject testing_output_file = cconcatenate(test_dir, $ebmt_testing_output_filename$.getGlobalValue());
                SubLObject scored_data_file = cconcatenate(test_dir, $ebmt_scored_data_filename$.getGlobalValue());
                {
                    SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $print_length$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $print_level$.currentBinding(thread);
                    try {
                        $print_pretty$.bind(NIL, thread);
                        $print_length$.bind(NIL, thread);
                        $print_level$.bind(NIL, thread);
                        {
                            SubLObject stream = NIL;
                            try {
                                stream = compatibility.open_text(scored_data_file, $OUTPUT, NIL);
                                if (!stream.isStream()) {
                                    Errors.error($str_alt57$Unable_to_open__S, scored_data_file);
                                }
                                {
                                    SubLObject scored_data_stream = stream;
                                    SubLObject file_var = testing_output_file;
                                    SubLObject stream_36 = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_37 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                            try {
                                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                stream_36 = compatibility.open_text(file_var, $INPUT, NIL);
                                            } finally {
                                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_37, thread);
                                            }
                                        }
                                        if (!stream_36.isStream()) {
                                            Errors.error($str_alt57$Unable_to_open__S, file_var);
                                        }
                                        {
                                            SubLObject stream_var = stream_36;
                                            if (stream_var.isStream()) {
                                                {
                                                    SubLObject stream_var_38 = stream_var;
                                                    SubLObject line_number_var = NIL;
                                                    SubLObject line = NIL;
                                                    for (line_number_var = ZERO_INTEGER, line = read_line(stream_var_38, NIL, NIL, UNPROVIDED); NIL != line; line_number_var = number_utilities.f_1X(line_number_var) , line = read_line(stream_var_38, NIL, NIL, UNPROVIDED)) {
                                                        {
                                                            SubLObject datum = read_from_string_ignoring_errors(line, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            if (NIL == com.cyc.cycjava.cycl.ebmt_tests.ebmt_testing_output_datum_p(datum)) {
                                                                Errors.warn($str_alt39$Got_a_malformed_EBMT_testing_outp, line);
                                                            } else {
                                                                {
                                                                    SubLObject datum_39 = datum;
                                                                    SubLObject current = datum_39;
                                                                    SubLObject nl = NIL;
                                                                    SubLObject cycl = NIL;
                                                                    SubLObject num_interps_per_example = NIL;
                                                                    SubLObject test_result = NIL;
                                                                    SubLObject time_taken = NIL;
                                                                    SubLObject match_list = NIL;
                                                                    SubLObject parsed_cycls = NIL;
                                                                    SubLObject weights = NIL;
                                                                    destructuring_bind_must_consp(current, datum_39, $list_alt122);
                                                                    nl = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum_39, $list_alt122);
                                                                    cycl = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum_39, $list_alt122);
                                                                    num_interps_per_example = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum_39, $list_alt122);
                                                                    test_result = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum_39, $list_alt122);
                                                                    time_taken = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum_39, $list_alt122);
                                                                    match_list = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum_39, $list_alt122);
                                                                    parsed_cycls = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum_39, $list_alt122);
                                                                    weights = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        {
                                                                            SubLObject parse_count = length(parsed_cycls);
                                                                            if (parse_count.isZero()) {
                                                                                parse_count = ONE_INTEGER;
                                                                            }
                                                                            {
                                                                                SubLObject results_for_this_datum = NIL;
                                                                                SubLObject i = NIL;
                                                                                for (i = ZERO_INTEGER; i.numL(parse_count); i = add(i, ONE_INTEGER)) {
                                                                                    {
                                                                                        SubLObject result = results.first();
                                                                                        results_for_this_datum = cons(result, results_for_this_datum);
                                                                                        results = results.rest();
                                                                                    }
                                                                                }
                                                                                results_for_this_datum = nreverse(results_for_this_datum);
                                                                                {
                                                                                    SubLObject new_match_list = com.cyc.cycjava.cycl.ebmt_tests.ebmt_results_to_match_list(results_for_this_datum);
                                                                                    SubLObject overall_result_for_this_datum = com.cyc.cycjava.cycl.ebmt_tests.ebmt_aggregate_result(results_for_this_datum);
                                                                                    SubLObject new_datum = list(nl, cycl, num_interps_per_example, overall_result_for_this_datum, time_taken, new_match_list, parsed_cycls, weights);
                                                                                    SubLTrampolineFile.checkType(new_datum, EBMT_TESTING_OUTPUT_DATUM_P);
                                                                                    format(scored_data_stream, $str_alt161$_s__, new_datum);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum_39, $list_alt122);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (stream_36.isStream()) {
                                                    close(stream_36, UNPROVIDED);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_40, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_41, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $print_level$.rebind(_prev_bind_2, thread);
                        $print_length$.rebind(_prev_bind_1, thread);
                        $print_pretty$.rebind(_prev_bind_0, thread);
                    }
                }
                return scored_data_file;
            }
        }
    }

    public static final SubLObject ebmt_score_lines_file_automatically(SubLObject test_dir) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_cache = com.cyc.cycjava.cycl.ebmt_tests.ebmt_slurp_scored_lines_cache();
                SubLObject to_be_scored_lines_file = cconcatenate(test_dir, $ebmt_not_yet_scored_lines_filename$.getGlobalValue());
                SubLObject scored_lines_file = cconcatenate(test_dir, $ebmt_scored_lines_filename$.getGlobalValue());
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(scored_lines_file, $OUTPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt57$Unable_to_open__S, scored_lines_file);
                    }
                    {
                        SubLObject out_stream = stream;
                        SubLObject file_var = to_be_scored_lines_file;
                        SubLObject stream_44 = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream_44 = compatibility.open_text(file_var, $INPUT, NIL);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (!stream_44.isStream()) {
                                Errors.error($str_alt57$Unable_to_open__S, file_var);
                            }
                            {
                                SubLObject stream_var = stream_44;
                                if (stream_var.isStream()) {
                                    {
                                        SubLObject stream_var_45 = stream_var;
                                        SubLObject line_number_var = NIL;
                                        SubLObject to_be_scored_line = NIL;
                                        for (line_number_var = ZERO_INTEGER, to_be_scored_line = read_line(stream_var_45, NIL, NIL, UNPROVIDED); NIL != to_be_scored_line; line_number_var = number_utilities.f_1X(line_number_var) , to_be_scored_line = read_line(stream_var_45, NIL, NIL, UNPROVIDED)) {
                                            {
                                                SubLObject result = com.cyc.cycjava.cycl.ebmt_tests.ebmt_scored_lines_cache_lookup(to_be_scored_line, v_cache);
                                                format(out_stream, $str_alt197$__a__a__, com.cyc.cycjava.cycl.ebmt_tests.ebmt_keyword_to_scoring_tag(result), to_be_scored_line);
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (stream_44.isStream()) {
                                        close(stream_44, UNPROVIDED);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return scored_lines_file;
            }
        }
    }

    public static final SubLObject ebmt_results_to_match_list(SubLObject results) {
        return Mapping.mapcar(EBMT_RESULT_TO_MATCH_LIST_ITEM, results);
    }

    public static final SubLObject ebmt_result_to_match_list_item(SubLObject result) {
        {
            SubLObject pcase_var = result;
            if (pcase_var.eql($SUCCESS)) {
                return ONE_INTEGER;
            } else {
                if (pcase_var.eql($ALMOST)) {
                    return $float$0_9;
                } else {
                    if (pcase_var.eql($UNKNOWN)) {
                        return MINUS_ONE_INTEGER;
                    } else {
                        if (pcase_var.eql($FAILURE)) {
                            return ZERO_INTEGER;
                        } else {
                            return Errors.error($str_alt125$Unexpected_EBMT_result__s, result);
                        }
                    }
                }
            }
        }
    }

    /**
     * Massage TEST-DIR/*ebmt-testing-output-filename* into a format suitable for
     * the human-assisted scoring tool.
     */
    @LispMethod(comment = "Massage TEST-DIR/*ebmt-testing-output-filename* into a format suitable for\r\nthe human-assisted scoring tool.\nMassage TEST-DIR/*ebmt-testing-output-filename* into a format suitable for\nthe human-assisted scoring tool.")
    public static final SubLObject ebmt_prepare_testing_output_for_scoring(SubLObject test_dir) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject testing_output_file = cconcatenate(test_dir, $ebmt_testing_output_filename$.getGlobalValue());
                SubLObject file_for_scoring = cconcatenate(test_dir, $ebmt_not_yet_scored_lines_filename$.getGlobalValue());
                {
                    SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $print_length$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $print_level$.currentBinding(thread);
                    try {
                        $print_pretty$.bind(NIL, thread);
                        $print_length$.bind(NIL, thread);
                        $print_level$.bind(NIL, thread);
                        {
                            SubLObject stream = NIL;
                            try {
                                stream = compatibility.open_text(file_for_scoring, $OUTPUT, NIL);
                                if (!stream.isStream()) {
                                    Errors.error($str_alt57$Unable_to_open__S, file_for_scoring);
                                }
                                {
                                    SubLObject scoring_stream = stream;
                                    SubLObject file_var = testing_output_file;
                                    SubLObject stream_30 = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_31 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                            try {
                                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                stream_30 = compatibility.open_text(file_var, $INPUT, NIL);
                                            } finally {
                                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_31, thread);
                                            }
                                        }
                                        if (!stream_30.isStream()) {
                                            Errors.error($str_alt57$Unable_to_open__S, file_var);
                                        }
                                        {
                                            SubLObject stream_var = stream_30;
                                            if (stream_var.isStream()) {
                                                {
                                                    SubLObject stream_var_32 = stream_var;
                                                    SubLObject line_number_var = NIL;
                                                    SubLObject line = NIL;
                                                    for (line_number_var = ZERO_INTEGER, line = read_line(stream_var_32, NIL, NIL, UNPROVIDED); NIL != line; line_number_var = number_utilities.f_1X(line_number_var) , line = read_line(stream_var_32, NIL, NIL, UNPROVIDED)) {
                                                        {
                                                            SubLObject datum = read_from_string_ignoring_errors(line, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            if (NIL == com.cyc.cycjava.cycl.ebmt_tests.ebmt_testing_output_datum_p(datum)) {
                                                                Errors.warn($str_alt39$Got_a_malformed_EBMT_testing_outp, line);
                                                            } else {
                                                                {
                                                                    SubLObject datum_33 = datum;
                                                                    SubLObject current = datum_33;
                                                                    SubLObject nl = NIL;
                                                                    SubLObject cycl = NIL;
                                                                    SubLObject num_interps_per_example = NIL;
                                                                    SubLObject test_result = NIL;
                                                                    SubLObject time_taken = NIL;
                                                                    SubLObject match_list = NIL;
                                                                    SubLObject parsed_cycls = NIL;
                                                                    SubLObject weights = NIL;
                                                                    destructuring_bind_must_consp(current, datum_33, $list_alt122);
                                                                    nl = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum_33, $list_alt122);
                                                                    cycl = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum_33, $list_alt122);
                                                                    num_interps_per_example = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum_33, $list_alt122);
                                                                    test_result = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum_33, $list_alt122);
                                                                    time_taken = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum_33, $list_alt122);
                                                                    match_list = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum_33, $list_alt122);
                                                                    parsed_cycls = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum_33, $list_alt122);
                                                                    weights = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL == parsed_cycls) {
                                                                            parsed_cycls = list($NO_PARSES);
                                                                        }
                                                                        {
                                                                            SubLObject cdolist_list_var = parsed_cycls;
                                                                            SubLObject parsed_cycl = NIL;
                                                                            for (parsed_cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parsed_cycl = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject parsed_el = cycl_utilities.hl_to_el(parsed_cycl);
                                                                                    SubLObject scoring_string = string_utilities.reduce_whitespace(cconcatenate(format_nil.format_nil_a_no_copy(nl), new SubLObject[]{ $str_alt183$_, format_nil.format_nil_a_no_copy(parsed_el), format_nil.$format_nil_percent$.getGlobalValue() }));
                                                                                    format(scoring_stream, scoring_string);
                                                                                    terpri(scoring_stream);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum_33, $list_alt122);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (stream_30.isStream()) {
                                                    close(stream_30, UNPROVIDED);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_34, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_35, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $print_level$.rebind(_prev_bind_2, thread);
                        $print_length$.rebind(_prev_bind_1, thread);
                        $print_pretty$.rebind(_prev_bind_0, thread);
                    }
                }
                return file_for_scoring;
            }
        }
    }

    public static final SubLObject ebmt_keyword_to_scoring_tag(SubLObject keyword) {
        {
            SubLObject pcase_var = keyword;
            if (pcase_var.eql($SUCCESS)) {
                return $$$True;
            } else {
                if (pcase_var.eql($ALMOST)) {
                    return $$$Almost;
                } else {
                    if (pcase_var.eql($FAILURE)) {
                        return $$$False;
                    } else {
                        return $str_alt191$Can_t_Tag;
                    }
                }
            }
        }
    }

    /**
     * Returns a list of EBMT results (:success, :failure, or :unknown),
     * one per line extracted from the lines in TEST-DIR/*ebmt-scored-lines-filename*.
     */
    @LispMethod(comment = "Returns a list of EBMT results (:success, :failure, or :unknown),\r\none per line extracted from the lines in TEST-DIR/*ebmt-scored-lines-filename*.\nReturns a list of EBMT results (:success, :failure, or :unknown),\none per line extracted from the lines in TEST-DIR/*ebmt-scored-lines-filename*.")
    public static final SubLObject ebmt_extract_results_from_scored_lines_file(SubLObject test_dir) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = NIL;
                SubLObject scored_lines_file = cconcatenate(test_dir, $ebmt_scored_lines_filename$.getGlobalValue());
                SubLObject doneP = NIL;
                SubLObject file_var = scored_lines_file;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(file_var, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt57$Unable_to_open__S, file_var);
                    }
                    {
                        SubLObject stream_var = stream;
                        if (stream_var.isStream()) {
                            {
                                SubLObject stream_var_42 = stream_var;
                                SubLObject line_number_var = NIL;
                                SubLObject line = NIL;
                                for (line_number_var = ZERO_INTEGER, line = read_line(stream_var_42, NIL, NIL, UNPROVIDED); !((NIL != doneP) || (NIL == line)); line_number_var = number_utilities.f_1X(line_number_var) , line = read_line(stream_var_42, NIL, NIL, UNPROVIDED)) {
                                    if (NIL != string_utilities.empty_string_p(line)) {
                                        Errors.warn($str_alt188$Read_a_blank_line_from__s__assumi, scored_lines_file);
                                        doneP = T;
                                    } else {
                                        {
                                            SubLObject tag = com.cyc.cycjava.cycl.ebmt_tests.eat_one_xml_tag(line);
                                            SubLObject result = com.cyc.cycjava.cycl.ebmt_tests.ebmt_scoring_tag_to_keyword(tag);
                                            results = cons(result, results);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return nreverse(results);
            }
        }
    }

    /**
     * If we're in an experimen loop, use the analysis filename for this run.
     * Otherwise, use TEST-DIR/revised-summary.txt
     */
    @LispMethod(comment = "If we\'re in an experimen loop, use the analysis filename for this run.\r\nOtherwise, use TEST-DIR/revised-summary.txt\nIf we\'re in an experimen loop, use the analysis filename for this run.\nOtherwise, use TEST-DIR/revised-summary.txt")
    public static final SubLObject ebmt_earnings_reports_revised_summary_filename(SubLObject test_dir) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject counter = experiment_loop.experiment_loop_flag();
                SubLObject results_filename = thread.secondMultipleValue();
                SubLObject analysis_filename = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return NIL != analysis_filename ? ((SubLObject) (analysis_filename)) : cconcatenate(test_dir, $str_alt205$revised_summary_txt);
            }
        }
    }

    public static final SubLObject ebmt_create_revised_summary(SubLObject test_dir, SubLObject training_mt, SubLObject sentence_file, SubLObject output_filename, SubLObject global_summaryP) {
        if (global_summaryP == UNPROVIDED) {
            global_summaryP = NIL;
        }
        return com.cyc.cycjava.cycl.ebmt_tests.ebmt_create_summary(test_dir, training_mt, sentence_file, global_summaryP, output_filename, $ebmt_scored_data_filename$.getGlobalValue());
    }

    public static final SubLObject ebmt_aggregate_result(SubLObject results) {
        {
            SubLObject cdolist_list_var = $ebmt_ordered_results$.getGlobalValue();
            SubLObject target_result = NIL;
            for (target_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , target_result = cdolist_list_var.first()) {
                if (NIL != list_utilities.member_eqP(target_result, results)) {
                    return target_result;
                }
            }
        }
        return Errors.error($str_alt187$Expected_valid_EBMT_results__got_, results);
    }

    /**
     * Assumes that STRING begins with an XML tag.
     *
     * @return 0 stringp; the XML tag, with the < > removed.
     * @return 1 stringp; the string following the XML tag.
     */
    @LispMethod(comment = "Assumes that STRING begins with an XML tag.\r\n\r\n@return 0 stringp; the XML tag, with the < > removed.\r\n@return 1 stringp; the string following the XML tag.")
    public static final SubLObject eat_one_xml_tag(SubLObject string) {
        {
            SubLObject gt_pos = position(CHAR_greater, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != gt_pos) {
                {
                    SubLObject tag = string_utilities.substring(string, ONE_INTEGER, gt_pos);
                    SubLObject rest = string_utilities.substring(string, number_utilities.f_1X(gt_pos), UNPROVIDED);
                    return values(tag, rest);
                }
            } else {
                return values(NIL, NIL);
            }
        }
    }

    public static final SubLObject cy_fi_sentencify_filemask(SubLObject input_filemask, SubLObject test_dir) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentencifier_script_filename = $cy_fi_sentencifier_script_filename$.getGlobalValue();
                SubLObject output_file = com.cyc.cycjava.cycl.ebmt_tests.cy_fi_sentence_filename(test_dir);
                SubLObject exec_successP = NIL;
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(output_file, $OUTPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt57$Unable_to_open__S, output_file);
                    }
                    {
                        SubLObject output_stream = stream;
                        exec_successP = os_process_utilities.system_eval_using_make_os_process_successfulP(sentencifier_script_filename, list(input_filemask), ZERO_INTEGER, StreamsLow.$standard_input$.getDynamicValue(thread), output_stream, UNPROVIDED);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == exec_successP) {
                        Errors.error($str_alt204$Failed_to_execute__s__s____s, sentencifier_script_filename, input_filemask, output_file);
                    }
                }
                return output_file;
            }
        }
    }

    /**
     *
     *
     * @param TABLE-EXTRACTED-EARNINGS-REPORTS-DIR
     * 		directory-p; a directory containing text earnings reports
     * 		with the tables extracted.
     * 		Returns a filename containing one sentence per line, extracted from the earnings reports
     * 		and filtered for relevance.
     */
    @LispMethod(comment = "@param TABLE-EXTRACTED-EARNINGS-REPORTS-DIR\r\n\t\tdirectory-p; a directory containing text earnings reports\r\n\t\twith the tables extracted.\r\n\t\tReturns a filename containing one sentence per line, extracted from the earnings reports\r\n\t\tand filtered for relevance.")
    public static final SubLObject cy_fi_sentencify_directory(SubLObject table_extracted_earnings_reports_dir, SubLObject test_dir) {
        {
            SubLObject input_files = cconcatenate(table_extracted_earnings_reports_dir, $cy_fi_earnings_reports_filemask$.getGlobalValue());
            return com.cyc.cycjava.cycl.ebmt_tests.cy_fi_sentencify_filemask(input_files, test_dir);
        }
    }

    public static final SubLObject cy_fi_sentence_filename(SubLObject dir) {
        return cconcatenate(dir, $cy_fi_sentence_filename$.getGlobalValue());
    }

    public static final SubLObject create_end_to_end_ebmt_earnings_reports_tests_output_dir() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject dir = com.cyc.cycjava.cycl.ebmt_tests.end_to_end_ebmt_earnings_reports_tests_output_dir();
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == Filesys.make_directory(dir, UNPROVIDED, UNPROVIDED)) {
                        Errors.error($str_alt202$Could_not_create_output_directory, dir);
                    }
                }
                return dir;
            }
        }
    }

    public static final SubLObject create_end_to_end_earnings_from_sentences_tests_output_dir() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject dir = com.cyc.cycjava.cycl.ebmt_tests.end_to_end_earnings_from_sentences_tests_output_dir();
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == Filesys.make_directory(dir, UNPROVIDED, UNPROVIDED)) {
                        Errors.error($str_alt202$Could_not_create_output_directory, dir);
                    }
                }
                return dir;
            }
        }
    }

    static private final SubLString $str_alt5$ = makeString("");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $end_to_end_earnings_from_sentences_tests_dir$ = makeSymbol("*END-TO-END-EARNINGS-FROM-SENTENCES-TESTS-DIR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cy_fi_earnings_reports_suffix$ = makeSymbol("*CY-FI-EARNINGS-REPORTS-SUFFIX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $end_to_end_ebmt_earnings_reports_tests_dir$ = makeSymbol("*END-TO-END-EBMT-EARNINGS-REPORTS-TESTS-DIR*");

    /**
     * It's important that this fail to match *cy-fi-earnings-reports-filemask*.
     */
    // deflexical
    @LispMethod(comment = "It\'s important that this fail to match *cy-fi-earnings-reports-filemask*.\ndeflexical")
    private static final SubLSymbol $cy_fi_sentence_filename$ = makeSymbol("*CY-FI-SENTENCE-FILENAME*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cy_fi_earnings_reports_filemask$ = makeSymbol("*CY-FI-EARNINGS-REPORTS-FILEMASK*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cy_fi_sentencifier_script_filename$ = makeSymbol("*CY-FI-SENTENCIFIER-SCRIPT-FILENAME*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cy_fi_ebmt_input_mt$ = makeSymbol("*CY-FI-EBMT-INPUT-MT*");

    /**
     * In order from best to worst
     */
    // deflexical
    @LispMethod(comment = "In order from best to worst\ndeflexical")
    private static final SubLSymbol $ebmt_ordered_results$ = makeSymbol("*EBMT-ORDERED-RESULTS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $ebmt_scored_lines_cache_pathname$ = makeSymbol("*EBMT-SCORED-LINES-CACHE-PATHNAME*");

    public static final SubLFile me = new ebmt_tests();

 public static final String myName = "com.cyc.cycjava.cycl.ebmt_tests";


    // deflexical
    @LispMethod(comment = "deflexical")
    // Definitions
    private static final SubLSymbol $ebmt_training_output_filename$ = makeSymbol("*EBMT-TRAINING-OUTPUT-FILENAME*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $ebmt_testing_output_filename$ = makeSymbol("*EBMT-TESTING-OUTPUT-FILENAME*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $ebmt_not_yet_scored_lines_filename$ = makeSymbol("*EBMT-NOT-YET-SCORED-LINES-FILENAME*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $ebmt_scored_lines_filename$ = makeSymbol("*EBMT-SCORED-LINES-FILENAME*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $ebmt_scored_data_filename$ = makeSymbol("*EBMT-SCORED-DATA-FILENAME*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $ebmt_keepalive_enabledP$ = makeSymbol("*EBMT-KEEPALIVE-ENABLED?*");

    // defparameter
    /**
     * The file that will contain summary information for all test-runs conducted to
     * evaluate the EBMT system
     */
    @LispMethod(comment = "The file that will contain summary information for all test-runs conducted to\r\nevaluate the EBMT system\ndefparameter\nThe file that will contain summary information for all test-runs conducted to\nevaluate the EBMT system")
    private static final SubLSymbol $ebmt_global_summary_file$ = makeSymbol("*EBMT-GLOBAL-SUMMARY-FILE*");

    // defparameter
    // The graph that represents the EBMT training results to date
    /**
     * The graph that represents the EBMT training results to date
     */
    @LispMethod(comment = "The graph that represents the EBMT training results to date\ndefparameter")
    private static final SubLSymbol $ebmt_training_recall_graph$ = makeSymbol("*EBMT-TRAINING-RECALL-GRAPH*");

    // defparameter
    // The graph that represents the EBMT parsing-test results to date
    /**
     * The graph that represents the EBMT parsing-test results to date
     */
    @LispMethod(comment = "The graph that represents the EBMT parsing-test results to date\ndefparameter")
    private static final SubLSymbol $ebmt_parsing_results_graph$ = makeSymbol("*EBMT-PARSING-RESULTS-GRAPH*");

    // defparameter
    /**
     * This graph displays the precision and recall for the EBMT parsing-tests to
     * date
     */
    @LispMethod(comment = "This graph displays the precision and recall for the EBMT parsing-tests to\r\ndate\ndefparameter\nThis graph displays the precision and recall for the EBMT parsing-tests to\ndate")
    private static final SubLSymbol $ebmt_accuracy_graph$ = makeSymbol("*EBMT-ACCURACY-GRAPH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $ebmt_plot_params$ = makeSymbol("*EBMT-PLOT-PARAMS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$training_output_txt = makeString("training-output.txt");

    static private final SubLString $str1$testing_output_txt = makeString("testing-output.txt");

    static private final SubLString $str2$to_be_scored_lines_txt = makeString("to-be-scored-lines.txt");

    static private final SubLString $str3$scored_lines_txt = makeString("scored-lines.txt");

    static private final SubLString $str4$scored_data_txt = makeString("scored-data.txt");

    static private final SubLString $str5$ = makeString("");

    static private final SubLList $list6 = list(makeSymbol("TEST-DIR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym7$TEST_DIR_VAR = makeUninternedSymbol("TEST-DIR-VAR");

    static private final SubLSymbol $sym8$OS_PROCESS = makeUninternedSymbol("OS-PROCESS");

    static private final SubLList $list10 = list(makeSymbol("*EBMT-INDEX-HOST*"), makeString("localhost"));

    public static final SubLSymbol $ebmt_index_content$ = makeSymbol("*EBMT-INDEX-CONTENT*");

    static private final SubLString $str13$_A_ebmt_index_txt = makeString("~A/ebmt-index.txt");

    public static final SubLSymbol $ebmt_index_log$ = makeSymbol("*EBMT-INDEX-LOG*");

    static private final SubLString $str15$_A_ebmt_index_log = makeString("~A/ebmt-index.log");

    private static final SubLSymbol EBMT_INDEX_SERVER_PROCESS = makeSymbol("EBMT-INDEX-SERVER-PROCESS");

    private static final SubLSymbol WITHOUT_PRETTY_PRINTING = makeSymbol("WITHOUT-PRETTY-PRINTING");

    private static final SubLSymbol KILL_OS_PROCESS = makeSymbol("KILL-OS-PROCESS");

    static private final SubLList $list19 = list(list(makeSymbol("NL"), makeSymbol("CYCL"), makeSymbol("SOURCE"), makeSymbol("&KEY"), list(makeSymbol("EVERY-NTH"), ONE_INTEGER)), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list20 = list(makeKeyword("EVERY-NTH"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLSymbol $sym23$PAIR = makeUninternedSymbol("PAIR");

    static private final SubLSymbol $sym24$SOURCE_VAR = makeUninternedSymbol("SOURCE-VAR");

    private static final SubLSymbol PROGRESS_CDOLIST = makeSymbol("PROGRESS-CDOLIST");

    private static final SubLSymbol EBMT_NL_CYCL_PAIRS_FROM_SOURCE = makeSymbol("EBMT-NL-CYCL-PAIRS-FROM-SOURCE");

    static private final SubLString $str27$Processing_EBMT_data_from__a____ = makeString("Processing EBMT data from ~a ...");

    static private final SubLList $list29 = list(list(new SubLObject[]{ makeSymbol("NL"), makeSymbol("CYCL"), makeSymbol("NUM-INTERPS-PER-EXAMPLE"), makeSymbol("TEST-RESULT"), makeSymbol("TIME-TAKEN"), makeSymbol("MATCH-LIST"), makeSymbol("PARSED-CYCLS"), makeSymbol("WEIGHTS"), makeSymbol("TESTING-OUTPUT-FILE") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym30$LINE = makeUninternedSymbol("LINE");

    static private final SubLSymbol $sym31$DATUM = makeUninternedSymbol("DATUM");

    private static final SubLSymbol DO_FILE_LINES = makeSymbol("DO-FILE-LINES");

    static private final SubLList $list34 = list(NIL);

    private static final SubLSymbol EBMT_TESTING_OUTPUT_DATUM_P = makeSymbol("EBMT-TESTING-OUTPUT-DATUM-P");

    static private final SubLString $str39$Got_a_malformed_EBMT_testing_outp = makeString("Got a malformed EBMT testing output line ~s");

    private static final SubLSymbol EBMT_CANONICALIZE_EL_SENTENCE = makeSymbol("EBMT-CANONICALIZE-EL-SENTENCE");

    private static final SubLList $list47 = list(list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("eventOccursAt"), makeSymbol("?X"), reader_make_constant_shell("Lebanon")), list(reader_make_constant_shell("intendedAttackTargets"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("CarBombing")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("GovernmentalBuilding")), list(reader_make_constant_shell("startsAfterEndingOf"), makeSymbol("?X"), list(reader_make_constant_shell("YearFn"), makeInteger(1999)))), reader_make_constant_shell("InferencePSC")), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("eventOccursAt"), makeSymbol("?VAR1"), reader_make_constant_shell("Lebanon")), list(reader_make_constant_shell("intendedAttackTargets"), makeSymbol("?VAR1"), makeSymbol("?VAR0")), list(reader_make_constant_shell("isa"), makeSymbol("?VAR1"), reader_make_constant_shell("CarBombing")), list(reader_make_constant_shell("isa"), makeSymbol("?VAR0"), reader_make_constant_shell("GovernmentalBuilding")), list(reader_make_constant_shell("startsAfterEndingOf"), makeSymbol("?VAR1"), list(reader_make_constant_shell("YearFn"), makeInteger(1999))))));

    private static final SubLSymbol $sym48$EQUALS_EL_ = makeSymbol("EQUALS-EL?");

    private static final SubLSymbol EBMT_PARSE = makeSymbol("EBMT-PARSE");

    private static final SubLSymbol EBMT_TEST_FUNC = makeSymbol("EBMT-TEST-FUNC");

    private static final SubLList $list51 = list(list(list(makeString("Which terrorist groups have carried out suicide bombings in Israel?")), list(reader_make_constant_shell("thereExists"), makeSymbol("?ASSASSINATION-1"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?ASSASSINATION-1"), reader_make_constant_shell("TerroristSuicideBombing")), list(reader_make_constant_shell("isa"), makeSymbol("?GROUP"), reader_make_constant_shell("TerroristGroup")), list(reader_make_constant_shell("eventOccursAt"), makeSymbol("?ASSASSINATION-1"), reader_make_constant_shell("Israel")), list(reader_make_constant_shell("perpetrator"), makeSymbol("?ASSASSINATION-1"), makeSymbol("?GROUP"))))), list(list(makeString("What types of attacks has Hezbollah performed?")), list(reader_make_constant_shell("thereExists"), makeSymbol("?ACTION"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?TYPE-OF-ATTACK"), reader_make_constant_shell("AttackType")), list(reader_make_constant_shell("nearestIsa"), makeSymbol("?ACTION"), makeSymbol("?TYPE-OF-ATTACK")), list(reader_make_constant_shell("performedBy"), makeSymbol("?ACTION"), reader_make_constant_shell("LebaneseHizballah"))))), list(list(makeString("Where were the members of Hizballah born?")), list(reader_make_constant_shell("thereExists"), makeSymbol("?MEMBER-1"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("hasMembers"), reader_make_constant_shell("LebaneseHizballah"), makeSymbol("?MEMBER-1")), list(reader_make_constant_shell("birthPlace"), makeSymbol("?MEMBER-1"), makeSymbol("?PLACE"))))), list(list(makeString("Where do members of Hizballah live?")), list(reader_make_constant_shell("thereExists"), makeSymbol("?INHABITANT"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("hasMembers"), reader_make_constant_shell("LebaneseHizballah"), makeSymbol("?INHABITANT")), list(reader_make_constant_shell("isa"), makeSymbol("?INHABITANT"), reader_make_constant_shell("Agent-Generic")), list(reader_make_constant_shell("residesInRegion"), makeSymbol("?INHABITANT"), makeSymbol("?GEOGRAPHICAL-REGION"))))), list(list(makeString("What terrorist groups is Hezbollah financially linked to?")), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("TerroristGroup")), list(reader_make_constant_shell("relatedToVia"), reader_make_constant_shell("LebaneseHizballah"), makeSymbol("?X"), list(reader_make_constant_shell("TheSet"), reader_make_constant_shell("financiallyLinked")), THREE_INTEGER))), list(list(makeString("What types of financial links are there?")), list(reader_make_constant_shell("genlPreds"), makeSymbol("?PRED"), reader_make_constant_shell("financiallyLinked"))));

    private static final SubLString $str52$_error_output_txt = makeString("/error-output.txt");

    private static final SubLString $str54$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str55$_cyc_top_data_ebmt_testing_query_ = makeString("/cyc/top/data/ebmt/testing/query-library/");

    private static final SubLString $str56$_ = makeString("/");

    private static final SubLString $str57$_cyc_top_data_ebmt_testing_query_ = makeString("/cyc/top/data/ebmt/testing/query-library/summary.txt");

    static private final SubLString $str58$_cyc_top_data_ebmt_testing_query_ = makeString("/cyc/top/data/ebmt/testing/query-library/ebmt-training-recall-report");

    private static final SubLString $str59$_cyc_top_data_ebmt_testing_query_ = makeString("/cyc/top/data/ebmt/testing/query-library/ebmt-parsing-results");

    static private final SubLString $str60$_cyc_top_data_ebmt_testing_query_ = makeString("/cyc/top/data/ebmt/testing/query-library/ebmt-accuracy-report");



    private static final SubLString $str62$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/mt/");

    private static final SubLString $str63$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/mt/summary.txt");

    private static final SubLString $str64$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/mt/ebmt-training-recall-report");

    static private final SubLString $str65$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/mt/ebmt-parsing-results");

    static private final SubLString $str66$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/mt/ebmt-accuracy-report");

    private static final SubLObject $const67$EBMTTrainingExamplesForWesternBus = reader_make_constant_shell("EBMTTrainingExamplesForWesternBusinessPracticesMt");

    static private final SubLString $str68$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/file/");

    static private final SubLString $str69$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/file/summary.txt");

    private static final SubLString $str70$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/file/ebmt-training-recall-report");

    static private final SubLString $str71$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/file/ebmt-parsing-results");

    static private final SubLString $str72$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/file/ebmt-accuracy-report");

    static private final SubLString $str73$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/file/testing-input.txt");

    private static final SubLString $str74$_opt_local_pkg_j2sdk1_4_2_bin_jav = makeString("/opt/local/pkg/j2sdk1.4.2/bin/java");

    private static final SubLString $str75$_home_shah_cvs_head_cycorp_cyc_ja = makeString("/home/shah/cvs/head/cycorp/cyc/java/com/cyc/common/cyc-common.jar:/cyc/java/lib/xercesImpl-2.2.1.jar:/cyc/java/lib/lucene-core-1.9.1.jar");

    private static final SubLString $str76$_cp = makeString("-cp");

    private static final SubLString $str77$com_cyc_common_nlp_EBMTTemplateIn = makeString("com.cyc.common.nlp.EBMTTemplateIndexServer");

    private static final SubLString $str78$_i = makeString("-i");

    private static final SubLString $str79$_ebmt_index_ = makeString("/ebmt-index/");

    private static final SubLString $$$EBMT_Template_Index_Server = makeString("EBMT Template Index Server");

    private static final SubLSymbol EBMT_TESTING_SOURCE_P = makeSymbol("EBMT-TESTING-SOURCE-P");

    private static final SubLList $list83 = list(makeSymbol("?NL"), makeSymbol("?CYCL"));

    private static final SubLList $list84 = list(reader_make_constant_shell("thereExists"), makeSymbol("?QUOTEDCYCL"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("ebmtNLToCycLTrainingExample"), makeSymbol("?NL"), makeSymbol("?QUOTEDCYCL")), list(reader_make_constant_shell("means"), makeSymbol("?QUOTEDCYCL"), makeSymbol("?CYCL"))));

    private static final SubLString $$$localhost = makeString("localhost");

    private static final SubLString $str87$_ebmt_index_txt = makeString("/ebmt-index.txt");

    private static final SubLString $str88$_ebmt_index_log = makeString("/ebmt-index.log");

    private static final SubLString $$$Processing_EBMT_data_from_ = makeString("Processing EBMT data from ");

    private static final SubLString $str90$____ = makeString(" ...");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLList $list92 = list(makeSymbol("NL"), makeSymbol("CYCL"));

    private static final SubLString $$$Added = makeString("Added");

    private static final SubLString $str96$Unexpected_type_of_EBMT_template_ = makeString("Unexpected type of EBMT template: ~S~%");

    private static final SubLString $$$Already_indexed = makeString("Already indexed");

    private static final SubLString $str98$Unexpected_indexing_result_of_EBM = makeString("Unexpected indexing-result of EBMT template: ~s");

    private static final SubLString $str99$_S__ = makeString("~S~%");



    private static final SubLString $str105$Summarizing_EBMT_training_details = makeString("Summarizing EBMT training details ...");

    private static final SubLSymbol $TRAINING_INPUT_MT = makeKeyword("TRAINING-INPUT-MT");

    private static final SubLSymbol $USER_TRAINING_EXAMPLES = makeKeyword("USER-TRAINING-EXAMPLES");

    private static final SubLSymbol $GENERAL_TEMPLATES_PC = makeKeyword("GENERAL-TEMPLATES-PC");

    private static final SubLSymbol $SPECIFIC_TEMPLATES_PC = makeKeyword("SPECIFIC-TEMPLATES-PC");

    private static final SubLSymbol $NO_TEMPLATES_PC = makeKeyword("NO-TEMPLATES-PC");

    private static final SubLSymbol $DUPLICATE_TEMPLATES_PC = makeKeyword("DUPLICATE-TEMPLATES-PC");

    private static final SubLSymbol $TOTAL_TRAINING_TIME = makeKeyword("TOTAL-TRAINING-TIME");

    private static final SubLSymbol $MIN_TRAINING_TIME = makeKeyword("MIN-TRAINING-TIME");

    private static final SubLSymbol $MAX_TRAINING_TIME = makeKeyword("MAX-TRAINING-TIME");

    private static final SubLList $list120 = list(makeSymbol("NL"), makeSymbol("CYCL"), makeSymbol("NUM-INTERPS-PER-EXAMPLE"), makeSymbol("TEST-RESULT"), makeSymbol("TIME-TAKEN"), makeSymbol("MATCH-LIST"), makeSymbol("PARSED-CYCLS"), makeSymbol("WEIGHTS"));

    private static final SubLString $str123$Unexpected_EBMT_result__s = makeString("Unexpected EBMT result ~s");

    private static final SubLList $list124 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));

    private static final SubLSymbol $TESTING_INPUT_SOURCE = makeKeyword("TESTING-INPUT-SOURCE");

    private static final SubLSymbol $SUCCESSFUL_TESTS_PC = makeKeyword("SUCCESSFUL-TESTS-PC");

    private static final SubLSymbol $ALMOST_SUCCESSFUL_TESTS = makeKeyword("ALMOST-SUCCESSFUL-TESTS");

    private static final SubLSymbol $ALMOST_SUCCESSFUL_TESTS_PC = makeKeyword("ALMOST-SUCCESSFUL-TESTS-PC");

    private static final SubLSymbol $UNKNOWN_TESTS_PC = makeKeyword("UNKNOWN-TESTS-PC");

    private static final SubLSymbol $FAILED_TESTS_PC = makeKeyword("FAILED-TESTS-PC");

    private static final SubLSymbol $TOTAL_UNIQUE_INTERPS = makeKeyword("TOTAL-UNIQUE-INTERPS");

    private static final SubLSymbol $MAX_INTERPS_PER_EXAMPLE = makeKeyword("MAX-INTERPS-PER-EXAMPLE");

    private static final SubLSymbol $MEAN_INTERPS_PER_EXAMPLE = makeKeyword("MEAN-INTERPS-PER-EXAMPLE");

    private static final SubLSymbol $MEDIAN_INTERPS_PER_EXAMPLE = makeKeyword("MEDIAN-INTERPS-PER-EXAMPLE");

    private static final SubLSymbol $TOTAL_TESTING_TIME = makeKeyword("TOTAL-TESTING-TIME");

    private static final SubLSymbol $TOTAL_SUCCESSFUL_TIME = makeKeyword("TOTAL-SUCCESSFUL-TIME");

    private static final SubLSymbol $TOTAL_ALMOST_SUCCESSFUL_TIME = makeKeyword("TOTAL-ALMOST-SUCCESSFUL-TIME");

    private static final SubLSymbol $TOTAL_UNKNOWN_TIME = makeKeyword("TOTAL-UNKNOWN-TIME");

    private static final SubLSymbol $TOTAL_FAILED_TIME = makeKeyword("TOTAL-FAILED-TIME");

    private static final SubLSymbol $MAX_TIME_PER_EXAMPLE = makeKeyword("MAX-TIME-PER-EXAMPLE");

    private static final SubLSymbol $MEAN_TIME_PER_EXAMPLE = makeKeyword("MEAN-TIME-PER-EXAMPLE");

    private static final SubLSymbol $MEDIAN_TIME_PER_EXAMPLE = makeKeyword("MEDIAN-TIME-PER-EXAMPLE");

    private static final SubLString $str157$summary_txt = makeString("summary.txt");

    private static final SubLString $str158$summary_plist_lisp = makeString("summary-plist.lisp");

    private static final SubLString $str159$_s__ = makeString("~s~%");

    private static final SubLSymbol GET_EBMT_PLOT_VALUE = makeSymbol("GET-EBMT-PLOT-VALUE");

    private static final SubLSymbol $RAW_DATA_TYPES = makeKeyword("RAW-DATA-TYPES");

    private static final SubLSymbol $COMPUTED_DATA_TYPES = makeKeyword("COMPUTED-DATA-TYPES");

    private static final SubLList $list165 = list(makeKeyword("XLABEL"), makeString("Cyc KB\\nDate"), makeKeyword("YORIGIN"), ZERO_INTEGER);

    private static final SubLList $list166 = list(makeKeyword("XLABEL"), makeKeyword("YLABEL"), makeKeyword("PLOT-TITLE"), makeKeyword("YORIGIN"), $YMAX, makeKeyword("KEY-LOCATION"), makeKeyword("KEY-JUSTIFY"));

    static private final SubLList $list168 = list(makeSymbol("LINE-LABEL"), makeSymbol("FORMULA"));

    private static final SubLString $str171$_n = makeString("\\n");

    private static final SubLList $list173 = list(makeSymbol("KEYWORD"), makeSymbol("FORMULA"));

    private static final SubLList $list174 = list(makeKeyword("YLABEL"), makeString("% of training examples"), makeKeyword("PLOT-TITLE"), list(makeString("EBMT Training Recall")), makeKeyword("COMPUTED-DATA-TYPES"), list(makeKeyword("FAILED-EXAMPLE-PERCENTAGE"), list(makeString("no templates"), makeKeyword("NO-TEMPLATES-PC")), makeKeyword("DUPLICATES"), list(makeString("duplicate templates"), makeKeyword("DUPLICATE-TEMPLATES-PC")), makeKeyword("SPECIFIC-TEMPLATE-RECALL"), list(makeString("non-generalized templates"), makeKeyword("SPECIFIC-TEMPLATES-PC")), makeKeyword("GENERAL-TEMPLATE-RECALL"), list(makeString("generalized, unique templates"), makeKeyword("GENERAL-TEMPLATES-PC"))));

    static private final SubLList $list175 = list(makeKeyword("YLABEL"), makeString("Time (seconds)"), makeKeyword("PLOT-TITLE"), list(makeString("EBMT Parsing Times")), makeKeyword("RAW-DATA-TYPES"), list(makeKeyword("MEAN-TIME-PER-EXAMPLE"), makeString("Mean Time per Sentence"), makeKeyword("MEDIAN-TIME-PER-EXAMPLE"), makeString("Median Time per Sentence")));

    static private final SubLList $list176 = list(makeKeyword("PLOT-TITLE"), makeString("EBMT Parsing Accuracy"), makeKeyword("YLABEL"), makeString("Value (in %)"), $YMAX, makeInteger(100), makeKeyword("COMPUTED-DATA-TYPES"), list(makeKeyword("PRECISION"), list(makeString("Precision"), list(makeSymbol("PERCENT"), makeKeyword("SUCCESSFUL-TESTS"), makeKeyword("TOTAL-UNIQUE-INTERPS"))), makeKeyword("SUCCESSFUL-TESTS-PC"), list(makeString("Recall"), makeKeyword("SUCCESSFUL-TESTS-PC"))));

    static private final SubLList $list177 = list(makeKeyword("PLOT-TITLE"), makeString("EBMT Parsing Results"), makeKeyword("YLABEL"), makeString("% of tests"), $YMAX, makeInteger(100), makeKeyword("COMPUTED-DATA-TYPES"), list(makeKeyword("FAILED"), list(makeString("Failed"), makeKeyword("FAILED-TESTS-PC")), makeKeyword("UNKNOWN"), list(makeString("Unknown"), makeKeyword("UNKNOWN-TESTS-PC")), makeKeyword("ALMOST-SUCCESSFUL"), list(makeString("Almost Successful"), makeKeyword("ALMOST-SUCCESSFUL-TESTS-PC")), makeKeyword("SUCCESSFUL"), list(makeString("Successful"), makeKeyword("SUCCESSFUL-TESTS-PC"))));

    private static final SubLSymbol $EBMT_GRAPHS_UPDATED = makeKeyword("EBMT-GRAPHS-UPDATED");

    /**
     * Starts an os-process for Lucene and binds EBMT dynamic vars to values computed from TEST-DIR.
     */
    @LispMethod(comment = "Starts an os-process for Lucene and binds EBMT dynamic vars to values computed from TEST-DIR.")
    public static final SubLObject with_standard_ebmt_testing_state_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject test_dir = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            test_dir = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject test_dir_var = $sym7$TEST_DIR_VAR;
                SubLObject os_process = $sym8$OS_PROCESS;
                return list(CLET, list(list(test_dir_var, test_dir)), list(CLET, list($list_alt10, list($ebmt_index_content$, list(FORMAT_NIL, $str_alt13$_A_ebmt_index_txt, test_dir_var)), list($ebmt_index_log$, list(FORMAT_NIL, $str_alt15$_A_ebmt_index_log, test_dir_var))), list(CLET, list(list(os_process, list(EBMT_INDEX_SERVER_PROCESS, test_dir_var))), bq_cons(WITHOUT_PRETTY_PRINTING, append(body, NIL)), list(KILL_OS_PROCESS, os_process))));
            }
        }
    }

    /**
     * Starts an os-process for Lucene and binds EBMT dynamic vars to values computed from TEST-DIR.
     */
    @LispMethod(comment = "Starts an os-process for Lucene and binds EBMT dynamic vars to values computed from TEST-DIR.")
    public static SubLObject with_standard_ebmt_testing_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject test_dir = NIL;
        destructuring_bind_must_consp(current, datum, $list6);
        test_dir = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject test_dir_var = $sym7$TEST_DIR_VAR;
        final SubLObject os_process = $sym8$OS_PROCESS;
        return list(CLET, list(list(test_dir_var, test_dir)), list(CLET, list($list10, list($ebmt_index_content$, list(FORMAT_NIL, $str13$_A_ebmt_index_txt, test_dir_var)), list($ebmt_index_log$, list(FORMAT_NIL, $str15$_A_ebmt_index_log, test_dir_var))), list(CLET, list(list(os_process, list(EBMT_INDEX_SERVER_PROCESS, test_dir_var))), bq_cons(WITHOUT_PRETTY_PRINTING, append(body, NIL)), list(KILL_OS_PROCESS, os_process))));
    }

    public static final SubLObject do_ebmt_nl_cycl_pairs_from_source_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt19);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject nl = NIL;
                    SubLObject cycl = NIL;
                    SubLObject source = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt19);
                    nl = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt19);
                    cycl = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt19);
                    source = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt19);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt19);
                            if (NIL == member(current_1, $list_alt20, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt19);
                        }
                        {
                            SubLObject every_nth_tail = property_list_member($EVERY_NTH, current);
                            SubLObject every_nth = (NIL != every_nth_tail) ? ((SubLObject) (cadr(every_nth_tail))) : ONE_INTEGER;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject pair = $sym23$PAIR;
                                SubLObject source_var = $sym24$SOURCE_VAR;
                                return list(CLET, list(list(source_var, source)), list(PROGRESS_CDOLIST, list(pair, list(EBMT_NL_CYCL_PAIRS_FROM_SOURCE, source_var, every_nth), list(FORMAT_NIL, $str_alt27$Processing_EBMT_data_from__a____, source_var)), listS(CDESTRUCTURING_BIND, list(nl, cycl), pair, append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_ebmt_nl_cycl_pairs_from_source(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list19);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject nl = NIL;
        SubLObject cycl = NIL;
        SubLObject source = NIL;
        destructuring_bind_must_consp(current, datum, $list19);
        nl = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list19);
        cycl = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list19);
        source = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list19);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list19);
            if (NIL == member(current_$1, $list20, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list19);
        }
        final SubLObject every_nth_tail = property_list_member($EVERY_NTH, current);
        final SubLObject every_nth = (NIL != every_nth_tail) ? cadr(every_nth_tail) : ONE_INTEGER;
        final SubLObject body;
        current = body = temp;
        final SubLObject pair = $sym23$PAIR;
        final SubLObject source_var = $sym24$SOURCE_VAR;
        return list(CLET, list(list(source_var, source)), list(PROGRESS_CDOLIST, list(pair, list(EBMT_NL_CYCL_PAIRS_FROM_SOURCE, source_var, every_nth), list(FORMAT_NIL, $str27$Processing_EBMT_data_from__a____, source_var)), listS(CDESTRUCTURING_BIND, list(nl, cycl), pair, append(body, NIL))));
    }

    public static final SubLObject ebmt_do_testing_output_data_from_file_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt29);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject nl = NIL;
                    SubLObject cycl = NIL;
                    SubLObject num_interps_per_example = NIL;
                    SubLObject test_result = NIL;
                    SubLObject time_taken = NIL;
                    SubLObject match_list = NIL;
                    SubLObject parsed_cycls = NIL;
                    SubLObject weights = NIL;
                    SubLObject testing_output_file = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    nl = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    cycl = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    num_interps_per_example = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    test_result = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    time_taken = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    match_list = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    parsed_cycls = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    weights = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt29);
                    testing_output_file = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject line = $sym30$LINE;
                            SubLObject datum_2 = $sym31$DATUM;
                            return list(DO_FILE_LINES, list(line, testing_output_file), list(CLET, list(list(datum_2, listS(READ_FROM_STRING_IGNORING_ERRORS, line, $list_alt34))), list(PIF, list(CNOT, list(EBMT_TESTING_OUTPUT_DATUM_P, datum_2)), list(WARN, $str_alt39$Got_a_malformed_EBMT_testing_outp, line), listS(CDESTRUCTURING_BIND, list(nl, cycl, num_interps_per_example, test_result, time_taken, match_list, parsed_cycls, weights), datum_2, append(body, NIL)))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt29);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject ebmt_do_testing_output_data_from_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject nl = NIL;
        SubLObject cycl = NIL;
        SubLObject num_interps_per_example = NIL;
        SubLObject test_result = NIL;
        SubLObject time_taken = NIL;
        SubLObject match_list = NIL;
        SubLObject parsed_cycls = NIL;
        SubLObject weights = NIL;
        SubLObject testing_output_file = NIL;
        destructuring_bind_must_consp(current, datum, $list29);
        nl = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        cycl = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        num_interps_per_example = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        test_result = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        time_taken = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        match_list = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        parsed_cycls = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        weights = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        testing_output_file = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject line = $sym30$LINE;
            final SubLObject datum_$2 = $sym31$DATUM;
            return list(DO_FILE_LINES, list(line, testing_output_file), list(CLET, list(list(datum_$2, listS(READ_FROM_STRING_IGNORING_ERRORS, line, $list34))), list(PIF, list(CNOT, list(EBMT_TESTING_OUTPUT_DATUM_P, datum_$2)), list(WARN, $str39$Got_a_malformed_EBMT_testing_outp, line), listS(CDESTRUCTURING_BIND, list(nl, cycl, num_interps_per_example, test_result, time_taken, match_list, parsed_cycls, weights), datum_$2, append(body, NIL)))));
        }
        cdestructuring_bind_error(datum, $list29);
        return NIL;
    }

    /**
     * Compares the actual output with the target output, and is mainly used in
     * test-case-tables.
     *
     * @param ACTUAL-ANS;
     * 		the actual output of the function being tested
     * @param EXPECTED-ANS;
     * 		the target/desired output for the function being tested
     * @return booleanp.
     */
    @LispMethod(comment = "Compares the actual output with the target output, and is mainly used in\r\ntest-case-tables.\r\n\r\n@param ACTUAL-ANS;\r\n\t\tthe actual output of the function being tested\r\n@param EXPECTED-ANS;\r\n\t\tthe target/desired output for the function being tested\r\n@return booleanp.\nCompares the actual output with the target output, and is mainly used in\ntest-case-tables.")
    public static final SubLObject ebmt_test_func_alt(SubLObject actual_ans, SubLObject expected_ans) {
        return subl_promotions.memberP(expected_ans, actual_ans, $sym49$EQUALS_EL_, UNPROVIDED);
    }

    /**
     * Compares the actual output with the target output, and is mainly used in
     * test-case-tables.
     *
     * @param ACTUAL-ANS;
     * 		the actual output of the function being tested
     * @param EXPECTED-ANS;
     * 		the target/desired output for the function being tested
     * @return booleanp.
     */
    @LispMethod(comment = "Compares the actual output with the target output, and is mainly used in\r\ntest-case-tables.\r\n\r\n@param ACTUAL-ANS;\r\n\t\tthe actual output of the function being tested\r\n@param EXPECTED-ANS;\r\n\t\tthe target/desired output for the function being tested\r\n@return booleanp.\nCompares the actual output with the target output, and is mainly used in\ntest-case-tables.")
    public static SubLObject ebmt_test_func(final SubLObject actual_ans, final SubLObject expected_ans) {
        return subl_promotions.memberP(expected_ans, actual_ans, $sym48$EQUALS_EL_, UNPROVIDED);
    }

    /**
     * This function completes the training and parsing tests for EBMT, using the KB
     * for both testing and training examples.  The detailed results are stored in
     * TEST-DIR/*ebmt-training-output-filename* and
     * TEST-DIR/*ebmt-testing-output-filename*. The summary of the test-run is
     * written out to F-SUMMARY, if it is non-NIL, or else to TEST-DIR/summary.txt.
     * If TEST-DIR does not already exist, then this function creates it, and the
     * necessary input files are also created. If GLOBAL-SUMMARY? is non-NIL, the
     * summary information will be added to the *EBMT-GLOBAL-SUMMARY-FILE*, too.
     *
     * @param TRAINING-EVERY-NTH
     * 		integerp; If greater than 1, will only use every
     * 		nth example for training. Useful to get a quicker turnaround time.
     * @param TESTING-EVERY-NTH
     * 		integerp; If greater than 1, will only use every nth
     * 		string or example for testing. Useful to get a quicker turnaround time.
     * @param UPDATE-GRAPHS?
     * 		booleanp; if UPDATE-GRAPHS? is non-NIL, the
     * 		EBMT-GRAPHS* will be updated.
     * @unknown if you get an exception of the form
    Exception in thread "main" java.net.BindException: Address already in use
    at java.net.PlainSocketImpl.socketBind(Native Method)
    at java.net.PlainSocketImpl.bind(PlainSocketImpl.java:331)
    at java.net.ServerSocket.bind(ServerSocket.java:318)
    at java.net.ServerSocket.<init>(ServerSocket.java:185)
    at java.net.ServerSocket.<init>(ServerSocket.java:97)
    at com.cyc.common.nlp.EBMTTemplateIndexServer.main(EBMTTemplateIndexServer.java:382)
    it means you need to kill the already-existing Lucene process.
     */
    @LispMethod(comment = "This function completes the training and parsing tests for EBMT, using the KB\r\nfor both testing and training examples.  The detailed results are stored in\r\nTEST-DIR/*ebmt-training-output-filename* and\r\nTEST-DIR/*ebmt-testing-output-filename*. The summary of the test-run is\r\nwritten out to F-SUMMARY, if it is non-NIL, or else to TEST-DIR/summary.txt.\r\nIf TEST-DIR does not already exist, then this function creates it, and the\r\nnecessary input files are also created. If GLOBAL-SUMMARY? is non-NIL, the\r\nsummary information will be added to the *EBMT-GLOBAL-SUMMARY-FILE*, too.\r\n\r\n@param TRAINING-EVERY-NTH\r\n\t\tintegerp; If greater than 1, will only use every\r\n\t\tnth example for training. Useful to get a quicker turnaround time.\r\n@param TESTING-EVERY-NTH\r\n\t\tintegerp; If greater than 1, will only use every nth\r\n\t\tstring or example for testing. Useful to get a quicker turnaround time.\r\n@param UPDATE-GRAPHS?\r\n\t\tbooleanp; if UPDATE-GRAPHS? is non-NIL, the\r\n\t\tEBMT-GRAPHS* will be updated.\r\n@unknown if you get an exception of the form\r\nException in thread \"main\" java.net.BindException: Address already in use\r\nat java.net.PlainSocketImpl.socketBind(Native Method)\r\nat java.net.PlainSocketImpl.bind(PlainSocketImpl.java:331)\r\nat java.net.ServerSocket.bind(ServerSocket.java:318)\r\nat java.net.ServerSocket.<init>(ServerSocket.java:185)\r\nat java.net.ServerSocket.<init>(ServerSocket.java:97)\r\nat com.cyc.common.nlp.EBMTTemplateIndexServer.main(EBMTTemplateIndexServer.java:382)\r\nit means you need to kill the already-existing Lucene process.\nThis function completes the training and parsing tests for EBMT, using the KB\nfor both testing and training examples.  The detailed results are stored in\nTEST-DIR/*ebmt-training-output-filename* and\nTEST-DIR/*ebmt-testing-output-filename*. The summary of the test-run is\nwritten out to F-SUMMARY, if it is non-NIL, or else to TEST-DIR/summary.txt.\nIf TEST-DIR does not already exist, then this function creates it, and the\nnecessary input files are also created. If GLOBAL-SUMMARY? is non-NIL, the\nsummary information will be added to the *EBMT-GLOBAL-SUMMARY-FILE*, too.")
    public static final SubLObject ebmt_test_loop_single_corpus_alt(SubLObject test_dir, SubLObject training_mt, SubLObject testing_source, SubLObject training_every_nth, SubLObject testing_every_nth, SubLObject global_summaryP, SubLObject update_graphsP, SubLObject f_summary, SubLObject verboseP) {
        if (training_every_nth == UNPROVIDED) {
            training_every_nth = ONE_INTEGER;
        }
        if (testing_every_nth == UNPROVIDED) {
            testing_every_nth = ONE_INTEGER;
        }
        if (global_summaryP == UNPROVIDED) {
            global_summaryP = NIL;
        }
        if (update_graphsP == UNPROVIDED) {
            update_graphsP = NIL;
        }
        if (f_summary == UNPROVIDED) {
            f_summary = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Filesys.directory_p(test_dir)) {
                Filesys.make_directory(test_dir, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(cconcatenate(format_nil.format_nil_a_no_copy(test_dir), $str_alt55$_error_output_txt), $OUTPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt57$Unable_to_open__S, cconcatenate(format_nil.format_nil_a_no_copy(test_dir), $str_alt55$_error_output_txt));
                    }
                    {
                        SubLObject s_out = stream;
                        {
                            SubLObject _prev_bind_0 = StreamsLow.$error_output$.currentBinding(thread);
                            try {
                                StreamsLow.$error_output$.bind(s_out, thread);
                                com.cyc.cycjava.cycl.ebmt_tests.ebmt_test_index_creation(test_dir, training_mt, training_every_nth, verboseP);
                                com.cyc.cycjava.cycl.ebmt_tests.ebmt_test_parsing_with_index(test_dir, testing_source, testing_every_nth);
                            } finally {
                                StreamsLow.$error_output$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            if (testing_source.isString()) {
                com.cyc.cycjava.cycl.ebmt_tests.ebmt_prepare_testing_output_for_scoring(test_dir);
                com.cyc.cycjava.cycl.ebmt_tests.ebmt_score_lines_file_automatically(test_dir);
                com.cyc.cycjava.cycl.ebmt_tests.ebmt_score_testing_output(test_dir);
                f_summary = com.cyc.cycjava.cycl.ebmt_tests.ebmt_create_summary(test_dir, training_mt, testing_source, global_summaryP, f_summary, $ebmt_scored_data_filename$.getGlobalValue());
            } else {
                f_summary = com.cyc.cycjava.cycl.ebmt_tests.ebmt_create_summary(test_dir, training_mt, testing_source, global_summaryP, f_summary, UNPROVIDED);
            }
            if (NIL != update_graphsP) {
                com.cyc.cycjava.cycl.ebmt_tests.ebmt_update_evaluation_graphs();
            }
            return f_summary;
        }
    }

    /**
     * This function completes the training and parsing tests for EBMT, using the KB
     * for both testing and training examples.  The detailed results are stored in
     * TEST-DIR/*ebmt-training-output-filename* and
     * TEST-DIR/*ebmt-testing-output-filename*. The summary of the test-run is
     * written out to F-SUMMARY, if it is non-NIL, or else to TEST-DIR/summary.txt.
     * If TEST-DIR does not already exist, then this function creates it, and the
     * necessary input files are also created. If GLOBAL-SUMMARY? is non-NIL, the
     * summary information will be added to the *EBMT-GLOBAL-SUMMARY-FILE*, too.
     *
     * @param TRAINING-EVERY-NTH
     * 		integerp; If greater than 1, will only use every
     * 		nth example for training. Useful to get a quicker turnaround time.
     * @param TESTING-EVERY-NTH
     * 		integerp; If greater than 1, will only use every nth
     * 		string or example for testing. Useful to get a quicker turnaround time.
     * @param UPDATE-GRAPHS?
     * 		booleanp; if UPDATE-GRAPHS? is non-NIL, the
     * 		EBMT-GRAPHS* will be updated.
     * @unknown if you get an exception of the form
    Exception in thread "main" java.net.BindException: Address already in use
    at java.net.PlainSocketImpl.socketBind(Native Method)
    at java.net.PlainSocketImpl.bind(PlainSocketImpl.java:331)
    at java.net.ServerSocket.bind(ServerSocket.java:318)
    at java.net.ServerSocket.<init>(ServerSocket.java:185)
    at java.net.ServerSocket.<init>(ServerSocket.java:97)
    at com.cyc.common.nlp.EBMTTemplateIndexServer.main(EBMTTemplateIndexServer.java:382)
    it means you need to kill the already-existing Lucene process.
     */
    @LispMethod(comment = "This function completes the training and parsing tests for EBMT, using the KB\r\nfor both testing and training examples.  The detailed results are stored in\r\nTEST-DIR/*ebmt-training-output-filename* and\r\nTEST-DIR/*ebmt-testing-output-filename*. The summary of the test-run is\r\nwritten out to F-SUMMARY, if it is non-NIL, or else to TEST-DIR/summary.txt.\r\nIf TEST-DIR does not already exist, then this function creates it, and the\r\nnecessary input files are also created. If GLOBAL-SUMMARY? is non-NIL, the\r\nsummary information will be added to the *EBMT-GLOBAL-SUMMARY-FILE*, too.\r\n\r\n@param TRAINING-EVERY-NTH\r\n\t\tintegerp; If greater than 1, will only use every\r\n\t\tnth example for training. Useful to get a quicker turnaround time.\r\n@param TESTING-EVERY-NTH\r\n\t\tintegerp; If greater than 1, will only use every nth\r\n\t\tstring or example for testing. Useful to get a quicker turnaround time.\r\n@param UPDATE-GRAPHS?\r\n\t\tbooleanp; if UPDATE-GRAPHS? is non-NIL, the\r\n\t\tEBMT-GRAPHS* will be updated.\r\n@unknown if you get an exception of the form\r\nException in thread \"main\" java.net.BindException: Address already in use\r\nat java.net.PlainSocketImpl.socketBind(Native Method)\r\nat java.net.PlainSocketImpl.bind(PlainSocketImpl.java:331)\r\nat java.net.ServerSocket.bind(ServerSocket.java:318)\r\nat java.net.ServerSocket.<init>(ServerSocket.java:185)\r\nat java.net.ServerSocket.<init>(ServerSocket.java:97)\r\nat com.cyc.common.nlp.EBMTTemplateIndexServer.main(EBMTTemplateIndexServer.java:382)\r\nit means you need to kill the already-existing Lucene process.\nThis function completes the training and parsing tests for EBMT, using the KB\nfor both testing and training examples.  The detailed results are stored in\nTEST-DIR/*ebmt-training-output-filename* and\nTEST-DIR/*ebmt-testing-output-filename*. The summary of the test-run is\nwritten out to F-SUMMARY, if it is non-NIL, or else to TEST-DIR/summary.txt.\nIf TEST-DIR does not already exist, then this function creates it, and the\nnecessary input files are also created. If GLOBAL-SUMMARY? is non-NIL, the\nsummary information will be added to the *EBMT-GLOBAL-SUMMARY-FILE*, too.")
    public static SubLObject ebmt_test_loop_single_corpus(final SubLObject test_dir, final SubLObject training_mt, final SubLObject testing_source, SubLObject training_every_nth, SubLObject testing_every_nth, SubLObject global_summaryP, SubLObject update_graphsP, SubLObject f_summary, SubLObject verboseP) {
        if (training_every_nth == UNPROVIDED) {
            training_every_nth = ONE_INTEGER;
        }
        if (testing_every_nth == UNPROVIDED) {
            testing_every_nth = ONE_INTEGER;
        }
        if (global_summaryP == UNPROVIDED) {
            global_summaryP = NIL;
        }
        if (update_graphsP == UNPROVIDED) {
            update_graphsP = NIL;
        }
        if (f_summary == UNPROVIDED) {
            f_summary = NIL;
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Filesys.directory_p(test_dir)) {
            Filesys.make_directory(test_dir, UNPROVIDED, UNPROVIDED);
        }
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(cconcatenate(format_nil.format_nil_a_no_copy(test_dir), $str52$_error_output_txt), $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str54$Unable_to_open__S, cconcatenate(format_nil.format_nil_a_no_copy(test_dir), $str52$_error_output_txt));
            }
            final SubLObject s_out = stream;
            final SubLObject _prev_bind_0 = StreamsLow.$error_output$.currentBinding(thread);
            try {
                StreamsLow.$error_output$.bind(s_out, thread);
                ebmt_test_index_creation(test_dir, training_mt, training_every_nth, verboseP);
                ebmt_test_parsing_with_index(test_dir, testing_source, testing_every_nth);
            } finally {
                StreamsLow.$error_output$.rebind(_prev_bind_0, thread);
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
        if (testing_source.isString()) {
            f_summary = ebmt_create_summary(test_dir, training_mt, testing_source, global_summaryP, f_summary, $ebmt_scored_data_filename$.getGlobalValue());
        } else {
            f_summary = ebmt_create_summary(test_dir, training_mt, testing_source, global_summaryP, f_summary, UNPROVIDED);
        }
        return f_summary;
    }

    /**
     * This function executes the EBMT evaluation run for the examples in
     * #$EBMTTrainingExamplesFromQLMt.  The results are added to a global summary
     * file and the corresponding graphs are also updated.
     */
    @LispMethod(comment = "This function executes the EBMT evaluation run for the examples in\r\n#$EBMTTrainingExamplesFromQLMt.  The results are added to a global summary\r\nfile and the corresponding graphs are also updated.\nThis function executes the EBMT evaluation run for the examples in\n#$EBMTTrainingExamplesFromQLMt.  The results are added to a global summary\nfile and the corresponding graphs are also updated.")
    public static final SubLObject ebmt_evaluation_ql_mt_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject test_dir = cconcatenate($str_alt58$_cyc_top_data_ebmt_testing_query_, new SubLObject[]{ format_nil.format_nil_a_no_copy(numeric_date_utilities.universal_timestring(UNPROVIDED)), $str_alt59$_ });
                {
                    SubLObject _prev_bind_0 = $ebmt_global_summary_file$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $ebmt_training_recall_graph$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $ebmt_parsing_results_graph$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $ebmt_accuracy_graph$.currentBinding(thread);
                    try {
                        $ebmt_global_summary_file$.bind($str_alt60$_cyc_top_data_ebmt_testing_query_, thread);
                        $ebmt_training_recall_graph$.bind($str_alt61$_cyc_top_data_ebmt_testing_query_, thread);
                        $ebmt_parsing_results_graph$.bind($str_alt62$_cyc_top_data_ebmt_testing_query_, thread);
                        $ebmt_accuracy_graph$.bind($str_alt63$_cyc_top_data_ebmt_testing_query_, thread);
                        com.cyc.cycjava.cycl.ebmt_tests.ebmt_test_loop_single_corpus(test_dir, $$EBMTTrainingExamplesFromQLMt, $$EBMTTrainingExamplesFromQLMt, ONE_INTEGER, ONE_INTEGER, T, T, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $ebmt_accuracy_graph$.rebind(_prev_bind_3, thread);
                        $ebmt_parsing_results_graph$.rebind(_prev_bind_2, thread);
                        $ebmt_training_recall_graph$.rebind(_prev_bind_1, thread);
                        $ebmt_global_summary_file$.rebind(_prev_bind_0, thread);
                    }
                }
                return test_dir;
            }
        }
    }

    /**
     * This function executes the EBMT evaluation run for the examples in
     * #$EBMTTrainingExamplesFromQLMt.  The results are added to a global summary
     * file and the corresponding graphs are also updated.
     */
    @LispMethod(comment = "This function executes the EBMT evaluation run for the examples in\r\n#$EBMTTrainingExamplesFromQLMt.  The results are added to a global summary\r\nfile and the corresponding graphs are also updated.\nThis function executes the EBMT evaluation run for the examples in\n#$EBMTTrainingExamplesFromQLMt.  The results are added to a global summary\nfile and the corresponding graphs are also updated.")
    public static SubLObject ebmt_evaluation_ql_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_dir = cconcatenate($str55$_cyc_top_data_ebmt_testing_query_, new SubLObject[]{ format_nil.format_nil_a_no_copy(numeric_date_utilities.universal_timestring(UNPROVIDED)), $str56$_ });
        final SubLObject _prev_bind_0 = $ebmt_global_summary_file$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $ebmt_training_recall_graph$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $ebmt_parsing_results_graph$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $ebmt_accuracy_graph$.currentBinding(thread);
        try {
            $ebmt_global_summary_file$.bind($str57$_cyc_top_data_ebmt_testing_query_, thread);
            $ebmt_training_recall_graph$.bind($str58$_cyc_top_data_ebmt_testing_query_, thread);
            $ebmt_parsing_results_graph$.bind($str59$_cyc_top_data_ebmt_testing_query_, thread);
            $ebmt_accuracy_graph$.bind($str60$_cyc_top_data_ebmt_testing_query_, thread);
            ebmt_test_loop_single_corpus(test_dir, $$EBMTTrainingExamplesFromQLMt, $$EBMTTrainingExamplesFromQLMt, ONE_INTEGER, ONE_INTEGER, T, T, UNPROVIDED, UNPROVIDED);
        } finally {
            $ebmt_accuracy_graph$.rebind(_prev_bind_4, thread);
            $ebmt_parsing_results_graph$.rebind(_prev_bind_3, thread);
            $ebmt_training_recall_graph$.rebind(_prev_bind_2, thread);
            $ebmt_global_summary_file$.rebind(_prev_bind_0, thread);
        }
        return test_dir;
    }

    /**
     * This function executes the EBMT evaluation run for the examples in
     * #$EBMTTrainingExamplesForWesternBusinessPracticesMt.  The results are added
     * to a global summary file and the corresponding graphs are also updated.
     */
    @LispMethod(comment = "This function executes the EBMT evaluation run for the examples in\r\n#$EBMTTrainingExamplesForWesternBusinessPracticesMt.  The results are added\r\nto a global summary file and the corresponding graphs are also updated.\nThis function executes the EBMT evaluation run for the examples in\n#$EBMTTrainingExamplesForWesternBusinessPracticesMt.  The results are added\nto a global summary file and the corresponding graphs are also updated.")
    public static final SubLObject ebmt_evaluation_financial_mt_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject test_dir = cconcatenate($str_alt65$_cyc_top_data_ebmt_testing_financ, new SubLObject[]{ format_nil.format_nil_a_no_copy(numeric_date_utilities.universal_timestring(UNPROVIDED)), $str_alt59$_ });
                {
                    SubLObject _prev_bind_0 = $ebmt_global_summary_file$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $ebmt_training_recall_graph$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $ebmt_parsing_results_graph$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $ebmt_accuracy_graph$.currentBinding(thread);
                    try {
                        $ebmt_global_summary_file$.bind($str_alt66$_cyc_top_data_ebmt_testing_financ, thread);
                        $ebmt_training_recall_graph$.bind($str_alt67$_cyc_top_data_ebmt_testing_financ, thread);
                        $ebmt_parsing_results_graph$.bind($str_alt68$_cyc_top_data_ebmt_testing_financ, thread);
                        $ebmt_accuracy_graph$.bind($str_alt69$_cyc_top_data_ebmt_testing_financ, thread);
                        com.cyc.cycjava.cycl.ebmt_tests.ebmt_test_loop_single_corpus(test_dir, $const70$EBMTTrainingExamplesForWesternBus, $const70$EBMTTrainingExamplesForWesternBus, ONE_INTEGER, ONE_INTEGER, T, T, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $ebmt_accuracy_graph$.rebind(_prev_bind_3, thread);
                        $ebmt_parsing_results_graph$.rebind(_prev_bind_2, thread);
                        $ebmt_training_recall_graph$.rebind(_prev_bind_1, thread);
                        $ebmt_global_summary_file$.rebind(_prev_bind_0, thread);
                    }
                }
                return test_dir;
            }
        }
    }

    /**
     * This function executes the EBMT evaluation run for the examples in
     * #$EBMTTrainingExamplesForWesternBusinessPracticesMt.  The results are added
     * to a global summary file and the corresponding graphs are also updated.
     */
    @LispMethod(comment = "This function executes the EBMT evaluation run for the examples in\r\n#$EBMTTrainingExamplesForWesternBusinessPracticesMt.  The results are added\r\nto a global summary file and the corresponding graphs are also updated.\nThis function executes the EBMT evaluation run for the examples in\n#$EBMTTrainingExamplesForWesternBusinessPracticesMt.  The results are added\nto a global summary file and the corresponding graphs are also updated.")
    public static SubLObject ebmt_evaluation_financial_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_dir = cconcatenate($str62$_cyc_top_data_ebmt_testing_financ, new SubLObject[]{ format_nil.format_nil_a_no_copy(numeric_date_utilities.universal_timestring(UNPROVIDED)), $str56$_ });
        final SubLObject _prev_bind_0 = $ebmt_global_summary_file$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $ebmt_training_recall_graph$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $ebmt_parsing_results_graph$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $ebmt_accuracy_graph$.currentBinding(thread);
        try {
            $ebmt_global_summary_file$.bind($str63$_cyc_top_data_ebmt_testing_financ, thread);
            $ebmt_training_recall_graph$.bind($str64$_cyc_top_data_ebmt_testing_financ, thread);
            $ebmt_parsing_results_graph$.bind($str65$_cyc_top_data_ebmt_testing_financ, thread);
            $ebmt_accuracy_graph$.bind($str66$_cyc_top_data_ebmt_testing_financ, thread);
            ebmt_test_loop_single_corpus(test_dir, $const67$EBMTTrainingExamplesForWesternBus, $const67$EBMTTrainingExamplesForWesternBus, ONE_INTEGER, ONE_INTEGER, T, T, UNPROVIDED, UNPROVIDED);
        } finally {
            $ebmt_accuracy_graph$.rebind(_prev_bind_4, thread);
            $ebmt_parsing_results_graph$.rebind(_prev_bind_3, thread);
            $ebmt_training_recall_graph$.rebind(_prev_bind_2, thread);
            $ebmt_global_summary_file$.rebind(_prev_bind_0, thread);
        }
        return test_dir;
    }

    /**
     * This function executes the EBMT evaluation run for the training examples in
     * #$EBMTTrainingExamplesForWesternBusinessPracticesMt and test sentences in
     * /cyc/top/data/ebmt/testing/financial/file/testing-input.txt  The results are
     * added to a global summary file and the corresponding graphs are also
     * updated.
     */
    @LispMethod(comment = "This function executes the EBMT evaluation run for the training examples in\r\n#$EBMTTrainingExamplesForWesternBusinessPracticesMt and test sentences in\r\n/cyc/top/data/ebmt/testing/financial/file/testing-input.txt  The results are\r\nadded to a global summary file and the corresponding graphs are also\r\nupdated.\nThis function executes the EBMT evaluation run for the training examples in\n#$EBMTTrainingExamplesForWesternBusinessPracticesMt and test sentences in\n/cyc/top/data/ebmt/testing/financial/file/testing-input.txt  The results are\nadded to a global summary file and the corresponding graphs are also\nupdated.")
    public static final SubLObject ebmt_evaluation_financial_file_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject test_dir = cconcatenate($str_alt71$_cyc_top_data_ebmt_testing_financ, new SubLObject[]{ format_nil.format_nil_a_no_copy(numeric_date_utilities.universal_timestring(UNPROVIDED)), $str_alt59$_ });
                {
                    SubLObject _prev_bind_0 = $ebmt_global_summary_file$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $ebmt_training_recall_graph$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $ebmt_parsing_results_graph$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $ebmt_accuracy_graph$.currentBinding(thread);
                    try {
                        $ebmt_global_summary_file$.bind($str_alt72$_cyc_top_data_ebmt_testing_financ, thread);
                        $ebmt_training_recall_graph$.bind($str_alt73$_cyc_top_data_ebmt_testing_financ, thread);
                        $ebmt_parsing_results_graph$.bind($str_alt74$_cyc_top_data_ebmt_testing_financ, thread);
                        $ebmt_accuracy_graph$.bind($str_alt75$_cyc_top_data_ebmt_testing_financ, thread);
                        com.cyc.cycjava.cycl.ebmt_tests.ebmt_test_loop_single_corpus(test_dir, $const70$EBMTTrainingExamplesForWesternBus, $str_alt76$_cyc_top_data_ebmt_testing_financ, ONE_INTEGER, ONE_INTEGER, T, T, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $ebmt_accuracy_graph$.rebind(_prev_bind_3, thread);
                        $ebmt_parsing_results_graph$.rebind(_prev_bind_2, thread);
                        $ebmt_training_recall_graph$.rebind(_prev_bind_1, thread);
                        $ebmt_global_summary_file$.rebind(_prev_bind_0, thread);
                    }
                }
                return test_dir;
            }
        }
    }

    /**
     * This function executes the EBMT evaluation run for the training examples in
     * #$EBMTTrainingExamplesForWesternBusinessPracticesMt and test sentences in
     * /cyc/top/data/ebmt/testing/financial/file/testing-input.txt  The results are
     * added to a global summary file and the corresponding graphs are also
     * updated.
     */
    @LispMethod(comment = "This function executes the EBMT evaluation run for the training examples in\r\n#$EBMTTrainingExamplesForWesternBusinessPracticesMt and test sentences in\r\n/cyc/top/data/ebmt/testing/financial/file/testing-input.txt  The results are\r\nadded to a global summary file and the corresponding graphs are also\r\nupdated.\nThis function executes the EBMT evaluation run for the training examples in\n#$EBMTTrainingExamplesForWesternBusinessPracticesMt and test sentences in\n/cyc/top/data/ebmt/testing/financial/file/testing-input.txt  The results are\nadded to a global summary file and the corresponding graphs are also\nupdated.")
    public static SubLObject ebmt_evaluation_financial_file() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_dir = cconcatenate($str68$_cyc_top_data_ebmt_testing_financ, new SubLObject[]{ format_nil.format_nil_a_no_copy(numeric_date_utilities.universal_timestring(UNPROVIDED)), $str56$_ });
        final SubLObject _prev_bind_0 = $ebmt_global_summary_file$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $ebmt_training_recall_graph$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $ebmt_parsing_results_graph$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $ebmt_accuracy_graph$.currentBinding(thread);
        try {
            $ebmt_global_summary_file$.bind($str69$_cyc_top_data_ebmt_testing_financ, thread);
            $ebmt_training_recall_graph$.bind($str70$_cyc_top_data_ebmt_testing_financ, thread);
            $ebmt_parsing_results_graph$.bind($str71$_cyc_top_data_ebmt_testing_financ, thread);
            $ebmt_accuracy_graph$.bind($str72$_cyc_top_data_ebmt_testing_financ, thread);
            ebmt_test_loop_single_corpus(test_dir, $const67$EBMTTrainingExamplesForWesternBus, $str73$_cyc_top_data_ebmt_testing_financ, ONE_INTEGER, ONE_INTEGER, T, T, UNPROVIDED, UNPROVIDED);
        } finally {
            $ebmt_accuracy_graph$.rebind(_prev_bind_4, thread);
            $ebmt_parsing_results_graph$.rebind(_prev_bind_3, thread);
            $ebmt_training_recall_graph$.rebind(_prev_bind_2, thread);
            $ebmt_global_summary_file$.rebind(_prev_bind_0, thread);
        }
        return test_dir;
    }

    public static final SubLObject ebmt_possibly_update_keepalive_file_alt() {
        return file_utilities.possibly_update_keepalive_file(com.cyc.cycjava.cycl.ebmt_tests.ebmt_keepalive_filename());
    }

    public static SubLObject ebmt_possibly_update_keepalive_file() {
        return file_utilities.possibly_update_keepalive_file(ebmt_keepalive_filename());
    }

    public static final SubLObject ebmt_keepalive_filename_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != $ebmt_keepalive_enabledP$.getDynamicValue(thread) ? ((SubLObject) (experiment_loop.experiment_loop_keepalive_filename())) : NIL;
        }
    }

    public static SubLObject ebmt_keepalive_filename() {
        return NIL;
    }

    /**
     * Starts an EBMT Template Index Server for an EBMT Template Index inside the
     * directory specified by INDEX-PATH.
     *
     * @param INDEX-PATH
     * 		stringp; pathname of the directory that contains the EBMT
     * 		Index folder.
     * @return OS-PROCESS os-process-p; a pointer to the EBMT Template Index Server
    process.
     */
    @LispMethod(comment = "Starts an EBMT Template Index Server for an EBMT Template Index inside the\r\ndirectory specified by INDEX-PATH.\r\n\r\n@param INDEX-PATH\r\n\t\tstringp; pathname of the directory that contains the EBMT\r\n\t\tIndex folder.\r\n@return OS-PROCESS os-process-p; a pointer to the EBMT Template Index Server\r\nprocess.\nStarts an EBMT Template Index Server for an EBMT Template Index inside the\ndirectory specified by INDEX-PATH.")
    public static final SubLObject ebmt_index_server_process_alt(SubLObject index_path) {
        {
            SubLObject program = $str_alt77$_opt_local_pkg_j2sdk1_4_2_bin_jav;
            SubLObject classpath = $str_alt78$_home_shah_cvs_head_cycorp_cyc_ja;
            SubLObject args = list($str_alt79$_cp, classpath, $str_alt80$com_cyc_common_nlp_EBMTTemplateIn, $str_alt81$_i, cconcatenate(format_nil.format_nil_a_no_copy(index_path), $str_alt82$_ebmt_index_));
            SubLObject os_process = os_process_utilities.make_os_process($$$EBMT_Template_Index_Server, program, args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            sleep(FIVE_INTEGER);
            return os_process;
        }
    }

    /**
     * Starts an EBMT Template Index Server for an EBMT Template Index inside the
     * directory specified by INDEX-PATH.
     *
     * @param INDEX-PATH
     * 		stringp; pathname of the directory that contains the EBMT
     * 		Index folder.
     * @return OS-PROCESS os-process-p; a pointer to the EBMT Template Index Server
    process.
     */
    @LispMethod(comment = "Starts an EBMT Template Index Server for an EBMT Template Index inside the\r\ndirectory specified by INDEX-PATH.\r\n\r\n@param INDEX-PATH\r\n\t\tstringp; pathname of the directory that contains the EBMT\r\n\t\tIndex folder.\r\n@return OS-PROCESS os-process-p; a pointer to the EBMT Template Index Server\r\nprocess.\nStarts an EBMT Template Index Server for an EBMT Template Index inside the\ndirectory specified by INDEX-PATH.")
    public static SubLObject ebmt_index_server_process(final SubLObject index_path) {
        final SubLObject program = $str74$_opt_local_pkg_j2sdk1_4_2_bin_jav;
        final SubLObject classpath = $str75$_home_shah_cvs_head_cycorp_cyc_ja;
        final SubLObject args = list($str76$_cp, classpath, $str77$com_cyc_common_nlp_EBMTTemplateIn, $str78$_i, cconcatenate(format_nil.format_nil_a_no_copy(index_path), $str79$_ebmt_index_));
        final SubLObject os_process = os_process_utilities.make_os_process($$$EBMT_Template_Index_Server, program, args, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        sleep(FIVE_INTEGER);
        return os_process;
    }

    public static final SubLObject ebmt_nl_cycl_pairs_from_source_alt(SubLObject source, SubLObject every_nth) {
        SubLTrampolineFile.checkType(source, EBMT_TESTING_SOURCE_P);
        if (source.isString()) {
            return com.cyc.cycjava.cycl.ebmt_tests.ebmt_nl_cycl_pairs_from_file(source, every_nth);
        } else {
            return com.cyc.cycjava.cycl.ebmt_tests.ebmt_nl_cycl_pairs_from_kb(source, every_nth);
        }
    }

    public static SubLObject ebmt_nl_cycl_pairs_from_source(SubLObject source, final SubLObject every_nth) {
        assert NIL != ebmt_testing_source_p(source) : "! ebmt_tests.ebmt_testing_source_p(source) " + ("ebmt_tests.ebmt_testing_source_p(source) " + "CommonSymbols.NIL != ebmt_tests.ebmt_testing_source_p(source) ") + source;
        if (source.isString()) {
            return ebmt_nl_cycl_pairs_from_file(source, every_nth);
        }
        return ebmt_nl_cycl_pairs_from_kb(source, every_nth);
    }

    public static final SubLObject ebmt_nl_cycl_pairs_from_file_alt(SubLObject file, SubLObject every_nth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pairs = NIL;
                SubLObject file_var = file;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(file_var, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt57$Unable_to_open__S, file_var);
                    }
                    {
                        SubLObject stream_var = stream;
                        if (stream_var.isStream()) {
                            {
                                SubLObject stream_var_3 = stream_var;
                                SubLObject line_number_var = NIL;
                                SubLObject line = NIL;
                                for (line_number_var = ZERO_INTEGER, line = read_line(stream_var_3, NIL, NIL, UNPROVIDED); NIL != line; line_number_var = number_utilities.f_1X(line_number_var) , line = read_line(stream_var_3, NIL, NIL, UNPROVIDED)) {
                                    pairs = cons(list(line, NIL), pairs);
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return list_utilities.every_nth(every_nth, nreverse(pairs));
            }
        }
    }

    public static SubLObject ebmt_nl_cycl_pairs_from_file(final SubLObject file, final SubLObject every_nth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pairs = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str54$Unable_to_open__S, file);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$3 = stream_var;
                SubLObject line_number_var = NIL;
                SubLObject line = NIL;
                line_number_var = ZERO_INTEGER;
                for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$3); NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$3)) {
                    pairs = cons(list(line, NIL), pairs);
                    line_number_var = number_utilities.f_1X(line_number_var);
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
        return list_utilities.every_nth(every_nth, nreverse(pairs));
    }

    public static final SubLObject ebmt_nl_cycl_pairs_from_kb_alt(SubLObject mt, SubLObject every_nth) {
        return list_utilities.every_nth(every_nth, ask_utilities.query_template($list_alt86, $list_alt87, mt, UNPROVIDED));
    }

    public static SubLObject ebmt_nl_cycl_pairs_from_kb(final SubLObject mt, final SubLObject every_nth) {
        return list_utilities.every_nth(every_nth, ask_utilities.query_template($list83, $list84, mt, UNPROVIDED));
    }

    /**
     * This function tests the overall EBMT Template Index creation process.  Given
     * the NL-CycL examples in TRAINING-MT, it creates an EBMT Template Index and
     * records various metrics related to the process in file
     * ebmt-training-output-filename*.
     */
    @LispMethod(comment = "This function tests the overall EBMT Template Index creation process.  Given\r\nthe NL-CycL examples in TRAINING-MT, it creates an EBMT Template Index and\r\nrecords various metrics related to the process in file\r\nebmt-training-output-filename*.\nThis function tests the overall EBMT Template Index creation process.  Given\nthe NL-CycL examples in TRAINING-MT, it creates an EBMT Template Index and\nrecords various metrics related to the process in file\nebmt-training-output-filename*.")
    public static final SubLObject ebmt_test_index_creation_alt(SubLObject test_dir, SubLObject training_mt, SubLObject every_nth, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(test_dir, STRINGP);
            {
                SubLObject f_out = cconcatenate(test_dir, $ebmt_training_output_filename$.getGlobalValue());
                SubLObject test_dir_var = test_dir;
                {
                    SubLObject _prev_bind_0 = lucene_index.$ebmt_index_host$.currentBinding(thread);
                    SubLObject _prev_bind_1 = lucene_index.$ebmt_index_content$.currentBinding(thread);
                    SubLObject _prev_bind_2 = lucene_index.$ebmt_index_log$.currentBinding(thread);
                    try {
                        lucene_index.$ebmt_index_host$.bind($$$localhost, thread);
                        lucene_index.$ebmt_index_content$.bind(cconcatenate(format_nil.format_nil_a_no_copy(test_dir_var), $str_alt90$_ebmt_index_txt), thread);
                        lucene_index.$ebmt_index_log$.bind(cconcatenate(format_nil.format_nil_a_no_copy(test_dir_var), $str_alt91$_ebmt_index_log), thread);
                        {
                            SubLObject os_process = com.cyc.cycjava.cycl.ebmt_tests.ebmt_index_server_process(test_dir_var);
                            {
                                SubLObject _prev_bind_0_4 = $print_pretty$.currentBinding(thread);
                                SubLObject _prev_bind_1_5 = $print_length$.currentBinding(thread);
                                SubLObject _prev_bind_2_6 = $print_level$.currentBinding(thread);
                                try {
                                    $print_pretty$.bind(NIL, thread);
                                    $print_length$.bind(NIL, thread);
                                    $print_level$.bind(NIL, thread);
                                    {
                                        SubLObject stream = NIL;
                                        try {
                                            stream = compatibility.open_text(f_out, $OUTPUT, NIL);
                                            if (!stream.isStream()) {
                                                Errors.error($str_alt57$Unable_to_open__S, f_out);
                                            }
                                            {
                                                SubLObject s_out = stream;
                                                SubLObject source_var = training_mt;
                                                SubLObject list_var = com.cyc.cycjava.cycl.ebmt_tests.ebmt_nl_cycl_pairs_from_source(source_var, every_nth);
                                                $progress_note$.setDynamicValue(cconcatenate($str_alt92$Processing_EBMT_data_from_, new SubLObject[]{ format_nil.format_nil_a_no_copy(source_var), $str_alt93$____ }), thread);
                                                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                                $progress_total$.setDynamicValue(length(list_var), thread);
                                                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                                {
                                                    SubLObject _prev_bind_0_7 = $last_percent_progress_index$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_8 = $last_percent_progress_prediction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_9 = $within_noting_percent_progress$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                                    try {
                                                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                        $last_percent_progress_prediction$.bind(NIL, thread);
                                                        $within_noting_percent_progress$.bind(T, thread);
                                                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                                        {
                                                            SubLObject csome_list_var = list_var;
                                                            SubLObject pair = NIL;
                                                            for (pair = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , pair = csome_list_var.first()) {
                                                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                {
                                                                    SubLObject datum = pair;
                                                                    SubLObject current = datum;
                                                                    SubLObject nl = NIL;
                                                                    SubLObject cycl = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt94);
                                                                    nl = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list_alt94);
                                                                    cycl = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        com.cyc.cycjava.cycl.ebmt_tests.ebmt_possibly_update_keepalive_file();
                                                                        {
                                                                            SubLObject num_general_templates = ZERO_INTEGER;
                                                                            SubLObject num_specific_templates = ZERO_INTEGER;
                                                                            SubLObject num_already_indexed_templates = ZERO_INTEGER;
                                                                            SubLObject num_failed_templates = ZERO_INTEGER;
                                                                            SubLObject templates = NIL;
                                                                            SubLObject nl_cycl_pairs = NIL;
                                                                            SubLObject time_taken = NIL;
                                                                            SubLObject time_var = get_internal_real_time();
                                                                            templates = ebmt_template_parser.ebmt_create_and_add_templates(nl, cycl, ebmt_template_parser.new_ebmt_lexicon(UNPROVIDED), NIL, verboseP);
                                                                            time_taken = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                                            if (NIL == templates) {
                                                                                num_failed_templates = add(num_failed_templates, ONE_INTEGER);
                                                                            }
                                                                            {
                                                                                SubLObject cdolist_list_var = templates;
                                                                                SubLObject template = NIL;
                                                                                for (template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template = cdolist_list_var.first()) {
                                                                                    nl_cycl_pairs = cons(ebmt_template_parser.ebmt_template_nl_cycl_pair(template), nl_cycl_pairs);
                                                                                    {
                                                                                        SubLObject indexing_result = ebmt_template_parser.ebmt_template_indexing_result(template);
                                                                                        if (indexing_result.equal($$$Added)) {
                                                                                            {
                                                                                                SubLObject pcase_var = ebmt_template_parser.ebmt_template_type(template);
                                                                                                if (pcase_var.eql($GENERAL)) {
                                                                                                    num_general_templates = add(num_general_templates, ONE_INTEGER);
                                                                                                } else {
                                                                                                    if (pcase_var.eql($SPECIFIC)) {
                                                                                                        num_specific_templates = add(num_specific_templates, ONE_INTEGER);
                                                                                                    } else {
                                                                                                        Errors.error($str_alt98$Unexpected_type_of_EBMT_template_, ebmt_template_parser.ebmt_template_type(template));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            if (indexing_result.equal($$$Already_indexed)) {
                                                                                                num_already_indexed_templates = add(num_already_indexed_templates, ONE_INTEGER);
                                                                                            } else {
                                                                                                Errors.error($str_alt100$Unexpected_indexing_result_of_EBM, indexing_result);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            format(s_out, $str_alt101$_S__, list(nl, cycl, nl_cycl_pairs, list(num_general_templates, num_specific_templates, num_already_indexed_templates, num_failed_templates), time_taken));
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list_alt94);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        noting_percent_progress_postamble();
                                                    } finally {
                                                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                        $within_noting_percent_progress$.rebind(_prev_bind_2_9, thread);
                                                        $last_percent_progress_prediction$.rebind(_prev_bind_1_8, thread);
                                                        $last_percent_progress_index$.rebind(_prev_bind_0_7, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if (stream.isStream()) {
                                                        close(stream, UNPROVIDED);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    $print_level$.rebind(_prev_bind_2_6, thread);
                                    $print_length$.rebind(_prev_bind_1_5, thread);
                                    $print_pretty$.rebind(_prev_bind_0_4, thread);
                                }
                            }
                            os_process_utilities.kill_os_process(os_process);
                        }
                    } finally {
                        lucene_index.$ebmt_index_log$.rebind(_prev_bind_2, thread);
                        lucene_index.$ebmt_index_content$.rebind(_prev_bind_1, thread);
                        lucene_index.$ebmt_index_host$.rebind(_prev_bind_0, thread);
                    }
                }
                return f_out;
            }
        }
    }

    /**
     * This function tests the overall EBMT Template Index creation process.  Given
     * the NL-CycL examples in TRAINING-MT, it creates an EBMT Template Index and
     * records various metrics related to the process in file
     * ebmt-training-output-filename*.
     */
    @LispMethod(comment = "This function tests the overall EBMT Template Index creation process.  Given\r\nthe NL-CycL examples in TRAINING-MT, it creates an EBMT Template Index and\r\nrecords various metrics related to the process in file\r\nebmt-training-output-filename*.\nThis function tests the overall EBMT Template Index creation process.  Given\nthe NL-CycL examples in TRAINING-MT, it creates an EBMT Template Index and\nrecords various metrics related to the process in file\nebmt-training-output-filename*.")
    public static SubLObject ebmt_test_index_creation(final SubLObject test_dir, final SubLObject training_mt, final SubLObject every_nth, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(test_dir) : "! stringp(test_dir) " + ("Types.stringp(test_dir) " + "CommonSymbols.NIL != Types.stringp(test_dir) ") + test_dir;
        final SubLObject f_out = cconcatenate(test_dir, $ebmt_training_output_filename$.getGlobalValue());
        final SubLObject _prev_bind_0 = lucene_index.$ebmt_index_host$.currentBinding(thread);
        final SubLObject _prev_bind_2 = lucene_index.$ebmt_index_content$.currentBinding(thread);
        final SubLObject _prev_bind_3 = lucene_index.$ebmt_index_log$.currentBinding(thread);
        try {
            lucene_index.$ebmt_index_host$.bind($$$localhost, thread);
            lucene_index.$ebmt_index_content$.bind(cconcatenate(format_nil.format_nil_a_no_copy(test_dir), $str87$_ebmt_index_txt), thread);
            lucene_index.$ebmt_index_log$.bind(cconcatenate(format_nil.format_nil_a_no_copy(test_dir), $str88$_ebmt_index_log), thread);
            final SubLObject os_process = ebmt_index_server_process(test_dir);
            final SubLObject _prev_bind_0_$4 = $print_pretty$.currentBinding(thread);
            final SubLObject _prev_bind_1_$5 = $print_length$.currentBinding(thread);
            final SubLObject _prev_bind_2_$6 = $print_level$.currentBinding(thread);
            try {
                $print_pretty$.bind(NIL, thread);
                $print_length$.bind(NIL, thread);
                $print_level$.bind(NIL, thread);
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(f_out, $OUTPUT);
                    if (!stream.isStream()) {
                        Errors.error($str54$Unable_to_open__S, f_out);
                    }
                    final SubLObject s_out = stream;
                    final SubLObject list_var = ebmt_nl_cycl_pairs_from_source(training_mt, every_nth);
                    final SubLObject _prev_bind_0_$5 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$6 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$7 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind(NIL != cconcatenate($$$Processing_EBMT_data_from_, new SubLObject[]{ format_nil.format_nil_a_no_copy(training_mt), $str90$____ }) ? cconcatenate($$$Processing_EBMT_data_from_, new SubLObject[]{ format_nil.format_nil_a_no_copy(training_mt), $str90$____ }) : $$$cdolist, thread);
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
                            SubLObject pair = NIL;
                            pair = csome_list_var.first();
                            while (NIL != csome_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = pair;
                                SubLObject nl = NIL;
                                SubLObject cycl = NIL;
                                destructuring_bind_must_consp(current, datum, $list92);
                                nl = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list92);
                                cycl = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    ebmt_possibly_update_keepalive_file();
                                    SubLObject num_general_templates = ZERO_INTEGER;
                                    SubLObject num_specific_templates = ZERO_INTEGER;
                                    SubLObject num_already_indexed_templates = ZERO_INTEGER;
                                    SubLObject num_failed_templates = ZERO_INTEGER;
                                    SubLObject templates = NIL;
                                    SubLObject nl_cycl_pairs = NIL;
                                    SubLObject time_taken = NIL;
                                    final SubLObject time_var = get_internal_real_time();
                                    templates = ebmt_template_parser.ebmt_create_and_add_templates(nl, cycl, ebmt_template_parser.new_ebmt_lexicon(UNPROVIDED), NIL, verboseP);
                                    time_taken = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                    if (NIL == templates) {
                                        num_failed_templates = add(num_failed_templates, ONE_INTEGER);
                                    }
                                    SubLObject cdolist_list_var = templates;
                                    SubLObject template = NIL;
                                    template = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        nl_cycl_pairs = cons(ebmt_template_parser.ebmt_template_nl_cycl_pair(template), nl_cycl_pairs);
                                        final SubLObject indexing_result = ebmt_template_parser.ebmt_template_indexing_result(template);
                                        if (indexing_result.equal($$$Added)) {
                                            final SubLObject pcase_var = ebmt_template_parser.ebmt_template_type(template);
                                            if (pcase_var.eql($GENERAL)) {
                                                num_general_templates = add(num_general_templates, ONE_INTEGER);
                                            } else
                                                if (pcase_var.eql($SPECIFIC)) {
                                                    num_specific_templates = add(num_specific_templates, ONE_INTEGER);
                                                } else {
                                                    Errors.error($str96$Unexpected_type_of_EBMT_template_, ebmt_template_parser.ebmt_template_type(template));
                                                }

                                        } else
                                            if (indexing_result.equal($$$Already_indexed)) {
                                                num_already_indexed_templates = add(num_already_indexed_templates, ONE_INTEGER);
                                            } else {
                                                Errors.error($str98$Unexpected_indexing_result_of_EBM, indexing_result);
                                            }

                                        cdolist_list_var = cdolist_list_var.rest();
                                        template = cdolist_list_var.first();
                                    } 
                                    format(s_out, $str99$_S__, list(nl, cycl, nl_cycl_pairs, list(num_general_templates, num_specific_templates, num_already_indexed_templates, num_failed_templates), time_taken));
                                } else {
                                    cdestructuring_bind_error(datum, $list92);
                                }
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                pair = csome_list_var.first();
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
                        $progress_total$.rebind(_prev_bind_2_$7, thread);
                        $progress_start_time$.rebind(_prev_bind_1_$6, thread);
                        $progress_note$.rebind(_prev_bind_0_$5, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                    }
                }
            } finally {
                $print_level$.rebind(_prev_bind_2_$6, thread);
                $print_length$.rebind(_prev_bind_1_$5, thread);
                $print_pretty$.rebind(_prev_bind_0_$4, thread);
            }
            os_process_utilities.kill_os_process(os_process);
        } finally {
            lucene_index.$ebmt_index_log$.rebind(_prev_bind_3, thread);
            lucene_index.$ebmt_index_content$.rebind(_prev_bind_2, thread);
            lucene_index.$ebmt_index_host$.rebind(_prev_bind_0, thread);
        }
        return f_out;
    }

    /**
     * This function tests the overall EBMT parsing process using the EBMT Template
     * Index in TEST-DIR.  If SOURCE is an mt, then it gets the NL-CycL pairs from the KB
     * and assumes the CycL to be the desired output.
     * If SOURCE is a text file, it gets NL strings from the KB and does not assume any desired output.
     * It also records various metrics related to the process in file *ebmt-testing-output-filename*.
     */
    @LispMethod(comment = "This function tests the overall EBMT parsing process using the EBMT Template\r\nIndex in TEST-DIR.  If SOURCE is an mt, then it gets the NL-CycL pairs from the KB\r\nand assumes the CycL to be the desired output.\r\nIf SOURCE is a text file, it gets NL strings from the KB and does not assume any desired output.\r\nIt also records various metrics related to the process in file *ebmt-testing-output-filename*.\nThis function tests the overall EBMT parsing process using the EBMT Template\nIndex in TEST-DIR.  If SOURCE is an mt, then it gets the NL-CycL pairs from the KB\nand assumes the CycL to be the desired output.\nIf SOURCE is a text file, it gets NL strings from the KB and does not assume any desired output.\nIt also records various metrics related to the process in file *ebmt-testing-output-filename*.")
    public static final SubLObject ebmt_test_parsing_with_index_alt(SubLObject test_dir, SubLObject source, SubLObject every_nth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(test_dir, STRINGP);
            SubLTrampolineFile.checkType(source, EBMT_TESTING_SOURCE_P);
            {
                SubLObject f_out = cconcatenate(test_dir, $ebmt_testing_output_filename$.getGlobalValue());
                SubLObject test_dir_var = test_dir;
                {
                    SubLObject _prev_bind_0 = lucene_index.$ebmt_index_host$.currentBinding(thread);
                    SubLObject _prev_bind_1 = lucene_index.$ebmt_index_content$.currentBinding(thread);
                    SubLObject _prev_bind_2 = lucene_index.$ebmt_index_log$.currentBinding(thread);
                    try {
                        lucene_index.$ebmt_index_host$.bind($$$localhost, thread);
                        lucene_index.$ebmt_index_content$.bind(cconcatenate(format_nil.format_nil_a_no_copy(test_dir_var), $str_alt90$_ebmt_index_txt), thread);
                        lucene_index.$ebmt_index_log$.bind(cconcatenate(format_nil.format_nil_a_no_copy(test_dir_var), $str_alt91$_ebmt_index_log), thread);
                        {
                            SubLObject os_process = com.cyc.cycjava.cycl.ebmt_tests.ebmt_index_server_process(test_dir_var);
                            {
                                SubLObject _prev_bind_0_11 = $print_pretty$.currentBinding(thread);
                                SubLObject _prev_bind_1_12 = $print_length$.currentBinding(thread);
                                SubLObject _prev_bind_2_13 = $print_level$.currentBinding(thread);
                                try {
                                    $print_pretty$.bind(NIL, thread);
                                    $print_length$.bind(NIL, thread);
                                    $print_level$.bind(NIL, thread);
                                    {
                                        SubLObject stream = NIL;
                                        try {
                                            stream = compatibility.open_text(f_out, $OUTPUT, NIL);
                                            if (!stream.isStream()) {
                                                Errors.error($str_alt57$Unable_to_open__S, f_out);
                                            }
                                            {
                                                SubLObject s_out = stream;
                                                SubLObject source_var = source;
                                                SubLObject list_var = com.cyc.cycjava.cycl.ebmt_tests.ebmt_nl_cycl_pairs_from_source(source_var, every_nth);
                                                $progress_note$.setDynamicValue(cconcatenate($str_alt92$Processing_EBMT_data_from_, new SubLObject[]{ format_nil.format_nil_a_no_copy(source_var), $str_alt93$____ }), thread);
                                                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                                $progress_total$.setDynamicValue(length(list_var), thread);
                                                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                                {
                                                    SubLObject _prev_bind_0_14 = $last_percent_progress_index$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_15 = $last_percent_progress_prediction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_16 = $within_noting_percent_progress$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                                    try {
                                                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                        $last_percent_progress_prediction$.bind(NIL, thread);
                                                        $within_noting_percent_progress$.bind(T, thread);
                                                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                                        {
                                                            SubLObject csome_list_var = list_var;
                                                            SubLObject pair = NIL;
                                                            for (pair = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , pair = csome_list_var.first()) {
                                                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                {
                                                                    SubLObject datum = pair;
                                                                    SubLObject current = datum;
                                                                    SubLObject nl = NIL;
                                                                    SubLObject cycl = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt94);
                                                                    nl = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list_alt94);
                                                                    cycl = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        com.cyc.cycjava.cycl.ebmt_tests.ebmt_possibly_update_keepalive_file();
                                                                        {
                                                                            SubLObject target_cycl = (NIL != cycl) ? ((SubLObject) (ebmt_template_parser.ebmt_canonicalize_el_sentence(cycl, $$InferencePSC))) : NIL;
                                                                            SubLObject parsed_cycls = NIL;
                                                                            SubLObject justifications = NIL;
                                                                            SubLObject weights = NIL;
                                                                            SubLObject time_taken = NIL;
                                                                            SubLObject time_var = get_internal_real_time();
                                                                            thread.resetMultipleValues();
                                                                            {
                                                                                SubLObject parsed_cycls_17 = ebmt_template_parser.ebmt_parse(ebmt_template_parser.ebmt_remove_ignore_markers(nl), UNPROVIDED, UNPROVIDED);
                                                                                SubLObject justifications_18 = thread.secondMultipleValue();
                                                                                SubLObject weights_19 = thread.thirdMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                parsed_cycls = parsed_cycls_17;
                                                                                justifications = justifications_18;
                                                                                weights = weights_19;
                                                                            }
                                                                            time_taken = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                                            parsed_cycls = Mapping.mapcar(HL_TO_EL, parsed_cycls);
                                                                            {
                                                                                SubLObject unique_interpretation_count = length(remove_duplicates(parsed_cycls, symbol_function($sym49$EQUALS_EL_), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject match_list = com.cyc.cycjava.cycl.ebmt_tests.ebmt_compute_match_list_and_result(parsed_cycls, target_cycl);
                                                                                    SubLObject result = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    com.cyc.cycjava.cycl.ebmt_tests.write_one_line_to_ebmt_testing_output_file(s_out, nl, cycl, unique_interpretation_count, result, time_taken, match_list, parsed_cycls, weights);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list_alt94);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        noting_percent_progress_postamble();
                                                    } finally {
                                                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                        $within_noting_percent_progress$.rebind(_prev_bind_2_16, thread);
                                                        $last_percent_progress_prediction$.rebind(_prev_bind_1_15, thread);
                                                        $last_percent_progress_index$.rebind(_prev_bind_0_14, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if (stream.isStream()) {
                                                        close(stream, UNPROVIDED);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_20, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    $print_level$.rebind(_prev_bind_2_13, thread);
                                    $print_length$.rebind(_prev_bind_1_12, thread);
                                    $print_pretty$.rebind(_prev_bind_0_11, thread);
                                }
                            }
                            os_process_utilities.kill_os_process(os_process);
                        }
                    } finally {
                        lucene_index.$ebmt_index_log$.rebind(_prev_bind_2, thread);
                        lucene_index.$ebmt_index_content$.rebind(_prev_bind_1, thread);
                        lucene_index.$ebmt_index_host$.rebind(_prev_bind_0, thread);
                    }
                }
                return f_out;
            }
        }
    }

    /**
     * This function tests the overall EBMT parsing process using the EBMT Template
     * Index in TEST-DIR.  If SOURCE is an mt, then it gets the NL-CycL pairs from the KB
     * and assumes the CycL to be the desired output.
     * If SOURCE is a text file, it gets NL strings from the KB and does not assume any desired output.
     * It also records various metrics related to the process in file *ebmt-testing-output-filename*.
     */
    @LispMethod(comment = "This function tests the overall EBMT parsing process using the EBMT Template\r\nIndex in TEST-DIR.  If SOURCE is an mt, then it gets the NL-CycL pairs from the KB\r\nand assumes the CycL to be the desired output.\r\nIf SOURCE is a text file, it gets NL strings from the KB and does not assume any desired output.\r\nIt also records various metrics related to the process in file *ebmt-testing-output-filename*.\nThis function tests the overall EBMT parsing process using the EBMT Template\nIndex in TEST-DIR.  If SOURCE is an mt, then it gets the NL-CycL pairs from the KB\nand assumes the CycL to be the desired output.\nIf SOURCE is a text file, it gets NL strings from the KB and does not assume any desired output.\nIt also records various metrics related to the process in file *ebmt-testing-output-filename*.")
    public static SubLObject ebmt_test_parsing_with_index(final SubLObject test_dir, SubLObject source, final SubLObject every_nth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(test_dir) : "! stringp(test_dir) " + ("Types.stringp(test_dir) " + "CommonSymbols.NIL != Types.stringp(test_dir) ") + test_dir;
        assert NIL != ebmt_testing_source_p(source) : "! ebmt_tests.ebmt_testing_source_p(source) " + ("ebmt_tests.ebmt_testing_source_p(source) " + "CommonSymbols.NIL != ebmt_tests.ebmt_testing_source_p(source) ") + source;
        final SubLObject f_out = cconcatenate(test_dir, $ebmt_testing_output_filename$.getGlobalValue());
        final SubLObject _prev_bind_0 = lucene_index.$ebmt_index_host$.currentBinding(thread);
        final SubLObject _prev_bind_2 = lucene_index.$ebmt_index_content$.currentBinding(thread);
        final SubLObject _prev_bind_3 = lucene_index.$ebmt_index_log$.currentBinding(thread);
        try {
            lucene_index.$ebmt_index_host$.bind($$$localhost, thread);
            lucene_index.$ebmt_index_content$.bind(cconcatenate(format_nil.format_nil_a_no_copy(test_dir), $str87$_ebmt_index_txt), thread);
            lucene_index.$ebmt_index_log$.bind(cconcatenate(format_nil.format_nil_a_no_copy(test_dir), $str88$_ebmt_index_log), thread);
            final SubLObject os_process = ebmt_index_server_process(test_dir);
            final SubLObject _prev_bind_0_$12 = $print_pretty$.currentBinding(thread);
            final SubLObject _prev_bind_1_$13 = $print_length$.currentBinding(thread);
            final SubLObject _prev_bind_2_$14 = $print_level$.currentBinding(thread);
            try {
                $print_pretty$.bind(NIL, thread);
                $print_length$.bind(NIL, thread);
                $print_level$.bind(NIL, thread);
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(f_out, $OUTPUT);
                    if (!stream.isStream()) {
                        Errors.error($str54$Unable_to_open__S, f_out);
                    }
                    final SubLObject s_out = stream;
                    final SubLObject list_var = ebmt_nl_cycl_pairs_from_source(source, every_nth);
                    final SubLObject _prev_bind_0_$13 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$14 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$15 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind(NIL != cconcatenate($$$Processing_EBMT_data_from_, new SubLObject[]{ format_nil.format_nil_a_no_copy(source), $str90$____ }) ? cconcatenate($$$Processing_EBMT_data_from_, new SubLObject[]{ format_nil.format_nil_a_no_copy(source), $str90$____ }) : $$$cdolist, thread);
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
                            SubLObject pair = NIL;
                            pair = csome_list_var.first();
                            while (NIL != csome_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = pair;
                                SubLObject nl = NIL;
                                SubLObject cycl = NIL;
                                destructuring_bind_must_consp(current, datum, $list92);
                                nl = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list92);
                                cycl = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    ebmt_possibly_update_keepalive_file();
                                    final SubLObject target_cycl = (NIL != cycl) ? ebmt_template_parser.ebmt_canonicalize_el_sentence(cycl, $$InferencePSC) : NIL;
                                    SubLObject parsed_cycls = NIL;
                                    SubLObject justifications = NIL;
                                    SubLObject weights = NIL;
                                    SubLObject time_taken = NIL;
                                    final SubLObject time_var = get_internal_real_time();
                                    thread.resetMultipleValues();
                                    final SubLObject parsed_cycls_$18 = ebmt_template_parser.ebmt_parse(ebmt_template_parser.ebmt_remove_ignore_markers(nl), UNPROVIDED, UNPROVIDED);
                                    final SubLObject justifications_$19 = thread.secondMultipleValue();
                                    final SubLObject weights_$20 = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    parsed_cycls = parsed_cycls_$18;
                                    justifications = justifications_$19;
                                    weights = weights_$20;
                                    time_taken = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                    parsed_cycls = Mapping.mapcar(HL_TO_EL, parsed_cycls);
                                    final SubLObject unique_interpretation_count = length(remove_duplicates(parsed_cycls, symbol_function($sym48$EQUALS_EL_), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                    thread.resetMultipleValues();
                                    final SubLObject match_list = ebmt_compute_match_list_and_result(parsed_cycls, target_cycl);
                                    final SubLObject result = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    write_one_line_to_ebmt_testing_output_file(s_out, nl, cycl, unique_interpretation_count, result, time_taken, match_list, parsed_cycls, weights);
                                } else {
                                    cdestructuring_bind_error(datum, $list92);
                                }
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                pair = csome_list_var.first();
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
                        $progress_total$.rebind(_prev_bind_2_$15, thread);
                        $progress_start_time$.rebind(_prev_bind_1_$14, thread);
                        $progress_note$.rebind(_prev_bind_0_$13, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                    }
                }
            } finally {
                $print_level$.rebind(_prev_bind_2_$14, thread);
                $print_length$.rebind(_prev_bind_1_$13, thread);
                $print_pretty$.rebind(_prev_bind_0_$12, thread);
            }
            os_process_utilities.kill_os_process(os_process);
        } finally {
            lucene_index.$ebmt_index_log$.rebind(_prev_bind_3, thread);
            lucene_index.$ebmt_index_content$.rebind(_prev_bind_2, thread);
            lucene_index.$ebmt_index_host$.rebind(_prev_bind_0, thread);
        }
        return f_out;
    }

    public static final SubLObject ebmt_testing_source_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != hlmt.hlmtP(v_object)) || (NIL != file_utilities.file_existsP(v_object)));
    }

    public static SubLObject ebmt_testing_source_p(final SubLObject v_object) {
        return makeBoolean((NIL != hlmt.hlmtP(v_object)) || (NIL != file_utilities.file_existsP(v_object)));
    }

    public static final SubLObject ebmt_compute_match_list_and_result_alt(SubLObject parsed_cycls, SubLObject target_cycl) {
        {
            SubLObject match_list = NIL;
            SubLObject result = $FAILURE;
            SubLObject cdolist_list_var = parsed_cycls;
            SubLObject parsed_cycl = NIL;
            for (parsed_cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parsed_cycl = cdolist_list_var.first()) {
                if (NIL != czer_utilities.equals_elP(target_cycl, parsed_cycl, UNPROVIDED, UNPROVIDED)) {
                    result = $SUCCESS;
                    match_list = cons(ONE_INTEGER, match_list);
                } else {
                    match_list = cons(ZERO_INTEGER, match_list);
                }
            }
            match_list = nreverse(match_list);
            return values(match_list, result);
        }
    }

    public static SubLObject ebmt_compute_match_list_and_result(final SubLObject parsed_cycls, final SubLObject target_cycl) {
        SubLObject match_list = NIL;
        SubLObject result = $FAILURE;
        SubLObject cdolist_list_var = parsed_cycls;
        SubLObject parsed_cycl = NIL;
        parsed_cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != czer_utilities.equals_elP(target_cycl, parsed_cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                result = $SUCCESS;
                match_list = cons(ONE_INTEGER, match_list);
            } else {
                match_list = cons(ZERO_INTEGER, match_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            parsed_cycl = cdolist_list_var.first();
        } 
        match_list = nreverse(match_list);
        return values(match_list, result);
    }

    public static final SubLObject write_one_line_to_ebmt_testing_output_file_alt(SubLObject s_out, SubLObject nl, SubLObject cycl, SubLObject unique_interpretation_count, SubLObject result, SubLObject time, SubLObject match_list, SubLObject parsed_cycls, SubLObject weights) {
        {
            SubLObject out_line = list(nl, cycl, unique_interpretation_count, result, time, match_list, parsed_cycls, weights);
            format(s_out, $str_alt101$_S__, out_line);
        }
        return NIL;
    }

    public static SubLObject write_one_line_to_ebmt_testing_output_file(final SubLObject s_out, final SubLObject nl, final SubLObject cycl, final SubLObject unique_interpretation_count, final SubLObject result, final SubLObject time, final SubLObject match_list, final SubLObject parsed_cycls, final SubLObject weights) {
        final SubLObject out_line = list(nl, cycl, unique_interpretation_count, result, time, match_list, parsed_cycls, weights);
        format(s_out, $str99$_S__, out_line);
        return NIL;
    }

    /**
     * Returns a property-list of summary information after parsing the EBMT
     * training output file in TEST-DIR.
     *
     * @param TRAINING-MT;
     * 		the mt that was used to train for the test run in
     * 		TEST-DIR.
     */
    @LispMethod(comment = "Returns a property-list of summary information after parsing the EBMT\r\ntraining output file in TEST-DIR.\r\n\r\n@param TRAINING-MT;\r\n\t\tthe mt that was used to train for the test run in\r\n\t\tTEST-DIR.\nReturns a property-list of summary information after parsing the EBMT\ntraining output file in TEST-DIR.")
    public static final SubLObject ebmt_training_summary_plist_alt(SubLObject test_dir, SubLObject training_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject num_user_training_examples = ZERO_INTEGER;
                SubLObject num_training_examples = ZERO_INTEGER;
                SubLObject num_failed_templates = ZERO_INTEGER;
                SubLObject num_already_indexed_templates = ZERO_INTEGER;
                SubLObject num_specific_templates = ZERO_INTEGER;
                SubLObject num_general_templates = ZERO_INTEGER;
                SubLObject total_training_time = ZERO_INTEGER;
                SubLObject min_training_time = $int$100;
                SubLObject max_training_time = ZERO_INTEGER;
                SubLObject training_output = cconcatenate(test_dir, $ebmt_training_output_filename$.getGlobalValue());
                SubLObject num_templates = NIL;
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($str_alt107$Summarizing_EBMT_training_details);
                        {
                            SubLObject file_var = training_output;
                            SubLObject stream = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0_21 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                    try {
                                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                        stream = compatibility.open_text(file_var, $INPUT, NIL);
                                    } finally {
                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_21, thread);
                                    }
                                }
                                if (!stream.isStream()) {
                                    Errors.error($str_alt57$Unable_to_open__S, file_var);
                                }
                                {
                                    SubLObject stream_var = stream;
                                    if (stream_var.isStream()) {
                                        {
                                            SubLObject length_var = file_length(stream_var);
                                            SubLObject stream_var_22 = stream_var;
                                            SubLObject line_number_var = NIL;
                                            SubLObject file_line = NIL;
                                            for (line_number_var = ZERO_INTEGER, file_line = read_line(stream_var_22, NIL, NIL, UNPROVIDED); NIL != file_line; line_number_var = number_utilities.f_1X(line_number_var) , file_line = read_line(stream_var_22, NIL, NIL, UNPROVIDED)) {
                                                {
                                                    SubLObject line = read_from_string(file_line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    SubLObject all_training_examples = third(line);
                                                    SubLObject num_template_types = fourth(line);
                                                    SubLObject time_taken = fifth(line);
                                                    num_user_training_examples = add(num_user_training_examples, ONE_INTEGER);
                                                    num_training_examples = add(num_training_examples, length(all_training_examples));
                                                    num_general_templates = add(num_general_templates, num_template_types.first());
                                                    num_specific_templates = add(num_specific_templates, second(num_template_types));
                                                    num_already_indexed_templates = add(num_already_indexed_templates, third(num_template_types));
                                                    num_failed_templates = add(num_failed_templates, fourth(num_template_types));
                                                    total_training_time = add(total_training_time, time_taken);
                                                    if (time_taken.numL(min_training_time)) {
                                                        min_training_time = time_taken;
                                                    }
                                                    if (time_taken.numG(max_training_time)) {
                                                        max_training_time = time_taken;
                                                    }
                                                }
                                                note_percent_progress(file_position(stream_var, UNPROVIDED), length_var);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_23, thread);
                                    }
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                num_templates = add(new SubLObject[]{ num_general_templates, num_specific_templates, num_already_indexed_templates, num_failed_templates });
                return list(new SubLObject[]{ $TRAINING_INPUT_MT, training_mt, $USER_TRAINING_EXAMPLES, num_user_training_examples, $TRAINING_EXAMPLES, num_training_examples, $GENERAL_TEMPLATES, num_general_templates, $GENERAL_TEMPLATES_PC, number_utilities.percent(num_general_templates, num_templates, UNPROVIDED), $SPECIFIC_TEMPLATES, num_specific_templates, $SPECIFIC_TEMPLATES_PC, number_utilities.percent(num_specific_templates, num_templates, UNPROVIDED), $NO_TEMPLATES, num_failed_templates, $NO_TEMPLATES_PC, number_utilities.percent(num_failed_templates, num_templates, UNPROVIDED), $DUPLICATE_TEMPLATES, num_already_indexed_templates, $DUPLICATE_TEMPLATES_PC, number_utilities.percent(num_already_indexed_templates, num_templates, UNPROVIDED), $TOTAL_TRAINING_TIME, total_training_time, $MIN_TRAINING_TIME, min_training_time, $MAX_TRAINING_TIME, max_training_time });
            }
        }
    }

    /**
     * Returns a property-list of summary information after parsing the EBMT
     * training output file in TEST-DIR.
     *
     * @param TRAINING-MT;
     * 		the mt that was used to train for the test run in
     * 		TEST-DIR.
     */
    @LispMethod(comment = "Returns a property-list of summary information after parsing the EBMT\r\ntraining output file in TEST-DIR.\r\n\r\n@param TRAINING-MT;\r\n\t\tthe mt that was used to train for the test run in\r\n\t\tTEST-DIR.\nReturns a property-list of summary information after parsing the EBMT\ntraining output file in TEST-DIR.")
    public static SubLObject ebmt_training_summary_plist(final SubLObject test_dir, final SubLObject training_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject num_user_training_examples = ZERO_INTEGER;
        SubLObject num_training_examples = ZERO_INTEGER;
        SubLObject num_failed_templates = ZERO_INTEGER;
        SubLObject num_already_indexed_templates = ZERO_INTEGER;
        SubLObject num_specific_templates = ZERO_INTEGER;
        SubLObject num_general_templates = ZERO_INTEGER;
        SubLObject total_training_time = ZERO_INTEGER;
        SubLObject min_training_time = $int$100;
        SubLObject max_training_time = ZERO_INTEGER;
        final SubLObject training_output = cconcatenate(test_dir, $ebmt_training_output_filename$.getGlobalValue());
        SubLObject num_templates = NIL;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($str105$Summarizing_EBMT_training_details);
                final SubLObject file_var = training_output;
                SubLObject stream = NIL;
                try {
                    final SubLObject _prev_bind_0_$23 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                        stream = compatibility.open_text(file_var, $INPUT);
                    } finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$23, thread);
                    }
                    if (!stream.isStream()) {
                        Errors.error($str54$Unable_to_open__S, file_var);
                    }
                    final SubLObject stream_var = stream;
                    if (stream_var.isStream()) {
                        final SubLObject length_var = file_length(stream_var);
                        final SubLObject stream_var_$24 = stream_var;
                        SubLObject line_number_var = NIL;
                        SubLObject file_line = NIL;
                        line_number_var = ZERO_INTEGER;
                        for (file_line = file_utilities.do_stream_lines_get_next_line(stream_var_$24); NIL != file_line; file_line = file_utilities.do_stream_lines_get_next_line(stream_var_$24)) {
                            final SubLObject line = read_from_string(file_line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            final SubLObject all_training_examples = third(line);
                            final SubLObject num_template_types = fourth(line);
                            final SubLObject time_taken = fifth(line);
                            num_user_training_examples = add(num_user_training_examples, ONE_INTEGER);
                            num_training_examples = add(num_training_examples, length(all_training_examples));
                            num_general_templates = add(num_general_templates, num_template_types.first());
                            num_specific_templates = add(num_specific_templates, second(num_template_types));
                            num_already_indexed_templates = add(num_already_indexed_templates, third(num_template_types));
                            num_failed_templates = add(num_failed_templates, fourth(num_template_types));
                            total_training_time = add(total_training_time, time_taken);
                            if (time_taken.numL(min_training_time)) {
                                min_training_time = time_taken;
                            }
                            if (time_taken.numG(max_training_time)) {
                                max_training_time = time_taken;
                            }
                            note_percent_progress(file_position(stream_var, UNPROVIDED), length_var);
                            line_number_var = number_utilities.f_1X(line_number_var);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        num_templates = add(new SubLObject[]{ num_general_templates, num_specific_templates, num_already_indexed_templates, num_failed_templates });
        return list(new SubLObject[]{ $TRAINING_INPUT_MT, training_mt, $USER_TRAINING_EXAMPLES, num_user_training_examples, $TRAINING_EXAMPLES, num_training_examples, $GENERAL_TEMPLATES, num_general_templates, $GENERAL_TEMPLATES_PC, number_utilities.percent(num_general_templates, num_templates, UNPROVIDED), $SPECIFIC_TEMPLATES, num_specific_templates, $SPECIFIC_TEMPLATES_PC, number_utilities.percent(num_specific_templates, num_templates, UNPROVIDED), $NO_TEMPLATES, num_failed_templates, $NO_TEMPLATES_PC, number_utilities.percent(num_failed_templates, num_templates, UNPROVIDED), $DUPLICATE_TEMPLATES, num_already_indexed_templates, $DUPLICATE_TEMPLATES_PC, number_utilities.percent(num_already_indexed_templates, num_templates, UNPROVIDED), $TOTAL_TRAINING_TIME, total_training_time, $MIN_TRAINING_TIME, min_training_time, $MAX_TRAINING_TIME, max_training_time });
    }

    public static final SubLObject ebmt_testing_output_datum_p_alt(SubLObject v_object) {
        return list_utilities.list_of_length_p(v_object, EIGHT_INTEGER, UNPROVIDED);
    }

    public static SubLObject ebmt_testing_output_datum_p(final SubLObject v_object) {
        return list_utilities.list_of_length_p(v_object, EIGHT_INTEGER, UNPROVIDED);
    }

    /**
     * Returns a property-list of summary information after parsing the EBMT
     * parsing tests output file in TEST-DIR.
     */
    @LispMethod(comment = "Returns a property-list of summary information after parsing the EBMT\r\nparsing tests output file in TEST-DIR.\nReturns a property-list of summary information after parsing the EBMT\nparsing tests output file in TEST-DIR.")
    public static final SubLObject ebmt_testing_summary_plist_alt(SubLObject test_dir, SubLObject testing_source, SubLObject testing_output_filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject num_examples = ZERO_INTEGER;
                SubLObject num_successful = ZERO_INTEGER;
                SubLObject num_almost_successful = ZERO_INTEGER;
                SubLObject num_unknown = ZERO_INTEGER;
                SubLObject num_failed = ZERO_INTEGER;
                SubLObject num_interps = ZERO_INTEGER;
                SubLObject max_interps_per_example = ZERO_INTEGER;
                SubLObject interps_per_example = NIL;
                SubLObject num_top = make_vector(FIVE_INTEGER, ZERO_INTEGER);
                SubLObject total_testing_time = ZERO_INTEGER;
                SubLObject total_successful_time = ZERO_INTEGER;
                SubLObject total_almost_successful_time = ZERO_INTEGER;
                SubLObject total_unknown_time = ZERO_INTEGER;
                SubLObject total_failed_time = ZERO_INTEGER;
                SubLObject max_time_per_example = ZERO_INTEGER;
                SubLObject time_per_example = NIL;
                SubLObject testing_output = cconcatenate(test_dir, testing_output_filename);
                SubLObject file_var = testing_output;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(file_var, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt57$Unable_to_open__S, file_var);
                    }
                    {
                        SubLObject stream_var = stream;
                        if (stream_var.isStream()) {
                            {
                                SubLObject stream_var_24 = stream_var;
                                SubLObject line_number_var = NIL;
                                SubLObject line = NIL;
                                for (line_number_var = ZERO_INTEGER, line = read_line(stream_var_24, NIL, NIL, UNPROVIDED); NIL != line; line_number_var = number_utilities.f_1X(line_number_var) , line = read_line(stream_var_24, NIL, NIL, UNPROVIDED)) {
                                    {
                                        SubLObject datum = read_from_string_ignoring_errors(line, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        if (NIL == com.cyc.cycjava.cycl.ebmt_tests.ebmt_testing_output_datum_p(datum)) {
                                            Errors.warn($str_alt39$Got_a_malformed_EBMT_testing_outp, line);
                                        } else {
                                            {
                                                SubLObject datum_25 = datum;
                                                SubLObject current = datum_25;
                                                SubLObject nl = NIL;
                                                SubLObject cycl = NIL;
                                                SubLObject num_interps_per_example = NIL;
                                                SubLObject test_result = NIL;
                                                SubLObject time_taken = NIL;
                                                SubLObject match_list = NIL;
                                                SubLObject parsed_cycls = NIL;
                                                SubLObject weights = NIL;
                                                destructuring_bind_must_consp(current, datum_25, $list_alt122);
                                                nl = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum_25, $list_alt122);
                                                cycl = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum_25, $list_alt122);
                                                num_interps_per_example = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum_25, $list_alt122);
                                                test_result = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum_25, $list_alt122);
                                                time_taken = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum_25, $list_alt122);
                                                match_list = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum_25, $list_alt122);
                                                parsed_cycls = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum_25, $list_alt122);
                                                weights = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    {
                                                        SubLObject doneP = NIL;
                                                        SubLObject match_value = NIL;
                                                        num_examples = add(num_examples, ONE_INTEGER);
                                                        {
                                                            SubLObject pcase_var = test_result;
                                                            if (pcase_var.eql($SUCCESS)) {
                                                                num_successful = add(num_successful, ONE_INTEGER);
                                                                total_successful_time = add(total_successful_time, time_taken);
                                                            } else {
                                                                if (pcase_var.eql($ALMOST)) {
                                                                    num_almost_successful = add(num_almost_successful, ONE_INTEGER);
                                                                    total_almost_successful_time = add(total_almost_successful_time, time_taken);
                                                                } else {
                                                                    if (pcase_var.eql($UNKNOWN)) {
                                                                        num_unknown = add(num_unknown, ONE_INTEGER);
                                                                        total_unknown_time = add(total_unknown_time, time_taken);
                                                                    } else {
                                                                        if (pcase_var.eql($FAILURE)) {
                                                                            num_failed = add(num_failed, ONE_INTEGER);
                                                                            total_failed_time = add(total_failed_time, time_taken);
                                                                        } else {
                                                                            Errors.error($str_alt125$Unexpected_EBMT_result__s, test_result);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        num_interps = add(num_interps, num_interps_per_example);
                                                        if (num_interps_per_example.numG(max_interps_per_example)) {
                                                            max_interps_per_example = num_interps_per_example;
                                                        }
                                                        interps_per_example = cons(num_interps_per_example, interps_per_example);
                                                        {
                                                            SubLObject list_var = NIL;
                                                            SubLObject match_item = NIL;
                                                            SubLObject i = NIL;
                                                            for (list_var = match_list, match_item = list_var.first(), i = ZERO_INTEGER; !((NIL != doneP) || (NIL == list_var)); list_var = list_var.rest() , match_item = list_var.first() , i = add(ONE_INTEGER, i)) {
                                                                if (match_item.numE(ONE_INTEGER)) {
                                                                    doneP = T;
                                                                    match_value = i;
                                                                }
                                                            }
                                                        }
                                                        doneP = NIL;
                                                        if ((NIL != match_value) && match_value.numL(FIVE_INTEGER)) {
                                                            {
                                                                SubLObject vector_var = num_top;
                                                                SubLObject backwardP_var = T;
                                                                SubLObject length = length(vector_var);
                                                                SubLObject datum_26 = (NIL != backwardP_var) ? ((SubLObject) (list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER))) : list(ZERO_INTEGER, length, ONE_INTEGER);
                                                                SubLObject current_27 = datum_26;
                                                                SubLObject start = NIL;
                                                                SubLObject end = NIL;
                                                                SubLObject delta = NIL;
                                                                destructuring_bind_must_consp(current_27, datum_26, $list_alt126);
                                                                start = current_27.first();
                                                                current_27 = current_27.rest();
                                                                destructuring_bind_must_consp(current_27, datum_26, $list_alt126);
                                                                end = current_27.first();
                                                                current_27 = current_27.rest();
                                                                destructuring_bind_must_consp(current_27, datum_26, $list_alt126);
                                                                delta = current_27.first();
                                                                current_27 = current_27.rest();
                                                                if (NIL == current_27) {
                                                                    if (NIL == doneP) {
                                                                        {
                                                                            SubLObject end_var = end;
                                                                            SubLObject key = NIL;
                                                                            for (key = start; !((NIL != doneP) || (NIL != subl_macros.do_numbers_endtest(key, delta, end_var))); key = add(key, delta)) {
                                                                                {
                                                                                    SubLObject value = aref(vector_var, key);
                                                                                    value = add(value, ONE_INTEGER);
                                                                                    set_aref(num_top, key, value);
                                                                                    if (key.numE(match_value)) {
                                                                                        doneP = T;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum_26, $list_alt126);
                                                                }
                                                            }
                                                        }
                                                        total_testing_time = add(total_testing_time, time_taken);
                                                        if (time_taken.numG(max_time_per_example)) {
                                                            max_time_per_example = time_taken;
                                                        }
                                                        time_per_example = cons(time_taken, time_per_example);
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum_25, $list_alt122);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject plist = list(new SubLObject[]{ $FUNCTION, EBMT_PARSE, $TESTING_INPUT_SOURCE, testing_source, $TEST_EXAMPLES, num_examples, $SUCCESSFUL_TESTS, num_successful, $SUCCESSFUL_TESTS_PC, number_utilities.percent(num_successful, num_examples, UNPROVIDED), $ALMOST_SUCCESSFUL_TESTS, num_almost_successful, $ALMOST_SUCCESSFUL_TESTS_PC, number_utilities.percent(num_almost_successful, num_examples, UNPROVIDED), $UNKNOWN_TESTS, num_unknown, $UNKNOWN_TESTS_PC, number_utilities.percent(num_unknown, num_examples, UNPROVIDED), $FAILED_TESTS, num_failed, $FAILED_TESTS_PC, number_utilities.percent(num_failed, num_examples, UNPROVIDED), $TOTAL_UNIQUE_INTERPS, num_interps, $MAX_INTERPS_PER_EXAMPLE, max_interps_per_example, $MEAN_INTERPS_PER_EXAMPLE, number_utilities.mean(interps_per_example), $MEDIAN_INTERPS_PER_EXAMPLE, number_utilities.median(interps_per_example, UNPROVIDED), $TOTAL_TESTING_TIME, total_testing_time, $TOTAL_SUCCESSFUL_TIME, total_successful_time, $TOTAL_ALMOST_SUCCESSFUL_TIME, total_almost_successful_time, $TOTAL_UNKNOWN_TIME, total_unknown_time, $TOTAL_FAILED_TIME, total_failed_time, $MAX_TIME_PER_EXAMPLE, max_time_per_example, $MEAN_TIME_PER_EXAMPLE, number_utilities.mean(time_per_example), $MEDIAN_TIME_PER_EXAMPLE, number_utilities.median(time_per_example, UNPROVIDED), $TOP1, aref(num_top, ZERO_INTEGER), $TOP2, aref(num_top, ONE_INTEGER), $TOP3, aref(num_top, TWO_INTEGER), $TOP4, aref(num_top, THREE_INTEGER), $TOP5, aref(num_top, FOUR_INTEGER) });
                    return plist;
                }
            }
        }
    }

    /**
     * Returns a property-list of summary information after parsing the EBMT
     * parsing tests output file in TEST-DIR.
     */
    @LispMethod(comment = "Returns a property-list of summary information after parsing the EBMT\r\nparsing tests output file in TEST-DIR.\nReturns a property-list of summary information after parsing the EBMT\nparsing tests output file in TEST-DIR.")
    public static SubLObject ebmt_testing_summary_plist(final SubLObject test_dir, final SubLObject testing_source, final SubLObject testing_output_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject num_examples = ZERO_INTEGER;
        SubLObject num_successful = ZERO_INTEGER;
        SubLObject num_almost_successful = ZERO_INTEGER;
        SubLObject num_unknown = ZERO_INTEGER;
        SubLObject num_failed = ZERO_INTEGER;
        SubLObject num_interps = ZERO_INTEGER;
        SubLObject max_interps_per_example = ZERO_INTEGER;
        SubLObject interps_per_example = NIL;
        final SubLObject num_top = make_vector(FIVE_INTEGER, ZERO_INTEGER);
        SubLObject total_testing_time = ZERO_INTEGER;
        SubLObject total_successful_time = ZERO_INTEGER;
        SubLObject total_almost_successful_time = ZERO_INTEGER;
        SubLObject total_unknown_time = ZERO_INTEGER;
        SubLObject total_failed_time = ZERO_INTEGER;
        SubLObject max_time_per_example = ZERO_INTEGER;
        SubLObject time_per_example = NIL;
        final SubLObject file_var;
        final SubLObject testing_output = file_var = cconcatenate(test_dir, testing_output_filename);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file_var, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str54$Unable_to_open__S, file_var);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$27 = stream_var;
                SubLObject line_number_var = NIL;
                SubLObject line = NIL;
                line_number_var = ZERO_INTEGER;
                for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$27); NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$27)) {
                    final SubLObject datum = read_from_string_ignoring_errors(line, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL == ebmt_testing_output_datum_p(datum)) {
                        Errors.warn($str39$Got_a_malformed_EBMT_testing_outp, line);
                    } else {
                        SubLObject current;
                        final SubLObject datum_$28 = current = datum;
                        SubLObject nl = NIL;
                        SubLObject cycl = NIL;
                        SubLObject num_interps_per_example = NIL;
                        SubLObject test_result = NIL;
                        SubLObject time_taken = NIL;
                        SubLObject match_list = NIL;
                        SubLObject parsed_cycls = NIL;
                        SubLObject weights = NIL;
                        destructuring_bind_must_consp(current, datum_$28, $list120);
                        nl = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum_$28, $list120);
                        cycl = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum_$28, $list120);
                        num_interps_per_example = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum_$28, $list120);
                        test_result = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum_$28, $list120);
                        time_taken = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum_$28, $list120);
                        match_list = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum_$28, $list120);
                        parsed_cycls = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum_$28, $list120);
                        weights = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            SubLObject doneP = NIL;
                            SubLObject match_value = NIL;
                            num_examples = add(num_examples, ONE_INTEGER);
                            final SubLObject pcase_var = test_result;
                            if (pcase_var.eql($SUCCESS)) {
                                num_successful = add(num_successful, ONE_INTEGER);
                                total_successful_time = add(total_successful_time, time_taken);
                            } else
                                if (pcase_var.eql($ALMOST)) {
                                    num_almost_successful = add(num_almost_successful, ONE_INTEGER);
                                    total_almost_successful_time = add(total_almost_successful_time, time_taken);
                                } else
                                    if (pcase_var.eql($UNKNOWN)) {
                                        num_unknown = add(num_unknown, ONE_INTEGER);
                                        total_unknown_time = add(total_unknown_time, time_taken);
                                    } else
                                        if (pcase_var.eql($FAILURE)) {
                                            num_failed = add(num_failed, ONE_INTEGER);
                                            total_failed_time = add(total_failed_time, time_taken);
                                        } else {
                                            Errors.error($str123$Unexpected_EBMT_result__s, test_result);
                                        }



                            num_interps = add(num_interps, num_interps_per_example);
                            if (num_interps_per_example.numG(max_interps_per_example)) {
                                max_interps_per_example = num_interps_per_example;
                            }
                            interps_per_example = cons(num_interps_per_example, interps_per_example);
                            SubLObject list_var = NIL;
                            SubLObject match_item = NIL;
                            SubLObject i = NIL;
                            list_var = match_list;
                            match_item = list_var.first();
                            for (i = ZERO_INTEGER; (NIL == doneP) && (NIL != list_var); list_var = list_var.rest() , match_item = list_var.first() , i = add(ONE_INTEGER, i)) {
                                if (match_item.numE(ONE_INTEGER)) {
                                    doneP = T;
                                    match_value = i;
                                }
                            }
                            doneP = NIL;
                            if ((NIL != match_value) && match_value.numL(FIVE_INTEGER)) {
                                final SubLObject vector_var = num_top;
                                final SubLObject backwardP_var = T;
                                final SubLObject length = length(vector_var);
                                SubLObject current_$30;
                                final SubLObject datum_$29 = current_$30 = (NIL != backwardP_var) ? list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
                                SubLObject start = NIL;
                                SubLObject end = NIL;
                                SubLObject delta = NIL;
                                destructuring_bind_must_consp(current_$30, datum_$29, $list124);
                                start = current_$30.first();
                                current_$30 = current_$30.rest();
                                destructuring_bind_must_consp(current_$30, datum_$29, $list124);
                                end = current_$30.first();
                                current_$30 = current_$30.rest();
                                destructuring_bind_must_consp(current_$30, datum_$29, $list124);
                                delta = current_$30.first();
                                current_$30 = current_$30.rest();
                                if (NIL == current_$30) {
                                    if (NIL == doneP) {
                                        SubLObject end_var;
                                        SubLObject key;
                                        SubLObject value;
                                        for (end_var = end, key = NIL, key = start; (NIL == doneP) && (NIL == subl_macros.do_numbers_endtest(key, delta, end_var)); key = add(key, delta)) {
                                            value = aref(vector_var, key);
                                            value = add(value, ONE_INTEGER);
                                            set_aref(num_top, key, value);
                                            if (key.numE(match_value)) {
                                                doneP = T;
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum_$29, $list124);
                                }
                            }
                            total_testing_time = add(total_testing_time, time_taken);
                            if (time_taken.numG(max_time_per_example)) {
                                max_time_per_example = time_taken;
                            }
                            time_per_example = cons(time_taken, time_per_example);
                        } else {
                            cdestructuring_bind_error(datum_$28, $list120);
                        }
                    }
                    line_number_var = number_utilities.f_1X(line_number_var);
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
        final SubLObject plist = list(new SubLObject[]{ $FUNCTION, EBMT_PARSE, $TESTING_INPUT_SOURCE, testing_source, $TEST_EXAMPLES, num_examples, $SUCCESSFUL_TESTS, num_successful, $SUCCESSFUL_TESTS_PC, number_utilities.percent(num_successful, num_examples, UNPROVIDED), $ALMOST_SUCCESSFUL_TESTS, num_almost_successful, $ALMOST_SUCCESSFUL_TESTS_PC, number_utilities.percent(num_almost_successful, num_examples, UNPROVIDED), $UNKNOWN_TESTS, num_unknown, $UNKNOWN_TESTS_PC, number_utilities.percent(num_unknown, num_examples, UNPROVIDED), $FAILED_TESTS, num_failed, $FAILED_TESTS_PC, number_utilities.percent(num_failed, num_examples, UNPROVIDED), $TOTAL_UNIQUE_INTERPS, num_interps, $MAX_INTERPS_PER_EXAMPLE, max_interps_per_example, $MEAN_INTERPS_PER_EXAMPLE, number_utilities.mean(interps_per_example), $MEDIAN_INTERPS_PER_EXAMPLE, number_utilities.median(interps_per_example, UNPROVIDED, UNPROVIDED), $TOTAL_TESTING_TIME, total_testing_time, $TOTAL_SUCCESSFUL_TIME, total_successful_time, $TOTAL_ALMOST_SUCCESSFUL_TIME, total_almost_successful_time, $TOTAL_UNKNOWN_TIME, total_unknown_time, $TOTAL_FAILED_TIME, total_failed_time, $MAX_TIME_PER_EXAMPLE, max_time_per_example, $MEAN_TIME_PER_EXAMPLE, number_utilities.mean(time_per_example), $MEDIAN_TIME_PER_EXAMPLE, number_utilities.median(time_per_example, UNPROVIDED, UNPROVIDED), $TOP1, aref(num_top, ZERO_INTEGER), $TOP2, aref(num_top, ONE_INTEGER), $TOP3, aref(num_top, TWO_INTEGER), $TOP4, aref(num_top, THREE_INTEGER), $TOP5, aref(num_top, FOUR_INTEGER) });
        return plist;
    }

    /**
     * Writes a property-list of summary info obtained by parsing the EBMT training
     * and parsing tests output files, onto a file F-SUMMARY if F-SUMMARY is non-NIL
     * or else onto 'TEST-DIR/summary.txt'.  If GLOBAL-SUMMARY? is non-NIL, the
     * summary information will be added to the *EBMT-GLOBAL-SUMMARY-FILE*, too.
     */
    @LispMethod(comment = "Writes a property-list of summary info obtained by parsing the EBMT training\r\nand parsing tests output files, onto a file F-SUMMARY if F-SUMMARY is non-NIL\r\nor else onto \'TEST-DIR/summary.txt\'.  If GLOBAL-SUMMARY? is non-NIL, the\r\nsummary information will be added to the *EBMT-GLOBAL-SUMMARY-FILE*, too.\nWrites a property-list of summary info obtained by parsing the EBMT training\nand parsing tests output files, onto a file F-SUMMARY if F-SUMMARY is non-NIL\nor else onto \'TEST-DIR/summary.txt\'.  If GLOBAL-SUMMARY? is non-NIL, the\nsummary information will be added to the *EBMT-GLOBAL-SUMMARY-FILE*, too.")
    public static final SubLObject ebmt_create_summary_alt(SubLObject test_dir, SubLObject training_mt, SubLObject testing_source, SubLObject global_summaryP, SubLObject f_summary, SubLObject testing_output_filename) {
        if (testing_output_filename == UNPROVIDED) {
            testing_output_filename = $ebmt_testing_output_filename$.getGlobalValue();
        }
        {
            SubLObject summary_plist = com.cyc.cycjava.cycl.ebmt_tests.ebmt_summary_plist(test_dir, training_mt, testing_source, testing_output_filename);
            return com.cyc.cycjava.cycl.ebmt_tests.ebmt_output_summary_plist(summary_plist, test_dir, global_summaryP, f_summary);
        }
    }

    /**
     * Writes a property-list of summary info obtained by parsing the EBMT training
     * and parsing tests output files, onto a file F-SUMMARY if F-SUMMARY is non-NIL
     * or else onto 'TEST-DIR/summary.txt'.  If GLOBAL-SUMMARY? is non-NIL, the
     * summary information will be added to the *EBMT-GLOBAL-SUMMARY-FILE*, too.
     */
    @LispMethod(comment = "Writes a property-list of summary info obtained by parsing the EBMT training\r\nand parsing tests output files, onto a file F-SUMMARY if F-SUMMARY is non-NIL\r\nor else onto \'TEST-DIR/summary.txt\'.  If GLOBAL-SUMMARY? is non-NIL, the\r\nsummary information will be added to the *EBMT-GLOBAL-SUMMARY-FILE*, too.\nWrites a property-list of summary info obtained by parsing the EBMT training\nand parsing tests output files, onto a file F-SUMMARY if F-SUMMARY is non-NIL\nor else onto \'TEST-DIR/summary.txt\'.  If GLOBAL-SUMMARY? is non-NIL, the\nsummary information will be added to the *EBMT-GLOBAL-SUMMARY-FILE*, too.")
    public static SubLObject ebmt_create_summary(final SubLObject test_dir, final SubLObject training_mt, final SubLObject testing_source, final SubLObject global_summaryP, final SubLObject f_summary, SubLObject testing_output_filename) {
        if (testing_output_filename == UNPROVIDED) {
            testing_output_filename = $ebmt_testing_output_filename$.getGlobalValue();
        }
        final SubLObject summary_plist = ebmt_summary_plist(test_dir, training_mt, testing_source, testing_output_filename);
        return ebmt_output_summary_plist(summary_plist, test_dir, global_summaryP, f_summary);
    }/**
     * Writes a property-list of summary info obtained by parsing the EBMT training
     * and parsing tests output files, onto a file F-SUMMARY if F-SUMMARY is non-NIL
     * or else onto 'TEST-DIR/summary.txt'.  If GLOBAL-SUMMARY? is non-NIL, the
     * summary information will be added to the *EBMT-GLOBAL-SUMMARY-FILE*, too.
     */


    public static final SubLObject ebmt_summary_plist_alt(SubLObject test_dir, SubLObject training_mt, SubLObject testing_source, SubLObject testing_output_filename) {
        {
            SubLObject summary_plist = NIL;
            summary_plist = putf(summary_plist, $TIMESTAMP, numeric_date_utilities.universal_timestring(UNPROVIDED));
            summary_plist = putf(summary_plist, $KB, kb_loaded());
            summary_plist = putf(summary_plist, $SYSTEM, system_info.cyc_revision_string());
            summary_plist = putf(summary_plist, $HOST, Environment.get_machine_name(UNPROVIDED));
            summary_plist = putf(summary_plist, $BOGOMIPS, misc_utilities.machine_bogomips());
            summary_plist = list_utilities.merge_plist(summary_plist, com.cyc.cycjava.cycl.ebmt_tests.ebmt_training_summary_plist(test_dir, training_mt));
            summary_plist = list_utilities.merge_plist(summary_plist, com.cyc.cycjava.cycl.ebmt_tests.ebmt_testing_summary_plist(test_dir, testing_source, testing_output_filename));
            return summary_plist;
        }
    }

    public static SubLObject ebmt_summary_plist(final SubLObject test_dir, final SubLObject training_mt, final SubLObject testing_source, final SubLObject testing_output_filename) {
        SubLObject summary_plist = NIL;
        summary_plist = putf(summary_plist, $TIMESTAMP, numeric_date_utilities.universal_timestring(UNPROVIDED));
        summary_plist = putf(summary_plist, $KB, kb_loaded());
        summary_plist = putf(summary_plist, $SYSTEM, system_info.cyc_revision_string());
        summary_plist = putf(summary_plist, $HOST, Environment.get_machine_name(UNPROVIDED));
        summary_plist = putf(summary_plist, $BOGOMIPS, misc_utilities.machine_bogomips());
        summary_plist = list_utilities.merge_plist(summary_plist, ebmt_training_summary_plist(test_dir, training_mt));
        summary_plist = list_utilities.merge_plist(summary_plist, ebmt_testing_summary_plist(test_dir, testing_source, testing_output_filename));
        return summary_plist;
    }

    public static final SubLObject ebmt_output_summary_plist_alt(SubLObject summary_plist, SubLObject test_dir, SubLObject global_summaryP, SubLObject f_summary) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == f_summary) {
                f_summary = cconcatenate(test_dir, $str_alt159$summary_txt);
            }
            {
                SubLObject f_summary_plist = cconcatenate(test_dir, $str_alt160$summary_plist_lisp);
                {
                    SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $print_length$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $print_level$.currentBinding(thread);
                    try {
                        $print_pretty$.bind(NIL, thread);
                        $print_length$.bind(NIL, thread);
                        $print_level$.bind(NIL, thread);
                        {
                            SubLObject stream = NIL;
                            try {
                                stream = compatibility.open_text(f_summary_plist, $OUTPUT, NIL);
                                if (!stream.isStream()) {
                                    Errors.error($str_alt57$Unable_to_open__S, f_summary_plist);
                                }
                                {
                                    SubLObject s_summary_plist = stream;
                                    format(s_summary_plist, $str_alt161$_s__, summary_plist);
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_28, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $print_level$.rebind(_prev_bind_2, thread);
                        $print_length$.rebind(_prev_bind_1, thread);
                        $print_pretty$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(f_summary, $APPEND, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt57$Unable_to_open__S, f_summary);
                    }
                    {
                        SubLObject s_summary = stream;
                        list_utilities.pretty_print_plist(summary_plist, s_summary);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            if (NIL != global_summaryP) {
                {
                    SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $print_length$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $print_level$.currentBinding(thread);
                    try {
                        $print_pretty$.bind(NIL, thread);
                        $print_length$.bind(NIL, thread);
                        $print_level$.bind(NIL, thread);
                        {
                            SubLObject stream = NIL;
                            try {
                                stream = compatibility.open_text($ebmt_global_summary_file$.getDynamicValue(thread), $APPEND, NIL);
                                if (!stream.isStream()) {
                                    Errors.error($str_alt57$Unable_to_open__S, $ebmt_global_summary_file$.getDynamicValue(thread));
                                }
                                {
                                    SubLObject s_summary = stream;
                                    format(s_summary, $str_alt161$_s__, summary_plist);
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_29, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $print_level$.rebind(_prev_bind_2, thread);
                        $print_length$.rebind(_prev_bind_1, thread);
                        $print_pretty$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return f_summary;
        }
    }

    public static SubLObject ebmt_output_summary_plist(final SubLObject summary_plist, final SubLObject test_dir, final SubLObject global_summaryP, SubLObject f_summary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == f_summary) {
            f_summary = cconcatenate(test_dir, $str157$summary_txt);
        }
        final SubLObject f_summary_plist = cconcatenate(test_dir, $str158$summary_plist_lisp);
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $print_length$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $print_level$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            $print_length$.bind(NIL, thread);
            $print_level$.bind(NIL, thread);
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(f_summary_plist, $OUTPUT);
                if (!stream.isStream()) {
                    Errors.error($str54$Unable_to_open__S, f_summary_plist);
                }
                final SubLObject s_summary_plist = stream;
                format(s_summary_plist, $str159$_s__, summary_plist);
            } finally {
                final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                }
            }
        } finally {
            $print_level$.rebind(_prev_bind_3, thread);
            $print_length$.rebind(_prev_bind_2, thread);
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        SubLObject stream2 = NIL;
        try {
            stream2 = compatibility.open_text(f_summary, $APPEND);
            if (!stream2.isStream()) {
                Errors.error($str54$Unable_to_open__S, f_summary);
            }
            final SubLObject s_summary = stream2;
            list_utilities.pretty_print_plist(summary_plist, s_summary);
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream2.isStream()) {
                    close(stream2, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        if (NIL != global_summaryP) {
            final SubLObject _prev_bind_5 = $print_pretty$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $print_length$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $print_level$.currentBinding(thread);
            try {
                $print_pretty$.bind(NIL, thread);
                $print_length$.bind(NIL, thread);
                $print_level$.bind(NIL, thread);
                SubLObject stream3 = NIL;
                try {
                    stream3 = compatibility.open_text($ebmt_global_summary_file$.getDynamicValue(thread), $APPEND);
                    if (!stream3.isStream()) {
                        Errors.error($str54$Unable_to_open__S, $ebmt_global_summary_file$.getDynamicValue(thread));
                    }
                    final SubLObject s_summary2 = stream3;
                    format(s_summary2, $str159$_s__, summary_plist);
                } finally {
                    final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        if (stream3.isStream()) {
                            close(stream3, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                    }
                }
            } finally {
                $print_level$.rebind(_prev_bind_7, thread);
                $print_length$.rebind(_prev_bind_6, thread);
                $print_pretty$.rebind(_prev_bind_5, thread);
            }
        }
        return f_summary;
    }

    public static final SubLObject get_ebmt_plot_value_alt(SubLObject keyword) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return getf($ebmt_plot_params$.getDynamicValue(thread), keyword, UNPROVIDED);
        }
    }

    public static SubLObject get_ebmt_plot_value(final SubLObject keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return getf($ebmt_plot_params$.getDynamicValue(thread), keyword, UNPROVIDED);
    }

    public static final SubLObject ground_plot_data_formula_alt(SubLObject formula, SubLObject plot_params) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $ebmt_plot_params$.currentBinding(thread);
                    try {
                        $ebmt_plot_params$.bind(plot_params, thread);
                        formula = transform_list_utilities.transform(formula, KEYWORDP, GET_EBMT_PLOT_VALUE, UNPROVIDED);
                        result = eval(formula);
                    } finally {
                        $ebmt_plot_params$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject ground_plot_data_formula(SubLObject formula, final SubLObject plot_params) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $ebmt_plot_params$.currentBinding(thread);
        try {
            $ebmt_plot_params$.bind(plot_params, thread);
            formula = transform_list_utilities.transform(formula, KEYWORDP, GET_EBMT_PLOT_VALUE, UNPROVIDED);
            result = eval(formula);
        } finally {
            $ebmt_plot_params$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @param INPUT-FILE
    stringp;
     * 		
     * @param REPORT-DATA
     * 		property-list-p; the properties to use to draw the table
     * 		valid params include :xlabel, :ylabel, :plot-tile, :yoriginm :yrange,
     * 		:raw-data-types, :computed-data-types
     * 		:raw-data-types is a plist of datatypes that should be pulled directly
     * 		from the data in INPUT-FILE.
     * 		:computed-data-types should have as its value a plist of the form
     * 		(:data-keyword (STRING-LABEL FORMULA), where FORMULA is the formula
     * 		for computing the value of :data-keyword.  This function will
     * 		substitute the appropriate values from :raw-data-types for any
     * 		keyword found in FORMULA.
     * @param OUTPUT-FILE
     * 		stringp; if present, what file should the resulting graph
     * 		be saved in.  This should be a non-relative path, but should not have
     * 		a suffix. Different versions of plotting programs will use different
     * 		types of files, so you need to let it decide which kind to use.
     * @see EBMT-ACCURACY-REPORT for a clear example use
     */
    @LispMethod(comment = "@param INPUT-FILE\nstringp;\r\n\t\t\r\n@param REPORT-DATA\r\n\t\tproperty-list-p; the properties to use to draw the table\r\n\t\tvalid params include :xlabel, :ylabel, :plot-tile, :yoriginm :yrange,\r\n\t\t:raw-data-types, :computed-data-types\r\n\t\t:raw-data-types is a plist of datatypes that should be pulled directly\r\n\t\tfrom the data in INPUT-FILE.\r\n\t\t:computed-data-types should have as its value a plist of the form\r\n\t\t(:data-keyword (STRING-LABEL FORMULA), where FORMULA is the formula\r\n\t\tfor computing the value of :data-keyword.  This function will\r\n\t\tsubstitute the appropriate values from :raw-data-types for any\r\n\t\tkeyword found in FORMULA.\r\n@param OUTPUT-FILE\r\n\t\tstringp; if present, what file should the resulting graph\r\n\t\tbe saved in.  This should be a non-relative path, but should not have\r\n\t\ta suffix. Different versions of plotting programs will use different\r\n\t\ttypes of files, so you need to let it decide which kind to use.\r\n@see EBMT-ACCURACY-REPORT for a clear example use")
    public static final SubLObject ebmt_report_alt(SubLObject input_file, SubLObject report_data, SubLObject output_file) {
        if (output_file == UNPROVIDED) {
            output_file = NIL;
        }
        {
            SubLObject raw_data_types = getf(report_data, $RAW_DATA_TYPES, UNPROVIDED);
            SubLObject computed_data_types = getf(report_data, $COMPUTED_DATA_TYPES, UNPROVIDED);
            SubLObject defaults = $list_alt167;
            SubLObject augmented_report_data = list_utilities.augment_plist_with_defaults(report_data, defaults);
            SubLObject plot_properties = list_utilities.plist_restricted_to_indicators(augmented_report_data, $list_alt168);
            SubLObject data = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            SubLObject data_keywords = NIL;
            SubLObject computed_data_type_data = NIL;
            SubLObject line_labels = NIL;
            SubLObject plot_data = NIL;
            if (NIL != output_file) {
                plot_properties = putf(plot_properties, $OUTPUT_FILE, output_file);
            }
            {
                SubLObject remainder = NIL;
                for (remainder = raw_data_types; NIL != remainder; remainder = cddr(remainder)) {
                    {
                        SubLObject keyword = remainder.first();
                        SubLObject line_label = cadr(remainder);
                        line_labels = cons(line_label, line_labels);
                        data_keywords = cons(keyword, data_keywords);
                    }
                }
            }
            {
                SubLObject remainder = NIL;
                for (remainder = computed_data_types; NIL != remainder; remainder = cddr(remainder)) {
                    {
                        SubLObject keyword = remainder.first();
                        SubLObject label_and_formula = cadr(remainder);
                        SubLObject datum = label_and_formula;
                        SubLObject current = datum;
                        SubLObject line_label = NIL;
                        SubLObject formula = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt170);
                        line_label = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt170);
                        formula = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            line_labels = cons(line_label, line_labels);
                            data_keywords = cons(keyword, data_keywords);
                            computed_data_type_data = cons(list(keyword, formula), computed_data_type_data);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt170);
                        }
                    }
                }
            }
            plot_properties = putf(plot_properties, $LINE_LABELS, line_labels);
            {
                SubLObject line_number = ZERO_INTEGER;
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(input_file, $INPUT, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt57$Unable_to_open__S, input_file);
                    }
                    {
                        SubLObject infile = stream;
                        if (infile.isStream()) {
                            {
                                SubLObject test_run_summary = NIL;
                                for (test_run_summary = read_line(infile, NIL, NIL, UNPROVIDED); NIL != test_run_summary; test_run_summary = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                    line_number = add(line_number, ONE_INTEGER);
                                    {
                                        SubLObject test_run_plist = read_from_string_ignoring_errors(test_run_summary, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        if (test_run_plist != $EOF) {
                                            {
                                                SubLObject kb = getf(test_run_plist, $KB, UNPROVIDED);
                                                SubLObject test_run_id = line_number;
                                                SubLObject plot_xtic_string = cconcatenate(format_nil.format_nil_a_no_copy(kb), new SubLObject[]{ $str_alt173$_n, format_nil.format_nil_a_no_copy(getf(test_run_plist, $TIMESTAMP, UNPROVIDED)) });
                                                plot_properties = putf(plot_properties, $XTICS, cons(list(plot_xtic_string, line_number), getf(plot_properties, $XTICS, UNPROVIDED)));
                                                {
                                                    SubLObject remainder = NIL;
                                                    for (remainder = raw_data_types; NIL != remainder; remainder = cddr(remainder)) {
                                                        {
                                                            SubLObject keyword = remainder.first();
                                                            SubLObject value = cadr(remainder);
                                                            dictionary_utilities.dictionary_push(data, keyword, list(test_run_id, getf(test_run_plist, keyword, UNPROVIDED)));
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject cdolist_list_var = computed_data_type_data;
                                                    SubLObject computed_data = NIL;
                                                    for (computed_data = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , computed_data = cdolist_list_var.first()) {
                                                        {
                                                            SubLObject datum = computed_data;
                                                            SubLObject current = datum;
                                                            SubLObject keyword = NIL;
                                                            SubLObject formula = NIL;
                                                            destructuring_bind_must_consp(current, datum, $list_alt175);
                                                            keyword = current.first();
                                                            current = current.rest();
                                                            destructuring_bind_must_consp(current, datum, $list_alt175);
                                                            formula = current.first();
                                                            current = current.rest();
                                                            if (NIL == current) {
                                                                {
                                                                    SubLObject value = list(test_run_id, com.cyc.cycjava.cycl.ebmt_tests.ground_plot_data_formula(formula, test_run_plist));
                                                                    dictionary_utilities.dictionary_push(data, keyword, value);
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum, $list_alt175);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = data_keywords;
                SubLObject data_keyword = NIL;
                for (data_keyword = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , data_keyword = cdolist_list_var.first()) {
                    plot_data = cons(dictionary.dictionary_lookup(data, data_keyword, UNPROVIDED), plot_data);
                }
            }
            plot_data = nreverse(plot_data);
            return plot_generation.generate_lines_graph(plot_data, plot_properties);
        }
    }

    /**
     *
     *
     * @param INPUT-FILE
    stringp;
     * 		
     * @param REPORT-DATA
     * 		property-list-p; the properties to use to draw the table
     * 		valid params include :xlabel, :ylabel, :plot-tile, :yoriginm :yrange,
     * 		:raw-data-types, :computed-data-types
     * 		:raw-data-types is a plist of datatypes that should be pulled directly
     * 		from the data in INPUT-FILE.
     * 		:computed-data-types should have as its value a plist of the form
     * 		(:data-keyword (STRING-LABEL FORMULA), where FORMULA is the formula
     * 		for computing the value of :data-keyword.  This function will
     * 		substitute the appropriate values from :raw-data-types for any
     * 		keyword found in FORMULA.
     * @param OUTPUT-FILE
     * 		stringp; if present, what file should the resulting graph
     * 		be saved in.  This should be a non-relative path, but should not have
     * 		a suffix. Different versions of plotting programs will use different
     * 		types of files, so you need to let it decide which kind to use.
     * @see EBMT-ACCURACY-REPORT for a clear example use
     */
    @LispMethod(comment = "@param INPUT-FILE\nstringp;\r\n\t\t\r\n@param REPORT-DATA\r\n\t\tproperty-list-p; the properties to use to draw the table\r\n\t\tvalid params include :xlabel, :ylabel, :plot-tile, :yoriginm :yrange,\r\n\t\t:raw-data-types, :computed-data-types\r\n\t\t:raw-data-types is a plist of datatypes that should be pulled directly\r\n\t\tfrom the data in INPUT-FILE.\r\n\t\t:computed-data-types should have as its value a plist of the form\r\n\t\t(:data-keyword (STRING-LABEL FORMULA), where FORMULA is the formula\r\n\t\tfor computing the value of :data-keyword.  This function will\r\n\t\tsubstitute the appropriate values from :raw-data-types for any\r\n\t\tkeyword found in FORMULA.\r\n@param OUTPUT-FILE\r\n\t\tstringp; if present, what file should the resulting graph\r\n\t\tbe saved in.  This should be a non-relative path, but should not have\r\n\t\ta suffix. Different versions of plotting programs will use different\r\n\t\ttypes of files, so you need to let it decide which kind to use.\r\n@see EBMT-ACCURACY-REPORT for a clear example use")
    public static SubLObject ebmt_report(final SubLObject input_file, final SubLObject report_data, SubLObject output_file) {
        if (output_file == UNPROVIDED) {
            output_file = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject raw_data_types = getf(report_data, $RAW_DATA_TYPES, UNPROVIDED);
        final SubLObject computed_data_types = getf(report_data, $COMPUTED_DATA_TYPES, UNPROVIDED);
        final SubLObject defaults = $list165;
        final SubLObject augmented_report_data = list_utilities.augment_plist_with_defaults(report_data, defaults);
        SubLObject plot_properties = list_utilities.plist_restricted_to_indicators(augmented_report_data, $list166);
        final SubLObject data = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject data_keywords = NIL;
        SubLObject computed_data_type_data = NIL;
        SubLObject line_labels = NIL;
        SubLObject plot_data = NIL;
        if (NIL != output_file) {
            plot_properties = putf(plot_properties, $OUTPUT_FILE, output_file);
        }
        SubLObject remainder;
        SubLObject keyword;
        SubLObject line_label;
        for (remainder = NIL, remainder = raw_data_types; NIL != remainder; remainder = cddr(remainder)) {
            keyword = remainder.first();
            line_label = cadr(remainder);
            line_labels = cons(line_label, line_labels);
            data_keywords = cons(keyword, data_keywords);
        }
        SubLObject label_and_formula;
        SubLObject current;
        SubLObject datum;
        SubLObject line_label2;
        SubLObject formula;
        for (remainder = NIL, remainder = computed_data_types; NIL != remainder; remainder = cddr(remainder)) {
            keyword = remainder.first();
            label_and_formula = cadr(remainder);
            datum = current = label_and_formula;
            line_label2 = NIL;
            formula = NIL;
            destructuring_bind_must_consp(current, datum, $list168);
            line_label2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list168);
            formula = current.first();
            current = current.rest();
            if (NIL == current) {
                line_labels = cons(line_label2, line_labels);
                data_keywords = cons(keyword, data_keywords);
                computed_data_type_data = cons(list(keyword, formula), computed_data_type_data);
            } else {
                cdestructuring_bind_error(datum, $list168);
            }
        }
        plot_properties = putf(plot_properties, $LINE_LABELS, line_labels);
        SubLObject line_number = ZERO_INTEGER;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(input_file, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str54$Unable_to_open__S, input_file);
            }
            final SubLObject infile = stream;
            if (infile.isStream()) {
                SubLObject test_run_summary;
                SubLObject test_run_plist;
                SubLObject kb;
                SubLObject test_run_id;
                SubLObject plot_xtic_string;
                SubLObject remainder2;
                SubLObject keyword2;
                SubLObject value;
                SubLObject cdolist_list_var;
                SubLObject computed_data;
                SubLObject current2;
                SubLObject datum2;
                SubLObject keyword3;
                SubLObject formula2;
                SubLObject value2;
                for (test_run_summary = NIL, test_run_summary = file_utilities.cdolines_get_next_line(infile); NIL != test_run_summary; test_run_summary = file_utilities.cdolines_get_next_line(infile)) {
                    line_number = add(line_number, ONE_INTEGER);
                    test_run_plist = read_from_string_ignoring_errors(test_run_summary, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (test_run_plist != $EOF) {
                        kb = getf(test_run_plist, $KB, UNPROVIDED);
                        test_run_id = line_number;
                        plot_xtic_string = cconcatenate(format_nil.format_nil_a_no_copy(kb), new SubLObject[]{ $str171$_n, format_nil.format_nil_a_no_copy(getf(test_run_plist, $TIMESTAMP, UNPROVIDED)) });
                        plot_properties = putf(plot_properties, $XTICS, cons(list(plot_xtic_string, line_number), getf(plot_properties, $XTICS, UNPROVIDED)));
                        for (remainder2 = NIL, remainder2 = raw_data_types; NIL != remainder2; remainder2 = cddr(remainder2)) {
                            keyword2 = remainder2.first();
                            value = cadr(remainder2);
                            dictionary_utilities.dictionary_push(data, keyword2, list(test_run_id, getf(test_run_plist, keyword2, UNPROVIDED)));
                        }
                        cdolist_list_var = computed_data_type_data;
                        computed_data = NIL;
                        computed_data = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            datum2 = current2 = computed_data;
                            keyword3 = NIL;
                            formula2 = NIL;
                            destructuring_bind_must_consp(current2, datum2, $list173);
                            keyword3 = current2.first();
                            current2 = current2.rest();
                            destructuring_bind_must_consp(current2, datum2, $list173);
                            formula2 = current2.first();
                            current2 = current2.rest();
                            if (NIL == current2) {
                                value2 = list(test_run_id, ground_plot_data_formula(formula2, test_run_plist));
                                dictionary_utilities.dictionary_push(data, keyword3, value2);
                            } else {
                                cdestructuring_bind_error(datum2, $list173);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            computed_data = cdolist_list_var.first();
                        } 
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
        SubLObject cdolist_list_var2 = data_keywords;
        SubLObject data_keyword = NIL;
        data_keyword = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            plot_data = cons(dictionary.dictionary_lookup(data, data_keyword, UNPROVIDED), plot_data);
            cdolist_list_var2 = cdolist_list_var2.rest();
            data_keyword = cdolist_list_var2.first();
        } 
        plot_data = nreverse(plot_data);
        return plot_generation.generate_lines_graph(plot_data, plot_properties);
    }

    public static final SubLObject ebmt_training_recall_report_alt(SubLObject input_file, SubLObject output_file) {
        if (output_file == UNPROVIDED) {
            output_file = NIL;
        }
        return com.cyc.cycjava.cycl.ebmt_tests.ebmt_report(input_file, $list_alt176, output_file);
    }

    public static SubLObject ebmt_training_recall_report(final SubLObject input_file, SubLObject output_file) {
        if (output_file == UNPROVIDED) {
            output_file = NIL;
        }
        return ebmt_report(input_file, $list174, output_file);
    }

    public static final SubLObject ebmt_timing_report_alt(SubLObject input_file, SubLObject output_file) {
        if (output_file == UNPROVIDED) {
            output_file = NIL;
        }
        return com.cyc.cycjava.cycl.ebmt_tests.ebmt_report(input_file, $list_alt177, output_file);
    }

    public static SubLObject ebmt_timing_report(final SubLObject input_file, SubLObject output_file) {
        if (output_file == UNPROVIDED) {
            output_file = NIL;
        }
        return ebmt_report(input_file, $list175, output_file);
    }

    public static final SubLObject ebmt_accuracy_report_alt(SubLObject input_file, SubLObject output_file) {
        if (output_file == UNPROVIDED) {
            output_file = NIL;
        }
        return com.cyc.cycjava.cycl.ebmt_tests.ebmt_report(input_file, $list_alt178, output_file);
    }

    public static SubLObject ebmt_accuracy_report(final SubLObject input_file, SubLObject output_file) {
        if (output_file == UNPROVIDED) {
            output_file = NIL;
        }
        return ebmt_report(input_file, $list176, output_file);
    }

    public static final SubLObject ebmt_parsing_results_alt(SubLObject input_file, SubLObject output_file) {
        if (output_file == UNPROVIDED) {
            output_file = NIL;
        }
        return com.cyc.cycjava.cycl.ebmt_tests.ebmt_report(input_file, $list_alt179, output_file);
    }

    public static SubLObject ebmt_parsing_results(final SubLObject input_file, SubLObject output_file) {
        if (output_file == UNPROVIDED) {
            output_file = NIL;
        }
        return ebmt_report(input_file, $list177, output_file);
    }

    public static final SubLObject ebmt_update_evaluation_graphs_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.ebmt_tests.ebmt_training_recall_report($ebmt_global_summary_file$.getDynamicValue(thread), $ebmt_training_recall_graph$.getDynamicValue(thread));
            com.cyc.cycjava.cycl.ebmt_tests.ebmt_accuracy_report($ebmt_global_summary_file$.getDynamicValue(thread), $ebmt_accuracy_graph$.getDynamicValue(thread));
            com.cyc.cycjava.cycl.ebmt_tests.ebmt_parsing_results($ebmt_global_summary_file$.getDynamicValue(thread), $ebmt_parsing_results_graph$.getDynamicValue(thread));
            return $EBMT_GRAPHS_UPDATED;
        }
    }

    public static SubLObject ebmt_update_evaluation_graphs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        ebmt_training_recall_report($ebmt_global_summary_file$.getDynamicValue(thread), $ebmt_training_recall_graph$.getDynamicValue(thread));
        ebmt_accuracy_report($ebmt_global_summary_file$.getDynamicValue(thread), $ebmt_accuracy_graph$.getDynamicValue(thread));
        ebmt_parsing_results($ebmt_global_summary_file$.getDynamicValue(thread), $ebmt_parsing_results_graph$.getDynamicValue(thread));
        return $EBMT_GRAPHS_UPDATED;
    }

    public static final SubLObject declare_ebmt_tests_file_alt() {
        declareMacro("with_standard_ebmt_testing_state", "WITH-STANDARD-EBMT-TESTING-STATE");
        declareMacro("do_ebmt_nl_cycl_pairs_from_source", "DO-EBMT-NL-CYCL-PAIRS-FROM-SOURCE");
        declareMacro("ebmt_do_testing_output_data_from_file", "EBMT-DO-TESTING-OUTPUT-DATA-FROM-FILE");
        declareFunction("ebmt_test_func", "EBMT-TEST-FUNC", 2, 0, false);
        declareFunction("ebmt_test_loop_single_corpus", "EBMT-TEST-LOOP-SINGLE-CORPUS", 3, 6, false);
        declareFunction("ebmt_evaluation_ql_mt", "EBMT-EVALUATION-QL-MT", 0, 0, false);
        declareFunction("ebmt_evaluation_financial_mt", "EBMT-EVALUATION-FINANCIAL-MT", 0, 0, false);
        declareFunction("ebmt_evaluation_financial_file", "EBMT-EVALUATION-FINANCIAL-FILE", 0, 0, false);
        declareFunction("ebmt_possibly_update_keepalive_file", "EBMT-POSSIBLY-UPDATE-KEEPALIVE-FILE", 0, 0, false);
        declareFunction("ebmt_keepalive_filename", "EBMT-KEEPALIVE-FILENAME", 0, 0, false);
        declareFunction("ebmt_index_server_process", "EBMT-INDEX-SERVER-PROCESS", 1, 0, false);
        declareFunction("ebmt_nl_cycl_pairs_from_source", "EBMT-NL-CYCL-PAIRS-FROM-SOURCE", 2, 0, false);
        declareFunction("ebmt_nl_cycl_pairs_from_file", "EBMT-NL-CYCL-PAIRS-FROM-FILE", 2, 0, false);
        declareFunction("ebmt_nl_cycl_pairs_from_kb", "EBMT-NL-CYCL-PAIRS-FROM-KB", 2, 0, false);
        declareFunction("ebmt_test_index_creation", "EBMT-TEST-INDEX-CREATION", 3, 1, false);
        declareFunction("ebmt_test_parsing_with_index", "EBMT-TEST-PARSING-WITH-INDEX", 3, 0, false);
        declareFunction("ebmt_testing_source_p", "EBMT-TESTING-SOURCE-P", 1, 0, false);
        declareFunction("ebmt_compute_match_list_and_result", "EBMT-COMPUTE-MATCH-LIST-AND-RESULT", 2, 0, false);
        declareFunction("write_one_line_to_ebmt_testing_output_file", "WRITE-ONE-LINE-TO-EBMT-TESTING-OUTPUT-FILE", 9, 0, false);
        declareFunction("ebmt_training_summary_plist", "EBMT-TRAINING-SUMMARY-PLIST", 2, 0, false);
        declareFunction("ebmt_testing_output_datum_p", "EBMT-TESTING-OUTPUT-DATUM-P", 1, 0, false);
        declareFunction("ebmt_testing_summary_plist", "EBMT-TESTING-SUMMARY-PLIST", 3, 0, false);
        declareFunction("ebmt_create_summary", "EBMT-CREATE-SUMMARY", 5, 1, false);
        declareFunction("ebmt_summary_plist", "EBMT-SUMMARY-PLIST", 4, 0, false);
        declareFunction("ebmt_output_summary_plist", "EBMT-OUTPUT-SUMMARY-PLIST", 4, 0, false);
        declareFunction("get_ebmt_plot_value", "GET-EBMT-PLOT-VALUE", 1, 0, false);
        declareFunction("ground_plot_data_formula", "GROUND-PLOT-DATA-FORMULA", 2, 0, false);
        declareFunction("ebmt_report", "EBMT-REPORT", 2, 1, false);
        declareFunction("ebmt_training_recall_report", "EBMT-TRAINING-RECALL-REPORT", 1, 1, false);
        declareFunction("ebmt_timing_report", "EBMT-TIMING-REPORT", 1, 1, false);
        declareFunction("ebmt_accuracy_report", "EBMT-ACCURACY-REPORT", 1, 1, false);
        declareFunction("ebmt_parsing_results", "EBMT-PARSING-RESULTS", 1, 1, false);
        declareFunction("ebmt_update_evaluation_graphs", "EBMT-UPDATE-EVALUATION-GRAPHS", 0, 0, false);
        declareFunction("ebmt_prepare_testing_output_for_scoring", "EBMT-PREPARE-TESTING-OUTPUT-FOR-SCORING", 1, 0, false);
        declareFunction("ebmt_score_testing_output", "EBMT-SCORE-TESTING-OUTPUT", 1, 0, false);
        declareFunction("ebmt_results_to_match_list", "EBMT-RESULTS-TO-MATCH-LIST", 1, 0, false);
        declareFunction("ebmt_result_to_match_list_item", "EBMT-RESULT-TO-MATCH-LIST-ITEM", 1, 0, false);
        declareFunction("ebmt_aggregate_result", "EBMT-AGGREGATE-RESULT", 1, 0, false);
        declareFunction("ebmt_extract_results_from_scored_lines_file", "EBMT-EXTRACT-RESULTS-FROM-SCORED-LINES-FILE", 1, 0, false);
        declareFunction("eat_one_xml_tag", "EAT-ONE-XML-TAG", 1, 0, false);
        declareFunction("ebmt_scoring_tag_to_keyword", "EBMT-SCORING-TAG-TO-KEYWORD", 1, 0, false);
        declareFunction("ebmt_keyword_to_scoring_tag", "EBMT-KEYWORD-TO-SCORING-TAG", 1, 0, false);
        declareFunction("ebmt_slurp_scored_lines_cache", "EBMT-SLURP-SCORED-LINES-CACHE", 0, 0, false);
        declareFunction("ebmt_scored_lines_cache_lookup", "EBMT-SCORED-LINES-CACHE-LOOKUP", 2, 0, false);
        declareFunction("ebmt_score_lines_file_automatically", "EBMT-SCORE-LINES-FILE-AUTOMATICALLY", 1, 0, false);
        declareFunction("ebmt_create_revised_summary", "EBMT-CREATE-REVISED-SUMMARY", 4, 1, false);
        declareFunction("run_end_to_end_ebmt_earnings_reports_tests", "RUN-END-TO-END-EBMT-EARNINGS-REPORTS-TESTS", 0, 2, false);
        declareFunction("create_end_to_end_ebmt_earnings_reports_tests_output_dir", "CREATE-END-TO-END-EBMT-EARNINGS-REPORTS-TESTS-OUTPUT-DIR", 0, 0, false);
        declareFunction("end_to_end_ebmt_earnings_reports_tests_output_dir", "END-TO-END-EBMT-EARNINGS-REPORTS-TESTS-OUTPUT-DIR", 0, 0, false);
        declareFunction("extract_tables_from_raw_earnings_reports", "EXTRACT-TABLES-FROM-RAW-EARNINGS-REPORTS", 1, 0, false);
        declareFunction("cy_fi_sentencify_directory", "CY-FI-SENTENCIFY-DIRECTORY", 2, 0, false);
        declareFunction("cy_fi_sentencify_filemask", "CY-FI-SENTENCIFY-FILEMASK", 2, 0, false);
        declareFunction("cy_fi_sentence_filename", "CY-FI-SENTENCE-FILENAME", 1, 0, false);
        declareFunction("ebmt_earnings_reports_revised_summary_filename", "EBMT-EARNINGS-REPORTS-REVISED-SUMMARY-FILENAME", 1, 0, false);
        declareFunction("run_end_to_end_earnings_from_sentences_tests", "RUN-END-TO-END-EARNINGS-FROM-SENTENCES-TESTS", 0, 1, false);
        declareFunction("run_one_earnings_from_sentences_test", "RUN-ONE-EARNINGS-FROM-SENTENCES-TEST", 4, 0, false);
        declareFunction("create_end_to_end_earnings_from_sentences_tests_output_dir", "CREATE-END-TO-END-EARNINGS-FROM-SENTENCES-TESTS-OUTPUT-DIR", 0, 0, false);
        declareFunction("end_to_end_earnings_from_sentences_tests_output_dir", "END-TO-END-EARNINGS-FROM-SENTENCES-TESTS-OUTPUT-DIR", 0, 0, false);
        return NIL;
    }

    public static SubLObject declare_ebmt_tests_file() {
        if (SubLFiles.USE_V1) {
            declareMacro("with_standard_ebmt_testing_state", "WITH-STANDARD-EBMT-TESTING-STATE");
            declareMacro("do_ebmt_nl_cycl_pairs_from_source", "DO-EBMT-NL-CYCL-PAIRS-FROM-SOURCE");
            declareMacro("ebmt_do_testing_output_data_from_file", "EBMT-DO-TESTING-OUTPUT-DATA-FROM-FILE");
            declareFunction("ebmt_test_func", "EBMT-TEST-FUNC", 2, 0, false);
            declareFunction("ebmt_test_loop_single_corpus", "EBMT-TEST-LOOP-SINGLE-CORPUS", 3, 6, false);
            declareFunction("ebmt_evaluation_ql_mt", "EBMT-EVALUATION-QL-MT", 0, 0, false);
            declareFunction("ebmt_evaluation_financial_mt", "EBMT-EVALUATION-FINANCIAL-MT", 0, 0, false);
            declareFunction("ebmt_evaluation_financial_file", "EBMT-EVALUATION-FINANCIAL-FILE", 0, 0, false);
            declareFunction("ebmt_possibly_update_keepalive_file", "EBMT-POSSIBLY-UPDATE-KEEPALIVE-FILE", 0, 0, false);
            declareFunction("ebmt_keepalive_filename", "EBMT-KEEPALIVE-FILENAME", 0, 0, false);
            declareFunction("ebmt_index_server_process", "EBMT-INDEX-SERVER-PROCESS", 1, 0, false);
            declareFunction("ebmt_nl_cycl_pairs_from_source", "EBMT-NL-CYCL-PAIRS-FROM-SOURCE", 2, 0, false);
            declareFunction("ebmt_nl_cycl_pairs_from_file", "EBMT-NL-CYCL-PAIRS-FROM-FILE", 2, 0, false);
            declareFunction("ebmt_nl_cycl_pairs_from_kb", "EBMT-NL-CYCL-PAIRS-FROM-KB", 2, 0, false);
            declareFunction("ebmt_test_index_creation", "EBMT-TEST-INDEX-CREATION", 3, 1, false);
            declareFunction("ebmt_test_parsing_with_index", "EBMT-TEST-PARSING-WITH-INDEX", 3, 0, false);
            declareFunction("ebmt_testing_source_p", "EBMT-TESTING-SOURCE-P", 1, 0, false);
            declareFunction("ebmt_compute_match_list_and_result", "EBMT-COMPUTE-MATCH-LIST-AND-RESULT", 2, 0, false);
            declareFunction("write_one_line_to_ebmt_testing_output_file", "WRITE-ONE-LINE-TO-EBMT-TESTING-OUTPUT-FILE", 9, 0, false);
            declareFunction("ebmt_training_summary_plist", "EBMT-TRAINING-SUMMARY-PLIST", 2, 0, false);
            declareFunction("ebmt_testing_output_datum_p", "EBMT-TESTING-OUTPUT-DATUM-P", 1, 0, false);
            declareFunction("ebmt_testing_summary_plist", "EBMT-TESTING-SUMMARY-PLIST", 3, 0, false);
            declareFunction("ebmt_create_summary", "EBMT-CREATE-SUMMARY", 5, 1, false);
            declareFunction("ebmt_summary_plist", "EBMT-SUMMARY-PLIST", 4, 0, false);
            declareFunction("ebmt_output_summary_plist", "EBMT-OUTPUT-SUMMARY-PLIST", 4, 0, false);
            declareFunction("get_ebmt_plot_value", "GET-EBMT-PLOT-VALUE", 1, 0, false);
            declareFunction("ground_plot_data_formula", "GROUND-PLOT-DATA-FORMULA", 2, 0, false);
            declareFunction("ebmt_report", "EBMT-REPORT", 2, 1, false);
            declareFunction("ebmt_training_recall_report", "EBMT-TRAINING-RECALL-REPORT", 1, 1, false);
            declareFunction("ebmt_timing_report", "EBMT-TIMING-REPORT", 1, 1, false);
            declareFunction("ebmt_accuracy_report", "EBMT-ACCURACY-REPORT", 1, 1, false);
            declareFunction("ebmt_parsing_results", "EBMT-PARSING-RESULTS", 1, 1, false);
            declareFunction("ebmt_update_evaluation_graphs", "EBMT-UPDATE-EVALUATION-GRAPHS", 0, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("ebmt_prepare_testing_output_for_scoring", "EBMT-PREPARE-TESTING-OUTPUT-FOR-SCORING", 1, 0, false);
            declareFunction("ebmt_score_testing_output", "EBMT-SCORE-TESTING-OUTPUT", 1, 0, false);
            declareFunction("ebmt_results_to_match_list", "EBMT-RESULTS-TO-MATCH-LIST", 1, 0, false);
            declareFunction("ebmt_result_to_match_list_item", "EBMT-RESULT-TO-MATCH-LIST-ITEM", 1, 0, false);
            declareFunction("ebmt_aggregate_result", "EBMT-AGGREGATE-RESULT", 1, 0, false);
            declareFunction("ebmt_extract_results_from_scored_lines_file", "EBMT-EXTRACT-RESULTS-FROM-SCORED-LINES-FILE", 1, 0, false);
            declareFunction("eat_one_xml_tag", "EAT-ONE-XML-TAG", 1, 0, false);
            declareFunction("ebmt_scoring_tag_to_keyword", "EBMT-SCORING-TAG-TO-KEYWORD", 1, 0, false);
            declareFunction("ebmt_keyword_to_scoring_tag", "EBMT-KEYWORD-TO-SCORING-TAG", 1, 0, false);
            declareFunction("ebmt_slurp_scored_lines_cache", "EBMT-SLURP-SCORED-LINES-CACHE", 0, 0, false);
            declareFunction("ebmt_scored_lines_cache_lookup", "EBMT-SCORED-LINES-CACHE-LOOKUP", 2, 0, false);
            declareFunction("ebmt_score_lines_file_automatically", "EBMT-SCORE-LINES-FILE-AUTOMATICALLY", 1, 0, false);
            declareFunction("ebmt_create_revised_summary", "EBMT-CREATE-REVISED-SUMMARY", 4, 1, false);
            declareFunction("run_end_to_end_ebmt_earnings_reports_tests", "RUN-END-TO-END-EBMT-EARNINGS-REPORTS-TESTS", 0, 2, false);
            declareFunction("create_end_to_end_ebmt_earnings_reports_tests_output_dir", "CREATE-END-TO-END-EBMT-EARNINGS-REPORTS-TESTS-OUTPUT-DIR", 0, 0, false);
            declareFunction("end_to_end_ebmt_earnings_reports_tests_output_dir", "END-TO-END-EBMT-EARNINGS-REPORTS-TESTS-OUTPUT-DIR", 0, 0, false);
            declareFunction("extract_tables_from_raw_earnings_reports", "EXTRACT-TABLES-FROM-RAW-EARNINGS-REPORTS", 1, 0, false);
            declareFunction("cy_fi_sentencify_directory", "CY-FI-SENTENCIFY-DIRECTORY", 2, 0, false);
            declareFunction("cy_fi_sentencify_filemask", "CY-FI-SENTENCIFY-FILEMASK", 2, 0, false);
            declareFunction("cy_fi_sentence_filename", "CY-FI-SENTENCE-FILENAME", 1, 0, false);
            declareFunction("ebmt_earnings_reports_revised_summary_filename", "EBMT-EARNINGS-REPORTS-REVISED-SUMMARY-FILENAME", 1, 0, false);
            declareFunction("run_end_to_end_earnings_from_sentences_tests", "RUN-END-TO-END-EARNINGS-FROM-SENTENCES-TESTS", 0, 1, false);
            declareFunction("run_one_earnings_from_sentences_test", "RUN-ONE-EARNINGS-FROM-SENTENCES-TEST", 4, 0, false);
            declareFunction("create_end_to_end_earnings_from_sentences_tests_output_dir", "CREATE-END-TO-END-EARNINGS-FROM-SENTENCES-TESTS-OUTPUT-DIR", 0, 0, false);
            declareFunction("end_to_end_earnings_from_sentences_tests_output_dir", "END-TO-END-EARNINGS-FROM-SENTENCES-TESTS-OUTPUT-DIR", 0, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_ebmt_tests_file_Previous() {
        declareMacro("with_standard_ebmt_testing_state", "WITH-STANDARD-EBMT-TESTING-STATE");
        declareMacro("do_ebmt_nl_cycl_pairs_from_source", "DO-EBMT-NL-CYCL-PAIRS-FROM-SOURCE");
        declareMacro("ebmt_do_testing_output_data_from_file", "EBMT-DO-TESTING-OUTPUT-DATA-FROM-FILE");
        declareFunction("ebmt_test_func", "EBMT-TEST-FUNC", 2, 0, false);
        declareFunction("ebmt_test_loop_single_corpus", "EBMT-TEST-LOOP-SINGLE-CORPUS", 3, 6, false);
        declareFunction("ebmt_evaluation_ql_mt", "EBMT-EVALUATION-QL-MT", 0, 0, false);
        declareFunction("ebmt_evaluation_financial_mt", "EBMT-EVALUATION-FINANCIAL-MT", 0, 0, false);
        declareFunction("ebmt_evaluation_financial_file", "EBMT-EVALUATION-FINANCIAL-FILE", 0, 0, false);
        declareFunction("ebmt_possibly_update_keepalive_file", "EBMT-POSSIBLY-UPDATE-KEEPALIVE-FILE", 0, 0, false);
        declareFunction("ebmt_keepalive_filename", "EBMT-KEEPALIVE-FILENAME", 0, 0, false);
        declareFunction("ebmt_index_server_process", "EBMT-INDEX-SERVER-PROCESS", 1, 0, false);
        declareFunction("ebmt_nl_cycl_pairs_from_source", "EBMT-NL-CYCL-PAIRS-FROM-SOURCE", 2, 0, false);
        declareFunction("ebmt_nl_cycl_pairs_from_file", "EBMT-NL-CYCL-PAIRS-FROM-FILE", 2, 0, false);
        declareFunction("ebmt_nl_cycl_pairs_from_kb", "EBMT-NL-CYCL-PAIRS-FROM-KB", 2, 0, false);
        declareFunction("ebmt_test_index_creation", "EBMT-TEST-INDEX-CREATION", 3, 1, false);
        declareFunction("ebmt_test_parsing_with_index", "EBMT-TEST-PARSING-WITH-INDEX", 3, 0, false);
        declareFunction("ebmt_testing_source_p", "EBMT-TESTING-SOURCE-P", 1, 0, false);
        declareFunction("ebmt_compute_match_list_and_result", "EBMT-COMPUTE-MATCH-LIST-AND-RESULT", 2, 0, false);
        declareFunction("write_one_line_to_ebmt_testing_output_file", "WRITE-ONE-LINE-TO-EBMT-TESTING-OUTPUT-FILE", 9, 0, false);
        declareFunction("ebmt_training_summary_plist", "EBMT-TRAINING-SUMMARY-PLIST", 2, 0, false);
        declareFunction("ebmt_testing_output_datum_p", "EBMT-TESTING-OUTPUT-DATUM-P", 1, 0, false);
        declareFunction("ebmt_testing_summary_plist", "EBMT-TESTING-SUMMARY-PLIST", 3, 0, false);
        declareFunction("ebmt_create_summary", "EBMT-CREATE-SUMMARY", 5, 1, false);
        declareFunction("ebmt_summary_plist", "EBMT-SUMMARY-PLIST", 4, 0, false);
        declareFunction("ebmt_output_summary_plist", "EBMT-OUTPUT-SUMMARY-PLIST", 4, 0, false);
        declareFunction("get_ebmt_plot_value", "GET-EBMT-PLOT-VALUE", 1, 0, false);
        declareFunction("ground_plot_data_formula", "GROUND-PLOT-DATA-FORMULA", 2, 0, false);
        declareFunction("ebmt_report", "EBMT-REPORT", 2, 1, false);
        declareFunction("ebmt_training_recall_report", "EBMT-TRAINING-RECALL-REPORT", 1, 1, false);
        declareFunction("ebmt_timing_report", "EBMT-TIMING-REPORT", 1, 1, false);
        declareFunction("ebmt_accuracy_report", "EBMT-ACCURACY-REPORT", 1, 1, false);
        declareFunction("ebmt_parsing_results", "EBMT-PARSING-RESULTS", 1, 1, false);
        declareFunction("ebmt_update_evaluation_graphs", "EBMT-UPDATE-EVALUATION-GRAPHS", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_ebmt_tests_file_alt() {
        deflexical("*EBMT-TRAINING-OUTPUT-FILENAME*", $str_alt0$training_output_txt);
        deflexical("*EBMT-TESTING-OUTPUT-FILENAME*", $str_alt1$testing_output_txt);
        deflexical("*EBMT-NOT-YET-SCORED-LINES-FILENAME*", $str_alt2$to_be_scored_lines_txt);
        deflexical("*EBMT-SCORED-LINES-FILENAME*", $str_alt3$scored_lines_txt);
        deflexical("*EBMT-SCORED-DATA-FILENAME*", $str_alt4$scored_data_txt);
        defparameter("*EBMT-KEEPALIVE-ENABLED?*", NIL);
        defparameter("*EBMT-GLOBAL-SUMMARY-FILE*", $str_alt5$);
        defparameter("*EBMT-TRAINING-RECALL-GRAPH*", $str_alt5$);
        defparameter("*EBMT-PARSING-RESULTS-GRAPH*", $str_alt5$);
        defparameter("*EBMT-ACCURACY-GRAPH*", $str_alt5$);
        defparameter("*EBMT-PLOT-PARAMS*", NIL);
        deflexical("*EBMT-SCORED-LINES-CACHE-PATHNAME*", $str_alt181$_cyc_top_data_ebmt_testing_ebmt_s);
        deflexical("*EBMT-ORDERED-RESULTS*", $list_alt186);
        deflexical("*CY-FI-EBMT-INPUT-MT*", $const70$EBMTTrainingExamplesForWesternBus);
        deflexical("*CY-FI-SENTENCIFIER-SCRIPT-FILENAME*", cconcatenate(cycorp_utilities.cycorp_global_cvs_cyc_perl_dir(), $str_alt198$cy_fi_cy_fi_sentencifier_perl));
        deflexical("*CY-FI-EARNINGS-REPORTS-FILEMASK*", $str_alt199$__txt);
        deflexical("*CY-FI-SENTENCE-FILENAME*", $str_alt200$sentence_list_text);
        deflexical("*END-TO-END-EBMT-EARNINGS-REPORTS-TESTS-DIR*", $str_alt201$_cyc_top_data_ebmt_testing_earnin);
        deflexical("*CY-FI-EARNINGS-REPORTS-SUFFIX*", $str_alt206$_txt);
        deflexical("*END-TO-END-EARNINGS-FROM-SENTENCES-TESTS-DIR*", $str_alt207$_cyc_top_data_cy_fi_earnings_from);
        return NIL;
    }

    public static SubLObject init_ebmt_tests_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*EBMT-TRAINING-OUTPUT-FILENAME*", $str0$training_output_txt);
            deflexical("*EBMT-TESTING-OUTPUT-FILENAME*", $str1$testing_output_txt);
            deflexical("*EBMT-NOT-YET-SCORED-LINES-FILENAME*", $str2$to_be_scored_lines_txt);
            deflexical("*EBMT-SCORED-LINES-FILENAME*", $str3$scored_lines_txt);
            deflexical("*EBMT-SCORED-DATA-FILENAME*", $str4$scored_data_txt);
            defparameter("*EBMT-KEEPALIVE-ENABLED?*", NIL);
            defparameter("*EBMT-GLOBAL-SUMMARY-FILE*", $str5$);
            defparameter("*EBMT-TRAINING-RECALL-GRAPH*", $str5$);
            defparameter("*EBMT-PARSING-RESULTS-GRAPH*", $str5$);
            defparameter("*EBMT-ACCURACY-GRAPH*", $str5$);
            defparameter("*EBMT-PLOT-PARAMS*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*EBMT-SCORED-LINES-CACHE-PATHNAME*", $str_alt181$_cyc_top_data_ebmt_testing_ebmt_s);
            deflexical("*EBMT-ORDERED-RESULTS*", $list_alt186);
            deflexical("*CY-FI-EBMT-INPUT-MT*", $const70$EBMTTrainingExamplesForWesternBus);
            deflexical("*CY-FI-SENTENCIFIER-SCRIPT-FILENAME*", cconcatenate(cycorp_utilities.cycorp_global_cvs_cyc_perl_dir(), $str_alt198$cy_fi_cy_fi_sentencifier_perl));
            deflexical("*CY-FI-EARNINGS-REPORTS-FILEMASK*", $str_alt199$__txt);
            deflexical("*CY-FI-SENTENCE-FILENAME*", $str_alt200$sentence_list_text);
            deflexical("*END-TO-END-EBMT-EARNINGS-REPORTS-TESTS-DIR*", $str_alt201$_cyc_top_data_ebmt_testing_earnin);
            deflexical("*CY-FI-EARNINGS-REPORTS-SUFFIX*", $str_alt206$_txt);
            deflexical("*END-TO-END-EARNINGS-FROM-SENTENCES-TESTS-DIR*", $str_alt207$_cyc_top_data_cy_fi_earnings_from);
        }
        return NIL;
    }

    public static SubLObject init_ebmt_tests_file_Previous() {
        deflexical("*EBMT-TRAINING-OUTPUT-FILENAME*", $str0$training_output_txt);
        deflexical("*EBMT-TESTING-OUTPUT-FILENAME*", $str1$testing_output_txt);
        deflexical("*EBMT-NOT-YET-SCORED-LINES-FILENAME*", $str2$to_be_scored_lines_txt);
        deflexical("*EBMT-SCORED-LINES-FILENAME*", $str3$scored_lines_txt);
        deflexical("*EBMT-SCORED-DATA-FILENAME*", $str4$scored_data_txt);
        defparameter("*EBMT-KEEPALIVE-ENABLED?*", NIL);
        defparameter("*EBMT-GLOBAL-SUMMARY-FILE*", $str5$);
        defparameter("*EBMT-TRAINING-RECALL-GRAPH*", $str5$);
        defparameter("*EBMT-PARSING-RESULTS-GRAPH*", $str5$);
        defparameter("*EBMT-ACCURACY-GRAPH*", $str5$);
        defparameter("*EBMT-PLOT-PARAMS*", NIL);
        return NIL;
    }

    public static final SubLObject setup_ebmt_tests_file_alt() {
        define_test_case_table_int(EBMT_CANONICALIZE_EL_SENTENCE, list(new SubLObject[]{ $TEST, EQUALP, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt48);
        define_test_case_table_int(EBMT_PARSE, list(new SubLObject[]{ $TEST, symbol_function(EBMT_TEST_FUNC), $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list_alt52);
        define_test_case_table_int(EBMT_CREATE_AND_TEST_TEMPLATES, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt54);
        return NIL;
    }

    public static SubLObject setup_ebmt_tests_file() {
        if (SubLFiles.USE_V1) {
            define_test_case_table_int(EBMT_CANONICALIZE_EL_SENTENCE, list(new SubLObject[]{ $TEST, EQUALP, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list47);
            define_test_case_table_int(EBMT_PARSE, list(new SubLObject[]{ $TEST, symbol_function(EBMT_TEST_FUNC), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list51);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(EBMT_CANONICALIZE_EL_SENTENCE, list(new SubLObject[]{ $TEST, EQUALP, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt48);
            define_test_case_table_int(EBMT_PARSE, list(new SubLObject[]{ $TEST, symbol_function(EBMT_TEST_FUNC), $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list_alt52);
            define_test_case_table_int(EBMT_CREATE_AND_TEST_TEMPLATES, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt54);
        }
        return NIL;
    }

    public static SubLObject setup_ebmt_tests_file_Previous() {
        define_test_case_table_int(EBMT_CANONICALIZE_EL_SENTENCE, list(new SubLObject[]{ $TEST, EQUALP, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list47);
        define_test_case_table_int(EBMT_PARSE, list(new SubLObject[]{ $TEST, symbol_function(EBMT_TEST_FUNC), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list51);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_ebmt_tests_file();
    }

    @Override
    public void initializeVariables() {
        init_ebmt_tests_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_ebmt_tests_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$training_output_txt = makeString("training-output.txt");

    static private final SubLString $str_alt1$testing_output_txt = makeString("testing-output.txt");

    static private final SubLString $str_alt2$to_be_scored_lines_txt = makeString("to-be-scored-lines.txt");

    static private final SubLString $str_alt3$scored_lines_txt = makeString("scored-lines.txt");

    static private final SubLString $str_alt4$scored_data_txt = makeString("scored-data.txt");

    static private final SubLList $list_alt6 = list(makeSymbol("TEST-DIR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt10 = list(makeSymbol("*EBMT-INDEX-HOST*"), makeString("localhost"));

    static private final SubLString $str_alt13$_A_ebmt_index_txt = makeString("~A/ebmt-index.txt");

    static private final SubLString $str_alt15$_A_ebmt_index_log = makeString("~A/ebmt-index.log");

    static private final SubLList $list_alt19 = list(list(makeSymbol("NL"), makeSymbol("CYCL"), makeSymbol("SOURCE"), makeSymbol("&KEY"), list(makeSymbol("EVERY-NTH"), ONE_INTEGER)), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt20 = list(makeKeyword("EVERY-NTH"));

    static private final SubLString $str_alt27$Processing_EBMT_data_from__a____ = makeString("Processing EBMT data from ~a ...");

    static private final SubLList $list_alt29 = list(list(new SubLObject[]{ makeSymbol("NL"), makeSymbol("CYCL"), makeSymbol("NUM-INTERPS-PER-EXAMPLE"), makeSymbol("TEST-RESULT"), makeSymbol("TIME-TAKEN"), makeSymbol("MATCH-LIST"), makeSymbol("PARSED-CYCLS"), makeSymbol("WEIGHTS"), makeSymbol("TESTING-OUTPUT-FILE") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt34 = list(NIL);

    static private final SubLString $str_alt39$Got_a_malformed_EBMT_testing_outp = makeString("Got a malformed EBMT testing output line ~s");

    static private final SubLString $$$daves = makeString("daves");

    static private final SubLList $list_alt48 = list(list(list(list(reader_make_constant_shell("and"), list(reader_make_constant_shell("eventOccursAt"), makeSymbol("?X"), reader_make_constant_shell("Lebanon")), list(reader_make_constant_shell("intendedAttackTargets"), makeSymbol("?X"), makeSymbol("?Y")), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("CarBombing")), list(reader_make_constant_shell("isa"), makeSymbol("?Y"), reader_make_constant_shell("GovernmentalBuilding")), list(reader_make_constant_shell("startsAfterEndingOf"), makeSymbol("?X"), list(reader_make_constant_shell("YearFn"), makeInteger(1999)))), reader_make_constant_shell("InferencePSC")), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("eventOccursAt"), makeSymbol("?VAR1"), reader_make_constant_shell("Lebanon")), list(reader_make_constant_shell("intendedAttackTargets"), makeSymbol("?VAR1"), makeSymbol("?VAR0")), list(reader_make_constant_shell("isa"), makeSymbol("?VAR1"), reader_make_constant_shell("CarBombing")), list(reader_make_constant_shell("isa"), makeSymbol("?VAR0"), reader_make_constant_shell("GovernmentalBuilding")), list(reader_make_constant_shell("startsAfterEndingOf"), makeSymbol("?VAR1"), list(reader_make_constant_shell("YearFn"), makeInteger(1999))))));

    static private final SubLSymbol $sym49$EQUALS_EL_ = makeSymbol("EQUALS-EL?");

    static private final SubLList $list_alt52 = list(list(list(makeString("Which terrorist groups have carried out suicide bombings in Israel?")), list(reader_make_constant_shell("thereExists"), makeSymbol("?ASSASSINATION-1"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?ASSASSINATION-1"), reader_make_constant_shell("TerroristSuicideBombing")), list(reader_make_constant_shell("isa"), makeSymbol("?GROUP"), reader_make_constant_shell("TerroristGroup")), list(reader_make_constant_shell("eventOccursAt"), makeSymbol("?ASSASSINATION-1"), reader_make_constant_shell("Israel")), list(reader_make_constant_shell("perpetrator"), makeSymbol("?ASSASSINATION-1"), makeSymbol("?GROUP"))))), list(list(makeString("What types of attacks has Hezbollah performed?")), list(reader_make_constant_shell("thereExists"), makeSymbol("?ACTION"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?TYPE-OF-ATTACK"), reader_make_constant_shell("AttackType")), list(reader_make_constant_shell("nearestIsa"), makeSymbol("?ACTION"), makeSymbol("?TYPE-OF-ATTACK")), list(reader_make_constant_shell("performedBy"), makeSymbol("?ACTION"), reader_make_constant_shell("LebaneseHizballah"))))), list(list(makeString("Where were the members of Hizballah born?")), list(reader_make_constant_shell("thereExists"), makeSymbol("?MEMBER-1"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("hasMembers"), reader_make_constant_shell("LebaneseHizballah"), makeSymbol("?MEMBER-1")), list(reader_make_constant_shell("birthPlace"), makeSymbol("?MEMBER-1"), makeSymbol("?PLACE"))))), list(list(makeString("Where do members of Hizballah live?")), list(reader_make_constant_shell("thereExists"), makeSymbol("?INHABITANT"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("hasMembers"), reader_make_constant_shell("LebaneseHizballah"), makeSymbol("?INHABITANT")), list(reader_make_constant_shell("isa"), makeSymbol("?INHABITANT"), reader_make_constant_shell("Agent-Generic")), list(reader_make_constant_shell("residesInRegion"), makeSymbol("?INHABITANT"), makeSymbol("?GEOGRAPHICAL-REGION"))))), list(list(makeString("What terrorist groups is Hezbollah financially linked to?")), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("TerroristGroup")), list(reader_make_constant_shell("relatedToVia"), reader_make_constant_shell("LebaneseHizballah"), makeSymbol("?X"), list(reader_make_constant_shell("TheSet"), reader_make_constant_shell("financiallyLinked")), THREE_INTEGER))), list(list(makeString("What types of financial links are there?")), list(reader_make_constant_shell("genlPreds"), makeSymbol("?PRED"), reader_make_constant_shell("financiallyLinked"))));

    private static final SubLSymbol EBMT_CREATE_AND_TEST_TEMPLATES = makeSymbol("EBMT-CREATE-AND-TEST-TEMPLATES");

    static private final SubLList $list_alt54 = list(list(list(makeString("GE announced {today} {record} first-quarter 2006 earnings from continuing operations of $0.39 per share"), list(reader_make_constant_shell("adjustedEPSForPeriod"), reader_make_constant_shell("GeneralElectric"), list(reader_make_constant_shell("Dollar-UnitedStates"), makeDouble(0.39)), list(reader_make_constant_shell("QuarterFn"), ONE_INTEGER, list(reader_make_constant_shell("YearFn"), makeInteger(2006)))), makeString("GE announced today first-quarter 2006 earnings from continuing operations of $0.39 per share"), list(reader_make_constant_shell("adjustedEPSForPeriod"), reader_make_constant_shell("GeneralElectric"), list(reader_make_constant_shell("Dollar-UnitedStates"), makeDouble(0.39)), list(reader_make_constant_shell("QuarterFn"), ONE_INTEGER, list(reader_make_constant_shell("YearFn"), makeInteger(2006))))), makeKeyword("FAILURE")), list(list(makeString("GE announced {today} {record} first-quarter 2006 earnings from continuing operations of $0.39 per share"), list(reader_make_constant_shell("adjustedEPSForPeriod"), reader_make_constant_shell("GeneralElectric"), list(reader_make_constant_shell("Dollar-UnitedStates"), makeDouble(0.39)), list(reader_make_constant_shell("QuarterFn"), ONE_INTEGER, list(reader_make_constant_shell("YearFn"), makeInteger(2006)))), makeString("IBM announced today first-quarter 2005 earnings from continuing operations of $0.38 per share"), list(reader_make_constant_shell("adjustedEPSForPeriod"), reader_make_constant_shell("IBMInc"), list(reader_make_constant_shell("Dollar-UnitedStates"), makeDouble(0.38)), list(reader_make_constant_shell("QuarterFn"), ONE_INTEGER, list(reader_make_constant_shell("YearFn"), makeInteger(2005))))), makeKeyword("FAILURE")), list(list(makeString("GE announced first-quarter 2006 earnings from continuing operations of $0.39 per share"), list(reader_make_constant_shell("adjustedEPSForPeriod"), reader_make_constant_shell("GeneralElectric"), list(reader_make_constant_shell("Dollar-UnitedStates"), makeDouble(0.39)), list(reader_make_constant_shell("QuarterFn"), ONE_INTEGER, list(reader_make_constant_shell("YearFn"), makeInteger(2006)))), makeString("IBM announced first-quarter 2005 earnings from continuing operations of $0.38 per share"), list(reader_make_constant_shell("adjustedEPSForPeriod"), reader_make_constant_shell("IBMInc"), list(reader_make_constant_shell("Dollar-UnitedStates"), makeDouble(0.38)), list(reader_make_constant_shell("QuarterFn"), ONE_INTEGER, list(reader_make_constant_shell("YearFn"), makeInteger(2005))))), makeKeyword("FAILURE")), list(list(makeString("GE announced {today} {record} first-quarter 2006 earnings from continuing operations of $0.39 per share"), list(reader_make_constant_shell("adjustedEPSForPeriod"), reader_make_constant_shell("GeneralElectric"), list(reader_make_constant_shell("Dollar-UnitedStates"), makeDouble(0.39)), list(reader_make_constant_shell("QuarterFn"), ONE_INTEGER, list(reader_make_constant_shell("YearFn"), makeInteger(2006)))), makeString("IBM announced first-quarter 2005 earnings from continuing operations of $0.38 per share"), list(reader_make_constant_shell("adjustedEPSForPeriod"), reader_make_constant_shell("IBMInc"), list(reader_make_constant_shell("Dollar-UnitedStates"), makeDouble(0.38)), list(reader_make_constant_shell("QuarterFn"), ONE_INTEGER, list(reader_make_constant_shell("YearFn"), makeInteger(2005))))), makeKeyword("FAILURE")), list(list(makeString("GE announced {today} {record} first-quarter 2006 earnings from continuing operations of $0.39 per share"), list(reader_make_constant_shell("adjustedEPSForPeriod"), reader_make_constant_shell("GeneralElectric"), list(reader_make_constant_shell("Dollar-UnitedStates"), makeDouble(0.39)), list(reader_make_constant_shell("QuarterFn"), ONE_INTEGER, list(reader_make_constant_shell("YearFn"), makeInteger(2006)))), makeString("GE announced today record first-quarter 2006 earnings from continuing operations of $0.39 per share"), list(reader_make_constant_shell("adjustedEPSForPeriod"), reader_make_constant_shell("GeneralElectric"), list(reader_make_constant_shell("Dollar-UnitedStates"), makeDouble(0.39)), list(reader_make_constant_shell("QuarterFn"), ONE_INTEGER, list(reader_make_constant_shell("YearFn"), makeInteger(2006))))), makeKeyword("FAILURE")));

    static private final SubLString $str_alt55$_error_output_txt = makeString("/error-output.txt");

    static private final SubLString $str_alt57$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt58$_cyc_top_data_ebmt_testing_query_ = makeString("/cyc/top/data/ebmt/testing/query-library/");

    static private final SubLString $str_alt59$_ = makeString("/");

    static private final SubLString $str_alt60$_cyc_top_data_ebmt_testing_query_ = makeString("/cyc/top/data/ebmt/testing/query-library/summary.txt");

    static private final SubLString $str_alt61$_cyc_top_data_ebmt_testing_query_ = makeString("/cyc/top/data/ebmt/testing/query-library/ebmt-training-recall-report");

    static private final SubLString $str_alt62$_cyc_top_data_ebmt_testing_query_ = makeString("/cyc/top/data/ebmt/testing/query-library/ebmt-parsing-results");

    static private final SubLString $str_alt63$_cyc_top_data_ebmt_testing_query_ = makeString("/cyc/top/data/ebmt/testing/query-library/ebmt-accuracy-report");

    static private final SubLString $str_alt65$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/mt/");

    static private final SubLString $str_alt66$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/mt/summary.txt");

    static private final SubLString $str_alt67$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/mt/ebmt-training-recall-report");

    static private final SubLString $str_alt68$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/mt/ebmt-parsing-results");

    static private final SubLString $str_alt69$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/mt/ebmt-accuracy-report");

    public static final SubLObject $const70$EBMTTrainingExamplesForWesternBus = reader_make_constant_shell("EBMTTrainingExamplesForWesternBusinessPracticesMt");

    static private final SubLString $str_alt71$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/file/");

    static private final SubLString $str_alt72$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/file/summary.txt");

    static private final SubLString $str_alt73$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/file/ebmt-training-recall-report");

    static private final SubLString $str_alt74$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/file/ebmt-parsing-results");

    static private final SubLString $str_alt75$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/file/ebmt-accuracy-report");

    static private final SubLString $str_alt76$_cyc_top_data_ebmt_testing_financ = makeString("/cyc/top/data/ebmt/testing/financial/file/testing-input.txt");

    static private final SubLString $str_alt77$_opt_local_pkg_j2sdk1_4_2_bin_jav = makeString("/opt/local/pkg/j2sdk1.4.2/bin/java");

    static private final SubLString $str_alt78$_home_shah_cvs_head_cycorp_cyc_ja = makeString("/home/shah/cvs/head/cycorp/cyc/java/com/cyc/common/cyc-common.jar:/cyc/java/lib/xercesImpl-2.2.1.jar:/cyc/java/lib/lucene-core-1.9.1.jar");

    static private final SubLString $str_alt79$_cp = makeString("-cp");

    static private final SubLString $str_alt80$com_cyc_common_nlp_EBMTTemplateIn = makeString("com.cyc.common.nlp.EBMTTemplateIndexServer");

    static private final SubLString $str_alt81$_i = makeString("-i");

    static private final SubLString $str_alt82$_ebmt_index_ = makeString("/ebmt-index/");

    static private final SubLList $list_alt86 = list(makeSymbol("?NL"), makeSymbol("?CYCL"));

    static private final SubLList $list_alt87 = list(reader_make_constant_shell("thereExists"), makeSymbol("?QUOTEDCYCL"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("ebmtNLToCycLTrainingExample"), makeSymbol("?NL"), makeSymbol("?QUOTEDCYCL")), list(reader_make_constant_shell("means"), makeSymbol("?QUOTEDCYCL"), makeSymbol("?CYCL"))));

    static private final SubLString $str_alt90$_ebmt_index_txt = makeString("/ebmt-index.txt");

    static private final SubLString $str_alt91$_ebmt_index_log = makeString("/ebmt-index.log");

    static private final SubLString $str_alt92$Processing_EBMT_data_from_ = makeString("Processing EBMT data from ");

    static private final SubLString $str_alt93$____ = makeString(" ...");

    static private final SubLList $list_alt94 = list(makeSymbol("NL"), makeSymbol("CYCL"));

    static private final SubLString $str_alt98$Unexpected_type_of_EBMT_template_ = makeString("Unexpected type of EBMT template: ~S~%");

    static private final SubLString $str_alt100$Unexpected_indexing_result_of_EBM = makeString("Unexpected indexing-result of EBMT template: ~s");

    static private final SubLString $str_alt101$_S__ = makeString("~S~%");

    static private final SubLString $str_alt107$Summarizing_EBMT_training_details = makeString("Summarizing EBMT training details ...");

    static private final SubLList $list_alt122 = list(makeSymbol("NL"), makeSymbol("CYCL"), makeSymbol("NUM-INTERPS-PER-EXAMPLE"), makeSymbol("TEST-RESULT"), makeSymbol("TIME-TAKEN"), makeSymbol("MATCH-LIST"), makeSymbol("PARSED-CYCLS"), makeSymbol("WEIGHTS"));

    static private final SubLString $str_alt125$Unexpected_EBMT_result__s = makeString("Unexpected EBMT result ~s");

    static private final SubLList $list_alt126 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));

    static private final SubLString $str_alt159$summary_txt = makeString("summary.txt");

    static private final SubLString $str_alt160$summary_plist_lisp = makeString("summary-plist.lisp");

    static private final SubLString $str_alt161$_s__ = makeString("~s~%");

    static private final SubLList $list_alt167 = list(makeKeyword("XLABEL"), makeString("Cyc KB\\nDate"), makeKeyword("YORIGIN"), ZERO_INTEGER);

    static private final SubLList $list_alt168 = list(makeKeyword("XLABEL"), makeKeyword("YLABEL"), makeKeyword("PLOT-TITLE"), makeKeyword("YORIGIN"), $YMAX, makeKeyword("KEY-LOCATION"), makeKeyword("KEY-JUSTIFY"));

    static private final SubLList $list_alt170 = list(makeSymbol("LINE-LABEL"), makeSymbol("FORMULA"));

    static private final SubLString $str_alt173$_n = makeString("\\n");

    static private final SubLList $list_alt175 = list(makeSymbol("KEYWORD"), makeSymbol("FORMULA"));

    static private final SubLList $list_alt176 = list(makeKeyword("YLABEL"), makeString("% of training examples"), makeKeyword("PLOT-TITLE"), list(makeString("EBMT Training Recall")), makeKeyword("COMPUTED-DATA-TYPES"), list(makeKeyword("FAILED-EXAMPLE-PERCENTAGE"), list(makeString("no templates"), makeKeyword("NO-TEMPLATES-PC")), makeKeyword("DUPLICATES"), list(makeString("duplicate templates"), makeKeyword("DUPLICATE-TEMPLATES-PC")), makeKeyword("SPECIFIC-TEMPLATE-RECALL"), list(makeString("non-generalized templates"), makeKeyword("SPECIFIC-TEMPLATES-PC")), makeKeyword("GENERAL-TEMPLATE-RECALL"), list(makeString("generalized, unique templates"), makeKeyword("GENERAL-TEMPLATES-PC"))));

    static private final SubLList $list_alt177 = list(makeKeyword("YLABEL"), makeString("Time (seconds)"), makeKeyword("PLOT-TITLE"), list(makeString("EBMT Parsing Times")), makeKeyword("RAW-DATA-TYPES"), list(makeKeyword("MEAN-TIME-PER-EXAMPLE"), makeString("Mean Time per Sentence"), makeKeyword("MEDIAN-TIME-PER-EXAMPLE"), makeString("Median Time per Sentence")));

    static private final SubLList $list_alt178 = list(makeKeyword("PLOT-TITLE"), makeString("EBMT Parsing Accuracy"), makeKeyword("YLABEL"), makeString("Value (in %)"), $YMAX, makeInteger(100), makeKeyword("COMPUTED-DATA-TYPES"), list(makeKeyword("PRECISION"), list(makeString("Precision"), list(makeSymbol("PERCENT"), makeKeyword("SUCCESSFUL-TESTS"), makeKeyword("TOTAL-UNIQUE-INTERPS"))), makeKeyword("SUCCESSFUL-TESTS-PC"), list(makeString("Recall"), makeKeyword("SUCCESSFUL-TESTS-PC"))));

    static private final SubLList $list_alt179 = list(makeKeyword("PLOT-TITLE"), makeString("EBMT Parsing Results"), makeKeyword("YLABEL"), makeString("% of tests"), $YMAX, makeInteger(100), makeKeyword("COMPUTED-DATA-TYPES"), list(makeKeyword("FAILED"), list(makeString("Failed"), makeKeyword("FAILED-TESTS-PC")), makeKeyword("UNKNOWN"), list(makeString("Unknown"), makeKeyword("UNKNOWN-TESTS-PC")), makeKeyword("ALMOST-SUCCESSFUL"), list(makeString("Almost Successful"), makeKeyword("ALMOST-SUCCESSFUL-TESTS-PC")), makeKeyword("SUCCESSFUL"), list(makeString("Successful"), makeKeyword("SUCCESSFUL-TESTS-PC"))));

    static private final SubLString $str_alt181$_cyc_top_data_ebmt_testing_ebmt_s = makeString("/cyc/top/data/ebmt/testing/ebmt-scoring-cache.txt");

    private static final SubLSymbol $NO_PARSES = makeKeyword("NO-PARSES");

    static private final SubLString $str_alt183$_ = makeString(" ");

    private static final SubLSymbol EBMT_RESULT_TO_MATCH_LIST_ITEM = makeSymbol("EBMT-RESULT-TO-MATCH-LIST-ITEM");

    public static final SubLFloat $float$0_9 = makeDouble(0.9);

    static private final SubLList $list_alt186 = list(makeKeyword("SUCCESS"), makeKeyword("ALMOST"), makeKeyword("UNKNOWN"), makeKeyword("FAILURE"));

    static private final SubLString $str_alt187$Expected_valid_EBMT_results__got_ = makeString("Expected valid EBMT results, got ~s");

    static private final SubLString $str_alt188$Read_a_blank_line_from__s__assumi = makeString("Read a blank line from ~s, assuming EOF");

    static private final SubLString $$$True = makeString("True");

    static private final SubLString $$$Almost = makeString("Almost");

    static private final SubLString $str_alt191$Can_t_Tag = makeString("Can't Tag");

    static private final SubLString $$$null = makeString("null");

    static private final SubLString $$$False = makeString("False");

    public static final SubLInteger $int$2000 = makeInteger(2000);

    static private final SubLString $str_alt196$Ill_formed_line___a___a = makeString("Ill-formed line #~a: ~a");

    static private final SubLString $str_alt197$__a__a__ = makeString("<~a>~a~%");

    static private final SubLString $str_alt198$cy_fi_cy_fi_sentencifier_perl = makeString("cy-fi/cy-fi-sentencifier.perl");

    static private final SubLString $str_alt199$__txt = makeString("*.txt");

    static private final SubLString $str_alt200$sentence_list_text = makeString("sentence-list.text");

    static private final SubLString $str_alt201$_cyc_top_data_ebmt_testing_earnin = makeString("/cyc/top/data/ebmt/testing/earnings-reports/");

    static private final SubLString $str_alt202$Could_not_create_output_directory = makeString("Could not create output directory ~a");

    static private final SubLString $str_alt203$_home_pace_work_cy_fi_earnings_te = makeString("/home/pace/work/cy-fi/earnings_text_files/");

    static private final SubLString $str_alt204$Failed_to_execute__s__s____s = makeString("Failed to execute ~s ~s > ~s");

    static private final SubLString $str_alt205$revised_summary_txt = makeString("revised-summary.txt");

    static private final SubLString $str_alt206$_txt = makeString(".txt");

    static private final SubLString $str_alt207$_cyc_top_data_cy_fi_earnings_from = makeString("/cyc/top/data/cy-fi-earnings-from-sentences/");

    static private final SubLString $str_alt209$Processing_earnings_reports___ = makeString("Processing earnings reports...");

    private static final SubLSymbol EARNINGS_FROM_SENTENCES = makeSymbol("EARNINGS-FROM-SENTENCES");

    static private final SubLString $str_alt211$__a___a__ = makeString("[~a] ~a~%");
}

/**
 * Total time: 882 ms
 */
