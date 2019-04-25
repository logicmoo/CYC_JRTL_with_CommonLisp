package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.file_hash_table;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_result_set_iterators extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators";
    public static final String myFingerPrint = "1be2b389d83b33c551169723c227da554aec2f891a2d36493d6f6c738b5c91bc";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 958L)
    public static SubLSymbol $sksi_caching_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 2040L)
    private static SubLSymbol $cached_sqlrs_all_rows_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 5277L)
    public static SubLSymbol $sks_result_iterator_auto_filter_nulls$;
    private static final SubLSymbol $sym0$SQLRS_DONE_;
    private static final SubLSymbol $sym1$SQLRS_ITERATOR_NEXT;
    private static final SubLSymbol $sym2$SQLRS_ITERATOR_FINALIZE;
    private static final SubLSymbol $sym3$CACHED_SQLRS_ALL_ROWS;
    private static final SubLSymbol $sym4$_CACHED_SQLRS_ALL_ROWS_CACHING_STATE_;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLString $str7$The_SQL_connection_;
    private static final SubLString $str8$_is_closed__hence__the_result_set;
    private static final SubLString $str9$_cannot_be_accessed_;
    private static final SubLSymbol $sym10$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str11$The_SQL_row_;
    private static final SubLString $str12$_;
    private static final SubLString $str13$_is_NULL_so_the_result_set_;
    private static final SubLString $str14$_of_connection_;
    private static final SubLString $str15$_errored_with_;
    private static final SubLString $str16$__hence__the_result_set_;
    private static final SubLSymbol $sym17$FILE_HASH_TABLE_P;
    private static final SubLSymbol $sym18$NREVERSE;
    private static final SubLSymbol $sym19$ITERATE_FILE_HASH_TABLE_DONE_;
    private static final SubLSymbol $sym20$SKSI_ITERATE_FILE_HASH_TABLE_NEXT_KEY;
    private static final SubLSymbol $sym21$SKSI_ITERATE_FILE_HASH_TABLE_NEXT_VALUE;
    private static final SubLSymbol $sym22$LISTP;
    private static final SubLSymbol $sym23$ITERATE_LIST_DONE;
    private static final SubLSymbol $sym24$SKSI_ITERATE_LIST_NEXT;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 1167L)
    public static SubLObject new_sqlrs_iterator(final SubLObject rs, SubLObject start_row, SubLObject end_row) {
        if (start_row == sksi_result_set_iterators.UNPROVIDED) {
            start_row = (SubLObject)sksi_result_set_iterators.ZERO_INTEGER;
        }
        if (end_row == sksi_result_set_iterators.UNPROVIDED) {
            end_row = (SubLObject)sksi_result_set_iterators.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_result_set_iterators.NIL != sksi_result_set_iterators.$sksi_caching_enabledP$.getDynamicValue(thread)) {
            return iteration.new_list_iterator(cached_sqlrs_all_rows(rs));
        }
        if (sksi_result_set_iterators.NIL != sdbc.sqlrs_emptyP(rs)) {
            finalize_result_set(rs);
            return iteration.new_null_iterator();
        }
        return iteration.new_iterator(make_iterator_sqlrs_state(rs, start_row, end_row), (SubLObject)sksi_result_set_iterators.$sym0$SQLRS_DONE_, (SubLObject)sksi_result_set_iterators.$sym1$SQLRS_ITERATOR_NEXT, (SubLObject)sksi_result_set_iterators.$sym2$SQLRS_ITERATOR_FINALIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 2040L)
    public static SubLObject clear_cached_sqlrs_all_rows() {
        final SubLObject cs = sksi_result_set_iterators.$cached_sqlrs_all_rows_caching_state$.getGlobalValue();
        if (sksi_result_set_iterators.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)sksi_result_set_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 2040L)
    public static SubLObject remove_cached_sqlrs_all_rows(final SubLObject rs) {
        return memoization_state.caching_state_remove_function_results_with_args(sksi_result_set_iterators.$cached_sqlrs_all_rows_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(rs), (SubLObject)sksi_result_set_iterators.UNPROVIDED, (SubLObject)sksi_result_set_iterators.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 2040L)
    public static SubLObject cached_sqlrs_all_rows_internal(final SubLObject rs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iterator = (SubLObject)sksi_result_set_iterators.NIL;
        final SubLObject _prev_bind_0 = sksi_result_set_iterators.$sksi_caching_enabledP$.currentBinding(thread);
        try {
            sksi_result_set_iterators.$sksi_caching_enabledP$.bind((SubLObject)sksi_result_set_iterators.NIL, thread);
            iterator = new_sqlrs_iterator(rs, (SubLObject)sksi_result_set_iterators.UNPROVIDED, (SubLObject)sksi_result_set_iterators.UNPROVIDED);
        }
        finally {
            sksi_result_set_iterators.$sksi_caching_enabledP$.rebind(_prev_bind_0, thread);
        }
        SubLObject rows = (SubLObject)sksi_result_set_iterators.NIL;
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)sksi_result_set_iterators.NIL; sksi_result_set_iterators.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_result_set_iterators.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject row = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sksi_result_set_iterators.NIL != valid) {
                rows = (SubLObject)ConsesLow.cons(row, rows);
            }
        }
        return Sequences.nreverse(rows);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 2040L)
    public static SubLObject cached_sqlrs_all_rows(final SubLObject rs) {
        SubLObject caching_state = sksi_result_set_iterators.$cached_sqlrs_all_rows_caching_state$.getGlobalValue();
        if (sksi_result_set_iterators.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)sksi_result_set_iterators.$sym3$CACHED_SQLRS_ALL_ROWS, (SubLObject)sksi_result_set_iterators.$sym4$_CACHED_SQLRS_ALL_ROWS_CACHING_STATE_, (SubLObject)sksi_result_set_iterators.TEN_INTEGER, (SubLObject)sksi_result_set_iterators.EQ, (SubLObject)sksi_result_set_iterators.ONE_INTEGER, (SubLObject)sksi_result_set_iterators.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, rs, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_sqlrs_all_rows_internal(rs)));
            memoization_state.caching_state_put(caching_state, rs, results, (SubLObject)sksi_result_set_iterators.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 2347L)
    public static SubLObject make_iterator_sqlrs_state(final SubLObject rs, final SubLObject start_row, final SubLObject end_row) {
        sdbc.sqlrs_absolute(rs, start_row);
        sdbc.sqlrs_next(rs);
        return (SubLObject)ConsesLow.list(rs, end_row);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 2528L)
    public static SubLObject sqlrs_doneP(final SubLObject state) {
        SubLObject rs = (SubLObject)sksi_result_set_iterators.NIL;
        SubLObject end_row = (SubLObject)sksi_result_set_iterators.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)sksi_result_set_iterators.$list5);
        rs = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_result_set_iterators.$list5);
        end_row = current.first();
        current = current.rest();
        if (sksi_result_set_iterators.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)sksi_result_set_iterators.$list5);
            return (SubLObject)sksi_result_set_iterators.NIL;
        }
        if (sksi_result_set_iterators.NIL == sdbc.sql_open_result_set_p(rs)) {
            return (SubLObject)sksi_result_set_iterators.T;
        }
        if (sdbc.sqlrs_get_row(rs).numG(sdbc.sqlrs_row_count(rs))) {
            finalize_result_set(rs);
            return (SubLObject)sksi_result_set_iterators.T;
        }
        if (sksi_result_set_iterators.NIL != end_row && sdbc.sqlrs_get_row(rs).numG(end_row)) {
            finalize_result_set(rs);
            return (SubLObject)sksi_result_set_iterators.T;
        }
        return (SubLObject)sksi_result_set_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 2886L)
    public static SubLObject finalize_result_set(final SubLObject rs) {
        final SubLObject sql_connection_statement_pair = sksi_sks_interaction.get_sql_connection_statement_for_result_set(rs);
        if (sksi_result_set_iterators.NIL != sql_connection_statement_pair) {
            SubLObject current;
            final SubLObject datum = current = sql_connection_statement_pair;
            SubLObject connection = (SubLObject)sksi_result_set_iterators.NIL;
            SubLObject statement = (SubLObject)sksi_result_set_iterators.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_result_set_iterators.$list6);
            connection = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_result_set_iterators.$list6);
            statement = current.first();
            current = current.rest();
            if (sksi_result_set_iterators.NIL == current) {
                try {
                    sksi_sks_interaction.uncache_sql_connection_statement_for_result_set(rs);
                }
                finally {
                    final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                    try {
                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_result_set_iterators.T);
                        final SubLObject _values = Values.getValuesAsVector();
                        sksi_sks_interaction.release_sql_connection_and_statement(connection, statement);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_result_set_iterators.$list6);
            }
        }
        return rs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 3297L)
    public static SubLObject sqlrs_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_result_set_iterators.NIL != sqlrs_doneP(state)) {
            return Values.values((SubLObject)sksi_result_set_iterators.NIL, state, (SubLObject)sksi_result_set_iterators.T);
        }
        final SubLObject rs = state.first();
        final SubLObject connection = sksi_sks_interaction.get_sql_connection_statement_for_result_set(rs).first();
        if (sksi_result_set_iterators.NIL == sdbc.sqlc_open_p(connection)) {
            return Values.values(sksi_debugging.sksi_error(Sequences.cconcatenate((SubLObject)sksi_result_set_iterators.$str7$The_SQL_connection_, new SubLObject[] { format_nil.format_nil_a_no_copy(connection), sksi_result_set_iterators.$str8$_is_closed__hence__the_result_set, format_nil.format_nil_a_no_copy(rs), sksi_result_set_iterators.$str9$_cannot_be_accessed_ })), state, (SubLObject)sksi_result_set_iterators.T);
        }
        SubLObject row = (SubLObject)sksi_result_set_iterators.NIL;
        SubLObject error_message = (SubLObject)sksi_result_set_iterators.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)sksi_result_set_iterators.$sym10$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    row = sqlrs_current_row_as_list(rs);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sksi_result_set_iterators.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        sdbc.sqlrs_next(rs);
        if (sksi_result_set_iterators.NIL == row) {
            return Values.values(sksi_debugging.sksi_error(Sequences.cconcatenate((SubLObject)sksi_result_set_iterators.$str11$The_SQL_row_, new SubLObject[] { format_nil.format_nil_a_no_copy(sdbc.sqlrs_get_row(rs)), sksi_result_set_iterators.$str12$_, format_nil.format_nil_a_no_copy(row), sksi_result_set_iterators.$str13$_is_NULL_so_the_result_set_, format_nil.format_nil_a_no_copy(rs), sksi_result_set_iterators.$str14$_of_connection_, format_nil.format_nil_a_no_copy(connection), sksi_result_set_iterators.$str9$_cannot_be_accessed_ })), state, (SubLObject)sksi_result_set_iterators.T);
        }
        if (sksi_result_set_iterators.NIL != error_message) {
            return Values.values(sksi_debugging.sksi_error(Sequences.cconcatenate((SubLObject)sksi_result_set_iterators.$str11$The_SQL_row_, new SubLObject[] { format_nil.format_nil_a_no_copy(sdbc.sqlrs_get_row(rs)), sksi_result_set_iterators.$str12$_, format_nil.format_nil_a_no_copy(row), sksi_result_set_iterators.$str15$_errored_with_, format_nil.format_nil_s_no_copy(error_message), sksi_result_set_iterators.$str16$__hence__the_result_set_, format_nil.format_nil_a_no_copy(rs), sksi_result_set_iterators.$str14$_of_connection_, format_nil.format_nil_a_no_copy(connection), sksi_result_set_iterators.$str9$_cannot_be_accessed_ })), state, (SubLObject)sksi_result_set_iterators.T);
        }
        return Values.values(row, state, (SubLObject)sksi_result_set_iterators.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 4401L)
    public static SubLObject sqlrs_iterator_finalize(final SubLObject state) {
        SubLObject rs = (SubLObject)sksi_result_set_iterators.NIL;
        SubLObject end_row = (SubLObject)sksi_result_set_iterators.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)sksi_result_set_iterators.$list5);
        rs = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_result_set_iterators.$list5);
        end_row = current.first();
        current = current.rest();
        if (sksi_result_set_iterators.NIL == current) {
            return finalize_result_set(rs);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)sksi_result_set_iterators.$list5);
        return (SubLObject)sksi_result_set_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 4550L)
    public static SubLObject sqlrs_current_row_as_list(final SubLObject rs) {
        final SubLObject column_count = sdbc.sqlrs_column_count(rs);
        SubLObject row = (SubLObject)sksi_result_set_iterators.NIL;
        SubLObject col_1;
        SubLObject col;
        SubLObject cell;
        for (col_1 = (SubLObject)sksi_result_set_iterators.NIL, col_1 = (SubLObject)sksi_result_set_iterators.ZERO_INTEGER; col_1.numL(column_count); col_1 = Numbers.add(col_1, (SubLObject)sksi_result_set_iterators.ONE_INTEGER)) {
            col = Numbers.add((SubLObject)sksi_result_set_iterators.ONE_INTEGER, col_1);
            cell = sdbc.sqlrs_get_object(rs, col);
            if (sksi_result_set_iterators.NIL == sdbc.sdbc_error_p(cell)) {
                row = (SubLObject)ConsesLow.cons(cell, row);
            }
        }
        return Sequences.nreverse(row);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 4909L)
    public static SubLObject new_fht_result_iterator(final SubLObject result) {
        return new_sk_source_result_iterator(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 5639L)
    public static SubLObject new_sk_source_result_iterator(final SubLObject result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_result_set_iterators.NIL == result && sksi_result_set_iterators.NIL != sksi_result_set_iterators.$sks_result_iterator_auto_filter_nulls$.getDynamicValue(thread)) {
            return (SubLObject)sksi_result_set_iterators.NIL;
        }
        if (sksi_result_set_iterators.NIL != iteration.iterator_p(result)) {
            return result;
        }
        if (result.isList()) {
            return iteration.new_list_iterator(result);
        }
        if (result.isAtom()) {
            return iteration.new_list_iterator((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(result)));
        }
        return (SubLObject)sksi_result_set_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 5961L)
    public static SubLObject new_sksi_file_hash_table_iterator(final SubLObject fht) {
        assert sksi_result_set_iterators.NIL != file_hash_table.file_hash_table_p(fht) : fht;
        return file_hash_table.new_file_hash_table_iterator(fht, (SubLObject)sksi_result_set_iterators.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 6312L)
    public static SubLObject new_sksi_reverse_file_hash_table_iterator(final SubLObject fht) {
        assert sksi_result_set_iterators.NIL != file_hash_table.file_hash_table_p(fht) : fht;
        final SubLObject fht_iterator = file_hash_table.new_file_hash_table_iterator(fht, (SubLObject)sksi_result_set_iterators.T);
        return iteration.new_indirect_iterator(fht_iterator, (SubLObject)sksi_result_set_iterators.$sym18$NREVERSE, (SubLObject)sksi_result_set_iterators.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 6537L)
    public static SubLObject new_sksi_file_hash_table_keys_iterator(final SubLObject fht) {
        assert sksi_result_set_iterators.NIL != file_hash_table.file_hash_table_p(fht) : fht;
        return iteration.new_iterator(file_hash_table.make_iterator_file_hash_table_state(fht, (SubLObject)sksi_result_set_iterators.T, (SubLObject)sksi_result_set_iterators.T), (SubLObject)sksi_result_set_iterators.$sym19$ITERATE_FILE_HASH_TABLE_DONE_, (SubLObject)sksi_result_set_iterators.$sym20$SKSI_ITERATE_FILE_HASH_TABLE_NEXT_KEY, (SubLObject)sksi_result_set_iterators.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 7003L)
    public static SubLObject sksi_iterate_file_hash_table_next_key(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject next = file_hash_table.iterate_file_hash_table_next(state);
        final SubLObject next_state = thread.secondMultipleValue();
        final SubLObject doneP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values((SubLObject)ConsesLow.list(next), next_state, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 7209L)
    public static SubLObject new_sksi_file_hash_table_values_iterator(final SubLObject fht) {
        assert sksi_result_set_iterators.NIL != file_hash_table.file_hash_table_p(fht) : fht;
        return iteration.new_iterator(file_hash_table.make_iterator_file_hash_table_state(fht, (SubLObject)sksi_result_set_iterators.NIL, (SubLObject)sksi_result_set_iterators.T), (SubLObject)sksi_result_set_iterators.$sym19$ITERATE_FILE_HASH_TABLE_DONE_, (SubLObject)sksi_result_set_iterators.$sym21$SKSI_ITERATE_FILE_HASH_TABLE_NEXT_VALUE, (SubLObject)sksi_result_set_iterators.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 7519L)
    public static SubLObject sksi_iterate_file_hash_table_next_value(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject next = file_hash_table.iterate_file_hash_table_next_value(state);
        final SubLObject next_state = thread.secondMultipleValue();
        final SubLObject doneP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values((SubLObject)ConsesLow.list(next), next_state, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 7733L)
    public static SubLObject new_sksi_list_iterator(final SubLObject list) {
        assert sksi_result_set_iterators.NIL != Types.listp(list) : list;
        return iteration.new_iterator(iteration.make_iterator_list_state(list), (SubLObject)sksi_result_set_iterators.$sym23$ITERATE_LIST_DONE, (SubLObject)sksi_result_set_iterators.$sym24$SKSI_ITERATE_LIST_NEXT, (SubLObject)sksi_result_set_iterators.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 7923L)
    public static SubLObject sksi_iterate_list_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject next = iteration.iterate_list_next(state);
        final SubLObject next_state = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values((SubLObject)ConsesLow.list(next), next_state);
    }
    
    public static SubLObject declare_sksi_result_set_iterators_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators", "new_sqlrs_iterator", "NEW-SQLRS-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators", "clear_cached_sqlrs_all_rows", "CLEAR-CACHED-SQLRS-ALL-ROWS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators", "remove_cached_sqlrs_all_rows", "REMOVE-CACHED-SQLRS-ALL-ROWS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators", "cached_sqlrs_all_rows_internal", "CACHED-SQLRS-ALL-ROWS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators", "cached_sqlrs_all_rows", "CACHED-SQLRS-ALL-ROWS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators", "make_iterator_sqlrs_state", "MAKE-ITERATOR-SQLRS-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators", "sqlrs_doneP", "SQLRS-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators", "finalize_result_set", "FINALIZE-RESULT-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators", "sqlrs_iterator_next", "SQLRS-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators", "sqlrs_iterator_finalize", "SQLRS-ITERATOR-FINALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators", "sqlrs_current_row_as_list", "SQLRS-CURRENT-ROW-AS-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators", "new_fht_result_iterator", "NEW-FHT-RESULT-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators", "new_sk_source_result_iterator", "NEW-SK-SOURCE-RESULT-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators", "new_sksi_file_hash_table_iterator", "NEW-SKSI-FILE-HASH-TABLE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators", "new_sksi_reverse_file_hash_table_iterator", "NEW-SKSI-REVERSE-FILE-HASH-TABLE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators", "new_sksi_file_hash_table_keys_iterator", "NEW-SKSI-FILE-HASH-TABLE-KEYS-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators", "sksi_iterate_file_hash_table_next_key", "SKSI-ITERATE-FILE-HASH-TABLE-NEXT-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators", "new_sksi_file_hash_table_values_iterator", "NEW-SKSI-FILE-HASH-TABLE-VALUES-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators", "sksi_iterate_file_hash_table_next_value", "SKSI-ITERATE-FILE-HASH-TABLE-NEXT-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators", "new_sksi_list_iterator", "NEW-SKSI-LIST-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators", "sksi_iterate_list_next", "SKSI-ITERATE-LIST-NEXT", 1, 0, false);
        return (SubLObject)sksi_result_set_iterators.NIL;
    }
    
    public static SubLObject init_sksi_result_set_iterators_file() {
        sksi_result_set_iterators.$sksi_caching_enabledP$ = SubLFiles.defvar("*SKSI-CACHING-ENABLED?*", (SubLObject)sksi_result_set_iterators.NIL);
        sksi_result_set_iterators.$cached_sqlrs_all_rows_caching_state$ = SubLFiles.deflexical("*CACHED-SQLRS-ALL-ROWS-CACHING-STATE*", (SubLObject)sksi_result_set_iterators.NIL);
        sksi_result_set_iterators.$sks_result_iterator_auto_filter_nulls$ = SubLFiles.defparameter("*SKS-RESULT-ITERATOR-AUTO-FILTER-NULLS*", (SubLObject)sksi_result_set_iterators.T);
        return (SubLObject)sksi_result_set_iterators.NIL;
    }
    
    public static SubLObject setup_sksi_result_set_iterators_file() {
        memoization_state.note_globally_cached_function((SubLObject)sksi_result_set_iterators.$sym3$CACHED_SQLRS_ALL_ROWS);
        return (SubLObject)sksi_result_set_iterators.NIL;
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
        me = (SubLFile)new sksi_result_set_iterators();
        sksi_result_set_iterators.$sksi_caching_enabledP$ = null;
        sksi_result_set_iterators.$cached_sqlrs_all_rows_caching_state$ = null;
        sksi_result_set_iterators.$sks_result_iterator_auto_filter_nulls$ = null;
        $sym0$SQLRS_DONE_ = SubLObjectFactory.makeSymbol("SQLRS-DONE?");
        $sym1$SQLRS_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("SQLRS-ITERATOR-NEXT");
        $sym2$SQLRS_ITERATOR_FINALIZE = SubLObjectFactory.makeSymbol("SQLRS-ITERATOR-FINALIZE");
        $sym3$CACHED_SQLRS_ALL_ROWS = SubLObjectFactory.makeSymbol("CACHED-SQLRS-ALL-ROWS");
        $sym4$_CACHED_SQLRS_ALL_ROWS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-SQLRS-ALL-ROWS-CACHING-STATE*");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RS"), (SubLObject)SubLObjectFactory.makeSymbol("END-ROW"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONNECTION"), (SubLObject)SubLObjectFactory.makeSymbol("STATEMENT"));
        $str7$The_SQL_connection_ = SubLObjectFactory.makeString("The SQL connection ");
        $str8$_is_closed__hence__the_result_set = SubLObjectFactory.makeString(" is closed, hence, the result set ");
        $str9$_cannot_be_accessed_ = SubLObjectFactory.makeString(" cannot be accessed.");
        $sym10$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str11$The_SQL_row_ = SubLObjectFactory.makeString("The SQL row ");
        $str12$_ = SubLObjectFactory.makeString(" ");
        $str13$_is_NULL_so_the_result_set_ = SubLObjectFactory.makeString(" is NULL so the result set ");
        $str14$_of_connection_ = SubLObjectFactory.makeString(" of connection ");
        $str15$_errored_with_ = SubLObjectFactory.makeString(" errored with ");
        $str16$__hence__the_result_set_ = SubLObjectFactory.makeString(", hence, the result set ");
        $sym17$FILE_HASH_TABLE_P = SubLObjectFactory.makeSymbol("FILE-HASH-TABLE-P");
        $sym18$NREVERSE = SubLObjectFactory.makeSymbol("NREVERSE");
        $sym19$ITERATE_FILE_HASH_TABLE_DONE_ = SubLObjectFactory.makeSymbol("ITERATE-FILE-HASH-TABLE-DONE?");
        $sym20$SKSI_ITERATE_FILE_HASH_TABLE_NEXT_KEY = SubLObjectFactory.makeSymbol("SKSI-ITERATE-FILE-HASH-TABLE-NEXT-KEY");
        $sym21$SKSI_ITERATE_FILE_HASH_TABLE_NEXT_VALUE = SubLObjectFactory.makeSymbol("SKSI-ITERATE-FILE-HASH-TABLE-NEXT-VALUE");
        $sym22$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym23$ITERATE_LIST_DONE = SubLObjectFactory.makeSymbol("ITERATE-LIST-DONE");
        $sym24$SKSI_ITERATE_LIST_NEXT = SubLObjectFactory.makeSymbol("SKSI-ITERATE-LIST-NEXT");
    }
}

/*

	Total time: 227 ms
	
*/