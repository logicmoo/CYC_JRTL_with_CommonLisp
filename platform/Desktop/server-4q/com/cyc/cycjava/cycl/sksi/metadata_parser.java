package com.cyc.cycjava.cycl.sksi;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class metadata_parser extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.metadata_parser";
    public static final String myFingerPrint = "79fc355aca34117e92456e4b8982d8ce8b732bbf643cdc890811c883f931be49";
    private static final SubLSymbol $kw0$METADATA;
    private static final SubLSymbol $kw1$TABLE_NAME;
    private static final SubLSymbol $kw2$COLUMN_METADATA;
    private static final SubLSymbol $kw3$EXPORTED_KEYS_INFO;
    private static final SubLSymbol $kw4$PRIMARY_KEY_INFO;
    private static final SubLSymbol $kw5$COLUMN_NAME;
    private static final SubLSymbol $kw6$IMPORTED_KEYS_INFO;
    private static final SubLSymbol $kw7$FKCOLUMN_NAME;
    private static final SubLSymbol $kw8$TYPE_NAME;
    private static final SubLSymbol $kw9$COLUMN_SIZE;
    private static final SubLString $str10$Problem_opening_connection_to_dat;
    private static final SubLString $str11$;
    private static final SubLString $str12$_;
    private static final SubLList $list13;
    private static final SubLSymbol $kw14$ROW_COUNT;
    private static final SubLSymbol $kw15$INDEX_INFO;
    private static final SubLSymbol $kw16$UNDETERMINED;
    private static final SubLSymbol $sym17$COLUMN_SEMANTICS_COLUMN_NAME;
    private static final SubLString $str18$_;
    private static final SubLString $str19$_;
    private static final SubLSymbol $sym20$NON_RELATION_INDIVIDUAL_P;
    private static final SubLString $str21$Table_name_mismatch___s_vs___s;
    private static final SubLSymbol $sym22$INTEGERP;
    private static final SubLSymbol $kw23$FKTABLE_NAME;
    private static final SubLSymbol $sym24$STRINGP;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$TABLE_SEMANTICS_P;
    private static final SubLSymbol $kw27$PK_NAME;
    private static final SubLSymbol $sym28$SEMANTICS_P;
    private static final SubLSymbol $kw29$FK_NAME;
    private static final SubLSymbol $kw30$PKTABLE_NAME;
    private static final SubLSymbol $kw31$PKCOLUMN_NAME;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 1023L)
    public static SubLObject semantic_etl_parse_metadata(final SubLObject access_paths) {
        final SubLObject metadata_list = semantic_etl_acquire_metadata_list(access_paths);
        final SubLObject semantics_list = semantic_etl_parse_metadata_list_first_pass(metadata_list, (SubLObject)metadata_parser.UNPROVIDED);
        return semantic_etl_parse_xref_metadata_list(metadata_list, semantics_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 1624L)
    public static SubLObject new_metadata(final SubLObject access_path, final SubLObject tables_meta_data) {
        return (SubLObject)ConsesLow.list((SubLObject)metadata_parser.$kw0$METADATA, access_path, tables_meta_data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 1762L)
    public static SubLObject metadata_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(metadata_parser.NIL != list_utilities.list_of_length_p(v_object, (SubLObject)metadata_parser.THREE_INTEGER, (SubLObject)metadata_parser.UNPROVIDED) && metadata_parser.$kw0$METADATA == v_object.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 1879L)
    public static SubLObject metadata_access_path(final SubLObject metadata) {
        return conses_high.second(metadata);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 1955L)
    public static SubLObject metadata_tables_meta_data(final SubLObject metadata) {
        return conses_high.third(metadata);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 2035L)
    public static SubLObject table_metadata_table_name(final SubLObject table_metadata) {
        return conses_high.getf(table_metadata, (SubLObject)metadata_parser.$kw1$TABLE_NAME, (SubLObject)metadata_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 2164L)
    public static SubLObject table_metadata_column_metadata(final SubLObject table_metadata) {
        return conses_high.getf(table_metadata, (SubLObject)metadata_parser.$kw2$COLUMN_METADATA, (SubLObject)metadata_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 2277L)
    public static SubLObject table_metadata_exported_keys_info(final SubLObject table_metadata) {
        return conses_high.getf(table_metadata, (SubLObject)metadata_parser.$kw3$EXPORTED_KEYS_INFO, (SubLObject)metadata_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 2396L)
    public static SubLObject table_metadata_primary_key_info(final SubLObject table_metadata) {
        return conses_high.getf(table_metadata, (SubLObject)metadata_parser.$kw4$PRIMARY_KEY_INFO, (SubLObject)metadata_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 2511L)
    public static SubLObject table_metadata_primary_key_column_names(final SubLObject table_metadata) {
        final SubLObject primary_key_info = table_metadata_primary_key_info(table_metadata);
        SubLObject column_names = (SubLObject)metadata_parser.NIL;
        SubLObject cdolist_list_var = primary_key_info;
        SubLObject pkey_info = (SubLObject)metadata_parser.NIL;
        pkey_info = cdolist_list_var.first();
        while (metadata_parser.NIL != cdolist_list_var) {
            if (metadata_parser.NIL != conses_high.getf(pkey_info, (SubLObject)metadata_parser.$kw5$COLUMN_NAME, (SubLObject)metadata_parser.UNPROVIDED)) {
                column_names = (SubLObject)ConsesLow.cons(conses_high.getf(pkey_info, (SubLObject)metadata_parser.$kw5$COLUMN_NAME, (SubLObject)metadata_parser.UNPROVIDED), column_names);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pkey_info = cdolist_list_var.first();
        }
        return column_names;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 2842L)
    public static SubLObject table_metadata_imported_key_info(final SubLObject table_metadata) {
        return conses_high.getf(table_metadata, (SubLObject)metadata_parser.$kw6$IMPORTED_KEYS_INFO, (SubLObject)metadata_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 2962L)
    public static SubLObject table_metadata_imported_key_column_names(final SubLObject table_metadata) {
        final SubLObject imported_key_info = table_metadata_imported_key_info(table_metadata);
        SubLObject column_names = (SubLObject)metadata_parser.NIL;
        SubLObject cdolist_list_var = imported_key_info;
        SubLObject ikey_info = (SubLObject)metadata_parser.NIL;
        ikey_info = cdolist_list_var.first();
        while (metadata_parser.NIL != cdolist_list_var) {
            if (metadata_parser.NIL != conses_high.getf(ikey_info, (SubLObject)metadata_parser.$kw7$FKCOLUMN_NAME, (SubLObject)metadata_parser.UNPROVIDED)) {
                column_names = (SubLObject)ConsesLow.cons(conses_high.getf(ikey_info, (SubLObject)metadata_parser.$kw7$FKCOLUMN_NAME, (SubLObject)metadata_parser.UNPROVIDED), column_names);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ikey_info = cdolist_list_var.first();
        }
        return column_names;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 3301L)
    public static SubLObject column_metadata_column_name(final SubLObject column_metadata) {
        return conses_high.getf(column_metadata, (SubLObject)metadata_parser.$kw5$COLUMN_NAME, (SubLObject)metadata_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 3438L)
    public static SubLObject column_metadata_column_type(final SubLObject column_metadata) {
        return conses_high.getf(column_metadata, (SubLObject)metadata_parser.$kw8$TYPE_NAME, (SubLObject)metadata_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 3544L)
    public static SubLObject column_metadata_column_size(final SubLObject column_metadata) {
        return conses_high.getf(column_metadata, (SubLObject)metadata_parser.$kw9$COLUMN_SIZE, (SubLObject)metadata_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 3652L)
    public static SubLObject semantic_etl_acquire_metadata_list(final SubLObject access_paths) {
        SubLObject metadata_list = (SubLObject)metadata_parser.NIL;
        SubLObject cdolist_list_var = access_paths;
        SubLObject access_path = (SubLObject)metadata_parser.NIL;
        access_path = cdolist_list_var.first();
        while (metadata_parser.NIL != cdolist_list_var) {
            final SubLObject metadata = semantic_etl_acquire_metadata(access_path);
            metadata_list = (SubLObject)ConsesLow.cons(metadata, metadata_list);
            cdolist_list_var = cdolist_list_var.rest();
            access_path = cdolist_list_var.first();
        }
        return Sequences.nreverse(metadata_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 4041L)
    public static SubLObject semantic_etl_acquire_metadata(final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)metadata_parser.NIL;
        SubLObject connection = (SubLObject)metadata_parser.NIL;
        try {
            connection = sksi_sks_interaction.open_sql_source(access_path, (SubLObject)metadata_parser.UNPROVIDED, (SubLObject)metadata_parser.UNPROVIDED);
            if (metadata_parser.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && metadata_parser.NIL == sdbc.sql_open_connection_p(connection)) {
                Errors.error((SubLObject)metadata_parser.$str10$Problem_opening_connection_to_dat, access_path);
            }
            final SubLObject tables_meta_data = sdbc.sqlc_get_tables_meta_data(connection, (SubLObject)metadata_parser.$str11$, (SubLObject)metadata_parser.$str12$_, (SubLObject)metadata_parser.$str12$_, (SubLObject)metadata_parser.$list13);
            SubLObject new_tables_meta_data = (SubLObject)metadata_parser.NIL;
            SubLObject cdolist_list_var = tables_meta_data;
            SubLObject table_meta_data = (SubLObject)metadata_parser.NIL;
            table_meta_data = cdolist_list_var.first();
            while (metadata_parser.NIL != cdolist_list_var) {
                final SubLObject table_name = conses_high.getf(table_meta_data, (SubLObject)metadata_parser.$kw1$TABLE_NAME, (SubLObject)metadata_parser.UNPROVIDED);
                final SubLObject row_count = sksi_sks_structure_importer_utilities.sks_physical_structure_database_row_count(connection, table_name);
                final SubLObject columns_meta_data = sdbc.sqlc_get_columns_meta_data(connection, (SubLObject)metadata_parser.$str11$, (SubLObject)metadata_parser.$str12$_, table_name, (SubLObject)metadata_parser.$str12$_);
                final SubLObject primary_keys_meta_data = sdbc.sqlc_get_primary_keys_meta_data(connection, (SubLObject)metadata_parser.$str11$, (SubLObject)metadata_parser.$str11$, table_name);
                final SubLObject exported_keys_meta_data = sdbc.sqlc_get_exported_keys_meta_data(connection, (SubLObject)metadata_parser.$str11$, (SubLObject)metadata_parser.$str11$, table_name);
                final SubLObject imported_keys_meta_data = sdbc.sqlc_get_imported_keys_meta_data(connection, (SubLObject)metadata_parser.$str11$, (SubLObject)metadata_parser.$str11$, table_name);
                final SubLObject indices_meta_data = sdbc.sqlc_get_index_info_meta_data(connection, (SubLObject)metadata_parser.$str11$, (SubLObject)metadata_parser.$str11$, table_name, (SubLObject)metadata_parser.NIL, (SubLObject)metadata_parser.NIL);
                final SubLObject more_table_meta_data = (SubLObject)ConsesLow.list(new SubLObject[] { metadata_parser.$kw14$ROW_COUNT, row_count, metadata_parser.$kw2$COLUMN_METADATA, columns_meta_data, metadata_parser.$kw4$PRIMARY_KEY_INFO, primary_keys_meta_data, metadata_parser.$kw3$EXPORTED_KEYS_INFO, exported_keys_meta_data, metadata_parser.$kw6$IMPORTED_KEYS_INFO, imported_keys_meta_data, metadata_parser.$kw15$INDEX_INFO, indices_meta_data });
                new_tables_meta_data = (SubLObject)ConsesLow.cons(list_utilities.merge_plist(table_meta_data, more_table_meta_data), new_tables_meta_data);
                cdolist_list_var = cdolist_list_var.rest();
                table_meta_data = cdolist_list_var.first();
            }
            result = new_metadata(access_path, Sequences.nreverse(new_tables_meta_data));
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)metadata_parser.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (metadata_parser.NIL != sdbc.sql_open_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 5500L)
    public static SubLObject semantic_etl_convert_metadata_to_semantics(final SubLObject metadata) {
        return semantic_etl_parse_metadata_first_pass(metadata, (SubLObject)metadata_parser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 5675L)
    public static SubLObject semantic_etl_parse_metadata_list_first_pass(final SubLObject metadata_list, SubLObject parse_column_names) {
        if (parse_column_names == metadata_parser.UNPROVIDED) {
            parse_column_names = (SubLObject)metadata_parser.T;
        }
        SubLObject semantics_list = (SubLObject)metadata_parser.NIL;
        SubLObject cdolist_list_var = metadata_list;
        SubLObject metadata = (SubLObject)metadata_parser.NIL;
        metadata = cdolist_list_var.first();
        while (metadata_parser.NIL != cdolist_list_var) {
            semantics_list = (SubLObject)ConsesLow.cons(semantic_etl_parse_metadata_first_pass(metadata, parse_column_names), semantics_list);
            cdolist_list_var = cdolist_list_var.rest();
            metadata = cdolist_list_var.first();
        }
        return Sequences.nreverse(semantics_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 6229L)
    public static SubLObject semantic_etl_parse_metadata_first_pass(final SubLObject metadata, SubLObject parse_metadata) {
        if (parse_metadata == metadata_parser.UNPROVIDED) {
            parse_metadata = (SubLObject)metadata_parser.T;
        }
        final SubLObject access_path = metadata_access_path(metadata);
        SubLObject table_semantics_list = (SubLObject)metadata_parser.NIL;
        SubLObject cdolist_list_var = metadata_tables_meta_data(metadata);
        SubLObject table_metadata = (SubLObject)metadata_parser.NIL;
        table_metadata = cdolist_list_var.first();
        while (metadata_parser.NIL != cdolist_list_var) {
            final SubLObject table_name = table_metadata_table_name(table_metadata);
            final SubLObject table_parses = (SubLObject)((metadata_parser.NIL != parse_metadata) ? semantic_etl_parse_table_name(table_name) : metadata_parser.$kw16$UNDETERMINED);
            SubLObject column_semantics_list = (SubLObject)metadata_parser.NIL;
            SubLObject cdolist_list_var_$1 = table_metadata_column_metadata(table_metadata);
            SubLObject column_metadata = (SubLObject)metadata_parser.NIL;
            column_metadata = cdolist_list_var_$1.first();
            while (metadata_parser.NIL != cdolist_list_var_$1) {
                final SubLObject column_name = column_metadata_column_name(column_metadata);
                final SubLObject column_parses = (SubLObject)((metadata_parser.NIL != parse_metadata) ? semantic_etl_parse_column_name(column_name, table_parses) : metadata_parser.$kw16$UNDETERMINED);
                final SubLObject column_type = column_metadata_column_type(column_metadata);
                final SubLObject column_size = (SubLObject)(metadata_parser.MINUS_ONE_INTEGER.numE(column_metadata_column_size(column_metadata)) ? metadata_parser.NIL : column_metadata_column_size(column_metadata));
                column_semantics_list = (SubLObject)ConsesLow.cons(semantic_etl_bus.new_column_semantics(column_name, column_parses, column_type, column_size), column_semantics_list);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                column_metadata = cdolist_list_var_$1.first();
            }
            final SubLObject primary_key_column_names = table_metadata_primary_key_column_names(table_metadata);
            SubLObject primary_key_columns = (SubLObject)metadata_parser.NIL;
            SubLObject cdolist_list_var_$2 = primary_key_column_names;
            SubLObject primary_key_column_name = (SubLObject)metadata_parser.NIL;
            primary_key_column_name = cdolist_list_var_$2.first();
            while (metadata_parser.NIL != cdolist_list_var_$2) {
                final SubLObject primary_key_column = Sequences.find(primary_key_column_name, column_semantics_list, (SubLObject)metadata_parser.EQUAL, (SubLObject)metadata_parser.$sym17$COLUMN_SEMANTICS_COLUMN_NAME, (SubLObject)metadata_parser.UNPROVIDED, (SubLObject)metadata_parser.UNPROVIDED);
                if (metadata_parser.NIL != primary_key_column) {
                    primary_key_columns = (SubLObject)ConsesLow.cons(primary_key_column, primary_key_columns);
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                primary_key_column_name = cdolist_list_var_$2.first();
            }
            table_semantics_list = (SubLObject)ConsesLow.cons(semantic_etl_bus.new_table_semantics(table_name, table_parses, Sequences.nreverse(column_semantics_list), primary_key_columns), table_semantics_list);
            cdolist_list_var = cdolist_list_var.rest();
            table_metadata = cdolist_list_var.first();
        }
        return semantic_etl_bus.new_semantics(access_path, Sequences.nreverse(table_semantics_list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 8024L)
    public static SubLObject semantic_etl_parse_table_name(final SubLObject table_name) {
        final SubLObject normalized = string_utilities.string_subst((SubLObject)metadata_parser.$str18$_, (SubLObject)metadata_parser.$str19$_, table_name, (SubLObject)metadata_parser.UNPROVIDED);
        return Sequences.remove_if((SubLObject)metadata_parser.$sym20$NON_RELATION_INDIVIDUAL_P, data_parser.etl_parse_value_trampoline(normalized, (SubLObject)metadata_parser.T, (SubLObject)metadata_parser.UNPROVIDED), (SubLObject)metadata_parser.UNPROVIDED, (SubLObject)metadata_parser.UNPROVIDED, (SubLObject)metadata_parser.UNPROVIDED, (SubLObject)metadata_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 8247L)
    public static SubLObject semantic_etl_parse_column_name(final SubLObject column_name, SubLObject table_parses) {
        if (table_parses == metadata_parser.UNPROVIDED) {
            table_parses = (SubLObject)metadata_parser.NIL;
        }
        final SubLObject normalized = string_utilities.string_subst((SubLObject)metadata_parser.$str18$_, (SubLObject)metadata_parser.$str19$_, column_name, (SubLObject)metadata_parser.UNPROVIDED);
        return Sequences.remove_if((SubLObject)metadata_parser.$sym20$NON_RELATION_INDIVIDUAL_P, data_parser.etl_parse_value_trampoline(normalized, (SubLObject)metadata_parser.T, (SubLObject)metadata_parser.UNPROVIDED), (SubLObject)metadata_parser.UNPROVIDED, (SubLObject)metadata_parser.UNPROVIDED, (SubLObject)metadata_parser.UNPROVIDED, (SubLObject)metadata_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 8563L)
    public static SubLObject non_relation_individual_p(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(metadata_parser.NIL != kb_accessors.individualP(v_term) && metadata_parser.NIL == fort_types_interface.predicate_p(v_term) && metadata_parser.NIL == hlmt.hlmtP(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 8706L)
    public static SubLObject semantic_etl_parse_xref_metadata_list(final SubLObject metadata_list, final SubLObject semantics_list) {
        SubLObject metadata = (SubLObject)metadata_parser.NIL;
        SubLObject metadata_$3 = (SubLObject)metadata_parser.NIL;
        SubLObject semantics = (SubLObject)metadata_parser.NIL;
        SubLObject semantics_$4 = (SubLObject)metadata_parser.NIL;
        metadata = metadata_list;
        metadata_$3 = metadata.first();
        semantics = semantics_list;
        semantics_$4 = semantics.first();
        while (metadata_parser.NIL != semantics || metadata_parser.NIL != metadata) {
            semantic_etl_parse_xref_metadata(metadata_$3, semantics_$4);
            metadata = metadata.rest();
            metadata_$3 = metadata.first();
            semantics = semantics.rest();
            semantics_$4 = semantics.first();
        }
        return semantics_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 8966L)
    public static SubLObject semantic_etl_parse_xref_metadata(final SubLObject metadata, final SubLObject semantics) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = semantic_etl_bus.table_id_to_table_semantics_dict(semantics);
        SubLObject links = (SubLObject)metadata_parser.NIL;
        final SubLObject table_name_to_id_dict = semantic_etl_bus.table_name_to_id_dict(semantics);
        SubLObject constraints = (SubLObject)metadata_parser.NIL;
        SubLObject table_metadata = (SubLObject)metadata_parser.NIL;
        SubLObject table_metadata_$5 = (SubLObject)metadata_parser.NIL;
        SubLObject table_semantics = (SubLObject)metadata_parser.NIL;
        SubLObject table_semantics_$6 = (SubLObject)metadata_parser.NIL;
        table_metadata = metadata_tables_meta_data(metadata);
        table_metadata_$5 = table_metadata.first();
        table_semantics = semantic_etl_bus.semantics_table_semantics_list(semantics);
        table_semantics_$6 = table_semantics.first();
        while (metadata_parser.NIL != table_semantics || metadata_parser.NIL != table_metadata) {
            final SubLObject table_name = table_metadata_table_name(table_metadata_$5);
            final SubLObject table_name_2 = semantic_etl_bus.table_semantics_table_name(table_semantics_$6);
            final SubLObject table_id = dictionary.dictionary_lookup(table_name_to_id_dict, table_name, (SubLObject)metadata_parser.UNPROVIDED);
            if (metadata_parser.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !table_name.equalp(table_name_2)) {
                Errors.error((SubLObject)metadata_parser.$str21$Table_name_mismatch___s_vs___s, table_name, table_name_2);
            }
            assert metadata_parser.NIL != Types.integerp(table_id) : table_id;
            if (metadata_parser.NIL != table_metadata_primary_key_info(table_metadata_$5)) {
                SubLObject cdolist_list_var = table_metadata_primary_key_info(table_metadata_$5);
                SubLObject primary_key_info = (SubLObject)metadata_parser.NIL;
                primary_key_info = cdolist_list_var.first();
                while (metadata_parser.NIL != cdolist_list_var) {
                    constraints = (SubLObject)ConsesLow.cons(create_constraint_from_primary_key_info(primary_key_info, table_semantics_$6), constraints);
                    cdolist_list_var = cdolist_list_var.rest();
                    primary_key_info = cdolist_list_var.first();
                }
            }
            SubLObject cdolist_list_var = table_metadata_exported_keys_info(table_metadata_$5);
            SubLObject exported_key_info = (SubLObject)metadata_parser.NIL;
            exported_key_info = cdolist_list_var.first();
            while (metadata_parser.NIL != cdolist_list_var) {
                final SubLObject foreign_table_name = conses_high.getf(exported_key_info, (SubLObject)metadata_parser.$kw23$FKTABLE_NAME, (SubLObject)metadata_parser.UNPROVIDED);
                final SubLObject constraint = create_constraint_from_exported_key_info(exported_key_info, semantics);
                assert metadata_parser.NIL != Types.stringp(foreign_table_name) : foreign_table_name;
                constraints = (SubLObject)ConsesLow.cons(constraint, constraints);
                final SubLObject foreign_table_id = dictionary.dictionary_lookup(table_name_to_id_dict, foreign_table_name, (SubLObject)metadata_parser.UNPROVIDED);
                assert metadata_parser.NIL != Types.integerp(foreign_table_id) : foreign_table_id;
                links = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(table_id, foreign_table_id), links);
                cdolist_list_var = cdolist_list_var.rest();
                exported_key_info = cdolist_list_var.first();
            }
            table_metadata = table_metadata.rest();
            table_metadata_$5 = table_metadata.first();
            table_semantics = table_semantics.rest();
            table_semantics_$6 = table_semantics.first();
        }
        semantics_add_table_links(semantics, list_utilities.fast_delete_duplicates(links, (SubLObject)metadata_parser.UNPROVIDED, (SubLObject)metadata_parser.UNPROVIDED, (SubLObject)metadata_parser.UNPROVIDED, (SubLObject)metadata_parser.UNPROVIDED, (SubLObject)metadata_parser.UNPROVIDED), dict);
        semantic_etl_bus.semantics_add_column_constraints(semantics, constraints);
        return semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 10798L)
    public static SubLObject semantics_add_table_links(final SubLObject semantics, final SubLObject links, final SubLObject dict) {
        SubLObject cdolist_list_var = links;
        SubLObject link = (SubLObject)metadata_parser.NIL;
        link = cdolist_list_var.first();
        while (metadata_parser.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = link;
            SubLObject pointed_to_id = (SubLObject)metadata_parser.NIL;
            SubLObject points_to_id = (SubLObject)metadata_parser.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)metadata_parser.$list25);
            pointed_to_id = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)metadata_parser.$list25);
            points_to_id = current.first();
            current = current.rest();
            if (metadata_parser.NIL == current) {
                final SubLObject pointed_to_by_table_semantics = dictionary.dictionary_lookup(dict, pointed_to_id, (SubLObject)metadata_parser.UNPROVIDED);
                SubLObject pointed_to_by_ids = semantic_etl_bus.table_semantics_pointed_to_by_table_ids(pointed_to_by_table_semantics);
                final SubLObject points_to_table_semantics = dictionary.dictionary_lookup(dict, points_to_id, (SubLObject)metadata_parser.UNPROVIDED);
                SubLObject points_to_ids = semantic_etl_bus.table_semantics_points_to_table_ids(points_to_table_semantics);
                SubLObject item_var = pointed_to_id;
                if (metadata_parser.NIL == conses_high.member(item_var, points_to_ids, Symbols.symbol_function((SubLObject)metadata_parser.EQL), Symbols.symbol_function((SubLObject)metadata_parser.IDENTITY))) {
                    points_to_ids = (SubLObject)ConsesLow.cons(item_var, points_to_ids);
                }
                item_var = points_to_id;
                if (metadata_parser.NIL == conses_high.member(item_var, pointed_to_by_ids, Symbols.symbol_function((SubLObject)metadata_parser.EQL), Symbols.symbol_function((SubLObject)metadata_parser.IDENTITY))) {
                    pointed_to_by_ids = (SubLObject)ConsesLow.cons(item_var, pointed_to_by_ids);
                }
                semantic_etl_bus.set_table_semantics_pointed_to_by_table_ids(pointed_to_by_table_semantics, pointed_to_by_ids);
                semantic_etl_bus.set_table_semantics_points_to_table_ids(points_to_table_semantics, points_to_ids);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)metadata_parser.$list25);
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        }
        return semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 11644L)
    public static SubLObject create_constraint_from_primary_key_info(final SubLObject primary_key_info, final SubLObject table_semantics) {
        assert metadata_parser.NIL != semantic_etl_bus.table_semantics_p(table_semantics) : table_semantics;
        final SubLObject column_name = conses_high.getf(primary_key_info, (SubLObject)metadata_parser.$kw5$COLUMN_NAME, (SubLObject)metadata_parser.UNPROVIDED);
        final SubLObject table_name = conses_high.getf(primary_key_info, (SubLObject)metadata_parser.$kw1$TABLE_NAME, (SubLObject)metadata_parser.UNPROVIDED);
        final SubLObject table = (SubLObject)(semantic_etl_bus.table_semantics_table_name(table_semantics).equal(table_name) ? table_semantics : metadata_parser.NIL);
        final SubLObject column = (SubLObject)((metadata_parser.NIL != table) ? semantic_etl_bus.table_semantics_get_column_named(table, column_name) : metadata_parser.NIL);
        final SubLObject constraint_name = conses_high.getf(primary_key_info, (SubLObject)metadata_parser.$kw27$PK_NAME, (SubLObject)metadata_parser.UNPROVIDED);
        if (metadata_parser.NIL != semantic_etl_bus.column_semantics_p(column)) {
            return semantic_etl_bus.new_primary_key_constraint(constraint_name, column);
        }
        return (SubLObject)metadata_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/metadata-parser.lisp", position = 12283L)
    public static SubLObject create_constraint_from_exported_key_info(final SubLObject exported_key_info, final SubLObject semantics) {
        assert metadata_parser.NIL != semantic_etl_bus.semantics_p(semantics) : semantics;
        final SubLObject constraint_name = conses_high.getf(exported_key_info, (SubLObject)metadata_parser.$kw29$FK_NAME, (SubLObject)metadata_parser.UNPROVIDED);
        final SubLObject constrained_table_name = conses_high.getf(exported_key_info, (SubLObject)metadata_parser.$kw23$FKTABLE_NAME, (SubLObject)metadata_parser.UNPROVIDED);
        final SubLObject constrained_column_name = conses_high.getf(exported_key_info, (SubLObject)metadata_parser.$kw7$FKCOLUMN_NAME, (SubLObject)metadata_parser.UNPROVIDED);
        final SubLObject constraining_table_name = conses_high.getf(exported_key_info, (SubLObject)metadata_parser.$kw30$PKTABLE_NAME, (SubLObject)metadata_parser.UNPROVIDED);
        final SubLObject constraining_column_name = conses_high.getf(exported_key_info, (SubLObject)metadata_parser.$kw31$PKCOLUMN_NAME, (SubLObject)metadata_parser.UNPROVIDED);
        final SubLObject constrained_table = semantic_etl_bus.semantics_get_table_named(semantics, constrained_table_name);
        final SubLObject constrained_column = semantic_etl_bus.table_semantics_get_column_named(constrained_table, constrained_column_name);
        final SubLObject constraining_table = semantic_etl_bus.semantics_get_table_named(semantics, constraining_table_name);
        final SubLObject constraining_column = semantic_etl_bus.table_semantics_get_column_named(constraining_table, constraining_column_name);
        final SubLObject constraint = semantic_etl_bus.new_foreign_key_constraint(constraint_name, constrained_column, constraining_column);
        return constraint;
    }
    
    public static SubLObject declare_metadata_parser_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "semantic_etl_parse_metadata", "SEMANTIC-ETL-PARSE-METADATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "new_metadata", "NEW-METADATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "metadata_p", "METADATA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "metadata_access_path", "METADATA-ACCESS-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "metadata_tables_meta_data", "METADATA-TABLES-META-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "table_metadata_table_name", "TABLE-METADATA-TABLE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "table_metadata_column_metadata", "TABLE-METADATA-COLUMN-METADATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "table_metadata_exported_keys_info", "TABLE-METADATA-EXPORTED-KEYS-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "table_metadata_primary_key_info", "TABLE-METADATA-PRIMARY-KEY-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "table_metadata_primary_key_column_names", "TABLE-METADATA-PRIMARY-KEY-COLUMN-NAMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "table_metadata_imported_key_info", "TABLE-METADATA-IMPORTED-KEY-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "table_metadata_imported_key_column_names", "TABLE-METADATA-IMPORTED-KEY-COLUMN-NAMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "column_metadata_column_name", "COLUMN-METADATA-COLUMN-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "column_metadata_column_type", "COLUMN-METADATA-COLUMN-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "column_metadata_column_size", "COLUMN-METADATA-COLUMN-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "semantic_etl_acquire_metadata_list", "SEMANTIC-ETL-ACQUIRE-METADATA-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "semantic_etl_acquire_metadata", "SEMANTIC-ETL-ACQUIRE-METADATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "semantic_etl_convert_metadata_to_semantics", "SEMANTIC-ETL-CONVERT-METADATA-TO-SEMANTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "semantic_etl_parse_metadata_list_first_pass", "SEMANTIC-ETL-PARSE-METADATA-LIST-FIRST-PASS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "semantic_etl_parse_metadata_first_pass", "SEMANTIC-ETL-PARSE-METADATA-FIRST-PASS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "semantic_etl_parse_table_name", "SEMANTIC-ETL-PARSE-TABLE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "semantic_etl_parse_column_name", "SEMANTIC-ETL-PARSE-COLUMN-NAME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "non_relation_individual_p", "NON-RELATION-INDIVIDUAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "semantic_etl_parse_xref_metadata_list", "SEMANTIC-ETL-PARSE-XREF-METADATA-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "semantic_etl_parse_xref_metadata", "SEMANTIC-ETL-PARSE-XREF-METADATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "semantics_add_table_links", "SEMANTICS-ADD-TABLE-LINKS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "create_constraint_from_primary_key_info", "CREATE-CONSTRAINT-FROM-PRIMARY-KEY-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.metadata_parser", "create_constraint_from_exported_key_info", "CREATE-CONSTRAINT-FROM-EXPORTED-KEY-INFO", 2, 0, false);
        return (SubLObject)metadata_parser.NIL;
    }
    
    public static SubLObject init_metadata_parser_file() {
        return (SubLObject)metadata_parser.NIL;
    }
    
    public static SubLObject setup_metadata_parser_file() {
        return (SubLObject)metadata_parser.NIL;
    }
    
    public void declareFunctions() {
        declare_metadata_parser_file();
    }
    
    public void initializeVariables() {
        init_metadata_parser_file();
    }
    
    public void runTopLevelForms() {
        setup_metadata_parser_file();
    }
    
    static {
        me = (SubLFile)new metadata_parser();
        $kw0$METADATA = SubLObjectFactory.makeKeyword("METADATA");
        $kw1$TABLE_NAME = SubLObjectFactory.makeKeyword("TABLE-NAME");
        $kw2$COLUMN_METADATA = SubLObjectFactory.makeKeyword("COLUMN-METADATA");
        $kw3$EXPORTED_KEYS_INFO = SubLObjectFactory.makeKeyword("EXPORTED-KEYS-INFO");
        $kw4$PRIMARY_KEY_INFO = SubLObjectFactory.makeKeyword("PRIMARY-KEY-INFO");
        $kw5$COLUMN_NAME = SubLObjectFactory.makeKeyword("COLUMN-NAME");
        $kw6$IMPORTED_KEYS_INFO = SubLObjectFactory.makeKeyword("IMPORTED-KEYS-INFO");
        $kw7$FKCOLUMN_NAME = SubLObjectFactory.makeKeyword("FKCOLUMN-NAME");
        $kw8$TYPE_NAME = SubLObjectFactory.makeKeyword("TYPE-NAME");
        $kw9$COLUMN_SIZE = SubLObjectFactory.makeKeyword("COLUMN-SIZE");
        $str10$Problem_opening_connection_to_dat = SubLObjectFactory.makeString("Problem opening connection to database ~s");
        $str11$ = SubLObjectFactory.makeString("");
        $str12$_ = SubLObjectFactory.makeString("%");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("TABLE"));
        $kw14$ROW_COUNT = SubLObjectFactory.makeKeyword("ROW-COUNT");
        $kw15$INDEX_INFO = SubLObjectFactory.makeKeyword("INDEX-INFO");
        $kw16$UNDETERMINED = SubLObjectFactory.makeKeyword("UNDETERMINED");
        $sym17$COLUMN_SEMANTICS_COLUMN_NAME = SubLObjectFactory.makeSymbol("COLUMN-SEMANTICS-COLUMN-NAME");
        $str18$_ = SubLObjectFactory.makeString(" ");
        $str19$_ = SubLObjectFactory.makeString("_");
        $sym20$NON_RELATION_INDIVIDUAL_P = SubLObjectFactory.makeSymbol("NON-RELATION-INDIVIDUAL-P");
        $str21$Table_name_mismatch___s_vs___s = SubLObjectFactory.makeString("Table name mismatch: ~s vs. ~s");
        $sym22$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $kw23$FKTABLE_NAME = SubLObjectFactory.makeKeyword("FKTABLE-NAME");
        $sym24$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POINTED-TO-ID"), (SubLObject)SubLObjectFactory.makeSymbol("POINTS-TO-ID"));
        $sym26$TABLE_SEMANTICS_P = SubLObjectFactory.makeSymbol("TABLE-SEMANTICS-P");
        $kw27$PK_NAME = SubLObjectFactory.makeKeyword("PK-NAME");
        $sym28$SEMANTICS_P = SubLObjectFactory.makeSymbol("SEMANTICS-P");
        $kw29$FK_NAME = SubLObjectFactory.makeKeyword("FK-NAME");
        $kw30$PKTABLE_NAME = SubLObjectFactory.makeKeyword("PKTABLE-NAME");
        $kw31$PKCOLUMN_NAME = SubLObjectFactory.makeKeyword("PKCOLUMN-NAME");
    }
}

/*

	Total time: 161 ms
	
*/