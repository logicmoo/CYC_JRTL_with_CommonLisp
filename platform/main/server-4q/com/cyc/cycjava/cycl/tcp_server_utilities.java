package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class tcp_server_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new tcp_server_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.tcp_server_utilities";

    public static final String myFingerPrint = "4a1faaa23a66ac049f6772b65d72f22d342cfd67a8621d43b9664c82a28ae375";

    // deflexical
    private static final SubLSymbol $tcp_server_lock$ = makeSymbol("*TCP-SERVER-LOCK*");

    // @TODO assignPaths == 0 ??
    /**
     * Within a TCP server handler, this is bound to an integer representing the
     * socket's remote machine IP address.
     */
    public static transient final SubLSymbol $remote_address$;

    // @TODO assignPaths == 0 ??
    /**
     * Within a TCP server handler, this is bound to a string representing the
     * socket's remote machine hostname
     */
    public static transient final SubLSymbol $remote_hostname$;

    // defconstant
    public static final SubLSymbol $dtp_tcp_server$ = makeSymbol("*DTP-TCP-SERVER*");





    // Internal Constants
    public static final SubLString $$$TCP_Server_Lock = makeString("TCP Server Lock");



    public static final SubLList $list2 = list(makeSymbol("*TCP-SERVER-LOCK*"));

    private static final SubLInteger $int$65535 = makeInteger(65535);

    public static final SubLList $list4 = list(makeKeyword("TEXT"), makeKeyword("BINARY"));

    public static final SubLList $list5 = list(makeSymbol("NAME"), list(makeSymbol("IN-STREAM"), makeSymbol("OUT-STREAM")), list(makeSymbol("&KEY"), makeSymbol("TYPE"), list(makeSymbol("MODE"), makeKeyword("TEXT"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list6 = list(makeKeyword("TYPE"), makeKeyword("MODE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");







    public static final SubLSymbol TCP_SERVER_MODE_P = makeSymbol("TCP-SERVER-MODE-P");



    public static final SubLSymbol REGISTER_TCP_SERVER_TYPE = makeSymbol("REGISTER-TCP-SERVER-TYPE");



    public static final SubLSymbol TCP_PORT_P = makeSymbol("TCP-PORT-P");

    private static final SubLSymbol DISABLE_ALL_TCP_SERVERS = makeSymbol("DISABLE-ALL-TCP-SERVERS");

    private static final SubLSymbol DISABLE_SOME_TCP_SERVERS = makeSymbol("DISABLE-SOME-TCP-SERVERS");

    public static final SubLList $list18 = list(makeKeyword("CYC-API"));

    private static final SubLSymbol TCP_SERVER_TYPE = makeSymbol("TCP-SERVER-TYPE");

    private static final SubLSymbol RE_ENABLE_DISABLED_TCP_SERVERS = makeSymbol("RE-ENABLE-DISABLED-TCP-SERVERS");

    private static final SubLSymbol ENABLE_TCP_SERVER_SPEC = makeSymbol("ENABLE-TCP-SERVER-SPEC");

    private static final SubLList $list22 = cons(makeSymbol("TYPE"), makeSymbol("PORT"));



    private static final SubLSymbol TCP_SERVER = makeSymbol("TCP-SERVER");

    private static final SubLSymbol TCP_SERVER_P = makeSymbol("TCP-SERVER-P");

    private static final SubLList $list26 = list(makeSymbol("TYPE"), makeSymbol("PORT"), makeSymbol("PROCESS"));

    private static final SubLList $list27 = list(makeKeyword("TYPE"), makeKeyword("PORT"), makeKeyword("PROCESS"));

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

    public static SubLObject with_tcp_server_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_LOCK_HELD, $list2, append(body, NIL));
    }

    public static SubLObject tcp_port_p(final SubLObject v_object) {
        return makeBoolean((v_object.isFixnum() && ZERO_INTEGER.numLE(v_object)) && v_object.numLE($int$65535));
    }

    public static SubLObject tcp_server_mode_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $list4, UNPROVIDED, UNPROVIDED);
    }

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
        assert NIL != tcp_server_mode_p(mode) : "tcp_server_utilities.tcp_server_mode_p(mode) " + "CommonSymbols.NIL != tcp_server_utilities.tcp_server_mode_p(mode) " + mode;
        return list(PROGN, define_tcp_server_internal(name, in_stream, out_stream, type, mode, body), list(REGISTER_TCP_SERVER_TYPE, list(QUOTE, type), list(QUOTE, name), list(QUOTE, mode)));
    }

    public static SubLObject enable_tcp_server(final SubLObject type, final SubLObject port) {
        assert NIL != tcp_port_p(port) : "tcp_server_utilities.tcp_port_p(port) " + "CommonSymbols.NIL != tcp_server_utilities.tcp_port_p(port) " + port;
        if (disable_tcp_server(port).numG(ZERO_INTEGER)) {
            sleep(ONE_INTEGER);
        }
        final SubLObject tcp_server = new_tcp_server(type, port);
        register_tcp_server(tcp_server);
        return tcp_server;
    }

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

    public static SubLObject tcp_server_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_tcp_server(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject tcp_server_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$tcp_server_native.class ? T : NIL;
    }

    public static SubLObject tcps_type(final SubLObject v_object) {
        assert NIL != tcp_server_p(v_object) : "tcp_server_utilities.tcp_server_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject tcps_port(final SubLObject v_object) {
        assert NIL != tcp_server_p(v_object) : "tcp_server_utilities.tcp_server_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject tcps_process(final SubLObject v_object) {
        assert NIL != tcp_server_p(v_object) : "tcp_server_utilities.tcp_server_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_tcps_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != tcp_server_p(v_object) : "tcp_server_utilities.tcp_server_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_tcps_port(final SubLObject v_object, final SubLObject value) {
        assert NIL != tcp_server_p(v_object) : "tcp_server_utilities.tcp_server_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_tcps_process(final SubLObject v_object, final SubLObject value) {
        assert NIL != tcp_server_p(v_object) : "tcp_server_utilities.tcp_server_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_tcp_server(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $tcp_server_native();
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

    public static SubLObject tcp_server_type(final SubLObject tcp_server) {
        assert NIL != tcp_server_p(tcp_server) : "tcp_server_utilities.tcp_server_p(tcp_server) " + "CommonSymbols.NIL != tcp_server_utilities.tcp_server_p(tcp_server) " + tcp_server;
        return tcps_type(tcp_server);
    }

    public static SubLObject tcp_server_port(final SubLObject tcp_server) {
        assert NIL != tcp_server_p(tcp_server) : "tcp_server_utilities.tcp_server_p(tcp_server) " + "CommonSymbols.NIL != tcp_server_utilities.tcp_server_p(tcp_server) " + tcp_server;
        return tcps_port(tcp_server);
    }

    public static SubLObject tcp_server_process(final SubLObject tcp_server) {
        assert NIL != tcp_server_p(tcp_server) : "tcp_server_utilities.tcp_server_p(tcp_server) " + "CommonSymbols.NIL != tcp_server_utilities.tcp_server_p(tcp_server) " + tcp_server;
        return tcps_process(tcp_server);
    }

    public static SubLObject new_tcp_server(final SubLObject type, final SubLObject port) {
        final SubLObject handler = tcp_server_type_handler(type);
        final SubLObject tcps = make_tcp_server(UNPROVIDED);
        _csetf_tcps_type(tcps, type);
        _csetf_tcps_port(tcps, port);
        _csetf_tcps_process(tcps, start_tcp_server_process(type, port, handler));
        return tcps;
    }

    public static SubLObject free_tcp_server(final SubLObject tcp_server) {
        assert NIL != tcp_server_p(tcp_server) : "tcp_server_utilities.tcp_server_p(tcp_server) " + "CommonSymbols.NIL != tcp_server_utilities.tcp_server_p(tcp_server) " + tcp_server;
        halt_tcp_server(tcp_server);
        _csetf_tcps_port(tcp_server, NIL);
        _csetf_tcps_process(tcp_server, NIL);
        return NIL;
    }

    public static SubLObject find_tcp_server_by_port(final SubLObject port) {
        assert NIL != tcp_port_p(port) : "tcp_server_utilities.tcp_port_p(port) " + "CommonSymbols.NIL != tcp_server_utilities.tcp_port_p(port) " + port;
        return find(port, $all_tcp_servers$.getGlobalValue(), symbol_function(EQL), symbol_function(TCP_SERVER_PORT), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_tcp_servers() {
        return copy_list($all_tcp_servers$.getGlobalValue());
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

    public static SubLObject register_tcp_server_type(final SubLObject type, final SubLObject handler, SubLObject mode) {
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        assert NIL != tcp_server_handler_p(handler) : "tcp_server_utilities.tcp_server_handler_p(handler) " + "CommonSymbols.NIL != tcp_server_utilities.tcp_server_handler_p(handler) " + handler;
        assert NIL != tcp_server_mode_p(mode) : "tcp_server_utilities.tcp_server_mode_p(mode) " + "CommonSymbols.NIL != tcp_server_utilities.tcp_server_mode_p(mode) " + mode;
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

    public static SubLObject tcp_server_type_handler(final SubLObject type) {
        return second(find(type, $tcp_server_type_table$.getGlobalValue(), symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject tcp_server_type_mode(final SubLObject type) {
        return third(find(type, $tcp_server_type_table$.getGlobalValue(), symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject define_tcp_server_internal(final SubLObject name, final SubLObject in_stream, final SubLObject out_stream, final SubLObject type, final SubLObject mode, final SubLObject body) {
        return list(PROGN, listS(DEFINE, name, list(in_stream, out_stream), append(body, NIL)));
    }

    public static SubLObject start_tcp_server_process(final SubLObject type, final SubLObject port, final SubLObject handler) {
        if (NIL != external_tcp_server_handler_p(handler)) {
            return funcall(second(handler), port);
        }
        return funcall(START_TCP_SERVER, port, handler);
    }

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
        declareMacro(me, "with_tcp_server_lock", "WITH-TCP-SERVER-LOCK");
        declareFunction(me, "tcp_port_p", "TCP-PORT-P", 1, 0, false);
        declareFunction(me, "tcp_server_mode_p", "TCP-SERVER-MODE-P", 1, 0, false);
        declareMacro(me, "define_tcp_server", "DEFINE-TCP-SERVER");
        declareFunction(me, "enable_tcp_server", "ENABLE-TCP-SERVER", 2, 0, false);
        declareFunction(me, "disable_tcp_server", "DISABLE-TCP-SERVER", 1, 0, false);
        declareFunction(me, "disable_all_tcp_servers", "DISABLE-ALL-TCP-SERVERS", 0, 0, false);
        declareFunction(me, "disable_tcp_servers", "DISABLE-TCP-SERVERS", 1, 0, false);
        declareFunction(me, "disable_some_tcp_servers", "DISABLE-SOME-TCP-SERVERS", 0, 1, false);
        declareFunction(me, "re_enable_disabled_tcp_servers", "RE-ENABLE-DISABLED-TCP-SERVERS", 1, 0, false);
        declareFunction(me, "enable_tcp_server_spec", "ENABLE-TCP-SERVER-SPEC", 1, 0, false);
        declareFunction(me, "validate_all_tcp_servers", "VALIDATE-ALL-TCP-SERVERS", 0, 0, false);
        declareFunction(me, "restart_all_tcp_servers", "RESTART-ALL-TCP-SERVERS", 0, 0, false);
        declareFunction(me, "tcp_server_runningP", "TCP-SERVER-RUNNING?", 1, 0, false);
        declareFunction(me, "tcp_server_print_function_trampoline", "TCP-SERVER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "tcp_server_p", "TCP-SERVER-P", 1, 0, false);
        new tcp_server_utilities.$tcp_server_p$UnaryFunction();
        declareFunction(me, "tcps_type", "TCPS-TYPE", 1, 0, false);
        declareFunction(me, "tcps_port", "TCPS-PORT", 1, 0, false);
        declareFunction(me, "tcps_process", "TCPS-PROCESS", 1, 0, false);
        declareFunction(me, "_csetf_tcps_type", "_CSETF-TCPS-TYPE", 2, 0, false);
        declareFunction(me, "_csetf_tcps_port", "_CSETF-TCPS-PORT", 2, 0, false);
        declareFunction(me, "_csetf_tcps_process", "_CSETF-TCPS-PROCESS", 2, 0, false);
        declareFunction(me, "make_tcp_server", "MAKE-TCP-SERVER", 0, 1, false);
        declareFunction(me, "visit_defstruct_tcp_server", "VISIT-DEFSTRUCT-TCP-SERVER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_tcp_server_method", "VISIT-DEFSTRUCT-OBJECT-TCP-SERVER-METHOD", 2, 0, false);
        declareFunction(me, "print_tcp_server", "PRINT-TCP-SERVER", 3, 0, false);
        declareFunction(me, "tcp_server_type", "TCP-SERVER-TYPE", 1, 0, false);
        declareFunction(me, "tcp_server_port", "TCP-SERVER-PORT", 1, 0, false);
        declareFunction(me, "tcp_server_process", "TCP-SERVER-PROCESS", 1, 0, false);
        declareFunction(me, "new_tcp_server", "NEW-TCP-SERVER", 2, 0, false);
        declareFunction(me, "free_tcp_server", "FREE-TCP-SERVER", 1, 0, false);
        declareFunction(me, "find_tcp_server_by_port", "FIND-TCP-SERVER-BY-PORT", 1, 0, false);
        declareFunction(me, "all_tcp_servers", "ALL-TCP-SERVERS", 0, 0, false);
        declareFunction(me, "register_tcp_server", "REGISTER-TCP-SERVER", 1, 0, false);
        declareFunction(me, "deregister_tcp_server", "DEREGISTER-TCP-SERVER", 1, 0, false);
        declareFunction(me, "register_tcp_server_type", "REGISTER-TCP-SERVER-TYPE", 2, 1, false);
        declareFunction(me, "tcp_server_handler_p", "TCP-SERVER-HANDLER-P", 1, 0, false);
        declareFunction(me, "external_tcp_server_handler_p", "EXTERNAL-TCP-SERVER-HANDLER-P", 1, 0, false);
        declareFunction(me, "deregister_tcp_server_type", "DEREGISTER-TCP-SERVER-TYPE", 1, 0, false);
        declareFunction(me, "tcp_server_type_handler", "TCP-SERVER-TYPE-HANDLER", 1, 0, false);
        declareFunction(me, "tcp_server_type_mode", "TCP-SERVER-TYPE-MODE", 1, 0, false);
        declareFunction(me, "define_tcp_server_internal", "DEFINE-TCP-SERVER-INTERNAL", 6, 0, false);
        declareFunction(me, "start_tcp_server_process", "START-TCP-SERVER-PROCESS", 3, 0, false);
        declareFunction(me, "halt_tcp_server", "HALT-TCP-SERVER", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_tcp_server_utilities_file() {
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

        private $tcp_server_native() {
            this.$type = Lisp.NIL;
            this.$port = Lisp.NIL;
            this.$process = Lisp.NIL;
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
            return this.$port;
        }

        @Override
        public SubLObject getField4() {
            return this.$process;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$port = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$process = value;
        }

        static {
            structDecl = makeStructDeclNative($tcp_server_native.class, TCP_SERVER, TCP_SERVER_P, $list26, $list27, new String[]{ "$type", "$port", "$process" }, $list28, $list29, PRINT_TCP_SERVER);
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
