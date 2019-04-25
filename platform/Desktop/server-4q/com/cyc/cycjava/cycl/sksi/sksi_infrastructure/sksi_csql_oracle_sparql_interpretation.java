package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_csql_oracle_sparql_interpretation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_oracle_sparql_interpretation";
    public static final String myFingerPrint = "858a090fd99851e0042eb73be88bf39bddf3bd943e6a1ad35811b0cfc9bb2440";
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $kw4$SELECT;
    private static final SubLString $str5$malformed_csql_expression__a__exp;
    private static final SubLSymbol $sym6$CSETQ;
    private static final SubLString $str7$_A;
    private static final SubLString $str8$SELECT_;
    private static final SubLString $str9$FROM_TABLE_SEM_MATCH_;
    private static final SubLString $str10$__;
    private static final SubLString $str11$___;
    private static final SubLString $str12$SEM_MODELS__CCF___;
    private static final SubLString $str13$null_;
    private static final SubLString $str14$_;
    private static final SubLString $str15$null___;
    private static final SubLString $str16$_;
    private static final SubLList $list17;
    private static final SubLSymbol $kw18$VARIABLES;
    private static final SubLString $str19$malformed_csql_expression__a__exp;
    private static final SubLString $str20$__;
    private static final SubLString $str21$SEM_ALIASES_;
    private static final SubLString $str22$;
    private static final SubLList $list23;
    private static final SubLString $str24$_;
    private static final SubLString $str25$_SEM_ALIAS_;
    private static final SubLString $str26$_;
    private static final SubLSymbol $sym27$TEST_CSQL_TO_ORACLE_SPARQL;
    private static final SubLSymbol $kw28$TEST;
    private static final SubLSymbol $kw29$OWNER;
    private static final SubLSymbol $kw30$CLASSES;
    private static final SubLSymbol $kw31$KB;
    private static final SubLSymbol $kw32$FULL;
    private static final SubLSymbol $kw33$WORKING_;
    private static final SubLList $list34;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-oracle-sparql-interpretation.lisp", position = 1023L)
    public static SubLObject csql_to_oracle_sparql(final SubLObject csql, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_string = (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
        SubLObject stream = (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            SubLObject select_keyword = (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
            SubLObject fields = (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
            SubLObject from = (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(csql, csql, (SubLObject)sksi_csql_oracle_sparql_interpretation.$list0);
            select_keyword = csql.first();
            SubLObject current = csql.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_csql_oracle_sparql_interpretation.$list0);
            fields = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_csql_oracle_sparql_interpretation.$list0);
            from = current.first();
            current = current.rest();
            final SubLObject where = (SubLObject)(current.isCons() ? current.first() : sksi_csql_oracle_sparql_interpretation.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, csql, (SubLObject)sksi_csql_oracle_sparql_interpretation.$list0);
            current = current.rest();
            final SubLObject limit = (SubLObject)(current.isCons() ? current.first() : sksi_csql_oracle_sparql_interpretation.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, csql, (SubLObject)sksi_csql_oracle_sparql_interpretation.$list0);
            current = current.rest();
            final SubLObject offset = (SubLObject)(current.isCons() ? current.first() : sksi_csql_oracle_sparql_interpretation.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, csql, (SubLObject)sksi_csql_oracle_sparql_interpretation.$list0);
            current = current.rest();
            if (sksi_csql_oracle_sparql_interpretation.NIL == current) {
                SubLObject message_var = (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
                final SubLObject was_appendingP = Eval.eval((SubLObject)sksi_csql_oracle_sparql_interpretation.$sym1$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
                Eval.eval((SubLObject)sksi_csql_oracle_sparql_interpretation.$list2);
                try {
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind((SubLObject)sksi_csql_oracle_sparql_interpretation.$sym3$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                if (sksi_csql_oracle_sparql_interpretation.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_csql_oracle_sparql_interpretation.$kw4$SELECT != select_keyword) {
                                    Errors.error((SubLObject)sksi_csql_oracle_sparql_interpretation.$str5$malformed_csql_expression__a__exp, csql);
                                }
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                }
                finally {
                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_csql_oracle_sparql_interpretation.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        Eval.eval((SubLObject)ConsesLow.list((SubLObject)sksi_csql_oracle_sparql_interpretation.$sym6$CSETQ, (SubLObject)sksi_csql_oracle_sparql_interpretation.$sym1$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                    }
                }
                if (message_var.isString()) {
                    Errors.warn((SubLObject)sksi_csql_oracle_sparql_interpretation.$str7$_A, message_var);
                }
                final SubLObject fields_string = csql_to_sparql_oracle_fields(fields);
                final SubLObject where_string = csql_to_sparql_oracle_where(where, access_path);
                final SubLObject alias_string = sparql_oracle_compute_alias(access_path);
                streams_high.write_string((SubLObject)sksi_csql_oracle_sparql_interpretation.$str8$SELECT_, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
                streams_high.write_string(fields_string, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
                streams_high.terpri(stream);
                streams_high.write_string((SubLObject)sksi_csql_oracle_sparql_interpretation.$str9$FROM_TABLE_SEM_MATCH_, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
                streams_high.terpri(stream);
                streams_high.write_string((SubLObject)sksi_csql_oracle_sparql_interpretation.$str10$__, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
                streams_high.terpri(stream);
                streams_high.write_string(where_string, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
                streams_high.write_string((SubLObject)sksi_csql_oracle_sparql_interpretation.$str11$___, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
                streams_high.terpri(stream);
                streams_high.write_string((SubLObject)sksi_csql_oracle_sparql_interpretation.$str12$SEM_MODELS__CCF___, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
                streams_high.terpri(stream);
                streams_high.write_string((SubLObject)sksi_csql_oracle_sparql_interpretation.$str13$null_, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
                streams_high.terpri(stream);
                streams_high.write_string(alias_string, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
                streams_high.write_string((SubLObject)sksi_csql_oracle_sparql_interpretation.$str14$_, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
                streams_high.terpri(stream);
                streams_high.write_string((SubLObject)sksi_csql_oracle_sparql_interpretation.$str15$null___, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(csql, (SubLObject)sksi_csql_oracle_sparql_interpretation.$list0);
            }
            result_string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_csql_oracle_sparql_interpretation.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return result_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-oracle-sparql-interpretation.lisp", position = 2277L)
    public static SubLObject csql_to_sparql_oracle_fields(final SubLObject fields) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fields_string = (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
        if (sksi_csql_oracle_sparql_interpretation.NIL != sksi_csql_sparql_interpretation.csql_boolean_select_fields_p(fields)) {
            fields_string = (SubLObject)sksi_csql_oracle_sparql_interpretation.$str16$_;
        }
        else if (sksi_csql_oracle_sparql_interpretation.NIL != sksi_csql_sparql_interpretation.csql_variables_fields_p(fields)) {
            SubLObject variables_keyword = (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(fields, fields, (SubLObject)sksi_csql_oracle_sparql_interpretation.$list17);
            variables_keyword = fields.first();
            final SubLObject v_variables;
            final SubLObject current = v_variables = fields.rest();
            if (sksi_csql_oracle_sparql_interpretation.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_csql_oracle_sparql_interpretation.$kw18$VARIABLES != variables_keyword) {
                Errors.error((SubLObject)sksi_csql_oracle_sparql_interpretation.$str19$malformed_csql_expression__a__exp, fields);
            }
            if (sksi_csql_oracle_sparql_interpretation.NIL == v_variables) {
                fields_string = (SubLObject)sksi_csql_oracle_sparql_interpretation.$str16$_;
            }
            else {
                SubLObject stream = (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
                try {
                    stream = streams_high.make_private_string_output_stream();
                    SubLObject list_var = (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
                    SubLObject variable = (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
                    SubLObject index = (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
                    list_var = v_variables;
                    variable = list_var.first();
                    for (index = (SubLObject)sksi_csql_oracle_sparql_interpretation.ZERO_INTEGER; sksi_csql_oracle_sparql_interpretation.NIL != list_var; list_var = list_var.rest(), variable = list_var.first(), index = Numbers.add((SubLObject)sksi_csql_oracle_sparql_interpretation.ONE_INTEGER, index)) {
                        if (!index.isZero()) {
                            streams_high.write_string((SubLObject)sksi_csql_oracle_sparql_interpretation.$str20$__, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
                        }
                        final SubLObject variable_name = Symbols.symbol_name(variable);
                        streams_high.write_string(variable_name, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.ONE_INTEGER, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
                    }
                    fields_string = streams_high.get_output_stream_string(stream);
                }
                finally {
                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_csql_oracle_sparql_interpretation.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        streams_high.close(stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        else {
            SubLObject stream2 = (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
            try {
                stream2 = streams_high.make_private_string_output_stream();
                SubLObject list_var2 = (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
                SubLObject field = (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
                SubLObject index2 = (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
                list_var2 = fields;
                field = list_var2.first();
                for (index2 = (SubLObject)sksi_csql_oracle_sparql_interpretation.ZERO_INTEGER; sksi_csql_oracle_sparql_interpretation.NIL != list_var2; list_var2 = list_var2.rest(), field = list_var2.first(), index2 = Numbers.add((SubLObject)sksi_csql_oracle_sparql_interpretation.ONE_INTEGER, index2)) {
                    if (!index2.isZero()) {
                        streams_high.write_string((SubLObject)sksi_csql_oracle_sparql_interpretation.$str20$__, stream2, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
                    }
                    final SubLObject variable_name2 = sksi_csql_sparql_interpretation.sparql_field_variable_name(field);
                    streams_high.write_string(variable_name2, stream2, (SubLObject)sksi_csql_oracle_sparql_interpretation.ONE_INTEGER, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
                }
                fields_string = streams_high.get_output_stream_string(stream2);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_csql_oracle_sparql_interpretation.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    streams_high.close(stream2, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return fields_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-oracle-sparql-interpretation.lisp", position = 3291L)
    public static SubLObject csql_to_sparql_oracle_where(final SubLObject where, final SubLObject access_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject where_string = (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
        final SubLObject _prev_bind_0 = sksi_csql_sparql_interpretation.$sparql_expand_identifier_stringsP$.currentBinding(thread);
        try {
            sksi_csql_sparql_interpretation.$sparql_expand_identifier_stringsP$.bind((SubLObject)sksi_csql_oracle_sparql_interpretation.NIL, thread);
            where_string = sksi_csql_sparql_interpretation.csql_to_sparql_where(where, access_path);
        }
        finally {
            sksi_csql_sparql_interpretation.$sparql_expand_identifier_stringsP$.rebind(_prev_bind_0, thread);
        }
        return where_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-oracle-sparql-interpretation.lisp", position = 3527L)
    public static SubLObject sparql_oracle_compute_alias(final SubLObject access_path) {
        SubLObject alias_string = (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
        SubLObject stream = (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            streams_high.write_string((SubLObject)sksi_csql_oracle_sparql_interpretation.$str21$SEM_ALIASES_, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
            streams_high.terpri(stream);
            final SubLObject base_uri = sksi_access_path.access_path_rdf_base(access_path);
            write_sparql_oracle_alias((SubLObject)sksi_csql_oracle_sparql_interpretation.$str22$, base_uri, stream);
            SubLObject cdolist_list_var;
            final SubLObject prefix_map = cdolist_list_var = sksi_access_path.access_path_rdf_prefix_map(access_path);
            SubLObject cons = (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
            cons = cdolist_list_var.first();
            while (sksi_csql_oracle_sparql_interpretation.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject prefix = (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
                SubLObject prefix_uri = (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_csql_oracle_sparql_interpretation.$list23);
                prefix = current.first();
                current = (prefix_uri = current.rest());
                streams_high.write_string((SubLObject)sksi_csql_oracle_sparql_interpretation.$str14$_, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
                streams_high.terpri(stream);
                write_sparql_oracle_alias(prefix, prefix_uri, stream);
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            }
            streams_high.write_string((SubLObject)sksi_csql_oracle_sparql_interpretation.$str24$_, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
            alias_string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_csql_oracle_sparql_interpretation.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return alias_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-oracle-sparql-interpretation.lisp", position = 4110L)
    public static SubLObject write_sparql_oracle_alias(final SubLObject prefix, final SubLObject uri, final SubLObject stream) {
        streams_high.write_string((SubLObject)sksi_csql_oracle_sparql_interpretation.$str25$_SEM_ALIAS_, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
        streams_high.write_string((SubLObject)sksi_csql_oracle_sparql_interpretation.$str26$_, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
        streams_high.write_string(prefix, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
        streams_high.write_string((SubLObject)sksi_csql_oracle_sparql_interpretation.$str26$_, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
        streams_high.write_string((SubLObject)sksi_csql_oracle_sparql_interpretation.$str20$__, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
        streams_high.write_string((SubLObject)sksi_csql_oracle_sparql_interpretation.$str26$_, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
        streams_high.write_string(uri, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
        streams_high.write_string((SubLObject)sksi_csql_oracle_sparql_interpretation.$str26$_, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
        streams_high.write_string((SubLObject)sksi_csql_oracle_sparql_interpretation.$str24$_, stream, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
        return (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-csql-oracle-sparql-interpretation.lisp", position = 4484L)
    public static SubLObject test_csql_to_oracle_sparql(final SubLObject csql, final SubLObject access_path_alist) {
        final SubLObject access_path = dictionary_utilities.new_dictionary_from_alist(access_path_alist, (SubLObject)sksi_csql_oracle_sparql_interpretation.UNPROVIDED);
        return csql_to_oracle_sparql(csql, access_path);
    }
    
    public static SubLObject declare_sksi_csql_oracle_sparql_interpretation_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_oracle_sparql_interpretation", "csql_to_oracle_sparql", "CSQL-TO-ORACLE-SPARQL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_oracle_sparql_interpretation", "csql_to_sparql_oracle_fields", "CSQL-TO-SPARQL-ORACLE-FIELDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_oracle_sparql_interpretation", "csql_to_sparql_oracle_where", "CSQL-TO-SPARQL-ORACLE-WHERE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_oracle_sparql_interpretation", "sparql_oracle_compute_alias", "SPARQL-ORACLE-COMPUTE-ALIAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_oracle_sparql_interpretation", "write_sparql_oracle_alias", "WRITE-SPARQL-ORACLE-ALIAS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_oracle_sparql_interpretation", "test_csql_to_oracle_sparql", "TEST-CSQL-TO-ORACLE-SPARQL", 2, 0, false);
        return (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
    }
    
    public static SubLObject init_sksi_csql_oracle_sparql_interpretation_file() {
        return (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
    }
    
    public static SubLObject setup_sksi_csql_oracle_sparql_interpretation_file() {
        generic_testing.define_test_case_table_int((SubLObject)sksi_csql_oracle_sparql_interpretation.$sym27$TEST_CSQL_TO_ORACLE_SPARQL, (SubLObject)ConsesLow.list(new SubLObject[] { sksi_csql_oracle_sparql_interpretation.$kw28$TEST, Symbols.symbol_function((SubLObject)sksi_csql_oracle_sparql_interpretation.EQUAL), sksi_csql_oracle_sparql_interpretation.$kw29$OWNER, sksi_csql_oracle_sparql_interpretation.NIL, sksi_csql_oracle_sparql_interpretation.$kw30$CLASSES, sksi_csql_oracle_sparql_interpretation.NIL, sksi_csql_oracle_sparql_interpretation.$kw31$KB, sksi_csql_oracle_sparql_interpretation.$kw32$FULL, sksi_csql_oracle_sparql_interpretation.$kw33$WORKING_, sksi_csql_oracle_sparql_interpretation.T }), (SubLObject)sksi_csql_oracle_sparql_interpretation.$list34);
        return (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL;
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
        me = (SubLFile)new sksi_csql_oracle_sparql_interpretation();
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELECT-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("FIELDS"), (SubLObject)SubLObjectFactory.makeSymbol("FROM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("WHERE"), (SubLObject)SubLObjectFactory.makeSymbol("LIMIT"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET"));
        $sym1$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), (SubLObject)sksi_csql_oracle_sparql_interpretation.NIL);
        $sym3$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw4$SELECT = SubLObjectFactory.makeKeyword("SELECT");
        $str5$malformed_csql_expression__a__exp = SubLObjectFactory.makeString("malformed csql expression ~a, expected :select");
        $sym6$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $str7$_A = SubLObjectFactory.makeString("~A");
        $str8$SELECT_ = SubLObjectFactory.makeString("SELECT ");
        $str9$FROM_TABLE_SEM_MATCH_ = SubLObjectFactory.makeString("FROM TABLE(SEM_MATCH(");
        $str10$__ = SubLObjectFactory.makeString("'{");
        $str11$___ = SubLObjectFactory.makeString("}',");
        $str12$SEM_MODELS__CCF___ = SubLObjectFactory.makeString("SEM_MODELS('CCF'),");
        $str13$null_ = SubLObjectFactory.makeString("null,");
        $str14$_ = SubLObjectFactory.makeString(",");
        $str15$null___ = SubLObjectFactory.makeString("null));");
        $str16$_ = SubLObjectFactory.makeString("*");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLES-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLES"));
        $kw18$VARIABLES = SubLObjectFactory.makeKeyword("VARIABLES");
        $str19$malformed_csql_expression__a__exp = SubLObjectFactory.makeString("malformed csql expression ~a, expected :variables");
        $str20$__ = SubLObjectFactory.makeString(", ");
        $str21$SEM_ALIASES_ = SubLObjectFactory.makeString("SEM_ALIASES(");
        $str22$ = SubLObjectFactory.makeString("");
        $list23 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PREFIX"), (SubLObject)SubLObjectFactory.makeSymbol("PREFIX-URI"));
        $str24$_ = SubLObjectFactory.makeString(")");
        $str25$_SEM_ALIAS_ = SubLObjectFactory.makeString(" SEM_ALIAS(");
        $str26$_ = SubLObjectFactory.makeString("'");
        $sym27$TEST_CSQL_TO_ORACLE_SPARQL = SubLObjectFactory.makeSymbol("TEST-CSQL-TO-ORACLE-SPARQL");
        $kw28$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw29$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw30$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw31$KB = SubLObjectFactory.makeKeyword("KB");
        $kw32$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw33$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list34 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SELECT"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("subject"), (SubLObject)SubLObjectFactory.makeString("default"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FROM"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE"), (SubLObject)SubLObjectFactory.makeString("default")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WHERE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("predicate"), (SubLObject)SubLObjectFactory.makeString("default")), (SubLObject)SubLObjectFactory.makeString("rdf:type")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD"), (SubLObject)SubLObjectFactory.makeString("object"), (SubLObject)SubLObjectFactory.makeString("default")), (SubLObject)SubLObjectFactory.makeString("foo"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("baseNamespaceForSKS")), (SubLObject)SubLObjectFactory.makeString("http://www.clevelandclinic.org/heartcenter/ontologies/DataNodes.owl#")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameSpacePrefixForSKS")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("owl"), (SubLObject)SubLObjectFactory.makeString("http://www/w3.org/2000/07/owl#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ptrec"), (SubLObject)SubLObjectFactory.makeString("http://clevelandclinicfoundation.org/cidr/patientrecord#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdf"), (SubLObject)SubLObjectFactory.makeString("http://www/w3.org/2000/02/22-rdf-syntax-ns#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www/w3.org/2000/01/rdf-schema#")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("xsd"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema#"))))), (SubLObject)SubLObjectFactory.makeString("SELECT subj\nFROM TABLE(SEM_MATCH(\n'{\n  ?subj rdf:type \"foo\"  .\n}',\nSEM_MODELS('CCF'),\nnull,\nSEM_ALIASES(\n SEM_ALIAS('', 'http://www.clevelandclinic.org/heartcenter/ontologies/DataNodes.owl#'),\n SEM_ALIAS('owl', 'http://www/w3.org/2000/07/owl#'),\n SEM_ALIAS('ptrec', 'http://clevelandclinicfoundation.org/cidr/patientrecord#'),\n SEM_ALIAS('rdf', 'http://www/w3.org/2000/02/22-rdf-syntax-ns#'),\n SEM_ALIAS('rdfs', 'http://www/w3.org/2000/01/rdf-schema#'),\n SEM_ALIAS('xsd', 'http://www.w3.org/2001/XMLSchema#')),\nnull));")));
    }
}

/*

	Total time: 182 ms
	
*/