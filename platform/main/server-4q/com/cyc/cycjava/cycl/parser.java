package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.validate_tcp_connection;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.substitute;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.finish_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class parser extends SubLTranslatedFile {
    public static final SubLFile me = new parser();

    public static final String myName = "com.cyc.cycjava.cycl.parser";

    public static final String myFingerPrint = "19781d685a5ff35cd3b0a22b8f498b743cfe5310a061d21f74578d4ef5347369";

    // defparameter
    public static final SubLSymbol $default_parser_timeout$ = makeSymbol("*DEFAULT-PARSER-TIMEOUT*");



    // deflexical
    // Is the charniak server available? Values are T, Nil or :untested
    private static final SubLSymbol $charniak_available$ = makeSymbol("*CHARNIAK-AVAILABLE*");







    // defparameter
    private static final SubLSymbol $stanford_parser$ = makeSymbol("*STANFORD-PARSER*");

    // deflexical
    // Is the stanford server available? Values are T, Nil or :untested
    private static final SubLSymbol $stanford_available$ = makeSymbol("*STANFORD-AVAILABLE*");



    // defparameter
    public static final SubLSymbol $aux_word_strings$ = makeSymbol("*AUX-WORD-STRINGS*");











    // deflexical
    private static final SubLSymbol $link_parser_server_os_process_name$ = makeSymbol("*LINK-PARSER-SERVER-OS-PROCESS-NAME*");

    // deflexical
    private static final SubLSymbol $link_parser_server_proxy_process_name$ = makeSymbol("*LINK-PARSER-SERVER-PROXY-PROCESS-NAME*");

    private static final SubLInteger $int$10000 = makeInteger(10000);





    public static final SubLList $list3 = list(list(makeSymbol("ERROR-HANDLING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TIMEOUT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE"), list(makeSymbol("TEXT"), makeSymbol("&OPTIONAL"), makeSymbol("LEXICON"), makeSymbol("CONTEXT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HANDLE-ERROR"), list(makeSymbol("ERROR")), makeKeyword("PRIVATE")));







    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PARSER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARSER-CLASS");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PARSER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARSER-INSTANCE");



    public static final SubLList $list12 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list13 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("ERROR-HANDLING"), makeKeyword("THROW")), list(makeSymbol("CSETQ"), makeSymbol("TIMEOUT"), makeInteger(90)), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym14$OUTER_CATCH_FOR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PARSER-METHOD");



    private static final SubLInteger $int$90 = makeInteger(90);

    public static final SubLSymbol PARSER_INITIALIZE_METHOD = makeSymbol("PARSER-INITIALIZE-METHOD");



    public static final SubLList $list19 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list20 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    public static final SubLList $list21 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PRINT-CLASS-INSTANCE"), list(makeSymbol("SELF"), makeSymbol("STREAM"), makeKeyword("NUMBER"), NIL, makeKeyword("IDENTITY"), T), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(Error handling: ~S)"), makeSymbol("ERROR-HANDLING"))), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol $sym22$OUTER_CATCH_FOR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PARSER-METHOD");



    private static final SubLString $str24$__A = makeString("-~A");

    private static final SubLString $str25$_Error_handling___S_ = makeString("(Error handling: ~S)");

    private static final SubLSymbol PARSER_PRINT_METHOD = makeSymbol("PARSER-PRINT-METHOD");





    private static final SubLList $list29 = list(makeKeyword("THROW"), makeKeyword("WARN"), makeKeyword("IGNORE"));

    private static final SubLString $str30$Invalid_error_handling_tag__a = makeString("Invalid error-handling tag ~a");

    private static final SubLString $str31$Invalid_timeout__a = makeString("Invalid timeout ~a");



    private static final SubLList $list33 = list(makeSymbol("ERROR"));

    private static final SubLList $list34 = list(list(makeSymbol("PCASE"), makeSymbol("ERROR-HANDLING"), list(makeKeyword("THROW"), list(makeSymbol("ERROR"), makeSymbol("ERROR"))), list(makeKeyword("WARN"), list(makeSymbol("WARN"), makeSymbol("ERROR")))));

    private static final SubLSymbol $sym35$OUTER_CATCH_FOR_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PARSER-METHOD");



    private static final SubLSymbol PARSER_HANDLE_ERROR_METHOD = makeSymbol("PARSER-HANDLE-ERROR-METHOD");

    private static final SubLList $list38 = list(makeString("external.charniak.host"));

    private static final SubLSymbol $charniak_parser_host$ = makeSymbol("*CHARNIAK-PARSER-HOST*");

    private static final SubLString $str40$charniakparser_cyc_com = makeString("charniakparser.cyc.com");



    private static final SubLSymbol CHARNIAK_PARSER = makeSymbol("CHARNIAK-PARSER");

    private static final SubLList $list43 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE"), list(makeSymbol("TEXT")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CHARNIAK_PARSER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CHARNIAK-PARSER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CHARNIAK_PARSER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CHARNIAK-PARSER-INSTANCE");





    private static final SubLString $$$Dogs_sleep = makeString("Dogs sleep");

    private static final SubLList $list49 = list(list(makeKeyword("S1"), list(makeKeyword("S"), list(makeKeyword("NP"), list(makeKeyword("NNS"), makeString("Dogs"))), list(makeKeyword("VP"), list(makeKeyword("VBP"), makeString("sleep"))))));

    private static final SubLSymbol PARSE_MULTIPLE = makeSymbol("PARSE-MULTIPLE");

    private static final SubLList $list51 = list(makeSymbol("TEXT"), makeSymbol("&OPTIONAL"), makeSymbol("LEXICON"), list(makeSymbol("CONTEXT"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("PARSE-TREE-CONTEXT")))));

    public static final SubLList $list52 = list(makeString("@param TEXT stringp; one or more English sentences, one per line\n   @return listp; the list of most likely parses for TEXT, one for each \n     sentence/line"), list(makeSymbol("CLET"), list(makeSymbol("PARSES"), makeSymbol("ERROR"), makeSymbol("TIMEOUT?"), makeSymbol("TREES")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")), list(makeSymbol("WITH-TIMEOUT"), list(makeSymbol("TIMEOUT"), makeSymbol("TIMEOUT?")), list(makeSymbol("CSETQ"), makeSymbol("PARSES"), list(makeSymbol("CHARNIAK-PARSE"), makeSymbol("TEXT"))), list(makeSymbol("PWHEN"), makeSymbol("TIMEOUT?"), list(makeSymbol("ERROR"), makeString("Charniak Parser timed out after ~a seconds"), makeSymbol("TIMEOUT")))), list(makeSymbol("PWHEN"), makeSymbol("ERROR"), list(makeSymbol("HANDLE-ERROR"), makeSymbol("SELF"), makeSymbol("ERROR")))), list(makeSymbol("CDOLIST"), list(makeSymbol("PARSE-EXPRESSION"), makeSymbol("PARSES")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-PARSE-TREE"), list(makeSymbol("RETAG"), list(makeSymbol("STRIP-SHELL"), makeSymbol("PARSE-EXPRESSION"))), makeSymbol("LEXICON"), makeSymbol("CONTEXT")), makeSymbol("TREES"))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), makeSymbol("TREES")))));



    private static final SubLSymbol $sym54$OUTER_CATCH_FOR_CHARNIAK_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CHARNIAK-PARSER-METHOD");

    private static final SubLString $str55$Charniak_Parser_timed_out_after__ = makeString("Charniak Parser timed out after ~a seconds");

    private static final SubLSymbol CHARNIAK_PARSER_PARSE_MULTIPLE_METHOD = makeSymbol("CHARNIAK-PARSER-PARSE-MULTIPLE-METHOD");

    private static final SubLList $list57 = list(makeKeyword("S1"), makeKeyword("ROOT"));



    private static final SubLList $list59 = list(makeString("@param TEXT stringp; a single English sentence\n   @return parse-tree-p; the most likely parse of TEXT"), list(makeSymbol("CHECK-TYPE"), makeSymbol("TEXT"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("CONTEXT"), makeSymbol("PARSE-TREE-CONTEXT-P")), list(makeSymbol("CLET"), list(list(makeSymbol("PARSE"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PARSE-MULTIPLE")), list(makeSymbol("SUBSTITUTE"), CHAR_space, CHAR_newline, makeSymbol("TEXT")), makeSymbol("LEXICON"), makeSymbol("CONTEXT"))))), list(makeSymbol("PWHEN"), makeSymbol("PARSE"), list(makeSymbol("SET-PARSE-TREE-MOTHER"), makeSymbol("PARSE"), NIL)), list(makeSymbol("RET"), makeSymbol("PARSE"))));



    private static final SubLSymbol PARSE_TREE_CONTEXT_P = makeSymbol("PARSE-TREE-CONTEXT-P");

    private static final SubLSymbol CHARNIAK_PARSER_PARSE_METHOD = makeSymbol("CHARNIAK-PARSER-PARSE-METHOD");

    private static final SubLString $str63$_charniak_cgi = makeString("/charniak.cgi");



    private static final SubLSymbol CHARNIAK_PARSE = makeSymbol("CHARNIAK-PARSE");

    private static final SubLString $$$text = makeString("text");

    private static final SubLString $$$server = makeString("server");

    private static final SubLSymbol $charniak_parse_caching_state$ = makeSymbol("*CHARNIAK-PARSE-CACHING-STATE*");

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLList $list70 = list(makeString("many"), makeString("most"));









    private static final SubLList $list75 = list(makeString("external.stanford.host"));

    private static final SubLSymbol $stanford_parser_host$ = makeSymbol("*STANFORD-PARSER-HOST*");

    private static final SubLString $str77$stanfordparser_cyc_com = makeString("stanfordparser.cyc.com");

    private static final SubLList $list78 = list(makeString("external.stanford.port"));

    private static final SubLSymbol $stanford_parser_port$ = makeSymbol("*STANFORD-PARSER-PORT*");

    private static final SubLInteger $int$8888 = makeInteger(8888);

    private static final SubLSymbol STANFORD_PARSER = makeSymbol("STANFORD-PARSER");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_STANFORD_PARSER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-STANFORD-PARSER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_STANFORD_PARSER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-STANFORD-PARSER-INSTANCE");

    private static final SubLList $list84 = list(makeKeyword("ROOT"), list(makeKeyword("S"), list(makeKeyword("NP"), list(makeKeyword("NNS"), makeString("Dogs"))), list(makeKeyword("VP"), list(makeKeyword("VBP"), makeString("sleep")))));

    private static final SubLList $list85 = list(makeString("@param TEXT stringp; a single English sentence\n   @return parse-tree-p; the most likely parse of TEXT"), list(makeSymbol("CLET"), list(makeSymbol("PARSE"), makeSymbol("ERROR"), makeSymbol("TIMEOUT?")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")), list(makeSymbol("WITH-TIMEOUT"), list(makeSymbol("TIMEOUT"), makeSymbol("TIMEOUT?")), list(makeSymbol("CSETQ"), makeSymbol("PARSE"), list(makeSymbol("STANFORD-PARSE"), makeSymbol("TEXT"))), list(makeSymbol("PWHEN"), makeSymbol("TIMEOUT?"), list(makeSymbol("ERROR"), makeString("Stanford Parser timed out after ~a seconds "), makeSymbol("TIMEOUT")))), list(makeSymbol("PWHEN"), makeSymbol("ERROR"), list(makeSymbol("HANDLE-ERROR"), makeSymbol("SELF"), makeSymbol("ERROR")))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("PARSE"), list(makeSymbol("NEW-PARSE-TREE"), list(makeSymbol("STRIP-SHELL"), makeSymbol("PARSE")), makeSymbol("LEXICON"), makeSymbol("CONTEXT"))))));

    private static final SubLSymbol $sym86$OUTER_CATCH_FOR_STANFORD_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-STANFORD-PARSER-METHOD");

    private static final SubLString $str87$Stanford_Parser_timed_out_after__ = makeString("Stanford Parser timed out after ~a seconds ");

    private static final SubLSymbol STANFORD_PARSER_PARSE_METHOD = makeSymbol("STANFORD-PARSER-PARSE-METHOD");

    private static final SubLSymbol STANFORD_PARSE = makeSymbol("STANFORD-PARSE");



    private static final SubLSymbol $stanford_parse_caching_state$ = makeSymbol("*STANFORD-PARSE-CACHING-STATE*");



    private static final SubLList $list93 = list(new SubLObject[]{ makeString("be"), makeString("am"), makeString("are"), makeString("is"), makeString("was"), makeString("were"), makeString("been"), makeString("'m"), makeString("do"), makeString("does"), makeString("did"), makeString("done"), makeString("have"), makeString("has"), makeString("had"), makeString("'ve") });

    private static final SubLList $list94 = list(makeString("external.link-program.name"));

    private static final SubLSymbol $link_parser_program_name$ = makeSymbol("*LINK-PARSER-PROGRAM-NAME*");

    private static final SubLString $str96$_cyc_top_data_link_server = makeString("/cyc/top/data/link_server");



    private static final SubLList $list98 = list(makeString("external.link-program.redfilename"));

    private static final SubLSymbol $link_parser_program_redfilename$ = makeSymbol("*LINK-PARSER-PROGRAM-REDFILENAME*");

    private static final SubLString $str100$_cyc_top_repository_red_external_ = makeString("/cyc/top/repository/red/external.redbin");

    public static final SubLList $list101 = list(makeString("external.link-program.inputfile"));

    private static final SubLSymbol $link_parser_program_inputfile$ = makeSymbol("*LINK-PARSER-PROGRAM-INPUTFILE*");

    private static final SubLString $str103$_dev_null = makeString("/dev/null");

    public static final SubLList $list104 = list(makeString("external.link-program.outputfile"));

    private static final SubLSymbol $link_parser_program_outputfile$ = makeSymbol("*LINK-PARSER-PROGRAM-OUTPUTFILE*");

    private static final SubLList $list106 = list(makeString("external.link-allow-local-start"));

    private static final SubLSymbol $link_server_allow_local_start$ = makeSymbol("*LINK-SERVER-ALLOW-LOCAL-START*");

    private static final SubLString $$$Link_Parser_Server = makeString("Link Parser Server");

    private static final SubLString $$$Process_for_ = makeString("Process for ");

    private static final SubLString $str110$_r = makeString("-r");

    private static final SubLSymbol LAUNCH_LINK_PARSER_PROGRAM_LOCALLY = makeSymbol("LAUNCH-LINK-PARSER-PROGRAM-LOCALLY");

    private static final SubLSymbol LINK_PARSER = makeSymbol("LINK-PARSER");

    private static final SubLList $list113 = list(list(makeSymbol("OPTIONS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE"), list(makeSymbol("TEXT")), makeKeyword("PUBLIC")));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LINK_PARSER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LINK-PARSER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LINK_PARSER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LINK-PARSER-INSTANCE");

    private static final SubLList $list117 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("ENSURE-LINKAGE-INITIALIZED")), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol LINK_PARSER_INITIALIZE_METHOD = makeSymbol("LINK-PARSER-INITIALIZE-METHOD");

    private static final SubLSymbol NEW_LINK_PARSER = makeSymbol("NEW-LINK-PARSER");



    private static final SubLString $$$localhost = makeString("localhost");

    private static final SubLList $list122 = list(makeString("@param TEXT stringp; a single English sentence\n   @return linkage-p; the most likely linkage for TEXT"), list(makeSymbol("CLET"), list(makeSymbol("LINKAGE"), makeSymbol("ERROR"), makeSymbol("TIMEOUT?")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")), list(makeSymbol("WITH-TIMEOUT"), list(makeSymbol("TIMEOUT"), makeSymbol("TIMEOUT?")), list(makeSymbol("CSETQ"), makeSymbol("LINKAGE"), list(makeSymbol("NEW-LINKAGE"), makeSymbol("TEXT"), list(makeSymbol("LIST"), makeKeyword("CONTEXT"), makeSymbol("CONTEXT"), makeKeyword("OPTIONS"), makeSymbol("OPTIONS"), makeKeyword("LEXICON"), makeSymbol("LEXICON")))), list(makeSymbol("PWHEN"), makeSymbol("TIMEOUT?"), list(makeSymbol("ERROR"), makeString("Link Parser timed out after ~a seconds"), makeSymbol("TIMEOUT")))), list(makeSymbol("PWHEN"), makeSymbol("ERROR"), list(makeSymbol("HANDLE-ERROR"), makeSymbol("SELF"), makeSymbol("ERROR")))), list(makeSymbol("RET"), makeSymbol("LINKAGE"))));

    private static final SubLSymbol $sym123$OUTER_CATCH_FOR_LINK_PARSER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-PARSER-METHOD");







    private static final SubLString $str127$Link_Parser_timed_out_after__a_se = makeString("Link Parser timed out after ~a seconds");

    private static final SubLSymbol LINK_PARSER_PARSE_METHOD = makeSymbol("LINK-PARSER-PARSE-METHOD");

    public static SubLObject get_parser_timeout(final SubLObject v_parser) {
        return classes.subloop_get_access_protected_instance_slot(v_parser, TWO_INTEGER, TIMEOUT);
    }

    public static SubLObject set_parser_timeout(final SubLObject v_parser, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_parser, value, TWO_INTEGER, TIMEOUT);
    }

    public static SubLObject get_parser_error_handling(final SubLObject v_parser) {
        return classes.subloop_get_access_protected_instance_slot(v_parser, ONE_INTEGER, ERROR_HANDLING);
    }

    public static SubLObject set_parser_error_handling(final SubLObject v_parser, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_parser, value, ONE_INTEGER, ERROR_HANDLING);
    }

    public static SubLObject subloop_reserved_initialize_parser_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_parser_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, PARSER, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, PARSER, TIMEOUT, NIL);
        return NIL;
    }

    public static SubLObject parser_p(final SubLObject v_parser) {
        return classes.subloop_instanceof_class(v_parser, PARSER);
    }

    public static SubLObject parser_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parser_method = NIL;
        SubLObject timeout = get_parser_timeout(self);
        SubLObject error_handling = get_parser_error_handling(self);
        try {
            thread.throwStack.push($sym14$OUTER_CATCH_FOR_PARSER_METHOD);
            try {
                object.object_initialize_method(self);
                error_handling = $THROW;
                timeout = $int$90;
                sublisp_throw($sym14$OUTER_CATCH_FOR_PARSER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_parser_timeout(self, timeout);
                    set_parser_error_handling(self, error_handling);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_parser_method = Errors.handleThrowable(ccatch_env_var, $sym14$OUTER_CATCH_FOR_PARSER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parser_method;
    }

    public static SubLObject parser_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parser_method = NIL;
        final SubLObject error_handling = get_parser_error_handling(self);
        try {
            thread.throwStack.push($sym22$OUTER_CATCH_FOR_PARSER_METHOD);
            try {
                assert NIL != subloop_structures.instance_p(self) : "subloop_structures.instance_p(self) " + "CommonSymbols.NIL != subloop_structures.instance_p(self) " + self;
                if (NIL != $print_readably$.getDynamicValue(thread)) {
                    print_not_readable(self, stream);
                } else {
                    print_macros.print_unreadable_object_preamble(stream, self, NIL, NIL);
                    princ(subloop_structures.class_name(subloop_structures.instance_class(self)), stream);
                    write_char(CHAR_space, stream);
                    format(stream, $str25$_Error_handling___S_, error_handling);
                    print_macros.print_unreadable_object_postamble(stream, self, T, T);
                }
                sublisp_throw($sym22$OUTER_CATCH_FOR_PARSER_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_parser_error_handling(self, error_handling);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_parser_method = Errors.handleThrowable(ccatch_env_var, $sym22$OUTER_CATCH_FOR_PARSER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parser_method;
    }

    public static SubLObject new_parser(final SubLObject v_class, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject error_handling = getf(v_properties, $ERROR_HANDLING, $THROW);
        SubLObject timeout = getf(v_properties, $TIMEOUT, $default_parser_timeout$.getDynamicValue(thread));
        if (NIL == timeout) {
            timeout = $default_parser_timeout$.getDynamicValue(thread);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == member(error_handling, $list29, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str30$Invalid_error_handling_tag__a, error_handling);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.non_negative_integer_p(timeout))) {
            Errors.error($str31$Invalid_timeout__a, timeout);
        }
        final SubLObject v_parser = object.new_class_instance(v_class);
        set_parser_error_handling(v_parser, error_handling);
        set_parser_timeout(v_parser, timeout);
        return v_parser;
    }

    public static SubLObject parser_handle_error_method(final SubLObject self, final SubLObject error) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parser_method = NIL;
        final SubLObject error_handling = get_parser_error_handling(self);
        try {
            thread.throwStack.push($sym35$OUTER_CATCH_FOR_PARSER_METHOD);
            try {
                final SubLObject pcase_var = error_handling;
                if (pcase_var.eql($THROW)) {
                    Errors.error(error);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(error);
                    }

            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_parser_error_handling(self, error_handling);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_parser_method = Errors.handleThrowable(ccatch_env_var, $sym35$OUTER_CATCH_FOR_PARSER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parser_method;
    }

    public static SubLObject subloop_reserved_initialize_charniak_parser_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_charniak_parser_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, PARSER, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, PARSER, TIMEOUT, NIL);
        return NIL;
    }

    public static SubLObject charniak_parser_p(final SubLObject charniak_parser) {
        return classes.subloop_instanceof_class(charniak_parser, CHARNIAK_PARSER);
    }

    public static SubLObject charniak_parser_availableP(SubLObject force_check) {
        if (force_check == UNPROVIDED) {
            force_check = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != force_check) || ($charniak_available$.getGlobalValue() == $UNTESTED)) {
            SubLObject error = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        $charniak_available$.setGlobalValue(equalp(charniak_parse($$$Dogs_sleep, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $list49));
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
                $charniak_available$.setGlobalValue(NIL);
            }
        }
        return $charniak_available$.getGlobalValue();
    }

    public static SubLObject force_charniak_parser_availableP() {
        return charniak_parser_availableP(T);
    }

    public static SubLObject new_charniak_parser(SubLObject error_handling, SubLObject timeout) {
        if (error_handling == UNPROVIDED) {
            error_handling = $THROW;
        }
        if (timeout == UNPROVIDED) {
            timeout = $default_parser_timeout$.getDynamicValue();
        }
        return new_parser(CHARNIAK_PARSER, list($ERROR_HANDLING, error_handling, $TIMEOUT, timeout));
    }

    public static SubLObject charniak_parser_parse_multiple_method(final SubLObject self, final SubLObject text, SubLObject lexicon, SubLObject v_context) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        if (v_context == UNPROVIDED) {
            v_context = object.new_class_instance(PARSE_TREE_CONTEXT);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_charniak_parser_method = NIL;
        final SubLObject timeout = get_parser_timeout(self);
        try {
            thread.throwStack.push($sym54$OUTER_CATCH_FOR_CHARNIAK_PARSER_METHOD);
            try {
                SubLObject parses = NIL;
                SubLObject error = NIL;
                SubLObject timeoutP = NIL;
                SubLObject trees = NIL;
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject tag = with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$2 = $within_with_timeout$.currentBinding(thread);
                                try {
                                    $within_with_timeout$.bind(T, thread);
                                    SubLObject timer = NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$3 = $with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = with_timeout_start_timer(timeout, tag);
                                            parses = charniak_parse(text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            if (NIL != timeoutP) {
                                                Errors.error($str55$Charniak_Parser_timed_out_after__, timeout);
                                            }
                                        } finally {
                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$3, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            with_timeout_stop_timer(timer);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                        }
                                    }
                                } finally {
                                    $within_with_timeout$.rebind(_prev_bind_0_$2, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                timeoutP = Errors.handleThrowable(ccatch_env_var, tag);
                            } finally {
                                thread.throwStack.pop();
                            }
                            if (NIL != error) {
                                parser_handle_error_method(self, error);
                            }
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var2) {
                    error = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                SubLObject cdolist_list_var = parses;
                SubLObject parse_expression = NIL;
                parse_expression = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    trees = cons(parse_tree.new_parse_tree(retag(strip_shell(parse_expression)), lexicon, v_context), trees);
                    cdolist_list_var = cdolist_list_var.rest();
                    parse_expression = cdolist_list_var.first();
                } 
                sublisp_throw($sym54$OUTER_CATCH_FOR_CHARNIAK_PARSER_METHOD, nreverse(trees));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    set_parser_timeout(self, timeout);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var3) {
            catch_var_for_charniak_parser_method = Errors.handleThrowable(ccatch_env_var3, $sym54$OUTER_CATCH_FOR_CHARNIAK_PARSER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_charniak_parser_method;
    }

    public static SubLObject strip_shell(final SubLObject parse_expression) {
        return NIL != member(parse_expression.first(), $list57, EQ, UNPROVIDED) ? second(parse_expression) : parse_expression;
    }

    public static SubLObject charniak_parser_parse_method(final SubLObject self, final SubLObject text, SubLObject lexicon, SubLObject v_context) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        if (v_context == UNPROVIDED) {
            v_context = object.new_class_instance(PARSE_TREE_CONTEXT);
        }
        assert NIL != stringp(text) : "Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) " + text;
        if (((NIL != v_context) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == context.parse_tree_context_p(v_context))) {
            throw new AssertionError(v_context);
        }
        final SubLObject parse = methods.funcall_instance_method_with_3_args(self, PARSE_MULTIPLE, substitute(CHAR_space, CHAR_newline, text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), lexicon, v_context).first();
        if (NIL != parse) {
            parse_tree.set_parse_tree_mother(parse, NIL);
        }
        return parse;
    }

    public static SubLObject clear_charniak_parse() {
        final SubLObject cs = $charniak_parse_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_charniak_parse(final SubLObject query, SubLObject server, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (server == UNPROVIDED) {
            server = $charniak_parser_host$.getDynamicValue();
        }
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str63$_charniak_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return memoization_state.caching_state_remove_function_results_with_args($charniak_parse_caching_state$.getGlobalValue(), list(query, server, path, host, port, method), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject charniak_parse_internal(final SubLObject query, final SubLObject server, final SubLObject path, final SubLObject host, final SubLObject port, final SubLObject method) {
        return read_from_string(web_utilities.http_retrieve(list(list($$$text, query), list($$$server, server)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject charniak_parse(final SubLObject query, SubLObject server, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (server == UNPROVIDED) {
            server = $charniak_parser_host$.getDynamicValue();
        }
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str63$_charniak_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        SubLObject caching_state = $charniak_parse_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CHARNIAK_PARSE, $charniak_parse_caching_state$, $int$500, EQUAL, SIX_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(query, server, path, host, port, method);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (query.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (server.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (path.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (host.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (port.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && method.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(charniak_parse_internal(query, server, path, host, port, method)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(query, server, path, host, port, method));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject retag(final SubLObject tree) {
        if (NIL != word_tree.word_expression_p(tree)) {
            if (NIL != subl_promotions.memberP(word_tree.word_expression_string(tree), $list70, EQUALP, UNPROVIDED)) {
                rplaca(tree, $DT);
            }
        } else
            if (NIL != word_tree.phrase_expression_p(tree)) {
                if ((word_tree.parse_expression_category(tree).eql($WHNP) && length(word_tree.phrase_expression_daughters(tree)).numG(ONE_INTEGER)) && word_tree.parse_expression_category(word_tree.phrase_expression_daughters(tree).first()).eql($WP)) {
                    rplaca(word_tree.phrase_expression_daughters(tree).first(), $WDT);
                }
                SubLObject cdolist_list_var = word_tree.phrase_expression_daughters(tree);
                SubLObject daughter = NIL;
                daughter = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    retag(daughter);
                    cdolist_list_var = cdolist_list_var.rest();
                    daughter = cdolist_list_var.first();
                } 
            }

        return tree;
    }

    public static SubLObject get_stanford_parser() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == stanford_parser_p($stanford_parser$.getDynamicValue(thread))) {
            $stanford_parser$.setDynamicValue(new_stanford_parser(UNPROVIDED, UNPROVIDED), thread);
        }
        return $stanford_parser$.getDynamicValue(thread);
    }

    public static SubLObject subloop_reserved_initialize_stanford_parser_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_stanford_parser_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, PARSER, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, PARSER, TIMEOUT, NIL);
        return NIL;
    }

    public static SubLObject stanford_parser_p(final SubLObject stanford_parser) {
        return classes.subloop_instanceof_class(stanford_parser, STANFORD_PARSER);
    }

    public static SubLObject stanford_parser_availableP(SubLObject force_check) {
        if (force_check == UNPROVIDED) {
            force_check = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != force_check) || ($stanford_available$.getGlobalValue() == $UNTESTED)) {
            SubLObject error = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        $stanford_available$.setGlobalValue(equalp(stanford_parse($$$Dogs_sleep, UNPROVIDED, UNPROVIDED), $list84));
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
                $stanford_available$.setGlobalValue(NIL);
            }
        }
        return $stanford_available$.getGlobalValue();
    }

    public static SubLObject force_stanford_parser_availableP() {
        return stanford_parser_availableP(T);
    }

    public static SubLObject new_stanford_parser(SubLObject error_handling, SubLObject timeout) {
        if (error_handling == UNPROVIDED) {
            error_handling = $THROW;
        }
        if (timeout == UNPROVIDED) {
            timeout = $default_parser_timeout$.getDynamicValue();
        }
        return new_parser(STANFORD_PARSER, list($ERROR_HANDLING, error_handling, $TIMEOUT, timeout));
    }

    public static SubLObject stanford_parser_parse_method(final SubLObject self, final SubLObject text, SubLObject lexicon, SubLObject v_context) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        if (v_context == UNPROVIDED) {
            v_context = object.new_class_instance(PARSE_TREE_CONTEXT);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_stanford_parser_method = NIL;
        final SubLObject timeout = get_parser_timeout(self);
        try {
            thread.throwStack.push($sym86$OUTER_CATCH_FOR_STANFORD_PARSER_METHOD);
            try {
                SubLObject parse = NIL;
                SubLObject error = NIL;
                SubLObject timeoutP = NIL;
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject tag = with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$5 = $within_with_timeout$.currentBinding(thread);
                                try {
                                    $within_with_timeout$.bind(T, thread);
                                    SubLObject timer = NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$6 = $with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = with_timeout_start_timer(timeout, tag);
                                            parse = stanford_parse(text, UNPROVIDED, UNPROVIDED);
                                            if (NIL != timeoutP) {
                                                Errors.error($str87$Stanford_Parser_timed_out_after__, timeout);
                                            }
                                        } finally {
                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$6, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            with_timeout_stop_timer(timer);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                        }
                                    }
                                } finally {
                                    $within_with_timeout$.rebind(_prev_bind_0_$5, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                timeoutP = Errors.handleThrowable(ccatch_env_var, tag);
                            } finally {
                                thread.throwStack.pop();
                            }
                            if (NIL != error) {
                                parser_handle_error_method(self, error);
                            }
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var2) {
                    error = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                sublisp_throw($sym86$OUTER_CATCH_FOR_STANFORD_PARSER_METHOD, NIL != parse ? parse_tree.new_parse_tree(strip_shell(parse), lexicon, v_context) : NIL);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    set_parser_timeout(self, timeout);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var3) {
            catch_var_for_stanford_parser_method = Errors.handleThrowable(ccatch_env_var3, $sym86$OUTER_CATCH_FOR_STANFORD_PARSER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_stanford_parser_method;
    }

    public static SubLObject clear_stanford_parse() {
        final SubLObject cs = $stanford_parse_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_stanford_parse(final SubLObject string, SubLObject server, SubLObject port) {
        if (server == UNPROVIDED) {
            server = $stanford_parser_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $stanford_parser_port$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($stanford_parse_caching_state$.getGlobalValue(), list(string, server, port), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject stanford_parse_internal(final SubLObject string, final SubLObject server, final SubLObject port) {
        final SubLObject s = subl_promotions.open_tcp_stream_with_timeout(server, port, NIL, $PRIVATE);
        SubLObject parse = NIL;
        try {
            princ(substitute(CHAR_space, CHAR_newline, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), s);
            terpri(s);
            finish_output(s);
            parse = read(s, NIL, NIL, UNPROVIDED);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        if (parse.isString()) {
            Errors.error(parse);
        }
        return auxify(parse);
    }

    public static SubLObject stanford_parse(final SubLObject string, SubLObject server, SubLObject port) {
        if (server == UNPROVIDED) {
            server = $stanford_parser_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $stanford_parser_port$.getDynamicValue();
        }
        SubLObject caching_state = $stanford_parse_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(STANFORD_PARSE, $stanford_parse_caching_state$, $int$500, EQUAL, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(string, server, port);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (server.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && port.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(stanford_parse_internal(string, server, port)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(string, server, port));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject auxify(final SubLObject tree) {
        if (NIL != word_tree.word_expression_p(tree)) {
            if (NIL != aux_word_p(second(tree))) {
                rplaca(tree, $AUX);
            }
        } else {
            SubLObject cdolist_list_var = tree.rest();
            SubLObject daughter = NIL;
            daughter = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                auxify(daughter);
                cdolist_list_var = cdolist_list_var.rest();
                daughter = cdolist_list_var.first();
            } 
        }
        return tree;
    }

    public static SubLObject aux_word_p(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return member(string, $aux_word_strings$.getDynamicValue(thread), EQUALP, UNPROVIDED);
    }

    public static SubLObject get_link_parser_program_arglist() {
        return list($str110$_r, $link_parser_program_redfilename$.getGlobalValue());
    }

    public static SubLObject launch_link_parser_program_locally(SubLObject auto_restartP) {
        if (auto_restartP == UNPROVIDED) {
            auto_restartP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject program = $link_parser_program_name$.getGlobalValue();
        final SubLObject args = get_link_parser_program_arglist();
        final SubLObject source_file = $link_parser_program_inputfile$.getGlobalValue();
        final SubLObject target_file = $link_parser_program_outputfile$.getGlobalValue();
        SubLObject successP = NIL;
        SubLObject os_process = NIL;
        for (SubLObject doneP = NIL; NIL == doneP; doneP = makeBoolean(NIL == auto_restartP)) {
            try {
                os_process = os_process_utilities.make_os_process($link_parser_server_os_process_name$.getGlobalValue(), program, args, source_file, target_file, StreamsLow.$standard_output$.getDynamicValue(thread));
                os_process_utilities.wait_until_os_process_finished(os_process);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL != os_process) {
                        os_process_utilities.destroy_os_process(os_process);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            if (NIL != os_process) {
                successP = os_process_utilities.os_process_exit_code(os_process);
            }
        }
        return successP;
    }

    public static SubLObject launch_link_parser_program_locally_in_process(SubLObject auto_restartP) {
        if (auto_restartP == UNPROVIDED) {
            auto_restartP = T;
        }
        return subl_promotions.make_process_with_args($link_parser_server_proxy_process_name$.getGlobalValue(), LAUNCH_LINK_PARSER_PROGRAM_LOCALLY, list(auto_restartP));
    }

    public static SubLObject get_link_parser_options(final SubLObject link_parser) {
        return classes.subloop_get_access_protected_instance_slot(link_parser, THREE_INTEGER, OPTIONS);
    }

    public static SubLObject set_link_parser_options(final SubLObject link_parser, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(link_parser, value, THREE_INTEGER, OPTIONS);
    }

    public static SubLObject subloop_reserved_initialize_link_parser_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_link_parser_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, PARSER, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, PARSER, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_PARSER, OPTIONS, NIL);
        return NIL;
    }

    public static SubLObject link_parser_p(final SubLObject link_parser) {
        return classes.subloop_instanceof_class(link_parser, LINK_PARSER);
    }

    public static SubLObject link_parser_initialize_method(final SubLObject self) {
        parser_initialize_method(self);
        linkage.ensure_linkage_initialized();
        return self;
    }

    public static SubLObject new_link_parser(SubLObject options, SubLObject error_handling, SubLObject timeout) {
        if (options == UNPROVIDED) {
            options = linkage.$link_parse_options$.getDynamicValue();
        }
        if (error_handling == UNPROVIDED) {
            error_handling = $THROW;
        }
        if (timeout == UNPROVIDED) {
            timeout = $default_parser_timeout$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject host = ensure_link_server_running();
        final SubLObject port = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != host) && (NIL != port)) {
            linkage.$link_parser$.setDynamicValue(host, thread);
            linkage.$link_port$.setDynamicValue(port, thread);
            final SubLObject v_parser = new_parser(LINK_PARSER, list($ERROR_HANDLING, error_handling, $TIMEOUT, timeout));
            instances.set_slot(v_parser, OPTIONS, options);
            return v_parser;
        }
        return NIL;
    }

    public static SubLObject listening_socketP(final SubLObject host, final SubLObject port) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = NIL;
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
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != stream) {
                                close(stream, UNPROVIDED);
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
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return makeBoolean(NIL == error);
    }

    public static SubLObject ensure_link_server_running() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject host = linkage.$link_parser$.getDynamicValue(thread);
        SubLObject port = linkage.$link_port$.getDynamicValue(thread);
        SubLObject timed_outP = NIL;
        if (NIL == linkage.link_ping(host, port, UNPROVIDED)) {
            if (NIL != linkage.link_ping($$$localhost, linkage.$link_port$.getDynamicValue(thread), UNPROVIDED)) {
                host = $$$localhost;
                port = linkage.$link_port$.getDynamicValue(thread);
            } else
                if ((NIL == $link_server_allow_local_start$.getGlobalValue()) || (NIL != listening_socketP($$$localhost, linkage.$link_port$.getDynamicValue(thread)))) {
                    host = NIL;
                    port = NIL;
                } else {
                    host = $$$localhost;
                    port = linkage.$link_port$.getDynamicValue(thread);
                    launch_link_parser_program_locally_in_process(T);
                    final SubLObject tag = with_timeout_make_tag();
                    try {
                        thread.throwStack.push(tag);
                        final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
                        try {
                            $within_with_timeout$.bind(T, thread);
                            SubLObject timer = NIL;
                            try {
                                final SubLObject _prev_bind_0_$9 = $with_timeout_nesting_depth$.currentBinding(thread);
                                try {
                                    $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                    timer = with_timeout_start_timer(TEN_INTEGER, tag);
                                    while (NIL == linkage.link_ping(host, port, UNPROVIDED)) {
                                        sleep(ONE_INTEGER);
                                    } 
                                } finally {
                                    $with_timeout_nesting_depth$.rebind(_prev_bind_0_$9, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    with_timeout_stop_timer(timer);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                }
                            }
                        } finally {
                            $within_with_timeout$.rebind(_prev_bind_0, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                    } finally {
                        thread.throwStack.pop();
                    }
                    if (NIL != timed_outP) {
                        host = NIL;
                        port = NIL;
                    }
                }

        }
        return values(host, port);
    }

    public static SubLObject link_parser_parse_method(final SubLObject self, final SubLObject text, SubLObject lexicon, SubLObject v_context) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        if (v_context == UNPROVIDED) {
            v_context = object.new_class_instance(PARSE_TREE_CONTEXT);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_parser_method = NIL;
        final SubLObject options = get_link_parser_options(self);
        final SubLObject timeout = get_parser_timeout(self);
        try {
            thread.throwStack.push($sym123$OUTER_CATCH_FOR_LINK_PARSER_METHOD);
            try {
                SubLObject v_linkage = NIL;
                SubLObject error = NIL;
                SubLObject timeoutP = NIL;
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject tag = with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$11 = $within_with_timeout$.currentBinding(thread);
                                try {
                                    $within_with_timeout$.bind(T, thread);
                                    SubLObject timer = NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$12 = $with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = with_timeout_start_timer(timeout, tag);
                                            v_linkage = linkage.new_linkage(text, list($CONTEXT, v_context, $OPTIONS, options, $LEXICON, lexicon));
                                            if (NIL != timeoutP) {
                                                Errors.error($str127$Link_Parser_timed_out_after__a_se, timeout);
                                            }
                                        } finally {
                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$12, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            with_timeout_stop_timer(timer);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                        }
                                    }
                                } finally {
                                    $within_with_timeout$.rebind(_prev_bind_0_$11, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                timeoutP = Errors.handleThrowable(ccatch_env_var, tag);
                            } finally {
                                thread.throwStack.pop();
                            }
                            if (NIL != error) {
                                parser_handle_error_method(self, error);
                            }
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var2) {
                    error = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                sublisp_throw($sym123$OUTER_CATCH_FOR_LINK_PARSER_METHOD, v_linkage);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    set_link_parser_options(self, options);
                    set_parser_timeout(self, timeout);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var3) {
            catch_var_for_link_parser_method = Errors.handleThrowable(ccatch_env_var3, $sym123$OUTER_CATCH_FOR_LINK_PARSER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_parser_method;
    }

    public static SubLObject declare_parser_file() {
        declareFunction(me, "get_parser_timeout", "GET-PARSER-TIMEOUT", 1, 0, false);
        declareFunction(me, "set_parser_timeout", "SET-PARSER-TIMEOUT", 2, 0, false);
        declareFunction(me, "get_parser_error_handling", "GET-PARSER-ERROR-HANDLING", 1, 0, false);
        declareFunction(me, "set_parser_error_handling", "SET-PARSER-ERROR-HANDLING", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_parser_class", "SUBLOOP-RESERVED-INITIALIZE-PARSER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_parser_instance", "SUBLOOP-RESERVED-INITIALIZE-PARSER-INSTANCE", 1, 0, false);
        declareFunction(me, "parser_p", "PARSER-P", 1, 0, false);
        declareFunction(me, "parser_initialize_method", "PARSER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "parser_print_method", "PARSER-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "new_parser", "NEW-PARSER", 1, 1, false);
        declareFunction(me, "parser_handle_error_method", "PARSER-HANDLE-ERROR-METHOD", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_charniak_parser_class", "SUBLOOP-RESERVED-INITIALIZE-CHARNIAK-PARSER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_charniak_parser_instance", "SUBLOOP-RESERVED-INITIALIZE-CHARNIAK-PARSER-INSTANCE", 1, 0, false);
        declareFunction(me, "charniak_parser_p", "CHARNIAK-PARSER-P", 1, 0, false);
        declareFunction(me, "charniak_parser_availableP", "CHARNIAK-PARSER-AVAILABLE?", 0, 1, false);
        declareFunction(me, "force_charniak_parser_availableP", "FORCE-CHARNIAK-PARSER-AVAILABLE?", 0, 0, false);
        declareFunction(me, "new_charniak_parser", "NEW-CHARNIAK-PARSER", 0, 2, false);
        declareFunction(me, "charniak_parser_parse_multiple_method", "CHARNIAK-PARSER-PARSE-MULTIPLE-METHOD", 2, 2, false);
        declareFunction(me, "strip_shell", "STRIP-SHELL", 1, 0, false);
        declareFunction(me, "charniak_parser_parse_method", "CHARNIAK-PARSER-PARSE-METHOD", 2, 2, false);
        declareFunction(me, "clear_charniak_parse", "CLEAR-CHARNIAK-PARSE", 0, 0, false);
        declareFunction(me, "remove_charniak_parse", "REMOVE-CHARNIAK-PARSE", 1, 5, false);
        declareFunction(me, "charniak_parse_internal", "CHARNIAK-PARSE-INTERNAL", 6, 0, false);
        declareFunction(me, "charniak_parse", "CHARNIAK-PARSE", 1, 5, false);
        declareFunction(me, "retag", "RETAG", 1, 0, false);
        declareFunction(me, "get_stanford_parser", "GET-STANFORD-PARSER", 0, 0, false);
        declareFunction(me, "subloop_reserved_initialize_stanford_parser_class", "SUBLOOP-RESERVED-INITIALIZE-STANFORD-PARSER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_stanford_parser_instance", "SUBLOOP-RESERVED-INITIALIZE-STANFORD-PARSER-INSTANCE", 1, 0, false);
        declareFunction(me, "stanford_parser_p", "STANFORD-PARSER-P", 1, 0, false);
        declareFunction(me, "stanford_parser_availableP", "STANFORD-PARSER-AVAILABLE?", 0, 1, false);
        declareFunction(me, "force_stanford_parser_availableP", "FORCE-STANFORD-PARSER-AVAILABLE?", 0, 0, false);
        declareFunction(me, "new_stanford_parser", "NEW-STANFORD-PARSER", 0, 2, false);
        declareFunction(me, "stanford_parser_parse_method", "STANFORD-PARSER-PARSE-METHOD", 2, 2, false);
        declareFunction(me, "clear_stanford_parse", "CLEAR-STANFORD-PARSE", 0, 0, false);
        declareFunction(me, "remove_stanford_parse", "REMOVE-STANFORD-PARSE", 1, 2, false);
        declareFunction(me, "stanford_parse_internal", "STANFORD-PARSE-INTERNAL", 3, 0, false);
        declareFunction(me, "stanford_parse", "STANFORD-PARSE", 1, 2, false);
        declareFunction(me, "auxify", "AUXIFY", 1, 0, false);
        declareFunction(me, "aux_word_p", "AUX-WORD-P", 1, 0, false);
        declareFunction(me, "get_link_parser_program_arglist", "GET-LINK-PARSER-PROGRAM-ARGLIST", 0, 0, false);
        declareFunction(me, "launch_link_parser_program_locally", "LAUNCH-LINK-PARSER-PROGRAM-LOCALLY", 0, 1, false);
        declareFunction(me, "launch_link_parser_program_locally_in_process", "LAUNCH-LINK-PARSER-PROGRAM-LOCALLY-IN-PROCESS", 0, 1, false);
        declareFunction(me, "get_link_parser_options", "GET-LINK-PARSER-OPTIONS", 1, 0, false);
        declareFunction(me, "set_link_parser_options", "SET-LINK-PARSER-OPTIONS", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_link_parser_class", "SUBLOOP-RESERVED-INITIALIZE-LINK-PARSER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_link_parser_instance", "SUBLOOP-RESERVED-INITIALIZE-LINK-PARSER-INSTANCE", 1, 0, false);
        declareFunction(me, "link_parser_p", "LINK-PARSER-P", 1, 0, false);
        declareFunction(me, "link_parser_initialize_method", "LINK-PARSER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "new_link_parser", "NEW-LINK-PARSER", 0, 3, false);
        declareFunction(me, "listening_socketP", "LISTENING-SOCKET?", 2, 0, false);
        declareFunction(me, "ensure_link_server_running", "ENSURE-LINK-SERVER-RUNNING", 0, 0, false);
        declareFunction(me, "link_parser_parse_method", "LINK-PARSER-PARSE-METHOD", 2, 2, false);
        return NIL;
    }

    public static SubLObject init_parser_file() {
        defparameter("*DEFAULT-PARSER-TIMEOUT*", $int$10000);
        defparameter("*CHARNIAK-PARSER-HOST*", red_infrastructure_macros.red_def_helper($list38.isSymbol() ? symbol_value($list38) : $list38, $charniak_parser_host$, $str40$charniakparser_cyc_com.isSymbol() ? symbol_value($str40$charniakparser_cyc_com) : $str40$charniakparser_cyc_com, $PARAMETER, UNPROVIDED));
        deflexical("*CHARNIAK-AVAILABLE*", $UNTESTED);
        deflexical("*CHARNIAK-PARSE-CACHING-STATE*", NIL);
        defparameter("*STANFORD-PARSER-HOST*", red_infrastructure_macros.red_def_helper($list75.isSymbol() ? symbol_value($list75) : $list75, $stanford_parser_host$, $str77$stanfordparser_cyc_com.isSymbol() ? symbol_value($str77$stanfordparser_cyc_com) : $str77$stanfordparser_cyc_com, $PARAMETER, UNPROVIDED));
        defparameter("*STANFORD-PARSER-PORT*", red_infrastructure_macros.red_def_helper($list78.isSymbol() ? symbol_value($list78) : $list78, $stanford_parser_port$, $int$8888.isSymbol() ? symbol_value($int$8888) : $int$8888, $PARAMETER, UNPROVIDED));
        defparameter("*STANFORD-PARSER*", NIL);
        deflexical("*STANFORD-AVAILABLE*", $UNTESTED);
        deflexical("*STANFORD-PARSE-CACHING-STATE*", NIL);
        defparameter("*AUX-WORD-STRINGS*", $list93);
        deflexical("*LINK-PARSER-PROGRAM-NAME*", red_infrastructure_macros.red_def_helper($list94.isSymbol() ? symbol_value($list94) : $list94, $link_parser_program_name$, $str96$_cyc_top_data_link_server.isSymbol() ? symbol_value($str96$_cyc_top_data_link_server) : $str96$_cyc_top_data_link_server, $LEXICAL, UNPROVIDED));
        deflexical("*LINK-PARSER-PROGRAM-REDFILENAME*", red_infrastructure_macros.red_def_helper($list98.isSymbol() ? symbol_value($list98) : $list98, $link_parser_program_redfilename$, $str100$_cyc_top_repository_red_external_.isSymbol() ? symbol_value($str100$_cyc_top_repository_red_external_) : $str100$_cyc_top_repository_red_external_, $LEXICAL, UNPROVIDED));
        deflexical("*LINK-PARSER-PROGRAM-INPUTFILE*", red_infrastructure_macros.red_def_helper($list101.isSymbol() ? symbol_value($list101) : $list101, $link_parser_program_inputfile$, $str103$_dev_null.isSymbol() ? symbol_value($str103$_dev_null) : $str103$_dev_null, $LEXICAL, UNPROVIDED));
        deflexical("*LINK-PARSER-PROGRAM-OUTPUTFILE*", red_infrastructure_macros.red_def_helper($list104.isSymbol() ? symbol_value($list104) : $list104, $link_parser_program_outputfile$, $str103$_dev_null.isSymbol() ? symbol_value($str103$_dev_null) : $str103$_dev_null, $LEXICAL, UNPROVIDED));
        deflexical("*LINK-SERVER-ALLOW-LOCAL-START*", red_infrastructure_macros.red_def_helper($list106.isSymbol() ? symbol_value($list106) : $list106, $link_server_allow_local_start$, NIL.isSymbol() ? symbol_value(NIL) : NIL, $LEXICAL, UNPROVIDED));
        deflexical("*LINK-PARSER-SERVER-OS-PROCESS-NAME*", $$$Link_Parser_Server);
        deflexical("*LINK-PARSER-SERVER-PROXY-PROCESS-NAME*", cconcatenate($$$Process_for_, $link_parser_server_os_process_name$.getGlobalValue()));
        return NIL;
    }

    public static SubLObject setup_parser_file() {
        classes.subloop_new_class(PARSER, OBJECT, NIL, T, $list3);
        classes.class_set_implements_slot_listeners(PARSER, NIL);
        classes.subloop_note_class_initialization_function(PARSER, SUBLOOP_RESERVED_INITIALIZE_PARSER_CLASS);
        classes.subloop_note_instance_initialization_function(PARSER, SUBLOOP_RESERVED_INITIALIZE_PARSER_INSTANCE);
        subloop_reserved_initialize_parser_class(PARSER);
        methods.methods_incorporate_instance_method(INITIALIZE, PARSER, $list12, NIL, $list13);
        methods.subloop_register_instance_method(PARSER, INITIALIZE, PARSER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, PARSER, $list19, $list20, $list21);
        methods.subloop_register_instance_method(PARSER, PRINT, PARSER_PRINT_METHOD);
        methods.methods_incorporate_instance_method(HANDLE_ERROR, PARSER, $list12, $list33, $list34);
        methods.subloop_register_instance_method(PARSER, HANDLE_ERROR, PARSER_HANDLE_ERROR_METHOD);
        classes.subloop_new_class(CHARNIAK_PARSER, PARSER, NIL, NIL, $list43);
        classes.class_set_implements_slot_listeners(CHARNIAK_PARSER, NIL);
        classes.subloop_note_class_initialization_function(CHARNIAK_PARSER, SUBLOOP_RESERVED_INITIALIZE_CHARNIAK_PARSER_CLASS);
        classes.subloop_note_instance_initialization_function(CHARNIAK_PARSER, SUBLOOP_RESERVED_INITIALIZE_CHARNIAK_PARSER_INSTANCE);
        subloop_reserved_initialize_charniak_parser_class(CHARNIAK_PARSER);
        methods.methods_incorporate_instance_method(PARSE_MULTIPLE, CHARNIAK_PARSER, $list19, $list51, $list52);
        methods.subloop_register_instance_method(CHARNIAK_PARSER, PARSE_MULTIPLE, CHARNIAK_PARSER_PARSE_MULTIPLE_METHOD);
        methods.methods_incorporate_instance_method(PARSE, CHARNIAK_PARSER, $list19, $list51, $list59);
        methods.subloop_register_instance_method(CHARNIAK_PARSER, PARSE, CHARNIAK_PARSER_PARSE_METHOD);
        memoization_state.note_globally_cached_function(CHARNIAK_PARSE);
        classes.subloop_new_class(STANFORD_PARSER, PARSER, NIL, NIL, $list43);
        classes.class_set_implements_slot_listeners(STANFORD_PARSER, NIL);
        classes.subloop_note_class_initialization_function(STANFORD_PARSER, SUBLOOP_RESERVED_INITIALIZE_STANFORD_PARSER_CLASS);
        classes.subloop_note_instance_initialization_function(STANFORD_PARSER, SUBLOOP_RESERVED_INITIALIZE_STANFORD_PARSER_INSTANCE);
        subloop_reserved_initialize_stanford_parser_class(STANFORD_PARSER);
        methods.methods_incorporate_instance_method(PARSE, STANFORD_PARSER, $list19, $list51, $list85);
        methods.subloop_register_instance_method(STANFORD_PARSER, PARSE, STANFORD_PARSER_PARSE_METHOD);
        memoization_state.note_globally_cached_function(STANFORD_PARSE);
        classes.subloop_new_class(LINK_PARSER, PARSER, NIL, NIL, $list113);
        classes.class_set_implements_slot_listeners(LINK_PARSER, NIL);
        classes.subloop_note_class_initialization_function(LINK_PARSER, SUBLOOP_RESERVED_INITIALIZE_LINK_PARSER_CLASS);
        classes.subloop_note_instance_initialization_function(LINK_PARSER, SUBLOOP_RESERVED_INITIALIZE_LINK_PARSER_INSTANCE);
        subloop_reserved_initialize_link_parser_class(LINK_PARSER);
        methods.methods_incorporate_instance_method(INITIALIZE, LINK_PARSER, $list12, NIL, $list117);
        methods.subloop_register_instance_method(LINK_PARSER, INITIALIZE, LINK_PARSER_INITIALIZE_METHOD);
        register_external_symbol(NEW_LINK_PARSER);
        methods.methods_incorporate_instance_method(PARSE, LINK_PARSER, $list19, $list51, $list122);
        methods.subloop_register_instance_method(LINK_PARSER, PARSE, LINK_PARSER_PARSE_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_parser_file();
    }

    @Override
    public void initializeVariables() {
        init_parser_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_parser_file();
    }

    
}

/**
 * Total time: 600 ms synthetic
 */
