package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;


import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_generation;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_generation.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NINE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sksi_csql_generation extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_csql_generation();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_generation";

    public static final String myFingerPrint = "beb3439ad36abf4a1ae8c213b4b286213186d6859938f38b2d1c05851bcf6d69";

    // deflexical
    public static final SubLSymbol $csql_default_db_equals$ = makeSymbol("*CSQL-DEFAULT-DB-EQUALS*");











    public static final SubLList $list5 = list(makeKeyword("COUNT"), makeKeyword("ALL"));



    private static final SubLList $list7 = list(NIL);

    private static final SubLSymbol INDEXICAL_FOR_PHYSICAL_FIELD = makeSymbol("INDEXICAL-FOR-PHYSICAL-FIELD");

    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");

    private static final SubLObject $$sqlAppendedToTableAtImport = reader_make_constant_shell(makeString("sqlAppendedToTableAtImport"));



    private static final SubLString $str12$__SKSI__A_ = makeString("~&SKSI-~A ");

    private static final SubLString $str13$_sksi_determine_csql_for_incremen = makeString("(sksi-determine-csql-for-incremental-edit ~S ~S ~S ~S ~S ~S)~%");



    private static final SubLString $str15$In_sksi_determine_csql_for_increm = makeString("In sksi-determine-csql-for-incremental-edit non-null-field ~S has no physical value~%");



    private static final SubLSymbol $AUTO_INCREMENT_DEFAULT = makeKeyword("AUTO-INCREMENT-DEFAULT");



    private static final SubLString $str19$In_sksi_determine_csql_for_increm = makeString("In sksi-determine-csql-for-incremental-edit (physical-field-value-is-auto-incremented? ~S ~S) -> ~A~%");

    private static final SubLString $str20$In_sksi_determine_csql_for_increm = makeString("In sksi-determine-csql-for-incremental-edit (integer-sequence-generator-for-physical-field ~S) -> ~S~%");





    private static final SubLList $list23 = list(makeSymbol("FROM-EXPRESSION"), makeSymbol("WHERE-EXPRESSIONS"));









    private static final SubLString $str28$Unknown_modification_operator__a_ = makeString("Unknown modification operator ~a, expected :insert or :delete");

    private static final SubLObject $$CSQLStrictlyEquals = reader_make_constant_shell(makeString("CSQLStrictlyEquals"));

    private static final SubLString $str30$TestLanguageSpoken_DB = makeString("TestLanguageSpoken-DB");

    private static final SubLObject $$Database_Physical = reader_make_constant_shell(makeString("Database-Physical"));

    private static final SubLObject $$FileHashTable_File = reader_make_constant_shell(makeString("FileHashTable-File"));

    private static final SubLObject $$WebPage_AIS = reader_make_constant_shell(makeString("WebPage-AIS"));

    private static final SubLObject $$RDFTripleStore_Physical = reader_make_constant_shell(makeString("RDFTripleStore-Physical"));

    private static final SubLString $str35$time_to_support_SELECT_for__S = makeString("time to support SELECT for ~S");









    private static final SubLList $list40 = list(makeSymbol("TABLE-ALIAS-TOKEN"), makeSymbol("TABLE-NAME"), makeSymbol("ALIAS"), makeSymbol("TABLE-NAMESPACE"));



    private static final SubLObject $$CSQLEquals = reader_make_constant_shell(makeString("CSQLEquals"));

    private static final SubLString $str43$time_to_support_WHERE__S = makeString("time to support WHERE ~S");

    private static final SubLObject $$StringObject = reader_make_constant_shell(makeString("StringObject"));



    private static final SubLString $str46$time_to_support_ORDER_BY_for__S = makeString("time to support ORDER BY for ~S");



    public static SubLObject sksi_determine_output_csql(final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject sk_source, final SubLObject input_termnums, final SubLObject output_termnums, final SubLObject input_physical_field_indexicals, final SubLObject eval_conditions, SubLObject canonicalizeP, SubLObject limit_count) {
        if (canonicalizeP == UNPROVIDED) {
            canonicalizeP = NIL;
        }
        if (limit_count == UNPROVIDED) {
            limit_count = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != limit_count) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(limit_count))) {
            throw new AssertionError(limit_count);
        }
        final SubLObject output_logical_field_indexicals = sksi_removal_module_generation.sksi_referenced_logical_field_indexicals(sentence, output_termnums);
        final SubLObject output_physical_field_indexicals = sksi_infrastructure_utilities.sksi_determine_relevant_physical_field_indexicals(output_logical_field_indexicals, logical_schemata, physical_schemata);
        final SubLObject fixed_physical_field_indexicals = sksi_infrastructure_utilities.sksi_determine_fixed_physical_field_indexicals(logical_schemata, physical_schemata);
        thread.resetMultipleValues();
        final SubLObject csql_field_select = sksi_determine_csql_field_select(sk_source, logical_schemata, physical_schemata, output_physical_field_indexicals, eval_conditions);
        SubLObject table_alias_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject csql_actual_field_select = sksi_interpret_csql_field_select(csql_field_select);
        SubLObject csql_where_clause = NIL;
        thread.resetMultipleValues();
        final SubLObject csql_where_clause_$1 = sksi_determine_csql_where_clause(sk_source, sentence, logical_schemata, physical_schemata, input_physical_field_indexicals, fixed_physical_field_indexicals, table_alias_list, eval_conditions);
        final SubLObject table_alias_list_$2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        csql_where_clause = csql_where_clause_$1;
        table_alias_list = table_alias_list_$2;
        final SubLObject csql_table_select = sksi_determine_csql_table_select(table_alias_list);
        if ((NIL == csql_actual_field_select) || (NIL == csql_table_select)) {
            return NIL;
        }
        final SubLObject csql = (NIL != limit_count) ? NIL != csql_where_clause ? list($SELECT, csql_actual_field_select, list($FROM, csql_table_select), list($WHERE, csql_where_clause), list($LIMIT, limit_count)) : list($SELECT, csql_actual_field_select, list($FROM, csql_table_select), list($LIMIT, limit_count)) : NIL != csql_where_clause ? list($SELECT, csql_actual_field_select, list($FROM, csql_table_select), list($WHERE, csql_where_clause)) : list($SELECT, csql_actual_field_select, list($FROM, csql_table_select));
        if (NIL != canonicalizeP) {
            return sksi_csql_utilities.canonicalize_csql(csql, UNPROVIDED, UNPROVIDED);
        }
        return csql;
    }

    public static SubLObject sksi_interpret_csql_field_select(final SubLObject csql_field_select) {
        return NIL != csql_field_select ? csql_field_select : $list5;
    }

    public static SubLObject sksi_make_boolean_csql_query(final SubLObject from, final SubLObject where) {
        final SubLObject csql = list($SELECT, $list5, list($FROM, from), list($WHERE, where));
        return csql;
    }

    public static SubLObject sksi_determine_csql_for_batch_translate(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject physical_field_indexicals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject csql_field_select = sksi_determine_csql_field_select_for_batch_translate(sk_source, physical_schema, physical_field_indexicals);
        final SubLObject table_alias_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject csql_table_select = sksi_determine_csql_table_select(table_alias_list);
        final SubLObject csql_order_by = sksi_determine_csql_order_by_for_batch_translate(sk_source, physical_schema, physical_field_indexicals);
        final SubLObject additional_sql = sksi_additional_sql_for_batch_translate(sk_source);
        if ((NIL != csql_field_select) && (NIL != csql_table_select)) {
            final SubLObject csql = listS($SELECT, csql_field_select, list($FROM, csql_table_select), append(NIL != additional_sql ? list(list($WHERE, list(list($RAW, additional_sql)))) : NIL != csql_order_by ? $list7 : NIL, NIL != csql_order_by ? list(csql_order_by) : NIL, NIL));
            return csql;
        }
        return NIL;
    }

    public static SubLObject sksi_determine_csql_field_select_for_batch_translate(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject output_physical_field_indexicals) {
        return sksi_determine_csql_field_select(sk_source, NIL, list(physical_schema), output_physical_field_indexicals, NIL);
    }

    public static SubLObject sksi_determine_csql_order_by_for_batch_translate(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject physical_field_indexicals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sksi_batch_translate.$sksi_batch_sql_order_by_primary_keyP$.getDynamicValue(thread)) {
            final SubLObject pk_list = sksi_kb_accessors.physical_schema_primary_key_compensate_for_table_column_representation(physical_schema);
            final SubLObject pki_list = Mapping.mapcar(INDEXICAL_FOR_PHYSICAL_FIELD, pk_list);
            if ((NIL != pki_list) && (NIL != subsetp(pki_list, physical_field_indexicals, KBEQ, UNPROVIDED))) {
                return sksi_determine_csql_order_by(sk_source, NIL, list(physical_schema), pki_list);
            }
        }
        return NIL;
    }

    public static SubLObject sksi_additional_sql_for_batch_translate(final SubLObject sk_source) {
        final SubLObject sql = kb_mapping_utilities.fpred_value(sk_source, $$sqlAppendedToTableAtImport, ONE_INTEGER, TWO_INTEGER, $TRUE);
        if (sql.isString()) {
            return sql;
        }
        return NIL;
    }

    public static SubLObject sksi_determine_csql_for_incremental_edit(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject physical_fields, final SubLObject raw_tuple, final SubLObject operator, final SubLObject csql_conditions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(NINE_INTEGER)) {
            format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str12$__SKSI__A_, $str13$_sksi_determine_csql_for_incremen), new SubLObject[]{ NINE_INTEGER, sk_source, physical_schema, physical_fields, raw_tuple, operator, csql_conditions });
            force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        final SubLObject primary_key = sksi_kb_accessors.physical_schema_primary_key(physical_schema);
        SubLObject primary_key_value = NIL;
        thread.resetMultipleValues();
        SubLObject mod_physical_fields = remove_no_value_field_values_and_corresponding_fields(physical_fields, raw_tuple);
        SubLObject mod_raw_tuple = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (operator == $INSERT) {
            final SubLObject non_null_fields = sksi_kb_accessors.not_null_physical_fields_for_ps(physical_schema, UNPROVIDED);
            final SubLObject non_primary_key_non_null_fields = list_utilities.fast_set_difference(non_null_fields, primary_key, UNPROVIDED);
            SubLObject failP = NIL;
            if (NIL == failP) {
                SubLObject csome_list_var = non_primary_key_non_null_fields;
                SubLObject non_null_field = NIL;
                non_null_field = csome_list_var.first();
                while ((NIL == failP) && (NIL != csome_list_var)) {
                    if ((!position(non_null_field, mod_physical_fields, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).isInteger()) && (NIL != sksi_kb_accessors.null_default_physical_field_valueP(non_null_field, physical_schema))) {
                        if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(NINE_INTEGER)) {
                            format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str12$__SKSI__A_, $str15$In_sksi_determine_csql_for_increm), NINE_INTEGER, non_null_field);
                            force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
                        }
                        failP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    non_null_field = csome_list_var.first();
                } 
            }
            if (NIL != failP) {
                return values(NIL, NIL);
            }
        }
        if (NIL == primary_key) {
            return values(sksi_determine_csql_for_incremental_edit_int(sk_source, physical_schema, mod_physical_fields, mod_raw_tuple, operator, csql_conditions), NIL);
        }
        SubLObject seq_pkey = NIL;
        SubLObject failP2 = NIL;
        if (NIL == failP2) {
            SubLObject csome_list_var2 = primary_key;
            SubLObject pkey_element = NIL;
            pkey_element = csome_list_var2.first();
            while ((NIL == failP2) && (NIL != csome_list_var2)) {
                final SubLObject pkey_pos = position(pkey_element, mod_physical_fields, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (pkey_pos.isInteger()) {
                    primary_key_value = cons(nth(pkey_pos, mod_raw_tuple), primary_key_value);
                } else {
                    final SubLObject sequence = sksi_kb_accessors.integer_sequence_generator_for_physical_field(pkey_element);
                    if (NIL != sequence) {
                        if (operator != $DELETE) {
                            if (NIL != sksi_kb_accessors.physical_field_value_is_auto_incrementedP(pkey_element, physical_schema)) {
                                mod_raw_tuple = cons($AUTO_INCREMENT_DEFAULT, mod_raw_tuple);
                            } else {
                                final SubLObject seq_name = sksi_kb_accessors.integer_sequence_generator_name(sequence);
                                if (seq_name.isString()) {
                                    mod_raw_tuple = cons(list($NEXT_VALUE, seq_name), mod_raw_tuple);
                                } else {
                                    if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(NINE_INTEGER)) {
                                        format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str12$__SKSI__A_, $str19$In_sksi_determine_csql_for_increm), new SubLObject[]{ NINE_INTEGER, pkey_element, physical_schema, sksi_kb_accessors.physical_field_value_is_auto_incrementedP(pkey_element, physical_schema) });
                                        force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
                                    }
                                    failP2 = T;
                                }
                            }
                            if (NIL == failP2) {
                                mod_physical_fields = cons(pkey_element, mod_physical_fields);
                            }
                        }
                        if (NIL == failP2) {
                            seq_pkey = cons(sksi_kb_accessors.physical_field_name(pkey_element), seq_pkey);
                        }
                    } else {
                        if (NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP(NINE_INTEGER)) {
                            format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), cconcatenate($str12$__SKSI__A_, $str20$In_sksi_determine_csql_for_increm), new SubLObject[]{ NINE_INTEGER, pkey_element, sksi_kb_accessors.integer_sequence_generator_for_physical_field(pkey_element) });
                            force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
                        }
                        failP2 = T;
                    }
                }
                csome_list_var2 = csome_list_var2.rest();
                pkey_element = csome_list_var2.first();
            } 
        }
        if (NIL != failP2) {
            return values(NIL, NIL);
        }
        if (NIL != seq_pkey) {
            return values(sksi_determine_csql_for_incremental_edit_int(sk_source, physical_schema, mod_physical_fields, mod_raw_tuple, operator, csql_conditions), nreverse(seq_pkey));
        }
        primary_key_value = nreverse(primary_key_value);
        if ((operator == $DELETE) && (NIL != list_utilities.sets_equalP(primary_key, mod_physical_fields, UNPROVIDED))) {
            return values(sksi_determine_csql_for_incremental_edit_int(sk_source, physical_schema, mod_physical_fields, mod_raw_tuple, operator, csql_conditions), NIL);
        }
        if (operator == $DELETE) {
            thread.resetMultipleValues();
            final SubLObject csql_field_select = sksi_determine_csql_field_select_for_incremental_edit(sk_source, physical_schema, sksi_kb_accessors.indexicals_for_physical_fields(physical_fields));
            final SubLObject table_alias_list = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject csql_table_select = sksi_determine_csql_table_select(table_alias_list);
            final SubLObject csql_where_clause = sksi_determine_csql_where_clause_for_incremental_edit(mod_physical_fields, mod_raw_tuple, csql_conditions);
            return values(sksi_determine_csql_for_incremental_update(physical_schema, primary_key, mod_physical_fields, mod_raw_tuple, operator, csql_table_select, csql_where_clause, NIL), NIL);
        }
        thread.resetMultipleValues();
        final SubLObject current_tuple = sksi_get_row_from_table(sk_source, physical_schema, physical_fields, primary_key, primary_key_value, NIL);
        final SubLObject csql_field_select2 = thread.secondMultipleValue();
        final SubLObject csql_table_select = thread.thirdMultipleValue();
        final SubLObject csql_where_clause = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (((NIL == csql_field_select2) || (NIL == csql_table_select)) || (NIL == csql_where_clause)) {
            return values(NIL, NIL);
        }
        if (NIL != current_tuple) {
            return values(sksi_determine_csql_for_incremental_update(physical_schema, primary_key, mod_physical_fields, mod_raw_tuple, operator, csql_table_select, csql_where_clause, csql_conditions), NIL);
        }
        return values(sksi_determine_csql_for_incremental_edit_int(sk_source, physical_schema, mod_physical_fields, mod_raw_tuple, operator, csql_conditions), NIL);
    }

    public static SubLObject sksi_get_row_from_table(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject physical_fields, final SubLObject bound_fields, final SubLObject bound_field_values, final SubLObject csql_conditions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject csql_field_select = sksi_determine_csql_field_select_for_incremental_edit(sk_source, physical_schema, sksi_kb_accessors.indexicals_for_physical_fields(physical_fields));
        final SubLObject table_alias_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject csql_table_select = sksi_determine_csql_table_select(table_alias_list);
        final SubLObject csql_where_clause = sksi_determine_csql_where_clause_for_incremental_edit(bound_fields, bound_field_values, csql_conditions);
        if (((NIL == csql_field_select) || (NIL == csql_table_select)) || (NIL == csql_where_clause)) {
            return values(NIL, NIL, NIL);
        }
        final SubLObject access_path = sksi_access_path.external_source_access_path(sk_source, physical_schema, UNPROVIDED);
        final SubLObject query_csql = list($SELECT, csql_field_select, list($FROM, csql_table_select), list($WHERE, csql_where_clause));
        final SubLObject result_set = sksi_sks_interaction.generate_sdbc_result_set_from_csql(query_csql, access_path, $BATCH);
        SubLObject current_tuple = NIL;
        if (NIL != sdbc.sql_result_set_p(result_set)) {
            sdbc.sqlrs_next(result_set);
            current_tuple = sksi_result_set_iterators.sqlrs_current_row_as_list(result_set);
            sksi_result_set_iterators.finalize_result_set(result_set);
            return values(current_tuple, csql_field_select, csql_table_select, csql_where_clause);
        }
        return NIL;
    }

    public static SubLObject sksi_find_primary_key_value_for_raw_tuple(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject physical_fields, final SubLObject raw_tuple, final SubLObject csql_conditions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject mod_physical_fields = remove_no_value_field_values_and_corresponding_fields(physical_fields, raw_tuple);
        final SubLObject mod_raw_tuple = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject current_tuple = sksi_get_row_from_table(sk_source, physical_schema, physical_fields, mod_physical_fields, mod_raw_tuple, csql_conditions);
        if (NIL != current_tuple) {
            final SubLObject primary_key = sksi_kb_accessors.physical_schema_primary_key(physical_schema);
            SubLObject primary_key_value = NIL;
            SubLObject cdolist_list_var = primary_key;
            SubLObject pkey_field = NIL;
            pkey_field = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject pkey_value = nth(position(pkey_field, physical_fields, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), current_tuple);
                primary_key_value = cons(list(pkey_field, pkey_value), primary_key_value);
                cdolist_list_var = cdolist_list_var.rest();
                pkey_field = cdolist_list_var.first();
            } 
            return values(nreverse(primary_key_value), list_utilities.sublisp_boolean(current_tuple));
        }
        return NIL;
    }

    public static SubLObject remove_no_value_field_values_and_corresponding_fields(final SubLObject fields, final SubLObject field_values) {
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
        while ((NIL != field_value) || (NIL != field)) {
            if (field_value_$4 != $NO_VALUE) {
                new_fields = cons(field_$3, new_fields);
                new_field_values = cons(field_value_$4, new_field_values);
            }
            field = field.rest();
            field_$3 = field.first();
            field_value = field_value.rest();
            field_value_$4 = field_value.first();
        } 
        return values(nreverse(new_fields), nreverse(new_field_values));
    }

    public static SubLObject sksi_determine_csql_for_incremental_edit_int(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject physical_fields, final SubLObject raw_tuple, final SubLObject operator, final SubLObject csql_conditions) {
        if (operator.eql($INSERT)) {
            return sksi_determine_csql_for_incremental_edit_insert(sk_source, physical_schema, physical_fields, raw_tuple, csql_conditions);
        }
        if (operator.eql($DELETE)) {
            return sksi_determine_csql_for_incremental_edit_delete(sk_source, physical_schema, physical_fields, raw_tuple, csql_conditions);
        }
        return NIL;
    }

    public static SubLObject sksi_determine_csql_for_incremental_edit_delete(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject physical_fields, final SubLObject raw_tuple, final SubLObject csql_conditions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject where_clause = sksi_determine_csql_where_clause_for_incremental_edit(physical_fields, raw_tuple, csql_conditions);
        final SubLObject physical_field_indexicals = sksi_kb_accessors.indexicals_for_physical_fields(physical_fields);
        thread.resetMultipleValues();
        final SubLObject csql_field_select = sksi_determine_csql_field_select_for_incremental_edit(sk_source, physical_schema, physical_field_indexicals);
        final SubLObject table_alias_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject csql_table_select = sksi_determine_csql_table_select(table_alias_list);
        return list($DELETE, list($FROM, csql_table_select), list($WHERE, where_clause));
    }

    public static SubLObject simplify_raw_tuple_element(final SubLObject elem) {
        if (NIL != el_list_p(elem)) {
            return el_list_items(elem).first();
        }
        if (NIL != sksi_reformulate.disjunctive_reformulation_p(elem)) {
            return sksi_reformulate.disjunctive_reformulation_reformulations(elem).first();
        }
        return elem;
    }

    public static SubLObject sksi_determine_csql_for_incremental_edit_insert(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject physical_fields, final SubLObject raw_tuple, final SubLObject csql_conditions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject physical_field_indexicals = sksi_kb_accessors.indexicals_for_physical_fields(physical_fields);
        thread.resetMultipleValues();
        SubLObject csql_field_select = sksi_determine_csql_field_select_for_incremental_edit(sk_source, physical_schema, physical_field_indexicals);
        final SubLObject table_alias_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject csql_table_select = sksi_determine_csql_table_select(table_alias_list);
        if ((NIL != csql_field_select) && (NIL != csql_table_select)) {
            SubLObject new_raw_tuple = NIL;
            SubLObject cdolist_list_var = raw_tuple;
            SubLObject elem = NIL;
            elem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                new_raw_tuple = cons(simplify_raw_tuple_element(elem), new_raw_tuple);
                cdolist_list_var = cdolist_list_var.rest();
                elem = cdolist_list_var.first();
            } 
            new_raw_tuple = nreverse(new_raw_tuple);
            cdolist_list_var = csql_conditions;
            SubLObject condition = NIL;
            condition = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = condition;
                SubLObject from_expression = NIL;
                SubLObject where_expressions = NIL;
                destructuring_bind_must_consp(current, datum, $list23);
                from_expression = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list23);
                where_expressions = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject cdolist_list_var_$5 = where_expressions;
                    SubLObject where_expression = NIL;
                    where_expression = cdolist_list_var_$5.first();
                    while (NIL != cdolist_list_var_$5) {
                        if (NIL != sksi_csql_utilities.csql_equal_clause_p(where_expression)) {
                            final SubLObject arg1 = sksi_csql_utilities.csql_expression_arg(where_expression, ONE_INTEGER);
                            final SubLObject arg2 = sksi_csql_utilities.csql_expression_arg(where_expression, TWO_INTEGER);
                            if ((NIL != sksi_csql_utilities.csql_field_expression_p(arg1)) && (NIL == sksi_csql_utilities.csql_field_expression_p(arg2))) {
                                if (NIL == list_utilities.member_equalP(arg1, csql_field_select)) {
                                    csql_field_select = cons(arg1, csql_field_select);
                                    new_raw_tuple = cons(simplify_raw_tuple_element(arg2), new_raw_tuple);
                                }
                            } else
                                if (((NIL != sksi_csql_utilities.csql_field_expression_p(arg2)) && (NIL == sksi_csql_utilities.csql_field_expression_p(arg1))) && (NIL == list_utilities.member_equalP(arg2, csql_field_select))) {
                                    csql_field_select = cons(arg2, csql_field_select);
                                    new_raw_tuple = cons(simplify_raw_tuple_element(arg1), new_raw_tuple);
                                }

                        }
                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                        where_expression = cdolist_list_var_$5.first();
                    } 
                } else {
                    cdestructuring_bind_error(datum, $list23);
                }
                cdolist_list_var = cdolist_list_var.rest();
                condition = cdolist_list_var.first();
            } 
            return list($INSERT, list($INTO, csql_table_select), csql_field_select, list($VALUES, new_raw_tuple));
        }
        return NIL;
    }

    public static SubLObject sksi_determine_csql_field_select_for_incremental_edit(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject output_physical_field_indexicals) {
        return sksi_determine_csql_field_select(sk_source, NIL, list(physical_schema), output_physical_field_indexicals, NIL);
    }

    public static SubLObject sksi_determine_csql_where_clause_for_incremental_edit(final SubLObject physical_fields, final SubLObject values, final SubLObject csql_conditions) {
        SubLObject where_pairs = NIL;
        SubLObject pf = NIL;
        SubLObject pf_$6 = NIL;
        SubLObject pf_value = NIL;
        SubLObject pf_value_$7 = NIL;
        pf = physical_fields;
        pf_$6 = pf.first();
        pf_value = values;
        pf_value_$7 = pf_value.first();
        while ((NIL != pf_value) || (NIL != pf)) {
            final SubLObject field_name = sksi_kb_accessors.physical_field_name(pf_$6);
            final SubLObject table_name = sksi_kb_accessors.physical_field_sk_source_name(pf_$6);
            final SubLObject table_namespace = sksi_kb_accessors.physical_field_sk_source_namespace(pf_$6);
            final SubLObject field_csql = sksi_csql_utilities.construct_csql_field_expression(field_name, table_name, table_namespace);
            final SubLObject pair = sksi_csql_utilities.make_csql_expression($csql_default_db_equals$.getGlobalValue(), list(field_csql, pf_value_$7));
            where_pairs = cons(pair, where_pairs);
            pf = pf.rest();
            pf_$6 = pf.first();
            pf_value = pf_value.rest();
            pf_value_$7 = pf_value.first();
        } 
        where_pairs = nreverse(where_pairs);
        SubLObject cdolist_list_var = csql_conditions;
        SubLObject condition = NIL;
        condition = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = condition;
            SubLObject from_expression = NIL;
            SubLObject where_expressions = NIL;
            destructuring_bind_must_consp(current, datum, $list23);
            from_expression = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list23);
            where_expressions = current.first();
            current = current.rest();
            if (NIL == current) {
                where_pairs = append(where_pairs, where_expressions);
            } else {
                cdestructuring_bind_error(datum, $list23);
            }
            cdolist_list_var = cdolist_list_var.rest();
            condition = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(where_pairs, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_determine_csql_for_incremental_update(final SubLObject physical_schema, final SubLObject primary_key, final SubLObject mod_physical_fields, final SubLObject mod_raw_tuple, final SubLObject operator, final SubLObject csql_table_select, SubLObject csql_where_clause, final SubLObject csql_conditions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject rev_fields = remove_primary_key_fields_and_corresponding_values(primary_key, mod_physical_fields, mod_raw_tuple);
        final SubLObject rev_tuple = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == rev_fields) {
            return NIL;
        }
        SubLObject cdolist_list_var = csql_conditions;
        SubLObject condition = NIL;
        condition = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = condition;
            SubLObject from_expression = NIL;
            SubLObject where_expressions = NIL;
            destructuring_bind_must_consp(current, datum, $list23);
            from_expression = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list23);
            where_expressions = current.first();
            current = current.rest();
            if (NIL == current) {
                csql_where_clause = append(csql_where_clause, where_expressions);
            } else {
                cdestructuring_bind_error(datum, $list23);
            }
            cdolist_list_var = cdolist_list_var.rest();
            condition = cdolist_list_var.first();
        } 
        if (operator.eql($INSERT)) {
            final SubLObject csql_set_clause = sksi_determine_csql_set_clause(rev_fields, rev_tuple);
            return list($UPDATE, csql_table_select, list($SET, csql_set_clause), list($WHERE, csql_where_clause));
        }
        if (operator.eql($DELETE)) {
            SubLObject csql_set_clause = NIL;
            SubLObject default_field_values = NIL;
            SubLObject cdolist_list_var2 = rev_fields;
            SubLObject field = NIL;
            field = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                default_field_values = cons(sksi_kb_accessors.physical_field_default_value(field, physical_schema, UNPROVIDED), default_field_values);
                cdolist_list_var2 = cdolist_list_var2.rest();
                field = cdolist_list_var2.first();
            } 
            default_field_values = nreverse(default_field_values);
            csql_set_clause = sksi_determine_csql_set_clause(rev_fields, default_field_values);
            return list($UPDATE, csql_table_select, list($SET, csql_set_clause), list($WHERE, csql_where_clause));
        }
        Errors.error($str28$Unknown_modification_operator__a_, operator);
        return NIL;
    }

    public static SubLObject remove_primary_key_fields_and_corresponding_values(final SubLObject primary_key, final SubLObject physical_fields, final SubLObject raw_tuple) {
        SubLObject new_fields = copy_list(physical_fields);
        SubLObject new_tuple = copy_list(raw_tuple);
        SubLObject cdolist_list_var = primary_key;
        SubLObject pkey = NIL;
        pkey = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pos = position(pkey, physical_fields, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            new_fields = list_utilities.delete_nth(pos, new_fields);
            new_tuple = list_utilities.delete_nth(pos, new_tuple);
            cdolist_list_var = cdolist_list_var.rest();
            pkey = cdolist_list_var.first();
        } 
        return values(new_fields, new_tuple);
    }

    public static SubLObject sksi_determine_csql_set_clause(final SubLObject physical_fields, final SubLObject raw_tuple) {
        SubLObject set_pairs = NIL;
        SubLObject pf = NIL;
        SubLObject pf_$8 = NIL;
        SubLObject pf_value = NIL;
        SubLObject pf_value_$9 = NIL;
        pf = physical_fields;
        pf_$8 = pf.first();
        pf_value = raw_tuple;
        pf_value_$9 = pf_value.first();
        while ((NIL != pf_value) || (NIL != pf)) {
            final SubLObject field_name = sksi_kb_accessors.physical_field_name(pf_$8);
            final SubLObject table_name = sksi_kb_accessors.physical_field_sk_source_name(pf_$8);
            final SubLObject namespace = sksi_kb_accessors.physical_field_sk_source_namespace(pf_$8);
            final SubLObject pair = sksi_csql_utilities.make_csql_expression($$CSQLStrictlyEquals, list(sksi_csql_utilities.construct_csql_field_expression(field_name, table_name, namespace), simplify_raw_tuple_element(pf_value_$9)));
            set_pairs = cons(pair, set_pairs);
            pf = pf.rest();
            pf_$8 = pf.first();
            pf_value = pf_value.rest();
            pf_value_$9 = pf_value.first();
        } 
        set_pairs = nreverse(set_pairs);
        return set_pairs;
    }

    public static SubLObject sksi_determine_csql_field_select(final SubLObject sk_source, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject output_physical_field_indexicals, final SubLObject eval_conditions) {
        if ((NIL != constant_p(sk_source)) && constants_high.constant_name(sk_source).equal($str30$TestLanguageSpoken_DB)) {
            return sksi_determine_db_csql_field_select(sk_source, logical_schemata, physical_schemata, output_physical_field_indexicals, eval_conditions);
        }
        final SubLObject physical_schema = physical_schemata.first();
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = sksi_access_path.determine_sks_type(sk_source, UNPROVIDED);
        if (pcase_var.eql($$Database_Physical)) {
            return sksi_determine_db_csql_field_select(sk_source, logical_schemata, physical_schemata, output_physical_field_indexicals, eval_conditions);
        }
        if (pcase_var.eql($$FileHashTable_File)) {
            return sksi_determine_fht_csql_field_select(physical_schema, output_physical_field_indexicals);
        }
        if (pcase_var.eql($$WebPage_AIS)) {
            return sksi_determine_web_csql_field_select(physical_schema, output_physical_field_indexicals);
        }
        if (pcase_var.eql($$RDFTripleStore_Physical)) {
            return sksi_determine_rdf_csql_field_select(sk_source, logical_schemata, physical_schemata, output_physical_field_indexicals, eval_conditions);
        }
        return Errors.error($str35$time_to_support_SELECT_for__S, type);
    }

    public static SubLObject sksi_determine_db_csql_field_select(final SubLObject sk_source, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject output_physical_field_indexicals, final SubLObject eval_conditions) {
        SubLObject csql_field_select = NIL;
        SubLObject pfi_table_list = NIL;
        SubLObject cdolist_list_var = output_physical_field_indexicals;
        SubLObject pfi = NIL;
        pfi = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject lfi = sksi_infrastructure_utilities.sksi_determine_relevant_logical_field_indexicals_for_physical_field_indexical(pfi, logical_schemata, physical_schemata).first();
            SubLObject lfi_eval_exp = find(lfi, eval_conditions, symbol_function(EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
            if (NIL != lfi_eval_exp) {
                lfi_eval_exp = second(lfi_eval_exp);
            }
            if (NIL != lfi_eval_exp) {
                csql_field_select = cons(lfi_eval_exp, csql_field_select);
            } else {
                final SubLObject table_name = sksi_kb_accessors.physical_field_indexical_sk_source_name(pfi);
                final SubLObject table_namespace = sksi_kb_accessors.physical_field_indexical_sk_source_namespace(pfi);
                SubLObject pfi_fort = NIL;
                SubLObject pfi_alias = NIL;
                SubLObject field_name = NIL;
                SubLObject pfi_table = NIL;
                if (NIL != table_name) {
                    if (NIL != sksi_kb_accessors.pfi_alias_fn_naut_p(pfi)) {
                        pfi_fort = sksi_kb_accessors.pfi_fort_for_pfi(pfi);
                        pfi_alias = sksi_kb_accessors.pfi_alias_fn_naut_index(pfi);
                        pfi_table = make_table_alias_name(table_name, pfi_alias);
                        pfi_table_list = cons(sksi_csql_utilities.make_table_alias(table_name, pfi_alias, table_namespace), pfi_table_list);
                    } else {
                        pfi_fort = pfi;
                        pfi_table = table_name;
                        pfi_table_list = cons(sksi_csql_utilities.make_table_alias(table_name, NIL, table_namespace), pfi_table_list);
                    }
                    field_name = sksi_kb_accessors.physical_field_name(sksi_kb_accessors.physical_field_for_indexical(pfi_fort));
                    csql_field_select = cons(sksi_csql_utilities.construct_csql_field_expression(field_name, pfi_table, table_namespace), csql_field_select);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pfi = cdolist_list_var.first();
        } 
        csql_field_select = nreverse(csql_field_select);
        pfi_table_list = nreverse(list_utilities.fast_delete_duplicates(pfi_table_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return values(csql_field_select, pfi_table_list);
    }

    public static SubLObject sksi_determine_fht_csql_field_select(final SubLObject physical_schema, final SubLObject output_physical_field_indexicals) {
        final SubLObject indexed_field_name = sksi_kb_accessors.sksi_determine_singly_indexed_schema_indexed_field(physical_schema);
        SubLObject csql_field_select = NIL;
        SubLObject pfi_table_list = NIL;
        SubLObject cdolist_list_var = output_physical_field_indexicals;
        SubLObject pfi = NIL;
        pfi = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject table_name = sksi_kb_accessors.physical_field_indexical_sk_source_name(pfi);
            final SubLObject table_namespace = sksi_kb_accessors.physical_field_indexical_sk_source_namespace(pfi);
            SubLObject pfi_fort = NIL;
            SubLObject pfi_alias = NIL;
            SubLObject field_name = NIL;
            if (NIL != sksi_kb_accessors.pfi_alias_fn_naut_p(pfi)) {
                pfi_fort = sksi_kb_accessors.pfi_fort_for_pfi(pfi);
                pfi_alias = sksi_kb_accessors.pfi_alias_fn_naut_index(pfi);
                pfi_table_list = cons(sksi_csql_utilities.make_table_alias(table_name, pfi_alias, table_namespace), pfi_table_list);
            } else {
                pfi_fort = pfi;
                pfi_table_list = cons(sksi_csql_utilities.make_table_alias(table_name, NIL, table_namespace), pfi_table_list);
            }
            field_name = sksi_kb_accessors.physical_field_name(pfi_fort);
            csql_field_select = cons(field_name.equal(indexed_field_name) ? list($KEY, field_name, table_name) : list($KEY_VALUE, field_name, table_name), csql_field_select);
            cdolist_list_var = cdolist_list_var.rest();
            pfi = cdolist_list_var.first();
        } 
        csql_field_select = nreverse(csql_field_select);
        pfi_table_list = nreverse(list_utilities.fast_delete_duplicates(pfi_table_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return values(csql_field_select, pfi_table_list);
    }

    public static SubLObject sksi_determine_web_csql_field_select(final SubLObject physical_schema, final SubLObject output_physical_field_indexicals) {
        final SubLObject required_field_names = sksi_kb_accessors.physical_schema_required_field_names(physical_schema);
        final SubLObject field_name_list = sksi_kb_accessors.physical_schema_field_name_list(physical_schema);
        SubLObject csql_field_select = NIL;
        SubLObject pfi_table_list = NIL;
        SubLObject cdolist_list_var = output_physical_field_indexicals;
        SubLObject pfi = NIL;
        pfi = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject table_name = sksi_kb_accessors.physical_field_indexical_sk_source_name(pfi);
            final SubLObject table_namespace = sksi_kb_accessors.physical_field_indexical_sk_source_namespace(pfi);
            SubLObject pfi_fort = NIL;
            SubLObject pfi_index = NIL;
            SubLObject field_name = NIL;
            if (NIL != sksi_kb_accessors.pfi_alias_fn_naut_p(pfi)) {
                pfi_fort = sksi_kb_accessors.pfi_fort_for_pfi(pfi);
                pfi_index = sksi_kb_accessors.pfi_alias_fn_naut_index(pfi);
                pfi_table_list = cons(sksi_csql_utilities.make_table_alias(table_name, pfi_index, table_namespace), pfi_table_list);
            } else {
                pfi_fort = pfi;
                pfi_table_list = cons(sksi_csql_utilities.make_table_alias(table_name, NIL, table_namespace), pfi_table_list);
            }
            field_name = sksi_kb_accessors.physical_field_name(pfi_fort);
            final SubLObject item_var = (NIL != member(field_name, required_field_names, symbol_function(EQUAL), UNPROVIDED)) ? list($KEY, field_name, table_name) : list($KEY_VALUE, field_name, table_name);
            if (NIL == member(item_var, csql_field_select, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                csql_field_select = cons(item_var, csql_field_select);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pfi = cdolist_list_var.first();
        } 
        csql_field_select = list_utilities.sort_via_position(csql_field_select, field_name_list, symbol_function(EQUAL), symbol_function(SECOND));
        pfi_table_list = nreverse(list_utilities.fast_delete_duplicates(pfi_table_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return values(csql_field_select, pfi_table_list);
    }

    public static SubLObject sksi_determine_rdf_csql_field_select(final SubLObject sk_source, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject output_physical_field_indexicals, final SubLObject eval_conditions) {
        return sksi_determine_db_csql_field_select(sk_source, logical_schemata, physical_schemata, output_physical_field_indexicals, eval_conditions);
    }

    public static SubLObject sksi_determine_csql_table_select(final SubLObject table_alias_list) {
        SubLObject table_csql = NIL;
        SubLObject cdolist_list_var = table_alias_list;
        SubLObject table_alias_tuple = NIL;
        table_alias_tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = table_alias_tuple;
            SubLObject table_alias_token = NIL;
            SubLObject table_name = NIL;
            SubLObject alias = NIL;
            SubLObject table_namespace = NIL;
            destructuring_bind_must_consp(current, datum, $list40);
            table_alias_token = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list40);
            table_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list40);
            alias = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list40);
            table_namespace = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject table_alias_name = (NIL != alias) ? make_table_alias_name(table_name, alias) : NIL;
                SubLObject table_expression = NIL;
                if (NIL != table_namespace) {
                    table_expression = list($TABLE, table_name, table_alias_name, table_namespace);
                } else
                    if (NIL != table_alias_name) {
                        table_expression = list($TABLE, table_name, table_alias_name);
                    } else {
                        table_expression = list($TABLE, table_name);
                    }

                table_csql = cons(table_expression, table_csql);
            } else {
                cdestructuring_bind_error(datum, $list40);
            }
            cdolist_list_var = cdolist_list_var.rest();
            table_alias_tuple = cdolist_list_var.first();
        } 
        return nreverse(table_csql);
    }

    public static SubLObject make_table_alias_name(final SubLObject table_name, final SubLObject alias) {
        return cconcatenate(table_name, string_utilities.object_to_string(alias));
    }

    public static SubLObject sksi_determine_csql_where_clause(final SubLObject sk_source, final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject input_physical_field_indexicals, final SubLObject fixed_physical_field_indexicals, final SubLObject table_alias_list, final SubLObject eval_conditions) {
        if ((NIL != constant_p(sk_source)) && constants_high.constant_name(sk_source).equal($str30$TestLanguageSpoken_DB)) {
            return sksi_determine_db_csql_where_clause(sentence, logical_schemata, physical_schemata, input_physical_field_indexicals, fixed_physical_field_indexicals, sk_source, table_alias_list, eval_conditions);
        }
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = sksi_access_path.determine_sks_type(sk_source, UNPROVIDED);
        if (pcase_var.eql($$Database_Physical)) {
            return sksi_determine_db_csql_where_clause(sentence, logical_schemata, physical_schemata, input_physical_field_indexicals, fixed_physical_field_indexicals, sk_source, table_alias_list, eval_conditions);
        }
        if (pcase_var.eql($$FileHashTable_File)) {
            return sksi_determine_fht_csql_where_clause(sentence, logical_schemata, physical_schemata, input_physical_field_indexicals, fixed_physical_field_indexicals, table_alias_list);
        }
        if (pcase_var.eql($$WebPage_AIS)) {
            return sksi_determine_web_csql_where_clause(sentence, logical_schemata, physical_schemata, input_physical_field_indexicals, fixed_physical_field_indexicals, table_alias_list);
        }
        if (pcase_var.eql($$RDFTripleStore_Physical)) {
            return sksi_determine_rdf_csql_where_clause(sentence, logical_schemata, physical_schemata, input_physical_field_indexicals, fixed_physical_field_indexicals, sk_source, table_alias_list, eval_conditions);
        }
        return Errors.error($str43$time_to_support_WHERE__S, type);
    }

    public static SubLObject sksi_determine_db_csql_where_clause(final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject input_physical_field_indexicals, final SubLObject fixed_physical_field_indexicals, final SubLObject sk_source, SubLObject table_alias_list, final SubLObject eval_conditions) {
        SubLObject equal_pairs = NIL;
        final SubLObject pfi_where_expressions = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject table_namespace = sksi_kb_accessors.sk_source_namespace(sk_source);
        SubLObject cdolist_list_var = fixed_physical_field_indexicals;
        SubLObject pfi = NIL;
        pfi = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pfi_table;
            final SubLObject table_name = pfi_table = sksi_kb_accessors.physical_field_indexical_sk_source_name(pfi);
            final SubLObject fixed_value = sksi_fixed_physical_field_indexical_value(pfi, logical_schemata, physical_schemata);
            final SubLObject pf = sksi_kb_accessors.physical_field_for_indexical(pfi);
            if (NIL != pf) {
                final SubLObject field_name = sksi_kb_accessors.physical_field_name(pf);
                final SubLObject field_expression = sksi_csql_utilities.construct_csql_field_expression(field_name, pfi_table, table_namespace);
                final SubLObject pair = (NIL != kb_utilities.kbeq($$StringObject, sksi_kb_accessors.physical_field_data_type(pf))) ? list($$CSQLEquals, field_expression, fixed_value) : list($csql_default_db_equals$.getGlobalValue(), field_expression, fixed_value);
                equal_pairs = cons(pair, equal_pairs);
                dictionary.dictionary_enter(pfi_where_expressions, pfi, pair);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pfi = cdolist_list_var.first();
        } 
        SubLObject list_var = NIL;
        pfi = NIL;
        SubLObject pfi_index = NIL;
        list_var = input_physical_field_indexicals;
        pfi = list_var.first();
        for (pfi_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , pfi = list_var.first() , pfi_index = add(ONE_INTEGER, pfi_index)) {
            final SubLObject lfi = sksi_infrastructure_utilities.sksi_determine_relevant_logical_field_indexicals_for_physical_field_indexical(pfi, logical_schemata, physical_schemata).first();
            SubLObject lfi_eval_exp = find(lfi, eval_conditions, symbol_function(EQUAL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
            if (NIL != lfi_eval_exp) {
                lfi_eval_exp = second(lfi_eval_exp);
            }
            final SubLObject table_name2 = sksi_kb_accessors.physical_field_indexical_sk_source_name(pfi);
            final SubLObject table_namespace_$10 = sksi_kb_accessors.physical_field_indexical_sk_source_namespace(pfi);
            SubLObject pfi_fort = NIL;
            SubLObject pfi_alias = NIL;
            SubLObject pfi_table2 = NIL;
            if (table_name2.isString() && (NIL == lfi_eval_exp)) {
                if (NIL != sksi_kb_accessors.pfi_alias_fn_naut_p(pfi)) {
                    pfi_fort = sksi_kb_accessors.pfi_fort_for_pfi(pfi);
                    pfi_alias = sksi_kb_accessors.pfi_alias_fn_naut_index(pfi);
                    pfi_table2 = make_table_alias_name(table_name2, pfi_alias);
                    table_alias_list = cons(sksi_csql_utilities.make_table_alias(table_name2, pfi_alias, table_namespace_$10), table_alias_list);
                } else {
                    pfi_fort = pfi;
                    pfi_table2 = table_name2;
                    table_alias_list = cons(sksi_csql_utilities.make_table_alias(table_name2, NIL, table_namespace_$10), table_alias_list);
                }
            }
            final SubLObject termnum = number_utilities.f_1X(pfi_index);
            final SubLObject raw_symbol = sksi_removal_module_generation.token_raw_symbol_for_termnum(termnum);
            SubLObject pair2 = NIL;
            if (NIL != lfi_eval_exp) {
                pair2 = list($$CSQLEquals, lfi_eval_exp, list($VALUE, raw_symbol));
            } else {
                final SubLObject pf2 = sksi_kb_accessors.physical_field_for_indexical(pfi_fort);
                if (NIL != pf2) {
                    final SubLObject field_name2 = sksi_kb_accessors.physical_field_name(pf2);
                    final SubLObject field_expression2 = sksi_csql_utilities.construct_csql_field_expression(field_name2, pfi_table2, table_namespace_$10);
                    pair2 = (NIL != kb_utilities.kbeq($$StringObject, sksi_kb_accessors.physical_field_data_type(pf2))) ? list($$CSQLEquals, field_expression2, list($VALUE, raw_symbol)) : list($csql_default_db_equals$.getGlobalValue(), field_expression2, list($VALUE, raw_symbol));
                }
            }
            if (NIL != pair2) {
                equal_pairs = cons(pair2, equal_pairs);
                dictionary.dictionary_enter(pfi_where_expressions, pfi, pair2);
                dictionary.dictionary_enter(pfi_where_expressions, sksi_kb_accessors.pfi_fort_for_pfi(pfi), pair2);
            }
        }
        equal_pairs = nreverse(equal_pairs);
        table_alias_list = nreverse(list_utilities.fast_delete_duplicates(table_alias_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return values(equal_pairs, table_alias_list, pfi_where_expressions);
    }

    public static SubLObject sksi_fixed_physical_field_indexical_value(final SubLObject pfi, final SubLObject logical_schemata, final SubLObject physical_schemata) {
        return sksi_field_translation_utilities.get_field_encodings_for_physical_field_indexical(pfi, logical_schemata, physical_schemata).first();
    }

    public static SubLObject sksi_determine_web_csql_where_clause(final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject input_physical_field_indexicals, final SubLObject fixed_physical_field_indexicals, SubLObject table_alias_list) {
        final SubLObject physical_schema = physical_schemata.first();
        SubLObject equal_pairs = NIL;
        final SubLObject required_field_names = sksi_kb_accessors.physical_schema_required_field_names(physical_schema);
        SubLObject list_var = NIL;
        SubLObject pfi = NIL;
        SubLObject pfi_index = NIL;
        list_var = input_physical_field_indexicals;
        pfi = list_var.first();
        for (pfi_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , pfi = list_var.first() , pfi_index = add(ONE_INTEGER, pfi_index)) {
            final SubLObject table_name = sksi_kb_accessors.physical_field_indexical_sk_source_name(pfi);
            final SubLObject table_namespace = sksi_kb_accessors.physical_field_indexical_sk_source_namespace(pfi);
            SubLObject pfi_fort = NIL;
            SubLObject pfi_alias = NIL;
            final SubLObject pfi_table = NIL;
            if (NIL != sksi_kb_accessors.pfi_alias_fn_naut_p(pfi)) {
                pfi_fort = sksi_kb_accessors.pfi_fort_for_pfi(pfi);
                pfi_alias = sksi_kb_accessors.pfi_alias_fn_naut_index(pfi);
                table_alias_list = cons(sksi_csql_utilities.make_table_alias(table_name, pfi_alias, table_namespace), table_alias_list);
            } else {
                pfi_fort = sksi_kb_accessors.pfi_fort_for_pfi(pfi);
                table_alias_list = cons(sksi_csql_utilities.make_table_alias(table_name, NIL, table_namespace), table_alias_list);
            }
            final SubLObject pf = sksi_kb_accessors.physical_field_for_indexical(pfi_fort);
            final SubLObject field_name = sksi_kb_accessors.physical_field_name(pf);
            final SubLObject termnum = number_utilities.f_1X(pfi_index);
            final SubLObject raw_symbol = sksi_removal_module_generation.token_raw_symbol_for_termnum(termnum);
            final SubLObject pair = (NIL != subl_promotions.memberP(field_name, required_field_names, symbol_function(EQUAL), UNPROVIDED)) ? list($$CSQLStrictlyEquals, list($KEY, field_name, table_name), list($VALUE, raw_symbol)) : list($$CSQLStrictlyEquals, list($KEY_VALUE, field_name, table_name), list($VALUE, raw_symbol));
            equal_pairs = cons(pair, equal_pairs);
        }
        equal_pairs = nreverse(equal_pairs);
        table_alias_list = nreverse(list_utilities.fast_delete_duplicates(table_alias_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return values(equal_pairs, table_alias_list);
    }

    public static SubLObject sksi_determine_fht_csql_where_clause(final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject input_physical_field_indexicals, final SubLObject fixed_physical_field_indexicals, SubLObject table_alias_list) {
        final SubLObject physical_schema = physical_schemata.first();
        SubLObject equal_pairs = NIL;
        final SubLObject indexed_field_name = sksi_kb_accessors.sksi_determine_singly_indexed_schema_indexed_field(physical_schema);
        SubLObject list_var = NIL;
        SubLObject pfi = NIL;
        SubLObject pfi_index = NIL;
        list_var = input_physical_field_indexicals;
        pfi = list_var.first();
        for (pfi_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , pfi = list_var.first() , pfi_index = add(ONE_INTEGER, pfi_index)) {
            final SubLObject table_name = sksi_kb_accessors.physical_field_indexical_sk_source_name(pfi);
            final SubLObject table_namespace = sksi_kb_accessors.physical_field_indexical_sk_source_namespace(pfi);
            SubLObject pfi_fort = NIL;
            SubLObject pfi_alias = NIL;
            final SubLObject pfi_table = NIL;
            if (NIL != sksi_kb_accessors.pfi_alias_fn_naut_p(pfi)) {
                pfi_fort = sksi_kb_accessors.pfi_fort_for_pfi(pfi);
                pfi_alias = sksi_kb_accessors.pfi_alias_fn_naut_index(pfi);
                table_alias_list = cons(sksi_csql_utilities.make_table_alias(table_name, pfi_alias, table_namespace), table_alias_list);
            } else {
                pfi_fort = sksi_kb_accessors.pfi_fort_for_pfi(pfi);
                table_alias_list = cons(sksi_csql_utilities.make_table_alias(table_name, NIL, table_namespace), table_alias_list);
            }
            final SubLObject pf = sksi_kb_accessors.physical_field_for_indexical(pfi_fort);
            final SubLObject field_name = sksi_kb_accessors.physical_field_name(pf);
            final SubLObject termnum = number_utilities.f_1X(pfi_index);
            final SubLObject raw_symbol = sksi_removal_module_generation.token_raw_symbol_for_termnum(termnum);
            final SubLObject pair = (field_name.equal(indexed_field_name)) ? list($$CSQLStrictlyEquals, list($KEY, field_name, table_name), list($VALUE, raw_symbol)) : list($$CSQLStrictlyEquals, list($KEY_VALUE, field_name, table_name), list($VALUE, raw_symbol));
            equal_pairs = cons(pair, equal_pairs);
        }
        equal_pairs = nreverse(equal_pairs);
        table_alias_list = nreverse(list_utilities.fast_delete_duplicates(table_alias_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return values(equal_pairs, table_alias_list);
    }

    public static SubLObject sksi_determine_rdf_csql_where_clause(final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject input_physical_field_indexicals, final SubLObject fixed_physical_field_indexicals, final SubLObject sk_source, final SubLObject table_alias_list, final SubLObject eval_conditions) {
        return sksi_determine_db_csql_where_clause(sentence, logical_schemata, physical_schemata, input_physical_field_indexicals, fixed_physical_field_indexicals, sk_source, table_alias_list, eval_conditions);
    }

    public static SubLObject sksi_determine_csql_order_by(final SubLObject sk_source, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject physical_field_indexicals) {
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = sksi_access_path.determine_sks_type(sk_source, UNPROVIDED);
        if (pcase_var.eql($$Database_Physical)) {
            return sksi_determine_db_csql_order_by(sk_source, logical_schemata, physical_schemata, physical_field_indexicals);
        }
        return Errors.error($str46$time_to_support_ORDER_BY_for__S, type);
    }

    public static SubLObject sksi_determine_db_csql_order_by(final SubLObject sk_source, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject physical_field_indexicals) {
        SubLObject csql_field_order_by = NIL;
        SubLObject pfi_table_list = NIL;
        SubLObject cdolist_list_var = physical_field_indexicals;
        SubLObject pfi = NIL;
        pfi = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject table_name = sksi_kb_accessors.physical_field_indexical_sk_source_name(pfi);
            final SubLObject table_namespace = sksi_kb_accessors.physical_field_indexical_sk_source_namespace(pfi);
            SubLObject pfi_fort = NIL;
            SubLObject pfi_alias = NIL;
            SubLObject field_name = NIL;
            SubLObject pfi_table = NIL;
            if (NIL != table_name) {
                if (NIL != sksi_kb_accessors.pfi_alias_fn_naut_p(pfi)) {
                    pfi_fort = sksi_kb_accessors.pfi_fort_for_pfi(pfi);
                    pfi_alias = sksi_kb_accessors.pfi_alias_fn_naut_index(pfi);
                    pfi_table = make_table_alias_name(table_name, pfi_alias);
                    pfi_table_list = cons(sksi_csql_utilities.make_table_alias(table_name, pfi_alias, table_namespace), pfi_table_list);
                } else {
                    pfi_fort = pfi;
                    pfi_table = table_name;
                    pfi_table_list = cons(sksi_csql_utilities.make_table_alias(table_name, NIL, table_namespace), pfi_table_list);
                }
                field_name = sksi_kb_accessors.physical_field_name(sksi_kb_accessors.physical_field_for_indexical(pfi_fort));
                csql_field_order_by = cons(list(sksi_csql_utilities.construct_csql_field_expression(field_name, pfi_table, table_namespace)), csql_field_order_by);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pfi = cdolist_list_var.first();
        } 
        csql_field_order_by = nreverse(csql_field_order_by);
        return list($ORDER_BY, csql_field_order_by);
    }

    public static SubLObject declare_sksi_csql_generation_file() {
        declareFunction(me, "sksi_determine_output_csql", "SKSI-DETERMINE-OUTPUT-CSQL", 8, 2, false);
        declareFunction(me, "sksi_interpret_csql_field_select", "SKSI-INTERPRET-CSQL-FIELD-SELECT", 1, 0, false);
        declareFunction(me, "sksi_make_boolean_csql_query", "SKSI-MAKE-BOOLEAN-CSQL-QUERY", 2, 0, false);
        declareFunction(me, "sksi_determine_csql_for_batch_translate", "SKSI-DETERMINE-CSQL-FOR-BATCH-TRANSLATE", 3, 0, false);
        declareFunction(me, "sksi_determine_csql_field_select_for_batch_translate", "SKSI-DETERMINE-CSQL-FIELD-SELECT-FOR-BATCH-TRANSLATE", 3, 0, false);
        declareFunction(me, "sksi_determine_csql_order_by_for_batch_translate", "SKSI-DETERMINE-CSQL-ORDER-BY-FOR-BATCH-TRANSLATE", 3, 0, false);
        declareFunction(me, "sksi_additional_sql_for_batch_translate", "SKSI-ADDITIONAL-SQL-FOR-BATCH-TRANSLATE", 1, 0, false);
        declareFunction(me, "sksi_determine_csql_for_incremental_edit", "SKSI-DETERMINE-CSQL-FOR-INCREMENTAL-EDIT", 6, 0, false);
        declareFunction(me, "sksi_get_row_from_table", "SKSI-GET-ROW-FROM-TABLE", 6, 0, false);
        declareFunction(me, "sksi_find_primary_key_value_for_raw_tuple", "SKSI-FIND-PRIMARY-KEY-VALUE-FOR-RAW-TUPLE", 5, 0, false);
        declareFunction(me, "remove_no_value_field_values_and_corresponding_fields", "REMOVE-NO-VALUE-FIELD-VALUES-AND-CORRESPONDING-FIELDS", 2, 0, false);
        declareFunction(me, "sksi_determine_csql_for_incremental_edit_int", "SKSI-DETERMINE-CSQL-FOR-INCREMENTAL-EDIT-INT", 6, 0, false);
        declareFunction(me, "sksi_determine_csql_for_incremental_edit_delete", "SKSI-DETERMINE-CSQL-FOR-INCREMENTAL-EDIT-DELETE", 5, 0, false);
        declareFunction(me, "simplify_raw_tuple_element", "SIMPLIFY-RAW-TUPLE-ELEMENT", 1, 0, false);
        declareFunction(me, "sksi_determine_csql_for_incremental_edit_insert", "SKSI-DETERMINE-CSQL-FOR-INCREMENTAL-EDIT-INSERT", 5, 0, false);
        declareFunction(me, "sksi_determine_csql_field_select_for_incremental_edit", "SKSI-DETERMINE-CSQL-FIELD-SELECT-FOR-INCREMENTAL-EDIT", 3, 0, false);
        declareFunction(me, "sksi_determine_csql_where_clause_for_incremental_edit", "SKSI-DETERMINE-CSQL-WHERE-CLAUSE-FOR-INCREMENTAL-EDIT", 3, 0, false);
        declareFunction(me, "sksi_determine_csql_for_incremental_update", "SKSI-DETERMINE-CSQL-FOR-INCREMENTAL-UPDATE", 8, 0, false);
        declareFunction(me, "remove_primary_key_fields_and_corresponding_values", "REMOVE-PRIMARY-KEY-FIELDS-AND-CORRESPONDING-VALUES", 3, 0, false);
        declareFunction(me, "sksi_determine_csql_set_clause", "SKSI-DETERMINE-CSQL-SET-CLAUSE", 2, 0, false);
        declareFunction(me, "sksi_determine_csql_field_select", "SKSI-DETERMINE-CSQL-FIELD-SELECT", 5, 0, false);
        declareFunction(me, "sksi_determine_db_csql_field_select", "SKSI-DETERMINE-DB-CSQL-FIELD-SELECT", 5, 0, false);
        declareFunction(me, "sksi_determine_fht_csql_field_select", "SKSI-DETERMINE-FHT-CSQL-FIELD-SELECT", 2, 0, false);
        declareFunction(me, "sksi_determine_web_csql_field_select", "SKSI-DETERMINE-WEB-CSQL-FIELD-SELECT", 2, 0, false);
        declareFunction(me, "sksi_determine_rdf_csql_field_select", "SKSI-DETERMINE-RDF-CSQL-FIELD-SELECT", 5, 0, false);
        declareFunction(me, "sksi_determine_csql_table_select", "SKSI-DETERMINE-CSQL-TABLE-SELECT", 1, 0, false);
        declareFunction(me, "make_table_alias_name", "MAKE-TABLE-ALIAS-NAME", 2, 0, false);
        declareFunction(me, "sksi_determine_csql_where_clause", "SKSI-DETERMINE-CSQL-WHERE-CLAUSE", 8, 0, false);
        declareFunction(me, "sksi_determine_db_csql_where_clause", "SKSI-DETERMINE-DB-CSQL-WHERE-CLAUSE", 8, 0, false);
        declareFunction(me, "sksi_fixed_physical_field_indexical_value", "SKSI-FIXED-PHYSICAL-FIELD-INDEXICAL-VALUE", 3, 0, false);
        declareFunction(me, "sksi_determine_web_csql_where_clause", "SKSI-DETERMINE-WEB-CSQL-WHERE-CLAUSE", 6, 0, false);
        declareFunction(me, "sksi_determine_fht_csql_where_clause", "SKSI-DETERMINE-FHT-CSQL-WHERE-CLAUSE", 6, 0, false);
        declareFunction(me, "sksi_determine_rdf_csql_where_clause", "SKSI-DETERMINE-RDF-CSQL-WHERE-CLAUSE", 8, 0, false);
        declareFunction(me, "sksi_determine_csql_order_by", "SKSI-DETERMINE-CSQL-ORDER-BY", 4, 0, false);
        declareFunction(me, "sksi_determine_db_csql_order_by", "SKSI-DETERMINE-DB-CSQL-ORDER-BY", 4, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_csql_generation_file() {
        deflexical("*CSQL-DEFAULT-DB-EQUALS*", $$CSQLEquals);
        return NIL;
    }

    public static SubLObject setup_sksi_csql_generation_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_csql_generation_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_csql_generation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_csql_generation_file();
    }

    static {


















































    }
}

/**
 * Total time: 275 ms synthetic
 */
