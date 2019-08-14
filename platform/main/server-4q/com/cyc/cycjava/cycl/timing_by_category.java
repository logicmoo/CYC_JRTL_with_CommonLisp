/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.output_stream_p;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      TIMING-BY-CATEGORY
 * source file: /cyc/top/cycl/timing-by-category.lisp
 * created:     2019/07/03 17:37:17
 */
public final class timing_by_category extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new timing_by_category();

 public static final String myName = "com.cyc.cycjava.cycl.timing_by_category";


    // defparameter
    @LispMethod(comment = "defparameter")
    // Definitions
    public static final SubLSymbol $categorized_times$ = makeSymbol("*CATEGORIZED-TIMES*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("&OPTIONAL"), makeSymbol("STREAM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym1$TOTAL_TIME = makeUninternedSymbol("TOTAL-TIME");

    static private final SubLList $list3 = list(makeSymbol("*CATEGORIZED-TIMES*"), list(makeSymbol("NEW-DICTIONARY")));

    private static final SubLSymbol MAYBE_OUTPUT_CATEGORIZED_TIMES = makeSymbol("MAYBE-OUTPUT-CATEGORIZED-TIMES");

    static private final SubLList $list7 = list(list(makeSymbol("CATEGORY-KEYWORD")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym8$TIME = makeUninternedSymbol("TIME");

    public static final SubLSymbol $categorize_time_context$ = makeSymbol("*CATEGORIZE-TIME-CONTEXT*");

    static private final SubLList $list11 = list(makeSymbol("*CATEGORIZE-TIME-CONTEXT*"));

    static private final SubLList $list13 = list(makeSymbol("INITIALIZED-P"), list(makeSymbol("CATEGORIZED-TIMES")));

    private static final SubLSymbol NOTE_CATEGORIZED_TIME = makeSymbol("NOTE-CATEGORIZED-TIME");

    static private final SubLList $list15 = list(list(makeSymbol("CATEGORIZED-TIMES")), makeSymbol("*CATEGORIZE-TIME-CONTEXT*"));

    private static final SubLSymbol CATEGORIZED_TIMES = makeSymbol("CATEGORIZED-TIMES");

    private static final SubLSymbol WITH_CATEGORIZED_TIMES = makeSymbol("WITH-CATEGORIZED-TIMES");

    static private final SubLString $str19$Categorized_time___S__is_greater_ = makeString("Categorized time (~S) is greater than total time (~S)!");

    static private final SubLString $str20$__Timing_data__total_time__A____ = makeString("~&Timing data (total time ~A):~%");

    static private final SubLList $list21 = cons(makeSymbol("CATEGORY"), makeSymbol("DATA"));

    static private final SubLSymbol $sym22$CATEGORIZED_TIME_DATA__ = makeSymbol("CATEGORIZED-TIME-DATA->");

    static private final SubLList $list25 = cons(makeSymbol("SUBCATEGORY"), makeSymbol("SUBCAT-DATA"));

    static private final SubLString $str26$___A_S___A___D____ = makeString("~&~A~S: ~A (~D%)~%");

    private static final SubLSymbol CATEGORIZE_TIME = makeSymbol("CATEGORIZE-TIME");

    static private final SubLList $list28 = cons(makeSymbol("MY-CATEGORY"), makeSymbol("SUPERCATEGORIES-ASCENDING"));

    private static final SubLFloat $float$0_2 = makeDouble(0.2);

    private static final SubLSymbol $TOP_LEVEL_2 = makeKeyword("TOP-LEVEL-2");

    private static final SubLFloat $float$0_1 = makeDouble(0.1);

    /**
     * Set up a categorized timing context, and output the results to STREAM after executing BODY.
     */
    @LispMethod(comment = "Set up a categorized timing context, and output the results to STREAM after executing BODY.")
    public static final SubLObject with_categorized_times_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject stream = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt0);
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject total_time = $sym1$TOTAL_TIME;
                            return list(CLET, list($list_alt3, total_time), list(CTIME, total_time, bq_cons(PROGN, append(body, NIL))), list(MAYBE_OUTPUT_CATEGORIZED_TIMES, stream, total_time));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Set up a categorized timing context, and output the results to STREAM after executing BODY.
     */
    @LispMethod(comment = "Set up a categorized timing context, and output the results to STREAM after executing BODY.")
    public static SubLObject with_categorized_times(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        final SubLObject stream = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list0);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject total_time = $sym1$TOTAL_TIME;
            return list(CLET, list($list3, total_time), list(CTIME, total_time, bq_cons(PROGN, append(body, NIL))), list(MAYBE_OUTPUT_CATEGORIZED_TIMES, stream, total_time));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    /**
     * Time how long BODY takes and categorize that time under CATEGORY-KEYWORD.
     */
    @LispMethod(comment = "Time how long BODY takes and categorize that time under CATEGORY-KEYWORD.")
    public static final SubLObject categorize_time_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject category_keyword = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt7);
                    category_keyword = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject time = $sym8$TIME;
                            return list(CLET, list(list($categorize_time_context$, listS(CONS, category_keyword, $list_alt11)), time), list(CTIME, time, bq_cons(PROGN, append(body, NIL))), list(PWHEN, $list_alt13, listS(NOTE_CATEGORIZED_TIME, time, $list_alt15)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt7);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Time how long BODY takes and categorize that time under CATEGORY-KEYWORD.
     */
    @LispMethod(comment = "Time how long BODY takes and categorize that time under CATEGORY-KEYWORD.")
    public static SubLObject categorize_time(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject category_keyword = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        category_keyword = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject time = $sym8$TIME;
            return list(CLET, list(list($categorize_time_context$, listS(CONS, category_keyword, $list11)), time), list(CTIME, time, bq_cons(PROGN, append(body, NIL))), list(PWHEN, $list13, listS(NOTE_CATEGORIZED_TIME, time, $list15)));
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    public static final SubLObject categorized_times_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $categorized_times$.getDynamicValue(thread);
        }
    }

    public static SubLObject categorized_times() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $categorized_times$.getDynamicValue(thread);
    }

    public static final SubLObject maybe_output_categorized_times_alt(SubLObject stream, SubLObject total_time) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL == stream) || (stream.isStream() && (NIL != output_stream_p(stream)))) {
                {
                    SubLObject _prev_bind_0 = StreamsLow.$debug_io$.currentBinding(thread);
                    try {
                        StreamsLow.$debug_io$.bind(NIL != stream ? ((SubLObject) (stream)) : StreamsLow.$debug_io$.getDynamicValue(thread), thread);
                        {
                            SubLObject categorized_time = ZERO_INTEGER;
                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(com.cyc.cycjava.cycl.timing_by_category.categorized_times()));
                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject category = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    SubLObject data = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (!category.eql($UNCATEGORIZED)) {
                                        categorized_time = add(categorized_time, com.cyc.cycjava.cycl.timing_by_category.categorized_time_data_time(data));
                                    }
                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                }
                            } 
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            {
                                SubLObject uncategorized_time = subtract(total_time, categorized_time);
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == number_utilities.non_negative_number_p(uncategorized_time)) {
                                        Errors.error($str_alt19$Categorized_time___S__is_greater_, numeric_date_utilities.readable_elapsed_time_string(categorized_time, UNPROVIDED), numeric_date_utilities.readable_elapsed_time_string(total_time, UNPROVIDED));
                                    }
                                }
                                if (uncategorized_time.isPositive()) {
                                    dictionary.dictionary_enter(com.cyc.cycjava.cycl.timing_by_category.categorized_times(), $UNCATEGORIZED, uncategorized_time);
                                }
                            }
                            format(StreamsLow.$debug_io$.getDynamicValue(thread), $str_alt20$__Timing_data__total_time__A____, numeric_date_utilities.readable_elapsed_time_string(total_time, UNPROVIDED));
                            {
                                SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_values(com.cyc.cycjava.cycl.timing_by_category.categorized_times(), $sym22$CATEGORIZED_TIME_DATA__);
                                SubLObject cons = NIL;
                                for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                                    {
                                        SubLObject datum = cons;
                                        SubLObject current = datum;
                                        SubLObject category = NIL;
                                        SubLObject data = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt21);
                                        category = current.first();
                                        current = current.rest();
                                        data = current;
                                        com.cyc.cycjava.cycl.timing_by_category.output_categorized_time_data(category, data, total_time);
                                    }
                                }
                            }
                        }
                    } finally {
                        StreamsLow.$debug_io$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject maybe_output_categorized_times(final SubLObject stream, final SubLObject total_time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == stream) || (stream.isStream() && (NIL != output_stream_p(stream)))) {
            final SubLObject _prev_bind_0 = StreamsLow.$debug_io$.currentBinding(thread);
            try {
                StreamsLow.$debug_io$.bind(NIL != stream ? stream : StreamsLow.$debug_io$.getDynamicValue(thread), thread);
                SubLObject categorized_time = ZERO_INTEGER;
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(categorized_times())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject category = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject data = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (!category.eql($UNCATEGORIZED)) {
                        categorized_time = add(categorized_time, categorized_time_data_time(data));
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                final SubLObject uncategorized_time = subtract(total_time, categorized_time);
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == number_utilities.non_negative_number_p(uncategorized_time))) {
                    Errors.error($str19$Categorized_time___S__is_greater_, numeric_date_utilities.readable_elapsed_time_string(categorized_time, UNPROVIDED), numeric_date_utilities.readable_elapsed_time_string(total_time, UNPROVIDED));
                }
                if (uncategorized_time.isPositive()) {
                    dictionary.dictionary_enter(categorized_times(), $UNCATEGORIZED, uncategorized_time);
                }
                format(StreamsLow.$debug_io$.getDynamicValue(thread), $str20$__Timing_data__total_time__A____, numeric_date_utilities.readable_elapsed_time_string(total_time, UNPROVIDED));
                SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_values(categorized_times(), $sym22$CATEGORIZED_TIME_DATA__);
                SubLObject cons = NIL;
                cons = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = cons;
                    SubLObject category2 = NIL;
                    SubLObject data2 = NIL;
                    destructuring_bind_must_consp(current, datum, $list21);
                    category2 = current.first();
                    current = data2 = current.rest();
                    output_categorized_time_data(category2, data2, total_time);
                    cdolist_list_var = cdolist_list_var.rest();
                    cons = cdolist_list_var.first();
                } 
            } finally {
                StreamsLow.$debug_io$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject categorized_time_data_G_alt(SubLObject data1, SubLObject data2) {
        return numG(com.cyc.cycjava.cycl.timing_by_category.categorized_time_data_time(data1), com.cyc.cycjava.cycl.timing_by_category.categorized_time_data_time(data2));
    }

    public static SubLObject categorized_time_data_G(final SubLObject data1, final SubLObject data2) {
        return numG(categorized_time_data_time(data1), categorized_time_data_time(data2));
    }

    public static final SubLObject categorized_time_data_time_alt(SubLObject data) {
        if (data.isNumber()) {
            return data;
        } else {
            if (NIL != dictionary.dictionary_p(data)) {
                return dictionary.dictionary_lookup_without_values(data, $TOTAL_TIME, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject categorized_time_data_time(final SubLObject data) {
        if (data.isNumber()) {
            return data;
        }
        if (NIL != dictionary.dictionary_p(data)) {
            return dictionary.dictionary_lookup_without_values(data, $TOTAL_TIME, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject output_categorized_time_data_alt(SubLObject category, SubLObject data, SubLObject total_time) {
        com.cyc.cycjava.cycl.timing_by_category.output_categorized_time_data_recursive(category, data, total_time, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject output_categorized_time_data(final SubLObject category, final SubLObject data, final SubLObject total_time) {
        output_categorized_time_data_recursive(category, data, total_time, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject output_categorized_time_data_recursive_alt(SubLObject category, SubLObject data, SubLObject total_time, SubLObject nesting_level) {
        SubLTrampolineFile.checkType(total_time, NON_NEGATIVE_NUMBER_P);
        if (data.isNumber()) {
            com.cyc.cycjava.cycl.timing_by_category.output_categorized_time(category, data, total_time, nesting_level);
        } else {
            if (NIL != dictionary.dictionary_p(data)) {
                {
                    SubLObject total_category_time = dictionary.dictionary_lookup_without_values(data, $TOTAL_TIME, UNPROVIDED);
                    com.cyc.cycjava.cycl.timing_by_category.output_categorized_time(category, total_category_time, total_time, nesting_level);
                    {
                        SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_values(data, $sym22$CATEGORIZED_TIME_DATA__);
                        SubLObject cons = NIL;
                        for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                            {
                                SubLObject datum = cons;
                                SubLObject current = datum;
                                SubLObject subcategory = NIL;
                                SubLObject subcat_data = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt25);
                                subcategory = current.first();
                                current = current.rest();
                                subcat_data = current;
                                if (!subcategory.eql($TOTAL_TIME)) {
                                    com.cyc.cycjava.cycl.timing_by_category.output_categorized_time_data_recursive(subcategory, subcat_data, total_category_time, number_utilities.f_1X(nesting_level));
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject output_categorized_time_data_recursive(final SubLObject category, final SubLObject data, final SubLObject total_time, final SubLObject nesting_level) {
        assert NIL != number_utilities.non_negative_number_p(total_time) : "! number_utilities.non_negative_number_p(total_time) " + ("number_utilities.non_negative_number_p(total_time) " + "CommonSymbols.NIL != number_utilities.non_negative_number_p(total_time) ") + total_time;
        if (data.isNumber()) {
            output_categorized_time(category, data, total_time, nesting_level);
        } else
            if (NIL != dictionary.dictionary_p(data)) {
                final SubLObject total_category_time = dictionary.dictionary_lookup_without_values(data, $TOTAL_TIME, UNPROVIDED);
                output_categorized_time(category, total_category_time, total_time, nesting_level);
                SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_values(data, $sym22$CATEGORIZED_TIME_DATA__);
                SubLObject cons = NIL;
                cons = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = cons;
                    SubLObject subcategory = NIL;
                    SubLObject subcat_data = NIL;
                    destructuring_bind_must_consp(current, datum, $list25);
                    subcategory = current.first();
                    current = subcat_data = current.rest();
                    if (!subcategory.eql($TOTAL_TIME)) {
                        output_categorized_time_data_recursive(subcategory, subcat_data, total_category_time, number_utilities.f_1X(nesting_level));
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cons = cdolist_list_var.first();
                } 
            }

        return NIL;
    }

    public static final SubLObject output_categorized_time_alt(SubLObject category, SubLObject time, SubLObject total_time, SubLObject nesting_level) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(time, NON_NEGATIVE_NUMBER_P);
            format(StreamsLow.$debug_io$.getDynamicValue(thread), $str_alt26$___A_S___A___D____, new SubLObject[]{ Strings.make_string(nesting_level, CHAR_space), category, numeric_date_utilities.readable_elapsed_time_string(time, UNPROVIDED), number_utilities.integer_percent(time, total_time, T) });
            return NIL;
        }
    }

    public static SubLObject output_categorized_time(final SubLObject category, final SubLObject time, final SubLObject total_time, final SubLObject nesting_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != number_utilities.non_negative_number_p(time) : "! number_utilities.non_negative_number_p(time) " + ("number_utilities.non_negative_number_p(time) " + "CommonSymbols.NIL != number_utilities.non_negative_number_p(time) ") + time;
        format(StreamsLow.$debug_io$.getDynamicValue(thread), $str26$___A_S___A___D____, new SubLObject[]{ Strings.make_string(nesting_level, CHAR_space), category, numeric_date_utilities.readable_elapsed_time_string(time, UNPROVIDED), number_utilities.integer_percent(time, total_time, T) });
        return NIL;
    }

    public static final SubLObject note_categorized_time_alt(SubLObject time, SubLObject stats_table, SubLObject v_context) {
        if (NIL != misc_utilities.initialized_p(stats_table)) {
            {
                SubLObject datum = v_context;
                SubLObject current = datum;
                SubLObject my_category = NIL;
                SubLObject supercategories_ascending = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt28);
                my_category = current.first();
                current = current.rest();
                supercategories_ascending = current;
                {
                    SubLObject supercategory_stats = com.cyc.cycjava.cycl.timing_by_category.get_supercategory_timing_stats(stats_table, supercategories_ascending);
                    com.cyc.cycjava.cycl.timing_by_category.note_categorized_time_in_stats(supercategory_stats, my_category, time);
                }
            }
        }
        return NIL;
    }

    public static SubLObject note_categorized_time(final SubLObject time, final SubLObject stats_table, final SubLObject v_context) {
        if (NIL != misc_utilities.initialized_p(stats_table)) {
            SubLObject my_category = NIL;
            SubLObject supercategories_ascending = NIL;
            destructuring_bind_must_consp(v_context, v_context, $list28);
            my_category = v_context.first();
            final SubLObject current = supercategories_ascending = v_context.rest();
            final SubLObject supercategory_stats = get_supercategory_timing_stats(stats_table, supercategories_ascending);
            note_categorized_time_in_stats(supercategory_stats, my_category, time);
        }
        return NIL;
    }

    public static final SubLObject get_supercategory_timing_stats_alt(SubLObject stats_table, SubLObject supercategories_ascending) {
        {
            SubLObject supercategory_stats = stats_table;
            SubLObject supercategory_home = NIL;
            SubLObject cdolist_list_var = reverse(supercategories_ascending);
            SubLObject supercategory = NIL;
            for (supercategory = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supercategory = cdolist_list_var.first()) {
                supercategory_home = supercategory_stats;
                supercategory_stats = dictionary.dictionary_lookup_without_values(supercategory_home, supercategory, ZERO_INTEGER);
                if (supercategory_stats.isNumber()) {
                    {
                        SubLObject supercategory_time = supercategory_stats;
                        supercategory_stats = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
                        dictionary.dictionary_enter(supercategory_stats, $TOTAL_TIME, supercategory_time);
                        dictionary.dictionary_enter(supercategory_home, supercategory, supercategory_stats);
                    }
                }
            }
            return supercategory_stats;
        }
    }

    public static SubLObject get_supercategory_timing_stats(final SubLObject stats_table, final SubLObject supercategories_ascending) {
        SubLObject supercategory_stats = stats_table;
        SubLObject supercategory_home = NIL;
        SubLObject cdolist_list_var = reverse(supercategories_ascending);
        SubLObject supercategory = NIL;
        supercategory = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            supercategory_home = supercategory_stats;
            supercategory_stats = dictionary.dictionary_lookup_without_values(supercategory_home, supercategory, ZERO_INTEGER);
            if (supercategory_stats.isNumber()) {
                final SubLObject supercategory_time = supercategory_stats;
                supercategory_stats = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
                dictionary.dictionary_enter(supercategory_stats, $TOTAL_TIME, supercategory_time);
                dictionary.dictionary_enter(supercategory_home, supercategory, supercategory_stats);
            }
            cdolist_list_var = cdolist_list_var.rest();
            supercategory = cdolist_list_var.first();
        } 
        return supercategory_stats;
    }

    public static final SubLObject note_categorized_time_in_stats_alt(SubLObject supercategory_stats, SubLObject category_keyword, SubLObject time) {
        {
            SubLObject my_stats = dictionary.dictionary_lookup_without_values(supercategory_stats, category_keyword, ZERO_INTEGER);
            if (my_stats.isNumber()) {
                dictionary_utilities.dictionary_increment(supercategory_stats, category_keyword, time);
            } else {
                dictionary_utilities.dictionary_increment(my_stats, $TOTAL_TIME, time);
            }
            return my_stats;
        }
    }

    public static SubLObject note_categorized_time_in_stats(final SubLObject supercategory_stats, final SubLObject category_keyword, final SubLObject time) {
        final SubLObject my_stats = dictionary.dictionary_lookup_without_values(supercategory_stats, category_keyword, ZERO_INTEGER);
        if (my_stats.isNumber()) {
            dictionary_utilities.dictionary_increment(supercategory_stats, category_keyword, time);
        } else {
            dictionary_utilities.dictionary_increment(my_stats, $TOTAL_TIME, time);
        }
        return my_stats;
    }

    public static final SubLObject test_categorized_timing_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $categorized_times$.currentBinding(thread);
                try {
                    $categorized_times$.bind(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
                    {
                        SubLObject total_time = NIL;
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject _prev_bind_0_1 = $categorize_time_context$.currentBinding(thread);
                            try {
                                $categorize_time_context$.bind(cons($TOP_LEVEL, $categorize_time_context$.getDynamicValue(thread)), thread);
                                {
                                    SubLObject time = NIL;
                                    SubLObject time_var_2 = get_internal_real_time();
                                    sleep($float$0_2);
                                    {
                                        SubLObject _prev_bind_0_3 = $categorize_time_context$.currentBinding(thread);
                                        try {
                                            $categorize_time_context$.bind(cons($SECOND_LEVEL, $categorize_time_context$.getDynamicValue(thread)), thread);
                                            {
                                                SubLObject time_4 = NIL;
                                                SubLObject time_var_5 = get_internal_real_time();
                                                {
                                                    SubLObject _prev_bind_0_6 = $categorize_time_context$.currentBinding(thread);
                                                    try {
                                                        $categorize_time_context$.bind(cons($THIRD_LEVEL, $categorize_time_context$.getDynamicValue(thread)), thread);
                                                        {
                                                            SubLObject time_7 = NIL;
                                                            SubLObject time_var_8 = get_internal_real_time();
                                                            sleep($float$0_2);
                                                            time_7 = divide(subtract(get_internal_real_time(), time_var_8), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                            if (NIL != misc_utilities.initialized_p(com.cyc.cycjava.cycl.timing_by_category.categorized_times())) {
                                                                com.cyc.cycjava.cycl.timing_by_category.note_categorized_time(time_7, com.cyc.cycjava.cycl.timing_by_category.categorized_times(), $categorize_time_context$.getDynamicValue(thread));
                                                            }
                                                        }
                                                    } finally {
                                                        $categorize_time_context$.rebind(_prev_bind_0_6, thread);
                                                    }
                                                }
                                                time_4 = divide(subtract(get_internal_real_time(), time_var_5), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                if (NIL != misc_utilities.initialized_p(com.cyc.cycjava.cycl.timing_by_category.categorized_times())) {
                                                    com.cyc.cycjava.cycl.timing_by_category.note_categorized_time(time_4, com.cyc.cycjava.cycl.timing_by_category.categorized_times(), $categorize_time_context$.getDynamicValue(thread));
                                                }
                                            }
                                        } finally {
                                            $categorize_time_context$.rebind(_prev_bind_0_3, thread);
                                        }
                                    }
                                    time = divide(subtract(get_internal_real_time(), time_var_2), time_high.$internal_time_units_per_second$.getGlobalValue());
                                    if (NIL != misc_utilities.initialized_p(com.cyc.cycjava.cycl.timing_by_category.categorized_times())) {
                                        com.cyc.cycjava.cycl.timing_by_category.note_categorized_time(time, com.cyc.cycjava.cycl.timing_by_category.categorized_times(), $categorize_time_context$.getDynamicValue(thread));
                                    }
                                }
                            } finally {
                                $categorize_time_context$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                        {
                            SubLObject _prev_bind_0_9 = $categorize_time_context$.currentBinding(thread);
                            try {
                                $categorize_time_context$.bind(cons($TOP_LEVEL_2, $categorize_time_context$.getDynamicValue(thread)), thread);
                                {
                                    SubLObject time = NIL;
                                    SubLObject time_var_10 = get_internal_real_time();
                                    sleep($float$0_1);
                                    time = divide(subtract(get_internal_real_time(), time_var_10), time_high.$internal_time_units_per_second$.getGlobalValue());
                                    if (NIL != misc_utilities.initialized_p(com.cyc.cycjava.cycl.timing_by_category.categorized_times())) {
                                        com.cyc.cycjava.cycl.timing_by_category.note_categorized_time(time, com.cyc.cycjava.cycl.timing_by_category.categorized_times(), $categorize_time_context$.getDynamicValue(thread));
                                    }
                                }
                            } finally {
                                $categorize_time_context$.rebind(_prev_bind_0_9, thread);
                            }
                        }
                        {
                            SubLObject _prev_bind_0_11 = $categorize_time_context$.currentBinding(thread);
                            try {
                                $categorize_time_context$.bind(cons($TOP_LEVEL_2, $categorize_time_context$.getDynamicValue(thread)), thread);
                                {
                                    SubLObject time = NIL;
                                    SubLObject time_var_12 = get_internal_real_time();
                                    sleep($float$0_1);
                                    time = divide(subtract(get_internal_real_time(), time_var_12), time_high.$internal_time_units_per_second$.getGlobalValue());
                                    if (NIL != misc_utilities.initialized_p(com.cyc.cycjava.cycl.timing_by_category.categorized_times())) {
                                        com.cyc.cycjava.cycl.timing_by_category.note_categorized_time(time, com.cyc.cycjava.cycl.timing_by_category.categorized_times(), $categorize_time_context$.getDynamicValue(thread));
                                    }
                                }
                            } finally {
                                $categorize_time_context$.rebind(_prev_bind_0_11, thread);
                            }
                        }
                        sleep($float$0_2);
                        total_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                        com.cyc.cycjava.cycl.timing_by_category.maybe_output_categorized_times(NIL, total_time);
                    }
                } finally {
                    $categorized_times$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject test_categorized_timing() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $categorized_times$.currentBinding(thread);
        try {
            $categorized_times$.bind(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
            SubLObject total_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            final SubLObject _prev_bind_0_$1 = $categorize_time_context$.currentBinding(thread);
            try {
                $categorize_time_context$.bind(cons($TOP_LEVEL, $categorize_time_context$.getDynamicValue(thread)), thread);
                SubLObject time = NIL;
                final SubLObject time_var_$2 = get_internal_real_time();
                sleep($float$0_2);
                final SubLObject _prev_bind_0_$2 = $categorize_time_context$.currentBinding(thread);
                try {
                    $categorize_time_context$.bind(cons($SECOND_LEVEL, $categorize_time_context$.getDynamicValue(thread)), thread);
                    SubLObject time_$4 = NIL;
                    final SubLObject time_var_$3 = get_internal_real_time();
                    final SubLObject _prev_bind_0_$3 = $categorize_time_context$.currentBinding(thread);
                    try {
                        $categorize_time_context$.bind(cons($THIRD_LEVEL, $categorize_time_context$.getDynamicValue(thread)), thread);
                        SubLObject time_$5 = NIL;
                        final SubLObject time_var_$4 = get_internal_real_time();
                        sleep($float$0_2);
                        time_$5 = divide(subtract(get_internal_real_time(), time_var_$4), time_high.$internal_time_units_per_second$.getGlobalValue());
                        if (NIL != misc_utilities.initialized_p(categorized_times())) {
                            note_categorized_time(time_$5, categorized_times(), $categorize_time_context$.getDynamicValue(thread));
                        }
                    } finally {
                        $categorize_time_context$.rebind(_prev_bind_0_$3, thread);
                    }
                    time_$4 = divide(subtract(get_internal_real_time(), time_var_$3), time_high.$internal_time_units_per_second$.getGlobalValue());
                    if (NIL != misc_utilities.initialized_p(categorized_times())) {
                        note_categorized_time(time_$4, categorized_times(), $categorize_time_context$.getDynamicValue(thread));
                    }
                } finally {
                    $categorize_time_context$.rebind(_prev_bind_0_$2, thread);
                }
                time = divide(subtract(get_internal_real_time(), time_var_$2), time_high.$internal_time_units_per_second$.getGlobalValue());
                if (NIL != misc_utilities.initialized_p(categorized_times())) {
                    note_categorized_time(time, categorized_times(), $categorize_time_context$.getDynamicValue(thread));
                }
            } finally {
                $categorize_time_context$.rebind(_prev_bind_0_$1, thread);
            }
            final SubLObject _prev_bind_0_$4 = $categorize_time_context$.currentBinding(thread);
            try {
                $categorize_time_context$.bind(cons($TOP_LEVEL_2, $categorize_time_context$.getDynamicValue(thread)), thread);
                SubLObject time = NIL;
                final SubLObject time_var_$5 = get_internal_real_time();
                sleep($float$0_1);
                time = divide(subtract(get_internal_real_time(), time_var_$5), time_high.$internal_time_units_per_second$.getGlobalValue());
                if (NIL != misc_utilities.initialized_p(categorized_times())) {
                    note_categorized_time(time, categorized_times(), $categorize_time_context$.getDynamicValue(thread));
                }
            } finally {
                $categorize_time_context$.rebind(_prev_bind_0_$4, thread);
            }
            final SubLObject _prev_bind_0_$5 = $categorize_time_context$.currentBinding(thread);
            try {
                $categorize_time_context$.bind(cons($TOP_LEVEL_2, $categorize_time_context$.getDynamicValue(thread)), thread);
                SubLObject time = NIL;
                final SubLObject time_var_$6 = get_internal_real_time();
                sleep($float$0_1);
                time = divide(subtract(get_internal_real_time(), time_var_$6), time_high.$internal_time_units_per_second$.getGlobalValue());
                if (NIL != misc_utilities.initialized_p(categorized_times())) {
                    note_categorized_time(time, categorized_times(), $categorize_time_context$.getDynamicValue(thread));
                }
            } finally {
                $categorize_time_context$.rebind(_prev_bind_0_$5, thread);
            }
            sleep($float$0_2);
            total_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            maybe_output_categorized_times(NIL, total_time);
        } finally {
            $categorized_times$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject declare_timing_by_category_file() {
        declareMacro("with_categorized_times", "WITH-CATEGORIZED-TIMES");
        declareMacro("categorize_time", "CATEGORIZE-TIME");
        declareFunction("categorized_times", "CATEGORIZED-TIMES", 0, 0, false);
        declareFunction("maybe_output_categorized_times", "MAYBE-OUTPUT-CATEGORIZED-TIMES", 2, 0, false);
        declareFunction("categorized_time_data_G", "CATEGORIZED-TIME-DATA->", 2, 0, false);
        declareFunction("categorized_time_data_time", "CATEGORIZED-TIME-DATA-TIME", 1, 0, false);
        declareFunction("output_categorized_time_data", "OUTPUT-CATEGORIZED-TIME-DATA", 3, 0, false);
        declareFunction("output_categorized_time_data_recursive", "OUTPUT-CATEGORIZED-TIME-DATA-RECURSIVE", 4, 0, false);
        declareFunction("output_categorized_time", "OUTPUT-CATEGORIZED-TIME", 4, 0, false);
        declareFunction("note_categorized_time", "NOTE-CATEGORIZED-TIME", 3, 0, false);
        declareFunction("get_supercategory_timing_stats", "GET-SUPERCATEGORY-TIMING-STATS", 2, 0, false);
        declareFunction("note_categorized_time_in_stats", "NOTE-CATEGORIZED-TIME-IN-STATS", 3, 0, false);
        declareFunction("test_categorized_timing", "TEST-CATEGORIZED-TIMING", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_timing_by_category_file() {
        defparameter("*CATEGORIZED-TIMES*", misc_utilities.uninitialized());
        defparameter("*CATEGORIZE-TIME-CONTEXT*", NIL);
        return NIL;
    }

    public static SubLObject setup_timing_by_category_file() {
        register_macro_helper(CATEGORIZED_TIMES, WITH_CATEGORIZED_TIMES);
        register_macro_helper(MAYBE_OUTPUT_CATEGORIZED_TIMES, WITH_CATEGORIZED_TIMES);
        register_macro_helper(NOTE_CATEGORIZED_TIME, CATEGORIZE_TIME);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_timing_by_category_file();
    }

    @Override
    public void initializeVariables() {
        init_timing_by_category_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_timing_by_category_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("&OPTIONAL"), makeSymbol("STREAM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt3 = list(makeSymbol("*CATEGORIZED-TIMES*"), list(makeSymbol("NEW-DICTIONARY")));

    static private final SubLList $list_alt7 = list(list(makeSymbol("CATEGORY-KEYWORD")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt11 = list(makeSymbol("*CATEGORIZE-TIME-CONTEXT*"));

    static private final SubLList $list_alt13 = list(makeSymbol("INITIALIZED-P"), list(makeSymbol("CATEGORIZED-TIMES")));

    static private final SubLList $list_alt15 = list(list(makeSymbol("CATEGORIZED-TIMES")), makeSymbol("*CATEGORIZE-TIME-CONTEXT*"));

    static private final SubLString $str_alt19$Categorized_time___S__is_greater_ = makeString("Categorized time (~S) is greater than total time (~S)!");

    static private final SubLString $str_alt20$__Timing_data__total_time__A____ = makeString("~&Timing data (total time ~A):~%");

    static private final SubLList $list_alt21 = cons(makeSymbol("CATEGORY"), makeSymbol("DATA"));

    static private final SubLList $list_alt25 = cons(makeSymbol("SUBCATEGORY"), makeSymbol("SUBCAT-DATA"));

    static private final SubLString $str_alt26$___A_S___A___D____ = makeString("~&~A~S: ~A (~D%)~%");

    static private final SubLList $list_alt28 = cons(makeSymbol("MY-CATEGORY"), makeSymbol("SUPERCATEGORIES-ASCENDING"));
}

/**
 * Total time: 170 ms
 */
