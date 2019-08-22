package com.cyc.cycjava.cycl.sksi;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class metadata_parser extends SubLTranslatedFile {
    public static final SubLFile me = new metadata_parser();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.metadata_parser";

    public static final String myFingerPrint = "79fc355aca34117e92456e4b8982d8ce8b732bbf643cdc890811c883f931be49";







    private static final SubLSymbol $EXPORTED_KEYS_INFO = makeKeyword("EXPORTED-KEYS-INFO");

    private static final SubLSymbol $PRIMARY_KEY_INFO = makeKeyword("PRIMARY-KEY-INFO");



    private static final SubLSymbol $IMPORTED_KEYS_INFO = makeKeyword("IMPORTED-KEYS-INFO");







    public static final SubLString $str10$Problem_opening_connection_to_dat = makeString("Problem opening connection to database ~s");

    public static final SubLString $str11$ = makeString("");

    public static final SubLString $str12$_ = makeString("%");

    public static final SubLList $list13 = list(makeString("TABLE"));







    public static final SubLSymbol COLUMN_SEMANTICS_COLUMN_NAME = makeSymbol("COLUMN-SEMANTICS-COLUMN-NAME");

    public static final SubLString $$$_ = makeString(" ");

    public static final SubLString $str19$_ = makeString("_");

    public static final SubLSymbol NON_RELATION_INDIVIDUAL_P = makeSymbol("NON-RELATION-INDIVIDUAL-P");

    public static final SubLString $str21$Table_name_mismatch___s_vs___s = makeString("Table name mismatch: ~s vs. ~s");







    public static final SubLList $list25 = list(makeSymbol("POINTED-TO-ID"), makeSymbol("POINTS-TO-ID"));

    public static final SubLSymbol TABLE_SEMANTICS_P = makeSymbol("TABLE-SEMANTICS-P");



    public static final SubLSymbol SEMANTICS_P = makeSymbol("SEMANTICS-P");







    public static SubLObject semantic_etl_parse_metadata(final SubLObject access_paths) {
        final SubLObject metadata_list = semantic_etl_acquire_metadata_list(access_paths);
        final SubLObject semantics_list = semantic_etl_parse_metadata_list_first_pass(metadata_list, UNPROVIDED);
        return semantic_etl_parse_xref_metadata_list(metadata_list, semantics_list);
    }

    public static SubLObject new_metadata(final SubLObject access_path, final SubLObject tables_meta_data) {
        return list($METADATA, access_path, tables_meta_data);
    }

    public static SubLObject metadata_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.list_of_length_p(v_object, THREE_INTEGER, UNPROVIDED)) && ($METADATA == v_object.first()));
    }

    public static SubLObject metadata_access_path(final SubLObject metadata) {
        return second(metadata);
    }

    public static SubLObject metadata_tables_meta_data(final SubLObject metadata) {
        return third(metadata);
    }

    public static SubLObject table_metadata_table_name(final SubLObject table_metadata) {
        return getf(table_metadata, $TABLE_NAME, UNPROVIDED);
    }

    public static SubLObject table_metadata_column_metadata(final SubLObject table_metadata) {
        return getf(table_metadata, $COLUMN_METADATA, UNPROVIDED);
    }

    public static SubLObject table_metadata_exported_keys_info(final SubLObject table_metadata) {
        return getf(table_metadata, $EXPORTED_KEYS_INFO, UNPROVIDED);
    }

    public static SubLObject table_metadata_primary_key_info(final SubLObject table_metadata) {
        return getf(table_metadata, $PRIMARY_KEY_INFO, UNPROVIDED);
    }

    public static SubLObject table_metadata_primary_key_column_names(final SubLObject table_metadata) {
        final SubLObject primary_key_info = table_metadata_primary_key_info(table_metadata);
        SubLObject column_names = NIL;
        SubLObject cdolist_list_var = primary_key_info;
        SubLObject pkey_info = NIL;
        pkey_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != getf(pkey_info, $COLUMN_NAME, UNPROVIDED)) {
                column_names = cons(getf(pkey_info, $COLUMN_NAME, UNPROVIDED), column_names);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pkey_info = cdolist_list_var.first();
        } 
        return column_names;
    }

    public static SubLObject table_metadata_imported_key_info(final SubLObject table_metadata) {
        return getf(table_metadata, $IMPORTED_KEYS_INFO, UNPROVIDED);
    }

    public static SubLObject table_metadata_imported_key_column_names(final SubLObject table_metadata) {
        final SubLObject imported_key_info = table_metadata_imported_key_info(table_metadata);
        SubLObject column_names = NIL;
        SubLObject cdolist_list_var = imported_key_info;
        SubLObject ikey_info = NIL;
        ikey_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != getf(ikey_info, $FKCOLUMN_NAME, UNPROVIDED)) {
                column_names = cons(getf(ikey_info, $FKCOLUMN_NAME, UNPROVIDED), column_names);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ikey_info = cdolist_list_var.first();
        } 
        return column_names;
    }

    public static SubLObject column_metadata_column_name(final SubLObject column_metadata) {
        return getf(column_metadata, $COLUMN_NAME, UNPROVIDED);
    }

    public static SubLObject column_metadata_column_type(final SubLObject column_metadata) {
        return getf(column_metadata, $TYPE_NAME, UNPROVIDED);
    }

    public static SubLObject column_metadata_column_size(final SubLObject column_metadata) {
        return getf(column_metadata, $COLUMN_SIZE, UNPROVIDED);
    }

    public static SubLObject semantic_etl_acquire_metadata_list(final SubLObject access_paths) {
        SubLObject metadata_list = NIL;
        SubLObject cdolist_list_var = access_paths;
        SubLObject access_path = NIL;
        access_path = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject metadata = semantic_etl_acquire_metadata(access_path);
            metadata_list = cons(metadata, metadata_list);
            cdolist_list_var = cdolist_list_var.rest();
            access_path = cdolist_list_var.first();
        } 
        return nreverse(metadata_list);
    }

    public static SubLObject semantic_etl_acquire_metadata(final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject connection = NIL;
        try {
            connection = sksi_sks_interaction.open_sql_source(access_path, UNPROVIDED, UNPROVIDED);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == sdbc.sql_open_connection_p(connection))) {
                Errors.error($str10$Problem_opening_connection_to_dat, access_path);
            }
            final SubLObject tables_meta_data = sdbc.sqlc_get_tables_meta_data(connection, $str11$, $str12$_, $str12$_, $list13);
            SubLObject new_tables_meta_data = NIL;
            SubLObject cdolist_list_var = tables_meta_data;
            SubLObject table_meta_data = NIL;
            table_meta_data = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject table_name = getf(table_meta_data, $TABLE_NAME, UNPROVIDED);
                final SubLObject row_count = sksi_sks_structure_importer_utilities.sks_physical_structure_database_row_count(connection, table_name);
                final SubLObject columns_meta_data = sdbc.sqlc_get_columns_meta_data(connection, $str11$, $str12$_, table_name, $str12$_);
                final SubLObject primary_keys_meta_data = sdbc.sqlc_get_primary_keys_meta_data(connection, $str11$, $str11$, table_name);
                final SubLObject exported_keys_meta_data = sdbc.sqlc_get_exported_keys_meta_data(connection, $str11$, $str11$, table_name);
                final SubLObject imported_keys_meta_data = sdbc.sqlc_get_imported_keys_meta_data(connection, $str11$, $str11$, table_name);
                final SubLObject indices_meta_data = sdbc.sqlc_get_index_info_meta_data(connection, $str11$, $str11$, table_name, NIL, NIL);
                final SubLObject more_table_meta_data = list(new SubLObject[]{ $ROW_COUNT, row_count, $COLUMN_METADATA, columns_meta_data, $PRIMARY_KEY_INFO, primary_keys_meta_data, $EXPORTED_KEYS_INFO, exported_keys_meta_data, $IMPORTED_KEYS_INFO, imported_keys_meta_data, $INDEX_INFO, indices_meta_data });
                new_tables_meta_data = cons(list_utilities.merge_plist(table_meta_data, more_table_meta_data), new_tables_meta_data);
                cdolist_list_var = cdolist_list_var.rest();
                table_meta_data = cdolist_list_var.first();
            } 
            result = new_metadata(access_path, nreverse(new_tables_meta_data));
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sdbc.sql_open_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject semantic_etl_convert_metadata_to_semantics(final SubLObject metadata) {
        return semantic_etl_parse_metadata_first_pass(metadata, NIL);
    }

    public static SubLObject semantic_etl_parse_metadata_list_first_pass(final SubLObject metadata_list, SubLObject parse_column_names) {
        if (parse_column_names == UNPROVIDED) {
            parse_column_names = T;
        }
        SubLObject semantics_list = NIL;
        SubLObject cdolist_list_var = metadata_list;
        SubLObject metadata = NIL;
        metadata = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            semantics_list = cons(semantic_etl_parse_metadata_first_pass(metadata, parse_column_names), semantics_list);
            cdolist_list_var = cdolist_list_var.rest();
            metadata = cdolist_list_var.first();
        } 
        return nreverse(semantics_list);
    }

    public static SubLObject semantic_etl_parse_metadata_first_pass(final SubLObject metadata, SubLObject parse_metadata) {
        if (parse_metadata == UNPROVIDED) {
            parse_metadata = T;
        }
        final SubLObject access_path = metadata_access_path(metadata);
        SubLObject table_semantics_list = NIL;
        SubLObject cdolist_list_var = metadata_tables_meta_data(metadata);
        SubLObject table_metadata = NIL;
        table_metadata = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject table_name = table_metadata_table_name(table_metadata);
            final SubLObject table_parses = (NIL != parse_metadata) ? semantic_etl_parse_table_name(table_name) : $UNDETERMINED;
            SubLObject column_semantics_list = NIL;
            SubLObject cdolist_list_var_$1 = table_metadata_column_metadata(table_metadata);
            SubLObject column_metadata = NIL;
            column_metadata = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                final SubLObject column_name = column_metadata_column_name(column_metadata);
                final SubLObject column_parses = (NIL != parse_metadata) ? semantic_etl_parse_column_name(column_name, table_parses) : $UNDETERMINED;
                final SubLObject column_type = column_metadata_column_type(column_metadata);
                final SubLObject column_size = (MINUS_ONE_INTEGER.numE(column_metadata_column_size(column_metadata))) ? NIL : column_metadata_column_size(column_metadata);
                column_semantics_list = cons(semantic_etl_bus.new_column_semantics(column_name, column_parses, column_type, column_size), column_semantics_list);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                column_metadata = cdolist_list_var_$1.first();
            } 
            final SubLObject primary_key_column_names = table_metadata_primary_key_column_names(table_metadata);
            SubLObject primary_key_columns = NIL;
            SubLObject cdolist_list_var_$2 = primary_key_column_names;
            SubLObject primary_key_column_name = NIL;
            primary_key_column_name = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                final SubLObject primary_key_column = find(primary_key_column_name, column_semantics_list, EQUAL, COLUMN_SEMANTICS_COLUMN_NAME, UNPROVIDED, UNPROVIDED);
                if (NIL != primary_key_column) {
                    primary_key_columns = cons(primary_key_column, primary_key_columns);
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                primary_key_column_name = cdolist_list_var_$2.first();
            } 
            table_semantics_list = cons(semantic_etl_bus.new_table_semantics(table_name, table_parses, nreverse(column_semantics_list), primary_key_columns), table_semantics_list);
            cdolist_list_var = cdolist_list_var.rest();
            table_metadata = cdolist_list_var.first();
        } 
        return semantic_etl_bus.new_semantics(access_path, nreverse(table_semantics_list));
    }

    public static SubLObject semantic_etl_parse_table_name(final SubLObject table_name) {
        final SubLObject normalized = string_utilities.string_subst($$$_, $str19$_, table_name, UNPROVIDED);
        return remove_if(NON_RELATION_INDIVIDUAL_P, data_parser.etl_parse_value_trampoline(normalized, T, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject semantic_etl_parse_column_name(final SubLObject column_name, SubLObject table_parses) {
        if (table_parses == UNPROVIDED) {
            table_parses = NIL;
        }
        final SubLObject normalized = string_utilities.string_subst($$$_, $str19$_, column_name, UNPROVIDED);
        return remove_if(NON_RELATION_INDIVIDUAL_P, data_parser.etl_parse_value_trampoline(normalized, T, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject non_relation_individual_p(final SubLObject v_term) {
        return makeBoolean(((NIL != kb_accessors.individualP(v_term)) && (NIL == fort_types_interface.predicate_p(v_term))) && (NIL == hlmt.hlmtP(v_term)));
    }

    public static SubLObject semantic_etl_parse_xref_metadata_list(final SubLObject metadata_list, final SubLObject semantics_list) {
        SubLObject metadata = NIL;
        SubLObject metadata_$3 = NIL;
        SubLObject semantics = NIL;
        SubLObject semantics_$4 = NIL;
        metadata = metadata_list;
        metadata_$3 = metadata.first();
        semantics = semantics_list;
        semantics_$4 = semantics.first();
        while ((NIL != semantics) || (NIL != metadata)) {
            semantic_etl_parse_xref_metadata(metadata_$3, semantics_$4);
            metadata = metadata.rest();
            metadata_$3 = metadata.first();
            semantics = semantics.rest();
            semantics_$4 = semantics.first();
        } 
        return semantics_list;
    }

    public static SubLObject semantic_etl_parse_xref_metadata(final SubLObject metadata, final SubLObject semantics) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = semantic_etl_bus.table_id_to_table_semantics_dict(semantics);
        SubLObject links = NIL;
        final SubLObject table_name_to_id_dict = semantic_etl_bus.table_name_to_id_dict(semantics);
        SubLObject constraints = NIL;
        SubLObject table_metadata = NIL;
        SubLObject table_metadata_$5 = NIL;
        SubLObject table_semantics = NIL;
        SubLObject table_semantics_$6 = NIL;
        table_metadata = metadata_tables_meta_data(metadata);
        table_metadata_$5 = table_metadata.first();
        table_semantics = semantic_etl_bus.semantics_table_semantics_list(semantics);
        table_semantics_$6 = table_semantics.first();
        while ((NIL != table_semantics) || (NIL != table_metadata)) {
            final SubLObject table_name = table_metadata_table_name(table_metadata_$5);
            final SubLObject table_name_2 = semantic_etl_bus.table_semantics_table_name(table_semantics_$6);
            final SubLObject table_id = dictionary.dictionary_lookup(table_name_to_id_dict, table_name, UNPROVIDED);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!table_name.equalp(table_name_2))) {
                Errors.error($str21$Table_name_mismatch___s_vs___s, table_name, table_name_2);
            }
            assert NIL != integerp(table_id) : "Types.integerp(table_id) " + "CommonSymbols.NIL != Types.integerp(table_id) " + table_id;
            if (NIL != table_metadata_primary_key_info(table_metadata_$5)) {
                SubLObject cdolist_list_var = table_metadata_primary_key_info(table_metadata_$5);
                SubLObject primary_key_info = NIL;
                primary_key_info = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    constraints = cons(create_constraint_from_primary_key_info(primary_key_info, table_semantics_$6), constraints);
                    cdolist_list_var = cdolist_list_var.rest();
                    primary_key_info = cdolist_list_var.first();
                } 
            }
            SubLObject cdolist_list_var = table_metadata_exported_keys_info(table_metadata_$5);
            SubLObject exported_key_info = NIL;
            exported_key_info = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject foreign_table_name = getf(exported_key_info, $FKTABLE_NAME, UNPROVIDED);
                final SubLObject constraint = create_constraint_from_exported_key_info(exported_key_info, semantics);
                assert NIL != stringp(foreign_table_name) : "Types.stringp(foreign_table_name) " + "CommonSymbols.NIL != Types.stringp(foreign_table_name) " + foreign_table_name;
                constraints = cons(constraint, constraints);
                final SubLObject foreign_table_id = dictionary.dictionary_lookup(table_name_to_id_dict, foreign_table_name, UNPROVIDED);
                assert NIL != integerp(foreign_table_id) : "Types.integerp(foreign_table_id) " + "CommonSymbols.NIL != Types.integerp(foreign_table_id) " + foreign_table_id;
                links = cons(list(table_id, foreign_table_id), links);
                cdolist_list_var = cdolist_list_var.rest();
                exported_key_info = cdolist_list_var.first();
            } 
            table_metadata = table_metadata.rest();
            table_metadata_$5 = table_metadata.first();
            table_semantics = table_semantics.rest();
            table_semantics_$6 = table_semantics.first();
        } 
        semantics_add_table_links(semantics, list_utilities.fast_delete_duplicates(links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), dict);
        semantic_etl_bus.semantics_add_column_constraints(semantics, constraints);
        return semantics;
    }

    public static SubLObject semantics_add_table_links(final SubLObject semantics, final SubLObject links, final SubLObject dict) {
        SubLObject cdolist_list_var = links;
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = link;
            SubLObject pointed_to_id = NIL;
            SubLObject points_to_id = NIL;
            destructuring_bind_must_consp(current, datum, $list25);
            pointed_to_id = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list25);
            points_to_id = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pointed_to_by_table_semantics = dictionary.dictionary_lookup(dict, pointed_to_id, UNPROVIDED);
                SubLObject pointed_to_by_ids = semantic_etl_bus.table_semantics_pointed_to_by_table_ids(pointed_to_by_table_semantics);
                final SubLObject points_to_table_semantics = dictionary.dictionary_lookup(dict, points_to_id, UNPROVIDED);
                SubLObject points_to_ids = semantic_etl_bus.table_semantics_points_to_table_ids(points_to_table_semantics);
                SubLObject item_var = pointed_to_id;
                if (NIL == member(item_var, points_to_ids, symbol_function(EQL), symbol_function(IDENTITY))) {
                    points_to_ids = cons(item_var, points_to_ids);
                }
                item_var = points_to_id;
                if (NIL == member(item_var, pointed_to_by_ids, symbol_function(EQL), symbol_function(IDENTITY))) {
                    pointed_to_by_ids = cons(item_var, pointed_to_by_ids);
                }
                semantic_etl_bus.set_table_semantics_pointed_to_by_table_ids(pointed_to_by_table_semantics, pointed_to_by_ids);
                semantic_etl_bus.set_table_semantics_points_to_table_ids(points_to_table_semantics, points_to_ids);
            } else {
                cdestructuring_bind_error(datum, $list25);
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        } 
        return semantics;
    }

    public static SubLObject create_constraint_from_primary_key_info(final SubLObject primary_key_info, final SubLObject table_semantics) {
        assert NIL != semantic_etl_bus.table_semantics_p(table_semantics) : "semantic_etl_bus.table_semantics_p(table_semantics) " + "CommonSymbols.NIL != semantic_etl_bus.table_semantics_p(table_semantics) " + table_semantics;
        final SubLObject column_name = getf(primary_key_info, $COLUMN_NAME, UNPROVIDED);
        final SubLObject table_name = getf(primary_key_info, $TABLE_NAME, UNPROVIDED);
        final SubLObject table = (semantic_etl_bus.table_semantics_table_name(table_semantics).equal(table_name)) ? table_semantics : NIL;
        final SubLObject column = (NIL != table) ? semantic_etl_bus.table_semantics_get_column_named(table, column_name) : NIL;
        final SubLObject constraint_name = getf(primary_key_info, $PK_NAME, UNPROVIDED);
        if (NIL != semantic_etl_bus.column_semantics_p(column)) {
            return semantic_etl_bus.new_primary_key_constraint(constraint_name, column);
        }
        return NIL;
    }

    public static SubLObject create_constraint_from_exported_key_info(final SubLObject exported_key_info, final SubLObject semantics) {
        assert NIL != semantic_etl_bus.semantics_p(semantics) : "semantic_etl_bus.semantics_p(semantics) " + "CommonSymbols.NIL != semantic_etl_bus.semantics_p(semantics) " + semantics;
        final SubLObject constraint_name = getf(exported_key_info, $FK_NAME, UNPROVIDED);
        final SubLObject constrained_table_name = getf(exported_key_info, $FKTABLE_NAME, UNPROVIDED);
        final SubLObject constrained_column_name = getf(exported_key_info, $FKCOLUMN_NAME, UNPROVIDED);
        final SubLObject constraining_table_name = getf(exported_key_info, $PKTABLE_NAME, UNPROVIDED);
        final SubLObject constraining_column_name = getf(exported_key_info, $PKCOLUMN_NAME, UNPROVIDED);
        final SubLObject constrained_table = semantic_etl_bus.semantics_get_table_named(semantics, constrained_table_name);
        final SubLObject constrained_column = semantic_etl_bus.table_semantics_get_column_named(constrained_table, constrained_column_name);
        final SubLObject constraining_table = semantic_etl_bus.semantics_get_table_named(semantics, constraining_table_name);
        final SubLObject constraining_column = semantic_etl_bus.table_semantics_get_column_named(constraining_table, constraining_column_name);
        final SubLObject constraint = semantic_etl_bus.new_foreign_key_constraint(constraint_name, constrained_column, constraining_column);
        return constraint;
    }

    public static SubLObject declare_metadata_parser_file() {
        declareFunction(me, "semantic_etl_parse_metadata", "SEMANTIC-ETL-PARSE-METADATA", 1, 0, false);
        declareFunction(me, "new_metadata", "NEW-METADATA", 2, 0, false);
        declareFunction(me, "metadata_p", "METADATA-P", 1, 0, false);
        declareFunction(me, "metadata_access_path", "METADATA-ACCESS-PATH", 1, 0, false);
        declareFunction(me, "metadata_tables_meta_data", "METADATA-TABLES-META-DATA", 1, 0, false);
        declareFunction(me, "table_metadata_table_name", "TABLE-METADATA-TABLE-NAME", 1, 0, false);
        declareFunction(me, "table_metadata_column_metadata", "TABLE-METADATA-COLUMN-METADATA", 1, 0, false);
        declareFunction(me, "table_metadata_exported_keys_info", "TABLE-METADATA-EXPORTED-KEYS-INFO", 1, 0, false);
        declareFunction(me, "table_metadata_primary_key_info", "TABLE-METADATA-PRIMARY-KEY-INFO", 1, 0, false);
        declareFunction(me, "table_metadata_primary_key_column_names", "TABLE-METADATA-PRIMARY-KEY-COLUMN-NAMES", 1, 0, false);
        declareFunction(me, "table_metadata_imported_key_info", "TABLE-METADATA-IMPORTED-KEY-INFO", 1, 0, false);
        declareFunction(me, "table_metadata_imported_key_column_names", "TABLE-METADATA-IMPORTED-KEY-COLUMN-NAMES", 1, 0, false);
        declareFunction(me, "column_metadata_column_name", "COLUMN-METADATA-COLUMN-NAME", 1, 0, false);
        declareFunction(me, "column_metadata_column_type", "COLUMN-METADATA-COLUMN-TYPE", 1, 0, false);
        declareFunction(me, "column_metadata_column_size", "COLUMN-METADATA-COLUMN-SIZE", 1, 0, false);
        declareFunction(me, "semantic_etl_acquire_metadata_list", "SEMANTIC-ETL-ACQUIRE-METADATA-LIST", 1, 0, false);
        declareFunction(me, "semantic_etl_acquire_metadata", "SEMANTIC-ETL-ACQUIRE-METADATA", 1, 0, false);
        declareFunction(me, "semantic_etl_convert_metadata_to_semantics", "SEMANTIC-ETL-CONVERT-METADATA-TO-SEMANTICS", 1, 0, false);
        declareFunction(me, "semantic_etl_parse_metadata_list_first_pass", "SEMANTIC-ETL-PARSE-METADATA-LIST-FIRST-PASS", 1, 1, false);
        declareFunction(me, "semantic_etl_parse_metadata_first_pass", "SEMANTIC-ETL-PARSE-METADATA-FIRST-PASS", 1, 1, false);
        declareFunction(me, "semantic_etl_parse_table_name", "SEMANTIC-ETL-PARSE-TABLE-NAME", 1, 0, false);
        declareFunction(me, "semantic_etl_parse_column_name", "SEMANTIC-ETL-PARSE-COLUMN-NAME", 1, 1, false);
        declareFunction(me, "non_relation_individual_p", "NON-RELATION-INDIVIDUAL-P", 1, 0, false);
        declareFunction(me, "semantic_etl_parse_xref_metadata_list", "SEMANTIC-ETL-PARSE-XREF-METADATA-LIST", 2, 0, false);
        declareFunction(me, "semantic_etl_parse_xref_metadata", "SEMANTIC-ETL-PARSE-XREF-METADATA", 2, 0, false);
        declareFunction(me, "semantics_add_table_links", "SEMANTICS-ADD-TABLE-LINKS", 3, 0, false);
        declareFunction(me, "create_constraint_from_primary_key_info", "CREATE-CONSTRAINT-FROM-PRIMARY-KEY-INFO", 2, 0, false);
        declareFunction(me, "create_constraint_from_exported_key_info", "CREATE-CONSTRAINT-FROM-EXPORTED-KEY-INFO", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_metadata_parser_file() {
        return NIL;
    }

    public static SubLObject setup_metadata_parser_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_metadata_parser_file();
    }

    @Override
    public void initializeVariables() {
        init_metadata_parser_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_metadata_parser_file();
    }

    
}

/**
 * Total time: 161 ms
 */
