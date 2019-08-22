package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_macro_promotions.validate_tcp_connection;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alpha_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_upcase;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.code_char;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.digit_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.lower_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.upper_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$readtable$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader._csetf_readtable_case;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.copy_readtable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_char_no_hang;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class rkf_collaborator_fire extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_collaborator_fire();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_collaborator_fire";

    public static final String myFingerPrint = "674f51f67656c73b2f59b305474dcc49202d4fafaab2854cbda242b9e2007413";





    // defparameter
    private static final SubLSymbol $kqml_end_message_char$ = makeSymbol("*KQML-END-MESSAGE-CHAR*");

    // deflexical
    private static final SubLSymbol $kqml_default_read_timeout$ = makeSymbol("*KQML-DEFAULT-READ-TIMEOUT*");

    // defparameter
    public static final SubLSymbol $kqml_trace$ = makeSymbol("*KQML-TRACE*");

    // defconstant
    public static final SubLSymbol $dtp_kqml_object$ = makeSymbol("*DTP-KQML-OBJECT*");

    // deflexical
    private static final SubLSymbol $kqml_read_table$ = makeSymbol("*KQML-READ-TABLE*");

    // defparameter
    private static final SubLSymbol $kmql_package_prefixes$ = makeSymbol("*KMQL-PACKAGE-PREFIXES*");

    // defconstant
    public static final SubLSymbol $dtp_fire_session$ = makeSymbol("*DTP-FIRE-SESSION*");



    // defparameter
    private static final SubLSymbol $rkf_fire_trace_analogy$ = makeSymbol("*RKF-FIRE-TRACE-ANALOGY*");

    // defconstant
    private static final SubLSymbol $fire_server_nil$ = makeSymbol("*FIRE-SERVER-NIL*");



    public static final SubLSymbol CYC_CONSTANT_TO_MAC_FAC_TERM = makeSymbol("CYC-CONSTANT-TO-MAC-FAC-TERM");

    public static final SubLSymbol CYCL_TO_MAC_FAC_TRANSFORM_ISA_TEST = makeSymbol("CYCL-TO-MAC-FAC-TRANSFORM-ISA-TEST");

    public static final SubLSymbol CYCL_TO_MAC_FAC_TRANSFORM_ISA_ACT = makeSymbol("CYCL-TO-MAC-FAC-TRANSFORM-ISA-ACT");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLSymbol MAC_FAC_TO_CYCL_TRANSFORM_UNARY_TEST = makeSymbol("MAC-FAC-TO-CYCL-TRANSFORM-UNARY-TEST");

    public static final SubLSymbol MAC_FAC_TO_CYCL_TRANSFORM_UNARY_ACT = makeSymbol("MAC-FAC-TO-CYCL-TRANSFORM-UNARY-ACT");

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    public static final SubLSymbol $cyc_constant_to_mac_fac_term_caching_state$ = makeSymbol("*CYC-CONSTANT-TO-MAC-FAC-TERM-CACHING-STATE*");



    private static final SubLSymbol MAC_FAC_TERM_TO_CYC_TERM = makeSymbol("MAC-FAC-TERM-TO-CYC-TERM");



    private static final SubLSymbol $mac_fac_term_to_cyc_term_caching_state$ = makeSymbol("*MAC-FAC-TERM-TO-CYC-TERM-CACHING-STATE*");





    private static final SubLString $str15$__KQML_SEND___S = makeString("~%KQML SEND: ~S");

    private static final SubLInteger $int$60 = makeInteger(60);



    private static final SubLString $str18$__KQML_READ___S = makeString("~%KQML READ: ~S");

    private static final SubLString $str19$__KQML_READ_TIMEOUT___S = makeString("~%KQML READ TIMEOUT: ~S");

    private static final SubLSymbol KQML_OBJECT = makeSymbol("KQML-OBJECT");

    private static final SubLSymbol KQML_OBJECT_P = makeSymbol("KQML-OBJECT-P");

    private static final SubLList $list22 = list(new SubLObject[]{ makeSymbol("PERFORMATIVE"), makeSymbol("SENDER"), makeSymbol("RECEIVER"), makeSymbol("FROM"), makeSymbol("TO"), makeSymbol("IN-REPLY-TO"), makeSymbol("REPLY-WITH"), makeSymbol("LANGUAGE"), makeSymbol("ONTOLOGY"), makeSymbol("CONTENT") });

    public static final SubLList $list23 = list(new SubLObject[]{ makeKeyword("PERFORMATIVE"), makeKeyword("SENDER"), makeKeyword("RECEIVER"), makeKeyword("FROM"), makeKeyword("TO"), makeKeyword("IN-REPLY-TO"), makeKeyword("REPLY-WITH"), makeKeyword("LANGUAGE"), makeKeyword("ONTOLOGY"), makeKeyword("CONTENT") });

    public static final SubLList $list24 = list(new SubLObject[]{ makeSymbol("KQML-OBJECT-PERFORMATIVE"), makeSymbol("KQML-OBJECT-SENDER"), makeSymbol("KQML-OBJECT-RECEIVER"), makeSymbol("KQML-OBJECT-FROM"), makeSymbol("KQML-OBJECT-TO"), makeSymbol("KQML-OBJECT-IN-REPLY-TO"), makeSymbol("KQML-OBJECT-REPLY-WITH"), makeSymbol("KQML-OBJECT-LANGUAGE"), makeSymbol("KQML-OBJECT-ONTOLOGY"), makeSymbol("KQML-OBJECT-CONTENT") });

    public static final SubLList $list25 = list(new SubLObject[]{ makeSymbol("_CSETF-KQML-OBJECT-PERFORMATIVE"), makeSymbol("_CSETF-KQML-OBJECT-SENDER"), makeSymbol("_CSETF-KQML-OBJECT-RECEIVER"), makeSymbol("_CSETF-KQML-OBJECT-FROM"), makeSymbol("_CSETF-KQML-OBJECT-TO"), makeSymbol("_CSETF-KQML-OBJECT-IN-REPLY-TO"), makeSymbol("_CSETF-KQML-OBJECT-REPLY-WITH"), makeSymbol("_CSETF-KQML-OBJECT-LANGUAGE"), makeSymbol("_CSETF-KQML-OBJECT-ONTOLOGY"), makeSymbol("_CSETF-KQML-OBJECT-CONTENT") });



    private static final SubLSymbol KQML_OBJECT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KQML-OBJECT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list28 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("KQML-OBJECT-P"));

    public static final SubLSymbol KQML_OBJECT_PERFORMATIVE = makeSymbol("KQML-OBJECT-PERFORMATIVE");

    public static final SubLSymbol _CSETF_KQML_OBJECT_PERFORMATIVE = makeSymbol("_CSETF-KQML-OBJECT-PERFORMATIVE");

    public static final SubLSymbol KQML_OBJECT_SENDER = makeSymbol("KQML-OBJECT-SENDER");

    public static final SubLSymbol _CSETF_KQML_OBJECT_SENDER = makeSymbol("_CSETF-KQML-OBJECT-SENDER");

    public static final SubLSymbol KQML_OBJECT_RECEIVER = makeSymbol("KQML-OBJECT-RECEIVER");

    public static final SubLSymbol _CSETF_KQML_OBJECT_RECEIVER = makeSymbol("_CSETF-KQML-OBJECT-RECEIVER");

    public static final SubLSymbol KQML_OBJECT_FROM = makeSymbol("KQML-OBJECT-FROM");

    public static final SubLSymbol _CSETF_KQML_OBJECT_FROM = makeSymbol("_CSETF-KQML-OBJECT-FROM");

    public static final SubLSymbol KQML_OBJECT_TO = makeSymbol("KQML-OBJECT-TO");

    public static final SubLSymbol _CSETF_KQML_OBJECT_TO = makeSymbol("_CSETF-KQML-OBJECT-TO");

    public static final SubLSymbol KQML_OBJECT_IN_REPLY_TO = makeSymbol("KQML-OBJECT-IN-REPLY-TO");

    public static final SubLSymbol _CSETF_KQML_OBJECT_IN_REPLY_TO = makeSymbol("_CSETF-KQML-OBJECT-IN-REPLY-TO");

    public static final SubLSymbol KQML_OBJECT_REPLY_WITH = makeSymbol("KQML-OBJECT-REPLY-WITH");

    public static final SubLSymbol _CSETF_KQML_OBJECT_REPLY_WITH = makeSymbol("_CSETF-KQML-OBJECT-REPLY-WITH");

    public static final SubLSymbol KQML_OBJECT_LANGUAGE = makeSymbol("KQML-OBJECT-LANGUAGE");

    public static final SubLSymbol _CSETF_KQML_OBJECT_LANGUAGE = makeSymbol("_CSETF-KQML-OBJECT-LANGUAGE");

    public static final SubLSymbol KQML_OBJECT_ONTOLOGY = makeSymbol("KQML-OBJECT-ONTOLOGY");

    public static final SubLSymbol _CSETF_KQML_OBJECT_ONTOLOGY = makeSymbol("_CSETF-KQML-OBJECT-ONTOLOGY");

    public static final SubLSymbol KQML_OBJECT_CONTENT = makeSymbol("KQML-OBJECT-CONTENT");

    public static final SubLSymbol _CSETF_KQML_OBJECT_CONTENT = makeSymbol("_CSETF-KQML-OBJECT-CONTENT");











    private static final SubLSymbol $IN_REPLY_TO = makeKeyword("IN-REPLY-TO");







    public static final SubLString $str58$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_KQML_OBJECT = makeSymbol("MAKE-KQML-OBJECT");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_KQML_OBJECT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-KQML-OBJECT-METHOD");

    private static final SubLList $list64 = list(makeSymbol("VALUE"), makeSymbol("STRING"));







    private static final SubLString $$$from = makeString("from");

    private static final SubLString $$$to = makeString("to");

    private static final SubLString $str70$in_reply_to = makeString("in-reply-to");

    private static final SubLString $str71$reply_with = makeString("reply-with");

    private static final SubLString $$$language = makeString("language");

    private static final SubLString $$$ontology = makeString("ontology");

    private static final SubLString $$$content = makeString("content");



    private static final SubLList $list76 = list(makeSymbol("PERFORMATIVE"), makeSymbol("SENDER-KEY"), makeSymbol("SENDER"), makeSymbol("RECEIVER-KEY"), makeSymbol("RECEIVER"), makeSymbol("&REST"), makeSymbol("OTHER-KEYS"));

    private static final SubLString $str77$_ = makeString("(");

    private static final SubLString $str78$__SENDER_ = makeString(" :SENDER ");

    private static final SubLString $str79$__RECEIVER_ = makeString(" :RECEIVER ");

    private static final SubLString $str80$__FROM_ = makeString(" :FROM ");

    private static final SubLString $str81$__TO_ = makeString(" :TO ");

    private static final SubLString $str82$__IN_REPLY_TO_ = makeString(" :IN-REPLY-TO ");

    private static final SubLString $str83$__REPLY_WITH_ = makeString(" :REPLY-WITH ");

    private static final SubLString $str84$__LANGUAGE_ = makeString(" :LANGUAGE ");

    private static final SubLString $str85$__ONTOLOGY_ = makeString(" :ONTOLOGY ");

    private static final SubLString $str86$__CONTENT_ = makeString(" :CONTENT ");

    private static final SubLString $str87$_ = makeString(")");



    private static final SubLString $str89$Message__S_couldn_t_be_parsed = makeString("Message ~S couldn't be parsed");



    private static final SubLList $list91 = list(makeString("COMMON-LISP-USER::"));

    private static final SubLString $str92$ = makeString("");

    private static final SubLString $str93$__KQML_message___ = makeString("~%KQML message:~%");

    private static final SubLString $str94$__A__ = makeString("(~A~%");

    private static final SubLString $str95$______sender_______A__ = makeString("     :sender      ~A~%");

    private static final SubLString $str96$______receiver_____A__ = makeString("     :receiver    ~A~%");

    private static final SubLString $str97$______from_________A__ = makeString("     :from        ~A~%");

    private static final SubLString $str98$______to___________A__ = makeString("     :to          ~A~%");

    private static final SubLString $str99$______in_reply_to__A__ = makeString("     :in-reply-to ~A~%");

    private static final SubLString $str100$______language_____A__ = makeString("     :language    ~A~%");

    private static final SubLString $str101$______ontology_____A__ = makeString("     :ontology    ~A~%");

    private static final SubLString $str102$______content______A___ = makeString("     :content     ~A)~%");

    private static final SubLObject $$ReifiableFunction = reader_make_constant_shell(makeString("ReifiableFunction"));

    private static final SubLList $list104 = list(list(makeSymbol("CHANNEL"), makeSymbol("SESSION"), makeSymbol("MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym105$RESPONSE = makeUninternedSymbol("RESPONSE");

    private static final SubLSymbol $sym106$PERFORMATIVE = makeUninternedSymbol("PERFORMATIVE");

    private static final SubLSymbol $sym107$CONTENT = makeUninternedSymbol("CONTENT");

    private static final SubLSymbol $sym108$RETVAL = makeUninternedSymbol("RETVAL");

    private static final SubLSymbol $sym109$CODE = makeUninternedSymbol("CODE");



    public static final SubLList $list111 = list(NIL);

    private static final SubLSymbol IGNORE_ERRORS = makeSymbol("IGNORE-ERRORS");



    private static final SubLSymbol FIRE_SESSION_MACHINE = makeSymbol("FIRE-SESSION-MACHINE");

    private static final SubLSymbol FIRE_SESSION_PORT = makeSymbol("FIRE-SESSION-PORT");

    private static final SubLList $list116 = list(makeKeyword("ACCESS-MODE"), makeKeyword("PRIVATE"));



    private static final SubLSymbol KQML_SEND_MESSAGE = makeSymbol("KQML-SEND-MESSAGE");

    private static final SubLList $list119 = list(makeSymbol("GET-NETWORK-NAME"), list(makeSymbol("GET-MACHINE-NAME"), makeString("unknown")));





    private static final SubLList $list122 = list(list(makeSymbol("KQML-READ-MESSAGE"), makeSymbol("CHANNEL")));





    public static final SubLList $list125 = list(makeString("Message Error"));



    private static final SubLSymbol PERFORMATIVE_EQUAL = makeSymbol("PERFORMATIVE-EQUAL");

    private static final SubLList $list128 = list(makeString("tell"));



    private static final SubLList $list130 = list(makeString("error"));

    private static final SubLList $list131 = list(makeString("tell-error"));



    private static final SubLString $str133$Unknown_response_type__A = makeString("Unknown response type ~A");





    private static final SubLSymbol FIRE_SESSION = makeSymbol("FIRE-SESSION");

    private static final SubLSymbol FIRE_SESSION_P = makeSymbol("FIRE-SESSION-P");

    private static final SubLList $list138 = list(makeSymbol("MACHINE"), makeSymbol("PORT"), makeSymbol("KB-PATH"), makeSymbol("KB-NAME"), makeSymbol("PREDSTYLE"));

    private static final SubLList $list139 = list(makeKeyword("MACHINE"), makeKeyword("PORT"), makeKeyword("KB-PATH"), makeKeyword("KB-NAME"), makeKeyword("PREDSTYLE"));

    private static final SubLList $list140 = list(makeSymbol("FIRE-SESSION-MACHINE"), makeSymbol("FIRE-SESSION-PORT"), makeSymbol("FIRE-SESSION-KB-PATH"), makeSymbol("FIRE-SESSION-KB-NAME"), makeSymbol("FIRE-SESSION-PREDSTYLE"));

    private static final SubLList $list141 = list(makeSymbol("_CSETF-FIRE-SESSION-MACHINE"), makeSymbol("_CSETF-FIRE-SESSION-PORT"), makeSymbol("_CSETF-FIRE-SESSION-KB-PATH"), makeSymbol("_CSETF-FIRE-SESSION-KB-NAME"), makeSymbol("_CSETF-FIRE-SESSION-PREDSTYLE"));

    private static final SubLSymbol FIRE_SESSION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FIRE-SESSION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list143 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FIRE-SESSION-P"));

    private static final SubLSymbol _CSETF_FIRE_SESSION_MACHINE = makeSymbol("_CSETF-FIRE-SESSION-MACHINE");

    private static final SubLSymbol _CSETF_FIRE_SESSION_PORT = makeSymbol("_CSETF-FIRE-SESSION-PORT");

    private static final SubLSymbol FIRE_SESSION_KB_PATH = makeSymbol("FIRE-SESSION-KB-PATH");

    private static final SubLSymbol _CSETF_FIRE_SESSION_KB_PATH = makeSymbol("_CSETF-FIRE-SESSION-KB-PATH");

    private static final SubLSymbol FIRE_SESSION_KB_NAME = makeSymbol("FIRE-SESSION-KB-NAME");

    private static final SubLSymbol _CSETF_FIRE_SESSION_KB_NAME = makeSymbol("_CSETF-FIRE-SESSION-KB-NAME");

    private static final SubLSymbol FIRE_SESSION_PREDSTYLE = makeSymbol("FIRE-SESSION-PREDSTYLE");

    private static final SubLSymbol _CSETF_FIRE_SESSION_PREDSTYLE = makeSymbol("_CSETF-FIRE-SESSION-PREDSTYLE");











    private static final SubLSymbol MAKE_FIRE_SESSION = makeSymbol("MAKE-FIRE-SESSION");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FIRE_SESSION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FIRE-SESSION-METHOD");

    public static final SubLSymbol $current_fire_session$ = makeSymbol("*CURRENT-FIRE-SESSION*");

    private static final SubLList $list160 = list(makeSymbol("SHUTDOWN-SERVER"));

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");



    private static final SubLString $$$unknown = makeString("unknown");

    private static final SubLString $$$Message_Error = makeString("Message Error");

    private static final SubLString $$$tell = makeString("tell");

    private static final SubLString $$$error = makeString("error");

    private static final SubLString $str168$tell_error = makeString("tell-error");

    private static final SubLList $list169 = list(makeKeyword("HYPHEN"), makeKeyword("MIXED-CASE"));

    private static final SubLString $str170$Invalid_predicate_style__S__ = makeString("Invalid predicate style ~S~%");

    private static final SubLSymbol OPEN_KB = makeSymbol("OPEN-KB");







    private static final SubLList $list175 = list(makeSymbol("CLOSE-KB"));

    private static final SubLSymbol NEW_KB = makeSymbol("NEW-KB");

    private static final SubLSymbol DUMP_SME = makeSymbol("DUMP-SME");





    private static final SubLList $list180 = list(makeSymbol("START-SESSION"));

    private static final SubLList $list181 = list(makeSymbol("END-SESSION"));



    private static final SubLSymbol RETRIEVE = makeSymbol("RETRIEVE");







    private static final SubLSymbol FORGET = makeSymbol("FORGET");

    private static final SubLSymbol LOAD_MELD_FILE = makeSymbol("LOAD-MELD-FILE");

    private static final SubLSymbol LOAD_FLAT_FILE = makeSymbol("LOAD-FLAT-FILE");









    private static final SubLSymbol TELL = makeSymbol("TELL");

    private static final SubLSymbol UNTELL = makeSymbol("UNTELL");





    private static final SubLString $str198$_ = makeString("-");

    private static final SubLList $list199 = list(makeSymbol("FUNCTION"), makeSymbol("ID"));

    private static final SubLObject $$ist_Information = reader_make_constant_shell(makeString("ist-Information"));

    private static final SubLSymbol Case = makeSymbol("Case");





    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLSymbol GENERATE_TERM_NAME = makeSymbol("GENERATE-TERM-NAME");

    private static final SubLString $str206$_A_D = makeString("~A~D");

    private static final SubLString $$$CYC = makeString("CYC");

    private static final SubLString $$$nil = makeString("nil");

    private static final SubLObject $$matchBetween = reader_make_constant_shell(makeString("matchBetween"));

    private static final SubLSymbol $sym210$_MATCH = makeSymbol("?MATCH");

    private static final SubLSymbol explicit_case_fn = makeSymbol("explicit-case-fn");

    public static final SubLList $list212 = list(list(makeSymbol("QUOTE"), makeSymbol("?WHAT")));

    public static final SubLList $list213 = list(makeSymbol("PREDICATE"), makeSymbol("CASE-A"), makeSymbol("CASE-B"), makeSymbol("THE-NIL"), makeSymbol("MATCHER-FUNCTION"));

    private static final SubLSymbol and = makeSymbol("and");

    private static final SubLSymbol bestMapping = makeSymbol("bestMapping");

    private static final SubLList $list216 = list(makeSymbol("?M"));

    private static final SubLList $list217 = list(list(makeSymbol("hasCorrespondence"), makeSymbol("?M"), makeSymbol("?MH")), list(makeSymbol("correspondenceBetween"), makeSymbol("?MH"), makeSymbol("?B"), makeSymbol("?T")));

    private static final SubLList $list218 = list(makeSymbol("AND"), makeSymbol("MAPPING"), makeSymbol("HAS-CORRESPONDENCE"), makeSymbol("CORRESPONDENCE"));

    private static final SubLList $list219 = list(makeSymbol("PREDICATE"), makeSymbol("MNFN"), makeSymbol("EXPRESSION-A"), makeSymbol("EXPRESSION-B"));

    private static final SubLList $list220 = list(list(makeSymbol("candidateInferenceOf"), makeSymbol("?CI"), makeSymbol("?M")), list(makeSymbol("candidateInferenceContent"), makeSymbol("?CI"), makeSymbol("?INFERENCE")));

    private static final SubLList $list221 = list(makeSymbol("AND"), makeSymbol("MAPPING"), makeSymbol("CANDINF"), makeSymbol("CONTENT"));

    private static final SubLList $list222 = list(makeSymbol("PREDICATE"), makeSymbol("CIFN"), makeSymbol("EXPRESSION"));



    private static final SubLSymbol $sym224$_WHAT = makeSymbol("?WHAT");

    private static final SubLObject $$FunctionalPredicate = reader_make_constant_shell(makeString("FunctionalPredicate"));

    private static final SubLObject $$Function_Denotational = reader_make_constant_shell(makeString("Function-Denotational"));

    private static final SubLObject $$Predicate = reader_make_constant_shell(makeString("Predicate"));

    private static final SubLObject $$arity = reader_make_constant_shell(makeString("arity"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    public static SubLObject cycl_to_mac_fac(final SubLObject cycl) {
        return transform_list_utilities.transform(cycl_to_mac_fac_transform_isa(cycl), symbol_function(CONSTANT_P), symbol_function(CYC_CONSTANT_TO_MAC_FAC_TERM), UNPROVIDED);
    }

    public static SubLObject mac_fac_to_cycl(final SubLObject mac_fac) {
        return mac_fac_to_cycl_transform_unary(mac_fac_to_cycl_recursive(mac_fac));
    }

    public static SubLObject mac_fac_to_cycl_recursive(final SubLObject mac_fac) {
        if (mac_fac.isKeyword()) {
            return mac_fac;
        }
        if (mac_fac.isSymbol()) {
            final SubLObject constant = mac_fac_term_to_cyc_term(mac_fac);
            if (NIL != constant_p(constant)) {
                return constant;
            }
            return mac_fac;
        } else {
            if (mac_fac.isAtom()) {
                return mac_fac;
            }
            return cons(mac_fac_to_cycl_recursive(mac_fac.first()), mac_fac_to_cycl_recursive(mac_fac.rest()));
        }
    }

    public static SubLObject cycl_to_mac_fac_transform_isa(final SubLObject cycl) {
        return transform_list_utilities.transform(cycl, symbol_function(CYCL_TO_MAC_FAC_TRANSFORM_ISA_TEST), symbol_function(CYCL_TO_MAC_FAC_TRANSFORM_ISA_ACT), UNPROVIDED);
    }

    public static SubLObject cycl_to_mac_fac_transform_isa_test(final SubLObject v_object) {
        return makeBoolean((v_object.isList() && THREE_INTEGER.numE(length(v_object))) && $$isa.eql(v_object.first()));
    }

    public static SubLObject cycl_to_mac_fac_transform_isa_act(final SubLObject v_object) {
        return list(third(v_object), second(v_object));
    }

    public static SubLObject mac_fac_to_cycl_transform_unary(final SubLObject mac_fac) {
        return transform_list_utilities.transform(mac_fac, symbol_function(MAC_FAC_TO_CYCL_TRANSFORM_UNARY_TEST), symbol_function(MAC_FAC_TO_CYCL_TRANSFORM_UNARY_ACT), UNPROVIDED);
    }

    public static SubLObject mac_fac_to_cycl_transform_unary_test(final SubLObject v_object) {
        return makeBoolean(((v_object.isList() && TWO_INTEGER.numE(length(v_object))) && (NIL != forts.fort_p(v_object.first()))) && (NIL != isa.isa_in_any_mtP(v_object.first(), $$Collection)));
    }

    public static SubLObject mac_fac_to_cycl_transform_unary_act(final SubLObject v_object) {
        return list($$isa, second(v_object), v_object.first());
    }

    public static SubLObject clear_cyc_constant_to_mac_fac_term() {
        final SubLObject cs = $cyc_constant_to_mac_fac_term_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cyc_constant_to_mac_fac_term(final SubLObject constant) {
        return memoization_state.caching_state_remove_function_results_with_args($cyc_constant_to_mac_fac_term_caching_state$.getGlobalValue(), list(constant), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cyc_constant_to_mac_fac_term_internal(final SubLObject constant) {
        assert NIL != constant_p(constant) : "constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) " + constant;
        return intern(cyc_name_to_mac_fac_name(constants_high.constant_name(constant)), UNPROVIDED);
    }

    public static SubLObject cyc_constant_to_mac_fac_term(final SubLObject constant) {
        SubLObject caching_state = $cyc_constant_to_mac_fac_term_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CYC_CONSTANT_TO_MAC_FAC_TERM, $cyc_constant_to_mac_fac_term_caching_state$, NIL, EQL, ONE_INTEGER, $int$100);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, constant, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cyc_constant_to_mac_fac_term_internal(constant)));
            memoization_state.caching_state_put(caching_state, constant, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_mac_fac_term_to_cyc_term() {
        final SubLObject cs = $mac_fac_term_to_cyc_term_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_mac_fac_term_to_cyc_term(final SubLObject mac_fac_term) {
        return memoization_state.caching_state_remove_function_results_with_args($mac_fac_term_to_cyc_term_caching_state$.getGlobalValue(), list(mac_fac_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject mac_fac_term_to_cyc_term_internal(final SubLObject mac_fac_term) {
        assert NIL != symbolp(mac_fac_term) : "Types.symbolp(mac_fac_term) " + "CommonSymbols.NIL != Types.symbolp(mac_fac_term) " + mac_fac_term;
        final SubLObject constant_name = mac_fac_name_to_cyc_name(symbol_name(mac_fac_term));
        final SubLObject constant = constant_completion_high.constant_complete(constant_name, NIL, T, UNPROVIDED, UNPROVIDED).first();
        if (NIL != constant_p(constant)) {
            return constant;
        }
        return NIL;
    }

    public static SubLObject mac_fac_term_to_cyc_term(final SubLObject mac_fac_term) {
        SubLObject caching_state = $mac_fac_term_to_cyc_term_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(MAC_FAC_TERM_TO_CYC_TERM, $mac_fac_term_to_cyc_term_caching_state$, NIL, EQL, ONE_INTEGER, $int$100);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mac_fac_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(mac_fac_term_to_cyc_term_internal(mac_fac_term)));
            memoization_state.caching_state_put(caching_state, mac_fac_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject cyc_name_to_mac_fac_name(final SubLObject cyc_name) {
        assert NIL != stringp(cyc_name) : "Types.stringp(cyc_name) " + "CommonSymbols.NIL != Types.stringp(cyc_name) " + cyc_name;
        final SubLObject output_stream = make_string_output_stream();
        SubLObject last_char = NIL;
        SubLObject cdotimes_end_var;
        SubLObject index;
        SubLObject this_char;
        for (cdotimes_end_var = length(cyc_name), index = NIL, index = ZERO_INTEGER; index.numL(cdotimes_end_var); index = add(index, ONE_INTEGER)) {
            this_char = Strings.sublisp_char(cyc_name, index);
            if ((NIL != last_char) && (((last_char.eql(CHAR_hyphen) && (NIL != alpha_char_p(this_char))) || ((NIL != lower_case_p(last_char)) && (NIL != upper_case_p(this_char)))) || ((NIL != digit_char_p(last_char, UNPROVIDED)) && (NIL != alpha_char_p(this_char))))) {
                write_char(CHAR_hyphen, output_stream);
            }
            write_char(char_upcase(this_char), output_stream);
            last_char = this_char;
        }
        return get_output_stream_string(output_stream);
    }

    public static SubLObject mac_fac_name_to_cyc_name(final SubLObject mac_fac_name) {
        assert NIL != stringp(mac_fac_name) : "Types.stringp(mac_fac_name) " + "CommonSymbols.NIL != Types.stringp(mac_fac_name) " + mac_fac_name;
        final SubLObject output_stream = make_string_output_stream();
        SubLObject last_char = NIL;
        SubLObject cdotimes_end_var;
        SubLObject index;
        SubLObject this_char;
        for (cdotimes_end_var = length(mac_fac_name), index = NIL, index = ZERO_INTEGER; index.numL(cdotimes_end_var); index = add(index, ONE_INTEGER)) {
            this_char = Strings.sublisp_char(mac_fac_name, index);
            if ((NIL != last_char) && ((!last_char.eql(CHAR_hyphen)) || (NIL == alpha_char_p(this_char)))) {
                write_char(last_char, output_stream);
            }
            last_char = this_char;
        }
        if (NIL != last_char) {
            write_char(last_char, output_stream);
        }
        return get_output_stream_string(output_stream);
    }

    public static SubLObject kqml_send_message(final SubLObject tcp_channel, final SubLObject sender, final SubLObject receiver, final SubLObject performative, SubLObject content) {
        if (content == UNPROVIDED) {
            content = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != tcp_channel) && (NIL != performative)) {
            final SubLObject kqml_message_string = kqml_message_to_string(kqml_build_message(performative, sender, receiver, list($CONTENT, content)));
            kqml_trace($str15$__KQML_SEND___S, kqml_message_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            write_string(kqml_message_string, tcp_channel, UNPROVIDED, UNPROVIDED);
            write_char($kqml_end_message_char$.getDynamicValue(thread), tcp_channel);
            force_output(tcp_channel);
        }
        return NIL;
    }

    public static SubLObject kqml_read_message(final SubLObject tcp_channel, SubLObject timeout, SubLObject sleep_time) {
        if (timeout == UNPROVIDED) {
            timeout = $kqml_default_read_timeout$.getGlobalValue();
        }
        if (sleep_time == UNPROVIDED) {
            sleep_time = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject out_string = make_string_output_stream();
        SubLObject wait_time;
        SubLObject cur_char;
        for (wait_time = ZERO_INTEGER, cur_char = NIL, cur_char = kqml_read_char(tcp_channel); ((!cur_char.eql($kqml_end_message_char$.getDynamicValue(thread))) && (!cur_char.eql($EOF))) && ((NIL == timeout) || (!wait_time.numG(timeout))); cur_char = kqml_read_char(tcp_channel)) {
            if (NIL != cur_char) {
                wait_time = ZERO_INTEGER;
                write_char(cur_char, out_string);
            } else {
                wait_time = add(wait_time, sleep_time);
                sleep(sleep_time);
            }
        }
        final SubLObject message_string = get_output_stream_string(out_string);
        if (cur_char.eql($kqml_end_message_char$.getDynamicValue(thread))) {
            kqml_trace($str18$__KQML_READ___S, message_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return kqml_string_to_message(message_string);
        }
        kqml_trace($str19$__KQML_READ_TIMEOUT___S, message_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject kqml_read_char(final SubLObject tcp_channel) {
        return read_char_no_hang(tcp_channel, NIL, $EOF, UNPROVIDED);
    }

    public static SubLObject kqml_trace(final SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $kqml_trace$.getDynamicValue(thread)) {
            format(StreamsLow.$standard_output$.getDynamicValue(thread), format_string, new SubLObject[]{ arg1, arg2, arg3, arg4 });
            force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject kqml_object_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject kqml_object_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$kqml_object_native.class ? T : NIL;
    }

    public static SubLObject kqml_object_performative(final SubLObject v_object) {
        assert NIL != kqml_object_p(v_object) : "rkf_collaborator_fire.kqml_object_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject kqml_object_sender(final SubLObject v_object) {
        assert NIL != kqml_object_p(v_object) : "rkf_collaborator_fire.kqml_object_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject kqml_object_receiver(final SubLObject v_object) {
        assert NIL != kqml_object_p(v_object) : "rkf_collaborator_fire.kqml_object_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject kqml_object_from(final SubLObject v_object) {
        assert NIL != kqml_object_p(v_object) : "rkf_collaborator_fire.kqml_object_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject kqml_object_to(final SubLObject v_object) {
        assert NIL != kqml_object_p(v_object) : "rkf_collaborator_fire.kqml_object_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject kqml_object_in_reply_to(final SubLObject v_object) {
        assert NIL != kqml_object_p(v_object) : "rkf_collaborator_fire.kqml_object_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject kqml_object_reply_with(final SubLObject v_object) {
        assert NIL != kqml_object_p(v_object) : "rkf_collaborator_fire.kqml_object_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject kqml_object_language(final SubLObject v_object) {
        assert NIL != kqml_object_p(v_object) : "rkf_collaborator_fire.kqml_object_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject kqml_object_ontology(final SubLObject v_object) {
        assert NIL != kqml_object_p(v_object) : "rkf_collaborator_fire.kqml_object_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject kqml_object_content(final SubLObject v_object) {
        assert NIL != kqml_object_p(v_object) : "rkf_collaborator_fire.kqml_object_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject _csetf_kqml_object_performative(final SubLObject v_object, final SubLObject value) {
        assert NIL != kqml_object_p(v_object) : "rkf_collaborator_fire.kqml_object_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_kqml_object_sender(final SubLObject v_object, final SubLObject value) {
        assert NIL != kqml_object_p(v_object) : "rkf_collaborator_fire.kqml_object_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_kqml_object_receiver(final SubLObject v_object, final SubLObject value) {
        assert NIL != kqml_object_p(v_object) : "rkf_collaborator_fire.kqml_object_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_kqml_object_from(final SubLObject v_object, final SubLObject value) {
        assert NIL != kqml_object_p(v_object) : "rkf_collaborator_fire.kqml_object_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_kqml_object_to(final SubLObject v_object, final SubLObject value) {
        assert NIL != kqml_object_p(v_object) : "rkf_collaborator_fire.kqml_object_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_kqml_object_in_reply_to(final SubLObject v_object, final SubLObject value) {
        assert NIL != kqml_object_p(v_object) : "rkf_collaborator_fire.kqml_object_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_kqml_object_reply_with(final SubLObject v_object, final SubLObject value) {
        assert NIL != kqml_object_p(v_object) : "rkf_collaborator_fire.kqml_object_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_kqml_object_language(final SubLObject v_object, final SubLObject value) {
        assert NIL != kqml_object_p(v_object) : "rkf_collaborator_fire.kqml_object_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_kqml_object_ontology(final SubLObject v_object, final SubLObject value) {
        assert NIL != kqml_object_p(v_object) : "rkf_collaborator_fire.kqml_object_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_kqml_object_content(final SubLObject v_object, final SubLObject value) {
        assert NIL != kqml_object_p(v_object) : "rkf_collaborator_fire.kqml_object_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject make_kqml_object(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $kqml_object_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PERFORMATIVE)) {
                _csetf_kqml_object_performative(v_new, current_value);
            } else
                if (pcase_var.eql($SENDER)) {
                    _csetf_kqml_object_sender(v_new, current_value);
                } else
                    if (pcase_var.eql($RECEIVER)) {
                        _csetf_kqml_object_receiver(v_new, current_value);
                    } else
                        if (pcase_var.eql($FROM)) {
                            _csetf_kqml_object_from(v_new, current_value);
                        } else
                            if (pcase_var.eql($TO)) {
                                _csetf_kqml_object_to(v_new, current_value);
                            } else
                                if (pcase_var.eql($IN_REPLY_TO)) {
                                    _csetf_kqml_object_in_reply_to(v_new, current_value);
                                } else
                                    if (pcase_var.eql($REPLY_WITH)) {
                                        _csetf_kqml_object_reply_with(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($LANGUAGE)) {
                                            _csetf_kqml_object_language(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($ONTOLOGY)) {
                                                _csetf_kqml_object_ontology(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($CONTENT)) {
                                                    _csetf_kqml_object_content(v_new, current_value);
                                                } else {
                                                    Errors.error($str58$Invalid_slot__S_for_construction_, current_arg);
                                                }









        }
        return v_new;
    }

    public static SubLObject visit_defstruct_kqml_object(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_KQML_OBJECT, TEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PERFORMATIVE, kqml_object_performative(obj));
        funcall(visitor_fn, obj, $SLOT, $SENDER, kqml_object_sender(obj));
        funcall(visitor_fn, obj, $SLOT, $RECEIVER, kqml_object_receiver(obj));
        funcall(visitor_fn, obj, $SLOT, $FROM, kqml_object_from(obj));
        funcall(visitor_fn, obj, $SLOT, $TO, kqml_object_to(obj));
        funcall(visitor_fn, obj, $SLOT, $IN_REPLY_TO, kqml_object_in_reply_to(obj));
        funcall(visitor_fn, obj, $SLOT, $REPLY_WITH, kqml_object_reply_with(obj));
        funcall(visitor_fn, obj, $SLOT, $LANGUAGE, kqml_object_language(obj));
        funcall(visitor_fn, obj, $SLOT, $ONTOLOGY, kqml_object_ontology(obj));
        funcall(visitor_fn, obj, $SLOT, $CONTENT, kqml_object_content(obj));
        funcall(visitor_fn, obj, $END, MAKE_KQML_OBJECT, TEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_kqml_object_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_kqml_object(obj, visitor_fn);
    }

    public static SubLObject performative_equal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject value = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list64);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        string = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CAND, list(SYMBOLP, value), list(STRING_EQUAL, list(SYMBOL_NAME, value), string));
        }
        cdestructuring_bind_error(datum, $list64);
        return NIL;
    }

    public static SubLObject kqml_build_message(final SubLObject performative, final SubLObject sender, final SubLObject receiver, SubLObject optional_pairs) {
        if (optional_pairs == UNPROVIDED) {
            optional_pairs = NIL;
        }
        final SubLObject kqml_object = make_kqml_object(UNPROVIDED);
        _csetf_kqml_object_performative(kqml_object, performative);
        _csetf_kqml_object_sender(kqml_object, sender);
        _csetf_kqml_object_receiver(kqml_object, receiver);
        while (NIL != optional_pairs) {
            final SubLObject slot = optional_pairs.first();
            final SubLObject value = second(optional_pairs);
            optional_pairs = cddr(optional_pairs);
            if (slot.isSymbol() && (NIL != Strings.string_equal(symbol_name(slot), $$$from, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                _csetf_kqml_object_from(kqml_object, value);
            } else
                if (slot.isSymbol() && (NIL != Strings.string_equal(symbol_name(slot), $$$to, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    _csetf_kqml_object_to(kqml_object, value);
                } else
                    if (slot.isSymbol() && (NIL != Strings.string_equal(symbol_name(slot), $str70$in_reply_to, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        _csetf_kqml_object_in_reply_to(kqml_object, value);
                    } else
                        if (slot.isSymbol() && (NIL != Strings.string_equal(symbol_name(slot), $str71$reply_with, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                            _csetf_kqml_object_reply_with(kqml_object, value);
                        } else
                            if (slot.isSymbol() && (NIL != Strings.string_equal(symbol_name(slot), $$$language, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                _csetf_kqml_object_language(kqml_object, value);
                            } else
                                if (slot.isSymbol() && (NIL != Strings.string_equal(symbol_name(slot), $$$ontology, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    _csetf_kqml_object_ontology(kqml_object, value);
                                } else {
                                    if ((!slot.isSymbol()) || (NIL == Strings.string_equal(symbol_name(slot), $$$content, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                        continue;
                                    }
                                    _csetf_kqml_object_content(kqml_object, value);
                                }





        } 
        return kqml_object;
    }

    public static SubLObject kqml_list_to_message(final SubLObject list) {
        assert NIL != listp(list) : "Types.listp(list) " + "CommonSymbols.NIL != Types.listp(list) " + list;
        SubLObject performative = NIL;
        SubLObject sender_key = NIL;
        SubLObject sender = NIL;
        SubLObject receiver_key = NIL;
        SubLObject receiver = NIL;
        destructuring_bind_must_consp(list, list, $list76);
        performative = list.first();
        SubLObject current = list.rest();
        destructuring_bind_must_consp(current, list, $list76);
        sender_key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, list, $list76);
        sender = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, list, $list76);
        receiver_key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, list, $list76);
        receiver = current.first();
        final SubLObject other_keys;
        current = other_keys = current.rest();
        return kqml_build_message(performative, sender, receiver, other_keys);
    }

    public static SubLObject kqml_message_to_string(final SubLObject kqml_object) {
        assert NIL != kqml_object_p(kqml_object) : "rkf_collaborator_fire.kqml_object_p(kqml_object) " + "CommonSymbols.NIL != rkf_collaborator_fire.kqml_object_p(kqml_object) " + kqml_object;
        SubLObject string_pieces = list($str77$_);
        SubLObject answer_string = NIL;
        string_pieces = cons(Strings.string(kqml_object_performative(kqml_object)), string_pieces);
        if (NIL != kqml_object_sender(kqml_object)) {
            string_pieces = cons($str78$__SENDER_, string_pieces);
            string_pieces = cons(prin1_to_string(kqml_object_sender(kqml_object)), string_pieces);
        }
        if (NIL != kqml_object_receiver(kqml_object)) {
            string_pieces = cons($str79$__RECEIVER_, string_pieces);
            string_pieces = cons(prin1_to_string(kqml_object_receiver(kqml_object)), string_pieces);
        }
        if (NIL != kqml_object_from(kqml_object)) {
            string_pieces = cons($str80$__FROM_, string_pieces);
            string_pieces = cons(prin1_to_string(kqml_object_from(kqml_object)), string_pieces);
        }
        if (NIL != kqml_object_to(kqml_object)) {
            string_pieces = cons($str81$__TO_, string_pieces);
            string_pieces = cons(prin1_to_string(kqml_object_to(kqml_object)), string_pieces);
        }
        if (NIL != kqml_object_in_reply_to(kqml_object)) {
            string_pieces = cons($str82$__IN_REPLY_TO_, string_pieces);
            string_pieces = cons(prin1_to_string(kqml_object_in_reply_to(kqml_object)), string_pieces);
        }
        if (NIL != kqml_object_reply_with(kqml_object)) {
            string_pieces = cons($str83$__REPLY_WITH_, string_pieces);
            string_pieces = cons(prin1_to_string(kqml_object_reply_with(kqml_object)), string_pieces);
        }
        if (NIL != kqml_object_language(kqml_object)) {
            string_pieces = cons($str84$__LANGUAGE_, string_pieces);
            string_pieces = cons(prin1_to_string(kqml_object_language(kqml_object)), string_pieces);
        }
        if (NIL != kqml_object_ontology(kqml_object)) {
            string_pieces = cons($str85$__ONTOLOGY_, string_pieces);
            string_pieces = cons(prin1_to_string(kqml_object_ontology(kqml_object)), string_pieces);
        }
        if (NIL != kqml_object_content(kqml_object)) {
            string_pieces = cons($str86$__CONTENT_, string_pieces);
            string_pieces = cons(prin1_to_string(kqml_object_content(kqml_object)), string_pieces);
        }
        string_pieces = cons($str87$_, string_pieces);
        string_pieces = nreverse(string_pieces);
        answer_string = apply(symbol_function(CCONCATENATE), string_pieces);
        return answer_string;
    }

    public static SubLObject kqml_string_to_message(SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        string = kqml_frob_string(string);
        final SubLObject list = read_from_kqml_string(string, NIL, $EOF);
        if (list == $EOF) {
            Errors.error($str89$Message__S_couldn_t_be_parsed, string);
        }
        return kqml_list_to_message(list);
    }

    public static SubLObject create_kqml_read_table() {
        final SubLObject kqml_read_table = copy_readtable(NIL, UNPROVIDED);
        _csetf_readtable_case(kqml_read_table, $PRESERVE);
        return kqml_read_table;
    }

    public static SubLObject read_from_kqml_string(final SubLObject string, final SubLObject eof_error_p, final SubLObject eof_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $readtable$.currentBinding(thread);
        try {
            $readtable$.bind($kqml_read_table$.getGlobalValue(), thread);
            result = read_from_string(string, eof_error_p, eof_value, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            $readtable$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject kqml_frob_string(SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = $kmql_package_prefixes$.getDynamicValue(thread);
        SubLObject prefix = NIL;
        prefix = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            string = string_utilities.string_subst($str92$, prefix, string, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            prefix = cdolist_list_var.first();
        } 
        return string;
    }

    public static SubLObject kqml_print_message(final SubLObject kqml_object, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        format(stream, $str93$__KQML_message___);
        format(stream, $str94$__A__, kqml_object_performative(kqml_object));
        format(stream, $str95$______sender_______A__, kqml_object_sender(kqml_object));
        format(stream, $str96$______receiver_____A__, kqml_object_receiver(kqml_object));
        format(stream, $str97$______from_________A__, kqml_object_from(kqml_object));
        format(stream, $str98$______to___________A__, kqml_object_to(kqml_object));
        format(stream, $str99$______in_reply_to__A__, kqml_object_in_reply_to(kqml_object));
        format(stream, $str100$______language_____A__, kqml_object_language(kqml_object));
        format(stream, $str101$______ontology_____A__, kqml_object_ontology(kqml_object));
        format(stream, $str102$______content______A___, kqml_object_content(kqml_object));
        return kqml_object;
    }

    public static SubLObject cycl_expression_to_kqml_expression(final SubLObject expr) {
        if (expr.isSymbol()) {
            return expr;
        }
        if (NIL != constant_p(expr)) {
            return intern(constants_high.constant_name(expr), UNPROVIDED);
        }
        if (NIL != nart_handles.nart_p(expr)) {
            return cycl_expression_to_kqml_expression(narts_high.nart_el_formula(expr));
        }
        if (expr.isAtom()) {
            return expr;
        }
        return cons(cycl_expression_to_kqml_expression(expr.first()), cycl_expression_to_kqml_expression(expr.rest()));
    }

    public static SubLObject kqml_expression_to_cycl_expression(final SubLObject expr) {
        if (expr.isKeyword()) {
            return expr;
        }
        if (expr.isSymbol()) {
            final SubLObject name = symbol_name(expr);
            final SubLObject constant = constants_high.find_constant(name);
            return NIL != constant_p(constant) ? constant : expr;
        }
        if (expr.isAtom()) {
            return expr;
        }
        if (expr.isCons()) {
            SubLObject part = cons(kqml_expression_to_cycl_expression(expr.first()), kqml_expression_to_cycl_expression(expr.rest()));
            if (NIL != is_potential_nat_expressionP(part)) {
                part = kqml_nat_expression_to_nat(part);
            }
            return part;
        }
        return expr;
    }

    public static SubLObject is_potential_nat_expressionP(final SubLObject expr) {
        if (expr.isList()) {
            SubLObject result = NIL;
            result = isa.isa_in_any_mtP(cycl_utilities.formula_arg0(expr), $$ReifiableFunction);
            return result;
        }
        return NIL;
    }

    public static SubLObject kqml_nat_expression_to_nat(final SubLObject expr) {
        final SubLObject nart = narts_high.find_nart(expr);
        return NIL == nart ? expr : nart;
    }

    public static SubLObject with_fire_connection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list104);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject channel = NIL;
        SubLObject session = NIL;
        SubLObject message = NIL;
        destructuring_bind_must_consp(current, datum, $list104);
        channel = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list104);
        session = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list104);
        message = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject response = $sym105$RESPONSE;
            final SubLObject performative = $sym106$PERFORMATIVE;
            final SubLObject content = $sym107$CONTENT;
            final SubLObject retval = $sym108$RETVAL;
            final SubLObject code = $sym109$CODE;
            return list(CLET, list(bq_cons(code, $list111), bq_cons(retval, $list111), bq_cons(response, $list111)), list(IGNORE_ERRORS, list(WITH_TCP_CONNECTION, listS(channel, list(FIRE_SESSION_MACHINE, session), list(FIRE_SESSION_PORT, session), $list116), list(PWHEN, channel, list(KQML_SEND_MESSAGE, channel, $list119, list(FIRE_SESSION_MACHINE, session), $TELL, message), listS(CSETQ, response, $list122), list(PIF, list(NULL, response), listS(CSETQ, retval, NIL, code, $list125), listS(CLET, list(list(performative, list(KQML_OBJECT_PERFORMATIVE, response)), list(content, list(KQML_OBJECT_CONTENT, response))), append(body, list(list(PCOND, list(listS(PERFORMATIVE_EQUAL, performative, $list128), listS(CSETQ, retval, content, code, $list111)), list(list(CAND, list(COR, listS(PERFORMATIVE_EQUAL, performative, $list130), listS(PERFORMATIVE_EQUAL, performative, $list131)), content), list(CSETQ, retval, NIL, code, content)), list(T, list(CSETQ, retval, NIL, code, list(FORMAT, NIL, $str133$Unknown_response_type__A, performative))))))))))), list(RET, list(VALUES, retval, code)));
        }
        cdestructuring_bind_error(datum, $list104);
        return NIL;
    }

    public static SubLObject fire_session_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject fire_session_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$fire_session_native.class ? T : NIL;
    }

    public static SubLObject fire_session_machine(final SubLObject v_object) {
        assert NIL != fire_session_p(v_object) : "rkf_collaborator_fire.fire_session_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject fire_session_port(final SubLObject v_object) {
        assert NIL != fire_session_p(v_object) : "rkf_collaborator_fire.fire_session_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject fire_session_kb_path(final SubLObject v_object) {
        assert NIL != fire_session_p(v_object) : "rkf_collaborator_fire.fire_session_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject fire_session_kb_name(final SubLObject v_object) {
        assert NIL != fire_session_p(v_object) : "rkf_collaborator_fire.fire_session_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject fire_session_predstyle(final SubLObject v_object) {
        assert NIL != fire_session_p(v_object) : "rkf_collaborator_fire.fire_session_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_fire_session_machine(final SubLObject v_object, final SubLObject value) {
        assert NIL != fire_session_p(v_object) : "rkf_collaborator_fire.fire_session_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_fire_session_port(final SubLObject v_object, final SubLObject value) {
        assert NIL != fire_session_p(v_object) : "rkf_collaborator_fire.fire_session_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_fire_session_kb_path(final SubLObject v_object, final SubLObject value) {
        assert NIL != fire_session_p(v_object) : "rkf_collaborator_fire.fire_session_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_fire_session_kb_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != fire_session_p(v_object) : "rkf_collaborator_fire.fire_session_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_fire_session_predstyle(final SubLObject v_object, final SubLObject value) {
        assert NIL != fire_session_p(v_object) : "rkf_collaborator_fire.fire_session_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_fire_session(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $fire_session_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($MACHINE)) {
                _csetf_fire_session_machine(v_new, current_value);
            } else
                if (pcase_var.eql($PORT)) {
                    _csetf_fire_session_port(v_new, current_value);
                } else
                    if (pcase_var.eql($KB_PATH)) {
                        _csetf_fire_session_kb_path(v_new, current_value);
                    } else
                        if (pcase_var.eql($KB_NAME)) {
                            _csetf_fire_session_kb_name(v_new, current_value);
                        } else
                            if (pcase_var.eql($PREDSTYLE)) {
                                _csetf_fire_session_predstyle(v_new, current_value);
                            } else {
                                Errors.error($str58$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_fire_session(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FIRE_SESSION, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $MACHINE, fire_session_machine(obj));
        funcall(visitor_fn, obj, $SLOT, $PORT, fire_session_port(obj));
        funcall(visitor_fn, obj, $SLOT, $KB_PATH, fire_session_kb_path(obj));
        funcall(visitor_fn, obj, $SLOT, $KB_NAME, fire_session_kb_name(obj));
        funcall(visitor_fn, obj, $SLOT, $PREDSTYLE, fire_session_predstyle(obj));
        funcall(visitor_fn, obj, $END, MAKE_FIRE_SESSION, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_fire_session_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_fire_session(obj, visitor_fn);
    }

    public static SubLObject create_fire_session(final SubLObject machine, final SubLObject port) {
        final SubLObject fsession = make_fire_session(UNPROVIDED);
        _csetf_fire_session_machine(fsession, machine);
        _csetf_fire_session_port(fsession, port);
        _csetf_fire_session_kb_path(fsession, NIL);
        _csetf_fire_session_kb_name(fsession, NIL);
        _csetf_fire_session_predstyle(fsession, NIL);
        return fsession;
    }

    public static SubLObject local_fire_session(final SubLObject machine, final SubLObject port) {
        $current_fire_session$.setGlobalValue(create_fire_session(machine, port));
        return $current_fire_session$.getGlobalValue();
    }

    public static SubLObject fire_kill_server(SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = $list160;
        SubLObject code = NIL;
        SubLObject retval = NIL;
        SubLObject response = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), NIL, $PRIVATE);
                        if ((NIL != validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession))) && (NIL != channel)) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name($$$unknown)), fire_session_machine(fsession), $TELL, message);
                            response = kqml_read_message(channel, UNPROVIDED, UNPROVIDED);
                            if (NIL == response) {
                                retval = NIL;
                                code = $$$Message_Error;
                            } else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$tell, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    retval = content;
                                    code = NIL;
                                } else
                                    if (((performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $str168$tell_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) && (NIL != content)) {
                                        retval = NIL;
                                        code = content;
                                    } else {
                                        retval = NIL;
                                        code = format(NIL, $str133$Unknown_response_type__A, performative);
                                    }

                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != channel) {
                                close(channel, UNPROVIDED);
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
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return values(retval, code);
    }

    public static SubLObject fire_open_kb(final SubLObject path, final SubLObject name, final SubLObject predstyle, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.memberP(predstyle, $list169, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str170$Invalid_predicate_style__S__, predstyle);
        }
        final SubLObject message = list(OPEN_KB, $PATH, path, $NAME, name, $PREDICATE_STYLE, predstyle);
        SubLObject code = NIL;
        SubLObject retval = NIL;
        SubLObject response = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), NIL, $PRIVATE);
                        if ((NIL != validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession))) && (NIL != channel)) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name($$$unknown)), fire_session_machine(fsession), $TELL, message);
                            response = kqml_read_message(channel, UNPROVIDED, UNPROVIDED);
                            if (NIL == response) {
                                retval = NIL;
                                code = $$$Message_Error;
                            } else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                _csetf_fire_session_kb_path(fsession, path);
                                _csetf_fire_session_kb_name(fsession, name);
                                _csetf_fire_session_predstyle(fsession, predstyle);
                                if (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$tell, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    retval = content;
                                    code = NIL;
                                } else
                                    if (((performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $str168$tell_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) && (NIL != content)) {
                                        retval = NIL;
                                        code = content;
                                    } else {
                                        retval = NIL;
                                        code = format(NIL, $str133$Unknown_response_type__A, performative);
                                    }

                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != channel) {
                                close(channel, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
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
        return values(retval, code);
    }

    public static SubLObject fire_close_kb(SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        fire_end_session(fsession);
        final SubLObject message = $list175;
        SubLObject code = NIL;
        SubLObject retval = NIL;
        SubLObject response = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), NIL, $PRIVATE);
                        if ((NIL != validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession))) && (NIL != channel)) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name($$$unknown)), fire_session_machine(fsession), $TELL, message);
                            response = kqml_read_message(channel, UNPROVIDED, UNPROVIDED);
                            if (NIL == response) {
                                retval = NIL;
                                code = $$$Message_Error;
                            } else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$tell, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    retval = content;
                                    code = NIL;
                                } else
                                    if (((performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $str168$tell_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) && (NIL != content)) {
                                        retval = NIL;
                                        code = content;
                                    } else {
                                        retval = NIL;
                                        code = format(NIL, $str133$Unknown_response_type__A, performative);
                                    }

                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != channel) {
                                close(channel, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
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
        return values(retval, code);
    }

    public static SubLObject fire_new_kb(final SubLObject path, final SubLObject name, final SubLObject predstyle, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = list(NEW_KB, $PATH, path, $NAME, name, $PREDICATE_STYLE, predstyle);
        SubLObject code = NIL;
        SubLObject retval = NIL;
        SubLObject response = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), NIL, $PRIVATE);
                        if ((NIL != validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession))) && (NIL != channel)) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name($$$unknown)), fire_session_machine(fsession), $TELL, message);
                            response = kqml_read_message(channel, UNPROVIDED, UNPROVIDED);
                            if (NIL == response) {
                                retval = NIL;
                                code = $$$Message_Error;
                            } else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                _csetf_fire_session_kb_path(fsession, path);
                                _csetf_fire_session_kb_name(fsession, name);
                                _csetf_fire_session_predstyle(fsession, predstyle);
                                if (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$tell, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    retval = content;
                                    code = NIL;
                                } else
                                    if (((performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $str168$tell_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) && (NIL != content)) {
                                        retval = NIL;
                                        code = content;
                                    } else {
                                        retval = NIL;
                                        code = format(NIL, $str133$Unknown_response_type__A, performative);
                                    }

                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != channel) {
                                close(channel, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
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
        return values(retval, code);
    }

    public static SubLObject fire_flush(SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLObject path = fire_session_kb_path(fsession);
        final SubLObject name = fire_session_kb_name(fsession);
        final SubLObject predstyle = fire_session_predstyle(fsession);
        fire_close_kb(fsession);
        return fire_open_kb(path, name, predstyle, fsession);
    }

    public static SubLObject fire_dump_sme(final SubLObject id, final SubLObject filename, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = list(DUMP_SME, $SME_ID, id, $FILE, filename);
        SubLObject code = NIL;
        SubLObject retval = NIL;
        SubLObject response = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), NIL, $PRIVATE);
                        if ((NIL != validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession))) && (NIL != channel)) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name($$$unknown)), fire_session_machine(fsession), $TELL, message);
                            response = kqml_read_message(channel, UNPROVIDED, UNPROVIDED);
                            if (NIL == response) {
                                retval = NIL;
                                code = $$$Message_Error;
                            } else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$tell, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    retval = content;
                                    code = NIL;
                                } else
                                    if (((performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $str168$tell_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) && (NIL != content)) {
                                        retval = NIL;
                                        code = content;
                                    } else {
                                        retval = NIL;
                                        code = format(NIL, $str133$Unknown_response_type__A, performative);
                                    }

                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != channel) {
                                close(channel, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
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
        return values(retval, code);
    }

    public static SubLObject fire_start_session(SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = $list180;
        SubLObject code = NIL;
        SubLObject retval = NIL;
        SubLObject response = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), NIL, $PRIVATE);
                        if ((NIL != validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession))) && (NIL != channel)) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name($$$unknown)), fire_session_machine(fsession), $TELL, message);
                            response = kqml_read_message(channel, UNPROVIDED, UNPROVIDED);
                            if (NIL == response) {
                                retval = NIL;
                                code = $$$Message_Error;
                            } else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$tell, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    retval = content;
                                    code = NIL;
                                } else
                                    if (((performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $str168$tell_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) && (NIL != content)) {
                                        retval = NIL;
                                        code = content;
                                    } else {
                                        retval = NIL;
                                        code = format(NIL, $str133$Unknown_response_type__A, performative);
                                    }

                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != channel) {
                                close(channel, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                        }
                    }
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
        return values(retval, code);
    }

    public static SubLObject fire_end_session(SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = $list181;
        SubLObject code = NIL;
        SubLObject retval = NIL;
        SubLObject response = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), NIL, $PRIVATE);
                        if ((NIL != validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession))) && (NIL != channel)) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name($$$unknown)), fire_session_machine(fsession), $TELL, message);
                            response = kqml_read_message(channel, UNPROVIDED, UNPROVIDED);
                            if (NIL == response) {
                                retval = NIL;
                                code = $$$Message_Error;
                            } else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$tell, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    retval = content;
                                    code = NIL;
                                } else
                                    if (((performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $str168$tell_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) && (NIL != content)) {
                                        retval = NIL;
                                        code = content;
                                    } else {
                                        retval = NIL;
                                        code = format(NIL, $str133$Unknown_response_type__A, performative);
                                    }

                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != channel) {
                                close(channel, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                        }
                    }
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
        return values(retval, code);
    }

    public static SubLObject fire_retrieve(final SubLObject query, SubLObject number, SubLObject fsession) {
        if (number == UNPROVIDED) {
            number = $ALL;
        }
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = list(RETRIEVE, $QUERY, query, number);
        SubLObject code = NIL;
        SubLObject retval = NIL;
        SubLObject response = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), NIL, $PRIVATE);
                        if ((NIL != validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession))) && (NIL != channel)) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name($$$unknown)), fire_session_machine(fsession), $TELL, message);
                            response = kqml_read_message(channel, UNPROVIDED, UNPROVIDED);
                            if (NIL == response) {
                                retval = NIL;
                                code = $$$Message_Error;
                            } else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$tell, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    retval = content;
                                    code = NIL;
                                } else
                                    if (((performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $str168$tell_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) && (NIL != content)) {
                                        retval = NIL;
                                        code = content;
                                    } else {
                                        retval = NIL;
                                        code = format(NIL, $str133$Unknown_response_type__A, performative);
                                    }

                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != channel) {
                                close(channel, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                        }
                    }
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
        return values(retval, code);
    }

    public static SubLObject fire_store(final SubLObject fact, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = list(STORE, $FACT, fact);
        SubLObject code = NIL;
        SubLObject retval = NIL;
        SubLObject response = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), NIL, $PRIVATE);
                        if ((NIL != validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession))) && (NIL != channel)) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name($$$unknown)), fire_session_machine(fsession), $TELL, message);
                            response = kqml_read_message(channel, UNPROVIDED, UNPROVIDED);
                            if (NIL == response) {
                                retval = NIL;
                                code = $$$Message_Error;
                            } else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$tell, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    retval = content;
                                    code = NIL;
                                } else
                                    if (((performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $str168$tell_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) && (NIL != content)) {
                                        retval = NIL;
                                        code = content;
                                    } else {
                                        retval = NIL;
                                        code = format(NIL, $str133$Unknown_response_type__A, performative);
                                    }

                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != channel) {
                                close(channel, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                        }
                    }
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
        return values(retval, code);
    }

    public static SubLObject fire_forget(final SubLObject fact, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = list(FORGET, $FACT, fact);
        SubLObject code = NIL;
        SubLObject retval = NIL;
        SubLObject response = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), NIL, $PRIVATE);
                        if ((NIL != validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession))) && (NIL != channel)) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name($$$unknown)), fire_session_machine(fsession), $TELL, message);
                            response = kqml_read_message(channel, UNPROVIDED, UNPROVIDED);
                            if (NIL == response) {
                                retval = NIL;
                                code = $$$Message_Error;
                            } else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$tell, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    retval = content;
                                    code = NIL;
                                } else
                                    if (((performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $str168$tell_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) && (NIL != content)) {
                                        retval = NIL;
                                        code = content;
                                    } else {
                                        retval = NIL;
                                        code = format(NIL, $str133$Unknown_response_type__A, performative);
                                    }

                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != channel) {
                                close(channel, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
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
        return values(retval, code);
    }

    public static SubLObject fire_retrieve_cycl(final SubLObject cycl_query, SubLObject number, SubLObject fsession) {
        if (number == UNPROVIDED) {
            number = $ALL;
        }
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = cycl_expression_to_kqml_expression(cycl_query);
        thread.resetMultipleValues();
        final SubLObject answers = fire_retrieve(query, number, fsession);
        final SubLObject status = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != answers) && (NIL == status)) {
            return kqml_expression_to_cycl_expression(answers);
        }
        return NIL;
    }

    public static SubLObject fire_store_cycl(final SubLObject cycl_fact, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLObject fact = cycl_expression_to_kqml_expression(cycl_fact);
        return fire_store(fact, fsession);
    }

    public static SubLObject fire_forget_cycl(final SubLObject cycl_fact, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLObject fact = cycl_expression_to_kqml_expression(cycl_fact);
        return fire_forget(fact, fsession);
    }

    public static SubLObject fire_load_meld_file(final SubLObject filename, SubLObject auto_flushP, SubLObject fsession) {
        if (auto_flushP == UNPROVIDED) {
            auto_flushP = T;
        }
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = list(LOAD_MELD_FILE, $FILE, filename);
        SubLObject code = NIL;
        SubLObject retval = NIL;
        SubLObject response = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), NIL, $PRIVATE);
                        if ((NIL != validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession))) && (NIL != channel)) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name($$$unknown)), fire_session_machine(fsession), $TELL, message);
                            response = kqml_read_message(channel, UNPROVIDED, UNPROVIDED);
                            if (NIL == response) {
                                retval = NIL;
                                code = $$$Message_Error;
                            } else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$tell, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    retval = content;
                                    code = NIL;
                                } else
                                    if (((performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $str168$tell_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) && (NIL != content)) {
                                        retval = NIL;
                                        code = content;
                                    } else {
                                        retval = NIL;
                                        code = format(NIL, $str133$Unknown_response_type__A, performative);
                                    }

                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != channel) {
                                close(channel, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                        }
                    }
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
        return values(retval, code);
    }

    public static SubLObject fire_load_flat_file(final SubLObject filename, final SubLObject legacyP, SubLObject auto_flushP, SubLObject fsession) {
        if (auto_flushP == UNPROVIDED) {
            auto_flushP = T;
        }
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = list(LOAD_FLAT_FILE, $FILE, filename, $LEGACY_, legacyP);
        SubLObject code = NIL;
        SubLObject retval = NIL;
        SubLObject response = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), NIL, $PRIVATE);
                        if ((NIL != validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession))) && (NIL != channel)) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name($$$unknown)), fire_session_machine(fsession), $TELL, message);
                            response = kqml_read_message(channel, UNPROVIDED, UNPROVIDED);
                            if (NIL == response) {
                                retval = NIL;
                                code = $$$Message_Error;
                            } else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$tell, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    retval = content;
                                    code = NIL;
                                } else
                                    if (((performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $str168$tell_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) && (NIL != content)) {
                                        retval = NIL;
                                        code = content;
                                    } else {
                                        retval = NIL;
                                        code = format(NIL, $str133$Unknown_response_type__A, performative);
                                    }

                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != channel) {
                                close(channel, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                        }
                    }
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
        return values(retval, code);
    }

    public static SubLObject fire_ask(final SubLObject query, SubLObject number, SubLObject fsession) {
        if (number == UNPROVIDED) {
            number = $ALL;
        }
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = (number == $SUPPRESS) ? list(ASK, $QUERY, query) : list(ASK, $QUERY, query, $NUMBER, number);
        SubLObject code = NIL;
        SubLObject retval = NIL;
        SubLObject response = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), NIL, $PRIVATE);
                        if ((NIL != validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession))) && (NIL != channel)) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name($$$unknown)), fire_session_machine(fsession), $TELL, message);
                            response = kqml_read_message(channel, UNPROVIDED, UNPROVIDED);
                            if (NIL == response) {
                                retval = NIL;
                                code = $$$Message_Error;
                            } else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$tell, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    retval = content;
                                    code = NIL;
                                } else
                                    if (((performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $str168$tell_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) && (NIL != content)) {
                                        retval = NIL;
                                        code = content;
                                    } else {
                                        retval = NIL;
                                        code = format(NIL, $str133$Unknown_response_type__A, performative);
                                    }

                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != channel) {
                                close(channel, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                        }
                    }
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
        return values(retval, code);
    }

    public static SubLObject fire_tell(final SubLObject fact, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = list(TELL, $FACT, fact);
        SubLObject code = NIL;
        SubLObject retval = NIL;
        SubLObject response = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), NIL, $PRIVATE);
                        if ((NIL != validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession))) && (NIL != channel)) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name($$$unknown)), fire_session_machine(fsession), $TELL, message);
                            response = kqml_read_message(channel, UNPROVIDED, UNPROVIDED);
                            if (NIL == response) {
                                retval = NIL;
                                code = $$$Message_Error;
                            } else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$tell, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    retval = content;
                                    code = NIL;
                                } else
                                    if (((performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $str168$tell_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) && (NIL != content)) {
                                        retval = NIL;
                                        code = content;
                                    } else {
                                        retval = NIL;
                                        code = format(NIL, $str133$Unknown_response_type__A, performative);
                                    }

                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != channel) {
                                close(channel, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                        }
                    }
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
        return values(retval, code);
    }

    public static SubLObject fire_untell(final SubLObject fact, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = list(UNTELL, $FACT, fact);
        SubLObject code = NIL;
        SubLObject retval = NIL;
        SubLObject response = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(fire_session_machine(fsession), fire_session_port(fsession), NIL, $PRIVATE);
                        if ((NIL != validate_tcp_connection(channel, fire_session_machine(fsession), fire_session_port(fsession))) && (NIL != channel)) {
                            kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name($$$unknown)), fire_session_machine(fsession), $TELL, message);
                            response = kqml_read_message(channel, UNPROVIDED, UNPROVIDED);
                            if (NIL == response) {
                                retval = NIL;
                                code = $$$Message_Error;
                            } else {
                                final SubLObject performative = kqml_object_performative(response);
                                final SubLObject content = kqml_object_content(response);
                                if (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$tell, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    retval = content;
                                    code = NIL;
                                } else
                                    if (((performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $$$error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (performative.isSymbol() && (NIL != Strings.string_equal(symbol_name(performative), $str168$tell_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) && (NIL != content)) {
                                        retval = NIL;
                                        code = content;
                                    } else {
                                        retval = NIL;
                                        code = format(NIL, $str133$Unknown_response_type__A, performative);
                                    }

                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != channel) {
                                close(channel, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                        }
                    }
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
        return values(retval, code);
    }

    public static SubLObject fire_ask_cycl(final SubLObject cycl_query, SubLObject number, SubLObject fsession) {
        if (number == UNPROVIDED) {
            number = $ALL;
        }
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = cycl_expression_to_kqml_expression(cycl_query);
        thread.resetMultipleValues();
        final SubLObject answers = fire_ask(query, number, fsession);
        final SubLObject status = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != answers) && (NIL == status)) {
            return kqml_expression_to_cycl_expression(answers);
        }
        return NIL;
    }

    public static SubLObject fire_tell_cycl(final SubLObject cycl_fact, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLObject fact = cycl_expression_to_kqml_expression(cycl_fact);
        return fire_tell(fact, fsession);
    }

    public static SubLObject fire_untell_cycl(final SubLObject cycl_fact, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLObject fact = cycl_expression_to_kqml_expression(cycl_fact);
        return fire_untell(fact, fsession);
    }

    public static SubLObject make_fire_analogy_of_terms(final SubLObject term_a, final SubLObject term_b, final SubLObject mt, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        SubLObject matcher_fns = NIL;
        SubLObject results = NIL;
        make_fire_case_for_term(term_a, mt, $TELL, fsession);
        make_fire_case_for_term(term_b, mt, $TELL, fsession);
        matcher_fns = fire_perform_match_between(term_a, term_b, fsession);
        SubLObject cdolist_list_var;
        matcher_fns = cdolist_list_var = fire_extract_matcher_functions(matcher_fns);
        SubLObject matcher_function = NIL;
        matcher_function = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject raw_correspondences = fire_determine_correspondences_for_match(matcher_function, fsession);
            final SubLObject correspondences = fire_align_matched_correspondences(raw_correspondences);
            final SubLObject raw_inferences = fire_find_candidate_inferences_for_match(matcher_function, fsession);
            final SubLObject inferences = fire_extract_candidate_inferences(raw_inferences);
            results = cons(list(list($CORRESPONDENCES, correspondences), list($INFERENCES, inferences)), results);
            cdolist_list_var = cdolist_list_var.rest();
            matcher_function = cdolist_list_var.first();
        } 
        fire_trace_analogy_sme(term_a, term_b, mt, matcher_fns, fsession);
        return results;
    }

    public static SubLObject fire_trace_analogy_sme(final SubLObject term_a, final SubLObject term_b, final SubLObject mt, final SubLObject matcher_fns, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $rkf_fire_trace_analogy$.getDynamicValue(thread)) {
            final SubLObject path = fire_session_kb_path(fsession);
            final SubLObject prefix = cconcatenate(kb_paths.fort_name(term_a), new SubLObject[]{ $str198$_, kb_paths.fort_name(term_b), $str198$_, kb_paths.fort_name(mt) });
            SubLObject cdolist_list_var = matcher_fns;
            SubLObject matcher = NIL;
            matcher = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = matcher;
                SubLObject function = NIL;
                SubLObject id = NIL;
                destructuring_bind_must_consp(current, datum, $list199);
                function = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list199);
                id = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject matcher_id = id;
                    final SubLObject filename = cconcatenate(path, new SubLObject[]{ prefix, string_utilities.to_string(matcher_id) });
                    fire_dump_sme(matcher_id, filename, fsession);
                } else {
                    cdestructuring_bind_error(datum, $list199);
                }
                cdolist_list_var = cdolist_list_var.rest();
                matcher = cdolist_list_var.first();
            } 
        }
        return fsession;
    }

    public static SubLObject make_fire_case_for_term(final SubLObject v_term, final SubLObject mt, SubLObject style, SubLObject fsession) {
        if (style == UNPROVIDED) {
            style = $TELL;
        }
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLObject v_case = generate_fire_case_term(v_term);
        SubLObject cdolist_list_var;
        final SubLObject statements = cdolist_list_var = rkf_concept_summarizer.rkf_summarize_all(v_term, mt);
        SubLObject view = NIL;
        view = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject aspect = view.first();
            SubLObject cdolist_list_var_$16;
            final SubLObject formulas = cdolist_list_var_$16 = second(view);
            SubLObject formula = NIL;
            formula = cdolist_list_var_$16.first();
            while (NIL != cdolist_list_var_$16) {
                final SubLObject full_formula;
                final SubLObject el_formula = full_formula = generate_true_el_formula(formula);
                final SubLObject cycl_fact = list($$ist_Information, v_case, full_formula);
                make_fire_cycl_statement(cycl_fact, style, fsession);
                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                formula = cdolist_list_var_$16.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            view = cdolist_list_var.first();
        } 
        if (NIL != statements) {
            final SubLObject case_expr = list($$isa, v_case, Case);
            make_fire_cycl_statement(case_expr, style, fsession);
        }
        return v_case;
    }

    public static SubLObject make_fire_cycl_statement(final SubLObject cycl_expr, SubLObject style, SubLObject fsession) {
        if (style == UNPROVIDED) {
            style = $TELL;
        }
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLObject pcase_var = style;
        if (pcase_var.eql($TELL)) {
            fire_tell_cycl(cycl_expr, fsession);
        } else
            if (pcase_var.eql($STORE)) {
                fire_store_cycl(cycl_expr, fsession);
            } else {
                print(cycl_expr, UNPROVIDED);
            }

        return cycl_expr;
    }

    public static SubLObject generate_true_el_formula(final SubLObject pseudo_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            assertion = czer_meta.find_assertion_cycl(pseudo_formula, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL == assertion) {
            return pseudo_formula;
        }
        if (assertion.isList()) {
            assertion = assertion.first();
        }
        return uncanonicalizer.assertion_el_formula(assertion);
    }

    public static SubLObject generate_term_id(final SubLObject v_term) {
        return NIL != nart_handles.nart_p(v_term) ? nart_handles.nart_id(v_term) : constants_high.constant_internal_id(v_term);
    }

    public static SubLObject generate_term_name(final SubLObject v_term) {
        if (NIL != constant_p(v_term)) {
            return cconcatenate(constants_high.constant_name(v_term), $str198$_);
        }
        final SubLObject formula = narts_high.nart_el_formula(v_term);
        return apply(CCONCATENATE, Mapping.mapcar(GENERATE_TERM_NAME, formula));
    }

    public static SubLObject generate_fire_case_name(final SubLObject v_term) {
        final SubLObject suid = generate_term_id(v_term);
        final SubLObject name = generate_term_name(v_term);
        return format(NIL, $str206$_A_D, name, suid);
    }

    public static SubLObject generate_fire_case_term(final SubLObject v_term) {
        return intern(generate_fire_case_name(v_term), $$$CYC);
    }

    public static SubLObject fire_perform_match_between(final SubLObject term_a, final SubLObject term_b, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLObject case_a = generate_fire_case_term(term_a);
        final SubLObject case_b = generate_fire_case_term(term_b);
        return fire_perform_match_between_internal(case_a, case_b, fsession);
    }

    public static SubLObject fire_perform_match_between_internal(final SubLObject case_a, final SubLObject case_b, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLObject case_fn_a = make_fire_casefn_statement(case_a);
        final SubLObject case_fn_b = make_fire_casefn_statement(case_b);
        final SubLObject match = list($$matchBetween, case_fn_a, case_fn_b, $fire_server_nil$.getGlobalValue(), $sym210$_MATCH);
        return fire_ask_cycl(match, $SUPPRESS, fsession);
    }

    public static SubLObject make_fire_casefn_statement(final SubLObject v_case) {
        return list(explicit_case_fn, v_case);
    }

    public static SubLObject fire_enumerate_case(final SubLObject v_term, SubLObject stream, SubLObject fsession) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLObject v_case = generate_fire_case_term(v_term);
        print(fire_ask_cycl(listS($$isa, v_case, $list212), $ALL, fsession), stream);
        print(fire_ask_cycl(listS($$ist_Information, make_fire_casefn_statement(v_case), $list212), $ALL, fsession), UNPROVIDED);
        return v_term;
    }

    public static SubLObject fire_extract_matcher_functions(final SubLObject results) {
        SubLObject matcher_functions = NIL;
        SubLObject cdolist_list_var = results;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject predicate = NIL;
            SubLObject case_a = NIL;
            SubLObject case_b = NIL;
            SubLObject the_nil = NIL;
            SubLObject matcher_function = NIL;
            destructuring_bind_must_consp(current, datum, $list213);
            predicate = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list213);
            case_a = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list213);
            case_b = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list213);
            the_nil = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list213);
            matcher_function = current.first();
            current = current.rest();
            if (NIL == current) {
                matcher_functions = cons(matcher_function, matcher_functions);
            } else {
                cdestructuring_bind_error(datum, $list213);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return matcher_functions;
    }

    public static SubLObject fire_determine_correspondences_for_match(final SubLObject matcher_function, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLObject query = listS(and, listS(bestMapping, matcher_function, $list216), $list217);
        SubLObject correspondences = NIL;
        correspondences = fire_ask(query, $SUPPRESS, fsession);
        return correspondences;
    }

    public static SubLObject fire_align_matched_correspondences(final SubLObject results) {
        SubLObject correspondences = NIL;
        SubLObject cdolist_list_var = results;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject and = NIL;
            SubLObject mapping = NIL;
            SubLObject has_correspondence = NIL;
            SubLObject correspondence = NIL;
            destructuring_bind_must_consp(current, datum, $list218);
            and = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list218);
            mapping = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list218);
            has_correspondence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list218);
            correspondence = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject current_$18;
                final SubLObject datum_$17 = current_$18 = correspondence;
                SubLObject predicate = NIL;
                SubLObject mnfn = NIL;
                SubLObject expression_a = NIL;
                SubLObject expression_b = NIL;
                destructuring_bind_must_consp(current_$18, datum_$17, $list219);
                predicate = current_$18.first();
                current_$18 = current_$18.rest();
                destructuring_bind_must_consp(current_$18, datum_$17, $list219);
                mnfn = current_$18.first();
                current_$18 = current_$18.rest();
                destructuring_bind_must_consp(current_$18, datum_$17, $list219);
                expression_a = current_$18.first();
                current_$18 = current_$18.rest();
                destructuring_bind_must_consp(current_$18, datum_$17, $list219);
                expression_b = current_$18.first();
                current_$18 = current_$18.rest();
                if (NIL == current_$18) {
                    correspondences = cons(list(expression_a, expression_b), correspondences);
                } else {
                    cdestructuring_bind_error(datum_$17, $list219);
                }
            } else {
                cdestructuring_bind_error(datum, $list218);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return kqml_expression_to_cycl_expression(correspondences);
    }

    public static SubLObject fire_find_candidate_inferences_for_match(final SubLObject matcher_function, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLObject query = listS(and, listS(bestMapping, matcher_function, $list216), $list220);
        SubLObject inferences = NIL;
        inferences = fire_ask(query, $SUPPRESS, fsession);
        return inferences;
    }

    public static SubLObject fire_extract_candidate_inferences(final SubLObject results) {
        SubLObject inferences = NIL;
        SubLObject cdolist_list_var = results;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = result;
            SubLObject and = NIL;
            SubLObject mapping = NIL;
            SubLObject candinf = NIL;
            SubLObject content = NIL;
            destructuring_bind_must_consp(current, datum, $list221);
            and = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list221);
            mapping = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list221);
            candinf = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list221);
            content = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject current_$20;
                final SubLObject datum_$19 = current_$20 = content;
                SubLObject predicate = NIL;
                SubLObject cifn = NIL;
                SubLObject expression = NIL;
                destructuring_bind_must_consp(current_$20, datum_$19, $list222);
                predicate = current_$20.first();
                current_$20 = current_$20.rest();
                destructuring_bind_must_consp(current_$20, datum_$19, $list222);
                cifn = current_$20.first();
                current_$20 = current_$20.rest();
                destructuring_bind_must_consp(current_$20, datum_$19, $list222);
                expression = current_$20.first();
                current_$20 = current_$20.rest();
                if (NIL == current_$20) {
                    inferences = cons(expression, inferences);
                } else {
                    cdestructuring_bind_error(datum_$19, $list222);
                }
            } else {
                cdestructuring_bind_error(datum, $list221);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return kqml_expression_to_cycl_expression(inferences);
    }

    public static SubLObject determine_missing_fire_terms(final SubLObject formulas, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLObject terms = list_utilities.tree_gather(formulas, FORT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject missing = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != is_undefined_in_fireP(v_term, fsession)) {
                missing = cons(v_term, missing);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return missing;
    }

    public static SubLObject is_undefined_in_fireP(final SubLObject v_term, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = list($$isa, v_term, $sym224$_WHAT);
        thread.resetMultipleValues();
        final SubLObject v_answer = fire_ask_cycl(query, $ALL, fsession);
        final SubLObject status = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return sublisp_null(v_answer);
    }

    public static SubLObject missing_term_classifier(SubLObject terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicates = NIL;
        SubLObject collections = NIL;
        SubLObject v_instances = NIL;
        SubLObject functions = NIL;
        SubLObject v_term;
        SubLObject cdolist_list_var;
        SubLObject sub_terms;
        SubLObject sub;
        SubLObject item_var;
        SubLObject _prev_bind_0;
        SubLObject _prev_bind_2;
        for (v_term = terms.first(), terms = terms.rest(); NIL != v_term; v_term = terms.first() , terms = terms.rest()) {
            if (NIL != nart_handles.nart_p(v_term)) {
                sub_terms = cdolist_list_var = list_utilities.flatten(narts_high.nart_el_formula(v_term));
                sub = NIL;
                sub = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    item_var = sub;
                    if (NIL == member(item_var, terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                        terms = cons(item_var, terms);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sub = cdolist_list_var.first();
                } 
            }
            _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                if (NIL != fort_types_interface.predicateP(v_term)) {
                    predicates = cons(v_term, predicates);
                } else
                    if ((NIL != isa.isaP(v_term, $$FunctionalPredicate, UNPROVIDED, UNPROVIDED)) || (NIL != isa.isaP(v_term, $$Function_Denotational, UNPROVIDED, UNPROVIDED))) {
                        functions = cons(v_term, functions);
                    } else
                        if (NIL != fort_types_interface.collectionP(v_term)) {
                            collections = cons(v_term, collections);
                        } else {
                            v_instances = cons(v_term, v_instances);
                        }


            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return list(cons($$Function_Denotational, functions), cons($$Predicate, predicates), cons($$Collection, collections), cons($$isa, v_instances));
    }

    public static SubLObject tell_fire_about_a_predicate(final SubLObject pred, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_arity = NIL;
        SubLObject type = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var;
            final SubLObject v_instances = cdolist_list_var = isa.min_isa(pred, UNPROVIDED, UNPROVIDED);
            SubLObject instance = NIL;
            instance = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                type = cons(instance, type);
                cdolist_list_var = cdolist_list_var.rest();
                instance = cdolist_list_var.first();
            } 
            v_arity = arity.arity(pred);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        fire_tell_cycl(list($$arity, pred, v_arity), fsession);
        SubLObject cdolist_list_var2 = type;
        SubLObject item = NIL;
        item = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            fire_tell_cycl(list($$isa, pred, item), fsession);
            cdolist_list_var2 = cdolist_list_var2.rest();
            item = cdolist_list_var2.first();
        } 
        return pred;
    }

    public static SubLObject tell_fire_about_a_function(final SubLObject func, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject types = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var;
            final SubLObject v_instances = cdolist_list_var = isa.min_isa(func, UNPROVIDED, UNPROVIDED);
            SubLObject instance = NIL;
            instance = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                types = cons(instance, types);
                cdolist_list_var = cdolist_list_var.rest();
                instance = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var2 = types;
        SubLObject type = NIL;
        type = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            fire_tell_cycl(list($$isa, func, type), fsession);
            cdolist_list_var2 = cdolist_list_var2.rest();
            type = cdolist_list_var2.first();
        } 
        return func;
    }

    public static SubLObject tell_fire_about_a_collection(final SubLObject col, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject isas = NIL;
        SubLObject cols = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var;
            final SubLObject v_instances = cdolist_list_var = isa.min_isa(col, UNPROVIDED, UNPROVIDED);
            SubLObject instance = NIL;
            instance = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                isas = cons(instance, isas);
                cdolist_list_var = cdolist_list_var.rest();
                instance = cdolist_list_var.first();
            } 
            isas = cons($$Collection, isas);
            final SubLObject collections = cdolist_list_var = genls.min_genls(col, UNPROVIDED, UNPROVIDED);
            SubLObject collection = NIL;
            collection = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cols = cons(collection, cols);
                cdolist_list_var = cdolist_list_var.rest();
                collection = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var2 = isas;
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            fire_tell_cycl(list($$isa, col, v_isa), fsession);
            cdolist_list_var2 = cdolist_list_var2.rest();
            v_isa = cdolist_list_var2.first();
        } 
        cdolist_list_var2 = cols;
        SubLObject a_col = NIL;
        a_col = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            fire_tell_cycl(list($$genls, col, a_col), fsession);
            cdolist_list_var2 = cdolist_list_var2.rest();
            a_col = cdolist_list_var2.first();
        } 
        return col;
    }

    public static SubLObject tell_fire_about_an_instance(final SubLObject v_term, SubLObject fsession) {
        if (fsession == UNPROVIDED) {
            fsession = $current_fire_session$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject types = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var;
            final SubLObject v_instances = cdolist_list_var = isa.min_isa(v_term, UNPROVIDED, UNPROVIDED);
            SubLObject instance = NIL;
            instance = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                types = cons(instance, types);
                cdolist_list_var = cdolist_list_var.rest();
                instance = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var2 = types;
        SubLObject type = NIL;
        type = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            fire_tell_cycl(list($$isa, v_term, type), fsession);
            cdolist_list_var2 = cdolist_list_var2.rest();
            type = cdolist_list_var2.first();
        } 
        return v_term;
    }

    public static SubLObject declare_rkf_collaborator_fire_file() {
        declareFunction(me, "cycl_to_mac_fac", "CYCL-TO-MAC-FAC", 1, 0, false);
        declareFunction(me, "mac_fac_to_cycl", "MAC-FAC-TO-CYCL", 1, 0, false);
        declareFunction(me, "mac_fac_to_cycl_recursive", "MAC-FAC-TO-CYCL-RECURSIVE", 1, 0, false);
        declareFunction(me, "cycl_to_mac_fac_transform_isa", "CYCL-TO-MAC-FAC-TRANSFORM-ISA", 1, 0, false);
        declareFunction(me, "cycl_to_mac_fac_transform_isa_test", "CYCL-TO-MAC-FAC-TRANSFORM-ISA-TEST", 1, 0, false);
        declareFunction(me, "cycl_to_mac_fac_transform_isa_act", "CYCL-TO-MAC-FAC-TRANSFORM-ISA-ACT", 1, 0, false);
        declareFunction(me, "mac_fac_to_cycl_transform_unary", "MAC-FAC-TO-CYCL-TRANSFORM-UNARY", 1, 0, false);
        declareFunction(me, "mac_fac_to_cycl_transform_unary_test", "MAC-FAC-TO-CYCL-TRANSFORM-UNARY-TEST", 1, 0, false);
        declareFunction(me, "mac_fac_to_cycl_transform_unary_act", "MAC-FAC-TO-CYCL-TRANSFORM-UNARY-ACT", 1, 0, false);
        declareFunction(me, "clear_cyc_constant_to_mac_fac_term", "CLEAR-CYC-CONSTANT-TO-MAC-FAC-TERM", 0, 0, false);
        declareFunction(me, "remove_cyc_constant_to_mac_fac_term", "REMOVE-CYC-CONSTANT-TO-MAC-FAC-TERM", 1, 0, false);
        declareFunction(me, "cyc_constant_to_mac_fac_term_internal", "CYC-CONSTANT-TO-MAC-FAC-TERM-INTERNAL", 1, 0, false);
        declareFunction(me, "cyc_constant_to_mac_fac_term", "CYC-CONSTANT-TO-MAC-FAC-TERM", 1, 0, false);
        declareFunction(me, "clear_mac_fac_term_to_cyc_term", "CLEAR-MAC-FAC-TERM-TO-CYC-TERM", 0, 0, false);
        declareFunction(me, "remove_mac_fac_term_to_cyc_term", "REMOVE-MAC-FAC-TERM-TO-CYC-TERM", 1, 0, false);
        declareFunction(me, "mac_fac_term_to_cyc_term_internal", "MAC-FAC-TERM-TO-CYC-TERM-INTERNAL", 1, 0, false);
        declareFunction(me, "mac_fac_term_to_cyc_term", "MAC-FAC-TERM-TO-CYC-TERM", 1, 0, false);
        declareFunction(me, "cyc_name_to_mac_fac_name", "CYC-NAME-TO-MAC-FAC-NAME", 1, 0, false);
        declareFunction(me, "mac_fac_name_to_cyc_name", "MAC-FAC-NAME-TO-CYC-NAME", 1, 0, false);
        declareFunction(me, "kqml_send_message", "KQML-SEND-MESSAGE", 4, 1, false);
        declareFunction(me, "kqml_read_message", "KQML-READ-MESSAGE", 1, 2, false);
        declareFunction(me, "kqml_read_char", "KQML-READ-CHAR", 1, 0, false);
        declareFunction(me, "kqml_trace", "KQML-TRACE", 1, 4, false);
        declareFunction(me, "kqml_object_print_function_trampoline", "KQML-OBJECT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "kqml_object_p", "KQML-OBJECT-P", 1, 0, false);
        new rkf_collaborator_fire.$kqml_object_p$UnaryFunction();
        declareFunction(me, "kqml_object_performative", "KQML-OBJECT-PERFORMATIVE", 1, 0, false);
        declareFunction(me, "kqml_object_sender", "KQML-OBJECT-SENDER", 1, 0, false);
        declareFunction(me, "kqml_object_receiver", "KQML-OBJECT-RECEIVER", 1, 0, false);
        declareFunction(me, "kqml_object_from", "KQML-OBJECT-FROM", 1, 0, false);
        declareFunction(me, "kqml_object_to", "KQML-OBJECT-TO", 1, 0, false);
        declareFunction(me, "kqml_object_in_reply_to", "KQML-OBJECT-IN-REPLY-TO", 1, 0, false);
        declareFunction(me, "kqml_object_reply_with", "KQML-OBJECT-REPLY-WITH", 1, 0, false);
        declareFunction(me, "kqml_object_language", "KQML-OBJECT-LANGUAGE", 1, 0, false);
        declareFunction(me, "kqml_object_ontology", "KQML-OBJECT-ONTOLOGY", 1, 0, false);
        declareFunction(me, "kqml_object_content", "KQML-OBJECT-CONTENT", 1, 0, false);
        declareFunction(me, "_csetf_kqml_object_performative", "_CSETF-KQML-OBJECT-PERFORMATIVE", 2, 0, false);
        declareFunction(me, "_csetf_kqml_object_sender", "_CSETF-KQML-OBJECT-SENDER", 2, 0, false);
        declareFunction(me, "_csetf_kqml_object_receiver", "_CSETF-KQML-OBJECT-RECEIVER", 2, 0, false);
        declareFunction(me, "_csetf_kqml_object_from", "_CSETF-KQML-OBJECT-FROM", 2, 0, false);
        declareFunction(me, "_csetf_kqml_object_to", "_CSETF-KQML-OBJECT-TO", 2, 0, false);
        declareFunction(me, "_csetf_kqml_object_in_reply_to", "_CSETF-KQML-OBJECT-IN-REPLY-TO", 2, 0, false);
        declareFunction(me, "_csetf_kqml_object_reply_with", "_CSETF-KQML-OBJECT-REPLY-WITH", 2, 0, false);
        declareFunction(me, "_csetf_kqml_object_language", "_CSETF-KQML-OBJECT-LANGUAGE", 2, 0, false);
        declareFunction(me, "_csetf_kqml_object_ontology", "_CSETF-KQML-OBJECT-ONTOLOGY", 2, 0, false);
        declareFunction(me, "_csetf_kqml_object_content", "_CSETF-KQML-OBJECT-CONTENT", 2, 0, false);
        declareFunction(me, "make_kqml_object", "MAKE-KQML-OBJECT", 0, 1, false);
        declareFunction(me, "visit_defstruct_kqml_object", "VISIT-DEFSTRUCT-KQML-OBJECT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_kqml_object_method", "VISIT-DEFSTRUCT-OBJECT-KQML-OBJECT-METHOD", 2, 0, false);
        declareMacro(me, "performative_equal", "PERFORMATIVE-EQUAL");
        declareFunction(me, "kqml_build_message", "KQML-BUILD-MESSAGE", 3, 1, false);
        declareFunction(me, "kqml_list_to_message", "KQML-LIST-TO-MESSAGE", 1, 0, false);
        declareFunction(me, "kqml_message_to_string", "KQML-MESSAGE-TO-STRING", 1, 0, false);
        declareFunction(me, "kqml_string_to_message", "KQML-STRING-TO-MESSAGE", 1, 0, false);
        declareFunction(me, "create_kqml_read_table", "CREATE-KQML-READ-TABLE", 0, 0, false);
        declareFunction(me, "read_from_kqml_string", "READ-FROM-KQML-STRING", 3, 0, false);
        declareFunction(me, "kqml_frob_string", "KQML-FROB-STRING", 1, 0, false);
        declareFunction(me, "kqml_print_message", "KQML-PRINT-MESSAGE", 1, 1, false);
        declareFunction(me, "cycl_expression_to_kqml_expression", "CYCL-EXPRESSION-TO-KQML-EXPRESSION", 1, 0, false);
        declareFunction(me, "kqml_expression_to_cycl_expression", "KQML-EXPRESSION-TO-CYCL-EXPRESSION", 1, 0, false);
        declareFunction(me, "is_potential_nat_expressionP", "IS-POTENTIAL-NAT-EXPRESSION?", 1, 0, false);
        declareFunction(me, "kqml_nat_expression_to_nat", "KQML-NAT-EXPRESSION-TO-NAT", 1, 0, false);
        declareMacro(me, "with_fire_connection", "WITH-FIRE-CONNECTION");
        declareFunction(me, "fire_session_print_function_trampoline", "FIRE-SESSION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "fire_session_p", "FIRE-SESSION-P", 1, 0, false);
        new rkf_collaborator_fire.$fire_session_p$UnaryFunction();
        declareFunction(me, "fire_session_machine", "FIRE-SESSION-MACHINE", 1, 0, false);
        declareFunction(me, "fire_session_port", "FIRE-SESSION-PORT", 1, 0, false);
        declareFunction(me, "fire_session_kb_path", "FIRE-SESSION-KB-PATH", 1, 0, false);
        declareFunction(me, "fire_session_kb_name", "FIRE-SESSION-KB-NAME", 1, 0, false);
        declareFunction(me, "fire_session_predstyle", "FIRE-SESSION-PREDSTYLE", 1, 0, false);
        declareFunction(me, "_csetf_fire_session_machine", "_CSETF-FIRE-SESSION-MACHINE", 2, 0, false);
        declareFunction(me, "_csetf_fire_session_port", "_CSETF-FIRE-SESSION-PORT", 2, 0, false);
        declareFunction(me, "_csetf_fire_session_kb_path", "_CSETF-FIRE-SESSION-KB-PATH", 2, 0, false);
        declareFunction(me, "_csetf_fire_session_kb_name", "_CSETF-FIRE-SESSION-KB-NAME", 2, 0, false);
        declareFunction(me, "_csetf_fire_session_predstyle", "_CSETF-FIRE-SESSION-PREDSTYLE", 2, 0, false);
        declareFunction(me, "make_fire_session", "MAKE-FIRE-SESSION", 0, 1, false);
        declareFunction(me, "visit_defstruct_fire_session", "VISIT-DEFSTRUCT-FIRE-SESSION", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_fire_session_method", "VISIT-DEFSTRUCT-OBJECT-FIRE-SESSION-METHOD", 2, 0, false);
        declareFunction(me, "create_fire_session", "CREATE-FIRE-SESSION", 2, 0, false);
        declareFunction(me, "local_fire_session", "LOCAL-FIRE-SESSION", 2, 0, false);
        declareFunction(me, "fire_kill_server", "FIRE-KILL-SERVER", 0, 1, false);
        declareFunction(me, "fire_open_kb", "FIRE-OPEN-KB", 3, 1, false);
        declareFunction(me, "fire_close_kb", "FIRE-CLOSE-KB", 0, 1, false);
        declareFunction(me, "fire_new_kb", "FIRE-NEW-KB", 3, 1, false);
        declareFunction(me, "fire_flush", "FIRE-FLUSH", 0, 1, false);
        declareFunction(me, "fire_dump_sme", "FIRE-DUMP-SME", 2, 1, false);
        declareFunction(me, "fire_start_session", "FIRE-START-SESSION", 0, 1, false);
        declareFunction(me, "fire_end_session", "FIRE-END-SESSION", 0, 1, false);
        declareFunction(me, "fire_retrieve", "FIRE-RETRIEVE", 1, 2, false);
        declareFunction(me, "fire_store", "FIRE-STORE", 1, 1, false);
        declareFunction(me, "fire_forget", "FIRE-FORGET", 1, 1, false);
        declareFunction(me, "fire_retrieve_cycl", "FIRE-RETRIEVE-CYCL", 1, 2, false);
        declareFunction(me, "fire_store_cycl", "FIRE-STORE-CYCL", 1, 1, false);
        declareFunction(me, "fire_forget_cycl", "FIRE-FORGET-CYCL", 1, 1, false);
        declareFunction(me, "fire_load_meld_file", "FIRE-LOAD-MELD-FILE", 1, 2, false);
        declareFunction(me, "fire_load_flat_file", "FIRE-LOAD-FLAT-FILE", 2, 2, false);
        declareFunction(me, "fire_ask", "FIRE-ASK", 1, 2, false);
        declareFunction(me, "fire_tell", "FIRE-TELL", 1, 1, false);
        declareFunction(me, "fire_untell", "FIRE-UNTELL", 1, 1, false);
        declareFunction(me, "fire_ask_cycl", "FIRE-ASK-CYCL", 1, 2, false);
        declareFunction(me, "fire_tell_cycl", "FIRE-TELL-CYCL", 1, 1, false);
        declareFunction(me, "fire_untell_cycl", "FIRE-UNTELL-CYCL", 1, 1, false);
        declareFunction(me, "make_fire_analogy_of_terms", "MAKE-FIRE-ANALOGY-OF-TERMS", 3, 1, false);
        declareFunction(me, "fire_trace_analogy_sme", "FIRE-TRACE-ANALOGY-SME", 4, 1, false);
        declareFunction(me, "make_fire_case_for_term", "MAKE-FIRE-CASE-FOR-TERM", 2, 2, false);
        declareFunction(me, "make_fire_cycl_statement", "MAKE-FIRE-CYCL-STATEMENT", 1, 2, false);
        declareFunction(me, "generate_true_el_formula", "GENERATE-TRUE-EL-FORMULA", 1, 0, false);
        declareFunction(me, "generate_term_id", "GENERATE-TERM-ID", 1, 0, false);
        declareFunction(me, "generate_term_name", "GENERATE-TERM-NAME", 1, 0, false);
        declareFunction(me, "generate_fire_case_name", "GENERATE-FIRE-CASE-NAME", 1, 0, false);
        declareFunction(me, "generate_fire_case_term", "GENERATE-FIRE-CASE-TERM", 1, 0, false);
        declareFunction(me, "fire_perform_match_between", "FIRE-PERFORM-MATCH-BETWEEN", 2, 1, false);
        declareFunction(me, "fire_perform_match_between_internal", "FIRE-PERFORM-MATCH-BETWEEN-INTERNAL", 2, 1, false);
        declareFunction(me, "make_fire_casefn_statement", "MAKE-FIRE-CASEFN-STATEMENT", 1, 0, false);
        declareFunction(me, "fire_enumerate_case", "FIRE-ENUMERATE-CASE", 1, 2, false);
        declareFunction(me, "fire_extract_matcher_functions", "FIRE-EXTRACT-MATCHER-FUNCTIONS", 1, 0, false);
        declareFunction(me, "fire_determine_correspondences_for_match", "FIRE-DETERMINE-CORRESPONDENCES-FOR-MATCH", 1, 1, false);
        declareFunction(me, "fire_align_matched_correspondences", "FIRE-ALIGN-MATCHED-CORRESPONDENCES", 1, 0, false);
        declareFunction(me, "fire_find_candidate_inferences_for_match", "FIRE-FIND-CANDIDATE-INFERENCES-FOR-MATCH", 1, 1, false);
        declareFunction(me, "fire_extract_candidate_inferences", "FIRE-EXTRACT-CANDIDATE-INFERENCES", 1, 0, false);
        declareFunction(me, "determine_missing_fire_terms", "DETERMINE-MISSING-FIRE-TERMS", 1, 1, false);
        declareFunction(me, "is_undefined_in_fireP", "IS-UNDEFINED-IN-FIRE?", 1, 1, false);
        declareFunction(me, "missing_term_classifier", "MISSING-TERM-CLASSIFIER", 1, 0, false);
        declareFunction(me, "tell_fire_about_a_predicate", "TELL-FIRE-ABOUT-A-PREDICATE", 1, 1, false);
        declareFunction(me, "tell_fire_about_a_function", "TELL-FIRE-ABOUT-A-FUNCTION", 1, 1, false);
        declareFunction(me, "tell_fire_about_a_collection", "TELL-FIRE-ABOUT-A-COLLECTION", 1, 1, false);
        declareFunction(me, "tell_fire_about_an_instance", "TELL-FIRE-ABOUT-AN-INSTANCE", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_rkf_collaborator_fire_file() {
        deflexical("*CYC-CONSTANT-TO-MAC-FAC-TERM-CACHING-STATE*", NIL);
        deflexical("*MAC-FAC-TERM-TO-CYC-TERM-CACHING-STATE*", NIL);
        defparameter("*KQML-END-MESSAGE-CHAR*", code_char(FOURTEEN_INTEGER));
        deflexical("*KQML-DEFAULT-READ-TIMEOUT*", multiply($int$60, THREE_INTEGER));
        defparameter("*KQML-TRACE*", T);
        defconstant("*DTP-KQML-OBJECT*", KQML_OBJECT);
        deflexical("*KQML-READ-TABLE*", create_kqml_read_table());
        defparameter("*KMQL-PACKAGE-PREFIXES*", $list91);
        defconstant("*DTP-FIRE-SESSION*", FIRE_SESSION);
        deflexical("*CURRENT-FIRE-SESSION*", SubLTrampolineFile.maybeDefault($current_fire_session$, $current_fire_session$, NIL));
        defparameter("*RKF-FIRE-TRACE-ANALOGY*", NIL);
        defconstant("*FIRE-SERVER-NIL*", intern($$$nil, $$$CYC));
        return NIL;
    }

    public static SubLObject setup_rkf_collaborator_fire_file() {
        memoization_state.note_globally_cached_function(CYC_CONSTANT_TO_MAC_FAC_TERM);
        memoization_state.note_globally_cached_function(MAC_FAC_TERM_TO_CYC_TERM);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_kqml_object$.getGlobalValue(), symbol_function(KQML_OBJECT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list28);
        def_csetf(KQML_OBJECT_PERFORMATIVE, _CSETF_KQML_OBJECT_PERFORMATIVE);
        def_csetf(KQML_OBJECT_SENDER, _CSETF_KQML_OBJECT_SENDER);
        def_csetf(KQML_OBJECT_RECEIVER, _CSETF_KQML_OBJECT_RECEIVER);
        def_csetf(KQML_OBJECT_FROM, _CSETF_KQML_OBJECT_FROM);
        def_csetf(KQML_OBJECT_TO, _CSETF_KQML_OBJECT_TO);
        def_csetf(KQML_OBJECT_IN_REPLY_TO, _CSETF_KQML_OBJECT_IN_REPLY_TO);
        def_csetf(KQML_OBJECT_REPLY_WITH, _CSETF_KQML_OBJECT_REPLY_WITH);
        def_csetf(KQML_OBJECT_LANGUAGE, _CSETF_KQML_OBJECT_LANGUAGE);
        def_csetf(KQML_OBJECT_ONTOLOGY, _CSETF_KQML_OBJECT_ONTOLOGY);
        def_csetf(KQML_OBJECT_CONTENT, _CSETF_KQML_OBJECT_CONTENT);
        identity(KQML_OBJECT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_kqml_object$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_KQML_OBJECT_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_fire_session$.getGlobalValue(), symbol_function(FIRE_SESSION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list143);
        def_csetf(FIRE_SESSION_MACHINE, _CSETF_FIRE_SESSION_MACHINE);
        def_csetf(FIRE_SESSION_PORT, _CSETF_FIRE_SESSION_PORT);
        def_csetf(FIRE_SESSION_KB_PATH, _CSETF_FIRE_SESSION_KB_PATH);
        def_csetf(FIRE_SESSION_KB_NAME, _CSETF_FIRE_SESSION_KB_NAME);
        def_csetf(FIRE_SESSION_PREDSTYLE, _CSETF_FIRE_SESSION_PREDSTYLE);
        identity(FIRE_SESSION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_fire_session$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FIRE_SESSION_METHOD));
        declare_defglobal($current_fire_session$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_collaborator_fire_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_collaborator_fire_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_collaborator_fire_file();
    }

    

    public static final class $kqml_object_native extends SubLStructNative {
        public SubLObject $performative;

        public SubLObject $sender;

        public SubLObject $receiver;

        public SubLObject $from;

        public SubLObject $to;

        public SubLObject $in_reply_to;

        public SubLObject $reply_with;

        public SubLObject $language;

        public SubLObject $ontology;

        public SubLObject $content;

        private static final SubLStructDeclNative structDecl;

        private $kqml_object_native() {
            this.$performative = Lisp.NIL;
            this.$sender = Lisp.NIL;
            this.$receiver = Lisp.NIL;
            this.$from = Lisp.NIL;
            this.$to = Lisp.NIL;
            this.$in_reply_to = Lisp.NIL;
            this.$reply_with = Lisp.NIL;
            this.$language = Lisp.NIL;
            this.$ontology = Lisp.NIL;
            this.$content = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$performative;
        }

        @Override
        public SubLObject getField3() {
            return this.$sender;
        }

        @Override
        public SubLObject getField4() {
            return this.$receiver;
        }

        @Override
        public SubLObject getField5() {
            return this.$from;
        }

        @Override
        public SubLObject getField6() {
            return this.$to;
        }

        @Override
        public SubLObject getField7() {
            return this.$in_reply_to;
        }

        @Override
        public SubLObject getField8() {
            return this.$reply_with;
        }

        @Override
        public SubLObject getField9() {
            return this.$language;
        }

        @Override
        public SubLObject getField10() {
            return this.$ontology;
        }

        @Override
        public SubLObject getField11() {
            return this.$content;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$performative = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$sender = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$receiver = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$from = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$to = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$in_reply_to = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$reply_with = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$language = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$ontology = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$content = value;
        }

        static {
            structDecl = makeStructDeclNative($kqml_object_native.class, KQML_OBJECT, KQML_OBJECT_P, $list22, $list23, new String[]{ "$performative", "$sender", "$receiver", "$from", "$to", "$in_reply_to", "$reply_with", "$language", "$ontology", "$content" }, $list24, $list25, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $kqml_object_p$UnaryFunction extends UnaryFunction {
        public $kqml_object_p$UnaryFunction() {
            super(extractFunctionNamed("KQML-OBJECT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return kqml_object_p(arg1);
        }
    }

    public static final class $fire_session_native extends SubLStructNative {
        public SubLObject $machine;

        public SubLObject $port;

        public SubLObject $kb_path;

        public SubLObject $kb_name;

        public SubLObject $predstyle;

        private static final SubLStructDeclNative structDecl;

        private $fire_session_native() {
            this.$machine = Lisp.NIL;
            this.$port = Lisp.NIL;
            this.$kb_path = Lisp.NIL;
            this.$kb_name = Lisp.NIL;
            this.$predstyle = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$machine;
        }

        @Override
        public SubLObject getField3() {
            return this.$port;
        }

        @Override
        public SubLObject getField4() {
            return this.$kb_path;
        }

        @Override
        public SubLObject getField5() {
            return this.$kb_name;
        }

        @Override
        public SubLObject getField6() {
            return this.$predstyle;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$machine = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$port = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$kb_path = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$kb_name = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$predstyle = value;
        }

        static {
            structDecl = makeStructDeclNative($fire_session_native.class, FIRE_SESSION, FIRE_SESSION_P, $list138, $list139, new String[]{ "$machine", "$port", "$kb_path", "$kb_name", "$predstyle" }, $list140, $list141, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $fire_session_p$UnaryFunction extends UnaryFunction {
        public $fire_session_p$UnaryFunction() {
            super(extractFunctionNamed("FIRE-SESSION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return fire_session_p(arg1);
        }
    }
}

/**
 * Total time: 1108 ms
 */
