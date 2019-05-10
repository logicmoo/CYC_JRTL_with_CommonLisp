package com.cyc.cycjava.cycl.sksi.create_sks;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.sksi.sksi_database_fusion;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_create_sks
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.create_sks.sksi_create_sks";
  public static final String myFingerPrint = "e4f421d2726f41f2041a1b8bda75504380b8fb9a78c6097034f1a26d62cbe64a";
  private static final SubLObject $const0$Database_Physical;
  private static final SubLObject $const1$FileHashTable_File;
  private static final SubLString $str2$Cannot_create_SKS_of_type__s_;
  private static final SubLString $str3$SKSI_SQL_statement_cache_;
  private static final SubLString $str4$ALTER_TABLE_;
  private static final SubLString $str5$_ADD_;
  private static final SubLObject $const6$PostgreSQL;
  private static final SubLString $str7$CREATE_DATABASE_;
  private static final SubLString $str8$_OWNER_;
  private static final SubLObject $const9$MySQL_TheProgram;
  private static final SubLString $str10$Continue_w_o_creating_the_databas;
  private static final SubLString $str11$The_sql_flavor__A_for__A_is_not_y;
  private static final SubLString $str12$Continue_w_o_creating_the_knowled;
  private static final SubLString $str13$__SKSI__A_;
  private static final SubLString $str14$SQL_update_success_result_unknown;
  private static final SubLString $str15$SQL_CREATE_DATABASE_success_resul;
  private static final SubLString $str16$CREATE_TABLE_;
  private static final SubLString $str17$__;
  private static final SubLObject $const18$foreignKeyMap;
  private static final SubLObject $const19$foreignKeyMap_Restrict;
  private static final SubLObject $const20$foreignKeyMap_Cascade;
  private static final SubLObject $const21$foreignKeyMap_SetNull;
  private static final SubLObject $const22$foreignKeyMap_SetDefault;
  private static final SubLString $str23$__;
  private static final SubLString $str24$___;
  private static final SubLString $str25$;
  private static final SubLString $str26$_SERIAL;
  private static final SubLString $str27$_;
  private static final SubLString $str28$_DEFAULT_;
  private static final SubLString $str29$_NOT_NULL;
  private static final SubLList $list30;
  private static final SubLString $str31$CREATE_SEQUENCE_;
  private static final SubLString $str32$PRIMARY_KEY__;
  private static final SubLString $str33$_;
  private static final SubLSymbol $sym34$PHYSICAL_FIELD_NAME;
  private static final SubLString $str35$UNIQUE__;
  private static final SubLString $str36$___;
  private static final SubLList $list37;
  private static final SubLString $str38$FOREIGN_KEY__;
  private static final SubLString $str39$__REFERENCES_;
  private static final SubLString $str40$_ON_DELETE_RESTRICT;
  private static final SubLString $str41$_ON_DELETE_CASCADE;
  private static final SubLString $str42$_ON_DELETE_SET_NULL;
  private static final SubLString $str43$_ON_DELETE_SET_DEFAULT;
  private static final SubLString $str44$Continue_w_o_creating_the_index;
  private static final SubLString $str45$_A_is_not_a_valid_foreign_key_pre;
  private static final SubLString $str46$CREATE_INDEX_;
  private static final SubLString $str47$_ON_;
  private static final SubLString $str48$_USING_;
  private static final SubLObject $const49$WorldWideWebPageCopy;
  private static final SubLString $str50$Web_page_deletion_is_not_supporte;
  private static final SubLString $str51$Cannot_drop_SKS_of_type__s_;
  private static final SubLString $str52$Drop__A__Can_t_drop_tables_yet_;
  private static final SubLSymbol $sym53$_MYSQL_THEPROGRAM;
  private static final SubLString $str54$DROP_DATABASE_;
  private static final SubLString $str55$Continue_w_o_dropping_the_databas;
  private static final SubLString $str56$SQL_CREATE_DATABASE_dropt_result_;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 1227L)
  public static SubLObject sksi_create_structured_knowledge_source(final SubLObject sks, SubLObject mapping_mt)
  {
    if( mapping_mt == UNPROVIDED )
    {
      mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sks );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        if( NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP() )
        {
          final SubLObject mt_var = mapping_mt;
          final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
            final SubLObject pcase_var;
            final SubLObject sks_type = pcase_var = sksi_access_path.determine_sks_type( sks, UNPROVIDED );
            if( pcase_var.eql( $const0$Database_Physical ) )
            {
              result = sksi_create_structured_knowledge_source_db( sks );
            }
            else if( pcase_var.eql( $const1$FileHashTable_File ) )
            {
              result = sksi_create_structured_knowledge_source_fht( sks );
            }
            else
            {
              Errors.warn( $str2$Cannot_create_SKS_of_type__s_, sks_type );
            }
          }
          finally
          {
            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$mt$.rebind( _prev_bind_0_$1, thread );
          }
        }
        else
        {
          final SubLObject _prev_bind_0_$2 = sksi_macros.$sksi_sql_connection_cache$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sksi_macros.$sksi_sql_statement_cache$.currentBinding( thread );
          final SubLObject _prev_bind_5 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding( thread );
          try
          {
            sksi_macros.$sksi_sql_connection_cache$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQUALP ), UNPROVIDED ), thread );
            sksi_macros.$sksi_sql_statement_cache$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ), thread );
            sksi_macros.$sksi_sql_statement_pool_lock$.bind( Locks.make_lock( Strings.string( Symbols.gensym( $str3$SKSI_SQL_statement_cache_ ) ) ), thread );
            SubLObject resourcing_caches_finalizedP = NIL;
            try
            {
              final SubLObject mt_var2 = mapping_mt;
              final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$mt$.currentBinding( thread );
              final SubLObject _prev_bind_1_$4 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
              final SubLObject _prev_bind_2_$5 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
              try
              {
                mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var2 ), thread );
                mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var2 ), thread );
                mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var2 ), thread );
                final SubLObject pcase_var2;
                final SubLObject sks_type2 = pcase_var2 = sksi_access_path.determine_sks_type( sks, UNPROVIDED );
                if( pcase_var2.eql( $const0$Database_Physical ) )
                {
                  result = sksi_create_structured_knowledge_source_db( sks );
                }
                else if( pcase_var2.eql( $const1$FileHashTable_File ) )
                {
                  result = sksi_create_structured_knowledge_source_fht( sks );
                }
                else
                {
                  Errors.warn( $str2$Cannot_create_SKS_of_type__s_, sks_type2 );
                }
              }
              finally
              {
                mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$5, thread );
                mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$4, thread );
                mt_relevance_macros.$mt$.rebind( _prev_bind_0_$3, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                try
                {
                  resourcing_caches_finalizedP = sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                }
                finally
                {
                  final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values_$8 = Values.getValuesAsVector();
                    if( NIL == resourcing_caches_finalizedP )
                    {
                      sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                    }
                    Values.restoreValuesFromVector( _values_$8 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
                  }
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
              }
            }
          }
          finally
          {
            sksi_macros.$sksi_sql_statement_pool_lock$.rebind( _prev_bind_5, thread );
            sksi_macros.$sksi_sql_statement_cache$.rebind( _prev_bind_4, thread );
            sksi_macros.$sksi_sql_connection_cache$.rebind( _prev_bind_0_$2, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 2217L)
  public static SubLObject sksi_create_structured_knowledge_source_db(final SubLObject sks)
  {
    if( NIL != sksi_infrastructure_utilities.top_level_knowledge_source_p( sks ) )
    {
      return sksi_create_structured_knowledge_source_db_int( sks );
    }
    return sksi_create_atomic_structured_knowledge_source( sks, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 2460L)
  public static SubLObject sksi_create_structured_knowledge_source_db_int(final SubLObject sks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject create_db_result = sksi_create_db( sks );
    if( NIL == sksi_database_fusion.sksi_database_fusion_debugP() && NIL == create_db_result )
    {
      return NIL;
    }
    final SubLObject sub_kses = sksi_kb_accessors.sk_source_immediate_spec_sk_sources( sks, UNPROVIDED );
    final SubLObject foreign_key_constraints = dictionary.new_dictionary( Symbols.symbol_function( EQ ), Sequences.length( sub_kses ) );
    SubLObject cdolist_list_var = sub_kses;
    SubLObject sub_ks = NIL;
    sub_ks = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject ps = sksi_kb_accessors.sk_source_physical_schemata( sub_ks ).first();
      thread.resetMultipleValues();
      final SubLObject sub_ks_successP = sksi_create_atomic_structured_knowledge_source_db( sub_ks, ps, T );
      final SubLObject sub_ks_foreign_key_constraints = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != sub_ks_successP && NIL != sub_ks_foreign_key_constraints )
      {
        dictionary.dictionary_enter( foreign_key_constraints, sub_ks, sub_ks_foreign_key_constraints );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sub_ks = cdolist_list_var.first();
    }
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( foreign_key_constraints ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      sub_ks = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject sub_ks_foreign_key_constraints2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      sksi_add_table_foreign_key_constraints( sub_ks, sub_ks_foreign_key_constraints2 );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return sub_kses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 3580L)
  public static SubLObject sksi_add_table_foreign_key_constraints(final SubLObject sks, final SubLObject foreign_key_constraints)
  {
    final SubLObject access_path = sksi_access_path.external_source_access_path( sks, UNPROVIDED, UNPROVIDED );
    final SubLObject sks_name = sksi_kb_accessors.sk_source_name( sks );
    final SubLObject base_sql = Sequences.cconcatenate( $str4$ALTER_TABLE_, new SubLObject[] { sks_name, $str5$_ADD_
    } );
    SubLObject cdolist_list_var = foreign_key_constraints;
    SubLObject foreign_key_constraint = NIL;
    foreign_key_constraint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject sql = Sequences.cconcatenate( base_sql, foreign_key_constraint );
      sksi_sks_interaction.sksi_execute_sql_update( sql, access_path );
      cdolist_list_var = cdolist_list_var.rest();
      foreign_key_constraint = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 4014L)
  public static SubLObject sksi_create_structured_knowledge_source_fht(final SubLObject sks)
  {
    return sksi_create_atomic_structured_knowledge_source( sks, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 4154L)
  public static SubLObject sksi_create_db(final SubLObject sks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject access_path = sksi_access_path.external_source_access_path( sks, UNPROVIDED, UNPROVIDED );
    final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor( access_path );
    final SubLObject default_db = sksi_kb_accessors.default_sks_for_database_server_program( sql_flavor );
    SubLObject successP = NIL;
    if( NIL != default_db )
    {
      final SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt( default_db );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject default_db_access_path = sksi_access_path.external_source_access_path( default_db, UNPROVIDED, UNPROVIDED );
        final SubLObject sql = make_create_database_sql( access_path );
        sksi_access_path.adjust_server_of_access_path( default_db_access_path, sksi_access_path.access_path_server( access_path ) );
        if( sql.isString() )
        {
          final SubLObject creation_result = sksi_sks_interaction.sksi_execute_sql_update( sql, default_db_access_path );
          if( NIL != execute_sql_create_success_result_p( creation_result, sql_flavor ) )
          {
            successP = T;
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 4962L)
  public static SubLObject make_create_database_sql(final SubLObject access_path)
  {
    final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor( access_path );
    final SubLObject sks_name = sksi_access_path.access_path_db( access_path );
    final SubLObject sks_user = sksi_access_path.access_path_user( access_path );
    final SubLObject pcase_var = sql_flavor;
    if( pcase_var.eql( $const6$PostgreSQL ) )
    {
      return ( sks_name.isString() && sks_user.isString() ) ? Sequences.cconcatenate( $str7$CREATE_DATABASE_, new SubLObject[] { format_nil.format_nil_a_no_copy( sks_name ), $str8$_OWNER_, format_nil
          .format_nil_a_no_copy( sks_user )
      } ) : NIL;
    }
    if( pcase_var.eql( $const9$MySQL_TheProgram ) )
    {
      return sks_name.isString() ? Sequences.cconcatenate( $str7$CREATE_DATABASE_, format_nil.format_nil_a_no_copy( sks_name ) ) : NIL;
    }
    Errors.cerror( $str10$Continue_w_o_creating_the_databas, $str11$The_sql_flavor__A_for__A_is_not_y, sql_flavor, sksi_access_path.access_path_sks( access_path ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 5693L)
  public static SubLObject sksi_create_atomic_structured_knowledge_source(final SubLObject sks, SubLObject physical_schema, SubLObject mapping_mt)
  {
    if( physical_schema == UNPROVIDED )
    {
      physical_schema = NIL;
    }
    if( mapping_mt == UNPROVIDED )
    {
      mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sks );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        if( NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP() )
        {
          final SubLObject mt_var = mapping_mt;
          final SubLObject _prev_bind_0_$10 = mt_relevance_macros.$mt$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
            mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
            final SubLObject sks_type = sksi_access_path.determine_sks_type( sks, UNPROVIDED );
            if( NIL == physical_schema )
            {
              physical_schema = sksi_kb_accessors.sk_source_physical_schemata( sks ).first();
            }
            final SubLObject pcase_var = sks_type;
            if( pcase_var.eql( $const0$Database_Physical ) )
            {
              result = sksi_create_atomic_structured_knowledge_source_db( sks, physical_schema, UNPROVIDED );
            }
            else if( pcase_var.eql( $const1$FileHashTable_File ) )
            {
              result = sksi_create_atomic_structured_knowledge_source_fht( sks, physical_schema );
            }
            else
            {
              Errors.warn( $str2$Cannot_create_SKS_of_type__s_, sks_type );
            }
          }
          finally
          {
            mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$mt$.rebind( _prev_bind_0_$10, thread );
          }
        }
        else
        {
          final SubLObject _prev_bind_0_$11 = sksi_macros.$sksi_sql_connection_cache$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sksi_macros.$sksi_sql_statement_cache$.currentBinding( thread );
          final SubLObject _prev_bind_5 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding( thread );
          try
          {
            sksi_macros.$sksi_sql_connection_cache$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQUALP ), UNPROVIDED ), thread );
            sksi_macros.$sksi_sql_statement_cache$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ), thread );
            sksi_macros.$sksi_sql_statement_pool_lock$.bind( Locks.make_lock( Strings.string( Symbols.gensym( $str3$SKSI_SQL_statement_cache_ ) ) ), thread );
            SubLObject resourcing_caches_finalizedP = NIL;
            try
            {
              final SubLObject mt_var2 = mapping_mt;
              final SubLObject _prev_bind_0_$12 = mt_relevance_macros.$mt$.currentBinding( thread );
              final SubLObject _prev_bind_1_$13 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
              final SubLObject _prev_bind_2_$14 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
              try
              {
                mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var2 ), thread );
                mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var2 ), thread );
                mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var2 ), thread );
                final SubLObject sks_type2 = sksi_access_path.determine_sks_type( sks, UNPROVIDED );
                if( NIL == physical_schema )
                {
                  physical_schema = sksi_kb_accessors.sk_source_physical_schemata( sks ).first();
                }
                final SubLObject pcase_var2 = sks_type2;
                if( pcase_var2.eql( $const0$Database_Physical ) )
                {
                  result = sksi_create_atomic_structured_knowledge_source_db( sks, physical_schema, UNPROVIDED );
                }
                else if( pcase_var2.eql( $const1$FileHashTable_File ) )
                {
                  result = sksi_create_atomic_structured_knowledge_source_fht( sks, physical_schema );
                }
                else
                {
                  Errors.warn( $str2$Cannot_create_SKS_of_type__s_, sks_type2 );
                }
              }
              finally
              {
                mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$14, thread );
                mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$13, thread );
                mt_relevance_macros.$mt$.rebind( _prev_bind_0_$12, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                try
                {
                  resourcing_caches_finalizedP = sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                }
                finally
                {
                  final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values_$17 = Values.getValuesAsVector();
                    if( NIL == resourcing_caches_finalizedP )
                    {
                      sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                    }
                    Values.restoreValuesFromVector( _values_$17 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$14, thread );
                  }
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
              }
            }
          }
          finally
          {
            sksi_macros.$sksi_sql_statement_pool_lock$.rebind( _prev_bind_5, thread );
            sksi_macros.$sksi_sql_statement_cache$.rebind( _prev_bind_4, thread );
            sksi_macros.$sksi_sql_connection_cache$.rebind( _prev_bind_0_$11, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$15, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 6807L)
  public static SubLObject sksi_create_atomic_structured_knowledge_source_db(final SubLObject sks, final SubLObject ps, SubLObject return_foreign_key_constraintsP)
  {
    if( return_foreign_key_constraintsP == UNPROVIDED )
    {
      return_foreign_key_constraintsP = NIL;
    }
    final SubLObject access_path = sksi_access_path.external_source_access_path( sks, UNPROVIDED, UNPROVIDED );
    final SubLObject sks_name = sksi_kb_accessors.sk_source_name( sks );
    if( NIL != sks_name && NIL != sksi_access_path.access_path_p( access_path ) )
    {
      return sksi_create_db_table_source( sks, sks_name, access_path, ps, return_foreign_key_constraintsP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 7305L)
  public static SubLObject sksi_create_db_table_source(final SubLObject sks, final SubLObject sks_name, final SubLObject access_path, final SubLObject ps, SubLObject return_foreign_key_constraintsP)
  {
    if( return_foreign_key_constraintsP == UNPROVIDED )
    {
      return_foreign_key_constraintsP = NIL;
    }
    final SubLObject pcase_var;
    final SubLObject sql_flavor = pcase_var = sksi_access_path.access_path_sql_flavor( access_path );
    if( pcase_var.eql( $const6$PostgreSQL ) )
    {
      return sksi_create_db_table_source_postgresql( sks, sks_name, access_path, ps, return_foreign_key_constraintsP );
    }
    if( pcase_var.eql( $const9$MySQL_TheProgram ) )
    {
      return sksi_create_db_table_source_my_sql( sks, sks_name, access_path, ps, return_foreign_key_constraintsP );
    }
    return Errors.cerror( $str12$Continue_w_o_creating_the_knowled, $str11$The_sql_flavor__A_for__A_is_not_y, sql_flavor, sks );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 8189L)
  public static SubLObject sksi_create_db_table_source_postgresql(final SubLObject sks, final SubLObject sks_name, final SubLObject access_path, final SubLObject ps, SubLObject return_foreign_key_constraintsP)
  {
    if( return_foreign_key_constraintsP == UNPROVIDED )
    {
      return_foreign_key_constraintsP = NIL;
    }
    return sksi_create_db_table_source_int( sks, sks_name, access_path, ps, return_foreign_key_constraintsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 8466L)
  public static SubLObject sksi_create_db_table_source_my_sql(final SubLObject sks, final SubLObject sks_name, final SubLObject access_path, final SubLObject ps, SubLObject return_foreign_key_constraintsP)
  {
    if( return_foreign_key_constraintsP == UNPROVIDED )
    {
      return_foreign_key_constraintsP = NIL;
    }
    return sksi_create_db_table_source_int( sks, sks_name, access_path, ps, return_foreign_key_constraintsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 8731L)
  public static SubLObject sksi_create_db_table_source_ms_access(final SubLObject sks, final SubLObject sks_name, final SubLObject access_path, final SubLObject ps)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 8985L)
  public static SubLObject sksi_create_db_table_source_sql_server(final SubLObject sks, final SubLObject sks_name, final SubLObject access_path, final SubLObject ps)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 9176L)
  public static SubLObject execute_sql_update_success_result_p(final SubLObject result, final SubLObject sql_flavor)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( sql_flavor.eql( $const6$PostgreSQL ) )
    {
      return subl_promotions.positive_integer_p( result );
    }
    if( sql_flavor.eql( $const9$MySQL_TheProgram ) )
    {
      return subl_promotions.positive_integer_p( result );
    }
    if( NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP( TWO_INTEGER ) )
    {
      PrintLow.format( sksi_debugging.$sksi_trace_stream$.getDynamicValue( thread ), Sequences.cconcatenate( $str13$__SKSI__A_, $str14$SQL_update_success_result_unknown ), TWO_INTEGER, sql_flavor );
      streams_high.force_output( sksi_debugging.$sksi_trace_stream$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 9545L)
  public static SubLObject execute_sql_create_success_result_p(final SubLObject result, final SubLObject sql_flavor)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( sql_flavor.eql( $const6$PostgreSQL ) )
    {
      return list_utilities.sublisp_boolean( result );
    }
    if( sql_flavor.eql( $const9$MySQL_TheProgram ) )
    {
      return subl_promotions.positive_integer_p( result );
    }
    if( NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP( TWO_INTEGER ) )
    {
      PrintLow.format( sksi_debugging.$sksi_trace_stream$.getDynamicValue( thread ), Sequences.cconcatenate( $str13$__SKSI__A_, $str15$SQL_CREATE_DATABASE_success_resul ), TWO_INTEGER, sql_flavor );
      streams_high.force_output( sksi_debugging.$sksi_trace_stream$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 9957L)
  public static SubLObject sksi_create_db_table_source_int(final SubLObject sks, final SubLObject sks_name, final SubLObject access_path, final SubLObject ps, SubLObject return_foreign_key_constraintsP)
  {
    if( return_foreign_key_constraintsP == UNPROVIDED )
    {
      return_foreign_key_constraintsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor( access_path );
    SubLObject successP = NIL;
    thread.resetMultipleValues();
    final SubLObject sql = generate_sql_for_create_table( sks_name, ps, sql_flavor, return_foreign_key_constraintsP );
    final SubLObject sequence_sql_list = thread.secondMultipleValue();
    final SubLObject foreign_key_constraints = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( sql.isString() )
    {
      if( NIL != sequence_sql_list )
      {
        SubLObject cdolist_list_var = sequence_sql_list;
        SubLObject sequence_sql = NIL;
        sequence_sql = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          sksi_sks_interaction.sksi_execute_sql_update( sequence_sql, access_path );
          cdolist_list_var = cdolist_list_var.rest();
          sequence_sql = cdolist_list_var.first();
        }
      }
      final SubLObject update_result = sksi_sks_interaction.sksi_execute_sql_update( sql, access_path );
      if( NIL != execute_sql_create_success_result_p( update_result, sql_flavor ) )
      {
        sksi_create_db_table_indexes( sks_name, access_path, ps );
        successP = T;
      }
    }
    return Values.values( successP, foreign_key_constraints );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 10778L)
  public static SubLObject generate_sql_for_create_table(final SubLObject sks_name, final SubLObject ps, final SubLObject sql_flavor, SubLObject return_foreign_key_constraints_separatelyP)
  {
    if( return_foreign_key_constraints_separatelyP == UNPROVIDED )
    {
      return_foreign_key_constraints_separatelyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject field_name_list = sksi_kb_accessors.physical_schema_field_name_list( ps );
    final SubLObject primary_key_list = sksi_kb_accessors.physical_schema_primary_key( ps );
    SubLObject sql = NIL;
    SubLObject sequence_sql = NIL;
    SubLObject foreign_key_constraints = NIL;
    thread.resetMultipleValues();
    final SubLObject field_list_sql = generate_sql_for_create_table_fields( sks_name, ps, field_name_list, primary_key_list, sql_flavor );
    final SubLObject sequences = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == string_utilities.empty_string_p( field_list_sql ) )
    {
      if( NIL != sequences )
      {
        SubLObject cdolist_list_var = sequences;
        SubLObject sequence_name = NIL;
        sequence_name = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          sequence_sql = ConsesLow.cons( generate_sql_for_create_sequence( sequence_name, sql_flavor ), sequence_sql );
          cdolist_list_var = cdolist_list_var.rest();
          sequence_name = cdolist_list_var.first();
        }
        sequence_sql = Sequences.nreverse( sequence_sql );
      }
      sql = Sequences.cconcatenate( $str16$CREATE_TABLE_, new SubLObject[] { sks_name, $str17$__, field_list_sql
      } );
      final SubLObject primary_key_sql = generate_sql_for_create_table_primary_key( primary_key_list, sql_flavor );
      final SubLObject foreign_key_tuples = sksi_kb_accessors.physical_schema_foreign_keys( ps );
      final SubLObject foreign_key_sql_list = generate_sql_for_create_table_foreign_keys( foreign_key_tuples, $const18$foreignKeyMap, sql_flavor );
      final SubLObject restrict_foreign_key_tuples = sksi_kb_accessors.physical_schema_foreign_keys_restrict( ps );
      final SubLObject restrict_foreign_key_sql_list = generate_sql_for_create_table_foreign_keys( restrict_foreign_key_tuples, $const19$foreignKeyMap_Restrict, sql_flavor );
      final SubLObject cascade_foreign_key_tuples = sksi_kb_accessors.physical_schema_foreign_keys_cascade( ps );
      final SubLObject cascade_foreign_key_sql_list = generate_sql_for_create_table_foreign_keys( cascade_foreign_key_tuples, $const20$foreignKeyMap_Cascade, sql_flavor );
      final SubLObject set_null_foreign_key_tuples = sksi_kb_accessors.physical_schema_foreign_keys_set_null( ps );
      final SubLObject set_null_foreign_key_sql_list = generate_sql_for_create_table_foreign_keys( set_null_foreign_key_tuples, $const21$foreignKeyMap_SetNull, sql_flavor );
      final SubLObject set_default_foreign_key_tuples = sksi_kb_accessors.physical_schema_foreign_keys_set_default( ps );
      final SubLObject set_default_foreign_key_sql_list = generate_sql_for_create_table_foreign_keys( set_default_foreign_key_tuples, $const22$foreignKeyMap_SetDefault, sql_flavor );
      final SubLObject unique_fields_tuples = sksi_kb_accessors.physical_schema_unique_fields_tuples( ps );
      final SubLObject unique_fields_tuples_sql = generate_sql_for_create_table_unique_fields_tuple( unique_fields_tuples, sql_flavor );
      if( primary_key_sql.isString() )
      {
        sql = Sequences.cconcatenate( sql, new SubLObject[] { $str23$__, primary_key_sql
        } );
      }
      if( NIL != foreign_key_sql_list )
      {
        foreign_key_constraints = ConsesLow.append( foreign_key_constraints, foreign_key_sql_list );
      }
      if( NIL != restrict_foreign_key_sql_list )
      {
        foreign_key_constraints = ConsesLow.append( foreign_key_constraints, restrict_foreign_key_sql_list );
      }
      if( NIL != cascade_foreign_key_sql_list )
      {
        foreign_key_constraints = ConsesLow.append( foreign_key_constraints, cascade_foreign_key_sql_list );
      }
      if( NIL != set_null_foreign_key_sql_list )
      {
        foreign_key_constraints = ConsesLow.append( foreign_key_constraints, set_null_foreign_key_sql_list );
      }
      if( NIL != set_default_foreign_key_sql_list )
      {
        foreign_key_constraints = ConsesLow.append( foreign_key_constraints, set_default_foreign_key_sql_list );
      }
      if( NIL != foreign_key_constraints && NIL == return_foreign_key_constraints_separatelyP )
      {
        sql = string_utilities.join_strings( ConsesLow.cons( sql, foreign_key_constraints ), $str23$__ );
        foreign_key_constraints = NIL;
      }
      if( unique_fields_tuples_sql.isString() )
      {
        sql = Sequences.cconcatenate( sql, new SubLObject[] { $str23$__, unique_fields_tuples_sql
        } );
      }
      sql = Sequences.cconcatenate( sql, $str24$___ );
    }
    return Values.values( sql, sequence_sql, foreign_key_constraints );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 14826L)
  public static SubLObject generate_sql_for_create_table_fields(final SubLObject sks_name, final SubLObject ps, final SubLObject field_name_list, final SubLObject primary_key_list, final SubLObject sql_flavor)
  {
    SubLObject sql = $str25$;
    final SubLObject sequences = NIL;
    SubLObject cdolist_list_var = field_name_list;
    SubLObject pf_name = NIL;
    pf_name = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pf = sksi_kb_accessors.physical_field_for_schema_and_name( ps, pf_name );
      final SubLObject pf_type_name = sksi_kb_accessors.physical_field_data_type_name( pf, sql_flavor );
      if( pf_name.isString() && pf_type_name.isString() )
      {
        sql = Sequences.cconcatenate( sql, pf_name );
        final SubLObject default_val = sksi_kb_accessors.physical_field_default_value( pf, ps, UNPROVIDED );
        final SubLObject not_null_fieldP = sksi_kb_accessors.not_null_physical_field_p( pf, ps );
        if( NIL != default_val )
        {
          if( NIL != sksi_kb_accessors.physical_field_value_is_auto_incrementedP( pf, ps ) )
          {
            if( sql_flavor.eql( $const6$PostgreSQL ) )
            {
              sql = Sequences.cconcatenate( sql, $str26$_SERIAL );
            }
            else
            {
              sql = Sequences.cconcatenate( sql, new SubLObject[] { $str27$_, pf_type_name, $str28$_DEFAULT_, string_utilities.object_to_string( default_val )
              } );
            }
          }
          else
          {
            sql = Sequences.cconcatenate( sql, new SubLObject[] { $str27$_, pf_type_name, $str28$_DEFAULT_, string_utilities.object_to_string( default_val )
            } );
          }
        }
        if( NIL != not_null_fieldP )
        {
          sql = Sequences.cconcatenate( sql, $str29$_NOT_NULL );
        }
        sql = Sequences.cconcatenate( sql, $str23$__ );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pf_name = cdolist_list_var.first();
    }
    sql = Strings.string_right_trim( $list30, sql );
    return Values.values( sql, sequences );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 16620L)
  public static SubLObject generate_sql_for_create_sequence(final SubLObject sequence_name, final SubLObject sql_flavor)
  {
    return Sequences.cconcatenate( $str31$CREATE_SEQUENCE_, sequence_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 16776L)
  public static SubLObject generate_sql_for_create_table_primary_key(final SubLObject primary_key_list, final SubLObject sql_flavor)
  {
    if( NIL != primary_key_list )
    {
      final SubLObject fields_sql = join_physical_field_names_for_physical_fields( primary_key_list );
      if( fields_sql.isString() )
      {
        return Sequences.cconcatenate( $str32$PRIMARY_KEY__, new SubLObject[] { fields_sql, $str33$_
        } );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 17094L)
  public static SubLObject join_physical_field_names_for_physical_fields(final SubLObject physical_field_list)
  {
    return string_utilities.join_strings( Mapping.mapcar( $sym34$PHYSICAL_FIELD_NAME, physical_field_list ), $str23$__ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 17258L)
  public static SubLObject generate_sql_for_create_table_unique_fields_tuple(final SubLObject unique_fields_tuples, final SubLObject sql_flavor)
  {
    if( NIL != unique_fields_tuples )
    {
      SubLObject sql = $str25$;
      SubLObject cdolist_list_var = unique_fields_tuples;
      SubLObject unique_fields_tuple = NIL;
      unique_fields_tuple = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject fields_sql = join_physical_field_names_for_physical_fields( unique_fields_tuple );
        if( fields_sql.isString() )
        {
          sql = Sequences.cconcatenate( sql, new SubLObject[] { $str35$UNIQUE__, fields_sql, $str36$___
          } );
        }
        cdolist_list_var = cdolist_list_var.rest();
        unique_fields_tuple = cdolist_list_var.first();
      }
      sql = Strings.string_right_trim( $list30, sql );
      return sql;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 17789L)
  public static SubLObject generate_sql_for_create_table_foreign_keys(final SubLObject foreign_key_tuples, SubLObject key_pred, SubLObject sql_flavor)
  {
    if( key_pred == UNPROVIDED )
    {
      key_pred = $const18$foreignKeyMap;
    }
    if( sql_flavor == UNPROVIDED )
    {
      sql_flavor = NIL;
    }
    if( NIL != foreign_key_tuples )
    {
      SubLObject sql_list = NIL;
      SubLObject cdolist_list_var = foreign_key_tuples;
      SubLObject foreign_key_tuple = NIL;
      foreign_key_tuple = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject sql = $str25$;
        SubLObject current;
        final SubLObject datum = current = foreign_key_tuple;
        SubLObject foreign_key_list = NIL;
        SubLObject referenced_physical_schema = NIL;
        SubLObject referenced_field_list = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
        foreign_key_list = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
        referenced_physical_schema = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
        referenced_field_list = current.first();
        current = current.rest();
        if( NIL == current )
        {
          sql = Sequences.cconcatenate( sql, new SubLObject[] { $str38$FOREIGN_KEY__, join_physical_field_names_for_physical_fields( foreign_key_list ), $str39$__REFERENCES_, sksi_kb_accessors.sk_source_name(
              sksi_kb_accessors.physical_schema_sk_sources( referenced_physical_schema ).first() ), $str17$__, join_physical_field_names_for_physical_fields( referenced_field_list ), $str33$_
          } );
          final SubLObject pcase_var = key_pred;
          if( !pcase_var.eql( $const18$foreignKeyMap ) )
          {
            if( pcase_var.eql( $const19$foreignKeyMap_Restrict ) )
            {
              sql = Sequences.cconcatenate( sql, $str40$_ON_DELETE_RESTRICT );
            }
            else if( pcase_var.eql( $const20$foreignKeyMap_Cascade ) )
            {
              sql = Sequences.cconcatenate( sql, $str41$_ON_DELETE_CASCADE );
            }
            else if( pcase_var.eql( $const21$foreignKeyMap_SetNull ) )
            {
              sql = Sequences.cconcatenate( sql, $str42$_ON_DELETE_SET_NULL );
            }
            else if( pcase_var.eql( $const21$foreignKeyMap_SetNull ) )
            {
              sql = Sequences.cconcatenate( sql, $str43$_ON_DELETE_SET_DEFAULT );
            }
            else
            {
              Errors.cerror( $str44$Continue_w_o_creating_the_index, $str45$_A_is_not_a_valid_foreign_key_pre, key_pred );
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list37 );
        }
        sql_list = ConsesLow.cons( sql, sql_list );
        cdolist_list_var = cdolist_list_var.rest();
        foreign_key_tuple = cdolist_list_var.first();
      }
      return Sequences.nreverse( sql_list );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 19395L)
  public static SubLObject sksi_create_db_table_indexes(final SubLObject sks_name, final SubLObject access_path, final SubLObject ps)
  {
    final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor( access_path );
    final SubLObject ps_indexes = sksi_kb_accessors.physical_schema_indexes( ps );
    SubLObject no_of_indexes = ZERO_INTEGER;
    SubLObject cdolist_list_var = ps_indexes;
    SubLObject index = NIL;
    index = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject sql = generate_sql_for_create_index( index, sks_name, sql_flavor );
      SubLObject result = NIL;
      if( sql.isString() )
      {
        result = sksi_sks_interaction.sksi_execute_sql_update( sql, access_path );
        if( NIL != execute_sql_update_success_result_p( result, sql_flavor ) )
        {
          no_of_indexes = Numbers.add( no_of_indexes, ONE_INTEGER );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      index = cdolist_list_var.first();
    }
    return no_of_indexes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 19977L)
  public static SubLObject generate_sql_for_create_index(final SubLObject index, final SubLObject sks_name, final SubLObject sql_flavor)
  {
    final SubLObject name = sksi_kb_accessors.index_name( index );
    final SubLObject type = sksi_kb_accessors.index_type( index );
    final SubLObject type_name = sksi_kb_accessors.index_type_namestring( type, sql_flavor );
    final SubLObject pf_list = sksi_kb_accessors.index_physical_fields( index );
    SubLObject sql = ( sql_flavor.eql( $const6$PostgreSQL ) && type_name.isString() ) ? Sequences.cconcatenate( $str46$CREATE_INDEX_, new SubLObject[] { format_nil.format_nil_a_no_copy( name ), $str47$_ON_, format_nil
        .format_nil_a_no_copy( sks_name ), $str48$_USING_, format_nil.format_nil_a_no_copy( type_name ), $str17$__
    } ) : Sequences.cconcatenate( $str46$CREATE_INDEX_, new SubLObject[] { format_nil.format_nil_a_no_copy( name ), $str47$_ON_, format_nil.format_nil_a_no_copy( sks_name ), $str17$__
    } );
    SubLObject cdolist_list_var = pf_list;
    SubLObject pf = NIL;
    pf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pf_name = sksi_kb_accessors.physical_field_name( pf );
      if( pf_name.isString() )
      {
        sql = Sequences.cconcatenate( sql, new SubLObject[] { pf_name, $str23$__
        } );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pf = cdolist_list_var.first();
    }
    sql = Strings.string_right_trim( $list30, sql );
    sql = Sequences.cconcatenate( sql, $str33$_ );
    return sql;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 20921L)
  public static SubLObject sksi_create_atomic_structured_knowledge_source_fht(final SubLObject sks, final SubLObject physical_schema)
  {
    final SubLObject access_path = sksi_access_path.external_source_access_path( sks, UNPROVIDED, UNPROVIDED );
    return sksi_sks_interaction.create_fht_source( access_path );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 21264L)
  public static SubLObject sksi_destroy_structured_knowledge_source(final SubLObject sks, SubLObject mapping_mt)
  {
    if( mapping_mt == UNPROVIDED )
    {
      mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sks );
    }
    if( NIL != sksi_drop_structured_knowledge_source( sks, mapping_mt ) )
    {
      return cyc_kernel.cyc_kill( sks );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 21816L)
  public static SubLObject sksi_drop_structured_knowledge_source(final SubLObject sks, SubLObject mapping_mt)
  {
    if( mapping_mt == UNPROVIDED )
    {
      mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sks );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mapping_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      sksi_sks_manager.deregister_sksi_removal_modules_for_skses( ConsesLow.list( sks ) );
      sksi_sks_interaction.sksi_reap_connection_for_access_path( sksi_access_path.sksi_determine_access_path( sks, UNPROVIDED, UNPROVIDED ) );
      final SubLObject pcase_var;
      final SubLObject sks_type = pcase_var = sksi_access_path.determine_sks_type( sks, UNPROVIDED );
      if( pcase_var.eql( $const0$Database_Physical ) )
      {
        result = sksi_drop_structured_knowledge_source_db( sks );
      }
      else if( pcase_var.eql( $const49$WorldWideWebPageCopy ) )
      {
        Errors.warn( $str50$Web_page_deletion_is_not_supporte );
      }
      else
      {
        Errors.warn( $str51$Cannot_drop_SKS_of_type__s_, sks_type );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 22690L)
  public static SubLObject sksi_drop_structured_knowledge_source_db(final SubLObject sks)
  {
    if( NIL != sksi_infrastructure_utilities.top_level_knowledge_source_p( sks ) )
    {
      return sksi_drop_structured_knowledge_source_db_int( sks );
    }
    return sksi_drop_atomic_structured_knowledge_source( sks );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 22926L)
  public static SubLObject sksi_drop_structured_knowledge_source_db_int(final SubLObject sks)
  {
    return sksi_drop_db( sks );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 23022L)
  public static SubLObject sksi_drop_atomic_structured_knowledge_source(final SubLObject sks)
  {
    Errors.warn( $str52$Drop__A__Can_t_drop_tables_yet_, sks );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 23150L)
  public static SubLObject sksi_drop_db(final SubLObject sks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject access_path = sksi_access_path.external_source_access_path( sks, UNPROVIDED, UNPROVIDED );
    final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor( access_path );
    final SubLObject default_db = sksi_kb_accessors.default_sks_for_database_server_program( sql_flavor );
    SubLObject successP = NIL;
    if( NIL != default_db )
    {
      final SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt( default_db );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject default_db_access_path = sksi_access_path.external_source_access_path( default_db, UNPROVIDED, UNPROVIDED );
        final SubLObject sql = make_drop_database_sql( access_path );
        sksi_access_path.adjust_server_of_access_path( default_db_access_path, sksi_access_path.access_path_server( access_path ) );
        if( sql.isString() )
        {
          final SubLObject drop_result = sksi_sks_interaction.sksi_execute_sql_update( sql, default_db_access_path );
          if( NIL != execute_sql_drop_success_result_p( drop_result, sql_flavor ) )
          {
            successP = T;
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 23943L)
  public static SubLObject make_drop_database_sql(final SubLObject access_path)
  {
    final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor( access_path );
    final SubLObject sks_name = sksi_access_path.access_path_db( access_path );
    final SubLObject pcase_var = sql_flavor;
    if( pcase_var.eql( $const6$PostgreSQL ) || pcase_var.eql( $sym53$_MYSQL_THEPROGRAM ) )
    {
      return sks_name.isString() ? Sequences.cconcatenate( $str54$DROP_DATABASE_, format_nil.format_nil_a_no_copy( sks_name ) ) : NIL;
    }
    Errors.cerror( $str55$Continue_w_o_dropping_the_databas, $str11$The_sql_flavor__A_for__A_is_not_y, sql_flavor, sksi_access_path.access_path_sks( access_path ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/create-sks/sksi-create-sks.lisp", position = 24492L)
  public static SubLObject execute_sql_drop_success_result_p(final SubLObject result, final SubLObject sql_flavor)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( sql_flavor.eql( $const6$PostgreSQL ) )
    {
      return list_utilities.sublisp_boolean( result );
    }
    if( sql_flavor.eql( $const9$MySQL_TheProgram ) )
    {
      return subl_promotions.positive_integer_p( result );
    }
    if( NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP( TWO_INTEGER ) )
    {
      PrintLow.format( sksi_debugging.$sksi_trace_stream$.getDynamicValue( thread ), Sequences.cconcatenate( $str13$__SKSI__A_, $str56$SQL_CREATE_DATABASE_dropt_result_ ), new SubLObject[] { TWO_INTEGER, result,
        sql_flavor
      } );
      streams_high.force_output( sksi_debugging.$sksi_trace_stream$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  public static SubLObject declare_sksi_create_sks_file()
  {
    SubLFiles.declareFunction( me, "sksi_create_structured_knowledge_source", "SKSI-CREATE-STRUCTURED-KNOWLEDGE-SOURCE", 1, 1, false );
    SubLFiles.declareFunction( me, "sksi_create_structured_knowledge_source_db", "SKSI-CREATE-STRUCTURED-KNOWLEDGE-SOURCE-DB", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_create_structured_knowledge_source_db_int", "SKSI-CREATE-STRUCTURED-KNOWLEDGE-SOURCE-DB-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_add_table_foreign_key_constraints", "SKSI-ADD-TABLE-FOREIGN-KEY-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_create_structured_knowledge_source_fht", "SKSI-CREATE-STRUCTURED-KNOWLEDGE-SOURCE-FHT", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_create_db", "SKSI-CREATE-DB", 1, 0, false );
    SubLFiles.declareFunction( me, "make_create_database_sql", "MAKE-CREATE-DATABASE-SQL", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_create_atomic_structured_knowledge_source", "SKSI-CREATE-ATOMIC-STRUCTURED-KNOWLEDGE-SOURCE", 1, 2, false );
    SubLFiles.declareFunction( me, "sksi_create_atomic_structured_knowledge_source_db", "SKSI-CREATE-ATOMIC-STRUCTURED-KNOWLEDGE-SOURCE-DB", 2, 1, false );
    SubLFiles.declareFunction( me, "sksi_create_db_table_source", "SKSI-CREATE-DB-TABLE-SOURCE", 4, 1, false );
    SubLFiles.declareFunction( me, "sksi_create_db_table_source_postgresql", "SKSI-CREATE-DB-TABLE-SOURCE-POSTGRESQL", 4, 1, false );
    SubLFiles.declareFunction( me, "sksi_create_db_table_source_my_sql", "SKSI-CREATE-DB-TABLE-SOURCE-MY-SQL", 4, 1, false );
    SubLFiles.declareFunction( me, "sksi_create_db_table_source_ms_access", "SKSI-CREATE-DB-TABLE-SOURCE-MS-ACCESS", 4, 0, false );
    SubLFiles.declareFunction( me, "sksi_create_db_table_source_sql_server", "SKSI-CREATE-DB-TABLE-SOURCE-SQL-SERVER", 4, 0, false );
    SubLFiles.declareFunction( me, "execute_sql_update_success_result_p", "EXECUTE-SQL-UPDATE-SUCCESS-RESULT-P", 2, 0, false );
    SubLFiles.declareFunction( me, "execute_sql_create_success_result_p", "EXECUTE-SQL-CREATE-SUCCESS-RESULT-P", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_create_db_table_source_int", "SKSI-CREATE-DB-TABLE-SOURCE-INT", 4, 1, false );
    SubLFiles.declareFunction( me, "generate_sql_for_create_table", "GENERATE-SQL-FOR-CREATE-TABLE", 3, 1, false );
    SubLFiles.declareFunction( me, "generate_sql_for_create_table_fields", "GENERATE-SQL-FOR-CREATE-TABLE-FIELDS", 5, 0, false );
    SubLFiles.declareFunction( me, "generate_sql_for_create_sequence", "GENERATE-SQL-FOR-CREATE-SEQUENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "generate_sql_for_create_table_primary_key", "GENERATE-SQL-FOR-CREATE-TABLE-PRIMARY-KEY", 2, 0, false );
    SubLFiles.declareFunction( me, "join_physical_field_names_for_physical_fields", "JOIN-PHYSICAL-FIELD-NAMES-FOR-PHYSICAL-FIELDS", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_sql_for_create_table_unique_fields_tuple", "GENERATE-SQL-FOR-CREATE-TABLE-UNIQUE-FIELDS-TUPLE", 2, 0, false );
    SubLFiles.declareFunction( me, "generate_sql_for_create_table_foreign_keys", "GENERATE-SQL-FOR-CREATE-TABLE-FOREIGN-KEYS", 1, 2, false );
    SubLFiles.declareFunction( me, "sksi_create_db_table_indexes", "SKSI-CREATE-DB-TABLE-INDEXES", 3, 0, false );
    SubLFiles.declareFunction( me, "generate_sql_for_create_index", "GENERATE-SQL-FOR-CREATE-INDEX", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_create_atomic_structured_knowledge_source_fht", "SKSI-CREATE-ATOMIC-STRUCTURED-KNOWLEDGE-SOURCE-FHT", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_destroy_structured_knowledge_source", "SKSI-DESTROY-STRUCTURED-KNOWLEDGE-SOURCE", 1, 1, false );
    SubLFiles.declareFunction( me, "sksi_drop_structured_knowledge_source", "SKSI-DROP-STRUCTURED-KNOWLEDGE-SOURCE", 1, 1, false );
    SubLFiles.declareFunction( me, "sksi_drop_structured_knowledge_source_db", "SKSI-DROP-STRUCTURED-KNOWLEDGE-SOURCE-DB", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_drop_structured_knowledge_source_db_int", "SKSI-DROP-STRUCTURED-KNOWLEDGE-SOURCE-DB-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_drop_atomic_structured_knowledge_source", "SKSI-DROP-ATOMIC-STRUCTURED-KNOWLEDGE-SOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_drop_db", "SKSI-DROP-DB", 1, 0, false );
    SubLFiles.declareFunction( me, "make_drop_database_sql", "MAKE-DROP-DATABASE-SQL", 1, 0, false );
    SubLFiles.declareFunction( me, "execute_sql_drop_success_result_p", "EXECUTE-SQL-DROP-SUCCESS-RESULT-P", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_sksi_create_sks_file()
  {
    return NIL;
  }

  public static SubLObject setup_sksi_create_sks_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_create_sks_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_create_sks_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_create_sks_file();
  }
  static
  {
    me = new sksi_create_sks();
    $const0$Database_Physical = constant_handles.reader_make_constant_shell( makeString( "Database-Physical" ) );
    $const1$FileHashTable_File = constant_handles.reader_make_constant_shell( makeString( "FileHashTable-File" ) );
    $str2$Cannot_create_SKS_of_type__s_ = makeString( "Cannot create SKS of type ~s." );
    $str3$SKSI_SQL_statement_cache_ = makeString( "SKSI SQL statement cache " );
    $str4$ALTER_TABLE_ = makeString( "ALTER TABLE " );
    $str5$_ADD_ = makeString( " ADD " );
    $const6$PostgreSQL = constant_handles.reader_make_constant_shell( makeString( "PostgreSQL" ) );
    $str7$CREATE_DATABASE_ = makeString( "CREATE DATABASE " );
    $str8$_OWNER_ = makeString( " OWNER " );
    $const9$MySQL_TheProgram = constant_handles.reader_make_constant_shell( makeString( "MySQL-TheProgram" ) );
    $str10$Continue_w_o_creating_the_databas = makeString( "Continue w/o creating the database" );
    $str11$The_sql_flavor__A_for__A_is_not_y = makeString( "The sql flavor ~A for ~A is not yet supported" );
    $str12$Continue_w_o_creating_the_knowled = makeString( "Continue w/o creating the knowledge source" );
    $str13$__SKSI__A_ = makeString( "~&SKSI-~A " );
    $str14$SQL_update_success_result_unknown = makeString( "SQL update success result unknown for ~s." );
    $str15$SQL_CREATE_DATABASE_success_resul = makeString( "SQL CREATE DATABASE success result unknown for ~s." );
    $str16$CREATE_TABLE_ = makeString( "CREATE TABLE " );
    $str17$__ = makeString( " (" );
    $const18$foreignKeyMap = constant_handles.reader_make_constant_shell( makeString( "foreignKeyMap" ) );
    $const19$foreignKeyMap_Restrict = constant_handles.reader_make_constant_shell( makeString( "foreignKeyMap-Restrict" ) );
    $const20$foreignKeyMap_Cascade = constant_handles.reader_make_constant_shell( makeString( "foreignKeyMap-Cascade" ) );
    $const21$foreignKeyMap_SetNull = constant_handles.reader_make_constant_shell( makeString( "foreignKeyMap-SetNull" ) );
    $const22$foreignKeyMap_SetDefault = constant_handles.reader_make_constant_shell( makeString( "foreignKeyMap-SetDefault" ) );
    $str23$__ = makeString( ", " );
    $str24$___ = makeString( " ) " );
    $str25$ = makeString( "" );
    $str26$_SERIAL = makeString( " SERIAL" );
    $str27$_ = makeString( " " );
    $str28$_DEFAULT_ = makeString( " DEFAULT " );
    $str29$_NOT_NULL = makeString( " NOT NULL" );
    $list30 = ConsesLow.list( Characters.CHAR_space, Characters.CHAR_comma );
    $str31$CREATE_SEQUENCE_ = makeString( "CREATE SEQUENCE " );
    $str32$PRIMARY_KEY__ = makeString( "PRIMARY KEY (" );
    $str33$_ = makeString( ")" );
    $sym34$PHYSICAL_FIELD_NAME = makeSymbol( "PHYSICAL-FIELD-NAME" );
    $str35$UNIQUE__ = makeString( "UNIQUE (" );
    $str36$___ = makeString( "), " );
    $list37 = ConsesLow.list( makeSymbol( "FOREIGN-KEY-LIST" ), makeSymbol( "REFERENCED-PHYSICAL-SCHEMA" ), makeSymbol( "REFERENCED-FIELD-LIST" ) );
    $str38$FOREIGN_KEY__ = makeString( "FOREIGN KEY (" );
    $str39$__REFERENCES_ = makeString( ") REFERENCES " );
    $str40$_ON_DELETE_RESTRICT = makeString( " ON DELETE RESTRICT" );
    $str41$_ON_DELETE_CASCADE = makeString( " ON DELETE CASCADE" );
    $str42$_ON_DELETE_SET_NULL = makeString( " ON DELETE SET NULL" );
    $str43$_ON_DELETE_SET_DEFAULT = makeString( " ON DELETE SET DEFAULT" );
    $str44$Continue_w_o_creating_the_index = makeString( "Continue w/o creating the index" );
    $str45$_A_is_not_a_valid_foreign_key_pre = makeString( "~A is not a valid foreign key predicates." );
    $str46$CREATE_INDEX_ = makeString( "CREATE INDEX " );
    $str47$_ON_ = makeString( " ON " );
    $str48$_USING_ = makeString( " USING " );
    $const49$WorldWideWebPageCopy = constant_handles.reader_make_constant_shell( makeString( "WorldWideWebPageCopy" ) );
    $str50$Web_page_deletion_is_not_supporte = makeString( "Web page deletion is not supported." );
    $str51$Cannot_drop_SKS_of_type__s_ = makeString( "Cannot drop SKS of type ~s." );
    $str52$Drop__A__Can_t_drop_tables_yet_ = makeString( "Drop ~A: Can't drop tables yet." );
    $sym53$_MYSQL_THEPROGRAM = makeSymbol( "$MYSQL-THEPROGRAM" );
    $str54$DROP_DATABASE_ = makeString( "DROP DATABASE " );
    $str55$Continue_w_o_dropping_the_databas = makeString( "Continue w/o dropping the database" );
    $str56$SQL_CREATE_DATABASE_dropt_result_ = makeString( "SQL CREATE DATABASE dropt result was ~s; expectation is unknown for ~s." );
  }
}
/*
 * 
 * Total time: 320 ms
 * 
 */