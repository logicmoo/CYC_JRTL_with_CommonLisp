/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.abs;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.plot_generation;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.vector_utilities;
import com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_cyc_testing;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      QA-BENCHMARKS
 *  source file: /cyc/top/cycl/inference/qa-benchmarks.lisp
 *  created:     2019/07/03 17:38:04
 */
public final class qa_benchmarks extends SubLTranslatedFile implements V02 {
    // // Constructor
    private qa_benchmarks() {
    }

    public static final SubLFile me = new qa_benchmarks();

    public static final String myName = "com.cyc.cycjava.cycl.inference.qa_benchmarks";

    // // Definitions
    public static final SubLObject qa_benchmark_p(SubLObject v_object) {
        if (NIL != list_utilities.property_list_p(v_object)) {
            {
                SubLObject query_set_run = qa_benchmark_query_set_run(v_object);
                return kbq_query_run.kbq_query_set_run_p(query_set_run);
            }
        }
        return NIL;
    }

    public static final SubLObject qa_benchmark_date(SubLObject benchmark) {
        return getf(benchmark, $BENCHMARK_DATE, NIL);
    }

    public static final SubLObject qa_benchmark_query_set_run(SubLObject benchmark) {
        return getf(benchmark, $QUERY_SET_RUN, NIL);
    }

    public static final SubLObject qa_filter_benchmark_to_queries(SubLObject benchmark, SubLObject queries) {
        {
            SubLObject datum = benchmark;
            SubLObject current = datum;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_1 = NIL;
            for (; NIL != rest;) {
                destructuring_bind_must_consp(rest, datum, $list_alt2);
                current_1 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list_alt2);
                if (NIL == member(current_1, $list_alt3, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_1 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list_alt2);
            }
            {
                SubLObject benchmark_date_tail = property_list_member($BENCHMARK_DATE, current);
                SubLObject benchmark_date = (NIL != benchmark_date_tail) ? ((SubLObject) (cadr(benchmark_date_tail))) : NIL;
                SubLObject query_set_run_tail = property_list_member($QUERY_SET_RUN, current);
                SubLObject query_set_run = (NIL != query_set_run_tail) ? ((SubLObject) (cadr(query_set_run_tail))) : NIL;
                query_set_run = kbq_query_run.kbq_filter_query_set_run_to_queries(query_set_run, queries, UNPROVIDED);
                return list($BENCHMARK_DATE, benchmark_date, $QUERY_SET_RUN, query_set_run);
            }
        }
    }

    public static final SubLObject qa_compute_benchmark_delta(SubLObject property, SubLObject benchmark_value, SubLObject current_value) {
        {
            SubLObject pcase_var = property;
            if (pcase_var.eql($BENCHMARK_DATE)) {
                return values(NIL, NIL);
            } else
                if (pcase_var.eql($PATCH_LEVEL)) {
                    return values(NIL, NIL);
                } else {
                    {
                        SubLObject delta = subtract(current_value, benchmark_value);
                        SubLObject percent = (benchmark_value.isZero()) ? ((SubLObject) (NIL)) : number_utilities.significant_digits(multiply($int$100, divide(delta, benchmark_value)), THREE_INTEGER);
                        SubLObject desired_change = getf(kbq_query_run.$kbq_summary_statistics$.getGlobalValue(), property, $UNKNOWN);
                        SubLObject interpretation = NIL;
                        if (((desired_change == $UNKNOWN) || delta.isZero()) || (percent.isNumber() && abs(percent).numLE(FIVE_INTEGER))) {
                            interpretation = NIL;
                        } else {
                            if (((desired_change == $INCREASE) && delta.isPositive()) || ((desired_change == $DECREASE) && delta.isNegative())) {
                                interpretation = $GOOD;
                            } else {
                                interpretation = $BAD;
                            }
                        }
                        return values(percent, interpretation);
                    }
                }

        }
    }

    public static final SubLObject qa_kct_result_p(SubLObject v_object) {
        if (NIL != list_utilities.property_list_p(v_object)) {
            {
                SubLObject test_set_run = qa_kct_result_test_set_run(v_object);
                return kbq_query_run.kct_test_set_run_p(test_set_run);
            }
        }
        return NIL;
    }

    public static final SubLObject qa_kct_result_test_set_run(SubLObject kct_result) {
        return getf(kct_result, $TEST_SET_RUN, NIL);
    }

    public static final SubLObject qa_kct_result_date(SubLObject kct_result) {
        return getf(kct_result, $KCT_DATE, NIL);
    }

    public static final SubLObject qa_benchmark_list_p(SubLObject v_object) {
        return list_utilities.list_of_type_p(QA_BENCHMARK_P, v_object);
    }

    public static final SubLObject qa_categorize_benchmarks_historically(SubLObject v_benchmarks) {
        {
            SubLObject baseline = v_benchmarks.first();
            SubLObject current = last(v_benchmarks, UNPROVIDED).first();
            return values(baseline, current, v_benchmarks);
        }
    }

    public static final SubLObject qa_answerable_benchmarks(SubLObject v_benchmarks) {
        {
            SubLObject new_benchmarks = NIL;
            SubLObject cdolist_list_var = v_benchmarks;
            SubLObject benchmark = NIL;
            for (benchmark = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , benchmark = cdolist_list_var.first()) {
                {
                    SubLObject datum = benchmark;
                    SubLObject current = datum;
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_2 = NIL;
                    for (; NIL != rest;) {
                        destructuring_bind_must_consp(rest, datum, $list_alt2);
                        current_2 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list_alt2);
                        if (NIL == member(current_2, $list_alt3, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_2 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list_alt2);
                    }
                    {
                        SubLObject benchmark_date_tail = property_list_member($BENCHMARK_DATE, current);
                        SubLObject benchmark_date = (NIL != benchmark_date_tail) ? ((SubLObject) (cadr(benchmark_date_tail))) : NIL;
                        SubLObject query_set_run_tail = property_list_member($QUERY_SET_RUN, current);
                        SubLObject query_set_run = (NIL != query_set_run_tail) ? ((SubLObject) (cadr(query_set_run_tail))) : NIL;
                        query_set_run = kbq_query_run.kbq_answerable_query_set_run(query_set_run);
                        new_benchmarks = cons(list($BENCHMARK_DATE, benchmark_date, $QUERY_SET_RUN, query_set_run), new_benchmarks);
                    }
                }
            }
            return nreverse(new_benchmarks);
        }
    }

    public static final SubLObject qa_unanswerable_benchmarks(SubLObject v_benchmarks) {
        {
            SubLObject new_benchmarks = NIL;
            SubLObject cdolist_list_var = v_benchmarks;
            SubLObject benchmark = NIL;
            for (benchmark = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , benchmark = cdolist_list_var.first()) {
                {
                    SubLObject datum = benchmark;
                    SubLObject current = datum;
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_3 = NIL;
                    for (; NIL != rest;) {
                        destructuring_bind_must_consp(rest, datum, $list_alt2);
                        current_3 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list_alt2);
                        if (NIL == member(current_3, $list_alt3, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_3 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list_alt2);
                    }
                    {
                        SubLObject benchmark_date_tail = property_list_member($BENCHMARK_DATE, current);
                        SubLObject benchmark_date = (NIL != benchmark_date_tail) ? ((SubLObject) (cadr(benchmark_date_tail))) : NIL;
                        SubLObject query_set_run_tail = property_list_member($QUERY_SET_RUN, current);
                        SubLObject query_set_run = (NIL != query_set_run_tail) ? ((SubLObject) (cadr(query_set_run_tail))) : NIL;
                        query_set_run = kbq_query_run.kbq_unanswerable_query_set_run(query_set_run);
                        new_benchmarks = cons(list($BENCHMARK_DATE, benchmark_date, $QUERY_SET_RUN, query_set_run), new_benchmarks);
                    }
                }
            }
            return nreverse(new_benchmarks);
        }
    }

    public static final SubLObject qa_filter_benchmarks_to_queries(SubLObject v_benchmarks, SubLObject queries) {
        {
            SubLObject new_benchmarks = NIL;
            SubLObject cdolist_list_var = v_benchmarks;
            SubLObject benchmark = NIL;
            for (benchmark = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , benchmark = cdolist_list_var.first()) {
                {
                    SubLObject new_benchmark = qa_filter_benchmark_to_queries(benchmark, queries);
                    new_benchmarks = cons(new_benchmark, new_benchmarks);
                }
            }
            return nreverse(new_benchmarks);
        }
    }

    public static final SubLObject qa_benchmark_file_p(SubLObject filename) {
        return makeBoolean((NIL != experiment_loop.experiment_result_file_p(filename)) || (NIL != old_format_qa_benchmark_file_p(filename)));
    }

    public static final SubLObject qa_benchmark_file_date(SubLObject filename) {
        if (NIL != experiment_loop.experiment_result_file_p(filename)) {
            return experiment_loop.experiment_result_file_date(filename);
        } else
            if (NIL != old_format_qa_benchmark_file_p(filename)) {
                return old_format_qa_benchmark_file_date(filename);
            } else {
                return Errors.error($str_alt15$_s_was_not_a_qa_benchmark_file_p, filename);
            }

    }

    public static final SubLObject old_format_qa_benchmark_file_p(SubLObject filename) {
        return makeBoolean(((filename.isString() && (NIL != list_utilities.lengthE(filename, $int$24, UNPROVIDED))) && (NIL != string_utilities.starts_with(filename, $str_alt17$qa_))) && (NIL != string_utilities.ends_with(filename, $str_alt18$_cfasl, UNPROVIDED)));
    }

    public static final SubLObject old_format_qa_benchmark_file_date(SubLObject filename) {
        return string_utilities.string_to_integer(subseq(filename, THREE_INTEGER, ELEVEN_INTEGER));
    }

    public static final SubLObject qa_benchmark_files_within_date_range(SubLObject directory, SubLObject start_date, SubLObject end_date) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(start_date, UNIVERSAL_DATE_P);
            SubLSystemTrampolineFile.checkType(end_date, UNIVERSAL_DATE_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!end_date.numGE(start_date)) {
                    Errors.error($str_alt20$Start_date__S_must_not_be_after_e, start_date, end_date);
                }
            }
            {
                SubLObject candidate_files = Filesys.directory(directory, UNPROVIDED);
                SubLObject benchmark_files = NIL;
                SubLObject cdolist_list_var = candidate_files;
                SubLObject candidate_file = NIL;
                for (candidate_file = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_file = cdolist_list_var.first()) {
                    if (NIL != qa_benchmark_file_p(candidate_file)) {
                        {
                            SubLObject benchmark_date = qa_benchmark_file_date(candidate_file);
                            if (start_date.numLE(benchmark_date) && benchmark_date.numLE(end_date)) {
                                benchmark_files = cons(candidate_file, benchmark_files);
                            }
                        }
                    }
                }
                benchmark_files = Sort.sort(benchmark_files, symbol_function($sym21$_), QA_BENCHMARK_FILE_DATE);
                return benchmark_files;
            }
        }
    }

    public static final SubLObject qa_kct_file_p(SubLObject filename) {
        return makeBoolean((NIL != experiment_loop.experiment_result_file_p(filename)) || (NIL != old_format_qa_kct_file_p(filename)));
    }

    public static final SubLObject qa_kct_file_date(SubLObject filename) {
        if (NIL != experiment_loop.experiment_result_file_p(filename)) {
            return experiment_loop.experiment_result_file_date(filename);
        } else
            if (NIL != old_format_qa_kct_file_p(filename)) {
                return old_format_qa_kct_file_date(filename);
            } else {
                return Errors.error($str_alt23$_s_was_not_a_qa_kct_file_p, filename);
            }

    }

    public static final SubLObject old_format_qa_kct_file_p(SubLObject filename) {
        return makeBoolean(((filename.isString() && (NIL != list_utilities.lengthE(filename, $int$25, UNPROVIDED))) && (NIL != string_utilities.starts_with(filename, $str_alt25$kct_))) && (NIL != string_utilities.ends_with(filename, $str_alt18$_cfasl, UNPROVIDED)));
    }

    public static final SubLObject old_format_qa_kct_file_date(SubLObject filename) {
        return string_utilities.string_to_integer(subseq(filename, FOUR_INTEGER, TWELVE_INTEGER));
    }

    public static final SubLObject qa_kct_files_within_date_range(SubLObject directory, SubLObject start_date, SubLObject end_date) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(start_date, UNIVERSAL_DATE_P);
            SubLSystemTrampolineFile.checkType(end_date, UNIVERSAL_DATE_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!end_date.numGE(start_date)) {
                    Errors.error($str_alt20$Start_date__S_must_not_be_after_e, start_date, end_date);
                }
            }
            {
                SubLObject candidate_files = Filesys.directory(directory, UNPROVIDED);
                SubLObject kct_files = NIL;
                SubLObject cdolist_list_var = candidate_files;
                SubLObject candidate_file = NIL;
                for (candidate_file = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_file = cdolist_list_var.first()) {
                    if (NIL != qa_kct_file_p(candidate_file)) {
                        {
                            SubLObject kct_date = qa_kct_file_date(candidate_file);
                            if (start_date.numLE(kct_date) && kct_date.numLE(end_date)) {
                                kct_files = cons(candidate_file, kct_files);
                            }
                        }
                    }
                }
                kct_files = Sort.sort(kct_files, symbol_function($sym21$_), QA_KCT_FILE_DATE);
                return kct_files;
            }
        }
    }

    // deflexical
    private static final SubLSymbol $qa_benchmarks_save_directory$ = makeSymbol("*QA-BENCHMARKS-SAVE-DIRECTORY*");

    // deflexical
    private static final SubLSymbol $qa_benchmarks_load_directory$ = makeSymbol("*QA-BENCHMARKS-LOAD-DIRECTORY*");

    // deflexical
    private static final SubLSymbol $qa_benchmarks_outlier_directory$ = makeSymbol("*QA-BENCHMARKS-OUTLIER-DIRECTORY*");

    /**
     * Load all QA benchmarks in DIRECTORY from START-DATE to END-DATE (inclusive)
     */
    public static final SubLObject qa_load_benchmarks(SubLObject start_date, SubLObject end_date, SubLObject directory) {
        if (end_date == UNPROVIDED) {
            end_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        if (directory == UNPROVIDED) {
            directory = $qa_benchmarks_load_directory$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject benchmark_files = qa_benchmark_files_within_date_range(directory, start_date, end_date);
                SubLObject v_benchmarks = NIL;
                SubLObject list_var = benchmark_files;
                utilities_macros.$progress_note$.setDynamicValue($$$Loading_benchmarks, thread);
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
                            SubLObject benchmark_file = NIL;
                            for (benchmark_file = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , benchmark_file = csome_list_var.first()) {
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                v_benchmarks = cons(qa_load_benchmark(benchmark_file, directory), v_benchmarks);
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
                return nreverse(v_benchmarks);
            }
        }
    }

    public static final SubLObject new_qa_benchmark(SubLObject benchmark_date, SubLObject query_set_run) {
        return list($BENCHMARK_DATE, benchmark_date, $QUERY_SET_RUN, query_set_run);
    }

    public static final SubLObject qa_load_benchmark(SubLObject benchmark_file, SubLObject directory) {
        if (directory == UNPROVIDED) {
            directory = $qa_benchmarks_load_directory$.getGlobalValue();
        }
        {
            SubLObject benchmark_date = qa_benchmark_file_date(benchmark_file);
            SubLObject full_filename = cconcatenate(directory, benchmark_file);
            SubLObject query_set_run = qa_load_benchmark_file(full_filename);
            return new_qa_benchmark(benchmark_date, query_set_run);
        }
    }



    public static final SubLObject clear_qa_load_benchmark_file() {
        {
            SubLObject cs = $qa_load_benchmark_file_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_qa_load_benchmark_file(SubLObject filename) {
        return memoization_state.caching_state_remove_function_results_with_args($qa_load_benchmark_file_caching_state$.getGlobalValue(), list(filename), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject qa_load_benchmark_file_internal(SubLObject filename) {
        return kbq_query_run.kbq_load_query_set_run_and_merge_reruns(filename);
    }

    public static final SubLObject qa_load_benchmark_file(SubLObject filename) {
        {
            SubLObject caching_state = $qa_load_benchmark_file_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(QA_LOAD_BENCHMARK_FILE, $qa_load_benchmark_file_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, filename, $kw32$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw32$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(qa_load_benchmark_file_internal(filename)));
                    memoization_state.caching_state_put(caching_state, filename, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    // deflexical
    private static final SubLSymbol $qa_kct_results_save_directory$ = makeSymbol("*QA-KCT-RESULTS-SAVE-DIRECTORY*");

    // deflexical
    private static final SubLSymbol $qa_kct_results_load_directory$ = makeSymbol("*QA-KCT-RESULTS-LOAD-DIRECTORY*");

    // deflexical
    private static final SubLSymbol $qa_kct_results_outlier_directory$ = makeSymbol("*QA-KCT-RESULTS-OUTLIER-DIRECTORY*");

    /**
     * Load all QA kct-results in DIRECTORY from START-DATE to END-DATE (inclusive)
     */
    public static final SubLObject qa_load_kct_results(SubLObject start_date, SubLObject end_date, SubLObject directory) {
        if (end_date == UNPROVIDED) {
            end_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        if (directory == UNPROVIDED) {
            directory = $qa_kct_results_load_directory$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject kct_files = qa_kct_files_within_date_range(directory, start_date, end_date);
                SubLObject kct_results = NIL;
                SubLObject list_var = kct_files;
                utilities_macros.$progress_note$.setDynamicValue($$$Loading_KCT_results, thread);
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
                            SubLObject kct_file = NIL;
                            for (kct_file = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , kct_file = csome_list_var.first()) {
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject error = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_4 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    {
                                                        SubLObject kct_result = qa_load_kct_result(kct_file, directory);
                                                        if (NIL != error) {
                                                            Errors.warn(error);
                                                        } else {
                                                            kct_results = cons(kct_result, kct_results);
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_4, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
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
                return nreverse(kct_results);
            }
        }
    }

    public static final SubLObject new_qa_kct_result(SubLObject kct_date, SubLObject test_set_run) {
        return list($KCT_DATE, kct_date, $TEST_SET_RUN, test_set_run);
    }

    public static final SubLObject qa_load_kct_result_for_date(SubLObject date, SubLObject directory) {
        if (directory == UNPROVIDED) {
            directory = $qa_kct_results_load_directory$.getGlobalValue();
        }
        {
            SubLObject kct_files = qa_kct_files_within_date_range(directory, date, date);
            SubLSystemTrampolineFile.checkType(kct_files, $sym37$SINGLETON_);
            {
                SubLObject kct_file = kct_files.first();
                return qa_load_kct_result(kct_file, directory);
            }
        }
    }

    public static final SubLObject qa_load_kct_result(SubLObject kct_file, SubLObject directory) {
        if (directory == UNPROVIDED) {
            directory = $qa_kct_results_load_directory$.getGlobalValue();
        }
        {
            SubLObject kct_date = qa_kct_file_date(kct_file);
            SubLObject full_filename = cconcatenate(directory, kct_file);
            SubLObject test_set_run = qa_load_kct_result_file(full_filename);
            return new_qa_kct_result(kct_date, test_set_run);
        }
    }



    public static final SubLObject clear_qa_load_kct_result_file() {
        {
            SubLObject cs = $qa_load_kct_result_file_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_qa_load_kct_result_file(SubLObject filename) {
        return memoization_state.caching_state_remove_function_results_with_args($qa_load_kct_result_file_caching_state$.getGlobalValue(), list(filename), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject qa_load_kct_result_file_internal(SubLObject filename) {
        return kbq_query_run.kct_load_test_set_run_and_merge_reruns(filename);
    }

    public static final SubLObject qa_load_kct_result_file(SubLObject filename) {
        {
            SubLObject caching_state = $qa_load_kct_result_file_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(QA_LOAD_KCT_RESULT_FILE, $qa_load_kct_result_file_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, filename, $kw32$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw32$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(qa_load_kct_result_file_internal(filename)));
                    memoization_state.caching_state_put(caching_state, filename, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static final SubLObject qa_compute_benchmark_analysis_table(SubLObject v_benchmarks, SubLObject metrics) {
        {
            SubLObject analysis_tuples = NIL;
            SubLObject cdolist_list_var = v_benchmarks;
            SubLObject benchmark = NIL;
            for (benchmark = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , benchmark = cdolist_list_var.first()) {
                analysis_tuples = cons(qa_compute_benchmark_analysis(benchmark, metrics), analysis_tuples);
            }
            return nreverse(analysis_tuples);
        }
    }

    public static final SubLObject qa_compute_benchmark_analysis(SubLObject benchmark, SubLObject metrics) {
        {
            SubLObject datum = benchmark;
            SubLObject current = datum;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_5 = NIL;
            for (; NIL != rest;) {
                destructuring_bind_must_consp(rest, datum, $list_alt2);
                current_5 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list_alt2);
                if (NIL == member(current_5, $list_alt3, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_5 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list_alt2);
            }
            {
                SubLObject benchmark_date_tail = property_list_member($BENCHMARK_DATE, current);
                SubLObject benchmark_date = (NIL != benchmark_date_tail) ? ((SubLObject) (cadr(benchmark_date_tail))) : NIL;
                SubLObject query_set_run_tail = property_list_member($QUERY_SET_RUN, current);
                SubLObject query_set_run = (NIL != query_set_run_tail) ? ((SubLObject) (cadr(query_set_run_tail))) : NIL;
                SubLObject analysis = qa_benchmark_query_run_analysis(query_set_run, metrics);
                SubLObject patch_level = kbq_query_run.kbq_query_set_run_patch_level(query_set_run);
                return listS($BENCHMARK_DATE, benchmark_date, $PATCH_LEVEL, patch_level, analysis);
            }
        }
    }



    public static final SubLObject clear_qa_benchmark_query_run_analysis() {
        {
            SubLObject cs = $qa_benchmark_query_run_analysis_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_qa_benchmark_query_run_analysis(SubLObject query_set_run, SubLObject metrics) {
        return memoization_state.caching_state_remove_function_results_with_args($qa_benchmark_query_run_analysis_caching_state$.getGlobalValue(), list(query_set_run, metrics), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject qa_benchmark_query_run_analysis_internal(SubLObject query_set_run, SubLObject metrics) {
        return kbq_query_run.kbq_analyze_query_set_run(query_set_run, metrics);
    }

    public static final SubLObject qa_benchmark_query_run_analysis(SubLObject query_set_run, SubLObject metrics) {
        {
            SubLObject caching_state = $qa_benchmark_query_run_analysis_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(QA_BENCHMARK_QUERY_RUN_ANALYSIS, $qa_benchmark_query_run_analysis_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(query_set_run, metrics);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw32$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (query_set_run.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && metrics.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(qa_benchmark_query_run_analysis_internal(query_set_run, metrics)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(query_set_run, metrics));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static final SubLObject qa_answerable_and_unanswerable_benchmarks(SubLObject v_benchmarks) {
        {
            SubLObject answerable_benchmarks = qa_answerable_benchmarks(v_benchmarks);
            SubLObject answerable_query_runs = Mapping.mapcar(symbol_function(QA_BENCHMARK_QUERY_SET_RUN), answerable_benchmarks);
            SubLObject answerable_common_queries = kbq_query_run.kbq_queries_common_to_all_query_set_runs(answerable_query_runs);
            SubLObject unanswerable_benchmarks = qa_unanswerable_benchmarks(v_benchmarks);
            SubLObject unanswerable_query_runs = Mapping.mapcar(symbol_function(QA_BENCHMARK_QUERY_SET_RUN), unanswerable_benchmarks);
            SubLObject unanswerable_common_queries = kbq_query_run.kbq_queries_common_to_all_query_set_runs(unanswerable_query_runs);
            answerable_benchmarks = qa_filter_benchmarks_to_queries(v_benchmarks, answerable_common_queries);
            unanswerable_benchmarks = qa_filter_benchmarks_to_queries(v_benchmarks, unanswerable_common_queries);
            return values(answerable_benchmarks, unanswerable_benchmarks);
        }
    }

    /**
     * This is useful for making sure that things are outliers,
     * instead of solely relying on file size.
     */
    public static final SubLObject show_qa_benchmarks_total_query_counts(SubLObject v_benchmarks) {
        {
            SubLObject cdolist_list_var = v_benchmarks;
            SubLObject benchmark = NIL;
            for (benchmark = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , benchmark = cdolist_list_var.first()) {
                {
                    SubLObject date = qa_benchmark_date(benchmark);
                    SubLObject query_set_run = qa_benchmark_query_set_run(benchmark);
                    SubLObject query_runs = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
                    SubLObject total = length(query_runs);
                    format(T, $str_alt43$_a_____a__, date, total);
                }
            }
        }
        return NIL;
    }

    /**
     * This is useful for lining up graph points with actual files.
     */
    public static final SubLObject show_qa_benchmarks_summaries(SubLObject v_benchmarks) {
        {
            SubLObject first_date = NIL;
            SubLObject cdolist_list_var = v_benchmarks;
            SubLObject benchmark = NIL;
            for (benchmark = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , benchmark = cdolist_list_var.first()) {
                {
                    SubLObject date = qa_benchmark_date(benchmark);
                    SubLObject query_set_run = qa_benchmark_query_set_run(benchmark);
                    SubLObject analysis = kbq_query_run.kbq_analyze_query_set_run(query_set_run, $list_alt44);
                    SubLObject total_count = getf(analysis, $TOTAL, UNPROVIDED);
                    SubLObject answerable_count = getf(analysis, $TOTAL_ANSWERABLE, UNPROVIDED);
                    SubLObject unanswerable_count = getf(analysis, $TOTAL_UNANSWERABLE, UNPROVIDED);
                    SubLObject error_count = getf(analysis, $TOTAL_ERROR, UNPROVIDED);
                    SubLObject lumpy_count = getf(analysis, $TOTAL_LUMPY, UNPROVIDED);
                    if (NIL == first_date) {
                        first_date = date;
                    }
                    {
                        SubLObject days_elapsed = date_utilities.days_between_universal_dates(first_date, date);
                        format(T, $str_alt50$_a___a_____a_total___a_answerable, new SubLObject[]{ days_elapsed, date, total_count, answerable_count, unanswerable_count, error_count, lumpy_count });
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param THRESHOLD
     * 		integerp; if the total number of queries is below THRESHOLD,
     * 		moves the KCT results file to the outliers directory.
     */
    public static final SubLObject qa_benchmark_move_outliers_to_outlier_directory(SubLObject threshold, SubLObject start_date, SubLObject end_date, SubLObject load_directory, SubLObject outlier_directory) {
        if (end_date == UNPROVIDED) {
            end_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        if (load_directory == UNPROVIDED) {
            load_directory = $qa_benchmarks_load_directory$.getGlobalValue();
        }
        if (outlier_directory == UNPROVIDED) {
            outlier_directory = $qa_benchmarks_outlier_directory$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(threshold, NON_NEGATIVE_INTEGER_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!threshold.numL($int$100000)) {
                    Errors.error($str_alt53$Hmm__looks_like_you_accidentally_, threshold);
                }
            }
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject benchmark_files = qa_benchmark_files_within_date_range(load_directory, start_date, end_date);
                SubLObject list_var = benchmark_files;
                utilities_macros.$progress_note$.setDynamicValue($$$Loading_benchmarks, thread);
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
                            SubLObject benchmark_file = NIL;
                            for (benchmark_file = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , benchmark_file = csome_list_var.first()) {
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject benchmark = NIL;
                                    SubLObject error = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_6 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    benchmark = qa_load_benchmark(benchmark_file, load_directory);
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_6, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL == error) {
                                        {
                                            SubLObject query_set_run = qa_benchmark_query_set_run(benchmark);
                                            SubLObject query_runs = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
                                            SubLObject total = length(query_runs);
                                            if (total.numL(threshold)) {
                                                Errors.warn($str_alt54$Outlier___s_has_only__s_queries, qa_benchmark_date(benchmark), total);
                                                {
                                                    SubLObject old_filename = cconcatenate(load_directory, benchmark_file);
                                                    SubLObject new_filename = cconcatenate(outlier_directory, benchmark_file);
                                                    if (NIL != file_utilities.move_file(old_filename, new_filename)) {
                                                        count = add(count, ONE_INTEGER);
                                                    }
                                                }
                                            }
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
                return count;
            }
        }
    }

    /**
     * must be kept in sync with run-inference-benchmarks.sh
     */
    // deflexical
    private static final SubLSymbol $kbq_nightly_run_query_spec_set$ = makeSymbol("*KBQ-NIGHTLY-RUN-QUERY-SPEC-SET*");

    public static final SubLObject qa_kbq_identify_probable_segfault(SubLObject filename, SubLObject outlier_directory) {
        if (outlier_directory == UNPROVIDED) {
            outlier_directory = $qa_benchmarks_outlier_directory$.getGlobalValue();
        }
        {
            SubLObject crashed_benchmark = qa_load_benchmark(filename, outlier_directory);
            SubLObject crashed_query_set_run = qa_benchmark_query_set_run(crashed_benchmark);
            SubLObject all_kbqs = kbq_query_run.kbq_query_spec_set_elements($kbq_nightly_run_query_spec_set$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            return kbq_query_run.kbq_query_set_run_identify_probable_segfault(crashed_query_set_run, all_kbqs);
        }
    }

    public static final SubLObject qa_benchmark_queries_that_started_failing(SubLObject good_benchmarks, SubLObject bad_benchmarks) {
        {
            SubLObject good_queries = kbq_query_run.kbq_mutually_answerable_queries(Mapping.mapcar(QA_BENCHMARK_QUERY_SET_RUN, good_benchmarks));
            SubLObject bad_queries = kbq_query_run.kbq_mutually_unanswerable_queries(Mapping.mapcar(QA_BENCHMARK_QUERY_SET_RUN, bad_benchmarks));
            return keyhash_utilities.fast_intersection(good_queries, bad_queries, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject show_kbq_error_details(SubLObject benchmark) {
        {
            SubLObject query_set_run = qa_benchmark_query_set_run(benchmark);
            SubLObject cdolist_list_var = kbq_query_run.kbq_query_set_run_query_runs(query_set_run);
            SubLObject query_run = NIL;
            for (query_run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_run = cdolist_list_var.first()) {
                if (NIL != kbq_query_run.kbq_erroring_query_runP(query_run)) {
                    if (NIL == kbq_query_run.kbq_lumpy_query_runP(query_run)) {
                        {
                            SubLObject complete_total_time = kbq_query_run.kbq_query_run_complete_total_time(query_run);
                            SubLObject halt_reason = kbq_query_run.kbq_query_run_halt_reason(query_run);
                            SubLObject error = inference_datastructures_enumerated_types.inference_error_suspend_status_message(halt_reason);
                            SubLObject query = kbq_query_run.kbq_query_run_query(query_run);
                            format(T, $str_alt58$_s__s__s__, new SubLObject[]{ query, complete_total_time, error });
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Filters KCT-RESULTS to only include test runs common to all elements of KCT-RESULTS
     */
    public static final SubLObject qa_kct_mutually_existing_results(SubLObject kct_results) {
        {
            SubLObject filtered_kct_results = NIL;
            SubLObject filtered_test_set_runs = kbq_query_run.kct_common_tests_test_set_runs(Mapping.mapcar(QA_KCT_RESULT_TEST_SET_RUN, kct_results));
            SubLObject kct_result = NIL;
            SubLObject kct_result_7 = NIL;
            SubLObject filtered_test_set_run = NIL;
            SubLObject filtered_test_set_run_8 = NIL;
            for (kct_result = kct_results, kct_result_7 = kct_result.first(), filtered_test_set_run = filtered_test_set_runs, filtered_test_set_run_8 = filtered_test_set_run.first(); !((NIL == filtered_test_set_run) && (NIL == kct_result)); kct_result = kct_result.rest() , kct_result_7 = kct_result.first() , filtered_test_set_run = filtered_test_set_run.rest() , filtered_test_set_run_8 = filtered_test_set_run.first()) {
                {
                    SubLObject filtered_kct_result = new_qa_kct_result(qa_kct_result_date(kct_result_7), filtered_test_set_run_8);
                    filtered_kct_results = cons(filtered_kct_result, filtered_kct_results);
                }
            }
            return nreverse(filtered_kct_results);
        }
    }

    /**
     * This is useful for making sure that things are outliers,
     * instead of solely relying on file size.
     */
    public static final SubLObject show_qa_kct_results_total_query_counts(SubLObject kct_results) {
        {
            SubLObject cdolist_list_var = kct_results;
            SubLObject kct_result = NIL;
            for (kct_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , kct_result = cdolist_list_var.first()) {
                {
                    SubLObject date = qa_kct_result_date(kct_result);
                    SubLObject test_set_run = qa_kct_result_test_set_run(kct_result);
                    SubLObject test_runs = kbq_query_run.kct_test_set_run_test_runs(test_set_run);
                    SubLObject total = length(test_runs);
                    format(T, $str_alt43$_a_____a__, date, total);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param THRESHOLD
     * 		integerp; if the total number of tests is below THRESHOLD,
     * 		moves the KCT results file to the outliers directory.
     */
    public static final SubLObject qa_kct_move_outliers_to_outlier_directory(SubLObject threshold, SubLObject start_date, SubLObject end_date, SubLObject load_directory, SubLObject outlier_directory) {
        if (end_date == UNPROVIDED) {
            end_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        if (load_directory == UNPROVIDED) {
            load_directory = $qa_kct_results_load_directory$.getGlobalValue();
        }
        if (outlier_directory == UNPROVIDED) {
            outlier_directory = $qa_kct_results_outlier_directory$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(threshold, NON_NEGATIVE_INTEGER_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!threshold.numL($int$100000)) {
                    Errors.error($str_alt53$Hmm__looks_like_you_accidentally_, threshold);
                }
            }
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject kct_files = qa_kct_files_within_date_range(load_directory, start_date, end_date);
                SubLObject list_var = kct_files;
                utilities_macros.$progress_note$.setDynamicValue($$$Loading_KCT_results, thread);
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
                            SubLObject kct_file = NIL;
                            for (kct_file = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , kct_file = csome_list_var.first()) {
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject kct_result = NIL;
                                    SubLObject error = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_9 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    kct_result = qa_load_kct_result(kct_file, load_directory);
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_9, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL == error) {
                                        {
                                            SubLObject test_set_run = qa_kct_result_test_set_run(kct_result);
                                            SubLObject test_runs = kbq_query_run.kct_test_set_run_test_runs(test_set_run);
                                            SubLObject total = length(test_runs);
                                            if (total.numL(threshold)) {
                                                Errors.warn($str_alt54$Outlier___s_has_only__s_queries, qa_kct_result_date(kct_result), total);
                                                {
                                                    SubLObject old_filename = cconcatenate(load_directory, kct_file);
                                                    SubLObject new_filename = cconcatenate(outlier_directory, kct_file);
                                                    if (NIL != file_utilities.move_file(old_filename, new_filename)) {
                                                        count = add(count, ONE_INTEGER);
                                                    }
                                                }
                                            }
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
                return count;
            }
        }
    }

    /**
     * must be kept in sync with run-kct-experiment.sh
     */
    // deflexical
    private static final SubLSymbol $kct_nightly_run_test_spec_set$ = makeSymbol("*KCT-NIGHTLY-RUN-TEST-SPEC-SET*");

    public static final SubLObject qa_kct_identify_probable_segfault(SubLObject filename, SubLObject outlier_directory) {
        if (outlier_directory == UNPROVIDED) {
            outlier_directory = $qa_kct_results_outlier_directory$.getGlobalValue();
        }
        {
            SubLObject crashed_kct_result = qa_load_kct_result(filename, outlier_directory);
            SubLObject crashed_test_set_run = qa_kct_result_test_set_run(crashed_kct_result);
            SubLObject all_kcts = kbq_query_run.kct_test_spec_set_elements($kct_nightly_run_test_spec_set$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            return kbq_query_run.kct_test_set_run_identify_probable_segfault(crashed_test_set_run, all_kcts);
        }
    }

    /**
     * This is useful for lining up graph points with actual files.
     */
    public static final SubLObject show_qa_kct_results_summaries(SubLObject kct_results) {
        {
            SubLObject first_date = NIL;
            SubLObject cdolist_list_var = kct_results;
            SubLObject kct_result = NIL;
            for (kct_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , kct_result = cdolist_list_var.first()) {
                {
                    SubLObject date = qa_kct_result_date(kct_result);
                    SubLObject test_set_run = qa_kct_result_test_set_run(kct_result);
                    SubLObject analysis = kbq_query_run.kct_analyze_test_set_run(test_set_run, $list_alt44);
                    SubLObject total_count = getf(analysis, $TOTAL, UNPROVIDED);
                    SubLObject success_count = getf(analysis, $TOTAL_SUCCESS, UNPROVIDED);
                    SubLObject failure_count = getf(analysis, $TOTAL_FAILURE, UNPROVIDED);
                    SubLObject error_count = getf(analysis, $TOTAL_ERROR, UNPROVIDED);
                    SubLObject lumpy_count = getf(analysis, $TOTAL_LUMPY, UNPROVIDED);
                    if (NIL == first_date) {
                        first_date = date;
                    }
                    {
                        SubLObject days_elapsed = date_utilities.days_between_universal_dates(first_date, date);
                        format(T, $str_alt64$_a___a_____a_total___a_success___, new SubLObject[]{ days_elapsed, date, total_count, success_count, failure_count, error_count, lumpy_count });
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject qa_kct_results_test_centric_analysis(SubLObject kct_results) {
        {
            SubLObject test_success_dict = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
            SubLObject test_failure_dict = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
            SubLObject cdolist_list_var = kct_results;
            SubLObject kct_result = NIL;
            for (kct_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , kct_result = cdolist_list_var.first()) {
                {
                    SubLObject test_set_run = qa_kct_result_test_set_run(kct_result);
                    SubLObject test_runs = kbq_query_run.kct_test_set_run_test_runs(test_set_run);
                    SubLObject cdolist_list_var_10 = test_runs;
                    SubLObject test_run = NIL;
                    for (test_run = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , test_run = cdolist_list_var_10.first()) {
                        {
                            SubLObject test = kbq_query_run.kct_test_run_test(test_run);
                            SubLObject status = kbq_query_run.kct_test_run_status(test_run);
                            if (NIL == forts.invalid_fortP(test)) {
                                {
                                    SubLObject pcase_var = status;
                                    if (pcase_var.eql($SUCCESS)) {
                                        dictionary_utilities.dictionary_increment(test_success_dict, test, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($FAILURE)) {
                                            dictionary_utilities.dictionary_increment(test_failure_dict, test, UNPROVIDED);
                                        }

                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject test_success_alist = dictionary_utilities.sort_dictionary_by_values(test_success_dict, symbol_function($sym67$_));
                SubLObject test_failure_alist = dictionary_utilities.sort_dictionary_by_values(test_failure_dict, symbol_function($sym21$_));
                return values(test_success_alist, test_failure_alist);
            }
        }
    }

    public static final SubLObject qa_test_most_recent_failure_date(SubLObject test, SubLObject kct_results) {
        {
            SubLObject cdolist_list_var = reverse(kct_results);
            SubLObject kct_result = NIL;
            for (kct_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , kct_result = cdolist_list_var.first()) {
                {
                    SubLObject test_set_run = qa_kct_result_test_set_run(kct_result);
                    SubLObject test_run = kbq_query_run.kct_lookup_test_run(test_set_run, test);
                    SubLObject status = kbq_query_run.kct_test_run_status(test_run);
                    if ($FAILURE == status) {
                        {
                            SubLObject date = qa_kct_result_date(kct_result);
                            return date;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Used to do the initial sweep to make tests instances of #$KBContentRegressionTest
     */
    public static final SubLObject show_qa_kct_results_most_recent_failure_dates(SubLObject kct_results) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject test_success_alist = qa_kct_results_test_centric_analysis(kct_results);
                SubLObject test_failure_alist = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject cdolist_list_var = test_failure_alist;
                    SubLObject cons = NIL;
                    for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                        {
                            SubLObject datum = cons;
                            SubLObject current = datum;
                            SubLObject test = NIL;
                            SubLObject failure_count = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt68);
                            test = current.first();
                            current = current.rest();
                            failure_count = current;
                            if (failure_count.isPositive()) {
                                {
                                    SubLObject most_recent_failure_date = qa_test_most_recent_failure_date(test, kct_results);
                                    SubLObject most_recent_failure_datestring = (NIL != most_recent_failure_date) ? ((SubLObject) (numeric_date_utilities.datestring(most_recent_failure_date))) : $$$never;
                                    format(T, $str_alt70$_a__failures___a__last_failure___, new SubLObject[]{ test, failure_count, most_recent_failure_datestring });
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Used to do the initial sweep to make tests instances of #$KBContentRegressionTest
     */
    public static final SubLObject qa_kct_tests_that_should_be_regression_tests(SubLObject kct_results) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject regression_tests = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject test_success_alist = qa_kct_results_test_centric_analysis(kct_results);
                    SubLObject test_failure_alist = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject cdolist_list_var = test_success_alist;
                        SubLObject cons = NIL;
                        for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                            {
                                SubLObject datum = cons;
                                SubLObject current = datum;
                                SubLObject test = NIL;
                                SubLObject success_count = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt71);
                                test = current.first();
                                current = current.rest();
                                success_count = current;
                                {
                                    SubLObject failure_count = list_utilities.alist_lookup(test_failure_alist, test, UNPROVIDED, UNPROVIDED);
                                    if ((NIL == failure_count) && (NIL != subl_promotions.positive_integer_p(success_count))) {
                                        if (!((NIL != isa.isa_in_any_mtP(test, $$KBContentRegressionTest)) || (NIL != isa.not_isa_in_any_mtP(test, $$KBContentRegressionTest)))) {
                                            format(T, $str_alt73$_a___a_failures___a_successes__, new SubLObject[]{ test, failure_count, success_count });
                                            regression_tests = cons(test, regression_tests);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return nreverse(regression_tests);
            }
        }
    }

    public static final SubLObject qa_assert_kct_tests_that_should_be_regression_tests(SubLObject tests) {
        {
            SubLObject cdolist_list_var = tests;
            SubLObject test = NIL;
            for (test = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test = cdolist_list_var.first()) {
                ke.ke_assert(listS($$isa, test, $list_alt75), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
            }
        }
        return length(tests);
    }

    /**
     * find queries that have been consistently unanswerable throughout all of KCT-RESULTS,
     * but that have PAD 1 set.
     */
    public static final SubLObject kct_queries_that_shouldnt_have_pad_1(SubLObject kct_results, SubLObject unanswerable_threshold) {
        if (unanswerable_threshold == UNPROVIDED) {
            unanswerable_threshold = $int$30;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject queries = NIL;
                SubLObject unanswerable_dict = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
                SubLObject answerable_dict = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
                SubLObject cdolist_list_var = kct_results;
                SubLObject kct_result = NIL;
                for (kct_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , kct_result = cdolist_list_var.first()) {
                    {
                        SubLObject test_set_run = qa_kct_result_test_set_run(kct_result);
                        SubLObject test_runs = kbq_query_run.kct_test_set_run_test_runs(test_set_run);
                        SubLObject cdolist_list_var_11 = test_runs;
                        SubLObject test_run = NIL;
                        for (test_run = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , test_run = cdolist_list_var_11.first()) {
                            {
                                SubLObject query_run = kbq_query_run.kct_test_run_query_run(test_run);
                                SubLObject query = kbq_query_run.kbq_query_run_query(query_run);
                                SubLObject pad = kbq_query_pad(query);
                                if (pad.numE(ONE_INTEGER)) {
                                    if (ZERO_INTEGER.eql(kbq_query_run.kbq_query_run_answer_count(query_run))) {
                                        dictionary_utilities.dictionary_increment(unanswerable_dict, query, UNPROVIDED);
                                    } else {
                                        dictionary_utilities.dictionary_increment(answerable_dict, query, UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(unanswerable_dict));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject query = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject unanswerable_count = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject answerable_count = dictionary.dictionary_lookup(answerable_dict, query, ZERO_INTEGER);
                                if (answerable_count.numLE(THREE_INTEGER)) {
                                    if (answerable_count.numE(ZERO_INTEGER) && unanswerable_count.numGE(unanswerable_threshold)) {
                                        queries = cons(query, queries);
                                    } else {
                                        format(T, $str_alt78$_a_vs___a___a___, new SubLObject[]{ answerable_count, unanswerable_count, query });
                                    }
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return nreverse(queries);
            }
        }
    }

    /**
     * Find PAD 1 queries that consistently take less than 5 seconds to answer when they are answerable.
     */
    public static final SubLObject kct_more_queries_that_shouldnt_have_pad_1(SubLObject kct_results) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject queries = NIL;
                SubLObject rejected_queries = set.new_set(symbol_function(EQ), UNPROVIDED);
                SubLObject answerable_dict = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
                SubLObject cdolist_list_var = kct_results;
                SubLObject kct_result = NIL;
                for (kct_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , kct_result = cdolist_list_var.first()) {
                    {
                        SubLObject test_set_run = qa_kct_result_test_set_run(kct_result);
                        SubLObject test_runs = kbq_query_run.kct_test_set_run_test_runs(test_set_run);
                        SubLObject cdolist_list_var_12 = test_runs;
                        SubLObject test_run = NIL;
                        for (test_run = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , test_run = cdolist_list_var_12.first()) {
                            {
                                SubLObject query_run = kbq_query_run.kct_test_run_query_run(test_run);
                                SubLObject query = kbq_query_run.kbq_query_run_query(query_run);
                                SubLObject pad = kbq_query_pad(query);
                                if (pad.numE(ONE_INTEGER)) {
                                    if (NIL == set.set_memberP(query, rejected_queries)) {
                                        {
                                            SubLObject total_time = kbq_query_run.kbq_query_run_total_time(query_run);
                                            if (NIL != kbq_query_run.kbq_query_run_answerableP(query_run)) {
                                                if (NIL != list_utilities.safe_L(total_time, FIVE_INTEGER)) {
                                                    dictionary_utilities.dictionary_increment(answerable_dict, query, UNPROVIDED);
                                                } else {
                                                    set.set_add(query, rejected_queries);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(answerable_dict));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject query = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject answerable_count = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (answerable_count.numGE(ONE_INTEGER)) {
                                if (answerable_count.numGE(FIVE_INTEGER)) {
                                    queries = cons(query, queries);
                                } else {
                                    format(T, $str_alt79$_a___a___, answerable_count, query);
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return nreverse(queries);
            }
        }
    }

    public static final SubLObject kct_queries_total_total_time(SubLObject kct_result, SubLObject queries) {
        {
            SubLObject total_total_time = ZERO_INTEGER;
            SubLObject test_set_run = qa_kct_result_test_set_run(kct_result);
            SubLObject test_runs = kbq_query_run.kct_test_set_run_test_runs(test_set_run);
            SubLObject cdolist_list_var = test_runs;
            SubLObject test_run = NIL;
            for (test_run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_run = cdolist_list_var.first()) {
                {
                    SubLObject query_run = kbq_query_run.kct_test_run_query_run(test_run);
                    SubLObject query = kbq_query_run.kbq_query_run_query(query_run);
                    if (NIL != subl_promotions.memberP(query, queries, UNPROVIDED, UNPROVIDED)) {
                        total_total_time = add(total_total_time, kbq_query_run.kbq_query_run_total_time(query_run));
                    }
                }
            }
            return total_total_time;
        }
    }

    public static final SubLObject qa_unassert_kct_queries_that_shouldnt_have_pad_1(SubLObject queries) {
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject cdolist_list_var = queries;
            SubLObject query = NIL;
            for (query = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query = cdolist_list_var.first()) {
                {
                    SubLObject ass = czer_meta.find_assertion_cycl(list($const80$softwareParameterValueInSpecifica, $const81$InferenceProbablyApproximatelyDon, $float$1_0, query), $$TestVocabularyMt);
                    if (NIL != ass) {
                        ke.ke_unassert(list($const80$softwareParameterValueInSpecifica, $const81$InferenceProbablyApproximatelyDon, $float$1_0, query), $$TestVocabularyMt);
                        ke.ke_assert(list($const80$softwareParameterValueInSpecifica, $const81$InferenceProbablyApproximatelyDon, $float$0_95, query), $$TestVocabularyMt, UNPROVIDED, UNPROVIDED);
                        count = add(count, ONE_INTEGER);
                    }
                }
            }
            return count;
        }
    }



    public static final SubLObject clear_kbq_query_pad() {
        {
            SubLObject cs = $kbq_query_pad_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_kbq_query_pad(SubLObject query) {
        return memoization_state.caching_state_remove_function_results_with_args($kbq_query_pad_caching_state$.getGlobalValue(), list(query), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject kbq_query_pad_internal(SubLObject query) {
        return kb_query.kbq_query_property_value_from_keyword(query, $PROBABLY_APPROXIMATELY_DONE);
    }

    public static final SubLObject kbq_query_pad(SubLObject query) {
        {
            SubLObject caching_state = $kbq_query_pad_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(KBQ_QUERY_PAD, $kbq_query_pad_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
                memoization_state.register_hl_store_cache_clear_callback(CLEAR_KBQ_QUERY_PAD);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, query, $kw32$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw32$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(kbq_query_pad_internal(query)));
                    memoization_state.caching_state_put(caching_state, query, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static final SubLObject kbq_queries_with_unspecified_pad() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject queries = NIL;
                SubLObject node_var = $$CycLQuerySpecification;
                {
                    SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                        sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject node_var_13 = node_var;
                            SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            {
                                SubLObject _prev_bind_0_14 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_15 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_16 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt95$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt95$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt95$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt100$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt95$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }


                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_17 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_18 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_19 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_20 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var_13, UNPROVIDED);
                                                                    while (NIL != node_var_13) {
                                                                        {
                                                                            SubLObject tt_node_var = node_var_13;
                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                            SubLObject module_var = NIL;
                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_22 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_23 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                {
                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                    if (NIL != d_link) {
                                                                                                        {
                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            if (NIL != mt_links) {
                                                                                                                {
                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        {
                                                                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_24 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state_25 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_25)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_25);
                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_26 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                    SubLObject cdolist_list_var_27 = new_list;
                                                                                                                                                                    SubLObject query = NIL;
                                                                                                                                                                    for (query = cdolist_list_var_27.first(); NIL != cdolist_list_var_27; cdolist_list_var_27 = cdolist_list_var_27.rest() , query = cdolist_list_var_27.first()) {
                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                            if (NIL != forts.fort_p(query)) {
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject query_properties = kb_query.kbq_query_properties(query);
                                                                                                                                                                                    SubLObject pad = getf(query_properties, $PROBABLY_APPROXIMATELY_DONE, NIL);
                                                                                                                                                                                    if (NIL == pad) {
                                                                                                                                                                                        queries = cons(query, queries);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_26, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state_25 = dictionary_contents.do_dictionary_contents_next(iteration_state_25);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_25);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_24, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                        }
                                                                                                                    } 
                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt101$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                                if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                                                    {
                                                                                                        SubLObject csome_list_var = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                                                        SubLObject instance_tuple = NIL;
                                                                                                        for (instance_tuple = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , instance_tuple = csome_list_var.first()) {
                                                                                                            {
                                                                                                                SubLObject datum = instance_tuple;
                                                                                                                SubLObject current = datum;
                                                                                                                SubLObject link_node = NIL;
                                                                                                                SubLObject mt = NIL;
                                                                                                                SubLObject tv = NIL;
                                                                                                                destructuring_bind_must_consp(current, datum, $list_alt102);
                                                                                                                link_node = current.first();
                                                                                                                current = current.rest();
                                                                                                                destructuring_bind_must_consp(current, datum, $list_alt102);
                                                                                                                mt = current.first();
                                                                                                                current = current.rest();
                                                                                                                destructuring_bind_must_consp(current, datum, $list_alt102);
                                                                                                                tv = current.first();
                                                                                                                current = current.rest();
                                                                                                                if (NIL == current) {
                                                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_28 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_29 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                            {
                                                                                                                                                SubLObject link_nodes = list(link_node);
                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                SubLObject cdolist_list_var_30 = new_list;
                                                                                                                                                SubLObject query = NIL;
                                                                                                                                                for (query = cdolist_list_var_30.first(); NIL != cdolist_list_var_30; cdolist_list_var_30 = cdolist_list_var_30.rest() , query = cdolist_list_var_30.first()) {
                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                        if (NIL != forts.fort_p(query)) {
                                                                                                                                                            {
                                                                                                                                                                SubLObject query_properties = kb_query.kbq_query_properties(query);
                                                                                                                                                                SubLObject pad = getf(query_properties, $PROBABLY_APPROXIMATELY_DONE, NIL);
                                                                                                                                                                if (NIL == pad) {
                                                                                                                                                                    queries = cons(query, queries);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_29, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_28, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    cdestructuring_bind_error(datum, $list_alt102);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                    {
                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        SubLObject cdolist_list_var_31 = new_list;
                                                                                                        SubLObject generating_fn = NIL;
                                                                                                        for (generating_fn = cdolist_list_var_31.first(); NIL != cdolist_list_var_31; cdolist_list_var_31 = cdolist_list_var_31.rest() , generating_fn = cdolist_list_var_31.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_32 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                    {
                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                        SubLObject new_list_33 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject cdolist_list_var_34 = new_list_33;
                                                                                                                        SubLObject query = NIL;
                                                                                                                        for (query = cdolist_list_var_34.first(); NIL != cdolist_list_var_34; cdolist_list_var_34 = cdolist_list_var_34.rest() , query = cdolist_list_var_34.first()) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                if (NIL != forts.fort_p(query)) {
                                                                                                                                    {
                                                                                                                                        SubLObject query_properties = kb_query.kbq_query_properties(query);
                                                                                                                                        SubLObject pad = getf(query_properties, $PROBABLY_APPROXIMATELY_DONE, NIL);
                                                                                                                                        if (NIL == pad) {
                                                                                                                                            queries = cons(query, queries);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_32, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }

                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_23, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_22, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        {
                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                            SubLObject module_var = NIL;
                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_35 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_36 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject node = function_terms.naut_to_nart(node_var_13);
                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                {
                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                    if (NIL != d_link) {
                                                                                                        {
                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            if (NIL != mt_links) {
                                                                                                                {
                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        {
                                                                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_37 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state_38 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_38)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_38);
                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_39 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                    SubLObject cdolist_list_var_40 = new_list;
                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_40.first(); NIL != cdolist_list_var_40; cdolist_list_var_40 = cdolist_list_var_40.rest() , node_vars_link_node = cdolist_list_var_40.first()) {
                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_39, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state_38 = dictionary_contents.do_dictionary_contents_next(iteration_state_38);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_38);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_37, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                        }
                                                                                                                    } 
                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt101$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                    {
                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        SubLObject cdolist_list_var_41 = new_list;
                                                                                                        SubLObject generating_fn = NIL;
                                                                                                        for (generating_fn = cdolist_list_var_41.first(); NIL != cdolist_list_var_41; cdolist_list_var_41 = cdolist_list_var_41.rest() , generating_fn = cdolist_list_var_41.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_42 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                    {
                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                        SubLObject new_list_43 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject cdolist_list_var_44 = new_list_43;
                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                        for (node_vars_link_node = cdolist_list_var_44.first(); NIL != cdolist_list_var_44; cdolist_list_var_44 = cdolist_list_var_44.rest() , node_vars_link_node = cdolist_list_var_44.first()) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_42, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }

                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_36, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_35, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        node_var_13 = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_21, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_20, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_19, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt103$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_18, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_17, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_16, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_15, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_14, thread);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(queries);
            }
        }
    }

    public static final SubLObject qa_assert_95_pad(SubLObject queries) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject list_var = queries;
                utilities_macros.$progress_note$.setDynamicValue($$$cdolist, thread);
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
                            SubLObject query = NIL;
                            for (query = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , query = csome_list_var.first()) {
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                if (NIL != ke.ke_assert_now(list($const80$softwareParameterValueInSpecifica, $const81$InferenceProbablyApproximatelyDon, $float$0_95, query), $$TestVocabularyMt, UNPROVIDED, UNPROVIDED)) {
                                    count = add(count, ONE_INTEGER);
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
                return count;
            }
        }
    }

    public static final SubLObject kct_tests_that_started_failing(SubLObject good_kct_results, SubLObject bad_kct_results) {
        {
            SubLObject good_tests = kbq_query_run.kct_mutually_succeeding_tests(Mapping.mapcar(QA_KCT_RESULT_TEST_SET_RUN, good_kct_results));
            SubLObject bad_tests = kbq_query_run.kct_mutually_failing_tests(Mapping.mapcar(QA_KCT_RESULT_TEST_SET_RUN, bad_kct_results));
            return keyhash_utilities.fast_intersection(good_tests, bad_tests, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static final SubLObject show_halt_reasons_for_kct_tests_that_started_failing(SubLObject good_kct_results, SubLObject bad_kct_results) {
        {
            SubLObject tests_that_started_failing = kct_tests_that_started_failing(good_kct_results, bad_kct_results);
            SubLObject cdolist_list_var = tests_that_started_failing;
            SubLObject test = NIL;
            for (test = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test = cdolist_list_var.first()) {
                format(T, $str_alt105$_a_, test);
                {
                    SubLObject cdolist_list_var_45 = bad_kct_results;
                    SubLObject bad_kct_result = NIL;
                    for (bad_kct_result = cdolist_list_var_45.first(); NIL != cdolist_list_var_45; cdolist_list_var_45 = cdolist_list_var_45.rest() , bad_kct_result = cdolist_list_var_45.first()) {
                        {
                            SubLObject test_set_run = qa_kct_result_test_set_run(bad_kct_result);
                            SubLObject test_run = kbq_query_run.kct_lookup_test_run(test_set_run, test);
                            SubLObject query_run = kbq_query_run.kct_test_run_query_run(test_run);
                            format(T, $str_alt106$_s_, kbq_query_run.kbq_query_run_halt_reason(query_run));
                        }
                    }
                }
                terpri(UNPROVIDED);
            }
            return tests_that_started_failing;
        }
    }

    public static final SubLObject show_kct_error_details(SubLObject kct_result) {
        {
            SubLObject test_set_run = qa_kct_result_test_set_run(kct_result);
            SubLObject cdolist_list_var = kbq_query_run.kct_test_set_run_test_runs(test_set_run);
            SubLObject test_run = NIL;
            for (test_run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_run = cdolist_list_var.first()) {
                if (NIL != kbq_query_run.kct_erroring_test_runP(test_run)) {
                    {
                        SubLObject query_run = kbq_query_run.kct_test_run_query_run(test_run);
                        if (NIL == kbq_query_run.kbq_lumpy_query_runP(query_run)) {
                            {
                                SubLObject complete_total_time = kbq_query_run.kbq_query_run_complete_total_time(query_run);
                                SubLObject halt_reason = kbq_query_run.kbq_query_run_halt_reason(query_run);
                                SubLObject error = inference_datastructures_enumerated_types.inference_error_suspend_status_message(halt_reason);
                                SubLObject test = kbq_query_run.kct_test_run_test(test_run);
                                format(T, $str_alt58$_s__s__s__, new SubLObject[]{ test, complete_total_time, error });
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject load_and_email_kct_result_summaries_for_date(SubLObject date, SubLObject email_if_no_failuresP, SubLObject overriding_to_address, SubLObject directory) {
        if (email_if_no_failuresP == UNPROVIDED) {
            email_if_no_failuresP = NIL;
        }
        if (overriding_to_address == UNPROVIDED) {
            overriding_to_address = NIL;
        }
        if (directory == UNPROVIDED) {
            directory = $qa_kct_results_load_directory$.getGlobalValue();
        }
        if (NIL != email_if_no_failuresP) {
            SubLSystemTrampolineFile.checkType(email_if_no_failuresP, BOOLEANP);
        }
        if (NIL != overriding_to_address) {
            SubLSystemTrampolineFile.checkType(overriding_to_address, STRINGP);
        }
        kct_cyc_testing.load_all_kb_content_tests();
        {
            SubLObject kct_result = qa_load_kct_result_for_date(date, directory);
            return email_kct_result_summaries(kct_result, email_if_no_failuresP, overriding_to_address);
        }
    }

    public static final SubLObject load_and_email_kct_result_summaries(SubLObject kct_filename, SubLObject email_if_no_failuresP, SubLObject overriding_to_address, SubLObject directory) {
        if (email_if_no_failuresP == UNPROVIDED) {
            email_if_no_failuresP = NIL;
        }
        if (overriding_to_address == UNPROVIDED) {
            overriding_to_address = NIL;
        }
        if (directory == UNPROVIDED) {
            directory = $qa_kct_results_load_directory$.getGlobalValue();
        }
        if (NIL != email_if_no_failuresP) {
            SubLSystemTrampolineFile.checkType(email_if_no_failuresP, BOOLEANP);
        }
        if (NIL != overriding_to_address) {
            SubLSystemTrampolineFile.checkType(overriding_to_address, STRINGP);
        }
        kct_cyc_testing.load_all_kb_content_tests();
        {
            SubLObject kct_result = qa_load_kct_result(kct_filename, directory);
            return email_kct_result_summaries(kct_result, email_if_no_failuresP, overriding_to_address);
        }
    }

    /**
     * The entry point for the daily emailing script.
     *
     * @param OVERRIDING-TO-ADDRESS
     * 		stringp without @cyc.com; if specified, will send all emails to this address instead.  Useful for testing.
     */
    public static final SubLObject email_kct_result_summaries(SubLObject kct_result, SubLObject email_if_no_failuresP, SubLObject overriding_to_address) {
        if (email_if_no_failuresP == UNPROVIDED) {
            email_if_no_failuresP = NIL;
        }
        if (overriding_to_address == UNPROVIDED) {
            overriding_to_address = NIL;
        }
        if (NIL != email_if_no_failuresP) {
            SubLSystemTrampolineFile.checkType(email_if_no_failuresP, BOOLEANP);
        }
        if (NIL != overriding_to_address) {
            SubLSystemTrampolineFile.checkType(overriding_to_address, STRINGP);
        }
        {
            SubLObject test_set_run = qa_kct_result_test_set_run(kct_result);
            SubLObject date = qa_kct_result_date(kct_result);
            SubLObject test_run_comment = kbq_query_run.kct_test_set_run_comment(test_set_run);
            SubLObject comment = cconcatenate($str_alt109$KCT_run_started_on_, new SubLObject[]{ format_nil.format_nil_a_no_copy(numeric_date_utilities.datestring(date)), $str_alt110$_, format_nil.$format_nil_percent$.getGlobalValue(), format_nil.format_nil_a_no_copy(test_run_comment) });
            SubLObject cyc_regression_test_runs = kct_cyc_testing.kct_regression_test_set_run_to_cyc_test_runs(test_set_run);
            return NIL != email_if_no_failuresP ? ((SubLObject) (cyc_testing_utilities.email_cyc_test_runs_summaries(cyc_regression_test_runs, comment, overriding_to_address))) : cyc_testing_utilities.email_cyc_test_runs_summaries_if_failures(cyc_regression_test_runs, comment, overriding_to_address);
        }
    }

    public static final SubLObject load_and_create_kct_text_file_summary(SubLObject kct_filename, SubLObject output_filename, SubLObject metrics) {
        if (metrics == UNPROVIDED) {
            metrics = NIL;
        }
        {
            SubLObject kct_result = qa_load_kct_result(kct_filename, UNPROVIDED);
            SubLObject test_set_run = qa_kct_result_test_set_run(kct_result);
            SubLObject analysis = kbq_query_run.kct_analyze_test_set_run(test_set_run, metrics);
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(output_filename, $OUTPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt112$Unable_to_open__S, output_filename);
                }
                {
                    SubLObject s = stream;
                    list_utilities.pretty_print_plist(analysis, s);
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
            return kct_result;
        }
    }

    public static final SubLObject qa_benchmark_tracking_table(SubLObject baseline_benchmark, SubLObject current_benchmark, SubLObject historical_benchmarks, SubLObject metrics, SubLObject display_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject baseline_analysis = qa_compute_benchmark_analysis(baseline_benchmark, metrics);
                SubLObject current_analysis = qa_compute_benchmark_analysis(current_benchmark, metrics);
                SubLObject historical_analysis_table = qa_compute_benchmark_analysis_table(historical_benchmarks, metrics);
                SubLObject candidate_properties = list_utilities.plist_properties(baseline_analysis);
                {
                    SubLObject cdolist_list_var = candidate_properties;
                    SubLObject property = NIL;
                    for (property = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , property = cdolist_list_var.first()) {
                        if (NIL == subl_promotions.memberP(property, display_properties, UNPROVIDED, UNPROVIDED)) {
                            candidate_properties = delete(property, candidate_properties, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(ONE_INTEGER);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ_strong($$$Metrics);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ_strong($$$Baseline);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ_strong($$$Change);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(TWO_INTEGER);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($CENTER));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_princ_strong($$$Current);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                {
                                    SubLObject rowspan = add(THREE_INTEGER, length(candidate_properties));
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (NIL != rowspan) {
                                        html_utilities.html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(rowspan);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_glyph($NBSP, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                {
                                    SubLObject colspan = number_utilities.f_2X(length(historical_benchmarks));
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (NIL != colspan) {
                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(colspan);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align($LEFT));
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_utilities.html_princ_strong($$$Historical_Trend);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        qa_benchmark_tracking_table_row($BENCHMARK_DATE, baseline_analysis, current_analysis, historical_analysis_table);
                        qa_benchmark_tracking_table_row($PATCH_LEVEL, baseline_analysis, current_analysis, historical_analysis_table);
                        {
                            SubLObject cdolist_list_var = candidate_properties;
                            SubLObject property = NIL;
                            for (property = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , property = cdolist_list_var.first()) {
                                qa_benchmark_tracking_table_row(property, baseline_analysis, current_analysis, historical_analysis_table);
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject qa_benchmark_tracking_table_row(SubLObject property, SubLObject baseline_analysis, SubLObject current_analysis, SubLObject historical_analysis_table) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (true) {
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align($RIGHT));
                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                            html_utilities.html_princ(property);
                            html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
                        }
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    {
                        SubLObject baseline_value = getf(baseline_analysis, property, UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (true) {
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align($RIGHT));
                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                show_qa_benchmark_value(property, baseline_value);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        {
                            SubLObject previous_analysis = NIL;
                            qa_benchmark_tracking_table_cell(property, current_analysis, previous_analysis, baseline_analysis, T);
                            {
                                SubLObject cdolist_list_var = historical_analysis_table;
                                SubLObject historical_analysis = NIL;
                                for (historical_analysis = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , historical_analysis = cdolist_list_var.first()) {
                                    qa_benchmark_tracking_table_cell(property, historical_analysis, previous_analysis, baseline_analysis, UNPROVIDED);
                                    previous_analysis = historical_analysis;
                                }
                            }
                        }
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri(UNPROVIDED);
            return NIL;
        }
    }

    public static final SubLObject qa_benchmark_tracking_table_cell(SubLObject property, SubLObject current_analysis, SubLObject previous_analysis, SubLObject baseline_analysis, SubLObject show_deltaP) {
        if (show_deltaP == UNPROVIDED) {
            show_deltaP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject baseline_value = getf(baseline_analysis, property, UNPROVIDED);
                SubLObject current_value = getf(current_analysis, property, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject delta_value = qa_compute_benchmark_delta(property, baseline_value, current_value);
                    SubLObject baseline_interpretation = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject delta_color = qa_determine_interpretation_color(baseline_interpretation, $LOW);
                        SubLObject previous_delta_value = NIL;
                        SubLObject previous_interpretation = NIL;
                        if (NIL != show_deltaP) {
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != delta_color) {
                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(delta_color);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL != delta_value) {
                                        show_qa_benchmark_delta_value(property, delta_value);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        if (NIL != previous_analysis) {
                            {
                                SubLObject previous_value = getf(previous_analysis, property, UNPROVIDED);
                                thread.resetMultipleValues();
                                {
                                    SubLObject previous_delta_value_55 = qa_compute_benchmark_delta(property, previous_value, current_value);
                                    SubLObject previous_interpretation_56 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    previous_delta_value = previous_delta_value_55;
                                    previous_interpretation = previous_interpretation_56;
                                }
                            }
                        }
                        if ((NIL != previous_delta_value) && (NIL != previous_interpretation)) {
                            {
                                SubLObject previous_color = qa_determine_interpretation_color(previous_interpretation, $HIGH);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align($LEFT));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (NIL != previous_color) {
                                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(previous_color);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        if (previous_delta_value.isPositive()) {
                                            html_utilities.html_glyph($UARR, UNPROVIDED);
                                        } else {
                                            html_utilities.html_glyph($DARR, UNPROVIDED);
                                        }
                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                        }
                        {
                            SubLObject colspan = ((NIL != previous_delta_value) && (NIL != previous_interpretation)) ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER;
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            if (NIL != colspan) {
                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(colspan);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align($RIGHT));
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != delta_color) {
                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                html_utilities.html_markup(delta_color);
                                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    show_qa_benchmark_value(property, current_value);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject show_qa_benchmark_delta_value(SubLObject property, SubLObject delta_value) {
        if (delta_value.isPositive()) {
            html_utilities.html_princ($str_alt126$_);
        }
        show_qa_benchmark_value(property, delta_value);
        html_utilities.html_princ($str_alt127$__);
        return NIL;
    }

    public static final SubLObject show_qa_benchmark_value(SubLObject property, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = property;
                if (pcase_var.eql($BENCHMARK_DATE)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject day = numeric_date_utilities.decode_universal_date(value);
                        SubLObject month = thread.secondMultipleValue();
                        SubLObject year = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt128$_S__S, month, day);
                    }
                } else
                    if (pcase_var.eql($PATCH_LEVEL)) {
                        {
                            SubLObject datum = value;
                            SubLObject current = datum;
                            SubLObject major = NIL;
                            SubLObject minor = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt129);
                            major = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt129);
                            minor = current.first();
                            current = current.rest();
                            {
                                SubLObject rest = current;
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt130$_A__A, major, minor);
                            }
                        }
                    } else {
                        if (value.isDouble()) {
                            if (value.numGE($int$10000)) {
                                value = round(value, UNPROVIDED);
                            } else {
                                value = number_utilities.significant_digits(value, FOUR_INTEGER);
                            }
                        }
                        html_utilities.html_princ(value);
                    }

            }
            return NIL;
        }
    }

    public static final SubLObject qa_determine_interpretation_color(SubLObject interpretation, SubLObject saturation) {
        if (saturation == UNPROVIDED) {
            saturation = $LOW;
        }
        {
            SubLObject pcase_var = saturation;
            if (pcase_var.eql($HIGH)) {
                {
                    SubLObject pcase_var_57 = interpretation;
                    if (pcase_var_57.eql($GOOD)) {
                        return $$$00FF00;
                    } else
                        if (pcase_var_57.eql($BAD)) {
                            return $$$FF0000;
                        } else {
                            return NIL;
                        }

                }
            } else
                if (pcase_var.eql($MEDIUM)) {
                    {
                        SubLObject pcase_var_58 = interpretation;
                        if (pcase_var_58.eql($GOOD)) {
                            return $$$BFFFBF;
                        } else
                            if (pcase_var_58.eql($BAD)) {
                                return $$$FFBFBF;
                            } else {
                                return NIL;
                            }

                    }
                } else
                    if (pcase_var.eql($LOW)) {
                        {
                            SubLObject pcase_var_59 = interpretation;
                            if (pcase_var_59.eql($GOOD)) {
                                return $$$DFFFDF;
                            } else
                                if (pcase_var_59.eql($BAD)) {
                                    return $$$FFDFDF;
                                } else {
                                    return NIL;
                                }

                        }
                    }


        }
        return NIL;
    }

    public static final SubLObject qa_benchmark_daily_tracking_overview(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = args;
                SubLObject current = datum;
                SubLObject baseline_day_string = NIL;
                SubLObject current_day_string = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt139);
                baseline_day_string = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt139);
                current_day_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject baseline_date = read_from_string_ignoring_errors(baseline_day_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject current_date = read_from_string_ignoring_errors(current_day_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL == numeric_date_utilities.universal_date_p(baseline_date)) {
                            return cb_utilities.cb_error($str_alt140$_S_could_not_be_interpreted_as_a_, baseline_day_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if (NIL == numeric_date_utilities.universal_date_p(current_date)) {
                            return cb_utilities.cb_error($str_alt140$_S_could_not_be_interpreted_as_a_, current_day_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        {
                            SubLObject v_benchmarks = qa_load_benchmarks(baseline_date, current_date, $qa_benchmarks_load_directory$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                            html_macros.html_head_content_type();
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ($$$Daily_QA_Benchmark_Tracking);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            {
                                SubLObject color_value = $$$FFFFFF;
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                                    try {
                                        html_macros.$html_inside_bodyP$.bind(T, thread);
                                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                        if (NIL != color_value) {
                                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_color(color_value));
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                                html_utilities.html_markup(TWO_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                html_utilities.html_princ($$$Daily_QA_Benchmark_Tracking);
                                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                                html_utilities.html_markup(TWO_INTEGER);
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                qa_benchmark_overview(v_benchmarks);
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_copyright_notice();
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt139);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cb_link_qa_benchmark_daily_tracking_overview(SubLObject baseline_date, SubLObject current_date, SubLObject linktext) {
        if (current_date == UNPROVIDED) {
            current_date = NIL;
        }
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == current_date) {
                current_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
            }
            if (NIL == linktext) {
                linktext = $str_alt144$_Daily_QA_Benchmark_Tracking_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($SELF);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt146$qa_benchmark_daily_tracking_overv, baseline_date, current_date);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject qa_benchmark_overview(SubLObject v_benchmarks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject answerable_benchmarks = qa_answerable_and_unanswerable_benchmarks(v_benchmarks);
                SubLObject unanswerable_benchmarks = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject baseline = qa_categorize_benchmarks_historically(v_benchmarks);
                    SubLObject current = thread.secondMultipleValue();
                    SubLObject historical_list = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    html_utilities.html_newline(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                    html_utilities.html_princ_strong($$$Overall);
                    html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                    qa_benchmark_tracking_table(baseline, current, historical_list, $list_alt150, $list_alt151);
                }
                thread.resetMultipleValues();
                {
                    SubLObject baseline = qa_categorize_benchmarks_historically(answerable_benchmarks);
                    SubLObject current = thread.secondMultipleValue();
                    SubLObject historical_list = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    html_utilities.html_newline(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                    html_utilities.html_princ_strong($$$Consistently_Answerable);
                    html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                    qa_benchmark_tracking_table(baseline, current, historical_list, $list_alt153, $list_alt154);
                }
                thread.resetMultipleValues();
                {
                    SubLObject baseline = qa_categorize_benchmarks_historically(unanswerable_benchmarks);
                    SubLObject current = thread.secondMultipleValue();
                    SubLObject historical_list = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    html_utilities.html_newline(UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                    html_utilities.html_princ_strong($$$Consistently_Unanswerable);
                    html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                    qa_benchmark_tracking_table(baseline, current, historical_list, $list_alt156, $list_alt157);
                }
            }
            return NIL;
        }
    }

    /**
     * See also @xref kct-generate-graph.
     *
     * @param LINE-SPECIFICATIONS
     * 		list of line-specification-p; each of which is a plist with the following properties:
     * 		line-label ; an optional label for the line
     * 		metric     ; an optional metric to pass to the analyzer
     * 		statistic  ; the statistic to extract from the analysis results, used to generate the y-values
     * 		collection ; an optional collection used to filter BENCHMARKS to only include queries that are instances of COLLECTION
     */
    public static final SubLObject kbq_generate_graph(SubLObject v_benchmarks, SubLObject line_specifications, SubLObject plot_properties) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        {
            SubLObject coordinates_vector = make_vector(length(line_specifications), UNPROVIDED);
            SubLObject first_date = qa_benchmark_date(v_benchmarks.first());
            SubLObject last_date = qa_benchmark_date(last(v_benchmarks, UNPROVIDED).first());
            SubLObject interval_string = cconcatenate(numeric_date_utilities.datestring(first_date), new SubLObject[]{ $str_alt158$___, numeric_date_utilities.datestring(last_date) });
            SubLObject plot_title = cconcatenate(getf(plot_properties, $PLOT_TITLE, $$$Benchmark_Graph), new SubLObject[]{ $str_alt161$_n, interval_string });
            SubLObject queries = (NIL != getf(plot_properties, $kw162$COMMON_QUERIES_, UNPROVIDED)) ? ((SubLObject) (kbq_query_run.kbq_queries_common_to_all_query_set_runs(Mapping.mapcar(QA_BENCHMARK_QUERY_SET_RUN, v_benchmarks)))) : NIL;
            SubLObject cdolist_list_var = v_benchmarks;
            SubLObject benchmark = NIL;
            for (benchmark = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , benchmark = cdolist_list_var.first()) {
                {
                    SubLObject date = qa_benchmark_date(benchmark);
                    SubLObject query_set_run = qa_benchmark_query_set_run(benchmark);
                    SubLObject days_elapsed = date_utilities.days_between_universal_dates(first_date, date);
                    if (NIL != queries) {
                        query_set_run = kbq_query_run.kbq_filter_query_set_run_to_queries(query_set_run, queries, UNPROVIDED);
                    }
                    {
                        SubLObject list_var = NIL;
                        SubLObject line_spec = NIL;
                        SubLObject i = NIL;
                        for (list_var = line_specifications, line_spec = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , line_spec = list_var.first() , i = add(ONE_INTEGER, i)) {
                            {
                                SubLObject y_value = kbq_query_set_run_value_from_line_specification(query_set_run, line_spec);
                                SubLObject coord = list(days_elapsed, y_value);
                                set_aref(coordinates_vector, i, cons(coord, aref(coordinates_vector, i)));
                            }
                        }
                    }
                }
            }
            {
                SubLObject coordinates_list = vector_utilities.vector_elements(coordinates_vector, UNPROVIDED);
                plot_properties = copy_list(plot_properties);
                plot_properties = putf(plot_properties, $PLOT_TITLE, plot_title);
                plot_properties = list_utilities.maybe_putf(plot_properties, $XLABEL, cconcatenate($str_alt164$__of_days_after_, format_nil.format_nil_a_no_copy(numeric_date_utilities.datestring(first_date))));
                plot_properties = list_utilities.maybe_putf(plot_properties, $YLABEL, $str_alt166$__of_queries);
                plot_properties = list_utilities.maybe_putf(plot_properties, $kw167$LOGSCALE_, NIL);
                plot_properties = list_utilities.maybe_putf(plot_properties, $LINE_LABELS, line_labels_from_line_specifications(line_specifications));
                plot_properties = list_utilities.maybe_putf(plot_properties, $KEY_LOCATION, plot_generation.compute_key_location(apply(symbol_function(APPEND), coordinates_list)));
                return plot_generation.generate_lines_graph(coordinates_list, plot_properties);
            }
        }
    }

    public static final SubLObject kbq_query_set_run_value_from_line_specification(SubLObject query_set_run, SubLObject line_spec) {
        {
            SubLObject datum = line_spec;
            SubLObject current = datum;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_61 = NIL;
            for (; NIL != rest;) {
                destructuring_bind_must_consp(rest, datum, $list_alt171);
                current_61 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list_alt171);
                if (NIL == member(current_61, $list_alt172, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_61 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list_alt171);
            }
            {
                SubLObject line_label_tail = property_list_member($LINE_LABEL, current);
                SubLObject line_label = (NIL != line_label_tail) ? ((SubLObject) (cadr(line_label_tail))) : NIL;
                SubLObject metric_tail = property_list_member($METRIC, current);
                SubLObject metric = (NIL != metric_tail) ? ((SubLObject) (cadr(metric_tail))) : NIL;
                SubLObject statistic_tail = property_list_member($STATISTIC, current);
                SubLObject statistic = (NIL != statistic_tail) ? ((SubLObject) (cadr(statistic_tail))) : NIL;
                SubLObject collection_tail = property_list_member($COLLECTION, current);
                SubLObject collection = (NIL != collection_tail) ? ((SubLObject) (cadr(collection_tail))) : NIL;
                SubLObject filtered_query_set_run = (NIL != collection) ? ((SubLObject) (kbq_query_run.kbq_filter_query_set_run_to_query_collection(query_set_run, collection, UNPROVIDED))) : query_set_run;
                SubLObject analysis = kbq_query_run.kbq_analyze_query_set_run(filtered_query_set_run, NIL != metric ? ((SubLObject) (list(metric))) : NIL);
                SubLObject value = getf(analysis, statistic, UNPROVIDED);
                return value;
            }
        }
    }

    /**
     * See also @xref kbq-generate-graph.
     *
     * @param LINE-SPECIFICATIONS
     * 		list of line-specification-p; each of which is a plist with the following properties:
     * 		line-label ; an optional label for the line
     * 		metric     ; an optional metric to pass to the analyzer
     * 		statistic  ; the statistic to extract from the analysis results, used to generate the y-values
     * 		collection ; an optional collection used to filter KCT-RESULTS to only include tests that are instances of COLLECTION
     */
    public static final SubLObject kct_generate_graph(SubLObject kct_results, SubLObject line_specifications, SubLObject plot_properties) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        {
            SubLObject coordinates_vector = make_vector(length(line_specifications), UNPROVIDED);
            SubLObject first_date = qa_kct_result_date(kct_results.first());
            SubLObject last_date = qa_kct_result_date(last(kct_results, UNPROVIDED).first());
            SubLObject interval_string = cconcatenate(numeric_date_utilities.datestring(first_date), new SubLObject[]{ $str_alt158$___, numeric_date_utilities.datestring(last_date) });
            SubLObject plot_title = cconcatenate(getf(plot_properties, $PLOT_TITLE, $$$KB_Content_Test_Results_Graph), new SubLObject[]{ $str_alt161$_n, interval_string });
            SubLObject tests = (NIL != getf(plot_properties, $kw178$COMMON_TESTS_, UNPROVIDED)) ? ((SubLObject) (kbq_query_run.kct_tests_common_to_all_test_set_runs(Mapping.mapcar(QA_KCT_RESULT_TEST_SET_RUN, kct_results)))) : NIL;
            SubLObject cdolist_list_var = kct_results;
            SubLObject kct_result = NIL;
            for (kct_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , kct_result = cdolist_list_var.first()) {
                {
                    SubLObject date = qa_kct_result_date(kct_result);
                    SubLObject test_set_run = qa_kct_result_test_set_run(kct_result);
                    SubLObject days_elapsed = date_utilities.days_between_universal_dates(first_date, date);
                    if (NIL != tests) {
                        test_set_run = kbq_query_run.kct_filter_test_set_run_to_tests(test_set_run, tests, UNPROVIDED);
                    }
                    {
                        SubLObject list_var = NIL;
                        SubLObject line_spec = NIL;
                        SubLObject i = NIL;
                        for (list_var = line_specifications, line_spec = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , line_spec = list_var.first() , i = add(ONE_INTEGER, i)) {
                            {
                                SubLObject y_value = kct_test_set_run_value_from_line_specification(test_set_run, line_spec);
                                SubLObject coord = list(days_elapsed, y_value);
                                set_aref(coordinates_vector, i, cons(coord, aref(coordinates_vector, i)));
                            }
                        }
                    }
                }
            }
            {
                SubLObject coordinates_list = vector_utilities.vector_elements(coordinates_vector, UNPROVIDED);
                plot_properties = copy_list(plot_properties);
                plot_properties = putf(plot_properties, $PLOT_TITLE, plot_title);
                plot_properties = list_utilities.maybe_putf(plot_properties, $XLABEL, cconcatenate($str_alt164$__of_days_after_, format_nil.format_nil_a_no_copy(numeric_date_utilities.datestring(first_date))));
                plot_properties = list_utilities.maybe_putf(plot_properties, $YLABEL, $str_alt179$__of_tests);
                plot_properties = list_utilities.maybe_putf(plot_properties, $kw167$LOGSCALE_, NIL);
                plot_properties = list_utilities.maybe_putf(plot_properties, $LINE_LABELS, line_labels_from_line_specifications(line_specifications));
                plot_properties = list_utilities.maybe_putf(plot_properties, $KEY_LOCATION, plot_generation.compute_key_location(apply(symbol_function(APPEND), coordinates_list)));
                return plot_generation.generate_lines_graph(coordinates_list, plot_properties);
            }
        }
    }

    public static final SubLObject kct_test_set_run_value_from_line_specification(SubLObject test_set_run, SubLObject line_spec) {
        {
            SubLObject datum = line_spec;
            SubLObject current = datum;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_62 = NIL;
            for (; NIL != rest;) {
                destructuring_bind_must_consp(rest, datum, $list_alt171);
                current_62 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list_alt171);
                if (NIL == member(current_62, $list_alt172, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_62 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list_alt171);
            }
            {
                SubLObject line_label_tail = property_list_member($LINE_LABEL, current);
                SubLObject line_label = (NIL != line_label_tail) ? ((SubLObject) (cadr(line_label_tail))) : NIL;
                SubLObject metric_tail = property_list_member($METRIC, current);
                SubLObject metric = (NIL != metric_tail) ? ((SubLObject) (cadr(metric_tail))) : NIL;
                SubLObject statistic_tail = property_list_member($STATISTIC, current);
                SubLObject statistic = (NIL != statistic_tail) ? ((SubLObject) (cadr(statistic_tail))) : NIL;
                SubLObject collection_tail = property_list_member($COLLECTION, current);
                SubLObject collection = (NIL != collection_tail) ? ((SubLObject) (cadr(collection_tail))) : NIL;
                SubLObject filtered_test_set_run = (NIL != collection) ? ((SubLObject) (kbq_query_run.kct_filter_test_set_run_to_test_collection(test_set_run, collection, UNPROVIDED))) : test_set_run;
                SubLObject analysis = kbq_query_run.kct_analyze_test_set_run(filtered_test_set_run, NIL != metric ? ((SubLObject) (list(metric))) : list($ANSWER_COUNT));
                SubLObject value = getf(analysis, statistic, UNPROVIDED);
                return value;
            }
        }
    }

    /**
     *
     *
     * @param COLLECTION;
     * 		if non-nil, wil restrict KCT-RESULTS to only include tests that are instances of COLLECTION
     */
    public static final SubLObject kct_generate_result_counts_graph(SubLObject kct_results, SubLObject include_total_countP, SubLObject collection) {
        if (include_total_countP == UNPROVIDED) {
            include_total_countP = NIL;
        }
        if (collection == UNPROVIDED) {
            collection = NIL;
        }
        {
            SubLObject plot_title = cconcatenate(NIL != collection ? ((SubLObject) (string_utilities.str(collection))) : $$$KB_Content_Test, $str_alt182$_Result_Counts);
            SubLObject failure_line_spec = list($STATISTIC, $TOTAL_FAILURE, $COLLECTION, collection);
            SubLObject success_line_spec = list($STATISTIC, $TOTAL_SUCCESS, $COLLECTION, collection);
            SubLObject total_line_spec = list($STATISTIC, $TOTAL, $COLLECTION, collection);
            SubLObject line_specifications = (NIL != include_total_countP) ? ((SubLObject) (list(failure_line_spec, success_line_spec, total_line_spec))) : list(failure_line_spec, success_line_spec);
            return kct_generate_graph(kct_results, line_specifications, list($PLOT_TITLE, plot_title));
        }
    }

    /**
     *
     *
     * @param COLLECTION;
     * 		if non-nil, wil restrict KCT-RESULTS to only include tests that are instances of COLLECTION
     */
    public static final SubLObject kct_generate_result_percentages_graph(SubLObject kct_results, SubLObject include_failing_percentageP, SubLObject collection) {
        if (include_failing_percentageP == UNPROVIDED) {
            include_failing_percentageP = NIL;
        }
        if (collection == UNPROVIDED) {
            collection = NIL;
        }
        {
            SubLObject plot_title = cconcatenate(NIL != collection ? ((SubLObject) (string_utilities.str(collection))) : $$$KB_Content_Test, $str_alt183$_Result_Percentages);
            SubLObject failure_line_spec = list($STATISTIC, $PERCENT_FAILURE, $COLLECTION, collection);
            SubLObject success_line_spec = list($STATISTIC, $PERCENT_SUCCESS, $COLLECTION, collection);
            SubLObject line_specifications = (NIL != include_failing_percentageP) ? ((SubLObject) (list(failure_line_spec, success_line_spec))) : list(success_line_spec);
            return kct_generate_graph(kct_results, line_specifications, list($PLOT_TITLE, plot_title));
        }
    }

    public static final SubLObject line_labels_from_line_specifications(SubLObject line_specifications) {
        return Mapping.mapcar(LINE_LABEL_FROM_LINE_SPECIFICATION, line_specifications);
    }

    public static final SubLObject line_label_from_line_specification(SubLObject line_spec) {
        {
            SubLObject explicit_label = getf(line_spec, $LINE_LABEL, UNPROVIDED);
            if (NIL != explicit_label) {
                return explicit_label;
            }
        }
        {
            SubLObject statistic = getf(line_spec, $STATISTIC, UNPROVIDED);
            SubLObject pcase_var = statistic;
            if (pcase_var.eql($TOTAL)) {
                return $str_alt187$total___of_tests;
            } else
                if (pcase_var.eql($TOTAL_SUCCESS)) {
                    return $str_alt188$__of_succeeding_tests;
                } else
                    if (pcase_var.eql($TOTAL_FAILURE)) {
                        return $str_alt189$__of_failing_tests;
                    } else
                        if (pcase_var.eql($TOTAL_ERROR)) {
                            return $str_alt190$__of_erroring_tests;
                        } else
                            if (pcase_var.eql($TOTAL_LUMPY)) {
                                return $str_alt191$__of_lumpy_tests;
                            } else
                                if (pcase_var.eql($PERCENT_SUCCESS)) {
                                    return $str_alt192$__of_tests_succeeding;
                                } else
                                    if (pcase_var.eql($PERCENT_FAILURE)) {
                                        return $str_alt193$__of_tests_failing;
                                    } else {
                                        return string_utilities.str(statistic);
                                    }






        }
    }

    public static final SubLObject declare_qa_benchmarks_file() {
        declareFunction("qa_benchmark_p", "QA-BENCHMARK-P", 1, 0, false);
        declareFunction("qa_benchmark_date", "QA-BENCHMARK-DATE", 1, 0, false);
        declareFunction("qa_benchmark_query_set_run", "QA-BENCHMARK-QUERY-SET-RUN", 1, 0, false);
        declareFunction("qa_filter_benchmark_to_queries", "QA-FILTER-BENCHMARK-TO-QUERIES", 2, 0, false);
        declareFunction("qa_compute_benchmark_delta", "QA-COMPUTE-BENCHMARK-DELTA", 3, 0, false);
        declareFunction("qa_kct_result_p", "QA-KCT-RESULT-P", 1, 0, false);
        declareFunction("qa_kct_result_test_set_run", "QA-KCT-RESULT-TEST-SET-RUN", 1, 0, false);
        declareFunction("qa_kct_result_date", "QA-KCT-RESULT-DATE", 1, 0, false);
        declareFunction("qa_benchmark_list_p", "QA-BENCHMARK-LIST-P", 1, 0, false);
        declareFunction("qa_categorize_benchmarks_historically", "QA-CATEGORIZE-BENCHMARKS-HISTORICALLY", 1, 0, false);
        declareFunction("qa_answerable_benchmarks", "QA-ANSWERABLE-BENCHMARKS", 1, 0, false);
        declareFunction("qa_unanswerable_benchmarks", "QA-UNANSWERABLE-BENCHMARKS", 1, 0, false);
        declareFunction("qa_filter_benchmarks_to_queries", "QA-FILTER-BENCHMARKS-TO-QUERIES", 2, 0, false);
        declareFunction("qa_benchmark_file_p", "QA-BENCHMARK-FILE-P", 1, 0, false);
        declareFunction("qa_benchmark_file_date", "QA-BENCHMARK-FILE-DATE", 1, 0, false);
        declareFunction("old_format_qa_benchmark_file_p", "OLD-FORMAT-QA-BENCHMARK-FILE-P", 1, 0, false);
        declareFunction("old_format_qa_benchmark_file_date", "OLD-FORMAT-QA-BENCHMARK-FILE-DATE", 1, 0, false);
        declareFunction("qa_benchmark_files_within_date_range", "QA-BENCHMARK-FILES-WITHIN-DATE-RANGE", 3, 0, false);
        declareFunction("qa_kct_file_p", "QA-KCT-FILE-P", 1, 0, false);
        declareFunction("qa_kct_file_date", "QA-KCT-FILE-DATE", 1, 0, false);
        declareFunction("old_format_qa_kct_file_p", "OLD-FORMAT-QA-KCT-FILE-P", 1, 0, false);
        declareFunction("old_format_qa_kct_file_date", "OLD-FORMAT-QA-KCT-FILE-DATE", 1, 0, false);
        declareFunction("qa_kct_files_within_date_range", "QA-KCT-FILES-WITHIN-DATE-RANGE", 3, 0, false);
        declareFunction("qa_load_benchmarks", "QA-LOAD-BENCHMARKS", 1, 2, false);
        declareFunction("new_qa_benchmark", "NEW-QA-BENCHMARK", 2, 0, false);
        declareFunction("qa_load_benchmark", "QA-LOAD-BENCHMARK", 1, 1, false);
        declareFunction("clear_qa_load_benchmark_file", "CLEAR-QA-LOAD-BENCHMARK-FILE", 0, 0, false);
        declareFunction("remove_qa_load_benchmark_file", "REMOVE-QA-LOAD-BENCHMARK-FILE", 1, 0, false);
        declareFunction("qa_load_benchmark_file_internal", "QA-LOAD-BENCHMARK-FILE-INTERNAL", 1, 0, false);
        declareFunction("qa_load_benchmark_file", "QA-LOAD-BENCHMARK-FILE", 1, 0, false);
        declareFunction("qa_load_kct_results", "QA-LOAD-KCT-RESULTS", 1, 2, false);
        declareFunction("new_qa_kct_result", "NEW-QA-KCT-RESULT", 2, 0, false);
        declareFunction("qa_load_kct_result_for_date", "QA-LOAD-KCT-RESULT-FOR-DATE", 1, 1, false);
        declareFunction("qa_load_kct_result", "QA-LOAD-KCT-RESULT", 1, 1, false);
        declareFunction("clear_qa_load_kct_result_file", "CLEAR-QA-LOAD-KCT-RESULT-FILE", 0, 0, false);
        declareFunction("remove_qa_load_kct_result_file", "REMOVE-QA-LOAD-KCT-RESULT-FILE", 1, 0, false);
        declareFunction("qa_load_kct_result_file_internal", "QA-LOAD-KCT-RESULT-FILE-INTERNAL", 1, 0, false);
        declareFunction("qa_load_kct_result_file", "QA-LOAD-KCT-RESULT-FILE", 1, 0, false);
        declareFunction("qa_compute_benchmark_analysis_table", "QA-COMPUTE-BENCHMARK-ANALYSIS-TABLE", 2, 0, false);
        declareFunction("qa_compute_benchmark_analysis", "QA-COMPUTE-BENCHMARK-ANALYSIS", 2, 0, false);
        declareFunction("clear_qa_benchmark_query_run_analysis", "CLEAR-QA-BENCHMARK-QUERY-RUN-ANALYSIS", 0, 0, false);
        declareFunction("remove_qa_benchmark_query_run_analysis", "REMOVE-QA-BENCHMARK-QUERY-RUN-ANALYSIS", 2, 0, false);
        declareFunction("qa_benchmark_query_run_analysis_internal", "QA-BENCHMARK-QUERY-RUN-ANALYSIS-INTERNAL", 2, 0, false);
        declareFunction("qa_benchmark_query_run_analysis", "QA-BENCHMARK-QUERY-RUN-ANALYSIS", 2, 0, false);
        declareFunction("qa_answerable_and_unanswerable_benchmarks", "QA-ANSWERABLE-AND-UNANSWERABLE-BENCHMARKS", 1, 0, false);
        declareFunction("show_qa_benchmarks_total_query_counts", "SHOW-QA-BENCHMARKS-TOTAL-QUERY-COUNTS", 1, 0, false);
        declareFunction("show_qa_benchmarks_summaries", "SHOW-QA-BENCHMARKS-SUMMARIES", 1, 0, false);
        declareFunction("qa_benchmark_move_outliers_to_outlier_directory", "QA-BENCHMARK-MOVE-OUTLIERS-TO-OUTLIER-DIRECTORY", 2, 3, false);
        declareFunction("qa_kbq_identify_probable_segfault", "QA-KBQ-IDENTIFY-PROBABLE-SEGFAULT", 1, 1, false);
        declareFunction("qa_benchmark_queries_that_started_failing", "QA-BENCHMARK-QUERIES-THAT-STARTED-FAILING", 2, 0, false);
        declareFunction("show_kbq_error_details", "SHOW-KBQ-ERROR-DETAILS", 1, 0, false);
        declareFunction("qa_kct_mutually_existing_results", "QA-KCT-MUTUALLY-EXISTING-RESULTS", 1, 0, false);
        declareFunction("show_qa_kct_results_total_query_counts", "SHOW-QA-KCT-RESULTS-TOTAL-QUERY-COUNTS", 1, 0, false);
        declareFunction("qa_kct_move_outliers_to_outlier_directory", "QA-KCT-MOVE-OUTLIERS-TO-OUTLIER-DIRECTORY", 2, 3, false);
        declareFunction("qa_kct_identify_probable_segfault", "QA-KCT-IDENTIFY-PROBABLE-SEGFAULT", 1, 1, false);
        declareFunction("show_qa_kct_results_summaries", "SHOW-QA-KCT-RESULTS-SUMMARIES", 1, 0, false);
        declareFunction("qa_kct_results_test_centric_analysis", "QA-KCT-RESULTS-TEST-CENTRIC-ANALYSIS", 1, 0, false);
        declareFunction("qa_test_most_recent_failure_date", "QA-TEST-MOST-RECENT-FAILURE-DATE", 2, 0, false);
        declareFunction("show_qa_kct_results_most_recent_failure_dates", "SHOW-QA-KCT-RESULTS-MOST-RECENT-FAILURE-DATES", 1, 0, false);
        declareFunction("qa_kct_tests_that_should_be_regression_tests", "QA-KCT-TESTS-THAT-SHOULD-BE-REGRESSION-TESTS", 1, 0, false);
        declareFunction("qa_assert_kct_tests_that_should_be_regression_tests", "QA-ASSERT-KCT-TESTS-THAT-SHOULD-BE-REGRESSION-TESTS", 1, 0, false);
        declareFunction("kct_queries_that_shouldnt_have_pad_1", "KCT-QUERIES-THAT-SHOULDNT-HAVE-PAD-1", 1, 1, false);
        declareFunction("kct_more_queries_that_shouldnt_have_pad_1", "KCT-MORE-QUERIES-THAT-SHOULDNT-HAVE-PAD-1", 1, 0, false);
        declareFunction("kct_queries_total_total_time", "KCT-QUERIES-TOTAL-TOTAL-TIME", 2, 0, false);
        declareFunction("qa_unassert_kct_queries_that_shouldnt_have_pad_1", "QA-UNASSERT-KCT-QUERIES-THAT-SHOULDNT-HAVE-PAD-1", 1, 0, false);
        declareFunction("clear_kbq_query_pad", "CLEAR-KBQ-QUERY-PAD", 0, 0, false);
        declareFunction("remove_kbq_query_pad", "REMOVE-KBQ-QUERY-PAD", 1, 0, false);
        declareFunction("kbq_query_pad_internal", "KBQ-QUERY-PAD-INTERNAL", 1, 0, false);
        declareFunction("kbq_query_pad", "KBQ-QUERY-PAD", 1, 0, false);
        declareFunction("kbq_queries_with_unspecified_pad", "KBQ-QUERIES-WITH-UNSPECIFIED-PAD", 0, 0, false);
        declareFunction("qa_assert_95_pad", "QA-ASSERT-95-PAD", 1, 0, false);
        declareFunction("kct_tests_that_started_failing", "KCT-TESTS-THAT-STARTED-FAILING", 2, 0, false);
        declareFunction("show_halt_reasons_for_kct_tests_that_started_failing", "SHOW-HALT-REASONS-FOR-KCT-TESTS-THAT-STARTED-FAILING", 2, 0, false);
        declareFunction("show_kct_error_details", "SHOW-KCT-ERROR-DETAILS", 1, 0, false);
        declareFunction("load_and_email_kct_result_summaries_for_date", "LOAD-AND-EMAIL-KCT-RESULT-SUMMARIES-FOR-DATE", 1, 3, false);
        declareFunction("load_and_email_kct_result_summaries", "LOAD-AND-EMAIL-KCT-RESULT-SUMMARIES", 1, 3, false);
        declareFunction("email_kct_result_summaries", "EMAIL-KCT-RESULT-SUMMARIES", 1, 2, false);
        declareFunction("load_and_create_kct_text_file_summary", "LOAD-AND-CREATE-KCT-TEXT-FILE-SUMMARY", 2, 1, false);
        declareFunction("qa_benchmark_tracking_table", "QA-BENCHMARK-TRACKING-TABLE", 5, 0, false);
        declareFunction("qa_benchmark_tracking_table_row", "QA-BENCHMARK-TRACKING-TABLE-ROW", 4, 0, false);
        declareFunction("qa_benchmark_tracking_table_cell", "QA-BENCHMARK-TRACKING-TABLE-CELL", 4, 1, false);
        declareFunction("show_qa_benchmark_delta_value", "SHOW-QA-BENCHMARK-DELTA-VALUE", 2, 0, false);
        declareFunction("show_qa_benchmark_value", "SHOW-QA-BENCHMARK-VALUE", 2, 0, false);
        declareFunction("qa_determine_interpretation_color", "QA-DETERMINE-INTERPRETATION-COLOR", 1, 1, false);
        declareFunction("qa_benchmark_daily_tracking_overview", "QA-BENCHMARK-DAILY-TRACKING-OVERVIEW", 1, 0, false);
        declareFunction("cb_link_qa_benchmark_daily_tracking_overview", "CB-LINK-QA-BENCHMARK-DAILY-TRACKING-OVERVIEW", 1, 2, false);
        declareFunction("qa_benchmark_overview", "QA-BENCHMARK-OVERVIEW", 1, 0, false);
        declareFunction("kbq_generate_graph", "KBQ-GENERATE-GRAPH", 2, 1, false);
        declareFunction("kbq_query_set_run_value_from_line_specification", "KBQ-QUERY-SET-RUN-VALUE-FROM-LINE-SPECIFICATION", 2, 0, false);
        declareFunction("kct_generate_graph", "KCT-GENERATE-GRAPH", 2, 1, false);
        declareFunction("kct_test_set_run_value_from_line_specification", "KCT-TEST-SET-RUN-VALUE-FROM-LINE-SPECIFICATION", 2, 0, false);
        declareFunction("kct_generate_result_counts_graph", "KCT-GENERATE-RESULT-COUNTS-GRAPH", 1, 2, false);
        declareFunction("kct_generate_result_percentages_graph", "KCT-GENERATE-RESULT-PERCENTAGES-GRAPH", 1, 2, false);
        declareFunction("line_labels_from_line_specifications", "LINE-LABELS-FROM-LINE-SPECIFICATIONS", 1, 0, false);
        declareFunction("line_label_from_line_specification", "LINE-LABEL-FROM-LINE-SPECIFICATION", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_qa_benchmarks_file() {
        deflexical("*QA-BENCHMARKS-SAVE-DIRECTORY*", $str_alt27$_cyc_top_data_benchmark_results_d);
        deflexical("*QA-BENCHMARKS-LOAD-DIRECTORY*", $str_alt27$_cyc_top_data_benchmark_results_d);
        deflexical("*QA-BENCHMARKS-OUTLIER-DIRECTORY*", $str_alt28$_cyc_top_data_benchmark_results_o);
        deflexical("*QA-LOAD-BENCHMARK-FILE-CACHING-STATE*", NIL);
        deflexical("*QA-KCT-RESULTS-SAVE-DIRECTORY*", $str_alt33$_cyc_top_data_kct_results_daily_);
        deflexical("*QA-KCT-RESULTS-LOAD-DIRECTORY*", $str_alt33$_cyc_top_data_kct_results_daily_);
        deflexical("*QA-KCT-RESULTS-OUTLIER-DIRECTORY*", $str_alt34$_cyc_top_data_kct_results_outlier);
        deflexical("*QA-LOAD-KCT-RESULT-FILE-CACHING-STATE*", NIL);
        deflexical("*QA-BENCHMARK-QUERY-RUN-ANALYSIS-CACHING-STATE*", NIL);
        deflexical("*KBQ-NIGHTLY-RUN-QUERY-SPEC-SET*", $$AreteQuery);
        deflexical("*KCT-NIGHTLY-RUN-TEST-SPEC-SET*", $list_alt60);
        deflexical("*KBQ-QUERY-PAD-CACHING-STATE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_qa_benchmarks_file() {
                memoization_state.note_globally_cached_function(QA_LOAD_BENCHMARK_FILE);
        memoization_state.note_globally_cached_function(QA_LOAD_KCT_RESULT_FILE);
        memoization_state.note_globally_cached_function(QA_BENCHMARK_QUERY_RUN_ANALYSIS);
        utilities_macros.note_funcall_helper_function(QA_BENCHMARK_MOVE_OUTLIERS_TO_OUTLIER_DIRECTORY);
        utilities_macros.note_funcall_helper_function(QA_KBQ_IDENTIFY_PROBABLE_SEGFAULT);
        utilities_macros.note_funcall_helper_function(QA_KCT_IDENTIFY_PROBABLE_SEGFAULT);
        memoization_state.note_globally_cached_function(KBQ_QUERY_PAD);
        html_macros.note_html_handler_function(QA_BENCHMARK_DAILY_TRACKING_OVERVIEW);
        cb_utilities.setup_cb_link_method($QA_BENCHMARK_DAILY_TRACKING_OVERVIEW, CB_LINK_QA_BENCHMARK_DAILY_TRACKING_OVERVIEW, THREE_INTEGER);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $BENCHMARK_DATE = makeKeyword("BENCHMARK-DATE");

    private static final SubLSymbol $QUERY_SET_RUN = makeKeyword("QUERY-SET-RUN");

    static private final SubLList $list_alt2 = list(makeSymbol("&KEY"), makeSymbol("BENCHMARK-DATE"), makeSymbol("QUERY-SET-RUN"));

    static private final SubLList $list_alt3 = list(makeKeyword("BENCHMARK-DATE"), makeKeyword("QUERY-SET-RUN"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");









    private static final SubLSymbol $DECREASE = makeKeyword("DECREASE");





    private static final SubLSymbol $TEST_SET_RUN = makeKeyword("TEST-SET-RUN");

    private static final SubLSymbol $KCT_DATE = makeKeyword("KCT-DATE");

    private static final SubLSymbol QA_BENCHMARK_P = makeSymbol("QA-BENCHMARK-P");

    static private final SubLString $str_alt15$_s_was_not_a_qa_benchmark_file_p = makeString("~s was not a qa-benchmark-file-p");

    public static final SubLInteger $int$24 = makeInteger(24);

    static private final SubLString $str_alt17$qa_ = makeString("qa-");

    static private final SubLString $str_alt18$_cfasl = makeString(".cfasl");



    static private final SubLString $str_alt20$Start_date__S_must_not_be_after_e = makeString("Start date ~S must not be after end date ~S");

    static private final SubLSymbol $sym21$_ = makeSymbol("<");

    private static final SubLSymbol QA_BENCHMARK_FILE_DATE = makeSymbol("QA-BENCHMARK-FILE-DATE");

    static private final SubLString $str_alt23$_s_was_not_a_qa_kct_file_p = makeString("~s was not a qa-kct-file-p");

    public static final SubLInteger $int$25 = makeInteger(25);

    static private final SubLString $str_alt25$kct_ = makeString("kct-");

    private static final SubLSymbol QA_KCT_FILE_DATE = makeSymbol("QA-KCT-FILE-DATE");

    static private final SubLString $str_alt27$_cyc_top_data_benchmark_results_d = makeString("/cyc/top/data/benchmark-results/daily/");

    static private final SubLString $str_alt28$_cyc_top_data_benchmark_results_o = makeString("/cyc/top/data/benchmark-results/outliers/");

    static private final SubLString $$$Loading_benchmarks = makeString("Loading benchmarks");

    private static final SubLSymbol QA_LOAD_BENCHMARK_FILE = makeSymbol("QA-LOAD-BENCHMARK-FILE");

    public static final SubLSymbol $qa_load_benchmark_file_caching_state$ = makeSymbol("*QA-LOAD-BENCHMARK-FILE-CACHING-STATE*");

    public static final SubLSymbol $kw32$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt33$_cyc_top_data_kct_results_daily_ = makeString("/cyc/top/data/kct-results/daily/");

    static private final SubLString $str_alt34$_cyc_top_data_kct_results_outlier = makeString("/cyc/top/data/kct-results/outliers/");

    static private final SubLString $$$Loading_KCT_results = makeString("Loading KCT results");



    static private final SubLSymbol $sym37$SINGLETON_ = makeSymbol("SINGLETON?");

    private static final SubLSymbol QA_LOAD_KCT_RESULT_FILE = makeSymbol("QA-LOAD-KCT-RESULT-FILE");

    public static final SubLSymbol $qa_load_kct_result_file_caching_state$ = makeSymbol("*QA-LOAD-KCT-RESULT-FILE-CACHING-STATE*");

    private static final SubLSymbol QA_BENCHMARK_QUERY_RUN_ANALYSIS = makeSymbol("QA-BENCHMARK-QUERY-RUN-ANALYSIS");

    public static final SubLSymbol $qa_benchmark_query_run_analysis_caching_state$ = makeSymbol("*QA-BENCHMARK-QUERY-RUN-ANALYSIS-CACHING-STATE*");

    private static final SubLSymbol QA_BENCHMARK_QUERY_SET_RUN = makeSymbol("QA-BENCHMARK-QUERY-SET-RUN");

    static private final SubLString $str_alt43$_a_____a__ = makeString("~a -> ~a~%");

    static private final SubLList $list_alt44 = list(makeKeyword("ANSWER-COUNT"));











    static private final SubLString $str_alt50$_a___a_____a_total___a_answerable = makeString("~a: ~a -> ~a total, ~a answerable, ~a unanswerable, ~a error, ~a lumpy~%");



    public static final SubLInteger $int$100000 = makeInteger(100000);

    static private final SubLString $str_alt53$Hmm__looks_like_you_accidentally_ = makeString("Hmm, looks like you accidentally specified a universal date instead of a threshold: ~s");

    static private final SubLString $str_alt54$Outlier___s_has_only__s_queries = makeString("Outlier: ~s has only ~s queries");

    private static final SubLSymbol QA_BENCHMARK_MOVE_OUTLIERS_TO_OUTLIER_DIRECTORY = makeSymbol("QA-BENCHMARK-MOVE-OUTLIERS-TO-OUTLIER-DIRECTORY");

    public static final SubLObject $$AreteQuery = constant_handles.reader_make_constant_shell(makeString("AreteQuery"));

    private static final SubLSymbol QA_KBQ_IDENTIFY_PROBABLE_SEGFAULT = makeSymbol("QA-KBQ-IDENTIFY-PROBABLE-SEGFAULT");

    static private final SubLString $str_alt58$_s__s__s__ = makeString("~s ~s ~s~%");

    private static final SubLSymbol QA_KCT_RESULT_TEST_SET_RUN = makeSymbol("QA-KCT-RESULT-TEST-SET-RUN");

    static private final SubLList $list_alt60 = list(constant_handles.reader_make_constant_shell(makeString("CollectionDifferenceFn")), list(constant_handles.reader_make_constant_shell(makeString("CollectionDifferenceFn")), constant_handles.reader_make_constant_shell(makeString("KBContentTest-FullySpecified")), constant_handles.reader_make_constant_shell(makeString("SKSIContentTest"))), constant_handles.reader_make_constant_shell(makeString("TextualEntailmentKBContentTest")));

    private static final SubLSymbol QA_KCT_IDENTIFY_PROBABLE_SEGFAULT = makeSymbol("QA-KCT-IDENTIFY-PROBABLE-SEGFAULT");





    static private final SubLString $str_alt64$_a___a_____a_total___a_success___ = makeString("~a: ~a -> ~a total, ~a success, ~a failure, ~a error, ~a lumpy~%");





    static private final SubLSymbol $sym67$_ = makeSymbol(">");

    static private final SubLList $list_alt68 = cons(makeSymbol("TEST"), makeSymbol("FAILURE-COUNT"));

    static private final SubLString $$$never = makeString("never");

    static private final SubLString $str_alt70$_a__failures___a__last_failure___ = makeString("~a: failures: ~a, last failure: ~a~%");

    static private final SubLList $list_alt71 = cons(makeSymbol("TEST"), makeSymbol("SUCCESS-COUNT"));

    public static final SubLObject $$KBContentRegressionTest = constant_handles.reader_make_constant_shell(makeString("KBContentRegressionTest"));

    static private final SubLString $str_alt73$_a___a_failures___a_successes__ = makeString("~a: ~a failures, ~a successes~%");

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLList $list_alt75 = list(constant_handles.reader_make_constant_shell(makeString("KBContentRegressionTest")));

    public static final SubLObject $$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    public static final SubLInteger $int$30 = makeInteger(30);

    static private final SubLString $str_alt78$_a_vs___a___a___ = makeString("~a vs. ~a (~a)~%");

    static private final SubLString $str_alt79$_a___a___ = makeString("~a (~a)~%");

    public static final SubLObject $const80$softwareParameterValueInSpecifica = constant_handles.reader_make_constant_shell(makeString("softwareParameterValueInSpecification"));

    public static final SubLObject $const81$InferenceProbablyApproximatelyDon = constant_handles.reader_make_constant_shell(makeString("InferenceProbablyApproximatelyDoneParameter"));

    public static final SubLFloat $float$1_0 = makeDouble(1.0);

    public static final SubLObject $$TestVocabularyMt = constant_handles.reader_make_constant_shell(makeString("TestVocabularyMt"));

    public static final SubLFloat $float$0_95 = makeDouble(0.95);

    private static final SubLSymbol KBQ_QUERY_PAD = makeSymbol("KBQ-QUERY-PAD");

    private static final SubLSymbol $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");

    public static final SubLSymbol $kbq_query_pad_caching_state$ = makeSymbol("*KBQ-QUERY-PAD-CACHING-STATE*");

    private static final SubLSymbol CLEAR_KBQ_QUERY_PAD = makeSymbol("CLEAR-KBQ-QUERY-PAD");

    public static final SubLObject $$CycLQuerySpecification = constant_handles.reader_make_constant_shell(makeString("CycLQuerySpecification"));











    static private final SubLString $str_alt95$_A_is_not_a__A = makeString("~A is not a ~A");





    static private final SubLString $$$continue_anyway = makeString("continue anyway");



    static private final SubLString $str_alt100$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt101$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLList $list_alt102 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    static private final SubLString $str_alt103$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLString $$$cdolist = makeString("cdolist");

    static private final SubLString $str_alt105$_a_ = makeString("~a ");

    static private final SubLString $str_alt106$_s_ = makeString("~s ");





    static private final SubLString $str_alt109$KCT_run_started_on_ = makeString("KCT run started on ");

    static private final SubLString $str_alt110$_ = makeString(":");



    static private final SubLString $str_alt112$Unable_to_open__S = makeString("Unable to open ~S");



    static private final SubLString $$$Metrics = makeString("Metrics");



    static private final SubLString $$$Baseline = makeString("Baseline");

    static private final SubLString $$$Change = makeString("Change");

    static private final SubLString $$$Current = makeString("Current");





    static private final SubLString $$$Historical_Trend = makeString("Historical Trend");

    private static final SubLSymbol $LOW = makeKeyword("LOW");







    static private final SubLString $str_alt126$_ = makeString("+");

    static private final SubLString $str_alt127$__ = makeString(" %");

    static private final SubLString $str_alt128$_S__S = makeString("~S/~S");

    static private final SubLList $list_alt129 = list(makeSymbol("MAJOR"), makeSymbol("MINOR"), makeSymbol("&REST"), makeSymbol("REST"));

    static private final SubLString $str_alt130$_A__A = makeString("~A.~A");

    public static final SubLInteger $int$10000 = makeInteger(10000);

    static private final SubLString $$$00FF00 = makeString("00FF00");

    static private final SubLString $$$FF0000 = makeString("FF0000");



    static private final SubLString $$$BFFFBF = makeString("BFFFBF");

    static private final SubLString $$$FFBFBF = makeString("FFBFBF");

    static private final SubLString $$$DFFFDF = makeString("DFFFDF");

    static private final SubLString $$$FFDFDF = makeString("FFDFDF");

    static private final SubLList $list_alt139 = list(makeSymbol("BASELINE-DAY-STRING"), makeSymbol("CURRENT-DAY-STRING"));

    static private final SubLString $str_alt140$_S_could_not_be_interpreted_as_a_ = makeString("~S could not be interpreted as a date.");

    static private final SubLString $$$Daily_QA_Benchmark_Tracking = makeString("Daily QA Benchmark Tracking");

    static private final SubLString $$$FFFFFF = makeString("FFFFFF");

    private static final SubLSymbol QA_BENCHMARK_DAILY_TRACKING_OVERVIEW = makeSymbol("QA-BENCHMARK-DAILY-TRACKING-OVERVIEW");

    static private final SubLString $str_alt144$_Daily_QA_Benchmark_Tracking_ = makeString("[Daily QA Benchmark Tracking]");



    static private final SubLString $str_alt146$qa_benchmark_daily_tracking_overv = makeString("qa-benchmark-daily-tracking-overview&~A&~A");

    private static final SubLSymbol $QA_BENCHMARK_DAILY_TRACKING_OVERVIEW = makeKeyword("QA-BENCHMARK-DAILY-TRACKING-OVERVIEW");

    private static final SubLSymbol CB_LINK_QA_BENCHMARK_DAILY_TRACKING_OVERVIEW = makeSymbol("CB-LINK-QA-BENCHMARK-DAILY-TRACKING-OVERVIEW");

    static private final SubLString $$$Overall = makeString("Overall");

    static private final SubLList $list_alt150 = list(makeKeyword("ANSWER-COUNT"), makeKeyword("TOTAL-TIME"));

    static private final SubLList $list_alt151 = list(new SubLObject[]{ makeKeyword("TOTAL"), makeKeyword("TOTAL-ANSWERABLE"), makeKeyword("TOTAL-UNANSWERABLE"), makeKeyword("SUM-TOTAL-TIME"), makeKeyword("MEAN-TOTAL-TIME"), makeKeyword("MEDIAN-TOTAL-TIME"), makeKeyword("SUM-ANSWER-COUNT"), makeKeyword("MEAN-ANSWER-COUNT"), makeKeyword("MEDIAN-ANSWER-COUNT") });

    static private final SubLString $$$Consistently_Answerable = makeString("Consistently Answerable");

    static private final SubLList $list_alt153 = list(makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("TIME-TO-LAST-ANSWER"), makeKeyword("TOTAL-TIME"), makeKeyword("ANSWER-COUNT"));

    static private final SubLList $list_alt154 = list(new SubLObject[]{ makeKeyword("TOTAL"), makeKeyword("MEAN-TIME-TO-FIRST-ANSWER"), makeKeyword("MEDIAN-TIME-TO-FIRST-ANSWER"), makeKeyword("MEAN-TIME-TO-LAST-ANSWER"), makeKeyword("MEDIAN-TIME-TO-LAST-ANSWER"), makeKeyword("MEAN-TOTAL-TIME"), makeKeyword("MEDIAN-TOTAL-TIME"), makeKeyword("MEAN-ANSWER-COUNT"), makeKeyword("MEDIAN-ANSWER-COUNT"), makeKeyword("MEDIAN-TIME-PER-ANSWER") });

    static private final SubLString $$$Consistently_Unanswerable = makeString("Consistently Unanswerable");

    static private final SubLList $list_alt156 = list(makeKeyword("TOTAL-TIME"));

    static private final SubLList $list_alt157 = list(makeKeyword("TOTAL"), makeKeyword("MEAN-TOTAL-TIME"), makeKeyword("MEDIAN-TOTAL-TIME"));

    static private final SubLString $str_alt158$___ = makeString(" - ");



    static private final SubLString $$$Benchmark_Graph = makeString("Benchmark Graph");

    static private final SubLString $str_alt161$_n = makeString("\\n");

    public static final SubLSymbol $kw162$COMMON_QUERIES_ = makeKeyword("COMMON-QUERIES?");



    static private final SubLString $str_alt164$__of_days_after_ = makeString("# of days after ");



    static private final SubLString $str_alt166$__of_queries = makeString("# of queries");

    public static final SubLSymbol $kw167$LOGSCALE_ = makeKeyword("LOGSCALE?");



    private static final SubLSymbol $KEY_LOCATION = makeKeyword("KEY-LOCATION");



    static private final SubLList $list_alt171 = list(makeSymbol("&KEY"), makeSymbol("LINE-LABEL"), makeSymbol("METRIC"), makeSymbol("STATISTIC"), makeSymbol("COLLECTION"));

    static private final SubLList $list_alt172 = list(makeKeyword("LINE-LABEL"), makeKeyword("METRIC"), makeKeyword("STATISTIC"), makeKeyword("COLLECTION"));



    private static final SubLSymbol $METRIC = makeKeyword("METRIC");

    private static final SubLSymbol $STATISTIC = makeKeyword("STATISTIC");



    static private final SubLString $$$KB_Content_Test_Results_Graph = makeString("KB Content Test Results Graph");

    public static final SubLSymbol $kw178$COMMON_TESTS_ = makeKeyword("COMMON-TESTS?");

    static private final SubLString $str_alt179$__of_tests = makeString("# of tests");



    static private final SubLString $$$KB_Content_Test = makeString("KB Content Test");

    static private final SubLString $str_alt182$_Result_Counts = makeString(" Result Counts");

    static private final SubLString $str_alt183$_Result_Percentages = makeString(" Result Percentages");





    private static final SubLSymbol LINE_LABEL_FROM_LINE_SPECIFICATION = makeSymbol("LINE-LABEL-FROM-LINE-SPECIFICATION");

    static private final SubLString $str_alt187$total___of_tests = makeString("total # of tests");

    static private final SubLString $str_alt188$__of_succeeding_tests = makeString("# of succeeding tests");

    static private final SubLString $str_alt189$__of_failing_tests = makeString("# of failing tests");

    static private final SubLString $str_alt190$__of_erroring_tests = makeString("# of erroring tests");

    static private final SubLString $str_alt191$__of_lumpy_tests = makeString("# of lumpy tests");

    static private final SubLString $str_alt192$__of_tests_succeeding = makeString("% of tests succeeding");

    static private final SubLString $str_alt193$__of_tests_failing = makeString("% of tests failing");

    // // Initializers
    public void declareFunctions() {
        declare_qa_benchmarks_file();
    }

    public void initializeVariables() {
        init_qa_benchmarks_file();
    }

    public void runTopLevelForms() {
        setup_qa_benchmarks_file();
    }
}

