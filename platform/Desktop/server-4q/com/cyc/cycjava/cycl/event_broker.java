package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class event_broker extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.event_broker";
    public static final String myFingerPrint = "0e5df71e8b9e82aab9b5bb34d0fcb45e3e196ccf204271b150b32056199e96c8";
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 752L)
    public static SubLSymbol $should_show_event_errorsP$;
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 983L)
    public static SubLSymbol $dtp_funcall_info$;
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1231L)
    public static SubLSymbol $dtp_socket_info$;
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1946L)
    public static SubLSymbol $dtp_event_listener$;
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 4429L)
    public static SubLSymbol $dtp_event_broker$;
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 6013L)
    public static SubLSymbol $dtp_protocol_description$;
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 9175L)
    private static SubLSymbol $event_broker$;
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 10034L)
    private static SubLSymbol $fast_has_event_class_any_transitive_listenersP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 11803L)
    private static SubLSymbol $deregistration_during_system_initialization$;
    private static final SubLSymbol $sym0$FUNCALL_INFO;
    private static final SubLSymbol $sym1$FUNCALL_INFO_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym7$FUNCALL_INFO_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$FUNCALL_INFO_FUNCTION;
    private static final SubLSymbol $sym10$_CSETF_FUNCALL_INFO_FUNCTION;
    private static final SubLSymbol $kw11$FUNCTION;
    private static final SubLString $str12$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw13$BEGIN;
    private static final SubLSymbol $sym14$MAKE_FUNCALL_INFO;
    private static final SubLSymbol $kw15$SLOT;
    private static final SubLSymbol $kw16$END;
    private static final SubLSymbol $sym17$VISIT_DEFSTRUCT_OBJECT_FUNCALL_INFO_METHOD;
    private static final SubLString $str18$_funcall__S_;
    private static final SubLSymbol $sym19$SOCKET_INFO;
    private static final SubLSymbol $sym20$SOCKET_INFO_P;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$SOCKET_INFO_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$SOCKET_INFO_HOST;
    private static final SubLSymbol $sym28$_CSETF_SOCKET_INFO_HOST;
    private static final SubLSymbol $sym29$SOCKET_INFO_PORT;
    private static final SubLSymbol $sym30$_CSETF_SOCKET_INFO_PORT;
    private static final SubLSymbol $sym31$SOCKET_INFO_PROTOCOL;
    private static final SubLSymbol $sym32$_CSETF_SOCKET_INFO_PROTOCOL;
    private static final SubLSymbol $kw33$HOST;
    private static final SubLSymbol $kw34$PORT;
    private static final SubLSymbol $kw35$PROTOCOL;
    private static final SubLSymbol $sym36$MAKE_SOCKET_INFO;
    private static final SubLSymbol $sym37$VISIT_DEFSTRUCT_OBJECT_SOCKET_INFO_METHOD;
    private static final SubLString $str38$_socket__S__S__S_;
    private static final SubLSymbol $sym39$EVENT_LISTENER;
    private static final SubLSymbol $sym40$EVENT_LISTENER_P;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$EVENT_LISTENER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list46;
    private static final SubLSymbol $sym47$EVENT_LISTENER_EVENT;
    private static final SubLSymbol $sym48$_CSETF_EVENT_LISTENER_EVENT;
    private static final SubLSymbol $sym49$EVENT_LISTENER_INVOCATION_MODE;
    private static final SubLSymbol $sym50$_CSETF_EVENT_LISTENER_INVOCATION_MODE;
    private static final SubLSymbol $sym51$EVENT_LISTENER_INVOCATION_INFO;
    private static final SubLSymbol $sym52$_CSETF_EVENT_LISTENER_INVOCATION_INFO;
    private static final SubLSymbol $sym53$EVENT_LISTENER_MY_PARAMS;
    private static final SubLSymbol $sym54$_CSETF_EVENT_LISTENER_MY_PARAMS;
    private static final SubLSymbol $sym55$EVENT_LISTENER_SOURCE_FILTER;
    private static final SubLSymbol $sym56$_CSETF_EVENT_LISTENER_SOURCE_FILTER;
    private static final SubLSymbol $kw57$EVENT;
    private static final SubLSymbol $kw58$INVOCATION_MODE;
    private static final SubLSymbol $kw59$INVOCATION_INFO;
    private static final SubLSymbol $kw60$MY_PARAMS;
    private static final SubLSymbol $kw61$SOURCE_FILTER;
    private static final SubLSymbol $sym62$MAKE_EVENT_LISTENER;
    private static final SubLSymbol $sym63$VISIT_DEFSTRUCT_OBJECT_EVENT_LISTENER_METHOD;
    private static final SubLSymbol $sym64$FALSE;
    private static final SubLSymbol $kw65$FUNCALL;
    private static final SubLSymbol $kw66$DEFAULT;
    private static final SubLSymbol $kw67$SOCKET;
    private static final SubLString $str68$_S_listener_;
    private static final SubLString $str69$_S__unknown_mode__;
    private static final SubLString $str70$_with_parameters__S_;
    private static final SubLString $str71$_source_filtering__S;
    private static final SubLSymbol $sym72$EVENT_BROKER;
    private static final SubLSymbol $sym73$EVENT_BROKER_P;
    private static final SubLList $list74;
    private static final SubLList $list75;
    private static final SubLList $list76;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$EVENT_BROKER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$EVENT_BROKER_HIERARCHY;
    private static final SubLSymbol $sym81$_CSETF_EVENT_BROKER_HIERARCHY;
    private static final SubLSymbol $sym82$EVENT_BROKER_LISTENERS;
    private static final SubLSymbol $sym83$_CSETF_EVENT_BROKER_LISTENERS;
    private static final SubLSymbol $sym84$EVENT_BROKER_LOCK;
    private static final SubLSymbol $sym85$_CSETF_EVENT_BROKER_LOCK;
    private static final SubLSymbol $sym86$EVENT_BROKER_POSTINGS;
    private static final SubLSymbol $sym87$_CSETF_EVENT_BROKER_POSTINGS;
    private static final SubLSymbol $sym88$EVENT_BROKER_PROTOCOLS;
    private static final SubLSymbol $sym89$_CSETF_EVENT_BROKER_PROTOCOLS;
    private static final SubLSymbol $kw90$HIERARCHY;
    private static final SubLSymbol $kw91$LISTENERS;
    private static final SubLSymbol $kw92$LOCK;
    private static final SubLSymbol $kw93$POSTINGS;
    private static final SubLSymbol $kw94$PROTOCOLS;
    private static final SubLSymbol $sym95$MAKE_EVENT_BROKER;
    private static final SubLSymbol $sym96$VISIT_DEFSTRUCT_OBJECT_EVENT_BROKER_METHOD;
    private static final SubLList $list97;
    private static final SubLSymbol $sym98$WITH_LOCK_HELD;
    private static final SubLList $list99;
    private static final SubLSymbol $sym100$LISTENERS;
    private static final SubLSymbol $sym101$EVENT_LISTENERS;
    private static final SubLSymbol $sym102$CLET;
    private static final SubLSymbol $sym103$WITH_EVENT_BROKER_LOCK_HELD;
    private static final SubLSymbol $sym104$CSETQ;
    private static final SubLList $list105;
    private static final SubLSymbol $sym106$DICTIONARY_LOOKUP;
    private static final SubLSymbol $sym107$CDOLIST;
    private static final SubLSymbol $sym108$PROTOCOL_DESCRIPTION;
    private static final SubLSymbol $sym109$PROTOCOL_DESCRIPTION_P;
    private static final SubLList $list110;
    private static final SubLList $list111;
    private static final SubLList $list112;
    private static final SubLList $list113;
    private static final SubLSymbol $sym114$PROTOCOL_DESCRIPTION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list115;
    private static final SubLSymbol $sym116$PROTOCOL_DESCRIPTION_PROTOCOL;
    private static final SubLSymbol $sym117$_CSETF_PROTOCOL_DESCRIPTION_PROTOCOL;
    private static final SubLSymbol $sym118$PROTOCOL_DESCRIPTION_EVENT_SERIALIZE;
    private static final SubLSymbol $sym119$_CSETF_PROTOCOL_DESCRIPTION_EVENT_SERIALIZE;
    private static final SubLSymbol $sym120$PROTOCOL_DESCRIPTION_MY_PARAMS_SERIALIZE;
    private static final SubLSymbol $sym121$_CSETF_PROTOCOL_DESCRIPTION_MY_PARAMS_SERIALIZE;
    private static final SubLSymbol $kw122$EVENT_SERIALIZE;
    private static final SubLSymbol $kw123$MY_PARAMS_SERIALIZE;
    private static final SubLSymbol $sym124$MAKE_PROTOCOL_DESCRIPTION;
    private static final SubLSymbol $sym125$VISIT_DEFSTRUCT_OBJECT_PROTOCOL_DESCRIPTION_METHOD;
    private static final SubLString $str126$Protocol__S____for_Event___S____f;
    private static final SubLString $str127$_event_code__S_;
    private static final SubLString $str128$timestamp__S_;
    private static final SubLString $str129$source__S_;
    private static final SubLString $str130$message__S__;
    private static final SubLString $str131$_parameter_key__mine__value__S__;
    private static final SubLString $str132$Event_Broker_Lock;
    private static final SubLString $str133$Event_Broker_Queue;
    private static final SubLSymbol $sym134$DEFAULT_EVENT_SERIALIZE;
    private static final SubLSymbol $sym135$DEFAULT_MY_PARAMS_SERIALIZE;
    private static final SubLSymbol $sym136$_EVENT_BROKER_;
    private static final SubLList $list137;
    private static final SubLSymbol $sym138$PWHEN;
    private static final SubLSymbol $sym139$NULL;
    private static final SubLList $list140;
    private static final SubLSymbol $sym141$FAST_HAS_EVENT_CLASS_ANY_TRANSITIVE_LISTENERS_;
    private static final SubLSymbol $sym142$_FAST_HAS_EVENT_CLASS_ANY_TRANSITIVE_LISTENERS__CACHING_STATE_;
    private static final SubLSymbol $kw143$EVENT_ROOT;
    private static final SubLString $str144$Event_Broker_settings__;
    private static final SubLSymbol $sym145$EVENT_HIERARCHY_P;
    private static final SubLString $str146$__Listening_for__S____;
    private static final SubLString $str147$__;
    private static final SubLString $str148$__Defined_protocols___;
    private static final SubLString $str149$____;
    private static final SubLSymbol $kw150$EVENT_BROKER_EVENT;
    private static final SubLSymbol $kw151$SYSTEM_EVENT;
    private static final SubLString $str152$The_parent_for_all_events_that_th;
    private static final SubLSymbol $kw153$EVENT_HANDLER_REGISTERED;
    private static final SubLString $str154$The_first_message_any_event_handl;
    private static final SubLSymbol $kw155$EVENT_HANDLER_DEREGISTERED;
    private static final SubLString $str156$The_last_message_any_event_handle;
    private static final SubLSymbol $sym157$KEYWORDP;
    private static final SubLString $str158$success;
    private static final SubLSymbol $kw159$BROKER;
    private static final SubLSymbol $sym160$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym161$EVENT_P;
    private static final SubLSymbol $sym162$STRINGP;
    private static final SubLSymbol $sym163$DEFAULT_FUNCALL_EVENT_ERROR_HANDLER;
    private static final SubLString $str164$Error_during_processing_of_event_;
    private static final SubLSymbol $kw165$PUBLIC;
    private static final SubLString $str166$Unknown_mode_of_invocation__S____;
    private static final SubLSymbol $kw167$CLASS;
    private static final SubLSymbol $kw168$TIMESTAMP;
    private static final SubLSymbol $kw169$MESSAGE;
    private static final SubLSymbol $kw170$SOURCE;
    private static final SubLSymbol $kw171$CFASL;
    private static final SubLSymbol $sym172$DEFAULT_CFASL_EVENT_SERIALIZE;
    private static final SubLSymbol $sym173$DEFAULT_CFASL_PARAMS_SERIALIZE;
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 983L)
    public static SubLObject funcall_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)event_broker.ZERO_INTEGER);
        return (SubLObject)event_broker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 983L)
    public static SubLObject funcall_info_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $funcall_info_native.class) ? event_broker.T : event_broker.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 983L)
    public static SubLObject funcall_info_function(final SubLObject v_object) {
        assert event_broker.NIL != funcall_info_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 983L)
    public static SubLObject _csetf_funcall_info_function(final SubLObject v_object, final SubLObject value) {
        assert event_broker.NIL != funcall_info_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 983L)
    public static SubLObject make_funcall_info(SubLObject arglist) {
        if (arglist == event_broker.UNPROVIDED) {
            arglist = (SubLObject)event_broker.NIL;
        }
        final SubLObject v_new = (SubLObject)new $funcall_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)event_broker.NIL, next = arglist; event_broker.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)event_broker.$kw11$FUNCTION)) {
                _csetf_funcall_info_function(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)event_broker.$str12$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 983L)
    public static SubLObject visit_defstruct_funcall_info(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw13$BEGIN, (SubLObject)event_broker.$sym14$MAKE_FUNCALL_INFO, (SubLObject)event_broker.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw15$SLOT, (SubLObject)event_broker.$kw11$FUNCTION, funcall_info_function(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw16$END, (SubLObject)event_broker.$sym14$MAKE_FUNCALL_INFO, (SubLObject)event_broker.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 983L)
    public static SubLObject visit_defstruct_object_funcall_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_funcall_info(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1064L)
    public static SubLObject display_funcall_info(final SubLObject funcall_info, SubLObject stream) {
        if (stream == event_broker.UNPROVIDED) {
            stream = (SubLObject)event_broker.T;
        }
        PrintLow.format(stream, (SubLObject)event_broker.$str18$_funcall__S_, funcall_info_function(funcall_info));
        return funcall_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1231L)
    public static SubLObject socket_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)event_broker.ZERO_INTEGER);
        return (SubLObject)event_broker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1231L)
    public static SubLObject socket_info_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $socket_info_native.class) ? event_broker.T : event_broker.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1231L)
    public static SubLObject socket_info_host(final SubLObject v_object) {
        assert event_broker.NIL != socket_info_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1231L)
    public static SubLObject socket_info_port(final SubLObject v_object) {
        assert event_broker.NIL != socket_info_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1231L)
    public static SubLObject socket_info_protocol(final SubLObject v_object) {
        assert event_broker.NIL != socket_info_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1231L)
    public static SubLObject _csetf_socket_info_host(final SubLObject v_object, final SubLObject value) {
        assert event_broker.NIL != socket_info_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1231L)
    public static SubLObject _csetf_socket_info_port(final SubLObject v_object, final SubLObject value) {
        assert event_broker.NIL != socket_info_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1231L)
    public static SubLObject _csetf_socket_info_protocol(final SubLObject v_object, final SubLObject value) {
        assert event_broker.NIL != socket_info_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1231L)
    public static SubLObject make_socket_info(SubLObject arglist) {
        if (arglist == event_broker.UNPROVIDED) {
            arglist = (SubLObject)event_broker.NIL;
        }
        final SubLObject v_new = (SubLObject)new $socket_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)event_broker.NIL, next = arglist; event_broker.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)event_broker.$kw33$HOST)) {
                _csetf_socket_info_host(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)event_broker.$kw34$PORT)) {
                _csetf_socket_info_port(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)event_broker.$kw35$PROTOCOL)) {
                _csetf_socket_info_protocol(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)event_broker.$str12$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1231L)
    public static SubLObject visit_defstruct_socket_info(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw13$BEGIN, (SubLObject)event_broker.$sym36$MAKE_SOCKET_INFO, (SubLObject)event_broker.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw15$SLOT, (SubLObject)event_broker.$kw33$HOST, socket_info_host(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw15$SLOT, (SubLObject)event_broker.$kw34$PORT, socket_info_port(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw15$SLOT, (SubLObject)event_broker.$kw35$PROTOCOL, socket_info_protocol(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw16$END, (SubLObject)event_broker.$sym36$MAKE_SOCKET_INFO, (SubLObject)event_broker.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1231L)
    public static SubLObject visit_defstruct_object_socket_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_socket_info(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1381L)
    public static SubLObject new_socket_info(final SubLObject host, final SubLObject port, SubLObject protocol) {
        if (protocol == event_broker.UNPROVIDED) {
            protocol = (SubLObject)event_broker.NIL;
        }
        final SubLObject socket_info = make_socket_info((SubLObject)event_broker.UNPROVIDED);
        _csetf_socket_info_host(socket_info, host);
        _csetf_socket_info_port(socket_info, port);
        if (event_broker.NIL != protocol) {
            _csetf_socket_info_protocol(socket_info, protocol);
        }
        return socket_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1687L)
    public static SubLObject display_socket_info(final SubLObject socket_info, SubLObject stream) {
        if (stream == event_broker.UNPROVIDED) {
            stream = (SubLObject)event_broker.T;
        }
        PrintLow.format(stream, (SubLObject)event_broker.$str38$_socket__S__S__S_, new SubLObject[] { socket_info_host(socket_info), socket_info_port(socket_info), socket_info_protocol(socket_info) });
        return socket_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1946L)
    public static SubLObject event_listener_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)event_broker.ZERO_INTEGER);
        return (SubLObject)event_broker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1946L)
    public static SubLObject event_listener_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $event_listener_native.class) ? event_broker.T : event_broker.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1946L)
    public static SubLObject event_listener_event(final SubLObject v_object) {
        assert event_broker.NIL != event_listener_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1946L)
    public static SubLObject event_listener_invocation_mode(final SubLObject v_object) {
        assert event_broker.NIL != event_listener_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1946L)
    public static SubLObject event_listener_invocation_info(final SubLObject v_object) {
        assert event_broker.NIL != event_listener_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1946L)
    public static SubLObject event_listener_my_params(final SubLObject v_object) {
        assert event_broker.NIL != event_listener_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1946L)
    public static SubLObject event_listener_source_filter(final SubLObject v_object) {
        assert event_broker.NIL != event_listener_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1946L)
    public static SubLObject _csetf_event_listener_event(final SubLObject v_object, final SubLObject value) {
        assert event_broker.NIL != event_listener_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1946L)
    public static SubLObject _csetf_event_listener_invocation_mode(final SubLObject v_object, final SubLObject value) {
        assert event_broker.NIL != event_listener_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1946L)
    public static SubLObject _csetf_event_listener_invocation_info(final SubLObject v_object, final SubLObject value) {
        assert event_broker.NIL != event_listener_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1946L)
    public static SubLObject _csetf_event_listener_my_params(final SubLObject v_object, final SubLObject value) {
        assert event_broker.NIL != event_listener_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1946L)
    public static SubLObject _csetf_event_listener_source_filter(final SubLObject v_object, final SubLObject value) {
        assert event_broker.NIL != event_listener_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1946L)
    public static SubLObject make_event_listener(SubLObject arglist) {
        if (arglist == event_broker.UNPROVIDED) {
            arglist = (SubLObject)event_broker.NIL;
        }
        final SubLObject v_new = (SubLObject)new $event_listener_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)event_broker.NIL, next = arglist; event_broker.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)event_broker.$kw57$EVENT)) {
                _csetf_event_listener_event(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)event_broker.$kw58$INVOCATION_MODE)) {
                _csetf_event_listener_invocation_mode(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)event_broker.$kw59$INVOCATION_INFO)) {
                _csetf_event_listener_invocation_info(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)event_broker.$kw60$MY_PARAMS)) {
                _csetf_event_listener_my_params(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)event_broker.$kw61$SOURCE_FILTER)) {
                _csetf_event_listener_source_filter(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)event_broker.$str12$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1946L)
    public static SubLObject visit_defstruct_event_listener(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw13$BEGIN, (SubLObject)event_broker.$sym62$MAKE_EVENT_LISTENER, (SubLObject)event_broker.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw15$SLOT, (SubLObject)event_broker.$kw57$EVENT, event_listener_event(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw15$SLOT, (SubLObject)event_broker.$kw58$INVOCATION_MODE, event_listener_invocation_mode(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw15$SLOT, (SubLObject)event_broker.$kw59$INVOCATION_INFO, event_listener_invocation_info(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw15$SLOT, (SubLObject)event_broker.$kw60$MY_PARAMS, event_listener_my_params(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw15$SLOT, (SubLObject)event_broker.$kw61$SOURCE_FILTER, event_listener_source_filter(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw16$END, (SubLObject)event_broker.$sym62$MAKE_EVENT_LISTENER, (SubLObject)event_broker.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 1946L)
    public static SubLObject visit_defstruct_object_event_listener_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_event_listener(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 2415L)
    public static SubLObject describe_funcall_listener(final SubLObject event, final SubLObject function, SubLObject my_params, SubLObject source_filter) {
        if (my_params == event_broker.UNPROVIDED) {
            my_params = (SubLObject)event_broker.NIL;
        }
        if (source_filter == event_broker.UNPROVIDED) {
            source_filter = (SubLObject)event_broker.$sym64$FALSE;
        }
        final SubLObject listener = make_event_listener((SubLObject)event_broker.UNPROVIDED);
        final SubLObject info = make_funcall_info((SubLObject)event_broker.UNPROVIDED);
        _csetf_funcall_info_function(info, function);
        _csetf_event_listener_event(listener, event);
        _csetf_event_listener_invocation_mode(listener, (SubLObject)event_broker.$kw65$FUNCALL);
        _csetf_event_listener_invocation_info(listener, info);
        _csetf_event_listener_my_params(listener, my_params);
        _csetf_event_listener_source_filter(listener, source_filter);
        return listener;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 2969L)
    public static SubLObject describe_socket_listener(final SubLObject event, final SubLObject host, final SubLObject port, SubLObject my_params, SubLObject source_filter) {
        if (my_params == event_broker.UNPROVIDED) {
            my_params = (SubLObject)event_broker.NIL;
        }
        if (source_filter == event_broker.UNPROVIDED) {
            source_filter = (SubLObject)event_broker.$sym64$FALSE;
        }
        final SubLObject listener = make_event_listener((SubLObject)event_broker.UNPROVIDED);
        final SubLObject info = make_socket_info((SubLObject)event_broker.UNPROVIDED);
        _csetf_socket_info_host(info, host);
        _csetf_socket_info_port(info, port);
        _csetf_socket_info_protocol(info, (SubLObject)event_broker.$kw66$DEFAULT);
        _csetf_event_listener_event(listener, event);
        _csetf_event_listener_invocation_mode(listener, (SubLObject)event_broker.$kw67$SOCKET);
        _csetf_event_listener_invocation_info(listener, info);
        _csetf_event_listener_my_params(listener, my_params);
        _csetf_event_listener_source_filter(listener, source_filter);
        return listener;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 3638L)
    public static SubLObject display_event_listener(final SubLObject event_listener, SubLObject stream) {
        if (stream == event_broker.UNPROVIDED) {
            stream = (SubLObject)event_broker.T;
        }
        final SubLObject event = event_listener_event(event_listener);
        final SubLObject mode = event_listener_invocation_mode(event_listener);
        final SubLObject info = event_listener_invocation_info(event_listener);
        final SubLObject source_filter = event_listener_source_filter(event_listener);
        PrintLow.format(stream, (SubLObject)event_broker.$str68$_S_listener_, event);
        final SubLObject pcase_var = mode;
        if (pcase_var.eql((SubLObject)event_broker.$kw67$SOCKET)) {
            display_socket_info(info, stream);
        }
        else if (pcase_var.eql((SubLObject)event_broker.$kw65$FUNCALL)) {
            display_funcall_info(info, stream);
        }
        else {
            PrintLow.format(stream, (SubLObject)event_broker.$str69$_S__unknown_mode__, mode);
        }
        PrintLow.format(stream, (SubLObject)event_broker.$str70$_with_parameters__S_, event_listener_my_params(event_listener));
        if (source_filter != event_broker.$sym64$FALSE) {
            PrintLow.format(stream, (SubLObject)event_broker.$str71$_source_filtering__S, source_filter);
        }
        streams_high.terpri(stream);
        return event_listener;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 4429L)
    public static SubLObject event_broker_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)event_broker.ZERO_INTEGER);
        return (SubLObject)event_broker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 4429L)
    public static SubLObject event_broker_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $event_broker_native.class) ? event_broker.T : event_broker.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 4429L)
    public static SubLObject event_broker_hierarchy(final SubLObject v_object) {
        assert event_broker.NIL != event_broker_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 4429L)
    public static SubLObject event_broker_listeners(final SubLObject v_object) {
        assert event_broker.NIL != event_broker_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 4429L)
    public static SubLObject event_broker_lock(final SubLObject v_object) {
        assert event_broker.NIL != event_broker_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 4429L)
    public static SubLObject event_broker_postings(final SubLObject v_object) {
        assert event_broker.NIL != event_broker_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 4429L)
    public static SubLObject event_broker_protocols(final SubLObject v_object) {
        assert event_broker.NIL != event_broker_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 4429L)
    public static SubLObject _csetf_event_broker_hierarchy(final SubLObject v_object, final SubLObject value) {
        assert event_broker.NIL != event_broker_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 4429L)
    public static SubLObject _csetf_event_broker_listeners(final SubLObject v_object, final SubLObject value) {
        assert event_broker.NIL != event_broker_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 4429L)
    public static SubLObject _csetf_event_broker_lock(final SubLObject v_object, final SubLObject value) {
        assert event_broker.NIL != event_broker_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 4429L)
    public static SubLObject _csetf_event_broker_postings(final SubLObject v_object, final SubLObject value) {
        assert event_broker.NIL != event_broker_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 4429L)
    public static SubLObject _csetf_event_broker_protocols(final SubLObject v_object, final SubLObject value) {
        assert event_broker.NIL != event_broker_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 4429L)
    public static SubLObject make_event_broker(SubLObject arglist) {
        if (arglist == event_broker.UNPROVIDED) {
            arglist = (SubLObject)event_broker.NIL;
        }
        final SubLObject v_new = (SubLObject)new $event_broker_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)event_broker.NIL, next = arglist; event_broker.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)event_broker.$kw90$HIERARCHY)) {
                _csetf_event_broker_hierarchy(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)event_broker.$kw91$LISTENERS)) {
                _csetf_event_broker_listeners(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)event_broker.$kw92$LOCK)) {
                _csetf_event_broker_lock(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)event_broker.$kw93$POSTINGS)) {
                _csetf_event_broker_postings(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)event_broker.$kw94$PROTOCOLS)) {
                _csetf_event_broker_protocols(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)event_broker.$str12$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 4429L)
    public static SubLObject visit_defstruct_event_broker(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw13$BEGIN, (SubLObject)event_broker.$sym95$MAKE_EVENT_BROKER, (SubLObject)event_broker.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw15$SLOT, (SubLObject)event_broker.$kw90$HIERARCHY, event_broker_hierarchy(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw15$SLOT, (SubLObject)event_broker.$kw91$LISTENERS, event_broker_listeners(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw15$SLOT, (SubLObject)event_broker.$kw92$LOCK, event_broker_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw15$SLOT, (SubLObject)event_broker.$kw93$POSTINGS, event_broker_postings(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw15$SLOT, (SubLObject)event_broker.$kw94$PROTOCOLS, event_broker_protocols(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw16$END, (SubLObject)event_broker.$sym95$MAKE_EVENT_BROKER, (SubLObject)event_broker.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 4429L)
    public static SubLObject visit_defstruct_object_event_broker_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_event_broker(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 4787L)
    public static SubLObject with_event_broker_lock_held(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_broker.$list97);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_event_broker = (SubLObject)event_broker.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_broker.$list97);
        v_event_broker = current.first();
        current = current.rest();
        if (event_broker.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)event_broker.$sym98$WITH_LOCK_HELD, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)event_broker.$sym84$EVENT_BROKER_LOCK, v_event_broker)), ConsesLow.append(body, (SubLObject)event_broker.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)event_broker.$list97);
        return (SubLObject)event_broker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 4951L)
    public static SubLObject add_listener_to_broker(final SubLObject listener, final SubLObject broker) {
        final SubLObject lock = event_broker_lock(broker);
        SubLObject release = (SubLObject)event_broker.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject event = event_listener_event(listener);
            final SubLObject listeners = event_broker_listeners(broker);
            dictionary_utilities.dictionary_pushnew(listeners, event, listener, Symbols.symbol_function((SubLObject)event_broker.EQUALP), (SubLObject)event_broker.UNPROVIDED);
        }
        finally {
            if (event_broker.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return broker;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 5254L)
    public static SubLObject remove_listener_from_broker(final SubLObject listener, final SubLObject broker) {
        final SubLObject lock = event_broker_lock(broker);
        SubLObject release = (SubLObject)event_broker.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject event = event_listener_event(listener);
            final SubLObject listeners = event_broker_listeners(broker);
            dictionary_utilities.dictionary_remove_from_value(listeners, event, listener, Symbols.symbol_function((SubLObject)event_broker.EQUALP), (SubLObject)event_broker.UNPROVIDED);
        }
        finally {
            if (event_broker.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return broker;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 5572L)
    public static SubLObject do_listeners_of_event(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_broker.$list99);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject listener = (SubLObject)event_broker.NIL;
        SubLObject event = (SubLObject)event_broker.NIL;
        SubLObject broker = (SubLObject)event_broker.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_broker.$list99);
        listener = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_broker.$list99);
        event = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_broker.$list99);
        broker = current.first();
        current = current.rest();
        if (event_broker.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject listeners = (SubLObject)event_broker.$sym100$LISTENERS;
            final SubLObject event_listeners = (SubLObject)event_broker.$sym101$EVENT_LISTENERS;
            return (SubLObject)ConsesLow.list((SubLObject)event_broker.$sym102$CLET, (SubLObject)ConsesLow.list(listeners, event_listeners), (SubLObject)ConsesLow.list((SubLObject)event_broker.$sym103$WITH_EVENT_BROKER_LOCK_HELD, (SubLObject)ConsesLow.list(broker), (SubLObject)ConsesLow.listS((SubLObject)event_broker.$sym104$CSETQ, listeners, (SubLObject)event_broker.$list105), (SubLObject)ConsesLow.list((SubLObject)event_broker.$sym104$CSETQ, event_listeners, (SubLObject)ConsesLow.list((SubLObject)event_broker.$sym106$DICTIONARY_LOOKUP, listeners, event))), (SubLObject)ConsesLow.listS((SubLObject)event_broker.$sym107$CDOLIST, (SubLObject)ConsesLow.list(listener, event_listeners), ConsesLow.append(body, (SubLObject)event_broker.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)event_broker.$list99);
        return (SubLObject)event_broker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 6013L)
    public static SubLObject protocol_description_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)event_broker.ZERO_INTEGER);
        return (SubLObject)event_broker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 6013L)
    public static SubLObject protocol_description_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $protocol_description_native.class) ? event_broker.T : event_broker.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 6013L)
    public static SubLObject protocol_description_protocol(final SubLObject v_object) {
        assert event_broker.NIL != protocol_description_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 6013L)
    public static SubLObject protocol_description_event_serialize(final SubLObject v_object) {
        assert event_broker.NIL != protocol_description_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 6013L)
    public static SubLObject protocol_description_my_params_serialize(final SubLObject v_object) {
        assert event_broker.NIL != protocol_description_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 6013L)
    public static SubLObject _csetf_protocol_description_protocol(final SubLObject v_object, final SubLObject value) {
        assert event_broker.NIL != protocol_description_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 6013L)
    public static SubLObject _csetf_protocol_description_event_serialize(final SubLObject v_object, final SubLObject value) {
        assert event_broker.NIL != protocol_description_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 6013L)
    public static SubLObject _csetf_protocol_description_my_params_serialize(final SubLObject v_object, final SubLObject value) {
        assert event_broker.NIL != protocol_description_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 6013L)
    public static SubLObject make_protocol_description(SubLObject arglist) {
        if (arglist == event_broker.UNPROVIDED) {
            arglist = (SubLObject)event_broker.NIL;
        }
        final SubLObject v_new = (SubLObject)new $protocol_description_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)event_broker.NIL, next = arglist; event_broker.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)event_broker.$kw35$PROTOCOL)) {
                _csetf_protocol_description_protocol(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)event_broker.$kw122$EVENT_SERIALIZE)) {
                _csetf_protocol_description_event_serialize(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)event_broker.$kw123$MY_PARAMS_SERIALIZE)) {
                _csetf_protocol_description_my_params_serialize(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)event_broker.$str12$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 6013L)
    public static SubLObject visit_defstruct_protocol_description(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw13$BEGIN, (SubLObject)event_broker.$sym124$MAKE_PROTOCOL_DESCRIPTION, (SubLObject)event_broker.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw15$SLOT, (SubLObject)event_broker.$kw35$PROTOCOL, protocol_description_protocol(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw15$SLOT, (SubLObject)event_broker.$kw122$EVENT_SERIALIZE, protocol_description_event_serialize(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw15$SLOT, (SubLObject)event_broker.$kw123$MY_PARAMS_SERIALIZE, protocol_description_my_params_serialize(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)event_broker.$kw16$END, (SubLObject)event_broker.$sym124$MAKE_PROTOCOL_DESCRIPTION, (SubLObject)event_broker.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 6013L)
    public static SubLObject visit_defstruct_object_protocol_description_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_protocol_description(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 6227L)
    public static SubLObject new_protocol_description(final SubLObject protocol, final SubLObject event_serialize, SubLObject my_params_serialize) {
        if (my_params_serialize == event_broker.UNPROVIDED) {
            my_params_serialize = (SubLObject)event_broker.NIL;
        }
        final SubLObject description = make_protocol_description((SubLObject)event_broker.UNPROVIDED);
        _csetf_protocol_description_protocol(description, protocol);
        _csetf_protocol_description_event_serialize(description, event_serialize);
        _csetf_protocol_description_my_params_serialize(description, my_params_serialize);
        return description;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 6641L)
    public static SubLObject display_protocol_description(final SubLObject description, SubLObject stream) {
        if (stream == event_broker.UNPROVIDED) {
            stream = (SubLObject)event_broker.T;
        }
        PrintLow.format(stream, (SubLObject)event_broker.$str126$Protocol__S____for_Event___S____f, new SubLObject[] { protocol_description_protocol(description), protocol_description_event_serialize(description), protocol_description_my_params_serialize(description) });
        return (SubLObject)event_broker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 6981L)
    public static SubLObject add_protocol_to_broker(final SubLObject broker, final SubLObject protocol, final SubLObject event_serializer, SubLObject params_serializer) {
        if (params_serializer == event_broker.UNPROVIDED) {
            params_serializer = (SubLObject)event_broker.NIL;
        }
        final SubLObject description = new_protocol_description(protocol, event_serializer, params_serializer);
        final SubLObject lock = event_broker_lock(broker);
        SubLObject release = (SubLObject)event_broker.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject protocols = event_broker_protocols(broker);
            dictionary.dictionary_enter(protocols, protocol, description);
        }
        finally {
            if (event_broker.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return broker;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 7357L)
    public static SubLObject find_protocol_of_broker(final SubLObject broker, final SubLObject protocol) {
        SubLObject result = (SubLObject)event_broker.NIL;
        final SubLObject lock = event_broker_lock(broker);
        SubLObject release = (SubLObject)event_broker.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject protocols = event_broker_protocols(broker);
            result = dictionary.dictionary_lookup(protocols, protocol, (SubLObject)event_broker.UNPROVIDED);
        }
        finally {
            if (event_broker.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 7617L)
    public static SubLObject default_event_serialize(final SubLObject event, final SubLObject stream) {
        PrintLow.format(stream, (SubLObject)event_broker.$str127$_event_code__S_, Symbols.symbol_name(event_model.event_class(event)));
        final SubLObject timestring = numeric_date_utilities.timestring(event_model.event_timestamp(event));
        PrintLow.format(stream, (SubLObject)event_broker.$str128$timestamp__S_, timestring);
        if (event_broker.NIL != event_model.event_source(event)) {
            PrintLow.format(stream, (SubLObject)event_broker.$str129$source__S_, string_utilities.to_string(event_model.event_source(event)));
        }
        PrintLow.format(stream, (SubLObject)event_broker.$str130$message__S__, string_utilities.to_string(event_model.event_message(event)));
        string_utilities.network_terpri(stream);
        return event;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 8193L)
    public static SubLObject default_my_params_serialize(final SubLObject my_params, final SubLObject stream) {
        PrintLow.format(stream, (SubLObject)event_broker.$str131$_parameter_key__mine__value__S__, string_utilities.to_string(my_params));
        string_utilities.network_terpri(stream);
        return my_params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 8503L)
    public static SubLObject new_event_broker(SubLObject hierarchy) {
        if (hierarchy == event_broker.UNPROVIDED) {
            hierarchy = (SubLObject)event_broker.NIL;
        }
        if (event_broker.NIL == hierarchy) {
            hierarchy = event_model.core_event_hierarchy();
        }
        final SubLObject v_event_broker = make_event_broker((SubLObject)event_broker.UNPROVIDED);
        _csetf_event_broker_hierarchy(v_event_broker, hierarchy);
        _csetf_event_broker_listeners(v_event_broker, dictionary.new_dictionary((SubLObject)event_broker.UNPROVIDED, (SubLObject)event_broker.UNPROVIDED));
        _csetf_event_broker_lock(v_event_broker, Locks.make_lock((SubLObject)event_broker.$str132$Event_Broker_Lock));
        _csetf_event_broker_postings(v_event_broker, process_utilities.new_ipc_queue((SubLObject)event_broker.$str133$Event_Broker_Queue));
        _csetf_event_broker_protocols(v_event_broker, dictionary.new_dictionary((SubLObject)event_broker.UNPROVIDED, (SubLObject)event_broker.UNPROVIDED));
        add_protocol_to_broker(v_event_broker, (SubLObject)event_broker.$kw66$DEFAULT, (SubLObject)event_broker.$sym134$DEFAULT_EVENT_SERIALIZE, (SubLObject)event_broker.$sym135$DEFAULT_MY_PARAMS_SERIALIZE);
        return v_event_broker;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 9254L)
    public static SubLObject ensure_event_broker() {
        if (event_broker.NIL == event_broker_p(event_broker.$event_broker$.getGlobalValue())) {
            event_broker.$event_broker$.setGlobalValue(new_event_broker((SubLObject)event_broker.UNPROVIDED));
        }
        return event_broker.$event_broker$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 9409L)
    public static SubLObject initialize_event_broker(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_event_broker = (SubLObject)event_broker.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)event_broker.$list137);
        v_event_broker = current.first();
        current = current.rest();
        if (event_broker.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)event_broker.$sym138$PWHEN, (SubLObject)ConsesLow.list((SubLObject)event_broker.$sym139$NULL, v_event_broker), (SubLObject)ConsesLow.listS((SubLObject)event_broker.$sym104$CSETQ, v_event_broker, (SubLObject)event_broker.$list140));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)event_broker.$list137);
        return (SubLObject)event_broker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 9560L)
    public static SubLObject core_event_broker() {
        return event_broker.$event_broker$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 9622L)
    public static SubLObject has_event_class_any_listenersP(final SubLObject event_class, SubLObject broker) {
        if (broker == event_broker.UNPROVIDED) {
            broker = (SubLObject)event_broker.NIL;
        }
        if (event_broker.NIL == broker) {
            broker = ensure_event_broker();
        }
        assert event_broker.NIL != event_broker_p(broker) : broker;
        SubLObject listeners = (SubLObject)event_broker.NIL;
        SubLObject event_listeners = (SubLObject)event_broker.NIL;
        final SubLObject lock = event_broker_lock(broker);
        SubLObject release = (SubLObject)event_broker.NIL;
        try {
            release = Locks.seize_lock(lock);
            listeners = event_broker_listeners(broker);
            event_listeners = dictionary.dictionary_lookup_without_values(listeners, event_class, (SubLObject)event_broker.UNPROVIDED);
        }
        finally {
            if (event_broker.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return list_utilities.sublisp_boolean(event_listeners);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 10034L)
    public static SubLObject clear_fast_has_event_class_any_transitive_listenersP() {
        final SubLObject cs = event_broker.$fast_has_event_class_any_transitive_listenersP_caching_state$.getGlobalValue();
        if (event_broker.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)event_broker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 10034L)
    public static SubLObject remove_fast_has_event_class_any_transitive_listenersP(final SubLObject event_class, SubLObject broker) {
        if (broker == event_broker.UNPROVIDED) {
            broker = (SubLObject)event_broker.NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args(event_broker.$fast_has_event_class_any_transitive_listenersP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(event_class, broker), (SubLObject)event_broker.UNPROVIDED, (SubLObject)event_broker.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 10034L)
    public static SubLObject fast_has_event_class_any_transitive_listenersP_internal(final SubLObject event_class, final SubLObject broker) {
        return has_event_class_any_transitive_listenersP(event_class, broker);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 10034L)
    public static SubLObject fast_has_event_class_any_transitive_listenersP(final SubLObject event_class, SubLObject broker) {
        if (broker == event_broker.UNPROVIDED) {
            broker = (SubLObject)event_broker.NIL;
        }
        SubLObject caching_state = event_broker.$fast_has_event_class_any_transitive_listenersP_caching_state$.getGlobalValue();
        if (event_broker.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)event_broker.$sym141$FAST_HAS_EVENT_CLASS_ANY_TRANSITIVE_LISTENERS_, (SubLObject)event_broker.$sym142$_FAST_HAS_EVENT_CLASS_ANY_TRANSITIVE_LISTENERS__CACHING_STATE_, (SubLObject)event_broker.NIL, (SubLObject)event_broker.EQL, (SubLObject)event_broker.TWO_INTEGER, (SubLObject)event_broker.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(event_class, broker);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)event_broker.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)event_broker.NIL;
            collision = cdolist_list_var.first();
            while (event_broker.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (event_class.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (event_broker.NIL != cached_args && event_broker.NIL == cached_args.rest() && broker.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(fast_has_event_class_any_transitive_listenersP_internal(event_class, broker)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(event_class, broker));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 10307L)
    public static SubLObject has_event_class_any_transitive_listenersP(final SubLObject event_class, SubLObject broker) {
        if (broker == event_broker.UNPROVIDED) {
            broker = (SubLObject)event_broker.NIL;
        }
        if (event_broker.NIL == broker) {
            broker = ensure_event_broker();
        }
        assert event_broker.NIL != event_broker_p(broker) : broker;
        final SubLObject hierarchy = event_broker_hierarchy(broker);
        final SubLObject event = event_model.find_event_class(event_class, hierarchy);
        SubLObject listeners = (SubLObject)event_broker.NIL;
        SubLObject doneP = (SubLObject)event_broker.NIL;
        final SubLObject lock = event_broker_lock(broker);
        SubLObject release = (SubLObject)event_broker.NIL;
        try {
            release = Locks.seize_lock(lock);
            listeners = event_broker_listeners(broker);
            SubLObject current = event;
            while (event_broker.NIL != current) {
                if (event_broker.NIL == doneP) {
                    final SubLObject event_key = event_model.event_class_self(current);
                    doneP = list_utilities.sublisp_boolean(dictionary.dictionary_lookup_without_values(listeners, event_key, (SubLObject)event_broker.UNPROVIDED));
                }
                if (event_model.event_class_self(current) == event_broker.$kw143$EVENT_ROOT) {
                    current = (SubLObject)event_broker.NIL;
                }
                else {
                    current = event_model.find_in_event_hierarchy(hierarchy, event_model.event_class_parent(current));
                }
            }
        }
        finally {
            if (event_broker.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return doneP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 11017L)
    public static SubLObject display_event_broker(SubLObject broker, SubLObject stream) {
        if (broker == event_broker.UNPROVIDED) {
            broker = (SubLObject)event_broker.NIL;
        }
        if (stream == event_broker.UNPROVIDED) {
            stream = (SubLObject)event_broker.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (event_broker.NIL == broker) {
            broker = ensure_event_broker();
        }
        assert event_broker.NIL != event_broker_p(broker) : broker;
        PrintLow.format(stream, (SubLObject)event_broker.$str144$Event_Broker_settings__);
        SubLObject hierarchy = event_broker_hierarchy(broker);
        final SubLObject queue = queues.create_queue((SubLObject)event_broker.UNPROVIDED);
        SubLObject children = (SubLObject)event_broker.NIL;
        if (event_broker.NIL == hierarchy) {
            hierarchy = event_model.ensure_event_hierarchy();
        }
        assert event_broker.NIL != event_model.event_hierarchy_p(hierarchy) : hierarchy;
        queues.enqueue((SubLObject)event_broker.$kw143$EVENT_ROOT, queue);
        while (event_broker.NIL == queues.queue_empty_p(queue)) {
            final SubLObject curr = queues.dequeue(queue);
            final SubLObject kids = children = event_model.children_of_event_class_in_hierarchy(curr, hierarchy);
            PrintLow.format(stream, (SubLObject)event_broker.$str146$__Listening_for__S____, curr);
            SubLObject listeners = (SubLObject)event_broker.NIL;
            SubLObject event_listeners = (SubLObject)event_broker.NIL;
            final SubLObject lock = event_broker_lock(broker);
            SubLObject release = (SubLObject)event_broker.NIL;
            try {
                release = Locks.seize_lock(lock);
                listeners = event_broker_listeners(broker);
                event_listeners = dictionary.dictionary_lookup(listeners, curr, (SubLObject)event_broker.UNPROVIDED);
            }
            finally {
                if (event_broker.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
            SubLObject cdolist_list_var = event_listeners;
            SubLObject listener = (SubLObject)event_broker.NIL;
            listener = cdolist_list_var.first();
            while (event_broker.NIL != cdolist_list_var) {
                streams_high.write_string((SubLObject)event_broker.$str147$__, stream, (SubLObject)event_broker.UNPROVIDED, (SubLObject)event_broker.UNPROVIDED);
                display_event_listener(listener, stream);
                cdolist_list_var = cdolist_list_var.rest();
                listener = cdolist_list_var.first();
            }
            SubLObject cdolist_list_var2 = kids;
            SubLObject kid = (SubLObject)event_broker.NIL;
            kid = cdolist_list_var2.first();
            while (event_broker.NIL != cdolist_list_var2) {
                queues.enqueue(event_model.event_class_self(kid), queue);
                cdolist_list_var2 = cdolist_list_var2.rest();
                kid = cdolist_list_var2.first();
            }
        }
        PrintLow.format(stream, (SubLObject)event_broker.$str148$__Defined_protocols___);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(event_broker_protocols(broker))); event_broker.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject protocol = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject description = thread.secondMultipleValue();
            thread.resetMultipleValues();
            streams_high.write_string((SubLObject)event_broker.$str149$____, stream, (SubLObject)event_broker.UNPROVIDED, (SubLObject)event_broker.UNPROVIDED);
            display_protocol_description(description, stream);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)event_broker.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 11909L)
    public static SubLObject remove_stale_core_event_customers() {
        event_broker.$event_broker$.setGlobalValue(remove_stale_event_customers(core_event_broker()));
        return core_event_broker();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 12068L)
    public static SubLObject remove_stale_event_customers(final SubLObject broker) {
        dictionary.clear_dictionary(event_broker_listeners(broker));
        _csetf_event_broker_postings(broker, process_utilities.new_ipc_queue((SubLObject)event_broker.$str133$Event_Broker_Queue));
        return broker;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 12957L)
    public static SubLObject register_event_listener(final SubLObject event_listener, SubLObject broker) {
        if (broker == event_broker.UNPROVIDED) {
            broker = (SubLObject)event_broker.NIL;
        }
        assert event_broker.NIL != event_listener_p(event_listener) : event_listener;
        if (event_broker.NIL == broker) {
            broker = ensure_event_broker();
        }
        assert event_broker.NIL != event_broker_p(broker) : broker;
        if (event_broker.NIL != add_listener_to_broker(event_listener, broker)) {
            signal_registered_event(broker, event_listener);
            clear_fast_has_event_class_any_transitive_listenersP();
            return (SubLObject)event_broker.T;
        }
        return (SubLObject)event_broker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 13403L)
    public static SubLObject deregister_event_listener(final SubLObject event_listener, SubLObject broker) {
        if (broker == event_broker.UNPROVIDED) {
            broker = (SubLObject)event_broker.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert event_broker.NIL != event_listener_p(event_listener) : event_listener;
        if (event_broker.NIL == broker) {
            broker = ensure_event_broker();
        }
        assert event_broker.NIL != event_broker_p(broker) : broker;
        if (event_broker.NIL != remove_listener_from_broker(event_listener, broker)) {
            if (event_broker.NIL == event_broker.$deregistration_during_system_initialization$.getDynamicValue(thread)) {
                signal_deregistered_event(broker, event_listener);
            }
            clear_fast_has_event_class_any_transitive_listenersP();
            return (SubLObject)event_broker.T;
        }
        return (SubLObject)event_broker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 13922L)
    public static SubLObject register_event_socket_protocol(final SubLObject protocol, final SubLObject event_serialize, SubLObject params_serialize, SubLObject broker) {
        if (params_serialize == event_broker.UNPROVIDED) {
            params_serialize = (SubLObject)event_broker.NIL;
        }
        if (broker == event_broker.UNPROVIDED) {
            broker = (SubLObject)event_broker.NIL;
        }
        assert event_broker.NIL != Types.keywordp(protocol) : protocol;
        if (event_broker.NIL == broker) {
            broker = ensure_event_broker();
        }
        assert event_broker.NIL != event_broker_p(broker) : broker;
        return add_protocol_to_broker(broker, protocol, event_serialize, params_serialize);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 14272L)
    public static SubLObject post_event(final SubLObject event, SubLObject broker) {
        if (broker == event_broker.UNPROVIDED) {
            broker = (SubLObject)event_broker.NIL;
        }
        if (event_broker.NIL == broker) {
            broker = ensure_event_broker();
        }
        assert event_broker.NIL != event_broker_p(broker) : broker;
        process_utilities.ipc_enqueue(event, event_broker_postings(broker), (SubLObject)event_broker.UNPROVIDED);
        return event;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 14519L)
    public static SubLObject receive_event(SubLObject broker) {
        if (broker == event_broker.UNPROVIDED) {
            broker = (SubLObject)event_broker.NIL;
        }
        if (event_broker.NIL == broker) {
            broker = ensure_event_broker();
        }
        assert event_broker.NIL != event_broker_p(broker) : broker;
        SubLObject event = (SubLObject)event_broker.NIL;
        event = process_utilities.ipc_dequeue(event_broker_postings(broker), (SubLObject)event_broker.UNPROVIDED);
        dispatch_event_to_listeners(broker, event);
        return event;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 14786L)
    public static SubLObject signal_registered_event(final SubLObject broker, final SubLObject event_listener) {
        final SubLObject event = event_model.new_event((SubLObject)event_broker.$kw153$EVENT_HANDLER_REGISTERED, (SubLObject)event_broker.$str158$success, (SubLObject)event_broker.$kw159$BROKER);
        invoke_event_on_listener(broker, event, event_listener);
        return broker;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 15175L)
    public static SubLObject signal_deregistered_event(final SubLObject broker, final SubLObject event_listener) {
        final SubLObject event = event_model.new_event((SubLObject)event_broker.$kw155$EVENT_HANDLER_DEREGISTERED, (SubLObject)event_broker.$str158$success, (SubLObject)event_broker.$kw159$BROKER);
        invoke_event_on_listener(broker, event, event_listener);
        return broker;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 15494L)
    public static SubLObject dispatch_event_to_listeners(final SubLObject broker, final SubLObject event) {
        final SubLObject event_class_key = event_model.event_class(event);
        final SubLObject hierarchy = event_broker_hierarchy(broker);
        SubLObject current;
        final SubLObject event_class = current = event_model.find_event_class(event_class_key, hierarchy);
        while (event_broker.NIL != current) {
            final SubLObject event_key = event_model.event_class_self(current);
            SubLObject listeners = (SubLObject)event_broker.NIL;
            SubLObject event_listeners = (SubLObject)event_broker.NIL;
            final SubLObject lock = event_broker_lock(broker);
            SubLObject release = (SubLObject)event_broker.NIL;
            try {
                release = Locks.seize_lock(lock);
                listeners = event_broker_listeners(broker);
                event_listeners = dictionary.dictionary_lookup(listeners, event_key, (SubLObject)event_broker.UNPROVIDED);
            }
            finally {
                if (event_broker.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
            SubLObject cdolist_list_var = event_listeners;
            SubLObject listener = (SubLObject)event_broker.NIL;
            listener = cdolist_list_var.first();
            while (event_broker.NIL != cdolist_list_var) {
                invoke_event_on_listener(broker, event, listener);
                cdolist_list_var = cdolist_list_var.rest();
                listener = cdolist_list_var.first();
            }
            if (event_model.event_class_self(current) == event_broker.$kw143$EVENT_ROOT) {
                current = (SubLObject)event_broker.NIL;
            }
            else {
                current = event_model.find_in_event_hierarchy(hierarchy, event_model.event_class_parent(current));
            }
        }
        return broker;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 15977L)
    public static SubLObject invoke_funcall_event_on_listener(final SubLObject event, final SubLObject listener) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject info = event_listener_invocation_info(listener);
        final SubLObject params = event_listener_my_params(listener);
        SubLObject result = (SubLObject)event_broker.NIL;
        SubLObject message = (SubLObject)event_broker.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)event_broker.$sym160$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = Functions.funcall(funcall_info_function(info), event, params);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)event_broker.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (message.isString()) {
            invoke_funcall_event_error_handler(event, message);
            result = message;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 16426L)
    public static SubLObject invoke_funcall_event_error_handler(final SubLObject event, final SubLObject error_message) {
        assert event_broker.NIL != event_model.event_p(event) : event;
        assert event_broker.NIL != Types.stringp(error_message) : error_message;
        Functions.funcall((SubLObject)event_broker.$sym163$DEFAULT_FUNCALL_EVENT_ERROR_HANDLER, event, error_message);
        return (SubLObject)event_broker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 16856L)
    public static SubLObject default_funcall_event_error_handler(final SubLObject event, final SubLObject error_message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert event_broker.NIL != event_model.event_p(event) : event;
        assert event_broker.NIL != Types.stringp(error_message) : error_message;
        if (event_broker.NIL != event_broker.$should_show_event_errorsP$.getGlobalValue()) {
            PrintLow.format(StreamsLow.$error_output$.getDynamicValue(thread), (SubLObject)event_broker.$str164$Error_during_processing_of_event_, event, error_message);
            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return (SubLObject)event_broker.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 17269L)
    public static SubLObject invoke_socket_event_on_listener(final SubLObject event, final SubLObject listener, final SubLObject description) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)event_broker.NIL;
        final SubLObject info = event_listener_invocation_info(listener);
        final SubLObject params = event_listener_my_params(listener);
        final SubLObject host = socket_info_host(info);
        final SubLObject port = socket_info_port(info);
        final SubLObject event_serializer = protocol_description_event_serialize(description);
        final SubLObject my_params_serializer = protocol_description_my_params_serialize(description);
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)event_broker.$sym160$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject stream = (SubLObject)event_broker.NIL;
                    try {
                        stream = subl_promotions.open_tcp_stream_with_timeout(host, port, (SubLObject)event_broker.NIL, (SubLObject)event_broker.$kw165$PUBLIC);
                        if (event_broker.NIL != subl_macro_promotions.validate_tcp_connection(stream, host, port)) {
                            Functions.funcall(event_serializer, event, stream);
                            if (event_broker.NIL != my_params_serializer) {
                                Functions.funcall(my_params_serializer, params, stream);
                            }
                            streams_high.force_output(stream);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)event_broker.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (event_broker.NIL != stream) {
                                streams_high.close(stream, (SubLObject)event_broker.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)event_broker.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            result = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 18041L)
    public static SubLObject invoke_event_on_listener(final SubLObject broker, final SubLObject event, final SubLObject listener) {
        final SubLObject pcase_var;
        final SubLObject mode = pcase_var = event_listener_invocation_mode(listener);
        if (pcase_var.eql((SubLObject)event_broker.$kw65$FUNCALL)) {
            return invoke_funcall_event_on_listener(event, listener);
        }
        if (pcase_var.eql((SubLObject)event_broker.$kw67$SOCKET)) {
            final SubLObject socket_info = event_listener_invocation_info(listener);
            final SubLObject protocol = socket_info_protocol(socket_info);
            final SubLObject description = find_protocol_of_broker(broker, protocol);
            return invoke_socket_event_on_listener(event, listener, description);
        }
        Errors.warn((SubLObject)event_broker.$str166$Unknown_mode_of_invocation__S____, mode, listener);
        return broker;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 18707L)
    public static SubLObject default_cfasl_event_serialize(final SubLObject event, final SubLObject stream) {
        final SubLObject serialized = (SubLObject)ConsesLow.list((SubLObject)event_broker.$kw167$CLASS, event_model.event_class(event), (SubLObject)event_broker.$kw168$TIMESTAMP, numeric_date_utilities.timestring(event_model.event_timestamp(event)), (SubLObject)event_broker.$kw169$MESSAGE, event_model.event_message(event), (SubLObject)event_broker.$kw170$SOURCE, event_model.event_source(event));
        cfasl.cfasl_output(serialized, stream);
        return event;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/event-broker.lisp", position = 19122L)
    public static SubLObject default_cfasl_params_serialize(final SubLObject params, final SubLObject stream) {
        final SubLObject serialized = (SubLObject)ConsesLow.list((SubLObject)event_broker.$kw60$MY_PARAMS, params);
        cfasl.cfasl_output(serialized, stream);
        return params;
    }
    
    public static SubLObject declare_event_broker_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "funcall_info_print_function_trampoline", "FUNCALL-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "funcall_info_p", "FUNCALL-INFO-P", 1, 0, false);
        new $funcall_info_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "funcall_info_function", "FUNCALL-INFO-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "_csetf_funcall_info_function", "_CSETF-FUNCALL-INFO-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "make_funcall_info", "MAKE-FUNCALL-INFO", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "visit_defstruct_funcall_info", "VISIT-DEFSTRUCT-FUNCALL-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "visit_defstruct_object_funcall_info_method", "VISIT-DEFSTRUCT-OBJECT-FUNCALL-INFO-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "display_funcall_info", "DISPLAY-FUNCALL-INFO", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "socket_info_print_function_trampoline", "SOCKET-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "socket_info_p", "SOCKET-INFO-P", 1, 0, false);
        new $socket_info_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "socket_info_host", "SOCKET-INFO-HOST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "socket_info_port", "SOCKET-INFO-PORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "socket_info_protocol", "SOCKET-INFO-PROTOCOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "_csetf_socket_info_host", "_CSETF-SOCKET-INFO-HOST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "_csetf_socket_info_port", "_CSETF-SOCKET-INFO-PORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "_csetf_socket_info_protocol", "_CSETF-SOCKET-INFO-PROTOCOL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "make_socket_info", "MAKE-SOCKET-INFO", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "visit_defstruct_socket_info", "VISIT-DEFSTRUCT-SOCKET-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "visit_defstruct_object_socket_info_method", "VISIT-DEFSTRUCT-OBJECT-SOCKET-INFO-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "new_socket_info", "NEW-SOCKET-INFO", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "display_socket_info", "DISPLAY-SOCKET-INFO", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "event_listener_print_function_trampoline", "EVENT-LISTENER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "event_listener_p", "EVENT-LISTENER-P", 1, 0, false);
        new $event_listener_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "event_listener_event", "EVENT-LISTENER-EVENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "event_listener_invocation_mode", "EVENT-LISTENER-INVOCATION-MODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "event_listener_invocation_info", "EVENT-LISTENER-INVOCATION-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "event_listener_my_params", "EVENT-LISTENER-MY-PARAMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "event_listener_source_filter", "EVENT-LISTENER-SOURCE-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "_csetf_event_listener_event", "_CSETF-EVENT-LISTENER-EVENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "_csetf_event_listener_invocation_mode", "_CSETF-EVENT-LISTENER-INVOCATION-MODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "_csetf_event_listener_invocation_info", "_CSETF-EVENT-LISTENER-INVOCATION-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "_csetf_event_listener_my_params", "_CSETF-EVENT-LISTENER-MY-PARAMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "_csetf_event_listener_source_filter", "_CSETF-EVENT-LISTENER-SOURCE-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "make_event_listener", "MAKE-EVENT-LISTENER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "visit_defstruct_event_listener", "VISIT-DEFSTRUCT-EVENT-LISTENER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "visit_defstruct_object_event_listener_method", "VISIT-DEFSTRUCT-OBJECT-EVENT-LISTENER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "describe_funcall_listener", "DESCRIBE-FUNCALL-LISTENER", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "describe_socket_listener", "DESCRIBE-SOCKET-LISTENER", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "display_event_listener", "DISPLAY-EVENT-LISTENER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "event_broker_print_function_trampoline", "EVENT-BROKER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "event_broker_p", "EVENT-BROKER-P", 1, 0, false);
        new $event_broker_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "event_broker_hierarchy", "EVENT-BROKER-HIERARCHY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "event_broker_listeners", "EVENT-BROKER-LISTENERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "event_broker_lock", "EVENT-BROKER-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "event_broker_postings", "EVENT-BROKER-POSTINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "event_broker_protocols", "EVENT-BROKER-PROTOCOLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "_csetf_event_broker_hierarchy", "_CSETF-EVENT-BROKER-HIERARCHY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "_csetf_event_broker_listeners", "_CSETF-EVENT-BROKER-LISTENERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "_csetf_event_broker_lock", "_CSETF-EVENT-BROKER-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "_csetf_event_broker_postings", "_CSETF-EVENT-BROKER-POSTINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "_csetf_event_broker_protocols", "_CSETF-EVENT-BROKER-PROTOCOLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "make_event_broker", "MAKE-EVENT-BROKER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "visit_defstruct_event_broker", "VISIT-DEFSTRUCT-EVENT-BROKER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "visit_defstruct_object_event_broker_method", "VISIT-DEFSTRUCT-OBJECT-EVENT-BROKER-METHOD", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.event_broker", "with_event_broker_lock_held", "WITH-EVENT-BROKER-LOCK-HELD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "add_listener_to_broker", "ADD-LISTENER-TO-BROKER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "remove_listener_from_broker", "REMOVE-LISTENER-FROM-BROKER", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.event_broker", "do_listeners_of_event", "DO-LISTENERS-OF-EVENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "protocol_description_print_function_trampoline", "PROTOCOL-DESCRIPTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "protocol_description_p", "PROTOCOL-DESCRIPTION-P", 1, 0, false);
        new $protocol_description_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "protocol_description_protocol", "PROTOCOL-DESCRIPTION-PROTOCOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "protocol_description_event_serialize", "PROTOCOL-DESCRIPTION-EVENT-SERIALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "protocol_description_my_params_serialize", "PROTOCOL-DESCRIPTION-MY-PARAMS-SERIALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "_csetf_protocol_description_protocol", "_CSETF-PROTOCOL-DESCRIPTION-PROTOCOL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "_csetf_protocol_description_event_serialize", "_CSETF-PROTOCOL-DESCRIPTION-EVENT-SERIALIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "_csetf_protocol_description_my_params_serialize", "_CSETF-PROTOCOL-DESCRIPTION-MY-PARAMS-SERIALIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "make_protocol_description", "MAKE-PROTOCOL-DESCRIPTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "visit_defstruct_protocol_description", "VISIT-DEFSTRUCT-PROTOCOL-DESCRIPTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "visit_defstruct_object_protocol_description_method", "VISIT-DEFSTRUCT-OBJECT-PROTOCOL-DESCRIPTION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "new_protocol_description", "NEW-PROTOCOL-DESCRIPTION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "display_protocol_description", "DISPLAY-PROTOCOL-DESCRIPTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "add_protocol_to_broker", "ADD-PROTOCOL-TO-BROKER", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "find_protocol_of_broker", "FIND-PROTOCOL-OF-BROKER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "default_event_serialize", "DEFAULT-EVENT-SERIALIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "default_my_params_serialize", "DEFAULT-MY-PARAMS-SERIALIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "new_event_broker", "NEW-EVENT-BROKER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "ensure_event_broker", "ENSURE-EVENT-BROKER", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.event_broker", "initialize_event_broker", "INITIALIZE-EVENT-BROKER");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "core_event_broker", "CORE-EVENT-BROKER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "has_event_class_any_listenersP", "HAS-EVENT-CLASS-ANY-LISTENERS?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "clear_fast_has_event_class_any_transitive_listenersP", "CLEAR-FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "remove_fast_has_event_class_any_transitive_listenersP", "REMOVE-FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "fast_has_event_class_any_transitive_listenersP_internal", "FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "fast_has_event_class_any_transitive_listenersP", "FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "has_event_class_any_transitive_listenersP", "HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "display_event_broker", "DISPLAY-EVENT-BROKER", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "remove_stale_core_event_customers", "REMOVE-STALE-CORE-EVENT-CUSTOMERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "remove_stale_event_customers", "REMOVE-STALE-EVENT-CUSTOMERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "register_event_listener", "REGISTER-EVENT-LISTENER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "deregister_event_listener", "DEREGISTER-EVENT-LISTENER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "register_event_socket_protocol", "REGISTER-EVENT-SOCKET-PROTOCOL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "post_event", "POST-EVENT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "receive_event", "RECEIVE-EVENT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "signal_registered_event", "SIGNAL-REGISTERED-EVENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "signal_deregistered_event", "SIGNAL-DEREGISTERED-EVENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "dispatch_event_to_listeners", "DISPATCH-EVENT-TO-LISTENERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "invoke_funcall_event_on_listener", "INVOKE-FUNCALL-EVENT-ON-LISTENER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "invoke_funcall_event_error_handler", "INVOKE-FUNCALL-EVENT-ERROR-HANDLER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "default_funcall_event_error_handler", "DEFAULT-FUNCALL-EVENT-ERROR-HANDLER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "invoke_socket_event_on_listener", "INVOKE-SOCKET-EVENT-ON-LISTENER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "invoke_event_on_listener", "INVOKE-EVENT-ON-LISTENER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "default_cfasl_event_serialize", "DEFAULT-CFASL-EVENT-SERIALIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.event_broker", "default_cfasl_params_serialize", "DEFAULT-CFASL-PARAMS-SERIALIZE", 2, 0, false);
        return (SubLObject)event_broker.NIL;
    }
    
    public static SubLObject init_event_broker_file() {
        event_broker.$should_show_event_errorsP$ = SubLFiles.deflexical("*SHOULD-SHOW-EVENT-ERRORS?*", (SubLObject)event_broker.NIL);
        event_broker.$dtp_funcall_info$ = SubLFiles.defconstant("*DTP-FUNCALL-INFO*", (SubLObject)event_broker.$sym0$FUNCALL_INFO);
        event_broker.$dtp_socket_info$ = SubLFiles.defconstant("*DTP-SOCKET-INFO*", (SubLObject)event_broker.$sym19$SOCKET_INFO);
        event_broker.$dtp_event_listener$ = SubLFiles.defconstant("*DTP-EVENT-LISTENER*", (SubLObject)event_broker.$sym39$EVENT_LISTENER);
        event_broker.$dtp_event_broker$ = SubLFiles.defconstant("*DTP-EVENT-BROKER*", (SubLObject)event_broker.$sym72$EVENT_BROKER);
        event_broker.$dtp_protocol_description$ = SubLFiles.defconstant("*DTP-PROTOCOL-DESCRIPTION*", (SubLObject)event_broker.$sym108$PROTOCOL_DESCRIPTION);
        event_broker.$event_broker$ = SubLFiles.deflexical("*EVENT-BROKER*", (SubLObject)((event_broker.NIL != Symbols.boundp((SubLObject)event_broker.$sym136$_EVENT_BROKER_)) ? event_broker.$event_broker$.getGlobalValue() : event_broker.NIL));
        event_broker.$fast_has_event_class_any_transitive_listenersP_caching_state$ = SubLFiles.deflexical("*FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?-CACHING-STATE*", (SubLObject)event_broker.NIL);
        event_broker.$deregistration_during_system_initialization$ = SubLFiles.defparameter("*DEREGISTRATION-DURING-SYSTEM-INITIALIZATION*", (SubLObject)event_broker.NIL);
        return (SubLObject)event_broker.NIL;
    }
    
    public static SubLObject setup_event_broker_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), event_broker.$dtp_funcall_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)event_broker.$sym7$FUNCALL_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)event_broker.$list8);
        Structures.def_csetf((SubLObject)event_broker.$sym9$FUNCALL_INFO_FUNCTION, (SubLObject)event_broker.$sym10$_CSETF_FUNCALL_INFO_FUNCTION);
        Equality.identity((SubLObject)event_broker.$sym0$FUNCALL_INFO);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), event_broker.$dtp_funcall_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)event_broker.$sym17$VISIT_DEFSTRUCT_OBJECT_FUNCALL_INFO_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)event_broker.$sym25$SOCKET_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)event_broker.$list26);
        Structures.def_csetf((SubLObject)event_broker.$sym27$SOCKET_INFO_HOST, (SubLObject)event_broker.$sym28$_CSETF_SOCKET_INFO_HOST);
        Structures.def_csetf((SubLObject)event_broker.$sym29$SOCKET_INFO_PORT, (SubLObject)event_broker.$sym30$_CSETF_SOCKET_INFO_PORT);
        Structures.def_csetf((SubLObject)event_broker.$sym31$SOCKET_INFO_PROTOCOL, (SubLObject)event_broker.$sym32$_CSETF_SOCKET_INFO_PROTOCOL);
        Equality.identity((SubLObject)event_broker.$sym19$SOCKET_INFO);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)event_broker.$sym37$VISIT_DEFSTRUCT_OBJECT_SOCKET_INFO_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), event_broker.$dtp_event_listener$.getGlobalValue(), Symbols.symbol_function((SubLObject)event_broker.$sym45$EVENT_LISTENER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)event_broker.$list46);
        Structures.def_csetf((SubLObject)event_broker.$sym47$EVENT_LISTENER_EVENT, (SubLObject)event_broker.$sym48$_CSETF_EVENT_LISTENER_EVENT);
        Structures.def_csetf((SubLObject)event_broker.$sym49$EVENT_LISTENER_INVOCATION_MODE, (SubLObject)event_broker.$sym50$_CSETF_EVENT_LISTENER_INVOCATION_MODE);
        Structures.def_csetf((SubLObject)event_broker.$sym51$EVENT_LISTENER_INVOCATION_INFO, (SubLObject)event_broker.$sym52$_CSETF_EVENT_LISTENER_INVOCATION_INFO);
        Structures.def_csetf((SubLObject)event_broker.$sym53$EVENT_LISTENER_MY_PARAMS, (SubLObject)event_broker.$sym54$_CSETF_EVENT_LISTENER_MY_PARAMS);
        Structures.def_csetf((SubLObject)event_broker.$sym55$EVENT_LISTENER_SOURCE_FILTER, (SubLObject)event_broker.$sym56$_CSETF_EVENT_LISTENER_SOURCE_FILTER);
        Equality.identity((SubLObject)event_broker.$sym39$EVENT_LISTENER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), event_broker.$dtp_event_listener$.getGlobalValue(), Symbols.symbol_function((SubLObject)event_broker.$sym63$VISIT_DEFSTRUCT_OBJECT_EVENT_LISTENER_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), event_broker.$dtp_event_broker$.getGlobalValue(), Symbols.symbol_function((SubLObject)event_broker.$sym78$EVENT_BROKER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)event_broker.$list79);
        Structures.def_csetf((SubLObject)event_broker.$sym80$EVENT_BROKER_HIERARCHY, (SubLObject)event_broker.$sym81$_CSETF_EVENT_BROKER_HIERARCHY);
        Structures.def_csetf((SubLObject)event_broker.$sym82$EVENT_BROKER_LISTENERS, (SubLObject)event_broker.$sym83$_CSETF_EVENT_BROKER_LISTENERS);
        Structures.def_csetf((SubLObject)event_broker.$sym84$EVENT_BROKER_LOCK, (SubLObject)event_broker.$sym85$_CSETF_EVENT_BROKER_LOCK);
        Structures.def_csetf((SubLObject)event_broker.$sym86$EVENT_BROKER_POSTINGS, (SubLObject)event_broker.$sym87$_CSETF_EVENT_BROKER_POSTINGS);
        Structures.def_csetf((SubLObject)event_broker.$sym88$EVENT_BROKER_PROTOCOLS, (SubLObject)event_broker.$sym89$_CSETF_EVENT_BROKER_PROTOCOLS);
        Equality.identity((SubLObject)event_broker.$sym72$EVENT_BROKER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), event_broker.$dtp_event_broker$.getGlobalValue(), Symbols.symbol_function((SubLObject)event_broker.$sym96$VISIT_DEFSTRUCT_OBJECT_EVENT_BROKER_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), event_broker.$dtp_protocol_description$.getGlobalValue(), Symbols.symbol_function((SubLObject)event_broker.$sym114$PROTOCOL_DESCRIPTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)event_broker.$list115);
        Structures.def_csetf((SubLObject)event_broker.$sym116$PROTOCOL_DESCRIPTION_PROTOCOL, (SubLObject)event_broker.$sym117$_CSETF_PROTOCOL_DESCRIPTION_PROTOCOL);
        Structures.def_csetf((SubLObject)event_broker.$sym118$PROTOCOL_DESCRIPTION_EVENT_SERIALIZE, (SubLObject)event_broker.$sym119$_CSETF_PROTOCOL_DESCRIPTION_EVENT_SERIALIZE);
        Structures.def_csetf((SubLObject)event_broker.$sym120$PROTOCOL_DESCRIPTION_MY_PARAMS_SERIALIZE, (SubLObject)event_broker.$sym121$_CSETF_PROTOCOL_DESCRIPTION_MY_PARAMS_SERIALIZE);
        Equality.identity((SubLObject)event_broker.$sym108$PROTOCOL_DESCRIPTION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), event_broker.$dtp_protocol_description$.getGlobalValue(), Symbols.symbol_function((SubLObject)event_broker.$sym125$VISIT_DEFSTRUCT_OBJECT_PROTOCOL_DESCRIPTION_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)event_broker.$sym136$_EVENT_BROKER_);
        memoization_state.note_globally_cached_function((SubLObject)event_broker.$sym141$FAST_HAS_EVENT_CLASS_ANY_TRANSITIVE_LISTENERS_);
        event_model.declare_base_event_class_internal((SubLObject)event_broker.$kw150$EVENT_BROKER_EVENT, (SubLObject)event_broker.$kw151$SYSTEM_EVENT, (SubLObject)event_broker.$str152$The_parent_for_all_events_that_th, (SubLObject)event_broker.NIL);
        event_model.declare_base_event_class_internal((SubLObject)event_broker.$kw153$EVENT_HANDLER_REGISTERED, (SubLObject)event_broker.$kw150$EVENT_BROKER_EVENT, (SubLObject)event_broker.$str154$The_first_message_any_event_handl, (SubLObject)event_broker.NIL);
        event_model.declare_base_event_class_internal((SubLObject)event_broker.$kw155$EVENT_HANDLER_DEREGISTERED, (SubLObject)event_broker.$kw150$EVENT_BROKER_EVENT, (SubLObject)event_broker.$str156$The_last_message_any_event_handle, (SubLObject)event_broker.NIL);
        register_event_socket_protocol((SubLObject)event_broker.$kw171$CFASL, (SubLObject)event_broker.$sym172$DEFAULT_CFASL_EVENT_SERIALIZE, (SubLObject)event_broker.$sym173$DEFAULT_CFASL_PARAMS_SERIALIZE, (SubLObject)event_broker.UNPROVIDED);
        return (SubLObject)event_broker.NIL;
    }
    
    public void declareFunctions() {
        declare_event_broker_file();
    }
    
    public void initializeVariables() {
        init_event_broker_file();
    }
    
    public void runTopLevelForms() {
        setup_event_broker_file();
    }
    
    static {
        me = (SubLFile)new event_broker();
        event_broker.$should_show_event_errorsP$ = null;
        event_broker.$dtp_funcall_info$ = null;
        event_broker.$dtp_socket_info$ = null;
        event_broker.$dtp_event_listener$ = null;
        event_broker.$dtp_event_broker$ = null;
        event_broker.$dtp_protocol_description$ = null;
        event_broker.$event_broker$ = null;
        event_broker.$fast_has_event_class_any_transitive_listenersP_caching_state$ = null;
        event_broker.$deregistration_during_system_initialization$ = null;
        $sym0$FUNCALL_INFO = SubLObjectFactory.makeSymbol("FUNCALL-INFO");
        $sym1$FUNCALL_INFO_P = SubLObjectFactory.makeSymbol("FUNCALL-INFO-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FUNCTION"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INFO-FUNCTION"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FUNCALL-INFO-FUNCTION"));
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$FUNCALL_INFO_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FUNCALL-INFO-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INFO-P"));
        $sym9$FUNCALL_INFO_FUNCTION = SubLObjectFactory.makeSymbol("FUNCALL-INFO-FUNCTION");
        $sym10$_CSETF_FUNCALL_INFO_FUNCTION = SubLObjectFactory.makeSymbol("_CSETF-FUNCALL-INFO-FUNCTION");
        $kw11$FUNCTION = SubLObjectFactory.makeKeyword("FUNCTION");
        $str12$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw13$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym14$MAKE_FUNCALL_INFO = SubLObjectFactory.makeSymbol("MAKE-FUNCALL-INFO");
        $kw15$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw16$END = SubLObjectFactory.makeKeyword("END");
        $sym17$VISIT_DEFSTRUCT_OBJECT_FUNCALL_INFO_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FUNCALL-INFO-METHOD");
        $str18$_funcall__S_ = SubLObjectFactory.makeString(":funcall ~S ");
        $sym19$SOCKET_INFO = SubLObjectFactory.makeSymbol("SOCKET-INFO");
        $sym20$SOCKET_INFO_P = SubLObjectFactory.makeSymbol("SOCKET-INFO-P");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HOST"), (SubLObject)SubLObjectFactory.makeSymbol("PORT"), (SubLObject)SubLObjectFactory.makeSymbol("PROTOCOL"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HOST"), (SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeKeyword("PROTOCOL"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SOCKET-INFO-HOST"), (SubLObject)SubLObjectFactory.makeSymbol("SOCKET-INFO-PORT"), (SubLObject)SubLObjectFactory.makeSymbol("SOCKET-INFO-PROTOCOL"));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SOCKET-INFO-HOST"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SOCKET-INFO-PORT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SOCKET-INFO-PROTOCOL"));
        $sym25$SOCKET_INFO_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SOCKET-INFO-PRINT-FUNCTION-TRAMPOLINE");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SOCKET-INFO-P"));
        $sym27$SOCKET_INFO_HOST = SubLObjectFactory.makeSymbol("SOCKET-INFO-HOST");
        $sym28$_CSETF_SOCKET_INFO_HOST = SubLObjectFactory.makeSymbol("_CSETF-SOCKET-INFO-HOST");
        $sym29$SOCKET_INFO_PORT = SubLObjectFactory.makeSymbol("SOCKET-INFO-PORT");
        $sym30$_CSETF_SOCKET_INFO_PORT = SubLObjectFactory.makeSymbol("_CSETF-SOCKET-INFO-PORT");
        $sym31$SOCKET_INFO_PROTOCOL = SubLObjectFactory.makeSymbol("SOCKET-INFO-PROTOCOL");
        $sym32$_CSETF_SOCKET_INFO_PROTOCOL = SubLObjectFactory.makeSymbol("_CSETF-SOCKET-INFO-PROTOCOL");
        $kw33$HOST = SubLObjectFactory.makeKeyword("HOST");
        $kw34$PORT = SubLObjectFactory.makeKeyword("PORT");
        $kw35$PROTOCOL = SubLObjectFactory.makeKeyword("PROTOCOL");
        $sym36$MAKE_SOCKET_INFO = SubLObjectFactory.makeSymbol("MAKE-SOCKET-INFO");
        $sym37$VISIT_DEFSTRUCT_OBJECT_SOCKET_INFO_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SOCKET-INFO-METHOD");
        $str38$_socket__S__S__S_ = SubLObjectFactory.makeString(":socket ~S ~S ~S ");
        $sym39$EVENT_LISTENER = SubLObjectFactory.makeSymbol("EVENT-LISTENER");
        $sym40$EVENT_LISTENER_P = SubLObjectFactory.makeSymbol("EVENT-LISTENER-P");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("INVOCATION-MODE"), (SubLObject)SubLObjectFactory.makeSymbol("INVOCATION-INFO"), (SubLObject)SubLObjectFactory.makeSymbol("MY-PARAMS"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE-FILTER"));
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EVENT"), (SubLObject)SubLObjectFactory.makeKeyword("INVOCATION-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("INVOCATION-INFO"), (SubLObject)SubLObjectFactory.makeKeyword("MY-PARAMS"), (SubLObject)SubLObjectFactory.makeKeyword("SOURCE-FILTER"));
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVENT-LISTENER-EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT-LISTENER-INVOCATION-MODE"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT-LISTENER-INVOCATION-INFO"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT-LISTENER-MY-PARAMS"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT-LISTENER-SOURCE-FILTER"));
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EVENT-LISTENER-EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EVENT-LISTENER-INVOCATION-MODE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EVENT-LISTENER-INVOCATION-INFO"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EVENT-LISTENER-MY-PARAMS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EVENT-LISTENER-SOURCE-FILTER"));
        $sym45$EVENT_LISTENER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("EVENT-LISTENER-PRINT-FUNCTION-TRAMPOLINE");
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT-LISTENER-P"));
        $sym47$EVENT_LISTENER_EVENT = SubLObjectFactory.makeSymbol("EVENT-LISTENER-EVENT");
        $sym48$_CSETF_EVENT_LISTENER_EVENT = SubLObjectFactory.makeSymbol("_CSETF-EVENT-LISTENER-EVENT");
        $sym49$EVENT_LISTENER_INVOCATION_MODE = SubLObjectFactory.makeSymbol("EVENT-LISTENER-INVOCATION-MODE");
        $sym50$_CSETF_EVENT_LISTENER_INVOCATION_MODE = SubLObjectFactory.makeSymbol("_CSETF-EVENT-LISTENER-INVOCATION-MODE");
        $sym51$EVENT_LISTENER_INVOCATION_INFO = SubLObjectFactory.makeSymbol("EVENT-LISTENER-INVOCATION-INFO");
        $sym52$_CSETF_EVENT_LISTENER_INVOCATION_INFO = SubLObjectFactory.makeSymbol("_CSETF-EVENT-LISTENER-INVOCATION-INFO");
        $sym53$EVENT_LISTENER_MY_PARAMS = SubLObjectFactory.makeSymbol("EVENT-LISTENER-MY-PARAMS");
        $sym54$_CSETF_EVENT_LISTENER_MY_PARAMS = SubLObjectFactory.makeSymbol("_CSETF-EVENT-LISTENER-MY-PARAMS");
        $sym55$EVENT_LISTENER_SOURCE_FILTER = SubLObjectFactory.makeSymbol("EVENT-LISTENER-SOURCE-FILTER");
        $sym56$_CSETF_EVENT_LISTENER_SOURCE_FILTER = SubLObjectFactory.makeSymbol("_CSETF-EVENT-LISTENER-SOURCE-FILTER");
        $kw57$EVENT = SubLObjectFactory.makeKeyword("EVENT");
        $kw58$INVOCATION_MODE = SubLObjectFactory.makeKeyword("INVOCATION-MODE");
        $kw59$INVOCATION_INFO = SubLObjectFactory.makeKeyword("INVOCATION-INFO");
        $kw60$MY_PARAMS = SubLObjectFactory.makeKeyword("MY-PARAMS");
        $kw61$SOURCE_FILTER = SubLObjectFactory.makeKeyword("SOURCE-FILTER");
        $sym62$MAKE_EVENT_LISTENER = SubLObjectFactory.makeSymbol("MAKE-EVENT-LISTENER");
        $sym63$VISIT_DEFSTRUCT_OBJECT_EVENT_LISTENER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-EVENT-LISTENER-METHOD");
        $sym64$FALSE = SubLObjectFactory.makeSymbol("FALSE");
        $kw65$FUNCALL = SubLObjectFactory.makeKeyword("FUNCALL");
        $kw66$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw67$SOCKET = SubLObjectFactory.makeKeyword("SOCKET");
        $str68$_S_listener_ = SubLObjectFactory.makeString("~S listener ");
        $str69$_S__unknown_mode__ = SubLObjectFactory.makeString("~S (unknown mode) ");
        $str70$_with_parameters__S_ = SubLObjectFactory.makeString(" with parameters ~S ");
        $str71$_source_filtering__S = SubLObjectFactory.makeString(" source filtering ~S");
        $sym72$EVENT_BROKER = SubLObjectFactory.makeSymbol("EVENT-BROKER");
        $sym73$EVENT_BROKER_P = SubLObjectFactory.makeSymbol("EVENT-BROKER-P");
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HIERARCHY"), (SubLObject)SubLObjectFactory.makeSymbol("LISTENERS"), (SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("POSTINGS"), (SubLObject)SubLObjectFactory.makeSymbol("PROTOCOLS"));
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HIERARCHY"), (SubLObject)SubLObjectFactory.makeKeyword("LISTENERS"), (SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("POSTINGS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTOCOLS"));
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVENT-BROKER-HIERARCHY"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT-BROKER-LISTENERS"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT-BROKER-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT-BROKER-POSTINGS"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT-BROKER-PROTOCOLS"));
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EVENT-BROKER-HIERARCHY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EVENT-BROKER-LISTENERS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EVENT-BROKER-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EVENT-BROKER-POSTINGS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-EVENT-BROKER-PROTOCOLS"));
        $sym78$EVENT_BROKER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("EVENT-BROKER-PRINT-FUNCTION-TRAMPOLINE");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT-BROKER-P"));
        $sym80$EVENT_BROKER_HIERARCHY = SubLObjectFactory.makeSymbol("EVENT-BROKER-HIERARCHY");
        $sym81$_CSETF_EVENT_BROKER_HIERARCHY = SubLObjectFactory.makeSymbol("_CSETF-EVENT-BROKER-HIERARCHY");
        $sym82$EVENT_BROKER_LISTENERS = SubLObjectFactory.makeSymbol("EVENT-BROKER-LISTENERS");
        $sym83$_CSETF_EVENT_BROKER_LISTENERS = SubLObjectFactory.makeSymbol("_CSETF-EVENT-BROKER-LISTENERS");
        $sym84$EVENT_BROKER_LOCK = SubLObjectFactory.makeSymbol("EVENT-BROKER-LOCK");
        $sym85$_CSETF_EVENT_BROKER_LOCK = SubLObjectFactory.makeSymbol("_CSETF-EVENT-BROKER-LOCK");
        $sym86$EVENT_BROKER_POSTINGS = SubLObjectFactory.makeSymbol("EVENT-BROKER-POSTINGS");
        $sym87$_CSETF_EVENT_BROKER_POSTINGS = SubLObjectFactory.makeSymbol("_CSETF-EVENT-BROKER-POSTINGS");
        $sym88$EVENT_BROKER_PROTOCOLS = SubLObjectFactory.makeSymbol("EVENT-BROKER-PROTOCOLS");
        $sym89$_CSETF_EVENT_BROKER_PROTOCOLS = SubLObjectFactory.makeSymbol("_CSETF-EVENT-BROKER-PROTOCOLS");
        $kw90$HIERARCHY = SubLObjectFactory.makeKeyword("HIERARCHY");
        $kw91$LISTENERS = SubLObjectFactory.makeKeyword("LISTENERS");
        $kw92$LOCK = SubLObjectFactory.makeKeyword("LOCK");
        $kw93$POSTINGS = SubLObjectFactory.makeKeyword("POSTINGS");
        $kw94$PROTOCOLS = SubLObjectFactory.makeKeyword("PROTOCOLS");
        $sym95$MAKE_EVENT_BROKER = SubLObjectFactory.makeSymbol("MAKE-EVENT-BROKER");
        $sym96$VISIT_DEFSTRUCT_OBJECT_EVENT_BROKER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-EVENT-BROKER-METHOD");
        $list97 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVENT-BROKER")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym98$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $list99 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTENER"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("BROKER")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym100$LISTENERS = SubLObjectFactory.makeUninternedSymbol("LISTENERS");
        $sym101$EVENT_LISTENERS = SubLObjectFactory.makeUninternedSymbol("EVENT-LISTENERS");
        $sym102$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym103$WITH_EVENT_BROKER_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-EVENT-BROKER-LOCK-HELD");
        $sym104$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list105 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVENT-BROKER-LISTENERS"), (SubLObject)SubLObjectFactory.makeSymbol("BROKER")));
        $sym106$DICTIONARY_LOOKUP = SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP");
        $sym107$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym108$PROTOCOL_DESCRIPTION = SubLObjectFactory.makeSymbol("PROTOCOL-DESCRIPTION");
        $sym109$PROTOCOL_DESCRIPTION_P = SubLObjectFactory.makeSymbol("PROTOCOL-DESCRIPTION-P");
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROTOCOL"), (SubLObject)SubLObjectFactory.makeSymbol("EVENT-SERIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("MY-PARAMS-SERIALIZE"));
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTOCOL"), (SubLObject)SubLObjectFactory.makeKeyword("EVENT-SERIALIZE"), (SubLObject)SubLObjectFactory.makeKeyword("MY-PARAMS-SERIALIZE"));
        $list112 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROTOCOL-DESCRIPTION-PROTOCOL"), (SubLObject)SubLObjectFactory.makeSymbol("PROTOCOL-DESCRIPTION-EVENT-SERIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("PROTOCOL-DESCRIPTION-MY-PARAMS-SERIALIZE"));
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROTOCOL-DESCRIPTION-PROTOCOL"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROTOCOL-DESCRIPTION-EVENT-SERIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROTOCOL-DESCRIPTION-MY-PARAMS-SERIALIZE"));
        $sym114$PROTOCOL_DESCRIPTION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PROTOCOL-DESCRIPTION-PRINT-FUNCTION-TRAMPOLINE");
        $list115 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PROTOCOL-DESCRIPTION-P"));
        $sym116$PROTOCOL_DESCRIPTION_PROTOCOL = SubLObjectFactory.makeSymbol("PROTOCOL-DESCRIPTION-PROTOCOL");
        $sym117$_CSETF_PROTOCOL_DESCRIPTION_PROTOCOL = SubLObjectFactory.makeSymbol("_CSETF-PROTOCOL-DESCRIPTION-PROTOCOL");
        $sym118$PROTOCOL_DESCRIPTION_EVENT_SERIALIZE = SubLObjectFactory.makeSymbol("PROTOCOL-DESCRIPTION-EVENT-SERIALIZE");
        $sym119$_CSETF_PROTOCOL_DESCRIPTION_EVENT_SERIALIZE = SubLObjectFactory.makeSymbol("_CSETF-PROTOCOL-DESCRIPTION-EVENT-SERIALIZE");
        $sym120$PROTOCOL_DESCRIPTION_MY_PARAMS_SERIALIZE = SubLObjectFactory.makeSymbol("PROTOCOL-DESCRIPTION-MY-PARAMS-SERIALIZE");
        $sym121$_CSETF_PROTOCOL_DESCRIPTION_MY_PARAMS_SERIALIZE = SubLObjectFactory.makeSymbol("_CSETF-PROTOCOL-DESCRIPTION-MY-PARAMS-SERIALIZE");
        $kw122$EVENT_SERIALIZE = SubLObjectFactory.makeKeyword("EVENT-SERIALIZE");
        $kw123$MY_PARAMS_SERIALIZE = SubLObjectFactory.makeKeyword("MY-PARAMS-SERIALIZE");
        $sym124$MAKE_PROTOCOL_DESCRIPTION = SubLObjectFactory.makeSymbol("MAKE-PROTOCOL-DESCRIPTION");
        $sym125$VISIT_DEFSTRUCT_OBJECT_PROTOCOL_DESCRIPTION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROTOCOL-DESCRIPTION-METHOD");
        $str126$Protocol__S____for_Event___S____f = SubLObjectFactory.makeString("Protocol ~S // for Event: ~S // for Params: ~S");
        $str127$_event_code__S_ = SubLObjectFactory.makeString("<event code=~S ");
        $str128$timestamp__S_ = SubLObjectFactory.makeString("timestamp=~S ");
        $str129$source__S_ = SubLObjectFactory.makeString("source=~S ");
        $str130$message__S__ = SubLObjectFactory.makeString("message=~S/>");
        $str131$_parameter_key__mine__value__S__ = SubLObjectFactory.makeString("<parameter key=\"mine\" value=~S/>");
        $str132$Event_Broker_Lock = SubLObjectFactory.makeString("Event Broker Lock");
        $str133$Event_Broker_Queue = SubLObjectFactory.makeString("Event Broker Queue");
        $sym134$DEFAULT_EVENT_SERIALIZE = SubLObjectFactory.makeSymbol("DEFAULT-EVENT-SERIALIZE");
        $sym135$DEFAULT_MY_PARAMS_SERIALIZE = SubLObjectFactory.makeSymbol("DEFAULT-MY-PARAMS-SERIALIZE");
        $sym136$_EVENT_BROKER_ = SubLObjectFactory.makeSymbol("*EVENT-BROKER*");
        $list137 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVENT-BROKER"));
        $sym138$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym139$NULL = SubLObjectFactory.makeSymbol("NULL");
        $list140 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENSURE-EVENT-BROKER")));
        $sym141$FAST_HAS_EVENT_CLASS_ANY_TRANSITIVE_LISTENERS_ = SubLObjectFactory.makeSymbol("FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?");
        $sym142$_FAST_HAS_EVENT_CLASS_ANY_TRANSITIVE_LISTENERS__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?-CACHING-STATE*");
        $kw143$EVENT_ROOT = SubLObjectFactory.makeKeyword("EVENT-ROOT");
        $str144$Event_Broker_settings__ = SubLObjectFactory.makeString("Event Broker settings~%");
        $sym145$EVENT_HIERARCHY_P = SubLObjectFactory.makeSymbol("EVENT-HIERARCHY-P");
        $str146$__Listening_for__S____ = SubLObjectFactory.makeString("  Listening for ~S :~%");
        $str147$__ = SubLObjectFactory.makeString("  ");
        $str148$__Defined_protocols___ = SubLObjectFactory.makeString("  Defined protocols:~%");
        $str149$____ = SubLObjectFactory.makeString("    ");
        $kw150$EVENT_BROKER_EVENT = SubLObjectFactory.makeKeyword("EVENT-BROKER-EVENT");
        $kw151$SYSTEM_EVENT = SubLObjectFactory.makeKeyword("SYSTEM-EVENT");
        $str152$The_parent_for_all_events_that_th = SubLObjectFactory.makeString("The parent for all events that the event broker uses for the meta-communication.");
        $kw153$EVENT_HANDLER_REGISTERED = SubLObjectFactory.makeKeyword("EVENT-HANDLER-REGISTERED");
        $str154$The_first_message_any_event_handl = SubLObjectFactory.makeString("The first message any event handler sees.");
        $kw155$EVENT_HANDLER_DEREGISTERED = SubLObjectFactory.makeKeyword("EVENT-HANDLER-DEREGISTERED");
        $str156$The_last_message_any_event_handle = SubLObjectFactory.makeString("The last message any event handler sees.");
        $sym157$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $str158$success = SubLObjectFactory.makeString("success");
        $kw159$BROKER = SubLObjectFactory.makeKeyword("BROKER");
        $sym160$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym161$EVENT_P = SubLObjectFactory.makeSymbol("EVENT-P");
        $sym162$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym163$DEFAULT_FUNCALL_EVENT_ERROR_HANDLER = SubLObjectFactory.makeSymbol("DEFAULT-FUNCALL-EVENT-ERROR-HANDLER");
        $str164$Error_during_processing_of_event_ = SubLObjectFactory.makeString("Error during processing of event: ~A~%~A~%");
        $kw165$PUBLIC = SubLObjectFactory.makeKeyword("PUBLIC");
        $str166$Unknown_mode_of_invocation__S____ = SubLObjectFactory.makeString("Unknown mode of invocation ~S -- cannot dispatch event to listener ~S.");
        $kw167$CLASS = SubLObjectFactory.makeKeyword("CLASS");
        $kw168$TIMESTAMP = SubLObjectFactory.makeKeyword("TIMESTAMP");
        $kw169$MESSAGE = SubLObjectFactory.makeKeyword("MESSAGE");
        $kw170$SOURCE = SubLObjectFactory.makeKeyword("SOURCE");
        $kw171$CFASL = SubLObjectFactory.makeKeyword("CFASL");
        $sym172$DEFAULT_CFASL_EVENT_SERIALIZE = SubLObjectFactory.makeSymbol("DEFAULT-CFASL-EVENT-SERIALIZE");
        $sym173$DEFAULT_CFASL_PARAMS_SERIALIZE = SubLObjectFactory.makeSymbol("DEFAULT-CFASL-PARAMS-SERIALIZE");
    }
    
    public static final class $funcall_info_native extends SubLStructNative
    {
        public SubLObject $function;
        private static final SubLStructDeclNative structDecl;
        
        public $funcall_info_native() {
            this.$function = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$funcall_info_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$function;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$function = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$funcall_info_native.class, event_broker.$sym0$FUNCALL_INFO, event_broker.$sym1$FUNCALL_INFO_P, event_broker.$list2, event_broker.$list3, new String[] { "$function" }, event_broker.$list4, event_broker.$list5, event_broker.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $funcall_info_p$UnaryFunction extends UnaryFunction
    {
        public $funcall_info_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FUNCALL-INFO-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return event_broker.funcall_info_p(arg1);
        }
    }
    
    public static final class $socket_info_native extends SubLStructNative
    {
        public SubLObject $host;
        public SubLObject $port;
        public SubLObject $protocol;
        private static final SubLStructDeclNative structDecl;
        
        public $socket_info_native() {
            this.$host = (SubLObject)CommonSymbols.NIL;
            this.$port = (SubLObject)CommonSymbols.NIL;
            this.$protocol = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$socket_info_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$host;
        }
        
        public SubLObject getField3() {
            return this.$port;
        }
        
        public SubLObject getField4() {
            return this.$protocol;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$host = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$port = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$protocol = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$socket_info_native.class, event_broker.$sym19$SOCKET_INFO, event_broker.$sym20$SOCKET_INFO_P, event_broker.$list21, event_broker.$list22, new String[] { "$host", "$port", "$protocol" }, event_broker.$list23, event_broker.$list24, event_broker.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $socket_info_p$UnaryFunction extends UnaryFunction
    {
        public $socket_info_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SOCKET-INFO-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return event_broker.socket_info_p(arg1);
        }
    }
    
    public static final class $event_listener_native extends SubLStructNative
    {
        public SubLObject $event;
        public SubLObject $invocation_mode;
        public SubLObject $invocation_info;
        public SubLObject $my_params;
        public SubLObject $source_filter;
        private static final SubLStructDeclNative structDecl;
        
        public $event_listener_native() {
            this.$event = (SubLObject)CommonSymbols.NIL;
            this.$invocation_mode = (SubLObject)CommonSymbols.NIL;
            this.$invocation_info = (SubLObject)CommonSymbols.NIL;
            this.$my_params = (SubLObject)CommonSymbols.NIL;
            this.$source_filter = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$event_listener_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$event;
        }
        
        public SubLObject getField3() {
            return this.$invocation_mode;
        }
        
        public SubLObject getField4() {
            return this.$invocation_info;
        }
        
        public SubLObject getField5() {
            return this.$my_params;
        }
        
        public SubLObject getField6() {
            return this.$source_filter;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$event = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$invocation_mode = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$invocation_info = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$my_params = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$source_filter = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$event_listener_native.class, event_broker.$sym39$EVENT_LISTENER, event_broker.$sym40$EVENT_LISTENER_P, event_broker.$list41, event_broker.$list42, new String[] { "$event", "$invocation_mode", "$invocation_info", "$my_params", "$source_filter" }, event_broker.$list43, event_broker.$list44, event_broker.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $event_listener_p$UnaryFunction extends UnaryFunction
    {
        public $event_listener_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("EVENT-LISTENER-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return event_broker.event_listener_p(arg1);
        }
    }
    
    public static final class $event_broker_native extends SubLStructNative
    {
        public SubLObject $hierarchy;
        public SubLObject $listeners;
        public SubLObject $lock;
        public SubLObject $postings;
        public SubLObject $protocols;
        private static final SubLStructDeclNative structDecl;
        
        public $event_broker_native() {
            this.$hierarchy = (SubLObject)CommonSymbols.NIL;
            this.$listeners = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$postings = (SubLObject)CommonSymbols.NIL;
            this.$protocols = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$event_broker_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$hierarchy;
        }
        
        public SubLObject getField3() {
            return this.$listeners;
        }
        
        public SubLObject getField4() {
            return this.$lock;
        }
        
        public SubLObject getField5() {
            return this.$postings;
        }
        
        public SubLObject getField6() {
            return this.$protocols;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$hierarchy = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$listeners = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$postings = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$protocols = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$event_broker_native.class, event_broker.$sym72$EVENT_BROKER, event_broker.$sym73$EVENT_BROKER_P, event_broker.$list74, event_broker.$list75, new String[] { "$hierarchy", "$listeners", "$lock", "$postings", "$protocols" }, event_broker.$list76, event_broker.$list77, event_broker.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $event_broker_p$UnaryFunction extends UnaryFunction
    {
        public $event_broker_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("EVENT-BROKER-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return event_broker.event_broker_p(arg1);
        }
    }
    
    public static final class $protocol_description_native extends SubLStructNative
    {
        public SubLObject $protocol;
        public SubLObject $event_serialize;
        public SubLObject $my_params_serialize;
        private static final SubLStructDeclNative structDecl;
        
        public $protocol_description_native() {
            this.$protocol = (SubLObject)CommonSymbols.NIL;
            this.$event_serialize = (SubLObject)CommonSymbols.NIL;
            this.$my_params_serialize = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$protocol_description_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$protocol;
        }
        
        public SubLObject getField3() {
            return this.$event_serialize;
        }
        
        public SubLObject getField4() {
            return this.$my_params_serialize;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$protocol = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$event_serialize = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$my_params_serialize = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$protocol_description_native.class, event_broker.$sym108$PROTOCOL_DESCRIPTION, event_broker.$sym109$PROTOCOL_DESCRIPTION_P, event_broker.$list110, event_broker.$list111, new String[] { "$protocol", "$event_serialize", "$my_params_serialize" }, event_broker.$list112, event_broker.$list113, event_broker.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $protocol_description_p$UnaryFunction extends UnaryFunction
    {
        public $protocol_description_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PROTOCOL-DESCRIPTION-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return event_broker.protocol_description_p(arg1);
        }
    }
}

/*

	Total time: 418 ms
	
*/