package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Tcp;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class tcp_server_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.tcp_server_utilities";
    public static final String myFingerPrint = "4a1faaa23a66ac049f6772b65d72f22d342cfd67a8621d43b9664c82a28ae375";
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 1455L)
    private static SubLSymbol $tcp_server_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 1643L)
    public static SubLSymbol $remote_address$;
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 1850L)
    public static SubLSymbol $remote_hostname$;
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 6830L)
    public static SubLSymbol $dtp_tcp_server$;
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 8479L)
    private static SubLSymbol $all_tcp_servers$;
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 9284L)
    private static SubLSymbol $tcp_server_type_table$;
    private static final SubLString $str0$TCP_Server_Lock;
    private static final SubLSymbol $sym1$WITH_LOCK_HELD;
    private static final SubLList $list2;
    private static final SubLInteger $int3$65535;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw8$TYPE;
    private static final SubLSymbol $kw9$MODE;
    private static final SubLSymbol $kw10$TEXT;
    private static final SubLSymbol $sym11$TCP_SERVER_MODE_P;
    private static final SubLSymbol $sym12$PROGN;
    private static final SubLSymbol $sym13$REGISTER_TCP_SERVER_TYPE;
    private static final SubLSymbol $sym14$QUOTE;
    private static final SubLSymbol $sym15$TCP_PORT_P;
    private static final SubLSymbol $sym16$DISABLE_ALL_TCP_SERVERS;
    private static final SubLSymbol $sym17$DISABLE_SOME_TCP_SERVERS;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$TCP_SERVER_TYPE;
    private static final SubLSymbol $sym20$RE_ENABLE_DISABLED_TCP_SERVERS;
    private static final SubLSymbol $sym21$ENABLE_TCP_SERVER_SPEC;
    private static final SubLList $list22;
    private static final SubLSymbol $kw23$SERVLET;
    private static final SubLSymbol $sym24$TCP_SERVER;
    private static final SubLSymbol $sym25$TCP_SERVER_P;
    private static final SubLList $list26;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$PRINT_TCP_SERVER;
    private static final SubLSymbol $sym31$TCP_SERVER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$TCPS_TYPE;
    private static final SubLSymbol $sym34$_CSETF_TCPS_TYPE;
    private static final SubLSymbol $sym35$TCPS_PORT;
    private static final SubLSymbol $sym36$_CSETF_TCPS_PORT;
    private static final SubLSymbol $sym37$TCPS_PROCESS;
    private static final SubLSymbol $sym38$_CSETF_TCPS_PROCESS;
    private static final SubLSymbol $kw39$PORT;
    private static final SubLSymbol $kw40$PROCESS;
    private static final SubLString $str41$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw42$BEGIN;
    private static final SubLSymbol $sym43$MAKE_TCP_SERVER;
    private static final SubLSymbol $kw44$SLOT;
    private static final SubLSymbol $kw45$END;
    private static final SubLSymbol $sym46$VISIT_DEFSTRUCT_OBJECT_TCP_SERVER_METHOD;
    private static final SubLString $str47$_;
    private static final SubLSymbol $sym48$_ALL_TCP_SERVERS_;
    private static final SubLSymbol $sym49$TCP_SERVER_PORT;
    private static final SubLSymbol $sym50$_TCP_SERVER_TYPE_TABLE_;
    private static final SubLSymbol $sym51$TCP_SERVER_HANDLER_P;
    private static final SubLSymbol $kw52$EXTERNAL;
    private static final SubLSymbol $sym53$FIRST;
    private static final SubLSymbol $sym54$DEFINE;
    private static final SubLSymbol $sym55$START_TCP_SERVER;
    private static final SubLSymbol $kw56$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym57$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $sym58$STOP_TCP_SERVER;
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 1533L)
    public static SubLObject with_tcp_server_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)tcp_server_utilities.$sym1$WITH_LOCK_HELD, (SubLObject)tcp_server_utilities.$list2, ConsesLow.append(body, (SubLObject)tcp_server_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 2053L)
    public static SubLObject tcp_port_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isFixnum() && tcp_server_utilities.ZERO_INTEGER.numLE(v_object) && v_object.numLE((SubLObject)tcp_server_utilities.$int3$65535));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 2268L)
    public static SubLObject tcp_server_mode_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, (SubLObject)tcp_server_utilities.$list4, (SubLObject)tcp_server_utilities.UNPROVIDED, (SubLObject)tcp_server_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 2408L)
    public static SubLObject define_tcp_server(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)tcp_server_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tcp_server_utilities.$list5);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tcp_server_utilities.$list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject in_stream = (SubLObject)tcp_server_utilities.NIL;
        SubLObject out_stream = (SubLObject)tcp_server_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tcp_server_utilities.$list5);
        in_stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tcp_server_utilities.$list5);
        out_stream = current.first();
        current = current.rest();
        if (tcp_server_utilities.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tcp_server_utilities.$list5);
            return (SubLObject)tcp_server_utilities.NIL;
        }
        current = temp;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)tcp_server_utilities.$list5);
        final SubLObject temp_$1 = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)tcp_server_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)tcp_server_utilities.NIL;
        SubLObject current_$2 = (SubLObject)tcp_server_utilities.NIL;
        while (tcp_server_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)tcp_server_utilities.$list5);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)tcp_server_utilities.$list5);
            if (tcp_server_utilities.NIL == conses_high.member(current_$2, (SubLObject)tcp_server_utilities.$list6, (SubLObject)tcp_server_utilities.UNPROVIDED, (SubLObject)tcp_server_utilities.UNPROVIDED)) {
                bad = (SubLObject)tcp_server_utilities.T;
            }
            if (current_$2 == tcp_server_utilities.$kw7$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (tcp_server_utilities.NIL != bad && tcp_server_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)tcp_server_utilities.$list5);
        }
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)tcp_server_utilities.$kw8$TYPE, current);
        final SubLObject type = (SubLObject)((tcp_server_utilities.NIL != type_tail) ? conses_high.cadr(type_tail) : tcp_server_utilities.NIL);
        final SubLObject mode_tail = cdestructuring_bind.property_list_member((SubLObject)tcp_server_utilities.$kw9$MODE, current);
        final SubLObject mode = (SubLObject)((tcp_server_utilities.NIL != mode_tail) ? conses_high.cadr(mode_tail) : tcp_server_utilities.$kw10$TEXT);
        final SubLObject body;
        current = (body = temp_$1);
        assert tcp_server_utilities.NIL != tcp_server_mode_p(mode) : mode;
        return (SubLObject)ConsesLow.list((SubLObject)tcp_server_utilities.$sym12$PROGN, define_tcp_server_internal(name, in_stream, out_stream, type, mode, body), (SubLObject)ConsesLow.list((SubLObject)tcp_server_utilities.$sym13$REGISTER_TCP_SERVER_TYPE, (SubLObject)ConsesLow.list((SubLObject)tcp_server_utilities.$sym14$QUOTE, type), (SubLObject)ConsesLow.list((SubLObject)tcp_server_utilities.$sym14$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)tcp_server_utilities.$sym14$QUOTE, mode)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 3003L)
    public static SubLObject enable_tcp_server(final SubLObject type, final SubLObject port) {
        assert tcp_server_utilities.NIL != tcp_port_p(port) : port;
        if (disable_tcp_server(port).numG((SubLObject)tcp_server_utilities.ZERO_INTEGER)) {
            Threads.sleep((SubLObject)tcp_server_utilities.ONE_INTEGER);
        }
        final SubLObject tcp_server = new_tcp_server(type, port);
        register_tcp_server(tcp_server);
        return tcp_server;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 3570L)
    public static SubLObject disable_tcp_server(final SubLObject designator) {
        if (tcp_server_utilities.NIL != tcp_server_p(designator)) {
            deregister_tcp_server(designator);
            free_tcp_server(designator);
            return (SubLObject)tcp_server_utilities.ONE_INTEGER;
        }
        if (tcp_server_utilities.NIL == tcp_port_p(designator)) {
            SubLObject total = (SubLObject)tcp_server_utilities.ZERO_INTEGER;
            SubLObject cdolist_list_var = all_tcp_servers();
            SubLObject tcp_server = (SubLObject)tcp_server_utilities.NIL;
            tcp_server = cdolist_list_var.first();
            while (tcp_server_utilities.NIL != cdolist_list_var) {
                if (designator.eql(tcp_server_type(tcp_server))) {
                    total = Numbers.add(total, disable_tcp_server(tcp_server));
                }
                cdolist_list_var = cdolist_list_var.rest();
                tcp_server = cdolist_list_var.first();
            }
            return total;
        }
        final SubLObject tcp_server2 = find_tcp_server_by_port(designator);
        if (tcp_server_utilities.NIL != tcp_server2) {
            return disable_tcp_server(tcp_server2);
        }
        return (SubLObject)tcp_server_utilities.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 4605L)
    public static SubLObject disable_all_tcp_servers() {
        return disable_tcp_servers(all_tcp_servers());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 4699L)
    public static SubLObject disable_tcp_servers(final SubLObject server_list) {
        SubLObject specs = (SubLObject)tcp_server_utilities.NIL;
        SubLObject cdolist_list_var = server_list;
        SubLObject tcp_server = (SubLObject)tcp_server_utilities.NIL;
        tcp_server = cdolist_list_var.first();
        while (tcp_server_utilities.NIL != cdolist_list_var) {
            specs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(tcp_server_type(tcp_server), tcp_server_port(tcp_server)), specs);
            disable_tcp_server(tcp_server);
            cdolist_list_var = cdolist_list_var.rest();
            tcp_server = cdolist_list_var.first();
        }
        return specs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 4946L)
    public static SubLObject disable_some_tcp_servers(SubLObject leave_alones) {
        if (leave_alones == tcp_server_utilities.UNPROVIDED) {
            leave_alones = (SubLObject)tcp_server_utilities.$list18;
        }
        final SubLObject servers = all_tcp_servers();
        SubLObject cdolist_list_var = leave_alones;
        SubLObject leave_alone = (SubLObject)tcp_server_utilities.NIL;
        leave_alone = cdolist_list_var.first();
        while (tcp_server_utilities.NIL != cdolist_list_var) {
            Sequences.delete(leave_alone, servers, (SubLObject)tcp_server_utilities.EQ, (SubLObject)tcp_server_utilities.$sym19$TCP_SERVER_TYPE, (SubLObject)tcp_server_utilities.UNPROVIDED, (SubLObject)tcp_server_utilities.UNPROVIDED, (SubLObject)tcp_server_utilities.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            leave_alone = cdolist_list_var.first();
        }
        return disable_tcp_servers(servers);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 5343L)
    public static SubLObject re_enable_disabled_tcp_servers(final SubLObject tcp_server_spec_list) {
        Mapping.mapcar((SubLObject)tcp_server_utilities.$sym21$ENABLE_TCP_SERVER_SPEC, tcp_server_spec_list);
        return all_tcp_servers();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 5589L)
    public static SubLObject enable_tcp_server_spec(final SubLObject tcp_server_spec) {
        SubLObject type = (SubLObject)tcp_server_utilities.NIL;
        SubLObject port = (SubLObject)tcp_server_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(tcp_server_spec, tcp_server_spec, (SubLObject)tcp_server_utilities.$list22);
        type = tcp_server_spec.first();
        final SubLObject current = port = tcp_server_spec.rest();
        enable_tcp_server(type, port);
        return type;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 5757L)
    public static SubLObject validate_all_tcp_servers() {
        SubLObject total = (SubLObject)tcp_server_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var = all_tcp_servers();
        SubLObject tcp_server = (SubLObject)tcp_server_utilities.NIL;
        tcp_server = cdolist_list_var.first();
        while (tcp_server_utilities.NIL != cdolist_list_var) {
            if (tcp_server_utilities.NIL == Threads.valid_process_p(tcp_server_process(tcp_server))) {
                total = Numbers.add(total, disable_tcp_server(tcp_server));
            }
            cdolist_list_var = cdolist_list_var.rest();
            tcp_server = cdolist_list_var.first();
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 5999L)
    public static SubLObject restart_all_tcp_servers() {
        SubLObject total = (SubLObject)tcp_server_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var = all_tcp_servers();
        SubLObject tcp_server = (SubLObject)tcp_server_utilities.NIL;
        tcp_server = cdolist_list_var.first();
        while (tcp_server_utilities.NIL != cdolist_list_var) {
            final SubLObject port = tcp_server_port(tcp_server);
            final SubLObject type = tcp_server_type(tcp_server);
            disable_tcp_server(port);
            Threads.sleep((SubLObject)tcp_server_utilities.ONE_INTEGER);
            enable_tcp_server(type, port);
            total = Numbers.add(total, (SubLObject)tcp_server_utilities.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            tcp_server = cdolist_list_var.first();
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 6356L)
    public static SubLObject tcp_server_runningP(final SubLObject designator) {
        final SubLObject tcp_server = Sequences.find(designator, all_tcp_servers(), Symbols.symbol_function((SubLObject)tcp_server_utilities.EQ), (SubLObject)tcp_server_utilities.$sym19$TCP_SERVER_TYPE, (SubLObject)tcp_server_utilities.UNPROVIDED, (SubLObject)tcp_server_utilities.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(tcp_server_utilities.NIL != tcp_server_p(tcp_server) && (designator == tcp_server_utilities.$kw23$SERVLET || tcp_server_utilities.NIL != Threads.valid_process_p(tcp_server_process(tcp_server))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 6830L)
    public static SubLObject tcp_server_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_tcp_server(v_object, stream, (SubLObject)tcp_server_utilities.ZERO_INTEGER);
        return (SubLObject)tcp_server_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 6830L)
    public static SubLObject tcp_server_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $tcp_server_native.class) ? tcp_server_utilities.T : tcp_server_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 6830L)
    public static SubLObject tcps_type(final SubLObject v_object) {
        assert tcp_server_utilities.NIL != tcp_server_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 6830L)
    public static SubLObject tcps_port(final SubLObject v_object) {
        assert tcp_server_utilities.NIL != tcp_server_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 6830L)
    public static SubLObject tcps_process(final SubLObject v_object) {
        assert tcp_server_utilities.NIL != tcp_server_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 6830L)
    public static SubLObject _csetf_tcps_type(final SubLObject v_object, final SubLObject value) {
        assert tcp_server_utilities.NIL != tcp_server_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 6830L)
    public static SubLObject _csetf_tcps_port(final SubLObject v_object, final SubLObject value) {
        assert tcp_server_utilities.NIL != tcp_server_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 6830L)
    public static SubLObject _csetf_tcps_process(final SubLObject v_object, final SubLObject value) {
        assert tcp_server_utilities.NIL != tcp_server_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 6830L)
    public static SubLObject make_tcp_server(SubLObject arglist) {
        if (arglist == tcp_server_utilities.UNPROVIDED) {
            arglist = (SubLObject)tcp_server_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $tcp_server_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)tcp_server_utilities.NIL, next = arglist; tcp_server_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)tcp_server_utilities.$kw8$TYPE)) {
                _csetf_tcps_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tcp_server_utilities.$kw39$PORT)) {
                _csetf_tcps_port(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)tcp_server_utilities.$kw40$PROCESS)) {
                _csetf_tcps_process(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)tcp_server_utilities.$str41$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 6830L)
    public static SubLObject visit_defstruct_tcp_server(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)tcp_server_utilities.$kw42$BEGIN, (SubLObject)tcp_server_utilities.$sym43$MAKE_TCP_SERVER, (SubLObject)tcp_server_utilities.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)tcp_server_utilities.$kw44$SLOT, (SubLObject)tcp_server_utilities.$kw8$TYPE, tcps_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tcp_server_utilities.$kw44$SLOT, (SubLObject)tcp_server_utilities.$kw39$PORT, tcps_port(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tcp_server_utilities.$kw44$SLOT, (SubLObject)tcp_server_utilities.$kw40$PROCESS, tcps_process(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)tcp_server_utilities.$kw45$END, (SubLObject)tcp_server_utilities.$sym43$MAKE_TCP_SERVER, (SubLObject)tcp_server_utilities.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 6830L)
    public static SubLObject visit_defstruct_object_tcp_server_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_tcp_server(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 6994L)
    public static SubLObject print_tcp_server(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tcp_server_utilities.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)tcp_server_utilities.T, (SubLObject)tcp_server_utilities.T);
            print_high.princ(tcps_port(v_object), stream);
            print_high.princ((SubLObject)tcp_server_utilities.$str47$_, stream);
            final SubLObject type = tcps_type(v_object);
            if (type.isKeyword()) {
                print_high.princ(string_utilities.string_from_keyword(type), stream);
            }
            else {
                print_high.princ(type, stream);
            }
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)tcp_server_utilities.NIL, (SubLObject)tcp_server_utilities.NIL);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 7435L)
    public static SubLObject tcp_server_type(final SubLObject tcp_server) {
        assert tcp_server_utilities.NIL != tcp_server_p(tcp_server) : tcp_server;
        return tcps_type(tcp_server);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 7587L)
    public static SubLObject tcp_server_port(final SubLObject tcp_server) {
        assert tcp_server_utilities.NIL != tcp_server_p(tcp_server) : tcp_server;
        return tcps_port(tcp_server);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 7758L)
    public static SubLObject tcp_server_process(final SubLObject tcp_server) {
        assert tcp_server_utilities.NIL != tcp_server_p(tcp_server) : tcp_server;
        return tcps_process(tcp_server);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 7945L)
    public static SubLObject new_tcp_server(final SubLObject type, final SubLObject port) {
        final SubLObject handler = tcp_server_type_handler(type);
        final SubLObject tcps = make_tcp_server((SubLObject)tcp_server_utilities.UNPROVIDED);
        _csetf_tcps_type(tcps, type);
        _csetf_tcps_port(tcps, port);
        _csetf_tcps_process(tcps, start_tcp_server_process(type, port, handler));
        return tcps;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 8247L)
    public static SubLObject free_tcp_server(final SubLObject tcp_server) {
        assert tcp_server_utilities.NIL != tcp_server_p(tcp_server) : tcp_server;
        halt_tcp_server(tcp_server);
        _csetf_tcps_port(tcp_server, (SubLObject)tcp_server_utilities.NIL);
        _csetf_tcps_process(tcp_server, (SubLObject)tcp_server_utilities.NIL);
        return (SubLObject)tcp_server_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 8597L)
    public static SubLObject find_tcp_server_by_port(final SubLObject port) {
        assert tcp_server_utilities.NIL != tcp_port_p(port) : port;
        return Sequences.find(port, tcp_server_utilities.$all_tcp_servers$.getGlobalValue(), Symbols.symbol_function((SubLObject)tcp_server_utilities.EQL), Symbols.symbol_function((SubLObject)tcp_server_utilities.$sym49$TCP_SERVER_PORT), (SubLObject)tcp_server_utilities.UNPROVIDED, (SubLObject)tcp_server_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 8797L)
    public static SubLObject all_tcp_servers() {
        return conses_high.copy_list(tcp_server_utilities.$all_tcp_servers$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 8936L)
    public static SubLObject register_tcp_server(final SubLObject tcp_server) {
        SubLObject release = (SubLObject)tcp_server_utilities.NIL;
        try {
            release = Locks.seize_lock(tcp_server_utilities.$tcp_server_lock$.getGlobalValue());
            tcp_server_utilities.$all_tcp_servers$.setGlobalValue((SubLObject)ConsesLow.cons(tcp_server, tcp_server_utilities.$all_tcp_servers$.getGlobalValue()));
        }
        finally {
            if (tcp_server_utilities.NIL != release) {
                Locks.release_lock(tcp_server_utilities.$tcp_server_lock$.getGlobalValue());
            }
        }
        return tcp_server;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 9115L)
    public static SubLObject deregister_tcp_server(final SubLObject tcp_server) {
        SubLObject release = (SubLObject)tcp_server_utilities.NIL;
        try {
            release = Locks.seize_lock(tcp_server_utilities.$tcp_server_lock$.getGlobalValue());
            tcp_server_utilities.$all_tcp_servers$.setGlobalValue(Sequences.delete(tcp_server, tcp_server_utilities.$all_tcp_servers$.getGlobalValue(), (SubLObject)tcp_server_utilities.UNPROVIDED, (SubLObject)tcp_server_utilities.UNPROVIDED, (SubLObject)tcp_server_utilities.UNPROVIDED, (SubLObject)tcp_server_utilities.UNPROVIDED, (SubLObject)tcp_server_utilities.UNPROVIDED));
        }
        finally {
            if (tcp_server_utilities.NIL != release) {
                Locks.release_lock(tcp_server_utilities.$tcp_server_lock$.getGlobalValue());
            }
        }
        return tcp_server;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 9401L)
    public static SubLObject register_tcp_server_type(final SubLObject type, final SubLObject handler, SubLObject mode) {
        if (mode == tcp_server_utilities.UNPROVIDED) {
            mode = (SubLObject)tcp_server_utilities.$kw10$TEXT;
        }
        assert tcp_server_utilities.NIL != tcp_server_handler_p(handler) : handler;
        assert tcp_server_utilities.NIL != tcp_server_mode_p(mode) : mode;
        deregister_tcp_server_type(type);
        SubLObject release = (SubLObject)tcp_server_utilities.NIL;
        try {
            release = Locks.seize_lock(tcp_server_utilities.$tcp_server_lock$.getGlobalValue());
            tcp_server_utilities.$tcp_server_type_table$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(type, handler, mode), tcp_server_utilities.$tcp_server_type_table$.getGlobalValue()));
        }
        finally {
            if (tcp_server_utilities.NIL != release) {
                Locks.release_lock(tcp_server_utilities.$tcp_server_lock$.getGlobalValue());
            }
        }
        return type;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 9762L)
    public static SubLObject tcp_server_handler_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isFunctionSpec() || tcp_server_utilities.NIL != external_tcp_server_handler_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 9907L)
    public static SubLObject external_tcp_server_handler_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isList() && tcp_server_utilities.NIL != list_utilities.lengthE(v_object, (SubLObject)tcp_server_utilities.TWO_INTEGER, (SubLObject)tcp_server_utilities.UNPROVIDED) && tcp_server_utilities.$kw52$EXTERNAL == v_object.first() && conses_high.second(v_object).isFunctionSpec());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 10099L)
    public static SubLObject deregister_tcp_server_type(final SubLObject type) {
        SubLObject release = (SubLObject)tcp_server_utilities.NIL;
        try {
            release = Locks.seize_lock(tcp_server_utilities.$tcp_server_lock$.getGlobalValue());
            tcp_server_utilities.$tcp_server_type_table$.setGlobalValue(Sequences.delete(type, tcp_server_utilities.$tcp_server_type_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)tcp_server_utilities.EQL), Symbols.symbol_function((SubLObject)tcp_server_utilities.$sym53$FIRST), (SubLObject)tcp_server_utilities.UNPROVIDED, (SubLObject)tcp_server_utilities.UNPROVIDED, (SubLObject)tcp_server_utilities.UNPROVIDED));
        }
        finally {
            if (tcp_server_utilities.NIL != release) {
                Locks.release_lock(tcp_server_utilities.$tcp_server_lock$.getGlobalValue());
            }
        }
        return type;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 10281L)
    public static SubLObject tcp_server_type_handler(final SubLObject type) {
        return conses_high.second(Sequences.find(type, tcp_server_utilities.$tcp_server_type_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)tcp_server_utilities.EQL), Symbols.symbol_function((SubLObject)tcp_server_utilities.$sym53$FIRST), (SubLObject)tcp_server_utilities.UNPROVIDED, (SubLObject)tcp_server_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 10397L)
    public static SubLObject tcp_server_type_mode(final SubLObject type) {
        return conses_high.third(Sequences.find(type, tcp_server_utilities.$tcp_server_type_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)tcp_server_utilities.EQL), Symbols.symbol_function((SubLObject)tcp_server_utilities.$sym53$FIRST), (SubLObject)tcp_server_utilities.UNPROVIDED, (SubLObject)tcp_server_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 10509L)
    public static SubLObject define_tcp_server_internal(final SubLObject name, final SubLObject in_stream, final SubLObject out_stream, final SubLObject type, final SubLObject mode, final SubLObject body) {
        return (SubLObject)ConsesLow.list((SubLObject)tcp_server_utilities.$sym12$PROGN, (SubLObject)ConsesLow.listS((SubLObject)tcp_server_utilities.$sym54$DEFINE, name, (SubLObject)ConsesLow.list(in_stream, out_stream), ConsesLow.append(body, (SubLObject)tcp_server_utilities.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 11218L)
    public static SubLObject start_tcp_server_process(final SubLObject type, final SubLObject port, final SubLObject handler) {
        if (tcp_server_utilities.NIL != external_tcp_server_handler_p(handler)) {
            return Functions.funcall(conses_high.second(handler), port);
        }
        return Functions.funcall((SubLObject)tcp_server_utilities.$sym55$START_TCP_SERVER, port, handler);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/tcp-server-utilities.lisp", position = 11604L)
    public static SubLObject halt_tcp_server(final SubLObject tcp_server) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject process = tcp_server_process(tcp_server);
        if (tcp_server_utilities.NIL != os_process_utilities.os_process_p(process)) {
            os_process_utilities.destroy_os_process(process);
            return (SubLObject)tcp_server_utilities.T;
        }
        final SubLObject port = tcp_server_port(tcp_server);
        SubLObject ignore_errors_tag = (SubLObject)tcp_server_utilities.NIL;
        try {
            thread.throwStack.push(tcp_server_utilities.$kw56$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)tcp_server_utilities.$sym57$IGNORE_ERRORS_HANDLER), thread);
                try {
                    Functions.funcall((SubLObject)tcp_server_utilities.$sym58$STOP_TCP_SERVER, port);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)tcp_server_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)tcp_server_utilities.$kw56$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)tcp_server_utilities.T;
    }
    
    public static SubLObject declare_tcp_server_utilities_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.tcp_server_utilities", "with_tcp_server_lock", "WITH-TCP-SERVER-LOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "tcp_port_p", "TCP-PORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "tcp_server_mode_p", "TCP-SERVER-MODE-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.tcp_server_utilities", "define_tcp_server", "DEFINE-TCP-SERVER");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "enable_tcp_server", "ENABLE-TCP-SERVER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "disable_tcp_server", "DISABLE-TCP-SERVER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "disable_all_tcp_servers", "DISABLE-ALL-TCP-SERVERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "disable_tcp_servers", "DISABLE-TCP-SERVERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "disable_some_tcp_servers", "DISABLE-SOME-TCP-SERVERS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "re_enable_disabled_tcp_servers", "RE-ENABLE-DISABLED-TCP-SERVERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "enable_tcp_server_spec", "ENABLE-TCP-SERVER-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "validate_all_tcp_servers", "VALIDATE-ALL-TCP-SERVERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "restart_all_tcp_servers", "RESTART-ALL-TCP-SERVERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "tcp_server_runningP", "TCP-SERVER-RUNNING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "tcp_server_print_function_trampoline", "TCP-SERVER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "tcp_server_p", "TCP-SERVER-P", 1, 0, false);
        new $tcp_server_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "tcps_type", "TCPS-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "tcps_port", "TCPS-PORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "tcps_process", "TCPS-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "_csetf_tcps_type", "_CSETF-TCPS-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "_csetf_tcps_port", "_CSETF-TCPS-PORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "_csetf_tcps_process", "_CSETF-TCPS-PROCESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "make_tcp_server", "MAKE-TCP-SERVER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "visit_defstruct_tcp_server", "VISIT-DEFSTRUCT-TCP-SERVER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "visit_defstruct_object_tcp_server_method", "VISIT-DEFSTRUCT-OBJECT-TCP-SERVER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "print_tcp_server", "PRINT-TCP-SERVER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "tcp_server_type", "TCP-SERVER-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "tcp_server_port", "TCP-SERVER-PORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "tcp_server_process", "TCP-SERVER-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "new_tcp_server", "NEW-TCP-SERVER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "free_tcp_server", "FREE-TCP-SERVER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "find_tcp_server_by_port", "FIND-TCP-SERVER-BY-PORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "all_tcp_servers", "ALL-TCP-SERVERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "register_tcp_server", "REGISTER-TCP-SERVER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "deregister_tcp_server", "DEREGISTER-TCP-SERVER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "register_tcp_server_type", "REGISTER-TCP-SERVER-TYPE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "tcp_server_handler_p", "TCP-SERVER-HANDLER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "external_tcp_server_handler_p", "EXTERNAL-TCP-SERVER-HANDLER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "deregister_tcp_server_type", "DEREGISTER-TCP-SERVER-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "tcp_server_type_handler", "TCP-SERVER-TYPE-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "tcp_server_type_mode", "TCP-SERVER-TYPE-MODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "define_tcp_server_internal", "DEFINE-TCP-SERVER-INTERNAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "start_tcp_server_process", "START-TCP-SERVER-PROCESS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.tcp_server_utilities", "halt_tcp_server", "HALT-TCP-SERVER", 1, 0, false);
        return (SubLObject)tcp_server_utilities.NIL;
    }
    
    public static SubLObject init_tcp_server_utilities_file() {
        tcp_server_utilities.$tcp_server_lock$ = SubLFiles.deflexical("*TCP-SERVER-LOCK*", Locks.make_lock((SubLObject)tcp_server_utilities.$str0$TCP_Server_Lock));
        Tcp.$remote_address$ = SubLFiles.defparameter("*REMOTE-ADDRESS*", (SubLObject)tcp_server_utilities.NIL);
        Tcp.$remote_hostname$ = SubLFiles.defparameter("*REMOTE-HOSTNAME*", (SubLObject)tcp_server_utilities.NIL);
        tcp_server_utilities.$dtp_tcp_server$ = SubLFiles.defconstant("*DTP-TCP-SERVER*", (SubLObject)tcp_server_utilities.$sym24$TCP_SERVER);
        tcp_server_utilities.$all_tcp_servers$ = SubLFiles.deflexical("*ALL-TCP-SERVERS*", (SubLObject)(maybeDefault((SubLObject)tcp_server_utilities.$sym48$_ALL_TCP_SERVERS_, tcp_server_utilities.$all_tcp_servers$, tcp_server_utilities.NIL)));
        tcp_server_utilities.$tcp_server_type_table$ = SubLFiles.deflexical("*TCP-SERVER-TYPE-TABLE*", (SubLObject)(maybeDefault((SubLObject)tcp_server_utilities.$sym50$_TCP_SERVER_TYPE_TABLE_, tcp_server_utilities.$tcp_server_type_table$, tcp_server_utilities.NIL)));
        return (SubLObject)tcp_server_utilities.NIL;
    }
    
    public static SubLObject setup_tcp_server_utilities_file() {
        access_macros.register_external_symbol((SubLObject)tcp_server_utilities.$sym16$DISABLE_ALL_TCP_SERVERS);
        access_macros.register_external_symbol((SubLObject)tcp_server_utilities.$sym17$DISABLE_SOME_TCP_SERVERS);
        access_macros.register_external_symbol((SubLObject)tcp_server_utilities.$sym20$RE_ENABLE_DISABLED_TCP_SERVERS);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), tcp_server_utilities.$dtp_tcp_server$.getGlobalValue(), Symbols.symbol_function((SubLObject)tcp_server_utilities.$sym31$TCP_SERVER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)tcp_server_utilities.$list32);
        Structures.def_csetf((SubLObject)tcp_server_utilities.$sym33$TCPS_TYPE, (SubLObject)tcp_server_utilities.$sym34$_CSETF_TCPS_TYPE);
        Structures.def_csetf((SubLObject)tcp_server_utilities.$sym35$TCPS_PORT, (SubLObject)tcp_server_utilities.$sym36$_CSETF_TCPS_PORT);
        Structures.def_csetf((SubLObject)tcp_server_utilities.$sym37$TCPS_PROCESS, (SubLObject)tcp_server_utilities.$sym38$_CSETF_TCPS_PROCESS);
        Equality.identity((SubLObject)tcp_server_utilities.$sym24$TCP_SERVER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), tcp_server_utilities.$dtp_tcp_server$.getGlobalValue(), Symbols.symbol_function((SubLObject)tcp_server_utilities.$sym46$VISIT_DEFSTRUCT_OBJECT_TCP_SERVER_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)tcp_server_utilities.$sym48$_ALL_TCP_SERVERS_);
        subl_macro_promotions.declare_defglobal((SubLObject)tcp_server_utilities.$sym50$_TCP_SERVER_TYPE_TABLE_);
        return (SubLObject)tcp_server_utilities.NIL;
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
        me = (SubLFile)new tcp_server_utilities();
        tcp_server_utilities.$tcp_server_lock$ = null;
        tcp_server_utilities.$remote_address$ = null;
        tcp_server_utilities.$remote_hostname$ = null;
        tcp_server_utilities.$dtp_tcp_server$ = null;
        tcp_server_utilities.$all_tcp_servers$ = null;
        tcp_server_utilities.$tcp_server_type_table$ = null;
        $str0$TCP_Server_Lock = SubLObjectFactory.makeString("TCP Server Lock");
        $sym1$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*TCP-SERVER-LOCK*"));
        $int3$65535 = SubLObjectFactory.makeInteger(65535);
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("BINARY"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IN-STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("OUT-STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODE"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("MODE"));
        $kw7$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw8$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw9$MODE = SubLObjectFactory.makeKeyword("MODE");
        $kw10$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $sym11$TCP_SERVER_MODE_P = SubLObjectFactory.makeSymbol("TCP-SERVER-MODE-P");
        $sym12$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym13$REGISTER_TCP_SERVER_TYPE = SubLObjectFactory.makeSymbol("REGISTER-TCP-SERVER-TYPE");
        $sym14$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym15$TCP_PORT_P = SubLObjectFactory.makeSymbol("TCP-PORT-P");
        $sym16$DISABLE_ALL_TCP_SERVERS = SubLObjectFactory.makeSymbol("DISABLE-ALL-TCP-SERVERS");
        $sym17$DISABLE_SOME_TCP_SERVERS = SubLObjectFactory.makeSymbol("DISABLE-SOME-TCP-SERVERS");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYC-API"));
        $sym19$TCP_SERVER_TYPE = SubLObjectFactory.makeSymbol("TCP-SERVER-TYPE");
        $sym20$RE_ENABLE_DISABLED_TCP_SERVERS = SubLObjectFactory.makeSymbol("RE-ENABLE-DISABLED-TCP-SERVERS");
        $sym21$ENABLE_TCP_SERVER_SPEC = SubLObjectFactory.makeSymbol("ENABLE-TCP-SERVER-SPEC");
        $list22 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PORT"));
        $kw23$SERVLET = SubLObjectFactory.makeKeyword("SERVLET");
        $sym24$TCP_SERVER = SubLObjectFactory.makeSymbol("TCP-SERVER");
        $sym25$TCP_SERVER_P = SubLObjectFactory.makeSymbol("TCP-SERVER-P");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PORT"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS"));
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeKeyword("PROCESS"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TCPS-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TCPS-PORT"), (SubLObject)SubLObjectFactory.makeSymbol("TCPS-PROCESS"));
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TCPS-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TCPS-PORT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TCPS-PROCESS"));
        $sym30$PRINT_TCP_SERVER = SubLObjectFactory.makeSymbol("PRINT-TCP-SERVER");
        $sym31$TCP_SERVER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TCP-SERVER-PRINT-FUNCTION-TRAMPOLINE");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TCP-SERVER-P"));
        $sym33$TCPS_TYPE = SubLObjectFactory.makeSymbol("TCPS-TYPE");
        $sym34$_CSETF_TCPS_TYPE = SubLObjectFactory.makeSymbol("_CSETF-TCPS-TYPE");
        $sym35$TCPS_PORT = SubLObjectFactory.makeSymbol("TCPS-PORT");
        $sym36$_CSETF_TCPS_PORT = SubLObjectFactory.makeSymbol("_CSETF-TCPS-PORT");
        $sym37$TCPS_PROCESS = SubLObjectFactory.makeSymbol("TCPS-PROCESS");
        $sym38$_CSETF_TCPS_PROCESS = SubLObjectFactory.makeSymbol("_CSETF-TCPS-PROCESS");
        $kw39$PORT = SubLObjectFactory.makeKeyword("PORT");
        $kw40$PROCESS = SubLObjectFactory.makeKeyword("PROCESS");
        $str41$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw42$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym43$MAKE_TCP_SERVER = SubLObjectFactory.makeSymbol("MAKE-TCP-SERVER");
        $kw44$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw45$END = SubLObjectFactory.makeKeyword("END");
        $sym46$VISIT_DEFSTRUCT_OBJECT_TCP_SERVER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TCP-SERVER-METHOD");
        $str47$_ = SubLObjectFactory.makeString("/");
        $sym48$_ALL_TCP_SERVERS_ = SubLObjectFactory.makeSymbol("*ALL-TCP-SERVERS*");
        $sym49$TCP_SERVER_PORT = SubLObjectFactory.makeSymbol("TCP-SERVER-PORT");
        $sym50$_TCP_SERVER_TYPE_TABLE_ = SubLObjectFactory.makeSymbol("*TCP-SERVER-TYPE-TABLE*");
        $sym51$TCP_SERVER_HANDLER_P = SubLObjectFactory.makeSymbol("TCP-SERVER-HANDLER-P");
        $kw52$EXTERNAL = SubLObjectFactory.makeKeyword("EXTERNAL");
        $sym53$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym54$DEFINE = SubLObjectFactory.makeSymbol("DEFINE");
        $sym55$START_TCP_SERVER = SubLObjectFactory.makeSymbol("START-TCP-SERVER", "SUBLISP");
        $kw56$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym57$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym58$STOP_TCP_SERVER = SubLObjectFactory.makeSymbol("STOP-TCP-SERVER", "SUBLISP");
    }
    
    public static final class $tcp_server_native extends SubLStructNative
    {
        public SubLObject $type;
        public SubLObject $port;
        public SubLObject $process;
        private static final SubLStructDeclNative structDecl;
        
        public $tcp_server_native() {
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$port = (SubLObject)CommonSymbols.NIL;
            this.$process = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$tcp_server_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$tcp_server_native.class, tcp_server_utilities.$sym24$TCP_SERVER, tcp_server_utilities.$sym25$TCP_SERVER_P, tcp_server_utilities.$list26, tcp_server_utilities.$list27, new String[] { "$type", "$port", "$process" }, tcp_server_utilities.$list28, tcp_server_utilities.$list29, tcp_server_utilities.$sym30$PRINT_TCP_SERVER);
        }
    }
    
    public static final class $tcp_server_p$UnaryFunction extends UnaryFunction
    {
        public $tcp_server_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TCP-SERVER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return tcp_server_utilities.tcp_server_p(arg1);
        }
    }
}

/*

	Total time: 335 ms
	
*/