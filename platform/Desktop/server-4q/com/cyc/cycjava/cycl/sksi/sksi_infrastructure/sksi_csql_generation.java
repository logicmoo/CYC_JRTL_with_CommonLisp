package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_csql_generation
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_generation";
  public static final String myFingerPrint = "beb3439ad36abf4a1ae8c213b4b286213186d6859938f38b2d1c05851bcf6d69";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 30908L)
  public static SubLSymbol $csql_default_db_equals$;
  private static final SubLSymbol $sym0$INTEGERP;
  private static final SubLSymbol $kw1$SELECT;
  private static final SubLSymbol $kw2$FROM;
  private static final SubLSymbol $kw3$WHERE;
  private static final SubLSymbol $kw4$LIMIT;
  private static final SubLList $list5;
  private static final SubLSymbol $kw6$RAW;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$INDEXICAL_FOR_PHYSICAL_FIELD;
  private static final SubLSymbol $sym9$KBEQ;
  private static final SubLObject $const10$sqlAppendedToTableAtImport;
  private static final SubLSymbol $kw11$TRUE;
  private static final SubLString $str12$__SKSI__A_;
  private static final SubLString $str13$_sksi_determine_csql_for_incremen;
  private static final SubLSymbol $kw14$INSERT;
  private static final SubLString $str15$In_sksi_determine_csql_for_increm;
  private static final SubLSymbol $kw16$DELETE;
  private static final SubLSymbol $kw17$AUTO_INCREMENT_DEFAULT;
  private static final SubLSymbol $kw18$NEXT_VALUE;
  private static final SubLString $str19$In_sksi_determine_csql_for_increm;
  private static final SubLString $str20$In_sksi_determine_csql_for_increm;
  private static final SubLSymbol $kw21$BATCH;
  private static final SubLSymbol $kw22$NO_VALUE;
  private static final SubLList $list23;
  private static final SubLSymbol $kw24$INTO;
  private static final SubLSymbol $kw25$VALUES;
  private static final SubLSymbol $kw26$UPDATE;
  private static final SubLSymbol $kw27$SET;
  private static final SubLString $str28$Unknown_modification_operator__a_;
  private static final SubLObject $const29$CSQLStrictlyEquals;
  private static final SubLString $str30$TestLanguageSpoken_DB;
  private static final SubLObject $const31$Database_Physical;
  private static final SubLObject $const32$FileHashTable_File;
  private static final SubLObject $const33$WebPage_AIS;
  private static final SubLObject $const34$RDFTripleStore_Physical;
  private static final SubLString $str35$time_to_support_SELECT_for__S;
  private static final SubLSymbol $sym36$FIRST;
  private static final SubLSymbol $kw37$KEY;
  private static final SubLSymbol $kw38$KEY_VALUE;
  private static final SubLSymbol $sym39$SECOND;
  private static final SubLList $list40;
  private static final SubLSymbol $kw41$TABLE;
  private static final SubLObject $const42$CSQLEquals;
  private static final SubLString $str43$time_to_support_WHERE__S;
  private static final SubLObject $const44$StringObject;
  private static final SubLSymbol $kw45$VALUE;
  private static final SubLString $str46$time_to_support_ORDER_BY_for__S;
  private static final SubLSymbol $kw47$ORDER_BY;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 1242L)
  public static SubLObject sksi_determine_output_csql(final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject sk_source, final SubLObject input_termnums,
      final SubLObject output_termnums, final SubLObject input_physical_field_indexicals, final SubLObject eval_conditions, SubLObject canonicalizeP, SubLObject limit_count)
  {
    if( canonicalizeP == UNPROVIDED )
    {
      canonicalizeP = NIL;
    }
    if( limit_count == UNPROVIDED )
    {
      limit_count = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != limit_count && !assertionsDisabledInClass && NIL == Types.integerp( limit_count ) )
    {
      throw new AssertionError( limit_count );
    }
    final SubLObject output_logical_field_indexicals = sksi_removal_module_generation.sksi_referenced_logical_field_indexicals( sentence, output_termnums );
    final SubLObject output_physical_field_indexicals = sksi_infrastructure_utilities.sksi_determine_relevant_physical_field_indexicals( output_logical_field_indexicals, logical_schemata, physical_schemata );
    final SubLObject fixed_physical_field_indexicals = sksi_infrastructure_utilities.sksi_determine_fixed_physical_field_indexicals( logical_schemata, physical_schemata );
    thread.resetMultipleValues();
    final SubLObject csql_field_select = sksi_determine_csql_field_select( sk_source, logical_schemata, physical_schemata, output_physical_field_indexicals, eval_conditions );
    SubLObject table_alias_list = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject csql_actual_field_select = sksi_interpret_csql_field_select( csql_field_select );
    SubLObject csql_where_clause = NIL;
    thread.resetMultipleValues();
    final SubLObject csql_where_clause_$1 = sksi_determine_csql_where_clause( sk_source, sentence, logical_schemata, physical_schemata, input_physical_field_indexicals, fixed_physical_field_indexicals, table_alias_list,
        eval_conditions );
    final SubLObject table_alias_list_$2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    csql_where_clause = csql_where_clause_$1;
    table_alias_list = table_alias_list_$2;
    final SubLObject csql_table_select = sksi_determine_csql_table_select( table_alias_list );
    if( NIL == csql_actual_field_select || NIL == csql_table_select )
    {
      return NIL;
    }
    final SubLObject csql = ( NIL != limit_count ) ? ( ( NIL != csql_where_clause ) ? ConsesLow.list( $kw1$SELECT, csql_actual_field_select, ConsesLow.list( $kw2$FROM, csql_table_select ), ConsesLow.list( $kw3$WHERE,
        csql_where_clause ), ConsesLow.list( $kw4$LIMIT, limit_count ) )
        : ConsesLow.list( $kw1$SELECT, csql_actual_field_select, ConsesLow.list( $kw2$FROM, csql_table_select ), ConsesLow.list( $kw4$LIMIT, limit_count ) ) )
        : ( ( NIL != csql_where_clause ) ? ConsesLow.list( $kw1$SELECT, csql_actual_field_select, ConsesLow.list( $kw2$FROM, csql_table_select ), ConsesLow.list( $kw3$WHERE, csql_where_clause ) )
            : ConsesLow.list( $kw1$SELECT, csql_actual_field_select, ConsesLow.list( $kw2$FROM, csql_table_select ) ) );
    if( NIL != canonicalizeP )
    {
      return sksi_csql_utilities.canonicalize_csql( csql, UNPROVIDED, UNPROVIDED );
    }
    return csql;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 3591L)
  public static SubLObject sksi_interpret_csql_field_select(final SubLObject csql_field_select)
  {
    return ( NIL != csql_field_select ) ? csql_field_select : $list5;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 3878L)
  public static SubLObject sksi_make_boolean_csql_query(final SubLObject from, final SubLObject where)
  {
    final SubLObject csql = ConsesLow.list( $kw1$SELECT, $list5, ConsesLow.list( $kw2$FROM, from ), ConsesLow.list( $kw3$WHERE, where ) );
    return csql;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 4039L)
  public static SubLObject sksi_determine_csql_for_batch_translate(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject physical_field_indexicals)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject csql_field_select = sksi_determine_csql_field_select_for_batch_translate( sk_source, physical_schema, physical_field_indexicals );
    final SubLObject table_alias_list = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject csql_table_select = sksi_determine_csql_table_select( table_alias_list );
    final SubLObject csql_order_by = sksi_determine_csql_order_by_for_batch_translate( sk_source, physical_schema, physical_field_indexicals );
    final SubLObject additional_sql = sksi_additional_sql_for_batch_translate( sk_source );
    if( NIL != csql_field_select && NIL != csql_table_select )
    {
      final SubLObject csql = ConsesLow.listS( $kw1$SELECT, csql_field_select, ConsesLow.list( $kw2$FROM, csql_table_select ), ConsesLow.append( ( NIL != additional_sql ) ? ConsesLow.list( ConsesLow.list( $kw3$WHERE,
          ConsesLow.list( ConsesLow.list( $kw6$RAW, additional_sql ) ) ) ) : ( ( NIL != csql_order_by ) ? $list7 : NIL ), ( NIL != csql_order_by ) ? ConsesLow.list( csql_order_by ) : NIL, NIL ) );
      return csql;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 5163L)
  public static SubLObject sksi_determine_csql_field_select_for_batch_translate(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject output_physical_field_indexicals)
  {
    return sksi_determine_csql_field_select( sk_source, NIL, ConsesLow.list( physical_schema ), output_physical_field_indexicals, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 5409L)
  public static SubLObject sksi_determine_csql_order_by_for_batch_translate(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject physical_field_indexicals)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != sksi_batch_translate.$sksi_batch_sql_order_by_primary_keyP$.getDynamicValue( thread ) )
    {
      final SubLObject pk_list = sksi_kb_accessors.physical_schema_primary_key_compensate_for_table_column_representation( physical_schema );
      final SubLObject pki_list = Mapping.mapcar( $sym8$INDEXICAL_FOR_PHYSICAL_FIELD, pk_list );
      if( NIL != pki_list && NIL != conses_high.subsetp( pki_list, physical_field_indexicals, $sym9$KBEQ, UNPROVIDED ) )
      {
        return sksi_determine_csql_order_by( sk_source, NIL, ConsesLow.list( physical_schema ), pki_list );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 5932L)
  public static SubLObject sksi_additional_sql_for_batch_translate(final SubLObject sk_source)
  {
    final SubLObject sql = kb_mapping_utilities.fpred_value( sk_source, $const10$sqlAppendedToTableAtImport, ONE_INTEGER, TWO_INTEGER, $kw11$TRUE );
    if( sql.isString() )
    {
      return sql;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 6126L)
  public static SubLObject sksi_determine_csql_for_incremental_edit(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject physical_fields, final SubLObject raw_tuple, final SubLObject operator,
      final SubLObject csql_conditions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP( NINE_INTEGER ) )
    {
      PrintLow.format( sksi_debugging.$sksi_trace_stream$.getDynamicValue( thread ), Sequences.cconcatenate( $str12$__SKSI__A_, $str13$_sksi_determine_csql_for_incremen ), new SubLObject[] { NINE_INTEGER, sk_source,
        physical_schema, physical_fields, raw_tuple, operator, csql_conditions
      } );
      streams_high.force_output( sksi_debugging.$sksi_trace_stream$.getDynamicValue( thread ) );
    }
    final SubLObject primary_key = sksi_kb_accessors.physical_schema_primary_key( physical_schema );
    SubLObject primary_key_value = NIL;
    thread.resetMultipleValues();
    SubLObject mod_physical_fields = remove_no_value_field_values_and_corresponding_fields( physical_fields, raw_tuple );
    SubLObject mod_raw_tuple = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( operator == $kw14$INSERT )
    {
      final SubLObject non_null_fields = sksi_kb_accessors.not_null_physical_fields_for_ps( physical_schema, UNPROVIDED );
      final SubLObject non_primary_key_non_null_fields = list_utilities.fast_set_difference( non_null_fields, primary_key, UNPROVIDED );
      SubLObject failP = NIL;
      if( NIL == failP )
      {
        SubLObject csome_list_var = non_primary_key_non_null_fields;
        SubLObject non_null_field = NIL;
        non_null_field = csome_list_var.first();
        while ( NIL == failP && NIL != csome_list_var)
        {
          if( !Sequences.position( non_null_field, mod_physical_fields, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ).isInteger() && NIL != sksi_kb_accessors.null_default_physical_field_valueP( non_null_field,
              physical_schema ) )
          {
            if( NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP( NINE_INTEGER ) )
            {
              PrintLow.format( sksi_debugging.$sksi_trace_stream$.getDynamicValue( thread ), Sequences.cconcatenate( $str12$__SKSI__A_, $str15$In_sksi_determine_csql_for_increm ), NINE_INTEGER, non_null_field );
              streams_high.force_output( sksi_debugging.$sksi_trace_stream$.getDynamicValue( thread ) );
            }
            failP = T;
          }
          csome_list_var = csome_list_var.rest();
          non_null_field = csome_list_var.first();
        }
      }
      if( NIL != failP )
      {
        return Values.values( NIL, NIL );
      }
    }
    if( NIL == primary_key )
    {
      return Values.values( sksi_determine_csql_for_incremental_edit_int( sk_source, physical_schema, mod_physical_fields, mod_raw_tuple, operator, csql_conditions ), NIL );
    }
    SubLObject seq_pkey = NIL;
    SubLObject failP2 = NIL;
    if( NIL == failP2 )
    {
      SubLObject csome_list_var2 = primary_key;
      SubLObject pkey_element = NIL;
      pkey_element = csome_list_var2.first();
      while ( NIL == failP2 && NIL != csome_list_var2)
      {
        final SubLObject pkey_pos = Sequences.position( pkey_element, mod_physical_fields, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( pkey_pos.isInteger() )
        {
          primary_key_value = ConsesLow.cons( ConsesLow.nth( pkey_pos, mod_raw_tuple ), primary_key_value );
        }
        else
        {
          final SubLObject sequence = sksi_kb_accessors.integer_sequence_generator_for_physical_field( pkey_element );
          if( NIL != sequence )
          {
            if( operator != $kw16$DELETE )
            {
              if( NIL != sksi_kb_accessors.physical_field_value_is_auto_incrementedP( pkey_element, physical_schema ) )
              {
                mod_raw_tuple = ConsesLow.cons( $kw17$AUTO_INCREMENT_DEFAULT, mod_raw_tuple );
              }
              else
              {
                final SubLObject seq_name = sksi_kb_accessors.integer_sequence_generator_name( sequence );
                if( seq_name.isString() )
                {
                  mod_raw_tuple = ConsesLow.cons( ConsesLow.list( $kw18$NEXT_VALUE, seq_name ), mod_raw_tuple );
                }
                else
                {
                  if( NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP( NINE_INTEGER ) )
                  {
                    PrintLow.format( sksi_debugging.$sksi_trace_stream$.getDynamicValue( thread ), Sequences.cconcatenate( $str12$__SKSI__A_, $str19$In_sksi_determine_csql_for_increm ), new SubLObject[] { NINE_INTEGER,
                      pkey_element, physical_schema, sksi_kb_accessors.physical_field_value_is_auto_incrementedP( pkey_element, physical_schema )
                    } );
                    streams_high.force_output( sksi_debugging.$sksi_trace_stream$.getDynamicValue( thread ) );
                  }
                  failP2 = T;
                }
              }
              if( NIL == failP2 )
              {
                mod_physical_fields = ConsesLow.cons( pkey_element, mod_physical_fields );
              }
            }
            if( NIL == failP2 )
            {
              seq_pkey = ConsesLow.cons( sksi_kb_accessors.physical_field_name( pkey_element ), seq_pkey );
            }
          }
          else
          {
            if( NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP( NINE_INTEGER ) )
            {
              PrintLow.format( sksi_debugging.$sksi_trace_stream$.getDynamicValue( thread ), Sequences.cconcatenate( $str12$__SKSI__A_, $str20$In_sksi_determine_csql_for_increm ), new SubLObject[] { NINE_INTEGER,
                pkey_element, sksi_kb_accessors.integer_sequence_generator_for_physical_field( pkey_element )
              } );
              streams_high.force_output( sksi_debugging.$sksi_trace_stream$.getDynamicValue( thread ) );
            }
            failP2 = T;
          }
        }
        csome_list_var2 = csome_list_var2.rest();
        pkey_element = csome_list_var2.first();
      }
    }
    if( NIL != failP2 )
    {
      return Values.values( NIL, NIL );
    }
    if( NIL != seq_pkey )
    {
      return Values.values( sksi_determine_csql_for_incremental_edit_int( sk_source, physical_schema, mod_physical_fields, mod_raw_tuple, operator, csql_conditions ), Sequences.nreverse( seq_pkey ) );
    }
    primary_key_value = Sequences.nreverse( primary_key_value );
    if( operator == $kw16$DELETE && NIL != list_utilities.sets_equalP( primary_key, mod_physical_fields, UNPROVIDED ) )
    {
      return Values.values( sksi_determine_csql_for_incremental_edit_int( sk_source, physical_schema, mod_physical_fields, mod_raw_tuple, operator, csql_conditions ), NIL );
    }
    if( operator == $kw16$DELETE )
    {
      thread.resetMultipleValues();
      final SubLObject csql_field_select = sksi_determine_csql_field_select_for_incremental_edit( sk_source, physical_schema, sksi_kb_accessors.indexicals_for_physical_fields( physical_fields ) );
      final SubLObject table_alias_list = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject csql_table_select = sksi_determine_csql_table_select( table_alias_list );
      final SubLObject csql_where_clause = sksi_determine_csql_where_clause_for_incremental_edit( mod_physical_fields, mod_raw_tuple, csql_conditions );
      return Values.values( sksi_determine_csql_for_incremental_update( physical_schema, primary_key, mod_physical_fields, mod_raw_tuple, operator, csql_table_select, csql_where_clause, NIL ), NIL );
    }
    thread.resetMultipleValues();
    final SubLObject current_tuple = sksi_get_row_from_table( sk_source, physical_schema, physical_fields, primary_key, primary_key_value, NIL );
    final SubLObject csql_field_select2 = thread.secondMultipleValue();
    final SubLObject csql_table_select = thread.thirdMultipleValue();
    final SubLObject csql_where_clause = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    if( NIL == csql_field_select2 || NIL == csql_table_select || NIL == csql_where_clause )
    {
      return Values.values( NIL, NIL );
    }
    if( NIL != current_tuple )
    {
      return Values.values( sksi_determine_csql_for_incremental_update( physical_schema, primary_key, mod_physical_fields, mod_raw_tuple, operator, csql_table_select, csql_where_clause, csql_conditions ), NIL );
    }
    return Values.values( sksi_determine_csql_for_incremental_edit_int( sk_source, physical_schema, mod_physical_fields, mod_raw_tuple, operator, csql_conditions ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 13076L)
  public static SubLObject sksi_get_row_from_table(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject physical_fields, final SubLObject bound_fields, final SubLObject bound_field_values,
      final SubLObject csql_conditions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject csql_field_select = sksi_determine_csql_field_select_for_incremental_edit( sk_source, physical_schema, sksi_kb_accessors.indexicals_for_physical_fields( physical_fields ) );
    final SubLObject table_alias_list = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject csql_table_select = sksi_determine_csql_table_select( table_alias_list );
    final SubLObject csql_where_clause = sksi_determine_csql_where_clause_for_incremental_edit( bound_fields, bound_field_values, csql_conditions );
    if( NIL == csql_field_select || NIL == csql_table_select || NIL == csql_where_clause )
    {
      return Values.values( NIL, NIL, NIL );
    }
    final SubLObject access_path = sksi_access_path.external_source_access_path( sk_source, physical_schema, UNPROVIDED );
    final SubLObject query_csql = ConsesLow.list( $kw1$SELECT, csql_field_select, ConsesLow.list( $kw2$FROM, csql_table_select ), ConsesLow.list( $kw3$WHERE, csql_where_clause ) );
    final SubLObject result_set = sksi_sks_interaction.generate_sdbc_result_set_from_csql( query_csql, access_path, $kw21$BATCH );
    SubLObject current_tuple = NIL;
    if( NIL != sdbc.sql_result_set_p( result_set ) )
    {
      sdbc.sqlrs_next( result_set );
      current_tuple = sksi_result_set_iterators.sqlrs_current_row_as_list( result_set );
      sksi_result_set_iterators.finalize_result_set( result_set );
      return Values.values( current_tuple, csql_field_select, csql_table_select, csql_where_clause );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 14474L)
  public static SubLObject sksi_find_primary_key_value_for_raw_tuple(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject physical_fields, final SubLObject raw_tuple,
      final SubLObject csql_conditions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject mod_physical_fields = remove_no_value_field_values_and_corresponding_fields( physical_fields, raw_tuple );
    final SubLObject mod_raw_tuple = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject current_tuple = sksi_get_row_from_table( sk_source, physical_schema, physical_fields, mod_physical_fields, mod_raw_tuple, csql_conditions );
    if( NIL != current_tuple )
    {
      final SubLObject primary_key = sksi_kb_accessors.physical_schema_primary_key( physical_schema );
      SubLObject primary_key_value = NIL;
      SubLObject cdolist_list_var = primary_key;
      SubLObject pkey_field = NIL;
      pkey_field = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject pkey_value = ConsesLow.nth( Sequences.position( pkey_field, physical_fields, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), current_tuple );
        primary_key_value = ConsesLow.cons( ConsesLow.list( pkey_field, pkey_value ), primary_key_value );
        cdolist_list_var = cdolist_list_var.rest();
        pkey_field = cdolist_list_var.first();
      }
      return Values.values( Sequences.nreverse( primary_key_value ), list_utilities.sublisp_boolean( current_tuple ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 15392L)
  public static SubLObject remove_no_value_field_values_and_corresponding_fields(final SubLObject fields, final SubLObject field_values)
  {
    SubLObject new_fields = NIL;
    SubLObject new_field_values = NIL;
    SubLObject field = NIL;
    SubLObject field_$3 = NIL;
    SubLObject field_value = NIL;
    SubLObject field_value_$4 = NIL;
    field = fields;
    field_$3 = field.first();
    field_value = field_values;
    field_value_$4 = field_value.first();
    while ( NIL != field_value || NIL != field)
    {
      if( field_value_$4 != $kw22$NO_VALUE )
      {
        new_fields = ConsesLow.cons( field_$3, new_fields );
        new_field_values = ConsesLow.cons( field_value_$4, new_field_values );
      }
      field = field.rest();
      field_$3 = field.first();
      field_value = field_value.rest();
      field_value_$4 = field_value.first();
    }
    return Values.values( Sequences.nreverse( new_fields ), Sequences.nreverse( new_field_values ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 15781L)
  public static SubLObject sksi_determine_csql_for_incremental_edit_int(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject physical_fields, final SubLObject raw_tuple,
      final SubLObject operator, final SubLObject csql_conditions)
  {
    if( operator.eql( $kw14$INSERT ) )
    {
      return sksi_determine_csql_for_incremental_edit_insert( sk_source, physical_schema, physical_fields, raw_tuple, csql_conditions );
    }
    if( operator.eql( $kw16$DELETE ) )
    {
      return sksi_determine_csql_for_incremental_edit_delete( sk_source, physical_schema, physical_fields, raw_tuple, csql_conditions );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 16229L)
  public static SubLObject sksi_determine_csql_for_incremental_edit_delete(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject physical_fields, final SubLObject raw_tuple,
      final SubLObject csql_conditions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject where_clause = sksi_determine_csql_where_clause_for_incremental_edit( physical_fields, raw_tuple, csql_conditions );
    final SubLObject physical_field_indexicals = sksi_kb_accessors.indexicals_for_physical_fields( physical_fields );
    thread.resetMultipleValues();
    final SubLObject csql_field_select = sksi_determine_csql_field_select_for_incremental_edit( sk_source, physical_schema, physical_field_indexicals );
    final SubLObject table_alias_list = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject csql_table_select = sksi_determine_csql_table_select( table_alias_list );
    return ConsesLow.list( $kw16$DELETE, ConsesLow.list( $kw2$FROM, csql_table_select ), ConsesLow.list( $kw3$WHERE, where_clause ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 16945L)
  public static SubLObject simplify_raw_tuple_element(final SubLObject elem)
  {
    if( NIL != el_utilities.el_list_p( elem ) )
    {
      return el_utilities.el_list_items( elem ).first();
    }
    if( NIL != sksi_reformulate.disjunctive_reformulation_p( elem ) )
    {
      return sksi_reformulate.disjunctive_reformulation_reformulations( elem ).first();
    }
    return elem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 17373L)
  public static SubLObject sksi_determine_csql_for_incremental_edit_insert(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject physical_fields, final SubLObject raw_tuple,
      final SubLObject csql_conditions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject physical_field_indexicals = sksi_kb_accessors.indexicals_for_physical_fields( physical_fields );
    thread.resetMultipleValues();
    SubLObject csql_field_select = sksi_determine_csql_field_select_for_incremental_edit( sk_source, physical_schema, physical_field_indexicals );
    final SubLObject table_alias_list = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject csql_table_select = sksi_determine_csql_table_select( table_alias_list );
    if( NIL != csql_field_select && NIL != csql_table_select )
    {
      SubLObject new_raw_tuple = NIL;
      SubLObject cdolist_list_var = raw_tuple;
      SubLObject elem = NIL;
      elem = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        new_raw_tuple = ConsesLow.cons( simplify_raw_tuple_element( elem ), new_raw_tuple );
        cdolist_list_var = cdolist_list_var.rest();
        elem = cdolist_list_var.first();
      }
      new_raw_tuple = Sequences.nreverse( new_raw_tuple );
      cdolist_list_var = csql_conditions;
      SubLObject condition = NIL;
      condition = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = condition;
        SubLObject from_expression = NIL;
        SubLObject where_expressions = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
        from_expression = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
        where_expressions = current.first();
        current = current.rest();
        if( NIL == current )
        {
          SubLObject cdolist_list_var_$5 = where_expressions;
          SubLObject where_expression = NIL;
          where_expression = cdolist_list_var_$5.first();
          while ( NIL != cdolist_list_var_$5)
          {
            if( NIL != sksi_csql_utilities.csql_equal_clause_p( where_expression ) )
            {
              final SubLObject arg1 = sksi_csql_utilities.csql_expression_arg( where_expression, ONE_INTEGER );
              final SubLObject arg2 = sksi_csql_utilities.csql_expression_arg( where_expression, TWO_INTEGER );
              if( NIL != sksi_csql_utilities.csql_field_expression_p( arg1 ) && NIL == sksi_csql_utilities.csql_field_expression_p( arg2 ) )
              {
                if( NIL == list_utilities.member_equalP( arg1, csql_field_select ) )
                {
                  csql_field_select = ConsesLow.cons( arg1, csql_field_select );
                  new_raw_tuple = ConsesLow.cons( simplify_raw_tuple_element( arg2 ), new_raw_tuple );
                }
              }
              else if( NIL != sksi_csql_utilities.csql_field_expression_p( arg2 ) && NIL == sksi_csql_utilities.csql_field_expression_p( arg1 ) && NIL == list_utilities.member_equalP( arg2, csql_field_select ) )
              {
                csql_field_select = ConsesLow.cons( arg2, csql_field_select );
                new_raw_tuple = ConsesLow.cons( simplify_raw_tuple_element( arg1 ), new_raw_tuple );
              }
            }
            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
            where_expression = cdolist_list_var_$5.first();
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        condition = cdolist_list_var.first();
      }
      return ConsesLow.list( $kw14$INSERT, ConsesLow.list( $kw24$INTO, csql_table_select ), csql_field_select, ConsesLow.list( $kw25$VALUES, new_raw_tuple ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 19234L)
  public static SubLObject sksi_determine_csql_field_select_for_incremental_edit(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject output_physical_field_indexicals)
  {
    return sksi_determine_csql_field_select( sk_source, NIL, ConsesLow.list( physical_schema ), output_physical_field_indexicals, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 19481L)
  public static SubLObject sksi_determine_csql_where_clause_for_incremental_edit(final SubLObject physical_fields, final SubLObject values, final SubLObject csql_conditions)
  {
    SubLObject where_pairs = NIL;
    SubLObject pf = NIL;
    SubLObject pf_$6 = NIL;
    SubLObject pf_value = NIL;
    SubLObject pf_value_$7 = NIL;
    pf = physical_fields;
    pf_$6 = pf.first();
    pf_value = values;
    pf_value_$7 = pf_value.first();
    while ( NIL != pf_value || NIL != pf)
    {
      final SubLObject field_name = sksi_kb_accessors.physical_field_name( pf_$6 );
      final SubLObject table_name = sksi_kb_accessors.physical_field_sk_source_name( pf_$6 );
      final SubLObject table_namespace = sksi_kb_accessors.physical_field_sk_source_namespace( pf_$6 );
      final SubLObject field_csql = sksi_csql_utilities.construct_csql_field_expression( field_name, table_name, table_namespace );
      final SubLObject pair = sksi_csql_utilities.make_csql_expression( $csql_default_db_equals$.getGlobalValue(), ConsesLow.list( field_csql, pf_value_$7 ) );
      where_pairs = ConsesLow.cons( pair, where_pairs );
      pf = pf.rest();
      pf_$6 = pf.first();
      pf_value = pf_value.rest();
      pf_value_$7 = pf_value.first();
    }
    where_pairs = Sequences.nreverse( where_pairs );
    SubLObject cdolist_list_var = csql_conditions;
    SubLObject condition = NIL;
    condition = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = condition;
      SubLObject from_expression = NIL;
      SubLObject where_expressions = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
      from_expression = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
      where_expressions = current.first();
      current = current.rest();
      if( NIL == current )
      {
        where_pairs = ConsesLow.append( where_pairs, where_expressions );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      condition = cdolist_list_var.first();
    }
    return list_utilities.fast_delete_duplicates( where_pairs, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 20509L)
  public static SubLObject sksi_determine_csql_for_incremental_update(final SubLObject physical_schema, final SubLObject primary_key, final SubLObject mod_physical_fields, final SubLObject mod_raw_tuple,
      final SubLObject operator, final SubLObject csql_table_select, SubLObject csql_where_clause, final SubLObject csql_conditions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject rev_fields = remove_primary_key_fields_and_corresponding_values( primary_key, mod_physical_fields, mod_raw_tuple );
    final SubLObject rev_tuple = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == rev_fields )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = csql_conditions;
    SubLObject condition = NIL;
    condition = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = condition;
      SubLObject from_expression = NIL;
      SubLObject where_expressions = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
      from_expression = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
      where_expressions = current.first();
      current = current.rest();
      if( NIL == current )
      {
        csql_where_clause = ConsesLow.append( csql_where_clause, where_expressions );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      condition = cdolist_list_var.first();
    }
    if( operator.eql( $kw14$INSERT ) )
    {
      final SubLObject csql_set_clause = sksi_determine_csql_set_clause( rev_fields, rev_tuple );
      return ConsesLow.list( $kw26$UPDATE, csql_table_select, ConsesLow.list( $kw27$SET, csql_set_clause ), ConsesLow.list( $kw3$WHERE, csql_where_clause ) );
    }
    if( operator.eql( $kw16$DELETE ) )
    {
      SubLObject csql_set_clause = NIL;
      SubLObject default_field_values = NIL;
      SubLObject cdolist_list_var2 = rev_fields;
      SubLObject field = NIL;
      field = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        default_field_values = ConsesLow.cons( sksi_kb_accessors.physical_field_default_value( field, physical_schema, UNPROVIDED ), default_field_values );
        cdolist_list_var2 = cdolist_list_var2.rest();
        field = cdolist_list_var2.first();
      }
      default_field_values = Sequences.nreverse( default_field_values );
      csql_set_clause = sksi_determine_csql_set_clause( rev_fields, default_field_values );
      return ConsesLow.list( $kw26$UPDATE, csql_table_select, ConsesLow.list( $kw27$SET, csql_set_clause ), ConsesLow.list( $kw3$WHERE, csql_where_clause ) );
    }
    Errors.error( $str28$Unknown_modification_operator__a_, operator );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 22091L)
  public static SubLObject remove_primary_key_fields_and_corresponding_values(final SubLObject primary_key, final SubLObject physical_fields, final SubLObject raw_tuple)
  {
    SubLObject new_fields = conses_high.copy_list( physical_fields );
    SubLObject new_tuple = conses_high.copy_list( raw_tuple );
    SubLObject cdolist_list_var = primary_key;
    SubLObject pkey = NIL;
    pkey = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pos = Sequences.position( pkey, physical_fields, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      new_fields = list_utilities.delete_nth( pos, new_fields );
      new_tuple = list_utilities.delete_nth( pos, new_tuple );
      cdolist_list_var = cdolist_list_var.rest();
      pkey = cdolist_list_var.first();
    }
    return Values.values( new_fields, new_tuple );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 22508L)
  public static SubLObject sksi_determine_csql_set_clause(final SubLObject physical_fields, final SubLObject raw_tuple)
  {
    SubLObject set_pairs = NIL;
    SubLObject pf = NIL;
    SubLObject pf_$8 = NIL;
    SubLObject pf_value = NIL;
    SubLObject pf_value_$9 = NIL;
    pf = physical_fields;
    pf_$8 = pf.first();
    pf_value = raw_tuple;
    pf_value_$9 = pf_value.first();
    while ( NIL != pf_value || NIL != pf)
    {
      final SubLObject field_name = sksi_kb_accessors.physical_field_name( pf_$8 );
      final SubLObject table_name = sksi_kb_accessors.physical_field_sk_source_name( pf_$8 );
      final SubLObject namespace = sksi_kb_accessors.physical_field_sk_source_namespace( pf_$8 );
      final SubLObject pair = sksi_csql_utilities.make_csql_expression( $const29$CSQLStrictlyEquals, ConsesLow.list( sksi_csql_utilities.construct_csql_field_expression( field_name, table_name, namespace ),
          simplify_raw_tuple_element( pf_value_$9 ) ) );
      set_pairs = ConsesLow.cons( pair, set_pairs );
      pf = pf.rest();
      pf_$8 = pf.first();
      pf_value = pf_value.rest();
      pf_value_$9 = pf_value.first();
    }
    set_pairs = Sequences.nreverse( set_pairs );
    return set_pairs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 23128L)
  public static SubLObject sksi_determine_csql_field_select(final SubLObject sk_source, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject output_physical_field_indexicals,
      final SubLObject eval_conditions)
  {
    if( NIL != constant_handles.constant_p( sk_source ) && constants_high.constant_name( sk_source ).equal( $str30$TestLanguageSpoken_DB ) )
    {
      return sksi_determine_db_csql_field_select( sk_source, logical_schemata, physical_schemata, output_physical_field_indexicals, eval_conditions );
    }
    final SubLObject physical_schema = physical_schemata.first();
    final SubLObject pcase_var;
    final SubLObject type = pcase_var = sksi_access_path.determine_sks_type( sk_source, UNPROVIDED );
    if( pcase_var.eql( $const31$Database_Physical ) )
    {
      return sksi_determine_db_csql_field_select( sk_source, logical_schemata, physical_schemata, output_physical_field_indexicals, eval_conditions );
    }
    if( pcase_var.eql( $const32$FileHashTable_File ) )
    {
      return sksi_determine_fht_csql_field_select( physical_schema, output_physical_field_indexicals );
    }
    if( pcase_var.eql( $const33$WebPage_AIS ) )
    {
      return sksi_determine_web_csql_field_select( physical_schema, output_physical_field_indexicals );
    }
    if( pcase_var.eql( $const34$RDFTripleStore_Physical ) )
    {
      return sksi_determine_rdf_csql_field_select( sk_source, logical_schemata, physical_schemata, output_physical_field_indexicals, eval_conditions );
    }
    return Errors.error( $str35$time_to_support_SELECT_for__S, type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 24837L)
  public static SubLObject sksi_determine_db_csql_field_select(final SubLObject sk_source, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject output_physical_field_indexicals,
      final SubLObject eval_conditions)
  {
    SubLObject csql_field_select = NIL;
    SubLObject pfi_table_list = NIL;
    SubLObject cdolist_list_var = output_physical_field_indexicals;
    SubLObject pfi = NIL;
    pfi = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject lfi = sksi_infrastructure_utilities.sksi_determine_relevant_logical_field_indexicals_for_physical_field_indexical( pfi, logical_schemata, physical_schemata ).first();
      SubLObject lfi_eval_exp = Sequences.find( lfi, eval_conditions, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym36$FIRST ), UNPROVIDED, UNPROVIDED );
      if( NIL != lfi_eval_exp )
      {
        lfi_eval_exp = conses_high.second( lfi_eval_exp );
      }
      if( NIL != lfi_eval_exp )
      {
        csql_field_select = ConsesLow.cons( lfi_eval_exp, csql_field_select );
      }
      else
      {
        final SubLObject table_name = sksi_kb_accessors.physical_field_indexical_sk_source_name( pfi );
        final SubLObject table_namespace = sksi_kb_accessors.physical_field_indexical_sk_source_namespace( pfi );
        SubLObject pfi_fort = NIL;
        SubLObject pfi_alias = NIL;
        SubLObject field_name = NIL;
        SubLObject pfi_table = NIL;
        if( NIL != table_name )
        {
          if( NIL != sksi_kb_accessors.pfi_alias_fn_naut_p( pfi ) )
          {
            pfi_fort = sksi_kb_accessors.pfi_fort_for_pfi( pfi );
            pfi_alias = sksi_kb_accessors.pfi_alias_fn_naut_index( pfi );
            pfi_table = make_table_alias_name( table_name, pfi_alias );
            pfi_table_list = ConsesLow.cons( sksi_csql_utilities.make_table_alias( table_name, pfi_alias, table_namespace ), pfi_table_list );
          }
          else
          {
            pfi_fort = pfi;
            pfi_table = table_name;
            pfi_table_list = ConsesLow.cons( sksi_csql_utilities.make_table_alias( table_name, NIL, table_namespace ), pfi_table_list );
          }
          field_name = sksi_kb_accessors.physical_field_name( sksi_kb_accessors.physical_field_for_indexical( pfi_fort ) );
          csql_field_select = ConsesLow.cons( sksi_csql_utilities.construct_csql_field_expression( field_name, pfi_table, table_namespace ), csql_field_select );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      pfi = cdolist_list_var.first();
    }
    csql_field_select = Sequences.nreverse( csql_field_select );
    pfi_table_list = Sequences.nreverse( list_utilities.fast_delete_duplicates( pfi_table_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return Values.values( csql_field_select, pfi_table_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 26540L)
  public static SubLObject sksi_determine_fht_csql_field_select(final SubLObject physical_schema, final SubLObject output_physical_field_indexicals)
  {
    final SubLObject indexed_field_name = sksi_kb_accessors.sksi_determine_singly_indexed_schema_indexed_field( physical_schema );
    SubLObject csql_field_select = NIL;
    SubLObject pfi_table_list = NIL;
    SubLObject cdolist_list_var = output_physical_field_indexicals;
    SubLObject pfi = NIL;
    pfi = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject table_name = sksi_kb_accessors.physical_field_indexical_sk_source_name( pfi );
      final SubLObject table_namespace = sksi_kb_accessors.physical_field_indexical_sk_source_namespace( pfi );
      SubLObject pfi_fort = NIL;
      SubLObject pfi_alias = NIL;
      SubLObject field_name = NIL;
      if( NIL != sksi_kb_accessors.pfi_alias_fn_naut_p( pfi ) )
      {
        pfi_fort = sksi_kb_accessors.pfi_fort_for_pfi( pfi );
        pfi_alias = sksi_kb_accessors.pfi_alias_fn_naut_index( pfi );
        pfi_table_list = ConsesLow.cons( sksi_csql_utilities.make_table_alias( table_name, pfi_alias, table_namespace ), pfi_table_list );
      }
      else
      {
        pfi_fort = pfi;
        pfi_table_list = ConsesLow.cons( sksi_csql_utilities.make_table_alias( table_name, NIL, table_namespace ), pfi_table_list );
      }
      field_name = sksi_kb_accessors.physical_field_name( pfi_fort );
      csql_field_select = ConsesLow.cons( field_name.equal( indexed_field_name ) ? ConsesLow.list( $kw37$KEY, field_name, table_name ) : ConsesLow.list( $kw38$KEY_VALUE, field_name, table_name ), csql_field_select );
      cdolist_list_var = cdolist_list_var.rest();
      pfi = cdolist_list_var.first();
    }
    csql_field_select = Sequences.nreverse( csql_field_select );
    pfi_table_list = Sequences.nreverse( list_utilities.fast_delete_duplicates( pfi_table_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return Values.values( csql_field_select, pfi_table_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 27933L)
  public static SubLObject sksi_determine_web_csql_field_select(final SubLObject physical_schema, final SubLObject output_physical_field_indexicals)
  {
    final SubLObject required_field_names = sksi_kb_accessors.physical_schema_required_field_names( physical_schema );
    final SubLObject field_name_list = sksi_kb_accessors.physical_schema_field_name_list( physical_schema );
    SubLObject csql_field_select = NIL;
    SubLObject pfi_table_list = NIL;
    SubLObject cdolist_list_var = output_physical_field_indexicals;
    SubLObject pfi = NIL;
    pfi = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject table_name = sksi_kb_accessors.physical_field_indexical_sk_source_name( pfi );
      final SubLObject table_namespace = sksi_kb_accessors.physical_field_indexical_sk_source_namespace( pfi );
      SubLObject pfi_fort = NIL;
      SubLObject pfi_index = NIL;
      SubLObject field_name = NIL;
      if( NIL != sksi_kb_accessors.pfi_alias_fn_naut_p( pfi ) )
      {
        pfi_fort = sksi_kb_accessors.pfi_fort_for_pfi( pfi );
        pfi_index = sksi_kb_accessors.pfi_alias_fn_naut_index( pfi );
        pfi_table_list = ConsesLow.cons( sksi_csql_utilities.make_table_alias( table_name, pfi_index, table_namespace ), pfi_table_list );
      }
      else
      {
        pfi_fort = pfi;
        pfi_table_list = ConsesLow.cons( sksi_csql_utilities.make_table_alias( table_name, NIL, table_namespace ), pfi_table_list );
      }
      field_name = sksi_kb_accessors.physical_field_name( pfi_fort );
      final SubLObject item_var = ( NIL != conses_high.member( field_name, required_field_names, Symbols.symbol_function( EQUAL ), UNPROVIDED ) ) ? ConsesLow.list( $kw37$KEY, field_name, table_name )
          : ConsesLow.list( $kw38$KEY_VALUE, field_name, table_name );
      if( NIL == conses_high.member( item_var, csql_field_select, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        csql_field_select = ConsesLow.cons( item_var, csql_field_select );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pfi = cdolist_list_var.first();
    }
    csql_field_select = list_utilities.sort_via_position( csql_field_select, field_name_list, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym39$SECOND ) );
    pfi_table_list = Sequences.nreverse( list_utilities.fast_delete_duplicates( pfi_table_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return Values.values( csql_field_select, pfi_table_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 29579L)
  public static SubLObject sksi_determine_rdf_csql_field_select(final SubLObject sk_source, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject output_physical_field_indexicals,
      final SubLObject eval_conditions)
  {
    return sksi_determine_db_csql_field_select( sk_source, logical_schemata, physical_schemata, output_physical_field_indexicals, eval_conditions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 29880L)
  public static SubLObject sksi_determine_csql_table_select(final SubLObject table_alias_list)
  {
    SubLObject table_csql = NIL;
    SubLObject cdolist_list_var = table_alias_list;
    SubLObject table_alias_tuple = NIL;
    table_alias_tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = table_alias_tuple;
      SubLObject table_alias_token = NIL;
      SubLObject table_name = NIL;
      SubLObject alias = NIL;
      SubLObject table_namespace = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
      table_alias_token = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
      table_name = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
      alias = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
      table_namespace = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject table_alias_name = ( NIL != alias ) ? make_table_alias_name( table_name, alias ) : NIL;
        SubLObject table_expression = NIL;
        if( NIL != table_namespace )
        {
          table_expression = ConsesLow.list( $kw41$TABLE, table_name, table_alias_name, table_namespace );
        }
        else if( NIL != table_alias_name )
        {
          table_expression = ConsesLow.list( $kw41$TABLE, table_name, table_alias_name );
        }
        else
        {
          table_expression = ConsesLow.list( $kw41$TABLE, table_name );
        }
        table_csql = ConsesLow.cons( table_expression, table_csql );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list40 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      table_alias_tuple = cdolist_list_var.first();
    }
    return Sequences.nreverse( table_csql );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 30780L)
  public static SubLObject make_table_alias_name(final SubLObject table_name, final SubLObject alias)
  {
    return Sequences.cconcatenate( table_name, string_utilities.object_to_string( alias ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 31152L)
  public static SubLObject sksi_determine_csql_where_clause(final SubLObject sk_source, final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata,
      final SubLObject input_physical_field_indexicals, final SubLObject fixed_physical_field_indexicals, final SubLObject table_alias_list, final SubLObject eval_conditions)
  {
    if( NIL != constant_handles.constant_p( sk_source ) && constants_high.constant_name( sk_source ).equal( $str30$TestLanguageSpoken_DB ) )
    {
      return sksi_determine_db_csql_where_clause( sentence, logical_schemata, physical_schemata, input_physical_field_indexicals, fixed_physical_field_indexicals, sk_source, table_alias_list, eval_conditions );
    }
    final SubLObject pcase_var;
    final SubLObject type = pcase_var = sksi_access_path.determine_sks_type( sk_source, UNPROVIDED );
    if( pcase_var.eql( $const31$Database_Physical ) )
    {
      return sksi_determine_db_csql_where_clause( sentence, logical_schemata, physical_schemata, input_physical_field_indexicals, fixed_physical_field_indexicals, sk_source, table_alias_list, eval_conditions );
    }
    if( pcase_var.eql( $const32$FileHashTable_File ) )
    {
      return sksi_determine_fht_csql_where_clause( sentence, logical_schemata, physical_schemata, input_physical_field_indexicals, fixed_physical_field_indexicals, table_alias_list );
    }
    if( pcase_var.eql( $const33$WebPage_AIS ) )
    {
      return sksi_determine_web_csql_where_clause( sentence, logical_schemata, physical_schemata, input_physical_field_indexicals, fixed_physical_field_indexicals, table_alias_list );
    }
    if( pcase_var.eql( $const34$RDFTripleStore_Physical ) )
    {
      return sksi_determine_rdf_csql_where_clause( sentence, logical_schemata, physical_schemata, input_physical_field_indexicals, fixed_physical_field_indexicals, sk_source, table_alias_list, eval_conditions );
    }
    return Errors.error( $str43$time_to_support_WHERE__S, type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 32845L)
  public static SubLObject sksi_determine_db_csql_where_clause(final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject input_physical_field_indexicals,
      final SubLObject fixed_physical_field_indexicals, final SubLObject sk_source, SubLObject table_alias_list, final SubLObject eval_conditions)
  {
    SubLObject equal_pairs = NIL;
    final SubLObject pfi_where_expressions = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject table_namespace = sksi_kb_accessors.sk_source_namespace( sk_source );
    SubLObject cdolist_list_var = fixed_physical_field_indexicals;
    SubLObject pfi = NIL;
    pfi = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pfi_table;
      final SubLObject table_name = pfi_table = sksi_kb_accessors.physical_field_indexical_sk_source_name( pfi );
      final SubLObject fixed_value = sksi_fixed_physical_field_indexical_value( pfi, logical_schemata, physical_schemata );
      final SubLObject pf = sksi_kb_accessors.physical_field_for_indexical( pfi );
      if( NIL != pf )
      {
        final SubLObject field_name = sksi_kb_accessors.physical_field_name( pf );
        final SubLObject field_expression = sksi_csql_utilities.construct_csql_field_expression( field_name, pfi_table, table_namespace );
        final SubLObject pair = ( NIL != kb_utilities.kbeq( $const44$StringObject, sksi_kb_accessors.physical_field_data_type( pf ) ) ) ? ConsesLow.list( $const42$CSQLEquals, field_expression, fixed_value )
            : ConsesLow.list( $csql_default_db_equals$.getGlobalValue(), field_expression, fixed_value );
        equal_pairs = ConsesLow.cons( pair, equal_pairs );
        dictionary.dictionary_enter( pfi_where_expressions, pfi, pair );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pfi = cdolist_list_var.first();
    }
    SubLObject list_var = NIL;
    pfi = NIL;
    SubLObject pfi_index = NIL;
    list_var = input_physical_field_indexicals;
    pfi = list_var.first();
    for( pfi_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), pfi = list_var.first(), pfi_index = Numbers.add( ONE_INTEGER, pfi_index ) )
    {
      final SubLObject lfi = sksi_infrastructure_utilities.sksi_determine_relevant_logical_field_indexicals_for_physical_field_indexical( pfi, logical_schemata, physical_schemata ).first();
      SubLObject lfi_eval_exp = Sequences.find( lfi, eval_conditions, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym36$FIRST ), UNPROVIDED, UNPROVIDED );
      if( NIL != lfi_eval_exp )
      {
        lfi_eval_exp = conses_high.second( lfi_eval_exp );
      }
      final SubLObject table_name2 = sksi_kb_accessors.physical_field_indexical_sk_source_name( pfi );
      final SubLObject table_namespace_$10 = sksi_kb_accessors.physical_field_indexical_sk_source_namespace( pfi );
      SubLObject pfi_fort = NIL;
      SubLObject pfi_alias = NIL;
      SubLObject pfi_table2 = NIL;
      if( table_name2.isString() && NIL == lfi_eval_exp )
      {
        if( NIL != sksi_kb_accessors.pfi_alias_fn_naut_p( pfi ) )
        {
          pfi_fort = sksi_kb_accessors.pfi_fort_for_pfi( pfi );
          pfi_alias = sksi_kb_accessors.pfi_alias_fn_naut_index( pfi );
          pfi_table2 = make_table_alias_name( table_name2, pfi_alias );
          table_alias_list = ConsesLow.cons( sksi_csql_utilities.make_table_alias( table_name2, pfi_alias, table_namespace_$10 ), table_alias_list );
        }
        else
        {
          pfi_fort = pfi;
          pfi_table2 = table_name2;
          table_alias_list = ConsesLow.cons( sksi_csql_utilities.make_table_alias( table_name2, NIL, table_namespace_$10 ), table_alias_list );
        }
      }
      final SubLObject termnum = number_utilities.f_1X( pfi_index );
      final SubLObject raw_symbol = sksi_removal_module_generation.token_raw_symbol_for_termnum( termnum );
      SubLObject pair2 = NIL;
      if( NIL != lfi_eval_exp )
      {
        pair2 = ConsesLow.list( $const42$CSQLEquals, lfi_eval_exp, ConsesLow.list( $kw45$VALUE, raw_symbol ) );
      }
      else
      {
        final SubLObject pf2 = sksi_kb_accessors.physical_field_for_indexical( pfi_fort );
        if( NIL != pf2 )
        {
          final SubLObject field_name2 = sksi_kb_accessors.physical_field_name( pf2 );
          final SubLObject field_expression2 = sksi_csql_utilities.construct_csql_field_expression( field_name2, pfi_table2, table_namespace_$10 );
          pair2 = ( NIL != kb_utilities.kbeq( $const44$StringObject, sksi_kb_accessors.physical_field_data_type( pf2 ) ) ) ? ConsesLow.list( $const42$CSQLEquals, field_expression2, ConsesLow.list( $kw45$VALUE,
              raw_symbol ) ) : ConsesLow.list( $csql_default_db_equals$.getGlobalValue(), field_expression2, ConsesLow.list( $kw45$VALUE, raw_symbol ) );
        }
      }
      if( NIL != pair2 )
      {
        equal_pairs = ConsesLow.cons( pair2, equal_pairs );
        dictionary.dictionary_enter( pfi_where_expressions, pfi, pair2 );
        dictionary.dictionary_enter( pfi_where_expressions, sksi_kb_accessors.pfi_fort_for_pfi( pfi ), pair2 );
      }
    }
    equal_pairs = Sequences.nreverse( equal_pairs );
    table_alias_list = Sequences.nreverse( list_utilities.fast_delete_duplicates( table_alias_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return Values.values( equal_pairs, table_alias_list, pfi_where_expressions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 36318L)
  public static SubLObject sksi_fixed_physical_field_indexical_value(final SubLObject pfi, final SubLObject logical_schemata, final SubLObject physical_schemata)
  {
    return sksi_field_translation_utilities.get_field_encodings_for_physical_field_indexical( pfi, logical_schemata, physical_schemata ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 36527L)
  public static SubLObject sksi_determine_web_csql_where_clause(final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject input_physical_field_indexicals,
      final SubLObject fixed_physical_field_indexicals, SubLObject table_alias_list)
  {
    final SubLObject physical_schema = physical_schemata.first();
    SubLObject equal_pairs = NIL;
    final SubLObject required_field_names = sksi_kb_accessors.physical_schema_required_field_names( physical_schema );
    SubLObject list_var = NIL;
    SubLObject pfi = NIL;
    SubLObject pfi_index = NIL;
    list_var = input_physical_field_indexicals;
    pfi = list_var.first();
    for( pfi_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), pfi = list_var.first(), pfi_index = Numbers.add( ONE_INTEGER, pfi_index ) )
    {
      final SubLObject table_name = sksi_kb_accessors.physical_field_indexical_sk_source_name( pfi );
      final SubLObject table_namespace = sksi_kb_accessors.physical_field_indexical_sk_source_namespace( pfi );
      SubLObject pfi_fort = NIL;
      SubLObject pfi_alias = NIL;
      final SubLObject pfi_table = NIL;
      if( NIL != sksi_kb_accessors.pfi_alias_fn_naut_p( pfi ) )
      {
        pfi_fort = sksi_kb_accessors.pfi_fort_for_pfi( pfi );
        pfi_alias = sksi_kb_accessors.pfi_alias_fn_naut_index( pfi );
        table_alias_list = ConsesLow.cons( sksi_csql_utilities.make_table_alias( table_name, pfi_alias, table_namespace ), table_alias_list );
      }
      else
      {
        pfi_fort = sksi_kb_accessors.pfi_fort_for_pfi( pfi );
        table_alias_list = ConsesLow.cons( sksi_csql_utilities.make_table_alias( table_name, NIL, table_namespace ), table_alias_list );
      }
      final SubLObject pf = sksi_kb_accessors.physical_field_for_indexical( pfi_fort );
      final SubLObject field_name = sksi_kb_accessors.physical_field_name( pf );
      final SubLObject termnum = number_utilities.f_1X( pfi_index );
      final SubLObject raw_symbol = sksi_removal_module_generation.token_raw_symbol_for_termnum( termnum );
      final SubLObject pair = ( NIL != subl_promotions.memberP( field_name, required_field_names, Symbols.symbol_function( EQUAL ), UNPROVIDED ) ) ? ConsesLow.list( $const29$CSQLStrictlyEquals, ConsesLow.list( $kw37$KEY,
          field_name, table_name ), ConsesLow.list( $kw45$VALUE, raw_symbol ) )
          : ConsesLow.list( $const29$CSQLStrictlyEquals, ConsesLow.list( $kw38$KEY_VALUE, field_name, table_name ), ConsesLow.list( $kw45$VALUE, raw_symbol ) );
      equal_pairs = ConsesLow.cons( pair, equal_pairs );
    }
    equal_pairs = Sequences.nreverse( equal_pairs );
    table_alias_list = Sequences.nreverse( list_utilities.fast_delete_duplicates( table_alias_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return Values.values( equal_pairs, table_alias_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 38388L)
  public static SubLObject sksi_determine_fht_csql_where_clause(final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject input_physical_field_indexicals,
      final SubLObject fixed_physical_field_indexicals, SubLObject table_alias_list)
  {
    final SubLObject physical_schema = physical_schemata.first();
    SubLObject equal_pairs = NIL;
    final SubLObject indexed_field_name = sksi_kb_accessors.sksi_determine_singly_indexed_schema_indexed_field( physical_schema );
    SubLObject list_var = NIL;
    SubLObject pfi = NIL;
    SubLObject pfi_index = NIL;
    list_var = input_physical_field_indexicals;
    pfi = list_var.first();
    for( pfi_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), pfi = list_var.first(), pfi_index = Numbers.add( ONE_INTEGER, pfi_index ) )
    {
      final SubLObject table_name = sksi_kb_accessors.physical_field_indexical_sk_source_name( pfi );
      final SubLObject table_namespace = sksi_kb_accessors.physical_field_indexical_sk_source_namespace( pfi );
      SubLObject pfi_fort = NIL;
      SubLObject pfi_alias = NIL;
      final SubLObject pfi_table = NIL;
      if( NIL != sksi_kb_accessors.pfi_alias_fn_naut_p( pfi ) )
      {
        pfi_fort = sksi_kb_accessors.pfi_fort_for_pfi( pfi );
        pfi_alias = sksi_kb_accessors.pfi_alias_fn_naut_index( pfi );
        table_alias_list = ConsesLow.cons( sksi_csql_utilities.make_table_alias( table_name, pfi_alias, table_namespace ), table_alias_list );
      }
      else
      {
        pfi_fort = sksi_kb_accessors.pfi_fort_for_pfi( pfi );
        table_alias_list = ConsesLow.cons( sksi_csql_utilities.make_table_alias( table_name, NIL, table_namespace ), table_alias_list );
      }
      final SubLObject pf = sksi_kb_accessors.physical_field_for_indexical( pfi_fort );
      final SubLObject field_name = sksi_kb_accessors.physical_field_name( pf );
      final SubLObject termnum = number_utilities.f_1X( pfi_index );
      final SubLObject raw_symbol = sksi_removal_module_generation.token_raw_symbol_for_termnum( termnum );
      final SubLObject pair = field_name.equal( indexed_field_name ) ? ConsesLow.list( $const29$CSQLStrictlyEquals, ConsesLow.list( $kw37$KEY, field_name, table_name ), ConsesLow.list( $kw45$VALUE, raw_symbol ) )
          : ConsesLow.list( $const29$CSQLStrictlyEquals, ConsesLow.list( $kw38$KEY_VALUE, field_name, table_name ), ConsesLow.list( $kw45$VALUE, raw_symbol ) );
      equal_pairs = ConsesLow.cons( pair, equal_pairs );
    }
    equal_pairs = Sequences.nreverse( equal_pairs );
    table_alias_list = Sequences.nreverse( list_utilities.fast_delete_duplicates( table_alias_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return Values.values( equal_pairs, table_alias_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 40385L)
  public static SubLObject sksi_determine_rdf_csql_where_clause(final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject input_physical_field_indexicals,
      final SubLObject fixed_physical_field_indexicals, final SubLObject sk_source, final SubLObject table_alias_list, final SubLObject eval_conditions)
  {
    return sksi_determine_db_csql_where_clause( sentence, logical_schemata, physical_schemata, input_physical_field_indexicals, fixed_physical_field_indexicals, sk_source, table_alias_list, eval_conditions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 40827L)
  public static SubLObject sksi_determine_csql_order_by(final SubLObject sk_source, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject physical_field_indexicals)
  {
    final SubLObject pcase_var;
    final SubLObject type = pcase_var = sksi_access_path.determine_sks_type( sk_source, UNPROVIDED );
    if( pcase_var.eql( $const31$Database_Physical ) )
    {
      return sksi_determine_db_csql_order_by( sk_source, logical_schemata, physical_schemata, physical_field_indexicals );
    }
    return Errors.error( $str46$time_to_support_ORDER_BY_for__S, type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-generation.lisp", position = 41480L)
  public static SubLObject sksi_determine_db_csql_order_by(final SubLObject sk_source, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject physical_field_indexicals)
  {
    SubLObject csql_field_order_by = NIL;
    SubLObject pfi_table_list = NIL;
    SubLObject cdolist_list_var = physical_field_indexicals;
    SubLObject pfi = NIL;
    pfi = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject table_name = sksi_kb_accessors.physical_field_indexical_sk_source_name( pfi );
      final SubLObject table_namespace = sksi_kb_accessors.physical_field_indexical_sk_source_namespace( pfi );
      SubLObject pfi_fort = NIL;
      SubLObject pfi_alias = NIL;
      SubLObject field_name = NIL;
      SubLObject pfi_table = NIL;
      if( NIL != table_name )
      {
        if( NIL != sksi_kb_accessors.pfi_alias_fn_naut_p( pfi ) )
        {
          pfi_fort = sksi_kb_accessors.pfi_fort_for_pfi( pfi );
          pfi_alias = sksi_kb_accessors.pfi_alias_fn_naut_index( pfi );
          pfi_table = make_table_alias_name( table_name, pfi_alias );
          pfi_table_list = ConsesLow.cons( sksi_csql_utilities.make_table_alias( table_name, pfi_alias, table_namespace ), pfi_table_list );
        }
        else
        {
          pfi_fort = pfi;
          pfi_table = table_name;
          pfi_table_list = ConsesLow.cons( sksi_csql_utilities.make_table_alias( table_name, NIL, table_namespace ), pfi_table_list );
        }
        field_name = sksi_kb_accessors.physical_field_name( sksi_kb_accessors.physical_field_for_indexical( pfi_fort ) );
        csql_field_order_by = ConsesLow.cons( ConsesLow.list( sksi_csql_utilities.construct_csql_field_expression( field_name, pfi_table, table_namespace ) ), csql_field_order_by );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pfi = cdolist_list_var.first();
    }
    csql_field_order_by = Sequences.nreverse( csql_field_order_by );
    return ConsesLow.list( $kw47$ORDER_BY, csql_field_order_by );
  }

  public static SubLObject declare_sksi_csql_generation_file()
  {
    SubLFiles.declareFunction( me, "sksi_determine_output_csql", "SKSI-DETERMINE-OUTPUT-CSQL", 8, 2, false );
    SubLFiles.declareFunction( me, "sksi_interpret_csql_field_select", "SKSI-INTERPRET-CSQL-FIELD-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_make_boolean_csql_query", "SKSI-MAKE-BOOLEAN-CSQL-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_csql_for_batch_translate", "SKSI-DETERMINE-CSQL-FOR-BATCH-TRANSLATE", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_csql_field_select_for_batch_translate", "SKSI-DETERMINE-CSQL-FIELD-SELECT-FOR-BATCH-TRANSLATE", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_csql_order_by_for_batch_translate", "SKSI-DETERMINE-CSQL-ORDER-BY-FOR-BATCH-TRANSLATE", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_additional_sql_for_batch_translate", "SKSI-ADDITIONAL-SQL-FOR-BATCH-TRANSLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_csql_for_incremental_edit", "SKSI-DETERMINE-CSQL-FOR-INCREMENTAL-EDIT", 6, 0, false );
    SubLFiles.declareFunction( me, "sksi_get_row_from_table", "SKSI-GET-ROW-FROM-TABLE", 6, 0, false );
    SubLFiles.declareFunction( me, "sksi_find_primary_key_value_for_raw_tuple", "SKSI-FIND-PRIMARY-KEY-VALUE-FOR-RAW-TUPLE", 5, 0, false );
    SubLFiles.declareFunction( me, "remove_no_value_field_values_and_corresponding_fields", "REMOVE-NO-VALUE-FIELD-VALUES-AND-CORRESPONDING-FIELDS", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_csql_for_incremental_edit_int", "SKSI-DETERMINE-CSQL-FOR-INCREMENTAL-EDIT-INT", 6, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_csql_for_incremental_edit_delete", "SKSI-DETERMINE-CSQL-FOR-INCREMENTAL-EDIT-DELETE", 5, 0, false );
    SubLFiles.declareFunction( me, "simplify_raw_tuple_element", "SIMPLIFY-RAW-TUPLE-ELEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_csql_for_incremental_edit_insert", "SKSI-DETERMINE-CSQL-FOR-INCREMENTAL-EDIT-INSERT", 5, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_csql_field_select_for_incremental_edit", "SKSI-DETERMINE-CSQL-FIELD-SELECT-FOR-INCREMENTAL-EDIT", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_csql_where_clause_for_incremental_edit", "SKSI-DETERMINE-CSQL-WHERE-CLAUSE-FOR-INCREMENTAL-EDIT", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_csql_for_incremental_update", "SKSI-DETERMINE-CSQL-FOR-INCREMENTAL-UPDATE", 8, 0, false );
    SubLFiles.declareFunction( me, "remove_primary_key_fields_and_corresponding_values", "REMOVE-PRIMARY-KEY-FIELDS-AND-CORRESPONDING-VALUES", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_csql_set_clause", "SKSI-DETERMINE-CSQL-SET-CLAUSE", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_csql_field_select", "SKSI-DETERMINE-CSQL-FIELD-SELECT", 5, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_db_csql_field_select", "SKSI-DETERMINE-DB-CSQL-FIELD-SELECT", 5, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_fht_csql_field_select", "SKSI-DETERMINE-FHT-CSQL-FIELD-SELECT", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_web_csql_field_select", "SKSI-DETERMINE-WEB-CSQL-FIELD-SELECT", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_rdf_csql_field_select", "SKSI-DETERMINE-RDF-CSQL-FIELD-SELECT", 5, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_csql_table_select", "SKSI-DETERMINE-CSQL-TABLE-SELECT", 1, 0, false );
    SubLFiles.declareFunction( me, "make_table_alias_name", "MAKE-TABLE-ALIAS-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_csql_where_clause", "SKSI-DETERMINE-CSQL-WHERE-CLAUSE", 8, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_db_csql_where_clause", "SKSI-DETERMINE-DB-CSQL-WHERE-CLAUSE", 8, 0, false );
    SubLFiles.declareFunction( me, "sksi_fixed_physical_field_indexical_value", "SKSI-FIXED-PHYSICAL-FIELD-INDEXICAL-VALUE", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_web_csql_where_clause", "SKSI-DETERMINE-WEB-CSQL-WHERE-CLAUSE", 6, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_fht_csql_where_clause", "SKSI-DETERMINE-FHT-CSQL-WHERE-CLAUSE", 6, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_rdf_csql_where_clause", "SKSI-DETERMINE-RDF-CSQL-WHERE-CLAUSE", 8, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_csql_order_by", "SKSI-DETERMINE-CSQL-ORDER-BY", 4, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_db_csql_order_by", "SKSI-DETERMINE-DB-CSQL-ORDER-BY", 4, 0, false );
    return NIL;
  }

  public static SubLObject init_sksi_csql_generation_file()
  {
    $csql_default_db_equals$ = SubLFiles.deflexical( "*CSQL-DEFAULT-DB-EQUALS*", $const42$CSQLEquals );
    return NIL;
  }

  public static SubLObject setup_sksi_csql_generation_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_csql_generation_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_csql_generation_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_csql_generation_file();
  }
  static
  {
    me = new sksi_csql_generation();
    $csql_default_db_equals$ = null;
    $sym0$INTEGERP = makeSymbol( "INTEGERP" );
    $kw1$SELECT = makeKeyword( "SELECT" );
    $kw2$FROM = makeKeyword( "FROM" );
    $kw3$WHERE = makeKeyword( "WHERE" );
    $kw4$LIMIT = makeKeyword( "LIMIT" );
    $list5 = ConsesLow.list( makeKeyword( "COUNT" ), makeKeyword( "ALL" ) );
    $kw6$RAW = makeKeyword( "RAW" );
    $list7 = ConsesLow.list( NIL );
    $sym8$INDEXICAL_FOR_PHYSICAL_FIELD = makeSymbol( "INDEXICAL-FOR-PHYSICAL-FIELD" );
    $sym9$KBEQ = makeSymbol( "KBEQ" );
    $const10$sqlAppendedToTableAtImport = constant_handles.reader_make_constant_shell( makeString( "sqlAppendedToTableAtImport" ) );
    $kw11$TRUE = makeKeyword( "TRUE" );
    $str12$__SKSI__A_ = makeString( "~&SKSI-~A " );
    $str13$_sksi_determine_csql_for_incremen = makeString( "(sksi-determine-csql-for-incremental-edit ~S ~S ~S ~S ~S ~S)~%" );
    $kw14$INSERT = makeKeyword( "INSERT" );
    $str15$In_sksi_determine_csql_for_increm = makeString( "In sksi-determine-csql-for-incremental-edit non-null-field ~S has no physical value~%" );
    $kw16$DELETE = makeKeyword( "DELETE" );
    $kw17$AUTO_INCREMENT_DEFAULT = makeKeyword( "AUTO-INCREMENT-DEFAULT" );
    $kw18$NEXT_VALUE = makeKeyword( "NEXT-VALUE" );
    $str19$In_sksi_determine_csql_for_increm = makeString( "In sksi-determine-csql-for-incremental-edit (physical-field-value-is-auto-incremented? ~S ~S) -> ~A~%" );
    $str20$In_sksi_determine_csql_for_increm = makeString( "In sksi-determine-csql-for-incremental-edit (integer-sequence-generator-for-physical-field ~S) -> ~S~%" );
    $kw21$BATCH = makeKeyword( "BATCH" );
    $kw22$NO_VALUE = makeKeyword( "NO-VALUE" );
    $list23 = ConsesLow.list( makeSymbol( "FROM-EXPRESSION" ), makeSymbol( "WHERE-EXPRESSIONS" ) );
    $kw24$INTO = makeKeyword( "INTO" );
    $kw25$VALUES = makeKeyword( "VALUES" );
    $kw26$UPDATE = makeKeyword( "UPDATE" );
    $kw27$SET = makeKeyword( "SET" );
    $str28$Unknown_modification_operator__a_ = makeString( "Unknown modification operator ~a, expected :insert or :delete" );
    $const29$CSQLStrictlyEquals = constant_handles.reader_make_constant_shell( makeString( "CSQLStrictlyEquals" ) );
    $str30$TestLanguageSpoken_DB = makeString( "TestLanguageSpoken-DB" );
    $const31$Database_Physical = constant_handles.reader_make_constant_shell( makeString( "Database-Physical" ) );
    $const32$FileHashTable_File = constant_handles.reader_make_constant_shell( makeString( "FileHashTable-File" ) );
    $const33$WebPage_AIS = constant_handles.reader_make_constant_shell( makeString( "WebPage-AIS" ) );
    $const34$RDFTripleStore_Physical = constant_handles.reader_make_constant_shell( makeString( "RDFTripleStore-Physical" ) );
    $str35$time_to_support_SELECT_for__S = makeString( "time to support SELECT for ~S" );
    $sym36$FIRST = makeSymbol( "FIRST" );
    $kw37$KEY = makeKeyword( "KEY" );
    $kw38$KEY_VALUE = makeKeyword( "KEY-VALUE" );
    $sym39$SECOND = makeSymbol( "SECOND" );
    $list40 = ConsesLow.list( makeSymbol( "TABLE-ALIAS-TOKEN" ), makeSymbol( "TABLE-NAME" ), makeSymbol( "ALIAS" ), makeSymbol( "TABLE-NAMESPACE" ) );
    $kw41$TABLE = makeKeyword( "TABLE" );
    $const42$CSQLEquals = constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) );
    $str43$time_to_support_WHERE__S = makeString( "time to support WHERE ~S" );
    $const44$StringObject = constant_handles.reader_make_constant_shell( makeString( "StringObject" ) );
    $kw45$VALUE = makeKeyword( "VALUE" );
    $str46$time_to_support_ORDER_BY_for__S = makeString( "time to support ORDER BY for ~S" );
    $kw47$ORDER_BY = makeKeyword( "ORDER-BY" );
  }
}
/*
 * 
 * Total time: 275 ms synthetic
 */