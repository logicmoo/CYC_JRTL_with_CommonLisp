package com.cyc.cycjava.cycl.sksi;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.abstract_lexicon;
import com.cyc.cycjava.cycl.parser;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.nl_api_datastructures;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.nl_parsing_api;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.term_lexicon;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.rkf_relevance_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.defns;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.genls;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class data_parser
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.data_parser";
  public static final String myFingerPrint = "de87deb4af96da12aa05e5b18ab9e957b3f1d983e4851d7d90b2db7df289d0df";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 936L)
  private static SubLSymbol $data_parser_row_sampling_limit$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 8080L)
  private static SubLSymbol $bottom_of_upper_ontology$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 8160L)
  private static SubLSymbol $bottom_of_upper_ontology_generality_estimate$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 8235L)
  private static SubLSymbol $semantic_etl_upper_ontology_termP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 8599L)
  private static SubLSymbol $etl_data_lexicon$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 8646L)
  private static SubLSymbol $etl_metadata_lexicon$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 8695L)
  private static SubLSymbol $etl_data_filter_spec$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 15590L)
  private static SubLSymbol $data_parser_all_genls_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 15748L)
  private static SubLSymbol $data_parser_all_isa_caching_state$;
  private static final SubLSymbol $sym0$NON_DOTTED_LIST_P;
  private static final SubLSymbol $sym1$SEMANTICS_P;
  private static final SubLString $str2$Problem_opening_connection_to_dat;
  private static final SubLString $str3$select___from_;
  private static final SubLString $str4$_LIMIT_;
  private static final SubLString $str5$_;
  private static final SubLString $str6$Expected__a_columns_but_got_a_row;
  private static final SubLSymbol $kw7$UNDETERMINED;
  private static final SubLString $str8$bool;
  private static final SubLString $str9$f;
  private static final SubLString $str10$t;
  private static final SubLSymbol $sym11$SEMANTIC_ETL_PARSE_VALUE_INT;
  private static final SubLSymbol $sym12$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const13$EverythingPSC;
  private static final SubLSymbol $sym14$SEMANTIC_ETL_IRRELEVANT_TERM_;
  private static final SubLSymbol $sym15$SEMANTIC_ETL_ALL_ISA;
  private static final SubLSymbol $sym16$ALL_GENLS;
  private static final SubLObject $const17$InferencePSC;
  private static final SubLObject $const18$IntentionalMentalSituation;
  private static final SubLSymbol $sym19$SEMANTIC_ETL_UPPER_ONTOLOGY_TERM_;
  private static final SubLSymbol $sym20$_SEMANTIC_ETL_UPPER_ONTOLOGY_TERM__CACHING_STATE_;
  private static final SubLInteger $int21$100000;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$ADD_LEARNER;
  private static final SubLSymbol $sym24$SIMPLE_DATE_FROM_STRING_LEARN;
  private static final SubLSymbol $sym25$NUMBER_LEARN;
  private static final SubLSymbol $sym26$EXCLUDE_PREDICATE;
  private static final SubLObject $const27$middleName;
  private static final SubLObject $const28$familyName;
  private static final SubLObject $const29$lastName;
  private static final SubLObject $const30$ksTermString;
  private static final SubLSymbol $sym31$ALLOW_PREDICATE;
  private static final SubLObject $const32$countryCodeDigraph;
  private static final SubLObject $const33$countryCodeTrigraph;
  private static final SubLSymbol $sym34$SET_CASE_SENSITIVITY;
  private static final SubLSymbol $kw35$PREFERRED;
  private static final SubLSymbol $sym36$FORBID_MT;
  private static final SubLObject $const37$CyclishMt;
  private static final SubLObject $const38$ComputereseLexicalMt;
  private static final SubLSymbol $sym39$EXCLUDE_POS;
  private static final SubLObject $const40$Verb;
  private static final SubLString $str41$DBFusionLexicalMt;
  private static final SubLSymbol $sym42$ALLOW_MT;
  private static final SubLObject $const43$DBFusionLexicalMt;
  private static final SubLSymbol $kw44$LEXICON;
  private static final SubLSymbol $kw45$FILTER;
  private static final SubLString $str46$;
  private static final SubLSymbol $sym47$STRINGP;
  private static final SubLSymbol $sym48$_;
  private static final SubLSymbol $sym49$SECOND;
  private static final SubLSymbol $sym50$DATA_PARSER_ALL_GENLS;
  private static final SubLSymbol $sym51$_DATA_PARSER_ALL_GENLS_CACHING_STATE_;
  private static final SubLInteger $int52$5000;
  private static final SubLSymbol $sym53$CLEAR_DATA_PARSER_ALL_GENLS;
  private static final SubLSymbol $sym54$DATA_PARSER_ALL_ISA;
  private static final SubLSymbol $sym55$_DATA_PARSER_ALL_ISA_CACHING_STATE_;
  private static final SubLSymbol $sym56$CLEAR_DATA_PARSER_ALL_ISA;
  private static final SubLSymbol $sym57$ETL_PARSE_VALUE;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 1010L)
  public static SubLObject semantic_etl_parse_data(final SubLObject access_paths, final SubLObject semantics_list)
  {
    assert NIL != list_utilities.non_dotted_list_p( semantics_list ) : semantics_list;
    SubLObject cdolist_list_var = semantics_list;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != semantic_etl_bus.semantics_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    return semantic_etl_add_data_list( semantic_etl_acquire_data_list( access_paths, semantics_list ), semantics_list, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 1942L)
  public static SubLObject semantic_etl_acquire_and_add_data(final SubLObject access_path, final SubLObject semantics)
  {
    final SubLObject data = semantic_etl_acquire_data( access_path, semantics );
    return semantic_etl_add_data( data, semantics, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 2752L)
  public static SubLObject semantic_etl_acquire_data_list(final SubLObject access_paths, final SubLObject semantics_list)
  {
    SubLObject data_list = NIL;
    SubLObject access_path = NIL;
    SubLObject access_path_$1 = NIL;
    SubLObject semantics = NIL;
    SubLObject semantics_$2 = NIL;
    access_path = access_paths;
    access_path_$1 = access_path.first();
    semantics = semantics_list;
    semantics_$2 = semantics.first();
    while ( NIL != semantics || NIL != access_path)
    {
      final SubLObject data = semantic_etl_acquire_data( access_path_$1, semantics_$2 );
      data_list = ConsesLow.cons( data, data_list );
      access_path = access_path.rest();
      access_path_$1 = access_path.first();
      semantics = semantics.rest();
      semantics_$2 = semantics.first();
    }
    return Sequences.nreverse( data_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 3189L)
  public static SubLObject semantic_etl_acquire_data(final SubLObject access_path, final SubLObject semantics)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject connection = NIL;
    try
    {
      connection = sksi_sks_interaction.open_sql_source( access_path, UNPROVIDED, UNPROVIDED );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == sdbc.sql_open_connection_p( connection ) )
      {
        Errors.error( $str2$Problem_opening_connection_to_dat, access_path );
      }
      SubLObject cdolist_list_var = semantic_etl_bus.semantics_table_semantics_list( semantics );
      SubLObject table_semantics = NIL;
      table_semantics = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject statement = NIL;
        try
        {
          if( NIL == sdbc.sql_open_connection_p( connection ) )
          {
            connection = sksi_sks_interaction.open_sql_source( access_path, UNPROVIDED, UNPROVIDED );
          }
          if( NIL != sdbc.sdbc_error_p( connection ) )
          {
            sdbc.sdbc_error_throw( connection );
          }
          if( NIL == sdbc.sql_open_statement_p( statement ) )
          {
            statement = sdbc.sqlc_create_statement( connection );
          }
          if( NIL != sdbc.sdbc_error_p( connection ) )
          {
            sdbc.sdbc_error_throw( statement );
          }
          final SubLObject table_name = semantic_etl_bus.table_semantics_table_name( table_semantics );
          final SubLObject sql = Sequences.cconcatenate( $str3$select___from_, new SubLObject[] { format_nil.format_nil_a_no_copy( table_name ), $str4$_LIMIT_, format_nil.format_nil_a_no_copy(
              $data_parser_row_sampling_limit$.getDynamicValue( thread ) ), $str5$_
          } );
          final SubLObject result_set = sdbc.sqls_execute_query( statement, sql, UNPROVIDED );
          if( NIL != sdbc.sdbc_error_p( result_set ) )
          {
            sdbc.sdbc_error_throw( result_set );
          }
          sdbc.sqlrs_absolute( result_set, ZERO_INTEGER );
          SubLObject table_data = NIL;
          while ( NIL != sdbc.sqlrs_next( result_set ))
          {
            SubLObject row_data = NIL;
            SubLObject cdotimes_end_var;
            SubLObject i_1;
            SubLObject i;
            for( cdotimes_end_var = semantic_etl_bus.table_semantics_column_count( table_semantics ), i_1 = NIL, i_1 = ZERO_INTEGER; i_1.numL( cdotimes_end_var ); i_1 = Numbers.add( i_1, ONE_INTEGER ) )
            {
              i = number_utilities.f_1X( i_1 );
              row_data = ConsesLow.cons( sdbc.sqlrs_get_object( result_set, i ), row_data );
            }
            table_data = ConsesLow.cons( Sequences.nreverse( row_data ), table_data );
          }
          result = ConsesLow.cons( Sequences.nreverse( table_data ), result );
        }
        finally
        {
          final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            if( NIL != sdbc.sql_open_statement_p( statement ) )
            {
              sdbc.sqls_close( statement );
            }
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        table_semantics = cdolist_list_var.first();
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        if( NIL != sdbc.sql_open_connection_p( connection ) )
        {
          sdbc.sqlc_close( connection );
        }
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 5069L)
  public static SubLObject semantic_etl_add_data_list(final SubLObject data_list, final SubLObject semantics_list, SubLObject parse_data)
  {
    if( parse_data == UNPROVIDED )
    {
      parse_data = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result_semantics_list = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        SubLObject data = NIL;
        SubLObject data_$3 = NIL;
        SubLObject semantics = NIL;
        SubLObject semantics_$4 = NIL;
        data = data_list;
        data_$3 = data.first();
        semantics = semantics_list;
        semantics_$4 = semantics.first();
        while ( NIL != semantics || NIL != data)
        {
          result_semantics_list = ConsesLow.cons( semantic_etl_add_data( data_$3, semantics_$4, parse_data ), result_semantics_list );
          data = data.rest();
          data_$3 = data.first();
          semantics = semantics.rest();
          semantics_$4 = semantics.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
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
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( semantics_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 5686L)
  public static SubLObject semantic_etl_add_data(final SubLObject data, final SubLObject semantics, SubLObject parse_data)
  {
    if( parse_data == UNPROVIDED )
    {
      parse_data = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject table_data = NIL;
    SubLObject table_data_$6 = NIL;
    SubLObject table_semantics = NIL;
    SubLObject table_semantics_$7 = NIL;
    table_data = data;
    table_data_$6 = table_data.first();
    table_semantics = semantic_etl_bus.semantics_table_semantics_list( semantics );
    table_semantics_$7 = table_semantics.first();
    while ( NIL != table_semantics || NIL != table_data)
    {
      final SubLObject column_count = semantic_etl_bus.table_semantics_column_count( table_semantics_$7 );
      final SubLObject value_semantics_vector = Vectors.make_vector( column_count, NIL );
      SubLObject cdolist_list_var = table_data_$6;
      SubLObject row_data = NIL;
      row_data = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !column_count.numE( Sequences.length( row_data ) ) )
        {
          Errors.error( $str6$Expected__a_columns_but_got_a_row, column_count, Sequences.length( row_data ), row_data );
        }
        SubLObject list_var = NIL;
        SubLObject value = NIL;
        SubLObject i = NIL;
        list_var = row_data;
        value = list_var.first();
        for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), value = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
        {
          final SubLObject value_parses = ( NIL != parse_data ) ? semantic_etl_parse_value( value ) : $kw7$UNDETERMINED;
          final SubLObject value_semantics = semantic_etl_bus.new_value_semantics( value, value_parses );
          Vectors.set_aref( value_semantics_vector, i, ConsesLow.cons( value_semantics, Vectors.aref( value_semantics_vector, i ) ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        row_data = cdolist_list_var.first();
      }
      SubLObject list_var = NIL;
      SubLObject column_semantics = NIL;
      SubLObject i = NIL;
      list_var = semantic_etl_bus.table_semantics_column_semantics_list( table_semantics_$7 );
      column_semantics = list_var.first();
      for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), column_semantics = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
      {
        SubLObject value_semantics_list = Vectors.aref( value_semantics_vector, i );
        if( semantic_etl_bus.column_semantics_column_type( column_semantics ).equal( $str8$bool ) )
        {
          value_semantics_list = convert_values_semantics_to_boolean_values( value_semantics_list );
        }
        semantic_etl_bus.set_column_semantics_value_semantics_list( column_semantics, Sequences.nreverse( value_semantics_list ) );
      }
      table_data = table_data.rest();
      table_data_$6 = table_data.first();
      table_semantics = table_semantics.rest();
      table_semantics_$7 = table_semantics.first();
    }
    return semantics;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 6927L)
  public static SubLObject convert_values_semantics_to_boolean_values(final SubLObject value_semantics_list)
  {
    SubLObject cdolist_list_var = value_semantics_list;
    SubLObject value_semantics = NIL;
    value_semantics = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( semantic_etl_bus.value_semantics_value( value_semantics ) == NIL )
      {
        semantic_etl_bus.set_value_semantics_value( value_semantics, $str9$f );
      }
      else
      {
        semantic_etl_bus.set_value_semantics_value( value_semantics, $str10$t );
      }
      cdolist_list_var = cdolist_list_var.rest();
      value_semantics = cdolist_list_var.first();
    }
    return value_semantics_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 7250L)
  public static SubLObject semantic_etl_parse_value(final SubLObject value)
  {
    return value.isString() ? semantic_etl_parse_value_int( value ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 7377L)
  public static SubLObject semantic_etl_parse_value_int_internal(final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym12$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const13$EverythingPSC, thread );
      result = genls.min_cols( Sequences.remove_if( $sym14$SEMANTIC_ETL_IRRELEVANT_TERM_, Mapping.mapcan( $sym15$SEMANTIC_ETL_ALL_ISA, etl_parse_value( value, UNPROVIDED, UNPROVIDED ), EMPTY_SUBL_OBJECT_ARRAY ),
          UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 7377L)
  public static SubLObject semantic_etl_parse_value_int(final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return semantic_etl_parse_value_int_internal( value );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym11$SEMANTIC_ETL_PARSE_VALUE_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym11$SEMANTIC_ETL_PARSE_VALUE_INT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym11$SEMANTIC_ETL_PARSE_VALUE_INT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, value, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( semantic_etl_parse_value_int_internal( value ) ) );
      memoization_state.caching_state_put( caching_state, value, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 7738L)
  public static SubLObject semantic_etl_all_isa(final SubLObject v_term)
  {
    final SubLObject sbhl_isas = isa.all_isa( v_term, UNPROVIDED, UNPROVIDED );
    final SubLObject defn_isas = Mapping.mapcan( $sym16$ALL_GENLS, defns.min_defn_admits( v_term, UNPROVIDED ), EMPTY_SUBL_OBJECT_ARRAY );
    return conses_high.union( sbhl_isas, defn_isas, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 7917L)
  public static SubLObject semantic_etl_irrelevant_termP(final SubLObject v_term)
  {
    return makeBoolean( NIL != semantic_etl_upper_ontology_termP( v_term ) || NIL != rkf_relevance_utilities.rkf_irrelevant_term( v_term, $const17$InferencePSC ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 8235L)
  public static SubLObject clear_semantic_etl_upper_ontology_termP()
  {
    final SubLObject cs = $semantic_etl_upper_ontology_termP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 8235L)
  public static SubLObject remove_semantic_etl_upper_ontology_termP(final SubLObject v_term)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $semantic_etl_upper_ontology_termP_caching_state$.getGlobalValue(), ConsesLow.list( v_term ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 8235L)
  public static SubLObject semantic_etl_upper_ontology_termP_internal(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !$bottom_of_upper_ontology_generality_estimate$.getDynamicValue( thread ).isNumber() )
    {
      $bottom_of_upper_ontology_generality_estimate$.setDynamicValue( cardinality_estimates.generality_estimate( $bottom_of_upper_ontology$.getDynamicValue( thread ) ), thread );
    }
    return Numbers.numGE( cardinality_estimates.generality_estimate( v_term ), $bottom_of_upper_ontology_generality_estimate$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 8235L)
  public static SubLObject semantic_etl_upper_ontology_termP(final SubLObject v_term)
  {
    SubLObject caching_state = $semantic_etl_upper_ontology_termP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym19$SEMANTIC_ETL_UPPER_ONTOLOGY_TERM_, $sym20$_SEMANTIC_ETL_UPPER_ONTOLOGY_TERM__CACHING_STATE_, $int21$100000, EQUAL, ONE_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( semantic_etl_upper_ontology_termP_internal( v_term ) ) );
      memoization_state.caching_state_put( caching_state, v_term, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 8866L)
  public static SubLObject etl_metadata_lexicon()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == term_lexicon.term_lexicon_p( $etl_metadata_lexicon$.getDynamicValue( thread ) ) )
    {
      $etl_metadata_lexicon$.setDynamicValue( term_lexicon.new_term_lexicon(), thread );
    }
    return $etl_metadata_lexicon$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 9046L)
  public static SubLObject etl_data_lexicon(SubLObject use_existingP)
  {
    if( use_existingP == UNPROVIDED )
    {
      use_existingP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == use_existingP || NIL == term_lexicon.term_lexicon_p( $etl_data_lexicon$.getDynamicValue( thread ) ) )
    {
      $etl_data_lexicon$.setDynamicValue( term_lexicon.new_term_lexicon(), thread );
      methods.funcall_instance_method_with_1_args( $etl_data_lexicon$.getDynamicValue( thread ), $sym23$ADD_LEARNER, $sym24$SIMPLE_DATE_FROM_STRING_LEARN );
      methods.funcall_instance_method_with_1_args( $etl_data_lexicon$.getDynamicValue( thread ), $sym23$ADD_LEARNER, $sym25$NUMBER_LEARN );
      methods.funcall_instance_method_with_1_args( $etl_data_lexicon$.getDynamicValue( thread ), $sym26$EXCLUDE_PREDICATE, $const27$middleName );
      methods.funcall_instance_method_with_1_args( $etl_data_lexicon$.getDynamicValue( thread ), $sym26$EXCLUDE_PREDICATE, $const28$familyName );
      methods.funcall_instance_method_with_1_args( $etl_data_lexicon$.getDynamicValue( thread ), $sym26$EXCLUDE_PREDICATE, $const29$lastName );
      methods.funcall_instance_method_with_1_args( $etl_data_lexicon$.getDynamicValue( thread ), $sym26$EXCLUDE_PREDICATE, $const30$ksTermString );
      methods.funcall_instance_method_with_1_args( $etl_data_lexicon$.getDynamicValue( thread ), $sym31$ALLOW_PREDICATE, $const32$countryCodeDigraph );
      methods.funcall_instance_method_with_1_args( $etl_data_lexicon$.getDynamicValue( thread ), $sym31$ALLOW_PREDICATE, $const33$countryCodeTrigraph );
      methods.funcall_instance_method_with_1_args( $etl_data_lexicon$.getDynamicValue( thread ), $sym34$SET_CASE_SENSITIVITY, $kw35$PREFERRED );
      methods.funcall_instance_method_with_1_args( $etl_data_lexicon$.getDynamicValue( thread ), $sym36$FORBID_MT, $const37$CyclishMt );
      methods.funcall_instance_method_with_1_args( $etl_data_lexicon$.getDynamicValue( thread ), $sym36$FORBID_MT, $const38$ComputereseLexicalMt );
      methods.funcall_instance_method_with_1_args( $etl_data_lexicon$.getDynamicValue( thread ), $sym39$EXCLUDE_POS, $const40$Verb );
      if( NIL != constant_handles.valid_constantP( constants_high.find_constant( $str41$DBFusionLexicalMt ), UNPROVIDED ) )
      {
        methods.funcall_instance_method_with_1_args( $etl_data_lexicon$.getDynamicValue( thread ), $sym42$ALLOW_MT, $const43$DBFusionLexicalMt );
      }
    }
    return $etl_data_lexicon$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 10123L)
  public static SubLObject etl_parse_value_trampoline(final SubLObject string, SubLObject allow_partial_interpsP, SubLObject lexicon)
  {
    if( allow_partial_interpsP == UNPROVIDED )
    {
      allow_partial_interpsP = T;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = etl_data_lexicon( UNPROVIDED );
    }
    return etl_parse_value( string, allow_partial_interpsP, lexicon );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 10391L)
  public static SubLObject etl_parse_value(SubLObject string, SubLObject allow_partial_interpsP, SubLObject lexicon)
  {
    if( allow_partial_interpsP == UNPROVIDED )
    {
      allow_partial_interpsP = T;
    }
    if( lexicon == UNPROVIDED )
    {
      lexicon = etl_data_lexicon( UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cycl_terms = NIL;
    while ( NIL == cycl_terms && NIL != string_utilities.non_empty_string_p( string ))
    {
      final SubLObject iterator_var = nl_parsing_api.string_phrasal_meanings_iterator( string, ConsesLow.list( $kw44$LEXICON, lexicon, $kw45$FILTER, $etl_data_filter_spec$.getDynamicValue( thread ) ) );
      SubLObject valid;
      for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
      {
        thread.resetMultipleValues();
        final SubLObject nl_interp = iteration.iteration_next( iterator_var );
        valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid )
        {
          final SubLObject item_var = narts_high.nart_substitute( nl_api_datastructures.get_nl_interp_cycl( nl_interp ) );
          if( NIL == conses_high.member( item_var, cycl_terms, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            cycl_terms = ConsesLow.cons( item_var, cycl_terms );
          }
        }
      }
      if( NIL != allow_partial_interpsP )
      {
        string = remove_first_word( string );
      }
      else
      {
        string = $str46$;
      }
    }
    return Sequences.nreverse( cycl_terms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 11500L)
  public static SubLObject np_stringP(final SubLObject string)
  {
    final SubLObject v_parse_tree = parser.stanford_parse( string, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject np_trees = cdolist_list_var = abstract_lexicon.tree_nps( v_parse_tree, UNPROVIDED );
    SubLObject np_tree = NIL;
    np_tree = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject tree_words = list_utilities.remove_if_not( $sym47$STRINGP, list_utilities.flatten( np_tree ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != string_utilities.starts_with( string, tree_words.first() ) && NIL != string_utilities.ends_with( string, conses_high.last( tree_words, UNPROVIDED ).first(), UNPROVIDED ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      np_tree = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 11955L)
  public static SubLObject remove_first_word(final SubLObject string)
  {
    final SubLObject strings = string_utilities.split_string( string, UNPROVIDED );
    return string_utilities.left_trim_whitespace( string_utilities.replace_substring_once( string, strings.first(), $str46$, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 12133L)
  public static SubLObject term_log_idf_from_kb(final SubLObject v_term)
  {
    SubLObject generality_estimate = cardinality_estimates.generality_estimate( v_term );
    if( generality_estimate.numLE( ONE_INTEGER ) )
    {
      generality_estimate = TWO_INTEGER;
    }
    return Numbers.divide( ONE_INTEGER, Numbers.log( generality_estimate, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 12476L)
  public static SubLObject best_types_ordered_by_tfXidf(final SubLObject term_lists, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const17$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term_count_dict = dictionary.new_dictionary( EQUAL, UNPROVIDED );
    final SubLObject term_list_length = Sequences.length( term_lists );
    SubLObject term_sets = NIL;
    SubLObject cdolist_list_var = term_lists;
    SubLObject term_list = NIL;
    term_list = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject term_set = set.new_set( UNPROVIDED, UNPROVIDED );
      SubLObject cdolist_list_var_$8 = term_list;
      SubLObject v_term = NIL;
      v_term = cdolist_list_var_$8.first();
      while ( NIL != cdolist_list_var_$8)
      {
        SubLObject cdolist_list_var_$9;
        final SubLObject upwards_closure = cdolist_list_var_$9 = ( ( NIL != fort_types_interface.collection_p( v_term ) ) ? data_parser_all_genls( v_term, mt ) : data_parser_all_isa( v_term, mt ) );
        SubLObject genl = NIL;
        genl = cdolist_list_var_$9.first();
        while ( NIL != cdolist_list_var_$9)
        {
          set.set_add( genl, term_set );
          cdolist_list_var_$9 = cdolist_list_var_$9.rest();
          genl = cdolist_list_var_$9.first();
        }
        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
        v_term = cdolist_list_var_$8.first();
      }
      term_sets = ConsesLow.cons( term_set, term_sets );
      cdolist_list_var = cdolist_list_var.rest();
      term_list = cdolist_list_var.first();
    }
    cdolist_list_var = term_sets;
    SubLObject term_set2 = NIL;
    term_set2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject set_contents_var = set.do_set_internal( term_set2 );
      SubLObject basis_object;
      SubLObject state;
      SubLObject elt;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        elt = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, elt ) )
        {
          dictionary_utilities.dictionary_increment( term_count_dict, elt, UNPROVIDED );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      term_set2 = cdolist_list_var.first();
    }
    SubLObject tf_idf = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( term_count_dict ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_term2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject count = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject term_frequency = Numbers.multiply( count, Numbers.multiply( new SubLObject[] { Numbers.log( count, UNPROVIDED )
      } ) );
      tf_idf = ConsesLow.cons( ConsesLow.list( v_term2, Numbers.divide( Numbers.multiply( term_frequency, term_log_idf_from_kb( v_term2 ) ), term_list_length ), term_frequency, cardinality_estimates.generality_estimate(
          v_term2 ), term_log_idf_from_kb( v_term2 ) ), tf_idf );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return Sort.sort( tf_idf, $sym48$_, $sym49$SECOND );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 14080L)
  public static SubLObject best_isas_ordered_by_tfXidf(final SubLObject term_lists, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const17$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term_count_dict = dictionary.new_dictionary( EQUAL, UNPROVIDED );
    final SubLObject term_list_length = Sequences.length( term_lists );
    SubLObject term_sets = NIL;
    SubLObject cdolist_list_var = term_lists;
    SubLObject term_list = NIL;
    term_list = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject term_set = set.new_set( UNPROVIDED, UNPROVIDED );
      SubLObject cdolist_list_var_$10 = term_list;
      SubLObject v_term = NIL;
      v_term = cdolist_list_var_$10.first();
      while ( NIL != cdolist_list_var_$10)
      {
        SubLObject cdolist_list_var_$11;
        final SubLObject upwards_closure = cdolist_list_var_$11 = isa.all_isa( v_term, mt, UNPROVIDED );
        SubLObject genl = NIL;
        genl = cdolist_list_var_$11.first();
        while ( NIL != cdolist_list_var_$11)
        {
          set.set_add( genl, term_set );
          cdolist_list_var_$11 = cdolist_list_var_$11.rest();
          genl = cdolist_list_var_$11.first();
        }
        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
        v_term = cdolist_list_var_$10.first();
      }
      term_sets = ConsesLow.cons( term_set, term_sets );
      cdolist_list_var = cdolist_list_var.rest();
      term_list = cdolist_list_var.first();
    }
    cdolist_list_var = term_sets;
    SubLObject term_set2 = NIL;
    term_set2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject set_contents_var = set.do_set_internal( term_set2 );
      SubLObject basis_object;
      SubLObject state;
      SubLObject elt;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        elt = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, elt ) )
        {
          dictionary_utilities.dictionary_increment( term_count_dict, elt, UNPROVIDED );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      term_set2 = cdolist_list_var.first();
    }
    SubLObject tf_idf = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( term_count_dict ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_term2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject count = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject term_frequency = Numbers.multiply( count, Numbers.multiply( new SubLObject[] { Numbers.log( count, UNPROVIDED )
      } ) );
      tf_idf = ConsesLow.cons( ConsesLow.list( v_term2, Numbers.divide( Numbers.multiply( term_frequency, term_log_idf_from_kb( v_term2 ) ), term_list_length ), term_frequency, cardinality_estimates.generality_estimate(
          v_term2 ), term_log_idf_from_kb( v_term2 ) ), tf_idf );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return Sort.sort( tf_idf, $sym48$_, $sym49$SECOND );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 15590L)
  public static SubLObject clear_data_parser_all_genls()
  {
    final SubLObject cs = $data_parser_all_genls_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 15590L)
  public static SubLObject remove_data_parser_all_genls(final SubLObject v_term, final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $data_parser_all_genls_caching_state$.getGlobalValue(), ConsesLow.list( v_term, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 15590L)
  public static SubLObject data_parser_all_genls_internal(final SubLObject v_term, final SubLObject mt)
  {
    return genls.all_genls( v_term, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 15590L)
  public static SubLObject data_parser_all_genls(final SubLObject v_term, final SubLObject mt)
  {
    SubLObject caching_state = $data_parser_all_genls_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym50$DATA_PARSER_ALL_GENLS, $sym51$_DATA_PARSER_ALL_GENLS_CACHING_STATE_, $int52$5000, EQUAL, TWO_INTEGER, ZERO_INTEGER );
      memoization_state.register_genls_dependent_cache_clear_callback( $sym53$CLEAR_DATA_PARSER_ALL_GENLS );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( v_term, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( v_term.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( data_parser_all_genls_internal( v_term, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 15748L)
  public static SubLObject clear_data_parser_all_isa()
  {
    final SubLObject cs = $data_parser_all_isa_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 15748L)
  public static SubLObject remove_data_parser_all_isa(final SubLObject v_term, final SubLObject mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $data_parser_all_isa_caching_state$.getGlobalValue(), ConsesLow.list( v_term, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 15748L)
  public static SubLObject data_parser_all_isa_internal(final SubLObject v_term, final SubLObject mt)
  {
    return isa.all_isa( v_term, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 15748L)
  public static SubLObject data_parser_all_isa(final SubLObject v_term, final SubLObject mt)
  {
    SubLObject caching_state = $data_parser_all_isa_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym54$DATA_PARSER_ALL_ISA, $sym55$_DATA_PARSER_ALL_ISA_CACHING_STATE_, $int52$5000, EQUAL, TWO_INTEGER, ZERO_INTEGER );
      memoization_state.register_isa_dependent_cache_clear_callback( $sym56$CLEAR_DATA_PARSER_ALL_ISA );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( v_term, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( v_term.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( data_parser_all_isa_internal( v_term, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/data-parser.lisp", position = 15901L)
  public static SubLObject best_types_for_strings_ordered_by_tfXidf(final SubLObject string_list, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const17$InferencePSC;
    }
    final SubLObject terms = Mapping.mapcar( $sym57$ETL_PARSE_VALUE, string_list );
    return best_types_ordered_by_tfXidf( terms, mt );
  }

  public static SubLObject declare_data_parser_file()
  {
    SubLFiles.declareFunction( me, "semantic_etl_parse_data", "SEMANTIC-ETL-PARSE-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "semantic_etl_acquire_and_add_data", "SEMANTIC-ETL-ACQUIRE-AND-ADD-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "semantic_etl_acquire_data_list", "SEMANTIC-ETL-ACQUIRE-DATA-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "semantic_etl_acquire_data", "SEMANTIC-ETL-ACQUIRE-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "semantic_etl_add_data_list", "SEMANTIC-ETL-ADD-DATA-LIST", 2, 1, false );
    SubLFiles.declareFunction( me, "semantic_etl_add_data", "SEMANTIC-ETL-ADD-DATA", 2, 1, false );
    SubLFiles.declareFunction( me, "convert_values_semantics_to_boolean_values", "CONVERT-VALUES-SEMANTICS-TO-BOOLEAN-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "semantic_etl_parse_value", "SEMANTIC-ETL-PARSE-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "semantic_etl_parse_value_int_internal", "SEMANTIC-ETL-PARSE-VALUE-INT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "semantic_etl_parse_value_int", "SEMANTIC-ETL-PARSE-VALUE-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "semantic_etl_all_isa", "SEMANTIC-ETL-ALL-ISA", 1, 0, false );
    SubLFiles.declareFunction( me, "semantic_etl_irrelevant_termP", "SEMANTIC-ETL-IRRELEVANT-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_semantic_etl_upper_ontology_termP", "CLEAR-SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_semantic_etl_upper_ontology_termP", "REMOVE-SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "semantic_etl_upper_ontology_termP_internal", "SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "semantic_etl_upper_ontology_termP", "SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "etl_metadata_lexicon", "ETL-METADATA-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "etl_data_lexicon", "ETL-DATA-LEXICON", 0, 1, false );
    SubLFiles.declareFunction( me, "etl_parse_value_trampoline", "ETL-PARSE-VALUE-TRAMPOLINE", 1, 2, false );
    SubLFiles.declareFunction( me, "etl_parse_value", "ETL-PARSE-VALUE", 1, 2, false );
    SubLFiles.declareFunction( me, "np_stringP", "NP-STRING?", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_first_word", "REMOVE-FIRST-WORD", 1, 0, false );
    SubLFiles.declareFunction( me, "term_log_idf_from_kb", "TERM-LOG-IDF-FROM-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "best_types_ordered_by_tfXidf", "BEST-TYPES-ORDERED-BY-TF.IDF", 1, 1, false );
    SubLFiles.declareFunction( me, "best_isas_ordered_by_tfXidf", "BEST-ISAS-ORDERED-BY-TF.IDF", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_data_parser_all_genls", "CLEAR-DATA-PARSER-ALL-GENLS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_data_parser_all_genls", "REMOVE-DATA-PARSER-ALL-GENLS", 2, 0, false );
    SubLFiles.declareFunction( me, "data_parser_all_genls_internal", "DATA-PARSER-ALL-GENLS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "data_parser_all_genls", "DATA-PARSER-ALL-GENLS", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_data_parser_all_isa", "CLEAR-DATA-PARSER-ALL-ISA", 0, 0, false );
    new $clear_data_parser_all_isa$ZeroArityFunction();
    SubLFiles.declareFunction( me, "remove_data_parser_all_isa", "REMOVE-DATA-PARSER-ALL-ISA", 2, 0, false );
    SubLFiles.declareFunction( me, "data_parser_all_isa_internal", "DATA-PARSER-ALL-ISA-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "data_parser_all_isa", "DATA-PARSER-ALL-ISA", 2, 0, false );
    SubLFiles.declareFunction( me, "best_types_for_strings_ordered_by_tfXidf", "BEST-TYPES-FOR-STRINGS-ORDERED-BY-TF.IDF", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_data_parser_file()
  {
    $data_parser_row_sampling_limit$ = SubLFiles.defparameter( "*DATA-PARSER-ROW-SAMPLING-LIMIT*", TWENTY_INTEGER );
    $bottom_of_upper_ontology$ = SubLFiles.defparameter( "*BOTTOM-OF-UPPER-ONTOLOGY*", $const18$IntentionalMentalSituation );
    $bottom_of_upper_ontology_generality_estimate$ = SubLFiles.defparameter( "*BOTTOM-OF-UPPER-ONTOLOGY-GENERALITY-ESTIMATE*", NIL );
    $semantic_etl_upper_ontology_termP_caching_state$ = SubLFiles.deflexical( "*SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?-CACHING-STATE*", NIL );
    $etl_data_lexicon$ = SubLFiles.defparameter( "*ETL-DATA-LEXICON*", NIL );
    $etl_metadata_lexicon$ = SubLFiles.defparameter( "*ETL-METADATA-LEXICON*", NIL );
    $etl_data_filter_spec$ = SubLFiles.defparameter( "*ETL-DATA-FILTER-SPEC*", $list22 );
    $data_parser_all_genls_caching_state$ = SubLFiles.deflexical( "*DATA-PARSER-ALL-GENLS-CACHING-STATE*", NIL );
    $data_parser_all_isa_caching_state$ = SubLFiles.deflexical( "*DATA-PARSER-ALL-ISA-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_data_parser_file()
  {
    memoization_state.note_memoized_function( $sym11$SEMANTIC_ETL_PARSE_VALUE_INT );
    memoization_state.note_globally_cached_function( $sym19$SEMANTIC_ETL_UPPER_ONTOLOGY_TERM_ );
    memoization_state.note_globally_cached_function( $sym50$DATA_PARSER_ALL_GENLS );
    memoization_state.note_globally_cached_function( $sym54$DATA_PARSER_ALL_ISA );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_data_parser_file();
  }

  @Override
  public void initializeVariables()
  {
    init_data_parser_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_data_parser_file();
  }
  static
  {
    me = new data_parser();
    $data_parser_row_sampling_limit$ = null;
    $bottom_of_upper_ontology$ = null;
    $bottom_of_upper_ontology_generality_estimate$ = null;
    $semantic_etl_upper_ontology_termP_caching_state$ = null;
    $etl_data_lexicon$ = null;
    $etl_metadata_lexicon$ = null;
    $etl_data_filter_spec$ = null;
    $data_parser_all_genls_caching_state$ = null;
    $data_parser_all_isa_caching_state$ = null;
    $sym0$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $sym1$SEMANTICS_P = makeSymbol( "SEMANTICS-P" );
    $str2$Problem_opening_connection_to_dat = makeString( "Problem opening connection to database ~s" );
    $str3$select___from_ = makeString( "select * from " );
    $str4$_LIMIT_ = makeString( " LIMIT " );
    $str5$_ = makeString( ";" );
    $str6$Expected__a_columns_but_got_a_row = makeString( "Expected ~a columns but got a row with ~a columns: ~s" );
    $kw7$UNDETERMINED = makeKeyword( "UNDETERMINED" );
    $str8$bool = makeString( "bool" );
    $str9$f = makeString( "f" );
    $str10$t = makeString( "t" );
    $sym11$SEMANTIC_ETL_PARSE_VALUE_INT = makeSymbol( "SEMANTIC-ETL-PARSE-VALUE-INT" );
    $sym12$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const13$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym14$SEMANTIC_ETL_IRRELEVANT_TERM_ = makeSymbol( "SEMANTIC-ETL-IRRELEVANT-TERM?" );
    $sym15$SEMANTIC_ETL_ALL_ISA = makeSymbol( "SEMANTIC-ETL-ALL-ISA" );
    $sym16$ALL_GENLS = makeSymbol( "ALL-GENLS" );
    $const17$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $const18$IntentionalMentalSituation = constant_handles.reader_make_constant_shell( makeString( "IntentionalMentalSituation" ) );
    $sym19$SEMANTIC_ETL_UPPER_ONTOLOGY_TERM_ = makeSymbol( "SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?" );
    $sym20$_SEMANTIC_ETL_UPPER_ONTOLOGY_TERM__CACHING_STATE_ = makeSymbol( "*SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?-CACHING-STATE*" );
    $int21$100000 = makeInteger( 100000 );
    $list22 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ConceptFilterSpecificationFn" ) ), constant_handles.reader_make_constant_shell( makeString(
        "TaxonomyOfEasilyUnderstandableConcepts" ) ), constant_handles.reader_make_constant_shell( makeString( "ConceptOnlyFilterParameter" ) ), constant_handles.reader_make_constant_shell( makeString(
            "TriggerFromConcept" ) ) );
    $sym23$ADD_LEARNER = makeSymbol( "ADD-LEARNER" );
    $sym24$SIMPLE_DATE_FROM_STRING_LEARN = makeSymbol( "SIMPLE-DATE-FROM-STRING-LEARN" );
    $sym25$NUMBER_LEARN = makeSymbol( "NUMBER-LEARN" );
    $sym26$EXCLUDE_PREDICATE = makeSymbol( "EXCLUDE-PREDICATE" );
    $const27$middleName = constant_handles.reader_make_constant_shell( makeString( "middleName" ) );
    $const28$familyName = constant_handles.reader_make_constant_shell( makeString( "familyName" ) );
    $const29$lastName = constant_handles.reader_make_constant_shell( makeString( "lastName" ) );
    $const30$ksTermString = constant_handles.reader_make_constant_shell( makeString( "ksTermString" ) );
    $sym31$ALLOW_PREDICATE = makeSymbol( "ALLOW-PREDICATE" );
    $const32$countryCodeDigraph = constant_handles.reader_make_constant_shell( makeString( "countryCodeDigraph" ) );
    $const33$countryCodeTrigraph = constant_handles.reader_make_constant_shell( makeString( "countryCodeTrigraph" ) );
    $sym34$SET_CASE_SENSITIVITY = makeSymbol( "SET-CASE-SENSITIVITY" );
    $kw35$PREFERRED = makeKeyword( "PREFERRED" );
    $sym36$FORBID_MT = makeSymbol( "FORBID-MT" );
    $const37$CyclishMt = constant_handles.reader_make_constant_shell( makeString( "CyclishMt" ) );
    $const38$ComputereseLexicalMt = constant_handles.reader_make_constant_shell( makeString( "ComputereseLexicalMt" ) );
    $sym39$EXCLUDE_POS = makeSymbol( "EXCLUDE-POS" );
    $const40$Verb = constant_handles.reader_make_constant_shell( makeString( "Verb" ) );
    $str41$DBFusionLexicalMt = makeString( "DBFusionLexicalMt" );
    $sym42$ALLOW_MT = makeSymbol( "ALLOW-MT" );
    $const43$DBFusionLexicalMt = constant_handles.reader_make_constant_shell( makeString( "DBFusionLexicalMt" ) );
    $kw44$LEXICON = makeKeyword( "LEXICON" );
    $kw45$FILTER = makeKeyword( "FILTER" );
    $str46$ = makeString( "" );
    $sym47$STRINGP = makeSymbol( "STRINGP" );
    $sym48$_ = makeSymbol( ">" );
    $sym49$SECOND = makeSymbol( "SECOND" );
    $sym50$DATA_PARSER_ALL_GENLS = makeSymbol( "DATA-PARSER-ALL-GENLS" );
    $sym51$_DATA_PARSER_ALL_GENLS_CACHING_STATE_ = makeSymbol( "*DATA-PARSER-ALL-GENLS-CACHING-STATE*" );
    $int52$5000 = makeInteger( 5000 );
    $sym53$CLEAR_DATA_PARSER_ALL_GENLS = makeSymbol( "CLEAR-DATA-PARSER-ALL-GENLS" );
    $sym54$DATA_PARSER_ALL_ISA = makeSymbol( "DATA-PARSER-ALL-ISA" );
    $sym55$_DATA_PARSER_ALL_ISA_CACHING_STATE_ = makeSymbol( "*DATA-PARSER-ALL-ISA-CACHING-STATE*" );
    $sym56$CLEAR_DATA_PARSER_ALL_ISA = makeSymbol( "CLEAR-DATA-PARSER-ALL-ISA" );
    $sym57$ETL_PARSE_VALUE = makeSymbol( "ETL-PARSE-VALUE" );
  }

  public static final class $clear_data_parser_all_isa$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $clear_data_parser_all_isa$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CLEAR-DATA-PARSER-ALL-ISA" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return clear_data_parser_all_isa();
    }
  }
}
/*
 * 
 * Total time: 254 ms
 * 
 */