//
////
//

package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sdbc extends SubLTranslatedFile
{

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 16417L)
    public static SubLObject sql_proxy_server_runningP(SubLObject server, SubLObject port, SubLObject timeout) {
        if (server == sdbc.UNPROVIDED) {
            server = sdbc.$sdbc_proxy_server$.getGlobalValue();
        }
        if (port == sdbc.UNPROVIDED) {
            port = sdbc.$sql_port$.getGlobalValue();
        }
        if (timeout == sdbc.UNPROVIDED) {
            timeout = (SubLObject)sdbc.FIVE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sdbc.NIL != Types.stringp(server) : server;
        assert sdbc.NIL != subl_promotions.positive_integer_p(port) : port;
        SubLObject downP = (SubLObject)sdbc.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)sdbc.$sym35$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject stream = (SubLObject)sdbc.NIL;
                    try {
                        stream = subl_promotions.open_tcp_stream_with_timeout(server, port, (SubLObject)sdbc.NIL, (SubLObject)sdbc.$kw36$PRIVATE);
                        if (sdbc.NIL != subl_macro_promotions.validate_tcp_connection(stream, server, port)) {
                            cfasl.cfasl_output((SubLObject)ConsesLow.cons(sdbc.$quit$.getGlobalValue(), (SubLObject)sdbc.NIL), stream);
                            streams_high.finish_output(stream);
                            final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$1 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                try {
                                    subl_macro_promotions.$within_with_timeout$.bind((SubLObject)sdbc.T, thread);
                                    SubLObject timer = (SubLObject)sdbc.NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$2 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)sdbc.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = subl_macro_promotions.with_timeout_start_timer(timeout, tag);
                                            cfasl.cfasl_input(stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
                                        }
                                        finally {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$2, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sdbc.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            subl_macro_promotions.with_timeout_stop_timer(timer);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                        }
                                    }
                                }
                                finally {
                                    subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$1, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                downP = Errors.handleThrowable(ccatch_env_var, tag);
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sdbc.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if (sdbc.NIL != stream) {
                                streams_high.close(stream, (SubLObject)sdbc.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sdbc.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var2) {
            downP = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sdbc.NIL == downP);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject sql_connection_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        sqlc_print(v_object, stream, (SubLObject)sdbc.ZERO_INTEGER);
        return (SubLObject)sdbc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject sql_connection_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_connection_native.class) ? sdbc.T : sdbc.NIL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject sqlc_db(final SubLObject v_object) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject sqlc_user(final SubLObject v_object) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject sqlc_dbms_server(final SubLObject v_object) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject sqlc_port(final SubLObject v_object) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject sqlc_channel(final SubLObject v_object) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.getField6();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject sqlc_statements(final SubLObject v_object) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.getField7();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject sqlc_lock(final SubLObject v_object) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.getField8();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject sqlc_subprotocol(final SubLObject v_object) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.getField9();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject sqlc_proxy_server(final SubLObject v_object) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.getField10();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject sqlc_error_handling(final SubLObject v_object) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.getField11();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject sqlc_tickets(final SubLObject v_object) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.getField12();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject sqlc_mailman(final SubLObject v_object) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.getField13();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject _csetf_sqlc_db(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject _csetf_sqlc_user(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject _csetf_sqlc_dbms_server(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject _csetf_sqlc_port(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject _csetf_sqlc_channel(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.setField6(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject _csetf_sqlc_statements(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.setField7(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject _csetf_sqlc_lock(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.setField8(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject _csetf_sqlc_subprotocol(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.setField9(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject _csetf_sqlc_proxy_server(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.setField10(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject _csetf_sqlc_error_handling(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.setField11(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject _csetf_sqlc_tickets(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.setField12(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject _csetf_sqlc_mailman(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_connection_p(v_object) : v_object;
        return v_object.setField13(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject make_sql_connection(SubLObject arglist) {
        if (arglist == sdbc.UNPROVIDED) {
            arglist = (SubLObject)sdbc.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_connection_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)sdbc.NIL, next = arglist; sdbc.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)sdbc.$kw70$DB)) {
                _csetf_sqlc_db(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw71$USER)) {
                _csetf_sqlc_user(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw72$DBMS_SERVER)) {
                _csetf_sqlc_dbms_server(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw73$PORT)) {
                _csetf_sqlc_port(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw74$CHANNEL)) {
                _csetf_sqlc_channel(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw75$STATEMENTS)) {
                _csetf_sqlc_statements(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw76$LOCK)) {
                _csetf_sqlc_lock(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw77$SUBPROTOCOL)) {
                _csetf_sqlc_subprotocol(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw78$PROXY_SERVER)) {
                _csetf_sqlc_proxy_server(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw79$ERROR_HANDLING)) {
                _csetf_sqlc_error_handling(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw80$TICKETS)) {
                _csetf_sqlc_tickets(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw81$MAILMAN)) {
                _csetf_sqlc_mailman(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)sdbc.$str82$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject visit_defstruct_sql_connection(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw83$BEGIN, (SubLObject)sdbc.$sym84$MAKE_SQL_CONNECTION, (SubLObject)sdbc.TWELVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw70$DB, sqlc_db(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw71$USER, sqlc_user(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw72$DBMS_SERVER, sqlc_dbms_server(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw73$PORT, sqlc_port(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw74$CHANNEL, sqlc_channel(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw75$STATEMENTS, sqlc_statements(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw76$LOCK, sqlc_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw77$SUBPROTOCOL, sqlc_subprotocol(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw78$PROXY_SERVER, sqlc_proxy_server(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw79$ERROR_HANDLING, sqlc_error_handling(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw80$TICKETS, sqlc_tickets(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw81$MAILMAN, sqlc_mailman(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw86$END, (SubLObject)sdbc.$sym84$MAKE_SQL_CONNECTION, (SubLObject)sdbc.TWELVE_INTEGER);
        return obj;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 17395L)
    public static SubLObject visit_defstruct_object_sql_connection_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_connection(obj, visitor_fn);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 18284L)
    public static SubLObject sqlc_print(final SubLObject connection, final SubLObject stream, final SubLObject depth) {
        streams_high.write_string(sqlc_print_string(connection), stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
        return connection;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 18543L)
    public static SubLObject sqlc_print_string(final SubLObject connection) {
        SubLObject string = (SubLObject)sdbc.NIL;
        SubLObject stream = (SubLObject)sdbc.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            streams_high.write_string((SubLObject)sdbc.$str88$__SQL_CONNECTION_, stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
            if (sdbc.NIL == sqlc_open_p(connection)) {
                streams_high.write_string((SubLObject)sdbc.$str89$closed_, stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
            }
            streams_high.write_string((SubLObject)sdbc.$str90$to_, stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
            streams_high.write_string(sqlc_db(connection), stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
            streams_high.write_string((SubLObject)sdbc.$str91$__, stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
            streams_high.write_string(sqlc_dbms_server(connection), stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
            streams_high.write_string((SubLObject)sdbc.$str92$_, stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
            print_high.prin1(sqlc_port(connection), stream);
            streams_high.write_string((SubLObject)sdbc.$str93$__, stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
            string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sdbc.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)sdbc.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return string;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 19173L)
    public static SubLObject new_sql_connection(final SubLObject db, final SubLObject user, final SubLObject password, SubLObject v_properties) {
        if (v_properties == sdbc.UNPROVIDED) {
            v_properties = (SubLObject)sdbc.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = v_properties;
        SubLObject allow_other_keys_p = (SubLObject)sdbc.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sdbc.NIL;
        SubLObject current_$5 = (SubLObject)sdbc.NIL;
        while (sdbc.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sdbc.$list94);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sdbc.$list94);
            if (sdbc.NIL == conses_high.member(current_$5, (SubLObject)sdbc.$list95, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED)) {
                bad = (SubLObject)sdbc.T;
            }
            if (current_$5 == sdbc.$kw96$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sdbc.NIL != bad && sdbc.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sdbc.$list94);
        }
        final SubLObject dbms_server_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw72$DBMS_SERVER, current);
        final SubLObject dbms_server = (sdbc.NIL != dbms_server_tail) ? conses_high.cadr(dbms_server_tail) : sdbc.$dbms_server$.getGlobalValue();
        final SubLObject dbms_port_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw97$DBMS_PORT, current);
        final SubLObject dbms_port = (SubLObject)((sdbc.NIL != dbms_port_tail) ? conses_high.cadr(dbms_port_tail) : sdbc.NIL);
        final SubLObject subprotocol_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw77$SUBPROTOCOL, current);
        final SubLObject subprotocol = (sdbc.NIL != subprotocol_tail) ? conses_high.cadr(subprotocol_tail) : sdbc.$sql_subprotocol$.getGlobalValue();
        final SubLObject proxy_server_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw78$PROXY_SERVER, current);
        final SubLObject proxy_server = (sdbc.NIL != proxy_server_tail) ? conses_high.cadr(proxy_server_tail) : dbms_server;
        final SubLObject port_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw73$PORT, current);
        final SubLObject port = (sdbc.NIL != port_tail) ? conses_high.cadr(port_tail) : sdbc.$sql_port$.getGlobalValue();
        final SubLObject timeout_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw98$TIMEOUT, current);
        final SubLObject timeout = (sdbc.NIL != timeout_tail) ? conses_high.cadr(timeout_tail) : sdbc.$sql_connection_timeout$.getGlobalValue();
        assert sdbc.NIL != Types.stringp(db) : db;
        if (sdbc.NIL != user && !assertionsDisabledInClass && sdbc.NIL == Types.stringp(user)) {
            throw new AssertionError(user);
        }
        if (sdbc.NIL != password && !assertionsDisabledInClass && sdbc.NIL == Types.stringp(password)) {
            throw new AssertionError(password);
        }
        assert sdbc.NIL != Types.stringp(dbms_server) : dbms_server;
        if (sdbc.NIL != dbms_port && !assertionsDisabledInClass && sdbc.NIL == Types.integerp(dbms_port)) {
            throw new AssertionError(dbms_port);
        }
        assert sdbc.NIL != Types.integerp(port) : port;
        assert sdbc.NIL != Types.stringp(subprotocol) : subprotocol;
        assert sdbc.NIL != Types.stringp(proxy_server) : proxy_server;
        assert sdbc.NIL != number_utilities.non_negative_number_p(timeout) : timeout;
        SubLObject connection = make_sql_connection((SubLObject)sdbc.UNPROVIDED);
        SubLObject error_message = (SubLObject)sdbc.NIL;
        SubLObject timed_outP = (SubLObject)sdbc.NIL;
        _csetf_sqlc_db(connection, db);
        _csetf_sqlc_user(connection, user);
        _csetf_sqlc_dbms_server(connection, dbms_server);
        _csetf_sqlc_port(connection, port);
        _csetf_sqlc_subprotocol(connection, subprotocol);
        _csetf_sqlc_proxy_server(connection, proxy_server);
        _csetf_sqlc_lock(connection, Locks.make_lock((SubLObject)sdbc.$str101$SQL_connection_lock));
        _csetf_sqlc_error_handling(connection, (SubLObject)sdbc.$kw102$RETURN);
        _csetf_sqlc_tickets(connection, queues.create_queue((SubLObject)sdbc.UNPROVIDED));
        final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
            try {
                subl_macro_promotions.$within_with_timeout$.bind((SubLObject)sdbc.T, thread);
                SubLObject timer = (SubLObject)sdbc.NIL;
                try {
                    final SubLObject _prev_bind_0_$6 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)sdbc.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = subl_macro_promotions.with_timeout_start_timer(timeout, tag);
                        try {
                            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            final SubLObject _prev_bind_0_$7 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind((SubLObject)sdbc.$sym35$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    if (sdbc.NIL == proxy_server || sdbc.NIL == port) {
                                        Errors.error((SubLObject)sdbc.$str103$Trying_to_open_from_a_null_sqlc_c);
                                    }
                                    _csetf_sqlc_channel(connection, subl_promotions.open_tcp_stream_with_timeout(proxy_server, port, (SubLObject)sdbc.NIL, (SubLObject)sdbc.$kw36$PRIVATE));
                                }
                                catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, (SubLObject)sdbc.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$7, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var) {
                            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                        if (sdbc.NIL != error_message) {
                            connection = sqlc_handle_error(connection, new_sdbc_error(sdbc.$client_error$.getGlobalValue(), error_message, (SubLObject)sdbc.UNPROVIDED));
                        }
                        else {
                            _csetf_sqlc_mailman(connection, launch_sql_mailman(connection));
                            final SubLObject result = sqlc_execute(connection, sdbc.$new_connection$.getGlobalValue(), (SubLObject)ConsesLow.list(new_db_url(dbms_server, db, user, password, subprotocol, dbms_port)));
                            if (sdbc.NIL != sdbc_error_p(result)) {
                                sqlc_close(connection);
                                connection = result;
                            }
                        }
                    }
                    finally {
                        subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$6, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sdbc.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        subl_macro_promotions.with_timeout_stop_timer(timer);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                    }
                }
            }
            finally {
                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var2) {
            timed_outP = Errors.handleThrowable(ccatch_env_var2, tag);
        }
        finally {
            thread.throwStack.pop();
        }
        if (sdbc.NIL != timed_outP) {
            sqlc_close(connection);
            connection = sqlc_handle_error(connection, new_sdbc_error(sdbc.$client_error$.getGlobalValue(), (SubLObject)sdbc.$str104$timeout, (SubLObject)sdbc.UNPROVIDED));
        }
        return connection;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 22306L)
    public static SubLObject sql_open_connection_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sdbc.NIL != sql_connection_p(v_object) && sdbc.NIL != sqlc_open_p(v_object));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 22472L)
    public static SubLObject sqlc_open_p(final SubLObject connection) {
        assert sdbc.NIL != sql_connection_p(connection) : connection;
        return (SubLObject)SubLObjectFactory.makeBoolean(sdbc.NIL != sqlc_channel(connection) && sdbc.NIL != streams_high.open_stream_p(sqlc_channel(connection)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 22748L)
    public static SubLObject sqlc_close(final SubLObject connection) {
        assert sdbc.NIL != sql_connection_p(connection) : connection;
        final SubLObject lock = sqlc_lock(connection);
        SubLObject release = (SubLObject)sdbc.NIL;
        try {
            release = Locks.seize_lock(lock);
            if (sdbc.NIL != sqlc_mailman(connection)) {
                Threads.kill_process(sqlc_mailman(connection));
            }
            _csetf_sqlc_mailman(connection, (SubLObject)sdbc.NIL);
            if (sdbc.NIL != sqlc_channel(connection)) {
                streams_high.close(sqlc_channel(connection), (SubLObject)sdbc.UNPROVIDED);
            }
            _csetf_sqlc_channel(connection, (SubLObject)sdbc.NIL);
            SubLObject cdolist_list_var = sqlc_statements(connection);
            SubLObject statement = (SubLObject)sdbc.NIL;
            statement = cdolist_list_var.first();
            while (sdbc.NIL != cdolist_list_var) {
                sqls_local_close(statement);
                cdolist_list_var = cdolist_list_var.rest();
                statement = cdolist_list_var.first();
            }
            _csetf_sqlc_statements(connection, (SubLObject)sdbc.NIL);
            return connection;
        }
        finally {
            if (sdbc.NIL != release) {
                Locks.release_lock(lock);
            }
        }
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 23715L)
    public static SubLObject sqlc_create_statement(final SubLObject connection) {
        assert sdbc.NIL != sql_open_connection_p(connection) : connection;
        final SubLObject statement = new_sql_statement(connection);
        if (sdbc.NIL != sql_statement_p(statement)) {
            _csetf_sqlc_statements(connection, (SubLObject)ConsesLow.cons(statement, sqlc_statements(connection)));
        }
        return statement;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 24108L)
    public static SubLObject sqlc_prepare_statement(final SubLObject connection, final SubLObject sql) {
        assert sdbc.NIL != sql_open_connection_p(connection) : connection;
        assert sdbc.NIL != Types.stringp(sql) : sql;
        final SubLObject statement = new_sql_prepared_statement(connection, sql);
        if (sdbc.NIL != sql_statement_p(statement)) {
            _csetf_sqlc_statements(connection, (SubLObject)ConsesLow.cons(statement, sqlc_statements(connection)));
        }
        return statement;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 24580L)
    public static SubLObject sqlc_set_auto_commit(final SubLObject connection, final SubLObject flag) {
        assert sdbc.NIL != sql_open_connection_p(connection) : connection;
        assert sdbc.NIL != Types.booleanp(flag) : flag;
        return sqlc_execute(connection, sdbc.$set_auto_commit$.getGlobalValue(), (SubLObject)ConsesLow.list(flag));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 24928L)
    public static SubLObject sqlc_get_auto_commit(final SubLObject connection) {
        assert sdbc.NIL != sql_open_connection_p(connection) : connection;
        return sqlc_execute(connection, sdbc.$get_auto_commit$.getGlobalValue(), (SubLObject)sdbc.NIL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 25237L)
    public static SubLObject sqlc_commit(final SubLObject connection) {
        assert sdbc.NIL != sql_open_connection_p(connection) : connection;
        return sqlc_execute(connection, sdbc.$commit$.getGlobalValue(), (SubLObject)sdbc.NIL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 25621L)
    public static SubLObject sqlc_rollback(final SubLObject connection) {
        assert sdbc.NIL != sql_open_connection_p(connection) : connection;
        return sqlc_execute(connection, sdbc.$rollback$.getGlobalValue(), (SubLObject)sdbc.NIL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 25992L)
    public static SubLObject sqlc_get_transaction_isolation(final SubLObject connection) {
        assert sdbc.NIL != sql_open_connection_p(connection) : connection;
        return sqlc_execute(connection, sdbc.$get_transaction_isolation$.getGlobalValue(), (SubLObject)sdbc.NIL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 26438L)
    public static SubLObject sqlc_set_transaction_isolation(final SubLObject connection, final SubLObject transaction_level) {
        assert sdbc.NIL != sql_open_connection_p(connection) : connection;
        assert sdbc.NIL != sql_transaction_level_p(transaction_level) : transaction_level;
        return sqlc_execute(connection, sdbc.$set_transaction_isolation$.getGlobalValue(), (SubLObject)ConsesLow.list(transaction_level));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 27348L)
    public static SubLObject sql_ticket_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)sdbc.ZERO_INTEGER);
        return (SubLObject)sdbc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 27348L)
    public static SubLObject sql_ticket_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_ticket_native.class) ? sdbc.T : sdbc.NIL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 27348L)
    public static SubLObject sql_ticket_semaphore(final SubLObject v_object) {
        assert sdbc.NIL != sql_ticket_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 27348L)
    public static SubLObject sql_ticket_result(final SubLObject v_object) {
        assert sdbc.NIL != sql_ticket_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 27348L)
    public static SubLObject _csetf_sql_ticket_semaphore(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_ticket_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 27348L)
    public static SubLObject _csetf_sql_ticket_result(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_ticket_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 27348L)
    public static SubLObject make_sql_ticket(SubLObject arglist) {
        if (arglist == sdbc.UNPROVIDED) {
            arglist = (SubLObject)sdbc.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_ticket_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)sdbc.NIL, next = arglist; sdbc.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)sdbc.$kw122$SEMAPHORE)) {
                _csetf_sql_ticket_semaphore(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw123$RESULT)) {
                _csetf_sql_ticket_result(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)sdbc.$str82$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 27348L)
    public static SubLObject visit_defstruct_sql_ticket(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw83$BEGIN, (SubLObject)sdbc.$sym124$MAKE_SQL_TICKET, (SubLObject)sdbc.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw122$SEMAPHORE, sql_ticket_semaphore(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw123$RESULT, sql_ticket_result(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw86$END, (SubLObject)sdbc.$sym124$MAKE_SQL_TICKET, (SubLObject)sdbc.TWO_INTEGER);
        return obj;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 27348L)
    public static SubLObject visit_defstruct_object_sql_ticket_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_ticket(obj, visitor_fn);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 27528L)
    public static SubLObject new_sql_ticket() {
        final SubLObject ticket = make_sql_ticket((SubLObject)sdbc.UNPROVIDED);
        _csetf_sql_ticket_semaphore(ticket, Semaphores.new_semaphore((SubLObject)sdbc.$str126$SQL_Request, (SubLObject)sdbc.ZERO_INTEGER));
        return ticket;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 27913L)
    public static SubLObject sql_ticket_retrieve(final SubLObject ticket) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sdbc.NIL;
        while (sdbc.NIL == result) {
            final SubLObject inference = inference_macros.current_controlling_inference();
            final SubLObject inference_remaining_time = (SubLObject)((sdbc.NIL != inference) ? inference_datastructures_inference.inference_remaining_time(inference, (SubLObject)sdbc.T) : sdbc.NIL);
            final SubLObject max_secs_to_wait = inference_remaining_time.isInteger() ? Numbers.add((SubLObject)sdbc.FIVE_INTEGER, inference_remaining_time) : ((sdbc.NIL != inference) ? sdbc.$sql_connection_timeout_seconds_within_inference$.getDynamicValue(thread) : sdbc.$sql_connection_timeout_seconds$.getDynamicValue(thread));
            if (sdbc.NIL != Semaphores.semaphore_wait_with_timeout(sql_ticket_semaphore(ticket), max_secs_to_wait)) {
                result = sql_ticket_result(ticket);
            }
            else {
                result = new_sdbc_error(sdbc.$io_error$.getGlobalValue(), Sequences.cconcatenate((SubLObject)sdbc.$str128$Timed_out_after_, new SubLObject[] { format_nil.format_nil_d_no_copy(max_secs_to_wait), sdbc.$str129$_seconds_retrieving_SQL_ticket }), (SubLObject)sdbc.UNPROVIDED);
            }
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 29112L)
    public static SubLObject launch_sql_mailman(final SubLObject connection) {
        return subl_promotions.make_process_with_args(Sequences.cconcatenate((SubLObject)sdbc.$str130$SQL_Mailman_for_, format_nil.format_nil_a_no_copy(sqlc_print_string(connection))), (SubLObject)sdbc.$sym131$SQLC_DELIVER, (SubLObject)ConsesLow.list(connection));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 29413L)
    public static SubLObject sqlc_deliver(final SubLObject connection) {
        enforceType(connection, sdbc.$sym38$SQL_CONNECTION_P);
        SubLObject result = (SubLObject)sdbc.NIL;
        SubLObject ticket = (SubLObject)sdbc.NIL;
        while (true) {
            result = sqlc_receive(connection);
            final SubLObject lock = sqlc_lock(connection);
            SubLObject release = (SubLObject)sdbc.NIL;
            try {
                release = Locks.seize_lock(lock);
                ticket = queues.dequeue(sqlc_tickets(connection));
            }
            finally {
                if (sdbc.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
            if (sdbc.NIL != ticket) {
                _csetf_sql_ticket_result(ticket, result);
                Semaphores.semaphore_signal(sql_ticket_semaphore(ticket));
            }
            else if (sdbc.NIL != sdbc_client_error_p(result)) {
                streams_high.close(sqlc_channel(connection), (SubLObject)sdbc.UNPROVIDED);
                sqlc_close(connection);
            }
            else {
                Errors.error((SubLObject)sdbc.$str132$Implementation_error__no_ticket_f, result);
            }
        }
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 30323L)
    public static SubLObject sqlc_execute(final SubLObject connection, final SubLObject function, final SubLObject args) {
        final SubLObject ticket = new_sql_ticket();
        SubLObject send_response = (SubLObject)sdbc.NIL;
        SubLObject receive_response = (SubLObject)sdbc.NIL;
        send_response = sqlc_send(connection, ticket, function, args);
        if (sdbc.NIL != sdbc_client_error_p(send_response)) {
            streams_high.close(sqlc_channel(connection), (SubLObject)sdbc.UNPROVIDED);
            sqlc_close(connection);
            return sqlc_handle_error(connection, send_response);
        }
        receive_response = sql_ticket_retrieve(ticket);
        if (sdbc.NIL != sdbc_error_p(receive_response)) {
            if (sdbc.NIL != sdbc_client_error_p(receive_response)) {
                streams_high.close(sqlc_channel(connection), (SubLObject)sdbc.UNPROVIDED);
                sqlc_close(connection);
            }
            return sqlc_handle_error(connection, receive_response);
        }
        return receive_response;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 31513L)
    public static SubLObject sqlc_send(final SubLObject connection, final SubLObject ticket, final SubLObject function, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(connection, sdbc.$sym38$SQL_CONNECTION_P);
        SubLObject error_message = (SubLObject)sdbc.NIL;
        SubLObject response = (SubLObject)sdbc.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)sdbc.$sym35$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (sdbc.NIL == sqlc_channel(connection)) {
                        Errors.error((SubLObject)sdbc.$str133$Trying_to_read_from_a_null_sqlc_c);
                    }
                    final SubLObject lock = sqlc_lock(connection);
                    SubLObject release = (SubLObject)sdbc.NIL;
                    try {
                        release = Locks.seize_lock(lock);
                        queues.enqueue(ticket, sqlc_tickets(connection));
                        cfasl.cfasl_output((SubLObject)ConsesLow.cons(function, args), sqlc_channel(connection));
                        streams_high.force_output(sqlc_channel(connection));
                    }
                    finally {
                        if (sdbc.NIL != release) {
                            Locks.release_lock(lock);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sdbc.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (sdbc.NIL != error_message) {
            response = new_sdbc_error(sdbc.$client_error$.getGlobalValue(), error_message, (SubLObject)sdbc.UNPROVIDED);
        }
        return response;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 32362L)
    public static SubLObject sqlc_receive(final SubLObject connection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(connection, sdbc.$sym38$SQL_CONNECTION_P);
        SubLObject error_message = (SubLObject)sdbc.NIL;
        SubLObject response = (SubLObject)sdbc.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)sdbc.$sym35$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (sdbc.NIL == sqlc_channel(connection)) {
                        Errors.error((SubLObject)sdbc.$str133$Trying_to_read_from_a_null_sqlc_c);
                    }
                    response = cfasl.cfasl_input(sqlc_channel(connection), (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sdbc.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (sdbc.NIL != error_message) {
            response = (SubLObject)ConsesLow.cons(sdbc.$client_error$.getGlobalValue(), (SubLObject)ConsesLow.list(error_message));
        }
        return sql_response_value(response);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 33014L)
    public static SubLObject sqlc_handle_error(final SubLObject connection, final SubLObject error) {
        final SubLObject pcase_var = sqlc_error_handling(connection);
        if (pcase_var.eql((SubLObject)sdbc.$kw102$RETURN)) {
            return error;
        }
        if (pcase_var.eql((SubLObject)sdbc.$kw134$THROW)) {
            sdbc_error_throw(error);
            return error;
        }
        if (pcase_var.eql((SubLObject)sdbc.$kw135$WARN)) {
            sdbc_error_warn(error);
            return error;
        }
        assert sdbc.NIL != sdbc_error_handling_tag_p(sqlc_error_handling(connection)) : sqlc_error_handling(connection);
        return (SubLObject)sdbc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 33488L)
    public static SubLObject sql_transaction_level_p(final SubLObject v_object) {
        return conses_high.member(v_object, (SubLObject)sdbc.$list137, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 34346L)
    public static SubLObject sqlc_set_error_handling(final SubLObject connection, final SubLObject error_handling) {
        _csetf_sqlc_error_handling(connection, error_handling);
        return connection;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 34650L)
    public static SubLObject new_sql_response(final SubLObject code, final SubLObject value) {
        return (SubLObject)ConsesLow.cons(code, value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 34803L)
    public static SubLObject sql_response_code(final SubLObject response) {
        return response.first();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 34906L)
    public static SubLObject sql_response_value(final SubLObject response) {
        final SubLObject code = sql_response_code(response);
        if (code.isNegative()) {
            final SubLObject args = response.rest();
            final SubLObject message = args.first();
            final SubLObject vendor_code = conses_high.second(args);
            return new_sdbc_error(code, message, vendor_code);
        }
        if (code.eql(sdbc.$stop_response$.getGlobalValue())) {
            return (SubLObject)sdbc.$kw140$STOP;
        }
        return response.rest();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 35307L)
    public static SubLObject sql_null_p(final SubLObject v_object) {
        return Equality.eq(v_object, (SubLObject)sdbc.$kw141$NULL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 35500L)
    public static SubLObject sql_true_p(final SubLObject v_object) {
        return v_object;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 35626L)
    public static SubLObject sql_false_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sdbc.NIL == v_object);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 35966L)
    public static SubLObject sdbc_error_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        sdbc_error_print(v_object, stream, (SubLObject)sdbc.ZERO_INTEGER);
        return (SubLObject)sdbc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 35966L)
    public static SubLObject sdbc_error_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sdbc_error_native.class) ? sdbc.T : sdbc.NIL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 35966L)
    public static SubLObject sdbc_error_type(final SubLObject v_object) {
        assert sdbc.NIL != sdbc_error_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 35966L)
    public static SubLObject sdbc_error_message(final SubLObject v_object) {
        assert sdbc.NIL != sdbc_error_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 35966L)
    public static SubLObject sdbc_error_code(final SubLObject v_object) {
        assert sdbc.NIL != sdbc_error_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 35966L)
    public static SubLObject _csetf_sdbc_error_type(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sdbc_error_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 35966L)
    public static SubLObject _csetf_sdbc_error_message(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sdbc_error_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 35966L)
    public static SubLObject _csetf_sdbc_error_code(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sdbc_error_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 35966L)
    public static SubLObject make_sdbc_error(SubLObject arglist) {
        if (arglist == sdbc.UNPROVIDED) {
            arglist = (SubLObject)sdbc.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sdbc_error_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)sdbc.NIL, next = arglist; sdbc.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)sdbc.$kw157$TYPE)) {
                _csetf_sdbc_error_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw158$MESSAGE)) {
                _csetf_sdbc_error_message(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw159$CODE)) {
                _csetf_sdbc_error_code(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)sdbc.$str82$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 35966L)
    public static SubLObject visit_defstruct_sdbc_error(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw83$BEGIN, (SubLObject)sdbc.$sym160$MAKE_SDBC_ERROR, (SubLObject)sdbc.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw157$TYPE, sdbc_error_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw158$MESSAGE, sdbc_error_message(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw159$CODE, sdbc_error_code(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw86$END, (SubLObject)sdbc.$sym160$MAKE_SDBC_ERROR, (SubLObject)sdbc.THREE_INTEGER);
        return obj;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 35966L)
    public static SubLObject visit_defstruct_object_sdbc_error_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sdbc_error(obj, visitor_fn);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 36160L)
    public static SubLObject sdbc_error_throw(final SubLObject error) {
        assert sdbc.NIL != sdbc_error_p(error) : error;
        Errors.error((SubLObject)sdbc.$str162$_a, sdbc_error_message(error));
        return (SubLObject)sdbc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 36378L)
    public static SubLObject sdbc_error_warn(final SubLObject error) {
        assert sdbc.NIL != sdbc_error_p(error) : error;
        Errors.warn((SubLObject)sdbc.$str163$SDBC__a___a, decode_sdbc_error_code(sdbc_error_type(error)), sdbc_error_message(error));
        return (SubLObject)sdbc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 36600L)
    public static SubLObject sdbc_server_error_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sdbc.NIL != sdbc_error_p(v_object) && sdbc.NIL == sdbc_client_error_p(v_object));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 36801L)
    public static SubLObject sdbc_client_error_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sdbc.NIL != sdbc_error_p(v_object) && sdbc_error_type(v_object).eql(sdbc.$client_error$.getGlobalValue()));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 37012L)
    public static SubLObject sdbc_sql_error_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sdbc.NIL != sdbc_error_p(v_object) && sdbc_error_type(v_object).eql(sdbc.$sql_error$.getGlobalValue()));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 37196L)
    public static SubLObject sdbc_io_error_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sdbc.NIL != sdbc_error_p(v_object) && sdbc_error_type(v_object).eql(sdbc.$io_error$.getGlobalValue()));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 37377L)
    public static SubLObject sdbc_transaction_error_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sdbc.NIL != sdbc_error_p(v_object) && sdbc_error_type(v_object).eql(sdbc.$transaction_error$.getGlobalValue()));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 37585L)
    public static SubLObject sdbc_batch_update_error_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sdbc.NIL != sdbc_error_p(v_object) && sdbc_error_type(v_object).eql(sdbc.$batch_update_error$.getGlobalValue()));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 37789L)
    public static SubLObject sdbc_other_error_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sdbc.NIL != sdbc_error_p(v_object) && sdbc_error_type(v_object).eql(sdbc.$unknown_error$.getGlobalValue()));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 38005L)
    public static SubLObject new_sdbc_error(final SubLObject type, final SubLObject message, SubLObject code) {
        if (code == sdbc.UNPROVIDED) {
            code = (SubLObject)sdbc.NIL;
        }
        final SubLObject error = make_sdbc_error((SubLObject)sdbc.UNPROVIDED);
        _csetf_sdbc_error_type(error, type);
        _csetf_sdbc_error_message(error, message);
        _csetf_sdbc_error_code(error, code);
        return error;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 38542L)
    public static SubLObject sdbc_error_print(final SubLObject error, final SubLObject stream, final SubLObject depth) {
        streams_high.write_string((SubLObject)sdbc.$str164$__SDBC, stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
        streams_high.write_string(decode_sdbc_error_code(sdbc_error_type(error)), stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
        streams_high.write_string((SubLObject)sdbc.$str165$_ERROR__, stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
        streams_high.write_string(sdbc_error_message(error), stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
        streams_high.write_string((SubLObject)sdbc.$str166$_, stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
        return error;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 39180L)
    public static SubLObject decode_sdbc_error_code(final SubLObject code) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.assoc(code, sdbc.$sdbc_error_decoding$.getDynamicValue(thread), (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED).rest();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 39643L)
    public static SubLObject sql_result_set_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        sqlrs_print(v_object, stream, (SubLObject)sdbc.ZERO_INTEGER);
        return (SubLObject)sdbc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 39643L)
    public static SubLObject sql_result_set_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_result_set_native.class) ? sdbc.T : sdbc.NIL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 39643L)
    public static SubLObject sqlrs_rows(final SubLObject v_object) {
        assert sdbc.NIL != sql_result_set_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 39643L)
    public static SubLObject sqlrs_current(final SubLObject v_object) {
        assert sdbc.NIL != sql_result_set_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 39643L)
    public static SubLObject sqlrs_last(final SubLObject v_object) {
        assert sdbc.NIL != sql_result_set_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 39643L)
    public static SubLObject sqlrs_start(final SubLObject v_object) {
        assert sdbc.NIL != sql_result_set_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 39643L)
    public static SubLObject sqlrs_connection(final SubLObject v_object) {
        assert sdbc.NIL != sql_result_set_p(v_object) : v_object;
        return v_object.getField6();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 39643L)
    public static SubLObject sqlrs_block_size(final SubLObject v_object) {
        assert sdbc.NIL != sql_result_set_p(v_object) : v_object;
        return v_object.getField7();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 39643L)
    public static SubLObject sqlrs_id(final SubLObject v_object) {
        assert sdbc.NIL != sql_result_set_p(v_object) : v_object;
        return v_object.getField8();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 39643L)
    public static SubLObject _csetf_sqlrs_rows(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_result_set_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 39643L)
    public static SubLObject _csetf_sqlrs_current(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_result_set_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 39643L)
    public static SubLObject _csetf_sqlrs_last(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_result_set_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 39643L)
    public static SubLObject _csetf_sqlrs_start(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_result_set_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 39643L)
    public static SubLObject _csetf_sqlrs_connection(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_result_set_p(v_object) : v_object;
        return v_object.setField6(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 39643L)
    public static SubLObject _csetf_sqlrs_block_size(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_result_set_p(v_object) : v_object;
        return v_object.setField7(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 39643L)
    public static SubLObject _csetf_sqlrs_id(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_result_set_p(v_object) : v_object;
        return v_object.setField8(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 39643L)
    public static SubLObject make_sql_result_set(SubLObject arglist) {
        if (arglist == sdbc.UNPROVIDED) {
            arglist = (SubLObject)sdbc.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_result_set_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)sdbc.NIL, next = arglist; sdbc.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)sdbc.$kw197$ROWS)) {
                _csetf_sqlrs_rows(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw198$CURRENT)) {
                _csetf_sqlrs_current(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw199$LAST)) {
                _csetf_sqlrs_last(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw200$START)) {
                _csetf_sqlrs_start(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw201$CONNECTION)) {
                _csetf_sqlrs_connection(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw202$BLOCK_SIZE)) {
                _csetf_sqlrs_block_size(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw203$ID)) {
                _csetf_sqlrs_id(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)sdbc.$str82$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 39643L)
    public static SubLObject visit_defstruct_sql_result_set(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw83$BEGIN, (SubLObject)sdbc.$sym204$MAKE_SQL_RESULT_SET, (SubLObject)sdbc.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw197$ROWS, sqlrs_rows(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw198$CURRENT, sqlrs_current(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw199$LAST, sqlrs_last(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw200$START, sqlrs_start(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw201$CONNECTION, sqlrs_connection(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw202$BLOCK_SIZE, sqlrs_block_size(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw203$ID, sqlrs_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw86$END, (SubLObject)sdbc.$sym204$MAKE_SQL_RESULT_SET, (SubLObject)sdbc.SEVEN_INTEGER);
        return obj;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 39643L)
    public static SubLObject visit_defstruct_object_sql_result_set_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_result_set(obj, visitor_fn);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 40155L)
    public static SubLObject sqlrs_print(final SubLObject rs, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sdbc.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(rs, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, rs, (SubLObject)sdbc.T, (SubLObject)sdbc.T);
            if (sdbc.NIL != sqlrs_open_p(rs)) {
                final SubLObject row_count = sqlrs_row_count(rs);
                final SubLObject column_count = sqlrs_column_count(rs);
                streams_high.write_string((SubLObject)sdbc.$str206$_, stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
                print_high.princ(row_count, stream);
                streams_high.write_string((SubLObject)(row_count.numE((SubLObject)sdbc.ONE_INTEGER) ? sdbc.$str207$_row__ : sdbc.$str208$_rows__), stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
                print_high.princ(column_count, stream);
                streams_high.write_string((SubLObject)(column_count.numE((SubLObject)sdbc.ONE_INTEGER) ? sdbc.$str209$_column_ : sdbc.$str210$_columns_), stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
            }
            else {
                streams_high.write_string((SubLObject)sdbc.$str211$closed, stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
            }
            print_macros.print_unreadable_object_postamble(stream, rs, (SubLObject)sdbc.T, (SubLObject)sdbc.T);
        }
        return rs;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 40772L)
    public static SubLObject sql_open_result_set_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sdbc.NIL != sql_result_set_p(v_object) && sdbc.NIL != sqlrs_open_p(v_object));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 40953L)
    public static SubLObject sqlrs_close(final SubLObject rs) {
        assert sdbc.NIL != sql_result_set_p(rs) : rs;
        if (sdbc.NIL != sqlrs_open_p(rs)) {
            final SubLObject status = sqlc_execute(sqlrs_connection(rs), sdbc.$close_result_set$.getGlobalValue(), (SubLObject)ConsesLow.list(sqlrs_id(rs)));
            sqlrs_local_close(rs);
            return (sdbc.NIL != sdbc_error_p(status)) ? status : rs;
        }
        return (SubLObject)sdbc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 41553L)
    public static SubLObject sqlrs_emptyP(final SubLObject rs) {
        return Equality.eql((SubLObject)sdbc.ZERO_INTEGER, sqlrs_row_count(rs));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 41673L)
    public static SubLObject sqlrs_absolute(final SubLObject rs, final SubLObject i) {
        assert sdbc.NIL != sql_open_result_set_p(rs) : rs;
        assert sdbc.NIL != Types.integerp(i) : i;
        if (sdbc.NIL != subl_promotions.negative_integer_p(i)) {
            _csetf_sqlrs_current(rs, Numbers.max(Numbers.add(sqlrs_last(rs), (SubLObject)sdbc.ONE_INTEGER, i), (SubLObject)sdbc.ZERO_INTEGER));
        }
        else {
            _csetf_sqlrs_current(rs, Numbers.min(i, number_utilities.f_1X(sqlrs_last(rs))));
        }
        return sqlrs_valid_row_p(rs);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 42112L)
    public static SubLObject sqlrs_next(final SubLObject rs) {
        assert sdbc.NIL != sql_open_result_set_p(rs) : rs;
        if (sqlrs_current(rs).numLE(sqlrs_last(rs))) {
            _csetf_sqlrs_current(rs, Numbers.add(sqlrs_current(rs), (SubLObject)sdbc.ONE_INTEGER));
        }
        return Numbers.numLE(sqlrs_current(rs), sqlrs_last(rs));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 42414L)
    public static SubLObject sqlrs_previous(final SubLObject rs) {
        assert sdbc.NIL != sql_open_result_set_p(rs) : rs;
        if (sqlrs_current(rs).numG((SubLObject)sdbc.ZERO_INTEGER)) {
            _csetf_sqlrs_current(rs, Numbers.subtract(sqlrs_current(rs), (SubLObject)sdbc.ONE_INTEGER));
        }
        return Numbers.numG(sqlrs_current(rs), (SubLObject)sdbc.ZERO_INTEGER);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 42632L)
    public static SubLObject sqlrs_is_last(final SubLObject rs) {
        assert sdbc.NIL != sql_open_result_set_p(rs) : rs;
        return Equality.eql(sqlrs_current(rs), sqlrs_last(rs));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 42808L)
    public static SubLObject sqlrs_is_first(final SubLObject rs) {
        assert sdbc.NIL != sql_open_result_set_p(rs) : rs;
        return Equality.eql(sqlrs_current(rs), (SubLObject)sdbc.ONE_INTEGER);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 42972L)
    public static SubLObject sqlrs_column_count(final SubLObject rs) {
        assert sdbc.NIL != sql_open_result_set_p(rs) : rs;
        return (SubLObject)(sqlrs_row_count(rs).numG((SubLObject)sdbc.ZERO_INTEGER) ? Sequences.length(Vectors.aref(sqlrs_rows(rs), (SubLObject)sdbc.ZERO_INTEGER)) : sdbc.ZERO_INTEGER);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 43170L)
    public static SubLObject sqlrs_row_count(final SubLObject rs) {
        assert sdbc.NIL != sql_open_result_set_p(rs) : rs;
        return sqlrs_last(rs);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 43309L)
    public static SubLObject sqlrs_get_row(final SubLObject rs) {
        assert sdbc.NIL != sql_open_result_set_p(rs) : rs;
        return sqlrs_current(rs);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 43455L)
    public static SubLObject sqlrs_get_object(final SubLObject rs, final SubLObject i) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sdbc.NIL != sql_open_result_set_p(rs) : rs;
        assert sdbc.NIL != subl_promotions.positive_integer_p(i) : i;
        if (sdbc.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sdbc.NIL == sqlrs_valid_row_p(rs)) {
            Errors.error((SubLObject)sdbc.$str213$cursor_not_on_valid_row);
        }
        if (sdbc.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sdbc.NIL == sqlrs_valid_column_p(rs, i)) {
            Errors.error((SubLObject)sdbc.$str214$invalid_column__a, i);
        }
        if (sdbc.NIL == sqlrs_row_local_p(rs)) {
            final SubLObject range = sqlrs_block(rs, sqlrs_current(rs));
            final SubLObject lo = range.first();
            final SubLObject hi = range.rest();
            final SubLObject rs2 = sqlc_execute(sqlrs_connection(rs), sdbc.$get_rows$.getGlobalValue(), (SubLObject)ConsesLow.list(sqlrs_id(rs), lo, hi));
            if (sdbc.NIL != sdbc_error_p(rs2)) {
                return rs2;
            }
            _csetf_sqlrs_rows(rs, sqlrs_rows(rs2));
            _csetf_sqlrs_start(rs, lo);
        }
        return Vectors.aref(Vectors.aref(sqlrs_rows(rs), Numbers.subtract(sqlrs_current(rs), sqlrs_start(rs))), number_utilities.f_1_(i));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 44362L)
    public static SubLObject sqlrs_get_object_tuple(final SubLObject rs) {
        assert sdbc.NIL != sql_open_result_set_p(rs) : rs;
        final SubLObject columns = sqlrs_column_count(rs);
        final SubLObject tuple = (SubLObject)ConsesLow.make_list(columns, (SubLObject)sdbc.UNPROVIDED);
        SubLObject i;
        for (i = (SubLObject)sdbc.NIL, i = (SubLObject)sdbc.ZERO_INTEGER; i.numL(columns); i = Numbers.add(i, (SubLObject)sdbc.ONE_INTEGER)) {
            ConsesLow.set_nth(i, tuple, sqlrs_get_object(rs, number_utilities.f_1X(i)));
        }
        return tuple;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 44694L)
    public static SubLObject new_sql_result_set(final SubLObject first, final SubLObject rows, final SubLObject row_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sdbc.NIL != subl_promotions.non_negative_integer_p(first) : first;
        assert sdbc.NIL != Types.vectorp(rows) : rows;
        assert sdbc.NIL != subl_promotions.non_negative_integer_p(row_count) : row_count;
        final SubLObject rs = make_sql_result_set((SubLObject)sdbc.UNPROVIDED);
        _csetf_sqlrs_start(rs, first);
        _csetf_sqlrs_rows(rs, rows);
        _csetf_sqlrs_current(rs, (SubLObject)sdbc.ZERO_INTEGER);
        _csetf_sqlrs_last(rs, row_count);
        _csetf_sqlrs_connection(rs, (SubLObject)sdbc.T);
        _csetf_sqlrs_block_size(rs, sdbc.$result_set_block_size$.getDynamicValue(thread));
        return rs;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 45617L)
    public static SubLObject sqlrs_closed_p(final SubLObject rs) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sdbc.NIL == sqlrs_open_p(rs));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 45753L)
    public static SubLObject sqlrs_open_p(final SubLObject rs) {
        return list_utilities.sublisp_boolean(sqlrs_connection(rs));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 45892L)
    public static SubLObject sqlrs_valid_row_p(final SubLObject rs) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sqlrs_current(rs).numG((SubLObject)sdbc.ZERO_INTEGER) && sqlrs_current(rs).numLE(sqlrs_last(rs)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 46063L)
    public static SubLObject sqlrs_valid_column_p(final SubLObject rs, final SubLObject i) {
        return (SubLObject)SubLObjectFactory.makeBoolean(i.numG((SubLObject)sdbc.ZERO_INTEGER) && i.numLE(sqlrs_column_count(rs)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 46220L)
    public static SubLObject sqlrs_block(final SubLObject rs, final SubLObject row) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sdbc.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!row.numG((SubLObject)sdbc.ZERO_INTEGER) || !row.numLE(sqlrs_last(rs)))) {
            Errors.error((SubLObject)sdbc.$str217$invalid_row__a, row);
        }
        final SubLObject lo = number_utilities.f_1X(Numbers.multiply(Numbers.floor(number_utilities.f_1_(row), sqlrs_block_size(rs)), sdbc.$result_set_block_size$.getDynamicValue(thread)));
        final SubLObject hi = Numbers.min(sqlrs_last(rs), Numbers.add(lo, sqlrs_block_size(rs), (SubLObject)sdbc.MINUS_ONE_INTEGER));
        return (SubLObject)ConsesLow.cons(lo, hi);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 46618L)
    public static SubLObject sqlrs_row_local_p(final SubLObject rs) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sqlrs_current(rs).numGE(sqlrs_start(rs)) && sqlrs_current(rs).numL(Numbers.add(sqlrs_start(rs), sqlrs_block_size(rs))));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 46870L)
    public static SubLObject sqlrs_row_remote_p(final SubLObject rs) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sdbc.NIL == sqlrs_row_local_p(rs));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 47030L)
    public static SubLObject sqlrs_local_close(final SubLObject rs) {
        _csetf_sqlrs_rows(rs, (SubLObject)sdbc.NIL);
        _csetf_sqlrs_connection(rs, (SubLObject)sdbc.NIL);
        return rs;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 47469L)
    public static SubLObject sql_statement_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)sdbc.ZERO_INTEGER);
        return (SubLObject)sdbc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 47469L)
    public static SubLObject sql_statement_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sql_statement_native.class) ? sdbc.T : sdbc.NIL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 47469L)
    public static SubLObject sqls_connection(final SubLObject v_object) {
        assert sdbc.NIL != sql_statement_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 47469L)
    public static SubLObject sqls_id(final SubLObject v_object) {
        assert sdbc.NIL != sql_statement_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 47469L)
    public static SubLObject sqls_sql(final SubLObject v_object) {
        assert sdbc.NIL != sql_statement_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 47469L)
    public static SubLObject sqls_settings(final SubLObject v_object) {
        assert sdbc.NIL != sql_statement_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 47469L)
    public static SubLObject sqls_batch(final SubLObject v_object) {
        assert sdbc.NIL != sql_statement_p(v_object) : v_object;
        return v_object.getField6();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 47469L)
    public static SubLObject sqls_rs(final SubLObject v_object) {
        assert sdbc.NIL != sql_statement_p(v_object) : v_object;
        return v_object.getField7();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 47469L)
    public static SubLObject _csetf_sqls_connection(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_statement_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 47469L)
    public static SubLObject _csetf_sqls_id(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_statement_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 47469L)
    public static SubLObject _csetf_sqls_sql(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_statement_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 47469L)
    public static SubLObject _csetf_sqls_settings(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_statement_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 47469L)
    public static SubLObject _csetf_sqls_batch(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_statement_p(v_object) : v_object;
        return v_object.setField6(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 47469L)
    public static SubLObject _csetf_sqls_rs(final SubLObject v_object, final SubLObject value) {
        assert sdbc.NIL != sql_statement_p(v_object) : v_object;
        return v_object.setField7(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 47469L)
    public static SubLObject make_sql_statement(SubLObject arglist) {
        if (arglist == sdbc.UNPROVIDED) {
            arglist = (SubLObject)sdbc.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sql_statement_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)sdbc.NIL, next = arglist; sdbc.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)sdbc.$kw201$CONNECTION)) {
                _csetf_sqls_connection(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw203$ID)) {
                _csetf_sqls_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw238$SQL)) {
                _csetf_sqls_sql(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw239$SETTINGS)) {
                _csetf_sqls_settings(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw240$BATCH)) {
                _csetf_sqls_batch(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sdbc.$kw241$RS)) {
                _csetf_sqls_rs(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)sdbc.$str82$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 47469L)
    public static SubLObject visit_defstruct_sql_statement(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw83$BEGIN, (SubLObject)sdbc.$sym242$MAKE_SQL_STATEMENT, (SubLObject)sdbc.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw201$CONNECTION, sqls_connection(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw203$ID, sqls_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw238$SQL, sqls_sql(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw239$SETTINGS, sqls_settings(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw240$BATCH, sqls_batch(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw85$SLOT, (SubLObject)sdbc.$kw241$RS, sqls_rs(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sdbc.$kw86$END, (SubLObject)sdbc.$sym242$MAKE_SQL_STATEMENT, (SubLObject)sdbc.SIX_INTEGER);
        return obj;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 47469L)
    public static SubLObject visit_defstruct_object_sql_statement_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_statement(obj, visitor_fn);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 47909L)
    public static SubLObject sqls_open_p(final SubLObject statement) {
        assert sdbc.NIL != sql_statement_p(statement) : statement;
        return (SubLObject)SubLObjectFactory.makeBoolean(sdbc.NIL != sqls_connection(statement) && sdbc.NIL != sqlc_open_p(sqls_connection(statement)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 48253L)
    public static SubLObject sql_open_statement_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sdbc.NIL != sql_statement_p(v_object) && sdbc.NIL != sql_connection_p(sqls_connection(v_object)) && sdbc.NIL != sqlc_open_p(sqls_connection(v_object)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 48504L)
    public static SubLObject sqls_execute_query(final SubLObject statement, final SubLObject sql, SubLObject block_size) {
        if (block_size == sdbc.UNPROVIDED) {
            block_size = sdbc.$result_set_block_size$.getDynamicValue();
        }
        assert sdbc.NIL != sql_open_statement_p(statement) : statement;
        assert sdbc.NIL != Types.stringp(sql) : sql;
        assert sdbc.NIL != subl_promotions.positive_integer_p(block_size) : block_size;
        final SubLObject rs = sqlc_execute(sqls_connection(statement), sdbc.$execute_query$.getGlobalValue(), (SubLObject)ConsesLow.list(sqls_id(statement), sql, block_size));
        if (sdbc.NIL != sql_result_set_p(rs)) {
            _csetf_sqlrs_connection(rs, sqls_connection(statement));
            _csetf_sqlrs_id(rs, sqls_id(statement));
            _csetf_sqlrs_block_size(rs, block_size);
            if (sdbc.NIL != sqls_rs(statement)) {
                sqlrs_local_close(sqls_rs(statement));
            }
            _csetf_sqls_rs(statement, rs);
        }
        return rs;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 49481L)
    public static SubLObject sqls_execute_update(final SubLObject statement, final SubLObject sql) {
        assert sdbc.NIL != sql_open_statement_p(statement) : statement;
        assert sdbc.NIL != Types.stringp(sql) : sql;
        return sqlc_execute(sqls_connection(statement), sdbc.$execute_update$.getGlobalValue(), (SubLObject)ConsesLow.list(sqls_id(statement), sql));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 49880L)
    public static SubLObject sqls_cancel(final SubLObject statement) {
        assert sdbc.NIL != sql_open_statement_p(statement) : statement;
        return sqlc_execute(sqls_connection(statement), sdbc.$cancel$.getGlobalValue(), (SubLObject)ConsesLow.list(sqls_id(statement)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 50334L)
    public static SubLObject sqls_get_generated_keys(final SubLObject statement, SubLObject block_size) {
        if (block_size == sdbc.UNPROVIDED) {
            block_size = sdbc.$result_set_block_size$.getDynamicValue();
        }
        assert sdbc.NIL != sql_open_statement_p(statement) : statement;
        assert sdbc.NIL != subl_promotions.positive_integer_p(block_size) : block_size;
        final SubLObject rs = sqlc_execute(sqls_connection(statement), sdbc.$get_generated_keys$.getGlobalValue(), (SubLObject)ConsesLow.list(sqls_id(statement), block_size));
        if (sdbc.NIL != sql_result_set_p(rs)) {
            _csetf_sqlrs_connection(rs, sqls_connection(statement));
            _csetf_sqlrs_id(rs, sqls_id(statement));
            _csetf_sqlrs_block_size(rs, block_size);
            if (sdbc.NIL != sqls_rs(statement)) {
                sqlrs_local_close(sqls_rs(statement));
            }
            _csetf_sqls_rs(statement, rs);
        }
        return rs;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 51209L)
    public static SubLObject sqls_close(final SubLObject statement) {
        assert sdbc.NIL != sql_statement_p(statement) : statement;
        SubLObject result = (SubLObject)sdbc.NIL;
        if (sdbc.NIL != sqls_open_p(statement)) {
            result = sqlc_execute(sqls_connection(statement), sdbc.$close_statement$.getGlobalValue(), (SubLObject)ConsesLow.list(sqls_id(statement)));
        }
        sqls_local_close(statement);
        return (sdbc.NIL != sdbc_error_p(result)) ? result : statement;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 51724L)
    public static SubLObject sqls_add_batch(final SubLObject statement, final SubLObject sql) {
        assert sdbc.NIL != sql_open_statement_p(statement) : statement;
        assert sdbc.NIL != Types.stringp(sql) : sql;
        _csetf_sqls_batch(statement, (SubLObject)ConsesLow.cons(sql, sqls_batch(statement)));
        return sql;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 52158L)
    public static SubLObject sqls_clear_batch(final SubLObject statement) {
        assert sdbc.NIL != sql_open_statement_p(statement) : statement;
        final SubLObject count = Sequences.length(sqls_batch(statement));
        _csetf_sqls_batch(statement, (SubLObject)sdbc.NIL);
        return count;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 52413L)
    public static SubLObject sqls_execute_batch(final SubLObject statement) {
        assert sdbc.NIL != sql_open_statement_p(statement) : statement;
        final SubLObject batch = sqls_batch(statement);
        sqls_clear_batch(statement);
        return (SubLObject)((sdbc.NIL != batch) ? sqlc_execute(sqls_connection(statement), sdbc.$execute_batch$.getGlobalValue(), (SubLObject)ConsesLow.list(sqls_id(statement), Sequences.nreverse(batch))) : sdbc.NIL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 52858L)
    public static SubLObject sql_prepared_statement_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sdbc.NIL != sql_statement_p(v_object) && sdbc.NIL != sqls_sql(v_object));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 53063L)
    public static SubLObject sql_prepared_open_statement_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sdbc.NIL != sql_open_statement_p(v_object) && sdbc.NIL != sqls_sql(v_object));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 53259L)
    public static SubLObject sqlps_execute_query(final SubLObject statement, SubLObject block_size) {
        if (block_size == sdbc.UNPROVIDED) {
            block_size = sdbc.$result_set_block_size$.getDynamicValue();
        }
        assert sdbc.NIL != sql_prepared_open_statement_p(statement) : statement;
        assert sdbc.NIL != subl_promotions.positive_integer_p(block_size) : block_size;
        if (sdbc.NIL != sqls_rs(statement)) {
            sqlrs_close(sqls_rs(statement));
        }
        final SubLObject settings = sqls_settings(statement);
        final SubLObject rs = sqlc_execute(sqls_connection(statement), sdbc.$ps_execute_query$.getGlobalValue(), (SubLObject)ConsesLow.list(sqls_id(statement), Sequences.nreverse(settings), block_size));
        _csetf_sqls_settings(statement, (SubLObject)sdbc.NIL);
        _csetf_sqlrs_connection(rs, sqls_connection(statement));
        _csetf_sqlrs_id(rs, sqls_id(statement));
        _csetf_sqlrs_block_size(rs, block_size);
        if (sdbc.NIL != sqls_rs(statement)) {
            sqlrs_local_close(sqls_rs(statement));
        }
        _csetf_sqls_rs(statement, rs);
        return rs;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 54372L)
    public static SubLObject sqlps_execute_update(final SubLObject statement) {
        assert sdbc.NIL != sql_prepared_open_statement_p(statement) : statement;
        final SubLObject settings = sqls_settings(statement);
        _csetf_sqls_settings(statement, (SubLObject)sdbc.NIL);
        return sqlc_execute(sqls_connection(statement), sdbc.$ps_execute_update$.getGlobalValue(), (SubLObject)ConsesLow.list(sqls_id(statement), Sequences.nreverse(settings)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 54805L)
    public static SubLObject sqlps_set_bytes(final SubLObject statement, final SubLObject parameter, final SubLObject bytes) {
        assert sdbc.NIL != sql_prepared_open_statement_p(statement) : statement;
        assert sdbc.NIL != subl_promotions.non_negative_integer_p(parameter) : parameter;
        assert sdbc.NIL != vector_utilities.byte_vector_p(bytes) : bytes;
        return sqlps_set(statement, sdbc.$set_bytes$.getGlobalValue(), parameter, bytes);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 55207L)
    public static SubLObject sqlps_set_int(final SubLObject statement, final SubLObject parameter, final SubLObject v_int) {
        assert sdbc.NIL != sql_prepared_open_statement_p(statement) : statement;
        assert sdbc.NIL != subl_promotions.non_negative_integer_p(parameter) : parameter;
        assert sdbc.NIL != java_integerp(v_int) : v_int;
        return sqlps_set(statement, sdbc.$set_int$.getGlobalValue(), parameter, v_int);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 55590L)
    public static SubLObject sqlps_set_long(final SubLObject statement, final SubLObject parameter, final SubLObject v_long) {
        assert sdbc.NIL != sql_prepared_open_statement_p(statement) : statement;
        assert sdbc.NIL != subl_promotions.non_negative_integer_p(parameter) : parameter;
        assert sdbc.NIL != java_longp(v_long) : v_long;
        return sqlps_set(statement, sdbc.$set_long$.getGlobalValue(), parameter, v_long);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 55975L)
    public static SubLObject sqlps_set_float(final SubLObject statement, final SubLObject parameter, final SubLObject v_float) {
        assert sdbc.NIL != sql_prepared_open_statement_p(statement) : statement;
        assert sdbc.NIL != subl_promotions.non_negative_integer_p(parameter) : parameter;
        assert sdbc.NIL != java_floatp(v_float) : v_float;
        return sqlps_set(statement, sdbc.$set_float$.getGlobalValue(), parameter, v_float);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 56366L)
    public static SubLObject sqlps_set_double(final SubLObject statement, final SubLObject parameter, final SubLObject v_double) {
        assert sdbc.NIL != sql_prepared_open_statement_p(statement) : statement;
        assert sdbc.NIL != subl_promotions.non_negative_integer_p(parameter) : parameter;
        assert sdbc.NIL != java_doublep(v_double) : v_double;
        return sqlps_set(statement, sdbc.$set_double$.getGlobalValue(), parameter, v_double);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 56763L)
    public static SubLObject sqlps_set_string(final SubLObject statement, final SubLObject parameter, final SubLObject string) {
        assert sdbc.NIL != sql_prepared_open_statement_p(statement) : statement;
        assert sdbc.NIL != subl_promotions.non_negative_integer_p(parameter) : parameter;
        assert sdbc.NIL != Types.stringp(string) : string;
        return sqlps_set(statement, sdbc.$set_string$.getGlobalValue(), parameter, string);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 57157L)
    public static SubLObject new_sql_statement(final SubLObject connection) {
        SubLObject statement = make_sql_statement((SubLObject)sdbc.UNPROVIDED);
        SubLObject result = (SubLObject)sdbc.NIL;
        _csetf_sqls_connection(statement, connection);
        _csetf_sqls_id(statement, new_statement_id());
        result = sqlc_execute(connection, sdbc.$create_statement$.getGlobalValue(), (SubLObject)ConsesLow.list(sqls_id(statement)));
        if (sdbc.NIL != sdbc_error_p(result)) {
            statement = result;
        }
        return statement;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 57714L)
    public static SubLObject sqls_get_connection(final SubLObject statement) {
        assert sdbc.NIL != sql_statement_p(statement) : statement;
        return sqls_connection(statement);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 57969L)
    public static SubLObject sqls_local_close(final SubLObject statement) {
        if (sdbc.NIL != sqls_rs(statement)) {
            sqlrs_local_close(sqls_rs(statement));
            _csetf_sqls_rs(statement, (SubLObject)sdbc.NIL);
        }
        if (sdbc.NIL != sqls_connection(statement)) {
            _csetf_sqlc_statements(sqls_connection(statement), Sequences.remove(statement, sqlc_statements(sqls_connection(statement)), (SubLObject)sdbc.EQ, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED));
            _csetf_sqls_connection(statement, (SubLObject)sdbc.NIL);
        }
        return statement;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 58583L)
    public static SubLObject sqlps_set(final SubLObject statement, final SubLObject command, final SubLObject parameter, final SubLObject data) {
        final SubLObject setting = (SubLObject)ConsesLow.list(command, parameter, data);
        _csetf_sqls_settings(statement, (SubLObject)ConsesLow.cons(setting, sqls_settings(statement)));
        return setting;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 58991L)
    public static SubLObject new_sql_prepared_statement(final SubLObject connection, final SubLObject sql) {
        SubLObject statement = make_sql_statement((SubLObject)sdbc.UNPROVIDED);
        SubLObject result = (SubLObject)sdbc.NIL;
        _csetf_sqls_connection(statement, connection);
        _csetf_sqls_id(statement, new_statement_id());
        _csetf_sqls_sql(statement, sql);
        result = sqlc_execute(sqls_connection(statement), sdbc.$prepare_statement$.getGlobalValue(), (SubLObject)ConsesLow.list(sqls_id(statement), sql));
        if (sdbc.NIL != sdbc_error_p(result)) {
            statement = result;
        }
        return statement;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 59643L)
    public static SubLObject new_statement_id() {
        return print_high.princ_to_string(Symbols.gensym((SubLObject)sdbc.$str252$STMT));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 59764L)
    public static SubLObject new_result_set_id() {
        return print_high.princ_to_string(Symbols.gensym((SubLObject)sdbc.$str253$RS));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 59885L)
    public static SubLObject sqlc_get_tables(final SubLObject connection, final SubLObject catalog, final SubLObject schema_pattern, final SubLObject table_name_pattern, final SubLObject types) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sdbc.NIL != sql_open_connection_p(connection) : connection;
        assert sdbc.NIL != Types.stringp(schema_pattern) : schema_pattern;
        assert sdbc.NIL != Types.stringp(table_name_pattern) : table_name_pattern;
        assert sdbc.NIL != Types.listp(types) : types;
        final SubLObject rs = sqlc_execute(connection, sdbc.$get_tables$.getGlobalValue(), (SubLObject)ConsesLow.list(catalog, schema_pattern, table_name_pattern, types, sdbc.$result_set_block_size$.getDynamicValue(thread)));
        if (sdbc.NIL != sql_result_set_p(rs)) {
            _csetf_sqlrs_connection(rs, connection);
            _csetf_sqlrs_id(rs, sdbc.$connection_id$.getGlobalValue());
        }
        return rs;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 61329L)
    public static SubLObject sqlc_get_tables_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema_pattern, final SubLObject table_name_pattern, final SubLObject types) {
        final SubLObject result_set = Functions.apply((SubLObject)sdbc.$sym255$SQLC_GET_TABLES, (SubLObject)ConsesLow.list(connection, catalog, schema_pattern, table_name_pattern, types));
        if (sdbc.NIL == sql_result_set_p(result_set)) {
            Errors.warn((SubLObject)sdbc.$str256$SQLC_error___A, result_set);
            return (SubLObject)sdbc.NIL;
        }
        final SubLObject column_count = sqlrs_column_count(result_set);
        SubLObject results = (SubLObject)sdbc.NIL;
        while (sdbc.NIL == sqlrs_is_last(result_set)) {
            sqlrs_next(result_set);
            SubLObject i = (SubLObject)sdbc.ZERO_INTEGER;
            SubLObject v_bindings = (SubLObject)sdbc.NIL;
            SubLObject cdolist_list_var = (SubLObject)sdbc.$list257;
            SubLObject key = (SubLObject)sdbc.NIL;
            key = cdolist_list_var.first();
            while (sdbc.NIL != cdolist_list_var) {
                i = Numbers.add(i, (SubLObject)sdbc.ONE_INTEGER);
                if (i.numLE(column_count)) {
                    v_bindings = (SubLObject)ConsesLow.cons(key, v_bindings);
                    v_bindings = (SubLObject)ConsesLow.cons(sqlrs_get_object(result_set, i), v_bindings);
                }
                cdolist_list_var = cdolist_list_var.rest();
                key = cdolist_list_var.first();
            }
            results = (SubLObject)ConsesLow.cons(Sequences.nreverse(v_bindings), results);
        }
        return Sequences.nreverse(results);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 61624L)
    public static SubLObject sqlc_get_columns(final SubLObject connection, final SubLObject catalog, final SubLObject schema_pattern, final SubLObject table_name_pattern, final SubLObject column_name_pattern) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sdbc.NIL != sql_open_connection_p(connection) : connection;
        assert sdbc.NIL != Types.stringp(catalog) : catalog;
        assert sdbc.NIL != Types.stringp(schema_pattern) : schema_pattern;
        assert sdbc.NIL != Types.stringp(table_name_pattern) : table_name_pattern;
        assert sdbc.NIL != Types.stringp(column_name_pattern) : column_name_pattern;
        final SubLObject rs = sqlc_execute(connection, sdbc.$get_columns$.getGlobalValue(), (SubLObject)ConsesLow.list(catalog, schema_pattern, table_name_pattern, column_name_pattern, sdbc.$result_set_block_size$.getDynamicValue(thread)));
        if (sdbc.NIL != sql_result_set_p(rs)) {
            _csetf_sqlrs_connection(rs, connection);
            _csetf_sqlrs_id(rs, sdbc.$connection_id$.getGlobalValue());
        }
        return rs;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 63142L)
    public static SubLObject sqlc_get_columns_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema_pattern, final SubLObject table_name_pattern, final SubLObject column_name_pattern) {
        final SubLObject result_set = Functions.apply((SubLObject)sdbc.$sym258$SQLC_GET_COLUMNS, (SubLObject)ConsesLow.list(connection, catalog, schema_pattern, table_name_pattern, column_name_pattern));
        if (sdbc.NIL == sql_result_set_p(result_set)) {
            Errors.warn((SubLObject)sdbc.$str256$SQLC_error___A, result_set);
            return (SubLObject)sdbc.NIL;
        }
        final SubLObject column_count = sqlrs_column_count(result_set);
        SubLObject results = (SubLObject)sdbc.NIL;
        while (sdbc.NIL == sqlrs_is_last(result_set)) {
            sqlrs_next(result_set);
            SubLObject i = (SubLObject)sdbc.ZERO_INTEGER;
            SubLObject v_bindings = (SubLObject)sdbc.NIL;
            SubLObject cdolist_list_var = (SubLObject)sdbc.$list259;
            SubLObject key = (SubLObject)sdbc.NIL;
            key = cdolist_list_var.first();
            while (sdbc.NIL != cdolist_list_var) {
                i = Numbers.add(i, (SubLObject)sdbc.ONE_INTEGER);
                if (i.numLE(column_count)) {
                    v_bindings = (SubLObject)ConsesLow.cons(key, v_bindings);
                    v_bindings = (SubLObject)ConsesLow.cons(sqlrs_get_object(result_set, i), v_bindings);
                }
                cdolist_list_var = cdolist_list_var.rest();
                key = cdolist_list_var.first();
            }
            results = (SubLObject)ConsesLow.cons(Sequences.nreverse(v_bindings), results);
        }
        return Sequences.nreverse(results);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 63657L)
    public static SubLObject sqlc_get_primary_keys(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sdbc.NIL != Types.stringp(catalog) : catalog;
        assert sdbc.NIL != Types.stringp(schema) : schema;
        assert sdbc.NIL != Types.stringp(table) : table;
        final SubLObject rs = sqlc_execute(connection, sdbc.$get_primary_keys$.getGlobalValue(), (SubLObject)ConsesLow.list(catalog, schema, table, sdbc.$result_set_block_size$.getDynamicValue(thread)));
        if (sdbc.NIL != sql_result_set_p(rs)) {
            _csetf_sqlrs_connection(rs, connection);
            _csetf_sqlrs_id(rs, sdbc.$connection_id$.getGlobalValue());
        }
        return rs;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 64825L)
    public static SubLObject sqlc_get_primary_keys_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table) {
        final SubLObject result_set = Functions.apply((SubLObject)sdbc.$sym260$SQLC_GET_PRIMARY_KEYS, (SubLObject)ConsesLow.list(connection, catalog, schema, table));
        if (sdbc.NIL == sql_result_set_p(result_set)) {
            Errors.warn((SubLObject)sdbc.$str256$SQLC_error___A, result_set);
            return (SubLObject)sdbc.NIL;
        }
        final SubLObject column_count = sqlrs_column_count(result_set);
        SubLObject results = (SubLObject)sdbc.NIL;
        while (sdbc.NIL == sqlrs_is_last(result_set)) {
            sqlrs_next(result_set);
            SubLObject i = (SubLObject)sdbc.ZERO_INTEGER;
            SubLObject v_bindings = (SubLObject)sdbc.NIL;
            SubLObject cdolist_list_var = (SubLObject)sdbc.$list261;
            SubLObject key = (SubLObject)sdbc.NIL;
            key = cdolist_list_var.first();
            while (sdbc.NIL != cdolist_list_var) {
                i = Numbers.add(i, (SubLObject)sdbc.ONE_INTEGER);
                if (i.numLE(column_count)) {
                    v_bindings = (SubLObject)ConsesLow.cons(key, v_bindings);
                    v_bindings = (SubLObject)ConsesLow.cons(sqlrs_get_object(result_set, i), v_bindings);
                }
                cdolist_list_var = cdolist_list_var.rest();
                key = cdolist_list_var.first();
            }
            results = (SubLObject)ConsesLow.cons(Sequences.nreverse(v_bindings), results);
        }
        return Sequences.nreverse(results);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 65024L)
    public static SubLObject sqlc_get_imported_keys(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sdbc.NIL != Types.stringp(catalog) : catalog;
        assert sdbc.NIL != Types.stringp(schema) : schema;
        assert sdbc.NIL != Types.stringp(table) : table;
        final SubLObject rs = sqlc_execute(connection, sdbc.$get_imported_keys$.getGlobalValue(), (SubLObject)ConsesLow.list(catalog, schema, table, sdbc.$result_set_block_size$.getDynamicValue(thread)));
        if (sdbc.NIL != sql_result_set_p(rs)) {
            _csetf_sqlrs_connection(rs, connection);
            _csetf_sqlrs_id(rs, sdbc.$connection_id$.getGlobalValue());
        }
        return rs;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 66270L)
    public static SubLObject sqlc_get_imported_keys_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table) {
        final SubLObject result_set = Functions.apply((SubLObject)sdbc.$sym262$SQLC_GET_IMPORTED_KEYS, (SubLObject)ConsesLow.list(connection, catalog, schema, table));
        if (sdbc.NIL == sql_result_set_p(result_set)) {
            Errors.warn((SubLObject)sdbc.$str256$SQLC_error___A, result_set);
            return (SubLObject)sdbc.NIL;
        }
        final SubLObject column_count = sqlrs_column_count(result_set);
        SubLObject results = (SubLObject)sdbc.NIL;
        while (sdbc.NIL == sqlrs_is_last(result_set)) {
            sqlrs_next(result_set);
            SubLObject i = (SubLObject)sdbc.ZERO_INTEGER;
            SubLObject v_bindings = (SubLObject)sdbc.NIL;
            SubLObject cdolist_list_var = (SubLObject)sdbc.$list263;
            SubLObject key = (SubLObject)sdbc.NIL;
            key = cdolist_list_var.first();
            while (sdbc.NIL != cdolist_list_var) {
                i = Numbers.add(i, (SubLObject)sdbc.ONE_INTEGER);
                if (i.numLE(column_count)) {
                    v_bindings = (SubLObject)ConsesLow.cons(key, v_bindings);
                    v_bindings = (SubLObject)ConsesLow.cons(sqlrs_get_object(result_set, i), v_bindings);
                }
                cdolist_list_var = cdolist_list_var.rest();
                key = cdolist_list_var.first();
            }
            results = (SubLObject)ConsesLow.cons(Sequences.nreverse(v_bindings), results);
        }
        return Sequences.nreverse(results);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 66610L)
    public static SubLObject sqlc_get_exported_keys(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sdbc.NIL != sql_open_connection_p(connection) : connection;
        assert sdbc.NIL != Types.stringp(catalog) : catalog;
        assert sdbc.NIL != Types.stringp(schema) : schema;
        assert sdbc.NIL != Types.stringp(table) : table;
        final SubLObject rs = sqlc_execute(connection, sdbc.$get_exported_keys$.getGlobalValue(), (SubLObject)ConsesLow.list(catalog, schema, table, sdbc.$result_set_block_size$.getDynamicValue(thread)));
        if (sdbc.NIL != sql_result_set_p(rs)) {
            _csetf_sqlrs_connection(rs, connection);
            _csetf_sqlrs_id(rs, sdbc.$connection_id$.getGlobalValue());
        }
        return rs;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 68329L)
    public static SubLObject sqlc_get_exported_keys_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table) {
        final SubLObject result_set = Functions.apply((SubLObject)sdbc.$sym264$SQLC_GET_EXPORTED_KEYS, (SubLObject)ConsesLow.list(connection, catalog, schema, table));
        if (sdbc.NIL == sql_result_set_p(result_set)) {
            Errors.warn((SubLObject)sdbc.$str256$SQLC_error___A, result_set);
            return (SubLObject)sdbc.NIL;
        }
        final SubLObject column_count = sqlrs_column_count(result_set);
        SubLObject results = (SubLObject)sdbc.NIL;
        while (sdbc.NIL == sqlrs_is_last(result_set)) {
            sqlrs_next(result_set);
            SubLObject i = (SubLObject)sdbc.ZERO_INTEGER;
            SubLObject v_bindings = (SubLObject)sdbc.NIL;
            SubLObject cdolist_list_var = (SubLObject)sdbc.$list263;
            SubLObject key = (SubLObject)sdbc.NIL;
            key = cdolist_list_var.first();
            while (sdbc.NIL != cdolist_list_var) {
                i = Numbers.add(i, (SubLObject)sdbc.ONE_INTEGER);
                if (i.numLE(column_count)) {
                    v_bindings = (SubLObject)ConsesLow.cons(key, v_bindings);
                    v_bindings = (SubLObject)ConsesLow.cons(sqlrs_get_object(result_set, i), v_bindings);
                }
                cdolist_list_var = cdolist_list_var.rest();
                key = cdolist_list_var.first();
            }
            results = (SubLObject)ConsesLow.cons(Sequences.nreverse(v_bindings), results);
        }
        return Sequences.nreverse(results);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 68670L)
    public static SubLObject sqlc_get_index_info(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table, final SubLObject unique, final SubLObject approximate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sdbc.NIL != sql_open_connection_p(connection) : connection;
        assert sdbc.NIL != Types.stringp(catalog) : catalog;
        assert sdbc.NIL != Types.stringp(schema) : schema;
        assert sdbc.NIL != Types.stringp(table) : table;
        assert sdbc.NIL != Types.booleanp(unique) : unique;
        assert sdbc.NIL != Types.booleanp(approximate) : approximate;
        final SubLObject rs = sqlc_execute(connection, sdbc.$get_index_info$.getGlobalValue(), (SubLObject)ConsesLow.list(catalog, schema, table, unique, approximate, sdbc.$result_set_block_size$.getDynamicValue(thread)));
        if (sdbc.NIL != sql_result_set_p(rs)) {
            _csetf_sqlrs_connection(rs, connection);
            _csetf_sqlrs_id(rs, sdbc.$connection_id$.getGlobalValue());
        }
        return rs;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 70282L)
    public static SubLObject sqlc_get_index_info_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table, final SubLObject unique, final SubLObject approximate) {
        final SubLObject result_set = Functions.apply((SubLObject)sdbc.$sym265$SQLC_GET_INDEX_INFO, (SubLObject)ConsesLow.list(connection, catalog, schema, table, unique, approximate));
        if (sdbc.NIL == sql_result_set_p(result_set)) {
            Errors.warn((SubLObject)sdbc.$str256$SQLC_error___A, result_set);
            return (SubLObject)sdbc.NIL;
        }
        final SubLObject column_count = sqlrs_column_count(result_set);
        SubLObject results = (SubLObject)sdbc.NIL;
        while (sdbc.NIL == sqlrs_is_last(result_set)) {
            sqlrs_next(result_set);
            SubLObject i = (SubLObject)sdbc.ZERO_INTEGER;
            SubLObject v_bindings = (SubLObject)sdbc.NIL;
            SubLObject cdolist_list_var = (SubLObject)sdbc.$list266;
            SubLObject key = (SubLObject)sdbc.NIL;
            key = cdolist_list_var.first();
            while (sdbc.NIL != cdolist_list_var) {
                i = Numbers.add(i, (SubLObject)sdbc.ONE_INTEGER);
                if (i.numLE(column_count)) {
                    v_bindings = (SubLObject)ConsesLow.cons(key, v_bindings);
                    v_bindings = (SubLObject)ConsesLow.cons(sqlrs_get_object(result_set, i), v_bindings);
                }
                cdolist_list_var = cdolist_list_var.rest();
                key = cdolist_list_var.first();
            }
            results = (SubLObject)ConsesLow.cons(Sequences.nreverse(v_bindings), results);
        }
        return Sequences.nreverse(results);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 70615L)
    public static SubLObject sqlc_get_max_connections(final SubLObject connection) {
        assert sdbc.NIL != sql_open_connection_p(connection) : connection;
        return sqlc_execute(connection, sdbc.$get_max_connections$.getGlobalValue(), (SubLObject)sdbc.NIL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 70948L)
    public static SubLObject sdbc_error_handling_tag_p(final SubLObject v_object) {
        return conses_high.member(v_object, (SubLObject)sdbc.$list267, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 71176L)
    public static SubLObject new_db_url(final SubLObject dbms_server, final SubLObject db, final SubLObject user, final SubLObject password, final SubLObject subprotocol, SubLObject port) {
        if (port == sdbc.UNPROVIDED) {
            port = (SubLObject)sdbc.NIL;
        }
        if (sdbc.NIL != Strings.string_equal(string_utilities.string_first_n((SubLObject)sdbc.EIGHT_INTEGER, subprotocol), (SubLObject)sdbc.$str268$com_cyc_, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED)) {
            return PrintLow.format((SubLObject)sdbc.NIL, (SubLObject)sdbc.$str269$_a__a__a, new SubLObject[] { sdbc.$sql_protocol$.getGlobalValue(), subprotocol, db });
        }
        SubLObject v_properties = (SubLObject)ConsesLow.list(new SubLObject[] { sdbc.$kw270$SUB_PROTOCOL, subprotocol, sdbc.$kw72$DBMS_SERVER, dbms_server, sdbc.$kw271$DATABASE, db, sdbc.$kw71$USER, user, sdbc.$kw272$PASSWORD, password });
        if (sdbc.NIL != subl_promotions.non_negative_integer_p(port)) {
            v_properties = conses_high.putf(v_properties, (SubLObject)sdbc.$kw73$PORT, port);
        }
        return construct_new_database_connection_url(subprotocol, v_properties);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 74674L)
    public static SubLObject add_sdbc_database_connection_url_description(final SubLObject sub_protocol, final SubLObject pattern, final SubLObject option_names, final SubLObject option_punctuation, final SubLObject defaults) {
        assert sdbc.NIL != Types.stringp(sub_protocol) : sub_protocol;
        assert sdbc.NIL != Types.consp(pattern) : pattern;
        assert sdbc.NIL != list_utilities.property_list_p(option_names) : option_names;
        assert sdbc.NIL != list_utilities.property_list_p(option_punctuation) : option_punctuation;
        assert sdbc.NIL != list_utilities.property_list_p(defaults) : defaults;
        final SubLObject description = dictionary.new_dictionary((SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
        map_utilities.map_put(description, (SubLObject)sdbc.$kw285$DEFAULTS, defaults);
        map_utilities.map_put(description, (SubLObject)sdbc.$kw286$PATTERN, pattern);
        map_utilities.map_put(description, (SubLObject)sdbc.$kw287$OPTION_PUNCTUATION, compile_db_conn_url_punctuation_info(option_punctuation));
        map_utilities.map_put(description, (SubLObject)sdbc.$kw288$OPTION_NAMES, option_names);
        map_utilities.map_put(sdbc.$sdbc_database_connection_url_descriptions$.getGlobalValue(), sub_protocol, description);
        return sub_protocol;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 75923L)
    public static SubLObject get_all_sdbc_database_sub_protocols() {
        return map_utilities.map_keys(sdbc.$sdbc_database_connection_url_descriptions$.getGlobalValue());
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 76093L)
    public static SubLObject compile_db_conn_url_punctuation_info(final SubLObject option_punctuation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sdbc.NIL == option_punctuation) {
            return (SubLObject)sdbc.NIL;
        }
        SubLObject final_punctuation = conses_high.copy_list(option_punctuation);
        if (sdbc.$kw290$UNDEFINED == conses_high.getf(final_punctuation, (SubLObject)sdbc.$kw291$TERMINATOR, (SubLObject)sdbc.$kw290$UNDEFINED)) {
            final_punctuation = conses_high.putf(final_punctuation, (SubLObject)sdbc.$kw291$TERMINATOR, (SubLObject)sdbc.$str169$);
        }
        if (sdbc.$kw292$SEPARATOR == conses_high.getf(final_punctuation, (SubLObject)sdbc.$kw200$START, (SubLObject)sdbc.$kw292$SEPARATOR)) {
            final SubLObject separator = conses_high.getf(final_punctuation, (SubLObject)sdbc.$kw292$SEPARATOR, (SubLObject)sdbc.$kw290$UNDEFINED);
            if (sdbc.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !separator.isString()) {
                Errors.error((SubLObject)sdbc.$str293$Separator_must_be_defined_as_stri, separator);
            }
            final_punctuation = conses_high.putf(final_punctuation, (SubLObject)sdbc.$kw200$START, separator);
        }
        final SubLObject value = conses_high.getf(final_punctuation, (SubLObject)sdbc.$kw294$VALUE, (SubLObject)sdbc.$kw290$UNDEFINED);
        if (sdbc.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !value.isString()) {
            Errors.error((SubLObject)sdbc.$str295$Value_demarcator_must_be_specifie, value);
        }
        return final_punctuation;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 77143L)
    public static SubLObject register_sdbc_database_connection_url_description(final SubLObject macroform, final SubLObject environment) {
        final SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject allow_other_keys_p = (SubLObject)sdbc.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sdbc.NIL;
        SubLObject current_$9 = (SubLObject)sdbc.NIL;
        while (sdbc.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sdbc.$list296);
            current_$9 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sdbc.$list296);
            if (sdbc.NIL == conses_high.member(current_$9, (SubLObject)sdbc.$list297, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED)) {
                bad = (SubLObject)sdbc.T;
            }
            if (current_$9 == sdbc.$kw96$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sdbc.NIL != bad && sdbc.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sdbc.$list296);
        }
        final SubLObject sub_protocol_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw270$SUB_PROTOCOL, current);
        final SubLObject sub_protocol = (SubLObject)((sdbc.NIL != sub_protocol_tail) ? conses_high.cadr(sub_protocol_tail) : sdbc.NIL);
        final SubLObject pattern_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw286$PATTERN, current);
        final SubLObject pattern = (SubLObject)((sdbc.NIL != pattern_tail) ? conses_high.cadr(pattern_tail) : sdbc.NIL);
        final SubLObject option_names_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw288$OPTION_NAMES, current);
        final SubLObject option_names = (SubLObject)((sdbc.NIL != option_names_tail) ? conses_high.cadr(option_names_tail) : sdbc.NIL);
        final SubLObject option_punctuation_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw287$OPTION_PUNCTUATION, current);
        final SubLObject option_punctuation = (SubLObject)((sdbc.NIL != option_punctuation_tail) ? conses_high.cadr(option_punctuation_tail) : sdbc.NIL);
        final SubLObject defaults_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw285$DEFAULTS, current);
        final SubLObject defaults = (SubLObject)((sdbc.NIL != defaults_tail) ? conses_high.cadr(defaults_tail) : sdbc.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym298$ADD_SDBC_DATABASE_CONNECTION_URL_DESCRIPTION, sub_protocol, pattern, option_names, option_punctuation, defaults);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 81592L)
    public static SubLObject set_sdbc_db2_port(final SubLObject port) {
        enforceType(port, sdbc.$sym215$NON_NEGATIVE_INTEGER_P);
        sdbc.$sdbc_db2_port$.setGlobalValue(port);
        return sdbc.$sdbc_db2_port$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 81736L)
    public static SubLObject sdbc_db2_port() {
        return sdbc.$sdbc_db2_port$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 82292L)
    public static SubLObject set_sdbc_sybase_iq_port(final SubLObject port) {
        enforceType(port, sdbc.$sym215$NON_NEGATIVE_INTEGER_P);
        sdbc.$sdbc_sybase_iq_port$.setGlobalValue(port);
        return sdbc.$sdbc_sybase_iq_port$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 82454L)
    public static SubLObject sdbc_sybase_iq_port() {
        return sdbc.$sdbc_sybase_iq_port$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 82875L)
    public static SubLObject construct_new_database_connection_url(final SubLObject sub_protocol, SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sdbc.NIL != list_utilities.property_list_p(v_properties) : v_properties;
        final SubLObject description = map_utilities.map_get(sdbc.$sdbc_database_connection_url_descriptions$.getGlobalValue(), sub_protocol, (SubLObject)sdbc.$kw290$UNDEFINED);
        SubLObject result = (SubLObject)sdbc.NIL;
        if (sdbc.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sdbc.NIL == map_utilities.map_p(description)) {
            Errors.error((SubLObject)sdbc.$str345$unknown_jdbc_subprotocol___a, sub_protocol);
        }
        if (!sub_protocol.equal(conses_high.getf(v_properties, (SubLObject)sdbc.$kw270$SUB_PROTOCOL, (SubLObject)sdbc.UNPROVIDED))) {
            v_properties = (SubLObject)ConsesLow.cons((SubLObject)sdbc.$kw270$SUB_PROTOCOL, (SubLObject)ConsesLow.cons(sub_protocol, v_properties));
        }
        if (!conses_high.getf(v_properties, (SubLObject)sdbc.$kw346$PROTOCOL, (SubLObject)sdbc.$kw347$NOT_FOUND).isString()) {
            v_properties = (SubLObject)ConsesLow.cons((SubLObject)sdbc.$kw346$PROTOCOL, (SubLObject)ConsesLow.cons(sdbc.$sql_protocol$.getGlobalValue(), v_properties));
        }
        final SubLObject pattern = map_utilities.map_get(description, (SubLObject)sdbc.$kw286$PATTERN, (SubLObject)sdbc.UNPROVIDED);
        final SubLObject defaults = map_utilities.map_get(description, (SubLObject)sdbc.$kw285$DEFAULTS, (SubLObject)sdbc.UNPROVIDED);
        final SubLObject option_names = map_utilities.map_get(description, (SubLObject)sdbc.$kw288$OPTION_NAMES, (SubLObject)sdbc.UNPROVIDED);
        final SubLObject option_punctuation = map_utilities.map_get(description, (SubLObject)sdbc.$kw287$OPTION_PUNCTUATION, (SubLObject)sdbc.UNPROVIDED);
        final SubLObject url_stream = streams_high.make_string_output_stream();
        construct_new_dbconn_url_required(url_stream, pattern, v_properties, defaults);
        append_dbconn_url_options(url_stream, option_names, option_punctuation, v_properties, defaults);
        result = streams_high.get_output_stream_string(url_stream);
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 84342L)
    public static SubLObject construct_new_dbconn_url_required(final SubLObject url_stream, final SubLObject pattern, final SubLObject v_properties, final SubLObject defaults) {
        SubLObject cdolist_list_var = pattern;
        SubLObject element = (SubLObject)sdbc.NIL;
        element = cdolist_list_var.first();
        while (sdbc.NIL != cdolist_list_var) {
            if (element.isString()) {
                streams_high.write_string(element, url_stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
            }
            else if (element.isKeyword()) {
                print_high.princ(resolve_dbconn_url_reference(element, v_properties, defaults), url_stream);
            }
            else if (element.isCons()) {
                SubLObject current;
                final SubLObject datum = current = element;
                SubLObject functor = (SubLObject)sdbc.NIL;
                SubLObject item = (SubLObject)sdbc.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list348);
                functor = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list348);
                item = current.first();
                current = current.rest();
                if (sdbc.NIL == current) {
                    final SubLObject value = resolve_dbconn_url_reference(item, v_properties, defaults);
                    SubLObject result = (SubLObject)sdbc.NIL;
                    final SubLObject pcase_var = functor;
                    if (pcase_var.eql((SubLObject)sdbc.$kw349$UPCASE)) {
                        result = Strings.string_upcase(string_utilities.to_string(value), (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
                    }
                    else {
                        Errors.error((SubLObject)sdbc.$str350$Functor__A_not_implemented_yet_, functor);
                    }
                    streams_high.write_string(result, url_stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sdbc.$list348);
                }
            }
            else {
                Errors.error((SubLObject)sdbc.$str351$Pattern__S_contains__S__which_is_, pattern, element);
            }
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        return url_stream;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 85220L)
    public static SubLObject resolve_dbconn_url_reference(final SubLObject element, final SubLObject v_properties, final SubLObject defaults) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (element.isString()) {
            return element;
        }
        if (sdbc.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !element.isKeyword()) {
            Errors.error((SubLObject)sdbc.$str352$Element__A_is_neither_a_STRINGP_n, element);
        }
        final SubLObject default_value = conses_high.getf(defaults, element, (SubLObject)sdbc.$kw347$NOT_FOUND);
        SubLObject value = conses_high.getf(v_properties, element, default_value);
        if (sdbc.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sdbc.$kw347$NOT_FOUND == value) {
            Errors.error((SubLObject)sdbc.$str353$No_value_provided_for__S_in_eithe, element, v_properties, defaults);
        }
        if (value.isSymbol() && !value.isKeyword() && sdbc.NIL != Symbols.boundp(value)) {
            value = Symbols.symbol_value(value);
        }
        return value;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 85907L)
    public static SubLObject append_dbconn_url_options(final SubLObject url_stream, final SubLObject option_names, final SubLObject option_punctuation, final SubLObject v_properties, final SubLObject defaults) {
        SubLObject written = (SubLObject)sdbc.ZERO_INTEGER;
        SubLObject remainder;
        SubLObject option_keyword;
        SubLObject option_name;
        SubLObject default_value;
        SubLObject value;
        for (remainder = (SubLObject)sdbc.NIL, remainder = option_names; sdbc.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            option_keyword = remainder.first();
            option_name = conses_high.cadr(remainder);
            default_value = conses_high.getf(defaults, option_keyword, (SubLObject)sdbc.$kw347$NOT_FOUND);
            value = conses_high.getf(v_properties, option_keyword, default_value);
            if (sdbc.NIL != value && sdbc.NIL == string_utilities.empty_string_p(value) && sdbc.$kw347$NOT_FOUND != value) {
                write_dbconn_url_punctuation(url_stream, option_punctuation, (SubLObject)(written.isZero() ? sdbc.$kw200$START : sdbc.$kw292$SEPARATOR));
                streams_high.write_string(option_name, url_stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
                write_dbconn_url_punctuation(url_stream, option_punctuation, (SubLObject)sdbc.$kw294$VALUE);
                print_high.princ(value, url_stream);
                written = Numbers.add(written, (SubLObject)sdbc.ONE_INTEGER);
            }
        }
        if (!written.isZero()) {
            write_dbconn_url_punctuation(url_stream, option_punctuation, (SubLObject)sdbc.$kw291$TERMINATOR);
        }
        return url_stream;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 86889L)
    public static SubLObject write_dbconn_url_punctuation(final SubLObject url_stream, final SubLObject punctuation, final SubLObject key) {
        streams_high.write_string(conses_high.getf(punctuation, key, (SubLObject)sdbc.$str169$), url_stream, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED);
        return url_stream;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 87038L)
    public static SubLObject java_integerp(final SubLObject number) {
        return (SubLObject)SubLObjectFactory.makeBoolean(number.isInteger() && number.numG((SubLObject)sdbc.$int354$_2147483649) && number.numL((SubLObject)sdbc.$int355$2147483648));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 87244L)
    public static SubLObject java_longp(final SubLObject number) {
        return (SubLObject)SubLObjectFactory.makeBoolean(number.isInteger() && number.numG((SubLObject)sdbc.$int356$_9223372036854775809) && number.numL((SubLObject)sdbc.$int357$9223372036854775808));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 87390L)
    public static SubLObject java_floatp(final SubLObject number) {
        return Types.floatp(number);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 87453L)
    public static SubLObject java_doublep(final SubLObject number) {
        return Types.floatp(number);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 87517L)
    public static SubLObject with_sql_connection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list358);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject connection = (SubLObject)sdbc.NIL;
        SubLObject db = (SubLObject)sdbc.NIL;
        SubLObject user = (SubLObject)sdbc.NIL;
        SubLObject password = (SubLObject)sdbc.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list358);
        connection = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list358);
        db = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list358);
        user = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list358);
        password = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sdbc.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sdbc.NIL;
        SubLObject current_$10 = (SubLObject)sdbc.NIL;
        while (sdbc.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sdbc.$list358);
            current_$10 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sdbc.$list358);
            if (sdbc.NIL == conses_high.member(current_$10, (SubLObject)sdbc.$list359, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED)) {
                bad = (SubLObject)sdbc.T;
            }
            if (current_$10 == sdbc.$kw96$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sdbc.NIL != bad && sdbc.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sdbc.$list358);
        }
        final SubLObject dbms_server_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw72$DBMS_SERVER, current);
        final SubLObject dbms_server = (SubLObject)((sdbc.NIL != dbms_server_tail) ? conses_high.cadr(dbms_server_tail) : sdbc.$sym1$_DBMS_SERVER_);
        final SubLObject port_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw73$PORT, current);
        final SubLObject port = (SubLObject)((sdbc.NIL != port_tail) ? conses_high.cadr(port_tail) : sdbc.$sym7$_SQL_PORT_);
        final SubLObject subprotocol_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw77$SUBPROTOCOL, current);
        final SubLObject subprotocol = (SubLObject)((sdbc.NIL != subprotocol_tail) ? conses_high.cadr(subprotocol_tail) : sdbc.$sym360$_SQL_SUBPROTOCOL_);
        final SubLObject proxy_server_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw78$PROXY_SERVER, current);
        final SubLObject proxy_server = (sdbc.NIL != proxy_server_tail) ? conses_high.cadr(proxy_server_tail) : dbms_server;
        final SubLObject timeout_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw98$TIMEOUT, current);
        final SubLObject timeout = (SubLObject)((sdbc.NIL != timeout_tail) ? conses_high.cadr(timeout_tail) : sdbc.$sym361$_SQL_CONNECTION_TIMEOUT_);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym362$CLET, (SubLObject)ConsesLow.list(connection), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym363$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)sdbc.$sym364$PROGN, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym365$CSETQ, connection, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym366$NEW_SQL_CONNECTION, db, user, password, (SubLObject)ConsesLow.list(new SubLObject[] { sdbc.$sym367$LIST, sdbc.$kw72$DBMS_SERVER, dbms_server, sdbc.$kw73$PORT, port, sdbc.$kw77$SUBPROTOCOL, subprotocol, sdbc.$kw78$PROXY_SERVER, proxy_server, sdbc.$kw98$TIMEOUT, timeout }))), ConsesLow.append(body, (SubLObject)sdbc.NIL)), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym368$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym38$SQL_CONNECTION_P, connection), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym369$SQLC_CLOSE, connection))));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 88385L)
    public static SubLObject with_sql_statement(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list370);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject statement = (SubLObject)sdbc.NIL;
        SubLObject db = (SubLObject)sdbc.NIL;
        SubLObject user = (SubLObject)sdbc.NIL;
        SubLObject password = (SubLObject)sdbc.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list370);
        statement = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list370);
        db = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list370);
        user = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list370);
        password = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sdbc.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sdbc.NIL;
        SubLObject current_$11 = (SubLObject)sdbc.NIL;
        while (sdbc.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sdbc.$list370);
            current_$11 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sdbc.$list370);
            if (sdbc.NIL == conses_high.member(current_$11, (SubLObject)sdbc.$list359, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED)) {
                bad = (SubLObject)sdbc.T;
            }
            if (current_$11 == sdbc.$kw96$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sdbc.NIL != bad && sdbc.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sdbc.$list370);
        }
        final SubLObject dbms_server_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw72$DBMS_SERVER, current);
        final SubLObject dbms_server = (SubLObject)((sdbc.NIL != dbms_server_tail) ? conses_high.cadr(dbms_server_tail) : sdbc.$sym1$_DBMS_SERVER_);
        final SubLObject port_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw73$PORT, current);
        final SubLObject port = (SubLObject)((sdbc.NIL != port_tail) ? conses_high.cadr(port_tail) : sdbc.$sym7$_SQL_PORT_);
        final SubLObject subprotocol_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw77$SUBPROTOCOL, current);
        final SubLObject subprotocol = (SubLObject)((sdbc.NIL != subprotocol_tail) ? conses_high.cadr(subprotocol_tail) : sdbc.$sym360$_SQL_SUBPROTOCOL_);
        final SubLObject proxy_server_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw78$PROXY_SERVER, current);
        final SubLObject proxy_server = (sdbc.NIL != proxy_server_tail) ? conses_high.cadr(proxy_server_tail) : dbms_server;
        final SubLObject timeout_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw98$TIMEOUT, current);
        final SubLObject timeout = (SubLObject)((sdbc.NIL != timeout_tail) ? conses_high.cadr(timeout_tail) : sdbc.$sym361$_SQL_CONNECTION_TIMEOUT_);
        final SubLObject body;
        current = (body = temp);
        final SubLObject connection = (SubLObject)sdbc.$sym371$CONNECTION;
        return (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym362$CLET, (SubLObject)ConsesLow.list(statement), (SubLObject)ConsesLow.listS((SubLObject)sdbc.$sym372$WITH_SQL_CONNECTION, (SubLObject)ConsesLow.list(new SubLObject[] { connection, db, user, password, sdbc.$kw72$DBMS_SERVER, dbms_server, sdbc.$kw73$PORT, port, sdbc.$kw77$SUBPROTOCOL, subprotocol, sdbc.$kw78$PROXY_SERVER, proxy_server, sdbc.$kw98$TIMEOUT, timeout }), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym373$PIF, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym106$SQL_OPEN_CONNECTION_P, connection), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym365$CSETQ, statement, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym374$SQLC_CREATE_STATEMENT, connection)), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym365$CSETQ, statement, connection)), ConsesLow.append(body, (SubLObject)sdbc.NIL)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 89253L)
    public static SubLObject with_prepared_sql_statement(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list375);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject statement = (SubLObject)sdbc.NIL;
        SubLObject sql = (SubLObject)sdbc.NIL;
        SubLObject db = (SubLObject)sdbc.NIL;
        SubLObject user = (SubLObject)sdbc.NIL;
        SubLObject password = (SubLObject)sdbc.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list375);
        statement = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list375);
        sql = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list375);
        db = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list375);
        user = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list375);
        password = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sdbc.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sdbc.NIL;
        SubLObject current_$12 = (SubLObject)sdbc.NIL;
        while (sdbc.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sdbc.$list375);
            current_$12 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sdbc.$list375);
            if (sdbc.NIL == conses_high.member(current_$12, (SubLObject)sdbc.$list359, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED)) {
                bad = (SubLObject)sdbc.T;
            }
            if (current_$12 == sdbc.$kw96$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sdbc.NIL != bad && sdbc.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sdbc.$list375);
        }
        final SubLObject dbms_server_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw72$DBMS_SERVER, current);
        final SubLObject dbms_server = (SubLObject)((sdbc.NIL != dbms_server_tail) ? conses_high.cadr(dbms_server_tail) : sdbc.$sym1$_DBMS_SERVER_);
        final SubLObject port_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw73$PORT, current);
        final SubLObject port = (SubLObject)((sdbc.NIL != port_tail) ? conses_high.cadr(port_tail) : sdbc.$sym7$_SQL_PORT_);
        final SubLObject subprotocol_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw77$SUBPROTOCOL, current);
        final SubLObject subprotocol = (SubLObject)((sdbc.NIL != subprotocol_tail) ? conses_high.cadr(subprotocol_tail) : sdbc.$sym360$_SQL_SUBPROTOCOL_);
        final SubLObject proxy_server_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw78$PROXY_SERVER, current);
        final SubLObject proxy_server = (sdbc.NIL != proxy_server_tail) ? conses_high.cadr(proxy_server_tail) : dbms_server;
        final SubLObject timeout_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw98$TIMEOUT, current);
        final SubLObject timeout = (SubLObject)((sdbc.NIL != timeout_tail) ? conses_high.cadr(timeout_tail) : sdbc.$sym361$_SQL_CONNECTION_TIMEOUT_);
        final SubLObject body;
        current = (body = temp);
        final SubLObject connection = (SubLObject)sdbc.$sym376$CONNECTION;
        return (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym362$CLET, (SubLObject)ConsesLow.list(statement), (SubLObject)ConsesLow.listS((SubLObject)sdbc.$sym372$WITH_SQL_CONNECTION, (SubLObject)ConsesLow.list(new SubLObject[] { connection, db, user, password, sdbc.$kw72$DBMS_SERVER, dbms_server, sdbc.$kw73$PORT, port, sdbc.$kw77$SUBPROTOCOL, subprotocol, sdbc.$kw78$PROXY_SERVER, proxy_server, sdbc.$kw98$TIMEOUT, timeout }), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym373$PIF, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym106$SQL_OPEN_CONNECTION_P, connection), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym365$CSETQ, statement, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym377$SQLC_PREPARE_STATEMENT, connection, sql)), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym365$CSETQ, statement, connection)), ConsesLow.append(body, (SubLObject)sdbc.NIL)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 90140L)
    public static SubLObject sqls_execute_transaction(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list378);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject statement = (SubLObject)sdbc.NIL;
        SubLObject error = (SubLObject)sdbc.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list378);
        statement = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list378);
        error = current.first();
        current = current.rest();
        if (sdbc.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject connection = (SubLObject)sdbc.$sym379$CONNECTION;
            final SubLObject auto_commit = (SubLObject)sdbc.$sym380$AUTO_COMMIT;
            final SubLObject commit_error = (SubLObject)sdbc.$sym381$COMMIT_ERROR;
            final SubLObject rollback_result = (SubLObject)sdbc.$sym382$ROLLBACK_RESULT;
            final SubLObject auto_commit_result = (SubLObject)sdbc.$sym383$AUTO_COMMIT_RESULT;
            final SubLObject errors = (SubLObject)sdbc.$sym384$ERRORS;
            return (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym364$PROGN, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym362$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(connection, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym251$SQLS_GET_CONNECTION, statement)), (SubLObject)ConsesLow.list(auto_commit, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym385$SQLC_GET_AUTO_COMMIT, connection)), commit_error, rollback_result, auto_commit_result, errors), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym373$PIF, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym143$SDBC_ERROR_P, auto_commit), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym386$CPUSH, auto_commit, errors), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym364$PROGN, (SubLObject)ConsesLow.listS((SubLObject)sdbc.$sym138$SQLC_SET_ERROR_HANDLING, connection, (SubLObject)sdbc.$list387), (SubLObject)ConsesLow.listS((SubLObject)sdbc.$sym388$CATCH_ERROR_MESSAGE, (SubLObject)ConsesLow.list(commit_error), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym368$PWHEN, auto_commit, (SubLObject)ConsesLow.listS((SubLObject)sdbc.$sym389$SQLC_SET_AUTO_COMMIT, connection, (SubLObject)sdbc.$list390)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sdbc.$sym391$SQLC_COMMIT, connection)))), (SubLObject)ConsesLow.listS((SubLObject)sdbc.$sym138$SQLC_SET_ERROR_HANDLING, connection, (SubLObject)sdbc.$list392), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym368$PWHEN, commit_error, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym386$CPUSH, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym393$SQLS_HANDLE_COMMIT_ERROR, commit_error), errors), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym365$CSETQ, rollback_result, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym394$SQLS_HANDLE_ROLLBACK, connection)), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym368$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym143$SDBC_ERROR_P, rollback_result), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym386$CPUSH, rollback_result, errors))), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym368$PWHEN, auto_commit, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym365$CSETQ, auto_commit_result, (SubLObject)ConsesLow.listS((SubLObject)sdbc.$sym389$SQLC_SET_AUTO_COMMIT, connection, (SubLObject)sdbc.$list395))), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym368$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym143$SDBC_ERROR_P, auto_commit_result), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym386$CPUSH, auto_commit_result, errors)))), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym368$PWHEN, errors, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym365$CSETQ, error, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym396$SQLS_HANDLE_TRANSACTION_ERRORS, errors)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sdbc.$list378);
        return (SubLObject)sdbc.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 92235L)
    public static SubLObject sqls_handle_commit_error(final SubLObject error) {
        if (sdbc.NIL != sdbc_error_p(error)) {
            return new_sdbc_error(sdbc.$commit_error$.getGlobalValue(), sdbc_error_message(error), (SubLObject)sdbc.UNPROVIDED);
        }
        if (error.isString()) {
            return new_sdbc_error(sdbc.$transaction_error$.getGlobalValue(), error, (SubLObject)sdbc.UNPROVIDED);
        }
        return new_sdbc_error(sdbc.$unknown_error$.getGlobalValue(), (SubLObject)sdbc.$str397$An_unknown_error_occurred_during_, (SubLObject)sdbc.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 92593L)
    public static SubLObject sqls_handle_rollback(final SubLObject connection) {
        SubLObject rollback_result = (SubLObject)sdbc.NIL;
        rollback_result = sqlc_rollback(connection);
        if (sdbc.NIL != sdbc_error_p(rollback_result)) {
            rollback_result = new_sdbc_error(sdbc.$rollback_error$.getGlobalValue(), sdbc_error_message(rollback_result), (SubLObject)sdbc.UNPROVIDED);
        }
        return rollback_result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 92938L)
    public static SubLObject sqls_handle_transaction_errors(final SubLObject errors) {
        final SubLObject error_message = string_utilities.bunge(Mapping.mapcar((SubLObject)sdbc.$sym153$SDBC_ERROR_MESSAGE, errors), (SubLObject)Characters.CHAR_newline);
        return new_sdbc_error(sdbc.$transaction_error$.getGlobalValue(), error_message, (SubLObject)sdbc.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 93179L)
    public static SubLObject with_sql_transaction(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list398);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject statement = (SubLObject)sdbc.NIL;
        SubLObject error = (SubLObject)sdbc.NIL;
        SubLObject db = (SubLObject)sdbc.NIL;
        SubLObject user = (SubLObject)sdbc.NIL;
        SubLObject password = (SubLObject)sdbc.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list398);
        statement = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list398);
        error = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list398);
        db = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list398);
        user = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list398);
        password = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sdbc.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sdbc.NIL;
        SubLObject current_$13 = (SubLObject)sdbc.NIL;
        while (sdbc.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sdbc.$list398);
            current_$13 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sdbc.$list398);
            if (sdbc.NIL == conses_high.member(current_$13, (SubLObject)sdbc.$list359, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED)) {
                bad = (SubLObject)sdbc.T;
            }
            if (current_$13 == sdbc.$kw96$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sdbc.NIL != bad && sdbc.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sdbc.$list398);
        }
        final SubLObject dbms_server_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw72$DBMS_SERVER, current);
        final SubLObject dbms_server = (SubLObject)((sdbc.NIL != dbms_server_tail) ? conses_high.cadr(dbms_server_tail) : sdbc.$sym1$_DBMS_SERVER_);
        final SubLObject port_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw73$PORT, current);
        final SubLObject port = (SubLObject)((sdbc.NIL != port_tail) ? conses_high.cadr(port_tail) : sdbc.$sym7$_SQL_PORT_);
        final SubLObject subprotocol_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw77$SUBPROTOCOL, current);
        final SubLObject subprotocol = (SubLObject)((sdbc.NIL != subprotocol_tail) ? conses_high.cadr(subprotocol_tail) : sdbc.$sym360$_SQL_SUBPROTOCOL_);
        final SubLObject proxy_server_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw78$PROXY_SERVER, current);
        final SubLObject proxy_server = (sdbc.NIL != proxy_server_tail) ? conses_high.cadr(proxy_server_tail) : dbms_server;
        final SubLObject timeout_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw98$TIMEOUT, current);
        final SubLObject timeout = (SubLObject)((sdbc.NIL != timeout_tail) ? conses_high.cadr(timeout_tail) : sdbc.$sym361$_SQL_CONNECTION_TIMEOUT_);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym399$WITH_SQL_STATEMENT, (SubLObject)ConsesLow.list(new SubLObject[] { statement, db, user, password, sdbc.$kw72$DBMS_SERVER, dbms_server, sdbc.$kw73$PORT, port, sdbc.$kw77$SUBPROTOCOL, subprotocol, sdbc.$kw78$PROXY_SERVER, proxy_server, sdbc.$kw98$TIMEOUT, timeout }), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym368$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym244$SQL_OPEN_STATEMENT_P, statement), (SubLObject)ConsesLow.listS((SubLObject)sdbc.$sym139$SQLS_EXECUTE_TRANSACTION, (SubLObject)ConsesLow.list(statement, error), ConsesLow.append(body, (SubLObject)sdbc.NIL))));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 94441L)
    public static SubLObject with_sql_result_set(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list400);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rs = (SubLObject)sdbc.NIL;
        SubLObject query = (SubLObject)sdbc.NIL;
        SubLObject db = (SubLObject)sdbc.NIL;
        SubLObject user = (SubLObject)sdbc.NIL;
        SubLObject password = (SubLObject)sdbc.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list400);
        rs = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list400);
        query = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list400);
        db = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list400);
        user = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list400);
        password = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sdbc.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sdbc.NIL;
        SubLObject current_$14 = (SubLObject)sdbc.NIL;
        while (sdbc.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sdbc.$list400);
            current_$14 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sdbc.$list400);
            if (sdbc.NIL == conses_high.member(current_$14, (SubLObject)sdbc.$list359, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED)) {
                bad = (SubLObject)sdbc.T;
            }
            if (current_$14 == sdbc.$kw96$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sdbc.NIL != bad && sdbc.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sdbc.$list400);
        }
        final SubLObject dbms_server_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw72$DBMS_SERVER, current);
        final SubLObject dbms_server = (SubLObject)((sdbc.NIL != dbms_server_tail) ? conses_high.cadr(dbms_server_tail) : sdbc.$sym1$_DBMS_SERVER_);
        final SubLObject port_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw73$PORT, current);
        final SubLObject port = (SubLObject)((sdbc.NIL != port_tail) ? conses_high.cadr(port_tail) : sdbc.$sym7$_SQL_PORT_);
        final SubLObject subprotocol_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw77$SUBPROTOCOL, current);
        final SubLObject subprotocol = (SubLObject)((sdbc.NIL != subprotocol_tail) ? conses_high.cadr(subprotocol_tail) : sdbc.$sym360$_SQL_SUBPROTOCOL_);
        final SubLObject proxy_server_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw78$PROXY_SERVER, current);
        final SubLObject proxy_server = (sdbc.NIL != proxy_server_tail) ? conses_high.cadr(proxy_server_tail) : dbms_server;
        final SubLObject timeout_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw98$TIMEOUT, current);
        final SubLObject timeout = (SubLObject)((sdbc.NIL != timeout_tail) ? conses_high.cadr(timeout_tail) : sdbc.$sym361$_SQL_CONNECTION_TIMEOUT_);
        final SubLObject body;
        current = (body = temp);
        final SubLObject statement = (SubLObject)sdbc.$sym401$STATEMENT;
        return (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym362$CLET, (SubLObject)ConsesLow.list(rs), (SubLObject)ConsesLow.listS((SubLObject)sdbc.$sym399$WITH_SQL_STATEMENT, (SubLObject)ConsesLow.list(new SubLObject[] { statement, db, user, password, sdbc.$kw72$DBMS_SERVER, dbms_server, sdbc.$kw73$PORT, port, sdbc.$kw77$SUBPROTOCOL, subprotocol, sdbc.$kw78$PROXY_SERVER, proxy_server, sdbc.$kw98$TIMEOUT, timeout }), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym373$PIF, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym244$SQL_OPEN_STATEMENT_P, statement), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym365$CSETQ, (SubLObject)sdbc.$sym402$RS, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym403$SQLS_EXECUTE_QUERY, statement, query)), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym365$CSETQ, rs, statement)), ConsesLow.append(body, (SubLObject)sdbc.NIL)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 95279L)
    public static SubLObject do_sql_result_set(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list400);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rs = (SubLObject)sdbc.NIL;
        SubLObject query = (SubLObject)sdbc.NIL;
        SubLObject db = (SubLObject)sdbc.NIL;
        SubLObject user = (SubLObject)sdbc.NIL;
        SubLObject password = (SubLObject)sdbc.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list400);
        rs = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list400);
        query = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list400);
        db = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list400);
        user = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sdbc.$list400);
        password = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sdbc.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sdbc.NIL;
        SubLObject current_$15 = (SubLObject)sdbc.NIL;
        while (sdbc.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sdbc.$list400);
            current_$15 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sdbc.$list400);
            if (sdbc.NIL == conses_high.member(current_$15, (SubLObject)sdbc.$list359, (SubLObject)sdbc.UNPROVIDED, (SubLObject)sdbc.UNPROVIDED)) {
                bad = (SubLObject)sdbc.T;
            }
            if (current_$15 == sdbc.$kw96$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sdbc.NIL != bad && sdbc.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sdbc.$list400);
        }
        final SubLObject dbms_server_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw72$DBMS_SERVER, current);
        final SubLObject dbms_server = (SubLObject)((sdbc.NIL != dbms_server_tail) ? conses_high.cadr(dbms_server_tail) : sdbc.$sym1$_DBMS_SERVER_);
        final SubLObject port_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw73$PORT, current);
        final SubLObject port = (SubLObject)((sdbc.NIL != port_tail) ? conses_high.cadr(port_tail) : sdbc.$sym7$_SQL_PORT_);
        final SubLObject subprotocol_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw77$SUBPROTOCOL, current);
        final SubLObject subprotocol = (SubLObject)((sdbc.NIL != subprotocol_tail) ? conses_high.cadr(subprotocol_tail) : sdbc.$sym360$_SQL_SUBPROTOCOL_);
        final SubLObject proxy_server_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw78$PROXY_SERVER, current);
        final SubLObject proxy_server = (sdbc.NIL != proxy_server_tail) ? conses_high.cadr(proxy_server_tail) : dbms_server;
        final SubLObject timeout_tail = cdestructuring_bind.property_list_member((SubLObject)sdbc.$kw98$TIMEOUT, current);
        final SubLObject timeout = (SubLObject)((sdbc.NIL != timeout_tail) ? conses_high.cadr(timeout_tail) : sdbc.$sym361$_SQL_CONNECTION_TIMEOUT_);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym404$WITH_SQL_RESULT_SET, (SubLObject)ConsesLow.list(new SubLObject[] { rs, query, db, user, password, sdbc.$kw72$DBMS_SERVER, dbms_server, sdbc.$kw73$PORT, port, sdbc.$kw77$SUBPROTOCOL, subprotocol, sdbc.$kw78$PROXY_SERVER, proxy_server, sdbc.$kw98$TIMEOUT, timeout }), (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym368$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym175$SQL_RESULT_SET_P, rs), (SubLObject)ConsesLow.listS((SubLObject)sdbc.$sym405$WHILE, (SubLObject)ConsesLow.list((SubLObject)sdbc.$sym406$SQLRS_NEXT, rs), ConsesLow.append(body, (SubLObject)sdbc.NIL))));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 96099L)
    public static SubLObject sql_export(final SubLObject table, final SubLObject db, final SubLObject user, final SubLObject password, SubLObject stream, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server) {
        if (stream == sdbc.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (dbms_server == sdbc.UNPROVIDED) {
            dbms_server = sdbc.$dbms_server$.getGlobalValue();
        }
        if (port == sdbc.UNPROVIDED) {
            port = sdbc.$sql_port$.getGlobalValue();
        }
        if (subprotocol == sdbc.UNPROVIDED) {
            subprotocol = sdbc.$sql_subprotocol$.getGlobalValue();
        }
        if (proxy_server == sdbc.UNPROVIDED) {
            proxy_server = dbms_server;
        }
        assert sdbc.NIL != Types.stringp(table) : table;
        assert sdbc.NIL != Types.stringp(db) : db;
        assert sdbc.NIL != Types.stringp(user) : user;
        assert sdbc.NIL != Types.stringp(password) : password;
        assert sdbc.NIL != streams_high.output_stream_p(stream) : stream;
        assert sdbc.NIL != Types.stringp(dbms_server) : dbms_server;
        assert sdbc.NIL != subl_promotions.positive_integer_p(port) : port;
        assert sdbc.NIL != Types.stringp(subprotocol) : subprotocol;
        assert sdbc.NIL != Types.stringp(proxy_server) : proxy_server;
        final SubLObject rs = (SubLObject)sdbc.NIL;
        SubLObject col = (SubLObject)sdbc.NIL;
        SubLObject rs_$16 = (SubLObject)sdbc.NIL;
        SubLObject statement = (SubLObject)sdbc.NIL;
        SubLObject connection = (SubLObject)sdbc.NIL;
        try {
            connection = new_sql_connection(db, user, password, (SubLObject)ConsesLow.list(new SubLObject[] { sdbc.$kw72$DBMS_SERVER, dbms_server, sdbc.$kw73$PORT, port, sdbc.$kw77$SUBPROTOCOL, subprotocol, sdbc.$kw78$PROXY_SERVER, proxy_server, sdbc.$kw98$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (sdbc.NIL != sql_open_connection_p(connection)) {
                statement = sqlc_create_statement(connection);
            }
            else {
                statement = connection;
            }
            if (sdbc.NIL != sql_open_statement_p(statement)) {
                rs_$16 = sqls_execute_query(statement, Sequences.cconcatenate((SubLObject)sdbc.$str408$SELECT___FROM_, table), (SubLObject)sdbc.UNPROVIDED);
            }
            else {
                rs_$16 = statement;
            }
            if (sdbc.NIL != sql_result_set_p(rs_$16)) {
                while (sdbc.NIL != sqlrs_next(rs_$16)) {
                    col = (SubLObject)sdbc.ZERO_INTEGER;
                    while (!col.numE(number_utilities.f_1_(sqlrs_column_count(rs_$16)))) {
                        col = Numbers.add(col, (SubLObject)sdbc.ONE_INTEGER);
                        print_high.princ(sqlrs_get_object(rs_$16, col), stream);
                        print_high.princ((SubLObject)Characters.CHAR_tab, stream);
                    }
                    col = Numbers.add(col, (SubLObject)sdbc.ONE_INTEGER);
                    print_high.princ(sqlrs_get_object(rs_$16, col), stream);
                    streams_high.terpri(stream);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sdbc.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (sdbc.NIL != sql_connection_p(connection)) {
                    sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return rs;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 97894L)
    public static SubLObject sdbc_test(final SubLObject db, final SubLObject user, final SubLObject password, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server, SubLObject table) {
        if (dbms_server == sdbc.UNPROVIDED) {
            dbms_server = sdbc.$dbms_server$.getGlobalValue();
        }
        if (port == sdbc.UNPROVIDED) {
            port = sdbc.$sql_port$.getGlobalValue();
        }
        if (subprotocol == sdbc.UNPROVIDED) {
            subprotocol = sdbc.$sql_subprotocol$.getGlobalValue();
        }
        if (proxy_server == sdbc.UNPROVIDED) {
            proxy_server = dbms_server;
        }
        if (table == sdbc.UNPROVIDED) {
            table = string_utilities.split_string(Environment.machine_instance(), (SubLObject)sdbc.$list409).first();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sdbc.NIL != sdbc_test_created(db, user, password, dbms_server, port, subprotocol, proxy_server, table) && sdbc.NIL != sdbc_test_prepared(db, user, password, dbms_server, port, subprotocol, proxy_server, table) && sdbc.NIL != sdbc_test_batch(db, user, password, dbms_server, port, subprotocol, proxy_server, table));
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 98469L)
    public static SubLObject sdbc_test_prepared(final SubLObject db, final SubLObject user, final SubLObject password, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server, SubLObject table) {
        if (dbms_server == sdbc.UNPROVIDED) {
            dbms_server = sdbc.$dbms_server$.getGlobalValue();
        }
        if (port == sdbc.UNPROVIDED) {
            port = sdbc.$sql_port$.getGlobalValue();
        }
        if (subprotocol == sdbc.UNPROVIDED) {
            subprotocol = sdbc.$sql_subprotocol$.getGlobalValue();
        }
        if (proxy_server == sdbc.UNPROVIDED) {
            proxy_server = dbms_server;
        }
        if (table == sdbc.UNPROVIDED) {
            table = string_utilities.split_string(Environment.machine_instance(), (SubLObject)sdbc.$list409).first();
        }
        SubLObject c = (SubLObject)sdbc.NIL;
        SubLObject s = (SubLObject)sdbc.NIL;
        SubLObject insert = (SubLObject)sdbc.NIL;
        SubLObject select = (SubLObject)sdbc.NIL;
        SubLObject passP = (SubLObject)sdbc.NIL;
        SubLObject rs = (SubLObject)sdbc.NIL;
        SubLObject result = (SubLObject)sdbc.NIL;
        try {
            c = new_sql_connection(db, user, password, (SubLObject)ConsesLow.list(new SubLObject[] { sdbc.$kw72$DBMS_SERVER, dbms_server, sdbc.$kw73$PORT, port, sdbc.$kw77$SUBPROTOCOL, subprotocol, sdbc.$kw78$PROXY_SERVER, proxy_server, sdbc.$kw98$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            s = sqlc_create_statement(c);
            insert = sqlc_prepare_statement(c, PrintLow.format((SubLObject)sdbc.NIL, (SubLObject)sdbc.$str410$INSERT_INTO__a_VALUES______, table));
            select = sqlc_prepare_statement(c, PrintLow.format((SubLObject)sdbc.NIL, (SubLObject)sdbc.$str411$SELECT_number2_FROM__a_WHERE_numb, table));
            passP = (SubLObject)sdbc.T;
            sqls_execute_update(s, Sequences.cconcatenate((SubLObject)sdbc.$str412$CREATE_TABLE_, new SubLObject[] { table, sdbc.$str413$__number1_INT_PRIMARY_KEY__number }));
            SubLObject i;
            for (i = (SubLObject)sdbc.NIL, i = (SubLObject)sdbc.ZERO_INTEGER; i.numL(sdbc.$sdbc_test_row_cardinality$.getGlobalValue()); i = Numbers.add(i, (SubLObject)sdbc.ONE_INTEGER)) {
                sqlps_set_int(insert, (SubLObject)sdbc.ONE_INTEGER, i);
                sqlps_set_int(insert, (SubLObject)sdbc.TWO_INTEGER, i);
                sqlps_execute_update(insert);
            }
            for (i = (SubLObject)sdbc.NIL, i = (SubLObject)sdbc.ZERO_INTEGER; i.numL(sdbc.$sdbc_test_row_cardinality$.getGlobalValue()); i = Numbers.add(i, (SubLObject)sdbc.ONE_INTEGER)) {
                sqlps_set_int(select, (SubLObject)sdbc.ONE_INTEGER, i);
                rs = sqlps_execute_query(select, (SubLObject)sdbc.UNPROVIDED);
                sqlrs_next(rs);
                result = sqlrs_get_object(rs, (SubLObject)sdbc.ONE_INTEGER);
                passP = (SubLObject)SubLObjectFactory.makeBoolean(sdbc.NIL != passP && result.eql(i));
                if (!result.eql(i)) {
                    Errors.warn((SubLObject)sdbc.$str414$validation_failed_for__a__result_, i, result);
                }
            }
            sqls_execute_update(s, Sequences.cconcatenate((SubLObject)sdbc.$str415$DROP_TABLE_, table));
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sdbc.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (sdbc.NIL != sql_connection_p(c)) {
                    sqlc_close(c);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return passP;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 100493L)
    public static SubLObject sdbc_test_created(final SubLObject db, final SubLObject user, final SubLObject password, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server, SubLObject table) {
        if (dbms_server == sdbc.UNPROVIDED) {
            dbms_server = sdbc.$dbms_server$.getGlobalValue();
        }
        if (port == sdbc.UNPROVIDED) {
            port = sdbc.$sql_port$.getGlobalValue();
        }
        if (subprotocol == sdbc.UNPROVIDED) {
            subprotocol = sdbc.$sql_subprotocol$.getGlobalValue();
        }
        if (proxy_server == sdbc.UNPROVIDED) {
            proxy_server = dbms_server;
        }
        if (table == sdbc.UNPROVIDED) {
            table = string_utilities.split_string(Environment.machine_instance(), (SubLObject)sdbc.$list409).first();
        }
        SubLObject passP = (SubLObject)sdbc.T;
        SubLObject num_string = (SubLObject)sdbc.NIL;
        SubLObject rs = (SubLObject)sdbc.NIL;
        SubLObject result = (SubLObject)sdbc.NIL;
        SubLObject s = (SubLObject)sdbc.NIL;
        SubLObject connection = (SubLObject)sdbc.NIL;
        try {
            connection = new_sql_connection(db, user, password, (SubLObject)ConsesLow.list(new SubLObject[] { sdbc.$kw72$DBMS_SERVER, dbms_server, sdbc.$kw73$PORT, port, sdbc.$kw77$SUBPROTOCOL, subprotocol, sdbc.$kw78$PROXY_SERVER, proxy_server, sdbc.$kw98$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (sdbc.NIL != sql_open_connection_p(connection)) {
                s = sqlc_create_statement(connection);
            }
            else {
                s = connection;
            }
            sqls_execute_update(s, Sequences.cconcatenate((SubLObject)sdbc.$str412$CREATE_TABLE_, new SubLObject[] { table, sdbc.$str413$__number1_INT_PRIMARY_KEY__number }));
            SubLObject i;
            for (i = (SubLObject)sdbc.NIL, i = (SubLObject)sdbc.ZERO_INTEGER; i.numL(sdbc.$sdbc_test_row_cardinality$.getGlobalValue()); i = Numbers.add(i, (SubLObject)sdbc.ONE_INTEGER)) {
                num_string = print_high.prin1_to_string(i);
                sqls_execute_update(s, Sequences.cconcatenate((SubLObject)sdbc.$str416$INSERT_INTO_, new SubLObject[] { table, sdbc.$str417$_VALUES_, num_string, sdbc.$str418$__, num_string, sdbc.$str419$_ }));
            }
            for (i = (SubLObject)sdbc.NIL, i = (SubLObject)sdbc.ZERO_INTEGER; i.numL(sdbc.$sdbc_test_row_cardinality$.getGlobalValue()); i = Numbers.add(i, (SubLObject)sdbc.ONE_INTEGER)) {
                rs = sqls_execute_query(s, Sequences.cconcatenate((SubLObject)sdbc.$str420$SELECT_number2_FROM_, new SubLObject[] { table, sdbc.$str421$_WHERE_number1___, print_high.prin1_to_string(i) }), (SubLObject)sdbc.UNPROVIDED);
                sqlrs_next(rs);
                result = sqlrs_get_object(rs, (SubLObject)sdbc.ONE_INTEGER);
                passP = (SubLObject)SubLObjectFactory.makeBoolean(sdbc.NIL != passP && result.eql(i));
                if (!result.eql(i)) {
                    Errors.warn((SubLObject)sdbc.$str414$validation_failed_for__a__result_, i, result);
                }
            }
            sqls_execute_update(s, Sequences.cconcatenate((SubLObject)sdbc.$str415$DROP_TABLE_, table));
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sdbc.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (sdbc.NIL != sql_connection_p(connection)) {
                    sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return passP;
    }

    @SubLTranslatedFile.SubL(source = "cycl/sdbc.lisp", position = 102217L)
    public static SubLObject sdbc_test_batch(final SubLObject db, final SubLObject user, final SubLObject password, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server, SubLObject table) {
        if (dbms_server == sdbc.UNPROVIDED) {
            dbms_server = sdbc.$dbms_server$.getGlobalValue();
        }
        if (port == sdbc.UNPROVIDED) {
            port = sdbc.$sql_port$.getGlobalValue();
        }
        if (subprotocol == sdbc.UNPROVIDED) {
            subprotocol = sdbc.$sql_subprotocol$.getGlobalValue();
        }
        if (proxy_server == sdbc.UNPROVIDED) {
            proxy_server = dbms_server;
        }
        if (table == sdbc.UNPROVIDED) {
            table = string_utilities.split_string(Environment.machine_instance(), (SubLObject)sdbc.$list409).first();
        }
        SubLObject passP = (SubLObject)sdbc.T;
        SubLObject num_string = (SubLObject)sdbc.NIL;
        SubLObject rs = (SubLObject)sdbc.NIL;
        SubLObject result = (SubLObject)sdbc.NIL;
        SubLObject s = (SubLObject)sdbc.NIL;
        SubLObject connection = (SubLObject)sdbc.NIL;
        try {
            connection = new_sql_connection(db, user, password, (SubLObject)ConsesLow.list(new SubLObject[] { sdbc.$kw72$DBMS_SERVER, dbms_server, sdbc.$kw73$PORT, port, sdbc.$kw77$SUBPROTOCOL, subprotocol, sdbc.$kw78$PROXY_SERVER, proxy_server, sdbc.$kw98$TIMEOUT, sdbc.$sql_connection_timeout$.getGlobalValue() }));
            if (sdbc.NIL != sql_open_connection_p(connection)) {
                s = sqlc_create_statement(connection);
            }
            else {
                s = connection;
            }
            sqls_execute_update(s, Sequences.cconcatenate((SubLObject)sdbc.$str412$CREATE_TABLE_, new SubLObject[] { table, sdbc.$str413$__number1_INT_PRIMARY_KEY__number }));
            SubLObject i;
            for (i = (SubLObject)sdbc.NIL, i = (SubLObject)sdbc.ZERO_INTEGER; i.numL(sdbc.$sdbc_test_row_cardinality$.getGlobalValue()); i = Numbers.add(i, (SubLObject)sdbc.ONE_INTEGER)) {
                num_string = print_high.prin1_to_string(i);
                sqls_add_batch(s, Sequences.cconcatenate((SubLObject)sdbc.$str416$INSERT_INTO_, new SubLObject[] { table, sdbc.$str417$_VALUES_, num_string, sdbc.$str418$__, num_string, sdbc.$str419$_ }));
            }
            sqls_execute_batch(s);
            for (i = (SubLObject)sdbc.NIL, i = (SubLObject)sdbc.ZERO_INTEGER; i.numL(sdbc.$sdbc_test_row_cardinality$.getGlobalValue()); i = Numbers.add(i, (SubLObject)sdbc.ONE_INTEGER)) {
                rs = sqls_execute_query(s, Sequences.cconcatenate((SubLObject)sdbc.$str420$SELECT_number2_FROM_, new SubLObject[] { table, sdbc.$str421$_WHERE_number1___, print_high.prin1_to_string(i) }), (SubLObject)sdbc.UNPROVIDED);
                sqlrs_next(rs);
                result = sqlrs_get_object(rs, (SubLObject)sdbc.ONE_INTEGER);
                passP = (SubLObject)SubLObjectFactory.makeBoolean(sdbc.NIL != passP && result.eql(i));
                if (!result.eql(i)) {
                    Errors.warn((SubLObject)sdbc.$str414$validation_failed_for__a__result_, i, result);
                }
            }
            sqls_execute_update(s, Sequences.cconcatenate((SubLObject)sdbc.$str415$DROP_TABLE_, table));
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sdbc.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (sdbc.NIL != sql_connection_p(connection)) {
                    sqlc_close(connection);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return passP;
    }

    public static SubLObject declare_sdbc_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_proxy_server_runningP", "SQL-PROXY-SERVER-RUNNING?", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_connection_print_function_trampoline", "SQL-CONNECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_connection_p", "SQL-CONNECTION-P", 1, 0, false);
        new $sql_connection_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_db", "SQLC-DB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_user", "SQLC-USER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_dbms_server", "SQLC-DBMS-SERVER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_port", "SQLC-PORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_channel", "SQLC-CHANNEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_statements", "SQLC-STATEMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_lock", "SQLC-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_subprotocol", "SQLC-SUBPROTOCOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_proxy_server", "SQLC-PROXY-SERVER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_error_handling", "SQLC-ERROR-HANDLING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_tickets", "SQLC-TICKETS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_mailman", "SQLC-MAILMAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqlc_db", "_CSETF-SQLC-DB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqlc_user", "_CSETF-SQLC-USER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqlc_dbms_server", "_CSETF-SQLC-DBMS-SERVER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqlc_port", "_CSETF-SQLC-PORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqlc_channel", "_CSETF-SQLC-CHANNEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqlc_statements", "_CSETF-SQLC-STATEMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqlc_lock", "_CSETF-SQLC-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqlc_subprotocol", "_CSETF-SQLC-SUBPROTOCOL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqlc_proxy_server", "_CSETF-SQLC-PROXY-SERVER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqlc_error_handling", "_CSETF-SQLC-ERROR-HANDLING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqlc_tickets", "_CSETF-SQLC-TICKETS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqlc_mailman", "_CSETF-SQLC-MAILMAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "make_sql_connection", "MAKE-SQL-CONNECTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "visit_defstruct_sql_connection", "VISIT-DEFSTRUCT-SQL-CONNECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "visit_defstruct_object_sql_connection_method", "VISIT-DEFSTRUCT-OBJECT-SQL-CONNECTION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_print", "SQLC-PRINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_print_string", "SQLC-PRINT-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "new_sql_connection", "NEW-SQL-CONNECTION", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_open_connection_p", "SQL-OPEN-CONNECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_open_p", "SQLC-OPEN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_close", "SQLC-CLOSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_create_statement", "SQLC-CREATE-STATEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_prepare_statement", "SQLC-PREPARE-STATEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_set_auto_commit", "SQLC-SET-AUTO-COMMIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_get_auto_commit", "SQLC-GET-AUTO-COMMIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_commit", "SQLC-COMMIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_rollback", "SQLC-ROLLBACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_get_transaction_isolation", "SQLC-GET-TRANSACTION-ISOLATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_set_transaction_isolation", "SQLC-SET-TRANSACTION-ISOLATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_ticket_print_function_trampoline", "SQL-TICKET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_ticket_p", "SQL-TICKET-P", 1, 0, false);
        new $sql_ticket_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_ticket_semaphore", "SQL-TICKET-SEMAPHORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_ticket_result", "SQL-TICKET-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sql_ticket_semaphore", "_CSETF-SQL-TICKET-SEMAPHORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sql_ticket_result", "_CSETF-SQL-TICKET-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "make_sql_ticket", "MAKE-SQL-TICKET", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "visit_defstruct_sql_ticket", "VISIT-DEFSTRUCT-SQL-TICKET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "visit_defstruct_object_sql_ticket_method", "VISIT-DEFSTRUCT-OBJECT-SQL-TICKET-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "new_sql_ticket", "NEW-SQL-TICKET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_ticket_retrieve", "SQL-TICKET-RETRIEVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "launch_sql_mailman", "LAUNCH-SQL-MAILMAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_deliver", "SQLC-DELIVER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_execute", "SQLC-EXECUTE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_send", "SQLC-SEND", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_receive", "SQLC-RECEIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_handle_error", "SQLC-HANDLE-ERROR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_transaction_level_p", "SQL-TRANSACTION-LEVEL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_set_error_handling", "SQLC-SET-ERROR-HANDLING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "new_sql_response", "NEW-SQL-RESPONSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_response_code", "SQL-RESPONSE-CODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_response_value", "SQL-RESPONSE-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_null_p", "SQL-NULL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_true_p", "SQL-TRUE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_false_p", "SQL-FALSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sdbc_error_print_function_trampoline", "SDBC-ERROR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sdbc_error_p", "SDBC-ERROR-P", 1, 0, false);
        new $sdbc_error_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sdbc_error_type", "SDBC-ERROR-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sdbc_error_message", "SDBC-ERROR-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sdbc_error_code", "SDBC-ERROR-CODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sdbc_error_type", "_CSETF-SDBC-ERROR-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sdbc_error_message", "_CSETF-SDBC-ERROR-MESSAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sdbc_error_code", "_CSETF-SDBC-ERROR-CODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "make_sdbc_error", "MAKE-SDBC-ERROR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "visit_defstruct_sdbc_error", "VISIT-DEFSTRUCT-SDBC-ERROR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "visit_defstruct_object_sdbc_error_method", "VISIT-DEFSTRUCT-OBJECT-SDBC-ERROR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sdbc_error_throw", "SDBC-ERROR-THROW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sdbc_error_warn", "SDBC-ERROR-WARN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sdbc_server_error_p", "SDBC-SERVER-ERROR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sdbc_client_error_p", "SDBC-CLIENT-ERROR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sdbc_sql_error_p", "SDBC-SQL-ERROR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sdbc_io_error_p", "SDBC-IO-ERROR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sdbc_transaction_error_p", "SDBC-TRANSACTION-ERROR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sdbc_batch_update_error_p", "SDBC-BATCH-UPDATE-ERROR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sdbc_other_error_p", "SDBC-OTHER-ERROR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "new_sdbc_error", "NEW-SDBC-ERROR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sdbc_error_print", "SDBC-ERROR-PRINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "decode_sdbc_error_code", "DECODE-SDBC-ERROR-CODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_result_set_print_function_trampoline", "SQL-RESULT-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_result_set_p", "SQL-RESULT-SET-P", 1, 0, false);
        new $sql_result_set_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_rows", "SQLRS-ROWS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_current", "SQLRS-CURRENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_last", "SQLRS-LAST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_start", "SQLRS-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_connection", "SQLRS-CONNECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_block_size", "SQLRS-BLOCK-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_id", "SQLRS-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqlrs_rows", "_CSETF-SQLRS-ROWS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqlrs_current", "_CSETF-SQLRS-CURRENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqlrs_last", "_CSETF-SQLRS-LAST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqlrs_start", "_CSETF-SQLRS-START", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqlrs_connection", "_CSETF-SQLRS-CONNECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqlrs_block_size", "_CSETF-SQLRS-BLOCK-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqlrs_id", "_CSETF-SQLRS-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "make_sql_result_set", "MAKE-SQL-RESULT-SET", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "visit_defstruct_sql_result_set", "VISIT-DEFSTRUCT-SQL-RESULT-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "visit_defstruct_object_sql_result_set_method", "VISIT-DEFSTRUCT-OBJECT-SQL-RESULT-SET-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_print", "SQLRS-PRINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_open_result_set_p", "SQL-OPEN-RESULT-SET-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_close", "SQLRS-CLOSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_emptyP", "SQLRS-EMPTY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_absolute", "SQLRS-ABSOLUTE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_next", "SQLRS-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_previous", "SQLRS-PREVIOUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_is_last", "SQLRS-IS-LAST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_is_first", "SQLRS-IS-FIRST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_column_count", "SQLRS-COLUMN-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_row_count", "SQLRS-ROW-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_get_row", "SQLRS-GET-ROW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_get_object", "SQLRS-GET-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_get_object_tuple", "SQLRS-GET-OBJECT-TUPLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "new_sql_result_set", "NEW-SQL-RESULT-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_closed_p", "SQLRS-CLOSED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_open_p", "SQLRS-OPEN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_valid_row_p", "SQLRS-VALID-ROW-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_valid_column_p", "SQLRS-VALID-COLUMN-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_block", "SQLRS-BLOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_row_local_p", "SQLRS-ROW-LOCAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_row_remote_p", "SQLRS-ROW-REMOTE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlrs_local_close", "SQLRS-LOCAL-CLOSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_statement_print_function_trampoline", "SQL-STATEMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_statement_p", "SQL-STATEMENT-P", 1, 0, false);
        new $sql_statement_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqls_connection", "SQLS-CONNECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqls_id", "SQLS-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqls_sql", "SQLS-SQL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqls_settings", "SQLS-SETTINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqls_batch", "SQLS-BATCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqls_rs", "SQLS-RS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqls_connection", "_CSETF-SQLS-CONNECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqls_id", "_CSETF-SQLS-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqls_sql", "_CSETF-SQLS-SQL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqls_settings", "_CSETF-SQLS-SETTINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqls_batch", "_CSETF-SQLS-BATCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "_csetf_sqls_rs", "_CSETF-SQLS-RS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "make_sql_statement", "MAKE-SQL-STATEMENT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "visit_defstruct_sql_statement", "VISIT-DEFSTRUCT-SQL-STATEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "visit_defstruct_object_sql_statement_method", "VISIT-DEFSTRUCT-OBJECT-SQL-STATEMENT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqls_open_p", "SQLS-OPEN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_open_statement_p", "SQL-OPEN-STATEMENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqls_execute_query", "SQLS-EXECUTE-QUERY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqls_execute_update", "SQLS-EXECUTE-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqls_cancel", "SQLS-CANCEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqls_get_generated_keys", "SQLS-GET-GENERATED-KEYS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqls_close", "SQLS-CLOSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqls_add_batch", "SQLS-ADD-BATCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqls_clear_batch", "SQLS-CLEAR-BATCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqls_execute_batch", "SQLS-EXECUTE-BATCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_prepared_statement_p", "SQL-PREPARED-STATEMENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_prepared_open_statement_p", "SQL-PREPARED-OPEN-STATEMENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlps_execute_query", "SQLPS-EXECUTE-QUERY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlps_execute_update", "SQLPS-EXECUTE-UPDATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlps_set_bytes", "SQLPS-SET-BYTES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlps_set_int", "SQLPS-SET-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlps_set_long", "SQLPS-SET-LONG", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlps_set_float", "SQLPS-SET-FLOAT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlps_set_double", "SQLPS-SET-DOUBLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlps_set_string", "SQLPS-SET-STRING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "new_sql_statement", "NEW-SQL-STATEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqls_get_connection", "SQLS-GET-CONNECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqls_local_close", "SQLS-LOCAL-CLOSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlps_set", "SQLPS-SET", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "new_sql_prepared_statement", "NEW-SQL-PREPARED-STATEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "new_statement_id", "NEW-STATEMENT-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "new_result_set_id", "NEW-RESULT-SET-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_get_tables", "SQLC-GET-TABLES", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_get_tables_meta_data", "SQLC-GET-TABLES-META-DATA", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_get_columns", "SQLC-GET-COLUMNS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_get_columns_meta_data", "SQLC-GET-COLUMNS-META-DATA", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_get_primary_keys", "SQLC-GET-PRIMARY-KEYS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_get_primary_keys_meta_data", "SQLC-GET-PRIMARY-KEYS-META-DATA", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_get_imported_keys", "SQLC-GET-IMPORTED-KEYS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_get_imported_keys_meta_data", "SQLC-GET-IMPORTED-KEYS-META-DATA", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_get_exported_keys", "SQLC-GET-EXPORTED-KEYS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_get_exported_keys_meta_data", "SQLC-GET-EXPORTED-KEYS-META-DATA", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_get_index_info", "SQLC-GET-INDEX-INFO", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_get_index_info_meta_data", "SQLC-GET-INDEX-INFO-META-DATA", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqlc_get_max_connections", "SQLC-GET-MAX-CONNECTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sdbc_error_handling_tag_p", "SDBC-ERROR-HANDLING-TAG-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "new_db_url", "NEW-DB-URL", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "add_sdbc_database_connection_url_description", "ADD-SDBC-DATABASE-CONNECTION-URL-DESCRIPTION", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "get_all_sdbc_database_sub_protocols", "GET-ALL-SDBC-DATABASE-SUB-PROTOCOLS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "compile_db_conn_url_punctuation_info", "COMPILE-DB-CONN-URL-PUNCTUATION-INFO", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sdbc", "register_sdbc_database_connection_url_description", "REGISTER-SDBC-DATABASE-CONNECTION-URL-DESCRIPTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "set_sdbc_db2_port", "SET-SDBC-DB2-PORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sdbc_db2_port", "SDBC-DB2-PORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "set_sdbc_sybase_iq_port", "SET-SDBC-SYBASE-IQ-PORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sdbc_sybase_iq_port", "SDBC-SYBASE-IQ-PORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "construct_new_database_connection_url", "CONSTRUCT-NEW-DATABASE-CONNECTION-URL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "construct_new_dbconn_url_required", "CONSTRUCT-NEW-DBCONN-URL-REQUIRED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "resolve_dbconn_url_reference", "RESOLVE-DBCONN-URL-REFERENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "append_dbconn_url_options", "APPEND-DBCONN-URL-OPTIONS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "write_dbconn_url_punctuation", "WRITE-DBCONN-URL-PUNCTUATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "java_integerp", "JAVA-INTEGERP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "java_longp", "JAVA-LONGP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "java_floatp", "JAVA-FLOATP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "java_doublep", "JAVA-DOUBLEP", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sdbc", "with_sql_connection", "WITH-SQL-CONNECTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sdbc", "with_sql_statement", "WITH-SQL-STATEMENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sdbc", "with_prepared_sql_statement", "WITH-PREPARED-SQL-STATEMENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sdbc", "sqls_execute_transaction", "SQLS-EXECUTE-TRANSACTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqls_handle_commit_error", "SQLS-HANDLE-COMMIT-ERROR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqls_handle_rollback", "SQLS-HANDLE-ROLLBACK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sqls_handle_transaction_errors", "SQLS-HANDLE-TRANSACTION-ERRORS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sdbc", "with_sql_transaction", "WITH-SQL-TRANSACTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sdbc", "with_sql_result_set", "WITH-SQL-RESULT-SET");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sdbc", "do_sql_result_set", "DO-SQL-RESULT-SET");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sql_export", "SQL-EXPORT", 4, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sdbc_test", "SDBC-TEST", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sdbc_test_prepared", "SDBC-TEST-PREPARED", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sdbc_test_created", "SDBC-TEST-CREATED", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sdbc", "sdbc_test_batch", "SDBC-TEST-BATCH", 3, 5, false);
        return (SubLObject)sdbc.NIL;
    }

    public static SubLObject init_sdbc_file() {
        sdbc.$dbms_server$ = SubLFiles.deflexical("*DBMS-SERVER*", red_infrastructure_macros.red_def_helper((SubLObject)(sdbc.$list0.isSymbol() ? Symbols.symbol_value((SubLObject)sdbc.$list0) : sdbc.$list0), (SubLObject)sdbc.$sym1$_DBMS_SERVER_, (SubLObject)(sdbc.$str2$db_server_cyc_com.isSymbol() ? Symbols.symbol_value((SubLObject)sdbc.$str2$db_server_cyc_com) : sdbc.$str2$db_server_cyc_com), (SubLObject)sdbc.$kw3$LEXICAL, (SubLObject)sdbc.UNPROVIDED));
        sdbc.$sdbc_proxy_server$ = SubLFiles.deflexical("*SDBC-PROXY-SERVER*", red_infrastructure_macros.red_def_helper((SubLObject)(sdbc.$list4.isSymbol() ? Symbols.symbol_value((SubLObject)sdbc.$list4) : sdbc.$list4), (SubLObject)sdbc.$sym5$_SDBC_PROXY_SERVER_, (SubLObject)(sdbc.$str2$db_server_cyc_com.isSymbol() ? Symbols.symbol_value((SubLObject)sdbc.$str2$db_server_cyc_com) : sdbc.$str2$db_server_cyc_com), (SubLObject)sdbc.$kw3$LEXICAL, (SubLObject)sdbc.UNPROVIDED));
        sdbc.$sql_port$ = SubLFiles.deflexical("*SQL-PORT*", red_infrastructure_macros.red_def_helper((SubLObject)(sdbc.$list6.isSymbol() ? Symbols.symbol_value((SubLObject)sdbc.$list6) : sdbc.$list6), (SubLObject)sdbc.$sym7$_SQL_PORT_, (SubLObject)(sdbc.$int8$9999.isSymbol() ? Symbols.symbol_value((SubLObject)sdbc.$int8$9999) : sdbc.$int8$9999), (SubLObject)sdbc.$kw3$LEXICAL, (SubLObject)sdbc.UNPROVIDED));
        sdbc.$sql_protocol$ = SubLFiles.deflexical("*SQL-PROTOCOL*", (SubLObject)sdbc.$str9$jdbc);
        sdbc.$sql_subprotocol$ = SubLFiles.deflexical("*SQL-SUBPROTOCOL*", (SubLObject)sdbc.$str10$postgresql);
        sdbc.$sql_connection_timeout$ = SubLFiles.deflexical("*SQL-CONNECTION-TIMEOUT*", (SubLObject)sdbc.FIVE_INTEGER);
        sdbc.$connection_id$ = SubLFiles.deflexical("*CONNECTION-ID*", (SubLObject)sdbc.$str11$CONNECTION);
        sdbc.$result_set_block_size$ = SubLFiles.defparameter("*RESULT-SET-BLOCK-SIZE*", (SubLObject)sdbc.$int12$1000);
        sdbc.$quit$ = SubLFiles.deflexical("*QUIT*", (SubLObject)sdbc.ZERO_INTEGER);
        sdbc.$execute_update$ = SubLFiles.deflexical("*EXECUTE-UPDATE*", (SubLObject)sdbc.ONE_INTEGER);
        sdbc.$execute_query$ = SubLFiles.deflexical("*EXECUTE-QUERY*", (SubLObject)sdbc.TWO_INTEGER);
        sdbc.$prepare_statement$ = SubLFiles.deflexical("*PREPARE-STATEMENT*", (SubLObject)sdbc.THREE_INTEGER);
        sdbc.$create_statement$ = SubLFiles.deflexical("*CREATE-STATEMENT*", (SubLObject)sdbc.FOUR_INTEGER);
        sdbc.$set_bytes$ = SubLFiles.deflexical("*SET-BYTES*", (SubLObject)sdbc.FIVE_INTEGER);
        sdbc.$ps_execute_update$ = SubLFiles.deflexical("*PS-EXECUTE-UPDATE*", (SubLObject)sdbc.SIX_INTEGER);
        sdbc.$ps_execute_query$ = SubLFiles.deflexical("*PS-EXECUTE-QUERY*", (SubLObject)sdbc.SEVEN_INTEGER);
        sdbc.$set_int$ = SubLFiles.deflexical("*SET-INT*", (SubLObject)sdbc.EIGHT_INTEGER);
        sdbc.$close_statement$ = SubLFiles.deflexical("*CLOSE-STATEMENT*", (SubLObject)sdbc.NINE_INTEGER);
        sdbc.$new_connection$ = SubLFiles.deflexical("*NEW-CONNECTION*", (SubLObject)sdbc.TEN_INTEGER);
        sdbc.$set_string$ = SubLFiles.deflexical("*SET-STRING*", (SubLObject)sdbc.ELEVEN_INTEGER);
        sdbc.$set_long$ = SubLFiles.deflexical("*SET-LONG*", (SubLObject)sdbc.TWELVE_INTEGER);
        sdbc.$set_double$ = SubLFiles.deflexical("*SET-DOUBLE*", (SubLObject)sdbc.THIRTEEN_INTEGER);
        sdbc.$set_float$ = SubLFiles.deflexical("*SET-FLOAT*", (SubLObject)sdbc.FOURTEEN_INTEGER);
        sdbc.$execute_batch$ = SubLFiles.deflexical("*EXECUTE-BATCH*", (SubLObject)sdbc.FIFTEEN_INTEGER);
        sdbc.$get_rows$ = SubLFiles.deflexical("*GET-ROWS*", (SubLObject)sdbc.SIXTEEN_INTEGER);
        sdbc.$close_result_set$ = SubLFiles.deflexical("*CLOSE-RESULT-SET*", (SubLObject)sdbc.SEVENTEEN_INTEGER);
        sdbc.$execute_update_auto_keys$ = SubLFiles.deflexical("*EXECUTE-UPDATE-AUTO-KEYS*", (SubLObject)sdbc.EIGHTEEN_INTEGER);
        sdbc.$get_generated_keys$ = SubLFiles.deflexical("*GET-GENERATED-KEYS*", (SubLObject)sdbc.NINETEEN_INTEGER);
        sdbc.$set_auto_commit$ = SubLFiles.deflexical("*SET-AUTO-COMMIT*", (SubLObject)sdbc.TWENTY_INTEGER);
        sdbc.$commit$ = SubLFiles.deflexical("*COMMIT*", (SubLObject)sdbc.$int13$21);
        sdbc.$rollback$ = SubLFiles.deflexical("*ROLLBACK*", (SubLObject)sdbc.$int14$22);
        sdbc.$get_transaction_isolation$ = SubLFiles.deflexical("*GET-TRANSACTION-ISOLATION*", (SubLObject)sdbc.$int15$23);
        sdbc.$set_transaction_isolation$ = SubLFiles.deflexical("*SET-TRANSACTION-ISOLATION*", (SubLObject)sdbc.$int16$24);
        sdbc.$get_auto_commit$ = SubLFiles.deflexical("*GET-AUTO-COMMIT*", (SubLObject)sdbc.$int17$25);
        sdbc.$get_tables$ = SubLFiles.deflexical("*GET-TABLES*", (SubLObject)sdbc.$int18$26);
        sdbc.$get_columns$ = SubLFiles.deflexical("*GET-COLUMNS*", (SubLObject)sdbc.$int19$27);
        sdbc.$get_primary_keys$ = SubLFiles.deflexical("*GET-PRIMARY-KEYS*", (SubLObject)sdbc.$int20$28);
        sdbc.$get_imported_keys$ = SubLFiles.deflexical("*GET-IMPORTED-KEYS*", (SubLObject)sdbc.$int21$29);
        sdbc.$get_exported_keys$ = SubLFiles.deflexical("*GET-EXPORTED-KEYS*", (SubLObject)sdbc.$int22$30);
        sdbc.$get_index_info$ = SubLFiles.deflexical("*GET-INDEX-INFO*", (SubLObject)sdbc.$int23$31);
        sdbc.$cancel$ = SubLFiles.deflexical("*CANCEL*", (SubLObject)sdbc.$int24$32);
        sdbc.$get_max_connections$ = SubLFiles.deflexical("*GET-MAX-CONNECTIONS*", (SubLObject)sdbc.$int25$33);
        sdbc.$stop_response$ = SubLFiles.deflexical("*STOP-RESPONSE*", (SubLObject)sdbc.ZERO_INTEGER);
        sdbc.$integer_response$ = SubLFiles.deflexical("*INTEGER-RESPONSE*", (SubLObject)sdbc.ONE_INTEGER);
        sdbc.$result_set_response$ = SubLFiles.deflexical("*RESULT-SET-RESPONSE*", (SubLObject)sdbc.TWO_INTEGER);
        sdbc.$void_response$ = SubLFiles.deflexical("*VOID-RESPONSE*", (SubLObject)sdbc.THREE_INTEGER);
        sdbc.$connection$ = SubLFiles.deflexical("*CONNECTION*", (SubLObject)sdbc.FOUR_INTEGER);
        sdbc.$update_counts$ = SubLFiles.deflexical("*UPDATE-COUNTS*", (SubLObject)sdbc.FIVE_INTEGER);
        sdbc.$transaction_isolation_level$ = SubLFiles.deflexical("*TRANSACTION-ISOLATION-LEVEL*", (SubLObject)sdbc.SIX_INTEGER);
        sdbc.$boolean$ = SubLFiles.deflexical("*BOOLEAN*", (SubLObject)sdbc.SEVEN_INTEGER);
        sdbc.$io_error$ = SubLFiles.deflexical("*IO-ERROR*", (SubLObject)sdbc.MINUS_ONE_INTEGER);
        sdbc.$sql_error$ = SubLFiles.deflexical("*SQL-ERROR*", (SubLObject)sdbc.$int26$_2);
        sdbc.$unknown_error$ = SubLFiles.deflexical("*UNKNOWN-ERROR*", (SubLObject)sdbc.$int27$_3);
        sdbc.$client_error$ = SubLFiles.deflexical("*CLIENT-ERROR*", (SubLObject)sdbc.$int28$_4);
        sdbc.$commit_error$ = SubLFiles.deflexical("*COMMIT-ERROR*", (SubLObject)sdbc.$int29$_5);
        sdbc.$rollback_error$ = SubLFiles.deflexical("*ROLLBACK-ERROR*", (SubLObject)sdbc.$int30$_6);
        sdbc.$transaction_error$ = SubLFiles.deflexical("*TRANSACTION-ERROR*", (SubLObject)sdbc.$int31$_7);
        sdbc.$batch_update_error$ = SubLFiles.deflexical("*BATCH-UPDATE-ERROR*", (SubLObject)sdbc.$int32$_8);
        sdbc.$dtp_sql_connection$ = SubLFiles.defconstant("*DTP-SQL-CONNECTION*", (SubLObject)sdbc.$sym37$SQL_CONNECTION);
        sdbc.$dtp_sql_ticket$ = SubLFiles.defconstant("*DTP-SQL-TICKET*", (SubLObject)sdbc.$sym109$SQL_TICKET);
        sdbc.$sql_connection_timeout_seconds$ = SubLFiles.defparameter("*SQL-CONNECTION-TIMEOUT-SECONDS*", (SubLObject)sdbc.$int127$212);
        sdbc.$sql_connection_timeout_seconds_within_inference$ = SubLFiles.defparameter("*SQL-CONNECTION-TIMEOUT-SECONDS-WITHIN-INFERENCE*", numeric_date_utilities.$seconds_in_an_hour$.getGlobalValue());
        sdbc.$dtp_sdbc_error$ = SubLFiles.defconstant("*DTP-SDBC-ERROR*", (SubLObject)sdbc.$sym142$SDBC_ERROR);
        sdbc.$sdbc_error_decoding$ = SubLFiles.defparameter("*SDBC-ERROR-DECODING*", (SubLObject)ConsesLow.list(reader.bq_cons(sdbc.$io_error$.getGlobalValue(), (SubLObject)sdbc.$str167$_IO), reader.bq_cons(sdbc.$sql_error$.getGlobalValue(), (SubLObject)sdbc.$str168$_SQL), reader.bq_cons(sdbc.$unknown_error$.getGlobalValue(), (SubLObject)sdbc.$str169$), reader.bq_cons(sdbc.$client_error$.getGlobalValue(), (SubLObject)sdbc.$str170$_CLIENT), reader.bq_cons(sdbc.$transaction_error$.getGlobalValue(), (SubLObject)sdbc.$str171$_TRANSACTION), reader.bq_cons(sdbc.$rollback_error$.getGlobalValue(), (SubLObject)sdbc.$str172$_ROLLBACK), reader.bq_cons(sdbc.$batch_update_error$.getGlobalValue(), (SubLObject)sdbc.$str173$_BATCH_UPDATE)));
        sdbc.$dtp_sql_result_set$ = SubLFiles.defconstant("*DTP-SQL-RESULT-SET*", (SubLObject)sdbc.$sym174$SQL_RESULT_SET);
        sdbc.$dtp_sql_statement$ = SubLFiles.defconstant("*DTP-SQL-STATEMENT*", (SubLObject)sdbc.$sym218$SQL_STATEMENT);
        sdbc.$sdbc_database_connection_url_descriptions$ = SubLFiles.deflexical("*SDBC-DATABASE-CONNECTION-URL-DESCRIPTIONS*", (sdbc.NIL != Symbols.boundp((SubLObject)sdbc.$sym282$_SDBC_DATABASE_CONNECTION_URL_DESCRIPTIONS_)) ? sdbc.$sdbc_database_connection_url_descriptions$.getGlobalValue() : dictionary.new_dictionary((SubLObject)sdbc.EQUAL, (SubLObject)sdbc.UNPROVIDED));
        sdbc.$sdbc_db2_port$ = SubLFiles.deflexical("*SDBC-DB2-PORT*", (SubLObject)((sdbc.NIL != Symbols.boundp((SubLObject)sdbc.$sym331$_SDBC_DB2_PORT_)) ? sdbc.$sdbc_db2_port$.getGlobalValue() : sdbc.$int332$50001));
        sdbc.$sdbc_sybase_iq_port$ = SubLFiles.deflexical("*SDBC-SYBASE-IQ-PORT*", (SubLObject)((sdbc.NIL != Symbols.boundp((SubLObject)sdbc.$sym338$_SDBC_SYBASE_IQ_PORT_)) ? sdbc.$sdbc_sybase_iq_port$.getGlobalValue() : sdbc.$int339$2638));
        sdbc.$sdbc_test_row_cardinality$ = SubLFiles.deflexical("*SDBC-TEST-ROW-CARDINALITY*", (SubLObject)sdbc.$int17$25);
        return (SubLObject)sdbc.NIL;
    }

    public static SubLObject setup_sdbc_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), sdbc.$dtp_sql_connection$.getGlobalValue(), Symbols.symbol_function((SubLObject)sdbc.$sym44$SQL_CONNECTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)sdbc.$list45);
        Structures.def_csetf((SubLObject)sdbc.$sym46$SQLC_DB, (SubLObject)sdbc.$sym47$_CSETF_SQLC_DB);
        Structures.def_csetf((SubLObject)sdbc.$sym48$SQLC_USER, (SubLObject)sdbc.$sym49$_CSETF_SQLC_USER);
        Structures.def_csetf((SubLObject)sdbc.$sym50$SQLC_DBMS_SERVER, (SubLObject)sdbc.$sym51$_CSETF_SQLC_DBMS_SERVER);
        Structures.def_csetf((SubLObject)sdbc.$sym52$SQLC_PORT, (SubLObject)sdbc.$sym53$_CSETF_SQLC_PORT);
        Structures.def_csetf((SubLObject)sdbc.$sym54$SQLC_CHANNEL, (SubLObject)sdbc.$sym55$_CSETF_SQLC_CHANNEL);
        Structures.def_csetf((SubLObject)sdbc.$sym56$SQLC_STATEMENTS, (SubLObject)sdbc.$sym57$_CSETF_SQLC_STATEMENTS);
        Structures.def_csetf((SubLObject)sdbc.$sym58$SQLC_LOCK, (SubLObject)sdbc.$sym59$_CSETF_SQLC_LOCK);
        Structures.def_csetf((SubLObject)sdbc.$sym60$SQLC_SUBPROTOCOL, (SubLObject)sdbc.$sym61$_CSETF_SQLC_SUBPROTOCOL);
        Structures.def_csetf((SubLObject)sdbc.$sym62$SQLC_PROXY_SERVER, (SubLObject)sdbc.$sym63$_CSETF_SQLC_PROXY_SERVER);
        Structures.def_csetf((SubLObject)sdbc.$sym64$SQLC_ERROR_HANDLING, (SubLObject)sdbc.$sym65$_CSETF_SQLC_ERROR_HANDLING);
        Structures.def_csetf((SubLObject)sdbc.$sym66$SQLC_TICKETS, (SubLObject)sdbc.$sym67$_CSETF_SQLC_TICKETS);
        Structures.def_csetf((SubLObject)sdbc.$sym68$SQLC_MAILMAN, (SubLObject)sdbc.$sym69$_CSETF_SQLC_MAILMAN);
        Equality.identity((SubLObject)sdbc.$sym37$SQL_CONNECTION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sdbc.$dtp_sql_connection$.getGlobalValue(), Symbols.symbol_function((SubLObject)sdbc.$sym87$VISIT_DEFSTRUCT_OBJECT_SQL_CONNECTION_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), sdbc.$dtp_sql_ticket$.getGlobalValue(), Symbols.symbol_function((SubLObject)sdbc.$sym116$SQL_TICKET_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)sdbc.$list117);
        Structures.def_csetf((SubLObject)sdbc.$sym118$SQL_TICKET_SEMAPHORE, (SubLObject)sdbc.$sym119$_CSETF_SQL_TICKET_SEMAPHORE);
        Structures.def_csetf((SubLObject)sdbc.$sym120$SQL_TICKET_RESULT, (SubLObject)sdbc.$sym121$_CSETF_SQL_TICKET_RESULT);
        Equality.identity((SubLObject)sdbc.$sym109$SQL_TICKET);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sdbc.$dtp_sql_ticket$.getGlobalValue(), Symbols.symbol_function((SubLObject)sdbc.$sym125$VISIT_DEFSTRUCT_OBJECT_SQL_TICKET_METHOD));
        access_macros.register_macro_helper((SubLObject)sdbc.$sym138$SQLC_SET_ERROR_HANDLING, (SubLObject)sdbc.$sym139$SQLS_EXECUTE_TRANSACTION);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), sdbc.$dtp_sdbc_error$.getGlobalValue(), Symbols.symbol_function((SubLObject)sdbc.$sym149$SDBC_ERROR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)sdbc.$list150);
        Structures.def_csetf((SubLObject)sdbc.$sym151$SDBC_ERROR_TYPE, (SubLObject)sdbc.$sym152$_CSETF_SDBC_ERROR_TYPE);
        Structures.def_csetf((SubLObject)sdbc.$sym153$SDBC_ERROR_MESSAGE, (SubLObject)sdbc.$sym154$_CSETF_SDBC_ERROR_MESSAGE);
        Structures.def_csetf((SubLObject)sdbc.$sym155$SDBC_ERROR_CODE, (SubLObject)sdbc.$sym156$_CSETF_SDBC_ERROR_CODE);
        Equality.identity((SubLObject)sdbc.$sym142$SDBC_ERROR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sdbc.$dtp_sdbc_error$.getGlobalValue(), Symbols.symbol_function((SubLObject)sdbc.$sym161$VISIT_DEFSTRUCT_OBJECT_SDBC_ERROR_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), sdbc.$dtp_sql_result_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)sdbc.$sym181$SQL_RESULT_SET_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)sdbc.$list182);
        Structures.def_csetf((SubLObject)sdbc.$sym183$SQLRS_ROWS, (SubLObject)sdbc.$sym184$_CSETF_SQLRS_ROWS);
        Structures.def_csetf((SubLObject)sdbc.$sym185$SQLRS_CURRENT, (SubLObject)sdbc.$sym186$_CSETF_SQLRS_CURRENT);
        Structures.def_csetf((SubLObject)sdbc.$sym187$SQLRS_LAST, (SubLObject)sdbc.$sym188$_CSETF_SQLRS_LAST);
        Structures.def_csetf((SubLObject)sdbc.$sym189$SQLRS_START, (SubLObject)sdbc.$sym190$_CSETF_SQLRS_START);
        Structures.def_csetf((SubLObject)sdbc.$sym191$SQLRS_CONNECTION, (SubLObject)sdbc.$sym192$_CSETF_SQLRS_CONNECTION);
        Structures.def_csetf((SubLObject)sdbc.$sym193$SQLRS_BLOCK_SIZE, (SubLObject)sdbc.$sym194$_CSETF_SQLRS_BLOCK_SIZE);
        Structures.def_csetf((SubLObject)sdbc.$sym195$SQLRS_ID, (SubLObject)sdbc.$sym196$_CSETF_SQLRS_ID);
        Equality.identity((SubLObject)sdbc.$sym174$SQL_RESULT_SET);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sdbc.$dtp_sql_result_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)sdbc.$sym205$VISIT_DEFSTRUCT_OBJECT_SQL_RESULT_SET_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), sdbc.$dtp_sql_statement$.getGlobalValue(), Symbols.symbol_function((SubLObject)sdbc.$sym224$SQL_STATEMENT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)sdbc.$list225);
        Structures.def_csetf((SubLObject)sdbc.$sym226$SQLS_CONNECTION, (SubLObject)sdbc.$sym227$_CSETF_SQLS_CONNECTION);
        Structures.def_csetf((SubLObject)sdbc.$sym228$SQLS_ID, (SubLObject)sdbc.$sym229$_CSETF_SQLS_ID);
        Structures.def_csetf((SubLObject)sdbc.$sym230$SQLS_SQL, (SubLObject)sdbc.$sym231$_CSETF_SQLS_SQL);
        Structures.def_csetf((SubLObject)sdbc.$sym232$SQLS_SETTINGS, (SubLObject)sdbc.$sym233$_CSETF_SQLS_SETTINGS);
        Structures.def_csetf((SubLObject)sdbc.$sym234$SQLS_BATCH, (SubLObject)sdbc.$sym235$_CSETF_SQLS_BATCH);
        Structures.def_csetf((SubLObject)sdbc.$sym236$SQLS_RS, (SubLObject)sdbc.$sym237$_CSETF_SQLS_RS);
        Equality.identity((SubLObject)sdbc.$sym218$SQL_STATEMENT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sdbc.$dtp_sql_statement$.getGlobalValue(), Symbols.symbol_function((SubLObject)sdbc.$sym243$VISIT_DEFSTRUCT_OBJECT_SQL_STATEMENT_METHOD));
        access_macros.register_macro_helper((SubLObject)sdbc.$sym251$SQLS_GET_CONNECTION, (SubLObject)sdbc.$sym139$SQLS_EXECUTE_TRANSACTION);
        generic_testing.define_test_case_table_int((SubLObject)sdbc.$sym273$NEW_DB_URL, (SubLObject)ConsesLow.list(new SubLObject[] { sdbc.$kw274$TEST, Symbols.symbol_function((SubLObject)sdbc.$sym275$STRING_), sdbc.$kw276$OWNER, sdbc.NIL, sdbc.$kw277$CLASSES, sdbc.NIL, sdbc.$kw278$KB, sdbc.$kw279$TINY, sdbc.$kw280$WORKING_, sdbc.T }), (SubLObject)sdbc.$list281);
        subl_macro_promotions.declare_defglobal((SubLObject)sdbc.$sym282$_SDBC_DATABASE_CONNECTION_URL_DESCRIPTIONS_);
        access_macros.register_external_symbol((SubLObject)sdbc.$sym289$GET_ALL_SDBC_DATABASE_SUB_PROTOCOLS);
        add_sdbc_database_connection_url_description((SubLObject)sdbc.$str10$postgresql, (SubLObject)sdbc.$list299, (SubLObject)sdbc.$list300, (SubLObject)sdbc.$list301, (SubLObject)sdbc.$list302);
        add_sdbc_database_connection_url_description((SubLObject)sdbc.$str303$mysql, (SubLObject)sdbc.$list299, (SubLObject)sdbc.$list304, (SubLObject)sdbc.$list301, (SubLObject)sdbc.$list305);
        add_sdbc_database_connection_url_description((SubLObject)sdbc.$str306$oracle, (SubLObject)sdbc.$list307, (SubLObject)sdbc.NIL, (SubLObject)sdbc.NIL, (SubLObject)sdbc.$list308);
        add_sdbc_database_connection_url_description((SubLObject)sdbc.$str309$sqlserver, (SubLObject)sdbc.$list310, (SubLObject)sdbc.$list311, (SubLObject)sdbc.$list312, (SubLObject)sdbc.$list313);
        add_sdbc_database_connection_url_description((SubLObject)sdbc.$str314$microsoft_sqlserver, (SubLObject)sdbc.$list315, (SubLObject)sdbc.$list311, (SubLObject)sdbc.$list312, (SubLObject)sdbc.$list313);
        add_sdbc_database_connection_url_description((SubLObject)sdbc.$str316$odbc, (SubLObject)sdbc.$list317, (SubLObject)sdbc.$list318, (SubLObject)sdbc.$list312, (SubLObject)sdbc.NIL);
        add_sdbc_database_connection_url_description((SubLObject)sdbc.$str319$sybase, (SubLObject)sdbc.$list320, (SubLObject)sdbc.$list321, (SubLObject)sdbc.$list312, (SubLObject)sdbc.$list322);
        add_sdbc_database_connection_url_description((SubLObject)sdbc.$str323$derby, (SubLObject)sdbc.$list299, (SubLObject)sdbc.$list304, (SubLObject)sdbc.$list312, (SubLObject)sdbc.$list324);
        add_sdbc_database_connection_url_description((SubLObject)sdbc.$str325$st, (SubLObject)sdbc.$list299, (SubLObject)sdbc.$list326, (SubLObject)sdbc.$list301, (SubLObject)sdbc.$list327);
        add_sdbc_database_connection_url_description((SubLObject)sdbc.$str328$poiseschema, (SubLObject)sdbc.$list329, (SubLObject)sdbc.NIL, (SubLObject)sdbc.$list301, (SubLObject)sdbc.NIL);
        add_sdbc_database_connection_url_description((SubLObject)sdbc.$str330$poisedata, (SubLObject)sdbc.$list317, (SubLObject)sdbc.NIL, (SubLObject)sdbc.$list301, (SubLObject)sdbc.NIL);
        access_macros.register_external_symbol((SubLObject)sdbc.$sym331$_SDBC_DB2_PORT_);
        subl_macro_promotions.declare_defglobal((SubLObject)sdbc.$sym331$_SDBC_DB2_PORT_);
        access_macros.register_external_symbol((SubLObject)sdbc.$sym333$SET_SDBC_DB2_PORT);
        add_sdbc_database_connection_url_description((SubLObject)sdbc.$str334$db2, (SubLObject)sdbc.$list335, (SubLObject)sdbc.$list304, (SubLObject)sdbc.$list336, (SubLObject)sdbc.$list337);
        access_macros.register_external_symbol((SubLObject)sdbc.$sym338$_SDBC_SYBASE_IQ_PORT_);
        subl_macro_promotions.declare_defglobal((SubLObject)sdbc.$sym338$_SDBC_SYBASE_IQ_PORT_);
        access_macros.register_external_symbol((SubLObject)sdbc.$sym340$SET_SDBC_SYBASE_IQ_PORT);
        add_sdbc_database_connection_url_description((SubLObject)sdbc.$str341$sybase_iq, (SubLObject)sdbc.$list342, (SubLObject)sdbc.$list321, (SubLObject)sdbc.$list343, (SubLObject)sdbc.$list344);
        access_macros.register_macro_helper((SubLObject)sdbc.$sym393$SQLS_HANDLE_COMMIT_ERROR, (SubLObject)sdbc.$sym139$SQLS_EXECUTE_TRANSACTION);
        access_macros.register_macro_helper((SubLObject)sdbc.$sym394$SQLS_HANDLE_ROLLBACK, (SubLObject)sdbc.$sym139$SQLS_EXECUTE_TRANSACTION);
        access_macros.register_macro_helper((SubLObject)sdbc.$sym396$SQLS_HANDLE_TRANSACTION_ERRORS, (SubLObject)sdbc.$sym139$SQLS_EXECUTE_TRANSACTION);
        return (SubLObject)sdbc.NIL;
    }

    public void declareFunctions() {
        declare_sdbc_file();
    }

    public void initializeVariables() {
        init_sdbc_file();
    }

    public void runTopLevelForms() {
        setup_sdbc_file();
    }



    public static final class $sql_connection_native extends SubLStructNative
    {
        public SubLObject $db;
        public SubLObject $user;
        public SubLObject $dbms_server;
        public SubLObject $port;
        public SubLObject $channel;
        public SubLObject $statements;
        public SubLObject $lock;
        public SubLObject $subprotocol;
        public SubLObject $proxy_server;
        public SubLObject $error_handling;
        public SubLObject $tickets;
        public SubLObject $mailman;
        private static final SubLStructDeclNative structDecl;

        public $sql_connection_native() {
            this.$db = (SubLObject)CommonSymbols.NIL;
            this.$user = (SubLObject)CommonSymbols.NIL;
            this.$dbms_server = (SubLObject)CommonSymbols.NIL;
            this.$port = (SubLObject)CommonSymbols.NIL;
            this.$channel = (SubLObject)CommonSymbols.NIL;
            this.$statements = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$subprotocol = (SubLObject)CommonSymbols.NIL;
            this.$proxy_server = (SubLObject)CommonSymbols.NIL;
            this.$error_handling = (SubLObject)CommonSymbols.NIL;
            this.$tickets = (SubLObject)CommonSymbols.NIL;
            this.$mailman = (SubLObject)CommonSymbols.NIL;
        }

        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_connection_native.structDecl;
        }

        public SubLObject getField2() {
            return this.$db;
        }

        public SubLObject getField3() {
            return this.$user;
        }

        public SubLObject getField4() {
            return this.$dbms_server;
        }

        public SubLObject getField5() {
            return this.$port;
        }

        public SubLObject getField6() {
            return this.$channel;
        }

        public SubLObject getField7() {
            return this.$statements;
        }

        public SubLObject getField8() {
            return this.$lock;
        }

        public SubLObject getField9() {
            return this.$subprotocol;
        }

        public SubLObject getField10() {
            return this.$proxy_server;
        }

        public SubLObject getField11() {
            return this.$error_handling;
        }

        public SubLObject getField12() {
            return this.$tickets;
        }

        public SubLObject getField13() {
            return this.$mailman;
        }

        public SubLObject setField2(final SubLObject value) {
            return this.$db = value;
        }

        public SubLObject setField3(final SubLObject value) {
            return this.$user = value;
        }

        public SubLObject setField4(final SubLObject value) {
            return this.$dbms_server = value;
        }

        public SubLObject setField5(final SubLObject value) {
            return this.$port = value;
        }

        public SubLObject setField6(final SubLObject value) {
            return this.$channel = value;
        }

        public SubLObject setField7(final SubLObject value) {
            return this.$statements = value;
        }

        public SubLObject setField8(final SubLObject value) {
            return this.$lock = value;
        }

        public SubLObject setField9(final SubLObject value) {
            return this.$subprotocol = value;
        }

        public SubLObject setField10(final SubLObject value) {
            return this.$proxy_server = value;
        }

        public SubLObject setField11(final SubLObject value) {
            return this.$error_handling = value;
        }

        public SubLObject setField12(final SubLObject value) {
            return this.$tickets = value;
        }

        public SubLObject setField13(final SubLObject value) {
            return this.$mailman = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_connection_native.class, sdbc.$sym37$SQL_CONNECTION, sdbc.$sym38$SQL_CONNECTION_P, sdbc.$list39, sdbc.$list40, new String[] { "$db", "$user", "$dbms_server", "$port", "$channel", "$statements", "$lock", "$subprotocol", "$proxy_server", "$error_handling", "$tickets", "$mailman" }, sdbc.$list41, sdbc.$list42, sdbc.$sym43$SQLC_PRINT);
        }
    }

    public static final class $sql_connection_p$UnaryFunction extends UnaryFunction
    {
        public $sql_connection_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-CONNECTION-P"));
        }

        public SubLObject processItem(final SubLObject arg1) {
            return sdbc.sql_connection_p(arg1);
        }
    }

    public static final class $sql_ticket_native extends SubLStructNative
    {
        public SubLObject $semaphore;
        public SubLObject $result;
        private static final SubLStructDeclNative structDecl;

        public $sql_ticket_native() {
            this.$semaphore = (SubLObject)CommonSymbols.NIL;
            this.$result = (SubLObject)CommonSymbols.NIL;
        }

        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_ticket_native.structDecl;
        }

        public SubLObject getField2() {
            return this.$semaphore;
        }

        public SubLObject getField3() {
            return this.$result;
        }

        public SubLObject setField2(final SubLObject value) {
            return this.$semaphore = value;
        }

        public SubLObject setField3(final SubLObject value) {
            return this.$result = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_ticket_native.class, sdbc.$sym109$SQL_TICKET, sdbc.$sym110$SQL_TICKET_P, sdbc.$list111, sdbc.$list112, new String[] { "$semaphore", "$result" }, sdbc.$list113, sdbc.$list114, sdbc.$sym115$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $sql_ticket_p$UnaryFunction extends UnaryFunction
    {
        public $sql_ticket_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-TICKET-P"));
        }

        public SubLObject processItem(final SubLObject arg1) {
            return sdbc.sql_ticket_p(arg1);
        }
    }

    public static final class $sdbc_error_native extends SubLStructNative
    {
        public SubLObject $type;
        public SubLObject $message;
        public SubLObject $code;
        private static final SubLStructDeclNative structDecl;

        public $sdbc_error_native() {
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$message = (SubLObject)CommonSymbols.NIL;
            this.$code = (SubLObject)CommonSymbols.NIL;
        }

        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sdbc_error_native.structDecl;
        }

        public SubLObject getField2() {
            return this.$type;
        }

        public SubLObject getField3() {
            return this.$message;
        }

        public SubLObject getField4() {
            return this.$code;
        }

        public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }

        public SubLObject setField3(final SubLObject value) {
            return this.$message = value;
        }

        public SubLObject setField4(final SubLObject value) {
            return this.$code = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative((Class)$sdbc_error_native.class, sdbc.$sym142$SDBC_ERROR, sdbc.$sym143$SDBC_ERROR_P, sdbc.$list144, sdbc.$list145, new String[] { "$type", "$message", "$code" }, sdbc.$list146, sdbc.$list147, sdbc.$sym148$SDBC_ERROR_PRINT);
        }
    }

    public static final class $sdbc_error_p$UnaryFunction extends UnaryFunction
    {
        public $sdbc_error_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SDBC-ERROR-P"));
        }

        public SubLObject processItem(final SubLObject arg1) {
            return sdbc.sdbc_error_p(arg1);
        }
    }

    public static final class $sql_result_set_native extends SubLStructNative
    {
        public SubLObject $rows;
        public SubLObject $current;
        public SubLObject $last;
        public SubLObject $start;
        public SubLObject $connection;
        public SubLObject $block_size;
        public SubLObject $id;
        private static final SubLStructDeclNative structDecl;

        public $sql_result_set_native() {
            this.$rows = (SubLObject)CommonSymbols.NIL;
            this.$current = (SubLObject)CommonSymbols.NIL;
            this.$last = (SubLObject)CommonSymbols.NIL;
            this.$start = (SubLObject)CommonSymbols.NIL;
            this.$connection = (SubLObject)CommonSymbols.NIL;
            this.$block_size = (SubLObject)CommonSymbols.NIL;
            this.$id = (SubLObject)CommonSymbols.NIL;
        }

        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_result_set_native.structDecl;
        }

        public SubLObject getField2() {
            return this.$rows;
        }

        public SubLObject getField3() {
            return this.$current;
        }

        public SubLObject getField4() {
            return this.$last;
        }

        public SubLObject getField5() {
            return this.$start;
        }

        public SubLObject getField6() {
            return this.$connection;
        }

        public SubLObject getField7() {
            return this.$block_size;
        }

        public SubLObject getField8() {
            return this.$id;
        }

        public SubLObject setField2(final SubLObject value) {
            return this.$rows = value;
        }

        public SubLObject setField3(final SubLObject value) {
            return this.$current = value;
        }

        public SubLObject setField4(final SubLObject value) {
            return this.$last = value;
        }

        public SubLObject setField5(final SubLObject value) {
            return this.$start = value;
        }

        public SubLObject setField6(final SubLObject value) {
            return this.$connection = value;
        }

        public SubLObject setField7(final SubLObject value) {
            return this.$block_size = value;
        }

        public SubLObject setField8(final SubLObject value) {
            return this.$id = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_result_set_native.class, sdbc.$sym174$SQL_RESULT_SET, sdbc.$sym175$SQL_RESULT_SET_P, sdbc.$list176, sdbc.$list177, new String[] { "$rows", "$current", "$last", "$start", "$connection", "$block_size", "$id" }, sdbc.$list178, sdbc.$list179, sdbc.$sym180$SQLRS_PRINT);
        }
    }

    public static final class $sql_result_set_p$UnaryFunction extends UnaryFunction
    {
        public $sql_result_set_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-RESULT-SET-P"));
        }

        public SubLObject processItem(final SubLObject arg1) {
            return sdbc.sql_result_set_p(arg1);
        }
    }

    public static final class $sql_statement_native extends SubLStructNative
    {
        public SubLObject $connection;
        public SubLObject $id;
        public SubLObject $sql;
        public SubLObject $settings;
        public SubLObject $batch;
        public SubLObject $rs;
        private static final SubLStructDeclNative structDecl;

        public $sql_statement_native() {
            this.$connection = (SubLObject)CommonSymbols.NIL;
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$sql = (SubLObject)CommonSymbols.NIL;
            this.$settings = (SubLObject)CommonSymbols.NIL;
            this.$batch = (SubLObject)CommonSymbols.NIL;
            this.$rs = (SubLObject)CommonSymbols.NIL;
        }

        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sql_statement_native.structDecl;
        }

        public SubLObject getField2() {
            return this.$connection;
        }

        public SubLObject getField3() {
            return this.$id;
        }

        public SubLObject getField4() {
            return this.$sql;
        }

        public SubLObject getField5() {
            return this.$settings;
        }

        public SubLObject getField6() {
            return this.$batch;
        }

        public SubLObject getField7() {
            return this.$rs;
        }

        public SubLObject setField2(final SubLObject value) {
            return this.$connection = value;
        }

        public SubLObject setField3(final SubLObject value) {
            return this.$id = value;
        }

        public SubLObject setField4(final SubLObject value) {
            return this.$sql = value;
        }

        public SubLObject setField5(final SubLObject value) {
            return this.$settings = value;
        }

        public SubLObject setField6(final SubLObject value) {
            return this.$batch = value;
        }

        public SubLObject setField7(final SubLObject value) {
            return this.$rs = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative((Class)$sql_statement_native.class, sdbc.$sym218$SQL_STATEMENT, sdbc.$sym219$SQL_STATEMENT_P, sdbc.$list220, sdbc.$list221, new String[] { "$connection", "$id", "$sql", "$settings", "$batch", "$rs" }, sdbc.$list222, sdbc.$list223, sdbc.$sym115$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $sql_statement_p$UnaryFunction extends UnaryFunction
    {
        public $sql_statement_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SQL-STATEMENT-P"));
        }

        public SubLObject processItem(final SubLObject arg1) {
            return sdbc.sql_statement_p(arg1);
        }
    }


    public static final SubLFile me = new sdbc();
    public static final String myName = "com.cyc.cycjava.cycl.sdbc";
    public static final String myFingerPrint = "cb7d9e5569a0d044cd6308d983347b59702145cdcd41d83c1a952b9c3837b56a";
    public static SubLSymbol $dbms_server$ = null;
    public static SubLSymbol $sdbc_proxy_server$ = null;
    public static SubLSymbol $sql_port$ = null;
    public static SubLSymbol $sql_protocol$ = null;
    public static SubLSymbol $sql_subprotocol$ = null;
    public static SubLSymbol $sql_connection_timeout$ = null;
    public static SubLSymbol $connection_id$ = null;
    private static SubLSymbol $result_set_block_size$ = null;
    private static SubLSymbol $quit$ = null;
    private static SubLSymbol $execute_update$ = null;
    private static SubLSymbol $execute_query$ = null;
    private static SubLSymbol $prepare_statement$ = null;
    private static SubLSymbol $create_statement$ = null;
    private static SubLSymbol $set_bytes$ = null;
    private static SubLSymbol $ps_execute_update$ = null;
    private static SubLSymbol $ps_execute_query$ = null;
    private static SubLSymbol $set_int$ = null;
    private static SubLSymbol $close_statement$ = null;
    private static SubLSymbol $new_connection$ = null;
    private static SubLSymbol $set_string$ = null;
    private static SubLSymbol $set_long$ = null;
    private static SubLSymbol $set_double$ = null;
    private static SubLSymbol $set_float$ = null;
    private static SubLSymbol $execute_batch$ = null;
    private static SubLSymbol $get_rows$ = null;
    private static SubLSymbol $close_result_set$ = null;
    private static SubLSymbol $execute_update_auto_keys$ = null;
    private static SubLSymbol $get_generated_keys$ = null;
    private static SubLSymbol $set_auto_commit$ = null;
    private static SubLSymbol $commit$ = null;
    private static SubLSymbol $rollback$ = null;
    private static SubLSymbol $get_transaction_isolation$ = null;
    private static SubLSymbol $set_transaction_isolation$ = null;
    private static SubLSymbol $get_auto_commit$ = null;
    private static SubLSymbol $get_tables$ = null;
    private static SubLSymbol $get_columns$ = null;
    private static SubLSymbol $get_primary_keys$ = null;
    private static SubLSymbol $get_imported_keys$ = null;
    private static SubLSymbol $get_exported_keys$ = null;
    private static SubLSymbol $get_index_info$ = null;
    private static SubLSymbol $cancel$ = null;
    private static SubLSymbol $get_max_connections$ = null;
    private static SubLSymbol $stop_response$ = null;
    private static SubLSymbol $integer_response$ = null;
    private static SubLSymbol $result_set_response$ = null;
    private static SubLSymbol $void_response$ = null;
    private static SubLSymbol $connection$ = null;
    private static SubLSymbol $update_counts$ = null;
    private static SubLSymbol $transaction_isolation_level$ = null;
    private static SubLSymbol $boolean$ = null;
    private static SubLSymbol $io_error$ = null;
    private static SubLSymbol $sql_error$ = null;
    private static SubLSymbol $unknown_error$ = null;
    private static SubLSymbol $client_error$ = null;
    private static SubLSymbol $commit_error$ = null;
    private static SubLSymbol $rollback_error$ = null;
    private static SubLSymbol $transaction_error$ = null;
    private static SubLSymbol $batch_update_error$ = null;
    public static SubLSymbol $dtp_sql_connection$ = null;
    public static SubLSymbol $dtp_sql_ticket$ = null;
    public static SubLSymbol $sql_connection_timeout_seconds$ = null;
    public static SubLSymbol $sql_connection_timeout_seconds_within_inference$ = null;
    public static SubLSymbol $dtp_sdbc_error$ = null;
    private static SubLSymbol $sdbc_error_decoding$ = null;
    public static SubLSymbol $dtp_sql_result_set$ = null;
    public static SubLSymbol $dtp_sql_statement$ = null;
    public static SubLSymbol $sdbc_database_connection_url_descriptions$ = null;
    public static SubLSymbol $sdbc_db2_port$ = null;
    public static SubLSymbol $sdbc_sybase_iq_port$ = null;
    private static SubLSymbol $sdbc_test_row_cardinality$ = null;
    private static final SubLList $list0 = ConsesLow.list(SubLObjectFactory.makeString("application.sdbc.dbms-server"));
    private static final SubLSymbol $sym1$_DBMS_SERVER_ = SubLObjectFactory.makeSymbol("*DBMS-SERVER*");
    private static final SubLString $str2$db_server_cyc_com = SubLObjectFactory.makeString("db-server.cyc.com");
    private static final SubLSymbol $kw3$LEXICAL = SubLObjectFactory.makeKeyword("LEXICAL");
    private static final SubLList $list4 = ConsesLow.list(SubLObjectFactory.makeString("application.sdbc.proxy-server"));
    private static final SubLSymbol $sym5$_SDBC_PROXY_SERVER_ = SubLObjectFactory.makeSymbol("*SDBC-PROXY-SERVER*");
    private static final SubLList $list6 = ConsesLow.list(SubLObjectFactory.makeString("application.sdbc.sql-port"));
    private static final SubLSymbol $sym7$_SQL_PORT_ = SubLObjectFactory.makeSymbol("*SQL-PORT*");
    private static final SubLInteger $int8$9999 = SubLObjectFactory.makeInteger(9999);
    private static final SubLString $str9$jdbc = SubLObjectFactory.makeString("jdbc");
    private static final SubLString $str10$postgresql = SubLObjectFactory.makeString("postgresql");
    private static final SubLString $str11$CONNECTION = SubLObjectFactory.makeString("CONNECTION");
    private static final SubLInteger $int12$1000 = SubLObjectFactory.makeInteger(1000);
    private static final SubLInteger $int13$21 = SubLObjectFactory.makeInteger(21);
    private static final SubLInteger $int14$22 = SubLObjectFactory.makeInteger(22);
    private static final SubLInteger $int15$23 = SubLObjectFactory.makeInteger(23);
    private static final SubLInteger $int16$24 = SubLObjectFactory.makeInteger(24);
    private static final SubLInteger $int17$25 = SubLObjectFactory.makeInteger(25);
    private static final SubLInteger $int18$26 = SubLObjectFactory.makeInteger(26);
    private static final SubLInteger $int19$27 = SubLObjectFactory.makeInteger(27);
    private static final SubLInteger $int20$28 = SubLObjectFactory.makeInteger(28);
    private static final SubLInteger $int21$29 = SubLObjectFactory.makeInteger(29);
    private static final SubLInteger $int22$30 = SubLObjectFactory.makeInteger(30);
    private static final SubLInteger $int23$31 = SubLObjectFactory.makeInteger(31);
    private static final SubLInteger $int24$32 = SubLObjectFactory.makeInteger(32);
    private static final SubLInteger $int25$33 = SubLObjectFactory.makeInteger(33);
    private static final SubLInteger $int26$_2 = SubLObjectFactory.makeInteger(-2);
    private static final SubLInteger $int27$_3 = SubLObjectFactory.makeInteger(-3);
    private static final SubLInteger $int28$_4 = SubLObjectFactory.makeInteger(-4);
    private static final SubLInteger $int29$_5 = SubLObjectFactory.makeInteger(-5);
    private static final SubLInteger $int30$_6 = SubLObjectFactory.makeInteger(-6);
    private static final SubLInteger $int31$_7 = SubLObjectFactory.makeInteger(-7);
    private static final SubLInteger $int32$_8 = SubLObjectFactory.makeInteger(-8);
    private static final SubLSymbol $sym33$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
    private static final SubLSymbol $sym34$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
    private static final SubLSymbol $sym35$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
    private static final SubLSymbol $kw36$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
    private static final SubLSymbol $sym37$SQL_CONNECTION = SubLObjectFactory.makeSymbol("SQL-CONNECTION");
    private static final SubLSymbol $sym38$SQL_CONNECTION_P = SubLObjectFactory.makeSymbol("SQL-CONNECTION-P");
    private static final SubLList $list39 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeSymbol("DB"), SubLObjectFactory.makeSymbol("USER"), SubLObjectFactory.makeSymbol("DBMS-SERVER"), SubLObjectFactory.makeSymbol("PORT"), SubLObjectFactory.makeSymbol("CHANNEL"), SubLObjectFactory.makeSymbol("STATEMENTS"), SubLObjectFactory.makeSymbol("LOCK"), SubLObjectFactory.makeSymbol("SUBPROTOCOL"), SubLObjectFactory.makeSymbol("PROXY-SERVER"), SubLObjectFactory.makeSymbol("ERROR-HANDLING"),
        SubLObjectFactory.makeSymbol("TICKETS"), SubLObjectFactory.makeSymbol("MAILMAN")
    });
    private static final SubLList $list40 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeKeyword("DB"), SubLObjectFactory.makeKeyword("USER"), SubLObjectFactory.makeKeyword("DBMS-SERVER"), SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeKeyword("CHANNEL"), SubLObjectFactory.makeKeyword("STATEMENTS"), SubLObjectFactory.makeKeyword("LOCK"), SubLObjectFactory.makeKeyword("SUBPROTOCOL"), SubLObjectFactory.makeKeyword("PROXY-SERVER"), SubLObjectFactory.makeKeyword("ERROR-HANDLING"),
        SubLObjectFactory.makeKeyword("TICKETS"), SubLObjectFactory.makeKeyword("MAILMAN")
    });
    private static final SubLList $list41 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeSymbol("SQLC-DB"), SubLObjectFactory.makeSymbol("SQLC-USER"), SubLObjectFactory.makeSymbol("SQLC-DBMS-SERVER"), SubLObjectFactory.makeSymbol("SQLC-PORT"), SubLObjectFactory.makeSymbol("SQLC-CHANNEL"), SubLObjectFactory.makeSymbol("SQLC-STATEMENTS"), SubLObjectFactory.makeSymbol("SQLC-LOCK"), SubLObjectFactory.makeSymbol("SQLC-SUBPROTOCOL"), SubLObjectFactory.makeSymbol("SQLC-PROXY-SERVER"), SubLObjectFactory.makeSymbol("SQLC-ERROR-HANDLING"),
        SubLObjectFactory.makeSymbol("SQLC-TICKETS"), SubLObjectFactory.makeSymbol("SQLC-MAILMAN")
    });
    private static final SubLList $list42 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeSymbol("_CSETF-SQLC-DB"), SubLObjectFactory.makeSymbol("_CSETF-SQLC-USER"), SubLObjectFactory.makeSymbol("_CSETF-SQLC-DBMS-SERVER"), SubLObjectFactory.makeSymbol("_CSETF-SQLC-PORT"), SubLObjectFactory.makeSymbol("_CSETF-SQLC-CHANNEL"), SubLObjectFactory.makeSymbol("_CSETF-SQLC-STATEMENTS"), SubLObjectFactory.makeSymbol("_CSETF-SQLC-LOCK"), SubLObjectFactory.makeSymbol("_CSETF-SQLC-SUBPROTOCOL"), SubLObjectFactory.makeSymbol("_CSETF-SQLC-PROXY-SERVER"), SubLObjectFactory.makeSymbol("_CSETF-SQLC-ERROR-HANDLING"),
        SubLObjectFactory.makeSymbol("_CSETF-SQLC-TICKETS"), SubLObjectFactory.makeSymbol("_CSETF-SQLC-MAILMAN")
    });
    private static final SubLSymbol $sym43$SQLC_PRINT = SubLObjectFactory.makeSymbol("SQLC-PRINT");
    private static final SubLSymbol $sym44$SQL_CONNECTION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-CONNECTION-PRINT-FUNCTION-TRAMPOLINE");
    private static final SubLList $list45 = ConsesLow.list(SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), SubLObjectFactory.makeSymbol("SQL-CONNECTION-P"));
    private static final SubLSymbol $sym46$SQLC_DB = SubLObjectFactory.makeSymbol("SQLC-DB");
    private static final SubLSymbol $sym47$_CSETF_SQLC_DB = SubLObjectFactory.makeSymbol("_CSETF-SQLC-DB");
    private static final SubLSymbol $sym48$SQLC_USER = SubLObjectFactory.makeSymbol("SQLC-USER");
    private static final SubLSymbol $sym49$_CSETF_SQLC_USER = SubLObjectFactory.makeSymbol("_CSETF-SQLC-USER");
    private static final SubLSymbol $sym50$SQLC_DBMS_SERVER = SubLObjectFactory.makeSymbol("SQLC-DBMS-SERVER");
    private static final SubLSymbol $sym51$_CSETF_SQLC_DBMS_SERVER = SubLObjectFactory.makeSymbol("_CSETF-SQLC-DBMS-SERVER");
    private static final SubLSymbol $sym52$SQLC_PORT = SubLObjectFactory.makeSymbol("SQLC-PORT");
    private static final SubLSymbol $sym53$_CSETF_SQLC_PORT = SubLObjectFactory.makeSymbol("_CSETF-SQLC-PORT");
    private static final SubLSymbol $sym54$SQLC_CHANNEL = SubLObjectFactory.makeSymbol("SQLC-CHANNEL");
    private static final SubLSymbol $sym55$_CSETF_SQLC_CHANNEL = SubLObjectFactory.makeSymbol("_CSETF-SQLC-CHANNEL");
    private static final SubLSymbol $sym56$SQLC_STATEMENTS = SubLObjectFactory.makeSymbol("SQLC-STATEMENTS");
    private static final SubLSymbol $sym57$_CSETF_SQLC_STATEMENTS = SubLObjectFactory.makeSymbol("_CSETF-SQLC-STATEMENTS");
    private static final SubLSymbol $sym58$SQLC_LOCK = SubLObjectFactory.makeSymbol("SQLC-LOCK");
    private static final SubLSymbol $sym59$_CSETF_SQLC_LOCK = SubLObjectFactory.makeSymbol("_CSETF-SQLC-LOCK");
    private static final SubLSymbol $sym60$SQLC_SUBPROTOCOL = SubLObjectFactory.makeSymbol("SQLC-SUBPROTOCOL");
    private static final SubLSymbol $sym61$_CSETF_SQLC_SUBPROTOCOL = SubLObjectFactory.makeSymbol("_CSETF-SQLC-SUBPROTOCOL");
    private static final SubLSymbol $sym62$SQLC_PROXY_SERVER = SubLObjectFactory.makeSymbol("SQLC-PROXY-SERVER");
    private static final SubLSymbol $sym63$_CSETF_SQLC_PROXY_SERVER = SubLObjectFactory.makeSymbol("_CSETF-SQLC-PROXY-SERVER");
    private static final SubLSymbol $sym64$SQLC_ERROR_HANDLING = SubLObjectFactory.makeSymbol("SQLC-ERROR-HANDLING");
    private static final SubLSymbol $sym65$_CSETF_SQLC_ERROR_HANDLING = SubLObjectFactory.makeSymbol("_CSETF-SQLC-ERROR-HANDLING");
    private static final SubLSymbol $sym66$SQLC_TICKETS = SubLObjectFactory.makeSymbol("SQLC-TICKETS");
    private static final SubLSymbol $sym67$_CSETF_SQLC_TICKETS = SubLObjectFactory.makeSymbol("_CSETF-SQLC-TICKETS");
    private static final SubLSymbol $sym68$SQLC_MAILMAN = SubLObjectFactory.makeSymbol("SQLC-MAILMAN");
    private static final SubLSymbol $sym69$_CSETF_SQLC_MAILMAN = SubLObjectFactory.makeSymbol("_CSETF-SQLC-MAILMAN");
    private static final SubLSymbol $kw70$DB = SubLObjectFactory.makeKeyword("DB");
    private static final SubLSymbol $kw71$USER = SubLObjectFactory.makeKeyword("USER");
    private static final SubLSymbol $kw72$DBMS_SERVER = SubLObjectFactory.makeKeyword("DBMS-SERVER");
    private static final SubLSymbol $kw73$PORT = SubLObjectFactory.makeKeyword("PORT");
    private static final SubLSymbol $kw74$CHANNEL = SubLObjectFactory.makeKeyword("CHANNEL");
    private static final SubLSymbol $kw75$STATEMENTS = SubLObjectFactory.makeKeyword("STATEMENTS");
    private static final SubLSymbol $kw76$LOCK = SubLObjectFactory.makeKeyword("LOCK");
    private static final SubLSymbol $kw77$SUBPROTOCOL = SubLObjectFactory.makeKeyword("SUBPROTOCOL");
    private static final SubLSymbol $kw78$PROXY_SERVER = SubLObjectFactory.makeKeyword("PROXY-SERVER");
    private static final SubLSymbol $kw79$ERROR_HANDLING = SubLObjectFactory.makeKeyword("ERROR-HANDLING");
    private static final SubLSymbol $kw80$TICKETS = SubLObjectFactory.makeKeyword("TICKETS");
    private static final SubLSymbol $kw81$MAILMAN = SubLObjectFactory.makeKeyword("MAILMAN");
    private static final SubLString $str82$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
    private static final SubLSymbol $kw83$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
    private static final SubLSymbol $sym84$MAKE_SQL_CONNECTION = SubLObjectFactory.makeSymbol("MAKE-SQL-CONNECTION");
    private static final SubLSymbol $kw85$SLOT = SubLObjectFactory.makeKeyword("SLOT");
    private static final SubLSymbol $kw86$END = SubLObjectFactory.makeKeyword("END");
    private static final SubLSymbol $sym87$VISIT_DEFSTRUCT_OBJECT_SQL_CONNECTION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-CONNECTION-METHOD");
    private static final SubLString $str88$__SQL_CONNECTION_ = SubLObjectFactory.makeString("#<SQL-CONNECTION ");
    private static final SubLString $str89$closed_ = SubLObjectFactory.makeString("closed ");
    private static final SubLString $str90$to_ = SubLObjectFactory.makeString("to ");
    private static final SubLString $str91$__ = SubLObjectFactory.makeString(" [");
    private static final SubLString $str92$_ = SubLObjectFactory.makeString("/");
    private static final SubLString $str93$__ = SubLObjectFactory.makeString("]>");
    private static final SubLList $list94 = ConsesLow.list(SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list(SubLObjectFactory.makeSymbol("DBMS-SERVER"), SubLObjectFactory.makeSymbol("*DBMS-SERVER*")), SubLObjectFactory.makeSymbol("DBMS-PORT"), ConsesLow.list(SubLObjectFactory.makeSymbol("SUBPROTOCOL"), SubLObjectFactory.makeSymbol("*SQL-SUBPROTOCOL*")), ConsesLow.list(SubLObjectFactory.makeSymbol("PROXY-SERVER"), SubLObjectFactory.makeSymbol("DBMS-SERVER")), ConsesLow.list(SubLObjectFactory.makeSymbol("PORT"), SubLObjectFactory.makeSymbol("*SQL-PORT*")), ConsesLow.list(SubLObjectFactory.makeSymbol("TIMEOUT"), SubLObjectFactory.makeSymbol("*SQL-CONNECTION-TIMEOUT*")));
    private static final SubLList $list95 = ConsesLow.list(SubLObjectFactory.makeKeyword("DBMS-SERVER"), SubLObjectFactory.makeKeyword("DBMS-PORT"), SubLObjectFactory.makeKeyword("SUBPROTOCOL"), SubLObjectFactory.makeKeyword("PROXY-SERVER"), SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeKeyword("TIMEOUT"));
    private static final SubLSymbol $kw96$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
    private static final SubLSymbol $kw97$DBMS_PORT = SubLObjectFactory.makeKeyword("DBMS-PORT");
    private static final SubLSymbol $kw98$TIMEOUT = SubLObjectFactory.makeKeyword("TIMEOUT");
    private static final SubLSymbol $sym99$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
    private static final SubLSymbol $sym100$NON_NEGATIVE_NUMBER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-NUMBER-P");
    private static final SubLString $str101$SQL_connection_lock = SubLObjectFactory.makeString("SQL connection lock");
    private static final SubLSymbol $kw102$RETURN = SubLObjectFactory.makeKeyword("RETURN");
    private static final SubLString $str103$Trying_to_open_from_a_null_sqlc_c = SubLObjectFactory.makeString("Trying to open from a null sqlc channel.");
    private static final SubLString $str104$timeout = SubLObjectFactory.makeString("timeout");
    private static final SubLSymbol $sym105$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
    private static final SubLSymbol $sym106$SQL_OPEN_CONNECTION_P = SubLObjectFactory.makeSymbol("SQL-OPEN-CONNECTION-P");
    private static final SubLSymbol $sym107$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
    private static final SubLSymbol $sym108$SQL_TRANSACTION_LEVEL_P = SubLObjectFactory.makeSymbol("SQL-TRANSACTION-LEVEL-P");
    private static final SubLSymbol $sym109$SQL_TICKET = SubLObjectFactory.makeSymbol("SQL-TICKET");
    private static final SubLSymbol $sym110$SQL_TICKET_P = SubLObjectFactory.makeSymbol("SQL-TICKET-P");
    private static final SubLList $list111 = ConsesLow.list(SubLObjectFactory.makeSymbol("SEMAPHORE"), SubLObjectFactory.makeSymbol("RESULT"));
    private static final SubLList $list112 = ConsesLow.list(SubLObjectFactory.makeKeyword("SEMAPHORE"), SubLObjectFactory.makeKeyword("RESULT"));
    private static final SubLList $list113 = ConsesLow.list(SubLObjectFactory.makeSymbol("SQL-TICKET-SEMAPHORE"), SubLObjectFactory.makeSymbol("SQL-TICKET-RESULT"));
    private static final SubLList $list114 = ConsesLow.list(SubLObjectFactory.makeSymbol("_CSETF-SQL-TICKET-SEMAPHORE"), SubLObjectFactory.makeSymbol("_CSETF-SQL-TICKET-RESULT"));
    private static final SubLSymbol $sym115$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
    private static final SubLSymbol $sym116$SQL_TICKET_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-TICKET-PRINT-FUNCTION-TRAMPOLINE");
    private static final SubLList $list117 = ConsesLow.list(SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), SubLObjectFactory.makeSymbol("SQL-TICKET-P"));
    private static final SubLSymbol $sym118$SQL_TICKET_SEMAPHORE = SubLObjectFactory.makeSymbol("SQL-TICKET-SEMAPHORE");
    private static final SubLSymbol $sym119$_CSETF_SQL_TICKET_SEMAPHORE = SubLObjectFactory.makeSymbol("_CSETF-SQL-TICKET-SEMAPHORE");
    private static final SubLSymbol $sym120$SQL_TICKET_RESULT = SubLObjectFactory.makeSymbol("SQL-TICKET-RESULT");
    private static final SubLSymbol $sym121$_CSETF_SQL_TICKET_RESULT = SubLObjectFactory.makeSymbol("_CSETF-SQL-TICKET-RESULT");
    private static final SubLSymbol $kw122$SEMAPHORE = SubLObjectFactory.makeKeyword("SEMAPHORE");
    private static final SubLSymbol $kw123$RESULT = SubLObjectFactory.makeKeyword("RESULT");
    private static final SubLSymbol $sym124$MAKE_SQL_TICKET = SubLObjectFactory.makeSymbol("MAKE-SQL-TICKET");
    private static final SubLSymbol $sym125$VISIT_DEFSTRUCT_OBJECT_SQL_TICKET_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-TICKET-METHOD");
    private static final SubLString $str126$SQL_Request = SubLObjectFactory.makeString("SQL Request");
    private static final SubLInteger $int127$212 = SubLObjectFactory.makeInteger(212);
    private static final SubLString $str128$Timed_out_after_ = SubLObjectFactory.makeString("Timed out after ");
    private static final SubLString $str129$_seconds_retrieving_SQL_ticket = SubLObjectFactory.makeString(" seconds retrieving SQL ticket");
    private static final SubLString $str130$SQL_Mailman_for_ = SubLObjectFactory.makeString("SQL Mailman for ");
    private static final SubLSymbol $sym131$SQLC_DELIVER = SubLObjectFactory.makeSymbol("SQLC-DELIVER");
    private static final SubLString $str132$Implementation_error__no_ticket_f = SubLObjectFactory.makeString("Implementation error: no ticket for result ~a");
    private static final SubLString $str133$Trying_to_read_from_a_null_sqlc_c = SubLObjectFactory.makeString("Trying to read from a null sqlc channel.");
    private static final SubLSymbol $kw134$THROW = SubLObjectFactory.makeKeyword("THROW");
    private static final SubLSymbol $kw135$WARN = SubLObjectFactory.makeKeyword("WARN");
    private static final SubLSymbol $sym136$SDBC_ERROR_HANDLING_TAG_P = SubLObjectFactory.makeSymbol("SDBC-ERROR-HANDLING-TAG-P");
    private static final SubLList $list137 = ConsesLow.list(SubLObjectFactory.makeKeyword("TRANSACTION-NONE"), SubLObjectFactory.makeKeyword("TRANSACTION-READ-COMMITTED"), SubLObjectFactory.makeKeyword("TRANSACTION-READ-UNCOMMITTED"), SubLObjectFactory.makeKeyword("TRANSACTION-REPEATABLE-READ"), SubLObjectFactory.makeKeyword("TRANSACTION-SERIALIZABLE"));
    private static final SubLSymbol $sym138$SQLC_SET_ERROR_HANDLING = SubLObjectFactory.makeSymbol("SQLC-SET-ERROR-HANDLING");
    private static final SubLSymbol $sym139$SQLS_EXECUTE_TRANSACTION = SubLObjectFactory.makeSymbol("SQLS-EXECUTE-TRANSACTION");
    private static final SubLSymbol $kw140$STOP = SubLObjectFactory.makeKeyword("STOP");
    private static final SubLSymbol $kw141$NULL = SubLObjectFactory.makeKeyword("NULL");
    private static final SubLSymbol $sym142$SDBC_ERROR = SubLObjectFactory.makeSymbol("SDBC-ERROR");
    private static final SubLSymbol $sym143$SDBC_ERROR_P = SubLObjectFactory.makeSymbol("SDBC-ERROR-P");
    private static final SubLList $list144 = ConsesLow.list(SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("MESSAGE"), SubLObjectFactory.makeSymbol("CODE"));
    private static final SubLList $list145 = ConsesLow.list(SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("MESSAGE"), SubLObjectFactory.makeKeyword("CODE"));
    private static final SubLList $list146 = ConsesLow.list(SubLObjectFactory.makeSymbol("SDBC-ERROR-TYPE"), SubLObjectFactory.makeSymbol("SDBC-ERROR-MESSAGE"), SubLObjectFactory.makeSymbol("SDBC-ERROR-CODE"));
    private static final SubLList $list147 = ConsesLow.list(SubLObjectFactory.makeSymbol("_CSETF-SDBC-ERROR-TYPE"), SubLObjectFactory.makeSymbol("_CSETF-SDBC-ERROR-MESSAGE"), SubLObjectFactory.makeSymbol("_CSETF-SDBC-ERROR-CODE"));
    private static final SubLSymbol $sym148$SDBC_ERROR_PRINT = SubLObjectFactory.makeSymbol("SDBC-ERROR-PRINT");
    private static final SubLSymbol $sym149$SDBC_ERROR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SDBC-ERROR-PRINT-FUNCTION-TRAMPOLINE");
    private static final SubLList $list150 = ConsesLow.list(SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), SubLObjectFactory.makeSymbol("SDBC-ERROR-P"));
    private static final SubLSymbol $sym151$SDBC_ERROR_TYPE = SubLObjectFactory.makeSymbol("SDBC-ERROR-TYPE");
    private static final SubLSymbol $sym152$_CSETF_SDBC_ERROR_TYPE = SubLObjectFactory.makeSymbol("_CSETF-SDBC-ERROR-TYPE");
    private static final SubLSymbol $sym153$SDBC_ERROR_MESSAGE = SubLObjectFactory.makeSymbol("SDBC-ERROR-MESSAGE");
    private static final SubLSymbol $sym154$_CSETF_SDBC_ERROR_MESSAGE = SubLObjectFactory.makeSymbol("_CSETF-SDBC-ERROR-MESSAGE");
    private static final SubLSymbol $sym155$SDBC_ERROR_CODE = SubLObjectFactory.makeSymbol("SDBC-ERROR-CODE");
    private static final SubLSymbol $sym156$_CSETF_SDBC_ERROR_CODE = SubLObjectFactory.makeSymbol("_CSETF-SDBC-ERROR-CODE");
    private static final SubLSymbol $kw157$TYPE = SubLObjectFactory.makeKeyword("TYPE");
    private static final SubLSymbol $kw158$MESSAGE = SubLObjectFactory.makeKeyword("MESSAGE");
    private static final SubLSymbol $kw159$CODE = SubLObjectFactory.makeKeyword("CODE");
    private static final SubLSymbol $sym160$MAKE_SDBC_ERROR = SubLObjectFactory.makeSymbol("MAKE-SDBC-ERROR");
    private static final SubLSymbol $sym161$VISIT_DEFSTRUCT_OBJECT_SDBC_ERROR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SDBC-ERROR-METHOD");
    private static final SubLString $str162$_a = SubLObjectFactory.makeString("~a");
    private static final SubLString $str163$SDBC__a___a = SubLObjectFactory.makeString("SDBC ~a: ~a");
    private static final SubLString $str164$__SDBC = SubLObjectFactory.makeString("#<SDBC");
    private static final SubLString $str165$_ERROR__ = SubLObjectFactory.makeString("-ERROR: ");
    private static final SubLString $str166$_ = SubLObjectFactory.makeString(">");
    private static final SubLString $str167$_IO = SubLObjectFactory.makeString("-IO");
    private static final SubLString $str168$_SQL = SubLObjectFactory.makeString("-SQL");
    private static final SubLString $str169$ = SubLObjectFactory.makeString("");
    private static final SubLString $str170$_CLIENT = SubLObjectFactory.makeString("-CLIENT");
    private static final SubLString $str171$_TRANSACTION = SubLObjectFactory.makeString("-TRANSACTION");
    private static final SubLString $str172$_ROLLBACK = SubLObjectFactory.makeString("-ROLLBACK");
    private static final SubLString $str173$_BATCH_UPDATE = SubLObjectFactory.makeString("-BATCH-UPDATE");
    private static final SubLSymbol $sym174$SQL_RESULT_SET = SubLObjectFactory.makeSymbol("SQL-RESULT-SET");
    private static final SubLSymbol $sym175$SQL_RESULT_SET_P = SubLObjectFactory.makeSymbol("SQL-RESULT-SET-P");
    private static final SubLList $list176 = ConsesLow.list(SubLObjectFactory.makeSymbol("ROWS"), SubLObjectFactory.makeSymbol("CURRENT"), SubLObjectFactory.makeSymbol("LAST"), SubLObjectFactory.makeSymbol("START"), SubLObjectFactory.makeSymbol("CONNECTION"), SubLObjectFactory.makeSymbol("BLOCK-SIZE"), SubLObjectFactory.makeSymbol("ID"));
    private static final SubLList $list177 = ConsesLow.list(SubLObjectFactory.makeKeyword("ROWS"), SubLObjectFactory.makeKeyword("CURRENT"), SubLObjectFactory.makeKeyword("LAST"), SubLObjectFactory.makeKeyword("START"), SubLObjectFactory.makeKeyword("CONNECTION"), SubLObjectFactory.makeKeyword("BLOCK-SIZE"), SubLObjectFactory.makeKeyword("ID"));
    private static final SubLList $list178 = ConsesLow.list(SubLObjectFactory.makeSymbol("SQLRS-ROWS"), SubLObjectFactory.makeSymbol("SQLRS-CURRENT"), SubLObjectFactory.makeSymbol("SQLRS-LAST"), SubLObjectFactory.makeSymbol("SQLRS-START"), SubLObjectFactory.makeSymbol("SQLRS-CONNECTION"), SubLObjectFactory.makeSymbol("SQLRS-BLOCK-SIZE"), SubLObjectFactory.makeSymbol("SQLRS-ID"));
    private static final SubLList $list179 = ConsesLow.list(SubLObjectFactory.makeSymbol("_CSETF-SQLRS-ROWS"), SubLObjectFactory.makeSymbol("_CSETF-SQLRS-CURRENT"), SubLObjectFactory.makeSymbol("_CSETF-SQLRS-LAST"), SubLObjectFactory.makeSymbol("_CSETF-SQLRS-START"), SubLObjectFactory.makeSymbol("_CSETF-SQLRS-CONNECTION"), SubLObjectFactory.makeSymbol("_CSETF-SQLRS-BLOCK-SIZE"), SubLObjectFactory.makeSymbol("_CSETF-SQLRS-ID"));
    private static final SubLSymbol $sym180$SQLRS_PRINT = SubLObjectFactory.makeSymbol("SQLRS-PRINT");
    private static final SubLSymbol $sym181$SQL_RESULT_SET_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-RESULT-SET-PRINT-FUNCTION-TRAMPOLINE");
    private static final SubLList $list182 = ConsesLow.list(SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), SubLObjectFactory.makeSymbol("SQL-RESULT-SET-P"));
    private static final SubLSymbol $sym183$SQLRS_ROWS = SubLObjectFactory.makeSymbol("SQLRS-ROWS");
    private static final SubLSymbol $sym184$_CSETF_SQLRS_ROWS = SubLObjectFactory.makeSymbol("_CSETF-SQLRS-ROWS");
    private static final SubLSymbol $sym185$SQLRS_CURRENT = SubLObjectFactory.makeSymbol("SQLRS-CURRENT");
    private static final SubLSymbol $sym186$_CSETF_SQLRS_CURRENT = SubLObjectFactory.makeSymbol("_CSETF-SQLRS-CURRENT");
    private static final SubLSymbol $sym187$SQLRS_LAST = SubLObjectFactory.makeSymbol("SQLRS-LAST");
    private static final SubLSymbol $sym188$_CSETF_SQLRS_LAST = SubLObjectFactory.makeSymbol("_CSETF-SQLRS-LAST");
    private static final SubLSymbol $sym189$SQLRS_START = SubLObjectFactory.makeSymbol("SQLRS-START");
    private static final SubLSymbol $sym190$_CSETF_SQLRS_START = SubLObjectFactory.makeSymbol("_CSETF-SQLRS-START");
    private static final SubLSymbol $sym191$SQLRS_CONNECTION = SubLObjectFactory.makeSymbol("SQLRS-CONNECTION");
    private static final SubLSymbol $sym192$_CSETF_SQLRS_CONNECTION = SubLObjectFactory.makeSymbol("_CSETF-SQLRS-CONNECTION");
    private static final SubLSymbol $sym193$SQLRS_BLOCK_SIZE = SubLObjectFactory.makeSymbol("SQLRS-BLOCK-SIZE");
    private static final SubLSymbol $sym194$_CSETF_SQLRS_BLOCK_SIZE = SubLObjectFactory.makeSymbol("_CSETF-SQLRS-BLOCK-SIZE");
    private static final SubLSymbol $sym195$SQLRS_ID = SubLObjectFactory.makeSymbol("SQLRS-ID");
    private static final SubLSymbol $sym196$_CSETF_SQLRS_ID = SubLObjectFactory.makeSymbol("_CSETF-SQLRS-ID");
    private static final SubLSymbol $kw197$ROWS = SubLObjectFactory.makeKeyword("ROWS");
    private static final SubLSymbol $kw198$CURRENT = SubLObjectFactory.makeKeyword("CURRENT");
    private static final SubLSymbol $kw199$LAST = SubLObjectFactory.makeKeyword("LAST");
    private static final SubLSymbol $kw200$START = SubLObjectFactory.makeKeyword("START");
    private static final SubLSymbol $kw201$CONNECTION = SubLObjectFactory.makeKeyword("CONNECTION");
    private static final SubLSymbol $kw202$BLOCK_SIZE = SubLObjectFactory.makeKeyword("BLOCK-SIZE");
    private static final SubLSymbol $kw203$ID = SubLObjectFactory.makeKeyword("ID");
    private static final SubLSymbol $sym204$MAKE_SQL_RESULT_SET = SubLObjectFactory.makeSymbol("MAKE-SQL-RESULT-SET");
    private static final SubLSymbol $sym205$VISIT_DEFSTRUCT_OBJECT_SQL_RESULT_SET_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-RESULT-SET-METHOD");
    private static final SubLString $str206$_ = SubLObjectFactory.makeString("(");
    private static final SubLString $str207$_row__ = SubLObjectFactory.makeString(" row, ");
    private static final SubLString $str208$_rows__ = SubLObjectFactory.makeString(" rows, ");
    private static final SubLString $str209$_column_ = SubLObjectFactory.makeString(" column)");
    private static final SubLString $str210$_columns_ = SubLObjectFactory.makeString(" columns)");
    private static final SubLString $str211$closed = SubLObjectFactory.makeString("closed");
    private static final SubLSymbol $sym212$SQL_OPEN_RESULT_SET_P = SubLObjectFactory.makeSymbol("SQL-OPEN-RESULT-SET-P");
    private static final SubLString $str213$cursor_not_on_valid_row = SubLObjectFactory.makeString("cursor not on valid row");
    private static final SubLString $str214$invalid_column__a = SubLObjectFactory.makeString("invalid column ~a");
    private static final SubLSymbol $sym215$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
    private static final SubLSymbol $sym216$VECTORP = SubLObjectFactory.makeSymbol("VECTORP");
    private static final SubLString $str217$invalid_row__a = SubLObjectFactory.makeString("invalid row ~a");
    private static final SubLSymbol $sym218$SQL_STATEMENT = SubLObjectFactory.makeSymbol("SQL-STATEMENT");
    private static final SubLSymbol $sym219$SQL_STATEMENT_P = SubLObjectFactory.makeSymbol("SQL-STATEMENT-P");
    private static final SubLList $list220 = ConsesLow.list(SubLObjectFactory.makeSymbol("CONNECTION"), SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("SQL"), SubLObjectFactory.makeSymbol("SETTINGS"), SubLObjectFactory.makeSymbol("BATCH"), SubLObjectFactory.makeSymbol("RS"));
    private static final SubLList $list221 = ConsesLow.list(SubLObjectFactory.makeKeyword("CONNECTION"), SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("SQL"), SubLObjectFactory.makeKeyword("SETTINGS"), SubLObjectFactory.makeKeyword("BATCH"), SubLObjectFactory.makeKeyword("RS"));
    private static final SubLList $list222 = ConsesLow.list(SubLObjectFactory.makeSymbol("SQLS-CONNECTION"), SubLObjectFactory.makeSymbol("SQLS-ID"), SubLObjectFactory.makeSymbol("SQLS-SQL"), SubLObjectFactory.makeSymbol("SQLS-SETTINGS"), SubLObjectFactory.makeSymbol("SQLS-BATCH"), SubLObjectFactory.makeSymbol("SQLS-RS"));
    private static final SubLList $list223 = ConsesLow.list(SubLObjectFactory.makeSymbol("_CSETF-SQLS-CONNECTION"), SubLObjectFactory.makeSymbol("_CSETF-SQLS-ID"), SubLObjectFactory.makeSymbol("_CSETF-SQLS-SQL"), SubLObjectFactory.makeSymbol("_CSETF-SQLS-SETTINGS"), SubLObjectFactory.makeSymbol("_CSETF-SQLS-BATCH"), SubLObjectFactory.makeSymbol("_CSETF-SQLS-RS"));
    private static final SubLSymbol $sym224$SQL_STATEMENT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SQL-STATEMENT-PRINT-FUNCTION-TRAMPOLINE");
    private static final SubLList $list225 = ConsesLow.list(SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), SubLObjectFactory.makeSymbol("SQL-STATEMENT-P"));
    private static final SubLSymbol $sym226$SQLS_CONNECTION = SubLObjectFactory.makeSymbol("SQLS-CONNECTION");
    private static final SubLSymbol $sym227$_CSETF_SQLS_CONNECTION = SubLObjectFactory.makeSymbol("_CSETF-SQLS-CONNECTION");
    private static final SubLSymbol $sym228$SQLS_ID = SubLObjectFactory.makeSymbol("SQLS-ID");
    private static final SubLSymbol $sym229$_CSETF_SQLS_ID = SubLObjectFactory.makeSymbol("_CSETF-SQLS-ID");
    private static final SubLSymbol $sym230$SQLS_SQL = SubLObjectFactory.makeSymbol("SQLS-SQL");
    private static final SubLSymbol $sym231$_CSETF_SQLS_SQL = SubLObjectFactory.makeSymbol("_CSETF-SQLS-SQL");
    private static final SubLSymbol $sym232$SQLS_SETTINGS = SubLObjectFactory.makeSymbol("SQLS-SETTINGS");
    private static final SubLSymbol $sym233$_CSETF_SQLS_SETTINGS = SubLObjectFactory.makeSymbol("_CSETF-SQLS-SETTINGS");
    private static final SubLSymbol $sym234$SQLS_BATCH = SubLObjectFactory.makeSymbol("SQLS-BATCH");
    private static final SubLSymbol $sym235$_CSETF_SQLS_BATCH = SubLObjectFactory.makeSymbol("_CSETF-SQLS-BATCH");
    private static final SubLSymbol $sym236$SQLS_RS = SubLObjectFactory.makeSymbol("SQLS-RS");
    private static final SubLSymbol $sym237$_CSETF_SQLS_RS = SubLObjectFactory.makeSymbol("_CSETF-SQLS-RS");
    private static final SubLSymbol $kw238$SQL = SubLObjectFactory.makeKeyword("SQL");
    private static final SubLSymbol $kw239$SETTINGS = SubLObjectFactory.makeKeyword("SETTINGS");
    private static final SubLSymbol $kw240$BATCH = SubLObjectFactory.makeKeyword("BATCH");
    private static final SubLSymbol $kw241$RS = SubLObjectFactory.makeKeyword("RS");
    private static final SubLSymbol $sym242$MAKE_SQL_STATEMENT = SubLObjectFactory.makeSymbol("MAKE-SQL-STATEMENT");
    private static final SubLSymbol $sym243$VISIT_DEFSTRUCT_OBJECT_SQL_STATEMENT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-STATEMENT-METHOD");
    private static final SubLSymbol $sym244$SQL_OPEN_STATEMENT_P = SubLObjectFactory.makeSymbol("SQL-OPEN-STATEMENT-P");
    private static final SubLSymbol $sym245$SQL_PREPARED_OPEN_STATEMENT_P = SubLObjectFactory.makeSymbol("SQL-PREPARED-OPEN-STATEMENT-P");
    private static final SubLSymbol $sym246$BYTE_VECTOR_P = SubLObjectFactory.makeSymbol("BYTE-VECTOR-P");
    private static final SubLSymbol $sym247$JAVA_INTEGERP = SubLObjectFactory.makeSymbol("JAVA-INTEGERP");
    private static final SubLSymbol $sym248$JAVA_LONGP = SubLObjectFactory.makeSymbol("JAVA-LONGP");
    private static final SubLSymbol $sym249$JAVA_FLOATP = SubLObjectFactory.makeSymbol("JAVA-FLOATP");
    private static final SubLSymbol $sym250$JAVA_DOUBLEP = SubLObjectFactory.makeSymbol("JAVA-DOUBLEP");
    private static final SubLSymbol $sym251$SQLS_GET_CONNECTION = SubLObjectFactory.makeSymbol("SQLS-GET-CONNECTION");
    private static final SubLString $str252$STMT = SubLObjectFactory.makeString("STMT");
    private static final SubLString $str253$RS = SubLObjectFactory.makeString("RS");
    private static final SubLSymbol $sym254$LISTP = SubLObjectFactory.makeSymbol("LISTP");
    private static final SubLSymbol $sym255$SQLC_GET_TABLES = SubLObjectFactory.makeSymbol("SQLC-GET-TABLES");
    private static final SubLString $str256$SQLC_error___A = SubLObjectFactory.makeString("SQLC error: ~A");
    private static final SubLList $list257 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeKeyword("TABLE-CAT"), SubLObjectFactory.makeKeyword("TABLE-SCHEM"), SubLObjectFactory.makeKeyword("TABLE-NAME"), SubLObjectFactory.makeKeyword("TABLE-TYPE"), SubLObjectFactory.makeKeyword("REMARKS"), SubLObjectFactory.makeKeyword("TYPE-CAT"), SubLObjectFactory.makeKeyword("TYPE-SCHEM"), SubLObjectFactory.makeKeyword("TYPE-NAME"), SubLObjectFactory.makeKeyword("SELF-REFERENCING-COL-NAME"), SubLObjectFactory.makeKeyword("REF-GENERATION")
    });
    private static final SubLSymbol $sym258$SQLC_GET_COLUMNS = SubLObjectFactory.makeSymbol("SQLC-GET-COLUMNS");
    private static final SubLList $list259 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeKeyword("TABLE-CAT"), SubLObjectFactory.makeKeyword("TABLE-SCHEM"), SubLObjectFactory.makeKeyword("TABLE-NAME"), SubLObjectFactory.makeKeyword("COLUMN-NAME"), SubLObjectFactory.makeKeyword("DATA-TYPE"), SubLObjectFactory.makeKeyword("TYPE-NAME"), SubLObjectFactory.makeKeyword("COLUMN-SIZE"), SubLObjectFactory.makeKeyword("BUFFER-LENGTH"), SubLObjectFactory.makeKeyword("DECIMAL-DIGITS"), SubLObjectFactory.makeKeyword("NUM-PREC-RADIX"),
        SubLObjectFactory.makeKeyword("NULLABLE"), SubLObjectFactory.makeKeyword("REMARKS"), SubLObjectFactory.makeKeyword("COLUMN-DEF"), SubLObjectFactory.makeKeyword("SQL-DATA-TYPE"), SubLObjectFactory.makeKeyword("SQL-DATETIME-SUB"), SubLObjectFactory.makeKeyword("CHAR-OCTET-LENGTH"), SubLObjectFactory.makeKeyword("ORDINAL-POSITION"), SubLObjectFactory.makeKeyword("IS-NULLABLE"), SubLObjectFactory.makeKeyword("SCOPE-CATLOG"), SubLObjectFactory.makeKeyword("SCOPE-SCHEMA"),
        SubLObjectFactory.makeKeyword("SCOPE-TABLE"), SubLObjectFactory.makeKeyword("SOURCE-DATA-TYPE")
    });
    private static final SubLSymbol $sym260$SQLC_GET_PRIMARY_KEYS = SubLObjectFactory.makeSymbol("SQLC-GET-PRIMARY-KEYS");
    private static final SubLList $list261 = ConsesLow.list(SubLObjectFactory.makeKeyword("TABLE-CAT"), SubLObjectFactory.makeKeyword("TABLE-SCHEM"), SubLObjectFactory.makeKeyword("TABLE-NAME"), SubLObjectFactory.makeKeyword("COLUMN-NAME"), SubLObjectFactory.makeKeyword("KEY-SEQ"), SubLObjectFactory.makeKeyword("PK-NAME"));
    private static final SubLSymbol $sym262$SQLC_GET_IMPORTED_KEYS = SubLObjectFactory.makeSymbol("SQLC-GET-IMPORTED-KEYS");
    private static final SubLList $list263 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeKeyword("PKTABLE-CAT"), SubLObjectFactory.makeKeyword("PKTABLE-SCHEM"), SubLObjectFactory.makeKeyword("PKTABLE-NAME"), SubLObjectFactory.makeKeyword("PKCOLUMN-NAME"), SubLObjectFactory.makeKeyword("FKTABLE-CAT"), SubLObjectFactory.makeKeyword("FKTABLE-SCHEM"), SubLObjectFactory.makeKeyword("FKTABLE-NAME"), SubLObjectFactory.makeKeyword("FKCOLUMN-NAME"), SubLObjectFactory.makeKeyword("KEY-SEQ"), SubLObjectFactory.makeKeyword("UPDATE-RULE"),
        SubLObjectFactory.makeKeyword("DELETE-RULE"), SubLObjectFactory.makeKeyword("FK-NAME"), SubLObjectFactory.makeKeyword("PK-NAME"), SubLObjectFactory.makeKeyword("DEFERRABILITY")
    });
    private static final SubLSymbol $sym264$SQLC_GET_EXPORTED_KEYS = SubLObjectFactory.makeSymbol("SQLC-GET-EXPORTED-KEYS");
    private static final SubLSymbol $sym265$SQLC_GET_INDEX_INFO = SubLObjectFactory.makeSymbol("SQLC-GET-INDEX-INFO");
    private static final SubLList $list266 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeKeyword("TABLE-CAT"), SubLObjectFactory.makeKeyword("TABLE-SCHEM"), SubLObjectFactory.makeKeyword("TABLE-NAME"), SubLObjectFactory.makeKeyword("NON-UNIQUE"), SubLObjectFactory.makeKeyword("INDEX-QUALIFIER"), SubLObjectFactory.makeKeyword("INDEX-NAME"), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("ORDINAL-POSITION"), SubLObjectFactory.makeKeyword("COLUMN-NAME"), SubLObjectFactory.makeKeyword("ASC-OR-DESC"),
        SubLObjectFactory.makeKeyword("CARDINALITY"), SubLObjectFactory.makeKeyword("PAGES"), SubLObjectFactory.makeKeyword("FILTER-CONDITION")
    });
    private static final SubLList $list267 = ConsesLow.list(SubLObjectFactory.makeKeyword("RETURN"), SubLObjectFactory.makeKeyword("THROW"), SubLObjectFactory.makeKeyword("WARN"));
    private static final SubLString $str268$com_cyc_ = SubLObjectFactory.makeString("com.cyc.");
    private static final SubLString $str269$_a__a__a = SubLObjectFactory.makeString("~a:~a:~a");
    private static final SubLSymbol $kw270$SUB_PROTOCOL = SubLObjectFactory.makeKeyword("SUB-PROTOCOL");
    private static final SubLSymbol $kw271$DATABASE = SubLObjectFactory.makeKeyword("DATABASE");
    private static final SubLSymbol $kw272$PASSWORD = SubLObjectFactory.makeKeyword("PASSWORD");
    private static final SubLSymbol $sym273$NEW_DB_URL = SubLObjectFactory.makeSymbol("NEW-DB-URL");
    private static final SubLSymbol $kw274$TEST = SubLObjectFactory.makeKeyword("TEST");
    private static final SubLSymbol $sym275$STRING_ = SubLObjectFactory.makeSymbol("STRING=");
    private static final SubLSymbol $kw276$OWNER = SubLObjectFactory.makeKeyword("OWNER");
    private static final SubLSymbol $kw277$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
    private static final SubLSymbol $kw278$KB = SubLObjectFactory.makeKeyword("KB");
    private static final SubLSymbol $kw279$TINY = SubLObjectFactory.makeKeyword("TINY");
    private static final SubLSymbol $kw280$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
    private static final SubLList $list281;
    private static final SubLSymbol $sym282$_SDBC_DATABASE_CONNECTION_URL_DESCRIPTIONS_ = SubLObjectFactory.makeSymbol("*SDBC-DATABASE-CONNECTION-URL-DESCRIPTIONS*");
    private static final SubLSymbol $sym283$CONSP = SubLObjectFactory.makeSymbol("CONSP");
    private static final SubLSymbol $sym284$PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("PROPERTY-LIST-P");
    private static final SubLSymbol $kw285$DEFAULTS = SubLObjectFactory.makeKeyword("DEFAULTS");
    private static final SubLSymbol $kw286$PATTERN = SubLObjectFactory.makeKeyword("PATTERN");
    private static final SubLSymbol $kw287$OPTION_PUNCTUATION = SubLObjectFactory.makeKeyword("OPTION-PUNCTUATION");
    private static final SubLSymbol $kw288$OPTION_NAMES = SubLObjectFactory.makeKeyword("OPTION-NAMES");
    private static final SubLSymbol $sym289$GET_ALL_SDBC_DATABASE_SUB_PROTOCOLS = SubLObjectFactory.makeSymbol("GET-ALL-SDBC-DATABASE-SUB-PROTOCOLS");
    private static final SubLSymbol $kw290$UNDEFINED = SubLObjectFactory.makeKeyword("UNDEFINED");
    private static final SubLSymbol $kw291$TERMINATOR = SubLObjectFactory.makeKeyword("TERMINATOR");
    private static final SubLSymbol $kw292$SEPARATOR = SubLObjectFactory.makeKeyword("SEPARATOR");
    private static final SubLString $str293$Separator_must_be_defined_as_stri = SubLObjectFactory.makeString("Separator must be defined as string, not ~A.");
    private static final SubLSymbol $kw294$VALUE = SubLObjectFactory.makeKeyword("VALUE");
    private static final SubLString $str295$Value_demarcator_must_be_specifie = SubLObjectFactory.makeString("Value demarcator must be specified as string, not ~A.");
    private static final SubLList $list296 = ConsesLow.list(SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("SUB-PROTOCOL"), SubLObjectFactory.makeSymbol("PATTERN"), ConsesLow.list(SubLObjectFactory.makeSymbol("OPTION-NAMES")), ConsesLow.list(SubLObjectFactory.makeSymbol("OPTION-PUNCTUATION")), SubLObjectFactory.makeSymbol("DEFAULTS"));
    private static final SubLList $list297 = ConsesLow.list(SubLObjectFactory.makeKeyword("SUB-PROTOCOL"), SubLObjectFactory.makeKeyword("PATTERN"), SubLObjectFactory.makeKeyword("OPTION-NAMES"), SubLObjectFactory.makeKeyword("OPTION-PUNCTUATION"), SubLObjectFactory.makeKeyword("DEFAULTS"));
    private static final SubLSymbol $sym298$ADD_SDBC_DATABASE_CONNECTION_URL_DESCRIPTION = SubLObjectFactory.makeSymbol("ADD-SDBC-DATABASE-CONNECTION-URL-DESCRIPTION");
    private static final SubLList $list299 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeKeyword("PROTOCOL"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeKeyword("SUB-PROTOCOL"), SubLObjectFactory.makeString("://"), SubLObjectFactory.makeKeyword("DBMS-SERVER"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeString("/"), SubLObjectFactory.makeKeyword("DATABASE")
    });
    private static final SubLList $list300 = ConsesLow.list(SubLObjectFactory.makeKeyword("USER"), SubLObjectFactory.makeString("user"), SubLObjectFactory.makeKeyword("PASSWORD"), SubLObjectFactory.makeString("password"), SubLObjectFactory.makeKeyword("CHAR-SET"), SubLObjectFactory.makeString("charSet"));
    private static final SubLList $list301 = ConsesLow.list(SubLObjectFactory.makeKeyword("START"), SubLObjectFactory.makeString("?"), SubLObjectFactory.makeKeyword("SEPARATOR"), SubLObjectFactory.makeString("&"), SubLObjectFactory.makeKeyword("VALUE"), SubLObjectFactory.makeString("="));
    private static final SubLList $list302 = ConsesLow.list(SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeInteger(5432), SubLObjectFactory.makeKeyword("CHAR-SET"), SubLObjectFactory.makeString("ASCII"));
    private static final SubLString $str303$mysql = SubLObjectFactory.makeString("mysql");
    private static final SubLList $list304 = ConsesLow.list(SubLObjectFactory.makeKeyword("USER"), SubLObjectFactory.makeString("user"), SubLObjectFactory.makeKeyword("PASSWORD"), SubLObjectFactory.makeString("password"));
    private static final SubLList $list305 = ConsesLow.list(SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeInteger(3306));
    private static final SubLString $str306$oracle = SubLObjectFactory.makeString("oracle");
    private static final SubLList $list307 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeKeyword("PROTOCOL"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeKeyword("SUB-PROTOCOL"), SubLObjectFactory.makeString(":thin:"), SubLObjectFactory.makeKeyword("USER"), SubLObjectFactory.makeString("/"), SubLObjectFactory.makeKeyword("PASSWORD"), SubLObjectFactory.makeString("@//"), SubLObjectFactory.makeKeyword("DBMS-SERVER"), SubLObjectFactory.makeString(":"),
        SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeString("/"), SubLObjectFactory.makeKeyword("DATABASE")
    });
    private static final SubLList $list308 = ConsesLow.list(SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeInteger(1521));
    private static final SubLString $str309$sqlserver = SubLObjectFactory.makeString("sqlserver");
    private static final SubLList $list310 = ConsesLow.list(SubLObjectFactory.makeKeyword("PROTOCOL"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeKeyword("SUB-PROTOCOL"), SubLObjectFactory.makeString("://"), SubLObjectFactory.makeKeyword("DBMS-SERVER"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeKeyword("PORT"));
    private static final SubLList $list311 = ConsesLow.list(SubLObjectFactory.makeKeyword("DATABASE"), SubLObjectFactory.makeString("DatabaseName"), SubLObjectFactory.makeKeyword("SELECT-METHOD"), SubLObjectFactory.makeString("SelectMethod"), SubLObjectFactory.makeKeyword("USER"), SubLObjectFactory.makeString("USER"), SubLObjectFactory.makeKeyword("PASSWORD"), SubLObjectFactory.makeString("PASSWORD"));
    private static final SubLList $list312 = ConsesLow.list(SubLObjectFactory.makeKeyword("START"), SubLObjectFactory.makeKeyword("SEPARATOR"), SubLObjectFactory.makeKeyword("SEPARATOR"), SubLObjectFactory.makeString(";"), SubLObjectFactory.makeKeyword("VALUE"), SubLObjectFactory.makeString("="));
    private static final SubLList $list313 = ConsesLow.list(SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeInteger(1433), SubLObjectFactory.makeKeyword("SELECT-METHOD"), SubLObjectFactory.makeString("cursor"));
    private static final SubLString $str314$microsoft_sqlserver = SubLObjectFactory.makeString("microsoft-sqlserver");
    private static final SubLList $list315 = ConsesLow.list(SubLObjectFactory.makeKeyword("PROTOCOL"), SubLObjectFactory.makeString(":microsoft:"), SubLObjectFactory.makeString("sqlserver"), SubLObjectFactory.makeString("://"), SubLObjectFactory.makeKeyword("DBMS-SERVER"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeKeyword("PORT"));
    private static final SubLString $str316$odbc = SubLObjectFactory.makeString("odbc");
    private static final SubLList $list317 = ConsesLow.list(SubLObjectFactory.makeKeyword("PROTOCOL"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeKeyword("SUB-PROTOCOL"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeKeyword("DATABASE"));
    private static final SubLList $list318 = ConsesLow.list(SubLObjectFactory.makeKeyword("USER"), SubLObjectFactory.makeString("UID"), SubLObjectFactory.makeKeyword("PASSWORD"), SubLObjectFactory.makeString("PWD"));
    private static final SubLString $str319$sybase = SubLObjectFactory.makeString("sybase");
    private static final SubLList $list320 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeKeyword("PROTOCOL"), SubLObjectFactory.makeString(":jtds:"), SubLObjectFactory.makeKeyword("SUB-PROTOCOL"), SubLObjectFactory.makeString("://"), SubLObjectFactory.makeKeyword("DBMS-SERVER"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeString("/"), SubLObjectFactory.makeKeyword("DATABASE")
    });
    private static final SubLList $list321 = ConsesLow.list(SubLObjectFactory.makeKeyword("USER"), SubLObjectFactory.makeString("USER"), SubLObjectFactory.makeKeyword("PASSWORD"), SubLObjectFactory.makeString("PASSWORD"));
    private static final SubLList $list322 = ConsesLow.list(SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeInteger(2048));
    private static final SubLString $str323$derby = SubLObjectFactory.makeString("derby");
    private static final SubLList $list324 = ConsesLow.list(SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeInteger(1527));
    private static final SubLString $str325$st = SubLObjectFactory.makeString("st");
    private static final SubLList $list326 = ConsesLow.list(SubLObjectFactory.makeKeyword("USER"), SubLObjectFactory.makeString("userName"), SubLObjectFactory.makeKeyword("PASSWORD"), SubLObjectFactory.makeString("passWord"), SubLObjectFactory.makeKeyword("FORMAT"), SubLObjectFactory.makeString("format"));
    private static final SubLList $list327 = ConsesLow.list(SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeInteger(8084), SubLObjectFactory.makeKeyword("FORMAT"), SubLObjectFactory.makeString("xhtml"));
    private static final SubLString $str328$poiseschema = SubLObjectFactory.makeString("poiseschema");
    private static final SubLList $list329 = ConsesLow.list(SubLObjectFactory.makeKeyword("PROTOCOL"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeKeyword("SUB-PROTOCOL"), SubLObjectFactory.makeString(":"));
    private static final SubLString $str330$poisedata = SubLObjectFactory.makeString("poisedata");
    private static final SubLSymbol $sym331$_SDBC_DB2_PORT_ = SubLObjectFactory.makeSymbol("*SDBC-DB2-PORT*");
    private static final SubLInteger $int332$50001 = SubLObjectFactory.makeInteger(50001);
    private static final SubLSymbol $sym333$SET_SDBC_DB2_PORT = SubLObjectFactory.makeSymbol("SET-SDBC-DB2-PORT");
    private static final SubLString $str334$db2 = SubLObjectFactory.makeString("db2");
    private static final SubLList $list335 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeKeyword("PROTOCOL"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeKeyword("SUB-PROTOCOL"), SubLObjectFactory.makeString("://"), SubLObjectFactory.makeKeyword("DBMS-SERVER"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeString("/"), ConsesLow.list(SubLObjectFactory.makeKeyword("UPCASE"), SubLObjectFactory.makeKeyword("DATABASE"))
    });
    private static final SubLList $list336 = ConsesLow.list(SubLObjectFactory.makeKeyword("START"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeKeyword("SEPARATOR"), SubLObjectFactory.makeString(";"), SubLObjectFactory.makeKeyword("VALUE"), SubLObjectFactory.makeString("="), SubLObjectFactory.makeKeyword("TERMINATOR"), SubLObjectFactory.makeString(";"));
    private static final SubLList $list337 = ConsesLow.list(SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeSymbol("*SDBC-DB2-PORT*"));
    private static final SubLSymbol $sym338$_SDBC_SYBASE_IQ_PORT_ = SubLObjectFactory.makeSymbol("*SDBC-SYBASE-IQ-PORT*");
    private static final SubLInteger $int339$2638 = SubLObjectFactory.makeInteger(2638);
    private static final SubLSymbol $sym340$SET_SDBC_SYBASE_IQ_PORT = SubLObjectFactory.makeSymbol("SET-SDBC-SYBASE-IQ-PORT");
    private static final SubLString $str341$sybase_iq = SubLObjectFactory.makeString("sybase-iq");
    private static final SubLList $list342 = ConsesLow.list(SubLObjectFactory.makeKeyword("PROTOCOL"), SubLObjectFactory.makeString(":sybase:Tds:"), SubLObjectFactory.makeKeyword("DBMS-SERVER"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeString("?ServiceName="), SubLObjectFactory.makeKeyword("DATABASE"));
    private static final SubLList $list343 = ConsesLow.list(SubLObjectFactory.makeKeyword("START"), SubLObjectFactory.makeKeyword("SEPARATOR"), SubLObjectFactory.makeKeyword("SEPARATOR"), SubLObjectFactory.makeString("&"), SubLObjectFactory.makeKeyword("VALUE"), SubLObjectFactory.makeString("="));
    private static final SubLList $list344 = ConsesLow.list(SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeSymbol("*SDBC-SYBASE-IQ-PORT*"));
    private static final SubLString $str345$unknown_jdbc_subprotocol___a = SubLObjectFactory.makeString("unknown jdbc subprotocol: ~a");
    private static final SubLSymbol $kw346$PROTOCOL = SubLObjectFactory.makeKeyword("PROTOCOL");
    private static final SubLSymbol $kw347$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
    private static final SubLList $list348 = ConsesLow.list(SubLObjectFactory.makeSymbol("FUNCTOR"), SubLObjectFactory.makeSymbol("ITEM"));
    private static final SubLSymbol $kw349$UPCASE = SubLObjectFactory.makeKeyword("UPCASE");
    private static final SubLString $str350$Functor__A_not_implemented_yet_ = SubLObjectFactory.makeString("Functor ~A not implemented yet.");
    private static final SubLString $str351$Pattern__S_contains__S__which_is_ = SubLObjectFactory.makeString("Pattern ~S contains ~S, which is neither STRINGP nor KEYWORDP");
    private static final SubLString $str352$Element__A_is_neither_a_STRINGP_n = SubLObjectFactory.makeString("Element ~A is neither a STRINGP nor a KEYWORD.");
    private static final SubLString $str353$No_value_provided_for__S_in_eithe = SubLObjectFactory.makeString("No value provided for ~S in either properties ~S or defaults ~S.");
    private static final SubLInteger $int354$_2147483649 = SubLObjectFactory.makeInteger("-2147483649");
    private static final SubLInteger $int355$2147483648 = SubLObjectFactory.makeInteger("2147483648");
    private static final SubLInteger $int356$_9223372036854775809 = SubLObjectFactory.makeInteger("-9223372036854775809");
    private static final SubLInteger $int357$9223372036854775808 = SubLObjectFactory.makeInteger("9223372036854775808");
    private static final SubLList $list358 = ConsesLow.list(ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeSymbol("CONNECTION"), SubLObjectFactory.makeSymbol("DB"), SubLObjectFactory.makeSymbol("USER"), SubLObjectFactory.makeSymbol("PASSWORD"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list(SubLObjectFactory.makeSymbol("DBMS-SERVER"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*DBMS-SERVER*"))), ConsesLow.list(SubLObjectFactory.makeSymbol("PORT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*SQL-PORT*"))), ConsesLow.list(SubLObjectFactory.makeSymbol("SUBPROTOCOL"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*SQL-SUBPROTOCOL*"))), ConsesLow.list(SubLObjectFactory.makeSymbol("PROXY-SERVER"), SubLObjectFactory.makeSymbol("DBMS-SERVER")), ConsesLow.list(SubLObjectFactory.makeSymbol("TIMEOUT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*SQL-CONNECTION-TIMEOUT*")))
    }), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
    private static final SubLList $list359 = ConsesLow.list(SubLObjectFactory.makeKeyword("DBMS-SERVER"), SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeKeyword("SUBPROTOCOL"), SubLObjectFactory.makeKeyword("PROXY-SERVER"), SubLObjectFactory.makeKeyword("TIMEOUT"));
    private static final SubLSymbol $sym360$_SQL_SUBPROTOCOL_ = SubLObjectFactory.makeSymbol("*SQL-SUBPROTOCOL*");
    private static final SubLSymbol $sym361$_SQL_CONNECTION_TIMEOUT_ = SubLObjectFactory.makeSymbol("*SQL-CONNECTION-TIMEOUT*");
    private static final SubLSymbol $sym362$CLET = SubLObjectFactory.makeSymbol("CLET");
    private static final SubLSymbol $sym363$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
    private static final SubLSymbol $sym364$PROGN = SubLObjectFactory.makeSymbol("PROGN");
    private static final SubLSymbol $sym365$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
    private static final SubLSymbol $sym366$NEW_SQL_CONNECTION = SubLObjectFactory.makeSymbol("NEW-SQL-CONNECTION");
    private static final SubLSymbol $sym367$LIST = SubLObjectFactory.makeSymbol("LIST");
    private static final SubLSymbol $sym368$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
    private static final SubLSymbol $sym369$SQLC_CLOSE = SubLObjectFactory.makeSymbol("SQLC-CLOSE");
    private static final SubLList $list370 = ConsesLow.list(ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeSymbol("STATEMENT"), SubLObjectFactory.makeSymbol("DB"), SubLObjectFactory.makeSymbol("USER"), SubLObjectFactory.makeSymbol("PASSWORD"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list(SubLObjectFactory.makeSymbol("DBMS-SERVER"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*DBMS-SERVER*"))), ConsesLow.list(SubLObjectFactory.makeSymbol("PORT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*SQL-PORT*"))), ConsesLow.list(SubLObjectFactory.makeSymbol("SUBPROTOCOL"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*SQL-SUBPROTOCOL*"))), ConsesLow.list(SubLObjectFactory.makeSymbol("PROXY-SERVER"), SubLObjectFactory.makeSymbol("DBMS-SERVER")), ConsesLow.list(SubLObjectFactory.makeSymbol("TIMEOUT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*SQL-CONNECTION-TIMEOUT*")))
    }), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
    private static final SubLSymbol $sym371$CONNECTION = SubLObjectFactory.makeUninternedSymbol("CONNECTION");
    private static final SubLSymbol $sym372$WITH_SQL_CONNECTION = SubLObjectFactory.makeSymbol("WITH-SQL-CONNECTION");
    private static final SubLSymbol $sym373$PIF = SubLObjectFactory.makeSymbol("PIF");
    private static final SubLSymbol $sym374$SQLC_CREATE_STATEMENT = SubLObjectFactory.makeSymbol("SQLC-CREATE-STATEMENT");
    private static final SubLList $list375 = ConsesLow.list(ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeSymbol("STATEMENT"), SubLObjectFactory.makeSymbol("SQL"), SubLObjectFactory.makeSymbol("DB"), SubLObjectFactory.makeSymbol("USER"), SubLObjectFactory.makeSymbol("PASSWORD"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list(SubLObjectFactory.makeSymbol("DBMS-SERVER"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*DBMS-SERVER*"))), ConsesLow.list(SubLObjectFactory.makeSymbol("PORT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*SQL-PORT*"))), ConsesLow.list(SubLObjectFactory.makeSymbol("SUBPROTOCOL"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*SQL-SUBPROTOCOL*"))), ConsesLow.list(SubLObjectFactory.makeSymbol("PROXY-SERVER"), SubLObjectFactory.makeSymbol("DBMS-SERVER")),
        ConsesLow.list(SubLObjectFactory.makeSymbol("TIMEOUT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*SQL-CONNECTION-TIMEOUT*")))
    }), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
    private static final SubLSymbol $sym376$CONNECTION = SubLObjectFactory.makeUninternedSymbol("CONNECTION");
    private static final SubLSymbol $sym377$SQLC_PREPARE_STATEMENT = SubLObjectFactory.makeSymbol("SQLC-PREPARE-STATEMENT");
    private static final SubLList $list378 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("STATEMENT"), SubLObjectFactory.makeSymbol("ERROR")), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
    private static final SubLSymbol $sym379$CONNECTION = SubLObjectFactory.makeUninternedSymbol("CONNECTION");
    private static final SubLSymbol $sym380$AUTO_COMMIT = SubLObjectFactory.makeUninternedSymbol("AUTO-COMMIT");
    private static final SubLSymbol $sym381$COMMIT_ERROR = SubLObjectFactory.makeUninternedSymbol("COMMIT-ERROR");
    private static final SubLSymbol $sym382$ROLLBACK_RESULT = SubLObjectFactory.makeUninternedSymbol("ROLLBACK-RESULT");
    private static final SubLSymbol $sym383$AUTO_COMMIT_RESULT = SubLObjectFactory.makeUninternedSymbol("AUTO-COMMIT-RESULT");
    private static final SubLSymbol $sym384$ERRORS = SubLObjectFactory.makeUninternedSymbol("ERRORS");
    private static final SubLSymbol $sym385$SQLC_GET_AUTO_COMMIT = SubLObjectFactory.makeSymbol("SQLC-GET-AUTO-COMMIT");
    private static final SubLSymbol $sym386$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
    private static final SubLList $list387 = ConsesLow.list(SubLObjectFactory.makeKeyword("THROW"));
    private static final SubLSymbol $sym388$CATCH_ERROR_MESSAGE = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE");
    private static final SubLSymbol $sym389$SQLC_SET_AUTO_COMMIT = SubLObjectFactory.makeSymbol("SQLC-SET-AUTO-COMMIT");
    private static final SubLList $list390;
    private static final SubLSymbol $sym391$SQLC_COMMIT = SubLObjectFactory.makeSymbol("SQLC-COMMIT");
    private static final SubLList $list392 = ConsesLow.list(SubLObjectFactory.makeKeyword("RETURN"));
    private static final SubLSymbol $sym393$SQLS_HANDLE_COMMIT_ERROR = SubLObjectFactory.makeSymbol("SQLS-HANDLE-COMMIT-ERROR");
    private static final SubLSymbol $sym394$SQLS_HANDLE_ROLLBACK = SubLObjectFactory.makeSymbol("SQLS-HANDLE-ROLLBACK");
    private static final SubLList $list395;
    private static final SubLSymbol $sym396$SQLS_HANDLE_TRANSACTION_ERRORS = SubLObjectFactory.makeSymbol("SQLS-HANDLE-TRANSACTION-ERRORS");
    private static final SubLString $str397$An_unknown_error_occurred_during_ = SubLObjectFactory.makeString("An unknown error occurred during execution");
    private static final SubLList $list398 = ConsesLow.list(ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeSymbol("STATEMENT"), SubLObjectFactory.makeSymbol("ERROR"), SubLObjectFactory.makeSymbol("DB"), SubLObjectFactory.makeSymbol("USER"), SubLObjectFactory.makeSymbol("PASSWORD"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list(SubLObjectFactory.makeSymbol("DBMS-SERVER"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*DBMS-SERVER*"))), ConsesLow.list(SubLObjectFactory.makeSymbol("PORT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*SQL-PORT*"))), ConsesLow.list(SubLObjectFactory.makeSymbol("SUBPROTOCOL"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*SQL-SUBPROTOCOL*"))), ConsesLow.list(SubLObjectFactory.makeSymbol("PROXY-SERVER"), SubLObjectFactory.makeSymbol("DBMS-SERVER")),
        ConsesLow.list(SubLObjectFactory.makeSymbol("TIMEOUT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*SQL-CONNECTION-TIMEOUT*")))
    }), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
    private static final SubLSymbol $sym399$WITH_SQL_STATEMENT = SubLObjectFactory.makeSymbol("WITH-SQL-STATEMENT");
    private static final SubLList $list400 = ConsesLow.list(ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeSymbol("RS"), SubLObjectFactory.makeSymbol("QUERY"), SubLObjectFactory.makeSymbol("DB"), SubLObjectFactory.makeSymbol("USER"), SubLObjectFactory.makeSymbol("PASSWORD"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list(SubLObjectFactory.makeSymbol("DBMS-SERVER"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*DBMS-SERVER*"))), ConsesLow.list(SubLObjectFactory.makeSymbol("PORT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*SQL-PORT*"))), ConsesLow.list(SubLObjectFactory.makeSymbol("SUBPROTOCOL"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*SQL-SUBPROTOCOL*"))), ConsesLow.list(SubLObjectFactory.makeSymbol("PROXY-SERVER"), SubLObjectFactory.makeSymbol("DBMS-SERVER")),
        ConsesLow.list(SubLObjectFactory.makeSymbol("TIMEOUT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("*SQL-CONNECTION-TIMEOUT*")))
    }), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
    private static final SubLSymbol $sym401$STATEMENT = SubLObjectFactory.makeUninternedSymbol("STATEMENT");
    private static final SubLSymbol $sym402$RS = SubLObjectFactory.makeSymbol("RS");
    private static final SubLSymbol $sym403$SQLS_EXECUTE_QUERY = SubLObjectFactory.makeSymbol("SQLS-EXECUTE-QUERY");
    private static final SubLSymbol $sym404$WITH_SQL_RESULT_SET = SubLObjectFactory.makeSymbol("WITH-SQL-RESULT-SET");
    private static final SubLSymbol $sym405$WHILE = SubLObjectFactory.makeSymbol("WHILE");
    private static final SubLSymbol $sym406$SQLRS_NEXT = SubLObjectFactory.makeSymbol("SQLRS-NEXT");
    private static final SubLSymbol $sym407$OUTPUT_STREAM_P = SubLObjectFactory.makeSymbol("OUTPUT-STREAM-P");
    private static final SubLString $str408$SELECT___FROM_ = SubLObjectFactory.makeString("SELECT * FROM ");
    private static final SubLList $list409;
    private static final SubLString $str410$INSERT_INTO__a_VALUES______ = SubLObjectFactory.makeString("INSERT INTO ~a VALUES(?, ?)");
    private static final SubLString $str411$SELECT_number2_FROM__a_WHERE_numb = SubLObjectFactory.makeString("SELECT number2 FROM ~a WHERE number1 = ?");
    private static final SubLString $str412$CREATE_TABLE_ = SubLObjectFactory.makeString("CREATE TABLE ");
    private static final SubLString $str413$__number1_INT_PRIMARY_KEY__number = SubLObjectFactory.makeString(" (number1 INT PRIMARY KEY, number2 INT)");
    private static final SubLString $str414$validation_failed_for__a__result_ = SubLObjectFactory.makeString("validation failed for ~a: result ~a");
    private static final SubLString $str415$DROP_TABLE_ = SubLObjectFactory.makeString("DROP TABLE ");
    private static final SubLString $str416$INSERT_INTO_ = SubLObjectFactory.makeString("INSERT INTO ");
    private static final SubLString $str417$_VALUES_ = SubLObjectFactory.makeString(" VALUES(");
    private static final SubLString $str418$__ = SubLObjectFactory.makeString(", ");
    private static final SubLString $str419$_ = SubLObjectFactory.makeString(")");
    private static final SubLString $str420$SELECT_number2_FROM_ = SubLObjectFactory.makeString("SELECT number2 FROM ");
    private static final SubLString $str421$_WHERE_number1___ = SubLObjectFactory.makeString(" WHERE number1 = ");

    static
    {
        $list281 = ConsesLow.list(new SubLObject[] {
            ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("dbms-server.cyc.com"), SubLObjectFactory.makeString("testdatabase"), SubLObjectFactory.makeString("theuser"), SubLObjectFactory.makeString("thepassword"), SubLObjectFactory.makeString("postgresql")), SubLObjectFactory.makeString("jdbc:postgresql://dbms-server.cyc.com:5432/testdatabase?user=theuser&password=thepassword&charSet=ASCII")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("dbms-server.cyc.com"), SubLObjectFactory.makeString("testdatabase"), SubLObjectFactory.makeString("theuser"), SubLObjectFactory.makeString("thepassword"), SubLObjectFactory.makeString("mysql")), SubLObjectFactory.makeString("jdbc:mysql://dbms-server.cyc.com:3306/testdatabase?user=theuser&password=thepassword")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("dbms-server.cyc.com"), SubLObjectFactory.makeString("testdatabase"), SubLObjectFactory.makeString("theuser"), SubLObjectFactory.makeString("thepassword"), SubLObjectFactory.makeString("oracle")), SubLObjectFactory.makeString("jdbc:oracle:thin:theuser/thepassword@//dbms-server.cyc.com:1521/testdatabase")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("dbms-server.cyc.com"), SubLObjectFactory.makeString("testdatabase"), SubLObjectFactory.makeString("theuser"), SubLObjectFactory.makeString("thepassword"), SubLObjectFactory.makeString("microsoft-sqlserver")), SubLObjectFactory.makeString("jdbc:microsoft:sqlserver://dbms-server.cyc.com:1433;DatabaseName=testdatabase;SelectMethod=cursor;USER=theuser;PASSWORD=thepassword")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("dbms-server.cyc.com"), SubLObjectFactory.makeString("testdatabase"), SubLObjectFactory.makeString("theuser"), SubLObjectFactory.makeString("thepassword"), SubLObjectFactory.makeString("sqlserver")), SubLObjectFactory.makeString("jdbc:sqlserver://dbms-server.cyc.com:1433;DatabaseName=testdatabase;SelectMethod=cursor;USER=theuser;PASSWORD=thepassword")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("dbms-server.cyc.com"), SubLObjectFactory.makeString("testdatabase"), SubLObjectFactory.makeString("theuser"), SubLObjectFactory.makeString("thepassword"), SubLObjectFactory.makeString("odbc")), SubLObjectFactory.makeString("jdbc:odbc:testdatabase;UID=theuser;PWD=thepassword")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("dbms-server.cyc.com"), SubLObjectFactory.makeString("testdatabase"), SubLObjectFactory.makeString("theuser"), SubLObjectFactory.makeString("thepassword"), SubLObjectFactory.makeString("sybase")), SubLObjectFactory.makeString("jdbc:jtds:sybase://dbms-server.cyc.com:2048/testdatabase;USER=theuser;PASSWORD=thepassword")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("dbms-server.cyc.com"), SubLObjectFactory.makeString("testdatabase"), SubLObjectFactory.makeString("theuser"), SubLObjectFactory.makeString("thepassword"), SubLObjectFactory.makeString("db2")), SubLObjectFactory.makeString("jdbc:db2://dbms-server.cyc.com:50001/TESTDATABASE:user=theuser;password=thepassword;")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("dbms-server.cyc.com"), SubLObjectFactory.makeString("testdatabase"), NIL, NIL, SubLObjectFactory.makeString("derby")), SubLObjectFactory.makeString("jdbc:derby://dbms-server.cyc.com:1527/testdatabase")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("dbms-server.cyc.com"), SubLObjectFactory.makeString("testdatabase"), NIL, NIL, SubLObjectFactory.makeString("com.cyc.project.mysentient.query.webScraper.Ents24SKSI")), SubLObjectFactory.makeString("jdbc:com.cyc.project.mysentient.query.webScraper.Ents24SKSI:testdatabase")),
            ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("dbms-server.cyc.com"), SubLObjectFactory.makeString("testdatabase"), SubLObjectFactory.makeString("theuser"), SubLObjectFactory.makeString("thepassword"), SubLObjectFactory.makeString("derby")), SubLObjectFactory.makeString("jdbc:derby://dbms-server.cyc.com:1527/testdatabase;user=theuser;password=thepassword")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("dbms-server.cyc.com"), SubLObjectFactory.makeString("testdatabase"), SubLObjectFactory.makeString("theuser"), SubLObjectFactory.makeString("thepassword"), SubLObjectFactory.makeString("derby"), SubLObjectFactory.makeInteger(15270)), SubLObjectFactory.makeString("jdbc:derby://dbms-server.cyc.com:15270/testdatabase;user=theuser;password=thepassword")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("dbms-server.cyc.com"), SubLObjectFactory.makeString("testdatabase"), SubLObjectFactory.makeString("theuser"), SubLObjectFactory.makeString("thepassword"), SubLObjectFactory.makeString("db2"), SubLObjectFactory.makeInteger(6501)), SubLObjectFactory.makeString("jdbc:db2://dbms-server.cyc.com:6501/TESTDATABASE:user=theuser;password=thepassword;")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("dbms-server.cyc.com"), SubLObjectFactory.makeString("iq-demo"), SubLObjectFactory.makeString("theuser"), SubLObjectFactory.makeString("thepassword"), SubLObjectFactory.makeString("sybase-iq")), SubLObjectFactory.makeString("jdbc:sybase:Tds:dbms-server.cyc.com:2638?ServiceName=iq-demo&USER=theuser&PASSWORD=thepassword"))
        });
        $list390 = ConsesLow.list(NIL);
        $list395 = ConsesLow.list(T);
        $list409 = ConsesLow.list(Characters.CHAR_period);
    }


}
