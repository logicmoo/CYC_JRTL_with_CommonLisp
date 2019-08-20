/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.valid_process_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Tcp;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class tcp_server_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new tcp_server_utilities();



    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $tcp_server_lock$ = makeSymbol("*TCP-SERVER-LOCK*");

    // @TODO assignPaths == 0 ??
    /**
     * Within a TCP server handler, this is bound to an integer representing the
     * socket's remote machine IP address.
     */
    // @TODO assignPaths == 0 ??
    @LispMethod(comment = "Within a TCP server handler, this is bound to an integer representing the\r\nsocket\'s remote machine IP address.\n@TODO assignPaths == 0 ??\nWithin a TCP server handler, this is bound to an integer representing the\nsocket\'s remote machine IP address.")
    public static transient final SubLSymbol $remote_address$;

    // @TODO assignPaths == 0 ??
    /**
     * Within a TCP server handler, this is bound to a string representing the
     * socket's remote machine hostname
     */
    // @TODO assignPaths == 0 ??
    @LispMethod(comment = "Within a TCP server handler, this is bound to a string representing the\r\nsocket\'s remote machine hostname\n@TODO assignPaths == 0 ??\nWithin a TCP server handler, this is bound to a string representing the\nsocket\'s remote machine hostname")
    public static transient final SubLSymbol $remote_hostname$;

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_tcp_server$ = makeSymbol("*DTP-TCP-SERVER*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $$$TCP_Server_Lock = makeString("TCP Server Lock");

    static private final SubLList $list2 = list(makeSymbol("*TCP-SERVER-LOCK*"));

    private static final SubLInteger $int$65535 = makeInteger(65535);

    static private final SubLList $list4 = list($TEXT, makeKeyword("BINARY"));

    static private final SubLList $list5 = list(makeSymbol("NAME"), list(makeSymbol("IN-STREAM"), makeSymbol("OUT-STREAM")), list(makeSymbol("&KEY"), makeSymbol("TYPE"), list(makeSymbol("MODE"), $TEXT)), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list6 = list($TYPE, $MODE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol TCP_SERVER_MODE_P = makeSymbol("TCP-SERVER-MODE-P");

    private static final SubLSymbol REGISTER_TCP_SERVER_TYPE = makeSymbol("REGISTER-TCP-SERVER-TYPE");

    private static final SubLSymbol TCP_PORT_P = makeSymbol("TCP-PORT-P");

    private static final SubLSymbol DISABLE_ALL_TCP_SERVERS = makeSymbol("DISABLE-ALL-TCP-SERVERS");

    private static final SubLSymbol DISABLE_SOME_TCP_SERVERS = makeSymbol("DISABLE-SOME-TCP-SERVERS");

    static private final SubLList $list18 = list(makeKeyword("CYC-API"));

    private static final SubLSymbol TCP_SERVER_TYPE = makeSymbol("TCP-SERVER-TYPE");

    private static final SubLSymbol RE_ENABLE_DISABLED_TCP_SERVERS = makeSymbol("RE-ENABLE-DISABLED-TCP-SERVERS");

    private static final SubLSymbol ENABLE_TCP_SERVER_SPEC = makeSymbol("ENABLE-TCP-SERVER-SPEC");

    private static final SubLList $list22 = cons(makeSymbol("TYPE"), makeSymbol("PORT"));

    private static final SubLSymbol TCP_SERVER = makeSymbol("TCP-SERVER");

    private static final SubLSymbol TCP_SERVER_P = makeSymbol("TCP-SERVER-P");

    private static final SubLList $list26 = list(makeSymbol("TYPE"), makeSymbol("PORT"), makeSymbol("PROCESS"));

    private static final SubLList $list27 = list($TYPE, $PORT, makeKeyword("PROCESS"));

    private static final SubLList $list28 = list(makeSymbol("TCPS-TYPE"), makeSymbol("TCPS-PORT"), makeSymbol("TCPS-PROCESS"));

    private static final SubLList $list29 = list(makeSymbol("_CSETF-TCPS-TYPE"), makeSymbol("_CSETF-TCPS-PORT"), makeSymbol("_CSETF-TCPS-PROCESS"));

    private static final SubLSymbol PRINT_TCP_SERVER = makeSymbol("PRINT-TCP-SERVER");

    private static final SubLSymbol TCP_SERVER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TCP-SERVER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list32 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TCP-SERVER-P"));

    private static final SubLSymbol TCPS_TYPE = makeSymbol("TCPS-TYPE");

    private static final SubLSymbol _CSETF_TCPS_TYPE = makeSymbol("_CSETF-TCPS-TYPE");

    private static final SubLSymbol TCPS_PORT = makeSymbol("TCPS-PORT");

    private static final SubLSymbol _CSETF_TCPS_PORT = makeSymbol("_CSETF-TCPS-PORT");

    private static final SubLSymbol TCPS_PROCESS = makeSymbol("TCPS-PROCESS");

    private static final SubLSymbol _CSETF_TCPS_PROCESS = makeSymbol("_CSETF-TCPS-PROCESS");

    private static final SubLString $str41$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_TCP_SERVER = makeSymbol("MAKE-TCP-SERVER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TCP_SERVER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TCP-SERVER-METHOD");

    private static final SubLString $str47$_ = makeString("/");

    private static final SubLSymbol $all_tcp_servers$ = makeSymbol("*ALL-TCP-SERVERS*");

    private static final SubLSymbol TCP_SERVER_PORT = makeSymbol("TCP-SERVER-PORT");

    private static final SubLSymbol $tcp_server_type_table$ = makeSymbol("*TCP-SERVER-TYPE-TABLE*");

    private static final SubLSymbol TCP_SERVER_HANDLER_P = makeSymbol("TCP-SERVER-HANDLER-P");

    private static final SubLSymbol START_TCP_SERVER = makeSymbol("START-TCP-SERVER", "SUBLISP");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol STOP_TCP_SERVER = makeSymbol("STOP-TCP-SERVER", "SUBLISP");

    public static final SubLObject with_tcp_server_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_LOCK_HELD, $list_alt2, append(body, NIL));
        }
    }

    public static SubLObject with_tcp_server_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_LOCK_HELD, $list2, append(body, NIL));
    }

    /**
     * Return T iff OBJECT is a valid integer for a TCP port.
     */
    @LispMethod(comment = "Return T iff OBJECT is a valid integer for a TCP port.")
    public static final SubLObject tcp_port_p_alt(SubLObject v_object) {
        return makeBoolean((v_object.isFixnum() && ZERO_INTEGER.numLE(v_object)) && v_object.numLE($int$65535));
    }

    /**
     * Return T iff OBJECT is a valid integer for a TCP port.
     */
    @LispMethod(comment = "Return T iff OBJECT is a valid integer for a TCP port.")
    public static SubLObject tcp_port_p(final SubLObject v_object) {
        return makeBoolean((v_object.isFixnum() && ZERO_INTEGER.numLE(v_object)) && v_object.numLE($int$65535));
    }

    /**
     * Return T iff OBJECT is either :TEXT or :BINARY
     */
    @LispMethod(comment = "Return T iff OBJECT is either :TEXT or :BINARY")
    public static final SubLObject tcp_server_mode_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $list_alt4, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return T iff OBJECT is either :TEXT or :BINARY
     */
    @LispMethod(comment = "Return T iff OBJECT is either :TEXT or :BINARY")
    public static SubLObject tcp_server_mode_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $list4, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Define a TCP server handler function NAME whose only arguments
     * are IN-STREAM and OUT-STREAM and has BODY.
     * TYPE declares the server type that should use this handler.
     * MODE must be either :TEXT or :BINARY.
     */
    @LispMethod(comment = "Define a TCP server handler function NAME whose only arguments\r\nare IN-STREAM and OUT-STREAM and has BODY.\r\nTYPE declares the server type that should use this handler.\r\nMODE must be either :TEXT or :BINARY.\nDefine a TCP server handler function NAME whose only arguments\nare IN-STREAM and OUT-STREAM and has BODY.\nTYPE declares the server type that should use this handler.\nMODE must be either :TEXT or :BINARY.")
    public static final SubLObject define_tcp_server_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt5);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject in_stream = NIL;
                    SubLObject out_stream = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt5);
                    in_stream = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt5);
                    out_stream = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        destructuring_bind_must_consp(current, datum, $list_alt5);
                        {
                            SubLObject temp_1 = current.rest();
                            current = current.first();
                            {
                                SubLObject allow_other_keys_p = NIL;
                                SubLObject rest = current;
                                SubLObject bad = NIL;
                                SubLObject current_2 = NIL;
                                for (; NIL != rest;) {
                                    destructuring_bind_must_consp(rest, datum, $list_alt5);
                                    current_2 = rest.first();
                                    rest = rest.rest();
                                    destructuring_bind_must_consp(rest, datum, $list_alt5);
                                    if (NIL == member(current_2, $list_alt6, UNPROVIDED, UNPROVIDED)) {
                                        bad = T;
                                    }
                                    if (current_2 == $ALLOW_OTHER_KEYS) {
                                        allow_other_keys_p = rest.first();
                                    }
                                    rest = rest.rest();
                                }
                                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                    cdestructuring_bind_error(datum, $list_alt5);
                                }
                                {
                                    SubLObject type_tail = property_list_member($TYPE, current);
                                    SubLObject type = (NIL != type_tail) ? ((SubLObject) (cadr(type_tail))) : NIL;
                                    SubLObject mode_tail = property_list_member($MODE, current);
                                    SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $TEXT;
                                    current = temp_1;
                                    {
                                        SubLObject body = current;
                                        SubLTrampolineFile.checkType(mode, TCP_SERVER_MODE_P);
                                        return list(PROGN, define_tcp_server_internal(name, in_stream, out_stream, type, mode, body), list(REGISTER_TCP_SERVER_TYPE, list(QUOTE, type), list(QUOTE, name), list(QUOTE, mode)));
                                    }
                                }
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt5);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Define a TCP server handler function NAME whose only arguments
     * are IN-STREAM and OUT-STREAM and has BODY.
     * TYPE declares the server type that should use this handler.
     * MODE must be either :TEXT or :BINARY.
     */
    @LispMethod(comment = "Define a TCP server handler function NAME whose only arguments\r\nare IN-STREAM and OUT-STREAM and has BODY.\r\nTYPE declares the server type that should use this handler.\r\nMODE must be either :TEXT or :BINARY.\nDefine a TCP server handler function NAME whose only arguments\nare IN-STREAM and OUT-STREAM and has BODY.\nTYPE declares the server type that should use this handler.\nMODE must be either :TEXT or :BINARY.")
    public static SubLObject define_tcp_server(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject in_stream = NIL;
        SubLObject out_stream = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        in_stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        out_stream = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list5);
            return NIL;
        }
        current = temp;
        destructuring_bind_must_consp(current, datum, $list5);
        final SubLObject temp_$1 = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list5);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list5);
            if (NIL == member(current_$2, $list6, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list5);
        }
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
        final SubLObject mode_tail = property_list_member($MODE, current);
        final SubLObject mode = (NIL != mode_tail) ? cadr(mode_tail) : $TEXT;
        final SubLObject body;
        current = body = temp_$1;
        assert NIL != tcp_server_mode_p(mode) : "! tcp_server_utilities.tcp_server_mode_p(mode) " + ("tcp_server_utilities.tcp_server_mode_p(mode) " + "CommonSymbols.NIL != tcp_server_utilities.tcp_server_mode_p(mode) ") + mode;
        return list(PROGN, define_tcp_server_internal(name, in_stream, out_stream, type, mode, body), list(REGISTER_TCP_SERVER_TYPE, list(QUOTE, type), list(QUOTE, name), list(QUOTE, mode)));
    }

    /**
     * Enable a new TCP server of TYPE bound to PORT.
     * TYPE must have already been declared via DEFINE-TCP-SERVER.
     * Any TCP server currently bound to PORT is first disabled.
     */
    @LispMethod(comment = "Enable a new TCP server of TYPE bound to PORT.\r\nTYPE must have already been declared via DEFINE-TCP-SERVER.\r\nAny TCP server currently bound to PORT is first disabled.\nEnable a new TCP server of TYPE bound to PORT.\nTYPE must have already been declared via DEFINE-TCP-SERVER.\nAny TCP server currently bound to PORT is first disabled.")
    public static final SubLObject enable_tcp_server_alt(SubLObject type, SubLObject port) {
        SubLTrampolineFile.checkType(port, TCP_PORT_P);
        if (disable_tcp_server(port).numG(ZERO_INTEGER)) {
            sleep(ONE_INTEGER);
        }
        {
            SubLObject tcp_server = new_tcp_server(type, port);
            register_tcp_server(tcp_server);
            return tcp_server;
        }
    }

    /**
     * Enable a new TCP server of TYPE bound to PORT.
     * TYPE must have already been declared via DEFINE-TCP-SERVER.
     * Any TCP server currently bound to PORT is first disabled.
     */
    @LispMethod(comment = "Enable a new TCP server of TYPE bound to PORT.\r\nTYPE must have already been declared via DEFINE-TCP-SERVER.\r\nAny TCP server currently bound to PORT is first disabled.\nEnable a new TCP server of TYPE bound to PORT.\nTYPE must have already been declared via DEFINE-TCP-SERVER.\nAny TCP server currently bound to PORT is first disabled.")
    public static SubLObject enable_tcp_server(final SubLObject type, final SubLObject port) {
        assert NIL != tcp_port_p(port) : "! tcp_server_utilities.tcp_port_p(port) " + ("tcp_server_utilities.tcp_port_p(port) " + "CommonSymbols.NIL != tcp_server_utilities.tcp_port_p(port) ") + port;
        if (disable_tcp_server(port).numG(ZERO_INTEGER)) {
            sleep(ONE_INTEGER);
        }
        final SubLObject tcp_server = new_tcp_server(type, port);
        register_tcp_server(tcp_server);
        return tcp_server;
    }

    /**
     * Disable all TCP servers specified by DESIGNATOR.
     * Returns the total number of servers disabled.
     * If DESIGNATOR is a TCP-SERVER-P, disable that server.
     * If DESIGNATOR is a TCP-PORT-P, disable the server at that port.
     * Otherwise, disable all servers with DESIGNATOR as their type.
     */
    @LispMethod(comment = "Disable all TCP servers specified by DESIGNATOR.\r\nReturns the total number of servers disabled.\r\nIf DESIGNATOR is a TCP-SERVER-P, disable that server.\r\nIf DESIGNATOR is a TCP-PORT-P, disable the server at that port.\r\nOtherwise, disable all servers with DESIGNATOR as their type.\nDisable all TCP servers specified by DESIGNATOR.\nReturns the total number of servers disabled.\nIf DESIGNATOR is a TCP-SERVER-P, disable that server.\nIf DESIGNATOR is a TCP-PORT-P, disable the server at that port.\nOtherwise, disable all servers with DESIGNATOR as their type.")
    public static final SubLObject disable_tcp_server_alt(SubLObject designator) {
        if (NIL != tcp_server_p(designator)) {
            {
                SubLObject tcp_server = designator;
                deregister_tcp_server(tcp_server);
                free_tcp_server(tcp_server);
                return ONE_INTEGER;
            }
        } else {
            if (NIL != tcp_port_p(designator)) {
                {
                    SubLObject port = designator;
                    SubLObject tcp_server = find_tcp_server_by_port(port);
                    if (NIL != tcp_server) {
                        return disable_tcp_server(tcp_server);
                    }
                    return ZERO_INTEGER;
                }
            } else {
                {
                    SubLObject type = designator;
                    SubLObject total = ZERO_INTEGER;
                    SubLObject cdolist_list_var = all_tcp_servers();
                    SubLObject tcp_server = NIL;
                    for (tcp_server = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tcp_server = cdolist_list_var.first()) {
                        if (type == tcp_server_type(tcp_server)) {
                            total = add(total, disable_tcp_server(tcp_server));
                        }
                    }
                    return total;
                }
            }
        }
    }

    /**
     * Disable all TCP servers specified by DESIGNATOR.
     * Returns the total number of servers disabled.
     * If DESIGNATOR is a TCP-SERVER-P, disable that server.
     * If DESIGNATOR is a TCP-PORT-P, disable the server at that port.
     * Otherwise, disable all servers with DESIGNATOR as their type.
     */
    @LispMethod(comment = "Disable all TCP servers specified by DESIGNATOR.\r\nReturns the total number of servers disabled.\r\nIf DESIGNATOR is a TCP-SERVER-P, disable that server.\r\nIf DESIGNATOR is a TCP-PORT-P, disable the server at that port.\r\nOtherwise, disable all servers with DESIGNATOR as their type.\nDisable all TCP servers specified by DESIGNATOR.\nReturns the total number of servers disabled.\nIf DESIGNATOR is a TCP-SERVER-P, disable that server.\nIf DESIGNATOR is a TCP-PORT-P, disable the server at that port.\nOtherwise, disable all servers with DESIGNATOR as their type.")
    public static SubLObject disable_tcp_server(final SubLObject designator) {
        if (NIL != tcp_server_p(designator)) {
            deregister_tcp_server(designator);
            free_tcp_server(designator);
            return ONE_INTEGER;
        }
        if (NIL == tcp_port_p(designator)) {
            SubLObject total = ZERO_INTEGER;
            SubLObject cdolist_list_var = all_tcp_servers();
            SubLObject tcp_server = NIL;
            tcp_server = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (designator.eql(tcp_server_type(tcp_server))) {
                    total = add(total, disable_tcp_server(tcp_server));
                }
                cdolist_list_var = cdolist_list_var.rest();
                tcp_server = cdolist_list_var.first();
            } 
            return total;
        }
        final SubLObject tcp_server2 = find_tcp_server_by_port(designator);
        if (NIL != tcp_server2) {
            return disable_tcp_server(tcp_server2);
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject disable_all_tcp_servers_alt() {
        {
            SubLObject total = ZERO_INTEGER;
            SubLObject cdolist_list_var = all_tcp_servers();
            SubLObject tcp_server = NIL;
            for (tcp_server = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tcp_server = cdolist_list_var.first()) {
                total = add(total, disable_tcp_server(tcp_server));
            }
            return total;
        }
    }

    public static SubLObject disable_all_tcp_servers() {
        return disable_tcp_servers(all_tcp_servers());
    }

    public static SubLObject disable_tcp_servers(final SubLObject server_list) {
        SubLObject specs = NIL;
        SubLObject cdolist_list_var = server_list;
        SubLObject tcp_server = NIL;
        tcp_server = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            specs = cons(cons(tcp_server_type(tcp_server), tcp_server_port(tcp_server)), specs);
            disable_tcp_server(tcp_server);
            cdolist_list_var = cdolist_list_var.rest();
            tcp_server = cdolist_list_var.first();
        } 
        return specs;
    }

    public static SubLObject disable_some_tcp_servers(SubLObject leave_alones) {
        if (leave_alones == UNPROVIDED) {
            leave_alones = $list18;
        }
        final SubLObject servers = all_tcp_servers();
        SubLObject cdolist_list_var = leave_alones;
        SubLObject leave_alone = NIL;
        leave_alone = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            delete(leave_alone, servers, EQ, TCP_SERVER_TYPE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            leave_alone = cdolist_list_var.first();
        } 
        return disable_tcp_servers(servers);
    }

    public static SubLObject re_enable_disabled_tcp_servers(final SubLObject tcp_server_spec_list) {
        Mapping.mapcar(ENABLE_TCP_SERVER_SPEC, tcp_server_spec_list);
        return all_tcp_servers();
    }

    public static SubLObject enable_tcp_server_spec(final SubLObject tcp_server_spec) {
        SubLObject type = NIL;
        SubLObject port = NIL;
        destructuring_bind_must_consp(tcp_server_spec, tcp_server_spec, $list22);
        type = tcp_server_spec.first();
        final SubLObject current = port = tcp_server_spec.rest();
        enable_tcp_server(type, port);
        return type;
    }

    public static final SubLObject validate_all_tcp_servers_alt() {
        {
            SubLObject total = ZERO_INTEGER;
            SubLObject cdolist_list_var = all_tcp_servers();
            SubLObject tcp_server = NIL;
            for (tcp_server = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tcp_server = cdolist_list_var.first()) {
                if (NIL == valid_process_p(tcp_server_process(tcp_server))) {
                    total = add(total, disable_tcp_server(tcp_server));
                }
            }
            return total;
        }
    }

    public static SubLObject validate_all_tcp_servers() {
        SubLObject total = ZERO_INTEGER;
        SubLObject cdolist_list_var = all_tcp_servers();
        SubLObject tcp_server = NIL;
        tcp_server = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == valid_process_p(tcp_server_process(tcp_server))) {
                total = add(total, disable_tcp_server(tcp_server));
            }
            cdolist_list_var = cdolist_list_var.rest();
            tcp_server = cdolist_list_var.first();
        } 
        return total;
    }

    public static final SubLObject restart_all_tcp_servers_alt() {
        {
            SubLObject total = ZERO_INTEGER;
            SubLObject cdolist_list_var = all_tcp_servers();
            SubLObject tcp_server = NIL;
            for (tcp_server = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tcp_server = cdolist_list_var.first()) {
                {
                    SubLObject port = tcp_server_port(tcp_server);
                    SubLObject type = tcp_server_type(tcp_server);
                    disable_tcp_server(port);
                    sleep(ONE_INTEGER);
                    enable_tcp_server(type, port);
                }
                total = add(total, ONE_INTEGER);
            }
            return total;
        }
    }

    public static SubLObject restart_all_tcp_servers() {
        SubLObject total = ZERO_INTEGER;
        SubLObject cdolist_list_var = all_tcp_servers();
        SubLObject tcp_server = NIL;
        tcp_server = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject port = tcp_server_port(tcp_server);
            final SubLObject type = tcp_server_type(tcp_server);
            disable_tcp_server(port);
            sleep(ONE_INTEGER);
            enable_tcp_server(type, port);
            total = add(total, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            tcp_server = cdolist_list_var.first();
        } 
        return total;
    }

    public static SubLObject tcp_server_runningP(final SubLObject designator) {
        final SubLObject tcp_server = find(designator, all_tcp_servers(), symbol_function(EQ), TCP_SERVER_TYPE, UNPROVIDED, UNPROVIDED);
        return makeBoolean((NIL != tcp_server_p(tcp_server)) && ((designator == $SERVLET) || (NIL != valid_process_p(tcp_server_process(tcp_server)))));
    }

    public static final SubLObject tcp_server_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_tcp_server(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject tcp_server_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_tcp_server(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject tcp_server_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.tcp_server_utilities.$tcp_server_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject tcp_server_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.tcp_server_utilities.$tcp_server_native.class ? T : NIL;
    }

    public static final SubLObject tcps_type_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TCP_SERVER_P);
        return v_object.getField2();
    }

    public static SubLObject tcps_type(final SubLObject v_object) {
        assert NIL != tcp_server_p(v_object) : "! tcp_server_utilities.tcp_server_p(v_object) " + "tcp_server_utilities.tcp_server_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject tcps_port_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TCP_SERVER_P);
        return v_object.getField3();
    }

    public static SubLObject tcps_port(final SubLObject v_object) {
        assert NIL != tcp_server_p(v_object) : "! tcp_server_utilities.tcp_server_p(v_object) " + "tcp_server_utilities.tcp_server_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject tcps_process_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TCP_SERVER_P);
        return v_object.getField4();
    }

    public static SubLObject tcps_process(final SubLObject v_object) {
        assert NIL != tcp_server_p(v_object) : "! tcp_server_utilities.tcp_server_p(v_object) " + "tcp_server_utilities.tcp_server_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_tcps_type_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TCP_SERVER_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_tcps_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != tcp_server_p(v_object) : "! tcp_server_utilities.tcp_server_p(v_object) " + "tcp_server_utilities.tcp_server_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_tcps_port_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TCP_SERVER_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_tcps_port(final SubLObject v_object, final SubLObject value) {
        assert NIL != tcp_server_p(v_object) : "! tcp_server_utilities.tcp_server_p(v_object) " + "tcp_server_utilities.tcp_server_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_tcps_process_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TCP_SERVER_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_tcps_process(final SubLObject v_object, final SubLObject value) {
        assert NIL != tcp_server_p(v_object) : "! tcp_server_utilities.tcp_server_p(v_object) " + "tcp_server_utilities.tcp_server_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_tcp_server_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.tcp_server_utilities.$tcp_server_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($TYPE)) {
                        _csetf_tcps_type(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PORT)) {
                            _csetf_tcps_port(v_new, current_value);
                        } else {
                            if (pcase_var.eql($PROCESS)) {
                                _csetf_tcps_process(v_new, current_value);
                            } else {
                                Errors.error($str_alt32$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_tcp_server(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.tcp_server_utilities.$tcp_server_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TYPE)) {
                _csetf_tcps_type(v_new, current_value);
            } else
                if (pcase_var.eql($PORT)) {
                    _csetf_tcps_port(v_new, current_value);
                } else
                    if (pcase_var.eql($PROCESS)) {
                        _csetf_tcps_process(v_new, current_value);
                    } else {
                        Errors.error($str41$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_tcp_server(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TCP_SERVER, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TYPE, tcps_type(obj));
        funcall(visitor_fn, obj, $SLOT, $PORT, tcps_port(obj));
        funcall(visitor_fn, obj, $SLOT, $PROCESS, tcps_process(obj));
        funcall(visitor_fn, obj, $END, MAKE_TCP_SERVER, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_tcp_server_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_tcp_server(obj, visitor_fn);
    }

    public static final SubLObject print_tcp_server_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_3 = v_object;
                    SubLObject stream_4 = stream;
                    write_string($str_alt33$__, stream_4, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object_3), new SubLObject[]{ $STREAM, stream_4 });
                    write_char(CHAR_space, stream_4);
                    princ(tcps_port(v_object), stream);
                    princ($str_alt35$_, stream);
                    {
                        SubLObject type = tcps_type(v_object);
                        if (type.isKeyword()) {
                            princ(string_utilities.string_from_keyword(type), stream);
                        } else {
                            princ(type, stream);
                        }
                    }
                    write_char(CHAR_greater, stream_4);
                }
            }
            return v_object;
        }
    }

    public static SubLObject print_tcp_server(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            princ(tcps_port(v_object), stream);
            princ($str47$_, stream);
            final SubLObject type = tcps_type(v_object);
            if (type.isKeyword()) {
                princ(string_utilities.string_from_keyword(type), stream);
            } else {
                princ(type, stream);
            }
            print_macros.print_unreadable_object_postamble(stream, v_object, NIL, NIL);
        }
        return v_object;
    }

    /**
     * Return the type of TCP-SERVER.
     */
    @LispMethod(comment = "Return the type of TCP-SERVER.")
    public static final SubLObject tcp_server_type_alt(SubLObject tcp_server) {
        SubLTrampolineFile.checkType(tcp_server, TCP_SERVER_P);
        return tcps_type(tcp_server);
    }

    /**
     * Return the type of TCP-SERVER.
     */
    @LispMethod(comment = "Return the type of TCP-SERVER.")
    public static SubLObject tcp_server_type(final SubLObject tcp_server) {
        assert NIL != tcp_server_p(tcp_server) : "! tcp_server_utilities.tcp_server_p(tcp_server) " + ("tcp_server_utilities.tcp_server_p(tcp_server) " + "CommonSymbols.NIL != tcp_server_utilities.tcp_server_p(tcp_server) ") + tcp_server;
        return tcps_type(tcp_server);
    }

    /**
     * Return the port of TCP-SERVER, or NIL if disabled.
     */
    @LispMethod(comment = "Return the port of TCP-SERVER, or NIL if disabled.")
    public static final SubLObject tcp_server_port_alt(SubLObject tcp_server) {
        SubLTrampolineFile.checkType(tcp_server, TCP_SERVER_P);
        return tcps_port(tcp_server);
    }

    /**
     * Return the port of TCP-SERVER, or NIL if disabled.
     */
    @LispMethod(comment = "Return the port of TCP-SERVER, or NIL if disabled.")
    public static SubLObject tcp_server_port(final SubLObject tcp_server) {
        assert NIL != tcp_server_p(tcp_server) : "! tcp_server_utilities.tcp_server_p(tcp_server) " + ("tcp_server_utilities.tcp_server_p(tcp_server) " + "CommonSymbols.NIL != tcp_server_utilities.tcp_server_p(tcp_server) ") + tcp_server;
        return tcps_port(tcp_server);
    }

    /**
     * Return the server process of TCP-SERVER, or NIL if disabled.
     */
    @LispMethod(comment = "Return the server process of TCP-SERVER, or NIL if disabled.")
    public static final SubLObject tcp_server_process_alt(SubLObject tcp_server) {
        SubLTrampolineFile.checkType(tcp_server, TCP_SERVER_P);
        return tcps_process(tcp_server);
    }

    /**
     * Return the server process of TCP-SERVER, or NIL if disabled.
     */
    @LispMethod(comment = "Return the server process of TCP-SERVER, or NIL if disabled.")
    public static SubLObject tcp_server_process(final SubLObject tcp_server) {
        assert NIL != tcp_server_p(tcp_server) : "! tcp_server_utilities.tcp_server_p(tcp_server) " + ("tcp_server_utilities.tcp_server_p(tcp_server) " + "CommonSymbols.NIL != tcp_server_utilities.tcp_server_p(tcp_server) ") + tcp_server;
        return tcps_process(tcp_server);
    }

    public static final SubLObject new_tcp_server_alt(SubLObject type, SubLObject port) {
        {
            SubLObject handler = tcp_server_type_handler(type);
            SubLObject tcps = make_tcp_server(UNPROVIDED);
            _csetf_tcps_type(tcps, type);
            _csetf_tcps_port(tcps, port);
            _csetf_tcps_process(tcps, start_tcp_server_process(type, port, handler));
            return tcps;
        }
    }

    public static SubLObject new_tcp_server(final SubLObject type, final SubLObject port) {
        final SubLObject handler = tcp_server_type_handler(type);
        final SubLObject tcps = make_tcp_server(UNPROVIDED);
        _csetf_tcps_type(tcps, type);
        _csetf_tcps_port(tcps, port);
        _csetf_tcps_process(tcps, start_tcp_server_process(type, port, handler));
        return tcps;
    }

    public static final SubLObject free_tcp_server_alt(SubLObject tcp_server) {
        SubLTrampolineFile.checkType(tcp_server, TCP_SERVER_P);
        halt_tcp_server(tcp_server);
        _csetf_tcps_port(tcp_server, NIL);
        _csetf_tcps_process(tcp_server, NIL);
        return NIL;
    }

    public static SubLObject free_tcp_server(final SubLObject tcp_server) {
        assert NIL != tcp_server_p(tcp_server) : "! tcp_server_utilities.tcp_server_p(tcp_server) " + ("tcp_server_utilities.tcp_server_p(tcp_server) " + "CommonSymbols.NIL != tcp_server_utilities.tcp_server_p(tcp_server) ") + tcp_server;
        halt_tcp_server(tcp_server);
        _csetf_tcps_port(tcp_server, NIL);
        _csetf_tcps_process(tcp_server, NIL);
        return NIL;
    }

    /**
     * Return the TCP server running at PORT, or NIL if none.
     */
    @LispMethod(comment = "Return the TCP server running at PORT, or NIL if none.")
    public static final SubLObject find_tcp_server_by_port_alt(SubLObject port) {
        SubLTrampolineFile.checkType(port, TCP_PORT_P);
        return find(port, $all_tcp_servers$.getGlobalValue(), symbol_function(EQL), symbol_function(TCP_SERVER_PORT), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return the TCP server running at PORT, or NIL if none.
     */
    @LispMethod(comment = "Return the TCP server running at PORT, or NIL if none.")
    public static SubLObject find_tcp_server_by_port(final SubLObject port) {
        assert NIL != tcp_port_p(port) : "! tcp_server_utilities.tcp_port_p(port) " + ("tcp_server_utilities.tcp_port_p(port) " + "CommonSymbols.NIL != tcp_server_utilities.tcp_port_p(port) ") + port;
        return find(port, $all_tcp_servers$.getGlobalValue(), symbol_function(EQL), symbol_function(TCP_SERVER_PORT), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return a list of all TCP servers that are currently enabled.
     */
    @LispMethod(comment = "Return a list of all TCP servers that are currently enabled.")
    public static final SubLObject all_tcp_servers_alt() {
        return copy_list($all_tcp_servers$.getGlobalValue());
    }

    /**
     * Return a list of all TCP servers that are currently enabled.
     */
    @LispMethod(comment = "Return a list of all TCP servers that are currently enabled.")
    public static SubLObject all_tcp_servers() {
        return copy_list($all_tcp_servers$.getGlobalValue());
    }

    public static final SubLObject register_tcp_server_alt(SubLObject tcp_server) {
        {
            SubLObject lock = $tcp_server_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                $all_tcp_servers$.setGlobalValue(cons(tcp_server, $all_tcp_servers$.getGlobalValue()));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return tcp_server;
    }

    public static SubLObject register_tcp_server(final SubLObject tcp_server) {
        SubLObject release = NIL;
        try {
            release = seize_lock($tcp_server_lock$.getGlobalValue());
            $all_tcp_servers$.setGlobalValue(cons(tcp_server, $all_tcp_servers$.getGlobalValue()));
        } finally {
            if (NIL != release) {
                release_lock($tcp_server_lock$.getGlobalValue());
            }
        }
        return tcp_server;
    }

    public static final SubLObject deregister_tcp_server_alt(SubLObject tcp_server) {
        {
            SubLObject lock = $tcp_server_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                $all_tcp_servers$.setGlobalValue(delete(tcp_server, $all_tcp_servers$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return tcp_server;
    }

    public static SubLObject deregister_tcp_server(final SubLObject tcp_server) {
        SubLObject release = NIL;
        try {
            release = seize_lock($tcp_server_lock$.getGlobalValue());
            $all_tcp_servers$.setGlobalValue(delete(tcp_server, $all_tcp_servers$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($tcp_server_lock$.getGlobalValue());
            }
        }
        return tcp_server;
    }

    /**
     * Register that TCP servers of TYPE use HANDLER with MODE.
     */
    @LispMethod(comment = "Register that TCP servers of TYPE use HANDLER with MODE.")
    public static final SubLObject register_tcp_server_type_alt(SubLObject type, SubLObject handler, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        SubLTrampolineFile.checkType(handler, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(mode, TCP_SERVER_MODE_P);
        deregister_tcp_server_type(type);
        {
            SubLObject lock = $tcp_server_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                $tcp_server_type_table$.setGlobalValue(cons(list(type, handler, mode), $tcp_server_type_table$.getGlobalValue()));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return type;
    }

    /**
     * Register that TCP servers of TYPE use HANDLER with MODE.
     */
    @LispMethod(comment = "Register that TCP servers of TYPE use HANDLER with MODE.")
    public static SubLObject register_tcp_server_type(final SubLObject type, final SubLObject handler, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        assert NIL != tcp_server_handler_p(handler) : "! tcp_server_utilities.tcp_server_handler_p(handler) " + ("tcp_server_utilities.tcp_server_handler_p(handler) " + "CommonSymbols.NIL != tcp_server_utilities.tcp_server_handler_p(handler) ") + handler;
        assert NIL != tcp_server_mode_p(mode) : "! tcp_server_utilities.tcp_server_mode_p(mode) " + ("tcp_server_utilities.tcp_server_mode_p(mode) " + "CommonSymbols.NIL != tcp_server_utilities.tcp_server_mode_p(mode) ") + mode;
        deregister_tcp_server_type(type);
        SubLObject release = NIL;
        try {
            release = seize_lock($tcp_server_lock$.getGlobalValue());
            $tcp_server_type_table$.setGlobalValue(cons(list(type, handler, mode), $tcp_server_type_table$.getGlobalValue()));
        } finally {
            if (NIL != release) {
                release_lock($tcp_server_lock$.getGlobalValue());
            }
        }
        return type;
    }

    public static SubLObject tcp_server_handler_p(final SubLObject v_object) {
        return makeBoolean(v_object.isFunctionSpec() || (NIL != external_tcp_server_handler_p(v_object)));
    }

    public static SubLObject external_tcp_server_handler_p(final SubLObject v_object) {
        return makeBoolean(((v_object.isList() && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && ($EXTERNAL == v_object.first())) && second(v_object).isFunctionSpec());
    }

    public static final SubLObject deregister_tcp_server_type_alt(SubLObject type) {
        {
            SubLObject lock = $tcp_server_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                $tcp_server_type_table$.setGlobalValue(delete(type, $tcp_server_type_table$.getGlobalValue(), symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return type;
    }

    public static SubLObject deregister_tcp_server_type(final SubLObject type) {
        SubLObject release = NIL;
        try {
            release = seize_lock($tcp_server_lock$.getGlobalValue());
            $tcp_server_type_table$.setGlobalValue(delete(type, $tcp_server_type_table$.getGlobalValue(), symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($tcp_server_lock$.getGlobalValue());
            }
        }
        return type;
    }

    public static final SubLObject tcp_server_type_handler_alt(SubLObject type) {
        return second(find(type, $tcp_server_type_table$.getGlobalValue(), symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject tcp_server_type_handler(final SubLObject type) {
        return second(find(type, $tcp_server_type_table$.getGlobalValue(), symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject tcp_server_type_mode_alt(SubLObject type) {
        return third(find(type, $tcp_server_type_table$.getGlobalValue(), symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject tcp_server_type_mode(final SubLObject type) {
        return third(find(type, $tcp_server_type_table$.getGlobalValue(), symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED));
    }

    /**
     * Macro expansion method for defining TCP server functions.
     */
    @LispMethod(comment = "Macro expansion method for defining TCP server functions.")
    public static final SubLObject define_tcp_server_internal_alt(SubLObject name, SubLObject in_stream, SubLObject out_stream, SubLObject type, SubLObject mode, SubLObject body) {
        return list(PROGN, listS(DEFINE, name, list(in_stream, out_stream), append(body, NIL)));
    }

    /**
     * Macro expansion method for defining TCP server functions.
     */
    @LispMethod(comment = "Macro expansion method for defining TCP server functions.")
    public static SubLObject define_tcp_server_internal(final SubLObject name, final SubLObject in_stream, final SubLObject out_stream, final SubLObject type, final SubLObject mode, final SubLObject body) {
        return list(PROGN, listS(DEFINE, name, list(in_stream, out_stream), append(body, NIL)));
    }

    /**
     * Method for starting a new TCP server of TYPE at PORT which has HANDLER.
     */
    @LispMethod(comment = "Method for starting a new TCP server of TYPE at PORT which has HANDLER.")
    public static final SubLObject start_tcp_server_process_alt(SubLObject type, SubLObject port, SubLObject handler) {
        {
            SubLObject server_process = NIL;
            server_process = funcall(START_TCP_SERVER, port, handler);
            return server_process;
        }
    }

    /**
     * Method for starting a new TCP server of TYPE at PORT which has HANDLER.
     */
    @LispMethod(comment = "Method for starting a new TCP server of TYPE at PORT which has HANDLER.")
    public static SubLObject start_tcp_server_process(final SubLObject type, final SubLObject port, final SubLObject handler) {
        if (NIL != external_tcp_server_handler_p(handler)) {
            return funcall(second(handler), port);
        }
        return funcall(START_TCP_SERVER, port, handler);
    }

    /**
     * Method for halting the TCP server process in TCP-SERVER.
     */
    @LispMethod(comment = "Method for halting the TCP server process in TCP-SERVER.")
    public static final SubLObject halt_tcp_server_alt(SubLObject tcp_server) {
        {
            SubLObject port = tcp_server_port(tcp_server);
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            funcall(STOP_TCP_SERVER, port);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
            return T;
        }
    }

    /**
     * Method for halting the TCP server process in TCP-SERVER.
     */
    @LispMethod(comment = "Method for halting the TCP server process in TCP-SERVER.")
    public static SubLObject halt_tcp_server(final SubLObject tcp_server) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject process = tcp_server_process(tcp_server);
        if (NIL != os_process_utilities.os_process_p(process)) {
            os_process_utilities.destroy_os_process(process);
            return T;
        }
        final SubLObject port = tcp_server_port(tcp_server);
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    funcall(STOP_TCP_SERVER, port);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return T;
    }

    public static SubLObject declare_tcp_server_utilities_file() {
        declareMacro("with_tcp_server_lock", "WITH-TCP-SERVER-LOCK");
        declareFunction("tcp_port_p", "TCP-PORT-P", 1, 0, false);
        declareFunction("tcp_server_mode_p", "TCP-SERVER-MODE-P", 1, 0, false);
        declareMacro("define_tcp_server", "DEFINE-TCP-SERVER");
        declareFunction("enable_tcp_server", "ENABLE-TCP-SERVER", 2, 0, false);
        declareFunction("disable_tcp_server", "DISABLE-TCP-SERVER", 1, 0, false);
        declareFunction("disable_all_tcp_servers", "DISABLE-ALL-TCP-SERVERS", 0, 0, false);
        declareFunction("disable_tcp_servers", "DISABLE-TCP-SERVERS", 1, 0, false);
        declareFunction("disable_some_tcp_servers", "DISABLE-SOME-TCP-SERVERS", 0, 1, false);
        declareFunction("re_enable_disabled_tcp_servers", "RE-ENABLE-DISABLED-TCP-SERVERS", 1, 0, false);
        declareFunction("enable_tcp_server_spec", "ENABLE-TCP-SERVER-SPEC", 1, 0, false);
        declareFunction("validate_all_tcp_servers", "VALIDATE-ALL-TCP-SERVERS", 0, 0, false);
        declareFunction("restart_all_tcp_servers", "RESTART-ALL-TCP-SERVERS", 0, 0, false);
        declareFunction("tcp_server_runningP", "TCP-SERVER-RUNNING?", 1, 0, false);
        declareFunction("tcp_server_print_function_trampoline", "TCP-SERVER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("tcp_server_p", "TCP-SERVER-P", 1, 0, false);
        new tcp_server_utilities.$tcp_server_p$UnaryFunction();
        declareFunction("tcps_type", "TCPS-TYPE", 1, 0, false);
        declareFunction("tcps_port", "TCPS-PORT", 1, 0, false);
        declareFunction("tcps_process", "TCPS-PROCESS", 1, 0, false);
        declareFunction("_csetf_tcps_type", "_CSETF-TCPS-TYPE", 2, 0, false);
        declareFunction("_csetf_tcps_port", "_CSETF-TCPS-PORT", 2, 0, false);
        declareFunction("_csetf_tcps_process", "_CSETF-TCPS-PROCESS", 2, 0, false);
        declareFunction("make_tcp_server", "MAKE-TCP-SERVER", 0, 1, false);
        declareFunction("visit_defstruct_tcp_server", "VISIT-DEFSTRUCT-TCP-SERVER", 2, 0, false);
        declareFunction("visit_defstruct_object_tcp_server_method", "VISIT-DEFSTRUCT-OBJECT-TCP-SERVER-METHOD", 2, 0, false);
        declareFunction("print_tcp_server", "PRINT-TCP-SERVER", 3, 0, false);
        declareFunction("tcp_server_type", "TCP-SERVER-TYPE", 1, 0, false);
        declareFunction("tcp_server_port", "TCP-SERVER-PORT", 1, 0, false);
        declareFunction("tcp_server_process", "TCP-SERVER-PROCESS", 1, 0, false);
        declareFunction("new_tcp_server", "NEW-TCP-SERVER", 2, 0, false);
        declareFunction("free_tcp_server", "FREE-TCP-SERVER", 1, 0, false);
        declareFunction("find_tcp_server_by_port", "FIND-TCP-SERVER-BY-PORT", 1, 0, false);
        declareFunction("all_tcp_servers", "ALL-TCP-SERVERS", 0, 0, false);
        declareFunction("register_tcp_server", "REGISTER-TCP-SERVER", 1, 0, false);
        declareFunction("deregister_tcp_server", "DEREGISTER-TCP-SERVER", 1, 0, false);
        declareFunction("register_tcp_server_type", "REGISTER-TCP-SERVER-TYPE", 2, 1, false);
        declareFunction("tcp_server_handler_p", "TCP-SERVER-HANDLER-P", 1, 0, false);
        declareFunction("external_tcp_server_handler_p", "EXTERNAL-TCP-SERVER-HANDLER-P", 1, 0, false);
        declareFunction("deregister_tcp_server_type", "DEREGISTER-TCP-SERVER-TYPE", 1, 0, false);
        declareFunction("tcp_server_type_handler", "TCP-SERVER-TYPE-HANDLER", 1, 0, false);
        declareFunction("tcp_server_type_mode", "TCP-SERVER-TYPE-MODE", 1, 0, false);
        declareFunction("define_tcp_server_internal", "DEFINE-TCP-SERVER-INTERNAL", 6, 0, false);
        declareFunction("start_tcp_server_process", "START-TCP-SERVER-PROCESS", 3, 0, false);
        declareFunction("halt_tcp_server", "HALT-TCP-SERVER", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("*TCP-SERVER-LOCK*"));

    static private final SubLList $list_alt4 = list($TEXT, makeKeyword("BINARY"));

    static private final SubLList $list_alt5 = list(makeSymbol("NAME"), list(makeSymbol("IN-STREAM"), makeSymbol("OUT-STREAM")), list(makeSymbol("&KEY"), makeSymbol("TYPE"), list(makeSymbol("MODE"), $TEXT)), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt6 = list($TYPE, $MODE);

    static private final SubLList $list_alt18 = list(makeSymbol("TYPE"), makeSymbol("PORT"), makeSymbol("PROCESS"));

    static private final SubLList $list_alt19 = list($TYPE, $PORT, makeKeyword("PROCESS"));

    static private final SubLList $list_alt20 = list(makeSymbol("TCPS-TYPE"), makeSymbol("TCPS-PORT"), makeSymbol("TCPS-PROCESS"));

    static private final SubLList $list_alt21 = list(makeSymbol("_CSETF-TCPS-TYPE"), makeSymbol("_CSETF-TCPS-PORT"), makeSymbol("_CSETF-TCPS-PROCESS"));

    static private final SubLString $str_alt32$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt33$__ = makeString("#<");

    static private final SubLString $str_alt35$_ = makeString("/");

    public static final SubLObject init_tcp_server_utilities_file_alt() {
        deflexical("*TCP-SERVER-LOCK*", make_lock($$$TCP_Server_Lock));
        Tcp.$remote_address$ = defparameter("*REMOTE-ADDRESS*", NIL);
        Tcp.$remote_hostname$ = defparameter("*REMOTE-HOSTNAME*", NIL);
        defconstant("*DTP-TCP-SERVER*", TCP_SERVER);
        deflexical("*ALL-TCP-SERVERS*", NIL != boundp($all_tcp_servers$) ? ((SubLObject) ($all_tcp_servers$.getGlobalValue())) : NIL);
        deflexical("*TCP-SERVER-TYPE-TABLE*", NIL != boundp($tcp_server_type_table$) ? ((SubLObject) ($tcp_server_type_table$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static SubLObject init_tcp_server_utilities_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*TCP-SERVER-LOCK*", make_lock($$$TCP_Server_Lock));
            Tcp.$remote_address$ = defparameter("*REMOTE-ADDRESS*", NIL);
            Tcp.$remote_hostname$ = defparameter("*REMOTE-HOSTNAME*", NIL);
            defconstant("*DTP-TCP-SERVER*", TCP_SERVER);
            deflexical("*ALL-TCP-SERVERS*", SubLTrampolineFile.maybeDefault($all_tcp_servers$, $all_tcp_servers$, NIL));
            deflexical("*TCP-SERVER-TYPE-TABLE*", SubLTrampolineFile.maybeDefault($tcp_server_type_table$, $tcp_server_type_table$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*ALL-TCP-SERVERS*", NIL != boundp($all_tcp_servers$) ? ((SubLObject) ($all_tcp_servers$.getGlobalValue())) : NIL);
            deflexical("*TCP-SERVER-TYPE-TABLE*", NIL != boundp($tcp_server_type_table$) ? ((SubLObject) ($tcp_server_type_table$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_tcp_server_utilities_file_Previous() {
        deflexical("*TCP-SERVER-LOCK*", make_lock($$$TCP_Server_Lock));
        Tcp.$remote_address$ = defparameter("*REMOTE-ADDRESS*", NIL);
        Tcp.$remote_hostname$ = defparameter("*REMOTE-HOSTNAME*", NIL);
        defconstant("*DTP-TCP-SERVER*", TCP_SERVER);
        deflexical("*ALL-TCP-SERVERS*", SubLTrampolineFile.maybeDefault($all_tcp_servers$, $all_tcp_servers$, NIL));
        deflexical("*TCP-SERVER-TYPE-TABLE*", SubLTrampolineFile.maybeDefault($tcp_server_type_table$, $tcp_server_type_table$, NIL));
        return NIL;
    }

    public static SubLObject setup_tcp_server_utilities_file() {
        register_external_symbol(DISABLE_ALL_TCP_SERVERS);
        register_external_symbol(DISABLE_SOME_TCP_SERVERS);
        register_external_symbol(RE_ENABLE_DISABLED_TCP_SERVERS);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_tcp_server$.getGlobalValue(), symbol_function(TCP_SERVER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list32);
        def_csetf(TCPS_TYPE, _CSETF_TCPS_TYPE);
        def_csetf(TCPS_PORT, _CSETF_TCPS_PORT);
        def_csetf(TCPS_PROCESS, _CSETF_TCPS_PROCESS);
        identity(TCP_SERVER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_tcp_server$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TCP_SERVER_METHOD));
        declare_defglobal($all_tcp_servers$);
        declare_defglobal($tcp_server_type_table$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_tcp_server_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_tcp_server_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_tcp_server_utilities_file();
    }

    static {
        $remote_address$ = null;
        $remote_hostname$ = null;
    }

    public static final class $tcp_server_native extends SubLStructNative {
        public SubLObject $type;

        public SubLObject $port;

        public SubLObject $process;

        private static final SubLStructDeclNative structDecl;

        public $tcp_server_native() {
            tcp_server_utilities.$tcp_server_native.this.$type = Lisp.NIL;
            tcp_server_utilities.$tcp_server_native.this.$port = Lisp.NIL;
            tcp_server_utilities.$tcp_server_native.this.$process = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return tcp_server_utilities.$tcp_server_native.this.$type;
        }

        @Override
        public SubLObject getField3() {
            return tcp_server_utilities.$tcp_server_native.this.$port;
        }

        @Override
        public SubLObject getField4() {
            return tcp_server_utilities.$tcp_server_native.this.$process;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return tcp_server_utilities.$tcp_server_native.this.$type = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return tcp_server_utilities.$tcp_server_native.this.$port = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return tcp_server_utilities.$tcp_server_native.this.$process = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.tcp_server_utilities.$tcp_server_native.class, TCP_SERVER, TCP_SERVER_P, $list26, $list27, new String[]{ "$type", "$port", "$process" }, $list28, $list29, PRINT_TCP_SERVER);
        }
    }

    public static final class $tcp_server_p$UnaryFunction extends UnaryFunction {
        public $tcp_server_p$UnaryFunction() {
            super(extractFunctionNamed("TCP-SERVER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return tcp_server_p(arg1);
        }
    }
}

/**
 * Total time: 335 ms
 */
