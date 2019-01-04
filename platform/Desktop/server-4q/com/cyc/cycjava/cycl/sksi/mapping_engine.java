package com.cyc.cycjava.cycl.sksi;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.genls;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class mapping_engine extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.mapping_engine";
    public static final String myFingerPrint = "dfb46848a3006be11fbf10cd2efc0c6c3af34bfacc95dc3d7fb45396bdafb468";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 1384L)
    private static SubLSymbol $semantic_etl_table_merge_methods$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 42800L)
    private static SubLSymbol $date_genls_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 43356L)
    private static SubLSymbol $db_fusion_column_union_coverage_minumum$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 43622L)
    private static SubLSymbol $db_fusion_column_union_tf_idf_minimum$;
    private static final SubLSymbol $sym0$SEMANTICS_P;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$SEMANTIC_ETL_IMPROVE_OUTPUT_SPEC_EXTERNAL;
    private static final SubLString $str3$not_exactly_two_databases__a_in_o;
    private static final SubLString $str4$_id;
    private static final SubLString $str5$int;
    private static final SubLList $list6;
    private static final SubLFloat $float7$0_1;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$_;
    private static final SubLSymbol $sym10$FIRST_THIRD_GENERALITY_ESTIMATE;
    private static final SubLSymbol $sym11$POSSIBLE_CORRESPONDENCE_CONTAINS_EQUAL_JUSTIFICATION;
    private static final SubLSymbol $sym12$UNAMBIGUOUS_FROM_COLUMN;
    private static final SubLSymbol $kw13$EQUAL;
    private static final SubLSymbol $sym14$SECOND;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$EXTRACT_ADDED_COLUMN;
    private static final SubLSymbol $kw17$COLUMN_NAMED;
    private static final SubLObject $const18$equals;
    private static final SubLSymbol $kw19$COPY;
    private static final SubLSymbol $kw20$UNKNOWN_WEIGHT;
    private static final SubLSymbol $sym21$FIRST;
    private static final SubLString $str22$NEW_TABLE_NAME;
    private static final SubLSymbol $sym23$COLUMN_SEMANTICS_COLUMN_NAME;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLString $str26$;
    private static final SubLString $str27$new_;
    private static final SubLString $str28$___genls____a____a____linkTables_;
    private static final SubLString $str29$More_than_two_source_databases_in;
    private static final SubLObject $const30$InferencePSC;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLSymbol $kw34$GENLS;
    private static final SubLSymbol $sym35$BETTER_COLUMN_MERGE_TARGET;
    private static final SubLSymbol $sym36$DATE_GENLS;
    private static final SubLObject $const37$Date;
    private static final SubLSymbol $sym38$_DATE_GENLS_CACHING_STATE_;
    private static final SubLFloat $float39$0_6;
    private static final SubLFloat $float40$0_15;
    private static final SubLObject $const41$ScalarOrVectorInterval;
    private static final SubLSymbol $sym42$_;
    private static final SubLSymbol $sym43$THIRD;
    private static final SubLFloat $float44$0_67;
    private static final SubLObject $const45$FieldOfStudy;
    private static final SubLFloat $float46$0_33;
    private static final SubLObject $const47$PublishingOrganization;
    private static final SubLString $str48$CS;
    private static final SubLString $str49$Addison_Wesley;
    private static final SubLSymbol $sym50$C_SEMANT_COLUMN_NAME;
    private static final SubLSymbol $sym51$CAR;
    private static final SubLList $list52;
    private static final SubLString $str53$Need_to_move_data_to__A_to_satisf;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 876L)
    public static SubLObject semantic_etl_compute_output_spec(final SubLObject semantics1, final SubLObject semantics2, final SubLObject target_access_path, SubLObject improveP) {
        if (improveP == mapping_engine.UNPROVIDED) {
            improveP = (SubLObject)mapping_engine.T;
        }
        assert mapping_engine.NIL != semantic_etl_bus.semantics_p(semantics1) : semantics1;
        assert mapping_engine.NIL != semantic_etl_bus.semantics_p(semantics2) : semantics2;
        final SubLObject trivial_output_spec = semantic_etl_bus.new_database_output_spec(semantics1, semantics2, target_access_path);
        final SubLObject os_id = semantic_etl_bus.db_output_spec_id(trivial_output_spec);
        semantic_etl_bus.put_db_output_spec(os_id, trivial_output_spec);
        if (mapping_engine.NIL == improveP) {
            return (SubLObject)ConsesLow.list(trivial_output_spec);
        }
        return semantic_etl_improve_output_spec(os_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 1676L)
    public static SubLObject semantic_etl_improve_output_spec_external(final SubLObject id) {
        return semantic_etl_improve_output_spec(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 1840L)
    public static SubLObject semantic_etl_improve_output_spec(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject output_spec = semantic_etl_bus.get_db_output_spec(id);
        final SubLObject semantics = semantic_etl_bus.db_output_spec_semantics(output_spec);
        final SubLObject dict = semantic_etl_bus.semant_dict(semantics);
        final SubLObject table_id_pairs = semantic_etl_compute_possible_table_id_pairs(output_spec);
        SubLObject result_output_specs = (SubLObject)ConsesLow.list(output_spec);
        SubLObject cdolist_list_var = mapping_engine.$semantic_etl_table_merge_methods$.getDynamicValue(thread);
        SubLObject merge_method = (SubLObject)mapping_engine.NIL;
        merge_method = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            result_output_specs = Sequences.cconcatenate(Functions.funcall(merge_method, output_spec, dict, table_id_pairs), result_output_specs);
            cdolist_list_var = cdolist_list_var.rest();
            merge_method = cdolist_list_var.first();
        }
        SubLObject modifications = (SubLObject)mapping_engine.NIL;
        SubLObject success = (SubLObject)mapping_engine.NIL;
        try {
            SubLObject cdolist_list_var2 = result_output_specs;
            SubLObject os = (SubLObject)mapping_engine.NIL;
            os = cdolist_list_var2.first();
            while (mapping_engine.NIL != cdolist_list_var2) {
                final SubLObject spec_id = semantic_etl_bus.db_output_spec_id(os);
                modifications = (SubLObject)ConsesLow.cons(spec_id, modifications);
                semantic_etl_bus.put_db_output_spec(spec_id, os);
                cdolist_list_var2 = cdolist_list_var2.rest();
                os = cdolist_list_var2.first();
            }
            success = (SubLObject)mapping_engine.T;
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)mapping_engine.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (mapping_engine.NIL == success) {
                    SubLObject cdolist_list_var3 = modifications;
                    SubLObject modification = (SubLObject)mapping_engine.NIL;
                    modification = cdolist_list_var3.first();
                    while (mapping_engine.NIL != cdolist_list_var3) {
                        semantic_etl_bus.remove_db_output_spec(modification);
                        cdolist_list_var3 = cdolist_list_var3.rest();
                        modification = cdolist_list_var3.first();
                    }
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return Sequences.nreverse(result_output_specs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 3358L)
    public static SubLObject refined_output_spec_abstract_out_common_column(final SubLObject output_spec, final SubLObject dict, final SubLObject table_id_pairs) {
        SubLObject result_output_specs = (SubLObject)mapping_engine.NIL;
        final SubLObject databases = semantic_etl_bus.output_spec_get_access_paths(output_spec);
        final SubLObject tables = semantic_etl_bus.output_spec_get_tables(output_spec);
        SubLObject db1 = databases.first();
        if (!Sequences.length(databases).numE((SubLObject)mapping_engine.TWO_INTEGER)) {
            Errors.error((SubLObject)mapping_engine.$str3$not_exactly_two_databases__a_in_o, databases);
        }
        SubLObject cdolist_list_var = tables;
        SubLObject table1 = (SubLObject)mapping_engine.NIL;
        table1 = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            final SubLObject native_key_columns = semantic_etl_bus.table_semantics_primary_key_columns(table1);
            SubLObject native_key_column = (SubLObject)mapping_engine.NIL;
            final SubLObject content_columns = semantic_etl_bus.table_semantics_content_columns(table1);
            SubLObject content_column = (SubLObject)mapping_engine.NIL;
            final SubLObject column_count = semantic_etl_bus.table_semantics_column_count(table1);
            if (column_count.numE((SubLObject)mapping_engine.TWO_INTEGER) && mapping_engine.NIL != list_utilities.singletonP(native_key_columns) && mapping_engine.NIL != list_utilities.singletonP(content_columns)) {
                native_key_column = native_key_columns.first();
                content_column = content_columns.first();
                db1 = semantic_etl_bus.semant_access_path(semantic_etl_bus.t_semant_source_semantics(table1));
                SubLObject cdolist_list_var_$1 = tables;
                SubLObject table2 = (SubLObject)mapping_engine.NIL;
                table2 = cdolist_list_var_$1.first();
                while (mapping_engine.NIL != cdolist_list_var_$1) {
                    if (!db1.eql(semantic_etl_bus.semant_access_path(semantic_etl_bus.t_semant_source_semantics(table2)))) {
                        SubLObject cdolist_list_var_$2 = semantic_etl_bus.table_semantics_column_semantics_list(table2);
                        SubLObject column = (SubLObject)mapping_engine.NIL;
                        column = cdolist_list_var_$2.first();
                        while (mapping_engine.NIL != cdolist_list_var_$2) {
                            if (mapping_engine.NIL != semantic_etl_bus.content_columnP(column)) {
                                final SubLObject mergeable_result = column_values_mergeable_as(column, content_column, (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED);
                                if (mapping_engine.NIL != mergeable_result) {
                                    final SubLObject new_output_spec = semantic_etl_bus.copy_database_output_spec(output_spec);
                                    final SubLObject expand_column = semantic_etl_bus.output_spec_get_native_column_semantics(new_output_spec, content_column);
                                    final SubLObject id_column = semantic_etl_bus.output_spec_get_native_column_semantics(new_output_spec, native_key_column);
                                    final SubLObject kill_column = semantic_etl_bus.output_spec_get_native_column_semantics(new_output_spec, column);
                                    final SubLObject justification = mergeable_result.first();
                                    result_output_specs = (SubLObject)ConsesLow.cons(merge_columns_by_foreign_key(new_output_spec, id_column, expand_column, kill_column, justification), result_output_specs);
                                }
                            }
                            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                            column = cdolist_list_var_$2.first();
                        }
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    table2 = cdolist_list_var_$1.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            table1 = cdolist_list_var.first();
        }
        return result_output_specs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 6239L)
    public static SubLObject merge_columns_by_foreign_key(final SubLObject output_spec, final SubLObject id_column, final SubLObject expand_column, final SubLObject kill_column, final SubLObject justification) {
        final SubLObject target_table = semantic_etl_bus.c_semant_table_semantics(id_column);
        final SubLObject target_table_name = semantic_etl_bus.t_semant_table_name(target_table);
        final SubLObject source_table = semantic_etl_bus.c_semant_table_semantics(kill_column);
        final SubLObject source_table_name = semantic_etl_bus.t_semant_table_name(source_table);
        final SubLObject expand_column_name = semantic_etl_bus.c_semant_column_name(expand_column);
        final SubLObject kill_column_name = semantic_etl_bus.c_semant_column_name(kill_column);
        final SubLObject id_column_name = semantic_etl_bus.c_semant_column_name(id_column);
        final SubLObject all_column_names = semantic_etl_bus.table_semantics_column_names(source_table);
        final SubLObject new_column_name = string_utilities.uniquify_string_via_set(Sequences.cconcatenate(target_table_name, (SubLObject)mapping_engine.$str4$_id), all_column_names, (SubLObject)mapping_engine.UNPROVIDED);
        final SubLObject semantic_description = semantic_etl_bus.new_column_merger((SubLObject)ConsesLow.list(expand_column, kill_column), expand_column, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(kill_column, expand_column, justification)));
        final SubLObject inner_select = semantic_etl_bus.new_sql_select_from((SubLObject)ConsesLow.list(expand_column_name), (SubLObject)ConsesLow.list(target_table_name), (SubLObject)mapping_engine.NIL);
        final SubLObject outer_select = semantic_etl_bus.new_sql_select_from((SubLObject)ConsesLow.list(kill_column_name), (SubLObject)ConsesLow.list(source_table_name), (SubLObject)ConsesLow.list(semantic_etl_bus.new_sql_not_in(source_table_name, kill_column_name, inner_select)));
        final SubLObject insert = semantic_etl_bus.new_sql_insert_into(target_table_name, (SubLObject)ConsesLow.list(expand_column_name), outer_select);
        semantic_etl_bus.output_spec_append_to_recipe(output_spec, insert);
        final SubLObject constraint_name = semantic_etl_bus.new_foreign_key_constraint_name(source_table_name, kill_column_name);
        final SubLObject fk_constraint = semantic_etl_bus.new_sql_fk_column_constraint(constraint_name, target_table_name, id_column_name);
        final SubLObject add_column = semantic_etl_bus.new_sql_add_column(new_column_name, (SubLObject)mapping_engine.$str5$int, (SubLObject)mapping_engine.FOUR_INTEGER, (SubLObject)ConsesLow.list(fk_constraint));
        final SubLObject alter = semantic_etl_bus.new_sql_alter_table(source_table_name, add_column);
        semantic_etl_bus.output_spec_append_to_recipe(output_spec, alter);
        final SubLObject setting = semantic_etl_bus.new_sql_column_equal(source_table_name, new_column_name, target_table_name, id_column_name);
        final SubLObject condition = semantic_etl_bus.new_sql_column_equal(source_table_name, kill_column_name, target_table_name, expand_column_name);
        final SubLObject update = semantic_etl_bus.new_sql_update(source_table_name, (SubLObject)ConsesLow.list(setting), (SubLObject)ConsesLow.list(condition));
        semantic_etl_bus.output_spec_append_to_recipe(output_spec, update);
        final SubLObject drop_column = semantic_etl_bus.new_sql_drop_column(kill_column_name);
        final SubLObject alter2 = semantic_etl_bus.new_sql_alter_table(source_table_name, drop_column);
        semantic_etl_bus.output_spec_append_to_recipe(output_spec, alter2);
        semantic_etl_bus.output_spec_append_to_semantic_recipe(output_spec, semantic_description);
        semantic_etl_bus.output_spec_synchronize(output_spec);
        return output_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 9251L)
    public static SubLObject refined_output_spec_based_on_possible_genl_tables(final SubLObject output_spec, final SubLObject dict, final SubLObject possible_genl_table_id_pairs) {
        return (SubLObject)mapping_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 9445L)
    public static SubLObject refined_output_spec_outwards_based_on_possible_genl_tables(final SubLObject output_spec, final SubLObject dict, final SubLObject table_id_pairs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_output_specs = (SubLObject)mapping_engine.NIL;
        SubLObject cdolist_list_var = table_id_pairs;
        SubLObject pair = (SubLObject)mapping_engine.NIL;
        pair = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject table1_id = (SubLObject)mapping_engine.NIL;
            SubLObject table2_id = (SubLObject)mapping_engine.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mapping_engine.$list6);
            table1_id = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mapping_engine.$list6);
            table2_id = current.first();
            current = current.rest();
            if (mapping_engine.NIL == current) {
                SubLObject spec_table_semantics = dictionary.dictionary_lookup(dict, table1_id, (SubLObject)mapping_engine.UNPROVIDED);
                SubLObject genl_table_semantics = dictionary.dictionary_lookup(dict, table2_id, (SubLObject)mapping_engine.UNPROVIDED);
                final SubLObject most_specific_table_semantics = more_specific_table_semantics(spec_table_semantics, genl_table_semantics);
                if (mapping_engine.NIL != most_specific_table_semantics) {
                    if (most_specific_table_semantics.eql(genl_table_semantics)) {
                        final SubLObject swap_var = spec_table_semantics;
                        spec_table_semantics = genl_table_semantics;
                        genl_table_semantics = swap_var;
                    }
                    SubLObject cdolist_list_var_$3 = semantic_etl_bus.table_semantics_linked_table_ids(spec_table_semantics);
                    SubLObject table_id_connected_to_spec_table = (SubLObject)mapping_engine.NIL;
                    table_id_connected_to_spec_table = cdolist_list_var_$3.first();
                    while (mapping_engine.NIL != cdolist_list_var_$3) {
                        SubLObject cdolist_list_var_$4 = semantic_etl_bus.table_semantics_linked_table_ids(genl_table_semantics);
                        SubLObject table_id_connected_to_genl_table = (SubLObject)mapping_engine.NIL;
                        table_id_connected_to_genl_table = cdolist_list_var_$4.first();
                        while (mapping_engine.NIL != cdolist_list_var_$4) {
                            final SubLObject table_connected_to_spec_table = dictionary.dictionary_lookup(dict, table_id_connected_to_spec_table, (SubLObject)mapping_engine.UNPROVIDED);
                            final SubLObject table_connected_to_genl_table = dictionary.dictionary_lookup(dict, table_id_connected_to_genl_table, (SubLObject)mapping_engine.UNPROVIDED);
                            if (mapping_engine.NIL != link_tableP(table_connected_to_spec_table) && mapping_engine.NIL != link_tableP(table_connected_to_genl_table)) {
                                SubLObject cdolist_list_var_$5 = semantic_etl_bus.table_semantics_linked_table_ids(table_connected_to_spec_table);
                                SubLObject table_id_connected_to_spec_link_table = (SubLObject)mapping_engine.NIL;
                                table_id_connected_to_spec_link_table = cdolist_list_var_$5.first();
                                while (mapping_engine.NIL != cdolist_list_var_$5) {
                                    SubLObject cdolist_list_var_$6 = semantic_etl_bus.table_semantics_linked_table_ids(table_connected_to_genl_table);
                                    SubLObject table_id_connected_to_genl_link_table = (SubLObject)mapping_engine.NIL;
                                    table_id_connected_to_genl_link_table = cdolist_list_var_$6.first();
                                    while (mapping_engine.NIL != cdolist_list_var_$6) {
                                        final SubLObject table_connected_to_spec_link_table = dictionary.dictionary_lookup(dict, table_id_connected_to_spec_link_table, (SubLObject)mapping_engine.UNPROVIDED);
                                        final SubLObject table_connected_to_genl_link_table = dictionary.dictionary_lookup(dict, table_id_connected_to_genl_link_table, (SubLObject)mapping_engine.UNPROVIDED);
                                        if (!table_connected_to_spec_link_table.eql(table_connected_to_genl_link_table) && !table_connected_to_spec_link_table.eql(spec_table_semantics) && !table_connected_to_genl_link_table.eql(genl_table_semantics) && table_data_overlap_ratio(table_connected_to_spec_link_table, table_connected_to_genl_link_table).numG((SubLObject)mapping_engine.$float7$0_1)) {
                                            thread.resetMultipleValues();
                                            final SubLObject spec_column_semantics = columns_with_best_overlap(table_connected_to_spec_link_table, table_connected_to_genl_link_table);
                                            final SubLObject genl_column_semantics = thread.secondMultipleValue();
                                            final SubLObject justification = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            possibly_debug_refine_output_spec_outwards_based_on_possible_genl_tables(spec_table_semantics, genl_table_semantics, table_connected_to_spec_table, table_connected_to_genl_table, table_connected_to_spec_link_table, table_connected_to_genl_link_table, spec_column_semantics, genl_column_semantics);
                                            final SubLObject new_output_spec = semantic_etl_bus.copy_database_output_spec(output_spec);
                                            final SubLObject new_genl_column_semantics = semantic_etl_bus.output_spec_get_native_column_semantics(new_output_spec, genl_column_semantics);
                                            final SubLObject new_spec_column_semantics = semantic_etl_bus.output_spec_get_native_column_semantics(new_output_spec, spec_column_semantics);
                                            result_output_specs = (SubLObject)ConsesLow.cons(merge_mappings_wrt_column_semantics(new_output_spec, new_genl_column_semantics, new_spec_column_semantics, justification), result_output_specs);
                                        }
                                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                                        table_id_connected_to_genl_link_table = cdolist_list_var_$6.first();
                                    }
                                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                    table_id_connected_to_spec_link_table = cdolist_list_var_$5.first();
                                }
                            }
                            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                            table_id_connected_to_genl_table = cdolist_list_var_$4.first();
                        }
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        table_id_connected_to_spec_table = cdolist_list_var_$3.first();
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)mapping_engine.$list6);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return result_output_specs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 12820L)
    public static SubLObject refined_output_spec_merge_equivalent_tables(final SubLObject output_spec, final SubLObject dict, final SubLObject table_id_pairs) {
        SubLObject result_output_specs = (SubLObject)mapping_engine.NIL;
        SubLObject cdolist_list_var = table_id_pairs;
        SubLObject pair = (SubLObject)mapping_engine.NIL;
        pair = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            final SubLObject table1 = dictionary.dictionary_lookup(dict, pair.first(), (SubLObject)mapping_engine.UNPROVIDED);
            final SubLObject table2 = dictionary.dictionary_lookup(dict, conses_high.second(pair), (SubLObject)mapping_engine.UNPROVIDED);
            final SubLObject keep_table = tables_mergeable_into(table1, table2, (SubLObject)mapping_engine.UNPROVIDED);
            final SubLObject kill_table = (SubLObject)((mapping_engine.NIL != keep_table) ? (keep_table.eql(table1) ? table2 : table1) : mapping_engine.NIL);
            if (mapping_engine.NIL != keep_table && mapping_engine.NIL != list_utilities.lengthE(semantic_etl_bus.table_semantics_primary_key_columns(keep_table), (SubLObject)mapping_engine.ONE_INTEGER, (SubLObject)mapping_engine.UNPROVIDED)) {
                final SubLObject column_correspondence_list = find_column_correspondences(kill_table, keep_table);
                final SubLObject new_output_spec = semantic_etl_bus.copy_database_output_spec(output_spec);
                final SubLObject new_keep_table = semantic_etl_bus.output_spec_get_table_named(new_output_spec, semantic_etl_bus.table_semantics_table_name(keep_table));
                final SubLObject new_kill_table = semantic_etl_bus.output_spec_get_table_named(new_output_spec, semantic_etl_bus.table_semantics_table_name(kill_table));
                final SubLObject new_column_correspondence_list = get_new_column_correspondence_list(new_kill_table, new_keep_table, column_correspondence_list);
                if (mapping_engine.NIL != new_column_correspondence_list && mapping_engine.NIL != columns_have_same_foreign_key_constraints(new_column_correspondence_list)) {
                    result_output_specs = (SubLObject)ConsesLow.cons(merge_tables(new_output_spec, new_keep_table, new_kill_table, new_column_correspondence_list), result_output_specs);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return result_output_specs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 14910L)
    public static SubLObject columns_have_same_foreign_key_constraints(final SubLObject column_correspondence_list) {
        SubLObject failP = (SubLObject)mapping_engine.NIL;
        if (mapping_engine.NIL == failP) {
            SubLObject csome_list_var = column_correspondence_list;
            SubLObject correspondence = (SubLObject)mapping_engine.NIL;
            correspondence = csome_list_var.first();
            while (mapping_engine.NIL == failP && mapping_engine.NIL != csome_list_var) {
                SubLObject current;
                final SubLObject datum = current = correspondence;
                SubLObject from_col = (SubLObject)mapping_engine.NIL;
                SubLObject to_col = (SubLObject)mapping_engine.NIL;
                SubLObject type = (SubLObject)mapping_engine.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mapping_engine.$list8);
                from_col = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mapping_engine.$list8);
                to_col = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mapping_engine.$list8);
                type = current.first();
                current = current.rest();
                if (mapping_engine.NIL == current) {
                    final SubLObject constraining_column = semantic_etl_bus.column_semantics_foreign_key_constraint_constraining_column(to_col);
                    final SubLObject constraining_table = (SubLObject)((mapping_engine.NIL != constraining_column) ? semantic_etl_bus.column_semantics_table_semantics(constraining_column) : mapping_engine.NIL);
                    final SubLObject content_columns = (SubLObject)((mapping_engine.NIL != constraining_table) ? semantic_etl_bus.table_semantics_content_columns(constraining_table) : mapping_engine.NIL);
                    if (!semantic_etl_bus.column_semantics_foreign_key_constraint_constraining_column(from_col).eql(semantic_etl_bus.column_semantics_foreign_key_constraint_constraining_column(to_col)) && (mapping_engine.NIL != semantic_etl_bus.column_semantics_foreign_key_constraint(from_col) || mapping_engine.NIL == constraining_column || mapping_engine.NIL == list_utilities.lengthE(content_columns, (SubLObject)mapping_engine.ONE_INTEGER, (SubLObject)mapping_engine.UNPROVIDED) || !content_columns.first().eql(constraining_column))) {
                        failP = (SubLObject)mapping_engine.T;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)mapping_engine.$list8);
                }
                csome_list_var = csome_list_var.rest();
                correspondence = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(mapping_engine.NIL == failP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 15995L)
    public static SubLObject find_column_correspondences(final SubLObject from_table, final SubLObject to_table) {
        SubLObject column_correspondence_list = (SubLObject)mapping_engine.NIL;
        SubLObject column_correspondences_list = (SubLObject)mapping_engine.NIL;
        final SubLObject to_table_columns = semantic_etl_bus.table_semantics_column_semantics_list(to_table);
        final SubLObject from_table_columns = semantic_etl_bus.table_semantics_column_semantics_list(from_table);
        SubLObject from_columns_with_targets = (SubLObject)mapping_engine.NIL;
        SubLObject cdolist_list_var = to_table_columns;
        SubLObject to_column = (SubLObject)mapping_engine.NIL;
        to_column = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            SubLObject to_column_list = (SubLObject)mapping_engine.NIL;
            SubLObject cdolist_list_var_$7 = from_table_columns;
            SubLObject from_column = (SubLObject)mapping_engine.NIL;
            from_column = cdolist_list_var_$7.first();
            while (mapping_engine.NIL != cdolist_list_var_$7) {
                final SubLObject merge_types = columns_mergeable_as(from_column, to_column, (SubLObject)mapping_engine.UNPROVIDED);
                if (mapping_engine.NIL != merge_types) {
                    from_columns_with_targets = (SubLObject)ConsesLow.cons(from_column, from_columns_with_targets);
                    to_column_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(from_column, to_column, merge_types), to_column_list);
                }
                cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                from_column = cdolist_list_var_$7.first();
            }
            if (mapping_engine.NIL != to_column_list) {
                column_correspondences_list = (SubLObject)ConsesLow.cons(Sort.sort(to_column_list, (SubLObject)mapping_engine.$sym9$_, (SubLObject)mapping_engine.$sym10$FIRST_THIRD_GENERALITY_ESTIMATE), column_correspondences_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            to_column = cdolist_list_var.first();
        }
        cdolist_list_var = column_correspondences_list;
        SubLObject column_correspondences = (SubLObject)mapping_engine.NIL;
        column_correspondences = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            if (mapping_engine.NIL != list_utilities.lengthG(column_correspondences, (SubLObject)mapping_engine.ONE_INTEGER, (SubLObject)mapping_engine.UNPROVIDED) && mapping_engine.NIL != possible_correspondences_contains_equal_justification(column_correspondences)) {
                column_correspondences = list_utilities.remove_if_not((SubLObject)mapping_engine.$sym11$POSSIBLE_CORRESPONDENCE_CONTAINS_EQUAL_JUSTIFICATION, column_correspondences, (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED);
            }
            column_correspondence_list = (SubLObject)ConsesLow.cons(column_correspondences, column_correspondence_list);
            cdolist_list_var = cdolist_list_var.rest();
            column_correspondences = cdolist_list_var.first();
        }
        column_correspondences_list = column_correspondence_list;
        column_correspondence_list = (SubLObject)mapping_engine.NIL;
        cdolist_list_var = column_correspondences_list;
        column_correspondences = (SubLObject)mapping_engine.NIL;
        column_correspondences = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            if (mapping_engine.NIL != list_utilities.lengthG(column_correspondences, (SubLObject)mapping_engine.ONE_INTEGER, (SubLObject)mapping_engine.UNPROVIDED)) {
                SubLObject found_one = (SubLObject)mapping_engine.NIL;
                if (mapping_engine.NIL == found_one) {
                    SubLObject csome_list_var = column_correspondences;
                    SubLObject correspondence = (SubLObject)mapping_engine.NIL;
                    correspondence = csome_list_var.first();
                    while (mapping_engine.NIL == found_one && mapping_engine.NIL != csome_list_var) {
                        final SubLObject from_column2 = correspondence.first();
                        if (mapping_engine.NIL == Sequences.find(from_column2, column_correspondences_list, (SubLObject)mapping_engine.EQ, (SubLObject)mapping_engine.$sym12$UNAMBIGUOUS_FROM_COLUMN, (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED)) {
                            column_correspondence_list = (SubLObject)ConsesLow.cons(correspondence, column_correspondence_list);
                            found_one = (SubLObject)mapping_engine.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        correspondence = csome_list_var.first();
                    }
                }
            }
            else {
                column_correspondence_list = (SubLObject)ConsesLow.cons(column_correspondences.first(), column_correspondence_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            column_correspondences = cdolist_list_var.first();
        }
        return column_correspondence_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 18425L)
    public static SubLObject unambiguous_from_column(final SubLObject column_correspondences) {
        if (mapping_engine.NIL != list_utilities.lengthE(column_correspondences, (SubLObject)mapping_engine.ONE_INTEGER, (SubLObject)mapping_engine.UNPROVIDED)) {
            return conses_high.caar(column_correspondences);
        }
        return (SubLObject)mapping_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 18795L)
    public static SubLObject possible_correspondences_contains_equal_justification(final SubLObject justified_correspondences) {
        SubLObject cdolist_list_var = justified_correspondences;
        SubLObject corr = (SubLObject)mapping_engine.NIL;
        corr = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            if (mapping_engine.NIL != possible_correspondence_contains_equal_justification(corr)) {
                return (SubLObject)mapping_engine.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            corr = cdolist_list_var.first();
        }
        return (SubLObject)mapping_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 19038L)
    public static SubLObject possible_correspondence_contains_equal_justification(final SubLObject justified_correspondence) {
        final SubLObject justification = conses_high.third(justified_correspondence);
        return Sequences.find((SubLObject)mapping_engine.$kw13$EQUAL, justification, (SubLObject)mapping_engine.EQ, (SubLObject)mapping_engine.$sym14$SECOND, (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 19247L)
    public static SubLObject first_third_generality_estimate(final SubLObject obj) {
        return cardinality_estimates.generality_estimate(conses_high.third(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 19385L)
    public static SubLObject get_new_column_correspondence_list(final SubLObject table1, final SubLObject table2, final SubLObject old_correspondence_list) {
        SubLObject result = (SubLObject)mapping_engine.NIL;
        SubLObject cdolist_list_var = old_correspondence_list;
        SubLObject column_correspondence = (SubLObject)mapping_engine.NIL;
        column_correspondence = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = column_correspondence;
            SubLObject table1_column = (SubLObject)mapping_engine.NIL;
            SubLObject table2_column = (SubLObject)mapping_engine.NIL;
            SubLObject column_type = (SubLObject)mapping_engine.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mapping_engine.$list15);
            table1_column = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mapping_engine.$list15);
            table2_column = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mapping_engine.$list15);
            column_type = current.first();
            current = current.rest();
            if (mapping_engine.NIL == current) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(semantic_etl_bus.table_semantics_get_column_named(table1, semantic_etl_bus.column_semantics_column_name(table1_column)), semantic_etl_bus.table_semantics_get_column_named(table2, semantic_etl_bus.column_semantics_column_name(table2_column)), column_type), result);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)mapping_engine.$list15);
            }
            cdolist_list_var = cdolist_list_var.rest();
            column_correspondence = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 19914L)
    public static SubLObject merge_tables(final SubLObject output_spec, final SubLObject keep_table_semantics, final SubLObject kill_table_semantics, final SubLObject column_correspondence_list) {
        final SubLObject new_column_definitions = add_new_columns(kill_table_semantics, keep_table_semantics, column_correspondence_list);
        final SubLObject new_column_names = Mapping.mapcar((SubLObject)mapping_engine.$sym16$EXTRACT_ADDED_COLUMN, new_column_definitions);
        final SubLObject ensure_fk_constraints_obeyed = copy_data_to_table_referenced_by_foreign_key(kill_table_semantics, keep_table_semantics, column_correspondence_list);
        final SubLObject copy_non_unifiable_data = copy_non_unifiable_data(kill_table_semantics, keep_table_semantics, column_correspondence_list);
        final SubLObject copy_unifiable_data = copy_unifiable_data(kill_table_semantics, keep_table_semantics, column_correspondence_list);
        final SubLObject update_fkey_constraints = update_fkey_constraints_and_values(keep_table_semantics, kill_table_semantics, column_correspondence_list);
        final SubLObject kill_table = semantic_etl_bus.new_sql_drop_table(semantic_etl_bus.table_semantics_table_name(kill_table_semantics));
        final SubLObject new_correspondence_list = augment_correspondence_list_with_new_columns(column_correspondence_list, new_column_names, kill_table_semantics, keep_table_semantics);
        final SubLObject semantic_description = semantic_etl_bus.new_table_merger((SubLObject)ConsesLow.list(keep_table_semantics, kill_table_semantics), keep_table_semantics, new_correspondence_list);
        final SubLObject kill_table_name = semantic_etl_bus.t_semant_table_name(kill_table_semantics);
        final SubLObject keep_table_name = semantic_etl_bus.t_semant_table_name(keep_table_semantics);
        SubLObject add_clauses = (SubLObject)mapping_engine.NIL;
        SubLObject cdolist_list_var = semantic_etl_bus.table_semantics_column_constraints(kill_table_semantics);
        SubLObject constraint = (SubLObject)mapping_engine.NIL;
        constraint = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            if (mapping_engine.NIL != semantic_etl_bus.foreign_key_constraint_p(constraint)) {
                final SubLObject kill_column = semantic_etl_bus.foreign_key_constraint_constrained_column(constraint);
                final SubLObject kill_column_name = semantic_etl_bus.c_semant_column_name(kill_column);
                final SubLObject constraining_column = semantic_etl_bus.foreign_key_constraint_constraining_column(constraint);
                final SubLObject constraining_column_name = semantic_etl_bus.c_semant_column_name(constraining_column);
                final SubLObject constraining_table = semantic_etl_bus.c_semant_table_semantics(constraining_column);
                final SubLObject constraining_table_name = semantic_etl_bus.t_semant_table_name(constraining_table);
                final SubLObject constraint_name = semantic_etl_bus.foreign_key_constraint_constraint_name(constraint);
                final SubLObject fk_column_constraint = semantic_etl_bus.new_sql_fk_column_constraint(constraint_name, kill_table_name, kill_column_name);
                final SubLObject fk_table_constraint = semantic_etl_bus.new_sql_fk_table_constraint(kill_column_name, fk_column_constraint);
                final SubLObject drop_clause = semantic_etl_bus.new_sql_drop_constraint(fk_table_constraint);
                final SubLObject alter_drop = semantic_etl_bus.new_sql_alter_table(kill_table_name, drop_clause);
                semantic_etl_bus.output_spec_append_to_recipe(output_spec, alter_drop);
                if (mapping_engine.NIL != conses_high.member(kill_column_name, new_column_names, (SubLObject)mapping_engine.EQUAL, (SubLObject)mapping_engine.UNPROVIDED)) {
                    final SubLObject new_constraint_name = semantic_etl_bus.new_foreign_key_constraint_name(keep_table_name, kill_column_name);
                    final SubLObject fk_column_constraint_$8 = semantic_etl_bus.new_sql_fk_column_constraint(new_constraint_name, constraining_table_name, constraining_column_name);
                    final SubLObject fk_table_constraint_$9 = semantic_etl_bus.new_sql_fk_table_constraint(kill_column_name, fk_column_constraint_$8);
                    final SubLObject add_constraint = semantic_etl_bus.new_sql_add_constraint(fk_table_constraint_$9);
                    final SubLObject add_clause = semantic_etl_bus.new_sql_alter_table(keep_table_name, add_constraint);
                    add_clauses = (SubLObject)ConsesLow.cons(add_clause, add_clauses);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        }
        cdolist_list_var = new_column_definitions;
        SubLObject new_column = (SubLObject)mapping_engine.NIL;
        new_column = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            semantic_etl_bus.output_spec_append_to_recipe(output_spec, new_column);
            cdolist_list_var = cdolist_list_var.rest();
            new_column = cdolist_list_var.first();
        }
        cdolist_list_var = Sequences.nreverse(ensure_fk_constraints_obeyed);
        SubLObject statement = (SubLObject)mapping_engine.NIL;
        statement = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            semantic_etl_bus.output_spec_append_to_recipe(output_spec, statement);
            cdolist_list_var = cdolist_list_var.rest();
            statement = cdolist_list_var.first();
        }
        semantic_etl_bus.output_spec_append_to_recipe(output_spec, copy_unifiable_data);
        semantic_etl_bus.output_spec_append_to_recipe(output_spec, copy_non_unifiable_data);
        cdolist_list_var = update_fkey_constraints;
        statement = (SubLObject)mapping_engine.NIL;
        statement = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            semantic_etl_bus.output_spec_append_to_recipe(output_spec, statement);
            cdolist_list_var = cdolist_list_var.rest();
            statement = cdolist_list_var.first();
        }
        semantic_etl_bus.output_spec_append_to_recipe(output_spec, kill_table);
        semantic_etl_bus.output_spec_append_to_semantic_recipe(output_spec, semantic_description);
        cdolist_list_var = add_clauses;
        SubLObject add_clause2 = (SubLObject)mapping_engine.NIL;
        add_clause2 = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            semantic_etl_bus.output_spec_append_to_recipe(output_spec, add_clause2);
            cdolist_list_var = cdolist_list_var.rest();
            add_clause2 = cdolist_list_var.first();
        }
        semantic_etl_bus.output_spec_synchronize(output_spec);
        return output_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 24703L)
    public static SubLObject extract_added_column(final SubLObject sql_alter) {
        final SubLObject action = semantic_etl_bus.sql_alter_table_action(sql_alter);
        final SubLObject column = semantic_etl_bus.sql_add_column_column(action);
        return column;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 24922L)
    public static SubLObject augment_correspondence_list_with_new_columns(final SubLObject column_correspondence_list, final SubLObject new_column_names, final SubLObject kill_table, final SubLObject keep_table) {
        SubLObject new_correspondence_list = conses_high.copy_list(column_correspondence_list);
        SubLObject cdolist_list_var = new_column_names;
        SubLObject new_column = (SubLObject)mapping_engine.NIL;
        new_column = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            new_correspondence_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(semantic_etl_bus.table_semantics_get_column_named(kill_table, new_column), (SubLObject)ConsesLow.list((SubLObject)mapping_engine.$kw17$COLUMN_NAMED, semantic_etl_bus.table_semantics_table_name(keep_table), new_column), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(mapping_engine.$const18$equals, (SubLObject)mapping_engine.$kw19$COPY, (SubLObject)mapping_engine.$kw20$UNKNOWN_WEIGHT))), new_correspondence_list);
            cdolist_list_var = cdolist_list_var.rest();
            new_column = cdolist_list_var.first();
        }
        return new_correspondence_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 25705L)
    public static SubLObject add_new_columns(final SubLObject from_table_semantics, final SubLObject to_table_semantics, final SubLObject column_correspondence_list) {
        SubLObject statements = (SubLObject)mapping_engine.NIL;
        final SubLObject to_table_name = semantic_etl_bus.table_semantics_table_name(to_table_semantics);
        SubLObject cdolist_list_var = semantic_etl_bus.table_semantics_column_semantics_list(from_table_semantics);
        SubLObject column = (SubLObject)mapping_engine.NIL;
        column = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            if (mapping_engine.NIL == conses_high.member(column, column_correspondence_list, (SubLObject)mapping_engine.EQ, (SubLObject)mapping_engine.$sym21$FIRST)) {
                final SubLObject column_name = semantic_etl_bus.column_semantics_column_name(column);
                final SubLObject column_size = semantic_etl_bus.column_semantics_column_size(column);
                final SubLObject column_type = semantic_etl_bus.column_semantics_column_type(column);
                statements = (SubLObject)ConsesLow.cons(semantic_etl_bus.new_sql_add_column_to_table(to_table_name, column_name, column_type, column_size, (SubLObject)mapping_engine.UNPROVIDED), statements);
            }
            cdolist_list_var = cdolist_list_var.rest();
            column = cdolist_list_var.first();
        }
        return statements;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 26519L)
    public static SubLObject copy_non_unifiable_data(final SubLObject from_table, final SubLObject to_table, final SubLObject column_correspondence_list) {
        final SubLObject to_table_name = semantic_etl_bus.table_semantics_table_name(to_table);
        final SubLObject alias_table_name = (SubLObject)mapping_engine.$str22$NEW_TABLE_NAME;
        final SubLObject on_clause = create_correspondence_equal_or_null(semantic_etl_bus.table_semantics_table_name(from_table), alias_table_name, column_correspondence_list);
        final SubLObject select_for_to_table_correspondences = select_for_corresponding_columns(to_table, column_correspondence_list, (SubLObject)mapping_engine.TWO_INTEGER);
        final SubLObject select_for_from_table_corresponces = select_for_corresponding_columns(from_table, column_correspondence_list, (SubLObject)mapping_engine.ONE_INTEGER);
        final SubLObject except = semantic_etl_bus.new_sql_except(select_for_from_table_corresponces, select_for_to_table_correspondences);
        final SubLObject alias = semantic_etl_bus.new_sql_alias(except, alias_table_name);
        final SubLObject select_all_from_from_table = select_all_from_table(from_table);
        final SubLObject inner_join = semantic_etl_bus.new_sql_inner_join(select_all_from_from_table, alias, on_clause);
        final SubLObject insert = semantic_etl_bus.new_sql_insert_into(to_table_name, column_names_with_correspondences_substituted(from_table, column_correspondence_list, (SubLObject)mapping_engine.TWO_INTEGER), inner_join);
        return insert;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 27707L)
    public static SubLObject copy_unifiable_data(final SubLObject from_table, final SubLObject to_table, final SubLObject column_correspondence_list) {
        final SubLObject to_table_name = semantic_etl_bus.table_semantics_table_name(to_table);
        final SubLObject from_table_name = semantic_etl_bus.table_semantics_table_name(from_table);
        final SubLObject where_clause = create_correspondence_equal_or_null(from_table_name, to_table_name, column_correspondence_list);
        final SubLObject insert_setting = create_non_corresponding_insert_setting(from_table, column_correspondence_list, (SubLObject)mapping_engine.ONE_INTEGER);
        final SubLObject insert = semantic_etl_bus.new_sql_update(to_table_name, insert_setting, (SubLObject)ConsesLow.list(where_clause));
        return insert;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 28411L)
    public static SubLObject select_for_corresponding_columns(final SubLObject table_1, final SubLObject correspondence_list, final SubLObject correspondence_arg) {
        final SubLObject table_name = semantic_etl_bus.table_semantics_table_name(table_1);
        final SubLObject column_finder_fn = (SubLObject)(correspondence_arg.eql((SubLObject)mapping_engine.ONE_INTEGER) ? mapping_engine.$sym21$FIRST : mapping_engine.$sym14$SECOND);
        final SubLObject column_names = Mapping.mapcar((SubLObject)mapping_engine.$sym23$COLUMN_SEMANTICS_COLUMN_NAME, Mapping.mapcar(column_finder_fn, correspondence_list));
        final SubLObject result = semantic_etl_bus.new_sql_select_from(column_names, (SubLObject)ConsesLow.list(table_name), (SubLObject)mapping_engine.NIL);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 28827L)
    public static SubLObject column_names_with_correspondences_substituted(final SubLObject table, final SubLObject correspondence_list, final SubLObject substitution_argnum) {
        return Mapping.mapcar((SubLObject)mapping_engine.$sym23$COLUMN_SEMANTICS_COLUMN_NAME, columns_with_correspondences_substituted(table, correspondence_list, substitution_argnum));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 29084L)
    public static SubLObject columns_with_correspondences_substituted(final SubLObject table, final SubLObject correspondences, final SubLObject substitution_argnum) {
        SubLObject columns = semantic_etl_bus.table_semantics_column_semantics_list(table);
        SubLObject cdolist_list_var = correspondences;
        SubLObject correspondence = (SubLObject)mapping_engine.NIL;
        correspondence = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = correspondence;
            SubLObject col_1 = (SubLObject)mapping_engine.NIL;
            SubLObject col_2 = (SubLObject)mapping_engine.NIL;
            SubLObject type = (SubLObject)mapping_engine.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mapping_engine.$list24);
            col_1 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mapping_engine.$list24);
            col_2 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mapping_engine.$list24);
            type = current.first();
            current = current.rest();
            if (mapping_engine.NIL == current) {
                if (substitution_argnum.eql((SubLObject)mapping_engine.ONE_INTEGER)) {
                    columns = conses_high.subst(col_1, col_2, columns, (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED);
                }
                else {
                    columns = conses_high.subst(col_2, col_1, columns, (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)mapping_engine.$list24);
            }
            cdolist_list_var = cdolist_list_var.rest();
            correspondence = cdolist_list_var.first();
        }
        return columns;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 29715L)
    public static SubLObject create_correspondence_equal_or_null(final SubLObject table_1_name, final SubLObject table_2_name, final SubLObject correspondence_list) {
        SubLObject equal_or_nulls = (SubLObject)mapping_engine.NIL;
        SubLObject cdolist_list_var = correspondence_list;
        SubLObject correspondence = (SubLObject)mapping_engine.NIL;
        correspondence = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = correspondence;
            SubLObject table_1_col = (SubLObject)mapping_engine.NIL;
            SubLObject table_2_col = (SubLObject)mapping_engine.NIL;
            SubLObject type = (SubLObject)mapping_engine.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mapping_engine.$list25);
            table_1_col = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mapping_engine.$list25);
            table_2_col = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mapping_engine.$list25);
            type = current.first();
            current = current.rest();
            if (mapping_engine.NIL == current) {
                final SubLObject table_1_col_name = semantic_etl_bus.column_semantics_column_name(table_1_col);
                final SubLObject table_2_col_name = semantic_etl_bus.column_semantics_column_name(table_2_col);
                final SubLObject table_1_null = semantic_etl_bus.new_sql_is_null(table_1_name, table_1_col_name);
                final SubLObject table_2_null = semantic_etl_bus.new_sql_is_null(table_2_name, table_2_col_name);
                final SubLObject tables_equal = semantic_etl_bus.new_sql_column_equal(table_1_name, table_1_col_name, table_2_name, table_2_col_name);
                final SubLObject both_null = semantic_etl_bus.new_sql_conjunction((SubLObject)ConsesLow.list(table_1_null, table_2_null));
                final SubLObject equal_or_null = semantic_etl_bus.new_sql_disjunction((SubLObject)ConsesLow.list(tables_equal, both_null));
                equal_or_nulls = (SubLObject)ConsesLow.cons(equal_or_null, equal_or_nulls);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)mapping_engine.$list25);
            }
            cdolist_list_var = cdolist_list_var.rest();
            correspondence = cdolist_list_var.first();
        }
        if (mapping_engine.NIL != list_utilities.singletonP(equal_or_nulls)) {
            return equal_or_nulls.first();
        }
        return semantic_etl_bus.new_sql_conjunction(equal_or_nulls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 30702L)
    public static SubLObject create_non_corresponding_insert_setting(final SubLObject from_table, final SubLObject correspondence_list, final SubLObject given_table_arg) {
        SubLObject v_equals = (SubLObject)mapping_engine.NIL;
        final SubLObject from_table_arg_key = (SubLObject)(given_table_arg.numE((SubLObject)mapping_engine.ONE_INTEGER) ? mapping_engine.$sym21$FIRST : mapping_engine.$sym14$SECOND);
        SubLObject cdolist_list_var = semantic_etl_bus.table_semantics_column_semantics_list(from_table);
        SubLObject column = (SubLObject)mapping_engine.NIL;
        column = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            if (mapping_engine.NIL == subl_promotions.memberP(column, correspondence_list, (SubLObject)mapping_engine.EQ, from_table_arg_key)) {
                final SubLObject from_col_name = semantic_etl_bus.column_semantics_column_name(column);
                final SubLObject table_2_name = (SubLObject)mapping_engine.$str26$;
                final SubLObject from_table_name = semantic_etl_bus.table_semantics_table_name(from_table);
                final SubLObject tables_equal = semantic_etl_bus.new_sql_column_equal(table_2_name, from_col_name, from_table_name, from_col_name);
                v_equals = (SubLObject)ConsesLow.cons(tables_equal, v_equals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            column = cdolist_list_var.first();
        }
        return v_equals;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 31333L)
    public static SubLObject update_fkey_constraints_and_values(final SubLObject keep_table_semantics, final SubLObject kill_table_semantics, final SubLObject column_correspondence_list) {
        SubLObject statements = (SubLObject)mapping_engine.NIL;
        SubLObject cdolist_list_var = semantic_etl_bus.table_semantics_pointed_to_by_tables(kill_table_semantics);
        SubLObject table_pointing_to_kill_table = (SubLObject)mapping_engine.NIL;
        table_pointing_to_kill_table = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$10 = semantic_etl_bus.table_semantics_column_constraints(table_pointing_to_kill_table);
            SubLObject constraint = (SubLObject)mapping_engine.NIL;
            constraint = cdolist_list_var_$10.first();
            while (mapping_engine.NIL != cdolist_list_var_$10) {
                if (mapping_engine.NIL != semantic_etl_bus.foreign_key_constraint_p(constraint) && kill_table_semantics.eql(semantic_etl_bus.foreign_key_constraint_constraining_table(constraint))) {
                    final SubLObject constraint_name = semantic_etl_bus.foreign_key_constraint_constraint_name(constraint);
                    final SubLObject constrained_table = semantic_etl_bus.foreign_key_constraint_constrained_table(constraint);
                    final SubLObject constrained_table_name = semantic_etl_bus.table_semantics_table_name(constrained_table);
                    final SubLObject constrained_column = semantic_etl_bus.foreign_key_constraint_constrained_column(constraint);
                    final SubLObject constrained_column_name = semantic_etl_bus.column_semantics_column_name(constrained_column);
                    final SubLObject column_constraint = semantic_etl_bus.new_sql_fk_column_constraint(constraint_name, constrained_table_name, constrained_column_name);
                    final SubLObject table_fk_constraint = semantic_etl_bus.new_sql_fk_table_constraint(constrained_column_name, column_constraint);
                    final SubLObject drop_fk = semantic_etl_bus.new_sql_drop_constraint(table_fk_constraint);
                    final SubLObject column_names = semantic_etl_bus.table_semantics_column_names(constrained_table);
                    final SubLObject new_column_name = string_utilities.uniquify_string_via_set(Sequences.cconcatenate((SubLObject)mapping_engine.$str27$new_, constrained_column_name), column_names, (SubLObject)mapping_engine.UNPROVIDED);
                    final SubLObject constraining_column = semantic_etl_bus.foreign_key_constraint_constraining_column(constraint);
                    final SubLObject column_type = semantic_etl_bus.column_semantics_column_type(constraining_column);
                    final SubLObject column_size = semantic_etl_bus.column_semantics_column_size(constraining_column);
                    final SubLObject add_temp_fk_column = semantic_etl_bus.new_sql_add_column(new_column_name, column_type, column_size, (SubLObject)mapping_engine.UNPROVIDED);
                    final SubLObject keep_table_name = semantic_etl_bus.table_semantics_table_name(keep_table_semantics);
                    final SubLObject keep_table_pk_column = semantic_etl_bus.table_semantics_primary_key_columns(keep_table_semantics).first();
                    final SubLObject keep_table_pk_column_name = semantic_etl_bus.column_semantics_column_name(keep_table_pk_column);
                    final SubLObject fk_constraint_name = semantic_etl_bus.new_foreign_key_constraint_name(constrained_table_name, new_column_name);
                    final SubLObject sql_fk = semantic_etl_bus.new_sql_fk_column_constraint(fk_constraint_name, keep_table_name, keep_table_pk_column_name);
                    final SubLObject sql_fk_table_constraint = semantic_etl_bus.new_sql_fk_table_constraint(new_column_name, sql_fk);
                    final SubLObject add_constraint = semantic_etl_bus.new_sql_add_constraint(sql_fk_table_constraint);
                    final SubLObject alter_fk_constraint = semantic_etl_bus.new_sql_alter_table(constrained_table_name, add_constraint);
                    final SubLObject update_settings = (SubLObject)ConsesLow.list(semantic_etl_bus.new_sql_column_equal((SubLObject)mapping_engine.$str26$, new_column_name, keep_table_name, keep_table_pk_column_name));
                    final SubLObject update_where = (SubLObject)ConsesLow.list(semantic_etl_bus.new_sql_column_equal(keep_table_name, constrained_column_name, constrained_table_name, constrained_column_name));
                    final SubLObject drop_fk_column = semantic_etl_bus.new_sql_drop_column(constrained_column_name);
                    final SubLObject rename_fk_column = semantic_etl_bus.new_sql_rename_column(new_column_name, constrained_column_name);
                    statements = (SubLObject)ConsesLow.cons(semantic_etl_bus.new_sql_alter_table(constrained_table_name, drop_fk), statements);
                    statements = (SubLObject)ConsesLow.cons(semantic_etl_bus.new_sql_alter_table(constrained_table_name, add_temp_fk_column), statements);
                    statements = (SubLObject)ConsesLow.cons(alter_fk_constraint, statements);
                    statements = (SubLObject)ConsesLow.cons(semantic_etl_bus.new_sql_update(constrained_table_name, update_settings, update_where), statements);
                    statements = (SubLObject)ConsesLow.cons(semantic_etl_bus.new_sql_alter_table(constrained_table_name, drop_fk_column), statements);
                    statements = (SubLObject)ConsesLow.cons(semantic_etl_bus.new_sql_alter_table(constrained_table_name, rename_fk_column), statements);
                }
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                constraint = cdolist_list_var_$10.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            table_pointing_to_kill_table = cdolist_list_var.first();
        }
        return Sequences.nreverse(statements);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 35812L)
    public static SubLObject column_names_from_correspondence_list(final SubLObject list, final SubLObject list_arg) {
        return Mapping.mapcar((SubLObject)mapping_engine.$sym23$COLUMN_SEMANTICS_COLUMN_NAME, columns_from_correspondence_list(list, list_arg));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 35981L)
    public static SubLObject columns_from_correspondence_list(final SubLObject list, final SubLObject list_arg) {
        return Mapping.mapcar((SubLObject)(list_arg.eql((SubLObject)mapping_engine.ONE_INTEGER) ? mapping_engine.$sym21$FIRST : mapping_engine.$sym14$SECOND), list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 36107L)
    public static SubLObject select_all_from_table(final SubLObject table) {
        final SubLObject column_name_list = Mapping.mapcar((SubLObject)mapping_engine.$sym23$COLUMN_SEMANTICS_COLUMN_NAME, semantic_etl_bus.table_semantics_column_semantics_list(table));
        final SubLObject table_name = semantic_etl_bus.table_semantics_table_name(table);
        final SubLObject select = semantic_etl_bus.new_sql_select_from(column_name_list, (SubLObject)ConsesLow.list(table_name), (SubLObject)mapping_engine.NIL);
        return select;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 36409L)
    public static SubLObject possibly_debug_refine_output_spec_outwards_based_on_possible_genl_tables(final SubLObject spec_table_semantics, final SubLObject genl_table_semantics, final SubLObject table_connected_to_spec_table, final SubLObject table_connected_to_genl_table, final SubLObject table_connected_to_spec_link_table, final SubLObject table_connected_to_genl_link_table, final SubLObject spec_column_semantics, final SubLObject genl_column_semantics) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (mapping_engine.NIL != semantic_etl_bus.$semantic_etl_debugP$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)mapping_engine.$str28$___genls____a____a____linkTables_, new SubLObject[] { spec_table_semantics, genl_table_semantics, table_connected_to_spec_table, table_connected_to_genl_table, table_connected_to_spec_link_table, table_connected_to_genl_link_table, spec_column_semantics, genl_column_semantics });
        }
        return (SubLObject)mapping_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 37092L)
    public static SubLObject semantic_etl_compute_possible_table_id_pairs(final SubLObject output_spec) {
        SubLObject source_semantics_map = (SubLObject)mapping_engine.NIL;
        SubLObject source_semantics = (SubLObject)mapping_engine.NIL;
        SubLObject source_semantics_entry = (SubLObject)mapping_engine.NIL;
        SubLObject cdolist_list_var = semantic_etl_bus.semantics_table_semantics_list(semantic_etl_bus.db_output_spec_semantics(output_spec));
        SubLObject table = (SubLObject)mapping_engine.NIL;
        table = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            source_semantics = semantic_etl_bus.table_semantics_source_semantics(table);
            source_semantics_entry = conses_high.assoc(source_semantics, source_semantics_map, (SubLObject)mapping_engine.EQ, (SubLObject)mapping_engine.UNPROVIDED);
            if (mapping_engine.NIL == source_semantics_entry) {
                source_semantics_entry = (SubLObject)ConsesLow.cons(source_semantics, (SubLObject)mapping_engine.NIL);
                source_semantics_map = (SubLObject)ConsesLow.cons(source_semantics_entry, source_semantics_map);
            }
            ConsesLow.rplacd(source_semantics_entry, (SubLObject)ConsesLow.cons(semantic_etl_bus.table_semantics_table_id(table), source_semantics_entry.rest()));
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        }
        if (!Sequences.length(source_semantics_map).numE((SubLObject)mapping_engine.TWO_INTEGER)) {
            Errors.error((SubLObject)mapping_engine.$str29$More_than_two_source_databases_in, source_semantics_map);
        }
        return list_utilities.cross_products((SubLObject)ConsesLow.list(source_semantics_map.first().rest(), conses_high.second(source_semantics_map).rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 38688L)
    public static SubLObject link_tableP(final SubLObject table_semantics) {
        return Numbers.numE(semantic_etl_bus.table_semantics_column_count(table_semantics), Sequences.length(semantic_etl_bus.table_semantics_linked_table_ids(table_semantics)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 38919L)
    public static SubLObject more_specific_table_semantics(final SubLObject table1_semantics, final SubLObject table2_semantics) {
        final SubLObject more_general_table = tables_mergeable_into(table1_semantics, table2_semantics, (SubLObject)mapping_engine.UNPROVIDED);
        if (more_general_table.eql(table1_semantics)) {
            return table2_semantics;
        }
        if (more_general_table.eql(table2_semantics)) {
            return table1_semantics;
        }
        return (SubLObject)mapping_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 39269L)
    public static SubLObject tables_mergeable_into(final SubLObject table1_semantics, final SubLObject table2_semantics, SubLObject mt) {
        if (mt == mapping_engine.UNPROVIDED) {
            mt = mapping_engine.$const30$InferencePSC;
        }
        if (mapping_engine.NIL != conses_high.intersection(semantic_etl_bus.table_semantics_table_parses(table1_semantics), semantic_etl_bus.table_semantics_table_parses(table2_semantics), (SubLObject)mapping_engine.EQUAL, (SubLObject)mapping_engine.UNPROVIDED)) {
            return table_with_more_constraints(table1_semantics, table2_semantics);
        }
        if (mapping_engine.NIL != genls.any_genl_anyP(semantic_etl_bus.table_semantics_table_parses(table1_semantics), semantic_etl_bus.table_semantics_table_parses(table2_semantics), mt, (SubLObject)mapping_engine.UNPROVIDED)) {
            return table2_semantics;
        }
        if (mapping_engine.NIL != genls.any_genl_anyP(semantic_etl_bus.table_semantics_table_parses(table2_semantics), semantic_etl_bus.table_semantics_table_parses(table1_semantics), mt, (SubLObject)mapping_engine.UNPROVIDED)) {
            return table1_semantics;
        }
        return (SubLObject)mapping_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 39923L)
    public static SubLObject table_with_more_constraints(final SubLObject table1, final SubLObject table2) {
        final SubLObject table1_fk_referenced_by = Sequences.length(semantic_etl_bus.table_semantics_pointed_to_by_tables(table1));
        final SubLObject table2_fk_referenced_by = Sequences.length(semantic_etl_bus.table_semantics_pointed_to_by_tables(table2));
        if (table2_fk_referenced_by.numG(table1_fk_referenced_by)) {
            return table2;
        }
        if (table2_fk_referenced_by.numL(table1_fk_referenced_by)) {
            return table1;
        }
        if (table2_fk_referenced_by.eql(table1_fk_referenced_by) && Sequences.length(semantic_etl_bus.table_semantics_foreign_key_constraints(table1)).numG(Sequences.length(semantic_etl_bus.table_semantics_foreign_key_constraints(table2)))) {
            return table1;
        }
        return (SubLObject)mapping_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 40765L)
    public static SubLObject columns_mergeable_as(final SubLObject column1, final SubLObject column2, SubLObject mt) {
        if (mt == mapping_engine.UNPROVIDED) {
            mt = mapping_engine.$const30$InferencePSC;
        }
        final SubLObject merge_as_from_column_name = more_general_column_interps(column1, column2, mt);
        if (mapping_engine.NIL != merge_as_from_column_name) {
            return merge_as_from_column_name;
        }
        return column_values_mergeable_as(column1, column2, (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 41070L)
    public static SubLObject more_general_column_interps(final SubLObject column1_semantics, final SubLObject column2_semantics, SubLObject mt) {
        if (mt == mapping_engine.UNPROVIDED) {
            mt = mapping_engine.$const30$InferencePSC;
        }
        SubLObject possible_results = (SubLObject)mapping_engine.NIL;
        final SubLObject column1_name = semantic_etl_bus.column_semantics_column_name(column1_semantics);
        final SubLObject column2_name = semantic_etl_bus.column_semantics_column_name(column2_semantics);
        if (column1_name.equal(column2_name)) {
            return (SubLObject)mapping_engine.$list31;
        }
        SubLObject cdolist_list_var = semantic_etl_bus.column_semantics_column_parses(column1_semantics);
        SubLObject column1_interp = (SubLObject)mapping_engine.NIL;
        column1_interp = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$11 = semantic_etl_bus.column_semantics_column_parses(column2_semantics);
            SubLObject column2_interp = (SubLObject)mapping_engine.NIL;
            column2_interp = cdolist_list_var_$11.first();
            while (mapping_engine.NIL != cdolist_list_var_$11) {
                if (column1_interp.equal(column2_interp) && mapping_engine.NIL != allowable_merge_target_typeP(column1_interp, mt)) {
                    final SubLObject item_var = reader.bq_cons(column1_interp, (SubLObject)mapping_engine.$list32);
                    if (mapping_engine.NIL == conses_high.member(item_var, possible_results, (SubLObject)mapping_engine.EQUAL, Symbols.symbol_function((SubLObject)mapping_engine.IDENTITY))) {
                        possible_results = (SubLObject)ConsesLow.cons(item_var, possible_results);
                    }
                }
                else if (mapping_engine.NIL != genls.genlsP(column1_interp, column2_interp, mt, (SubLObject)mapping_engine.UNPROVIDED) && mapping_engine.NIL != allowable_merge_target_typeP(column2_interp, mt)) {
                    final SubLObject item_var = reader.bq_cons(column2_interp, (SubLObject)mapping_engine.$list33);
                    if (mapping_engine.NIL == conses_high.member(item_var, possible_results, (SubLObject)mapping_engine.EQUAL, Symbols.symbol_function((SubLObject)mapping_engine.IDENTITY))) {
                        possible_results = (SubLObject)ConsesLow.cons(item_var, possible_results);
                    }
                }
                else if (mapping_engine.NIL != genls.genlsP(column2_interp, column1_interp, mt, (SubLObject)mapping_engine.UNPROVIDED) && mapping_engine.NIL != allowable_merge_target_typeP(column1_interp, mt)) {
                    final SubLObject item_var = reader.bq_cons(column1_interp, (SubLObject)mapping_engine.$list33);
                    if (mapping_engine.NIL == conses_high.member(item_var, possible_results, (SubLObject)mapping_engine.EQUAL, Symbols.symbol_function((SubLObject)mapping_engine.IDENTITY))) {
                        possible_results = (SubLObject)ConsesLow.cons(item_var, possible_results);
                    }
                }
                cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                column2_interp = cdolist_list_var_$11.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            column1_interp = cdolist_list_var.first();
        }
        if (mapping_engine.NIL != Sequences.find((SubLObject)mapping_engine.$kw34$GENLS, possible_results, (SubLObject)mapping_engine.EQ, (SubLObject)mapping_engine.$sym14$SECOND, (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED) && mapping_engine.NIL != Sequences.find((SubLObject)mapping_engine.$kw13$EQUAL, possible_results, (SubLObject)mapping_engine.EQ, (SubLObject)mapping_engine.$sym14$SECOND, (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED)) {
            possible_results = Sequences.remove((SubLObject)mapping_engine.$kw34$GENLS, possible_results, (SubLObject)mapping_engine.EQ, (SubLObject)mapping_engine.$sym14$SECOND, (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED);
        }
        return Sort.sort(possible_results, (SubLObject)mapping_engine.$sym35$BETTER_COLUMN_MERGE_TARGET, (SubLObject)mapping_engine.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 42691L)
    public static SubLObject allowable_merge_target_typeP(final SubLObject type, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(mapping_engine.NIL == conses_high.member(type, date_genls(mt), (SubLObject)mapping_engine.EQUAL, (SubLObject)mapping_engine.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 42800L)
    public static SubLObject clear_date_genls() {
        final SubLObject cs = mapping_engine.$date_genls_caching_state$.getGlobalValue();
        if (mapping_engine.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)mapping_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 42800L)
    public static SubLObject remove_date_genls(final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(mapping_engine.$date_genls_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(mt), (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 42800L)
    public static SubLObject date_genls_internal(final SubLObject mt) {
        return genls.all_genls(mapping_engine.$const37$Date, mt, (SubLObject)mapping_engine.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 42800L)
    public static SubLObject date_genls(final SubLObject mt) {
        SubLObject caching_state = mapping_engine.$date_genls_caching_state$.getGlobalValue();
        if (mapping_engine.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)mapping_engine.$sym36$DATE_GENLS, (SubLObject)mapping_engine.$sym38$_DATE_GENLS_CACHING_STATE_, (SubLObject)mapping_engine.NIL, (SubLObject)mapping_engine.EQUAL, (SubLObject)mapping_engine.ONE_INTEGER, (SubLObject)mapping_engine.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(date_genls_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, (SubLObject)mapping_engine.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 42884L)
    public static SubLObject better_column_merge_target(final SubLObject obj1, final SubLObject obj2) {
        final SubLObject term1_type = conses_high.second(obj1);
        final SubLObject term1_term = obj1.first();
        final SubLObject term2_type = conses_high.second(obj2);
        final SubLObject term2_term = obj2.first();
        if (term1_type.eql(term2_type) || term1_type.eql(term2_type)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(mapping_engine.NIL == cardinality_estimates.generality_estimateG(term1_term, term2_term));
        }
        if (term1_type == mapping_engine.$kw13$EQUAL && term2_type == mapping_engine.$kw34$GENLS) {
            return (SubLObject)mapping_engine.T;
        }
        return (SubLObject)mapping_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 43843L)
    public static SubLObject column_values_mergeable_as(final SubLObject column1, final SubLObject column2, SubLObject coverage_minimum, SubLObject tf_idf_minimum, SubLObject mt) {
        if (coverage_minimum == mapping_engine.UNPROVIDED) {
            coverage_minimum = mapping_engine.$db_fusion_column_union_coverage_minumum$.getDynamicValue();
        }
        if (tf_idf_minimum == mapping_engine.UNPROVIDED) {
            tf_idf_minimum = mapping_engine.$db_fusion_column_union_tf_idf_minimum$.getDynamicValue();
        }
        if (mt == mapping_engine.UNPROVIDED) {
            mt = mapping_engine.$const30$InferencePSC;
        }
        final SubLObject column1_types = column_types_from_tfXidf(column1);
        final SubLObject column2_types = column_types_from_tfXidf(column2);
        final SubLObject combined_types = combined_column_types(column1, column2);
        SubLObject result = (SubLObject)mapping_engine.NIL;
        SubLObject doneP = (SubLObject)mapping_engine.NIL;
        if (mapping_engine.NIL == doneP) {
            SubLObject csome_list_var = combined_types;
            SubLObject type_struct = (SubLObject)mapping_engine.NIL;
            type_struct = csome_list_var.first();
            while (mapping_engine.NIL == doneP && mapping_engine.NIL != csome_list_var) {
                final SubLObject type = type_struct.first();
                final SubLObject tfidf = conses_high.second(type_struct);
                if (tfidf.numGE(tf_idf_minimum)) {
                    if (mapping_engine.NIL != data_parser.semantic_etl_irrelevant_termP(type)) {
                        doneP = (SubLObject)mapping_engine.T;
                    }
                    else if (mapping_engine.NIL != list_utilities.alist_lookup(column1_types, type, (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED).first() && mapping_engine.NIL != list_utilities.alist_lookup(column2_types, type, (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED).first() && list_utilities.alist_lookup(column1_types, type, (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED).first().numGE(tf_idf_minimum) && list_utilities.alist_lookup(column2_types, type, (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED).first().numGE(tf_idf_minimum) && mapping_engine.NIL != covers_at_least_proportion_of_columnP(type, column1, coverage_minimum) && mapping_engine.NIL != covers_at_least_proportion_of_columnP(type, column2, coverage_minimum) && mapping_engine.NIL == genls.genlsP(type, mapping_engine.$const41$ScalarOrVectorInterval, mt, (SubLObject)mapping_engine.UNPROVIDED) && mapping_engine.NIL != allowable_merge_target_typeP(type, mt)) {
                        result = (SubLObject)ConsesLow.cons(type_struct, result);
                    }
                }
                csome_list_var = csome_list_var.rest();
                type_struct = csome_list_var.first();
            }
        }
        SubLObject temp_results = (SubLObject)mapping_engine.NIL;
        SubLObject cdolist_list_var = result;
        SubLObject result_item = (SubLObject)mapping_engine.NIL;
        result_item = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            temp_results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(result_item.first(), (SubLObject)mapping_engine.$kw34$GENLS, conses_high.second(result_item)), temp_results);
            cdolist_list_var = cdolist_list_var.rest();
            result_item = cdolist_list_var.first();
        }
        return Sort.sort(temp_results, (SubLObject)mapping_engine.$sym42$_, (SubLObject)mapping_engine.$sym43$THIRD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 45798L)
    public static SubLObject combined_column_types(final SubLObject column_1, final SubLObject column_2) {
        SubLObject value_meanings = (SubLObject)mapping_engine.NIL;
        SubLObject cdolist_list_var = (SubLObject)ConsesLow.list(column_1, column_2);
        SubLObject column = (SubLObject)mapping_engine.NIL;
        column = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$12 = semantic_etl_bus.column_semantics_value_semantics_list(column);
            SubLObject value = (SubLObject)mapping_engine.NIL;
            value = cdolist_list_var_$12.first();
            while (mapping_engine.NIL != cdolist_list_var_$12) {
                value_meanings = (SubLObject)ConsesLow.cons(semantic_etl_bus.value_semantics_value_parses(value), value_meanings);
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                value = cdolist_list_var_$12.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            column = cdolist_list_var.first();
        }
        return data_parser.best_types_ordered_by_tfXidf(value_meanings, (SubLObject)mapping_engine.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 46585L)
    public static SubLObject column_types_from_tfXidf(final SubLObject column) {
        SubLObject value_meanings = (SubLObject)mapping_engine.NIL;
        SubLObject cdolist_list_var = semantic_etl_bus.column_semantics_value_semantics_list(column);
        SubLObject value = (SubLObject)mapping_engine.NIL;
        value = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            value_meanings = (SubLObject)ConsesLow.cons(semantic_etl_bus.value_semantics_value_parses(value), value_meanings);
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        }
        return data_parser.best_types_ordered_by_tfXidf(value_meanings, (SubLObject)mapping_engine.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 47284L)
    public static SubLObject covers_at_least_proportion_of_columnP(final SubLObject type, final SubLObject column_semantics, final SubLObject minimum_coverage_proportion) {
        return Numbers.numGE(type_covers_proportion_of_column(type, column_semantics), minimum_coverage_proportion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 47773L)
    public static SubLObject type_covers_proportion_of_column(final SubLObject type, final SubLObject column_semantics) {
        SubLObject covers = (SubLObject)mapping_engine.ZERO_INTEGER;
        SubLObject fails = (SubLObject)mapping_engine.ZERO_INTEGER;
        SubLObject cdolist_list_var = semantic_etl_bus.column_semantics_value_semantics_list(column_semantics);
        SubLObject value_semantics = (SubLObject)mapping_engine.NIL;
        value_semantics = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            if (mapping_engine.NIL != genls.any_specP(type, semantic_etl_bus.value_semantics_value_parses(value_semantics), (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED)) {
                covers = Numbers.add(covers, (SubLObject)mapping_engine.ONE_INTEGER);
            }
            else {
                fails = Numbers.add(fails, (SubLObject)mapping_engine.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            value_semantics = cdolist_list_var.first();
        }
        return Numbers.divide(covers, Numbers.add(covers, fails));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 48295L)
    public static SubLObject table_data_overlap_ratio(final SubLObject table_semantics_1, final SubLObject table_semantics_2) {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)mapping_engine.ZERO_INTEGER), column_overlap_int(table_semantics_1, table_semantics_2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 50071L)
    public static SubLObject columns_with_best_overlap(final SubLObject table_semantics_1, final SubLObject table_semantics_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject max_overlap_ratio = column_overlap_int(table_semantics_1, table_semantics_2);
        final SubLObject column_semantics_1 = thread.secondMultipleValue();
        final SubLObject column_semantics_2 = thread.thirdMultipleValue();
        final SubLObject justification = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return Values.values(column_semantics_1, column_semantics_2, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 50415L)
    public static SubLObject column_overlap_int(final SubLObject table_semantics_1, final SubLObject table_semantics_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject max_overlap_ratio = (SubLObject)mapping_engine.ZERO_INTEGER;
        SubLObject best_column_semantics_1 = (SubLObject)mapping_engine.NIL;
        SubLObject best_column_semantics_2 = (SubLObject)mapping_engine.NIL;
        SubLObject best_justification = (SubLObject)mapping_engine.NIL;
        SubLObject cdolist_list_var = semantic_etl_bus.table_semantics_column_semantics_list(table_semantics_1);
        SubLObject column_semantics_1 = (SubLObject)mapping_engine.NIL;
        column_semantics_1 = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$13 = semantic_etl_bus.table_semantics_column_semantics_list(table_semantics_2);
            SubLObject column_semantics_2 = (SubLObject)mapping_engine.NIL;
            column_semantics_2 = cdolist_list_var_$13.first();
            while (mapping_engine.NIL != cdolist_list_var_$13) {
                thread.resetMultipleValues();
                final SubLObject column_overlap_ratio = column_data_overlap_ratio(column_semantics_1, column_semantics_2);
                final SubLObject justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (column_overlap_ratio.numG(max_overlap_ratio)) {
                    max_overlap_ratio = column_overlap_ratio;
                    best_column_semantics_1 = column_semantics_1;
                    best_column_semantics_2 = column_semantics_2;
                    best_justification = justification;
                }
                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                column_semantics_2 = cdolist_list_var_$13.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            column_semantics_1 = cdolist_list_var.first();
        }
        return Values.values(max_overlap_ratio, best_column_semantics_1, best_column_semantics_2, best_justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 51234L)
    public static SubLObject column_data_overlap_ratio(final SubLObject column_semantics_1, final SubLObject column_semantics_2) {
        if (mapping_engine.NIL != contains_csP(column_semantics_1) && mapping_engine.NIL != contains_csP(column_semantics_2)) {
            return Values.values((SubLObject)mapping_engine.$float44$0_67, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(mapping_engine.$const45$FieldOfStudy, (SubLObject)mapping_engine.$kw34$GENLS, (SubLObject)mapping_engine.$float44$0_67)));
        }
        if (mapping_engine.NIL != contains_addison_wesleyP(column_semantics_1) && mapping_engine.NIL != contains_addison_wesleyP(column_semantics_2)) {
            return Values.values((SubLObject)mapping_engine.$float46$0_33, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(mapping_engine.$const47$PublishingOrganization, (SubLObject)mapping_engine.$kw34$GENLS, (SubLObject)mapping_engine.$float46$0_33)));
        }
        return (SubLObject)mapping_engine.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 51677L)
    public static SubLObject contains_csP(final SubLObject column_semantics) {
        SubLObject cdolist_list_var = semantic_etl_bus.column_semantics_value_semantics_list(column_semantics);
        SubLObject value_semantics = (SubLObject)mapping_engine.NIL;
        value_semantics = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            final SubLObject value = semantic_etl_bus.value_semantics_value(value_semantics);
            if (value.equalp((SubLObject)mapping_engine.$str48$CS)) {
                return (SubLObject)mapping_engine.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value_semantics = cdolist_list_var.first();
        }
        return (SubLObject)mapping_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 51901L)
    public static SubLObject contains_addison_wesleyP(final SubLObject column_semantics) {
        SubLObject cdolist_list_var = semantic_etl_bus.column_semantics_value_semantics_list(column_semantics);
        SubLObject value_semantics = (SubLObject)mapping_engine.NIL;
        value_semantics = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            final SubLObject value = semantic_etl_bus.value_semantics_value(value_semantics);
            if (value.equalp((SubLObject)mapping_engine.$str49$Addison_Wesley)) {
                return (SubLObject)mapping_engine.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value_semantics = cdolist_list_var.first();
        }
        return (SubLObject)mapping_engine.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 52149L)
    public static SubLObject merge_mappings_wrt_column_semantics(final SubLObject output_spec, final SubLObject keep_column, final SubLObject kill_column, final SubLObject justification) {
        final SubLObject keep_table = semantic_etl_bus.c_semant_table_semantics(keep_column);
        final SubLObject keep_table_name = semantic_etl_bus.t_semant_table_name(keep_table);
        final SubLObject keep_column_name = semantic_etl_bus.c_semant_column_name(keep_column);
        final SubLObject kill_table = semantic_etl_bus.c_semant_table_semantics(kill_column);
        final SubLObject kill_table_name = semantic_etl_bus.t_semant_table_name(kill_table);
        final SubLObject kill_column_name = semantic_etl_bus.c_semant_column_name(kill_column);
        final SubLObject move_columns = semantic_etl_bus.uniquify_columns(keep_table, Sequences.remove(kill_column, semantic_etl_bus.t_semant_column_semantics_list(kill_table), (SubLObject)mapping_engine.EQ, (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED, (SubLObject)mapping_engine.UNPROVIDED));
        SubLObject new_kill_column_homes = (SubLObject)mapping_engine.NIL;
        final SubLObject semantic_description = semantic_etl_bus.new_table_merger((SubLObject)ConsesLow.list(keep_table, kill_table), keep_table, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(kill_column, keep_column, justification)));
        SubLObject cdolist_list_var = move_columns;
        SubLObject column = (SubLObject)mapping_engine.NIL;
        column = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            final SubLObject new_column_name = column.first();
            final SubLObject old_column_name = column.rest();
            final SubLObject old_column = semantic_etl_bus.table_semantics_get_column_named(kill_table, old_column_name);
            semantic_etl_bus.output_spec_append_to_recipe(output_spec, semantic_etl_bus.new_sql_alter_table(keep_table_name, semantic_etl_bus.new_sql_add_column(new_column_name, semantic_etl_bus.column_semantics_column_type(old_column), semantic_etl_bus.column_semantics_column_size(old_column), (SubLObject)mapping_engine.UNPROVIDED)));
            new_kill_column_homes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(keep_table_name, new_column_name, kill_table_name, old_column_name), new_kill_column_homes);
            cdolist_list_var = cdolist_list_var.rest();
            column = cdolist_list_var.first();
        }
        cdolist_list_var = move_columns;
        column = (SubLObject)mapping_engine.NIL;
        column = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            semantic_etl_bus.output_spec_append_to_recipe(output_spec, semantic_etl_bus.new_sql_update(keep_table_name, (SubLObject)ConsesLow.list(semantic_etl_bus.new_sql_column_equal(keep_table_name, column.first(), kill_table_name, column.rest())), (SubLObject)ConsesLow.list(semantic_etl_bus.new_sql_column_equal(keep_table_name, keep_column_name, kill_table_name, kill_column_name))));
            cdolist_list_var = cdolist_list_var.rest();
            column = cdolist_list_var.first();
        }
        final SubLObject inner_select = semantic_etl_bus.new_sql_select_from((SubLObject)ConsesLow.list(keep_column_name), (SubLObject)ConsesLow.list(keep_table_name), (SubLObject)mapping_engine.NIL);
        final SubLObject outer_select = semantic_etl_bus.new_sql_select_from(Mapping.mapcar((SubLObject)mapping_engine.$sym50$C_SEMANT_COLUMN_NAME, semantic_etl_bus.t_semant_column_semantics_list(kill_table)), (SubLObject)ConsesLow.list(kill_table_name), (SubLObject)ConsesLow.list(semantic_etl_bus.new_sql_not_in(kill_table_name, kill_column_name, inner_select)));
        final SubLObject insert = semantic_etl_bus.new_sql_insert_into(keep_table_name, ConsesLow.append(Mapping.mapcar((SubLObject)mapping_engine.$sym51$CAR, move_columns), (SubLObject)ConsesLow.list(keep_column_name)), outer_select);
        semantic_etl_bus.output_spec_append_to_recipe(output_spec, insert);
        new_kill_column_homes = (cdolist_list_var = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(keep_table_name, keep_column_name, kill_table_name, kill_column_name), new_kill_column_homes));
        SubLObject entry = (SubLObject)mapping_engine.NIL;
        entry = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            final SubLObject target_table_name = entry.first();
            final SubLObject target_column_name = conses_high.second(entry);
            final SubLObject source_table_name = conses_high.third(entry);
            final SubLObject source_column_name = conses_high.fourth(entry);
            final SubLObject source_table = semantic_etl_bus.semantics_get_table_named(semantic_etl_bus.db_output_spec_semantics(output_spec), source_table_name);
            final SubLObject source_column = semantic_etl_bus.table_semantics_get_column_named(source_table, source_column_name);
            SubLObject cdolist_list_var_$14 = semantic_etl_bus.column_semantics_referencing_foreign_key_constraints(source_column);
            SubLObject constraint = (SubLObject)mapping_engine.NIL;
            constraint = cdolist_list_var_$14.first();
            while (mapping_engine.NIL != cdolist_list_var_$14) {
                final SubLObject constraint_name = semantic_etl_bus.foreign_key_constraint_constraint_name(constraint);
                final SubLObject constrained_column = semantic_etl_bus.foreign_key_constraint_constrained_column(constraint);
                final SubLObject constrained_column_name = semantic_etl_bus.c_semant_column_name(constrained_column);
                final SubLObject constrained_table = semantic_etl_bus.column_semantics_table_semantics(constrained_column);
                final SubLObject constrained_table_name = semantic_etl_bus.table_semantics_table_name(constrained_table);
                final SubLObject drop = semantic_etl_bus.new_sql_fk_column_constraint(constraint_name, constrained_table_name, constrained_column_name);
                final SubLObject table_constraint = semantic_etl_bus.new_sql_fk_table_constraint(constrained_column_name, drop);
                final SubLObject drop_constraint = semantic_etl_bus.new_sql_drop_constraint(table_constraint);
                final SubLObject alter_drop = semantic_etl_bus.new_sql_alter_table(constrained_table_name, drop_constraint);
                final SubLObject new_constraint_name = semantic_etl_bus.new_foreign_key_constraint_name(constrained_table_name, constrained_column_name);
                final SubLObject add = semantic_etl_bus.new_sql_fk_column_constraint(new_constraint_name, target_table_name, target_column_name);
                final SubLObject table_constraint_$15 = semantic_etl_bus.new_sql_fk_table_constraint(constrained_column_name, add);
                final SubLObject add_constraint = semantic_etl_bus.new_sql_add_constraint(table_constraint_$15);
                final SubLObject alter_add = semantic_etl_bus.new_sql_alter_table(constrained_table_name, add_constraint);
                semantic_etl_bus.output_spec_append_to_recipe(output_spec, alter_drop);
                semantic_etl_bus.output_spec_append_to_recipe(output_spec, alter_add);
                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                constraint = cdolist_list_var_$14.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        semantic_etl_bus.output_spec_append_to_recipe(output_spec, semantic_etl_bus.new_sql_drop_table(kill_table_name));
        semantic_etl_bus.output_spec_append_to_semantic_recipe(output_spec, semantic_description);
        semantic_etl_bus.output_spec_synchronize(output_spec);
        return output_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/mapping-engine.lisp", position = 58261L)
    public static SubLObject copy_data_to_table_referenced_by_foreign_key(final SubLObject from_table, final SubLObject to_table, final SubLObject column_correspondence_list) {
        SubLObject commands = (SubLObject)mapping_engine.NIL;
        SubLObject cdolist_list_var = column_correspondence_list;
        SubLObject column_correspondence = (SubLObject)mapping_engine.NIL;
        column_correspondence = cdolist_list_var.first();
        while (mapping_engine.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = column_correspondence;
            SubLObject from_column = (SubLObject)mapping_engine.NIL;
            SubLObject to_column = (SubLObject)mapping_engine.NIL;
            SubLObject justification = (SubLObject)mapping_engine.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mapping_engine.$list52);
            from_column = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mapping_engine.$list52);
            to_column = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mapping_engine.$list52);
            justification = current.first();
            current = current.rest();
            if (mapping_engine.NIL == current) {
                if (mapping_engine.NIL != semantic_etl_bus.column_semantics_foreign_key_constraint(to_column) && mapping_engine.NIL == semantic_etl_bus.column_semantics_foreign_key_constraint(from_column)) {
                    final SubLObject constraining_column = semantic_etl_bus.column_semantics_foreign_key_constraint_constraining_column(to_column);
                    final SubLObject constraining_table = semantic_etl_bus.column_semantics_table_semantics(constraining_column);
                    final SubLObject content_columns = semantic_etl_bus.table_semantics_content_columns(constraining_table);
                    if (mapping_engine.NIL != list_utilities.lengthE(content_columns, (SubLObject)mapping_engine.ONE_INTEGER, (SubLObject)mapping_engine.UNPROVIDED) && content_columns.first().eql(constraining_column)) {
                        final SubLObject from_column_name = semantic_etl_bus.column_semantics_column_name(from_column);
                        final SubLObject from_table_name = semantic_etl_bus.table_semantics_table_name(from_table);
                        final SubLObject constraining_column_name = semantic_etl_bus.column_semantics_column_name(constraining_column);
                        final SubLObject constraining_table_name = semantic_etl_bus.table_semantics_table_name(constraining_table);
                        final SubLObject select1 = semantic_etl_bus.new_sql_select_from((SubLObject)ConsesLow.list(from_column_name), (SubLObject)ConsesLow.list(from_table_name), (SubLObject)mapping_engine.NIL);
                        final SubLObject select2 = semantic_etl_bus.new_sql_select_from((SubLObject)ConsesLow.list(constraining_column_name), (SubLObject)ConsesLow.list(constraining_table_name), (SubLObject)mapping_engine.NIL);
                        final SubLObject except = semantic_etl_bus.new_sql_except(select1, select2);
                        final SubLObject insert = semantic_etl_bus.new_sql_insert_into(constraining_table_name, (SubLObject)ConsesLow.list(constraining_column_name), except);
                        commands = (SubLObject)ConsesLow.cons(insert, commands);
                    }
                    else {
                        Errors.error((SubLObject)mapping_engine.$str53$Need_to_move_data_to__A_to_satisf, constraining_column);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)mapping_engine.$list52);
            }
            cdolist_list_var = cdolist_list_var.rest();
            column_correspondence = cdolist_list_var.first();
        }
        return commands;
    }
    
    public static SubLObject declare_mapping_engine_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "semantic_etl_compute_output_spec", "SEMANTIC-ETL-COMPUTE-OUTPUT-SPEC", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "semantic_etl_improve_output_spec_external", "SEMANTIC-ETL-IMPROVE-OUTPUT-SPEC-EXTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "semantic_etl_improve_output_spec", "SEMANTIC-ETL-IMPROVE-OUTPUT-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "refined_output_spec_abstract_out_common_column", "REFINED-OUTPUT-SPEC-ABSTRACT-OUT-COMMON-COLUMN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "merge_columns_by_foreign_key", "MERGE-COLUMNS-BY-FOREIGN-KEY", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "refined_output_spec_based_on_possible_genl_tables", "REFINED-OUTPUT-SPEC-BASED-ON-POSSIBLE-GENL-TABLES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "refined_output_spec_outwards_based_on_possible_genl_tables", "REFINED-OUTPUT-SPEC-OUTWARDS-BASED-ON-POSSIBLE-GENL-TABLES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "refined_output_spec_merge_equivalent_tables", "REFINED-OUTPUT-SPEC-MERGE-EQUIVALENT-TABLES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "columns_have_same_foreign_key_constraints", "COLUMNS-HAVE-SAME-FOREIGN-KEY-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "find_column_correspondences", "FIND-COLUMN-CORRESPONDENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "unambiguous_from_column", "UNAMBIGUOUS-FROM-COLUMN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "possible_correspondences_contains_equal_justification", "POSSIBLE-CORRESPONDENCES-CONTAINS-EQUAL-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "possible_correspondence_contains_equal_justification", "POSSIBLE-CORRESPONDENCE-CONTAINS-EQUAL-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "first_third_generality_estimate", "FIRST-THIRD-GENERALITY-ESTIMATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "get_new_column_correspondence_list", "GET-NEW-COLUMN-CORRESPONDENCE-LIST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "merge_tables", "MERGE-TABLES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "extract_added_column", "EXTRACT-ADDED-COLUMN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "augment_correspondence_list_with_new_columns", "AUGMENT-CORRESPONDENCE-LIST-WITH-NEW-COLUMNS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "add_new_columns", "ADD-NEW-COLUMNS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "copy_non_unifiable_data", "COPY-NON-UNIFIABLE-DATA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "copy_unifiable_data", "COPY-UNIFIABLE-DATA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "select_for_corresponding_columns", "SELECT-FOR-CORRESPONDING-COLUMNS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "column_names_with_correspondences_substituted", "COLUMN-NAMES-WITH-CORRESPONDENCES-SUBSTITUTED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "columns_with_correspondences_substituted", "COLUMNS-WITH-CORRESPONDENCES-SUBSTITUTED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "create_correspondence_equal_or_null", "CREATE-CORRESPONDENCE-EQUAL-OR-NULL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "create_non_corresponding_insert_setting", "CREATE-NON-CORRESPONDING-INSERT-SETTING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "update_fkey_constraints_and_values", "UPDATE-FKEY-CONSTRAINTS-AND-VALUES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "column_names_from_correspondence_list", "COLUMN-NAMES-FROM-CORRESPONDENCE-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "columns_from_correspondence_list", "COLUMNS-FROM-CORRESPONDENCE-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "select_all_from_table", "SELECT-ALL-FROM-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "possibly_debug_refine_output_spec_outwards_based_on_possible_genl_tables", "POSSIBLY-DEBUG-REFINE-OUTPUT-SPEC-OUTWARDS-BASED-ON-POSSIBLE-GENL-TABLES", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "semantic_etl_compute_possible_table_id_pairs", "SEMANTIC-ETL-COMPUTE-POSSIBLE-TABLE-ID-PAIRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "link_tableP", "LINK-TABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "more_specific_table_semantics", "MORE-SPECIFIC-TABLE-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "tables_mergeable_into", "TABLES-MERGEABLE-INTO", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "table_with_more_constraints", "TABLE-WITH-MORE-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "columns_mergeable_as", "COLUMNS-MERGEABLE-AS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "more_general_column_interps", "MORE-GENERAL-COLUMN-INTERPS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "allowable_merge_target_typeP", "ALLOWABLE-MERGE-TARGET-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "clear_date_genls", "CLEAR-DATE-GENLS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "remove_date_genls", "REMOVE-DATE-GENLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "date_genls_internal", "DATE-GENLS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "date_genls", "DATE-GENLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "better_column_merge_target", "BETTER-COLUMN-MERGE-TARGET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "column_values_mergeable_as", "COLUMN-VALUES-MERGEABLE-AS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "combined_column_types", "COMBINED-COLUMN-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "column_types_from_tfXidf", "COLUMN-TYPES-FROM-TF.IDF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "covers_at_least_proportion_of_columnP", "COVERS-AT-LEAST-PROPORTION-OF-COLUMN?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "type_covers_proportion_of_column", "TYPE-COVERS-PROPORTION-OF-COLUMN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "table_data_overlap_ratio", "TABLE-DATA-OVERLAP-RATIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "columns_with_best_overlap", "COLUMNS-WITH-BEST-OVERLAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "column_overlap_int", "COLUMN-OVERLAP-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "column_data_overlap_ratio", "COLUMN-DATA-OVERLAP-RATIO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "contains_csP", "CONTAINS-CS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "contains_addison_wesleyP", "CONTAINS-ADDISON-WESLEY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "merge_mappings_wrt_column_semantics", "MERGE-MAPPINGS-WRT-COLUMN-SEMANTICS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.mapping_engine", "copy_data_to_table_referenced_by_foreign_key", "COPY-DATA-TO-TABLE-REFERENCED-BY-FOREIGN-KEY", 3, 0, false);
        return (SubLObject)mapping_engine.NIL;
    }
    
    public static SubLObject init_mapping_engine_file() {
        mapping_engine.$semantic_etl_table_merge_methods$ = SubLFiles.defparameter("*SEMANTIC-ETL-TABLE-MERGE-METHODS*", (SubLObject)mapping_engine.$list1);
        mapping_engine.$date_genls_caching_state$ = SubLFiles.deflexical("*DATE-GENLS-CACHING-STATE*", (SubLObject)mapping_engine.NIL);
        mapping_engine.$db_fusion_column_union_coverage_minumum$ = SubLFiles.defparameter("*DB-FUSION-COLUMN-UNION-COVERAGE-MINUMUM*", (SubLObject)mapping_engine.$float39$0_6);
        mapping_engine.$db_fusion_column_union_tf_idf_minimum$ = SubLFiles.defparameter("*DB-FUSION-COLUMN-UNION-TF-IDF-MINIMUM*", (SubLObject)mapping_engine.$float40$0_15);
        return (SubLObject)mapping_engine.NIL;
    }
    
    public static SubLObject setup_mapping_engine_file() {
        access_macros.register_external_symbol((SubLObject)mapping_engine.$sym2$SEMANTIC_ETL_IMPROVE_OUTPUT_SPEC_EXTERNAL);
        memoization_state.note_globally_cached_function((SubLObject)mapping_engine.$sym36$DATE_GENLS);
        return (SubLObject)mapping_engine.NIL;
    }
    
    public void declareFunctions() {
        declare_mapping_engine_file();
    }
    
    public void initializeVariables() {
        init_mapping_engine_file();
    }
    
    public void runTopLevelForms() {
        setup_mapping_engine_file();
    }
    
    static {
        me = (SubLFile)new mapping_engine();
        mapping_engine.$semantic_etl_table_merge_methods$ = null;
        mapping_engine.$date_genls_caching_state$ = null;
        mapping_engine.$db_fusion_column_union_coverage_minumum$ = null;
        mapping_engine.$db_fusion_column_union_tf_idf_minimum$ = null;
        $sym0$SEMANTICS_P = SubLObjectFactory.makeSymbol("SEMANTICS-P");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REFINED-OUTPUT-SPEC-ABSTRACT-OUT-COMMON-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("REFINED-OUTPUT-SPEC-BASED-ON-POSSIBLE-GENL-TABLES"), (SubLObject)SubLObjectFactory.makeSymbol("REFINED-OUTPUT-SPEC-OUTWARDS-BASED-ON-POSSIBLE-GENL-TABLES"), (SubLObject)SubLObjectFactory.makeSymbol("REFINED-OUTPUT-SPEC-MERGE-EQUIVALENT-TABLES"));
        $sym2$SEMANTIC_ETL_IMPROVE_OUTPUT_SPEC_EXTERNAL = SubLObjectFactory.makeSymbol("SEMANTIC-ETL-IMPROVE-OUTPUT-SPEC-EXTERNAL");
        $str3$not_exactly_two_databases__a_in_o = SubLObjectFactory.makeString("not exactly two databases ~a in output-spec");
        $str4$_id = SubLObjectFactory.makeString("_id");
        $str5$int = SubLObjectFactory.makeString("int");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TABLE1-ID"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE2-ID"));
        $float7$0_1 = (SubLFloat)SubLObjectFactory.makeDouble(0.1);
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FROM-COL"), (SubLObject)SubLObjectFactory.makeSymbol("TO-COL"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"));
        $sym9$_ = SubLObjectFactory.makeSymbol("<");
        $sym10$FIRST_THIRD_GENERALITY_ESTIMATE = SubLObjectFactory.makeSymbol("FIRST-THIRD-GENERALITY-ESTIMATE");
        $sym11$POSSIBLE_CORRESPONDENCE_CONTAINS_EQUAL_JUSTIFICATION = SubLObjectFactory.makeSymbol("POSSIBLE-CORRESPONDENCE-CONTAINS-EQUAL-JUSTIFICATION");
        $sym12$UNAMBIGUOUS_FROM_COLUMN = SubLObjectFactory.makeSymbol("UNAMBIGUOUS-FROM-COLUMN");
        $kw13$EQUAL = SubLObjectFactory.makeKeyword("EQUAL");
        $sym14$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TABLE1-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE2-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN-TYPE"));
        $sym16$EXTRACT_ADDED_COLUMN = SubLObjectFactory.makeSymbol("EXTRACT-ADDED-COLUMN");
        $kw17$COLUMN_NAMED = SubLObjectFactory.makeKeyword("COLUMN-NAMED");
        $const18$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $kw19$COPY = SubLObjectFactory.makeKeyword("COPY");
        $kw20$UNKNOWN_WEIGHT = SubLObjectFactory.makeKeyword("UNKNOWN-WEIGHT");
        $sym21$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $str22$NEW_TABLE_NAME = SubLObjectFactory.makeString("NEW_TABLE_NAME");
        $sym23$COLUMN_SEMANTICS_COLUMN_NAME = SubLObjectFactory.makeSymbol("COLUMN-SEMANTICS-COLUMN-NAME");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL-1"), (SubLObject)SubLObjectFactory.makeSymbol("COL-2"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TABLE-1-COL"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE-2-COL"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"));
        $str26$ = SubLObjectFactory.makeString("");
        $str27$new_ = SubLObjectFactory.makeString("new_");
        $str28$___genls____a____a____linkTables_ = SubLObjectFactory.makeString("\n (genls\n  ~a\n  ~a)\n (linkTables\n  ~a\n  ~a)\n (mergingTables\n  ~a\n  ~a)\n (mergingColumns\n  ~a\n  ~a)");
        $str29$More_than_two_source_databases_in = SubLObjectFactory.makeString("More than two source databases in mapping table ~a");
        $const30$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN-WEIGHT")));
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EQUAL"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN-WEIGHT"));
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENLS"), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN-WEIGHT"));
        $kw34$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $sym35$BETTER_COLUMN_MERGE_TARGET = SubLObjectFactory.makeSymbol("BETTER-COLUMN-MERGE-TARGET");
        $sym36$DATE_GENLS = SubLObjectFactory.makeSymbol("DATE-GENLS");
        $const37$Date = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Date"));
        $sym38$_DATE_GENLS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*DATE-GENLS-CACHING-STATE*");
        $float39$0_6 = (SubLFloat)SubLObjectFactory.makeDouble(0.6);
        $float40$0_15 = (SubLFloat)SubLObjectFactory.makeDouble(0.15);
        $const41$ScalarOrVectorInterval = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScalarOrVectorInterval"));
        $sym42$_ = SubLObjectFactory.makeSymbol(">");
        $sym43$THIRD = SubLObjectFactory.makeSymbol("THIRD");
        $float44$0_67 = (SubLFloat)SubLObjectFactory.makeDouble(0.67);
        $const45$FieldOfStudy = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FieldOfStudy"));
        $float46$0_33 = (SubLFloat)SubLObjectFactory.makeDouble(0.33);
        $const47$PublishingOrganization = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PublishingOrganization"));
        $str48$CS = SubLObjectFactory.makeString("CS");
        $str49$Addison_Wesley = SubLObjectFactory.makeString("Addison-Wesley");
        $sym50$C_SEMANT_COLUMN_NAME = SubLObjectFactory.makeSymbol("C-SEMANT-COLUMN-NAME");
        $sym51$CAR = SubLObjectFactory.makeSymbol("CAR");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FROM-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("TO-COLUMN"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"));
        $str53$Need_to_move_data_to__A_to_satisf = SubLObjectFactory.makeString("Need to move data to ~A to satisfy foreign-key constraints, but can't figure out which column to move it to.");
    }
}

/*

	Total time: 358 ms
	
*/