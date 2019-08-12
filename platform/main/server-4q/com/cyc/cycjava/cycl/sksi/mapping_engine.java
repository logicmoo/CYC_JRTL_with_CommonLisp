/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      MAPPING-ENGINE
 * source file: /cyc/top/cycl/sksi/mapping-engine.lisp
 * created:     2019/07/03 17:38:34
 */
public final class mapping_engine extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt26$ = makeString("");

    public static final SubLFile me = new mapping_engine();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.mapping_engine";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $semantic_etl_table_merge_methods$ = makeSymbol("*SEMANTIC-ETL-TABLE-MERGE-METHODS*");

    // defparameter
    /**
     * In order for two columns to be considered 'mergeable', the type for the two
     * columns must cover at least this much of the content of each column.
     */
    @LispMethod(comment = "In order for two columns to be considered \'mergeable\', the type for the two\r\ncolumns must cover at least this much of the content of each column.\ndefparameter\nIn order for two columns to be considered \'mergeable\', the type for the two\ncolumns must cover at least this much of the content of each column.")
    private static final SubLSymbol $db_fusion_column_union_coverage_minumum$ = makeSymbol("*DB-FUSION-COLUMN-UNION-COVERAGE-MINUMUM*");

    // defparameter
    /**
     * In order for two columns to be considered 'mergeable', the tf*idf for
     * covering type must be at least this value for each column.
     */
    @LispMethod(comment = "In order for two columns to be considered \'mergeable\', the tf*idf for\r\ncovering type must be at least this value for each column.\ndefparameter\nIn order for two columns to be considered \'mergeable\', the tf*idf for\ncovering type must be at least this value for each column.")
    private static final SubLSymbol $db_fusion_column_union_tf_idf_minimum$ = makeSymbol("*DB-FUSION-COLUMN-UNION-TF-IDF-MINIMUM*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol SEMANTICS_P = makeSymbol("SEMANTICS-P");

    static private final SubLList $list1 = list(makeSymbol("REFINED-OUTPUT-SPEC-ABSTRACT-OUT-COMMON-COLUMN"), makeSymbol("REFINED-OUTPUT-SPEC-BASED-ON-POSSIBLE-GENL-TABLES"), makeSymbol("REFINED-OUTPUT-SPEC-OUTWARDS-BASED-ON-POSSIBLE-GENL-TABLES"), makeSymbol("REFINED-OUTPUT-SPEC-MERGE-EQUIVALENT-TABLES"));

    private static final SubLSymbol SEMANTIC_ETL_IMPROVE_OUTPUT_SPEC_EXTERNAL = makeSymbol("SEMANTIC-ETL-IMPROVE-OUTPUT-SPEC-EXTERNAL");

    static private final SubLString $str3$not_exactly_two_databases__a_in_o = makeString("not exactly two databases ~a in output-spec");

    static private final SubLString $str4$_id = makeString("_id");

    static private final SubLString $$$int = makeString("int");

    static private final SubLList $list6 = list(makeSymbol("TABLE1-ID"), makeSymbol("TABLE2-ID"));

    private static final SubLFloat $float$0_1 = makeDouble(0.1);

    static private final SubLList $list8 = list(makeSymbol("FROM-COL"), makeSymbol("TO-COL"), makeSymbol("TYPE"));

    static private final SubLSymbol $sym9$_ = makeSymbol("<");

    private static final SubLSymbol FIRST_THIRD_GENERALITY_ESTIMATE = makeSymbol("FIRST-THIRD-GENERALITY-ESTIMATE");

    private static final SubLSymbol POSSIBLE_CORRESPONDENCE_CONTAINS_EQUAL_JUSTIFICATION = makeSymbol("POSSIBLE-CORRESPONDENCE-CONTAINS-EQUAL-JUSTIFICATION");

    private static final SubLSymbol UNAMBIGUOUS_FROM_COLUMN = makeSymbol("UNAMBIGUOUS-FROM-COLUMN");

    static private final SubLList $list15 = list(makeSymbol("TABLE1-COLUMN"), makeSymbol("TABLE2-COLUMN"), makeSymbol("COLUMN-TYPE"));

    private static final SubLSymbol EXTRACT_ADDED_COLUMN = makeSymbol("EXTRACT-ADDED-COLUMN");



    static private final SubLString $str22$NEW_TABLE_NAME = makeString("NEW_TABLE_NAME");

    private static final SubLSymbol COLUMN_SEMANTICS_COLUMN_NAME = makeSymbol("COLUMN-SEMANTICS-COLUMN-NAME");

    static private final SubLList $list24 = list(makeSymbol("COL-1"), makeSymbol("COL-2"), makeSymbol("TYPE"));

    static private final SubLList $list25 = list(makeSymbol("TABLE-1-COL"), makeSymbol("TABLE-2-COL"), makeSymbol("TYPE"));

    static private final SubLString $str26$ = makeString("");

    static private final SubLString $str27$new_ = makeString("new_");

    static private final SubLString $str28$___genls____a____a____linkTables_ = makeString("\n (genls\n  ~a\n  ~a)\n (linkTables\n  ~a\n  ~a)\n (mergingTables\n  ~a\n  ~a)\n (mergingColumns\n  ~a\n  ~a)");

    static private final SubLString $str29$More_than_two_source_databases_in = makeString("More than two source databases in mapping table ~a");



    static private final SubLList $list31 = list(list(reader_make_constant_shell("equals"), makeKeyword("EQUAL"), makeKeyword("UNKNOWN-WEIGHT")));

    static private final SubLList $list32 = list(makeKeyword("EQUAL"), makeKeyword("UNKNOWN-WEIGHT"));

    static private final SubLList $list33 = list(makeKeyword("GENLS"), makeKeyword("UNKNOWN-WEIGHT"));

    private static final SubLSymbol BETTER_COLUMN_MERGE_TARGET = makeSymbol("BETTER-COLUMN-MERGE-TARGET");

    private static final SubLSymbol DATE_GENLS = makeSymbol("DATE-GENLS");



    public static final SubLSymbol $date_genls_caching_state$ = makeSymbol("*DATE-GENLS-CACHING-STATE*");

    private static final SubLFloat $float$0_6 = makeDouble(0.6);

    private static final SubLFloat $float$0_15 = makeDouble(0.15);



    private static final SubLSymbol $sym42$_ = makeSymbol(">");

    private static final SubLFloat $float$0_67 = makeDouble(0.67);



    private static final SubLFloat $float$0_33 = makeDouble(0.33);



    private static final SubLString $$$CS = makeString("CS");

    private static final SubLString $str49$Addison_Wesley = makeString("Addison-Wesley");

    private static final SubLSymbol C_SEMANT_COLUMN_NAME = makeSymbol("C-SEMANT-COLUMN-NAME");

    private static final SubLList $list52 = list(makeSymbol("FROM-COLUMN"), makeSymbol("TO-COLUMN"), makeSymbol("JUSTIFICATION"));

    private static final SubLString $str53$Need_to_move_data_to__A_to_satisf = makeString("Need to move data to ~A to satisfy foreign-key constraints, but can't figure out which column to move it to.");

    // Definitions
    public static final SubLObject semantic_etl_compute_output_spec_alt(SubLObject semantics1, SubLObject semantics2, SubLObject target_access_path, SubLObject improveP) {
        if (improveP == UNPROVIDED) {
            improveP = T;
        }
        SubLTrampolineFile.checkType(semantics1, SEMANTICS_P);
        SubLTrampolineFile.checkType(semantics2, SEMANTICS_P);
        {
            SubLObject trivial_output_spec = semantic_etl_bus.new_database_output_spec(semantics1, semantics2, target_access_path);
            SubLObject os_id = semantic_etl_bus.db_output_spec_id(trivial_output_spec);
            semantic_etl_bus.put_db_output_spec(os_id, trivial_output_spec);
            if (NIL == improveP) {
                return list(trivial_output_spec);
            }
            return com.cyc.cycjava.cycl.sksi.mapping_engine.semantic_etl_improve_output_spec(os_id);
        }
    }

    // Definitions
    public static SubLObject semantic_etl_compute_output_spec(final SubLObject semantics1, final SubLObject semantics2, final SubLObject target_access_path, SubLObject improveP) {
        if (improveP == UNPROVIDED) {
            improveP = T;
        }
        assert NIL != semantic_etl_bus.semantics_p(semantics1) : "! semantic_etl_bus.semantics_p(semantics1) " + ("semantic_etl_bus.semantics_p(semantics1) " + "CommonSymbols.NIL != semantic_etl_bus.semantics_p(semantics1) ") + semantics1;
        assert NIL != semantic_etl_bus.semantics_p(semantics2) : "! semantic_etl_bus.semantics_p(semantics2) " + ("semantic_etl_bus.semantics_p(semantics2) " + "CommonSymbols.NIL != semantic_etl_bus.semantics_p(semantics2) ") + semantics2;
        final SubLObject trivial_output_spec = semantic_etl_bus.new_database_output_spec(semantics1, semantics2, target_access_path);
        final SubLObject os_id = semantic_etl_bus.db_output_spec_id(trivial_output_spec);
        semantic_etl_bus.put_db_output_spec(os_id, trivial_output_spec);
        if (NIL == improveP) {
            return list(trivial_output_spec);
        }
        return semantic_etl_improve_output_spec(os_id);
    }

    /**
     * Appropriate trampoline for the private method.
     */
    @LispMethod(comment = "Appropriate trampoline for the private method.")
    public static final SubLObject semantic_etl_improve_output_spec_external_alt(SubLObject id) {
        return com.cyc.cycjava.cycl.sksi.mapping_engine.semantic_etl_improve_output_spec(id);
    }

    /**
     * Appropriate trampoline for the private method.
     */
    @LispMethod(comment = "Appropriate trampoline for the private method.")
    public static SubLObject semantic_etl_improve_output_spec_external(final SubLObject id) {
        return semantic_etl_improve_output_spec(id);
    }

    public static final SubLObject semantic_etl_improve_output_spec_alt(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject output_spec = semantic_etl_bus.get_db_output_spec(id);
                SubLObject semantics = semantic_etl_bus.db_output_spec_semantics(output_spec);
                SubLObject dict = semantic_etl_bus.semant_dict(semantics);
                SubLObject table_id_pairs = com.cyc.cycjava.cycl.sksi.mapping_engine.semantic_etl_compute_possible_table_id_pairs(output_spec);
                SubLObject result_output_specs = list(output_spec);
                {
                    SubLObject cdolist_list_var = $semantic_etl_table_merge_methods$.getDynamicValue(thread);
                    SubLObject merge_method = NIL;
                    for (merge_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , merge_method = cdolist_list_var.first()) {
                        result_output_specs = cconcatenate(funcall(merge_method, output_spec, dict, table_id_pairs), result_output_specs);
                    }
                }
                {
                    SubLObject modifications = NIL;
                    SubLObject success = NIL;
                    try {
                        {
                            SubLObject cdolist_list_var = result_output_specs;
                            SubLObject os = NIL;
                            for (os = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , os = cdolist_list_var.first()) {
                                {
                                    SubLObject spec_id = semantic_etl_bus.db_output_spec_id(os);
                                    modifications = cons(spec_id, modifications);
                                    semantic_etl_bus.put_db_output_spec(spec_id, os);
                                }
                            }
                            success = T;
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (NIL == success) {
                                    {
                                        SubLObject cdolist_list_var = modifications;
                                        SubLObject modification = NIL;
                                        for (modification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , modification = cdolist_list_var.first()) {
                                            semantic_etl_bus.remove_db_output_spec(modification);
                                        }
                                    }
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return nreverse(result_output_specs);
            }
        }
    }

    public static SubLObject semantic_etl_improve_output_spec(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject output_spec = semantic_etl_bus.get_db_output_spec(id);
        final SubLObject semantics = semantic_etl_bus.db_output_spec_semantics(output_spec);
        final SubLObject dict = semantic_etl_bus.semant_dict(semantics);
        final SubLObject table_id_pairs = semantic_etl_compute_possible_table_id_pairs(output_spec);
        SubLObject result_output_specs = list(output_spec);
        SubLObject cdolist_list_var = $semantic_etl_table_merge_methods$.getDynamicValue(thread);
        SubLObject merge_method = NIL;
        merge_method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result_output_specs = cconcatenate(funcall(merge_method, output_spec, dict, table_id_pairs), result_output_specs);
            cdolist_list_var = cdolist_list_var.rest();
            merge_method = cdolist_list_var.first();
        } 
        SubLObject modifications = NIL;
        SubLObject success = NIL;
        try {
            SubLObject cdolist_list_var2 = result_output_specs;
            SubLObject os = NIL;
            os = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject spec_id = semantic_etl_bus.db_output_spec_id(os);
                modifications = cons(spec_id, modifications);
                semantic_etl_bus.put_db_output_spec(spec_id, os);
                cdolist_list_var2 = cdolist_list_var2.rest();
                os = cdolist_list_var2.first();
            } 
            success = T;
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL == success) {
                    SubLObject cdolist_list_var3 = modifications;
                    SubLObject modification = NIL;
                    modification = cdolist_list_var3.first();
                    while (NIL != cdolist_list_var3) {
                        semantic_etl_bus.remove_db_output_spec(modification);
                        cdolist_list_var3 = cdolist_list_var3.rest();
                        modification = cdolist_list_var3.first();
                    } 
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return nreverse(result_output_specs);
    }

    /**
     * IF some column in table1 is an id column (unique and pointed to/foreign key in other columns)
     * AND table1.column1 is the only other column
     * AND table1.column1 is a content column
     * AND table1.column1 = table2.column2 (data overlap)
     * THEN move data of table2.column2 into table1.column1 (updating the table1's id column)
     * update table2.column2 with the (possibly newly created) ids
     */
    @LispMethod(comment = "IF some column in table1 is an id column (unique and pointed to/foreign key in other columns)\r\nAND table1.column1 is the only other column\r\nAND table1.column1 is a content column\r\nAND table1.column1 = table2.column2 (data overlap)\r\nTHEN move data of table2.column2 into table1.column1 (updating the table1\'s id column)\r\nupdate table2.column2 with the (possibly newly created) ids\nIF some column in table1 is an id column (unique and pointed to/foreign key in other columns)\nAND table1.column1 is the only other column\nAND table1.column1 is a content column\nAND table1.column1 = table2.column2 (data overlap)\nTHEN move data of table2.column2 into table1.column1 (updating the table1\'s id column)\nupdate table2.column2 with the (possibly newly created) ids")
    public static final SubLObject refined_output_spec_abstract_out_common_column_alt(SubLObject output_spec, SubLObject dict, SubLObject table_id_pairs) {
        {
            SubLObject result_output_specs = NIL;
            SubLObject databases = semantic_etl_bus.output_spec_get_access_paths(output_spec);
            SubLObject tables = semantic_etl_bus.output_spec_get_tables(output_spec);
            SubLObject db1 = databases.first();
            if (!length(databases).numE(TWO_INTEGER)) {
                Errors.error($str_alt3$not_exactly_two_databases__a_in_o, databases);
            }
            {
                SubLObject cdolist_list_var = tables;
                SubLObject table1 = NIL;
                for (table1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , table1 = cdolist_list_var.first()) {
                    {
                        SubLObject native_key_columns = semantic_etl_bus.table_semantics_primary_key_columns(table1);
                        SubLObject native_key_column = NIL;
                        SubLObject content_columns = semantic_etl_bus.table_semantics_content_columns(table1);
                        SubLObject content_column = NIL;
                        SubLObject column_count = semantic_etl_bus.table_semantics_column_count(table1);
                        if ((column_count.numE(TWO_INTEGER) && (NIL != list_utilities.singletonP(native_key_columns))) && (NIL != list_utilities.singletonP(content_columns))) {
                            native_key_column = native_key_columns.first();
                            content_column = content_columns.first();
                            db1 = semantic_etl_bus.semant_access_path(semantic_etl_bus.t_semant_source_semantics(table1));
                            {
                                SubLObject cdolist_list_var_1 = tables;
                                SubLObject table2 = NIL;
                                for (table2 = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , table2 = cdolist_list_var_1.first()) {
                                    if (db1 != semantic_etl_bus.semant_access_path(semantic_etl_bus.t_semant_source_semantics(table2))) {
                                        {
                                            SubLObject cdolist_list_var_2 = semantic_etl_bus.table_semantics_column_semantics_list(table2);
                                            SubLObject column = NIL;
                                            for (column = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , column = cdolist_list_var_2.first()) {
                                                if (NIL != semantic_etl_bus.content_columnP(column)) {
                                                    {
                                                        SubLObject mergeable_result = com.cyc.cycjava.cycl.sksi.mapping_engine.column_values_mergeable_as(column, content_column, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        if (NIL != mergeable_result) {
                                                            {
                                                                SubLObject new_output_spec = semantic_etl_bus.copy_database_output_spec(output_spec);
                                                                SubLObject expand_column = semantic_etl_bus.output_spec_get_native_column_semantics(new_output_spec, content_column);
                                                                SubLObject id_column = semantic_etl_bus.output_spec_get_native_column_semantics(new_output_spec, native_key_column);
                                                                SubLObject kill_column = semantic_etl_bus.output_spec_get_native_column_semantics(new_output_spec, column);
                                                                SubLObject justification = mergeable_result.first();
                                                                result_output_specs = cons(com.cyc.cycjava.cycl.sksi.mapping_engine.merge_columns_by_foreign_key(new_output_spec, id_column, expand_column, kill_column, justification), result_output_specs);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return result_output_specs;
        }
    }

    /**
     * IF some column in table1 is an id column (unique and pointed to/foreign key in other columns)
     * AND table1.column1 is the only other column
     * AND table1.column1 is a content column
     * AND table1.column1 = table2.column2 (data overlap)
     * THEN move data of table2.column2 into table1.column1 (updating the table1's id column)
     * update table2.column2 with the (possibly newly created) ids
     */
    @LispMethod(comment = "IF some column in table1 is an id column (unique and pointed to/foreign key in other columns)\r\nAND table1.column1 is the only other column\r\nAND table1.column1 is a content column\r\nAND table1.column1 = table2.column2 (data overlap)\r\nTHEN move data of table2.column2 into table1.column1 (updating the table1\'s id column)\r\nupdate table2.column2 with the (possibly newly created) ids\nIF some column in table1 is an id column (unique and pointed to/foreign key in other columns)\nAND table1.column1 is the only other column\nAND table1.column1 is a content column\nAND table1.column1 = table2.column2 (data overlap)\nTHEN move data of table2.column2 into table1.column1 (updating the table1\'s id column)\nupdate table2.column2 with the (possibly newly created) ids")
    public static SubLObject refined_output_spec_abstract_out_common_column(final SubLObject output_spec, final SubLObject dict, final SubLObject table_id_pairs) {
        SubLObject result_output_specs = NIL;
        final SubLObject databases = semantic_etl_bus.output_spec_get_access_paths(output_spec);
        final SubLObject tables = semantic_etl_bus.output_spec_get_tables(output_spec);
        SubLObject db1 = databases.first();
        if (!length(databases).numE(TWO_INTEGER)) {
            Errors.error($str3$not_exactly_two_databases__a_in_o, databases);
        }
        SubLObject cdolist_list_var = tables;
        SubLObject table1 = NIL;
        table1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject native_key_columns = semantic_etl_bus.table_semantics_primary_key_columns(table1);
            SubLObject native_key_column = NIL;
            final SubLObject content_columns = semantic_etl_bus.table_semantics_content_columns(table1);
            SubLObject content_column = NIL;
            final SubLObject column_count = semantic_etl_bus.table_semantics_column_count(table1);
            if ((column_count.numE(TWO_INTEGER) && (NIL != list_utilities.singletonP(native_key_columns))) && (NIL != list_utilities.singletonP(content_columns))) {
                native_key_column = native_key_columns.first();
                content_column = content_columns.first();
                db1 = semantic_etl_bus.semant_access_path(semantic_etl_bus.t_semant_source_semantics(table1));
                SubLObject cdolist_list_var_$1 = tables;
                SubLObject table2 = NIL;
                table2 = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    if (!db1.eql(semantic_etl_bus.semant_access_path(semantic_etl_bus.t_semant_source_semantics(table2)))) {
                        SubLObject cdolist_list_var_$2 = semantic_etl_bus.table_semantics_column_semantics_list(table2);
                        SubLObject column = NIL;
                        column = cdolist_list_var_$2.first();
                        while (NIL != cdolist_list_var_$2) {
                            if (NIL != semantic_etl_bus.content_columnP(column)) {
                                final SubLObject mergeable_result = column_values_mergeable_as(column, content_column, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL != mergeable_result) {
                                    final SubLObject new_output_spec = semantic_etl_bus.copy_database_output_spec(output_spec);
                                    final SubLObject expand_column = semantic_etl_bus.output_spec_get_native_column_semantics(new_output_spec, content_column);
                                    final SubLObject id_column = semantic_etl_bus.output_spec_get_native_column_semantics(new_output_spec, native_key_column);
                                    final SubLObject kill_column = semantic_etl_bus.output_spec_get_native_column_semantics(new_output_spec, column);
                                    final SubLObject justification = mergeable_result.first();
                                    result_output_specs = cons(merge_columns_by_foreign_key(new_output_spec, id_column, expand_column, kill_column, justification), result_output_specs);
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

    /**
     * move data of FOREIGN-KEY-COLUMN into EXPAND-COLUMN, updating the ID-COLUMN
     * update FOREIGN-KEY-COLUMN with pointers to EXPAND-COLUMN to make it a foreign key column
     */
    @LispMethod(comment = "move data of FOREIGN-KEY-COLUMN into EXPAND-COLUMN, updating the ID-COLUMN\r\nupdate FOREIGN-KEY-COLUMN with pointers to EXPAND-COLUMN to make it a foreign key column\nmove data of FOREIGN-KEY-COLUMN into EXPAND-COLUMN, updating the ID-COLUMN\nupdate FOREIGN-KEY-COLUMN with pointers to EXPAND-COLUMN to make it a foreign key column")
    public static final SubLObject merge_columns_by_foreign_key_alt(SubLObject output_spec, SubLObject id_column, SubLObject expand_column, SubLObject kill_column, SubLObject justification) {
        {
            SubLObject target_table = semantic_etl_bus.c_semant_table_semantics(id_column);
            SubLObject target_table_name = semantic_etl_bus.t_semant_table_name(target_table);
            SubLObject source_table = semantic_etl_bus.c_semant_table_semantics(kill_column);
            SubLObject source_table_name = semantic_etl_bus.t_semant_table_name(source_table);
            SubLObject expand_column_name = semantic_etl_bus.c_semant_column_name(expand_column);
            SubLObject kill_column_name = semantic_etl_bus.c_semant_column_name(kill_column);
            SubLObject id_column_name = semantic_etl_bus.c_semant_column_name(id_column);
            SubLObject all_column_names = semantic_etl_bus.table_semantics_column_names(source_table);
            SubLObject new_column_name = string_utilities.uniquify_string_via_set(cconcatenate(target_table_name, $str_alt4$_id), all_column_names, UNPROVIDED);
            SubLObject semantic_description = semantic_etl_bus.new_column_merger(list(expand_column, kill_column), expand_column, list(list(kill_column, expand_column, justification)));
            SubLObject inner_select = semantic_etl_bus.new_sql_select_from(list(expand_column_name), list(target_table_name), NIL);
            SubLObject outer_select = semantic_etl_bus.new_sql_select_from(list(kill_column_name), list(source_table_name), list(semantic_etl_bus.new_sql_not_in(source_table_name, kill_column_name, inner_select)));
            SubLObject insert = semantic_etl_bus.new_sql_insert_into(target_table_name, list(expand_column_name), outer_select);
            semantic_etl_bus.output_spec_append_to_recipe(output_spec, insert);
            {
                SubLObject constraint_name = semantic_etl_bus.new_foreign_key_constraint_name(source_table_name, kill_column_name);
                SubLObject fk_constraint = semantic_etl_bus.new_sql_fk_column_constraint(constraint_name, target_table_name, id_column_name);
                SubLObject add_column = semantic_etl_bus.new_sql_add_column(new_column_name, $$$int, FOUR_INTEGER, list(fk_constraint));
                SubLObject alter = semantic_etl_bus.new_sql_alter_table(source_table_name, add_column);
                semantic_etl_bus.output_spec_append_to_recipe(output_spec, alter);
            }
            {
                SubLObject setting = semantic_etl_bus.new_sql_column_equal(source_table_name, new_column_name, target_table_name, id_column_name);
                SubLObject condition = semantic_etl_bus.new_sql_column_equal(source_table_name, kill_column_name, target_table_name, expand_column_name);
                SubLObject update = semantic_etl_bus.new_sql_update(source_table_name, list(setting), list(condition));
                semantic_etl_bus.output_spec_append_to_recipe(output_spec, update);
            }
            {
                SubLObject drop_column = semantic_etl_bus.new_sql_drop_column(kill_column_name);
                SubLObject alter = semantic_etl_bus.new_sql_alter_table(source_table_name, drop_column);
                semantic_etl_bus.output_spec_append_to_recipe(output_spec, alter);
            }
            semantic_etl_bus.output_spec_append_to_semantic_recipe(output_spec, semantic_description);
            semantic_etl_bus.output_spec_synchronize(output_spec);
        }
        return output_spec;
    }

    /**
     * move data of FOREIGN-KEY-COLUMN into EXPAND-COLUMN, updating the ID-COLUMN
     * update FOREIGN-KEY-COLUMN with pointers to EXPAND-COLUMN to make it a foreign key column
     */
    @LispMethod(comment = "move data of FOREIGN-KEY-COLUMN into EXPAND-COLUMN, updating the ID-COLUMN\r\nupdate FOREIGN-KEY-COLUMN with pointers to EXPAND-COLUMN to make it a foreign key column\nmove data of FOREIGN-KEY-COLUMN into EXPAND-COLUMN, updating the ID-COLUMN\nupdate FOREIGN-KEY-COLUMN with pointers to EXPAND-COLUMN to make it a foreign key column")
    public static SubLObject merge_columns_by_foreign_key(final SubLObject output_spec, final SubLObject id_column, final SubLObject expand_column, final SubLObject kill_column, final SubLObject justification) {
        final SubLObject target_table = semantic_etl_bus.c_semant_table_semantics(id_column);
        final SubLObject target_table_name = semantic_etl_bus.t_semant_table_name(target_table);
        final SubLObject source_table = semantic_etl_bus.c_semant_table_semantics(kill_column);
        final SubLObject source_table_name = semantic_etl_bus.t_semant_table_name(source_table);
        final SubLObject expand_column_name = semantic_etl_bus.c_semant_column_name(expand_column);
        final SubLObject kill_column_name = semantic_etl_bus.c_semant_column_name(kill_column);
        final SubLObject id_column_name = semantic_etl_bus.c_semant_column_name(id_column);
        final SubLObject all_column_names = semantic_etl_bus.table_semantics_column_names(source_table);
        final SubLObject new_column_name = string_utilities.uniquify_string_via_set(cconcatenate(target_table_name, $str4$_id), all_column_names, UNPROVIDED);
        final SubLObject semantic_description = semantic_etl_bus.new_column_merger(list(expand_column, kill_column), expand_column, list(list(kill_column, expand_column, justification)));
        final SubLObject inner_select = semantic_etl_bus.new_sql_select_from(list(expand_column_name), list(target_table_name), NIL);
        final SubLObject outer_select = semantic_etl_bus.new_sql_select_from(list(kill_column_name), list(source_table_name), list(semantic_etl_bus.new_sql_not_in(source_table_name, kill_column_name, inner_select)));
        final SubLObject insert = semantic_etl_bus.new_sql_insert_into(target_table_name, list(expand_column_name), outer_select);
        semantic_etl_bus.output_spec_append_to_recipe(output_spec, insert);
        final SubLObject constraint_name = semantic_etl_bus.new_foreign_key_constraint_name(source_table_name, kill_column_name);
        final SubLObject fk_constraint = semantic_etl_bus.new_sql_fk_column_constraint(constraint_name, target_table_name, id_column_name);
        final SubLObject add_column = semantic_etl_bus.new_sql_add_column(new_column_name, $$$int, FOUR_INTEGER, list(fk_constraint));
        final SubLObject alter = semantic_etl_bus.new_sql_alter_table(source_table_name, add_column);
        semantic_etl_bus.output_spec_append_to_recipe(output_spec, alter);
        final SubLObject setting = semantic_etl_bus.new_sql_column_equal(source_table_name, new_column_name, target_table_name, id_column_name);
        final SubLObject condition = semantic_etl_bus.new_sql_column_equal(source_table_name, kill_column_name, target_table_name, expand_column_name);
        final SubLObject update = semantic_etl_bus.new_sql_update(source_table_name, list(setting), list(condition));
        semantic_etl_bus.output_spec_append_to_recipe(output_spec, update);
        final SubLObject drop_column = semantic_etl_bus.new_sql_drop_column(kill_column_name);
        final SubLObject alter2 = semantic_etl_bus.new_sql_alter_table(source_table_name, drop_column);
        semantic_etl_bus.output_spec_append_to_recipe(output_spec, alter2);
        semantic_etl_bus.output_spec_append_to_semantic_recipe(output_spec, semantic_description);
        semantic_etl_bus.output_spec_synchronize(output_spec);
        return output_spec;
    }

    public static final SubLObject refined_output_spec_based_on_possible_genl_tables_alt(SubLObject output_spec, SubLObject dict, SubLObject possible_genl_table_id_pairs) {
        return NIL;
    }

    public static SubLObject refined_output_spec_based_on_possible_genl_tables(final SubLObject output_spec, final SubLObject dict, final SubLObject possible_genl_table_id_pairs) {
        return NIL;
    }

    public static final SubLObject refined_output_spec_outwards_based_on_possible_genl_tables_alt(SubLObject output_spec, SubLObject dict, SubLObject table_id_pairs) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result_output_specs = NIL;
                SubLObject cdolist_list_var = table_id_pairs;
                SubLObject pair = NIL;
                for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                    {
                        SubLObject datum = pair;
                        SubLObject current = datum;
                        SubLObject table1_id = NIL;
                        SubLObject table2_id = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt6);
                        table1_id = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt6);
                        table2_id = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject spec_table_semantics = dictionary.dictionary_lookup(dict, table1_id, UNPROVIDED);
                                SubLObject genl_table_semantics = dictionary.dictionary_lookup(dict, table2_id, UNPROVIDED);
                                SubLObject most_specific_table_semantics = com.cyc.cycjava.cycl.sksi.mapping_engine.more_specific_table_semantics(spec_table_semantics, genl_table_semantics);
                                if (NIL != most_specific_table_semantics) {
                                    if (most_specific_table_semantics == genl_table_semantics) {
                                        {
                                            SubLObject swap_var = spec_table_semantics;
                                            spec_table_semantics = genl_table_semantics;
                                            genl_table_semantics = swap_var;
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var_3 = semantic_etl_bus.table_semantics_linked_table_ids(spec_table_semantics);
                                        SubLObject table_id_connected_to_spec_table = NIL;
                                        for (table_id_connected_to_spec_table = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , table_id_connected_to_spec_table = cdolist_list_var_3.first()) {
                                            {
                                                SubLObject cdolist_list_var_4 = semantic_etl_bus.table_semantics_linked_table_ids(genl_table_semantics);
                                                SubLObject table_id_connected_to_genl_table = NIL;
                                                for (table_id_connected_to_genl_table = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , table_id_connected_to_genl_table = cdolist_list_var_4.first()) {
                                                    {
                                                        SubLObject table_connected_to_spec_table = dictionary.dictionary_lookup(dict, table_id_connected_to_spec_table, UNPROVIDED);
                                                        SubLObject table_connected_to_genl_table = dictionary.dictionary_lookup(dict, table_id_connected_to_genl_table, UNPROVIDED);
                                                        if ((NIL != com.cyc.cycjava.cycl.sksi.mapping_engine.link_tableP(table_connected_to_spec_table)) && (NIL != com.cyc.cycjava.cycl.sksi.mapping_engine.link_tableP(table_connected_to_genl_table))) {
                                                            {
                                                                SubLObject cdolist_list_var_5 = semantic_etl_bus.table_semantics_linked_table_ids(table_connected_to_spec_table);
                                                                SubLObject table_id_connected_to_spec_link_table = NIL;
                                                                for (table_id_connected_to_spec_link_table = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , table_id_connected_to_spec_link_table = cdolist_list_var_5.first()) {
                                                                    {
                                                                        SubLObject cdolist_list_var_6 = semantic_etl_bus.table_semantics_linked_table_ids(table_connected_to_genl_table);
                                                                        SubLObject table_id_connected_to_genl_link_table = NIL;
                                                                        for (table_id_connected_to_genl_link_table = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , table_id_connected_to_genl_link_table = cdolist_list_var_6.first()) {
                                                                            {
                                                                                SubLObject table_connected_to_spec_link_table = dictionary.dictionary_lookup(dict, table_id_connected_to_spec_link_table, UNPROVIDED);
                                                                                SubLObject table_connected_to_genl_link_table = dictionary.dictionary_lookup(dict, table_id_connected_to_genl_link_table, UNPROVIDED);
                                                                                if (table_connected_to_spec_link_table != table_connected_to_genl_link_table) {
                                                                                    if (table_connected_to_spec_link_table != spec_table_semantics) {
                                                                                        if (table_connected_to_genl_link_table != genl_table_semantics) {
                                                                                            if (com.cyc.cycjava.cycl.sksi.mapping_engine.table_data_overlap_ratio(table_connected_to_spec_link_table, table_connected_to_genl_link_table).numG($float$0_1)) {
                                                                                                thread.resetMultipleValues();
                                                                                                {
                                                                                                    SubLObject spec_column_semantics = com.cyc.cycjava.cycl.sksi.mapping_engine.columns_with_best_overlap(table_connected_to_spec_link_table, table_connected_to_genl_link_table);
                                                                                                    SubLObject genl_column_semantics = thread.secondMultipleValue();
                                                                                                    SubLObject justification = thread.thirdMultipleValue();
                                                                                                    thread.resetMultipleValues();
                                                                                                    com.cyc.cycjava.cycl.sksi.mapping_engine.possibly_debug_refine_output_spec_outwards_based_on_possible_genl_tables(spec_table_semantics, genl_table_semantics, table_connected_to_spec_table, table_connected_to_genl_table, table_connected_to_spec_link_table, table_connected_to_genl_link_table, spec_column_semantics, genl_column_semantics);
                                                                                                    {
                                                                                                        SubLObject new_output_spec = semantic_etl_bus.copy_database_output_spec(output_spec);
                                                                                                        SubLObject new_genl_column_semantics = semantic_etl_bus.output_spec_get_native_column_semantics(new_output_spec, genl_column_semantics);
                                                                                                        SubLObject new_spec_column_semantics = semantic_etl_bus.output_spec_get_native_column_semantics(new_output_spec, spec_column_semantics);
                                                                                                        result_output_specs = cons(com.cyc.cycjava.cycl.sksi.mapping_engine.merge_mappings_wrt_column_semantics(new_output_spec, new_genl_column_semantics, new_spec_column_semantics, justification), result_output_specs);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt6);
                        }
                    }
                }
                return result_output_specs;
            }
        }
    }

    public static SubLObject refined_output_spec_outwards_based_on_possible_genl_tables(final SubLObject output_spec, final SubLObject dict, final SubLObject table_id_pairs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_output_specs = NIL;
        SubLObject cdolist_list_var = table_id_pairs;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject table1_id = NIL;
            SubLObject table2_id = NIL;
            destructuring_bind_must_consp(current, datum, $list6);
            table1_id = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list6);
            table2_id = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject spec_table_semantics = dictionary.dictionary_lookup(dict, table1_id, UNPROVIDED);
                SubLObject genl_table_semantics = dictionary.dictionary_lookup(dict, table2_id, UNPROVIDED);
                final SubLObject most_specific_table_semantics = more_specific_table_semantics(spec_table_semantics, genl_table_semantics);
                if (NIL != most_specific_table_semantics) {
                    if (most_specific_table_semantics.eql(genl_table_semantics)) {
                        final SubLObject swap_var = spec_table_semantics;
                        spec_table_semantics = genl_table_semantics;
                        genl_table_semantics = swap_var;
                    }
                    SubLObject cdolist_list_var_$3 = semantic_etl_bus.table_semantics_linked_table_ids(spec_table_semantics);
                    SubLObject table_id_connected_to_spec_table = NIL;
                    table_id_connected_to_spec_table = cdolist_list_var_$3.first();
                    while (NIL != cdolist_list_var_$3) {
                        SubLObject cdolist_list_var_$4 = semantic_etl_bus.table_semantics_linked_table_ids(genl_table_semantics);
                        SubLObject table_id_connected_to_genl_table = NIL;
                        table_id_connected_to_genl_table = cdolist_list_var_$4.first();
                        while (NIL != cdolist_list_var_$4) {
                            final SubLObject table_connected_to_spec_table = dictionary.dictionary_lookup(dict, table_id_connected_to_spec_table, UNPROVIDED);
                            final SubLObject table_connected_to_genl_table = dictionary.dictionary_lookup(dict, table_id_connected_to_genl_table, UNPROVIDED);
                            if ((NIL != link_tableP(table_connected_to_spec_table)) && (NIL != link_tableP(table_connected_to_genl_table))) {
                                SubLObject cdolist_list_var_$5 = semantic_etl_bus.table_semantics_linked_table_ids(table_connected_to_spec_table);
                                SubLObject table_id_connected_to_spec_link_table = NIL;
                                table_id_connected_to_spec_link_table = cdolist_list_var_$5.first();
                                while (NIL != cdolist_list_var_$5) {
                                    SubLObject cdolist_list_var_$6 = semantic_etl_bus.table_semantics_linked_table_ids(table_connected_to_genl_table);
                                    SubLObject table_id_connected_to_genl_link_table = NIL;
                                    table_id_connected_to_genl_link_table = cdolist_list_var_$6.first();
                                    while (NIL != cdolist_list_var_$6) {
                                        final SubLObject table_connected_to_spec_link_table = dictionary.dictionary_lookup(dict, table_id_connected_to_spec_link_table, UNPROVIDED);
                                        final SubLObject table_connected_to_genl_link_table = dictionary.dictionary_lookup(dict, table_id_connected_to_genl_link_table, UNPROVIDED);
                                        if ((((!table_connected_to_spec_link_table.eql(table_connected_to_genl_link_table)) && (!table_connected_to_spec_link_table.eql(spec_table_semantics))) && (!table_connected_to_genl_link_table.eql(genl_table_semantics))) && table_data_overlap_ratio(table_connected_to_spec_link_table, table_connected_to_genl_link_table).numG($float$0_1)) {
                                            thread.resetMultipleValues();
                                            final SubLObject spec_column_semantics = columns_with_best_overlap(table_connected_to_spec_link_table, table_connected_to_genl_link_table);
                                            final SubLObject genl_column_semantics = thread.secondMultipleValue();
                                            final SubLObject justification = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            possibly_debug_refine_output_spec_outwards_based_on_possible_genl_tables(spec_table_semantics, genl_table_semantics, table_connected_to_spec_table, table_connected_to_genl_table, table_connected_to_spec_link_table, table_connected_to_genl_link_table, spec_column_semantics, genl_column_semantics);
                                            final SubLObject new_output_spec = semantic_etl_bus.copy_database_output_spec(output_spec);
                                            final SubLObject new_genl_column_semantics = semantic_etl_bus.output_spec_get_native_column_semantics(new_output_spec, genl_column_semantics);
                                            final SubLObject new_spec_column_semantics = semantic_etl_bus.output_spec_get_native_column_semantics(new_output_spec, spec_column_semantics);
                                            result_output_specs = cons(merge_mappings_wrt_column_semantics(new_output_spec, new_genl_column_semantics, new_spec_column_semantics, justification), result_output_specs);
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
            } else {
                cdestructuring_bind_error(datum, $list6);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return result_output_specs;
    }

    /**
     * IF TABLE1 and TABLE2 are equivalent (e.g. represent the same type of thing) and
     * TABLE1 has a single auto-incrementing primary-key column
     * some set of column-correspondences between TABLE1 and TABLE2 can be established
     * THEN move data of from TABLE2 to TABLE1.  When the information in the correspondiing-columns matches,
     * just copy over the data from the non-corresponding columns;
     * For TABLE2 rows that don't match TABLE1, insert new rows into TABLE1 using data from TABLE1;
     * Change any foreign key constraints that reference TABLE2 to point to TABLE1 (and fix the data in the column as well);
     * Delete TABLE2
     */
    @LispMethod(comment = "IF TABLE1 and TABLE2 are equivalent (e.g. represent the same type of thing) and\r\nTABLE1 has a single auto-incrementing primary-key column\r\nsome set of column-correspondences between TABLE1 and TABLE2 can be established\r\nTHEN move data of from TABLE2 to TABLE1.  When the information in the correspondiing-columns matches,\r\njust copy over the data from the non-corresponding columns;\r\nFor TABLE2 rows that don\'t match TABLE1, insert new rows into TABLE1 using data from TABLE1;\r\nChange any foreign key constraints that reference TABLE2 to point to TABLE1 (and fix the data in the column as well);\r\nDelete TABLE2\nIF TABLE1 and TABLE2 are equivalent (e.g. represent the same type of thing) and\nTABLE1 has a single auto-incrementing primary-key column\nsome set of column-correspondences between TABLE1 and TABLE2 can be established\nTHEN move data of from TABLE2 to TABLE1.  When the information in the correspondiing-columns matches,\njust copy over the data from the non-corresponding columns;\nFor TABLE2 rows that don\'t match TABLE1, insert new rows into TABLE1 using data from TABLE1;\nChange any foreign key constraints that reference TABLE2 to point to TABLE1 (and fix the data in the column as well);\nDelete TABLE2")
    public static final SubLObject refined_output_spec_merge_equivalent_tables_alt(SubLObject output_spec, SubLObject dict, SubLObject table_id_pairs) {
        {
            SubLObject result_output_specs = NIL;
            SubLObject cdolist_list_var = table_id_pairs;
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject table1 = dictionary.dictionary_lookup(dict, pair.first(), UNPROVIDED);
                    SubLObject table2 = dictionary.dictionary_lookup(dict, second(pair), UNPROVIDED);
                    SubLObject keep_table = com.cyc.cycjava.cycl.sksi.mapping_engine.tables_mergeable_into(table1, table2, UNPROVIDED);
                    SubLObject kill_table = (NIL != keep_table) ? ((SubLObject) (keep_table == table1 ? ((SubLObject) (table2)) : table1)) : NIL;
                    if ((NIL != keep_table) && (NIL != list_utilities.lengthE(semantic_etl_bus.table_semantics_primary_key_columns(keep_table), ONE_INTEGER, UNPROVIDED))) {
                        {
                            SubLObject column_correspondence_list = com.cyc.cycjava.cycl.sksi.mapping_engine.find_column_correspondences(kill_table, keep_table);
                            SubLObject new_output_spec = semantic_etl_bus.copy_database_output_spec(output_spec);
                            SubLObject new_keep_table = semantic_etl_bus.output_spec_get_table_named(new_output_spec, semantic_etl_bus.table_semantics_table_name(keep_table));
                            SubLObject new_kill_table = semantic_etl_bus.output_spec_get_table_named(new_output_spec, semantic_etl_bus.table_semantics_table_name(kill_table));
                            SubLObject new_column_correspondence_list = com.cyc.cycjava.cycl.sksi.mapping_engine.get_new_column_correspondence_list(new_kill_table, new_keep_table, column_correspondence_list);
                            if ((NIL != new_column_correspondence_list) && (NIL != com.cyc.cycjava.cycl.sksi.mapping_engine.columns_have_same_foreign_key_constraints(new_column_correspondence_list))) {
                                result_output_specs = cons(com.cyc.cycjava.cycl.sksi.mapping_engine.merge_tables(new_output_spec, new_keep_table, new_kill_table, new_column_correspondence_list), result_output_specs);
                            }
                        }
                    }
                }
            }
            return result_output_specs;
        }
    }

    /**
     * IF TABLE1 and TABLE2 are equivalent (e.g. represent the same type of thing) and
     * TABLE1 has a single auto-incrementing primary-key column
     * some set of column-correspondences between TABLE1 and TABLE2 can be established
     * THEN move data of from TABLE2 to TABLE1.  When the information in the correspondiing-columns matches,
     * just copy over the data from the non-corresponding columns;
     * For TABLE2 rows that don't match TABLE1, insert new rows into TABLE1 using data from TABLE1;
     * Change any foreign key constraints that reference TABLE2 to point to TABLE1 (and fix the data in the column as well);
     * Delete TABLE2
     */
    @LispMethod(comment = "IF TABLE1 and TABLE2 are equivalent (e.g. represent the same type of thing) and\r\nTABLE1 has a single auto-incrementing primary-key column\r\nsome set of column-correspondences between TABLE1 and TABLE2 can be established\r\nTHEN move data of from TABLE2 to TABLE1.  When the information in the correspondiing-columns matches,\r\njust copy over the data from the non-corresponding columns;\r\nFor TABLE2 rows that don\'t match TABLE1, insert new rows into TABLE1 using data from TABLE1;\r\nChange any foreign key constraints that reference TABLE2 to point to TABLE1 (and fix the data in the column as well);\r\nDelete TABLE2\nIF TABLE1 and TABLE2 are equivalent (e.g. represent the same type of thing) and\nTABLE1 has a single auto-incrementing primary-key column\nsome set of column-correspondences between TABLE1 and TABLE2 can be established\nTHEN move data of from TABLE2 to TABLE1.  When the information in the correspondiing-columns matches,\njust copy over the data from the non-corresponding columns;\nFor TABLE2 rows that don\'t match TABLE1, insert new rows into TABLE1 using data from TABLE1;\nChange any foreign key constraints that reference TABLE2 to point to TABLE1 (and fix the data in the column as well);\nDelete TABLE2")
    public static SubLObject refined_output_spec_merge_equivalent_tables(final SubLObject output_spec, final SubLObject dict, final SubLObject table_id_pairs) {
        SubLObject result_output_specs = NIL;
        SubLObject cdolist_list_var = table_id_pairs;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject table1 = dictionary.dictionary_lookup(dict, pair.first(), UNPROVIDED);
            final SubLObject table2 = dictionary.dictionary_lookup(dict, second(pair), UNPROVIDED);
            final SubLObject keep_table = tables_mergeable_into(table1, table2, UNPROVIDED);
            final SubLObject kill_table = (NIL != keep_table) ? keep_table.eql(table1) ? table2 : table1 : NIL;
            if ((NIL != keep_table) && (NIL != list_utilities.lengthE(semantic_etl_bus.table_semantics_primary_key_columns(keep_table), ONE_INTEGER, UNPROVIDED))) {
                final SubLObject column_correspondence_list = find_column_correspondences(kill_table, keep_table);
                final SubLObject new_output_spec = semantic_etl_bus.copy_database_output_spec(output_spec);
                final SubLObject new_keep_table = semantic_etl_bus.output_spec_get_table_named(new_output_spec, semantic_etl_bus.table_semantics_table_name(keep_table));
                final SubLObject new_kill_table = semantic_etl_bus.output_spec_get_table_named(new_output_spec, semantic_etl_bus.table_semantics_table_name(kill_table));
                final SubLObject new_column_correspondence_list = get_new_column_correspondence_list(new_kill_table, new_keep_table, column_correspondence_list);
                if ((NIL != new_column_correspondence_list) && (NIL != columns_have_same_foreign_key_constraints(new_column_correspondence_list))) {
                    result_output_specs = cons(merge_tables(new_output_spec, new_keep_table, new_kill_table, new_column_correspondence_list), result_output_specs);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return result_output_specs;
    }

    /**
     *
     *
     * @return boolean; t if all corresponding columns have the same foreign key constraints, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if all corresponding columns have the same foreign key constraints, nil otherwise")
    public static final SubLObject columns_have_same_foreign_key_constraints_alt(SubLObject column_correspondence_list) {
        {
            SubLObject failP = NIL;
            if (NIL == failP) {
                {
                    SubLObject csome_list_var = column_correspondence_list;
                    SubLObject correspondence = NIL;
                    for (correspondence = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , correspondence = csome_list_var.first()) {
                        {
                            SubLObject datum = correspondence;
                            SubLObject current = datum;
                            SubLObject from_col = NIL;
                            SubLObject to_col = NIL;
                            SubLObject type = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt8);
                            from_col = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt8);
                            to_col = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt8);
                            type = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject constraining_column = semantic_etl_bus.column_semantics_foreign_key_constraint_constraining_column(to_col);
                                    SubLObject constraining_table = (NIL != constraining_column) ? ((SubLObject) (semantic_etl_bus.column_semantics_table_semantics(constraining_column))) : NIL;
                                    SubLObject content_columns = (NIL != constraining_table) ? ((SubLObject) (semantic_etl_bus.table_semantics_content_columns(constraining_table))) : NIL;
                                    if (!((semantic_etl_bus.column_semantics_foreign_key_constraint_constraining_column(from_col) == semantic_etl_bus.column_semantics_foreign_key_constraint_constraining_column(to_col)) || ((((NIL == semantic_etl_bus.column_semantics_foreign_key_constraint(from_col)) && (NIL != constraining_column)) && (NIL != list_utilities.lengthE(content_columns, ONE_INTEGER, UNPROVIDED))) && (content_columns.first() == constraining_column)))) {
                                        failP = T;
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt8);
                            }
                        }
                    }
                }
            }
            return makeBoolean(NIL == failP);
        }
    }

    /**
     *
     *
     * @return boolean; t if all corresponding columns have the same foreign key constraints, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if all corresponding columns have the same foreign key constraints, nil otherwise")
    public static SubLObject columns_have_same_foreign_key_constraints(final SubLObject column_correspondence_list) {
        SubLObject failP = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var = column_correspondence_list;
            SubLObject correspondence = NIL;
            correspondence = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = correspondence;
                SubLObject from_col = NIL;
                SubLObject to_col = NIL;
                SubLObject type = NIL;
                destructuring_bind_must_consp(current, datum, $list8);
                from_col = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list8);
                to_col = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list8);
                type = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject constraining_column = semantic_etl_bus.column_semantics_foreign_key_constraint_constraining_column(to_col);
                    final SubLObject constraining_table = (NIL != constraining_column) ? semantic_etl_bus.column_semantics_table_semantics(constraining_column) : NIL;
                    final SubLObject content_columns = (NIL != constraining_table) ? semantic_etl_bus.table_semantics_content_columns(constraining_table) : NIL;
                    if ((!semantic_etl_bus.column_semantics_foreign_key_constraint_constraining_column(from_col).eql(semantic_etl_bus.column_semantics_foreign_key_constraint_constraining_column(to_col))) && ((((NIL != semantic_etl_bus.column_semantics_foreign_key_constraint(from_col)) || (NIL == constraining_column)) || (NIL == list_utilities.lengthE(content_columns, ONE_INTEGER, UNPROVIDED))) || (!content_columns.first().eql(constraining_column)))) {
                        failP = T;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list8);
                }
                csome_list_var = csome_list_var.rest();
                correspondence = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == failP);
    }

    /**
     *
     *
     * @return listp; a list of lists ((t1.col1 t2.col1 type) ... (t1.col4 t2.col4 type)), where each
    triple in the list contains a column from FROM-TABLE and the column of TO-TABLE whose data corresponds
    to that in the FROM-TABLE column, as well as the semantic type of the combination.  Should be a one-to-one mapping
    of to and from columns.
     */
    @LispMethod(comment = "@return listp; a list of lists ((t1.col1 t2.col1 type) ... (t1.col4 t2.col4 type)), where each\r\ntriple in the list contains a column from FROM-TABLE and the column of TO-TABLE whose data corresponds\r\nto that in the FROM-TABLE column, as well as the semantic type of the combination.  Should be a one-to-one mapping\r\nof to and from columns.")
    public static final SubLObject find_column_correspondences_alt(SubLObject from_table, SubLObject to_table) {
        {
            SubLObject column_correspondence_list = NIL;
            SubLObject column_correspondences_list = NIL;
            SubLObject to_table_columns = semantic_etl_bus.table_semantics_column_semantics_list(to_table);
            SubLObject from_table_columns = semantic_etl_bus.table_semantics_column_semantics_list(from_table);
            SubLObject from_columns_with_targets = NIL;
            {
                SubLObject cdolist_list_var = to_table_columns;
                SubLObject to_column = NIL;
                for (to_column = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , to_column = cdolist_list_var.first()) {
                    {
                        SubLObject to_column_list = NIL;
                        SubLObject cdolist_list_var_7 = from_table_columns;
                        SubLObject from_column = NIL;
                        for (from_column = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , from_column = cdolist_list_var_7.first()) {
                            {
                                SubLObject merge_types = com.cyc.cycjava.cycl.sksi.mapping_engine.columns_mergeable_as(from_column, to_column, UNPROVIDED);
                                if (NIL != merge_types) {
                                    from_columns_with_targets = cons(from_column, from_columns_with_targets);
                                    to_column_list = cons(list(from_column, to_column, merge_types), to_column_list);
                                }
                            }
                        }
                        if (NIL != to_column_list) {
                            column_correspondences_list = cons(Sort.sort(to_column_list, $sym9$_, FIRST_THIRD_GENERALITY_ESTIMATE), column_correspondences_list);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = column_correspondences_list;
                SubLObject column_correspondences = NIL;
                for (column_correspondences = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , column_correspondences = cdolist_list_var.first()) {
                    if (NIL != list_utilities.lengthG(column_correspondences, ONE_INTEGER, UNPROVIDED)) {
                        if (NIL != com.cyc.cycjava.cycl.sksi.mapping_engine.possible_correspondences_contains_equal_justification(column_correspondences)) {
                            column_correspondences = list_utilities.remove_if_not(POSSIBLE_CORRESPONDENCE_CONTAINS_EQUAL_JUSTIFICATION, column_correspondences, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    column_correspondence_list = cons(column_correspondences, column_correspondence_list);
                }
            }
            column_correspondences_list = column_correspondence_list;
            column_correspondence_list = NIL;
            {
                SubLObject cdolist_list_var = column_correspondences_list;
                SubLObject column_correspondences = NIL;
                for (column_correspondences = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , column_correspondences = cdolist_list_var.first()) {
                    if (NIL != list_utilities.lengthG(column_correspondences, ONE_INTEGER, UNPROVIDED)) {
                        {
                            SubLObject found_one = NIL;
                            if (NIL == found_one) {
                                {
                                    SubLObject csome_list_var = column_correspondences;
                                    SubLObject correspondence = NIL;
                                    for (correspondence = csome_list_var.first(); !((NIL != found_one) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , correspondence = csome_list_var.first()) {
                                        {
                                            SubLObject from_column = correspondence.first();
                                            if (NIL == find(from_column, column_correspondences_list, EQ, UNAMBIGUOUS_FROM_COLUMN, UNPROVIDED, UNPROVIDED)) {
                                                column_correspondence_list = cons(correspondence, column_correspondence_list);
                                                found_one = T;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        column_correspondence_list = cons(column_correspondences.first(), column_correspondence_list);
                    }
                }
            }
            return column_correspondence_list;
        }
    }

    /**
     *
     *
     * @return listp; a list of lists ((t1.col1 t2.col1 type) ... (t1.col4 t2.col4 type)), where each
    triple in the list contains a column from FROM-TABLE and the column of TO-TABLE whose data corresponds
    to that in the FROM-TABLE column, as well as the semantic type of the combination.  Should be a one-to-one mapping
    of to and from columns.
     */
    @LispMethod(comment = "@return listp; a list of lists ((t1.col1 t2.col1 type) ... (t1.col4 t2.col4 type)), where each\r\ntriple in the list contains a column from FROM-TABLE and the column of TO-TABLE whose data corresponds\r\nto that in the FROM-TABLE column, as well as the semantic type of the combination.  Should be a one-to-one mapping\r\nof to and from columns.")
    public static SubLObject find_column_correspondences(final SubLObject from_table, final SubLObject to_table) {
        SubLObject column_correspondence_list = NIL;
        SubLObject column_correspondences_list = NIL;
        final SubLObject to_table_columns = semantic_etl_bus.table_semantics_column_semantics_list(to_table);
        final SubLObject from_table_columns = semantic_etl_bus.table_semantics_column_semantics_list(from_table);
        SubLObject from_columns_with_targets = NIL;
        SubLObject cdolist_list_var = to_table_columns;
        SubLObject to_column = NIL;
        to_column = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject to_column_list = NIL;
            SubLObject cdolist_list_var_$7 = from_table_columns;
            SubLObject from_column = NIL;
            from_column = cdolist_list_var_$7.first();
            while (NIL != cdolist_list_var_$7) {
                final SubLObject merge_types = columns_mergeable_as(from_column, to_column, UNPROVIDED);
                if (NIL != merge_types) {
                    from_columns_with_targets = cons(from_column, from_columns_with_targets);
                    to_column_list = cons(list(from_column, to_column, merge_types), to_column_list);
                }
                cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                from_column = cdolist_list_var_$7.first();
            } 
            if (NIL != to_column_list) {
                column_correspondences_list = cons(Sort.sort(to_column_list, $sym9$_, FIRST_THIRD_GENERALITY_ESTIMATE), column_correspondences_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            to_column = cdolist_list_var.first();
        } 
        cdolist_list_var = column_correspondences_list;
        SubLObject column_correspondences = NIL;
        column_correspondences = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != list_utilities.lengthG(column_correspondences, ONE_INTEGER, UNPROVIDED)) && (NIL != possible_correspondences_contains_equal_justification(column_correspondences))) {
                column_correspondences = list_utilities.remove_if_not(POSSIBLE_CORRESPONDENCE_CONTAINS_EQUAL_JUSTIFICATION, column_correspondences, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            column_correspondence_list = cons(column_correspondences, column_correspondence_list);
            cdolist_list_var = cdolist_list_var.rest();
            column_correspondences = cdolist_list_var.first();
        } 
        column_correspondences_list = column_correspondence_list;
        column_correspondence_list = NIL;
        cdolist_list_var = column_correspondences_list;
        column_correspondences = NIL;
        column_correspondences = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != list_utilities.lengthG(column_correspondences, ONE_INTEGER, UNPROVIDED)) {
                SubLObject found_one = NIL;
                if (NIL == found_one) {
                    SubLObject csome_list_var = column_correspondences;
                    SubLObject correspondence = NIL;
                    correspondence = csome_list_var.first();
                    while ((NIL == found_one) && (NIL != csome_list_var)) {
                        final SubLObject from_column2 = correspondence.first();
                        if (NIL == find(from_column2, column_correspondences_list, EQ, UNAMBIGUOUS_FROM_COLUMN, UNPROVIDED, UNPROVIDED)) {
                            column_correspondence_list = cons(correspondence, column_correspondence_list);
                            found_one = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        correspondence = csome_list_var.first();
                    } 
                }
            } else {
                column_correspondence_list = cons(column_correspondences.first(), column_correspondence_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            column_correspondences = cdolist_list_var.first();
        } 
        return column_correspondence_list;
    }

    public static final SubLObject unambiguous_from_column_alt(SubLObject column_correspondences) {
        if (NIL != list_utilities.lengthE(column_correspondences, ONE_INTEGER, UNPROVIDED)) {
            return caar(column_correspondences);
        }
        return NIL;
    }

    public static SubLObject unambiguous_from_column(final SubLObject column_correspondences) {
        if (NIL != list_utilities.lengthE(column_correspondences, ONE_INTEGER, UNPROVIDED)) {
            return caar(column_correspondences);
        }
        return NIL;
    }

    public static final SubLObject possible_correspondences_contains_equal_justification_alt(SubLObject justified_correspondences) {
        {
            SubLObject cdolist_list_var = justified_correspondences;
            SubLObject corr = NIL;
            for (corr = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , corr = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.sksi.mapping_engine.possible_correspondence_contains_equal_justification(corr)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject possible_correspondences_contains_equal_justification(final SubLObject justified_correspondences) {
        SubLObject cdolist_list_var = justified_correspondences;
        SubLObject corr = NIL;
        corr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != possible_correspondence_contains_equal_justification(corr)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            corr = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject possible_correspondence_contains_equal_justification_alt(SubLObject justified_correspondence) {
        {
            SubLObject justification = third(justified_correspondence);
            return find($EQUAL, justification, EQ, SECOND, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject possible_correspondence_contains_equal_justification(final SubLObject justified_correspondence) {
        final SubLObject justification = third(justified_correspondence);
        return find($EQUAL, justification, EQ, SECOND, UNPROVIDED, UNPROVIDED);
    }

    /**
     * substitute for a lambda function...
     */
    @LispMethod(comment = "substitute for a lambda function...")
    public static final SubLObject first_third_generality_estimate_alt(SubLObject obj) {
        return cardinality_estimates.generality_estimate(third(obj));
    }

    /**
     * substitute for a lambda function...
     */
    @LispMethod(comment = "substitute for a lambda function...")
    public static SubLObject first_third_generality_estimate(final SubLObject obj) {
        return cardinality_estimates.generality_estimate(third(obj));
    }/**
     * substitute for a lambda function...
     */


    public static final SubLObject get_new_column_correspondence_list_alt(SubLObject table1, SubLObject table2, SubLObject old_correspondence_list) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = old_correspondence_list;
            SubLObject column_correspondence = NIL;
            for (column_correspondence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , column_correspondence = cdolist_list_var.first()) {
                {
                    SubLObject datum = column_correspondence;
                    SubLObject current = datum;
                    SubLObject table1_column = NIL;
                    SubLObject table2_column = NIL;
                    SubLObject column_type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    table1_column = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    table2_column = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt15);
                    column_type = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        result = cons(list(semantic_etl_bus.table_semantics_get_column_named(table1, semantic_etl_bus.column_semantics_column_name(table1_column)), semantic_etl_bus.table_semantics_get_column_named(table2, semantic_etl_bus.column_semantics_column_name(table2_column)), column_type), result);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt15);
                    }
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject get_new_column_correspondence_list(final SubLObject table1, final SubLObject table2, final SubLObject old_correspondence_list) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = old_correspondence_list;
        SubLObject column_correspondence = NIL;
        column_correspondence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = column_correspondence;
            SubLObject table1_column = NIL;
            SubLObject table2_column = NIL;
            SubLObject column_type = NIL;
            destructuring_bind_must_consp(current, datum, $list15);
            table1_column = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list15);
            table2_column = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list15);
            column_type = current.first();
            current = current.rest();
            if (NIL == current) {
                result = cons(list(semantic_etl_bus.table_semantics_get_column_named(table1, semantic_etl_bus.column_semantics_column_name(table1_column)), semantic_etl_bus.table_semantics_get_column_named(table2, semantic_etl_bus.column_semantics_column_name(table2_column)), column_type), result);
            } else {
                cdestructuring_bind_error(datum, $list15);
            }
            cdolist_list_var = cdolist_list_var.rest();
            column_correspondence = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    /**
     * Remove KILL-TABLE-SEMANTICS from OUTPUT-SPEC, but first copy all relevant data over to KEEP-TABLE-SEMANTICS, using
     * the columns in COLUMN-CORRESPONDENCE-LIST as the key to which rows in the two tables are equal
     *
     * @unknown COLUMN-CORRESPONDENCE-LIST is a list of two-element lists, which are column objects
     * @return db-output-spec-p
     */
    @LispMethod(comment = "Remove KILL-TABLE-SEMANTICS from OUTPUT-SPEC, but first copy all relevant data over to KEEP-TABLE-SEMANTICS, using\r\nthe columns in COLUMN-CORRESPONDENCE-LIST as the key to which rows in the two tables are equal\r\n\r\n@unknown COLUMN-CORRESPONDENCE-LIST is a list of two-element lists, which are column objects\r\n@return db-output-spec-p\nRemove KILL-TABLE-SEMANTICS from OUTPUT-SPEC, but first copy all relevant data over to KEEP-TABLE-SEMANTICS, using\nthe columns in COLUMN-CORRESPONDENCE-LIST as the key to which rows in the two tables are equal")
    public static final SubLObject merge_tables_alt(SubLObject output_spec, SubLObject keep_table_semantics, SubLObject kill_table_semantics, SubLObject column_correspondence_list) {
        {
            SubLObject new_column_definitions = com.cyc.cycjava.cycl.sksi.mapping_engine.add_new_columns(kill_table_semantics, keep_table_semantics, column_correspondence_list);
            SubLObject new_column_names = Mapping.mapcar(EXTRACT_ADDED_COLUMN, new_column_definitions);
            SubLObject ensure_fk_constraints_obeyed = com.cyc.cycjava.cycl.sksi.mapping_engine.copy_data_to_table_referenced_by_foreign_key(kill_table_semantics, keep_table_semantics, column_correspondence_list);
            SubLObject copy_non_unifiable_data = com.cyc.cycjava.cycl.sksi.mapping_engine.copy_non_unifiable_data(kill_table_semantics, keep_table_semantics, column_correspondence_list);
            SubLObject copy_unifiable_data = com.cyc.cycjava.cycl.sksi.mapping_engine.copy_unifiable_data(kill_table_semantics, keep_table_semantics, column_correspondence_list);
            SubLObject update_fkey_constraints = com.cyc.cycjava.cycl.sksi.mapping_engine.update_fkey_constraints_and_values(keep_table_semantics, kill_table_semantics, column_correspondence_list);
            SubLObject kill_table = semantic_etl_bus.new_sql_drop_table(semantic_etl_bus.table_semantics_table_name(kill_table_semantics));
            SubLObject new_correspondence_list = com.cyc.cycjava.cycl.sksi.mapping_engine.augment_correspondence_list_with_new_columns(column_correspondence_list, new_column_names, kill_table_semantics, keep_table_semantics);
            SubLObject semantic_description = semantic_etl_bus.new_table_merger(list(keep_table_semantics, kill_table_semantics), keep_table_semantics, new_correspondence_list);
            SubLObject kill_table_name = semantic_etl_bus.t_semant_table_name(kill_table_semantics);
            SubLObject keep_table_name = semantic_etl_bus.t_semant_table_name(keep_table_semantics);
            SubLObject add_clauses = NIL;
            {
                SubLObject cdolist_list_var = semantic_etl_bus.table_semantics_column_constraints(kill_table_semantics);
                SubLObject constraint = NIL;
                for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                    if (NIL != semantic_etl_bus.foreign_key_constraint_p(constraint)) {
                        {
                            SubLObject kill_column = semantic_etl_bus.foreign_key_constraint_constrained_column(constraint);
                            SubLObject kill_column_name = semantic_etl_bus.c_semant_column_name(kill_column);
                            SubLObject constraining_column = semantic_etl_bus.foreign_key_constraint_constraining_column(constraint);
                            SubLObject constraining_column_name = semantic_etl_bus.c_semant_column_name(constraining_column);
                            SubLObject constraining_table = semantic_etl_bus.c_semant_table_semantics(constraining_column);
                            SubLObject constraining_table_name = semantic_etl_bus.t_semant_table_name(constraining_table);
                            SubLObject constraint_name = semantic_etl_bus.foreign_key_constraint_constraint_name(constraint);
                            SubLObject fk_column_constraint = semantic_etl_bus.new_sql_fk_column_constraint(constraint_name, kill_table_name, kill_column_name);
                            SubLObject fk_table_constraint = semantic_etl_bus.new_sql_fk_table_constraint(kill_column_name, fk_column_constraint);
                            SubLObject drop_clause = semantic_etl_bus.new_sql_drop_constraint(fk_table_constraint);
                            SubLObject alter_drop = semantic_etl_bus.new_sql_alter_table(kill_table_name, drop_clause);
                            semantic_etl_bus.output_spec_append_to_recipe(output_spec, alter_drop);
                            if (NIL != member(kill_column_name, new_column_names, EQUAL, UNPROVIDED)) {
                                {
                                    SubLObject new_constraint_name = semantic_etl_bus.new_foreign_key_constraint_name(keep_table_name, kill_column_name);
                                    SubLObject fk_column_constraint_8 = semantic_etl_bus.new_sql_fk_column_constraint(new_constraint_name, constraining_table_name, constraining_column_name);
                                    SubLObject fk_table_constraint_9 = semantic_etl_bus.new_sql_fk_table_constraint(kill_column_name, fk_column_constraint_8);
                                    SubLObject add_constraint = semantic_etl_bus.new_sql_add_constraint(fk_table_constraint_9);
                                    SubLObject add_clause = semantic_etl_bus.new_sql_alter_table(keep_table_name, add_constraint);
                                    add_clauses = cons(add_clause, add_clauses);
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = new_column_definitions;
                SubLObject new_column = NIL;
                for (new_column = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_column = cdolist_list_var.first()) {
                    semantic_etl_bus.output_spec_append_to_recipe(output_spec, new_column);
                }
            }
            {
                SubLObject cdolist_list_var = nreverse(ensure_fk_constraints_obeyed);
                SubLObject statement = NIL;
                for (statement = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , statement = cdolist_list_var.first()) {
                    semantic_etl_bus.output_spec_append_to_recipe(output_spec, statement);
                }
            }
            semantic_etl_bus.output_spec_append_to_recipe(output_spec, copy_unifiable_data);
            semantic_etl_bus.output_spec_append_to_recipe(output_spec, copy_non_unifiable_data);
            {
                SubLObject cdolist_list_var = update_fkey_constraints;
                SubLObject statement = NIL;
                for (statement = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , statement = cdolist_list_var.first()) {
                    semantic_etl_bus.output_spec_append_to_recipe(output_spec, statement);
                }
            }
            semantic_etl_bus.output_spec_append_to_recipe(output_spec, kill_table);
            semantic_etl_bus.output_spec_append_to_semantic_recipe(output_spec, semantic_description);
            {
                SubLObject cdolist_list_var = add_clauses;
                SubLObject add_clause = NIL;
                for (add_clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , add_clause = cdolist_list_var.first()) {
                    semantic_etl_bus.output_spec_append_to_recipe(output_spec, add_clause);
                }
            }
            semantic_etl_bus.output_spec_synchronize(output_spec);
        }
        return output_spec;
    }

    /**
     * Remove KILL-TABLE-SEMANTICS from OUTPUT-SPEC, but first copy all relevant data over to KEEP-TABLE-SEMANTICS, using
     * the columns in COLUMN-CORRESPONDENCE-LIST as the key to which rows in the two tables are equal
     *
     * @unknown COLUMN-CORRESPONDENCE-LIST is a list of two-element lists, which are column objects
     * @return db-output-spec-p
     */
    @LispMethod(comment = "Remove KILL-TABLE-SEMANTICS from OUTPUT-SPEC, but first copy all relevant data over to KEEP-TABLE-SEMANTICS, using\r\nthe columns in COLUMN-CORRESPONDENCE-LIST as the key to which rows in the two tables are equal\r\n\r\n@unknown COLUMN-CORRESPONDENCE-LIST is a list of two-element lists, which are column objects\r\n@return db-output-spec-p\nRemove KILL-TABLE-SEMANTICS from OUTPUT-SPEC, but first copy all relevant data over to KEEP-TABLE-SEMANTICS, using\nthe columns in COLUMN-CORRESPONDENCE-LIST as the key to which rows in the two tables are equal")
    public static SubLObject merge_tables(final SubLObject output_spec, final SubLObject keep_table_semantics, final SubLObject kill_table_semantics, final SubLObject column_correspondence_list) {
        final SubLObject new_column_definitions = add_new_columns(kill_table_semantics, keep_table_semantics, column_correspondence_list);
        final SubLObject new_column_names = Mapping.mapcar(EXTRACT_ADDED_COLUMN, new_column_definitions);
        final SubLObject ensure_fk_constraints_obeyed = copy_data_to_table_referenced_by_foreign_key(kill_table_semantics, keep_table_semantics, column_correspondence_list);
        final SubLObject copy_non_unifiable_data = copy_non_unifiable_data(kill_table_semantics, keep_table_semantics, column_correspondence_list);
        final SubLObject copy_unifiable_data = copy_unifiable_data(kill_table_semantics, keep_table_semantics, column_correspondence_list);
        final SubLObject update_fkey_constraints = update_fkey_constraints_and_values(keep_table_semantics, kill_table_semantics, column_correspondence_list);
        final SubLObject kill_table = semantic_etl_bus.new_sql_drop_table(semantic_etl_bus.table_semantics_table_name(kill_table_semantics));
        final SubLObject new_correspondence_list = augment_correspondence_list_with_new_columns(column_correspondence_list, new_column_names, kill_table_semantics, keep_table_semantics);
        final SubLObject semantic_description = semantic_etl_bus.new_table_merger(list(keep_table_semantics, kill_table_semantics), keep_table_semantics, new_correspondence_list);
        final SubLObject kill_table_name = semantic_etl_bus.t_semant_table_name(kill_table_semantics);
        final SubLObject keep_table_name = semantic_etl_bus.t_semant_table_name(keep_table_semantics);
        SubLObject add_clauses = NIL;
        SubLObject cdolist_list_var = semantic_etl_bus.table_semantics_column_constraints(kill_table_semantics);
        SubLObject constraint = NIL;
        constraint = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != semantic_etl_bus.foreign_key_constraint_p(constraint)) {
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
                if (NIL != member(kill_column_name, new_column_names, EQUAL, UNPROVIDED)) {
                    final SubLObject new_constraint_name = semantic_etl_bus.new_foreign_key_constraint_name(keep_table_name, kill_column_name);
                    final SubLObject fk_column_constraint_$8 = semantic_etl_bus.new_sql_fk_column_constraint(new_constraint_name, constraining_table_name, constraining_column_name);
                    final SubLObject fk_table_constraint_$9 = semantic_etl_bus.new_sql_fk_table_constraint(kill_column_name, fk_column_constraint_$8);
                    final SubLObject add_constraint = semantic_etl_bus.new_sql_add_constraint(fk_table_constraint_$9);
                    final SubLObject add_clause = semantic_etl_bus.new_sql_alter_table(keep_table_name, add_constraint);
                    add_clauses = cons(add_clause, add_clauses);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        } 
        cdolist_list_var = new_column_definitions;
        SubLObject new_column = NIL;
        new_column = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            semantic_etl_bus.output_spec_append_to_recipe(output_spec, new_column);
            cdolist_list_var = cdolist_list_var.rest();
            new_column = cdolist_list_var.first();
        } 
        cdolist_list_var = nreverse(ensure_fk_constraints_obeyed);
        SubLObject statement = NIL;
        statement = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            semantic_etl_bus.output_spec_append_to_recipe(output_spec, statement);
            cdolist_list_var = cdolist_list_var.rest();
            statement = cdolist_list_var.first();
        } 
        semantic_etl_bus.output_spec_append_to_recipe(output_spec, copy_unifiable_data);
        semantic_etl_bus.output_spec_append_to_recipe(output_spec, copy_non_unifiable_data);
        cdolist_list_var = update_fkey_constraints;
        statement = NIL;
        statement = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            semantic_etl_bus.output_spec_append_to_recipe(output_spec, statement);
            cdolist_list_var = cdolist_list_var.rest();
            statement = cdolist_list_var.first();
        } 
        semantic_etl_bus.output_spec_append_to_recipe(output_spec, kill_table);
        semantic_etl_bus.output_spec_append_to_semantic_recipe(output_spec, semantic_description);
        cdolist_list_var = add_clauses;
        SubLObject add_clause2 = NIL;
        add_clause2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            semantic_etl_bus.output_spec_append_to_recipe(output_spec, add_clause2);
            cdolist_list_var = cdolist_list_var.rest();
            add_clause2 = cdolist_list_var.first();
        } 
        semantic_etl_bus.output_spec_synchronize(output_spec);
        return output_spec;
    }

    /**
     * returns the name of the added column in SQL-ALTER
     */
    @LispMethod(comment = "returns the name of the added column in SQL-ALTER")
    public static final SubLObject extract_added_column_alt(SubLObject sql_alter) {
        {
            SubLObject action = semantic_etl_bus.sql_alter_table_action(sql_alter);
            SubLObject column = semantic_etl_bus.sql_add_column_column(action);
            return column;
        }
    }

    /**
     * returns the name of the added column in SQL-ALTER
     */
    @LispMethod(comment = "returns the name of the added column in SQL-ALTER")
    public static SubLObject extract_added_column(final SubLObject sql_alter) {
        final SubLObject action = semantic_etl_bus.sql_alter_table_action(sql_alter);
        final SubLObject column = semantic_etl_bus.sql_add_column_column(action);
        return column;
    }/**
     * returns the name of the added column in SQL-ALTER
     */


    public static final SubLObject augment_correspondence_list_with_new_columns_alt(SubLObject column_correspondence_list, SubLObject new_column_names, SubLObject kill_table, SubLObject keep_table) {
        {
            SubLObject new_correspondence_list = copy_list(column_correspondence_list);
            SubLObject cdolist_list_var = new_column_names;
            SubLObject new_column = NIL;
            for (new_column = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_column = cdolist_list_var.first()) {
                new_correspondence_list = cons(list(semantic_etl_bus.table_semantics_get_column_named(kill_table, new_column), list($COLUMN_NAMED, semantic_etl_bus.table_semantics_table_name(keep_table), new_column), list(list($$equals, $COPY, $UNKNOWN_WEIGHT))), new_correspondence_list);
            }
            return new_correspondence_list;
        }
    }

    public static SubLObject augment_correspondence_list_with_new_columns(final SubLObject column_correspondence_list, final SubLObject new_column_names, final SubLObject kill_table, final SubLObject keep_table) {
        SubLObject new_correspondence_list = copy_list(column_correspondence_list);
        SubLObject cdolist_list_var = new_column_names;
        SubLObject new_column = NIL;
        new_column = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            new_correspondence_list = cons(list(semantic_etl_bus.table_semantics_get_column_named(kill_table, new_column), list($COLUMN_NAMED, semantic_etl_bus.table_semantics_table_name(keep_table), new_column), list(list($$equals, $COPY, $UNKNOWN_WEIGHT))), new_correspondence_list);
            cdolist_list_var = cdolist_list_var.rest();
            new_column = cdolist_list_var.first();
        } 
        return new_correspondence_list;
    }

    /**
     * add versions of all columns in FROM-TABLE to TO-TABLE unless the columns are in COLUMN-CORRESPONDENCE-LIST
     *
     * @return listp of sql-command-p
     */
    @LispMethod(comment = "add versions of all columns in FROM-TABLE to TO-TABLE unless the columns are in COLUMN-CORRESPONDENCE-LIST\r\n\r\n@return listp of sql-command-p")
    public static final SubLObject add_new_columns_alt(SubLObject from_table_semantics, SubLObject to_table_semantics, SubLObject column_correspondence_list) {
        {
            SubLObject statements = NIL;
            SubLObject to_table_name = semantic_etl_bus.table_semantics_table_name(to_table_semantics);
            SubLObject cdolist_list_var = semantic_etl_bus.table_semantics_column_semantics_list(from_table_semantics);
            SubLObject column = NIL;
            for (column = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , column = cdolist_list_var.first()) {
                if (NIL == member(column, column_correspondence_list, EQ, FIRST)) {
                    {
                        SubLObject column_name = semantic_etl_bus.column_semantics_column_name(column);
                        SubLObject column_size = semantic_etl_bus.column_semantics_column_size(column);
                        SubLObject column_type = semantic_etl_bus.column_semantics_column_type(column);
                        statements = cons(semantic_etl_bus.new_sql_add_column_to_table(to_table_name, column_name, column_type, column_size, UNPROVIDED), statements);
                    }
                }
            }
            return statements;
        }
    }

    /**
     * add versions of all columns in FROM-TABLE to TO-TABLE unless the columns are in COLUMN-CORRESPONDENCE-LIST
     *
     * @return listp of sql-command-p
     */
    @LispMethod(comment = "add versions of all columns in FROM-TABLE to TO-TABLE unless the columns are in COLUMN-CORRESPONDENCE-LIST\r\n\r\n@return listp of sql-command-p")
    public static SubLObject add_new_columns(final SubLObject from_table_semantics, final SubLObject to_table_semantics, final SubLObject column_correspondence_list) {
        SubLObject statements = NIL;
        final SubLObject to_table_name = semantic_etl_bus.table_semantics_table_name(to_table_semantics);
        SubLObject cdolist_list_var = semantic_etl_bus.table_semantics_column_semantics_list(from_table_semantics);
        SubLObject column = NIL;
        column = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == member(column, column_correspondence_list, EQ, FIRST)) {
                final SubLObject column_name = semantic_etl_bus.column_semantics_column_name(column);
                final SubLObject column_size = semantic_etl_bus.column_semantics_column_size(column);
                final SubLObject column_type = semantic_etl_bus.column_semantics_column_type(column);
                statements = cons(semantic_etl_bus.new_sql_add_column_to_table(to_table_name, column_name, column_type, column_size, UNPROVIDED), statements);
            }
            cdolist_list_var = cdolist_list_var.rest();
            column = cdolist_list_var.first();
        } 
        return statements;
    }/**
     * add versions of all columns in FROM-TABLE to TO-TABLE unless the columns are in COLUMN-CORRESPONDENCE-LIST
     *
     * @return listp of sql-command-p
     */


    /**
     * copy all the rows that don't match along COLUMN-CORRESPONDENCE-LIST from FROM-TABLE to TO-TABLE
     *
     * @return sql-command-p
     */
    @LispMethod(comment = "copy all the rows that don\'t match along COLUMN-CORRESPONDENCE-LIST from FROM-TABLE to TO-TABLE\r\n\r\n@return sql-command-p")
    public static final SubLObject copy_non_unifiable_data_alt(SubLObject from_table, SubLObject to_table, SubLObject column_correspondence_list) {
        {
            SubLObject to_table_name = semantic_etl_bus.table_semantics_table_name(to_table);
            SubLObject alias_table_name = $str_alt22$NEW_TABLE_NAME;
            SubLObject on_clause = com.cyc.cycjava.cycl.sksi.mapping_engine.create_correspondence_equal_or_null(semantic_etl_bus.table_semantics_table_name(from_table), alias_table_name, column_correspondence_list);
            SubLObject select_for_to_table_correspondences = com.cyc.cycjava.cycl.sksi.mapping_engine.select_for_corresponding_columns(to_table, column_correspondence_list, TWO_INTEGER);
            SubLObject select_for_from_table_corresponces = com.cyc.cycjava.cycl.sksi.mapping_engine.select_for_corresponding_columns(from_table, column_correspondence_list, ONE_INTEGER);
            SubLObject except = semantic_etl_bus.new_sql_except(select_for_from_table_corresponces, select_for_to_table_correspondences);
            SubLObject alias = semantic_etl_bus.new_sql_alias(except, alias_table_name);
            SubLObject select_all_from_from_table = com.cyc.cycjava.cycl.sksi.mapping_engine.select_all_from_table(from_table);
            SubLObject inner_join = semantic_etl_bus.new_sql_inner_join(select_all_from_from_table, alias, on_clause);
            SubLObject insert = semantic_etl_bus.new_sql_insert_into(to_table_name, com.cyc.cycjava.cycl.sksi.mapping_engine.column_names_with_correspondences_substituted(from_table, column_correspondence_list, TWO_INTEGER), inner_join);
            return insert;
        }
    }

    /**
     * copy all the rows that don't match along COLUMN-CORRESPONDENCE-LIST from FROM-TABLE to TO-TABLE
     *
     * @return sql-command-p
     */
    @LispMethod(comment = "copy all the rows that don\'t match along COLUMN-CORRESPONDENCE-LIST from FROM-TABLE to TO-TABLE\r\n\r\n@return sql-command-p")
    public static SubLObject copy_non_unifiable_data(final SubLObject from_table, final SubLObject to_table, final SubLObject column_correspondence_list) {
        final SubLObject to_table_name = semantic_etl_bus.table_semantics_table_name(to_table);
        final SubLObject alias_table_name = $str22$NEW_TABLE_NAME;
        final SubLObject on_clause = create_correspondence_equal_or_null(semantic_etl_bus.table_semantics_table_name(from_table), alias_table_name, column_correspondence_list);
        final SubLObject select_for_to_table_correspondences = select_for_corresponding_columns(to_table, column_correspondence_list, TWO_INTEGER);
        final SubLObject select_for_from_table_corresponces = select_for_corresponding_columns(from_table, column_correspondence_list, ONE_INTEGER);
        final SubLObject except = semantic_etl_bus.new_sql_except(select_for_from_table_corresponces, select_for_to_table_correspondences);
        final SubLObject alias = semantic_etl_bus.new_sql_alias(except, alias_table_name);
        final SubLObject select_all_from_from_table = select_all_from_table(from_table);
        final SubLObject inner_join = semantic_etl_bus.new_sql_inner_join(select_all_from_from_table, alias, on_clause);
        final SubLObject insert = semantic_etl_bus.new_sql_insert_into(to_table_name, column_names_with_correspondences_substituted(from_table, column_correspondence_list, TWO_INTEGER), inner_join);
        return insert;
    }/**
     * copy all the rows that don't match along COLUMN-CORRESPONDENCE-LIST from FROM-TABLE to TO-TABLE
     *
     * @return sql-command-p
     */


    /**
     * Copy any data from FROM-TABLE to TO-TABLE, where we determine 'unifiability' by requiring rows to have equals
     * values for all columns in COLUMN-CORRESPONDENCE-LIST
     */
    @LispMethod(comment = "Copy any data from FROM-TABLE to TO-TABLE, where we determine \'unifiability\' by requiring rows to have equals\r\nvalues for all columns in COLUMN-CORRESPONDENCE-LIST\nCopy any data from FROM-TABLE to TO-TABLE, where we determine \'unifiability\' by requiring rows to have equals\nvalues for all columns in COLUMN-CORRESPONDENCE-LIST")
    public static final SubLObject copy_unifiable_data_alt(SubLObject from_table, SubLObject to_table, SubLObject column_correspondence_list) {
        {
            SubLObject to_table_name = semantic_etl_bus.table_semantics_table_name(to_table);
            SubLObject from_table_name = semantic_etl_bus.table_semantics_table_name(from_table);
            SubLObject where_clause = com.cyc.cycjava.cycl.sksi.mapping_engine.create_correspondence_equal_or_null(from_table_name, to_table_name, column_correspondence_list);
            SubLObject insert_setting = com.cyc.cycjava.cycl.sksi.mapping_engine.create_non_corresponding_insert_setting(from_table, column_correspondence_list, ONE_INTEGER);
            SubLObject insert = semantic_etl_bus.new_sql_update(to_table_name, insert_setting, list(where_clause));
            return insert;
        }
    }

    @LispMethod(comment = "Copy any data from FROM-TABLE to TO-TABLE, where we determine \'unifiability\' by requiring rows to have equals\r\nvalues for all columns in COLUMN-CORRESPONDENCE-LIST\nCopy any data from FROM-TABLE to TO-TABLE, where we determine \'unifiability\' by requiring rows to have equals\nvalues for all columns in COLUMN-CORRESPONDENCE-LIST")
    public static SubLObject copy_unifiable_data(final SubLObject from_table, final SubLObject to_table, final SubLObject column_correspondence_list) {
        final SubLObject to_table_name = semantic_etl_bus.table_semantics_table_name(to_table);
        final SubLObject from_table_name = semantic_etl_bus.table_semantics_table_name(from_table);
        final SubLObject where_clause = create_correspondence_equal_or_null(from_table_name, to_table_name, column_correspondence_list);
        final SubLObject insert_setting = create_non_corresponding_insert_setting(from_table, column_correspondence_list, ONE_INTEGER);
        final SubLObject insert = semantic_etl_bus.new_sql_update(to_table_name, insert_setting, list(where_clause));
        return insert;
    }/**
     * Copy any data from FROM-TABLE to TO-TABLE, where we determine 'unifiability' by requiring rows to have equals
     * values for all columns in COLUMN-CORRESPONDENCE-LIST
     */


    public static final SubLObject select_for_corresponding_columns_alt(SubLObject table_1, SubLObject correspondence_list, SubLObject correspondence_arg) {
        {
            SubLObject table_name = semantic_etl_bus.table_semantics_table_name(table_1);
            SubLObject column_finder_fn = (correspondence_arg == ONE_INTEGER) ? ((SubLObject) (FIRST)) : SECOND;
            SubLObject column_names = Mapping.mapcar(COLUMN_SEMANTICS_COLUMN_NAME, Mapping.mapcar(column_finder_fn, correspondence_list));
            SubLObject result = semantic_etl_bus.new_sql_select_from(column_names, list(table_name), NIL);
            return result;
        }
    }

    public static SubLObject select_for_corresponding_columns(final SubLObject table_1, final SubLObject correspondence_list, final SubLObject correspondence_arg) {
        final SubLObject table_name = semantic_etl_bus.table_semantics_table_name(table_1);
        final SubLObject column_finder_fn = (correspondence_arg.eql(ONE_INTEGER)) ? FIRST : SECOND;
        final SubLObject column_names = Mapping.mapcar(COLUMN_SEMANTICS_COLUMN_NAME, Mapping.mapcar(column_finder_fn, correspondence_list));
        final SubLObject result = semantic_etl_bus.new_sql_select_from(column_names, list(table_name), NIL);
        return result;
    }

    public static final SubLObject column_names_with_correspondences_substituted_alt(SubLObject table, SubLObject correspondence_list, SubLObject substitution_argnum) {
        return Mapping.mapcar(COLUMN_SEMANTICS_COLUMN_NAME, com.cyc.cycjava.cycl.sksi.mapping_engine.columns_with_correspondences_substituted(table, correspondence_list, substitution_argnum));
    }

    public static SubLObject column_names_with_correspondences_substituted(final SubLObject table, final SubLObject correspondence_list, final SubLObject substitution_argnum) {
        return Mapping.mapcar(COLUMN_SEMANTICS_COLUMN_NAME, columns_with_correspondences_substituted(table, correspondence_list, substitution_argnum));
    }

    /**
     *
     *
     * @param substitution-argnum;
     * 		elements in this position in correspondences will be in the result, while those in the other
     * 		position will be removed
     */
    @LispMethod(comment = "@param substitution-argnum;\r\n\t\telements in this position in correspondences will be in the result, while those in the other\r\n\t\tposition will be removed")
    public static final SubLObject columns_with_correspondences_substituted_alt(SubLObject table, SubLObject correspondences, SubLObject substitution_argnum) {
        {
            SubLObject columns = semantic_etl_bus.table_semantics_column_semantics_list(table);
            SubLObject cdolist_list_var = correspondences;
            SubLObject correspondence = NIL;
            for (correspondence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , correspondence = cdolist_list_var.first()) {
                {
                    SubLObject datum = correspondence;
                    SubLObject current = datum;
                    SubLObject col_1 = NIL;
                    SubLObject col_2 = NIL;
                    SubLObject type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    col_1 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    col_2 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    type = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (substitution_argnum == ONE_INTEGER) {
                            columns = subst(col_1, col_2, columns, UNPROVIDED, UNPROVIDED);
                        } else {
                            columns = subst(col_2, col_1, columns, UNPROVIDED, UNPROVIDED);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt24);
                    }
                }
            }
            return columns;
        }
    }

    /**
     *
     *
     * @param substitution-argnum;
     * 		elements in this position in correspondences will be in the result, while those in the other
     * 		position will be removed
     */
    @LispMethod(comment = "@param substitution-argnum;\r\n\t\telements in this position in correspondences will be in the result, while those in the other\r\n\t\tposition will be removed")
    public static SubLObject columns_with_correspondences_substituted(final SubLObject table, final SubLObject correspondences, final SubLObject substitution_argnum) {
        SubLObject columns = semantic_etl_bus.table_semantics_column_semantics_list(table);
        SubLObject cdolist_list_var = correspondences;
        SubLObject correspondence = NIL;
        correspondence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = correspondence;
            SubLObject col_1 = NIL;
            SubLObject col_2 = NIL;
            SubLObject type = NIL;
            destructuring_bind_must_consp(current, datum, $list24);
            col_1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list24);
            col_2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list24);
            type = current.first();
            current = current.rest();
            if (NIL == current) {
                if (substitution_argnum.eql(ONE_INTEGER)) {
                    columns = subst(col_1, col_2, columns, UNPROVIDED, UNPROVIDED);
                } else {
                    columns = subst(col_2, col_1, columns, UNPROVIDED, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list24);
            }
            cdolist_list_var = cdolist_list_var.rest();
            correspondence = cdolist_list_var.first();
        } 
        return columns;
    }

    public static final SubLObject create_correspondence_equal_or_null_alt(SubLObject table_1_name, SubLObject table_2_name, SubLObject correspondence_list) {
        {
            SubLObject equal_or_nulls = NIL;
            SubLObject cdolist_list_var = correspondence_list;
            SubLObject correspondence = NIL;
            for (correspondence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , correspondence = cdolist_list_var.first()) {
                {
                    SubLObject datum = correspondence;
                    SubLObject current = datum;
                    SubLObject table_1_col = NIL;
                    SubLObject table_2_col = NIL;
                    SubLObject type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt25);
                    table_1_col = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt25);
                    table_2_col = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt25);
                    type = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject table_1_col_name = semantic_etl_bus.column_semantics_column_name(table_1_col);
                            SubLObject table_2_col_name = semantic_etl_bus.column_semantics_column_name(table_2_col);
                            SubLObject table_1_null = semantic_etl_bus.new_sql_is_null(table_1_name, table_1_col_name);
                            SubLObject table_2_null = semantic_etl_bus.new_sql_is_null(table_2_name, table_2_col_name);
                            SubLObject tables_equal = semantic_etl_bus.new_sql_column_equal(table_1_name, table_1_col_name, table_2_name, table_2_col_name);
                            SubLObject both_null = semantic_etl_bus.new_sql_conjunction(list(table_1_null, table_2_null));
                            SubLObject equal_or_null = semantic_etl_bus.new_sql_disjunction(list(tables_equal, both_null));
                            equal_or_nulls = cons(equal_or_null, equal_or_nulls);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt25);
                    }
                }
            }
            if (NIL != list_utilities.singletonP(equal_or_nulls)) {
                return equal_or_nulls.first();
            } else {
                return semantic_etl_bus.new_sql_conjunction(equal_or_nulls);
            }
        }
    }

    public static SubLObject create_correspondence_equal_or_null(final SubLObject table_1_name, final SubLObject table_2_name, final SubLObject correspondence_list) {
        SubLObject equal_or_nulls = NIL;
        SubLObject cdolist_list_var = correspondence_list;
        SubLObject correspondence = NIL;
        correspondence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = correspondence;
            SubLObject table_1_col = NIL;
            SubLObject table_2_col = NIL;
            SubLObject type = NIL;
            destructuring_bind_must_consp(current, datum, $list25);
            table_1_col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list25);
            table_2_col = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list25);
            type = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject table_1_col_name = semantic_etl_bus.column_semantics_column_name(table_1_col);
                final SubLObject table_2_col_name = semantic_etl_bus.column_semantics_column_name(table_2_col);
                final SubLObject table_1_null = semantic_etl_bus.new_sql_is_null(table_1_name, table_1_col_name);
                final SubLObject table_2_null = semantic_etl_bus.new_sql_is_null(table_2_name, table_2_col_name);
                final SubLObject tables_equal = semantic_etl_bus.new_sql_column_equal(table_1_name, table_1_col_name, table_2_name, table_2_col_name);
                final SubLObject both_null = semantic_etl_bus.new_sql_conjunction(list(table_1_null, table_2_null));
                final SubLObject equal_or_null = semantic_etl_bus.new_sql_disjunction(list(tables_equal, both_null));
                equal_or_nulls = cons(equal_or_null, equal_or_nulls);
            } else {
                cdestructuring_bind_error(datum, $list25);
            }
            cdolist_list_var = cdolist_list_var.rest();
            correspondence = cdolist_list_var.first();
        } 
        if (NIL != list_utilities.singletonP(equal_or_nulls)) {
            return equal_or_nulls.first();
        }
        return semantic_etl_bus.new_sql_conjunction(equal_or_nulls);
    }

    public static final SubLObject create_non_corresponding_insert_setting_alt(SubLObject from_table, SubLObject correspondence_list, SubLObject given_table_arg) {
        {
            SubLObject v_equals = NIL;
            SubLObject from_table_arg_key = (given_table_arg.numE(ONE_INTEGER)) ? ((SubLObject) (FIRST)) : SECOND;
            SubLObject cdolist_list_var = semantic_etl_bus.table_semantics_column_semantics_list(from_table);
            SubLObject column = NIL;
            for (column = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , column = cdolist_list_var.first()) {
                if (NIL == subl_promotions.memberP(column, correspondence_list, EQ, from_table_arg_key)) {
                    {
                        SubLObject from_col_name = semantic_etl_bus.column_semantics_column_name(column);
                        SubLObject table_2_name = $str_alt26$;
                        SubLObject from_table_name = semantic_etl_bus.table_semantics_table_name(from_table);
                        SubLObject tables_equal = semantic_etl_bus.new_sql_column_equal(table_2_name, from_col_name, from_table_name, from_col_name);
                        v_equals = cons(tables_equal, v_equals);
                    }
                }
            }
            return v_equals;
        }
    }

    public static SubLObject create_non_corresponding_insert_setting(final SubLObject from_table, final SubLObject correspondence_list, final SubLObject given_table_arg) {
        SubLObject v_equals = NIL;
        final SubLObject from_table_arg_key = (given_table_arg.numE(ONE_INTEGER)) ? FIRST : SECOND;
        SubLObject cdolist_list_var = semantic_etl_bus.table_semantics_column_semantics_list(from_table);
        SubLObject column = NIL;
        column = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(column, correspondence_list, EQ, from_table_arg_key)) {
                final SubLObject from_col_name = semantic_etl_bus.column_semantics_column_name(column);
                final SubLObject table_2_name = $str26$;
                final SubLObject from_table_name = semantic_etl_bus.table_semantics_table_name(from_table);
                final SubLObject tables_equal = semantic_etl_bus.new_sql_column_equal(table_2_name, from_col_name, from_table_name, from_col_name);
                v_equals = cons(tables_equal, v_equals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            column = cdolist_list_var.first();
        } 
        return v_equals;
    }

    /**
     * If there are any foreign-key constraints pointing towards KILL-TABLE-SEMANTICS, switch them to point
     * to KEEP-TABLE-SEMANTICS, and change the values so that they have the primary key of the keep-table instead of
     * the primary key of the kill-table
     *
     * @unknown assumes that keep-table-semantics has exactly one primary-key-column
     */
    @LispMethod(comment = "If there are any foreign-key constraints pointing towards KILL-TABLE-SEMANTICS, switch them to point\r\nto KEEP-TABLE-SEMANTICS, and change the values so that they have the primary key of the keep-table instead of\r\nthe primary key of the kill-table\r\n\r\n@unknown assumes that keep-table-semantics has exactly one primary-key-column\nIf there are any foreign-key constraints pointing towards KILL-TABLE-SEMANTICS, switch them to point\nto KEEP-TABLE-SEMANTICS, and change the values so that they have the primary key of the keep-table instead of\nthe primary key of the kill-table")
    public static final SubLObject update_fkey_constraints_and_values_alt(SubLObject keep_table_semantics, SubLObject kill_table_semantics, SubLObject column_correspondence_list) {
        {
            SubLObject statements = NIL;
            SubLObject cdolist_list_var = semantic_etl_bus.table_semantics_pointed_to_by_tables(kill_table_semantics);
            SubLObject table_pointing_to_kill_table = NIL;
            for (table_pointing_to_kill_table = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , table_pointing_to_kill_table = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_10 = semantic_etl_bus.table_semantics_column_constraints(table_pointing_to_kill_table);
                    SubLObject constraint = NIL;
                    for (constraint = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , constraint = cdolist_list_var_10.first()) {
                        if ((NIL != semantic_etl_bus.foreign_key_constraint_p(constraint)) && (kill_table_semantics == semantic_etl_bus.foreign_key_constraint_constraining_table(constraint))) {
                            {
                                SubLObject constraint_name = semantic_etl_bus.foreign_key_constraint_constraint_name(constraint);
                                SubLObject constrained_table = semantic_etl_bus.foreign_key_constraint_constrained_table(constraint);
                                SubLObject constrained_table_name = semantic_etl_bus.table_semantics_table_name(constrained_table);
                                SubLObject constrained_column = semantic_etl_bus.foreign_key_constraint_constrained_column(constraint);
                                SubLObject constrained_column_name = semantic_etl_bus.column_semantics_column_name(constrained_column);
                                SubLObject column_constraint = semantic_etl_bus.new_sql_fk_column_constraint(constraint_name, constrained_table_name, constrained_column_name);
                                SubLObject table_fk_constraint = semantic_etl_bus.new_sql_fk_table_constraint(constrained_column_name, column_constraint);
                                SubLObject drop_fk = semantic_etl_bus.new_sql_drop_constraint(table_fk_constraint);
                                SubLObject column_names = semantic_etl_bus.table_semantics_column_names(constrained_table);
                                SubLObject new_column_name = string_utilities.uniquify_string_via_set(cconcatenate($str_alt27$new_, constrained_column_name), column_names, UNPROVIDED);
                                SubLObject constraining_column = semantic_etl_bus.foreign_key_constraint_constraining_column(constraint);
                                SubLObject column_type = semantic_etl_bus.column_semantics_column_type(constraining_column);
                                SubLObject column_size = semantic_etl_bus.column_semantics_column_size(constraining_column);
                                SubLObject add_temp_fk_column = semantic_etl_bus.new_sql_add_column(new_column_name, column_type, column_size, UNPROVIDED);
                                SubLObject keep_table_name = semantic_etl_bus.table_semantics_table_name(keep_table_semantics);
                                SubLObject keep_table_pk_column = semantic_etl_bus.table_semantics_primary_key_columns(keep_table_semantics).first();
                                SubLObject keep_table_pk_column_name = semantic_etl_bus.column_semantics_column_name(keep_table_pk_column);
                                SubLObject fk_constraint_name = semantic_etl_bus.new_foreign_key_constraint_name(constrained_table_name, new_column_name);
                                SubLObject sql_fk = semantic_etl_bus.new_sql_fk_column_constraint(fk_constraint_name, keep_table_name, keep_table_pk_column_name);
                                SubLObject sql_fk_table_constraint = semantic_etl_bus.new_sql_fk_table_constraint(new_column_name, sql_fk);
                                SubLObject add_constraint = semantic_etl_bus.new_sql_add_constraint(sql_fk_table_constraint);
                                SubLObject alter_fk_constraint = semantic_etl_bus.new_sql_alter_table(constrained_table_name, add_constraint);
                                SubLObject update_settings = list(semantic_etl_bus.new_sql_column_equal($str_alt26$, new_column_name, keep_table_name, keep_table_pk_column_name));
                                SubLObject update_where = list(semantic_etl_bus.new_sql_column_equal(keep_table_name, constrained_column_name, constrained_table_name, constrained_column_name));
                                SubLObject drop_fk_column = semantic_etl_bus.new_sql_drop_column(constrained_column_name);
                                SubLObject rename_fk_column = semantic_etl_bus.new_sql_rename_column(new_column_name, constrained_column_name);
                                statements = cons(semantic_etl_bus.new_sql_alter_table(constrained_table_name, drop_fk), statements);
                                statements = cons(semantic_etl_bus.new_sql_alter_table(constrained_table_name, add_temp_fk_column), statements);
                                statements = cons(alter_fk_constraint, statements);
                                statements = cons(semantic_etl_bus.new_sql_update(constrained_table_name, update_settings, update_where), statements);
                                statements = cons(semantic_etl_bus.new_sql_alter_table(constrained_table_name, drop_fk_column), statements);
                                statements = cons(semantic_etl_bus.new_sql_alter_table(constrained_table_name, rename_fk_column), statements);
                            }
                        }
                    }
                }
            }
            return nreverse(statements);
        }
    }

    /**
     * If there are any foreign-key constraints pointing towards KILL-TABLE-SEMANTICS, switch them to point
     * to KEEP-TABLE-SEMANTICS, and change the values so that they have the primary key of the keep-table instead of
     * the primary key of the kill-table
     *
     * @unknown assumes that keep-table-semantics has exactly one primary-key-column
     */
    @LispMethod(comment = "If there are any foreign-key constraints pointing towards KILL-TABLE-SEMANTICS, switch them to point\r\nto KEEP-TABLE-SEMANTICS, and change the values so that they have the primary key of the keep-table instead of\r\nthe primary key of the kill-table\r\n\r\n@unknown assumes that keep-table-semantics has exactly one primary-key-column\nIf there are any foreign-key constraints pointing towards KILL-TABLE-SEMANTICS, switch them to point\nto KEEP-TABLE-SEMANTICS, and change the values so that they have the primary key of the keep-table instead of\nthe primary key of the kill-table")
    public static SubLObject update_fkey_constraints_and_values(final SubLObject keep_table_semantics, final SubLObject kill_table_semantics, final SubLObject column_correspondence_list) {
        SubLObject statements = NIL;
        SubLObject cdolist_list_var = semantic_etl_bus.table_semantics_pointed_to_by_tables(kill_table_semantics);
        SubLObject table_pointing_to_kill_table = NIL;
        table_pointing_to_kill_table = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$10 = semantic_etl_bus.table_semantics_column_constraints(table_pointing_to_kill_table);
            SubLObject constraint = NIL;
            constraint = cdolist_list_var_$10.first();
            while (NIL != cdolist_list_var_$10) {
                if ((NIL != semantic_etl_bus.foreign_key_constraint_p(constraint)) && kill_table_semantics.eql(semantic_etl_bus.foreign_key_constraint_constraining_table(constraint))) {
                    final SubLObject constraint_name = semantic_etl_bus.foreign_key_constraint_constraint_name(constraint);
                    final SubLObject constrained_table = semantic_etl_bus.foreign_key_constraint_constrained_table(constraint);
                    final SubLObject constrained_table_name = semantic_etl_bus.table_semantics_table_name(constrained_table);
                    final SubLObject constrained_column = semantic_etl_bus.foreign_key_constraint_constrained_column(constraint);
                    final SubLObject constrained_column_name = semantic_etl_bus.column_semantics_column_name(constrained_column);
                    final SubLObject column_constraint = semantic_etl_bus.new_sql_fk_column_constraint(constraint_name, constrained_table_name, constrained_column_name);
                    final SubLObject table_fk_constraint = semantic_etl_bus.new_sql_fk_table_constraint(constrained_column_name, column_constraint);
                    final SubLObject drop_fk = semantic_etl_bus.new_sql_drop_constraint(table_fk_constraint);
                    final SubLObject column_names = semantic_etl_bus.table_semantics_column_names(constrained_table);
                    final SubLObject new_column_name = string_utilities.uniquify_string_via_set(cconcatenate($str27$new_, constrained_column_name), column_names, UNPROVIDED);
                    final SubLObject constraining_column = semantic_etl_bus.foreign_key_constraint_constraining_column(constraint);
                    final SubLObject column_type = semantic_etl_bus.column_semantics_column_type(constraining_column);
                    final SubLObject column_size = semantic_etl_bus.column_semantics_column_size(constraining_column);
                    final SubLObject add_temp_fk_column = semantic_etl_bus.new_sql_add_column(new_column_name, column_type, column_size, UNPROVIDED);
                    final SubLObject keep_table_name = semantic_etl_bus.table_semantics_table_name(keep_table_semantics);
                    final SubLObject keep_table_pk_column = semantic_etl_bus.table_semantics_primary_key_columns(keep_table_semantics).first();
                    final SubLObject keep_table_pk_column_name = semantic_etl_bus.column_semantics_column_name(keep_table_pk_column);
                    final SubLObject fk_constraint_name = semantic_etl_bus.new_foreign_key_constraint_name(constrained_table_name, new_column_name);
                    final SubLObject sql_fk = semantic_etl_bus.new_sql_fk_column_constraint(fk_constraint_name, keep_table_name, keep_table_pk_column_name);
                    final SubLObject sql_fk_table_constraint = semantic_etl_bus.new_sql_fk_table_constraint(new_column_name, sql_fk);
                    final SubLObject add_constraint = semantic_etl_bus.new_sql_add_constraint(sql_fk_table_constraint);
                    final SubLObject alter_fk_constraint = semantic_etl_bus.new_sql_alter_table(constrained_table_name, add_constraint);
                    final SubLObject update_settings = list(semantic_etl_bus.new_sql_column_equal($str26$, new_column_name, keep_table_name, keep_table_pk_column_name));
                    final SubLObject update_where = list(semantic_etl_bus.new_sql_column_equal(keep_table_name, constrained_column_name, constrained_table_name, constrained_column_name));
                    final SubLObject drop_fk_column = semantic_etl_bus.new_sql_drop_column(constrained_column_name);
                    final SubLObject rename_fk_column = semantic_etl_bus.new_sql_rename_column(new_column_name, constrained_column_name);
                    statements = cons(semantic_etl_bus.new_sql_alter_table(constrained_table_name, drop_fk), statements);
                    statements = cons(semantic_etl_bus.new_sql_alter_table(constrained_table_name, add_temp_fk_column), statements);
                    statements = cons(alter_fk_constraint, statements);
                    statements = cons(semantic_etl_bus.new_sql_update(constrained_table_name, update_settings, update_where), statements);
                    statements = cons(semantic_etl_bus.new_sql_alter_table(constrained_table_name, drop_fk_column), statements);
                    statements = cons(semantic_etl_bus.new_sql_alter_table(constrained_table_name, rename_fk_column), statements);
                }
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                constraint = cdolist_list_var_$10.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            table_pointing_to_kill_table = cdolist_list_var.first();
        } 
        return nreverse(statements);
    }

    public static final SubLObject column_names_from_correspondence_list_alt(SubLObject list, SubLObject list_arg) {
        return Mapping.mapcar(COLUMN_SEMANTICS_COLUMN_NAME, com.cyc.cycjava.cycl.sksi.mapping_engine.columns_from_correspondence_list(list, list_arg));
    }

    public static SubLObject column_names_from_correspondence_list(final SubLObject list, final SubLObject list_arg) {
        return Mapping.mapcar(COLUMN_SEMANTICS_COLUMN_NAME, columns_from_correspondence_list(list, list_arg));
    }

    public static final SubLObject columns_from_correspondence_list_alt(SubLObject list, SubLObject list_arg) {
        return Mapping.mapcar(list_arg == ONE_INTEGER ? ((SubLObject) (FIRST)) : SECOND, list);
    }

    public static SubLObject columns_from_correspondence_list(final SubLObject list, final SubLObject list_arg) {
        return Mapping.mapcar(list_arg.eql(ONE_INTEGER) ? FIRST : SECOND, list);
    }

    public static final SubLObject select_all_from_table_alt(SubLObject table) {
        {
            SubLObject column_name_list = Mapping.mapcar(COLUMN_SEMANTICS_COLUMN_NAME, semantic_etl_bus.table_semantics_column_semantics_list(table));
            SubLObject table_name = semantic_etl_bus.table_semantics_table_name(table);
            SubLObject select = semantic_etl_bus.new_sql_select_from(column_name_list, list(table_name), NIL);
            return select;
        }
    }

    public static SubLObject select_all_from_table(final SubLObject table) {
        final SubLObject column_name_list = Mapping.mapcar(COLUMN_SEMANTICS_COLUMN_NAME, semantic_etl_bus.table_semantics_column_semantics_list(table));
        final SubLObject table_name = semantic_etl_bus.table_semantics_table_name(table);
        final SubLObject select = semantic_etl_bus.new_sql_select_from(column_name_list, list(table_name), NIL);
        return select;
    }

    public static final SubLObject possibly_debug_refine_output_spec_outwards_based_on_possible_genl_tables_alt(SubLObject spec_table_semantics, SubLObject genl_table_semantics, SubLObject table_connected_to_spec_table, SubLObject table_connected_to_genl_table, SubLObject table_connected_to_spec_link_table, SubLObject table_connected_to_genl_link_table, SubLObject spec_column_semantics, SubLObject genl_column_semantics) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != semantic_etl_bus.$semantic_etl_debugP$.getDynamicValue(thread)) {
                Errors.warn($str_alt28$___genls____a____a____linkTables_, new SubLObject[]{ spec_table_semantics, genl_table_semantics, table_connected_to_spec_table, table_connected_to_genl_table, table_connected_to_spec_link_table, table_connected_to_genl_link_table, spec_column_semantics, genl_column_semantics });
            }
            return NIL;
        }
    }

    public static SubLObject possibly_debug_refine_output_spec_outwards_based_on_possible_genl_tables(final SubLObject spec_table_semantics, final SubLObject genl_table_semantics, final SubLObject table_connected_to_spec_table, final SubLObject table_connected_to_genl_table, final SubLObject table_connected_to_spec_link_table, final SubLObject table_connected_to_genl_link_table, final SubLObject spec_column_semantics, final SubLObject genl_column_semantics) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != semantic_etl_bus.$semantic_etl_debugP$.getDynamicValue(thread)) {
            Errors.warn($str28$___genls____a____a____linkTables_, new SubLObject[]{ spec_table_semantics, genl_table_semantics, table_connected_to_spec_table, table_connected_to_genl_table, table_connected_to_spec_link_table, table_connected_to_genl_link_table, spec_column_semantics, genl_column_semantics });
        }
        return NIL;
    }

    /**
     * returns a list of table id pairs of different source databases from OUTPUT-SPEC
     */
    @LispMethod(comment = "returns a list of table id pairs of different source databases from OUTPUT-SPEC")
    public static final SubLObject semantic_etl_compute_possible_table_id_pairs_alt(SubLObject output_spec) {
        {
            SubLObject source_semantics_map = NIL;
            SubLObject source_semantics = NIL;
            SubLObject source_semantics_entry = NIL;
            SubLObject cdolist_list_var = semantic_etl_bus.semantics_table_semantics_list(semantic_etl_bus.db_output_spec_semantics(output_spec));
            SubLObject table = NIL;
            for (table = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , table = cdolist_list_var.first()) {
                source_semantics = semantic_etl_bus.table_semantics_source_semantics(table);
                source_semantics_entry = assoc(source_semantics, source_semantics_map, EQ, UNPROVIDED);
                if (NIL == source_semantics_entry) {
                    source_semantics_entry = cons(source_semantics, NIL);
                    source_semantics_map = cons(source_semantics_entry, source_semantics_map);
                }
                rplacd(source_semantics_entry, cons(semantic_etl_bus.table_semantics_table_id(table), source_semantics_entry.rest()));
            }
            if (!length(source_semantics_map).numE(TWO_INTEGER)) {
                Errors.error($str_alt29$More_than_two_source_databases_in, source_semantics_map);
            }
            return list_utilities.cross_products(list(source_semantics_map.first().rest(), second(source_semantics_map).rest()));
        }
    }

    @LispMethod(comment = "returns a list of table id pairs of different source databases from OUTPUT-SPEC")
    public static SubLObject semantic_etl_compute_possible_table_id_pairs(final SubLObject output_spec) {
        SubLObject source_semantics_map = NIL;
        SubLObject source_semantics = NIL;
        SubLObject source_semantics_entry = NIL;
        SubLObject cdolist_list_var = semantic_etl_bus.semantics_table_semantics_list(semantic_etl_bus.db_output_spec_semantics(output_spec));
        SubLObject table = NIL;
        table = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            source_semantics = semantic_etl_bus.table_semantics_source_semantics(table);
            source_semantics_entry = assoc(source_semantics, source_semantics_map, EQ, UNPROVIDED);
            if (NIL == source_semantics_entry) {
                source_semantics_entry = cons(source_semantics, NIL);
                source_semantics_map = cons(source_semantics_entry, source_semantics_map);
            }
            rplacd(source_semantics_entry, cons(semantic_etl_bus.table_semantics_table_id(table), source_semantics_entry.rest()));
            cdolist_list_var = cdolist_list_var.rest();
            table = cdolist_list_var.first();
        } 
        if (!length(source_semantics_map).numE(TWO_INTEGER)) {
            Errors.error($str29$More_than_two_source_databases_in, source_semantics_map);
        }
        return list_utilities.cross_products(list(source_semantics_map.first().rest(), second(source_semantics_map).rest()));
    }/**
     * returns a list of table id pairs of different source databases from OUTPUT-SPEC
     */


    public static final SubLObject link_tableP_alt(SubLObject table_semantics) {
        return numE(semantic_etl_bus.table_semantics_column_count(table_semantics), length(semantic_etl_bus.table_semantics_linked_table_ids(table_semantics)));
    }

    public static SubLObject link_tableP(final SubLObject table_semantics) {
        return numE(semantic_etl_bus.table_semantics_column_count(table_semantics), length(semantic_etl_bus.table_semantics_linked_table_ids(table_semantics)));
    }

    public static final SubLObject more_specific_table_semantics_alt(SubLObject table1_semantics, SubLObject table2_semantics) {
        {
            SubLObject more_general_table = com.cyc.cycjava.cycl.sksi.mapping_engine.tables_mergeable_into(table1_semantics, table2_semantics, UNPROVIDED);
            if (more_general_table == table1_semantics) {
                return table2_semantics;
            } else {
                if (more_general_table == table2_semantics) {
                    return table1_semantics;
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject more_specific_table_semantics(final SubLObject table1_semantics, final SubLObject table2_semantics) {
        final SubLObject more_general_table = tables_mergeable_into(table1_semantics, table2_semantics, UNPROVIDED);
        if (more_general_table.eql(table1_semantics)) {
            return table2_semantics;
        }
        if (more_general_table.eql(table2_semantics)) {
            return table1_semantics;
        }
        return NIL;
    }

    public static final SubLObject tables_mergeable_into_alt(SubLObject table1_semantics, SubLObject table2_semantics, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (NIL != intersection(semantic_etl_bus.table_semantics_table_parses(table1_semantics), semantic_etl_bus.table_semantics_table_parses(table2_semantics), EQUAL, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.sksi.mapping_engine.table_with_more_constraints(table1_semantics, table2_semantics);
        } else {
            if (NIL != genls.any_genl_anyP(semantic_etl_bus.table_semantics_table_parses(table1_semantics), semantic_etl_bus.table_semantics_table_parses(table2_semantics), mt, UNPROVIDED)) {
                return table2_semantics;
            } else {
                if (NIL != genls.any_genl_anyP(semantic_etl_bus.table_semantics_table_parses(table2_semantics), semantic_etl_bus.table_semantics_table_parses(table1_semantics), mt, UNPROVIDED)) {
                    return table1_semantics;
                } else {
                    return NIL;
                }
            }
        }
    }

    public static SubLObject tables_mergeable_into(final SubLObject table1_semantics, final SubLObject table2_semantics, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (NIL != intersection(semantic_etl_bus.table_semantics_table_parses(table1_semantics), semantic_etl_bus.table_semantics_table_parses(table2_semantics), EQUAL, UNPROVIDED)) {
            return table_with_more_constraints(table1_semantics, table2_semantics);
        }
        if (NIL != genls.any_genl_anyP(semantic_etl_bus.table_semantics_table_parses(table1_semantics), semantic_etl_bus.table_semantics_table_parses(table2_semantics), mt, UNPROVIDED)) {
            return table2_semantics;
        }
        if (NIL != genls.any_genl_anyP(semantic_etl_bus.table_semantics_table_parses(table2_semantics), semantic_etl_bus.table_semantics_table_parses(table1_semantics), mt, UNPROVIDED)) {
            return table1_semantics;
        }
        return NIL;
    }

    public static final SubLObject table_with_more_constraints_alt(SubLObject table1, SubLObject table2) {
        {
            SubLObject table1_fk_referenced_by = length(semantic_etl_bus.table_semantics_pointed_to_by_tables(table1));
            SubLObject table2_fk_referenced_by = length(semantic_etl_bus.table_semantics_pointed_to_by_tables(table2));
            if (table2_fk_referenced_by.numG(table1_fk_referenced_by)) {
                return table2;
            } else {
                if (table2_fk_referenced_by.numL(table1_fk_referenced_by)) {
                    return table1;
                } else {
                    if (table2_fk_referenced_by == table1_fk_referenced_by) {
                        if (length(semantic_etl_bus.table_semantics_foreign_key_constraints(table1)).numG(length(semantic_etl_bus.table_semantics_foreign_key_constraints(table2)))) {
                            return table1;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject table_with_more_constraints(final SubLObject table1, final SubLObject table2) {
        final SubLObject table1_fk_referenced_by = length(semantic_etl_bus.table_semantics_pointed_to_by_tables(table1));
        final SubLObject table2_fk_referenced_by = length(semantic_etl_bus.table_semantics_pointed_to_by_tables(table2));
        if (table2_fk_referenced_by.numG(table1_fk_referenced_by)) {
            return table2;
        }
        if (table2_fk_referenced_by.numL(table1_fk_referenced_by)) {
            return table1;
        }
        if (table2_fk_referenced_by.eql(table1_fk_referenced_by) && length(semantic_etl_bus.table_semantics_foreign_key_constraints(table1)).numG(length(semantic_etl_bus.table_semantics_foreign_key_constraints(table2)))) {
            return table1;
        }
        return NIL;
    }

    public static final SubLObject columns_mergeable_as_alt(SubLObject column1, SubLObject column2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        {
            SubLObject merge_as_from_column_name = com.cyc.cycjava.cycl.sksi.mapping_engine.more_general_column_interps(column1, column2, mt);
            if (NIL != merge_as_from_column_name) {
                return merge_as_from_column_name;
            }
        }
        return com.cyc.cycjava.cycl.sksi.mapping_engine.column_values_mergeable_as(column1, column2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject columns_mergeable_as(final SubLObject column1, final SubLObject column2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLObject merge_as_from_column_name = more_general_column_interps(column1, column2, mt);
        if (NIL != merge_as_from_column_name) {
            return merge_as_from_column_name;
        }
        return column_values_mergeable_as(column1, column2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return a list of possible merged-column types, ordered by preference
     */
    @LispMethod(comment = "@return a list of possible merged-column types, ordered by preference")
    public static final SubLObject more_general_column_interps_alt(SubLObject column1_semantics, SubLObject column2_semantics, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        {
            SubLObject possible_results = NIL;
            SubLObject column1_name = semantic_etl_bus.column_semantics_column_name(column1_semantics);
            SubLObject column2_name = semantic_etl_bus.column_semantics_column_name(column2_semantics);
            if (column1_name.equal(column2_name)) {
                return $list_alt31;
            }
            {
                SubLObject cdolist_list_var = semantic_etl_bus.column_semantics_column_parses(column1_semantics);
                SubLObject column1_interp = NIL;
                for (column1_interp = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , column1_interp = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_11 = semantic_etl_bus.column_semantics_column_parses(column2_semantics);
                        SubLObject column2_interp = NIL;
                        for (column2_interp = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , column2_interp = cdolist_list_var_11.first()) {
                            if (column1_interp.equal(column2_interp) && (NIL != com.cyc.cycjava.cycl.sksi.mapping_engine.allowable_merge_target_typeP(column1_interp, mt))) {
                                {
                                    SubLObject item_var = bq_cons(column1_interp, $list_alt32);
                                    if (NIL == member(item_var, possible_results, EQUAL, symbol_function(IDENTITY))) {
                                        possible_results = cons(item_var, possible_results);
                                    }
                                }
                            } else {
                                if ((NIL != genls.genlsP(column1_interp, column2_interp, mt, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.sksi.mapping_engine.allowable_merge_target_typeP(column2_interp, mt))) {
                                    {
                                        SubLObject item_var = bq_cons(column2_interp, $list_alt33);
                                        if (NIL == member(item_var, possible_results, EQUAL, symbol_function(IDENTITY))) {
                                            possible_results = cons(item_var, possible_results);
                                        }
                                    }
                                } else {
                                    if ((NIL != genls.genlsP(column2_interp, column1_interp, mt, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.sksi.mapping_engine.allowable_merge_target_typeP(column1_interp, mt))) {
                                        {
                                            SubLObject item_var = bq_cons(column1_interp, $list_alt33);
                                            if (NIL == member(item_var, possible_results, EQUAL, symbol_function(IDENTITY))) {
                                                possible_results = cons(item_var, possible_results);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if ((NIL != find($GENLS, possible_results, EQ, SECOND, UNPROVIDED, UNPROVIDED)) && (NIL != find($EQUAL, possible_results, EQ, SECOND, UNPROVIDED, UNPROVIDED))) {
                possible_results = remove($GENLS, possible_results, EQ, SECOND, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return Sort.sort(possible_results, BETTER_COLUMN_MERGE_TARGET, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return a list of possible merged-column types, ordered by preference
     */
    @LispMethod(comment = "@return a list of possible merged-column types, ordered by preference")
    public static SubLObject more_general_column_interps(final SubLObject column1_semantics, final SubLObject column2_semantics, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        SubLObject possible_results = NIL;
        final SubLObject column1_name = semantic_etl_bus.column_semantics_column_name(column1_semantics);
        final SubLObject column2_name = semantic_etl_bus.column_semantics_column_name(column2_semantics);
        if (column1_name.equal(column2_name)) {
            return $list31;
        }
        SubLObject cdolist_list_var = semantic_etl_bus.column_semantics_column_parses(column1_semantics);
        SubLObject column1_interp = NIL;
        column1_interp = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$11 = semantic_etl_bus.column_semantics_column_parses(column2_semantics);
            SubLObject column2_interp = NIL;
            column2_interp = cdolist_list_var_$11.first();
            while (NIL != cdolist_list_var_$11) {
                if (column1_interp.equal(column2_interp) && (NIL != allowable_merge_target_typeP(column1_interp, mt))) {
                    final SubLObject item_var = bq_cons(column1_interp, $list32);
                    if (NIL == member(item_var, possible_results, EQUAL, symbol_function(IDENTITY))) {
                        possible_results = cons(item_var, possible_results);
                    }
                } else
                    if ((NIL != genls.genlsP(column1_interp, column2_interp, mt, UNPROVIDED)) && (NIL != allowable_merge_target_typeP(column2_interp, mt))) {
                        final SubLObject item_var = bq_cons(column2_interp, $list33);
                        if (NIL == member(item_var, possible_results, EQUAL, symbol_function(IDENTITY))) {
                            possible_results = cons(item_var, possible_results);
                        }
                    } else
                        if ((NIL != genls.genlsP(column2_interp, column1_interp, mt, UNPROVIDED)) && (NIL != allowable_merge_target_typeP(column1_interp, mt))) {
                            final SubLObject item_var = bq_cons(column1_interp, $list33);
                            if (NIL == member(item_var, possible_results, EQUAL, symbol_function(IDENTITY))) {
                                possible_results = cons(item_var, possible_results);
                            }
                        }


                cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                column2_interp = cdolist_list_var_$11.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            column1_interp = cdolist_list_var.first();
        } 
        if ((NIL != find($GENLS, possible_results, EQ, SECOND, UNPROVIDED, UNPROVIDED)) && (NIL != find($EQUAL, possible_results, EQ, SECOND, UNPROVIDED, UNPROVIDED))) {
            possible_results = remove($GENLS, possible_results, EQ, SECOND, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return Sort.sort(possible_results, BETTER_COLUMN_MERGE_TARGET, UNPROVIDED);
    }

    public static final SubLObject allowable_merge_target_typeP_alt(SubLObject type, SubLObject mt) {
        return makeBoolean(NIL == member(type, com.cyc.cycjava.cycl.sksi.mapping_engine.date_genls(mt), EQUAL, UNPROVIDED));
    }

    public static SubLObject allowable_merge_target_typeP(final SubLObject type, final SubLObject mt) {
        return makeBoolean(NIL == member(type, date_genls(mt), EQUAL, UNPROVIDED));
    }

    public static final SubLObject clear_date_genls_alt() {
        {
            SubLObject cs = $date_genls_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_date_genls() {
        final SubLObject cs = $date_genls_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_date_genls_alt(SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($date_genls_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_date_genls(final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($date_genls_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject date_genls_internal_alt(SubLObject mt) {
        return genls.all_genls($$Date, mt, UNPROVIDED);
    }

    public static SubLObject date_genls_internal(final SubLObject mt) {
        return genls.all_genls($$Date, mt, UNPROVIDED);
    }

    public static final SubLObject date_genls_alt(SubLObject mt) {
        {
            SubLObject caching_state = $date_genls_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(DATE_GENLS, $date_genls_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, $kw39$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw39$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.mapping_engine.date_genls_internal(mt)));
                    memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject date_genls(final SubLObject mt) {
        SubLObject caching_state = $date_genls_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(DATE_GENLS, $date_genls_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(date_genls_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * returns T if obj1 is a better merge target than obj2
     */
    @LispMethod(comment = "returns T if obj1 is a better merge target than obj2")
    public static final SubLObject better_column_merge_target_alt(SubLObject obj1, SubLObject obj2) {
        {
            SubLObject term1_type = second(obj1);
            SubLObject term1_term = obj1.first();
            SubLObject term2_type = second(obj2);
            SubLObject term2_term = obj2.first();
            if ((term1_type == term2_type) || (term1_type == term2_type)) {
                return makeBoolean(NIL == cardinality_estimates.generality_estimateG(term1_term, term2_term));
            } else {
                if ((term1_type == $EQUAL) && (term2_type == $GENLS)) {
                    return T;
                } else {
                    return NIL;
                }
            }
        }
    }

    @LispMethod(comment = "returns T if obj1 is a better merge target than obj2")
    public static SubLObject better_column_merge_target(final SubLObject obj1, final SubLObject obj2) {
        final SubLObject term1_type = second(obj1);
        final SubLObject term1_term = obj1.first();
        final SubLObject term2_type = second(obj2);
        final SubLObject term2_term = obj2.first();
        if (term1_type.eql(term2_type) || term1_type.eql(term2_type)) {
            return makeBoolean(NIL == cardinality_estimates.generality_estimateG(term1_term, term2_term));
        }
        if ((term1_type == $EQUAL) && (term2_type == $GENLS)) {
            return T;
        }
        return NIL;
    }/**
     * returns T if obj1 is a better merge target than obj2
     */


    /**
     *
     *
     * @param COLUMN1
    column-semantics-p
     * 		
     * @param COLUMN2
    column-semantics-p
     * 		
     * @return listp; a list of the types that the combined column is likely to represent.  Each type is returned
    as a list, of the form (TYPE TF*IDF ...), where ... is optional and its content may vary.
    if NIL is returned, the columns are not considered mergeable.
     */
    @LispMethod(comment = "@param COLUMN1\ncolumn-semantics-p\r\n\t\t\r\n@param COLUMN2\ncolumn-semantics-p\r\n\t\t\r\n@return listp; a list of the types that the combined column is likely to represent.  Each type is returned\r\nas a list, of the form (TYPE TF*IDF ...), where ... is optional and its content may vary.\r\nif NIL is returned, the columns are not considered mergeable.")
    public static final SubLObject column_values_mergeable_as_alt(SubLObject column1, SubLObject column2, SubLObject coverage_minimum, SubLObject tf_idf_minimum, SubLObject mt) {
        if (coverage_minimum == UNPROVIDED) {
            coverage_minimum = $db_fusion_column_union_coverage_minumum$.getDynamicValue();
        }
        if (tf_idf_minimum == UNPROVIDED) {
            tf_idf_minimum = $db_fusion_column_union_tf_idf_minimum$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        {
            SubLObject column1_types = com.cyc.cycjava.cycl.sksi.mapping_engine.column_types_from_tfXidf(column1);
            SubLObject column2_types = com.cyc.cycjava.cycl.sksi.mapping_engine.column_types_from_tfXidf(column2);
            SubLObject combined_types = com.cyc.cycjava.cycl.sksi.mapping_engine.combined_column_types(column1, column2);
            SubLObject result = NIL;
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = combined_types;
                    SubLObject type_struct = NIL;
                    for (type_struct = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , type_struct = csome_list_var.first()) {
                        {
                            SubLObject type = type_struct.first();
                            SubLObject tfidf = second(type_struct);
                            if (tfidf.numGE(tf_idf_minimum)) {
                                if (NIL != data_parser.semantic_etl_irrelevant_termP(type)) {
                                    doneP = T;
                                } else {
                                    if ((((((((NIL != list_utilities.alist_lookup(column1_types, type, UNPROVIDED, UNPROVIDED).first()) && (NIL != list_utilities.alist_lookup(column2_types, type, UNPROVIDED, UNPROVIDED).first())) && list_utilities.alist_lookup(column1_types, type, UNPROVIDED, UNPROVIDED).first().numGE(tf_idf_minimum)) && list_utilities.alist_lookup(column2_types, type, UNPROVIDED, UNPROVIDED).first().numGE(tf_idf_minimum)) && (NIL != com.cyc.cycjava.cycl.sksi.mapping_engine.covers_at_least_proportion_of_columnP(type, column1, coverage_minimum))) && (NIL != com.cyc.cycjava.cycl.sksi.mapping_engine.covers_at_least_proportion_of_columnP(type, column2, coverage_minimum))) && (NIL == genls.genlsP(type, $$ScalarOrVectorInterval, mt, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.sksi.mapping_engine.allowable_merge_target_typeP(type, mt))) {
                                        result = cons(type_struct, result);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject temp_results = NIL;
                SubLObject cdolist_list_var = result;
                SubLObject result_item = NIL;
                for (result_item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result_item = cdolist_list_var.first()) {
                    temp_results = cons(list(result_item.first(), $GENLS, second(result_item)), temp_results);
                }
                return Sort.sort(temp_results, $sym43$_, THIRD);
            }
        }
    }

    /**
     *
     *
     * @param COLUMN1
    column-semantics-p
     * 		
     * @param COLUMN2
    column-semantics-p
     * 		
     * @return listp; a list of the types that the combined column is likely to represent.  Each type is returned
    as a list, of the form (TYPE TF*IDF ...), where ... is optional and its content may vary.
    if NIL is returned, the columns are not considered mergeable.
     */
    @LispMethod(comment = "@param COLUMN1\ncolumn-semantics-p\r\n\t\t\r\n@param COLUMN2\ncolumn-semantics-p\r\n\t\t\r\n@return listp; a list of the types that the combined column is likely to represent.  Each type is returned\r\nas a list, of the form (TYPE TF*IDF ...), where ... is optional and its content may vary.\r\nif NIL is returned, the columns are not considered mergeable.")
    public static SubLObject column_values_mergeable_as(final SubLObject column1, final SubLObject column2, SubLObject coverage_minimum, SubLObject tf_idf_minimum, SubLObject mt) {
        if (coverage_minimum == UNPROVIDED) {
            coverage_minimum = $db_fusion_column_union_coverage_minumum$.getDynamicValue();
        }
        if (tf_idf_minimum == UNPROVIDED) {
            tf_idf_minimum = $db_fusion_column_union_tf_idf_minimum$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLObject column1_types = column_types_from_tfXidf(column1);
        final SubLObject column2_types = column_types_from_tfXidf(column2);
        final SubLObject combined_types = combined_column_types(column1, column2);
        SubLObject result = NIL;
        SubLObject doneP = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = combined_types;
            SubLObject type_struct = NIL;
            type_struct = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                final SubLObject type = type_struct.first();
                final SubLObject tfidf = second(type_struct);
                if (tfidf.numGE(tf_idf_minimum)) {
                    if (NIL != data_parser.semantic_etl_irrelevant_termP(type)) {
                        doneP = T;
                    } else
                        if ((((((((NIL != list_utilities.alist_lookup(column1_types, type, UNPROVIDED, UNPROVIDED).first()) && (NIL != list_utilities.alist_lookup(column2_types, type, UNPROVIDED, UNPROVIDED).first())) && list_utilities.alist_lookup(column1_types, type, UNPROVIDED, UNPROVIDED).first().numGE(tf_idf_minimum)) && list_utilities.alist_lookup(column2_types, type, UNPROVIDED, UNPROVIDED).first().numGE(tf_idf_minimum)) && (NIL != covers_at_least_proportion_of_columnP(type, column1, coverage_minimum))) && (NIL != covers_at_least_proportion_of_columnP(type, column2, coverage_minimum))) && (NIL == genls.genlsP(type, $$ScalarOrVectorInterval, mt, UNPROVIDED))) && (NIL != allowable_merge_target_typeP(type, mt))) {
                            result = cons(type_struct, result);
                        }

                }
                csome_list_var = csome_list_var.rest();
                type_struct = csome_list_var.first();
            } 
        }
        SubLObject temp_results = NIL;
        SubLObject cdolist_list_var = result;
        SubLObject result_item = NIL;
        result_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            temp_results = cons(list(result_item.first(), $GENLS, second(result_item)), temp_results);
            cdolist_list_var = cdolist_list_var.rest();
            result_item = cdolist_list_var.first();
        } 
        return Sort.sort(temp_results, $sym42$_, THIRD);
    }

    /**
     * Returns the types that would be found if COLUMN-1 AND COLUMN-2 were merged into a single column
     *
     * @param COLUMN-1
    column-semantics-p
     * 		
     * @param COLUMN-2
    column-semantics-p
     * 		
     * @return listp of lists; each individual list is of the form (TERM TF*IDF ...), where the content
    denoted by ... may be arbitrary.  In other words, don't count on getting anything
    after the TF*IDF score, as the stuff after that may change, or be absent.
     */
    @LispMethod(comment = "Returns the types that would be found if COLUMN-1 AND COLUMN-2 were merged into a single column\r\n\r\n@param COLUMN-1\ncolumn-semantics-p\r\n\t\t\r\n@param COLUMN-2\ncolumn-semantics-p\r\n\t\t\r\n@return listp of lists; each individual list is of the form (TERM TF*IDF ...), where the content\r\ndenoted by ... may be arbitrary.  In other words, don\'t count on getting anything\r\nafter the TF*IDF score, as the stuff after that may change, or be absent.")
    public static final SubLObject combined_column_types_alt(SubLObject column_1, SubLObject column_2) {
        {
            SubLObject value_meanings = NIL;
            SubLObject cdolist_list_var = list(column_1, column_2);
            SubLObject column = NIL;
            for (column = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , column = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_12 = semantic_etl_bus.column_semantics_value_semantics_list(column);
                    SubLObject value = NIL;
                    for (value = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , value = cdolist_list_var_12.first()) {
                        value_meanings = cons(semantic_etl_bus.value_semantics_value_parses(value), value_meanings);
                    }
                }
            }
            return data_parser.best_types_ordered_by_tfXidf(value_meanings, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Returns the types that would be found if COLUMN-1 AND COLUMN-2 were merged into a single column\r\n\r\n@param COLUMN-1\n\t\tcolumn-semantics-p\r\n\t\t\r\n@param COLUMN-2\n\t\tcolumn-semantics-p\r\n\t\t\r\n@return listp of lists; each individual list is of the form (TERM TF*IDF ...), where the content\r\ndenoted by ... may be arbitrary.  In other words, don\'t count on getting anything\r\nafter the TF*IDF score, as the stuff after that may change, or be absent.")
    public static SubLObject combined_column_types(final SubLObject column_1, final SubLObject column_2) {
        SubLObject value_meanings = NIL;
        SubLObject cdolist_list_var = list(column_1, column_2);
        SubLObject column = NIL;
        column = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$12 = semantic_etl_bus.column_semantics_value_semantics_list(column);
            SubLObject value = NIL;
            value = cdolist_list_var_$12.first();
            while (NIL != cdolist_list_var_$12) {
                value_meanings = cons(semantic_etl_bus.value_semantics_value_parses(value), value_meanings);
                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                value = cdolist_list_var_$12.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            column = cdolist_list_var.first();
        } 
        return data_parser.best_types_ordered_by_tfXidf(value_meanings, UNPROVIDED);
    }/**
     * Returns the types that would be found if COLUMN-1 AND COLUMN-2 were merged into a single column
     *
     * @param COLUMN-1
    		column-semantics-p
     * 		
     * @param COLUMN-2
    		column-semantics-p
     * 		
     * @return listp of lists; each individual list is of the form (TERM TF*IDF ...), where the content
    denoted by ... may be arbitrary.  In other words, don't count on getting anything
    after the TF*IDF score, as the stuff after that may change, or be absent.
     */


    /**
     * Returns the types that are believed to best cover COLUMN, ordered by the strength of the coverage measure.
     *
     * @param COLUMN
    column-semantics-p
     * 		
     * @return listp of lists; each individual list is of the form (TERM TF*IDF ...), where the content
    denoted by ... may be arbitrary.  In other words, don't count on getting anything
    after the TF*IDF score, as the stuff after that may change, or be absent.
     */
    @LispMethod(comment = "Returns the types that are believed to best cover COLUMN, ordered by the strength of the coverage measure.\r\n\r\n@param COLUMN\ncolumn-semantics-p\r\n\t\t\r\n@return listp of lists; each individual list is of the form (TERM TF*IDF ...), where the content\r\ndenoted by ... may be arbitrary.  In other words, don\'t count on getting anything\r\nafter the TF*IDF score, as the stuff after that may change, or be absent.")
    public static final SubLObject column_types_from_tfXidf_alt(SubLObject column) {
        {
            SubLObject value_meanings = NIL;
            SubLObject cdolist_list_var = semantic_etl_bus.column_semantics_value_semantics_list(column);
            SubLObject value = NIL;
            for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                value_meanings = cons(semantic_etl_bus.value_semantics_value_parses(value), value_meanings);
            }
            return data_parser.best_types_ordered_by_tfXidf(value_meanings, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Returns the types that are believed to best cover COLUMN, ordered by the strength of the coverage measure.\r\n\r\n@param COLUMN\n\t\tcolumn-semantics-p\r\n\t\t\r\n@return listp of lists; each individual list is of the form (TERM TF*IDF ...), where the content\r\ndenoted by ... may be arbitrary.  In other words, don\'t count on getting anything\r\nafter the TF*IDF score, as the stuff after that may change, or be absent.")
    public static SubLObject column_types_from_tfXidf(final SubLObject column) {
        SubLObject value_meanings = NIL;
        SubLObject cdolist_list_var = semantic_etl_bus.column_semantics_value_semantics_list(column);
        SubLObject value = NIL;
        value = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            value_meanings = cons(semantic_etl_bus.value_semantics_value_parses(value), value_meanings);
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        } 
        return data_parser.best_types_ordered_by_tfXidf(value_meanings, UNPROVIDED);
    }/**
     * Returns the types that are believed to best cover COLUMN, ordered by the strength of the coverage measure.
     *
     * @param COLUMN
    		column-semantics-p
     * 		
     * @return listp of lists; each individual list is of the form (TERM TF*IDF ...), where the content
    denoted by ... may be arbitrary.  In other words, don't count on getting anything
    after the TF*IDF score, as the stuff after that may change, or be absent.
     */


    /**
     * Does TYPE cover at least MINUMUM-COVERAGE-PROPORTION of the values in COLUMN-SEMANTICS, as defined
     * by TYPE-COVERS-PROPORTION-OF-COLUMN
     *
     * @param TYPE
    collection-p
     * 		
     * @param COLUMN-SEMANTICS
    column-semantics-p
     * 		
     * @param MINIMUM-COVERAGE-PROPORTION
    numberp
     * 		
     * @return booleanp
     */
    @LispMethod(comment = "Does TYPE cover at least MINUMUM-COVERAGE-PROPORTION of the values in COLUMN-SEMANTICS, as defined\r\nby TYPE-COVERS-PROPORTION-OF-COLUMN\r\n\r\n@param TYPE\ncollection-p\r\n\t\t\r\n@param COLUMN-SEMANTICS\ncolumn-semantics-p\r\n\t\t\r\n@param MINIMUM-COVERAGE-PROPORTION\nnumberp\r\n\t\t\r\n@return booleanp\nDoes TYPE cover at least MINUMUM-COVERAGE-PROPORTION of the values in COLUMN-SEMANTICS, as defined\nby TYPE-COVERS-PROPORTION-OF-COLUMN")
    public static final SubLObject covers_at_least_proportion_of_columnP_alt(SubLObject type, SubLObject column_semantics, SubLObject minimum_coverage_proportion) {
        return numGE(com.cyc.cycjava.cycl.sksi.mapping_engine.type_covers_proportion_of_column(type, column_semantics), minimum_coverage_proportion);
    }

    @LispMethod(comment = "Does TYPE cover at least MINUMUM-COVERAGE-PROPORTION of the values in COLUMN-SEMANTICS, as defined\r\nby TYPE-COVERS-PROPORTION-OF-COLUMN\r\n\r\n@param TYPE\n\t\tcollection-p\r\n\t\t\r\n@param COLUMN-SEMANTICS\n\t\tcolumn-semantics-p\r\n\t\t\r\n@param MINIMUM-COVERAGE-PROPORTION\n\t\tnumberp\r\n\t\t\r\n@return booleanp\nDoes TYPE cover at least MINUMUM-COVERAGE-PROPORTION of the values in COLUMN-SEMANTICS, as defined\nby TYPE-COVERS-PROPORTION-OF-COLUMN")
    public static SubLObject covers_at_least_proportion_of_columnP(final SubLObject type, final SubLObject column_semantics, final SubLObject minimum_coverage_proportion) {
        return numGE(type_covers_proportion_of_column(type, column_semantics), minimum_coverage_proportion);
    }/**
     * Does TYPE cover at least MINUMUM-COVERAGE-PROPORTION of the values in COLUMN-SEMANTICS, as defined
     * by TYPE-COVERS-PROPORTION-OF-COLUMN
     *
     * @param TYPE
    		collection-p
     * 		
     * @param COLUMN-SEMANTICS
    		column-semantics-p
     * 		
     * @param MINIMUM-COVERAGE-PROPORTION
    		numberp
     * 		
     * @return booleanp
     */


    /**
     * What proportion of the values in COLUMN-SEMANTICS have at least one interpretation that is a spec of TYPE?
     *
     * @param TYPE
    collection-p
     * 		
     * @param COLUMN-SEMANTICS
    column-semantics-p
     * 		
     * @return numberp
     */
    @LispMethod(comment = "What proportion of the values in COLUMN-SEMANTICS have at least one interpretation that is a spec of TYPE?\r\n\r\n@param TYPE\ncollection-p\r\n\t\t\r\n@param COLUMN-SEMANTICS\ncolumn-semantics-p\r\n\t\t\r\n@return numberp")
    public static final SubLObject type_covers_proportion_of_column_alt(SubLObject type, SubLObject column_semantics) {
        {
            SubLObject covers = ZERO_INTEGER;
            SubLObject fails = ZERO_INTEGER;
            SubLObject cdolist_list_var = semantic_etl_bus.column_semantics_value_semantics_list(column_semantics);
            SubLObject value_semantics = NIL;
            for (value_semantics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value_semantics = cdolist_list_var.first()) {
                if (NIL != genls.any_specP(type, semantic_etl_bus.value_semantics_value_parses(value_semantics), UNPROVIDED, UNPROVIDED)) {
                    covers = add(covers, ONE_INTEGER);
                } else {
                    fails = add(fails, ONE_INTEGER);
                }
            }
            return divide(covers, add(covers, fails));
        }
    }

    @LispMethod(comment = "What proportion of the values in COLUMN-SEMANTICS have at least one interpretation that is a spec of TYPE?\r\n\r\n@param TYPE\n\t\tcollection-p\r\n\t\t\r\n@param COLUMN-SEMANTICS\n\t\tcolumn-semantics-p\r\n\t\t\r\n@return numberp")
    public static SubLObject type_covers_proportion_of_column(final SubLObject type, final SubLObject column_semantics) {
        SubLObject covers = ZERO_INTEGER;
        SubLObject fails = ZERO_INTEGER;
        SubLObject cdolist_list_var = semantic_etl_bus.column_semantics_value_semantics_list(column_semantics);
        SubLObject value_semantics = NIL;
        value_semantics = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != genls.any_specP(type, semantic_etl_bus.value_semantics_value_parses(value_semantics), UNPROVIDED, UNPROVIDED)) {
                covers = add(covers, ONE_INTEGER);
            } else {
                fails = add(fails, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            value_semantics = cdolist_list_var.first();
        } 
        return divide(covers, add(covers, fails));
    }/**
     * What proportion of the values in COLUMN-SEMANTICS have at least one interpretation that is a spec of TYPE?
     *
     * @param TYPE
    		collection-p
     * 		
     * @param COLUMN-SEMANTICS
    		column-semantics-p
     * 		
     * @return numberp
     */


    public static final SubLObject table_data_overlap_ratio_alt(SubLObject table_semantics_1, SubLObject table_semantics_2) {
        return nth_value_step_2(nth_value_step_1(ZERO_INTEGER), com.cyc.cycjava.cycl.sksi.mapping_engine.column_overlap_int(table_semantics_1, table_semantics_2));
    }

    public static SubLObject table_data_overlap_ratio(final SubLObject table_semantics_1, final SubLObject table_semantics_2) {
        return nth_value_step_2(nth_value_step_1(ZERO_INTEGER), column_overlap_int(table_semantics_1, table_semantics_2));
    }

    public static final SubLObject columns_with_best_overlap_alt(SubLObject table_semantics_1, SubLObject table_semantics_2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject max_overlap_ratio = com.cyc.cycjava.cycl.sksi.mapping_engine.column_overlap_int(table_semantics_1, table_semantics_2);
                SubLObject column_semantics_1 = thread.secondMultipleValue();
                SubLObject column_semantics_2 = thread.thirdMultipleValue();
                SubLObject justification = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                return values(column_semantics_1, column_semantics_2, justification);
            }
        }
    }

    public static SubLObject columns_with_best_overlap(final SubLObject table_semantics_1, final SubLObject table_semantics_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject max_overlap_ratio = column_overlap_int(table_semantics_1, table_semantics_2);
        final SubLObject column_semantics_1 = thread.secondMultipleValue();
        final SubLObject column_semantics_2 = thread.thirdMultipleValue();
        final SubLObject justification = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return values(column_semantics_1, column_semantics_2, justification);
    }

    public static final SubLObject column_overlap_int_alt(SubLObject table_semantics_1, SubLObject table_semantics_2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject max_overlap_ratio = ZERO_INTEGER;
                SubLObject best_column_semantics_1 = NIL;
                SubLObject best_column_semantics_2 = NIL;
                SubLObject best_justification = NIL;
                SubLObject cdolist_list_var = semantic_etl_bus.table_semantics_column_semantics_list(table_semantics_1);
                SubLObject column_semantics_1 = NIL;
                for (column_semantics_1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , column_semantics_1 = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_13 = semantic_etl_bus.table_semantics_column_semantics_list(table_semantics_2);
                        SubLObject column_semantics_2 = NIL;
                        for (column_semantics_2 = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , column_semantics_2 = cdolist_list_var_13.first()) {
                            thread.resetMultipleValues();
                            {
                                SubLObject column_overlap_ratio = com.cyc.cycjava.cycl.sksi.mapping_engine.column_data_overlap_ratio(column_semantics_1, column_semantics_2);
                                SubLObject justification = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (column_overlap_ratio.numG(max_overlap_ratio)) {
                                    max_overlap_ratio = column_overlap_ratio;
                                    best_column_semantics_1 = column_semantics_1;
                                    best_column_semantics_2 = column_semantics_2;
                                    best_justification = justification;
                                }
                            }
                        }
                    }
                }
                return values(max_overlap_ratio, best_column_semantics_1, best_column_semantics_2, best_justification);
            }
        }
    }

    public static SubLObject column_overlap_int(final SubLObject table_semantics_1, final SubLObject table_semantics_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject max_overlap_ratio = ZERO_INTEGER;
        SubLObject best_column_semantics_1 = NIL;
        SubLObject best_column_semantics_2 = NIL;
        SubLObject best_justification = NIL;
        SubLObject cdolist_list_var = semantic_etl_bus.table_semantics_column_semantics_list(table_semantics_1);
        SubLObject column_semantics_1 = NIL;
        column_semantics_1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$13 = semantic_etl_bus.table_semantics_column_semantics_list(table_semantics_2);
            SubLObject column_semantics_2 = NIL;
            column_semantics_2 = cdolist_list_var_$13.first();
            while (NIL != cdolist_list_var_$13) {
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
        return values(max_overlap_ratio, best_column_semantics_1, best_column_semantics_2, best_justification);
    }

    public static final SubLObject column_data_overlap_ratio_alt(SubLObject column_semantics_1, SubLObject column_semantics_2) {
        if ((NIL != com.cyc.cycjava.cycl.sksi.mapping_engine.contains_csP(column_semantics_1)) && (NIL != com.cyc.cycjava.cycl.sksi.mapping_engine.contains_csP(column_semantics_2))) {
            return values($float$0_67, list(list($$FieldOfStudy, $GENLS, $float$0_67)));
        } else {
            if ((NIL != com.cyc.cycjava.cycl.sksi.mapping_engine.contains_addison_wesleyP(column_semantics_1)) && (NIL != com.cyc.cycjava.cycl.sksi.mapping_engine.contains_addison_wesleyP(column_semantics_2))) {
                return values($float$0_33, list(list($$PublishingOrganization, $GENLS, $float$0_33)));
            } else {
                return ZERO_INTEGER;
            }
        }
    }

    public static SubLObject column_data_overlap_ratio(final SubLObject column_semantics_1, final SubLObject column_semantics_2) {
        if ((NIL != contains_csP(column_semantics_1)) && (NIL != contains_csP(column_semantics_2))) {
            return values($float$0_67, list(list($$FieldOfStudy, $GENLS, $float$0_67)));
        }
        if ((NIL != contains_addison_wesleyP(column_semantics_1)) && (NIL != contains_addison_wesleyP(column_semantics_2))) {
            return values($float$0_33, list(list($$PublishingOrganization, $GENLS, $float$0_33)));
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject contains_csP_alt(SubLObject column_semantics) {
        {
            SubLObject cdolist_list_var = semantic_etl_bus.column_semantics_value_semantics_list(column_semantics);
            SubLObject value_semantics = NIL;
            for (value_semantics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value_semantics = cdolist_list_var.first()) {
                {
                    SubLObject value = semantic_etl_bus.value_semantics_value(value_semantics);
                    if (value.equalp($$$CS)) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject contains_csP(final SubLObject column_semantics) {
        SubLObject cdolist_list_var = semantic_etl_bus.column_semantics_value_semantics_list(column_semantics);
        SubLObject value_semantics = NIL;
        value_semantics = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject value = semantic_etl_bus.value_semantics_value(value_semantics);
            if (value.equalp($$$CS)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value_semantics = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject contains_addison_wesleyP_alt(SubLObject column_semantics) {
        {
            SubLObject cdolist_list_var = semantic_etl_bus.column_semantics_value_semantics_list(column_semantics);
            SubLObject value_semantics = NIL;
            for (value_semantics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value_semantics = cdolist_list_var.first()) {
                {
                    SubLObject value = semantic_etl_bus.value_semantics_value(value_semantics);
                    if (value.equalp($str_alt50$Addison_Wesley)) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject contains_addison_wesleyP(final SubLObject column_semantics) {
        SubLObject cdolist_list_var = semantic_etl_bus.column_semantics_value_semantics_list(column_semantics);
        SubLObject value_semantics = NIL;
        value_semantics = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject value = semantic_etl_bus.value_semantics_value(value_semantics);
            if (value.equalp($str49$Addison_Wesley)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value_semantics = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * - add columns in KILL-COLUMN-SEMANTICS's table other than KILL-COLUMN-SEMANTICS to KEEP-COLUMN-SEMANTICS's table
     * - merge data of KILL-COLUMN-SEMANTICS into KEEP-COLUMN-SEMANTICS, joining on KILL-COLUMN-SEMANTCS, KEEP-COLUMN-SEMANTICS
     * - kill the table of KILL-COLUMN-SEMANTICS
     * example: kill topic table and merge its data into the keyword table. Join on keep-column, kill-column
     */
    @LispMethod(comment = "- add columns in KILL-COLUMN-SEMANTICS\'s table other than KILL-COLUMN-SEMANTICS to KEEP-COLUMN-SEMANTICS\'s table\r\n- merge data of KILL-COLUMN-SEMANTICS into KEEP-COLUMN-SEMANTICS, joining on KILL-COLUMN-SEMANTCS, KEEP-COLUMN-SEMANTICS\r\n- kill the table of KILL-COLUMN-SEMANTICS\r\nexample: kill topic table and merge its data into the keyword table. Join on keep-column, kill-column\n- add columns in KILL-COLUMN-SEMANTICS\'s table other than KILL-COLUMN-SEMANTICS to KEEP-COLUMN-SEMANTICS\'s table\n- merge data of KILL-COLUMN-SEMANTICS into KEEP-COLUMN-SEMANTICS, joining on KILL-COLUMN-SEMANTCS, KEEP-COLUMN-SEMANTICS\n- kill the table of KILL-COLUMN-SEMANTICS\nexample: kill topic table and merge its data into the keyword table. Join on keep-column, kill-column")
    public static final SubLObject merge_mappings_wrt_column_semantics_alt(SubLObject output_spec, SubLObject keep_column, SubLObject kill_column, SubLObject justification) {
        {
            SubLObject keep_table = semantic_etl_bus.c_semant_table_semantics(keep_column);
            SubLObject keep_table_name = semantic_etl_bus.t_semant_table_name(keep_table);
            SubLObject keep_column_name = semantic_etl_bus.c_semant_column_name(keep_column);
            SubLObject kill_table = semantic_etl_bus.c_semant_table_semantics(kill_column);
            SubLObject kill_table_name = semantic_etl_bus.t_semant_table_name(kill_table);
            SubLObject kill_column_name = semantic_etl_bus.c_semant_column_name(kill_column);
            SubLObject move_columns = semantic_etl_bus.uniquify_columns(keep_table, remove(kill_column, semantic_etl_bus.t_semant_column_semantics_list(kill_table), EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject new_kill_column_homes = NIL;
            SubLObject semantic_description = semantic_etl_bus.new_table_merger(list(keep_table, kill_table), keep_table, list(list(kill_column, keep_column, justification)));
            {
                SubLObject cdolist_list_var = move_columns;
                SubLObject column = NIL;
                for (column = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , column = cdolist_list_var.first()) {
                    {
                        SubLObject new_column_name = column.first();
                        SubLObject old_column_name = column.rest();
                        SubLObject old_column = semantic_etl_bus.table_semantics_get_column_named(kill_table, old_column_name);
                        semantic_etl_bus.output_spec_append_to_recipe(output_spec, semantic_etl_bus.new_sql_alter_table(keep_table_name, semantic_etl_bus.new_sql_add_column(new_column_name, semantic_etl_bus.column_semantics_column_type(old_column), semantic_etl_bus.column_semantics_column_size(old_column), UNPROVIDED)));
                        new_kill_column_homes = cons(list(keep_table_name, new_column_name, kill_table_name, old_column_name), new_kill_column_homes);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = move_columns;
                SubLObject column = NIL;
                for (column = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , column = cdolist_list_var.first()) {
                    semantic_etl_bus.output_spec_append_to_recipe(output_spec, semantic_etl_bus.new_sql_update(keep_table_name, list(semantic_etl_bus.new_sql_column_equal(keep_table_name, column.first(), kill_table_name, column.rest())), list(semantic_etl_bus.new_sql_column_equal(keep_table_name, keep_column_name, kill_table_name, kill_column_name))));
                }
            }
            {
                SubLObject inner_select = semantic_etl_bus.new_sql_select_from(list(keep_column_name), list(keep_table_name), NIL);
                SubLObject outer_select = semantic_etl_bus.new_sql_select_from(Mapping.mapcar(C_SEMANT_COLUMN_NAME, semantic_etl_bus.t_semant_column_semantics_list(kill_table)), list(kill_table_name), list(semantic_etl_bus.new_sql_not_in(kill_table_name, kill_column_name, inner_select)));
                SubLObject insert = semantic_etl_bus.new_sql_insert_into(keep_table_name, append(Mapping.mapcar(CAR, move_columns), list(keep_column_name)), outer_select);
                semantic_etl_bus.output_spec_append_to_recipe(output_spec, insert);
            }
            new_kill_column_homes = cons(list(keep_table_name, keep_column_name, kill_table_name, kill_column_name), new_kill_column_homes);
            {
                SubLObject cdolist_list_var = new_kill_column_homes;
                SubLObject entry = NIL;
                for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                    {
                        SubLObject target_table_name = entry.first();
                        SubLObject target_column_name = second(entry);
                        SubLObject source_table_name = third(entry);
                        SubLObject source_column_name = fourth(entry);
                        SubLObject source_table = semantic_etl_bus.semantics_get_table_named(semantic_etl_bus.db_output_spec_semantics(output_spec), source_table_name);
                        SubLObject source_column = semantic_etl_bus.table_semantics_get_column_named(source_table, source_column_name);
                        SubLObject cdolist_list_var_14 = semantic_etl_bus.column_semantics_referencing_foreign_key_constraints(source_column);
                        SubLObject constraint = NIL;
                        for (constraint = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , constraint = cdolist_list_var_14.first()) {
                            {
                                SubLObject constraint_name = semantic_etl_bus.foreign_key_constraint_constraint_name(constraint);
                                SubLObject constrained_column = semantic_etl_bus.foreign_key_constraint_constrained_column(constraint);
                                SubLObject constrained_column_name = semantic_etl_bus.c_semant_column_name(constrained_column);
                                SubLObject constrained_table = semantic_etl_bus.column_semantics_table_semantics(constrained_column);
                                SubLObject constrained_table_name = semantic_etl_bus.table_semantics_table_name(constrained_table);
                                SubLObject drop = semantic_etl_bus.new_sql_fk_column_constraint(constraint_name, constrained_table_name, constrained_column_name);
                                SubLObject table_constraint = semantic_etl_bus.new_sql_fk_table_constraint(constrained_column_name, drop);
                                {
                                    SubLObject drop_constraint = semantic_etl_bus.new_sql_drop_constraint(table_constraint);
                                    SubLObject alter_drop = semantic_etl_bus.new_sql_alter_table(constrained_table_name, drop_constraint);
                                    SubLObject new_constraint_name = semantic_etl_bus.new_foreign_key_constraint_name(constrained_table_name, constrained_column_name);
                                    SubLObject add = semantic_etl_bus.new_sql_fk_column_constraint(new_constraint_name, target_table_name, target_column_name);
                                    SubLObject table_constraint_15 = semantic_etl_bus.new_sql_fk_table_constraint(constrained_column_name, add);
                                    SubLObject add_constraint = semantic_etl_bus.new_sql_add_constraint(table_constraint_15);
                                    SubLObject alter_add = semantic_etl_bus.new_sql_alter_table(constrained_table_name, add_constraint);
                                    semantic_etl_bus.output_spec_append_to_recipe(output_spec, alter_drop);
                                    semantic_etl_bus.output_spec_append_to_recipe(output_spec, alter_add);
                                }
                            }
                        }
                    }
                }
            }
            semantic_etl_bus.output_spec_append_to_recipe(output_spec, semantic_etl_bus.new_sql_drop_table(kill_table_name));
            semantic_etl_bus.output_spec_append_to_semantic_recipe(output_spec, semantic_description);
            semantic_etl_bus.output_spec_synchronize(output_spec);
        }
        return output_spec;
    }

    @LispMethod(comment = "- add columns in KILL-COLUMN-SEMANTICS\'s table other than KILL-COLUMN-SEMANTICS to KEEP-COLUMN-SEMANTICS\'s table\r\n- merge data of KILL-COLUMN-SEMANTICS into KEEP-COLUMN-SEMANTICS, joining on KILL-COLUMN-SEMANTCS, KEEP-COLUMN-SEMANTICS\r\n- kill the table of KILL-COLUMN-SEMANTICS\r\nexample: kill topic table and merge its data into the keyword table. Join on keep-column, kill-column\n- add columns in KILL-COLUMN-SEMANTICS\'s table other than KILL-COLUMN-SEMANTICS to KEEP-COLUMN-SEMANTICS\'s table\n- merge data of KILL-COLUMN-SEMANTICS into KEEP-COLUMN-SEMANTICS, joining on KILL-COLUMN-SEMANTCS, KEEP-COLUMN-SEMANTICS\n- kill the table of KILL-COLUMN-SEMANTICS\nexample: kill topic table and merge its data into the keyword table. Join on keep-column, kill-column")
    public static SubLObject merge_mappings_wrt_column_semantics(final SubLObject output_spec, final SubLObject keep_column, final SubLObject kill_column, final SubLObject justification) {
        final SubLObject keep_table = semantic_etl_bus.c_semant_table_semantics(keep_column);
        final SubLObject keep_table_name = semantic_etl_bus.t_semant_table_name(keep_table);
        final SubLObject keep_column_name = semantic_etl_bus.c_semant_column_name(keep_column);
        final SubLObject kill_table = semantic_etl_bus.c_semant_table_semantics(kill_column);
        final SubLObject kill_table_name = semantic_etl_bus.t_semant_table_name(kill_table);
        final SubLObject kill_column_name = semantic_etl_bus.c_semant_column_name(kill_column);
        final SubLObject move_columns = semantic_etl_bus.uniquify_columns(keep_table, remove(kill_column, semantic_etl_bus.t_semant_column_semantics_list(kill_table), EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject new_kill_column_homes = NIL;
        final SubLObject semantic_description = semantic_etl_bus.new_table_merger(list(keep_table, kill_table), keep_table, list(list(kill_column, keep_column, justification)));
        SubLObject cdolist_list_var = move_columns;
        SubLObject column = NIL;
        column = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject new_column_name = column.first();
            final SubLObject old_column_name = column.rest();
            final SubLObject old_column = semantic_etl_bus.table_semantics_get_column_named(kill_table, old_column_name);
            semantic_etl_bus.output_spec_append_to_recipe(output_spec, semantic_etl_bus.new_sql_alter_table(keep_table_name, semantic_etl_bus.new_sql_add_column(new_column_name, semantic_etl_bus.column_semantics_column_type(old_column), semantic_etl_bus.column_semantics_column_size(old_column), UNPROVIDED)));
            new_kill_column_homes = cons(list(keep_table_name, new_column_name, kill_table_name, old_column_name), new_kill_column_homes);
            cdolist_list_var = cdolist_list_var.rest();
            column = cdolist_list_var.first();
        } 
        cdolist_list_var = move_columns;
        column = NIL;
        column = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            semantic_etl_bus.output_spec_append_to_recipe(output_spec, semantic_etl_bus.new_sql_update(keep_table_name, list(semantic_etl_bus.new_sql_column_equal(keep_table_name, column.first(), kill_table_name, column.rest())), list(semantic_etl_bus.new_sql_column_equal(keep_table_name, keep_column_name, kill_table_name, kill_column_name))));
            cdolist_list_var = cdolist_list_var.rest();
            column = cdolist_list_var.first();
        } 
        final SubLObject inner_select = semantic_etl_bus.new_sql_select_from(list(keep_column_name), list(keep_table_name), NIL);
        final SubLObject outer_select = semantic_etl_bus.new_sql_select_from(Mapping.mapcar(C_SEMANT_COLUMN_NAME, semantic_etl_bus.t_semant_column_semantics_list(kill_table)), list(kill_table_name), list(semantic_etl_bus.new_sql_not_in(kill_table_name, kill_column_name, inner_select)));
        final SubLObject insert = semantic_etl_bus.new_sql_insert_into(keep_table_name, append(Mapping.mapcar(CAR, move_columns), list(keep_column_name)), outer_select);
        semantic_etl_bus.output_spec_append_to_recipe(output_spec, insert);
        new_kill_column_homes = cdolist_list_var = cons(list(keep_table_name, keep_column_name, kill_table_name, kill_column_name), new_kill_column_homes);
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject target_table_name = entry.first();
            final SubLObject target_column_name = second(entry);
            final SubLObject source_table_name = third(entry);
            final SubLObject source_column_name = fourth(entry);
            final SubLObject source_table = semantic_etl_bus.semantics_get_table_named(semantic_etl_bus.db_output_spec_semantics(output_spec), source_table_name);
            final SubLObject source_column = semantic_etl_bus.table_semantics_get_column_named(source_table, source_column_name);
            SubLObject cdolist_list_var_$14 = semantic_etl_bus.column_semantics_referencing_foreign_key_constraints(source_column);
            SubLObject constraint = NIL;
            constraint = cdolist_list_var_$14.first();
            while (NIL != cdolist_list_var_$14) {
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
    }/**
     * - add columns in KILL-COLUMN-SEMANTICS's table other than KILL-COLUMN-SEMANTICS to KEEP-COLUMN-SEMANTICS's table
     * - merge data of KILL-COLUMN-SEMANTICS into KEEP-COLUMN-SEMANTICS, joining on KILL-COLUMN-SEMANTCS, KEEP-COLUMN-SEMANTICS
     * - kill the table of KILL-COLUMN-SEMANTICS
     * example: kill topic table and merge its data into the keyword table. Join on keep-column, kill-column
     */


    /**
     * FROM-TABLE = kill-table (Employees), TO-TABLE = keep-table (s_emp)
     * go through the correspondence list to find columns in TO-TABLE that have a foreign key constraint to another non-id column
     * table. Then populate the newly found constraining table with the data from FROM-TABLE
     */
    @LispMethod(comment = "FROM-TABLE = kill-table (Employees), TO-TABLE = keep-table (s_emp)\r\ngo through the correspondence list to find columns in TO-TABLE that have a foreign key constraint to another non-id column\r\ntable. Then populate the newly found constraining table with the data from FROM-TABLE\nFROM-TABLE = kill-table (Employees), TO-TABLE = keep-table (s_emp)\ngo through the correspondence list to find columns in TO-TABLE that have a foreign key constraint to another non-id column\ntable. Then populate the newly found constraining table with the data from FROM-TABLE")
    public static final SubLObject copy_data_to_table_referenced_by_foreign_key_alt(SubLObject from_table, SubLObject to_table, SubLObject column_correspondence_list) {
        {
            SubLObject commands = NIL;
            SubLObject cdolist_list_var = column_correspondence_list;
            SubLObject column_correspondence = NIL;
            for (column_correspondence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , column_correspondence = cdolist_list_var.first()) {
                {
                    SubLObject datum = column_correspondence;
                    SubLObject current = datum;
                    SubLObject from_column = NIL;
                    SubLObject to_column = NIL;
                    SubLObject justification = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt53);
                    from_column = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt53);
                    to_column = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt53);
                    justification = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if ((NIL != semantic_etl_bus.column_semantics_foreign_key_constraint(to_column)) && (NIL == semantic_etl_bus.column_semantics_foreign_key_constraint(from_column))) {
                            {
                                SubLObject constraining_column = semantic_etl_bus.column_semantics_foreign_key_constraint_constraining_column(to_column);
                                SubLObject constraining_table = semantic_etl_bus.column_semantics_table_semantics(constraining_column);
                                SubLObject content_columns = semantic_etl_bus.table_semantics_content_columns(constraining_table);
                                if ((NIL != list_utilities.lengthE(content_columns, ONE_INTEGER, UNPROVIDED)) && (content_columns.first() == constraining_column)) {
                                    {
                                        SubLObject from_column_name = semantic_etl_bus.column_semantics_column_name(from_column);
                                        SubLObject from_table_name = semantic_etl_bus.table_semantics_table_name(from_table);
                                        SubLObject constraining_column_name = semantic_etl_bus.column_semantics_column_name(constraining_column);
                                        SubLObject constraining_table_name = semantic_etl_bus.table_semantics_table_name(constraining_table);
                                        SubLObject select1 = semantic_etl_bus.new_sql_select_from(list(from_column_name), list(from_table_name), NIL);
                                        SubLObject select2 = semantic_etl_bus.new_sql_select_from(list(constraining_column_name), list(constraining_table_name), NIL);
                                        SubLObject except = semantic_etl_bus.new_sql_except(select1, select2);
                                        SubLObject insert = semantic_etl_bus.new_sql_insert_into(constraining_table_name, list(constraining_column_name), except);
                                        commands = cons(insert, commands);
                                    }
                                } else {
                                    Errors.error($str_alt54$Need_to_move_data_to__A_to_satisf, constraining_column);
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt53);
                    }
                }
            }
            return commands;
        }
    }

    @LispMethod(comment = "FROM-TABLE = kill-table (Employees), TO-TABLE = keep-table (s_emp)\r\ngo through the correspondence list to find columns in TO-TABLE that have a foreign key constraint to another non-id column\r\ntable. Then populate the newly found constraining table with the data from FROM-TABLE\nFROM-TABLE = kill-table (Employees), TO-TABLE = keep-table (s_emp)\ngo through the correspondence list to find columns in TO-TABLE that have a foreign key constraint to another non-id column\ntable. Then populate the newly found constraining table with the data from FROM-TABLE")
    public static SubLObject copy_data_to_table_referenced_by_foreign_key(final SubLObject from_table, final SubLObject to_table, final SubLObject column_correspondence_list) {
        SubLObject commands = NIL;
        SubLObject cdolist_list_var = column_correspondence_list;
        SubLObject column_correspondence = NIL;
        column_correspondence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = column_correspondence;
            SubLObject from_column = NIL;
            SubLObject to_column = NIL;
            SubLObject justification = NIL;
            destructuring_bind_must_consp(current, datum, $list52);
            from_column = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list52);
            to_column = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list52);
            justification = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((NIL != semantic_etl_bus.column_semantics_foreign_key_constraint(to_column)) && (NIL == semantic_etl_bus.column_semantics_foreign_key_constraint(from_column))) {
                    final SubLObject constraining_column = semantic_etl_bus.column_semantics_foreign_key_constraint_constraining_column(to_column);
                    final SubLObject constraining_table = semantic_etl_bus.column_semantics_table_semantics(constraining_column);
                    final SubLObject content_columns = semantic_etl_bus.table_semantics_content_columns(constraining_table);
                    if ((NIL != list_utilities.lengthE(content_columns, ONE_INTEGER, UNPROVIDED)) && content_columns.first().eql(constraining_column)) {
                        final SubLObject from_column_name = semantic_etl_bus.column_semantics_column_name(from_column);
                        final SubLObject from_table_name = semantic_etl_bus.table_semantics_table_name(from_table);
                        final SubLObject constraining_column_name = semantic_etl_bus.column_semantics_column_name(constraining_column);
                        final SubLObject constraining_table_name = semantic_etl_bus.table_semantics_table_name(constraining_table);
                        final SubLObject select1 = semantic_etl_bus.new_sql_select_from(list(from_column_name), list(from_table_name), NIL);
                        final SubLObject select2 = semantic_etl_bus.new_sql_select_from(list(constraining_column_name), list(constraining_table_name), NIL);
                        final SubLObject except = semantic_etl_bus.new_sql_except(select1, select2);
                        final SubLObject insert = semantic_etl_bus.new_sql_insert_into(constraining_table_name, list(constraining_column_name), except);
                        commands = cons(insert, commands);
                    } else {
                        Errors.error($str53$Need_to_move_data_to__A_to_satisf, constraining_column);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list52);
            }
            cdolist_list_var = cdolist_list_var.rest();
            column_correspondence = cdolist_list_var.first();
        } 
        return commands;
    }/**
     * FROM-TABLE = kill-table (Employees), TO-TABLE = keep-table (s_emp)
     * go through the correspondence list to find columns in TO-TABLE that have a foreign key constraint to another non-id column
     * table. Then populate the newly found constraining table with the data from FROM-TABLE
     */


    public static SubLObject declare_mapping_engine_file() {
        declareFunction("semantic_etl_compute_output_spec", "SEMANTIC-ETL-COMPUTE-OUTPUT-SPEC", 3, 1, false);
        declareFunction("semantic_etl_improve_output_spec_external", "SEMANTIC-ETL-IMPROVE-OUTPUT-SPEC-EXTERNAL", 1, 0, false);
        declareFunction("semantic_etl_improve_output_spec", "SEMANTIC-ETL-IMPROVE-OUTPUT-SPEC", 1, 0, false);
        declareFunction("refined_output_spec_abstract_out_common_column", "REFINED-OUTPUT-SPEC-ABSTRACT-OUT-COMMON-COLUMN", 3, 0, false);
        declareFunction("merge_columns_by_foreign_key", "MERGE-COLUMNS-BY-FOREIGN-KEY", 5, 0, false);
        declareFunction("refined_output_spec_based_on_possible_genl_tables", "REFINED-OUTPUT-SPEC-BASED-ON-POSSIBLE-GENL-TABLES", 3, 0, false);
        declareFunction("refined_output_spec_outwards_based_on_possible_genl_tables", "REFINED-OUTPUT-SPEC-OUTWARDS-BASED-ON-POSSIBLE-GENL-TABLES", 3, 0, false);
        declareFunction("refined_output_spec_merge_equivalent_tables", "REFINED-OUTPUT-SPEC-MERGE-EQUIVALENT-TABLES", 3, 0, false);
        declareFunction("columns_have_same_foreign_key_constraints", "COLUMNS-HAVE-SAME-FOREIGN-KEY-CONSTRAINTS", 1, 0, false);
        declareFunction("find_column_correspondences", "FIND-COLUMN-CORRESPONDENCES", 2, 0, false);
        declareFunction("unambiguous_from_column", "UNAMBIGUOUS-FROM-COLUMN", 1, 0, false);
        declareFunction("possible_correspondences_contains_equal_justification", "POSSIBLE-CORRESPONDENCES-CONTAINS-EQUAL-JUSTIFICATION", 1, 0, false);
        declareFunction("possible_correspondence_contains_equal_justification", "POSSIBLE-CORRESPONDENCE-CONTAINS-EQUAL-JUSTIFICATION", 1, 0, false);
        declareFunction("first_third_generality_estimate", "FIRST-THIRD-GENERALITY-ESTIMATE", 1, 0, false);
        declareFunction("get_new_column_correspondence_list", "GET-NEW-COLUMN-CORRESPONDENCE-LIST", 3, 0, false);
        declareFunction("merge_tables", "MERGE-TABLES", 4, 0, false);
        declareFunction("extract_added_column", "EXTRACT-ADDED-COLUMN", 1, 0, false);
        declareFunction("augment_correspondence_list_with_new_columns", "AUGMENT-CORRESPONDENCE-LIST-WITH-NEW-COLUMNS", 4, 0, false);
        declareFunction("add_new_columns", "ADD-NEW-COLUMNS", 3, 0, false);
        declareFunction("copy_non_unifiable_data", "COPY-NON-UNIFIABLE-DATA", 3, 0, false);
        declareFunction("copy_unifiable_data", "COPY-UNIFIABLE-DATA", 3, 0, false);
        declareFunction("select_for_corresponding_columns", "SELECT-FOR-CORRESPONDING-COLUMNS", 3, 0, false);
        declareFunction("column_names_with_correspondences_substituted", "COLUMN-NAMES-WITH-CORRESPONDENCES-SUBSTITUTED", 3, 0, false);
        declareFunction("columns_with_correspondences_substituted", "COLUMNS-WITH-CORRESPONDENCES-SUBSTITUTED", 3, 0, false);
        declareFunction("create_correspondence_equal_or_null", "CREATE-CORRESPONDENCE-EQUAL-OR-NULL", 3, 0, false);
        declareFunction("create_non_corresponding_insert_setting", "CREATE-NON-CORRESPONDING-INSERT-SETTING", 3, 0, false);
        declareFunction("update_fkey_constraints_and_values", "UPDATE-FKEY-CONSTRAINTS-AND-VALUES", 3, 0, false);
        declareFunction("column_names_from_correspondence_list", "COLUMN-NAMES-FROM-CORRESPONDENCE-LIST", 2, 0, false);
        declareFunction("columns_from_correspondence_list", "COLUMNS-FROM-CORRESPONDENCE-LIST", 2, 0, false);
        declareFunction("select_all_from_table", "SELECT-ALL-FROM-TABLE", 1, 0, false);
        declareFunction("possibly_debug_refine_output_spec_outwards_based_on_possible_genl_tables", "POSSIBLY-DEBUG-REFINE-OUTPUT-SPEC-OUTWARDS-BASED-ON-POSSIBLE-GENL-TABLES", 8, 0, false);
        declareFunction("semantic_etl_compute_possible_table_id_pairs", "SEMANTIC-ETL-COMPUTE-POSSIBLE-TABLE-ID-PAIRS", 1, 0, false);
        declareFunction("link_tableP", "LINK-TABLE?", 1, 0, false);
        declareFunction("more_specific_table_semantics", "MORE-SPECIFIC-TABLE-SEMANTICS", 2, 0, false);
        declareFunction("tables_mergeable_into", "TABLES-MERGEABLE-INTO", 2, 1, false);
        declareFunction("table_with_more_constraints", "TABLE-WITH-MORE-CONSTRAINTS", 2, 0, false);
        declareFunction("columns_mergeable_as", "COLUMNS-MERGEABLE-AS", 2, 1, false);
        declareFunction("more_general_column_interps", "MORE-GENERAL-COLUMN-INTERPS", 2, 1, false);
        declareFunction("allowable_merge_target_typeP", "ALLOWABLE-MERGE-TARGET-TYPE?", 2, 0, false);
        declareFunction("clear_date_genls", "CLEAR-DATE-GENLS", 0, 0, false);
        declareFunction("remove_date_genls", "REMOVE-DATE-GENLS", 1, 0, false);
        declareFunction("date_genls_internal", "DATE-GENLS-INTERNAL", 1, 0, false);
        declareFunction("date_genls", "DATE-GENLS", 1, 0, false);
        declareFunction("better_column_merge_target", "BETTER-COLUMN-MERGE-TARGET", 2, 0, false);
        declareFunction("column_values_mergeable_as", "COLUMN-VALUES-MERGEABLE-AS", 2, 3, false);
        declareFunction("combined_column_types", "COMBINED-COLUMN-TYPES", 2, 0, false);
        declareFunction("column_types_from_tfXidf", "COLUMN-TYPES-FROM-TF.IDF", 1, 0, false);
        declareFunction("covers_at_least_proportion_of_columnP", "COVERS-AT-LEAST-PROPORTION-OF-COLUMN?", 3, 0, false);
        declareFunction("type_covers_proportion_of_column", "TYPE-COVERS-PROPORTION-OF-COLUMN", 2, 0, false);
        declareFunction("table_data_overlap_ratio", "TABLE-DATA-OVERLAP-RATIO", 2, 0, false);
        declareFunction("columns_with_best_overlap", "COLUMNS-WITH-BEST-OVERLAP", 2, 0, false);
        declareFunction("column_overlap_int", "COLUMN-OVERLAP-INT", 2, 0, false);
        declareFunction("column_data_overlap_ratio", "COLUMN-DATA-OVERLAP-RATIO", 2, 0, false);
        declareFunction("contains_csP", "CONTAINS-CS?", 1, 0, false);
        declareFunction("contains_addison_wesleyP", "CONTAINS-ADDISON-WESLEY?", 1, 0, false);
        declareFunction("merge_mappings_wrt_column_semantics", "MERGE-MAPPINGS-WRT-COLUMN-SEMANTICS", 4, 0, false);
        declareFunction("copy_data_to_table_referenced_by_foreign_key", "COPY-DATA-TO-TABLE-REFERENCED-BY-FOREIGN-KEY", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_mapping_engine_file() {
        defparameter("*SEMANTIC-ETL-TABLE-MERGE-METHODS*", $list1);
        deflexical("*DATE-GENLS-CACHING-STATE*", NIL);
        defparameter("*DB-FUSION-COLUMN-UNION-COVERAGE-MINUMUM*", $float$0_6);
        defparameter("*DB-FUSION-COLUMN-UNION-TF-IDF-MINIMUM*", $float$0_15);
        return NIL;
    }

    public static SubLObject setup_mapping_engine_file() {
        register_external_symbol(SEMANTIC_ETL_IMPROVE_OUTPUT_SPEC_EXTERNAL);
        memoization_state.note_globally_cached_function(DATE_GENLS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_mapping_engine_file();
    }

    @Override
    public void initializeVariables() {
        init_mapping_engine_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_mapping_engine_file();
    }

    static {
    }

    static private final SubLList $list_alt1 = list(makeSymbol("REFINED-OUTPUT-SPEC-ABSTRACT-OUT-COMMON-COLUMN"), makeSymbol("REFINED-OUTPUT-SPEC-BASED-ON-POSSIBLE-GENL-TABLES"), makeSymbol("REFINED-OUTPUT-SPEC-OUTWARDS-BASED-ON-POSSIBLE-GENL-TABLES"), makeSymbol("REFINED-OUTPUT-SPEC-MERGE-EQUIVALENT-TABLES"));

    static private final SubLString $str_alt3$not_exactly_two_databases__a_in_o = makeString("not exactly two databases ~a in output-spec");

    static private final SubLString $str_alt4$_id = makeString("_id");

    static private final SubLList $list_alt6 = list(makeSymbol("TABLE1-ID"), makeSymbol("TABLE2-ID"));

    static private final SubLList $list_alt8 = list(makeSymbol("FROM-COL"), makeSymbol("TO-COL"), makeSymbol("TYPE"));

    static private final SubLList $list_alt15 = list(makeSymbol("TABLE1-COLUMN"), makeSymbol("TABLE2-COLUMN"), makeSymbol("COLUMN-TYPE"));

    static private final SubLString $str_alt22$NEW_TABLE_NAME = makeString("NEW_TABLE_NAME");

    static private final SubLList $list_alt24 = list(makeSymbol("COL-1"), makeSymbol("COL-2"), makeSymbol("TYPE"));

    static private final SubLList $list_alt25 = list(makeSymbol("TABLE-1-COL"), makeSymbol("TABLE-2-COL"), makeSymbol("TYPE"));

    static private final SubLString $str_alt27$new_ = makeString("new_");

    static private final SubLString $str_alt28$___genls____a____a____linkTables_ = makeString("\n (genls\n  ~a\n  ~a)\n (linkTables\n  ~a\n  ~a)\n (mergingTables\n  ~a\n  ~a)\n (mergingColumns\n  ~a\n  ~a)");

    static private final SubLString $str_alt29$More_than_two_source_databases_in = makeString("More than two source databases in mapping table ~a");

    static private final SubLList $list_alt31 = list(list(reader_make_constant_shell("equals"), makeKeyword("EQUAL"), makeKeyword("UNKNOWN-WEIGHT")));

    static private final SubLList $list_alt32 = list(makeKeyword("EQUAL"), makeKeyword("UNKNOWN-WEIGHT"));

    static private final SubLList $list_alt33 = list(makeKeyword("GENLS"), makeKeyword("UNKNOWN-WEIGHT"));

    public static final SubLSymbol $kw39$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym43$_ = makeSymbol(">");

    static private final SubLString $str_alt50$Addison_Wesley = makeString("Addison-Wesley");

    static private final SubLList $list_alt53 = list(makeSymbol("FROM-COLUMN"), makeSymbol("TO-COLUMN"), makeSymbol("JUSTIFICATION"));

    static private final SubLString $str_alt54$Need_to_move_data_to__A_to_satisf = makeString("Need to move data to ~A to satisfy foreign-key constraints, but can't figure out which column to move it to.");
}

/**
 * Total time: 358 ms
 */
