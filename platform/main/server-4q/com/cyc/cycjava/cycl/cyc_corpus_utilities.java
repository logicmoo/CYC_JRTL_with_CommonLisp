package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cyc_corpus_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cyc_corpus_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NINE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class cyc_corpus_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new cyc_corpus_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.cyc_corpus_utilities";

    public static final String myFingerPrint = "5f849433fca50fee5203dba496dc0db8880f1e5705369d7aa91a154d1112c546";





    // defparameter
    private static final SubLSymbol $cyc_corpus_client$ = makeSymbol("*CYC-CORPUS-CLIENT*");

    // defvar
    /**
     * A variable to store a background task of dumping out to files the Cyc corpus
     */
    private static final SubLSymbol $cyc_corpus_dump_task$ = makeSymbol("*CYC-CORPUS-DUMP-TASK*");

    // Internal Constants
    public static final SubLList $list0 = list(makeString("application.cyc-ir.cyc-corpus-client-host"));

    public static final SubLSymbol $cyc_corpus_client_host$ = makeSymbol("*CYC-CORPUS-CLIENT-HOST*");

    public static final SubLString $str2$ir_cyc_com = makeString("ir.cyc.com");



    public static final SubLList $list4 = list(makeString("application.cyc-ir.cyc-corpus-client-port"));

    public static final SubLSymbol $cyc_corpus_client_port$ = makeSymbol("*CYC-CORPUS-CLIENT-PORT*");

    private static final SubLInteger $int$6666 = makeInteger(6666);

    public static final SubLSymbol TCP_CLIENT = makeSymbol("TCP-CLIENT");

    public static final SubLSymbol SET_HOST = makeSymbol("SET-HOST");

    public static final SubLSymbol SET_PORT = makeSymbol("SET-PORT");





    public static final SubLSymbol CYC_IR_CLIENT_INTERACTION = makeSymbol("CYC-IR-CLIENT-INTERACTION");



    public static final SubLSymbol SET_KEY = makeSymbol("SET-KEY");



    public static final SubLSymbol BUILD_ANSWER = makeSymbol("BUILD-ANSWER");

    public static final SubLSymbol PERFORM_REQUEST = makeSymbol("PERFORM-REQUEST");







    public static final SubLSymbol SET_SEARCH_STRING = makeSymbol("SET-SEARCH-STRING");

    public static final SubLSymbol SET_HITNUM = makeSymbol("SET-HITNUM");



    public static final SubLList $list24 = list(new SubLObject[]{ list(makeSymbol("INDEX-DIRECTIVE-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("index")), list(makeSymbol("SEARCH-DIRECTIVE-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("search")), list(makeSymbol("SUBL-DIRECTIVE-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("SubL")), list(makeSymbol("QUERY-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("request")), list(makeSymbol("QUERY-TYPE-ATTR"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("type")), list(makeSymbol("QUERY-LANGUAGE-ATTR"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("language")), list(makeSymbol("INDEX-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("to-index")), list(makeSymbol("INDEX-TARGET-ATTR"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("target")), list(makeSymbol("HITNUM-ATTR"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("hitnum")), list(makeSymbol("KEY"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("VALUE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("SEARCH-STRING"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("HIT-NUMBER"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("ANSWER"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KEY"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-VALUE"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REQUEST-STRING"), NIL, makeKeyword("PUBLIC")) });



    public static final SubLSymbol HIT_NUMBER = makeSymbol("HIT-NUMBER");









    public static final SubLSymbol INDEX_DIRECTIVE_TAG = makeSymbol("INDEX-DIRECTIVE-TAG");

    public static final SubLString $$$index = makeString("index");



    public static final SubLString $$$search = makeString("search");



    public static final SubLString $$$SubL = makeString("SubL");



    public static final SubLString $$$request = makeString("request");



    public static final SubLString $$$type = makeString("type");



    public static final SubLString $$$language = makeString("language");

    public static final SubLSymbol INDEX_TAG = makeSymbol("INDEX-TAG");

    public static final SubLString $str44$to_index = makeString("to-index");

    public static final SubLSymbol INDEX_TARGET_ATTR = makeSymbol("INDEX-TARGET-ATTR");

    public static final SubLString $$$target = makeString("target");

    public static final SubLSymbol HITNUM_ATTR = makeSymbol("HITNUM-ATTR");

    public static final SubLString $$$hitnum = makeString("hitnum");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYC_IR_CLIENT_INTERACTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-IR-CLIENT-INTERACTION-CLASS");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYC_IR_CLIENT_INTERACTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-IR-CLIENT-INTERACTION-INSTANCE");



    public static final SubLList $list54 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list55 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol CYC_IR_CLIENT_INTERACTION_INITIALIZE_METHOD = makeSymbol("CYC-IR-CLIENT-INTERACTION-INITIALIZE-METHOD");

    public static final SubLList $list57 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list58 = list(makeSymbol("RESPONSE-STRING"));

    public static final SubLList $list59 = list(list(makeSymbol("CLET"), list(makeSymbol("RESPONSE"), makeSymbol("ERROR")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")), list(makeSymbol("CSETQ"), makeSymbol("RESPONSE"), list(makeSymbol("READ-FROM-STRING"), makeSymbol("RESPONSE-STRING")))), list(makeSymbol("PWHEN"), makeSymbol("ERROR"), list(makeSymbol("WARN"), makeSymbol("ERROR")), list(makeSymbol("RET"), makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("ANSWER"), makeSymbol("RESPONSE")), list(makeSymbol("RET"), makeSymbol("SELF"))));

    public static final SubLSymbol $sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD");

    public static final SubLSymbol CYC_IR_CLIENT_INTERACTION_BUILD_ANSWER_METHOD = makeSymbol("CYC-IR-CLIENT-INTERACTION-BUILD-ANSWER-METHOD");

    public static final SubLList $list62 = list(makeSymbol("OBJECT"));

    public static final SubLList $list63 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("STRINGP")), list(makeSymbol("CSETQ"), makeSymbol("KEY"), makeSymbol("OBJECT")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym64$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD");

    public static final SubLSymbol CYC_IR_CLIENT_INTERACTION_SET_KEY_METHOD = makeSymbol("CYC-IR-CLIENT-INTERACTION-SET-KEY-METHOD");

    public static final SubLList $list66 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("STRINGP")), list(makeSymbol("CSETQ"), makeSymbol("VALUE"), makeSymbol("OBJECT")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym67$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD");

    public static final SubLSymbol CYC_IR_CLIENT_INTERACTION_SET_VALUE_METHOD = makeSymbol("CYC-IR-CLIENT-INTERACTION-SET-VALUE-METHOD");

    public static final SubLList $list69 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("STRINGP")), list(makeSymbol("CSETQ"), makeSymbol("SEARCH-STRING"), makeSymbol("OBJECT")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym70$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD");

    public static final SubLSymbol CYC_IR_CLIENT_INTERACTION_SET_SEARCH_STRING_METHOD = makeSymbol("CYC-IR-CLIENT-INTERACTION-SET-SEARCH-STRING-METHOD");

    public static final SubLList $list72 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("INTEGERP")), list(makeSymbol("MUST"), list(makeSymbol(">"), makeSymbol("OBJECT"), ZERO_INTEGER), makeString("~a is not a positive integer"), makeSymbol("OBJECT")), list(makeSymbol("CSETQ"), makeSymbol("HIT-NUMBER"), makeSymbol("OBJECT")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym73$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD");

    public static final SubLString $str74$_a_is_not_a_positive_integer = makeString("~a is not a positive integer");

    public static final SubLSymbol CYC_IR_CLIENT_INTERACTION_SET_HITNUM_METHOD = makeSymbol("CYC-IR-CLIENT-INTERACTION-SET-HITNUM-METHOD");

    public static final SubLList $list76 = list(list(makeSymbol("CLET"), list(list(makeSymbol("OUTSTREAM"), list(makeSymbol("MAKE-STRING-OUTPUT-STREAM"))), list(makeSymbol("XML-WRITER"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("XML-WRITER")))), list(makeSymbol("QUERY-TYPE-TAG"), list(makeSymbol("FIF"), makeSymbol("SEARCH-STRING"), makeSymbol("SEARCH-DIRECTIVE-TAG"), makeSymbol("INDEX-DIRECTIVE-TAG"))), list(makeSymbol("ATTRIBUTES"), list(makeSymbol("BQ-LIST"), makeSymbol("QUERY-TYPE-ATTR"), makeSymbol("QUERY-TYPE-TAG"), makeSymbol("QUERY-LANGUAGE-ATTR"), makeSymbol("SUBL-DIRECTIVE-TAG")))), list(makeSymbol("PWHEN"), makeSymbol("SEARCH-STRING"), list(makeSymbol("CPUSH"), makeSymbol("HIT-NUMBER"), makeSymbol("ATTRIBUTES")), list(makeSymbol("CPUSH"), makeSymbol("HITNUM-ATTR"), makeSymbol("ATTRIBUTES"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("XML-WRITER"), list(makeSymbol("QUOTE"), makeSymbol("SET-STREAM")), makeSymbol("OUTSTREAM")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("XML-WRITER"), list(makeSymbol("QUOTE"), makeSymbol("START-TAG")), makeSymbol("QUERY-TAG"), makeSymbol("ATTRIBUTES"), NIL, NIL), list(makeSymbol("PCOND"), list(makeSymbol("SEARCH-STRING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("XML-WRITER"), list(makeSymbol("QUOTE"), makeSymbol("XML-PRINT")), makeSymbol("SEARCH-STRING"), NIL)), list(T, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("XML-WRITER"), list(makeSymbol("QUOTE"), makeSymbol("START-TAG")), makeSymbol("INDEX-TAG"), list(makeSymbol("BQ-LIST"), makeSymbol("INDEX-TARGET-ATTR"), makeSymbol("KEY")), NIL, NIL), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("XML-WRITER"), list(makeSymbol("QUOTE"), makeSymbol("XML-PRINT")), makeSymbol("VALUE"), NIL), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("XML-WRITER"), list(makeSymbol("QUOTE"), makeSymbol("END-TAG")), makeSymbol("INDEX-TAG"), NIL, NIL))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("XML-WRITER"), list(makeSymbol("QUOTE"), makeSymbol("END-TAG")), makeSymbol("QUERY-TAG"), NIL, NIL), list(makeSymbol("RET"), list(makeSymbol("GET-OUTPUT-STREAM-STRING"), makeSymbol("OUTSTREAM")))));

    public static final SubLSymbol $sym77$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD");











    public static final SubLSymbol CYC_IR_CLIENT_INTERACTION_REQUEST_STRING_METHOD = makeSymbol("CYC-IR-CLIENT-INTERACTION-REQUEST-STRING-METHOD");

    public static final SubLList $list84 = list(list(makeSymbol("RET"), makeSymbol("ANSWER")));

    public static final SubLSymbol $sym85$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD");

    public static final SubLSymbol CYC_IR_CLIENT_INTERACTION_GET_ANSWER_METHOD = makeSymbol("CYC-IR-CLIENT-INTERACTION-GET-ANSWER-METHOD");

    public static final SubLString $$$mapping_Cyc_FORTs = makeString("mapping Cyc FORTs");



    public static final SubLString $str89$__Couldn_t_index__S = makeString("~%Couldn't index ~S");



    private static final SubLInteger $int$300 = makeInteger(300);

    public static final SubLString $str92$_S_is_not_an_existing_directory = makeString("~S is not an existing directory");

    public static final SubLString $str93$_A_corpus_dump = makeString("~A-corpus-dump");

    public static final SubLSymbol ALL_TERMS_INDEX_FILES_TO_DIR = makeSymbol("ALL-TERMS-INDEX-FILES-TO-DIR");



    public static final SubLString $str96$ = makeString("");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLString $$$_ = makeString(" ");

    private static final SubLInteger $int$999 = makeInteger(999);



    private static final SubLInteger $int$250 = makeInteger(250);

    public static final SubLString $str103$_S = makeString("~S");

    private static final SubLInteger $int$47 = makeInteger(47);

    public static final SubLString $str105$_ = makeString("_");

    public static final SubLString $str106$_ = makeString("/");

    public static final SubLString $str107$_ = makeString(";");

    public static final SubLString $str108$_ = makeString(":");

    public static final SubLString $str109$_op_ = makeString("_op_");

    public static final SubLString $str110$_ = makeString("(");

    public static final SubLString $str111$_cp_ = makeString("_cp_");

    public static final SubLString $str112$_ = makeString(")");



    public static final SubLString $str114$Unable_to_open__S = makeString("Unable to open ~S");

    public static final SubLString $str115$_____S = makeString("~%~%~S");

    public static final SubLString $$$mapping_Cyc_constants = makeString("mapping Cyc constants");

    public static final SubLString $$$mapping_Cyc_NARTs = makeString("mapping Cyc NARTs");

    public static SubLObject get_cyc_corpus_client() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == $cyc_corpus_client$.getDynamicValue(thread)) && $cyc_corpus_client_host$.getDynamicValue(thread).isString()) && $cyc_corpus_client_port$.getDynamicValue(thread).isInteger()) {
            $cyc_corpus_client$.setDynamicValue(object.new_class_instance(TCP_CLIENT), thread);
            methods.funcall_instance_method_with_1_args($cyc_corpus_client$.getDynamicValue(thread), SET_HOST, $cyc_corpus_client_host$.getDynamicValue(thread));
            methods.funcall_instance_method_with_1_args($cyc_corpus_client$.getDynamicValue(thread), SET_PORT, $cyc_corpus_client_port$.getDynamicValue(thread));
        }
        return $cyc_corpus_client$.getDynamicValue(thread);
    }

    public static SubLObject reset_cyc_corpus_client(final SubLObject host, final SubLObject port) {
        assert NIL != stringp(host) : "Types.stringp(host) " + "CommonSymbols.NIL != Types.stringp(host) " + host;
        assert NIL != integerp(port) : "Types.integerp(port) " + "CommonSymbols.NIL != Types.integerp(port) " + port;
        $cyc_corpus_client$.setDynamicValue(NIL);
        $cyc_corpus_client_host$.setDynamicValue(host);
        $cyc_corpus_client_port$.setDynamicValue(port);
        return T;
    }

    public static SubLObject add_to_cyc_corpus_index(final SubLObject key, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interaction = object.new_class_instance(CYC_IR_CLIENT_INTERACTION);
        SubLObject result = NIL;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    methods.funcall_instance_method_with_1_args(interaction, SET_KEY, key);
                    methods.funcall_instance_method_with_1_args(interaction, SET_VALUE, value);
                    methods.funcall_instance_method_with_1_args(interaction, BUILD_ANSWER, methods.funcall_instance_method_with_1_args(get_cyc_corpus_client(), PERFORM_REQUEST, methods.funcall_instance_method_with_0_args(interaction, REQUEST_STRING)));
                    result = methods.funcall_instance_method_with_0_args(interaction, GET_ANSWER);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if ((NIL == error) || (NIL != get_cyc_corpus_client())) {
        }
        return result;
    }

    public static SubLObject lookup_cyc_corpus_index(final SubLObject string_to_look_up, SubLObject number_of_hits) {
        if (number_of_hits == UNPROVIDED) {
            number_of_hits = $int$100;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interaction = object.new_class_instance(CYC_IR_CLIENT_INTERACTION);
        SubLObject results = NIL;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    methods.funcall_instance_method_with_1_args(interaction, SET_SEARCH_STRING, string_to_look_up);
                    methods.funcall_instance_method_with_1_args(interaction, SET_HITNUM, number_of_hits);
                    methods.funcall_instance_method_with_1_args(interaction, BUILD_ANSWER, methods.funcall_instance_method_with_1_args(get_cyc_corpus_client(), PERFORM_REQUEST, methods.funcall_instance_method_with_0_args(interaction, REQUEST_STRING)));
                    results = methods.funcall_instance_method_with_0_args(interaction, GET_ANSWER);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if ((NIL == error) || (NIL != get_cyc_corpus_client())) {
        }
        return results;
    }

    public static SubLObject get_cyc_ir_client_interaction_answer(final SubLObject cyc_ir_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(cyc_ir_client_interaction, FIVE_INTEGER, ANSWER);
    }

    public static SubLObject set_cyc_ir_client_interaction_answer(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyc_ir_client_interaction, value, FIVE_INTEGER, ANSWER);
    }

    public static SubLObject get_cyc_ir_client_interaction_hit_number(final SubLObject cyc_ir_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(cyc_ir_client_interaction, FOUR_INTEGER, HIT_NUMBER);
    }

    public static SubLObject set_cyc_ir_client_interaction_hit_number(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyc_ir_client_interaction, value, FOUR_INTEGER, HIT_NUMBER);
    }

    public static SubLObject get_cyc_ir_client_interaction_search_string(final SubLObject cyc_ir_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(cyc_ir_client_interaction, THREE_INTEGER, SEARCH_STRING);
    }

    public static SubLObject set_cyc_ir_client_interaction_search_string(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyc_ir_client_interaction, value, THREE_INTEGER, SEARCH_STRING);
    }

    public static SubLObject get_cyc_ir_client_interaction_value(final SubLObject cyc_ir_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(cyc_ir_client_interaction, TWO_INTEGER, VALUE);
    }

    public static SubLObject set_cyc_ir_client_interaction_value(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyc_ir_client_interaction, value, TWO_INTEGER, VALUE);
    }

    public static SubLObject get_cyc_ir_client_interaction_key(final SubLObject cyc_ir_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(cyc_ir_client_interaction, ONE_INTEGER, KEY);
    }

    public static SubLObject set_cyc_ir_client_interaction_key(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyc_ir_client_interaction, value, ONE_INTEGER, KEY);
    }

    public static SubLObject get_cyc_ir_client_interaction_hitnum_attr(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), NINE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_cyc_ir_client_interaction_hitnum_attr(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), NINE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_cyc_ir_client_interaction_index_target_attr(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), EIGHT_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_cyc_ir_client_interaction_index_target_attr(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), EIGHT_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_cyc_ir_client_interaction_index_tag(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), SEVEN_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_cyc_ir_client_interaction_index_tag(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), SEVEN_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_cyc_ir_client_interaction_query_language_attr(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), SIX_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_cyc_ir_client_interaction_query_language_attr(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), SIX_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_cyc_ir_client_interaction_query_type_attr(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), FIVE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_cyc_ir_client_interaction_query_type_attr(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), FIVE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_cyc_ir_client_interaction_query_tag(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_cyc_ir_client_interaction_query_tag(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_cyc_ir_client_interaction_subl_directive_tag(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_cyc_ir_client_interaction_subl_directive_tag(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_cyc_ir_client_interaction_search_directive_tag(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_cyc_ir_client_interaction_search_directive_tag(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_cyc_ir_client_interaction_index_directive_tag(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_cyc_ir_client_interaction_index_directive_tag(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cyc_ir_client_interaction_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, INDEX_DIRECTIVE_TAG, $$$index);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, SEARCH_DIRECTIVE_TAG, $$$search);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, SUBL_DIRECTIVE_TAG, $$$SubL);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, QUERY_TAG, $$$request);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, QUERY_TYPE_ATTR, $$$type);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, QUERY_LANGUAGE_ATTR, $$$language);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, INDEX_TAG, $str44$to_index);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, INDEX_TARGET_ATTR, $$$target);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, HITNUM_ATTR, $$$hitnum);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cyc_ir_client_interaction_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, VALUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, SEARCH_STRING, NIL);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, HIT_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, ANSWER, NIL);
        return NIL;
    }

    public static SubLObject cyc_ir_client_interaction_p(final SubLObject cyc_ir_client_interaction) {
        return classes.subloop_instanceof_class(cyc_ir_client_interaction, CYC_IR_CLIENT_INTERACTION);
    }

    public static SubLObject cyc_ir_client_interaction_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        return self;
    }

    public static SubLObject cyc_ir_client_interaction_build_answer_method(final SubLObject self, final SubLObject response_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
        SubLObject v_answer = get_cyc_ir_client_interaction_answer(self);
        try {
            thread.throwStack.push($sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            try {
                SubLObject response = NIL;
                SubLObject error = NIL;
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            response = read_from_string(response_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL != error) {
                    Errors.warn(error);
                    sublisp_throw($sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
                }
                v_answer = response;
                sublisp_throw($sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cyc_ir_client_interaction_answer(self, v_answer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var2) {
            catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var2, $sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_ir_client_interaction_method;
    }

    public static SubLObject cyc_ir_client_interaction_set_key_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
        SubLObject key = get_cyc_ir_client_interaction_key(self);
        try {
            thread.throwStack.push($sym64$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            try {
                assert NIL != stringp(v_object) : "Types.stringp(v_object) " + "CommonSymbols.NIL != Types.stringp(v_object) " + v_object;
                key = v_object;
                sublisp_throw($sym64$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cyc_ir_client_interaction_key(self, key);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym64$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_ir_client_interaction_method;
    }

    public static SubLObject cyc_ir_client_interaction_set_value_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
        SubLObject value = get_cyc_ir_client_interaction_value(self);
        try {
            thread.throwStack.push($sym67$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            try {
                assert NIL != stringp(v_object) : "Types.stringp(v_object) " + "CommonSymbols.NIL != Types.stringp(v_object) " + v_object;
                value = v_object;
                sublisp_throw($sym67$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cyc_ir_client_interaction_value(self, value);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym67$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_ir_client_interaction_method;
    }

    public static SubLObject cyc_ir_client_interaction_set_search_string_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
        SubLObject search_string = get_cyc_ir_client_interaction_search_string(self);
        try {
            thread.throwStack.push($sym70$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            try {
                assert NIL != stringp(v_object) : "Types.stringp(v_object) " + "CommonSymbols.NIL != Types.stringp(v_object) " + v_object;
                search_string = v_object;
                sublisp_throw($sym70$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cyc_ir_client_interaction_search_string(self, search_string);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym70$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_ir_client_interaction_method;
    }

    public static SubLObject cyc_ir_client_interaction_set_hitnum_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
        SubLObject hit_number = get_cyc_ir_client_interaction_hit_number(self);
        try {
            thread.throwStack.push($sym73$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            try {
                assert NIL != integerp(v_object) : "Types.integerp(v_object) " + "CommonSymbols.NIL != Types.integerp(v_object) " + v_object;
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!v_object.numG(ZERO_INTEGER))) {
                    Errors.error($str74$_a_is_not_a_positive_integer, v_object);
                }
                hit_number = v_object;
                sublisp_throw($sym73$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cyc_ir_client_interaction_hit_number(self, hit_number);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym73$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_ir_client_interaction_method;
    }

    public static SubLObject cyc_ir_client_interaction_request_string_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
        final SubLObject hitnum_attr = get_cyc_ir_client_interaction_hitnum_attr(self);
        final SubLObject index_target_attr = get_cyc_ir_client_interaction_index_target_attr(self);
        final SubLObject index_tag = get_cyc_ir_client_interaction_index_tag(self);
        final SubLObject query_language_attr = get_cyc_ir_client_interaction_query_language_attr(self);
        final SubLObject query_type_attr = get_cyc_ir_client_interaction_query_type_attr(self);
        final SubLObject query_tag = get_cyc_ir_client_interaction_query_tag(self);
        final SubLObject subl_directive_tag = get_cyc_ir_client_interaction_subl_directive_tag(self);
        final SubLObject search_directive_tag = get_cyc_ir_client_interaction_search_directive_tag(self);
        final SubLObject index_directive_tag = get_cyc_ir_client_interaction_index_directive_tag(self);
        final SubLObject hit_number = get_cyc_ir_client_interaction_hit_number(self);
        final SubLObject search_string = get_cyc_ir_client_interaction_search_string(self);
        final SubLObject value = get_cyc_ir_client_interaction_value(self);
        final SubLObject key = get_cyc_ir_client_interaction_key(self);
        try {
            thread.throwStack.push($sym77$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            try {
                final SubLObject outstream = make_string_output_stream();
                final SubLObject v_xml_writer = object.new_class_instance(XML_WRITER);
                final SubLObject query_type_tag = (NIL != search_string) ? search_directive_tag : index_directive_tag;
                SubLObject attributes = list(query_type_attr, query_type_tag, query_language_attr, subl_directive_tag);
                if (NIL != search_string) {
                    attributes = cons(hit_number, attributes);
                    attributes = cons(hitnum_attr, attributes);
                }
                methods.funcall_instance_method_with_1_args(v_xml_writer, SET_STREAM, outstream);
                methods.funcall_instance_method_with_4_args(v_xml_writer, START_TAG, query_tag, attributes, NIL, NIL);
                if (NIL != search_string) {
                    methods.funcall_instance_method_with_2_args(v_xml_writer, XML_PRINT, search_string, NIL);
                } else {
                    methods.funcall_instance_method_with_4_args(v_xml_writer, START_TAG, index_tag, list(index_target_attr, key), NIL, NIL);
                    methods.funcall_instance_method_with_2_args(v_xml_writer, XML_PRINT, value, NIL);
                    methods.funcall_instance_method_with_3_args(v_xml_writer, END_TAG, index_tag, NIL, NIL);
                }
                methods.funcall_instance_method_with_3_args(v_xml_writer, END_TAG, query_tag, NIL, NIL);
                sublisp_throw($sym77$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, get_output_stream_string(outstream));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cyc_ir_client_interaction_hitnum_attr(self, hitnum_attr);
                    set_cyc_ir_client_interaction_index_target_attr(self, index_target_attr);
                    set_cyc_ir_client_interaction_index_tag(self, index_tag);
                    set_cyc_ir_client_interaction_query_language_attr(self, query_language_attr);
                    set_cyc_ir_client_interaction_query_type_attr(self, query_type_attr);
                    set_cyc_ir_client_interaction_query_tag(self, query_tag);
                    set_cyc_ir_client_interaction_subl_directive_tag(self, subl_directive_tag);
                    set_cyc_ir_client_interaction_search_directive_tag(self, search_directive_tag);
                    set_cyc_ir_client_interaction_index_directive_tag(self, index_directive_tag);
                    set_cyc_ir_client_interaction_hit_number(self, hit_number);
                    set_cyc_ir_client_interaction_search_string(self, search_string);
                    set_cyc_ir_client_interaction_value(self, value);
                    set_cyc_ir_client_interaction_key(self, key);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym77$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_ir_client_interaction_method;
    }

    public static SubLObject cyc_ir_client_interaction_get_answer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
        final SubLObject v_answer = get_cyc_ir_client_interaction_answer(self);
        try {
            thread.throwStack.push($sym85$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            try {
                sublisp_throw($sym85$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, v_answer);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cyc_ir_client_interaction_answer(self, v_answer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym85$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_ir_client_interaction_method;
    }

    public static SubLObject cyc_corpus_dump_complete_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == process_utilities.task_p($cyc_corpus_dump_task$.getDynamicValue(thread))) {
            return NIL;
        }
        final SubLObject status = process_utilities.task_completed($cyc_corpus_dump_task$.getDynamicValue(thread));
        if (NIL != status) {
            $cyc_corpus_dump_task$.setDynamicValue(NIL, thread);
        }
        return status;
    }

    public static SubLObject all_terms_indexed() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = $$$mapping_Cyc_FORTs;
        final SubLObject total = forts.fort_count();
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(message);
                SubLObject cdolist_list_var = forts.do_forts_tables();
                SubLObject table_var = NIL;
                table_var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject idx = table_var;
                    if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                        final SubLObject idx_$1 = idx;
                        if (NIL == id_index_dense_objects_empty_p(idx_$1, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$1);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject fort;
                            SubLObject error;
                            SubLObject _prev_bind_0_$2;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                fort = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(fort)) {
                                        fort = $SKIP;
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    error = NIL;
                                    try {
                                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                        _prev_bind_0_$2 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                cyc_corpus_index_term(fort);
                                            } catch (final Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$2, thread);
                                        }
                                    } catch (final Throwable ccatch_env_var) {
                                        error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                    } finally {
                                        thread.throwStack.pop();
                                    }
                                    if (NIL != error) {
                                        Errors.warn($str89$__Couldn_t_index__S, fort);
                                    }
                                }
                            }
                        }
                        final SubLObject idx_$2 = idx;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$2)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$2);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$2);
                            final SubLObject end_id = id_index_next_id(idx_$2);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject fort2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    SubLObject error2 = NIL;
                                    try {
                                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                        final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                cyc_corpus_index_term(fort2);
                                            } catch (final Throwable catch_var2) {
                                                Errors.handleThrowable(catch_var2, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$3, thread);
                                        }
                                    } catch (final Throwable ccatch_env_var2) {
                                        error2 = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                                    } finally {
                                        thread.throwStack.pop();
                                    }
                                    if (NIL != error2) {
                                        Errors.warn($str89$__Couldn_t_index__S, fort2);
                                    }
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_var = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return $DONE;
    }

    public static SubLObject all_terms_index_files_to_dir(final SubLObject corpus_dir, SubLObject module) {
        if (module == UNPROVIDED) {
            module = $int$300;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Filesys.probe_file(corpus_dir)) || (NIL == Filesys.directory_p(corpus_dir))) {
            return Errors.warn($str92$_S_is_not_an_existing_directory, corpus_dir);
        }
        SubLObject times = ZERO_INTEGER;
        final SubLObject registry = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject message = $$$mapping_Cyc_FORTs;
        final SubLObject total = forts.fort_count();
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(message);
                SubLObject cdolist_list_var = forts.do_forts_tables();
                SubLObject table_var = NIL;
                table_var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject idx = table_var;
                    if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                        final SubLObject idx_$6 = idx;
                        if (NIL == id_index_dense_objects_empty_p(idx_$6, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$6);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject v_term;
                            SubLObject error;
                            SubLObject _prev_bind_0_$7;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                v_term = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(v_term)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(v_term)) {
                                        v_term = $SKIP;
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    if (mod(times, module).numE(ZERO_INTEGER)) {
                                        Storage.gc_ephemeral();
                                    }
                                    error = NIL;
                                    try {
                                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                        _prev_bind_0_$7 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                cyc_corpus_index_term_to_file(v_term, corpus_dir, registry);
                                            } catch (final Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$7, thread);
                                        }
                                    } catch (final Throwable ccatch_env_var) {
                                        error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                    } finally {
                                        thread.throwStack.pop();
                                    }
                                    if (NIL != error) {
                                        Errors.warn($str89$__Couldn_t_index__S, v_term);
                                    }
                                    times = add(times, ONE_INTEGER);
                                }
                            }
                        }
                        final SubLObject idx_$7 = idx;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$7)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$7);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$7);
                            final SubLObject end_id = id_index_next_id(idx_$7);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject v_term2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(v_term2))) {
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    if (mod(times, module).numE(ZERO_INTEGER)) {
                                        Storage.gc_ephemeral();
                                    }
                                    SubLObject error2 = NIL;
                                    try {
                                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                        final SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                cyc_corpus_index_term_to_file(v_term2, corpus_dir, registry);
                                            } catch (final Throwable catch_var2) {
                                                Errors.handleThrowable(catch_var2, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$8, thread);
                                        }
                                    } catch (final Throwable ccatch_env_var2) {
                                        error2 = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                                    } finally {
                                        thread.throwStack.pop();
                                    }
                                    if (NIL != error2) {
                                        Errors.warn($str89$__Couldn_t_index__S, v_term2);
                                    }
                                    times = add(times, ONE_INTEGER);
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_var = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return times;
    }

    public static SubLObject create_all_terms_index_files_to_dir_task(final SubLObject corpus_dir, SubLObject module) {
        if (module == UNPROVIDED) {
            module = $int$300;
        }
        final SubLObject task_name = format(NIL, $str93$_A_corpus_dump, cyc_image_id());
        $cyc_corpus_dump_task$.setDynamicValue(process_utilities.new_task(task_name, ALL_TERMS_INDEX_FILES_TO_DIR, list(corpus_dir, module), UNPROVIDED));
        return task_name;
    }

    public static SubLObject cyc_corpus_index_term(final SubLObject v_term) {
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        final SubLObject index_key = kb_utilities.hl_external_id_string(v_term);
        final SubLObject index_value = cyc_corpus_build_index_body(v_term);
        if (!index_value.equal($str96$)) {
            return add_to_cyc_corpus_index(index_key, index_value);
        }
        return NIL;
    }

    public static SubLObject cyc_corpus_build_index_body(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        SubLObject index_body = $str96$;
        final SubLObject generations = pph_methods_lexicon.all_phrases_for_term(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject term_comment = kb_accessors.comment(v_term, UNPROVIDED);
            final SubLObject term_cyclist_notes = kb_accessors.cyclist_notes(v_term, UNPROVIDED);
            if (term_comment.isString()) {
                index_body = cconcatenate(index_body, term_comment);
            }
            SubLObject cdolist_list_var = term_cyclist_notes;
            SubLObject note = NIL;
            note = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (note.isString()) {
                    index_body = cconcatenate(index_body, new SubLObject[]{ $$$_, note });
                }
                cdolist_list_var = cdolist_list_var.rest();
                note = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var2 = generations;
        SubLObject phrase = NIL;
        phrase = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (phrase.isString()) {
                index_body = cconcatenate(index_body, new SubLObject[]{ $$$_, phrase });
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            phrase = cdolist_list_var2.first();
        } 
        index_body = string_utilities.strip_chars_meeting_test(index_body, UNPROVIDED);
        return index_body;
    }

    public static SubLObject cyc_corpus_read_hits(final SubLObject lookup_string, SubLObject number_of_hits) {
        if (number_of_hits == UNPROVIDED) {
            number_of_hits = $int$100;
        }
        final SubLObject hits_list = lookup_cyc_corpus_index(lookup_string, number_of_hits);
        SubLObject hits_forts = NIL;
        SubLObject cdolist_list_var = hits_list;
        SubLObject hit = NIL;
        hit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject id_string = (hit.isString()) ? hit : write_to_string(hit, EMPTY_SUBL_OBJECT_ARRAY);
            final SubLObject fort = (NIL != kb_utilities.hl_external_id_string_p(id_string)) ? kb_utilities.find_object_by_hl_external_id_string(id_string) : NIL;
            if (NIL != fort) {
                final SubLObject item_var = fort;
                if (NIL == member(item_var, hits_forts, symbol_function(EQL), symbol_function(IDENTITY))) {
                    hits_forts = cons(item_var, hits_forts);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            hit = cdolist_list_var.first();
        } 
        return hits_forts;
    }

    public static SubLObject truncate_and_make_unique_file_name(final SubLObject file_name, final SubLObject registry, SubLObject ceiling) {
        if (ceiling == UNPROVIDED) {
            ceiling = $int$999;
        }
        assert NIL != stringp(file_name) : "Types.stringp(file_name) " + "CommonSymbols.NIL != Types.stringp(file_name) " + file_name;
        assert NIL != dictionary.dictionary_p(registry) : "dictionary.dictionary_p(registry) " + "CommonSymbols.NIL != dictionary.dictionary_p(registry) " + registry;
        final SubLObject base = string_utilities.string_first_n($int$250, file_name);
        if (NIL == dictionary.dictionary_lookup(registry, base, UNPROVIDED)) {
            dictionary.dictionary_enter(registry, base, T);
            return base;
        }
        SubLObject done = NIL;
        SubLObject result = NIL;
        while (NIL == done) {
            final SubLObject suffix = format(NIL, $str103$_S, random.random(ceiling));
            result = cconcatenate(base, suffix);
            if (NIL == dictionary.dictionary_lookup(registry, result, UNPROVIDED)) {
                dictionary.dictionary_enter(registry, result, T);
                done = T;
            }
        } 
        return result;
    }

    public static SubLObject index_file_name_for_term(final SubLObject v_term, final SubLObject path_prefix, SubLObject registry) {
        if (registry == UNPROVIDED) {
            registry = NIL;
        }
        SubLObject filename = kb_paths.fort_name(v_term);
        final SubLObject stripped = string_utilities.strip_final_if_char(path_prefix, code_char($int$47));
        filename = string_utilities.string_substitute($str105$_, $$$_, filename, UNPROVIDED);
        filename = string_utilities.string_substitute($str105$_, $str106$_, filename, UNPROVIDED);
        filename = string_utilities.string_substitute($str105$_, $str107$_, filename, UNPROVIDED);
        filename = string_utilities.string_substitute($str105$_, $str108$_, filename, UNPROVIDED);
        filename = string_utilities.string_substitute($str109$_op_, $str110$_, filename, UNPROVIDED);
        filename = string_utilities.string_substitute($str111$_cp_, $str112$_, filename, UNPROVIDED);
        if (NIL != registry) {
            filename = truncate_and_make_unique_file_name(filename, registry, UNPROVIDED);
        }
        filename = cconcatenate(stripped, new SubLObject[]{ $str106$_, filename });
        return filename;
    }

    public static SubLObject cyc_corpus_index_term_to_file(final SubLObject v_term, final SubLObject corpus_dir, SubLObject registry) {
        if (registry == UNPROVIDED) {
            registry = NIL;
        }
        SubLObject written = NIL;
        final SubLObject index_body = cyc_corpus_build_index_body(v_term);
        final SubLObject out_file = index_file_name_for_term(v_term, corpus_dir, registry);
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(out_file, $APPEND);
            if (!stream.isStream()) {
                Errors.error($str114$Unable_to_open__S, out_file);
            }
            final SubLObject stream_$11 = stream;
            format(stream_$11, $str103$_S, kb_utilities.hl_external_id_string(v_term));
            format(stream_$11, $str115$_____S, index_body);
            written = T;
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return written;
    }

    public static SubLObject all_constants_index_files(final SubLObject corpus_dir, SubLObject module) {
        if (module == UNPROVIDED) {
            module = $int$300;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Filesys.probe_file(corpus_dir)) || (NIL == Filesys.directory_p(corpus_dir))) {
            return Errors.warn($str92$_S_is_not_an_existing_directory, corpus_dir);
        }
        SubLObject times = ZERO_INTEGER;
        final SubLObject idx = do_constants_table();
        final SubLObject mess = $$$mapping_Cyc_constants;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$12 = idx;
                if (NIL == id_index_objects_empty_p(idx_$12, $SKIP)) {
                    final SubLObject idx_$13 = idx_$12;
                    if (NIL == id_index_dense_objects_empty_p(idx_$13, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$13);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject constant;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            constant = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(constant)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(constant)) {
                                    constant = $SKIP;
                                }
                                if (mod(times, module).numE(ZERO_INTEGER)) {
                                    Storage.gc_ephemeral();
                                }
                                cyc_corpus_index_term_to_file(constant, corpus_dir, UNPROVIDED);
                                times = add(times, ONE_INTEGER);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$14 = idx_$12;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$14)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$14);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$14);
                        final SubLObject end_id = id_index_next_id(idx_$14);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject constant2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(constant2))) {
                                if (mod(times, module).numE(ZERO_INTEGER)) {
                                    Storage.gc_ephemeral();
                                }
                                cyc_corpus_index_term_to_file(constant2, corpus_dir, UNPROVIDED);
                                times = add(times, ONE_INTEGER);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return times;
    }

    public static SubLObject all_narts_index_files(final SubLObject corpus_dir, SubLObject module) {
        if (module == UNPROVIDED) {
            module = $int$300;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Filesys.probe_file(corpus_dir)) || (NIL == Filesys.directory_p(corpus_dir))) {
            return Errors.warn($str92$_S_is_not_an_existing_directory, corpus_dir);
        }
        SubLObject times = ZERO_INTEGER;
        final SubLObject registry = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = $$$mapping_Cyc_NARTs;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$16 = idx;
                if (NIL == id_index_objects_empty_p(idx_$16, $SKIP)) {
                    final SubLObject idx_$17 = idx_$16;
                    if (NIL == id_index_dense_objects_empty_p(idx_$17, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$17);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject v_term;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            v_term = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(v_term)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(v_term)) {
                                    v_term = $SKIP;
                                }
                                if (mod(times, module).numE(ZERO_INTEGER)) {
                                    Storage.gc_ephemeral();
                                }
                                cyc_corpus_index_term_to_file(v_term, corpus_dir, registry);
                                times = add(times, ONE_INTEGER);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$18 = idx_$16;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$18)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$18);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$18);
                        final SubLObject end_id = id_index_next_id(idx_$18);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject v_term2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(v_term2))) {
                                if (mod(times, module).numE(ZERO_INTEGER)) {
                                    Storage.gc_ephemeral();
                                }
                                cyc_corpus_index_term_to_file(v_term2, corpus_dir, registry);
                                times = add(times, ONE_INTEGER);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return times;
    }

    public static SubLObject all_narts_indexed() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = $$$mapping_Cyc_NARTs;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$20 = idx;
                if (NIL == id_index_objects_empty_p(idx_$20, $SKIP)) {
                    final SubLObject idx_$21 = idx_$20;
                    if (NIL == id_index_dense_objects_empty_p(idx_$21, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$21);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject cycl_nart;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            cycl_nart = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(cycl_nart)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(cycl_nart)) {
                                    cycl_nart = $SKIP;
                                }
                                cyc_corpus_index_term(cycl_nart);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$22 = idx_$20;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$22)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$22);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$22);
                        final SubLObject end_id = id_index_next_id(idx_$22);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject cycl_nart2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(cycl_nart2))) {
                                cyc_corpus_index_term(cycl_nart2);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return $DONE;
    }

    public static SubLObject declare_cyc_corpus_utilities_file() {
        declareFunction(me, "get_cyc_corpus_client", "GET-CYC-CORPUS-CLIENT", 0, 0, false);
        declareFunction(me, "reset_cyc_corpus_client", "RESET-CYC-CORPUS-CLIENT", 2, 0, false);
        declareFunction(me, "add_to_cyc_corpus_index", "ADD-TO-CYC-CORPUS-INDEX", 2, 0, false);
        declareFunction(me, "lookup_cyc_corpus_index", "LOOKUP-CYC-CORPUS-INDEX", 1, 1, false);
        declareFunction(me, "get_cyc_ir_client_interaction_answer", "GET-CYC-IR-CLIENT-INTERACTION-ANSWER", 1, 0, false);
        declareFunction(me, "set_cyc_ir_client_interaction_answer", "SET-CYC-IR-CLIENT-INTERACTION-ANSWER", 2, 0, false);
        declareFunction(me, "get_cyc_ir_client_interaction_hit_number", "GET-CYC-IR-CLIENT-INTERACTION-HIT-NUMBER", 1, 0, false);
        declareFunction(me, "set_cyc_ir_client_interaction_hit_number", "SET-CYC-IR-CLIENT-INTERACTION-HIT-NUMBER", 2, 0, false);
        declareFunction(me, "get_cyc_ir_client_interaction_search_string", "GET-CYC-IR-CLIENT-INTERACTION-SEARCH-STRING", 1, 0, false);
        declareFunction(me, "set_cyc_ir_client_interaction_search_string", "SET-CYC-IR-CLIENT-INTERACTION-SEARCH-STRING", 2, 0, false);
        declareFunction(me, "get_cyc_ir_client_interaction_value", "GET-CYC-IR-CLIENT-INTERACTION-VALUE", 1, 0, false);
        declareFunction(me, "set_cyc_ir_client_interaction_value", "SET-CYC-IR-CLIENT-INTERACTION-VALUE", 2, 0, false);
        declareFunction(me, "get_cyc_ir_client_interaction_key", "GET-CYC-IR-CLIENT-INTERACTION-KEY", 1, 0, false);
        declareFunction(me, "set_cyc_ir_client_interaction_key", "SET-CYC-IR-CLIENT-INTERACTION-KEY", 2, 0, false);
        declareFunction(me, "get_cyc_ir_client_interaction_hitnum_attr", "GET-CYC-IR-CLIENT-INTERACTION-HITNUM-ATTR", 1, 0, false);
        declareFunction(me, "set_cyc_ir_client_interaction_hitnum_attr", "SET-CYC-IR-CLIENT-INTERACTION-HITNUM-ATTR", 2, 0, false);
        declareFunction(me, "get_cyc_ir_client_interaction_index_target_attr", "GET-CYC-IR-CLIENT-INTERACTION-INDEX-TARGET-ATTR", 1, 0, false);
        declareFunction(me, "set_cyc_ir_client_interaction_index_target_attr", "SET-CYC-IR-CLIENT-INTERACTION-INDEX-TARGET-ATTR", 2, 0, false);
        declareFunction(me, "get_cyc_ir_client_interaction_index_tag", "GET-CYC-IR-CLIENT-INTERACTION-INDEX-TAG", 1, 0, false);
        declareFunction(me, "set_cyc_ir_client_interaction_index_tag", "SET-CYC-IR-CLIENT-INTERACTION-INDEX-TAG", 2, 0, false);
        declareFunction(me, "get_cyc_ir_client_interaction_query_language_attr", "GET-CYC-IR-CLIENT-INTERACTION-QUERY-LANGUAGE-ATTR", 1, 0, false);
        declareFunction(me, "set_cyc_ir_client_interaction_query_language_attr", "SET-CYC-IR-CLIENT-INTERACTION-QUERY-LANGUAGE-ATTR", 2, 0, false);
        declareFunction(me, "get_cyc_ir_client_interaction_query_type_attr", "GET-CYC-IR-CLIENT-INTERACTION-QUERY-TYPE-ATTR", 1, 0, false);
        declareFunction(me, "set_cyc_ir_client_interaction_query_type_attr", "SET-CYC-IR-CLIENT-INTERACTION-QUERY-TYPE-ATTR", 2, 0, false);
        declareFunction(me, "get_cyc_ir_client_interaction_query_tag", "GET-CYC-IR-CLIENT-INTERACTION-QUERY-TAG", 1, 0, false);
        declareFunction(me, "set_cyc_ir_client_interaction_query_tag", "SET-CYC-IR-CLIENT-INTERACTION-QUERY-TAG", 2, 0, false);
        declareFunction(me, "get_cyc_ir_client_interaction_subl_directive_tag", "GET-CYC-IR-CLIENT-INTERACTION-SUBL-DIRECTIVE-TAG", 1, 0, false);
        declareFunction(me, "set_cyc_ir_client_interaction_subl_directive_tag", "SET-CYC-IR-CLIENT-INTERACTION-SUBL-DIRECTIVE-TAG", 2, 0, false);
        declareFunction(me, "get_cyc_ir_client_interaction_search_directive_tag", "GET-CYC-IR-CLIENT-INTERACTION-SEARCH-DIRECTIVE-TAG", 1, 0, false);
        declareFunction(me, "set_cyc_ir_client_interaction_search_directive_tag", "SET-CYC-IR-CLIENT-INTERACTION-SEARCH-DIRECTIVE-TAG", 2, 0, false);
        declareFunction(me, "get_cyc_ir_client_interaction_index_directive_tag", "GET-CYC-IR-CLIENT-INTERACTION-INDEX-DIRECTIVE-TAG", 1, 0, false);
        declareFunction(me, "set_cyc_ir_client_interaction_index_directive_tag", "SET-CYC-IR-CLIENT-INTERACTION-INDEX-DIRECTIVE-TAG", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_cyc_ir_client_interaction_class", "SUBLOOP-RESERVED-INITIALIZE-CYC-IR-CLIENT-INTERACTION-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_cyc_ir_client_interaction_instance", "SUBLOOP-RESERVED-INITIALIZE-CYC-IR-CLIENT-INTERACTION-INSTANCE", 1, 0, false);
        declareFunction(me, "cyc_ir_client_interaction_p", "CYC-IR-CLIENT-INTERACTION-P", 1, 0, false);
        declareFunction(me, "cyc_ir_client_interaction_initialize_method", "CYC-IR-CLIENT-INTERACTION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "cyc_ir_client_interaction_build_answer_method", "CYC-IR-CLIENT-INTERACTION-BUILD-ANSWER-METHOD", 2, 0, false);
        declareFunction(me, "cyc_ir_client_interaction_set_key_method", "CYC-IR-CLIENT-INTERACTION-SET-KEY-METHOD", 2, 0, false);
        declareFunction(me, "cyc_ir_client_interaction_set_value_method", "CYC-IR-CLIENT-INTERACTION-SET-VALUE-METHOD", 2, 0, false);
        declareFunction(me, "cyc_ir_client_interaction_set_search_string_method", "CYC-IR-CLIENT-INTERACTION-SET-SEARCH-STRING-METHOD", 2, 0, false);
        declareFunction(me, "cyc_ir_client_interaction_set_hitnum_method", "CYC-IR-CLIENT-INTERACTION-SET-HITNUM-METHOD", 2, 0, false);
        declareFunction(me, "cyc_ir_client_interaction_request_string_method", "CYC-IR-CLIENT-INTERACTION-REQUEST-STRING-METHOD", 1, 0, false);
        declareFunction(me, "cyc_ir_client_interaction_get_answer_method", "CYC-IR-CLIENT-INTERACTION-GET-ANSWER-METHOD", 1, 0, false);
        declareFunction(me, "cyc_corpus_dump_complete_p", "CYC-CORPUS-DUMP-COMPLETE-P", 0, 0, false);
        declareFunction(me, "all_terms_indexed", "ALL-TERMS-INDEXED", 0, 0, false);
        declareFunction(me, "all_terms_index_files_to_dir", "ALL-TERMS-INDEX-FILES-TO-DIR", 1, 1, false);
        declareFunction(me, "create_all_terms_index_files_to_dir_task", "CREATE-ALL-TERMS-INDEX-FILES-TO-DIR-TASK", 1, 1, false);
        declareFunction(me, "cyc_corpus_index_term", "CYC-CORPUS-INDEX-TERM", 1, 0, false);
        declareFunction(me, "cyc_corpus_build_index_body", "CYC-CORPUS-BUILD-INDEX-BODY", 1, 0, false);
        declareFunction(me, "cyc_corpus_read_hits", "CYC-CORPUS-READ-HITS", 1, 1, false);
        declareFunction(me, "truncate_and_make_unique_file_name", "TRUNCATE-AND-MAKE-UNIQUE-FILE-NAME", 2, 1, false);
        declareFunction(me, "index_file_name_for_term", "INDEX-FILE-NAME-FOR-TERM", 2, 1, false);
        declareFunction(me, "cyc_corpus_index_term_to_file", "CYC-CORPUS-INDEX-TERM-TO-FILE", 2, 1, false);
        declareFunction(me, "all_constants_index_files", "ALL-CONSTANTS-INDEX-FILES", 1, 1, false);
        declareFunction(me, "all_narts_index_files", "ALL-NARTS-INDEX-FILES", 1, 1, false);
        declareFunction(me, "all_narts_indexed", "ALL-NARTS-INDEXED", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_cyc_corpus_utilities_file() {
        defparameter("*CYC-CORPUS-CLIENT-HOST*", red_infrastructure_macros.red_def_helper($list0.isSymbol() ? symbol_value($list0) : $list0, $cyc_corpus_client_host$, $str2$ir_cyc_com.isSymbol() ? symbol_value($str2$ir_cyc_com) : $str2$ir_cyc_com, $PARAMETER, UNPROVIDED));
        defparameter("*CYC-CORPUS-CLIENT-PORT*", red_infrastructure_macros.red_def_helper($list4.isSymbol() ? symbol_value($list4) : $list4, $cyc_corpus_client_port$, $int$6666.isSymbol() ? symbol_value($int$6666) : $int$6666, $PARAMETER, UNPROVIDED));
        defparameter("*CYC-CORPUS-CLIENT*", NIL);
        defvar("*CYC-CORPUS-DUMP-TASK*", NIL);
        return NIL;
    }

    public static SubLObject setup_cyc_corpus_utilities_file() {
        classes.subloop_new_class(CYC_IR_CLIENT_INTERACTION, OBJECT, NIL, NIL, $list24);
        classes.class_set_implements_slot_listeners(CYC_IR_CLIENT_INTERACTION, NIL);
        classes.subloop_note_class_initialization_function(CYC_IR_CLIENT_INTERACTION, SUBLOOP_RESERVED_INITIALIZE_CYC_IR_CLIENT_INTERACTION_CLASS);
        classes.subloop_note_instance_initialization_function(CYC_IR_CLIENT_INTERACTION, SUBLOOP_RESERVED_INITIALIZE_CYC_IR_CLIENT_INTERACTION_INSTANCE);
        subloop_reserved_initialize_cyc_ir_client_interaction_class(CYC_IR_CLIENT_INTERACTION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYC_IR_CLIENT_INTERACTION, $list54, NIL, $list55);
        methods.subloop_register_instance_method(CYC_IR_CLIENT_INTERACTION, INITIALIZE, CYC_IR_CLIENT_INTERACTION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(BUILD_ANSWER, CYC_IR_CLIENT_INTERACTION, $list57, $list58, $list59);
        methods.subloop_register_instance_method(CYC_IR_CLIENT_INTERACTION, BUILD_ANSWER, CYC_IR_CLIENT_INTERACTION_BUILD_ANSWER_METHOD);
        methods.methods_incorporate_instance_method(SET_KEY, CYC_IR_CLIENT_INTERACTION, $list57, $list62, $list63);
        methods.subloop_register_instance_method(CYC_IR_CLIENT_INTERACTION, SET_KEY, CYC_IR_CLIENT_INTERACTION_SET_KEY_METHOD);
        methods.methods_incorporate_instance_method(SET_VALUE, CYC_IR_CLIENT_INTERACTION, $list57, $list62, $list66);
        methods.subloop_register_instance_method(CYC_IR_CLIENT_INTERACTION, SET_VALUE, CYC_IR_CLIENT_INTERACTION_SET_VALUE_METHOD);
        methods.methods_incorporate_instance_method(SET_SEARCH_STRING, CYC_IR_CLIENT_INTERACTION, $list57, $list62, $list69);
        methods.subloop_register_instance_method(CYC_IR_CLIENT_INTERACTION, SET_SEARCH_STRING, CYC_IR_CLIENT_INTERACTION_SET_SEARCH_STRING_METHOD);
        methods.methods_incorporate_instance_method(SET_HITNUM, CYC_IR_CLIENT_INTERACTION, $list57, $list62, $list72);
        methods.subloop_register_instance_method(CYC_IR_CLIENT_INTERACTION, SET_HITNUM, CYC_IR_CLIENT_INTERACTION_SET_HITNUM_METHOD);
        methods.methods_incorporate_instance_method(REQUEST_STRING, CYC_IR_CLIENT_INTERACTION, $list57, NIL, $list76);
        methods.subloop_register_instance_method(CYC_IR_CLIENT_INTERACTION, REQUEST_STRING, CYC_IR_CLIENT_INTERACTION_REQUEST_STRING_METHOD);
        methods.methods_incorporate_instance_method(GET_ANSWER, CYC_IR_CLIENT_INTERACTION, $list57, NIL, $list84);
        methods.subloop_register_instance_method(CYC_IR_CLIENT_INTERACTION, GET_ANSWER, CYC_IR_CLIENT_INTERACTION_GET_ANSWER_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cyc_corpus_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_cyc_corpus_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cyc_corpus_utilities_file();
    }

    static {



























































































































    }
}

/**
 * Total time: 703 ms
 */
