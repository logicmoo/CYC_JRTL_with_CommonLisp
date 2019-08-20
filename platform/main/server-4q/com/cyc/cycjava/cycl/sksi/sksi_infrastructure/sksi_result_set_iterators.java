/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;


import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.file_hash_table;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKSI-RESULT-SET-ITERATORS
 * source file: /cyc/top/cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp
 * created:     2019/07/03 17:37:54
 */
public final class sksi_result_set_iterators extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sksi_result_set_iterators();



    // defvar
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $sksi_caching_enabledP$ = makeSymbol("*SKSI-CACHING-ENABLED?*");

    // defparameter
    // When non-nil, null values are automatically filtered in a result-iterator
    /**
     * When non-nil, null values are automatically filtered in a result-iterator
     */
    @LispMethod(comment = "When non-nil, null values are automatically filtered in a result-iterator\ndefparameter")
    public static final SubLSymbol $sks_result_iterator_auto_filter_nulls$ = makeSymbol("*SKS-RESULT-ITERATOR-AUTO-FILTER-NULLS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLSymbol $sym0$SQLRS_DONE_ = makeSymbol("SQLRS-DONE?");

    private static final SubLSymbol SQLRS_ITERATOR_NEXT = makeSymbol("SQLRS-ITERATOR-NEXT");

    private static final SubLSymbol SQLRS_ITERATOR_FINALIZE = makeSymbol("SQLRS-ITERATOR-FINALIZE");

    private static final SubLSymbol CACHED_SQLRS_ALL_ROWS = makeSymbol("CACHED-SQLRS-ALL-ROWS");

    private static final SubLSymbol $cached_sqlrs_all_rows_caching_state$ = makeSymbol("*CACHED-SQLRS-ALL-ROWS-CACHING-STATE*");

    private static final SubLList $list5 = list(makeSymbol("RS"), makeSymbol("END-ROW"));

    private static final SubLList $list6 = list(makeSymbol("CONNECTION"), makeSymbol("STATEMENT"));

    private static final SubLString $$$The_SQL_connection_ = makeString("The SQL connection ");

    private static final SubLString $str8$_is_closed__hence__the_result_set = makeString(" is closed, hence, the result set ");

    private static final SubLString $str9$_cannot_be_accessed_ = makeString(" cannot be accessed.");

    private static final SubLString $$$The_SQL_row_ = makeString("The SQL row ");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $$$_is_NULL_so_the_result_set_ = makeString(" is NULL so the result set ");

    private static final SubLString $$$_of_connection_ = makeString(" of connection ");

    private static final SubLString $$$_errored_with_ = makeString(" errored with ");

    private static final SubLString $str16$__hence__the_result_set_ = makeString(", hence, the result set ");

    private static final SubLSymbol FILE_HASH_TABLE_P = makeSymbol("FILE-HASH-TABLE-P");

    private static final SubLSymbol $sym19$ITERATE_FILE_HASH_TABLE_DONE_ = makeSymbol("ITERATE-FILE-HASH-TABLE-DONE?");

    private static final SubLSymbol SKSI_ITERATE_FILE_HASH_TABLE_NEXT_KEY = makeSymbol("SKSI-ITERATE-FILE-HASH-TABLE-NEXT-KEY");

    private static final SubLSymbol SKSI_ITERATE_FILE_HASH_TABLE_NEXT_VALUE = makeSymbol("SKSI-ITERATE-FILE-HASH-TABLE-NEXT-VALUE");

    private static final SubLSymbol ITERATE_LIST_DONE = makeSymbol("ITERATE-LIST-DONE");

    private static final SubLSymbol SKSI_ITERATE_LIST_NEXT = makeSymbol("SKSI-ITERATE-LIST-NEXT");

    // Definitions
    /**
     *
     *
     * @return iterator-p; returns a SubL iterator wrapper around RS.
    Don't be expecting to use RS for anything else because the iterator
    will modify it (e.g. move the cursor around)
     */
    @LispMethod(comment = "@return iterator-p; returns a SubL iterator wrapper around RS.\r\nDon\'t be expecting to use RS for anything else because the iterator\r\nwill modify it (e.g. move the cursor around)")
    public static final SubLObject new_sqlrs_iterator_alt(SubLObject rs, SubLObject start_row, SubLObject end_row) {
        if (start_row == UNPROVIDED) {
            start_row = ZERO_INTEGER;
        }
        if (end_row == UNPROVIDED) {
            end_row = NIL;
        }
        if (NIL != sdbc.sqlrs_emptyP(rs)) {
            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators.finalize_result_set(rs);
            return iteration.new_null_iterator();
        } else {
            return iteration.new_iterator(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators.make_iterator_sqlrs_state(rs, start_row, end_row), $sym0$SQLRS_DONE_, SQLRS_ITERATOR_NEXT, SQLRS_ITERATOR_FINALIZE);
        }
    }

    // Definitions
    /**
     *
     *
     * @return iterator-p; returns a SubL iterator wrapper around RS.
    Don't be expecting to use RS for anything else because the iterator
    will modify it (e.g. move the cursor around)
     */
    @LispMethod(comment = "@return iterator-p; returns a SubL iterator wrapper around RS.\r\nDon\'t be expecting to use RS for anything else because the iterator\r\nwill modify it (e.g. move the cursor around)")
    public static SubLObject new_sqlrs_iterator(final SubLObject rs, SubLObject start_row, SubLObject end_row) {
        if (start_row == UNPROVIDED) {
            start_row = ZERO_INTEGER;
        }
        if (end_row == UNPROVIDED) {
            end_row = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $sksi_caching_enabledP$.getDynamicValue(thread)) {
            return iteration.new_list_iterator(cached_sqlrs_all_rows(rs));
        }
        if (NIL != sdbc.sqlrs_emptyP(rs)) {
            finalize_result_set(rs);
            return iteration.new_null_iterator();
        }
        return iteration.new_iterator(make_iterator_sqlrs_state(rs, start_row, end_row), $sym0$SQLRS_DONE_, SQLRS_ITERATOR_NEXT, SQLRS_ITERATOR_FINALIZE);
    }

    public static SubLObject clear_cached_sqlrs_all_rows() {
        final SubLObject cs = $cached_sqlrs_all_rows_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_sqlrs_all_rows(final SubLObject rs) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_sqlrs_all_rows_caching_state$.getGlobalValue(), list(rs), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_sqlrs_all_rows_internal(final SubLObject rs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iterator = NIL;
        final SubLObject _prev_bind_0 = $sksi_caching_enabledP$.currentBinding(thread);
        try {
            $sksi_caching_enabledP$.bind(NIL, thread);
            iterator = new_sqlrs_iterator(rs, UNPROVIDED, UNPROVIDED);
        } finally {
            $sksi_caching_enabledP$.rebind(_prev_bind_0, thread);
        }
        SubLObject rows = NIL;
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject row = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                rows = cons(row, rows);
            }
        }
        return nreverse(rows);
    }

    public static SubLObject cached_sqlrs_all_rows(final SubLObject rs) {
        SubLObject caching_state = $cached_sqlrs_all_rows_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_SQLRS_ALL_ROWS, $cached_sqlrs_all_rows_caching_state$, TEN_INTEGER, EQ, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, rs, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_sqlrs_all_rows_internal(rs)));
            memoization_state.caching_state_put(caching_state, rs, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject make_iterator_sqlrs_state_alt(SubLObject rs, SubLObject start_row, SubLObject end_row) {
        sdbc.sqlrs_absolute(rs, start_row);
        sdbc.sqlrs_next(rs);
        return list(rs, end_row);
    }

    public static SubLObject make_iterator_sqlrs_state(final SubLObject rs, final SubLObject start_row, final SubLObject end_row) {
        sdbc.sqlrs_absolute(rs, start_row);
        sdbc.sqlrs_next(rs);
        return list(rs, end_row);
    }

    public static final SubLObject sqlrs_doneP_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject rs = NIL;
            SubLObject end_row = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            rs = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt3);
            end_row = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == sdbc.sql_open_result_set_p(rs)) {
                    return T;
                } else {
                    if (sdbc.sqlrs_get_row(rs).numG(sdbc.sqlrs_row_count(rs))) {
                        com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators.finalize_result_set(rs);
                        return T;
                    } else {
                        if ((NIL != end_row) && sdbc.sqlrs_get_row(rs).numG(end_row)) {
                            com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators.finalize_result_set(rs);
                            return T;
                        } else {
                            return NIL;
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt3);
            }
        }
        return NIL;
    }

    public static SubLObject sqlrs_doneP(final SubLObject state) {
        SubLObject rs = NIL;
        SubLObject end_row = NIL;
        destructuring_bind_must_consp(state, state, $list5);
        rs = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list5);
        end_row = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(state, $list5);
            return NIL;
        }
        if (NIL == sdbc.sql_open_result_set_p(rs)) {
            return T;
        }
        if (sdbc.sqlrs_get_row(rs).numG(sdbc.sqlrs_row_count(rs))) {
            finalize_result_set(rs);
            return T;
        }
        if ((NIL != end_row) && sdbc.sqlrs_get_row(rs).numG(end_row)) {
            finalize_result_set(rs);
            return T;
        }
        return NIL;
    }

    public static final SubLObject finalize_result_set_alt(SubLObject rs) {
        {
            SubLObject sql_connection_statement_pair = sksi_sks_interaction.get_sql_connection_statement_for_result_set(rs);
            if (NIL != sql_connection_statement_pair) {
                {
                    SubLObject datum = sql_connection_statement_pair;
                    SubLObject current = datum;
                    SubLObject connection = NIL;
                    SubLObject statement = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt4);
                    connection = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt4);
                    statement = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        try {
                            sksi_sks_interaction.uncache_sql_connection_statement_for_result_set(rs);
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    sksi_sks_interaction.release_sql_connection_and_statement(connection, statement);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt4);
                    }
                }
            }
        }
        return rs;
    }

    public static SubLObject finalize_result_set(final SubLObject rs) {
        final SubLObject sql_connection_statement_pair = sksi_sks_interaction.get_sql_connection_statement_for_result_set(rs);
        if (NIL != sql_connection_statement_pair) {
            SubLObject current;
            final SubLObject datum = current = sql_connection_statement_pair;
            SubLObject connection = NIL;
            SubLObject statement = NIL;
            destructuring_bind_must_consp(current, datum, $list6);
            connection = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list6);
            statement = current.first();
            current = current.rest();
            if (NIL == current) {
                try {
                    sksi_sks_interaction.uncache_sql_connection_statement_for_result_set(rs);
                } finally {
                    final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        final SubLObject _values = getValuesAsVector();
                        sksi_sks_interaction.release_sql_connection_and_statement(connection, statement);
                        restoreValuesFromVector(_values);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list6);
            }
        }
        return rs;
    }

    /**
     *
     *
     * @return 0 next row in list form
     * @return 1 rs with updated cursor
     * @return 2 done?
     */
    @LispMethod(comment = "@return 0 next row in list form\r\n@return 1 rs with updated cursor\r\n@return 2 done?")
    public static final SubLObject sqlrs_iterator_next_alt(SubLObject state) {
        if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators.sqlrs_doneP(state)) {
            return values(NIL, state, T);
        }
        {
            SubLObject rs = state.first();
            SubLObject connection = sksi_sks_interaction.get_sql_connection_statement_for_result_set(rs).first();
            if (NIL == sdbc.sqlc_open_p(connection)) {
                return sksi_debugging.sksi_error(cconcatenate($str_alt5$The_SQL_connection_, new SubLObject[]{ format_nil.format_nil_a_no_copy(connection), $str_alt6$_is_closed__hence__the_result_set, format_nil.format_nil_a_no_copy(rs), $str_alt7$_cannot_be_accessed_ }));
            }
            {
                SubLObject row = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators.sqlrs_current_row_as_list(rs);
                sdbc.sqlrs_next(rs);
                return values(row, state, NIL);
            }
        }
    }

    /**
     *
     *
     * @return 0 next row in list form
     * @return 1 rs with updated cursor
     * @return 2 done?
     */
    @LispMethod(comment = "@return 0 next row in list form\r\n@return 1 rs with updated cursor\r\n@return 2 done?")
    public static SubLObject sqlrs_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sqlrs_doneP(state)) {
            return values(NIL, state, T);
        }
        final SubLObject rs = state.first();
        final SubLObject connection = sksi_sks_interaction.get_sql_connection_statement_for_result_set(rs).first();
        if (NIL == sdbc.sqlc_open_p(connection)) {
            return values(sksi_debugging.sksi_error(cconcatenate($$$The_SQL_connection_, new SubLObject[]{ format_nil.format_nil_a_no_copy(connection), $str8$_is_closed__hence__the_result_set, format_nil.format_nil_a_no_copy(rs), $str9$_cannot_be_accessed_ })), state, T);
        }
        SubLObject row = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    row = sqlrs_current_row_as_list(rs);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        sdbc.sqlrs_next(rs);
        if (NIL == row) {
            return values(sksi_debugging.sksi_error(cconcatenate($$$The_SQL_row_, new SubLObject[]{ format_nil.format_nil_a_no_copy(sdbc.sqlrs_get_row(rs)), $$$_, format_nil.format_nil_a_no_copy(row), $$$_is_NULL_so_the_result_set_, format_nil.format_nil_a_no_copy(rs), $$$_of_connection_, format_nil.format_nil_a_no_copy(connection), $str9$_cannot_be_accessed_ })), state, T);
        }
        if (NIL != error_message) {
            return values(sksi_debugging.sksi_error(cconcatenate($$$The_SQL_row_, new SubLObject[]{ format_nil.format_nil_a_no_copy(sdbc.sqlrs_get_row(rs)), $$$_, format_nil.format_nil_a_no_copy(row), $$$_errored_with_, format_nil.format_nil_s_no_copy(error_message), $str16$__hence__the_result_set_, format_nil.format_nil_a_no_copy(rs), $$$_of_connection_, format_nil.format_nil_a_no_copy(connection), $str9$_cannot_be_accessed_ })), state, T);
        }
        return values(row, state, NIL);
    }

    public static final SubLObject sqlrs_iterator_finalize_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject rs = NIL;
            SubLObject end_row = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            rs = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt3);
            end_row = current.first();
            current = current.rest();
            if (NIL == current) {
                return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators.finalize_result_set(rs);
            } else {
                cdestructuring_bind_error(datum, $list_alt3);
            }
        }
        return NIL;
    }

    public static SubLObject sqlrs_iterator_finalize(final SubLObject state) {
        SubLObject rs = NIL;
        SubLObject end_row = NIL;
        destructuring_bind_must_consp(state, state, $list5);
        rs = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list5);
        end_row = current.first();
        current = current.rest();
        if (NIL == current) {
            return finalize_result_set(rs);
        }
        cdestructuring_bind_error(state, $list5);
        return NIL;
    }

    /**
     *
     *
     * @return listp; the current row of RS represented as a list
     */
    @LispMethod(comment = "@return listp; the current row of RS represented as a list")
    public static final SubLObject sqlrs_current_row_as_list_alt(SubLObject rs) {
        {
            SubLObject column_count = sdbc.sqlrs_column_count(rs);
            SubLObject row = NIL;
            SubLObject col_1 = NIL;
            for (col_1 = ZERO_INTEGER; col_1.numL(column_count); col_1 = add(col_1, ONE_INTEGER)) {
                {
                    SubLObject col = add(ONE_INTEGER, col_1);
                    SubLObject cell = sdbc.sqlrs_get_object(rs, col);
                    if (NIL == sdbc.sdbc_error_p(cell)) {
                        row = cons(cell, row);
                    }
                }
            }
            return nreverse(row);
        }
    }

    /**
     *
     *
     * @return listp; the current row of RS represented as a list
     */
    @LispMethod(comment = "@return listp; the current row of RS represented as a list")
    public static SubLObject sqlrs_current_row_as_list(final SubLObject rs) {
        final SubLObject column_count = sdbc.sqlrs_column_count(rs);
        SubLObject row = NIL;
        SubLObject col_1;
        SubLObject col;
        SubLObject cell;
        for (col_1 = NIL, col_1 = ZERO_INTEGER; col_1.numL(column_count); col_1 = add(col_1, ONE_INTEGER)) {
            col = add(ONE_INTEGER, col_1);
            cell = sdbc.sqlrs_get_object(rs, col);
            if (NIL == sdbc.sdbc_error_p(cell)) {
                row = cons(cell, row);
            }
        }
        return nreverse(row);
    }

    /**
     *
     *
     * @return iterator-p; returns a SubL iterator wrapper around RESULT.
     */
    @LispMethod(comment = "@return iterator-p; returns a SubL iterator wrapper around RESULT.")
    public static final SubLObject new_fht_result_iterator_alt(SubLObject result) {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators.new_sk_source_result_iterator(result);
    }

    /**
     *
     *
     * @return iterator-p; returns a SubL iterator wrapper around RESULT.
     */
    @LispMethod(comment = "@return iterator-p; returns a SubL iterator wrapper around RESULT.")
    public static SubLObject new_fht_result_iterator(final SubLObject result) {
        return new_sk_source_result_iterator(result);
    }

    public static final SubLObject new_sk_source_result_iterator_alt(SubLObject result) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL == result) && (NIL != $sks_result_iterator_auto_filter_nulls$.getDynamicValue(thread))) {
                return NIL;
            } else {
                if (NIL != iteration.iterator_p(result)) {
                    return result;
                } else {
                    if (result.isList()) {
                        return iteration.new_list_iterator(result);
                    } else {
                        if (result.isAtom()) {
                            return iteration.new_list_iterator(list(list(result)));
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject new_sk_source_result_iterator(final SubLObject result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == result) && (NIL != $sks_result_iterator_auto_filter_nulls$.getDynamicValue(thread))) {
            return NIL;
        }
        if (NIL != iteration.iterator_p(result)) {
            return result;
        }
        if (result.isList()) {
            return iteration.new_list_iterator(result);
        }
        if (result.isAtom()) {
            return iteration.new_list_iterator(list(list(result)));
        }
        return NIL;
    }

    public static final SubLObject new_sksi_file_hash_table_iterator_alt(SubLObject fht) {
        SubLTrampolineFile.checkType(fht, FILE_HASH_TABLE_P);
        return file_hash_table.new_file_hash_table_iterator(fht, T);
    }

    public static SubLObject new_sksi_file_hash_table_iterator(final SubLObject fht) {
        assert NIL != file_hash_table.file_hash_table_p(fht) : "! file_hash_table.file_hash_table_p(fht) " + ("file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) ") + fht;
        return file_hash_table.new_file_hash_table_iterator(fht, T);
    }

    public static final SubLObject new_sksi_reverse_file_hash_table_iterator_alt(SubLObject fht) {
        SubLTrampolineFile.checkType(fht, FILE_HASH_TABLE_P);
        {
            SubLObject fht_iterator = file_hash_table.new_file_hash_table_iterator(fht, T);
            return iteration.new_indirect_iterator(fht_iterator, NREVERSE, UNPROVIDED);
        }
    }

    public static SubLObject new_sksi_reverse_file_hash_table_iterator(final SubLObject fht) {
        assert NIL != file_hash_table.file_hash_table_p(fht) : "! file_hash_table.file_hash_table_p(fht) " + ("file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) ") + fht;
        final SubLObject fht_iterator = file_hash_table.new_file_hash_table_iterator(fht, T);
        return iteration.new_indirect_iterator(fht_iterator, NREVERSE, UNPROVIDED);
    }

    static private final SubLList $list_alt3 = list(makeSymbol("RS"), makeSymbol("END-ROW"));

    static private final SubLList $list_alt4 = list(makeSymbol("CONNECTION"), makeSymbol("STATEMENT"));

    static private final SubLString $str_alt5$The_SQL_connection_ = makeString("The SQL connection ");

    static private final SubLString $str_alt6$_is_closed__hence__the_result_set = makeString(" is closed, hence, the result set ");

    static private final SubLString $str_alt7$_cannot_be_accessed_ = makeString(" cannot be accessed.");

    public static final SubLObject new_sksi_file_hash_table_keys_iterator_alt(SubLObject fht) {
        SubLTrampolineFile.checkType(fht, FILE_HASH_TABLE_P);
        return iteration.new_iterator(file_hash_table.make_iterator_file_hash_table_state(fht, T, T), $sym10$ITERATE_FILE_HASH_TABLE_DONE_, SKSI_ITERATE_FILE_HASH_TABLE_NEXT_KEY, UNPROVIDED);
    }

    public static SubLObject new_sksi_file_hash_table_keys_iterator(final SubLObject fht) {
        assert NIL != file_hash_table.file_hash_table_p(fht) : "! file_hash_table.file_hash_table_p(fht) " + ("file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) ") + fht;
        return iteration.new_iterator(file_hash_table.make_iterator_file_hash_table_state(fht, T, T), $sym19$ITERATE_FILE_HASH_TABLE_DONE_, SKSI_ITERATE_FILE_HASH_TABLE_NEXT_KEY, UNPROVIDED);
    }

    static private final SubLSymbol $sym10$ITERATE_FILE_HASH_TABLE_DONE_ = makeSymbol("ITERATE-FILE-HASH-TABLE-DONE?");

    public static final SubLObject sksi_iterate_file_hash_table_next_key_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject next = file_hash_table.iterate_file_hash_table_next(state);
                SubLObject next_state = thread.secondMultipleValue();
                SubLObject doneP = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return values(list(next), next_state, doneP);
            }
        }
    }

    public static SubLObject sksi_iterate_file_hash_table_next_key(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject next = file_hash_table.iterate_file_hash_table_next(state);
        final SubLObject next_state = thread.secondMultipleValue();
        final SubLObject doneP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return values(list(next), next_state, doneP);
    }

    public static final SubLObject new_sksi_file_hash_table_values_iterator_alt(SubLObject fht) {
        SubLTrampolineFile.checkType(fht, FILE_HASH_TABLE_P);
        return iteration.new_iterator(file_hash_table.make_iterator_file_hash_table_state(fht, NIL, T), $sym10$ITERATE_FILE_HASH_TABLE_DONE_, SKSI_ITERATE_FILE_HASH_TABLE_NEXT_VALUE, UNPROVIDED);
    }

    public static SubLObject new_sksi_file_hash_table_values_iterator(final SubLObject fht) {
        assert NIL != file_hash_table.file_hash_table_p(fht) : "! file_hash_table.file_hash_table_p(fht) " + ("file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) ") + fht;
        return iteration.new_iterator(file_hash_table.make_iterator_file_hash_table_state(fht, NIL, T), $sym19$ITERATE_FILE_HASH_TABLE_DONE_, SKSI_ITERATE_FILE_HASH_TABLE_NEXT_VALUE, UNPROVIDED);
    }

    public static final SubLObject sksi_iterate_file_hash_table_next_value_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject next = file_hash_table.iterate_file_hash_table_next_value(state);
                SubLObject next_state = thread.secondMultipleValue();
                SubLObject doneP = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return values(list(next), next_state, doneP);
            }
        }
    }

    public static SubLObject sksi_iterate_file_hash_table_next_value(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject next = file_hash_table.iterate_file_hash_table_next_value(state);
        final SubLObject next_state = thread.secondMultipleValue();
        final SubLObject doneP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return values(list(next), next_state, doneP);
    }

    public static final SubLObject new_sksi_list_iterator_alt(SubLObject list) {
        SubLTrampolineFile.checkType(list, LISTP);
        return iteration.new_iterator(iteration.make_iterator_list_state(list), ITERATE_LIST_DONE, SKSI_ITERATE_LIST_NEXT, UNPROVIDED);
    }

    public static SubLObject new_sksi_list_iterator(final SubLObject list) {
        assert NIL != listp(list) : "! listp(list) " + ("Types.listp(list) " + "CommonSymbols.NIL != Types.listp(list) ") + list;
        return iteration.new_iterator(iteration.make_iterator_list_state(list), ITERATE_LIST_DONE, SKSI_ITERATE_LIST_NEXT, UNPROVIDED);
    }

    public static final SubLObject sksi_iterate_list_next_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject next = iteration.iterate_list_next(state);
                SubLObject next_state = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(list(next), next_state);
            }
        }
    }

    public static SubLObject sksi_iterate_list_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject next = iteration.iterate_list_next(state);
        final SubLObject next_state = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(list(next), next_state);
    }

    public static SubLObject declare_sksi_result_set_iterators_file() {
        declareFunction("new_sqlrs_iterator", "NEW-SQLRS-ITERATOR", 1, 2, false);
        declareFunction("clear_cached_sqlrs_all_rows", "CLEAR-CACHED-SQLRS-ALL-ROWS", 0, 0, false);
        declareFunction("remove_cached_sqlrs_all_rows", "REMOVE-CACHED-SQLRS-ALL-ROWS", 1, 0, false);
        declareFunction("cached_sqlrs_all_rows_internal", "CACHED-SQLRS-ALL-ROWS-INTERNAL", 1, 0, false);
        declareFunction("cached_sqlrs_all_rows", "CACHED-SQLRS-ALL-ROWS", 1, 0, false);
        declareFunction("make_iterator_sqlrs_state", "MAKE-ITERATOR-SQLRS-STATE", 3, 0, false);
        declareFunction("sqlrs_doneP", "SQLRS-DONE?", 1, 0, false);
        declareFunction("finalize_result_set", "FINALIZE-RESULT-SET", 1, 0, false);
        declareFunction("sqlrs_iterator_next", "SQLRS-ITERATOR-NEXT", 1, 0, false);
        declareFunction("sqlrs_iterator_finalize", "SQLRS-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("sqlrs_current_row_as_list", "SQLRS-CURRENT-ROW-AS-LIST", 1, 0, false);
        declareFunction("new_fht_result_iterator", "NEW-FHT-RESULT-ITERATOR", 1, 0, false);
        declareFunction("new_sk_source_result_iterator", "NEW-SK-SOURCE-RESULT-ITERATOR", 1, 0, false);
        declareFunction("new_sksi_file_hash_table_iterator", "NEW-SKSI-FILE-HASH-TABLE-ITERATOR", 1, 0, false);
        declareFunction("new_sksi_reverse_file_hash_table_iterator", "NEW-SKSI-REVERSE-FILE-HASH-TABLE-ITERATOR", 1, 0, false);
        declareFunction("new_sksi_file_hash_table_keys_iterator", "NEW-SKSI-FILE-HASH-TABLE-KEYS-ITERATOR", 1, 0, false);
        declareFunction("sksi_iterate_file_hash_table_next_key", "SKSI-ITERATE-FILE-HASH-TABLE-NEXT-KEY", 1, 0, false);
        declareFunction("new_sksi_file_hash_table_values_iterator", "NEW-SKSI-FILE-HASH-TABLE-VALUES-ITERATOR", 1, 0, false);
        declareFunction("sksi_iterate_file_hash_table_next_value", "SKSI-ITERATE-FILE-HASH-TABLE-NEXT-VALUE", 1, 0, false);
        declareFunction("new_sksi_list_iterator", "NEW-SKSI-LIST-ITERATOR", 1, 0, false);
        declareFunction("sksi_iterate_list_next", "SKSI-ITERATE-LIST-NEXT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_result_set_iterators_file() {
        defvar("*SKSI-CACHING-ENABLED?*", NIL);
        deflexical("*CACHED-SQLRS-ALL-ROWS-CACHING-STATE*", NIL);
        defparameter("*SKS-RESULT-ITERATOR-AUTO-FILTER-NULLS*", T);
        return NIL;
    }

    public static SubLObject setup_sksi_result_set_iterators_file() {
        memoization_state.note_globally_cached_function(CACHED_SQLRS_ALL_ROWS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_result_set_iterators_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_result_set_iterators_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_result_set_iterators_file();
    }

    static {
    }
}

/**
 * Total time: 227 ms
 */
