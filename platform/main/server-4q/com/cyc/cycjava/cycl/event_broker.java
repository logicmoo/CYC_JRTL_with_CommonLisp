package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.event_broker.$event_broker_native;
import com.cyc.cycjava.cycl.event_broker.$event_listener_native;
import com.cyc.cycjava.cycl.event_broker.$funcall_info_native;
import com.cyc.cycjava.cycl.event_broker.$protocol_description_native;
import com.cyc.cycjava.cycl.event_broker.$socket_info_native;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class event_broker extends SubLTranslatedFile {
    public static final SubLFile me = new event_broker();

    public static final String myName = "com.cyc.cycjava.cycl.event_broker";

    public static final String myFingerPrint = "0e5df71e8b9e82aab9b5bb34d0fcb45e3e196ccf204271b150b32056199e96c8";

    // deflexical
    public static final SubLSymbol $should_show_event_errorsP$ = makeSymbol("*SHOULD-SHOW-EVENT-ERRORS?*");

    // defconstant
    public static final SubLSymbol $dtp_funcall_info$ = makeSymbol("*DTP-FUNCALL-INFO*");

    // defconstant
    public static final SubLSymbol $dtp_socket_info$ = makeSymbol("*DTP-SOCKET-INFO*");

    // defconstant
    public static final SubLSymbol $dtp_event_listener$ = makeSymbol("*DTP-EVENT-LISTENER*");

    // defconstant
    public static final SubLSymbol $dtp_event_broker$ = makeSymbol("*DTP-EVENT-BROKER*");

    // defconstant
    public static final SubLSymbol $dtp_protocol_description$ = makeSymbol("*DTP-PROTOCOL-DESCRIPTION*");



    // deflexical
    private static final SubLSymbol $fast_has_event_class_any_transitive_listenersP_caching_state$ = makeSymbol("*FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?-CACHING-STATE*");

    // defparameter
    private static final SubLSymbol $deregistration_during_system_initialization$ = makeSymbol("*DEREGISTRATION-DURING-SYSTEM-INITIALIZATION*");

    // Internal Constants
    public static final SubLSymbol FUNCALL_INFO = makeSymbol("FUNCALL-INFO");

    public static final SubLSymbol FUNCALL_INFO_P = makeSymbol("FUNCALL-INFO-P");

    public static final SubLList $list2 = list(makeSymbol("FUNCTION"));

    public static final SubLList $list3 = list(makeKeyword("FUNCTION"));

    public static final SubLList $list4 = list(makeSymbol("FUNCALL-INFO-FUNCTION"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-FUNCALL-INFO-FUNCTION"));



    public static final SubLSymbol FUNCALL_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FUNCALL-INFO-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FUNCALL-INFO-P"));

    private static final SubLSymbol FUNCALL_INFO_FUNCTION = makeSymbol("FUNCALL-INFO-FUNCTION");

    private static final SubLSymbol _CSETF_FUNCALL_INFO_FUNCTION = makeSymbol("_CSETF-FUNCALL-INFO-FUNCTION");



    private static final SubLString $str12$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_FUNCALL_INFO = makeSymbol("MAKE-FUNCALL-INFO");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FUNCALL_INFO_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FUNCALL-INFO-METHOD");

    private static final SubLString $str18$_funcall__S_ = makeString(":funcall ~S ");

    private static final SubLSymbol SOCKET_INFO = makeSymbol("SOCKET-INFO");

    private static final SubLSymbol SOCKET_INFO_P = makeSymbol("SOCKET-INFO-P");

    private static final SubLList $list21 = list(makeSymbol("HOST"), makeSymbol("PORT"), makeSymbol("PROTOCOL"));

    private static final SubLList $list22 = list(makeKeyword("HOST"), makeKeyword("PORT"), makeKeyword("PROTOCOL"));

    private static final SubLList $list23 = list(makeSymbol("SOCKET-INFO-HOST"), makeSymbol("SOCKET-INFO-PORT"), makeSymbol("SOCKET-INFO-PROTOCOL"));

    private static final SubLList $list24 = list(makeSymbol("_CSETF-SOCKET-INFO-HOST"), makeSymbol("_CSETF-SOCKET-INFO-PORT"), makeSymbol("_CSETF-SOCKET-INFO-PROTOCOL"));

    private static final SubLSymbol SOCKET_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SOCKET-INFO-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list26 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SOCKET-INFO-P"));

    private static final SubLSymbol SOCKET_INFO_HOST = makeSymbol("SOCKET-INFO-HOST");

    private static final SubLSymbol _CSETF_SOCKET_INFO_HOST = makeSymbol("_CSETF-SOCKET-INFO-HOST");

    private static final SubLSymbol SOCKET_INFO_PORT = makeSymbol("SOCKET-INFO-PORT");

    private static final SubLSymbol _CSETF_SOCKET_INFO_PORT = makeSymbol("_CSETF-SOCKET-INFO-PORT");

    private static final SubLSymbol SOCKET_INFO_PROTOCOL = makeSymbol("SOCKET-INFO-PROTOCOL");

    private static final SubLSymbol _CSETF_SOCKET_INFO_PROTOCOL = makeSymbol("_CSETF-SOCKET-INFO-PROTOCOL");







    private static final SubLSymbol MAKE_SOCKET_INFO = makeSymbol("MAKE-SOCKET-INFO");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SOCKET_INFO_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SOCKET-INFO-METHOD");

    private static final SubLString $str38$_socket__S__S__S_ = makeString(":socket ~S ~S ~S ");

    private static final SubLSymbol EVENT_LISTENER = makeSymbol("EVENT-LISTENER");

    private static final SubLSymbol EVENT_LISTENER_P = makeSymbol("EVENT-LISTENER-P");

    private static final SubLList $list41 = list(makeSymbol("EVENT"), makeSymbol("INVOCATION-MODE"), makeSymbol("INVOCATION-INFO"), makeSymbol("MY-PARAMS"), makeSymbol("SOURCE-FILTER"));

    private static final SubLList $list42 = list(makeKeyword("EVENT"), makeKeyword("INVOCATION-MODE"), makeKeyword("INVOCATION-INFO"), makeKeyword("MY-PARAMS"), makeKeyword("SOURCE-FILTER"));

    private static final SubLList $list43 = list(makeSymbol("EVENT-LISTENER-EVENT"), makeSymbol("EVENT-LISTENER-INVOCATION-MODE"), makeSymbol("EVENT-LISTENER-INVOCATION-INFO"), makeSymbol("EVENT-LISTENER-MY-PARAMS"), makeSymbol("EVENT-LISTENER-SOURCE-FILTER"));

    private static final SubLList $list44 = list(makeSymbol("_CSETF-EVENT-LISTENER-EVENT"), makeSymbol("_CSETF-EVENT-LISTENER-INVOCATION-MODE"), makeSymbol("_CSETF-EVENT-LISTENER-INVOCATION-INFO"), makeSymbol("_CSETF-EVENT-LISTENER-MY-PARAMS"), makeSymbol("_CSETF-EVENT-LISTENER-SOURCE-FILTER"));

    private static final SubLSymbol EVENT_LISTENER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("EVENT-LISTENER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list46 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("EVENT-LISTENER-P"));

    private static final SubLSymbol EVENT_LISTENER_EVENT = makeSymbol("EVENT-LISTENER-EVENT");

    private static final SubLSymbol _CSETF_EVENT_LISTENER_EVENT = makeSymbol("_CSETF-EVENT-LISTENER-EVENT");

    private static final SubLSymbol EVENT_LISTENER_INVOCATION_MODE = makeSymbol("EVENT-LISTENER-INVOCATION-MODE");

    private static final SubLSymbol _CSETF_EVENT_LISTENER_INVOCATION_MODE = makeSymbol("_CSETF-EVENT-LISTENER-INVOCATION-MODE");

    private static final SubLSymbol EVENT_LISTENER_INVOCATION_INFO = makeSymbol("EVENT-LISTENER-INVOCATION-INFO");

    private static final SubLSymbol _CSETF_EVENT_LISTENER_INVOCATION_INFO = makeSymbol("_CSETF-EVENT-LISTENER-INVOCATION-INFO");

    private static final SubLSymbol EVENT_LISTENER_MY_PARAMS = makeSymbol("EVENT-LISTENER-MY-PARAMS");

    private static final SubLSymbol _CSETF_EVENT_LISTENER_MY_PARAMS = makeSymbol("_CSETF-EVENT-LISTENER-MY-PARAMS");

    private static final SubLSymbol EVENT_LISTENER_SOURCE_FILTER = makeSymbol("EVENT-LISTENER-SOURCE-FILTER");

    private static final SubLSymbol _CSETF_EVENT_LISTENER_SOURCE_FILTER = makeSymbol("_CSETF-EVENT-LISTENER-SOURCE-FILTER");











    private static final SubLSymbol MAKE_EVENT_LISTENER = makeSymbol("MAKE-EVENT-LISTENER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_EVENT_LISTENER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-EVENT-LISTENER-METHOD");









    private static final SubLString $str68$_S_listener_ = makeString("~S listener ");

    private static final SubLString $str69$_S__unknown_mode__ = makeString("~S (unknown mode) ");

    private static final SubLString $str70$_with_parameters__S_ = makeString(" with parameters ~S ");

    private static final SubLString $str71$_source_filtering__S = makeString(" source filtering ~S");

    private static final SubLSymbol EVENT_BROKER = makeSymbol("EVENT-BROKER");

    private static final SubLSymbol EVENT_BROKER_P = makeSymbol("EVENT-BROKER-P");

    private static final SubLList $list74 = list(makeSymbol("HIERARCHY"), makeSymbol("LISTENERS"), makeSymbol("LOCK"), makeSymbol("POSTINGS"), makeSymbol("PROTOCOLS"));

    private static final SubLList $list75 = list(makeKeyword("HIERARCHY"), makeKeyword("LISTENERS"), makeKeyword("LOCK"), makeKeyword("POSTINGS"), makeKeyword("PROTOCOLS"));

    private static final SubLList $list76 = list(makeSymbol("EVENT-BROKER-HIERARCHY"), makeSymbol("EVENT-BROKER-LISTENERS"), makeSymbol("EVENT-BROKER-LOCK"), makeSymbol("EVENT-BROKER-POSTINGS"), makeSymbol("EVENT-BROKER-PROTOCOLS"));

    private static final SubLList $list77 = list(makeSymbol("_CSETF-EVENT-BROKER-HIERARCHY"), makeSymbol("_CSETF-EVENT-BROKER-LISTENERS"), makeSymbol("_CSETF-EVENT-BROKER-LOCK"), makeSymbol("_CSETF-EVENT-BROKER-POSTINGS"), makeSymbol("_CSETF-EVENT-BROKER-PROTOCOLS"));

    private static final SubLSymbol EVENT_BROKER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("EVENT-BROKER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list79 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("EVENT-BROKER-P"));

    private static final SubLSymbol EVENT_BROKER_HIERARCHY = makeSymbol("EVENT-BROKER-HIERARCHY");

    private static final SubLSymbol _CSETF_EVENT_BROKER_HIERARCHY = makeSymbol("_CSETF-EVENT-BROKER-HIERARCHY");

    private static final SubLSymbol EVENT_BROKER_LISTENERS = makeSymbol("EVENT-BROKER-LISTENERS");

    private static final SubLSymbol _CSETF_EVENT_BROKER_LISTENERS = makeSymbol("_CSETF-EVENT-BROKER-LISTENERS");

    private static final SubLSymbol EVENT_BROKER_LOCK = makeSymbol("EVENT-BROKER-LOCK");

    private static final SubLSymbol _CSETF_EVENT_BROKER_LOCK = makeSymbol("_CSETF-EVENT-BROKER-LOCK");

    private static final SubLSymbol EVENT_BROKER_POSTINGS = makeSymbol("EVENT-BROKER-POSTINGS");

    private static final SubLSymbol _CSETF_EVENT_BROKER_POSTINGS = makeSymbol("_CSETF-EVENT-BROKER-POSTINGS");

    private static final SubLSymbol EVENT_BROKER_PROTOCOLS = makeSymbol("EVENT-BROKER-PROTOCOLS");

    private static final SubLSymbol _CSETF_EVENT_BROKER_PROTOCOLS = makeSymbol("_CSETF-EVENT-BROKER-PROTOCOLS");











    private static final SubLSymbol MAKE_EVENT_BROKER = makeSymbol("MAKE-EVENT-BROKER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_EVENT_BROKER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-EVENT-BROKER-METHOD");

    public static final SubLList $list97 = list(list(makeSymbol("EVENT-BROKER")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLList $list99 = list(list(makeSymbol("LISTENER"), makeSymbol("EVENT"), makeSymbol("BROKER")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym100$LISTENERS = makeUninternedSymbol("LISTENERS");

    private static final SubLSymbol $sym101$EVENT_LISTENERS = makeUninternedSymbol("EVENT-LISTENERS");



    private static final SubLSymbol WITH_EVENT_BROKER_LOCK_HELD = makeSymbol("WITH-EVENT-BROKER-LOCK-HELD");



    private static final SubLList $list105 = list(list(makeSymbol("EVENT-BROKER-LISTENERS"), makeSymbol("BROKER")));





    private static final SubLSymbol PROTOCOL_DESCRIPTION = makeSymbol("PROTOCOL-DESCRIPTION");

    private static final SubLSymbol PROTOCOL_DESCRIPTION_P = makeSymbol("PROTOCOL-DESCRIPTION-P");

    private static final SubLList $list110 = list(makeSymbol("PROTOCOL"), makeSymbol("EVENT-SERIALIZE"), makeSymbol("MY-PARAMS-SERIALIZE"));

    private static final SubLList $list111 = list(makeKeyword("PROTOCOL"), makeKeyword("EVENT-SERIALIZE"), makeKeyword("MY-PARAMS-SERIALIZE"));

    private static final SubLList $list112 = list(makeSymbol("PROTOCOL-DESCRIPTION-PROTOCOL"), makeSymbol("PROTOCOL-DESCRIPTION-EVENT-SERIALIZE"), makeSymbol("PROTOCOL-DESCRIPTION-MY-PARAMS-SERIALIZE"));

    private static final SubLList $list113 = list(makeSymbol("_CSETF-PROTOCOL-DESCRIPTION-PROTOCOL"), makeSymbol("_CSETF-PROTOCOL-DESCRIPTION-EVENT-SERIALIZE"), makeSymbol("_CSETF-PROTOCOL-DESCRIPTION-MY-PARAMS-SERIALIZE"));

    private static final SubLSymbol PROTOCOL_DESCRIPTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROTOCOL-DESCRIPTION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list115 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PROTOCOL-DESCRIPTION-P"));

    private static final SubLSymbol PROTOCOL_DESCRIPTION_PROTOCOL = makeSymbol("PROTOCOL-DESCRIPTION-PROTOCOL");

    private static final SubLSymbol _CSETF_PROTOCOL_DESCRIPTION_PROTOCOL = makeSymbol("_CSETF-PROTOCOL-DESCRIPTION-PROTOCOL");

    private static final SubLSymbol PROTOCOL_DESCRIPTION_EVENT_SERIALIZE = makeSymbol("PROTOCOL-DESCRIPTION-EVENT-SERIALIZE");

    private static final SubLSymbol _CSETF_PROTOCOL_DESCRIPTION_EVENT_SERIALIZE = makeSymbol("_CSETF-PROTOCOL-DESCRIPTION-EVENT-SERIALIZE");

    private static final SubLSymbol PROTOCOL_DESCRIPTION_MY_PARAMS_SERIALIZE = makeSymbol("PROTOCOL-DESCRIPTION-MY-PARAMS-SERIALIZE");

    private static final SubLSymbol _CSETF_PROTOCOL_DESCRIPTION_MY_PARAMS_SERIALIZE = makeSymbol("_CSETF-PROTOCOL-DESCRIPTION-MY-PARAMS-SERIALIZE");



    private static final SubLSymbol $MY_PARAMS_SERIALIZE = makeKeyword("MY-PARAMS-SERIALIZE");

    private static final SubLSymbol MAKE_PROTOCOL_DESCRIPTION = makeSymbol("MAKE-PROTOCOL-DESCRIPTION");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PROTOCOL_DESCRIPTION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROTOCOL-DESCRIPTION-METHOD");

    private static final SubLString $str126$Protocol__S____for_Event___S____f = makeString("Protocol ~S // for Event: ~S // for Params: ~S");

    private static final SubLString $str127$_event_code__S_ = makeString("<event code=~S ");

    private static final SubLString $str128$timestamp__S_ = makeString("timestamp=~S ");

    private static final SubLString $str129$source__S_ = makeString("source=~S ");

    private static final SubLString $str130$message__S__ = makeString("message=~S/>");

    private static final SubLString $str131$_parameter_key__mine__value__S__ = makeString("<parameter key=\"mine\" value=~S/>");

    private static final SubLString $$$Event_Broker_Lock = makeString("Event Broker Lock");

    private static final SubLString $$$Event_Broker_Queue = makeString("Event Broker Queue");

    private static final SubLSymbol DEFAULT_EVENT_SERIALIZE = makeSymbol("DEFAULT-EVENT-SERIALIZE");

    private static final SubLSymbol DEFAULT_MY_PARAMS_SERIALIZE = makeSymbol("DEFAULT-MY-PARAMS-SERIALIZE");

    private static final SubLSymbol $event_broker$ = makeSymbol("*EVENT-BROKER*");

    private static final SubLList $list137 = list(makeSymbol("EVENT-BROKER"));





    private static final SubLList $list140 = list(list(makeSymbol("ENSURE-EVENT-BROKER")));

    private static final SubLSymbol $sym141$FAST_HAS_EVENT_CLASS_ANY_TRANSITIVE_LISTENERS_ = makeSymbol("FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?");

    private static final SubLSymbol $sym142$_FAST_HAS_EVENT_CLASS_ANY_TRANSITIVE_LISTENERS__CACHING_STATE_ = makeSymbol("*FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?-CACHING-STATE*");



    private static final SubLString $str144$Event_Broker_settings__ = makeString("Event Broker settings~%");

    private static final SubLSymbol EVENT_HIERARCHY_P = makeSymbol("EVENT-HIERARCHY-P");

    private static final SubLString $str146$__Listening_for__S____ = makeString("  Listening for ~S :~%");

    private static final SubLString $$$__ = makeString("  ");

    private static final SubLString $str148$__Defined_protocols___ = makeString("  Defined protocols:~%");

    private static final SubLString $$$____ = makeString("    ");

    private static final SubLSymbol $EVENT_BROKER_EVENT = makeKeyword("EVENT-BROKER-EVENT");



    private static final SubLString $str152$The_parent_for_all_events_that_th = makeString("The parent for all events that the event broker uses for the meta-communication.");

    private static final SubLSymbol $EVENT_HANDLER_REGISTERED = makeKeyword("EVENT-HANDLER-REGISTERED");

    private static final SubLString $str154$The_first_message_any_event_handl = makeString("The first message any event handler sees.");

    private static final SubLSymbol $EVENT_HANDLER_DEREGISTERED = makeKeyword("EVENT-HANDLER-DEREGISTERED");

    private static final SubLString $str156$The_last_message_any_event_handle = makeString("The last message any event handler sees.");



    private static final SubLString $$$success = makeString("success");





    private static final SubLSymbol EVENT_P = makeSymbol("EVENT-P");



    private static final SubLSymbol DEFAULT_FUNCALL_EVENT_ERROR_HANDLER = makeSymbol("DEFAULT-FUNCALL-EVENT-ERROR-HANDLER");

    private static final SubLString $str164$Error_during_processing_of_event_ = makeString("Error during processing of event: ~A~%~A~%");



    private static final SubLString $str166$Unknown_mode_of_invocation__S____ = makeString("Unknown mode of invocation ~S -- cannot dispatch event to listener ~S.");











    private static final SubLSymbol DEFAULT_CFASL_EVENT_SERIALIZE = makeSymbol("DEFAULT-CFASL-EVENT-SERIALIZE");

    private static final SubLSymbol DEFAULT_CFASL_PARAMS_SERIALIZE = makeSymbol("DEFAULT-CFASL-PARAMS-SERIALIZE");

    public static SubLObject funcall_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject funcall_info_p(final SubLObject v_object) {
        return v_object.getClass() == $funcall_info_native.class ? T : NIL;
    }

    public static SubLObject funcall_info_function(final SubLObject v_object) {
        assert NIL != funcall_info_p(v_object) : "event_broker.funcall_info_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_funcall_info_function(final SubLObject v_object, final SubLObject value) {
        assert NIL != funcall_info_p(v_object) : "event_broker.funcall_info_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_funcall_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $funcall_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($FUNCTION)) {
                _csetf_funcall_info_function(v_new, current_value);
            } else {
                Errors.error($str12$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_funcall_info(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FUNCALL_INFO, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $FUNCTION, funcall_info_function(obj));
        funcall(visitor_fn, obj, $END, MAKE_FUNCALL_INFO, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_funcall_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_funcall_info(obj, visitor_fn);
    }

    public static SubLObject display_funcall_info(final SubLObject funcall_info, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str18$_funcall__S_, funcall_info_function(funcall_info));
        return funcall_info;
    }

    public static SubLObject socket_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject socket_info_p(final SubLObject v_object) {
        return v_object.getClass() == $socket_info_native.class ? T : NIL;
    }

    public static SubLObject socket_info_host(final SubLObject v_object) {
        assert NIL != socket_info_p(v_object) : "event_broker.socket_info_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject socket_info_port(final SubLObject v_object) {
        assert NIL != socket_info_p(v_object) : "event_broker.socket_info_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject socket_info_protocol(final SubLObject v_object) {
        assert NIL != socket_info_p(v_object) : "event_broker.socket_info_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_socket_info_host(final SubLObject v_object, final SubLObject value) {
        assert NIL != socket_info_p(v_object) : "event_broker.socket_info_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_socket_info_port(final SubLObject v_object, final SubLObject value) {
        assert NIL != socket_info_p(v_object) : "event_broker.socket_info_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_socket_info_protocol(final SubLObject v_object, final SubLObject value) {
        assert NIL != socket_info_p(v_object) : "event_broker.socket_info_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_socket_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $socket_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($HOST)) {
                _csetf_socket_info_host(v_new, current_value);
            } else
                if (pcase_var.eql($PORT)) {
                    _csetf_socket_info_port(v_new, current_value);
                } else
                    if (pcase_var.eql($PROTOCOL)) {
                        _csetf_socket_info_protocol(v_new, current_value);
                    } else {
                        Errors.error($str12$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_socket_info(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SOCKET_INFO, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $HOST, socket_info_host(obj));
        funcall(visitor_fn, obj, $SLOT, $PORT, socket_info_port(obj));
        funcall(visitor_fn, obj, $SLOT, $PROTOCOL, socket_info_protocol(obj));
        funcall(visitor_fn, obj, $END, MAKE_SOCKET_INFO, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_socket_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_socket_info(obj, visitor_fn);
    }

    public static SubLObject new_socket_info(final SubLObject host, final SubLObject port, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = NIL;
        }
        final SubLObject socket_info = make_socket_info(UNPROVIDED);
        _csetf_socket_info_host(socket_info, host);
        _csetf_socket_info_port(socket_info, port);
        if (NIL != protocol) {
            _csetf_socket_info_protocol(socket_info, protocol);
        }
        return socket_info;
    }

    public static SubLObject display_socket_info(final SubLObject socket_info, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str38$_socket__S__S__S_, new SubLObject[]{ socket_info_host(socket_info), socket_info_port(socket_info), socket_info_protocol(socket_info) });
        return socket_info;
    }

    public static SubLObject event_listener_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject event_listener_p(final SubLObject v_object) {
        return v_object.getClass() == $event_listener_native.class ? T : NIL;
    }

    public static SubLObject event_listener_event(final SubLObject v_object) {
        assert NIL != event_listener_p(v_object) : "event_broker.event_listener_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject event_listener_invocation_mode(final SubLObject v_object) {
        assert NIL != event_listener_p(v_object) : "event_broker.event_listener_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject event_listener_invocation_info(final SubLObject v_object) {
        assert NIL != event_listener_p(v_object) : "event_broker.event_listener_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject event_listener_my_params(final SubLObject v_object) {
        assert NIL != event_listener_p(v_object) : "event_broker.event_listener_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject event_listener_source_filter(final SubLObject v_object) {
        assert NIL != event_listener_p(v_object) : "event_broker.event_listener_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_event_listener_event(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_listener_p(v_object) : "event_broker.event_listener_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_event_listener_invocation_mode(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_listener_p(v_object) : "event_broker.event_listener_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_event_listener_invocation_info(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_listener_p(v_object) : "event_broker.event_listener_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_event_listener_my_params(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_listener_p(v_object) : "event_broker.event_listener_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_event_listener_source_filter(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_listener_p(v_object) : "event_broker.event_listener_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_event_listener(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $event_listener_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($EVENT)) {
                _csetf_event_listener_event(v_new, current_value);
            } else
                if (pcase_var.eql($INVOCATION_MODE)) {
                    _csetf_event_listener_invocation_mode(v_new, current_value);
                } else
                    if (pcase_var.eql($INVOCATION_INFO)) {
                        _csetf_event_listener_invocation_info(v_new, current_value);
                    } else
                        if (pcase_var.eql($MY_PARAMS)) {
                            _csetf_event_listener_my_params(v_new, current_value);
                        } else
                            if (pcase_var.eql($SOURCE_FILTER)) {
                                _csetf_event_listener_source_filter(v_new, current_value);
                            } else {
                                Errors.error($str12$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_event_listener(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_EVENT_LISTENER, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $EVENT, event_listener_event(obj));
        funcall(visitor_fn, obj, $SLOT, $INVOCATION_MODE, event_listener_invocation_mode(obj));
        funcall(visitor_fn, obj, $SLOT, $INVOCATION_INFO, event_listener_invocation_info(obj));
        funcall(visitor_fn, obj, $SLOT, $MY_PARAMS, event_listener_my_params(obj));
        funcall(visitor_fn, obj, $SLOT, $SOURCE_FILTER, event_listener_source_filter(obj));
        funcall(visitor_fn, obj, $END, MAKE_EVENT_LISTENER, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_event_listener_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_event_listener(obj, visitor_fn);
    }

    public static SubLObject describe_funcall_listener(final SubLObject event, final SubLObject function, SubLObject my_params, SubLObject source_filter) {
        if (my_params == UNPROVIDED) {
            my_params = NIL;
        }
        if (source_filter == UNPROVIDED) {
            source_filter = FALSE;
        }
        final SubLObject listener = make_event_listener(UNPROVIDED);
        final SubLObject info = make_funcall_info(UNPROVIDED);
        _csetf_funcall_info_function(info, function);
        _csetf_event_listener_event(listener, event);
        _csetf_event_listener_invocation_mode(listener, $FUNCALL);
        _csetf_event_listener_invocation_info(listener, info);
        _csetf_event_listener_my_params(listener, my_params);
        _csetf_event_listener_source_filter(listener, source_filter);
        return listener;
    }

    public static SubLObject describe_socket_listener(final SubLObject event, final SubLObject host, final SubLObject port, SubLObject my_params, SubLObject source_filter) {
        if (my_params == UNPROVIDED) {
            my_params = NIL;
        }
        if (source_filter == UNPROVIDED) {
            source_filter = FALSE;
        }
        final SubLObject listener = make_event_listener(UNPROVIDED);
        final SubLObject info = make_socket_info(UNPROVIDED);
        _csetf_socket_info_host(info, host);
        _csetf_socket_info_port(info, port);
        _csetf_socket_info_protocol(info, $DEFAULT);
        _csetf_event_listener_event(listener, event);
        _csetf_event_listener_invocation_mode(listener, $SOCKET);
        _csetf_event_listener_invocation_info(listener, info);
        _csetf_event_listener_my_params(listener, my_params);
        _csetf_event_listener_source_filter(listener, source_filter);
        return listener;
    }

    public static SubLObject display_event_listener(final SubLObject event_listener, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLObject event = event_listener_event(event_listener);
        final SubLObject mode = event_listener_invocation_mode(event_listener);
        final SubLObject info = event_listener_invocation_info(event_listener);
        final SubLObject source_filter = event_listener_source_filter(event_listener);
        format(stream, $str68$_S_listener_, event);
        final SubLObject pcase_var = mode;
        if (pcase_var.eql($SOCKET)) {
            display_socket_info(info, stream);
        } else
            if (pcase_var.eql($FUNCALL)) {
                display_funcall_info(info, stream);
            } else {
                format(stream, $str69$_S__unknown_mode__, mode);
            }

        format(stream, $str70$_with_parameters__S_, event_listener_my_params(event_listener));
        if (source_filter != FALSE) {
            format(stream, $str71$_source_filtering__S, source_filter);
        }
        terpri(stream);
        return event_listener;
    }

    public static SubLObject event_broker_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject event_broker_p(final SubLObject v_object) {
        return v_object.getClass() == $event_broker_native.class ? T : NIL;
    }

    public static SubLObject event_broker_hierarchy(final SubLObject v_object) {
        assert NIL != event_broker_p(v_object) : "event_broker.event_broker_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject event_broker_listeners(final SubLObject v_object) {
        assert NIL != event_broker_p(v_object) : "event_broker.event_broker_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject event_broker_lock(final SubLObject v_object) {
        assert NIL != event_broker_p(v_object) : "event_broker.event_broker_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject event_broker_postings(final SubLObject v_object) {
        assert NIL != event_broker_p(v_object) : "event_broker.event_broker_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject event_broker_protocols(final SubLObject v_object) {
        assert NIL != event_broker_p(v_object) : "event_broker.event_broker_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_event_broker_hierarchy(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_broker_p(v_object) : "event_broker.event_broker_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_event_broker_listeners(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_broker_p(v_object) : "event_broker.event_broker_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_event_broker_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_broker_p(v_object) : "event_broker.event_broker_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_event_broker_postings(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_broker_p(v_object) : "event_broker.event_broker_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_event_broker_protocols(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_broker_p(v_object) : "event_broker.event_broker_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_event_broker(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $event_broker_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($HIERARCHY)) {
                _csetf_event_broker_hierarchy(v_new, current_value);
            } else
                if (pcase_var.eql($LISTENERS)) {
                    _csetf_event_broker_listeners(v_new, current_value);
                } else
                    if (pcase_var.eql($LOCK)) {
                        _csetf_event_broker_lock(v_new, current_value);
                    } else
                        if (pcase_var.eql($POSTINGS)) {
                            _csetf_event_broker_postings(v_new, current_value);
                        } else
                            if (pcase_var.eql($PROTOCOLS)) {
                                _csetf_event_broker_protocols(v_new, current_value);
                            } else {
                                Errors.error($str12$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_event_broker(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_EVENT_BROKER, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $HIERARCHY, event_broker_hierarchy(obj));
        funcall(visitor_fn, obj, $SLOT, $LISTENERS, event_broker_listeners(obj));
        funcall(visitor_fn, obj, $SLOT, $LOCK, event_broker_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $POSTINGS, event_broker_postings(obj));
        funcall(visitor_fn, obj, $SLOT, $PROTOCOLS, event_broker_protocols(obj));
        funcall(visitor_fn, obj, $END, MAKE_EVENT_BROKER, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_event_broker_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_event_broker(obj, visitor_fn);
    }

    public static SubLObject with_event_broker_lock_held(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list97);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_event_broker = NIL;
        destructuring_bind_must_consp(current, datum, $list97);
        v_event_broker = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(WITH_LOCK_HELD, list(list(EVENT_BROKER_LOCK, v_event_broker)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list97);
        return NIL;
    }

    public static SubLObject add_listener_to_broker(final SubLObject listener, final SubLObject broker) {
        final SubLObject lock = event_broker_lock(broker);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject event = event_listener_event(listener);
            final SubLObject listeners = event_broker_listeners(broker);
            dictionary_utilities.dictionary_pushnew(listeners, event, listener, symbol_function(EQUALP), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return broker;
    }

    public static SubLObject remove_listener_from_broker(final SubLObject listener, final SubLObject broker) {
        final SubLObject lock = event_broker_lock(broker);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject event = event_listener_event(listener);
            final SubLObject listeners = event_broker_listeners(broker);
            dictionary_utilities.dictionary_remove_from_value(listeners, event, listener, symbol_function(EQUALP), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return broker;
    }

    public static SubLObject do_listeners_of_event(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject listener = NIL;
        SubLObject event = NIL;
        SubLObject broker = NIL;
        destructuring_bind_must_consp(current, datum, $list99);
        listener = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        event = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        broker = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject listeners = $sym100$LISTENERS;
            final SubLObject event_listeners = $sym101$EVENT_LISTENERS;
            return list(CLET, list(listeners, event_listeners), list(WITH_EVENT_BROKER_LOCK_HELD, list(broker), listS(CSETQ, listeners, $list105), list(CSETQ, event_listeners, list(DICTIONARY_LOOKUP, listeners, event))), listS(CDOLIST, list(listener, event_listeners), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list99);
        return NIL;
    }

    public static SubLObject protocol_description_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject protocol_description_p(final SubLObject v_object) {
        return v_object.getClass() == $protocol_description_native.class ? T : NIL;
    }

    public static SubLObject protocol_description_protocol(final SubLObject v_object) {
        assert NIL != protocol_description_p(v_object) : "event_broker.protocol_description_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject protocol_description_event_serialize(final SubLObject v_object) {
        assert NIL != protocol_description_p(v_object) : "event_broker.protocol_description_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject protocol_description_my_params_serialize(final SubLObject v_object) {
        assert NIL != protocol_description_p(v_object) : "event_broker.protocol_description_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_protocol_description_protocol(final SubLObject v_object, final SubLObject value) {
        assert NIL != protocol_description_p(v_object) : "event_broker.protocol_description_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_protocol_description_event_serialize(final SubLObject v_object, final SubLObject value) {
        assert NIL != protocol_description_p(v_object) : "event_broker.protocol_description_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_protocol_description_my_params_serialize(final SubLObject v_object, final SubLObject value) {
        assert NIL != protocol_description_p(v_object) : "event_broker.protocol_description_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_protocol_description(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $protocol_description_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PROTOCOL)) {
                _csetf_protocol_description_protocol(v_new, current_value);
            } else
                if (pcase_var.eql($EVENT_SERIALIZE)) {
                    _csetf_protocol_description_event_serialize(v_new, current_value);
                } else
                    if (pcase_var.eql($MY_PARAMS_SERIALIZE)) {
                        _csetf_protocol_description_my_params_serialize(v_new, current_value);
                    } else {
                        Errors.error($str12$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_protocol_description(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PROTOCOL_DESCRIPTION, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PROTOCOL, protocol_description_protocol(obj));
        funcall(visitor_fn, obj, $SLOT, $EVENT_SERIALIZE, protocol_description_event_serialize(obj));
        funcall(visitor_fn, obj, $SLOT, $MY_PARAMS_SERIALIZE, protocol_description_my_params_serialize(obj));
        funcall(visitor_fn, obj, $END, MAKE_PROTOCOL_DESCRIPTION, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_protocol_description_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_protocol_description(obj, visitor_fn);
    }

    public static SubLObject new_protocol_description(final SubLObject protocol, final SubLObject event_serialize, SubLObject my_params_serialize) {
        if (my_params_serialize == UNPROVIDED) {
            my_params_serialize = NIL;
        }
        final SubLObject description = make_protocol_description(UNPROVIDED);
        _csetf_protocol_description_protocol(description, protocol);
        _csetf_protocol_description_event_serialize(description, event_serialize);
        _csetf_protocol_description_my_params_serialize(description, my_params_serialize);
        return description;
    }

    public static SubLObject display_protocol_description(final SubLObject description, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str126$Protocol__S____for_Event___S____f, new SubLObject[]{ protocol_description_protocol(description), protocol_description_event_serialize(description), protocol_description_my_params_serialize(description) });
        return T;
    }

    public static SubLObject add_protocol_to_broker(final SubLObject broker, final SubLObject protocol, final SubLObject event_serializer, SubLObject params_serializer) {
        if (params_serializer == UNPROVIDED) {
            params_serializer = NIL;
        }
        final SubLObject description = new_protocol_description(protocol, event_serializer, params_serializer);
        final SubLObject lock = event_broker_lock(broker);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject protocols = event_broker_protocols(broker);
            dictionary.dictionary_enter(protocols, protocol, description);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return broker;
    }

    public static SubLObject find_protocol_of_broker(final SubLObject broker, final SubLObject protocol) {
        SubLObject result = NIL;
        final SubLObject lock = event_broker_lock(broker);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject protocols = event_broker_protocols(broker);
            result = dictionary.dictionary_lookup(protocols, protocol, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    public static SubLObject default_event_serialize(final SubLObject event, final SubLObject stream) {
        format(stream, $str127$_event_code__S_, symbol_name(event_model.event_class(event)));
        final SubLObject timestring = numeric_date_utilities.timestring(event_model.event_timestamp(event));
        format(stream, $str128$timestamp__S_, timestring);
        if (NIL != event_model.event_source(event)) {
            format(stream, $str129$source__S_, string_utilities.to_string(event_model.event_source(event)));
        }
        format(stream, $str130$message__S__, string_utilities.to_string(event_model.event_message(event)));
        string_utilities.network_terpri(stream);
        return event;
    }

    public static SubLObject default_my_params_serialize(final SubLObject my_params, final SubLObject stream) {
        format(stream, $str131$_parameter_key__mine__value__S__, string_utilities.to_string(my_params));
        string_utilities.network_terpri(stream);
        return my_params;
    }

    public static SubLObject new_event_broker(SubLObject hierarchy) {
        if (hierarchy == UNPROVIDED) {
            hierarchy = NIL;
        }
        if (NIL == hierarchy) {
            hierarchy = event_model.core_event_hierarchy();
        }
        final SubLObject v_event_broker = make_event_broker(UNPROVIDED);
        _csetf_event_broker_hierarchy(v_event_broker, hierarchy);
        _csetf_event_broker_listeners(v_event_broker, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        _csetf_event_broker_lock(v_event_broker, make_lock($$$Event_Broker_Lock));
        _csetf_event_broker_postings(v_event_broker, process_utilities.new_ipc_queue($$$Event_Broker_Queue));
        _csetf_event_broker_protocols(v_event_broker, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        add_protocol_to_broker(v_event_broker, $DEFAULT, DEFAULT_EVENT_SERIALIZE, DEFAULT_MY_PARAMS_SERIALIZE);
        return v_event_broker;
    }

    public static SubLObject ensure_event_broker() {
        if (NIL == event_broker_p($event_broker$.getGlobalValue())) {
            $event_broker$.setGlobalValue(new_event_broker(UNPROVIDED));
        }
        return $event_broker$.getGlobalValue();
    }

    public static SubLObject initialize_event_broker(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_event_broker = NIL;
        destructuring_bind_must_consp(current, datum, $list137);
        v_event_broker = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PWHEN, list(NULL, v_event_broker), listS(CSETQ, v_event_broker, $list140));
        }
        cdestructuring_bind_error(datum, $list137);
        return NIL;
    }

    public static SubLObject core_event_broker() {
        return $event_broker$.getGlobalValue();
    }

    public static SubLObject has_event_class_any_listenersP(final SubLObject event_class, SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        if (NIL == broker) {
            broker = ensure_event_broker();
        }
        assert NIL != event_broker_p(broker) : "event_broker.event_broker_p(broker) " + "CommonSymbols.NIL != event_broker.event_broker_p(broker) " + broker;
        SubLObject listeners = NIL;
        SubLObject event_listeners = NIL;
        final SubLObject lock = event_broker_lock(broker);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            listeners = event_broker_listeners(broker);
            event_listeners = dictionary.dictionary_lookup_without_values(listeners, event_class, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return list_utilities.sublisp_boolean(event_listeners);
    }

    public static SubLObject clear_fast_has_event_class_any_transitive_listenersP() {
        final SubLObject cs = $fast_has_event_class_any_transitive_listenersP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_fast_has_event_class_any_transitive_listenersP(final SubLObject event_class, SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($fast_has_event_class_any_transitive_listenersP_caching_state$.getGlobalValue(), list(event_class, broker), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fast_has_event_class_any_transitive_listenersP_internal(final SubLObject event_class, final SubLObject broker) {
        return has_event_class_any_transitive_listenersP(event_class, broker);
    }

    public static SubLObject fast_has_event_class_any_transitive_listenersP(final SubLObject event_class, SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        SubLObject caching_state = $fast_has_event_class_any_transitive_listenersP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym141$FAST_HAS_EVENT_CLASS_ANY_TRANSITIVE_LISTENERS_, $sym142$_FAST_HAS_EVENT_CLASS_ANY_TRANSITIVE_LISTENERS__CACHING_STATE_, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(event_class, broker);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (event_class.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && broker.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(fast_has_event_class_any_transitive_listenersP_internal(event_class, broker)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(event_class, broker));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject has_event_class_any_transitive_listenersP(final SubLObject event_class, SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        if (NIL == broker) {
            broker = ensure_event_broker();
        }
        assert NIL != event_broker_p(broker) : "event_broker.event_broker_p(broker) " + "CommonSymbols.NIL != event_broker.event_broker_p(broker) " + broker;
        final SubLObject hierarchy = event_broker_hierarchy(broker);
        final SubLObject event = event_model.find_event_class(event_class, hierarchy);
        SubLObject listeners = NIL;
        SubLObject doneP = NIL;
        final SubLObject lock = event_broker_lock(broker);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            listeners = event_broker_listeners(broker);
            SubLObject current = event;
            while (NIL != current) {
                if (NIL == doneP) {
                    final SubLObject event_key = event_model.event_class_self(current);
                    doneP = list_utilities.sublisp_boolean(dictionary.dictionary_lookup_without_values(listeners, event_key, UNPROVIDED));
                }
                if (event_model.event_class_self(current) == $EVENT_ROOT) {
                    current = NIL;
                } else {
                    current = event_model.find_in_event_hierarchy(hierarchy, event_model.event_class_parent(current));
                }
            } 
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return doneP;
    }

    public static SubLObject display_event_broker(SubLObject broker, SubLObject stream) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == broker) {
            broker = ensure_event_broker();
        }
        assert NIL != event_broker_p(broker) : "event_broker.event_broker_p(broker) " + "CommonSymbols.NIL != event_broker.event_broker_p(broker) " + broker;
        format(stream, $str144$Event_Broker_settings__);
        SubLObject hierarchy = event_broker_hierarchy(broker);
        final SubLObject queue = queues.create_queue(UNPROVIDED);
        SubLObject children = NIL;
        if (NIL == hierarchy) {
            hierarchy = event_model.ensure_event_hierarchy();
        }
        assert NIL != event_model.event_hierarchy_p(hierarchy) : "event_model.event_hierarchy_p(hierarchy) " + "CommonSymbols.NIL != event_model.event_hierarchy_p(hierarchy) " + hierarchy;
        queues.enqueue($EVENT_ROOT, queue);
        while (NIL == queues.queue_empty_p(queue)) {
            final SubLObject curr = queues.dequeue(queue);
            final SubLObject kids = children = event_model.children_of_event_class_in_hierarchy(curr, hierarchy);
            format(stream, $str146$__Listening_for__S____, curr);
            SubLObject listeners = NIL;
            SubLObject event_listeners = NIL;
            final SubLObject lock = event_broker_lock(broker);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                listeners = event_broker_listeners(broker);
                event_listeners = dictionary.dictionary_lookup(listeners, curr, UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            SubLObject cdolist_list_var = event_listeners;
            SubLObject listener = NIL;
            listener = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                write_string($$$__, stream, UNPROVIDED, UNPROVIDED);
                display_event_listener(listener, stream);
                cdolist_list_var = cdolist_list_var.rest();
                listener = cdolist_list_var.first();
            } 
            SubLObject cdolist_list_var2 = kids;
            SubLObject kid = NIL;
            kid = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                queues.enqueue(event_model.event_class_self(kid), queue);
                cdolist_list_var2 = cdolist_list_var2.rest();
                kid = cdolist_list_var2.first();
            } 
        } 
        format(stream, $str148$__Defined_protocols___);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(event_broker_protocols(broker))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject protocol = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject description = thread.secondMultipleValue();
            thread.resetMultipleValues();
            write_string($$$____, stream, UNPROVIDED, UNPROVIDED);
            display_protocol_description(description, stream);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return T;
    }

    public static SubLObject remove_stale_core_event_customers() {
        $event_broker$.setGlobalValue(remove_stale_event_customers(core_event_broker()));
        return core_event_broker();
    }

    public static SubLObject remove_stale_event_customers(final SubLObject broker) {
        dictionary.clear_dictionary(event_broker_listeners(broker));
        _csetf_event_broker_postings(broker, process_utilities.new_ipc_queue($$$Event_Broker_Queue));
        return broker;
    }

    public static SubLObject register_event_listener(final SubLObject event_listener, SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        assert NIL != event_listener_p(event_listener) : "event_broker.event_listener_p(event_listener) " + "CommonSymbols.NIL != event_broker.event_listener_p(event_listener) " + event_listener;
        if (NIL == broker) {
            broker = ensure_event_broker();
        }
        assert NIL != event_broker_p(broker) : "event_broker.event_broker_p(broker) " + "CommonSymbols.NIL != event_broker.event_broker_p(broker) " + broker;
        if (NIL != add_listener_to_broker(event_listener, broker)) {
            signal_registered_event(broker, event_listener);
            clear_fast_has_event_class_any_transitive_listenersP();
            return T;
        }
        return NIL;
    }

    public static SubLObject deregister_event_listener(final SubLObject event_listener, SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != event_listener_p(event_listener) : "event_broker.event_listener_p(event_listener) " + "CommonSymbols.NIL != event_broker.event_listener_p(event_listener) " + event_listener;
        if (NIL == broker) {
            broker = ensure_event_broker();
        }
        assert NIL != event_broker_p(broker) : "event_broker.event_broker_p(broker) " + "CommonSymbols.NIL != event_broker.event_broker_p(broker) " + broker;
        if (NIL != remove_listener_from_broker(event_listener, broker)) {
            if (NIL == $deregistration_during_system_initialization$.getDynamicValue(thread)) {
                signal_deregistered_event(broker, event_listener);
            }
            clear_fast_has_event_class_any_transitive_listenersP();
            return T;
        }
        return NIL;
    }

    public static SubLObject register_event_socket_protocol(final SubLObject protocol, final SubLObject event_serialize, SubLObject params_serialize, SubLObject broker) {
        if (params_serialize == UNPROVIDED) {
            params_serialize = NIL;
        }
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        assert NIL != keywordp(protocol) : "Types.keywordp(protocol) " + "CommonSymbols.NIL != Types.keywordp(protocol) " + protocol;
        if (NIL == broker) {
            broker = ensure_event_broker();
        }
        assert NIL != event_broker_p(broker) : "event_broker.event_broker_p(broker) " + "CommonSymbols.NIL != event_broker.event_broker_p(broker) " + broker;
        return add_protocol_to_broker(broker, protocol, event_serialize, params_serialize);
    }

    public static SubLObject post_event(final SubLObject event, SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        if (NIL == broker) {
            broker = ensure_event_broker();
        }
        assert NIL != event_broker_p(broker) : "event_broker.event_broker_p(broker) " + "CommonSymbols.NIL != event_broker.event_broker_p(broker) " + broker;
        process_utilities.ipc_enqueue(event, event_broker_postings(broker), UNPROVIDED);
        return event;
    }

    public static SubLObject receive_event(SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        if (NIL == broker) {
            broker = ensure_event_broker();
        }
        assert NIL != event_broker_p(broker) : "event_broker.event_broker_p(broker) " + "CommonSymbols.NIL != event_broker.event_broker_p(broker) " + broker;
        SubLObject event = NIL;
        event = process_utilities.ipc_dequeue(event_broker_postings(broker), UNPROVIDED);
        dispatch_event_to_listeners(broker, event);
        return event;
    }

    public static SubLObject signal_registered_event(final SubLObject broker, final SubLObject event_listener) {
        final SubLObject event = event_model.new_event($EVENT_HANDLER_REGISTERED, $$$success, $BROKER);
        invoke_event_on_listener(broker, event, event_listener);
        return broker;
    }

    public static SubLObject signal_deregistered_event(final SubLObject broker, final SubLObject event_listener) {
        final SubLObject event = event_model.new_event($EVENT_HANDLER_DEREGISTERED, $$$success, $BROKER);
        invoke_event_on_listener(broker, event, event_listener);
        return broker;
    }

    public static SubLObject dispatch_event_to_listeners(final SubLObject broker, final SubLObject event) {
        final SubLObject event_class_key = event_model.event_class(event);
        final SubLObject hierarchy = event_broker_hierarchy(broker);
        SubLObject current;
        final SubLObject event_class = current = event_model.find_event_class(event_class_key, hierarchy);
        while (NIL != current) {
            final SubLObject event_key = event_model.event_class_self(current);
            SubLObject listeners = NIL;
            SubLObject event_listeners = NIL;
            final SubLObject lock = event_broker_lock(broker);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                listeners = event_broker_listeners(broker);
                event_listeners = dictionary.dictionary_lookup(listeners, event_key, UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            SubLObject cdolist_list_var = event_listeners;
            SubLObject listener = NIL;
            listener = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                invoke_event_on_listener(broker, event, listener);
                cdolist_list_var = cdolist_list_var.rest();
                listener = cdolist_list_var.first();
            } 
            if (event_model.event_class_self(current) == $EVENT_ROOT) {
                current = NIL;
            } else {
                current = event_model.find_in_event_hierarchy(hierarchy, event_model.event_class_parent(current));
            }
        } 
        return broker;
    }

    public static SubLObject invoke_funcall_event_on_listener(final SubLObject event, final SubLObject listener) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject info = event_listener_invocation_info(listener);
        final SubLObject params = event_listener_my_params(listener);
        SubLObject result = NIL;
        SubLObject message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = funcall(funcall_info_function(info), event, params);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (message.isString()) {
            invoke_funcall_event_error_handler(event, message);
            result = message;
        }
        return result;
    }

    public static SubLObject invoke_funcall_event_error_handler(final SubLObject event, final SubLObject error_message) {
        assert NIL != event_model.event_p(event) : "event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) " + event;
        assert NIL != stringp(error_message) : "Types.stringp(error_message) " + "CommonSymbols.NIL != Types.stringp(error_message) " + error_message;
        funcall(DEFAULT_FUNCALL_EVENT_ERROR_HANDLER, event, error_message);
        return NIL;
    }

    public static SubLObject default_funcall_event_error_handler(final SubLObject event, final SubLObject error_message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != event_model.event_p(event) : "event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) " + event;
        assert NIL != stringp(error_message) : "Types.stringp(error_message) " + "CommonSymbols.NIL != Types.stringp(error_message) " + error_message;
        if (NIL != $should_show_event_errorsP$.getGlobalValue()) {
            format(StreamsLow.$error_output$.getDynamicValue(thread), $str164$Error_during_processing_of_event_, event, error_message);
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject invoke_socket_event_on_listener(final SubLObject event, final SubLObject listener, final SubLObject description) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject info = event_listener_invocation_info(listener);
        final SubLObject params = event_listener_my_params(listener);
        final SubLObject host = socket_info_host(info);
        final SubLObject port = socket_info_port(info);
        final SubLObject event_serializer = protocol_description_event_serialize(description);
        final SubLObject my_params_serializer = protocol_description_my_params_serialize(description);
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject stream = NIL;
                    try {
                        stream = subl_promotions.open_tcp_stream_with_timeout(host, port, NIL, $PUBLIC);
                        if (NIL != validate_tcp_connection(stream, host, port)) {
                            funcall(event_serializer, event, stream);
                            if (NIL != my_params_serializer) {
                                funcall(my_params_serializer, params, stream);
                            }
                            force_output(stream);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != stream) {
                                close(stream, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            result = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return result;
    }

    public static SubLObject invoke_event_on_listener(final SubLObject broker, final SubLObject event, final SubLObject listener) {
        final SubLObject pcase_var;
        final SubLObject mode = pcase_var = event_listener_invocation_mode(listener);
        if (pcase_var.eql($FUNCALL)) {
            return invoke_funcall_event_on_listener(event, listener);
        }
        if (pcase_var.eql($SOCKET)) {
            final SubLObject socket_info = event_listener_invocation_info(listener);
            final SubLObject protocol = socket_info_protocol(socket_info);
            final SubLObject description = find_protocol_of_broker(broker, protocol);
            return invoke_socket_event_on_listener(event, listener, description);
        }
        Errors.warn($str166$Unknown_mode_of_invocation__S____, mode, listener);
        return broker;
    }

    public static SubLObject default_cfasl_event_serialize(final SubLObject event, final SubLObject stream) {
        final SubLObject serialized = list($CLASS, event_model.event_class(event), $TIMESTAMP, numeric_date_utilities.timestring(event_model.event_timestamp(event)), $MESSAGE, event_model.event_message(event), $SOURCE, event_model.event_source(event));
        cfasl_output(serialized, stream);
        return event;
    }

    public static SubLObject default_cfasl_params_serialize(final SubLObject params, final SubLObject stream) {
        final SubLObject serialized = list($MY_PARAMS, params);
        cfasl_output(serialized, stream);
        return params;
    }

    public static SubLObject declare_event_broker_file() {
        declareFunction(me, "funcall_info_print_function_trampoline", "FUNCALL-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "funcall_info_p", "FUNCALL-INFO-P", 1, 0, false);
        new event_broker.$funcall_info_p$UnaryFunction();
        declareFunction(me, "funcall_info_function", "FUNCALL-INFO-FUNCTION", 1, 0, false);
        declareFunction(me, "_csetf_funcall_info_function", "_CSETF-FUNCALL-INFO-FUNCTION", 2, 0, false);
        declareFunction(me, "make_funcall_info", "MAKE-FUNCALL-INFO", 0, 1, false);
        declareFunction(me, "visit_defstruct_funcall_info", "VISIT-DEFSTRUCT-FUNCALL-INFO", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_funcall_info_method", "VISIT-DEFSTRUCT-OBJECT-FUNCALL-INFO-METHOD", 2, 0, false);
        declareFunction(me, "display_funcall_info", "DISPLAY-FUNCALL-INFO", 1, 1, false);
        declareFunction(me, "socket_info_print_function_trampoline", "SOCKET-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "socket_info_p", "SOCKET-INFO-P", 1, 0, false);
        new event_broker.$socket_info_p$UnaryFunction();
        declareFunction(me, "socket_info_host", "SOCKET-INFO-HOST", 1, 0, false);
        declareFunction(me, "socket_info_port", "SOCKET-INFO-PORT", 1, 0, false);
        declareFunction(me, "socket_info_protocol", "SOCKET-INFO-PROTOCOL", 1, 0, false);
        declareFunction(me, "_csetf_socket_info_host", "_CSETF-SOCKET-INFO-HOST", 2, 0, false);
        declareFunction(me, "_csetf_socket_info_port", "_CSETF-SOCKET-INFO-PORT", 2, 0, false);
        declareFunction(me, "_csetf_socket_info_protocol", "_CSETF-SOCKET-INFO-PROTOCOL", 2, 0, false);
        declareFunction(me, "make_socket_info", "MAKE-SOCKET-INFO", 0, 1, false);
        declareFunction(me, "visit_defstruct_socket_info", "VISIT-DEFSTRUCT-SOCKET-INFO", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_socket_info_method", "VISIT-DEFSTRUCT-OBJECT-SOCKET-INFO-METHOD", 2, 0, false);
        declareFunction(me, "new_socket_info", "NEW-SOCKET-INFO", 2, 1, false);
        declareFunction(me, "display_socket_info", "DISPLAY-SOCKET-INFO", 1, 1, false);
        declareFunction(me, "event_listener_print_function_trampoline", "EVENT-LISTENER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "event_listener_p", "EVENT-LISTENER-P", 1, 0, false);
        new event_broker.$event_listener_p$UnaryFunction();
        declareFunction(me, "event_listener_event", "EVENT-LISTENER-EVENT", 1, 0, false);
        declareFunction(me, "event_listener_invocation_mode", "EVENT-LISTENER-INVOCATION-MODE", 1, 0, false);
        declareFunction(me, "event_listener_invocation_info", "EVENT-LISTENER-INVOCATION-INFO", 1, 0, false);
        declareFunction(me, "event_listener_my_params", "EVENT-LISTENER-MY-PARAMS", 1, 0, false);
        declareFunction(me, "event_listener_source_filter", "EVENT-LISTENER-SOURCE-FILTER", 1, 0, false);
        declareFunction(me, "_csetf_event_listener_event", "_CSETF-EVENT-LISTENER-EVENT", 2, 0, false);
        declareFunction(me, "_csetf_event_listener_invocation_mode", "_CSETF-EVENT-LISTENER-INVOCATION-MODE", 2, 0, false);
        declareFunction(me, "_csetf_event_listener_invocation_info", "_CSETF-EVENT-LISTENER-INVOCATION-INFO", 2, 0, false);
        declareFunction(me, "_csetf_event_listener_my_params", "_CSETF-EVENT-LISTENER-MY-PARAMS", 2, 0, false);
        declareFunction(me, "_csetf_event_listener_source_filter", "_CSETF-EVENT-LISTENER-SOURCE-FILTER", 2, 0, false);
        declareFunction(me, "make_event_listener", "MAKE-EVENT-LISTENER", 0, 1, false);
        declareFunction(me, "visit_defstruct_event_listener", "VISIT-DEFSTRUCT-EVENT-LISTENER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_event_listener_method", "VISIT-DEFSTRUCT-OBJECT-EVENT-LISTENER-METHOD", 2, 0, false);
        declareFunction(me, "describe_funcall_listener", "DESCRIBE-FUNCALL-LISTENER", 2, 2, false);
        declareFunction(me, "describe_socket_listener", "DESCRIBE-SOCKET-LISTENER", 3, 2, false);
        declareFunction(me, "display_event_listener", "DISPLAY-EVENT-LISTENER", 1, 1, false);
        declareFunction(me, "event_broker_print_function_trampoline", "EVENT-BROKER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "event_broker_p", "EVENT-BROKER-P", 1, 0, false);
        new event_broker.$event_broker_p$UnaryFunction();
        declareFunction(me, "event_broker_hierarchy", "EVENT-BROKER-HIERARCHY", 1, 0, false);
        declareFunction(me, "event_broker_listeners", "EVENT-BROKER-LISTENERS", 1, 0, false);
        declareFunction(me, "event_broker_lock", "EVENT-BROKER-LOCK", 1, 0, false);
        declareFunction(me, "event_broker_postings", "EVENT-BROKER-POSTINGS", 1, 0, false);
        declareFunction(me, "event_broker_protocols", "EVENT-BROKER-PROTOCOLS", 1, 0, false);
        declareFunction(me, "_csetf_event_broker_hierarchy", "_CSETF-EVENT-BROKER-HIERARCHY", 2, 0, false);
        declareFunction(me, "_csetf_event_broker_listeners", "_CSETF-EVENT-BROKER-LISTENERS", 2, 0, false);
        declareFunction(me, "_csetf_event_broker_lock", "_CSETF-EVENT-BROKER-LOCK", 2, 0, false);
        declareFunction(me, "_csetf_event_broker_postings", "_CSETF-EVENT-BROKER-POSTINGS", 2, 0, false);
        declareFunction(me, "_csetf_event_broker_protocols", "_CSETF-EVENT-BROKER-PROTOCOLS", 2, 0, false);
        declareFunction(me, "make_event_broker", "MAKE-EVENT-BROKER", 0, 1, false);
        declareFunction(me, "visit_defstruct_event_broker", "VISIT-DEFSTRUCT-EVENT-BROKER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_event_broker_method", "VISIT-DEFSTRUCT-OBJECT-EVENT-BROKER-METHOD", 2, 0, false);
        declareMacro(me, "with_event_broker_lock_held", "WITH-EVENT-BROKER-LOCK-HELD");
        declareFunction(me, "add_listener_to_broker", "ADD-LISTENER-TO-BROKER", 2, 0, false);
        declareFunction(me, "remove_listener_from_broker", "REMOVE-LISTENER-FROM-BROKER", 2, 0, false);
        declareMacro(me, "do_listeners_of_event", "DO-LISTENERS-OF-EVENT");
        declareFunction(me, "protocol_description_print_function_trampoline", "PROTOCOL-DESCRIPTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "protocol_description_p", "PROTOCOL-DESCRIPTION-P", 1, 0, false);
        new event_broker.$protocol_description_p$UnaryFunction();
        declareFunction(me, "protocol_description_protocol", "PROTOCOL-DESCRIPTION-PROTOCOL", 1, 0, false);
        declareFunction(me, "protocol_description_event_serialize", "PROTOCOL-DESCRIPTION-EVENT-SERIALIZE", 1, 0, false);
        declareFunction(me, "protocol_description_my_params_serialize", "PROTOCOL-DESCRIPTION-MY-PARAMS-SERIALIZE", 1, 0, false);
        declareFunction(me, "_csetf_protocol_description_protocol", "_CSETF-PROTOCOL-DESCRIPTION-PROTOCOL", 2, 0, false);
        declareFunction(me, "_csetf_protocol_description_event_serialize", "_CSETF-PROTOCOL-DESCRIPTION-EVENT-SERIALIZE", 2, 0, false);
        declareFunction(me, "_csetf_protocol_description_my_params_serialize", "_CSETF-PROTOCOL-DESCRIPTION-MY-PARAMS-SERIALIZE", 2, 0, false);
        declareFunction(me, "make_protocol_description", "MAKE-PROTOCOL-DESCRIPTION", 0, 1, false);
        declareFunction(me, "visit_defstruct_protocol_description", "VISIT-DEFSTRUCT-PROTOCOL-DESCRIPTION", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_protocol_description_method", "VISIT-DEFSTRUCT-OBJECT-PROTOCOL-DESCRIPTION-METHOD", 2, 0, false);
        declareFunction(me, "new_protocol_description", "NEW-PROTOCOL-DESCRIPTION", 2, 1, false);
        declareFunction(me, "display_protocol_description", "DISPLAY-PROTOCOL-DESCRIPTION", 1, 1, false);
        declareFunction(me, "add_protocol_to_broker", "ADD-PROTOCOL-TO-BROKER", 3, 1, false);
        declareFunction(me, "find_protocol_of_broker", "FIND-PROTOCOL-OF-BROKER", 2, 0, false);
        declareFunction(me, "default_event_serialize", "DEFAULT-EVENT-SERIALIZE", 2, 0, false);
        declareFunction(me, "default_my_params_serialize", "DEFAULT-MY-PARAMS-SERIALIZE", 2, 0, false);
        declareFunction(me, "new_event_broker", "NEW-EVENT-BROKER", 0, 1, false);
        declareFunction(me, "ensure_event_broker", "ENSURE-EVENT-BROKER", 0, 0, false);
        declareMacro(me, "initialize_event_broker", "INITIALIZE-EVENT-BROKER");
        declareFunction(me, "core_event_broker", "CORE-EVENT-BROKER", 0, 0, false);
        declareFunction(me, "has_event_class_any_listenersP", "HAS-EVENT-CLASS-ANY-LISTENERS?", 1, 1, false);
        declareFunction(me, "clear_fast_has_event_class_any_transitive_listenersP", "CLEAR-FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?", 0, 0, false);
        declareFunction(me, "remove_fast_has_event_class_any_transitive_listenersP", "REMOVE-FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?", 1, 1, false);
        declareFunction(me, "fast_has_event_class_any_transitive_listenersP_internal", "FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?-INTERNAL", 2, 0, false);
        declareFunction(me, "fast_has_event_class_any_transitive_listenersP", "FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?", 1, 1, false);
        declareFunction(me, "has_event_class_any_transitive_listenersP", "HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?", 1, 1, false);
        declareFunction(me, "display_event_broker", "DISPLAY-EVENT-BROKER", 0, 2, false);
        declareFunction(me, "remove_stale_core_event_customers", "REMOVE-STALE-CORE-EVENT-CUSTOMERS", 0, 0, false);
        declareFunction(me, "remove_stale_event_customers", "REMOVE-STALE-EVENT-CUSTOMERS", 1, 0, false);
        declareFunction(me, "register_event_listener", "REGISTER-EVENT-LISTENER", 1, 1, false);
        declareFunction(me, "deregister_event_listener", "DEREGISTER-EVENT-LISTENER", 1, 1, false);
        declareFunction(me, "register_event_socket_protocol", "REGISTER-EVENT-SOCKET-PROTOCOL", 2, 2, false);
        declareFunction(me, "post_event", "POST-EVENT", 1, 1, false);
        declareFunction(me, "receive_event", "RECEIVE-EVENT", 0, 1, false);
        declareFunction(me, "signal_registered_event", "SIGNAL-REGISTERED-EVENT", 2, 0, false);
        declareFunction(me, "signal_deregistered_event", "SIGNAL-DEREGISTERED-EVENT", 2, 0, false);
        declareFunction(me, "dispatch_event_to_listeners", "DISPATCH-EVENT-TO-LISTENERS", 2, 0, false);
        declareFunction(me, "invoke_funcall_event_on_listener", "INVOKE-FUNCALL-EVENT-ON-LISTENER", 2, 0, false);
        declareFunction(me, "invoke_funcall_event_error_handler", "INVOKE-FUNCALL-EVENT-ERROR-HANDLER", 2, 0, false);
        declareFunction(me, "default_funcall_event_error_handler", "DEFAULT-FUNCALL-EVENT-ERROR-HANDLER", 2, 0, false);
        declareFunction(me, "invoke_socket_event_on_listener", "INVOKE-SOCKET-EVENT-ON-LISTENER", 3, 0, false);
        declareFunction(me, "invoke_event_on_listener", "INVOKE-EVENT-ON-LISTENER", 3, 0, false);
        declareFunction(me, "default_cfasl_event_serialize", "DEFAULT-CFASL-EVENT-SERIALIZE", 2, 0, false);
        declareFunction(me, "default_cfasl_params_serialize", "DEFAULT-CFASL-PARAMS-SERIALIZE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_event_broker_file() {
        deflexical("*SHOULD-SHOW-EVENT-ERRORS?*", NIL);
        defconstant("*DTP-FUNCALL-INFO*", FUNCALL_INFO);
        defconstant("*DTP-SOCKET-INFO*", SOCKET_INFO);
        defconstant("*DTP-EVENT-LISTENER*", EVENT_LISTENER);
        defconstant("*DTP-EVENT-BROKER*", EVENT_BROKER);
        defconstant("*DTP-PROTOCOL-DESCRIPTION*", PROTOCOL_DESCRIPTION);
        deflexical("*EVENT-BROKER*", SubLTrampolineFile.maybeDefault($event_broker$, $event_broker$, NIL));
        deflexical("*FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?-CACHING-STATE*", NIL);
        defparameter("*DEREGISTRATION-DURING-SYSTEM-INITIALIZATION*", NIL);
        return NIL;
    }

    public static SubLObject setup_event_broker_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_funcall_info$.getGlobalValue(), symbol_function(FUNCALL_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(FUNCALL_INFO_FUNCTION, _CSETF_FUNCALL_INFO_FUNCTION);
        identity(FUNCALL_INFO);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_funcall_info$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FUNCALL_INFO_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_socket_info$.getGlobalValue(), symbol_function(SOCKET_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list26);
        def_csetf(SOCKET_INFO_HOST, _CSETF_SOCKET_INFO_HOST);
        def_csetf(SOCKET_INFO_PORT, _CSETF_SOCKET_INFO_PORT);
        def_csetf(SOCKET_INFO_PROTOCOL, _CSETF_SOCKET_INFO_PROTOCOL);
        identity(SOCKET_INFO);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_socket_info$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SOCKET_INFO_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_event_listener$.getGlobalValue(), symbol_function(EVENT_LISTENER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list46);
        def_csetf(EVENT_LISTENER_EVENT, _CSETF_EVENT_LISTENER_EVENT);
        def_csetf(EVENT_LISTENER_INVOCATION_MODE, _CSETF_EVENT_LISTENER_INVOCATION_MODE);
        def_csetf(EVENT_LISTENER_INVOCATION_INFO, _CSETF_EVENT_LISTENER_INVOCATION_INFO);
        def_csetf(EVENT_LISTENER_MY_PARAMS, _CSETF_EVENT_LISTENER_MY_PARAMS);
        def_csetf(EVENT_LISTENER_SOURCE_FILTER, _CSETF_EVENT_LISTENER_SOURCE_FILTER);
        identity(EVENT_LISTENER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_event_listener$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_EVENT_LISTENER_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_event_broker$.getGlobalValue(), symbol_function(EVENT_BROKER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list79);
        def_csetf(EVENT_BROKER_HIERARCHY, _CSETF_EVENT_BROKER_HIERARCHY);
        def_csetf(EVENT_BROKER_LISTENERS, _CSETF_EVENT_BROKER_LISTENERS);
        def_csetf(EVENT_BROKER_LOCK, _CSETF_EVENT_BROKER_LOCK);
        def_csetf(EVENT_BROKER_POSTINGS, _CSETF_EVENT_BROKER_POSTINGS);
        def_csetf(EVENT_BROKER_PROTOCOLS, _CSETF_EVENT_BROKER_PROTOCOLS);
        identity(EVENT_BROKER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_event_broker$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_EVENT_BROKER_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_protocol_description$.getGlobalValue(), symbol_function(PROTOCOL_DESCRIPTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list115);
        def_csetf(PROTOCOL_DESCRIPTION_PROTOCOL, _CSETF_PROTOCOL_DESCRIPTION_PROTOCOL);
        def_csetf(PROTOCOL_DESCRIPTION_EVENT_SERIALIZE, _CSETF_PROTOCOL_DESCRIPTION_EVENT_SERIALIZE);
        def_csetf(PROTOCOL_DESCRIPTION_MY_PARAMS_SERIALIZE, _CSETF_PROTOCOL_DESCRIPTION_MY_PARAMS_SERIALIZE);
        identity(PROTOCOL_DESCRIPTION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_protocol_description$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PROTOCOL_DESCRIPTION_METHOD));
        declare_defglobal($event_broker$);
        memoization_state.note_globally_cached_function($sym141$FAST_HAS_EVENT_CLASS_ANY_TRANSITIVE_LISTENERS_);
        event_model.declare_base_event_class_internal($EVENT_BROKER_EVENT, $SYSTEM_EVENT, $str152$The_parent_for_all_events_that_th, NIL);
        event_model.declare_base_event_class_internal($EVENT_HANDLER_REGISTERED, $EVENT_BROKER_EVENT, $str154$The_first_message_any_event_handl, NIL);
        event_model.declare_base_event_class_internal($EVENT_HANDLER_DEREGISTERED, $EVENT_BROKER_EVENT, $str156$The_last_message_any_event_handle, NIL);
        register_event_socket_protocol($CFASL, DEFAULT_CFASL_EVENT_SERIALIZE, DEFAULT_CFASL_PARAMS_SERIALIZE, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_event_broker_file();
    }

    @Override
    public void initializeVariables() {
        init_event_broker_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_event_broker_file();
    }

    static {
























































































































































































    }

    public static final class $funcall_info_native extends SubLStructNative {
        public SubLObject $function;

        private static final SubLStructDeclNative structDecl;

        private $funcall_info_native() {
            this.$function = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$function;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$function = value;
        }

        static {
            structDecl = makeStructDeclNative($funcall_info_native.class, FUNCALL_INFO, FUNCALL_INFO_P, $list2, $list3, new String[]{ "$function" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $funcall_info_p$UnaryFunction extends UnaryFunction {
        public $funcall_info_p$UnaryFunction() {
            super(extractFunctionNamed("FUNCALL-INFO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return funcall_info_p(arg1);
        }
    }

    public static final class $socket_info_native extends SubLStructNative {
        public SubLObject $host;

        public SubLObject $port;

        public SubLObject $protocol;

        private static final SubLStructDeclNative structDecl;

        private $socket_info_native() {
            this.$host = Lisp.NIL;
            this.$port = Lisp.NIL;
            this.$protocol = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$host;
        }

        @Override
        public SubLObject getField3() {
            return this.$port;
        }

        @Override
        public SubLObject getField4() {
            return this.$protocol;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$host = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$port = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$protocol = value;
        }

        static {
            structDecl = makeStructDeclNative($socket_info_native.class, SOCKET_INFO, SOCKET_INFO_P, $list21, $list22, new String[]{ "$host", "$port", "$protocol" }, $list23, $list24, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $socket_info_p$UnaryFunction extends UnaryFunction {
        public $socket_info_p$UnaryFunction() {
            super(extractFunctionNamed("SOCKET-INFO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return socket_info_p(arg1);
        }
    }

    public static final class $event_listener_native extends SubLStructNative {
        public SubLObject $event;

        public SubLObject $invocation_mode;

        public SubLObject $invocation_info;

        public SubLObject $my_params;

        public SubLObject $source_filter;

        private static final SubLStructDeclNative structDecl;

        private $event_listener_native() {
            this.$event = Lisp.NIL;
            this.$invocation_mode = Lisp.NIL;
            this.$invocation_info = Lisp.NIL;
            this.$my_params = Lisp.NIL;
            this.$source_filter = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$event;
        }

        @Override
        public SubLObject getField3() {
            return this.$invocation_mode;
        }

        @Override
        public SubLObject getField4() {
            return this.$invocation_info;
        }

        @Override
        public SubLObject getField5() {
            return this.$my_params;
        }

        @Override
        public SubLObject getField6() {
            return this.$source_filter;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$event = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$invocation_mode = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$invocation_info = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$my_params = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$source_filter = value;
        }

        static {
            structDecl = makeStructDeclNative($event_listener_native.class, EVENT_LISTENER, EVENT_LISTENER_P, $list41, $list42, new String[]{ "$event", "$invocation_mode", "$invocation_info", "$my_params", "$source_filter" }, $list43, $list44, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $event_listener_p$UnaryFunction extends UnaryFunction {
        public $event_listener_p$UnaryFunction() {
            super(extractFunctionNamed("EVENT-LISTENER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return event_listener_p(arg1);
        }
    }

    public static final class $event_broker_native extends SubLStructNative {
        public SubLObject $hierarchy;

        public SubLObject $listeners;

        public SubLObject $lock;

        public SubLObject $postings;

        public SubLObject $protocols;

        private static final SubLStructDeclNative structDecl;

        private $event_broker_native() {
            this.$hierarchy = Lisp.NIL;
            this.$listeners = Lisp.NIL;
            this.$lock = Lisp.NIL;
            this.$postings = Lisp.NIL;
            this.$protocols = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$hierarchy;
        }

        @Override
        public SubLObject getField3() {
            return this.$listeners;
        }

        @Override
        public SubLObject getField4() {
            return this.$lock;
        }

        @Override
        public SubLObject getField5() {
            return this.$postings;
        }

        @Override
        public SubLObject getField6() {
            return this.$protocols;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$hierarchy = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$listeners = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$lock = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$postings = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$protocols = value;
        }

        static {
            structDecl = makeStructDeclNative($event_broker_native.class, EVENT_BROKER, EVENT_BROKER_P, $list74, $list75, new String[]{ "$hierarchy", "$listeners", "$lock", "$postings", "$protocols" }, $list76, $list77, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $event_broker_p$UnaryFunction extends UnaryFunction {
        public $event_broker_p$UnaryFunction() {
            super(extractFunctionNamed("EVENT-BROKER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return event_broker_p(arg1);
        }
    }

    public static final class $protocol_description_native extends SubLStructNative {
        public SubLObject $protocol;

        public SubLObject $event_serialize;

        public SubLObject $my_params_serialize;

        private static final SubLStructDeclNative structDecl;

        private $protocol_description_native() {
            this.$protocol = Lisp.NIL;
            this.$event_serialize = Lisp.NIL;
            this.$my_params_serialize = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$protocol;
        }

        @Override
        public SubLObject getField3() {
            return this.$event_serialize;
        }

        @Override
        public SubLObject getField4() {
            return this.$my_params_serialize;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$protocol = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$event_serialize = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$my_params_serialize = value;
        }

        static {
            structDecl = makeStructDeclNative($protocol_description_native.class, PROTOCOL_DESCRIPTION, PROTOCOL_DESCRIPTION_P, $list110, $list111, new String[]{ "$protocol", "$event_serialize", "$my_params_serialize" }, $list112, $list113, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $protocol_description_p$UnaryFunction extends UnaryFunction {
        public $protocol_description_p$UnaryFunction() {
            super(extractFunctionNamed("PROTOCOL-DESCRIPTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return protocol_description_p(arg1);
        }
    }
}

/**
 * Total time: 418 ms
 */
