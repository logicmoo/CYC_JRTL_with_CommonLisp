package com.cyc.cycjava.cycl.sksi;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.abstract_lexicon;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.defns;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.nl_api_datastructures;
import com.cyc.cycjava.cycl.nl_parsing_api;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.parser;
import com.cyc.cycjava.cycl.rkf_relevance_utilities;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.term_lexicon;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class data_parser extends SubLTranslatedFile {
    public static final SubLFile me = new data_parser();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.data_parser";

    public static final String myFingerPrint = "de87deb4af96da12aa05e5b18ab9e957b3f1d983e4851d7d90b2db7df289d0df";

    // defparameter
    // Definitions
    private static final SubLSymbol $data_parser_row_sampling_limit$ = makeSymbol("*DATA-PARSER-ROW-SAMPLING-LIMIT*");

    // defparameter
    private static final SubLSymbol $bottom_of_upper_ontology$ = makeSymbol("*BOTTOM-OF-UPPER-ONTOLOGY*");

    // defparameter
    private static final SubLSymbol $bottom_of_upper_ontology_generality_estimate$ = makeSymbol("*BOTTOM-OF-UPPER-ONTOLOGY-GENERALITY-ESTIMATE*");

    // deflexical
    private static final SubLSymbol $semantic_etl_upper_ontology_termP_caching_state$ = makeSymbol("*SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?-CACHING-STATE*");

    // defparameter
    private static final SubLSymbol $etl_data_lexicon$ = makeSymbol("*ETL-DATA-LEXICON*");

    // defparameter
    private static final SubLSymbol $etl_metadata_lexicon$ = makeSymbol("*ETL-METADATA-LEXICON*");

    // defparameter
    private static final SubLSymbol $etl_data_filter_spec$ = makeSymbol("*ETL-DATA-FILTER-SPEC*");







    public static final SubLSymbol SEMANTICS_P = makeSymbol("SEMANTICS-P");

    public static final SubLString $str2$Problem_opening_connection_to_dat = makeString("Problem opening connection to database ~s");

    public static final SubLString $str3$select___from_ = makeString("select * from ");

    public static final SubLString $$$_LIMIT_ = makeString(" LIMIT ");

    public static final SubLString $str5$_ = makeString(";");

    private static final SubLString $str6$Expected__a_columns_but_got_a_row = makeString("Expected ~a columns but got a row with ~a columns: ~s");



    private static final SubLString $$$bool = makeString("bool");

    private static final SubLString $$$f = makeString("f");

    private static final SubLString $$$t = makeString("t");

    private static final SubLSymbol SEMANTIC_ETL_PARSE_VALUE_INT = makeSymbol("SEMANTIC-ETL-PARSE-VALUE-INT");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLSymbol $sym14$SEMANTIC_ETL_IRRELEVANT_TERM_ = makeSymbol("SEMANTIC-ETL-IRRELEVANT-TERM?");

    private static final SubLSymbol SEMANTIC_ETL_ALL_ISA = makeSymbol("SEMANTIC-ETL-ALL-ISA");



    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLObject $$IntentionalMentalSituation = reader_make_constant_shell(makeString("IntentionalMentalSituation"));

    private static final SubLSymbol $sym19$SEMANTIC_ETL_UPPER_ONTOLOGY_TERM_ = makeSymbol("SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?");

    private static final SubLSymbol $sym20$_SEMANTIC_ETL_UPPER_ONTOLOGY_TERM__CACHING_STATE_ = makeSymbol("*SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?-CACHING-STATE*");

    private static final SubLInteger $int$100000 = makeInteger(100000);

    private static final SubLList $list22 = list(reader_make_constant_shell(makeString("ConceptFilterSpecificationFn")), reader_make_constant_shell(makeString("TaxonomyOfEasilyUnderstandableConcepts")), reader_make_constant_shell(makeString("ConceptOnlyFilterParameter")), reader_make_constant_shell(makeString("TriggerFromConcept")));



    private static final SubLSymbol SIMPLE_DATE_FROM_STRING_LEARN = makeSymbol("SIMPLE-DATE-FROM-STRING-LEARN");





    private static final SubLObject $$middleName = reader_make_constant_shell(makeString("middleName"));

    private static final SubLObject $$familyName = reader_make_constant_shell(makeString("familyName"));

    private static final SubLObject $$lastName = reader_make_constant_shell(makeString("lastName"));

    private static final SubLObject $$ksTermString = reader_make_constant_shell(makeString("ksTermString"));



    private static final SubLObject $$countryCodeDigraph = reader_make_constant_shell(makeString("countryCodeDigraph"));

    private static final SubLObject $$countryCodeTrigraph = reader_make_constant_shell(makeString("countryCodeTrigraph"));







    private static final SubLObject $$CyclishMt = reader_make_constant_shell(makeString("CyclishMt"));

    private static final SubLObject $$ComputereseLexicalMt = reader_make_constant_shell(makeString("ComputereseLexicalMt"));



    private static final SubLObject $$Verb = reader_make_constant_shell(makeString("Verb"));

    private static final SubLString $$$DBFusionLexicalMt = makeString("DBFusionLexicalMt");



    private static final SubLObject $$DBFusionLexicalMt = reader_make_constant_shell(makeString("DBFusionLexicalMt"));





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

    public static SubLObject semantic_etl_parse_data(final SubLObject access_paths, final SubLObject semantics_list) {
        assert NIL != list_utilities.non_dotted_list_p(semantics_list) : "list_utilities.non_dotted_list_p(semantics_list) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(semantics_list) " + semantics_list;
        SubLObject cdolist_list_var = semantics_list;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != semantic_etl_bus.semantics_p(elem) : "semantic_etl_bus.semantics_p(elem) " + "CommonSymbols.NIL != semantic_etl_bus.semantics_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return semantic_etl_add_data_list(semantic_etl_acquire_data_list(access_paths, semantics_list), semantics_list, UNPROVIDED);
    }

    public static SubLObject semantic_etl_acquire_and_add_data(final SubLObject access_path, final SubLObject semantics) {
        final SubLObject data = semantic_etl_acquire_data(access_path, semantics);
        return semantic_etl_add_data(data, semantics, NIL);
    }

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

    public static SubLObject semantic_etl_parse_value(final SubLObject value) {
        return value.isString() ? semantic_etl_parse_value_int(value) : NIL;
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

    public static SubLObject semantic_etl_all_isa(final SubLObject v_term) {
        final SubLObject sbhl_isas = isa.all_isa(v_term, UNPROVIDED, UNPROVIDED);
        final SubLObject defn_isas = Mapping.mapcan(ALL_GENLS, defns.min_defn_admits(v_term, UNPROVIDED), EMPTY_SUBL_OBJECT_ARRAY);
        return union(sbhl_isas, defn_isas, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject semantic_etl_irrelevant_termP(final SubLObject v_term) {
        return makeBoolean((NIL != semantic_etl_upper_ontology_termP(v_term)) || (NIL != rkf_relevance_utilities.rkf_irrelevant_term(v_term, $$InferencePSC)));
    }

    public static SubLObject clear_semantic_etl_upper_ontology_termP() {
        final SubLObject cs = $semantic_etl_upper_ontology_termP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_semantic_etl_upper_ontology_termP(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($semantic_etl_upper_ontology_termP_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject semantic_etl_upper_ontology_termP_internal(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!$bottom_of_upper_ontology_generality_estimate$.getDynamicValue(thread).isNumber()) {
            $bottom_of_upper_ontology_generality_estimate$.setDynamicValue(cardinality_estimates.generality_estimate($bottom_of_upper_ontology$.getDynamicValue(thread)), thread);
        }
        return numGE(cardinality_estimates.generality_estimate(v_term), $bottom_of_upper_ontology_generality_estimate$.getDynamicValue(thread));
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

    public static SubLObject etl_metadata_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == term_lexicon.term_lexicon_p($etl_metadata_lexicon$.getDynamicValue(thread))) {
            $etl_metadata_lexicon$.setDynamicValue(term_lexicon.new_term_lexicon(), thread);
        }
        return $etl_metadata_lexicon$.getDynamicValue(thread);
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

    public static SubLObject etl_parse_value_trampoline(final SubLObject string, SubLObject allow_partial_interpsP, SubLObject lexicon) {
        if (allow_partial_interpsP == UNPROVIDED) {
            allow_partial_interpsP = T;
        }
        if (lexicon == UNPROVIDED) {
            lexicon = etl_data_lexicon(UNPROVIDED);
        }
        return etl_parse_value(string, allow_partial_interpsP, lexicon);
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

    public static SubLObject remove_first_word(final SubLObject string) {
        final SubLObject strings = string_utilities.split_string(string, UNPROVIDED);
        return string_utilities.left_trim_whitespace(string_utilities.replace_substring_once(string, strings.first(), $str46$, UNPROVIDED));
    }

    public static SubLObject term_log_idf_from_kb(final SubLObject v_term) {
        SubLObject generality_estimate = cardinality_estimates.generality_estimate(v_term);
        if (generality_estimate.numLE(ONE_INTEGER)) {
            generality_estimate = TWO_INTEGER;
        }
        return divide(ONE_INTEGER, log(generality_estimate, UNPROVIDED));
    }

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
    }

    public static SubLObject clear_data_parser_all_genls() {
        final SubLObject cs = $data_parser_all_genls_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_data_parser_all_genls(final SubLObject v_term, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($data_parser_all_genls_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject data_parser_all_genls_internal(final SubLObject v_term, final SubLObject mt) {
        return genls.all_genls(v_term, mt, UNPROVIDED);
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

    public static SubLObject clear_data_parser_all_isa() {
        final SubLObject cs = $data_parser_all_isa_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_data_parser_all_isa(final SubLObject v_term, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($data_parser_all_isa_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject data_parser_all_isa_internal(final SubLObject v_term, final SubLObject mt) {
        return isa.all_isa(v_term, mt, UNPROVIDED);
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

    public static SubLObject best_types_for_strings_ordered_by_tfXidf(final SubLObject string_list, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLObject terms = Mapping.mapcar(ETL_PARSE_VALUE, string_list);
        return best_types_ordered_by_tfXidf(terms, mt);
    }

    public static SubLObject declare_data_parser_file() {
        declareFunction(me, "semantic_etl_parse_data", "SEMANTIC-ETL-PARSE-DATA", 2, 0, false);
        declareFunction(me, "semantic_etl_acquire_and_add_data", "SEMANTIC-ETL-ACQUIRE-AND-ADD-DATA", 2, 0, false);
        declareFunction(me, "semantic_etl_acquire_data_list", "SEMANTIC-ETL-ACQUIRE-DATA-LIST", 2, 0, false);
        declareFunction(me, "semantic_etl_acquire_data", "SEMANTIC-ETL-ACQUIRE-DATA", 2, 0, false);
        declareFunction(me, "semantic_etl_add_data_list", "SEMANTIC-ETL-ADD-DATA-LIST", 2, 1, false);
        declareFunction(me, "semantic_etl_add_data", "SEMANTIC-ETL-ADD-DATA", 2, 1, false);
        declareFunction(me, "convert_values_semantics_to_boolean_values", "CONVERT-VALUES-SEMANTICS-TO-BOOLEAN-VALUES", 1, 0, false);
        declareFunction(me, "semantic_etl_parse_value", "SEMANTIC-ETL-PARSE-VALUE", 1, 0, false);
        declareFunction(me, "semantic_etl_parse_value_int_internal", "SEMANTIC-ETL-PARSE-VALUE-INT-INTERNAL", 1, 0, false);
        declareFunction(me, "semantic_etl_parse_value_int", "SEMANTIC-ETL-PARSE-VALUE-INT", 1, 0, false);
        declareFunction(me, "semantic_etl_all_isa", "SEMANTIC-ETL-ALL-ISA", 1, 0, false);
        declareFunction(me, "semantic_etl_irrelevant_termP", "SEMANTIC-ETL-IRRELEVANT-TERM?", 1, 0, false);
        declareFunction(me, "clear_semantic_etl_upper_ontology_termP", "CLEAR-SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?", 0, 0, false);
        declareFunction(me, "remove_semantic_etl_upper_ontology_termP", "REMOVE-SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?", 1, 0, false);
        declareFunction(me, "semantic_etl_upper_ontology_termP_internal", "SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?-INTERNAL", 1, 0, false);
        declareFunction(me, "semantic_etl_upper_ontology_termP", "SEMANTIC-ETL-UPPER-ONTOLOGY-TERM?", 1, 0, false);
        declareFunction(me, "etl_metadata_lexicon", "ETL-METADATA-LEXICON", 0, 0, false);
        declareFunction(me, "etl_data_lexicon", "ETL-DATA-LEXICON", 0, 1, false);
        declareFunction(me, "etl_parse_value_trampoline", "ETL-PARSE-VALUE-TRAMPOLINE", 1, 2, false);
        declareFunction(me, "etl_parse_value", "ETL-PARSE-VALUE", 1, 2, false);
        declareFunction(me, "np_stringP", "NP-STRING?", 1, 0, false);
        declareFunction(me, "remove_first_word", "REMOVE-FIRST-WORD", 1, 0, false);
        declareFunction(me, "term_log_idf_from_kb", "TERM-LOG-IDF-FROM-KB", 1, 0, false);
        declareFunction(me, "best_types_ordered_by_tfXidf", "BEST-TYPES-ORDERED-BY-TF.IDF", 1, 1, false);
        declareFunction(me, "best_isas_ordered_by_tfXidf", "BEST-ISAS-ORDERED-BY-TF.IDF", 1, 1, false);
        declareFunction(me, "clear_data_parser_all_genls", "CLEAR-DATA-PARSER-ALL-GENLS", 0, 0, false);
        declareFunction(me, "remove_data_parser_all_genls", "REMOVE-DATA-PARSER-ALL-GENLS", 2, 0, false);
        declareFunction(me, "data_parser_all_genls_internal", "DATA-PARSER-ALL-GENLS-INTERNAL", 2, 0, false);
        declareFunction(me, "data_parser_all_genls", "DATA-PARSER-ALL-GENLS", 2, 0, false);
        declareFunction(me, "clear_data_parser_all_isa", "CLEAR-DATA-PARSER-ALL-ISA", 0, 0, false);
        new data_parser.$clear_data_parser_all_isa$ZeroArityFunction();
        declareFunction(me, "remove_data_parser_all_isa", "REMOVE-DATA-PARSER-ALL-ISA", 2, 0, false);
        declareFunction(me, "data_parser_all_isa_internal", "DATA-PARSER-ALL-ISA-INTERNAL", 2, 0, false);
        declareFunction(me, "data_parser_all_isa", "DATA-PARSER-ALL-ISA", 2, 0, false);
        declareFunction(me, "best_types_for_strings_ordered_by_tfXidf", "BEST-TYPES-FOR-STRINGS-ORDERED-BY-TF.IDF", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_data_parser_file() {
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

    public static SubLObject setup_data_parser_file() {
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

    

    public static final class $clear_data_parser_all_isa$ZeroArityFunction extends ZeroArityFunction {
        public $clear_data_parser_all_isa$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-DATA-PARSER-ALL-ISA"));
        }

        @Override
        public SubLObject processItem() {
            return clear_data_parser_all_isa();
        }
    }
}

/**
 * Total time: 254 ms
 */
