package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_cost_estimates
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates";
  public static final String myFingerPrint = "6f56c5997db590cdbd4c6f6bf18b7da1811fd3e2c78a603cea09f7b7d4353b1e";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 25815L)
  private static SubLSymbol $cost_estimate_sampling_percentage$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 25879L)
  private static SubLSymbol $cost_estimate_sampling_view_name$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 54551L)
  private static SubLSymbol $sksi_sparql_max_cost_query_samples$;
  private static final SubLString $str0$SKSI_SQL_statement_cache_;
  private static final SubLSymbol $kw1$REMOVE_SELECTIVE;
  private static final SubLSymbol $sym2$SCHEMA_REPRESENTATION_COMPLETE_;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $kw6$REMOVE_ALL;
  private static final SubLSymbol $kw7$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym8$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $kw9$POS;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$FULLY_BOUND;
  private static final SubLObject $const12$Database_Physical;
  private static final SubLSymbol $sym13$PHYSICAL_SCHEMA_ENUMERABLE_;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLSymbol $kw16$ONLY_REMOVE;
  private static final SubLFloat $float17$0_1;
  private static final SubLString $str18$cost_est_sampling;
  private static final SubLInteger $int19$100;
  private static final SubLObject $const20$resultSetCardinalityWithConstrain;
  private static final SubLObject $const21$resultSetCardinality;
  private static final SubLSymbol $kw22$GAF;
  private static final SubLSymbol $kw23$TRUE;
  private static final SubLObject $const24$PostgreSQL;
  private static final SubLObject $const25$MySQL_TheProgram;
  private static final SubLObject $const26$OracleDatabaseServer_TheProgram;
  private static final SubLString $str27$Continue_without_this_knowledge_s;
  private static final SubLString $str28$Cannot_gather_the_cost_estimates_;
  private static final SubLSymbol $sym29$STRINGP;
  private static final SubLString $str30$select_avg_sksi_cost_est_count__f;
  private static final SubLString $str31$__;
  private static final SubLString $str32$count_;
  private static final SubLString $str33$;
  private static final SubLString $str34$from_;
  private static final SubLString $str35$_where_;
  private static final SubLString $str36$_group_by_;
  private static final SubLString $str37$as;
  private static final SubLString $str38$_sksi_cost_est;
  private static final SubLString $str39$drop_table_if_exists_sksi_cost_es;
  private static final SubLString $str40$create_temporary_table_sksi_cost_;
  private static final SubLString $str41$select_count_distinct_;
  private static final SubLString $str42$__as_cost_est_count_from_;
  private static final SubLString $str43$select_avg_cost_est_count__from_s;
  private static final SubLString $str44$select_count____from_;
  private static final SubLString $str45$create_view_;
  private static final SubLString $str46$_as_select___from_;
  private static final SubLString $str47$_sample_;
  private static final SubLString $str48$_;
  private static final SubLString $str49$create_or_replace_view_;
  private static final SubLString $str50$_order_by_;
  private static final SubLString $str51$random__;
  private static final SubLString $str52$rand__;
  private static final SubLString $str53$_limit_;
  private static final SubLString $str54$drop_view_;
  private static final SubLSymbol $sym55$PF_ALIAS_FN_NAUT_P;
  private static final SubLString $str56$concat_ws______;
  private static final SubLString $str57$___________;
  private static final SubLString $str58$__;
  private static final SubLList $list59;
  private static final SubLSymbol $sym60$FIRST;
  private static final SubLString $str61$_cast_;
  private static final SubLString $str62$_as_text_;
  private static final SubLString $str63$_;
  private static final SubLString $str64$_;
  private static final SubLSymbol $sym65$ALPHA_CHAR_IN_CAP_;
  private static final SubLObject $const66$meaningSentencePredicateForSchema;
  private static final SubLSymbol $sym67$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str68$___A__;
  private static final SubLString $str69$SKIPPED__ignored_;
  private static final SubLObject $const70$ExpandedGraphConcept;
  private static final SubLString $str71$SKIPPED__expanded_;
  private static final SubLObject $const72$CCFDemographicProperty;
  private static final SubLString $str73$SKIPPED__demographic_property_;
  private static final SubLString $str74$__;
  private static final SubLString $str75$ERROR___A__;
  private static final SubLList $list76;
  private static final SubLInteger $int77$1000;
  private static final SubLString $str78$Could_not_find_logical_fields_for;
  private static final SubLSymbol $sym79$_NUM;
  private static final SubLObject $const80$logicalResultSetCardinality;
  private static final SubLObject $const81$TheSet;
  private static final SubLString $str82$__A_;
  private static final SubLList $list83;
  private static final SubLString $str84$Zero_count_for__A__A__A;
  private static final SubLString $str85$_A;
  private static final SubLObject $const86$CCF_SDB_RDFType_LS;
  private static final SubLObject $const87$CCF_SDB_KS;
  private static final SubLList $list88;
  private static final SubLList $list89;
  private static final SubLList $list90;
  private static final SubLList $list91;
  private static final SubLList $list92;
  private static final SubLString $str93$ptrec_;
  private static final SubLObject $const94$SchemaObjectFn;
  private static final SubLObject $const95$CCF_SDB_RDFType_CMLS;
  private static final SubLSymbol $kw96$DECODE;
  private static final SubLObject $const97$CCF_SDB_SDBMySQLExportStore_Cyc_K;
  private static final SubLObject $const98$logicalResultSetCardinalityWRTVal;
  private static final SubLString $str99$_A__;
  private static final SubLObject $const100$CCFRDF_TypeOWLClass;
  private static final SubLObject $const101$LogicalFieldFn;
  private static final SubLList $list102;
  private static final SubLList $list103;
  private static final SubLObject $const104$ExpandedGraphRDF_TypeCCFOWLClass;
  private static final SubLSymbol $sym105$_;
  private static final SubLInteger $int106$1000000;
  private static final SubLString $str107$Skipping__A_since_current_cost_hi;
  private static final SubLSymbol $sym108$_X;
  private static final SubLObject $const109$rdf_type;
  private static final SubLObject $const110$CCF_CAE_QueryMt;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 5052L)
  public static SubLObject update_cost_estimates_for_sks(final SubLObject sk_source, SubLObject mapping_mt)
  {
    if( mapping_mt == UNPROVIDED )
    {
      mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sk_source );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
          if( NIL != sksi_kb_accessors.knowledge_source_representation_completeP( sk_source ) )
          {
            final SubLObject sub_kses = sksi_kb_accessors.sk_source_sub_ks_closure( sk_source );
            if( NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP() )
            {
              SubLObject cdolist_list_var = sub_kses;
              SubLObject each_ks = NIL;
              each_ks = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                update_cost_estimates_for_sks_int( each_ks, mapping_mt );
                cdolist_list_var = cdolist_list_var.rest();
                each_ks = cdolist_list_var.first();
              }
            }
            else
            {
              final SubLObject _prev_bind_0_$2 = sksi_macros.$sksi_sql_connection_cache$.currentBinding( thread );
              final SubLObject _prev_bind_1_$3 = sksi_macros.$sksi_sql_statement_cache$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding( thread );
              try
              {
                sksi_macros.$sksi_sql_connection_cache$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQUALP ), UNPROVIDED ), thread );
                sksi_macros.$sksi_sql_statement_cache$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ), thread );
                sksi_macros.$sksi_sql_statement_pool_lock$.bind( Locks.make_lock( Strings.string( Symbols.gensym( $str0$SKSI_SQL_statement_cache_ ) ) ), thread );
                SubLObject resourcing_caches_finalizedP = NIL;
                try
                {
                  SubLObject cdolist_list_var2 = sub_kses;
                  SubLObject each_ks2 = NIL;
                  each_ks2 = cdolist_list_var2.first();
                  while ( NIL != cdolist_list_var2)
                  {
                    update_cost_estimates_for_sks_int( each_ks2, mapping_mt );
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    each_ks2 = cdolist_list_var2.first();
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                      final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values_$6 = Values.getValuesAsVector();
                        if( NIL == resourcing_caches_finalizedP )
                        {
                          sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                        }
                        Values.restoreValuesFromVector( _values_$6 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
                      }
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
                  }
                }
              }
              finally
              {
                sksi_macros.$sksi_sql_statement_pool_lock$.rebind( _prev_bind_3, thread );
                sksi_macros.$sksi_sql_statement_cache$.rebind( _prev_bind_1_$3, thread );
                sksi_macros.$sksi_sql_connection_cache$.rebind( _prev_bind_0_$2, thread );
              }
            }
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$1, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values2 );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 5927L)
  public static SubLObject update_cost_estimates_for_meaning_sentence_pred(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject pred,
      SubLObject logical_field_list, SubLObject mapping_mt)
  {
    if( logical_field_list == UNPROVIDED )
    {
      logical_field_list = NIL;
    }
    if( mapping_mt == UNPROVIDED )
    {
      mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sk_source );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0_$8 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
          if( NIL != sksi_kb_accessors.schema_representation_completeP( physical_schema ) && NIL != sksi_kb_accessors.schema_representation_completeP( logical_schema ) )
          {
            if( NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP() )
            {
              final SubLObject pf_tuples = physical_field_tuples_for_ps_ls( physical_schema, logical_schema, pred, logical_field_list );
              update_cost_estimates_for_ks_ps( sk_source, ConsesLow.list( physical_schema ), pf_tuples, mapping_mt, $kw1$REMOVE_SELECTIVE );
            }
            else
            {
              final SubLObject _prev_bind_0_$9 = sksi_macros.$sksi_sql_connection_cache$.currentBinding( thread );
              final SubLObject _prev_bind_1_$10 = sksi_macros.$sksi_sql_statement_cache$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding( thread );
              try
              {
                sksi_macros.$sksi_sql_connection_cache$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQUALP ), UNPROVIDED ), thread );
                sksi_macros.$sksi_sql_statement_cache$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ), thread );
                sksi_macros.$sksi_sql_statement_pool_lock$.bind( Locks.make_lock( Strings.string( Symbols.gensym( $str0$SKSI_SQL_statement_cache_ ) ) ), thread );
                SubLObject resourcing_caches_finalizedP = NIL;
                try
                {
                  final SubLObject pf_tuples2 = physical_field_tuples_for_ps_ls( physical_schema, logical_schema, pred, logical_field_list );
                  update_cost_estimates_for_ks_ps( sk_source, ConsesLow.list( physical_schema ), pf_tuples2, mapping_mt, $kw1$REMOVE_SELECTIVE );
                }
                finally
                {
                  final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                      final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values_$13 = Values.getValuesAsVector();
                        if( NIL == resourcing_caches_finalizedP )
                        {
                          sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                        }
                        Values.restoreValuesFromVector( _values_$13 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
                      }
                    }
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
                sksi_macros.$sksi_sql_statement_pool_lock$.rebind( _prev_bind_3, thread );
                sksi_macros.$sksi_sql_statement_cache$.rebind( _prev_bind_1_$10, thread );
                sksi_macros.$sksi_sql_connection_cache$.rebind( _prev_bind_0_$9, thread );
              }
            }
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$8, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 7321L)
  public static SubLObject update_cost_estimates_for_meaning_sentence(final SubLObject meaning_sentence_gaf, SubLObject update_mode)
  {
    if( update_mode == UNPROVIDED )
    {
      update_mode = $kw1$REMOVE_SELECTIVE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
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
          final SubLObject logical_schema = sksi_meaning_sentence_utilities.get_logical_schema_from_meaning_sentence_gaf( meaning_sentence_gaf );
          final SubLObject sentence = sksi_meaning_sentence_utilities.get_meaning_sentence_from_gaf( meaning_sentence_gaf, UNPROVIDED );
          final SubLObject mt = assertions_high.assertion_mt( meaning_sentence_gaf );
          final SubLObject sk_source = sksi_kb_accessors.logical_schema_description_mt_sk_source_in_any_mt( mt );
          final SubLObject mt_var;
          final SubLObject mapping_mt = mt_var = sksi_kb_accessors.sk_source_mapping_mt( sk_source );
          final SubLObject _prev_bind_0_$15 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
            if( NIL != sksi_kb_accessors.schema_representation_completeP( logical_schema ) )
            {
              final SubLObject logical_fields = sksi_meaning_sentence_utilities.meaning_sentence_logical_fields( sentence );
              SubLObject cdolist_list_var;
              final SubLObject physical_schemata = cdolist_list_var = sksi_kb_accessors.logical_schema_physical_schemata( logical_schema );
              SubLObject ps = NIL;
              ps = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                final SubLObject sks_list = sksi_kb_accessors.physical_schema_sk_sources( ps );
                final SubLObject logical_physical_field_mappings = sksi_infrastructure_utilities.physical_field_mappings_for_logical_fields( logical_fields, logical_schema, ps, UNPROVIDED );
                final SubLObject pf_tuples = physical_field_tuples_for_meaning_sentence( sentence, logical_physical_field_mappings, ConsesLow.list( ps ), NIL );
                SubLObject cdolist_list_var_$16 = sks_list;
                SubLObject sks = NIL;
                sks = cdolist_list_var_$16.first();
                while ( NIL != cdolist_list_var_$16)
                {
                  update_cost_estimates_for_ks_ps( sks, ConsesLow.list( ps ), ConsesLow.list( ConsesLow.list( pf_tuples ) ), mapping_mt, update_mode );
                  cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                  sks = cdolist_list_var_$16.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                ps = cdolist_list_var.first();
              }
            }
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$15, thread );
          }
        }
        else
        {
          final SubLObject _prev_bind_0_$16 = sksi_macros.$sksi_sql_connection_cache$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sksi_macros.$sksi_sql_statement_cache$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding( thread );
          try
          {
            sksi_macros.$sksi_sql_connection_cache$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQUALP ), UNPROVIDED ), thread );
            sksi_macros.$sksi_sql_statement_cache$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ), thread );
            sksi_macros.$sksi_sql_statement_pool_lock$.bind( Locks.make_lock( Strings.string( Symbols.gensym( $str0$SKSI_SQL_statement_cache_ ) ) ), thread );
            SubLObject resourcing_caches_finalizedP = NIL;
            try
            {
              final SubLObject logical_schema2 = sksi_meaning_sentence_utilities.get_logical_schema_from_meaning_sentence_gaf( meaning_sentence_gaf );
              final SubLObject sentence2 = sksi_meaning_sentence_utilities.get_meaning_sentence_from_gaf( meaning_sentence_gaf, UNPROVIDED );
              final SubLObject mt2 = assertions_high.assertion_mt( meaning_sentence_gaf );
              final SubLObject sk_source2 = sksi_kb_accessors.logical_schema_description_mt_sk_source_in_any_mt( mt2 );
              final SubLObject mt_var2;
              final SubLObject mapping_mt2 = mt_var2 = sksi_kb_accessors.sk_source_mapping_mt( sk_source2 );
              final SubLObject _prev_bind_0_$17 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
              final SubLObject _prev_bind_1_$19 = mt_relevance_macros.$mt$.currentBinding( thread );
              try
              {
                mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var2 ), thread );
                mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var2 ), thread );
                if( NIL != sksi_kb_accessors.schema_representation_completeP( logical_schema2 ) )
                {
                  final SubLObject logical_fields2 = sksi_meaning_sentence_utilities.meaning_sentence_logical_fields( sentence2 );
                  SubLObject cdolist_list_var2;
                  final SubLObject physical_schemata2 = cdolist_list_var2 = sksi_kb_accessors.logical_schema_physical_schemata( logical_schema2 );
                  SubLObject ps2 = NIL;
                  ps2 = cdolist_list_var2.first();
                  while ( NIL != cdolist_list_var2)
                  {
                    final SubLObject sks_list2 = sksi_kb_accessors.physical_schema_sk_sources( ps2 );
                    final SubLObject logical_physical_field_mappings2 = sksi_infrastructure_utilities.physical_field_mappings_for_logical_fields( logical_fields2, logical_schema2, ps2, UNPROVIDED );
                    final SubLObject pf_tuples2 = physical_field_tuples_for_meaning_sentence( sentence2, logical_physical_field_mappings2, ConsesLow.list( ps2 ), NIL );
                    SubLObject cdolist_list_var_$17 = sks_list2;
                    SubLObject sks2 = NIL;
                    sks2 = cdolist_list_var_$17.first();
                    while ( NIL != cdolist_list_var_$17)
                    {
                      update_cost_estimates_for_ks_ps( sks2, ConsesLow.list( ps2 ), ConsesLow.list( ConsesLow.list( pf_tuples2 ) ), mapping_mt2, update_mode );
                      cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                      sks2 = cdolist_list_var_$17.first();
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    ps2 = cdolist_list_var2.first();
                  }
                }
              }
              finally
              {
                mt_relevance_macros.$mt$.rebind( _prev_bind_1_$19, thread );
                mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$17, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values_$23 = Values.getValuesAsVector();
                    if( NIL == resourcing_caches_finalizedP )
                    {
                      sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                    }
                    Values.restoreValuesFromVector( _values_$23 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
                  }
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
              }
            }
          }
          finally
          {
            sksi_macros.$sksi_sql_statement_pool_lock$.rebind( _prev_bind_4, thread );
            sksi_macros.$sksi_sql_statement_cache$.rebind( _prev_bind_3, thread );
            sksi_macros.$sksi_sql_connection_cache$.rebind( _prev_bind_0_$16, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 9048L)
  public static SubLObject update_cost_estimates_for_conditional_meaning_sentence(final SubLObject meaning_sentence_gaf, SubLObject update_mode)
  {
    if( update_mode == UNPROVIDED )
    {
      update_mode = $kw1$REMOVE_SELECTIVE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
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
          final SubLObject antecedent_logical_schema_set = sksi_meaning_sentence_utilities.get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf( meaning_sentence_gaf );
          final SubLObject antecedent_sentence = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf( meaning_sentence_gaf );
          final SubLObject consequent_logical_schema_set = sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf( meaning_sentence_gaf );
          final SubLObject consequent_sentence = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf( meaning_sentence_gaf, UNPROVIDED );
          final SubLObject mt = assertions_high.assertion_mt( meaning_sentence_gaf );
          final SubLObject sk_source = sksi_kb_accessors.logical_schema_description_mt_sk_source_in_any_mt( mt );
          final SubLObject mt_var;
          final SubLObject mapping_mt = mt_var = sksi_kb_accessors.sk_source_mapping_mt( sk_source );
          final SubLObject _prev_bind_0_$25 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
            mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
            if( NIL != list_utilities.every_in_list( $sym2$SCHEMA_REPRESENTATION_COMPLETE_, antecedent_logical_schema_set, UNPROVIDED ) && NIL != list_utilities.every_in_list( $sym2$SCHEMA_REPRESENTATION_COMPLETE_,
                consequent_logical_schema_set, UNPROVIDED ) && NIL != sksi_meaning_sentence_utilities.supported_conditional_meaning_sentence_gaf_p( meaning_sentence_gaf, UNPROVIDED ) )
            {
              final SubLObject sks = sksi_kb_accessors.nearest_common_super_ks_for_ls_list( conses_high.union( consequent_logical_schema_set, antecedent_logical_schema_set, UNPROVIDED, UNPROVIDED ) );
              final SubLObject consequent_logical_fields = sksi_meaning_sentence_utilities.meaning_sentence_logical_fields( consequent_sentence );
              final SubLObject consequent_physical_schema_set = sksi_kb_accessors.logical_schemata_physical_schemata( consequent_logical_schema_set );
              final SubLObject logical_physical_field_mappings = sksi_infrastructure_utilities.physical_field_mappings_for_logical_fields_given_logical_physical_schemata( consequent_logical_fields,
                  consequent_logical_schema_set, consequent_physical_schema_set );
              final SubLObject pf_tuples = physical_field_tuples_for_meaning_sentence( consequent_sentence, logical_physical_field_mappings, consequent_physical_schema_set, antecedent_sentence );
              SubLObject result_pf_tuples = NIL;
              if( NIL != pf_tuples )
              {
                thread.resetMultipleValues();
                final SubLObject from_expression = get_from_and_where_expression_for_antecedent_of_cms( consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set,
                    meaning_sentence_gaf );
                final SubLObject where_expression = thread.secondMultipleValue();
                final SubLObject eval_conditions = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if( NIL != from_expression && NIL != where_expression )
                {
                  result_pf_tuples = ConsesLow.cons( ConsesLow.list( pf_tuples, from_expression, ( where_expression == T ) ? NIL : ConsesLow.list( where_expression ), eval_conditions ), result_pf_tuples );
                  update_cost_estimates_for_ks_ps( sks, consequent_physical_schema_set, result_pf_tuples, mapping_mt, update_mode );
                }
              }
            }
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$25, thread );
          }
        }
        else
        {
          final SubLObject _prev_bind_0_$26 = sksi_macros.$sksi_sql_connection_cache$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sksi_macros.$sksi_sql_statement_cache$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding( thread );
          try
          {
            sksi_macros.$sksi_sql_connection_cache$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQUALP ), UNPROVIDED ), thread );
            sksi_macros.$sksi_sql_statement_cache$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ), thread );
            sksi_macros.$sksi_sql_statement_pool_lock$.bind( Locks.make_lock( Strings.string( Symbols.gensym( $str0$SKSI_SQL_statement_cache_ ) ) ), thread );
            SubLObject resourcing_caches_finalizedP = NIL;
            try
            {
              final SubLObject antecedent_logical_schema_set2 = sksi_meaning_sentence_utilities.get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf( meaning_sentence_gaf );
              final SubLObject antecedent_sentence2 = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf( meaning_sentence_gaf );
              final SubLObject consequent_logical_schema_set2 = sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf( meaning_sentence_gaf );
              final SubLObject consequent_sentence2 = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf( meaning_sentence_gaf, UNPROVIDED );
              final SubLObject mt2 = assertions_high.assertion_mt( meaning_sentence_gaf );
              final SubLObject sk_source2 = sksi_kb_accessors.logical_schema_description_mt_sk_source_in_any_mt( mt2 );
              final SubLObject mt_var2;
              final SubLObject mapping_mt2 = mt_var2 = sksi_kb_accessors.sk_source_mapping_mt( sk_source2 );
              final SubLObject _prev_bind_0_$27 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
              final SubLObject _prev_bind_1_$28 = mt_relevance_macros.$mt$.currentBinding( thread );
              try
              {
                mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var2 ), thread );
                mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var2 ), thread );
                if( NIL != list_utilities.every_in_list( $sym2$SCHEMA_REPRESENTATION_COMPLETE_, antecedent_logical_schema_set2, UNPROVIDED ) && NIL != list_utilities.every_in_list( $sym2$SCHEMA_REPRESENTATION_COMPLETE_,
                    consequent_logical_schema_set2, UNPROVIDED ) && NIL != sksi_meaning_sentence_utilities.supported_conditional_meaning_sentence_gaf_p( meaning_sentence_gaf, UNPROVIDED ) )
                {
                  final SubLObject sks2 = sksi_kb_accessors.nearest_common_super_ks_for_ls_list( conses_high.union( consequent_logical_schema_set2, antecedent_logical_schema_set2, UNPROVIDED, UNPROVIDED ) );
                  final SubLObject consequent_logical_fields2 = sksi_meaning_sentence_utilities.meaning_sentence_logical_fields( consequent_sentence2 );
                  final SubLObject consequent_physical_schema_set2 = sksi_kb_accessors.logical_schemata_physical_schemata( consequent_logical_schema_set2 );
                  final SubLObject logical_physical_field_mappings2 = sksi_infrastructure_utilities.physical_field_mappings_for_logical_fields_given_logical_physical_schemata( consequent_logical_fields2,
                      consequent_logical_schema_set2, consequent_physical_schema_set2 );
                  final SubLObject pf_tuples2 = physical_field_tuples_for_meaning_sentence( consequent_sentence2, logical_physical_field_mappings2, consequent_physical_schema_set2, antecedent_sentence2 );
                  SubLObject result_pf_tuples2 = NIL;
                  if( NIL != pf_tuples2 )
                  {
                    thread.resetMultipleValues();
                    final SubLObject from_expression2 = get_from_and_where_expression_for_antecedent_of_cms( consequent_physical_schema_set2, consequent_logical_schema_set2, antecedent_logical_schema_set2,
                        meaning_sentence_gaf );
                    final SubLObject where_expression2 = thread.secondMultipleValue();
                    final SubLObject eval_conditions2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if( NIL != from_expression2 && NIL != where_expression2 )
                    {
                      result_pf_tuples2 = ConsesLow.cons( ConsesLow.list( pf_tuples2, from_expression2, ( where_expression2 == T ) ? NIL : ConsesLow.list( where_expression2 ), eval_conditions2 ), result_pf_tuples2 );
                      update_cost_estimates_for_ks_ps( sks2, consequent_physical_schema_set2, result_pf_tuples2, mapping_mt2, update_mode );
                    }
                  }
                }
              }
              finally
              {
                mt_relevance_macros.$mt$.rebind( _prev_bind_1_$28, thread );
                mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$27, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values_$31 = Values.getValuesAsVector();
                    if( NIL == resourcing_caches_finalizedP )
                    {
                      sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                    }
                    Values.restoreValuesFromVector( _values_$31 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$29, thread );
                  }
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$28, thread );
              }
            }
          }
          finally
          {
            sksi_macros.$sksi_sql_statement_pool_lock$.rebind( _prev_bind_4, thread );
            sksi_macros.$sksi_sql_statement_cache$.rebind( _prev_bind_3, thread );
            sksi_macros.$sksi_sql_connection_cache$.rebind( _prev_bind_0_$26, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$30, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 11990L)
  public static SubLObject update_cost_estimates_for_logical_fields(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject logical_fields, SubLObject update_mode,
      SubLObject mapping_mt)
  {
    if( update_mode == UNPROVIDED )
    {
      update_mode = $kw1$REMOVE_SELECTIVE;
    }
    if( mapping_mt == UNPROVIDED )
    {
      mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sk_source );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0_$33 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
          if( NIL != sksi_kb_accessors.schema_representation_completeP( physical_schema ) && NIL != sksi_kb_accessors.schema_representation_completeP( logical_schema ) )
          {
            if( NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP() )
            {
              final SubLObject pf_tuples = physical_field_tuples_for_ps_ls( physical_schema, logical_schema, NIL, logical_fields );
              update_cost_estimates_for_ks_ps( sk_source, ConsesLow.list( physical_schema ), pf_tuples, mapping_mt, update_mode );
            }
            else
            {
              final SubLObject _prev_bind_0_$34 = sksi_macros.$sksi_sql_connection_cache$.currentBinding( thread );
              final SubLObject _prev_bind_1_$35 = sksi_macros.$sksi_sql_statement_cache$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding( thread );
              try
              {
                sksi_macros.$sksi_sql_connection_cache$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQUALP ), UNPROVIDED ), thread );
                sksi_macros.$sksi_sql_statement_cache$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ), thread );
                sksi_macros.$sksi_sql_statement_pool_lock$.bind( Locks.make_lock( Strings.string( Symbols.gensym( $str0$SKSI_SQL_statement_cache_ ) ) ), thread );
                SubLObject resourcing_caches_finalizedP = NIL;
                try
                {
                  final SubLObject pf_tuples2 = physical_field_tuples_for_ps_ls( physical_schema, logical_schema, NIL, logical_fields );
                  update_cost_estimates_for_ks_ps( sk_source, ConsesLow.list( physical_schema ), pf_tuples2, mapping_mt, update_mode );
                }
                finally
                {
                  final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                      final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values_$38 = Values.getValuesAsVector();
                        if( NIL == resourcing_caches_finalizedP )
                        {
                          sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                        }
                        Values.restoreValuesFromVector( _values_$38 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$36, thread );
                      }
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$35, thread );
                  }
                }
              }
              finally
              {
                sksi_macros.$sksi_sql_statement_pool_lock$.rebind( _prev_bind_3, thread );
                sksi_macros.$sksi_sql_statement_cache$.rebind( _prev_bind_1_$35, thread );
                sksi_macros.$sksi_sql_connection_cache$.rebind( _prev_bind_0_$34, thread );
              }
            }
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$33, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$37, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 13601L)
  public static SubLObject update_cost_estimates_for_field_decoding(final SubLObject field_decoding_gaf, SubLObject update_mode)
  {
    if( update_mode == UNPROVIDED )
    {
      update_mode = $kw1$REMOVE_SELECTIVE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
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
          SubLObject current;
          final SubLObject datum = current = assertions_high.gaf_args( field_decoding_gaf );
          SubLObject logical_schema = NIL;
          SubLObject logical_field_indexical = NIL;
          SubLObject physical_schema = NIL;
          SubLObject decoding = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
          logical_schema = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
          logical_field_indexical = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
          physical_schema = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
          decoding = current.first();
          current = current.rest();
          if( NIL == current )
          {
            final SubLObject mt = assertions_high.assertion_mt( field_decoding_gaf );
            final SubLObject sk_source = sksi_kb_accessors.schema_translation_mt_sk_source_in_any_mt( mt );
            final SubLObject mt_var;
            final SubLObject mapping_mt = mt_var = sksi_kb_accessors.sk_source_mapping_mt( sk_source );
            final SubLObject _prev_bind_0_$40 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
              mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
              if( NIL != sksi_kb_accessors.schema_representation_completeP( physical_schema ) && NIL != sksi_kb_accessors.schema_representation_completeP( logical_schema ) )
              {
                final SubLObject sks_list = sksi_kb_accessors.physical_schema_sk_sources( physical_schema );
                final SubLObject logical_field = sksi_kb_accessors.logical_field_for_indexical( logical_field_indexical );
                SubLObject cdolist_list_var = sks_list;
                SubLObject sks = NIL;
                sks = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  update_cost_estimates_for_logical_fields( sks, physical_schema, logical_schema, ConsesLow.list( logical_field ), update_mode, UNPROVIDED );
                  cdolist_list_var = cdolist_list_var.rest();
                  sks = cdolist_list_var.first();
                }
              }
            }
            finally
            {
              mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$40, thread );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
          }
        }
        else
        {
          final SubLObject _prev_bind_0_$41 = sksi_macros.$sksi_sql_connection_cache$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sksi_macros.$sksi_sql_statement_cache$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding( thread );
          try
          {
            sksi_macros.$sksi_sql_connection_cache$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQUALP ), UNPROVIDED ), thread );
            sksi_macros.$sksi_sql_statement_cache$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ), thread );
            sksi_macros.$sksi_sql_statement_pool_lock$.bind( Locks.make_lock( Strings.string( Symbols.gensym( $str0$SKSI_SQL_statement_cache_ ) ) ), thread );
            SubLObject resourcing_caches_finalizedP = NIL;
            try
            {
              SubLObject current2;
              final SubLObject datum2 = current2 = assertions_high.gaf_args( field_decoding_gaf );
              SubLObject logical_schema2 = NIL;
              SubLObject logical_field_indexical2 = NIL;
              SubLObject physical_schema2 = NIL;
              SubLObject decoding2 = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list3 );
              logical_schema2 = current2.first();
              current2 = current2.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list3 );
              logical_field_indexical2 = current2.first();
              current2 = current2.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list3 );
              physical_schema2 = current2.first();
              current2 = current2.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list3 );
              decoding2 = current2.first();
              current2 = current2.rest();
              if( NIL == current2 )
              {
                final SubLObject mt2 = assertions_high.assertion_mt( field_decoding_gaf );
                final SubLObject sk_source2 = sksi_kb_accessors.schema_translation_mt_sk_source_in_any_mt( mt2 );
                final SubLObject mt_var2;
                final SubLObject mapping_mt2 = mt_var2 = sksi_kb_accessors.sk_source_mapping_mt( sk_source2 );
                final SubLObject _prev_bind_0_$42 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                final SubLObject _prev_bind_1_$43 = mt_relevance_macros.$mt$.currentBinding( thread );
                try
                {
                  mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var2 ), thread );
                  mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var2 ), thread );
                  if( NIL != sksi_kb_accessors.schema_representation_completeP( physical_schema2 ) && NIL != sksi_kb_accessors.schema_representation_completeP( logical_schema2 ) )
                  {
                    final SubLObject sks_list2 = sksi_kb_accessors.physical_schema_sk_sources( physical_schema2 );
                    final SubLObject logical_field2 = sksi_kb_accessors.logical_field_for_indexical( logical_field_indexical2 );
                    SubLObject cdolist_list_var2 = sks_list2;
                    SubLObject sks2 = NIL;
                    sks2 = cdolist_list_var2.first();
                    while ( NIL != cdolist_list_var2)
                    {
                      update_cost_estimates_for_logical_fields( sks2, physical_schema2, logical_schema2, ConsesLow.list( logical_field2 ), update_mode, UNPROVIDED );
                      cdolist_list_var2 = cdolist_list_var2.rest();
                      sks2 = cdolist_list_var2.first();
                    }
                  }
                }
                finally
                {
                  mt_relevance_macros.$mt$.rebind( _prev_bind_1_$43, thread );
                  mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$42, thread );
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum2, $list3 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values_$46 = Values.getValuesAsVector();
                    if( NIL == resourcing_caches_finalizedP )
                    {
                      sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                    }
                    Values.restoreValuesFromVector( _values_$46 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$44, thread );
                  }
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$43, thread );
              }
            }
          }
          finally
          {
            sksi_macros.$sksi_sql_statement_pool_lock$.rebind( _prev_bind_4, thread );
            sksi_macros.$sksi_sql_statement_cache$.rebind( _prev_bind_3, thread );
            sksi_macros.$sksi_sql_connection_cache$.rebind( _prev_bind_0_$41, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$45, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 15041L)
  public static SubLObject update_cost_estimates_for_field_encoding(final SubLObject field_encoding_gaf, SubLObject update_mode)
  {
    if( update_mode == UNPROVIDED )
    {
      update_mode = $kw1$REMOVE_SELECTIVE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
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
          SubLObject current;
          final SubLObject datum = current = assertions_high.gaf_args( field_encoding_gaf );
          SubLObject physical_schema = NIL;
          SubLObject physical_field_indexical = NIL;
          SubLObject logical_schema = NIL;
          SubLObject encoding = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
          physical_schema = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
          physical_field_indexical = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
          logical_schema = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
          encoding = current.first();
          current = current.rest();
          if( NIL == current )
          {
            final SubLObject mt = assertions_high.assertion_mt( field_encoding_gaf );
            final SubLObject sk_source = sksi_kb_accessors.schema_translation_mt_sk_source_in_any_mt( mt );
            final SubLObject mt_var;
            final SubLObject mapping_mt = mt_var = sksi_kb_accessors.sk_source_mapping_mt( sk_source );
            final SubLObject _prev_bind_0_$48 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
              mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
              if( NIL != sksi_kb_accessors.schema_representation_completeP( physical_schema ) && NIL != sksi_kb_accessors.schema_representation_completeP( logical_schema ) )
              {
                final SubLObject lf_list = sksi_field_translation_utilities.encoding_logical_fields( encoding );
                SubLObject cdolist_list_var;
                final SubLObject sks_list = cdolist_list_var = sksi_kb_accessors.physical_schema_sk_sources( physical_schema );
                SubLObject sks = NIL;
                sks = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  update_cost_estimates_for_logical_fields( sks, physical_schema, logical_schema, lf_list, update_mode, UNPROVIDED );
                  cdolist_list_var = cdolist_list_var.rest();
                  sks = cdolist_list_var.first();
                }
              }
            }
            finally
            {
              mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$48, thread );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list4 );
          }
        }
        else
        {
          final SubLObject _prev_bind_0_$49 = sksi_macros.$sksi_sql_connection_cache$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sksi_macros.$sksi_sql_statement_cache$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding( thread );
          try
          {
            sksi_macros.$sksi_sql_connection_cache$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQUALP ), UNPROVIDED ), thread );
            sksi_macros.$sksi_sql_statement_cache$.bind( dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ), thread );
            sksi_macros.$sksi_sql_statement_pool_lock$.bind( Locks.make_lock( Strings.string( Symbols.gensym( $str0$SKSI_SQL_statement_cache_ ) ) ), thread );
            SubLObject resourcing_caches_finalizedP = NIL;
            try
            {
              SubLObject current2;
              final SubLObject datum2 = current2 = assertions_high.gaf_args( field_encoding_gaf );
              SubLObject physical_schema2 = NIL;
              SubLObject physical_field_indexical2 = NIL;
              SubLObject logical_schema2 = NIL;
              SubLObject encoding2 = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list4 );
              physical_schema2 = current2.first();
              current2 = current2.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list4 );
              physical_field_indexical2 = current2.first();
              current2 = current2.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list4 );
              logical_schema2 = current2.first();
              current2 = current2.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list4 );
              encoding2 = current2.first();
              current2 = current2.rest();
              if( NIL == current2 )
              {
                final SubLObject mt2 = assertions_high.assertion_mt( field_encoding_gaf );
                final SubLObject sk_source2 = sksi_kb_accessors.schema_translation_mt_sk_source_in_any_mt( mt2 );
                final SubLObject mt_var2;
                final SubLObject mapping_mt2 = mt_var2 = sksi_kb_accessors.sk_source_mapping_mt( sk_source2 );
                final SubLObject _prev_bind_0_$50 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                final SubLObject _prev_bind_1_$51 = mt_relevance_macros.$mt$.currentBinding( thread );
                try
                {
                  mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var2 ), thread );
                  mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var2 ), thread );
                  if( NIL != sksi_kb_accessors.schema_representation_completeP( physical_schema2 ) && NIL != sksi_kb_accessors.schema_representation_completeP( logical_schema2 ) )
                  {
                    final SubLObject lf_list2 = sksi_field_translation_utilities.encoding_logical_fields( encoding2 );
                    SubLObject cdolist_list_var2;
                    final SubLObject sks_list2 = cdolist_list_var2 = sksi_kb_accessors.physical_schema_sk_sources( physical_schema2 );
                    SubLObject sks2 = NIL;
                    sks2 = cdolist_list_var2.first();
                    while ( NIL != cdolist_list_var2)
                    {
                      update_cost_estimates_for_logical_fields( sks2, physical_schema2, logical_schema2, lf_list2, update_mode, UNPROVIDED );
                      cdolist_list_var2 = cdolist_list_var2.rest();
                      sks2 = cdolist_list_var2.first();
                    }
                  }
                }
                finally
                {
                  mt_relevance_macros.$mt$.rebind( _prev_bind_1_$51, thread );
                  mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$50, thread );
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum2, $list4 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values_$54 = Values.getValuesAsVector();
                    if( NIL == resourcing_caches_finalizedP )
                    {
                      sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                    }
                    Values.restoreValuesFromVector( _values_$54 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$52, thread );
                  }
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$51, thread );
              }
            }
          }
          finally
          {
            sksi_macros.$sksi_sql_statement_pool_lock$.rebind( _prev_bind_4, thread );
            sksi_macros.$sksi_sql_statement_cache$.rebind( _prev_bind_3, thread );
            sksi_macros.$sksi_sql_connection_cache$.rebind( _prev_bind_0_$49, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$53 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$53, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 16460L)
  public static SubLObject update_cost_estimates_for_sks_int(final SubLObject ks, final SubLObject mapping_mt)
  {
    SubLObject cdolist_list_var;
    final SubLObject ps_pf_tuples_list = cdolist_list_var = physical_field_tuples_used_in_meaning_sentences_in_ks( ks );
    SubLObject ps_pf_tuples = NIL;
    ps_pf_tuples = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = ps_pf_tuples;
      SubLObject ps = NIL;
      SubLObject pf_tuples = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
      ps = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
      pf_tuples = current.first();
      current = current.rest();
      if( NIL == current )
      {
        update_cost_estimates_for_ks_ps( ks, ConsesLow.list( ps ), pf_tuples, mapping_mt, $kw6$REMOVE_ALL );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      ps_pf_tuples = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 17006L)
  public static SubLObject physical_field_tuples_used_in_meaning_sentences_in_ks(final SubLObject ks)
  {
    final SubLObject physical_schemata = sksi_kb_accessors.sk_source_physical_schemata( ks );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = physical_schemata;
    SubLObject ps = NIL;
    ps = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$56;
      final SubLObject logical_schemata = cdolist_list_var_$56 = sksi_kb_accessors.physical_schema_logical_schemata( ps );
      SubLObject ls = NIL;
      ls = cdolist_list_var_$56.first();
      while ( NIL != cdolist_list_var_$56)
      {
        final SubLObject partial_result = physical_field_tuples_for_ps_ls( ps, ls, UNPROVIDED, UNPROVIDED );
        result = ConsesLow.cons( ConsesLow.list( ps, partial_result ), result );
        cdolist_list_var_$56 = cdolist_list_var_$56.rest();
        ls = cdolist_list_var_$56.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      ps = cdolist_list_var.first();
    }
    return list_utilities.fast_delete_duplicates( result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 17460L)
  public static SubLObject any_lfi_appears_in_sentenceP(final SubLObject lfi_list, final SubLObject sentence)
  {
    SubLObject succeedP = NIL;
    if( NIL == succeedP )
    {
      SubLObject csome_list_var = lfi_list;
      SubLObject lfi = NIL;
      lfi = csome_list_var.first();
      while ( NIL == succeedP && NIL != csome_list_var)
      {
        if( NIL != cycl_utilities.expression_find( lfi, sentence, T, UNPROVIDED, UNPROVIDED ) )
        {
          succeedP = T;
        }
        csome_list_var = csome_list_var.rest();
        lfi = csome_list_var.first();
      }
    }
    return succeedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 17670L)
  public static SubLObject physical_field_tuples_for_ps_ls(final SubLObject ps, final SubLObject ls, SubLObject pred, SubLObject lf_list)
  {
    if( pred == UNPROVIDED )
    {
      pred = NIL;
    }
    if( lf_list == UNPROVIDED )
    {
      lf_list = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == sksi_kb_accessors.physical_schema_sk_sources( ps ) )
    {
      return NIL;
    }
    final SubLObject lfi_list = sksi_kb_accessors.indexicals_for_logical_fields( lf_list );
    SubLObject result = NIL;
    final SubLObject meaning_sentences = sksi_meaning_sentence_utilities.logical_schema_meaning_sentences( ls, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject logical_physical_field_mappings = sksi_infrastructure_utilities.logical_physical_field_mappings_given_logical_physical_schemata( ConsesLow.list( ls ), ConsesLow.list( ps ) );
    SubLObject cdolist_list_var = meaning_sentences;
    SubLObject sentence = NIL;
    sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( ( NIL == pred || pred.equal( cycl_utilities.formula_operator( sentence ) ) ) && ( NIL == lfi_list || NIL != any_lfi_appears_in_sentenceP( lfi_list, sentence ) ) )
      {
        result = ConsesLow.cons( ConsesLow.list( physical_field_tuples_for_meaning_sentence( sentence, logical_physical_field_mappings, ConsesLow.list( ps ), NIL ) ), result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sentence = cdolist_list_var.first();
    }
    SubLObject cdolist_list_var2;
    final SubLObject conditional_meaning_sentence_gafs = cdolist_list_var2 = sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs( ls, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject gaf = NIL;
    gaf = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      final SubLObject antecedent_logical_schema_set = sksi_meaning_sentence_utilities.get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf( gaf );
      final SubLObject antecedent_sentence = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf( gaf );
      final SubLObject consequent_logical_schema_set = sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf( gaf );
      final SubLObject consequent_sentence = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf( gaf, UNPROVIDED );
      if( ( NIL == pred || pred.equal( cycl_utilities.formula_operator( consequent_sentence ) ) ) && ( NIL == lfi_list || NIL != any_lfi_appears_in_sentenceP( lfi_list, consequent_sentence )
          || NIL != any_lfi_appears_in_sentenceP( lfi_list, antecedent_sentence ) ) )
      {
        final SubLObject consequent_physical_schema_set = sksi_kb_accessors.logical_schemata_physical_schemata( consequent_logical_schema_set );
        final SubLObject logical_physical_field_mappings2 = sksi_infrastructure_utilities.logical_physical_field_mappings_given_logical_physical_schemata( consequent_logical_schema_set, consequent_physical_schema_set );
        final SubLObject pf_tuples = physical_field_tuples_for_meaning_sentence( consequent_sentence, logical_physical_field_mappings2, consequent_physical_schema_set, antecedent_sentence );
        if( NIL != pf_tuples )
        {
          thread.resetMultipleValues();
          final SubLObject from_expression = get_from_and_where_expression_for_antecedent_of_cms( consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, gaf );
          final SubLObject where_expression = thread.secondMultipleValue();
          final SubLObject eval_conditions = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( NIL != from_expression && NIL != where_expression )
          {
            result = ConsesLow.cons( ConsesLow.list( pf_tuples, from_expression, ( where_expression == T ) ? NIL : ConsesLow.list( where_expression ), eval_conditions ), result );
          }
        }
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      gaf = cdolist_list_var2.first();
    }
    return list_utilities.fast_delete_duplicates( result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 20374L)
  public static SubLObject get_from_and_where_expression_for_antecedent_of_cms(final SubLObject consequent_ps_list, final SubLObject consequent_logical_schema_set, final SubLObject antecedent_logical_schema_set,
      final SubLObject cms_gaf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject antecedent_physical_schemata = sksi_kb_accessors.logical_schemata_physical_schemata( antecedent_logical_schema_set );
    final SubLObject all_physical_schemata = conses_high.union( consequent_ps_list, antecedent_physical_schemata, UNPROVIDED, UNPROVIDED );
    final SubLObject new_sk_source = sksi_kb_accessors.nearest_common_super_ks_for_ls_list( conses_high.union( consequent_logical_schema_set, antecedent_logical_schema_set, UNPROVIDED, UNPROVIDED ) );
    final SubLObject new_content_mt = sksi_kb_accessors.sk_source_content_mt( new_sk_source );
    SubLObject from_expression = NIL;
    SubLObject where_expression = NIL;
    SubLObject eval_conditions = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw7$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym8$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          from_expression = sksi_query_utilities.get_from_expression_from_antecedent_meaning_sentence( cms_gaf, new_content_mt, new_sk_source, all_physical_schemata, UNPROVIDED );
          thread.resetMultipleValues();
          final SubLObject where_expression_$57 = sksi_query_utilities.get_where_expression_from_antecedent_meaning_sentence( cms_gaf, new_content_mt, new_sk_source, all_physical_schemata, UNPROVIDED, UNPROVIDED );
          final SubLObject eval_conditions_$58 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          where_expression = where_expression_$57;
          eval_conditions = eval_conditions_$58;
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw7$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return Values.values( from_expression, where_expression, eval_conditions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 21402L)
  public static SubLObject physical_field_tuples_for_meaning_sentence(final SubLObject sentence, final SubLObject logical_physical_field_mappings, final SubLObject physical_schema_list,
      final SubLObject antecedent_sentence)
  {
    SubLObject result = NIL;
    final SubLObject rc_sentence = sksi_meaning_sentence_utilities.sksi_reconstruct_meaning_sentence( sentence );
    final SubLObject logical_field_indexical_termnums = sksi_removal_module_generation.sentence_termnums_containing_logical_field_indexicals( rc_sentence );
    SubLObject cdolist_list_var;
    final SubLObject boundedness_permutations = cdolist_list_var = sksi_removal_module_generation.compute_boundedness_permutations_for_logical_field_indexical_termnums( logical_field_indexical_termnums, $kw9$POS );
    SubLObject perm = NIL;
    perm = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject pattern = el_utilities.copy_expression( sentence );
      SubLObject select_set = NIL;
      SubLObject where_set = NIL;
      SubLObject cdolist_list_var_$59 = perm;
      SubLObject argpos_list_boundedness_pair = NIL;
      argpos_list_boundedness_pair = cdolist_list_var_$59.first();
      while ( NIL != cdolist_list_var_$59)
      {
        SubLObject current;
        final SubLObject datum = current = argpos_list_boundedness_pair;
        SubLObject argpos_list = NIL;
        SubLObject boundedness = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
        argpos_list = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
        boundedness = current.first();
        current = current.rest();
        if( NIL == current )
        {
          SubLObject cdolist_list_var_$60 = argpos_list;
          SubLObject argpos = NIL;
          argpos = cdolist_list_var_$60.first();
          while ( NIL != cdolist_list_var_$60)
          {
            pattern = cycl_utilities.formula_arg_position_nsubst( boundedness, argpos, pattern );
            final SubLObject lfi = cycl_utilities.formula_arg_position( rc_sentence, argpos, UNPROVIDED );
            final SubLObject lf = sksi_kb_accessors.logical_field_for_indexical( lfi );
            final SubLObject pfs = list_utilities.fast_delete_duplicates( dictionary.dictionary_lookup_without_values( logical_physical_field_mappings, lf, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
                UNPROVIDED );
            SubLObject actual_pfs = NIL;
            SubLObject cdolist_list_var_$61 = pfs;
            SubLObject pf = NIL;
            pf = cdolist_list_var_$61.first();
            while ( NIL != cdolist_list_var_$61)
            {
              actual_pfs = ConsesLow.cons( sksi_kb_accessors.pf_for_lfi( pf, lfi ), actual_pfs );
              cdolist_list_var_$61 = cdolist_list_var_$61.rest();
              pf = cdolist_list_var_$61.first();
            }
            actual_pfs = Sequences.nreverse( actual_pfs );
            if( boundedness == $kw11$FULLY_BOUND )
            {
              where_set = ConsesLow.append( actual_pfs, where_set );
            }
            else
            {
              select_set = ConsesLow.append( actual_pfs, select_set );
            }
            cdolist_list_var_$60 = cdolist_list_var_$60.rest();
            argpos = cdolist_list_var_$60.first();
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list10 );
        }
        cdolist_list_var_$59 = cdolist_list_var_$59.rest();
        argpos_list_boundedness_pair = cdolist_list_var_$59.first();
      }
      pattern = sksi_removal_module_generation.replace_pattern_parts( pattern, $kw9$POS );
      if( NIL != select_set && NIL != sksi_removal_module_generation.sksi_valid_removal_module_required_patternP( pattern, sentence, physical_schema_list, antecedent_sentence ) )
      {
        result = ConsesLow.cons( ConsesLow.list( list_utilities.fast_delete_duplicates( select_set, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), list_utilities.fast_delete_duplicates( where_set,
            UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ), result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      perm = cdolist_list_var.first();
    }
    return list_utilities.fast_delete_duplicates( result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 23337L)
  public static SubLObject update_cost_estimates_for_ks_ps(final SubLObject ks, final SubLObject ps_list, final SubLObject pf_tuples, final SubLObject mapping_mt, SubLObject update_mode)
  {
    if( update_mode == UNPROVIDED )
    {
      update_mode = $kw1$REMOVE_SELECTIVE;
    }
    final SubLObject access_path = sksi_access_path.external_source_access_path( ks, UNPROVIDED, UNPROVIDED );
    final SubLObject pcase_var = sksi_access_path.access_path_type( access_path );
    if( pcase_var.eql( $const12$Database_Physical ) )
    {
      return update_cost_estimates_for_db_ps( ks, access_path, ps_list, pf_tuples, mapping_mt, update_mode );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 23981L)
  public static SubLObject update_cost_estimates_for_db_ps(final SubLObject ks, final SubLObject access_path, final SubLObject ps_list, final SubLObject pf_tuples, final SubLObject mapping_mt,
      final SubLObject update_mode)
  {
    final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor( access_path );
    final SubLObject enumerable_schemaP = list_utilities.every_in_list( $sym13$PHYSICAL_SCHEMA_ENUMERABLE_, ps_list, UNPROVIDED );
    SubLObject created_sampling_viewP = NIL;
    if( NIL == enumerable_schemaP )
    {
      created_sampling_viewP = create_sampling_view( ks, access_path, sql_flavor );
    }
    if( update_mode == $kw6$REMOVE_ALL )
    {
      remove_cost_estimates_for_ps_list( ps_list );
    }
    SubLObject cdolist_list_var = pf_tuples;
    SubLObject pf_tuple = NIL;
    pf_tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pf_tuple;
      SubLObject select_where_sets = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
      select_where_sets = current.first();
      current = current.rest();
      final SubLObject from_expression = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list14 );
      current = current.rest();
      final SubLObject where_expression = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list14 );
      current = current.rest();
      final SubLObject eval_conditions = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list14 );
      current = current.rest();
      if( NIL == current )
      {
        SubLObject cdolist_list_var_$62 = select_where_sets;
        SubLObject select_where_set = NIL;
        select_where_set = cdolist_list_var_$62.first();
        while ( NIL != cdolist_list_var_$62)
        {
          SubLObject current_$64;
          final SubLObject datum_$63 = current_$64 = select_where_set;
          SubLObject select_set = NIL;
          SubLObject where_set = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current_$64, datum_$63, $list15 );
          select_set = current_$64.first();
          current_$64 = current_$64.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current_$64, datum_$63, $list15 );
          where_set = current_$64.first();
          current_$64 = current_$64.rest();
          if( NIL == current_$64 )
          {
            if( update_mode == $kw16$ONLY_REMOVE )
            {
              remove_cost_estimate_for_select_where_sets( ks, ps_list, select_set, where_set, from_expression, where_expression, eval_conditions );
            }
            else
            {
              final SubLObject cost = gather_cost_estimate_for_select_and_where_sets( access_path, select_set, where_set, from_expression, where_expression, eval_conditions, sql_flavor, created_sampling_viewP );
              if( cost.isNumber() )
              {
                if( update_mode == $kw1$REMOVE_SELECTIVE )
                {
                  remove_cost_estimate_for_select_where_sets( ks, ps_list, select_set, where_set, from_expression, where_expression, eval_conditions );
                }
                assert_cost_estimate_for_select_and_where_sets( ks, ps_list, mapping_mt, select_set, where_set, from_expression, where_expression, eval_conditions, cost );
              }
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum_$63, $list15 );
          }
          cdolist_list_var_$62 = cdolist_list_var_$62.rest();
          select_where_set = cdolist_list_var_$62.first();
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list14 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pf_tuple = cdolist_list_var.first();
    }
    if( NIL != created_sampling_viewP )
    {
      remove_sampling_view( ks, access_path, sql_flavor );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 25955L)
  public static SubLObject gather_cost_estimate_for_select_and_where_sets(final SubLObject access_path, final SubLObject select_set, final SubLObject where_set, final SubLObject from_expression,
      final SubLObject where_expression, final SubLObject eval_conditions, final SubLObject sql_flavor, final SubLObject sampling_viewP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject sql = determine_sql_for_gathering_cost_estimates( access_path, select_set, where_set, from_expression, where_expression, eval_conditions, sql_flavor, sampling_viewP );
    final SubLObject used_sampling_viewP = thread.secondMultipleValue();
    final SubLObject cost_estimate = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( cost_estimate.isNumber() )
    {
      return cost_estimate;
    }
    if( sql.isString() )
    {
      SubLObject result_set = NIL;
      SubLObject cost = NIL;
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw7$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym8$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            result_set = sksi_sks_interaction.sksi_execute_sql_query( sql, access_path );
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
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw7$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != sdbc.sql_result_set_p( result_set ) )
      {
        sdbc.sqlrs_next( result_set );
        cost = sksi_result_set_iterators.sqlrs_current_row_as_list( result_set ).first();
        if( cost.isString() )
        {
          cost = string_utilities.string_to_number( cost );
        }
        if( NIL != used_sampling_viewP )
        {
          cost = Numbers.divide( Numbers.multiply( cost, $int19$100 ), $cost_estimate_sampling_percentage$.getGlobalValue() );
        }
        return cost;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 27303L)
  public static SubLObject assert_cost_estimate_for_select_and_where_sets(final SubLObject ks, final SubLObject ps_list, final SubLObject mapping_mt, final SubLObject select_set, final SubLObject where_set,
      final SubLObject from_expression, final SubLObject where_expression, final SubLObject eval_conditions, final SubLObject cost)
  {
    final SubLObject el_select = cycl_utilities.hl_to_el( el_utilities.make_el_set( select_set, UNPROVIDED ) );
    final SubLObject el_where = cycl_utilities.hl_to_el( el_utilities.make_el_set( where_set, UNPROVIDED ) );
    if( NIL != where_expression )
    {
      final SubLObject cycl_for_where_expression = sksi_csql_utilities.csql_to_el( where_expression, ks, from_expression );
      if( NIL != sksi_infrastructure_utilities.sksi_true_cycl_expression_p( cycl_for_where_expression ) )
      {
        SubLObject cdolist_list_var = ps_list;
        SubLObject ps = NIL;
        ps = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject sentence = el_utilities.make_el_formula( $const20$resultSetCardinalityWithConstrain, ConsesLow.list( ps, el_select, el_where, cycl_for_where_expression, cost ), UNPROVIDED );
          sksi_kb_accessors.sksi_assert( sentence, mapping_mt, UNPROVIDED, UNPROVIDED );
          cdolist_list_var = cdolist_list_var.rest();
          ps = cdolist_list_var.first();
        }
      }
    }
    else
    {
      SubLObject cdolist_list_var2 = ps_list;
      SubLObject ps2 = NIL;
      ps2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        final SubLObject sentence2 = el_utilities.make_el_formula( $const21$resultSetCardinality, ConsesLow.list( ps2, el_select, el_where, cost ), UNPROVIDED );
        sksi_kb_accessors.sksi_assert( sentence2, mapping_mt, UNPROVIDED, UNPROVIDED );
        cdolist_list_var2 = cdolist_list_var2.rest();
        ps2 = cdolist_list_var2.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 28209L)
  public static SubLObject remove_cost_estimates_for_ps_list(final SubLObject ps_list)
  {
    SubLObject cdolist_list_var = ps_list;
    SubLObject ps = NIL;
    ps = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      remove_cost_estimates_for_ps( ps );
      cdolist_list_var = cdolist_list_var.rest();
      ps = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 28401L)
  public static SubLObject remove_cost_estimates_for_ps(final SubLObject ps)
  {
    final SubLObject rs_cardinality_gafs = sksi_kb_accessors.physical_schema_result_set_cardinality_gafs( ps );
    final SubLObject rs_cardinality_wXconstraints_gafs = sksi_kb_accessors.physical_schema_result_set_cardinality_wXconstraints_gafs( ps );
    SubLObject cdolist_list_var;
    final SubLObject all_gafs = cdolist_list_var = ConsesLow.append( rs_cardinality_gafs, rs_cardinality_wXconstraints_gafs );
    SubLObject gaf = NIL;
    gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertions_high.asserted_assertionP( gaf ) && NIL != assertions_high.gaf_assertionP( gaf ) )
      {
        sksi_kb_accessors.sksi_unassert( assertions_high.gaf_formula( gaf ), assertions_high.assertion_mt( gaf ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      gaf = cdolist_list_var.first();
    }
    return Sequences.length( all_gafs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 28976L)
  public static SubLObject remove_cost_estimate_for_select_where_sets(final SubLObject ks, final SubLObject ps_list, final SubLObject select_set, final SubLObject where_set, final SubLObject from_expression,
      final SubLObject where_expression, final SubLObject eval_conditions)
  {
    if( NIL != where_expression )
    {
      return remove_result_set_cardinality_wXconstraints_gaf_for_select_where_sets( ks, ps_list, select_set, where_set, from_expression, where_expression, eval_conditions );
    }
    return remove_result_set_cardinality_gaf_for_select_where_sets( ps_list, select_set, where_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 29413L)
  public static SubLObject remove_result_set_cardinality_gaf_for_select_where_sets(final SubLObject ps_list, final SubLObject select_set, final SubLObject where_set)
  {
    SubLObject foundP = NIL;
    SubLObject cdolist_list_var = ps_list;
    SubLObject ps = NIL;
    ps = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pred_var = $const21$resultSetCardinality;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( ps, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( ps, ONE_INTEGER, pred_var );
        SubLObject done_var = foundP;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw22$GAF, $kw23$TRUE, NIL );
              SubLObject done_var_$65 = foundP;
              final SubLObject token_var_$66 = NIL;
              while ( NIL == done_var_$65)
              {
                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$66 );
                final SubLObject valid_$67 = makeBoolean( !token_var_$66.eql( gaf ) );
                if( NIL != valid_$67 && NIL != list_utilities.sets_equalP( select_set, el_utilities.el_extensional_set_elements( assertions_high.gaf_arg2( gaf ) ), UNPROVIDED ) && NIL != list_utilities.sets_equalP(
                    where_set, el_utilities.el_extensional_set_elements( assertions_high.gaf_arg3( gaf ) ), UNPROVIDED ) )
                {
                  sksi_kb_accessors.sksi_unassert( assertions_high.gaf_formula( gaf ), assertions_high.assertion_mt( gaf ) );
                  foundP = T;
                }
                done_var_$65 = makeBoolean( NIL == valid_$67 || NIL != foundP );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid || NIL != foundP );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      ps = cdolist_list_var.first();
    }
    return foundP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 29924L)
  public static SubLObject remove_result_set_cardinality_wXconstraints_gaf_for_select_where_sets(final SubLObject ks, final SubLObject ps_list, final SubLObject select_set, final SubLObject where_set,
      final SubLObject from_expression, final SubLObject where_expression, final SubLObject eval_conditions)
  {
    final SubLObject cycl_for_where_expression = sksi_csql_utilities.csql_to_cycl( where_expression, ks, from_expression );
    SubLObject foundP = NIL;
    SubLObject cdolist_list_var = ps_list;
    SubLObject ps = NIL;
    ps = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pred_var = $const20$resultSetCardinalityWithConstrain;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( ps, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( ps, ONE_INTEGER, pred_var );
        SubLObject done_var = foundP;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw22$GAF, $kw23$TRUE, NIL );
              SubLObject done_var_$68 = foundP;
              final SubLObject token_var_$69 = NIL;
              while ( NIL == done_var_$68)
              {
                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$69 );
                final SubLObject valid_$70 = makeBoolean( !token_var_$69.eql( gaf ) );
                if( NIL != valid_$70 && NIL != list_utilities.sets_equalP( select_set, el_utilities.el_extensional_set_elements( assertions_high.gaf_arg2( gaf ) ), UNPROVIDED ) && NIL != list_utilities.sets_equalP(
                    where_set, el_utilities.el_extensional_set_elements( assertions_high.gaf_arg3( gaf ) ), UNPROVIDED ) && NIL != czer_utilities.equals_elP( cycl_for_where_expression, assertions_high.gaf_arg4( gaf ),
                        UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                {
                  sksi_kb_accessors.sksi_unassert( assertions_high.gaf_formula( gaf ), assertions_high.assertion_mt( gaf ) );
                  foundP = T;
                }
                done_var_$68 = makeBoolean( NIL == valid_$70 || NIL != foundP );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid || NIL != foundP );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      ps = cdolist_list_var.first();
    }
    return foundP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 30780L)
  public static SubLObject sksi_determine_csql_for_gathering_cost_estimates(final SubLObject access_path, final SubLObject select_set, final SubLObject where_set, final SubLObject sql_flavor)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 31008L)
  public static SubLObject determine_sql_for_gathering_cost_estimates(final SubLObject access_path, final SubLObject select_set, final SubLObject where_set, final SubLObject from_expression,
      final SubLObject where_expression, final SubLObject eval_conditions, final SubLObject sql_flavor, final SubLObject sampling_viewP)
  {
    if( sql_flavor.eql( $const24$PostgreSQL ) )
    {
      return determine_sql_for_gathering_cost_estimates_via_subquery( access_path, select_set, where_set, from_expression, where_expression, eval_conditions, sampling_viewP );
    }
    if( sql_flavor.eql( $const25$MySQL_TheProgram ) )
    {
      return determine_sql_for_gathering_cost_estimates_via_temporary_table( access_path, select_set, where_set, from_expression, where_expression, eval_conditions, sampling_viewP );
    }
    if( sql_flavor.eql( $const26$OracleDatabaseServer_TheProgram ) )
    {
      return determine_sql_for_gathering_cost_estimates_via_subquery( access_path, select_set, where_set, from_expression, where_expression, eval_conditions, sampling_viewP );
    }
    Errors.cerror( $str27$Continue_without_this_knowledge_s, $str28$Cannot_gather_the_cost_estimates_, sksi_access_path.access_path_sks( access_path ), sql_flavor );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 32509L)
  public static SubLObject determine_sql_for_gathering_cost_estimates_via_subquery(final SubLObject access_path, final SubLObject select_set, final SubLObject where_set, final SubLObject from_expression,
      final SubLObject where_expression, final SubLObject eval_conditions, final SubLObject sampling_viewP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor( access_path );
    SubLObject sql_for_where_fields = NIL;
    thread.resetMultipleValues();
    final SubLObject sql_for_select_fields = make_sql_for_select_set( select_set, eval_conditions, sql_flavor );
    SubLObject table_list = thread.secondMultipleValue();
    final SubLObject estimate_cost_at_1P = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != estimate_cost_at_1P )
    {
      return Values.values( NIL, NIL, ONE_INTEGER );
    }
    thread.resetMultipleValues();
    final SubLObject sql_for_where_fields_$71 = make_sql_for_where_set( where_set, eval_conditions, sql_flavor, table_list );
    final SubLObject table_list_$72 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    sql_for_where_fields = sql_for_where_fields_$71;
    table_list = table_list_$72;
    final SubLObject sql_for_where_expression = ( NIL != where_expression ) ? sksi_csql_interpretation.make_sql_for_where_clause_int( where_expression, sql_flavor, UNPROVIDED ) : NIL;
    final SubLObject use_sampling_viewP = use_cost_estimate_sampling_viewP( sampling_viewP, select_set, where_set );
    final SubLObject sql_for_table = make_sql_for_table( sksi_access_path.access_path_sks( access_path ), table_list, from_expression, sql_flavor, use_sampling_viewP );
    SubLObject sql = NIL;
    if( NIL != list_utilities.every_in_list( $sym29$STRINGP, ConsesLow.list( sql_for_select_fields, sql_for_where_fields, sql_for_table ), UNPROVIDED ) )
    {
      sql = Sequences.cconcatenate( $str30$select_avg_sksi_cost_est_count__f, new SubLObject[] { sql_for_select_fields, $str31$__, ( NIL != kb_utilities.kbeq( sql_flavor, $const26$OracleDatabaseServer_TheProgram ) )
          ? $str32$count_
          : $str33$, $str34$from_, sql_for_table, sql_for_where_expression.isString() ? Sequences.cconcatenate( $str35$_where_, sql_for_where_expression ) : $str33$, $str36$_group_by_, sql_for_where_fields, $str31$__,
        ( NIL != kb_utilities.kbeq( sql_flavor, $const24$PostgreSQL ) ) ? $str37$as : ( ( NIL != kb_utilities.kbeq( sql_flavor, $const26$OracleDatabaseServer_TheProgram ) ) ? $str33$ : NIL ), $str38$_sksi_cost_est
      } );
    }
    else if( NIL != list_utilities.every_in_list( $sym29$STRINGP, ConsesLow.list( sql_for_select_fields, sql_for_table ), UNPROVIDED ) )
    {
      sql = Sequences.cconcatenate( $str30$select_avg_sksi_cost_est_count__f, new SubLObject[] { sql_for_select_fields, $str31$__, ( NIL != kb_utilities.kbeq( sql_flavor, $const26$OracleDatabaseServer_TheProgram ) )
          ? $str32$count_
          : $str33$, $str34$from_, sql_for_table, sql_for_where_expression.isString() ? Sequences.cconcatenate( $str35$_where_, sql_for_where_expression ) : $str33$, $str31$__, ( NIL != kb_utilities.kbeq( sql_flavor,
              $const24$PostgreSQL ) ) ? $str37$as : ( ( NIL != kb_utilities.kbeq( sql_flavor, $const26$OracleDatabaseServer_TheProgram ) ) ? $str33$ : NIL ), $str38$_sksi_cost_est
      } );
    }
    return Values.values( sql, use_sampling_viewP, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 35155L)
  public static SubLObject determine_sql_for_gathering_cost_estimates_via_temporary_table(final SubLObject access_path, final SubLObject select_set, final SubLObject where_set, final SubLObject from_expression,
      final SubLObject where_expression, final SubLObject eval_conditions, final SubLObject sampling_viewP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor( access_path );
    SubLObject sql_for_where_fields = NIL;
    thread.resetMultipleValues();
    final SubLObject sql_for_select_fields = make_sql_for_select_set( select_set, eval_conditions, sql_flavor );
    SubLObject table_list = thread.secondMultipleValue();
    final SubLObject estimate_cost_at_1P = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != estimate_cost_at_1P )
    {
      return Values.values( NIL, NIL, ONE_INTEGER );
    }
    thread.resetMultipleValues();
    final SubLObject sql_for_where_fields_$73 = make_sql_for_where_set( where_set, eval_conditions, sql_flavor, table_list );
    final SubLObject table_list_$74 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    sql_for_where_fields = sql_for_where_fields_$73;
    table_list = table_list_$74;
    final SubLObject sql_for_where_expression = ( NIL != where_expression ) ? sksi_csql_interpretation.make_sql_for_where_clause_int( where_expression, sql_flavor, UNPROVIDED ) : NIL;
    final SubLObject use_sampling_viewP = use_cost_estimate_sampling_viewP( sampling_viewP, select_set, where_set );
    final SubLObject sql_for_table = make_sql_for_table( sksi_access_path.access_path_sks( access_path ), table_list, from_expression, sql_flavor, use_sampling_viewP );
    final SubLObject drop_table_sql = $str39$drop_table_if_exists_sksi_cost_es;
    SubLObject create_table_sql = $str40$create_temporary_table_sksi_cost_;
    SubLObject select_sql = NIL;
    if( NIL != list_utilities.every_in_list( $sym29$STRINGP, ConsesLow.list( sql_for_select_fields, sql_for_where_fields, sql_for_table ), UNPROVIDED ) )
    {
      select_sql = Sequences.cconcatenate( $str41$select_count_distinct_, new SubLObject[] { sql_for_select_fields, $str42$__as_cost_est_count_from_, sql_for_table, sql_for_where_expression.isString() ? Sequences
          .cconcatenate( $str35$_where_, sql_for_where_expression ) : $str33$, $str36$_group_by_, sql_for_where_fields
      } );
    }
    else if( NIL != list_utilities.every_in_list( $sym29$STRINGP, ConsesLow.list( sql_for_select_fields, sql_for_table ), UNPROVIDED ) )
    {
      select_sql = Sequences.cconcatenate( $str41$select_count_distinct_, new SubLObject[] { sql_for_select_fields, $str42$__as_cost_est_count_from_, sql_for_table, sql_for_where_expression.isString() ? Sequences
          .cconcatenate( $str35$_where_, sql_for_where_expression ) : $str33$
      } );
    }
    create_table_sql = Sequences.cconcatenate( create_table_sql, select_sql );
    sksi_sks_interaction.sksi_execute_sql_update( drop_table_sql, access_path );
    if( sksi_sks_interaction.sksi_execute_sql_update( create_table_sql, access_path ).isInteger() )
    {
      return Values.values( $str43$select_avg_cost_est_count__from_s, use_sampling_viewP, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 37877L)
  public static SubLObject get_sk_source_row_count(final SubLObject ks, final SubLObject access_path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject row_count = sksi_kb_accessors.sk_source_row_count( ks );
    if( !row_count.isNumber() )
    {
      final SubLObject table_name = sksi_kb_accessors.sk_source_name( ks );
      final SubLObject sql = Sequences.cconcatenate( $str44$select_count____from_, table_name );
      SubLObject result_set = NIL;
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw7$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym8$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            result_set = sksi_sks_interaction.sksi_execute_sql_query( sql, access_path );
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
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw7$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != sdbc.sql_result_set_p( result_set ) )
      {
        sdbc.sqlrs_next( result_set );
        row_count = sksi_result_set_iterators.sqlrs_current_row_as_list( result_set ).first();
        if( row_count.isString() )
        {
          row_count = string_utilities.string_to_number( row_count );
        }
      }
    }
    return row_count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 38611L)
  public static SubLObject create_sampling_view(final SubLObject ks, final SubLObject access_path, final SubLObject sql_flavor)
  {
    final SubLObject row_count = get_sk_source_row_count( ks, access_path );
    if( row_count.isInteger() )
    {
      SubLObject sql = NIL;
      if( sql_flavor.eql( $const26$OracleDatabaseServer_TheProgram ) )
      {
        sql = Sequences.cconcatenate( $str45$create_view_, new SubLObject[] { $cost_estimate_sampling_view_name$.getGlobalValue(), $str46$_as_select___from_, sksi_kb_accessors.sk_source_name( sksi_access_path
            .access_path_sks( access_path ) ), $str47$_sample_, string_utilities.object_to_string( $cost_estimate_sampling_percentage$.getGlobalValue() ), $str48$_
        } );
      }
      else if( sql_flavor.eql( $const24$PostgreSQL ) || sql_flavor.eql( $const25$MySQL_TheProgram ) )
      {
        sql = Sequences.cconcatenate( $str49$create_or_replace_view_, new SubLObject[] { $cost_estimate_sampling_view_name$.getGlobalValue(), $str46$_as_select___from_, sksi_kb_accessors.sk_source_name( sksi_access_path
            .access_path_sks( access_path ) ), $str50$_order_by_, ( NIL != kb_utilities.kbeq( sql_flavor, $const24$PostgreSQL ) ) ? $str51$random__
                : ( ( NIL != kb_utilities.kbeq( sql_flavor, $const25$MySQL_TheProgram ) ) ? $str52$rand__ : NIL ), $str53$_limit_, string_utilities.object_to_string( Numbers.round( Numbers.multiply( Numbers.divide(
                    row_count, $int19$100 ), $cost_estimate_sampling_percentage$.getGlobalValue() ), UNPROVIDED ) )
        } );
      }
      if( sksi_sks_interaction.sksi_execute_sql_update( sql, access_path ).isInteger() )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 39631L)
  public static SubLObject remove_sampling_view(final SubLObject ks, final SubLObject access_path, final SubLObject sql_flavor)
  {
    final SubLObject sql = Sequences.cconcatenate( $str54$drop_view_, $cost_estimate_sampling_view_name$.getGlobalValue() );
    return sksi_sks_interaction.sksi_execute_sql_update( sql, access_path );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 39858L)
  public static SubLObject use_cost_estimate_sampling_viewP(final SubLObject sampling_view_existsP, final SubLObject select_set, final SubLObject where_set)
  {
    return makeBoolean( NIL != sampling_view_existsP && ( NIL != Sequences.find_if( $sym55$PF_ALIAS_FN_NAUT_P, select_set, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != Sequences.find_if( $sym55$PF_ALIAS_FN_NAUT_P,
        where_set, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 40161L)
  public static SubLObject make_sql_for_select_set(final SubLObject select_set, final SubLObject eval_conditions, final SubLObject sql_flavor)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != list_utilities.singletonP( select_set ) )
    {
      thread.resetMultipleValues();
      final SubLObject sql = make_sql_for_select_set_field( select_set.first(), eval_conditions, sql_flavor, NIL );
      final SubLObject table_list = thread.secondMultipleValue();
      final SubLObject any_non_eval_select_fieldP = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      return Values.values( sql, table_list, makeBoolean( NIL == any_non_eval_select_fieldP ) );
    }
    SubLObject sql = NIL;
    SubLObject table_list = NIL;
    SubLObject any_non_eval_select_fieldP = NIL;
    SubLObject any_eval_select_fieldP = NIL;
    SubLObject estimate_cost_at_1P = NIL;
    if( sql_flavor.eql( $const24$PostgreSQL ) || sql_flavor.eql( $const26$OracleDatabaseServer_TheProgram ) )
    {
      thread.resetMultipleValues();
      final SubLObject sql_$75 = make_sql_for_select_set_field( select_set.first(), eval_conditions, sql_flavor, table_list );
      final SubLObject table_list_$76 = thread.secondMultipleValue();
      final SubLObject any_non_eval_select_fieldP_$77 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      sql = sql_$75;
      table_list = table_list_$76;
      any_non_eval_select_fieldP = any_non_eval_select_fieldP_$77;
    }
    else if( sql_flavor.eql( $const25$MySQL_TheProgram ) )
    {
      thread.resetMultipleValues();
      final SubLObject sql_$76 = Sequences.cconcatenate( $str56$concat_ws______, make_sql_for_select_set_field( select_set.first(), eval_conditions, sql_flavor, table_list ) );
      final SubLObject table_list_$77 = thread.secondMultipleValue();
      final SubLObject any_non_eval_select_fieldP_$78 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      sql = sql_$76;
      table_list = table_list_$77;
      any_non_eval_select_fieldP = any_non_eval_select_fieldP_$78;
    }
    any_eval_select_fieldP = makeBoolean( NIL == any_non_eval_select_fieldP );
    SubLObject cdolist_list_var = select_set.rest();
    SubLObject pf = NIL;
    pf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject pf_sql = NIL;
      SubLObject non_eval_pfP = NIL;
      if( sql_flavor.eql( $const24$PostgreSQL ) || sql_flavor.eql( $const26$OracleDatabaseServer_TheProgram ) )
      {
        thread.resetMultipleValues();
        final SubLObject pf_sql_$81 = make_sql_for_select_set_field( pf, eval_conditions, sql_flavor, table_list );
        final SubLObject table_list_$78 = thread.secondMultipleValue();
        final SubLObject non_eval_pfP_$83 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        pf_sql = pf_sql_$81;
        table_list = table_list_$78;
        non_eval_pfP = non_eval_pfP_$83;
        sql = Sequences.cconcatenate( sql, new SubLObject[] { $str57$___________, pf_sql
        } );
      }
      else if( sql_flavor.eql( $const25$MySQL_TheProgram ) )
      {
        thread.resetMultipleValues();
        final SubLObject pf_sql_$82 = make_sql_for_select_set_field( pf, eval_conditions, sql_flavor, table_list );
        final SubLObject table_list_$79 = thread.secondMultipleValue();
        final SubLObject non_eval_pfP_$84 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        pf_sql = pf_sql_$82;
        table_list = table_list_$79;
        non_eval_pfP = non_eval_pfP_$84;
        sql = Sequences.cconcatenate( sql, new SubLObject[] { $str58$__, pf_sql
        } );
      }
      if( NIL == any_non_eval_select_fieldP )
      {
        any_non_eval_select_fieldP = non_eval_pfP;
      }
      if( NIL == any_eval_select_fieldP )
      {
        any_eval_select_fieldP = makeBoolean( NIL == non_eval_pfP );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pf = cdolist_list_var.first();
    }
    if( NIL != subl_promotions.memberP( sql_flavor, $list59, Symbols.symbol_function( EQ ), UNPROVIDED ) )
    {
      sql = Sequences.cconcatenate( sql, $str48$_ );
    }
    estimate_cost_at_1P = makeBoolean( NIL == any_non_eval_select_fieldP && NIL != any_eval_select_fieldP );
    return Values.values( sql, table_list, estimate_cost_at_1P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 42579L)
  public static SubLObject make_sql_for_select_set_field(final SubLObject pf, final SubLObject eval_conditions, final SubLObject sql_flavor, final SubLObject table_list)
  {
    final SubLObject lf = sksi_kb_accessors.sksi_get_mapped_logical_fields_for_physical_field( pf ).first();
    final SubLObject lfi = sksi_kb_accessors.lfi_for_lf( lf );
    final SubLObject eval_cond_for_lfi = conses_high.second( Sequences.find( lfi, eval_conditions, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym60$FIRST ), UNPROVIDED, UNPROVIDED ) );
    if( NIL != eval_cond_for_lfi )
    {
      SubLObject sql = sksi_csql_interpretation.make_sql_for_where_expression_int( sksi_csql_utilities.csql_expression_arg( eval_cond_for_lfi, ONE_INTEGER ), sql_flavor );
      if( NIL != kb_utilities.kbeq( sql_flavor, $const24$PostgreSQL ) )
      {
        sql = Sequences.cconcatenate( $str61$_cast_, new SubLObject[] { format_nil.format_nil_a_no_copy( sql ), $str62$_as_text_
        } );
      }
      return Values.values( sql, table_list, NIL );
    }
    final SubLObject pf_table_name = sksi_kb_accessors.physical_field_sk_source_name( pf );
    SubLObject pf_sql = NIL;
    if( sql_flavor.eql( $const24$PostgreSQL ) )
    {
      pf_sql = ( ( NIL != sksi_kb_accessors.boolean_physical_field_p( pf ) ) ? make_physical_field_name( pf, sql_flavor )
          : Sequences.cconcatenate( $str61$_cast_, new SubLObject[]
          { make_physical_field_name( pf, sql_flavor ), $str62$_as_text_
          } ) );
    }
    else if( sql_flavor.eql( $const25$MySQL_TheProgram ) || sql_flavor.eql( $const26$OracleDatabaseServer_TheProgram ) )
    {
      pf_sql = make_physical_field_name( pf, sql_flavor );
    }
    return Values.values( pf_sql, conses_high.adjoin( pf_table_name, table_list, Symbols.symbol_function( EQUAL ), UNPROVIDED ), T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 43695L)
  public static SubLObject make_sql_for_where_set(final SubLObject where_set, final SubLObject eval_conditions, final SubLObject sql_flavor, SubLObject table_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !where_set.isCons() )
    {
      return Values.values( NIL, table_list );
    }
    SubLObject sql = NIL;
    thread.resetMultipleValues();
    final SubLObject sql_$87 = make_sql_for_where_set_field( where_set.first(), eval_conditions, sql_flavor, table_list );
    final SubLObject table_list_$88 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    sql = sql_$87;
    table_list = table_list_$88;
    SubLObject cdolist_list_var = where_set.rest();
    SubLObject pf = NIL;
    pf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject pf_sql = NIL;
      thread.resetMultipleValues();
      final SubLObject pf_sql_$89 = make_sql_for_where_set_field( pf, eval_conditions, sql_flavor, table_list );
      final SubLObject table_list_$89 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      pf_sql = pf_sql_$89;
      table_list = table_list_$89;
      sql = Sequences.cconcatenate( sql, new SubLObject[] { $str58$__, pf_sql
      } );
      cdolist_list_var = cdolist_list_var.rest();
      pf = cdolist_list_var.first();
    }
    return Values.values( sql, table_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 44255L)
  public static SubLObject make_sql_for_where_set_field(final SubLObject pf, final SubLObject eval_conditions, final SubLObject sql_flavor, final SubLObject table_list)
  {
    final SubLObject lf = sksi_kb_accessors.sksi_get_mapped_logical_fields_for_physical_field( pf ).first();
    final SubLObject lfi = sksi_kb_accessors.lfi_for_lf( lf );
    final SubLObject eval_cond_for_lfi = conses_high.second( Sequences.find( lfi, eval_conditions, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym60$FIRST ), UNPROVIDED, UNPROVIDED ) );
    if( NIL != eval_cond_for_lfi )
    {
      return Values.values( sksi_csql_interpretation.make_sql_for_where_expression_int( sksi_csql_utilities.csql_expression_arg( eval_cond_for_lfi, ONE_INTEGER ), sql_flavor ), table_list );
    }
    return Values.values( make_physical_field_name( pf, sql_flavor ), conses_high.adjoin( sksi_kb_accessors.physical_field_sk_source_name( pf ), table_list, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 44811L)
  public static SubLObject make_physical_field_name(final SubLObject pf, final SubLObject sql_flavor)
  {
    final SubLObject field_name = sksi_kb_accessors.physical_field_name( pf );
    SubLObject table_name = sksi_kb_accessors.sk_source_name( sksi_kb_accessors.physical_schema_sk_sources( sksi_kb_accessors.physical_field_schema( pf ) ).first() );
    if( NIL != sksi_kb_accessors.pf_alias_fn_naut_p( pf ) )
    {
      table_name = sksi_csql_generation.make_table_alias_name( table_name, sksi_kb_accessors.pf_alias_fn_naut_index( pf ) );
    }
    if( NIL != kb_utilities.kbeq( sql_flavor, $const24$PostgreSQL ) && NIL != alpha_chars_in_caps_p( field_name ) )
    {
      return Sequences.cconcatenate( $str63$_, new SubLObject[] { table_name, $str64$_, field_name, $str63$_
      } );
    }
    return Sequences.cconcatenate( table_name, new SubLObject[] { $str64$_, field_name
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 45339L)
  public static SubLObject make_sql_for_table(final SubLObject table, final SubLObject table_list, SubLObject from_expression, final SubLObject sql_flavor, final SubLObject use_sampling_viewP)
  {
    SubLObject table_name = sksi_kb_accessors.sk_source_name( table );
    SubLObject table_names = NIL;
    SubLObject table_sql = NIL;
    if( NIL != use_sampling_viewP )
    {
      from_expression = conses_high.subst( $cost_estimate_sampling_view_name$.getGlobalValue(), table_name, from_expression, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      table_name = $cost_estimate_sampling_view_name$.getGlobalValue();
    }
    table_names = sksi_csql_interpretation.csql_extract_table_names_int( from_expression, sql_flavor );
    SubLObject cdolist_list_var = table_list;
    SubLObject table_$91 = NIL;
    table_$91 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject foundP = NIL;
      if( NIL == foundP )
      {
        SubLObject csome_list_var;
        SubLObject each_from;
        for( csome_list_var = from_expression, each_from = NIL, each_from = csome_list_var.first(); NIL == foundP && NIL != csome_list_var; foundP = makeBoolean( table_$91.equal( conses_high.second( each_from ) )
            || table_$91.equal( conses_high.third( each_from ) ) ), csome_list_var = csome_list_var.rest(), each_from = csome_list_var.first() )
        {
        }
      }
      if( NIL == foundP )
      {
        table_names = ConsesLow.cons( table_$91, table_names );
      }
      cdolist_list_var = cdolist_list_var.rest();
      table_$91 = cdolist_list_var.first();
    }
    table_sql = sksi_csql_interpretation.sql_for_table_names( table_names, sql_flavor );
    return table_sql;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 46245L)
  public static SubLObject alpha_chars_in_caps_p(final SubLObject string)
  {
    return string_utilities.every_in_string( $sym65$ALPHA_CHAR_IN_CAP_, string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 46348L)
  public static SubLObject alpha_char_in_capP(final SubLObject v_char)
  {
    if( NIL == Characters.alpha_char_p( v_char ) )
    {
      return T;
    }
    return Characters.upper_case_p( v_char );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 46464L)
  public static SubLObject sksi_sparql_determine_logical_cardinality_estimates_for_ks(final SubLObject sparql_ks, SubLObject logical_schema_ignore_list, SubLObject progress_stream)
  {
    if( logical_schema_ignore_list == UNPROVIDED )
    {
      logical_schema_ignore_list = NIL;
    }
    if( progress_stream == UNPROVIDED )
    {
      progress_stream = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject meta_mt = sksi_kb_accessors.sk_source_mapping_mt( sparql_ks );
    SubLObject logical_schemas = NIL;
    SubLObject results = NIL;
    final SubLObject mt_var = meta_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var;
      logical_schemas = ( cdolist_list_var = sksi_kb_accessors.sk_source_logical_schemata( sparql_ks ) );
      SubLObject logical_schema = NIL;
      logical_schema = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject schema_pred = kb_mapping_utilities.fpred_value( logical_schema, $const66$meaningSentencePredicateForSchema, ONE_INTEGER, TWO_INTEGER, UNPROVIDED );
        SubLObject error_msg = NIL;
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0_$92 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym67$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              if( NIL != progress_stream )
              {
                format_nil.force_format( progress_stream, $str68$___A__, logical_schema, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              if( NIL != subl_promotions.memberP( logical_schema, logical_schema_ignore_list, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
              {
                if( NIL != progress_stream )
                {
                  format_nil.force_format( progress_stream, $str69$SKIPPED__ignored_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
              }
              else if( NIL != isa.isa_in_any_mtP( schema_pred, $const70$ExpandedGraphConcept ) )
              {
                if( NIL != progress_stream )
                {
                  format_nil.force_format( progress_stream, $str71$SKIPPED__expanded_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
              }
              else if( NIL != isa.isa_in_any_mtP( schema_pred, $const72$CCFDemographicProperty ) )
              {
                if( NIL != progress_stream )
                {
                  format_nil.force_format( progress_stream, $str73$SKIPPED__demographic_property_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
              }
              else
              {
                SubLObject cdolist_list_var_$93 = sksi_sparql_determine_logical_cardinality_estimates_for_ls( ConsesLow.list( logical_schema ), sparql_ks, progress_stream );
                SubLObject subresult = NIL;
                subresult = cdolist_list_var_$93.first();
                while ( NIL != cdolist_list_var_$93)
                {
                  results = ConsesLow.cons( subresult, results );
                  cdolist_list_var_$93 = cdolist_list_var_$93.rest();
                  subresult = cdolist_list_var_$93.first();
                }
              }
              if( NIL != progress_stream )
              {
                format_nil.force_format( progress_stream, $str74$__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              if( NIL != error_msg )
              {
                format_nil.force_format( T, $str75$ERROR___A__, logical_schema, error_msg, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
            }
            catch( final Throwable catch_var )
            {
              Errors.handleThrowable( catch_var, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0_$92, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          error_msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
        cdolist_list_var = cdolist_list_var.rest();
        logical_schema = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 48179L)
  public static SubLObject sksi_sparql_determine_logical_cardinality_estimates_for_ls(final SubLObject logical_schemata, final SubLObject sparql_ks, final SubLObject progress_stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject meta_mt = sksi_kb_accessors.sk_source_mapping_mt( sparql_ks );
    SubLObject physical_schemata = NIL;
    SubLObject meaning_sentences = NIL;
    SubLObject results = NIL;
    final SubLObject mt_var = meta_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      physical_schemata = sksi_kb_accessors.logical_schemata_physical_schemata( logical_schemata );
      meaning_sentences = sksi_meaning_sentence_utilities.logical_schema_meaning_sentence_gafs( logical_schemata.first(), UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    SubLObject cdolist_list_var = meaning_sentences;
    SubLObject meaning_sentence = NIL;
    meaning_sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$94 = sksi_sparql_determine_logical_cardinality_estimates_for_meaning_sentence( assertions_high.gaf_arg2( meaning_sentence ), logical_schemata, physical_schemata, sparql_ks,
          progress_stream );
      SubLObject subresult = NIL;
      subresult = cdolist_list_var_$94.first();
      while ( NIL != cdolist_list_var_$94)
      {
        results = ConsesLow.cons( subresult, results );
        cdolist_list_var_$94 = cdolist_list_var_$94.rest();
        subresult = cdolist_list_var_$94.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      meaning_sentence = cdolist_list_var.first();
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 48938L)
  public static SubLObject sksi_sparql_determine_logical_cardinality_estimates_for_meaning_sentence(final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata,
      final SubLObject sparql_ks, final SubLObject progress_stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject access_path = sksi_access_path.external_source_access_path( sparql_ks, UNPROVIDED, UNPROVIDED );
    final SubLObject meta_mt = sksi_kb_accessors.sk_source_mapping_mt( sparql_ks );
    SubLObject unbound_csql = NIL;
    final SubLObject mt_var = meta_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      unbound_csql = sksi_csql_generation.sksi_determine_output_csql( sentence, logical_schemata, physical_schemata, sparql_ks, NIL, $list76, NIL, NIL, NIL, $int77$1000 );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    final SubLObject result_set = sksi_sks_interaction.generate_sparql_result_set_from_csql( unbound_csql, access_path );
    SubLObject range_terms = NIL;
    SubLObject domain_terms = NIL;
    if( NIL != result_set )
    {
      SubLObject cdolist_list_var = result_set;
      SubLObject result = NIL;
      result = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject subject = result.first();
        final SubLObject v_object = conses_high.second( result );
        SubLObject item_var = subject;
        if( NIL == conses_high.member( item_var, domain_terms, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          domain_terms = ConsesLow.cons( item_var, domain_terms );
        }
        item_var = v_object;
        if( NIL == conses_high.member( item_var, range_terms, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          range_terms = ConsesLow.cons( item_var, range_terms );
        }
        cdolist_list_var = cdolist_list_var.rest();
        result = cdolist_list_var.first();
      }
      final SubLObject logical_result_set_cardinality_1_2 = sksi_sparql_determine_logical_cardinality_estimate_for_meaning_sentence_bound_in_arg( sentence, domain_terms, ONE_INTEGER, TWO_INTEGER, physical_schemata,
          logical_schemata, sparql_ks, access_path, progress_stream );
      final SubLObject logical_result_set_cardinality_2_1 = sksi_sparql_determine_logical_cardinality_estimate_for_meaning_sentence_bound_in_arg( sentence, range_terms, TWO_INTEGER, ONE_INTEGER, physical_schemata,
          logical_schemata, sparql_ks, access_path, progress_stream );
      final SubLObject ls = logical_schemata.first();
      SubLObject lf1 = NIL;
      SubLObject lf2 = NIL;
      final SubLObject mt_var2 = meta_mt;
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var2 ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var2 ), thread );
        lf1 = narts_high.nart_el_formula( sksi_kb_accessors.logical_field_for_indexical( cycl_utilities.formula_arg1( sentence, UNPROVIDED ) ) );
        lf2 = narts_high.nart_el_formula( sksi_kb_accessors.logical_field_for_indexical( cycl_utilities.formula_arg2( sentence, UNPROVIDED ) ) );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_3, thread );
      }
      if( NIL == lf1 || NIL == lf2 )
      {
        Errors.warn( $str78$Could_not_find_logical_fields_for, logical_schemata );
        return NIL;
      }
      final SubLObject lrsc_1_2_existing_nums = ask_utilities.query_template( $sym79$_NUM, el_utilities.make_quaternary_formula( $const80$logicalResultSetCardinality, ls, ConsesLow.list( $const81$TheSet, lf2 ), ConsesLow
          .list( $const81$TheSet, lf1 ), $sym79$_NUM ), meta_mt, UNPROVIDED );
      final SubLObject lrsc_2_1_existing_nums = ask_utilities.query_template( $sym79$_NUM, el_utilities.make_quaternary_formula( $const80$logicalResultSetCardinality, ls, ConsesLow.list( $const81$TheSet, lf1 ), ConsesLow
          .list( $const81$TheSet, lf2 ), $sym79$_NUM ), meta_mt, UNPROVIDED );
      if( !logical_result_set_cardinality_1_2.isZero() )
      {
        final SubLObject new_sentence = el_utilities.make_quaternary_formula( $const80$logicalResultSetCardinality, ls, ConsesLow.list( $const81$TheSet, lf2 ), ConsesLow.list( $const81$TheSet, lf1 ),
            logical_result_set_cardinality_1_2 );
        SubLObject assertP = T;
        SubLObject cdolist_list_var2 = lrsc_1_2_existing_nums;
        SubLObject lrsc_1_2_existing_num = NIL;
        lrsc_1_2_existing_num = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          if( lrsc_1_2_existing_num.equal( logical_result_set_cardinality_1_2 ) )
          {
            assertP = NIL;
          }
          else
          {
            final SubLObject old_sentence = el_utilities.make_quaternary_formula( $const80$logicalResultSetCardinality, ls, ConsesLow.list( $const81$TheSet, lf2 ), ConsesLow.list( $const81$TheSet, lf1 ),
                lrsc_1_2_existing_num );
            final SubLObject assertion = czer_meta.find_assertion_cycl( old_sentence, meta_mt );
            if( NIL != assertion_handles.assertion_p( assertion ) )
            {
              if( NIL != assertions_high.asserted_assertionP( assertion ) )
              {
                ke.ke_unassert( old_sentence, meta_mt );
              }
              else
              {
                assertP = NIL;
              }
            }
          }
          cdolist_list_var2 = cdolist_list_var2.rest();
          lrsc_1_2_existing_num = cdolist_list_var2.first();
        }
        if( NIL != assertP )
        {
          ke.ke_assert( new_sentence, meta_mt, UNPROVIDED, UNPROVIDED );
        }
      }
      if( !logical_result_set_cardinality_2_1.isZero() )
      {
        final SubLObject new_sentence = el_utilities.make_quaternary_formula( $const80$logicalResultSetCardinality, ls, ConsesLow.list( $const81$TheSet, lf1 ), ConsesLow.list( $const81$TheSet, lf2 ),
            logical_result_set_cardinality_2_1 );
        SubLObject assertP = T;
        SubLObject cdolist_list_var2 = lrsc_2_1_existing_nums;
        SubLObject lrsc_2_1_existing_num = NIL;
        lrsc_2_1_existing_num = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          if( lrsc_2_1_existing_num.equal( logical_result_set_cardinality_2_1 ) )
          {
            assertP = NIL;
          }
          else
          {
            final SubLObject old_sentence = el_utilities.make_quaternary_formula( $const80$logicalResultSetCardinality, ls, ConsesLow.list( $const81$TheSet, lf1 ), ConsesLow.list( $const81$TheSet, lf2 ),
                lrsc_2_1_existing_num );
            final SubLObject assertion = czer_meta.find_assertion_cycl( old_sentence, meta_mt );
            if( NIL != assertion_handles.assertion_p( assertion ) )
            {
              if( NIL != assertions_high.asserted_assertionP( assertion ) )
              {
                ke.ke_unassert( old_sentence, meta_mt );
              }
              else
              {
                assertP = NIL;
              }
            }
          }
          cdolist_list_var2 = cdolist_list_var2.rest();
          lrsc_2_1_existing_num = cdolist_list_var2.first();
        }
        if( NIL != assertP )
        {
          ke.ke_assert( new_sentence, meta_mt, UNPROVIDED, UNPROVIDED );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 52738L)
  public static SubLObject sksi_sparql_determine_logical_cardinality_estimate_for_meaning_sentence_bound_in_arg(final SubLObject sentence, final SubLObject index_terms, final SubLObject index_arg,
      final SubLObject gather_arg, final SubLObject physical_schemata, final SubLObject logical_schemata, final SubLObject sparql_ks, SubLObject access_path, SubLObject progress_stream)
  {
    if( access_path == UNPROVIDED )
    {
      access_path = sksi_access_path.external_source_access_path( sparql_ks, UNPROVIDED, UNPROVIDED );
    }
    if( progress_stream == UNPROVIDED )
    {
      progress_stream = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject meta_mt = sksi_kb_accessors.sk_source_mapping_mt( sparql_ks );
    final SubLObject index_arg_lfi = ConsesLow.nth( index_arg, sentence );
    SubLObject index_arg_pfis = NIL;
    final SubLObject count = Sequences.length( index_terms );
    SubLObject sample_size = ZERO_INTEGER;
    SubLObject samples = NIL;
    SubLObject result = NIL;
    if( NIL != progress_stream )
    {
      format_nil.force_format( progress_stream, $str82$__A_, index_arg, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject mt_var = meta_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      index_arg_pfis = sksi_infrastructure_utilities.sksi_determine_relevant_physical_field_indexicals( ConsesLow.list( index_arg_lfi ), logical_schemata, physical_schemata );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    SubLObject index_terms_left = list_utilities.randomize_list( index_terms );
    while ( NIL == representative_sampleP( samples, count ))
    {
      if( NIL != progress_stream )
      {
        format_nil.force_format( progress_stream, $str64$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      final SubLObject index_term = index_terms_left.first();
      SubLObject index_arg_bound_query = NIL;
      index_terms_left = index_terms_left.rest();
      final SubLObject mt_var2 = meta_mt;
      final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var2 ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var2 ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var2 ), thread );
        index_arg_bound_query = sksi_csql_generation.sksi_determine_output_csql( sentence, logical_schemata, physical_schemata, sparql_ks, ConsesLow.list( ConsesLow.list( index_arg ) ), ConsesLow.list( ConsesLow.list(
            gather_arg ) ), index_arg_pfis, NIL, UNPROVIDED, UNPROVIDED );
        index_arg_bound_query = list_utilities.tree_substitute( index_arg_bound_query, $list83, index_term );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_6, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_5, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
      }
      final SubLObject this_count = Sequences.length( sksi_sks_interaction.generate_sparql_result_set_from_csql( index_arg_bound_query, access_path ) );
      if( this_count.isZero() )
      {
        Errors.warn( $str84$Zero_count_for__A__A__A, sentence, index_arg, gather_arg );
      }
      else
      {
        samples = ConsesLow.cons( this_count, samples );
      }
      sample_size = Numbers.add( sample_size, ONE_INTEGER );
    }
    result = Numbers.truncate( number_utilities.mean( samples ), UNPROVIDED );
    if( NIL != progress_stream )
    {
      format_nil.force_format( progress_stream, $str85$_A, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 54615L)
  public static SubLObject representative_sampleP(final SubLObject samples, final SubLObject total_count)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == samples )
    {
      return NIL;
    }
    final SubLObject sample_count = Sequences.length( samples );
    SubLObject result = NIL;
    result = makeBoolean( sample_count.numGE( $sksi_sparql_max_cost_query_samples$.getDynamicValue( thread ) ) || sample_count.numGE( total_count ) );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 55337L)
  public static SubLObject sksi_sparql_determine_rdf_type_logical_cardinality_wrt_value_estimates_from_file(final SubLObject filename, SubLObject only_report_missingP)
  {
    if( only_report_missingP == UNPROVIDED )
    {
      only_report_missingP = NIL;
    }
    final SubLObject ls = $const86$CCF_SDB_RDFType_LS;
    final SubLObject meta_mt = sksi_kb_accessors.sk_source_mapping_mt( $const87$CCF_SDB_KS );
    final SubLObject arg2_lf_set = el_utilities.make_el_set( ConsesLow.list( narts_high.find_nart( $list88 ) ), UNPROVIDED );
    final SubLObject arg3_lf_set = el_utilities.make_el_set( ConsesLow.list( narts_high.find_nart( $list89 ) ), UNPROVIDED );
    SubLObject cdolist_list_var = file_utilities.get_file_lines( filename );
    SubLObject line = NIL;
    line = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = string_utilities.string_tokenize( line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject term_info_string = NIL;
      SubLObject count_string = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
      term_info_string = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
      count_string = current.first();
      current = current.rest();
      final SubLObject ignore1 = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list90 );
      current = current.rest();
      final SubLObject ignore2 = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list90 );
      current = current.rest();
      if( NIL == current )
      {
        SubLObject current_$96;
        final SubLObject datum_$95 = current_$96 = string_utilities.string_tokenize( term_info_string, $list91, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject term_junk = NIL;
        SubLObject term_string = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$96, datum_$95, $list92 );
        term_junk = current_$96.first();
        current_$96 = current_$96.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$96, datum_$95, $list92 );
        term_string = current_$96.first();
        current_$96 = current_$96.rest();
        if( NIL == current_$96 )
        {
          final SubLObject count = reader.parse_integer( count_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          final SubLObject lookup_term_string = Sequences.cconcatenate( $str93$ptrec_, term_string );
          final SubLObject cyc_term = sksi_reformulate.sksi_reformulate( el_utilities.make_binary_formula( $const94$SchemaObjectFn, $const95$CCF_SDB_RDFType_CMLS, lookup_term_string ), $kw96$DECODE,
              $const97$CCF_SDB_SDBMySQLExportStore_Cyc_K );
          if( NIL != forts.fort_p( cyc_term ) )
          {
            if( NIL == only_report_missingP )
            {
              final SubLObject existing_nums = ask_utilities.query_template( $sym79$_NUM, ConsesLow.list( $const98$logicalResultSetCardinalityWRTVal, ls, arg2_lf_set, arg3_lf_set, $sym79$_NUM, cyc_term ), meta_mt,
                  UNPROVIDED );
              if( NIL != existing_nums )
              {
                SubLObject cdolist_list_var_$97 = existing_nums;
                SubLObject existing_num = NIL;
                existing_num = cdolist_list_var_$97.first();
                while ( NIL != cdolist_list_var_$97)
                {
                  if( !existing_num.equal( count ) )
                  {
                    final SubLObject old_sentence = ConsesLow.list( $const98$logicalResultSetCardinalityWRTVal, ls, arg2_lf_set, arg3_lf_set, existing_num, cyc_term );
                    ke.ke_unassert( old_sentence, meta_mt );
                  }
                  cdolist_list_var_$97 = cdolist_list_var_$97.rest();
                  existing_num = cdolist_list_var_$97.first();
                }
              }
              if( NIL == subl_promotions.memberP( count, existing_nums, UNPROVIDED, UNPROVIDED ) )
              {
                final SubLObject new_sentence = ConsesLow.list( $const98$logicalResultSetCardinalityWRTVal, ls, arg2_lf_set, arg3_lf_set, count, cyc_term );
                ke.ke_assert( new_sentence, meta_mt, UNPROVIDED, UNPROVIDED );
              }
            }
          }
          else if( NIL != only_report_missingP )
          {
            PrintLow.format( T, $str99$_A__, lookup_term_string );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$95, $list92 );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list90 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      line = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 57478L)
  public static SubLObject sksi_sparql_determine_rdf_type_logical_cardinality_wrt_value_estimates(SubLObject ls, SubLObject rdf_type_class_coll)
  {
    if( ls == UNPROVIDED )
    {
      ls = $const86$CCF_SDB_RDFType_LS;
    }
    if( rdf_type_class_coll == UNPROVIDED )
    {
      rdf_type_class_coll = $const100$CCFRDF_TypeOWLClass;
    }
    final SubLObject meta_mt = sksi_kb_accessors.sk_source_mapping_mt( $const87$CCF_SDB_KS );
    final SubLObject arg2_lf_set = el_utilities.make_el_set( ConsesLow.list( narts_high.find_nart( ConsesLow.listS( $const101$LogicalFieldFn, ls, $list102 ) ) ), UNPROVIDED );
    final SubLObject arg3_lf_set = el_utilities.make_el_set( ConsesLow.list( narts_high.find_nart( ConsesLow.listS( $const101$LogicalFieldFn, ls, $list103 ) ) ), UNPROVIDED );
    SubLObject cdolist_list_var = isa.all_instances_in_all_mts( rdf_type_class_coll );
    SubLObject rdf_type_class = NIL;
    rdf_type_class = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      format_nil.force_format( T, $str68$___A__, rdf_type_class, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL == isa.isa_in_any_mtP( rdf_type_class_coll, $const104$ExpandedGraphRDF_TypeCCFOWLClass ) )
      {
        final SubLObject existing_nums = ask_utilities.query_template( $sym79$_NUM, ConsesLow.list( $const98$logicalResultSetCardinalityWRTVal, ls, arg2_lf_set, arg3_lf_set, $sym79$_NUM, rdf_type_class ), meta_mt,
            UNPROVIDED );
        if( Functions.apply( $sym105$_, existing_nums ).numG( $int106$1000000 ) )
        {
          Errors.warn( $str107$Skipping__A_since_current_cost_hi, rdf_type_class, existing_nums );
        }
        else
        {
          final SubLObject query_results = ask_utilities.query_template( $sym108$_X, el_utilities.make_binary_formula( $const109$rdf_type, $sym108$_X, rdf_type_class ), $const110$CCF_CAE_QueryMt, UNPROVIDED );
          final SubLObject new_num = Sequences.length( query_results );
          format_nil.force_format( T, $str99$_A__, new_num, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          if( !new_num.eql( ZERO_INTEGER ) )
          {
            if( NIL != existing_nums )
            {
              SubLObject cdolist_list_var_$98 = existing_nums;
              SubLObject existing_num = NIL;
              existing_num = cdolist_list_var_$98.first();
              while ( NIL != cdolist_list_var_$98)
              {
                if( !existing_num.equal( new_num ) )
                {
                  final SubLObject old_sentence = ConsesLow.list( $const98$logicalResultSetCardinalityWRTVal, ls, arg2_lf_set, arg3_lf_set, existing_num, rdf_type_class );
                  ke.ke_unassert( old_sentence, meta_mt );
                }
                cdolist_list_var_$98 = cdolist_list_var_$98.rest();
                existing_num = cdolist_list_var_$98.first();
              }
            }
            if( NIL == subl_promotions.memberP( new_num, existing_nums, UNPROVIDED, UNPROVIDED ) )
            {
              final SubLObject new_sentence = ConsesLow.list( $const98$logicalResultSetCardinalityWRTVal, ls, arg2_lf_set, arg3_lf_set, new_num, rdf_type_class );
              ke.ke_assert( new_sentence, meta_mt, UNPROVIDED, UNPROVIDED );
            }
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      rdf_type_class = cdolist_list_var.first();
    }
    return NIL;
  }

  public static SubLObject declare_sksi_cost_estimates_file()
  {
    SubLFiles.declareFunction( me, "update_cost_estimates_for_sks", "UPDATE-COST-ESTIMATES-FOR-SKS", 1, 1, false );
    SubLFiles.declareFunction( me, "update_cost_estimates_for_meaning_sentence_pred", "UPDATE-COST-ESTIMATES-FOR-MEANING-SENTENCE-PRED", 4, 2, false );
    SubLFiles.declareFunction( me, "update_cost_estimates_for_meaning_sentence", "UPDATE-COST-ESTIMATES-FOR-MEANING-SENTENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "update_cost_estimates_for_conditional_meaning_sentence", "UPDATE-COST-ESTIMATES-FOR-CONDITIONAL-MEANING-SENTENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "update_cost_estimates_for_logical_fields", "UPDATE-COST-ESTIMATES-FOR-LOGICAL-FIELDS", 4, 2, false );
    SubLFiles.declareFunction( me, "update_cost_estimates_for_field_decoding", "UPDATE-COST-ESTIMATES-FOR-FIELD-DECODING", 1, 1, false );
    SubLFiles.declareFunction( me, "update_cost_estimates_for_field_encoding", "UPDATE-COST-ESTIMATES-FOR-FIELD-ENCODING", 1, 1, false );
    SubLFiles.declareFunction( me, "update_cost_estimates_for_sks_int", "UPDATE-COST-ESTIMATES-FOR-SKS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "physical_field_tuples_used_in_meaning_sentences_in_ks", "PHYSICAL-FIELD-TUPLES-USED-IN-MEANING-SENTENCES-IN-KS", 1, 0, false );
    SubLFiles.declareFunction( me, "any_lfi_appears_in_sentenceP", "ANY-LFI-APPEARS-IN-SENTENCE?", 2, 0, false );
    SubLFiles.declareFunction( me, "physical_field_tuples_for_ps_ls", "PHYSICAL-FIELD-TUPLES-FOR-PS-LS", 2, 2, false );
    SubLFiles.declareFunction( me, "get_from_and_where_expression_for_antecedent_of_cms", "GET-FROM-AND-WHERE-EXPRESSION-FOR-ANTECEDENT-OF-CMS", 4, 0, false );
    SubLFiles.declareFunction( me, "physical_field_tuples_for_meaning_sentence", "PHYSICAL-FIELD-TUPLES-FOR-MEANING-SENTENCE", 4, 0, false );
    SubLFiles.declareFunction( me, "update_cost_estimates_for_ks_ps", "UPDATE-COST-ESTIMATES-FOR-KS-PS", 4, 1, false );
    SubLFiles.declareFunction( me, "update_cost_estimates_for_db_ps", "UPDATE-COST-ESTIMATES-FOR-DB-PS", 6, 0, false );
    SubLFiles.declareFunction( me, "gather_cost_estimate_for_select_and_where_sets", "GATHER-COST-ESTIMATE-FOR-SELECT-AND-WHERE-SETS", 8, 0, false );
    SubLFiles.declareFunction( me, "assert_cost_estimate_for_select_and_where_sets", "ASSERT-COST-ESTIMATE-FOR-SELECT-AND-WHERE-SETS", 9, 0, false );
    SubLFiles.declareFunction( me, "remove_cost_estimates_for_ps_list", "REMOVE-COST-ESTIMATES-FOR-PS-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_cost_estimates_for_ps", "REMOVE-COST-ESTIMATES-FOR-PS", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_cost_estimate_for_select_where_sets", "REMOVE-COST-ESTIMATE-FOR-SELECT-WHERE-SETS", 7, 0, false );
    SubLFiles.declareFunction( me, "remove_result_set_cardinality_gaf_for_select_where_sets", "REMOVE-RESULT-SET-CARDINALITY-GAF-FOR-SELECT-WHERE-SETS", 3, 0, false );
    SubLFiles.declareFunction( me, "remove_result_set_cardinality_wXconstraints_gaf_for_select_where_sets", "REMOVE-RESULT-SET-CARDINALITY-W/CONSTRAINTS-GAF-FOR-SELECT-WHERE-SETS", 7, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_csql_for_gathering_cost_estimates", "SKSI-DETERMINE-CSQL-FOR-GATHERING-COST-ESTIMATES", 4, 0, false );
    SubLFiles.declareFunction( me, "determine_sql_for_gathering_cost_estimates", "DETERMINE-SQL-FOR-GATHERING-COST-ESTIMATES", 8, 0, false );
    SubLFiles.declareFunction( me, "determine_sql_for_gathering_cost_estimates_via_subquery", "DETERMINE-SQL-FOR-GATHERING-COST-ESTIMATES-VIA-SUBQUERY", 7, 0, false );
    SubLFiles.declareFunction( me, "determine_sql_for_gathering_cost_estimates_via_temporary_table", "DETERMINE-SQL-FOR-GATHERING-COST-ESTIMATES-VIA-TEMPORARY-TABLE", 7, 0, false );
    SubLFiles.declareFunction( me, "get_sk_source_row_count", "GET-SK-SOURCE-ROW-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "create_sampling_view", "CREATE-SAMPLING-VIEW", 3, 0, false );
    SubLFiles.declareFunction( me, "remove_sampling_view", "REMOVE-SAMPLING-VIEW", 3, 0, false );
    SubLFiles.declareFunction( me, "use_cost_estimate_sampling_viewP", "USE-COST-ESTIMATE-SAMPLING-VIEW?", 3, 0, false );
    SubLFiles.declareFunction( me, "make_sql_for_select_set", "MAKE-SQL-FOR-SELECT-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "make_sql_for_select_set_field", "MAKE-SQL-FOR-SELECT-SET-FIELD", 4, 0, false );
    SubLFiles.declareFunction( me, "make_sql_for_where_set", "MAKE-SQL-FOR-WHERE-SET", 4, 0, false );
    SubLFiles.declareFunction( me, "make_sql_for_where_set_field", "MAKE-SQL-FOR-WHERE-SET-FIELD", 4, 0, false );
    SubLFiles.declareFunction( me, "make_physical_field_name", "MAKE-PHYSICAL-FIELD-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sql_for_table", "MAKE-SQL-FOR-TABLE", 5, 0, false );
    SubLFiles.declareFunction( me, "alpha_chars_in_caps_p", "ALPHA-CHARS-IN-CAPS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "alpha_char_in_capP", "ALPHA-CHAR-IN-CAP?", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_sparql_determine_logical_cardinality_estimates_for_ks", "SKSI-SPARQL-DETERMINE-LOGICAL-CARDINALITY-ESTIMATES-FOR-KS", 1, 2, false );
    SubLFiles.declareFunction( me, "sksi_sparql_determine_logical_cardinality_estimates_for_ls", "SKSI-SPARQL-DETERMINE-LOGICAL-CARDINALITY-ESTIMATES-FOR-LS", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_sparql_determine_logical_cardinality_estimates_for_meaning_sentence", "SKSI-SPARQL-DETERMINE-LOGICAL-CARDINALITY-ESTIMATES-FOR-MEANING-SENTENCE", 5, 0, false );
    SubLFiles.declareFunction( me, "sksi_sparql_determine_logical_cardinality_estimate_for_meaning_sentence_bound_in_arg", "SKSI-SPARQL-DETERMINE-LOGICAL-CARDINALITY-ESTIMATE-FOR-MEANING-SENTENCE-BOUND-IN-ARG", 7, 2,
        false );
    SubLFiles.declareFunction( me, "representative_sampleP", "REPRESENTATIVE-SAMPLE?", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_sparql_determine_rdf_type_logical_cardinality_wrt_value_estimates_from_file", "SKSI-SPARQL-DETERMINE-RDF-TYPE-LOGICAL-CARDINALITY-WRT-VALUE-ESTIMATES-FROM-FILE", 1, 1, false );
    SubLFiles.declareFunction( me, "sksi_sparql_determine_rdf_type_logical_cardinality_wrt_value_estimates", "SKSI-SPARQL-DETERMINE-RDF-TYPE-LOGICAL-CARDINALITY-WRT-VALUE-ESTIMATES", 0, 2, false );
    return NIL;
  }

  public static SubLObject init_sksi_cost_estimates_file()
  {
    $cost_estimate_sampling_percentage$ = SubLFiles.deflexical( "*COST-ESTIMATE-SAMPLING-PERCENTAGE*", $float17$0_1 );
    $cost_estimate_sampling_view_name$ = SubLFiles.deflexical( "*COST-ESTIMATE-SAMPLING-VIEW-NAME*", $str18$cost_est_sampling );
    $sksi_sparql_max_cost_query_samples$ = SubLFiles.defparameter( "*SKSI-SPARQL-MAX-COST-QUERY-SAMPLES*", TWENTY_INTEGER );
    return NIL;
  }

  public static SubLObject setup_sksi_cost_estimates_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_cost_estimates_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_cost_estimates_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_cost_estimates_file();
  }
  static
  {
    me = new sksi_cost_estimates();
    $cost_estimate_sampling_percentage$ = null;
    $cost_estimate_sampling_view_name$ = null;
    $sksi_sparql_max_cost_query_samples$ = null;
    $str0$SKSI_SQL_statement_cache_ = makeString( "SKSI SQL statement cache " );
    $kw1$REMOVE_SELECTIVE = makeKeyword( "REMOVE-SELECTIVE" );
    $sym2$SCHEMA_REPRESENTATION_COMPLETE_ = makeSymbol( "SCHEMA-REPRESENTATION-COMPLETE?" );
    $list3 = ConsesLow.list( makeSymbol( "LOGICAL-SCHEMA" ), makeSymbol( "LOGICAL-FIELD-INDEXICAL" ), makeSymbol( "PHYSICAL-SCHEMA" ), makeSymbol( "DECODING" ) );
    $list4 = ConsesLow.list( makeSymbol( "PHYSICAL-SCHEMA" ), makeSymbol( "PHYSICAL-FIELD-INDEXICAL" ), makeSymbol( "LOGICAL-SCHEMA" ), makeSymbol( "ENCODING" ) );
    $list5 = ConsesLow.list( makeSymbol( "PS" ), makeSymbol( "PF-TUPLES" ) );
    $kw6$REMOVE_ALL = makeKeyword( "REMOVE-ALL" );
    $kw7$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym8$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $kw9$POS = makeKeyword( "POS" );
    $list10 = ConsesLow.list( makeSymbol( "ARGPOS-LIST" ), makeSymbol( "BOUNDEDNESS" ) );
    $kw11$FULLY_BOUND = makeKeyword( "FULLY-BOUND" );
    $const12$Database_Physical = constant_handles.reader_make_constant_shell( makeString( "Database-Physical" ) );
    $sym13$PHYSICAL_SCHEMA_ENUMERABLE_ = makeSymbol( "PHYSICAL-SCHEMA-ENUMERABLE?" );
    $list14 = ConsesLow.list( makeSymbol( "SELECT-WHERE-SETS" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "FROM-EXPRESSION" ), makeSymbol( "WHERE-EXPRESSION" ), makeSymbol( "EVAL-CONDITIONS" ) );
    $list15 = ConsesLow.list( makeSymbol( "SELECT-SET" ), makeSymbol( "WHERE-SET" ) );
    $kw16$ONLY_REMOVE = makeKeyword( "ONLY-REMOVE" );
    $float17$0_1 = makeDouble( 0.1 );
    $str18$cost_est_sampling = makeString( "cost_est_sampling" );
    $int19$100 = makeInteger( 100 );
    $const20$resultSetCardinalityWithConstrain = constant_handles.reader_make_constant_shell( makeString( "resultSetCardinalityWithConstraints" ) );
    $const21$resultSetCardinality = constant_handles.reader_make_constant_shell( makeString( "resultSetCardinality" ) );
    $kw22$GAF = makeKeyword( "GAF" );
    $kw23$TRUE = makeKeyword( "TRUE" );
    $const24$PostgreSQL = constant_handles.reader_make_constant_shell( makeString( "PostgreSQL" ) );
    $const25$MySQL_TheProgram = constant_handles.reader_make_constant_shell( makeString( "MySQL-TheProgram" ) );
    $const26$OracleDatabaseServer_TheProgram = constant_handles.reader_make_constant_shell( makeString( "OracleDatabaseServer-TheProgram" ) );
    $str27$Continue_without_this_knowledge_s = makeString( "Continue without this knowledge source." );
    $str28$Cannot_gather_the_cost_estimates_ = makeString( "Cannot gather the cost estimates for the knowledge source ~A because the SQL flavor ~A is not currently supported by this functionality" );
    $sym29$STRINGP = makeSymbol( "STRINGP" );
    $str30$select_avg_sksi_cost_est_count__f = makeString( "select avg(sksi_cost_est.count) from (select count(distinct " );
    $str31$__ = makeString( ") " );
    $str32$count_ = makeString( "count " );
    $str33$ = makeString( "" );
    $str34$from_ = makeString( "from " );
    $str35$_where_ = makeString( " where " );
    $str36$_group_by_ = makeString( " group by " );
    $str37$as = makeString( "as" );
    $str38$_sksi_cost_est = makeString( " sksi_cost_est" );
    $str39$drop_table_if_exists_sksi_cost_es = makeString( "drop table if exists sksi_cost_est" );
    $str40$create_temporary_table_sksi_cost_ = makeString( "create temporary table sksi_cost_est " );
    $str41$select_count_distinct_ = makeString( "select count(distinct " );
    $str42$__as_cost_est_count_from_ = makeString( ") as cost_est_count from " );
    $str43$select_avg_cost_est_count__from_s = makeString( "select avg(cost_est_count) from sksi_cost_est" );
    $str44$select_count____from_ = makeString( "select count(*) from " );
    $str45$create_view_ = makeString( "create view " );
    $str46$_as_select___from_ = makeString( " as select * from " );
    $str47$_sample_ = makeString( " sample(" );
    $str48$_ = makeString( ")" );
    $str49$create_or_replace_view_ = makeString( "create or replace view " );
    $str50$_order_by_ = makeString( " order by " );
    $str51$random__ = makeString( "random()" );
    $str52$rand__ = makeString( "rand()" );
    $str53$_limit_ = makeString( " limit " );
    $str54$drop_view_ = makeString( "drop view " );
    $sym55$PF_ALIAS_FN_NAUT_P = makeSymbol( "PF-ALIAS-FN-NAUT-P" );
    $str56$concat_ws______ = makeString( "concat_ws(' ', " );
    $str57$___________ = makeString( " || ' ' || " );
    $str58$__ = makeString( ", " );
    $list59 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MySQL-TheProgram" ) ) );
    $sym60$FIRST = makeSymbol( "FIRST" );
    $str61$_cast_ = makeString( " cast(" );
    $str62$_as_text_ = makeString( " as text)" );
    $str63$_ = makeString( "\"" );
    $str64$_ = makeString( "." );
    $sym65$ALPHA_CHAR_IN_CAP_ = makeSymbol( "ALPHA-CHAR-IN-CAP?" );
    $const66$meaningSentencePredicateForSchema = constant_handles.reader_make_constant_shell( makeString( "meaningSentencePredicateForSchema" ) );
    $sym67$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str68$___A__ = makeString( "~&~A: " );
    $str69$SKIPPED__ignored_ = makeString( "SKIPPED (ignored)" );
    $const70$ExpandedGraphConcept = constant_handles.reader_make_constant_shell( makeString( "ExpandedGraphConcept" ) );
    $str71$SKIPPED__expanded_ = makeString( "SKIPPED (expanded)" );
    $const72$CCFDemographicProperty = constant_handles.reader_make_constant_shell( makeString( "CCFDemographicProperty" ) );
    $str73$SKIPPED__demographic_property_ = makeString( "SKIPPED (demographic property)" );
    $str74$__ = makeString( "~%" );
    $str75$ERROR___A__ = makeString( "ERROR: ~A~%" );
    $list76 = ConsesLow.list( ConsesLow.list( ONE_INTEGER ), ConsesLow.list( TWO_INTEGER ) );
    $int77$1000 = makeInteger( 1000 );
    $str78$Could_not_find_logical_fields_for = makeString( "Could not find logical fields for ~A" );
    $sym79$_NUM = makeSymbol( "?NUM" );
    $const80$logicalResultSetCardinality = constant_handles.reader_make_constant_shell( makeString( "logicalResultSetCardinality" ) );
    $const81$TheSet = constant_handles.reader_make_constant_shell( makeString( "TheSet" ) );
    $str82$__A_ = makeString( " ~A:" );
    $list83 = ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "RAW-TERM1" ) );
    $str84$Zero_count_for__A__A__A = makeString( "Zero count for ~A ~A ~A" );
    $str85$_A = makeString( "~A" );
    $const86$CCF_SDB_RDFType_LS = constant_handles.reader_make_constant_shell( makeString( "CCF-SDB-RDFType-LS" ) );
    $const87$CCF_SDB_KS = constant_handles.reader_make_constant_shell( makeString( "CCF-SDB-KS" ) );
    $list88 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "LogicalFieldFn" ) ), constant_handles.reader_make_constant_shell( makeString( "CCF-SDB-RDFType-LS" ) ), constant_handles
        .reader_make_constant_shell( makeString( "CCFOWLInstance" ) ), ONE_INTEGER );
    $list89 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "LogicalFieldFn" ) ), constant_handles.reader_make_constant_shell( makeString( "CCF-SDB-RDFType-LS" ) ), constant_handles
        .reader_make_constant_shell( makeString( "CCFOWLClass" ) ), ONE_INTEGER );
    $list90 = ConsesLow.list( makeSymbol( "TERM-INFO-STRING" ), makeSymbol( "COUNT-STRING" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "IGNORE1" ), makeSymbol( "IGNORE2" ) );
    $list91 = ConsesLow.list( Characters.CHAR_hash );
    $list92 = ConsesLow.list( makeSymbol( "TERM-JUNK" ), makeSymbol( "TERM-STRING" ) );
    $str93$ptrec_ = makeString( "ptrec:" );
    $const94$SchemaObjectFn = constant_handles.reader_make_constant_shell( makeString( "SchemaObjectFn" ) );
    $const95$CCF_SDB_RDFType_CMLS = constant_handles.reader_make_constant_shell( makeString( "CCF-SDB-RDFType-CMLS" ) );
    $kw96$DECODE = makeKeyword( "DECODE" );
    $const97$CCF_SDB_SDBMySQLExportStore_Cyc_K = constant_handles.reader_make_constant_shell( makeString( "CCF-SDB-SDBMySQLExportStore-Cyc-KS" ) );
    $const98$logicalResultSetCardinalityWRTVal = constant_handles.reader_make_constant_shell( makeString( "logicalResultSetCardinalityWRTValue" ) );
    $str99$_A__ = makeString( "~A~%" );
    $const100$CCFRDF_TypeOWLClass = constant_handles.reader_make_constant_shell( makeString( "CCFRDF-TypeOWLClass" ) );
    $const101$LogicalFieldFn = constant_handles.reader_make_constant_shell( makeString( "LogicalFieldFn" ) );
    $list102 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CCFOWLInstance" ) ), ONE_INTEGER );
    $list103 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CCFOWLClass" ) ), ONE_INTEGER );
    $const104$ExpandedGraphRDF_TypeCCFOWLClass = constant_handles.reader_make_constant_shell( makeString( "ExpandedGraphRDF-TypeCCFOWLClass" ) );
    $sym105$_ = makeSymbol( "+" );
    $int106$1000000 = makeInteger( 1000000 );
    $str107$Skipping__A_since_current_cost_hi = makeString( "Skipping ~A since current cost high: ~A~%" );
    $sym108$_X = makeSymbol( "?X" );
    $const109$rdf_type = constant_handles.reader_make_constant_shell( makeString( "rdf-type" ) );
    $const110$CCF_CAE_QueryMt = constant_handles.reader_make_constant_shell( makeString( "CCF-CAE-QueryMt" ) );
  }
}
/*
 * 
 * Total time: 1477 ms
 * 
 */