/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.modeling_tools;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg2;
import static com.cyc.cycjava.cycl.assertions_high.gaf_assertionP;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cycl_utilities.sentence_arg1;
import static com.cyc.cycjava.cycl.cycl_utilities.sentence_arg2;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_nat_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_list;
import static com.cyc.cycjava.cycl.el_utilities.make_quaternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.iteration.iteration_done;
import static com.cyc.cycjava.cycl.iteration.iteration_next;
import static com.cyc.cycjava.cycl.iteration.iteration_next_without_values_macro_helper;
import static com.cyc.cycjava.cycl.iteration.iterator_p;
import static com.cyc.cycjava.cycl.kb_mapping_macros.destroy_final_index_iterator;
import static com.cyc.cycjava.cycl.kb_mapping_macros.do_gaf_arg_index_key_validator;
import static com.cyc.cycjava.cycl.kb_mapping_macros.do_predicate_extent_index_key_validator;
import static com.cyc.cycjava.cycl.kb_mapping_macros.new_final_index_iterator;
import static com.cyc.cycjava.cycl.kb_mapping_macros.new_gaf_arg_final_index_spec_iterator;
import static com.cyc.cycjava.cycl.kb_mapping_macros.new_predicate_extent_final_index_spec_iterator;
import static com.cyc.cycjava.cycl.sdbc.sql_open_connection_p;
import static com.cyc.cycjava.cycl.sdbc.sql_result_set_p;
import static com.cyc.cycjava.cycl.sdbc.sqlc_close;
import static com.cyc.cycjava.cycl.sdbc.sqlc_create_statement;
import static com.cyc.cycjava.cycl.sdbc.sqlc_get_columns_meta_data;
import static com.cyc.cycjava.cycl.sdbc.sqlc_get_exported_keys_meta_data;
import static com.cyc.cycjava.cycl.sdbc.sqlc_get_imported_keys_meta_data;
import static com.cyc.cycjava.cycl.sdbc.sqlc_get_index_info_meta_data;
import static com.cyc.cycjava.cycl.sdbc.sqlc_get_primary_keys_meta_data;
import static com.cyc.cycjava.cycl.sdbc.sqlc_get_tables_meta_data;
import static com.cyc.cycjava.cycl.sdbc.sqls_execute_query;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.access_path_p;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path.external_source_access_path;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros.sksi_connections_for_sks_cache_add;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros.sksi_connections_for_sks_cache_get;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros.sksi_connections_for_sks_cache_remove;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction.$sksi_global_resourcingP$;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction.cache_sql_connection_statement_for_result_set;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction.open_sql_source;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction.uncache_sql_connection_statement_for_result_set;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_result_set_iterators;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKSI-SKS-STRUCTURE-IMPORTER-UTILITIES
 * source file: /cyc/top/cycl/sksi/modeling-tools/sksi-sks-structure-importer-utilities.lisp
 * created:     2019/07/03 17:38:35
 */
public final class sksi_sks_structure_importer_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLObject sks_create_and_add_ps(SubLObject sks, SubLObject physical_schemabase_mt) {
        return com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sks_create_and_add_ps_database(sks, physical_schemabase_mt);
    }

    static private final SubLString $str_alt21$ = makeString("");

    public static final SubLFile me = new sksi_sks_structure_importer_utilities();



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sks_required_fields_database$ = makeSymbol("*SKS-REQUIRED-FIELDS-DATABASE*");











    static private final SubLString $$$A_physical_schema_for_ = makeString("A physical schema for ");

    static private final SubLString $str6$_ = makeString(".");

    static private final SubLString $str7$_KS = makeString("-KS");

    static private final SubLString $str8$_PS = makeString("-PS");





    private static final SubLObject $$subKS_Direct = reader_make_constant_shell("subKS-Direct");





    private static final SubLSymbol SKSI_SKS_GET_ALL_PHYSICAL_SCHEMA_TABLE_NAMES = makeSymbol("SKSI-SKS-GET-ALL-PHYSICAL-SCHEMA-TABLE-NAMES");

    private static final SubLObject $$schemaName_SKS = reader_make_constant_shell("schemaName-SKS");

    private static final SubLObject $$schemaNameSchema_SKS = reader_make_constant_shell("schemaNameSchema-SKS");

    private static final SubLList $list18 = list(reader_make_constant_shell("passwordForSKS"), reader_make_constant_shell("serverOfSKS"), reader_make_constant_shell("sksIsa"), reader_make_constant_shell("sqlProgramForSKS"), reader_make_constant_shell("structuredKnowledgeSourceName"), reader_make_constant_shell("subProtocolForSKS"), reader_make_constant_shell("userNameForSKS"));

    public static final SubLSymbol $sks_inclusive_catalog_pattern$ = makeSymbol("*SKS-INCLUSIVE-CATALOG-PATTERN*");

    public static final SubLSymbol $sks_inclusive_schema_pattern$ = makeSymbol("*SKS-INCLUSIVE-SCHEMA-PATTERN*");

    private static final SubLString $str21$_ = makeString("%");

    private static final SubLSymbol IGNORE_TABLE_SCHEMA_SPECIFICATION_P = makeSymbol("IGNORE-TABLE-SCHEMA-SPECIFICATION-P");

    private static final SubLString $str23$_A_does_not_have_a_corresponding_ = makeString("~A does not have a corresponding #$definingMt (or legacy #$mappingMt)");



    private static final SubLString $str25$_A_is_missing__A_data = makeString("~A is missing ~A data");

    private static final SubLSymbol SKS_GATHER_PHYSICAL_DATABASE_TABLE_NAMES = makeSymbol("SKS-GATHER-PHYSICAL-DATABASE-TABLE-NAMES");

    private static final SubLString $str27$Problem_connecting_to_sks__A__cou = makeString("Problem connecting to sks ~A--couldn't determine access path.");

    private static final SubLString $str28$Problem_opening_connection_to_sks = makeString("Problem opening connection to sks ~A.");

    private static final SubLList $list29 = list(makeString("TABLE"));

    private static final SubLSymbol SKS_GATHER_ASSERTED_TABLE_META_DATA_FOR_TABLE = makeSymbol("SKS-GATHER-ASSERTED-TABLE-META-DATA-FOR-TABLE");

    private static final SubLSymbol $sym34$_PS = makeSymbol("?PS");



    private static final SubLList $list36 = list(makeSymbol("?SUB-KS"));

    private static final SubLList $list37 = list(list(reader_make_constant_shell("physicalSchemaSourceMap"), makeSymbol("?PS"), makeSymbol("?SUB-KS")));







    private static final SubLSymbol $sym42$_EXIT = makeSymbol("%EXIT");



    private static final SubLString $$$unknown = makeString("unknown");

    private static final SubLList $list45 = list(reader_make_constant_shell("ProgramRepresentationFn"), reader_make_constant_shell("CalendarDay"));

    private static final SubLString $str46$date_13_ = makeString("date(13)");

    private static final SubLObject $const47$DecimalRealNumberOfMaximumPrecisi = reader_make_constant_shell("DecimalRealNumberOfMaximumPrecisionFn");

    private static final SubLString $str48$numeric_ = makeString("numeric(");

    private static final SubLString $str49$_ = makeString(")");



    private static final SubLString $str51$varchar_ = makeString("varchar(");

    private static final SubLList $list52 = list(reader_make_constant_shell("SignedFn"), reader_make_constant_shell("4ByteIntegerDatatype"));

    private static final SubLString $str53$int4_10_ = makeString("int4(10)");



    private static final SubLString $str55$_default_ = makeString(":default=");

    private static final SubLSymbol CLUSTER_PHYSICAL_DATABASE_TABLE_INFORMATION_BY_SCHEMATA = makeSymbol("CLUSTER-PHYSICAL-DATABASE-TABLE-INFORMATION-BY-SCHEMATA");

    private static final SubLList $list57 = list(makeSymbol("TABLE-SCHEMA"), makeSymbol("&REST"), makeSymbol("TABLE-INFO"));

    private static final SubLSymbol $sym58$STRING_ = makeSymbol("STRING<");

    private static final SubLSymbol SKS_PHYSICAL_STRUCTURE_DECODE_DATABASE_TABLE = makeSymbol("SKS-PHYSICAL-STRUCTURE-DECODE-DATABASE-TABLE");

    private static final SubLString $str61$select_count____from_ = makeString("select count(*) from ");

    private static final SubLSymbol $sym62$NON_EMPTY_STRING_ = makeSymbol("NON-EMPTY-STRING?");

    private static final SubLSymbol SKS_P = makeSymbol("SKS-P");

    private static final SubLString $str67$Couldn_t_find___sksPhysicalSchema = makeString("Couldn't find #$sksPhysicalSchemaDescriptionMt assertion for ~A in #$UniversalVocabularyMt");

    private static final SubLObject $$Database_Physical = reader_make_constant_shell("Database-Physical");

    private static final SubLString $str69$_LS = makeString("-LS");









    private static final SubLString $str74$A_logical_schema_corresponding_to = makeString("A logical schema corresponding to a portion of the #$");

    private static final SubLString $str75$_physical_schema_ = makeString(" physical schema.");



    private static final SubLString $str77$ = makeString("");







    private static final SubLSymbol $sym84$_WHAT = makeSymbol("?WHAT");





    private static final SubLSymbol $kw89$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");

    private static final SubLString $str90$No_better_type_found_for__A__usin = makeString("No better type found for ~A; using it.");

    private static final SubLString $str91$Also__failed_to_reify__A_ = makeString("Also, failed to reify ~A.");

    private static final SubLString $$$NO = makeString("NO");







    private static final SubLSymbol $sym103$_ = makeSymbol("<");

    private static final SubLString $str104$physical_field_in__A_named__A_not = makeString("physical field in ~A named ~A not found.");



    private static final SubLObject $$foreignKeyMap_Cascade = reader_make_constant_shell("foreignKeyMap-Cascade");

    private static final SubLObject $$foreignKeyMap_Restrict = reader_make_constant_shell("foreignKeyMap-Restrict");

    private static final SubLString $str114$physical_field_in__A_table__A_nam = makeString("physical field in ~A table ~A named ~A not found.");

    private static final SubLObject $$BTree_DataStructure = reader_make_constant_shell("BTree-DataStructure");

    private static final SubLObject $$HashTable_DataStructure = reader_make_constant_shell("HashTable-DataStructure");

    private static final SubLSymbol $sym120$OBJECT_STRING__ = makeSymbol("OBJECT-STRING-<");

    private static final SubLString $$$true = makeString("true");

    private static final SubLString $$$KS = makeString("KS");

    private static final SubLString $str125$_TheIndex = makeString("-TheIndex");













    private static final SubLObject $$StructuredKnowledgeSource_Atomic = reader_make_constant_shell("StructuredKnowledgeSource-Atomic");

    // Definitions
    public static final SubLObject sks_physical_structure_decode_alt(SubLObject sks) {
        return com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sks_physical_structure_decode_database(sks);
    }

    // Definitions
    public static SubLObject sks_physical_structure_decode(final SubLObject sks) {
        return sks_physical_structure_decode_database(sks);
    }

    public static final SubLObject sks_initial_ke_validate_alt(SubLObject sks) {
        return com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sks_initial_ke_validate_database(sks);
    }

    public static SubLObject sks_initial_ke_validate(final SubLObject sks) {
        return sks_initial_ke_validate_database(sks);
    }

    public static final SubLObject sks_create_and_add_raw_ls_alt(SubLObject sks) {
        return com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sks_create_and_add_raw_ls_database(sks);
    }

    public static SubLObject sks_create_and_add_raw_ls(final SubLObject sks) {
        return sks_create_and_add_raw_ls_database(sks);
    }

    public static final SubLObject sks_ps_add_keys_alt(SubLObject sks, SubLObject physical_schemabase_mt) {
        return com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sks_ps_add_keys_database(sks, physical_schemabase_mt);
    }

    public static SubLObject sks_ps_add_keys(final SubLObject sks, final SubLObject physical_schemabase_mt) {
        return sks_ps_add_keys_database(sks, physical_schemabase_mt);
    }

    public static final SubLObject sks_ps_add_pf_properties_alt(SubLObject sks, SubLObject physical_schemabase_mt) {
        return com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sks_ps_add_pf_properties_database(sks, physical_schemabase_mt);
    }

    public static SubLObject sks_ps_add_pf_properties(final SubLObject sks, final SubLObject physical_schemabase_mt) {
        return sks_ps_add_pf_properties_database(sks, physical_schemabase_mt);
    }

    public static final SubLObject sks_find_or_create_ps_alt(SubLObject sks, SubLObject physical_schemabase_mt) {
        {
            SubLObject ps_name = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sks_make_physical_schema_name(sks);
            SubLObject ps = sksi_kb_accessors.sksi_find_or_create(ps_name);
            if (NIL != ps) {
                sksi_kb_accessors.sksi_constant_assert_inherited_kb_subset_isas(ps, sks);
                sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, ps, $$PhysicalSchema), $$UniversalVocabularyMt);
                sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$physicalSchemaSourceMap, ps, sks), physical_schemabase_mt);
                sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$comment, ps, cconcatenate($str_alt5$A_physical_schema_for_, new SubLObject[]{ format_nil.format_nil_a_no_copy(sks), $str_alt6$_ })), $$UniversalVocabularyMt);
            }
            return ps;
        }
    }

    public static SubLObject sks_find_or_create_ps(final SubLObject sks, final SubLObject physical_schemabase_mt) {
        final SubLObject ps_name = sks_make_physical_schema_name(sks);
        final SubLObject ps = sksi_kb_accessors.sksi_find_or_create(ps_name);
        if (NIL != ps) {
            sksi_kb_accessors.sksi_constant_assert_inherited_kb_subset_isas(ps, sks);
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, ps, $$PhysicalSchema), $$UniversalVocabularyMt);
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$physicalSchemaSourceMap, ps, sks), physical_schemabase_mt);
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$comment, ps, cconcatenate($$$A_physical_schema_for_, new SubLObject[]{ format_nil.format_nil_a_no_copy(sks), $str6$_ })), $$UniversalVocabularyMt);
        }
        return ps;
    }

    public static final SubLObject sks_make_physical_schema_name_alt(SubLObject sks) {
        {
            SubLObject sks_name = constants_high.constant_name(sks);
            SubLObject ps_name = string_utilities.post_fix(string_utilities.post_remove(sks_name, $str_alt7$_KS, UNPROVIDED), $str_alt8$_PS);
            return ps_name;
        }
    }

    public static SubLObject sks_make_physical_schema_name(final SubLObject sks) {
        final SubLObject sks_name = constants_high.constant_name(sks);
        final SubLObject ps_name = string_utilities.post_fix(string_utilities.post_remove(sks_name, $str7$_KS, UNPROVIDED), $str8$_PS);
        return ps_name;
    }

    public static final SubLObject sksi_find_ps_field_alt(SubLObject ps, SubLObject field_name) {
        return narts_high.find_nart(make_binary_nat_formula($$PhysicalFieldFn, ps, field_name));
    }

    public static SubLObject sksi_find_ps_field(final SubLObject ps, final SubLObject field_name) {
        return narts_high.find_nart(make_binary_nat_formula($$PhysicalFieldFn, ps, field_name));
    }

    public static final SubLObject sksi_sks_get_physical_schemas_alt(SubLObject sks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = kb_mapping_utilities.pred_values(sks, $$physicalSchemaSourceMap, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject sksi_sks_get_physical_schemas(final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = kb_mapping_utilities.pred_values(sks, $$physicalSchemaSourceMap, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject sksi_sks_get_all_physical_schemas_alt(SubLObject sks) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = sksi_sks_accessors.sks_get(sks, $$subKS_Direct, UNPROVIDED);
            SubLObject sub_sks = NIL;
            for (sub_sks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_sks = cdolist_list_var.first()) {
                {
                    SubLObject physical_schema = sksi_sks_accessors.sks_fget(sub_sks, $$physicalSchemaSourceMap, UNPROVIDED);
                    result = cons(physical_schema, result);
                }
            }
            return result;
        }
    }

    public static SubLObject sksi_sks_get_all_physical_schemas(final SubLObject sks) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = sksi_sks_accessors.sks_get(sks, $$subKS_Direct, UNPROVIDED);
        SubLObject sub_sks = NIL;
        sub_sks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject physical_schema = sksi_sks_accessors.sks_fget(sub_sks, $$physicalSchemaSourceMap, UNPROVIDED);
            result = cons(physical_schema, result);
            cdolist_list_var = cdolist_list_var.rest();
            sub_sks = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject sksi_physical_schema_get_physical_fields_alt(SubLObject physical_schema) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = kb_mapping_utilities.pred_values(physical_schema, $$physicalFields, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject sksi_physical_schema_get_physical_fields(final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = kb_mapping_utilities.pred_values(physical_schema, $$physicalFields, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject sksi_physical_schema_get_physical_field_indexicals_alt(SubLObject physical_schema) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = kb_mapping_utilities.pred_values(physical_schema, $$physicalFieldIndexicals, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject sksi_physical_schema_get_physical_field_indexicals(final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = kb_mapping_utilities.pred_values(physical_schema, $$physicalFieldIndexicals, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sksi_sks_get_all_physical_schema_table_names(final SubLObject sks, SubLObject include_schemasP) {
        if (include_schemasP == UNPROVIDED) {
            include_schemasP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = sksi_sks_accessors.sks_get(sks, $$subKS_Direct, UNPROVIDED);
            SubLObject sub_sks = NIL;
            sub_sks = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject physical_schema = sksi_sks_accessors.sks_fget(sub_sks, $$physicalSchemaSourceMap, UNPROVIDED);
                if (NIL != include_schemasP) {
                    result = cons(kb_mapping_utilities.pred_values(physical_schema, $$schemaName_SKS, ONE_INTEGER, TWO_INTEGER, UNPROVIDED).first(), result);
                } else {
                    result = cons(list(kb_mapping_utilities.pred_values(physical_schema, $$schemaName_SKS, ONE_INTEGER, TWO_INTEGER, UNPROVIDED).first(), kb_mapping_utilities.pred_values(physical_schema, $$schemaNameSchema_SKS, ONE_INTEGER, TWO_INTEGER, UNPROVIDED).first()), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                sub_sks = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject ignore_table_schema_specification_p(final SubLObject x) {
        return makeBoolean(x.isString() && (NIL != Strings.stringE(x, $sks_inclusive_schema_pattern$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject sks_initial_ke_validate_database_alt(SubLObject sks) {
        {
            SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED);
            SubLObject ke_plist = NIL;
            if (NIL == hlmt.hlmt_p(defining_mt)) {
                Errors.error($str_alt16$_A_does_not_have_a_corresponding_, sks);
            }
            ke_plist = putf(ke_plist, $$definingMt, list(defining_mt));
            {
                SubLObject missing_required_fieldP = NIL;
                SubLObject cdolist_list_var = $sks_required_fields_database$.getGlobalValue();
                SubLObject field_pred = NIL;
                for (field_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , field_pred = cdolist_list_var.first()) {
                    {
                        SubLObject field_value = sksi_sks_accessors.sks_get(sks, field_pred, defining_mt);
                        if (NIL != field_value) {
                            ke_plist = putf(ke_plist, field_pred, field_value);
                        } else {
                            Errors.warn($str_alt18$_A_is_missing__A_data, sks, field_pred);
                            missing_required_fieldP = T;
                        }
                    }
                }
                if (NIL != missing_required_fieldP) {
                    return values(ke_plist, NIL);
                } else {
                    return values(ke_plist, T);
                }
            }
        }
    }

    public static SubLObject sks_initial_ke_validate_database(final SubLObject sks) {
        final SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED);
        SubLObject ke_plist = NIL;
        if (NIL == hlmt.hlmt_p(defining_mt)) {
            Errors.error($str23$_A_does_not_have_a_corresponding_, sks);
        }
        ke_plist = putf(ke_plist, $$definingMt, list(defining_mt));
        SubLObject missing_required_fieldP = NIL;
        SubLObject cdolist_list_var = $sks_required_fields_database$.getGlobalValue();
        SubLObject field_pred = NIL;
        field_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject field_value = sksi_sks_accessors.sks_get(sks, field_pred, defining_mt);
            if (NIL != field_value) {
                ke_plist = putf(ke_plist, field_pred, field_value);
            } else {
                Errors.warn($str25$_A_is_missing__A_data, sks, field_pred);
                missing_required_fieldP = T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            field_pred = cdolist_list_var.first();
        } 
        if (NIL != missing_required_fieldP) {
            return values(ke_plist, NIL);
        }
        return values(ke_plist, T);
    }

    public static SubLObject sks_gather_physical_database_table_names(final SubLObject sks, SubLObject include_schemasP, SubLObject schema_pattern) {
        if (include_schemasP == UNPROVIDED) {
            include_schemasP = T;
        }
        if (schema_pattern == UNPROVIDED) {
            schema_pattern = $sks_inclusive_schema_pattern$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject table_names = NIL;
        final SubLObject _prev_bind_0 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
        try {
            sksi_sks_interaction.$sksi_global_resourcingP$.bind(NIL, thread);
            SubLObject connection = NIL;
            SubLObject close_connectionP = NIL;
            try {
                connection = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                if (NIL == sdbc.sql_open_connection_p(connection)) {
                    close_connectionP = T;
                    SubLObject access_path = NIL;
                    final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        access_path = sksi_access_path.external_source_access_path(sks, NIL, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$1, thread);
                    }
                    if (NIL == sksi_access_path.access_path_p(access_path)) {
                        Errors.error($str27$Problem_connecting_to_sks__A__cou, sks);
                    }
                    connection = sksi_sks_interaction.open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                    if (NIL == sdbc.sql_open_connection_p(connection)) {
                        Errors.error($str28$Problem_opening_connection_to_sks, sks);
                    }
                    sksi_macros.sksi_connections_for_sks_cache_add(sks, connection);
                }
                SubLObject cdolist_list_var;
                final SubLObject tables_meta_data = cdolist_list_var = sdbc.sqlc_get_tables_meta_data(connection, $sks_inclusive_catalog_pattern$.getGlobalValue(), schema_pattern, $str21$_, $list29);
                SubLObject table_meta_data = NIL;
                table_meta_data = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject table_name = getf(table_meta_data, $TABLE_NAME, UNPROVIDED);
                    final SubLObject table_schema = getf(table_meta_data, $TABLE_SCHEM, UNPROVIDED);
                    if (NIL != include_schemasP) {
                        table_names = cons(list(table_schema, table_name), table_names);
                    } else {
                        table_names = cons(table_name, table_names);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_meta_data = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL != close_connectionP) {
                        sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                        if (NIL != sdbc.sql_open_connection_p(connection)) {
                            sdbc.sqlc_close(connection);
                        }
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
        }
        return nreverse(table_names);
    }

    public static SubLObject sks_gather_asserted_table_meta_data_for_table(final SubLObject sks, final SubLObject table_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED), thread);
            final SubLObject ps = ask_utilities.query_variable($sym34$_PS, listS($$and, listS($$subKS_Direct, sks, $list36), list($$schemaName_SKS, $sym34$_PS, table_name), $list37), mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED).first();
            SubLObject result = NIL;
            SubLObject pf = NIL;
            final SubLObject pred_var = $$physicalSchemaFieldWithName;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(ps, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(ps, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$3 = NIL;
                            final SubLObject token_var_$4 = NIL;
                            while (NIL == done_var_$3) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(assertion));
                                if (NIL != valid_$5) {
                                    pf = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                    final SubLObject is_primary = kb_mapping_utilities.pred_u_v_holds($$primaryKey, ps, pf, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    final SubLObject is_nullable = kb_mapping_utilities.pred_u_v_holds($$nonNullFields, ps, pf, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    final SubLObject column_name = cycl_utilities.formula_arg2(pf, UNPROVIDED);
                                    final SubLObject datatype = sks_get_datatype_string_for_physical_field(pf);
                                    result = cons(list(column_name, datatype, is_primary, is_nullable), result);
                                }
                                done_var_$3 = makeBoolean(NIL == valid_$5);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            return result;
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject sks_get_datatype_string_for_physical_field(final SubLObject physical_field) {
        final SubLObject field_data_type = kb_mapping_utilities.pred_values(physical_field, $$fieldDataType, ONE_INTEGER, TWO_INTEGER, UNPROVIDED).first();
        SubLObject ret_value = $$$unknown;
        if (field_data_type.equal(narts_high.nart_substitute($list45))) {
            ret_value = $str46$date_13_;
        } else
            if ((NIL != obsolete.nat_p(field_data_type)) && cycl_utilities.formula_operator(field_data_type).eql($const47$DecimalRealNumberOfMaximumPrecisi)) {
                ret_value = cconcatenate($str48$numeric_, new SubLObject[]{ format_nil.format_nil_a_no_copy(cycl_utilities.formula_arg1(field_data_type, UNPROVIDED)), $str49$_ });
            } else
                if ((NIL != obsolete.nat_p(field_data_type)) && cycl_utilities.formula_operator(field_data_type).eql($$StringOfMaximumLengthFn)) {
                    ret_value = cconcatenate($str51$varchar_, new SubLObject[]{ format_nil.format_nil_a_no_copy(cycl_utilities.formula_arg1(field_data_type, UNPROVIDED)), $str49$_ });
                } else
                    if (field_data_type.equal(narts_high.nart_substitute($list52))) {
                        ret_value = $str53$int4_10_;
                    }



        final SubLObject default_value = kb_mapping_utilities.pred_values(physical_field, $$defaultFieldValue, TWO_INTEGER, THREE_INTEGER, UNPROVIDED).first();
        if (NIL != default_value) {
            ret_value = cconcatenate(format_nil.format_nil_a_no_copy(ret_value), new SubLObject[]{ $str55$_default_, format_nil.format_nil_a_no_copy(default_value) });
        }
        return ret_value;
    }

    public static SubLObject cluster_physical_database_table_information_by_schemata(final SubLObject table_name_infos) {
        final SubLObject map = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var = table_name_infos;
        SubLObject table_name_info = NIL;
        table_name_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = table_name_info;
            SubLObject table_schema = NIL;
            destructuring_bind_must_consp(current, datum, $list57);
            table_schema = current.first();
            final SubLObject table_info;
            current = table_info = current.rest();
            map_utilities.map_push(map, table_schema, table_info);
            cdolist_list_var = cdolist_list_var.rest();
            table_name_info = cdolist_list_var.first();
        } 
        final SubLObject order = Sort.sort(map_utilities.map_keys(map), $sym58$STRING_, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var2 = order;
        SubLObject schema = NIL;
        schema = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject entries = copy_list(map_utilities.map_get(map, schema, UNPROVIDED));
            result = cons(list(schema, Sort.sort(entries, $sym58$STRING_, FIRST)), result);
            cdolist_list_var2 = cdolist_list_var2.rest();
            schema = cdolist_list_var2.first();
        } 
        return nreverse(result);
    }

    public static SubLObject sks_physical_structure_decode_database_table(final SubLObject sks, final SubLObject table_name, SubLObject table_schema, SubLObject repropagate_nowP) {
        if (table_schema == UNPROVIDED) {
            table_schema = $sks_inclusive_schema_pattern$.getGlobalValue();
        }
        if (repropagate_nowP == UNPROVIDED) {
            repropagate_nowP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
        try {
            sksi_sks_interaction.$sksi_global_resourcingP$.bind(NIL, thread);
            SubLObject connection = NIL;
            SubLObject close_connectionP = NIL;
            try {
                connection = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                if (NIL == sdbc.sql_open_connection_p(connection)) {
                    close_connectionP = T;
                    SubLObject access_path = NIL;
                    final SubLObject _prev_bind_0_$7 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        access_path = sksi_access_path.external_source_access_path(sks, NIL, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$7, thread);
                    }
                    if (NIL == sksi_access_path.access_path_p(access_path)) {
                        Errors.error($str27$Problem_connecting_to_sks__A__cou, sks);
                    }
                    connection = sksi_sks_interaction.open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                    if (NIL == sdbc.sql_open_connection_p(connection)) {
                        Errors.error($str28$Problem_opening_connection_to_sks, sks);
                    }
                    sksi_macros.sksi_connections_for_sks_cache_add(sks, connection);
                }
                final SubLObject row_count = sks_physical_structure_database_row_count(connection, table_name);
                final SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED);
                if (NIL == hlmt.hlmt_p(defining_mt)) {
                    Errors.error($str23$_A_does_not_have_a_corresponding_, sks);
                }
                sks_create_and_add_sub_ks_int(table_name, sks, defining_mt, table_schema, row_count);
            } finally {
                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL != close_connectionP) {
                        sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                        if (NIL != sdbc.sql_open_connection_p(connection)) {
                            sdbc.sqlc_close(connection);
                        }
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        } finally {
            sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != repropagate_nowP) {
            repropagate_isas_for_ks_and_each_sub_ks(sks);
        }
        return values(sks, T);
    }

    public static final SubLObject sks_physical_structure_decode_database_alt(SubLObject sks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $sksi_global_resourcingP$.currentBinding(thread);
                try {
                    $sksi_global_resourcingP$.bind(NIL, thread);
                    {
                        SubLObject connection = NIL;
                        SubLObject close_connectionP = NIL;
                        try {
                            connection = sksi_connections_for_sks_cache_get(sks);
                            if (NIL == sql_open_connection_p(connection)) {
                                close_connectionP = T;
                                {
                                    SubLObject access_path = NIL;
                                    {
                                        SubLObject _prev_bind_0_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                            access_path = external_source_access_path(sks, NIL, UNPROVIDED);
                                        } finally {
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_1, thread);
                                        }
                                    }
                                    if (NIL == access_path_p(access_path)) {
                                        Errors.error($str_alt19$Problem_connecting_to_sks__A__cou, sks);
                                    }
                                    connection = open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                                }
                                if (NIL == sql_open_connection_p(connection)) {
                                    Errors.error($str_alt20$Problem_opening_connection_to_sks, sks);
                                }
                                sksi_connections_for_sks_cache_add(sks, connection);
                            }
                            {
                                SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED);
                                SubLObject tables_meta_data = sqlc_get_tables_meta_data(connection, $str_alt21$, $str_alt22$_, $str_alt22$_, $list_alt23);
                                if (NIL == hlmt.hlmt_p(defining_mt)) {
                                    Errors.warn($str_alt24$The_defining_mt_for_sks__A_is_not, sks);
                                }
                                {
                                    SubLObject cdolist_list_var = tables_meta_data;
                                    SubLObject table_meta_data = NIL;
                                    for (table_meta_data = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , table_meta_data = cdolist_list_var.first()) {
                                        {
                                            SubLObject table_name = getf(table_meta_data, $TABLE_NAME, UNPROVIDED);
                                            SubLObject row_count = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sks_physical_structure_database_row_count(connection, table_name);
                                            com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sks_create_and_add_sub_ks_int(table_name, sks, defining_mt, row_count);
                                        }
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (NIL != close_connectionP) {
                                        sksi_connections_for_sks_cache_remove(sks);
                                        if (NIL != sql_open_connection_p(connection)) {
                                            sqlc_close(connection);
                                        }
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                }
                            }
                        }
                    }
                } finally {
                    $sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
                }
            }
            com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.repropagate_isas_for_ks_and_each_sub_ks(sks);
            return values(sks, T);
        }
    }

    public static SubLObject sks_physical_structure_decode_database(final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
        try {
            sksi_sks_interaction.$sksi_global_resourcingP$.bind(NIL, thread);
            SubLObject connection = NIL;
            SubLObject close_connectionP = NIL;
            try {
                connection = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                if (NIL == sdbc.sql_open_connection_p(connection)) {
                    close_connectionP = T;
                    SubLObject access_path = NIL;
                    final SubLObject _prev_bind_0_$9 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        access_path = sksi_access_path.external_source_access_path(sks, NIL, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$9, thread);
                    }
                    if (NIL == sksi_access_path.access_path_p(access_path)) {
                        Errors.error($str27$Problem_connecting_to_sks__A__cou, sks);
                    }
                    connection = sksi_sks_interaction.open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                    if (NIL == sdbc.sql_open_connection_p(connection)) {
                        Errors.error($str28$Problem_opening_connection_to_sks, sks);
                    }
                    sksi_macros.sksi_connections_for_sks_cache_add(sks, connection);
                }
                SubLObject cdolist_list_var = sks_gather_physical_database_table_names(sks, NIL, UNPROVIDED);
                SubLObject table_name = NIL;
                table_name = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    sks_physical_structure_decode_database_table(sks, table_name, $sks_inclusive_schema_pattern$.getGlobalValue(), NIL);
                    cdolist_list_var = cdolist_list_var.rest();
                    table_name = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL != close_connectionP) {
                        sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                        if (NIL != sdbc.sql_open_connection_p(connection)) {
                            sdbc.sqlc_close(connection);
                        }
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                }
            }
        } finally {
            sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
        }
        repropagate_isas_for_ks_and_each_sub_ks(sks);
        return values(sks, T);
    }

    public static final SubLObject sks_physical_structure_database_row_count_alt(SubLObject connection, SubLObject table_name) {
        {
            SubLObject row_count = NIL;
            SubLObject row_count_sql = cconcatenate($str_alt26$select_count____from_, format_nil.format_nil_a_no_copy(table_name));
            SubLObject statement = sqlc_create_statement(connection);
            SubLObject result_set = sqls_execute_query(statement, row_count_sql, UNPROVIDED);
            SubLObject result_set_iterator = NIL;
            if (NIL != sql_result_set_p(result_set)) {
                cache_sql_connection_statement_for_result_set(result_set, connection, statement);
                result_set_iterator = sksi_result_set_iterators.new_sqlrs_iterator(result_set, UNPROVIDED, UNPROVIDED);
                if ((NIL != iterator_p(result_set_iterator)) && (NIL == iteration_done(result_set_iterator))) {
                    {
                        SubLObject real_row_count = iteration_next(result_set_iterator).first();
                        if (real_row_count.isNumber()) {
                            row_count = real_row_count;
                        }
                    }
                }
                uncache_sql_connection_statement_for_result_set(result_set);
            }
            return row_count;
        }
    }

    public static SubLObject sks_physical_structure_database_row_count(final SubLObject connection, final SubLObject table_name) {
        SubLObject row_count = NIL;
        final SubLObject row_count_sql = cconcatenate($str61$select_count____from_, format_nil.format_nil_a_no_copy(table_name));
        final SubLObject statement = sdbc.sqlc_create_statement(connection);
        final SubLObject result_set = sdbc.sqls_execute_query(statement, row_count_sql, UNPROVIDED);
        SubLObject result_set_iterator = NIL;
        if (NIL != sdbc.sql_result_set_p(result_set)) {
            sksi_sks_interaction.cache_sql_connection_statement_for_result_set(result_set, connection, statement);
            result_set_iterator = sksi_result_set_iterators.new_sqlrs_iterator(result_set, UNPROVIDED, UNPROVIDED);
            if ((NIL != iteration.iterator_p(result_set_iterator)) && (NIL == iteration.iteration_done(result_set_iterator))) {
                final SubLObject real_row_count = iteration.iteration_next(result_set_iterator).first();
                if (real_row_count.isNumber()) {
                    row_count = real_row_count;
                }
            }
            sksi_sks_interaction.uncache_sql_connection_statement_for_result_set(result_set);
        }
        return row_count;
    }

    public static final SubLObject sks_create_and_add_sub_ks_int(SubLObject sks_name, SubLObject super_sks, SubLObject defining_mt, SubLObject row_count) {
        if (row_count == UNPROVIDED) {
            row_count = NIL;
        }
        SubLTrampolineFile.checkType(sks_name, $sym27$NON_EMPTY_STRING_);
        SubLTrampolineFile.checkType(super_sks, SKS_P);
        SubLTrampolineFile.checkType(defining_mt, HLMT_P);
        if (NIL != row_count) {
            SubLTrampolineFile.checkType(row_count, NUMBERP);
        }
        {
            SubLObject sks = sksi_sks_accessors.new_sks(sks_name, super_sks, defining_mt, UNPROVIDED);
            SubLObject physical_schemabase_mt = sksi_smt.sks_get_physical_schemabase_mt(super_sks);
            if (NIL == hlmt.hlmt_p(physical_schemabase_mt)) {
                Errors.error($str_alt31$Couldn_t_find___sksPhysicalSchema, super_sks);
            }
            sksi_sks_accessors.sks_set_type(sks, $$Database_Physical);
            if (NIL != row_count) {
                sksi_sks_accessors.sks_set_row_count(sks, row_count);
            }
            com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sks_create_and_add_ps(sks, physical_schemabase_mt);
            com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sks_ps_add_keys(sks, physical_schemabase_mt);
            com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sks_ps_add_pf_properties(sks, physical_schemabase_mt);
            return sks;
        }
    }

    public static SubLObject sks_create_and_add_sub_ks_int(final SubLObject sks_name, final SubLObject super_sks, final SubLObject defining_mt, final SubLObject table_schema, SubLObject row_count) {
        if (row_count == UNPROVIDED) {
            row_count = NIL;
        }
        assert NIL != string_utilities.non_empty_stringP(sks_name) : "! string_utilities.non_empty_stringP(sks_name) " + ("string_utilities.non_empty_stringP(sks_name) " + "CommonSymbols.NIL != string_utilities.non_empty_stringP(sks_name) ") + sks_name;
        assert NIL != sksi_sks_accessors.sks_p(super_sks) : "! sksi_sks_accessors.sks_p(super_sks) " + ("sksi_sks_accessors.sks_p(super_sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(super_sks) ") + super_sks;
        assert NIL != hlmt.hlmt_p(defining_mt) : "! hlmt.hlmt_p(defining_mt) " + ("hlmt.hlmt_p(defining_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(defining_mt) ") + defining_mt;
        assert NIL != stringp(table_schema) : "! stringp(table_schema) " + ("Types.stringp(table_schema) " + "CommonSymbols.NIL != Types.stringp(table_schema) ") + table_schema;
        if (((NIL != row_count) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == numberp(row_count))) {
            throw new AssertionError(row_count);
        }
        final SubLObject sks = sksi_sks_accessors.new_sks_atomic(sks_name, super_sks, defining_mt);
        final SubLObject physical_schemabase_mt = sksi_smt.sks_get_physical_schemabase_mt(super_sks);
        if (NIL == hlmt.hlmt_p(physical_schemabase_mt)) {
            Errors.error($str67$Couldn_t_find___sksPhysicalSchema, super_sks);
        }
        sksi_sks_accessors.sks_set_type(sks, $$Database_Physical);
        if (NIL != row_count) {
            sksi_sks_accessors.sks_set_row_count(sks, row_count);
        }
        sks_create_and_add_ps_database(sks, physical_schemabase_mt, table_schema);
        sks_ps_add_keys(sks, physical_schemabase_mt);
        sks_ps_add_pf_properties(sks, physical_schemabase_mt);
        return sks;
    }

    public static final SubLObject sks_create_and_add_raw_ls_database_alt(SubLObject sks) {
        SubLTrampolineFile.checkType(sks, SKS_P);
        {
            SubLObject logical_schemabase_mt = sksi_smt.sks_get_logical_schemabase_mt(sks);
            return com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sksi_create_initial_logical_schemas(sks, logical_schemabase_mt);
        }
    }

    public static SubLObject sks_create_and_add_raw_ls_database(final SubLObject sks) {
        assert NIL != sksi_sks_accessors.sks_p(sks) : "! sksi_sks_accessors.sks_p(sks) " + ("sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) ") + sks;
        final SubLObject logical_schemabase_mt = sksi_smt.sks_get_logical_schemabase_mt(sks);
        return sksi_create_initial_logical_schemas(sks, logical_schemabase_mt);
    }

    /**
     * Only create the logical schemas; don't produce stub encodings and decodings.
     */
    @LispMethod(comment = "Only create the logical schemas; don\'t produce stub encodings and decodings.")
    public static final SubLObject sksi_create_initial_logical_schemas_alt(SubLObject sks, SubLObject logical_schemabase_mt) {
        {
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sksi_sks_get_all_physical_schemas(sks);
            SubLObject physical_schema = NIL;
            for (physical_schema = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , physical_schema = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sksi_create_logical_schema_for_physical(physical_schema, logical_schemabase_mt);
            }
        }
        return NIL;
    }

    /**
     * Only create the logical schemas; don't produce stub encodings and decodings.
     */
    @LispMethod(comment = "Only create the logical schemas; don\'t produce stub encodings and decodings.")
    public static SubLObject sksi_create_initial_logical_schemas(final SubLObject sks, final SubLObject logical_schemabase_mt) {
        SubLObject cdolist_list_var = sksi_sks_get_all_physical_schemas(sks);
        SubLObject physical_schema = NIL;
        physical_schema = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sksi_create_logical_schema_for_physical(physical_schema, logical_schemabase_mt);
            cdolist_list_var = cdolist_list_var.rest();
            physical_schema = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject sksi_create_logical_schema_for_physical_alt(SubLObject physical_schema, SubLObject logical_schemabase_mt) {
        SubLTrampolineFile.checkType(logical_schemabase_mt, HLMT_P);
        {
            SubLObject physical_schema_name = constants_high.constant_name(physical_schema);
            SubLObject logical_schema_name = string_utilities.string_subst($str_alt33$_LS, $str_alt8$_PS, physical_schema_name, UNPROVIDED);
            SubLObject logical_schema = sksi_kb_accessors.sksi_find_or_create(logical_schema_name);
            if (NIL != logical_schema) {
                sksi_kb_accessors.sksi_constant_assert_inherited_kb_subset_isas(logical_schema, physical_schema);
                sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, logical_schema, $$Individual), $$UniversalVocabularyMt);
                sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, logical_schema, $$ObjectDefiningSchema), logical_schemabase_mt);
                sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, logical_schema, $$LogicalSchema), logical_schemabase_mt);
                sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$logicalPhysicalSchemaMap, logical_schema, physical_schema), logical_schemabase_mt);
                sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$comment, logical_schema, cconcatenate($str_alt38$A_logical_schema_corresponding_to, new SubLObject[]{ format_nil.format_nil_a_no_copy(physical_schema_name), $str_alt39$_physical_schema_ })), $$UniversalVocabularyMt);
            }
            return logical_schema;
        }
    }

    public static SubLObject sksi_create_logical_schema_for_physical(final SubLObject physical_schema, final SubLObject logical_schemabase_mt) {
        assert NIL != hlmt.hlmt_p(logical_schemabase_mt) : "! hlmt.hlmt_p(logical_schemabase_mt) " + ("hlmt.hlmt_p(logical_schemabase_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(logical_schemabase_mt) ") + logical_schemabase_mt;
        final SubLObject physical_schema_name = constants_high.constant_name(physical_schema);
        final SubLObject logical_schema_name = string_utilities.string_subst($str69$_LS, $str8$_PS, physical_schema_name, UNPROVIDED);
        final SubLObject logical_schema = sksi_kb_accessors.sksi_find_or_create(logical_schema_name);
        if (NIL != logical_schema) {
            sksi_kb_accessors.sksi_constant_assert_inherited_kb_subset_isas(logical_schema, physical_schema);
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, logical_schema, $$Individual), $$UniversalVocabularyMt);
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, logical_schema, $$ObjectDefiningSchema), logical_schemabase_mt);
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, logical_schema, $$LogicalSchema), logical_schemabase_mt);
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$logicalPhysicalSchemaMap, logical_schema, physical_schema), logical_schemabase_mt);
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$comment, logical_schema, cconcatenate($str74$A_logical_schema_corresponding_to, new SubLObject[]{ format_nil.format_nil_a_no_copy(physical_schema_name), $str75$_physical_schema_ })), $$UniversalVocabularyMt);
        }
        return logical_schema;
    }

    public static final SubLObject sks_create_and_add_ps_database(SubLObject sks, SubLObject physical_schemabase_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sks, SKS_P);
            {
                SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED);
                SubLObject ps = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sks_find_or_create_ps(sks, physical_schemabase_mt);
                if (NIL != ps) {
                    {
                        SubLObject sks_name = sksi_sks_accessors.sks_fget(sks, $$structuredKnowledgeSourceName, defining_mt);
                        SubLObject table_name = sks_name;
                        SubLObject ps_name = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sks_make_physical_schema_name(sks);
                        SubLObject columns_meta_data = NIL;
                        SubLObject field_names = NIL;
                        {
                            SubLObject _prev_bind_0 = $sksi_global_resourcingP$.currentBinding(thread);
                            try {
                                $sksi_global_resourcingP$.bind(NIL, thread);
                                {
                                    SubLObject connection = NIL;
                                    SubLObject close_connectionP = NIL;
                                    try {
                                        connection = sksi_connections_for_sks_cache_get(sks);
                                        if (NIL == sql_open_connection_p(connection)) {
                                            close_connectionP = T;
                                            {
                                                SubLObject access_path = NIL;
                                                {
                                                    SubLObject _prev_bind_0_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                    try {
                                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                        access_path = external_source_access_path(sks, NIL, UNPROVIDED);
                                                    } finally {
                                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_3, thread);
                                                    }
                                                }
                                                if (NIL == access_path_p(access_path)) {
                                                    Errors.error($str_alt19$Problem_connecting_to_sks__A__cou, sks);
                                                }
                                                connection = open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                                            }
                                            if (NIL == sql_open_connection_p(connection)) {
                                                Errors.error($str_alt20$Problem_opening_connection_to_sks, sks);
                                            }
                                            sksi_connections_for_sks_cache_add(sks, connection);
                                        }
                                        columns_meta_data = sqlc_get_columns_meta_data(connection, $str_alt21$, $str_alt22$_, table_name, $str_alt22$_);
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (NIL != close_connectionP) {
                                                    sksi_connections_for_sks_cache_remove(sks);
                                                    if (NIL != sql_open_connection_p(connection)) {
                                                        sqlc_close(connection);
                                                    }
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                $sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
                            }
                        }
                        ps = sksi_kb_accessors.sksi_find_or_create(ps_name);
                        {
                            SubLObject cdolist_list_var = columns_meta_data;
                            SubLObject column_meta_data = NIL;
                            for (column_meta_data = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , column_meta_data = cdolist_list_var.first()) {
                                field_names = cons(getf(column_meta_data, $COLUMN_NAME, UNPROVIDED), field_names);
                            }
                        }
                        field_names = nreverse(field_names);
                        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$schemaName_SKS, ps, sks_name), physical_schemabase_mt);
                        sksi_kb_accessors.sksi_assert_if_new(make_unary_formula($$enumerableSchema, ps), physical_schemabase_mt);
                        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$schemaFieldNameList, ps, make_el_list(field_names, UNPROVIDED)), physical_schemabase_mt);
                    }
                    return ps;
                }
            }
            return NIL;
        }
    }

    public static SubLObject sks_create_and_add_ps_database(final SubLObject sks, final SubLObject physical_schemabase_mt, SubLObject db_schema_name) {
        if (db_schema_name == UNPROVIDED) {
            db_schema_name = $sks_inclusive_schema_pattern$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sksi_sks_accessors.sks_p(sks) : "! sksi_sks_accessors.sks_p(sks) " + ("sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) ") + sks;
        final SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED);
        SubLObject ps = sks_find_or_create_ps(sks, physical_schemabase_mt);
        if (NIL != ps) {
            final SubLObject table_name;
            final SubLObject sks_name = table_name = sksi_sks_accessors.sks_fget(sks, $$structuredKnowledgeSourceName, defining_mt);
            final SubLObject ps_name = sks_make_physical_schema_name(sks);
            SubLObject columns_meta_data = NIL;
            SubLObject field_names = NIL;
            final SubLObject _prev_bind_0 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
            try {
                sksi_sks_interaction.$sksi_global_resourcingP$.bind(NIL, thread);
                SubLObject connection = NIL;
                SubLObject close_connectionP = NIL;
                try {
                    connection = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                    if (NIL == sdbc.sql_open_connection_p(connection)) {
                        close_connectionP = T;
                        SubLObject access_path = NIL;
                        final SubLObject _prev_bind_0_$11 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            access_path = sksi_access_path.external_source_access_path(sks, NIL, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$11, thread);
                        }
                        if (NIL == sksi_access_path.access_path_p(access_path)) {
                            Errors.error($str27$Problem_connecting_to_sks__A__cou, sks);
                        }
                        connection = sksi_sks_interaction.open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                        if (NIL == sdbc.sql_open_connection_p(connection)) {
                            Errors.error($str28$Problem_opening_connection_to_sks, sks);
                        }
                        sksi_macros.sksi_connections_for_sks_cache_add(sks, connection);
                    }
                    columns_meta_data = sdbc.sqlc_get_columns_meta_data(connection, $str77$, db_schema_name, table_name, $str21$_);
                } finally {
                    final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL != close_connectionP) {
                            sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                            if (NIL != sdbc.sql_open_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            } finally {
                sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
            }
            ps = sksi_kb_accessors.sksi_find_or_create(ps_name);
            SubLObject cdolist_list_var = columns_meta_data;
            SubLObject column_meta_data = NIL;
            column_meta_data = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != ignore_table_schema_specification_p(db_schema_name)) {
                    db_schema_name = getf(column_meta_data, $TABLE_SCHEM, UNPROVIDED);
                }
                field_names = cons(getf(column_meta_data, $COLUMN_NAME, UNPROVIDED), field_names);
                cdolist_list_var = cdolist_list_var.rest();
                column_meta_data = cdolist_list_var.first();
            } 
            field_names = nreverse(field_names);
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$schemaName_SKS, ps, sks_name), physical_schemabase_mt);
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$schemaNameSchema_SKS, ps, db_schema_name), physical_schemabase_mt);
            sksi_kb_accessors.sksi_assert_if_new(make_unary_formula($$enumerableSchema, ps), physical_schemabase_mt);
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$schemaFieldNameList, ps, make_el_list(field_names, UNPROVIDED)), physical_schemabase_mt);
            return ps;
        }
        return NIL;
    }

    public static final SubLObject sksi_sdbc_column_type_to_cycl_alt(SubLObject data_type, SubLObject column_size, SubLObject decimal_digits, SubLObject type_name) {
        if (column_size == UNPROVIDED) {
            column_size = NIL;
        }
        if (decimal_digits == UNPROVIDED) {
            decimal_digits = NIL;
        }
        if (type_name == UNPROVIDED) {
            type_name = NIL;
        }
        SubLTrampolineFile.checkType(data_type, INTEGERP);
        if (!column_size.isInteger()) {
            column_size = $NULL;
        }
        if (!decimal_digits.isInteger()) {
            decimal_digits = $NULL;
        }
        if (!type_name.isString()) {
            type_name = $NULL;
        }
        {
            SubLObject jdbc_type = list($$JDBCDatatypeDescribedByFn, data_type, column_size, decimal_digits, type_name);
            SubLObject cycl_data_type = bindings.variable_lookup($sym48$_WHAT, inference_kernel.new_cyc_query(list($$rewriteOf, $sym48$_WHAT, jdbc_type), $$JDBCDataMt, list($INFERENCE_MODE, $SHALLOW, $kw53$NEW_TERMS_ALLOWED_, T)).first());
            if (NIL == cycl_data_type) {
                Errors.warn($str_alt54$No_better_type_found_for__A__usin, jdbc_type);
                cycl_data_type = narts_high.find_nart(jdbc_type);
                if (NIL == cycl_data_type) {
                    Errors.warn($str_alt55$Also__failed_to_reify__A_, jdbc_type);
                }
            }
            return cycl_data_type;
        }
    }

    public static SubLObject sksi_sdbc_column_type_to_cycl(final SubLObject data_type, SubLObject column_size, SubLObject decimal_digits, SubLObject type_name) {
        if (column_size == UNPROVIDED) {
            column_size = NIL;
        }
        if (decimal_digits == UNPROVIDED) {
            decimal_digits = NIL;
        }
        if (type_name == UNPROVIDED) {
            type_name = NIL;
        }
        assert NIL != integerp(data_type) : "! integerp(data_type) " + ("Types.integerp(data_type) " + "CommonSymbols.NIL != Types.integerp(data_type) ") + data_type;
        if (!column_size.isInteger()) {
            column_size = $NULL;
        }
        if (!decimal_digits.isInteger()) {
            decimal_digits = $NULL;
        }
        if (!type_name.isString()) {
            type_name = $NULL;
        }
        final SubLObject jdbc_type = list($$JDBCDatatypeDescribedByFn, data_type, column_size, decimal_digits, type_name);
        SubLObject cycl_data_type = bindings.variable_lookup($sym84$_WHAT, inference_kernel.new_cyc_query(list($$rewriteOf, $sym84$_WHAT, jdbc_type), $$JDBCDataMt, list($INFERENCE_MODE, $SHALLOW, $kw89$NEW_TERMS_ALLOWED_, T)).first());
        if (NIL == cycl_data_type) {
            Errors.warn($str90$No_better_type_found_for__A__usin, jdbc_type);
            cycl_data_type = narts_high.find_nart(jdbc_type);
            if (NIL == cycl_data_type) {
                Errors.warn($str91$Also__failed_to_reify__A_, jdbc_type);
            }
        }
        return cycl_data_type;
    }

    public static final SubLObject sks_ps_add_pf_properties_database_alt(SubLObject sks, SubLObject physical_schemabase_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED);
                SubLObject ps = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sks_find_or_create_ps(sks, physical_schemabase_mt);
                if (NIL != ps) {
                    {
                        SubLObject _prev_bind_0 = $sksi_global_resourcingP$.currentBinding(thread);
                        try {
                            $sksi_global_resourcingP$.bind(NIL, thread);
                            {
                                SubLObject unused_connection_var = NIL;
                                SubLObject close_connectionP = NIL;
                                try {
                                    unused_connection_var = sksi_connections_for_sks_cache_get(sks);
                                    if (NIL == sql_open_connection_p(unused_connection_var)) {
                                        close_connectionP = T;
                                        {
                                            SubLObject access_path = NIL;
                                            {
                                                SubLObject _prev_bind_0_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                try {
                                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                    access_path = external_source_access_path(sks, NIL, UNPROVIDED);
                                                } finally {
                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_5, thread);
                                                }
                                            }
                                            if (NIL == access_path_p(access_path)) {
                                                Errors.error($str_alt19$Problem_connecting_to_sks__A__cou, sks);
                                            }
                                            unused_connection_var = open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                                        }
                                        if (NIL == sql_open_connection_p(unused_connection_var)) {
                                            Errors.error($str_alt20$Problem_opening_connection_to_sks, sks);
                                        }
                                        sksi_connections_for_sks_cache_add(sks, unused_connection_var);
                                    }
                                    {
                                        SubLObject sks_name = sksi_sks_accessors.sks_fget(sks, $$structuredKnowledgeSourceName, defining_mt);
                                        SubLObject table_name = sks_name;
                                        SubLObject columns_meta_data = NIL;
                                        {
                                            SubLObject _prev_bind_0_6 = $sksi_global_resourcingP$.currentBinding(thread);
                                            try {
                                                $sksi_global_resourcingP$.bind(NIL, thread);
                                                {
                                                    SubLObject connection = NIL;
                                                    SubLObject close_connectionP_7 = NIL;
                                                    try {
                                                        connection = sksi_connections_for_sks_cache_get(sks);
                                                        if (NIL == sql_open_connection_p(connection)) {
                                                            close_connectionP_7 = T;
                                                            {
                                                                SubLObject access_path = NIL;
                                                                {
                                                                    SubLObject _prev_bind_0_8 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                                    try {
                                                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                                        access_path = external_source_access_path(sks, NIL, UNPROVIDED);
                                                                    } finally {
                                                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_8, thread);
                                                                    }
                                                                }
                                                                if (NIL == access_path_p(access_path)) {
                                                                    Errors.error($str_alt19$Problem_connecting_to_sks__A__cou, sks);
                                                                }
                                                                connection = open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                                                            }
                                                            if (NIL == sql_open_connection_p(connection)) {
                                                                Errors.error($str_alt20$Problem_opening_connection_to_sks, sks);
                                                            }
                                                            sksi_connections_for_sks_cache_add(sks, connection);
                                                        }
                                                        columns_meta_data = sqlc_get_columns_meta_data(connection, $str_alt21$, $str_alt22$_, table_name, $str_alt22$_);
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != close_connectionP_7) {
                                                                    sksi_connections_for_sks_cache_remove(sks);
                                                                    if (NIL != sql_open_connection_p(connection)) {
                                                                        sqlc_close(connection);
                                                                    }
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_9, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                $sksi_global_resourcingP$.rebind(_prev_bind_0_6, thread);
                                            }
                                        }
                                        {
                                            SubLObject non_null_pfs = NIL;
                                            SubLObject cdolist_list_var = columns_meta_data;
                                            SubLObject column_meta_data = NIL;
                                            for (column_meta_data = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , column_meta_data = cdolist_list_var.first()) {
                                                {
                                                    SubLObject column_name = getf(column_meta_data, $COLUMN_NAME, UNPROVIDED);
                                                    SubLObject nullable = getf(column_meta_data, $IS_NULLABLE, UNPROVIDED);
                                                    if (nullable.equal($$$NO)) {
                                                        {
                                                            SubLObject pf = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sksi_find_ps_field(ps, column_name);
                                                            non_null_pfs = cons(pf, non_null_pfs);
                                                        }
                                                    }
                                                }
                                            }
                                            non_null_pfs = nreverse(non_null_pfs);
                                            if (NIL != non_null_pfs) {
                                                sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$nonNullFieldList, ps, make_el_list(non_null_pfs, UNPROVIDED)), physical_schemabase_mt);
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var = columns_meta_data;
                                            SubLObject column_meta_data = NIL;
                                            for (column_meta_data = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , column_meta_data = cdolist_list_var.first()) {
                                                {
                                                    SubLObject column_name = getf(column_meta_data, $COLUMN_NAME, UNPROVIDED);
                                                    SubLObject data_type = getf(column_meta_data, $DATA_TYPE, UNPROVIDED);
                                                    SubLObject type_name = getf(column_meta_data, $TYPE_NAME, UNPROVIDED);
                                                    SubLObject column_size = getf(column_meta_data, $COLUMN_SIZE, UNPROVIDED);
                                                    SubLObject decimal_digits = getf(column_meta_data, $DECIMAL_DIGITS, UNPROVIDED);
                                                    SubLObject column_def = getf(column_meta_data, $COLUMN_DEF, UNPROVIDED);
                                                    SubLObject cycl_datatype = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sksi_sdbc_column_type_to_cycl(data_type, column_size, decimal_digits, type_name);
                                                    SubLObject pf = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sksi_find_ps_field(ps, column_name);
                                                    sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$fieldDataType, pf, cycl_datatype), physical_schemabase_mt);
                                                    if (NIL != string_utilities.non_empty_stringP(column_def)) {
                                                        {
                                                            SubLObject poss_column_def = NIL;
                                                            if (NIL != genls.genl_in_any_mtP(cycl_datatype, $$IntegerComputerNumber)) {
                                                                poss_column_def = string_utilities.string_to_integer(column_def);
                                                            } else {
                                                                if (NIL != genls.genl_in_any_mtP(cycl_datatype, $$DoubleFloatObject)) {
                                                                    poss_column_def = read_from_string_ignoring_errors(column_def, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            }
                                                            if (NIL != poss_column_def) {
                                                                column_def = poss_column_def;
                                                            }
                                                        }
                                                        sksi_kb_accessors.sksi_assert_if_new(make_ternary_formula($$defaultFieldValue, ps, pf, column_def), physical_schemabase_mt);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            if (NIL != close_connectionP) {
                                                sksi_connections_for_sks_cache_remove(sks);
                                                if (NIL != sql_open_connection_p(unused_connection_var)) {
                                                    sqlc_close(unused_connection_var);
                                                }
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            $sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject sks_ps_add_pf_properties_database(final SubLObject sks, final SubLObject physical_schemabase_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED);
        final SubLObject ps = sks_find_or_create_ps(sks, physical_schemabase_mt);
        if (NIL != ps) {
            final SubLObject _prev_bind_0 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
            try {
                sksi_sks_interaction.$sksi_global_resourcingP$.bind(NIL, thread);
                SubLObject unused_connection_var = NIL;
                SubLObject close_connectionP = NIL;
                try {
                    unused_connection_var = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                    if (NIL == sdbc.sql_open_connection_p(unused_connection_var)) {
                        close_connectionP = T;
                        SubLObject access_path = NIL;
                        final SubLObject _prev_bind_0_$13 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            access_path = sksi_access_path.external_source_access_path(sks, NIL, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$13, thread);
                        }
                        if (NIL == sksi_access_path.access_path_p(access_path)) {
                            Errors.error($str27$Problem_connecting_to_sks__A__cou, sks);
                        }
                        unused_connection_var = sksi_sks_interaction.open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                        if (NIL == sdbc.sql_open_connection_p(unused_connection_var)) {
                            Errors.error($str28$Problem_opening_connection_to_sks, sks);
                        }
                        sksi_macros.sksi_connections_for_sks_cache_add(sks, unused_connection_var);
                    }
                    final SubLObject table_name;
                    final SubLObject sks_name = table_name = sksi_sks_accessors.sks_fget(sks, $$structuredKnowledgeSourceName, defining_mt);
                    SubLObject columns_meta_data = NIL;
                    final SubLObject _prev_bind_0_$14 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
                    try {
                        sksi_sks_interaction.$sksi_global_resourcingP$.bind(NIL, thread);
                        SubLObject connection = NIL;
                        SubLObject close_connectionP_$15 = NIL;
                        try {
                            connection = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                            if (NIL == sdbc.sql_open_connection_p(connection)) {
                                close_connectionP_$15 = T;
                                SubLObject access_path2 = NIL;
                                final SubLObject _prev_bind_0_$15 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    access_path2 = sksi_access_path.external_source_access_path(sks, NIL, UNPROVIDED);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$15, thread);
                                }
                                if (NIL == sksi_access_path.access_path_p(access_path2)) {
                                    Errors.error($str27$Problem_connecting_to_sks__A__cou, sks);
                                }
                                connection = sksi_sks_interaction.open_sql_source(access_path2, ONE_INTEGER, UNPROVIDED);
                                if (NIL == sdbc.sql_open_connection_p(connection)) {
                                    Errors.error($str28$Problem_opening_connection_to_sks, sks);
                                }
                                sksi_macros.sksi_connections_for_sks_cache_add(sks, connection);
                            }
                            columns_meta_data = sdbc.sqlc_get_columns_meta_data(connection, $str77$, $str21$_, table_name, $str21$_);
                        } finally {
                            final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != close_connectionP_$15) {
                                    sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                                    if (NIL != sdbc.sql_open_connection_p(connection)) {
                                        sdbc.sqlc_close(connection);
                                    }
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                            }
                        }
                    } finally {
                        sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0_$14, thread);
                    }
                    SubLObject non_null_pfs = NIL;
                    SubLObject cdolist_list_var = columns_meta_data;
                    SubLObject column_meta_data = NIL;
                    column_meta_data = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject column_name = getf(column_meta_data, $COLUMN_NAME, UNPROVIDED);
                        final SubLObject nullable = getf(column_meta_data, $IS_NULLABLE, UNPROVIDED);
                        if (nullable.equal($$$NO)) {
                            final SubLObject pf = sksi_find_ps_field(ps, column_name);
                            non_null_pfs = cons(pf, non_null_pfs);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        column_meta_data = cdolist_list_var.first();
                    } 
                    non_null_pfs = nreverse(non_null_pfs);
                    if (NIL != non_null_pfs) {
                        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$nonNullFieldList, ps, make_el_list(non_null_pfs, UNPROVIDED)), physical_schemabase_mt);
                    }
                    SubLObject cdolist_list_var2 = columns_meta_data;
                    SubLObject column_meta_data2 = NIL;
                    column_meta_data2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        final SubLObject column_name2 = getf(column_meta_data2, $COLUMN_NAME, UNPROVIDED);
                        final SubLObject data_type = getf(column_meta_data2, $DATA_TYPE, UNPROVIDED);
                        final SubLObject type_name = getf(column_meta_data2, $TYPE_NAME, UNPROVIDED);
                        final SubLObject column_size = getf(column_meta_data2, $COLUMN_SIZE, UNPROVIDED);
                        final SubLObject decimal_digits = getf(column_meta_data2, $DECIMAL_DIGITS, UNPROVIDED);
                        SubLObject column_def = getf(column_meta_data2, $COLUMN_DEF, UNPROVIDED);
                        final SubLObject cycl_datatype = sksi_sdbc_column_type_to_cycl(data_type, column_size, decimal_digits, type_name);
                        final SubLObject pf2 = sksi_find_ps_field(ps, column_name2);
                        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$fieldDataType, pf2, cycl_datatype), physical_schemabase_mt);
                        if (NIL != string_utilities.non_empty_stringP(column_def)) {
                            SubLObject poss_column_def = NIL;
                            if (NIL != genls.genl_in_any_mtP(cycl_datatype, $$IntegerComputerNumber)) {
                                poss_column_def = string_utilities.string_to_integer(column_def);
                            } else
                                if (NIL != genls.genl_in_any_mtP(cycl_datatype, $$DoubleFloatObject)) {
                                    poss_column_def = read_from_string_ignoring_errors(column_def, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }

                            if (NIL != poss_column_def) {
                                column_def = poss_column_def;
                            }
                            sksi_kb_accessors.sksi_assert_if_new(make_ternary_formula($$defaultFieldValue, ps, pf2, column_def), physical_schemabase_mt);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        column_meta_data2 = cdolist_list_var2.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (NIL != close_connectionP) {
                            sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                            if (NIL != sdbc.sql_open_connection_p(unused_connection_var)) {
                                sdbc.sqlc_close(unused_connection_var);
                            }
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                    }
                }
            } finally {
                sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject sks_ps_get_schema_name(final SubLObject ps, final SubLObject physical_schemabase_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(physical_schemabase_mt, thread);
            result = kb_mapping_utilities.fpred_value(ps, $$schemaNameSchema_SKS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject sks_ps_add_primary_keys_alt(SubLObject sks, SubLObject ps, SubLObject physical_schemabase_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED);
                SubLObject table_name = sksi_sks_accessors.sks_fget(sks, $$structuredKnowledgeSourceName, defining_mt);
                {
                    SubLObject _prev_bind_0 = $sksi_global_resourcingP$.currentBinding(thread);
                    try {
                        $sksi_global_resourcingP$.bind(NIL, thread);
                        {
                            SubLObject connection = NIL;
                            SubLObject close_connectionP = NIL;
                            try {
                                connection = sksi_connections_for_sks_cache_get(sks);
                                if (NIL == sql_open_connection_p(connection)) {
                                    close_connectionP = T;
                                    {
                                        SubLObject access_path = NIL;
                                        {
                                            SubLObject _prev_bind_0_11 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                access_path = external_source_access_path(sks, NIL, UNPROVIDED);
                                            } finally {
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_11, thread);
                                            }
                                        }
                                        if (NIL == access_path_p(access_path)) {
                                            Errors.error($str_alt19$Problem_connecting_to_sks__A__cou, sks);
                                        }
                                        connection = open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                                    }
                                    if (NIL == sql_open_connection_p(connection)) {
                                        Errors.error($str_alt20$Problem_opening_connection_to_sks, sks);
                                    }
                                    sksi_connections_for_sks_cache_add(sks, connection);
                                }
                                {
                                    SubLObject primary_keys_meta_data = NIL;
                                    SubLObject primary_key_pfs = NIL;
                                    {
                                        SubLObject _prev_bind_0_12 = $sksi_global_resourcingP$.currentBinding(thread);
                                        try {
                                            $sksi_global_resourcingP$.bind(NIL, thread);
                                            {
                                                SubLObject connection_13 = NIL;
                                                SubLObject close_connectionP_14 = NIL;
                                                try {
                                                    connection_13 = sksi_connections_for_sks_cache_get(sks);
                                                    if (NIL == sql_open_connection_p(connection_13)) {
                                                        close_connectionP_14 = T;
                                                        {
                                                            SubLObject access_path = NIL;
                                                            {
                                                                SubLObject _prev_bind_0_15 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                                try {
                                                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                                    access_path = external_source_access_path(sks, NIL, UNPROVIDED);
                                                                } finally {
                                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_15, thread);
                                                                }
                                                            }
                                                            if (NIL == access_path_p(access_path)) {
                                                                Errors.error($str_alt19$Problem_connecting_to_sks__A__cou, sks);
                                                            }
                                                            connection_13 = open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                                                        }
                                                        if (NIL == sql_open_connection_p(connection_13)) {
                                                            Errors.error($str_alt20$Problem_opening_connection_to_sks, sks);
                                                        }
                                                        sksi_connections_for_sks_cache_add(sks, connection_13);
                                                    }
                                                    primary_keys_meta_data = sqlc_get_primary_keys_meta_data(connection_13, $str_alt21$, $str_alt21$, table_name);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != close_connectionP_14) {
                                                                sksi_connections_for_sks_cache_remove(sks);
                                                                if (NIL != sql_open_connection_p(connection_13)) {
                                                                    sqlc_close(connection_13);
                                                                }
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_16, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            $sksi_global_resourcingP$.rebind(_prev_bind_0_12, thread);
                                        }
                                    }
                                    primary_keys_meta_data = list_utilities.plistlist_sort(primary_keys_meta_data, $KEY_SEQ, $sym69$_);
                                    {
                                        SubLObject cdolist_list_var = primary_keys_meta_data;
                                        SubLObject primary_key_meta_data = NIL;
                                        for (primary_key_meta_data = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , primary_key_meta_data = cdolist_list_var.first()) {
                                            {
                                                SubLObject primary_key_column_name = getf(primary_key_meta_data, $COLUMN_NAME, UNPROVIDED);
                                                SubLObject pf = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sksi_find_ps_field(ps, primary_key_column_name);
                                                if (NIL == pf) {
                                                    Errors.warn($str_alt70$physical_field_in__A_named__A_not, ps, primary_key_column_name);
                                                } else {
                                                    primary_key_pfs = cons(pf, primary_key_pfs);
                                                }
                                            }
                                        }
                                    }
                                    primary_key_pfs = nreverse(primary_key_pfs);
                                    if (NIL != primary_key_pfs) {
                                        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$primaryKey, ps, make_el_list(primary_key_pfs, UNPROVIDED)), physical_schemabase_mt);
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (NIL != close_connectionP) {
                                            sksi_connections_for_sks_cache_remove(sks);
                                            if (NIL != sql_open_connection_p(connection)) {
                                                sqlc_close(connection);
                                            }
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_17, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject sks_ps_add_primary_keys(final SubLObject sks, final SubLObject ps, final SubLObject physical_schemabase_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED);
        final SubLObject table_name = sksi_sks_accessors.sks_fget(sks, $$structuredKnowledgeSourceName, defining_mt);
        final SubLObject schema_name = sks_ps_get_schema_name(ps, physical_schemabase_mt);
        final SubLObject _prev_bind_0 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
        try {
            sksi_sks_interaction.$sksi_global_resourcingP$.bind(NIL, thread);
            SubLObject connection = NIL;
            SubLObject close_connectionP = NIL;
            try {
                connection = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                if (NIL == sdbc.sql_open_connection_p(connection)) {
                    close_connectionP = T;
                    SubLObject access_path = NIL;
                    final SubLObject _prev_bind_0_$19 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        access_path = sksi_access_path.external_source_access_path(sks, NIL, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$19, thread);
                    }
                    if (NIL == sksi_access_path.access_path_p(access_path)) {
                        Errors.error($str27$Problem_connecting_to_sks__A__cou, sks);
                    }
                    connection = sksi_sks_interaction.open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                    if (NIL == sdbc.sql_open_connection_p(connection)) {
                        Errors.error($str28$Problem_opening_connection_to_sks, sks);
                    }
                    sksi_macros.sksi_connections_for_sks_cache_add(sks, connection);
                }
                SubLObject primary_keys_meta_data = NIL;
                SubLObject primary_key_pfs = NIL;
                final SubLObject _prev_bind_0_$20 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
                try {
                    sksi_sks_interaction.$sksi_global_resourcingP$.bind(NIL, thread);
                    SubLObject connection_$21 = NIL;
                    SubLObject close_connectionP_$22 = NIL;
                    try {
                        connection_$21 = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                        if (NIL == sdbc.sql_open_connection_p(connection_$21)) {
                            close_connectionP_$22 = T;
                            SubLObject access_path2 = NIL;
                            final SubLObject _prev_bind_0_$21 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                access_path2 = sksi_access_path.external_source_access_path(sks, NIL, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$21, thread);
                            }
                            if (NIL == sksi_access_path.access_path_p(access_path2)) {
                                Errors.error($str27$Problem_connecting_to_sks__A__cou, sks);
                            }
                            connection_$21 = sksi_sks_interaction.open_sql_source(access_path2, ONE_INTEGER, UNPROVIDED);
                            if (NIL == sdbc.sql_open_connection_p(connection_$21)) {
                                Errors.error($str28$Problem_opening_connection_to_sks, sks);
                            }
                            sksi_macros.sksi_connections_for_sks_cache_add(sks, connection_$21);
                        }
                        primary_keys_meta_data = sdbc.sqlc_get_primary_keys_meta_data(connection_$21, $str77$, schema_name, table_name);
                    } finally {
                        final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != close_connectionP_$22) {
                                sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                                if (NIL != sdbc.sql_open_connection_p(connection_$21)) {
                                    sdbc.sqlc_close(connection_$21);
                                }
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                        }
                    }
                } finally {
                    sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0_$20, thread);
                }
                SubLObject cdolist_list_var;
                primary_keys_meta_data = cdolist_list_var = list_utilities.plistlist_sort(primary_keys_meta_data, $KEY_SEQ, $sym103$_);
                SubLObject primary_key_meta_data = NIL;
                primary_key_meta_data = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject primary_key_column_name = getf(primary_key_meta_data, $COLUMN_NAME, UNPROVIDED);
                    final SubLObject pf = sksi_find_ps_field(ps, primary_key_column_name);
                    if (NIL == pf) {
                        Errors.warn($str104$physical_field_in__A_named__A_not, ps, primary_key_column_name);
                    } else {
                        primary_key_pfs = cons(pf, primary_key_pfs);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    primary_key_meta_data = cdolist_list_var.first();
                } 
                primary_key_pfs = nreverse(primary_key_pfs);
                if (NIL != primary_key_pfs) {
                    sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$primaryKey, ps, make_el_list(primary_key_pfs, UNPROVIDED)), physical_schemabase_mt);
                }
            } finally {
                final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (NIL != close_connectionP) {
                        sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                        if (NIL != sdbc.sql_open_connection_p(connection)) {
                            sdbc.sqlc_close(connection);
                        }
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                }
            }
        } finally {
            sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject sks_ps_add_exported_keys_alt(SubLObject sks, SubLObject ps, SubLObject physical_schemabase_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED);
                SubLObject table_name = sksi_sks_accessors.sks_fget(sks, $$structuredKnowledgeSourceName, defining_mt);
                {
                    SubLObject _prev_bind_0 = $sksi_global_resourcingP$.currentBinding(thread);
                    try {
                        $sksi_global_resourcingP$.bind(NIL, thread);
                        {
                            SubLObject connection = NIL;
                            SubLObject close_connectionP = NIL;
                            try {
                                connection = sksi_connections_for_sks_cache_get(sks);
                                if (NIL == sql_open_connection_p(connection)) {
                                    close_connectionP = T;
                                    {
                                        SubLObject access_path = NIL;
                                        {
                                            SubLObject _prev_bind_0_18 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                access_path = external_source_access_path(sks, NIL, UNPROVIDED);
                                            } finally {
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_18, thread);
                                            }
                                        }
                                        if (NIL == access_path_p(access_path)) {
                                            Errors.error($str_alt19$Problem_connecting_to_sks__A__cou, sks);
                                        }
                                        connection = open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                                    }
                                    if (NIL == sql_open_connection_p(connection)) {
                                        Errors.error($str_alt20$Problem_opening_connection_to_sks, sks);
                                    }
                                    sksi_connections_for_sks_cache_add(sks, connection);
                                }
                                {
                                    SubLObject exported_keys_meta_data = NIL;
                                    {
                                        SubLObject _prev_bind_0_19 = $sksi_global_resourcingP$.currentBinding(thread);
                                        try {
                                            $sksi_global_resourcingP$.bind(NIL, thread);
                                            {
                                                SubLObject connection_20 = NIL;
                                                SubLObject close_connectionP_21 = NIL;
                                                try {
                                                    connection_20 = sksi_connections_for_sks_cache_get(sks);
                                                    if (NIL == sql_open_connection_p(connection_20)) {
                                                        close_connectionP_21 = T;
                                                        {
                                                            SubLObject access_path = NIL;
                                                            {
                                                                SubLObject _prev_bind_0_22 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                                try {
                                                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                                    access_path = external_source_access_path(sks, NIL, UNPROVIDED);
                                                                } finally {
                                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_22, thread);
                                                                }
                                                            }
                                                            if (NIL == access_path_p(access_path)) {
                                                                Errors.error($str_alt19$Problem_connecting_to_sks__A__cou, sks);
                                                            }
                                                            connection_20 = open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                                                        }
                                                        if (NIL == sql_open_connection_p(connection_20)) {
                                                            Errors.error($str_alt20$Problem_opening_connection_to_sks, sks);
                                                        }
                                                        sksi_connections_for_sks_cache_add(sks, connection_20);
                                                    }
                                                    exported_keys_meta_data = sqlc_get_exported_keys_meta_data(connection_20, $str_alt21$, $str_alt21$, table_name);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != close_connectionP_21) {
                                                                sksi_connections_for_sks_cache_remove(sks);
                                                                if (NIL != sql_open_connection_p(connection_20)) {
                                                                    sqlc_close(connection_20);
                                                                }
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_23, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            $sksi_global_resourcingP$.rebind(_prev_bind_0_19, thread);
                                        }
                                    }
                                    {
                                        SubLObject foreign_key_names = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.plistlist_indicator_range(exported_keys_meta_data, $FK_NAME);
                                        SubLObject cdolist_list_var = foreign_key_names;
                                        SubLObject foreign_key_name = NIL;
                                        for (foreign_key_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , foreign_key_name = cdolist_list_var.first()) {
                                            {
                                                SubLObject exported_key_columns_meta_data = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.plistlist_filter_and_sort(exported_keys_meta_data, $FK_NAME, foreign_key_name, symbol_function(EQUAL), $KEY_SEQ, $sym69$_);
                                                SubLObject foreign_key_pred = $$foreignKeyMap;
                                                SubLObject foreign_ps = NIL;
                                                SubLObject primary_key_pfs = NIL;
                                                SubLObject foreign_key_pfs = NIL;
                                                SubLObject cdolist_list_var_24 = exported_key_columns_meta_data;
                                                SubLObject exported_key_column_meta_data = NIL;
                                                for (exported_key_column_meta_data = cdolist_list_var_24.first(); NIL != cdolist_list_var_24; cdolist_list_var_24 = cdolist_list_var_24.rest() , exported_key_column_meta_data = cdolist_list_var_24.first()) {
                                                    {
                                                        SubLObject update_rule = getf(exported_key_column_meta_data, $UPDATE_RULE, UNPROVIDED);
                                                        SubLObject delete_rule = getf(exported_key_column_meta_data, $DELETE_RULE, UNPROVIDED);
                                                        SubLObject primary_key_column_name = getf(exported_key_column_meta_data, $PKCOLUMN_NAME, UNPROVIDED);
                                                        SubLObject foreign_key_table_name = getf(exported_key_column_meta_data, $FKTABLE_NAME, UNPROVIDED);
                                                        SubLObject foreign_key_column_name = getf(exported_key_column_meta_data, $FKCOLUMN_NAME, UNPROVIDED);
                                                        SubLObject pk_pf = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sksi_find_ps_field(ps, primary_key_column_name);
                                                        SubLObject fk_pf = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sksi_find_ps_field_by_table_column(foreign_key_table_name, foreign_key_column_name, physical_schemabase_mt);
                                                        if ((update_rule == ZERO_INTEGER) || (delete_rule == ZERO_INTEGER)) {
                                                            foreign_key_pred = $$foreignKeyMap_Cascade;
                                                        }
                                                        if ((update_rule == ONE_INTEGER) || (delete_rule == ONE_INTEGER)) {
                                                            foreign_key_pred = $$foreignKeyMap_Restrict;
                                                        }
                                                        foreign_ps = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sksi_find_ps_by_table(foreign_key_table_name, physical_schemabase_mt);
                                                        if (NIL == pk_pf) {
                                                            Errors.warn($str_alt70$physical_field_in__A_named__A_not, ps, primary_key_column_name);
                                                        } else {
                                                            primary_key_pfs = cons(pk_pf, primary_key_pfs);
                                                        }
                                                        if (NIL == fk_pf) {
                                                            Errors.warn($str_alt81$physical_field_in__A_table__A_nam, ps, foreign_key_table_name, foreign_key_column_name);
                                                        } else {
                                                            foreign_key_pfs = cons(fk_pf, foreign_key_pfs);
                                                        }
                                                    }
                                                }
                                                primary_key_pfs = nreverse(primary_key_pfs);
                                                foreign_key_pfs = nreverse(foreign_key_pfs);
                                                if ((NIL != primary_key_pfs) && (NIL != foreign_key_pfs)) {
                                                    sksi_kb_accessors.sksi_assert_if_new(make_quaternary_formula(foreign_key_pred, ps, make_el_list(primary_key_pfs, UNPROVIDED), foreign_ps, make_el_list(foreign_key_pfs, UNPROVIDED)), physical_schemabase_mt);
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (NIL != close_connectionP) {
                                            sksi_connections_for_sks_cache_remove(sks);
                                            if (NIL != sql_open_connection_p(connection)) {
                                                sqlc_close(connection);
                                            }
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_25, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject sks_ps_add_exported_keys(final SubLObject sks, final SubLObject ps, final SubLObject physical_schemabase_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED);
        final SubLObject table_name = sksi_sks_accessors.sks_fget(sks, $$structuredKnowledgeSourceName, defining_mt);
        final SubLObject _prev_bind_0 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
        try {
            sksi_sks_interaction.$sksi_global_resourcingP$.bind(NIL, thread);
            SubLObject connection = NIL;
            SubLObject close_connectionP = NIL;
            try {
                connection = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                if (NIL == sdbc.sql_open_connection_p(connection)) {
                    close_connectionP = T;
                    SubLObject access_path = NIL;
                    final SubLObject _prev_bind_0_$26 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        access_path = sksi_access_path.external_source_access_path(sks, NIL, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$26, thread);
                    }
                    if (NIL == sksi_access_path.access_path_p(access_path)) {
                        Errors.error($str27$Problem_connecting_to_sks__A__cou, sks);
                    }
                    connection = sksi_sks_interaction.open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                    if (NIL == sdbc.sql_open_connection_p(connection)) {
                        Errors.error($str28$Problem_opening_connection_to_sks, sks);
                    }
                    sksi_macros.sksi_connections_for_sks_cache_add(sks, connection);
                }
                SubLObject exported_keys_meta_data = NIL;
                final SubLObject _prev_bind_0_$27 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
                try {
                    sksi_sks_interaction.$sksi_global_resourcingP$.bind(NIL, thread);
                    SubLObject connection_$28 = NIL;
                    SubLObject close_connectionP_$29 = NIL;
                    try {
                        connection_$28 = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                        if (NIL == sdbc.sql_open_connection_p(connection_$28)) {
                            close_connectionP_$29 = T;
                            SubLObject access_path2 = NIL;
                            final SubLObject _prev_bind_0_$28 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                access_path2 = sksi_access_path.external_source_access_path(sks, NIL, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$28, thread);
                            }
                            if (NIL == sksi_access_path.access_path_p(access_path2)) {
                                Errors.error($str27$Problem_connecting_to_sks__A__cou, sks);
                            }
                            connection_$28 = sksi_sks_interaction.open_sql_source(access_path2, ONE_INTEGER, UNPROVIDED);
                            if (NIL == sdbc.sql_open_connection_p(connection_$28)) {
                                Errors.error($str28$Problem_opening_connection_to_sks, sks);
                            }
                            sksi_macros.sksi_connections_for_sks_cache_add(sks, connection_$28);
                        }
                        exported_keys_meta_data = sdbc.sqlc_get_exported_keys_meta_data(connection_$28, $str77$, $str77$, table_name);
                    } finally {
                        final SubLObject _prev_bind_0_$29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != close_connectionP_$29) {
                                sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                                if (NIL != sdbc.sql_open_connection_p(connection_$28)) {
                                    sdbc.sqlc_close(connection_$28);
                                }
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                        }
                    }
                } finally {
                    sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0_$27, thread);
                }
                SubLObject cdolist_list_var;
                final SubLObject foreign_key_names = cdolist_list_var = plistlist_indicator_range(exported_keys_meta_data, $FK_NAME);
                SubLObject foreign_key_name = NIL;
                foreign_key_name = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject exported_key_columns_meta_data = plistlist_filter_and_sort(exported_keys_meta_data, $FK_NAME, foreign_key_name, symbol_function(EQUAL), $KEY_SEQ, $sym103$_);
                    SubLObject foreign_key_pred = $$foreignKeyMap;
                    SubLObject foreign_ps = NIL;
                    SubLObject primary_key_pfs = NIL;
                    SubLObject foreign_key_pfs = NIL;
                    SubLObject cdolist_list_var_$32 = exported_key_columns_meta_data;
                    SubLObject exported_key_column_meta_data = NIL;
                    exported_key_column_meta_data = cdolist_list_var_$32.first();
                    while (NIL != cdolist_list_var_$32) {
                        final SubLObject update_rule = getf(exported_key_column_meta_data, $UPDATE_RULE, UNPROVIDED);
                        final SubLObject delete_rule = getf(exported_key_column_meta_data, $DELETE_RULE, UNPROVIDED);
                        final SubLObject primary_key_column_name = getf(exported_key_column_meta_data, $PKCOLUMN_NAME, UNPROVIDED);
                        final SubLObject foreign_key_table_name = getf(exported_key_column_meta_data, $FKTABLE_NAME, UNPROVIDED);
                        final SubLObject foreign_key_column_name = getf(exported_key_column_meta_data, $FKCOLUMN_NAME, UNPROVIDED);
                        final SubLObject pk_pf = sksi_find_ps_field(ps, primary_key_column_name);
                        final SubLObject fk_pf = sksi_find_ps_field_by_table_column(foreign_key_table_name, foreign_key_column_name, physical_schemabase_mt);
                        if (update_rule.eql(ZERO_INTEGER) || delete_rule.eql(ZERO_INTEGER)) {
                            foreign_key_pred = $$foreignKeyMap_Cascade;
                        }
                        if (update_rule.eql(ONE_INTEGER) || delete_rule.eql(ONE_INTEGER)) {
                            foreign_key_pred = $$foreignKeyMap_Restrict;
                        }
                        foreign_ps = sksi_find_ps_by_table(foreign_key_table_name, physical_schemabase_mt);
                        if (NIL == pk_pf) {
                            Errors.warn($str104$physical_field_in__A_named__A_not, ps, primary_key_column_name);
                        } else {
                            primary_key_pfs = cons(pk_pf, primary_key_pfs);
                        }
                        if (NIL == fk_pf) {
                            Errors.warn($str114$physical_field_in__A_table__A_nam, ps, foreign_key_table_name, foreign_key_column_name);
                        } else {
                            foreign_key_pfs = cons(fk_pf, foreign_key_pfs);
                        }
                        cdolist_list_var_$32 = cdolist_list_var_$32.rest();
                        exported_key_column_meta_data = cdolist_list_var_$32.first();
                    } 
                    primary_key_pfs = nreverse(primary_key_pfs);
                    foreign_key_pfs = nreverse(foreign_key_pfs);
                    if ((NIL != primary_key_pfs) && (NIL != foreign_key_pfs)) {
                        sksi_kb_accessors.sksi_assert_if_new(make_quaternary_formula(foreign_key_pred, ps, make_el_list(primary_key_pfs, UNPROVIDED), foreign_ps, make_el_list(foreign_key_pfs, UNPROVIDED)), physical_schemabase_mt);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    foreign_key_name = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (NIL != close_connectionP) {
                        sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                        if (NIL != sdbc.sql_open_connection_p(connection)) {
                            sdbc.sqlc_close(connection);
                        }
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                }
            }
        } finally {
            sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject sks_ps_add_imported_keys_alt(SubLObject sks, SubLObject ps, SubLObject physical_schemabase_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED);
                SubLObject table_name = sksi_sks_accessors.sks_fget(sks, $$structuredKnowledgeSourceName, defining_mt);
                {
                    SubLObject _prev_bind_0 = $sksi_global_resourcingP$.currentBinding(thread);
                    try {
                        $sksi_global_resourcingP$.bind(NIL, thread);
                        {
                            SubLObject connection = NIL;
                            SubLObject close_connectionP = NIL;
                            try {
                                connection = sksi_connections_for_sks_cache_get(sks);
                                if (NIL == sql_open_connection_p(connection)) {
                                    close_connectionP = T;
                                    {
                                        SubLObject access_path = NIL;
                                        {
                                            SubLObject _prev_bind_0_26 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                access_path = external_source_access_path(sks, NIL, UNPROVIDED);
                                            } finally {
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_26, thread);
                                            }
                                        }
                                        if (NIL == access_path_p(access_path)) {
                                            Errors.error($str_alt19$Problem_connecting_to_sks__A__cou, sks);
                                        }
                                        connection = open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                                    }
                                    if (NIL == sql_open_connection_p(connection)) {
                                        Errors.error($str_alt20$Problem_opening_connection_to_sks, sks);
                                    }
                                    sksi_connections_for_sks_cache_add(sks, connection);
                                }
                                {
                                    SubLObject imported_keys_meta_data = NIL;
                                    {
                                        SubLObject _prev_bind_0_27 = $sksi_global_resourcingP$.currentBinding(thread);
                                        try {
                                            $sksi_global_resourcingP$.bind(NIL, thread);
                                            {
                                                SubLObject connection_28 = NIL;
                                                SubLObject close_connectionP_29 = NIL;
                                                try {
                                                    connection_28 = sksi_connections_for_sks_cache_get(sks);
                                                    if (NIL == sql_open_connection_p(connection_28)) {
                                                        close_connectionP_29 = T;
                                                        {
                                                            SubLObject access_path = NIL;
                                                            {
                                                                SubLObject _prev_bind_0_30 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                                try {
                                                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                                    access_path = external_source_access_path(sks, NIL, UNPROVIDED);
                                                                } finally {
                                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_30, thread);
                                                                }
                                                            }
                                                            if (NIL == access_path_p(access_path)) {
                                                                Errors.error($str_alt19$Problem_connecting_to_sks__A__cou, sks);
                                                            }
                                                            connection_28 = open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                                                        }
                                                        if (NIL == sql_open_connection_p(connection_28)) {
                                                            Errors.error($str_alt20$Problem_opening_connection_to_sks, sks);
                                                        }
                                                        sksi_connections_for_sks_cache_add(sks, connection_28);
                                                    }
                                                    imported_keys_meta_data = sqlc_get_imported_keys_meta_data(connection_28, $str_alt21$, $str_alt21$, table_name);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != close_connectionP_29) {
                                                                sksi_connections_for_sks_cache_remove(sks);
                                                                if (NIL != sql_open_connection_p(connection_28)) {
                                                                    sqlc_close(connection_28);
                                                                }
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_31, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            $sksi_global_resourcingP$.rebind(_prev_bind_0_27, thread);
                                        }
                                    }
                                    {
                                        SubLObject foreign_key_names = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.plistlist_indicator_range(imported_keys_meta_data, $FK_NAME);
                                        SubLObject cdolist_list_var = foreign_key_names;
                                        SubLObject foreign_key_name = NIL;
                                        for (foreign_key_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , foreign_key_name = cdolist_list_var.first()) {
                                            {
                                                SubLObject imported_key_columns_meta_data = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.plistlist_filter_and_sort(imported_keys_meta_data, $FK_NAME, foreign_key_name, symbol_function(EQUAL), $KEY_SEQ, $sym69$_);
                                                SubLObject foreign_key_pred = $$foreignKeyMap;
                                                SubLObject primary_ps = NIL;
                                                SubLObject primary_key_pfs = NIL;
                                                SubLObject foreign_key_pfs = NIL;
                                                SubLObject cdolist_list_var_32 = imported_key_columns_meta_data;
                                                SubLObject imported_key_column_meta_data = NIL;
                                                for (imported_key_column_meta_data = cdolist_list_var_32.first(); NIL != cdolist_list_var_32; cdolist_list_var_32 = cdolist_list_var_32.rest() , imported_key_column_meta_data = cdolist_list_var_32.first()) {
                                                    {
                                                        SubLObject update_rule = getf(imported_key_column_meta_data, $UPDATE_RULE, UNPROVIDED);
                                                        SubLObject delete_rule = getf(imported_key_column_meta_data, $DELETE_RULE, UNPROVIDED);
                                                        SubLObject primary_key_table_name = getf(imported_key_column_meta_data, $PKTABLE_NAME, UNPROVIDED);
                                                        SubLObject primary_key_column_name = getf(imported_key_column_meta_data, $PKCOLUMN_NAME, UNPROVIDED);
                                                        SubLObject foreign_key_column_name = getf(imported_key_column_meta_data, $FKCOLUMN_NAME, UNPROVIDED);
                                                        SubLObject pk_pf = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sksi_find_ps_field_by_table_column(primary_key_table_name, primary_key_column_name, physical_schemabase_mt);
                                                        SubLObject fk_pf = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sksi_find_ps_field(ps, foreign_key_column_name);
                                                        if ((update_rule == ZERO_INTEGER) || (delete_rule == ZERO_INTEGER)) {
                                                            foreign_key_pred = $$foreignKeyMap_Cascade;
                                                        }
                                                        if ((update_rule == ONE_INTEGER) || (delete_rule == ONE_INTEGER)) {
                                                            foreign_key_pred = $$foreignKeyMap_Restrict;
                                                        }
                                                        primary_ps = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sksi_find_ps_by_table(primary_key_table_name, physical_schemabase_mt);
                                                        if (NIL == fk_pf) {
                                                            Errors.warn($str_alt70$physical_field_in__A_named__A_not, ps, foreign_key_column_name);
                                                        } else {
                                                            foreign_key_pfs = cons(fk_pf, foreign_key_pfs);
                                                        }
                                                        if (NIL == pk_pf) {
                                                            Errors.warn($str_alt81$physical_field_in__A_table__A_nam, ps, primary_key_table_name, primary_key_column_name);
                                                        } else {
                                                            primary_key_pfs = cons(pk_pf, primary_key_pfs);
                                                        }
                                                    }
                                                }
                                                primary_key_pfs = nreverse(primary_key_pfs);
                                                foreign_key_pfs = nreverse(foreign_key_pfs);
                                                if ((NIL != primary_key_pfs) && (NIL != foreign_key_pfs)) {
                                                    sksi_kb_accessors.sksi_assert_if_new(make_quaternary_formula(foreign_key_pred, primary_ps, make_el_list(primary_key_pfs, UNPROVIDED), ps, make_el_list(foreign_key_pfs, UNPROVIDED)), physical_schemabase_mt);
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (NIL != close_connectionP) {
                                            sksi_connections_for_sks_cache_remove(sks);
                                            if (NIL != sql_open_connection_p(connection)) {
                                                sqlc_close(connection);
                                            }
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_33, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject sks_ps_add_imported_keys(final SubLObject sks, final SubLObject ps, final SubLObject physical_schemabase_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED);
        final SubLObject table_name = sksi_sks_accessors.sks_fget(sks, $$structuredKnowledgeSourceName, defining_mt);
        final SubLObject _prev_bind_0 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
        try {
            sksi_sks_interaction.$sksi_global_resourcingP$.bind(NIL, thread);
            SubLObject connection = NIL;
            SubLObject close_connectionP = NIL;
            try {
                connection = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                if (NIL == sdbc.sql_open_connection_p(connection)) {
                    close_connectionP = T;
                    SubLObject access_path = NIL;
                    final SubLObject _prev_bind_0_$34 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        access_path = sksi_access_path.external_source_access_path(sks, NIL, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$34, thread);
                    }
                    if (NIL == sksi_access_path.access_path_p(access_path)) {
                        Errors.error($str27$Problem_connecting_to_sks__A__cou, sks);
                    }
                    connection = sksi_sks_interaction.open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                    if (NIL == sdbc.sql_open_connection_p(connection)) {
                        Errors.error($str28$Problem_opening_connection_to_sks, sks);
                    }
                    sksi_macros.sksi_connections_for_sks_cache_add(sks, connection);
                }
                SubLObject imported_keys_meta_data = NIL;
                final SubLObject _prev_bind_0_$35 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
                try {
                    sksi_sks_interaction.$sksi_global_resourcingP$.bind(NIL, thread);
                    SubLObject connection_$36 = NIL;
                    SubLObject close_connectionP_$37 = NIL;
                    try {
                        connection_$36 = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                        if (NIL == sdbc.sql_open_connection_p(connection_$36)) {
                            close_connectionP_$37 = T;
                            SubLObject access_path2 = NIL;
                            final SubLObject _prev_bind_0_$36 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                access_path2 = sksi_access_path.external_source_access_path(sks, NIL, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$36, thread);
                            }
                            if (NIL == sksi_access_path.access_path_p(access_path2)) {
                                Errors.error($str27$Problem_connecting_to_sks__A__cou, sks);
                            }
                            connection_$36 = sksi_sks_interaction.open_sql_source(access_path2, ONE_INTEGER, UNPROVIDED);
                            if (NIL == sdbc.sql_open_connection_p(connection_$36)) {
                                Errors.error($str28$Problem_opening_connection_to_sks, sks);
                            }
                            sksi_macros.sksi_connections_for_sks_cache_add(sks, connection_$36);
                        }
                        imported_keys_meta_data = sdbc.sqlc_get_imported_keys_meta_data(connection_$36, $str77$, $str77$, table_name);
                    } finally {
                        final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != close_connectionP_$37) {
                                sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                                if (NIL != sdbc.sql_open_connection_p(connection_$36)) {
                                    sdbc.sqlc_close(connection_$36);
                                }
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                        }
                    }
                } finally {
                    sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0_$35, thread);
                }
                SubLObject cdolist_list_var;
                final SubLObject foreign_key_names = cdolist_list_var = plistlist_indicator_range(imported_keys_meta_data, $FK_NAME);
                SubLObject foreign_key_name = NIL;
                foreign_key_name = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject imported_key_columns_meta_data = plistlist_filter_and_sort(imported_keys_meta_data, $FK_NAME, foreign_key_name, symbol_function(EQUAL), $KEY_SEQ, $sym103$_);
                    SubLObject foreign_key_pred = $$foreignKeyMap;
                    SubLObject primary_ps = NIL;
                    SubLObject primary_key_pfs = NIL;
                    SubLObject foreign_key_pfs = NIL;
                    SubLObject cdolist_list_var_$40 = imported_key_columns_meta_data;
                    SubLObject imported_key_column_meta_data = NIL;
                    imported_key_column_meta_data = cdolist_list_var_$40.first();
                    while (NIL != cdolist_list_var_$40) {
                        final SubLObject update_rule = getf(imported_key_column_meta_data, $UPDATE_RULE, UNPROVIDED);
                        final SubLObject delete_rule = getf(imported_key_column_meta_data, $DELETE_RULE, UNPROVIDED);
                        final SubLObject primary_key_table_name = getf(imported_key_column_meta_data, $PKTABLE_NAME, UNPROVIDED);
                        final SubLObject primary_key_column_name = getf(imported_key_column_meta_data, $PKCOLUMN_NAME, UNPROVIDED);
                        final SubLObject foreign_key_column_name = getf(imported_key_column_meta_data, $FKCOLUMN_NAME, UNPROVIDED);
                        final SubLObject pk_pf = sksi_find_ps_field_by_table_column(primary_key_table_name, primary_key_column_name, physical_schemabase_mt);
                        final SubLObject fk_pf = sksi_find_ps_field(ps, foreign_key_column_name);
                        if (update_rule.eql(ZERO_INTEGER) || delete_rule.eql(ZERO_INTEGER)) {
                            foreign_key_pred = $$foreignKeyMap_Cascade;
                        }
                        if (update_rule.eql(ONE_INTEGER) || delete_rule.eql(ONE_INTEGER)) {
                            foreign_key_pred = $$foreignKeyMap_Restrict;
                        }
                        primary_ps = sksi_find_ps_by_table(primary_key_table_name, physical_schemabase_mt);
                        if (NIL == fk_pf) {
                            Errors.warn($str104$physical_field_in__A_named__A_not, ps, foreign_key_column_name);
                        } else {
                            foreign_key_pfs = cons(fk_pf, foreign_key_pfs);
                        }
                        if (NIL == pk_pf) {
                            Errors.warn($str114$physical_field_in__A_table__A_nam, ps, primary_key_table_name, primary_key_column_name);
                        } else {
                            primary_key_pfs = cons(pk_pf, primary_key_pfs);
                        }
                        cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                        imported_key_column_meta_data = cdolist_list_var_$40.first();
                    } 
                    primary_key_pfs = nreverse(primary_key_pfs);
                    foreign_key_pfs = nreverse(foreign_key_pfs);
                    if ((NIL != primary_key_pfs) && (NIL != foreign_key_pfs)) {
                        sksi_kb_accessors.sksi_assert_if_new(make_quaternary_formula(foreign_key_pred, primary_ps, make_el_list(primary_key_pfs, UNPROVIDED), ps, make_el_list(foreign_key_pfs, UNPROVIDED)), physical_schemabase_mt);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    foreign_key_name = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (NIL != close_connectionP) {
                        sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                        if (NIL != sdbc.sql_open_connection_p(connection)) {
                            sdbc.sqlc_close(connection);
                        }
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                }
            }
        } finally {
            sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject sksi_index_type_from_index_type_id_alt(SubLObject type_id) {
        {
            SubLObject pcase_var = type_id;
            if (pcase_var.eql(ZERO_INTEGER)) {
                return NIL;
            } else {
                if (pcase_var.eql(ONE_INTEGER)) {
                    return $$BTree_DataStructure;
                } else {
                    if (pcase_var.eql(TWO_INTEGER)) {
                        return $$HashTable_DataStructure;
                    } else {
                        if (pcase_var.eql(THREE_INTEGER)) {
                            return NIL;
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    public static SubLObject sksi_index_type_from_index_type_id(final SubLObject type_id) {
        if (type_id.eql(ZERO_INTEGER)) {
            return NIL;
        }
        if (type_id.eql(ONE_INTEGER)) {
            return $$BTree_DataStructure;
        }
        if (type_id.eql(TWO_INTEGER)) {
            return $$HashTable_DataStructure;
        }
        if (type_id.eql(THREE_INTEGER)) {
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject sks_ps_add_indices_alt(SubLObject sks, SubLObject ps, SubLObject physical_schemabase_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED);
                SubLObject table_name = sksi_sks_accessors.sks_fget(sks, $$structuredKnowledgeSourceName, defining_mt);
                {
                    SubLObject _prev_bind_0 = $sksi_global_resourcingP$.currentBinding(thread);
                    try {
                        $sksi_global_resourcingP$.bind(NIL, thread);
                        {
                            SubLObject connection = NIL;
                            SubLObject close_connectionP = NIL;
                            try {
                                connection = sksi_connections_for_sks_cache_get(sks);
                                if (NIL == sql_open_connection_p(connection)) {
                                    close_connectionP = T;
                                    {
                                        SubLObject access_path = NIL;
                                        {
                                            SubLObject _prev_bind_0_34 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                access_path = external_source_access_path(sks, NIL, UNPROVIDED);
                                            } finally {
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_34, thread);
                                            }
                                        }
                                        if (NIL == access_path_p(access_path)) {
                                            Errors.error($str_alt19$Problem_connecting_to_sks__A__cou, sks);
                                        }
                                        connection = open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                                    }
                                    if (NIL == sql_open_connection_p(connection)) {
                                        Errors.error($str_alt20$Problem_opening_connection_to_sks, sks);
                                    }
                                    sksi_connections_for_sks_cache_add(sks, connection);
                                }
                                {
                                    SubLObject indices_meta_data = NIL;
                                    {
                                        SubLObject _prev_bind_0_35 = $sksi_global_resourcingP$.currentBinding(thread);
                                        try {
                                            $sksi_global_resourcingP$.bind(NIL, thread);
                                            {
                                                SubLObject connection_36 = NIL;
                                                SubLObject close_connectionP_37 = NIL;
                                                try {
                                                    connection_36 = sksi_connections_for_sks_cache_get(sks);
                                                    if (NIL == sql_open_connection_p(connection_36)) {
                                                        close_connectionP_37 = T;
                                                        {
                                                            SubLObject access_path = NIL;
                                                            {
                                                                SubLObject _prev_bind_0_38 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                                try {
                                                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                                    access_path = external_source_access_path(sks, NIL, UNPROVIDED);
                                                                } finally {
                                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_38, thread);
                                                                }
                                                            }
                                                            if (NIL == access_path_p(access_path)) {
                                                                Errors.error($str_alt19$Problem_connecting_to_sks__A__cou, sks);
                                                            }
                                                            connection_36 = open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                                                        }
                                                        if (NIL == sql_open_connection_p(connection_36)) {
                                                            Errors.error($str_alt20$Problem_opening_connection_to_sks, sks);
                                                        }
                                                        sksi_connections_for_sks_cache_add(sks, connection_36);
                                                    }
                                                    indices_meta_data = sqlc_get_index_info_meta_data(connection_36, $str_alt21$, $str_alt21$, table_name, NIL, NIL);
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_39 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != close_connectionP_37) {
                                                                sksi_connections_for_sks_cache_remove(sks);
                                                                if (NIL != sql_open_connection_p(connection_36)) {
                                                                    sqlc_close(connection_36);
                                                                }
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_39, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            $sksi_global_resourcingP$.rebind(_prev_bind_0_35, thread);
                                        }
                                    }
                                    {
                                        SubLObject index_names = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.plistlist_indicator_range(indices_meta_data, $INDEX_NAME);
                                        SubLObject cdolist_list_var = index_names;
                                        SubLObject index_name = NIL;
                                        for (index_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , index_name = cdolist_list_var.first()) {
                                            {
                                                SubLObject index_columns_meta_data = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.plistlist_filter_and_sort(indices_meta_data, $INDEX_NAME, index_name, symbol_function(EQUAL), $ORDINAL_POSITION, $sym87$OBJECT_STRING__);
                                                SubLObject index_pfs = NIL;
                                                SubLObject index_non_uniqueP = NIL;
                                                SubLObject index_type = NIL;
                                                SubLObject cdolist_list_var_40 = index_columns_meta_data;
                                                SubLObject index_column_meta_data = NIL;
                                                for (index_column_meta_data = cdolist_list_var_40.first(); NIL != cdolist_list_var_40; cdolist_list_var_40 = cdolist_list_var_40.rest() , index_column_meta_data = cdolist_list_var_40.first()) {
                                                    {
                                                        SubLObject non_unique = getf(index_column_meta_data, $NON_UNIQUE, UNPROVIDED);
                                                        SubLObject index_table_name = getf(index_column_meta_data, $TABLE_NAME, UNPROVIDED);
                                                        SubLObject index_column_name = getf(index_column_meta_data, $COLUMN_NAME, UNPROVIDED);
                                                        SubLObject index_pf = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sksi_find_ps_field(ps, index_column_name);
                                                        index_type = getf(index_column_meta_data, $TYPE, UNPROVIDED);
                                                        if (non_unique.equal($$$true)) {
                                                            index_non_uniqueP = T;
                                                        }
                                                        ps = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sksi_find_ps_by_table(index_table_name, physical_schemabase_mt);
                                                        if (NIL == index_pf) {
                                                            Errors.warn($str_alt81$physical_field_in__A_table__A_nam, ps, index_table_name, index_column_name);
                                                        } else {
                                                            index_pfs = cons(index_pf, index_pfs);
                                                        }
                                                    }
                                                }
                                                index_pfs = nreverse(index_pfs);
                                                if (NIL != index_pfs) {
                                                    {
                                                        SubLObject index_constant_name = cconcatenate(string_utilities.post_remove(constants_high.constant_name(sks), $$$KS, UNPROVIDED), new SubLObject[]{ index_name, $str_alt92$_TheIndex });
                                                        SubLObject index_constant = sksi_kb_accessors.sksi_create(index_constant_name);
                                                        SubLObject index_type_constant = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sksi_index_type_from_index_type_id(index_type);
                                                        if (NIL == index_non_uniqueP) {
                                                            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$uniqueFieldList, ps, make_el_list(index_pfs, UNPROVIDED)), physical_schemabase_mt);
                                                        }
                                                        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, index_constant, $$IndexDataStructure), $$UniversalVocabularyMt);
                                                        sksi_kb_accessors.sksi_assert_if_new(make_quaternary_formula($$schemaFieldsIndex, ps, make_el_list(index_pfs, UNPROVIDED), index_name, index_constant), physical_schemabase_mt);
                                                        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$indexName, index_constant, index_name), physical_schemabase_mt);
                                                        if (NIL != index_type_constant) {
                                                            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$indexType, index_constant, index_type_constant), physical_schemabase_mt);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (NIL != close_connectionP) {
                                            sksi_connections_for_sks_cache_remove(sks);
                                            if (NIL != sql_open_connection_p(connection)) {
                                                sqlc_close(connection);
                                            }
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_41, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject sks_ps_add_indices(final SubLObject sks, SubLObject ps, final SubLObject physical_schemabase_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject defining_mt = sksi_sks_accessors.sks_get_defining_mt(sks, UNPROVIDED);
        final SubLObject table_name = sksi_sks_accessors.sks_fget(sks, $$structuredKnowledgeSourceName, defining_mt);
        final SubLObject _prev_bind_0 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
        try {
            sksi_sks_interaction.$sksi_global_resourcingP$.bind(NIL, thread);
            SubLObject connection = NIL;
            SubLObject close_connectionP = NIL;
            try {
                connection = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                if (NIL == sdbc.sql_open_connection_p(connection)) {
                    close_connectionP = T;
                    SubLObject access_path = NIL;
                    final SubLObject _prev_bind_0_$42 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        access_path = sksi_access_path.external_source_access_path(sks, NIL, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$42, thread);
                    }
                    if (NIL == sksi_access_path.access_path_p(access_path)) {
                        Errors.error($str27$Problem_connecting_to_sks__A__cou, sks);
                    }
                    connection = sksi_sks_interaction.open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                    if (NIL == sdbc.sql_open_connection_p(connection)) {
                        Errors.error($str28$Problem_opening_connection_to_sks, sks);
                    }
                    sksi_macros.sksi_connections_for_sks_cache_add(sks, connection);
                }
                SubLObject indices_meta_data = NIL;
                final SubLObject _prev_bind_0_$43 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
                try {
                    sksi_sks_interaction.$sksi_global_resourcingP$.bind(NIL, thread);
                    SubLObject connection_$44 = NIL;
                    SubLObject close_connectionP_$45 = NIL;
                    try {
                        connection_$44 = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                        if (NIL == sdbc.sql_open_connection_p(connection_$44)) {
                            close_connectionP_$45 = T;
                            SubLObject access_path2 = NIL;
                            final SubLObject _prev_bind_0_$44 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                access_path2 = sksi_access_path.external_source_access_path(sks, NIL, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$44, thread);
                            }
                            if (NIL == sksi_access_path.access_path_p(access_path2)) {
                                Errors.error($str27$Problem_connecting_to_sks__A__cou, sks);
                            }
                            connection_$44 = sksi_sks_interaction.open_sql_source(access_path2, ONE_INTEGER, UNPROVIDED);
                            if (NIL == sdbc.sql_open_connection_p(connection_$44)) {
                                Errors.error($str28$Problem_opening_connection_to_sks, sks);
                            }
                            sksi_macros.sksi_connections_for_sks_cache_add(sks, connection_$44);
                        }
                        indices_meta_data = sdbc.sqlc_get_index_info_meta_data(connection_$44, $str77$, $str77$, table_name, NIL, NIL);
                    } finally {
                        final SubLObject _prev_bind_0_$45 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != close_connectionP_$45) {
                                sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                                if (NIL != sdbc.sql_open_connection_p(connection_$44)) {
                                    sdbc.sqlc_close(connection_$44);
                                }
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                        }
                    }
                } finally {
                    sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0_$43, thread);
                }
                SubLObject cdolist_list_var;
                final SubLObject index_names = cdolist_list_var = plistlist_indicator_range(indices_meta_data, $INDEX_NAME);
                SubLObject index_name = NIL;
                index_name = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject index_columns_meta_data = plistlist_filter_and_sort(indices_meta_data, $INDEX_NAME, index_name, symbol_function(EQUAL), $ORDINAL_POSITION, $sym120$OBJECT_STRING__);
                    SubLObject index_pfs = NIL;
                    SubLObject index_non_uniqueP = NIL;
                    SubLObject index_type = NIL;
                    SubLObject cdolist_list_var_$48 = index_columns_meta_data;
                    SubLObject index_column_meta_data = NIL;
                    index_column_meta_data = cdolist_list_var_$48.first();
                    while (NIL != cdolist_list_var_$48) {
                        final SubLObject non_unique = getf(index_column_meta_data, $NON_UNIQUE, UNPROVIDED);
                        final SubLObject index_table_name = getf(index_column_meta_data, $TABLE_NAME, UNPROVIDED);
                        final SubLObject index_column_name = getf(index_column_meta_data, $COLUMN_NAME, UNPROVIDED);
                        final SubLObject index_pf = sksi_find_ps_field(ps, index_column_name);
                        index_type = getf(index_column_meta_data, $TYPE, UNPROVIDED);
                        if (non_unique.equal($$$true)) {
                            index_non_uniqueP = T;
                        }
                        ps = sksi_find_ps_by_table(index_table_name, physical_schemabase_mt);
                        if (NIL == index_pf) {
                            Errors.warn($str114$physical_field_in__A_table__A_nam, ps, index_table_name, index_column_name);
                        } else {
                            index_pfs = cons(index_pf, index_pfs);
                        }
                        cdolist_list_var_$48 = cdolist_list_var_$48.rest();
                        index_column_meta_data = cdolist_list_var_$48.first();
                    } 
                    index_pfs = nreverse(index_pfs);
                    if (NIL != index_pfs) {
                        final SubLObject index_constant_name = cconcatenate(string_utilities.post_remove(constants_high.constant_name(sks), $$$KS, UNPROVIDED), new SubLObject[]{ index_name, $str125$_TheIndex });
                        final SubLObject index_constant = sksi_kb_accessors.sksi_create(index_constant_name);
                        final SubLObject index_type_constant = sksi_index_type_from_index_type_id(index_type);
                        if (NIL == index_non_uniqueP) {
                            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$uniqueFieldList, ps, make_el_list(index_pfs, UNPROVIDED)), physical_schemabase_mt);
                        }
                        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$isa, index_constant, $$IndexDataStructure), $$UniversalVocabularyMt);
                        sksi_kb_accessors.sksi_assert_if_new(make_quaternary_formula($$schemaFieldsIndex, ps, make_el_list(index_pfs, UNPROVIDED), index_name, index_constant), physical_schemabase_mt);
                        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$indexName, index_constant, index_name), physical_schemabase_mt);
                        if (NIL != index_type_constant) {
                            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$indexType, index_constant, index_type_constant), physical_schemabase_mt);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    index_name = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (NIL != close_connectionP) {
                        sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                        if (NIL != sdbc.sql_open_connection_p(connection)) {
                            sdbc.sqlc_close(connection);
                        }
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                }
            }
        } finally {
            sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject sks_ps_add_keys_database_alt(SubLObject sks, SubLObject physical_schemabase_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ps = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sks_find_or_create_ps(sks, physical_schemabase_mt);
                if (NIL != ps) {
                    {
                        SubLObject _prev_bind_0 = $sksi_global_resourcingP$.currentBinding(thread);
                        try {
                            $sksi_global_resourcingP$.bind(NIL, thread);
                            {
                                SubLObject connection = NIL;
                                SubLObject close_connectionP = NIL;
                                try {
                                    connection = sksi_connections_for_sks_cache_get(sks);
                                    if (NIL == sql_open_connection_p(connection)) {
                                        close_connectionP = T;
                                        {
                                            SubLObject access_path = NIL;
                                            {
                                                SubLObject _prev_bind_0_42 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                try {
                                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                    access_path = external_source_access_path(sks, NIL, UNPROVIDED);
                                                } finally {
                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_42, thread);
                                                }
                                            }
                                            if (NIL == access_path_p(access_path)) {
                                                Errors.error($str_alt19$Problem_connecting_to_sks__A__cou, sks);
                                            }
                                            connection = open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                                        }
                                        if (NIL == sql_open_connection_p(connection)) {
                                            Errors.error($str_alt20$Problem_opening_connection_to_sks, sks);
                                        }
                                        sksi_connections_for_sks_cache_add(sks, connection);
                                    }
                                    com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sks_ps_add_primary_keys(sks, ps, physical_schemabase_mt);
                                    com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sks_ps_add_exported_keys(sks, ps, physical_schemabase_mt);
                                    com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sks_ps_add_imported_keys(sks, ps, physical_schemabase_mt);
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            if (NIL != close_connectionP) {
                                                sksi_connections_for_sks_cache_remove(sks);
                                                if (NIL != sql_open_connection_p(connection)) {
                                                    sqlc_close(connection);
                                                }
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_43, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            $sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sks_ps_add_indices(sks, ps, physical_schemabase_mt);
                }
                return ps;
            }
        }
    }

    public static SubLObject sks_ps_add_keys_database(final SubLObject sks, final SubLObject physical_schemabase_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ps = sks_find_or_create_ps(sks, physical_schemabase_mt);
        if (NIL != ps) {
            final SubLObject _prev_bind_0 = sksi_sks_interaction.$sksi_global_resourcingP$.currentBinding(thread);
            try {
                sksi_sks_interaction.$sksi_global_resourcingP$.bind(NIL, thread);
                SubLObject connection = NIL;
                SubLObject close_connectionP = NIL;
                try {
                    connection = sksi_macros.sksi_connections_for_sks_cache_get(sks);
                    if (NIL == sdbc.sql_open_connection_p(connection)) {
                        close_connectionP = T;
                        SubLObject access_path = NIL;
                        final SubLObject _prev_bind_0_$50 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            access_path = sksi_access_path.external_source_access_path(sks, NIL, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$50, thread);
                        }
                        if (NIL == sksi_access_path.access_path_p(access_path)) {
                            Errors.error($str27$Problem_connecting_to_sks__A__cou, sks);
                        }
                        connection = sksi_sks_interaction.open_sql_source(access_path, ONE_INTEGER, UNPROVIDED);
                        if (NIL == sdbc.sql_open_connection_p(connection)) {
                            Errors.error($str28$Problem_opening_connection_to_sks, sks);
                        }
                        sksi_macros.sksi_connections_for_sks_cache_add(sks, connection);
                    }
                    sks_ps_add_primary_keys(sks, ps, physical_schemabase_mt);
                    sks_ps_add_exported_keys(sks, ps, physical_schemabase_mt);
                    sks_ps_add_imported_keys(sks, ps, physical_schemabase_mt);
                } finally {
                    final SubLObject _prev_bind_0_$51 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL != close_connectionP) {
                            sksi_macros.sksi_connections_for_sks_cache_remove(sks);
                            if (NIL != sdbc.sql_open_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                    }
                }
            } finally {
                sksi_sks_interaction.$sksi_global_resourcingP$.rebind(_prev_bind_0, thread);
            }
            sks_ps_add_indices(sks, ps, physical_schemabase_mt);
        }
        return ps;
    }

    public static final SubLObject sks_create_and_add_ps_for_database_int_alt(SubLObject sks, SubLObject field_names, SubLObject physical_schemabase_mt, SubLObject primary_key) {
        if (primary_key == UNPROVIDED) {
            primary_key = NIL;
        }
        SubLTrampolineFile.checkType(sks, SKS_P);
        SubLTrampolineFile.checkType(physical_schemabase_mt, HLMT_P);
        {
            SubLObject ps_name = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sks_make_physical_schema_name(sks);
            SubLObject ps = sksi_kb_accessors.sksi_find_or_create(ps_name);
            sksi_kb_accessors.sksi_assert_if_new(make_unary_formula($$enumerableSchema, ps), physical_schemabase_mt);
            sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$schemaFieldNameList, ps, make_el_list(field_names, UNPROVIDED)), physical_schemabase_mt);
            if (NIL != primary_key) {
                {
                    SubLObject primary_key_pfs = NIL;
                    SubLObject cdolist_list_var = primary_key;
                    SubLObject primary_key_field = NIL;
                    for (primary_key_field = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , primary_key_field = cdolist_list_var.first()) {
                        {
                            SubLObject pf = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sksi_find_ps_field(ps, primary_key_field);
                            if (NIL == pf) {
                                Errors.warn($str_alt70$physical_field_in__A_named__A_not, ps, primary_key_field);
                            } else {
                                primary_key_pfs = cons(pf, primary_key_pfs);
                            }
                        }
                    }
                    if (NIL != primary_key_pfs) {
                        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$primaryKey, ps, make_el_list(primary_key_pfs, UNPROVIDED)), physical_schemabase_mt);
                    }
                }
            }
            return values(ps, T);
        }
    }

    public static SubLObject sks_create_and_add_ps_for_database_int(final SubLObject sks, final SubLObject field_names, final SubLObject physical_schemabase_mt, SubLObject primary_key) {
        if (primary_key == UNPROVIDED) {
            primary_key = NIL;
        }
        assert NIL != sksi_sks_accessors.sks_p(sks) : "! sksi_sks_accessors.sks_p(sks) " + ("sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) ") + sks;
        assert NIL != hlmt.hlmt_p(physical_schemabase_mt) : "! hlmt.hlmt_p(physical_schemabase_mt) " + ("hlmt.hlmt_p(physical_schemabase_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(physical_schemabase_mt) ") + physical_schemabase_mt;
        final SubLObject ps_name = sks_make_physical_schema_name(sks);
        final SubLObject ps = sksi_kb_accessors.sksi_find_or_create(ps_name);
        sksi_kb_accessors.sksi_assert_if_new(make_unary_formula($$enumerableSchema, ps), physical_schemabase_mt);
        sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$schemaFieldNameList, ps, make_el_list(field_names, UNPROVIDED)), physical_schemabase_mt);
        if (NIL != primary_key) {
            SubLObject primary_key_pfs = NIL;
            SubLObject cdolist_list_var = primary_key;
            SubLObject primary_key_field = NIL;
            primary_key_field = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject pf = sksi_find_ps_field(ps, primary_key_field);
                if (NIL == pf) {
                    Errors.warn($str104$physical_field_in__A_named__A_not, ps, primary_key_field);
                } else {
                    primary_key_pfs = cons(pf, primary_key_pfs);
                }
                cdolist_list_var = cdolist_list_var.rest();
                primary_key_field = cdolist_list_var.first();
            } 
            if (NIL != primary_key_pfs) {
                sksi_kb_accessors.sksi_assert_if_new(make_binary_formula($$primaryKey, ps, make_el_list(primary_key_pfs, UNPROVIDED)), physical_schemabase_mt);
            }
        }
        return values(ps, T);
    }

    public static final SubLObject sksi_find_ps_by_table_alt(SubLObject table_name, SubLObject physical_schemabase_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ps = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(physical_schemabase_mt, thread);
                        {
                            SubLObject pred_var = $$schemaName_SKS;
                            if (NIL != do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = new_predicate_extent_final_index_spec_iterator(pred_var);
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        {
                                                            SubLObject done_var_44 = NIL;
                                                            SubLObject token_var_45 = NIL;
                                                            while (NIL == done_var_44) {
                                                                {
                                                                    SubLObject assertion = iteration_next_without_values_macro_helper(final_index_iterator, token_var_45);
                                                                    SubLObject valid_46 = makeBoolean(token_var_45 != assertion);
                                                                    if (NIL != valid_46) {
                                                                        if (sentence_arg2(assertion, UNPROVIDED).equal(table_name)) {
                                                                            ps = sentence_arg1(assertion, UNPROVIDED);
                                                                        }
                                                                    }
                                                                    done_var_44 = makeBoolean(NIL == valid_46);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_47 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_47, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ps;
            }
        }
    }

    public static SubLObject sksi_find_ps_by_table(final SubLObject table_name, final SubLObject physical_schemabase_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ps = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(physical_schemabase_mt, thread);
            final SubLObject pred_var = $$schemaName_SKS;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$52 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$53 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$54 = NIL;
                                final SubLObject token_var_$55 = NIL;
                                while (NIL == done_var_$54) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$55);
                                    final SubLObject valid_$56 = makeBoolean(!token_var_$55.eql(assertion));
                                    if ((NIL != valid_$56) && cycl_utilities.sentence_arg2(assertion, UNPROVIDED).equal(table_name)) {
                                        ps = cycl_utilities.sentence_arg1(assertion, UNPROVIDED);
                                    }
                                    done_var_$54 = makeBoolean(NIL == valid_$56);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$53 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$53, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$52, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ps;
    }

    public static final SubLObject sksi_find_ps_field_by_table_column_alt(SubLObject table_name, SubLObject column_name, SubLObject physical_schemabase_mt) {
        {
            SubLObject ps = com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sksi_find_ps_by_table(table_name, physical_schemabase_mt);
            if (NIL != ps) {
                return com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.sksi_find_ps_field(ps, column_name);
            }
        }
        return NIL;
    }

    public static SubLObject sksi_find_ps_field_by_table_column(final SubLObject table_name, final SubLObject column_name, final SubLObject physical_schemabase_mt) {
        final SubLObject ps = sksi_find_ps_by_table(table_name, physical_schemabase_mt);
        if (NIL != ps) {
            return sksi_find_ps_field(ps, column_name);
        }
        return NIL;
    }

    public static final SubLObject plistlist_indicator_range_alt(SubLObject plistlist, SubLObject indicator) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = plistlist;
            SubLObject plist = NIL;
            for (plist = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , plist = cdolist_list_var.first()) {
                result = cons(getf(plist, indicator, UNPROVIDED), result);
            }
            result = nreverse(result);
            return result;
        }
    }

    public static SubLObject plistlist_indicator_range(final SubLObject plistlist, final SubLObject indicator) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = plistlist;
        SubLObject plist = NIL;
        plist = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(getf(plist, indicator, UNPROVIDED), result);
            cdolist_list_var = cdolist_list_var.rest();
            plist = cdolist_list_var.first();
        } 
        result = nreverse(result);
        return result;
    }

    public static final SubLObject plistlist_filter_and_sort_alt(SubLObject plistlist, SubLObject filter_indicator, SubLObject filter_value, SubLObject filter_test, SubLObject sort_indicator, SubLObject sort_test) {
        {
            SubLObject filtered_plistlist = list_utilities.plistlist_if_getf(plistlist, filter_indicator, filter_value, filter_test);
            SubLObject sorted_filtered_plistlist = list_utilities.plistlist_sort(filtered_plistlist, sort_indicator, sort_test);
            return sorted_filtered_plistlist;
        }
    }

    public static SubLObject plistlist_filter_and_sort(final SubLObject plistlist, final SubLObject filter_indicator, final SubLObject filter_value, final SubLObject filter_test, final SubLObject sort_indicator, final SubLObject sort_test) {
        final SubLObject filtered_plistlist = list_utilities.plistlist_if_getf(plistlist, filter_indicator, filter_value, filter_test);
        final SubLObject sorted_filtered_plistlist = list_utilities.plistlist_sort(filtered_plistlist, sort_indicator, sort_test);
        return sorted_filtered_plistlist;
    }

    public static final SubLObject object_string_L_alt(SubLObject object1, SubLObject object2) {
        return Strings.stringL(princ_to_string(object1), princ_to_string(object2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject object_string_L(final SubLObject object1, final SubLObject object2) {
        return Strings.stringL(princ_to_string(object1), princ_to_string(object2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject repropagate_isas_for_ks_and_each_sub_ks_alt(SubLObject sks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(sks, SKS_P);
            {
                SubLObject cdolist_list_var = sksi_sks_accessors.sks_get(sks, $$subKS_Direct, UNPROVIDED);
                SubLObject sub_ks = NIL;
                for (sub_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_ks = cdolist_list_var.first()) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                            mt_relevance_macros.$mt$.bind($$UniversalVocabularyMt, thread);
                            {
                                SubLObject pred_var = $$isa;
                                if (NIL != do_gaf_arg_index_key_validator(sub_ks, ONE_INTEGER, pred_var)) {
                                    {
                                        SubLObject iterator_var = new_gaf_arg_final_index_spec_iterator(sub_ks, ONE_INTEGER, pred_var);
                                        SubLObject done_var = NIL;
                                        SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            {
                                                SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                if (NIL != valid) {
                                                    {
                                                        SubLObject final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                            {
                                                                SubLObject done_var_48 = NIL;
                                                                SubLObject token_var_49 = NIL;
                                                                while (NIL == done_var_48) {
                                                                    {
                                                                        SubLObject assertion = iteration_next_without_values_macro_helper(final_index_iterator, token_var_49);
                                                                        SubLObject valid_50 = makeBoolean(token_var_49 != assertion);
                                                                        if (NIL != valid_50) {
                                                                            if ((NIL != gaf_assertionP(assertion)) && gaf_arg2(assertion).equal($$StructuredKnowledgeSource)) {
                                                                                sksi_kb_accessors.sksi_repropagate_assertion(assertion);
                                                                            }
                                                                        }
                                                                        done_var_48 = makeBoolean(NIL == valid_50);
                                                                    }
                                                                } 
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_51 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if (NIL != final_index_iterator) {
                                                                        destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_51, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean(NIL == valid);
                                            }
                                        } 
                                    }
                                }
                                if (NIL == isa.isaP(sub_ks, $$StructuredKnowledgeSource_Atomic, UNPROVIDED, UNPROVIDED)) {
                                    com.cyc.cycjava.cycl.sksi.modeling_tools.sksi_sks_structure_importer_utilities.repropagate_isas_for_ks_and_each_sub_ks(sub_ks);
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject repropagate_isas_for_ks_and_each_sub_ks(final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sksi_sks_accessors.sks_p(sks) : "! sksi_sks_accessors.sks_p(sks) " + ("sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) ") + sks;
        SubLObject cdolist_list_var = sksi_sks_accessors.sks_get(sks, $$subKS_Direct, UNPROVIDED);
        SubLObject sub_ks = NIL;
        sub_ks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind($$UniversalVocabularyMt, thread);
                final SubLObject pred_var = $$isa;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(sub_ks, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(sub_ks, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$58 = NIL;
                                final SubLObject token_var_$59 = NIL;
                                while (NIL == done_var_$58) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$59);
                                    final SubLObject valid_$60 = makeBoolean(!token_var_$59.eql(assertion));
                                    if (((NIL != valid_$60) && (NIL != assertions_high.gaf_assertionP(assertion))) && assertions_high.gaf_arg2(assertion).equal($$StructuredKnowledgeSource)) {
                                        sksi_kb_accessors.sksi_repropagate_assertion(assertion);
                                    }
                                    done_var_$58 = makeBoolean(NIL == valid_$60);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$61 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                if (NIL == isa.isaP(sub_ks, $$StructuredKnowledgeSource_Atomic, UNPROVIDED, UNPROVIDED)) {
                    repropagate_isas_for_ks_and_each_sub_ks(sub_ks);
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_ks = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject declare_sksi_sks_structure_importer_utilities_file_alt() {
        declareFunction("sks_physical_structure_decode", "SKS-PHYSICAL-STRUCTURE-DECODE", 1, 0, false);
        declareFunction("sks_initial_ke_validate", "SKS-INITIAL-KE-VALIDATE", 1, 0, false);
        declareFunction("sks_create_and_add_raw_ls", "SKS-CREATE-AND-ADD-RAW-LS", 1, 0, false);
        declareFunction("sks_create_and_add_ps", "SKS-CREATE-AND-ADD-PS", 2, 0, false);
        declareFunction("sks_ps_add_keys", "SKS-PS-ADD-KEYS", 2, 0, false);
        declareFunction("sks_ps_add_pf_properties", "SKS-PS-ADD-PF-PROPERTIES", 2, 0, false);
        declareFunction("sks_find_or_create_ps", "SKS-FIND-OR-CREATE-PS", 2, 0, false);
        declareFunction("sks_make_physical_schema_name", "SKS-MAKE-PHYSICAL-SCHEMA-NAME", 1, 0, false);
        declareFunction("sksi_find_ps_field", "SKSI-FIND-PS-FIELD", 2, 0, false);
        declareFunction("sksi_sks_get_physical_schemas", "SKSI-SKS-GET-PHYSICAL-SCHEMAS", 1, 0, false);
        declareFunction("sksi_sks_get_all_physical_schemas", "SKSI-SKS-GET-ALL-PHYSICAL-SCHEMAS", 1, 0, false);
        declareFunction("sksi_physical_schema_get_physical_fields", "SKSI-PHYSICAL-SCHEMA-GET-PHYSICAL-FIELDS", 1, 0, false);
        declareFunction("sksi_physical_schema_get_physical_field_indexicals", "SKSI-PHYSICAL-SCHEMA-GET-PHYSICAL-FIELD-INDEXICALS", 1, 0, false);
        declareFunction("sks_initial_ke_validate_database", "SKS-INITIAL-KE-VALIDATE-DATABASE", 1, 0, false);
        declareFunction("sks_physical_structure_decode_database", "SKS-PHYSICAL-STRUCTURE-DECODE-DATABASE", 1, 0, false);
        declareFunction("sks_physical_structure_database_row_count", "SKS-PHYSICAL-STRUCTURE-DATABASE-ROW-COUNT", 2, 0, false);
        declareFunction("sks_create_and_add_sub_ks_int", "SKS-CREATE-AND-ADD-SUB-KS-INT", 3, 1, false);
        declareFunction("sks_create_and_add_raw_ls_database", "SKS-CREATE-AND-ADD-RAW-LS-DATABASE", 1, 0, false);
        declareFunction("sksi_create_initial_logical_schemas", "SKSI-CREATE-INITIAL-LOGICAL-SCHEMAS", 2, 0, false);
        declareFunction("sksi_create_logical_schema_for_physical", "SKSI-CREATE-LOGICAL-SCHEMA-FOR-PHYSICAL", 2, 0, false);
        declareFunction("sks_create_and_add_ps_database", "SKS-CREATE-AND-ADD-PS-DATABASE", 2, 0, false);
        declareFunction("sksi_sdbc_column_type_to_cycl", "SKSI-SDBC-COLUMN-TYPE-TO-CYCL", 1, 3, false);
        declareFunction("sks_ps_add_pf_properties_database", "SKS-PS-ADD-PF-PROPERTIES-DATABASE", 2, 0, false);
        declareFunction("sks_ps_add_primary_keys", "SKS-PS-ADD-PRIMARY-KEYS", 3, 0, false);
        declareFunction("sks_ps_add_exported_keys", "SKS-PS-ADD-EXPORTED-KEYS", 3, 0, false);
        declareFunction("sks_ps_add_imported_keys", "SKS-PS-ADD-IMPORTED-KEYS", 3, 0, false);
        declareFunction("sksi_index_type_from_index_type_id", "SKSI-INDEX-TYPE-FROM-INDEX-TYPE-ID", 1, 0, false);
        declareFunction("sks_ps_add_indices", "SKS-PS-ADD-INDICES", 3, 0, false);
        declareFunction("sks_ps_add_keys_database", "SKS-PS-ADD-KEYS-DATABASE", 2, 0, false);
        declareFunction("sks_create_and_add_ps_for_database_int", "SKS-CREATE-AND-ADD-PS-FOR-DATABASE-INT", 3, 1, false);
        declareFunction("sksi_find_ps_by_table", "SKSI-FIND-PS-BY-TABLE", 2, 0, false);
        declareFunction("sksi_find_ps_field_by_table_column", "SKSI-FIND-PS-FIELD-BY-TABLE-COLUMN", 3, 0, false);
        declareFunction("plistlist_indicator_range", "PLISTLIST-INDICATOR-RANGE", 2, 0, false);
        declareFunction("plistlist_filter_and_sort", "PLISTLIST-FILTER-AND-SORT", 6, 0, false);
        declareFunction("object_string_L", "OBJECT-STRING-<", 2, 0, false);
        declareFunction("repropagate_isas_for_ks_and_each_sub_ks", "REPROPAGATE-ISAS-FOR-KS-AND-EACH-SUB-KS", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_sksi_sks_structure_importer_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("sks_physical_structure_decode", "SKS-PHYSICAL-STRUCTURE-DECODE", 1, 0, false);
            declareFunction("sks_initial_ke_validate", "SKS-INITIAL-KE-VALIDATE", 1, 0, false);
            declareFunction("sks_create_and_add_raw_ls", "SKS-CREATE-AND-ADD-RAW-LS", 1, 0, false);
            declareFunction("sks_ps_add_keys", "SKS-PS-ADD-KEYS", 2, 0, false);
            declareFunction("sks_ps_add_pf_properties", "SKS-PS-ADD-PF-PROPERTIES", 2, 0, false);
            declareFunction("sks_find_or_create_ps", "SKS-FIND-OR-CREATE-PS", 2, 0, false);
            declareFunction("sks_make_physical_schema_name", "SKS-MAKE-PHYSICAL-SCHEMA-NAME", 1, 0, false);
            declareFunction("sksi_find_ps_field", "SKSI-FIND-PS-FIELD", 2, 0, false);
            declareFunction("sksi_sks_get_physical_schemas", "SKSI-SKS-GET-PHYSICAL-SCHEMAS", 1, 0, false);
            declareFunction("sksi_sks_get_all_physical_schemas", "SKSI-SKS-GET-ALL-PHYSICAL-SCHEMAS", 1, 0, false);
            declareFunction("sksi_physical_schema_get_physical_fields", "SKSI-PHYSICAL-SCHEMA-GET-PHYSICAL-FIELDS", 1, 0, false);
            declareFunction("sksi_physical_schema_get_physical_field_indexicals", "SKSI-PHYSICAL-SCHEMA-GET-PHYSICAL-FIELD-INDEXICALS", 1, 0, false);
            declareFunction("sksi_sks_get_all_physical_schema_table_names", "SKSI-SKS-GET-ALL-PHYSICAL-SCHEMA-TABLE-NAMES", 1, 1, false);
            declareFunction("ignore_table_schema_specification_p", "IGNORE-TABLE-SCHEMA-SPECIFICATION-P", 1, 0, false);
            declareFunction("sks_initial_ke_validate_database", "SKS-INITIAL-KE-VALIDATE-DATABASE", 1, 0, false);
            declareFunction("sks_gather_physical_database_table_names", "SKS-GATHER-PHYSICAL-DATABASE-TABLE-NAMES", 1, 2, false);
            declareFunction("sks_gather_asserted_table_meta_data_for_table", "SKS-GATHER-ASSERTED-TABLE-META-DATA-FOR-TABLE", 2, 0, false);
            declareFunction("sks_get_datatype_string_for_physical_field", "SKS-GET-DATATYPE-STRING-FOR-PHYSICAL-FIELD", 1, 0, false);
            declareFunction("cluster_physical_database_table_information_by_schemata", "CLUSTER-PHYSICAL-DATABASE-TABLE-INFORMATION-BY-SCHEMATA", 1, 0, false);
            declareFunction("sks_physical_structure_decode_database_table", "SKS-PHYSICAL-STRUCTURE-DECODE-DATABASE-TABLE", 2, 2, false);
            declareFunction("sks_physical_structure_decode_database", "SKS-PHYSICAL-STRUCTURE-DECODE-DATABASE", 1, 0, false);
            declareFunction("sks_physical_structure_database_row_count", "SKS-PHYSICAL-STRUCTURE-DATABASE-ROW-COUNT", 2, 0, false);
            declareFunction("sks_create_and_add_sub_ks_int", "SKS-CREATE-AND-ADD-SUB-KS-INT", 4, 1, false);
            declareFunction("sks_create_and_add_raw_ls_database", "SKS-CREATE-AND-ADD-RAW-LS-DATABASE", 1, 0, false);
            declareFunction("sksi_create_initial_logical_schemas", "SKSI-CREATE-INITIAL-LOGICAL-SCHEMAS", 2, 0, false);
            declareFunction("sksi_create_logical_schema_for_physical", "SKSI-CREATE-LOGICAL-SCHEMA-FOR-PHYSICAL", 2, 0, false);
            declareFunction("sks_create_and_add_ps_database", "SKS-CREATE-AND-ADD-PS-DATABASE", 2, 1, false);
            declareFunction("sksi_sdbc_column_type_to_cycl", "SKSI-SDBC-COLUMN-TYPE-TO-CYCL", 1, 3, false);
            declareFunction("sks_ps_add_pf_properties_database", "SKS-PS-ADD-PF-PROPERTIES-DATABASE", 2, 0, false);
            declareFunction("sks_ps_get_schema_name", "SKS-PS-GET-SCHEMA-NAME", 2, 0, false);
            declareFunction("sks_ps_add_primary_keys", "SKS-PS-ADD-PRIMARY-KEYS", 3, 0, false);
            declareFunction("sks_ps_add_exported_keys", "SKS-PS-ADD-EXPORTED-KEYS", 3, 0, false);
            declareFunction("sks_ps_add_imported_keys", "SKS-PS-ADD-IMPORTED-KEYS", 3, 0, false);
            declareFunction("sksi_index_type_from_index_type_id", "SKSI-INDEX-TYPE-FROM-INDEX-TYPE-ID", 1, 0, false);
            declareFunction("sks_ps_add_indices", "SKS-PS-ADD-INDICES", 3, 0, false);
            declareFunction("sks_ps_add_keys_database", "SKS-PS-ADD-KEYS-DATABASE", 2, 0, false);
            declareFunction("sks_create_and_add_ps_for_database_int", "SKS-CREATE-AND-ADD-PS-FOR-DATABASE-INT", 3, 1, false);
            declareFunction("sksi_find_ps_by_table", "SKSI-FIND-PS-BY-TABLE", 2, 0, false);
            declareFunction("sksi_find_ps_field_by_table_column", "SKSI-FIND-PS-FIELD-BY-TABLE-COLUMN", 3, 0, false);
            declareFunction("plistlist_indicator_range", "PLISTLIST-INDICATOR-RANGE", 2, 0, false);
            declareFunction("plistlist_filter_and_sort", "PLISTLIST-FILTER-AND-SORT", 6, 0, false);
            declareFunction("object_string_L", "OBJECT-STRING-<", 2, 0, false);
            declareFunction("repropagate_isas_for_ks_and_each_sub_ks", "REPROPAGATE-ISAS-FOR-KS-AND-EACH-SUB-KS", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("sks_create_and_add_ps", "SKS-CREATE-AND-ADD-PS", 2, 0, false);
            declareFunction("sks_create_and_add_sub_ks_int", "SKS-CREATE-AND-ADD-SUB-KS-INT", 3, 1, false);
            declareFunction("sks_create_and_add_ps_database", "SKS-CREATE-AND-ADD-PS-DATABASE", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_sksi_sks_structure_importer_utilities_file_Previous() {
        declareFunction("sks_physical_structure_decode", "SKS-PHYSICAL-STRUCTURE-DECODE", 1, 0, false);
        declareFunction("sks_initial_ke_validate", "SKS-INITIAL-KE-VALIDATE", 1, 0, false);
        declareFunction("sks_create_and_add_raw_ls", "SKS-CREATE-AND-ADD-RAW-LS", 1, 0, false);
        declareFunction("sks_ps_add_keys", "SKS-PS-ADD-KEYS", 2, 0, false);
        declareFunction("sks_ps_add_pf_properties", "SKS-PS-ADD-PF-PROPERTIES", 2, 0, false);
        declareFunction("sks_find_or_create_ps", "SKS-FIND-OR-CREATE-PS", 2, 0, false);
        declareFunction("sks_make_physical_schema_name", "SKS-MAKE-PHYSICAL-SCHEMA-NAME", 1, 0, false);
        declareFunction("sksi_find_ps_field", "SKSI-FIND-PS-FIELD", 2, 0, false);
        declareFunction("sksi_sks_get_physical_schemas", "SKSI-SKS-GET-PHYSICAL-SCHEMAS", 1, 0, false);
        declareFunction("sksi_sks_get_all_physical_schemas", "SKSI-SKS-GET-ALL-PHYSICAL-SCHEMAS", 1, 0, false);
        declareFunction("sksi_physical_schema_get_physical_fields", "SKSI-PHYSICAL-SCHEMA-GET-PHYSICAL-FIELDS", 1, 0, false);
        declareFunction("sksi_physical_schema_get_physical_field_indexicals", "SKSI-PHYSICAL-SCHEMA-GET-PHYSICAL-FIELD-INDEXICALS", 1, 0, false);
        declareFunction("sksi_sks_get_all_physical_schema_table_names", "SKSI-SKS-GET-ALL-PHYSICAL-SCHEMA-TABLE-NAMES", 1, 1, false);
        declareFunction("ignore_table_schema_specification_p", "IGNORE-TABLE-SCHEMA-SPECIFICATION-P", 1, 0, false);
        declareFunction("sks_initial_ke_validate_database", "SKS-INITIAL-KE-VALIDATE-DATABASE", 1, 0, false);
        declareFunction("sks_gather_physical_database_table_names", "SKS-GATHER-PHYSICAL-DATABASE-TABLE-NAMES", 1, 2, false);
        declareFunction("sks_gather_asserted_table_meta_data_for_table", "SKS-GATHER-ASSERTED-TABLE-META-DATA-FOR-TABLE", 2, 0, false);
        declareFunction("sks_get_datatype_string_for_physical_field", "SKS-GET-DATATYPE-STRING-FOR-PHYSICAL-FIELD", 1, 0, false);
        declareFunction("cluster_physical_database_table_information_by_schemata", "CLUSTER-PHYSICAL-DATABASE-TABLE-INFORMATION-BY-SCHEMATA", 1, 0, false);
        declareFunction("sks_physical_structure_decode_database_table", "SKS-PHYSICAL-STRUCTURE-DECODE-DATABASE-TABLE", 2, 2, false);
        declareFunction("sks_physical_structure_decode_database", "SKS-PHYSICAL-STRUCTURE-DECODE-DATABASE", 1, 0, false);
        declareFunction("sks_physical_structure_database_row_count", "SKS-PHYSICAL-STRUCTURE-DATABASE-ROW-COUNT", 2, 0, false);
        declareFunction("sks_create_and_add_sub_ks_int", "SKS-CREATE-AND-ADD-SUB-KS-INT", 4, 1, false);
        declareFunction("sks_create_and_add_raw_ls_database", "SKS-CREATE-AND-ADD-RAW-LS-DATABASE", 1, 0, false);
        declareFunction("sksi_create_initial_logical_schemas", "SKSI-CREATE-INITIAL-LOGICAL-SCHEMAS", 2, 0, false);
        declareFunction("sksi_create_logical_schema_for_physical", "SKSI-CREATE-LOGICAL-SCHEMA-FOR-PHYSICAL", 2, 0, false);
        declareFunction("sks_create_and_add_ps_database", "SKS-CREATE-AND-ADD-PS-DATABASE", 2, 1, false);
        declareFunction("sksi_sdbc_column_type_to_cycl", "SKSI-SDBC-COLUMN-TYPE-TO-CYCL", 1, 3, false);
        declareFunction("sks_ps_add_pf_properties_database", "SKS-PS-ADD-PF-PROPERTIES-DATABASE", 2, 0, false);
        declareFunction("sks_ps_get_schema_name", "SKS-PS-GET-SCHEMA-NAME", 2, 0, false);
        declareFunction("sks_ps_add_primary_keys", "SKS-PS-ADD-PRIMARY-KEYS", 3, 0, false);
        declareFunction("sks_ps_add_exported_keys", "SKS-PS-ADD-EXPORTED-KEYS", 3, 0, false);
        declareFunction("sks_ps_add_imported_keys", "SKS-PS-ADD-IMPORTED-KEYS", 3, 0, false);
        declareFunction("sksi_index_type_from_index_type_id", "SKSI-INDEX-TYPE-FROM-INDEX-TYPE-ID", 1, 0, false);
        declareFunction("sks_ps_add_indices", "SKS-PS-ADD-INDICES", 3, 0, false);
        declareFunction("sks_ps_add_keys_database", "SKS-PS-ADD-KEYS-DATABASE", 2, 0, false);
        declareFunction("sks_create_and_add_ps_for_database_int", "SKS-CREATE-AND-ADD-PS-FOR-DATABASE-INT", 3, 1, false);
        declareFunction("sksi_find_ps_by_table", "SKSI-FIND-PS-BY-TABLE", 2, 0, false);
        declareFunction("sksi_find_ps_field_by_table_column", "SKSI-FIND-PS-FIELD-BY-TABLE-COLUMN", 3, 0, false);
        declareFunction("plistlist_indicator_range", "PLISTLIST-INDICATOR-RANGE", 2, 0, false);
        declareFunction("plistlist_filter_and_sort", "PLISTLIST-FILTER-AND-SORT", 6, 0, false);
        declareFunction("object_string_L", "OBJECT-STRING-<", 2, 0, false);
        declareFunction("repropagate_isas_for_ks_and_each_sub_ks", "REPROPAGATE-ISAS-FOR-KS-AND-EACH-SUB-KS", 1, 0, false);
        return NIL;
    }

    static private final SubLString $str_alt5$A_physical_schema_for_ = makeString("A physical schema for ");

    static private final SubLString $str_alt6$_ = makeString(".");

    static private final SubLString $str_alt7$_KS = makeString("-KS");

    static private final SubLString $str_alt8$_PS = makeString("-PS");

    static private final SubLList $list_alt15 = list(reader_make_constant_shell("passwordForSKS"), reader_make_constant_shell("serverOfSKS"), reader_make_constant_shell("sksIsa"), reader_make_constant_shell("sqlProgramForSKS"), reader_make_constant_shell("structuredKnowledgeSourceName"), reader_make_constant_shell("subProtocolForSKS"), reader_make_constant_shell("userNameForSKS"));

    static private final SubLString $str_alt16$_A_does_not_have_a_corresponding_ = makeString("~A does not have a corresponding #$definingMt (or legacy #$mappingMt)");

    static private final SubLString $str_alt18$_A_is_missing__A_data = makeString("~A is missing ~A data");

    static private final SubLString $str_alt19$Problem_connecting_to_sks__A__cou = makeString("Problem connecting to sks ~A--couldn't determine access path.");

    static private final SubLString $str_alt20$Problem_opening_connection_to_sks = makeString("Problem opening connection to sks ~A.");

    static private final SubLString $str_alt22$_ = makeString("%");

    static private final SubLList $list_alt23 = list(makeString("TABLE"));

    static private final SubLString $str_alt24$The_defining_mt_for_sks__A_is_not = makeString("The defining-mt for sks ~A is not set!");

    static private final SubLString $str_alt26$select_count____from_ = makeString("select count(*) from ");

    static private final SubLSymbol $sym27$NON_EMPTY_STRING_ = makeSymbol("NON-EMPTY-STRING?");

    static private final SubLString $str_alt31$Couldn_t_find___sksPhysicalSchema = makeString("Couldn't find #$sksPhysicalSchemaDescriptionMt assertion for ~A in #$UniversalVocabularyMt");

    static private final SubLString $str_alt33$_LS = makeString("-LS");

    static private final SubLString $str_alt38$A_logical_schema_corresponding_to = makeString("A logical schema corresponding to a portion of the #$");

    static private final SubLString $str_alt39$_physical_schema_ = makeString(" physical schema.");

    public static final SubLObject init_sksi_sks_structure_importer_utilities_file_alt() {
        deflexical("*SKS-REQUIRED-FIELDS-DATABASE*", $list_alt15);
        return NIL;
    }

    public static SubLObject init_sksi_sks_structure_importer_utilities_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*SKS-REQUIRED-FIELDS-DATABASE*", $list18);
            deflexical("*SKS-INCLUSIVE-CATALOG-PATTERN*", NIL);
            deflexical("*SKS-INCLUSIVE-SCHEMA-PATTERN*", $str21$_);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SKS-REQUIRED-FIELDS-DATABASE*", $list_alt15);
        }
        return NIL;
    }

    public static SubLObject init_sksi_sks_structure_importer_utilities_file_Previous() {
        deflexical("*SKS-REQUIRED-FIELDS-DATABASE*", $list18);
        deflexical("*SKS-INCLUSIVE-CATALOG-PATTERN*", NIL);
        deflexical("*SKS-INCLUSIVE-SCHEMA-PATTERN*", $str21$_);
        return NIL;
    }

    public static SubLObject setup_sksi_sks_structure_importer_utilities_file() {
        register_external_symbol(SKSI_SKS_GET_ALL_PHYSICAL_SCHEMA_TABLE_NAMES);
        register_external_symbol($sks_inclusive_catalog_pattern$);
        register_external_symbol($sks_inclusive_schema_pattern$);
        register_external_symbol(IGNORE_TABLE_SCHEMA_SPECIFICATION_P);
        register_external_symbol(SKS_GATHER_PHYSICAL_DATABASE_TABLE_NAMES);
        register_external_symbol(SKS_GATHER_ASSERTED_TABLE_META_DATA_FOR_TABLE);
        register_external_symbol(CLUSTER_PHYSICAL_DATABASE_TABLE_INFORMATION_BY_SCHEMATA);
        register_external_symbol(SKS_PHYSICAL_STRUCTURE_DECODE_DATABASE_TABLE);
        return NIL;
    }

    static private final SubLSymbol $sym48$_WHAT = makeSymbol("?WHAT");

    @Override
    public void declareFunctions() {
        declare_sksi_sks_structure_importer_utilities_file();
    }

    public static final SubLSymbol $kw53$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");

    @Override
    public void initializeVariables() {
        init_sksi_sks_structure_importer_utilities_file();
    }

    static private final SubLString $str_alt54$No_better_type_found_for__A__usin = makeString("No better type found for ~A; using it.");

    @Override
    public void runTopLevelForms() {
        setup_sksi_sks_structure_importer_utilities_file();
    }

    static private final SubLString $str_alt55$Also__failed_to_reify__A_ = makeString("Also, failed to reify ~A.");

    static {
    }

    static private final SubLSymbol $sym69$_ = makeSymbol("<");

    static private final SubLString $str_alt70$physical_field_in__A_named__A_not = makeString("physical field in ~A named ~A not found.");

    static private final SubLString $str_alt81$physical_field_in__A_table__A_nam = makeString("physical field in ~A table ~A named ~A not found.");

    static private final SubLSymbol $sym87$OBJECT_STRING__ = makeSymbol("OBJECT-STRING-<");

    static private final SubLString $str_alt92$_TheIndex = makeString("-TheIndex");
}

/**
 * Total time: 816 ms synthetic
 */
