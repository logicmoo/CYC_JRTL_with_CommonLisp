/**
 *
 */
/**
 * //
 */
/**
 *
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_macro_promotions.validate_tcp_connection;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.gensym;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.kill_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.floatp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.vectorp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.finish_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.open_stream_p;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.output_stream_p;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class sdbc extends SubLTranslatedFile {
    public static SubLObject sql_proxy_server_runningP(SubLObject server, SubLObject port, SubLObject timeout) {
        if (server == UNPROVIDED) {
            server = $sdbc_proxy_server$.getGlobalValue();
        }
        if (port == UNPROVIDED) {
            port = $sql_port$.getGlobalValue();
        }
        if (timeout == UNPROVIDED) {
            timeout = FIVE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(server) : "Types.stringp(server) " + "CommonSymbols.NIL != Types.stringp(server) " + server;
        assert NIL != subl_promotions.positive_integer_p(port) : "subl_promotions.positive_integer_p(port) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(port) " + port;
        SubLObject downP = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject stream = NIL;
                    try {
                        stream = subl_promotions.open_tcp_stream_with_timeout(server, port, NIL, $PRIVATE);
                        if (NIL != validate_tcp_connection(stream, server, port)) {
                            cfasl_output(cons($quit$.getGlobalValue(), NIL), stream);
                            finish_output(stream);
                            final SubLObject tag = with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$1 = $within_with_timeout$.currentBinding(thread);
                                try {
                                    $within_with_timeout$.bind(T, thread);
                                    SubLObject timer = NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$2 = $with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = with_timeout_start_timer(timeout, tag);
                                            cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$2, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            with_timeout_stop_timer(timer);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                        }
                                    }
                                } finally {
                                    $within_with_timeout$.rebind(_prev_bind_0_$1, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                downP = Errors.handleThrowable(ccatch_env_var, tag);
                            } finally {
                                thread.throwStack.pop();
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            if (NIL != stream) {
                                close(stream, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            downP = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return makeBoolean(NIL == downP);
    }

    public static SubLObject sql_connection_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        sqlc_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_connection_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$sql_connection_native.class ? T : NIL;
    }

    public static SubLObject sqlc_db(final SubLObject v_object) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sqlc_user(final SubLObject v_object) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sqlc_dbms_server(final SubLObject v_object) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject sqlc_port(final SubLObject v_object) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject sqlc_channel(final SubLObject v_object) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject sqlc_statements(final SubLObject v_object) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject sqlc_lock(final SubLObject v_object) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject sqlc_subprotocol(final SubLObject v_object) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject sqlc_proxy_server(final SubLObject v_object) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject sqlc_error_handling(final SubLObject v_object) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject sqlc_tickets(final SubLObject v_object) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.getField12();
    }

    public static SubLObject sqlc_mailman(final SubLObject v_object) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.getField13();
    }

    public static SubLObject _csetf_sqlc_db(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sqlc_user(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sqlc_dbms_server(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sqlc_port(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sqlc_channel(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sqlc_statements(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sqlc_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_sqlc_subprotocol(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_sqlc_proxy_server(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_sqlc_error_handling(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_sqlc_tickets(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_sqlc_mailman(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_connection_p(v_object) : "sdbc.sql_connection_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject make_sql_connection(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_connection_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($DB)) {
                _csetf_sqlc_db(v_new, current_value);
            } else
                if (pcase_var.eql($USER)) {
                    _csetf_sqlc_user(v_new, current_value);
                } else
                    if (pcase_var.eql($DBMS_SERVER)) {
                        _csetf_sqlc_dbms_server(v_new, current_value);
                    } else
                        if (pcase_var.eql($PORT)) {
                            _csetf_sqlc_port(v_new, current_value);
                        } else
                            if (pcase_var.eql($CHANNEL)) {
                                _csetf_sqlc_channel(v_new, current_value);
                            } else
                                if (pcase_var.eql($STATEMENTS)) {
                                    _csetf_sqlc_statements(v_new, current_value);
                                } else
                                    if (pcase_var.eql($LOCK)) {
                                        _csetf_sqlc_lock(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($SUBPROTOCOL)) {
                                            _csetf_sqlc_subprotocol(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($PROXY_SERVER)) {
                                                _csetf_sqlc_proxy_server(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($ERROR_HANDLING)) {
                                                    _csetf_sqlc_error_handling(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($TICKETS)) {
                                                        _csetf_sqlc_tickets(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($MAILMAN)) {
                                                            _csetf_sqlc_mailman(v_new, current_value);
                                                        } else {
                                                            Errors.error($str82$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_connection(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_CONNECTION, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $DB, sqlc_db(obj));
        funcall(visitor_fn, obj, $SLOT, $USER, sqlc_user(obj));
        funcall(visitor_fn, obj, $SLOT, $DBMS_SERVER, sqlc_dbms_server(obj));
        funcall(visitor_fn, obj, $SLOT, $PORT, sqlc_port(obj));
        funcall(visitor_fn, obj, $SLOT, $CHANNEL, sqlc_channel(obj));
        funcall(visitor_fn, obj, $SLOT, $STATEMENTS, sqlc_statements(obj));
        funcall(visitor_fn, obj, $SLOT, $LOCK, sqlc_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $SUBPROTOCOL, sqlc_subprotocol(obj));
        funcall(visitor_fn, obj, $SLOT, $PROXY_SERVER, sqlc_proxy_server(obj));
        funcall(visitor_fn, obj, $SLOT, $ERROR_HANDLING, sqlc_error_handling(obj));
        funcall(visitor_fn, obj, $SLOT, $TICKETS, sqlc_tickets(obj));
        funcall(visitor_fn, obj, $SLOT, $MAILMAN, sqlc_mailman(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_CONNECTION, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_connection_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_connection(obj, visitor_fn);
    }

    public static SubLObject sqlc_print(final SubLObject connection, final SubLObject stream, final SubLObject depth) {
        write_string(sqlc_print_string(connection), stream, UNPROVIDED, UNPROVIDED);
        return connection;
    }

    public static SubLObject sqlc_print_string(final SubLObject connection) {
        SubLObject string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            write_string($str88$__SQL_CONNECTION_, stream, UNPROVIDED, UNPROVIDED);
            if (NIL == sqlc_open_p(connection)) {
                write_string($$$closed_, stream, UNPROVIDED, UNPROVIDED);
            }
            write_string($$$to_, stream, UNPROVIDED, UNPROVIDED);
            write_string(sqlc_db(connection), stream, UNPROVIDED, UNPROVIDED);
            write_string($str91$__, stream, UNPROVIDED, UNPROVIDED);
            write_string(sqlc_dbms_server(connection), stream, UNPROVIDED, UNPROVIDED);
            write_string($str92$_, stream, UNPROVIDED, UNPROVIDED);
            prin1(sqlc_port(connection), stream);
            write_string($str93$__, stream, UNPROVIDED, UNPROVIDED);
            string = get_output_stream_string(stream);
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
        return string;
    }

    public static SubLObject new_sql_connection(final SubLObject db, final SubLObject user, final SubLObject password, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = v_properties;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list94);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list94);
            if (NIL == member(current_$5, $list95, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list94);
        }
        final SubLObject dbms_server_tail = property_list_member($DBMS_SERVER, current);
        final SubLObject dbms_server = (NIL != dbms_server_tail) ? cadr(dbms_server_tail) : $dbms_server$.getGlobalValue();
        final SubLObject dbms_port_tail = property_list_member($DBMS_PORT, current);
        final SubLObject dbms_port = (NIL != dbms_port_tail) ? cadr(dbms_port_tail) : NIL;
        final SubLObject subprotocol_tail = property_list_member($SUBPROTOCOL, current);
        final SubLObject subprotocol = (NIL != subprotocol_tail) ? cadr(subprotocol_tail) : $sql_subprotocol$.getGlobalValue();
        final SubLObject proxy_server_tail = property_list_member($PROXY_SERVER, current);
        final SubLObject proxy_server = (NIL != proxy_server_tail) ? cadr(proxy_server_tail) : dbms_server;
        final SubLObject port_tail = property_list_member($PORT, current);
        final SubLObject port = (NIL != port_tail) ? cadr(port_tail) : $sql_port$.getGlobalValue();
        final SubLObject timeout_tail = property_list_member($TIMEOUT, current);
        final SubLObject timeout = (NIL != timeout_tail) ? cadr(timeout_tail) : $sql_connection_timeout$.getGlobalValue();
        assert NIL != stringp(db) : "Types.stringp(db) " + "CommonSymbols.NIL != Types.stringp(db) " + db;
        if (((NIL != user) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(user))) {
            throw new AssertionError(user);
        }
        if (((NIL != password) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(password))) {
            throw new AssertionError(password);
        }
        assert NIL != stringp(dbms_server) : "Types.stringp(dbms_server) " + "CommonSymbols.NIL != Types.stringp(dbms_server) " + dbms_server;
        if (((NIL != dbms_port) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(dbms_port))) {
            throw new AssertionError(dbms_port);
        }
        assert NIL != integerp(port) : "Types.integerp(port) " + "CommonSymbols.NIL != Types.integerp(port) " + port;
        assert NIL != stringp(subprotocol) : "Types.stringp(subprotocol) " + "CommonSymbols.NIL != Types.stringp(subprotocol) " + subprotocol;
        assert NIL != stringp(proxy_server) : "Types.stringp(proxy_server) " + "CommonSymbols.NIL != Types.stringp(proxy_server) " + proxy_server;
        assert NIL != number_utilities.non_negative_number_p(timeout) : "number_utilities.non_negative_number_p(timeout) " + "CommonSymbols.NIL != number_utilities.non_negative_number_p(timeout) " + timeout;
        SubLObject connection = make_sql_connection(UNPROVIDED);
        SubLObject error_message = NIL;
        SubLObject timed_outP = NIL;
        _csetf_sqlc_db(connection, db);
        _csetf_sqlc_user(connection, user);
        _csetf_sqlc_dbms_server(connection, dbms_server);
        _csetf_sqlc_port(connection, port);
        _csetf_sqlc_subprotocol(connection, subprotocol);
        _csetf_sqlc_proxy_server(connection, proxy_server);
        _csetf_sqlc_lock(connection, make_lock($$$SQL_connection_lock));
        _csetf_sqlc_error_handling(connection, $RETURN);
        _csetf_sqlc_tickets(connection, queues.create_queue(UNPROVIDED));
        final SubLObject tag = with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
            try {
                $within_with_timeout$.bind(T, thread);
                SubLObject timer = NIL;
                try {
                    final SubLObject _prev_bind_0_$6 = $with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = with_timeout_start_timer(timeout, tag);
                        try {
                            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                            final SubLObject _prev_bind_0_$7 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    if ((NIL == proxy_server) || (NIL == port)) {
                                        Errors.error($str103$Trying_to_open_from_a_null_sqlc_c);
                                    }
                                    _csetf_sqlc_channel(connection, subl_promotions.open_tcp_stream_with_timeout(proxy_server, port, NIL, $PRIVATE));
                                } catch (final Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$7, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                        } finally {
                            thread.throwStack.pop();
                        }
                        if (NIL != error_message) {
                            connection = sqlc_handle_error(connection, new_sdbc_error($client_error$.getGlobalValue(), error_message, UNPROVIDED));
                        } else {
                            _csetf_sqlc_mailman(connection, launch_sql_mailman(connection));
                            final SubLObject result = sqlc_execute(connection, $new_connection$.getGlobalValue(), list(new_db_url(dbms_server, db, user, password, subprotocol, dbms_port)));
                            if (NIL != sdbc_error_p(result)) {
                                sqlc_close(connection);
                                connection = result;
                            }
                        }
                    } finally {
                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$6, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        with_timeout_stop_timer(timer);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                    }
                }
            } finally {
                $within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            timed_outP = Errors.handleThrowable(ccatch_env_var2, tag);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != timed_outP) {
            sqlc_close(connection);
            connection = sqlc_handle_error(connection, new_sdbc_error($client_error$.getGlobalValue(), $$$timeout, UNPROVIDED));
        }
        return connection;
    }

    public static SubLObject sql_open_connection_p(final SubLObject v_object) {
        return makeBoolean((NIL != sql_connection_p(v_object)) && (NIL != sqlc_open_p(v_object)));
    }

    public static SubLObject sqlc_open_p(final SubLObject connection) {
        assert NIL != sql_connection_p(connection) : "sdbc.sql_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_connection_p(connection) " + connection;
        return makeBoolean((NIL != sqlc_channel(connection)) && (NIL != open_stream_p(sqlc_channel(connection))));
    }

    public static SubLObject sqlc_close(final SubLObject connection) {
        assert NIL != sql_connection_p(connection) : "sdbc.sql_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_connection_p(connection) " + connection;
        final SubLObject lock = sqlc_lock(connection);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            if (NIL != sqlc_mailman(connection)) {
                kill_process(sqlc_mailman(connection));
            }
            _csetf_sqlc_mailman(connection, NIL);
            if (NIL != sqlc_channel(connection)) {
                close(sqlc_channel(connection), UNPROVIDED);
            }
            _csetf_sqlc_channel(connection, NIL);
            SubLObject cdolist_list_var = sqlc_statements(connection);
            SubLObject statement = NIL;
            statement = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                sqls_local_close(statement);
                cdolist_list_var = cdolist_list_var.rest();
                statement = cdolist_list_var.first();
            } 
            _csetf_sqlc_statements(connection, NIL);
            return connection;
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
    }

    public static SubLObject sqlc_create_statement(final SubLObject connection) {
        assert NIL != sql_open_connection_p(connection) : "sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) " + connection;
        final SubLObject statement = new_sql_statement(connection);
        if (NIL != sql_statement_p(statement)) {
            _csetf_sqlc_statements(connection, cons(statement, sqlc_statements(connection)));
        }
        return statement;
    }

    public static SubLObject sqlc_prepare_statement(final SubLObject connection, final SubLObject sql) {
        assert NIL != sql_open_connection_p(connection) : "sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) " + connection;
        assert NIL != stringp(sql) : "Types.stringp(sql) " + "CommonSymbols.NIL != Types.stringp(sql) " + sql;
        final SubLObject statement = new_sql_prepared_statement(connection, sql);
        if (NIL != sql_statement_p(statement)) {
            _csetf_sqlc_statements(connection, cons(statement, sqlc_statements(connection)));
        }
        return statement;
    }

    public static SubLObject sqlc_set_auto_commit(final SubLObject connection, final SubLObject flag) {
        assert NIL != sql_open_connection_p(connection) : "sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) " + connection;
        assert NIL != booleanp(flag) : "Types.booleanp(flag) " + "CommonSymbols.NIL != Types.booleanp(flag) " + flag;
        return sqlc_execute(connection, $set_auto_commit$.getGlobalValue(), list(flag));
    }

    public static SubLObject sqlc_get_auto_commit(final SubLObject connection) {
        assert NIL != sql_open_connection_p(connection) : "sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) " + connection;
        return sqlc_execute(connection, $get_auto_commit$.getGlobalValue(), NIL);
    }

    public static SubLObject sqlc_commit(final SubLObject connection) {
        assert NIL != sql_open_connection_p(connection) : "sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) " + connection;
        return sqlc_execute(connection, $commit$.getGlobalValue(), NIL);
    }

    public static SubLObject sqlc_rollback(final SubLObject connection) {
        assert NIL != sql_open_connection_p(connection) : "sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) " + connection;
        return sqlc_execute(connection, $rollback$.getGlobalValue(), NIL);
    }

    public static SubLObject sqlc_get_transaction_isolation(final SubLObject connection) {
        assert NIL != sql_open_connection_p(connection) : "sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) " + connection;
        return sqlc_execute(connection, $get_transaction_isolation$.getGlobalValue(), NIL);
    }

    public static SubLObject sqlc_set_transaction_isolation(final SubLObject connection, final SubLObject transaction_level) {
        assert NIL != sql_open_connection_p(connection) : "sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) " + connection;
        assert NIL != sql_transaction_level_p(transaction_level) : "sdbc.sql_transaction_level_p(transaction_level) " + "CommonSymbols.NIL != sdbc.sql_transaction_level_p(transaction_level) " + transaction_level;
        return sqlc_execute(connection, $set_transaction_isolation$.getGlobalValue(), list(transaction_level));
    }

    public static SubLObject sql_ticket_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_ticket_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$sql_ticket_native.class ? T : NIL;
    }

    public static SubLObject sql_ticket_semaphore(final SubLObject v_object) {
        assert NIL != sql_ticket_p(v_object) : "sdbc.sql_ticket_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sql_ticket_result(final SubLObject v_object) {
        assert NIL != sql_ticket_p(v_object) : "sdbc.sql_ticket_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_sql_ticket_semaphore(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_ticket_p(v_object) : "sdbc.sql_ticket_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sql_ticket_result(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_ticket_p(v_object) : "sdbc.sql_ticket_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_sql_ticket(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_ticket_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SEMAPHORE)) {
                _csetf_sql_ticket_semaphore(v_new, current_value);
            } else
                if (pcase_var.eql($RESULT)) {
                    _csetf_sql_ticket_result(v_new, current_value);
                } else {
                    Errors.error($str82$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_ticket(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_TICKET, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SEMAPHORE, sql_ticket_semaphore(obj));
        funcall(visitor_fn, obj, $SLOT, $RESULT, sql_ticket_result(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_TICKET, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_ticket_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_ticket(obj, visitor_fn);
    }

    public static SubLObject new_sql_ticket() {
        final SubLObject ticket = make_sql_ticket(UNPROVIDED);
        _csetf_sql_ticket_semaphore(ticket, Semaphores.new_semaphore($$$SQL_Request, ZERO_INTEGER));
        return ticket;
    }

    public static SubLObject sql_ticket_retrieve(final SubLObject ticket) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        while (NIL == result) {
            final SubLObject inference = inference_macros.current_controlling_inference();
            final SubLObject inference_remaining_time = (NIL != inference) ? inference_datastructures_inference.inference_remaining_time(inference, T) : NIL;
            final SubLObject max_secs_to_wait = (inference_remaining_time.isInteger()) ? add(FIVE_INTEGER, inference_remaining_time) : NIL != inference ? $sql_connection_timeout_seconds_within_inference$.getDynamicValue(thread) : $sql_connection_timeout_seconds$.getDynamicValue(thread);
            if (NIL != Semaphores.semaphore_wait_with_timeout(sql_ticket_semaphore(ticket), max_secs_to_wait)) {
                result = sql_ticket_result(ticket);
            } else {
                result = new_sdbc_error($io_error$.getGlobalValue(), cconcatenate($$$Timed_out_after_, new SubLObject[]{ format_nil.format_nil_d_no_copy(max_secs_to_wait), $$$_seconds_retrieving_SQL_ticket }), UNPROVIDED);
            }
        } 
        return result;
    }

    public static SubLObject launch_sql_mailman(final SubLObject connection) {
        return subl_promotions.make_process_with_args(cconcatenate($$$SQL_Mailman_for_, format_nil.format_nil_a_no_copy(sqlc_print_string(connection))), SQLC_DELIVER, list(connection));
    }

    public static SubLObject sqlc_deliver(final SubLObject connection) {
        SubLSystemTrampolineFile.enforceType(connection, SQL_CONNECTION_P);
        SubLObject result = NIL;
        SubLObject ticket = NIL;
        while (true) {
            result = sqlc_receive(connection);
            final SubLObject lock = sqlc_lock(connection);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ticket = queues.dequeue(sqlc_tickets(connection));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            if (NIL != ticket) {
                _csetf_sql_ticket_result(ticket, result);
                Semaphores.semaphore_signal(sql_ticket_semaphore(ticket));
            } else
                if (NIL != sdbc_client_error_p(result)) {
                    close(sqlc_channel(connection), UNPROVIDED);
                    sqlc_close(connection);
                } else {
                    Errors.error($str132$Implementation_error__no_ticket_f, result);
                }

        } 
    }

    public static SubLObject sqlc_execute(final SubLObject connection, final SubLObject function, final SubLObject args) {
        final SubLObject ticket = new_sql_ticket();
        SubLObject send_response = NIL;
        SubLObject receive_response = NIL;
        send_response = sqlc_send(connection, ticket, function, args);
        if (NIL != sdbc_client_error_p(send_response)) {
            close(sqlc_channel(connection), UNPROVIDED);
            sqlc_close(connection);
            return sqlc_handle_error(connection, send_response);
        }
        receive_response = sql_ticket_retrieve(ticket);
        if (NIL != sdbc_error_p(receive_response)) {
            if (NIL != sdbc_client_error_p(receive_response)) {
                close(sqlc_channel(connection), UNPROVIDED);
                sqlc_close(connection);
            }
            return sqlc_handle_error(connection, receive_response);
        }
        return receive_response;
    }

    public static SubLObject sqlc_send(final SubLObject connection, final SubLObject ticket, final SubLObject function, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLSystemTrampolineFile.enforceType(connection, SQL_CONNECTION_P);
        SubLObject error_message = NIL;
        SubLObject response = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (NIL == sqlc_channel(connection)) {
                        Errors.error($str133$Trying_to_read_from_a_null_sqlc_c);
                    }
                    final SubLObject lock = sqlc_lock(connection);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        queues.enqueue(ticket, sqlc_tickets(connection));
                        cfasl_output(cons(function, args), sqlc_channel(connection));
                        force_output(sqlc_channel(connection));
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            response = new_sdbc_error($client_error$.getGlobalValue(), error_message, UNPROVIDED);
        }
        return response;
    }

    public static SubLObject sqlc_receive(final SubLObject connection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLSystemTrampolineFile.enforceType(connection, SQL_CONNECTION_P);
        SubLObject error_message = NIL;
        SubLObject response = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (NIL == sqlc_channel(connection)) {
                        Errors.error($str133$Trying_to_read_from_a_null_sqlc_c);
                    }
                    response = cfasl_input(sqlc_channel(connection), UNPROVIDED, UNPROVIDED);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            response = cons($client_error$.getGlobalValue(), list(error_message));
        }
        return sql_response_value(response);
    }

    public static SubLObject sqlc_handle_error(final SubLObject connection, final SubLObject error) {
        final SubLObject pcase_var = sqlc_error_handling(connection);
        if (pcase_var.eql($RETURN)) {
            return error;
        }
        if (pcase_var.eql($THROW)) {
            sdbc_error_throw(error);
            return error;
        }
        if (pcase_var.eql($WARN)) {
            sdbc_error_warn(error);
            return error;
        }
        assert NIL != sdbc_error_handling_tag_p(sqlc_error_handling(connection)) : "sdbc.sdbc_error_handling_tag_p(sdbc.sqlc_error_handling(connection)) " + "CommonSymbols.NIL != sdbc.sdbc_error_handling_tag_p(sdbc.sqlc_error_handling(connection)) " + sqlc_error_handling(connection);
        return NIL;
    }

    public static SubLObject sql_transaction_level_p(final SubLObject v_object) {
        return member(v_object, $list137, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sqlc_set_error_handling(final SubLObject connection, final SubLObject error_handling) {
        _csetf_sqlc_error_handling(connection, error_handling);
        return connection;
    }

    public static SubLObject new_sql_response(final SubLObject code, final SubLObject value) {
        return cons(code, value);
    }

    public static SubLObject sql_response_code(final SubLObject response) {
        return response.first();
    }

    public static SubLObject sql_response_value(final SubLObject response) {
        final SubLObject code = sql_response_code(response);
        if (code.isNegative()) {
            final SubLObject args = response.rest();
            final SubLObject message = args.first();
            final SubLObject vendor_code = second(args);
            return new_sdbc_error(code, message, vendor_code);
        }
        if (code.eql($stop_response$.getGlobalValue())) {
            return $STOP;
        }
        return response.rest();
    }

    public static SubLObject sql_null_p(final SubLObject v_object) {
        return eq(v_object, $NULL);
    }

    public static SubLObject sql_true_p(final SubLObject v_object) {
        return v_object;
    }

    public static SubLObject sql_false_p(final SubLObject v_object) {
        return makeBoolean(NIL == v_object);
    }

    public static SubLObject sdbc_error_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        sdbc_error_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sdbc_error_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$sdbc_error_native.class ? T : NIL;
    }

    public static SubLObject sdbc_error_type(final SubLObject v_object) {
        assert NIL != sdbc_error_p(v_object) : "sdbc.sdbc_error_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sdbc_error_message(final SubLObject v_object) {
        assert NIL != sdbc_error_p(v_object) : "sdbc.sdbc_error_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sdbc_error_code(final SubLObject v_object) {
        assert NIL != sdbc_error_p(v_object) : "sdbc.sdbc_error_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_sdbc_error_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != sdbc_error_p(v_object) : "sdbc.sdbc_error_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sdbc_error_message(final SubLObject v_object, final SubLObject value) {
        assert NIL != sdbc_error_p(v_object) : "sdbc.sdbc_error_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sdbc_error_code(final SubLObject v_object, final SubLObject value) {
        assert NIL != sdbc_error_p(v_object) : "sdbc.sdbc_error_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_sdbc_error(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sdbc_error_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TYPE)) {
                _csetf_sdbc_error_type(v_new, current_value);
            } else
                if (pcase_var.eql($MESSAGE)) {
                    _csetf_sdbc_error_message(v_new, current_value);
                } else
                    if (pcase_var.eql($CODE)) {
                        _csetf_sdbc_error_code(v_new, current_value);
                    } else {
                        Errors.error($str82$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sdbc_error(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SDBC_ERROR, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TYPE, sdbc_error_type(obj));
        funcall(visitor_fn, obj, $SLOT, $MESSAGE, sdbc_error_message(obj));
        funcall(visitor_fn, obj, $SLOT, $CODE, sdbc_error_code(obj));
        funcall(visitor_fn, obj, $END, MAKE_SDBC_ERROR, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sdbc_error_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sdbc_error(obj, visitor_fn);
    }

    public static SubLObject sdbc_error_throw(final SubLObject error) {
        assert NIL != sdbc_error_p(error) : "sdbc.sdbc_error_p(error) " + "CommonSymbols.NIL != sdbc.sdbc_error_p(error) " + error;
        Errors.error($str162$_a, sdbc_error_message(error));
        return NIL;
    }

    public static SubLObject sdbc_error_warn(final SubLObject error) {
        assert NIL != sdbc_error_p(error) : "sdbc.sdbc_error_p(error) " + "CommonSymbols.NIL != sdbc.sdbc_error_p(error) " + error;
        Errors.warn($str163$SDBC__a___a, decode_sdbc_error_code(sdbc_error_type(error)), sdbc_error_message(error));
        return NIL;
    }

    public static SubLObject sdbc_server_error_p(final SubLObject v_object) {
        return makeBoolean((NIL != sdbc_error_p(v_object)) && (NIL == sdbc_client_error_p(v_object)));
    }

    public static SubLObject sdbc_client_error_p(final SubLObject v_object) {
        return makeBoolean((NIL != sdbc_error_p(v_object)) && sdbc_error_type(v_object).eql($client_error$.getGlobalValue()));
    }

    public static SubLObject sdbc_sql_error_p(final SubLObject v_object) {
        return makeBoolean((NIL != sdbc_error_p(v_object)) && sdbc_error_type(v_object).eql($sql_error$.getGlobalValue()));
    }

    public static SubLObject sdbc_io_error_p(final SubLObject v_object) {
        return makeBoolean((NIL != sdbc_error_p(v_object)) && sdbc_error_type(v_object).eql($io_error$.getGlobalValue()));
    }

    public static SubLObject sdbc_transaction_error_p(final SubLObject v_object) {
        return makeBoolean((NIL != sdbc_error_p(v_object)) && sdbc_error_type(v_object).eql($transaction_error$.getGlobalValue()));
    }

    public static SubLObject sdbc_batch_update_error_p(final SubLObject v_object) {
        return makeBoolean((NIL != sdbc_error_p(v_object)) && sdbc_error_type(v_object).eql($batch_update_error$.getGlobalValue()));
    }

    public static SubLObject sdbc_other_error_p(final SubLObject v_object) {
        return makeBoolean((NIL != sdbc_error_p(v_object)) && sdbc_error_type(v_object).eql($unknown_error$.getGlobalValue()));
    }

    public static SubLObject new_sdbc_error(final SubLObject type, final SubLObject message, SubLObject code) {
        if (code == UNPROVIDED) {
            code = NIL;
        }
        final SubLObject error = make_sdbc_error(UNPROVIDED);
        _csetf_sdbc_error_type(error, type);
        _csetf_sdbc_error_message(error, message);
        _csetf_sdbc_error_code(error, code);
        return error;
    }

    public static SubLObject sdbc_error_print(final SubLObject error, final SubLObject stream, final SubLObject depth) {
        write_string($str164$__SDBC, stream, UNPROVIDED, UNPROVIDED);
        write_string(decode_sdbc_error_code(sdbc_error_type(error)), stream, UNPROVIDED, UNPROVIDED);
        write_string($str165$_ERROR__, stream, UNPROVIDED, UNPROVIDED);
        write_string(sdbc_error_message(error), stream, UNPROVIDED, UNPROVIDED);
        write_string($str166$_, stream, UNPROVIDED, UNPROVIDED);
        return error;
    }

    public static SubLObject decode_sdbc_error_code(final SubLObject code) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return assoc(code, $sdbc_error_decoding$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
    }

    public static SubLObject sql_result_set_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        sqlrs_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_result_set_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$sql_result_set_native.class ? T : NIL;
    }

    public static SubLObject sqlrs_rows(final SubLObject v_object) {
        assert NIL != sql_result_set_p(v_object) : "sdbc.sql_result_set_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sqlrs_current(final SubLObject v_object) {
        assert NIL != sql_result_set_p(v_object) : "sdbc.sql_result_set_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sqlrs_last(final SubLObject v_object) {
        assert NIL != sql_result_set_p(v_object) : "sdbc.sql_result_set_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject sqlrs_start(final SubLObject v_object) {
        assert NIL != sql_result_set_p(v_object) : "sdbc.sql_result_set_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject sqlrs_connection(final SubLObject v_object) {
        assert NIL != sql_result_set_p(v_object) : "sdbc.sql_result_set_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject sqlrs_block_size(final SubLObject v_object) {
        assert NIL != sql_result_set_p(v_object) : "sdbc.sql_result_set_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject sqlrs_id(final SubLObject v_object) {
        assert NIL != sql_result_set_p(v_object) : "sdbc.sql_result_set_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject _csetf_sqlrs_rows(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_result_set_p(v_object) : "sdbc.sql_result_set_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sqlrs_current(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_result_set_p(v_object) : "sdbc.sql_result_set_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sqlrs_last(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_result_set_p(v_object) : "sdbc.sql_result_set_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sqlrs_start(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_result_set_p(v_object) : "sdbc.sql_result_set_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sqlrs_connection(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_result_set_p(v_object) : "sdbc.sql_result_set_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sqlrs_block_size(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_result_set_p(v_object) : "sdbc.sql_result_set_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sqlrs_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_result_set_p(v_object) : "sdbc.sql_result_set_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject make_sql_result_set(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_result_set_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ROWS)) {
                _csetf_sqlrs_rows(v_new, current_value);
            } else
                if (pcase_var.eql($CURRENT)) {
                    _csetf_sqlrs_current(v_new, current_value);
                } else
                    if (pcase_var.eql($LAST)) {
                        _csetf_sqlrs_last(v_new, current_value);
                    } else
                        if (pcase_var.eql($START)) {
                            _csetf_sqlrs_start(v_new, current_value);
                        } else
                            if (pcase_var.eql($CONNECTION)) {
                                _csetf_sqlrs_connection(v_new, current_value);
                            } else
                                if (pcase_var.eql($BLOCK_SIZE)) {
                                    _csetf_sqlrs_block_size(v_new, current_value);
                                } else
                                    if (pcase_var.eql($ID)) {
                                        _csetf_sqlrs_id(v_new, current_value);
                                    } else {
                                        Errors.error($str82$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_result_set(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_RESULT_SET, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ROWS, sqlrs_rows(obj));
        funcall(visitor_fn, obj, $SLOT, $CURRENT, sqlrs_current(obj));
        funcall(visitor_fn, obj, $SLOT, $LAST, sqlrs_last(obj));
        funcall(visitor_fn, obj, $SLOT, $START, sqlrs_start(obj));
        funcall(visitor_fn, obj, $SLOT, $CONNECTION, sqlrs_connection(obj));
        funcall(visitor_fn, obj, $SLOT, $BLOCK_SIZE, sqlrs_block_size(obj));
        funcall(visitor_fn, obj, $SLOT, $ID, sqlrs_id(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_RESULT_SET, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_result_set_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_result_set(obj, visitor_fn);
    }

    public static SubLObject sqlrs_print(final SubLObject rs, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(rs, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, rs, T, T);
            if (NIL != sqlrs_open_p(rs)) {
                final SubLObject row_count = sqlrs_row_count(rs);
                final SubLObject column_count = sqlrs_column_count(rs);
                write_string($str206$_, stream, UNPROVIDED, UNPROVIDED);
                princ(row_count, stream);
                write_string(row_count.numE(ONE_INTEGER) ? $str207$_row__ : $str208$_rows__, stream, UNPROVIDED, UNPROVIDED);
                princ(column_count, stream);
                write_string(column_count.numE(ONE_INTEGER) ? $str209$_column_ : $str210$_columns_, stream, UNPROVIDED, UNPROVIDED);
            } else {
                write_string($$$closed, stream, UNPROVIDED, UNPROVIDED);
            }
            print_macros.print_unreadable_object_postamble(stream, rs, T, T);
        }
        return rs;
    }

    public static SubLObject sql_open_result_set_p(final SubLObject v_object) {
        return makeBoolean((NIL != sql_result_set_p(v_object)) && (NIL != sqlrs_open_p(v_object)));
    }

    public static SubLObject sqlrs_close(final SubLObject rs) {
        assert NIL != sql_result_set_p(rs) : "sdbc.sql_result_set_p(rs) " + "CommonSymbols.NIL != sdbc.sql_result_set_p(rs) " + rs;
        if (NIL != sqlrs_open_p(rs)) {
            final SubLObject status = sqlc_execute(sqlrs_connection(rs), $close_result_set$.getGlobalValue(), list(sqlrs_id(rs)));
            sqlrs_local_close(rs);
            return NIL != sdbc_error_p(status) ? status : rs;
        }
        return NIL;
    }

    public static SubLObject sqlrs_emptyP(final SubLObject rs) {
        return eql(ZERO_INTEGER, sqlrs_row_count(rs));
    }

    public static SubLObject sqlrs_absolute(final SubLObject rs, final SubLObject i) {
        assert NIL != sql_open_result_set_p(rs) : "sdbc.sql_open_result_set_p(rs) " + "CommonSymbols.NIL != sdbc.sql_open_result_set_p(rs) " + rs;
        assert NIL != integerp(i) : "Types.integerp(i) " + "CommonSymbols.NIL != Types.integerp(i) " + i;
        if (NIL != subl_promotions.negative_integer_p(i)) {
            _csetf_sqlrs_current(rs, max(add(sqlrs_last(rs), ONE_INTEGER, i), ZERO_INTEGER));
        } else {
            _csetf_sqlrs_current(rs, min(i, number_utilities.f_1X(sqlrs_last(rs))));
        }
        return sqlrs_valid_row_p(rs);
    }

    public static SubLObject sqlrs_next(final SubLObject rs) {
        assert NIL != sql_open_result_set_p(rs) : "sdbc.sql_open_result_set_p(rs) " + "CommonSymbols.NIL != sdbc.sql_open_result_set_p(rs) " + rs;
        if (sqlrs_current(rs).numLE(sqlrs_last(rs))) {
            _csetf_sqlrs_current(rs, add(sqlrs_current(rs), ONE_INTEGER));
        }
        return numLE(sqlrs_current(rs), sqlrs_last(rs));
    }

    public static SubLObject sqlrs_previous(final SubLObject rs) {
        assert NIL != sql_open_result_set_p(rs) : "sdbc.sql_open_result_set_p(rs) " + "CommonSymbols.NIL != sdbc.sql_open_result_set_p(rs) " + rs;
        if (sqlrs_current(rs).numG(ZERO_INTEGER)) {
            _csetf_sqlrs_current(rs, subtract(sqlrs_current(rs), ONE_INTEGER));
        }
        return numG(sqlrs_current(rs), ZERO_INTEGER);
    }

    public static SubLObject sqlrs_is_last(final SubLObject rs) {
        assert NIL != sql_open_result_set_p(rs) : "sdbc.sql_open_result_set_p(rs) " + "CommonSymbols.NIL != sdbc.sql_open_result_set_p(rs) " + rs;
        return eql(sqlrs_current(rs), sqlrs_last(rs));
    }

    public static SubLObject sqlrs_is_first(final SubLObject rs) {
        assert NIL != sql_open_result_set_p(rs) : "sdbc.sql_open_result_set_p(rs) " + "CommonSymbols.NIL != sdbc.sql_open_result_set_p(rs) " + rs;
        return eql(sqlrs_current(rs), ONE_INTEGER);
    }

    public static SubLObject sqlrs_column_count(final SubLObject rs) {
        assert NIL != sql_open_result_set_p(rs) : "sdbc.sql_open_result_set_p(rs) " + "CommonSymbols.NIL != sdbc.sql_open_result_set_p(rs) " + rs;
        return sqlrs_row_count(rs).numG(ZERO_INTEGER) ? length(aref(sqlrs_rows(rs), ZERO_INTEGER)) : ZERO_INTEGER;
    }

    public static SubLObject sqlrs_row_count(final SubLObject rs) {
        assert NIL != sql_open_result_set_p(rs) : "sdbc.sql_open_result_set_p(rs) " + "CommonSymbols.NIL != sdbc.sql_open_result_set_p(rs) " + rs;
        return sqlrs_last(rs);
    }

    public static SubLObject sqlrs_get_row(final SubLObject rs) {
        assert NIL != sql_open_result_set_p(rs) : "sdbc.sql_open_result_set_p(rs) " + "CommonSymbols.NIL != sdbc.sql_open_result_set_p(rs) " + rs;
        return sqlrs_current(rs);
    }

    public static SubLObject sqlrs_get_object(final SubLObject rs, final SubLObject i) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sql_open_result_set_p(rs) : "sdbc.sql_open_result_set_p(rs) " + "CommonSymbols.NIL != sdbc.sql_open_result_set_p(rs) " + rs;
        assert NIL != subl_promotions.positive_integer_p(i) : "subl_promotions.positive_integer_p(i) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(i) " + i;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == sqlrs_valid_row_p(rs))) {
            Errors.error($$$cursor_not_on_valid_row);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == sqlrs_valid_column_p(rs, i))) {
            Errors.error($str214$invalid_column__a, i);
        }
        if (NIL == sqlrs_row_local_p(rs)) {
            final SubLObject range = sqlrs_block(rs, sqlrs_current(rs));
            final SubLObject lo = range.first();
            final SubLObject hi = range.rest();
            final SubLObject rs2 = sqlc_execute(sqlrs_connection(rs), $get_rows$.getGlobalValue(), list(sqlrs_id(rs), lo, hi));
            if (NIL != sdbc_error_p(rs2)) {
                return rs2;
            }
            _csetf_sqlrs_rows(rs, sqlrs_rows(rs2));
            _csetf_sqlrs_start(rs, lo);
        }
        return aref(aref(sqlrs_rows(rs), subtract(sqlrs_current(rs), sqlrs_start(rs))), number_utilities.f_1_(i));
    }

    public static SubLObject sqlrs_get_object_tuple(final SubLObject rs) {
        assert NIL != sql_open_result_set_p(rs) : "sdbc.sql_open_result_set_p(rs) " + "CommonSymbols.NIL != sdbc.sql_open_result_set_p(rs) " + rs;
        final SubLObject columns = sqlrs_column_count(rs);
        final SubLObject tuple = make_list(columns, UNPROVIDED);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(columns); i = add(i, ONE_INTEGER)) {
            set_nth(i, tuple, sqlrs_get_object(rs, number_utilities.f_1X(i)));
        }
        return tuple;
    }

    public static SubLObject new_sql_result_set(final SubLObject first, final SubLObject rows, final SubLObject row_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.non_negative_integer_p(first) : "subl_promotions.non_negative_integer_p(first) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(first) " + first;
        assert NIL != vectorp(rows) : "Types.vectorp(rows) " + "CommonSymbols.NIL != Types.vectorp(rows) " + rows;
        assert NIL != subl_promotions.non_negative_integer_p(row_count) : "subl_promotions.non_negative_integer_p(row_count) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(row_count) " + row_count;
        final SubLObject rs = make_sql_result_set(UNPROVIDED);
        _csetf_sqlrs_start(rs, first);
        _csetf_sqlrs_rows(rs, rows);
        _csetf_sqlrs_current(rs, ZERO_INTEGER);
        _csetf_sqlrs_last(rs, row_count);
        _csetf_sqlrs_connection(rs, T);
        _csetf_sqlrs_block_size(rs, $result_set_block_size$.getDynamicValue(thread));
        return rs;
    }

    public static SubLObject sqlrs_closed_p(final SubLObject rs) {
        return makeBoolean(NIL == sqlrs_open_p(rs));
    }

    public static SubLObject sqlrs_open_p(final SubLObject rs) {
        return list_utilities.sublisp_boolean(sqlrs_connection(rs));
    }

    public static SubLObject sqlrs_valid_row_p(final SubLObject rs) {
        return makeBoolean(sqlrs_current(rs).numG(ZERO_INTEGER) && sqlrs_current(rs).numLE(sqlrs_last(rs)));
    }

    public static SubLObject sqlrs_valid_column_p(final SubLObject rs, final SubLObject i) {
        return makeBoolean(i.numG(ZERO_INTEGER) && i.numLE(sqlrs_column_count(rs)));
    }

    public static SubLObject sqlrs_block(final SubLObject rs, final SubLObject row) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!row.numG(ZERO_INTEGER)) || (!row.numLE(sqlrs_last(rs))))) {
            Errors.error($str217$invalid_row__a, row);
        }
        final SubLObject lo = number_utilities.f_1X(multiply(floor(number_utilities.f_1_(row), sqlrs_block_size(rs)), $result_set_block_size$.getDynamicValue(thread)));
        final SubLObject hi = min(sqlrs_last(rs), add(lo, sqlrs_block_size(rs), MINUS_ONE_INTEGER));
        return cons(lo, hi);
    }

    public static SubLObject sqlrs_row_local_p(final SubLObject rs) {
        return makeBoolean(sqlrs_current(rs).numGE(sqlrs_start(rs)) && sqlrs_current(rs).numL(add(sqlrs_start(rs), sqlrs_block_size(rs))));
    }

    public static SubLObject sqlrs_row_remote_p(final SubLObject rs) {
        return makeBoolean(NIL == sqlrs_row_local_p(rs));
    }

    public static SubLObject sqlrs_local_close(final SubLObject rs) {
        _csetf_sqlrs_rows(rs, NIL);
        _csetf_sqlrs_connection(rs, NIL);
        return rs;
    }

    public static SubLObject sql_statement_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sql_statement_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$sql_statement_native.class ? T : NIL;
    }

    public static SubLObject sqls_connection(final SubLObject v_object) {
        assert NIL != sql_statement_p(v_object) : "sdbc.sql_statement_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sqls_id(final SubLObject v_object) {
        assert NIL != sql_statement_p(v_object) : "sdbc.sql_statement_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sqls_sql(final SubLObject v_object) {
        assert NIL != sql_statement_p(v_object) : "sdbc.sql_statement_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject sqls_settings(final SubLObject v_object) {
        assert NIL != sql_statement_p(v_object) : "sdbc.sql_statement_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject sqls_batch(final SubLObject v_object) {
        assert NIL != sql_statement_p(v_object) : "sdbc.sql_statement_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject sqls_rs(final SubLObject v_object) {
        assert NIL != sql_statement_p(v_object) : "sdbc.sql_statement_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject _csetf_sqls_connection(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_statement_p(v_object) : "sdbc.sql_statement_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sqls_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_statement_p(v_object) : "sdbc.sql_statement_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sqls_sql(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_statement_p(v_object) : "sdbc.sql_statement_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sqls_settings(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_statement_p(v_object) : "sdbc.sql_statement_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sqls_batch(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_statement_p(v_object) : "sdbc.sql_statement_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sqls_rs(final SubLObject v_object, final SubLObject value) {
        assert NIL != sql_statement_p(v_object) : "sdbc.sql_statement_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject make_sql_statement(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sql_statement_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CONNECTION)) {
                _csetf_sqls_connection(v_new, current_value);
            } else
                if (pcase_var.eql($ID)) {
                    _csetf_sqls_id(v_new, current_value);
                } else
                    if (pcase_var.eql($SQL)) {
                        _csetf_sqls_sql(v_new, current_value);
                    } else
                        if (pcase_var.eql($SETTINGS)) {
                            _csetf_sqls_settings(v_new, current_value);
                        } else
                            if (pcase_var.eql($BATCH)) {
                                _csetf_sqls_batch(v_new, current_value);
                            } else
                                if (pcase_var.eql($RS)) {
                                    _csetf_sqls_rs(v_new, current_value);
                                } else {
                                    Errors.error($str82$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sql_statement(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SQL_STATEMENT, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CONNECTION, sqls_connection(obj));
        funcall(visitor_fn, obj, $SLOT, $ID, sqls_id(obj));
        funcall(visitor_fn, obj, $SLOT, $SQL, sqls_sql(obj));
        funcall(visitor_fn, obj, $SLOT, $SETTINGS, sqls_settings(obj));
        funcall(visitor_fn, obj, $SLOT, $BATCH, sqls_batch(obj));
        funcall(visitor_fn, obj, $SLOT, $RS, sqls_rs(obj));
        funcall(visitor_fn, obj, $END, MAKE_SQL_STATEMENT, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sql_statement_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sql_statement(obj, visitor_fn);
    }

    public static SubLObject sqls_open_p(final SubLObject statement) {
        assert NIL != sql_statement_p(statement) : "sdbc.sql_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_statement_p(statement) " + statement;
        return makeBoolean((NIL != sqls_connection(statement)) && (NIL != sqlc_open_p(sqls_connection(statement))));
    }

    public static SubLObject sql_open_statement_p(final SubLObject v_object) {
        return makeBoolean(((NIL != sql_statement_p(v_object)) && (NIL != sql_connection_p(sqls_connection(v_object)))) && (NIL != sqlc_open_p(sqls_connection(v_object))));
    }

    public static SubLObject sqls_execute_query(final SubLObject statement, final SubLObject sql, SubLObject block_size) {
        if (block_size == UNPROVIDED) {
            block_size = $result_set_block_size$.getDynamicValue();
        }
        assert NIL != sql_open_statement_p(statement) : "sdbc.sql_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_open_statement_p(statement) " + statement;
        assert NIL != stringp(sql) : "Types.stringp(sql) " + "CommonSymbols.NIL != Types.stringp(sql) " + sql;
        assert NIL != subl_promotions.positive_integer_p(block_size) : "subl_promotions.positive_integer_p(block_size) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(block_size) " + block_size;
        final SubLObject rs = sqlc_execute(sqls_connection(statement), $execute_query$.getGlobalValue(), list(sqls_id(statement), sql, block_size));
        if (NIL != sql_result_set_p(rs)) {
            _csetf_sqlrs_connection(rs, sqls_connection(statement));
            _csetf_sqlrs_id(rs, sqls_id(statement));
            _csetf_sqlrs_block_size(rs, block_size);
            if (NIL != sqls_rs(statement)) {
                sqlrs_local_close(sqls_rs(statement));
            }
            _csetf_sqls_rs(statement, rs);
        }
        return rs;
    }

    public static SubLObject sqls_execute_update(final SubLObject statement, final SubLObject sql) {
        assert NIL != sql_open_statement_p(statement) : "sdbc.sql_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_open_statement_p(statement) " + statement;
        assert NIL != stringp(sql) : "Types.stringp(sql) " + "CommonSymbols.NIL != Types.stringp(sql) " + sql;
        return sqlc_execute(sqls_connection(statement), $execute_update$.getGlobalValue(), list(sqls_id(statement), sql));
    }

    public static SubLObject sqls_cancel(final SubLObject statement) {
        assert NIL != sql_open_statement_p(statement) : "sdbc.sql_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_open_statement_p(statement) " + statement;
        return sqlc_execute(sqls_connection(statement), $cancel$.getGlobalValue(), list(sqls_id(statement)));
    }

    public static SubLObject sqls_get_generated_keys(final SubLObject statement, SubLObject block_size) {
        if (block_size == UNPROVIDED) {
            block_size = $result_set_block_size$.getDynamicValue();
        }
        assert NIL != sql_open_statement_p(statement) : "sdbc.sql_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_open_statement_p(statement) " + statement;
        assert NIL != subl_promotions.positive_integer_p(block_size) : "subl_promotions.positive_integer_p(block_size) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(block_size) " + block_size;
        final SubLObject rs = sqlc_execute(sqls_connection(statement), $get_generated_keys$.getGlobalValue(), list(sqls_id(statement), block_size));
        if (NIL != sql_result_set_p(rs)) {
            _csetf_sqlrs_connection(rs, sqls_connection(statement));
            _csetf_sqlrs_id(rs, sqls_id(statement));
            _csetf_sqlrs_block_size(rs, block_size);
            if (NIL != sqls_rs(statement)) {
                sqlrs_local_close(sqls_rs(statement));
            }
            _csetf_sqls_rs(statement, rs);
        }
        return rs;
    }

    public static SubLObject sqls_close(final SubLObject statement) {
        assert NIL != sql_statement_p(statement) : "sdbc.sql_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_statement_p(statement) " + statement;
        SubLObject result = NIL;
        if (NIL != sqls_open_p(statement)) {
            result = sqlc_execute(sqls_connection(statement), $close_statement$.getGlobalValue(), list(sqls_id(statement)));
        }
        sqls_local_close(statement);
        return NIL != sdbc_error_p(result) ? result : statement;
    }

    public static SubLObject sqls_add_batch(final SubLObject statement, final SubLObject sql) {
        assert NIL != sql_open_statement_p(statement) : "sdbc.sql_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_open_statement_p(statement) " + statement;
        assert NIL != stringp(sql) : "Types.stringp(sql) " + "CommonSymbols.NIL != Types.stringp(sql) " + sql;
        _csetf_sqls_batch(statement, cons(sql, sqls_batch(statement)));
        return sql;
    }

    public static SubLObject sqls_clear_batch(final SubLObject statement) {
        assert NIL != sql_open_statement_p(statement) : "sdbc.sql_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_open_statement_p(statement) " + statement;
        final SubLObject count = length(sqls_batch(statement));
        _csetf_sqls_batch(statement, NIL);
        return count;
    }

    public static SubLObject sqls_execute_batch(final SubLObject statement) {
        assert NIL != sql_open_statement_p(statement) : "sdbc.sql_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_open_statement_p(statement) " + statement;
        final SubLObject batch = sqls_batch(statement);
        sqls_clear_batch(statement);
        return NIL != batch ? sqlc_execute(sqls_connection(statement), $execute_batch$.getGlobalValue(), list(sqls_id(statement), nreverse(batch))) : NIL;
    }

    public static SubLObject sql_prepared_statement_p(final SubLObject v_object) {
        return makeBoolean((NIL != sql_statement_p(v_object)) && (NIL != sqls_sql(v_object)));
    }

    public static SubLObject sql_prepared_open_statement_p(final SubLObject v_object) {
        return makeBoolean((NIL != sql_open_statement_p(v_object)) && (NIL != sqls_sql(v_object)));
    }

    public static SubLObject sqlps_execute_query(final SubLObject statement, SubLObject block_size) {
        if (block_size == UNPROVIDED) {
            block_size = $result_set_block_size$.getDynamicValue();
        }
        assert NIL != sql_prepared_open_statement_p(statement) : "sdbc.sql_prepared_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_prepared_open_statement_p(statement) " + statement;
        assert NIL != subl_promotions.positive_integer_p(block_size) : "subl_promotions.positive_integer_p(block_size) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(block_size) " + block_size;
        if (NIL != sqls_rs(statement)) {
            sqlrs_close(sqls_rs(statement));
        }
        final SubLObject settings = sqls_settings(statement);
        final SubLObject rs = sqlc_execute(sqls_connection(statement), $ps_execute_query$.getGlobalValue(), list(sqls_id(statement), nreverse(settings), block_size));
        _csetf_sqls_settings(statement, NIL);
        _csetf_sqlrs_connection(rs, sqls_connection(statement));
        _csetf_sqlrs_id(rs, sqls_id(statement));
        _csetf_sqlrs_block_size(rs, block_size);
        if (NIL != sqls_rs(statement)) {
            sqlrs_local_close(sqls_rs(statement));
        }
        _csetf_sqls_rs(statement, rs);
        return rs;
    }

    public static SubLObject sqlps_execute_update(final SubLObject statement) {
        assert NIL != sql_prepared_open_statement_p(statement) : "sdbc.sql_prepared_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_prepared_open_statement_p(statement) " + statement;
        final SubLObject settings = sqls_settings(statement);
        _csetf_sqls_settings(statement, NIL);
        return sqlc_execute(sqls_connection(statement), $ps_execute_update$.getGlobalValue(), list(sqls_id(statement), nreverse(settings)));
    }

    public static SubLObject sqlps_set_bytes(final SubLObject statement, final SubLObject parameter, final SubLObject bytes) {
        assert NIL != sql_prepared_open_statement_p(statement) : "sdbc.sql_prepared_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_prepared_open_statement_p(statement) " + statement;
        assert NIL != subl_promotions.non_negative_integer_p(parameter) : "subl_promotions.non_negative_integer_p(parameter) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(parameter) " + parameter;
        assert NIL != vector_utilities.byte_vector_p(bytes) : "vector_utilities.byte_vector_p(bytes) " + "CommonSymbols.NIL != vector_utilities.byte_vector_p(bytes) " + bytes;
        return sqlps_set(statement, $set_bytes$.getGlobalValue(), parameter, bytes);
    }

    public static SubLObject sqlps_set_int(final SubLObject statement, final SubLObject parameter, final SubLObject v_int) {
        assert NIL != sql_prepared_open_statement_p(statement) : "sdbc.sql_prepared_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_prepared_open_statement_p(statement) " + statement;
        assert NIL != subl_promotions.non_negative_integer_p(parameter) : "subl_promotions.non_negative_integer_p(parameter) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(parameter) " + parameter;
        assert NIL != java_integerp(v_int) : "sdbc.java_integerp(v_int) " + "CommonSymbols.NIL != sdbc.java_integerp(v_int) " + v_int;
        return sqlps_set(statement, $set_int$.getGlobalValue(), parameter, v_int);
    }

    public static SubLObject sqlps_set_long(final SubLObject statement, final SubLObject parameter, final SubLObject v_long) {
        assert NIL != sql_prepared_open_statement_p(statement) : "sdbc.sql_prepared_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_prepared_open_statement_p(statement) " + statement;
        assert NIL != subl_promotions.non_negative_integer_p(parameter) : "subl_promotions.non_negative_integer_p(parameter) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(parameter) " + parameter;
        assert NIL != java_longp(v_long) : "sdbc.java_longp(v_long) " + "CommonSymbols.NIL != sdbc.java_longp(v_long) " + v_long;
        return sqlps_set(statement, $set_long$.getGlobalValue(), parameter, v_long);
    }

    public static SubLObject sqlps_set_float(final SubLObject statement, final SubLObject parameter, final SubLObject v_float) {
        assert NIL != sql_prepared_open_statement_p(statement) : "sdbc.sql_prepared_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_prepared_open_statement_p(statement) " + statement;
        assert NIL != subl_promotions.non_negative_integer_p(parameter) : "subl_promotions.non_negative_integer_p(parameter) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(parameter) " + parameter;
        assert NIL != java_floatp(v_float) : "sdbc.java_floatp(v_float) " + "CommonSymbols.NIL != sdbc.java_floatp(v_float) " + v_float;
        return sqlps_set(statement, $set_float$.getGlobalValue(), parameter, v_float);
    }

    public static SubLObject sqlps_set_double(final SubLObject statement, final SubLObject parameter, final SubLObject v_double) {
        assert NIL != sql_prepared_open_statement_p(statement) : "sdbc.sql_prepared_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_prepared_open_statement_p(statement) " + statement;
        assert NIL != subl_promotions.non_negative_integer_p(parameter) : "subl_promotions.non_negative_integer_p(parameter) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(parameter) " + parameter;
        assert NIL != java_doublep(v_double) : "sdbc.java_doublep(v_double) " + "CommonSymbols.NIL != sdbc.java_doublep(v_double) " + v_double;
        return sqlps_set(statement, $set_double$.getGlobalValue(), parameter, v_double);
    }

    public static SubLObject sqlps_set_string(final SubLObject statement, final SubLObject parameter, final SubLObject string) {
        assert NIL != sql_prepared_open_statement_p(statement) : "sdbc.sql_prepared_open_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_prepared_open_statement_p(statement) " + statement;
        assert NIL != subl_promotions.non_negative_integer_p(parameter) : "subl_promotions.non_negative_integer_p(parameter) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(parameter) " + parameter;
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        return sqlps_set(statement, $set_string$.getGlobalValue(), parameter, string);
    }

    public static SubLObject new_sql_statement(final SubLObject connection) {
        SubLObject statement = make_sql_statement(UNPROVIDED);
        SubLObject result = NIL;
        _csetf_sqls_connection(statement, connection);
        _csetf_sqls_id(statement, new_statement_id());
        result = sqlc_execute(connection, $create_statement$.getGlobalValue(), list(sqls_id(statement)));
        if (NIL != sdbc_error_p(result)) {
            statement = result;
        }
        return statement;
    }

    public static SubLObject sqls_get_connection(final SubLObject statement) {
        assert NIL != sql_statement_p(statement) : "sdbc.sql_statement_p(statement) " + "CommonSymbols.NIL != sdbc.sql_statement_p(statement) " + statement;
        return sqls_connection(statement);
    }

    public static SubLObject sqls_local_close(final SubLObject statement) {
        if (NIL != sqls_rs(statement)) {
            sqlrs_local_close(sqls_rs(statement));
            _csetf_sqls_rs(statement, NIL);
        }
        if (NIL != sqls_connection(statement)) {
            _csetf_sqlc_statements(sqls_connection(statement), remove(statement, sqlc_statements(sqls_connection(statement)), EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            _csetf_sqls_connection(statement, NIL);
        }
        return statement;
    }

    public static SubLObject sqlps_set(final SubLObject statement, final SubLObject command, final SubLObject parameter, final SubLObject data) {
        final SubLObject setting = list(command, parameter, data);
        _csetf_sqls_settings(statement, cons(setting, sqls_settings(statement)));
        return setting;
    }

    public static SubLObject new_sql_prepared_statement(final SubLObject connection, final SubLObject sql) {
        SubLObject statement = make_sql_statement(UNPROVIDED);
        SubLObject result = NIL;
        _csetf_sqls_connection(statement, connection);
        _csetf_sqls_id(statement, new_statement_id());
        _csetf_sqls_sql(statement, sql);
        result = sqlc_execute(sqls_connection(statement), $prepare_statement$.getGlobalValue(), list(sqls_id(statement), sql));
        if (NIL != sdbc_error_p(result)) {
            statement = result;
        }
        return statement;
    }

    public static SubLObject new_statement_id() {
        return princ_to_string(gensym($$$STMT));
    }

    public static SubLObject new_result_set_id() {
        return princ_to_string(gensym($$$RS));
    }

    public static SubLObject sqlc_get_tables(final SubLObject connection, final SubLObject catalog, final SubLObject schema_pattern, final SubLObject table_name_pattern, final SubLObject types) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sql_open_connection_p(connection) : "sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) " + connection;
        assert NIL != stringp(schema_pattern) : "Types.stringp(schema_pattern) " + "CommonSymbols.NIL != Types.stringp(schema_pattern) " + schema_pattern;
        assert NIL != stringp(table_name_pattern) : "Types.stringp(table_name_pattern) " + "CommonSymbols.NIL != Types.stringp(table_name_pattern) " + table_name_pattern;
        assert NIL != listp(types) : "Types.listp(types) " + "CommonSymbols.NIL != Types.listp(types) " + types;
        final SubLObject rs = sqlc_execute(connection, $get_tables$.getGlobalValue(), list(catalog, schema_pattern, table_name_pattern, types, $result_set_block_size$.getDynamicValue(thread)));
        if (NIL != sql_result_set_p(rs)) {
            _csetf_sqlrs_connection(rs, connection);
            _csetf_sqlrs_id(rs, $connection_id$.getGlobalValue());
        }
        return rs;
    }

    public static SubLObject sqlc_get_tables_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema_pattern, final SubLObject table_name_pattern, final SubLObject types) {
        final SubLObject result_set = apply(SQLC_GET_TABLES, list(connection, catalog, schema_pattern, table_name_pattern, types));
        if (NIL == sql_result_set_p(result_set)) {
            Errors.warn($str256$SQLC_error___A, result_set);
            return NIL;
        }
        final SubLObject column_count = sqlrs_column_count(result_set);
        SubLObject results = NIL;
        while (NIL == sqlrs_is_last(result_set)) {
            sqlrs_next(result_set);
            SubLObject i = ZERO_INTEGER;
            SubLObject v_bindings = NIL;
            SubLObject cdolist_list_var = $list257;
            SubLObject key = NIL;
            key = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                i = add(i, ONE_INTEGER);
                if (i.numLE(column_count)) {
                    v_bindings = cons(key, v_bindings);
                    v_bindings = cons(sqlrs_get_object(result_set, i), v_bindings);
                }
                cdolist_list_var = cdolist_list_var.rest();
                key = cdolist_list_var.first();
            } 
            results = cons(nreverse(v_bindings), results);
        } 
        return nreverse(results);
    }

    public static SubLObject sqlc_get_columns(final SubLObject connection, final SubLObject catalog, final SubLObject schema_pattern, final SubLObject table_name_pattern, final SubLObject column_name_pattern) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sql_open_connection_p(connection) : "sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) " + connection;
        assert NIL != stringp(catalog) : "Types.stringp(catalog) " + "CommonSymbols.NIL != Types.stringp(catalog) " + catalog;
        assert NIL != stringp(schema_pattern) : "Types.stringp(schema_pattern) " + "CommonSymbols.NIL != Types.stringp(schema_pattern) " + schema_pattern;
        assert NIL != stringp(table_name_pattern) : "Types.stringp(table_name_pattern) " + "CommonSymbols.NIL != Types.stringp(table_name_pattern) " + table_name_pattern;
        assert NIL != stringp(column_name_pattern) : "Types.stringp(column_name_pattern) " + "CommonSymbols.NIL != Types.stringp(column_name_pattern) " + column_name_pattern;
        final SubLObject rs = sqlc_execute(connection, $get_columns$.getGlobalValue(), list(catalog, schema_pattern, table_name_pattern, column_name_pattern, $result_set_block_size$.getDynamicValue(thread)));
        if (NIL != sql_result_set_p(rs)) {
            _csetf_sqlrs_connection(rs, connection);
            _csetf_sqlrs_id(rs, $connection_id$.getGlobalValue());
        }
        return rs;
    }

    public static SubLObject sqlc_get_columns_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema_pattern, final SubLObject table_name_pattern, final SubLObject column_name_pattern) {
        final SubLObject result_set = apply(SQLC_GET_COLUMNS, list(connection, catalog, schema_pattern, table_name_pattern, column_name_pattern));
        if (NIL == sql_result_set_p(result_set)) {
            Errors.warn($str256$SQLC_error___A, result_set);
            return NIL;
        }
        final SubLObject column_count = sqlrs_column_count(result_set);
        SubLObject results = NIL;
        while (NIL == sqlrs_is_last(result_set)) {
            sqlrs_next(result_set);
            SubLObject i = ZERO_INTEGER;
            SubLObject v_bindings = NIL;
            SubLObject cdolist_list_var = $list259;
            SubLObject key = NIL;
            key = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                i = add(i, ONE_INTEGER);
                if (i.numLE(column_count)) {
                    v_bindings = cons(key, v_bindings);
                    v_bindings = cons(sqlrs_get_object(result_set, i), v_bindings);
                }
                cdolist_list_var = cdolist_list_var.rest();
                key = cdolist_list_var.first();
            } 
            results = cons(nreverse(v_bindings), results);
        } 
        return nreverse(results);
    }

    public static SubLObject sqlc_get_primary_keys(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(catalog) : "Types.stringp(catalog) " + "CommonSymbols.NIL != Types.stringp(catalog) " + catalog;
        assert NIL != stringp(schema) : "Types.stringp(schema) " + "CommonSymbols.NIL != Types.stringp(schema) " + schema;
        assert NIL != stringp(table) : "Types.stringp(table) " + "CommonSymbols.NIL != Types.stringp(table) " + table;
        final SubLObject rs = sqlc_execute(connection, $get_primary_keys$.getGlobalValue(), list(catalog, schema, table, $result_set_block_size$.getDynamicValue(thread)));
        if (NIL != sql_result_set_p(rs)) {
            _csetf_sqlrs_connection(rs, connection);
            _csetf_sqlrs_id(rs, $connection_id$.getGlobalValue());
        }
        return rs;
    }

    public static SubLObject sqlc_get_primary_keys_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table) {
        final SubLObject result_set = apply(SQLC_GET_PRIMARY_KEYS, list(connection, catalog, schema, table));
        if (NIL == sql_result_set_p(result_set)) {
            Errors.warn($str256$SQLC_error___A, result_set);
            return NIL;
        }
        final SubLObject column_count = sqlrs_column_count(result_set);
        SubLObject results = NIL;
        while (NIL == sqlrs_is_last(result_set)) {
            sqlrs_next(result_set);
            SubLObject i = ZERO_INTEGER;
            SubLObject v_bindings = NIL;
            SubLObject cdolist_list_var = $list261;
            SubLObject key = NIL;
            key = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                i = add(i, ONE_INTEGER);
                if (i.numLE(column_count)) {
                    v_bindings = cons(key, v_bindings);
                    v_bindings = cons(sqlrs_get_object(result_set, i), v_bindings);
                }
                cdolist_list_var = cdolist_list_var.rest();
                key = cdolist_list_var.first();
            } 
            results = cons(nreverse(v_bindings), results);
        } 
        return nreverse(results);
    }

    public static SubLObject sqlc_get_imported_keys(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(catalog) : "Types.stringp(catalog) " + "CommonSymbols.NIL != Types.stringp(catalog) " + catalog;
        assert NIL != stringp(schema) : "Types.stringp(schema) " + "CommonSymbols.NIL != Types.stringp(schema) " + schema;
        assert NIL != stringp(table) : "Types.stringp(table) " + "CommonSymbols.NIL != Types.stringp(table) " + table;
        final SubLObject rs = sqlc_execute(connection, $get_imported_keys$.getGlobalValue(), list(catalog, schema, table, $result_set_block_size$.getDynamicValue(thread)));
        if (NIL != sql_result_set_p(rs)) {
            _csetf_sqlrs_connection(rs, connection);
            _csetf_sqlrs_id(rs, $connection_id$.getGlobalValue());
        }
        return rs;
    }

    public static SubLObject sqlc_get_imported_keys_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table) {
        final SubLObject result_set = apply(SQLC_GET_IMPORTED_KEYS, list(connection, catalog, schema, table));
        if (NIL == sql_result_set_p(result_set)) {
            Errors.warn($str256$SQLC_error___A, result_set);
            return NIL;
        }
        final SubLObject column_count = sqlrs_column_count(result_set);
        SubLObject results = NIL;
        while (NIL == sqlrs_is_last(result_set)) {
            sqlrs_next(result_set);
            SubLObject i = ZERO_INTEGER;
            SubLObject v_bindings = NIL;
            SubLObject cdolist_list_var = $list263;
            SubLObject key = NIL;
            key = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                i = add(i, ONE_INTEGER);
                if (i.numLE(column_count)) {
                    v_bindings = cons(key, v_bindings);
                    v_bindings = cons(sqlrs_get_object(result_set, i), v_bindings);
                }
                cdolist_list_var = cdolist_list_var.rest();
                key = cdolist_list_var.first();
            } 
            results = cons(nreverse(v_bindings), results);
        } 
        return nreverse(results);
    }

    public static SubLObject sqlc_get_exported_keys(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sql_open_connection_p(connection) : "sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) " + connection;
        assert NIL != stringp(catalog) : "Types.stringp(catalog) " + "CommonSymbols.NIL != Types.stringp(catalog) " + catalog;
        assert NIL != stringp(schema) : "Types.stringp(schema) " + "CommonSymbols.NIL != Types.stringp(schema) " + schema;
        assert NIL != stringp(table) : "Types.stringp(table) " + "CommonSymbols.NIL != Types.stringp(table) " + table;
        final SubLObject rs = sqlc_execute(connection, $get_exported_keys$.getGlobalValue(), list(catalog, schema, table, $result_set_block_size$.getDynamicValue(thread)));
        if (NIL != sql_result_set_p(rs)) {
            _csetf_sqlrs_connection(rs, connection);
            _csetf_sqlrs_id(rs, $connection_id$.getGlobalValue());
        }
        return rs;
    }

    public static SubLObject sqlc_get_exported_keys_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table) {
        final SubLObject result_set = apply(SQLC_GET_EXPORTED_KEYS, list(connection, catalog, schema, table));
        if (NIL == sql_result_set_p(result_set)) {
            Errors.warn($str256$SQLC_error___A, result_set);
            return NIL;
        }
        final SubLObject column_count = sqlrs_column_count(result_set);
        SubLObject results = NIL;
        while (NIL == sqlrs_is_last(result_set)) {
            sqlrs_next(result_set);
            SubLObject i = ZERO_INTEGER;
            SubLObject v_bindings = NIL;
            SubLObject cdolist_list_var = $list263;
            SubLObject key = NIL;
            key = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                i = add(i, ONE_INTEGER);
                if (i.numLE(column_count)) {
                    v_bindings = cons(key, v_bindings);
                    v_bindings = cons(sqlrs_get_object(result_set, i), v_bindings);
                }
                cdolist_list_var = cdolist_list_var.rest();
                key = cdolist_list_var.first();
            } 
            results = cons(nreverse(v_bindings), results);
        } 
        return nreverse(results);
    }

    public static SubLObject sqlc_get_index_info(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table, final SubLObject unique, final SubLObject approximate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sql_open_connection_p(connection) : "sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) " + connection;
        assert NIL != stringp(catalog) : "Types.stringp(catalog) " + "CommonSymbols.NIL != Types.stringp(catalog) " + catalog;
        assert NIL != stringp(schema) : "Types.stringp(schema) " + "CommonSymbols.NIL != Types.stringp(schema) " + schema;
        assert NIL != stringp(table) : "Types.stringp(table) " + "CommonSymbols.NIL != Types.stringp(table) " + table;
        assert NIL != booleanp(unique) : "Types.booleanp(unique) " + "CommonSymbols.NIL != Types.booleanp(unique) " + unique;
        assert NIL != booleanp(approximate) : "Types.booleanp(approximate) " + "CommonSymbols.NIL != Types.booleanp(approximate) " + approximate;
        final SubLObject rs = sqlc_execute(connection, $get_index_info$.getGlobalValue(), list(catalog, schema, table, unique, approximate, $result_set_block_size$.getDynamicValue(thread)));
        if (NIL != sql_result_set_p(rs)) {
            _csetf_sqlrs_connection(rs, connection);
            _csetf_sqlrs_id(rs, $connection_id$.getGlobalValue());
        }
        return rs;
    }

    public static SubLObject sqlc_get_index_info_meta_data(final SubLObject connection, final SubLObject catalog, final SubLObject schema, final SubLObject table, final SubLObject unique, final SubLObject approximate) {
        final SubLObject result_set = apply(SQLC_GET_INDEX_INFO, list(connection, catalog, schema, table, unique, approximate));
        if (NIL == sql_result_set_p(result_set)) {
            Errors.warn($str256$SQLC_error___A, result_set);
            return NIL;
        }
        final SubLObject column_count = sqlrs_column_count(result_set);
        SubLObject results = NIL;
        while (NIL == sqlrs_is_last(result_set)) {
            sqlrs_next(result_set);
            SubLObject i = ZERO_INTEGER;
            SubLObject v_bindings = NIL;
            SubLObject cdolist_list_var = $list266;
            SubLObject key = NIL;
            key = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                i = add(i, ONE_INTEGER);
                if (i.numLE(column_count)) {
                    v_bindings = cons(key, v_bindings);
                    v_bindings = cons(sqlrs_get_object(result_set, i), v_bindings);
                }
                cdolist_list_var = cdolist_list_var.rest();
                key = cdolist_list_var.first();
            } 
            results = cons(nreverse(v_bindings), results);
        } 
        return nreverse(results);
    }

    public static SubLObject sqlc_get_max_connections(final SubLObject connection) {
        assert NIL != sql_open_connection_p(connection) : "sdbc.sql_open_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_open_connection_p(connection) " + connection;
        return sqlc_execute(connection, $get_max_connections$.getGlobalValue(), NIL);
    }

    public static SubLObject sdbc_error_handling_tag_p(final SubLObject v_object) {
        return member(v_object, $list267, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject new_db_url(final SubLObject dbms_server, final SubLObject db, final SubLObject user, final SubLObject password, final SubLObject subprotocol, SubLObject port) {
        if (port == UNPROVIDED) {
            port = NIL;
        }
        if (NIL != Strings.string_equal(string_utilities.string_first_n(EIGHT_INTEGER, subprotocol), $str268$com_cyc_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return format(NIL, $str269$_a__a__a, new SubLObject[]{ $sql_protocol$.getGlobalValue(), subprotocol, db });
        }
        SubLObject v_properties = list(new SubLObject[]{ $SUB_PROTOCOL, subprotocol, $DBMS_SERVER, dbms_server, $DATABASE, db, $USER, user, $PASSWORD, password });
        if (NIL != subl_promotions.non_negative_integer_p(port)) {
            v_properties = putf(v_properties, $PORT, port);
        }
        return construct_new_database_connection_url(subprotocol, v_properties);
    }

    public static SubLObject add_sdbc_database_connection_url_description(final SubLObject sub_protocol, final SubLObject pattern, final SubLObject option_names, final SubLObject option_punctuation, final SubLObject defaults) {
        assert NIL != stringp(sub_protocol) : "Types.stringp(sub_protocol) " + "CommonSymbols.NIL != Types.stringp(sub_protocol) " + sub_protocol;
        assert NIL != consp(pattern) : "Types.consp(pattern) " + "CommonSymbols.NIL != Types.consp(pattern) " + pattern;
        assert NIL != list_utilities.property_list_p(option_names) : "list_utilities.property_list_p(option_names) " + "CommonSymbols.NIL != list_utilities.property_list_p(option_names) " + option_names;
        assert NIL != list_utilities.property_list_p(option_punctuation) : "list_utilities.property_list_p(option_punctuation) " + "CommonSymbols.NIL != list_utilities.property_list_p(option_punctuation) " + option_punctuation;
        assert NIL != list_utilities.property_list_p(defaults) : "list_utilities.property_list_p(defaults) " + "CommonSymbols.NIL != list_utilities.property_list_p(defaults) " + defaults;
        final SubLObject description = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        map_utilities.map_put(description, $DEFAULTS, defaults);
        map_utilities.map_put(description, $PATTERN, pattern);
        map_utilities.map_put(description, $OPTION_PUNCTUATION, compile_db_conn_url_punctuation_info(option_punctuation));
        map_utilities.map_put(description, $OPTION_NAMES, option_names);
        map_utilities.map_put($sdbc_database_connection_url_descriptions$.getGlobalValue(), sub_protocol, description);
        return sub_protocol;
    }

    public static SubLObject get_all_sdbc_database_sub_protocols() {
        return map_utilities.map_keys($sdbc_database_connection_url_descriptions$.getGlobalValue());
    }

    public static SubLObject compile_db_conn_url_punctuation_info(final SubLObject option_punctuation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == option_punctuation) {
            return NIL;
        }
        SubLObject final_punctuation = copy_list(option_punctuation);
        if ($UNDEFINED == getf(final_punctuation, $TERMINATOR, $UNDEFINED)) {
            final_punctuation = putf(final_punctuation, $TERMINATOR, $str169$);
        }
        if ($SEPARATOR == getf(final_punctuation, $START, $SEPARATOR)) {
            final SubLObject separator = getf(final_punctuation, $SEPARATOR, $UNDEFINED);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!separator.isString())) {
                Errors.error($str293$Separator_must_be_defined_as_stri, separator);
            }
            final_punctuation = putf(final_punctuation, $START, separator);
        }
        final SubLObject value = getf(final_punctuation, $VALUE, $UNDEFINED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!value.isString())) {
            Errors.error($str295$Value_demarcator_must_be_specifie, value);
        }
        return final_punctuation;
    }

    public static SubLObject register_sdbc_database_connection_url_description(final SubLObject macroform, final SubLObject environment) {
        final SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$9 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list296);
            current_$9 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list296);
            if (NIL == member(current_$9, $list297, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$9 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list296);
        }
        final SubLObject sub_protocol_tail = property_list_member($SUB_PROTOCOL, current);
        final SubLObject sub_protocol = (NIL != sub_protocol_tail) ? cadr(sub_protocol_tail) : NIL;
        final SubLObject pattern_tail = property_list_member($PATTERN, current);
        final SubLObject pattern = (NIL != pattern_tail) ? cadr(pattern_tail) : NIL;
        final SubLObject option_names_tail = property_list_member($OPTION_NAMES, current);
        final SubLObject option_names = (NIL != option_names_tail) ? cadr(option_names_tail) : NIL;
        final SubLObject option_punctuation_tail = property_list_member($OPTION_PUNCTUATION, current);
        final SubLObject option_punctuation = (NIL != option_punctuation_tail) ? cadr(option_punctuation_tail) : NIL;
        final SubLObject defaults_tail = property_list_member($DEFAULTS, current);
        final SubLObject defaults = (NIL != defaults_tail) ? cadr(defaults_tail) : NIL;
        return list(ADD_SDBC_DATABASE_CONNECTION_URL_DESCRIPTION, sub_protocol, pattern, option_names, option_punctuation, defaults);
    }

    public static SubLObject set_sdbc_db2_port(final SubLObject port) {
        SubLSystemTrampolineFile.enforceType(port, NON_NEGATIVE_INTEGER_P);
        $sdbc_db2_port$.setGlobalValue(port);
        return $sdbc_db2_port$.getGlobalValue();
    }

    public static SubLObject sdbc_db2_port() {
        return $sdbc_db2_port$.getGlobalValue();
    }

    public static SubLObject set_sdbc_sybase_iq_port(final SubLObject port) {
        SubLSystemTrampolineFile.enforceType(port, NON_NEGATIVE_INTEGER_P);
        $sdbc_sybase_iq_port$.setGlobalValue(port);
        return $sdbc_sybase_iq_port$.getGlobalValue();
    }

    public static SubLObject sdbc_sybase_iq_port() {
        return $sdbc_sybase_iq_port$.getGlobalValue();
    }

    public static SubLObject construct_new_database_connection_url(final SubLObject sub_protocol, SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != list_utilities.property_list_p(v_properties) : "list_utilities.property_list_p(v_properties) " + "CommonSymbols.NIL != list_utilities.property_list_p(v_properties) " + v_properties;
        final SubLObject description = map_utilities.map_get($sdbc_database_connection_url_descriptions$.getGlobalValue(), sub_protocol, $UNDEFINED);
        SubLObject result = NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == map_utilities.map_p(description))) {
            Errors.error($str345$unknown_jdbc_subprotocol___a, sub_protocol);
        }
        if (!sub_protocol.equal(getf(v_properties, $SUB_PROTOCOL, UNPROVIDED))) {
            v_properties = cons($SUB_PROTOCOL, cons(sub_protocol, v_properties));
        }
        if (!getf(v_properties, $PROTOCOL, $NOT_FOUND).isString()) {
            v_properties = cons($PROTOCOL, cons($sql_protocol$.getGlobalValue(), v_properties));
        }
        final SubLObject pattern = map_utilities.map_get(description, $PATTERN, UNPROVIDED);
        final SubLObject defaults = map_utilities.map_get(description, $DEFAULTS, UNPROVIDED);
        final SubLObject option_names = map_utilities.map_get(description, $OPTION_NAMES, UNPROVIDED);
        final SubLObject option_punctuation = map_utilities.map_get(description, $OPTION_PUNCTUATION, UNPROVIDED);
        final SubLObject url_stream = make_string_output_stream();
        construct_new_dbconn_url_required(url_stream, pattern, v_properties, defaults);
        append_dbconn_url_options(url_stream, option_names, option_punctuation, v_properties, defaults);
        result = get_output_stream_string(url_stream);
        return result;
    }

    public static SubLObject construct_new_dbconn_url_required(final SubLObject url_stream, final SubLObject pattern, final SubLObject v_properties, final SubLObject defaults) {
        SubLObject cdolist_list_var = pattern;
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (element.isString()) {
                write_string(element, url_stream, UNPROVIDED, UNPROVIDED);
            } else
                if (element.isKeyword()) {
                    princ(resolve_dbconn_url_reference(element, v_properties, defaults), url_stream);
                } else
                    if (element.isCons()) {
                        SubLObject current;
                        final SubLObject datum = current = element;
                        SubLObject functor = NIL;
                        SubLObject item = NIL;
                        destructuring_bind_must_consp(current, datum, $list348);
                        functor = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list348);
                        item = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            final SubLObject value = resolve_dbconn_url_reference(item, v_properties, defaults);
                            SubLObject result = NIL;
                            final SubLObject pcase_var = functor;
                            if (pcase_var.eql($UPCASE)) {
                                result = Strings.string_upcase(string_utilities.to_string(value), UNPROVIDED, UNPROVIDED);
                            } else {
                                Errors.error($str350$Functor__A_not_implemented_yet_, functor);
                            }
                            write_string(result, url_stream, UNPROVIDED, UNPROVIDED);
                        } else {
                            cdestructuring_bind_error(datum, $list348);
                        }
                    } else {
                        Errors.error($str351$Pattern__S_contains__S__which_is_, pattern, element);
                    }


            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        } 
        return url_stream;
    }

    public static SubLObject resolve_dbconn_url_reference(final SubLObject element, final SubLObject v_properties, final SubLObject defaults) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (element.isString()) {
            return element;
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!element.isKeyword())) {
            Errors.error($str352$Element__A_is_neither_a_STRINGP_n, element);
        }
        final SubLObject default_value = getf(defaults, element, $NOT_FOUND);
        SubLObject value = getf(v_properties, element, default_value);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($NOT_FOUND == value)) {
            Errors.error($str353$No_value_provided_for__S_in_eithe, element, v_properties, defaults);
        }
        if ((value.isSymbol() && (!value.isKeyword())) && (NIL != boundp(value))) {
            value = symbol_value(value);
        }
        return value;
    }

    public static SubLObject append_dbconn_url_options(final SubLObject url_stream, final SubLObject option_names, final SubLObject option_punctuation, final SubLObject v_properties, final SubLObject defaults) {
        SubLObject written = ZERO_INTEGER;
        SubLObject remainder;
        SubLObject option_keyword;
        SubLObject option_name;
        SubLObject default_value;
        SubLObject value;
        for (remainder = NIL, remainder = option_names; NIL != remainder; remainder = cddr(remainder)) {
            option_keyword = remainder.first();
            option_name = cadr(remainder);
            default_value = getf(defaults, option_keyword, $NOT_FOUND);
            value = getf(v_properties, option_keyword, default_value);
            if (((NIL != value) && (NIL == string_utilities.empty_string_p(value))) && ($NOT_FOUND != value)) {
                write_dbconn_url_punctuation(url_stream, option_punctuation, written.isZero() ? $START : $SEPARATOR);
                write_string(option_name, url_stream, UNPROVIDED, UNPROVIDED);
                write_dbconn_url_punctuation(url_stream, option_punctuation, $VALUE);
                princ(value, url_stream);
                written = add(written, ONE_INTEGER);
            }
        }
        if (!written.isZero()) {
            write_dbconn_url_punctuation(url_stream, option_punctuation, $TERMINATOR);
        }
        return url_stream;
    }

    public static SubLObject write_dbconn_url_punctuation(final SubLObject url_stream, final SubLObject punctuation, final SubLObject key) {
        write_string(getf(punctuation, key, $str169$), url_stream, UNPROVIDED, UNPROVIDED);
        return url_stream;
    }

    public static SubLObject java_integerp(final SubLObject number) {
        return makeBoolean((number.isInteger() && number.numG($int$_2147483649)) && number.numL($int$2147483648));
    }

    public static SubLObject java_longp(final SubLObject number) {
        return makeBoolean((number.isInteger() && number.numG($int$_9223372036854775809)) && number.numL($int$9223372036854775808));
    }

    public static SubLObject java_floatp(final SubLObject number) {
        return floatp(number);
    }

    public static SubLObject java_doublep(final SubLObject number) {
        return floatp(number);
    }

    public static SubLObject with_sql_connection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list358);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject connection = NIL;
        SubLObject db = NIL;
        SubLObject user = NIL;
        SubLObject password = NIL;
        destructuring_bind_must_consp(current, datum, $list358);
        connection = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list358);
        db = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list358);
        user = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list358);
        password = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$10 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list358);
            current_$10 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list358);
            if (NIL == member(current_$10, $list359, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$10 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list358);
        }
        final SubLObject dbms_server_tail = property_list_member($DBMS_SERVER, current);
        final SubLObject dbms_server = (NIL != dbms_server_tail) ? cadr(dbms_server_tail) : $dbms_server$;
        final SubLObject port_tail = property_list_member($PORT, current);
        final SubLObject port = (NIL != port_tail) ? cadr(port_tail) : $sql_port$;
        final SubLObject subprotocol_tail = property_list_member($SUBPROTOCOL, current);
        final SubLObject subprotocol = (NIL != subprotocol_tail) ? cadr(subprotocol_tail) : $sql_subprotocol$;
        final SubLObject proxy_server_tail = property_list_member($PROXY_SERVER, current);
        final SubLObject proxy_server = (NIL != proxy_server_tail) ? cadr(proxy_server_tail) : dbms_server;
        final SubLObject timeout_tail = property_list_member($TIMEOUT, current);
        final SubLObject timeout = (NIL != timeout_tail) ? cadr(timeout_tail) : $sql_connection_timeout$;
        final SubLObject body;
        current = body = temp;
        return list(CLET, list(connection), list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, connection, list(NEW_SQL_CONNECTION, db, user, password, list(new SubLObject[]{ LIST, $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, timeout }))), append(body, NIL)), list(PWHEN, list(SQL_CONNECTION_P, connection), list(SQLC_CLOSE, connection))));
    }

    public static SubLObject with_sql_statement(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list370);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject statement = NIL;
        SubLObject db = NIL;
        SubLObject user = NIL;
        SubLObject password = NIL;
        destructuring_bind_must_consp(current, datum, $list370);
        statement = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list370);
        db = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list370);
        user = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list370);
        password = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$11 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list370);
            current_$11 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list370);
            if (NIL == member(current_$11, $list359, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$11 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list370);
        }
        final SubLObject dbms_server_tail = property_list_member($DBMS_SERVER, current);
        final SubLObject dbms_server = (NIL != dbms_server_tail) ? cadr(dbms_server_tail) : $dbms_server$;
        final SubLObject port_tail = property_list_member($PORT, current);
        final SubLObject port = (NIL != port_tail) ? cadr(port_tail) : $sql_port$;
        final SubLObject subprotocol_tail = property_list_member($SUBPROTOCOL, current);
        final SubLObject subprotocol = (NIL != subprotocol_tail) ? cadr(subprotocol_tail) : $sql_subprotocol$;
        final SubLObject proxy_server_tail = property_list_member($PROXY_SERVER, current);
        final SubLObject proxy_server = (NIL != proxy_server_tail) ? cadr(proxy_server_tail) : dbms_server;
        final SubLObject timeout_tail = property_list_member($TIMEOUT, current);
        final SubLObject timeout = (NIL != timeout_tail) ? cadr(timeout_tail) : $sql_connection_timeout$;
        final SubLObject body;
        current = body = temp;
        final SubLObject connection = $sym371$CONNECTION;
        return list(CLET, list(statement), listS(WITH_SQL_CONNECTION, list(new SubLObject[]{ connection, db, user, password, $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, timeout }), list(PIF, list(SQL_OPEN_CONNECTION_P, connection), list(CSETQ, statement, list(SQLC_CREATE_STATEMENT, connection)), list(CSETQ, statement, connection)), append(body, NIL)));
    }

    public static SubLObject with_prepared_sql_statement(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list375);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject statement = NIL;
        SubLObject sql = NIL;
        SubLObject db = NIL;
        SubLObject user = NIL;
        SubLObject password = NIL;
        destructuring_bind_must_consp(current, datum, $list375);
        statement = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list375);
        sql = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list375);
        db = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list375);
        user = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list375);
        password = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$12 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list375);
            current_$12 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list375);
            if (NIL == member(current_$12, $list359, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$12 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list375);
        }
        final SubLObject dbms_server_tail = property_list_member($DBMS_SERVER, current);
        final SubLObject dbms_server = (NIL != dbms_server_tail) ? cadr(dbms_server_tail) : $dbms_server$;
        final SubLObject port_tail = property_list_member($PORT, current);
        final SubLObject port = (NIL != port_tail) ? cadr(port_tail) : $sql_port$;
        final SubLObject subprotocol_tail = property_list_member($SUBPROTOCOL, current);
        final SubLObject subprotocol = (NIL != subprotocol_tail) ? cadr(subprotocol_tail) : $sql_subprotocol$;
        final SubLObject proxy_server_tail = property_list_member($PROXY_SERVER, current);
        final SubLObject proxy_server = (NIL != proxy_server_tail) ? cadr(proxy_server_tail) : dbms_server;
        final SubLObject timeout_tail = property_list_member($TIMEOUT, current);
        final SubLObject timeout = (NIL != timeout_tail) ? cadr(timeout_tail) : $sql_connection_timeout$;
        final SubLObject body;
        current = body = temp;
        final SubLObject connection = $sym376$CONNECTION;
        return list(CLET, list(statement), listS(WITH_SQL_CONNECTION, list(new SubLObject[]{ connection, db, user, password, $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, timeout }), list(PIF, list(SQL_OPEN_CONNECTION_P, connection), list(CSETQ, statement, list(SQLC_PREPARE_STATEMENT, connection, sql)), list(CSETQ, statement, connection)), append(body, NIL)));
    }

    public static SubLObject sqls_execute_transaction(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list378);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject statement = NIL;
        SubLObject error = NIL;
        destructuring_bind_must_consp(current, datum, $list378);
        statement = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list378);
        error = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject connection = $sym379$CONNECTION;
            final SubLObject auto_commit = $sym380$AUTO_COMMIT;
            final SubLObject commit_error = $sym381$COMMIT_ERROR;
            final SubLObject rollback_result = $sym382$ROLLBACK_RESULT;
            final SubLObject auto_commit_result = $sym383$AUTO_COMMIT_RESULT;
            final SubLObject errors = $sym384$ERRORS;
            return list(PROGN, list(CLET, list(list(connection, list(SQLS_GET_CONNECTION, statement)), list(auto_commit, list(SQLC_GET_AUTO_COMMIT, connection)), commit_error, rollback_result, auto_commit_result, errors), list(PIF, list(SDBC_ERROR_P, auto_commit), list(CPUSH, auto_commit, errors), list(PROGN, listS(SQLC_SET_ERROR_HANDLING, connection, $list387), listS(CATCH_ERROR_MESSAGE, list(commit_error), list(PWHEN, auto_commit, listS(SQLC_SET_AUTO_COMMIT, connection, $list390)), append(body, list(list(SQLC_COMMIT, connection)))), listS(SQLC_SET_ERROR_HANDLING, connection, $list392), list(PWHEN, commit_error, list(CPUSH, list(SQLS_HANDLE_COMMIT_ERROR, commit_error), errors), list(CSETQ, rollback_result, list(SQLS_HANDLE_ROLLBACK, connection)), list(PWHEN, list(SDBC_ERROR_P, rollback_result), list(CPUSH, rollback_result, errors))), list(PWHEN, auto_commit, list(CSETQ, auto_commit_result, listS(SQLC_SET_AUTO_COMMIT, connection, $list395))), list(PWHEN, list(SDBC_ERROR_P, auto_commit_result), list(CPUSH, auto_commit_result, errors)))), list(PWHEN, errors, list(CSETQ, error, list(SQLS_HANDLE_TRANSACTION_ERRORS, errors)))));
        }
        cdestructuring_bind_error(datum, $list378);
        return NIL;
    }

    public static SubLObject sqls_handle_commit_error(final SubLObject error) {
        if (NIL != sdbc_error_p(error)) {
            return new_sdbc_error($commit_error$.getGlobalValue(), sdbc_error_message(error), UNPROVIDED);
        }
        if (error.isString()) {
            return new_sdbc_error($transaction_error$.getGlobalValue(), error, UNPROVIDED);
        }
        return new_sdbc_error($unknown_error$.getGlobalValue(), $str397$An_unknown_error_occurred_during_, UNPROVIDED);
    }

    public static SubLObject sqls_handle_rollback(final SubLObject connection) {
        SubLObject rollback_result = NIL;
        rollback_result = sqlc_rollback(connection);
        if (NIL != sdbc_error_p(rollback_result)) {
            rollback_result = new_sdbc_error($rollback_error$.getGlobalValue(), sdbc_error_message(rollback_result), UNPROVIDED);
        }
        return rollback_result;
    }

    public static SubLObject sqls_handle_transaction_errors(final SubLObject errors) {
        final SubLObject error_message = string_utilities.bunge(Mapping.mapcar(SDBC_ERROR_MESSAGE, errors), CHAR_newline);
        return new_sdbc_error($transaction_error$.getGlobalValue(), error_message, UNPROVIDED);
    }

    public static SubLObject with_sql_transaction(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list398);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject statement = NIL;
        SubLObject error = NIL;
        SubLObject db = NIL;
        SubLObject user = NIL;
        SubLObject password = NIL;
        destructuring_bind_must_consp(current, datum, $list398);
        statement = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list398);
        error = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list398);
        db = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list398);
        user = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list398);
        password = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$13 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list398);
            current_$13 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list398);
            if (NIL == member(current_$13, $list359, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$13 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list398);
        }
        final SubLObject dbms_server_tail = property_list_member($DBMS_SERVER, current);
        final SubLObject dbms_server = (NIL != dbms_server_tail) ? cadr(dbms_server_tail) : $dbms_server$;
        final SubLObject port_tail = property_list_member($PORT, current);
        final SubLObject port = (NIL != port_tail) ? cadr(port_tail) : $sql_port$;
        final SubLObject subprotocol_tail = property_list_member($SUBPROTOCOL, current);
        final SubLObject subprotocol = (NIL != subprotocol_tail) ? cadr(subprotocol_tail) : $sql_subprotocol$;
        final SubLObject proxy_server_tail = property_list_member($PROXY_SERVER, current);
        final SubLObject proxy_server = (NIL != proxy_server_tail) ? cadr(proxy_server_tail) : dbms_server;
        final SubLObject timeout_tail = property_list_member($TIMEOUT, current);
        final SubLObject timeout = (NIL != timeout_tail) ? cadr(timeout_tail) : $sql_connection_timeout$;
        final SubLObject body;
        current = body = temp;
        return list(WITH_SQL_STATEMENT, list(new SubLObject[]{ statement, db, user, password, $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, timeout }), list(PWHEN, list(SQL_OPEN_STATEMENT_P, statement), listS(SQLS_EXECUTE_TRANSACTION, list(statement, error), append(body, NIL))));
    }

    public static SubLObject with_sql_result_set(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list400);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rs = NIL;
        SubLObject query = NIL;
        SubLObject db = NIL;
        SubLObject user = NIL;
        SubLObject password = NIL;
        destructuring_bind_must_consp(current, datum, $list400);
        rs = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list400);
        query = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list400);
        db = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list400);
        user = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list400);
        password = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$14 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list400);
            current_$14 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list400);
            if (NIL == member(current_$14, $list359, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$14 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list400);
        }
        final SubLObject dbms_server_tail = property_list_member($DBMS_SERVER, current);
        final SubLObject dbms_server = (NIL != dbms_server_tail) ? cadr(dbms_server_tail) : $dbms_server$;
        final SubLObject port_tail = property_list_member($PORT, current);
        final SubLObject port = (NIL != port_tail) ? cadr(port_tail) : $sql_port$;
        final SubLObject subprotocol_tail = property_list_member($SUBPROTOCOL, current);
        final SubLObject subprotocol = (NIL != subprotocol_tail) ? cadr(subprotocol_tail) : $sql_subprotocol$;
        final SubLObject proxy_server_tail = property_list_member($PROXY_SERVER, current);
        final SubLObject proxy_server = (NIL != proxy_server_tail) ? cadr(proxy_server_tail) : dbms_server;
        final SubLObject timeout_tail = property_list_member($TIMEOUT, current);
        final SubLObject timeout = (NIL != timeout_tail) ? cadr(timeout_tail) : $sql_connection_timeout$;
        final SubLObject body;
        current = body = temp;
        final SubLObject statement = $sym401$STATEMENT;
        return list(CLET, list(rs), listS(WITH_SQL_STATEMENT, list(new SubLObject[]{ statement, db, user, password, $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, timeout }), list(PIF, list(SQL_OPEN_STATEMENT_P, statement), list(CSETQ, RS, list(SQLS_EXECUTE_QUERY, statement, query)), list(CSETQ, rs, statement)), append(body, NIL)));
    }

    public static SubLObject do_sql_result_set(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list400);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rs = NIL;
        SubLObject query = NIL;
        SubLObject db = NIL;
        SubLObject user = NIL;
        SubLObject password = NIL;
        destructuring_bind_must_consp(current, datum, $list400);
        rs = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list400);
        query = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list400);
        db = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list400);
        user = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list400);
        password = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$15 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list400);
            current_$15 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list400);
            if (NIL == member(current_$15, $list359, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$15 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list400);
        }
        final SubLObject dbms_server_tail = property_list_member($DBMS_SERVER, current);
        final SubLObject dbms_server = (NIL != dbms_server_tail) ? cadr(dbms_server_tail) : $dbms_server$;
        final SubLObject port_tail = property_list_member($PORT, current);
        final SubLObject port = (NIL != port_tail) ? cadr(port_tail) : $sql_port$;
        final SubLObject subprotocol_tail = property_list_member($SUBPROTOCOL, current);
        final SubLObject subprotocol = (NIL != subprotocol_tail) ? cadr(subprotocol_tail) : $sql_subprotocol$;
        final SubLObject proxy_server_tail = property_list_member($PROXY_SERVER, current);
        final SubLObject proxy_server = (NIL != proxy_server_tail) ? cadr(proxy_server_tail) : dbms_server;
        final SubLObject timeout_tail = property_list_member($TIMEOUT, current);
        final SubLObject timeout = (NIL != timeout_tail) ? cadr(timeout_tail) : $sql_connection_timeout$;
        final SubLObject body;
        current = body = temp;
        return list(WITH_SQL_RESULT_SET, list(new SubLObject[]{ rs, query, db, user, password, $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, timeout }), list(PWHEN, list(SQL_RESULT_SET_P, rs), listS(WHILE, list(SQLRS_NEXT, rs), append(body, NIL))));
    }

    public static SubLObject sql_export(final SubLObject table, final SubLObject db, final SubLObject user, final SubLObject password, SubLObject stream, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (dbms_server == UNPROVIDED) {
            dbms_server = $dbms_server$.getGlobalValue();
        }
        if (port == UNPROVIDED) {
            port = $sql_port$.getGlobalValue();
        }
        if (subprotocol == UNPROVIDED) {
            subprotocol = $sql_subprotocol$.getGlobalValue();
        }
        if (proxy_server == UNPROVIDED) {
            proxy_server = dbms_server;
        }
        assert NIL != stringp(table) : "Types.stringp(table) " + "CommonSymbols.NIL != Types.stringp(table) " + table;
        assert NIL != stringp(db) : "Types.stringp(db) " + "CommonSymbols.NIL != Types.stringp(db) " + db;
        assert NIL != stringp(user) : "Types.stringp(user) " + "CommonSymbols.NIL != Types.stringp(user) " + user;
        assert NIL != stringp(password) : "Types.stringp(password) " + "CommonSymbols.NIL != Types.stringp(password) " + password;
        assert NIL != output_stream_p(stream) : "streams_high.output_stream_p(stream) " + "CommonSymbols.NIL != streams_high.output_stream_p(stream) " + stream;
        assert NIL != stringp(dbms_server) : "Types.stringp(dbms_server) " + "CommonSymbols.NIL != Types.stringp(dbms_server) " + dbms_server;
        assert NIL != subl_promotions.positive_integer_p(port) : "subl_promotions.positive_integer_p(port) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(port) " + port;
        assert NIL != stringp(subprotocol) : "Types.stringp(subprotocol) " + "CommonSymbols.NIL != Types.stringp(subprotocol) " + subprotocol;
        assert NIL != stringp(proxy_server) : "Types.stringp(proxy_server) " + "CommonSymbols.NIL != Types.stringp(proxy_server) " + proxy_server;
        final SubLObject rs = NIL;
        SubLObject col = NIL;
        SubLObject rs_$16 = NIL;
        SubLObject statement = NIL;
        SubLObject connection = NIL;
        try {
            connection = new_sql_connection(db, user, password, list(new SubLObject[]{ $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, $sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sql_open_connection_p(connection)) {
                statement = sqlc_create_statement(connection);
            } else {
                statement = connection;
            }
            if (NIL != sql_open_statement_p(statement)) {
                rs_$16 = sqls_execute_query(statement, cconcatenate($str408$SELECT___FROM_, table), UNPROVIDED);
            } else {
                rs_$16 = statement;
            }
            if (NIL != sql_result_set_p(rs_$16)) {
                while (NIL != sqlrs_next(rs_$16)) {
                    col = ZERO_INTEGER;
                    while (!col.numE(number_utilities.f_1_(sqlrs_column_count(rs_$16)))) {
                        col = add(col, ONE_INTEGER);
                        princ(sqlrs_get_object(rs_$16, col), stream);
                        princ(CHAR_tab, stream);
                    } 
                    col = add(col, ONE_INTEGER);
                    princ(sqlrs_get_object(rs_$16, col), stream);
                    terpri(stream);
                } 
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sql_connection_p(connection)) {
                    sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return rs;
    }

    public static SubLObject sdbc_test(final SubLObject db, final SubLObject user, final SubLObject password, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server, SubLObject table) {
        if (dbms_server == UNPROVIDED) {
            dbms_server = $dbms_server$.getGlobalValue();
        }
        if (port == UNPROVIDED) {
            port = $sql_port$.getGlobalValue();
        }
        if (subprotocol == UNPROVIDED) {
            subprotocol = $sql_subprotocol$.getGlobalValue();
        }
        if (proxy_server == UNPROVIDED) {
            proxy_server = dbms_server;
        }
        if (table == UNPROVIDED) {
            table = string_utilities.split_string(Environment.machine_instance(), $list409).first();
        }
        return makeBoolean(((NIL != sdbc_test_created(db, user, password, dbms_server, port, subprotocol, proxy_server, table)) && (NIL != sdbc_test_prepared(db, user, password, dbms_server, port, subprotocol, proxy_server, table))) && (NIL != sdbc_test_batch(db, user, password, dbms_server, port, subprotocol, proxy_server, table)));
    }

    public static SubLObject sdbc_test_prepared(final SubLObject db, final SubLObject user, final SubLObject password, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server, SubLObject table) {
        if (dbms_server == UNPROVIDED) {
            dbms_server = $dbms_server$.getGlobalValue();
        }
        if (port == UNPROVIDED) {
            port = $sql_port$.getGlobalValue();
        }
        if (subprotocol == UNPROVIDED) {
            subprotocol = $sql_subprotocol$.getGlobalValue();
        }
        if (proxy_server == UNPROVIDED) {
            proxy_server = dbms_server;
        }
        if (table == UNPROVIDED) {
            table = string_utilities.split_string(Environment.machine_instance(), $list409).first();
        }
        SubLObject c = NIL;
        SubLObject s = NIL;
        SubLObject insert = NIL;
        SubLObject select = NIL;
        SubLObject passP = NIL;
        SubLObject rs = NIL;
        SubLObject result = NIL;
        try {
            c = new_sql_connection(db, user, password, list(new SubLObject[]{ $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, $sql_connection_timeout$.getGlobalValue() }));
            s = sqlc_create_statement(c);
            insert = sqlc_prepare_statement(c, format(NIL, $str410$INSERT_INTO__a_VALUES______, table));
            select = sqlc_prepare_statement(c, format(NIL, $str411$SELECT_number2_FROM__a_WHERE_numb, table));
            passP = T;
            sqls_execute_update(s, cconcatenate($$$CREATE_TABLE_, new SubLObject[]{ table, $str413$__number1_INT_PRIMARY_KEY__number }));
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL($sdbc_test_row_cardinality$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
                sqlps_set_int(insert, ONE_INTEGER, i);
                sqlps_set_int(insert, TWO_INTEGER, i);
                sqlps_execute_update(insert);
            }
            for (i = NIL, i = ZERO_INTEGER; i.numL($sdbc_test_row_cardinality$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
                sqlps_set_int(select, ONE_INTEGER, i);
                rs = sqlps_execute_query(select, UNPROVIDED);
                sqlrs_next(rs);
                result = sqlrs_get_object(rs, ONE_INTEGER);
                passP = makeBoolean((NIL != passP) && result.eql(i));
                if (!result.eql(i)) {
                    Errors.warn($str414$validation_failed_for__a__result_, i, result);
                }
            }
            sqls_execute_update(s, cconcatenate($$$DROP_TABLE_, table));
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sql_connection_p(c)) {
                    sqlc_close(c);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return passP;
    }

    public static SubLObject sdbc_test_created(final SubLObject db, final SubLObject user, final SubLObject password, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server, SubLObject table) {
        if (dbms_server == UNPROVIDED) {
            dbms_server = $dbms_server$.getGlobalValue();
        }
        if (port == UNPROVIDED) {
            port = $sql_port$.getGlobalValue();
        }
        if (subprotocol == UNPROVIDED) {
            subprotocol = $sql_subprotocol$.getGlobalValue();
        }
        if (proxy_server == UNPROVIDED) {
            proxy_server = dbms_server;
        }
        if (table == UNPROVIDED) {
            table = string_utilities.split_string(Environment.machine_instance(), $list409).first();
        }
        SubLObject passP = T;
        SubLObject num_string = NIL;
        SubLObject rs = NIL;
        SubLObject result = NIL;
        SubLObject s = NIL;
        SubLObject connection = NIL;
        try {
            connection = new_sql_connection(db, user, password, list(new SubLObject[]{ $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, $sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sql_open_connection_p(connection)) {
                s = sqlc_create_statement(connection);
            } else {
                s = connection;
            }
            sqls_execute_update(s, cconcatenate($$$CREATE_TABLE_, new SubLObject[]{ table, $str413$__number1_INT_PRIMARY_KEY__number }));
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL($sdbc_test_row_cardinality$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
                num_string = prin1_to_string(i);
                sqls_execute_update(s, cconcatenate($$$INSERT_INTO_, new SubLObject[]{ table, $str417$_VALUES_, num_string, $str418$__, num_string, $str419$_ }));
            }
            for (i = NIL, i = ZERO_INTEGER; i.numL($sdbc_test_row_cardinality$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
                rs = sqls_execute_query(s, cconcatenate($$$SELECT_number2_FROM_, new SubLObject[]{ table, $str421$_WHERE_number1___, prin1_to_string(i) }), UNPROVIDED);
                sqlrs_next(rs);
                result = sqlrs_get_object(rs, ONE_INTEGER);
                passP = makeBoolean((NIL != passP) && result.eql(i));
                if (!result.eql(i)) {
                    Errors.warn($str414$validation_failed_for__a__result_, i, result);
                }
            }
            sqls_execute_update(s, cconcatenate($$$DROP_TABLE_, table));
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sql_connection_p(connection)) {
                    sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return passP;
    }

    public static SubLObject sdbc_test_batch(final SubLObject db, final SubLObject user, final SubLObject password, SubLObject dbms_server, SubLObject port, SubLObject subprotocol, SubLObject proxy_server, SubLObject table) {
        if (dbms_server == UNPROVIDED) {
            dbms_server = $dbms_server$.getGlobalValue();
        }
        if (port == UNPROVIDED) {
            port = $sql_port$.getGlobalValue();
        }
        if (subprotocol == UNPROVIDED) {
            subprotocol = $sql_subprotocol$.getGlobalValue();
        }
        if (proxy_server == UNPROVIDED) {
            proxy_server = dbms_server;
        }
        if (table == UNPROVIDED) {
            table = string_utilities.split_string(Environment.machine_instance(), $list409).first();
        }
        SubLObject passP = T;
        SubLObject num_string = NIL;
        SubLObject rs = NIL;
        SubLObject result = NIL;
        SubLObject s = NIL;
        SubLObject connection = NIL;
        try {
            connection = new_sql_connection(db, user, password, list(new SubLObject[]{ $DBMS_SERVER, dbms_server, $PORT, port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, proxy_server, $TIMEOUT, $sql_connection_timeout$.getGlobalValue() }));
            if (NIL != sql_open_connection_p(connection)) {
                s = sqlc_create_statement(connection);
            } else {
                s = connection;
            }
            sqls_execute_update(s, cconcatenate($$$CREATE_TABLE_, new SubLObject[]{ table, $str413$__number1_INT_PRIMARY_KEY__number }));
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL($sdbc_test_row_cardinality$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
                num_string = prin1_to_string(i);
                sqls_add_batch(s, cconcatenate($$$INSERT_INTO_, new SubLObject[]{ table, $str417$_VALUES_, num_string, $str418$__, num_string, $str419$_ }));
            }
            sqls_execute_batch(s);
            for (i = NIL, i = ZERO_INTEGER; i.numL($sdbc_test_row_cardinality$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
                rs = sqls_execute_query(s, cconcatenate($$$SELECT_number2_FROM_, new SubLObject[]{ table, $str421$_WHERE_number1___, prin1_to_string(i) }), UNPROVIDED);
                sqlrs_next(rs);
                result = sqlrs_get_object(rs, ONE_INTEGER);
                passP = makeBoolean((NIL != passP) && result.eql(i));
                if (!result.eql(i)) {
                    Errors.warn($str414$validation_failed_for__a__result_, i, result);
                }
            }
            sqls_execute_update(s, cconcatenate($$$DROP_TABLE_, table));
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != sql_connection_p(connection)) {
                    sqlc_close(connection);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return passP;
    }

    public static SubLObject declare_sdbc_file() {
        declareFunction(me, "sql_proxy_server_runningP", "SQL-PROXY-SERVER-RUNNING?", 0, 3, false);
        declareFunction(me, "sql_connection_print_function_trampoline", "SQL-CONNECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_connection_p", "SQL-CONNECTION-P", 1, 0, false);
        new sdbc.$sql_connection_p$UnaryFunction();
        declareFunction(me, "sqlc_db", "SQLC-DB", 1, 0, false);
        declareFunction(me, "sqlc_user", "SQLC-USER", 1, 0, false);
        declareFunction(me, "sqlc_dbms_server", "SQLC-DBMS-SERVER", 1, 0, false);
        declareFunction(me, "sqlc_port", "SQLC-PORT", 1, 0, false);
        declareFunction(me, "sqlc_channel", "SQLC-CHANNEL", 1, 0, false);
        declareFunction(me, "sqlc_statements", "SQLC-STATEMENTS", 1, 0, false);
        declareFunction(me, "sqlc_lock", "SQLC-LOCK", 1, 0, false);
        declareFunction(me, "sqlc_subprotocol", "SQLC-SUBPROTOCOL", 1, 0, false);
        declareFunction(me, "sqlc_proxy_server", "SQLC-PROXY-SERVER", 1, 0, false);
        declareFunction(me, "sqlc_error_handling", "SQLC-ERROR-HANDLING", 1, 0, false);
        declareFunction(me, "sqlc_tickets", "SQLC-TICKETS", 1, 0, false);
        declareFunction(me, "sqlc_mailman", "SQLC-MAILMAN", 1, 0, false);
        declareFunction(me, "_csetf_sqlc_db", "_CSETF-SQLC-DB", 2, 0, false);
        declareFunction(me, "_csetf_sqlc_user", "_CSETF-SQLC-USER", 2, 0, false);
        declareFunction(me, "_csetf_sqlc_dbms_server", "_CSETF-SQLC-DBMS-SERVER", 2, 0, false);
        declareFunction(me, "_csetf_sqlc_port", "_CSETF-SQLC-PORT", 2, 0, false);
        declareFunction(me, "_csetf_sqlc_channel", "_CSETF-SQLC-CHANNEL", 2, 0, false);
        declareFunction(me, "_csetf_sqlc_statements", "_CSETF-SQLC-STATEMENTS", 2, 0, false);
        declareFunction(me, "_csetf_sqlc_lock", "_CSETF-SQLC-LOCK", 2, 0, false);
        declareFunction(me, "_csetf_sqlc_subprotocol", "_CSETF-SQLC-SUBPROTOCOL", 2, 0, false);
        declareFunction(me, "_csetf_sqlc_proxy_server", "_CSETF-SQLC-PROXY-SERVER", 2, 0, false);
        declareFunction(me, "_csetf_sqlc_error_handling", "_CSETF-SQLC-ERROR-HANDLING", 2, 0, false);
        declareFunction(me, "_csetf_sqlc_tickets", "_CSETF-SQLC-TICKETS", 2, 0, false);
        declareFunction(me, "_csetf_sqlc_mailman", "_CSETF-SQLC-MAILMAN", 2, 0, false);
        declareFunction(me, "make_sql_connection", "MAKE-SQL-CONNECTION", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_connection", "VISIT-DEFSTRUCT-SQL-CONNECTION", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_connection_method", "VISIT-DEFSTRUCT-OBJECT-SQL-CONNECTION-METHOD", 2, 0, false);
        declareFunction(me, "sqlc_print", "SQLC-PRINT", 3, 0, false);
        declareFunction(me, "sqlc_print_string", "SQLC-PRINT-STRING", 1, 0, false);
        declareFunction(me, "new_sql_connection", "NEW-SQL-CONNECTION", 3, 1, false);
        declareFunction(me, "sql_open_connection_p", "SQL-OPEN-CONNECTION-P", 1, 0, false);
        declareFunction(me, "sqlc_open_p", "SQLC-OPEN-P", 1, 0, false);
        declareFunction(me, "sqlc_close", "SQLC-CLOSE", 1, 0, false);
        declareFunction(me, "sqlc_create_statement", "SQLC-CREATE-STATEMENT", 1, 0, false);
        declareFunction(me, "sqlc_prepare_statement", "SQLC-PREPARE-STATEMENT", 2, 0, false);
        declareFunction(me, "sqlc_set_auto_commit", "SQLC-SET-AUTO-COMMIT", 2, 0, false);
        declareFunction(me, "sqlc_get_auto_commit", "SQLC-GET-AUTO-COMMIT", 1, 0, false);
        declareFunction(me, "sqlc_commit", "SQLC-COMMIT", 1, 0, false);
        declareFunction(me, "sqlc_rollback", "SQLC-ROLLBACK", 1, 0, false);
        declareFunction(me, "sqlc_get_transaction_isolation", "SQLC-GET-TRANSACTION-ISOLATION", 1, 0, false);
        declareFunction(me, "sqlc_set_transaction_isolation", "SQLC-SET-TRANSACTION-ISOLATION", 2, 0, false);
        declareFunction(me, "sql_ticket_print_function_trampoline", "SQL-TICKET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_ticket_p", "SQL-TICKET-P", 1, 0, false);
        new sdbc.$sql_ticket_p$UnaryFunction();
        declareFunction(me, "sql_ticket_semaphore", "SQL-TICKET-SEMAPHORE", 1, 0, false);
        declareFunction(me, "sql_ticket_result", "SQL-TICKET-RESULT", 1, 0, false);
        declareFunction(me, "_csetf_sql_ticket_semaphore", "_CSETF-SQL-TICKET-SEMAPHORE", 2, 0, false);
        declareFunction(me, "_csetf_sql_ticket_result", "_CSETF-SQL-TICKET-RESULT", 2, 0, false);
        declareFunction(me, "make_sql_ticket", "MAKE-SQL-TICKET", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_ticket", "VISIT-DEFSTRUCT-SQL-TICKET", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_ticket_method", "VISIT-DEFSTRUCT-OBJECT-SQL-TICKET-METHOD", 2, 0, false);
        declareFunction(me, "new_sql_ticket", "NEW-SQL-TICKET", 0, 0, false);
        declareFunction(me, "sql_ticket_retrieve", "SQL-TICKET-RETRIEVE", 1, 0, false);
        declareFunction(me, "launch_sql_mailman", "LAUNCH-SQL-MAILMAN", 1, 0, false);
        declareFunction(me, "sqlc_deliver", "SQLC-DELIVER", 1, 0, false);
        declareFunction(me, "sqlc_execute", "SQLC-EXECUTE", 3, 0, false);
        declareFunction(me, "sqlc_send", "SQLC-SEND", 4, 0, false);
        declareFunction(me, "sqlc_receive", "SQLC-RECEIVE", 1, 0, false);
        declareFunction(me, "sqlc_handle_error", "SQLC-HANDLE-ERROR", 2, 0, false);
        declareFunction(me, "sql_transaction_level_p", "SQL-TRANSACTION-LEVEL-P", 1, 0, false);
        declareFunction(me, "sqlc_set_error_handling", "SQLC-SET-ERROR-HANDLING", 2, 0, false);
        declareFunction(me, "new_sql_response", "NEW-SQL-RESPONSE", 2, 0, false);
        declareFunction(me, "sql_response_code", "SQL-RESPONSE-CODE", 1, 0, false);
        declareFunction(me, "sql_response_value", "SQL-RESPONSE-VALUE", 1, 0, false);
        declareFunction(me, "sql_null_p", "SQL-NULL-P", 1, 0, false);
        declareFunction(me, "sql_true_p", "SQL-TRUE-P", 1, 0, false);
        declareFunction(me, "sql_false_p", "SQL-FALSE-P", 1, 0, false);
        declareFunction(me, "sdbc_error_print_function_trampoline", "SDBC-ERROR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sdbc_error_p", "SDBC-ERROR-P", 1, 0, false);
        new sdbc.$sdbc_error_p$UnaryFunction();
        declareFunction(me, "sdbc_error_type", "SDBC-ERROR-TYPE", 1, 0, false);
        declareFunction(me, "sdbc_error_message", "SDBC-ERROR-MESSAGE", 1, 0, false);
        declareFunction(me, "sdbc_error_code", "SDBC-ERROR-CODE", 1, 0, false);
        declareFunction(me, "_csetf_sdbc_error_type", "_CSETF-SDBC-ERROR-TYPE", 2, 0, false);
        declareFunction(me, "_csetf_sdbc_error_message", "_CSETF-SDBC-ERROR-MESSAGE", 2, 0, false);
        declareFunction(me, "_csetf_sdbc_error_code", "_CSETF-SDBC-ERROR-CODE", 2, 0, false);
        declareFunction(me, "make_sdbc_error", "MAKE-SDBC-ERROR", 0, 1, false);
        declareFunction(me, "visit_defstruct_sdbc_error", "VISIT-DEFSTRUCT-SDBC-ERROR", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sdbc_error_method", "VISIT-DEFSTRUCT-OBJECT-SDBC-ERROR-METHOD", 2, 0, false);
        declareFunction(me, "sdbc_error_throw", "SDBC-ERROR-THROW", 1, 0, false);
        declareFunction(me, "sdbc_error_warn", "SDBC-ERROR-WARN", 1, 0, false);
        declareFunction(me, "sdbc_server_error_p", "SDBC-SERVER-ERROR-P", 1, 0, false);
        declareFunction(me, "sdbc_client_error_p", "SDBC-CLIENT-ERROR-P", 1, 0, false);
        declareFunction(me, "sdbc_sql_error_p", "SDBC-SQL-ERROR-P", 1, 0, false);
        declareFunction(me, "sdbc_io_error_p", "SDBC-IO-ERROR-P", 1, 0, false);
        declareFunction(me, "sdbc_transaction_error_p", "SDBC-TRANSACTION-ERROR-P", 1, 0, false);
        declareFunction(me, "sdbc_batch_update_error_p", "SDBC-BATCH-UPDATE-ERROR-P", 1, 0, false);
        declareFunction(me, "sdbc_other_error_p", "SDBC-OTHER-ERROR-P", 1, 0, false);
        declareFunction(me, "new_sdbc_error", "NEW-SDBC-ERROR", 2, 1, false);
        declareFunction(me, "sdbc_error_print", "SDBC-ERROR-PRINT", 3, 0, false);
        declareFunction(me, "decode_sdbc_error_code", "DECODE-SDBC-ERROR-CODE", 1, 0, false);
        declareFunction(me, "sql_result_set_print_function_trampoline", "SQL-RESULT-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_result_set_p", "SQL-RESULT-SET-P", 1, 0, false);
        new sdbc.$sql_result_set_p$UnaryFunction();
        declareFunction(me, "sqlrs_rows", "SQLRS-ROWS", 1, 0, false);
        declareFunction(me, "sqlrs_current", "SQLRS-CURRENT", 1, 0, false);
        declareFunction(me, "sqlrs_last", "SQLRS-LAST", 1, 0, false);
        declareFunction(me, "sqlrs_start", "SQLRS-START", 1, 0, false);
        declareFunction(me, "sqlrs_connection", "SQLRS-CONNECTION", 1, 0, false);
        declareFunction(me, "sqlrs_block_size", "SQLRS-BLOCK-SIZE", 1, 0, false);
        declareFunction(me, "sqlrs_id", "SQLRS-ID", 1, 0, false);
        declareFunction(me, "_csetf_sqlrs_rows", "_CSETF-SQLRS-ROWS", 2, 0, false);
        declareFunction(me, "_csetf_sqlrs_current", "_CSETF-SQLRS-CURRENT", 2, 0, false);
        declareFunction(me, "_csetf_sqlrs_last", "_CSETF-SQLRS-LAST", 2, 0, false);
        declareFunction(me, "_csetf_sqlrs_start", "_CSETF-SQLRS-START", 2, 0, false);
        declareFunction(me, "_csetf_sqlrs_connection", "_CSETF-SQLRS-CONNECTION", 2, 0, false);
        declareFunction(me, "_csetf_sqlrs_block_size", "_CSETF-SQLRS-BLOCK-SIZE", 2, 0, false);
        declareFunction(me, "_csetf_sqlrs_id", "_CSETF-SQLRS-ID", 2, 0, false);
        declareFunction(me, "make_sql_result_set", "MAKE-SQL-RESULT-SET", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_result_set", "VISIT-DEFSTRUCT-SQL-RESULT-SET", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_result_set_method", "VISIT-DEFSTRUCT-OBJECT-SQL-RESULT-SET-METHOD", 2, 0, false);
        declareFunction(me, "sqlrs_print", "SQLRS-PRINT", 3, 0, false);
        declareFunction(me, "sql_open_result_set_p", "SQL-OPEN-RESULT-SET-P", 1, 0, false);
        declareFunction(me, "sqlrs_close", "SQLRS-CLOSE", 1, 0, false);
        declareFunction(me, "sqlrs_emptyP", "SQLRS-EMPTY?", 1, 0, false);
        declareFunction(me, "sqlrs_absolute", "SQLRS-ABSOLUTE", 2, 0, false);
        declareFunction(me, "sqlrs_next", "SQLRS-NEXT", 1, 0, false);
        declareFunction(me, "sqlrs_previous", "SQLRS-PREVIOUS", 1, 0, false);
        declareFunction(me, "sqlrs_is_last", "SQLRS-IS-LAST", 1, 0, false);
        declareFunction(me, "sqlrs_is_first", "SQLRS-IS-FIRST", 1, 0, false);
        declareFunction(me, "sqlrs_column_count", "SQLRS-COLUMN-COUNT", 1, 0, false);
        declareFunction(me, "sqlrs_row_count", "SQLRS-ROW-COUNT", 1, 0, false);
        declareFunction(me, "sqlrs_get_row", "SQLRS-GET-ROW", 1, 0, false);
        declareFunction(me, "sqlrs_get_object", "SQLRS-GET-OBJECT", 2, 0, false);
        declareFunction(me, "sqlrs_get_object_tuple", "SQLRS-GET-OBJECT-TUPLE", 1, 0, false);
        declareFunction(me, "new_sql_result_set", "NEW-SQL-RESULT-SET", 3, 0, false);
        declareFunction(me, "sqlrs_closed_p", "SQLRS-CLOSED-P", 1, 0, false);
        declareFunction(me, "sqlrs_open_p", "SQLRS-OPEN-P", 1, 0, false);
        declareFunction(me, "sqlrs_valid_row_p", "SQLRS-VALID-ROW-P", 1, 0, false);
        declareFunction(me, "sqlrs_valid_column_p", "SQLRS-VALID-COLUMN-P", 2, 0, false);
        declareFunction(me, "sqlrs_block", "SQLRS-BLOCK", 2, 0, false);
        declareFunction(me, "sqlrs_row_local_p", "SQLRS-ROW-LOCAL-P", 1, 0, false);
        declareFunction(me, "sqlrs_row_remote_p", "SQLRS-ROW-REMOTE-P", 1, 0, false);
        declareFunction(me, "sqlrs_local_close", "SQLRS-LOCAL-CLOSE", 1, 0, false);
        declareFunction(me, "sql_statement_print_function_trampoline", "SQL-STATEMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sql_statement_p", "SQL-STATEMENT-P", 1, 0, false);
        new sdbc.$sql_statement_p$UnaryFunction();
        declareFunction(me, "sqls_connection", "SQLS-CONNECTION", 1, 0, false);
        declareFunction(me, "sqls_id", "SQLS-ID", 1, 0, false);
        declareFunction(me, "sqls_sql", "SQLS-SQL", 1, 0, false);
        declareFunction(me, "sqls_settings", "SQLS-SETTINGS", 1, 0, false);
        declareFunction(me, "sqls_batch", "SQLS-BATCH", 1, 0, false);
        declareFunction(me, "sqls_rs", "SQLS-RS", 1, 0, false);
        declareFunction(me, "_csetf_sqls_connection", "_CSETF-SQLS-CONNECTION", 2, 0, false);
        declareFunction(me, "_csetf_sqls_id", "_CSETF-SQLS-ID", 2, 0, false);
        declareFunction(me, "_csetf_sqls_sql", "_CSETF-SQLS-SQL", 2, 0, false);
        declareFunction(me, "_csetf_sqls_settings", "_CSETF-SQLS-SETTINGS", 2, 0, false);
        declareFunction(me, "_csetf_sqls_batch", "_CSETF-SQLS-BATCH", 2, 0, false);
        declareFunction(me, "_csetf_sqls_rs", "_CSETF-SQLS-RS", 2, 0, false);
        declareFunction(me, "make_sql_statement", "MAKE-SQL-STATEMENT", 0, 1, false);
        declareFunction(me, "visit_defstruct_sql_statement", "VISIT-DEFSTRUCT-SQL-STATEMENT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sql_statement_method", "VISIT-DEFSTRUCT-OBJECT-SQL-STATEMENT-METHOD", 2, 0, false);
        declareFunction(me, "sqls_open_p", "SQLS-OPEN-P", 1, 0, false);
        declareFunction(me, "sql_open_statement_p", "SQL-OPEN-STATEMENT-P", 1, 0, false);
        declareFunction(me, "sqls_execute_query", "SQLS-EXECUTE-QUERY", 2, 1, false);
        declareFunction(me, "sqls_execute_update", "SQLS-EXECUTE-UPDATE", 2, 0, false);
        declareFunction(me, "sqls_cancel", "SQLS-CANCEL", 1, 0, false);
        declareFunction(me, "sqls_get_generated_keys", "SQLS-GET-GENERATED-KEYS", 1, 1, false);
        declareFunction(me, "sqls_close", "SQLS-CLOSE", 1, 0, false);
        declareFunction(me, "sqls_add_batch", "SQLS-ADD-BATCH", 2, 0, false);
        declareFunction(me, "sqls_clear_batch", "SQLS-CLEAR-BATCH", 1, 0, false);
        declareFunction(me, "sqls_execute_batch", "SQLS-EXECUTE-BATCH", 1, 0, false);
        declareFunction(me, "sql_prepared_statement_p", "SQL-PREPARED-STATEMENT-P", 1, 0, false);
        declareFunction(me, "sql_prepared_open_statement_p", "SQL-PREPARED-OPEN-STATEMENT-P", 1, 0, false);
        declareFunction(me, "sqlps_execute_query", "SQLPS-EXECUTE-QUERY", 1, 1, false);
        declareFunction(me, "sqlps_execute_update", "SQLPS-EXECUTE-UPDATE", 1, 0, false);
        declareFunction(me, "sqlps_set_bytes", "SQLPS-SET-BYTES", 3, 0, false);
        declareFunction(me, "sqlps_set_int", "SQLPS-SET-INT", 3, 0, false);
        declareFunction(me, "sqlps_set_long", "SQLPS-SET-LONG", 3, 0, false);
        declareFunction(me, "sqlps_set_float", "SQLPS-SET-FLOAT", 3, 0, false);
        declareFunction(me, "sqlps_set_double", "SQLPS-SET-DOUBLE", 3, 0, false);
        declareFunction(me, "sqlps_set_string", "SQLPS-SET-STRING", 3, 0, false);
        declareFunction(me, "new_sql_statement", "NEW-SQL-STATEMENT", 1, 0, false);
        declareFunction(me, "sqls_get_connection", "SQLS-GET-CONNECTION", 1, 0, false);
        declareFunction(me, "sqls_local_close", "SQLS-LOCAL-CLOSE", 1, 0, false);
        declareFunction(me, "sqlps_set", "SQLPS-SET", 4, 0, false);
        declareFunction(me, "new_sql_prepared_statement", "NEW-SQL-PREPARED-STATEMENT", 2, 0, false);
        declareFunction(me, "new_statement_id", "NEW-STATEMENT-ID", 0, 0, false);
        declareFunction(me, "new_result_set_id", "NEW-RESULT-SET-ID", 0, 0, false);
        declareFunction(me, "sqlc_get_tables", "SQLC-GET-TABLES", 5, 0, false);
        declareFunction(me, "sqlc_get_tables_meta_data", "SQLC-GET-TABLES-META-DATA", 5, 0, false);
        declareFunction(me, "sqlc_get_columns", "SQLC-GET-COLUMNS", 5, 0, false);
        declareFunction(me, "sqlc_get_columns_meta_data", "SQLC-GET-COLUMNS-META-DATA", 5, 0, false);
        declareFunction(me, "sqlc_get_primary_keys", "SQLC-GET-PRIMARY-KEYS", 4, 0, false);
        declareFunction(me, "sqlc_get_primary_keys_meta_data", "SQLC-GET-PRIMARY-KEYS-META-DATA", 4, 0, false);
        declareFunction(me, "sqlc_get_imported_keys", "SQLC-GET-IMPORTED-KEYS", 4, 0, false);
        declareFunction(me, "sqlc_get_imported_keys_meta_data", "SQLC-GET-IMPORTED-KEYS-META-DATA", 4, 0, false);
        declareFunction(me, "sqlc_get_exported_keys", "SQLC-GET-EXPORTED-KEYS", 4, 0, false);
        declareFunction(me, "sqlc_get_exported_keys_meta_data", "SQLC-GET-EXPORTED-KEYS-META-DATA", 4, 0, false);
        declareFunction(me, "sqlc_get_index_info", "SQLC-GET-INDEX-INFO", 6, 0, false);
        declareFunction(me, "sqlc_get_index_info_meta_data", "SQLC-GET-INDEX-INFO-META-DATA", 6, 0, false);
        declareFunction(me, "sqlc_get_max_connections", "SQLC-GET-MAX-CONNECTIONS", 1, 0, false);
        declareFunction(me, "sdbc_error_handling_tag_p", "SDBC-ERROR-HANDLING-TAG-P", 1, 0, false);
        declareFunction(me, "new_db_url", "NEW-DB-URL", 5, 1, false);
        declareFunction(me, "add_sdbc_database_connection_url_description", "ADD-SDBC-DATABASE-CONNECTION-URL-DESCRIPTION", 5, 0, false);
        declareFunction(me, "get_all_sdbc_database_sub_protocols", "GET-ALL-SDBC-DATABASE-SUB-PROTOCOLS", 0, 0, false);
        declareFunction(me, "compile_db_conn_url_punctuation_info", "COMPILE-DB-CONN-URL-PUNCTUATION-INFO", 1, 0, false);
        declareMacro(me, "register_sdbc_database_connection_url_description", "REGISTER-SDBC-DATABASE-CONNECTION-URL-DESCRIPTION");
        declareFunction(me, "set_sdbc_db2_port", "SET-SDBC-DB2-PORT", 1, 0, false);
        declareFunction(me, "sdbc_db2_port", "SDBC-DB2-PORT", 0, 0, false);
        declareFunction(me, "set_sdbc_sybase_iq_port", "SET-SDBC-SYBASE-IQ-PORT", 1, 0, false);
        declareFunction(me, "sdbc_sybase_iq_port", "SDBC-SYBASE-IQ-PORT", 0, 0, false);
        declareFunction(me, "construct_new_database_connection_url", "CONSTRUCT-NEW-DATABASE-CONNECTION-URL", 2, 0, false);
        declareFunction(me, "construct_new_dbconn_url_required", "CONSTRUCT-NEW-DBCONN-URL-REQUIRED", 4, 0, false);
        declareFunction(me, "resolve_dbconn_url_reference", "RESOLVE-DBCONN-URL-REFERENCE", 3, 0, false);
        declareFunction(me, "append_dbconn_url_options", "APPEND-DBCONN-URL-OPTIONS", 5, 0, false);
        declareFunction(me, "write_dbconn_url_punctuation", "WRITE-DBCONN-URL-PUNCTUATION", 3, 0, false);
        declareFunction(me, "java_integerp", "JAVA-INTEGERP", 1, 0, false);
        declareFunction(me, "java_longp", "JAVA-LONGP", 1, 0, false);
        declareFunction(me, "java_floatp", "JAVA-FLOATP", 1, 0, false);
        declareFunction(me, "java_doublep", "JAVA-DOUBLEP", 1, 0, false);
        declareMacro(me, "with_sql_connection", "WITH-SQL-CONNECTION");
        declareMacro(me, "with_sql_statement", "WITH-SQL-STATEMENT");
        declareMacro(me, "with_prepared_sql_statement", "WITH-PREPARED-SQL-STATEMENT");
        declareMacro(me, "sqls_execute_transaction", "SQLS-EXECUTE-TRANSACTION");
        declareFunction(me, "sqls_handle_commit_error", "SQLS-HANDLE-COMMIT-ERROR", 1, 0, false);
        declareFunction(me, "sqls_handle_rollback", "SQLS-HANDLE-ROLLBACK", 1, 0, false);
        declareFunction(me, "sqls_handle_transaction_errors", "SQLS-HANDLE-TRANSACTION-ERRORS", 1, 0, false);
        declareMacro(me, "with_sql_transaction", "WITH-SQL-TRANSACTION");
        declareMacro(me, "with_sql_result_set", "WITH-SQL-RESULT-SET");
        declareMacro(me, "do_sql_result_set", "DO-SQL-RESULT-SET");
        declareFunction(me, "sql_export", "SQL-EXPORT", 4, 5, false);
        declareFunction(me, "sdbc_test", "SDBC-TEST", 3, 5, false);
        declareFunction(me, "sdbc_test_prepared", "SDBC-TEST-PREPARED", 3, 5, false);
        declareFunction(me, "sdbc_test_created", "SDBC-TEST-CREATED", 3, 5, false);
        declareFunction(me, "sdbc_test_batch", "SDBC-TEST-BATCH", 3, 5, false);
        return NIL;
    }

    public static SubLObject init_sdbc_file() {
        deflexical("*DBMS-SERVER*", red_infrastructure_macros.red_def_helper($list0.isSymbol() ? symbol_value($list0) : $list0, $dbms_server$, $str2$db_server_cyc_com.isSymbol() ? symbol_value($str2$db_server_cyc_com) : $str2$db_server_cyc_com, $LEXICAL, UNPROVIDED));
        deflexical("*SDBC-PROXY-SERVER*", red_infrastructure_macros.red_def_helper($list4.isSymbol() ? symbol_value($list4) : $list4, $sdbc_proxy_server$, $str2$db_server_cyc_com.isSymbol() ? symbol_value($str2$db_server_cyc_com) : $str2$db_server_cyc_com, $LEXICAL, UNPROVIDED));
        deflexical("*SQL-PORT*", red_infrastructure_macros.red_def_helper($list6.isSymbol() ? symbol_value($list6) : $list6, $sql_port$, $int$9999.isSymbol() ? symbol_value($int$9999) : $int$9999, $LEXICAL, UNPROVIDED));
        deflexical("*SQL-PROTOCOL*", $$$jdbc);
        deflexical("*SQL-SUBPROTOCOL*", $$$postgresql);
        deflexical("*SQL-CONNECTION-TIMEOUT*", FIVE_INTEGER);
        deflexical("*CONNECTION-ID*", $$$CONNECTION);
        defparameter("*RESULT-SET-BLOCK-SIZE*", $int$1000);
        deflexical("*QUIT*", ZERO_INTEGER);
        deflexical("*EXECUTE-UPDATE*", ONE_INTEGER);
        deflexical("*EXECUTE-QUERY*", TWO_INTEGER);
        deflexical("*PREPARE-STATEMENT*", THREE_INTEGER);
        deflexical("*CREATE-STATEMENT*", FOUR_INTEGER);
        deflexical("*SET-BYTES*", FIVE_INTEGER);
        deflexical("*PS-EXECUTE-UPDATE*", SIX_INTEGER);
        deflexical("*PS-EXECUTE-QUERY*", SEVEN_INTEGER);
        deflexical("*SET-INT*", EIGHT_INTEGER);
        deflexical("*CLOSE-STATEMENT*", NINE_INTEGER);
        deflexical("*NEW-CONNECTION*", TEN_INTEGER);
        deflexical("*SET-STRING*", ELEVEN_INTEGER);
        deflexical("*SET-LONG*", TWELVE_INTEGER);
        deflexical("*SET-DOUBLE*", THIRTEEN_INTEGER);
        deflexical("*SET-FLOAT*", FOURTEEN_INTEGER);
        deflexical("*EXECUTE-BATCH*", FIFTEEN_INTEGER);
        deflexical("*GET-ROWS*", SIXTEEN_INTEGER);
        deflexical("*CLOSE-RESULT-SET*", SEVENTEEN_INTEGER);
        deflexical("*EXECUTE-UPDATE-AUTO-KEYS*", EIGHTEEN_INTEGER);
        deflexical("*GET-GENERATED-KEYS*", NINETEEN_INTEGER);
        deflexical("*SET-AUTO-COMMIT*", TWENTY_INTEGER);
        deflexical("*COMMIT*", $int$21);
        deflexical("*ROLLBACK*", $int$22);
        deflexical("*GET-TRANSACTION-ISOLATION*", $int$23);
        deflexical("*SET-TRANSACTION-ISOLATION*", $int$24);
        deflexical("*GET-AUTO-COMMIT*", $int$25);
        deflexical("*GET-TABLES*", $int$26);
        deflexical("*GET-COLUMNS*", $int$27);
        deflexical("*GET-PRIMARY-KEYS*", $int$28);
        deflexical("*GET-IMPORTED-KEYS*", $int$29);
        deflexical("*GET-EXPORTED-KEYS*", $int$30);
        deflexical("*GET-INDEX-INFO*", $int$31);
        deflexical("*CANCEL*", $int$32);
        deflexical("*GET-MAX-CONNECTIONS*", $int$33);
        deflexical("*STOP-RESPONSE*", ZERO_INTEGER);
        deflexical("*INTEGER-RESPONSE*", ONE_INTEGER);
        deflexical("*RESULT-SET-RESPONSE*", TWO_INTEGER);
        deflexical("*VOID-RESPONSE*", THREE_INTEGER);
        deflexical("*CONNECTION*", FOUR_INTEGER);
        deflexical("*UPDATE-COUNTS*", FIVE_INTEGER);
        deflexical("*TRANSACTION-ISOLATION-LEVEL*", SIX_INTEGER);
        deflexical("*BOOLEAN*", SEVEN_INTEGER);
        deflexical("*IO-ERROR*", MINUS_ONE_INTEGER);
        deflexical("*SQL-ERROR*", $int$_2);
        deflexical("*UNKNOWN-ERROR*", $int$_3);
        deflexical("*CLIENT-ERROR*", $int$_4);
        deflexical("*COMMIT-ERROR*", $int$_5);
        deflexical("*ROLLBACK-ERROR*", $int$_6);
        deflexical("*TRANSACTION-ERROR*", $int$_7);
        deflexical("*BATCH-UPDATE-ERROR*", $int$_8);
        defconstant("*DTP-SQL-CONNECTION*", SQL_CONNECTION);
        defconstant("*DTP-SQL-TICKET*", SQL_TICKET);
        defparameter("*SQL-CONNECTION-TIMEOUT-SECONDS*", $int$212);
        defparameter("*SQL-CONNECTION-TIMEOUT-SECONDS-WITHIN-INFERENCE*", numeric_date_utilities.$seconds_in_an_hour$.getGlobalValue());
        defconstant("*DTP-SDBC-ERROR*", SDBC_ERROR);
        defparameter("*SDBC-ERROR-DECODING*", list(bq_cons($io_error$.getGlobalValue(), $str167$_IO), bq_cons($sql_error$.getGlobalValue(), $str168$_SQL), bq_cons($unknown_error$.getGlobalValue(), $str169$), bq_cons($client_error$.getGlobalValue(), $str170$_CLIENT), bq_cons($transaction_error$.getGlobalValue(), $str171$_TRANSACTION), bq_cons($rollback_error$.getGlobalValue(), $str172$_ROLLBACK), bq_cons($batch_update_error$.getGlobalValue(), $str173$_BATCH_UPDATE)));
        defconstant("*DTP-SQL-RESULT-SET*", SQL_RESULT_SET);
        defconstant("*DTP-SQL-STATEMENT*", SQL_STATEMENT);
        deflexical("*SDBC-DATABASE-CONNECTION-URL-DESCRIPTIONS*", SubLSystemTrampolineFile.maybeDefault($sdbc_database_connection_url_descriptions$, $sdbc_database_connection_url_descriptions$, () -> dictionary.new_dictionary(EQUAL, UNPROVIDED)));
        deflexical("*SDBC-DB2-PORT*", SubLSystemTrampolineFile.maybeDefault($sym331$_SDBC_DB2_PORT_, $sdbc_db2_port$, $int$50001));
        deflexical("*SDBC-SYBASE-IQ-PORT*", SubLSystemTrampolineFile.maybeDefault($sdbc_sybase_iq_port$, $sdbc_sybase_iq_port$, $int$2638));
        deflexical("*SDBC-TEST-ROW-CARDINALITY*", $int$25);
        return NIL;
    }

    public static SubLObject setup_sdbc_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_connection$.getGlobalValue(), symbol_function(SQL_CONNECTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list45);
        def_csetf(SQLC_DB, _CSETF_SQLC_DB);
        def_csetf(SQLC_USER, _CSETF_SQLC_USER);
        def_csetf(SQLC_DBMS_SERVER, _CSETF_SQLC_DBMS_SERVER);
        def_csetf(SQLC_PORT, _CSETF_SQLC_PORT);
        def_csetf(SQLC_CHANNEL, _CSETF_SQLC_CHANNEL);
        def_csetf(SQLC_STATEMENTS, _CSETF_SQLC_STATEMENTS);
        def_csetf(SQLC_LOCK, _CSETF_SQLC_LOCK);
        def_csetf(SQLC_SUBPROTOCOL, _CSETF_SQLC_SUBPROTOCOL);
        def_csetf(SQLC_PROXY_SERVER, _CSETF_SQLC_PROXY_SERVER);
        def_csetf(SQLC_ERROR_HANDLING, _CSETF_SQLC_ERROR_HANDLING);
        def_csetf(SQLC_TICKETS, _CSETF_SQLC_TICKETS);
        def_csetf(SQLC_MAILMAN, _CSETF_SQLC_MAILMAN);
        identity(SQL_CONNECTION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_connection$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_CONNECTION_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_ticket$.getGlobalValue(), symbol_function(SQL_TICKET_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list117);
        def_csetf(SQL_TICKET_SEMAPHORE, _CSETF_SQL_TICKET_SEMAPHORE);
        def_csetf(SQL_TICKET_RESULT, _CSETF_SQL_TICKET_RESULT);
        identity(SQL_TICKET);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_ticket$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_TICKET_METHOD));
        register_macro_helper(SQLC_SET_ERROR_HANDLING, SQLS_EXECUTE_TRANSACTION);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sdbc_error$.getGlobalValue(), symbol_function(SDBC_ERROR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list150);
        def_csetf(SDBC_ERROR_TYPE, _CSETF_SDBC_ERROR_TYPE);
        def_csetf(SDBC_ERROR_MESSAGE, _CSETF_SDBC_ERROR_MESSAGE);
        def_csetf(SDBC_ERROR_CODE, _CSETF_SDBC_ERROR_CODE);
        identity(SDBC_ERROR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sdbc_error$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SDBC_ERROR_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_result_set$.getGlobalValue(), symbol_function(SQL_RESULT_SET_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list182);
        def_csetf(SQLRS_ROWS, _CSETF_SQLRS_ROWS);
        def_csetf(SQLRS_CURRENT, _CSETF_SQLRS_CURRENT);
        def_csetf(SQLRS_LAST, _CSETF_SQLRS_LAST);
        def_csetf(SQLRS_START, _CSETF_SQLRS_START);
        def_csetf(SQLRS_CONNECTION, _CSETF_SQLRS_CONNECTION);
        def_csetf(SQLRS_BLOCK_SIZE, _CSETF_SQLRS_BLOCK_SIZE);
        def_csetf(SQLRS_ID, _CSETF_SQLRS_ID);
        identity(SQL_RESULT_SET);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_result_set$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_RESULT_SET_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sql_statement$.getGlobalValue(), symbol_function(SQL_STATEMENT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list225);
        def_csetf(SQLS_CONNECTION, _CSETF_SQLS_CONNECTION);
        def_csetf(SQLS_ID, _CSETF_SQLS_ID);
        def_csetf(SQLS_SQL, _CSETF_SQLS_SQL);
        def_csetf(SQLS_SETTINGS, _CSETF_SQLS_SETTINGS);
        def_csetf(SQLS_BATCH, _CSETF_SQLS_BATCH);
        def_csetf(SQLS_RS, _CSETF_SQLS_RS);
        identity(SQL_STATEMENT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sql_statement$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SQL_STATEMENT_METHOD));
        register_macro_helper(SQLS_GET_CONNECTION, SQLS_EXECUTE_TRANSACTION);
        define_test_case_table_int(NEW_DB_URL, list(new SubLObject[]{ $TEST, symbol_function($sym275$STRING_), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list281);
        declare_defglobal($sdbc_database_connection_url_descriptions$);
        register_external_symbol(GET_ALL_SDBC_DATABASE_SUB_PROTOCOLS);
        add_sdbc_database_connection_url_description($$$postgresql, $list299, $list300, $list301, $list302);
        add_sdbc_database_connection_url_description($$$mysql, $list299, $list304, $list301, $list305);
        add_sdbc_database_connection_url_description($$$oracle, $list307, NIL, NIL, $list308);
        add_sdbc_database_connection_url_description($$$sqlserver, $list310, $list311, $list312, $list313);
        add_sdbc_database_connection_url_description($str314$microsoft_sqlserver, $list315, $list311, $list312, $list313);
        add_sdbc_database_connection_url_description($$$odbc, $list317, $list318, $list312, NIL);
        add_sdbc_database_connection_url_description($$$sybase, $list320, $list321, $list312, $list322);
        add_sdbc_database_connection_url_description($$$derby, $list299, $list304, $list312, $list324);
        add_sdbc_database_connection_url_description($$$st, $list299, $list326, $list301, $list327);
        add_sdbc_database_connection_url_description($$$poiseschema, $list329, NIL, $list301, NIL);
        add_sdbc_database_connection_url_description($$$poisedata, $list317, NIL, $list301, NIL);
        register_external_symbol($sym331$_SDBC_DB2_PORT_);
        declare_defglobal($sym331$_SDBC_DB2_PORT_);
        register_external_symbol(SET_SDBC_DB2_PORT);
        add_sdbc_database_connection_url_description($$$db2, $list335, $list304, $list336, $list337);
        register_external_symbol($sdbc_sybase_iq_port$);
        declare_defglobal($sdbc_sybase_iq_port$);
        register_external_symbol(SET_SDBC_SYBASE_IQ_PORT);
        add_sdbc_database_connection_url_description($str341$sybase_iq, $list342, $list321, $list343, $list344);
        register_macro_helper(SQLS_HANDLE_COMMIT_ERROR, SQLS_EXECUTE_TRANSACTION);
        register_macro_helper(SQLS_HANDLE_ROLLBACK, SQLS_EXECUTE_TRANSACTION);
        register_macro_helper(SQLS_HANDLE_TRANSACTION_ERRORS, SQLS_EXECUTE_TRANSACTION);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sdbc_file();
    }

    @Override
    public void initializeVariables() {
        init_sdbc_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sdbc_file();
    }

    public static final class $sql_connection_native extends SubLStructNative {
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

        private $sql_connection_native() {
            this.$db = Lisp.NIL;
            this.$user = Lisp.NIL;
            this.$dbms_server = Lisp.NIL;
            this.$port = Lisp.NIL;
            this.$channel = Lisp.NIL;
            this.$statements = Lisp.NIL;
            this.$lock = Lisp.NIL;
            this.$subprotocol = Lisp.NIL;
            this.$proxy_server = Lisp.NIL;
            this.$error_handling = Lisp.NIL;
            this.$tickets = Lisp.NIL;
            this.$mailman = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$db;
        }

        @Override
        public SubLObject getField3() {
            return this.$user;
        }

        @Override
        public SubLObject getField4() {
            return this.$dbms_server;
        }

        @Override
        public SubLObject getField5() {
            return this.$port;
        }

        @Override
        public SubLObject getField6() {
            return this.$channel;
        }

        @Override
        public SubLObject getField7() {
            return this.$statements;
        }

        @Override
        public SubLObject getField8() {
            return this.$lock;
        }

        @Override
        public SubLObject getField9() {
            return this.$subprotocol;
        }

        @Override
        public SubLObject getField10() {
            return this.$proxy_server;
        }

        @Override
        public SubLObject getField11() {
            return this.$error_handling;
        }

        @Override
        public SubLObject getField12() {
            return this.$tickets;
        }

        @Override
        public SubLObject getField13() {
            return this.$mailman;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$db = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$user = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$dbms_server = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$port = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$channel = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$statements = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$lock = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$subprotocol = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$proxy_server = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$error_handling = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$tickets = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$mailman = value;
        }

        static {
            structDecl = makeStructDeclNative($sql_connection_native.class, SQL_CONNECTION, SQL_CONNECTION_P, $list39, $list40, new String[]{ "$db", "$user", "$dbms_server", "$port", "$channel", "$statements", "$lock", "$subprotocol", "$proxy_server", "$error_handling", "$tickets", "$mailman" }, $list41, $list42, SQLC_PRINT);
        }
    }

    public static final class $sql_connection_p$UnaryFunction extends UnaryFunction {
        public $sql_connection_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-CONNECTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_connection_p(arg1);
        }
    }

    public static final class $sql_ticket_native extends SubLStructNative {
        public SubLObject $semaphore;

        public SubLObject $result;

        private static final SubLStructDeclNative structDecl;

        private $sql_ticket_native() {
            this.$semaphore = Lisp.NIL;
            this.$result = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$semaphore;
        }

        @Override
        public SubLObject getField3() {
            return this.$result;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$semaphore = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$result = value;
        }

        static {
            structDecl = makeStructDeclNative($sql_ticket_native.class, SQL_TICKET, SQL_TICKET_P, $list111, $list112, new String[]{ "$semaphore", "$result" }, $list113, $list114, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $sql_ticket_p$UnaryFunction extends UnaryFunction {
        public $sql_ticket_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-TICKET-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_ticket_p(arg1);
        }
    }

    public static final class $sdbc_error_native extends SubLStructNative {
        public SubLObject $type;

        public SubLObject $message;

        public SubLObject $code;

        private static final SubLStructDeclNative structDecl;

        private $sdbc_error_native() {
            this.$type = Lisp.NIL;
            this.$message = Lisp.NIL;
            this.$code = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$type;
        }

        @Override
        public SubLObject getField3() {
            return this.$message;
        }

        @Override
        public SubLObject getField4() {
            return this.$code;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$message = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$code = value;
        }

        static {
            structDecl = makeStructDeclNative($sdbc_error_native.class, SDBC_ERROR, SDBC_ERROR_P, $list144, $list145, new String[]{ "$type", "$message", "$code" }, $list146, $list147, SDBC_ERROR_PRINT);
        }
    }

    public static final class $sdbc_error_p$UnaryFunction extends UnaryFunction {
        public $sdbc_error_p$UnaryFunction() {
            super(extractFunctionNamed("SDBC-ERROR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sdbc_error_p(arg1);
        }
    }

    public static final class $sql_result_set_native extends SubLStructNative {
        public SubLObject $rows;

        public SubLObject $current;

        public SubLObject $last;

        public SubLObject $start;

        public SubLObject $connection;

        public SubLObject $block_size;

        public SubLObject $id;

        private static final SubLStructDeclNative structDecl;

        private $sql_result_set_native() {
            this.$rows = Lisp.NIL;
            this.$current = Lisp.NIL;
            this.$last = Lisp.NIL;
            this.$start = Lisp.NIL;
            this.$connection = Lisp.NIL;
            this.$block_size = Lisp.NIL;
            this.$id = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$rows;
        }

        @Override
        public SubLObject getField3() {
            return this.$current;
        }

        @Override
        public SubLObject getField4() {
            return this.$last;
        }

        @Override
        public SubLObject getField5() {
            return this.$start;
        }

        @Override
        public SubLObject getField6() {
            return this.$connection;
        }

        @Override
        public SubLObject getField7() {
            return this.$block_size;
        }

        @Override
        public SubLObject getField8() {
            return this.$id;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$rows = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$current = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$last = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$start = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$connection = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$block_size = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$id = value;
        }

        static {
            structDecl = makeStructDeclNative($sql_result_set_native.class, SQL_RESULT_SET, SQL_RESULT_SET_P, $list176, $list177, new String[]{ "$rows", "$current", "$last", "$start", "$connection", "$block_size", "$id" }, $list178, $list179, SQLRS_PRINT);
        }
    }

    public static final class $sql_result_set_p$UnaryFunction extends UnaryFunction {
        public $sql_result_set_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-RESULT-SET-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_result_set_p(arg1);
        }
    }

    public static final class $sql_statement_native extends SubLStructNative {
        public SubLObject $connection;

        public SubLObject $id;

        public SubLObject $sql;

        public SubLObject $settings;

        public SubLObject $batch;

        public SubLObject $rs;

        private static final SubLStructDeclNative structDecl;

        private $sql_statement_native() {
            this.$connection = Lisp.NIL;
            this.$id = Lisp.NIL;
            this.$sql = Lisp.NIL;
            this.$settings = Lisp.NIL;
            this.$batch = Lisp.NIL;
            this.$rs = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$connection;
        }

        @Override
        public SubLObject getField3() {
            return this.$id;
        }

        @Override
        public SubLObject getField4() {
            return this.$sql;
        }

        @Override
        public SubLObject getField5() {
            return this.$settings;
        }

        @Override
        public SubLObject getField6() {
            return this.$batch;
        }

        @Override
        public SubLObject getField7() {
            return this.$rs;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$connection = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$sql = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$settings = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$batch = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$rs = value;
        }

        static {
            structDecl = makeStructDeclNative($sql_statement_native.class, SQL_STATEMENT, SQL_STATEMENT_P, $list220, $list221, new String[]{ "$connection", "$id", "$sql", "$settings", "$batch", "$rs" }, $list222, $list223, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $sql_statement_p$UnaryFunction extends UnaryFunction {
        public $sql_statement_p$UnaryFunction() {
            super(extractFunctionNamed("SQL-STATEMENT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sql_statement_p(arg1);
        }
    }

    public static final SubLFile me = new sdbc();

    public static final String myName = "com.cyc.cycjava.cycl.sdbc";

    public static final String myFingerPrint = "cb7d9e5569a0d044cd6308d983347b59702145cdcd41d83c1a952b9c3837b56a";







    // deflexical
    public static final SubLSymbol $sql_protocol$ = makeSymbol("*SQL-PROTOCOL*");





    // deflexical
    public static final SubLSymbol $connection_id$ = makeSymbol("*CONNECTION-ID*");

    // defparameter
    /**
     * The maximum number of rows that will reside locally in a result set at a
     * given time
     */
    private static final SubLSymbol $result_set_block_size$ = makeSymbol("*RESULT-SET-BLOCK-SIZE*");

    // deflexical
    private static final SubLSymbol $quit$ = makeSymbol("*QUIT*");

    // deflexical
    private static final SubLSymbol $execute_update$ = makeSymbol("*EXECUTE-UPDATE*");

    // deflexical
    private static final SubLSymbol $execute_query$ = makeSymbol("*EXECUTE-QUERY*");

    // deflexical
    private static final SubLSymbol $prepare_statement$ = makeSymbol("*PREPARE-STATEMENT*");

    // deflexical
    private static final SubLSymbol $create_statement$ = makeSymbol("*CREATE-STATEMENT*");

    // deflexical
    private static final SubLSymbol $set_bytes$ = makeSymbol("*SET-BYTES*");

    // deflexical
    private static final SubLSymbol $ps_execute_update$ = makeSymbol("*PS-EXECUTE-UPDATE*");

    // deflexical
    private static final SubLSymbol $ps_execute_query$ = makeSymbol("*PS-EXECUTE-QUERY*");

    // deflexical
    private static final SubLSymbol $set_int$ = makeSymbol("*SET-INT*");

    // deflexical
    private static final SubLSymbol $close_statement$ = makeSymbol("*CLOSE-STATEMENT*");

    // deflexical
    private static final SubLSymbol $new_connection$ = makeSymbol("*NEW-CONNECTION*");

    // deflexical
    private static final SubLSymbol $set_string$ = makeSymbol("*SET-STRING*");

    // deflexical
    private static final SubLSymbol $set_long$ = makeSymbol("*SET-LONG*");

    // deflexical
    private static final SubLSymbol $set_double$ = makeSymbol("*SET-DOUBLE*");

    // deflexical
    private static final SubLSymbol $set_float$ = makeSymbol("*SET-FLOAT*");

    // deflexical
    private static final SubLSymbol $execute_batch$ = makeSymbol("*EXECUTE-BATCH*");

    // deflexical
    private static final SubLSymbol $get_rows$ = makeSymbol("*GET-ROWS*");

    // deflexical
    private static final SubLSymbol $close_result_set$ = makeSymbol("*CLOSE-RESULT-SET*");

    // deflexical
    private static final SubLSymbol $execute_update_auto_keys$ = makeSymbol("*EXECUTE-UPDATE-AUTO-KEYS*");

    // deflexical
    private static final SubLSymbol $get_generated_keys$ = makeSymbol("*GET-GENERATED-KEYS*");

    // deflexical
    private static final SubLSymbol $set_auto_commit$ = makeSymbol("*SET-AUTO-COMMIT*");

    // deflexical
    private static final SubLSymbol $commit$ = makeSymbol("*COMMIT*");

    // deflexical
    private static final SubLSymbol $rollback$ = makeSymbol("*ROLLBACK*");

    // deflexical
    private static final SubLSymbol $get_transaction_isolation$ = makeSymbol("*GET-TRANSACTION-ISOLATION*");

    // deflexical
    private static final SubLSymbol $set_transaction_isolation$ = makeSymbol("*SET-TRANSACTION-ISOLATION*");

    // deflexical
    private static final SubLSymbol $get_auto_commit$ = makeSymbol("*GET-AUTO-COMMIT*");

    // deflexical
    private static final SubLSymbol $get_tables$ = makeSymbol("*GET-TABLES*");

    // deflexical
    private static final SubLSymbol $get_columns$ = makeSymbol("*GET-COLUMNS*");

    // deflexical
    private static final SubLSymbol $get_primary_keys$ = makeSymbol("*GET-PRIMARY-KEYS*");

    // deflexical
    private static final SubLSymbol $get_imported_keys$ = makeSymbol("*GET-IMPORTED-KEYS*");

    // deflexical
    private static final SubLSymbol $get_exported_keys$ = makeSymbol("*GET-EXPORTED-KEYS*");

    // deflexical
    private static final SubLSymbol $get_index_info$ = makeSymbol("*GET-INDEX-INFO*");

    // deflexical
    private static final SubLSymbol $cancel$ = makeSymbol("*CANCEL*");

    // deflexical
    private static final SubLSymbol $get_max_connections$ = makeSymbol("*GET-MAX-CONNECTIONS*");

    // deflexical
    private static final SubLSymbol $stop_response$ = makeSymbol("*STOP-RESPONSE*");

    // deflexical
    private static final SubLSymbol $integer_response$ = makeSymbol("*INTEGER-RESPONSE*");

    // deflexical
    private static final SubLSymbol $result_set_response$ = makeSymbol("*RESULT-SET-RESPONSE*");

    // deflexical
    private static final SubLSymbol $void_response$ = makeSymbol("*VOID-RESPONSE*");

    // deflexical
    private static final SubLSymbol $connection$ = makeSymbol("*CONNECTION*");

    // deflexical
    private static final SubLSymbol $update_counts$ = makeSymbol("*UPDATE-COUNTS*");

    // deflexical
    private static final SubLSymbol $transaction_isolation_level$ = makeSymbol("*TRANSACTION-ISOLATION-LEVEL*");

    // deflexical
    private static final SubLSymbol $boolean$ = makeSymbol("*BOOLEAN*");

    // deflexical
    private static final SubLSymbol $io_error$ = makeSymbol("*IO-ERROR*");

    // deflexical
    private static final SubLSymbol $sql_error$ = makeSymbol("*SQL-ERROR*");

    // deflexical
    private static final SubLSymbol $unknown_error$ = makeSymbol("*UNKNOWN-ERROR*");

    // deflexical
    private static final SubLSymbol $client_error$ = makeSymbol("*CLIENT-ERROR*");

    // deflexical
    private static final SubLSymbol $commit_error$ = makeSymbol("*COMMIT-ERROR*");

    // deflexical
    private static final SubLSymbol $rollback_error$ = makeSymbol("*ROLLBACK-ERROR*");

    // deflexical
    private static final SubLSymbol $transaction_error$ = makeSymbol("*TRANSACTION-ERROR*");

    // deflexical
    private static final SubLSymbol $batch_update_error$ = makeSymbol("*BATCH-UPDATE-ERROR*");

    // defconstant
    public static final SubLSymbol $dtp_sql_connection$ = makeSymbol("*DTP-SQL-CONNECTION*");

    // defconstant
    public static final SubLSymbol $dtp_sql_ticket$ = makeSymbol("*DTP-SQL-TICKET*");

    // defparameter
    public static final SubLSymbol $sql_connection_timeout_seconds$ = makeSymbol("*SQL-CONNECTION-TIMEOUT-SECONDS*");

    // defparameter
    public static final SubLSymbol $sql_connection_timeout_seconds_within_inference$ = makeSymbol("*SQL-CONNECTION-TIMEOUT-SECONDS-WITHIN-INFERENCE*");

    // defconstant
    public static final SubLSymbol $dtp_sdbc_error$ = makeSymbol("*DTP-SDBC-ERROR*");

    // defparameter
    private static final SubLSymbol $sdbc_error_decoding$ = makeSymbol("*SDBC-ERROR-DECODING*");

    // defconstant
    public static final SubLSymbol $dtp_sql_result_set$ = makeSymbol("*DTP-SQL-RESULT-SET*");

    // defconstant
    public static final SubLSymbol $dtp_sql_statement$ = makeSymbol("*DTP-SQL-STATEMENT*");



    // deflexical
    public static final SubLSymbol $sdbc_db2_port$ = makeSymbol("*SDBC-DB2-PORT*");



    // deflexical
    private static final SubLSymbol $sdbc_test_row_cardinality$ = makeSymbol("*SDBC-TEST-ROW-CARDINALITY*");

    public static final SubLList $list0 = list(makeString("application.dbms-server"));

    public static final SubLSymbol $dbms_server$ = makeSymbol("*DBMS-SERVER*");

    public static final SubLString $str2$db_server_cyc_com = makeString("db-server.cyc.com");



    public static final SubLList $list4 = list(makeString("application.proxy-server"));

    public static final SubLSymbol $sdbc_proxy_server$ = makeSymbol("*SDBC-PROXY-SERVER*");

    public static final SubLList $list6 = list(makeString("application.sql-port"));

    public static final SubLSymbol $sql_port$ = makeSymbol("*SQL-PORT*");

    private static final SubLInteger $int$9999 = makeInteger(9999);

    public static final SubLString $$$jdbc = makeString("jdbc");

    public static final SubLString $$$postgresql = makeString("postgresql");

    public static final SubLString $$$CONNECTION = makeString("CONNECTION");



    private static final SubLInteger $int$21 = makeInteger(21);

    private static final SubLInteger $int$22 = makeInteger(22);

    private static final SubLInteger $int$23 = makeInteger(23);

    private static final SubLInteger $int$24 = makeInteger(24);

    private static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLInteger $int$26 = makeInteger(26);

    private static final SubLInteger $int$27 = makeInteger(27);

    private static final SubLInteger $int$28 = makeInteger(28);

    private static final SubLInteger $int$29 = makeInteger(29);

    private static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLInteger $int$31 = makeInteger(31);



    private static final SubLInteger $int$33 = makeInteger(33);



    private static final SubLInteger $int$_3 = makeInteger(-3);

    private static final SubLInteger $int$_4 = makeInteger(-4);

    private static final SubLInteger $int$_5 = makeInteger(-5);

    private static final SubLInteger $int$_6 = makeInteger(-6);

    private static final SubLInteger $int$_7 = makeInteger(-7);

    private static final SubLInteger $int$_8 = makeInteger(-8);









    public static final SubLSymbol SQL_CONNECTION = makeSymbol("SQL-CONNECTION");

    public static final SubLSymbol SQL_CONNECTION_P = makeSymbol("SQL-CONNECTION-P");

    public static final SubLList $list39 = list(new SubLObject[]{ makeSymbol("DB"), makeSymbol("USER"), makeSymbol("DBMS-SERVER"), makeSymbol("PORT"), makeSymbol("CHANNEL"), makeSymbol("STATEMENTS"), makeSymbol("LOCK"), makeSymbol("SUBPROTOCOL"), makeSymbol("PROXY-SERVER"), makeSymbol("ERROR-HANDLING"), makeSymbol("TICKETS"), makeSymbol("MAILMAN") });

    public static final SubLList $list40 = list(new SubLObject[]{ makeKeyword("DB"), makeKeyword("USER"), makeKeyword("DBMS-SERVER"), makeKeyword("PORT"), makeKeyword("CHANNEL"), makeKeyword("STATEMENTS"), makeKeyword("LOCK"), makeKeyword("SUBPROTOCOL"), makeKeyword("PROXY-SERVER"), makeKeyword("ERROR-HANDLING"), makeKeyword("TICKETS"), makeKeyword("MAILMAN") });

    public static final SubLList $list41 = list(new SubLObject[]{ makeSymbol("SQLC-DB"), makeSymbol("SQLC-USER"), makeSymbol("SQLC-DBMS-SERVER"), makeSymbol("SQLC-PORT"), makeSymbol("SQLC-CHANNEL"), makeSymbol("SQLC-STATEMENTS"), makeSymbol("SQLC-LOCK"), makeSymbol("SQLC-SUBPROTOCOL"), makeSymbol("SQLC-PROXY-SERVER"), makeSymbol("SQLC-ERROR-HANDLING"), makeSymbol("SQLC-TICKETS"), makeSymbol("SQLC-MAILMAN") });

    public static final SubLList $list42 = list(new SubLObject[]{ makeSymbol("_CSETF-SQLC-DB"), makeSymbol("_CSETF-SQLC-USER"), makeSymbol("_CSETF-SQLC-DBMS-SERVER"), makeSymbol("_CSETF-SQLC-PORT"), makeSymbol("_CSETF-SQLC-CHANNEL"), makeSymbol("_CSETF-SQLC-STATEMENTS"), makeSymbol("_CSETF-SQLC-LOCK"), makeSymbol("_CSETF-SQLC-SUBPROTOCOL"), makeSymbol("_CSETF-SQLC-PROXY-SERVER"), makeSymbol("_CSETF-SQLC-ERROR-HANDLING"), makeSymbol("_CSETF-SQLC-TICKETS"), makeSymbol("_CSETF-SQLC-MAILMAN") });

    public static final SubLSymbol SQLC_PRINT = makeSymbol("SQLC-PRINT");

    public static final SubLSymbol SQL_CONNECTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-CONNECTION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list45 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-CONNECTION-P"));

    private static final SubLSymbol SQLC_DB = makeSymbol("SQLC-DB");

    private static final SubLSymbol _CSETF_SQLC_DB = makeSymbol("_CSETF-SQLC-DB");

    private static final SubLSymbol SQLC_USER = makeSymbol("SQLC-USER");

    private static final SubLSymbol _CSETF_SQLC_USER = makeSymbol("_CSETF-SQLC-USER");

    private static final SubLSymbol SQLC_DBMS_SERVER = makeSymbol("SQLC-DBMS-SERVER");

    private static final SubLSymbol _CSETF_SQLC_DBMS_SERVER = makeSymbol("_CSETF-SQLC-DBMS-SERVER");

    private static final SubLSymbol SQLC_PORT = makeSymbol("SQLC-PORT");

    private static final SubLSymbol _CSETF_SQLC_PORT = makeSymbol("_CSETF-SQLC-PORT");

    private static final SubLSymbol SQLC_CHANNEL = makeSymbol("SQLC-CHANNEL");

    private static final SubLSymbol _CSETF_SQLC_CHANNEL = makeSymbol("_CSETF-SQLC-CHANNEL");

    private static final SubLSymbol SQLC_STATEMENTS = makeSymbol("SQLC-STATEMENTS");

    private static final SubLSymbol _CSETF_SQLC_STATEMENTS = makeSymbol("_CSETF-SQLC-STATEMENTS");

    private static final SubLSymbol SQLC_LOCK = makeSymbol("SQLC-LOCK");

    private static final SubLSymbol _CSETF_SQLC_LOCK = makeSymbol("_CSETF-SQLC-LOCK");

    private static final SubLSymbol SQLC_SUBPROTOCOL = makeSymbol("SQLC-SUBPROTOCOL");

    private static final SubLSymbol _CSETF_SQLC_SUBPROTOCOL = makeSymbol("_CSETF-SQLC-SUBPROTOCOL");

    private static final SubLSymbol SQLC_PROXY_SERVER = makeSymbol("SQLC-PROXY-SERVER");

    private static final SubLSymbol _CSETF_SQLC_PROXY_SERVER = makeSymbol("_CSETF-SQLC-PROXY-SERVER");

    private static final SubLSymbol SQLC_ERROR_HANDLING = makeSymbol("SQLC-ERROR-HANDLING");

    private static final SubLSymbol _CSETF_SQLC_ERROR_HANDLING = makeSymbol("_CSETF-SQLC-ERROR-HANDLING");

    private static final SubLSymbol SQLC_TICKETS = makeSymbol("SQLC-TICKETS");

    private static final SubLSymbol _CSETF_SQLC_TICKETS = makeSymbol("_CSETF-SQLC-TICKETS");

    private static final SubLSymbol SQLC_MAILMAN = makeSymbol("SQLC-MAILMAN");

    private static final SubLSymbol _CSETF_SQLC_MAILMAN = makeSymbol("_CSETF-SQLC-MAILMAN");

























    private static final SubLString $str82$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_SQL_CONNECTION = makeSymbol("MAKE-SQL-CONNECTION");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_CONNECTION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-CONNECTION-METHOD");

    private static final SubLString $str88$__SQL_CONNECTION_ = makeString("#<SQL-CONNECTION ");

    private static final SubLString $$$closed_ = makeString("closed ");

    private static final SubLString $$$to_ = makeString("to ");

    private static final SubLString $str91$__ = makeString(" [");

    private static final SubLString $str92$_ = makeString("/");

    private static final SubLString $str93$__ = makeString("]>");

    private static final SubLList $list94 = list(makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), makeSymbol("*DBMS-SERVER*")), makeSymbol("DBMS-PORT"), list(makeSymbol("SUBPROTOCOL"), makeSymbol("*SQL-SUBPROTOCOL*")), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")), list(makeSymbol("PORT"), makeSymbol("*SQL-PORT*")), list(makeSymbol("TIMEOUT"), makeSymbol("*SQL-CONNECTION-TIMEOUT*")));

    private static final SubLList $list95 = list(makeKeyword("DBMS-SERVER"), makeKeyword("DBMS-PORT"), makeKeyword("SUBPROTOCOL"), makeKeyword("PROXY-SERVER"), makeKeyword("PORT"), makeKeyword("TIMEOUT"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");









    private static final SubLString $$$SQL_connection_lock = makeString("SQL connection lock");



    private static final SubLString $str103$Trying_to_open_from_a_null_sqlc_c = makeString("Trying to open from a null sqlc channel.");

    private static final SubLString $$$timeout = makeString("timeout");

    private static final SubLSymbol $sym105$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol SQL_OPEN_CONNECTION_P = makeSymbol("SQL-OPEN-CONNECTION-P");



    private static final SubLSymbol SQL_TRANSACTION_LEVEL_P = makeSymbol("SQL-TRANSACTION-LEVEL-P");

    private static final SubLSymbol SQL_TICKET = makeSymbol("SQL-TICKET");

    private static final SubLSymbol SQL_TICKET_P = makeSymbol("SQL-TICKET-P");

    private static final SubLList $list111 = list(makeSymbol("SEMAPHORE"), makeSymbol("RESULT"));

    private static final SubLList $list112 = list(makeKeyword("SEMAPHORE"), makeKeyword("RESULT"));

    private static final SubLList $list113 = list(makeSymbol("SQL-TICKET-SEMAPHORE"), makeSymbol("SQL-TICKET-RESULT"));

    private static final SubLList $list114 = list(makeSymbol("_CSETF-SQL-TICKET-SEMAPHORE"), makeSymbol("_CSETF-SQL-TICKET-RESULT"));



    private static final SubLSymbol SQL_TICKET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-TICKET-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list117 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-TICKET-P"));

    private static final SubLSymbol SQL_TICKET_SEMAPHORE = makeSymbol("SQL-TICKET-SEMAPHORE");

    private static final SubLSymbol _CSETF_SQL_TICKET_SEMAPHORE = makeSymbol("_CSETF-SQL-TICKET-SEMAPHORE");

    private static final SubLSymbol SQL_TICKET_RESULT = makeSymbol("SQL-TICKET-RESULT");

    private static final SubLSymbol _CSETF_SQL_TICKET_RESULT = makeSymbol("_CSETF-SQL-TICKET-RESULT");





    private static final SubLSymbol MAKE_SQL_TICKET = makeSymbol("MAKE-SQL-TICKET");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_TICKET_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-TICKET-METHOD");

    private static final SubLString $$$SQL_Request = makeString("SQL Request");

    private static final SubLInteger $int$212 = makeInteger(212);

    private static final SubLString $$$Timed_out_after_ = makeString("Timed out after ");

    private static final SubLString $$$_seconds_retrieving_SQL_ticket = makeString(" seconds retrieving SQL ticket");

    private static final SubLString $$$SQL_Mailman_for_ = makeString("SQL Mailman for ");

    private static final SubLSymbol SQLC_DELIVER = makeSymbol("SQLC-DELIVER");

    private static final SubLString $str132$Implementation_error__no_ticket_f = makeString("Implementation error: no ticket for result ~a");

    private static final SubLString $str133$Trying_to_read_from_a_null_sqlc_c = makeString("Trying to read from a null sqlc channel.");





    private static final SubLSymbol SDBC_ERROR_HANDLING_TAG_P = makeSymbol("SDBC-ERROR-HANDLING-TAG-P");

    private static final SubLList $list137 = list(makeKeyword("TRANSACTION-NONE"), makeKeyword("TRANSACTION-READ-COMMITTED"), makeKeyword("TRANSACTION-READ-UNCOMMITTED"), makeKeyword("TRANSACTION-REPEATABLE-READ"), makeKeyword("TRANSACTION-SERIALIZABLE"));

    private static final SubLSymbol SQLC_SET_ERROR_HANDLING = makeSymbol("SQLC-SET-ERROR-HANDLING");

    private static final SubLSymbol SQLS_EXECUTE_TRANSACTION = makeSymbol("SQLS-EXECUTE-TRANSACTION");





    private static final SubLSymbol SDBC_ERROR = makeSymbol("SDBC-ERROR");

    private static final SubLSymbol SDBC_ERROR_P = makeSymbol("SDBC-ERROR-P");

    private static final SubLList $list144 = list(makeSymbol("TYPE"), makeSymbol("MESSAGE"), makeSymbol("CODE"));

    private static final SubLList $list145 = list(makeKeyword("TYPE"), makeKeyword("MESSAGE"), makeKeyword("CODE"));

    private static final SubLList $list146 = list(makeSymbol("SDBC-ERROR-TYPE"), makeSymbol("SDBC-ERROR-MESSAGE"), makeSymbol("SDBC-ERROR-CODE"));

    private static final SubLList $list147 = list(makeSymbol("_CSETF-SDBC-ERROR-TYPE"), makeSymbol("_CSETF-SDBC-ERROR-MESSAGE"), makeSymbol("_CSETF-SDBC-ERROR-CODE"));

    private static final SubLSymbol SDBC_ERROR_PRINT = makeSymbol("SDBC-ERROR-PRINT");

    private static final SubLSymbol SDBC_ERROR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SDBC-ERROR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list150 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SDBC-ERROR-P"));

    private static final SubLSymbol SDBC_ERROR_TYPE = makeSymbol("SDBC-ERROR-TYPE");

    private static final SubLSymbol _CSETF_SDBC_ERROR_TYPE = makeSymbol("_CSETF-SDBC-ERROR-TYPE");

    private static final SubLSymbol SDBC_ERROR_MESSAGE = makeSymbol("SDBC-ERROR-MESSAGE");

    private static final SubLSymbol _CSETF_SDBC_ERROR_MESSAGE = makeSymbol("_CSETF-SDBC-ERROR-MESSAGE");

    private static final SubLSymbol SDBC_ERROR_CODE = makeSymbol("SDBC-ERROR-CODE");

    private static final SubLSymbol _CSETF_SDBC_ERROR_CODE = makeSymbol("_CSETF-SDBC-ERROR-CODE");







    private static final SubLSymbol MAKE_SDBC_ERROR = makeSymbol("MAKE-SDBC-ERROR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SDBC_ERROR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SDBC-ERROR-METHOD");

    private static final SubLString $str162$_a = makeString("~a");

    private static final SubLString $str163$SDBC__a___a = makeString("SDBC ~a: ~a");

    private static final SubLString $str164$__SDBC = makeString("#<SDBC");

    private static final SubLString $str165$_ERROR__ = makeString("-ERROR: ");

    private static final SubLString $str166$_ = makeString(">");

    private static final SubLString $str167$_IO = makeString("-IO");

    private static final SubLString $str168$_SQL = makeString("-SQL");

    private static final SubLString $str169$ = makeString("");

    private static final SubLString $str170$_CLIENT = makeString("-CLIENT");

    private static final SubLString $str171$_TRANSACTION = makeString("-TRANSACTION");

    private static final SubLString $str172$_ROLLBACK = makeString("-ROLLBACK");

    private static final SubLString $str173$_BATCH_UPDATE = makeString("-BATCH-UPDATE");

    private static final SubLSymbol SQL_RESULT_SET = makeSymbol("SQL-RESULT-SET");

    private static final SubLSymbol SQL_RESULT_SET_P = makeSymbol("SQL-RESULT-SET-P");

    private static final SubLList $list176 = list(makeSymbol("ROWS"), makeSymbol("CURRENT"), makeSymbol("LAST"), makeSymbol("START"), makeSymbol("CONNECTION"), makeSymbol("BLOCK-SIZE"), makeSymbol("ID"));

    private static final SubLList $list177 = list(makeKeyword("ROWS"), makeKeyword("CURRENT"), makeKeyword("LAST"), makeKeyword("START"), makeKeyword("CONNECTION"), makeKeyword("BLOCK-SIZE"), makeKeyword("ID"));

    private static final SubLList $list178 = list(makeSymbol("SQLRS-ROWS"), makeSymbol("SQLRS-CURRENT"), makeSymbol("SQLRS-LAST"), makeSymbol("SQLRS-START"), makeSymbol("SQLRS-CONNECTION"), makeSymbol("SQLRS-BLOCK-SIZE"), makeSymbol("SQLRS-ID"));

    private static final SubLList $list179 = list(makeSymbol("_CSETF-SQLRS-ROWS"), makeSymbol("_CSETF-SQLRS-CURRENT"), makeSymbol("_CSETF-SQLRS-LAST"), makeSymbol("_CSETF-SQLRS-START"), makeSymbol("_CSETF-SQLRS-CONNECTION"), makeSymbol("_CSETF-SQLRS-BLOCK-SIZE"), makeSymbol("_CSETF-SQLRS-ID"));

    private static final SubLSymbol SQLRS_PRINT = makeSymbol("SQLRS-PRINT");

    private static final SubLSymbol SQL_RESULT_SET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-RESULT-SET-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list182 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-RESULT-SET-P"));

    private static final SubLSymbol SQLRS_ROWS = makeSymbol("SQLRS-ROWS");

    private static final SubLSymbol _CSETF_SQLRS_ROWS = makeSymbol("_CSETF-SQLRS-ROWS");

    private static final SubLSymbol SQLRS_CURRENT = makeSymbol("SQLRS-CURRENT");

    private static final SubLSymbol _CSETF_SQLRS_CURRENT = makeSymbol("_CSETF-SQLRS-CURRENT");

    private static final SubLSymbol SQLRS_LAST = makeSymbol("SQLRS-LAST");

    private static final SubLSymbol _CSETF_SQLRS_LAST = makeSymbol("_CSETF-SQLRS-LAST");

    private static final SubLSymbol SQLRS_START = makeSymbol("SQLRS-START");

    private static final SubLSymbol _CSETF_SQLRS_START = makeSymbol("_CSETF-SQLRS-START");

    private static final SubLSymbol SQLRS_CONNECTION = makeSymbol("SQLRS-CONNECTION");

    private static final SubLSymbol _CSETF_SQLRS_CONNECTION = makeSymbol("_CSETF-SQLRS-CONNECTION");

    private static final SubLSymbol SQLRS_BLOCK_SIZE = makeSymbol("SQLRS-BLOCK-SIZE");

    private static final SubLSymbol _CSETF_SQLRS_BLOCK_SIZE = makeSymbol("_CSETF-SQLRS-BLOCK-SIZE");

    private static final SubLSymbol SQLRS_ID = makeSymbol("SQLRS-ID");

    private static final SubLSymbol _CSETF_SQLRS_ID = makeSymbol("_CSETF-SQLRS-ID");















    private static final SubLSymbol MAKE_SQL_RESULT_SET = makeSymbol("MAKE-SQL-RESULT-SET");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_RESULT_SET_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-RESULT-SET-METHOD");

    private static final SubLString $str206$_ = makeString("(");

    private static final SubLString $str207$_row__ = makeString(" row, ");

    private static final SubLString $str208$_rows__ = makeString(" rows, ");

    private static final SubLString $str209$_column_ = makeString(" column)");

    private static final SubLString $str210$_columns_ = makeString(" columns)");

    private static final SubLString $$$closed = makeString("closed");

    private static final SubLSymbol SQL_OPEN_RESULT_SET_P = makeSymbol("SQL-OPEN-RESULT-SET-P");

    private static final SubLString $$$cursor_not_on_valid_row = makeString("cursor not on valid row");

    private static final SubLString $str214$invalid_column__a = makeString("invalid column ~a");





    private static final SubLString $str217$invalid_row__a = makeString("invalid row ~a");

    private static final SubLSymbol SQL_STATEMENT = makeSymbol("SQL-STATEMENT");

    private static final SubLSymbol SQL_STATEMENT_P = makeSymbol("SQL-STATEMENT-P");

    private static final SubLList $list220 = list(makeSymbol("CONNECTION"), makeSymbol("ID"), makeSymbol("SQL"), makeSymbol("SETTINGS"), makeSymbol("BATCH"), makeSymbol("RS"));

    private static final SubLList $list221 = list(makeKeyword("CONNECTION"), makeKeyword("ID"), makeKeyword("SQL"), makeKeyword("SETTINGS"), makeKeyword("BATCH"), makeKeyword("RS"));

    private static final SubLList $list222 = list(makeSymbol("SQLS-CONNECTION"), makeSymbol("SQLS-ID"), makeSymbol("SQLS-SQL"), makeSymbol("SQLS-SETTINGS"), makeSymbol("SQLS-BATCH"), makeSymbol("SQLS-RS"));

    private static final SubLList $list223 = list(makeSymbol("_CSETF-SQLS-CONNECTION"), makeSymbol("_CSETF-SQLS-ID"), makeSymbol("_CSETF-SQLS-SQL"), makeSymbol("_CSETF-SQLS-SETTINGS"), makeSymbol("_CSETF-SQLS-BATCH"), makeSymbol("_CSETF-SQLS-RS"));

    private static final SubLSymbol SQL_STATEMENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SQL-STATEMENT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list225 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SQL-STATEMENT-P"));

    private static final SubLSymbol SQLS_CONNECTION = makeSymbol("SQLS-CONNECTION");

    private static final SubLSymbol _CSETF_SQLS_CONNECTION = makeSymbol("_CSETF-SQLS-CONNECTION");

    private static final SubLSymbol SQLS_ID = makeSymbol("SQLS-ID");

    private static final SubLSymbol _CSETF_SQLS_ID = makeSymbol("_CSETF-SQLS-ID");

    private static final SubLSymbol SQLS_SQL = makeSymbol("SQLS-SQL");

    private static final SubLSymbol _CSETF_SQLS_SQL = makeSymbol("_CSETF-SQLS-SQL");

    private static final SubLSymbol SQLS_SETTINGS = makeSymbol("SQLS-SETTINGS");

    private static final SubLSymbol _CSETF_SQLS_SETTINGS = makeSymbol("_CSETF-SQLS-SETTINGS");

    private static final SubLSymbol SQLS_BATCH = makeSymbol("SQLS-BATCH");

    private static final SubLSymbol _CSETF_SQLS_BATCH = makeSymbol("_CSETF-SQLS-BATCH");

    private static final SubLSymbol SQLS_RS = makeSymbol("SQLS-RS");

    private static final SubLSymbol _CSETF_SQLS_RS = makeSymbol("_CSETF-SQLS-RS");









    private static final SubLSymbol MAKE_SQL_STATEMENT = makeSymbol("MAKE-SQL-STATEMENT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SQL_STATEMENT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SQL-STATEMENT-METHOD");

    private static final SubLSymbol SQL_OPEN_STATEMENT_P = makeSymbol("SQL-OPEN-STATEMENT-P");

    private static final SubLSymbol SQL_PREPARED_OPEN_STATEMENT_P = makeSymbol("SQL-PREPARED-OPEN-STATEMENT-P");

    private static final SubLSymbol BYTE_VECTOR_P = makeSymbol("BYTE-VECTOR-P");

    private static final SubLSymbol JAVA_INTEGERP = makeSymbol("JAVA-INTEGERP");

    private static final SubLSymbol JAVA_LONGP = makeSymbol("JAVA-LONGP");

    private static final SubLSymbol JAVA_FLOATP = makeSymbol("JAVA-FLOATP");

    private static final SubLSymbol JAVA_DOUBLEP = makeSymbol("JAVA-DOUBLEP");

    private static final SubLSymbol SQLS_GET_CONNECTION = makeSymbol("SQLS-GET-CONNECTION");

    private static final SubLString $$$STMT = makeString("STMT");

    private static final SubLString $$$RS = makeString("RS");



    private static final SubLSymbol SQLC_GET_TABLES = makeSymbol("SQLC-GET-TABLES");

    private static final SubLString $str256$SQLC_error___A = makeString("SQLC error: ~A");

    private static final SubLList $list257 = list(new SubLObject[]{ makeKeyword("TABLE-CAT"), makeKeyword("TABLE-SCHEM"), makeKeyword("TABLE-NAME"), makeKeyword("TABLE-TYPE"), makeKeyword("REMARKS"), makeKeyword("TYPE-CAT"), makeKeyword("TYPE-SCHEM"), makeKeyword("TYPE-NAME"), makeKeyword("SELF-REFERENCING-COL-NAME"), makeKeyword("REF-GENERATION") });

    private static final SubLSymbol SQLC_GET_COLUMNS = makeSymbol("SQLC-GET-COLUMNS");

    private static final SubLList $list259 = list(new SubLObject[]{ makeKeyword("TABLE-CAT"), makeKeyword("TABLE-SCHEM"), makeKeyword("TABLE-NAME"), makeKeyword("COLUMN-NAME"), makeKeyword("DATA-TYPE"), makeKeyword("TYPE-NAME"), makeKeyword("COLUMN-SIZE"), makeKeyword("BUFFER-LENGTH"), makeKeyword("DECIMAL-DIGITS"), makeKeyword("NUM-PREC-RADIX"), makeKeyword("NULLABLE"), makeKeyword("REMARKS"), makeKeyword("COLUMN-DEF"), makeKeyword("SQL-DATA-TYPE"), makeKeyword("SQL-DATETIME-SUB"), makeKeyword("CHAR-OCTET-LENGTH"), makeKeyword("ORDINAL-POSITION"), makeKeyword("IS-NULLABLE"), makeKeyword("SCOPE-CATLOG"), makeKeyword("SCOPE-SCHEMA"), makeKeyword("SCOPE-TABLE"), makeKeyword("SOURCE-DATA-TYPE") });

    private static final SubLSymbol SQLC_GET_PRIMARY_KEYS = makeSymbol("SQLC-GET-PRIMARY-KEYS");

    private static final SubLList $list261 = list(makeKeyword("TABLE-CAT"), makeKeyword("TABLE-SCHEM"), makeKeyword("TABLE-NAME"), makeKeyword("COLUMN-NAME"), makeKeyword("KEY-SEQ"), makeKeyword("PK-NAME"));

    private static final SubLSymbol SQLC_GET_IMPORTED_KEYS = makeSymbol("SQLC-GET-IMPORTED-KEYS");

    private static final SubLList $list263 = list(new SubLObject[]{ makeKeyword("PKTABLE-CAT"), makeKeyword("PKTABLE-SCHEM"), makeKeyword("PKTABLE-NAME"), makeKeyword("PKCOLUMN-NAME"), makeKeyword("FKTABLE-CAT"), makeKeyword("FKTABLE-SCHEM"), makeKeyword("FKTABLE-NAME"), makeKeyword("FKCOLUMN-NAME"), makeKeyword("KEY-SEQ"), makeKeyword("UPDATE-RULE"), makeKeyword("DELETE-RULE"), makeKeyword("FK-NAME"), makeKeyword("PK-NAME"), makeKeyword("DEFERRABILITY") });

    private static final SubLSymbol SQLC_GET_EXPORTED_KEYS = makeSymbol("SQLC-GET-EXPORTED-KEYS");

    private static final SubLSymbol SQLC_GET_INDEX_INFO = makeSymbol("SQLC-GET-INDEX-INFO");

    public static final SubLList $list266 = list(new SubLObject[]{ makeKeyword("TABLE-CAT"), makeKeyword("TABLE-SCHEM"), makeKeyword("TABLE-NAME"), makeKeyword("NON-UNIQUE"), makeKeyword("INDEX-QUALIFIER"), makeKeyword("INDEX-NAME"), makeKeyword("TYPE"), makeKeyword("ORDINAL-POSITION"), makeKeyword("COLUMN-NAME"), makeKeyword("ASC-OR-DESC"), makeKeyword("CARDINALITY"), makeKeyword("PAGES"), makeKeyword("FILTER-CONDITION") });

    public static final SubLList $list267 = list(makeKeyword("RETURN"), makeKeyword("THROW"), makeKeyword("WARN"));

    private static final SubLString $str268$com_cyc_ = makeString("com.cyc.");

    private static final SubLString $str269$_a__a__a = makeString("~a:~a:~a");







    private static final SubLSymbol NEW_DB_URL = makeSymbol("NEW-DB-URL");



    private static final SubLSymbol $sym275$STRING_ = makeSymbol("STRING=");











    private static final SubLList $list281 = list(new SubLObject[]{ list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), makeString("theuser"), makeString("thepassword"), makeString("postgresql")), makeString("jdbc:postgresql://dbms-server.cyc.com:5432/testdatabase?user=theuser&password=thepassword&charSet=ASCII")), list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), makeString("theuser"), makeString("thepassword"), makeString("mysql")), makeString("jdbc:mysql://dbms-server.cyc.com:3306/testdatabase?user=theuser&password=thepassword")), list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), makeString("theuser"), makeString("thepassword"), makeString("oracle")), makeString("jdbc:oracle:thin:theuser/thepassword@//dbms-server.cyc.com:1521/testdatabase")), list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), makeString("theuser"), makeString("thepassword"), makeString("microsoft-sqlserver")), makeString("jdbc:microsoft:sqlserver://dbms-server.cyc.com:1433;DatabaseName=testdatabase;SelectMethod=cursor;USER=theuser;PASSWORD=thepassword")), list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), makeString("theuser"), makeString("thepassword"), makeString("sqlserver")), makeString("jdbc:sqlserver://dbms-server.cyc.com:1433;DatabaseName=testdatabase;SelectMethod=cursor;USER=theuser;PASSWORD=thepassword")), list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), makeString("theuser"), makeString("thepassword"), makeString("odbc")), makeString("jdbc:odbc:testdatabase;UID=theuser;PWD=thepassword")), list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), makeString("theuser"), makeString("thepassword"), makeString("sybase")), makeString("jdbc:jtds:sybase://dbms-server.cyc.com:2048/testdatabase;USER=theuser;PASSWORD=thepassword")), list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), makeString("theuser"), makeString("thepassword"), makeString("db2")), makeString("jdbc:db2://dbms-server.cyc.com:50001/TESTDATABASE:user=theuser;password=thepassword;")), list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), NIL, NIL, makeString("derby")), makeString("jdbc:derby://dbms-server.cyc.com:1527/testdatabase")), list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), NIL, NIL, makeString("com.cyc.project.mysentient.query.webScraper.Ents24SKSI")), makeString("jdbc:com.cyc.project.mysentient.query.webScraper.Ents24SKSI:testdatabase")), list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), makeString("theuser"), makeString("thepassword"), makeString("derby")), makeString("jdbc:derby://dbms-server.cyc.com:1527/testdatabase;user=theuser;password=thepassword")), list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), makeString("theuser"), makeString("thepassword"), makeString("derby"), makeInteger(15270)), makeString("jdbc:derby://dbms-server.cyc.com:15270/testdatabase;user=theuser;password=thepassword")), list(list(makeString("dbms-server.cyc.com"), makeString("testdatabase"), makeString("theuser"), makeString("thepassword"), makeString("db2"), makeInteger(6501)), makeString("jdbc:db2://dbms-server.cyc.com:6501/TESTDATABASE:user=theuser;password=thepassword;")), list(list(makeString("dbms-server.cyc.com"), makeString("iq-demo"), makeString("theuser"), makeString("thepassword"), makeString("sybase-iq")), makeString("jdbc:sybase:Tds:dbms-server.cyc.com:2638?ServiceName=iq-demo&USER=theuser&PASSWORD=thepassword")) });

    public static final SubLSymbol $sdbc_database_connection_url_descriptions$ = makeSymbol("*SDBC-DATABASE-CONNECTION-URL-DESCRIPTIONS*");













    private static final SubLSymbol GET_ALL_SDBC_DATABASE_SUB_PROTOCOLS = makeSymbol("GET-ALL-SDBC-DATABASE-SUB-PROTOCOLS");







    private static final SubLString $str293$Separator_must_be_defined_as_stri = makeString("Separator must be defined as string, not ~A.");



    private static final SubLString $str295$Value_demarcator_must_be_specifie = makeString("Value demarcator must be specified as string, not ~A.");

    private static final SubLList $list296 = list(makeSymbol("&KEY"), makeSymbol("SUB-PROTOCOL"), makeSymbol("PATTERN"), list(makeSymbol("OPTION-NAMES")), list(makeSymbol("OPTION-PUNCTUATION")), makeSymbol("DEFAULTS"));

    private static final SubLList $list297 = list(makeKeyword("SUB-PROTOCOL"), makeKeyword("PATTERN"), makeKeyword("OPTION-NAMES"), makeKeyword("OPTION-PUNCTUATION"), makeKeyword("DEFAULTS"));

    private static final SubLSymbol ADD_SDBC_DATABASE_CONNECTION_URL_DESCRIPTION = makeSymbol("ADD-SDBC-DATABASE-CONNECTION-URL-DESCRIPTION");

    private static final SubLList $list299 = list(new SubLObject[]{ makeKeyword("PROTOCOL"), makeString(":"), makeKeyword("SUB-PROTOCOL"), makeString("://"), makeKeyword("DBMS-SERVER"), makeString(":"), makeKeyword("PORT"), makeString("/"), makeKeyword("DATABASE") });

    public static final SubLList $list300 = list(makeKeyword("USER"), makeString("user"), makeKeyword("PASSWORD"), makeString("password"), makeKeyword("CHAR-SET"), makeString("charSet"));

    private static final SubLList $list301 = list(makeKeyword("START"), makeString("?"), makeKeyword("SEPARATOR"), makeString("&"), makeKeyword("VALUE"), makeString("="));

    private static final SubLList $list302 = list(makeKeyword("PORT"), makeInteger(5432), makeKeyword("CHAR-SET"), makeString("ASCII"));

    private static final SubLString $$$mysql = makeString("mysql");

    private static final SubLList $list304 = list(makeKeyword("USER"), makeString("user"), makeKeyword("PASSWORD"), makeString("password"));

    private static final SubLList $list305 = list(makeKeyword("PORT"), makeInteger(3306));

    private static final SubLString $$$oracle = makeString("oracle");

    private static final SubLList $list307 = list(new SubLObject[]{ makeKeyword("PROTOCOL"), makeString(":"), makeKeyword("SUB-PROTOCOL"), makeString(":thin:"), makeKeyword("USER"), makeString("/"), makeKeyword("PASSWORD"), makeString("@//"), makeKeyword("DBMS-SERVER"), makeString(":"), makeKeyword("PORT"), makeString("/"), makeKeyword("DATABASE") });

    public static final SubLList $list308 = list(makeKeyword("PORT"), makeInteger(1521));

    private static final SubLString $$$sqlserver = makeString("sqlserver");

    private static final SubLList $list310 = list(makeKeyword("PROTOCOL"), makeString(":"), makeKeyword("SUB-PROTOCOL"), makeString("://"), makeKeyword("DBMS-SERVER"), makeString(":"), makeKeyword("PORT"));

    private static final SubLList $list311 = list(makeKeyword("DATABASE"), makeString("DatabaseName"), makeKeyword("SELECT-METHOD"), makeString("SelectMethod"), makeKeyword("USER"), makeString("USER"), makeKeyword("PASSWORD"), makeString("PASSWORD"));

    private static final SubLList $list312 = list(makeKeyword("START"), makeKeyword("SEPARATOR"), makeKeyword("SEPARATOR"), makeString(";"), makeKeyword("VALUE"), makeString("="));

    private static final SubLList $list313 = list(makeKeyword("PORT"), makeInteger(1433), makeKeyword("SELECT-METHOD"), makeString("cursor"));

    private static final SubLString $str314$microsoft_sqlserver = makeString("microsoft-sqlserver");

    private static final SubLList $list315 = list(makeKeyword("PROTOCOL"), makeString(":microsoft:"), makeString("sqlserver"), makeString("://"), makeKeyword("DBMS-SERVER"), makeString(":"), makeKeyword("PORT"));

    private static final SubLString $$$odbc = makeString("odbc");

    public static final SubLList $list317 = list(makeKeyword("PROTOCOL"), makeString(":"), makeKeyword("SUB-PROTOCOL"), makeString(":"), makeKeyword("DATABASE"));

    private static final SubLList $list318 = list(makeKeyword("USER"), makeString("UID"), makeKeyword("PASSWORD"), makeString("PWD"));

    private static final SubLString $$$sybase = makeString("sybase");

    private static final SubLList $list320 = list(new SubLObject[]{ makeKeyword("PROTOCOL"), makeString(":jtds:"), makeKeyword("SUB-PROTOCOL"), makeString("://"), makeKeyword("DBMS-SERVER"), makeString(":"), makeKeyword("PORT"), makeString("/"), makeKeyword("DATABASE") });

    private static final SubLList $list321 = list(makeKeyword("USER"), makeString("USER"), makeKeyword("PASSWORD"), makeString("PASSWORD"));

    private static final SubLList $list322 = list(makeKeyword("PORT"), makeInteger(2048));

    private static final SubLString $$$derby = makeString("derby");

    private static final SubLList $list324 = list(makeKeyword("PORT"), makeInteger(1527));

    private static final SubLString $$$st = makeString("st");

    private static final SubLList $list326 = list(makeKeyword("USER"), makeString("userName"), makeKeyword("PASSWORD"), makeString("passWord"), makeKeyword("FORMAT"), makeString("format"));

    private static final SubLList $list327 = list(makeKeyword("PORT"), makeInteger(8084), makeKeyword("FORMAT"), makeString("xhtml"));

    private static final SubLString $$$poiseschema = makeString("poiseschema");

    private static final SubLList $list329 = list(makeKeyword("PROTOCOL"), makeString(":"), makeKeyword("SUB-PROTOCOL"), makeString(":"));

    private static final SubLString $$$poisedata = makeString("poisedata");

    private static final SubLSymbol $sym331$_SDBC_DB2_PORT_ = makeSymbol("*SDBC-DB2-PORT*");

    private static final SubLInteger $int$50001 = makeInteger(50001);

    private static final SubLSymbol SET_SDBC_DB2_PORT = makeSymbol("SET-SDBC-DB2-PORT");

    private static final SubLString $$$db2 = makeString("db2");

    private static final SubLList $list335 = list(new SubLObject[]{ makeKeyword("PROTOCOL"), makeString(":"), makeKeyword("SUB-PROTOCOL"), makeString("://"), makeKeyword("DBMS-SERVER"), makeString(":"), makeKeyword("PORT"), makeString("/"), list(makeKeyword("UPCASE"), makeKeyword("DATABASE")) });

    private static final SubLList $list336 = list(makeKeyword("START"), makeString(":"), makeKeyword("SEPARATOR"), makeString(";"), makeKeyword("VALUE"), makeString("="), makeKeyword("TERMINATOR"), makeString(";"));

    private static final SubLList $list337 = list(makeKeyword("PORT"), makeSymbol("*SDBC-DB2-PORT*"));

    public static final SubLSymbol $sdbc_sybase_iq_port$ = makeSymbol("*SDBC-SYBASE-IQ-PORT*");

    private static final SubLInteger $int$2638 = makeInteger(2638);

    private static final SubLSymbol SET_SDBC_SYBASE_IQ_PORT = makeSymbol("SET-SDBC-SYBASE-IQ-PORT");

    private static final SubLString $str341$sybase_iq = makeString("sybase-iq");

    private static final SubLList $list342 = list(makeKeyword("PROTOCOL"), makeString(":sybase:Tds:"), makeKeyword("DBMS-SERVER"), makeString(":"), makeKeyword("PORT"), makeString("?ServiceName="), makeKeyword("DATABASE"));

    private static final SubLList $list343 = list(makeKeyword("START"), makeKeyword("SEPARATOR"), makeKeyword("SEPARATOR"), makeString("&"), makeKeyword("VALUE"), makeString("="));

    private static final SubLList $list344 = list(makeKeyword("PORT"), makeSymbol("*SDBC-SYBASE-IQ-PORT*"));

    private static final SubLString $str345$unknown_jdbc_subprotocol___a = makeString("unknown jdbc subprotocol: ~a");





    private static final SubLList $list348 = list(makeSymbol("FUNCTOR"), makeSymbol("ITEM"));



    private static final SubLString $str350$Functor__A_not_implemented_yet_ = makeString("Functor ~A not implemented yet.");

    private static final SubLString $str351$Pattern__S_contains__S__which_is_ = makeString("Pattern ~S contains ~S, which is neither STRINGP nor KEYWORDP");

    private static final SubLString $str352$Element__A_is_neither_a_STRINGP_n = makeString("Element ~A is neither a STRINGP nor a KEYWORD.");

    private static final SubLString $str353$No_value_provided_for__S_in_eithe = makeString("No value provided for ~S in either properties ~S or defaults ~S.");

    private static final SubLInteger $int$_2147483649 = makeInteger("-2147483649");

    private static final SubLInteger $int$2147483648 = makeInteger("2147483648");

    private static final SubLInteger $int$_9223372036854775809 = makeInteger("-9223372036854775809");

    private static final SubLInteger $int$9223372036854775808 = makeInteger("9223372036854775808");

    private static final SubLList $list358 = list(list(new SubLObject[]{ makeSymbol("CONNECTION"), makeSymbol("DB"), makeSymbol("USER"), makeSymbol("PASSWORD"), makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), list(makeSymbol("QUOTE"), makeSymbol("*DBMS-SERVER*"))), list(makeSymbol("PORT"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-PORT*"))), list(makeSymbol("SUBPROTOCOL"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-SUBPROTOCOL*"))), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")), list(makeSymbol("TIMEOUT"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-CONNECTION-TIMEOUT*"))) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list359 = list(makeKeyword("DBMS-SERVER"), makeKeyword("PORT"), makeKeyword("SUBPROTOCOL"), makeKeyword("PROXY-SERVER"), makeKeyword("TIMEOUT"));

    public static final SubLSymbol $sql_subprotocol$ = makeSymbol("*SQL-SUBPROTOCOL*");

    public static final SubLSymbol $sql_connection_timeout$ = makeSymbol("*SQL-CONNECTION-TIMEOUT*");









    private static final SubLSymbol NEW_SQL_CONNECTION = makeSymbol("NEW-SQL-CONNECTION");





    private static final SubLSymbol SQLC_CLOSE = makeSymbol("SQLC-CLOSE");

    private static final SubLList $list370 = list(list(new SubLObject[]{ makeSymbol("STATEMENT"), makeSymbol("DB"), makeSymbol("USER"), makeSymbol("PASSWORD"), makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), list(makeSymbol("QUOTE"), makeSymbol("*DBMS-SERVER*"))), list(makeSymbol("PORT"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-PORT*"))), list(makeSymbol("SUBPROTOCOL"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-SUBPROTOCOL*"))), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")), list(makeSymbol("TIMEOUT"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-CONNECTION-TIMEOUT*"))) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym371$CONNECTION = makeUninternedSymbol("CONNECTION");

    private static final SubLSymbol WITH_SQL_CONNECTION = makeSymbol("WITH-SQL-CONNECTION");



    private static final SubLSymbol SQLC_CREATE_STATEMENT = makeSymbol("SQLC-CREATE-STATEMENT");

    private static final SubLList $list375 = list(list(new SubLObject[]{ makeSymbol("STATEMENT"), makeSymbol("SQL"), makeSymbol("DB"), makeSymbol("USER"), makeSymbol("PASSWORD"), makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), list(makeSymbol("QUOTE"), makeSymbol("*DBMS-SERVER*"))), list(makeSymbol("PORT"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-PORT*"))), list(makeSymbol("SUBPROTOCOL"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-SUBPROTOCOL*"))), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")), list(makeSymbol("TIMEOUT"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-CONNECTION-TIMEOUT*"))) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym376$CONNECTION = makeUninternedSymbol("CONNECTION");

    private static final SubLSymbol SQLC_PREPARE_STATEMENT = makeSymbol("SQLC-PREPARE-STATEMENT");

    private static final SubLList $list378 = list(list(makeSymbol("STATEMENT"), makeSymbol("ERROR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym379$CONNECTION = makeUninternedSymbol("CONNECTION");

    private static final SubLSymbol $sym380$AUTO_COMMIT = makeUninternedSymbol("AUTO-COMMIT");

    private static final SubLSymbol $sym381$COMMIT_ERROR = makeUninternedSymbol("COMMIT-ERROR");

    private static final SubLSymbol $sym382$ROLLBACK_RESULT = makeUninternedSymbol("ROLLBACK-RESULT");

    private static final SubLSymbol $sym383$AUTO_COMMIT_RESULT = makeUninternedSymbol("AUTO-COMMIT-RESULT");

    private static final SubLSymbol $sym384$ERRORS = makeUninternedSymbol("ERRORS");

    private static final SubLSymbol SQLC_GET_AUTO_COMMIT = makeSymbol("SQLC-GET-AUTO-COMMIT");



    private static final SubLList $list387 = list(makeKeyword("THROW"));



    private static final SubLSymbol SQLC_SET_AUTO_COMMIT = makeSymbol("SQLC-SET-AUTO-COMMIT");

    private static final SubLList $list390 = list(NIL);

    private static final SubLSymbol SQLC_COMMIT = makeSymbol("SQLC-COMMIT");

    private static final SubLList $list392 = list(makeKeyword("RETURN"));

    private static final SubLSymbol SQLS_HANDLE_COMMIT_ERROR = makeSymbol("SQLS-HANDLE-COMMIT-ERROR");

    private static final SubLSymbol SQLS_HANDLE_ROLLBACK = makeSymbol("SQLS-HANDLE-ROLLBACK");

    private static final SubLList $list395 = list(T);

    private static final SubLSymbol SQLS_HANDLE_TRANSACTION_ERRORS = makeSymbol("SQLS-HANDLE-TRANSACTION-ERRORS");

    private static final SubLString $str397$An_unknown_error_occurred_during_ = makeString("An unknown error occurred during execution");

    private static final SubLList $list398 = list(list(new SubLObject[]{ makeSymbol("STATEMENT"), makeSymbol("ERROR"), makeSymbol("DB"), makeSymbol("USER"), makeSymbol("PASSWORD"), makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), list(makeSymbol("QUOTE"), makeSymbol("*DBMS-SERVER*"))), list(makeSymbol("PORT"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-PORT*"))), list(makeSymbol("SUBPROTOCOL"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-SUBPROTOCOL*"))), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")), list(makeSymbol("TIMEOUT"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-CONNECTION-TIMEOUT*"))) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_SQL_STATEMENT = makeSymbol("WITH-SQL-STATEMENT");

    private static final SubLList $list400 = list(list(new SubLObject[]{ makeSymbol("RS"), makeSymbol("QUERY"), makeSymbol("DB"), makeSymbol("USER"), makeSymbol("PASSWORD"), makeSymbol("&KEY"), list(makeSymbol("DBMS-SERVER"), list(makeSymbol("QUOTE"), makeSymbol("*DBMS-SERVER*"))), list(makeSymbol("PORT"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-PORT*"))), list(makeSymbol("SUBPROTOCOL"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-SUBPROTOCOL*"))), list(makeSymbol("PROXY-SERVER"), makeSymbol("DBMS-SERVER")), list(makeSymbol("TIMEOUT"), list(makeSymbol("QUOTE"), makeSymbol("*SQL-CONNECTION-TIMEOUT*"))) }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym401$STATEMENT = makeUninternedSymbol("STATEMENT");



    private static final SubLSymbol SQLS_EXECUTE_QUERY = makeSymbol("SQLS-EXECUTE-QUERY");

    private static final SubLSymbol WITH_SQL_RESULT_SET = makeSymbol("WITH-SQL-RESULT-SET");



    private static final SubLSymbol SQLRS_NEXT = makeSymbol("SQLRS-NEXT");



    private static final SubLString $str408$SELECT___FROM_ = makeString("SELECT * FROM ");

    private static final SubLList $list409 = list(CHAR_period);

    private static final SubLString $str410$INSERT_INTO__a_VALUES______ = makeString("INSERT INTO ~a VALUES(?, ?)");

    private static final SubLString $str411$SELECT_number2_FROM__a_WHERE_numb = makeString("SELECT number2 FROM ~a WHERE number1 = ?");

    private static final SubLString $$$CREATE_TABLE_ = makeString("CREATE TABLE ");

    private static final SubLString $str413$__number1_INT_PRIMARY_KEY__number = makeString(" (number1 INT PRIMARY KEY, number2 INT)");

    private static final SubLString $str414$validation_failed_for__a__result_ = makeString("validation failed for ~a: result ~a");

    private static final SubLString $$$DROP_TABLE_ = makeString("DROP TABLE ");

    private static final SubLString $$$INSERT_INTO_ = makeString("INSERT INTO ");

    private static final SubLString $str417$_VALUES_ = makeString(" VALUES(");

    private static final SubLString $str418$__ = makeString(", ");

    private static final SubLString $str419$_ = makeString(")");

    private static final SubLString $$$SELECT_number2_FROM_ = makeString("SELECT number2 FROM ");

    private static final SubLString $str421$_WHERE_number1___ = makeString(" WHERE number1 = ");

    
}

