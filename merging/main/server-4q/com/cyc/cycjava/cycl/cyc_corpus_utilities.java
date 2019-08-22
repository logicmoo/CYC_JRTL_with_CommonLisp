/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.do_constants_table;
import static com.cyc.cycjava.cycl.control_vars.cyc_image_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.code_char;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write_to_string;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CYC-CORPUS-UTILITIES
 * source file: /cyc/top/cycl/cyc-corpus-utilities.lisp
 * created:     2019/07/03 17:38:02
 */
public final class cyc_corpus_utilities extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt96$ = makeString("");

    public static final SubLFile me = new cyc_corpus_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.cyc_corpus_utilities";


    // defparameter
    @LispMethod(comment = "The only instance of the Cyc corpus IR that is expected to exist on a Cyc image\ndefparameter")
    /**
     * The only instance of the Cyc corpus IR that is expected to exist on a Cyc image
     */
    private static final SubLSymbol $cyc_corpus_client$ = makeSymbol("*CYC-CORPUS-CLIENT*");

    // defvar
    /**
     * A variable to store a background task of dumping out to files the Cyc corpus
     */
    @LispMethod(comment = "A variable to store a background task of dumping out to files the Cyc corpus\ndefvar")
    private static final SubLSymbol $cyc_corpus_dump_task$ = makeSymbol("*CYC-CORPUS-DUMP-TASK*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeString("application.cyc-ir.cyc-corpus-client-host"));

    public static final SubLSymbol $cyc_corpus_client_host$ = makeSymbol("*CYC-CORPUS-CLIENT-HOST*");

    static private final SubLString $str2$ir_cyc_com = makeString("ir.cyc.com");

    static private final SubLList $list4 = list(makeString("application.cyc-ir.cyc-corpus-client-port"));

    public static final SubLSymbol $cyc_corpus_client_port$ = makeSymbol("*CYC-CORPUS-CLIENT-PORT*");

    private static final SubLInteger $int$6666 = makeInteger(6666);

    private static final SubLSymbol TCP_CLIENT = makeSymbol("TCP-CLIENT");

    private static final SubLSymbol SET_HOST = makeSymbol("SET-HOST");

    private static final SubLSymbol SET_PORT = makeSymbol("SET-PORT");

    private static final SubLSymbol CYC_IR_CLIENT_INTERACTION = makeSymbol("CYC-IR-CLIENT-INTERACTION");

    private static final SubLSymbol SET_KEY = makeSymbol("SET-KEY");

    private static final SubLSymbol BUILD_ANSWER = makeSymbol("BUILD-ANSWER");

    private static final SubLSymbol PERFORM_REQUEST = makeSymbol("PERFORM-REQUEST");

    private static final SubLSymbol SET_SEARCH_STRING = makeSymbol("SET-SEARCH-STRING");

    private static final SubLSymbol SET_HITNUM = makeSymbol("SET-HITNUM");

    static private final SubLList $list24 = list(new SubLObject[]{ list(makeSymbol("INDEX-DIRECTIVE-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("index")), list(makeSymbol("SEARCH-DIRECTIVE-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("search")), list(makeSymbol("SUBL-DIRECTIVE-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("SubL")), list(makeSymbol("QUERY-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("request")), list(makeSymbol("QUERY-TYPE-ATTR"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("type")), list(makeSymbol("QUERY-LANGUAGE-ATTR"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("language")), list(makeSymbol("INDEX-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("to-index")), list(makeSymbol("INDEX-TARGET-ATTR"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("target")), list(makeSymbol("HITNUM-ATTR"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("hitnum")), list(makeSymbol("KEY"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("VALUE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("SEARCH-STRING"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("HIT-NUMBER"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("ANSWER"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KEY"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-VALUE"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REQUEST-STRING"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol HIT_NUMBER = makeSymbol("HIT-NUMBER");

    private static final SubLSymbol INDEX_DIRECTIVE_TAG = makeSymbol("INDEX-DIRECTIVE-TAG");

    static private final SubLString $$$index = makeString("index");

    static private final SubLString $$$search = makeString("search");

    static private final SubLString $$$SubL = makeString("SubL");

    static private final SubLString $$$request = makeString("request");

    static private final SubLString $$$type = makeString("type");

    static private final SubLString $$$language = makeString("language");

    private static final SubLSymbol INDEX_TAG = makeSymbol("INDEX-TAG");

    static private final SubLString $str44$to_index = makeString("to-index");

    private static final SubLSymbol INDEX_TARGET_ATTR = makeSymbol("INDEX-TARGET-ATTR");

    static private final SubLString $$$target = makeString("target");

    private static final SubLSymbol HITNUM_ATTR = makeSymbol("HITNUM-ATTR");

    static private final SubLString $$$hitnum = makeString("hitnum");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYC_IR_CLIENT_INTERACTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-IR-CLIENT-INTERACTION-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYC_IR_CLIENT_INTERACTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-IR-CLIENT-INTERACTION-INSTANCE");

    static private final SubLList $list54 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list55 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYC_IR_CLIENT_INTERACTION_INITIALIZE_METHOD = makeSymbol("CYC-IR-CLIENT-INTERACTION-INITIALIZE-METHOD");

    static private final SubLList $list57 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list58 = list(makeSymbol("RESPONSE-STRING"));

    static private final SubLList $list59 = list(list(makeSymbol("CLET"), list(makeSymbol("RESPONSE"), makeSymbol("ERROR")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")), list(makeSymbol("CSETQ"), makeSymbol("RESPONSE"), list(makeSymbol("READ-FROM-STRING"), makeSymbol("RESPONSE-STRING")))), list(makeSymbol("PWHEN"), makeSymbol("ERROR"), list(makeSymbol("WARN"), makeSymbol("ERROR")), list(RET, makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("ANSWER"), makeSymbol("RESPONSE")), list(RET, makeSymbol("SELF"))));

    static private final SubLSymbol $sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD");

    private static final SubLSymbol CYC_IR_CLIENT_INTERACTION_BUILD_ANSWER_METHOD = makeSymbol("CYC-IR-CLIENT-INTERACTION-BUILD-ANSWER-METHOD");

    static private final SubLList $list62 = list(makeSymbol("OBJECT"));

    static private final SubLList $list63 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("STRINGP")), list(makeSymbol("CSETQ"), makeSymbol("KEY"), makeSymbol("OBJECT")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym64$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD");

    private static final SubLSymbol CYC_IR_CLIENT_INTERACTION_SET_KEY_METHOD = makeSymbol("CYC-IR-CLIENT-INTERACTION-SET-KEY-METHOD");

    static private final SubLList $list66 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("STRINGP")), list(makeSymbol("CSETQ"), makeSymbol("VALUE"), makeSymbol("OBJECT")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym67$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD");

    private static final SubLSymbol CYC_IR_CLIENT_INTERACTION_SET_VALUE_METHOD = makeSymbol("CYC-IR-CLIENT-INTERACTION-SET-VALUE-METHOD");

    static private final SubLList $list69 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("STRINGP")), list(makeSymbol("CSETQ"), makeSymbol("SEARCH-STRING"), makeSymbol("OBJECT")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym70$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD");

    private static final SubLSymbol CYC_IR_CLIENT_INTERACTION_SET_SEARCH_STRING_METHOD = makeSymbol("CYC-IR-CLIENT-INTERACTION-SET-SEARCH-STRING-METHOD");

    static private final SubLList $list72 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("INTEGERP")), list(makeSymbol("MUST"), list(makeSymbol(">"), makeSymbol("OBJECT"), ZERO_INTEGER), makeString("~a is not a positive integer"), makeSymbol("OBJECT")), list(makeSymbol("CSETQ"), makeSymbol("HIT-NUMBER"), makeSymbol("OBJECT")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym73$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD");

    static private final SubLString $str74$_a_is_not_a_positive_integer = makeString("~a is not a positive integer");

    private static final SubLSymbol CYC_IR_CLIENT_INTERACTION_SET_HITNUM_METHOD = makeSymbol("CYC-IR-CLIENT-INTERACTION-SET-HITNUM-METHOD");

    static private final SubLList $list76 = list(list(makeSymbol("CLET"), list(list(makeSymbol("OUTSTREAM"), list(makeSymbol("MAKE-STRING-OUTPUT-STREAM"))), list(makeSymbol("XML-WRITER"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("XML-WRITER")))), list(makeSymbol("QUERY-TYPE-TAG"), list(makeSymbol("FIF"), makeSymbol("SEARCH-STRING"), makeSymbol("SEARCH-DIRECTIVE-TAG"), makeSymbol("INDEX-DIRECTIVE-TAG"))), list(makeSymbol("ATTRIBUTES"), list(makeSymbol("BQ-LIST"), makeSymbol("QUERY-TYPE-ATTR"), makeSymbol("QUERY-TYPE-TAG"), makeSymbol("QUERY-LANGUAGE-ATTR"), makeSymbol("SUBL-DIRECTIVE-TAG")))), list(makeSymbol("PWHEN"), makeSymbol("SEARCH-STRING"), list(makeSymbol("CPUSH"), makeSymbol("HIT-NUMBER"), makeSymbol("ATTRIBUTES")), list(makeSymbol("CPUSH"), makeSymbol("HITNUM-ATTR"), makeSymbol("ATTRIBUTES"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("XML-WRITER"), list(QUOTE, makeSymbol("SET-STREAM")), makeSymbol("OUTSTREAM")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("XML-WRITER"), list(QUOTE, makeSymbol("START-TAG")), makeSymbol("QUERY-TAG"), makeSymbol("ATTRIBUTES"), NIL, NIL), list(makeSymbol("PCOND"), list(makeSymbol("SEARCH-STRING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("XML-WRITER"), list(QUOTE, makeSymbol("XML-PRINT")), makeSymbol("SEARCH-STRING"), NIL)), list(T, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("XML-WRITER"), list(QUOTE, makeSymbol("START-TAG")), makeSymbol("INDEX-TAG"), list(makeSymbol("BQ-LIST"), makeSymbol("INDEX-TARGET-ATTR"), makeSymbol("KEY")), NIL, NIL), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("XML-WRITER"), list(QUOTE, makeSymbol("XML-PRINT")), makeSymbol("VALUE"), NIL), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("XML-WRITER"), list(QUOTE, makeSymbol("END-TAG")), makeSymbol("INDEX-TAG"), NIL, NIL))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("XML-WRITER"), list(QUOTE, makeSymbol("END-TAG")), makeSymbol("QUERY-TAG"), NIL, NIL), list(RET, list(makeSymbol("GET-OUTPUT-STREAM-STRING"), makeSymbol("OUTSTREAM")))));

    static private final SubLSymbol $sym77$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD");

    private static final SubLSymbol CYC_IR_CLIENT_INTERACTION_REQUEST_STRING_METHOD = makeSymbol("CYC-IR-CLIENT-INTERACTION-REQUEST-STRING-METHOD");

    static private final SubLList $list84 = list(list(RET, makeSymbol("ANSWER")));

    static private final SubLSymbol $sym85$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYC-IR-CLIENT-INTERACTION-METHOD");

    private static final SubLSymbol CYC_IR_CLIENT_INTERACTION_GET_ANSWER_METHOD = makeSymbol("CYC-IR-CLIENT-INTERACTION-GET-ANSWER-METHOD");

    static private final SubLString $$$mapping_Cyc_FORTs = makeString("mapping Cyc FORTs");

    static private final SubLString $str89$__Couldn_t_index__S = makeString("~%Couldn't index ~S");

    private static final SubLInteger $int$300 = makeInteger(300);

    static private final SubLString $str92$_S_is_not_an_existing_directory = makeString("~S is not an existing directory");

    static private final SubLString $str93$_A_corpus_dump = makeString("~A-corpus-dump");

    private static final SubLSymbol ALL_TERMS_INDEX_FILES_TO_DIR = makeSymbol("ALL-TERMS-INDEX-FILES-TO-DIR");

    static private final SubLString $str96$ = makeString("");



    static private final SubLString $$$_ = makeString(" ");

    private static final SubLInteger $int$999 = makeInteger(999);

    private static final SubLInteger $int$250 = makeInteger(250);

    static private final SubLString $str103$_S = makeString("~S");



    static private final SubLString $str105$_ = makeString("_");

    static private final SubLString $str106$_ = makeString("/");

    static private final SubLString $str107$_ = makeString(";");

    static private final SubLString $str108$_ = makeString(":");

    static private final SubLString $str109$_op_ = makeString("_op_");

    static private final SubLString $str110$_ = makeString("(");

    static private final SubLString $str111$_cp_ = makeString("_cp_");

    static private final SubLString $str112$_ = makeString(")");

    static private final SubLString $str114$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str115$_____S = makeString("~%~%~S");

    static private final SubLString $$$mapping_Cyc_constants = makeString("mapping Cyc constants");

    static private final SubLString $$$mapping_Cyc_NARTs = makeString("mapping Cyc NARTs");

    /**
     *
     *
     * @return tcp-client-p, a TCP client that can talk to the Cyc corpus IR engine
     */
    @LispMethod(comment = "@return tcp-client-p, a TCP client that can talk to the Cyc corpus IR engine")
    public static final SubLObject get_cyc_corpus_client_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $cyc_corpus_client$.getDynamicValue(thread)) {
                if ($cyc_corpus_client_host$.getDynamicValue(thread).isString() && $cyc_corpus_client_port$.getDynamicValue(thread).isInteger()) {
                    $cyc_corpus_client$.setDynamicValue(object.new_class_instance(TCP_CLIENT), thread);
                    methods.funcall_instance_method_with_1_args($cyc_corpus_client$.getDynamicValue(thread), SET_HOST, $cyc_corpus_client_host$.getDynamicValue(thread));
                    methods.funcall_instance_method_with_1_args($cyc_corpus_client$.getDynamicValue(thread), SET_PORT, $cyc_corpus_client_port$.getDynamicValue(thread));
                }
            }
            return $cyc_corpus_client$.getDynamicValue(thread);
        }
    }

    /**
     *
     *
     * @return tcp-client-p, a TCP client that can talk to the Cyc corpus IR engine
     */
    @LispMethod(comment = "@return tcp-client-p, a TCP client that can talk to the Cyc corpus IR engine")
    public static SubLObject get_cyc_corpus_client() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == cyc_corpus_utilities.$cyc_corpus_client$.getDynamicValue(thread)) && cyc_corpus_utilities.$cyc_corpus_client_host$.getDynamicValue(thread).isString()) && cyc_corpus_utilities.$cyc_corpus_client_port$.getDynamicValue(thread).isInteger()) {
            cyc_corpus_utilities.$cyc_corpus_client$.setDynamicValue(object.new_class_instance(cyc_corpus_utilities.TCP_CLIENT), thread);
            methods.funcall_instance_method_with_1_args(cyc_corpus_utilities.$cyc_corpus_client$.getDynamicValue(thread), cyc_corpus_utilities.SET_HOST, cyc_corpus_utilities.$cyc_corpus_client_host$.getDynamicValue(thread));
            methods.funcall_instance_method_with_1_args(cyc_corpus_utilities.$cyc_corpus_client$.getDynamicValue(thread), cyc_corpus_utilities.SET_PORT, cyc_corpus_utilities.$cyc_corpus_client_port$.getDynamicValue(thread));
        }
        return cyc_corpus_utilities.$cyc_corpus_client$.getDynamicValue(thread);
    }

    public static final SubLObject reset_cyc_corpus_client_alt(SubLObject host, SubLObject port) {
        SubLTrampolineFile.checkType(host, STRINGP);
        SubLTrampolineFile.checkType(port, INTEGERP);
        $cyc_corpus_client$.setDynamicValue(NIL);
        $cyc_corpus_client_host$.setDynamicValue(host);
        $cyc_corpus_client_port$.setDynamicValue(port);
        return T;
    }

    public static SubLObject reset_cyc_corpus_client(final SubLObject host, final SubLObject port) {
        assert NIL != stringp(host) : "! stringp(host) " + ("Types.stringp(host) " + "CommonSymbols.NIL != Types.stringp(host) ") + host;
        assert NIL != integerp(port) : "! integerp(port) " + ("Types.integerp(port) " + "CommonSymbols.NIL != Types.integerp(port) ") + port;
        cyc_corpus_utilities.$cyc_corpus_client$.setDynamicValue(NIL);
        cyc_corpus_utilities.$cyc_corpus_client_host$.setDynamicValue(host);
        cyc_corpus_utilities.$cyc_corpus_client_port$.setDynamicValue(port);
        return T;
    }

    /**
     *
     *
     * @param KEY
     * 		stringp; the string representation of a Cyc object which we wish
     * 		to add to the Cyc corpus index
     * @param VALUE
     * 		stringp; a string containing terms under which we wish to index
     * 		the Cyc object;
     * @return boolean; T if the key-value pair was successfully added to the
    Cyc corpus index, NIL otherwise
     * @unknown (add-to-cyc-corpus-index '#$Bertolo' 'the Italian guy') => T
    means that if from this point forward you hit the Cyc corpus IR engine
    with the query 'guy' or 'Italian' you should be able to retrieve the
    constant #$Bertolo
     * @unknown bertolo
     */
    @LispMethod(comment = "@param KEY\r\n\t\tstringp; the string representation of a Cyc object which we wish\r\n\t\tto add to the Cyc corpus index\r\n@param VALUE\r\n\t\tstringp; a string containing terms under which we wish to index\r\n\t\tthe Cyc object;\r\n@return boolean; T if the key-value pair was successfully added to the\r\nCyc corpus index, NIL otherwise\r\n@unknown (add-to-cyc-corpus-index \'#$Bertolo\' \'the Italian guy\') => T\r\nmeans that if from this point forward you hit the Cyc corpus IR engine\r\nwith the query \'guy\' or \'Italian\' you should be able to retrieve the\r\nconstant #$Bertolo\r\n@unknown bertolo")
    public static final SubLObject add_to_cyc_corpus_index_alt(SubLObject key, SubLObject value) {
        {
            SubLObject interaction = object.new_class_instance(CYC_IR_CLIENT_INTERACTION);
            SubLObject result = NIL;
            SubLObject error = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            methods.funcall_instance_method_with_1_args(interaction, SET_KEY, key);
                            methods.funcall_instance_method_with_1_args(interaction, SET_VALUE, value);
                            methods.funcall_instance_method_with_1_args(interaction, BUILD_ANSWER, methods.funcall_instance_method_with_1_args(com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_corpus_client(), PERFORM_REQUEST, methods.funcall_instance_method_with_0_args(interaction, REQUEST_STRING)));
                            result = methods.funcall_instance_method_with_0_args(interaction, GET_ANSWER);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if ((NIL != error) && (NIL != com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_corpus_client())) {
            }
            return result;
        }
    }

    /**
     *
     *
     * @param KEY
     * 		stringp; the string representation of a Cyc object which we wish
     * 		to add to the Cyc corpus index
     * @param VALUE
     * 		stringp; a string containing terms under which we wish to index
     * 		the Cyc object;
     * @return boolean; T if the key-value pair was successfully added to the
    Cyc corpus index, NIL otherwise
     * @unknown (add-to-cyc-corpus-index '#$Bertolo' 'the Italian guy') => T
    means that if from this point forward you hit the Cyc corpus IR engine
    with the query 'guy' or 'Italian' you should be able to retrieve the
    constant #$Bertolo
     * @unknown bertolo
     */
    @LispMethod(comment = "@param KEY\r\n\t\tstringp; the string representation of a Cyc object which we wish\r\n\t\tto add to the Cyc corpus index\r\n@param VALUE\r\n\t\tstringp; a string containing terms under which we wish to index\r\n\t\tthe Cyc object;\r\n@return boolean; T if the key-value pair was successfully added to the\r\nCyc corpus index, NIL otherwise\r\n@unknown (add-to-cyc-corpus-index \'#$Bertolo\' \'the Italian guy\') => T\r\nmeans that if from this point forward you hit the Cyc corpus IR engine\r\nwith the query \'guy\' or \'Italian\' you should be able to retrieve the\r\nconstant #$Bertolo\r\n@unknown bertolo")
    public static SubLObject add_to_cyc_corpus_index(final SubLObject key, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interaction = object.new_class_instance(cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION);
        SubLObject result = NIL;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    methods.funcall_instance_method_with_1_args(interaction, cyc_corpus_utilities.SET_KEY, key);
                    methods.funcall_instance_method_with_1_args(interaction, SET_VALUE, value);
                    methods.funcall_instance_method_with_1_args(interaction, cyc_corpus_utilities.BUILD_ANSWER, methods.funcall_instance_method_with_1_args(cyc_corpus_utilities.get_cyc_corpus_client(), cyc_corpus_utilities.PERFORM_REQUEST, methods.funcall_instance_method_with_0_args(interaction, REQUEST_STRING)));
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
        if ((NIL == error) || (NIL != cyc_corpus_utilities.get_cyc_corpus_client())) {
        }
        return result;
    }

    /**
     *
     *
     * @param STRING-TO-LOOKUP
     * 		stringp; a query string
     * @param NUMBER-OF-HITS
     * 		integerp; the total number of hits we want to receive
     * 		for this query, if available
     * @return listp; a list of CycL objects that were found indexed under STRING-TO-LOOKUP
    in the Cyc corpus IR engine.
     * @unknown (lookup-cyc-corpus-index 'Italian guy') => (#$Bertolo #$PLMiraglia)
    indicates that the two constants #$Bertolo and #$PLMiraglia were indexed under the
    string 'Italian guy'
     */
    @LispMethod(comment = "@param STRING-TO-LOOKUP\r\n\t\tstringp; a query string\r\n@param NUMBER-OF-HITS\r\n\t\tintegerp; the total number of hits we want to receive\r\n\t\tfor this query, if available\r\n@return listp; a list of CycL objects that were found indexed under STRING-TO-LOOKUP\r\nin the Cyc corpus IR engine.\r\n@unknown (lookup-cyc-corpus-index \'Italian guy\') => (#$Bertolo #$PLMiraglia)\r\nindicates that the two constants #$Bertolo and #$PLMiraglia were indexed under the\r\nstring \'Italian guy\'")
    public static final SubLObject lookup_cyc_corpus_index_alt(SubLObject string_to_look_up, SubLObject number_of_hits) {
        if (number_of_hits == UNPROVIDED) {
            number_of_hits = $int$100;
        }
        {
            SubLObject interaction = object.new_class_instance(CYC_IR_CLIENT_INTERACTION);
            SubLObject results = NIL;
            SubLObject error = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            methods.funcall_instance_method_with_1_args(interaction, SET_SEARCH_STRING, string_to_look_up);
                            methods.funcall_instance_method_with_1_args(interaction, SET_HITNUM, number_of_hits);
                            methods.funcall_instance_method_with_1_args(interaction, BUILD_ANSWER, methods.funcall_instance_method_with_1_args(com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_corpus_client(), PERFORM_REQUEST, methods.funcall_instance_method_with_0_args(interaction, REQUEST_STRING)));
                            results = methods.funcall_instance_method_with_0_args(interaction, GET_ANSWER);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if ((NIL != error) && (NIL != com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_corpus_client())) {
            }
            return results;
        }
    }

    /**
     *
     *
     * @param STRING-TO-LOOKUP
     * 		stringp; a query string
     * @param NUMBER-OF-HITS
     * 		integerp; the total number of hits we want to receive
     * 		for this query, if available
     * @return listp; a list of CycL objects that were found indexed under STRING-TO-LOOKUP
    in the Cyc corpus IR engine.
     * @unknown (lookup-cyc-corpus-index 'Italian guy') => (#$Bertolo #$PLMiraglia)
    indicates that the two constants #$Bertolo and #$PLMiraglia were indexed under the
    string 'Italian guy'
     */
    @LispMethod(comment = "@param STRING-TO-LOOKUP\r\n\t\tstringp; a query string\r\n@param NUMBER-OF-HITS\r\n\t\tintegerp; the total number of hits we want to receive\r\n\t\tfor this query, if available\r\n@return listp; a list of CycL objects that were found indexed under STRING-TO-LOOKUP\r\nin the Cyc corpus IR engine.\r\n@unknown (lookup-cyc-corpus-index \'Italian guy\') => (#$Bertolo #$PLMiraglia)\r\nindicates that the two constants #$Bertolo and #$PLMiraglia were indexed under the\r\nstring \'Italian guy\'")
    public static SubLObject lookup_cyc_corpus_index(final SubLObject string_to_look_up, SubLObject number_of_hits) {
        if (number_of_hits == UNPROVIDED) {
            number_of_hits = $int$100;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interaction = object.new_class_instance(cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION);
        SubLObject results = NIL;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    methods.funcall_instance_method_with_1_args(interaction, cyc_corpus_utilities.SET_SEARCH_STRING, string_to_look_up);
                    methods.funcall_instance_method_with_1_args(interaction, cyc_corpus_utilities.SET_HITNUM, number_of_hits);
                    methods.funcall_instance_method_with_1_args(interaction, cyc_corpus_utilities.BUILD_ANSWER, methods.funcall_instance_method_with_1_args(cyc_corpus_utilities.get_cyc_corpus_client(), cyc_corpus_utilities.PERFORM_REQUEST, methods.funcall_instance_method_with_0_args(interaction, REQUEST_STRING)));
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
        if ((NIL == error) || (NIL != cyc_corpus_utilities.get_cyc_corpus_client())) {
        }
        return results;
    }

    public static final SubLObject get_cyc_ir_client_interaction_answer_alt(SubLObject cyc_ir_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(cyc_ir_client_interaction, FIVE_INTEGER, ANSWER);
    }

    public static SubLObject get_cyc_ir_client_interaction_answer(final SubLObject cyc_ir_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(cyc_ir_client_interaction, FIVE_INTEGER, ANSWER);
    }

    public static final SubLObject set_cyc_ir_client_interaction_answer_alt(SubLObject cyc_ir_client_interaction, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyc_ir_client_interaction, value, FIVE_INTEGER, ANSWER);
    }

    public static SubLObject set_cyc_ir_client_interaction_answer(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyc_ir_client_interaction, value, FIVE_INTEGER, ANSWER);
    }

    public static final SubLObject get_cyc_ir_client_interaction_hit_number_alt(SubLObject cyc_ir_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(cyc_ir_client_interaction, FOUR_INTEGER, HIT_NUMBER);
    }

    public static SubLObject get_cyc_ir_client_interaction_hit_number(final SubLObject cyc_ir_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(cyc_ir_client_interaction, FOUR_INTEGER, cyc_corpus_utilities.HIT_NUMBER);
    }

    public static final SubLObject set_cyc_ir_client_interaction_hit_number_alt(SubLObject cyc_ir_client_interaction, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyc_ir_client_interaction, value, FOUR_INTEGER, HIT_NUMBER);
    }

    public static SubLObject set_cyc_ir_client_interaction_hit_number(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyc_ir_client_interaction, value, FOUR_INTEGER, cyc_corpus_utilities.HIT_NUMBER);
    }

    public static final SubLObject get_cyc_ir_client_interaction_search_string_alt(SubLObject cyc_ir_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(cyc_ir_client_interaction, THREE_INTEGER, SEARCH_STRING);
    }

    public static SubLObject get_cyc_ir_client_interaction_search_string(final SubLObject cyc_ir_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(cyc_ir_client_interaction, THREE_INTEGER, SEARCH_STRING);
    }

    public static final SubLObject set_cyc_ir_client_interaction_search_string_alt(SubLObject cyc_ir_client_interaction, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyc_ir_client_interaction, value, THREE_INTEGER, SEARCH_STRING);
    }

    public static SubLObject set_cyc_ir_client_interaction_search_string(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyc_ir_client_interaction, value, THREE_INTEGER, SEARCH_STRING);
    }

    public static final SubLObject get_cyc_ir_client_interaction_value_alt(SubLObject cyc_ir_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(cyc_ir_client_interaction, TWO_INTEGER, VALUE);
    }

    public static SubLObject get_cyc_ir_client_interaction_value(final SubLObject cyc_ir_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(cyc_ir_client_interaction, TWO_INTEGER, VALUE);
    }

    public static final SubLObject set_cyc_ir_client_interaction_value_alt(SubLObject cyc_ir_client_interaction, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyc_ir_client_interaction, value, TWO_INTEGER, VALUE);
    }

    public static SubLObject set_cyc_ir_client_interaction_value(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyc_ir_client_interaction, value, TWO_INTEGER, VALUE);
    }

    public static final SubLObject get_cyc_ir_client_interaction_key_alt(SubLObject cyc_ir_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(cyc_ir_client_interaction, ONE_INTEGER, KEY);
    }

    public static SubLObject get_cyc_ir_client_interaction_key(final SubLObject cyc_ir_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(cyc_ir_client_interaction, ONE_INTEGER, KEY);
    }

    public static final SubLObject set_cyc_ir_client_interaction_key_alt(SubLObject cyc_ir_client_interaction, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyc_ir_client_interaction, value, ONE_INTEGER, KEY);
    }

    public static SubLObject set_cyc_ir_client_interaction_key(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyc_ir_client_interaction, value, ONE_INTEGER, KEY);
    }

    public static final SubLObject get_cyc_ir_client_interaction_hitnum_attr_alt(SubLObject cyc_ir_client_interaction) {
        {
            SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyc_ir_client_interaction))) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? ((SubLObject) (cyc_ir_client_interaction)) : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? ((SubLObject) (subloop_structures.instance_class(cyc_ir_client_interaction))) : NIL;
            if (NIL != v_class) {
                return aref(subloop_structures.class_any_slots(v_class), NINE_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_cyc_ir_client_interaction_hitnum_attr(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), NINE_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_cyc_ir_client_interaction_hitnum_attr_alt(SubLObject cyc_ir_client_interaction, SubLObject value) {
        {
            SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyc_ir_client_interaction))) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? ((SubLObject) (cyc_ir_client_interaction)) : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? ((SubLObject) (subloop_structures.instance_class(cyc_ir_client_interaction))) : NIL;
            if (NIL != v_class) {
                return set_aref(subloop_structures.class_any_slots(v_class), NINE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_cyc_ir_client_interaction_hitnum_attr(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), NINE_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject get_cyc_ir_client_interaction_index_target_attr_alt(SubLObject cyc_ir_client_interaction) {
        {
            SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyc_ir_client_interaction))) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? ((SubLObject) (cyc_ir_client_interaction)) : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? ((SubLObject) (subloop_structures.instance_class(cyc_ir_client_interaction))) : NIL;
            if (NIL != v_class) {
                return aref(subloop_structures.class_any_slots(v_class), EIGHT_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_cyc_ir_client_interaction_index_target_attr(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), EIGHT_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_cyc_ir_client_interaction_index_target_attr_alt(SubLObject cyc_ir_client_interaction, SubLObject value) {
        {
            SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyc_ir_client_interaction))) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? ((SubLObject) (cyc_ir_client_interaction)) : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? ((SubLObject) (subloop_structures.instance_class(cyc_ir_client_interaction))) : NIL;
            if (NIL != v_class) {
                return set_aref(subloop_structures.class_any_slots(v_class), EIGHT_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_cyc_ir_client_interaction_index_target_attr(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), EIGHT_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject get_cyc_ir_client_interaction_index_tag_alt(SubLObject cyc_ir_client_interaction) {
        {
            SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyc_ir_client_interaction))) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? ((SubLObject) (cyc_ir_client_interaction)) : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? ((SubLObject) (subloop_structures.instance_class(cyc_ir_client_interaction))) : NIL;
            if (NIL != v_class) {
                return aref(subloop_structures.class_any_slots(v_class), SEVEN_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_cyc_ir_client_interaction_index_tag(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), SEVEN_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_cyc_ir_client_interaction_index_tag_alt(SubLObject cyc_ir_client_interaction, SubLObject value) {
        {
            SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyc_ir_client_interaction))) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? ((SubLObject) (cyc_ir_client_interaction)) : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? ((SubLObject) (subloop_structures.instance_class(cyc_ir_client_interaction))) : NIL;
            if (NIL != v_class) {
                return set_aref(subloop_structures.class_any_slots(v_class), SEVEN_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_cyc_ir_client_interaction_index_tag(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), SEVEN_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject get_cyc_ir_client_interaction_query_language_attr_alt(SubLObject cyc_ir_client_interaction) {
        {
            SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyc_ir_client_interaction))) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? ((SubLObject) (cyc_ir_client_interaction)) : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? ((SubLObject) (subloop_structures.instance_class(cyc_ir_client_interaction))) : NIL;
            if (NIL != v_class) {
                return aref(subloop_structures.class_any_slots(v_class), SIX_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_cyc_ir_client_interaction_query_language_attr(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), SIX_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_cyc_ir_client_interaction_query_language_attr_alt(SubLObject cyc_ir_client_interaction, SubLObject value) {
        {
            SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyc_ir_client_interaction))) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? ((SubLObject) (cyc_ir_client_interaction)) : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? ((SubLObject) (subloop_structures.instance_class(cyc_ir_client_interaction))) : NIL;
            if (NIL != v_class) {
                return set_aref(subloop_structures.class_any_slots(v_class), SIX_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_cyc_ir_client_interaction_query_language_attr(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), SIX_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject get_cyc_ir_client_interaction_query_type_attr_alt(SubLObject cyc_ir_client_interaction) {
        {
            SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyc_ir_client_interaction))) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? ((SubLObject) (cyc_ir_client_interaction)) : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? ((SubLObject) (subloop_structures.instance_class(cyc_ir_client_interaction))) : NIL;
            if (NIL != v_class) {
                return aref(subloop_structures.class_any_slots(v_class), FIVE_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_cyc_ir_client_interaction_query_type_attr(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), FIVE_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_cyc_ir_client_interaction_query_type_attr_alt(SubLObject cyc_ir_client_interaction, SubLObject value) {
        {
            SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyc_ir_client_interaction))) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? ((SubLObject) (cyc_ir_client_interaction)) : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? ((SubLObject) (subloop_structures.instance_class(cyc_ir_client_interaction))) : NIL;
            if (NIL != v_class) {
                return set_aref(subloop_structures.class_any_slots(v_class), FIVE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_cyc_ir_client_interaction_query_type_attr(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), FIVE_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject get_cyc_ir_client_interaction_query_tag_alt(SubLObject cyc_ir_client_interaction) {
        {
            SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyc_ir_client_interaction))) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? ((SubLObject) (cyc_ir_client_interaction)) : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? ((SubLObject) (subloop_structures.instance_class(cyc_ir_client_interaction))) : NIL;
            if (NIL != v_class) {
                return aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_cyc_ir_client_interaction_query_tag(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_cyc_ir_client_interaction_query_tag_alt(SubLObject cyc_ir_client_interaction, SubLObject value) {
        {
            SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyc_ir_client_interaction))) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? ((SubLObject) (cyc_ir_client_interaction)) : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? ((SubLObject) (subloop_structures.instance_class(cyc_ir_client_interaction))) : NIL;
            if (NIL != v_class) {
                return set_aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_cyc_ir_client_interaction_query_tag(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject get_cyc_ir_client_interaction_subl_directive_tag_alt(SubLObject cyc_ir_client_interaction) {
        {
            SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyc_ir_client_interaction))) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? ((SubLObject) (cyc_ir_client_interaction)) : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? ((SubLObject) (subloop_structures.instance_class(cyc_ir_client_interaction))) : NIL;
            if (NIL != v_class) {
                return aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_cyc_ir_client_interaction_subl_directive_tag(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_cyc_ir_client_interaction_subl_directive_tag_alt(SubLObject cyc_ir_client_interaction, SubLObject value) {
        {
            SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyc_ir_client_interaction))) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? ((SubLObject) (cyc_ir_client_interaction)) : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? ((SubLObject) (subloop_structures.instance_class(cyc_ir_client_interaction))) : NIL;
            if (NIL != v_class) {
                return set_aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_cyc_ir_client_interaction_subl_directive_tag(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject get_cyc_ir_client_interaction_search_directive_tag_alt(SubLObject cyc_ir_client_interaction) {
        {
            SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyc_ir_client_interaction))) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? ((SubLObject) (cyc_ir_client_interaction)) : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? ((SubLObject) (subloop_structures.instance_class(cyc_ir_client_interaction))) : NIL;
            if (NIL != v_class) {
                return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_cyc_ir_client_interaction_search_directive_tag(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_cyc_ir_client_interaction_search_directive_tag_alt(SubLObject cyc_ir_client_interaction, SubLObject value) {
        {
            SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyc_ir_client_interaction))) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? ((SubLObject) (cyc_ir_client_interaction)) : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? ((SubLObject) (subloop_structures.instance_class(cyc_ir_client_interaction))) : NIL;
            if (NIL != v_class) {
                return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_cyc_ir_client_interaction_search_directive_tag(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject get_cyc_ir_client_interaction_index_directive_tag_alt(SubLObject cyc_ir_client_interaction) {
        {
            SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyc_ir_client_interaction))) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? ((SubLObject) (cyc_ir_client_interaction)) : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? ((SubLObject) (subloop_structures.instance_class(cyc_ir_client_interaction))) : NIL;
            if (NIL != v_class) {
                return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_cyc_ir_client_interaction_index_directive_tag(final SubLObject cyc_ir_client_interaction) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_cyc_ir_client_interaction_index_directive_tag_alt(SubLObject cyc_ir_client_interaction, SubLObject value) {
        {
            SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyc_ir_client_interaction))) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? ((SubLObject) (cyc_ir_client_interaction)) : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? ((SubLObject) (subloop_structures.instance_class(cyc_ir_client_interaction))) : NIL;
            if (NIL != v_class) {
                return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_cyc_ir_client_interaction_index_directive_tag(final SubLObject cyc_ir_client_interaction, final SubLObject value) {
        final SubLObject v_class = (cyc_ir_client_interaction.isSymbol()) ? classes.classes_retrieve_class(cyc_ir_client_interaction) : NIL != subloop_structures.class_p(cyc_ir_client_interaction) ? cyc_ir_client_interaction : NIL != subloop_structures.instance_p(cyc_ir_client_interaction) ? subloop_structures.instance_class(cyc_ir_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyc_ir_client_interaction_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, INDEX_DIRECTIVE_TAG, $$$index);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, SEARCH_DIRECTIVE_TAG, $$$search);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, SUBL_DIRECTIVE_TAG, $$$SubL);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, QUERY_TAG, $$$request);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, QUERY_TYPE_ATTR, $$$type);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, QUERY_LANGUAGE_ATTR, $$$language);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, INDEX_TAG, $str_alt44$to_index);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, INDEX_TARGET_ATTR, $$$target);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, HITNUM_ATTR, $$$hitnum);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cyc_ir_client_interaction_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, cyc_corpus_utilities.INDEX_DIRECTIVE_TAG, cyc_corpus_utilities.$$$index);
        classes.subloop_initialize_slot(new_instance, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, SEARCH_DIRECTIVE_TAG, cyc_corpus_utilities.$$$search);
        classes.subloop_initialize_slot(new_instance, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, SUBL_DIRECTIVE_TAG, cyc_corpus_utilities.$$$SubL);
        classes.subloop_initialize_slot(new_instance, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, QUERY_TAG, cyc_corpus_utilities.$$$request);
        classes.subloop_initialize_slot(new_instance, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, QUERY_TYPE_ATTR, cyc_corpus_utilities.$$$type);
        classes.subloop_initialize_slot(new_instance, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, QUERY_LANGUAGE_ATTR, cyc_corpus_utilities.$$$language);
        classes.subloop_initialize_slot(new_instance, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, cyc_corpus_utilities.INDEX_TAG, cyc_corpus_utilities.$str44$to_index);
        classes.subloop_initialize_slot(new_instance, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, cyc_corpus_utilities.INDEX_TARGET_ATTR, cyc_corpus_utilities.$$$target);
        classes.subloop_initialize_slot(new_instance, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, cyc_corpus_utilities.HITNUM_ATTR, cyc_corpus_utilities.$$$hitnum);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyc_ir_client_interaction_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, VALUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, SEARCH_STRING, NIL);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, HIT_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYC_IR_CLIENT_INTERACTION, ANSWER, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cyc_ir_client_interaction_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, KEY, NIL);
        classes.subloop_initialize_slot(new_instance, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, VALUE, NIL);
        classes.subloop_initialize_slot(new_instance, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, SEARCH_STRING, NIL);
        classes.subloop_initialize_slot(new_instance, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, cyc_corpus_utilities.HIT_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, ANSWER, NIL);
        return NIL;
    }

    public static final SubLObject cyc_ir_client_interaction_p_alt(SubLObject cyc_ir_client_interaction) {
        return classes.subloop_instanceof_class(cyc_ir_client_interaction, CYC_IR_CLIENT_INTERACTION);
    }

    public static SubLObject cyc_ir_client_interaction_p(final SubLObject cyc_ir_client_interaction) {
        return classes.subloop_instanceof_class(cyc_ir_client_interaction, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION);
    }

    public static final SubLObject cyc_ir_client_interaction_initialize_method_alt(SubLObject self) {
        object.object_initialize_method(self);
        return self;
    }

    public static SubLObject cyc_ir_client_interaction_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        return self;
    }

    public static final SubLObject cyc_ir_client_interaction_build_answer_method_alt(SubLObject self, SubLObject response_string) {
        {
            SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
            SubLObject v_answer = com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_ir_client_interaction_answer(self);
            try {
                try {
                    {
                        SubLObject response = NIL;
                        SubLObject error = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                                try {
                                    bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                    try {
                                        response = read_from_string(response_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    rebind(Errors.$error_handler$, _prev_bind_0);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                        }
                        if (NIL != error) {
                            Errors.warn(error);
                            sublisp_throw($sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
                        }
                        v_answer = response;
                        sublisp_throw($sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.cyc_corpus_utilities.set_cyc_ir_client_interaction_answer(self, v_answer);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            }
            return catch_var_for_cyc_ir_client_interaction_method;
        }
    }

    public static SubLObject cyc_ir_client_interaction_build_answer_method(final SubLObject self, final SubLObject response_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
        SubLObject v_answer = cyc_corpus_utilities.get_cyc_ir_client_interaction_answer(self);
        try {
            thread.throwStack.push(cyc_corpus_utilities.$sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
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
                    sublisp_throw(cyc_corpus_utilities.$sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
                }
                v_answer = response;
                sublisp_throw(cyc_corpus_utilities.$sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    cyc_corpus_utilities.set_cyc_ir_client_interaction_answer(self, v_answer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var2) {
            catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var2, cyc_corpus_utilities.$sym60$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_ir_client_interaction_method;
    }

    public static final SubLObject cyc_ir_client_interaction_set_key_method_alt(SubLObject self, SubLObject v_object) {
        {
            SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
            SubLObject key = com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_ir_client_interaction_key(self);
            try {
                try {
                    SubLTrampolineFile.checkType(v_object, STRINGP);
                    key = v_object;
                    sublisp_throw($sym64$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.cyc_corpus_utilities.set_cyc_ir_client_interaction_key(self, key);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym64$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            }
            return catch_var_for_cyc_ir_client_interaction_method;
        }
    }

    public static SubLObject cyc_ir_client_interaction_set_key_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
        SubLObject key = cyc_corpus_utilities.get_cyc_ir_client_interaction_key(self);
        try {
            thread.throwStack.push(cyc_corpus_utilities.$sym64$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            try {
                assert NIL != stringp(v_object) : "! stringp(v_object) " + "Types.stringp error :" + v_object;
                key = v_object;
                sublisp_throw(cyc_corpus_utilities.$sym64$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    cyc_corpus_utilities.set_cyc_ir_client_interaction_key(self, key);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, cyc_corpus_utilities.$sym64$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_ir_client_interaction_method;
    }

    public static final SubLObject cyc_ir_client_interaction_set_value_method_alt(SubLObject self, SubLObject v_object) {
        {
            SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
            SubLObject value = com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_ir_client_interaction_value(self);
            try {
                try {
                    SubLTrampolineFile.checkType(v_object, STRINGP);
                    value = v_object;
                    sublisp_throw($sym67$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.cyc_corpus_utilities.set_cyc_ir_client_interaction_value(self, value);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym67$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            }
            return catch_var_for_cyc_ir_client_interaction_method;
        }
    }

    public static SubLObject cyc_ir_client_interaction_set_value_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
        SubLObject value = cyc_corpus_utilities.get_cyc_ir_client_interaction_value(self);
        try {
            thread.throwStack.push(cyc_corpus_utilities.$sym67$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            try {
                assert NIL != stringp(v_object) : "! stringp(v_object) " + "Types.stringp error :" + v_object;
                value = v_object;
                sublisp_throw(cyc_corpus_utilities.$sym67$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    cyc_corpus_utilities.set_cyc_ir_client_interaction_value(self, value);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, cyc_corpus_utilities.$sym67$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_ir_client_interaction_method;
    }

    public static final SubLObject cyc_ir_client_interaction_set_search_string_method_alt(SubLObject self, SubLObject v_object) {
        {
            SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
            SubLObject search_string = com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_ir_client_interaction_search_string(self);
            try {
                try {
                    SubLTrampolineFile.checkType(v_object, STRINGP);
                    search_string = v_object;
                    sublisp_throw($sym70$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.cyc_corpus_utilities.set_cyc_ir_client_interaction_search_string(self, search_string);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym70$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            }
            return catch_var_for_cyc_ir_client_interaction_method;
        }
    }

    public static SubLObject cyc_ir_client_interaction_set_search_string_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
        SubLObject search_string = cyc_corpus_utilities.get_cyc_ir_client_interaction_search_string(self);
        try {
            thread.throwStack.push(cyc_corpus_utilities.$sym70$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            try {
                assert NIL != stringp(v_object) : "! stringp(v_object) " + "Types.stringp error :" + v_object;
                search_string = v_object;
                sublisp_throw(cyc_corpus_utilities.$sym70$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    cyc_corpus_utilities.set_cyc_ir_client_interaction_search_string(self, search_string);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, cyc_corpus_utilities.$sym70$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_ir_client_interaction_method;
    }

    public static final SubLObject cyc_ir_client_interaction_set_hitnum_method_alt(SubLObject self, SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
                SubLObject hit_number = com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_ir_client_interaction_hit_number(self);
                try {
                    try {
                        SubLTrampolineFile.checkType(v_object, INTEGERP);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!v_object.numG(ZERO_INTEGER)) {
                                Errors.error($str_alt74$_a_is_not_a_positive_integer, v_object);
                            }
                        }
                        hit_number = v_object;
                        sublisp_throw($sym73$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.cyc_corpus_utilities.set_cyc_ir_client_interaction_hit_number(self, hit_number);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym73$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
                }
                return catch_var_for_cyc_ir_client_interaction_method;
            }
        }
    }

    public static SubLObject cyc_ir_client_interaction_set_hitnum_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
        SubLObject hit_number = cyc_corpus_utilities.get_cyc_ir_client_interaction_hit_number(self);
        try {
            thread.throwStack.push(cyc_corpus_utilities.$sym73$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            try {
                assert NIL != integerp(v_object) : "! integerp(v_object) " + "Types.integerp error :" + v_object;
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!v_object.numG(ZERO_INTEGER))) {
                    Errors.error(cyc_corpus_utilities.$str74$_a_is_not_a_positive_integer, v_object);
                }
                hit_number = v_object;
                sublisp_throw(cyc_corpus_utilities.$sym73$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    cyc_corpus_utilities.set_cyc_ir_client_interaction_hit_number(self, hit_number);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, cyc_corpus_utilities.$sym73$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_ir_client_interaction_method;
    }

    public static final SubLObject cyc_ir_client_interaction_request_string_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
            SubLObject hitnum_attr = com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_ir_client_interaction_hitnum_attr(self);
            SubLObject index_target_attr = com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_ir_client_interaction_index_target_attr(self);
            SubLObject index_tag = com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_ir_client_interaction_index_tag(self);
            SubLObject query_language_attr = com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_ir_client_interaction_query_language_attr(self);
            SubLObject query_type_attr = com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_ir_client_interaction_query_type_attr(self);
            SubLObject query_tag = com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_ir_client_interaction_query_tag(self);
            SubLObject subl_directive_tag = com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_ir_client_interaction_subl_directive_tag(self);
            SubLObject search_directive_tag = com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_ir_client_interaction_search_directive_tag(self);
            SubLObject index_directive_tag = com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_ir_client_interaction_index_directive_tag(self);
            SubLObject hit_number = com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_ir_client_interaction_hit_number(self);
            SubLObject search_string = com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_ir_client_interaction_search_string(self);
            SubLObject value = com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_ir_client_interaction_value(self);
            SubLObject key = com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_ir_client_interaction_key(self);
            try {
                try {
                    {
                        SubLObject outstream = make_string_output_stream();
                        SubLObject v_xml_writer = object.new_class_instance(XML_WRITER);
                        SubLObject query_type_tag = (NIL != search_string) ? ((SubLObject) (search_directive_tag)) : index_directive_tag;
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
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.cyc_corpus_utilities.set_cyc_ir_client_interaction_hitnum_attr(self, hitnum_attr);
                            com.cyc.cycjava.cycl.cyc_corpus_utilities.set_cyc_ir_client_interaction_index_target_attr(self, index_target_attr);
                            com.cyc.cycjava.cycl.cyc_corpus_utilities.set_cyc_ir_client_interaction_index_tag(self, index_tag);
                            com.cyc.cycjava.cycl.cyc_corpus_utilities.set_cyc_ir_client_interaction_query_language_attr(self, query_language_attr);
                            com.cyc.cycjava.cycl.cyc_corpus_utilities.set_cyc_ir_client_interaction_query_type_attr(self, query_type_attr);
                            com.cyc.cycjava.cycl.cyc_corpus_utilities.set_cyc_ir_client_interaction_query_tag(self, query_tag);
                            com.cyc.cycjava.cycl.cyc_corpus_utilities.set_cyc_ir_client_interaction_subl_directive_tag(self, subl_directive_tag);
                            com.cyc.cycjava.cycl.cyc_corpus_utilities.set_cyc_ir_client_interaction_search_directive_tag(self, search_directive_tag);
                            com.cyc.cycjava.cycl.cyc_corpus_utilities.set_cyc_ir_client_interaction_index_directive_tag(self, index_directive_tag);
                            com.cyc.cycjava.cycl.cyc_corpus_utilities.set_cyc_ir_client_interaction_hit_number(self, hit_number);
                            com.cyc.cycjava.cycl.cyc_corpus_utilities.set_cyc_ir_client_interaction_search_string(self, search_string);
                            com.cyc.cycjava.cycl.cyc_corpus_utilities.set_cyc_ir_client_interaction_value(self, value);
                            com.cyc.cycjava.cycl.cyc_corpus_utilities.set_cyc_ir_client_interaction_key(self, key);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym77$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            }
            return catch_var_for_cyc_ir_client_interaction_method;
        }
    }

    public static SubLObject cyc_ir_client_interaction_request_string_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
        final SubLObject hitnum_attr = cyc_corpus_utilities.get_cyc_ir_client_interaction_hitnum_attr(self);
        final SubLObject index_target_attr = cyc_corpus_utilities.get_cyc_ir_client_interaction_index_target_attr(self);
        final SubLObject index_tag = cyc_corpus_utilities.get_cyc_ir_client_interaction_index_tag(self);
        final SubLObject query_language_attr = cyc_corpus_utilities.get_cyc_ir_client_interaction_query_language_attr(self);
        final SubLObject query_type_attr = cyc_corpus_utilities.get_cyc_ir_client_interaction_query_type_attr(self);
        final SubLObject query_tag = cyc_corpus_utilities.get_cyc_ir_client_interaction_query_tag(self);
        final SubLObject subl_directive_tag = cyc_corpus_utilities.get_cyc_ir_client_interaction_subl_directive_tag(self);
        final SubLObject search_directive_tag = cyc_corpus_utilities.get_cyc_ir_client_interaction_search_directive_tag(self);
        final SubLObject index_directive_tag = cyc_corpus_utilities.get_cyc_ir_client_interaction_index_directive_tag(self);
        final SubLObject hit_number = cyc_corpus_utilities.get_cyc_ir_client_interaction_hit_number(self);
        final SubLObject search_string = cyc_corpus_utilities.get_cyc_ir_client_interaction_search_string(self);
        final SubLObject value = cyc_corpus_utilities.get_cyc_ir_client_interaction_value(self);
        final SubLObject key = cyc_corpus_utilities.get_cyc_ir_client_interaction_key(self);
        try {
            thread.throwStack.push(cyc_corpus_utilities.$sym77$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
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
                sublisp_throw(cyc_corpus_utilities.$sym77$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, get_output_stream_string(outstream));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    cyc_corpus_utilities.set_cyc_ir_client_interaction_hitnum_attr(self, hitnum_attr);
                    cyc_corpus_utilities.set_cyc_ir_client_interaction_index_target_attr(self, index_target_attr);
                    cyc_corpus_utilities.set_cyc_ir_client_interaction_index_tag(self, index_tag);
                    cyc_corpus_utilities.set_cyc_ir_client_interaction_query_language_attr(self, query_language_attr);
                    cyc_corpus_utilities.set_cyc_ir_client_interaction_query_type_attr(self, query_type_attr);
                    cyc_corpus_utilities.set_cyc_ir_client_interaction_query_tag(self, query_tag);
                    cyc_corpus_utilities.set_cyc_ir_client_interaction_subl_directive_tag(self, subl_directive_tag);
                    cyc_corpus_utilities.set_cyc_ir_client_interaction_search_directive_tag(self, search_directive_tag);
                    cyc_corpus_utilities.set_cyc_ir_client_interaction_index_directive_tag(self, index_directive_tag);
                    cyc_corpus_utilities.set_cyc_ir_client_interaction_hit_number(self, hit_number);
                    cyc_corpus_utilities.set_cyc_ir_client_interaction_search_string(self, search_string);
                    cyc_corpus_utilities.set_cyc_ir_client_interaction_value(self, value);
                    cyc_corpus_utilities.set_cyc_ir_client_interaction_key(self, key);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, cyc_corpus_utilities.$sym77$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_ir_client_interaction_method;
    }

    public static final SubLObject cyc_ir_client_interaction_get_answer_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
            SubLObject v_answer = com.cyc.cycjava.cycl.cyc_corpus_utilities.get_cyc_ir_client_interaction_answer(self);
            try {
                try {
                    sublisp_throw($sym85$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, v_answer);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.cyc_corpus_utilities.set_cyc_ir_client_interaction_answer(self, v_answer);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym85$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            }
            return catch_var_for_cyc_ir_client_interaction_method;
        }
    }

    public static SubLObject cyc_ir_client_interaction_get_answer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_ir_client_interaction_method = NIL;
        final SubLObject v_answer = cyc_corpus_utilities.get_cyc_ir_client_interaction_answer(self);
        try {
            thread.throwStack.push(cyc_corpus_utilities.$sym85$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
            try {
                sublisp_throw(cyc_corpus_utilities.$sym85$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD, v_answer);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    cyc_corpus_utilities.set_cyc_ir_client_interaction_answer(self, v_answer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyc_ir_client_interaction_method = Errors.handleThrowable(ccatch_env_var, cyc_corpus_utilities.$sym85$OUTER_CATCH_FOR_CYC_IR_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_ir_client_interaction_method;
    }

    /**
     *
     *
     * @unknown boolean; T iff this image has completed its task of dumping out to files
    the Cyc corpus as initiated by its companion function create-all-terms-index-files-to-dir-task
     */
    @LispMethod(comment = "@unknown boolean; T iff this image has completed its task of dumping out to files\r\nthe Cyc corpus as initiated by its companion function create-all-terms-index-files-to-dir-task")
    public static final SubLObject cyc_corpus_dump_complete_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == process_utilities.task_p($cyc_corpus_dump_task$.getDynamicValue(thread))) {
                return NIL;
            }
            {
                SubLObject status = process_utilities.task_completed($cyc_corpus_dump_task$.getDynamicValue(thread));
                if (NIL != status) {
                    $cyc_corpus_dump_task$.setDynamicValue(NIL, thread);
                }
                return status;
            }
        }
    }

    /**
     *
     *
     * @unknown boolean; T iff this image has completed its task of dumping out to files
    the Cyc corpus as initiated by its companion function create-all-terms-index-files-to-dir-task
     */
    @LispMethod(comment = "@unknown boolean; T iff this image has completed its task of dumping out to files\r\nthe Cyc corpus as initiated by its companion function create-all-terms-index-files-to-dir-task")
    public static SubLObject cyc_corpus_dump_complete_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == process_utilities.task_p(cyc_corpus_utilities.$cyc_corpus_dump_task$.getDynamicValue(thread))) {
            return NIL;
        }
        final SubLObject status = process_utilities.task_completed(cyc_corpus_utilities.$cyc_corpus_dump_task$.getDynamicValue(thread));
        if (NIL != status) {
            cyc_corpus_utilities.$cyc_corpus_dump_task$.setDynamicValue(NIL, thread);
        }
        return status;
    }

    /**
     *
     *
     * @return keyword: build corpus index for all forts by submitting indexing
    requests directly to the information retrieval engine, i.e., without
    first writing out indexable contents to a file.
     */
    @LispMethod(comment = "@return keyword: build corpus index for all forts by submitting indexing\r\nrequests directly to the information retrieval engine, i.e., without\r\nfirst writing out indexable contents to a file.")
    public static final SubLObject all_terms_indexed_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject message = $$$mapping_Cyc_FORTs;
                SubLObject total = forts.fort_count();
                SubLObject sofar = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble(message);
                        {
                            SubLObject cdolist_list_var = forts.do_forts_tables();
                            SubLObject table_var = NIL;
                            for (table_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , table_var = cdolist_list_var.first()) {
                                if (NIL == do_id_index_empty_p(table_var, $SKIP)) {
                                    {
                                        SubLObject id = do_id_index_next_id(table_var, T, NIL, NIL);
                                        SubLObject state_var = do_id_index_next_state(table_var, T, id, NIL);
                                        SubLObject fort = NIL;
                                        while (NIL != id) {
                                            fort = do_id_index_state_object(table_var, $SKIP, id, state_var);
                                            if (NIL != do_id_index_id_and_object_validP(id, fort, $SKIP)) {
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                                {
                                                    SubLObject error = NIL;
                                                    try {
                                                        {
                                                            SubLObject _prev_bind_0_1 = Errors.$error_handler$.currentBinding(thread);
                                                            try {
                                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                                try {
                                                                    com.cyc.cycjava.cycl.cyc_corpus_utilities.cyc_corpus_index_term(fort);
                                                                } catch (Throwable catch_var) {
                                                                    Errors.handleThrowable(catch_var, NIL);
                                                                }
                                                            } finally {
                                                                Errors.$error_handler$.rebind(_prev_bind_0_1, thread);
                                                            }
                                                        }
                                                    } catch (Throwable ccatch_env_var) {
                                                        error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                                    }
                                                    if (NIL != error) {
                                                        Errors.warn($str_alt89$__Couldn_t_index__S, fort);
                                                    }
                                                }
                                            }
                                            id = do_id_index_next_id(table_var, T, id, state_var);
                                            state_var = do_id_index_next_state(table_var, T, id, state_var);
                                        } 
                                    }
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return $DONE;
        }
    }

    /**
     *
     *
     * @return keyword: build corpus index for all forts by submitting indexing
    requests directly to the information retrieval engine, i.e., without
    first writing out indexable contents to a file.
     */
    @LispMethod(comment = "@return keyword: build corpus index for all forts by submitting indexing\r\nrequests directly to the information retrieval engine, i.e., without\r\nfirst writing out indexable contents to a file.")
    public static SubLObject all_terms_indexed() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = cyc_corpus_utilities.$$$mapping_Cyc_FORTs;
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
                                                cyc_corpus_utilities.cyc_corpus_index_term(fort);
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
                                        Errors.warn(cyc_corpus_utilities.$str89$__Couldn_t_index__S, fort);
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
                                                cyc_corpus_utilities.cyc_corpus_index_term(fort2);
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
                                        Errors.warn(cyc_corpus_utilities.$str89$__Couldn_t_index__S, fort2);
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

    /**
     *
     *
     * @return integerp: build corpus of files to index for all forts,
    returns the number of forts for which a file has been written. CORPUS-DIR
    must be the name of an existing directory.
     */
    @LispMethod(comment = "@return integerp: build corpus of files to index for all forts,\r\nreturns the number of forts for which a file has been written. CORPUS-DIR\r\nmust be the name of an existing directory.")
    public static final SubLObject all_terms_index_files_to_dir_alt(SubLObject corpus_dir, SubLObject module) {
        if (module == UNPROVIDED) {
            module = $int$300;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != Filesys.probe_file(corpus_dir)) && (NIL != Filesys.directory_p(corpus_dir)))) {
                return Errors.warn($str_alt92$_S_is_not_an_existing_directory, corpus_dir);
            }
            {
                SubLObject times = ZERO_INTEGER;
                SubLObject registry = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                SubLObject message = $$$mapping_Cyc_FORTs;
                SubLObject total = forts.fort_count();
                SubLObject sofar = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble(message);
                        {
                            SubLObject cdolist_list_var = forts.do_forts_tables();
                            SubLObject table_var = NIL;
                            for (table_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , table_var = cdolist_list_var.first()) {
                                if (NIL == do_id_index_empty_p(table_var, $SKIP)) {
                                    {
                                        SubLObject id = do_id_index_next_id(table_var, T, NIL, NIL);
                                        SubLObject state_var = do_id_index_next_state(table_var, T, id, NIL);
                                        SubLObject v_term = NIL;
                                        while (NIL != id) {
                                            v_term = do_id_index_state_object(table_var, $SKIP, id, state_var);
                                            if (NIL != do_id_index_id_and_object_validP(id, v_term, $SKIP)) {
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                                if (mod(times, module).numE(ZERO_INTEGER)) {
                                                    Storage.gc_ephemeral();
                                                }
                                                {
                                                    SubLObject error = NIL;
                                                    try {
                                                        {
                                                            SubLObject _prev_bind_0_2 = Errors.$error_handler$.currentBinding(thread);
                                                            try {
                                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                                try {
                                                                    com.cyc.cycjava.cycl.cyc_corpus_utilities.cyc_corpus_index_term_to_file(v_term, corpus_dir, registry);
                                                                } catch (Throwable catch_var) {
                                                                    Errors.handleThrowable(catch_var, NIL);
                                                                }
                                                            } finally {
                                                                Errors.$error_handler$.rebind(_prev_bind_0_2, thread);
                                                            }
                                                        }
                                                    } catch (Throwable ccatch_env_var) {
                                                        error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                                    }
                                                    if (NIL != error) {
                                                        Errors.warn($str_alt89$__Couldn_t_index__S, v_term);
                                                    }
                                                }
                                                times = add(times, ONE_INTEGER);
                                            }
                                            id = do_id_index_next_id(table_var, T, id, state_var);
                                            state_var = do_id_index_next_state(table_var, T, id, state_var);
                                        } 
                                    }
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return times;
            }
        }
    }

    /**
     *
     *
     * @return integerp: build corpus of files to index for all forts,
    returns the number of forts for which a file has been written. CORPUS-DIR
    must be the name of an existing directory.
     */
    @LispMethod(comment = "@return integerp: build corpus of files to index for all forts,\r\nreturns the number of forts for which a file has been written. CORPUS-DIR\r\nmust be the name of an existing directory.")
    public static SubLObject all_terms_index_files_to_dir(final SubLObject corpus_dir, SubLObject module) {
        if (module == UNPROVIDED) {
            module = cyc_corpus_utilities.$int$300;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Filesys.probe_file(corpus_dir)) || (NIL == Filesys.directory_p(corpus_dir))) {
            return Errors.warn(cyc_corpus_utilities.$str92$_S_is_not_an_existing_directory, corpus_dir);
        }
        SubLObject times = ZERO_INTEGER;
        final SubLObject registry = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject message = cyc_corpus_utilities.$$$mapping_Cyc_FORTs;
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
                                                cyc_corpus_utilities.cyc_corpus_index_term_to_file(v_term, corpus_dir, registry);
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
                                        Errors.warn(cyc_corpus_utilities.$str89$__Couldn_t_index__S, v_term);
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
                                                cyc_corpus_utilities.cyc_corpus_index_term_to_file(v_term2, corpus_dir, registry);
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
                                        Errors.warn(cyc_corpus_utilities.$str89$__Couldn_t_index__S, v_term2);
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

    /**
     *
     *
     * @param CORPUS-DIR
     * 		stringp; the directory in which the files for each term
     * 		will be written.
     * @param MODULE
     * 		integerp; the size of term batches that this process will
     * 		use to determine when to garbage collect.
     * @return stringp; the name of this process.
    This function is useful for those situation in which one wants to cause
    a Cyc corpus dump but doesn't necessarily want to wait around for the dump
    to be over (it may take several hours). One can then use its companion
    function cyc-corpus-dump-complete-p to check if the dump is over.
     */
    @LispMethod(comment = "@param CORPUS-DIR\r\n\t\tstringp; the directory in which the files for each term\r\n\t\twill be written.\r\n@param MODULE\r\n\t\tintegerp; the size of term batches that this process will\r\n\t\tuse to determine when to garbage collect.\r\n@return stringp; the name of this process.\r\nThis function is useful for those situation in which one wants to cause\r\na Cyc corpus dump but doesn\'t necessarily want to wait around for the dump\r\nto be over (it may take several hours). One can then use its companion\r\nfunction cyc-corpus-dump-complete-p to check if the dump is over.")
    public static final SubLObject create_all_terms_index_files_to_dir_task_alt(SubLObject corpus_dir, SubLObject module) {
        if (module == UNPROVIDED) {
            module = $int$300;
        }
        {
            SubLObject task_name = format(NIL, $str_alt93$_A_corpus_dump, cyc_image_id());
            $cyc_corpus_dump_task$.setDynamicValue(process_utilities.new_task(task_name, ALL_TERMS_INDEX_FILES_TO_DIR, list(corpus_dir, module), UNPROVIDED));
            return task_name;
        }
    }

    /**
     *
     *
     * @param CORPUS-DIR
     * 		stringp; the directory in which the files for each term
     * 		will be written.
     * @param MODULE
     * 		integerp; the size of term batches that this process will
     * 		use to determine when to garbage collect.
     * @return stringp; the name of this process.
    This function is useful for those situation in which one wants to cause
    a Cyc corpus dump but doesn't necessarily want to wait around for the dump
    to be over (it may take several hours). One can then use its companion
    function cyc-corpus-dump-complete-p to check if the dump is over.
     */
    @LispMethod(comment = "@param CORPUS-DIR\r\n\t\tstringp; the directory in which the files for each term\r\n\t\twill be written.\r\n@param MODULE\r\n\t\tintegerp; the size of term batches that this process will\r\n\t\tuse to determine when to garbage collect.\r\n@return stringp; the name of this process.\r\nThis function is useful for those situation in which one wants to cause\r\na Cyc corpus dump but doesn\'t necessarily want to wait around for the dump\r\nto be over (it may take several hours). One can then use its companion\r\nfunction cyc-corpus-dump-complete-p to check if the dump is over.")
    public static SubLObject create_all_terms_index_files_to_dir_task(final SubLObject corpus_dir, SubLObject module) {
        if (module == UNPROVIDED) {
            module = cyc_corpus_utilities.$int$300;
        }
        final SubLObject task_name = format(NIL, cyc_corpus_utilities.$str93$_A_corpus_dump, cyc_image_id());
        cyc_corpus_utilities.$cyc_corpus_dump_task$.setDynamicValue(process_utilities.new_task(task_name, cyc_corpus_utilities.ALL_TERMS_INDEX_FILES_TO_DIR, list(corpus_dir, module), UNPROVIDED));
        return task_name;
    }

    /**
     *
     *
     * @return boolean; T if the key-value pair was successfully added to the
    Cyc corpus index, NIL otherwise
     */
    @LispMethod(comment = "@return boolean; T if the key-value pair was successfully added to the\r\nCyc corpus index, NIL otherwise")
    public static final SubLObject cyc_corpus_index_term_alt(SubLObject v_term) {
        SubLTrampolineFile.checkType(v_term, FORT_P);
        {
            SubLObject index_key = kb_utilities.hl_external_id_string(v_term);
            SubLObject index_value = com.cyc.cycjava.cycl.cyc_corpus_utilities.cyc_corpus_build_index_body(v_term);
            if (!index_value.equal($str_alt96$)) {
                return com.cyc.cycjava.cycl.cyc_corpus_utilities.add_to_cyc_corpus_index(index_key, index_value);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; T if the key-value pair was successfully added to the
    Cyc corpus index, NIL otherwise
     */
    @LispMethod(comment = "@return boolean; T if the key-value pair was successfully added to the\r\nCyc corpus index, NIL otherwise")
    public static SubLObject cyc_corpus_index_term(final SubLObject v_term) {
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        final SubLObject index_key = kb_utilities.hl_external_id_string(v_term);
        final SubLObject index_value = cyc_corpus_utilities.cyc_corpus_build_index_body(v_term);
        if (!index_value.equal(cyc_corpus_utilities.$str96$)) {
            return cyc_corpus_utilities.add_to_cyc_corpus_index(index_key, index_value);
        }
        return NIL;
    }

    /**
     *
     *
     * @return stringp: (possibly empty) a set of words which is the union of the comment,
    cyclistNotes and generated phrases for <term>
     */
    @LispMethod(comment = "@return stringp: (possibly empty) a set of words which is the union of the comment,\r\ncyclistNotes and generated phrases for <term>")
    public static final SubLObject cyc_corpus_build_index_body_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_term, FORT_P);
            {
                SubLObject index_body = $str_alt96$;
                SubLObject generations = pph_methods_lexicon.all_phrases_for_term(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject term_comment = kb_accessors.comment(v_term, UNPROVIDED);
                            SubLObject term_cyclist_notes = kb_accessors.cyclist_notes(v_term, UNPROVIDED);
                            if (term_comment.isString()) {
                                index_body = cconcatenate(index_body, term_comment);
                            }
                            {
                                SubLObject cdolist_list_var = term_cyclist_notes;
                                SubLObject note = NIL;
                                for (note = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , note = cdolist_list_var.first()) {
                                    if (note.isString()) {
                                        index_body = cconcatenate(index_body, new SubLObject[]{ $str_alt99$_, note });
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = generations;
                    SubLObject phrase = NIL;
                    for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                        if (phrase.isString()) {
                            index_body = cconcatenate(index_body, new SubLObject[]{ $str_alt99$_, phrase });
                        }
                    }
                }
                index_body = string_utilities.strip_chars_meeting_test(index_body, UNPROVIDED);
                return index_body;
            }
        }
    }

    /**
     *
     *
     * @return stringp: (possibly empty) a set of words which is the union of the comment,
    cyclistNotes and generated phrases for <term>
     */
    @LispMethod(comment = "@return stringp: (possibly empty) a set of words which is the union of the comment,\r\ncyclistNotes and generated phrases for <term>")
    public static SubLObject cyc_corpus_build_index_body(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        SubLObject index_body = cyc_corpus_utilities.$str96$;
        final SubLObject generations = pph_methods_lexicon.all_phrases_for_term(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(cyc_corpus_utilities.$$EverythingPSC, thread);
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
                    index_body = cconcatenate(index_body, new SubLObject[]{ cyc_corpus_utilities.$$$_, note });
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
                index_body = cconcatenate(index_body, new SubLObject[]{ cyc_corpus_utilities.$$$_, phrase });
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            phrase = cdolist_list_var2.first();
        } 
        index_body = string_utilities.strip_chars_meeting_test(index_body, UNPROVIDED);
        return index_body;
    }

    /**
     *
     *
     * @return listp: a list of forts each of which has an index files
    containing (some of) the words in LOOKUP-STRING. The length of the list is less
    than or equal to NUMBER-OF-HITS.
     */
    @LispMethod(comment = "@return listp: a list of forts each of which has an index files\r\ncontaining (some of) the words in LOOKUP-STRING. The length of the list is less\r\nthan or equal to NUMBER-OF-HITS.")
    public static final SubLObject cyc_corpus_read_hits_alt(SubLObject lookup_string, SubLObject number_of_hits) {
        if (number_of_hits == UNPROVIDED) {
            number_of_hits = $int$100;
        }
        {
            SubLObject hits_list = com.cyc.cycjava.cycl.cyc_corpus_utilities.lookup_cyc_corpus_index(lookup_string, number_of_hits);
            SubLObject hits_forts = NIL;
            SubLObject cdolist_list_var = hits_list;
            SubLObject hit = NIL;
            for (hit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hit = cdolist_list_var.first()) {
                {
                    SubLObject id_string = (hit.isString()) ? ((SubLObject) (hit)) : write_to_string(hit, EMPTY_SUBL_OBJECT_ARRAY);
                    SubLObject fort = (NIL != kb_utilities.hl_external_id_string_p(id_string)) ? ((SubLObject) (kb_utilities.find_object_by_hl_external_id_string(id_string))) : NIL;
                    if (NIL != fort) {
                        {
                            SubLObject item_var = fort;
                            if (NIL == member(item_var, hits_forts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                hits_forts = cons(item_var, hits_forts);
                            }
                        }
                    }
                }
            }
            return hits_forts;
        }
    }

    /**
     *
     *
     * @return listp: a list of forts each of which has an index files
    containing (some of) the words in LOOKUP-STRING. The length of the list is less
    than or equal to NUMBER-OF-HITS.
     */
    @LispMethod(comment = "@return listp: a list of forts each of which has an index files\r\ncontaining (some of) the words in LOOKUP-STRING. The length of the list is less\r\nthan or equal to NUMBER-OF-HITS.")
    public static SubLObject cyc_corpus_read_hits(final SubLObject lookup_string, SubLObject number_of_hits) {
        if (number_of_hits == UNPROVIDED) {
            number_of_hits = $int$100;
        }
        final SubLObject hits_list = cyc_corpus_utilities.lookup_cyc_corpus_index(lookup_string, number_of_hits);
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

    /**
     *
     *
     * @param FILE-NAME;
     * 		stringp a candidate name for a file.
     * @param REGISTRY;
     * 		dictionary-p a registry that records which file names have
     * 		already been used in the context of the specific application that is calling
     * 		this function.
     * @return stringp; a string that is guaranteed to be shorter than 254 characters and
    not to have been part of REGISTRY when the function was called. As a side effect,
    this function updates REGISTRY to contain an entry for the string it returns.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param FILE-NAME;\r\n\t\tstringp a candidate name for a file.\r\n@param REGISTRY;\r\n\t\tdictionary-p a registry that records which file names have\r\n\t\talready been used in the context of the specific application that is calling\r\n\t\tthis function.\r\n@return stringp; a string that is guaranteed to be shorter than 254 characters and\r\nnot to have been part of REGISTRY when the function was called. As a side effect,\r\nthis function updates REGISTRY to contain an entry for the string it returns.\r\n@unknown bertolo")
    public static final SubLObject truncate_and_make_unique_file_name_alt(SubLObject file_name, SubLObject registry, SubLObject ceiling) {
        if (ceiling == UNPROVIDED) {
            ceiling = $int$999;
        }
        SubLTrampolineFile.checkType(file_name, STRINGP);
        SubLTrampolineFile.checkType(registry, DICTIONARY_P);
        {
            SubLObject base = string_utilities.string_first_n($int$250, file_name);
            if (NIL == dictionary.dictionary_lookup(registry, base, UNPROVIDED)) {
                dictionary.dictionary_enter(registry, base, T);
                return base;
            }
            {
                SubLObject done = NIL;
                SubLObject result = NIL;
                while (NIL == done) {
                    {
                        SubLObject suffix = format(NIL, $str_alt103$_S, random.random(ceiling));
                        result = cconcatenate(base, suffix);
                        if (NIL == dictionary.dictionary_lookup(registry, result, UNPROVIDED)) {
                            dictionary.dictionary_enter(registry, result, T);
                            done = T;
                        }
                    }
                } 
                return result;
            }
        }
    }

    /**
     *
     *
     * @param FILE-NAME;
     * 		stringp a candidate name for a file.
     * @param REGISTRY;
     * 		dictionary-p a registry that records which file names have
     * 		already been used in the context of the specific application that is calling
     * 		this function.
     * @return stringp; a string that is guaranteed to be shorter than 254 characters and
    not to have been part of REGISTRY when the function was called. As a side effect,
    this function updates REGISTRY to contain an entry for the string it returns.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param FILE-NAME;\r\n\t\tstringp a candidate name for a file.\r\n@param REGISTRY;\r\n\t\tdictionary-p a registry that records which file names have\r\n\t\talready been used in the context of the specific application that is calling\r\n\t\tthis function.\r\n@return stringp; a string that is guaranteed to be shorter than 254 characters and\r\nnot to have been part of REGISTRY when the function was called. As a side effect,\r\nthis function updates REGISTRY to contain an entry for the string it returns.\r\n@unknown bertolo")
    public static SubLObject truncate_and_make_unique_file_name(final SubLObject file_name, final SubLObject registry, SubLObject ceiling) {
        if (ceiling == UNPROVIDED) {
            ceiling = cyc_corpus_utilities.$int$999;
        }
        assert NIL != stringp(file_name) : "! stringp(file_name) " + ("Types.stringp(file_name) " + "CommonSymbols.NIL != Types.stringp(file_name) ") + file_name;
        assert NIL != dictionary.dictionary_p(registry) : "! dictionary.dictionary_p(registry) " + ("dictionary.dictionary_p(registry) " + "CommonSymbols.NIL != dictionary.dictionary_p(registry) ") + registry;
        final SubLObject base = string_utilities.string_first_n(cyc_corpus_utilities.$int$250, file_name);
        if (NIL == dictionary.dictionary_lookup(registry, base, UNPROVIDED)) {
            dictionary.dictionary_enter(registry, base, T);
            return base;
        }
        SubLObject done = NIL;
        SubLObject result = NIL;
        while (NIL == done) {
            final SubLObject suffix = format(NIL, cyc_corpus_utilities.$str103$_S, random.random(ceiling));
            result = cconcatenate(base, suffix);
            if (NIL == dictionary.dictionary_lookup(registry, result, UNPROVIDED)) {
                dictionary.dictionary_enter(registry, result, T);
                done = T;
            }
        } 
        return result;
    }

    /**
     *
     *
     * @return stringp: a name for the corpus file for TERM. The name is the
    concatenation of PATH-PREFIX and the hl-external-id-string for TERM.
     */
    @LispMethod(comment = "@return stringp: a name for the corpus file for TERM. The name is the\r\nconcatenation of PATH-PREFIX and the hl-external-id-string for TERM.")
    public static final SubLObject index_file_name_for_term_alt(SubLObject v_term, SubLObject path_prefix, SubLObject registry) {
        if (registry == UNPROVIDED) {
            registry = NIL;
        }
        {
            SubLObject filename = kb_paths.fort_name(v_term);
            SubLObject stripped = string_utilities.strip_final_if_char(path_prefix, code_char($int$47));
            filename = string_utilities.string_substitute($str_alt105$_, $str_alt99$_, filename, UNPROVIDED);
            filename = string_utilities.string_substitute($str_alt105$_, $str_alt106$_, filename, UNPROVIDED);
            filename = string_utilities.string_substitute($str_alt105$_, $str_alt107$_, filename, UNPROVIDED);
            filename = string_utilities.string_substitute($str_alt105$_, $str_alt108$_, filename, UNPROVIDED);
            filename = string_utilities.string_substitute($str_alt109$_op_, $str_alt110$_, filename, UNPROVIDED);
            filename = string_utilities.string_substitute($str_alt111$_cp_, $str_alt112$_, filename, UNPROVIDED);
            if (NIL != registry) {
                filename = com.cyc.cycjava.cycl.cyc_corpus_utilities.truncate_and_make_unique_file_name(filename, registry, UNPROVIDED);
            }
            filename = cconcatenate(stripped, new SubLObject[]{ $str_alt106$_, filename });
            return filename;
        }
    }

    /**
     *
     *
     * @return stringp: a name for the corpus file for TERM. The name is the
    concatenation of PATH-PREFIX and the hl-external-id-string for TERM.
     */
    @LispMethod(comment = "@return stringp: a name for the corpus file for TERM. The name is the\r\nconcatenation of PATH-PREFIX and the hl-external-id-string for TERM.")
    public static SubLObject index_file_name_for_term(final SubLObject v_term, final SubLObject path_prefix, SubLObject registry) {
        if (registry == UNPROVIDED) {
            registry = NIL;
        }
        SubLObject filename = kb_paths.fort_name(v_term);
        final SubLObject stripped = string_utilities.strip_final_if_char(path_prefix, code_char(cyc_corpus_utilities.$int$47));
        filename = string_utilities.string_substitute(cyc_corpus_utilities.$str105$_, cyc_corpus_utilities.$$$_, filename, UNPROVIDED);
        filename = string_utilities.string_substitute(cyc_corpus_utilities.$str105$_, cyc_corpus_utilities.$str106$_, filename, UNPROVIDED);
        filename = string_utilities.string_substitute(cyc_corpus_utilities.$str105$_, cyc_corpus_utilities.$str107$_, filename, UNPROVIDED);
        filename = string_utilities.string_substitute(cyc_corpus_utilities.$str105$_, cyc_corpus_utilities.$str108$_, filename, UNPROVIDED);
        filename = string_utilities.string_substitute(cyc_corpus_utilities.$str109$_op_, cyc_corpus_utilities.$str110$_, filename, UNPROVIDED);
        filename = string_utilities.string_substitute(cyc_corpus_utilities.$str111$_cp_, cyc_corpus_utilities.$str112$_, filename, UNPROVIDED);
        if (NIL != registry) {
            filename = cyc_corpus_utilities.truncate_and_make_unique_file_name(filename, registry, UNPROVIDED);
        }
        filename = cconcatenate(stripped, new SubLObject[]{ cyc_corpus_utilities.$str106$_, filename });
        return filename;
    }

    /**
     *
     *
     * @return boolean: T if a file containing the index body for TERM was written
    to CORPUS-DIR.
     */
    @LispMethod(comment = "@return boolean: T if a file containing the index body for TERM was written\r\nto CORPUS-DIR.")
    public static final SubLObject cyc_corpus_index_term_to_file_alt(SubLObject v_term, SubLObject corpus_dir, SubLObject registry) {
        if (registry == UNPROVIDED) {
            registry = NIL;
        }
        {
            SubLObject written = NIL;
            SubLObject index_body = com.cyc.cycjava.cycl.cyc_corpus_utilities.cyc_corpus_build_index_body(v_term);
            SubLObject out_file = com.cyc.cycjava.cycl.cyc_corpus_utilities.index_file_name_for_term(v_term, corpus_dir, registry);
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(out_file, $APPEND, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt114$Unable_to_open__S, out_file);
                }
                {
                    SubLObject stream_3 = stream;
                    format(stream_3, $str_alt103$_S, kb_utilities.hl_external_id_string(v_term));
                    format(stream_3, $str_alt115$_____S, index_body);
                    written = T;
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return written;
        }
    }

    /**
     *
     *
     * @return boolean: T if a file containing the index body for TERM was written
    to CORPUS-DIR.
     */
    @LispMethod(comment = "@return boolean: T if a file containing the index body for TERM was written\r\nto CORPUS-DIR.")
    public static SubLObject cyc_corpus_index_term_to_file(final SubLObject v_term, final SubLObject corpus_dir, SubLObject registry) {
        if (registry == UNPROVIDED) {
            registry = NIL;
        }
        SubLObject written = NIL;
        final SubLObject index_body = cyc_corpus_utilities.cyc_corpus_build_index_body(v_term);
        final SubLObject out_file = cyc_corpus_utilities.index_file_name_for_term(v_term, corpus_dir, registry);
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(out_file, $APPEND);
            if (!stream.isStream()) {
                Errors.error(cyc_corpus_utilities.$str114$Unable_to_open__S, out_file);
            }
            final SubLObject stream_$11 = stream;
            format(stream_$11, cyc_corpus_utilities.$str103$_S, kb_utilities.hl_external_id_string(v_term));
            format(stream_$11, cyc_corpus_utilities.$str115$_____S, index_body);
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

    public static final SubLObject all_constants_index_files_alt(SubLObject corpus_dir, SubLObject module) {
        if (module == UNPROVIDED) {
            module = $int$300;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != Filesys.probe_file(corpus_dir)) && (NIL != Filesys.directory_p(corpus_dir)))) {
                return Errors.warn($str_alt92$_S_is_not_an_existing_directory, corpus_dir);
            }
            {
                SubLObject times = ZERO_INTEGER;
                SubLObject idx = do_constants_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($$$mapping_Cyc_constants, STRINGP);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$mapping_Cyc_constants);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject constant = NIL;
                                while (NIL != id) {
                                    constant = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, constant, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (mod(times, module).numE(ZERO_INTEGER)) {
                                            Storage.gc_ephemeral();
                                        }
                                        com.cyc.cycjava.cycl.cyc_corpus_utilities.cyc_corpus_index_term_to_file(constant, corpus_dir, UNPROVIDED);
                                        times = add(times, ONE_INTEGER);
                                    }
                                    id = do_id_index_next_id(idx, T, id, state_var);
                                    state_var = do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return times;
            }
        }
    }

    public static SubLObject all_constants_index_files(final SubLObject corpus_dir, SubLObject module) {
        if (module == UNPROVIDED) {
            module = cyc_corpus_utilities.$int$300;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Filesys.probe_file(corpus_dir)) || (NIL == Filesys.directory_p(corpus_dir))) {
            return Errors.warn(cyc_corpus_utilities.$str92$_S_is_not_an_existing_directory, corpus_dir);
        }
        SubLObject times = ZERO_INTEGER;
        final SubLObject idx = do_constants_table();
        final SubLObject mess = cyc_corpus_utilities.$$$mapping_Cyc_constants;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
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
                                cyc_corpus_utilities.cyc_corpus_index_term_to_file(constant, corpus_dir, UNPROVIDED);
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
                                cyc_corpus_utilities.cyc_corpus_index_term_to_file(constant2, corpus_dir, UNPROVIDED);
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

    /**
     *
     *
     * @return integerp: build corpus of files to index ONLY FOR NARTS.
     */
    @LispMethod(comment = "@return integerp: build corpus of files to index ONLY FOR NARTS.")
    public static final SubLObject all_narts_index_files_alt(SubLObject corpus_dir, SubLObject module) {
        if (module == UNPROVIDED) {
            module = $int$300;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != Filesys.probe_file(corpus_dir)) && (NIL != Filesys.directory_p(corpus_dir)))) {
                return Errors.warn($str_alt92$_S_is_not_an_existing_directory, corpus_dir);
            }
            {
                SubLObject times = ZERO_INTEGER;
                SubLObject registry = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                SubLObject idx = nart_handles.do_narts_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($$$mapping_Cyc_NARTs, STRINGP);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$mapping_Cyc_NARTs);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject v_term = NIL;
                                while (NIL != id) {
                                    v_term = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, v_term, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (mod(times, module).numE(ZERO_INTEGER)) {
                                            Storage.gc_ephemeral();
                                        }
                                        com.cyc.cycjava.cycl.cyc_corpus_utilities.cyc_corpus_index_term_to_file(v_term, corpus_dir, registry);
                                        times = add(times, ONE_INTEGER);
                                    }
                                    id = do_id_index_next_id(idx, T, id, state_var);
                                    state_var = do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return times;
            }
        }
    }

    /**
     *
     *
     * @return integerp: build corpus of files to index ONLY FOR NARTS.
     */
    @LispMethod(comment = "@return integerp: build corpus of files to index ONLY FOR NARTS.")
    public static SubLObject all_narts_index_files(final SubLObject corpus_dir, SubLObject module) {
        if (module == UNPROVIDED) {
            module = cyc_corpus_utilities.$int$300;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Filesys.probe_file(corpus_dir)) || (NIL == Filesys.directory_p(corpus_dir))) {
            return Errors.warn(cyc_corpus_utilities.$str92$_S_is_not_an_existing_directory, corpus_dir);
        }
        SubLObject times = ZERO_INTEGER;
        final SubLObject registry = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = cyc_corpus_utilities.$$$mapping_Cyc_NARTs;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
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
                                cyc_corpus_utilities.cyc_corpus_index_term_to_file(v_term, corpus_dir, registry);
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
                                cyc_corpus_utilities.cyc_corpus_index_term_to_file(v_term2, corpus_dir, registry);
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

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeString("application.cyc-ir.cyc-corpus-client-host"));

    static private final SubLString $str_alt2$ir_cyc_com = makeString("ir.cyc.com");

    static private final SubLList $list_alt4 = list(makeString("application.cyc-ir.cyc-corpus-client-port"));

    static private final SubLList $list_alt24 = list(new SubLObject[]{ list(makeSymbol("INDEX-DIRECTIVE-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("index")), list(makeSymbol("SEARCH-DIRECTIVE-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("search")), list(makeSymbol("SUBL-DIRECTIVE-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("SubL")), list(makeSymbol("QUERY-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("request")), list(makeSymbol("QUERY-TYPE-ATTR"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("type")), list(makeSymbol("QUERY-LANGUAGE-ATTR"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("language")), list(makeSymbol("INDEX-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("to-index")), list(makeSymbol("INDEX-TARGET-ATTR"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("target")), list(makeSymbol("HITNUM-ATTR"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("hitnum")), list(makeSymbol("KEY"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("VALUE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("SEARCH-STRING"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("HIT-NUMBER"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("ANSWER"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KEY"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-VALUE"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REQUEST-STRING"), NIL, makeKeyword("PUBLIC")) });

    public static final SubLObject all_narts_indexed_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject idx = nart_handles.do_narts_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($$$mapping_Cyc_NARTs, STRINGP);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$mapping_Cyc_NARTs);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject cycl_nart = NIL;
                                while (NIL != id) {
                                    cycl_nart = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, cycl_nart, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        com.cyc.cycjava.cycl.cyc_corpus_utilities.cyc_corpus_index_term(cycl_nart);
                                    }
                                    id = do_id_index_next_id(idx, T, id, state_var);
                                    state_var = do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return $DONE;
        }
    }

    public static SubLObject all_narts_indexed() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = cyc_corpus_utilities.$$$mapping_Cyc_NARTs;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
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
                                cyc_corpus_utilities.cyc_corpus_index_term(cycl_nart);
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
                                cyc_corpus_utilities.cyc_corpus_index_term(cycl_nart2);
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

    static private final SubLString $str_alt44$to_index = makeString("to-index");

    static private final SubLList $list_alt54 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt55 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt57 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt58 = list(makeSymbol("RESPONSE-STRING"));

    static private final SubLList $list_alt59 = list(list(makeSymbol("CLET"), list(makeSymbol("RESPONSE"), makeSymbol("ERROR")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")), list(makeSymbol("CSETQ"), makeSymbol("RESPONSE"), list(makeSymbol("READ-FROM-STRING"), makeSymbol("RESPONSE-STRING")))), list(makeSymbol("PWHEN"), makeSymbol("ERROR"), list(makeSymbol("WARN"), makeSymbol("ERROR")), list(RET, makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("ANSWER"), makeSymbol("RESPONSE")), list(RET, makeSymbol("SELF"))));

    static private final SubLList $list_alt62 = list(makeSymbol("OBJECT"));

    public static SubLObject declare_cyc_corpus_utilities_file() {
        declareFunction("get_cyc_corpus_client", "GET-CYC-CORPUS-CLIENT", 0, 0, false);
        declareFunction("reset_cyc_corpus_client", "RESET-CYC-CORPUS-CLIENT", 2, 0, false);
        declareFunction("add_to_cyc_corpus_index", "ADD-TO-CYC-CORPUS-INDEX", 2, 0, false);
        declareFunction("lookup_cyc_corpus_index", "LOOKUP-CYC-CORPUS-INDEX", 1, 1, false);
        declareFunction("get_cyc_ir_client_interaction_answer", "GET-CYC-IR-CLIENT-INTERACTION-ANSWER", 1, 0, false);
        declareFunction("set_cyc_ir_client_interaction_answer", "SET-CYC-IR-CLIENT-INTERACTION-ANSWER", 2, 0, false);
        declareFunction("get_cyc_ir_client_interaction_hit_number", "GET-CYC-IR-CLIENT-INTERACTION-HIT-NUMBER", 1, 0, false);
        declareFunction("set_cyc_ir_client_interaction_hit_number", "SET-CYC-IR-CLIENT-INTERACTION-HIT-NUMBER", 2, 0, false);
        declareFunction("get_cyc_ir_client_interaction_search_string", "GET-CYC-IR-CLIENT-INTERACTION-SEARCH-STRING", 1, 0, false);
        declareFunction("set_cyc_ir_client_interaction_search_string", "SET-CYC-IR-CLIENT-INTERACTION-SEARCH-STRING", 2, 0, false);
        declareFunction("get_cyc_ir_client_interaction_value", "GET-CYC-IR-CLIENT-INTERACTION-VALUE", 1, 0, false);
        declareFunction("set_cyc_ir_client_interaction_value", "SET-CYC-IR-CLIENT-INTERACTION-VALUE", 2, 0, false);
        declareFunction("get_cyc_ir_client_interaction_key", "GET-CYC-IR-CLIENT-INTERACTION-KEY", 1, 0, false);
        declareFunction("set_cyc_ir_client_interaction_key", "SET-CYC-IR-CLIENT-INTERACTION-KEY", 2, 0, false);
        declareFunction("get_cyc_ir_client_interaction_hitnum_attr", "GET-CYC-IR-CLIENT-INTERACTION-HITNUM-ATTR", 1, 0, false);
        declareFunction("set_cyc_ir_client_interaction_hitnum_attr", "SET-CYC-IR-CLIENT-INTERACTION-HITNUM-ATTR", 2, 0, false);
        declareFunction("get_cyc_ir_client_interaction_index_target_attr", "GET-CYC-IR-CLIENT-INTERACTION-INDEX-TARGET-ATTR", 1, 0, false);
        declareFunction("set_cyc_ir_client_interaction_index_target_attr", "SET-CYC-IR-CLIENT-INTERACTION-INDEX-TARGET-ATTR", 2, 0, false);
        declareFunction("get_cyc_ir_client_interaction_index_tag", "GET-CYC-IR-CLIENT-INTERACTION-INDEX-TAG", 1, 0, false);
        declareFunction("set_cyc_ir_client_interaction_index_tag", "SET-CYC-IR-CLIENT-INTERACTION-INDEX-TAG", 2, 0, false);
        declareFunction("get_cyc_ir_client_interaction_query_language_attr", "GET-CYC-IR-CLIENT-INTERACTION-QUERY-LANGUAGE-ATTR", 1, 0, false);
        declareFunction("set_cyc_ir_client_interaction_query_language_attr", "SET-CYC-IR-CLIENT-INTERACTION-QUERY-LANGUAGE-ATTR", 2, 0, false);
        declareFunction("get_cyc_ir_client_interaction_query_type_attr", "GET-CYC-IR-CLIENT-INTERACTION-QUERY-TYPE-ATTR", 1, 0, false);
        declareFunction("set_cyc_ir_client_interaction_query_type_attr", "SET-CYC-IR-CLIENT-INTERACTION-QUERY-TYPE-ATTR", 2, 0, false);
        declareFunction("get_cyc_ir_client_interaction_query_tag", "GET-CYC-IR-CLIENT-INTERACTION-QUERY-TAG", 1, 0, false);
        declareFunction("set_cyc_ir_client_interaction_query_tag", "SET-CYC-IR-CLIENT-INTERACTION-QUERY-TAG", 2, 0, false);
        declareFunction("get_cyc_ir_client_interaction_subl_directive_tag", "GET-CYC-IR-CLIENT-INTERACTION-SUBL-DIRECTIVE-TAG", 1, 0, false);
        declareFunction("set_cyc_ir_client_interaction_subl_directive_tag", "SET-CYC-IR-CLIENT-INTERACTION-SUBL-DIRECTIVE-TAG", 2, 0, false);
        declareFunction("get_cyc_ir_client_interaction_search_directive_tag", "GET-CYC-IR-CLIENT-INTERACTION-SEARCH-DIRECTIVE-TAG", 1, 0, false);
        declareFunction("set_cyc_ir_client_interaction_search_directive_tag", "SET-CYC-IR-CLIENT-INTERACTION-SEARCH-DIRECTIVE-TAG", 2, 0, false);
        declareFunction("get_cyc_ir_client_interaction_index_directive_tag", "GET-CYC-IR-CLIENT-INTERACTION-INDEX-DIRECTIVE-TAG", 1, 0, false);
        declareFunction("set_cyc_ir_client_interaction_index_directive_tag", "SET-CYC-IR-CLIENT-INTERACTION-INDEX-DIRECTIVE-TAG", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyc_ir_client_interaction_class", "SUBLOOP-RESERVED-INITIALIZE-CYC-IR-CLIENT-INTERACTION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyc_ir_client_interaction_instance", "SUBLOOP-RESERVED-INITIALIZE-CYC-IR-CLIENT-INTERACTION-INSTANCE", 1, 0, false);
        declareFunction("cyc_ir_client_interaction_p", "CYC-IR-CLIENT-INTERACTION-P", 1, 0, false);
        declareFunction("cyc_ir_client_interaction_initialize_method", "CYC-IR-CLIENT-INTERACTION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyc_ir_client_interaction_build_answer_method", "CYC-IR-CLIENT-INTERACTION-BUILD-ANSWER-METHOD", 2, 0, false);
        declareFunction("cyc_ir_client_interaction_set_key_method", "CYC-IR-CLIENT-INTERACTION-SET-KEY-METHOD", 2, 0, false);
        declareFunction("cyc_ir_client_interaction_set_value_method", "CYC-IR-CLIENT-INTERACTION-SET-VALUE-METHOD", 2, 0, false);
        declareFunction("cyc_ir_client_interaction_set_search_string_method", "CYC-IR-CLIENT-INTERACTION-SET-SEARCH-STRING-METHOD", 2, 0, false);
        declareFunction("cyc_ir_client_interaction_set_hitnum_method", "CYC-IR-CLIENT-INTERACTION-SET-HITNUM-METHOD", 2, 0, false);
        declareFunction("cyc_ir_client_interaction_request_string_method", "CYC-IR-CLIENT-INTERACTION-REQUEST-STRING-METHOD", 1, 0, false);
        declareFunction("cyc_ir_client_interaction_get_answer_method", "CYC-IR-CLIENT-INTERACTION-GET-ANSWER-METHOD", 1, 0, false);
        declareFunction("cyc_corpus_dump_complete_p", "CYC-CORPUS-DUMP-COMPLETE-P", 0, 0, false);
        declareFunction("all_terms_indexed", "ALL-TERMS-INDEXED", 0, 0, false);
        declareFunction("all_terms_index_files_to_dir", "ALL-TERMS-INDEX-FILES-TO-DIR", 1, 1, false);
        declareFunction("create_all_terms_index_files_to_dir_task", "CREATE-ALL-TERMS-INDEX-FILES-TO-DIR-TASK", 1, 1, false);
        declareFunction("cyc_corpus_index_term", "CYC-CORPUS-INDEX-TERM", 1, 0, false);
        declareFunction("cyc_corpus_build_index_body", "CYC-CORPUS-BUILD-INDEX-BODY", 1, 0, false);
        declareFunction("cyc_corpus_read_hits", "CYC-CORPUS-READ-HITS", 1, 1, false);
        declareFunction("truncate_and_make_unique_file_name", "TRUNCATE-AND-MAKE-UNIQUE-FILE-NAME", 2, 1, false);
        declareFunction("index_file_name_for_term", "INDEX-FILE-NAME-FOR-TERM", 2, 1, false);
        declareFunction("cyc_corpus_index_term_to_file", "CYC-CORPUS-INDEX-TERM-TO-FILE", 2, 1, false);
        declareFunction("all_constants_index_files", "ALL-CONSTANTS-INDEX-FILES", 1, 1, false);
        declareFunction("all_narts_index_files", "ALL-NARTS-INDEX-FILES", 1, 1, false);
        declareFunction("all_narts_indexed", "ALL-NARTS-INDEXED", 0, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt63 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("STRINGP")), list(makeSymbol("CSETQ"), makeSymbol("KEY"), makeSymbol("OBJECT")), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt66 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("STRINGP")), list(makeSymbol("CSETQ"), makeSymbol("VALUE"), makeSymbol("OBJECT")), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt69 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("STRINGP")), list(makeSymbol("CSETQ"), makeSymbol("SEARCH-STRING"), makeSymbol("OBJECT")), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt72 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("INTEGERP")), list(makeSymbol("MUST"), list(makeSymbol(">"), makeSymbol("OBJECT"), ZERO_INTEGER), makeString("~a is not a positive integer"), makeSymbol("OBJECT")), list(makeSymbol("CSETQ"), makeSymbol("HIT-NUMBER"), makeSymbol("OBJECT")), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt74$_a_is_not_a_positive_integer = makeString("~a is not a positive integer");

    static private final SubLList $list_alt76 = list(list(makeSymbol("CLET"), list(list(makeSymbol("OUTSTREAM"), list(makeSymbol("MAKE-STRING-OUTPUT-STREAM"))), list(makeSymbol("XML-WRITER"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("XML-WRITER")))), list(makeSymbol("QUERY-TYPE-TAG"), list(makeSymbol("FIF"), makeSymbol("SEARCH-STRING"), makeSymbol("SEARCH-DIRECTIVE-TAG"), makeSymbol("INDEX-DIRECTIVE-TAG"))), list(makeSymbol("ATTRIBUTES"), list(makeSymbol("BQ-LIST"), makeSymbol("QUERY-TYPE-ATTR"), makeSymbol("QUERY-TYPE-TAG"), makeSymbol("QUERY-LANGUAGE-ATTR"), makeSymbol("SUBL-DIRECTIVE-TAG")))), list(makeSymbol("PWHEN"), makeSymbol("SEARCH-STRING"), list(makeSymbol("CPUSH"), makeSymbol("HIT-NUMBER"), makeSymbol("ATTRIBUTES")), list(makeSymbol("CPUSH"), makeSymbol("HITNUM-ATTR"), makeSymbol("ATTRIBUTES"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("XML-WRITER"), list(QUOTE, makeSymbol("SET-STREAM")), makeSymbol("OUTSTREAM")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("XML-WRITER"), list(QUOTE, makeSymbol("START-TAG")), makeSymbol("QUERY-TAG"), makeSymbol("ATTRIBUTES"), NIL, NIL), list(makeSymbol("PCOND"), list(makeSymbol("SEARCH-STRING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("XML-WRITER"), list(QUOTE, makeSymbol("XML-PRINT")), makeSymbol("SEARCH-STRING"), NIL)), list(T, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("XML-WRITER"), list(QUOTE, makeSymbol("START-TAG")), makeSymbol("INDEX-TAG"), list(makeSymbol("BQ-LIST"), makeSymbol("INDEX-TARGET-ATTR"), makeSymbol("KEY")), NIL, NIL), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("XML-WRITER"), list(QUOTE, makeSymbol("XML-PRINT")), makeSymbol("VALUE"), NIL), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("XML-WRITER"), list(QUOTE, makeSymbol("END-TAG")), makeSymbol("INDEX-TAG"), NIL, NIL))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("XML-WRITER"), list(QUOTE, makeSymbol("END-TAG")), makeSymbol("QUERY-TAG"), NIL, NIL), list(RET, list(makeSymbol("GET-OUTPUT-STREAM-STRING"), makeSymbol("OUTSTREAM")))));

    static private final SubLList $list_alt84 = list(list(RET, makeSymbol("ANSWER")));

    static private final SubLString $str_alt89$__Couldn_t_index__S = makeString("~%Couldn't index ~S");

    static private final SubLString $str_alt92$_S_is_not_an_existing_directory = makeString("~S is not an existing directory");

    static private final SubLString $str_alt93$_A_corpus_dump = makeString("~A-corpus-dump");

    static private final SubLString $str_alt99$_ = makeString(" ");

    static private final SubLString $str_alt103$_S = makeString("~S");

    static private final SubLString $str_alt105$_ = makeString("_");

    static private final SubLString $str_alt106$_ = makeString("/");

    static private final SubLString $str_alt107$_ = makeString(";");

    static private final SubLString $str_alt108$_ = makeString(":");

    public static final SubLObject init_cyc_corpus_utilities_file_alt() {
        defparameter("*CYC-CORPUS-CLIENT-HOST*", red_infrastructure_macros.red_def_helper($list_alt0.isSymbol() ? ((SubLObject) (symbol_value($list_alt0))) : $list_alt0, $cyc_corpus_client_host$, $str_alt2$ir_cyc_com.isSymbol() ? ((SubLObject) (symbol_value($str_alt2$ir_cyc_com))) : $str_alt2$ir_cyc_com, $PARAMETER, UNPROVIDED));
        defparameter("*CYC-CORPUS-CLIENT-PORT*", red_infrastructure_macros.red_def_helper($list_alt4.isSymbol() ? ((SubLObject) (symbol_value($list_alt4))) : $list_alt4, $cyc_corpus_client_port$, $int$6666.isSymbol() ? ((SubLObject) (symbol_value($int$6666))) : $int$6666, $PARAMETER, UNPROVIDED));
        defparameter("*CYC-CORPUS-CLIENT*", NIL);
        defvar("*CYC-CORPUS-DUMP-TASK*", NIL);
        return NIL;
    }

    public static SubLObject init_cyc_corpus_utilities_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*CYC-CORPUS-CLIENT-HOST*", red_infrastructure_macros.red_def_helper(cyc_corpus_utilities.$list0.isSymbol() ? symbol_value(cyc_corpus_utilities.$list0) : cyc_corpus_utilities.$list0, cyc_corpus_utilities.$cyc_corpus_client_host$, cyc_corpus_utilities.$str2$ir_cyc_com.isSymbol() ? symbol_value(cyc_corpus_utilities.$str2$ir_cyc_com) : cyc_corpus_utilities.$str2$ir_cyc_com, $PARAMETER, UNPROVIDED));
            defparameter("*CYC-CORPUS-CLIENT-PORT*", red_infrastructure_macros.red_def_helper(cyc_corpus_utilities.$list4.isSymbol() ? symbol_value(cyc_corpus_utilities.$list4) : cyc_corpus_utilities.$list4, cyc_corpus_utilities.$cyc_corpus_client_port$, cyc_corpus_utilities.$int$6666.isSymbol() ? symbol_value(cyc_corpus_utilities.$int$6666) : cyc_corpus_utilities.$int$6666, $PARAMETER, UNPROVIDED));
            defparameter("*CYC-CORPUS-CLIENT*", NIL);
            defvar("*CYC-CORPUS-DUMP-TASK*", NIL);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*CYC-CORPUS-CLIENT-HOST*", red_infrastructure_macros.red_def_helper($list_alt0.isSymbol() ? ((SubLObject) (symbol_value($list_alt0))) : $list_alt0, $cyc_corpus_client_host$, $str_alt2$ir_cyc_com.isSymbol() ? ((SubLObject) (symbol_value($str_alt2$ir_cyc_com))) : $str_alt2$ir_cyc_com, $PARAMETER, UNPROVIDED));
            defparameter("*CYC-CORPUS-CLIENT-PORT*", red_infrastructure_macros.red_def_helper($list_alt4.isSymbol() ? ((SubLObject) (symbol_value($list_alt4))) : $list_alt4, $cyc_corpus_client_port$, $int$6666.isSymbol() ? ((SubLObject) (symbol_value($int$6666))) : $int$6666, $PARAMETER, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_cyc_corpus_utilities_file_Previous() {
        defparameter("*CYC-CORPUS-CLIENT-HOST*", red_infrastructure_macros.red_def_helper(cyc_corpus_utilities.$list0.isSymbol() ? symbol_value(cyc_corpus_utilities.$list0) : cyc_corpus_utilities.$list0, cyc_corpus_utilities.$cyc_corpus_client_host$, cyc_corpus_utilities.$str2$ir_cyc_com.isSymbol() ? symbol_value(cyc_corpus_utilities.$str2$ir_cyc_com) : cyc_corpus_utilities.$str2$ir_cyc_com, $PARAMETER, UNPROVIDED));
        defparameter("*CYC-CORPUS-CLIENT-PORT*", red_infrastructure_macros.red_def_helper(cyc_corpus_utilities.$list4.isSymbol() ? symbol_value(cyc_corpus_utilities.$list4) : cyc_corpus_utilities.$list4, cyc_corpus_utilities.$cyc_corpus_client_port$, cyc_corpus_utilities.$int$6666.isSymbol() ? symbol_value(cyc_corpus_utilities.$int$6666) : cyc_corpus_utilities.$int$6666, $PARAMETER, UNPROVIDED));
        defparameter("*CYC-CORPUS-CLIENT*", NIL);
        defvar("*CYC-CORPUS-DUMP-TASK*", NIL);
        return NIL;
    }

    static private final SubLString $str_alt109$_op_ = makeString("_op_");

    static private final SubLString $str_alt110$_ = makeString("(");

    static private final SubLString $str_alt111$_cp_ = makeString("_cp_");

    static private final SubLString $str_alt112$_ = makeString(")");

    static private final SubLString $str_alt114$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt115$_____S = makeString("~%~%~S");

    public static SubLObject setup_cyc_corpus_utilities_file() {
        classes.subloop_new_class(cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, OBJECT, NIL, NIL, cyc_corpus_utilities.$list24);
        classes.class_set_implements_slot_listeners(cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, NIL);
        classes.subloop_note_class_initialization_function(cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, cyc_corpus_utilities.SUBLOOP_RESERVED_INITIALIZE_CYC_IR_CLIENT_INTERACTION_CLASS);
        classes.subloop_note_instance_initialization_function(cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, cyc_corpus_utilities.SUBLOOP_RESERVED_INITIALIZE_CYC_IR_CLIENT_INTERACTION_INSTANCE);
        cyc_corpus_utilities.subloop_reserved_initialize_cyc_ir_client_interaction_class(cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION);
        methods.methods_incorporate_instance_method(INITIALIZE, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, cyc_corpus_utilities.$list54, NIL, cyc_corpus_utilities.$list55);
        methods.subloop_register_instance_method(cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, INITIALIZE, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(cyc_corpus_utilities.BUILD_ANSWER, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, cyc_corpus_utilities.$list57, cyc_corpus_utilities.$list58, cyc_corpus_utilities.$list59);
        methods.subloop_register_instance_method(cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, cyc_corpus_utilities.BUILD_ANSWER, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION_BUILD_ANSWER_METHOD);
        methods.methods_incorporate_instance_method(cyc_corpus_utilities.SET_KEY, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, cyc_corpus_utilities.$list57, cyc_corpus_utilities.$list62, cyc_corpus_utilities.$list63);
        methods.subloop_register_instance_method(cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, cyc_corpus_utilities.SET_KEY, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION_SET_KEY_METHOD);
        methods.methods_incorporate_instance_method(SET_VALUE, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, cyc_corpus_utilities.$list57, cyc_corpus_utilities.$list62, cyc_corpus_utilities.$list66);
        methods.subloop_register_instance_method(cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, SET_VALUE, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION_SET_VALUE_METHOD);
        methods.methods_incorporate_instance_method(cyc_corpus_utilities.SET_SEARCH_STRING, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, cyc_corpus_utilities.$list57, cyc_corpus_utilities.$list62, cyc_corpus_utilities.$list69);
        methods.subloop_register_instance_method(cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, cyc_corpus_utilities.SET_SEARCH_STRING, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION_SET_SEARCH_STRING_METHOD);
        methods.methods_incorporate_instance_method(cyc_corpus_utilities.SET_HITNUM, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, cyc_corpus_utilities.$list57, cyc_corpus_utilities.$list62, cyc_corpus_utilities.$list72);
        methods.subloop_register_instance_method(cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, cyc_corpus_utilities.SET_HITNUM, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION_SET_HITNUM_METHOD);
        methods.methods_incorporate_instance_method(REQUEST_STRING, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, cyc_corpus_utilities.$list57, NIL, cyc_corpus_utilities.$list76);
        methods.subloop_register_instance_method(cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, REQUEST_STRING, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION_REQUEST_STRING_METHOD);
        methods.methods_incorporate_instance_method(GET_ANSWER, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, cyc_corpus_utilities.$list57, NIL, cyc_corpus_utilities.$list84);
        methods.subloop_register_instance_method(cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION, GET_ANSWER, cyc_corpus_utilities.CYC_IR_CLIENT_INTERACTION_GET_ANSWER_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        cyc_corpus_utilities.declare_cyc_corpus_utilities_file();
    }

    @Override
    public void initializeVariables() {
        cyc_corpus_utilities.init_cyc_corpus_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        cyc_corpus_utilities.setup_cyc_corpus_utilities_file();
    }

    
}

/**
 * Total time: 703 ms
 */
