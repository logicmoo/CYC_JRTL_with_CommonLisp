package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;


import com.cyc.cycjava.cycl.file_hash_table;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sksi_result_set_iterators extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_result_set_iterators();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators";

    public static final String myFingerPrint = "1be2b389d83b33c551169723c227da554aec2f891a2d36493d6f6c738b5c91bc";

    // defvar
    public static final SubLSymbol $sksi_caching_enabledP$ = makeSymbol("*SKSI-CACHING-ENABLED?*");



    // defparameter
    // When non-nil, null values are automatically filtered in a result-iterator
    public static final SubLSymbol $sks_result_iterator_auto_filter_nulls$ = makeSymbol("*SKS-RESULT-ITERATOR-AUTO-FILTER-NULLS*");

    // Internal Constants
    public static final SubLSymbol $sym0$SQLRS_DONE_ = makeSymbol("SQLRS-DONE?");

    public static final SubLSymbol SQLRS_ITERATOR_NEXT = makeSymbol("SQLRS-ITERATOR-NEXT");

    public static final SubLSymbol SQLRS_ITERATOR_FINALIZE = makeSymbol("SQLRS-ITERATOR-FINALIZE");

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

    public static SubLObject make_iterator_sqlrs_state(final SubLObject rs, final SubLObject start_row, final SubLObject end_row) {
        sdbc.sqlrs_absolute(rs, start_row);
        sdbc.sqlrs_next(rs);
        return list(rs, end_row);
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

    public static SubLObject new_fht_result_iterator(final SubLObject result) {
        return new_sk_source_result_iterator(result);
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

    public static SubLObject new_sksi_file_hash_table_iterator(final SubLObject fht) {
        assert NIL != file_hash_table.file_hash_table_p(fht) : "file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) " + fht;
        return file_hash_table.new_file_hash_table_iterator(fht, T);
    }

    public static SubLObject new_sksi_reverse_file_hash_table_iterator(final SubLObject fht) {
        assert NIL != file_hash_table.file_hash_table_p(fht) : "file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) " + fht;
        final SubLObject fht_iterator = file_hash_table.new_file_hash_table_iterator(fht, T);
        return iteration.new_indirect_iterator(fht_iterator, NREVERSE, UNPROVIDED);
    }

    public static SubLObject new_sksi_file_hash_table_keys_iterator(final SubLObject fht) {
        assert NIL != file_hash_table.file_hash_table_p(fht) : "file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) " + fht;
        return iteration.new_iterator(file_hash_table.make_iterator_file_hash_table_state(fht, T, T), $sym19$ITERATE_FILE_HASH_TABLE_DONE_, SKSI_ITERATE_FILE_HASH_TABLE_NEXT_KEY, UNPROVIDED);
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

    public static SubLObject new_sksi_file_hash_table_values_iterator(final SubLObject fht) {
        assert NIL != file_hash_table.file_hash_table_p(fht) : "file_hash_table.file_hash_table_p(fht) " + "CommonSymbols.NIL != file_hash_table.file_hash_table_p(fht) " + fht;
        return iteration.new_iterator(file_hash_table.make_iterator_file_hash_table_state(fht, NIL, T), $sym19$ITERATE_FILE_HASH_TABLE_DONE_, SKSI_ITERATE_FILE_HASH_TABLE_NEXT_VALUE, UNPROVIDED);
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

    public static SubLObject new_sksi_list_iterator(final SubLObject list) {
        assert NIL != listp(list) : "Types.listp(list) " + "CommonSymbols.NIL != Types.listp(list) " + list;
        return iteration.new_iterator(iteration.make_iterator_list_state(list), ITERATE_LIST_DONE, SKSI_ITERATE_LIST_NEXT, UNPROVIDED);
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
        declareFunction(me, "new_sqlrs_iterator", "NEW-SQLRS-ITERATOR", 1, 2, false);
        declareFunction(me, "clear_cached_sqlrs_all_rows", "CLEAR-CACHED-SQLRS-ALL-ROWS", 0, 0, false);
        declareFunction(me, "remove_cached_sqlrs_all_rows", "REMOVE-CACHED-SQLRS-ALL-ROWS", 1, 0, false);
        declareFunction(me, "cached_sqlrs_all_rows_internal", "CACHED-SQLRS-ALL-ROWS-INTERNAL", 1, 0, false);
        declareFunction(me, "cached_sqlrs_all_rows", "CACHED-SQLRS-ALL-ROWS", 1, 0, false);
        declareFunction(me, "make_iterator_sqlrs_state", "MAKE-ITERATOR-SQLRS-STATE", 3, 0, false);
        declareFunction(me, "sqlrs_doneP", "SQLRS-DONE?", 1, 0, false);
        declareFunction(me, "finalize_result_set", "FINALIZE-RESULT-SET", 1, 0, false);
        declareFunction(me, "sqlrs_iterator_next", "SQLRS-ITERATOR-NEXT", 1, 0, false);
        declareFunction(me, "sqlrs_iterator_finalize", "SQLRS-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction(me, "sqlrs_current_row_as_list", "SQLRS-CURRENT-ROW-AS-LIST", 1, 0, false);
        declareFunction(me, "new_fht_result_iterator", "NEW-FHT-RESULT-ITERATOR", 1, 0, false);
        declareFunction(me, "new_sk_source_result_iterator", "NEW-SK-SOURCE-RESULT-ITERATOR", 1, 0, false);
        declareFunction(me, "new_sksi_file_hash_table_iterator", "NEW-SKSI-FILE-HASH-TABLE-ITERATOR", 1, 0, false);
        declareFunction(me, "new_sksi_reverse_file_hash_table_iterator", "NEW-SKSI-REVERSE-FILE-HASH-TABLE-ITERATOR", 1, 0, false);
        declareFunction(me, "new_sksi_file_hash_table_keys_iterator", "NEW-SKSI-FILE-HASH-TABLE-KEYS-ITERATOR", 1, 0, false);
        declareFunction(me, "sksi_iterate_file_hash_table_next_key", "SKSI-ITERATE-FILE-HASH-TABLE-NEXT-KEY", 1, 0, false);
        declareFunction(me, "new_sksi_file_hash_table_values_iterator", "NEW-SKSI-FILE-HASH-TABLE-VALUES-ITERATOR", 1, 0, false);
        declareFunction(me, "sksi_iterate_file_hash_table_next_value", "SKSI-ITERATE-FILE-HASH-TABLE-NEXT-VALUE", 1, 0, false);
        declareFunction(me, "new_sksi_list_iterator", "NEW-SKSI-LIST-ITERATOR", 1, 0, false);
        declareFunction(me, "sksi_iterate_list_next", "SKSI-ITERATE-LIST-NEXT", 1, 0, false);
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
