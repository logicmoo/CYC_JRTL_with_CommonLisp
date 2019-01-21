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

public final class sksi_cost_estimates extends SubLTranslatedFile
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
    public static SubLObject update_cost_estimates_for_sks(final SubLObject sk_source, SubLObject mapping_mt) {
        if (mapping_mt == sksi_cost_estimates.UNPROVIDED) {
            mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject mt_var = mapping_mt;
                final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    if (sksi_cost_estimates.NIL != sksi_kb_accessors.knowledge_source_representation_completeP(sk_source)) {
                        final SubLObject sub_kses = sksi_kb_accessors.sk_source_sub_ks_closure(sk_source);
                        if (sksi_cost_estimates.NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP()) {
                            SubLObject cdolist_list_var = sub_kses;
                            SubLObject each_ks = (SubLObject)sksi_cost_estimates.NIL;
                            each_ks = cdolist_list_var.first();
                            while (sksi_cost_estimates.NIL != cdolist_list_var) {
                                update_cost_estimates_for_sks_int(each_ks, mapping_mt);
                                cdolist_list_var = cdolist_list_var.rest();
                                each_ks = cdolist_list_var.first();
                            }
                        }
                        else {
                            final SubLObject _prev_bind_0_$2 = sksi_macros.$sksi_sql_connection_cache$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$3 = sksi_macros.$sksi_sql_statement_cache$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding(thread);
                            try {
                                sksi_macros.$sksi_sql_connection_cache$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQUALP), (SubLObject)sksi_cost_estimates.UNPROVIDED), thread);
                                sksi_macros.$sksi_sql_statement_cache$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQ), (SubLObject)sksi_cost_estimates.UNPROVIDED), thread);
                                sksi_macros.$sksi_sql_statement_pool_lock$.bind(Locks.make_lock(Strings.string(Symbols.gensym((SubLObject)sksi_cost_estimates.$str0$SKSI_SQL_statement_cache_))), thread);
                                SubLObject resourcing_caches_finalizedP = (SubLObject)sksi_cost_estimates.NIL;
                                try {
                                    SubLObject cdolist_list_var2 = sub_kses;
                                    SubLObject each_ks2 = (SubLObject)sksi_cost_estimates.NIL;
                                    each_ks2 = cdolist_list_var2.first();
                                    while (sksi_cost_estimates.NIL != cdolist_list_var2) {
                                        update_cost_estimates_for_sks_int(each_ks2, mapping_mt);
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        each_ks2 = cdolist_list_var2.first();
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_cost_estimates.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        try {
                                            resourcing_caches_finalizedP = sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_cost_estimates.T, thread);
                                                final SubLObject _values_$6 = Values.getValuesAsVector();
                                                if (sksi_cost_estimates.NIL == resourcing_caches_finalizedP) {
                                                    sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                                }
                                                Values.restoreValuesFromVector(_values_$6);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                            }
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                    }
                                }
                            }
                            finally {
                                sksi_macros.$sksi_sql_statement_pool_lock$.rebind(_prev_bind_3, thread);
                                sksi_macros.$sksi_sql_statement_cache$.rebind(_prev_bind_1_$3, thread);
                                sksi_macros.$sksi_sql_connection_cache$.rebind(_prev_bind_0_$2, thread);
                            }
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_cost_estimates.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 5927L)
    public static SubLObject update_cost_estimates_for_meaning_sentence_pred(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject pred, SubLObject logical_field_list, SubLObject mapping_mt) {
        if (logical_field_list == sksi_cost_estimates.UNPROVIDED) {
            logical_field_list = (SubLObject)sksi_cost_estimates.NIL;
        }
        if (mapping_mt == sksi_cost_estimates.UNPROVIDED) {
            mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject mt_var = mapping_mt;
                final SubLObject _prev_bind_0_$8 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    if (sksi_cost_estimates.NIL != sksi_kb_accessors.schema_representation_completeP(physical_schema) && sksi_cost_estimates.NIL != sksi_kb_accessors.schema_representation_completeP(logical_schema)) {
                        if (sksi_cost_estimates.NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP()) {
                            final SubLObject pf_tuples = physical_field_tuples_for_ps_ls(physical_schema, logical_schema, pred, logical_field_list);
                            update_cost_estimates_for_ks_ps(sk_source, (SubLObject)ConsesLow.list(physical_schema), pf_tuples, mapping_mt, (SubLObject)sksi_cost_estimates.$kw1$REMOVE_SELECTIVE);
                        }
                        else {
                            final SubLObject _prev_bind_0_$9 = sksi_macros.$sksi_sql_connection_cache$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$10 = sksi_macros.$sksi_sql_statement_cache$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding(thread);
                            try {
                                sksi_macros.$sksi_sql_connection_cache$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQUALP), (SubLObject)sksi_cost_estimates.UNPROVIDED), thread);
                                sksi_macros.$sksi_sql_statement_cache$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQ), (SubLObject)sksi_cost_estimates.UNPROVIDED), thread);
                                sksi_macros.$sksi_sql_statement_pool_lock$.bind(Locks.make_lock(Strings.string(Symbols.gensym((SubLObject)sksi_cost_estimates.$str0$SKSI_SQL_statement_cache_))), thread);
                                SubLObject resourcing_caches_finalizedP = (SubLObject)sksi_cost_estimates.NIL;
                                try {
                                    final SubLObject pf_tuples2 = physical_field_tuples_for_ps_ls(physical_schema, logical_schema, pred, logical_field_list);
                                    update_cost_estimates_for_ks_ps(sk_source, (SubLObject)ConsesLow.list(physical_schema), pf_tuples2, mapping_mt, (SubLObject)sksi_cost_estimates.$kw1$REMOVE_SELECTIVE);
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_cost_estimates.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        try {
                                            resourcing_caches_finalizedP = sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_cost_estimates.T, thread);
                                                final SubLObject _values_$13 = Values.getValuesAsVector();
                                                if (sksi_cost_estimates.NIL == resourcing_caches_finalizedP) {
                                                    sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                                }
                                                Values.restoreValuesFromVector(_values_$13);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                                            }
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                    }
                                }
                            }
                            finally {
                                sksi_macros.$sksi_sql_statement_pool_lock$.rebind(_prev_bind_3, thread);
                                sksi_macros.$sksi_sql_statement_cache$.rebind(_prev_bind_1_$10, thread);
                                sksi_macros.$sksi_sql_connection_cache$.rebind(_prev_bind_0_$9, thread);
                            }
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$8, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_cost_estimates.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 7321L)
    public static SubLObject update_cost_estimates_for_meaning_sentence(final SubLObject meaning_sentence_gaf, SubLObject update_mode) {
        if (update_mode == sksi_cost_estimates.UNPROVIDED) {
            update_mode = (SubLObject)sksi_cost_estimates.$kw1$REMOVE_SELECTIVE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if (sksi_cost_estimates.NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP()) {
                    final SubLObject logical_schema = sksi_meaning_sentence_utilities.get_logical_schema_from_meaning_sentence_gaf(meaning_sentence_gaf);
                    final SubLObject sentence = sksi_meaning_sentence_utilities.get_meaning_sentence_from_gaf(meaning_sentence_gaf, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                    final SubLObject mt = assertions_high.assertion_mt(meaning_sentence_gaf);
                    final SubLObject sk_source = sksi_kb_accessors.logical_schema_description_mt_sk_source_in_any_mt(mt);
                    final SubLObject mt_var;
                    final SubLObject mapping_mt = mt_var = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
                    final SubLObject _prev_bind_0_$15 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        if (sksi_cost_estimates.NIL != sksi_kb_accessors.schema_representation_completeP(logical_schema)) {
                            final SubLObject logical_fields = sksi_meaning_sentence_utilities.meaning_sentence_logical_fields(sentence);
                            SubLObject cdolist_list_var;
                            final SubLObject physical_schemata = cdolist_list_var = sksi_kb_accessors.logical_schema_physical_schemata(logical_schema);
                            SubLObject ps = (SubLObject)sksi_cost_estimates.NIL;
                            ps = cdolist_list_var.first();
                            while (sksi_cost_estimates.NIL != cdolist_list_var) {
                                final SubLObject sks_list = sksi_kb_accessors.physical_schema_sk_sources(ps);
                                final SubLObject logical_physical_field_mappings = sksi_infrastructure_utilities.physical_field_mappings_for_logical_fields(logical_fields, logical_schema, ps, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                                final SubLObject pf_tuples = physical_field_tuples_for_meaning_sentence(sentence, logical_physical_field_mappings, (SubLObject)ConsesLow.list(ps), (SubLObject)sksi_cost_estimates.NIL);
                                SubLObject cdolist_list_var_$16 = sks_list;
                                SubLObject sks = (SubLObject)sksi_cost_estimates.NIL;
                                sks = cdolist_list_var_$16.first();
                                while (sksi_cost_estimates.NIL != cdolist_list_var_$16) {
                                    update_cost_estimates_for_ks_ps(sks, (SubLObject)ConsesLow.list(ps), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(pf_tuples)), mapping_mt, update_mode);
                                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                                    sks = cdolist_list_var_$16.first();
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                ps = cdolist_list_var.first();
                            }
                        }
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$15, thread);
                    }
                }
                else {
                    final SubLObject _prev_bind_0_$16 = sksi_macros.$sksi_sql_connection_cache$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sksi_macros.$sksi_sql_statement_cache$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding(thread);
                    try {
                        sksi_macros.$sksi_sql_connection_cache$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQUALP), (SubLObject)sksi_cost_estimates.UNPROVIDED), thread);
                        sksi_macros.$sksi_sql_statement_cache$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQ), (SubLObject)sksi_cost_estimates.UNPROVIDED), thread);
                        sksi_macros.$sksi_sql_statement_pool_lock$.bind(Locks.make_lock(Strings.string(Symbols.gensym((SubLObject)sksi_cost_estimates.$str0$SKSI_SQL_statement_cache_))), thread);
                        SubLObject resourcing_caches_finalizedP = (SubLObject)sksi_cost_estimates.NIL;
                        try {
                            final SubLObject logical_schema2 = sksi_meaning_sentence_utilities.get_logical_schema_from_meaning_sentence_gaf(meaning_sentence_gaf);
                            final SubLObject sentence2 = sksi_meaning_sentence_utilities.get_meaning_sentence_from_gaf(meaning_sentence_gaf, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                            final SubLObject mt2 = assertions_high.assertion_mt(meaning_sentence_gaf);
                            final SubLObject sk_source2 = sksi_kb_accessors.logical_schema_description_mt_sk_source_in_any_mt(mt2);
                            final SubLObject mt_var2;
                            final SubLObject mapping_mt2 = mt_var2 = sksi_kb_accessors.sk_source_mapping_mt(sk_source2);
                            final SubLObject _prev_bind_0_$17 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$19 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var2), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var2), thread);
                                if (sksi_cost_estimates.NIL != sksi_kb_accessors.schema_representation_completeP(logical_schema2)) {
                                    final SubLObject logical_fields2 = sksi_meaning_sentence_utilities.meaning_sentence_logical_fields(sentence2);
                                    SubLObject cdolist_list_var2;
                                    final SubLObject physical_schemata2 = cdolist_list_var2 = sksi_kb_accessors.logical_schema_physical_schemata(logical_schema2);
                                    SubLObject ps2 = (SubLObject)sksi_cost_estimates.NIL;
                                    ps2 = cdolist_list_var2.first();
                                    while (sksi_cost_estimates.NIL != cdolist_list_var2) {
                                        final SubLObject sks_list2 = sksi_kb_accessors.physical_schema_sk_sources(ps2);
                                        final SubLObject logical_physical_field_mappings2 = sksi_infrastructure_utilities.physical_field_mappings_for_logical_fields(logical_fields2, logical_schema2, ps2, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                                        final SubLObject pf_tuples2 = physical_field_tuples_for_meaning_sentence(sentence2, logical_physical_field_mappings2, (SubLObject)ConsesLow.list(ps2), (SubLObject)sksi_cost_estimates.NIL);
                                        SubLObject cdolist_list_var_$17 = sks_list2;
                                        SubLObject sks2 = (SubLObject)sksi_cost_estimates.NIL;
                                        sks2 = cdolist_list_var_$17.first();
                                        while (sksi_cost_estimates.NIL != cdolist_list_var_$17) {
                                            update_cost_estimates_for_ks_ps(sks2, (SubLObject)ConsesLow.list(ps2), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(pf_tuples2)), mapping_mt2, update_mode);
                                            cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                                            sks2 = cdolist_list_var_$17.first();
                                        }
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        ps2 = cdolist_list_var2.first();
                                    }
                                }
                            }
                            finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$19, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$17, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_cost_estimates.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                try {
                                    resourcing_caches_finalizedP = sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_cost_estimates.T, thread);
                                        final SubLObject _values_$23 = Values.getValuesAsVector();
                                        if (sksi_cost_estimates.NIL == resourcing_caches_finalizedP) {
                                            sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                        }
                                        Values.restoreValuesFromVector(_values_$23);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                    }
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                            }
                        }
                    }
                    finally {
                        sksi_macros.$sksi_sql_statement_pool_lock$.rebind(_prev_bind_4, thread);
                        sksi_macros.$sksi_sql_statement_cache$.rebind(_prev_bind_3, thread);
                        sksi_macros.$sksi_sql_connection_cache$.rebind(_prev_bind_0_$16, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_cost_estimates.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 9048L)
    public static SubLObject update_cost_estimates_for_conditional_meaning_sentence(final SubLObject meaning_sentence_gaf, SubLObject update_mode) {
        if (update_mode == sksi_cost_estimates.UNPROVIDED) {
            update_mode = (SubLObject)sksi_cost_estimates.$kw1$REMOVE_SELECTIVE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if (sksi_cost_estimates.NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP()) {
                    final SubLObject antecedent_logical_schema_set = sksi_meaning_sentence_utilities.get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf(meaning_sentence_gaf);
                    final SubLObject antecedent_sentence = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf(meaning_sentence_gaf);
                    final SubLObject consequent_logical_schema_set = sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(meaning_sentence_gaf);
                    final SubLObject consequent_sentence = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(meaning_sentence_gaf, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                    final SubLObject mt = assertions_high.assertion_mt(meaning_sentence_gaf);
                    final SubLObject sk_source = sksi_kb_accessors.logical_schema_description_mt_sk_source_in_any_mt(mt);
                    final SubLObject mt_var;
                    final SubLObject mapping_mt = mt_var = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
                    final SubLObject _prev_bind_0_$25 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        if (sksi_cost_estimates.NIL != list_utilities.every_in_list((SubLObject)sksi_cost_estimates.$sym2$SCHEMA_REPRESENTATION_COMPLETE_, antecedent_logical_schema_set, (SubLObject)sksi_cost_estimates.UNPROVIDED) && sksi_cost_estimates.NIL != list_utilities.every_in_list((SubLObject)sksi_cost_estimates.$sym2$SCHEMA_REPRESENTATION_COMPLETE_, consequent_logical_schema_set, (SubLObject)sksi_cost_estimates.UNPROVIDED) && sksi_cost_estimates.NIL != sksi_meaning_sentence_utilities.supported_conditional_meaning_sentence_gaf_p(meaning_sentence_gaf, (SubLObject)sksi_cost_estimates.UNPROVIDED)) {
                            final SubLObject sks = sksi_kb_accessors.nearest_common_super_ks_for_ls_list(conses_high.union(consequent_logical_schema_set, antecedent_logical_schema_set, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED));
                            final SubLObject consequent_logical_fields = sksi_meaning_sentence_utilities.meaning_sentence_logical_fields(consequent_sentence);
                            final SubLObject consequent_physical_schema_set = sksi_kb_accessors.logical_schemata_physical_schemata(consequent_logical_schema_set);
                            final SubLObject logical_physical_field_mappings = sksi_infrastructure_utilities.physical_field_mappings_for_logical_fields_given_logical_physical_schemata(consequent_logical_fields, consequent_logical_schema_set, consequent_physical_schema_set);
                            final SubLObject pf_tuples = physical_field_tuples_for_meaning_sentence(consequent_sentence, logical_physical_field_mappings, consequent_physical_schema_set, antecedent_sentence);
                            SubLObject result_pf_tuples = (SubLObject)sksi_cost_estimates.NIL;
                            if (sksi_cost_estimates.NIL != pf_tuples) {
                                thread.resetMultipleValues();
                                final SubLObject from_expression = get_from_and_where_expression_for_antecedent_of_cms(consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, meaning_sentence_gaf);
                                final SubLObject where_expression = thread.secondMultipleValue();
                                final SubLObject eval_conditions = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (sksi_cost_estimates.NIL != from_expression && sksi_cost_estimates.NIL != where_expression) {
                                    result_pf_tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(pf_tuples, from_expression, (SubLObject)((where_expression == sksi_cost_estimates.T) ? sksi_cost_estimates.NIL : ConsesLow.list(where_expression)), eval_conditions), result_pf_tuples);
                                    update_cost_estimates_for_ks_ps(sks, consequent_physical_schema_set, result_pf_tuples, mapping_mt, update_mode);
                                }
                            }
                        }
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$25, thread);
                    }
                }
                else {
                    final SubLObject _prev_bind_0_$26 = sksi_macros.$sksi_sql_connection_cache$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sksi_macros.$sksi_sql_statement_cache$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding(thread);
                    try {
                        sksi_macros.$sksi_sql_connection_cache$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQUALP), (SubLObject)sksi_cost_estimates.UNPROVIDED), thread);
                        sksi_macros.$sksi_sql_statement_cache$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQ), (SubLObject)sksi_cost_estimates.UNPROVIDED), thread);
                        sksi_macros.$sksi_sql_statement_pool_lock$.bind(Locks.make_lock(Strings.string(Symbols.gensym((SubLObject)sksi_cost_estimates.$str0$SKSI_SQL_statement_cache_))), thread);
                        SubLObject resourcing_caches_finalizedP = (SubLObject)sksi_cost_estimates.NIL;
                        try {
                            final SubLObject antecedent_logical_schema_set2 = sksi_meaning_sentence_utilities.get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf(meaning_sentence_gaf);
                            final SubLObject antecedent_sentence2 = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf(meaning_sentence_gaf);
                            final SubLObject consequent_logical_schema_set2 = sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(meaning_sentence_gaf);
                            final SubLObject consequent_sentence2 = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(meaning_sentence_gaf, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                            final SubLObject mt2 = assertions_high.assertion_mt(meaning_sentence_gaf);
                            final SubLObject sk_source2 = sksi_kb_accessors.logical_schema_description_mt_sk_source_in_any_mt(mt2);
                            final SubLObject mt_var2;
                            final SubLObject mapping_mt2 = mt_var2 = sksi_kb_accessors.sk_source_mapping_mt(sk_source2);
                            final SubLObject _prev_bind_0_$27 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$28 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var2), thread);
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var2), thread);
                                if (sksi_cost_estimates.NIL != list_utilities.every_in_list((SubLObject)sksi_cost_estimates.$sym2$SCHEMA_REPRESENTATION_COMPLETE_, antecedent_logical_schema_set2, (SubLObject)sksi_cost_estimates.UNPROVIDED) && sksi_cost_estimates.NIL != list_utilities.every_in_list((SubLObject)sksi_cost_estimates.$sym2$SCHEMA_REPRESENTATION_COMPLETE_, consequent_logical_schema_set2, (SubLObject)sksi_cost_estimates.UNPROVIDED) && sksi_cost_estimates.NIL != sksi_meaning_sentence_utilities.supported_conditional_meaning_sentence_gaf_p(meaning_sentence_gaf, (SubLObject)sksi_cost_estimates.UNPROVIDED)) {
                                    final SubLObject sks2 = sksi_kb_accessors.nearest_common_super_ks_for_ls_list(conses_high.union(consequent_logical_schema_set2, antecedent_logical_schema_set2, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED));
                                    final SubLObject consequent_logical_fields2 = sksi_meaning_sentence_utilities.meaning_sentence_logical_fields(consequent_sentence2);
                                    final SubLObject consequent_physical_schema_set2 = sksi_kb_accessors.logical_schemata_physical_schemata(consequent_logical_schema_set2);
                                    final SubLObject logical_physical_field_mappings2 = sksi_infrastructure_utilities.physical_field_mappings_for_logical_fields_given_logical_physical_schemata(consequent_logical_fields2, consequent_logical_schema_set2, consequent_physical_schema_set2);
                                    final SubLObject pf_tuples2 = physical_field_tuples_for_meaning_sentence(consequent_sentence2, logical_physical_field_mappings2, consequent_physical_schema_set2, antecedent_sentence2);
                                    SubLObject result_pf_tuples2 = (SubLObject)sksi_cost_estimates.NIL;
                                    if (sksi_cost_estimates.NIL != pf_tuples2) {
                                        thread.resetMultipleValues();
                                        final SubLObject from_expression2 = get_from_and_where_expression_for_antecedent_of_cms(consequent_physical_schema_set2, consequent_logical_schema_set2, antecedent_logical_schema_set2, meaning_sentence_gaf);
                                        final SubLObject where_expression2 = thread.secondMultipleValue();
                                        final SubLObject eval_conditions2 = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        if (sksi_cost_estimates.NIL != from_expression2 && sksi_cost_estimates.NIL != where_expression2) {
                                            result_pf_tuples2 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(pf_tuples2, from_expression2, (SubLObject)((where_expression2 == sksi_cost_estimates.T) ? sksi_cost_estimates.NIL : ConsesLow.list(where_expression2)), eval_conditions2), result_pf_tuples2);
                                            update_cost_estimates_for_ks_ps(sks2, consequent_physical_schema_set2, result_pf_tuples2, mapping_mt2, update_mode);
                                        }
                                    }
                                }
                            }
                            finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$28, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$27, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_cost_estimates.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                try {
                                    resourcing_caches_finalizedP = sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_cost_estimates.T, thread);
                                        final SubLObject _values_$31 = Values.getValuesAsVector();
                                        if (sksi_cost_estimates.NIL == resourcing_caches_finalizedP) {
                                            sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                        }
                                        Values.restoreValuesFromVector(_values_$31);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                                    }
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                            }
                        }
                    }
                    finally {
                        sksi_macros.$sksi_sql_statement_pool_lock$.rebind(_prev_bind_4, thread);
                        sksi_macros.$sksi_sql_statement_cache$.rebind(_prev_bind_3, thread);
                        sksi_macros.$sksi_sql_connection_cache$.rebind(_prev_bind_0_$26, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_cost_estimates.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 11990L)
    public static SubLObject update_cost_estimates_for_logical_fields(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject logical_fields, SubLObject update_mode, SubLObject mapping_mt) {
        if (update_mode == sksi_cost_estimates.UNPROVIDED) {
            update_mode = (SubLObject)sksi_cost_estimates.$kw1$REMOVE_SELECTIVE;
        }
        if (mapping_mt == sksi_cost_estimates.UNPROVIDED) {
            mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject mt_var = mapping_mt;
                final SubLObject _prev_bind_0_$33 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    if (sksi_cost_estimates.NIL != sksi_kb_accessors.schema_representation_completeP(physical_schema) && sksi_cost_estimates.NIL != sksi_kb_accessors.schema_representation_completeP(logical_schema)) {
                        if (sksi_cost_estimates.NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP()) {
                            final SubLObject pf_tuples = physical_field_tuples_for_ps_ls(physical_schema, logical_schema, (SubLObject)sksi_cost_estimates.NIL, logical_fields);
                            update_cost_estimates_for_ks_ps(sk_source, (SubLObject)ConsesLow.list(physical_schema), pf_tuples, mapping_mt, update_mode);
                        }
                        else {
                            final SubLObject _prev_bind_0_$34 = sksi_macros.$sksi_sql_connection_cache$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$35 = sksi_macros.$sksi_sql_statement_cache$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding(thread);
                            try {
                                sksi_macros.$sksi_sql_connection_cache$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQUALP), (SubLObject)sksi_cost_estimates.UNPROVIDED), thread);
                                sksi_macros.$sksi_sql_statement_cache$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQ), (SubLObject)sksi_cost_estimates.UNPROVIDED), thread);
                                sksi_macros.$sksi_sql_statement_pool_lock$.bind(Locks.make_lock(Strings.string(Symbols.gensym((SubLObject)sksi_cost_estimates.$str0$SKSI_SQL_statement_cache_))), thread);
                                SubLObject resourcing_caches_finalizedP = (SubLObject)sksi_cost_estimates.NIL;
                                try {
                                    final SubLObject pf_tuples2 = physical_field_tuples_for_ps_ls(physical_schema, logical_schema, (SubLObject)sksi_cost_estimates.NIL, logical_fields);
                                    update_cost_estimates_for_ks_ps(sk_source, (SubLObject)ConsesLow.list(physical_schema), pf_tuples2, mapping_mt, update_mode);
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_cost_estimates.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        try {
                                            resourcing_caches_finalizedP = sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_cost_estimates.T, thread);
                                                final SubLObject _values_$38 = Values.getValuesAsVector();
                                                if (sksi_cost_estimates.NIL == resourcing_caches_finalizedP) {
                                                    sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                                }
                                                Values.restoreValuesFromVector(_values_$38);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                                            }
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                                    }
                                }
                            }
                            finally {
                                sksi_macros.$sksi_sql_statement_pool_lock$.rebind(_prev_bind_3, thread);
                                sksi_macros.$sksi_sql_statement_cache$.rebind(_prev_bind_1_$35, thread);
                                sksi_macros.$sksi_sql_connection_cache$.rebind(_prev_bind_0_$34, thread);
                            }
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$33, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_cost_estimates.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 13601L)
    public static SubLObject update_cost_estimates_for_field_decoding(final SubLObject field_decoding_gaf, SubLObject update_mode) {
        if (update_mode == sksi_cost_estimates.UNPROVIDED) {
            update_mode = (SubLObject)sksi_cost_estimates.$kw1$REMOVE_SELECTIVE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if (sksi_cost_estimates.NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP()) {
                    SubLObject current;
                    final SubLObject datum = current = assertions_high.gaf_args(field_decoding_gaf);
                    SubLObject logical_schema = (SubLObject)sksi_cost_estimates.NIL;
                    SubLObject logical_field_indexical = (SubLObject)sksi_cost_estimates.NIL;
                    SubLObject physical_schema = (SubLObject)sksi_cost_estimates.NIL;
                    SubLObject decoding = (SubLObject)sksi_cost_estimates.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_cost_estimates.$list3);
                    logical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_cost_estimates.$list3);
                    logical_field_indexical = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_cost_estimates.$list3);
                    physical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_cost_estimates.$list3);
                    decoding = current.first();
                    current = current.rest();
                    if (sksi_cost_estimates.NIL == current) {
                        final SubLObject mt = assertions_high.assertion_mt(field_decoding_gaf);
                        final SubLObject sk_source = sksi_kb_accessors.schema_translation_mt_sk_source_in_any_mt(mt);
                        final SubLObject mt_var;
                        final SubLObject mapping_mt = mt_var = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
                        final SubLObject _prev_bind_0_$40 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            if (sksi_cost_estimates.NIL != sksi_kb_accessors.schema_representation_completeP(physical_schema) && sksi_cost_estimates.NIL != sksi_kb_accessors.schema_representation_completeP(logical_schema)) {
                                final SubLObject sks_list = sksi_kb_accessors.physical_schema_sk_sources(physical_schema);
                                final SubLObject logical_field = sksi_kb_accessors.logical_field_for_indexical(logical_field_indexical);
                                SubLObject cdolist_list_var = sks_list;
                                SubLObject sks = (SubLObject)sksi_cost_estimates.NIL;
                                sks = cdolist_list_var.first();
                                while (sksi_cost_estimates.NIL != cdolist_list_var) {
                                    update_cost_estimates_for_logical_fields(sks, physical_schema, logical_schema, (SubLObject)ConsesLow.list(logical_field), update_mode, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    sks = cdolist_list_var.first();
                                }
                            }
                        }
                        finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$40, thread);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_cost_estimates.$list3);
                    }
                }
                else {
                    final SubLObject _prev_bind_0_$41 = sksi_macros.$sksi_sql_connection_cache$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sksi_macros.$sksi_sql_statement_cache$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding(thread);
                    try {
                        sksi_macros.$sksi_sql_connection_cache$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQUALP), (SubLObject)sksi_cost_estimates.UNPROVIDED), thread);
                        sksi_macros.$sksi_sql_statement_cache$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQ), (SubLObject)sksi_cost_estimates.UNPROVIDED), thread);
                        sksi_macros.$sksi_sql_statement_pool_lock$.bind(Locks.make_lock(Strings.string(Symbols.gensym((SubLObject)sksi_cost_estimates.$str0$SKSI_SQL_statement_cache_))), thread);
                        SubLObject resourcing_caches_finalizedP = (SubLObject)sksi_cost_estimates.NIL;
                        try {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = assertions_high.gaf_args(field_decoding_gaf);
                            SubLObject logical_schema2 = (SubLObject)sksi_cost_estimates.NIL;
                            SubLObject logical_field_indexical2 = (SubLObject)sksi_cost_estimates.NIL;
                            SubLObject physical_schema2 = (SubLObject)sksi_cost_estimates.NIL;
                            SubLObject decoding2 = (SubLObject)sksi_cost_estimates.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_cost_estimates.$list3);
                            logical_schema2 = current2.first();
                            current2 = current2.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_cost_estimates.$list3);
                            logical_field_indexical2 = current2.first();
                            current2 = current2.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_cost_estimates.$list3);
                            physical_schema2 = current2.first();
                            current2 = current2.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_cost_estimates.$list3);
                            decoding2 = current2.first();
                            current2 = current2.rest();
                            if (sksi_cost_estimates.NIL == current2) {
                                final SubLObject mt2 = assertions_high.assertion_mt(field_decoding_gaf);
                                final SubLObject sk_source2 = sksi_kb_accessors.schema_translation_mt_sk_source_in_any_mt(mt2);
                                final SubLObject mt_var2;
                                final SubLObject mapping_mt2 = mt_var2 = sksi_kb_accessors.sk_source_mapping_mt(sk_source2);
                                final SubLObject _prev_bind_0_$42 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$43 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var2), thread);
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var2), thread);
                                    if (sksi_cost_estimates.NIL != sksi_kb_accessors.schema_representation_completeP(physical_schema2) && sksi_cost_estimates.NIL != sksi_kb_accessors.schema_representation_completeP(logical_schema2)) {
                                        final SubLObject sks_list2 = sksi_kb_accessors.physical_schema_sk_sources(physical_schema2);
                                        final SubLObject logical_field2 = sksi_kb_accessors.logical_field_for_indexical(logical_field_indexical2);
                                        SubLObject cdolist_list_var2 = sks_list2;
                                        SubLObject sks2 = (SubLObject)sksi_cost_estimates.NIL;
                                        sks2 = cdolist_list_var2.first();
                                        while (sksi_cost_estimates.NIL != cdolist_list_var2) {
                                            update_cost_estimates_for_logical_fields(sks2, physical_schema2, logical_schema2, (SubLObject)ConsesLow.list(logical_field2), update_mode, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            sks2 = cdolist_list_var2.first();
                                        }
                                    }
                                }
                                finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$43, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$42, thread);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)sksi_cost_estimates.$list3);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_cost_estimates.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                try {
                                    resourcing_caches_finalizedP = sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_cost_estimates.T, thread);
                                        final SubLObject _values_$46 = Values.getValuesAsVector();
                                        if (sksi_cost_estimates.NIL == resourcing_caches_finalizedP) {
                                            sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                        }
                                        Values.restoreValuesFromVector(_values_$46);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                                    }
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                            }
                        }
                    }
                    finally {
                        sksi_macros.$sksi_sql_statement_pool_lock$.rebind(_prev_bind_4, thread);
                        sksi_macros.$sksi_sql_statement_cache$.rebind(_prev_bind_3, thread);
                        sksi_macros.$sksi_sql_connection_cache$.rebind(_prev_bind_0_$41, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_cost_estimates.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 15041L)
    public static SubLObject update_cost_estimates_for_field_encoding(final SubLObject field_encoding_gaf, SubLObject update_mode) {
        if (update_mode == sksi_cost_estimates.UNPROVIDED) {
            update_mode = (SubLObject)sksi_cost_estimates.$kw1$REMOVE_SELECTIVE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if (sksi_cost_estimates.NIL != sksi_sks_interaction.within_sksi_sql_connection_resourcingP()) {
                    SubLObject current;
                    final SubLObject datum = current = assertions_high.gaf_args(field_encoding_gaf);
                    SubLObject physical_schema = (SubLObject)sksi_cost_estimates.NIL;
                    SubLObject physical_field_indexical = (SubLObject)sksi_cost_estimates.NIL;
                    SubLObject logical_schema = (SubLObject)sksi_cost_estimates.NIL;
                    SubLObject encoding = (SubLObject)sksi_cost_estimates.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_cost_estimates.$list4);
                    physical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_cost_estimates.$list4);
                    physical_field_indexical = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_cost_estimates.$list4);
                    logical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_cost_estimates.$list4);
                    encoding = current.first();
                    current = current.rest();
                    if (sksi_cost_estimates.NIL == current) {
                        final SubLObject mt = assertions_high.assertion_mt(field_encoding_gaf);
                        final SubLObject sk_source = sksi_kb_accessors.schema_translation_mt_sk_source_in_any_mt(mt);
                        final SubLObject mt_var;
                        final SubLObject mapping_mt = mt_var = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
                        final SubLObject _prev_bind_0_$48 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                            if (sksi_cost_estimates.NIL != sksi_kb_accessors.schema_representation_completeP(physical_schema) && sksi_cost_estimates.NIL != sksi_kb_accessors.schema_representation_completeP(logical_schema)) {
                                final SubLObject lf_list = sksi_field_translation_utilities.encoding_logical_fields(encoding);
                                SubLObject cdolist_list_var;
                                final SubLObject sks_list = cdolist_list_var = sksi_kb_accessors.physical_schema_sk_sources(physical_schema);
                                SubLObject sks = (SubLObject)sksi_cost_estimates.NIL;
                                sks = cdolist_list_var.first();
                                while (sksi_cost_estimates.NIL != cdolist_list_var) {
                                    update_cost_estimates_for_logical_fields(sks, physical_schema, logical_schema, lf_list, update_mode, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    sks = cdolist_list_var.first();
                                }
                            }
                        }
                        finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$48, thread);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_cost_estimates.$list4);
                    }
                }
                else {
                    final SubLObject _prev_bind_0_$49 = sksi_macros.$sksi_sql_connection_cache$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sksi_macros.$sksi_sql_statement_cache$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sksi_macros.$sksi_sql_statement_pool_lock$.currentBinding(thread);
                    try {
                        sksi_macros.$sksi_sql_connection_cache$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQUALP), (SubLObject)sksi_cost_estimates.UNPROVIDED), thread);
                        sksi_macros.$sksi_sql_statement_cache$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQ), (SubLObject)sksi_cost_estimates.UNPROVIDED), thread);
                        sksi_macros.$sksi_sql_statement_pool_lock$.bind(Locks.make_lock(Strings.string(Symbols.gensym((SubLObject)sksi_cost_estimates.$str0$SKSI_SQL_statement_cache_))), thread);
                        SubLObject resourcing_caches_finalizedP = (SubLObject)sksi_cost_estimates.NIL;
                        try {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = assertions_high.gaf_args(field_encoding_gaf);
                            SubLObject physical_schema2 = (SubLObject)sksi_cost_estimates.NIL;
                            SubLObject physical_field_indexical2 = (SubLObject)sksi_cost_estimates.NIL;
                            SubLObject logical_schema2 = (SubLObject)sksi_cost_estimates.NIL;
                            SubLObject encoding2 = (SubLObject)sksi_cost_estimates.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_cost_estimates.$list4);
                            physical_schema2 = current2.first();
                            current2 = current2.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_cost_estimates.$list4);
                            physical_field_indexical2 = current2.first();
                            current2 = current2.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_cost_estimates.$list4);
                            logical_schema2 = current2.first();
                            current2 = current2.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_cost_estimates.$list4);
                            encoding2 = current2.first();
                            current2 = current2.rest();
                            if (sksi_cost_estimates.NIL == current2) {
                                final SubLObject mt2 = assertions_high.assertion_mt(field_encoding_gaf);
                                final SubLObject sk_source2 = sksi_kb_accessors.schema_translation_mt_sk_source_in_any_mt(mt2);
                                final SubLObject mt_var2;
                                final SubLObject mapping_mt2 = mt_var2 = sksi_kb_accessors.sk_source_mapping_mt(sk_source2);
                                final SubLObject _prev_bind_0_$50 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$51 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var2), thread);
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var2), thread);
                                    if (sksi_cost_estimates.NIL != sksi_kb_accessors.schema_representation_completeP(physical_schema2) && sksi_cost_estimates.NIL != sksi_kb_accessors.schema_representation_completeP(logical_schema2)) {
                                        final SubLObject lf_list2 = sksi_field_translation_utilities.encoding_logical_fields(encoding2);
                                        SubLObject cdolist_list_var2;
                                        final SubLObject sks_list2 = cdolist_list_var2 = sksi_kb_accessors.physical_schema_sk_sources(physical_schema2);
                                        SubLObject sks2 = (SubLObject)sksi_cost_estimates.NIL;
                                        sks2 = cdolist_list_var2.first();
                                        while (sksi_cost_estimates.NIL != cdolist_list_var2) {
                                            update_cost_estimates_for_logical_fields(sks2, physical_schema2, logical_schema2, lf_list2, update_mode, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            sks2 = cdolist_list_var2.first();
                                        }
                                    }
                                }
                                finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$51, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$50, thread);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)sksi_cost_estimates.$list4);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_cost_estimates.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                try {
                                    resourcing_caches_finalizedP = sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_cost_estimates.T, thread);
                                        final SubLObject _values_$54 = Values.getValuesAsVector();
                                        if (sksi_cost_estimates.NIL == resourcing_caches_finalizedP) {
                                            sksi_sks_interaction.finalize_sql_connection_and_statement_cache();
                                        }
                                        Values.restoreValuesFromVector(_values_$54);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                                    }
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                            }
                        }
                    }
                    finally {
                        sksi_macros.$sksi_sql_statement_pool_lock$.rebind(_prev_bind_4, thread);
                        sksi_macros.$sksi_sql_statement_cache$.rebind(_prev_bind_3, thread);
                        sksi_macros.$sksi_sql_connection_cache$.rebind(_prev_bind_0_$49, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$53 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_cost_estimates.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 16460L)
    public static SubLObject update_cost_estimates_for_sks_int(final SubLObject ks, final SubLObject mapping_mt) {
        SubLObject cdolist_list_var;
        final SubLObject ps_pf_tuples_list = cdolist_list_var = physical_field_tuples_used_in_meaning_sentences_in_ks(ks);
        SubLObject ps_pf_tuples = (SubLObject)sksi_cost_estimates.NIL;
        ps_pf_tuples = cdolist_list_var.first();
        while (sksi_cost_estimates.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = ps_pf_tuples;
            SubLObject ps = (SubLObject)sksi_cost_estimates.NIL;
            SubLObject pf_tuples = (SubLObject)sksi_cost_estimates.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_cost_estimates.$list5);
            ps = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_cost_estimates.$list5);
            pf_tuples = current.first();
            current = current.rest();
            if (sksi_cost_estimates.NIL == current) {
                update_cost_estimates_for_ks_ps(ks, (SubLObject)ConsesLow.list(ps), pf_tuples, mapping_mt, (SubLObject)sksi_cost_estimates.$kw6$REMOVE_ALL);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_cost_estimates.$list5);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ps_pf_tuples = cdolist_list_var.first();
        }
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 17006L)
    public static SubLObject physical_field_tuples_used_in_meaning_sentences_in_ks(final SubLObject ks) {
        final SubLObject physical_schemata = sksi_kb_accessors.sk_source_physical_schemata(ks);
        SubLObject result = (SubLObject)sksi_cost_estimates.NIL;
        SubLObject cdolist_list_var = physical_schemata;
        SubLObject ps = (SubLObject)sksi_cost_estimates.NIL;
        ps = cdolist_list_var.first();
        while (sksi_cost_estimates.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$56;
            final SubLObject logical_schemata = cdolist_list_var_$56 = sksi_kb_accessors.physical_schema_logical_schemata(ps);
            SubLObject ls = (SubLObject)sksi_cost_estimates.NIL;
            ls = cdolist_list_var_$56.first();
            while (sksi_cost_estimates.NIL != cdolist_list_var_$56) {
                final SubLObject partial_result = physical_field_tuples_for_ps_ls(ps, ls, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(ps, partial_result), result);
                cdolist_list_var_$56 = cdolist_list_var_$56.rest();
                ls = cdolist_list_var_$56.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            ps = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(result, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 17460L)
    public static SubLObject any_lfi_appears_in_sentenceP(final SubLObject lfi_list, final SubLObject sentence) {
        SubLObject succeedP = (SubLObject)sksi_cost_estimates.NIL;
        if (sksi_cost_estimates.NIL == succeedP) {
            SubLObject csome_list_var = lfi_list;
            SubLObject lfi = (SubLObject)sksi_cost_estimates.NIL;
            lfi = csome_list_var.first();
            while (sksi_cost_estimates.NIL == succeedP && sksi_cost_estimates.NIL != csome_list_var) {
                if (sksi_cost_estimates.NIL != cycl_utilities.expression_find(lfi, sentence, (SubLObject)sksi_cost_estimates.T, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED)) {
                    succeedP = (SubLObject)sksi_cost_estimates.T;
                }
                csome_list_var = csome_list_var.rest();
                lfi = csome_list_var.first();
            }
        }
        return succeedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 17670L)
    public static SubLObject physical_field_tuples_for_ps_ls(final SubLObject ps, final SubLObject ls, SubLObject pred, SubLObject lf_list) {
        if (pred == sksi_cost_estimates.UNPROVIDED) {
            pred = (SubLObject)sksi_cost_estimates.NIL;
        }
        if (lf_list == sksi_cost_estimates.UNPROVIDED) {
            lf_list = (SubLObject)sksi_cost_estimates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_cost_estimates.NIL == sksi_kb_accessors.physical_schema_sk_sources(ps)) {
            return (SubLObject)sksi_cost_estimates.NIL;
        }
        final SubLObject lfi_list = sksi_kb_accessors.indexicals_for_logical_fields(lf_list);
        SubLObject result = (SubLObject)sksi_cost_estimates.NIL;
        final SubLObject meaning_sentences = sksi_meaning_sentence_utilities.logical_schema_meaning_sentences(ls, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
        final SubLObject logical_physical_field_mappings = sksi_infrastructure_utilities.logical_physical_field_mappings_given_logical_physical_schemata((SubLObject)ConsesLow.list(ls), (SubLObject)ConsesLow.list(ps));
        SubLObject cdolist_list_var = meaning_sentences;
        SubLObject sentence = (SubLObject)sksi_cost_estimates.NIL;
        sentence = cdolist_list_var.first();
        while (sksi_cost_estimates.NIL != cdolist_list_var) {
            if ((sksi_cost_estimates.NIL == pred || pred.equal(cycl_utilities.formula_operator(sentence))) && (sksi_cost_estimates.NIL == lfi_list || sksi_cost_estimates.NIL != any_lfi_appears_in_sentenceP(lfi_list, sentence))) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(physical_field_tuples_for_meaning_sentence(sentence, logical_physical_field_mappings, (SubLObject)ConsesLow.list(ps), (SubLObject)sksi_cost_estimates.NIL)), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        SubLObject cdolist_list_var2;
        final SubLObject conditional_meaning_sentence_gafs = cdolist_list_var2 = sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs(ls, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
        SubLObject gaf = (SubLObject)sksi_cost_estimates.NIL;
        gaf = cdolist_list_var2.first();
        while (sksi_cost_estimates.NIL != cdolist_list_var2) {
            final SubLObject antecedent_logical_schema_set = sksi_meaning_sentence_utilities.get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf(gaf);
            final SubLObject antecedent_sentence = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf(gaf);
            final SubLObject consequent_logical_schema_set = sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(gaf);
            final SubLObject consequent_sentence = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(gaf, (SubLObject)sksi_cost_estimates.UNPROVIDED);
            if ((sksi_cost_estimates.NIL == pred || pred.equal(cycl_utilities.formula_operator(consequent_sentence))) && (sksi_cost_estimates.NIL == lfi_list || sksi_cost_estimates.NIL != any_lfi_appears_in_sentenceP(lfi_list, consequent_sentence) || sksi_cost_estimates.NIL != any_lfi_appears_in_sentenceP(lfi_list, antecedent_sentence))) {
                final SubLObject consequent_physical_schema_set = sksi_kb_accessors.logical_schemata_physical_schemata(consequent_logical_schema_set);
                final SubLObject logical_physical_field_mappings2 = sksi_infrastructure_utilities.logical_physical_field_mappings_given_logical_physical_schemata(consequent_logical_schema_set, consequent_physical_schema_set);
                final SubLObject pf_tuples = physical_field_tuples_for_meaning_sentence(consequent_sentence, logical_physical_field_mappings2, consequent_physical_schema_set, antecedent_sentence);
                if (sksi_cost_estimates.NIL != pf_tuples) {
                    thread.resetMultipleValues();
                    final SubLObject from_expression = get_from_and_where_expression_for_antecedent_of_cms(consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, gaf);
                    final SubLObject where_expression = thread.secondMultipleValue();
                    final SubLObject eval_conditions = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (sksi_cost_estimates.NIL != from_expression && sksi_cost_estimates.NIL != where_expression) {
                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(pf_tuples, from_expression, (SubLObject)((where_expression == sksi_cost_estimates.T) ? sksi_cost_estimates.NIL : ConsesLow.list(where_expression)), eval_conditions), result);
                    }
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            gaf = cdolist_list_var2.first();
        }
        return list_utilities.fast_delete_duplicates(result, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 20374L)
    public static SubLObject get_from_and_where_expression_for_antecedent_of_cms(final SubLObject consequent_ps_list, final SubLObject consequent_logical_schema_set, final SubLObject antecedent_logical_schema_set, final SubLObject cms_gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject antecedent_physical_schemata = sksi_kb_accessors.logical_schemata_physical_schemata(antecedent_logical_schema_set);
        final SubLObject all_physical_schemata = conses_high.union(consequent_ps_list, antecedent_physical_schemata, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
        final SubLObject new_sk_source = sksi_kb_accessors.nearest_common_super_ks_for_ls_list(conses_high.union(consequent_logical_schema_set, antecedent_logical_schema_set, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED));
        final SubLObject new_content_mt = sksi_kb_accessors.sk_source_content_mt(new_sk_source);
        SubLObject from_expression = (SubLObject)sksi_cost_estimates.NIL;
        SubLObject where_expression = (SubLObject)sksi_cost_estimates.NIL;
        SubLObject eval_conditions = (SubLObject)sksi_cost_estimates.NIL;
        SubLObject ignore_errors_tag = (SubLObject)sksi_cost_estimates.NIL;
        try {
            thread.throwStack.push(sksi_cost_estimates.$kw7$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)sksi_cost_estimates.$sym8$IGNORE_ERRORS_HANDLER), thread);
                try {
                    from_expression = sksi_query_utilities.get_from_expression_from_antecedent_meaning_sentence(cms_gaf, new_content_mt, new_sk_source, all_physical_schemata, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                    thread.resetMultipleValues();
                    final SubLObject where_expression_$57 = sksi_query_utilities.get_where_expression_from_antecedent_meaning_sentence(cms_gaf, new_content_mt, new_sk_source, all_physical_schemata, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                    final SubLObject eval_conditions_$58 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    where_expression = where_expression_$57;
                    eval_conditions = eval_conditions_$58;
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sksi_cost_estimates.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)sksi_cost_estimates.$kw7$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(from_expression, where_expression, eval_conditions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 21402L)
    public static SubLObject physical_field_tuples_for_meaning_sentence(final SubLObject sentence, final SubLObject logical_physical_field_mappings, final SubLObject physical_schema_list, final SubLObject antecedent_sentence) {
        SubLObject result = (SubLObject)sksi_cost_estimates.NIL;
        final SubLObject rc_sentence = sksi_meaning_sentence_utilities.sksi_reconstruct_meaning_sentence(sentence);
        final SubLObject logical_field_indexical_termnums = sksi_removal_module_generation.sentence_termnums_containing_logical_field_indexicals(rc_sentence);
        SubLObject cdolist_list_var;
        final SubLObject boundedness_permutations = cdolist_list_var = sksi_removal_module_generation.compute_boundedness_permutations_for_logical_field_indexical_termnums(logical_field_indexical_termnums, (SubLObject)sksi_cost_estimates.$kw9$POS);
        SubLObject perm = (SubLObject)sksi_cost_estimates.NIL;
        perm = cdolist_list_var.first();
        while (sksi_cost_estimates.NIL != cdolist_list_var) {
            SubLObject pattern = el_utilities.copy_expression(sentence);
            SubLObject select_set = (SubLObject)sksi_cost_estimates.NIL;
            SubLObject where_set = (SubLObject)sksi_cost_estimates.NIL;
            SubLObject cdolist_list_var_$59 = perm;
            SubLObject argpos_list_boundedness_pair = (SubLObject)sksi_cost_estimates.NIL;
            argpos_list_boundedness_pair = cdolist_list_var_$59.first();
            while (sksi_cost_estimates.NIL != cdolist_list_var_$59) {
                SubLObject current;
                final SubLObject datum = current = argpos_list_boundedness_pair;
                SubLObject argpos_list = (SubLObject)sksi_cost_estimates.NIL;
                SubLObject boundedness = (SubLObject)sksi_cost_estimates.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_cost_estimates.$list10);
                argpos_list = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_cost_estimates.$list10);
                boundedness = current.first();
                current = current.rest();
                if (sksi_cost_estimates.NIL == current) {
                    SubLObject cdolist_list_var_$60 = argpos_list;
                    SubLObject argpos = (SubLObject)sksi_cost_estimates.NIL;
                    argpos = cdolist_list_var_$60.first();
                    while (sksi_cost_estimates.NIL != cdolist_list_var_$60) {
                        pattern = cycl_utilities.formula_arg_position_nsubst(boundedness, argpos, pattern);
                        final SubLObject lfi = cycl_utilities.formula_arg_position(rc_sentence, argpos, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                        final SubLObject lf = sksi_kb_accessors.logical_field_for_indexical(lfi);
                        final SubLObject pfs = list_utilities.fast_delete_duplicates(dictionary.dictionary_lookup_without_values(logical_physical_field_mappings, lf, (SubLObject)sksi_cost_estimates.UNPROVIDED), (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                        SubLObject actual_pfs = (SubLObject)sksi_cost_estimates.NIL;
                        SubLObject cdolist_list_var_$61 = pfs;
                        SubLObject pf = (SubLObject)sksi_cost_estimates.NIL;
                        pf = cdolist_list_var_$61.first();
                        while (sksi_cost_estimates.NIL != cdolist_list_var_$61) {
                            actual_pfs = (SubLObject)ConsesLow.cons(sksi_kb_accessors.pf_for_lfi(pf, lfi), actual_pfs);
                            cdolist_list_var_$61 = cdolist_list_var_$61.rest();
                            pf = cdolist_list_var_$61.first();
                        }
                        actual_pfs = Sequences.nreverse(actual_pfs);
                        if (boundedness == sksi_cost_estimates.$kw11$FULLY_BOUND) {
                            where_set = ConsesLow.append(actual_pfs, where_set);
                        }
                        else {
                            select_set = ConsesLow.append(actual_pfs, select_set);
                        }
                        cdolist_list_var_$60 = cdolist_list_var_$60.rest();
                        argpos = cdolist_list_var_$60.first();
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_cost_estimates.$list10);
                }
                cdolist_list_var_$59 = cdolist_list_var_$59.rest();
                argpos_list_boundedness_pair = cdolist_list_var_$59.first();
            }
            pattern = sksi_removal_module_generation.replace_pattern_parts(pattern, (SubLObject)sksi_cost_estimates.$kw9$POS);
            if (sksi_cost_estimates.NIL != select_set && sksi_cost_estimates.NIL != sksi_removal_module_generation.sksi_valid_removal_module_required_patternP(pattern, sentence, physical_schema_list, antecedent_sentence)) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(list_utilities.fast_delete_duplicates(select_set, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED), list_utilities.fast_delete_duplicates(where_set, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED)), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            perm = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(result, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 23337L)
    public static SubLObject update_cost_estimates_for_ks_ps(final SubLObject ks, final SubLObject ps_list, final SubLObject pf_tuples, final SubLObject mapping_mt, SubLObject update_mode) {
        if (update_mode == sksi_cost_estimates.UNPROVIDED) {
            update_mode = (SubLObject)sksi_cost_estimates.$kw1$REMOVE_SELECTIVE;
        }
        final SubLObject access_path = sksi_access_path.external_source_access_path(ks, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
        final SubLObject pcase_var = sksi_access_path.access_path_type(access_path);
        if (pcase_var.eql(sksi_cost_estimates.$const12$Database_Physical)) {
            return update_cost_estimates_for_db_ps(ks, access_path, ps_list, pf_tuples, mapping_mt, update_mode);
        }
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 23981L)
    public static SubLObject update_cost_estimates_for_db_ps(final SubLObject ks, final SubLObject access_path, final SubLObject ps_list, final SubLObject pf_tuples, final SubLObject mapping_mt, final SubLObject update_mode) {
        final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor(access_path);
        final SubLObject enumerable_schemaP = list_utilities.every_in_list((SubLObject)sksi_cost_estimates.$sym13$PHYSICAL_SCHEMA_ENUMERABLE_, ps_list, (SubLObject)sksi_cost_estimates.UNPROVIDED);
        SubLObject created_sampling_viewP = (SubLObject)sksi_cost_estimates.NIL;
        if (sksi_cost_estimates.NIL == enumerable_schemaP) {
            created_sampling_viewP = create_sampling_view(ks, access_path, sql_flavor);
        }
        if (update_mode == sksi_cost_estimates.$kw6$REMOVE_ALL) {
            remove_cost_estimates_for_ps_list(ps_list);
        }
        SubLObject cdolist_list_var = pf_tuples;
        SubLObject pf_tuple = (SubLObject)sksi_cost_estimates.NIL;
        pf_tuple = cdolist_list_var.first();
        while (sksi_cost_estimates.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pf_tuple;
            SubLObject select_where_sets = (SubLObject)sksi_cost_estimates.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_cost_estimates.$list14);
            select_where_sets = current.first();
            current = current.rest();
            final SubLObject from_expression = (SubLObject)(current.isCons() ? current.first() : sksi_cost_estimates.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_cost_estimates.$list14);
            current = current.rest();
            final SubLObject where_expression = (SubLObject)(current.isCons() ? current.first() : sksi_cost_estimates.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_cost_estimates.$list14);
            current = current.rest();
            final SubLObject eval_conditions = (SubLObject)(current.isCons() ? current.first() : sksi_cost_estimates.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_cost_estimates.$list14);
            current = current.rest();
            if (sksi_cost_estimates.NIL == current) {
                SubLObject cdolist_list_var_$62 = select_where_sets;
                SubLObject select_where_set = (SubLObject)sksi_cost_estimates.NIL;
                select_where_set = cdolist_list_var_$62.first();
                while (sksi_cost_estimates.NIL != cdolist_list_var_$62) {
                    SubLObject current_$64;
                    final SubLObject datum_$63 = current_$64 = select_where_set;
                    SubLObject select_set = (SubLObject)sksi_cost_estimates.NIL;
                    SubLObject where_set = (SubLObject)sksi_cost_estimates.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$64, datum_$63, (SubLObject)sksi_cost_estimates.$list15);
                    select_set = current_$64.first();
                    current_$64 = current_$64.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$64, datum_$63, (SubLObject)sksi_cost_estimates.$list15);
                    where_set = current_$64.first();
                    current_$64 = current_$64.rest();
                    if (sksi_cost_estimates.NIL == current_$64) {
                        if (update_mode == sksi_cost_estimates.$kw16$ONLY_REMOVE) {
                            remove_cost_estimate_for_select_where_sets(ks, ps_list, select_set, where_set, from_expression, where_expression, eval_conditions);
                        }
                        else {
                            final SubLObject cost = gather_cost_estimate_for_select_and_where_sets(access_path, select_set, where_set, from_expression, where_expression, eval_conditions, sql_flavor, created_sampling_viewP);
                            if (cost.isNumber()) {
                                if (update_mode == sksi_cost_estimates.$kw1$REMOVE_SELECTIVE) {
                                    remove_cost_estimate_for_select_where_sets(ks, ps_list, select_set, where_set, from_expression, where_expression, eval_conditions);
                                }
                                assert_cost_estimate_for_select_and_where_sets(ks, ps_list, mapping_mt, select_set, where_set, from_expression, where_expression, eval_conditions, cost);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$63, (SubLObject)sksi_cost_estimates.$list15);
                    }
                    cdolist_list_var_$62 = cdolist_list_var_$62.rest();
                    select_where_set = cdolist_list_var_$62.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_cost_estimates.$list14);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pf_tuple = cdolist_list_var.first();
        }
        if (sksi_cost_estimates.NIL != created_sampling_viewP) {
            remove_sampling_view(ks, access_path, sql_flavor);
        }
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 25955L)
    public static SubLObject gather_cost_estimate_for_select_and_where_sets(final SubLObject access_path, final SubLObject select_set, final SubLObject where_set, final SubLObject from_expression, final SubLObject where_expression, final SubLObject eval_conditions, final SubLObject sql_flavor, final SubLObject sampling_viewP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sql = determine_sql_for_gathering_cost_estimates(access_path, select_set, where_set, from_expression, where_expression, eval_conditions, sql_flavor, sampling_viewP);
        final SubLObject used_sampling_viewP = thread.secondMultipleValue();
        final SubLObject cost_estimate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cost_estimate.isNumber()) {
            return cost_estimate;
        }
        if (sql.isString()) {
            SubLObject result_set = (SubLObject)sksi_cost_estimates.NIL;
            SubLObject cost = (SubLObject)sksi_cost_estimates.NIL;
            SubLObject ignore_errors_tag = (SubLObject)sksi_cost_estimates.NIL;
            try {
                thread.throwStack.push(sksi_cost_estimates.$kw7$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)sksi_cost_estimates.$sym8$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        result_set = sksi_sks_interaction.sksi_execute_sql_query(sql, access_path);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)sksi_cost_estimates.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)sksi_cost_estimates.$kw7$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
            if (sksi_cost_estimates.NIL != sdbc.sql_result_set_p(result_set)) {
                sdbc.sqlrs_next(result_set);
                cost = sksi_result_set_iterators.sqlrs_current_row_as_list(result_set).first();
                if (cost.isString()) {
                    cost = string_utilities.string_to_number(cost);
                }
                if (sksi_cost_estimates.NIL != used_sampling_viewP) {
                    cost = Numbers.divide(Numbers.multiply(cost, (SubLObject)sksi_cost_estimates.$int19$100), sksi_cost_estimates.$cost_estimate_sampling_percentage$.getGlobalValue());
                }
                return cost;
            }
        }
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 27303L)
    public static SubLObject assert_cost_estimate_for_select_and_where_sets(final SubLObject ks, final SubLObject ps_list, final SubLObject mapping_mt, final SubLObject select_set, final SubLObject where_set, final SubLObject from_expression, final SubLObject where_expression, final SubLObject eval_conditions, final SubLObject cost) {
        final SubLObject el_select = cycl_utilities.hl_to_el(el_utilities.make_el_set(select_set, (SubLObject)sksi_cost_estimates.UNPROVIDED));
        final SubLObject el_where = cycl_utilities.hl_to_el(el_utilities.make_el_set(where_set, (SubLObject)sksi_cost_estimates.UNPROVIDED));
        if (sksi_cost_estimates.NIL != where_expression) {
            final SubLObject cycl_for_where_expression = sksi_csql_utilities.csql_to_el(where_expression, ks, from_expression);
            if (sksi_cost_estimates.NIL != sksi_infrastructure_utilities.sksi_true_cycl_expression_p(cycl_for_where_expression)) {
                SubLObject cdolist_list_var = ps_list;
                SubLObject ps = (SubLObject)sksi_cost_estimates.NIL;
                ps = cdolist_list_var.first();
                while (sksi_cost_estimates.NIL != cdolist_list_var) {
                    final SubLObject sentence = el_utilities.make_el_formula(sksi_cost_estimates.$const20$resultSetCardinalityWithConstrain, (SubLObject)ConsesLow.list(ps, el_select, el_where, cycl_for_where_expression, cost), (SubLObject)sksi_cost_estimates.UNPROVIDED);
                    sksi_kb_accessors.sksi_assert(sentence, mapping_mt, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    ps = cdolist_list_var.first();
                }
            }
        }
        else {
            SubLObject cdolist_list_var2 = ps_list;
            SubLObject ps2 = (SubLObject)sksi_cost_estimates.NIL;
            ps2 = cdolist_list_var2.first();
            while (sksi_cost_estimates.NIL != cdolist_list_var2) {
                final SubLObject sentence2 = el_utilities.make_el_formula(sksi_cost_estimates.$const21$resultSetCardinality, (SubLObject)ConsesLow.list(ps2, el_select, el_where, cost), (SubLObject)sksi_cost_estimates.UNPROVIDED);
                sksi_kb_accessors.sksi_assert(sentence2, mapping_mt, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                cdolist_list_var2 = cdolist_list_var2.rest();
                ps2 = cdolist_list_var2.first();
            }
        }
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 28209L)
    public static SubLObject remove_cost_estimates_for_ps_list(final SubLObject ps_list) {
        SubLObject cdolist_list_var = ps_list;
        SubLObject ps = (SubLObject)sksi_cost_estimates.NIL;
        ps = cdolist_list_var.first();
        while (sksi_cost_estimates.NIL != cdolist_list_var) {
            remove_cost_estimates_for_ps(ps);
            cdolist_list_var = cdolist_list_var.rest();
            ps = cdolist_list_var.first();
        }
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 28401L)
    public static SubLObject remove_cost_estimates_for_ps(final SubLObject ps) {
        final SubLObject rs_cardinality_gafs = sksi_kb_accessors.physical_schema_result_set_cardinality_gafs(ps);
        final SubLObject rs_cardinality_wXconstraints_gafs = sksi_kb_accessors.physical_schema_result_set_cardinality_wXconstraints_gafs(ps);
        SubLObject cdolist_list_var;
        final SubLObject all_gafs = cdolist_list_var = ConsesLow.append(rs_cardinality_gafs, rs_cardinality_wXconstraints_gafs);
        SubLObject gaf = (SubLObject)sksi_cost_estimates.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_cost_estimates.NIL != cdolist_list_var) {
            if (sksi_cost_estimates.NIL != assertions_high.asserted_assertionP(gaf) && sksi_cost_estimates.NIL != assertions_high.gaf_assertionP(gaf)) {
                sksi_kb_accessors.sksi_unassert(assertions_high.gaf_formula(gaf), assertions_high.assertion_mt(gaf));
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return Sequences.length(all_gafs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 28976L)
    public static SubLObject remove_cost_estimate_for_select_where_sets(final SubLObject ks, final SubLObject ps_list, final SubLObject select_set, final SubLObject where_set, final SubLObject from_expression, final SubLObject where_expression, final SubLObject eval_conditions) {
        if (sksi_cost_estimates.NIL != where_expression) {
            return remove_result_set_cardinality_wXconstraints_gaf_for_select_where_sets(ks, ps_list, select_set, where_set, from_expression, where_expression, eval_conditions);
        }
        return remove_result_set_cardinality_gaf_for_select_where_sets(ps_list, select_set, where_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 29413L)
    public static SubLObject remove_result_set_cardinality_gaf_for_select_where_sets(final SubLObject ps_list, final SubLObject select_set, final SubLObject where_set) {
        SubLObject foundP = (SubLObject)sksi_cost_estimates.NIL;
        SubLObject cdolist_list_var = ps_list;
        SubLObject ps = (SubLObject)sksi_cost_estimates.NIL;
        ps = cdolist_list_var.first();
        while (sksi_cost_estimates.NIL != cdolist_list_var) {
            final SubLObject pred_var = sksi_cost_estimates.$const21$resultSetCardinality;
            if (sksi_cost_estimates.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(ps, (SubLObject)sksi_cost_estimates.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(ps, (SubLObject)sksi_cost_estimates.ONE_INTEGER, pred_var);
                SubLObject done_var = foundP;
                final SubLObject token_var = (SubLObject)sksi_cost_estimates.NIL;
                while (sksi_cost_estimates.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (sksi_cost_estimates.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)sksi_cost_estimates.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_cost_estimates.$kw22$GAF, (SubLObject)sksi_cost_estimates.$kw23$TRUE, (SubLObject)sksi_cost_estimates.NIL);
                            SubLObject done_var_$65 = foundP;
                            final SubLObject token_var_$66 = (SubLObject)sksi_cost_estimates.NIL;
                            while (sksi_cost_estimates.NIL == done_var_$65) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$66);
                                final SubLObject valid_$67 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$66.eql(gaf));
                                if (sksi_cost_estimates.NIL != valid_$67 && sksi_cost_estimates.NIL != list_utilities.sets_equalP(select_set, el_utilities.el_extensional_set_elements(assertions_high.gaf_arg2(gaf)), (SubLObject)sksi_cost_estimates.UNPROVIDED) && sksi_cost_estimates.NIL != list_utilities.sets_equalP(where_set, el_utilities.el_extensional_set_elements(assertions_high.gaf_arg3(gaf)), (SubLObject)sksi_cost_estimates.UNPROVIDED)) {
                                    sksi_kb_accessors.sksi_unassert(assertions_high.gaf_formula(gaf), assertions_high.assertion_mt(gaf));
                                    foundP = (SubLObject)sksi_cost_estimates.T;
                                }
                                done_var_$65 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_cost_estimates.NIL == valid_$67 || sksi_cost_estimates.NIL != foundP);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_cost_estimates.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (sksi_cost_estimates.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_cost_estimates.NIL == valid || sksi_cost_estimates.NIL != foundP);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            ps = cdolist_list_var.first();
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 29924L)
    public static SubLObject remove_result_set_cardinality_wXconstraints_gaf_for_select_where_sets(final SubLObject ks, final SubLObject ps_list, final SubLObject select_set, final SubLObject where_set, final SubLObject from_expression, final SubLObject where_expression, final SubLObject eval_conditions) {
        final SubLObject cycl_for_where_expression = sksi_csql_utilities.csql_to_cycl(where_expression, ks, from_expression);
        SubLObject foundP = (SubLObject)sksi_cost_estimates.NIL;
        SubLObject cdolist_list_var = ps_list;
        SubLObject ps = (SubLObject)sksi_cost_estimates.NIL;
        ps = cdolist_list_var.first();
        while (sksi_cost_estimates.NIL != cdolist_list_var) {
            final SubLObject pred_var = sksi_cost_estimates.$const20$resultSetCardinalityWithConstrain;
            if (sksi_cost_estimates.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(ps, (SubLObject)sksi_cost_estimates.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(ps, (SubLObject)sksi_cost_estimates.ONE_INTEGER, pred_var);
                SubLObject done_var = foundP;
                final SubLObject token_var = (SubLObject)sksi_cost_estimates.NIL;
                while (sksi_cost_estimates.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (sksi_cost_estimates.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)sksi_cost_estimates.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_cost_estimates.$kw22$GAF, (SubLObject)sksi_cost_estimates.$kw23$TRUE, (SubLObject)sksi_cost_estimates.NIL);
                            SubLObject done_var_$68 = foundP;
                            final SubLObject token_var_$69 = (SubLObject)sksi_cost_estimates.NIL;
                            while (sksi_cost_estimates.NIL == done_var_$68) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$69);
                                final SubLObject valid_$70 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$69.eql(gaf));
                                if (sksi_cost_estimates.NIL != valid_$70 && sksi_cost_estimates.NIL != list_utilities.sets_equalP(select_set, el_utilities.el_extensional_set_elements(assertions_high.gaf_arg2(gaf)), (SubLObject)sksi_cost_estimates.UNPROVIDED) && sksi_cost_estimates.NIL != list_utilities.sets_equalP(where_set, el_utilities.el_extensional_set_elements(assertions_high.gaf_arg3(gaf)), (SubLObject)sksi_cost_estimates.UNPROVIDED) && sksi_cost_estimates.NIL != czer_utilities.equals_elP(cycl_for_where_expression, assertions_high.gaf_arg4(gaf), (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED)) {
                                    sksi_kb_accessors.sksi_unassert(assertions_high.gaf_formula(gaf), assertions_high.assertion_mt(gaf));
                                    foundP = (SubLObject)sksi_cost_estimates.T;
                                }
                                done_var_$68 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_cost_estimates.NIL == valid_$70 || sksi_cost_estimates.NIL != foundP);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_cost_estimates.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (sksi_cost_estimates.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_cost_estimates.NIL == valid || sksi_cost_estimates.NIL != foundP);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            ps = cdolist_list_var.first();
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 30780L)
    public static SubLObject sksi_determine_csql_for_gathering_cost_estimates(final SubLObject access_path, final SubLObject select_set, final SubLObject where_set, final SubLObject sql_flavor) {
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 31008L)
    public static SubLObject determine_sql_for_gathering_cost_estimates(final SubLObject access_path, final SubLObject select_set, final SubLObject where_set, final SubLObject from_expression, final SubLObject where_expression, final SubLObject eval_conditions, final SubLObject sql_flavor, final SubLObject sampling_viewP) {
        if (sql_flavor.eql(sksi_cost_estimates.$const24$PostgreSQL)) {
            return determine_sql_for_gathering_cost_estimates_via_subquery(access_path, select_set, where_set, from_expression, where_expression, eval_conditions, sampling_viewP);
        }
        if (sql_flavor.eql(sksi_cost_estimates.$const25$MySQL_TheProgram)) {
            return determine_sql_for_gathering_cost_estimates_via_temporary_table(access_path, select_set, where_set, from_expression, where_expression, eval_conditions, sampling_viewP);
        }
        if (sql_flavor.eql(sksi_cost_estimates.$const26$OracleDatabaseServer_TheProgram)) {
            return determine_sql_for_gathering_cost_estimates_via_subquery(access_path, select_set, where_set, from_expression, where_expression, eval_conditions, sampling_viewP);
        }
        Errors.cerror((SubLObject)sksi_cost_estimates.$str27$Continue_without_this_knowledge_s, (SubLObject)sksi_cost_estimates.$str28$Cannot_gather_the_cost_estimates_, sksi_access_path.access_path_sks(access_path), sql_flavor);
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 32509L)
    public static SubLObject determine_sql_for_gathering_cost_estimates_via_subquery(final SubLObject access_path, final SubLObject select_set, final SubLObject where_set, final SubLObject from_expression, final SubLObject where_expression, final SubLObject eval_conditions, final SubLObject sampling_viewP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor(access_path);
        SubLObject sql_for_where_fields = (SubLObject)sksi_cost_estimates.NIL;
        thread.resetMultipleValues();
        final SubLObject sql_for_select_fields = make_sql_for_select_set(select_set, eval_conditions, sql_flavor);
        SubLObject table_list = thread.secondMultipleValue();
        final SubLObject estimate_cost_at_1P = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (sksi_cost_estimates.NIL != estimate_cost_at_1P) {
            return Values.values((SubLObject)sksi_cost_estimates.NIL, (SubLObject)sksi_cost_estimates.NIL, (SubLObject)sksi_cost_estimates.ONE_INTEGER);
        }
        thread.resetMultipleValues();
        final SubLObject sql_for_where_fields_$71 = make_sql_for_where_set(where_set, eval_conditions, sql_flavor, table_list);
        final SubLObject table_list_$72 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sql_for_where_fields = sql_for_where_fields_$71;
        table_list = table_list_$72;
        final SubLObject sql_for_where_expression = (SubLObject)((sksi_cost_estimates.NIL != where_expression) ? sksi_csql_interpretation.make_sql_for_where_clause_int(where_expression, sql_flavor, (SubLObject)sksi_cost_estimates.UNPROVIDED) : sksi_cost_estimates.NIL);
        final SubLObject use_sampling_viewP = use_cost_estimate_sampling_viewP(sampling_viewP, select_set, where_set);
        final SubLObject sql_for_table = make_sql_for_table(sksi_access_path.access_path_sks(access_path), table_list, from_expression, sql_flavor, use_sampling_viewP);
        SubLObject sql = (SubLObject)sksi_cost_estimates.NIL;
        if (sksi_cost_estimates.NIL != list_utilities.every_in_list((SubLObject)sksi_cost_estimates.$sym29$STRINGP, (SubLObject)ConsesLow.list(sql_for_select_fields, sql_for_where_fields, sql_for_table), (SubLObject)sksi_cost_estimates.UNPROVIDED)) {
            sql = Sequences.cconcatenate((SubLObject)sksi_cost_estimates.$str30$select_avg_sksi_cost_est_count__f, new SubLObject[] { sql_for_select_fields, sksi_cost_estimates.$str31$__, (sksi_cost_estimates.NIL != kb_utilities.kbeq(sql_flavor, sksi_cost_estimates.$const26$OracleDatabaseServer_TheProgram)) ? sksi_cost_estimates.$str32$count_ : sksi_cost_estimates.$str33$, sksi_cost_estimates.$str34$from_, sql_for_table, sql_for_where_expression.isString() ? Sequences.cconcatenate((SubLObject)sksi_cost_estimates.$str35$_where_, sql_for_where_expression) : sksi_cost_estimates.$str33$, sksi_cost_estimates.$str36$_group_by_, sql_for_where_fields, sksi_cost_estimates.$str31$__, (sksi_cost_estimates.NIL != kb_utilities.kbeq(sql_flavor, sksi_cost_estimates.$const24$PostgreSQL)) ? sksi_cost_estimates.$str37$as : ((sksi_cost_estimates.NIL != kb_utilities.kbeq(sql_flavor, sksi_cost_estimates.$const26$OracleDatabaseServer_TheProgram)) ? sksi_cost_estimates.$str33$ : sksi_cost_estimates.NIL), sksi_cost_estimates.$str38$_sksi_cost_est });
        }
        else if (sksi_cost_estimates.NIL != list_utilities.every_in_list((SubLObject)sksi_cost_estimates.$sym29$STRINGP, (SubLObject)ConsesLow.list(sql_for_select_fields, sql_for_table), (SubLObject)sksi_cost_estimates.UNPROVIDED)) {
            sql = Sequences.cconcatenate((SubLObject)sksi_cost_estimates.$str30$select_avg_sksi_cost_est_count__f, new SubLObject[] { sql_for_select_fields, sksi_cost_estimates.$str31$__, (sksi_cost_estimates.NIL != kb_utilities.kbeq(sql_flavor, sksi_cost_estimates.$const26$OracleDatabaseServer_TheProgram)) ? sksi_cost_estimates.$str32$count_ : sksi_cost_estimates.$str33$, sksi_cost_estimates.$str34$from_, sql_for_table, sql_for_where_expression.isString() ? Sequences.cconcatenate((SubLObject)sksi_cost_estimates.$str35$_where_, sql_for_where_expression) : sksi_cost_estimates.$str33$, sksi_cost_estimates.$str31$__, (sksi_cost_estimates.NIL != kb_utilities.kbeq(sql_flavor, sksi_cost_estimates.$const24$PostgreSQL)) ? sksi_cost_estimates.$str37$as : ((sksi_cost_estimates.NIL != kb_utilities.kbeq(sql_flavor, sksi_cost_estimates.$const26$OracleDatabaseServer_TheProgram)) ? sksi_cost_estimates.$str33$ : sksi_cost_estimates.NIL), sksi_cost_estimates.$str38$_sksi_cost_est });
        }
        return Values.values(sql, use_sampling_viewP, (SubLObject)sksi_cost_estimates.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 35155L)
    public static SubLObject determine_sql_for_gathering_cost_estimates_via_temporary_table(final SubLObject access_path, final SubLObject select_set, final SubLObject where_set, final SubLObject from_expression, final SubLObject where_expression, final SubLObject eval_conditions, final SubLObject sampling_viewP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sql_flavor = sksi_access_path.access_path_sql_flavor(access_path);
        SubLObject sql_for_where_fields = (SubLObject)sksi_cost_estimates.NIL;
        thread.resetMultipleValues();
        final SubLObject sql_for_select_fields = make_sql_for_select_set(select_set, eval_conditions, sql_flavor);
        SubLObject table_list = thread.secondMultipleValue();
        final SubLObject estimate_cost_at_1P = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (sksi_cost_estimates.NIL != estimate_cost_at_1P) {
            return Values.values((SubLObject)sksi_cost_estimates.NIL, (SubLObject)sksi_cost_estimates.NIL, (SubLObject)sksi_cost_estimates.ONE_INTEGER);
        }
        thread.resetMultipleValues();
        final SubLObject sql_for_where_fields_$73 = make_sql_for_where_set(where_set, eval_conditions, sql_flavor, table_list);
        final SubLObject table_list_$74 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sql_for_where_fields = sql_for_where_fields_$73;
        table_list = table_list_$74;
        final SubLObject sql_for_where_expression = (SubLObject)((sksi_cost_estimates.NIL != where_expression) ? sksi_csql_interpretation.make_sql_for_where_clause_int(where_expression, sql_flavor, (SubLObject)sksi_cost_estimates.UNPROVIDED) : sksi_cost_estimates.NIL);
        final SubLObject use_sampling_viewP = use_cost_estimate_sampling_viewP(sampling_viewP, select_set, where_set);
        final SubLObject sql_for_table = make_sql_for_table(sksi_access_path.access_path_sks(access_path), table_list, from_expression, sql_flavor, use_sampling_viewP);
        final SubLObject drop_table_sql = (SubLObject)sksi_cost_estimates.$str39$drop_table_if_exists_sksi_cost_es;
        SubLObject create_table_sql = (SubLObject)sksi_cost_estimates.$str40$create_temporary_table_sksi_cost_;
        SubLObject select_sql = (SubLObject)sksi_cost_estimates.NIL;
        if (sksi_cost_estimates.NIL != list_utilities.every_in_list((SubLObject)sksi_cost_estimates.$sym29$STRINGP, (SubLObject)ConsesLow.list(sql_for_select_fields, sql_for_where_fields, sql_for_table), (SubLObject)sksi_cost_estimates.UNPROVIDED)) {
            select_sql = Sequences.cconcatenate((SubLObject)sksi_cost_estimates.$str41$select_count_distinct_, new SubLObject[] { sql_for_select_fields, sksi_cost_estimates.$str42$__as_cost_est_count_from_, sql_for_table, sql_for_where_expression.isString() ? Sequences.cconcatenate((SubLObject)sksi_cost_estimates.$str35$_where_, sql_for_where_expression) : sksi_cost_estimates.$str33$, sksi_cost_estimates.$str36$_group_by_, sql_for_where_fields });
        }
        else if (sksi_cost_estimates.NIL != list_utilities.every_in_list((SubLObject)sksi_cost_estimates.$sym29$STRINGP, (SubLObject)ConsesLow.list(sql_for_select_fields, sql_for_table), (SubLObject)sksi_cost_estimates.UNPROVIDED)) {
            select_sql = Sequences.cconcatenate((SubLObject)sksi_cost_estimates.$str41$select_count_distinct_, new SubLObject[] { sql_for_select_fields, sksi_cost_estimates.$str42$__as_cost_est_count_from_, sql_for_table, sql_for_where_expression.isString() ? Sequences.cconcatenate((SubLObject)sksi_cost_estimates.$str35$_where_, sql_for_where_expression) : sksi_cost_estimates.$str33$ });
        }
        create_table_sql = Sequences.cconcatenate(create_table_sql, select_sql);
        sksi_sks_interaction.sksi_execute_sql_update(drop_table_sql, access_path);
        if (sksi_sks_interaction.sksi_execute_sql_update(create_table_sql, access_path).isInteger()) {
            return Values.values((SubLObject)sksi_cost_estimates.$str43$select_avg_cost_est_count__from_s, use_sampling_viewP, (SubLObject)sksi_cost_estimates.NIL);
        }
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 37877L)
    public static SubLObject get_sk_source_row_count(final SubLObject ks, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject row_count = sksi_kb_accessors.sk_source_row_count(ks);
        if (!row_count.isNumber()) {
            final SubLObject table_name = sksi_kb_accessors.sk_source_name(ks);
            final SubLObject sql = Sequences.cconcatenate((SubLObject)sksi_cost_estimates.$str44$select_count____from_, table_name);
            SubLObject result_set = (SubLObject)sksi_cost_estimates.NIL;
            SubLObject ignore_errors_tag = (SubLObject)sksi_cost_estimates.NIL;
            try {
                thread.throwStack.push(sksi_cost_estimates.$kw7$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)sksi_cost_estimates.$sym8$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        result_set = sksi_sks_interaction.sksi_execute_sql_query(sql, access_path);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)sksi_cost_estimates.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)sksi_cost_estimates.$kw7$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
            if (sksi_cost_estimates.NIL != sdbc.sql_result_set_p(result_set)) {
                sdbc.sqlrs_next(result_set);
                row_count = sksi_result_set_iterators.sqlrs_current_row_as_list(result_set).first();
                if (row_count.isString()) {
                    row_count = string_utilities.string_to_number(row_count);
                }
            }
        }
        return row_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 38611L)
    public static SubLObject create_sampling_view(final SubLObject ks, final SubLObject access_path, final SubLObject sql_flavor) {
        final SubLObject row_count = get_sk_source_row_count(ks, access_path);
        if (row_count.isInteger()) {
            SubLObject sql = (SubLObject)sksi_cost_estimates.NIL;
            if (sql_flavor.eql(sksi_cost_estimates.$const26$OracleDatabaseServer_TheProgram)) {
                sql = Sequences.cconcatenate((SubLObject)sksi_cost_estimates.$str45$create_view_, new SubLObject[] { sksi_cost_estimates.$cost_estimate_sampling_view_name$.getGlobalValue(), sksi_cost_estimates.$str46$_as_select___from_, sksi_kb_accessors.sk_source_name(sksi_access_path.access_path_sks(access_path)), sksi_cost_estimates.$str47$_sample_, string_utilities.object_to_string(sksi_cost_estimates.$cost_estimate_sampling_percentage$.getGlobalValue()), sksi_cost_estimates.$str48$_ });
            }
            else if (sql_flavor.eql(sksi_cost_estimates.$const24$PostgreSQL) || sql_flavor.eql(sksi_cost_estimates.$const25$MySQL_TheProgram)) {
                sql = Sequences.cconcatenate((SubLObject)sksi_cost_estimates.$str49$create_or_replace_view_, new SubLObject[] { sksi_cost_estimates.$cost_estimate_sampling_view_name$.getGlobalValue(), sksi_cost_estimates.$str46$_as_select___from_, sksi_kb_accessors.sk_source_name(sksi_access_path.access_path_sks(access_path)), sksi_cost_estimates.$str50$_order_by_, (sksi_cost_estimates.NIL != kb_utilities.kbeq(sql_flavor, sksi_cost_estimates.$const24$PostgreSQL)) ? sksi_cost_estimates.$str51$random__ : ((sksi_cost_estimates.NIL != kb_utilities.kbeq(sql_flavor, sksi_cost_estimates.$const25$MySQL_TheProgram)) ? sksi_cost_estimates.$str52$rand__ : sksi_cost_estimates.NIL), sksi_cost_estimates.$str53$_limit_, string_utilities.object_to_string(Numbers.round(Numbers.multiply(Numbers.divide(row_count, (SubLObject)sksi_cost_estimates.$int19$100), sksi_cost_estimates.$cost_estimate_sampling_percentage$.getGlobalValue()), (SubLObject)sksi_cost_estimates.UNPROVIDED)) });
            }
            if (sksi_sks_interaction.sksi_execute_sql_update(sql, access_path).isInteger()) {
                return (SubLObject)sksi_cost_estimates.T;
            }
        }
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 39631L)
    public static SubLObject remove_sampling_view(final SubLObject ks, final SubLObject access_path, final SubLObject sql_flavor) {
        final SubLObject sql = Sequences.cconcatenate((SubLObject)sksi_cost_estimates.$str54$drop_view_, sksi_cost_estimates.$cost_estimate_sampling_view_name$.getGlobalValue());
        return sksi_sks_interaction.sksi_execute_sql_update(sql, access_path);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 39858L)
    public static SubLObject use_cost_estimate_sampling_viewP(final SubLObject sampling_view_existsP, final SubLObject select_set, final SubLObject where_set) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_cost_estimates.NIL != sampling_view_existsP && (sksi_cost_estimates.NIL != Sequences.find_if((SubLObject)sksi_cost_estimates.$sym55$PF_ALIAS_FN_NAUT_P, select_set, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED) || sksi_cost_estimates.NIL != Sequences.find_if((SubLObject)sksi_cost_estimates.$sym55$PF_ALIAS_FN_NAUT_P, where_set, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 40161L)
    public static SubLObject make_sql_for_select_set(final SubLObject select_set, final SubLObject eval_conditions, final SubLObject sql_flavor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_cost_estimates.NIL != list_utilities.singletonP(select_set)) {
            thread.resetMultipleValues();
            final SubLObject sql = make_sql_for_select_set_field(select_set.first(), eval_conditions, sql_flavor, (SubLObject)sksi_cost_estimates.NIL);
            final SubLObject table_list = thread.secondMultipleValue();
            final SubLObject any_non_eval_select_fieldP = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return Values.values(sql, table_list, (SubLObject)SubLObjectFactory.makeBoolean(sksi_cost_estimates.NIL == any_non_eval_select_fieldP));
        }
        SubLObject sql = (SubLObject)sksi_cost_estimates.NIL;
        SubLObject table_list = (SubLObject)sksi_cost_estimates.NIL;
        SubLObject any_non_eval_select_fieldP = (SubLObject)sksi_cost_estimates.NIL;
        SubLObject any_eval_select_fieldP = (SubLObject)sksi_cost_estimates.NIL;
        SubLObject estimate_cost_at_1P = (SubLObject)sksi_cost_estimates.NIL;
        if (sql_flavor.eql(sksi_cost_estimates.$const24$PostgreSQL) || sql_flavor.eql(sksi_cost_estimates.$const26$OracleDatabaseServer_TheProgram)) {
            thread.resetMultipleValues();
            final SubLObject sql_$75 = make_sql_for_select_set_field(select_set.first(), eval_conditions, sql_flavor, table_list);
            final SubLObject table_list_$76 = thread.secondMultipleValue();
            final SubLObject any_non_eval_select_fieldP_$77 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            sql = sql_$75;
            table_list = table_list_$76;
            any_non_eval_select_fieldP = any_non_eval_select_fieldP_$77;
        }
        else if (sql_flavor.eql(sksi_cost_estimates.$const25$MySQL_TheProgram)) {
            thread.resetMultipleValues();
            final SubLObject sql_$76 = Sequences.cconcatenate((SubLObject)sksi_cost_estimates.$str56$concat_ws______, make_sql_for_select_set_field(select_set.first(), eval_conditions, sql_flavor, table_list));
            final SubLObject table_list_$77 = thread.secondMultipleValue();
            final SubLObject any_non_eval_select_fieldP_$78 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            sql = sql_$76;
            table_list = table_list_$77;
            any_non_eval_select_fieldP = any_non_eval_select_fieldP_$78;
        }
        any_eval_select_fieldP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_cost_estimates.NIL == any_non_eval_select_fieldP);
        SubLObject cdolist_list_var = select_set.rest();
        SubLObject pf = (SubLObject)sksi_cost_estimates.NIL;
        pf = cdolist_list_var.first();
        while (sksi_cost_estimates.NIL != cdolist_list_var) {
            SubLObject pf_sql = (SubLObject)sksi_cost_estimates.NIL;
            SubLObject non_eval_pfP = (SubLObject)sksi_cost_estimates.NIL;
            if (sql_flavor.eql(sksi_cost_estimates.$const24$PostgreSQL) || sql_flavor.eql(sksi_cost_estimates.$const26$OracleDatabaseServer_TheProgram)) {
                thread.resetMultipleValues();
                final SubLObject pf_sql_$81 = make_sql_for_select_set_field(pf, eval_conditions, sql_flavor, table_list);
                final SubLObject table_list_$78 = thread.secondMultipleValue();
                final SubLObject non_eval_pfP_$83 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                pf_sql = pf_sql_$81;
                table_list = table_list_$78;
                non_eval_pfP = non_eval_pfP_$83;
                sql = Sequences.cconcatenate(sql, new SubLObject[] { sksi_cost_estimates.$str57$___________, pf_sql });
            }
            else if (sql_flavor.eql(sksi_cost_estimates.$const25$MySQL_TheProgram)) {
                thread.resetMultipleValues();
                final SubLObject pf_sql_$82 = make_sql_for_select_set_field(pf, eval_conditions, sql_flavor, table_list);
                final SubLObject table_list_$79 = thread.secondMultipleValue();
                final SubLObject non_eval_pfP_$84 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                pf_sql = pf_sql_$82;
                table_list = table_list_$79;
                non_eval_pfP = non_eval_pfP_$84;
                sql = Sequences.cconcatenate(sql, new SubLObject[] { sksi_cost_estimates.$str58$__, pf_sql });
            }
            if (sksi_cost_estimates.NIL == any_non_eval_select_fieldP) {
                any_non_eval_select_fieldP = non_eval_pfP;
            }
            if (sksi_cost_estimates.NIL == any_eval_select_fieldP) {
                any_eval_select_fieldP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_cost_estimates.NIL == non_eval_pfP);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pf = cdolist_list_var.first();
        }
        if (sksi_cost_estimates.NIL != subl_promotions.memberP(sql_flavor, (SubLObject)sksi_cost_estimates.$list59, Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQ), (SubLObject)sksi_cost_estimates.UNPROVIDED)) {
            sql = Sequences.cconcatenate(sql, (SubLObject)sksi_cost_estimates.$str48$_);
        }
        estimate_cost_at_1P = (SubLObject)SubLObjectFactory.makeBoolean(sksi_cost_estimates.NIL == any_non_eval_select_fieldP && sksi_cost_estimates.NIL != any_eval_select_fieldP);
        return Values.values(sql, table_list, estimate_cost_at_1P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 42579L)
    public static SubLObject make_sql_for_select_set_field(final SubLObject pf, final SubLObject eval_conditions, final SubLObject sql_flavor, final SubLObject table_list) {
        final SubLObject lf = sksi_kb_accessors.sksi_get_mapped_logical_fields_for_physical_field(pf).first();
        final SubLObject lfi = sksi_kb_accessors.lfi_for_lf(lf);
        final SubLObject eval_cond_for_lfi = conses_high.second(Sequences.find(lfi, eval_conditions, Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQ), Symbols.symbol_function((SubLObject)sksi_cost_estimates.$sym60$FIRST), (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED));
        if (sksi_cost_estimates.NIL != eval_cond_for_lfi) {
            SubLObject sql = sksi_csql_interpretation.make_sql_for_where_expression_int(sksi_csql_utilities.csql_expression_arg(eval_cond_for_lfi, (SubLObject)sksi_cost_estimates.ONE_INTEGER), sql_flavor);
            if (sksi_cost_estimates.NIL != kb_utilities.kbeq(sql_flavor, sksi_cost_estimates.$const24$PostgreSQL)) {
                sql = Sequences.cconcatenate((SubLObject)sksi_cost_estimates.$str61$_cast_, new SubLObject[] { format_nil.format_nil_a_no_copy(sql), sksi_cost_estimates.$str62$_as_text_ });
            }
            return Values.values(sql, table_list, (SubLObject)sksi_cost_estimates.NIL);
        }
        final SubLObject pf_table_name = sksi_kb_accessors.physical_field_sk_source_name(pf);
        SubLObject pf_sql = (SubLObject)sksi_cost_estimates.NIL;
        if (sql_flavor.eql(sksi_cost_estimates.$const24$PostgreSQL)) {
            pf_sql = ((sksi_cost_estimates.NIL != sksi_kb_accessors.boolean_physical_field_p(pf)) ? make_physical_field_name(pf, sql_flavor) : Sequences.cconcatenate((SubLObject)sksi_cost_estimates.$str61$_cast_, new SubLObject[] { make_physical_field_name(pf, sql_flavor), sksi_cost_estimates.$str62$_as_text_ }));
        }
        else if (sql_flavor.eql(sksi_cost_estimates.$const25$MySQL_TheProgram) || sql_flavor.eql(sksi_cost_estimates.$const26$OracleDatabaseServer_TheProgram)) {
            pf_sql = make_physical_field_name(pf, sql_flavor);
        }
        return Values.values(pf_sql, conses_high.adjoin(pf_table_name, table_list, Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQUAL), (SubLObject)sksi_cost_estimates.UNPROVIDED), (SubLObject)sksi_cost_estimates.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 43695L)
    public static SubLObject make_sql_for_where_set(final SubLObject where_set, final SubLObject eval_conditions, final SubLObject sql_flavor, SubLObject table_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!where_set.isCons()) {
            return Values.values((SubLObject)sksi_cost_estimates.NIL, table_list);
        }
        SubLObject sql = (SubLObject)sksi_cost_estimates.NIL;
        thread.resetMultipleValues();
        final SubLObject sql_$87 = make_sql_for_where_set_field(where_set.first(), eval_conditions, sql_flavor, table_list);
        final SubLObject table_list_$88 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sql = sql_$87;
        table_list = table_list_$88;
        SubLObject cdolist_list_var = where_set.rest();
        SubLObject pf = (SubLObject)sksi_cost_estimates.NIL;
        pf = cdolist_list_var.first();
        while (sksi_cost_estimates.NIL != cdolist_list_var) {
            SubLObject pf_sql = (SubLObject)sksi_cost_estimates.NIL;
            thread.resetMultipleValues();
            final SubLObject pf_sql_$89 = make_sql_for_where_set_field(pf, eval_conditions, sql_flavor, table_list);
            final SubLObject table_list_$89 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            pf_sql = pf_sql_$89;
            table_list = table_list_$89;
            sql = Sequences.cconcatenate(sql, new SubLObject[] { sksi_cost_estimates.$str58$__, pf_sql });
            cdolist_list_var = cdolist_list_var.rest();
            pf = cdolist_list_var.first();
        }
        return Values.values(sql, table_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 44255L)
    public static SubLObject make_sql_for_where_set_field(final SubLObject pf, final SubLObject eval_conditions, final SubLObject sql_flavor, final SubLObject table_list) {
        final SubLObject lf = sksi_kb_accessors.sksi_get_mapped_logical_fields_for_physical_field(pf).first();
        final SubLObject lfi = sksi_kb_accessors.lfi_for_lf(lf);
        final SubLObject eval_cond_for_lfi = conses_high.second(Sequences.find(lfi, eval_conditions, Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQ), Symbols.symbol_function((SubLObject)sksi_cost_estimates.$sym60$FIRST), (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED));
        if (sksi_cost_estimates.NIL != eval_cond_for_lfi) {
            return Values.values(sksi_csql_interpretation.make_sql_for_where_expression_int(sksi_csql_utilities.csql_expression_arg(eval_cond_for_lfi, (SubLObject)sksi_cost_estimates.ONE_INTEGER), sql_flavor), table_list);
        }
        return Values.values(make_physical_field_name(pf, sql_flavor), conses_high.adjoin(sksi_kb_accessors.physical_field_sk_source_name(pf), table_list, Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQUAL), (SubLObject)sksi_cost_estimates.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 44811L)
    public static SubLObject make_physical_field_name(final SubLObject pf, final SubLObject sql_flavor) {
        final SubLObject field_name = sksi_kb_accessors.physical_field_name(pf);
        SubLObject table_name = sksi_kb_accessors.sk_source_name(sksi_kb_accessors.physical_schema_sk_sources(sksi_kb_accessors.physical_field_schema(pf)).first());
        if (sksi_cost_estimates.NIL != sksi_kb_accessors.pf_alias_fn_naut_p(pf)) {
            table_name = sksi_csql_generation.make_table_alias_name(table_name, sksi_kb_accessors.pf_alias_fn_naut_index(pf));
        }
        if (sksi_cost_estimates.NIL != kb_utilities.kbeq(sql_flavor, sksi_cost_estimates.$const24$PostgreSQL) && sksi_cost_estimates.NIL != alpha_chars_in_caps_p(field_name)) {
            return Sequences.cconcatenate((SubLObject)sksi_cost_estimates.$str63$_, new SubLObject[] { table_name, sksi_cost_estimates.$str64$_, field_name, sksi_cost_estimates.$str63$_ });
        }
        return Sequences.cconcatenate(table_name, new SubLObject[] { sksi_cost_estimates.$str64$_, field_name });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 45339L)
    public static SubLObject make_sql_for_table(final SubLObject table, final SubLObject table_list, SubLObject from_expression, final SubLObject sql_flavor, final SubLObject use_sampling_viewP) {
        SubLObject table_name = sksi_kb_accessors.sk_source_name(table);
        SubLObject table_names = (SubLObject)sksi_cost_estimates.NIL;
        SubLObject table_sql = (SubLObject)sksi_cost_estimates.NIL;
        if (sksi_cost_estimates.NIL != use_sampling_viewP) {
            from_expression = conses_high.subst(sksi_cost_estimates.$cost_estimate_sampling_view_name$.getGlobalValue(), table_name, from_expression, Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQUAL), (SubLObject)sksi_cost_estimates.UNPROVIDED);
            table_name = sksi_cost_estimates.$cost_estimate_sampling_view_name$.getGlobalValue();
        }
        table_names = sksi_csql_interpretation.csql_extract_table_names_int(from_expression, sql_flavor);
        SubLObject cdolist_list_var = table_list;
        SubLObject table_$91 = (SubLObject)sksi_cost_estimates.NIL;
        table_$91 = cdolist_list_var.first();
        while (sksi_cost_estimates.NIL != cdolist_list_var) {
            SubLObject foundP = (SubLObject)sksi_cost_estimates.NIL;
            if (sksi_cost_estimates.NIL == foundP) {
                SubLObject csome_list_var;
                SubLObject each_from;
                for (csome_list_var = from_expression, each_from = (SubLObject)sksi_cost_estimates.NIL, each_from = csome_list_var.first(); sksi_cost_estimates.NIL == foundP && sksi_cost_estimates.NIL != csome_list_var; foundP = (SubLObject)SubLObjectFactory.makeBoolean(table_$91.equal(conses_high.second(each_from)) || table_$91.equal(conses_high.third(each_from))), csome_list_var = csome_list_var.rest(), each_from = csome_list_var.first()) {}
            }
            if (sksi_cost_estimates.NIL == foundP) {
                table_names = (SubLObject)ConsesLow.cons(table_$91, table_names);
            }
            cdolist_list_var = cdolist_list_var.rest();
            table_$91 = cdolist_list_var.first();
        }
        table_sql = sksi_csql_interpretation.sql_for_table_names(table_names, sql_flavor);
        return table_sql;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 46245L)
    public static SubLObject alpha_chars_in_caps_p(final SubLObject string) {
        return string_utilities.every_in_string((SubLObject)sksi_cost_estimates.$sym65$ALPHA_CHAR_IN_CAP_, string, (SubLObject)sksi_cost_estimates.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 46348L)
    public static SubLObject alpha_char_in_capP(final SubLObject v_char) {
        if (sksi_cost_estimates.NIL == Characters.alpha_char_p(v_char)) {
            return (SubLObject)sksi_cost_estimates.T;
        }
        return Characters.upper_case_p(v_char);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 46464L)
    public static SubLObject sksi_sparql_determine_logical_cardinality_estimates_for_ks(final SubLObject sparql_ks, SubLObject logical_schema_ignore_list, SubLObject progress_stream) {
        if (logical_schema_ignore_list == sksi_cost_estimates.UNPROVIDED) {
            logical_schema_ignore_list = (SubLObject)sksi_cost_estimates.NIL;
        }
        if (progress_stream == sksi_cost_estimates.UNPROVIDED) {
            progress_stream = (SubLObject)sksi_cost_estimates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sparql_ks);
        SubLObject logical_schemas = (SubLObject)sksi_cost_estimates.NIL;
        SubLObject results = (SubLObject)sksi_cost_estimates.NIL;
        final SubLObject mt_var = meta_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var;
            logical_schemas = (cdolist_list_var = sksi_kb_accessors.sk_source_logical_schemata(sparql_ks));
            SubLObject logical_schema = (SubLObject)sksi_cost_estimates.NIL;
            logical_schema = cdolist_list_var.first();
            while (sksi_cost_estimates.NIL != cdolist_list_var) {
                final SubLObject schema_pred = kb_mapping_utilities.fpred_value(logical_schema, sksi_cost_estimates.$const66$meaningSentencePredicateForSchema, (SubLObject)sksi_cost_estimates.ONE_INTEGER, (SubLObject)sksi_cost_estimates.TWO_INTEGER, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                SubLObject error_msg = (SubLObject)sksi_cost_estimates.NIL;
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$92 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)sksi_cost_estimates.$sym67$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            if (sksi_cost_estimates.NIL != progress_stream) {
                                format_nil.force_format(progress_stream, (SubLObject)sksi_cost_estimates.$str68$___A__, logical_schema, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                            }
                            if (sksi_cost_estimates.NIL != subl_promotions.memberP(logical_schema, logical_schema_ignore_list, Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQUAL), (SubLObject)sksi_cost_estimates.UNPROVIDED)) {
                                if (sksi_cost_estimates.NIL != progress_stream) {
                                    format_nil.force_format(progress_stream, (SubLObject)sksi_cost_estimates.$str69$SKIPPED__ignored_, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                                }
                            }
                            else if (sksi_cost_estimates.NIL != isa.isa_in_any_mtP(schema_pred, sksi_cost_estimates.$const70$ExpandedGraphConcept)) {
                                if (sksi_cost_estimates.NIL != progress_stream) {
                                    format_nil.force_format(progress_stream, (SubLObject)sksi_cost_estimates.$str71$SKIPPED__expanded_, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                                }
                            }
                            else if (sksi_cost_estimates.NIL != isa.isa_in_any_mtP(schema_pred, sksi_cost_estimates.$const72$CCFDemographicProperty)) {
                                if (sksi_cost_estimates.NIL != progress_stream) {
                                    format_nil.force_format(progress_stream, (SubLObject)sksi_cost_estimates.$str73$SKIPPED__demographic_property_, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                                }
                            }
                            else {
                                SubLObject cdolist_list_var_$93 = sksi_sparql_determine_logical_cardinality_estimates_for_ls((SubLObject)ConsesLow.list(logical_schema), sparql_ks, progress_stream);
                                SubLObject subresult = (SubLObject)sksi_cost_estimates.NIL;
                                subresult = cdolist_list_var_$93.first();
                                while (sksi_cost_estimates.NIL != cdolist_list_var_$93) {
                                    results = (SubLObject)ConsesLow.cons(subresult, results);
                                    cdolist_list_var_$93 = cdolist_list_var_$93.rest();
                                    subresult = cdolist_list_var_$93.first();
                                }
                            }
                            if (sksi_cost_estimates.NIL != progress_stream) {
                                format_nil.force_format(progress_stream, (SubLObject)sksi_cost_estimates.$str74$__, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                            }
                            if (sksi_cost_estimates.NIL != error_msg) {
                                format_nil.force_format((SubLObject)sksi_cost_estimates.T, (SubLObject)sksi_cost_estimates.$str75$ERROR___A__, logical_schema, error_msg, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                            }
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)sksi_cost_estimates.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$92, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    error_msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
                cdolist_list_var = cdolist_list_var.rest();
                logical_schema = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 48179L)
    public static SubLObject sksi_sparql_determine_logical_cardinality_estimates_for_ls(final SubLObject logical_schemata, final SubLObject sparql_ks, final SubLObject progress_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sparql_ks);
        SubLObject physical_schemata = (SubLObject)sksi_cost_estimates.NIL;
        SubLObject meaning_sentences = (SubLObject)sksi_cost_estimates.NIL;
        SubLObject results = (SubLObject)sksi_cost_estimates.NIL;
        final SubLObject mt_var = meta_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            physical_schemata = sksi_kb_accessors.logical_schemata_physical_schemata(logical_schemata);
            meaning_sentences = sksi_meaning_sentence_utilities.logical_schema_meaning_sentence_gafs(logical_schemata.first(), (SubLObject)sksi_cost_estimates.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = meaning_sentences;
        SubLObject meaning_sentence = (SubLObject)sksi_cost_estimates.NIL;
        meaning_sentence = cdolist_list_var.first();
        while (sksi_cost_estimates.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$94 = sksi_sparql_determine_logical_cardinality_estimates_for_meaning_sentence(assertions_high.gaf_arg2(meaning_sentence), logical_schemata, physical_schemata, sparql_ks, progress_stream);
            SubLObject subresult = (SubLObject)sksi_cost_estimates.NIL;
            subresult = cdolist_list_var_$94.first();
            while (sksi_cost_estimates.NIL != cdolist_list_var_$94) {
                results = (SubLObject)ConsesLow.cons(subresult, results);
                cdolist_list_var_$94 = cdolist_list_var_$94.rest();
                subresult = cdolist_list_var_$94.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            meaning_sentence = cdolist_list_var.first();
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 48938L)
    public static SubLObject sksi_sparql_determine_logical_cardinality_estimates_for_meaning_sentence(final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject sparql_ks, final SubLObject progress_stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject access_path = sksi_access_path.external_source_access_path(sparql_ks, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
        final SubLObject meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sparql_ks);
        SubLObject unbound_csql = (SubLObject)sksi_cost_estimates.NIL;
        final SubLObject mt_var = meta_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            unbound_csql = sksi_csql_generation.sksi_determine_output_csql(sentence, logical_schemata, physical_schemata, sparql_ks, (SubLObject)sksi_cost_estimates.NIL, (SubLObject)sksi_cost_estimates.$list76, (SubLObject)sksi_cost_estimates.NIL, (SubLObject)sksi_cost_estimates.NIL, (SubLObject)sksi_cost_estimates.NIL, (SubLObject)sksi_cost_estimates.$int77$1000);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        final SubLObject result_set = sksi_sks_interaction.generate_sparql_result_set_from_csql(unbound_csql, access_path);
        SubLObject range_terms = (SubLObject)sksi_cost_estimates.NIL;
        SubLObject domain_terms = (SubLObject)sksi_cost_estimates.NIL;
        if (sksi_cost_estimates.NIL != result_set) {
            SubLObject cdolist_list_var = result_set;
            SubLObject result = (SubLObject)sksi_cost_estimates.NIL;
            result = cdolist_list_var.first();
            while (sksi_cost_estimates.NIL != cdolist_list_var) {
                final SubLObject subject = result.first();
                final SubLObject v_object = conses_high.second(result);
                SubLObject item_var = subject;
                if (sksi_cost_estimates.NIL == conses_high.member(item_var, domain_terms, Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQUAL), Symbols.symbol_function((SubLObject)sksi_cost_estimates.IDENTITY))) {
                    domain_terms = (SubLObject)ConsesLow.cons(item_var, domain_terms);
                }
                item_var = v_object;
                if (sksi_cost_estimates.NIL == conses_high.member(item_var, range_terms, Symbols.symbol_function((SubLObject)sksi_cost_estimates.EQUAL), Symbols.symbol_function((SubLObject)sksi_cost_estimates.IDENTITY))) {
                    range_terms = (SubLObject)ConsesLow.cons(item_var, range_terms);
                }
                cdolist_list_var = cdolist_list_var.rest();
                result = cdolist_list_var.first();
            }
            final SubLObject logical_result_set_cardinality_1_2 = sksi_sparql_determine_logical_cardinality_estimate_for_meaning_sentence_bound_in_arg(sentence, domain_terms, (SubLObject)sksi_cost_estimates.ONE_INTEGER, (SubLObject)sksi_cost_estimates.TWO_INTEGER, physical_schemata, logical_schemata, sparql_ks, access_path, progress_stream);
            final SubLObject logical_result_set_cardinality_2_1 = sksi_sparql_determine_logical_cardinality_estimate_for_meaning_sentence_bound_in_arg(sentence, range_terms, (SubLObject)sksi_cost_estimates.TWO_INTEGER, (SubLObject)sksi_cost_estimates.ONE_INTEGER, physical_schemata, logical_schemata, sparql_ks, access_path, progress_stream);
            final SubLObject ls = logical_schemata.first();
            SubLObject lf1 = (SubLObject)sksi_cost_estimates.NIL;
            SubLObject lf2 = (SubLObject)sksi_cost_estimates.NIL;
            final SubLObject mt_var2 = meta_mt;
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var2), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var2), thread);
                lf1 = narts_high.nart_el_formula(sksi_kb_accessors.logical_field_for_indexical(cycl_utilities.formula_arg1(sentence, (SubLObject)sksi_cost_estimates.UNPROVIDED)));
                lf2 = narts_high.nart_el_formula(sksi_kb_accessors.logical_field_for_indexical(cycl_utilities.formula_arg2(sentence, (SubLObject)sksi_cost_estimates.UNPROVIDED)));
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
            }
            if (sksi_cost_estimates.NIL == lf1 || sksi_cost_estimates.NIL == lf2) {
                Errors.warn((SubLObject)sksi_cost_estimates.$str78$Could_not_find_logical_fields_for, logical_schemata);
                return (SubLObject)sksi_cost_estimates.NIL;
            }
            final SubLObject lrsc_1_2_existing_nums = ask_utilities.query_template((SubLObject)sksi_cost_estimates.$sym79$_NUM, el_utilities.make_quaternary_formula(sksi_cost_estimates.$const80$logicalResultSetCardinality, ls, (SubLObject)ConsesLow.list(sksi_cost_estimates.$const81$TheSet, lf2), (SubLObject)ConsesLow.list(sksi_cost_estimates.$const81$TheSet, lf1), (SubLObject)sksi_cost_estimates.$sym79$_NUM), meta_mt, (SubLObject)sksi_cost_estimates.UNPROVIDED);
            final SubLObject lrsc_2_1_existing_nums = ask_utilities.query_template((SubLObject)sksi_cost_estimates.$sym79$_NUM, el_utilities.make_quaternary_formula(sksi_cost_estimates.$const80$logicalResultSetCardinality, ls, (SubLObject)ConsesLow.list(sksi_cost_estimates.$const81$TheSet, lf1), (SubLObject)ConsesLow.list(sksi_cost_estimates.$const81$TheSet, lf2), (SubLObject)sksi_cost_estimates.$sym79$_NUM), meta_mt, (SubLObject)sksi_cost_estimates.UNPROVIDED);
            if (!logical_result_set_cardinality_1_2.isZero()) {
                final SubLObject new_sentence = el_utilities.make_quaternary_formula(sksi_cost_estimates.$const80$logicalResultSetCardinality, ls, (SubLObject)ConsesLow.list(sksi_cost_estimates.$const81$TheSet, lf2), (SubLObject)ConsesLow.list(sksi_cost_estimates.$const81$TheSet, lf1), logical_result_set_cardinality_1_2);
                SubLObject assertP = (SubLObject)sksi_cost_estimates.T;
                SubLObject cdolist_list_var2 = lrsc_1_2_existing_nums;
                SubLObject lrsc_1_2_existing_num = (SubLObject)sksi_cost_estimates.NIL;
                lrsc_1_2_existing_num = cdolist_list_var2.first();
                while (sksi_cost_estimates.NIL != cdolist_list_var2) {
                    if (lrsc_1_2_existing_num.equal(logical_result_set_cardinality_1_2)) {
                        assertP = (SubLObject)sksi_cost_estimates.NIL;
                    }
                    else {
                        final SubLObject old_sentence = el_utilities.make_quaternary_formula(sksi_cost_estimates.$const80$logicalResultSetCardinality, ls, (SubLObject)ConsesLow.list(sksi_cost_estimates.$const81$TheSet, lf2), (SubLObject)ConsesLow.list(sksi_cost_estimates.$const81$TheSet, lf1), lrsc_1_2_existing_num);
                        final SubLObject assertion = czer_meta.find_assertion_cycl(old_sentence, meta_mt);
                        if (sksi_cost_estimates.NIL != assertion_handles.assertion_p(assertion)) {
                            if (sksi_cost_estimates.NIL != assertions_high.asserted_assertionP(assertion)) {
                                ke.ke_unassert(old_sentence, meta_mt);
                            }
                            else {
                                assertP = (SubLObject)sksi_cost_estimates.NIL;
                            }
                        }
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    lrsc_1_2_existing_num = cdolist_list_var2.first();
                }
                if (sksi_cost_estimates.NIL != assertP) {
                    ke.ke_assert(new_sentence, meta_mt, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                }
            }
            if (!logical_result_set_cardinality_2_1.isZero()) {
                final SubLObject new_sentence = el_utilities.make_quaternary_formula(sksi_cost_estimates.$const80$logicalResultSetCardinality, ls, (SubLObject)ConsesLow.list(sksi_cost_estimates.$const81$TheSet, lf1), (SubLObject)ConsesLow.list(sksi_cost_estimates.$const81$TheSet, lf2), logical_result_set_cardinality_2_1);
                SubLObject assertP = (SubLObject)sksi_cost_estimates.T;
                SubLObject cdolist_list_var2 = lrsc_2_1_existing_nums;
                SubLObject lrsc_2_1_existing_num = (SubLObject)sksi_cost_estimates.NIL;
                lrsc_2_1_existing_num = cdolist_list_var2.first();
                while (sksi_cost_estimates.NIL != cdolist_list_var2) {
                    if (lrsc_2_1_existing_num.equal(logical_result_set_cardinality_2_1)) {
                        assertP = (SubLObject)sksi_cost_estimates.NIL;
                    }
                    else {
                        final SubLObject old_sentence = el_utilities.make_quaternary_formula(sksi_cost_estimates.$const80$logicalResultSetCardinality, ls, (SubLObject)ConsesLow.list(sksi_cost_estimates.$const81$TheSet, lf1), (SubLObject)ConsesLow.list(sksi_cost_estimates.$const81$TheSet, lf2), lrsc_2_1_existing_num);
                        final SubLObject assertion = czer_meta.find_assertion_cycl(old_sentence, meta_mt);
                        if (sksi_cost_estimates.NIL != assertion_handles.assertion_p(assertion)) {
                            if (sksi_cost_estimates.NIL != assertions_high.asserted_assertionP(assertion)) {
                                ke.ke_unassert(old_sentence, meta_mt);
                            }
                            else {
                                assertP = (SubLObject)sksi_cost_estimates.NIL;
                            }
                        }
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    lrsc_2_1_existing_num = cdolist_list_var2.first();
                }
                if (sksi_cost_estimates.NIL != assertP) {
                    ke.ke_assert(new_sentence, meta_mt, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                }
            }
        }
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 52738L)
    public static SubLObject sksi_sparql_determine_logical_cardinality_estimate_for_meaning_sentence_bound_in_arg(final SubLObject sentence, final SubLObject index_terms, final SubLObject index_arg, final SubLObject gather_arg, final SubLObject physical_schemata, final SubLObject logical_schemata, final SubLObject sparql_ks, SubLObject access_path, SubLObject progress_stream) {
        if (access_path == sksi_cost_estimates.UNPROVIDED) {
            access_path = sksi_access_path.external_source_access_path(sparql_ks, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
        }
        if (progress_stream == sksi_cost_estimates.UNPROVIDED) {
            progress_stream = (SubLObject)sksi_cost_estimates.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sparql_ks);
        final SubLObject index_arg_lfi = ConsesLow.nth(index_arg, sentence);
        SubLObject index_arg_pfis = (SubLObject)sksi_cost_estimates.NIL;
        final SubLObject count = Sequences.length(index_terms);
        SubLObject sample_size = (SubLObject)sksi_cost_estimates.ZERO_INTEGER;
        SubLObject samples = (SubLObject)sksi_cost_estimates.NIL;
        SubLObject result = (SubLObject)sksi_cost_estimates.NIL;
        if (sksi_cost_estimates.NIL != progress_stream) {
            format_nil.force_format(progress_stream, (SubLObject)sksi_cost_estimates.$str82$__A_, index_arg, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
        }
        final SubLObject mt_var = meta_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            index_arg_pfis = sksi_infrastructure_utilities.sksi_determine_relevant_physical_field_indexicals((SubLObject)ConsesLow.list(index_arg_lfi), logical_schemata, physical_schemata);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject index_terms_left = list_utilities.randomize_list(index_terms);
        while (sksi_cost_estimates.NIL == representative_sampleP(samples, count)) {
            if (sksi_cost_estimates.NIL != progress_stream) {
                format_nil.force_format(progress_stream, (SubLObject)sksi_cost_estimates.$str64$_, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
            }
            final SubLObject index_term = index_terms_left.first();
            SubLObject index_arg_bound_query = (SubLObject)sksi_cost_estimates.NIL;
            index_terms_left = index_terms_left.rest();
            final SubLObject mt_var2 = meta_mt;
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var2), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var2), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var2), thread);
                index_arg_bound_query = sksi_csql_generation.sksi_determine_output_csql(sentence, logical_schemata, physical_schemata, sparql_ks, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(index_arg)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(gather_arg)), index_arg_pfis, (SubLObject)sksi_cost_estimates.NIL, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                index_arg_bound_query = list_utilities.tree_substitute(index_arg_bound_query, (SubLObject)sksi_cost_estimates.$list83, index_term);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_6, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_5, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
            }
            final SubLObject this_count = Sequences.length(sksi_sks_interaction.generate_sparql_result_set_from_csql(index_arg_bound_query, access_path));
            if (this_count.isZero()) {
                Errors.warn((SubLObject)sksi_cost_estimates.$str84$Zero_count_for__A__A__A, sentence, index_arg, gather_arg);
            }
            else {
                samples = (SubLObject)ConsesLow.cons(this_count, samples);
            }
            sample_size = Numbers.add(sample_size, (SubLObject)sksi_cost_estimates.ONE_INTEGER);
        }
        result = Numbers.truncate(number_utilities.mean(samples), (SubLObject)sksi_cost_estimates.UNPROVIDED);
        if (sksi_cost_estimates.NIL != progress_stream) {
            format_nil.force_format(progress_stream, (SubLObject)sksi_cost_estimates.$str85$_A, result, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 54615L)
    public static SubLObject representative_sampleP(final SubLObject samples, final SubLObject total_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_cost_estimates.NIL == samples) {
            return (SubLObject)sksi_cost_estimates.NIL;
        }
        final SubLObject sample_count = Sequences.length(samples);
        SubLObject result = (SubLObject)sksi_cost_estimates.NIL;
        result = (SubLObject)SubLObjectFactory.makeBoolean(sample_count.numGE(sksi_cost_estimates.$sksi_sparql_max_cost_query_samples$.getDynamicValue(thread)) || sample_count.numGE(total_count));
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 55337L)
    public static SubLObject sksi_sparql_determine_rdf_type_logical_cardinality_wrt_value_estimates_from_file(final SubLObject filename, SubLObject only_report_missingP) {
        if (only_report_missingP == sksi_cost_estimates.UNPROVIDED) {
            only_report_missingP = (SubLObject)sksi_cost_estimates.NIL;
        }
        final SubLObject ls = sksi_cost_estimates.$const86$CCF_SDB_RDFType_LS;
        final SubLObject meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sksi_cost_estimates.$const87$CCF_SDB_KS);
        final SubLObject arg2_lf_set = el_utilities.make_el_set((SubLObject)ConsesLow.list(narts_high.find_nart((SubLObject)sksi_cost_estimates.$list88)), (SubLObject)sksi_cost_estimates.UNPROVIDED);
        final SubLObject arg3_lf_set = el_utilities.make_el_set((SubLObject)ConsesLow.list(narts_high.find_nart((SubLObject)sksi_cost_estimates.$list89)), (SubLObject)sksi_cost_estimates.UNPROVIDED);
        SubLObject cdolist_list_var = file_utilities.get_file_lines(filename);
        SubLObject line = (SubLObject)sksi_cost_estimates.NIL;
        line = cdolist_list_var.first();
        while (sksi_cost_estimates.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = string_utilities.string_tokenize(line, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
            SubLObject term_info_string = (SubLObject)sksi_cost_estimates.NIL;
            SubLObject count_string = (SubLObject)sksi_cost_estimates.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_cost_estimates.$list90);
            term_info_string = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_cost_estimates.$list90);
            count_string = current.first();
            current = current.rest();
            final SubLObject ignore1 = (SubLObject)(current.isCons() ? current.first() : sksi_cost_estimates.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_cost_estimates.$list90);
            current = current.rest();
            final SubLObject ignore2 = (SubLObject)(current.isCons() ? current.first() : sksi_cost_estimates.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_cost_estimates.$list90);
            current = current.rest();
            if (sksi_cost_estimates.NIL == current) {
                SubLObject current_$96;
                final SubLObject datum_$95 = current_$96 = string_utilities.string_tokenize(term_info_string, (SubLObject)sksi_cost_estimates.$list91, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                SubLObject term_junk = (SubLObject)sksi_cost_estimates.NIL;
                SubLObject term_string = (SubLObject)sksi_cost_estimates.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$96, datum_$95, (SubLObject)sksi_cost_estimates.$list92);
                term_junk = current_$96.first();
                current_$96 = current_$96.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$96, datum_$95, (SubLObject)sksi_cost_estimates.$list92);
                term_string = current_$96.first();
                current_$96 = current_$96.rest();
                if (sksi_cost_estimates.NIL == current_$96) {
                    final SubLObject count = reader.parse_integer(count_string, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                    final SubLObject lookup_term_string = Sequences.cconcatenate((SubLObject)sksi_cost_estimates.$str93$ptrec_, term_string);
                    final SubLObject cyc_term = sksi_reformulate.sksi_reformulate(el_utilities.make_binary_formula(sksi_cost_estimates.$const94$SchemaObjectFn, sksi_cost_estimates.$const95$CCF_SDB_RDFType_CMLS, lookup_term_string), (SubLObject)sksi_cost_estimates.$kw96$DECODE, sksi_cost_estimates.$const97$CCF_SDB_SDBMySQLExportStore_Cyc_K);
                    if (sksi_cost_estimates.NIL != forts.fort_p(cyc_term)) {
                        if (sksi_cost_estimates.NIL == only_report_missingP) {
                            final SubLObject existing_nums = ask_utilities.query_template((SubLObject)sksi_cost_estimates.$sym79$_NUM, (SubLObject)ConsesLow.list(sksi_cost_estimates.$const98$logicalResultSetCardinalityWRTVal, ls, arg2_lf_set, arg3_lf_set, (SubLObject)sksi_cost_estimates.$sym79$_NUM, cyc_term), meta_mt, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                            if (sksi_cost_estimates.NIL != existing_nums) {
                                SubLObject cdolist_list_var_$97 = existing_nums;
                                SubLObject existing_num = (SubLObject)sksi_cost_estimates.NIL;
                                existing_num = cdolist_list_var_$97.first();
                                while (sksi_cost_estimates.NIL != cdolist_list_var_$97) {
                                    if (!existing_num.equal(count)) {
                                        final SubLObject old_sentence = (SubLObject)ConsesLow.list(sksi_cost_estimates.$const98$logicalResultSetCardinalityWRTVal, ls, arg2_lf_set, arg3_lf_set, existing_num, cyc_term);
                                        ke.ke_unassert(old_sentence, meta_mt);
                                    }
                                    cdolist_list_var_$97 = cdolist_list_var_$97.rest();
                                    existing_num = cdolist_list_var_$97.first();
                                }
                            }
                            if (sksi_cost_estimates.NIL == subl_promotions.memberP(count, existing_nums, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED)) {
                                final SubLObject new_sentence = (SubLObject)ConsesLow.list(sksi_cost_estimates.$const98$logicalResultSetCardinalityWRTVal, ls, arg2_lf_set, arg3_lf_set, count, cyc_term);
                                ke.ke_assert(new_sentence, meta_mt, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                            }
                        }
                    }
                    else if (sksi_cost_estimates.NIL != only_report_missingP) {
                        PrintLow.format((SubLObject)sksi_cost_estimates.T, (SubLObject)sksi_cost_estimates.$str99$_A__, lookup_term_string);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$95, (SubLObject)sksi_cost_estimates.$list92);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_cost_estimates.$list90);
            }
            cdolist_list_var = cdolist_list_var.rest();
            line = cdolist_list_var.first();
        }
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-cost-estimates.lisp", position = 57478L)
    public static SubLObject sksi_sparql_determine_rdf_type_logical_cardinality_wrt_value_estimates(SubLObject ls, SubLObject rdf_type_class_coll) {
        if (ls == sksi_cost_estimates.UNPROVIDED) {
            ls = sksi_cost_estimates.$const86$CCF_SDB_RDFType_LS;
        }
        if (rdf_type_class_coll == sksi_cost_estimates.UNPROVIDED) {
            rdf_type_class_coll = sksi_cost_estimates.$const100$CCFRDF_TypeOWLClass;
        }
        final SubLObject meta_mt = sksi_kb_accessors.sk_source_mapping_mt(sksi_cost_estimates.$const87$CCF_SDB_KS);
        final SubLObject arg2_lf_set = el_utilities.make_el_set((SubLObject)ConsesLow.list(narts_high.find_nart((SubLObject)ConsesLow.listS(sksi_cost_estimates.$const101$LogicalFieldFn, ls, (SubLObject)sksi_cost_estimates.$list102))), (SubLObject)sksi_cost_estimates.UNPROVIDED);
        final SubLObject arg3_lf_set = el_utilities.make_el_set((SubLObject)ConsesLow.list(narts_high.find_nart((SubLObject)ConsesLow.listS(sksi_cost_estimates.$const101$LogicalFieldFn, ls, (SubLObject)sksi_cost_estimates.$list103))), (SubLObject)sksi_cost_estimates.UNPROVIDED);
        SubLObject cdolist_list_var = isa.all_instances_in_all_mts(rdf_type_class_coll);
        SubLObject rdf_type_class = (SubLObject)sksi_cost_estimates.NIL;
        rdf_type_class = cdolist_list_var.first();
        while (sksi_cost_estimates.NIL != cdolist_list_var) {
            format_nil.force_format((SubLObject)sksi_cost_estimates.T, (SubLObject)sksi_cost_estimates.$str68$___A__, rdf_type_class, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
            if (sksi_cost_estimates.NIL == isa.isa_in_any_mtP(rdf_type_class_coll, sksi_cost_estimates.$const104$ExpandedGraphRDF_TypeCCFOWLClass)) {
                final SubLObject existing_nums = ask_utilities.query_template((SubLObject)sksi_cost_estimates.$sym79$_NUM, (SubLObject)ConsesLow.list(sksi_cost_estimates.$const98$logicalResultSetCardinalityWRTVal, ls, arg2_lf_set, arg3_lf_set, (SubLObject)sksi_cost_estimates.$sym79$_NUM, rdf_type_class), meta_mt, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                if (Functions.apply((SubLObject)sksi_cost_estimates.$sym105$_, existing_nums).numG((SubLObject)sksi_cost_estimates.$int106$1000000)) {
                    Errors.warn((SubLObject)sksi_cost_estimates.$str107$Skipping__A_since_current_cost_hi, rdf_type_class, existing_nums);
                }
                else {
                    final SubLObject query_results = ask_utilities.query_template((SubLObject)sksi_cost_estimates.$sym108$_X, el_utilities.make_binary_formula(sksi_cost_estimates.$const109$rdf_type, (SubLObject)sksi_cost_estimates.$sym108$_X, rdf_type_class), sksi_cost_estimates.$const110$CCF_CAE_QueryMt, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                    final SubLObject new_num = Sequences.length(query_results);
                    format_nil.force_format((SubLObject)sksi_cost_estimates.T, (SubLObject)sksi_cost_estimates.$str99$_A__, new_num, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                    if (!new_num.eql((SubLObject)sksi_cost_estimates.ZERO_INTEGER)) {
                        if (sksi_cost_estimates.NIL != existing_nums) {
                            SubLObject cdolist_list_var_$98 = existing_nums;
                            SubLObject existing_num = (SubLObject)sksi_cost_estimates.NIL;
                            existing_num = cdolist_list_var_$98.first();
                            while (sksi_cost_estimates.NIL != cdolist_list_var_$98) {
                                if (!existing_num.equal(new_num)) {
                                    final SubLObject old_sentence = (SubLObject)ConsesLow.list(sksi_cost_estimates.$const98$logicalResultSetCardinalityWRTVal, ls, arg2_lf_set, arg3_lf_set, existing_num, rdf_type_class);
                                    ke.ke_unassert(old_sentence, meta_mt);
                                }
                                cdolist_list_var_$98 = cdolist_list_var_$98.rest();
                                existing_num = cdolist_list_var_$98.first();
                            }
                        }
                        if (sksi_cost_estimates.NIL == subl_promotions.memberP(new_num, existing_nums, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED)) {
                            final SubLObject new_sentence = (SubLObject)ConsesLow.list(sksi_cost_estimates.$const98$logicalResultSetCardinalityWRTVal, ls, arg2_lf_set, arg3_lf_set, new_num, rdf_type_class);
                            ke.ke_assert(new_sentence, meta_mt, (SubLObject)sksi_cost_estimates.UNPROVIDED, (SubLObject)sksi_cost_estimates.UNPROVIDED);
                        }
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            rdf_type_class = cdolist_list_var.first();
        }
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    public static SubLObject declare_sksi_cost_estimates_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "update_cost_estimates_for_sks", "UPDATE-COST-ESTIMATES-FOR-SKS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "update_cost_estimates_for_meaning_sentence_pred", "UPDATE-COST-ESTIMATES-FOR-MEANING-SENTENCE-PRED", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "update_cost_estimates_for_meaning_sentence", "UPDATE-COST-ESTIMATES-FOR-MEANING-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "update_cost_estimates_for_conditional_meaning_sentence", "UPDATE-COST-ESTIMATES-FOR-CONDITIONAL-MEANING-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "update_cost_estimates_for_logical_fields", "UPDATE-COST-ESTIMATES-FOR-LOGICAL-FIELDS", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "update_cost_estimates_for_field_decoding", "UPDATE-COST-ESTIMATES-FOR-FIELD-DECODING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "update_cost_estimates_for_field_encoding", "UPDATE-COST-ESTIMATES-FOR-FIELD-ENCODING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "update_cost_estimates_for_sks_int", "UPDATE-COST-ESTIMATES-FOR-SKS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "physical_field_tuples_used_in_meaning_sentences_in_ks", "PHYSICAL-FIELD-TUPLES-USED-IN-MEANING-SENTENCES-IN-KS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "any_lfi_appears_in_sentenceP", "ANY-LFI-APPEARS-IN-SENTENCE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "physical_field_tuples_for_ps_ls", "PHYSICAL-FIELD-TUPLES-FOR-PS-LS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "get_from_and_where_expression_for_antecedent_of_cms", "GET-FROM-AND-WHERE-EXPRESSION-FOR-ANTECEDENT-OF-CMS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "physical_field_tuples_for_meaning_sentence", "PHYSICAL-FIELD-TUPLES-FOR-MEANING-SENTENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "update_cost_estimates_for_ks_ps", "UPDATE-COST-ESTIMATES-FOR-KS-PS", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "update_cost_estimates_for_db_ps", "UPDATE-COST-ESTIMATES-FOR-DB-PS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "gather_cost_estimate_for_select_and_where_sets", "GATHER-COST-ESTIMATE-FOR-SELECT-AND-WHERE-SETS", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "assert_cost_estimate_for_select_and_where_sets", "ASSERT-COST-ESTIMATE-FOR-SELECT-AND-WHERE-SETS", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "remove_cost_estimates_for_ps_list", "REMOVE-COST-ESTIMATES-FOR-PS-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "remove_cost_estimates_for_ps", "REMOVE-COST-ESTIMATES-FOR-PS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "remove_cost_estimate_for_select_where_sets", "REMOVE-COST-ESTIMATE-FOR-SELECT-WHERE-SETS", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "remove_result_set_cardinality_gaf_for_select_where_sets", "REMOVE-RESULT-SET-CARDINALITY-GAF-FOR-SELECT-WHERE-SETS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "remove_result_set_cardinality_wXconstraints_gaf_for_select_where_sets", "REMOVE-RESULT-SET-CARDINALITY-W/CONSTRAINTS-GAF-FOR-SELECT-WHERE-SETS", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "sksi_determine_csql_for_gathering_cost_estimates", "SKSI-DETERMINE-CSQL-FOR-GATHERING-COST-ESTIMATES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "determine_sql_for_gathering_cost_estimates", "DETERMINE-SQL-FOR-GATHERING-COST-ESTIMATES", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "determine_sql_for_gathering_cost_estimates_via_subquery", "DETERMINE-SQL-FOR-GATHERING-COST-ESTIMATES-VIA-SUBQUERY", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "determine_sql_for_gathering_cost_estimates_via_temporary_table", "DETERMINE-SQL-FOR-GATHERING-COST-ESTIMATES-VIA-TEMPORARY-TABLE", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "get_sk_source_row_count", "GET-SK-SOURCE-ROW-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "create_sampling_view", "CREATE-SAMPLING-VIEW", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "remove_sampling_view", "REMOVE-SAMPLING-VIEW", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "use_cost_estimate_sampling_viewP", "USE-COST-ESTIMATE-SAMPLING-VIEW?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "make_sql_for_select_set", "MAKE-SQL-FOR-SELECT-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "make_sql_for_select_set_field", "MAKE-SQL-FOR-SELECT-SET-FIELD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "make_sql_for_where_set", "MAKE-SQL-FOR-WHERE-SET", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "make_sql_for_where_set_field", "MAKE-SQL-FOR-WHERE-SET-FIELD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "make_physical_field_name", "MAKE-PHYSICAL-FIELD-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "make_sql_for_table", "MAKE-SQL-FOR-TABLE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "alpha_chars_in_caps_p", "ALPHA-CHARS-IN-CAPS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "alpha_char_in_capP", "ALPHA-CHAR-IN-CAP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "sksi_sparql_determine_logical_cardinality_estimates_for_ks", "SKSI-SPARQL-DETERMINE-LOGICAL-CARDINALITY-ESTIMATES-FOR-KS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "sksi_sparql_determine_logical_cardinality_estimates_for_ls", "SKSI-SPARQL-DETERMINE-LOGICAL-CARDINALITY-ESTIMATES-FOR-LS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "sksi_sparql_determine_logical_cardinality_estimates_for_meaning_sentence", "SKSI-SPARQL-DETERMINE-LOGICAL-CARDINALITY-ESTIMATES-FOR-MEANING-SENTENCE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "sksi_sparql_determine_logical_cardinality_estimate_for_meaning_sentence_bound_in_arg", "SKSI-SPARQL-DETERMINE-LOGICAL-CARDINALITY-ESTIMATE-FOR-MEANING-SENTENCE-BOUND-IN-ARG", 7, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "representative_sampleP", "REPRESENTATIVE-SAMPLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "sksi_sparql_determine_rdf_type_logical_cardinality_wrt_value_estimates_from_file", "SKSI-SPARQL-DETERMINE-RDF-TYPE-LOGICAL-CARDINALITY-WRT-VALUE-ESTIMATES-FROM-FILE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_cost_estimates", "sksi_sparql_determine_rdf_type_logical_cardinality_wrt_value_estimates", "SKSI-SPARQL-DETERMINE-RDF-TYPE-LOGICAL-CARDINALITY-WRT-VALUE-ESTIMATES", 0, 2, false);
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    public static SubLObject init_sksi_cost_estimates_file() {
        sksi_cost_estimates.$cost_estimate_sampling_percentage$ = SubLFiles.deflexical("*COST-ESTIMATE-SAMPLING-PERCENTAGE*", (SubLObject)sksi_cost_estimates.$float17$0_1);
        sksi_cost_estimates.$cost_estimate_sampling_view_name$ = SubLFiles.deflexical("*COST-ESTIMATE-SAMPLING-VIEW-NAME*", (SubLObject)sksi_cost_estimates.$str18$cost_est_sampling);
        sksi_cost_estimates.$sksi_sparql_max_cost_query_samples$ = SubLFiles.defparameter("*SKSI-SPARQL-MAX-COST-QUERY-SAMPLES*", (SubLObject)sksi_cost_estimates.TWENTY_INTEGER);
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    public static SubLObject setup_sksi_cost_estimates_file() {
        return (SubLObject)sksi_cost_estimates.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sksi_cost_estimates_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sksi_cost_estimates_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sksi_cost_estimates_file();
    }
    
    static {
        me = (SubLFile)new sksi_cost_estimates();
        sksi_cost_estimates.$cost_estimate_sampling_percentage$ = null;
        sksi_cost_estimates.$cost_estimate_sampling_view_name$ = null;
        sksi_cost_estimates.$sksi_sparql_max_cost_query_samples$ = null;
        $str0$SKSI_SQL_statement_cache_ = SubLObjectFactory.makeString("SKSI SQL statement cache ");
        $kw1$REMOVE_SELECTIVE = SubLObjectFactory.makeKeyword("REMOVE-SELECTIVE");
        $sym2$SCHEMA_REPRESENTATION_COMPLETE_ = SubLObjectFactory.makeSymbol("SCHEMA-REPRESENTATION-COMPLETE?");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-FIELD-INDEXICAL"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("DECODING"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-INDEXICAL"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("ENCODING"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PS"), (SubLObject)SubLObjectFactory.makeSymbol("PF-TUPLES"));
        $kw6$REMOVE_ALL = SubLObjectFactory.makeKeyword("REMOVE-ALL");
        $kw7$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym8$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $kw9$POS = SubLObjectFactory.makeKeyword("POS");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGPOS-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("BOUNDEDNESS"));
        $kw11$FULLY_BOUND = SubLObjectFactory.makeKeyword("FULLY-BOUND");
        $const12$Database_Physical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Database-Physical"));
        $sym13$PHYSICAL_SCHEMA_ENUMERABLE_ = SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMA-ENUMERABLE?");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELECT-WHERE-SETS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("FROM-EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("WHERE-EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("EVAL-CONDITIONS"));
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELECT-SET"), (SubLObject)SubLObjectFactory.makeSymbol("WHERE-SET"));
        $kw16$ONLY_REMOVE = SubLObjectFactory.makeKeyword("ONLY-REMOVE");
        $float17$0_1 = (SubLFloat)SubLObjectFactory.makeDouble(0.1);
        $str18$cost_est_sampling = SubLObjectFactory.makeString("cost_est_sampling");
        $int19$100 = SubLObjectFactory.makeInteger(100);
        $const20$resultSetCardinalityWithConstrain = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultSetCardinalityWithConstraints"));
        $const21$resultSetCardinality = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultSetCardinality"));
        $kw22$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw23$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const24$PostgreSQL = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PostgreSQL"));
        $const25$MySQL_TheProgram = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MySQL-TheProgram"));
        $const26$OracleDatabaseServer_TheProgram = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OracleDatabaseServer-TheProgram"));
        $str27$Continue_without_this_knowledge_s = SubLObjectFactory.makeString("Continue without this knowledge source.");
        $str28$Cannot_gather_the_cost_estimates_ = SubLObjectFactory.makeString("Cannot gather the cost estimates for the knowledge source ~A because the SQL flavor ~A is not currently supported by this functionality");
        $sym29$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str30$select_avg_sksi_cost_est_count__f = SubLObjectFactory.makeString("select avg(sksi_cost_est.count) from (select count(distinct ");
        $str31$__ = SubLObjectFactory.makeString(") ");
        $str32$count_ = SubLObjectFactory.makeString("count ");
        $str33$ = SubLObjectFactory.makeString("");
        $str34$from_ = SubLObjectFactory.makeString("from ");
        $str35$_where_ = SubLObjectFactory.makeString(" where ");
        $str36$_group_by_ = SubLObjectFactory.makeString(" group by ");
        $str37$as = SubLObjectFactory.makeString("as");
        $str38$_sksi_cost_est = SubLObjectFactory.makeString(" sksi_cost_est");
        $str39$drop_table_if_exists_sksi_cost_es = SubLObjectFactory.makeString("drop table if exists sksi_cost_est");
        $str40$create_temporary_table_sksi_cost_ = SubLObjectFactory.makeString("create temporary table sksi_cost_est ");
        $str41$select_count_distinct_ = SubLObjectFactory.makeString("select count(distinct ");
        $str42$__as_cost_est_count_from_ = SubLObjectFactory.makeString(") as cost_est_count from ");
        $str43$select_avg_cost_est_count__from_s = SubLObjectFactory.makeString("select avg(cost_est_count) from sksi_cost_est");
        $str44$select_count____from_ = SubLObjectFactory.makeString("select count(*) from ");
        $str45$create_view_ = SubLObjectFactory.makeString("create view ");
        $str46$_as_select___from_ = SubLObjectFactory.makeString(" as select * from ");
        $str47$_sample_ = SubLObjectFactory.makeString(" sample(");
        $str48$_ = SubLObjectFactory.makeString(")");
        $str49$create_or_replace_view_ = SubLObjectFactory.makeString("create or replace view ");
        $str50$_order_by_ = SubLObjectFactory.makeString(" order by ");
        $str51$random__ = SubLObjectFactory.makeString("random()");
        $str52$rand__ = SubLObjectFactory.makeString("rand()");
        $str53$_limit_ = SubLObjectFactory.makeString(" limit ");
        $str54$drop_view_ = SubLObjectFactory.makeString("drop view ");
        $sym55$PF_ALIAS_FN_NAUT_P = SubLObjectFactory.makeSymbol("PF-ALIAS-FN-NAUT-P");
        $str56$concat_ws______ = SubLObjectFactory.makeString("concat_ws(' ', ");
        $str57$___________ = SubLObjectFactory.makeString(" || ' ' || ");
        $str58$__ = SubLObjectFactory.makeString(", ");
        $list59 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MySQL-TheProgram")));
        $sym60$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $str61$_cast_ = SubLObjectFactory.makeString(" cast(");
        $str62$_as_text_ = SubLObjectFactory.makeString(" as text)");
        $str63$_ = SubLObjectFactory.makeString("\"");
        $str64$_ = SubLObjectFactory.makeString(".");
        $sym65$ALPHA_CHAR_IN_CAP_ = SubLObjectFactory.makeSymbol("ALPHA-CHAR-IN-CAP?");
        $const66$meaningSentencePredicateForSchema = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("meaningSentencePredicateForSchema"));
        $sym67$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str68$___A__ = SubLObjectFactory.makeString("~&~A: ");
        $str69$SKIPPED__ignored_ = SubLObjectFactory.makeString("SKIPPED (ignored)");
        $const70$ExpandedGraphConcept = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpandedGraphConcept"));
        $str71$SKIPPED__expanded_ = SubLObjectFactory.makeString("SKIPPED (expanded)");
        $const72$CCFDemographicProperty = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCFDemographicProperty"));
        $str73$SKIPPED__demographic_property_ = SubLObjectFactory.makeString("SKIPPED (demographic property)");
        $str74$__ = SubLObjectFactory.makeString("~%");
        $str75$ERROR___A__ = SubLObjectFactory.makeString("ERROR: ~A~%");
        $list76 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_cost_estimates.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)sksi_cost_estimates.TWO_INTEGER));
        $int77$1000 = SubLObjectFactory.makeInteger(1000);
        $str78$Could_not_find_logical_fields_for = SubLObjectFactory.makeString("Could not find logical fields for ~A");
        $sym79$_NUM = SubLObjectFactory.makeSymbol("?NUM");
        $const80$logicalResultSetCardinality = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalResultSetCardinality"));
        $const81$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $str82$__A_ = SubLObjectFactory.makeString(" ~A:");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-TERM1"));
        $str84$Zero_count_for__A__A__A = SubLObjectFactory.makeString("Zero count for ~A ~A ~A");
        $str85$_A = SubLObjectFactory.makeString("~A");
        $const86$CCF_SDB_RDFType_LS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCF-SDB-RDFType-LS"));
        $const87$CCF_SDB_KS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCF-SDB-KS"));
        $list88 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalFieldFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCF-SDB-RDFType-LS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCFOWLInstance")), (SubLObject)sksi_cost_estimates.ONE_INTEGER);
        $list89 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalFieldFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCF-SDB-RDFType-LS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCFOWLClass")), (SubLObject)sksi_cost_estimates.ONE_INTEGER);
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM-INFO-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE1"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE2"));
        $list91 = ConsesLow.list((SubLObject)Characters.CHAR_hash);
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM-JUNK"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-STRING"));
        $str93$ptrec_ = SubLObjectFactory.makeString("ptrec:");
        $const94$SchemaObjectFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SchemaObjectFn"));
        $const95$CCF_SDB_RDFType_CMLS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCF-SDB-RDFType-CMLS"));
        $kw96$DECODE = SubLObjectFactory.makeKeyword("DECODE");
        $const97$CCF_SDB_SDBMySQLExportStore_Cyc_K = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCF-SDB-SDBMySQLExportStore-Cyc-KS"));
        $const98$logicalResultSetCardinalityWRTVal = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalResultSetCardinalityWRTValue"));
        $str99$_A__ = SubLObjectFactory.makeString("~A~%");
        $const100$CCFRDF_TypeOWLClass = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCFRDF-TypeOWLClass"));
        $const101$LogicalFieldFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LogicalFieldFn"));
        $list102 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCFOWLInstance")), (SubLObject)sksi_cost_estimates.ONE_INTEGER);
        $list103 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCFOWLClass")), (SubLObject)sksi_cost_estimates.ONE_INTEGER);
        $const104$ExpandedGraphRDF_TypeCCFOWLClass = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExpandedGraphRDF-TypeCCFOWLClass"));
        $sym105$_ = SubLObjectFactory.makeSymbol("+");
        $int106$1000000 = SubLObjectFactory.makeInteger(1000000);
        $str107$Skipping__A_since_current_cost_hi = SubLObjectFactory.makeString("Skipping ~A since current cost high: ~A~%");
        $sym108$_X = SubLObjectFactory.makeSymbol("?X");
        $const109$rdf_type = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rdf-type"));
        $const110$CCF_CAE_QueryMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCF-CAE-QueryMt"));
    }
}

/*

	Total time: 1477 ms
	
*/