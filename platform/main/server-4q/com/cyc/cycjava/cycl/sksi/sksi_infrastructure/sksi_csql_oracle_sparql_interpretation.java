package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;


import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_oracle_sparql_interpretation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_oracle_sparql_interpretation.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sksi_csql_oracle_sparql_interpretation extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_csql_oracle_sparql_interpretation();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_oracle_sparql_interpretation";

    public static final String myFingerPrint = "858a090fd99851e0042eb73be88bf39bddf3bd943e6a1ad35811b0cfc9bb2440";

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("SELECT-KEYWORD"), makeSymbol("FIELDS"), makeSymbol("FROM"), makeSymbol("&OPTIONAL"), makeSymbol("WHERE"), makeSymbol("LIMIT"), makeSymbol("OFFSET"));

    private static final SubLSymbol $sym1$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list2 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);





    private static final SubLString $str5$malformed_csql_expression__a__exp = makeString("malformed csql expression ~a, expected :select");



    private static final SubLString $str7$_A = makeString("~A");

    private static final SubLString $$$SELECT_ = makeString("SELECT ");

    private static final SubLString $str9$FROM_TABLE_SEM_MATCH_ = makeString("FROM TABLE(SEM_MATCH(");

    private static final SubLString $str10$__ = makeString("'{");

    private static final SubLString $str11$___ = makeString("}',");

    private static final SubLString $str12$SEM_MODELS__CCF___ = makeString("SEM_MODELS('CCF'),");

    private static final SubLString $str13$null_ = makeString("null,");

    private static final SubLString $str14$_ = makeString(",");

    private static final SubLString $str15$null___ = makeString("null));");

    private static final SubLString $str16$_ = makeString("*");

    private static final SubLList $list17 = list(makeSymbol("VARIABLES-KEYWORD"), makeSymbol("&REST"), makeSymbol("VARIABLES"));



    private static final SubLString $str19$malformed_csql_expression__a__exp = makeString("malformed csql expression ~a, expected :variables");

    private static final SubLString $str20$__ = makeString(", ");

    private static final SubLString $str21$SEM_ALIASES_ = makeString("SEM_ALIASES(");

    private static final SubLString $str22$ = makeString("");

    private static final SubLList $list23 = cons(makeSymbol("PREFIX"), makeSymbol("PREFIX-URI"));

    private static final SubLString $str24$_ = makeString(")");

    private static final SubLString $str25$_SEM_ALIAS_ = makeString(" SEM_ALIAS(");

    private static final SubLString $str26$_ = makeString("'");

    private static final SubLSymbol TEST_CSQL_TO_ORACLE_SPARQL = makeSymbol("TEST-CSQL-TO-ORACLE-SPARQL");













    private static final SubLList $list34 = list(list(list(list(makeKeyword("SELECT"), list(list(makeKeyword("FIELD"), makeString("subject"), makeString("default"))), list(makeKeyword("FROM"), list(list(makeKeyword("TABLE"), makeString("default")))), list(makeKeyword("WHERE"), list(list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("predicate"), makeString("default")), makeString("rdf:type")), list(reader_make_constant_shell(makeString("CSQLEquals")), list(makeKeyword("FIELD"), makeString("object"), makeString("default")), makeString("foo"))))), list(cons(reader_make_constant_shell(makeString("baseNamespaceForSKS")), makeString("http://www.clevelandclinic.org/heartcenter/ontologies/DataNodes.owl#")), list(reader_make_constant_shell(makeString("nameSpacePrefixForSKS")), cons(makeString("owl"), makeString("http://www/w3.org/2000/07/owl#")), cons(makeString("ptrec"), makeString("http://clevelandclinicfoundation.org/cidr/patientrecord#")), cons(makeString("rdf"), makeString("http://www/w3.org/2000/02/22-rdf-syntax-ns#")), cons(makeString("rdfs"), makeString("http://www/w3.org/2000/01/rdf-schema#")), cons(makeString("xsd"), makeString("http://www.w3.org/2001/XMLSchema#"))))), makeString("SELECT subj\nFROM TABLE(SEM_MATCH(\n\'{\n  ?subj rdf:type \"foo\"  .\n}\',\nSEM_MODELS(\'CCF\'),\nnull,\nSEM_ALIASES(\n SEM_ALIAS(\'\', \'http://www.clevelandclinic.org/heartcenter/ontologies/DataNodes.owl#\'),\n SEM_ALIAS(\'owl\', \'http://www/w3.org/2000/07/owl#\'),\n SEM_ALIAS(\'ptrec\', \'http://clevelandclinicfoundation.org/cidr/patientrecord#\'),\n SEM_ALIAS(\'rdf\', \'http://www/w3.org/2000/02/22-rdf-syntax-ns#\'),\n SEM_ALIAS(\'rdfs\', \'http://www/w3.org/2000/01/rdf-schema#\'),\n SEM_ALIAS(\'xsd\', \'http://www.w3.org/2001/XMLSchema#\')),\nnull));")));

    public static SubLObject csql_to_oracle_sparql(final SubLObject csql, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            SubLObject select_keyword = NIL;
            SubLObject fields = NIL;
            SubLObject from = NIL;
            destructuring_bind_must_consp(csql, csql, $list0);
            select_keyword = csql.first();
            SubLObject current = csql.rest();
            destructuring_bind_must_consp(current, csql, $list0);
            fields = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, csql, $list0);
            from = current.first();
            current = current.rest();
            final SubLObject where = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, csql, $list0);
            current = current.rest();
            final SubLObject limit = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, csql, $list0);
            current = current.rest();
            final SubLObject offset = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, csql, $list0);
            current = current.rest();
            if (NIL == current) {
                SubLObject message_var = NIL;
                final SubLObject was_appendingP = eval($sym1$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
                eval($list2);
                try {
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($SELECT != select_keyword)) {
                                    Errors.error($str5$malformed_csql_expression__a__exp, csql);
                                }
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                } finally {
                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        eval(list(CSETQ, $sym1$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                    }
                }
                if (message_var.isString()) {
                    Errors.warn($str7$_A, message_var);
                }
                final SubLObject fields_string = csql_to_sparql_oracle_fields(fields);
                final SubLObject where_string = csql_to_sparql_oracle_where(where, access_path);
                final SubLObject alias_string = sparql_oracle_compute_alias(access_path);
                write_string($$$SELECT_, stream, UNPROVIDED, UNPROVIDED);
                write_string(fields_string, stream, UNPROVIDED, UNPROVIDED);
                terpri(stream);
                write_string($str9$FROM_TABLE_SEM_MATCH_, stream, UNPROVIDED, UNPROVIDED);
                terpri(stream);
                write_string($str10$__, stream, UNPROVIDED, UNPROVIDED);
                terpri(stream);
                write_string(where_string, stream, UNPROVIDED, UNPROVIDED);
                write_string($str11$___, stream, UNPROVIDED, UNPROVIDED);
                terpri(stream);
                write_string($str12$SEM_MODELS__CCF___, stream, UNPROVIDED, UNPROVIDED);
                terpri(stream);
                write_string($str13$null_, stream, UNPROVIDED, UNPROVIDED);
                terpri(stream);
                write_string(alias_string, stream, UNPROVIDED, UNPROVIDED);
                write_string($str14$_, stream, UNPROVIDED, UNPROVIDED);
                terpri(stream);
                write_string($str15$null___, stream, UNPROVIDED, UNPROVIDED);
            } else {
                cdestructuring_bind_error(csql, $list0);
            }
            result_string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return result_string;
    }

    public static SubLObject csql_to_sparql_oracle_fields(final SubLObject fields) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fields_string = NIL;
        if (NIL != sksi_csql_sparql_interpretation.csql_boolean_select_fields_p(fields)) {
            fields_string = $str16$_;
        } else
            if (NIL != sksi_csql_sparql_interpretation.csql_variables_fields_p(fields)) {
                SubLObject variables_keyword = NIL;
                destructuring_bind_must_consp(fields, fields, $list17);
                variables_keyword = fields.first();
                final SubLObject v_variables;
                final SubLObject current = v_variables = fields.rest();
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($VARIABLES != variables_keyword)) {
                    Errors.error($str19$malformed_csql_expression__a__exp, fields);
                }
                if (NIL == v_variables) {
                    fields_string = $str16$_;
                } else {
                    SubLObject stream = NIL;
                    try {
                        stream = make_private_string_output_stream();
                        SubLObject list_var = NIL;
                        SubLObject variable = NIL;
                        SubLObject index = NIL;
                        list_var = v_variables;
                        variable = list_var.first();
                        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , variable = list_var.first() , index = add(ONE_INTEGER, index)) {
                            if (!index.isZero()) {
                                write_string($str20$__, stream, UNPROVIDED, UNPROVIDED);
                            }
                            final SubLObject variable_name = symbol_name(variable);
                            write_string(variable_name, stream, ONE_INTEGER, UNPROVIDED);
                        }
                        fields_string = get_output_stream_string(stream);
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            close(stream, UNPROVIDED);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            } else {
                SubLObject stream2 = NIL;
                try {
                    stream2 = make_private_string_output_stream();
                    SubLObject list_var2 = NIL;
                    SubLObject field = NIL;
                    SubLObject index2 = NIL;
                    list_var2 = fields;
                    field = list_var2.first();
                    for (index2 = ZERO_INTEGER; NIL != list_var2; list_var2 = list_var2.rest() , field = list_var2.first() , index2 = add(ONE_INTEGER, index2)) {
                        if (!index2.isZero()) {
                            write_string($str20$__, stream2, UNPROVIDED, UNPROVIDED);
                        }
                        final SubLObject variable_name2 = sksi_csql_sparql_interpretation.sparql_field_variable_name(field);
                        write_string(variable_name2, stream2, ONE_INTEGER, UNPROVIDED);
                    }
                    fields_string = get_output_stream_string(stream2);
                } finally {
                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        close(stream2, UNPROVIDED);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                    }
                }
            }

        return fields_string;
    }

    public static SubLObject csql_to_sparql_oracle_where(final SubLObject where, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject where_string = NIL;
        final SubLObject _prev_bind_0 = sksi_csql_sparql_interpretation.$sparql_expand_identifier_stringsP$.currentBinding(thread);
        try {
            sksi_csql_sparql_interpretation.$sparql_expand_identifier_stringsP$.bind(NIL, thread);
            where_string = sksi_csql_sparql_interpretation.csql_to_sparql_where(where, access_path);
        } finally {
            sksi_csql_sparql_interpretation.$sparql_expand_identifier_stringsP$.rebind(_prev_bind_0, thread);
        }
        return where_string;
    }

    public static SubLObject sparql_oracle_compute_alias(final SubLObject access_path) {
        SubLObject alias_string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            write_string($str21$SEM_ALIASES_, stream, UNPROVIDED, UNPROVIDED);
            terpri(stream);
            final SubLObject base_uri = sksi_access_path.access_path_rdf_base(access_path);
            write_sparql_oracle_alias($str22$, base_uri, stream);
            SubLObject cdolist_list_var;
            final SubLObject prefix_map = cdolist_list_var = sksi_access_path.access_path_rdf_prefix_map(access_path);
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject prefix = NIL;
                SubLObject prefix_uri = NIL;
                destructuring_bind_must_consp(current, datum, $list23);
                prefix = current.first();
                current = prefix_uri = current.rest();
                write_string($str14$_, stream, UNPROVIDED, UNPROVIDED);
                terpri(stream);
                write_sparql_oracle_alias(prefix, prefix_uri, stream);
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
            write_string($str24$_, stream, UNPROVIDED, UNPROVIDED);
            alias_string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return alias_string;
    }

    public static SubLObject write_sparql_oracle_alias(final SubLObject prefix, final SubLObject uri, final SubLObject stream) {
        write_string($str25$_SEM_ALIAS_, stream, UNPROVIDED, UNPROVIDED);
        write_string($str26$_, stream, UNPROVIDED, UNPROVIDED);
        write_string(prefix, stream, UNPROVIDED, UNPROVIDED);
        write_string($str26$_, stream, UNPROVIDED, UNPROVIDED);
        write_string($str20$__, stream, UNPROVIDED, UNPROVIDED);
        write_string($str26$_, stream, UNPROVIDED, UNPROVIDED);
        write_string(uri, stream, UNPROVIDED, UNPROVIDED);
        write_string($str26$_, stream, UNPROVIDED, UNPROVIDED);
        write_string($str24$_, stream, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject test_csql_to_oracle_sparql(final SubLObject csql, final SubLObject access_path_alist) {
        final SubLObject access_path = dictionary_utilities.new_dictionary_from_alist(access_path_alist, UNPROVIDED);
        return csql_to_oracle_sparql(csql, access_path);
    }

    public static SubLObject declare_sksi_csql_oracle_sparql_interpretation_file() {
        declareFunction(me, "csql_to_oracle_sparql", "CSQL-TO-ORACLE-SPARQL", 2, 0, false);
        declareFunction(me, "csql_to_sparql_oracle_fields", "CSQL-TO-SPARQL-ORACLE-FIELDS", 1, 0, false);
        declareFunction(me, "csql_to_sparql_oracle_where", "CSQL-TO-SPARQL-ORACLE-WHERE", 2, 0, false);
        declareFunction(me, "sparql_oracle_compute_alias", "SPARQL-ORACLE-COMPUTE-ALIAS", 1, 0, false);
        declareFunction(me, "write_sparql_oracle_alias", "WRITE-SPARQL-ORACLE-ALIAS", 3, 0, false);
        declareFunction(me, "test_csql_to_oracle_sparql", "TEST-CSQL-TO-ORACLE-SPARQL", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_csql_oracle_sparql_interpretation_file() {
        return NIL;
    }

    public static SubLObject setup_sksi_csql_oracle_sparql_interpretation_file() {
        define_test_case_table_int(TEST_CSQL_TO_ORACLE_SPARQL, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list34);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_csql_oracle_sparql_interpretation_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_csql_oracle_sparql_interpretation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_csql_oracle_sparql_interpretation_file();
    }

    static {




































    }
}

/**
 * Total time: 182 ms
 */
