package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class hash_table_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.hash_table_utilities";
  public static final String myFingerPrint = "830e9981bf605fbfcaf5f8d9b7ce0653b2e7d3614041f6e7d382de9c00347fdd";
  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 368L)
  private static SubLSymbol $valid_hash_test_symbols$;
  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 584L)
  private static SubLSymbol $valid_hash_test_functions$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$VALID_HASH_TEST_P;
  private static final SubLSymbol $sym2$SYMBOL_FUNCTION;
  private static final SubLSymbol $sym3$KBEQ;
  private static final SubLString $str4$_S_cannot_be_coerced_into_a_valid;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$STRING__;
  private static final SubLSymbol $sym7$SYMBOL_NAME;
  private static final SubLSymbol $sym8$HASH_TABLE_P;
  private static final SubLString $str9$Corrupted_hash_table__attempting_;
  private static final SubLString $str10$The_key__S_maps_to_the_non_numeri;
  private static final SubLSymbol $kw11$NOTHING;
  private static final SubLSymbol $kw12$MAPPING_DONE;
  private static final SubLSymbol $kw13$KEYS;
  private static final SubLSymbol $kw14$VALUES;
  private static final SubLSymbol $kw15$UNINTIALIZED;
  private static final SubLSymbol $sym16$TRUE;
  private static final SubLString $str17$_S_____S__;

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 754L)
  public static SubLObject valid_hash_test_symbols()
  {
    return $valid_hash_test_symbols$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 832L)
  public static SubLObject valid_hash_test_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != subl_promotions.memberP( v_object, $valid_hash_test_symbols$.getGlobalValue(), Symbols.symbol_function( EQ ), UNPROVIDED ) || NIL != subl_promotions.memberP( v_object,
        $valid_hash_test_functions$.getGlobalValue(), Symbols.symbol_function( EQ ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 1075L)
  public static SubLObject hash_test_to_symbol(final SubLObject test)
  {
    assert NIL != valid_hash_test_p( test ) : test;
    if( test.isSymbol() )
    {
      return test;
    }
    return Sequences.find( test, $valid_hash_test_symbols$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym2$SYMBOL_FUNCTION ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 1346L)
  public static SubLObject to_hash_test(final SubLObject v_object)
  {
    if( NIL != valid_hash_test_p( v_object ) )
    {
      return v_object;
    }
    if( v_object.eql( Symbols.symbol_function( $sym3$KBEQ ) ) )
    {
      return Symbols.symbol_function( EQ );
    }
    if( v_object == $sym3$KBEQ )
    {
      return EQ;
    }
    return Errors.error( $str4$_S_cannot_be_coerced_into_a_valid, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 1719L)
  public static SubLObject hash_table_empty_p(final SubLObject table)
  {
    return Numbers.numE( ZERO_INTEGER, Hashtables.hash_table_count( table ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 1840L)
  public static SubLObject rehash(final SubLObject table)
  {
    SubLObject pairs = NIL;
    SubLObject key = NIL;
    SubLObject value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        value = Hashtables.getEntryValue( cdohash_entry );
        pairs = ConsesLow.cons( ConsesLow.cons( key, value ), pairs );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    Hashtables.clrhash( table );
    SubLObject cdolist_list_var = pairs;
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pair;
      SubLObject key2 = NIL;
      SubLObject value2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
      key2 = current.first();
      current = ( value2 = current.rest() );
      Hashtables.sethash( key2, table, value2 );
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    return table;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 2152L)
  public static SubLObject rehash_if_stale(final SubLObject table)
  {
    if( NIL != hash_table_staleP( table ) )
    {
      return rehash( table );
    }
    return table;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 2357L)
  public static SubLObject hash_table_staleP(final SubLObject table)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject key = hash_table_arbitrary_key( table );
    thread.resetMultipleValues();
    final SubLObject found_value = Hashtables.gethash( key, table, UNPROVIDED );
    final SubLObject foundP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return makeBoolean( NIL == foundP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 2753L)
  public static SubLObject push_hash(final SubLObject key, final SubLObject item, final SubLObject table)
  {
    return Hashtables.sethash( key, table, ConsesLow.cons( item, Hashtables.gethash( key, table, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 2850L)
  public static SubLObject pushnew_hash(final SubLObject key, final SubLObject item, final SubLObject table, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    return Hashtables.sethash( key, table, conses_high.adjoin( item, Hashtables.gethash( key, table, UNPROVIDED ), test, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 2980L)
  public static SubLObject push_to_end_hash(final SubLObject key, final SubLObject item, final SubLObject table)
  {
    return Hashtables.sethash( key, table, list_utilities.nadd_to_end( item, Hashtables.gethash( key, table, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 3091L)
  public static SubLObject hash_add_to_value_sorted(final SubLObject key, final SubLObject table, final SubLObject item, SubLObject predicate, SubLObject key_accessor)
  {
    if( predicate == UNPROVIDED )
    {
      predicate = $sym6$STRING__;
    }
    if( key_accessor == UNPROVIDED )
    {
      key_accessor = Symbols.symbol_function( $sym7$SYMBOL_NAME );
    }
    assert NIL != Types.hash_table_p( table ) : table;
    SubLObject current_val = Hashtables.gethash( key, table, UNPROVIDED );
    if( current_val.isList() )
    {
      current_val = list_utilities.sorted_add_to_list( item, current_val, predicate, key_accessor );
      return Hashtables.sethash( key, table, current_val );
    }
    Errors.error( $str9$Corrupted_hash_table__attempting_, current_val );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 3765L)
  public static SubLObject pushnew_to_end_hash(final SubLObject key, final SubLObject item, final SubLObject table)
  {
    return Hashtables.sethash( key, table, list_utilities.nadjoin_to_end( item, Hashtables.gethash( key, table, UNPROVIDED ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 3882L)
  public static SubLObject pop_hash(final SubLObject key, final SubLObject table)
  {
    final SubLObject value = Hashtables.gethash_without_values( key, table, UNPROVIDED );
    Hashtables.sethash( key, table, value.rest() );
    return value.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 4217L)
  public static SubLObject remove_value_from_hash(final SubLObject key, final SubLObject item, final SubLObject table, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    return Hashtables.sethash( key, table, Sequences.remove( item, Hashtables.gethash( key, table, UNPROVIDED ), test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 4448L)
  public static SubLObject gethash_first(final SubLObject key, final SubLObject table, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject raw_value = Hashtables.gethash( key, table, v_default );
    final SubLObject value_goodP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( raw_value.isList() )
    {
      return Values.values( raw_value.first(), value_goodP );
    }
    return Values.values( raw_value, value_goodP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 5138L)
  public static SubLObject sethash_first(final SubLObject key, final SubLObject table, final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject new_value = NIL;
    thread.resetMultipleValues();
    final SubLObject raw_value = Hashtables.gethash( key, table, UNPROVIDED );
    final SubLObject value_goodP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == value_goodP )
    {
      new_value = ConsesLow.list( value );
    }
    else if( raw_value.isList() )
    {
      new_value = ConsesLow.cons( value, raw_value.rest() );
    }
    else
    {
      new_value = ConsesLow.list( value, raw_value );
    }
    return Hashtables.sethash( key, table, new_value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 5973L)
  public static SubLObject nconc_hash(final SubLObject key, final SubLObject item, final SubLObject table)
  {
    return Hashtables.sethash( key, table, ConsesLow.nconc( item, Hashtables.gethash( key, table, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 6541L)
  public static SubLObject nconc_to_end_hash(final SubLObject key, final SubLObject item, final SubLObject table)
  {
    return Hashtables.sethash( key, table, ConsesLow.nconc( Hashtables.gethash( key, table, UNPROVIDED ), item ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 7103L)
  public static SubLObject copy_hash_table_values_into(final SubLObject from, final SubLObject to)
  {
    SubLObject k = NIL;
    SubLObject v = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( from );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        k = Hashtables.getEntryKey( cdohash_entry );
        v = Hashtables.getEntryValue( cdohash_entry );
        Hashtables.sethash( k, to, v );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return to;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 7365L)
  public static SubLObject copy_hashtable(final SubLObject hash_table, SubLObject size)
  {
    if( size == UNPROVIDED )
    {
      size = Hashtables.hash_table_count( hash_table );
    }
    assert NIL != Types.hash_table_p( hash_table ) : hash_table;
    final SubLObject test = Hashtables.hash_table_test( hash_table );
    final SubLObject new_table = Hashtables.make_hash_table( size, test, UNPROVIDED );
    copy_hash_table_values_into( hash_table, new_table );
    return new_table;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 7732L)
  public static SubLObject sort_hash_value(final SubLObject key, final SubLObject table, final SubLObject sort_fn)
  {
    return Hashtables.sethash( key, table, Functions.funcall( sort_fn, Hashtables.gethash( key, table, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 7845L)
  public static SubLObject delete_hash(final SubLObject key, final SubLObject item, final SubLObject table, SubLObject test, SubLObject test_key)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( test_key == UNPROVIDED )
    {
      test_key = Symbols.symbol_function( IDENTITY );
    }
    return Hashtables.sethash( key, table, Sequences.delete( item, Hashtables.gethash( key, table, UNPROVIDED ), test, test_key, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 8005L)
  public static SubLObject prune_hash(final SubLObject key, final SubLObject item, final SubLObject table, SubLObject test, SubLObject test_key)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( test_key == UNPROVIDED )
    {
      test_key = Symbols.symbol_function( IDENTITY );
    }
    final SubLObject new_value = Sequences.delete( item, Hashtables.gethash( key, table, UNPROVIDED ), test, test_key, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != new_value )
    {
      return Hashtables.sethash( key, table, new_value );
    }
    return Hashtables.remhash( key, table );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 8426L)
  public static SubLObject cinc_hash(final SubLObject key, final SubLObject table, SubLObject increment, SubLObject initial_val)
  {
    if( increment == UNPROVIDED )
    {
      increment = ONE_INTEGER;
    }
    if( initial_val == UNPROVIDED )
    {
      initial_val = increment;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.hash_table_p( table ) : table;
    final SubLObject val = Hashtables.gethash( key, table, UNPROVIDED );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != val && !val.isNumber() )
    {
      Errors.error( $str10$The_key__S_maps_to_the_non_numeri, key, val, table );
    }
    return Hashtables.sethash( key, table, ( NIL != val ) ? Numbers.add( val, increment ) : initial_val );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 8988L)
  public static SubLObject nunion_hash(final SubLObject key, final SubLObject items, final SubLObject table, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    return Hashtables.sethash( key, table, conses_high.nunion( Hashtables.gethash( key, table, UNPROVIDED ), items, test, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 9119L)
  public static SubLObject nset_difference_hash(final SubLObject key, final SubLObject items, final SubLObject table, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    return Hashtables.sethash( key, table, conses_high.nset_difference( Hashtables.gethash( key, table, UNPROVIDED ), items, test, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 9268L)
  public static SubLObject hash_difference(final SubLObject hash1, final SubLObject hash2, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    SubLObject result = NIL;
    SubLObject key = NIL;
    SubLObject val = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( hash1 );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        val = Hashtables.getEntryValue( cdohash_entry );
        if( NIL == Functions.funcall( test, val, Hashtables.gethash( key, hash2, UNPROVIDED ) ) )
        {
          result = ConsesLow.cons( key, result );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 9577L)
  public static SubLObject hash_existence_difference(final SubLObject hash1, final SubLObject hash2)
  {
    SubLObject result = NIL;
    SubLObject key = NIL;
    SubLObject val = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( hash1 );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        val = Hashtables.getEntryValue( cdohash_entry );
        if( $kw11$NOTHING == Hashtables.gethash( key, hash2, $kw11$NOTHING ) )
        {
          result = ConsesLow.cons( key, result );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 9855L)
  public static SubLObject hash_memberP(final SubLObject key, final SubLObject item, final SubLObject table, SubLObject member_test, SubLObject member_key)
  {
    if( member_test == UNPROVIDED )
    {
      member_test = Symbols.symbol_function( EQL );
    }
    if( member_key == UNPROVIDED )
    {
      member_key = Symbols.symbol_function( IDENTITY );
    }
    return subl_promotions.memberP( item, Hashtables.gethash( key, table, UNPROVIDED ), member_test, member_key );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 10015L)
  public static SubLObject all_elements_in_hashP(final SubLObject list, final SubLObject hash)
  {
    SubLObject missingP = NIL;
    if( NIL == missingP )
    {
      SubLObject csome_list_var = list;
      SubLObject key = NIL;
      key = csome_list_var.first();
      while ( NIL == missingP && NIL != csome_list_var)
      {
        if( NIL == Hashtables.gethash( key, hash, UNPROVIDED ) )
        {
          missingP = T;
        }
        csome_list_var = csome_list_var.rest();
        key = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == missingP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 10296L)
  public static SubLObject sort_hash_table_data(final SubLObject hashtable, final SubLObject predicate, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    assert NIL != Types.hash_table_p( hashtable ) : hashtable;
    final SubLObject total = Hashtables.hash_table_count( hashtable );
    if( total.numG( ZERO_INTEGER ) )
    {
      SubLObject sort_vec = Vectors.make_vector( total, UNPROVIDED );
      SubLObject v_answer = NIL;
      SubLObject index = ZERO_INTEGER;
      SubLObject hash_key = NIL;
      SubLObject val = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( hashtable );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          hash_key = Hashtables.getEntryKey( cdohash_entry );
          val = Hashtables.getEntryValue( cdohash_entry );
          Vectors.set_aref( sort_vec, index, val );
          index = Numbers.add( index, ONE_INTEGER );
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
      sort_vec = Sort.sort( sort_vec, predicate, key );
      SubLObject cdotimes_end_var;
      SubLObject index_$1;
      for( cdotimes_end_var = Sequences.length( sort_vec ), index_$1 = NIL, index_$1 = ZERO_INTEGER; index_$1.numL( cdotimes_end_var ); index_$1 = Numbers.add( index_$1, ONE_INTEGER ) )
      {
        v_answer = ConsesLow.cons( Vectors.aref( sort_vec, index_$1 ), v_answer );
      }
      return Sequences.nreverse( v_answer );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 10919L)
  public static SubLObject hash_first_n(final SubLObject n, final SubLObject table)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    SubLObject result = NIL;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw12$MAPPING_DONE );
      SubLObject key = NIL;
      SubLObject val = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          key = Hashtables.getEntryKey( cdohash_entry );
          val = Hashtables.getEntryValue( cdohash_entry );
          if( count.numGE( n ) )
          {
            utilities_macros.mapping_finished();
          }
          count = Numbers.add( count, ONE_INTEGER );
          result = ConsesLow.cons( ConsesLow.list( key, val ), result );
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw12$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 11393L)
  public static SubLObject list_table_keys(final SubLObject hash_table)
  {
    return hash_table_keys( hash_table );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 11469L)
  public static SubLObject hash_table_arbitrary_key(final SubLObject hash_table)
  {
    SubLObject key = NIL;
    SubLObject val = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( hash_table );
    try
    {
      if( Hashtables.iteratorHasNext( cdohash_iterator ) )
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        val = Hashtables.getEntryValue( cdohash_entry );
        return key;
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 11632L)
  public static SubLObject hash_table_arbitrary_value(final SubLObject hash_table)
  {
    SubLObject key = NIL;
    SubLObject val = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( hash_table );
    try
    {
      if( Hashtables.iteratorHasNext( cdohash_iterator ) )
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        val = Hashtables.getEntryValue( cdohash_entry );
        return val;
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 11799L)
  public static SubLObject hash_table_random_key(final SubLObject hash_table)
  {
    SubLObject iterations = random.random( Hashtables.hash_table_count( hash_table ) );
    SubLObject key = NIL;
    SubLObject value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( hash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        value = Hashtables.getEntryValue( cdohash_entry );
        if( !iterations.isPositive() )
        {
          return key;
        }
        iterations = Numbers.subtract( iterations, ONE_INTEGER );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return hash_table_arbitrary_key( hash_table );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 12216L)
  public static SubLObject hash_table_random_value(final SubLObject hash_table)
  {
    SubLObject iterations = random.random( Hashtables.hash_table_count( hash_table ) );
    SubLObject key = NIL;
    SubLObject value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( hash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        value = Hashtables.getEntryValue( cdohash_entry );
        if( !iterations.isPositive() )
        {
          return value;
        }
        iterations = Numbers.subtract( iterations, ONE_INTEGER );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return hash_table_arbitrary_value( hash_table );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 12639L)
  public static SubLObject hash_table_keys(final SubLObject hash_table)
  {
    return hash_table_keys_or_values( hash_table, $kw13$KEYS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 12780L)
  public static SubLObject hash_table_values(final SubLObject hash_table)
  {
    return hash_table_keys_or_values( hash_table, $kw14$VALUES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 12927L)
  public static SubLObject hash_table_keys_or_values(final SubLObject hash_table, final SubLObject type)
  {
    assert NIL != Types.hash_table_p( hash_table ) : hash_table;
    if( NIL == hash_table_empty_p( hash_table ) )
    {
      final SubLObject expected_size = Hashtables.hash_table_count( hash_table );
      SubLObject cursor;
      final SubLObject v_answer = cursor = ConsesLow.make_list( Numbers.max( ONE_INTEGER, expected_size ), UNPROVIDED );
      SubLObject previous = $kw15$UNINTIALIZED;
      final SubLObject get_keysP = Equality.eq( type, $kw13$KEYS );
      SubLObject key = NIL;
      SubLObject value = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( hash_table );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          key = Hashtables.getEntryKey( cdohash_entry );
          value = Hashtables.getEntryValue( cdohash_entry );
          if( NIL != cursor )
          {
            if( NIL != get_keysP )
            {
              ConsesLow.rplaca( cursor, key );
            }
            else
            {
              ConsesLow.rplaca( cursor, value );
            }
            previous = cursor;
            cursor = cursor.rest();
          }
          else
          {
            if( NIL != get_keysP )
            {
              ConsesLow.rplacd( previous, ConsesLow.cons( key, NIL ) );
            }
            else
            {
              ConsesLow.rplacd( previous, ConsesLow.cons( value, NIL ) );
            }
            previous = previous.rest();
          }
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
      if( NIL != cursor )
      {
        ConsesLow.rplacd( previous, NIL );
      }
      return v_answer;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 13999L)
  public static SubLObject hash_table_keys_with_value(final SubLObject hash_table, final SubLObject target_value, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    SubLObject keys = NIL;
    SubLObject key = NIL;
    SubLObject value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( hash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        value = Hashtables.getEntryValue( cdohash_entry );
        if( NIL != Functions.funcall( test, value, target_value ) )
        {
          keys = ConsesLow.cons( key, keys );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return Sequences.nreverse( keys );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 14338L)
  public static SubLObject random_hash_table_key_with_value(final SubLObject hash_table, final SubLObject target_value, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    return list_utilities.random_element( hash_table_keys_with_value( hash_table, target_value, test ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 14605L)
  public static SubLObject hash_table_to_alist(final SubLObject hash_table)
  {
    assert NIL != Types.hash_table_p( hash_table ) : hash_table;
    final SubLObject test = Hashtables.hash_table_test( hash_table );
    SubLObject alist = NIL;
    SubLObject key = NIL;
    SubLObject value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( hash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        value = Hashtables.getEntryValue( cdohash_entry );
        alist = ConsesLow.cons( ConsesLow.cons( key, value ), alist );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return Values.values( alist, test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 14987L)
  public static SubLObject new_hash_table_from_alist(final SubLObject alist, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    final SubLObject hash = Hashtables.make_hash_table( Sequences.length( alist ), test, UNPROVIDED );
    SubLObject cdolist_list_var = alist;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject key = NIL;
      SubLObject value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
      key = current.first();
      current = ( value = current.rest() );
      Hashtables.sethash( key, hash, value );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return hash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 15196L)
  public static SubLObject get_table_values(final SubLObject hashtable)
  {
    SubLObject ans = NIL;
    SubLObject key = NIL;
    SubLObject val = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( hashtable );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        val = Hashtables.getEntryValue( cdohash_entry );
        ans = ConsesLow.cons( ConsesLow.list( key, val ), ans );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 15384L)
  public static SubLObject hash_table_values_min_length(final SubLObject table, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = ZERO_INTEGER;
    }
    SubLObject min_length = NIL;
    if( table.isHashtable() )
    {
      SubLObject key = NIL;
      SubLObject value = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          key = Hashtables.getEntryKey( cdohash_entry );
          value = Hashtables.getEntryValue( cdohash_entry );
          if( !value.isCons() )
          {
            continue;
          }
          if( NIL == min_length )
          {
            min_length = Sequences.length( value );
          }
          else
          {
            if( ZERO_INTEGER.numE( min_length ) )
            {
              continue;
            }
            final SubLObject length = Sequences.length( value );
            if( !min_length.numG( length ) )
            {
              continue;
            }
            min_length = length;
          }
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
    }
    return min_length.isNumber() ? min_length : v_default;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 15949L)
  public static SubLObject hash_table_values_min_count(final SubLObject table, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = ZERO_INTEGER;
    }
    SubLObject min_count = NIL;
    if( table.isHashtable() )
    {
      SubLObject key = NIL;
      SubLObject value = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( table );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          key = Hashtables.getEntryKey( cdohash_entry );
          value = Hashtables.getEntryValue( cdohash_entry );
          if( !value.isHashtable() )
          {
            continue;
          }
          if( NIL == min_count )
          {
            min_count = Hashtables.hash_table_count( value );
          }
          else
          {
            if( ZERO_INTEGER.numE( min_count ) )
            {
              continue;
            }
            final SubLObject count = Hashtables.hash_table_count( value );
            if( !min_count.numG( count ) )
            {
              continue;
            }
            min_count = count;
          }
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
    }
    return min_count.isNumber() ? min_count : v_default;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 16534L)
  public static SubLObject hash_list_elements(final SubLObject list, SubLObject test, SubLObject size, SubLObject func)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    if( size == UNPROVIDED )
    {
      size = Sequences.length( list );
    }
    if( func == UNPROVIDED )
    {
      func = Symbols.symbol_function( $sym16$TRUE );
    }
    final SubLObject table = Hashtables.make_hash_table( size, test, UNPROVIDED );
    SubLObject cdolist_list_var = list;
    SubLObject x = NIL;
    x = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      Hashtables.sethash( x, table, func.eql( Symbols.symbol_function( $sym16$TRUE ) ) ? T : Functions.funcall( func, x ) );
      cdolist_list_var = cdolist_list_var.rest();
      x = cdolist_list_var.first();
    }
    return table;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 16908L)
  public static SubLObject find_in_hash_if(final SubLObject hashtable, final SubLObject key_test, final SubLObject value_test)
  {
    SubLObject matched_keys = NIL;
    SubLObject key = NIL;
    SubLObject value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( hashtable );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        value = Hashtables.getEntryValue( cdohash_entry );
        if( NIL != Functions.funcall( key_test, key ) && NIL != Functions.funcall( value_test, value ) )
        {
          matched_keys = ConsesLow.cons( key, matched_keys );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return matched_keys;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 17276L)
  public static SubLObject find_in_hash_if_not(final SubLObject hashtable, final SubLObject key_test, final SubLObject value_test)
  {
    SubLObject matched_keys = NIL;
    SubLObject key = NIL;
    SubLObject value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( hashtable );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        value = Hashtables.getEntryValue( cdohash_entry );
        if( NIL != Functions.funcall( key_test, key ) )
        {
          if( NIL != Functions.funcall( value_test, value ) )
          {
            continue;
          }
          matched_keys = ConsesLow.cons( key, matched_keys );
        }
        else
        {
          matched_keys = ConsesLow.cons( key, matched_keys );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return matched_keys;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 17787L)
  public static SubLObject printhash(final SubLObject hashtable, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    SubLObject key = NIL;
    SubLObject val = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( hashtable );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        val = Hashtables.getEntryValue( cdohash_entry );
        PrintLow.format( stream, $str17$_S_____S__, key, val );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 17925L)
  public static SubLObject hashtable_key_collision_count(final SubLObject hashtable)
  {
    assert NIL != Types.hash_table_p( hashtable ) : hashtable;
    final SubLObject key_count = Hashtables.hash_table_count( hashtable );
    final SubLObject collision_table = Hashtables.make_hash_table( key_count, Symbols.symbol_function( EQL ), UNPROVIDED );
    SubLObject key = NIL;
    SubLObject value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( hashtable );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        value = Hashtables.getEntryValue( cdohash_entry );
        Hashtables.sethash( Hashtables.gethash_bucket( key, hashtable ), collision_table, Numbers.add( Hashtables.gethash( Hashtables.gethash_bucket( key, hashtable ), collision_table, ZERO_INTEGER ), ONE_INTEGER ) );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    final SubLObject sxhash_count = Hashtables.hash_table_count( collision_table );
    final SubLObject collision_count = Numbers.subtract( key_count, sxhash_count );
    return collision_count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hash-table-utilities.lisp", position = 18555L)
  public static SubLObject hashtable_key_collision_probability(final SubLObject hashtable)
  {
    return Numbers.divide( hashtable_key_collision_count( hashtable ), Hashtables.hash_table_count( hashtable ) );
  }

  public static SubLObject declare_hash_table_utilities_file()
  {
    SubLFiles.declareFunction( me, "valid_hash_test_symbols", "VALID-HASH-TEST-SYMBOLS", 0, 0, false );
    SubLFiles.declareFunction( me, "valid_hash_test_p", "VALID-HASH-TEST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "hash_test_to_symbol", "HASH-TEST-TO-SYMBOL", 1, 0, false );
    SubLFiles.declareFunction( me, "to_hash_test", "TO-HASH-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "hash_table_empty_p", "HASH-TABLE-EMPTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rehash", "REHASH", 1, 0, false );
    SubLFiles.declareFunction( me, "rehash_if_stale", "REHASH-IF-STALE", 1, 0, false );
    SubLFiles.declareFunction( me, "hash_table_staleP", "HASH-TABLE-STALE?", 1, 0, false );
    SubLFiles.declareFunction( me, "push_hash", "PUSH-HASH", 3, 0, false );
    SubLFiles.declareFunction( me, "pushnew_hash", "PUSHNEW-HASH", 3, 1, false );
    SubLFiles.declareFunction( me, "push_to_end_hash", "PUSH-TO-END-HASH", 3, 0, false );
    SubLFiles.declareFunction( me, "hash_add_to_value_sorted", "HASH-ADD-TO-VALUE-SORTED", 3, 2, false );
    SubLFiles.declareFunction( me, "pushnew_to_end_hash", "PUSHNEW-TO-END-HASH", 3, 0, false );
    SubLFiles.declareFunction( me, "pop_hash", "POP-HASH", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_value_from_hash", "REMOVE-VALUE-FROM-HASH", 3, 1, false );
    SubLFiles.declareFunction( me, "gethash_first", "GETHASH-FIRST", 2, 1, false );
    SubLFiles.declareFunction( me, "sethash_first", "SETHASH-FIRST", 3, 0, false );
    SubLFiles.declareFunction( me, "nconc_hash", "NCONC-HASH", 3, 0, false );
    SubLFiles.declareFunction( me, "nconc_to_end_hash", "NCONC-TO-END-HASH", 3, 0, false );
    SubLFiles.declareFunction( me, "copy_hash_table_values_into", "COPY-HASH-TABLE-VALUES-INTO", 2, 0, false );
    SubLFiles.declareFunction( me, "copy_hashtable", "COPY-HASHTABLE", 1, 1, false );
    SubLFiles.declareFunction( me, "sort_hash_value", "SORT-HASH-VALUE", 3, 0, false );
    SubLFiles.declareFunction( me, "delete_hash", "DELETE-HASH", 3, 2, false );
    SubLFiles.declareFunction( me, "prune_hash", "PRUNE-HASH", 3, 2, false );
    SubLFiles.declareFunction( me, "cinc_hash", "CINC-HASH", 2, 2, false );
    SubLFiles.declareFunction( me, "nunion_hash", "NUNION-HASH", 3, 1, false );
    SubLFiles.declareFunction( me, "nset_difference_hash", "NSET-DIFFERENCE-HASH", 3, 1, false );
    SubLFiles.declareFunction( me, "hash_difference", "HASH-DIFFERENCE", 2, 1, false );
    SubLFiles.declareFunction( me, "hash_existence_difference", "HASH-EXISTENCE-DIFFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "hash_memberP", "HASH-MEMBER?", 3, 2, false );
    SubLFiles.declareFunction( me, "all_elements_in_hashP", "ALL-ELEMENTS-IN-HASH?", 2, 0, false );
    SubLFiles.declareFunction( me, "sort_hash_table_data", "SORT-HASH-TABLE-DATA", 2, 1, false );
    SubLFiles.declareFunction( me, "hash_first_n", "HASH-FIRST-N", 2, 0, false );
    SubLFiles.declareFunction( me, "list_table_keys", "LIST-TABLE-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "hash_table_arbitrary_key", "HASH-TABLE-ARBITRARY-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "hash_table_arbitrary_value", "HASH-TABLE-ARBITRARY-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "hash_table_random_key", "HASH-TABLE-RANDOM-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "hash_table_random_value", "HASH-TABLE-RANDOM-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "hash_table_keys", "HASH-TABLE-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "hash_table_values", "HASH-TABLE-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "hash_table_keys_or_values", "HASH-TABLE-KEYS-OR-VALUES", 2, 0, false );
    SubLFiles.declareFunction( me, "hash_table_keys_with_value", "HASH-TABLE-KEYS-WITH-VALUE", 2, 1, false );
    SubLFiles.declareFunction( me, "random_hash_table_key_with_value", "RANDOM-HASH-TABLE-KEY-WITH-VALUE", 2, 1, false );
    SubLFiles.declareFunction( me, "hash_table_to_alist", "HASH-TABLE-TO-ALIST", 1, 0, false );
    SubLFiles.declareFunction( me, "new_hash_table_from_alist", "NEW-HASH-TABLE-FROM-ALIST", 1, 1, false );
    SubLFiles.declareFunction( me, "get_table_values", "GET-TABLE-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "hash_table_values_min_length", "HASH-TABLE-VALUES-MIN-LENGTH", 1, 1, false );
    SubLFiles.declareFunction( me, "hash_table_values_min_count", "HASH-TABLE-VALUES-MIN-COUNT", 1, 1, false );
    SubLFiles.declareFunction( me, "hash_list_elements", "HASH-LIST-ELEMENTS", 1, 3, false );
    SubLFiles.declareFunction( me, "find_in_hash_if", "FIND-IN-HASH-IF", 3, 0, false );
    SubLFiles.declareFunction( me, "find_in_hash_if_not", "FIND-IN-HASH-IF-NOT", 3, 0, false );
    SubLFiles.declareFunction( me, "printhash", "PRINTHASH", 1, 1, false );
    SubLFiles.declareFunction( me, "hashtable_key_collision_count", "HASHTABLE-KEY-COLLISION-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "hashtable_key_collision_probability", "HASHTABLE-KEY-COLLISION-PROBABILITY", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_hash_table_utilities_file()
  {
    $valid_hash_test_symbols$ = SubLFiles.defconstant( "*VALID-HASH-TEST-SYMBOLS*", $list0 );
    $valid_hash_test_functions$ = SubLFiles.defconstant( "*VALID-HASH-TEST-FUNCTIONS*", ConsesLow.list( Symbols.symbol_function( EQ ), Symbols.symbol_function( EQL ), Symbols.symbol_function( EQUAL ), Symbols
        .symbol_function( EQUALP ) ) );
    return NIL;
  }

  public static SubLObject setup_hash_table_utilities_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_hash_table_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_hash_table_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_hash_table_utilities_file();
  }
  static
  {
    me = new hash_table_utilities();
    $valid_hash_test_symbols$ = null;
    $valid_hash_test_functions$ = null;
    $list0 = ConsesLow.list( EQ, EQL, EQUAL, EQUALP );
    $sym1$VALID_HASH_TEST_P = makeSymbol( "VALID-HASH-TEST-P" );
    $sym2$SYMBOL_FUNCTION = makeSymbol( "SYMBOL-FUNCTION" );
    $sym3$KBEQ = makeSymbol( "KBEQ" );
    $str4$_S_cannot_be_coerced_into_a_valid = makeString( "~S cannot be coerced into a valid SubL hash test" );
    $list5 = ConsesLow.cons( makeSymbol( "KEY" ), makeSymbol( "VALUE" ) );
    $sym6$STRING__ = makeSymbol( "STRING<=" );
    $sym7$SYMBOL_NAME = makeSymbol( "SYMBOL-NAME" );
    $sym8$HASH_TABLE_P = makeSymbol( "HASH-TABLE-P" );
    $str9$Corrupted_hash_table__attempting_ = makeString( "Corrupted hash table; attempting to add values on a non-listp ~a.~%" );
    $str10$The_key__S_maps_to_the_non_numeri = makeString( "The key ~S maps to the non-numeric value ~S in the hashtable ~A." );
    $kw11$NOTHING = makeKeyword( "NOTHING" );
    $kw12$MAPPING_DONE = makeKeyword( "MAPPING-DONE" );
    $kw13$KEYS = makeKeyword( "KEYS" );
    $kw14$VALUES = makeKeyword( "VALUES" );
    $kw15$UNINTIALIZED = makeKeyword( "UNINTIALIZED" );
    $sym16$TRUE = makeSymbol( "TRUE" );
    $str17$_S_____S__ = makeString( "~S -> ~S~%" );
  }
}
/*
 * 
 * Total time: 243 ms
 * 
 */