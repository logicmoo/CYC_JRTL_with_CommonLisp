/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_csql_oracle_sparql_interpretation extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt19$ = makeString("");

    public static final SubLFile me = new sksi_csql_oracle_sparql_interpretation();



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("SELECT-KEYWORD"), makeSymbol("FIELDS"), makeSymbol("FROM"), makeSymbol("&OPTIONAL"), makeSymbol("WHERE"), makeSymbol("LIMIT"), makeSymbol("OFFSET"));

    private static final SubLSymbol $append_stack_traces_to_error_messagesP$ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

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

    private static final SubLList $list34 = list(list(list(list(makeKeyword("SELECT"), list(list(makeKeyword("FIELD"), makeString("subject"), makeString("default"))), list($FROM, list(list(makeKeyword("TABLE"), makeString("default")))), list(makeKeyword("WHERE"), list(list(reader_make_constant_shell("CSQLEquals"), list(makeKeyword("FIELD"), makeString("predicate"), makeString("default")), makeString("rdf:type")), list(reader_make_constant_shell("CSQLEquals"), list(makeKeyword("FIELD"), makeString("object"), makeString("default")), makeString("foo"))))), list(cons(reader_make_constant_shell("baseNamespaceForSKS"), makeString("http://www.clevelandclinic.org/heartcenter/ontologies/DataNodes.owl#")), list(reader_make_constant_shell("nameSpacePrefixForSKS"), cons(makeString("owl"), makeString("http://www/w3.org/2000/07/owl#")), cons(makeString("ptrec"), makeString("http://clevelandclinicfoundation.org/cidr/patientrecord#")), cons(makeString("rdf"), makeString("http://www/w3.org/2000/02/22-rdf-syntax-ns#")), cons(makeString("rdfs"), makeString("http://www/w3.org/2000/01/rdf-schema#")), cons(makeString("xsd"), makeString("http://www.w3.org/2001/XMLSchema#"))))), makeString("SELECT subj\nFROM TABLE(SEM_MATCH(\n\'{\n  ?subj rdf:type \"foo\"  .\n}\',\nSEM_MODELS(\'CCF\'),\nnull,\nSEM_ALIASES(\n SEM_ALIAS(\'\', \'http://www.clevelandclinic.org/heartcenter/ontologies/DataNodes.owl#\'),\n SEM_ALIAS(\'owl\', \'http://www/w3.org/2000/07/owl#\'),\n SEM_ALIAS(\'ptrec\', \'http://clevelandclinicfoundation.org/cidr/patientrecord#\'),\n SEM_ALIAS(\'rdf\', \'http://www/w3.org/2000/02/22-rdf-syntax-ns#\'),\n SEM_ALIAS(\'rdfs\', \'http://www/w3.org/2000/01/rdf-schema#\'),\n SEM_ALIAS(\'xsd\', \'http://www.w3.org/2001/XMLSchema#\')),\nnull));")));

    // Definitions
    public static final SubLObject csql_to_oracle_sparql_alt(SubLObject csql, SubLObject access_path) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result_string = NIL;
                SubLObject stream = NIL;
                try {
                    stream = make_private_string_output_stream();
                    {
                        SubLObject datum = csql;
                        SubLObject current = datum;
                        SubLObject select_keyword = NIL;
                        SubLObject fields = NIL;
                        SubLObject from = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt0);
                        select_keyword = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt0);
                        fields = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt0);
                        from = current.first();
                        current = current.rest();
                        {
                            SubLObject where = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt0);
                            current = current.rest();
                            {
                                SubLObject limit = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt0);
                                current = current.rest();
                                {
                                    SubLObject offset = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                    destructuring_bind_must_listp(current, datum, $list_alt0);
                                    current = current.rest();
                                    if (NIL == current) {
                                        {
                                            SubLObject message_var = NIL;
                                            try {
                                                {
                                                    SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                                    try {
                                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                        try {
                                                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                                if ($SELECT != select_keyword) {
                                                                    Errors.error($str_alt3$malformed_csql_expression__a__exp, csql);
                                                                }
                                                            }
                                                        } catch (Throwable catch_var) {
                                                            Errors.handleThrowable(catch_var, NIL);
                                                        }
                                                    } finally {
                                                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                                    }
                                                }
                                            } catch (Throwable ccatch_env_var) {
                                                message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                            }
                                            if (message_var.isString()) {
                                                Errors.warn($str_alt4$_A, message_var);
                                            }
                                        }
                                        {
                                            SubLObject fields_string = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_oracle_sparql_interpretation.csql_to_sparql_oracle_fields(fields);
                                            SubLObject where_string = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_oracle_sparql_interpretation.csql_to_sparql_oracle_where(where, access_path);
                                            SubLObject alias_string = com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_oracle_sparql_interpretation.sparql_oracle_compute_alias(access_path);
                                            write_string($str_alt5$SELECT_, stream, UNPROVIDED, UNPROVIDED);
                                            write_string(fields_string, stream, UNPROVIDED, UNPROVIDED);
                                            terpri(stream);
                                            write_string($str_alt6$FROM_TABLE_SEM_MATCH_, stream, UNPROVIDED, UNPROVIDED);
                                            terpri(stream);
                                            write_string($str_alt7$__, stream, UNPROVIDED, UNPROVIDED);
                                            terpri(stream);
                                            write_string(where_string, stream, UNPROVIDED, UNPROVIDED);
                                            write_string($str_alt8$___, stream, UNPROVIDED, UNPROVIDED);
                                            terpri(stream);
                                            write_string($str_alt9$SEM_MODELS__CCF___, stream, UNPROVIDED, UNPROVIDED);
                                            terpri(stream);
                                            write_string($str_alt10$null_, stream, UNPROVIDED, UNPROVIDED);
                                            terpri(stream);
                                            write_string(alias_string, stream, UNPROVIDED, UNPROVIDED);
                                            write_string($str_alt11$_, stream, UNPROVIDED, UNPROVIDED);
                                            terpri(stream);
                                            write_string($str_alt12$null___, stream, UNPROVIDED, UNPROVIDED);
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt0);
                                    }
                                }
                            }
                        }
                    }
                    result_string = get_output_stream_string(stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            close(stream, UNPROVIDED);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result_string;
            }
        }
    }

    // Definitions
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
                final SubLObject was_appendingP = eval($append_stack_traces_to_error_messagesP$);
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
                        eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
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

    public static final SubLObject csql_to_sparql_oracle_fields_alt(SubLObject fields) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fields_string = NIL;
                if (NIL != sksi_csql_sparql_interpretation.csql_boolean_select_fields_p(fields)) {
                    fields_string = $str_alt13$_;
                } else {
                    if (NIL != sksi_csql_sparql_interpretation.csql_variables_fields_p(fields)) {
                        {
                            SubLObject datum = fields;
                            SubLObject current = datum;
                            SubLObject variables_keyword = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt14);
                            variables_keyword = current.first();
                            current = current.rest();
                            {
                                SubLObject v_variables = current;
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if ($VARIABLES != variables_keyword) {
                                        Errors.error($str_alt16$malformed_csql_expression__a__exp, fields);
                                    }
                                }
                                if (NIL == v_variables) {
                                    fields_string = $str_alt13$_;
                                } else {
                                    {
                                        SubLObject stream = NIL;
                                        try {
                                            stream = make_private_string_output_stream();
                                            {
                                                SubLObject list_var = NIL;
                                                SubLObject variable = NIL;
                                                SubLObject index = NIL;
                                                for (list_var = v_variables, variable = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , variable = list_var.first() , index = add(ONE_INTEGER, index)) {
                                                    if (!index.isZero()) {
                                                        write_string($str_alt17$__, stream, UNPROVIDED, UNPROVIDED);
                                                    }
                                                    {
                                                        SubLObject variable_name = symbol_name(variable);
                                                        write_string(variable_name, stream, ONE_INTEGER, UNPROVIDED);
                                                    }
                                                }
                                            }
                                            fields_string = get_output_stream_string(stream);
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    close(stream, UNPROVIDED);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        {
                            SubLObject stream = NIL;
                            try {
                                stream = make_private_string_output_stream();
                                {
                                    SubLObject list_var = NIL;
                                    SubLObject field = NIL;
                                    SubLObject index = NIL;
                                    for (list_var = fields, field = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , field = list_var.first() , index = add(ONE_INTEGER, index)) {
                                        if (!index.isZero()) {
                                            write_string($str_alt17$__, stream, UNPROVIDED, UNPROVIDED);
                                        }
                                        {
                                            SubLObject variable_name = sksi_csql_sparql_interpretation.sparql_field_variable_name(field);
                                            write_string(variable_name, stream, ONE_INTEGER, UNPROVIDED);
                                        }
                                    }
                                }
                                fields_string = get_output_stream_string(stream);
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        close(stream, UNPROVIDED);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
                return fields_string;
            }
        }
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

    public static final SubLObject csql_to_sparql_oracle_where_alt(SubLObject where, SubLObject access_path) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject where_string = NIL;
                {
                    SubLObject _prev_bind_0 = sksi_csql_sparql_interpretation.$sparql_expand_identifier_stringsP$.currentBinding(thread);
                    try {
                        sksi_csql_sparql_interpretation.$sparql_expand_identifier_stringsP$.bind(NIL, thread);
                        where_string = sksi_csql_sparql_interpretation.csql_to_sparql_where(where, access_path);
                    } finally {
                        sksi_csql_sparql_interpretation.$sparql_expand_identifier_stringsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return where_string;
            }
        }
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

    public static final SubLObject sparql_oracle_compute_alias_alt(SubLObject access_path) {
        {
            SubLObject alias_string = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                write_string($str_alt18$SEM_ALIASES_, stream, UNPROVIDED, UNPROVIDED);
                terpri(stream);
                {
                    SubLObject base_uri = sksi_access_path.access_path_rdf_base(access_path);
                    com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_oracle_sparql_interpretation.write_sparql_oracle_alias($str_alt19$, base_uri, stream);
                    {
                        SubLObject prefix_map = sksi_access_path.access_path_rdf_prefix_map(access_path);
                        SubLObject cdolist_list_var = prefix_map;
                        SubLObject cons = NIL;
                        for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                            {
                                SubLObject datum = cons;
                                SubLObject current = datum;
                                SubLObject prefix = NIL;
                                SubLObject prefix_uri = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt20);
                                prefix = current.first();
                                current = current.rest();
                                prefix_uri = current;
                                write_string($str_alt11$_, stream, UNPROVIDED, UNPROVIDED);
                                terpri(stream);
                                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_oracle_sparql_interpretation.write_sparql_oracle_alias(prefix, prefix_uri, stream);
                            }
                        }
                    }
                }
                write_string($str_alt21$_, stream, UNPROVIDED, UNPROVIDED);
                alias_string = get_output_stream_string(stream);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return alias_string;
        }
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

    public static final SubLObject write_sparql_oracle_alias_alt(SubLObject prefix, SubLObject uri, SubLObject stream) {
        write_string($str_alt22$_SEM_ALIAS_, stream, UNPROVIDED, UNPROVIDED);
        write_string($str_alt23$_, stream, UNPROVIDED, UNPROVIDED);
        write_string(prefix, stream, UNPROVIDED, UNPROVIDED);
        write_string($str_alt23$_, stream, UNPROVIDED, UNPROVIDED);
        write_string($str_alt17$__, stream, UNPROVIDED, UNPROVIDED);
        write_string($str_alt23$_, stream, UNPROVIDED, UNPROVIDED);
        write_string(uri, stream, UNPROVIDED, UNPROVIDED);
        write_string($str_alt23$_, stream, UNPROVIDED, UNPROVIDED);
        write_string($str_alt21$_, stream, UNPROVIDED, UNPROVIDED);
        return NIL;
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

    public static final SubLObject test_csql_to_oracle_sparql_alt(SubLObject csql, SubLObject access_path_alist) {
        {
            SubLObject access_path = dictionary_utilities.new_dictionary_from_alist(access_path_alist, UNPROVIDED);
            return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_oracle_sparql_interpretation.csql_to_oracle_sparql(csql, access_path);
        }
    }

    public static SubLObject test_csql_to_oracle_sparql(final SubLObject csql, final SubLObject access_path_alist) {
        final SubLObject access_path = dictionary_utilities.new_dictionary_from_alist(access_path_alist, UNPROVIDED);
        return csql_to_oracle_sparql(csql, access_path);
    }

    public static SubLObject declare_sksi_csql_oracle_sparql_interpretation_file() {
        declareFunction("csql_to_oracle_sparql", "CSQL-TO-ORACLE-SPARQL", 2, 0, false);
        declareFunction("csql_to_sparql_oracle_fields", "CSQL-TO-SPARQL-ORACLE-FIELDS", 1, 0, false);
        declareFunction("csql_to_sparql_oracle_where", "CSQL-TO-SPARQL-ORACLE-WHERE", 2, 0, false);
        declareFunction("sparql_oracle_compute_alias", "SPARQL-ORACLE-COMPUTE-ALIAS", 1, 0, false);
        declareFunction("write_sparql_oracle_alias", "WRITE-SPARQL-ORACLE-ALIAS", 3, 0, false);
        declareFunction("test_csql_to_oracle_sparql", "TEST-CSQL-TO-ORACLE-SPARQL", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_csql_oracle_sparql_interpretation_file() {
        return NIL;
    }

    public static final SubLObject setup_sksi_csql_oracle_sparql_interpretation_file_alt() {
        define_test_case_table_int(TEST_CSQL_TO_ORACLE_SPARQL, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt32);
        return NIL;
    }

    public static SubLObject setup_sksi_csql_oracle_sparql_interpretation_file() {
        if (SubLFiles.USE_V1) {
            define_test_case_table_int(TEST_CSQL_TO_ORACLE_SPARQL, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list34);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(TEST_CSQL_TO_ORACLE_SPARQL, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt32);
        }
        return NIL;
    }

    public static SubLObject setup_sksi_csql_oracle_sparql_interpretation_file_Previous() {
        define_test_case_table_int(TEST_CSQL_TO_ORACLE_SPARQL, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list34);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("SELECT-KEYWORD"), makeSymbol("FIELDS"), makeSymbol("FROM"), makeSymbol("&OPTIONAL"), makeSymbol("WHERE"), makeSymbol("LIMIT"), makeSymbol("OFFSET"));

    @Override
    public void declareFunctions() {
        declare_sksi_csql_oracle_sparql_interpretation_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_csql_oracle_sparql_interpretation_file();
    }

    static private final SubLString $str_alt3$malformed_csql_expression__a__exp = makeString("malformed csql expression ~a, expected :select");

    @Override
    public void runTopLevelForms() {
        setup_sksi_csql_oracle_sparql_interpretation_file();
    }

    static private final SubLString $str_alt4$_A = makeString("~A");

    static private final SubLString $str_alt5$SELECT_ = makeString("SELECT ");

    static {
    }

    static private final SubLString $str_alt6$FROM_TABLE_SEM_MATCH_ = makeString("FROM TABLE(SEM_MATCH(");

    static private final SubLString $str_alt7$__ = makeString("'{");

    static private final SubLString $str_alt8$___ = makeString("}',");

    static private final SubLString $str_alt9$SEM_MODELS__CCF___ = makeString("SEM_MODELS('CCF'),");

    static private final SubLString $str_alt10$null_ = makeString("null,");

    static private final SubLString $str_alt11$_ = makeString(",");

    static private final SubLString $str_alt12$null___ = makeString("null));");

    static private final SubLString $str_alt13$_ = makeString("*");

    static private final SubLList $list_alt14 = list(makeSymbol("VARIABLES-KEYWORD"), makeSymbol("&REST"), makeSymbol("VARIABLES"));

    static private final SubLString $str_alt16$malformed_csql_expression__a__exp = makeString("malformed csql expression ~a, expected :variables");

    static private final SubLString $str_alt17$__ = makeString(", ");

    static private final SubLString $str_alt18$SEM_ALIASES_ = makeString("SEM_ALIASES(");

    static private final SubLList $list_alt20 = cons(makeSymbol("PREFIX"), makeSymbol("PREFIX-URI"));

    static private final SubLString $str_alt21$_ = makeString(")");

    static private final SubLString $str_alt22$_SEM_ALIAS_ = makeString(" SEM_ALIAS(");

    static private final SubLString $str_alt23$_ = makeString("'");

    static private final SubLString $$$goolsbey = makeString("goolsbey");

    static private final SubLList $list_alt32 = list(list(list(list(makeKeyword("SELECT"), list(list(makeKeyword("FIELD"), makeString("subject"), makeString("default"))), list($FROM, list(list(makeKeyword("TABLE"), makeString("default")))), list(makeKeyword("WHERE"), list(list(reader_make_constant_shell("CSQLEquals"), list(makeKeyword("FIELD"), makeString("predicate"), makeString("default")), makeString("rdf:type")), list(reader_make_constant_shell("CSQLEquals"), list(makeKeyword("FIELD"), makeString("object"), makeString("default")), makeString("foo"))))), list(cons(reader_make_constant_shell("baseNamespaceForSKS"), makeString("http://www.clevelandclinic.org/heartcenter/ontologies/DataNodes.owl#")), list(reader_make_constant_shell("nameSpacePrefixForSKS"), cons(makeString("owl"), makeString("http://www/w3.org/2000/07/owl#")), cons(makeString("ptrec"), makeString("http://clevelandclinicfoundation.org/cidr/patientrecord#")), cons(makeString("rdf"), makeString("http://www/w3.org/2000/02/22-rdf-syntax-ns#")), cons(makeString("rdfs"), makeString("http://www/w3.org/2000/01/rdf-schema#")), cons(makeString("xsd"), makeString("http://www.w3.org/2001/XMLSchema#"))))), makeString("SELECT subj\nFROM TABLE(SEM_MATCH(\n\'{\n  ?subj rdf:type \"foo\"  .\n}\',\nSEM_MODELS(\'CCF\'),\nnull,\nSEM_ALIASES(\n SEM_ALIAS(\'\', \'http://www.clevelandclinic.org/heartcenter/ontologies/DataNodes.owl#\'),\n SEM_ALIAS(\'owl\', \'http://www/w3.org/2000/07/owl#\'),\n SEM_ALIAS(\'ptrec\', \'http://clevelandclinicfoundation.org/cidr/patientrecord#\'),\n SEM_ALIAS(\'rdf\', \'http://www/w3.org/2000/02/22-rdf-syntax-ns#\'),\n SEM_ALIAS(\'rdfs\', \'http://www/w3.org/2000/01/rdf-schema#\'),\n SEM_ALIAS(\'xsd\', \'http://www.w3.org/2001/XMLSchema#\')),\nnull));")));
}

/**
 * Total time: 182 ms
 */
