//
//
package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.cycjava.cycl.inference.arete;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class constant_handles extends SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.constant_handles";
  public static final String myFingerPrint = "f5cc4ea17805d295d895ba5a6bcd9295852d41f313387c7751b3db5975e8dc24";
  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 1229L)
  private static SubLSymbol $constant_from_suid$;
  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 4436L)
  private static SubLSymbol $new_constant_suid_threshold$;
  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 9787L)
  public static SubLSymbol $dtp_constant$;
  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 12946L)
  private static SubLSymbol $invalid_constants$;
  private static final SubLSymbol $sym0$_CONSTANT_FROM_SUID_;
  private static final SubLSymbol $sym1$SECOND;
  private static final SubLList $list2;
  private static final SubLString $str3$mapping_Cyc_constants;
  private static final SubLList $list4;
  private static final SubLSymbol $kw5$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw6$DONE;
  private static final SubLSymbol $sym7$DO_KB_SUID_TABLE;
  private static final SubLList $list8;
  private static final SubLSymbol $kw9$PROGRESS_MESSAGE;
  private static final SubLSymbol $sym10$DO_CONSTANTS;
  private static final SubLString $str11$Iterate_over_all_HL_constant_data;
  private static final SubLSymbol $sym12$DO_CONSTANTS_TABLE;
  private static final SubLSymbol $sym13$STRINGP;
  private static final SubLSymbol $kw14$SKIP;
  private static final SubLSymbol $sym15$CREATE_CONSTANT_DUMP_ID_TABLE;
  private static final SubLSymbol $sym16$WITH_CONSTANT_DUMP_ID_TABLE;
  private static final SubLSymbol $sym17$CONSTANT_COUNT;
  private static final SubLString $str18$Return_the_total_number_of_consta;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$_NEW_CONSTANT_SUID_THRESHOLD_;
  private static final SubLSymbol $kw21$DENSE;
  private static final SubLSymbol $kw22$ALL;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$ITERATOR;
  private static final SubLSymbol $sym25$CLET;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$DO_ITERATOR;
  private static final SubLString $str28$Determining_maximum_constant_SUID;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$THRESHOLD;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID;
  private static final SubLSymbol $sym34$START;
  private static final SubLSymbol $sym35$DO_KB_SUID_TABLE_STARTING_AT_ID;
  private static final SubLSymbol $sym36$NEW_CONSTANTS_TABLE_ENTRY_;
  private static final SubLSymbol $sym37$CONSTANTS_TABLE_TUPLE_TO_CONSTANT;
  private static final SubLList $list38;
  static final SubLSymbol $sym39$CONSTANT;
  static final SubLSymbol $sym40$CONSTANT_P;
  private static final SubLInteger $int41$140;
  static final SubLList $list42;
  static final SubLList $list43;
  static final SubLList $list44;
  static final SubLList $list45;
  static final SubLSymbol $sym46$PRINT_CONSTANT;
  private static final SubLSymbol $sym47$CONSTANT_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list48;
  private static final SubLSymbol $sym49$C_SUID;
  private static final SubLSymbol $sym50$_CSETF_C_SUID;
  private static final SubLSymbol $sym51$C_NAME;
  private static final SubLSymbol $sym52$_CSETF_C_NAME;
  private static final SubLSymbol $kw53$SUID;
  private static final SubLSymbol $kw54$NAME;
  private static final SubLString $str55$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw56$BEGIN;
  private static final SubLSymbol $sym57$MAKE_CONSTANT;
  private static final SubLSymbol $kw58$SLOT;
  private static final SubLSymbol $kw59$END;
  private static final SubLSymbol $sym60$VISIT_DEFSTRUCT_OBJECT_CONSTANT_METHOD;
  private static final SubLString $str61$___a;
  private static final SubLString $str62$_The_CFASL_invalid_constant_;
  private static final SubLString $str63$_Constant__a_;
  private static final SubLSymbol $sym64$SXHASH_CONSTANT_METHOD;
  private static final SubLList $list65;
  private static final SubLString $str66$Return_T_iff_the_argument_is_a_Cy;
  private static final SubLList $list67;
  private static final SubLSymbol $sym68$VALID_CONSTANT_;
  private static final SubLList $list69;
  private static final SubLString $str70$Return_T_if_CONSTANT_is_a_valid__;
  private static final SubLSymbol $kw71$UNNAMED;
  private static final SubLSymbol $sym72$VALID_CONSTANT;
  private static final SubLList $list73;
  private static final SubLString $str74$Deprecated_in_favor_of_valid_cons;
  private static final SubLSymbol $sym75$_INVALID_CONSTANTS_;
  private static final SubLInteger $int76$4000;
  private static final SubLString $str77$clearing_local_constant_informati;
  private static final SubLInteger $int78$50000;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$CONSTANT_NAME_SPEC_P;
  private static final SubLString $str81$Freeing_constants;
  private static final SubLSymbol $sym82$INTEGERP;
  private static final SubLString $str83$Rebuilding_constant_completion_ta;

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 1550L)
  public static SubLObject new_constants_iterator()
  {
    return iteration.new_indirect_iterator( id_index.new_id_index_iterator( $constant_from_suid$.getGlobalValue() ), Symbols.symbol_function( $sym1$SECOND ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 1857L)
  public static SubLObject do_constants(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    var = current.first();
    current = current.rest();
    final SubLObject progress_message = current.isCons() ? current.first() : $str3$mapping_Cyc_constants;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list2 );
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list2 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list2 );
      if( NIL == conses_high.member( current_$1, $list4, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw5$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list2 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw6$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym7$DO_KB_SUID_TABLE, ConsesLow.list( var, $list8, $kw9$PROGRESS_MESSAGE, progress_message, $kw6$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 2571L)
  public static SubLObject do_constants_table()
  {
    return $constant_from_suid$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 2669L)
  public static SubLObject map_constants(final SubLObject function)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject idx = do_constants_table();
    final SubLObject mess = $str3$mapping_Cyc_constants;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$2 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$2, $kw14$SKIP ) )
        {
          final SubLObject idx_$3 = idx_$2;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$3, $kw14$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$3 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject id;
            SubLObject c;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              c = Vectors.aref( vector_var, id );
              if( NIL == id_index.id_index_tombstone_p( c ) || NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( c ) )
                {
                  c = $kw14$SKIP;
                }
                Functions.funcall( function, c );
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$4 = idx_$2;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$4 ) || NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$4 );
            SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$4 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$4 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw14$SKIP ) ) ? NIL : $kw14$SKIP;
            while ( id2.numL( end_id ))
            {
              final SubLObject c2 = Hashtables.gethash_without_values( id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) || NIL == id_index.id_index_tombstone_p( c2 ) )
              {
                Functions.funcall( function, c2 );
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              id2 = Numbers.add( id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 2769L)
  public static SubLObject setup_constant_suid_table(final SubLObject size, final SubLObject exactP)
  {
    if( NIL != $constant_from_suid$.getGlobalValue() )
    {
      return NIL;
    }
    constant_completion.initialize_constant_names_in_code();
    $constant_from_suid$.setGlobalValue( id_index.new_id_index( size, ZERO_INTEGER ) );
    return T;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 3094L)
  public static SubLObject finalize_constant_suid_table(SubLObject max_constant_suid)
  {
    if( max_constant_suid == UNPROVIDED )
    {
      max_constant_suid = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    set_next_constant_suid( max_constant_suid );
    set_new_constant_suid_threshold( next_constant_suid() );
    if( NIL == max_constant_suid )
    {
      final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding( thread );
      try
      {
        Storage.$current_area$.bind( Storage.get_static_area(), thread );
        id_index.optimize_id_index( $constant_from_suid$.getGlobalValue(), UNPROVIDED );
      }
      finally
      {
        Storage.$current_area$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 3492L)
  public static SubLObject clear_constant_suid_table()
  {
    return id_index.clear_id_index( $constant_from_suid$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 3624L)
  public static SubLObject create_constant_dump_id_table()
  {
    return id_index.new_indirect_compact_id_index( $constant_from_suid$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 3780L)
  public static SubLObject new_dense_constant_id_index()
  {
    return id_index.clone_id_index( do_constants_table() );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 3877L)
  public static SubLObject constant_count()
  {
    if( NIL == $constant_from_suid$.getGlobalValue() )
    {
      return ZERO_INTEGER;
    }
    return id_index.id_index_count( $constant_from_suid$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 4245L)
  public static SubLObject lookup_constant_by_suid(final SubLObject suid)
  {
    return id_index.id_index_lookup( $constant_from_suid$.getGlobalValue(), suid, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 4346L)
  public static SubLObject next_constant_suid()
  {
    return id_index.id_index_next_id( $constant_from_suid$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 4573L)
  public static SubLObject new_constant_suid_threshold()
  {
    return ( NIL != $new_constant_suid_threshold$.getGlobalValue() ) ? $new_constant_suid_threshold$.getGlobalValue() : constant_index_manager.get_file_backed_constant_internal_id_threshold();
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 4776L)
  public static SubLObject set_new_constant_suid_threshold(final SubLObject id)
  {
    $new_constant_suid_threshold$.setGlobalValue( id );
    return id;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 4885L)
  public static SubLObject old_constant_count()
  {
    return Values.nth_value_step_2( Values.nth_value_step_1( ZERO_INTEGER ), id_index.id_index_old_and_new_object_counts( do_constants_table(), new_constant_suid_threshold() ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 5034L)
  public static SubLObject new_constant_count()
  {
    return Values.nth_value_step_2( Values.nth_value_step_1( ONE_INTEGER ), id_index.id_index_old_and_new_object_counts( do_constants_table(), new_constant_suid_threshold() ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 5183L)
  public static SubLObject missing_old_constant_internal_ids()
  {
    final SubLObject id_limit = new_constant_suid_threshold();
    return id_index.id_index_missing_ids( do_constants_table(), $kw21$DENSE, id_limit );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 5452L)
  public static SubLObject missing_constant_id_set()
  {
    return set_utilities.construct_set_from_list( id_index.id_index_missing_ids( do_constants_table(), $kw22$ALL, UNPROVIDED ), EQL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 5645L)
  public static SubLObject deleted_constant_id_iterator()
  {
    return iteration.new_list_iterator( id_index.id_index_missing_ids( do_constants_table(), $kw22$ALL, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 5822L)
  public static SubLObject do_deleted_constant_ids(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    id = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$6 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list23 );
      current_$6 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list23 );
      if( NIL == conses_high.member( current_$6, $list4, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$6 == $kw5$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw6$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject iterator = $sym24$ITERATOR;
    return ConsesLow.list( $sym25$CLET, ConsesLow.list( reader.bq_cons( iterator, $list26 ) ), ConsesLow.listS( $sym27$DO_ITERATOR, ConsesLow.list( id, iterator, $kw6$DONE, done ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 6061L)
  public static SubLObject has_new_constantsP()
  {
    return Numbers.numG( next_constant_suid(), new_constant_suid_threshold() );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 6163L)
  public static SubLObject set_next_constant_suid(SubLObject max_constant_suid)
  {
    if( max_constant_suid == UNPROVIDED )
    {
      max_constant_suid = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject max = MINUS_ONE_INTEGER;
    if( NIL != max_constant_suid )
    {
      max = max_constant_suid;
    }
    else
    {
      final SubLObject idx = do_constants_table();
      final SubLObject mess = $str28$Determining_maximum_constant_SUID;
      final SubLObject total = id_index.id_index_count( idx );
      SubLObject sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject idx_$7 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$7, $kw14$SKIP ) )
          {
            final SubLObject idx_$8 = idx_$7;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$8, $kw14$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$8 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject constant;
              SubLObject suid;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                constant = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( constant ) || NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( constant ) )
                  {
                    constant = $kw14$SKIP;
                  }
                  suid = constant_suid( constant );
                  max = Numbers.max( max, suid );
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
              }
            }
            final SubLObject idx_$9 = idx_$7;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$9 ) || NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$9 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$9 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$9 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw14$SKIP ) ) ? NIL : $kw14$SKIP;
              while ( id2.numL( end_id ))
              {
                final SubLObject constant2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) || NIL == id_index.id_index_tombstone_p( constant2 ) )
                {
                  final SubLObject suid2 = constant_suid( constant2 );
                  max = Numbers.max( max, suid2 );
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
                id2 = Numbers.add( id2, ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
      }
    }
    final SubLObject next_suid = Numbers.add( max, ONE_INTEGER );
    id_index.set_id_index_next_id( $constant_from_suid$.getGlobalValue(), next_suid );
    return next_suid;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 6587L)
  public static SubLObject register_constant_suid(final SubLObject constant, final SubLObject suid)
  {
    reset_constant_suid( constant, suid );
    id_index.id_index_enter( $constant_from_suid$.getGlobalValue(), suid, constant );
    return constant;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 6811L)
  public static SubLObject deregister_constant_suid(final SubLObject suid)
  {
    return id_index.id_index_remove( $constant_from_suid$.getGlobalValue(), suid );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 6968L)
  public static SubLObject make_constant_suid()
  {
    return id_index.id_index_reserve( $constant_from_suid$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 7104L)
  public static SubLObject do_old_constants(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject constant = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    constant = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$11 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list29 );
      current_$11 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list29 );
      if( NIL == conses_high.member( current_$11, $list30, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$11 == $kw5$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
    }
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw9$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw6$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject threshold = $sym31$THRESHOLD;
    return ConsesLow.list( $sym25$CLET, ConsesLow.list( reader.bq_cons( threshold, $list32 ) ), ConsesLow.listS( $sym33$DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID, ConsesLow.list( constant, $list8, threshold,
        $kw9$PROGRESS_MESSAGE, progress_message, $kw6$DONE, done ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 7969L)
  public static SubLObject do_new_constants(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject constant = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    constant = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$12 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list29 );
      current_$12 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list29 );
      if( NIL == conses_high.member( current_$12, $list30, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$12 == $kw5$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
    }
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw9$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw6$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject start = $sym34$START;
    return ConsesLow.list( $sym25$CLET, ConsesLow.list( reader.bq_cons( start, $list32 ) ), ConsesLow.listS( $sym35$DO_KB_SUID_TABLE_STARTING_AT_ID, ConsesLow.list( constant, $list8, start, $kw9$PROGRESS_MESSAGE,
        progress_message, $kw6$DONE, done ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 8731L)
  public static SubLObject new_new_constants_iterator()
  {
    return iteration.new_indirect_iterator( iteration.new_filter_iterator( id_index.new_id_index_ordered_iterator( do_constants_table() ), $sym36$NEW_CONSTANTS_TABLE_ENTRY_, ConsesLow.list(
        new_constant_suid_threshold() ) ), $sym37$CONSTANTS_TABLE_TUPLE_TO_CONSTANT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 9033L)
  public static SubLObject new_constants_table_entryP(final SubLObject tuple, final SubLObject id_threshold)
  {
    SubLObject id = NIL;
    SubLObject payload = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( tuple, tuple, $list38 );
    id = tuple.first();
    SubLObject current = tuple.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, tuple, $list38 );
    payload = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return Numbers.numGE( id, id_threshold );
    }
    cdestructuring_bind.cdestructuring_bind_error( tuple, $list38 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 9202L)
  public static SubLObject constants_table_tuple_to_constant(final SubLObject tuple)
  {
    SubLObject id = NIL;
    SubLObject payload = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( tuple, tuple, $list38 );
    id = tuple.first();
    SubLObject current = tuple.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, tuple, $list38 );
    payload = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return find_constant_by_suid( id );
    }
    cdestructuring_bind.cdestructuring_bind_error( tuple, $list38 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 9787L)
  public static SubLObject constant_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_constant( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 9787L)
  public static SubLObject constant_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $constant_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 9787L)
  public static SubLObject c_suid(final SubLObject v_object)
  {
    assert NIL != constant_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 9787L)
  public static SubLObject c_name(final SubLObject v_object)
  {
    assert NIL != constant_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 9787L)
  public static SubLObject _csetf_c_suid(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != constant_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 9787L)
  public static SubLObject _csetf_c_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != constant_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 9787L)
  public static SubLObject make_constant(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $constant_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw53$SUID ) )
      {
        _csetf_c_suid( v_new, current_value );
      }
      else if( pcase_var.eql( $kw54$NAME ) )
      {
        _csetf_c_name( v_new, current_value );
      }
      else
      {
        Errors.error( $str55$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 9787L)
  public static SubLObject visit_defstruct_constant(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw56$BEGIN, $sym57$MAKE_CONSTANT, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw53$SUID, c_suid( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw54$NAME, c_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw59$END, $sym57$MAKE_CONSTANT, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 9787L)
  public static SubLObject visit_defstruct_object_constant_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_constant( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 10041L)
  public static SubLObject print_constant(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject name = c_name( v_object );
    final SubLObject suid = c_suid( v_object );
    if( name.isString() )
    {
      PrintLow.format( stream, $str61$___a, name );
    }
    else if( v_object.eql( cfasl_kb_methods.cfasl_invalid_constant() ) )
    {
      PrintLow.format( stream, $str62$_The_CFASL_invalid_constant_ );
    }
    else if( suid.isInteger() )
    {
      PrintLow.format( stream, $str63$_Constant__a_, suid );
    }
    else
    {
      compatibility.default_struct_print_function( v_object, stream, depth );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 10485L)
  public static SubLObject sxhash_constant_method(final SubLObject v_object)
  {
    final SubLObject suid = c_suid( v_object );
    if( suid.isInteger() )
    {
      return suid;
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 10618L)
  public static SubLObject get_constant()
  {
    SubLObject constant = NIL;
    constant = make_constant( UNPROVIDED );
    return constant;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 10840L)
  public static SubLObject init_constant(final SubLObject constant)
  {
    _csetf_c_suid( constant, NIL );
    return constant;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 10961L)
  public static SubLObject free_constant(final SubLObject constant)
  {
    return init_constant( constant );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 11237L)
  public static SubLObject valid_constant_handleP(final SubLObject constant)
  {
    return SubLObjectFactory.makeBoolean( NIL != constant_p( constant ) && NIL != constant_handle_validP( constant ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 11417L)
  public static SubLObject valid_constantP(final SubLObject constant, SubLObject robust)
  {
    if( robust == UNPROVIDED )
    {
      robust = NIL;
    }
    arete.arete_note_constant_touched( constant );
    return valid_constant_handleP( constant );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 11795L)
  public static SubLObject valid_constant_robustP(final SubLObject constant)
  {
    if( NIL != valid_constantP( constant, UNPROVIDED ) )
    {
      final SubLObject name = constants_high.constant_name( constant );
      final SubLObject index = constants_low.constant_index( constant );
      return SubLObjectFactory.makeBoolean( ( name.isString() || $kw71$UNNAMED == name ) && NIL != kb_indexing_datastructures.index_installed_p( index ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 12224L)
  public static SubLObject valid_constant(final SubLObject constant, SubLObject robust)
  {
    if( robust == UNPROVIDED )
    {
      robust = NIL;
    }
    return valid_constantP( constant, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 12495L)
  public static SubLObject invalid_constant_handleP(final SubLObject constant)
  {
    return SubLObjectFactory.makeBoolean( NIL != constant_p( constant ) && NIL == valid_constant_handleP( constant ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 12632L)
  public static SubLObject invalid_constantP(final SubLObject constant, SubLObject robust)
  {
    if( robust == UNPROVIDED )
    {
      robust = NIL;
    }
    return SubLObjectFactory.makeBoolean( NIL != constant_p( constant ) && NIL == valid_constantP( constant, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 12809L)
  public static SubLObject invalid_constant_robustP(final SubLObject constant)
  {
    return SubLObjectFactory.makeBoolean( NIL != constant_p( constant ) && NIL == valid_constant_robustP( constant ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 13329L)
  public static SubLObject invalid_constant_names()
  {
    return hash_table_utilities.hash_table_keys( $invalid_constants$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 13421L)
  public static SubLObject clear_invalid_constants_table()
  {
    return Hashtables.clrhash( $invalid_constants$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 13512L)
  public static SubLObject find_invalid_constant(final SubLObject name)
  {
    return Hashtables.gethash( name, $invalid_constants$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 13608L)
  public static SubLObject register_invalid_constant_by_name(final SubLObject constant, final SubLObject name)
  {
    return Hashtables.sethash( name, $invalid_constants$.getGlobalValue(), constant );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 13730L)
  public static SubLObject deregister_invalid_constant_by_name(final SubLObject name)
  {
    return Hashtables.remhash( name, $invalid_constants$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 13836L)
  public static SubLObject synchronize_constants_with_hl_store()
  {
    return ( NIL != hl_interface_infrastructure.hl_access_remoteP() ) ? synchronize_constants_with_remote_hl_store() : synchronize_constants_with_local_hl_store();
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 14029L)
  public static SubLObject synchronize_constants_with_remote_hl_store()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject idx = do_constants_table();
    final SubLObject mess = $str77$clearing_local_constant_informati;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$13 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$13, $kw14$SKIP ) )
        {
          final SubLObject idx_$14 = idx_$13;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$14, $kw14$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$14 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject id;
            SubLObject constant;
            SubLObject suid;
            SubLObject name;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              constant = Vectors.aref( vector_var, id );
              if( NIL == id_index.id_index_tombstone_p( constant ) || NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( constant ) )
                {
                  constant = $kw14$SKIP;
                }
                suid = constant_suid( constant );
                if( suid.isInteger() )
                {
                  deregister_constant_suid( suid );
                  reset_constant_suid( constant, NIL );
                  name = constants_high.constant_name( constant );
                  if( name.isString() )
                  {
                    register_invalid_constant_by_name( constant, name );
                  }
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$15 = idx_$13;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$15 ) || NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$15 );
            SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$15 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$15 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw14$SKIP ) ) ? NIL : $kw14$SKIP;
            while ( id2.numL( end_id ))
            {
              final SubLObject constant2 = Hashtables.gethash_without_values( id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) || NIL == id_index.id_index_tombstone_p( constant2 ) )
              {
                final SubLObject suid2 = constant_suid( constant2 );
                if( suid2.isInteger() )
                {
                  deregister_constant_suid( suid2 );
                  reset_constant_suid( constant2, NIL );
                  final SubLObject name2 = constants_high.constant_name( constant2 );
                  if( name2.isString() )
                  {
                    register_invalid_constant_by_name( constant2, name2 );
                  }
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              id2 = Numbers.add( id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$16, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    if( NIL != hl_interface_infrastructure.hl_modify_localP() )
    {
      constants_low.clear_constant_guid_table();
      constant_completion_low.clear_constant_completion_table();
    }
    final SubLObject constant_info_iterator = constants_interface.kb_new_constant_info_iterator( $int78$50000 );
    SubLObject count = ZERO_INTEGER;
    try
    {
      SubLObject valid;
      for( SubLObject done_var = NIL; NIL == done_var; done_var = SubLObjectFactory.makeBoolean( NIL == valid ) )
      {
        thread.resetMultipleValues();
        final SubLObject constant_info = iteration.iteration_next( constant_info_iterator );
        valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid )
        {
          SubLObject current;
          final SubLObject datum = current = constant_info;
          SubLObject internal_id = NIL;
          SubLObject name3 = NIL;
          SubLObject external_id = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
          internal_id = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
          name3 = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
          external_id = current.first();
          current = current.rest();
          if( NIL == current )
          {
            final SubLObject constant3 = make_constant_shell( name3, T );
            if( internal_id.isInteger() )
            {
              constants_low.install_constant_internal_id( constant3, internal_id );
              if( NIL != hl_interface_infrastructure.hl_modify_localP() )
              {
                constants_low.install_constant_external_id( constant3, external_id );
                constant_completion_low.add_constant_to_completions( constant3, name3 );
              }
              deregister_invalid_constant_by_name( name3 );
              count = Numbers.add( count, ONE_INTEGER );
            }
            else
            {
              if( constant_suid( constant3 ).isInteger() )
              {
                reset_constant_suid( constant3, NIL );
              }
              register_invalid_constant_by_name( constant3, name3 );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list79 );
          }
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        hl_interface_infrastructure.destroy_hl_store_iterator( constant_info_iterator );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 15485L)
  public static SubLObject synchronize_constants_with_local_hl_store()
  {
    SubLObject name = NIL;
    SubLObject constant = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( $invalid_constants$.getGlobalValue() );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        name = Hashtables.getEntryKey( cdohash_entry );
        constant = Hashtables.getEntryValue( cdohash_entry );
        final SubLObject old_constant = constant_completion_low.constant_shell_from_name( name );
        if( NIL != constant_p( old_constant ) )
        {
          SubLObject current;
          final SubLObject datum = current = constants_low.constant_info( old_constant );
          SubLObject internal_id = NIL;
          SubLObject name_$17 = NIL;
          SubLObject external_id = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
          internal_id = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
          name_$17 = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
          external_id = current.first();
          current = current.rest();
          if( NIL == current )
          {
            constants_low.kb_remove_constant_internal( old_constant );
            constants_low.install_constant_internal_id( constant, internal_id );
            constants_low.install_constant_external_id( constant, external_id );
            constant_completion_low.add_constant_to_completions( constant, name_$17 );
            deregister_invalid_constant_by_name( name_$17 );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list79 );
          }
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 16171L)
  public static SubLObject make_constant_shell(final SubLObject name, SubLObject use_existingP)
  {
    if( use_existingP == UNPROVIDED )
    {
      use_existingP = NIL;
    }
    assert NIL != constant_completion_high.constant_name_spec_p( name ) : name;
    if( NIL != use_existingP && name.isString() )
    {
      SubLObject found = constant_completion_low.constant_shell_from_name( name );
      if( NIL != found )
      {
        return found;
      }
      found = find_invalid_constant( name );
      if( NIL != found )
      {
        return found;
      }
    }
    final SubLObject constant = make_constant_shell_internal( name, T );
    if( name.isString() )
    {
      register_invalid_constant_by_name( constant, name );
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 16844L)
  public static SubLObject make_constant_shell_internal(final SubLObject name, final SubLObject v_static)
  {
    SubLObject constant = NIL;
    constant = get_constant();
    _csetf_c_name( constant, name );
    return constant;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 17161L)
  public static SubLObject reader_make_constant_shell(final SubLObject constant_name)
  {
    return make_constant_shell( constant_name, T );
  }

  public static SubLObject reader_make_constant_shell(final String constant_name)
  {
    return reader_make_constant_shell( SubLObjectFactory.makeString( constant_name ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 17339L)
  public static SubLObject make_bogus_constant_shell(final SubLObject name)
  {
    assert NIL != Types.stringp( name ) : name;
    return make_constant_shell_internal( name, NIL );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 17632L)
  public static SubLObject create_sample_invalid_constant()
  {
    return make_constant_shell_internal( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 17789L)
  public static SubLObject partition_create_invalid_constant()
  {
    return make_constant_shell( $kw71$UNNAMED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 18017L)
  public static SubLObject free_all_constants()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject idx = do_constants_table();
    final SubLObject mess = $str81$Freeing_constants;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$18 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$18, $kw14$SKIP ) )
        {
          final SubLObject idx_$19 = idx_$18;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$19, $kw14$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$19 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject id;
            SubLObject constant;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              constant = Vectors.aref( vector_var, id );
              if( NIL == id_index.id_index_tombstone_p( constant ) || NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( constant ) )
                {
                  constant = $kw14$SKIP;
                }
                kb_indexing_datastructures.free_term_index( constant );
                free_constant( constant );
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$20 = idx_$18;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$20 ) || NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$20 );
            SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$20 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$20 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw14$SKIP ) ) ? NIL : $kw14$SKIP;
            while ( id2.numL( end_id ))
            {
              final SubLObject constant2 = Hashtables.gethash_without_values( id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) || NIL == id_index.id_index_tombstone_p( constant2 ) )
              {
                kb_indexing_datastructures.free_term_index( constant2 );
                free_constant( constant2 );
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              id2 = Numbers.add( id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    clear_constant_tables();
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 18221L)
  public static SubLObject constant_suid(final SubLObject constant)
  {
    assert NIL != constant_p( constant ) : constant;
    return c_suid( constant );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 18550L)
  public static SubLObject install_constant_suid(final SubLObject constant, final SubLObject suid)
  {
    assert NIL != constant_p( constant ) : constant;
    assert NIL != Types.integerp( suid ) : suid;
    if( !constant_suid( constant ).isInteger() )
    {
      register_constant_suid( constant, suid );
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 18937L)
  public static SubLObject reset_constant_suid(final SubLObject constant, final SubLObject new_suid)
  {
    _csetf_c_suid( constant, new_suid );
    return constant;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 19106L)
  public static SubLObject constant_handle_validP(final SubLObject constant)
  {
    return Types.integerp( constant_suid( constant ) );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 19582L)
  public static SubLObject find_constant_by_suid(final SubLObject suid)
  {
    assert NIL != Types.integerp( suid ) : suid;
    return lookup_constant_by_suid( suid );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 19930L)
  public static SubLObject setup_constant_tables(final SubLObject size, final SubLObject exactP)
  {
    constants_low.setup_constant_guid_table( size, exactP );
    setup_constant_suid_table( size, exactP );
    constant_index_manager.setup_constant_index_table( size, exactP );
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 20169L)
  public static SubLObject finalize_constants(SubLObject max_constant_suid)
  {
    if( max_constant_suid == UNPROVIDED )
    {
      max_constant_suid = NIL;
    }
    finalize_constant_suid_table( max_constant_suid );
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 20301L)
  public static SubLObject clear_constant_tables()
  {
    constants_low.clear_constant_guid_table();
    clear_constant_suid_table();
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 20416L)
  public static SubLObject rebuild_constant_completion_table()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject code_constants = constant_completion.constants_mentioned_in_code();
    constant_completion_low.clear_constant_completion_table();
    final SubLObject idx = do_constants_table();
    final SubLObject mess = $str83$Rebuilding_constant_completion_ta;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$22 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$22, $kw14$SKIP ) )
        {
          final SubLObject idx_$23 = idx_$22;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$23, $kw14$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$23 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject id;
            SubLObject constant;
            SubLObject name;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              constant = Vectors.aref( vector_var, id );
              if( NIL == id_index.id_index_tombstone_p( constant ) || NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( constant ) )
                {
                  constant = $kw14$SKIP;
                }
                if( NIL != valid_constantP( constant, UNPROVIDED ) )
                {
                  name = constants_high.constant_name( constant );
                  if( name.isString() )
                  {
                    constant_completion_low.add_constant_to_completions( constant, name );
                  }
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$24 = idx_$22;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$24 ) || NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$24 );
            SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$24 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$24 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw14$SKIP ) ) ? NIL : $kw14$SKIP;
            while ( id2.numL( end_id ))
            {
              final SubLObject constant2 = Hashtables.gethash_without_values( id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw14$SKIP ) || NIL == id_index.id_index_tombstone_p( constant2 ) )
              {
                if( NIL != valid_constantP( constant2, UNPROVIDED ) )
                {
                  final SubLObject name2 = constants_high.constant_name( constant2 );
                  if( name2.isString() )
                  {
                    constant_completion_low.add_constant_to_completions( constant2, name2 );
                  }
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              id2 = Numbers.add( id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$25, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    SubLObject cdolist_list_var = code_constants;
    SubLObject constant3 = NIL;
    constant3 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == valid_constantP( constant3, UNPROVIDED ) )
      {
        final SubLObject name3 = constants_high.constant_name( constant3 );
        if( name3.isString() )
        {
          constant_completion_low.add_constant_to_completions( constant3, name3 );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      constant3 = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-handles.lisp",
    position = 21148L)
  public static SubLObject remove_invalid_constants_from_completions()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject invalid_constants = NIL;
    final SubLObject iterator = constant_completion_high.new_constant_completion_iterator( T, UNPROVIDED );
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = SubLObjectFactory.makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject constant = iteration.iteration_next( iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid && NIL != invalid_constant_handleP( constant ) )
      {
        invalid_constants = ConsesLow.cons( constant, invalid_constants );
      }
    }
    iteration.iteration_finalize( iterator );
    SubLObject cdolist_list_var = invalid_constants;
    SubLObject constant2 = NIL;
    constant2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject name = constants_high.constant_name( constant2 );
      if( name.isString() )
      {
        constant_completion_low.remove_constant_from_completions( constant2, name );
        register_invalid_constant_by_name( constant2, name );
      }
      cdolist_list_var = cdolist_list_var.rest();
      constant2 = cdolist_list_var.first();
    }
    return Sequences.length( invalid_constants );
  }

  public static SubLObject declare_constant_handles_file()
  {
    SubLPackage.setCurrentPackage( "CYC" );
    SubLFiles.declareFunction( myName, "new_constants_iterator", "NEW-CONSTANTS-ITERATOR", 0, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.constant_handles", "do_constants", "DO-CONSTANTS" );
    SubLFiles.declareFunction( myName, "do_constants_table", "DO-CONSTANTS-TABLE", 0, 0, false );
    SubLFiles.declareFunction( myName, "map_constants", "MAP-CONSTANTS", 1, 0, false );
    SubLFiles.declareFunction( myName, "setup_constant_suid_table", "SETUP-CONSTANT-SUID-TABLE", 2, 0, false );
    SubLFiles.declareFunction( myName, "finalize_constant_suid_table", "FINALIZE-CONSTANT-SUID-TABLE", 0, 1, false );
    SubLFiles.declareFunction( myName, "clear_constant_suid_table", "CLEAR-CONSTANT-SUID-TABLE", 0, 0, false );
    SubLFiles.declareFunction( myName, "create_constant_dump_id_table", "CREATE-CONSTANT-DUMP-ID-TABLE", 0, 0, false );
    SubLFiles.declareFunction( myName, "new_dense_constant_id_index", "NEW-DENSE-CONSTANT-ID-INDEX", 0, 0, false );
    SubLFiles.declareFunction( myName, "constant_count", "CONSTANT-COUNT", 0, 0, false );
    SubLFiles.declareFunction( myName, "lookup_constant_by_suid", "LOOKUP-CONSTANT-BY-SUID", 1, 0, false );
    SubLFiles.declareFunction( myName, "next_constant_suid", "NEXT-CONSTANT-SUID", 0, 0, false );
    SubLFiles.declareFunction( myName, "new_constant_suid_threshold", "NEW-CONSTANT-SUID-THRESHOLD", 0, 0, false );
    SubLFiles.declareFunction( myName, "set_new_constant_suid_threshold", "SET-NEW-CONSTANT-SUID-THRESHOLD", 1, 0, false );
    SubLFiles.declareFunction( myName, "old_constant_count", "OLD-CONSTANT-COUNT", 0, 0, false );
    SubLFiles.declareFunction( myName, "new_constant_count", "NEW-CONSTANT-COUNT", 0, 0, false );
    SubLFiles.declareFunction( myName, "missing_old_constant_internal_ids", "MISSING-OLD-CONSTANT-INTERNAL-IDS", 0, 0, false );
    SubLFiles.declareFunction( myName, "missing_constant_id_set", "MISSING-CONSTANT-ID-SET", 0, 0, false );
    SubLFiles.declareFunction( myName, "deleted_constant_id_iterator", "DELETED-CONSTANT-ID-ITERATOR", 0, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.constant_handles", "do_deleted_constant_ids", "DO-DELETED-CONSTANT-IDS" );
    SubLFiles.declareFunction( myName, "has_new_constantsP", "HAS-NEW-CONSTANTS?", 0, 0, false );
    SubLFiles.declareFunction( myName, "set_next_constant_suid", "SET-NEXT-CONSTANT-SUID", 0, 1, false );
    SubLFiles.declareFunction( myName, "register_constant_suid", "REGISTER-CONSTANT-SUID", 2, 0, false );
    SubLFiles.declareFunction( myName, "deregister_constant_suid", "DEREGISTER-CONSTANT-SUID", 1, 0, false );
    SubLFiles.declareFunction( myName, "make_constant_suid", "MAKE-CONSTANT-SUID", 0, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.constant_handles", "do_old_constants", "DO-OLD-CONSTANTS" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.constant_handles", "do_new_constants", "DO-NEW-CONSTANTS" );
    SubLFiles.declareFunction( myName, "new_new_constants_iterator", "NEW-NEW-CONSTANTS-ITERATOR", 0, 0, false );
    SubLFiles.declareFunction( myName, "new_constants_table_entryP", "NEW-CONSTANTS-TABLE-ENTRY?", 2, 0, false );
    SubLFiles.declareFunction( myName, "constants_table_tuple_to_constant", "CONSTANTS-TABLE-TUPLE-TO-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( myName, "constant_print_function_trampoline", "CONSTANT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    new $constant_print_function_trampoline$BinaryFunction();
    SubLFiles.declareFunction( myName, "constant_p", "CONSTANT-P", 1, 0, false );
    new $constant_p$UnaryFunction();
    SubLFiles.declareFunction( myName, "c_suid", "C-SUID", 1, 0, false );
    SubLFiles.declareFunction( myName, "c_name", "C-NAME", 1, 0, false );
    SubLFiles.declareFunction( myName, "_csetf_c_suid", "_CSETF-C-SUID", 2, 0, false );
    SubLFiles.declareFunction( myName, "_csetf_c_name", "_CSETF-C-NAME", 2, 0, false );
    SubLFiles.declareFunction( myName, "make_constant", "MAKE-CONSTANT", 0, 1, false );
    SubLFiles.declareFunction( myName, "visit_defstruct_constant", "VISIT-DEFSTRUCT-CONSTANT", 2, 0, false );
    SubLFiles.declareFunction( myName, "visit_defstruct_object_constant_method", "VISIT-DEFSTRUCT-OBJECT-CONSTANT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( myName, "print_constant", "PRINT-CONSTANT", 3, 0, false );
    SubLFiles.declareFunction( myName, "sxhash_constant_method", "SXHASH-CONSTANT-METHOD", 1, 0, false );
    new $sxhash_constant_method$UnaryFunction();
    SubLFiles.declareFunction( myName, "get_constant", "GET-CONSTANT", 0, 0, false );
    SubLFiles.declareFunction( myName, "init_constant", "INIT-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( myName, "free_constant", "FREE-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( myName, "valid_constant_handleP", "VALID-CONSTANT-HANDLE?", 1, 0, false );
    SubLFiles.declareFunction( myName, "valid_constantP", "VALID-CONSTANT?", 1, 1, false );
    new $valid_constantP$UnaryFunction();
    new $valid_constantP$BinaryFunction();
    SubLFiles.declareFunction( myName, "valid_constant_robustP", "VALID-CONSTANT-ROBUST?", 1, 0, false );
    SubLFiles.declareFunction( myName, "valid_constant", "VALID-CONSTANT", 1, 1, false );
    SubLFiles.declareFunction( myName, "invalid_constant_handleP", "INVALID-CONSTANT-HANDLE?", 1, 0, false );
    SubLFiles.declareFunction( myName, "invalid_constantP", "INVALID-CONSTANT?", 1, 1, false );
    new $invalid_constantP$UnaryFunction();
    new $invalid_constantP$BinaryFunction();
    SubLFiles.declareFunction( myName, "invalid_constant_robustP", "INVALID-CONSTANT-ROBUST?", 1, 0, false );
    SubLFiles.declareFunction( myName, "invalid_constant_names", "INVALID-CONSTANT-NAMES", 0, 0, false );
    SubLFiles.declareFunction( myName, "clear_invalid_constants_table", "CLEAR-INVALID-CONSTANTS-TABLE", 0, 0, false );
    SubLFiles.declareFunction( myName, "find_invalid_constant", "FIND-INVALID-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( myName, "register_invalid_constant_by_name", "REGISTER-INVALID-CONSTANT-BY-NAME", 2, 0, false );
    SubLFiles.declareFunction( myName, "deregister_invalid_constant_by_name", "DEREGISTER-INVALID-CONSTANT-BY-NAME", 1, 0, false );
    SubLFiles.declareFunction( myName, "synchronize_constants_with_hl_store", "SYNCHRONIZE-CONSTANTS-WITH-HL-STORE", 0, 0, false );
    SubLFiles.declareFunction( myName, "synchronize_constants_with_remote_hl_store", "SYNCHRONIZE-CONSTANTS-WITH-REMOTE-HL-STORE", 0, 0, false );
    SubLFiles.declareFunction( myName, "synchronize_constants_with_local_hl_store", "SYNCHRONIZE-CONSTANTS-WITH-LOCAL-HL-STORE", 0, 0, false );
    SubLFiles.declareFunction( myName, "make_constant_shell", "MAKE-CONSTANT-SHELL", 1, 1, false );
    SubLFiles.declareFunction( myName, "make_constant_shell_internal", "MAKE-CONSTANT-SHELL-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( myName, "reader_make_constant_shell", "READER-MAKE-CONSTANT-SHELL", 1, 0, false );
    SubLFiles.declareFunction( myName, "make_bogus_constant_shell", "MAKE-BOGUS-CONSTANT-SHELL", 1, 0, false );
    SubLFiles.declareFunction( myName, "create_sample_invalid_constant", "CREATE-SAMPLE-INVALID-CONSTANT", 0, 0, false );
    SubLFiles.declareFunction( myName, "partition_create_invalid_constant", "PARTITION-CREATE-INVALID-CONSTANT", 0, 0, false );
    SubLFiles.declareFunction( myName, "free_all_constants", "FREE-ALL-CONSTANTS", 0, 0, false );
    SubLFiles.declareFunction( myName, "constant_suid", "CONSTANT-SUID", 1, 0, false );
    SubLFiles.declareFunction( myName, "install_constant_suid", "INSTALL-CONSTANT-SUID", 2, 0, false );
    SubLFiles.declareFunction( myName, "reset_constant_suid", "RESET-CONSTANT-SUID", 2, 0, false );
    SubLFiles.declareFunction( myName, "constant_handle_validP", "CONSTANT-HANDLE-VALID?", 1, 0, false );
    SubLFiles.declareFunction( myName, "find_constant_by_suid", "FIND-CONSTANT-BY-SUID", 1, 0, false );
    SubLFiles.declareFunction( myName, "setup_constant_tables", "SETUP-CONSTANT-TABLES", 2, 0, false );
    SubLFiles.declareFunction( myName, "finalize_constants", "FINALIZE-CONSTANTS", 0, 1, false );
    SubLFiles.declareFunction( myName, "clear_constant_tables", "CLEAR-CONSTANT-TABLES", 0, 0, false );
    SubLFiles.declareFunction( myName, "rebuild_constant_completion_table", "REBUILD-CONSTANT-COMPLETION-TABLE", 0, 0, false );
    SubLFiles.declareFunction( myName, "remove_invalid_constants_from_completions", "REMOVE-INVALID-CONSTANTS-FROM-COMPLETIONS", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_constant_handles_file()
  {
    $constant_from_suid$ = SubLFiles.deflexical( "*CONSTANT-FROM-SUID*", ( maybeDefault( $sym0$_CONSTANT_FROM_SUID_, $constant_from_suid$, NIL ) ) );
    $new_constant_suid_threshold$ = SubLFiles.deflexical( "*NEW-CONSTANT-SUID-THRESHOLD*", ( maybeDefault( $sym20$_NEW_CONSTANT_SUID_THRESHOLD_, $new_constant_suid_threshold$, NIL ) ) );
    $dtp_constant$ = SubLFiles.defconstant( "*DTP-CONSTANT*", $sym39$CONSTANT );
    $invalid_constants$ = SubLFiles.deflexical( "*INVALID-CONSTANTS*", maybeDefault( $sym75$_INVALID_CONSTANTS_, $invalid_constants$, () -> ( Hashtables.make_hash_table( $int76$4000, Symbols.symbol_function( EQUAL ),
        UNPROVIDED ) ) ) );
    return NIL;
  }

  public static SubLObject setup_constant_handles_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_CONSTANT_FROM_SUID_ );
    utilities_macros.register_cyc_api_macro( $sym10$DO_CONSTANTS, $list2, $str11$Iterate_over_all_HL_constant_data );
    access_macros.register_macro_helper( $sym12$DO_CONSTANTS_TABLE, $sym10$DO_CONSTANTS );
    access_macros.register_macro_helper( $sym15$CREATE_CONSTANT_DUMP_ID_TABLE, $sym16$WITH_CONSTANT_DUMP_ID_TABLE );
    utilities_macros.register_cyc_api_function( $sym17$CONSTANT_COUNT, NIL, $str18$Return_the_total_number_of_consta, NIL, $list19 );
    subl_macro_promotions.declare_defglobal( $sym20$_NEW_CONSTANT_SUID_THRESHOLD_ );
    utilities_macros.note_funcall_helper_function( $sym36$NEW_CONSTANTS_TABLE_ENTRY_ );
    utilities_macros.note_funcall_helper_function( $sym37$CONSTANTS_TABLE_TUPLE_TO_CONSTANT );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), Symbols.symbol_function( $sym47$CONSTANT_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list48 );
    Structures.def_csetf( $sym49$C_SUID, $sym50$_CSETF_C_SUID );
    Structures.def_csetf( $sym51$C_NAME, $sym52$_CSETF_C_NAME );
    Equality.identity( $sym39$CONSTANT );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), Symbols.symbol_function( $sym60$VISIT_DEFSTRUCT_OBJECT_CONSTANT_METHOD ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), Symbols.symbol_function( $sym64$SXHASH_CONSTANT_METHOD ) );
    utilities_macros.register_cyc_api_function( $sym40$CONSTANT_P, $list65, $str66$Return_T_iff_the_argument_is_a_Cy, NIL, $list67 );
    utilities_macros.register_cyc_api_function( $sym68$VALID_CONSTANT_, $list69, $str70$Return_T_if_CONSTANT_is_a_valid__, NIL, $list67 );
    utilities_macros.register_obsolete_cyc_api_function( $sym72$VALID_CONSTANT, $list73, $list69, $str74$Deprecated_in_favor_of_valid_cons, NIL, $list67 );
    subl_macro_promotions.declare_defglobal( $sym75$_INVALID_CONSTANTS_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_constant_handles_file();
  }

  @Override
  public void initializeVariables()
  {
    init_constant_handles_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_constant_handles_file();
  }
  static
  {
    me = new constant_handles();
    $constant_from_suid$ = null;
    $new_constant_suid_threshold$ = null;
    $dtp_constant$ = null;
    $invalid_constants$ = null;
    $sym0$_CONSTANT_FROM_SUID_ = SubLObjectFactory.makeSymbol( "*CONSTANT-FROM-SUID*" );
    $sym1$SECOND = SubLObjectFactory.makeSymbol( "SECOND" );
    $list2 = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "VAR" ), SubLObjectFactory.makeSymbol( "&OPTIONAL" ), ConsesLow.list( SubLObjectFactory.makeSymbol( "PROGRESS-MESSAGE" ), SubLObjectFactory
        .makeString( "mapping Cyc constants" ) ), SubLObjectFactory.makeSymbol( "&KEY" ), SubLObjectFactory.makeSymbol( "DONE" ) ), SubLObjectFactory.makeSymbol( "&BODY" ), SubLObjectFactory.makeSymbol( "BODY" ) );
    $str3$mapping_Cyc_constants = SubLObjectFactory.makeString( "mapping Cyc constants" );
    $list4 = ConsesLow.list( SubLObjectFactory.makeKeyword( "DONE" ) );
    $kw5$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw6$DONE = SubLObjectFactory.makeKeyword( "DONE" );
    $sym7$DO_KB_SUID_TABLE = SubLObjectFactory.makeSymbol( "DO-KB-SUID-TABLE" );
    $list8 = ConsesLow.list( SubLObjectFactory.makeSymbol( "DO-CONSTANTS-TABLE" ) );
    $kw9$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword( "PROGRESS-MESSAGE" );
    $sym10$DO_CONSTANTS = SubLObjectFactory.makeSymbol( "DO-CONSTANTS" );
    $str11$Iterate_over_all_HL_constant_data = SubLObjectFactory.makeString(
        "Iterate over all HL constant datastructures, executing BODY within the scope of VAR.\n   VAR is bound to each constant in turn.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts early as soon as DONE becomes non-nil." );
    $sym12$DO_CONSTANTS_TABLE = SubLObjectFactory.makeSymbol( "DO-CONSTANTS-TABLE" );
    $sym13$STRINGP = SubLObjectFactory.makeSymbol( "STRINGP" );
    $kw14$SKIP = SubLObjectFactory.makeKeyword( "SKIP" );
    $sym15$CREATE_CONSTANT_DUMP_ID_TABLE = SubLObjectFactory.makeSymbol( "CREATE-CONSTANT-DUMP-ID-TABLE" );
    $sym16$WITH_CONSTANT_DUMP_ID_TABLE = SubLObjectFactory.makeSymbol( "WITH-CONSTANT-DUMP-ID-TABLE" );
    $sym17$CONSTANT_COUNT = SubLObjectFactory.makeSymbol( "CONSTANT-COUNT" );
    $str18$Return_the_total_number_of_consta = SubLObjectFactory.makeString( "Return the total number of constants." );
    $list19 = ConsesLow.list( SubLObjectFactory.makeSymbol( "INTEGERP" ) );
    $sym20$_NEW_CONSTANT_SUID_THRESHOLD_ = SubLObjectFactory.makeSymbol( "*NEW-CONSTANT-SUID-THRESHOLD*" );
    $kw21$DENSE = SubLObjectFactory.makeKeyword( "DENSE" );
    $kw22$ALL = SubLObjectFactory.makeKeyword( "ALL" );
    $list23 = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "ID" ), SubLObjectFactory.makeSymbol( "&KEY" ), SubLObjectFactory.makeSymbol( "DONE" ) ), SubLObjectFactory.makeSymbol( "&BODY" ),
        SubLObjectFactory.makeSymbol( "BODY" ) );
    $sym24$ITERATOR = SubLObjectFactory.makeUninternedSymbol( "ITERATOR" );
    $sym25$CLET = SubLObjectFactory.makeSymbol( "CLET" );
    $list26 = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "DELETED-CONSTANT-ID-ITERATOR" ) ) );
    $sym27$DO_ITERATOR = SubLObjectFactory.makeSymbol( "DO-ITERATOR" );
    $str28$Determining_maximum_constant_SUID = SubLObjectFactory.makeString( "Determining maximum constant SUID" );
    $list29 = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "CONSTANT" ), SubLObjectFactory.makeSymbol( "&KEY" ), SubLObjectFactory.makeSymbol( "PROGRESS-MESSAGE" ), SubLObjectFactory.makeSymbol(
        "DONE" ) ), SubLObjectFactory.makeSymbol( "&BODY" ), SubLObjectFactory.makeSymbol( "BODY" ) );
    $list30 = ConsesLow.list( SubLObjectFactory.makeKeyword( "PROGRESS-MESSAGE" ), SubLObjectFactory.makeKeyword( "DONE" ) );
    $sym31$THRESHOLD = SubLObjectFactory.makeUninternedSymbol( "THRESHOLD" );
    $list32 = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "NEW-CONSTANT-SUID-THRESHOLD" ) ) );
    $sym33$DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID = SubLObjectFactory.makeSymbol( "DO-KB-SUID-TABLE-UPTO-EXCLUDING-ID" );
    $sym34$START = SubLObjectFactory.makeUninternedSymbol( "START" );
    $sym35$DO_KB_SUID_TABLE_STARTING_AT_ID = SubLObjectFactory.makeSymbol( "DO-KB-SUID-TABLE-STARTING-AT-ID" );
    $sym36$NEW_CONSTANTS_TABLE_ENTRY_ = SubLObjectFactory.makeSymbol( "NEW-CONSTANTS-TABLE-ENTRY?" );
    $sym37$CONSTANTS_TABLE_TUPLE_TO_CONSTANT = SubLObjectFactory.makeSymbol( "CONSTANTS-TABLE-TUPLE-TO-CONSTANT" );
    $list38 = ConsesLow.list( SubLObjectFactory.makeSymbol( "ID" ), SubLObjectFactory.makeSymbol( "PAYLOAD" ) );
    $sym39$CONSTANT = SubLObjectFactory.makeSymbol( "CONSTANT" );
    $sym40$CONSTANT_P = SubLObjectFactory.makeSymbol( "CONSTANT-P" );
    $int41$140 = SubLObjectFactory.makeInteger( 140 );
    $list42 = ConsesLow.list( SubLObjectFactory.makeSymbol( "SUID" ), SubLObjectFactory.makeSymbol( "NAME" ) );
    $list43 = ConsesLow.list( SubLObjectFactory.makeKeyword( "SUID" ), SubLObjectFactory.makeKeyword( "NAME" ) );
    $list44 = ConsesLow.list( SubLObjectFactory.makeSymbol( "C-SUID" ), SubLObjectFactory.makeSymbol( "C-NAME" ) );
    $list45 = ConsesLow.list( SubLObjectFactory.makeSymbol( "_CSETF-C-SUID" ), SubLObjectFactory.makeSymbol( "_CSETF-C-NAME" ) );
    $sym46$PRINT_CONSTANT = SubLObjectFactory.makeSymbol( "PRINT-CONSTANT" );
    $sym47$CONSTANT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol( "CONSTANT-PRINT-FUNCTION-TRAMPOLINE" );
    $list48 = ConsesLow.list( SubLObjectFactory.makeSymbol( "OPTIMIZE-FUNCALL" ), SubLObjectFactory.makeSymbol( "CONSTANT-P" ) );
    $sym49$C_SUID = SubLObjectFactory.makeSymbol( "C-SUID" );
    $sym50$_CSETF_C_SUID = SubLObjectFactory.makeSymbol( "_CSETF-C-SUID" );
    $sym51$C_NAME = SubLObjectFactory.makeSymbol( "C-NAME" );
    $sym52$_CSETF_C_NAME = SubLObjectFactory.makeSymbol( "_CSETF-C-NAME" );
    $kw53$SUID = SubLObjectFactory.makeKeyword( "SUID" );
    $kw54$NAME = SubLObjectFactory.makeKeyword( "NAME" );
    $str55$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString( "Invalid slot ~S for construction function" );
    $kw56$BEGIN = SubLObjectFactory.makeKeyword( "BEGIN" );
    $sym57$MAKE_CONSTANT = SubLObjectFactory.makeSymbol( "MAKE-CONSTANT" );
    $kw58$SLOT = SubLObjectFactory.makeKeyword( "SLOT" );
    $kw59$END = SubLObjectFactory.makeKeyword( "END" );
    $sym60$VISIT_DEFSTRUCT_OBJECT_CONSTANT_METHOD = SubLObjectFactory.makeSymbol( "VISIT-DEFSTRUCT-OBJECT-CONSTANT-METHOD" );
    $str61$___a = SubLObjectFactory.makeString( "#$~a" );
    $str62$_The_CFASL_invalid_constant_ = SubLObjectFactory.makeString( "<The CFASL invalid constant>" );
    $str63$_Constant__a_ = SubLObjectFactory.makeString( "<Constant ~a>" );
    $sym64$SXHASH_CONSTANT_METHOD = SubLObjectFactory.makeSymbol( "SXHASH-CONSTANT-METHOD" );
    $list65 = ConsesLow.list( SubLObjectFactory.makeSymbol( "OBJECT" ) );
    $str66$Return_T_iff_the_argument_is_a_Cy = SubLObjectFactory.makeString( "Return T iff the argument is a CycL constant" );
    $list67 = ConsesLow.list( SubLObjectFactory.makeSymbol( "BOOLEANP" ) );
    $sym68$VALID_CONSTANT_ = SubLObjectFactory.makeSymbol( "VALID-CONSTANT?" );
    $list69 = ConsesLow.list( SubLObjectFactory.makeSymbol( "CONSTANT" ), SubLObjectFactory.makeSymbol( "&OPTIONAL" ), SubLObjectFactory.makeSymbol( "ROBUST" ) );
    $str70$Return_T_if_CONSTANT_is_a_valid__ = SubLObjectFactory.makeString( "Return T if CONSTANT is a valid, fully-formed constant." );
    $kw71$UNNAMED = SubLObjectFactory.makeKeyword( "UNNAMED" );
    $sym72$VALID_CONSTANT = SubLObjectFactory.makeSymbol( "VALID-CONSTANT" );
    $list73 = ConsesLow.list( SubLObjectFactory.makeSymbol( "VALID-CONSTANT?" ) );
    $str74$Deprecated_in_favor_of_valid_cons = SubLObjectFactory.makeString( "Deprecated in favor of valid-constant?\n   Return T if CONSTANT is a valid constant." );
    $sym75$_INVALID_CONSTANTS_ = SubLObjectFactory.makeSymbol( "*INVALID-CONSTANTS*" );
    $int76$4000 = SubLObjectFactory.makeInteger( 4000 );
    $str77$clearing_local_constant_informati = SubLObjectFactory.makeString( "clearing local constant information" );
    $int78$50000 = SubLObjectFactory.makeInteger( 50000 );
    $list79 = ConsesLow.list( SubLObjectFactory.makeSymbol( "INTERNAL-ID" ), SubLObjectFactory.makeSymbol( "NAME" ), SubLObjectFactory.makeSymbol( "EXTERNAL-ID" ) );
    $sym80$CONSTANT_NAME_SPEC_P = SubLObjectFactory.makeSymbol( "CONSTANT-NAME-SPEC-P" );
    $str81$Freeing_constants = SubLObjectFactory.makeString( "Freeing constants" );
    $sym82$INTEGERP = SubLObjectFactory.makeSymbol( "INTEGERP" );
    $str83$Rebuilding_constant_completion_ta = SubLObjectFactory.makeString( "Rebuilding constant completion table" );
  }

  static public final class $constant_native extends SubLStructNative
  {
    public SubLObject $suid;
    public SubLObject $name;
    private static final SubLStructDeclNative structDecl;

    public $constant_native()
    {
      this.$suid = CommonSymbols.NIL;
      this.$name = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $constant_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$suid;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$name;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$suid = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$name = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $constant_native.class, $sym39$CONSTANT, $sym40$CONSTANT_P, $list42, $list43, new String[] { "$suid", "$name"
      }, $list44, $list45, $sym46$PRINT_CONSTANT );
      structDecl.setTrackStructInstance( true, -1 );
    }
  }

  public static final class $constant_print_function_trampoline$BinaryFunction extends BinaryFunction
  {
    public $constant_print_function_trampoline$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CONSTANT-PRINT-FUNCTION-TRAMPOLINE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return constant_print_function_trampoline( arg1, arg2 );
    }
  }

  public static final class $constant_p$UnaryFunction extends UnaryFunction
  {
    public $constant_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CONSTANT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return constant_p( arg1 );
    }
  }

  public static final class $sxhash_constant_method$UnaryFunction extends UnaryFunction
  {
    public $sxhash_constant_method$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SXHASH-CONSTANT-METHOD" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sxhash_constant_method( arg1 );
    }
  }

  public static final class $valid_constantP$UnaryFunction extends UnaryFunction
  {
    public $valid_constantP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "VALID-CONSTANT?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return valid_constantP( arg1, $valid_constantP$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $valid_constantP$BinaryFunction extends BinaryFunction
  {
    public $valid_constantP$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "VALID-CONSTANT?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return valid_constantP( arg1, arg2 );
    }
  }

  public static final class $invalid_constantP$UnaryFunction extends UnaryFunction
  {
    public $invalid_constantP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INVALID-CONSTANT?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return invalid_constantP( arg1, $invalid_constantP$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $invalid_constantP$BinaryFunction extends BinaryFunction
  {
    public $invalid_constantP$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INVALID-CONSTANT?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return invalid_constantP( arg1, arg2 );
    }
  }
}
