package com.cyc.cycjava.cycl.sksi.sksi_widgets;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.accumulation;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class poise extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_widgets.poise";
    public static final String myFingerPrint = "f7ce2ba6422ab3f302c532e17a491660dce17c6629fc10ec09d4465e50d604a0";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/poise.lisp", position = 1533L)
    public static SubLSymbol $poise_normalization_schematic$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/poise.lisp", position = 1734L)
    public static SubLSymbol $poise_normalization_columndef$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/poise.lisp", position = 1872L)
    public static SubLSymbol $poise_normalization_cellrange$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/poise.lisp", position = 2746L)
    private static SubLSymbol $poise_normalization_name_kbq$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/poise.lisp", position = 3170L)
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
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/poise.lisp", position = 839L)
    public static SubLObject connect_to_poise_schemata() {
        return sdbc.new_sql_connection((SubLObject)poise.$str0$schemata, (SubLObject)poise.NIL, (SubLObject)poise.NIL, (SubLObject)ConsesLow.list((SubLObject)poise.$kw1$DBMS_SERVER, sdbc.$dbms_server$.getGlobalValue(), (SubLObject)poise.$kw2$DBMS_PORT, (SubLObject)poise.$int3$1527, (SubLObject)poise.$kw4$SUBPROTOCOL, (SubLObject)poise.$str5$poiseschema));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/poise.lisp", position = 1126L)
    public static SubLObject connect_to_excel_file_sheet(final SubLObject excel_file, final SubLObject normalization) {
        return sdbc.new_sql_connection(Sequences.cconcatenate(excel_file, new SubLObject[] { poise.$str6$_, normalization }), (SubLObject)poise.NIL, (SubLObject)poise.NIL, (SubLObject)poise.$list7);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/poise.lisp", position = 2013L)
    public static SubLObject create_poise_normalization_schema(final SubLObject schema_name, final SubLObject description, SubLObject desc_mt) {
        if (desc_mt == poise.UNPROVIDED) {
            desc_mt = (SubLObject)poise.NIL;
        }
        enforceType(description, poise.$sym11$FORT_P);
        final SubLObject normalization = compile_poise_normalization_from_description(description, desc_mt);
        SubLObject v_psc = (SubLObject)poise.NIL;
        try {
            v_psc = connect_to_poise_schemata();
            possibly_remove_old_poise_schema(v_psc, schema_name);
            store_poise_normalization_schema(v_psc, schema_name, normalization);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)poise.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (poise.NIL != sdbc.sql_connection_p(v_psc)) {
                    sdbc.sqlc_close(v_psc);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return schema_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/poise.lisp", position = 3317L)
    public static SubLObject compile_poise_normalization_from_description(final SubLObject mapping_view, SubLObject desc_mt) {
        if (desc_mt == poise.UNPROVIDED) {
            desc_mt = (SubLObject)poise.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (poise.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && poise.NIL != desc_mt) {
            Errors.error((SubLObject)poise.$str14$Overriding_KBQ_MT_is_currently_no);
        }
        final SubLObject binding_sets = kb_query.new_cyc_query_from_kbq(poise.$poise_normalization_data_kbq$.getGlobalValue(), (SubLObject)poise.NIL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)poise.$kw15$MV, mapping_view)));
        if (poise.NIL == binding_sets) {
            Errors.error((SubLObject)poise.$str16$The_puported_Mapping_View__A_desc, mapping_view, desc_mt);
        }
        return extract_poise_data_from_binding_sets(binding_sets);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/poise.lisp", position = 3866L)
    public static SubLObject extract_poise_data_from_binding_sets(final SubLObject binding_sets) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col_map = dictionary.new_dictionary((SubLObject)poise.EQUAL, (SubLObject)poise.UNPROVIDED);
        final SubLObject col_ranges = dictionary.new_dictionary((SubLObject)poise.EQUALP, (SubLObject)poise.UNPROVIDED);
        SubLObject cdolist_list_var = binding_sets;
        SubLObject binding_set = (SubLObject)poise.NIL;
        binding_set = cdolist_list_var.first();
        while (poise.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject col_description = extract_poise_data_from_binding_set(binding_set, col_map);
            final SubLObject row_range = thread.secondMultipleValue();
            thread.resetMultipleValues();
            map_utilities.map_push(col_ranges, col_description, row_range);
            cdolist_list_var = cdolist_list_var.rest();
            binding_set = cdolist_list_var.first();
        }
        cdolist_list_var = map_utilities.map_keys(col_ranges);
        SubLObject col_description2 = (SubLObject)poise.NIL;
        col_description2 = cdolist_list_var.first();
        while (poise.NIL != cdolist_list_var) {
            final SubLObject row_range2 = map_utilities.map_get(col_ranges, col_description2, (SubLObject)poise.UNPROVIDED);
            map_utilities.map_put(col_ranges, col_description2, Sort.sort(row_range2, (SubLObject)poise.$sym17$_, (SubLObject)poise.$sym18$FIRST));
            cdolist_list_var = cdolist_list_var.rest();
            col_description2 = cdolist_list_var.first();
        }
        return col_ranges;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/poise.lisp", position = 4559L)
    public static SubLObject possibly_remove_old_poise_schema(final SubLObject v_psc, final SubLObject schema_name) {
        final SubLObject pss = sdbc.sqlc_create_statement(v_psc);
        final SubLObject id = get_poise_schema_id(pss, schema_name);
        if (id.isNumber()) {
            SubLObject cdolist_list_var = (SubLObject)ConsesLow.list(poise.$poise_normalization_cellrange$.getGlobalValue(), poise.$poise_normalization_columndef$.getGlobalValue());
            SubLObject table_name = (SubLObject)poise.NIL;
            table_name = cdolist_list_var.first();
            while (poise.NIL != cdolist_list_var) {
                sdbc.sqls_execute_update(pss, Sequences.cconcatenate((SubLObject)poise.$str19$DELETE_FROM_, new SubLObject[] { format_nil.format_nil_a_no_copy(table_name), poise.$str20$_WHERE_SCHEMA_ID___, format_nil.format_nil_a_no_copy(id) }));
                cdolist_list_var = cdolist_list_var.rest();
                table_name = cdolist_list_var.first();
            }
            sdbc.sqls_execute_update(pss, Sequences.cconcatenate((SubLObject)poise.$str19$DELETE_FROM_, new SubLObject[] { format_nil.format_nil_a_no_copy(poise.$poise_normalization_schematic$.getGlobalValue()), poise.$str21$_WHERE_id___, format_nil.format_nil_a_no_copy(id) }));
        }
        return v_psc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/poise.lisp", position = 5172L)
    public static SubLObject get_poise_schema_id(final SubLObject pss, final SubLObject schema_name) {
        final SubLObject psrs = sdbc.sqls_execute_query(pss, Sequences.cconcatenate((SubLObject)poise.$str22$SELECT_id_FROM_, new SubLObject[] { format_nil.format_nil_a_no_copy(poise.$poise_normalization_schematic$.getGlobalValue()), poise.$str23$_WHERE_name____, format_nil.format_nil_a_no_copy(schema_name), poise.$str24$_ }), (SubLObject)poise.UNPROVIDED);
        if (poise.NIL == sdbc.sqlrs_emptyP(psrs)) {
            sdbc.sqlrs_next(psrs);
            final SubLObject id = sdbc.sqlrs_get_object(psrs, (SubLObject)poise.ONE_INTEGER);
            return id;
        }
        return (SubLObject)poise.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/poise.lisp", position = 5595L)
    public static SubLObject store_poise_normalization_schema(final SubLObject v_psc, final SubLObject schema_name, final SubLObject normalization) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pss = sdbc.sqlc_create_statement(v_psc);
        SubLObject schema_id = (SubLObject)poise.NIL;
        SubLObject sql_cmds = (SubLObject)poise.NIL;
        sdbc.sqls_execute_update(pss, Sequences.cconcatenate((SubLObject)poise.$str25$INSERT_INTO_, new SubLObject[] { format_nil.format_nil_a_no_copy(poise.$poise_normalization_schematic$.getGlobalValue()), poise.$str26$__NAME__VALUES___, format_nil.format_nil_a_no_copy(schema_name), poise.$str27$__ }));
        schema_id = get_poise_schema_id(pss, schema_name);
        if (poise.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !schema_id.isNumber()) {
            Errors.error((SubLObject)poise.$str28$Failed_to_update__A_with_schema_n, poise.$poise_normalization_schematic$.getGlobalValue(), schema_name);
        }
        sql_cmds = generate_sql_from_poise_schematic_description(schema_id, normalization, (SubLObject)poise.UNPROVIDED);
        SubLObject cdolist_list_var = accumulation.accumulation_contents(sql_cmds, (SubLObject)poise.UNPROVIDED);
        SubLObject sql_cmd = (SubLObject)poise.NIL;
        sql_cmd = cdolist_list_var.first();
        while (poise.NIL != cdolist_list_var) {
            sdbc.sqls_execute_update(pss, sql_cmd);
            cdolist_list_var = cdolist_list_var.rest();
            sql_cmd = cdolist_list_var.first();
        }
        return v_psc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/poise.lisp", position = 6390L)
    public static SubLObject generate_sql_from_poise_schematic_description(final SubLObject schema_id, final SubLObject col_ranges, SubLObject sql_acc) {
        if (sql_acc == poise.UNPROVIDED) {
            sql_acc = accumulation.new_list_accumulator((SubLObject)poise.UNPROVIDED);
        }
        SubLObject grid_x = (SubLObject)poise.ZERO_INTEGER;
        SubLObject list_var = (SubLObject)poise.NIL;
        SubLObject col_description = (SubLObject)poise.NIL;
        SubLObject col_id = (SubLObject)poise.NIL;
        list_var = Sort.sort(map_utilities.map_keys(col_ranges), (SubLObject)poise.$sym17$_, (SubLObject)poise.$sym29$POISE_COLUMN_DESCRIPTION_COLUMN_INDEX);
        col_description = list_var.first();
        for (col_id = (SubLObject)poise.ZERO_INTEGER; poise.NIL != list_var; list_var = list_var.rest(), col_description = list_var.first(), col_id = Numbers.add((SubLObject)poise.ONE_INTEGER, col_id)) {
            final SubLObject row_ranges = map_utilities.map_get(col_ranges, col_description, (SubLObject)poise.UNPROVIDED);
            final SubLObject current;
            final SubLObject datum = current = col_description;
            SubLObject allow_other_keys_p = (SubLObject)poise.NIL;
            SubLObject rest = current;
            SubLObject bad = (SubLObject)poise.NIL;
            SubLObject current_$1 = (SubLObject)poise.NIL;
            while (poise.NIL != rest) {
                cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)poise.$list30);
                current_$1 = rest.first();
                rest = rest.rest();
                cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)poise.$list30);
                if (poise.NIL == conses_high.member(current_$1, (SubLObject)poise.$list31, (SubLObject)poise.UNPROVIDED, (SubLObject)poise.UNPROVIDED)) {
                    bad = (SubLObject)poise.T;
                }
                if (current_$1 == poise.$kw32$ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if (poise.NIL != bad && poise.NIL == allow_other_keys_p) {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)poise.$list30);
            }
            final SubLObject column_name_tail = cdestructuring_bind.property_list_member((SubLObject)poise.$kw33$COLUMN_NAME, current);
            final SubLObject column_name = (SubLObject)((poise.NIL != column_name_tail) ? conses_high.cadr(column_name_tail) : poise.NIL);
            final SubLObject column_type_tail = cdestructuring_bind.property_list_member((SubLObject)poise.$kw34$COLUMN_TYPE, current);
            final SubLObject column_type = (SubLObject)((poise.NIL != column_type_tail) ? conses_high.cadr(column_type_tail) : poise.NIL);
            final SubLObject column_index_tail = cdestructuring_bind.property_list_member((SubLObject)poise.$kw35$COLUMN_INDEX, current);
            final SubLObject column_index = (SubLObject)((poise.NIL != column_index_tail) ? conses_high.cadr(column_index_tail) : poise.NIL);
            accumulation.accumulation_add(sql_acc, Sequences.cconcatenate((SubLObject)poise.$str36$insert_into_ColumnDef__schema_id_, new SubLObject[] { format_nil.format_nil_a_no_copy(schema_id), poise.$str37$__, format_nil.format_nil_a_no_copy(col_id), poise.$str38$___, format_nil.format_nil_a_no_copy(column_name), poise.$str39$____, format_nil.format_nil_a_no_copy(column_type), poise.$str27$__ }));
            SubLObject list_var_$2 = (SubLObject)poise.NIL;
            SubLObject row_range = (SubLObject)poise.NIL;
            SubLObject grid_y = (SubLObject)poise.NIL;
            list_var_$2 = row_ranges;
            row_range = list_var_$2.first();
            for (grid_y = (SubLObject)poise.ZERO_INTEGER; poise.NIL != list_var_$2; list_var_$2 = list_var_$2.rest(), row_range = list_var_$2.first(), grid_y = Numbers.add((SubLObject)poise.ONE_INTEGER, grid_y)) {
                SubLObject current_$2;
                final SubLObject datum_$3 = current_$2 = row_range;
                SubLObject row_start = (SubLObject)poise.NIL;
                SubLObject row_end = (SubLObject)poise.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$3, (SubLObject)poise.$list40);
                row_start = current_$2.first();
                current_$2 = (row_end = current_$2.rest());
                final SubLObject adjusted_row_start = Numbers.subtract(row_start, (SubLObject)poise.ONE_INTEGER);
                final SubLObject adjusted_row_end = Numbers.subtract(row_end, (SubLObject)poise.ONE_INTEGER);
                accumulation.accumulation_add(sql_acc, Sequences.cconcatenate((SubLObject)poise.$str41$insert_into_CellRange__schema_id_, new SubLObject[] { format_nil.format_nil_a_no_copy(schema_id), poise.$str37$__, format_nil.format_nil_a_no_copy(grid_x), poise.$str37$__, format_nil.format_nil_a_no_copy(grid_y), poise.$str37$__, format_nil.format_nil_a_no_copy(column_index), poise.$str37$__, format_nil.format_nil_a_no_copy(adjusted_row_start), poise.$str37$__, format_nil.format_nil_a_no_copy(column_index), poise.$str37$__, format_nil.format_nil_a_no_copy(adjusted_row_end), poise.$str42$_ }));
            }
            grid_x = Numbers.add(grid_x, (SubLObject)poise.ONE_INTEGER);
        }
        return sql_acc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/poise.lisp", position = 7740L)
    public static SubLObject poise_column_description_column_index(final SubLObject col_description) {
        return conses_high.getf(col_description, (SubLObject)poise.$kw35$COLUMN_INDEX, (SubLObject)poise.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/poise.lisp", position = 7851L)
    public static SubLObject extract_poise_data_from_binding_set(final SubLObject binding_set, final SubLObject column_map) {
        final SubLObject col = list_utilities.alist_lookup(binding_set, (SubLObject)poise.$sym43$_COL, (SubLObject)poise.UNPROVIDED, (SubLObject)poise.UNPROVIDED);
        final SubLObject rowstart = list_utilities.alist_lookup(binding_set, (SubLObject)poise.$sym44$_TRRSTART, (SubLObject)poise.UNPROVIDED, (SubLObject)poise.UNPROVIDED);
        final SubLObject rowend = list_utilities.alist_lookup(binding_set, (SubLObject)poise.$sym45$_TRREND, (SubLObject)poise.UNPROVIDED, (SubLObject)poise.UNPROVIDED);
        final SubLObject field = list_utilities.alist_lookup(binding_set, (SubLObject)poise.$sym46$_PHYFIELDNAME, (SubLObject)poise.UNPROVIDED, (SubLObject)poise.UNPROVIDED);
        final SubLObject coltype = list_utilities.alist_lookup(binding_set, (SubLObject)poise.$sym47$_COLTYPE, (SubLObject)poise.UNPROVIDED, (SubLObject)poise.UNPROVIDED);
        SubLObject col_description = map_utilities.map_get(column_map, field, (SubLObject)poise.UNPROVIDED);
        if (poise.NIL == col_description) {
            final SubLObject index = poise_column_index_from_spreadsheet_name(col);
            col_description = (SubLObject)ConsesLow.list((SubLObject)poise.$kw33$COLUMN_NAME, field, (SubLObject)poise.$kw34$COLUMN_TYPE, coltype, (SubLObject)poise.$kw35$COLUMN_INDEX, index);
            map_utilities.map_put(column_map, field, col_description);
        }
        return Values.values(col_description, (SubLObject)ConsesLow.cons(rowstart, rowend));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/poise.lisp", position = 8687L)
    public static SubLObject poise_column_index_from_spreadsheet_name(final SubLObject name) {
        SubLObject index = (SubLObject)poise.ZERO_INTEGER;
        SubLObject end_var_$5;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject curr;
        for (end_var = (end_var_$5 = Sequences.length(name)), char_num = (SubLObject)poise.NIL, char_num = (SubLObject)poise.ZERO_INTEGER; !char_num.numGE(end_var_$5); char_num = number_utilities.f_1X(char_num)) {
            curr = Strings.sublisp_char(name, char_num);
            index = Numbers.add(Numbers.multiply(index, (SubLObject)poise.$int48$26), Numbers.add((SubLObject)poise.ONE_INTEGER, Numbers.subtract(Characters.char_code(curr), Characters.char_code((SubLObject)Characters.CHAR_A))));
        }
        return Numbers.subtract(index, (SubLObject)poise.ONE_INTEGER);
    }
    
    public static SubLObject declare_poise_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.poise", "connect_to_poise_schemata", "CONNECT-TO-POISE-SCHEMATA", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.poise", "connect_to_excel_file_sheet", "CONNECT-TO-EXCEL-FILE-SHEET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.poise", "create_poise_normalization_schema", "CREATE-POISE-NORMALIZATION-SCHEMA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.poise", "compile_poise_normalization_from_description", "COMPILE-POISE-NORMALIZATION-FROM-DESCRIPTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.poise", "extract_poise_data_from_binding_sets", "EXTRACT-POISE-DATA-FROM-BINDING-SETS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.poise", "possibly_remove_old_poise_schema", "POSSIBLY-REMOVE-OLD-POISE-SCHEMA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.poise", "get_poise_schema_id", "GET-POISE-SCHEMA-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.poise", "store_poise_normalization_schema", "STORE-POISE-NORMALIZATION-SCHEMA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.poise", "generate_sql_from_poise_schematic_description", "GENERATE-SQL-FROM-POISE-SCHEMATIC-DESCRIPTION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.poise", "poise_column_description_column_index", "POISE-COLUMN-DESCRIPTION-COLUMN-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.poise", "extract_poise_data_from_binding_set", "EXTRACT-POISE-DATA-FROM-BINDING-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.poise", "poise_column_index_from_spreadsheet_name", "POISE-COLUMN-INDEX-FROM-SPREADSHEET-NAME", 1, 0, false);
        return (SubLObject)poise.NIL;
    }
    
    public static SubLObject init_poise_file() {
        poise.$poise_normalization_schematic$ = SubLFiles.deflexical("*POISE-NORMALIZATION-SCHEMATIC*", (SubLObject)poise.$str8$schematic);
        poise.$poise_normalization_columndef$ = SubLFiles.deflexical("*POISE-NORMALIZATION-COLUMNDEF*", (SubLObject)poise.$str9$columndef);
        poise.$poise_normalization_cellrange$ = SubLFiles.deflexical("*POISE-NORMALIZATION-CELLRANGE*", (SubLObject)poise.$str10$cellrange);
        poise.$poise_normalization_name_kbq$ = SubLFiles.deflexical("*POISE-NORMALIZATION-NAME-KBQ*", poise.$const12$DreamcatcherNormalizationNameKBQ);
        poise.$poise_normalization_data_kbq$ = SubLFiles.deflexical("*POISE-NORMALIZATION-DATA-KBQ*", poise.$const13$DreamcatcherNormalizationDataKBQ);
        return (SubLObject)poise.NIL;
    }
    
    public static SubLObject setup_poise_file() {
        generic_testing.define_test_case_table_int((SubLObject)poise.$sym49$POISE_COLUMN_INDEX_FROM_SPREADSHEET_NAME, (SubLObject)ConsesLow.list(new SubLObject[] { poise.$kw50$TEST, poise.EQL, poise.$kw51$OWNER, poise.NIL, poise.$kw52$CLASSES, poise.NIL, poise.$kw53$KB, poise.$kw54$TINY, poise.$kw55$WORKING_, poise.T }), (SubLObject)poise.$list56);
        return (SubLObject)poise.NIL;
    }
    
    public void declareFunctions() {
        declare_poise_file();
    }
    
    public void initializeVariables() {
        init_poise_file();
    }
    
    public void runTopLevelForms() {
        setup_poise_file();
    }
    
    static {
        me = (SubLFile)new poise();
        poise.$poise_normalization_schematic$ = null;
        poise.$poise_normalization_columndef$ = null;
        poise.$poise_normalization_cellrange$ = null;
        poise.$poise_normalization_name_kbq$ = null;
        poise.$poise_normalization_data_kbq$ = null;
        $str0$schemata = SubLObjectFactory.makeString("schemata");
        $kw1$DBMS_SERVER = SubLObjectFactory.makeKeyword("DBMS-SERVER");
        $kw2$DBMS_PORT = SubLObjectFactory.makeKeyword("DBMS-PORT");
        $int3$1527 = SubLObjectFactory.makeInteger(1527);
        $kw4$SUBPROTOCOL = SubLObjectFactory.makeKeyword("SUBPROTOCOL");
        $str5$poiseschema = SubLObjectFactory.makeString("poiseschema");
        $str6$_ = SubLObjectFactory.makeString("!");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DBMS-SERVER"), (SubLObject)SubLObjectFactory.makeSymbol("*DBMS-SERVER*"), (SubLObject)SubLObjectFactory.makeKeyword("DBMS-PORT"), (SubLObject)SubLObjectFactory.makeInteger(1527), (SubLObject)SubLObjectFactory.makeKeyword("SUBPROTOCOL"), (SubLObject)SubLObjectFactory.makeString("poisedata"));
        $str8$schematic = SubLObjectFactory.makeString("schematic");
        $str9$columndef = SubLObjectFactory.makeString("columndef");
        $str10$cellrange = SubLObjectFactory.makeString("cellrange");
        $sym11$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $const12$DreamcatcherNormalizationNameKBQ = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DreamcatcherNormalizationNameKBQ"));
        $const13$DreamcatcherNormalizationDataKBQ = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DreamcatcherNormalizationDataKBQ"));
        $str14$Overriding_KBQ_MT_is_currently_no = SubLObjectFactory.makeString("Overriding KBQ MT is currently not supported.~%");
        $kw15$MV = SubLObjectFactory.makeKeyword("MV");
        $str16$The_puported_Mapping_View__A_desc = SubLObjectFactory.makeString("The puported Mapping View ~A describes no normalization view in MT ~A.");
        $sym17$_ = SubLObjectFactory.makeSymbol("<");
        $sym18$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $str19$DELETE_FROM_ = SubLObjectFactory.makeString("DELETE FROM ");
        $str20$_WHERE_SCHEMA_ID___ = SubLObjectFactory.makeString(" WHERE SCHEMA_ID = ");
        $str21$_WHERE_id___ = SubLObjectFactory.makeString(" WHERE id = ");
        $str22$SELECT_id_FROM_ = SubLObjectFactory.makeString("SELECT id FROM ");
        $str23$_WHERE_name____ = SubLObjectFactory.makeString(" WHERE name = '");
        $str24$_ = SubLObjectFactory.makeString("'");
        $str25$INSERT_INTO_ = SubLObjectFactory.makeString("INSERT INTO ");
        $str26$__NAME__VALUES___ = SubLObjectFactory.makeString(" (NAME) VALUES ('");
        $str27$__ = SubLObjectFactory.makeString("')");
        $str28$Failed_to_update__A_with_schema_n = SubLObjectFactory.makeString("Failed to update ~A with schema named ~A; old schema in the way?");
        $sym29$POISE_COLUMN_DESCRIPTION_COLUMN_INDEX = SubLObjectFactory.makeSymbol("POISE-COLUMN-DESCRIPTION-COLUMN-INDEX");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("COLUMN-INDEX"));
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COLUMN-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("COLUMN-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("COLUMN-INDEX"));
        $kw32$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw33$COLUMN_NAME = SubLObjectFactory.makeKeyword("COLUMN-NAME");
        $kw34$COLUMN_TYPE = SubLObjectFactory.makeKeyword("COLUMN-TYPE");
        $kw35$COLUMN_INDEX = SubLObjectFactory.makeKeyword("COLUMN-INDEX");
        $str36$insert_into_ColumnDef__schema_id_ = SubLObjectFactory.makeString("insert into ColumnDef (schema_id, colpos, colname, coltype) VALUES (");
        $str37$__ = SubLObjectFactory.makeString(", ");
        $str38$___ = SubLObjectFactory.makeString(", '");
        $str39$____ = SubLObjectFactory.makeString("', '");
        $list40 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ROW-START"), (SubLObject)SubLObjectFactory.makeSymbol("ROW-END"));
        $str41$insert_into_CellRange__schema_id_ = SubLObjectFactory.makeString("insert into CellRange (schema_id, grid_x, grid_y, start_col, start_row, end_col, end_row) VALUES ( ");
        $str42$_ = SubLObjectFactory.makeString(")");
        $sym43$_COL = SubLObjectFactory.makeSymbol("?COL");
        $sym44$_TRRSTART = SubLObjectFactory.makeSymbol("?TRRSTART");
        $sym45$_TRREND = SubLObjectFactory.makeSymbol("?TRREND");
        $sym46$_PHYFIELDNAME = SubLObjectFactory.makeSymbol("?PHYFIELDNAME");
        $sym47$_COLTYPE = SubLObjectFactory.makeSymbol("?COLTYPE");
        $int48$26 = SubLObjectFactory.makeInteger(26);
        $sym49$POISE_COLUMN_INDEX_FROM_SPREADSHEET_NAME = SubLObjectFactory.makeSymbol("POISE-COLUMN-INDEX-FROM-SPREADSHEET-NAME");
        $kw50$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw51$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw52$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw53$KB = SubLObjectFactory.makeKeyword("KB");
        $kw54$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw55$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list56 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("A")), (SubLObject)poise.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("B")), (SubLObject)poise.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Z")), (SubLObject)SubLObjectFactory.makeInteger(25)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("AA")), (SubLObject)SubLObjectFactory.makeInteger(26)));
    }
}

/*

	Total time: 138 ms
	
*/