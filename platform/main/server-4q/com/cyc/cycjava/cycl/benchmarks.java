/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      BENCHMARKS
 *  source file: /cyc/top/cycl/benchmarks.lisp
 *  created:     2019/07/03 17:39:07
 */
public final class benchmarks extends SubLTranslatedFile implements V02 {
    // // Constructor
    private benchmarks() {
    }

    public static final SubLFile me = new benchmarks();

    public static final String myName = "com.cyc.cycjava.cycl.benchmarks";

    // // Definitions
    /**
     * Creates a file of the i/o pairs resulting from applying <function> to each element of <tests>.
     * Each element of <tests> is a list of arguments to which <function> is applied.
     */
    public static final SubLObject create_benchmark(SubLObject function, SubLObject tests, SubLObject system, SubLObject filename, SubLObject directory) {
        if (system == UNPROVIDED) {
            system = NIL;
        }
        if (filename == UNPROVIDED) {
            filename = Strings.string_downcase(format(NIL, $str_alt0$_a_benchmark, function), UNPROVIDED, UNPROVIDED);
        }
        if (directory == UNPROVIDED) {
            directory = default_benchmark_directory(system);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject results = compute_benchmark(function, tests);
                SubLObject total_run_time = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject pathname = Filesys.construct_filename(directory, filename, UNPROVIDED, UNPROVIDED);
                    SubLObject stream = compatibility.open_text(pathname, $OUTPUT, UNPROVIDED);
                    format(stream, $str_alt2$_________a, filename);
                    format(stream, $str_alt3$______created_by__a_on__a, Environment.get_user_name(UNPROVIDED), numeric_date_utilities.timestring(UNPROVIDED));
                    format(stream, $str_alt4$______kb_number___S, control_vars.kb_loaded());
                    format(stream, $str_alt5$______run_time___S, total_run_time);
                    format(stream, $str_alt6$__________machine_readable_header, new SubLObject[]{ filename, function, control_vars.kb_loaded(), length(tests), total_run_time, Environment.get_user_name(UNPROVIDED), numeric_date_utilities.timestring(UNPROVIDED) });
                    format(stream, $str_alt7$__________benchmark_triples___inp);
                    {
                        SubLObject cdolist_list_var = results;
                        SubLObject result = NIL;
                        for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                            format(stream, $str_alt8$______s_____s_____s_, new SubLObject[]{ result.first(), second(result), third(result) });
                        }
                    }
                    close(stream, UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    /**
     * compares the current behavior of <function> with its most recent benchmarked behavior
     */
    public static final SubLObject test_benchmark(SubLObject function, SubLObject system, SubLObject in_filename, SubLObject directory, SubLObject output_filename, SubLObject time_filename) {
        if (system == UNPROVIDED) {
            system = NIL;
        }
        if (in_filename == UNPROVIDED) {
            in_filename = Strings.string_downcase(format(NIL, $str_alt0$_a_benchmark, function), UNPROVIDED, UNPROVIDED);
        }
        if (directory == UNPROVIDED) {
            directory = default_benchmark_directory(system);
        }
        if (output_filename == UNPROVIDED) {
            output_filename = Strings.string_downcase(format(NIL, $str_alt9$_a_output_deltas, function), UNPROVIDED, UNPROVIDED);
        }
        if (time_filename == UNPROVIDED) {
            time_filename = Strings.string_downcase(format(NIL, $str_alt10$_a_run_time_deltas, function), UNPROVIDED, UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject header = read_benchmark(function, in_filename, system, directory);
                SubLObject old = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject count = length(old);
                    thread.resetMultipleValues();
                    {
                        SubLObject v_new = compute_benchmark(function, Mapping.mapcar(symbol_function(CAR), old));
                        SubLObject new_run_time = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!count.numE(length(v_new))) {
                                Errors.error($str_alt12$benchmark_size_conflict___s_vs__s, count, length(v_new));
                            }
                        }
                        thread.resetMultipleValues();
                        {
                            SubLObject changed = compare_benchmark_with_current(old, v_new, count);
                            SubLObject time_deltas = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            write_benchmark_output_delta(header, changed, new_run_time, output_filename, directory);
                            if (NIL != time_deltas) {
                                write_benchmark_run_time_delta(header, time_deltas, time_filename, directory);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * fn of arity 2 that is applied to a benchmarked output and a current output;
     * returns non-nil iff the benchmark output is considered equaivalent to the current output
     */
    // defparameter
    public static final SubLSymbol $benchmark_equality_test$ = makeSymbol("*BENCHMARK-EQUALITY-TEST*");

    /**
     * should run times be considered when comparing
     * benchmarked performance to current performance?
     */
    // defparameter
    public static final SubLSymbol $consider_benchmarked_run_timesP$ = makeSymbol("*CONSIDER-BENCHMARKED-RUN-TIMES?*");

    /**
     * upper bound on the number of run times comparisons reported
     * during benchmark analysis
     */
    // defparameter
    public static final SubLSymbol $max_benchmarked_run_time_comparisons$ = makeSymbol("*MAX-BENCHMARKED-RUN-TIME-COMPARISONS*");

    /**
     * lower bound on the number of seconds that a benchmarked run time
     * must differ from current run time to be considered significant
     */
    // defparameter
    public static final SubLSymbol $min_benchmark_run_time_delta$ = makeSymbol("*MIN-BENCHMARK-RUN-TIME-DELTA*");

    /**
     * number of decimal places included in benchmark analysis
     */
    // defparameter
    public static final SubLSymbol $benchmark_precision$ = makeSymbol("*BENCHMARK-PRECISION*");

    public static final SubLObject default_benchmark_directory(SubLObject system) {
        if (system == UNPROVIDED) {
            system = NIL;
        }
        if (system.isAtom()) {
            return list($$$benchmarks, Strings.string_downcase(string_utilities.str(system), UNPROVIDED, UNPROVIDED));
        } else
            if (system.isCons()) {
                return list($$$benchmarks, Mapping.mapcar(symbol_function(STRING_DOWNCASE), Mapping.mapcar(symbol_function(STR), system)));
            } else {
                return list($$$benchmarks, $$$misc);
            }

    }

    public static final SubLObject compute_benchmark(SubLObject function, SubLObject tests) {
        {
            SubLObject results = NIL;
            SubLObject total_run_time = NIL;
            SubLObject output = NIL;
            SubLObject run_time = NIL;
            if (NIL != tests) {
                {
                    SubLObject time_var = get_internal_real_time();
                    {
                        SubLObject cdolist_list_var = tests;
                        SubLObject input = NIL;
                        for (input = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , input = cdolist_list_var.first()) {
                            {
                                SubLObject time_var_1 = get_internal_real_time();
                                output = apply(function, input);
                                run_time = divide(subtract(get_internal_real_time(), time_var_1), time_high.$internal_time_units_per_second$.getGlobalValue());
                            }
                            results = cons(list(input, output, run_time), results);
                        }
                    }
                    total_run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                }
            } else {
                {
                    SubLObject time_var = get_internal_real_time();
                    {
                        SubLObject time_var_2 = get_internal_real_time();
                        output = funcall(function);
                        run_time = divide(subtract(get_internal_real_time(), time_var_2), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    results = cons(list(NIL, output, run_time), results);
                    total_run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                }
            }
            return values(nreverse(results), total_run_time);
        }
    }

    public static final SubLObject compare_benchmark_with_current(SubLObject old, SubLObject v_new, SubLObject count) {
        if (count == UNPROVIDED) {
            count = length(old);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject min_delta_time = multiply($min_benchmark_run_time_delta$.getDynamicValue(thread), time_high.$internal_time_units_per_second$.getGlobalValue());
                SubLObject changed = NIL;
                SubLObject time_deltas = NIL;
                SubLObject delta_time = NIL;
                SubLObject n = NIL;
                for (n = ZERO_INTEGER; n.numL(count); n = add(n, ONE_INTEGER)) {
                    {
                        SubLObject datum = nth(n, old);
                        SubLObject current = datum;
                        SubLObject old_input = NIL;
                        SubLObject old_output = NIL;
                        SubLObject old_time = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt17);
                        old_input = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt17);
                        old_output = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt17);
                        old_time = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject datum_3 = nth(n, v_new);
                                SubLObject current_4 = datum_3;
                                SubLObject new_input = NIL;
                                SubLObject new_output = NIL;
                                SubLObject new_time = NIL;
                                destructuring_bind_must_consp(current_4, datum_3, $list_alt18);
                                new_input = current_4.first();
                                current_4 = current_4.rest();
                                destructuring_bind_must_consp(current_4, datum_3, $list_alt18);
                                new_output = current_4.first();
                                current_4 = current_4.rest();
                                destructuring_bind_must_consp(current_4, datum_3, $list_alt18);
                                new_time = current_4.first();
                                current_4 = current_4.rest();
                                if (NIL == current_4) {
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (!old_input.equal(new_input)) {
                                            Errors.error($str_alt19$benchmark_sequence_conflict_at__d, subtract(count, n));
                                        }
                                    }
                                    if (NIL == funcall($benchmark_equality_test$.getDynamicValue(thread), old_output, new_output)) {
                                        changed = cons(list(subtract(count, n), old_input, old_output, new_output), changed);
                                    }
                                    if (NIL != $consider_benchmarked_run_timesP$.getDynamicValue(thread)) {
                                        delta_time = subtract(new_time, old_time);
                                        if (abs(delta_time).numGE(min_delta_time)) {
                                            time_deltas = list_utilities.first_n(max($max_benchmarked_run_time_comparisons$.getDynamicValue(thread), add(ONE_INTEGER, length(time_deltas))), Sort.stable_sort(copy_list(cons(list(subtract(count, n), old_input, delta_time), time_deltas)), symbol_function($sym20$GREATER_ABS_), symbol_function(THIRD)));
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum_3, $list_alt18);
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt17);
                        }
                    }
                }
                return values(changed, time_deltas);
            }
        }
    }

    public static final SubLObject read_benchmark(SubLObject function, SubLObject filename, SubLObject system, SubLObject directory) {
        if (system == UNPROVIDED) {
            system = NIL;
        }
        if (directory == UNPROVIDED) {
            directory = default_benchmark_directory(system);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject in_stream = compatibility.open_text(Filesys.construct_filename(directory, filename, UNPROVIDED, UNPROVIDED), $INPUT, UNPROVIDED);
                SubLObject header = read_ignoring_errors(in_stream, UNPROVIDED, UNPROVIDED);
                SubLObject benchmark = NIL;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (length(header) != SEVEN_INTEGER) {
                        Errors.error($$$benchmark_header_is_malformed);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!function.equal(second(header))) {
                        Errors.error($$$benchmark_function_conflict);
                    }
                }
                {
                    SubLObject result = NIL;
                    for (result = read_ignoring_errors(in_stream, NIL, $EOF); result != $EOF; result = read_ignoring_errors(in_stream, NIL, $EOF)) {
                        benchmark = cons(result, benchmark);
                    }
                }
                close(in_stream, UNPROVIDED);
                return values(header, nreverse(benchmark));
            }
        }
    }

    public static final SubLObject write_benchmark_output_delta(SubLObject header, SubLObject changed, SubLObject new_run_time, SubLObject out_filename, SubLObject directory) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = header;
                SubLObject current = datum;
                SubLObject filename = NIL;
                SubLObject function = NIL;
                SubLObject kb = NIL;
                SubLObject count = NIL;
                SubLObject old_run_time = NIL;
                SubLObject author = NIL;
                SubLObject date = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt26);
                filename = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt26);
                function = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt26);
                kb = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt26);
                count = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt26);
                old_run_time = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt26);
                author = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt26);
                date = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject stream = (out_filename == T) ? ((SubLObject) (StreamsLow.$standard_output$.getDynamicValue(thread))) : compatibility.open_text(Filesys.construct_filename(directory, out_filename, UNPROVIDED, UNPROVIDED), $OUTPUT, UNPROVIDED);
                        format(stream, $str_alt27$________benchmark_output_comparis, function);
                        format(stream, $str_alt28$________current_run___a_newest___, new SubLObject[]{ filename, Environment.get_user_name(UNPROVIDED), control_vars.kb_loaded(), numeric_date_utilities.timestring(UNPROVIDED) });
                        format(stream, $str_alt29$________benchmark_run___a_newest_, new SubLObject[]{ filename, author, kb, date });
                        format(stream, $str_alt30$________Summary);
                        format(stream, $str_alt31$__________number_of_trials_execut, count);
                        format(stream, $str_alt32$________number_of_changed_results, length(changed));
                        if (count.numG(ZERO_INTEGER)) {
                            format(stream, $str_alt33$________new_time_in_seconds__avg_, number_utilities.float_n(new_run_time, $benchmark_precision$.getDynamicValue(thread)), number_utilities.float_n(divide(new_run_time, count), $benchmark_precision$.getDynamicValue(thread)));
                            format(stream, $str_alt34$________old_time_in_seconds__avg_, number_utilities.float_n(old_run_time, $benchmark_precision$.getDynamicValue(thread)), number_utilities.float_n(divide(old_run_time, count), $benchmark_precision$.getDynamicValue(thread)));
                            format(stream, $str_alt35$________difference_in_seconds__av, number_utilities.float_n(subtract(new_run_time, old_run_time), $benchmark_precision$.getDynamicValue(thread)), number_utilities.float_n(divide(subtract(new_run_time, old_run_time), count), $benchmark_precision$.getDynamicValue(thread)));
                        }
                        if (NIL != changed) {
                            format(stream, $str_alt36$____________Delta_tuples___n___in);
                            {
                                SubLObject cdolist_list_var = changed;
                                SubLObject item = NIL;
                                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                    format(stream, $str_alt37$_____s___s___s___s, new SubLObject[]{ item.first(), second(item), third(item), fourth(item) });
                                }
                            }
                        }
                        format(stream, $str_alt38$_____________done_testing__a_____, filename);
                        if (out_filename != StreamsLow.$standard_output$.getDynamicValue(thread)) {
                            close(stream, UNPROVIDED);
                        }
                        return NIL;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt26);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject write_benchmark_run_time_delta(SubLObject header, SubLObject time_deltas, SubLObject out_filename, SubLObject directory) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = header;
                SubLObject current = datum;
                SubLObject filename = NIL;
                SubLObject function = NIL;
                SubLObject kb = NIL;
                SubLObject count = NIL;
                SubLObject old_run_time = NIL;
                SubLObject author = NIL;
                SubLObject date = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt26);
                filename = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt26);
                function = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt26);
                kb = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt26);
                count = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt26);
                old_run_time = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt26);
                author = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt26);
                date = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject stream = (out_filename == T) ? ((SubLObject) (StreamsLow.$standard_output$.getDynamicValue(thread))) : compatibility.open_text(Filesys.construct_filename(directory, out_filename, UNPROVIDED, UNPROVIDED), $OUTPUT, UNPROVIDED);
                        format(stream, $str_alt39$________benchmark_run_time_compar, function);
                        format(stream, $str_alt28$________current_run___a_newest___, new SubLObject[]{ filename, Environment.get_user_name(UNPROVIDED), control_vars.kb_loaded(), numeric_date_utilities.timestring(UNPROVIDED) });
                        format(stream, $str_alt29$________benchmark_run___a_newest_, new SubLObject[]{ filename, author, kb, date });
                        if (NIL != time_deltas) {
                            format(stream, $str_alt40$____________Delta_tuples___n___in);
                            {
                                SubLObject cdolist_list_var = time_deltas;
                                SubLObject item = NIL;
                                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                    format(stream, $str_alt37$_____s___s___s___s, new SubLObject[]{ item.first(), second(item), third(item), fourth(item) });
                                }
                            }
                        }
                        format(stream, $str_alt38$_____________done_testing__a_____, filename);
                        if (out_filename != StreamsLow.$standard_output$.getDynamicValue(thread)) {
                            close(stream, UNPROVIDED);
                        }
                        return NIL;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt26);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject declare_benchmarks_file() {
        declareFunction("create_benchmark", "CREATE-BENCHMARK", 2, 3, false);
        declareFunction("test_benchmark", "TEST-BENCHMARK", 1, 5, false);
        declareFunction("default_benchmark_directory", "DEFAULT-BENCHMARK-DIRECTORY", 0, 1, false);
        declareFunction("compute_benchmark", "COMPUTE-BENCHMARK", 2, 0, false);
        declareFunction("compare_benchmark_with_current", "COMPARE-BENCHMARK-WITH-CURRENT", 2, 1, false);
        declareFunction("read_benchmark", "READ-BENCHMARK", 2, 2, false);
        declareFunction("write_benchmark_output_delta", "WRITE-BENCHMARK-OUTPUT-DELTA", 5, 0, false);
        declareFunction("write_benchmark_run_time_delta", "WRITE-BENCHMARK-RUN-TIME-DELTA", 4, 0, false);
        return NIL;
    }

    public static final SubLObject init_benchmarks_file() {
        defparameter("*BENCHMARK-EQUALITY-TEST*", symbol_function(EQUAL));
        defparameter("*CONSIDER-BENCHMARKED-RUN-TIMES?*", T);
        defparameter("*MAX-BENCHMARKED-RUN-TIME-COMPARISONS*", FIVE_INTEGER);
        defparameter("*MIN-BENCHMARK-RUN-TIME-DELTA*", ONE_INTEGER);
        defparameter("*BENCHMARK-PRECISION*", ONE_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_benchmarks_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$_a_benchmark = makeString("~a-benchmark");



    static private final SubLString $str_alt2$_________a = makeString("~%~%;;; ~a");

    static private final SubLString $str_alt3$______created_by__a_on__a = makeString("~%;;; created by ~a on ~a");

    static private final SubLString $str_alt4$______kb_number___S = makeString("~%;;; kb number: ~S");

    static private final SubLString $str_alt5$______run_time___S = makeString("~%;;; run time: ~S");

    static private final SubLString $str_alt6$__________machine_readable_header = makeString("~%~%~%;;; machine readable header: ~%(~s ~s ~s ~s ~s ~s ~s)");

    static private final SubLString $str_alt7$__________benchmark_triples___inp = makeString("~%~%~%;;; benchmark triples (<input> <output> <run-time>):");

    static private final SubLString $str_alt8$______s_____s_____s_ = makeString("~%~%(~s ~% ~s ~% ~s)");

    static private final SubLString $str_alt9$_a_output_deltas = makeString("~a-output-deltas");

    static private final SubLString $str_alt10$_a_run_time_deltas = makeString("~a-run-time-deltas");



    static private final SubLString $str_alt12$benchmark_size_conflict___s_vs__s = makeString("benchmark size conflict: ~s vs ~s");

    static private final SubLString $$$benchmarks = makeString("benchmarks");





    static private final SubLString $$$misc = makeString("misc");

    static private final SubLList $list_alt17 = list(makeSymbol("OLD-INPUT"), makeSymbol("OLD-OUTPUT"), makeSymbol("OLD-TIME"));

    static private final SubLList $list_alt18 = list(makeSymbol("NEW-INPUT"), makeSymbol("NEW-OUTPUT"), makeSymbol("NEW-TIME"));

    static private final SubLString $str_alt19$benchmark_sequence_conflict_at__d = makeString("benchmark sequence conflict at ~d");

    static private final SubLSymbol $sym20$GREATER_ABS_ = makeSymbol("GREATER-ABS?");





    static private final SubLString $$$benchmark_header_is_malformed = makeString("benchmark header is malformed");

    static private final SubLString $$$benchmark_function_conflict = makeString("benchmark function conflict");



    static private final SubLList $list_alt26 = list(makeSymbol("FILENAME"), makeSymbol("FUNCTION"), makeSymbol("KB"), makeSymbol("COUNT"), makeSymbol("OLD-RUN-TIME"), makeSymbol("AUTHOR"), makeSymbol("DATE"));

    static private final SubLString $str_alt27$________benchmark_output_comparis = makeString("~%~%;;; benchmark output comparision for ~s");

    static private final SubLString $str_alt28$________current_run___a_newest___ = makeString("~%~%;;; current run: ~a.newest ~%;;; author: ~a ~%;;; kb: ~a ~%;;; date: ~a");

    static private final SubLString $str_alt29$________benchmark_run___a_newest_ = makeString("~%~%;;; benchmark run: ~a.newest ~%;;; author: ~a ~%;;; kb: ~a ~%;;; date of benchmark: ~a");

    static private final SubLString $str_alt30$________Summary = makeString("~%~%;;; Summary");

    static private final SubLString $str_alt31$__________number_of_trials_execut = makeString("~%~%;;;   number of trials executed: ~d");

    static private final SubLString $str_alt32$________number_of_changed_results = makeString("~%;;;   number of changed results: ~d");

    static private final SubLString $str_alt33$________new_time_in_seconds__avg_ = makeString("~%;;;   new time in seconds (avg): ~d (~d)");

    static private final SubLString $str_alt34$________old_time_in_seconds__avg_ = makeString("~%;;;   old time in seconds (avg): ~d (~d)");

    static private final SubLString $str_alt35$________difference_in_seconds__av = makeString("~%;;;   difference in seconds (avg): ~d (~d)");

    static private final SubLString $str_alt36$____________Delta_tuples___n___in = makeString("~%~%~%~%;;; Delta tuples (<n> <input> <old output> <new output>):");

    static private final SubLString $str_alt37$_____s___s___s___s = makeString("~%~%~s~%~s~%~s~%~s");

    static private final SubLString $str_alt38$_____________done_testing__a_____ = makeString("~%~%;;; -*-  done testing ~a  -*-");

    static private final SubLString $str_alt39$________benchmark_run_time_compar = makeString("~%~%;;; benchmark run time comparision for ~s");

    static private final SubLString $str_alt40$____________Delta_tuples___n___in = makeString("~%~%~%~%;;; Delta tuples (<n> <input> <old run time> <new run time>):");

    // // Initializers
    public void declareFunctions() {
        declare_benchmarks_file();
    }

    public void initializeVariables() {
        init_benchmarks_file();
    }

    public void runTopLevelForms() {
        setup_benchmarks_file();
    }
}

