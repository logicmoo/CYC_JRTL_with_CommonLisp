/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.list_utilities.*;
import static com.cyc.cycjava.cycl.sksi.semantic_etl_bus.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      DATA-PARSER
 * source file: /cyc/top/cycl/sksi/data-parser.lisp
 * created:     2019/07/03 17:38:34
 */
public final class data_parser extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt48$ = makeString("");

    public static final SubLFile me = new data_parser();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.data_parser";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $data_parser_row_sampling_limit$ = makeSymbol("*DATA-PARSER-ROW-SAMPLING-LIMIT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $bottom_of_upper_ontology$ = makeSymbol("*BOTTOM-OF-UPPER-ONTOLOGY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $bottom_of_upper_ontology_generality_estimate$ = makeSymbol("*BOTTOM-OF-UPPER-ONTOLOGY-GENERALITY-ESTIMATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $semantic_etl_upper_ontology_termP_caching_state$ = makeSymbol("*SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?-CACHING-STATE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $etl_data_lexicon$ = makeSymbol("*ETL-DATA-LEXICON*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $etl_metadata_lexicon$ = makeSymbol("*ETL-METADATA-LEXICON*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $etl_data_filter_spec$ = makeSymbol("*ETL-DATA-FILTER-SPEC*");

    private static final SubLSymbol SEMANTICS_P = makeSymbol("SEMANTICS-P");

    static private final SubLString $str2$Problem_opening_connection_to_dat = makeString("Problem opening connection to database ~s");

    static private final SubLString $str3$select___from_ = makeString("select * from ");

    static private final SubLString $$$_LIMIT_ = makeString(" LIMIT ");

    static private final SubLString $str5$_ = makeString(";");

    private static final SubLString $str6$Expected__a_columns_but_got_a_row = makeString("Expected ~a columns but got a row with ~a columns: ~s");

    private static final SubLString $$$bool = makeString("bool");

    private static final SubLString $$$f = makeString("f");

    private static final SubLString $$$t = makeString("t");

    private static final SubLSymbol SEMANTIC_ETL_PARSE_VALUE_INT = makeSymbol("SEMANTIC-ETL-PARSE-VALUE-INT");



    private static final SubLSymbol $sym14$SEMANTIC_ETL_IRRELEVANT_TERM_ = makeSymbol("SEMANTIC-ETL-IRRELEVANT-TERM?");

    private static final SubLSymbol SEMANTIC_ETL_ALL_ISA = makeSymbol("SEMANTIC-ETL-ALL-ISA");





    private static final SubLSymbol $sym19$SEMANTIC_ETL_UPPER_ONTOLOGY_TERM_ = makeSymbol("SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?");

    private static final SubLSymbol $sym20$_SEMANTIC_ETL_UPPER_ONTOLOGY_TERM__CACHING_STATE_ = makeSymbol("*SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?-CACHING-STATE*");

    private static final SubLInteger $int$100000 = makeInteger(100000);

    private static final SubLList $list22 = list(reader_make_constant_shell("ConceptFilterSpecificationFn"), reader_make_constant_shell("TaxonomyOfEasilyUnderstandableConcepts"), reader_make_constant_shell("ConceptOnlyFilterParameter"), reader_make_constant_shell("TriggerFromConcept"));

    private static final SubLSymbol SIMPLE_DATE_FROM_STRING_LEARN = makeSymbol("SIMPLE-DATE-FROM-STRING-LEARN");



















    private static final SubLString $$$DBFusionLexicalMt = makeString("DBFusionLexicalMt");



    private static final SubLString $str46$ = makeString("");

    private static final SubLSymbol $sym48$_ = makeSymbol(">");

    private static final SubLSymbol DATA_PARSER_ALL_GENLS = makeSymbol("DATA-PARSER-ALL-GENLS");

    private static final SubLSymbol $data_parser_all_genls_caching_state$ = makeSymbol("*DATA-PARSER-ALL-GENLS-CACHING-STATE*");

    private static final SubLInteger $int$5000 = makeInteger(5000);

    private static final SubLSymbol CLEAR_DATA_PARSER_ALL_GENLS = makeSymbol("CLEAR-DATA-PARSER-ALL-GENLS");

    private static final SubLSymbol DATA_PARSER_ALL_ISA = makeSymbol("DATA-PARSER-ALL-ISA");

    private static final SubLSymbol $data_parser_all_isa_caching_state$ = makeSymbol("*DATA-PARSER-ALL-ISA-CACHING-STATE*");

    private static final SubLSymbol CLEAR_DATA_PARSER_ALL_ISA = makeSymbol("CLEAR-DATA-PARSER-ALL-ISA");

    private static final SubLSymbol ETL_PARSE_VALUE = makeSymbol("ETL-PARSE-VALUE");

    /**
     *
     *
     * @param ACCESS-PATHS
     * 		list of access-path-p; a list of specifications for accessing external databases.
     * @param SEMANTICS-LIST
     * 		list of semantics-p; assumed to have already been generated by the Metadata Parser.
     * 		Assumes that ACCESS-PATHS and SEMANTICS-LIST are assumed to be aligned.
     * 		The Data Parser refines SEMANTICS-LIST by gathering more data (a sample of the actual cell contents)
     * 		from ACCESS-PATHS and integrating this new information with SEMANTICS-LIST.
     * @return list of semantics-p; an augmented version of SEMANTICS-LIST.
    In particular, it is augmented by adding VALUE-SEMANTICS objects.
     */
    @LispMethod(comment = "@param ACCESS-PATHS\r\n\t\tlist of access-path-p; a list of specifications for accessing external databases.\r\n@param SEMANTICS-LIST\r\n\t\tlist of semantics-p; assumed to have already been generated by the Metadata Parser.\r\n\t\tAssumes that ACCESS-PATHS and SEMANTICS-LIST are assumed to be aligned.\r\n\t\tThe Data Parser refines SEMANTICS-LIST by gathering more data (a sample of the actual cell contents)\r\n\t\tfrom ACCESS-PATHS and integrating this new information with SEMANTICS-LIST.\r\n@return list of semantics-p; an augmented version of SEMANTICS-LIST.\r\nIn particular, it is augmented by adding VALUE-SEMANTICS objects.")
    public static final SubLObject semantic_etl_parse_data_alt(SubLObject access_paths, SubLObject semantics_list) {
        {
            SubLObject list_var = semantics_list;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, SEMANTICS_P);
                }
            }
        }
        return com.cyc.cycjava.cycl.sksi.data_parser.semantic_etl_add_data_list(com.cyc.cycjava.cycl.sksi.data_parser.semantic_etl_acquire_data_list(access_paths, semantics_list), semantics_list, UNPROVIDED);
    }

    /**
     *
     *
     * @param ACCESS-PATHS
     * 		list of access-path-p; a list of specifications for accessing external databases.
     * @param SEMANTICS-LIST
     * 		list of semantics-p; assumed to have already been generated by the Metadata Parser.
     * 		Assumes that ACCESS-PATHS and SEMANTICS-LIST are assumed to be aligned.
     * 		The Data Parser refines SEMANTICS-LIST by gathering more data (a sample of the actual cell contents)
     * 		from ACCESS-PATHS and integrating this new information with SEMANTICS-LIST.
     * @return list of semantics-p; an augmented version of SEMANTICS-LIST.
    In particular, it is augmented by adding VALUE-SEMANTICS objects.
     */
    @LispMethod(comment = "@param ACCESS-PATHS\r\n\t\tlist of access-path-p; a list of specifications for accessing external databases.\r\n@param SEMANTICS-LIST\r\n\t\tlist of semantics-p; assumed to have already been generated by the Metadata Parser.\r\n\t\tAssumes that ACCESS-PATHS and SEMANTICS-LIST are assumed to be aligned.\r\n\t\tThe Data Parser refines SEMANTICS-LIST by gathering more data (a sample of the actual cell contents)\r\n\t\tfrom ACCESS-PATHS and integrating this new information with SEMANTICS-LIST.\r\n@return list of semantics-p; an augmented version of SEMANTICS-LIST.\r\nIn particular, it is augmented by adding VALUE-SEMANTICS objects.")
    public static SubLObject semantic_etl_parse_data(final SubLObject access_paths, final SubLObject semantics_list) {
        assert NIL != list_utilities.non_dotted_list_p(semantics_list) : "! list_utilities.non_dotted_list_p(semantics_list) " + ("list_utilities.non_dotted_list_p(semantics_list) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(semantics_list) ") + semantics_list;
        SubLObject cdolist_list_var = semantics_list;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != semantic_etl_bus.semantics_p(elem) : "! semantic_etl_bus.semantics_p(elem) " + ("semantic_etl_bus.semantics_p(elem) " + "CommonSymbols.NIL != semantic_etl_bus.semantics_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return semantic_etl_add_data_list(semantic_etl_acquire_data_list(access_paths, semantics_list), semantics_list, UNPROVIDED);
    }

    /**
     *
     *
     * @param ACCESS-PATH
     * 		access-path-p; a specification for accessing external databases.
     * @param SEMANTICS
     * 		semantics-p; assumed to have already been generated by the Metadata Parser.
     * 		Assumes that ACCESS-PATH and SEMANTICS are aligned.
     * 		This function added data from the DB to the semantics structure (by sampling the actual cell contents).
     * 		It differs from @xref semantic-etl-parse-data in that this function does not attempt to interpret any of
     * 		the data that it acquires
     * @return semantics-p; an augmented version of SEMANTICS.
    In particular, it is augmented by adding VALUE-SEMANTICS objects.
     */
    @LispMethod(comment = "@param ACCESS-PATH\r\n\t\taccess-path-p; a specification for accessing external databases.\r\n@param SEMANTICS\r\n\t\tsemantics-p; assumed to have already been generated by the Metadata Parser.\r\n\t\tAssumes that ACCESS-PATH and SEMANTICS are aligned.\r\n\t\tThis function added data from the DB to the semantics structure (by sampling the actual cell contents).\r\n\t\tIt differs from @xref semantic-etl-parse-data in that this function does not attempt to interpret any of\r\n\t\tthe data that it acquires\r\n@return semantics-p; an augmented version of SEMANTICS.\r\nIn particular, it is augmented by adding VALUE-SEMANTICS objects.")
    public static final SubLObject semantic_etl_acquire_and_add_data_alt(SubLObject access_path, SubLObject semantics) {
        {
            SubLObject data = com.cyc.cycjava.cycl.sksi.data_parser.semantic_etl_acquire_data(access_path, semantics);
            return com.cyc.cycjava.cycl.sksi.data_parser.semantic_etl_add_data(data, semantics, NIL);
        }
    }

    /**
     *
     *
     * @param ACCESS-PATH
     * 		access-path-p; a specification for accessing external databases.
     * @param SEMANTICS
     * 		semantics-p; assumed to have already been generated by the Metadata Parser.
     * 		Assumes that ACCESS-PATH and SEMANTICS are aligned.
     * 		This function added data from the DB to the semantics structure (by sampling the actual cell contents).
     * 		It differs from @xref semantic-etl-parse-data in that this function does not attempt to interpret any of
     * 		the data that it acquires
     * @return semantics-p; an augmented version of SEMANTICS.
    In particular, it is augmented by adding VALUE-SEMANTICS objects.
     */
    @LispMethod(comment = "@param ACCESS-PATH\r\n\t\taccess-path-p; a specification for accessing external databases.\r\n@param SEMANTICS\r\n\t\tsemantics-p; assumed to have already been generated by the Metadata Parser.\r\n\t\tAssumes that ACCESS-PATH and SEMANTICS are aligned.\r\n\t\tThis function added data from the DB to the semantics structure (by sampling the actual cell contents).\r\n\t\tIt differs from @xref semantic-etl-parse-data in that this function does not attempt to interpret any of\r\n\t\tthe data that it acquires\r\n@return semantics-p; an augmented version of SEMANTICS.\r\nIn particular, it is augmented by adding VALUE-SEMANTICS objects.")
    public static SubLObject semantic_etl_acquire_and_add_data(final SubLObject access_path, final SubLObject semantics) {
        final SubLObject data = semantic_etl_acquire_data(access_path, semantics);
        return semantic_etl_add_data(data, semantics, NIL);
    }

    /**
     * Gets a random sample of data from the databases specified by ACCESS-PATHS.
     */
    @LispMethod(comment = "Gets a random sample of data from the databases specified by ACCESS-PATHS.")
    public static final SubLObject semantic_etl_acquire_data_list_alt(SubLObject access_paths, SubLObject semantics_list) {
        {
            SubLObject data_list = NIL;
            SubLObject access_path = NIL;
            SubLObject access_path_1 = NIL;
            SubLObject semantics = NIL;
            SubLObject semantics_2 = NIL;
            for (access_path = access_paths, access_path_1 = access_path.first(), semantics = semantics_list, semantics_2 = semantics.first(); !((NIL == semantics) && (NIL == access_path)); access_path = access_path.rest() , access_path_1 = access_path.first() , semantics = semantics.rest() , semantics_2 = semantics.first()) {
                {
                    SubLObject data = com.cyc.cycjava.cycl.sksi.data_parser.semantic_etl_acquire_data(access_path_1, semantics_2);
                    data_list = cons(data, data_list);
                }
            }
            return nreverse(data_list);
        }
    }

    /**
     * Gets a random sample of data from the databases specified by ACCESS-PATHS.
     */
    @LispMethod(comment = "Gets a random sample of data from the databases specified by ACCESS-PATHS.")
    public static SubLObject semantic_etl_acquire_data_list(final SubLObject access_paths, final SubLObject semantics_list) {
        SubLObject data_list = NIL;
        SubLObject access_path = NIL;
        SubLObject access_path_$1 = NIL;
        SubLObject semantics = NIL;
        SubLObject semantics_$2 = NIL;
        access_path = access_paths;
        access_path_$1 = access_path.first();
        semantics = semantics_list;
        semantics_$2 = semantics.first();
        while ((NIL != semantics) || (NIL != access_path)) {
            final SubLObject data = semantic_etl_acquire_data(access_path_$1, semantics_$2);
            data_list = cons(data, data_list);
            access_path = access_path.rest();
            access_path_$1 = access_path.first();
            semantics = semantics.rest();
            semantics_$2 = semantics.first();
        } 
        return nreverse(data_list);
    }

    /**
     * Gets a random sample of data from the database specified by ACCESS-PATH.
     * It only uses SEMANTICS for the column names so it doesn't have to re-acquire the metadata.
     */
    @LispMethod(comment = "Gets a random sample of data from the database specified by ACCESS-PATH.\r\nIt only uses SEMANTICS for the column names so it doesn\'t have to re-acquire the metadata.\nGets a random sample of data from the database specified by ACCESS-PATH.\nIt only uses SEMANTICS for the column names so it doesn\'t have to re-acquire the metadata.")
    public static final SubLObject semantic_etl_acquire_data_alt(SubLObject access_path, SubLObject semantics) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject access_path_var = access_path;
                SubLObject connection = NIL;
                try {
                    connection = sksi_sks_interaction.open_sql_source(access_path_var, UNPROVIDED, UNPROVIDED);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == sdbc.sql_open_connection_p(connection)) {
                            Errors.error($str_alt2$Problem_opening_connection_to_dat, access_path_var);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = semantics_table_semantics_list(semantics);
                        SubLObject table_semantics = NIL;
                        for (table_semantics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , table_semantics = cdolist_list_var.first()) {
                            {
                                SubLObject statement = NIL;
                                try {
                                    if (NIL == sdbc.sql_open_connection_p(connection)) {
                                        connection = sksi_sks_interaction.open_sql_source(access_path, UNPROVIDED, UNPROVIDED);
                                    }
                                    if (NIL != sdbc.sdbc_error_p(connection)) {
                                        sdbc.sdbc_error_throw(connection);
                                    }
                                    if (NIL == sdbc.sql_open_statement_p(statement)) {
                                        statement = sdbc.sqlc_create_statement(connection);
                                    }
                                    if (NIL != sdbc.sdbc_error_p(connection)) {
                                        sdbc.sdbc_error_throw(statement);
                                    }
                                    {
                                        SubLObject table_name = table_semantics_table_name(table_semantics);
                                        SubLObject sql = cconcatenate($str_alt3$select___from_, new SubLObject[]{ format_nil.format_nil_a_no_copy(table_name), $str_alt4$_LIMIT_, format_nil.format_nil_a_no_copy($data_parser_row_sampling_limit$.getDynamicValue(thread)), $str_alt5$_ });
                                        SubLObject result_set = sdbc.sqls_execute_query(statement, sql, UNPROVIDED);
                                        if (NIL != sdbc.sdbc_error_p(result_set)) {
                                            sdbc.sdbc_error_throw(result_set);
                                        }
                                        sdbc.sqlrs_absolute(result_set, ZERO_INTEGER);
                                        {
                                            SubLObject table_data = NIL;
                                            while (NIL != sdbc.sqlrs_next(result_set)) {
                                                {
                                                    SubLObject row_data = NIL;
                                                    SubLObject cdotimes_end_var = table_semantics_column_count(table_semantics);
                                                    SubLObject i_1 = NIL;
                                                    for (i_1 = ZERO_INTEGER; i_1.numL(cdotimes_end_var); i_1 = add(i_1, ONE_INTEGER)) {
                                                        {
                                                            SubLObject i = number_utilities.f_1X(i_1);
                                                            row_data = cons(sdbc.sqlrs_get_object(result_set, i), row_data);
                                                        }
                                                    }
                                                    table_data = cons(nreverse(row_data), table_data);
                                                }
                                            } 
                                            result = cons(nreverse(table_data), result);
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            if (NIL != sdbc.sql_open_statement_p(statement)) {
                                                sdbc.sqls_close(statement);
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (NIL != sdbc.sql_open_connection_p(connection)) {
                                sdbc.sqlc_close(connection);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return nreverse(result);
            }
        }
    }

    /**
     * Gets a random sample of data from the database specified by ACCESS-PATH.
     * It only uses SEMANTICS for the column names so it doesn't have to re-acquire the metadata.
     */
    @LispMethod(comment = "Gets a random sample of data from the database specified by ACCESS-PATH.\r\nIt only uses SEMANTICS for the column names so it doesn\'t have to re-acquire the metadata.\nGets a random sample of data from the database specified by ACCESS-PATH.\nIt only uses SEMANTICS for the column names so it doesn\'t have to re-acquire the metadata.")
    public static SubLObject semantic_etl_acquire_data(final SubLObject access_path, final SubLObject semantics) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject connection = NIL;
        try {
            connection = sksi_sks_interaction.open_sql_source(access_path, UNPROVIDED, UNPROVIDED);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == sdbc.sql_open_connection_p(connection))) {
                Errors.error($str2$Problem_opening_connection_to_dat, access_path);
            }
            SubLObject cdolist_list_var = semantic_etl_bus.semantics_table_semantics_list(semantics);
            SubLObject table_semantics = NIL;
            table_semantics = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject statement = NIL;
                try {
                    if (NIL == sdbc.sql_open_connection_p(connection)) {
                        connection = sksi_sks_interaction.open_sql_source(access_path, UNPROVIDED, UNPROVIDED);
                    }
                    if (NIL != sdbc.sdbc_error_p(connection)) {
                        sdbc.sdbc_error_throw(connection);
                    }
                    if (NIL == sdbc.sql_open_statement_p(statement)) {
                        statement = sdbc.sqlc_create_statement(connection);
                    }
                    if (NIL != sdbc.sdbc_error_p(connection)) {
                        sdbc.sdbc_error_throw(statement);
                    }
                    final SubLObject table_name = semantic_etl_bus.table_semantics_table_name(table_semantics);
                    final SubLObject sql = cconcatenate($str3$select___from_, new SubLObject[]{ format_nil.format_nil_a_no_copy(table_name), $$$_LIMIT_, format_nil.format_nil_a_no_copy($data_parser_row_sampling_limit$.getDynamicValue(thread)), $str5$_ });
                    final SubLObject result_set = sdbc.sqls_execute_query(statement, sql, UNPROVIDED);
                    if (NIL != sdbc.sdbc_error_p(result_set)) {
                        sdbc.sdbc_error_throw(result_set);
                    }
                    sdbc.sqlrs_absolute(result_set, ZERO_INTEGER);
                    SubLObject table_data = NIL;
                    while (NIL != sdbc.sqlrs_next(result_set)) {
                        SubLObject row_data = NIL;
                        SubLObject cdotimes_end_var;
                        SubLObject i_1;
                        SubLObject i;
                        for (cdotimes_end_var = semantic_etl_bus.table_semantics_column_count(table_semantics), i_1 = NIL, i_1 = ZERO_INTEGER; i_1.numL(cdotimes_end_var); i_1 = add(i_1, ONE_INTEGER)) {
                            i = number_utilities.f_1X(i_1);
                            row_data = cons(sdbc.sqlrs_get_object(result_set, i), row_data);
                        }
                        table_data = cons(nreverse(row_data), table_data);
                    } 
                    result = cons(nreverse(table_data), result);
                } finally {
                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL != sdbc.sql_open_statement_p(statement)) {
                            sdbc.sqls_close(statement);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                table_semantics = cdolist_list_var.first();
            } 
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (NIL != sdbc.sql_open_connection_p(connection)) {
                    sdbc.sqlc_close(connection);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return nreverse(result);
    }

    /**
     * Transforms DATA-LIST to be column/value based instead of row/value based,
     * and also (optionally) parses the cell contents in DATA-LIST and integrates the information into SEMANTICS-LIST
     * as VALUE-SEMANTICS objects.
     */
    @LispMethod(comment = "Transforms DATA-LIST to be column/value based instead of row/value based,\r\nand also (optionally) parses the cell contents in DATA-LIST and integrates the information into SEMANTICS-LIST\r\nas VALUE-SEMANTICS objects.\nTransforms DATA-LIST to be column/value based instead of row/value based,\nand also (optionally) parses the cell contents in DATA-LIST and integrates the information into SEMANTICS-LIST\nas VALUE-SEMANTICS objects.")
    public static final SubLObject semantic_etl_add_data_list_alt(SubLObject data_list, SubLObject semantics_list, SubLObject parse_data) {
        if (parse_data == UNPROVIDED) {
            parse_data = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result_semantics_list = NIL;
                SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt6$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject data = NIL;
                                    SubLObject data_3 = NIL;
                                    SubLObject semantics = NIL;
                                    SubLObject semantics_4 = NIL;
                                    for (data = data_list, data_3 = data.first(), semantics = semantics_list, semantics_4 = semantics.first(); !((NIL == semantics) && (NIL == data)); data = data.rest() , data_3 = data.first() , semantics = semantics.rest() , semantics_4 = semantics.first()) {
                                        result_semantics_list = cons(com.cyc.cycjava.cycl.sksi.data_parser.semantic_etl_add_data(data_3, semantics_4, parse_data), result_semantics_list);
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_5, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(semantics_list);
            }
        }
    }

    /**
     * Transforms DATA-LIST to be column/value based instead of row/value based,
     * and also (optionally) parses the cell contents in DATA-LIST and integrates the information into SEMANTICS-LIST
     * as VALUE-SEMANTICS objects.
     */
    @LispMethod(comment = "Transforms DATA-LIST to be column/value based instead of row/value based,\r\nand also (optionally) parses the cell contents in DATA-LIST and integrates the information into SEMANTICS-LIST\r\nas VALUE-SEMANTICS objects.\nTransforms DATA-LIST to be column/value based instead of row/value based,\nand also (optionally) parses the cell contents in DATA-LIST and integrates the information into SEMANTICS-LIST\nas VALUE-SEMANTICS objects.")
    public static SubLObject semantic_etl_add_data_list(final SubLObject data_list, final SubLObject semantics_list, SubLObject parse_data) {
        if (parse_data == UNPROVIDED) {
            parse_data = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_semantics_list = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject data = NIL;
                SubLObject data_$3 = NIL;
                SubLObject semantics = NIL;
                SubLObject semantics_$4 = NIL;
                data = data_list;
                data_$3 = data.first();
                semantics = semantics_list;
                semantics_$4 = semantics.first();
                while ((NIL != semantics) || (NIL != data)) {
                    result_semantics_list = cons(semantic_etl_add_data(data_$3, semantics_$4, parse_data), result_semantics_list);
                    data = data.rest();
                    data_$3 = data.first();
                    semantics = semantics.rest();
                    semantics_$4 = semantics.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return nreverse(semantics_list);
    }

    public static final SubLObject semantic_etl_add_data_alt(SubLObject data, SubLObject semantics, SubLObject parse_data) {
        if (parse_data == UNPROVIDED) {
            parse_data = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table_data = NIL;
                SubLObject table_data_6 = NIL;
                SubLObject table_semantics = NIL;
                SubLObject table_semantics_7 = NIL;
                for (table_data = data, table_data_6 = table_data.first(), table_semantics = semantics_table_semantics_list(semantics), table_semantics_7 = table_semantics.first(); !((NIL == table_semantics) && (NIL == table_data)); table_data = table_data.rest() , table_data_6 = table_data.first() , table_semantics = table_semantics.rest() , table_semantics_7 = table_semantics.first()) {
                    {
                        SubLObject column_count = table_semantics_column_count(table_semantics_7);
                        SubLObject value_semantics_vector = make_vector(column_count, NIL);
                        SubLObject cdolist_list_var = table_data_6;
                        SubLObject row_data = NIL;
                        for (row_data = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , row_data = cdolist_list_var.first()) {
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (!column_count.numE(length(row_data))) {
                                    Errors.error($str_alt7$Expected__a_columns_but_got_a_row, column_count, length(row_data), row_data);
                                }
                            }
                            {
                                SubLObject list_var = NIL;
                                SubLObject value = NIL;
                                SubLObject i = NIL;
                                for (list_var = row_data, value = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , value = list_var.first() , i = add(ONE_INTEGER, i)) {
                                    {
                                        SubLObject value_parses = (NIL != parse_data) ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.data_parser.semantic_etl_parse_value(value))) : $UNDETERMINED;
                                        SubLObject value_semantics = new_value_semantics(value, value_parses);
                                        set_aref(value_semantics_vector, i, cons(value_semantics, aref(value_semantics_vector, i)));
                                    }
                                }
                            }
                        }
                        {
                            SubLObject list_var = NIL;
                            SubLObject column_semantics = NIL;
                            SubLObject i = NIL;
                            for (list_var = table_semantics_column_semantics_list(table_semantics_7), column_semantics = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , column_semantics = list_var.first() , i = add(ONE_INTEGER, i)) {
                                {
                                    SubLObject value_semantics_list = aref(value_semantics_vector, i);
                                    if (column_semantics_column_type(column_semantics).equal($$$bool)) {
                                        value_semantics_list = com.cyc.cycjava.cycl.sksi.data_parser.convert_values_semantics_to_boolean_values(value_semantics_list);
                                    }
                                    set_column_semantics_value_semantics_list(column_semantics, nreverse(value_semantics_list));
                                }
                            }
                        }
                    }
                }
            }
            return semantics;
        }
    }

    public static SubLObject semantic_etl_add_data(final SubLObject data, final SubLObject semantics, SubLObject parse_data) {
        if (parse_data == UNPROVIDED) {
            parse_data = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject table_data = NIL;
        SubLObject table_data_$6 = NIL;
        SubLObject table_semantics = NIL;
        SubLObject table_semantics_$7 = NIL;
        table_data = data;
        table_data_$6 = table_data.first();
        table_semantics = semantic_etl_bus.semantics_table_semantics_list(semantics);
        table_semantics_$7 = table_semantics.first();
        while ((NIL != table_semantics) || (NIL != table_data)) {
            final SubLObject column_count = semantic_etl_bus.table_semantics_column_count(table_semantics_$7);
            final SubLObject value_semantics_vector = make_vector(column_count, NIL);
            SubLObject cdolist_list_var = table_data_$6;
            SubLObject row_data = NIL;
            row_data = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!column_count.numE(length(row_data)))) {
                    Errors.error($str6$Expected__a_columns_but_got_a_row, column_count, length(row_data), row_data);
                }
                SubLObject list_var = NIL;
                SubLObject value = NIL;
                SubLObject i = NIL;
                list_var = row_data;
                value = list_var.first();
                for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , value = list_var.first() , i = add(ONE_INTEGER, i)) {
                    final SubLObject value_parses = (NIL != parse_data) ? semantic_etl_parse_value(value) : $UNDETERMINED;
                    final SubLObject value_semantics = semantic_etl_bus.new_value_semantics(value, value_parses);
                    set_aref(value_semantics_vector, i, cons(value_semantics, aref(value_semantics_vector, i)));
                }
                cdolist_list_var = cdolist_list_var.rest();
                row_data = cdolist_list_var.first();
            } 
            SubLObject list_var = NIL;
            SubLObject column_semantics = NIL;
            SubLObject i = NIL;
            list_var = semantic_etl_bus.table_semantics_column_semantics_list(table_semantics_$7);
            column_semantics = list_var.first();
            for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , column_semantics = list_var.first() , i = add(ONE_INTEGER, i)) {
                SubLObject value_semantics_list = aref(value_semantics_vector, i);
                if (semantic_etl_bus.column_semantics_column_type(column_semantics).equal($$$bool)) {
                    value_semantics_list = convert_values_semantics_to_boolean_values(value_semantics_list);
                }
                semantic_etl_bus.set_column_semantics_value_semantics_list(column_semantics, nreverse(value_semantics_list));
            }
            table_data = table_data.rest();
            table_data_$6 = table_data.first();
            table_semantics = table_semantics.rest();
            table_semantics_$7 = table_semantics.first();
        } 
        return semantics;
    }

    public static final SubLObject convert_values_semantics_to_boolean_values_alt(SubLObject value_semantics_list) {
        {
            SubLObject cdolist_list_var = value_semantics_list;
            SubLObject value_semantics = NIL;
            for (value_semantics = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value_semantics = cdolist_list_var.first()) {
                if (value_semantics_value(value_semantics) == NIL) {
                    set_value_semantics_value(value_semantics, $$$f);
                } else {
                    set_value_semantics_value(value_semantics, $$$t);
                }
            }
        }
        return value_semantics_list;
    }

    public static SubLObject convert_values_semantics_to_boolean_values(final SubLObject value_semantics_list) {
        SubLObject cdolist_list_var = value_semantics_list;
        SubLObject value_semantics = NIL;
        value_semantics = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (semantic_etl_bus.value_semantics_value(value_semantics) == NIL) {
                semantic_etl_bus.set_value_semantics_value(value_semantics, $$$f);
            } else {
                semantic_etl_bus.set_value_semantics_value(value_semantics, $$$t);
            }
            cdolist_list_var = cdolist_list_var.rest();
            value_semantics = cdolist_list_var.first();
        } 
        return value_semantics_list;
    }

    public static final SubLObject semantic_etl_parse_value_alt(SubLObject value) {
        return value.isString() ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.data_parser.semantic_etl_parse_value_int(value))) : NIL;
    }

    public static SubLObject semantic_etl_parse_value(final SubLObject value) {
        return value.isString() ? semantic_etl_parse_value_int(value) : NIL;
    }

    public static final SubLObject semantic_etl_parse_value_int_internal_alt(SubLObject value) {
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
                        result = genls.min_cols(remove_if($sym15$SEMANTIC_ETL_IRRELEVANT_TERM_, Mapping.mapcan(SEMANTIC_ETL_ALL_ISA, com.cyc.cycjava.cycl.sksi.data_parser.etl_parse_value(value, UNPROVIDED, UNPROVIDED), EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject semantic_etl_parse_value_int_internal(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = genls.min_cols(remove_if($sym14$SEMANTIC_ETL_IRRELEVANT_TERM_, Mapping.mapcan(SEMANTIC_ETL_ALL_ISA, etl_parse_value(value, UNPROVIDED, UNPROVIDED), EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject semantic_etl_parse_value_int_alt(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.data_parser.semantic_etl_parse_value_int_internal(value);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SEMANTIC_ETL_PARSE_VALUE_INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SEMANTIC_ETL_PARSE_VALUE_INT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, SEMANTIC_ETL_PARSE_VALUE_INT, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, value, $kw17$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw17$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.data_parser.semantic_etl_parse_value_int_internal(value)));
                        memoization_state.caching_state_put(caching_state, value, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject semantic_etl_parse_value_int(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return semantic_etl_parse_value_int_internal(value);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SEMANTIC_ETL_PARSE_VALUE_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SEMANTIC_ETL_PARSE_VALUE_INT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SEMANTIC_ETL_PARSE_VALUE_INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, value, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(semantic_etl_parse_value_int_internal(value)));
            memoization_state.caching_state_put(caching_state, value, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject semantic_etl_all_isa_alt(SubLObject v_term) {
        {
            SubLObject sbhl_isas = isa.all_isa(v_term, UNPROVIDED, UNPROVIDED);
            SubLObject defn_isas = Mapping.mapcan(ALL_GENLS, defns.min_defn_admits(v_term, UNPROVIDED), EMPTY_SUBL_OBJECT_ARRAY);
            return union(sbhl_isas, defn_isas, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject semantic_etl_all_isa(final SubLObject v_term) {
        final SubLObject sbhl_isas = isa.all_isa(v_term, UNPROVIDED, UNPROVIDED);
        final SubLObject defn_isas = Mapping.mapcan(ALL_GENLS, defns.min_defn_admits(v_term, UNPROVIDED), EMPTY_SUBL_OBJECT_ARRAY);
        return union(sbhl_isas, defn_isas, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject semantic_etl_irrelevant_termP_alt(SubLObject v_term) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sksi.data_parser.semantic_etl_upper_ontology_termP(v_term)) || (NIL != rkf_relevance_utilities.rkf_irrelevant_term(v_term, $$InferencePSC)));
    }

    public static SubLObject semantic_etl_irrelevant_termP(final SubLObject v_term) {
        return makeBoolean((NIL != semantic_etl_upper_ontology_termP(v_term)) || (NIL != rkf_relevance_utilities.rkf_irrelevant_term(v_term, $$InferencePSC)));
    }

    public static final SubLObject clear_semantic_etl_upper_ontology_termP_alt() {
        {
            SubLObject cs = $semantic_etl_upper_ontology_termP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_semantic_etl_upper_ontology_termP() {
        final SubLObject cs = $semantic_etl_upper_ontology_termP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_semantic_etl_upper_ontology_termP_alt(SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($semantic_etl_upper_ontology_termP_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_semantic_etl_upper_ontology_termP(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($semantic_etl_upper_ontology_termP_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject semantic_etl_upper_ontology_termP_internal_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!$bottom_of_upper_ontology_generality_estimate$.getDynamicValue(thread).isNumber()) {
                $bottom_of_upper_ontology_generality_estimate$.setDynamicValue(cardinality_estimates.generality_estimate($bottom_of_upper_ontology$.getDynamicValue(thread)), thread);
            }
            return numGE(cardinality_estimates.generality_estimate(v_term), $bottom_of_upper_ontology_generality_estimate$.getDynamicValue(thread));
        }
    }

    public static SubLObject semantic_etl_upper_ontology_termP_internal(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!$bottom_of_upper_ontology_generality_estimate$.getDynamicValue(thread).isNumber()) {
            $bottom_of_upper_ontology_generality_estimate$.setDynamicValue(cardinality_estimates.generality_estimate($bottom_of_upper_ontology$.getDynamicValue(thread)), thread);
        }
        return numGE(cardinality_estimates.generality_estimate(v_term), $bottom_of_upper_ontology_generality_estimate$.getDynamicValue(thread));
    }

    public static final SubLObject semantic_etl_upper_ontology_termP_alt(SubLObject v_term) {
        {
            SubLObject caching_state = $semantic_etl_upper_ontology_termP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym21$SEMANTIC_ETL_UPPER_ONTOLOGY_TERM_, $sym22$_SEMANTIC_ETL_UPPER_ONTOLOGY_TERM__CACHING_STATE_, $int$100000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, $kw17$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw17$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.data_parser.semantic_etl_upper_ontology_termP_internal(v_term)));
                    memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject semantic_etl_upper_ontology_termP(final SubLObject v_term) {
        SubLObject caching_state = $semantic_etl_upper_ontology_termP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym19$SEMANTIC_ETL_UPPER_ONTOLOGY_TERM_, $sym20$_SEMANTIC_ETL_UPPER_ONTOLOGY_TERM__CACHING_STATE_, $int$100000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(semantic_etl_upper_ontology_termP_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject etl_metadata_lexicon_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == term_lexicon.term_lexicon_p($etl_metadata_lexicon$.getDynamicValue(thread))) {
                $etl_metadata_lexicon$.setDynamicValue(term_lexicon.new_term_lexicon(), thread);
            }
            return $etl_metadata_lexicon$.getDynamicValue(thread);
        }
    }

    public static SubLObject etl_metadata_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == term_lexicon.term_lexicon_p($etl_metadata_lexicon$.getDynamicValue(thread))) {
            $etl_metadata_lexicon$.setDynamicValue(term_lexicon.new_term_lexicon(), thread);
        }
        return $etl_metadata_lexicon$.getDynamicValue(thread);
    }

    public static final SubLObject etl_data_lexicon_alt(SubLObject use_existingP) {
        if (use_existingP == UNPROVIDED) {
            use_existingP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != use_existingP) && (NIL != term_lexicon.term_lexicon_p($etl_data_lexicon$.getDynamicValue(thread))))) {
                $etl_data_lexicon$.setDynamicValue(term_lexicon.new_term_lexicon(), thread);
                methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), ADD_LEARNER, SIMPLE_DATE_FROM_STRING_LEARN);
                methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), ADD_LEARNER, NUMBER_LEARN);
                methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), EXCLUDE_PREDICATE, $$middleName);
                methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), EXCLUDE_PREDICATE, $$familyName);
                methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), EXCLUDE_PREDICATE, $$lastName);
                methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), EXCLUDE_PREDICATE, $$ksTermString);
                methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), ALLOW_PREDICATE, $$countryCodeDigraph);
                methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), ALLOW_PREDICATE, $$countryCodeTrigraph);
                methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), SET_CASE_SENSITIVITY, $PREFERRED);
                methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), FORBID_MT, $$CyclishMt);
                methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), FORBID_MT, $$ComputereseLexicalMt);
                methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), EXCLUDE_POS, $$Verb);
                if (NIL != valid_constantP(constants_high.find_constant($$$DBFusionLexicalMt), UNPROVIDED)) {
                    methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), ALLOW_MT, $$DBFusionLexicalMt);
                }
            }
            return $etl_data_lexicon$.getDynamicValue(thread);
        }
    }

    public static SubLObject etl_data_lexicon(SubLObject use_existingP) {
        if (use_existingP == UNPROVIDED) {
            use_existingP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == use_existingP) || (NIL == term_lexicon.term_lexicon_p($etl_data_lexicon$.getDynamicValue(thread)))) {
            $etl_data_lexicon$.setDynamicValue(term_lexicon.new_term_lexicon(), thread);
            methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), ADD_LEARNER, SIMPLE_DATE_FROM_STRING_LEARN);
            methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), ADD_LEARNER, NUMBER_LEARN);
            methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), EXCLUDE_PREDICATE, $$middleName);
            methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), EXCLUDE_PREDICATE, $$familyName);
            methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), EXCLUDE_PREDICATE, $$lastName);
            methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), EXCLUDE_PREDICATE, $$ksTermString);
            methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), ALLOW_PREDICATE, $$countryCodeDigraph);
            methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), ALLOW_PREDICATE, $$countryCodeTrigraph);
            methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), SET_CASE_SENSITIVITY, $PREFERRED);
            methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), FORBID_MT, $$CyclishMt);
            methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), FORBID_MT, $$ComputereseLexicalMt);
            methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), EXCLUDE_POS, $$Verb);
            if (NIL != valid_constantP(constants_high.find_constant($$$DBFusionLexicalMt), UNPROVIDED)) {
                methods.funcall_instance_method_with_1_args($etl_data_lexicon$.getDynamicValue(thread), ALLOW_MT, $$DBFusionLexicalMt);
            }
        }
        return $etl_data_lexicon$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @unknown functions that call this should probably have their own implementations
     */
    @LispMethod(comment = "@unknown functions that call this should probably have their own implementations")
    public static final SubLObject etl_parse_value_trampoline_alt(SubLObject string, SubLObject allow_partial_interpsP, SubLObject lexicon) {
        if (allow_partial_interpsP == UNPROVIDED) {
            allow_partial_interpsP = T;
        }
        if (lexicon == UNPROVIDED) {
            lexicon = com.cyc.cycjava.cycl.sksi.data_parser.etl_data_lexicon(UNPROVIDED);
        }
        return com.cyc.cycjava.cycl.sksi.data_parser.etl_parse_value(string, allow_partial_interpsP, lexicon);
    }

    /**
     *
     *
     * @unknown functions that call this should probably have their own implementations
     */
    @LispMethod(comment = "@unknown functions that call this should probably have their own implementations")
    public static SubLObject etl_parse_value_trampoline(final SubLObject string, SubLObject allow_partial_interpsP, SubLObject lexicon) {
        if (allow_partial_interpsP == UNPROVIDED) {
            allow_partial_interpsP = T;
        }
        if (lexicon == UNPROVIDED) {
            lexicon = etl_data_lexicon(UNPROVIDED);
        }
        return etl_parse_value(string, allow_partial_interpsP, lexicon);
    }

    public static final SubLObject etl_parse_value_alt(SubLObject string, SubLObject allow_partial_interpsP, SubLObject lexicon) {
        if (allow_partial_interpsP == UNPROVIDED) {
            allow_partial_interpsP = T;
        }
        if (lexicon == UNPROVIDED) {
            lexicon = com.cyc.cycjava.cycl.sksi.data_parser.etl_data_lexicon(UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cycl_terms = NIL;
                while ((NIL == cycl_terms) && (NIL != string_utilities.non_empty_string_p(string))) {
                    {
                        SubLObject iterator_var = nl_parsing_api.string_phrasal_meanings_iterator(string, list($LEXICON, lexicon, $FILTER, $etl_data_filter_spec$.getDynamicValue(thread)));
                        SubLObject done_var = NIL;
                        while (NIL == done_var) {
                            thread.resetMultipleValues();
                            {
                                SubLObject nl_interp = iteration.iteration_next(iterator_var);
                                SubLObject valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    {
                                        SubLObject item_var = narts_high.nart_substitute(nl_api_datastructures.get_nl_interp_cycl(nl_interp));
                                        if (NIL == member(item_var, cycl_terms, EQUAL, symbol_function(IDENTITY))) {
                                            cycl_terms = cons(item_var, cycl_terms);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            }
                        } 
                    }
                    if (NIL != allow_partial_interpsP) {
                        string = com.cyc.cycjava.cycl.sksi.data_parser.remove_first_word(string);
                    } else {
                        string = $str_alt48$;
                    }
                } 
                return nreverse(cycl_terms);
            }
        }
    }

    public static SubLObject etl_parse_value(SubLObject string, SubLObject allow_partial_interpsP, SubLObject lexicon) {
        if (allow_partial_interpsP == UNPROVIDED) {
            allow_partial_interpsP = T;
        }
        if (lexicon == UNPROVIDED) {
            lexicon = etl_data_lexicon(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cycl_terms = NIL;
        while ((NIL == cycl_terms) && (NIL != string_utilities.non_empty_string_p(string))) {
            final SubLObject iterator_var = nl_parsing_api.string_phrasal_meanings_iterator(string, list($LEXICON, lexicon, $FILTER, $etl_data_filter_spec$.getDynamicValue(thread)));
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject nl_interp = iteration.iteration_next(iterator_var);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    final SubLObject item_var = narts_high.nart_substitute(nl_api_datastructures.get_nl_interp_cycl(nl_interp));
                    if (NIL == member(item_var, cycl_terms, EQUAL, symbol_function(IDENTITY))) {
                        cycl_terms = cons(item_var, cycl_terms);
                    }
                }
            }
            if (NIL != allow_partial_interpsP) {
                string = remove_first_word(string);
            } else {
                string = $str46$;
            }
        } 
        return nreverse(cycl_terms);
    }

    public static final SubLObject np_stringP_alt(SubLObject string) {
        {
            SubLObject v_parse_tree = parser.stanford_parse(string, UNPROVIDED, UNPROVIDED);
            SubLObject np_trees = abstract_lexicon.tree_nps(v_parse_tree, UNPROVIDED);
            SubLObject cdolist_list_var = np_trees;
            SubLObject np_tree = NIL;
            for (np_tree = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , np_tree = cdolist_list_var.first()) {
                {
                    SubLObject tree_words = remove_if_not(STRINGP, flatten(np_tree), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if ((NIL != string_utilities.starts_with(string, tree_words.first())) && (NIL != string_utilities.ends_with(string, last(tree_words, UNPROVIDED).first(), UNPROVIDED))) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject np_stringP(final SubLObject string) {
        final SubLObject v_parse_tree = parser.stanford_parse(string, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject np_trees = cdolist_list_var = abstract_lexicon.tree_nps(v_parse_tree, UNPROVIDED);
        SubLObject np_tree = NIL;
        np_tree = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject tree_words = list_utilities.remove_if_not(STRINGP, list_utilities.flatten(np_tree), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if ((NIL != string_utilities.starts_with(string, tree_words.first())) && (NIL != string_utilities.ends_with(string, last(tree_words, UNPROVIDED).first(), UNPROVIDED))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            np_tree = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject remove_first_word_alt(SubLObject string) {
        {
            SubLObject strings = string_utilities.split_string(string, UNPROVIDED);
            return string_utilities.left_trim_whitespace(string_utilities.replace_substring_once(string, strings.first(), $str_alt48$, UNPROVIDED));
        }
    }

    public static SubLObject remove_first_word(final SubLObject string) {
        final SubLObject strings = string_utilities.split_string(string, UNPROVIDED);
        return string_utilities.left_trim_whitespace(string_utilities.replace_substring_once(string, strings.first(), $str46$, UNPROVIDED));
    }

    /**
     * The KB-equivalent of inverse-document frequency;
     * approximately equivalent to 'how informative is this term?'
     */
    @LispMethod(comment = "The KB-equivalent of inverse-document frequency;\r\napproximately equivalent to \'how informative is this term?\'\nThe KB-equivalent of inverse-document frequency;\napproximately equivalent to \'how informative is this term?\'")
    public static final SubLObject term_log_idf_from_kb_alt(SubLObject v_term) {
        {
            SubLObject generality_estimate = cardinality_estimates.generality_estimate(v_term);
            if (generality_estimate.numLE(ONE_INTEGER)) {
                generality_estimate = TWO_INTEGER;
            }
            return divide(ONE_INTEGER, log(generality_estimate, UNPROVIDED));
        }
    }

    @LispMethod(comment = "The KB-equivalent of inverse-document frequency;\r\napproximately equivalent to \'how informative is this term?\'\nThe KB-equivalent of inverse-document frequency;\napproximately equivalent to \'how informative is this term?\'")
    public static SubLObject term_log_idf_from_kb(final SubLObject v_term) {
        SubLObject generality_estimate = cardinality_estimates.generality_estimate(v_term);
        if (generality_estimate.numLE(ONE_INTEGER)) {
            generality_estimate = TWO_INTEGER;
        }
        return divide(ONE_INTEGER, log(generality_estimate, UNPROVIDED));
    }/**
     * The KB-equivalent of inverse-document frequency;
     * approximately equivalent to 'how informative is this term?'
     */


    /**
     * given a list of lists of CycL-terms TERM-LISTS (where each element of TERM-LISTS is a list of possible meanings that
     * should all be considered to represent one token, return a list, ordered by tf.idf, of the types of those
     * terms.  If a term is a collection, all genls of it are considered.  If it's an individual,
     * all isas of the term are considered.  The idea is to return the type that cover most of the terms
     * in TERM-LIST, but perhaps leave out a few of the outliers.  It is not guaranteed that all
     * elements of TERM-LIST will have the highest-ranked term in the output-list as either an
     * isa or a genl.
     */
    @LispMethod(comment = "given a list of lists of CycL-terms TERM-LISTS (where each element of TERM-LISTS is a list of possible meanings that\r\nshould all be considered to represent one token, return a list, ordered by tf.idf, of the types of those\r\nterms.  If a term is a collection, all genls of it are considered.  If it\'s an individual,\r\nall isas of the term are considered.  The idea is to return the type that cover most of the terms\r\nin TERM-LIST, but perhaps leave out a few of the outliers.  It is not guaranteed that all\r\nelements of TERM-LIST will have the highest-ranked term in the output-list as either an\r\nisa or a genl.\ngiven a list of lists of CycL-terms TERM-LISTS (where each element of TERM-LISTS is a list of possible meanings that\nshould all be considered to represent one token, return a list, ordered by tf.idf, of the types of those\nterms.  If a term is a collection, all genls of it are considered.  If it\'s an individual,\nall isas of the term are considered.  The idea is to return the type that cover most of the terms\nin TERM-LIST, but perhaps leave out a few of the outliers.  It is not guaranteed that all\nelements of TERM-LIST will have the highest-ranked term in the output-list as either an\nisa or a genl.")
    public static final SubLObject best_types_ordered_by_tfXidf_alt(SubLObject term_lists, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term_count_dict = dictionary.new_dictionary(EQUAL, UNPROVIDED);
                SubLObject term_list_length = length(term_lists);
                SubLObject term_sets = NIL;
                {
                    SubLObject cdolist_list_var = term_lists;
                    SubLObject term_list = NIL;
                    for (term_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , term_list = cdolist_list_var.first()) {
                        {
                            SubLObject term_set = set.new_set(UNPROVIDED, UNPROVIDED);
                            SubLObject cdolist_list_var_8 = term_list;
                            SubLObject v_term = NIL;
                            for (v_term = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , v_term = cdolist_list_var_8.first()) {
                                {
                                    SubLObject upwards_closure = (NIL != fort_types_interface.collection_p(v_term)) ? ((SubLObject) (com.cyc.cycjava.cycl.sksi.data_parser.data_parser_all_genls(v_term, mt))) : com.cyc.cycjava.cycl.sksi.data_parser.data_parser_all_isa(v_term, mt);
                                    SubLObject cdolist_list_var_9 = upwards_closure;
                                    SubLObject genl = NIL;
                                    for (genl = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , genl = cdolist_list_var_9.first()) {
                                        set.set_add(genl, term_set);
                                    }
                                }
                            }
                            term_sets = cons(term_set, term_sets);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = term_sets;
                    SubLObject term_set = NIL;
                    for (term_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , term_set = cdolist_list_var.first()) {
                        {
                            SubLObject set_contents_var = set.do_set_internal(term_set);
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject elt = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, elt)) {
                                        dictionary_utilities.dictionary_increment(term_count_dict, elt, UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject tf_idf = NIL;
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(term_count_dict));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject v_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject count = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject term_frequency = multiply(count, multiply(new SubLObject[]{ log(count, UNPROVIDED) }));
                                tf_idf = cons(list(v_term, divide(multiply(term_frequency, com.cyc.cycjava.cycl.sksi.data_parser.term_log_idf_from_kb(v_term)), term_list_length), term_frequency, cardinality_estimates.generality_estimate(v_term), com.cyc.cycjava.cycl.sksi.data_parser.term_log_idf_from_kb(v_term)), tf_idf);
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    return Sort.sort(tf_idf, $sym50$_, SECOND);
                }
            }
        }
    }

    /**
     * given a list of lists of CycL-terms TERM-LISTS (where each element of TERM-LISTS is a list of possible meanings that
     * should all be considered to represent one token, return a list, ordered by tf.idf, of the types of those
     * terms.  If a term is a collection, all genls of it are considered.  If it's an individual,
     * all isas of the term are considered.  The idea is to return the type that cover most of the terms
     * in TERM-LIST, but perhaps leave out a few of the outliers.  It is not guaranteed that all
     * elements of TERM-LIST will have the highest-ranked term in the output-list as either an
     * isa or a genl.
     */
    @LispMethod(comment = "given a list of lists of CycL-terms TERM-LISTS (where each element of TERM-LISTS is a list of possible meanings that\r\nshould all be considered to represent one token, return a list, ordered by tf.idf, of the types of those\r\nterms.  If a term is a collection, all genls of it are considered.  If it\'s an individual,\r\nall isas of the term are considered.  The idea is to return the type that cover most of the terms\r\nin TERM-LIST, but perhaps leave out a few of the outliers.  It is not guaranteed that all\r\nelements of TERM-LIST will have the highest-ranked term in the output-list as either an\r\nisa or a genl.\ngiven a list of lists of CycL-terms TERM-LISTS (where each element of TERM-LISTS is a list of possible meanings that\nshould all be considered to represent one token, return a list, ordered by tf.idf, of the types of those\nterms.  If a term is a collection, all genls of it are considered.  If it\'s an individual,\nall isas of the term are considered.  The idea is to return the type that cover most of the terms\nin TERM-LIST, but perhaps leave out a few of the outliers.  It is not guaranteed that all\nelements of TERM-LIST will have the highest-ranked term in the output-list as either an\nisa or a genl.")
    public static SubLObject best_types_ordered_by_tfXidf(final SubLObject term_lists, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_count_dict = dictionary.new_dictionary(EQUAL, UNPROVIDED);
        final SubLObject term_list_length = length(term_lists);
        SubLObject term_sets = NIL;
        SubLObject cdolist_list_var = term_lists;
        SubLObject term_list = NIL;
        term_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject term_set = set.new_set(UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var_$8 = term_list;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var_$8.first();
            while (NIL != cdolist_list_var_$8) {
                SubLObject cdolist_list_var_$9;
                final SubLObject upwards_closure = cdolist_list_var_$9 = (NIL != fort_types_interface.collection_p(v_term)) ? data_parser_all_genls(v_term, mt) : data_parser_all_isa(v_term, mt);
                SubLObject genl = NIL;
                genl = cdolist_list_var_$9.first();
                while (NIL != cdolist_list_var_$9) {
                    set.set_add(genl, term_set);
                    cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                    genl = cdolist_list_var_$9.first();
                } 
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                v_term = cdolist_list_var_$8.first();
            } 
            term_sets = cons(term_set, term_sets);
            cdolist_list_var = cdolist_list_var.rest();
            term_list = cdolist_list_var.first();
        } 
        cdolist_list_var = term_sets;
        SubLObject term_set2 = NIL;
        term_set2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject set_contents_var = set.do_set_internal(term_set2);
            SubLObject basis_object;
            SubLObject state;
            SubLObject elt;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                elt = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, elt)) {
                    dictionary_utilities.dictionary_increment(term_count_dict, elt, UNPROVIDED);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            term_set2 = cdolist_list_var.first();
        } 
        SubLObject tf_idf = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(term_count_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject v_term2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject term_frequency = multiply(count, multiply(new SubLObject[]{ log(count, UNPROVIDED) }));
            tf_idf = cons(list(v_term2, divide(multiply(term_frequency, term_log_idf_from_kb(v_term2)), term_list_length), term_frequency, cardinality_estimates.generality_estimate(v_term2), term_log_idf_from_kb(v_term2)), tf_idf);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return Sort.sort(tf_idf, $sym48$_, SECOND);
    }

    /**
     * given a list of lists of CycL-terms TERM-LISTS (where each element of TERM-LISTS is a list of possible meanings that
     * should all be considered to represent one token, return a list, ordered by tf.idf, of the types of those
     * terms.  If a term is a collection, all isas of it are considered.  If it's an individual,
     * all isas of the term are considered.  The idea is to return the type that cover most of the terms
     * in TERM-LIST, but perhaps leave out a few of the outliers.  It is not guaranteed that all
     * elements of TERM-LIST will have the highest-ranked term in the output-list as either an
     * isa or a genl.
     */
    @LispMethod(comment = "given a list of lists of CycL-terms TERM-LISTS (where each element of TERM-LISTS is a list of possible meanings that\r\nshould all be considered to represent one token, return a list, ordered by tf.idf, of the types of those\r\nterms.  If a term is a collection, all isas of it are considered.  If it\'s an individual,\r\nall isas of the term are considered.  The idea is to return the type that cover most of the terms\r\nin TERM-LIST, but perhaps leave out a few of the outliers.  It is not guaranteed that all\r\nelements of TERM-LIST will have the highest-ranked term in the output-list as either an\r\nisa or a genl.\ngiven a list of lists of CycL-terms TERM-LISTS (where each element of TERM-LISTS is a list of possible meanings that\nshould all be considered to represent one token, return a list, ordered by tf.idf, of the types of those\nterms.  If a term is a collection, all isas of it are considered.  If it\'s an individual,\nall isas of the term are considered.  The idea is to return the type that cover most of the terms\nin TERM-LIST, but perhaps leave out a few of the outliers.  It is not guaranteed that all\nelements of TERM-LIST will have the highest-ranked term in the output-list as either an\nisa or a genl.")
    public static final SubLObject best_isas_ordered_by_tfXidf_alt(SubLObject term_lists, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject term_count_dict = dictionary.new_dictionary(EQUAL, UNPROVIDED);
                SubLObject term_list_length = length(term_lists);
                SubLObject term_sets = NIL;
                {
                    SubLObject cdolist_list_var = term_lists;
                    SubLObject term_list = NIL;
                    for (term_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , term_list = cdolist_list_var.first()) {
                        {
                            SubLObject term_set = set.new_set(UNPROVIDED, UNPROVIDED);
                            SubLObject cdolist_list_var_10 = term_list;
                            SubLObject v_term = NIL;
                            for (v_term = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , v_term = cdolist_list_var_10.first()) {
                                {
                                    SubLObject upwards_closure = isa.all_isa(v_term, mt, UNPROVIDED);
                                    SubLObject cdolist_list_var_11 = upwards_closure;
                                    SubLObject genl = NIL;
                                    for (genl = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , genl = cdolist_list_var_11.first()) {
                                        set.set_add(genl, term_set);
                                    }
                                }
                            }
                            term_sets = cons(term_set, term_sets);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = term_sets;
                    SubLObject term_set = NIL;
                    for (term_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , term_set = cdolist_list_var.first()) {
                        {
                            SubLObject set_contents_var = set.do_set_internal(term_set);
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject elt = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, elt)) {
                                        dictionary_utilities.dictionary_increment(term_count_dict, elt, UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject tf_idf = NIL;
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(term_count_dict));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject v_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject count = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject term_frequency = multiply(count, multiply(new SubLObject[]{ log(count, UNPROVIDED) }));
                                tf_idf = cons(list(v_term, divide(multiply(term_frequency, com.cyc.cycjava.cycl.sksi.data_parser.term_log_idf_from_kb(v_term)), term_list_length), term_frequency, cardinality_estimates.generality_estimate(v_term), com.cyc.cycjava.cycl.sksi.data_parser.term_log_idf_from_kb(v_term)), tf_idf);
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    return Sort.sort(tf_idf, $sym50$_, SECOND);
                }
            }
        }
    }

    @LispMethod(comment = "given a list of lists of CycL-terms TERM-LISTS (where each element of TERM-LISTS is a list of possible meanings that\r\nshould all be considered to represent one token, return a list, ordered by tf.idf, of the types of those\r\nterms.  If a term is a collection, all isas of it are considered.  If it\'s an individual,\r\nall isas of the term are considered.  The idea is to return the type that cover most of the terms\r\nin TERM-LIST, but perhaps leave out a few of the outliers.  It is not guaranteed that all\r\nelements of TERM-LIST will have the highest-ranked term in the output-list as either an\r\nisa or a genl.\ngiven a list of lists of CycL-terms TERM-LISTS (where each element of TERM-LISTS is a list of possible meanings that\nshould all be considered to represent one token, return a list, ordered by tf.idf, of the types of those\nterms.  If a term is a collection, all isas of it are considered.  If it\'s an individual,\nall isas of the term are considered.  The idea is to return the type that cover most of the terms\nin TERM-LIST, but perhaps leave out a few of the outliers.  It is not guaranteed that all\nelements of TERM-LIST will have the highest-ranked term in the output-list as either an\nisa or a genl.")
    public static SubLObject best_isas_ordered_by_tfXidf(final SubLObject term_lists, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_count_dict = dictionary.new_dictionary(EQUAL, UNPROVIDED);
        final SubLObject term_list_length = length(term_lists);
        SubLObject term_sets = NIL;
        SubLObject cdolist_list_var = term_lists;
        SubLObject term_list = NIL;
        term_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject term_set = set.new_set(UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var_$10 = term_list;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var_$10.first();
            while (NIL != cdolist_list_var_$10) {
                SubLObject cdolist_list_var_$11;
                final SubLObject upwards_closure = cdolist_list_var_$11 = isa.all_isa(v_term, mt, UNPROVIDED);
                SubLObject genl = NIL;
                genl = cdolist_list_var_$11.first();
                while (NIL != cdolist_list_var_$11) {
                    set.set_add(genl, term_set);
                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                    genl = cdolist_list_var_$11.first();
                } 
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                v_term = cdolist_list_var_$10.first();
            } 
            term_sets = cons(term_set, term_sets);
            cdolist_list_var = cdolist_list_var.rest();
            term_list = cdolist_list_var.first();
        } 
        cdolist_list_var = term_sets;
        SubLObject term_set2 = NIL;
        term_set2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject set_contents_var = set.do_set_internal(term_set2);
            SubLObject basis_object;
            SubLObject state;
            SubLObject elt;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                elt = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, elt)) {
                    dictionary_utilities.dictionary_increment(term_count_dict, elt, UNPROVIDED);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            term_set2 = cdolist_list_var.first();
        } 
        SubLObject tf_idf = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(term_count_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject v_term2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject term_frequency = multiply(count, multiply(new SubLObject[]{ log(count, UNPROVIDED) }));
            tf_idf = cons(list(v_term2, divide(multiply(term_frequency, term_log_idf_from_kb(v_term2)), term_list_length), term_frequency, cardinality_estimates.generality_estimate(v_term2), term_log_idf_from_kb(v_term2)), tf_idf);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return Sort.sort(tf_idf, $sym48$_, SECOND);
    }/**
     * given a list of lists of CycL-terms TERM-LISTS (where each element of TERM-LISTS is a list of possible meanings that
     * should all be considered to represent one token, return a list, ordered by tf.idf, of the types of those
     * terms.  If a term is a collection, all isas of it are considered.  If it's an individual,
     * all isas of the term are considered.  The idea is to return the type that cover most of the terms
     * in TERM-LIST, but perhaps leave out a few of the outliers.  It is not guaranteed that all
     * elements of TERM-LIST will have the highest-ranked term in the output-list as either an
     * isa or a genl.
     */


    public static final SubLObject clear_data_parser_all_genls_alt() {
        {
            SubLObject cs = $data_parser_all_genls_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_data_parser_all_genls() {
        final SubLObject cs = $data_parser_all_genls_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_data_parser_all_genls_alt(SubLObject v_term, SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($data_parser_all_genls_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_data_parser_all_genls(final SubLObject v_term, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($data_parser_all_genls_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject data_parser_all_genls_internal_alt(SubLObject v_term, SubLObject mt) {
        return genls.all_genls(v_term, mt, UNPROVIDED);
    }

    public static SubLObject data_parser_all_genls_internal(final SubLObject v_term, final SubLObject mt) {
        return genls.all_genls(v_term, mt, UNPROVIDED);
    }

    public static final SubLObject data_parser_all_genls_alt(SubLObject v_term, SubLObject mt) {
        {
            SubLObject caching_state = $data_parser_all_genls_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(DATA_PARSER_ALL_GENLS, $data_parser_all_genls_caching_state$, $int$5000, EQUAL, TWO_INTEGER, ZERO_INTEGER);
                memoization_state.register_genls_dependent_cache_clear_callback(CLEAR_DATA_PARSER_ALL_GENLS);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw17$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (v_term.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.data_parser.data_parser_all_genls_internal(v_term, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject data_parser_all_genls(final SubLObject v_term, final SubLObject mt) {
        SubLObject caching_state = $data_parser_all_genls_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(DATA_PARSER_ALL_GENLS, $data_parser_all_genls_caching_state$, $int$5000, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_genls_dependent_cache_clear_callback(CLEAR_DATA_PARSER_ALL_GENLS);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(data_parser_all_genls_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject clear_data_parser_all_isa_alt() {
        {
            SubLObject cs = $data_parser_all_isa_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_data_parser_all_isa() {
        final SubLObject cs = $data_parser_all_isa_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_data_parser_all_isa_alt(SubLObject v_term, SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($data_parser_all_isa_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_data_parser_all_isa(final SubLObject v_term, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($data_parser_all_isa_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject data_parser_all_isa_internal_alt(SubLObject v_term, SubLObject mt) {
        return isa.all_isa(v_term, mt, UNPROVIDED);
    }

    public static SubLObject data_parser_all_isa_internal(final SubLObject v_term, final SubLObject mt) {
        return isa.all_isa(v_term, mt, UNPROVIDED);
    }

    public static final SubLObject data_parser_all_isa_alt(SubLObject v_term, SubLObject mt) {
        {
            SubLObject caching_state = $data_parser_all_isa_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(DATA_PARSER_ALL_ISA, $data_parser_all_isa_caching_state$, $int$5000, EQUAL, TWO_INTEGER, ZERO_INTEGER);
                memoization_state.register_isa_dependent_cache_clear_callback(CLEAR_DATA_PARSER_ALL_ISA);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw17$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (v_term.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.data_parser.data_parser_all_isa_internal(v_term, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(v_term, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject data_parser_all_isa(final SubLObject v_term, final SubLObject mt) {
        SubLObject caching_state = $data_parser_all_isa_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(DATA_PARSER_ALL_ISA, $data_parser_all_isa_caching_state$, $int$5000, EQUAL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_isa_dependent_cache_clear_callback(CLEAR_DATA_PARSER_ALL_ISA);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(data_parser_all_isa_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
        return memoization_state.caching_results(results3);
    }

    /**
     * This function tries to determine the type of the strings in STRING-LIST, and returns
     * a list of types, along with the strength of its belief that this is the correct type
     * for the list.  It will not necessarily be the case that each of the elements in the list
     * will be of the types listed in the return list.
     *
     * @unknown [insert something here]
     * @param STRING-LIST
     * 		listp; a list of strings
     * @return listp; a list of 2-element lists, each of which is a Cyc-term and a weight
     */
    @LispMethod(comment = "This function tries to determine the type of the strings in STRING-LIST, and returns\r\na list of types, along with the strength of its belief that this is the correct type\r\nfor the list.  It will not necessarily be the case that each of the elements in the list\r\nwill be of the types listed in the return list.\r\n\r\n@unknown [insert something here]\r\n@param STRING-LIST\r\n\t\tlistp; a list of strings\r\n@return listp; a list of 2-element lists, each of which is a Cyc-term and a weight\nThis function tries to determine the type of the strings in STRING-LIST, and returns\na list of types, along with the strength of its belief that this is the correct type\nfor the list.  It will not necessarily be the case that each of the elements in the list\nwill be of the types listed in the return list.")
    public static final SubLObject best_types_for_strings_ordered_by_tfXidf_alt(SubLObject string_list, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        {
            SubLObject terms = Mapping.mapcar(ETL_PARSE_VALUE, string_list);
            return com.cyc.cycjava.cycl.sksi.data_parser.best_types_ordered_by_tfXidf(terms, mt);
        }
    }

    @LispMethod(comment = "This function tries to determine the type of the strings in STRING-LIST, and returns\r\na list of types, along with the strength of its belief that this is the correct type\r\nfor the list.  It will not necessarily be the case that each of the elements in the list\r\nwill be of the types listed in the return list.\r\n\r\n@unknown [insert something here]\r\n@param STRING-LIST\r\n\t\tlistp; a list of strings\r\n@return listp; a list of 2-element lists, each of which is a Cyc-term and a weight\nThis function tries to determine the type of the strings in STRING-LIST, and returns\na list of types, along with the strength of its belief that this is the correct type\nfor the list.  It will not necessarily be the case that each of the elements in the list\nwill be of the types listed in the return list.")
    public static SubLObject best_types_for_strings_ordered_by_tfXidf(final SubLObject string_list, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLObject terms = Mapping.mapcar(ETL_PARSE_VALUE, string_list);
        return best_types_ordered_by_tfXidf(terms, mt);
    }/**
     * This function tries to determine the type of the strings in STRING-LIST, and returns
     * a list of types, along with the strength of its belief that this is the correct type
     * for the list.  It will not necessarily be the case that each of the elements in the list
     * will be of the types listed in the return list.
     *
     * @unknown [insert something here]
     * @param STRING-LIST
     * 		listp; a list of strings
     * @return listp; a list of 2-element lists, each of which is a Cyc-term and a weight
     */


    public static SubLObject declare_data_parser_file() {
        declareFunction("semantic_etl_parse_data", "SEMANTIC-ETL-PARSE-DATA", 2, 0, false);
        declareFunction("semantic_etl_acquire_and_add_data", "SEMANTIC-ETL-ACQUIRE-AND-ADD-DATA", 2, 0, false);
        declareFunction("semantic_etl_acquire_data_list", "SEMANTIC-ETL-ACQUIRE-DATA-LIST", 2, 0, false);
        declareFunction("semantic_etl_acquire_data", "SEMANTIC-ETL-ACQUIRE-DATA", 2, 0, false);
        declareFunction("semantic_etl_add_data_list", "SEMANTIC-ETL-ADD-DATA-LIST", 2, 1, false);
        declareFunction("semantic_etl_add_data", "SEMANTIC-ETL-ADD-DATA", 2, 1, false);
        declareFunction("convert_values_semantics_to_boolean_values", "CONVERT-VALUES-SEMANTICS-TO-BOOLEAN-VALUES", 1, 0, false);
        declareFunction("semantic_etl_parse_value", "SEMANTIC-ETL-PARSE-VALUE", 1, 0, false);
        declareFunction("semantic_etl_parse_value_int_internal", "SEMANTIC-ETL-PARSE-VALUE-INT-INTERNAL", 1, 0, false);
        declareFunction("semantic_etl_parse_value_int", "SEMANTIC-ETL-PARSE-VALUE-INT", 1, 0, false);
        declareFunction("semantic_etl_all_isa", "SEMANTIC-ETL-ALL-ISA", 1, 0, false);
        declareFunction("semantic_etl_irrelevant_termP", "SEMANTIC-ETL-IRRELEVANT-TERM?", 1, 0, false);
        declareFunction("clear_semantic_etl_upper_ontology_termP", "CLEAR-SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?", 0, 0, false);
        declareFunction("remove_semantic_etl_upper_ontology_termP", "REMOVE-SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?", 1, 0, false);
        declareFunction("semantic_etl_upper_ontology_termP_internal", "SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?-INTERNAL", 1, 0, false);
        declareFunction("semantic_etl_upper_ontology_termP", "SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?", 1, 0, false);
        declareFunction("etl_metadata_lexicon", "ETL-METADATA-LEXICON", 0, 0, false);
        declareFunction("etl_data_lexicon", "ETL-DATA-LEXICON", 0, 1, false);
        declareFunction("etl_parse_value_trampoline", "ETL-PARSE-VALUE-TRAMPOLINE", 1, 2, false);
        declareFunction("etl_parse_value", "ETL-PARSE-VALUE", 1, 2, false);
        declareFunction("np_stringP", "NP-STRING?", 1, 0, false);
        declareFunction("remove_first_word", "REMOVE-FIRST-WORD", 1, 0, false);
        declareFunction("term_log_idf_from_kb", "TERM-LOG-IDF-FROM-KB", 1, 0, false);
        declareFunction("best_types_ordered_by_tfXidf", "BEST-TYPES-ORDERED-BY-TF.IDF", 1, 1, false);
        declareFunction("best_isas_ordered_by_tfXidf", "BEST-ISAS-ORDERED-BY-TF.IDF", 1, 1, false);
        declareFunction("clear_data_parser_all_genls", "CLEAR-DATA-PARSER-ALL-GENLS", 0, 0, false);
        declareFunction("remove_data_parser_all_genls", "REMOVE-DATA-PARSER-ALL-GENLS", 2, 0, false);
        declareFunction("data_parser_all_genls_internal", "DATA-PARSER-ALL-GENLS-INTERNAL", 2, 0, false);
        declareFunction("data_parser_all_genls", "DATA-PARSER-ALL-GENLS", 2, 0, false);
        declareFunction("clear_data_parser_all_isa", "CLEAR-DATA-PARSER-ALL-ISA", 0, 0, false);
        new data_parser.$clear_data_parser_all_isa$ZeroArityFunction();
        declareFunction("remove_data_parser_all_isa", "REMOVE-DATA-PARSER-ALL-ISA", 2, 0, false);
        declareFunction("data_parser_all_isa_internal", "DATA-PARSER-ALL-ISA-INTERNAL", 2, 0, false);
        declareFunction("data_parser_all_isa", "DATA-PARSER-ALL-ISA", 2, 0, false);
        declareFunction("best_types_for_strings_ordered_by_tfXidf", "BEST-TYPES-FOR-STRINGS-ORDERED-BY-TF.IDF", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_data_parser_file_alt() {
        defparameter("*DATA-PARSER-ROW-SAMPLING-LIMIT*", TWENTY_INTEGER);
        defparameter("*BOTTOM-OF-UPPER-ONTOLOGY*", $$IntentionalMentalSituation);
        defparameter("*BOTTOM-OF-UPPER-ONTOLOGY-GENERALITY-ESTIMATE*", NIL);
        deflexical("*SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?-CACHING-STATE*", NIL);
        defparameter("*ETL-DATA-LEXICON*", NIL);
        defparameter("*ETL-METADATA-LEXICON*", NIL);
        defparameter("*ETL-DATA-FILTER-SPEC*", $list_alt24);
        deflexical("*DATA-PARSER-ALL-GENLS-CACHING-STATE*", NIL);
        deflexical("*DATA-PARSER-ALL-ISA-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject init_data_parser_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*DATA-PARSER-ROW-SAMPLING-LIMIT*", TWENTY_INTEGER);
            defparameter("*BOTTOM-OF-UPPER-ONTOLOGY*", $$IntentionalMentalSituation);
            defparameter("*BOTTOM-OF-UPPER-ONTOLOGY-GENERALITY-ESTIMATE*", NIL);
            deflexical("*SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?-CACHING-STATE*", NIL);
            defparameter("*ETL-DATA-LEXICON*", NIL);
            defparameter("*ETL-METADATA-LEXICON*", NIL);
            defparameter("*ETL-DATA-FILTER-SPEC*", $list22);
            deflexical("*DATA-PARSER-ALL-GENLS-CACHING-STATE*", NIL);
            deflexical("*DATA-PARSER-ALL-ISA-CACHING-STATE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*ETL-DATA-FILTER-SPEC*", $list_alt24);
        }
        return NIL;
    }

    public static SubLObject init_data_parser_file_Previous() {
        defparameter("*DATA-PARSER-ROW-SAMPLING-LIMIT*", TWENTY_INTEGER);
        defparameter("*BOTTOM-OF-UPPER-ONTOLOGY*", $$IntentionalMentalSituation);
        defparameter("*BOTTOM-OF-UPPER-ONTOLOGY-GENERALITY-ESTIMATE*", NIL);
        deflexical("*SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?-CACHING-STATE*", NIL);
        defparameter("*ETL-DATA-LEXICON*", NIL);
        defparameter("*ETL-METADATA-LEXICON*", NIL);
        defparameter("*ETL-DATA-FILTER-SPEC*", $list22);
        deflexical("*DATA-PARSER-ALL-GENLS-CACHING-STATE*", NIL);
        deflexical("*DATA-PARSER-ALL-ISA-CACHING-STATE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_data_parser_file_alt() {
        memoization_state.note_memoized_function(SEMANTIC_ETL_PARSE_VALUE_INT);
        memoization_state.note_globally_cached_function($sym21$SEMANTIC_ETL_UPPER_ONTOLOGY_TERM_);
        memoization_state.note_globally_cached_function(DATA_PARSER_ALL_GENLS);
        memoization_state.note_globally_cached_function(DATA_PARSER_ALL_ISA);
        return NIL;
    }

    public static SubLObject setup_data_parser_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_memoized_function(SEMANTIC_ETL_PARSE_VALUE_INT);
            memoization_state.note_globally_cached_function($sym19$SEMANTIC_ETL_UPPER_ONTOLOGY_TERM_);
            memoization_state.note_globally_cached_function(DATA_PARSER_ALL_GENLS);
            memoization_state.note_globally_cached_function(DATA_PARSER_ALL_ISA);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_globally_cached_function($sym21$SEMANTIC_ETL_UPPER_ONTOLOGY_TERM_);
        }
        return NIL;
    }

    public static SubLObject setup_data_parser_file_Previous() {
        memoization_state.note_memoized_function(SEMANTIC_ETL_PARSE_VALUE_INT);
        memoization_state.note_globally_cached_function($sym19$SEMANTIC_ETL_UPPER_ONTOLOGY_TERM_);
        memoization_state.note_globally_cached_function(DATA_PARSER_ALL_GENLS);
        memoization_state.note_globally_cached_function(DATA_PARSER_ALL_ISA);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_data_parser_file();
    }

    @Override
    public void initializeVariables() {
        init_data_parser_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_data_parser_file();
    }

    static {
    }

    public static final class $clear_data_parser_all_isa$ZeroArityFunction extends ZeroArityFunction {
        public $clear_data_parser_all_isa$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-DATA-PARSER-ALL-ISA"));
        }

        @Override
        public SubLObject processItem() {
            return clear_data_parser_all_isa();
        }
    }

    static private final SubLString $str_alt2$Problem_opening_connection_to_dat = makeString("Problem opening connection to database ~s");

    static private final SubLString $str_alt3$select___from_ = makeString("select * from ");

    static private final SubLString $str_alt4$_LIMIT_ = makeString(" LIMIT ");

    static private final SubLString $str_alt5$_ = makeString(";");

    static private final SubLString $str_alt6$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt7$Expected__a_columns_but_got_a_row = makeString("Expected ~a columns but got a row with ~a columns: ~s");

    static private final SubLSymbol $sym15$SEMANTIC_ETL_IRRELEVANT_TERM_ = makeSymbol("SEMANTIC-ETL-IRRELEVANT-TERM?");

    public static final SubLSymbol $kw17$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym21$SEMANTIC_ETL_UPPER_ONTOLOGY_TERM_ = makeSymbol("SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?");

    static private final SubLSymbol $sym22$_SEMANTIC_ETL_UPPER_ONTOLOGY_TERM__CACHING_STATE_ = makeSymbol("*SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?-CACHING-STATE*");

    static private final SubLList $list_alt24 = list(reader_make_constant_shell("ConceptFilterSpecificationFn"), reader_make_constant_shell("TaxonomyOfEasilyUnderstandableConcepts"), reader_make_constant_shell("ConceptOnlyFilterParameter"), reader_make_constant_shell("TriggerFromConcept"));

    static private final SubLSymbol $sym50$_ = makeSymbol(">");
}

/**
 * Total time: 254 ms
 */
