package com.cyc.cycjava.cycl.sksi.sksi_widgets;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_A;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_code;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.accumulation;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class poise extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new poise();

    public static final String myName = "com.cyc.cycjava_2.cycl.sksi.sksi_widgets.poise";


    // deflexical
    public static final SubLSymbol $poise_normalization_schematic$ = makeSymbol("*POISE-NORMALIZATION-SCHEMATIC*");

    // deflexical
    public static final SubLSymbol $poise_normalization_columndef$ = makeSymbol("*POISE-NORMALIZATION-COLUMNDEF*");

    // deflexical
    public static final SubLSymbol $poise_normalization_cellrange$ = makeSymbol("*POISE-NORMALIZATION-CELLRANGE*");

    // deflexical
    private static final SubLSymbol $poise_normalization_name_kbq$ = makeSymbol("*POISE-NORMALIZATION-NAME-KBQ*");

    // deflexical
    private static final SubLSymbol $poise_normalization_data_kbq$ = makeSymbol("*POISE-NORMALIZATION-DATA-KBQ*");

    private static final SubLString $$$schemata = makeString("schemata");





    private static final SubLInteger $int$1527 = makeInteger(1527);



    private static final SubLString $$$poiseschema = makeString("poiseschema");

    private static final SubLString $str6$_ = makeString("!");

    private static final SubLList $list7 = list(makeKeyword("DBMS-SERVER"), makeSymbol("*DBMS-SERVER*"), makeKeyword("DBMS-PORT"), makeInteger(1527), makeKeyword("SUBPROTOCOL"), makeString("poisedata"));

    private static final SubLString $$$schematic = makeString("schematic");

    private static final SubLString $$$columndef = makeString("columndef");

    private static final SubLString $$$cellrange = makeString("cellrange");



    private static final SubLObject $$DreamcatcherNormalizationNameKBQ = reader_make_constant_shell(makeString("DreamcatcherNormalizationNameKBQ"));

    private static final SubLObject $$DreamcatcherNormalizationDataKBQ = reader_make_constant_shell(makeString("DreamcatcherNormalizationDataKBQ"));

    private static final SubLString $str14$Overriding_KBQ_MT_is_currently_no = makeString("Overriding KBQ MT is currently not supported.~%");

    private static final SubLSymbol $MV = makeKeyword("MV");

    private static final SubLString $str16$The_puported_Mapping_View__A_desc = makeString("The puported Mapping View ~A describes no normalization view in MT ~A.");

    private static final SubLSymbol $sym17$_ = makeSymbol("<");



    private static final SubLString $$$DELETE_FROM_ = makeString("DELETE FROM ");

    private static final SubLString $str20$_WHERE_SCHEMA_ID___ = makeString(" WHERE SCHEMA_ID = ");

    private static final SubLString $str21$_WHERE_id___ = makeString(" WHERE id = ");

    private static final SubLString $$$SELECT_id_FROM_ = makeString("SELECT id FROM ");

    private static final SubLString $str23$_WHERE_name____ = makeString(" WHERE name = '");

    private static final SubLString $str24$_ = makeString("'");

    private static final SubLString $$$INSERT_INTO_ = makeString("INSERT INTO ");

    private static final SubLString $str26$__NAME__VALUES___ = makeString(" (NAME) VALUES ('");

    private static final SubLString $str27$__ = makeString("')");

    private static final SubLString $str28$Failed_to_update__A_with_schema_n = makeString("Failed to update ~A with schema named ~A; old schema in the way?");

    private static final SubLSymbol POISE_COLUMN_DESCRIPTION_COLUMN_INDEX = makeSymbol("POISE-COLUMN-DESCRIPTION-COLUMN-INDEX");

    private static final SubLList $list30 = list(makeSymbol("&KEY"), makeSymbol("COLUMN-NAME"), makeSymbol("COLUMN-TYPE"), makeSymbol("COLUMN-INDEX"));

    private static final SubLList $list31 = list(makeKeyword("COLUMN-NAME"), makeKeyword("COLUMN-TYPE"), makeKeyword("COLUMN-INDEX"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    private static final SubLSymbol $COLUMN_INDEX = makeKeyword("COLUMN-INDEX");

    private static final SubLString $str36$insert_into_ColumnDef__schema_id_ = makeString("insert into ColumnDef (schema_id, colpos, colname, coltype) VALUES (");

    private static final SubLString $str37$__ = makeString(", ");

    private static final SubLString $str38$___ = makeString(", '");

    private static final SubLString $str39$____ = makeString("', '");

    private static final SubLList $list40 = cons(makeSymbol("ROW-START"), makeSymbol("ROW-END"));

    private static final SubLString $str41$insert_into_CellRange__schema_id_ = makeString("insert into CellRange (schema_id, grid_x, grid_y, start_col, start_row, end_col, end_row) VALUES ( ");

    private static final SubLString $str42$_ = makeString(")");

    private static final SubLSymbol $sym43$_COL = makeSymbol("?COL");

    private static final SubLSymbol $sym44$_TRRSTART = makeSymbol("?TRRSTART");

    private static final SubLSymbol $sym45$_TRREND = makeSymbol("?TRREND");

    private static final SubLSymbol $sym46$_PHYFIELDNAME = makeSymbol("?PHYFIELDNAME");

    private static final SubLSymbol $sym47$_COLTYPE = makeSymbol("?COLTYPE");

    private static final SubLInteger $int$26 = makeInteger(26);

    private static final SubLSymbol POISE_COLUMN_INDEX_FROM_SPREADSHEET_NAME = makeSymbol("POISE-COLUMN-INDEX-FROM-SPREADSHEET-NAME");













    private static final SubLList $list56 = list(list(list(makeString("A")), ZERO_INTEGER), list(list(makeString("B")), ONE_INTEGER), list(list(makeString("Z")), makeInteger(25)), list(list(makeString("AA")), makeInteger(26)));

    public static SubLObject connect_to_poise_schemata() {
        return sdbc.new_sql_connection($$$schemata, NIL, NIL, list($DBMS_SERVER, sdbc.$dbms_server$.getGlobalValue(), $DBMS_PORT, $int$1527, $SUBPROTOCOL, $$$poiseschema));
    }

    public static SubLObject connect_to_excel_file_sheet(final SubLObject excel_file, final SubLObject normalization) {
        return sdbc.new_sql_connection(cconcatenate(excel_file, new SubLObject[]{ $str6$_, normalization }), NIL, NIL, $list7);
    }

    public static SubLObject create_poise_normalization_schema(final SubLObject schema_name, final SubLObject description, SubLObject desc_mt) {
        if (desc_mt == UNPROVIDED) {
            desc_mt = NIL;
        }
        SubLTrampolineFile.enforceType(description, FORT_P);
        final SubLObject normalization = compile_poise_normalization_from_description(description, desc_mt);
        SubLObject v_psc = NIL;
        try {
            v_psc = connect_to_poise_schemata();
            possibly_remove_old_poise_schema(v_psc, schema_name);
            store_poise_normalization_schema(v_psc, schema_name, normalization);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sdbc.sql_connection_p(v_psc)) {
                    sdbc.sqlc_close(v_psc);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return schema_name;
    }

    public static SubLObject compile_poise_normalization_from_description(final SubLObject mapping_view, SubLObject desc_mt) {
        if (desc_mt == UNPROVIDED) {
            desc_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != desc_mt)) {
            Errors.error($str14$Overriding_KBQ_MT_is_currently_no);
        }
        final SubLObject binding_sets = kb_query.new_cyc_query_from_kbq($poise_normalization_data_kbq$.getGlobalValue(), NIL, list(cons($MV, mapping_view)));
        if (NIL == binding_sets) {
            Errors.error($str16$The_puported_Mapping_View__A_desc, mapping_view, desc_mt);
        }
        return extract_poise_data_from_binding_sets(binding_sets);
    }

    public static SubLObject extract_poise_data_from_binding_sets(final SubLObject binding_sets) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col_map = dictionary.new_dictionary(EQUAL, UNPROVIDED);
        final SubLObject col_ranges = dictionary.new_dictionary(EQUALP, UNPROVIDED);
        SubLObject cdolist_list_var = binding_sets;
        SubLObject binding_set = NIL;
        binding_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject col_description = extract_poise_data_from_binding_set(binding_set, col_map);
            final SubLObject row_range = thread.secondMultipleValue();
            thread.resetMultipleValues();
            map_utilities.map_push(col_ranges, col_description, row_range);
            cdolist_list_var = cdolist_list_var.rest();
            binding_set = cdolist_list_var.first();
        } 
        cdolist_list_var = map_utilities.map_keys(col_ranges);
        SubLObject col_description2 = NIL;
        col_description2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject row_range2 = map_utilities.map_get(col_ranges, col_description2, UNPROVIDED);
            map_utilities.map_put(col_ranges, col_description2, Sort.sort(row_range2, $sym17$_, FIRST));
            cdolist_list_var = cdolist_list_var.rest();
            col_description2 = cdolist_list_var.first();
        } 
        return col_ranges;
    }

    public static SubLObject possibly_remove_old_poise_schema(final SubLObject v_psc, final SubLObject schema_name) {
        final SubLObject pss = sdbc.sqlc_create_statement(v_psc);
        final SubLObject id = get_poise_schema_id(pss, schema_name);
        if (id.isNumber()) {
            SubLObject cdolist_list_var = list($poise_normalization_cellrange$.getGlobalValue(), $poise_normalization_columndef$.getGlobalValue());
            SubLObject table_name = NIL;
            table_name = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                sdbc.sqls_execute_update(pss, cconcatenate($$$DELETE_FROM_, new SubLObject[]{ format_nil.format_nil_a_no_copy(table_name), $str20$_WHERE_SCHEMA_ID___, format_nil.format_nil_a_no_copy(id) }));
                cdolist_list_var = cdolist_list_var.rest();
                table_name = cdolist_list_var.first();
            } 
            sdbc.sqls_execute_update(pss, cconcatenate($$$DELETE_FROM_, new SubLObject[]{ format_nil.format_nil_a_no_copy($poise_normalization_schematic$.getGlobalValue()), $str21$_WHERE_id___, format_nil.format_nil_a_no_copy(id) }));
        }
        return v_psc;
    }

    public static SubLObject get_poise_schema_id(final SubLObject pss, final SubLObject schema_name) {
        final SubLObject psrs = sdbc.sqls_execute_query(pss, cconcatenate($$$SELECT_id_FROM_, new SubLObject[]{ format_nil.format_nil_a_no_copy($poise_normalization_schematic$.getGlobalValue()), $str23$_WHERE_name____, format_nil.format_nil_a_no_copy(schema_name), $str24$_ }), UNPROVIDED);
        if (NIL == sdbc.sqlrs_emptyP(psrs)) {
            sdbc.sqlrs_next(psrs);
            final SubLObject id = sdbc.sqlrs_get_object(psrs, ONE_INTEGER);
            return id;
        }
        return NIL;
    }

    public static SubLObject store_poise_normalization_schema(final SubLObject v_psc, final SubLObject schema_name, final SubLObject normalization) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pss = sdbc.sqlc_create_statement(v_psc);
        SubLObject schema_id = NIL;
        SubLObject sql_cmds = NIL;
        sdbc.sqls_execute_update(pss, cconcatenate($$$INSERT_INTO_, new SubLObject[]{ format_nil.format_nil_a_no_copy($poise_normalization_schematic$.getGlobalValue()), $str26$__NAME__VALUES___, format_nil.format_nil_a_no_copy(schema_name), $str27$__ }));
        schema_id = get_poise_schema_id(pss, schema_name);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!schema_id.isNumber())) {
            Errors.error($str28$Failed_to_update__A_with_schema_n, $poise_normalization_schematic$.getGlobalValue(), schema_name);
        }
        sql_cmds = generate_sql_from_poise_schematic_description(schema_id, normalization, UNPROVIDED);
        SubLObject cdolist_list_var = accumulation.accumulation_contents(sql_cmds, UNPROVIDED);
        SubLObject sql_cmd = NIL;
        sql_cmd = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sdbc.sqls_execute_update(pss, sql_cmd);
            cdolist_list_var = cdolist_list_var.rest();
            sql_cmd = cdolist_list_var.first();
        } 
        return v_psc;
    }

    public static SubLObject generate_sql_from_poise_schematic_description(final SubLObject schema_id, final SubLObject col_ranges, SubLObject sql_acc) {
        if (sql_acc == UNPROVIDED) {
            sql_acc = accumulation.new_list_accumulator(UNPROVIDED);
        }
        SubLObject grid_x = ZERO_INTEGER;
        SubLObject list_var = NIL;
        SubLObject col_description = NIL;
        SubLObject col_id = NIL;
        list_var = Sort.sort(map_utilities.map_keys(col_ranges), $sym17$_, POISE_COLUMN_DESCRIPTION_COLUMN_INDEX);
        col_description = list_var.first();
        for (col_id = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , col_description = list_var.first() , col_id = add(ONE_INTEGER, col_id)) {
            final SubLObject row_ranges = map_utilities.map_get(col_ranges, col_description, UNPROVIDED);
            final SubLObject current;
            final SubLObject datum = current = col_description;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_$1 = NIL;
            while (NIL != rest) {
                destructuring_bind_must_consp(rest, datum, $list30);
                current_$1 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list30);
                if (NIL == member(current_$1, $list31, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_$1 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            } 
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list30);
            }
            final SubLObject column_name_tail = property_list_member($COLUMN_NAME, current);
            final SubLObject column_name = (NIL != column_name_tail) ? cadr(column_name_tail) : NIL;
            final SubLObject column_type_tail = property_list_member($COLUMN_TYPE, current);
            final SubLObject column_type = (NIL != column_type_tail) ? cadr(column_type_tail) : NIL;
            final SubLObject column_index_tail = property_list_member($COLUMN_INDEX, current);
            final SubLObject column_index = (NIL != column_index_tail) ? cadr(column_index_tail) : NIL;
            accumulation.accumulation_add(sql_acc, cconcatenate($str36$insert_into_ColumnDef__schema_id_, new SubLObject[]{ format_nil.format_nil_a_no_copy(schema_id), $str37$__, format_nil.format_nil_a_no_copy(col_id), $str38$___, format_nil.format_nil_a_no_copy(column_name), $str39$____, format_nil.format_nil_a_no_copy(column_type), $str27$__ }));
            SubLObject list_var_$2 = NIL;
            SubLObject row_range = NIL;
            SubLObject grid_y = NIL;
            list_var_$2 = row_ranges;
            row_range = list_var_$2.first();
            for (grid_y = ZERO_INTEGER; NIL != list_var_$2; list_var_$2 = list_var_$2.rest() , row_range = list_var_$2.first() , grid_y = add(ONE_INTEGER, grid_y)) {
                SubLObject current_$2;
                final SubLObject datum_$3 = current_$2 = row_range;
                SubLObject row_start = NIL;
                SubLObject row_end = NIL;
                destructuring_bind_must_consp(current_$2, datum_$3, $list40);
                row_start = current_$2.first();
                current_$2 = row_end = current_$2.rest();
                final SubLObject adjusted_row_start = subtract(row_start, ONE_INTEGER);
                final SubLObject adjusted_row_end = subtract(row_end, ONE_INTEGER);
                accumulation.accumulation_add(sql_acc, cconcatenate($str41$insert_into_CellRange__schema_id_, new SubLObject[]{ format_nil.format_nil_a_no_copy(schema_id), $str37$__, format_nil.format_nil_a_no_copy(grid_x), $str37$__, format_nil.format_nil_a_no_copy(grid_y), $str37$__, format_nil.format_nil_a_no_copy(column_index), $str37$__, format_nil.format_nil_a_no_copy(adjusted_row_start), $str37$__, format_nil.format_nil_a_no_copy(column_index), $str37$__, format_nil.format_nil_a_no_copy(adjusted_row_end), $str42$_ }));
            }
            grid_x = add(grid_x, ONE_INTEGER);
        }
        return sql_acc;
    }

    public static SubLObject poise_column_description_column_index(final SubLObject col_description) {
        return getf(col_description, $COLUMN_INDEX, UNPROVIDED);
    }

    public static SubLObject extract_poise_data_from_binding_set(final SubLObject binding_set, final SubLObject column_map) {
        final SubLObject col = list_utilities.alist_lookup(binding_set, $sym43$_COL, UNPROVIDED, UNPROVIDED);
        final SubLObject rowstart = list_utilities.alist_lookup(binding_set, $sym44$_TRRSTART, UNPROVIDED, UNPROVIDED);
        final SubLObject rowend = list_utilities.alist_lookup(binding_set, $sym45$_TRREND, UNPROVIDED, UNPROVIDED);
        final SubLObject field = list_utilities.alist_lookup(binding_set, $sym46$_PHYFIELDNAME, UNPROVIDED, UNPROVIDED);
        final SubLObject coltype = list_utilities.alist_lookup(binding_set, $sym47$_COLTYPE, UNPROVIDED, UNPROVIDED);
        SubLObject col_description = map_utilities.map_get(column_map, field, UNPROVIDED);
        if (NIL == col_description) {
            final SubLObject index = poise_column_index_from_spreadsheet_name(col);
            col_description = list($COLUMN_NAME, field, $COLUMN_TYPE, coltype, $COLUMN_INDEX, index);
            map_utilities.map_put(column_map, field, col_description);
        }
        return values(col_description, cons(rowstart, rowend));
    }

    public static SubLObject poise_column_index_from_spreadsheet_name(final SubLObject name) {
        SubLObject index = ZERO_INTEGER;
        SubLObject end_var_$5;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject curr;
        for (end_var = end_var_$5 = length(name), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$5); char_num = number_utilities.f_1X(char_num)) {
            curr = Strings.sublisp_char(name, char_num);
            index = add(multiply(index, $int$26), add(ONE_INTEGER, subtract(char_code(curr), char_code(CHAR_A))));
        }
        return subtract(index, ONE_INTEGER);
    }

    public static SubLObject declare_poise_file() {
        declareFunction("connect_to_poise_schemata", "CONNECT-TO-POISE-SCHEMATA", 0, 0, false);
        declareFunction("connect_to_excel_file_sheet", "CONNECT-TO-EXCEL-FILE-SHEET", 2, 0, false);
        declareFunction("create_poise_normalization_schema", "CREATE-POISE-NORMALIZATION-SCHEMA", 2, 1, false);
        declareFunction("compile_poise_normalization_from_description", "COMPILE-POISE-NORMALIZATION-FROM-DESCRIPTION", 1, 1, false);
        declareFunction("extract_poise_data_from_binding_sets", "EXTRACT-POISE-DATA-FROM-BINDING-SETS", 1, 0, false);
        declareFunction("possibly_remove_old_poise_schema", "POSSIBLY-REMOVE-OLD-POISE-SCHEMA", 2, 0, false);
        declareFunction("get_poise_schema_id", "GET-POISE-SCHEMA-ID", 2, 0, false);
        declareFunction("store_poise_normalization_schema", "STORE-POISE-NORMALIZATION-SCHEMA", 3, 0, false);
        declareFunction("generate_sql_from_poise_schematic_description", "GENERATE-SQL-FROM-POISE-SCHEMATIC-DESCRIPTION", 2, 1, false);
        declareFunction("poise_column_description_column_index", "POISE-COLUMN-DESCRIPTION-COLUMN-INDEX", 1, 0, false);
        declareFunction("extract_poise_data_from_binding_set", "EXTRACT-POISE-DATA-FROM-BINDING-SET", 2, 0, false);
        declareFunction("poise_column_index_from_spreadsheet_name", "POISE-COLUMN-INDEX-FROM-SPREADSHEET-NAME", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_poise_file() {
        deflexical("*POISE-NORMALIZATION-SCHEMATIC*", $$$schematic);
        deflexical("*POISE-NORMALIZATION-COLUMNDEF*", $$$columndef);
        deflexical("*POISE-NORMALIZATION-CELLRANGE*", $$$cellrange);
        deflexical("*POISE-NORMALIZATION-NAME-KBQ*", $$DreamcatcherNormalizationNameKBQ);
        deflexical("*POISE-NORMALIZATION-DATA-KBQ*", $$DreamcatcherNormalizationDataKBQ);
        return NIL;
    }

    public static SubLObject setup_poise_file() {
        define_test_case_table_int(POISE_COLUMN_INDEX_FROM_SPREADSHEET_NAME, list(new SubLObject[]{ $TEST, EQL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list56);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_poise_file();
    }

    @Override
    public void initializeVariables() {
        init_poise_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_poise_file();
    }

    
}

/**
 * Total time: 138 ms
 */
