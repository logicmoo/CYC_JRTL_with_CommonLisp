/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_macro_promotions.validate_tcp_connection;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      EVENT-BROKER
 * source file: /cyc/top/cycl/event-broker.lisp
 * created:     2019/07/03 17:37:17
 */
public final class event_broker extends SubLTranslatedFile implements V12 {
    public static final class $socket_info_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.event_broker.$socket_info_native.this.$host;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.event_broker.$socket_info_native.this.$port;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.event_broker.$socket_info_native.this.$protocol;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.event_broker.$socket_info_native.this.$host = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.event_broker.$socket_info_native.this.$port = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.event_broker.$socket_info_native.this.$protocol = value;
        }

        public SubLObject $host = Lisp.NIL;

        public SubLObject $port = Lisp.NIL;

        public SubLObject $protocol = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.event_broker.$socket_info_native.class, SOCKET_INFO, SOCKET_INFO_P, $list_alt15, $list_alt16, new String[]{ "$host", "$port", "$protocol" }, $list_alt17, $list_alt18, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final class $protocol_description_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.event_broker.$protocol_description_native.this.$protocol;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.event_broker.$protocol_description_native.this.$event_serialize;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.event_broker.$protocol_description_native.this.$my_params_serialize;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.event_broker.$protocol_description_native.this.$protocol = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.event_broker.$protocol_description_native.this.$event_serialize = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.event_broker.$protocol_description_native.this.$my_params_serialize = value;
        }

        public SubLObject $protocol = Lisp.NIL;

        public SubLObject $event_serialize = Lisp.NIL;

        public SubLObject $my_params_serialize = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.event_broker.$protocol_description_native.class, PROTOCOL_DESCRIPTION, PROTOCOL_DESCRIPTION_P, $list_alt95, $list_alt96, new String[]{ "$protocol", "$event_serialize", "$my_params_serialize" }, $list_alt97, $list_alt98, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final class $funcall_info_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.event_broker.$funcall_info_native.this.$function;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.event_broker.$funcall_info_native.this.$function = value;
        }

        public SubLObject $function = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.event_broker.$funcall_info_native.class, FUNCALL_INFO, FUNCALL_INFO_P, $list_alt2, $list_alt3, new String[]{ "$function" }, $list_alt4, $list_alt5, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final class $event_listener_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.event_broker.$event_listener_native.this.$event;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.event_broker.$event_listener_native.this.$invocation_mode;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.event_broker.$event_listener_native.this.$invocation_info;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.event_broker.$event_listener_native.this.$my_params;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.event_broker.$event_listener_native.this.$source_filter;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.event_broker.$event_listener_native.this.$event = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.event_broker.$event_listener_native.this.$invocation_mode = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.event_broker.$event_listener_native.this.$invocation_info = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.event_broker.$event_listener_native.this.$my_params = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.event_broker.$event_listener_native.this.$source_filter = value;
        }

        public SubLObject $event = Lisp.NIL;

        public SubLObject $invocation_mode = Lisp.NIL;

        public SubLObject $invocation_info = Lisp.NIL;

        public SubLObject $my_params = Lisp.NIL;

        public SubLObject $source_filter = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.event_broker.$event_listener_native.class, EVENT_LISTENER, EVENT_LISTENER_P, $list_alt32, $list_alt33, new String[]{ "$event", "$invocation_mode", "$invocation_info", "$my_params", "$source_filter" }, $list_alt34, $list_alt35, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final class $event_broker_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.event_broker.$event_broker_native.this.$hierarchy;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.event_broker.$event_broker_native.this.$listeners;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.event_broker.$event_broker_native.this.$lock;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.event_broker.$event_broker_native.this.$postings;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.event_broker.$event_broker_native.this.$protocols;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.event_broker.$event_broker_native.this.$hierarchy = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.event_broker.$event_broker_native.this.$listeners = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.event_broker.$event_broker_native.this.$lock = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.event_broker.$event_broker_native.this.$postings = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.event_broker.$event_broker_native.this.$protocols = value;
        }

        public SubLObject $hierarchy = Lisp.NIL;

        public SubLObject $listeners = Lisp.NIL;

        public SubLObject $lock = Lisp.NIL;

        public SubLObject $postings = Lisp.NIL;

        public SubLObject $protocols = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.event_broker.$event_broker_native.class, EVENT_BROKER, EVENT_BROKER_P, $list_alt62, $list_alt63, new String[]{ "$hierarchy", "$listeners", "$lock", "$postings", "$protocols" }, $list_alt64, $list_alt65, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final SubLFile me = new event_broker();

 public static final String myName = "com.cyc.cycjava.cycl.event_broker";


    // deflexical
    @LispMethod(comment = "deflexical")
    // Definitions
    public static final SubLSymbol $should_show_event_errorsP$ = makeSymbol("*SHOULD-SHOW-EVENT-ERRORS?*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_funcall_info$ = makeSymbol("*DTP-FUNCALL-INFO*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_socket_info$ = makeSymbol("*DTP-SOCKET-INFO*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_event_listener$ = makeSymbol("*DTP-EVENT-LISTENER*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_event_broker$ = makeSymbol("*DTP-EVENT-BROKER*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_protocol_description$ = makeSymbol("*DTP-PROTOCOL-DESCRIPTION*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $fast_has_event_class_any_transitive_listenersP_caching_state$ = makeSymbol("*FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?-CACHING-STATE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $deregistration_during_system_initialization$ = makeSymbol("*DEREGISTRATION-DURING-SYSTEM-INITIALIZATION*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol FUNCALL_INFO = makeSymbol("FUNCALL-INFO");

    private static final SubLSymbol FUNCALL_INFO_P = makeSymbol("FUNCALL-INFO-P");

    static private final SubLList $list2 = list(makeSymbol("FUNCTION"));

    static private final SubLList $list3 = list(makeKeyword("FUNCTION"));

    static private final SubLList $list4 = list(makeSymbol("FUNCALL-INFO-FUNCTION"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-FUNCALL-INFO-FUNCTION"));

    private static final SubLSymbol FUNCALL_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FUNCALL-INFO-PRINT-FUNCTION-TRAMPOLINE");

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

    private static final SubLList $list22 = list($HOST, $PORT, makeKeyword("PROTOCOL"));

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

    private static final SubLList $list75 = list(makeKeyword("HIERARCHY"), makeKeyword("LISTENERS"), $LOCK, makeKeyword("POSTINGS"), makeKeyword("PROTOCOLS"));

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

    static private final SubLList $list97 = list(list(makeSymbol("EVENT-BROKER")), makeSymbol("&BODY"), makeSymbol("BODY"));

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

    public static final SubLObject funcall_info_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject funcall_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject funcall_info_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.event_broker.$funcall_info_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject funcall_info_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.event_broker.$funcall_info_native.class ? T : NIL;
    }

    public static final SubLObject funcall_info_function_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FUNCALL_INFO_P);
        return v_object.getField2();
    }

    public static SubLObject funcall_info_function(final SubLObject v_object) {
        assert NIL != event_broker.funcall_info_p(v_object) : "! event_broker.funcall_info_p(v_object) " + "event_broker.funcall_info_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject _csetf_funcall_info_function_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FUNCALL_INFO_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_funcall_info_function(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_broker.funcall_info_p(v_object) : "! event_broker.funcall_info_p(v_object) " + "event_broker.funcall_info_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject make_funcall_info_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.event_broker.$funcall_info_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($FUNCTION)) {
                        com.cyc.cycjava.cycl.event_broker._csetf_funcall_info_function(v_new, current_value);
                    } else {
                        Errors.error($str_alt11$Invalid_slot__S_for_construction_, current_arg);
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_funcall_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.event_broker.$funcall_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($FUNCTION)) {
                event_broker._csetf_funcall_info_function(v_new, current_value);
            } else {
                Errors.error(event_broker.$str12$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_funcall_info(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, event_broker.MAKE_FUNCALL_INFO, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $FUNCTION, event_broker.funcall_info_function(obj));
        funcall(visitor_fn, obj, $END, event_broker.MAKE_FUNCALL_INFO, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_funcall_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return event_broker.visit_defstruct_funcall_info(obj, visitor_fn);
    }

    public static final SubLObject display_funcall_info_alt(SubLObject funcall_info, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str_alt12$_funcall__S_, com.cyc.cycjava.cycl.event_broker.funcall_info_function(funcall_info));
        return funcall_info;
    }

    public static SubLObject display_funcall_info(final SubLObject funcall_info, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, event_broker.$str18$_funcall__S_, event_broker.funcall_info_function(funcall_info));
        return funcall_info;
    }

    public static final SubLObject socket_info_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject socket_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject socket_info_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.event_broker.$socket_info_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject socket_info_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.event_broker.$socket_info_native.class ? T : NIL;
    }

    public static final SubLObject socket_info_host_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SOCKET_INFO_P);
        return v_object.getField2();
    }

    public static SubLObject socket_info_host(final SubLObject v_object) {
        assert NIL != event_broker.socket_info_p(v_object) : "! event_broker.socket_info_p(v_object) " + "event_broker.socket_info_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject socket_info_port_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SOCKET_INFO_P);
        return v_object.getField3();
    }

    public static SubLObject socket_info_port(final SubLObject v_object) {
        assert NIL != event_broker.socket_info_p(v_object) : "! event_broker.socket_info_p(v_object) " + "event_broker.socket_info_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject socket_info_protocol_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SOCKET_INFO_P);
        return v_object.getField4();
    }

    public static SubLObject socket_info_protocol(final SubLObject v_object) {
        assert NIL != event_broker.socket_info_p(v_object) : "! event_broker.socket_info_p(v_object) " + "event_broker.socket_info_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_socket_info_host_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SOCKET_INFO_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_socket_info_host(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_broker.socket_info_p(v_object) : "! event_broker.socket_info_p(v_object) " + "event_broker.socket_info_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_socket_info_port_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SOCKET_INFO_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_socket_info_port(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_broker.socket_info_p(v_object) : "! event_broker.socket_info_p(v_object) " + "event_broker.socket_info_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_socket_info_protocol_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SOCKET_INFO_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_socket_info_protocol(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_broker.socket_info_p(v_object) : "! event_broker.socket_info_p(v_object) " + "event_broker.socket_info_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_socket_info_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.event_broker.$socket_info_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($HOST)) {
                        com.cyc.cycjava.cycl.event_broker._csetf_socket_info_host(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PORT)) {
                            com.cyc.cycjava.cycl.event_broker._csetf_socket_info_port(v_new, current_value);
                        } else {
                            if (pcase_var.eql($PROTOCOL)) {
                                com.cyc.cycjava.cycl.event_broker._csetf_socket_info_protocol(v_new, current_value);
                            } else {
                                Errors.error($str_alt11$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_socket_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.event_broker.$socket_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($HOST)) {
                event_broker._csetf_socket_info_host(v_new, current_value);
            } else
                if (pcase_var.eql($PORT)) {
                    event_broker._csetf_socket_info_port(v_new, current_value);
                } else
                    if (pcase_var.eql($PROTOCOL)) {
                        event_broker._csetf_socket_info_protocol(v_new, current_value);
                    } else {
                        Errors.error(event_broker.$str12$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_socket_info(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, event_broker.MAKE_SOCKET_INFO, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $HOST, event_broker.socket_info_host(obj));
        funcall(visitor_fn, obj, $SLOT, $PORT, event_broker.socket_info_port(obj));
        funcall(visitor_fn, obj, $SLOT, $PROTOCOL, event_broker.socket_info_protocol(obj));
        funcall(visitor_fn, obj, $END, event_broker.MAKE_SOCKET_INFO, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_socket_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return event_broker.visit_defstruct_socket_info(obj, visitor_fn);
    }

    public static final SubLObject new_socket_info_alt(SubLObject host, SubLObject port, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = NIL;
        }
        {
            SubLObject socket_info = com.cyc.cycjava.cycl.event_broker.make_socket_info(UNPROVIDED);
            com.cyc.cycjava.cycl.event_broker._csetf_socket_info_host(socket_info, host);
            com.cyc.cycjava.cycl.event_broker._csetf_socket_info_port(socket_info, port);
            if (NIL != protocol) {
                com.cyc.cycjava.cycl.event_broker._csetf_socket_info_protocol(socket_info, protocol);
            }
            return socket_info;
        }
    }

    public static SubLObject new_socket_info(final SubLObject host, final SubLObject port, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = NIL;
        }
        final SubLObject socket_info = event_broker.make_socket_info(UNPROVIDED);
        event_broker._csetf_socket_info_host(socket_info, host);
        event_broker._csetf_socket_info_port(socket_info, port);
        if (NIL != protocol) {
            event_broker._csetf_socket_info_protocol(socket_info, protocol);
        }
        return socket_info;
    }

    public static final SubLObject display_socket_info_alt(SubLObject socket_info, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str_alt29$_socket__S__S__S_, new SubLObject[]{ com.cyc.cycjava.cycl.event_broker.socket_info_host(socket_info), com.cyc.cycjava.cycl.event_broker.socket_info_port(socket_info), com.cyc.cycjava.cycl.event_broker.socket_info_protocol(socket_info) });
        return socket_info;
    }

    public static SubLObject display_socket_info(final SubLObject socket_info, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, event_broker.$str38$_socket__S__S__S_, new SubLObject[]{ event_broker.socket_info_host(socket_info), event_broker.socket_info_port(socket_info), event_broker.socket_info_protocol(socket_info) });
        return socket_info;
    }

    public static final SubLObject event_listener_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject event_listener_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject event_listener_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.event_broker.$event_listener_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject event_listener_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.event_broker.$event_listener_native.class ? T : NIL;
    }

    public static final SubLObject event_listener_event_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EVENT_LISTENER_P);
        return v_object.getField2();
    }

    public static SubLObject event_listener_event(final SubLObject v_object) {
        assert NIL != event_broker.event_listener_p(v_object) : "! event_broker.event_listener_p(v_object) " + "event_broker.event_listener_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject event_listener_invocation_mode_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EVENT_LISTENER_P);
        return v_object.getField3();
    }

    public static SubLObject event_listener_invocation_mode(final SubLObject v_object) {
        assert NIL != event_broker.event_listener_p(v_object) : "! event_broker.event_listener_p(v_object) " + "event_broker.event_listener_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject event_listener_invocation_info_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EVENT_LISTENER_P);
        return v_object.getField4();
    }

    public static SubLObject event_listener_invocation_info(final SubLObject v_object) {
        assert NIL != event_broker.event_listener_p(v_object) : "! event_broker.event_listener_p(v_object) " + "event_broker.event_listener_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject event_listener_my_params_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EVENT_LISTENER_P);
        return v_object.getField5();
    }

    public static SubLObject event_listener_my_params(final SubLObject v_object) {
        assert NIL != event_broker.event_listener_p(v_object) : "! event_broker.event_listener_p(v_object) " + "event_broker.event_listener_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject event_listener_source_filter_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EVENT_LISTENER_P);
        return v_object.getField6();
    }

    public static SubLObject event_listener_source_filter(final SubLObject v_object) {
        assert NIL != event_broker.event_listener_p(v_object) : "! event_broker.event_listener_p(v_object) " + "event_broker.event_listener_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_event_listener_event_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EVENT_LISTENER_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_event_listener_event(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_broker.event_listener_p(v_object) : "! event_broker.event_listener_p(v_object) " + "event_broker.event_listener_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_event_listener_invocation_mode_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EVENT_LISTENER_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_event_listener_invocation_mode(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_broker.event_listener_p(v_object) : "! event_broker.event_listener_p(v_object) " + "event_broker.event_listener_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_event_listener_invocation_info_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EVENT_LISTENER_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_event_listener_invocation_info(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_broker.event_listener_p(v_object) : "! event_broker.event_listener_p(v_object) " + "event_broker.event_listener_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_event_listener_my_params_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EVENT_LISTENER_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_event_listener_my_params(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_broker.event_listener_p(v_object) : "! event_broker.event_listener_p(v_object) " + "event_broker.event_listener_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_event_listener_source_filter_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EVENT_LISTENER_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_event_listener_source_filter(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_broker.event_listener_p(v_object) : "! event_broker.event_listener_p(v_object) " + "event_broker.event_listener_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_event_listener_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.event_broker.$event_listener_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($EVENT)) {
                        com.cyc.cycjava.cycl.event_broker._csetf_event_listener_event(v_new, current_value);
                    } else {
                        if (pcase_var.eql($INVOCATION_MODE)) {
                            com.cyc.cycjava.cycl.event_broker._csetf_event_listener_invocation_mode(v_new, current_value);
                        } else {
                            if (pcase_var.eql($INVOCATION_INFO)) {
                                com.cyc.cycjava.cycl.event_broker._csetf_event_listener_invocation_info(v_new, current_value);
                            } else {
                                if (pcase_var.eql($MY_PARAMS)) {
                                    com.cyc.cycjava.cycl.event_broker._csetf_event_listener_my_params(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($SOURCE_FILTER)) {
                                        com.cyc.cycjava.cycl.event_broker._csetf_event_listener_source_filter(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt11$Invalid_slot__S_for_construction_, current_arg);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_event_listener(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.event_broker.$event_listener_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($EVENT)) {
                event_broker._csetf_event_listener_event(v_new, current_value);
            } else
                if (pcase_var.eql($INVOCATION_MODE)) {
                    event_broker._csetf_event_listener_invocation_mode(v_new, current_value);
                } else
                    if (pcase_var.eql($INVOCATION_INFO)) {
                        event_broker._csetf_event_listener_invocation_info(v_new, current_value);
                    } else
                        if (pcase_var.eql($MY_PARAMS)) {
                            event_broker._csetf_event_listener_my_params(v_new, current_value);
                        } else
                            if (pcase_var.eql($SOURCE_FILTER)) {
                                event_broker._csetf_event_listener_source_filter(v_new, current_value);
                            } else {
                                Errors.error(event_broker.$str12$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_event_listener(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, event_broker.MAKE_EVENT_LISTENER, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $EVENT, event_broker.event_listener_event(obj));
        funcall(visitor_fn, obj, $SLOT, $INVOCATION_MODE, event_broker.event_listener_invocation_mode(obj));
        funcall(visitor_fn, obj, $SLOT, $INVOCATION_INFO, event_broker.event_listener_invocation_info(obj));
        funcall(visitor_fn, obj, $SLOT, $MY_PARAMS, event_broker.event_listener_my_params(obj));
        funcall(visitor_fn, obj, $SLOT, $SOURCE_FILTER, event_broker.event_listener_source_filter(obj));
        funcall(visitor_fn, obj, $END, event_broker.MAKE_EVENT_LISTENER, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_event_listener_method(final SubLObject obj, final SubLObject visitor_fn) {
        return event_broker.visit_defstruct_event_listener(obj, visitor_fn);
    }

    public static final SubLObject describe_funcall_listener_alt(SubLObject event, SubLObject function, SubLObject my_params, SubLObject source_filter) {
        if (my_params == UNPROVIDED) {
            my_params = NIL;
        }
        if (source_filter == UNPROVIDED) {
            source_filter = FALSE;
        }
        {
            SubLObject listener = com.cyc.cycjava.cycl.event_broker.make_event_listener(UNPROVIDED);
            SubLObject info = com.cyc.cycjava.cycl.event_broker.make_funcall_info(UNPROVIDED);
            com.cyc.cycjava.cycl.event_broker._csetf_funcall_info_function(info, function);
            com.cyc.cycjava.cycl.event_broker._csetf_event_listener_event(listener, event);
            com.cyc.cycjava.cycl.event_broker._csetf_event_listener_invocation_mode(listener, $FUNCALL);
            com.cyc.cycjava.cycl.event_broker._csetf_event_listener_invocation_info(listener, info);
            com.cyc.cycjava.cycl.event_broker._csetf_event_listener_my_params(listener, my_params);
            com.cyc.cycjava.cycl.event_broker._csetf_event_listener_source_filter(listener, source_filter);
            return listener;
        }
    }

    public static SubLObject describe_funcall_listener(final SubLObject event, final SubLObject function, SubLObject my_params, SubLObject source_filter) {
        if (my_params == UNPROVIDED) {
            my_params = NIL;
        }
        if (source_filter == UNPROVIDED) {
            source_filter = FALSE;
        }
        final SubLObject listener = event_broker.make_event_listener(UNPROVIDED);
        final SubLObject info = event_broker.make_funcall_info(UNPROVIDED);
        event_broker._csetf_funcall_info_function(info, function);
        event_broker._csetf_event_listener_event(listener, event);
        event_broker._csetf_event_listener_invocation_mode(listener, $FUNCALL);
        event_broker._csetf_event_listener_invocation_info(listener, info);
        event_broker._csetf_event_listener_my_params(listener, my_params);
        event_broker._csetf_event_listener_source_filter(listener, source_filter);
        return listener;
    }

    public static final SubLObject describe_socket_listener_alt(SubLObject event, SubLObject host, SubLObject port, SubLObject my_params, SubLObject source_filter) {
        if (my_params == UNPROVIDED) {
            my_params = NIL;
        }
        if (source_filter == UNPROVIDED) {
            source_filter = FALSE;
        }
        {
            SubLObject listener = com.cyc.cycjava.cycl.event_broker.make_event_listener(UNPROVIDED);
            SubLObject info = com.cyc.cycjava.cycl.event_broker.make_socket_info(UNPROVIDED);
            com.cyc.cycjava.cycl.event_broker._csetf_socket_info_host(info, host);
            com.cyc.cycjava.cycl.event_broker._csetf_socket_info_port(info, port);
            com.cyc.cycjava.cycl.event_broker._csetf_socket_info_protocol(info, $DEFAULT);
            com.cyc.cycjava.cycl.event_broker._csetf_event_listener_event(listener, event);
            com.cyc.cycjava.cycl.event_broker._csetf_event_listener_invocation_mode(listener, $SOCKET);
            com.cyc.cycjava.cycl.event_broker._csetf_event_listener_invocation_info(listener, info);
            com.cyc.cycjava.cycl.event_broker._csetf_event_listener_my_params(listener, my_params);
            com.cyc.cycjava.cycl.event_broker._csetf_event_listener_source_filter(listener, source_filter);
            return listener;
        }
    }

    public static SubLObject describe_socket_listener(final SubLObject event, final SubLObject host, final SubLObject port, SubLObject my_params, SubLObject source_filter) {
        if (my_params == UNPROVIDED) {
            my_params = NIL;
        }
        if (source_filter == UNPROVIDED) {
            source_filter = FALSE;
        }
        final SubLObject listener = event_broker.make_event_listener(UNPROVIDED);
        final SubLObject info = event_broker.make_socket_info(UNPROVIDED);
        event_broker._csetf_socket_info_host(info, host);
        event_broker._csetf_socket_info_port(info, port);
        event_broker._csetf_socket_info_protocol(info, $DEFAULT);
        event_broker._csetf_event_listener_event(listener, event);
        event_broker._csetf_event_listener_invocation_mode(listener, $SOCKET);
        event_broker._csetf_event_listener_invocation_info(listener, info);
        event_broker._csetf_event_listener_my_params(listener, my_params);
        event_broker._csetf_event_listener_source_filter(listener, source_filter);
        return listener;
    }

    public static final SubLObject display_event_listener_alt(SubLObject event_listener, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            SubLObject event = com.cyc.cycjava.cycl.event_broker.event_listener_event(event_listener);
            SubLObject mode = com.cyc.cycjava.cycl.event_broker.event_listener_invocation_mode(event_listener);
            SubLObject info = com.cyc.cycjava.cycl.event_broker.event_listener_invocation_info(event_listener);
            SubLObject source_filter = com.cyc.cycjava.cycl.event_broker.event_listener_source_filter(event_listener);
            format(stream, $str_alt56$_S_listener_, event);
            {
                SubLObject pcase_var = mode;
                if (pcase_var.eql($SOCKET)) {
                    com.cyc.cycjava.cycl.event_broker.display_socket_info(info, stream);
                } else {
                    if (pcase_var.eql($FUNCALL)) {
                        com.cyc.cycjava.cycl.event_broker.display_funcall_info(info, stream);
                    } else {
                        format(stream, $str_alt57$_S__unknown_mode__, mode);
                    }
                }
            }
            format(stream, $str_alt58$_with_parameters__S_, com.cyc.cycjava.cycl.event_broker.event_listener_my_params(event_listener));
            if (source_filter != FALSE) {
                format(stream, $str_alt59$_source_filtering__S, source_filter);
            }
            terpri(stream);
        }
        return event_listener;
    }

    public static SubLObject display_event_listener(final SubLObject event_listener, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLObject event = event_broker.event_listener_event(event_listener);
        final SubLObject mode = event_broker.event_listener_invocation_mode(event_listener);
        final SubLObject info = event_broker.event_listener_invocation_info(event_listener);
        final SubLObject source_filter = event_broker.event_listener_source_filter(event_listener);
        format(stream, event_broker.$str68$_S_listener_, event);
        final SubLObject pcase_var = mode;
        if (pcase_var.eql($SOCKET)) {
            event_broker.display_socket_info(info, stream);
        } else
            if (pcase_var.eql($FUNCALL)) {
                event_broker.display_funcall_info(info, stream);
            } else {
                format(stream, event_broker.$str69$_S__unknown_mode__, mode);
            }

        format(stream, event_broker.$str70$_with_parameters__S_, event_broker.event_listener_my_params(event_listener));
        if (source_filter != FALSE) {
            format(stream, event_broker.$str71$_source_filtering__S, source_filter);
        }
        terpri(stream);
        return event_listener;
    }

    public static final SubLObject event_broker_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject event_broker_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject event_broker_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.event_broker.$event_broker_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject event_broker_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.event_broker.$event_broker_native.class ? T : NIL;
    }

    public static final SubLObject event_broker_hierarchy_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EVENT_BROKER_P);
        return v_object.getField2();
    }

    public static SubLObject event_broker_hierarchy(final SubLObject v_object) {
        assert NIL != event_broker.event_broker_p(v_object) : "! event_broker.event_broker_p(v_object) " + "event_broker.event_broker_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject event_broker_listeners_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EVENT_BROKER_P);
        return v_object.getField3();
    }

    public static SubLObject event_broker_listeners(final SubLObject v_object) {
        assert NIL != event_broker.event_broker_p(v_object) : "! event_broker.event_broker_p(v_object) " + "event_broker.event_broker_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject event_broker_lock_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EVENT_BROKER_P);
        return v_object.getField4();
    }

    public static SubLObject event_broker_lock(final SubLObject v_object) {
        assert NIL != event_broker.event_broker_p(v_object) : "! event_broker.event_broker_p(v_object) " + "event_broker.event_broker_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject event_broker_postings_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EVENT_BROKER_P);
        return v_object.getField5();
    }

    public static SubLObject event_broker_postings(final SubLObject v_object) {
        assert NIL != event_broker.event_broker_p(v_object) : "! event_broker.event_broker_p(v_object) " + "event_broker.event_broker_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject event_broker_protocols_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EVENT_BROKER_P);
        return v_object.getField6();
    }

    public static SubLObject event_broker_protocols(final SubLObject v_object) {
        assert NIL != event_broker.event_broker_p(v_object) : "! event_broker.event_broker_p(v_object) " + "event_broker.event_broker_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_event_broker_hierarchy_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EVENT_BROKER_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_event_broker_hierarchy(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_broker.event_broker_p(v_object) : "! event_broker.event_broker_p(v_object) " + "event_broker.event_broker_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_event_broker_listeners_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EVENT_BROKER_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_event_broker_listeners(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_broker.event_broker_p(v_object) : "! event_broker.event_broker_p(v_object) " + "event_broker.event_broker_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_event_broker_lock_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EVENT_BROKER_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_event_broker_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_broker.event_broker_p(v_object) : "! event_broker.event_broker_p(v_object) " + "event_broker.event_broker_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_event_broker_postings_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EVENT_BROKER_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_event_broker_postings(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_broker.event_broker_p(v_object) : "! event_broker.event_broker_p(v_object) " + "event_broker.event_broker_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_event_broker_protocols_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EVENT_BROKER_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_event_broker_protocols(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_broker.event_broker_p(v_object) : "! event_broker.event_broker_p(v_object) " + "event_broker.event_broker_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_event_broker_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.event_broker.$event_broker_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($HIERARCHY)) {
                        com.cyc.cycjava.cycl.event_broker._csetf_event_broker_hierarchy(v_new, current_value);
                    } else {
                        if (pcase_var.eql($LISTENERS)) {
                            com.cyc.cycjava.cycl.event_broker._csetf_event_broker_listeners(v_new, current_value);
                        } else {
                            if (pcase_var.eql($LOCK)) {
                                com.cyc.cycjava.cycl.event_broker._csetf_event_broker_lock(v_new, current_value);
                            } else {
                                if (pcase_var.eql($POSTINGS)) {
                                    com.cyc.cycjava.cycl.event_broker._csetf_event_broker_postings(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($PROTOCOLS)) {
                                        com.cyc.cycjava.cycl.event_broker._csetf_event_broker_protocols(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt11$Invalid_slot__S_for_construction_, current_arg);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_event_broker(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.event_broker.$event_broker_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($HIERARCHY)) {
                event_broker._csetf_event_broker_hierarchy(v_new, current_value);
            } else
                if (pcase_var.eql($LISTENERS)) {
                    event_broker._csetf_event_broker_listeners(v_new, current_value);
                } else
                    if (pcase_var.eql($LOCK)) {
                        event_broker._csetf_event_broker_lock(v_new, current_value);
                    } else
                        if (pcase_var.eql($POSTINGS)) {
                            event_broker._csetf_event_broker_postings(v_new, current_value);
                        } else
                            if (pcase_var.eql($PROTOCOLS)) {
                                event_broker._csetf_event_broker_protocols(v_new, current_value);
                            } else {
                                Errors.error(event_broker.$str12$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_event_broker(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, event_broker.MAKE_EVENT_BROKER, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $HIERARCHY, event_broker.event_broker_hierarchy(obj));
        funcall(visitor_fn, obj, $SLOT, $LISTENERS, event_broker.event_broker_listeners(obj));
        funcall(visitor_fn, obj, $SLOT, $LOCK, event_broker.event_broker_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $POSTINGS, event_broker.event_broker_postings(obj));
        funcall(visitor_fn, obj, $SLOT, $PROTOCOLS, event_broker.event_broker_protocols(obj));
        funcall(visitor_fn, obj, $END, event_broker.MAKE_EVENT_BROKER, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_event_broker_method(final SubLObject obj, final SubLObject visitor_fn) {
        return event_broker.visit_defstruct_event_broker(obj, visitor_fn);
    }

    public static final SubLObject with_event_broker_lock_held_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt82);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_event_broker = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt82);
                    v_event_broker = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(WITH_LOCK_HELD, list(list(EVENT_BROKER_LOCK, v_event_broker)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt82);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_event_broker_lock_held(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, event_broker.$list97);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_event_broker = NIL;
        destructuring_bind_must_consp(current, datum, event_broker.$list97);
        v_event_broker = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(WITH_LOCK_HELD, list(list(event_broker.EVENT_BROKER_LOCK, v_event_broker)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, event_broker.$list97);
        return NIL;
    }

    public static final SubLObject add_listener_to_broker_alt(SubLObject listener, SubLObject broker) {
        {
            SubLObject lock = com.cyc.cycjava.cycl.event_broker.event_broker_lock(broker);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject event = com.cyc.cycjava.cycl.event_broker.event_listener_event(listener);
                    SubLObject listeners = com.cyc.cycjava.cycl.event_broker.event_broker_listeners(broker);
                    dictionary_utilities.dictionary_pushnew(listeners, event, listener, symbol_function(EQUALP), UNPROVIDED);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return broker;
    }

    public static SubLObject add_listener_to_broker(final SubLObject listener, final SubLObject broker) {
        final SubLObject lock = event_broker.event_broker_lock(broker);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject event = event_broker.event_listener_event(listener);
            final SubLObject listeners = event_broker.event_broker_listeners(broker);
            dictionary_utilities.dictionary_pushnew(listeners, event, listener, symbol_function(EQUALP), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return broker;
    }

    public static final SubLObject remove_listener_from_broker_alt(SubLObject listener, SubLObject broker) {
        {
            SubLObject lock = com.cyc.cycjava.cycl.event_broker.event_broker_lock(broker);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject event = com.cyc.cycjava.cycl.event_broker.event_listener_event(listener);
                    SubLObject listeners = com.cyc.cycjava.cycl.event_broker.event_broker_listeners(broker);
                    dictionary_utilities.dictionary_remove_from_value(listeners, event, listener, symbol_function(EQUALP), UNPROVIDED);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return broker;
    }

    public static SubLObject remove_listener_from_broker(final SubLObject listener, final SubLObject broker) {
        final SubLObject lock = event_broker.event_broker_lock(broker);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject event = event_broker.event_listener_event(listener);
            final SubLObject listeners = event_broker.event_broker_listeners(broker);
            dictionary_utilities.dictionary_remove_from_value(listeners, event, listener, symbol_function(EQUALP), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return broker;
    }

    public static final SubLObject do_listeners_of_event_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt84);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject listener = NIL;
                    SubLObject event = NIL;
                    SubLObject broker = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt84);
                    listener = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt84);
                    event = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt84);
                    broker = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject listeners = $sym85$LISTENERS;
                            SubLObject event_listeners = $sym86$EVENT_LISTENERS;
                            return list(CLET, list(listeners, event_listeners), list(WITH_EVENT_BROKER_LOCK_HELD, list(broker), listS(CSETQ, listeners, $list_alt90), list(CSETQ, event_listeners, list(DICTIONARY_LOOKUP, listeners, event))), listS(CDOLIST, list(listener, event_listeners), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt84);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_listeners_of_event(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, event_broker.$list99);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject listener = NIL;
        SubLObject event = NIL;
        SubLObject broker = NIL;
        destructuring_bind_must_consp(current, datum, event_broker.$list99);
        listener = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, event_broker.$list99);
        event = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, event_broker.$list99);
        broker = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject listeners = event_broker.$sym100$LISTENERS;
            final SubLObject event_listeners = event_broker.$sym101$EVENT_LISTENERS;
            return list(CLET, list(listeners, event_listeners), list(event_broker.WITH_EVENT_BROKER_LOCK_HELD, list(broker), listS(CSETQ, listeners, event_broker.$list105), list(CSETQ, event_listeners, list(DICTIONARY_LOOKUP, listeners, event))), listS(CDOLIST, list(listener, event_listeners), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, event_broker.$list99);
        return NIL;
    }

    public static final SubLObject protocol_description_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject protocol_description_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject protocol_description_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.event_broker.$protocol_description_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject protocol_description_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.event_broker.$protocol_description_native.class ? T : NIL;
    }

    public static final SubLObject protocol_description_protocol_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PROTOCOL_DESCRIPTION_P);
        return v_object.getField2();
    }

    public static SubLObject protocol_description_protocol(final SubLObject v_object) {
        assert NIL != event_broker.protocol_description_p(v_object) : "! event_broker.protocol_description_p(v_object) " + "event_broker.protocol_description_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject protocol_description_event_serialize_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PROTOCOL_DESCRIPTION_P);
        return v_object.getField3();
    }

    public static SubLObject protocol_description_event_serialize(final SubLObject v_object) {
        assert NIL != event_broker.protocol_description_p(v_object) : "! event_broker.protocol_description_p(v_object) " + "event_broker.protocol_description_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject protocol_description_my_params_serialize_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PROTOCOL_DESCRIPTION_P);
        return v_object.getField4();
    }

    public static SubLObject protocol_description_my_params_serialize(final SubLObject v_object) {
        assert NIL != event_broker.protocol_description_p(v_object) : "! event_broker.protocol_description_p(v_object) " + "event_broker.protocol_description_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_protocol_description_protocol_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PROTOCOL_DESCRIPTION_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_protocol_description_protocol(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_broker.protocol_description_p(v_object) : "! event_broker.protocol_description_p(v_object) " + "event_broker.protocol_description_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_protocol_description_event_serialize_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PROTOCOL_DESCRIPTION_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_protocol_description_event_serialize(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_broker.protocol_description_p(v_object) : "! event_broker.protocol_description_p(v_object) " + "event_broker.protocol_description_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_protocol_description_my_params_serialize_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PROTOCOL_DESCRIPTION_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_protocol_description_my_params_serialize(final SubLObject v_object, final SubLObject value) {
        assert NIL != event_broker.protocol_description_p(v_object) : "! event_broker.protocol_description_p(v_object) " + "event_broker.protocol_description_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_protocol_description_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.event_broker.$protocol_description_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($PROTOCOL)) {
                        com.cyc.cycjava.cycl.event_broker._csetf_protocol_description_protocol(v_new, current_value);
                    } else {
                        if (pcase_var.eql($EVENT_SERIALIZE)) {
                            com.cyc.cycjava.cycl.event_broker._csetf_protocol_description_event_serialize(v_new, current_value);
                        } else {
                            if (pcase_var.eql($MY_PARAMS_SERIALIZE)) {
                                com.cyc.cycjava.cycl.event_broker._csetf_protocol_description_my_params_serialize(v_new, current_value);
                            } else {
                                Errors.error($str_alt11$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_protocol_description(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.event_broker.$protocol_description_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PROTOCOL)) {
                event_broker._csetf_protocol_description_protocol(v_new, current_value);
            } else
                if (pcase_var.eql($EVENT_SERIALIZE)) {
                    event_broker._csetf_protocol_description_event_serialize(v_new, current_value);
                } else
                    if (pcase_var.eql(event_broker.$MY_PARAMS_SERIALIZE)) {
                        event_broker._csetf_protocol_description_my_params_serialize(v_new, current_value);
                    } else {
                        Errors.error(event_broker.$str12$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_protocol_description(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, event_broker.MAKE_PROTOCOL_DESCRIPTION, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PROTOCOL, event_broker.protocol_description_protocol(obj));
        funcall(visitor_fn, obj, $SLOT, $EVENT_SERIALIZE, event_broker.protocol_description_event_serialize(obj));
        funcall(visitor_fn, obj, $SLOT, event_broker.$MY_PARAMS_SERIALIZE, event_broker.protocol_description_my_params_serialize(obj));
        funcall(visitor_fn, obj, $END, event_broker.MAKE_PROTOCOL_DESCRIPTION, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_protocol_description_method(final SubLObject obj, final SubLObject visitor_fn) {
        return event_broker.visit_defstruct_protocol_description(obj, visitor_fn);
    }

    public static final SubLObject new_protocol_description_alt(SubLObject protocol, SubLObject event_serialize, SubLObject my_params_serialize) {
        if (my_params_serialize == UNPROVIDED) {
            my_params_serialize = NIL;
        }
        {
            SubLObject description = com.cyc.cycjava.cycl.event_broker.make_protocol_description(UNPROVIDED);
            com.cyc.cycjava.cycl.event_broker._csetf_protocol_description_protocol(description, protocol);
            com.cyc.cycjava.cycl.event_broker._csetf_protocol_description_event_serialize(description, event_serialize);
            com.cyc.cycjava.cycl.event_broker._csetf_protocol_description_my_params_serialize(description, my_params_serialize);
            return description;
        }
    }

    public static SubLObject new_protocol_description(final SubLObject protocol, final SubLObject event_serialize, SubLObject my_params_serialize) {
        if (my_params_serialize == UNPROVIDED) {
            my_params_serialize = NIL;
        }
        final SubLObject description = event_broker.make_protocol_description(UNPROVIDED);
        event_broker._csetf_protocol_description_protocol(description, protocol);
        event_broker._csetf_protocol_description_event_serialize(description, event_serialize);
        event_broker._csetf_protocol_description_my_params_serialize(description, my_params_serialize);
        return description;
    }

    public static final SubLObject display_protocol_description_alt(SubLObject description, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str_alt108$Protocol__S____for_Event___S____f, new SubLObject[]{ com.cyc.cycjava.cycl.event_broker.protocol_description_protocol(description), com.cyc.cycjava.cycl.event_broker.protocol_description_event_serialize(description), com.cyc.cycjava.cycl.event_broker.protocol_description_my_params_serialize(description) });
        return T;
    }

    public static SubLObject display_protocol_description(final SubLObject description, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, event_broker.$str126$Protocol__S____for_Event___S____f, new SubLObject[]{ event_broker.protocol_description_protocol(description), event_broker.protocol_description_event_serialize(description), event_broker.protocol_description_my_params_serialize(description) });
        return T;
    }

    public static final SubLObject add_protocol_to_broker_alt(SubLObject broker, SubLObject protocol, SubLObject event_serializer, SubLObject params_serializer) {
        if (params_serializer == UNPROVIDED) {
            params_serializer = NIL;
        }
        {
            SubLObject description = com.cyc.cycjava.cycl.event_broker.new_protocol_description(protocol, event_serializer, params_serializer);
            SubLObject lock = com.cyc.cycjava.cycl.event_broker.event_broker_lock(broker);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject protocols = com.cyc.cycjava.cycl.event_broker.event_broker_protocols(broker);
                    dictionary.dictionary_enter(protocols, protocol, description);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return broker;
    }

    public static SubLObject add_protocol_to_broker(final SubLObject broker, final SubLObject protocol, final SubLObject event_serializer, SubLObject params_serializer) {
        if (params_serializer == UNPROVIDED) {
            params_serializer = NIL;
        }
        final SubLObject description = event_broker.new_protocol_description(protocol, event_serializer, params_serializer);
        final SubLObject lock = event_broker.event_broker_lock(broker);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject protocols = event_broker.event_broker_protocols(broker);
            dictionary.dictionary_enter(protocols, protocol, description);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return broker;
    }

    public static final SubLObject find_protocol_of_broker_alt(SubLObject broker, SubLObject protocol) {
        {
            SubLObject result = NIL;
            SubLObject lock = com.cyc.cycjava.cycl.event_broker.event_broker_lock(broker);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject protocols = com.cyc.cycjava.cycl.event_broker.event_broker_protocols(broker);
                    result = dictionary.dictionary_lookup(protocols, protocol, UNPROVIDED);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return result;
        }
    }

    public static SubLObject find_protocol_of_broker(final SubLObject broker, final SubLObject protocol) {
        SubLObject result = NIL;
        final SubLObject lock = event_broker.event_broker_lock(broker);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject protocols = event_broker.event_broker_protocols(broker);
            result = dictionary.dictionary_lookup(protocols, protocol, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    /**
     * The default serialization function makes pretty strong assumptions
     * about the protocol transfer that it can perform.
     */
    @LispMethod(comment = "The default serialization function makes pretty strong assumptions\r\nabout the protocol transfer that it can perform.\nThe default serialization function makes pretty strong assumptions\nabout the protocol transfer that it can perform.")
    public static final SubLObject default_event_serialize_alt(SubLObject event, SubLObject stream) {
        format(stream, $str_alt109$_event_code__S_, symbol_name(event_model.event_class(event)));
        {
            SubLObject timestring = numeric_date_utilities.timestring(event_model.event_timestamp(event));
            format(stream, $str_alt110$timestamp__S_, timestring);
        }
        if (NIL != event_model.event_source(event)) {
            format(stream, $str_alt111$source__S_, string_utilities.to_string(event_model.event_source(event)));
        }
        format(stream, $str_alt112$message__S__, string_utilities.to_string(event_model.event_message(event)));
        string_utilities.network_terpri(stream);
        return event;
    }

    /**
     * The default serialization function makes pretty strong assumptions
     * about the protocol transfer that it can perform.
     */
    @LispMethod(comment = "The default serialization function makes pretty strong assumptions\r\nabout the protocol transfer that it can perform.\nThe default serialization function makes pretty strong assumptions\nabout the protocol transfer that it can perform.")
    public static SubLObject default_event_serialize(final SubLObject event, final SubLObject stream) {
        format(stream, event_broker.$str127$_event_code__S_, symbol_name(event_model.event_class(event)));
        final SubLObject timestring = numeric_date_utilities.timestring(event_model.event_timestamp(event));
        format(stream, event_broker.$str128$timestamp__S_, timestring);
        if (NIL != event_model.event_source(event)) {
            format(stream, event_broker.$str129$source__S_, string_utilities.to_string(event_model.event_source(event)));
        }
        format(stream, event_broker.$str130$message__S__, string_utilities.to_string(event_model.event_message(event)));
        string_utilities.network_terpri(stream);
        return event;
    }

    /**
     * The default serialization function makes strong assumptions that
     * the my-params can be easily printed into a string.
     */
    @LispMethod(comment = "The default serialization function makes strong assumptions that\r\nthe my-params can be easily printed into a string.\nThe default serialization function makes strong assumptions that\nthe my-params can be easily printed into a string.")
    public static final SubLObject default_my_params_serialize_alt(SubLObject my_params, SubLObject stream) {
        format(stream, $str_alt113$_parameter_key__mine__value__S__, string_utilities.to_string(my_params));
        string_utilities.network_terpri(stream);
        return my_params;
    }

    /**
     * The default serialization function makes strong assumptions that
     * the my-params can be easily printed into a string.
     */
    @LispMethod(comment = "The default serialization function makes strong assumptions that\r\nthe my-params can be easily printed into a string.\nThe default serialization function makes strong assumptions that\nthe my-params can be easily printed into a string.")
    public static SubLObject default_my_params_serialize(final SubLObject my_params, final SubLObject stream) {
        format(stream, event_broker.$str131$_parameter_key__mine__value__S__, string_utilities.to_string(my_params));
        string_utilities.network_terpri(stream);
        return my_params;
    }

    public static final SubLObject new_event_broker_alt(SubLObject hierarchy) {
        if (hierarchy == UNPROVIDED) {
            hierarchy = NIL;
        }
        if (NIL == hierarchy) {
            hierarchy = event_model.core_event_hierarchy();
        }
        {
            SubLObject v_event_broker = com.cyc.cycjava.cycl.event_broker.make_event_broker(UNPROVIDED);
            com.cyc.cycjava.cycl.event_broker._csetf_event_broker_hierarchy(v_event_broker, hierarchy);
            com.cyc.cycjava.cycl.event_broker._csetf_event_broker_listeners(v_event_broker, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            com.cyc.cycjava.cycl.event_broker._csetf_event_broker_lock(v_event_broker, make_lock($$$Event_Broker_Lock));
            com.cyc.cycjava.cycl.event_broker._csetf_event_broker_postings(v_event_broker, process_utilities.new_ipc_queue($$$Event_Broker_Queue));
            com.cyc.cycjava.cycl.event_broker._csetf_event_broker_protocols(v_event_broker, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            com.cyc.cycjava.cycl.event_broker.add_protocol_to_broker(v_event_broker, $DEFAULT, DEFAULT_EVENT_SERIALIZE, DEFAULT_MY_PARAMS_SERIALIZE);
            return v_event_broker;
        }
    }

    public static SubLObject new_event_broker(SubLObject hierarchy) {
        if (hierarchy == UNPROVIDED) {
            hierarchy = NIL;
        }
        if (NIL == hierarchy) {
            hierarchy = event_model.core_event_hierarchy();
        }
        final SubLObject v_event_broker = event_broker.make_event_broker(UNPROVIDED);
        event_broker._csetf_event_broker_hierarchy(v_event_broker, hierarchy);
        event_broker._csetf_event_broker_listeners(v_event_broker, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        event_broker._csetf_event_broker_lock(v_event_broker, make_lock(event_broker.$$$Event_Broker_Lock));
        event_broker._csetf_event_broker_postings(v_event_broker, process_utilities.new_ipc_queue(event_broker.$$$Event_Broker_Queue));
        event_broker._csetf_event_broker_protocols(v_event_broker, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        event_broker.add_protocol_to_broker(v_event_broker, $DEFAULT, event_broker.DEFAULT_EVENT_SERIALIZE, event_broker.DEFAULT_MY_PARAMS_SERIALIZE);
        return v_event_broker;
    }

    public static final SubLObject ensure_event_broker_alt() {
        if (NIL == com.cyc.cycjava.cycl.event_broker.event_broker_p($event_broker$.getGlobalValue())) {
            $event_broker$.setGlobalValue(com.cyc.cycjava.cycl.event_broker.new_event_broker(UNPROVIDED));
        }
        return $event_broker$.getGlobalValue();
    }

    public static SubLObject ensure_event_broker() {
        if (NIL == event_broker.event_broker_p(event_broker.$event_broker$.getGlobalValue())) {
            event_broker.$event_broker$.setGlobalValue(event_broker.new_event_broker(UNPROVIDED));
        }
        return event_broker.$event_broker$.getGlobalValue();
    }

    public static final SubLObject initialize_event_broker_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_event_broker = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt119);
            v_event_broker = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PWHEN, list(NULL, v_event_broker), listS(CSETQ, v_event_broker, $list_alt122));
            } else {
                cdestructuring_bind_error(datum, $list_alt119);
            }
        }
        return NIL;
    }

    public static SubLObject initialize_event_broker(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_event_broker = NIL;
        destructuring_bind_must_consp(current, datum, event_broker.$list137);
        v_event_broker = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PWHEN, list(NULL, v_event_broker), listS(CSETQ, v_event_broker, event_broker.$list140));
        }
        cdestructuring_bind_error(datum, event_broker.$list137);
        return NIL;
    }

    public static final SubLObject core_event_broker_alt() {
        return $event_broker$.getGlobalValue();
    }

    public static SubLObject core_event_broker() {
        return event_broker.$event_broker$.getGlobalValue();
    }

    public static final SubLObject has_event_class_any_listenersP_alt(SubLObject event_class, SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        if (NIL == broker) {
            broker = com.cyc.cycjava.cycl.event_broker.ensure_event_broker();
        }
        SubLTrampolineFile.checkType(broker, EVENT_BROKER_P);
        {
            SubLObject listeners = NIL;
            SubLObject event_listeners = NIL;
            SubLObject lock = com.cyc.cycjava.cycl.event_broker.event_broker_lock(broker);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                listeners = com.cyc.cycjava.cycl.event_broker.event_broker_listeners(broker);
                event_listeners = dictionary.dictionary_lookup_without_values(listeners, event_class, UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return list_utilities.sublisp_boolean(event_listeners);
        }
    }

    public static SubLObject has_event_class_any_listenersP(final SubLObject event_class, SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        if (NIL == broker) {
            broker = event_broker.ensure_event_broker();
        }
        assert NIL != event_broker.event_broker_p(broker) : "! event_broker.event_broker_p(broker) " + ("event_broker.event_broker_p(broker) " + "CommonSymbols.NIL != event_broker.event_broker_p(broker) ") + broker;
        SubLObject listeners = NIL;
        SubLObject event_listeners = NIL;
        final SubLObject lock = event_broker.event_broker_lock(broker);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            listeners = event_broker.event_broker_listeners(broker);
            event_listeners = dictionary.dictionary_lookup_without_values(listeners, event_class, UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return list_utilities.sublisp_boolean(event_listeners);
    }

    public static final SubLObject clear_fast_has_event_class_any_transitive_listenersP_alt() {
        {
            SubLObject cs = $fast_has_event_class_any_transitive_listenersP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_fast_has_event_class_any_transitive_listenersP() {
        final SubLObject cs = event_broker.$fast_has_event_class_any_transitive_listenersP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_fast_has_event_class_any_transitive_listenersP_alt(SubLObject event_class, SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($fast_has_event_class_any_transitive_listenersP_caching_state$.getGlobalValue(), list(event_class, broker), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_fast_has_event_class_any_transitive_listenersP(final SubLObject event_class, SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args(event_broker.$fast_has_event_class_any_transitive_listenersP_caching_state$.getGlobalValue(), list(event_class, broker), UNPROVIDED, UNPROVIDED);
    }

    /**
     * A cached version that is cleared up when listeners are registered or unregistered.
     */
    @LispMethod(comment = "A cached version that is cleared up when listeners are registered or unregistered.")
    public static final SubLObject fast_has_event_class_any_transitive_listenersP_internal_alt(SubLObject event_class, SubLObject broker) {
        return com.cyc.cycjava.cycl.event_broker.has_event_class_any_transitive_listenersP(event_class, broker);
    }

    /**
     * A cached version that is cleared up when listeners are registered or unregistered.
     */
    @LispMethod(comment = "A cached version that is cleared up when listeners are registered or unregistered.")
    public static SubLObject fast_has_event_class_any_transitive_listenersP_internal(final SubLObject event_class, final SubLObject broker) {
        return event_broker.has_event_class_any_transitive_listenersP(event_class, broker);
    }

    public static final SubLObject fast_has_event_class_any_transitive_listenersP_alt(SubLObject event_class, SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        {
            SubLObject caching_state = $fast_has_event_class_any_transitive_listenersP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym123$FAST_HAS_EVENT_CLASS_ANY_TRANSITIVE_LISTENERS_, $sym124$_FAST_HAS_EVENT_CLASS_ANY_TRANSITIVE_LISTENERS__CACHING_STATE_, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(event_class, broker);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw125$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (event_class.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && broker.eql(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.event_broker.fast_has_event_class_any_transitive_listenersP_internal(event_class, broker)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(event_class, broker));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject fast_has_event_class_any_transitive_listenersP(final SubLObject event_class, SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        SubLObject caching_state = event_broker.$fast_has_event_class_any_transitive_listenersP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(event_broker.$sym141$FAST_HAS_EVENT_CLASS_ANY_TRANSITIVE_LISTENERS_, event_broker.$sym142$_FAST_HAS_EVENT_CLASS_ANY_TRANSITIVE_LISTENERS__CACHING_STATE_, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
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
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(event_broker.fast_has_event_class_any_transitive_listenersP_internal(event_class, broker)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(event_class, broker));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject has_event_class_any_transitive_listenersP_alt(SubLObject event_class, SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        if (NIL == broker) {
            broker = com.cyc.cycjava.cycl.event_broker.ensure_event_broker();
        }
        SubLTrampolineFile.checkType(broker, EVENT_BROKER_P);
        {
            SubLObject hierarchy = com.cyc.cycjava.cycl.event_broker.event_broker_hierarchy(broker);
            SubLObject event = event_model.find_event_class(event_class, hierarchy);
            SubLObject listeners = NIL;
            SubLObject doneP = NIL;
            SubLObject lock = com.cyc.cycjava.cycl.event_broker.event_broker_lock(broker);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                listeners = com.cyc.cycjava.cycl.event_broker.event_broker_listeners(broker);
                {
                    SubLObject current = event;
                    while (NIL != current) {
                        if (NIL == doneP) {
                            {
                                SubLObject event_key = event_model.event_class_self(current);
                                doneP = list_utilities.sublisp_boolean(dictionary.dictionary_lookup_without_values(listeners, event_key, UNPROVIDED));
                            }
                        }
                        if (event_model.event_class_self(current) == $EVENT_ROOT) {
                            current = NIL;
                        } else {
                            current = event_model.find_in_event_hierarchy(hierarchy, event_model.event_class_parent(current));
                        }
                    } 
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return doneP;
        }
    }

    public static SubLObject has_event_class_any_transitive_listenersP(final SubLObject event_class, SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        if (NIL == broker) {
            broker = event_broker.ensure_event_broker();
        }
        assert NIL != event_broker.event_broker_p(broker) : "! event_broker.event_broker_p(broker) " + ("event_broker.event_broker_p(broker) " + "CommonSymbols.NIL != event_broker.event_broker_p(broker) ") + broker;
        final SubLObject hierarchy = event_broker.event_broker_hierarchy(broker);
        final SubLObject event = event_model.find_event_class(event_class, hierarchy);
        SubLObject listeners = NIL;
        SubLObject doneP = NIL;
        final SubLObject lock = event_broker.event_broker_lock(broker);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            listeners = event_broker.event_broker_listeners(broker);
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

    public static final SubLObject display_event_broker_alt(SubLObject broker, SubLObject stream) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == broker) {
                broker = com.cyc.cycjava.cycl.event_broker.ensure_event_broker();
            }
            SubLTrampolineFile.checkType(broker, EVENT_BROKER_P);
            format(stream, $str_alt127$Event_Broker_settings__);
            {
                SubLObject hierarchy = com.cyc.cycjava.cycl.event_broker.event_broker_hierarchy(broker);
                SubLObject queue = queues.create_queue();
                SubLObject children = NIL;
                if (NIL == hierarchy) {
                    hierarchy = event_model.ensure_event_hierarchy();
                }
                SubLTrampolineFile.checkType(hierarchy, EVENT_HIERARCHY_P);
                queues.enqueue($EVENT_ROOT, queue);
                while (NIL == queues.queue_empty_p(queue)) {
                    {
                        SubLObject curr = queues.dequeue(queue);
                        SubLObject kids = event_model.children_of_event_class_in_hierarchy(curr, hierarchy);
                        children = kids;
                        format(stream, $str_alt129$__Listening_for__S____, curr);
                        {
                            SubLObject listeners = NIL;
                            SubLObject event_listeners = NIL;
                            SubLObject lock = com.cyc.cycjava.cycl.event_broker.event_broker_lock(broker);
                            SubLObject release = NIL;
                            try {
                                release = seize_lock(lock);
                                listeners = com.cyc.cycjava.cycl.event_broker.event_broker_listeners(broker);
                                event_listeners = dictionary.dictionary_lookup(listeners, curr, UNPROVIDED);
                            } finally {
                                if (NIL != release) {
                                    release_lock(lock);
                                }
                            }
                            {
                                SubLObject cdolist_list_var = event_listeners;
                                SubLObject listener = NIL;
                                for (listener = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , listener = cdolist_list_var.first()) {
                                    write_string($str_alt130$__, stream, UNPROVIDED, UNPROVIDED);
                                    com.cyc.cycjava.cycl.event_broker.display_event_listener(listener, stream);
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var = kids;
                            SubLObject kid = NIL;
                            for (kid = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , kid = cdolist_list_var.first()) {
                                queues.enqueue(event_model.event_class_self(kid), queue);
                            }
                        }
                    }
                } 
            }
            format(stream, $str_alt131$__Defined_protocols___);
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(com.cyc.cycjava.cycl.event_broker.event_broker_protocols(broker)));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject protocol = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject description = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        write_string($str_alt132$____, stream, UNPROVIDED, UNPROVIDED);
                        com.cyc.cycjava.cycl.event_broker.display_protocol_description(description, stream);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return T;
        }
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
            broker = event_broker.ensure_event_broker();
        }
        assert NIL != event_broker.event_broker_p(broker) : "! event_broker.event_broker_p(broker) " + ("event_broker.event_broker_p(broker) " + "CommonSymbols.NIL != event_broker.event_broker_p(broker) ") + broker;
        format(stream, event_broker.$str144$Event_Broker_settings__);
        SubLObject hierarchy = event_broker.event_broker_hierarchy(broker);
        final SubLObject queue = queues.create_queue(UNPROVIDED);
        SubLObject children = NIL;
        if (NIL == hierarchy) {
            hierarchy = event_model.ensure_event_hierarchy();
        }
        assert NIL != event_model.event_hierarchy_p(hierarchy) : "! event_model.event_hierarchy_p(hierarchy) " + ("event_model.event_hierarchy_p(hierarchy) " + "CommonSymbols.NIL != event_model.event_hierarchy_p(hierarchy) ") + hierarchy;
        queues.enqueue($EVENT_ROOT, queue);
        while (NIL == queues.queue_empty_p(queue)) {
            final SubLObject curr = queues.dequeue(queue);
            final SubLObject kids = children = event_model.children_of_event_class_in_hierarchy(curr, hierarchy);
            format(stream, event_broker.$str146$__Listening_for__S____, curr);
            SubLObject listeners = NIL;
            SubLObject event_listeners = NIL;
            final SubLObject lock = event_broker.event_broker_lock(broker);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                listeners = event_broker.event_broker_listeners(broker);
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
                write_string(event_broker.$$$__, stream, UNPROVIDED, UNPROVIDED);
                event_broker.display_event_listener(listener, stream);
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
        format(stream, event_broker.$str148$__Defined_protocols___);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(event_broker.event_broker_protocols(broker))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject protocol = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject description = thread.secondMultipleValue();
            thread.resetMultipleValues();
            write_string(event_broker.$$$____, stream, UNPROVIDED, UNPROVIDED);
            event_broker.display_protocol_description(description, stream);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return T;
    }

    public static final SubLObject remove_stale_core_event_customers_alt() {
        $event_broker$.setGlobalValue(com.cyc.cycjava.cycl.event_broker.remove_stale_event_customers(com.cyc.cycjava.cycl.event_broker.core_event_broker()));
        return com.cyc.cycjava.cycl.event_broker.core_event_broker();
    }

    public static SubLObject remove_stale_core_event_customers() {
        event_broker.$event_broker$.setGlobalValue(event_broker.remove_stale_event_customers(event_broker.core_event_broker()));
        return event_broker.core_event_broker();
    }

    /**
     * Called by system code initializations, it ensures that none of the listeners
     * that were registered before the world was written out are still sitting
     * about.
     */
    @LispMethod(comment = "Called by system code initializations, it ensures that none of the listeners\r\nthat were registered before the world was written out are still sitting\r\nabout.\nCalled by system code initializations, it ensures that none of the listeners\nthat were registered before the world was written out are still sitting\nabout.")
    public static final SubLObject remove_stale_event_customers_alt(SubLObject broker) {
        dictionary.clear_dictionary(com.cyc.cycjava.cycl.event_broker.event_broker_listeners(broker));
        com.cyc.cycjava.cycl.event_broker._csetf_event_broker_postings(broker, process_utilities.new_ipc_queue($$$Event_Broker_Queue));
        return broker;
    }

    /**
     * Called by system code initializations, it ensures that none of the listeners
     * that were registered before the world was written out are still sitting
     * about.
     */
    @LispMethod(comment = "Called by system code initializations, it ensures that none of the listeners\r\nthat were registered before the world was written out are still sitting\r\nabout.\nCalled by system code initializations, it ensures that none of the listeners\nthat were registered before the world was written out are still sitting\nabout.")
    public static SubLObject remove_stale_event_customers(final SubLObject broker) {
        dictionary.clear_dictionary(event_broker.event_broker_listeners(broker));
        event_broker._csetf_event_broker_postings(broker, process_utilities.new_ipc_queue(event_broker.$$$Event_Broker_Queue));
        return broker;
    }

    public static final SubLObject register_event_listener_alt(SubLObject event_listener, SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        SubLTrampolineFile.checkType(event_listener, EVENT_LISTENER_P);
        if (NIL == broker) {
            broker = com.cyc.cycjava.cycl.event_broker.ensure_event_broker();
        }
        SubLTrampolineFile.checkType(broker, EVENT_BROKER_P);
        if (NIL != com.cyc.cycjava.cycl.event_broker.add_listener_to_broker(event_listener, broker)) {
            com.cyc.cycjava.cycl.event_broker.signal_registered_event(broker, event_listener);
            com.cyc.cycjava.cycl.event_broker.clear_fast_has_event_class_any_transitive_listenersP();
            return T;
        }
        return NIL;
    }

    public static SubLObject register_event_listener(final SubLObject event_listener, SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        assert NIL != event_broker.event_listener_p(event_listener) : "! event_broker.event_listener_p(event_listener) " + ("event_broker.event_listener_p(event_listener) " + "CommonSymbols.NIL != event_broker.event_listener_p(event_listener) ") + event_listener;
        if (NIL == broker) {
            broker = event_broker.ensure_event_broker();
        }
        assert NIL != event_broker.event_broker_p(broker) : "! event_broker.event_broker_p(broker) " + ("event_broker.event_broker_p(broker) " + "CommonSymbols.NIL != event_broker.event_broker_p(broker) ") + broker;
        if (NIL != event_broker.add_listener_to_broker(event_listener, broker)) {
            event_broker.signal_registered_event(broker, event_listener);
            event_broker.clear_fast_has_event_class_any_transitive_listenersP();
            return T;
        }
        return NIL;
    }

    public static final SubLObject deregister_event_listener_alt(SubLObject event_listener, SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(event_listener, EVENT_LISTENER_P);
            if (NIL == broker) {
                broker = com.cyc.cycjava.cycl.event_broker.ensure_event_broker();
            }
            SubLTrampolineFile.checkType(broker, EVENT_BROKER_P);
            if (NIL != com.cyc.cycjava.cycl.event_broker.remove_listener_from_broker(event_listener, broker)) {
                if (NIL == $deregistration_during_system_initialization$.getDynamicValue(thread)) {
                    com.cyc.cycjava.cycl.event_broker.signal_deregistered_event(broker, event_listener);
                }
                com.cyc.cycjava.cycl.event_broker.clear_fast_has_event_class_any_transitive_listenersP();
                return T;
            }
            return NIL;
        }
    }

    public static SubLObject deregister_event_listener(final SubLObject event_listener, SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != event_broker.event_listener_p(event_listener) : "! event_broker.event_listener_p(event_listener) " + ("event_broker.event_listener_p(event_listener) " + "CommonSymbols.NIL != event_broker.event_listener_p(event_listener) ") + event_listener;
        if (NIL == broker) {
            broker = event_broker.ensure_event_broker();
        }
        assert NIL != event_broker.event_broker_p(broker) : "! event_broker.event_broker_p(broker) " + ("event_broker.event_broker_p(broker) " + "CommonSymbols.NIL != event_broker.event_broker_p(broker) ") + broker;
        if (NIL != event_broker.remove_listener_from_broker(event_listener, broker)) {
            if (NIL == event_broker.$deregistration_during_system_initialization$.getDynamicValue(thread)) {
                event_broker.signal_deregistered_event(broker, event_listener);
            }
            event_broker.clear_fast_has_event_class_any_transitive_listenersP();
            return T;
        }
        return NIL;
    }

    public static final SubLObject register_event_socket_protocol_alt(SubLObject protocol, SubLObject event_serialize, SubLObject params_serialize, SubLObject broker) {
        if (params_serialize == UNPROVIDED) {
            params_serialize = NIL;
        }
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        SubLTrampolineFile.checkType(protocol, KEYWORDP);
        if (NIL == broker) {
            broker = com.cyc.cycjava.cycl.event_broker.ensure_event_broker();
        }
        SubLTrampolineFile.checkType(broker, EVENT_BROKER_P);
        return com.cyc.cycjava.cycl.event_broker.add_protocol_to_broker(broker, protocol, event_serialize, params_serialize);
    }

    public static SubLObject register_event_socket_protocol(final SubLObject protocol, final SubLObject event_serialize, SubLObject params_serialize, SubLObject broker) {
        if (params_serialize == UNPROVIDED) {
            params_serialize = NIL;
        }
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        assert NIL != keywordp(protocol) : "! keywordp(protocol) " + ("Types.keywordp(protocol) " + "CommonSymbols.NIL != Types.keywordp(protocol) ") + protocol;
        if (NIL == broker) {
            broker = event_broker.ensure_event_broker();
        }
        assert NIL != event_broker.event_broker_p(broker) : "! event_broker.event_broker_p(broker) " + ("event_broker.event_broker_p(broker) " + "CommonSymbols.NIL != event_broker.event_broker_p(broker) ") + broker;
        return event_broker.add_protocol_to_broker(broker, protocol, event_serialize, params_serialize);
    }

    public static final SubLObject post_event_alt(SubLObject event, SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        if (NIL == broker) {
            broker = com.cyc.cycjava.cycl.event_broker.ensure_event_broker();
        }
        SubLTrampolineFile.checkType(broker, EVENT_BROKER_P);
        process_utilities.ipc_enqueue(event, com.cyc.cycjava.cycl.event_broker.event_broker_postings(broker));
        return event;
    }

    public static SubLObject post_event(final SubLObject event, SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        if (NIL == broker) {
            broker = event_broker.ensure_event_broker();
        }
        assert NIL != event_broker.event_broker_p(broker) : "! event_broker.event_broker_p(broker) " + ("event_broker.event_broker_p(broker) " + "CommonSymbols.NIL != event_broker.event_broker_p(broker) ") + broker;
        process_utilities.ipc_enqueue(event, event_broker.event_broker_postings(broker), UNPROVIDED);
        return event;
    }

    public static final SubLObject receive_event_alt(SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        if (NIL == broker) {
            broker = com.cyc.cycjava.cycl.event_broker.ensure_event_broker();
        }
        SubLTrampolineFile.checkType(broker, EVENT_BROKER_P);
        {
            SubLObject event = NIL;
            event = process_utilities.ipc_dequeue(com.cyc.cycjava.cycl.event_broker.event_broker_postings(broker));
            com.cyc.cycjava.cycl.event_broker.dispatch_event_to_listeners(broker, event);
            return event;
        }
    }

    public static SubLObject receive_event(SubLObject broker) {
        if (broker == UNPROVIDED) {
            broker = NIL;
        }
        if (NIL == broker) {
            broker = event_broker.ensure_event_broker();
        }
        assert NIL != event_broker.event_broker_p(broker) : "! event_broker.event_broker_p(broker) " + ("event_broker.event_broker_p(broker) " + "CommonSymbols.NIL != event_broker.event_broker_p(broker) ") + broker;
        SubLObject event = NIL;
        event = process_utilities.ipc_dequeue(event_broker.event_broker_postings(broker), UNPROVIDED);
        event_broker.dispatch_event_to_listeners(broker, event);
        return event;
    }

    /**
     * This function is called when the event handler is first registered
     * to allow pre-first message initialization.
     */
    @LispMethod(comment = "This function is called when the event handler is first registered\r\nto allow pre-first message initialization.\nThis function is called when the event handler is first registered\nto allow pre-first message initialization.")
    public static final SubLObject signal_registered_event_alt(SubLObject broker, SubLObject event_listener) {
        {
            SubLObject event = event_model.new_event($EVENT_HANDLER_REGISTERED, $$$success, $BROKER);
            com.cyc.cycjava.cycl.event_broker.invoke_event_on_listener(broker, event, event_listener);
        }
        return broker;
    }

    /**
     * This function is called when the event handler is first registered
     * to allow pre-first message initialization.
     */
    @LispMethod(comment = "This function is called when the event handler is first registered\r\nto allow pre-first message initialization.\nThis function is called when the event handler is first registered\nto allow pre-first message initialization.")
    public static SubLObject signal_registered_event(final SubLObject broker, final SubLObject event_listener) {
        final SubLObject event = event_model.new_event(event_broker.$EVENT_HANDLER_REGISTERED, event_broker.$$$success, $BROKER);
        event_broker.invoke_event_on_listener(broker, event, event_listener);
        return broker;
    }

    /**
     * This function is called when the event handler is being deregistered
     * to allow finalization.
     */
    @LispMethod(comment = "This function is called when the event handler is being deregistered\r\nto allow finalization.\nThis function is called when the event handler is being deregistered\nto allow finalization.")
    public static final SubLObject signal_deregistered_event_alt(SubLObject broker, SubLObject event_listener) {
        {
            SubLObject event = event_model.new_event($EVENT_HANDLER_DEREGISTERED, $$$success, $BROKER);
            com.cyc.cycjava.cycl.event_broker.invoke_event_on_listener(broker, event, event_listener);
        }
        return broker;
    }

    /**
     * This function is called when the event handler is being deregistered
     * to allow finalization.
     */
    @LispMethod(comment = "This function is called when the event handler is being deregistered\r\nto allow finalization.\nThis function is called when the event handler is being deregistered\nto allow finalization.")
    public static SubLObject signal_deregistered_event(final SubLObject broker, final SubLObject event_listener) {
        final SubLObject event = event_model.new_event(event_broker.$EVENT_HANDLER_DEREGISTERED, event_broker.$$$success, $BROKER);
        event_broker.invoke_event_on_listener(broker, event, event_listener);
        return broker;
    }

    public static final SubLObject dispatch_event_to_listeners_alt(SubLObject broker, SubLObject event) {
        {
            SubLObject event_class_key = event_model.event_class(event);
            SubLObject hierarchy = com.cyc.cycjava.cycl.event_broker.event_broker_hierarchy(broker);
            SubLObject event_class = event_model.find_event_class(event_class_key, hierarchy);
            SubLObject current = event_class;
            while (NIL != current) {
                {
                    SubLObject event_key = event_model.event_class_self(current);
                    SubLObject listeners = NIL;
                    SubLObject event_listeners = NIL;
                    SubLObject lock = com.cyc.cycjava.cycl.event_broker.event_broker_lock(broker);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        listeners = com.cyc.cycjava.cycl.event_broker.event_broker_listeners(broker);
                        event_listeners = dictionary.dictionary_lookup(listeners, event_key, UNPROVIDED);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = event_listeners;
                        SubLObject listener = NIL;
                        for (listener = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , listener = cdolist_list_var.first()) {
                            com.cyc.cycjava.cycl.event_broker.invoke_event_on_listener(broker, event, listener);
                        }
                    }
                }
                if (event_model.event_class_self(current) == $EVENT_ROOT) {
                    current = NIL;
                } else {
                    current = event_model.find_in_event_hierarchy(hierarchy, event_model.event_class_parent(current));
                }
            } 
        }
        return broker;
    }

    public static SubLObject dispatch_event_to_listeners(final SubLObject broker, final SubLObject event) {
        final SubLObject event_class_key = event_model.event_class(event);
        final SubLObject hierarchy = event_broker.event_broker_hierarchy(broker);
        SubLObject current;
        final SubLObject event_class = current = event_model.find_event_class(event_class_key, hierarchy);
        while (NIL != current) {
            final SubLObject event_key = event_model.event_class_self(current);
            SubLObject listeners = NIL;
            SubLObject event_listeners = NIL;
            final SubLObject lock = event_broker.event_broker_lock(broker);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                listeners = event_broker.event_broker_listeners(broker);
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
                event_broker.invoke_event_on_listener(broker, event, listener);
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

    public static final SubLObject invoke_funcall_event_on_listener_alt(SubLObject event, SubLObject listener) {
        {
            SubLObject info = com.cyc.cycjava.cycl.event_broker.event_listener_invocation_info(listener);
            SubLObject params = com.cyc.cycjava.cycl.event_broker.event_listener_my_params(listener);
            SubLObject result = NIL;
            SubLObject message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            result = funcall(com.cyc.cycjava.cycl.event_broker.funcall_info_function(info), event, params);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (message.isString()) {
                com.cyc.cycjava.cycl.event_broker.invoke_funcall_event_error_handler(event, message);
                result = message;
            }
            return result;
        }
    }

    public static SubLObject invoke_funcall_event_on_listener(final SubLObject event, final SubLObject listener) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject info = event_broker.event_listener_invocation_info(listener);
        final SubLObject params = event_broker.event_listener_my_params(listener);
        SubLObject result = NIL;
        SubLObject message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = funcall(event_broker.funcall_info_function(info), event, params);
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
            event_broker.invoke_funcall_event_error_handler(event, message);
            result = message;
        }
        return result;
    }

    /**
     * Looks up the funcall event error handler from the event broker and calls it with
     * EVENT and ERROR-MESSAGE.
     */
    @LispMethod(comment = "Looks up the funcall event error handler from the event broker and calls it with\r\nEVENT and ERROR-MESSAGE.\nLooks up the funcall event error handler from the event broker and calls it with\nEVENT and ERROR-MESSAGE.")
    public static final SubLObject invoke_funcall_event_error_handler_alt(SubLObject event, SubLObject error_message) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        SubLTrampolineFile.checkType(error_message, STRINGP);
        funcall(DEFAULT_FUNCALL_EVENT_ERROR_HANDLER, event, error_message);
        return NIL;
    }

    /**
     * Looks up the funcall event error handler from the event broker and calls it with
     * EVENT and ERROR-MESSAGE.
     */
    @LispMethod(comment = "Looks up the funcall event error handler from the event broker and calls it with\r\nEVENT and ERROR-MESSAGE.\nLooks up the funcall event error handler from the event broker and calls it with\nEVENT and ERROR-MESSAGE.")
    public static SubLObject invoke_funcall_event_error_handler(final SubLObject event, final SubLObject error_message) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        assert NIL != stringp(error_message) : "! stringp(error_message) " + ("Types.stringp(error_message) " + "CommonSymbols.NIL != Types.stringp(error_message) ") + error_message;
        funcall(event_broker.DEFAULT_FUNCALL_EVENT_ERROR_HANDLER, event, error_message);
        return NIL;
    }

    /**
     * Displays the EVENT and ERROR-MESSAGE on the console.
     */
    @LispMethod(comment = "Displays the EVENT and ERROR-MESSAGE on the console.")
    public static final SubLObject default_funcall_event_error_handler_alt(SubLObject event, SubLObject error_message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(event, EVENT_P);
            SubLTrampolineFile.checkType(error_message, STRINGP);
            if (NIL != $should_show_event_errorsP$.getGlobalValue()) {
                format(StreamsLow.$error_output$.getDynamicValue(thread), $str_alt147$Error_during_processing_of_event_, event, error_message);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return NIL;
        }
    }

    /**
     * Displays the EVENT and ERROR-MESSAGE on the console.
     */
    @LispMethod(comment = "Displays the EVENT and ERROR-MESSAGE on the console.")
    public static SubLObject default_funcall_event_error_handler(final SubLObject event, final SubLObject error_message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        assert NIL != stringp(error_message) : "! stringp(error_message) " + ("Types.stringp(error_message) " + "CommonSymbols.NIL != Types.stringp(error_message) ") + error_message;
        if (NIL != event_broker.$should_show_event_errorsP$.getGlobalValue()) {
            format(StreamsLow.$error_output$.getDynamicValue(thread), event_broker.$str164$Error_during_processing_of_event_, event, error_message);
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static final SubLObject invoke_socket_event_on_listener_alt(SubLObject event, SubLObject listener, SubLObject description) {
        {
            SubLObject result = NIL;
            SubLObject info = com.cyc.cycjava.cycl.event_broker.event_listener_invocation_info(listener);
            SubLObject params = com.cyc.cycjava.cycl.event_broker.event_listener_my_params(listener);
            SubLObject host = com.cyc.cycjava.cycl.event_broker.socket_info_host(info);
            SubLObject port = com.cyc.cycjava.cycl.event_broker.socket_info_port(info);
            SubLObject event_serializer = com.cyc.cycjava.cycl.event_broker.protocol_description_event_serialize(description);
            SubLObject my_params_serializer = com.cyc.cycjava.cycl.event_broker.protocol_description_my_params_serialize(description);
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            {
                                SubLObject stream = NIL;
                                try {
                                    stream = subl_promotions.open_tcp_stream_with_timeout(host, port, NIL, $PUBLIC);
                                    if (NIL != stream) {
                                        funcall(event_serializer, event, stream);
                                        if (NIL != my_params_serializer) {
                                            funcall(my_params_serializer, params, stream);
                                        }
                                        force_output(stream);
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_1 = currentBinding($is_thread_performing_cleanupP$);
                                        try {
                                            bind($is_thread_performing_cleanupP$, T);
                                            if (NIL != stream) {
                                                close(stream, UNPROVIDED);
                                            }
                                        } finally {
                                            rebind($is_thread_performing_cleanupP$, _prev_bind_0_1);
                                        }
                                    }
                                }
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                result = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            return result;
        }
    }

    public static SubLObject invoke_socket_event_on_listener(final SubLObject event, final SubLObject listener, final SubLObject description) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject info = event_broker.event_listener_invocation_info(listener);
        final SubLObject params = event_broker.event_listener_my_params(listener);
        final SubLObject host = event_broker.socket_info_host(info);
        final SubLObject port = event_broker.socket_info_port(info);
        final SubLObject event_serializer = event_broker.protocol_description_event_serialize(description);
        final SubLObject my_params_serializer = event_broker.protocol_description_my_params_serialize(description);
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

    public static final SubLObject invoke_event_on_listener_alt(SubLObject broker, SubLObject event, SubLObject listener) {
        {
            SubLObject mode = com.cyc.cycjava.cycl.event_broker.event_listener_invocation_mode(listener);
            SubLObject pcase_var = mode;
            if (pcase_var.eql($FUNCALL)) {
                return com.cyc.cycjava.cycl.event_broker.invoke_funcall_event_on_listener(event, listener);
            } else {
                if (pcase_var.eql($SOCKET)) {
                    {
                        SubLObject socket_info = com.cyc.cycjava.cycl.event_broker.event_listener_invocation_info(listener);
                        SubLObject protocol = com.cyc.cycjava.cycl.event_broker.socket_info_protocol(socket_info);
                        SubLObject description = com.cyc.cycjava.cycl.event_broker.find_protocol_of_broker(broker, protocol);
                        return com.cyc.cycjava.cycl.event_broker.invoke_socket_event_on_listener(event, listener, description);
                    }
                } else {
                    Errors.warn($str_alt149$Unknown_mode_of_invocation__S____, mode, listener);
                }
            }
        }
        return broker;
    }

    public static SubLObject invoke_event_on_listener(final SubLObject broker, final SubLObject event, final SubLObject listener) {
        final SubLObject pcase_var;
        final SubLObject mode = pcase_var = event_broker.event_listener_invocation_mode(listener);
        if (pcase_var.eql($FUNCALL)) {
            return event_broker.invoke_funcall_event_on_listener(event, listener);
        }
        if (pcase_var.eql($SOCKET)) {
            final SubLObject socket_info = event_broker.event_listener_invocation_info(listener);
            final SubLObject protocol = event_broker.socket_info_protocol(socket_info);
            final SubLObject description = event_broker.find_protocol_of_broker(broker, protocol);
            return event_broker.invoke_socket_event_on_listener(event, listener, description);
        }
        Errors.warn(event_broker.$str166$Unknown_mode_of_invocation__S____, mode, listener);
        return broker;
    }

    public static final SubLObject default_cfasl_event_serialize_alt(SubLObject event, SubLObject stream) {
        {
            SubLObject serialized = list($CLASS, event_model.event_class(event), $TIMESTAMP, numeric_date_utilities.timestring(event_model.event_timestamp(event)), $MESSAGE, event_model.event_message(event), $SOURCE, event_model.event_source(event));
            cfasl_output(serialized, stream);
        }
        return event;
    }

    public static SubLObject default_cfasl_event_serialize(final SubLObject event, final SubLObject stream) {
        final SubLObject serialized = list($CLASS, event_model.event_class(event), $TIMESTAMP, numeric_date_utilities.timestring(event_model.event_timestamp(event)), $MESSAGE, event_model.event_message(event), $SOURCE, event_model.event_source(event));
        cfasl_output(serialized, stream);
        return event;
    }

    public static final SubLObject default_cfasl_params_serialize_alt(SubLObject params, SubLObject stream) {
        {
            SubLObject serialized = list($MY_PARAMS, params);
            cfasl_output(serialized, stream);
        }
        return params;
    }

    public static SubLObject default_cfasl_params_serialize(final SubLObject params, final SubLObject stream) {
        final SubLObject serialized = list($MY_PARAMS, params);
        cfasl_output(serialized, stream);
        return params;
    }

    public static SubLObject declare_event_broker_file() {
        declareFunction("funcall_info_print_function_trampoline", "FUNCALL-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("funcall_info_p", "FUNCALL-INFO-P", 1, 0, false);
        new event_broker.$funcall_info_p$UnaryFunction();
        declareFunction("funcall_info_function", "FUNCALL-INFO-FUNCTION", 1, 0, false);
        declareFunction("_csetf_funcall_info_function", "_CSETF-FUNCALL-INFO-FUNCTION", 2, 0, false);
        declareFunction("make_funcall_info", "MAKE-FUNCALL-INFO", 0, 1, false);
        declareFunction("visit_defstruct_funcall_info", "VISIT-DEFSTRUCT-FUNCALL-INFO", 2, 0, false);
        declareFunction("visit_defstruct_object_funcall_info_method", "VISIT-DEFSTRUCT-OBJECT-FUNCALL-INFO-METHOD", 2, 0, false);
        declareFunction("display_funcall_info", "DISPLAY-FUNCALL-INFO", 1, 1, false);
        declareFunction("socket_info_print_function_trampoline", "SOCKET-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("socket_info_p", "SOCKET-INFO-P", 1, 0, false);
        new event_broker.$socket_info_p$UnaryFunction();
        declareFunction("socket_info_host", "SOCKET-INFO-HOST", 1, 0, false);
        declareFunction("socket_info_port", "SOCKET-INFO-PORT", 1, 0, false);
        declareFunction("socket_info_protocol", "SOCKET-INFO-PROTOCOL", 1, 0, false);
        declareFunction("_csetf_socket_info_host", "_CSETF-SOCKET-INFO-HOST", 2, 0, false);
        declareFunction("_csetf_socket_info_port", "_CSETF-SOCKET-INFO-PORT", 2, 0, false);
        declareFunction("_csetf_socket_info_protocol", "_CSETF-SOCKET-INFO-PROTOCOL", 2, 0, false);
        declareFunction("make_socket_info", "MAKE-SOCKET-INFO", 0, 1, false);
        declareFunction("visit_defstruct_socket_info", "VISIT-DEFSTRUCT-SOCKET-INFO", 2, 0, false);
        declareFunction("visit_defstruct_object_socket_info_method", "VISIT-DEFSTRUCT-OBJECT-SOCKET-INFO-METHOD", 2, 0, false);
        declareFunction("new_socket_info", "NEW-SOCKET-INFO", 2, 1, false);
        declareFunction("display_socket_info", "DISPLAY-SOCKET-INFO", 1, 1, false);
        declareFunction("event_listener_print_function_trampoline", "EVENT-LISTENER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("event_listener_p", "EVENT-LISTENER-P", 1, 0, false);
        new event_broker.$event_listener_p$UnaryFunction();
        declareFunction("event_listener_event", "EVENT-LISTENER-EVENT", 1, 0, false);
        declareFunction("event_listener_invocation_mode", "EVENT-LISTENER-INVOCATION-MODE", 1, 0, false);
        declareFunction("event_listener_invocation_info", "EVENT-LISTENER-INVOCATION-INFO", 1, 0, false);
        declareFunction("event_listener_my_params", "EVENT-LISTENER-MY-PARAMS", 1, 0, false);
        declareFunction("event_listener_source_filter", "EVENT-LISTENER-SOURCE-FILTER", 1, 0, false);
        declareFunction("_csetf_event_listener_event", "_CSETF-EVENT-LISTENER-EVENT", 2, 0, false);
        declareFunction("_csetf_event_listener_invocation_mode", "_CSETF-EVENT-LISTENER-INVOCATION-MODE", 2, 0, false);
        declareFunction("_csetf_event_listener_invocation_info", "_CSETF-EVENT-LISTENER-INVOCATION-INFO", 2, 0, false);
        declareFunction("_csetf_event_listener_my_params", "_CSETF-EVENT-LISTENER-MY-PARAMS", 2, 0, false);
        declareFunction("_csetf_event_listener_source_filter", "_CSETF-EVENT-LISTENER-SOURCE-FILTER", 2, 0, false);
        declareFunction("make_event_listener", "MAKE-EVENT-LISTENER", 0, 1, false);
        declareFunction("visit_defstruct_event_listener", "VISIT-DEFSTRUCT-EVENT-LISTENER", 2, 0, false);
        declareFunction("visit_defstruct_object_event_listener_method", "VISIT-DEFSTRUCT-OBJECT-EVENT-LISTENER-METHOD", 2, 0, false);
        declareFunction("describe_funcall_listener", "DESCRIBE-FUNCALL-LISTENER", 2, 2, false);
        declareFunction("describe_socket_listener", "DESCRIBE-SOCKET-LISTENER", 3, 2, false);
        declareFunction("display_event_listener", "DISPLAY-EVENT-LISTENER", 1, 1, false);
        declareFunction("event_broker_print_function_trampoline", "EVENT-BROKER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("event_broker_p", "EVENT-BROKER-P", 1, 0, false);
        new event_broker.$event_broker_p$UnaryFunction();
        declareFunction("event_broker_hierarchy", "EVENT-BROKER-HIERARCHY", 1, 0, false);
        declareFunction("event_broker_listeners", "EVENT-BROKER-LISTENERS", 1, 0, false);
        declareFunction("event_broker_lock", "EVENT-BROKER-LOCK", 1, 0, false);
        declareFunction("event_broker_postings", "EVENT-BROKER-POSTINGS", 1, 0, false);
        declareFunction("event_broker_protocols", "EVENT-BROKER-PROTOCOLS", 1, 0, false);
        declareFunction("_csetf_event_broker_hierarchy", "_CSETF-EVENT-BROKER-HIERARCHY", 2, 0, false);
        declareFunction("_csetf_event_broker_listeners", "_CSETF-EVENT-BROKER-LISTENERS", 2, 0, false);
        declareFunction("_csetf_event_broker_lock", "_CSETF-EVENT-BROKER-LOCK", 2, 0, false);
        declareFunction("_csetf_event_broker_postings", "_CSETF-EVENT-BROKER-POSTINGS", 2, 0, false);
        declareFunction("_csetf_event_broker_protocols", "_CSETF-EVENT-BROKER-PROTOCOLS", 2, 0, false);
        declareFunction("make_event_broker", "MAKE-EVENT-BROKER", 0, 1, false);
        declareFunction("visit_defstruct_event_broker", "VISIT-DEFSTRUCT-EVENT-BROKER", 2, 0, false);
        declareFunction("visit_defstruct_object_event_broker_method", "VISIT-DEFSTRUCT-OBJECT-EVENT-BROKER-METHOD", 2, 0, false);
        declareMacro("with_event_broker_lock_held", "WITH-EVENT-BROKER-LOCK-HELD");
        declareFunction("add_listener_to_broker", "ADD-LISTENER-TO-BROKER", 2, 0, false);
        declareFunction("remove_listener_from_broker", "REMOVE-LISTENER-FROM-BROKER", 2, 0, false);
        declareMacro("do_listeners_of_event", "DO-LISTENERS-OF-EVENT");
        declareFunction("protocol_description_print_function_trampoline", "PROTOCOL-DESCRIPTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("protocol_description_p", "PROTOCOL-DESCRIPTION-P", 1, 0, false);
        new event_broker.$protocol_description_p$UnaryFunction();
        declareFunction("protocol_description_protocol", "PROTOCOL-DESCRIPTION-PROTOCOL", 1, 0, false);
        declareFunction("protocol_description_event_serialize", "PROTOCOL-DESCRIPTION-EVENT-SERIALIZE", 1, 0, false);
        declareFunction("protocol_description_my_params_serialize", "PROTOCOL-DESCRIPTION-MY-PARAMS-SERIALIZE", 1, 0, false);
        declareFunction("_csetf_protocol_description_protocol", "_CSETF-PROTOCOL-DESCRIPTION-PROTOCOL", 2, 0, false);
        declareFunction("_csetf_protocol_description_event_serialize", "_CSETF-PROTOCOL-DESCRIPTION-EVENT-SERIALIZE", 2, 0, false);
        declareFunction("_csetf_protocol_description_my_params_serialize", "_CSETF-PROTOCOL-DESCRIPTION-MY-PARAMS-SERIALIZE", 2, 0, false);
        declareFunction("make_protocol_description", "MAKE-PROTOCOL-DESCRIPTION", 0, 1, false);
        declareFunction("visit_defstruct_protocol_description", "VISIT-DEFSTRUCT-PROTOCOL-DESCRIPTION", 2, 0, false);
        declareFunction("visit_defstruct_object_protocol_description_method", "VISIT-DEFSTRUCT-OBJECT-PROTOCOL-DESCRIPTION-METHOD", 2, 0, false);
        declareFunction("new_protocol_description", "NEW-PROTOCOL-DESCRIPTION", 2, 1, false);
        declareFunction("display_protocol_description", "DISPLAY-PROTOCOL-DESCRIPTION", 1, 1, false);
        declareFunction("add_protocol_to_broker", "ADD-PROTOCOL-TO-BROKER", 3, 1, false);
        declareFunction("find_protocol_of_broker", "FIND-PROTOCOL-OF-BROKER", 2, 0, false);
        declareFunction("default_event_serialize", "DEFAULT-EVENT-SERIALIZE", 2, 0, false);
        declareFunction("default_my_params_serialize", "DEFAULT-MY-PARAMS-SERIALIZE", 2, 0, false);
        declareFunction("new_event_broker", "NEW-EVENT-BROKER", 0, 1, false);
        declareFunction("ensure_event_broker", "ENSURE-EVENT-BROKER", 0, 0, false);
        declareMacro("initialize_event_broker", "INITIALIZE-EVENT-BROKER");
        declareFunction("core_event_broker", "CORE-EVENT-BROKER", 0, 0, false);
        declareFunction("has_event_class_any_listenersP", "HAS-EVENT-CLASS-ANY-LISTENERS?", 1, 1, false);
        declareFunction("clear_fast_has_event_class_any_transitive_listenersP", "CLEAR-FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?", 0, 0, false);
        declareFunction("remove_fast_has_event_class_any_transitive_listenersP", "REMOVE-FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?", 1, 1, false);
        declareFunction("fast_has_event_class_any_transitive_listenersP_internal", "FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?-INTERNAL", 2, 0, false);
        declareFunction("fast_has_event_class_any_transitive_listenersP", "FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?", 1, 1, false);
        declareFunction("has_event_class_any_transitive_listenersP", "HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?", 1, 1, false);
        declareFunction("display_event_broker", "DISPLAY-EVENT-BROKER", 0, 2, false);
        declareFunction("remove_stale_core_event_customers", "REMOVE-STALE-CORE-EVENT-CUSTOMERS", 0, 0, false);
        declareFunction("remove_stale_event_customers", "REMOVE-STALE-EVENT-CUSTOMERS", 1, 0, false);
        declareFunction("register_event_listener", "REGISTER-EVENT-LISTENER", 1, 1, false);
        declareFunction("deregister_event_listener", "DEREGISTER-EVENT-LISTENER", 1, 1, false);
        declareFunction("register_event_socket_protocol", "REGISTER-EVENT-SOCKET-PROTOCOL", 2, 2, false);
        declareFunction("post_event", "POST-EVENT", 1, 1, false);
        declareFunction("receive_event", "RECEIVE-EVENT", 0, 1, false);
        declareFunction("signal_registered_event", "SIGNAL-REGISTERED-EVENT", 2, 0, false);
        declareFunction("signal_deregistered_event", "SIGNAL-DEREGISTERED-EVENT", 2, 0, false);
        declareFunction("dispatch_event_to_listeners", "DISPATCH-EVENT-TO-LISTENERS", 2, 0, false);
        declareFunction("invoke_funcall_event_on_listener", "INVOKE-FUNCALL-EVENT-ON-LISTENER", 2, 0, false);
        declareFunction("invoke_funcall_event_error_handler", "INVOKE-FUNCALL-EVENT-ERROR-HANDLER", 2, 0, false);
        declareFunction("default_funcall_event_error_handler", "DEFAULT-FUNCALL-EVENT-ERROR-HANDLER", 2, 0, false);
        declareFunction("invoke_socket_event_on_listener", "INVOKE-SOCKET-EVENT-ON-LISTENER", 3, 0, false);
        declareFunction("invoke_event_on_listener", "INVOKE-EVENT-ON-LISTENER", 3, 0, false);
        declareFunction("default_cfasl_event_serialize", "DEFAULT-CFASL-EVENT-SERIALIZE", 2, 0, false);
        declareFunction("default_cfasl_params_serialize", "DEFAULT-CFASL-PARAMS-SERIALIZE", 2, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("FUNCTION"));

    static private final SubLList $list_alt3 = list(makeKeyword("FUNCTION"));

    static private final SubLList $list_alt4 = list(makeSymbol("FUNCALL-INFO-FUNCTION"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-FUNCALL-INFO-FUNCTION"));

    static private final SubLString $str_alt11$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt12$_funcall__S_ = makeString(":funcall ~S ");

    static private final SubLList $list_alt15 = list(makeSymbol("HOST"), makeSymbol("PORT"), makeSymbol("PROTOCOL"));

    static private final SubLList $list_alt16 = list($HOST, $PORT, makeKeyword("PROTOCOL"));

    static private final SubLList $list_alt17 = list(makeSymbol("SOCKET-INFO-HOST"), makeSymbol("SOCKET-INFO-PORT"), makeSymbol("SOCKET-INFO-PROTOCOL"));

    static private final SubLList $list_alt18 = list(makeSymbol("_CSETF-SOCKET-INFO-HOST"), makeSymbol("_CSETF-SOCKET-INFO-PORT"), makeSymbol("_CSETF-SOCKET-INFO-PROTOCOL"));

    static private final SubLString $str_alt29$_socket__S__S__S_ = makeString(":socket ~S ~S ~S ");

    static private final SubLList $list_alt32 = list(makeSymbol("EVENT"), makeSymbol("INVOCATION-MODE"), makeSymbol("INVOCATION-INFO"), makeSymbol("MY-PARAMS"), makeSymbol("SOURCE-FILTER"));

    static private final SubLList $list_alt33 = list(makeKeyword("EVENT"), makeKeyword("INVOCATION-MODE"), makeKeyword("INVOCATION-INFO"), makeKeyword("MY-PARAMS"), makeKeyword("SOURCE-FILTER"));

    static private final SubLList $list_alt34 = list(makeSymbol("EVENT-LISTENER-EVENT"), makeSymbol("EVENT-LISTENER-INVOCATION-MODE"), makeSymbol("EVENT-LISTENER-INVOCATION-INFO"), makeSymbol("EVENT-LISTENER-MY-PARAMS"), makeSymbol("EVENT-LISTENER-SOURCE-FILTER"));

    static private final SubLList $list_alt35 = list(makeSymbol("_CSETF-EVENT-LISTENER-EVENT"), makeSymbol("_CSETF-EVENT-LISTENER-INVOCATION-MODE"), makeSymbol("_CSETF-EVENT-LISTENER-INVOCATION-INFO"), makeSymbol("_CSETF-EVENT-LISTENER-MY-PARAMS"), makeSymbol("_CSETF-EVENT-LISTENER-SOURCE-FILTER"));

    public static final SubLObject init_event_broker_file_alt() {
        deflexical("*SHOULD-SHOW-EVENT-ERRORS?*", NIL);
        defconstant("*DTP-FUNCALL-INFO*", FUNCALL_INFO);
        defconstant("*DTP-SOCKET-INFO*", SOCKET_INFO);
        defconstant("*DTP-EVENT-LISTENER*", EVENT_LISTENER);
        defconstant("*DTP-EVENT-BROKER*", EVENT_BROKER);
        defconstant("*DTP-PROTOCOL-DESCRIPTION*", PROTOCOL_DESCRIPTION);
        deflexical("*EVENT-BROKER*", NIL != boundp($event_broker$) ? ((SubLObject) ($event_broker$.getGlobalValue())) : NIL);
        deflexical("*FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?-CACHING-STATE*", NIL);
        defparameter("*DEREGISTRATION-DURING-SYSTEM-INITIALIZATION*", NIL);
        return NIL;
    }

    public static SubLObject init_event_broker_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*SHOULD-SHOW-EVENT-ERRORS?*", NIL);
            defconstant("*DTP-FUNCALL-INFO*", event_broker.FUNCALL_INFO);
            defconstant("*DTP-SOCKET-INFO*", event_broker.SOCKET_INFO);
            defconstant("*DTP-EVENT-LISTENER*", event_broker.EVENT_LISTENER);
            defconstant("*DTP-EVENT-BROKER*", event_broker.EVENT_BROKER);
            defconstant("*DTP-PROTOCOL-DESCRIPTION*", event_broker.PROTOCOL_DESCRIPTION);
            deflexical("*EVENT-BROKER*", SubLTrampolineFile.maybeDefault(event_broker.$event_broker$, event_broker.$event_broker$, NIL));
            deflexical("*FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?-CACHING-STATE*", NIL);
            defparameter("*DEREGISTRATION-DURING-SYSTEM-INITIALIZATION*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*EVENT-BROKER*", NIL != boundp($event_broker$) ? ((SubLObject) ($event_broker$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_event_broker_file_Previous() {
        deflexical("*SHOULD-SHOW-EVENT-ERRORS?*", NIL);
        defconstant("*DTP-FUNCALL-INFO*", event_broker.FUNCALL_INFO);
        defconstant("*DTP-SOCKET-INFO*", event_broker.SOCKET_INFO);
        defconstant("*DTP-EVENT-LISTENER*", event_broker.EVENT_LISTENER);
        defconstant("*DTP-EVENT-BROKER*", event_broker.EVENT_BROKER);
        defconstant("*DTP-PROTOCOL-DESCRIPTION*", event_broker.PROTOCOL_DESCRIPTION);
        deflexical("*EVENT-BROKER*", SubLTrampolineFile.maybeDefault(event_broker.$event_broker$, event_broker.$event_broker$, NIL));
        deflexical("*FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?-CACHING-STATE*", NIL);
        defparameter("*DEREGISTRATION-DURING-SYSTEM-INITIALIZATION*", NIL);
        return NIL;
    }

    static private final SubLString $str_alt56$_S_listener_ = makeString("~S listener ");

    static private final SubLString $str_alt57$_S__unknown_mode__ = makeString("~S (unknown mode) ");

    static private final SubLString $str_alt58$_with_parameters__S_ = makeString(" with parameters ~S ");

    static private final SubLString $str_alt59$_source_filtering__S = makeString(" source filtering ~S");

    static private final SubLList $list_alt62 = list(makeSymbol("HIERARCHY"), makeSymbol("LISTENERS"), makeSymbol("LOCK"), makeSymbol("POSTINGS"), makeSymbol("PROTOCOLS"));

    public static final SubLObject setup_event_broker_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_funcall_info$.getGlobalValue(), symbol_function(FUNCALL_INFO_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(FUNCALL_INFO_FUNCTION, _CSETF_FUNCALL_INFO_FUNCTION);
        identity(FUNCALL_INFO);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_socket_info$.getGlobalValue(), symbol_function(SOCKET_INFO_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(SOCKET_INFO_HOST, _CSETF_SOCKET_INFO_HOST);
        def_csetf(SOCKET_INFO_PORT, _CSETF_SOCKET_INFO_PORT);
        def_csetf(SOCKET_INFO_PROTOCOL, _CSETF_SOCKET_INFO_PROTOCOL);
        identity(SOCKET_INFO);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_event_listener$.getGlobalValue(), symbol_function(EVENT_LISTENER_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(EVENT_LISTENER_EVENT, _CSETF_EVENT_LISTENER_EVENT);
        def_csetf(EVENT_LISTENER_INVOCATION_MODE, _CSETF_EVENT_LISTENER_INVOCATION_MODE);
        def_csetf(EVENT_LISTENER_INVOCATION_INFO, _CSETF_EVENT_LISTENER_INVOCATION_INFO);
        def_csetf(EVENT_LISTENER_MY_PARAMS, _CSETF_EVENT_LISTENER_MY_PARAMS);
        def_csetf(EVENT_LISTENER_SOURCE_FILTER, _CSETF_EVENT_LISTENER_SOURCE_FILTER);
        identity(EVENT_LISTENER);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_event_broker$.getGlobalValue(), symbol_function(EVENT_BROKER_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(EVENT_BROKER_HIERARCHY, _CSETF_EVENT_BROKER_HIERARCHY);
        def_csetf(EVENT_BROKER_LISTENERS, _CSETF_EVENT_BROKER_LISTENERS);
        def_csetf(EVENT_BROKER_LOCK, _CSETF_EVENT_BROKER_LOCK);
        def_csetf(EVENT_BROKER_POSTINGS, _CSETF_EVENT_BROKER_POSTINGS);
        def_csetf(EVENT_BROKER_PROTOCOLS, _CSETF_EVENT_BROKER_PROTOCOLS);
        identity(EVENT_BROKER);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_protocol_description$.getGlobalValue(), symbol_function(PROTOCOL_DESCRIPTION_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(PROTOCOL_DESCRIPTION_PROTOCOL, _CSETF_PROTOCOL_DESCRIPTION_PROTOCOL);
        def_csetf(PROTOCOL_DESCRIPTION_EVENT_SERIALIZE, _CSETF_PROTOCOL_DESCRIPTION_EVENT_SERIALIZE);
        def_csetf(PROTOCOL_DESCRIPTION_MY_PARAMS_SERIALIZE, _CSETF_PROTOCOL_DESCRIPTION_MY_PARAMS_SERIALIZE);
        identity(PROTOCOL_DESCRIPTION);
        declare_defglobal($event_broker$);
        memoization_state.note_globally_cached_function($sym123$FAST_HAS_EVENT_CLASS_ANY_TRANSITIVE_LISTENERS_);
        event_model.declare_base_event_class_internal($EVENT_BROKER_EVENT, $SYSTEM_EVENT, $str_alt135$The_parent_for_all_events_that_th, NIL);
        event_model.declare_base_event_class_internal($EVENT_HANDLER_REGISTERED, $EVENT_BROKER_EVENT, $str_alt137$The_first_message_any_event_handl, NIL);
        event_model.declare_base_event_class_internal($EVENT_HANDLER_DEREGISTERED, $EVENT_BROKER_EVENT, $str_alt139$The_last_message_any_event_handle, NIL);
        com.cyc.cycjava.cycl.event_broker.register_event_socket_protocol($CFASL, DEFAULT_CFASL_EVENT_SERIALIZE, DEFAULT_CFASL_PARAMS_SERIALIZE, UNPROVIDED);
        return NIL;
    }

    public static SubLObject setup_event_broker_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), event_broker.$dtp_funcall_info$.getGlobalValue(), symbol_function(event_broker.FUNCALL_INFO_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(event_broker.$list8);
            def_csetf(event_broker.FUNCALL_INFO_FUNCTION, event_broker._CSETF_FUNCALL_INFO_FUNCTION);
            identity(event_broker.FUNCALL_INFO);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), event_broker.$dtp_funcall_info$.getGlobalValue(), symbol_function(event_broker.VISIT_DEFSTRUCT_OBJECT_FUNCALL_INFO_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function(event_broker.SOCKET_INFO_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(event_broker.$list26);
            def_csetf(event_broker.SOCKET_INFO_HOST, event_broker._CSETF_SOCKET_INFO_HOST);
            def_csetf(event_broker.SOCKET_INFO_PORT, event_broker._CSETF_SOCKET_INFO_PORT);
            def_csetf(event_broker.SOCKET_INFO_PROTOCOL, event_broker._CSETF_SOCKET_INFO_PROTOCOL);
            identity(event_broker.SOCKET_INFO);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function(event_broker.VISIT_DEFSTRUCT_OBJECT_SOCKET_INFO_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), event_broker.$dtp_event_listener$.getGlobalValue(), symbol_function(event_broker.EVENT_LISTENER_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(event_broker.$list46);
            def_csetf(event_broker.EVENT_LISTENER_EVENT, event_broker._CSETF_EVENT_LISTENER_EVENT);
            def_csetf(event_broker.EVENT_LISTENER_INVOCATION_MODE, event_broker._CSETF_EVENT_LISTENER_INVOCATION_MODE);
            def_csetf(event_broker.EVENT_LISTENER_INVOCATION_INFO, event_broker._CSETF_EVENT_LISTENER_INVOCATION_INFO);
            def_csetf(event_broker.EVENT_LISTENER_MY_PARAMS, event_broker._CSETF_EVENT_LISTENER_MY_PARAMS);
            def_csetf(event_broker.EVENT_LISTENER_SOURCE_FILTER, event_broker._CSETF_EVENT_LISTENER_SOURCE_FILTER);
            identity(event_broker.EVENT_LISTENER);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), event_broker.$dtp_event_listener$.getGlobalValue(), symbol_function(event_broker.VISIT_DEFSTRUCT_OBJECT_EVENT_LISTENER_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), event_broker.$dtp_event_broker$.getGlobalValue(), symbol_function(event_broker.EVENT_BROKER_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(event_broker.$list79);
            def_csetf(event_broker.EVENT_BROKER_HIERARCHY, event_broker._CSETF_EVENT_BROKER_HIERARCHY);
            def_csetf(event_broker.EVENT_BROKER_LISTENERS, event_broker._CSETF_EVENT_BROKER_LISTENERS);
            def_csetf(event_broker.EVENT_BROKER_LOCK, event_broker._CSETF_EVENT_BROKER_LOCK);
            def_csetf(event_broker.EVENT_BROKER_POSTINGS, event_broker._CSETF_EVENT_BROKER_POSTINGS);
            def_csetf(event_broker.EVENT_BROKER_PROTOCOLS, event_broker._CSETF_EVENT_BROKER_PROTOCOLS);
            identity(event_broker.EVENT_BROKER);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), event_broker.$dtp_event_broker$.getGlobalValue(), symbol_function(event_broker.VISIT_DEFSTRUCT_OBJECT_EVENT_BROKER_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), event_broker.$dtp_protocol_description$.getGlobalValue(), symbol_function(event_broker.PROTOCOL_DESCRIPTION_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(event_broker.$list115);
            def_csetf(event_broker.PROTOCOL_DESCRIPTION_PROTOCOL, event_broker._CSETF_PROTOCOL_DESCRIPTION_PROTOCOL);
            def_csetf(event_broker.PROTOCOL_DESCRIPTION_EVENT_SERIALIZE, event_broker._CSETF_PROTOCOL_DESCRIPTION_EVENT_SERIALIZE);
            def_csetf(event_broker.PROTOCOL_DESCRIPTION_MY_PARAMS_SERIALIZE, event_broker._CSETF_PROTOCOL_DESCRIPTION_MY_PARAMS_SERIALIZE);
            identity(event_broker.PROTOCOL_DESCRIPTION);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), event_broker.$dtp_protocol_description$.getGlobalValue(), symbol_function(event_broker.VISIT_DEFSTRUCT_OBJECT_PROTOCOL_DESCRIPTION_METHOD));
            declare_defglobal(event_broker.$event_broker$);
            memoization_state.note_globally_cached_function(event_broker.$sym141$FAST_HAS_EVENT_CLASS_ANY_TRANSITIVE_LISTENERS_);
            event_model.declare_base_event_class_internal(event_broker.$EVENT_BROKER_EVENT, $SYSTEM_EVENT, event_broker.$str152$The_parent_for_all_events_that_th, NIL);
            event_model.declare_base_event_class_internal(event_broker.$EVENT_HANDLER_REGISTERED, event_broker.$EVENT_BROKER_EVENT, event_broker.$str154$The_first_message_any_event_handl, NIL);
            event_model.declare_base_event_class_internal(event_broker.$EVENT_HANDLER_DEREGISTERED, event_broker.$EVENT_BROKER_EVENT, event_broker.$str156$The_last_message_any_event_handle, NIL);
            event_broker.register_event_socket_protocol($CFASL, event_broker.DEFAULT_CFASL_EVENT_SERIALIZE, event_broker.DEFAULT_CFASL_PARAMS_SERIALIZE, UNPROVIDED);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_globally_cached_function($sym123$FAST_HAS_EVENT_CLASS_ANY_TRANSITIVE_LISTENERS_);
            event_model.declare_base_event_class_internal($EVENT_BROKER_EVENT, $SYSTEM_EVENT, $str_alt135$The_parent_for_all_events_that_th, NIL);
            event_model.declare_base_event_class_internal($EVENT_HANDLER_REGISTERED, $EVENT_BROKER_EVENT, $str_alt137$The_first_message_any_event_handl, NIL);
            event_model.declare_base_event_class_internal($EVENT_HANDLER_DEREGISTERED, $EVENT_BROKER_EVENT, $str_alt139$The_last_message_any_event_handle, NIL);
        }
        return NIL;
    }

    public static SubLObject setup_event_broker_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), event_broker.$dtp_funcall_info$.getGlobalValue(), symbol_function(event_broker.FUNCALL_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(event_broker.$list8);
        def_csetf(event_broker.FUNCALL_INFO_FUNCTION, event_broker._CSETF_FUNCALL_INFO_FUNCTION);
        identity(event_broker.FUNCALL_INFO);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), event_broker.$dtp_funcall_info$.getGlobalValue(), symbol_function(event_broker.VISIT_DEFSTRUCT_OBJECT_FUNCALL_INFO_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function(event_broker.SOCKET_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(event_broker.$list26);
        def_csetf(event_broker.SOCKET_INFO_HOST, event_broker._CSETF_SOCKET_INFO_HOST);
        def_csetf(event_broker.SOCKET_INFO_PORT, event_broker._CSETF_SOCKET_INFO_PORT);
        def_csetf(event_broker.SOCKET_INFO_PROTOCOL, event_broker._CSETF_SOCKET_INFO_PROTOCOL);
        identity(event_broker.SOCKET_INFO);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), event_broker.$dtp_socket_info$.getGlobalValue(), symbol_function(event_broker.VISIT_DEFSTRUCT_OBJECT_SOCKET_INFO_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), event_broker.$dtp_event_listener$.getGlobalValue(), symbol_function(event_broker.EVENT_LISTENER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(event_broker.$list46);
        def_csetf(event_broker.EVENT_LISTENER_EVENT, event_broker._CSETF_EVENT_LISTENER_EVENT);
        def_csetf(event_broker.EVENT_LISTENER_INVOCATION_MODE, event_broker._CSETF_EVENT_LISTENER_INVOCATION_MODE);
        def_csetf(event_broker.EVENT_LISTENER_INVOCATION_INFO, event_broker._CSETF_EVENT_LISTENER_INVOCATION_INFO);
        def_csetf(event_broker.EVENT_LISTENER_MY_PARAMS, event_broker._CSETF_EVENT_LISTENER_MY_PARAMS);
        def_csetf(event_broker.EVENT_LISTENER_SOURCE_FILTER, event_broker._CSETF_EVENT_LISTENER_SOURCE_FILTER);
        identity(event_broker.EVENT_LISTENER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), event_broker.$dtp_event_listener$.getGlobalValue(), symbol_function(event_broker.VISIT_DEFSTRUCT_OBJECT_EVENT_LISTENER_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), event_broker.$dtp_event_broker$.getGlobalValue(), symbol_function(event_broker.EVENT_BROKER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(event_broker.$list79);
        def_csetf(event_broker.EVENT_BROKER_HIERARCHY, event_broker._CSETF_EVENT_BROKER_HIERARCHY);
        def_csetf(event_broker.EVENT_BROKER_LISTENERS, event_broker._CSETF_EVENT_BROKER_LISTENERS);
        def_csetf(event_broker.EVENT_BROKER_LOCK, event_broker._CSETF_EVENT_BROKER_LOCK);
        def_csetf(event_broker.EVENT_BROKER_POSTINGS, event_broker._CSETF_EVENT_BROKER_POSTINGS);
        def_csetf(event_broker.EVENT_BROKER_PROTOCOLS, event_broker._CSETF_EVENT_BROKER_PROTOCOLS);
        identity(event_broker.EVENT_BROKER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), event_broker.$dtp_event_broker$.getGlobalValue(), symbol_function(event_broker.VISIT_DEFSTRUCT_OBJECT_EVENT_BROKER_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), event_broker.$dtp_protocol_description$.getGlobalValue(), symbol_function(event_broker.PROTOCOL_DESCRIPTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(event_broker.$list115);
        def_csetf(event_broker.PROTOCOL_DESCRIPTION_PROTOCOL, event_broker._CSETF_PROTOCOL_DESCRIPTION_PROTOCOL);
        def_csetf(event_broker.PROTOCOL_DESCRIPTION_EVENT_SERIALIZE, event_broker._CSETF_PROTOCOL_DESCRIPTION_EVENT_SERIALIZE);
        def_csetf(event_broker.PROTOCOL_DESCRIPTION_MY_PARAMS_SERIALIZE, event_broker._CSETF_PROTOCOL_DESCRIPTION_MY_PARAMS_SERIALIZE);
        identity(event_broker.PROTOCOL_DESCRIPTION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), event_broker.$dtp_protocol_description$.getGlobalValue(), symbol_function(event_broker.VISIT_DEFSTRUCT_OBJECT_PROTOCOL_DESCRIPTION_METHOD));
        declare_defglobal(event_broker.$event_broker$);
        memoization_state.note_globally_cached_function(event_broker.$sym141$FAST_HAS_EVENT_CLASS_ANY_TRANSITIVE_LISTENERS_);
        event_model.declare_base_event_class_internal(event_broker.$EVENT_BROKER_EVENT, $SYSTEM_EVENT, event_broker.$str152$The_parent_for_all_events_that_th, NIL);
        event_model.declare_base_event_class_internal(event_broker.$EVENT_HANDLER_REGISTERED, event_broker.$EVENT_BROKER_EVENT, event_broker.$str154$The_first_message_any_event_handl, NIL);
        event_model.declare_base_event_class_internal(event_broker.$EVENT_HANDLER_DEREGISTERED, event_broker.$EVENT_BROKER_EVENT, event_broker.$str156$The_last_message_any_event_handle, NIL);
        event_broker.register_event_socket_protocol($CFASL, event_broker.DEFAULT_CFASL_EVENT_SERIALIZE, event_broker.DEFAULT_CFASL_PARAMS_SERIALIZE, UNPROVIDED);
        return NIL;
    }

    static private final SubLList $list_alt63 = list(makeKeyword("HIERARCHY"), makeKeyword("LISTENERS"), $LOCK, makeKeyword("POSTINGS"), makeKeyword("PROTOCOLS"));

    static private final SubLList $list_alt64 = list(makeSymbol("EVENT-BROKER-HIERARCHY"), makeSymbol("EVENT-BROKER-LISTENERS"), makeSymbol("EVENT-BROKER-LOCK"), makeSymbol("EVENT-BROKER-POSTINGS"), makeSymbol("EVENT-BROKER-PROTOCOLS"));

    static private final SubLList $list_alt65 = list(makeSymbol("_CSETF-EVENT-BROKER-HIERARCHY"), makeSymbol("_CSETF-EVENT-BROKER-LISTENERS"), makeSymbol("_CSETF-EVENT-BROKER-LOCK"), makeSymbol("_CSETF-EVENT-BROKER-POSTINGS"), makeSymbol("_CSETF-EVENT-BROKER-PROTOCOLS"));

    static private final SubLList $list_alt82 = list(list(makeSymbol("EVENT-BROKER")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt84 = list(list(makeSymbol("LISTENER"), makeSymbol("EVENT"), makeSymbol("BROKER")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym85$LISTENERS = makeUninternedSymbol("LISTENERS");

    static private final SubLSymbol $sym86$EVENT_LISTENERS = makeUninternedSymbol("EVENT-LISTENERS");

    static private final SubLList $list_alt90 = list(list(makeSymbol("EVENT-BROKER-LISTENERS"), makeSymbol("BROKER")));

    static private final SubLList $list_alt95 = list(makeSymbol("PROTOCOL"), makeSymbol("EVENT-SERIALIZE"), makeSymbol("MY-PARAMS-SERIALIZE"));

    static private final SubLList $list_alt96 = list(makeKeyword("PROTOCOL"), makeKeyword("EVENT-SERIALIZE"), makeKeyword("MY-PARAMS-SERIALIZE"));

    static private final SubLList $list_alt97 = list(makeSymbol("PROTOCOL-DESCRIPTION-PROTOCOL"), makeSymbol("PROTOCOL-DESCRIPTION-EVENT-SERIALIZE"), makeSymbol("PROTOCOL-DESCRIPTION-MY-PARAMS-SERIALIZE"));

    static private final SubLList $list_alt98 = list(makeSymbol("_CSETF-PROTOCOL-DESCRIPTION-PROTOCOL"), makeSymbol("_CSETF-PROTOCOL-DESCRIPTION-EVENT-SERIALIZE"), makeSymbol("_CSETF-PROTOCOL-DESCRIPTION-MY-PARAMS-SERIALIZE"));

    @Override
    public void declareFunctions() {
        event_broker.declare_event_broker_file();
    }

    @Override
    public void initializeVariables() {
        event_broker.init_event_broker_file();
    }

    @Override
    public void runTopLevelForms() {
        event_broker.setup_event_broker_file();
    }

    static private final SubLString $str_alt108$Protocol__S____for_Event___S____f = makeString("Protocol ~S // for Event: ~S // for Params: ~S");

    static {
    }

    static private final SubLString $str_alt109$_event_code__S_ = makeString("<event code=~S ");

    static private final SubLString $str_alt110$timestamp__S_ = makeString("timestamp=~S ");

    static private final SubLString $str_alt111$source__S_ = makeString("source=~S ");

    static private final SubLString $str_alt112$message__S__ = makeString("message=~S/>");

    static private final SubLString $str_alt113$_parameter_key__mine__value__S__ = makeString("<parameter key=\"mine\" value=~S/>");

    static private final SubLList $list_alt119 = list(makeSymbol("EVENT-BROKER"));

    static private final SubLList $list_alt122 = list(list(makeSymbol("ENSURE-EVENT-BROKER")));

    static private final SubLSymbol $sym123$FAST_HAS_EVENT_CLASS_ANY_TRANSITIVE_LISTENERS_ = makeSymbol("FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?");

    public static final class $funcall_info_p$UnaryFunction extends UnaryFunction {
        public $funcall_info_p$UnaryFunction() {
            super(extractFunctionNamed("FUNCALL-INFO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return event_broker.funcall_info_p(arg1);
        }
    }

    static private final SubLSymbol $sym124$_FAST_HAS_EVENT_CLASS_ANY_TRANSITIVE_LISTENERS__CACHING_STATE_ = makeSymbol("*FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?-CACHING-STATE*");

    public static final SubLSymbol $kw125$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt127$Event_Broker_settings__ = makeString("Event Broker settings~%");

    static private final SubLString $str_alt129$__Listening_for__S____ = makeString("  Listening for ~S :~%");

    static private final SubLString $str_alt130$__ = makeString("  ");

    static private final SubLString $str_alt131$__Defined_protocols___ = makeString("  Defined protocols:~%");

    static private final SubLString $str_alt132$____ = makeString("    ");

    static private final SubLString $str_alt135$The_parent_for_all_events_that_th = makeString("The parent for all events that the event broker uses for the meta-communication.");

    static private final SubLString $str_alt137$The_first_message_any_event_handl = makeString("The first message any event handler sees.");

    static private final SubLString $str_alt139$The_last_message_any_event_handle = makeString("The last message any event handler sees.");

    public static final class $socket_info_p$UnaryFunction extends UnaryFunction {
        public $socket_info_p$UnaryFunction() {
            super(extractFunctionNamed("SOCKET-INFO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return event_broker.socket_info_p(arg1);
        }
    }

    static private final SubLString $str_alt147$Error_during_processing_of_event_ = makeString("Error during processing of event: ~A~%~A~%");

    static private final SubLString $str_alt149$Unknown_mode_of_invocation__S____ = makeString("Unknown mode of invocation ~S -- cannot dispatch event to listener ~S.");

    public static final class $event_listener_p$UnaryFunction extends UnaryFunction {
        public $event_listener_p$UnaryFunction() {
            super(extractFunctionNamed("EVENT-LISTENER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return event_broker.event_listener_p(arg1);
        }
    }

    public static final class $event_broker_p$UnaryFunction extends UnaryFunction {
        public $event_broker_p$UnaryFunction() {
            super(extractFunctionNamed("EVENT-BROKER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return event_broker.event_broker_p(arg1);
        }
    }

    public static final class $protocol_description_p$UnaryFunction extends UnaryFunction {
        public $protocol_description_p$UnaryFunction() {
            super(extractFunctionNamed("PROTOCOL-DESCRIPTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return event_broker.protocol_description_p(arg1);
        }
    }
}

/**
 * Total time: 418 ms
 */
