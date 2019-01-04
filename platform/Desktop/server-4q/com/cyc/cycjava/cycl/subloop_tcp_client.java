package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subloop_tcp_client extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.subloop_tcp_client";
    public static final String myFingerPrint = "f117bcbf7e004a3e4fe3079f7e1194ae7eb63bbea2922efc1e96f9cfe9493042";
    private static final SubLSymbol $sym0$TCP_CLIENT;
    private static final SubLSymbol $sym1$OBJECT;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$PORT;
    private static final SubLSymbol $sym4$HOST;
    private static final SubLSymbol $sym5$INSTANCE_COUNT;
    private static final SubLSymbol $sym6$SUBLOOP_RESERVED_INITIALIZE_TCP_CLIENT_CLASS;
    private static final SubLSymbol $sym7$ISOLATED_P;
    private static final SubLSymbol $sym8$INSTANCE_NUMBER;
    private static final SubLSymbol $sym9$SUBLOOP_RESERVED_INITIALIZE_TCP_CLIENT_INSTANCE;
    private static final SubLSymbol $sym10$INITIALIZE;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$TCP_CLIENT_INITIALIZE_METHOD;
    private static final SubLSymbol $sym14$SET_HOST;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$OUTER_CATCH_FOR_TCP_CLIENT_METHOD;
    private static final SubLSymbol $sym19$STRINGP;
    private static final SubLSymbol $sym20$TCP_CLIENT_SET_HOST_METHOD;
    private static final SubLSymbol $sym21$SET_PORT;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$OUTER_CATCH_FOR_TCP_CLIENT_METHOD;
    private static final SubLSymbol $sym25$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $sym26$TCP_CLIENT_SET_PORT_METHOD;
    private static final SubLSymbol $sym27$PRINT;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$OUTER_CATCH_FOR_TCP_CLIENT_METHOD;
    private static final SubLString $str31$__TCP_CLIENT__;
    private static final SubLString $str32$Server__;
    private static final SubLString $str33$_Port__;
    private static final SubLString $str34$_;
    private static final SubLSymbol $sym35$TCP_CLIENT_PRINT_METHOD;
    private static final SubLSymbol $sym36$PERFORM_REQUEST;
    private static final SubLList $list37;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$OUTER_CATCH_FOR_TCP_CLIENT_METHOD;
    private static final SubLSymbol $kw40$PRIVATE;
    private static final SubLSymbol $sym41$TCP_CLIENT_PERFORM_REQUEST_METHOD;
    private static final SubLSymbol $sym42$REQUEST_TOKENIZED_XML;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$OUTER_CATCH_FOR_TCP_CLIENT_METHOD;
    private static final SubLSymbol $sym45$TCP_CLIENT_REQUEST_TOKENIZED_XML_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 925L)
    public static SubLObject get_tcp_client_port(final SubLObject tcp_client) {
        return classes.subloop_get_access_protected_instance_slot(tcp_client, (SubLObject)subloop_tcp_client.TWO_INTEGER, (SubLObject)subloop_tcp_client.$sym3$PORT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 925L)
    public static SubLObject set_tcp_client_port(final SubLObject tcp_client, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(tcp_client, value, (SubLObject)subloop_tcp_client.TWO_INTEGER, (SubLObject)subloop_tcp_client.$sym3$PORT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 925L)
    public static SubLObject get_tcp_client_host(final SubLObject tcp_client) {
        return classes.subloop_get_access_protected_instance_slot(tcp_client, (SubLObject)subloop_tcp_client.ONE_INTEGER, (SubLObject)subloop_tcp_client.$sym4$HOST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 925L)
    public static SubLObject set_tcp_client_host(final SubLObject tcp_client, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(tcp_client, value, (SubLObject)subloop_tcp_client.ONE_INTEGER, (SubLObject)subloop_tcp_client.$sym4$HOST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 925L)
    public static SubLObject subloop_reserved_initialize_tcp_client_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_tcp_client.$sym1$OBJECT, (SubLObject)subloop_tcp_client.$sym5$INSTANCE_COUNT, (SubLObject)subloop_tcp_client.ZERO_INTEGER);
        return (SubLObject)subloop_tcp_client.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 925L)
    public static SubLObject subloop_reserved_initialize_tcp_client_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_tcp_client.$sym1$OBJECT, (SubLObject)subloop_tcp_client.$sym7$ISOLATED_P, (SubLObject)subloop_tcp_client.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_tcp_client.$sym1$OBJECT, (SubLObject)subloop_tcp_client.$sym8$INSTANCE_NUMBER, (SubLObject)subloop_tcp_client.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_tcp_client.$sym0$TCP_CLIENT, (SubLObject)subloop_tcp_client.$sym4$HOST, (SubLObject)subloop_tcp_client.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_tcp_client.$sym0$TCP_CLIENT, (SubLObject)subloop_tcp_client.$sym3$PORT, (SubLObject)subloop_tcp_client.NIL);
        return (SubLObject)subloop_tcp_client.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 925L)
    public static SubLObject tcp_client_p(final SubLObject tcp_client) {
        return classes.subloop_instanceof_class(tcp_client, (SubLObject)subloop_tcp_client.$sym0$TCP_CLIENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 1621L)
    public static SubLObject tcp_client_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 1716L)
    public static SubLObject tcp_client_set_host_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_tcp_client_method = (SubLObject)subloop_tcp_client.NIL;
        SubLObject host = get_tcp_client_host(self);
        try {
            thread.throwStack.push(subloop_tcp_client.$sym18$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
            try {
                assert subloop_tcp_client.NIL != Types.stringp(string) : string;
                host = string;
                Dynamic.sublisp_throw((SubLObject)subloop_tcp_client.$sym18$OUTER_CATCH_FOR_TCP_CLIENT_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_tcp_client.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_tcp_client_host(self, host);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_tcp_client_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_tcp_client.$sym18$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_tcp_client_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 1941L)
    public static SubLObject tcp_client_set_port_method(final SubLObject self, final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_tcp_client_method = (SubLObject)subloop_tcp_client.NIL;
        SubLObject port = get_tcp_client_port(self);
        try {
            thread.throwStack.push(subloop_tcp_client.$sym24$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
            try {
                assert subloop_tcp_client.NIL != subl_promotions.non_negative_integer_p(number) : number;
                port = number;
                Dynamic.sublisp_throw((SubLObject)subloop_tcp_client.$sym24$OUTER_CATCH_FOR_TCP_CLIENT_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_tcp_client.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_tcp_client_port(self, port);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_tcp_client_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_tcp_client.$sym24$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_tcp_client_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 2158L)
    public static SubLObject tcp_client_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_tcp_client_method = (SubLObject)subloop_tcp_client.NIL;
        final SubLObject port = get_tcp_client_port(self);
        final SubLObject host = get_tcp_client_host(self);
        try {
            thread.throwStack.push(subloop_tcp_client.$sym30$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
            try {
                streams_high.write_string((SubLObject)subloop_tcp_client.$str31$__TCP_CLIENT__, stream, (SubLObject)subloop_tcp_client.UNPROVIDED, (SubLObject)subloop_tcp_client.UNPROVIDED);
                streams_high.write_string((SubLObject)subloop_tcp_client.$str32$Server__, stream, (SubLObject)subloop_tcp_client.UNPROVIDED, (SubLObject)subloop_tcp_client.UNPROVIDED);
                print_high.princ(host, stream);
                streams_high.write_string((SubLObject)subloop_tcp_client.$str33$_Port__, stream, (SubLObject)subloop_tcp_client.UNPROVIDED, (SubLObject)subloop_tcp_client.UNPROVIDED);
                print_high.princ(port, stream);
                streams_high.write_string((SubLObject)subloop_tcp_client.$str34$_, stream, (SubLObject)subloop_tcp_client.UNPROVIDED, (SubLObject)subloop_tcp_client.UNPROVIDED);
                streams_high.terpri(stream);
                Dynamic.sublisp_throw((SubLObject)subloop_tcp_client.$sym30$OUTER_CATCH_FOR_TCP_CLIENT_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_tcp_client.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_tcp_client_port(self, port);
                    set_tcp_client_host(self, host);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_tcp_client_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_tcp_client.$sym30$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_tcp_client_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 2519L)
    public static SubLObject tcp_client_perform_request_method(final SubLObject self, final SubLObject request_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_tcp_client_method = (SubLObject)subloop_tcp_client.NIL;
        final SubLObject port = get_tcp_client_port(self);
        final SubLObject host = get_tcp_client_host(self);
        try {
            thread.throwStack.push(subloop_tcp_client.$sym39$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
            try {
                SubLObject bi_stream = (SubLObject)subloop_tcp_client.NIL;
                try {
                    bi_stream = subl_promotions.open_tcp_stream_with_timeout(host, port, (SubLObject)subloop_tcp_client.NIL, (SubLObject)subloop_tcp_client.$kw40$PRIVATE);
                    if (subloop_tcp_client.NIL != subl_macro_promotions.validate_tcp_connection(bi_stream, host, port)) {
                        streams_high.write_line(request_string, bi_stream, (SubLObject)subloop_tcp_client.UNPROVIDED, (SubLObject)subloop_tcp_client.UNPROVIDED);
                        streams_high.force_output(bi_stream);
                        Dynamic.sublisp_throw((SubLObject)subloop_tcp_client.$sym39$OUTER_CATCH_FOR_TCP_CLIENT_METHOD, streams_high.read_line(bi_stream, (SubLObject)subloop_tcp_client.UNPROVIDED, (SubLObject)subloop_tcp_client.UNPROVIDED, (SubLObject)subloop_tcp_client.UNPROVIDED));
                    }
                }
                finally {
                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_tcp_client.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (subloop_tcp_client.NIL != bi_stream) {
                            streams_high.close(bi_stream, (SubLObject)subloop_tcp_client.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_tcp_client.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    set_tcp_client_port(self, port);
                    set_tcp_client_host(self, host);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_tcp_client_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_tcp_client.$sym39$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_tcp_client_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-tcp-client.lisp", position = 3063L)
    public static SubLObject tcp_client_request_tokenized_xml_method(final SubLObject self, final SubLObject request_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_tcp_client_method = (SubLObject)subloop_tcp_client.NIL;
        final SubLObject port = get_tcp_client_port(self);
        final SubLObject host = get_tcp_client_host(self);
        try {
            thread.throwStack.push(subloop_tcp_client.$sym44$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
            try {
                SubLObject bi_stream = (SubLObject)subloop_tcp_client.NIL;
                try {
                    bi_stream = subl_promotions.open_tcp_stream_with_timeout(host, port, (SubLObject)subloop_tcp_client.NIL, (SubLObject)subloop_tcp_client.$kw40$PRIVATE);
                    if (subloop_tcp_client.NIL != subl_macro_promotions.validate_tcp_connection(bi_stream, host, port)) {
                        streams_high.write_line(request_string, bi_stream, (SubLObject)subloop_tcp_client.UNPROVIDED, (SubLObject)subloop_tcp_client.UNPROVIDED);
                        streams_high.force_output(bi_stream);
                        Dynamic.sublisp_throw((SubLObject)subloop_tcp_client.$sym44$OUTER_CATCH_FOR_TCP_CLIENT_METHOD, xml_parsing_utilities.xml_tokenize(bi_stream, (SubLObject)subloop_tcp_client.UNPROVIDED, (SubLObject)subloop_tcp_client.UNPROVIDED, (SubLObject)subloop_tcp_client.UNPROVIDED));
                    }
                }
                finally {
                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_tcp_client.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (subloop_tcp_client.NIL != bi_stream) {
                            streams_high.close(bi_stream, (SubLObject)subloop_tcp_client.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_tcp_client.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    set_tcp_client_port(self, port);
                    set_tcp_client_host(self, host);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_tcp_client_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_tcp_client.$sym44$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_tcp_client_method;
    }
    
    public static SubLObject declare_subloop_tcp_client_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_tcp_client", "get_tcp_client_port", "GET-TCP-CLIENT-PORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_tcp_client", "set_tcp_client_port", "SET-TCP-CLIENT-PORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_tcp_client", "get_tcp_client_host", "GET-TCP-CLIENT-HOST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_tcp_client", "set_tcp_client_host", "SET-TCP-CLIENT-HOST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_tcp_client", "subloop_reserved_initialize_tcp_client_class", "SUBLOOP-RESERVED-INITIALIZE-TCP-CLIENT-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_tcp_client", "subloop_reserved_initialize_tcp_client_instance", "SUBLOOP-RESERVED-INITIALIZE-TCP-CLIENT-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_tcp_client", "tcp_client_p", "TCP-CLIENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_tcp_client", "tcp_client_initialize_method", "TCP-CLIENT-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_tcp_client", "tcp_client_set_host_method", "TCP-CLIENT-SET-HOST-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_tcp_client", "tcp_client_set_port_method", "TCP-CLIENT-SET-PORT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_tcp_client", "tcp_client_print_method", "TCP-CLIENT-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_tcp_client", "tcp_client_perform_request_method", "TCP-CLIENT-PERFORM-REQUEST-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_tcp_client", "tcp_client_request_tokenized_xml_method", "TCP-CLIENT-REQUEST-TOKENIZED-XML-METHOD", 2, 0, false);
        return (SubLObject)subloop_tcp_client.NIL;
    }
    
    public static SubLObject init_subloop_tcp_client_file() {
        return (SubLObject)subloop_tcp_client.NIL;
    }
    
    public static SubLObject setup_subloop_tcp_client_file() {
        classes.subloop_new_class((SubLObject)subloop_tcp_client.$sym0$TCP_CLIENT, (SubLObject)subloop_tcp_client.$sym1$OBJECT, (SubLObject)subloop_tcp_client.NIL, (SubLObject)subloop_tcp_client.NIL, (SubLObject)subloop_tcp_client.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_tcp_client.$sym0$TCP_CLIENT, (SubLObject)subloop_tcp_client.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_tcp_client.$sym0$TCP_CLIENT, (SubLObject)subloop_tcp_client.$sym6$SUBLOOP_RESERVED_INITIALIZE_TCP_CLIENT_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_tcp_client.$sym0$TCP_CLIENT, (SubLObject)subloop_tcp_client.$sym9$SUBLOOP_RESERVED_INITIALIZE_TCP_CLIENT_INSTANCE);
        subloop_reserved_initialize_tcp_client_class((SubLObject)subloop_tcp_client.$sym0$TCP_CLIENT);
        methods.methods_incorporate_instance_method((SubLObject)subloop_tcp_client.$sym10$INITIALIZE, (SubLObject)subloop_tcp_client.$sym0$TCP_CLIENT, (SubLObject)subloop_tcp_client.$list11, (SubLObject)subloop_tcp_client.NIL, (SubLObject)subloop_tcp_client.$list12);
        methods.subloop_register_instance_method((SubLObject)subloop_tcp_client.$sym0$TCP_CLIENT, (SubLObject)subloop_tcp_client.$sym10$INITIALIZE, (SubLObject)subloop_tcp_client.$sym13$TCP_CLIENT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_tcp_client.$sym14$SET_HOST, (SubLObject)subloop_tcp_client.$sym0$TCP_CLIENT, (SubLObject)subloop_tcp_client.$list15, (SubLObject)subloop_tcp_client.$list16, (SubLObject)subloop_tcp_client.$list17);
        methods.subloop_register_instance_method((SubLObject)subloop_tcp_client.$sym0$TCP_CLIENT, (SubLObject)subloop_tcp_client.$sym14$SET_HOST, (SubLObject)subloop_tcp_client.$sym20$TCP_CLIENT_SET_HOST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_tcp_client.$sym21$SET_PORT, (SubLObject)subloop_tcp_client.$sym0$TCP_CLIENT, (SubLObject)subloop_tcp_client.$list15, (SubLObject)subloop_tcp_client.$list22, (SubLObject)subloop_tcp_client.$list23);
        methods.subloop_register_instance_method((SubLObject)subloop_tcp_client.$sym0$TCP_CLIENT, (SubLObject)subloop_tcp_client.$sym21$SET_PORT, (SubLObject)subloop_tcp_client.$sym26$TCP_CLIENT_SET_PORT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_tcp_client.$sym27$PRINT, (SubLObject)subloop_tcp_client.$sym0$TCP_CLIENT, (SubLObject)subloop_tcp_client.$list11, (SubLObject)subloop_tcp_client.$list28, (SubLObject)subloop_tcp_client.$list29);
        methods.subloop_register_instance_method((SubLObject)subloop_tcp_client.$sym0$TCP_CLIENT, (SubLObject)subloop_tcp_client.$sym27$PRINT, (SubLObject)subloop_tcp_client.$sym35$TCP_CLIENT_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_tcp_client.$sym36$PERFORM_REQUEST, (SubLObject)subloop_tcp_client.$sym0$TCP_CLIENT, (SubLObject)subloop_tcp_client.$list15, (SubLObject)subloop_tcp_client.$list37, (SubLObject)subloop_tcp_client.$list38);
        methods.subloop_register_instance_method((SubLObject)subloop_tcp_client.$sym0$TCP_CLIENT, (SubLObject)subloop_tcp_client.$sym36$PERFORM_REQUEST, (SubLObject)subloop_tcp_client.$sym41$TCP_CLIENT_PERFORM_REQUEST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_tcp_client.$sym42$REQUEST_TOKENIZED_XML, (SubLObject)subloop_tcp_client.$sym0$TCP_CLIENT, (SubLObject)subloop_tcp_client.$list15, (SubLObject)subloop_tcp_client.$list37, (SubLObject)subloop_tcp_client.$list43);
        methods.subloop_register_instance_method((SubLObject)subloop_tcp_client.$sym0$TCP_CLIENT, (SubLObject)subloop_tcp_client.$sym42$REQUEST_TOKENIZED_XML, (SubLObject)subloop_tcp_client.$sym45$TCP_CLIENT_REQUEST_TOKENIZED_XML_METHOD);
        return (SubLObject)subloop_tcp_client.NIL;
    }
    
    public void declareFunctions() {
        declare_subloop_tcp_client_file();
    }
    
    public void initializeVariables() {
        init_subloop_tcp_client_file();
    }
    
    public void runTopLevelForms() {
        setup_subloop_tcp_client_file();
    }
    
    static {
        me = (SubLFile)new subloop_tcp_client();
        $sym0$TCP_CLIENT = SubLObjectFactory.makeSymbol("TCP-CLIENT");
        $sym1$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HOST"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PORT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-HOST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PERFORM-REQUEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REQUEST-STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym3$PORT = SubLObjectFactory.makeSymbol("PORT");
        $sym4$HOST = SubLObjectFactory.makeSymbol("HOST");
        $sym5$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym6$SUBLOOP_RESERVED_INITIALIZE_TCP_CLIENT_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TCP-CLIENT-CLASS");
        $sym7$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym8$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym9$SUBLOOP_RESERVED_INITIALIZE_TCP_CLIENT_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TCP-CLIENT-INSTANCE");
        $sym10$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list12 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym13$TCP_CLIENT_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("TCP-CLIENT-INITIALIZE-METHOD");
        $sym14$SET_HOST = SubLObjectFactory.makeSymbol("SET-HOST");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STRING; the name of the machine that hosts the server\n  this client wishes to contact."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("HOST"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym18$OUTER_CATCH_FOR_TCP_CLIENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TCP-CLIENT-METHOD");
        $sym19$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym20$TCP_CLIENT_SET_HOST_METHOD = SubLObjectFactory.makeSymbol("TCP-CLIENT-SET-HOST-METHOD");
        $sym21$SET_PORT = SubLObjectFactory.makeSymbol("SET-PORT");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param NUMBER; the port of the server this client wishes to contact."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PORT"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym24$OUTER_CATCH_FOR_TCP_CLIENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TCP-CLIENT-METHOD");
        $sym25$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym26$TCP_CLIENT_SET_PORT_METHOD = SubLObjectFactory.makeSymbol("TCP-CLIENT-SET-PORT-METHOD");
        $sym27$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list29 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Pretty-prints this tcp-client to STREAM, ignoring DEPTH"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("#<TCP-CLIENT: "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("Server: "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("HOST"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(" Port: "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("PORT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(">"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERPRI"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")) });
        $sym30$OUTER_CATCH_FOR_TCP_CLIENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TCP-CLIENT-METHOD");
        $str31$__TCP_CLIENT__ = SubLObjectFactory.makeString("#<TCP-CLIENT: ");
        $str32$Server__ = SubLObjectFactory.makeString("Server: ");
        $str33$_Port__ = SubLObjectFactory.makeString(" Port: ");
        $str34$_ = SubLObjectFactory.makeString(">");
        $sym35$TCP_CLIENT_PRINT_METHOD = SubLObjectFactory.makeSymbol("TCP-CLIENT-PRINT-METHOD");
        $sym36$PERFORM_REQUEST = SubLObjectFactory.makeSymbol("PERFORM-REQUEST");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REQUEST-STRING"));
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param REQUEST-STRING; the content of the requests that this client\n  wants to submit to the server it is targeting. Each subclass of tcp-client\n  will be responsible for making sure that REQUEST-STRING conforms to the\n  required communication protocol.\n  @return stringp; the server's reply"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-TCP-CONNECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BI-STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("HOST"), (SubLObject)SubLObjectFactory.makeSymbol("PORT"), (SubLObject)SubLObjectFactory.makeKeyword("ACCESS-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-LINE"), (SubLObject)SubLObjectFactory.makeSymbol("REQUEST-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("BI-STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORCE-OUTPUT"), (SubLObject)SubLObjectFactory.makeSymbol("BI-STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("READ-LINE"), (SubLObject)SubLObjectFactory.makeSymbol("BI-STREAM")))));
        $sym39$OUTER_CATCH_FOR_TCP_CLIENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TCP-CLIENT-METHOD");
        $kw40$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $sym41$TCP_CLIENT_PERFORM_REQUEST_METHOD = SubLObjectFactory.makeSymbol("TCP-CLIENT-PERFORM-REQUEST-METHOD");
        $sym42$REQUEST_TOKENIZED_XML = SubLObjectFactory.makeSymbol("REQUEST-TOKENIZED-XML");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param REQUEST-STRING; the content of the requests that this client\n  wants to submit to the server it is targeting. Each subclass of tcp-client\n  will be responsible for making sure that REQUEST-STRING conforms to the\n  required XML communication protocol.\n  @return listp; the server's reply parsed as a list of XML tokens"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-TCP-CONNECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BI-STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("HOST"), (SubLObject)SubLObjectFactory.makeSymbol("PORT"), (SubLObject)SubLObjectFactory.makeKeyword("ACCESS-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-LINE"), (SubLObject)SubLObjectFactory.makeSymbol("REQUEST-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("BI-STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORCE-OUTPUT"), (SubLObject)SubLObjectFactory.makeSymbol("BI-STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("XML-TOKENIZE"), (SubLObject)SubLObjectFactory.makeSymbol("BI-STREAM")))));
        $sym44$OUTER_CATCH_FOR_TCP_CLIENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TCP-CLIENT-METHOD");
        $sym45$TCP_CLIENT_REQUEST_TOKENIZED_XML_METHOD = SubLObjectFactory.makeSymbol("TCP-CLIENT-REQUEST-TOKENIZED-XML-METHOD");
    }
}

/*

	Total time: 147 ms
	
*/