/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.validate_tcp_connection;
import static com.cyc.cycjava.cycl.subl_promotions.open_tcp_stream_with_timeout;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_line;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SUBLOOP-TCP-CLIENT
 * source file: /cyc/top/cycl/subloop-tcp-client.lisp
 * created:     2019/07/03 17:37:09
 */
public final class subloop_tcp_client extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new subloop_tcp_client();



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol TCP_CLIENT = makeSymbol("TCP-CLIENT");

    static private final SubLList $list2 = list(list(makeSymbol("HOST"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PORT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-HOST"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PORT"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-REQUEST"), list(makeSymbol("REQUEST-STRING")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TCP_CLIENT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TCP-CLIENT-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TCP_CLIENT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TCP-CLIENT-INSTANCE");

    static private final SubLList $list11 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list12 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol TCP_CLIENT_INITIALIZE_METHOD = makeSymbol("TCP-CLIENT-INITIALIZE-METHOD");

    private static final SubLSymbol SET_HOST = makeSymbol("SET-HOST");

    static private final SubLList $list15 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list16 = list(makeSymbol("STRING"));

    static private final SubLList $list17 = list(makeString("@param STRING; the name of the machine that hosts the server\n  this client wishes to contact."), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CSETQ"), makeSymbol("HOST"), makeSymbol("STRING")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym18$OUTER_CATCH_FOR_TCP_CLIENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TCP-CLIENT-METHOD");

    private static final SubLSymbol TCP_CLIENT_SET_HOST_METHOD = makeSymbol("TCP-CLIENT-SET-HOST-METHOD");

    private static final SubLSymbol SET_PORT = makeSymbol("SET-PORT");

    static private final SubLList $list22 = list(makeSymbol("NUMBER"));

    static private final SubLList $list23 = list(makeString("@param NUMBER; the port of the server this client wishes to contact."), list(makeSymbol("CHECK-TYPE"), makeSymbol("NUMBER"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeSymbol("CSETQ"), makeSymbol("PORT"), makeSymbol("NUMBER")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym24$OUTER_CATCH_FOR_TCP_CLIENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TCP-CLIENT-METHOD");

    private static final SubLSymbol TCP_CLIENT_SET_PORT_METHOD = makeSymbol("TCP-CLIENT-SET-PORT-METHOD");

    static private final SubLList $list28 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list29 = list(new SubLObject[]{ makeString("Pretty-prints this tcp-client to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<TCP-CLIENT: "), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString("Server: "), makeSymbol("STREAM")), list(makeSymbol("PRINC"), makeSymbol("HOST"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(" Port: "), makeSymbol("STREAM")), list(makeSymbol("PRINC"), makeSymbol("PORT"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")), list(makeSymbol("TERPRI"), makeSymbol("STREAM")), list(RET, makeSymbol("SELF")) });

    static private final SubLSymbol $sym30$OUTER_CATCH_FOR_TCP_CLIENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TCP-CLIENT-METHOD");

    static private final SubLString $str31$__TCP_CLIENT__ = makeString("#<TCP-CLIENT: ");

    static private final SubLString $str32$Server__ = makeString("Server: ");

    static private final SubLString $str33$_Port__ = makeString(" Port: ");

    static private final SubLString $str34$_ = makeString(">");

    private static final SubLSymbol TCP_CLIENT_PRINT_METHOD = makeSymbol("TCP-CLIENT-PRINT-METHOD");

    private static final SubLSymbol PERFORM_REQUEST = makeSymbol("PERFORM-REQUEST");

    static private final SubLList $list37 = list(makeSymbol("REQUEST-STRING"));

    static private final SubLList $list38 = list(makeString("@param REQUEST-STRING; the content of the requests that this client\n  wants to submit to the server it is targeting. Each subclass of tcp-client\n  will be responsible for making sure that REQUEST-STRING conforms to the\n  required communication protocol.\n  @return stringp; the server\'s reply"), list(makeSymbol("WITH-TCP-CONNECTION"), list(makeSymbol("BI-STREAM"), makeSymbol("HOST"), makeSymbol("PORT"), makeKeyword("ACCESS-MODE"), makeKeyword("PRIVATE")), list(makeSymbol("WRITE-LINE"), makeSymbol("REQUEST-STRING"), makeSymbol("BI-STREAM")), list(makeSymbol("FORCE-OUTPUT"), makeSymbol("BI-STREAM")), list(RET, list(makeSymbol("READ-LINE"), makeSymbol("BI-STREAM")))));

    static private final SubLSymbol $sym39$OUTER_CATCH_FOR_TCP_CLIENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TCP-CLIENT-METHOD");

    private static final SubLSymbol TCP_CLIENT_PERFORM_REQUEST_METHOD = makeSymbol("TCP-CLIENT-PERFORM-REQUEST-METHOD");

    private static final SubLSymbol REQUEST_TOKENIZED_XML = makeSymbol("REQUEST-TOKENIZED-XML");

    static private final SubLList $list43 = list(makeString("@param REQUEST-STRING; the content of the requests that this client\n  wants to submit to the server it is targeting. Each subclass of tcp-client\n  will be responsible for making sure that REQUEST-STRING conforms to the\n  required XML communication protocol.\n  @return listp; the server\'s reply parsed as a list of XML tokens"), list(makeSymbol("WITH-TCP-CONNECTION"), list(makeSymbol("BI-STREAM"), makeSymbol("HOST"), makeSymbol("PORT"), makeKeyword("ACCESS-MODE"), makeKeyword("PRIVATE")), list(makeSymbol("WRITE-LINE"), makeSymbol("REQUEST-STRING"), makeSymbol("BI-STREAM")), list(makeSymbol("FORCE-OUTPUT"), makeSymbol("BI-STREAM")), list(RET, list(makeSymbol("XML-TOKENIZE"), makeSymbol("BI-STREAM")))));

    static private final SubLSymbol $sym44$OUTER_CATCH_FOR_TCP_CLIENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TCP-CLIENT-METHOD");

    private static final SubLSymbol TCP_CLIENT_REQUEST_TOKENIZED_XML_METHOD = makeSymbol("TCP-CLIENT-REQUEST-TOKENIZED-XML-METHOD");

    // Definitions
    public static final SubLObject get_tcp_client_port_alt(SubLObject tcp_client) {
        return classes.subloop_get_access_protected_instance_slot(tcp_client, TWO_INTEGER, PORT);
    }

    // Definitions
    public static SubLObject get_tcp_client_port(final SubLObject tcp_client) {
        return classes.subloop_get_access_protected_instance_slot(tcp_client, TWO_INTEGER, PORT);
    }

    public static final SubLObject set_tcp_client_port_alt(SubLObject tcp_client, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(tcp_client, value, TWO_INTEGER, PORT);
    }

    public static SubLObject set_tcp_client_port(final SubLObject tcp_client, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(tcp_client, value, TWO_INTEGER, PORT);
    }

    public static final SubLObject get_tcp_client_host_alt(SubLObject tcp_client) {
        return classes.subloop_get_access_protected_instance_slot(tcp_client, ONE_INTEGER, HOST);
    }

    public static SubLObject get_tcp_client_host(final SubLObject tcp_client) {
        return classes.subloop_get_access_protected_instance_slot(tcp_client, ONE_INTEGER, HOST);
    }

    public static final SubLObject set_tcp_client_host_alt(SubLObject tcp_client, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(tcp_client, value, ONE_INTEGER, HOST);
    }

    public static SubLObject set_tcp_client_host(final SubLObject tcp_client, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(tcp_client, value, ONE_INTEGER, HOST);
    }

    public static final SubLObject subloop_reserved_initialize_tcp_client_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_tcp_client_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_tcp_client_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TCP_CLIENT, HOST, NIL);
        classes.subloop_initialize_slot(new_instance, TCP_CLIENT, PORT, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_tcp_client_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TCP_CLIENT, HOST, NIL);
        classes.subloop_initialize_slot(new_instance, TCP_CLIENT, PORT, NIL);
        return NIL;
    }

    public static final SubLObject tcp_client_p_alt(SubLObject tcp_client) {
        return classes.subloop_instanceof_class(tcp_client, TCP_CLIENT);
    }

    public static SubLObject tcp_client_p(final SubLObject tcp_client) {
        return classes.subloop_instanceof_class(tcp_client, TCP_CLIENT);
    }

    public static final SubLObject tcp_client_initialize_method_alt(SubLObject self) {
        object.object_initialize_method(self);
        return self;
    }

    public static SubLObject tcp_client_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        return self;
    }

    /**
     *
     *
     * @param STRING;
     * 		the name of the machine that hosts the server
     * 		this client wishes to contact.
     */
    @LispMethod(comment = "@param STRING;\r\n\t\tthe name of the machine that hosts the server\r\n\t\tthis client wishes to contact.")
    public static final SubLObject tcp_client_set_host_method_alt(SubLObject self, SubLObject string) {
        {
            SubLObject catch_var_for_tcp_client_method = NIL;
            SubLObject host = com.cyc.cycjava.cycl.subloop_tcp_client.get_tcp_client_host(self);
            try {
                try {
                    SubLTrampolineFile.checkType(string, STRINGP);
                    host = string;
                    sublisp_throw($sym18$OUTER_CATCH_FOR_TCP_CLIENT_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_tcp_client.set_tcp_client_host(self, host);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_tcp_client_method = Errors.handleThrowable(ccatch_env_var, $sym18$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
            }
            return catch_var_for_tcp_client_method;
        }
    }

    /**
     *
     *
     * @param STRING;
     * 		the name of the machine that hosts the server
     * 		this client wishes to contact.
     */
    @LispMethod(comment = "@param STRING;\r\n\t\tthe name of the machine that hosts the server\r\n\t\tthis client wishes to contact.")
    public static SubLObject tcp_client_set_host_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_tcp_client_method = NIL;
        SubLObject host = get_tcp_client_host(self);
        try {
            thread.throwStack.push($sym18$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
            try {
                assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
                host = string;
                sublisp_throw($sym18$OUTER_CATCH_FOR_TCP_CLIENT_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_tcp_client_host(self, host);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_tcp_client_method = Errors.handleThrowable(ccatch_env_var, $sym18$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_tcp_client_method;
    }

    /**
     *
     *
     * @param NUMBER;
     * 		the port of the server this client wishes to contact.
     */
    @LispMethod(comment = "@param NUMBER;\r\n\t\tthe port of the server this client wishes to contact.")
    public static final SubLObject tcp_client_set_port_method_alt(SubLObject self, SubLObject number) {
        {
            SubLObject catch_var_for_tcp_client_method = NIL;
            SubLObject port = com.cyc.cycjava.cycl.subloop_tcp_client.get_tcp_client_port(self);
            try {
                try {
                    SubLTrampolineFile.checkType(number, NON_NEGATIVE_INTEGER_P);
                    port = number;
                    sublisp_throw($sym24$OUTER_CATCH_FOR_TCP_CLIENT_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_tcp_client.set_tcp_client_port(self, port);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_tcp_client_method = Errors.handleThrowable(ccatch_env_var, $sym24$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
            }
            return catch_var_for_tcp_client_method;
        }
    }

    /**
     *
     *
     * @param NUMBER;
     * 		the port of the server this client wishes to contact.
     */
    @LispMethod(comment = "@param NUMBER;\r\n\t\tthe port of the server this client wishes to contact.")
    public static SubLObject tcp_client_set_port_method(final SubLObject self, final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_tcp_client_method = NIL;
        SubLObject port = get_tcp_client_port(self);
        try {
            thread.throwStack.push($sym24$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
            try {
                assert NIL != subl_promotions.non_negative_integer_p(number) : "! subl_promotions.non_negative_integer_p(number) " + ("subl_promotions.non_negative_integer_p(number) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(number) ") + number;
                port = number;
                sublisp_throw($sym24$OUTER_CATCH_FOR_TCP_CLIENT_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_tcp_client_port(self, port);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_tcp_client_method = Errors.handleThrowable(ccatch_env_var, $sym24$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_tcp_client_method;
    }

    /**
     * Pretty-prints this tcp-client to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Pretty-prints this tcp-client to STREAM, ignoring DEPTH")
    public static final SubLObject tcp_client_print_method_alt(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_tcp_client_method = NIL;
            SubLObject port = com.cyc.cycjava.cycl.subloop_tcp_client.get_tcp_client_port(self);
            SubLObject host = com.cyc.cycjava.cycl.subloop_tcp_client.get_tcp_client_host(self);
            try {
                try {
                    write_string($str_alt31$__TCP_CLIENT__, stream, UNPROVIDED, UNPROVIDED);
                    write_string($str_alt32$Server__, stream, UNPROVIDED, UNPROVIDED);
                    princ(host, stream);
                    write_string($str_alt33$_Port__, stream, UNPROVIDED, UNPROVIDED);
                    princ(port, stream);
                    write_string($str_alt34$_, stream, UNPROVIDED, UNPROVIDED);
                    terpri(stream);
                    sublisp_throw($sym30$OUTER_CATCH_FOR_TCP_CLIENT_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_tcp_client.set_tcp_client_port(self, port);
                            com.cyc.cycjava.cycl.subloop_tcp_client.set_tcp_client_host(self, host);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_tcp_client_method = Errors.handleThrowable(ccatch_env_var, $sym30$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
            }
            return catch_var_for_tcp_client_method;
        }
    }

    /**
     * Pretty-prints this tcp-client to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Pretty-prints this tcp-client to STREAM, ignoring DEPTH")
    public static SubLObject tcp_client_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_tcp_client_method = NIL;
        final SubLObject port = get_tcp_client_port(self);
        final SubLObject host = get_tcp_client_host(self);
        try {
            thread.throwStack.push($sym30$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
            try {
                write_string($str31$__TCP_CLIENT__, stream, UNPROVIDED, UNPROVIDED);
                write_string($str32$Server__, stream, UNPROVIDED, UNPROVIDED);
                princ(host, stream);
                write_string($str33$_Port__, stream, UNPROVIDED, UNPROVIDED);
                princ(port, stream);
                write_string($str34$_, stream, UNPROVIDED, UNPROVIDED);
                terpri(stream);
                sublisp_throw($sym30$OUTER_CATCH_FOR_TCP_CLIENT_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_tcp_client_port(self, port);
                    set_tcp_client_host(self, host);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_tcp_client_method = Errors.handleThrowable(ccatch_env_var, $sym30$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_tcp_client_method;
    }

    /**
     *
     *
     * @param REQUEST-STRING;
     * 		the content of the requests that this client
     * 		wants to submit to the server it is targeting. Each subclass of tcp-client
     * 		will be responsible for making sure that REQUEST-STRING conforms to the
     * 		required communication protocol.
     * @return stringp; the server's reply
     */
    @LispMethod(comment = "@param REQUEST-STRING;\r\n\t\tthe content of the requests that this client\r\n\t\twants to submit to the server it is targeting. Each subclass of tcp-client\r\n\t\twill be responsible for making sure that REQUEST-STRING conforms to the\r\n\t\trequired communication protocol.\r\n@return stringp; the server\'s reply")
    public static final SubLObject tcp_client_perform_request_method_alt(SubLObject self, SubLObject request_string) {
        {
            SubLObject catch_var_for_tcp_client_method = NIL;
            SubLObject port = com.cyc.cycjava.cycl.subloop_tcp_client.get_tcp_client_port(self);
            SubLObject host = com.cyc.cycjava.cycl.subloop_tcp_client.get_tcp_client_host(self);
            try {
                try {
                    {
                        SubLObject bi_stream = NIL;
                        try {
                            bi_stream = open_tcp_stream_with_timeout(host, port, NIL, $PRIVATE);
                            if (NIL != bi_stream) {
                                write_line(request_string, bi_stream, UNPROVIDED, UNPROVIDED);
                                force_output(bi_stream);
                                sublisp_throw($sym39$OUTER_CATCH_FOR_TCP_CLIENT_METHOD, read_line(bi_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    if (NIL != bi_stream) {
                                        close(bi_stream, UNPROVIDED);
                                    }
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_tcp_client.set_tcp_client_port(self, port);
                            com.cyc.cycjava.cycl.subloop_tcp_client.set_tcp_client_host(self, host);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_tcp_client_method = Errors.handleThrowable(ccatch_env_var, $sym39$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
            }
            return catch_var_for_tcp_client_method;
        }
    }

    /**
     *
     *
     * @param REQUEST-STRING;
     * 		the content of the requests that this client
     * 		wants to submit to the server it is targeting. Each subclass of tcp-client
     * 		will be responsible for making sure that REQUEST-STRING conforms to the
     * 		required communication protocol.
     * @return stringp; the server's reply
     */
    @LispMethod(comment = "@param REQUEST-STRING;\r\n\t\tthe content of the requests that this client\r\n\t\twants to submit to the server it is targeting. Each subclass of tcp-client\r\n\t\twill be responsible for making sure that REQUEST-STRING conforms to the\r\n\t\trequired communication protocol.\r\n@return stringp; the server\'s reply")
    public static SubLObject tcp_client_perform_request_method(final SubLObject self, final SubLObject request_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_tcp_client_method = NIL;
        final SubLObject port = get_tcp_client_port(self);
        final SubLObject host = get_tcp_client_host(self);
        try {
            thread.throwStack.push($sym39$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
            try {
                SubLObject bi_stream = NIL;
                try {
                    bi_stream = subl_promotions.open_tcp_stream_with_timeout(host, port, NIL, $PRIVATE);
                    if (NIL != validate_tcp_connection(bi_stream, host, port)) {
                        write_line(request_string, bi_stream, UNPROVIDED, UNPROVIDED);
                        force_output(bi_stream);
                        sublisp_throw($sym39$OUTER_CATCH_FOR_TCP_CLIENT_METHOD, read_line(bi_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    }
                } finally {
                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL != bi_stream) {
                            close(bi_stream, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    set_tcp_client_port(self, port);
                    set_tcp_client_host(self, host);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_tcp_client_method = Errors.handleThrowable(ccatch_env_var, $sym39$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_tcp_client_method;
    }

    static private final SubLList $list_alt2 = list(list(makeSymbol("HOST"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PORT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-HOST"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PORT"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-REQUEST"), list(makeSymbol("REQUEST-STRING")), makeKeyword("PUBLIC")));

    /**
     *
     *
     * @param REQUEST-STRING;
     * 		the content of the requests that this client
     * 		wants to submit to the server it is targeting. Each subclass of tcp-client
     * 		will be responsible for making sure that REQUEST-STRING conforms to the
     * 		required XML communication protocol.
     * @return listp; the server's reply parsed as a list of XML tokens
     */
    @LispMethod(comment = "@param REQUEST-STRING;\r\n\t\tthe content of the requests that this client\r\n\t\twants to submit to the server it is targeting. Each subclass of tcp-client\r\n\t\twill be responsible for making sure that REQUEST-STRING conforms to the\r\n\t\trequired XML communication protocol.\r\n@return listp; the server\'s reply parsed as a list of XML tokens")
    public static final SubLObject tcp_client_request_tokenized_xml_method_alt(SubLObject self, SubLObject request_string) {
        {
            SubLObject catch_var_for_tcp_client_method = NIL;
            SubLObject port = com.cyc.cycjava.cycl.subloop_tcp_client.get_tcp_client_port(self);
            SubLObject host = com.cyc.cycjava.cycl.subloop_tcp_client.get_tcp_client_host(self);
            try {
                try {
                    {
                        SubLObject bi_stream = NIL;
                        try {
                            bi_stream = open_tcp_stream_with_timeout(host, port, NIL, $PRIVATE);
                            if (NIL != bi_stream) {
                                write_line(request_string, bi_stream, UNPROVIDED, UNPROVIDED);
                                force_output(bi_stream);
                                sublisp_throw($sym44$OUTER_CATCH_FOR_TCP_CLIENT_METHOD, web_utilities.xml_tokenize(bi_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    if (NIL != bi_stream) {
                                        close(bi_stream, UNPROVIDED);
                                    }
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.subloop_tcp_client.set_tcp_client_port(self, port);
                            com.cyc.cycjava.cycl.subloop_tcp_client.set_tcp_client_host(self, host);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_tcp_client_method = Errors.handleThrowable(ccatch_env_var, $sym44$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
            }
            return catch_var_for_tcp_client_method;
        }
    }

    /**
     *
     *
     * @param REQUEST-STRING;
     * 		the content of the requests that this client
     * 		wants to submit to the server it is targeting. Each subclass of tcp-client
     * 		will be responsible for making sure that REQUEST-STRING conforms to the
     * 		required XML communication protocol.
     * @return listp; the server's reply parsed as a list of XML tokens
     */
    @LispMethod(comment = "@param REQUEST-STRING;\r\n\t\tthe content of the requests that this client\r\n\t\twants to submit to the server it is targeting. Each subclass of tcp-client\r\n\t\twill be responsible for making sure that REQUEST-STRING conforms to the\r\n\t\trequired XML communication protocol.\r\n@return listp; the server\'s reply parsed as a list of XML tokens")
    public static SubLObject tcp_client_request_tokenized_xml_method(final SubLObject self, final SubLObject request_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_tcp_client_method = NIL;
        final SubLObject port = get_tcp_client_port(self);
        final SubLObject host = get_tcp_client_host(self);
        try {
            thread.throwStack.push($sym44$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
            try {
                SubLObject bi_stream = NIL;
                try {
                    bi_stream = subl_promotions.open_tcp_stream_with_timeout(host, port, NIL, $PRIVATE);
                    if (NIL != validate_tcp_connection(bi_stream, host, port)) {
                        write_line(request_string, bi_stream, UNPROVIDED, UNPROVIDED);
                        force_output(bi_stream);
                        sublisp_throw($sym44$OUTER_CATCH_FOR_TCP_CLIENT_METHOD, xml_parsing_utilities.xml_tokenize(bi_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    }
                } finally {
                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL != bi_stream) {
                            close(bi_stream, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    set_tcp_client_port(self, port);
                    set_tcp_client_host(self, host);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_tcp_client_method = Errors.handleThrowable(ccatch_env_var, $sym44$OUTER_CATCH_FOR_TCP_CLIENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_tcp_client_method;
    }

    static private final SubLList $list_alt11 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt12 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt15 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt16 = list(makeSymbol("STRING"));

    static private final SubLList $list_alt17 = list(makeString("@param STRING; the name of the machine that hosts the server\n  this client wishes to contact."), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CSETQ"), makeSymbol("HOST"), makeSymbol("STRING")), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt22 = list(makeSymbol("NUMBER"));

    static private final SubLList $list_alt23 = list(makeString("@param NUMBER; the port of the server this client wishes to contact."), list(makeSymbol("CHECK-TYPE"), makeSymbol("NUMBER"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeSymbol("CSETQ"), makeSymbol("PORT"), makeSymbol("NUMBER")), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt28 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt29 = list(new SubLObject[]{ makeString("Pretty-prints this tcp-client to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<TCP-CLIENT: "), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString("Server: "), makeSymbol("STREAM")), list(makeSymbol("PRINC"), makeSymbol("HOST"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(" Port: "), makeSymbol("STREAM")), list(makeSymbol("PRINC"), makeSymbol("PORT"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")), list(makeSymbol("TERPRI"), makeSymbol("STREAM")), list(RET, makeSymbol("SELF")) });

    public static SubLObject declare_subloop_tcp_client_file() {
        declareFunction("get_tcp_client_port", "GET-TCP-CLIENT-PORT", 1, 0, false);
        declareFunction("set_tcp_client_port", "SET-TCP-CLIENT-PORT", 2, 0, false);
        declareFunction("get_tcp_client_host", "GET-TCP-CLIENT-HOST", 1, 0, false);
        declareFunction("set_tcp_client_host", "SET-TCP-CLIENT-HOST", 2, 0, false);
        declareFunction("subloop_reserved_initialize_tcp_client_class", "SUBLOOP-RESERVED-INITIALIZE-TCP-CLIENT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_tcp_client_instance", "SUBLOOP-RESERVED-INITIALIZE-TCP-CLIENT-INSTANCE", 1, 0, false);
        declareFunction("tcp_client_p", "TCP-CLIENT-P", 1, 0, false);
        declareFunction("tcp_client_initialize_method", "TCP-CLIENT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("tcp_client_set_host_method", "TCP-CLIENT-SET-HOST-METHOD", 2, 0, false);
        declareFunction("tcp_client_set_port_method", "TCP-CLIENT-SET-PORT-METHOD", 2, 0, false);
        declareFunction("tcp_client_print_method", "TCP-CLIENT-PRINT-METHOD", 3, 0, false);
        declareFunction("tcp_client_perform_request_method", "TCP-CLIENT-PERFORM-REQUEST-METHOD", 2, 0, false);
        declareFunction("tcp_client_request_tokenized_xml_method", "TCP-CLIENT-REQUEST-TOKENIZED-XML-METHOD", 2, 0, false);
        return NIL;
    }

    static private final SubLString $str_alt31$__TCP_CLIENT__ = makeString("#<TCP-CLIENT: ");

    static private final SubLString $str_alt32$Server__ = makeString("Server: ");

    static private final SubLString $str_alt33$_Port__ = makeString(" Port: ");

    static private final SubLString $str_alt34$_ = makeString(">");

    static private final SubLList $list_alt37 = list(makeSymbol("REQUEST-STRING"));

    public static SubLObject init_subloop_tcp_client_file() {
        return NIL;
    }

    static private final SubLList $list_alt38 = list(makeString("@param REQUEST-STRING; the content of the requests that this client\n  wants to submit to the server it is targeting. Each subclass of tcp-client\n  will be responsible for making sure that REQUEST-STRING conforms to the\n  required communication protocol.\n  @return stringp; the server\'s reply"), list(makeSymbol("WITH-TCP-CONNECTION"), list(makeSymbol("BI-STREAM"), makeSymbol("HOST"), makeSymbol("PORT"), makeKeyword("ACCESS-MODE"), makeKeyword("PRIVATE")), list(makeSymbol("WRITE-LINE"), makeSymbol("REQUEST-STRING"), makeSymbol("BI-STREAM")), list(makeSymbol("FORCE-OUTPUT"), makeSymbol("BI-STREAM")), list(RET, list(makeSymbol("READ-LINE"), makeSymbol("BI-STREAM")))));

    public static SubLObject setup_subloop_tcp_client_file() {
        classes.subloop_new_class(TCP_CLIENT, OBJECT, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(TCP_CLIENT, NIL);
        classes.subloop_note_class_initialization_function(TCP_CLIENT, SUBLOOP_RESERVED_INITIALIZE_TCP_CLIENT_CLASS);
        classes.subloop_note_instance_initialization_function(TCP_CLIENT, SUBLOOP_RESERVED_INITIALIZE_TCP_CLIENT_INSTANCE);
        subloop_reserved_initialize_tcp_client_class(TCP_CLIENT);
        methods.methods_incorporate_instance_method(INITIALIZE, TCP_CLIENT, $list11, NIL, $list12);
        methods.subloop_register_instance_method(TCP_CLIENT, INITIALIZE, TCP_CLIENT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_HOST, TCP_CLIENT, $list15, $list16, $list17);
        methods.subloop_register_instance_method(TCP_CLIENT, SET_HOST, TCP_CLIENT_SET_HOST_METHOD);
        methods.methods_incorporate_instance_method(SET_PORT, TCP_CLIENT, $list15, $list22, $list23);
        methods.subloop_register_instance_method(TCP_CLIENT, SET_PORT, TCP_CLIENT_SET_PORT_METHOD);
        methods.methods_incorporate_instance_method(PRINT, TCP_CLIENT, $list11, $list28, $list29);
        methods.subloop_register_instance_method(TCP_CLIENT, PRINT, TCP_CLIENT_PRINT_METHOD);
        methods.methods_incorporate_instance_method(PERFORM_REQUEST, TCP_CLIENT, $list15, $list37, $list38);
        methods.subloop_register_instance_method(TCP_CLIENT, PERFORM_REQUEST, TCP_CLIENT_PERFORM_REQUEST_METHOD);
        methods.methods_incorporate_instance_method(REQUEST_TOKENIZED_XML, TCP_CLIENT, $list15, $list37, $list43);
        methods.subloop_register_instance_method(TCP_CLIENT, REQUEST_TOKENIZED_XML, TCP_CLIENT_REQUEST_TOKENIZED_XML_METHOD);
        return NIL;
    }

    static private final SubLList $list_alt43 = list(makeString("@param REQUEST-STRING; the content of the requests that this client\n  wants to submit to the server it is targeting. Each subclass of tcp-client\n  will be responsible for making sure that REQUEST-STRING conforms to the\n  required XML communication protocol.\n  @return listp; the server\'s reply parsed as a list of XML tokens"), list(makeSymbol("WITH-TCP-CONNECTION"), list(makeSymbol("BI-STREAM"), makeSymbol("HOST"), makeSymbol("PORT"), makeKeyword("ACCESS-MODE"), makeKeyword("PRIVATE")), list(makeSymbol("WRITE-LINE"), makeSymbol("REQUEST-STRING"), makeSymbol("BI-STREAM")), list(makeSymbol("FORCE-OUTPUT"), makeSymbol("BI-STREAM")), list(RET, list(makeSymbol("XML-TOKENIZE"), makeSymbol("BI-STREAM")))));

    @Override
    public void declareFunctions() {
        declare_subloop_tcp_client_file();
    }

    @Override
    public void initializeVariables() {
        init_subloop_tcp_client_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_subloop_tcp_client_file();
    }

    static {
    }
}

/**
 * Total time: 147 ms
 */
