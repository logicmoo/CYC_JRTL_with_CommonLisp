package com.cyc.cycjava.cycl.sksi.sksi_widgets;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.cycjava.cycl.accumulation;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class poise
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_widgets.poise";
  public static final String myFingerPrint = "f7ce2ba6422ab3f302c532e17a491660dce17c6629fc10ec09d4465e50d604a0";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/lisp", position = 1533L)
  public static SubLSymbol $poise_normalization_schematic$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/lisp", position = 1734L)
  public static SubLSymbol $poise_normalization_columndef$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/lisp", position = 1872L)
  public static SubLSymbol $poise_normalization_cellrange$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/lisp", position = 2746L)
  private static SubLSymbol $poise_normalization_name_kbq$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/lisp", position = 3170L)
  private static SubLSymbol $poise_normalization_data_kbq$;
  private static final SubLString $str0$schemata;
  private static final SubLSymbol $kw1$DBMS_SERVER;
  private static final SubLSymbol $kw2$DBMS_PORT;
  private static final SubLInteger $int3$1527;
  private static final SubLSymbol $kw4$SUBPROTOCOL;
  private static final SubLString $str5$poiseschema;
  private static final SubLString $str6$_;
  private static final SubLList $list7;
  private static final SubLString $str8$schematic;
  private static final SubLString $str9$columndef;
  private static final SubLString $str10$cellrange;
  private static final SubLSymbol $sym11$FORT_P;
  private static final SubLObject $const12$DreamcatcherNormalizationNameKBQ;
  private static final SubLObject $const13$DreamcatcherNormalizationDataKBQ;
  private static final SubLString $str14$Overriding_KBQ_MT_is_currently_no;
  private static final SubLSymbol $kw15$MV;
  private static final SubLString $str16$The_puported_Mapping_View__A_desc;
  private static final SubLSymbol $sym17$_;
  private static final SubLSymbol $sym18$FIRST;
  private static final SubLString $str19$DELETE_FROM_;
  private static final SubLString $str20$_WHERE_SCHEMA_ID___;
  private static final SubLString $str21$_WHERE_id___;
  private static final SubLString $str22$SELECT_id_FROM_;
  private static final SubLString $str23$_WHERE_name____;
  private static final SubLString $str24$_;
  private static final SubLString $str25$INSERT_INTO_;
  private static final SubLString $str26$__NAME__VALUES___;
  private static final SubLString $str27$__;
  private static final SubLString $str28$Failed_to_update__A_with_schema_n;
  private static final SubLSymbol $sym29$POISE_COLUMN_DESCRIPTION_COLUMN_INDEX;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLSymbol $kw32$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw33$COLUMN_NAME;
  private static final SubLSymbol $kw34$COLUMN_TYPE;
  private static final SubLSymbol $kw35$COLUMN_INDEX;
  private static final SubLString $str36$insert_into_ColumnDef__schema_id_;
  private static final SubLString $str37$__;
  private static final SubLString $str38$___;
  private static final SubLString $str39$____;
  private static final SubLList $list40;
  private static final SubLString $str41$insert_into_CellRange__schema_id_;
  private static final SubLString $str42$_;
  private static final SubLSymbol $sym43$_COL;
  private static final SubLSymbol $sym44$_TRRSTART;
  private static final SubLSymbol $sym45$_TRREND;
  private static final SubLSymbol $sym46$_PHYFIELDNAME;
  private static final SubLSymbol $sym47$_COLTYPE;
  private static final SubLInteger $int48$26;
  private static final SubLSymbol $sym49$POISE_COLUMN_INDEX_FROM_SPREADSHEET_NAME;
  private static final SubLSymbol $kw50$TEST;
  private static final SubLSymbol $kw51$OWNER;
  private static final SubLSymbol $kw52$CLASSES;
  private static final SubLSymbol $kw53$KB;
  private static final SubLSymbol $kw54$TINY;
  private static final SubLSymbol $kw55$WORKING_;
  private static final SubLList $list56;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/lisp", position = 839L)
  public static SubLObject connect_to_poise_schemata()
  {
    return sdbc.new_sql_connection( $str0$schemata, NIL, NIL, ConsesLow.list( $kw1$DBMS_SERVER, sdbc.$dbms_server$.getGlobalValue(), $kw2$DBMS_PORT, $int3$1527, $kw4$SUBPROTOCOL, $str5$poiseschema ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/lisp", position = 1126L)
  public static SubLObject connect_to_excel_file_sheet(final SubLObject excel_file, final SubLObject normalization)
  {
    return sdbc.new_sql_connection( Sequences.cconcatenate( excel_file, new SubLObject[] { $str6$_, normalization
    } ), NIL, NIL, $list7 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/lisp", position = 2013L)
  public static SubLObject create_poise_normalization_schema(final SubLObject schema_name, final SubLObject description, SubLObject desc_mt)
  {
    if( desc_mt == UNPROVIDED )
    {
      desc_mt = NIL;
    }
    enforceType( description, $sym11$FORT_P );
    final SubLObject normalization = compile_poise_normalization_from_description( description, desc_mt );
    SubLObject v_psc = NIL;
    try
    {
      v_psc = connect_to_poise_schemata();
      possibly_remove_old_poise_schema( v_psc, schema_name );
      store_poise_normalization_schema( v_psc, schema_name, normalization );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != sdbc.sql_connection_p( v_psc ) )
        {
          sdbc.sqlc_close( v_psc );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return schema_name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/lisp", position = 3317L)
  public static SubLObject compile_poise_normalization_from_description(final SubLObject mapping_view, SubLObject desc_mt)
  {
    if( desc_mt == UNPROVIDED )
    {
      desc_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != desc_mt )
    {
      Errors.error( $str14$Overriding_KBQ_MT_is_currently_no );
    }
    final SubLObject binding_sets = kb_query.new_cyc_query_from_kbq( $poise_normalization_data_kbq$.getGlobalValue(), NIL, ConsesLow.list( ConsesLow.cons( $kw15$MV, mapping_view ) ) );
    if( NIL == binding_sets )
    {
      Errors.error( $str16$The_puported_Mapping_View__A_desc, mapping_view, desc_mt );
    }
    return extract_poise_data_from_binding_sets( binding_sets );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/lisp", position = 3866L)
  public static SubLObject extract_poise_data_from_binding_sets(final SubLObject binding_sets)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject col_map = dictionary.new_dictionary( EQUAL, UNPROVIDED );
    final SubLObject col_ranges = dictionary.new_dictionary( EQUALP, UNPROVIDED );
    SubLObject cdolist_list_var = binding_sets;
    SubLObject binding_set = NIL;
    binding_set = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject col_description = extract_poise_data_from_binding_set( binding_set, col_map );
      final SubLObject row_range = thread.secondMultipleValue();
      thread.resetMultipleValues();
      map_utilities.map_push( col_ranges, col_description, row_range );
      cdolist_list_var = cdolist_list_var.rest();
      binding_set = cdolist_list_var.first();
    }
    cdolist_list_var = map_utilities.map_keys( col_ranges );
    SubLObject col_description2 = NIL;
    col_description2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject row_range2 = map_utilities.map_get( col_ranges, col_description2, UNPROVIDED );
      map_utilities.map_put( col_ranges, col_description2, Sort.sort( row_range2, $sym17$_, $sym18$FIRST ) );
      cdolist_list_var = cdolist_list_var.rest();
      col_description2 = cdolist_list_var.first();
    }
    return col_ranges;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/lisp", position = 4559L)
  public static SubLObject possibly_remove_old_poise_schema(final SubLObject v_psc, final SubLObject schema_name)
  {
    final SubLObject pss = sdbc.sqlc_create_statement( v_psc );
    final SubLObject id = get_poise_schema_id( pss, schema_name );
    if( id.isNumber() )
    {
      SubLObject cdolist_list_var = ConsesLow.list( $poise_normalization_cellrange$.getGlobalValue(), $poise_normalization_columndef$.getGlobalValue() );
      SubLObject table_name = NIL;
      table_name = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        sdbc.sqls_execute_update( pss, Sequences.cconcatenate( $str19$DELETE_FROM_, new SubLObject[] { format_nil.format_nil_a_no_copy( table_name ), $str20$_WHERE_SCHEMA_ID___, format_nil.format_nil_a_no_copy( id )
        } ) );
        cdolist_list_var = cdolist_list_var.rest();
        table_name = cdolist_list_var.first();
      }
      sdbc.sqls_execute_update( pss, Sequences.cconcatenate( $str19$DELETE_FROM_, new SubLObject[] { format_nil.format_nil_a_no_copy( $poise_normalization_schematic$.getGlobalValue() ), $str21$_WHERE_id___, format_nil
          .format_nil_a_no_copy( id )
      } ) );
    }
    return v_psc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/lisp", position = 5172L)
  public static SubLObject get_poise_schema_id(final SubLObject pss, final SubLObject schema_name)
  {
    final SubLObject psrs = sdbc.sqls_execute_query( pss, Sequences.cconcatenate( $str22$SELECT_id_FROM_, new SubLObject[] { format_nil.format_nil_a_no_copy( $poise_normalization_schematic$.getGlobalValue() ),
      $str23$_WHERE_name____, format_nil.format_nil_a_no_copy( schema_name ), $str24$_
    } ), UNPROVIDED );
    if( NIL == sdbc.sqlrs_emptyP( psrs ) )
    {
      sdbc.sqlrs_next( psrs );
      final SubLObject id = sdbc.sqlrs_get_object( psrs, ONE_INTEGER );
      return id;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/lisp", position = 5595L)
  public static SubLObject store_poise_normalization_schema(final SubLObject v_psc, final SubLObject schema_name, final SubLObject normalization)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pss = sdbc.sqlc_create_statement( v_psc );
    SubLObject schema_id = NIL;
    SubLObject sql_cmds = NIL;
    sdbc.sqls_execute_update( pss, Sequences.cconcatenate( $str25$INSERT_INTO_, new SubLObject[] { format_nil.format_nil_a_no_copy( $poise_normalization_schematic$.getGlobalValue() ), $str26$__NAME__VALUES___, format_nil
        .format_nil_a_no_copy( schema_name ), $str27$__
    } ) );
    schema_id = get_poise_schema_id( pss, schema_name );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !schema_id.isNumber() )
    {
      Errors.error( $str28$Failed_to_update__A_with_schema_n, $poise_normalization_schematic$.getGlobalValue(), schema_name );
    }
    sql_cmds = generate_sql_from_poise_schematic_description( schema_id, normalization, UNPROVIDED );
    SubLObject cdolist_list_var = accumulation.accumulation_contents( sql_cmds, UNPROVIDED );
    SubLObject sql_cmd = NIL;
    sql_cmd = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sdbc.sqls_execute_update( pss, sql_cmd );
      cdolist_list_var = cdolist_list_var.rest();
      sql_cmd = cdolist_list_var.first();
    }
    return v_psc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/lisp", position = 6390L)
  public static SubLObject generate_sql_from_poise_schematic_description(final SubLObject schema_id, final SubLObject col_ranges, SubLObject sql_acc)
  {
    if( sql_acc == UNPROVIDED )
    {
      sql_acc = accumulation.new_list_accumulator( UNPROVIDED );
    }
    SubLObject grid_x = ZERO_INTEGER;
    SubLObject list_var = NIL;
    SubLObject col_description = NIL;
    SubLObject col_id = NIL;
    list_var = Sort.sort( map_utilities.map_keys( col_ranges ), $sym17$_, $sym29$POISE_COLUMN_DESCRIPTION_COLUMN_INDEX );
    col_description = list_var.first();
    for( col_id = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), col_description = list_var.first(), col_id = Numbers.add( ONE_INTEGER, col_id ) )
    {
      final SubLObject row_ranges = map_utilities.map_get( col_ranges, col_description, UNPROVIDED );
      final SubLObject current;
      final SubLObject datum = current = col_description;
      SubLObject allow_other_keys_p = NIL;
      SubLObject rest = current;
      SubLObject bad = NIL;
      SubLObject current_$1 = NIL;
      while ( NIL != rest)
      {
        cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list30 );
        current_$1 = rest.first();
        rest = rest.rest();
        cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list30 );
        if( NIL == conses_high.member( current_$1, $list31, UNPROVIDED, UNPROVIDED ) )
        {
          bad = T;
        }
        if( current_$1 == $kw32$ALLOW_OTHER_KEYS )
        {
          allow_other_keys_p = rest.first();
        }
        rest = rest.rest();
      }
      if( NIL != bad && NIL == allow_other_keys_p )
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list30 );
      }
      final SubLObject column_name_tail = cdestructuring_bind.property_list_member( $kw33$COLUMN_NAME, current );
      final SubLObject column_name = ( NIL != column_name_tail ) ? conses_high.cadr( column_name_tail ) : NIL;
      final SubLObject column_type_tail = cdestructuring_bind.property_list_member( $kw34$COLUMN_TYPE, current );
      final SubLObject column_type = ( NIL != column_type_tail ) ? conses_high.cadr( column_type_tail ) : NIL;
      final SubLObject column_index_tail = cdestructuring_bind.property_list_member( $kw35$COLUMN_INDEX, current );
      final SubLObject column_index = ( NIL != column_index_tail ) ? conses_high.cadr( column_index_tail ) : NIL;
      accumulation.accumulation_add( sql_acc, Sequences.cconcatenate( $str36$insert_into_ColumnDef__schema_id_, new SubLObject[] { format_nil.format_nil_a_no_copy( schema_id ), $str37$__, format_nil.format_nil_a_no_copy(
          col_id ), $str38$___, format_nil.format_nil_a_no_copy( column_name ), $str39$____, format_nil.format_nil_a_no_copy( column_type ), $str27$__
      } ) );
      SubLObject list_var_$2 = NIL;
      SubLObject row_range = NIL;
      SubLObject grid_y = NIL;
      list_var_$2 = row_ranges;
      row_range = list_var_$2.first();
      for( grid_y = ZERO_INTEGER; NIL != list_var_$2; list_var_$2 = list_var_$2.rest(), row_range = list_var_$2.first(), grid_y = Numbers.add( ONE_INTEGER, grid_y ) )
      {
        SubLObject current_$2;
        final SubLObject datum_$3 = current_$2 = row_range;
        SubLObject row_start = NIL;
        SubLObject row_end = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$2, datum_$3, $list40 );
        row_start = current_$2.first();
        current_$2 = ( row_end = current_$2.rest() );
        final SubLObject adjusted_row_start = Numbers.subtract( row_start, ONE_INTEGER );
        final SubLObject adjusted_row_end = Numbers.subtract( row_end, ONE_INTEGER );
        accumulation.accumulation_add( sql_acc, Sequences.cconcatenate( $str41$insert_into_CellRange__schema_id_, new SubLObject[] { format_nil.format_nil_a_no_copy( schema_id ), $str37$__, format_nil
            .format_nil_a_no_copy( grid_x ), $str37$__, format_nil.format_nil_a_no_copy( grid_y ), $str37$__, format_nil.format_nil_a_no_copy( column_index ), $str37$__, format_nil.format_nil_a_no_copy(
                adjusted_row_start ), $str37$__, format_nil.format_nil_a_no_copy( column_index ), $str37$__, format_nil.format_nil_a_no_copy( adjusted_row_end ), $str42$_
        } ) );
      }
      grid_x = Numbers.add( grid_x, ONE_INTEGER );
    }
    return sql_acc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/lisp", position = 7740L)
  public static SubLObject poise_column_description_column_index(final SubLObject col_description)
  {
    return conses_high.getf( col_description, $kw35$COLUMN_INDEX, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/lisp", position = 7851L)
  public static SubLObject extract_poise_data_from_binding_set(final SubLObject binding_set, final SubLObject column_map)
  {
    final SubLObject col = list_utilities.alist_lookup( binding_set, $sym43$_COL, UNPROVIDED, UNPROVIDED );
    final SubLObject rowstart = list_utilities.alist_lookup( binding_set, $sym44$_TRRSTART, UNPROVIDED, UNPROVIDED );
    final SubLObject rowend = list_utilities.alist_lookup( binding_set, $sym45$_TRREND, UNPROVIDED, UNPROVIDED );
    final SubLObject field = list_utilities.alist_lookup( binding_set, $sym46$_PHYFIELDNAME, UNPROVIDED, UNPROVIDED );
    final SubLObject coltype = list_utilities.alist_lookup( binding_set, $sym47$_COLTYPE, UNPROVIDED, UNPROVIDED );
    SubLObject col_description = map_utilities.map_get( column_map, field, UNPROVIDED );
    if( NIL == col_description )
    {
      final SubLObject index = poise_column_index_from_spreadsheet_name( col );
      col_description = ConsesLow.list( $kw33$COLUMN_NAME, field, $kw34$COLUMN_TYPE, coltype, $kw35$COLUMN_INDEX, index );
      map_utilities.map_put( column_map, field, col_description );
    }
    return Values.values( col_description, ConsesLow.cons( rowstart, rowend ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/lisp", position = 8687L)
  public static SubLObject poise_column_index_from_spreadsheet_name(final SubLObject name)
  {
    SubLObject index = ZERO_INTEGER;
    SubLObject end_var_$5;
    SubLObject end_var;
    SubLObject char_num;
    SubLObject curr;
    for( end_var = ( end_var_$5 = Sequences.length( name ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$5 ); char_num = number_utilities.f_1X( char_num ) )
    {
      curr = Strings.sublisp_char( name, char_num );
      index = Numbers.add( Numbers.multiply( index, $int48$26 ), Numbers.add( ONE_INTEGER, Numbers.subtract( Characters.char_code( curr ), Characters.char_code( Characters.CHAR_A ) ) ) );
    }
    return Numbers.subtract( index, ONE_INTEGER );
  }

  public static SubLObject declare_poise_file()
  {
    SubLFiles.declareFunction( me, "connect_to_poise_schemata", "CONNECT-TO-POISE-SCHEMATA", 0, 0, false );
    SubLFiles.declareFunction( me, "connect_to_excel_file_sheet", "CONNECT-TO-EXCEL-FILE-SHEET", 2, 0, false );
    SubLFiles.declareFunction( me, "create_poise_normalization_schema", "CREATE-POISE-NORMALIZATION-SCHEMA", 2, 1, false );
    SubLFiles.declareFunction( me, "compile_poise_normalization_from_description", "COMPILE-POISE-NORMALIZATION-FROM-DESCRIPTION", 1, 1, false );
    SubLFiles.declareFunction( me, "extract_poise_data_from_binding_sets", "EXTRACT-POISE-DATA-FROM-BINDING-SETS", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_remove_old_poise_schema", "POSSIBLY-REMOVE-OLD-POISE-SCHEMA", 2, 0, false );
    SubLFiles.declareFunction( me, "get_poise_schema_id", "GET-POISE-SCHEMA-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "store_poise_normalization_schema", "STORE-POISE-NORMALIZATION-SCHEMA", 3, 0, false );
    SubLFiles.declareFunction( me, "generate_sql_from_poise_schematic_description", "GENERATE-SQL-FROM-POISE-SCHEMATIC-DESCRIPTION", 2, 1, false );
    SubLFiles.declareFunction( me, "poise_column_description_column_index", "POISE-COLUMN-DESCRIPTION-COLUMN-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_poise_data_from_binding_set", "EXTRACT-POISE-DATA-FROM-BINDING-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "poise_column_index_from_spreadsheet_name", "POISE-COLUMN-INDEX-FROM-SPREADSHEET-NAME", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_poise_file()
  {
    $poise_normalization_schematic$ = SubLFiles.deflexical( "*POISE-NORMALIZATION-SCHEMATIC*", $str8$schematic );
    $poise_normalization_columndef$ = SubLFiles.deflexical( "*POISE-NORMALIZATION-COLUMNDEF*", $str9$columndef );
    $poise_normalization_cellrange$ = SubLFiles.deflexical( "*POISE-NORMALIZATION-CELLRANGE*", $str10$cellrange );
    $poise_normalization_name_kbq$ = SubLFiles.deflexical( "*POISE-NORMALIZATION-NAME-KBQ*", $const12$DreamcatcherNormalizationNameKBQ );
    $poise_normalization_data_kbq$ = SubLFiles.deflexical( "*POISE-NORMALIZATION-DATA-KBQ*", $const13$DreamcatcherNormalizationDataKBQ );
    return NIL;
  }

  public static SubLObject setup_poise_file()
  {
    generic_testing.define_test_case_table_int( $sym49$POISE_COLUMN_INDEX_FROM_SPREADSHEET_NAME, ConsesLow.list( new SubLObject[] { $kw50$TEST, EQL, $kw51$OWNER, NIL, $kw52$CLASSES, NIL, $kw53$KB, $kw54$TINY,
      $kw55$WORKING_, T
    } ), $list56 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_poise_file();
  }

  @Override
  public void initializeVariables()
  {
    init_poise_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_poise_file();
  }
  static
  {
    me = new poise();
    $poise_normalization_schematic$ = null;
    $poise_normalization_columndef$ = null;
    $poise_normalization_cellrange$ = null;
    $poise_normalization_name_kbq$ = null;
    $poise_normalization_data_kbq$ = null;
    $str0$schemata = makeString( "schemata" );
    $kw1$DBMS_SERVER = makeKeyword( "DBMS-SERVER" );
    $kw2$DBMS_PORT = makeKeyword( "DBMS-PORT" );
    $int3$1527 = makeInteger( 1527 );
    $kw4$SUBPROTOCOL = makeKeyword( "SUBPROTOCOL" );
    $str5$poiseschema = makeString( "poiseschema" );
    $str6$_ = makeString( "!" );
    $list7 = ConsesLow.list( makeKeyword( "DBMS-SERVER" ), makeSymbol( "*DBMS-SERVER*" ), makeKeyword( "DBMS-PORT" ), makeInteger( 1527 ), makeKeyword( "SUBPROTOCOL" ), makeString( "poisedata" ) );
    $str8$schematic = makeString( "schematic" );
    $str9$columndef = makeString( "columndef" );
    $str10$cellrange = makeString( "cellrange" );
    $sym11$FORT_P = makeSymbol( "FORT-P" );
    $const12$DreamcatcherNormalizationNameKBQ = constant_handles.reader_make_constant_shell( makeString( "DreamcatcherNormalizationNameKBQ" ) );
    $const13$DreamcatcherNormalizationDataKBQ = constant_handles.reader_make_constant_shell( makeString( "DreamcatcherNormalizationDataKBQ" ) );
    $str14$Overriding_KBQ_MT_is_currently_no = makeString( "Overriding KBQ MT is currently not supported.~%" );
    $kw15$MV = makeKeyword( "MV" );
    $str16$The_puported_Mapping_View__A_desc = makeString( "The puported Mapping View ~A describes no normalization view in MT ~A." );
    $sym17$_ = makeSymbol( "<" );
    $sym18$FIRST = makeSymbol( "FIRST" );
    $str19$DELETE_FROM_ = makeString( "DELETE FROM " );
    $str20$_WHERE_SCHEMA_ID___ = makeString( " WHERE SCHEMA_ID = " );
    $str21$_WHERE_id___ = makeString( " WHERE id = " );
    $str22$SELECT_id_FROM_ = makeString( "SELECT id FROM " );
    $str23$_WHERE_name____ = makeString( " WHERE name = '" );
    $str24$_ = makeString( "'" );
    $str25$INSERT_INTO_ = makeString( "INSERT INTO " );
    $str26$__NAME__VALUES___ = makeString( " (NAME) VALUES ('" );
    $str27$__ = makeString( "')" );
    $str28$Failed_to_update__A_with_schema_n = makeString( "Failed to update ~A with schema named ~A; old schema in the way?" );
    $sym29$POISE_COLUMN_DESCRIPTION_COLUMN_INDEX = makeSymbol( "POISE-COLUMN-DESCRIPTION-COLUMN-INDEX" );
    $list30 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "COLUMN-NAME" ), makeSymbol( "COLUMN-TYPE" ), makeSymbol( "COLUMN-INDEX" ) );
    $list31 = ConsesLow.list( makeKeyword( "COLUMN-NAME" ), makeKeyword( "COLUMN-TYPE" ), makeKeyword( "COLUMN-INDEX" ) );
    $kw32$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw33$COLUMN_NAME = makeKeyword( "COLUMN-NAME" );
    $kw34$COLUMN_TYPE = makeKeyword( "COLUMN-TYPE" );
    $kw35$COLUMN_INDEX = makeKeyword( "COLUMN-INDEX" );
    $str36$insert_into_ColumnDef__schema_id_ = makeString( "insert into ColumnDef (schema_id, colpos, colname, coltype) VALUES (" );
    $str37$__ = makeString( ", " );
    $str38$___ = makeString( ", '" );
    $str39$____ = makeString( "', '" );
    $list40 = ConsesLow.cons( makeSymbol( "ROW-START" ), makeSymbol( "ROW-END" ) );
    $str41$insert_into_CellRange__schema_id_ = makeString( "insert into CellRange (schema_id, grid_x, grid_y, start_col, start_row, end_col, end_row) VALUES ( " );
    $str42$_ = makeString( ")" );
    $sym43$_COL = makeSymbol( "?COL" );
    $sym44$_TRRSTART = makeSymbol( "?TRRSTART" );
    $sym45$_TRREND = makeSymbol( "?TRREND" );
    $sym46$_PHYFIELDNAME = makeSymbol( "?PHYFIELDNAME" );
    $sym47$_COLTYPE = makeSymbol( "?COLTYPE" );
    $int48$26 = makeInteger( 26 );
    $sym49$POISE_COLUMN_INDEX_FROM_SPREADSHEET_NAME = makeSymbol( "POISE-COLUMN-INDEX-FROM-SPREADSHEET-NAME" );
    $kw50$TEST = makeKeyword( "TEST" );
    $kw51$OWNER = makeKeyword( "OWNER" );
    $kw52$CLASSES = makeKeyword( "CLASSES" );
    $kw53$KB = makeKeyword( "KB" );
    $kw54$TINY = makeKeyword( "TINY" );
    $kw55$WORKING_ = makeKeyword( "WORKING?" );
    $list56 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "A" ) ), ZERO_INTEGER ), ConsesLow.list( ConsesLow.list( makeString( "B" ) ), ONE_INTEGER ), ConsesLow.list( ConsesLow.list( makeString( "Z" ) ),
        makeInteger( 25 ) ), ConsesLow.list( ConsesLow.list( makeString( "AA" ) ), makeInteger( 26 ) ) );
  }
}
/*
 * 
 * Total time: 138 ms
 * 
 */