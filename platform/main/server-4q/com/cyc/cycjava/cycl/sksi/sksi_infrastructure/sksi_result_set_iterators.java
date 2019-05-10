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

public final class sksi_result_set_iterators
    extends
      SubLTranslatedFile
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
  public static SubLObject new_sqlrs_iterator(final SubLObject rs, SubLObject start_row, SubLObject end_row)
  {
    if( start_row == UNPROVIDED )
    {
      start_row = ZERO_INTEGER;
    }
    if( end_row == UNPROVIDED )
    {
      end_row = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $sksi_caching_enabledP$.getDynamicValue( thread ) )
    {
      return iteration.new_list_iterator( cached_sqlrs_all_rows( rs ) );
    }
    if( NIL != sdbc.sqlrs_emptyP( rs ) )
    {
      finalize_result_set( rs );
      return iteration.new_null_iterator();
    }
    return iteration.new_iterator( make_iterator_sqlrs_state( rs, start_row, end_row ), $sym0$SQLRS_DONE_, $sym1$SQLRS_ITERATOR_NEXT, $sym2$SQLRS_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 2040L)
  public static SubLObject clear_cached_sqlrs_all_rows()
  {
    final SubLObject cs = $cached_sqlrs_all_rows_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 2040L)
  public static SubLObject remove_cached_sqlrs_all_rows(final SubLObject rs)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_sqlrs_all_rows_caching_state$.getGlobalValue(), ConsesLow.list( rs ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 2040L)
  public static SubLObject cached_sqlrs_all_rows_internal(final SubLObject rs)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject iterator = NIL;
    final SubLObject _prev_bind_0 = $sksi_caching_enabledP$.currentBinding( thread );
    try
    {
      $sksi_caching_enabledP$.bind( NIL, thread );
      iterator = new_sqlrs_iterator( rs, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      $sksi_caching_enabledP$.rebind( _prev_bind_0, thread );
    }
    SubLObject rows = NIL;
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject row = iteration.iteration_next( iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        rows = ConsesLow.cons( row, rows );
      }
    }
    return Sequences.nreverse( rows );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 2040L)
  public static SubLObject cached_sqlrs_all_rows(final SubLObject rs)
  {
    SubLObject caching_state = $cached_sqlrs_all_rows_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym3$CACHED_SQLRS_ALL_ROWS, $sym4$_CACHED_SQLRS_ALL_ROWS_CACHING_STATE_, TEN_INTEGER, EQ, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, rs, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_sqlrs_all_rows_internal( rs ) ) );
      memoization_state.caching_state_put( caching_state, rs, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 2347L)
  public static SubLObject make_iterator_sqlrs_state(final SubLObject rs, final SubLObject start_row, final SubLObject end_row)
  {
    sdbc.sqlrs_absolute( rs, start_row );
    sdbc.sqlrs_next( rs );
    return ConsesLow.list( rs, end_row );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 2528L)
  public static SubLObject sqlrs_doneP(final SubLObject state)
  {
    SubLObject rs = NIL;
    SubLObject end_row = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list5 );
    rs = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list5 );
    end_row = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list5 );
      return NIL;
    }
    if( NIL == sdbc.sql_open_result_set_p( rs ) )
    {
      return T;
    }
    if( sdbc.sqlrs_get_row( rs ).numG( sdbc.sqlrs_row_count( rs ) ) )
    {
      finalize_result_set( rs );
      return T;
    }
    if( NIL != end_row && sdbc.sqlrs_get_row( rs ).numG( end_row ) )
    {
      finalize_result_set( rs );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 2886L)
  public static SubLObject finalize_result_set(final SubLObject rs)
  {
    final SubLObject sql_connection_statement_pair = sksi_sks_interaction.get_sql_connection_statement_for_result_set( rs );
    if( NIL != sql_connection_statement_pair )
    {
      SubLObject current;
      final SubLObject datum = current = sql_connection_statement_pair;
      SubLObject connection = NIL;
      SubLObject statement = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
      connection = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
      statement = current.first();
      current = current.rest();
      if( NIL == current )
      {
        try
        {
          sksi_sks_interaction.uncache_sql_connection_statement_for_result_set( rs );
        }
        finally
        {
          final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
          try
          {
            Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
            final SubLObject _values = Values.getValuesAsVector();
            sksi_sks_interaction.release_sql_connection_and_statement( connection, statement );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list6 );
      }
    }
    return rs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 3297L)
  public static SubLObject sqlrs_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != sqlrs_doneP( state ) )
    {
      return Values.values( NIL, state, T );
    }
    final SubLObject rs = state.first();
    final SubLObject connection = sksi_sks_interaction.get_sql_connection_statement_for_result_set( rs ).first();
    if( NIL == sdbc.sqlc_open_p( connection ) )
    {
      return Values.values( sksi_debugging.sksi_error( Sequences.cconcatenate( $str7$The_SQL_connection_, new SubLObject[] { format_nil.format_nil_a_no_copy( connection ), $str8$_is_closed__hence__the_result_set,
        format_nil.format_nil_a_no_copy( rs ), $str9$_cannot_be_accessed_
      } ) ), state, T );
    }
    SubLObject row = NIL;
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym10$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          row = sqlrs_current_row_as_list( rs );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    sdbc.sqlrs_next( rs );
    if( NIL == row )
    {
      return Values.values( sksi_debugging.sksi_error( Sequences.cconcatenate( $str11$The_SQL_row_, new SubLObject[] { format_nil.format_nil_a_no_copy( sdbc.sqlrs_get_row( rs ) ), $str12$_, format_nil
          .format_nil_a_no_copy( row ), $str13$_is_NULL_so_the_result_set_, format_nil.format_nil_a_no_copy( rs ), $str14$_of_connection_, format_nil.format_nil_a_no_copy( connection ), $str9$_cannot_be_accessed_
      } ) ), state, T );
    }
    if( NIL != error_message )
    {
      return Values.values( sksi_debugging.sksi_error( Sequences.cconcatenate( $str11$The_SQL_row_, new SubLObject[] { format_nil.format_nil_a_no_copy( sdbc.sqlrs_get_row( rs ) ), $str12$_, format_nil
          .format_nil_a_no_copy( row ), $str15$_errored_with_, format_nil.format_nil_s_no_copy( error_message ), $str16$__hence__the_result_set_, format_nil.format_nil_a_no_copy( rs ), $str14$_of_connection_, format_nil
              .format_nil_a_no_copy( connection ), $str9$_cannot_be_accessed_
      } ) ), state, T );
    }
    return Values.values( row, state, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 4401L)
  public static SubLObject sqlrs_iterator_finalize(final SubLObject state)
  {
    SubLObject rs = NIL;
    SubLObject end_row = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list5 );
    rs = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list5 );
    end_row = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return finalize_result_set( rs );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 4550L)
  public static SubLObject sqlrs_current_row_as_list(final SubLObject rs)
  {
    final SubLObject column_count = sdbc.sqlrs_column_count( rs );
    SubLObject row = NIL;
    SubLObject col_1;
    SubLObject col;
    SubLObject cell;
    for( col_1 = NIL, col_1 = ZERO_INTEGER; col_1.numL( column_count ); col_1 = Numbers.add( col_1, ONE_INTEGER ) )
    {
      col = Numbers.add( ONE_INTEGER, col_1 );
      cell = sdbc.sqlrs_get_object( rs, col );
      if( NIL == sdbc.sdbc_error_p( cell ) )
      {
        row = ConsesLow.cons( cell, row );
      }
    }
    return Sequences.nreverse( row );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 4909L)
  public static SubLObject new_fht_result_iterator(final SubLObject result)
  {
    return new_sk_source_result_iterator( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 5639L)
  public static SubLObject new_sk_source_result_iterator(final SubLObject result)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == result && NIL != $sks_result_iterator_auto_filter_nulls$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    if( NIL != iteration.iterator_p( result ) )
    {
      return result;
    }
    if( result.isList() )
    {
      return iteration.new_list_iterator( result );
    }
    if( result.isAtom() )
    {
      return iteration.new_list_iterator( ConsesLow.list( ConsesLow.list( result ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 5961L)
  public static SubLObject new_sksi_file_hash_table_iterator(final SubLObject fht)
  {
    assert NIL != file_hash_table.file_hash_table_p( fht ) : fht;
    return file_hash_table.new_file_hash_table_iterator( fht, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 6312L)
  public static SubLObject new_sksi_reverse_file_hash_table_iterator(final SubLObject fht)
  {
    assert NIL != file_hash_table.file_hash_table_p( fht ) : fht;
    final SubLObject fht_iterator = file_hash_table.new_file_hash_table_iterator( fht, T );
    return iteration.new_indirect_iterator( fht_iterator, $sym18$NREVERSE, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 6537L)
  public static SubLObject new_sksi_file_hash_table_keys_iterator(final SubLObject fht)
  {
    assert NIL != file_hash_table.file_hash_table_p( fht ) : fht;
    return iteration.new_iterator( file_hash_table.make_iterator_file_hash_table_state( fht, T, T ), $sym19$ITERATE_FILE_HASH_TABLE_DONE_, $sym20$SKSI_ITERATE_FILE_HASH_TABLE_NEXT_KEY, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 7003L)
  public static SubLObject sksi_iterate_file_hash_table_next_key(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject next = file_hash_table.iterate_file_hash_table_next( state );
    final SubLObject next_state = thread.secondMultipleValue();
    final SubLObject doneP = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return Values.values( ConsesLow.list( next ), next_state, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 7209L)
  public static SubLObject new_sksi_file_hash_table_values_iterator(final SubLObject fht)
  {
    assert NIL != file_hash_table.file_hash_table_p( fht ) : fht;
    return iteration.new_iterator( file_hash_table.make_iterator_file_hash_table_state( fht, NIL, T ), $sym19$ITERATE_FILE_HASH_TABLE_DONE_, $sym21$SKSI_ITERATE_FILE_HASH_TABLE_NEXT_VALUE, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 7519L)
  public static SubLObject sksi_iterate_file_hash_table_next_value(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject next = file_hash_table.iterate_file_hash_table_next_value( state );
    final SubLObject next_state = thread.secondMultipleValue();
    final SubLObject doneP = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return Values.values( ConsesLow.list( next ), next_state, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 7733L)
  public static SubLObject new_sksi_list_iterator(final SubLObject list)
  {
    assert NIL != Types.listp( list ) : list;
    return iteration.new_iterator( iteration.make_iterator_list_state( list ), $sym23$ITERATE_LIST_DONE, $sym24$SKSI_ITERATE_LIST_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-result-set-iterators.lisp", position = 7923L)
  public static SubLObject sksi_iterate_list_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject next = iteration.iterate_list_next( state );
    final SubLObject next_state = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( ConsesLow.list( next ), next_state );
  }

  public static SubLObject declare_sksi_result_set_iterators_file()
  {
    SubLFiles.declareFunction( me, "new_sqlrs_iterator", "NEW-SQLRS-ITERATOR", 1, 2, false );
    SubLFiles.declareFunction( me, "clear_cached_sqlrs_all_rows", "CLEAR-CACHED-SQLRS-ALL-ROWS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cached_sqlrs_all_rows", "REMOVE-CACHED-SQLRS-ALL-ROWS", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_sqlrs_all_rows_internal", "CACHED-SQLRS-ALL-ROWS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cached_sqlrs_all_rows", "CACHED-SQLRS-ALL-ROWS", 1, 0, false );
    SubLFiles.declareFunction( me, "make_iterator_sqlrs_state", "MAKE-ITERATOR-SQLRS-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_doneP", "SQLRS-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "finalize_result_set", "FINALIZE-RESULT-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_iterator_next", "SQLRS-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_iterator_finalize", "SQLRS-ITERATOR-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "sqlrs_current_row_as_list", "SQLRS-CURRENT-ROW-AS-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "new_fht_result_iterator", "NEW-FHT-RESULT-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sk_source_result_iterator", "NEW-SK-SOURCE-RESULT-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sksi_file_hash_table_iterator", "NEW-SKSI-FILE-HASH-TABLE-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sksi_reverse_file_hash_table_iterator", "NEW-SKSI-REVERSE-FILE-HASH-TABLE-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sksi_file_hash_table_keys_iterator", "NEW-SKSI-FILE-HASH-TABLE-KEYS-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_iterate_file_hash_table_next_key", "SKSI-ITERATE-FILE-HASH-TABLE-NEXT-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sksi_file_hash_table_values_iterator", "NEW-SKSI-FILE-HASH-TABLE-VALUES-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_iterate_file_hash_table_next_value", "SKSI-ITERATE-FILE-HASH-TABLE-NEXT-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sksi_list_iterator", "NEW-SKSI-LIST-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_iterate_list_next", "SKSI-ITERATE-LIST-NEXT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_sksi_result_set_iterators_file()
  {
    $sksi_caching_enabledP$ = SubLFiles.defvar( "*SKSI-CACHING-ENABLED?*", NIL );
    $cached_sqlrs_all_rows_caching_state$ = SubLFiles.deflexical( "*CACHED-SQLRS-ALL-ROWS-CACHING-STATE*", NIL );
    $sks_result_iterator_auto_filter_nulls$ = SubLFiles.defparameter( "*SKS-RESULT-ITERATOR-AUTO-FILTER-NULLS*", T );
    return NIL;
  }

  public static SubLObject setup_sksi_result_set_iterators_file()
  {
    memoization_state.note_globally_cached_function( $sym3$CACHED_SQLRS_ALL_ROWS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_result_set_iterators_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_result_set_iterators_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_result_set_iterators_file();
  }
  static
  {
    me = new sksi_result_set_iterators();
    $sksi_caching_enabledP$ = null;
    $cached_sqlrs_all_rows_caching_state$ = null;
    $sks_result_iterator_auto_filter_nulls$ = null;
    $sym0$SQLRS_DONE_ = makeSymbol( "SQLRS-DONE?" );
    $sym1$SQLRS_ITERATOR_NEXT = makeSymbol( "SQLRS-ITERATOR-NEXT" );
    $sym2$SQLRS_ITERATOR_FINALIZE = makeSymbol( "SQLRS-ITERATOR-FINALIZE" );
    $sym3$CACHED_SQLRS_ALL_ROWS = makeSymbol( "CACHED-SQLRS-ALL-ROWS" );
    $sym4$_CACHED_SQLRS_ALL_ROWS_CACHING_STATE_ = makeSymbol( "*CACHED-SQLRS-ALL-ROWS-CACHING-STATE*" );
    $list5 = ConsesLow.list( makeSymbol( "RS" ), makeSymbol( "END-ROW" ) );
    $list6 = ConsesLow.list( makeSymbol( "CONNECTION" ), makeSymbol( "STATEMENT" ) );
    $str7$The_SQL_connection_ = makeString( "The SQL connection " );
    $str8$_is_closed__hence__the_result_set = makeString( " is closed, hence, the result set " );
    $str9$_cannot_be_accessed_ = makeString( " cannot be accessed." );
    $sym10$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str11$The_SQL_row_ = makeString( "The SQL row " );
    $str12$_ = makeString( " " );
    $str13$_is_NULL_so_the_result_set_ = makeString( " is NULL so the result set " );
    $str14$_of_connection_ = makeString( " of connection " );
    $str15$_errored_with_ = makeString( " errored with " );
    $str16$__hence__the_result_set_ = makeString( ", hence, the result set " );
    $sym17$FILE_HASH_TABLE_P = makeSymbol( "FILE-HASH-TABLE-P" );
    $sym18$NREVERSE = makeSymbol( "NREVERSE" );
    $sym19$ITERATE_FILE_HASH_TABLE_DONE_ = makeSymbol( "ITERATE-FILE-HASH-TABLE-DONE?" );
    $sym20$SKSI_ITERATE_FILE_HASH_TABLE_NEXT_KEY = makeSymbol( "SKSI-ITERATE-FILE-HASH-TABLE-NEXT-KEY" );
    $sym21$SKSI_ITERATE_FILE_HASH_TABLE_NEXT_VALUE = makeSymbol( "SKSI-ITERATE-FILE-HASH-TABLE-NEXT-VALUE" );
    $sym22$LISTP = makeSymbol( "LISTP" );
    $sym23$ITERATE_LIST_DONE = makeSymbol( "ITERATE-LIST-DONE" );
    $sym24$SKSI_ITERATE_LIST_NEXT = makeSymbol( "SKSI-ITERATE-LIST-NEXT" );
  }
}
/*
 * 
 * Total time: 227 ms
 * 
 */