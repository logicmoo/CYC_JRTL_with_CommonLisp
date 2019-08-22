/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output_externalized;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      WFF-BENCHMARK
 *  source file: /cyc/top/cycl/wff-benchmark.lisp
 *  created:     2019/07/03 17:37:29
 */
public final class wff_benchmark extends SubLTranslatedFile implements V02 {
    // // Constructor
    private wff_benchmark() {
    }

    public static final SubLFile me = new wff_benchmark();


    // // Definitions
    // defvar
    private static final SubLSymbol $wff_benchmark_file$ = makeSymbol("*WFF-BENCHMARK-FILE*");

    // defvar
    private static final SubLSymbol $wff_benchmark_file_base$ = makeSymbol("*WFF-BENCHMARK-FILE-BASE*");

    // defvar
    private static final SubLSymbol $wff_kb_test_gafs$ = makeSymbol("*WFF-KB-TEST-GAFS*");

    public static final SubLObject create_wff_benchmark_file(SubLObject number) {
        if (number == UNPROVIDED) {
            number = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject filename = NIL;
                filename = format(NIL, $str_alt2$_a__a__a_a_cfasl, new SubLObject[]{ $wff_benchmark_file_base$.getDynamicValue(thread), control_vars.kb_loaded(), string_utilities.string_substitute($$$p, $str_alt4$_, system_info.cyc_revision_string(), UNPROVIDED), NIL != number ? ((SubLObject) (format(NIL, $str_alt5$__a, number))) : $str_alt6$ });
                return filename;
            }
        }
    }

    public static final SubLObject create_wff_benchmark(SubLObject probability, SubLObject filename) {
        if (probability == UNPROVIDED) {
            probability = $float$0_1;
        }
        if (filename == UNPROVIDED) {
            filename = create_wff_benchmark_file(UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject gafs = NIL;
                if (NIL != $wff_kb_test_gafs$.getDynamicValue(thread)) {
                    gafs = copy_list($wff_kb_test_gafs$.getDynamicValue(thread));
                } else {
                    gafs = wff_kb_test_gather_gafs_for_sample(probability, UNPROVIDED);
                    $wff_kb_test_gafs$.setDynamicValue(copy_list(gafs), thread);
                }
                return write_wff_benchmark_from_gafs(gafs, filename);
            }
        }
    }

    public static final SubLObject write_wff_benchmark_from_gafs(SubLObject gafs, SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = length(gafs);
                format(T, $str_alt8$Number_of_gafs_gathered___a__, count);
                {
                    SubLObject stream = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                stream = compatibility.open_binary(filename, $OUTPUT, NIL);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (!stream.isStream()) {
                            Errors.error($str_alt10$Unable_to_open__S, filename);
                        }
                        {
                            SubLObject stream_1 = stream;
                            save_benchmark_header(count, stream_1);
                            {
                                SubLObject list_var = gafs;
                                utilities_macros.$progress_note$.setDynamicValue($$$Saving_Benchmark_GAFS_to_file, thread);
                                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                {
                                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                        {
                                            SubLObject csome_list_var = list_var;
                                            SubLObject gaf = NIL;
                                            for (gaf = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , gaf = csome_list_var.first()) {
                                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                save_gaf_benchmark_data_from_gaf(gaf, stream_1);
                                            }
                                        }
                                        utilities_macros.noting_percent_progress_postamble();
                                    } finally {
                                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
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
                }
                return count;
            }
        }
    }

    public static final SubLObject write_wff_benchmark(SubLObject bmdata_list, SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = length(bmdata_list);
                format(T, $str_alt8$Number_of_gafs_gathered___a__, count);
                {
                    SubLObject stream = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                stream = compatibility.open_binary(filename, $OUTPUT, NIL);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (!stream.isStream()) {
                            Errors.error($str_alt10$Unable_to_open__S, filename);
                        }
                        {
                            SubLObject stream_2 = stream;
                            save_benchmark_header(count, stream_2);
                            {
                                SubLObject list_var = bmdata_list;
                                utilities_macros.$progress_note$.setDynamicValue($$$Saving_Benchmark_GAFS_to_file, thread);
                                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                {
                                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                        {
                                            SubLObject csome_list_var = list_var;
                                            SubLObject bmdata = NIL;
                                            for (bmdata = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , bmdata = csome_list_var.first()) {
                                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                save_gaf_benchmark_data(bmdata, stream_2);
                                            }
                                        }
                                        utilities_macros.noting_percent_progress_postamble();
                                    } finally {
                                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
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
                }
                return count;
            }
        }
    }

    public static final SubLObject read_wff_benchmark(SubLObject filename) {
        if (filename == UNPROVIDED) {
            filename = $wff_benchmark_file$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bm_header = NIL;
                SubLObject count = NIL;
                SubLObject bm_data_list = NIL;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(filename, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt10$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject stream_3 = stream;
                        bm_header = load_benchmark_header(stream_3);
                        if ($EOF != bm_header) {
                            count = wbh_count(bm_header);
                            format(T, $str_alt8$Number_of_gafs_gathered___a__, count);
                            bm_data_list = read_wff_benchmark_data_list(stream_3, count);
                            format(T, $str_alt14$Number_of_gafs_successfully_read_, length(bm_data_list));
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
                return bm_data_list;
            }
        }
    }

    public static final SubLObject read_wff_benchmark_data_list(SubLObject stream, SubLObject count) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject bm_data_list = NIL;
                SubLObject bm_data = NIL;
                utilities_macros.$progress_note$.setDynamicValue($$$Loading_Benchmark_GAFS_from_file, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(count, thread);
                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        {
                            SubLObject num = NIL;
                            for (num = ZERO_INTEGER; num.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); num = add(num, ONE_INTEGER)) {
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                bm_data = load_gaf_benchmark_data(stream);
                                if ($EOF == bm_data) {
                                    return bm_data_list;
                                }
                                bm_data_list = cons(bm_data, bm_data_list);
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return bm_data_list;
            }
        }
    }

    public static final SubLObject benchmark_wff(SubLObject filename, SubLObject new_benchmark_file, SubLObject bm_data_list) {
        if (filename == UNPROVIDED) {
            filename = $wff_benchmark_file$.getDynamicValue();
        }
        if (new_benchmark_file == UNPROVIDED) {
            new_benchmark_file = create_wff_benchmark_file(UNPROVIDED);
        }
        if (bm_data_list == UNPROVIDED) {
            bm_data_list = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == bm_data_list) {
                bm_data_list = read_wff_benchmark(filename);
                Storage.gc(UNPROVIDED);
            }
            {
                SubLObject new_benchmark_list = NIL;
                SubLObject not_matching_list = NIL;
                SubLObject total = ZERO_INTEGER;
                SubLObject total_time = ZERO_INTEGER;
                SubLObject total_prev_time = ZERO_INTEGER;
                SubLObject total_done = ZERO_INTEGER;
                SubLObject correct = ZERO_INTEGER;
                SubLObject wrong = ZERO_INTEGER;
                SubLObject not_found = ZERO_INTEGER;
                SubLObject list_var = bm_data_list;
                utilities_macros.$progress_note$.setDynamicValue($$$Benchmarking_WFF, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject bm_data = NIL;
                            for (bm_data = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , bm_data = csome_list_var.first()) {
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                total = add(total, ONE_INTEGER);
                                {
                                    SubLObject prev_wffP = wbd_wffP(bm_data);
                                    SubLObject cnf = wbd_cnf(bm_data);
                                    SubLObject mt = wbd_mt(bm_data);
                                    SubLObject prev_time = wbd_time(bm_data);
                                    SubLObject prev_foundP = wbd_foundP(bm_data);
                                    SubLObject sentence = wb_get_sentence_from_cnf(cnf, mt, prev_foundP);
                                    SubLObject computed_wffP = NIL;
                                    SubLObject computed_time = NIL;
                                    if (NIL != sentence) {
                                        total_done = add(total_done, ONE_INTEGER);
                                        {
                                            SubLObject time_var = get_internal_real_time();
                                            computed_wffP = wff.el_wffP(sentence, mt, UNPROVIDED);
                                            computed_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                        }
                                        total_time = add(total_time, computed_time);
                                        total_prev_time = add(total_prev_time, prev_time);
                                        new_benchmark_list = cons(new_wff_benchmark_data(cnf, mt, computed_wffP, computed_time, T), new_benchmark_list);
                                        if (computed_wffP == prev_wffP) {
                                            correct = add(correct, ONE_INTEGER);
                                        } else {
                                            not_matching_list = cons(list(sentence, mt), not_matching_list);
                                            wrong = add(wrong, ONE_INTEGER);
                                        }
                                    } else {
                                        new_benchmark_list = cons(new_wff_benchmark_data(cnf, mt, prev_wffP, prev_time, NIL), new_benchmark_list);
                                        if (NIL != prev_foundP) {
                                            not_found = add(not_found, ONE_INTEGER);
                                        }
                                    }
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                print_benchmark_statistics(total_time, total_prev_time, correct, wrong, total_done, not_found, total);
                write_wff_benchmark(new_benchmark_list, new_benchmark_file);
                return not_matching_list;
            }
        }
    }

    public static final SubLObject wb_get_sentence_from_cnf(SubLObject cnf, SubLObject mt, SubLObject prev_foundP) {
        {
            SubLObject assertions = (NIL != prev_foundP) ? ((SubLObject) (czer_meta.find_assertions_from_decontextualized_literal(cnf, mt))) : NIL;
            SubLObject assertion = ((NIL != assertions) && assertions.isList()) ? ((SubLObject) (assertions.first())) : NIL;
            if (NIL != assertion_handles.assertion_p(assertion)) {
                return uncanonicalizer.assertion_el_formula(assertion);
            }
        }
        return NIL;
    }

    public static final SubLObject print_benchmark_statistics(SubLObject total_time, SubLObject total_prev_time, SubLObject correct, SubLObject wrong, SubLObject total_done, SubLObject not_found, SubLObject total) {
        format(T, $str_alt18$_________________________________);
        format(T, $str_alt19$___KB_Number___a__System_Number__, control_vars.kb_loaded(), system_info.cyc_revision_string());
        format(T, $str_alt20$___Total_gafs_given_for_wff_check, total);
        format(T, $str_alt21$___Total_gafs_wff_checked________, total_done);
        format(T, $str_alt22$___matching_previous_wff_checking, correct);
        format(T, $str_alt23$___Not_matching_previous_wff_chec, wrong);
        format(T, $str_alt24$___Gafs_not_found________________, not_found);
        format(T, $str_alt25$___Time_Taken_for_wff_check______, total_time);
        format(T, $str_alt26$___Time_Taken_for_prev_wff_check_, total_prev_time);
        format(T, $str_alt27$___Improvement__per_sentence_____, multiply(divide(subtract(total_prev_time, total_time), total), $int$100));
        format(T, $str_alt29$___Total_Improvement_____________, multiply(divide(subtract(total_prev_time, total_time), total_time), $int$100));
        format(T, $str_alt30$_________________________________);
        return NIL;
    }

    public static final SubLObject save_benchmark_header(SubLObject count, SubLObject stream) {
        {
            SubLObject bm_header = new_wff_benchmark_header(count, control_vars.kb_loaded(), system_info.cyc_revision_string());
            cfasl_output_benchmark_header(bm_header, stream);
        }
        return NIL;
    }

    public static final SubLObject load_benchmark_header(SubLObject stream) {
        return cfasl_input_benchmark_header(stream);
    }

    public static final SubLObject save_gaf_benchmark_data(SubLObject bm_data, SubLObject stream) {
        cfasl_output_benchmark_data(bm_data, stream);
        return bm_data;
    }

    public static final SubLObject save_gaf_benchmark_data_from_gaf(SubLObject gaf, SubLObject stream) {
        {
            SubLObject bm_data = new_wff_benchmark_data_from_gaf(gaf);
            return save_gaf_benchmark_data(bm_data, stream);
        }
    }

    public static final SubLObject load_gaf_benchmark_data(SubLObject stream) {
        return cfasl_input_benchmark_data(stream);
    }

    public static final class $wff_benchmark_header_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return wff_benchmark.$wff_benchmark_header_native.structDecl;
        }

        public SubLObject getField2() {
            return $count;
        }

        public SubLObject getField3() {
            return $kb;
        }

        public SubLObject getField4() {
            return $level;
        }

        public SubLObject setField2(SubLObject value) {
            return $count = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $kb = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $level = value;
        }

        public SubLObject $count = Lisp.NIL;

        public SubLObject $kb = Lisp.NIL;

        public SubLObject $level = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(wff_benchmark.$wff_benchmark_header_native.class, WFF_BENCHMARK_HEADER, WFF_BENCHMARK_HEADER_P, $list_alt33, $list_alt34, new String[]{ "$count", "$kb", "$level" }, $list_alt35, $list_alt36, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_wff_benchmark_header$ = makeSymbol("*DTP-WFF-BENCHMARK-HEADER*");

    public static final SubLObject wff_benchmark_header_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject wff_benchmark_header_p(SubLObject v_object) {
        return v_object.getJavaClass() ==wff_benchmark.$wff_benchmark_header_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $wff_benchmark_header_p$UnaryFunction extends UnaryFunction {
        public $wff_benchmark_header_p$UnaryFunction() {
            super(extractFunctionNamed("WFF-BENCHMARK-HEADER-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return wff_benchmark_header_p(arg1);
        }
    }

    public static final SubLObject wbh_count(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, WFF_BENCHMARK_HEADER_P);
        return v_object.getField2();
    }

    public static final SubLObject wbh_kb(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, WFF_BENCHMARK_HEADER_P);
        return v_object.getField3();
    }

    public static final SubLObject wbh_level(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, WFF_BENCHMARK_HEADER_P);
        return v_object.getField4();
    }

    public static final SubLObject _csetf_wbh_count(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, WFF_BENCHMARK_HEADER_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_wbh_kb(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, WFF_BENCHMARK_HEADER_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_wbh_level(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, WFF_BENCHMARK_HEADER_P);
        return v_object.setField4(value);
    }

    public static final SubLObject make_wff_benchmark_header(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new wff_benchmark.$wff_benchmark_header_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($COUNT)) {
                        _csetf_wbh_count(v_new, current_value);
                    } else
                        if (pcase_var.eql($KB)) {
                            _csetf_wbh_kb(v_new, current_value);
                        } else
                            if (pcase_var.eql($LEVEL)) {
                                _csetf_wbh_level(v_new, current_value);
                            } else {
                                Errors.error($str_alt48$Invalid_slot__S_for_construction_, current_arg);
                            }


                }
            }
            return v_new;
        }
    }

    /**
     * Create a new WFF Benchmark Header object
     */
    public static final SubLObject new_wff_benchmark_header(SubLObject count, SubLObject kb, SubLObject level) {
        {
            SubLObject bm_header = make_wff_benchmark_header(UNPROVIDED);
            _csetf_wbh_count(bm_header, count);
            _csetf_wbh_kb(bm_header, kb);
            _csetf_wbh_level(bm_header, level);
            return bm_header;
        }
    }

    public static final SubLObject cfasl_output_benchmark_header(SubLObject benchmark_header, SubLObject stream) {
        cfasl_output_externalized(wbh_count(benchmark_header), stream);
        cfasl_output_externalized(wbh_kb(benchmark_header), stream);
        cfasl_output_externalized(wbh_level(benchmark_header), stream);
        return benchmark_header;
    }

    public static final SubLObject cfasl_input_benchmark_header(SubLObject stream) {
        {
            SubLObject count = cfasl_input(stream, NIL, $EOF);
            SubLObject kb = cfasl_input(stream, NIL, $EOF);
            SubLObject level = cfasl_input(stream, NIL, $EOF);
            if ((($EOF == count) || ($EOF == kb)) || ($EOF == level)) {
                return $EOF;
            } else {
                return new_wff_benchmark_header(count, kb, level);
            }
        }
    }

    public static final class $wff_benchmark_data_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return wff_benchmark.$wff_benchmark_data_native.structDecl;
        }

        public SubLObject getField2() {
            return $cnf;
        }

        public SubLObject getField3() {
            return $mt;
        }

        public SubLObject getField4() {
            return $wffP;
        }

        public SubLObject getField5() {
            return $time;
        }

        public SubLObject getField6() {
            return $foundP;
        }

        public SubLObject setField2(SubLObject value) {
            return $cnf = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $mt = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $wffP = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $time = value;
        }

        public SubLObject setField6(SubLObject value) {
            return $foundP = value;
        }

        public SubLObject $cnf = Lisp.NIL;

        public SubLObject $mt = Lisp.NIL;

        public SubLObject $wffP = Lisp.NIL;

        public SubLObject $time = Lisp.NIL;

        public SubLObject $foundP = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(wff_benchmark.$wff_benchmark_data_native.class, WFF_BENCHMARK_DATA, WFF_BENCHMARK_DATA_P, $list_alt51, $list_alt52, new String[]{ "$cnf", "$mt", "$wffP", "$time", "$foundP" }, $list_alt53, $list_alt54, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_wff_benchmark_data$ = makeSymbol("*DTP-WFF-BENCHMARK-DATA*");

    public static final SubLObject wff_benchmark_data_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject wff_benchmark_data_p(SubLObject v_object) {
        return v_object.getJavaClass() ==wff_benchmark.$wff_benchmark_data_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $wff_benchmark_data_p$UnaryFunction extends UnaryFunction {
        public $wff_benchmark_data_p$UnaryFunction() {
            super(extractFunctionNamed("WFF-BENCHMARK-DATA-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return wff_benchmark_data_p(arg1);
        }
    }

    public static final SubLObject wbd_cnf(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, WFF_BENCHMARK_DATA_P);
        return v_object.getField2();
    }

    public static final SubLObject wbd_mt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, WFF_BENCHMARK_DATA_P);
        return v_object.getField3();
    }

    public static final SubLObject wbd_wffP(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, WFF_BENCHMARK_DATA_P);
        return v_object.getField4();
    }

    public static final SubLObject wbd_time(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, WFF_BENCHMARK_DATA_P);
        return v_object.getField5();
    }

    public static final SubLObject wbd_foundP(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, WFF_BENCHMARK_DATA_P);
        return v_object.getField6();
    }

    public static final SubLObject _csetf_wbd_cnf(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, WFF_BENCHMARK_DATA_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_wbd_mt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, WFF_BENCHMARK_DATA_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_wbd_wffP(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, WFF_BENCHMARK_DATA_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_wbd_time(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, WFF_BENCHMARK_DATA_P);
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_wbd_foundP(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, WFF_BENCHMARK_DATA_P);
        return v_object.setField6(value);
    }

    public static final SubLObject make_wff_benchmark_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new wff_benchmark.$wff_benchmark_data_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CNF)) {
                        _csetf_wbd_cnf(v_new, current_value);
                    } else
                        if (pcase_var.eql($MT)) {
                            _csetf_wbd_mt(v_new, current_value);
                        } else
                            if (pcase_var.eql($kw68$WFF_)) {
                                _csetf_wbd_wffP(v_new, current_value);
                            } else
                                if (pcase_var.eql($TIME)) {
                                    _csetf_wbd_time(v_new, current_value);
                                } else
                                    if (pcase_var.eql($kw70$FOUND_)) {
                                        _csetf_wbd_foundP(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt48$Invalid_slot__S_for_construction_, current_arg);
                                    }




                }
            }
            return v_new;
        }
    }

    public static final SubLObject new_wff_benchmark_data(SubLObject cnf, SubLObject mt, SubLObject wffP, SubLObject time, SubLObject foundP) {
        {
            SubLObject bm_data = make_wff_benchmark_data(UNPROVIDED);
            _csetf_wbd_cnf(bm_data, cnf);
            _csetf_wbd_mt(bm_data, mt);
            _csetf_wbd_wffP(bm_data, wffP);
            _csetf_wbd_time(bm_data, time);
            _csetf_wbd_foundP(bm_data, foundP);
            return bm_data;
        }
    }

    /**
     * Create a new WFF Benchmark Data object from GAF
     */
    public static final SubLObject new_wff_benchmark_data_from_gaf(SubLObject gaf) {
        {
            SubLObject cnf = assertions_high.assertion_cnf(gaf);
            SubLObject mt = assertions_high.assertion_mt(gaf);
            SubLObject wffP = NIL;
            SubLObject time = NIL;
            SubLObject time_var = get_internal_real_time();
            wffP = wff.el_wffP(uncanonicalizer.assertion_el_formula(gaf), mt, UNPROVIDED);
            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            return new_wff_benchmark_data(cnf, mt, wffP, time, T);
        }
    }

    /**
     * Create a new WFF Benchmark Data object from RULE
     */
    public static final SubLObject new_wff_benchmark_data_from_rule(SubLObject rule) {
        {
            SubLObject cnf = assertions_high.assertion_cnf(rule);
            SubLObject mt = assertions_high.assertion_mt(rule);
            SubLObject wffP = NIL;
            SubLObject time = NIL;
            SubLObject time_var = get_internal_real_time();
            wffP = wff.el_wffP(uncanonicalizer.assertion_el_formula(rule), mt, UNPROVIDED);
            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            return new_wff_benchmark_data(cnf, mt, wffP, time, T);
        }
    }

    public static final SubLObject cfasl_output_benchmark_data(SubLObject benchmark_data, SubLObject stream) {
        cfasl_output_externalized(wbd_cnf(benchmark_data), stream);
        cfasl_output_externalized(wbd_mt(benchmark_data), stream);
        cfasl_output_externalized(wbd_wffP(benchmark_data), stream);
        cfasl_output_externalized(wbd_time(benchmark_data), stream);
        cfasl_output_externalized(wbd_foundP(benchmark_data), stream);
        return benchmark_data;
    }

    public static final SubLObject cfasl_input_benchmark_data(SubLObject stream) {
        {
            SubLObject cnf = cfasl_input(stream, NIL, $EOF);
            SubLObject mt = cfasl_input(stream, NIL, $EOF);
            SubLObject wffP = cfasl_input(stream, NIL, $EOF);
            SubLObject time = cfasl_input(stream, NIL, $EOF);
            SubLObject foundP = cfasl_input(stream, NIL, $EOF);
            if ((((($EOF == cnf) || ($EOF == mt)) || ($EOF == wffP)) || ($EOF == time)) || ($EOF == foundP)) {
                return $EOF;
            } else {
                return new_wff_benchmark_data(cnf, mt, wffP, time, foundP);
            }
        }
    }

    /**
     *
     *
     * @return listp of gaf-assertion-p; a list of gafs for the wff KB test, sampled
    appropriately so as not to sample too many uninteresting gafs (e.g. those with
    a very large predicate extent) and to get a good balance betwen ill-formed gafs
    and well-formed ones.
     * @param SCALING-PROBABILITY
     * 		probability-p; the probability of really choosing some gaf we were about to sample.
     * 		The default scaling probability will yield a sample of about 0.36% of the KB, about 6000 assertions.
     */
    public static final SubLObject wff_kb_test_gather_gafs_for_sample(SubLObject scaling_probability, SubLObject ill_formed_percentage) {
        if (scaling_probability == UNPROVIDED) {
            scaling_probability = $float$0_1;
        }
        if (ill_formed_percentage == UNPROVIDED) {
            ill_formed_percentage = TWENTY_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(scaling_probability, PROBABILITY_P);
            SubLTrampolineFile.checkType(ill_formed_percentage, PERCENTAGE_P);
            {
                SubLObject asserted_extent_dict = dictionary_of_asserted_predicate_extent();
                SubLObject sample_gafs = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject all_predicates = isa.all_fort_instances($$Predicate, UNPROVIDED, UNPROVIDED);
                            SubLObject list_var = all_predicates;
                            utilities_macros.$progress_note$.setDynamicValue($$$Gathering_WFF_KB_test_gafs, thread);
                            utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                            utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0_4 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_5 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                try {
                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject pred = NIL;
                                        for (pred = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
                                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                            utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            {
                                                SubLObject asserted_extent = dictionary.dictionary_lookup(asserted_extent_dict, pred, UNPROVIDED);
                                                SubLObject num_gafs_to_sample_for_pred = wff_kb_test_number_of_gafs_to_sample(pred, asserted_extent_dict);
                                                SubLObject pred_gafs = wff_kb_test_sample_gafs_for_pred(pred, num_gafs_to_sample_for_pred, asserted_extent, scaling_probability);
                                                sample_gafs = nconc(pred_gafs, sample_gafs);
                                            }
                                        }
                                    }
                                    utilities_macros.noting_percent_progress_postamble();
                                } finally {
                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_5, thread);
                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_4, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return sample_gafs;
            }
        }
    }

    public static final SubLObject dictionary_of_asserted_predicate_extent() {
        {
            SubLObject histogram = kb_utilities.histogram_of_predicate_extent(T, NIL);
            SubLObject v_dictionary = dictionary_utilities.new_dictionary_from_alist(histogram, symbol_function(EQ));
            return v_dictionary;
        }
    }

    public static final SubLObject wff_kb_test_number_of_gafs_to_sample(SubLObject pred, SubLObject asserted_extent_dict) {
        {
            SubLObject asserted_extent = dictionary.dictionary_lookup(asserted_extent_dict, pred, ZERO_INTEGER);
            SubLTrampolineFile.checkType(asserted_extent, NON_NEGATIVE_INTEGER_P);
            if (asserted_extent.isZero()) {
                return ZERO_INTEGER;
            } else
                if (asserted_extent.numLE(TEN_INTEGER)) {
                    return integerDivide(number_utilities.f_1X(asserted_extent), TWO_INTEGER);
                } else
                    if (asserted_extent.numLE($int$30)) {
                        return TEN_INTEGER;
                    } else
                        if (asserted_extent.numLE($int$100)) {
                            return FIFTEEN_INTEGER;
                        } else
                            if (asserted_extent.numLE($int$1000)) {
                                return $int$50;
                            } else {
                                return $int$150;
                            }




        }
    }

    public static final SubLObject wff_kb_test_sample_gafs_for_pred(SubLObject pred, SubLObject num_gafs_to_sample_for_pred, SubLObject asserted_extent, SubLObject scaling_probability) {
        {
            SubLObject result = NIL;
            if (NIL != subl_promotions.positive_integer_p(asserted_extent)) {
                {
                    SubLObject sample_probability = divide(num_gafs_to_sample_for_pred, asserted_extent);
                    SubLObject probability = multiply(scaling_probability, sample_probability);
                    SubLObject pred_var = pred;
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        {
                            SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = NIL;
                            SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                {
                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                    if (NIL != valid) {
                                        {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                {
                                                    SubLObject done_var_6 = NIL;
                                                    SubLObject token_var_7 = NIL;
                                                    while (NIL == done_var_6) {
                                                        {
                                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_7);
                                                            SubLObject valid_8 = makeBoolean(token_var_7 != ass);
                                                            if (NIL != valid_8) {
                                                                if (NIL != assertions_high.asserted_assertionP(ass)) {
                                                                    {
                                                                        SubLObject prob = probability;
                                                                        SubLTrampolineFile.checkType(prob, PROBABILITY_P);
                                                                        if (NIL != number_utilities.true_with_probability(prob)) {
                                                                            result = cons(ass, result);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var_6 = makeBoolean(NIL == valid_8);
                                                        }
                                                    } 
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                    try {
                                                        bind($is_thread_performing_cleanupP$, T);
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                    } finally {
                                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                }
                            } 
                        }
                    }
                }
            }
            return result;
        }
    }

    public static final SubLObject declare_wff_benchmark_file() {
        declareFunction("create_wff_benchmark_file", "CREATE-WFF-BENCHMARK-FILE", 0, 1, false);
        declareFunction("create_wff_benchmark", "CREATE-WFF-BENCHMARK", 0, 2, false);
        declareFunction("write_wff_benchmark_from_gafs", "WRITE-WFF-BENCHMARK-FROM-GAFS", 2, 0, false);
        declareFunction("write_wff_benchmark", "WRITE-WFF-BENCHMARK", 2, 0, false);
        declareFunction("read_wff_benchmark", "READ-WFF-BENCHMARK", 0, 1, false);
        declareFunction("read_wff_benchmark_data_list", "READ-WFF-BENCHMARK-DATA-LIST", 2, 0, false);
        declareFunction("benchmark_wff", "BENCHMARK-WFF", 0, 3, false);
        declareFunction("wb_get_sentence_from_cnf", "WB-GET-SENTENCE-FROM-CNF", 3, 0, false);
        declareFunction("print_benchmark_statistics", "PRINT-BENCHMARK-STATISTICS", 7, 0, false);
        declareFunction("save_benchmark_header", "SAVE-BENCHMARK-HEADER", 2, 0, false);
        declareFunction("load_benchmark_header", "LOAD-BENCHMARK-HEADER", 1, 0, false);
        declareFunction("save_gaf_benchmark_data", "SAVE-GAF-BENCHMARK-DATA", 2, 0, false);
        declareFunction("save_gaf_benchmark_data_from_gaf", "SAVE-GAF-BENCHMARK-DATA-FROM-GAF", 2, 0, false);
        declareFunction("load_gaf_benchmark_data", "LOAD-GAF-BENCHMARK-DATA", 1, 0, false);
        declareFunction("wff_benchmark_header_print_function_trampoline", "WFF-BENCHMARK-HEADER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("wff_benchmark_header_p", "WFF-BENCHMARK-HEADER-P", 1, 0, false);
        new wff_benchmark.$wff_benchmark_header_p$UnaryFunction();
        declareFunction("wbh_count", "WBH-COUNT", 1, 0, false);
        declareFunction("wbh_kb", "WBH-KB", 1, 0, false);
        declareFunction("wbh_level", "WBH-LEVEL", 1, 0, false);
        declareFunction("_csetf_wbh_count", "_CSETF-WBH-COUNT", 2, 0, false);
        declareFunction("_csetf_wbh_kb", "_CSETF-WBH-KB", 2, 0, false);
        declareFunction("_csetf_wbh_level", "_CSETF-WBH-LEVEL", 2, 0, false);
        declareFunction("make_wff_benchmark_header", "MAKE-WFF-BENCHMARK-HEADER", 0, 1, false);
        declareFunction("new_wff_benchmark_header", "NEW-WFF-BENCHMARK-HEADER", 3, 0, false);
        declareFunction("cfasl_output_benchmark_header", "CFASL-OUTPUT-BENCHMARK-HEADER", 2, 0, false);
        declareFunction("cfasl_input_benchmark_header", "CFASL-INPUT-BENCHMARK-HEADER", 1, 0, false);
        declareFunction("wff_benchmark_data_print_function_trampoline", "WFF-BENCHMARK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("wff_benchmark_data_p", "WFF-BENCHMARK-DATA-P", 1, 0, false);
        new wff_benchmark.$wff_benchmark_data_p$UnaryFunction();
        declareFunction("wbd_cnf", "WBD-CNF", 1, 0, false);
        declareFunction("wbd_mt", "WBD-MT", 1, 0, false);
        declareFunction("wbd_wffP", "WBD-WFF?", 1, 0, false);
        declareFunction("wbd_time", "WBD-TIME", 1, 0, false);
        declareFunction("wbd_foundP", "WBD-FOUND?", 1, 0, false);
        declareFunction("_csetf_wbd_cnf", "_CSETF-WBD-CNF", 2, 0, false);
        declareFunction("_csetf_wbd_mt", "_CSETF-WBD-MT", 2, 0, false);
        declareFunction("_csetf_wbd_wffP", "_CSETF-WBD-WFF?", 2, 0, false);
        declareFunction("_csetf_wbd_time", "_CSETF-WBD-TIME", 2, 0, false);
        declareFunction("_csetf_wbd_foundP", "_CSETF-WBD-FOUND?", 2, 0, false);
        declareFunction("make_wff_benchmark_data", "MAKE-WFF-BENCHMARK-DATA", 0, 1, false);
        declareFunction("new_wff_benchmark_data", "NEW-WFF-BENCHMARK-DATA", 5, 0, false);
        declareFunction("new_wff_benchmark_data_from_gaf", "NEW-WFF-BENCHMARK-DATA-FROM-GAF", 1, 0, false);
        declareFunction("new_wff_benchmark_data_from_rule", "NEW-WFF-BENCHMARK-DATA-FROM-RULE", 1, 0, false);
        declareFunction("cfasl_output_benchmark_data", "CFASL-OUTPUT-BENCHMARK-DATA", 2, 0, false);
        declareFunction("cfasl_input_benchmark_data", "CFASL-INPUT-BENCHMARK-DATA", 1, 0, false);
        declareFunction("wff_kb_test_gather_gafs_for_sample", "WFF-KB-TEST-GATHER-GAFS-FOR-SAMPLE", 0, 2, false);
        declareFunction("dictionary_of_asserted_predicate_extent", "DICTIONARY-OF-ASSERTED-PREDICATE-EXTENT", 0, 0, false);
        declareFunction("wff_kb_test_number_of_gafs_to_sample", "WFF-KB-TEST-NUMBER-OF-GAFS-TO-SAMPLE", 2, 0, false);
        declareFunction("wff_kb_test_sample_gafs_for_pred", "WFF-KB-TEST-SAMPLE-GAFS-FOR-PRED", 4, 0, false);
        return NIL;
    }

    public static final SubLObject init_wff_benchmark_file() {
        defvar("*WFF-BENCHMARK-FILE*", $str_alt0$_home_ashenoy_tmp_wff_benchmark_c);
        defvar("*WFF-BENCHMARK-FILE-BASE*", $str_alt1$_home_ashenoy_tmp_wff_benchmark);
        defvar("*WFF-KB-TEST-GAFS*", NIL);
        defconstant("*DTP-WFF-BENCHMARK-HEADER*", WFF_BENCHMARK_HEADER);
        defconstant("*DTP-WFF-BENCHMARK-DATA*", WFF_BENCHMARK_DATA);
        return NIL;
    }

    public static final SubLObject setup_wff_benchmark_file() {
                register_method($print_object_method_table$.getGlobalValue(), $dtp_wff_benchmark_header$.getGlobalValue(), symbol_function(WFF_BENCHMARK_HEADER_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(WBH_COUNT, _CSETF_WBH_COUNT);
        def_csetf(WBH_KB, _CSETF_WBH_KB);
        def_csetf(WBH_LEVEL, _CSETF_WBH_LEVEL);
        identity(WFF_BENCHMARK_HEADER);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_wff_benchmark_data$.getGlobalValue(), symbol_function(WFF_BENCHMARK_DATA_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(WBD_CNF, _CSETF_WBD_CNF);
        def_csetf(WBD_MT, _CSETF_WBD_MT);
        def_csetf($sym60$WBD_WFF_, $sym61$_CSETF_WBD_WFF_);
        def_csetf(WBD_TIME, _CSETF_WBD_TIME);
        def_csetf($sym64$WBD_FOUND_, $sym65$_CSETF_WBD_FOUND_);
        identity(WFF_BENCHMARK_DATA);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$_home_ashenoy_tmp_wff_benchmark_c = makeString("/home/ashenoy/tmp/wff-benchmark.cfasl");

    static private final SubLString $str_alt1$_home_ashenoy_tmp_wff_benchmark = makeString("/home/ashenoy/tmp/wff-benchmark");

    static private final SubLString $str_alt2$_a__a__a_a_cfasl = makeString("~a-~a-~a~a.cfasl");

    static private final SubLString $$$p = makeString("p");

    static private final SubLString $str_alt4$_ = makeString(".");

    static private final SubLString $str_alt5$__a = makeString("-~a");

    static private final SubLString $str_alt6$ = makeString("");

    public static final SubLFloat $float$0_1 = makeDouble(0.1);

    static private final SubLString $str_alt8$Number_of_gafs_gathered___a__ = makeString("Number of gafs gathered: ~a~%");



    static private final SubLString $str_alt10$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $$$Saving_Benchmark_GAFS_to_file = makeString("Saving Benchmark GAFS to file");





    static private final SubLString $str_alt14$Number_of_gafs_successfully_read_ = makeString("Number of gafs successfully read ~a~%~%");

    static private final SubLString $$$Loading_Benchmark_GAFS_from_file = makeString("Loading Benchmark GAFS from file");

    static private final SubLSymbol $sym16$_EXIT = makeSymbol("%EXIT");

    static private final SubLString $$$Benchmarking_WFF = makeString("Benchmarking WFF");

    static private final SubLString $str_alt18$_________________________________ = makeString("~% *******************************************");

    static private final SubLString $str_alt19$___KB_Number___a__System_Number__ = makeString("~% KB Number: ~a  System Number: ~a");

    static private final SubLString $str_alt20$___Total_gafs_given_for_wff_check = makeString("~% Total gafs given for wff check:  ~a");

    static private final SubLString $str_alt21$___Total_gafs_wff_checked________ = makeString("~% Total gafs wff checked:          ~a");

    static private final SubLString $str_alt22$___matching_previous_wff_checking = makeString("~% matching previous wff-checking:  ~a");

    static private final SubLString $str_alt23$___Not_matching_previous_wff_chec = makeString("~% Not matching previous wff-check: ~a");

    static private final SubLString $str_alt24$___Gafs_not_found________________ = makeString("~% Gafs not found:                  ~a");

    static private final SubLString $str_alt25$___Time_Taken_for_wff_check______ = makeString("~% Time Taken for wff check:       ~,2f");

    static private final SubLString $str_alt26$___Time_Taken_for_prev_wff_check_ = makeString("~% Time Taken for prev wff-check:  ~,2f");

    static private final SubLString $str_alt27$___Improvement__per_sentence_____ = makeString("~% Improvement (per sentence):     ~,3f");



    static private final SubLString $str_alt29$___Total_Improvement_____________ = makeString("~% Total Improvement:              ~,3f");

    static private final SubLString $str_alt30$_________________________________ = makeString("~% *******************************************~%");

    private static final SubLSymbol WFF_BENCHMARK_HEADER = makeSymbol("WFF-BENCHMARK-HEADER");

    private static final SubLSymbol WFF_BENCHMARK_HEADER_P = makeSymbol("WFF-BENCHMARK-HEADER-P");

    static private final SubLList $list_alt33 = list(makeSymbol("COUNT"), makeSymbol("KB"), makeSymbol("LEVEL"));

    static private final SubLList $list_alt34 = list(makeKeyword("COUNT"), makeKeyword("KB"), makeKeyword("LEVEL"));

    static private final SubLList $list_alt35 = list(makeSymbol("WBH-COUNT"), makeSymbol("WBH-KB"), makeSymbol("WBH-LEVEL"));

    static private final SubLList $list_alt36 = list(makeSymbol("_CSETF-WBH-COUNT"), makeSymbol("_CSETF-WBH-KB"), makeSymbol("_CSETF-WBH-LEVEL"));



    private static final SubLSymbol WFF_BENCHMARK_HEADER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("WFF-BENCHMARK-HEADER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol WBH_COUNT = makeSymbol("WBH-COUNT");

    public static final SubLSymbol _CSETF_WBH_COUNT = makeSymbol("_CSETF-WBH-COUNT");

    private static final SubLSymbol WBH_KB = makeSymbol("WBH-KB");

    public static final SubLSymbol _CSETF_WBH_KB = makeSymbol("_CSETF-WBH-KB");

    private static final SubLSymbol WBH_LEVEL = makeSymbol("WBH-LEVEL");

    public static final SubLSymbol _CSETF_WBH_LEVEL = makeSymbol("_CSETF-WBH-LEVEL");





    private static final SubLSymbol $LEVEL = makeKeyword("LEVEL");

    static private final SubLString $str_alt48$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol WFF_BENCHMARK_DATA = makeSymbol("WFF-BENCHMARK-DATA");

    private static final SubLSymbol WFF_BENCHMARK_DATA_P = makeSymbol("WFF-BENCHMARK-DATA-P");

    static private final SubLList $list_alt51 = list(makeSymbol("CNF"), makeSymbol("MT"), makeSymbol("WFF?"), makeSymbol("TIME"), makeSymbol("FOUND?"));

    static private final SubLList $list_alt52 = list(makeKeyword("CNF"), makeKeyword("MT"), makeKeyword("WFF?"), $TIME, makeKeyword("FOUND?"));

    static private final SubLList $list_alt53 = list(makeSymbol("WBD-CNF"), makeSymbol("WBD-MT"), makeSymbol("WBD-WFF?"), makeSymbol("WBD-TIME"), makeSymbol("WBD-FOUND?"));

    static private final SubLList $list_alt54 = list(makeSymbol("_CSETF-WBD-CNF"), makeSymbol("_CSETF-WBD-MT"), makeSymbol("_CSETF-WBD-WFF?"), makeSymbol("_CSETF-WBD-TIME"), makeSymbol("_CSETF-WBD-FOUND?"));

    private static final SubLSymbol WFF_BENCHMARK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("WFF-BENCHMARK-DATA-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol WBD_CNF = makeSymbol("WBD-CNF");

    public static final SubLSymbol _CSETF_WBD_CNF = makeSymbol("_CSETF-WBD-CNF");

    private static final SubLSymbol WBD_MT = makeSymbol("WBD-MT");

    public static final SubLSymbol _CSETF_WBD_MT = makeSymbol("_CSETF-WBD-MT");

    static private final SubLSymbol $sym60$WBD_WFF_ = makeSymbol("WBD-WFF?");

    static private final SubLSymbol $sym61$_CSETF_WBD_WFF_ = makeSymbol("_CSETF-WBD-WFF?");

    private static final SubLSymbol WBD_TIME = makeSymbol("WBD-TIME");

    public static final SubLSymbol _CSETF_WBD_TIME = makeSymbol("_CSETF-WBD-TIME");

    static private final SubLSymbol $sym64$WBD_FOUND_ = makeSymbol("WBD-FOUND?");

    static private final SubLSymbol $sym65$_CSETF_WBD_FOUND_ = makeSymbol("_CSETF-WBD-FOUND?");





    public static final SubLSymbol $kw68$WFF_ = makeKeyword("WFF?");



    public static final SubLSymbol $kw70$FOUND_ = makeKeyword("FOUND?");

    private static final SubLSymbol PROBABILITY_P = makeSymbol("PROBABILITY-P");

    private static final SubLSymbol PERCENTAGE_P = makeSymbol("PERCENTAGE-P");



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLObject $$Predicate = constant_handles.reader_make_constant_shell(makeString("Predicate"));

    static private final SubLString $$$Gathering_WFF_KB_test_gafs = makeString("Gathering WFF KB test gafs");



    public static final SubLInteger $int$30 = makeInteger(30);



    public static final SubLInteger $int$50 = makeInteger(50);

    public static final SubLInteger $int$150 = makeInteger(150);



    // // Initializers
    public void declareFunctions() {
        declare_wff_benchmark_file();
    }

    public void initializeVariables() {
        init_wff_benchmark_file();
    }

    public void runTopLevelForms() {
        setup_wff_benchmark_file();
    }
}

