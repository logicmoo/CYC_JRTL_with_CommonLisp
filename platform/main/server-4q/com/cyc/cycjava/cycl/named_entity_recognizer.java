package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.validate_tcp_connection;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.caar;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.finish_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.quirk.answer;
import com.cyc.cycjava.cycl.quirk.external_interfaces;
import com.cyc.cycjava.cycl.quirk.question;
import com.cyc.cycjava.cycl.quirk.search_engine;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class named_entity_recognizer extends SubLTranslatedFile {
    public static final SubLFile me = new named_entity_recognizer();

    public static final String myName = "com.cyc.cycjava.cycl.named_entity_recognizer";

    public static final String myFingerPrint = "0d7f251724304dff562b077d2d946abe6792daa0e6dea0ca4d8b7af496e5726b";

    // defparameter
    private static final SubLSymbol $break_named_entityP$ = makeSymbol("*BREAK-NAMED-ENTITY?*");

    // deflexical
    private static final SubLSymbol $named_entityP_caching_state$ = makeSymbol("*NAMED-ENTITY?-CACHING-STATE*");





    // defvar
    private static final SubLSymbol $resporator_to_cycl_map$ = makeSymbol("*RESPORATOR-TO-CYCL-MAP*");

    // defparameter
    private static final SubLSymbol $place_tightening_lexicon$ = makeSymbol("*PLACE-TIGHTENING-LEXICON*");

    // Internal Constants
    public static final SubLSymbol NAMED_ENTITY = makeSymbol("NAMED-ENTITY");



    public static final SubLList $list2 = list(new SubLObject[]{ list(makeSymbol("STRING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SOURCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CYC"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONFIDENCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STRING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CYC"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONFIDENCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PROTECTED")) });



    public static final SubLSymbol CYC = makeSymbol("CYC");









    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NAMED_ENTITY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NAMED-ENTITY-CLASS");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NAMED_ENTITY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NAMED-ENTITY-INSTANCE");



    public static final SubLList $list14 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list15 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    public static final SubLList $list16 = list(makeString("Prints this named entity to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<NE: "), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeSymbol("STRING"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString("/"), makeSymbol("STREAM")), list(makeSymbol("PRINC"), makeSymbol("TYPE"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym17$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NAMED-ENTITY-METHOD");

    public static final SubLString $str18$__NE__ = makeString("#<NE: ");

    public static final SubLString $str19$_ = makeString("/");

    public static final SubLString $str20$_ = makeString(">");

    public static final SubLSymbol NAMED_ENTITY_PRINT_METHOD = makeSymbol("NAMED-ENTITY-PRINT-METHOD");



    public static final SubLList $list23 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list24 = list(makeString("@return stringp; the string of this named-entity"), list(makeSymbol("RET"), makeSymbol("STRING")));

    public static final SubLSymbol $sym25$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NAMED-ENTITY-METHOD");

    public static final SubLSymbol NAMED_ENTITY_GET_STRING_METHOD = makeSymbol("NAMED-ENTITY-GET-STRING-METHOD");



    public static final SubLList $list28 = list(makeString("@return object; the native type of this named-entity"), list(makeSymbol("RET"), makeSymbol("TYPE")));

    public static final SubLSymbol $sym29$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NAMED-ENTITY-METHOD");

    public static final SubLSymbol NAMED_ENTITY_GET_TYPE_METHOD = makeSymbol("NAMED-ENTITY-GET-TYPE-METHOD");



    public static final SubLList $list32 = list(makeString("@return stringp; the cyc type of this named-entity"), list(makeSymbol("RET"), makeSymbol("CYC")));

    public static final SubLSymbol $sym33$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NAMED-ENTITY-METHOD");

    public static final SubLSymbol NAMED_ENTITY_GET_CYC_METHOD = makeSymbol("NAMED-ENTITY-GET-CYC-METHOD");



    public static final SubLList $list36 = list(makeString("@return stringp; the confidence of this named-entity"), list(makeSymbol("RET"), makeSymbol("CONFIDENCE")));

    public static final SubLSymbol $sym37$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NAMED-ENTITY-METHOD");

    public static final SubLSymbol NAMED_ENTITY_GET_CONFIDENCE_METHOD = makeSymbol("NAMED-ENTITY-GET-CONFIDENCE-METHOD");



    public static final SubLList $list40 = list(makeString("@return named-entity-recognizer-p; the ner that created this named-entity"), list(makeSymbol("RET"), makeSymbol("SOURCE")));

    public static final SubLSymbol $sym41$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NAMED-ENTITY-METHOD");

    public static final SubLSymbol NAMED_ENTITY_GET_SOURCE_METHOD = makeSymbol("NAMED-ENTITY-GET-SOURCE-METHOD");

    public static final SubLSymbol CONTEXTUALIZED_NAMED_ENTITY = makeSymbol("CONTEXTUALIZED-NAMED-ENTITY");

    public static final SubLList $list44 = list(new SubLObject[]{ list(makeSymbol("LEXICON"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONTEXT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("OFFSETS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SUBTYPES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LEXICON"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LEXICON"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTEXT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OFFSETS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TIGHTEN-TYPE"), NIL, makeKeyword("PUBLIC")) });









    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CONTEXTUALIZED_NAMED_ENTITY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CONTEXTUALIZED-NAMED-ENTITY-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CONTEXTUALIZED_NAMED_ENTITY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CONTEXTUALIZED-NAMED-ENTITY-INSTANCE");

    public static final SubLSymbol GET_LEXICON = makeSymbol("GET-LEXICON");

    public static final SubLList $list52 = list(makeString("@return the lexicon of this entity"), list(makeSymbol("PUNLESS"), makeSymbol("LEXICON"), list(makeSymbol("CSETQ"), makeSymbol("LEXICON"), list(makeSymbol("NEW-CASE-SENSITIVITY-PREFERRED-TERM-LEXICON"))), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(makeSymbol("QUOTE"), makeSymbol("IGNORE-CACHE")))), list(makeSymbol("RET"), makeSymbol("LEXICON")));

    public static final SubLSymbol $sym53$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CONTEXTUALIZED-NAMED-ENTITY-METHOD");



    public static final SubLSymbol CONTEXTUALIZED_NAMED_ENTITY_GET_LEXICON_METHOD = makeSymbol("CONTEXTUALIZED-NAMED-ENTITY-GET-LEXICON-METHOD");



    public static final SubLList $list57 = list(makeSymbol("LEX"));

    public static final SubLList $list58 = list(makeString("@param LEXICON term-lexicon-p"), list(makeSymbol("CSETQ"), makeSymbol("LEXICON"), makeSymbol("LEX")), list(makeSymbol("RET"), makeSymbol("LEXICON")));

    public static final SubLSymbol $sym59$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CONTEXTUALIZED-NAMED-ENTITY-METHOD");

    public static final SubLSymbol CONTEXTUALIZED_NAMED_ENTITY_SET_LEXICON_METHOD = makeSymbol("CONTEXTUALIZED-NAMED-ENTITY-SET-LEXICON-METHOD");



    public static final SubLSymbol TIGHTEN_TYPE = makeSymbol("TIGHTEN-TYPE");

    public static final SubLList $list63 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("RESPECT-NER-TYPE?"), T), makeSymbol("LEXICAL-LOOKUP-ONLY?"));

    public static final SubLList $list64 = list(list(new SubLObject[]{ makeSymbol("CLET"), list(new SubLObject[]{ list(makeSymbol("PARSER"), list(makeSymbol("NEW-STANFORD-PARSER"))), list(makeSymbol("QUESTION-WORD"), list(makeSymbol("FIF"), list(EQL, makeSymbol("CYC"), reader_make_constant_shell(makeString("Person"))), makeString("Who"), makeString("What"))), list(makeSymbol("QUESTION-STRING"), list(makeSymbol("BUNGE"), list(makeSymbol("LIST"), makeSymbol("QUESTION-WORD"), makeString("is"), list(makeSymbol("CCONCATENATE"), makeSymbol("STRING"), makeString("?"))))), list(makeSymbol("QUESTION-PARSE"), list(makeSymbol("FIM"), makeSymbol("PARSER"), list(makeSymbol("QUOTE"), makeSymbol("PARSE")), makeSymbol("QUESTION-STRING"))), list(makeSymbol("QUESTION"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("DEFINITIONAL-QUESTION")))), list(makeSymbol("PASSAGE"), list(makeSymbol("NEW-SIMPLE-PASSAGE"), makeSymbol("CONTEXT"))), list(makeSymbol("LEXICON"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-LEXICON")))), makeSymbol("ANSWERS"), makeSymbol("TIGHTER-TYPES"), makeSymbol("ANSWER-STRINGS"), list(makeSymbol("ENTITY-STRING"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING")))) }), list(makeSymbol("SET-QUESTION-STRING"), makeSymbol("QUESTION"), makeSymbol("QUESTION-STRING")), list(makeSymbol("PWHEN"), makeSymbol("QUESTION-PARSE"), list(makeSymbol("FIM"), makeSymbol("QUESTION-PARSE"), list(makeSymbol("QUOTE"), makeSymbol("LEXIFY")), makeSymbol("LEXICON"))), list(makeSymbol("SET-QUESTION-PARSE"), makeSymbol("QUESTION"), makeSymbol("QUESTION-PARSE")), list(makeSymbol("CSETQ"), makeSymbol("ANSWERS"), list(makeSymbol("FIM"), makeSymbol("QUESTION"), list(makeSymbol("QUOTE"), makeSymbol("EXTRACT")), makeSymbol("PASSAGE"))), list(makeSymbol("PWHEN"), list(makeSymbol("CNOT"), list(EQL, makeSymbol("CYC"), reader_make_constant_shell(makeString("Organization")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-TEXT-ANSWER"), makeSymbol("QUESTION"), makeSymbol("ENTITY-STRING"), list(makeSymbol("NEW-SIMPLE-PASSAGE"), makeSymbol("ENTITY-STRING")), ONE_INTEGER), makeSymbol("ANSWERS"))), list(makeSymbol("WITH-POSSIBLY-NEW-MEMOIZATION-STATE"), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("ANSWERS")), list(makeSymbol("CLET"), list(list(makeSymbol("ANSWER-STRING"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("SUBSTRING?"), makeSymbol("ANSWER-STRING"), makeSymbol("ENTITY-STRING"))), list(makeSymbol("COR"), list(makeSymbol("ENDS-WITH-START-OF"), makeSymbol("ENTITY-STRING"), makeSymbol("ANSWER-STRING"), list(makeSymbol("QUOTE"), EQUAL), list(makeSymbol("QUOTE"), list(makeString(" ")))), list(makeSymbol("ENDS-WITH-START-OF"), makeSymbol("ANSWER-STRING"), makeSymbol("ENTITY-STRING"), list(makeSymbol("QUOTE"), EQUAL), list(makeSymbol("QUOTE"), list(makeString(" ")))))), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("NEW-TIGHTER-TYPES"), makeSymbol("ANSWER-STRING")), list(makeSymbol("TIGHTER-TYPES-FROM-ANSWER"), makeSymbol("ANSWER"), makeSymbol("LEXICON"), makeSymbol("ENTITY-STRING"), list(makeSymbol("FWHEN"), makeSymbol("RESPECT-NER-TYPE?"), makeSymbol("CYC")), makeSymbol("LEXICAL-LOOKUP-ONLY?")), list(makeSymbol("CPUSH"), makeSymbol("ANSWER-STRING"), makeSymbol("ANSWER-STRINGS")), list(makeSymbol("CSETQ"), makeSymbol("TIGHTER-TYPES"), list(makeSymbol("UNION"), makeSymbol("TIGHTER-TYPES"), makeSymbol("NEW-TIGHTER-TYPES")))))))), list(makeSymbol("CSETQ"), makeSymbol("SUBTYPES"), makeSymbol("TIGHTER-TYPES")), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("TIGHTER-TYPES"), makeSymbol("ANSWER-STRINGS"))) }));

    public static final SubLSymbol $sym65$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CONTEXTUALIZED-NAMED-ENTITY-METHOD");

    private static final SubLObject $$Person = reader_make_constant_shell(makeString("Person"));

    public static final SubLString $$$Who = makeString("Who");

    public static final SubLString $$$What = makeString("What");

    public static final SubLString $$$is = makeString("is");

    public static final SubLString $str70$_ = makeString("?");



    public static final SubLSymbol DEFINITIONAL_QUESTION = makeSymbol("DEFINITIONAL-QUESTION");





    private static final SubLObject $$Organization = reader_make_constant_shell(makeString("Organization"));



    private static final SubLList $list77 = list(makeString(" "));

    private static final SubLSymbol CONTEXTUALIZED_NAMED_ENTITY_TIGHTEN_TYPE_METHOD = makeSymbol("CONTEXTUALIZED-NAMED-ENTITY-TIGHTEN-TYPE-METHOD");

    private static final SubLSymbol GET_PARSE_TREE = makeSymbol("GET-PARSE-TREE");







    private static final SubLSymbol DENOTS_OF_PS_HARVEST_NBARS = makeSymbol("DENOTS-OF-PS-HARVEST-NBARS");

    private static final SubLList $list84 = list(makeSymbol("SPAN"), makeSymbol("CYCLS"));



    private static final SubLSymbol $sym86$NAMED_ENTITY_ = makeSymbol("NAMED-ENTITY?");









    private static final SubLSymbol $sym91$_EXIT = makeSymbol("%EXIT");



    private static final SubLString $str93$Error___S_occured_in_NAMED_ENTITY = makeString("Error: ~S occured in NAMED-ENTITY? ~%");

    private static final SubLSymbol $sym94$_NAMED_ENTITY__CACHING_STATE_ = makeSymbol("*NAMED-ENTITY?-CACHING-STATE*");

    private static final SubLSymbol NAMED_ENTITY_RECOGNIZER = makeSymbol("NAMED-ENTITY-RECOGNIZER");

    private static final SubLList $list96 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")));

    private static final SubLList $list97 = list(makeSymbol("NAMED-ENTITY-RECOGNIZER"));

    public static final SubLList $list98 = list(list(makeSymbol("TYPE-MAP"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), list(makeSymbol("QUOTE"), list(cons(makeSymbol("PERSON"), reader_make_constant_shell(makeString("Person"))), cons(makeSymbol("ORGANIZATION"), reader_make_constant_shell(makeString("Organization"))), cons(makeSymbol("LOCATION"), reader_make_constant_shell(makeString("Place"))), cons(makeSymbol("DATE"), reader_make_constant_shell(makeString("Date")))))), list(makeSymbol("KNOWN-CYC-TYPES"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("Person")), reader_make_constant_shell(makeString("Organization")), reader_make_constant_shell(makeString("Place")), reader_make_constant_shell(makeString("Date"))))), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("TO-CYC"), list(makeSymbol("TYPE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")));

    private static final SubLSymbol KNOWN_CYC_TYPES = makeSymbol("KNOWN-CYC-TYPES");

    private static final SubLSymbol TYPE_MAP = makeSymbol("TYPE-MAP");

    private static final SubLList $list101 = list(cons(makeSymbol("PERSON"), reader_make_constant_shell(makeString("Person"))), cons(makeSymbol("ORGANIZATION"), reader_make_constant_shell(makeString("Organization"))), cons(makeSymbol("LOCATION"), reader_make_constant_shell(makeString("Place"))), cons(makeSymbol("DATE"), reader_make_constant_shell(makeString("Date"))));

    private static final SubLList $list102 = list(reader_make_constant_shell(makeString("Person")), reader_make_constant_shell(makeString("Organization")), reader_make_constant_shell(makeString("Place")), reader_make_constant_shell(makeString("Date")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_STANFORD_NER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-STANFORD-NER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_STANFORD_NER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-STANFORD-NER-INSTANCE");

    private static final SubLSymbol TO_CYC = makeSymbol("TO-CYC");

    private static final SubLList $list106 = list(makeSymbol("TYPE"));

    private static final SubLList $list107 = list(list(makeSymbol("RET"), list(makeSymbol("CDR"), list(makeSymbol("ASSOC"), makeSymbol("TYPE"), makeSymbol("TYPE-MAP")))));

    private static final SubLSymbol $sym108$OUTER_CATCH_FOR_STANFORD_NER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-STANFORD-NER-METHOD");

    private static final SubLSymbol STANFORD_NER_TO_CYC_METHOD = makeSymbol("STANFORD-NER-TO-CYC-METHOD");

    private static final SubLList $list110 = list(makeSymbol("TEXT"));

    private static final SubLList $list111 = list(makeString("Returns the entities recognized by this Stanford named-entity recognizer"), list(makeSymbol("CHECK-TYPE"), makeSymbol("TEXT"), makeSymbol("STRINGP")), list(makeSymbol("CLET"), list(list(makeSymbol("STANFORD-TOKENS"), list(makeSymbol("STANFORD-NER"), makeSymbol("TEXT"))), list(makeSymbol("LATEST-STRING"), list(makeSymbol("FIRST"), makeSymbol("STANFORD-TOKENS"))), list(makeSymbol("LATEST-TYPE"), list(makeSymbol("INTERN"), list(makeSymbol("SECOND"), makeSymbol("STANFORD-TOKENS")))), list(makeSymbol("ENTITIES"), NIL)), list(makeSymbol("CDO"), list(list(makeSymbol("TOKENS"), list(makeSymbol("CDDR"), makeSymbol("STANFORD-TOKENS")), list(makeSymbol("CDDR"), makeSymbol("TOKENS"))), list(makeSymbol("STRING"), list(makeSymbol("FIRST"), makeSymbol("TOKENS")), list(makeSymbol("FIRST"), makeSymbol("TOKENS"))), list(makeSymbol("TYPE"), list(makeSymbol("INTERN"), list(makeSymbol("SECOND"), makeSymbol("TOKENS"))), list(makeSymbol("INTERN"), list(makeSymbol("SECOND"), makeSymbol("TOKENS"))))), list(list(makeSymbol("NULL"), makeSymbol("TOKENS"))), list(makeSymbol("PCOND"), list(list(makeSymbol("CAND"), list(EQL, makeSymbol("TYPE"), makeSymbol("LATEST-TYPE")), list(makeSymbol("CNOT"), list(EQL, list(makeSymbol("QUOTE"), makeSymbol("O")), makeSymbol("TYPE")))), list(makeSymbol("CSETQ"), makeSymbol("LATEST-STRING"), list(makeSymbol("BUILD-MWL"), makeSymbol("LATEST-STRING"), makeSymbol("STRING")))), list(T, list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), list(makeSymbol("NEW-CONTEXTUALIZED-NAMED-ENTITY"), makeSymbol("LATEST-STRING"), makeSymbol("LATEST-TYPE"), makeSymbol("SELF"), makeSymbol("TEXT"), NIL, NIL, list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("TO-CYC")), makeSymbol("LATEST-TYPE")))), makeSymbol("ENTITIES")), list(makeSymbol("CSETQ"), makeSymbol("LATEST-STRING"), makeSymbol("STRING"), makeSymbol("LATEST-TYPE"), makeSymbol("TYPE"))))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), list(makeSymbol("NEW-CONTEXTUALIZED-NAMED-ENTITY"), makeSymbol("LATEST-STRING"), makeSymbol("LATEST-TYPE"), makeSymbol("SELF"), makeSymbol("TEXT"), NIL, NIL, list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("TO-CYC")), makeSymbol("LATEST-TYPE")))), makeSymbol("ENTITIES")), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), makeSymbol("ENTITIES")))));

    private static final SubLSymbol STANFORD_NER_RUN_METHOD = makeSymbol("STANFORD-NER-RUN-METHOD");

    private static final SubLString $str113$ = makeString("");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLSymbol MERGE_CLUSTERS = makeSymbol("MERGE-CLUSTERS");

    private static final SubLList $list116 = list(makeSymbol("CLUSTERS"), makeSymbol("LEXICON"));

    private static final SubLList $list117 = list(makeString("Merges clusters that the Stanford NER doesn\'t merge appropriately.  In particular, this merges \n   CITY, STATE cluster, since the NER returns <CITY/PLACE> <,/O> <STATE/PLACE> for things like\n   \'Austin, Texas\', and returns <CITY/PLACE> <,/O> <STATE/ORGANIZATION> for things like \'Austin, TX\'"), list(makeSymbol("IGNORE"), makeSymbol("LEXICON")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-CLUSTERS")), makeSymbol("PREV-NE"), makeSymbol("ANTE-PREV-NE")), list(makeSymbol("CDOLIST-NUMBERED"), list(makeSymbol("CLUSTER"), makeSymbol("CLUSTER-NUM"), makeSymbol("CLUSTERS")), list(makeSymbol("CLET"), list(list(makeSymbol("NE"), list(makeSymbol("FIRST"), makeSymbol("CLUSTER")))), list(makeSymbol("PCOND"), list(list(makeSymbol("CAND"), makeSymbol("PREV-NE"), makeSymbol("ANTE-PREV-NE"), list(EQUAL, list(makeSymbol("FIM"), makeSymbol("NE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CYC"))), reader_make_constant_shell(makeString("Place"))), list(EQUAL, makeString(","), list(makeSymbol("FIM"), makeSymbol("PREV-NE"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING")))), list(EQUAL, list(makeSymbol("FIM"), makeSymbol("ANTE-PREV-NE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CYC"))), reader_make_constant_shell(makeString("Place"))), list(makeSymbol("NE-HAS-STATE-DENOT?"), makeSymbol("LEXICON"), makeSymbol("NE")), list(makeSymbol("CNOT"), list(makeSymbol("NE-HAS-STATE-DENOT?"), makeSymbol("LEXICON"), makeSymbol("ANTE-PREV-NE")))), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-STRING"), list(makeSymbol("FORMAT-NIL"), makeString("~A, ~A"), list(makeSymbol("FIM"), makeSymbol("ANTE-PREV-NE"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), list(makeSymbol("FIM"), makeSymbol("NE"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))))), list(makeSymbol("TYPE"), list(makeSymbol("QUOTE"), makeSymbol("LOCATION"))), list(makeSymbol("TEXT"), list(makeSymbol("GET-SLOT"), makeSymbol("NE"), list(makeSymbol("QUOTE"), makeSymbol("CONTEXT"))))), list(makeSymbol("CSETQ"), makeSymbol("PREV-NE"), list(makeSymbol("NEW-CONTEXTUALIZED-NAMED-ENTITY"), makeSymbol("NEW-STRING"), makeSymbol("TYPE"), makeSymbol("SELF"), makeSymbol("TEXT"), NIL, NIL, list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("TO-CYC")), makeSymbol("TYPE")))), list(makeSymbol("CSETQ"), makeSymbol("ANTE-PREV-NE"), list(makeSymbol("CAAR"), makeSymbol("NEW-CLUSTERS"))), list(makeSymbol("CPOP"), makeSymbol("NEW-CLUSTERS")))), list(T, list(makeSymbol("PWHEN"), makeSymbol("ANTE-PREV-NE"), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeSymbol("ANTE-PREV-NE")), makeSymbol("NEW-CLUSTERS"))), list(makeSymbol("CSETQ"), makeSymbol("ANTE-PREV-NE"), makeSymbol("PREV-NE"), makeSymbol("PREV-NE"), makeSymbol("NE")))))), list(makeSymbol("PWHEN"), makeSymbol("ANTE-PREV-NE"), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeSymbol("ANTE-PREV-NE")), makeSymbol("NEW-CLUSTERS"))), list(makeSymbol("PWHEN"), makeSymbol("PREV-NE"), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeSymbol("PREV-NE")), makeSymbol("NEW-CLUSTERS"))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), makeSymbol("NEW-CLUSTERS")))));

    private static final SubLObject $$Place = reader_make_constant_shell(makeString("Place"));

    private static final SubLString $str119$_ = makeString(",");

    private static final SubLString $str120$__ = makeString(", ");

    private static final SubLSymbol LOCATION = makeSymbol("LOCATION");

    private static final SubLSymbol STANFORD_NER_MERGE_CLUSTERS_METHOD = makeSymbol("STANFORD-NER-MERGE-CLUSTERS-METHOD");





    private static final SubLObject $$State_US = reader_make_constant_shell(makeString("State-US"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    public static final SubLSymbol $stanford_ner_host$ = makeSymbol("*STANFORD-NER-HOST*");

    private static final SubLString $$$localhost = makeString("localhost");

    public static final SubLSymbol $stanford_ner_port$ = makeSymbol("*STANFORD-NER-PORT*");

    private static final SubLInteger $int$6666 = makeInteger(6666);

    private static final SubLString $str131$The_cat_sat_on_the_mat_ = makeString("The cat sat on the mat.");



    public static final SubLList $list133 = list(CHAR_space, CHAR_slash);

    private static final SubLSymbol RESPORATOR = makeSymbol("RESPORATOR");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_RESPORATOR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RESPORATOR-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_RESPORATOR_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RESPORATOR-INSTANCE");

    private static final SubLList $list137 = list(makeString("Returns the entities recognized by this resporator"), list(makeSymbol("CHECK-TYPE"), makeSymbol("TEXT"), makeSymbol("STRINGP")), list(makeSymbol("CLET"), list(list(makeSymbol("ENTITIES"), NIL)), list(makeSymbol("CDO"), list(list(makeSymbol("TOKENS"), list(makeSymbol("RESPORATOR"), makeSymbol("TEXT")), list(makeSymbol("NTHCDR"), makeSymbol("CARD"), makeSymbol("TOKENS"))), list(makeSymbol("ENTITY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("NEXT-RESPORATOR-ENTITY")), makeSymbol("TOKENS")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("NEXT-RESPORATOR-ENTITY")), makeSymbol("TOKENS"))), list(makeSymbol("CARD"), list(makeSymbol("LENGTH"), makeSymbol("ENTITY")), list(makeSymbol("LENGTH"), makeSymbol("ENTITY")))), list(list(makeSymbol("NULL"), makeSymbol("ENTITY"))), list(makeSymbol("CPUSH"), makeSymbol("ENTITY"), makeSymbol("ENTITIES"))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), makeSymbol("ENTITIES")))));

    private static final SubLSymbol NEXT_RESPORATOR_ENTITY = makeSymbol("NEXT-RESPORATOR-ENTITY");

    private static final SubLSymbol RESPORATOR_RUN_METHOD = makeSymbol("RESPORATOR-RUN-METHOD");

    private static final SubLList $list140 = list(makeKeyword("PRIVATE"));

    private static final SubLList $list141 = list(makeSymbol("TOKENS"));

    public static final SubLList $list142 = list(makeString("@param TOKENS listp;\n   @return listp; a disjunctively interpreted list of named-entity, all with the same\n   string and different types, resulting from a single occurrence in the input text"), list(makeSymbol("PUNLESS"), makeSymbol("TOKENS"), list(makeSymbol("RET"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("FIRST"), list(makeSymbol("FIRST"), makeSymbol("TOKENS"))), list(makeSymbol("DISJUNCTION"), list(makeSymbol("LIST"), list(makeSymbol("NEW-NAMED-ENTITY"), list(makeSymbol("CDR"), makeSymbol("FIRST")), list(makeSymbol("CAR"), makeSymbol("FIRST")), makeSymbol("SELF"), NIL, list(makeSymbol("RESPORATOR-TO-CYCL"), list(makeSymbol("CAR"), makeSymbol("FIRST")))))), list(makeSymbol("TYPE"), list(makeSymbol("CAR"), makeSymbol("FIRST"))), list(makeSymbol("STRING"), list(makeSymbol("CDR"), makeSymbol("FIRST"))), list(makeSymbol("TYPES-SO-FAR"), list(makeSymbol("LIST"), makeSymbol("TYPE")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TYPE.STRING"), list(makeSymbol("CDR"), makeSymbol("TOKENS"))), list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(makeSymbol("CNOT"), list(EQUAL, list(makeSymbol("CDR"), makeSymbol("TYPE.STRING")), makeSymbol("STRING"))), list(makeSymbol("MEMBER"), list(makeSymbol("CAR"), makeSymbol("TYPE.STRING")), makeSymbol("TYPES-SO-FAR"))), list(makeSymbol("RET"), makeSymbol("DISJUNCTION"))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-NAMED-ENTITY"), list(makeSymbol("CDR"), makeSymbol("TYPE.STRING")), list(makeSymbol("CAR"), makeSymbol("TYPE.STRING")), makeSymbol("SELF"), NIL, list(makeSymbol("RESPORATOR-TO-CYCL"), list(makeSymbol("CAR"), makeSymbol("TYPE.STRING")))), makeSymbol("DISJUNCTION")), list(makeSymbol("CPUSH"), list(makeSymbol("CAR"), makeSymbol("TYPE.STRING")), makeSymbol("TYPES-SO-FAR"))), list(makeSymbol("RET"), makeSymbol("DISJUNCTION"))));

    private static final SubLSymbol RESPORATOR_NEXT_RESPORATOR_ENTITY_METHOD = makeSymbol("RESPORATOR-NEXT-RESPORATOR-ENTITY-METHOD");



    private static final SubLObject $$GuruQAMt = reader_make_constant_shell(makeString("GuruQAMt"));

    public static final SubLList $list146 = list(reader_make_constant_shell(makeString("guruqaGenlsToken")), reader_make_constant_shell(makeString("guruqaTypeToken")));



    private static final SubLObject $$EnduringThing_Localized = reader_make_constant_shell(makeString("EnduringThing-Localized"));

    private static final SubLObject $$InstanceNamedFn_Ternary = reader_make_constant_shell(makeString("InstanceNamedFn-Ternary"));

    private static final SubLObject $$State_UnitedStates = reader_make_constant_shell(makeString("State-UnitedStates"));

    private static final SubLObject $$GeopoliticalEntityNamedFn = reader_make_constant_shell(makeString("GeopoliticalEntityNamedFn"));





    private static final SubLSymbol SET_LEARNERS = makeSymbol("SET-LEARNERS");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol PATTERN_MATCHES_FORMULA = makeSymbol("PATTERN-MATCHES-FORMULA");

    private static final SubLSymbol NE_TEST_TIGHTEN_TYPE = makeSymbol("NE-TEST-TIGHTEN-TYPE");



    private static final SubLSymbol NE_TEST_FUNC = makeSymbol("NE-TEST-FUNC");





    public static final SubLList $list163 = list(makeSymbol("NL-PARSING-TEST-CASES"));







    private static final SubLList $list167 = list(new SubLObject[]{ list(list(makeString("Canadian linguist George Lakoff lives in the woods"), makeString("George Lakoff"), reader_make_constant_shell(makeString("Person"))), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("CollectionIntersection2Fn")), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("CitizenFn")), reader_make_constant_shell(makeString("Canada"))), reader_make_constant_shell(makeString("CanadianPerson"))), reader_make_constant_shell(makeString("Linguist"))), list(reader_make_constant_shell(makeString("CollectionIntersection2Fn")), reader_make_constant_shell(makeString("Linguist")), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("CitizenFn")), reader_make_constant_shell(makeString("Canada"))), reader_make_constant_shell(makeString("CanadianPerson")))))), list(list(makeString("British chef Paul Cunningham opened a new restaurant last week"), makeString("Paul Cunningham"), reader_make_constant_shell(makeString("Person"))), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("CollectionIntersection2Fn")), reader_make_constant_shell(makeString("BritishPerson")), reader_make_constant_shell(makeString("Chef"))), list(reader_make_constant_shell(makeString("CollectionIntersection2Fn")), reader_make_constant_shell(makeString("Chef")), list(reader_make_constant_shell(makeString("CitizenFn")), reader_make_constant_shell(makeString("UnitedKingdomOfGreatBritainAndNorthernIreland")))), list(reader_make_constant_shell(makeString("CollectionIntersection2Fn")), list(reader_make_constant_shell(makeString("CitizenFn")), reader_make_constant_shell(makeString("UnitedKingdomOfGreatBritainAndNorthernIreland"))), reader_make_constant_shell(makeString("Chef"))))), list(list(makeString("Ranasinghe Premadasa - President of Sri Lanka - was assassinated."), makeString("Ranasinghe Premadasa"), reader_make_constant_shell(makeString("Person"))), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromFn")), list(makeKeyword("OR"), reader_make_constant_shell(makeString("Person")), reader_make_constant_shell(makeString("PresidentOfOrganization"))), reader_make_constant_shell(makeString("president")), reader_make_constant_shell(makeString("SriLanka")))), list(list(makeString("Ranasinghe Premadasa, President of Sri Lanka, was assassinated."), makeString("Ranasinghe Premadasa"), reader_make_constant_shell(makeString("Person"))), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromFn")), list(makeKeyword("OR"), reader_make_constant_shell(makeString("Person")), reader_make_constant_shell(makeString("PresidentOfOrganization"))), reader_make_constant_shell(makeString("president")), reader_make_constant_shell(makeString("SriLanka")))), list(list(makeString("Ranasinghe Premadasa (President of Sri Lanka) was assassinated."), makeString("Ranasinghe Premadasa"), reader_make_constant_shell(makeString("Person"))), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromFn")), list(makeKeyword("OR"), reader_make_constant_shell(makeString("Person")), reader_make_constant_shell(makeString("PresidentOfOrganization"))), reader_make_constant_shell(makeString("president")), reader_make_constant_shell(makeString("SriLanka")))), list(list(makeString("In 2004 he released Spooked, which was recorded with country/folk duo Gillian Welch and David Rawlings."), makeString("country/folk duo"), NIL), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("Duo-MusicalPerformanceGroup")), reader_make_constant_shell(makeString("institutionalFocus")), reader_make_constant_shell(makeString("FolkMusic")))), list(list(makeString("He is undergoing a medial septal myectomy."), makeString("medial septal myectomy"), NIL), reader_make_constant_shell(makeString("SeptalMyectomy"))), list(list(makeString("Salle Moulay Abdellah is an indoor sporting arena located in Rabat, Morocco. The capacity of the arena is 10,000 people."), makeString("Salle Moulay Abdellah"), NIL), reader_make_constant_shell(makeString("Stadium"))), list(list(makeString("The Hazaras even boasted a prime minister, Sultan Ali Keshtmand, in the mid-1980s."), makeString("Sultan Ali Keshtmand"), reader_make_constant_shell(makeString("Person"))), reader_make_constant_shell(makeString("PrimeMinister-HeadOfGovernment"))), list(list(makeString("Assadullah Sarwari replaced him with a Banner leader, Sultan Ali Keshtmand."), makeString("Sultan Ali Keshtmand"), reader_make_constant_shell(makeString("Person"))), reader_make_constant_shell(makeString("Leader"))) });

    public static SubLObject get_named_entity_confidence(final SubLObject named_entity) {
        return classes.subloop_get_access_protected_instance_slot(named_entity, FIVE_INTEGER, CONFIDENCE);
    }

    public static SubLObject set_named_entity_confidence(final SubLObject named_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(named_entity, value, FIVE_INTEGER, CONFIDENCE);
    }

    public static SubLObject get_named_entity_cyc(final SubLObject named_entity) {
        return classes.subloop_get_access_protected_instance_slot(named_entity, FOUR_INTEGER, CYC);
    }

    public static SubLObject set_named_entity_cyc(final SubLObject named_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(named_entity, value, FOUR_INTEGER, CYC);
    }

    public static SubLObject get_named_entity_source(final SubLObject named_entity) {
        return classes.subloop_get_access_protected_instance_slot(named_entity, THREE_INTEGER, SOURCE);
    }

    public static SubLObject set_named_entity_source(final SubLObject named_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(named_entity, value, THREE_INTEGER, SOURCE);
    }

    public static SubLObject get_named_entity_type(final SubLObject named_entity) {
        return classes.subloop_get_access_protected_instance_slot(named_entity, TWO_INTEGER, TYPE);
    }

    public static SubLObject set_named_entity_type(final SubLObject named_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(named_entity, value, TWO_INTEGER, TYPE);
    }

    public static SubLObject get_named_entity_string(final SubLObject named_entity) {
        return classes.subloop_get_access_protected_instance_slot(named_entity, ONE_INTEGER, STRING);
    }

    public static SubLObject set_named_entity_string(final SubLObject named_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(named_entity, value, ONE_INTEGER, STRING);
    }

    public static SubLObject subloop_reserved_initialize_named_entity_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_named_entity_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, NAMED_ENTITY, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, NAMED_ENTITY, TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, NAMED_ENTITY, SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, NAMED_ENTITY, CYC, NIL);
        classes.subloop_initialize_slot(new_instance, NAMED_ENTITY, CONFIDENCE, NIL);
        return NIL;
    }

    public static SubLObject named_entity_p(final SubLObject named_entity) {
        return classes.subloop_instanceof_class(named_entity, NAMED_ENTITY);
    }

    public static SubLObject new_named_entity(final SubLObject string, final SubLObject type, SubLObject source, SubLObject confidence, SubLObject cyc) {
        if (confidence == UNPROVIDED) {
            confidence = NIL;
        }
        if (cyc == UNPROVIDED) {
            cyc = NIL;
        }
        final SubLObject ne = object.new_class_instance(NAMED_ENTITY);
        instances.set_slot(ne, STRING, string);
        instances.set_slot(ne, TYPE, type);
        instances.set_slot(ne, SOURCE, source);
        instances.set_slot(ne, CONFIDENCE, confidence);
        instances.set_slot(ne, CYC, cyc);
        return ne;
    }

    public static SubLObject named_entity_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_named_entity_method = NIL;
        final SubLObject type = get_named_entity_type(self);
        final SubLObject string = get_named_entity_string(self);
        try {
            thread.throwStack.push($sym17$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
            try {
                write_string($str18$__NE__, stream, UNPROVIDED, UNPROVIDED);
                write_string(string, stream, UNPROVIDED, UNPROVIDED);
                write_string($str19$_, stream, UNPROVIDED, UNPROVIDED);
                princ(type, stream);
                write_string($str20$_, stream, UNPROVIDED, UNPROVIDED);
                sublisp_throw($sym17$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_named_entity_type(self, type);
                    set_named_entity_string(self, string);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_named_entity_method = Errors.handleThrowable(ccatch_env_var, $sym17$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_named_entity_method;
    }

    public static SubLObject named_entity_get_string_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_named_entity_method = NIL;
        final SubLObject string = get_named_entity_string(self);
        try {
            thread.throwStack.push($sym25$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
            try {
                sublisp_throw($sym25$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD, string);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_named_entity_string(self, string);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_named_entity_method = Errors.handleThrowable(ccatch_env_var, $sym25$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_named_entity_method;
    }

    public static SubLObject named_entity_get_type_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_named_entity_method = NIL;
        final SubLObject type = get_named_entity_type(self);
        try {
            thread.throwStack.push($sym29$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
            try {
                sublisp_throw($sym29$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD, type);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_named_entity_type(self, type);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_named_entity_method = Errors.handleThrowable(ccatch_env_var, $sym29$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_named_entity_method;
    }

    public static SubLObject named_entity_get_cyc_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_named_entity_method = NIL;
        final SubLObject cyc = get_named_entity_cyc(self);
        try {
            thread.throwStack.push($sym33$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
            try {
                sublisp_throw($sym33$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD, cyc);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_named_entity_cyc(self, cyc);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_named_entity_method = Errors.handleThrowable(ccatch_env_var, $sym33$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_named_entity_method;
    }

    public static SubLObject named_entity_get_confidence_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_named_entity_method = NIL;
        final SubLObject confidence = get_named_entity_confidence(self);
        try {
            thread.throwStack.push($sym37$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
            try {
                sublisp_throw($sym37$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD, confidence);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_named_entity_confidence(self, confidence);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_named_entity_method = Errors.handleThrowable(ccatch_env_var, $sym37$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_named_entity_method;
    }

    public static SubLObject named_entity_get_source_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_named_entity_method = NIL;
        final SubLObject source = get_named_entity_source(self);
        try {
            thread.throwStack.push($sym41$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
            try {
                sublisp_throw($sym41$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD, source);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_named_entity_source(self, source);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_named_entity_method = Errors.handleThrowable(ccatch_env_var, $sym41$OUTER_CATCH_FOR_NAMED_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_named_entity_method;
    }

    public static SubLObject get_contextualized_named_entity_subtypes(final SubLObject contextualized_named_entity) {
        return classes.subloop_get_access_protected_instance_slot(contextualized_named_entity, NINE_INTEGER, SUBTYPES);
    }

    public static SubLObject set_contextualized_named_entity_subtypes(final SubLObject contextualized_named_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(contextualized_named_entity, value, NINE_INTEGER, SUBTYPES);
    }

    public static SubLObject get_contextualized_named_entity_offsets(final SubLObject contextualized_named_entity) {
        return classes.subloop_get_access_protected_instance_slot(contextualized_named_entity, EIGHT_INTEGER, OFFSETS);
    }

    public static SubLObject set_contextualized_named_entity_offsets(final SubLObject contextualized_named_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(contextualized_named_entity, value, EIGHT_INTEGER, OFFSETS);
    }

    public static SubLObject get_contextualized_named_entity_context(final SubLObject contextualized_named_entity) {
        return classes.subloop_get_access_protected_instance_slot(contextualized_named_entity, SEVEN_INTEGER, CONTEXT);
    }

    public static SubLObject set_contextualized_named_entity_context(final SubLObject contextualized_named_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(contextualized_named_entity, value, SEVEN_INTEGER, CONTEXT);
    }

    public static SubLObject get_contextualized_named_entity_lexicon(final SubLObject contextualized_named_entity) {
        return classes.subloop_get_access_protected_instance_slot(contextualized_named_entity, SIX_INTEGER, LEXICON);
    }

    public static SubLObject set_contextualized_named_entity_lexicon(final SubLObject contextualized_named_entity, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(contextualized_named_entity, value, SIX_INTEGER, LEXICON);
    }

    public static SubLObject subloop_reserved_initialize_contextualized_named_entity_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_contextualized_named_entity_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, NAMED_ENTITY, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, NAMED_ENTITY, TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, NAMED_ENTITY, SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, NAMED_ENTITY, CYC, NIL);
        classes.subloop_initialize_slot(new_instance, NAMED_ENTITY, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, CONTEXTUALIZED_NAMED_ENTITY, LEXICON, NIL);
        classes.subloop_initialize_slot(new_instance, CONTEXTUALIZED_NAMED_ENTITY, CONTEXT, NIL);
        classes.subloop_initialize_slot(new_instance, CONTEXTUALIZED_NAMED_ENTITY, OFFSETS, NIL);
        classes.subloop_initialize_slot(new_instance, CONTEXTUALIZED_NAMED_ENTITY, SUBTYPES, NIL);
        return NIL;
    }

    public static SubLObject contextualized_named_entity_p(final SubLObject contextualized_named_entity) {
        return classes.subloop_instanceof_class(contextualized_named_entity, CONTEXTUALIZED_NAMED_ENTITY);
    }

    public static SubLObject new_contextualized_named_entity(final SubLObject string, final SubLObject type, SubLObject source, final SubLObject v_context, final SubLObject offsets, SubLObject confidence, SubLObject cyc) {
        if (confidence == UNPROVIDED) {
            confidence = NIL;
        }
        if (cyc == UNPROVIDED) {
            cyc = NIL;
        }
        final SubLObject ne = object.new_class_instance(CONTEXTUALIZED_NAMED_ENTITY);
        instances.set_slot(ne, STRING, string);
        instances.set_slot(ne, TYPE, type);
        instances.set_slot(ne, SOURCE, source);
        instances.set_slot(ne, CONTEXT, v_context);
        instances.set_slot(ne, OFFSETS, offsets);
        instances.set_slot(ne, CONFIDENCE, confidence);
        instances.set_slot(ne, CYC, cyc);
        return ne;
    }

    public static SubLObject contextualized_named_entity_get_lexicon_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_contextualized_named_entity_method = NIL;
        SubLObject lexicon = get_contextualized_named_entity_lexicon(self);
        try {
            thread.throwStack.push($sym53$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD);
            try {
                if (NIL == lexicon) {
                    lexicon = term_lexicon.new_case_sensitivity_preferred_term_lexicon();
                    methods.funcall_instance_method_with_0_args(lexicon, IGNORE_CACHE);
                }
                sublisp_throw($sym53$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD, lexicon);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_contextualized_named_entity_lexicon(self, lexicon);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_contextualized_named_entity_method = Errors.handleThrowable(ccatch_env_var, $sym53$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_contextualized_named_entity_method;
    }

    public static SubLObject contextualized_named_entity_set_lexicon_method(final SubLObject self, final SubLObject lex) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_contextualized_named_entity_method = NIL;
        SubLObject lexicon = get_contextualized_named_entity_lexicon(self);
        try {
            thread.throwStack.push($sym59$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD);
            try {
                lexicon = lex;
                sublisp_throw($sym59$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD, lexicon);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_contextualized_named_entity_lexicon(self, lexicon);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_contextualized_named_entity_method = Errors.handleThrowable(ccatch_env_var, $sym59$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_contextualized_named_entity_method;
    }

    public static SubLObject denot_collections(final SubLObject denots, SubLObject base_collection) {
        if (base_collection == UNPROVIDED) {
            base_collection = NIL;
        }
        assert NIL != listp(denots) : "Types.listp(denots) " + "CommonSymbols.NIL != Types.listp(denots) " + denots;
        SubLObject results = NIL;
        SubLObject cdolist_list_var = denots;
        SubLObject denot = NIL;
        denot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != fort_types_interface.isa_collectionP(denot, UNPROVIDED)) && (NIL == disjoint_with.collections_disjointP(base_collection, denot, UNPROVIDED))) {
                final SubLObject item_var = denot;
                if (NIL == member(item_var, results, symbol_function(EQL), symbol_function(IDENTITY))) {
                    results = cons(item_var, results);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            denot = cdolist_list_var.first();
        }
        return results;
    }

    public static SubLObject contextualized_named_entity_tighten_type_method(final SubLObject self, SubLObject respect_ner_typeP, SubLObject lexical_lookup_onlyP) {
        if (respect_ner_typeP == UNPROVIDED) {
            respect_ner_typeP = T;
        }
        if (lexical_lookup_onlyP == UNPROVIDED) {
            lexical_lookup_onlyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_contextualized_named_entity_method = NIL;
        SubLObject subtypes = get_contextualized_named_entity_subtypes(self);
        final SubLObject v_context = get_contextualized_named_entity_context(self);
        final SubLObject lexicon = get_contextualized_named_entity_lexicon(self);
        final SubLObject cyc = get_named_entity_cyc(self);
        final SubLObject string = get_named_entity_string(self);
        try {
            thread.throwStack.push($sym65$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD);
            try {
                final SubLObject v_parser = parser.new_stanford_parser(UNPROVIDED, UNPROVIDED);
                final SubLObject question_word = (cyc.eql($$Person)) ? $$$Who : $$$What;
                final SubLObject question_string = string_utilities.bunge(list(question_word, $$$is, cconcatenate(string, $str70$_)), UNPROVIDED);
                final SubLObject question_parse = methods.funcall_instance_method_with_1_args(v_parser, PARSE, question_string);
                final SubLObject v_question = object.new_class_instance(DEFINITIONAL_QUESTION);
                final SubLObject passage = search_engine.new_simple_passage(v_context);
                final SubLObject lexicon_$1 = methods.funcall_instance_method_with_0_args(self, GET_LEXICON);
                SubLObject answers = NIL;
                SubLObject tighter_types = NIL;
                SubLObject answer_strings = NIL;
                final SubLObject entity_string = methods.funcall_instance_method_with_0_args(self, GET_STRING);
                question.set_question_string(v_question, question_string);
                if (NIL != question_parse) {
                    methods.funcall_instance_method_with_1_args(question_parse, LEXIFY, lexicon_$1);
                }
                question.set_question_parse(v_question, question_parse);
                answers = methods.funcall_instance_method_with_1_args(v_question, EXTRACT, passage);
                if (!cyc.eql($$Organization)) {
                    answers = cons(answer.new_text_answer(v_question, entity_string, search_engine.new_simple_passage(entity_string), ONE_INTEGER, UNPROVIDED), answers);
                }
                final SubLObject local_state;
                final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        SubLObject cdolist_list_var = answers;
                        SubLObject v_answer = NIL;
                        v_answer = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject answer_string = methods.funcall_instance_method_with_0_args(v_answer, GET_CONTENT);
                            if ((NIL != string_utilities.substringP(answer_string, entity_string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || ((NIL == string_utilities.ends_with_start_of(entity_string, answer_string, EQUAL, $list77)) && (NIL == string_utilities.ends_with_start_of(answer_string, entity_string, EQUAL, $list77)))) {
                                thread.resetMultipleValues();
                                final SubLObject new_tighter_types = tighter_types_from_answer(v_answer, lexicon_$1, entity_string, NIL != respect_ner_typeP ? cyc : NIL, lexical_lookup_onlyP);
                                final SubLObject answer_string_$2 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                answer_strings = cons(answer_string_$2, answer_strings);
                                tighter_types = union(tighter_types, new_tighter_types, UNPROVIDED, UNPROVIDED);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            v_answer = cdolist_list_var.first();
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                } finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                }
                subtypes = tighter_types;
                sublisp_throw($sym65$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD, list(tighter_types, answer_strings));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    set_contextualized_named_entity_subtypes(self, subtypes);
                    set_contextualized_named_entity_context(self, v_context);
                    set_contextualized_named_entity_lexicon(self, lexicon);
                    set_named_entity_cyc(self, cyc);
                    set_named_entity_string(self, string);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_contextualized_named_entity_method = Errors.handleThrowable(ccatch_env_var, $sym65$OUTER_CATCH_FOR_CONTEXTUALIZED_NAMED_ENTITY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_contextualized_named_entity_method;
    }

    public static SubLObject tighter_types_from_answer(final SubLObject v_answer, final SubLObject lexicon, final SubLObject entity_string, final SubLObject cyc_type, SubLObject lexical_lookup_onlyP) {
        if (lexical_lookup_onlyP == UNPROVIDED) {
            lexical_lookup_onlyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tighter_types = NIL;
        final SubLObject trees = get_trees_to_head(methods.funcall_instance_method_with_0_args(v_answer, GET_PARSE_TREE));
        SubLObject type_string = NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$psp_return_mode$.currentBinding(thread);
        try {
            parsing_vars.$npp_use_nl_tagsP$.bind(NIL, thread);
            parsing_vars.$psp_return_mode$.bind($BEST_ONLY, thread);
            if (NIL == trees) {
                type_string = lexicon_utilities.strip_determiner(methods.funcall_instance_method_with_0_args(v_answer, GET_CONTENT), UNPROVIDED);
                tighter_types = tighter_types_from_string(type_string, lexicon, entity_string, cyc_type, lexical_lookup_onlyP);
            } else
                if (NIL == tighter_types) {
                    SubLObject csome_list_var = trees;
                    SubLObject tree = NIL;
                    tree = csome_list_var.first();
                    while ((NIL == tighter_types) && (NIL != csome_list_var)) {
                        final SubLObject answer_string = methods.funcall_instance_method_with_0_args(tree, GET_STRING);
                        type_string = lexicon_utilities.strip_determiner(answer_string, UNPROVIDED);
                        tighter_types = tighter_types_from_string(type_string, lexicon, entity_string, cyc_type, lexical_lookup_onlyP);
                        csome_list_var = csome_list_var.rest();
                        tree = csome_list_var.first();
                    }
                }

        } finally {
            parsing_vars.$psp_return_mode$.rebind(_prev_bind_2, thread);
            parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_0, thread);
        }
        return values(tighter_types, type_string);
    }

    public static SubLObject tighter_types_from_string(final SubLObject type_string, final SubLObject lexicon, final SubLObject entity_string, final SubLObject cyc_type, final SubLObject lexical_lookup_onlyP) {
        SubLObject tighter_types = NIL;
        if ((NIL == string_acceptably_short_for_ps_parseP(type_string, lexicon, UNPROVIDED)) || (NIL != lexical_lookup_onlyP)) {
            final SubLObject doc = document_annotation_widgets.new_tagged_document(type_string, lexicon, T, UNPROVIDED, UNPROVIDED);
            final SubLObject types = remove_duplicates(concepts_from_document(doc), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            tighter_types = denot_collections(types, cyc_type);
        } else {
            final SubLObject v_psp_lexicon = psp_lexicon.new_psp_lexicon_from_term_lexicon(lexicon);
            tighter_types = denot_collections(denots_of_ps_harvest_nbars(type_string, NIL, entity_string, v_psp_lexicon), cyc_type);
        }
        return tighter_types;
    }

    public static SubLObject concepts_from_document(final SubLObject doc) {
        SubLObject result = NIL;
        final SubLObject vector_var = document.document_paragraphs(doc);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$4;
        SubLObject backwardP_var_$5;
        SubLObject length_$6;
        SubLObject v_iteration_$7;
        SubLObject element_num_$8;
        SubLObject sentence;
        SubLObject cdolist_list_var;
        SubLObject word;
        SubLObject cdolist_list_var_$9;
        SubLObject cycl;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$4 = document.paragraph_sentences(paragraph);
            backwardP_var_$5 = NIL;
            for (length_$6 = length(vector_var_$4), v_iteration_$7 = NIL, v_iteration_$7 = ZERO_INTEGER; v_iteration_$7.numL(length_$6); v_iteration_$7 = add(v_iteration_$7, ONE_INTEGER)) {
                element_num_$8 = (NIL != backwardP_var_$5) ? subtract(length_$6, v_iteration_$7, ONE_INTEGER) : v_iteration_$7;
                sentence = aref(vector_var_$4, element_num_$8);
                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                word = NIL;
                word = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    cdolist_list_var_$9 = document.word_cycls(word);
                    cycl = NIL;
                    cycl = cdolist_list_var_$9.first();
                    while (NIL != cdolist_list_var_$9) {
                        result = cons(cycl, result);
                        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                        cycl = cdolist_list_var_$9.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                }
            }
        }
        return result;
    }

    public static SubLObject get_trees_to_head(final SubLObject tree) {
        SubLObject nominals = (NIL != tree) ? list(tree) : NIL;
        SubLObject current_descendent;
        for (SubLObject descendents = (NIL != parse_tree.phrase_tree_p(tree)) ? methods.funcall_instance_method_with_0_args(tree, GET_HEAD_DAUGHTERS) : NIL; NIL != descendents; descendents = cconcatenate(descendents, methods.funcall_instance_method_with_0_args(current_descendent, GET_HEAD_DAUGHTERS))) {
            current_descendent = descendents.first();
            nominals = cons(current_descendent, nominals);
            descendents = descendents.rest();
            if (NIL != parse_tree.phrase_tree_p(current_descendent)) {
            }
        }
        return nreverse(nominals);
    }

    public static SubLObject string_acceptably_short_for_ps_parseP(final SubLObject string, final SubLObject lexicon, SubLObject max_words) {
        if (max_words == UNPROVIDED) {
            max_words = FOUR_INTEGER;
        }
        final SubLObject sent = document.new_sentence(string, UNPROVIDED);
        final SubLObject lexified = methods.funcall_instance_method_with_1_args(lexicon, LEXIFY_SENTENCE, sent);
        return numLE(document.sentence_length(lexified), max_words);
    }

    public static SubLObject denots_of_ps_harvest_nbars_internal(final SubLObject string, SubLObject non_trivialP, SubLObject forbidden_string, SubLObject lexicon) {
        if (non_trivialP == UNPROVIDED) {
            non_trivialP = T;
        }
        if (forbidden_string == UNPROVIDED) {
            forbidden_string = NIL;
        }
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject base_result = NIL;
        final SubLObject v_psp_chart = psp_syntax.psp_chart_for_string(string, lexicon, UNPROVIDED, UNPROVIDED);
        SubLObject result_cycls = NIL;
        final SubLObject chart = v_psp_chart;
        final SubLObject local_state = psp_chart.psp_chart_memoization_state(chart);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject _prev_bind_0_$10 = parsing_vars.$psp_chart$.currentBinding(thread);
                try {
                    parsing_vars.$psp_chart$.bind(chart, thread);
                    base_result = psp_main.ps_harvest_nbars(string, non_trivialP, UNPROVIDED);
                    final SubLObject max_length = length(get_max_span_from_psp_result(base_result, NIL != string_utilities.substringP(string, forbidden_string, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? forbidden_string : NIL));
                    SubLObject cdolist_list_var = base_result;
                    SubLObject span_and_answers = NIL;
                    span_and_answers = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = span_and_answers;
                        SubLObject span = NIL;
                        SubLObject cycls = NIL;
                        destructuring_bind_must_consp(current, datum, $list84);
                        span = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list84);
                        cycls = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (length(span).numE(max_length)) {
                                result_cycls = cconcatenate(result_cycls, cycls);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list84);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        span_and_answers = cdolist_list_var.first();
                    }
                } finally {
                    parsing_vars.$psp_chart$.rebind(_prev_bind_0_$10, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return remove_duplicates(result_cycls, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject denots_of_ps_harvest_nbars(final SubLObject string, SubLObject non_trivialP, SubLObject forbidden_string, SubLObject lexicon) {
        if (non_trivialP == UNPROVIDED) {
            non_trivialP = T;
        }
        if (forbidden_string == UNPROVIDED) {
            forbidden_string = NIL;
        }
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return denots_of_ps_harvest_nbars_internal(string, non_trivialP, forbidden_string, lexicon);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, DENOTS_OF_PS_HARVEST_NBARS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), DENOTS_OF_PS_HARVEST_NBARS, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, DENOTS_OF_PS_HARVEST_NBARS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(string, non_trivialP, forbidden_string, lexicon);
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
                    if (non_trivialP.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (forbidden_string.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && lexicon.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(denots_of_ps_harvest_nbars_internal(string, non_trivialP, forbidden_string, lexicon)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(string, non_trivialP, forbidden_string, lexicon));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject get_max_span_from_psp_result(final SubLObject psp_result, final SubLObject forbidden_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject forbidden_span = NIL;
        if (NIL == psp_result) {
            return NIL;
        }
        if (NIL != forbidden_string) {
            final SubLObject chart_$12;
            final SubLObject chart = chart_$12 = psp_syntax.psp_chart_for_string(forbidden_string, psp_lexicon.get_default_psp_lexicon(UNPROVIDED, UNPROVIDED, UNPROVIDED), $NONE, NIL);
            final SubLObject local_state = psp_chart.psp_chart_memoization_state(chart_$12);
            final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject _prev_bind_0_$13 = parsing_vars.$psp_chart$.currentBinding(thread);
                    try {
                        parsing_vars.$psp_chart$.bind(chart_$12, thread);
                        forbidden_span = psp_main.psp_token_list_from_span(psp_chart.psp_chart_max_span());
                    } finally {
                        parsing_vars.$psp_chart$.rebind(_prev_bind_0_$13, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
            }
        }
        final SubLObject first_span = psp_result.first().first();
        if (!forbidden_span.equal(first_span)) {
            return first_span;
        }
        return second(psp_result).first();
    }

    public static SubLObject clear_named_entityP() {
        final SubLObject cs = $named_entityP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_named_entityP(final SubLObject sent, final SubLObject ans) {
        return memoization_state.caching_state_remove_function_results_with_args($named_entityP_caching_state$.getGlobalValue(), list(sent, ans), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject named_entityP_internal(final SubLObject sent, final SubLObject ans) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(sent) : "Types.stringp(sent) " + "CommonSymbols.NIL != Types.stringp(sent) " + sent;
        assert NIL != stringp(ans) : "Types.stringp(ans) " + "CommonSymbols.NIL != Types.stringp(ans) " + ans;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if ((NIL == string_utilities.empty_string_p(sent)) && (NIL == string_utilities.empty_string_p(ans))) {
                        final SubLObject ner = object.new_class_instance(STANFORD_NER);
                        SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(ner, RUN, sent);
                        SubLObject named_entity_disjunction = NIL;
                        named_entity_disjunction = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject cdolist_list_var_$15 = named_entity_disjunction;
                            SubLObject named_entity = NIL;
                            named_entity = cdolist_list_var_$15.first();
                            while (NIL != cdolist_list_var_$15) {
                                if ((!O.eql(methods.funcall_instance_method_with_0_args(named_entity, GET_TYPE))) && (NIL != Strings.stringE(methods.funcall_instance_method_with_0_args(named_entity, GET_STRING), ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    return methods.funcall_instance_method_with_0_args(named_entity, GET_CYC);
                                }
                                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                                named_entity = cdolist_list_var_$15.first();
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            named_entity_disjunction = cdolist_list_var.first();
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
        if ((NIL != error) && (NIL != $break_named_entityP$.getDynamicValue(thread))) {
            Errors.sublisp_break($str93$Error___S_occured_in_NAMED_ENTITY, new SubLObject[]{ error });
        }
        return values(NIL, error);
    }

    public static SubLObject named_entityP(final SubLObject sent, final SubLObject ans) {
        SubLObject caching_state = $named_entityP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym86$NAMED_ENTITY_, $sym94$_NAMED_ENTITY__CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sent, ans);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && ans.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(named_entityP_internal(sent, ans)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sent, ans));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject named_entity_recognizer_p(final SubLObject v_named_entity_recognizer) {
        return interfaces.subloop_instanceof_interface(v_named_entity_recognizer, NAMED_ENTITY_RECOGNIZER);
    }

    public static SubLObject get_stanford_ner_known_cyc_types(final SubLObject stanford_ner) {
        final SubLObject v_class = (stanford_ner.isSymbol()) ? classes.classes_retrieve_class(stanford_ner) : NIL != subloop_structures.class_p(stanford_ner) ? stanford_ner : NIL != subloop_structures.instance_p(stanford_ner) ? subloop_structures.instance_class(stanford_ner) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(KNOWN_CYC_TYPES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_stanford_ner_known_cyc_types(final SubLObject stanford_ner, final SubLObject value) {
        final SubLObject v_class = (stanford_ner.isSymbol()) ? classes.classes_retrieve_class(stanford_ner) : NIL != subloop_structures.class_p(stanford_ner) ? stanford_ner : NIL != subloop_structures.instance_p(stanford_ner) ? subloop_structures.instance_class(stanford_ner) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(KNOWN_CYC_TYPES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_stanford_ner_type_map(final SubLObject stanford_ner) {
        final SubLObject v_class = (stanford_ner.isSymbol()) ? classes.classes_retrieve_class(stanford_ner) : NIL != subloop_structures.class_p(stanford_ner) ? stanford_ner : NIL != subloop_structures.instance_p(stanford_ner) ? subloop_structures.instance_class(stanford_ner) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(TYPE_MAP, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_stanford_ner_type_map(final SubLObject stanford_ner, final SubLObject value) {
        final SubLObject v_class = (stanford_ner.isSymbol()) ? classes.classes_retrieve_class(stanford_ner) : NIL != subloop_structures.class_p(stanford_ner) ? stanford_ner : NIL != subloop_structures.instance_p(stanford_ner) ? subloop_structures.instance_class(stanford_ner) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(TYPE_MAP, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_stanford_ner_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, STANFORD_NER, TYPE_MAP, $list101);
        classes.subloop_initialize_slot(new_instance, STANFORD_NER, KNOWN_CYC_TYPES, $list102);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_stanford_ner_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        return NIL;
    }

    public static SubLObject stanford_ner_p(final SubLObject stanford_ner) {
        return classes.subloop_instanceof_class(stanford_ner, STANFORD_NER);
    }

    public static SubLObject stanford_ner_to_cyc_method(final SubLObject self, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_stanford_ner_method = NIL;
        final SubLObject type_map = get_stanford_ner_type_map(self);
        try {
            thread.throwStack.push($sym108$OUTER_CATCH_FOR_STANFORD_NER_METHOD);
            try {
                sublisp_throw($sym108$OUTER_CATCH_FOR_STANFORD_NER_METHOD, assoc(type, type_map, UNPROVIDED, UNPROVIDED).rest());
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_stanford_ner_type_map(self, type_map);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_stanford_ner_method = Errors.handleThrowable(ccatch_env_var, $sym108$OUTER_CATCH_FOR_STANFORD_NER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_stanford_ner_method;
    }

    public static SubLObject stanford_ner_run_method(final SubLObject self, final SubLObject text) {
        assert NIL != stringp(text) : "Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) " + text;
        final SubLObject stanford_tokens = stanford_ner(text, UNPROVIDED, UNPROVIDED);
        SubLObject latest_string = stanford_tokens.first();
        SubLObject latest_type = intern(second(stanford_tokens), UNPROVIDED);
        SubLObject entities = NIL;
        SubLObject tokens = NIL;
        SubLObject string = NIL;
        SubLObject type = NIL;
        tokens = cddr(stanford_tokens);
        string = tokens.first();
        type = intern(second(tokens), UNPROVIDED);
        while (NIL != tokens) {
            if (type.eql(latest_type) && (!O.eql(type))) {
                latest_string = build_mwl(latest_string, string);
            } else {
                entities = cons(list(new_contextualized_named_entity(latest_string, latest_type, self, text, NIL, NIL, methods.funcall_instance_method_with_1_args(self, TO_CYC, latest_type))), entities);
                latest_string = string;
                latest_type = type;
            }
            tokens = cddr(tokens);
            string = tokens.first();
            type = intern(second(tokens), UNPROVIDED);
        }
        entities = cons(list(new_contextualized_named_entity(latest_string, latest_type, self, text, NIL, NIL, methods.funcall_instance_method_with_1_args(self, TO_CYC, latest_type))), entities);
        return nreverse(entities);
    }

    public static SubLObject build_mwl(final SubLObject s1, final SubLObject s3) {
        return cconcatenate(s1, new SubLObject[]{ NIL != string_utilities.punctuation_string_p(s3) ? $str113$ : $$$_, s3 });
    }

    public static SubLObject stanford_ner_merge_clusters_method(final SubLObject self, final SubLObject clusters, final SubLObject lexicon) {
        SubLObject new_clusters = NIL;
        SubLObject prev_ne = NIL;
        SubLObject ante_prev_ne = NIL;
        SubLObject list_var = NIL;
        SubLObject cluster = NIL;
        SubLObject cluster_num = NIL;
        list_var = clusters;
        cluster = list_var.first();
        for (cluster_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , cluster = list_var.first() , cluster_num = add(ONE_INTEGER, cluster_num)) {
            final SubLObject ne = cluster.first();
            if (((((((NIL != prev_ne) && (NIL != ante_prev_ne)) && methods.funcall_instance_method_with_0_args(ne, GET_CYC).equal($$Place)) && $str119$_.equal(methods.funcall_instance_method_with_0_args(prev_ne, GET_STRING))) && methods.funcall_instance_method_with_0_args(ante_prev_ne, GET_CYC).equal($$Place)) && (NIL != ne_has_state_denotP(lexicon, ne))) && (NIL == ne_has_state_denotP(lexicon, ante_prev_ne))) {
                final SubLObject new_string = cconcatenate(format_nil.format_nil_a_no_copy(methods.funcall_instance_method_with_0_args(ante_prev_ne, GET_STRING)), new SubLObject[]{ $str120$__, format_nil.format_nil_a_no_copy(methods.funcall_instance_method_with_0_args(ne, GET_STRING)) });
                final SubLObject type = LOCATION;
                final SubLObject text = instances.get_slot(ne, CONTEXT);
                prev_ne = new_contextualized_named_entity(new_string, type, self, text, NIL, NIL, methods.funcall_instance_method_with_1_args(self, TO_CYC, type));
                ante_prev_ne = caar(new_clusters);
                new_clusters = new_clusters.rest();
            } else {
                if (NIL != ante_prev_ne) {
                    new_clusters = cons(list(ante_prev_ne), new_clusters);
                }
                ante_prev_ne = prev_ne;
                prev_ne = ne;
            }
        }
        if (NIL != ante_prev_ne) {
            new_clusters = cons(list(ante_prev_ne), new_clusters);
        }
        if (NIL != prev_ne) {
            new_clusters = cons(list(prev_ne), new_clusters);
        }
        return nreverse(new_clusters);
    }

    public static SubLObject ne_has_state_denotP(final SubLObject lexicon, final SubLObject ne) {
        final SubLObject string = methods.funcall_instance_method_with_0_args(ne, GET_STRING);
        SubLObject cdolist_list_var;
        final SubLObject entries = cdolist_list_var = methods.funcall_instance_method_with_1_args(lexicon, GET, string);
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != isa.isaP(methods.funcall_instance_method_with_1_args(entry, GET, $DENOT), $$State_US, $$InferencePSC, UNPROVIDED)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return NIL;
    }

    public static SubLObject stanford_ner_ping(SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $stanford_ner_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $stanford_ner_port$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    stanford_ner($str131$The_cat_sat_on_the_mat_, host, port);
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

    public static SubLObject stanford_ner(final SubLObject string, SubLObject host, SubLObject port) {
        if (host == UNPROVIDED) {
            host = $stanford_ner_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $stanford_ner_port$.getDynamicValue();
        }
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            stream = subl_promotions.open_tcp_stream_with_timeout(host, port, NIL, $PUBLIC);
            if (NIL != validate_tcp_connection(stream, host, port)) {
                princ(string, stream);
                terpri(stream);
                finish_output(stream);
                final SubLObject read_line = read_line(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				result = string_utilities.split_string(string_utilities.trim_whitespace(read_line), $list133);
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != stream) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }

    public static SubLObject subloop_reserved_initialize_resporator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_resporator_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        return NIL;
    }

    public static SubLObject resporator_p(final SubLObject resporator) {
        return classes.subloop_instanceof_class(resporator, RESPORATOR);
    }

    public static SubLObject resporator_run_method(final SubLObject self, final SubLObject text) {
        assert NIL != stringp(text) : "Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) " + text;
        SubLObject entities = NIL;
        SubLObject tokens = NIL;
        SubLObject entity = NIL;
        SubLObject card = NIL;
        tokens = external_interfaces.resporator(text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        entity = methods.funcall_instance_method_with_1_args(self, NEXT_RESPORATOR_ENTITY, tokens);
        card = length(entity);
        while (NIL != entity) {
            entities = cons(entity, entities);
            tokens = nthcdr(card, tokens);
            entity = methods.funcall_instance_method_with_1_args(self, NEXT_RESPORATOR_ENTITY, tokens);
            card = length(entity);
        }
        return nreverse(entities);
    }

    public static SubLObject resporator_next_resporator_entity_method(final SubLObject self, final SubLObject tokens) {
        if (NIL == tokens) {
            return NIL;
        }
        final SubLObject first = tokens.first();
        SubLObject disjunction = list(new_named_entity(first.rest(), first.first(), self, NIL, resporator_to_cycl(first.first())));
        final SubLObject type = first.first();
        final SubLObject string = first.rest();
        SubLObject types_so_far = list(type);
        SubLObject cdolist_list_var = tokens.rest();
        SubLObject typeXstring = NIL;
        typeXstring = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((!typeXstring.rest().equal(string)) || (NIL != member(typeXstring.first(), types_so_far, UNPROVIDED, UNPROVIDED))) {
                return disjunction;
            }
            disjunction = cons(new_named_entity(typeXstring.rest(), typeXstring.first(), self, NIL, resporator_to_cycl(typeXstring.first())), disjunction);
            types_so_far = cons(typeXstring.first(), types_so_far);
            cdolist_list_var = cdolist_list_var.rest();
            typeXstring = cdolist_list_var.first();
        }
        return disjunction;
    }

    public static SubLObject build_resporator_to_cycl_map() {
        final SubLObject map = make_hash_table($int$100, symbol_function(EQL), UNPROVIDED);
        SubLObject cdolist_list_var = $list146;
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$16 = kb_mapping.gather_predicate_extent_index(predicate, $$GuruQAMt, UNPROVIDED);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var_$16.first();
            while (NIL != cdolist_list_var_$16) {
                sethash(intern(string_utilities.strip_final(assertions_high.gaf_arg1(assertion), UNPROVIDED), UNPROVIDED), map, assertions_high.gaf_arg2(assertion));
                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                assertion = cdolist_list_var_$16.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        }
        return map;
    }

    public static SubLObject maybe_initialize_resporator_to_cycl_map() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $resporator_to_cycl_map$.getDynamicValue(thread)) {
            $resporator_to_cycl_map$.setDynamicValue(build_resporator_to_cycl_map(), thread);
        }
        return T;
    }

    public static SubLObject resporator_to_cycl(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gethash(type, $resporator_to_cycl_map$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject get_nament_instance_meaning(final SubLObject nament) {
        if (DATE.eql(methods.funcall_instance_method_with_0_args(nament, GET_TYPE))) {
            return date_utilities.parse_date_from_string_fast(methods.funcall_instance_method_with_0_args(nament, GET_STRING), T, UNPROVIDED, UNPROVIDED);
        }
        if (LOCATION.eql(methods.funcall_instance_method_with_0_args(nament, GET_TYPE))) {
            return get_specific_place_from_string(methods.funcall_instance_method_with_0_args(nament, GET_STRING));
        }
        return NIL;
    }

    public static SubLObject get_specific_place_from_string(final SubLObject string) {
        SubLObject more_specific_places = NIL;
        final SubLObject lexicon = get_place_tightening_lexicon();
        final SubLObject entity_doc = document_annotation_widgets.new_tagged_document(string, lexicon, NIL, UNPROVIDED, UNPROVIDED);
        final SubLObject downcased_entity_doc = document_annotation_widgets.new_tagged_document(Strings.string_downcase(string, UNPROVIDED, UNPROVIDED), lexicon, NIL, UNPROVIDED, UNPROVIDED);
        final SubLObject last_word_index = subtract(document.document_word_length(entity_doc), ONE_INTEGER);
        final SubLObject head_word = document.document_get_word(entity_doc, last_word_index);
        final SubLObject downcased_head_word = document.document_get_word(downcased_entity_doc, last_word_index);
        SubLObject cdolist_list_var;
        final SubLObject head_word_cycls = cdolist_list_var = cconcatenate(document.word_cycls(downcased_head_word), document.word_cycls(head_word));
        SubLObject head_word_cycl = NIL;
        head_word_cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != genls.genlsP(head_word_cycl, $$EnduringThing_Localized, UNPROVIDED, UNPROVIDED)) {
                more_specific_places = cons(list($$InstanceNamedFn_Ternary, string, head_word_cycl, Guids.guid_to_string(Guids.new_guid())), more_specific_places);
            }
            if (((NIL != isa.isaP(head_word_cycl, $$State_UnitedStates, $$InferencePSC, UNPROVIDED)) && TWO_INTEGER.numGE(last_word_index)) && $str119$_.equal(document.word_string(document.document_get_word(entity_doc, subtract(last_word_index, ONE_INTEGER))))) {
                final SubLObject place_name_string = document.sentence_reconstruct_substring(ZERO_INTEGER, subtract(last_word_index, ONE_INTEGER), document.word_mother(head_word));
                more_specific_places = cons(list($$GeopoliticalEntityNamedFn, place_name_string, head_word_cycl), more_specific_places);
            }
            cdolist_list_var = cdolist_list_var.rest();
            head_word_cycl = cdolist_list_var.first();
        }
        return more_specific_places;
    }

    public static SubLObject clear_place_tightening_lexicon() {
        $place_tightening_lexicon$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject get_place_tightening_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == term_lexicon.term_lexicon_p($place_tightening_lexicon$.getDynamicValue(thread))) {
            $place_tightening_lexicon$.setDynamicValue(concept_tagger.make_default_concept_tagger_lexicon(), thread);
            methods.funcall_instance_method_with_1_args($place_tightening_lexicon$.getDynamicValue(thread), SET_CASE_SENSITIVITY, $OFF);
            methods.funcall_instance_method_with_1_args($place_tightening_lexicon$.getDynamicValue(thread), SET_LEARNERS, NIL);
            methods.funcall_instance_method_with_0_args($place_tightening_lexicon$.getDynamicValue(thread), IGNORE_CACHE);
        }
        return $place_tightening_lexicon$.getDynamicValue(thread);
    }

    public static SubLObject ne_test_tighten_type(final SubLObject passage_string, final SubLObject term_string, final SubLObject base_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_types = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject start_pos = search(term_string, passage_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject ne = new_contextualized_named_entity(term_string, base_type, NIL, passage_string, list(start_pos), UNPROVIDED, UNPROVIDED);
                    result_types = methods.funcall_instance_method_with_0_args(ne, TIGHTEN_TYPE).first();
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
        return result_types;
    }

    public static SubLObject ne_test_tighten_type_undesired_return(final SubLObject passage_string, final SubLObject term_string, final SubLObject base_type) {
        return ne_test_tighten_type(passage_string, term_string, base_type);
    }

    public static SubLObject ne_test_func(final SubLObject thing1, final SubLObject thing2) {
        return member(narts_high.nart_substitute(czer_main.canonicalize_term(thing2, UNPROVIDED)), czer_main.canonicalize_term(thing1, UNPROVIDED), PATTERN_MATCHES_FORMULA, UNPROVIDED);
    }

    public static SubLObject ne_test_func_not_member(final SubLObject thing1, final SubLObject thing2) {
        return makeBoolean(NIL == subl_promotions.memberP(narts_high.nart_substitute(czer_main.canonicalize_term(thing2, UNPROVIDED)), czer_main.canonicalize_term(thing1, UNPROVIDED), EQUAL, UNPROVIDED));
    }

    public static SubLObject declare_named_entity_recognizer_file() {
        declareFunction(me, "get_named_entity_confidence", "GET-NAMED-ENTITY-CONFIDENCE", 1, 0, false);
        declareFunction(me, "set_named_entity_confidence", "SET-NAMED-ENTITY-CONFIDENCE", 2, 0, false);
        declareFunction(me, "get_named_entity_cyc", "GET-NAMED-ENTITY-CYC", 1, 0, false);
        declareFunction(me, "set_named_entity_cyc", "SET-NAMED-ENTITY-CYC", 2, 0, false);
        declareFunction(me, "get_named_entity_source", "GET-NAMED-ENTITY-SOURCE", 1, 0, false);
        declareFunction(me, "set_named_entity_source", "SET-NAMED-ENTITY-SOURCE", 2, 0, false);
        declareFunction(me, "get_named_entity_type", "GET-NAMED-ENTITY-TYPE", 1, 0, false);
        declareFunction(me, "set_named_entity_type", "SET-NAMED-ENTITY-TYPE", 2, 0, false);
        declareFunction(me, "get_named_entity_string", "GET-NAMED-ENTITY-STRING", 1, 0, false);
        declareFunction(me, "set_named_entity_string", "SET-NAMED-ENTITY-STRING", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_named_entity_class", "SUBLOOP-RESERVED-INITIALIZE-NAMED-ENTITY-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_named_entity_instance", "SUBLOOP-RESERVED-INITIALIZE-NAMED-ENTITY-INSTANCE", 1, 0, false);
        declareFunction(me, "named_entity_p", "NAMED-ENTITY-P", 1, 0, false);
        declareFunction(me, "new_named_entity", "NEW-NAMED-ENTITY", 3, 2, false);
        declareFunction(me, "named_entity_print_method", "NAMED-ENTITY-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "named_entity_get_string_method", "NAMED-ENTITY-GET-STRING-METHOD", 1, 0, false);
        declareFunction(me, "named_entity_get_type_method", "NAMED-ENTITY-GET-TYPE-METHOD", 1, 0, false);
        declareFunction(me, "named_entity_get_cyc_method", "NAMED-ENTITY-GET-CYC-METHOD", 1, 0, false);
        declareFunction(me, "named_entity_get_confidence_method", "NAMED-ENTITY-GET-CONFIDENCE-METHOD", 1, 0, false);
        declareFunction(me, "named_entity_get_source_method", "NAMED-ENTITY-GET-SOURCE-METHOD", 1, 0, false);
        declareFunction(me, "get_contextualized_named_entity_subtypes", "GET-CONTEXTUALIZED-NAMED-ENTITY-SUBTYPES", 1, 0, false);
        declareFunction(me, "set_contextualized_named_entity_subtypes", "SET-CONTEXTUALIZED-NAMED-ENTITY-SUBTYPES", 2, 0, false);
        declareFunction(me, "get_contextualized_named_entity_offsets", "GET-CONTEXTUALIZED-NAMED-ENTITY-OFFSETS", 1, 0, false);
        declareFunction(me, "set_contextualized_named_entity_offsets", "SET-CONTEXTUALIZED-NAMED-ENTITY-OFFSETS", 2, 0, false);
        declareFunction(me, "get_contextualized_named_entity_context", "GET-CONTEXTUALIZED-NAMED-ENTITY-CONTEXT", 1, 0, false);
        declareFunction(me, "set_contextualized_named_entity_context", "SET-CONTEXTUALIZED-NAMED-ENTITY-CONTEXT", 2, 0, false);
        declareFunction(me, "get_contextualized_named_entity_lexicon", "GET-CONTEXTUALIZED-NAMED-ENTITY-LEXICON", 1, 0, false);
        declareFunction(me, "set_contextualized_named_entity_lexicon", "SET-CONTEXTUALIZED-NAMED-ENTITY-LEXICON", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_contextualized_named_entity_class", "SUBLOOP-RESERVED-INITIALIZE-CONTEXTUALIZED-NAMED-ENTITY-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_contextualized_named_entity_instance", "SUBLOOP-RESERVED-INITIALIZE-CONTEXTUALIZED-NAMED-ENTITY-INSTANCE", 1, 0, false);
        declareFunction(me, "contextualized_named_entity_p", "CONTEXTUALIZED-NAMED-ENTITY-P", 1, 0, false);
        declareFunction(me, "new_contextualized_named_entity", "NEW-CONTEXTUALIZED-NAMED-ENTITY", 5, 2, false);
        declareFunction(me, "contextualized_named_entity_get_lexicon_method", "CONTEXTUALIZED-NAMED-ENTITY-GET-LEXICON-METHOD", 1, 0, false);
        declareFunction(me, "contextualized_named_entity_set_lexicon_method", "CONTEXTUALIZED-NAMED-ENTITY-SET-LEXICON-METHOD", 2, 0, false);
        declareFunction(me, "denot_collections", "DENOT-COLLECTIONS", 1, 1, false);
        declareFunction(me, "contextualized_named_entity_tighten_type_method", "CONTEXTUALIZED-NAMED-ENTITY-TIGHTEN-TYPE-METHOD", 1, 2, false);
        declareFunction(me, "tighter_types_from_answer", "TIGHTER-TYPES-FROM-ANSWER", 4, 1, false);
        declareFunction(me, "tighter_types_from_string", "TIGHTER-TYPES-FROM-STRING", 5, 0, false);
        declareFunction(me, "concepts_from_document", "CONCEPTS-FROM-DOCUMENT", 1, 0, false);
        declareFunction(me, "get_trees_to_head", "GET-TREES-TO-HEAD", 1, 0, false);
        declareFunction(me, "string_acceptably_short_for_ps_parseP", "STRING-ACCEPTABLY-SHORT-FOR-PS-PARSE?", 2, 1, false);
        declareFunction(me, "denots_of_ps_harvest_nbars_internal", "DENOTS-OF-PS-HARVEST-NBARS-INTERNAL", 1, 3, false);
        declareFunction(me, "denots_of_ps_harvest_nbars", "DENOTS-OF-PS-HARVEST-NBARS", 1, 3, false);
        declareFunction(me, "get_max_span_from_psp_result", "GET-MAX-SPAN-FROM-PSP-RESULT", 2, 0, false);
        declareFunction(me, "clear_named_entityP", "CLEAR-NAMED-ENTITY?", 0, 0, false);
        declareFunction(me, "remove_named_entityP", "REMOVE-NAMED-ENTITY?", 2, 0, false);
        declareFunction(me, "named_entityP_internal", "NAMED-ENTITY?-INTERNAL", 2, 0, false);
        declareFunction(me, "named_entityP", "NAMED-ENTITY?", 2, 0, false);
        declareFunction(me, "named_entity_recognizer_p", "NAMED-ENTITY-RECOGNIZER-P", 1, 0, false);
        declareFunction(me, "get_stanford_ner_known_cyc_types", "GET-STANFORD-NER-KNOWN-CYC-TYPES", 1, 0, false);
        declareFunction(me, "set_stanford_ner_known_cyc_types", "SET-STANFORD-NER-KNOWN-CYC-TYPES", 2, 0, false);
        declareFunction(me, "get_stanford_ner_type_map", "GET-STANFORD-NER-TYPE-MAP", 1, 0, false);
        declareFunction(me, "set_stanford_ner_type_map", "SET-STANFORD-NER-TYPE-MAP", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_stanford_ner_class", "SUBLOOP-RESERVED-INITIALIZE-STANFORD-NER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_stanford_ner_instance", "SUBLOOP-RESERVED-INITIALIZE-STANFORD-NER-INSTANCE", 1, 0, false);
        declareFunction(me, "stanford_ner_p", "STANFORD-NER-P", 1, 0, false);
        declareFunction(me, "stanford_ner_to_cyc_method", "STANFORD-NER-TO-CYC-METHOD", 2, 0, false);
        declareFunction(me, "stanford_ner_run_method", "STANFORD-NER-RUN-METHOD", 2, 0, false);
        declareFunction(me, "build_mwl", "BUILD-MWL", 2, 0, false);
        declareFunction(me, "stanford_ner_merge_clusters_method", "STANFORD-NER-MERGE-CLUSTERS-METHOD", 3, 0, false);
        declareFunction(me, "ne_has_state_denotP", "NE-HAS-STATE-DENOT?", 2, 0, false);
        declareFunction(me, "stanford_ner_ping", "STANFORD-NER-PING", 0, 2, false);
        declareFunction(me, "stanford_ner", "STANFORD-NER", 1, 2, false);
        declareFunction(me, "subloop_reserved_initialize_resporator_class", "SUBLOOP-RESERVED-INITIALIZE-RESPORATOR-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_resporator_instance", "SUBLOOP-RESERVED-INITIALIZE-RESPORATOR-INSTANCE", 1, 0, false);
        declareFunction(me, "resporator_p", "RESPORATOR-P", 1, 0, false);
        declareFunction(me, "resporator_run_method", "RESPORATOR-RUN-METHOD", 2, 0, false);
        declareFunction(me, "resporator_next_resporator_entity_method", "RESPORATOR-NEXT-RESPORATOR-ENTITY-METHOD", 2, 0, false);
        declareFunction(me, "build_resporator_to_cycl_map", "BUILD-RESPORATOR-TO-CYCL-MAP", 0, 0, false);
        declareFunction(me, "maybe_initialize_resporator_to_cycl_map", "MAYBE-INITIALIZE-RESPORATOR-TO-CYCL-MAP", 0, 0, false);
        declareFunction(me, "resporator_to_cycl", "RESPORATOR-TO-CYCL", 1, 0, false);
        declareFunction(me, "get_nament_instance_meaning", "GET-NAMENT-INSTANCE-MEANING", 1, 0, false);
        declareFunction(me, "get_specific_place_from_string", "GET-SPECIFIC-PLACE-FROM-STRING", 1, 0, false);
        declareFunction(me, "clear_place_tightening_lexicon", "CLEAR-PLACE-TIGHTENING-LEXICON", 0, 0, false);
        declareFunction(me, "get_place_tightening_lexicon", "GET-PLACE-TIGHTENING-LEXICON", 0, 0, false);
        declareFunction(me, "ne_test_tighten_type", "NE-TEST-TIGHTEN-TYPE", 3, 0, false);
        declareFunction(me, "ne_test_tighten_type_undesired_return", "NE-TEST-TIGHTEN-TYPE-UNDESIRED-RETURN", 3, 0, false);
        declareFunction(me, "ne_test_func", "NE-TEST-FUNC", 2, 0, false);
        declareFunction(me, "ne_test_func_not_member", "NE-TEST-FUNC-NOT-MEMBER", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_named_entity_recognizer_file() {
        defparameter("*BREAK-NAMED-ENTITY?*", NIL);
        deflexical("*NAMED-ENTITY?-CACHING-STATE*", NIL);
        defparameter("*STANFORD-NER-HOST*", $$$localhost);
        defparameter("*STANFORD-NER-PORT*", $int$6666);
        defvar("*RESPORATOR-TO-CYCL-MAP*", NIL);
        defparameter("*PLACE-TIGHTENING-LEXICON*", NIL);
        return NIL;
    }

    public static SubLObject setup_named_entity_recognizer_file() {
        classes.subloop_new_class(NAMED_ENTITY, OBJECT, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(NAMED_ENTITY, NIL);
        classes.subloop_note_class_initialization_function(NAMED_ENTITY, SUBLOOP_RESERVED_INITIALIZE_NAMED_ENTITY_CLASS);
        classes.subloop_note_instance_initialization_function(NAMED_ENTITY, SUBLOOP_RESERVED_INITIALIZE_NAMED_ENTITY_INSTANCE);
        subloop_reserved_initialize_named_entity_class(NAMED_ENTITY);
        methods.methods_incorporate_instance_method(PRINT, NAMED_ENTITY, $list14, $list15, $list16);
        methods.subloop_register_instance_method(NAMED_ENTITY, PRINT, NAMED_ENTITY_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_STRING, NAMED_ENTITY, $list23, NIL, $list24);
        methods.subloop_register_instance_method(NAMED_ENTITY, GET_STRING, NAMED_ENTITY_GET_STRING_METHOD);
        methods.methods_incorporate_instance_method(GET_TYPE, NAMED_ENTITY, $list23, NIL, $list28);
        methods.subloop_register_instance_method(NAMED_ENTITY, GET_TYPE, NAMED_ENTITY_GET_TYPE_METHOD);
        methods.methods_incorporate_instance_method(GET_CYC, NAMED_ENTITY, $list23, NIL, $list32);
        methods.subloop_register_instance_method(NAMED_ENTITY, GET_CYC, NAMED_ENTITY_GET_CYC_METHOD);
        methods.methods_incorporate_instance_method(GET_CONFIDENCE, NAMED_ENTITY, $list23, NIL, $list36);
        methods.subloop_register_instance_method(NAMED_ENTITY, GET_CONFIDENCE, NAMED_ENTITY_GET_CONFIDENCE_METHOD);
        methods.methods_incorporate_instance_method(GET_SOURCE, NAMED_ENTITY, $list23, NIL, $list40);
        methods.subloop_register_instance_method(NAMED_ENTITY, GET_SOURCE, NAMED_ENTITY_GET_SOURCE_METHOD);
        classes.subloop_new_class(CONTEXTUALIZED_NAMED_ENTITY, NAMED_ENTITY, NIL, NIL, $list44);
        classes.class_set_implements_slot_listeners(CONTEXTUALIZED_NAMED_ENTITY, NIL);
        classes.subloop_note_class_initialization_function(CONTEXTUALIZED_NAMED_ENTITY, SUBLOOP_RESERVED_INITIALIZE_CONTEXTUALIZED_NAMED_ENTITY_CLASS);
        classes.subloop_note_instance_initialization_function(CONTEXTUALIZED_NAMED_ENTITY, SUBLOOP_RESERVED_INITIALIZE_CONTEXTUALIZED_NAMED_ENTITY_INSTANCE);
        subloop_reserved_initialize_contextualized_named_entity_class(CONTEXTUALIZED_NAMED_ENTITY);
        methods.methods_incorporate_class_method(GET_LEXICON, CONTEXTUALIZED_NAMED_ENTITY, $list23, NIL, $list52);
        methods.subloop_register_class_method(CONTEXTUALIZED_NAMED_ENTITY, GET_LEXICON, CONTEXTUALIZED_NAMED_ENTITY_GET_LEXICON_METHOD);
        methods.methods_incorporate_class_method(SET_LEXICON, CONTEXTUALIZED_NAMED_ENTITY, $list23, $list57, $list58);
        methods.subloop_register_class_method(CONTEXTUALIZED_NAMED_ENTITY, SET_LEXICON, CONTEXTUALIZED_NAMED_ENTITY_SET_LEXICON_METHOD);
        methods.methods_incorporate_instance_method(TIGHTEN_TYPE, CONTEXTUALIZED_NAMED_ENTITY, $list23, $list63, $list64);
        methods.subloop_register_instance_method(CONTEXTUALIZED_NAMED_ENTITY, TIGHTEN_TYPE, CONTEXTUALIZED_NAMED_ENTITY_TIGHTEN_TYPE_METHOD);
        memoization_state.note_memoized_function(DENOTS_OF_PS_HARVEST_NBARS);
        memoization_state.note_globally_cached_function($sym86$NAMED_ENTITY_);
        interfaces.new_interface(NAMED_ENTITY_RECOGNIZER, NIL, NIL, $list96);
        classes.subloop_new_class(STANFORD_NER, OBJECT, $list97, NIL, $list98);
        classes.class_set_implements_slot_listeners(STANFORD_NER, NIL);
        classes.subloop_note_class_initialization_function(STANFORD_NER, SUBLOOP_RESERVED_INITIALIZE_STANFORD_NER_CLASS);
        classes.subloop_note_instance_initialization_function(STANFORD_NER, SUBLOOP_RESERVED_INITIALIZE_STANFORD_NER_INSTANCE);
        subloop_reserved_initialize_stanford_ner_class(STANFORD_NER);
        methods.methods_incorporate_class_method(TO_CYC, STANFORD_NER, $list14, $list106, $list107);
        methods.subloop_register_class_method(STANFORD_NER, TO_CYC, STANFORD_NER_TO_CYC_METHOD);
        methods.methods_incorporate_instance_method(RUN, STANFORD_NER, $list23, $list110, $list111);
        methods.subloop_register_instance_method(STANFORD_NER, RUN, STANFORD_NER_RUN_METHOD);
        methods.methods_incorporate_instance_method(MERGE_CLUSTERS, STANFORD_NER, $list23, $list116, $list117);
        methods.subloop_register_instance_method(STANFORD_NER, MERGE_CLUSTERS, STANFORD_NER_MERGE_CLUSTERS_METHOD);
        register_external_symbol($stanford_ner_host$);
        register_external_symbol($stanford_ner_port$);
        classes.subloop_new_class(RESPORATOR, OBJECT, $list97, NIL, $list96);
        classes.class_set_implements_slot_listeners(RESPORATOR, NIL);
        classes.subloop_note_class_initialization_function(RESPORATOR, SUBLOOP_RESERVED_INITIALIZE_RESPORATOR_CLASS);
        classes.subloop_note_instance_initialization_function(RESPORATOR, SUBLOOP_RESERVED_INITIALIZE_RESPORATOR_INSTANCE);
        subloop_reserved_initialize_resporator_class(RESPORATOR);
        methods.methods_incorporate_instance_method(RUN, RESPORATOR, $list23, $list110, $list137);
        methods.subloop_register_instance_method(RESPORATOR, RUN, RESPORATOR_RUN_METHOD);
        methods.methods_incorporate_instance_method(NEXT_RESPORATOR_ENTITY, RESPORATOR, $list140, $list141, $list142);
        methods.subloop_register_instance_method(RESPORATOR, NEXT_RESPORATOR_ENTITY, RESPORATOR_NEXT_RESPORATOR_ENTITY_METHOD);
        define_test_case_table_int(NE_TEST_TIGHTEN_TYPE, list(new SubLObject[]{ $TEST, symbol_function(NE_TEST_FUNC), $OWNER, NIL, $CLASSES, $list163, $KB, $FULL, $WORKING_, T }), $list167);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_named_entity_recognizer_file();
    }

    @Override
    public void initializeVariables() {
        init_named_entity_recognizer_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_named_entity_recognizer_file();
    }


}

/**
 * Total time: 707 ms
 */
