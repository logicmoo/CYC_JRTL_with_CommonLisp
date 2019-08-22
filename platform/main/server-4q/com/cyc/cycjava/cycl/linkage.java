package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class linkage extends SubLTranslatedFile {
    public static final SubLFile me = new linkage();

    public static final String myName = "com.cyc.cycjava.cycl.linkage";

    public static final String myFingerPrint = "7a5ecc69e0d5d4b08adde1d056ed0fddbaa364f397aa06d7dfcfaa0042204822";







    // defparameter
    public static final SubLSymbol $link_parse_options$ = makeSymbol("*LINK-PARSE-OPTIONS*");

    // defparameter
    private static final SubLSymbol $show_link_warnings$ = makeSymbol("*SHOW-LINK-WARNINGS*");

    // defparameter
    private static final SubLSymbol $link_pattern_table$ = makeSymbol("*LINK-PATTERN-TABLE*");

    // defparameter
    private static final SubLSymbol $link_patterns$ = makeSymbol("*LINK-PATTERNS*");

    // defparameter
    private static final SubLSymbol $word_to_class$ = makeSymbol("*WORD-TO-CLASS*");

    // deflexical
    private static final SubLSymbol $link_pos_to_class$ = makeSymbol("*LINK-POS-TO-CLASS*");

    // deflexical
    // String whose characters are valid Link POSes
    private static final SubLSymbol $link_poses$ = makeSymbol("*LINK-POSES*");

    // deflexical
    private static final SubLSymbol $link_parser_unknown_string_suffix$ = makeSymbol("*LINK-PARSER-UNKNOWN-STRING-SUFFIX*");

    // deflexical
    private static final SubLSymbol $link_parser_guessed_string_suffix$ = makeSymbol("*LINK-PARSER-GUESSED-STRING-SUFFIX*");

    // deflexical
    private static final SubLSymbol $penn_pos_to_classes$ = makeSymbol("*PENN-POS-TO-CLASSES*");

    // deflexical
    private static final SubLSymbol $llink_table$ = makeSymbol("*LLINK-TABLE*");

    // deflexical
    private static final SubLSymbol $rlink_table$ = makeSymbol("*RLINK-TABLE*");

    // deflexical
    private static final SubLSymbol $pos_class_table$ = makeSymbol("*POS-CLASS-TABLE*");

    // deflexical
    private static final SubLSymbol $class_pos_table$ = makeSymbol("*CLASS-POS-TABLE*");

    // defparameter
    // If this link is to the left of me, what category am I?
    private static final SubLSymbol $left_link_to_class$ = makeSymbol("*LEFT-LINK-TO-CLASS*");

    // defparameter
    // If this link is to the right of me, what category am I?
    private static final SubLSymbol $right_link_to_class$ = makeSymbol("*RIGHT-LINK-TO-CLASS*");

    // deflexical
    private static final SubLSymbol $word_pos_probabilities$ = makeSymbol("*WORD-POS-PROBABILITIES*");





    // defparameter
    public static final SubLSymbol $category_pattern$ = makeSymbol("*CATEGORY-PATTERN*");

    // defparameter
    public static final SubLSymbol $word_pattern$ = makeSymbol("*WORD-PATTERN*");

    // defparameter
    public static final SubLSymbol $paren_pattern$ = makeSymbol("*PAREN-PATTERN*");

    // defconstant
    public static final SubLSymbol $dtp_link$ = makeSymbol("*DTP-LINK*");

    // deflexical
    private static final SubLSymbol $category_to_link_tree_class$ = makeSymbol("*CATEGORY-TO-LINK-TREE-CLASS*");



    // deflexical
    private static final SubLSymbol $pos_tags$ = makeSymbol("*POS-TAGS*");

    // Internal Constants
    public static final SubLList $list0 = list(makeString("external.link-parser.server"));

    public static final SubLSymbol $link_parser$ = makeSymbol("*LINK-PARSER*");

    public static final SubLString $str2$linkparser_cyc_com = makeString("linkparser.cyc.com");



    public static final SubLList $list4 = list(makeString("external.link-parser.port"));

    public static final SubLSymbol $link_port$ = makeSymbol("*LINK-PORT*");

    private static final SubLInteger $int$4567 = makeInteger(4567);

    public static final SubLList $list7 = list(makeString("external.link-parser.interface-version"));

    public static final SubLSymbol $cyc_link_interface$ = makeSymbol("*CYC-LINK-INTERFACE*");

    public static final SubLString $str9$1_2 = makeString("1.2");

    private static final SubLSymbol $CYC_LINK_INTERFACE = makeKeyword("CYC-LINK-INTERFACE");





    public static final SubLString $$$default = makeString("default");

    private static final SubLSymbol $MAX_PARSE_TIME = makeKeyword("MAX-PARSE-TIME");

    private static final SubLInteger $int$30 = makeInteger(30);

    public static final SubLList $list16 = list(new SubLObject[]{ cons(makeKeyword("A-PATTERN"), makeString("^A[^A-Z]?")), cons(makeKeyword("AA-PATTERN"), makeString("^AA")), cons(makeKeyword("AN-PATTERN"), makeString("^AN")), cons(makeKeyword("B-PATTERN"), makeString("^B")), cons(makeKeyword("C-PATTERN"), makeString("^C")), cons(makeKeyword("C-E-PATTERN"), makeString("^Ce")), cons(makeKeyword("D-PATTERN"), makeString("^D")), cons(makeKeyword("D-MC-PATTERN"), makeString("^Dmc")), cons(makeKeyword("D-S-PATTERN"), makeString("^Ds")), cons(makeKeyword("E-PATTERN"), makeString("^E")), cons(makeKeyword("EZ-PATTERN"), makeString("^EZ")), cons(makeKeyword("G-PATTERN"), makeString("^G")), cons(makeKeyword("GN-PATTERN"), makeString("^GN")), cons(makeKeyword("I-PATTERN"), makeString("^I")), cons(makeKeyword("ID-PATTERN"), makeString("^ID")), cons(makeKeyword("J-PATTERN"), makeString("^J")), cons(makeKeyword("K-PATTERN"), makeString("^K")), cons(makeKeyword("L-PATTERN"), makeString("^L")), cons(makeKeyword("M-PATTERN"), makeString("^M[^A-Z]")), cons(makeKeyword("M-P-PATTERN"), makeString("^Mp")), cons(makeKeyword("MV-PATTERN"), makeString("^MV")), cons(makeKeyword("MV-P-PATTERN"), makeString("^MVp")), cons(makeKeyword("MX-PATTERN"), makeString("^MX")), cons(makeKeyword("N-PATTERN"), makeString("^N")), cons(makeKeyword("O-PATTERN"), makeString("^O[a-z]?[^n]?$")), cons(makeKeyword("O-.-N-PATTERN"), makeString("^O.n$")), cons(makeKeyword("OF-PATTERN"), makeString("^OF")), cons(makeKeyword("ON-PATTERN"), makeString("^ON")), cons(makeKeyword("P-PATTERN"), makeString("^P")), cons(makeKeyword("P-A-PATTERN"), makeString("^Pa")), cons(makeKeyword("P-V-PATTERN"), makeString("^Pv")), cons(makeKeyword("P-G-PATTERN"), makeString("^Pg")), cons(makeKeyword("P-P-PATTERN"), makeString("^Pp")), cons(makeKeyword("PF-PATTERN"), makeString("^PF")), cons(makeKeyword("PP-PATTERN"), makeString("^PP")), cons(makeKeyword("Q-PATTERN"), makeString("^Q")), cons(makeKeyword("Q-D-PATTERN"), makeString("^Qd")), cons(makeKeyword("R-PATTERN"), makeString("^R")), cons(makeKeyword("S-PATTERN"), makeString("^S")), cons(makeKeyword("TA-PATTERN"), makeString("^TA")), cons(makeKeyword("TH-PATTERN"), makeString("^TH")), cons(makeKeyword("TO-PATTERN"), makeString("^TO")), cons(makeKeyword("W-PATTERN"), makeString("^W")), cons(makeKeyword("X-C-PATTERN"), makeString("^Xc")), cons(makeKeyword("X-D-PATTERN"), makeString("^Xd")), cons(makeKeyword("X-I-PATTERN"), makeString("^Xi")), cons(makeKeyword("YS-PATTERN"), makeString("^YS")) });

    public static final SubLList $list17 = list(new SubLObject[]{ cons(makeString("LEFT-WALL"), makeSymbol("WALL-LINK-WORD")), cons(makeString("RIGHT-WALL"), makeSymbol("WALL-LINK-WORD")), cons(makeString("."), makeSymbol("PUNCTUATION-LINK-WORD")), cons(makeString(","), makeSymbol("PUNCTUATION-LINK-WORD")), cons(makeString(":"), makeSymbol("PUNCTUATION-LINK-WORD")), cons(makeString(";"), makeSymbol("PUNCTUATION-LINK-WORD")), cons(makeString("?"), makeSymbol("PUNCTUATION-LINK-WORD")), cons(makeString("!"), makeSymbol("PUNCTUATION-LINK-WORD")), cons(makeString("("), makeSymbol("PUNCTUATION-LINK-WORD")), cons(makeString(")"), makeSymbol("PUNCTUATION-LINK-WORD")), cons(makeString("-"), makeSymbol("PUNCTUATION-LINK-WORD")), cons(makeString("many"), makeSymbol("DETERMINER-LINK-WORD")) });

    public static final SubLList $list18 = list(cons(CHAR_n, makeSymbol("NOUN-LINK-WORD")), cons(CHAR_v, makeSymbol("VERB-LINK-WORD")), cons(CHAR_a, makeSymbol("ADJECTIVE-LINK-WORD")), cons(CHAR_e, makeSymbol("ADVERB-LINK-WORD")));

    public static final SubLString $$$nvaepstidygrcqmzx = makeString("nvaepstidygrcqmzx");

    public static final SubLString $str20$___ = makeString("[?]");

    public static final SubLString $str21$___ = makeString("[!]");

    public static final SubLList $list22 = list(new SubLObject[]{ list(makeKeyword("AUX"), makeSymbol("AUX-VERB-LINK-WORD")), list(makeKeyword("CC"), makeSymbol("CONJUNCTION-LINK-WORD")), list(makeKeyword("CD"), makeSymbol("CARDINAL-LINK-WORD")), list(makeKeyword("DT"), makeSymbol("DETERMINER-LINK-WORD")), list(makeKeyword("EX"), makeSymbol("EXISTENTIAL-LINK-WORD")), list(makeKeyword("FW"), makeSymbol("LINK-WORD")), list(makeKeyword("IN"), makeSymbol("PREPOSITION-LINK-WORD"), makeSymbol("COMPLEMENTIZER-LINK-WORD")), list(makeKeyword("JJ"), makeSymbol("ADJECTIVE-LINK-WORD")), list(makeKeyword("JJR"), makeSymbol("ADJECTIVE-LINK-WORD")), list(makeKeyword("JJS"), makeSymbol("ADJECTIVE-LINK-WORD")), list(makeKeyword("LS"), makeSymbol("LINK-WORD")), list(makeKeyword("MD"), makeSymbol("MODAL-LINK-WORD")), list(makeKeyword("NN"), makeSymbol("COMMON-NOUN-LINK-WORD")), list(makeKeyword("NNS"), makeSymbol("COMMON-NOUN-LINK-WORD")), list(makeKeyword("NNP"), makeSymbol("PROPER-NOUN-LINK-WORD")), list(makeKeyword("NNPS"), makeSymbol("PROPER-NOUN-LINK-WORD")), list(makeKeyword("PDT"), makeSymbol("PREDETERMINER-LINK-WORD")), list(makeKeyword("POS"), makeSymbol("POSS-MARKER-LINK-WORD")), list(makeKeyword("PRP"), makeSymbol("PERSONAL-PRONOUN-LINK-WORD")), list(makeKeyword("PRP$"), makeSymbol("POSSESSIVE-PRONOUN-LINK-WORD")), list(makeKeyword("RB"), makeSymbol("ADVERB-LINK-WORD")), list(makeKeyword("RBR"), makeSymbol("ADVERB-LINK-WORD")), list(makeKeyword("RBS"), makeSymbol("ADVERB-LINK-WORD")), list(makeKeyword("RP"), makeSymbol("PARTICLE-LINK-WORD")), list(makeKeyword("SYM"), makeSymbol("LINK-WORD")), list(makeKeyword("TO"), makeSymbol("INF-MARKER-LINK-WORD"), makeSymbol("PREPOSITION-LINK-WORD")), list(makeKeyword("UH"), makeSymbol("LINK-WORD")), list(makeKeyword("VB"), makeSymbol("MAIN-VERB-LINK-WORD")), list(makeKeyword("VBD"), makeSymbol("MAIN-VERB-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD")), list(makeKeyword("VBG"), makeSymbol("MAIN-VERB-LINK-WORD")), list(makeKeyword("VBN"), makeSymbol("MAIN-VERB-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD")), list(makeKeyword("VBP"), makeSymbol("MAIN-VERB-LINK-WORD")), list(makeKeyword("VBZ"), makeSymbol("MAIN-VERB-LINK-WORD")), list(makeKeyword("WDT"), makeSymbol("W-DETERMINER-LINK-WORD")), list(makeKeyword("WP"), makeSymbol("W-PRONOUN-LINK-WORD")), list(makeKeyword("WP$"), makeSymbol("W-PRONOUN-LINK-WORD")), list(makeKeyword("WRB"), makeSymbol("W-ADVERB-LINK-WORD")), list(makeKeyword("$"), makeSymbol("COMMON-NOUN-LINK-WORD")), list(makeKeyword(","), makeSymbol("PUNCTUATION-LINK-WORD")), list(makeKeyword("."), makeSymbol("PUNCTUATION-LINK-WORD")), list(makeKeyword(")"), makeSymbol("PUNCTUATION-LINK-WORD")), list(makeKeyword("("), makeSymbol("PUNCTUATION-LINK-WORD")), list(makeKeyword("``"), makeSymbol("PUNCTUATION-LINK-WORD")), list(makeKeyword("''"), makeSymbol("PUNCTUATION-LINK-WORD")) });

    public static final SubLObject $list23 = _constant_23_initializer();

    public static final SubLObject $list24 = _constant_24_initializer();



    public static final SubLList $list26 = list(makeKeyword("COMMAND"), makeString("status"));

    public static final SubLString $str27$parseSentence_c = makeString("parseSentence.c");

    public static final SubLSymbol LINK_PARSE = makeSymbol("LINK-PARSE");



    public static final SubLString $$$parse = makeString("parse");





    public static final SubLString $$$lex = makeString("lex");



    public static final SubLSymbol LINK_EXECUTE_INT = makeSymbol("LINK-EXECUTE-INT");



    public static final SubLList $list37 = list(makeKeyword("EOF"));

    public static final SubLSymbol $link_execute_int_caching_state$ = makeSymbol("*LINK-EXECUTE-INT-CACHING-STATE*");

    private static final SubLInteger $int$10000 = makeInteger(10000);

    public static final SubLList $list40 = list(makeKeyword("LINKAGE"), list(makeKeyword("TEST"), makeSymbol("VECTORP")), list(makeKeyword("TEST"), makeSymbol("VECTORP")), makeKeyword("STRING"), makeKeyword("STRING"));

    public static final SubLSymbol LINK_STRUCTURE_SPEC_P = makeSymbol("LINK-STRUCTURE-SPEC-P");



    public static final SubLList $list43 = list(makeSymbol("WORDS"), makeSymbol("LINKS"), makeSymbol("DIAGRAM"), makeSymbol("TREE"));

    public static final SubLSymbol LINK_EXECUTE_CACHED = makeSymbol("LINK-EXECUTE-CACHED");

    public static final SubLSymbol $link_execute_cached_caching_state$ = makeSymbol("*LINK-EXECUTE-CACHED-CACHING-STATE*");

    private static final SubLInteger $int$500 = makeInteger(500);

    public static final SubLString $str47$_ = makeString("=");

    public static final SubLString $str48$_ = makeString(";");







    public static final SubLString $str52$Unknown_link_response__a = makeString("Unknown link response ~a");

    public static final SubLString $str53$_ = makeString(".");

    public static final SubLSymbol WALL_LINK_WORD = makeSymbol("WALL-LINK-WORD");

    public static final SubLString $str55$Couldn_t_find__S_in__S = makeString("Couldn't find ~S in ~S");

    public static final SubLList $list56 = list(makeString("LEFT-WALL"), makeString(":"));



    public static final SubLSymbol PREFIX_KEYS_FROM_STRING = makeSymbol("PREFIX-KEYS-FROM-STRING");

    public static final SubLList $list59 = list(CHAR_space, CHAR_hyphen);

    public static final SubLString $str60$Failed_to_bunge_according_to_stri = makeString("Failed to bunge according to string because ~A");

    public static final SubLList $list61 = list(new SubLObject[]{ CHAR_comma, CHAR_period, CHAR_question, CHAR_exclamation, CHAR_semicolon, CHAR_colon, CHAR_lparen, CHAR_rparen, CHAR_hyphen, CHAR_dollar });

    public static final SubLString $str62$_____ = makeString("$@#*%");

    public static final SubLSymbol SPLIT_LINK_WORD = makeSymbol("SPLIT-LINK-WORD");

    public static final SubLString $str64$_ = makeString("\"");

    public static final SubLString $$$IDXX = makeString("IDXX");

    public static final SubLString $str66$data_pos_tagging_states_fht = makeString("data/pos-tagging/states.fht");

    private static final SubLSymbol $IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");





    public static final SubLSymbol LINK_P = makeSymbol("LINK-P");

    public static final SubLList $list71 = list(makeSymbol("NAME"), makeSymbol("LEFT-WORD"), makeSymbol("RIGHT-WORD"));

    public static final SubLList $list72 = list(makeKeyword("NAME"), makeKeyword("LEFT-WORD"), makeKeyword("RIGHT-WORD"));

    public static final SubLList $list73 = list(makeSymbol("LINK-NAME"), makeSymbol("LINK-LEFT-WORD"), makeSymbol("LINK-RIGHT-WORD"));

    public static final SubLList $list74 = list(makeSymbol("_CSETF-LINK-NAME"), makeSymbol("_CSETF-LINK-LEFT-WORD"), makeSymbol("_CSETF-LINK-RIGHT-WORD"));

    public static final SubLSymbol PRINT_LINKAGE_LINK = makeSymbol("PRINT-LINKAGE-LINK");

    public static final SubLSymbol LINK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("LINK-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list77 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("LINK-P"));



    private static final SubLSymbol _CSETF_LINK_NAME = makeSymbol("_CSETF-LINK-NAME");

    private static final SubLSymbol LINK_LEFT_WORD = makeSymbol("LINK-LEFT-WORD");

    private static final SubLSymbol _CSETF_LINK_LEFT_WORD = makeSymbol("_CSETF-LINK-LEFT-WORD");

    private static final SubLSymbol LINK_RIGHT_WORD = makeSymbol("LINK-RIGHT-WORD");

    private static final SubLSymbol _CSETF_LINK_RIGHT_WORD = makeSymbol("_CSETF-LINK-RIGHT-WORD");







    private static final SubLString $str87$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_LINK = makeSymbol("MAKE-LINK");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_LINK_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-LINK-METHOD");

    private static final SubLString $str93$__LINK_ = makeString("#<LINK ");

    private static final SubLString $str94$__ = makeString(": ");



    private static final SubLString $str96$__ = makeString(", ");

    private static final SubLString $str97$_ = makeString(">");

    private static final SubLSymbol LINK_TREE = makeSymbol("LINK-TREE");



    private static final SubLList $list100 = list(makeSymbol("CYCLIFIABLE"), makeSymbol("PARSE-TREE-INTERFACE"));

    private static final SubLList $list101 = list(new SubLObject[]{ list(makeSymbol("POS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("HEADS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MOTHER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INDEX"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MODIFIERS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIERS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CATEGORY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ROOT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ROOT-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("XML"), list(makeSymbol("STREAM"), makeSymbol("INDENT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MOTHER"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REFS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INDEX"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SISTER"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("YIELD"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ANCESTORS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEPTH"), NIL, makeKeyword("PROTECTED")) });













    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LINK_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LINK-TREE-CLASS");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LINK_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LINK-TREE-INSTANCE");



    private static final SubLList $list113 = list(makeKeyword("PUBLIC"));

    private static final SubLList $list114 = list(makeString("@return listp; the list of all complements of this tree"), list(makeSymbol("RET"), makeSymbol("MODIFIERS")));

    private static final SubLSymbol $sym115$OUTER_CATCH_FOR_LINK_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-TREE-METHOD");

    private static final SubLSymbol LINK_TREE_GET_MODIFIERS_METHOD = makeSymbol("LINK-TREE-GET-MODIFIERS-METHOD");



    private static final SubLList $list118 = list(makeString("@return listp; the list of all words this tree modifies\n   @note override in each specific case"), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol LINK_TREE_GET_MODIFIEDS_METHOD = makeSymbol("LINK-TREE-GET-MODIFIEDS-METHOD");



    public static final SubLList $list121 = list(makeKeyword("PROTECTED"));

    private static final SubLList $list122 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    private static final SubLList $list123 = list(makeString("prints this tree to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("RET"), list(makeSymbol("PPRINT-LINK-TREE"), makeSymbol("SELF"), makeSymbol("STREAM"), ZERO_INTEGER)));

    private static final SubLSymbol LINK_TREE_PRINT_METHOD = makeSymbol("LINK-TREE-PRINT-METHOD");



    private static final SubLList $list126 = list(makeSymbol("STREAM"), makeSymbol("INDENT"));

    private static final SubLList $list127 = list(makeString("@return stringp; the XML string represenation of this tree"), list(makeSymbol("RET"), list(makeSymbol("LINK-TREE-XML"), makeSymbol("SELF"), makeSymbol("STREAM"), makeSymbol("INDENT"))));

    private static final SubLSymbol LINK_TREE_XML_METHOD = makeSymbol("LINK-TREE-XML-METHOD");



    private static final SubLList $list130 = list(makeString("@return keywordp; the category of this tree"), list(makeSymbol("RET"), makeSymbol("POS")));

    private static final SubLSymbol $sym131$OUTER_CATCH_FOR_LINK_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-TREE-METHOD");

    private static final SubLSymbol LINK_TREE_GET_CATEGORY_METHOD = makeSymbol("LINK-TREE-GET-CATEGORY-METHOD");

    private static final SubLSymbol GET_ROOT = makeSymbol("GET-ROOT");

    private static final SubLList $list134 = list(makeString("@return linkage-p; the root of this word"), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-LINKAGE")))));



    private static final SubLSymbol LINK_TREE_GET_ROOT_METHOD = makeSymbol("LINK-TREE-GET-ROOT-METHOD");



    private static final SubLList $list138 = list(makeString("@return booleanp; t if this tree is the root, nil otherwise"), list(makeSymbol("RET"), list(makeSymbol("CNOT"), makeSymbol("MOTHER"))));

    private static final SubLSymbol $sym139$OUTER_CATCH_FOR_LINK_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-TREE-METHOD");

    private static final SubLSymbol LINK_TREE_ROOT_P_METHOD = makeSymbol("LINK-TREE-ROOT-P-METHOD");



    private static final SubLList $list142 = list(makeString("@return link-phrase-p; the mother of this tree"), list(makeSymbol("RET"), makeSymbol("MOTHER")));

    private static final SubLSymbol $sym143$OUTER_CATCH_FOR_LINK_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-TREE-METHOD");

    private static final SubLSymbol LINK_TREE_GET_MOTHER_METHOD = makeSymbol("LINK-TREE-GET-MOTHER-METHOD");



    private static final SubLList $list146 = list(makeString("@return listp; the list of referents of this tree"), list(makeSymbol("CLET"), list(list(makeSymbol("REFS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("HEAD"), makeSymbol("HEADS")), list(makeSymbol("CDOLIST"), list(makeSymbol("REF"), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-REFS")))), list(makeSymbol("CPUSH"), makeSymbol("REF"), makeSymbol("REFS")))), list(makeSymbol("RET"), makeSymbol("REFS"))));

    private static final SubLSymbol $sym147$OUTER_CATCH_FOR_LINK_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-TREE-METHOD");

    private static final SubLSymbol LINK_TREE_GET_REFS_METHOD = makeSymbol("LINK-TREE-GET-REFS-METHOD");



    private static final SubLList $list150 = list(makeString("@return numberp; the index of this word"), list(makeSymbol("RET"), makeSymbol("INDEX")));

    private static final SubLSymbol $sym151$OUTER_CATCH_FOR_LINK_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-TREE-METHOD");

    private static final SubLSymbol LINK_TREE_GET_INDEX_METHOD = makeSymbol("LINK-TREE-GET-INDEX-METHOD");



    private static final SubLList $list154 = list(makeSymbol("I"));

    public static final SubLList $list155 = list(makeString("@return link-tree-p; the sister INDEX positions to the right of this\n   parse tree if INDEX is positive and to the left if INDEX is negative;\n   nil if there is no such sister"), list(makeSymbol("CHECK-TYPE"), makeSymbol("I"), makeSymbol("INTEGERP")), list(makeSymbol("PWHEN"), makeSymbol("INDEX"), list(makeSymbol("CLET"), list(list(makeSymbol("SISTER-INDEX"), list(makeSymbol("+"), makeSymbol("INDEX"), makeSymbol("I")))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), list(makeSymbol("CAND"), makeSymbol("MOTHER"), list(makeSymbol("NON-NEGATIVE-INTEGER-P"), makeSymbol("SISTER-INDEX"))), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), list(makeSymbol("+"), makeSymbol("INDEX"), makeSymbol("I"))))))));

    private static final SubLSymbol $sym156$OUTER_CATCH_FOR_LINK_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-TREE-METHOD");





    private static final SubLSymbol LINK_TREE_GET_SISTER_METHOD = makeSymbol("LINK-TREE-GET-SISTER-METHOD");



    private static final SubLList $list161 = list(makeString("@return listp; the list of all words of this tree"), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol LINK_TREE_YIELD_METHOD = makeSymbol("LINK-TREE-YIELD-METHOD");



    private static final SubLList $list164 = list(makeString("@return listp; the list of ancestors of this parse tree"), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("MOTHER"), list(makeSymbol("CONS"), makeSymbol("MOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(makeSymbol("QUOTE"), makeSymbol("GET-ANCESTORS")))))));

    private static final SubLSymbol $sym165$OUTER_CATCH_FOR_LINK_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-TREE-METHOD");

    private static final SubLSymbol LINK_TREE_GET_ANCESTORS_METHOD = makeSymbol("LINK-TREE-GET-ANCESTORS-METHOD");



    private static final SubLList $list168 = list(makeString("@return non-negative-integer-p; the depth of this tree from the root"), list(makeSymbol("CLET"), list(list(makeSymbol("DEPTH"), ZERO_INTEGER), list(makeSymbol("TREE"), makeSymbol("SELF"))), list(makeSymbol("UNTIL"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("ROOT-P"))), list(makeSymbol("CINC"), makeSymbol("DEPTH")), list(makeSymbol("CSETQ"), makeSymbol("TREE"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-MOTHER"))))), list(makeSymbol("RET"), makeSymbol("DEPTH"))));

    private static final SubLSymbol LINK_TREE_DEPTH_METHOD = makeSymbol("LINK-TREE-DEPTH-METHOD");

    private static final SubLSymbol LINK_PHRASE = makeSymbol("LINK-PHRASE");

    private static final SubLList $list171 = list(new SubLObject[]{ list(makeSymbol("DAUGHTERS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("HEADS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONJUNCTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STRING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DAUGHTER-COUNT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DAUGHTER"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-HEAD-DAUGHTERS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-HEAD-DAUGHTER"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-HEAD-DAUGHTERS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-INT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("YIELD"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-HEADS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-HEAD"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-HEADS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRETERMINAL-P"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("IDIOM-P"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COORDINATE-PHRASE-P"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LINKAGE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND"), list(makeSymbol("PREDICATE"), makeSymbol("&OPTIONAL"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-FIRST"), list(makeSymbol("PREDICATE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-LAST"), list(makeSymbol("PREDICATE")), makeKeyword("PROTECTED")) });



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LINK_PHRASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LINK-PHRASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LINK_PHRASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LINK-PHRASE-INSTANCE");

    private static final SubLList $list175 = list(list(makeSymbol("SUBTREE"), makeSymbol("PHRASE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym176$STACK = makeUninternedSymbol("STACK");



    private static final SubLList $list178 = list(list(makeSymbol("CREATE-STACK")));





    private static final SubLSymbol STACK_EMPTY_P = makeSymbol("STACK-EMPTY-P");







    private static final SubLSymbol LINK_PHRASE_P = makeSymbol("LINK-PHRASE-P");







    private static final SubLList $list189 = list(list(makeSymbol("QUOTE"), makeSymbol("DAUGHTERS")));



    public static final SubLList $list191 = list(makeString("@return object; the conjunction of this tree if there is one, nil otherwise"), list(makeSymbol("DO-VECTOR"), list(makeSymbol("DAUGHTER"), makeSymbol("DAUGHTERS")), list(makeSymbol("PWHEN"), list(makeSymbol("CONJUNCTION-LINK-WORD-P"), makeSymbol("DAUGHTER")), list(makeSymbol("RET"), makeSymbol("DAUGHTER")))));

    public static final SubLSymbol $sym192$OUTER_CATCH_FOR_LINK_PHRASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-PHRASE-METHOD");

    private static final SubLSymbol LINK_PHRASE_GET_CONJUNCTION_METHOD = makeSymbol("LINK-PHRASE-GET-CONJUNCTION-METHOD");

    public static final SubLList $list194 = list(makeString("@return stringp; the string of this phrase"), list(makeSymbol("RET"), list(makeSymbol("CONCATENATE-WORD-STRINGS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("YIELD"))))));

    private static final SubLSymbol LINK_PHRASE_GET_STRING_METHOD = makeSymbol("LINK-PHRASE-GET-STRING-METHOD");



    private static final SubLList $list197 = list(makeString("@return non-negative-integerp; the number of daughters of this link-phrase"), list(makeSymbol("RET"), list(makeSymbol("LENGTH"), makeSymbol("DAUGHTERS"))));

    private static final SubLSymbol $sym198$OUTER_CATCH_FOR_LINK_PHRASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-PHRASE-METHOD");

    private static final SubLSymbol LINK_PHRASE_DAUGHTER_COUNT_METHOD = makeSymbol("LINK-PHRASE-DAUGHTER-COUNT-METHOD");

    private static final SubLList $list200 = list(makeString("@param I non-negative-integer-p; the index of the daughter to be retrieved\n   @return link-tree-p; the daughter at index I of this tree"), list(makeSymbol("CHECK-TYPE"), makeSymbol("I"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), list(makeSymbol("<"), makeSymbol("I"), list(makeSymbol("LENGTH"), makeSymbol("DAUGHTERS"))), list(makeSymbol("AREF"), makeSymbol("DAUGHTERS"), makeSymbol("I")))));

    private static final SubLSymbol $sym201$OUTER_CATCH_FOR_LINK_PHRASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-PHRASE-METHOD");



    private static final SubLSymbol LINK_PHRASE_GET_DAUGHTER_METHOD = makeSymbol("LINK-PHRASE-GET-DAUGHTER-METHOD");



    private static final SubLList $list205 = list(makeString("@return listp; the list of head daughters of this tree\n   @note override for each subclass"), list(makeSymbol("PWHEN"), makeSymbol("*REPORT-DEFAULT-METHOD-CALLS?*"), list(makeSymbol("WARN"), makeString("Default method call ~a on class ~a"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD-DAUGHTERS")), list(makeSymbol("QUOTE"), makeSymbol("LINK-PHRASE")))), list(makeSymbol("RET"), NIL));

    private static final SubLString $str206$Default_method_call__a_on_class__ = makeString("Default method call ~a on class ~a");

    private static final SubLSymbol LINK_PHRASE_GET_HEAD_DAUGHTERS_METHOD = makeSymbol("LINK-PHRASE-GET-HEAD-DAUGHTERS-METHOD");



    public static final SubLList $list209 = list(makeString("@return link-tree-p; the head daughter of this tree"), list(makeSymbol("RET"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD-DAUGHTERS"))))));

    private static final SubLSymbol LINK_PHRASE_GET_HEAD_DAUGHTER_METHOD = makeSymbol("LINK-PHRASE-GET-HEAD-DAUGHTER-METHOD");

    private static final SubLSymbol GET_SEMANTIC_HEAD_DAUGHTERS = makeSymbol("GET-SEMANTIC-HEAD-DAUGHTERS");

    private static final SubLList $list212 = list(makeString("@return listp; the list of head daughers of this phrase"), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD-DAUGHTERS")))));

    private static final SubLSymbol LINK_PHRASE_GET_SEMANTIC_HEAD_DAUGHTERS_METHOD = makeSymbol("LINK-PHRASE-GET-SEMANTIC-HEAD-DAUGHTERS-METHOD");



    private static final SubLList $list215 = list(makeString("@return listp; the CycL representation of the meaning of this link-tree"), list(makeSymbol("CLET"), list(list(makeSymbol("SCYCLS"), list(makeSymbol("SUBCYCLIFIER-CYCLIFY"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("SCYCLS"), list(makeSymbol("RET"), makeSymbol("SCYCLS")))), list(makeSymbol("CLET"), list(list(makeSymbol("HEADS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEADS")))), list(makeSymbol("CYCLS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("HEAD"), makeSymbol("HEADS")), list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))), makeSymbol("CYCLS"))), list(makeSymbol("RET"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), makeSymbol("CYCLS"))))));

    private static final SubLSymbol $sym216$OUTER_CATCH_FOR_LINK_PHRASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-PHRASE-METHOD");





    private static final SubLSymbol LINK_PHRASE_CYCLIFY_INT_METHOD = makeSymbol("LINK-PHRASE-CYCLIFY-INT-METHOD");

    public static final SubLList $list220 = list(makeString("@return listp; the list of all words of this tree"), list(makeSymbol("CLET"), list(list(makeSymbol("YIELD"), NIL)), list(makeSymbol("DO-LINK-TREE-SUBTREES"), list(makeSymbol("DAUGHTER"), makeSymbol("SELF")), list(makeSymbol("PWHEN"), list(makeSymbol("LINK-WORD-P"), makeSymbol("DAUGHTER")), list(makeSymbol("CPUSH"), makeSymbol("DAUGHTER"), makeSymbol("YIELD")))), list(makeSymbol("RET"), makeSymbol("YIELD"))));

    private static final SubLSymbol LINK_PHRASE_YIELD_METHOD = makeSymbol("LINK-PHRASE-YIELD-METHOD");

    private static final SubLList $list222 = list(makeString("@return listp; a list of all heads of this tree"), list(makeSymbol("PUNLESS"), makeSymbol("HEADS"), list(makeSymbol("CDOLIST"), list(makeSymbol("HEAD-DAUGHTER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD-DAUGHTERS")))), list(makeSymbol("CDOLIST"), list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("HEAD-DAUGHTER"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEADS")))), list(makeSymbol("CPUSH"), makeSymbol("HEAD"), makeSymbol("HEADS")))), list(makeSymbol("CSETQ"), makeSymbol("HEADS"), list(makeSymbol("NREVERSE"), makeSymbol("HEADS")))), list(makeSymbol("RET"), makeSymbol("HEADS")));

    private static final SubLSymbol $sym223$OUTER_CATCH_FOR_LINK_PHRASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-PHRASE-METHOD");

    private static final SubLSymbol LINK_PHRASE_GET_HEADS_METHOD = makeSymbol("LINK-PHRASE-GET-HEADS-METHOD");



    private static final SubLList $list226 = list(makeString("@return link-word-p; the first lexical head of this phrase"), list(makeSymbol("RET"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEADS"))))));

    private static final SubLSymbol LINK_PHRASE_GET_HEAD_METHOD = makeSymbol("LINK-PHRASE-GET-HEAD-METHOD");



    private static final SubLList $list229 = list(makeString("@return listp; a list of all semantic heads of this tree"), list(makeSymbol("CLET"), list(list(makeSymbol("HEADS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("HEAD-DAUGHTER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-HEAD-DAUGHTERS")))), list(makeSymbol("CDOLIST"), list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("HEAD-DAUGHTER"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-HEADS")))), list(makeSymbol("CPUSHNEW"), makeSymbol("HEAD"), makeSymbol("HEADS")))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), makeSymbol("HEADS")))));

    private static final SubLSymbol $sym230$OUTER_CATCH_FOR_LINK_PHRASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-PHRASE-METHOD");

    private static final SubLSymbol LINK_PHRASE_GET_SEMANTIC_HEADS_METHOD = makeSymbol("LINK-PHRASE-GET-SEMANTIC-HEADS-METHOD");

    private static final SubLSymbol PRETERMINAL_P = makeSymbol("PRETERMINAL-P");

    private static final SubLList $list233 = list(makeString("@return booleanp; t if this phrase  has only words as daughters, nil otherwise"), list(makeSymbol("RET"), list(makeSymbol("CNOT"), list(makeSymbol("FIND-IF-NOT"), list(makeSymbol("QUOTE"), makeSymbol("LINK-WORD-P")), makeSymbol("DAUGHTERS")))));

    private static final SubLSymbol $sym234$OUTER_CATCH_FOR_LINK_PHRASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-PHRASE-METHOD");

    private static final SubLSymbol LINK_WORD_P = makeSymbol("LINK-WORD-P");

    private static final SubLSymbol LINK_PHRASE_PRETERMINAL_P_METHOD = makeSymbol("LINK-PHRASE-PRETERMINAL-P-METHOD");

    private static final SubLSymbol IDIOM_P = makeSymbol("IDIOM-P");

    private static final SubLList $list238 = list(makeString("@return booleanp; t if this entire phrase forms an idiom (as indicated by ID links), \n   nil otherwise"), list(makeSymbol("CLET"), list(list(makeSymbol("WORDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("YIELD"))))), list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), list(makeSymbol("FIRST"), makeSymbol("WORDS")), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("ID-PATTERN"), makeKeyword("LEFT")), list(makeSymbol("RET"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("WORD"), list(makeSymbol("BUTLAST"), makeSymbol("WORDS"))), list(makeSymbol("PUNLESS"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("ID-PATTERN"), makeKeyword("RIGHT")), list(makeSymbol("RET"), NIL))), list(makeSymbol("RET"), list(makeSymbol("FIM"), list(makeSymbol("CAR"), list(makeSymbol("LAST"), makeSymbol("WORDS"))), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("ID-PATTERN"), makeKeyword("LEFT")))));









    private static final SubLSymbol LINK_PHRASE_IDIOM_P_METHOD = makeSymbol("LINK-PHRASE-IDIOM-P-METHOD");



    public static final SubLList $list245 = list(makeString("@return booleanp; t if this phrase is a coordination, nil otherwise"), list(makeSymbol("RET"), list(makeSymbol("BOOLEAN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONJUNCTION"))))));

    private static final SubLSymbol LINK_PHRASE_COORDINATE_PHRASE_P_METHOD = makeSymbol("LINK-PHRASE-COORDINATE-PHRASE-P-METHOD");

    private static final SubLList $list247 = list(makeString("@return linkage-p; the linkage this phrase is a part of"), list(makeSymbol("CLET"), list(list(makeSymbol("TREE"), makeSymbol("SELF"))), list(makeSymbol("UNTIL"), list(makeSymbol("LINK-WORD-P"), makeSymbol("TREE")), list(makeSymbol("CSETQ"), makeSymbol("TREE"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER))), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-LINKAGE"))))));

    private static final SubLSymbol LINK_PHRASE_GET_LINKAGE_METHOD = makeSymbol("LINK-PHRASE-GET-LINKAGE-METHOD");



    public static final SubLList $list250 = list(makeSymbol("PREDICATE"), makeSymbol("&OPTIONAL"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    public static final SubLList $list251 = list(makeString("@param PREDICATE symbolp\n   @return listp; a list of all daughters between START and END of this phrase-tree \n   which satisfy PREDICATE, from left to right"), list(makeSymbol("CLET"), list(makeSymbol("DAUGHTER"), list(makeSymbol("STOP"), list(makeSymbol("FIF"), makeSymbol("END"), makeSymbol("END"), list(makeSymbol("LENGTH"), makeSymbol("DAUGHTERS")))), list(makeSymbol("FOUND"), NIL)), list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("START"), makeSymbol("STOP")), list(makeSymbol("WARN"), makeString("start(~A) after stop(~A) when finding ~S in ~S~%"), makeSymbol("START"), makeSymbol("STOP"), makeSymbol("PREDICATE"), makeSymbol("SELF"))), list(makeSymbol("CDO"), list(list(makeSymbol("I"), makeSymbol("START"), list(makeSymbol("1+"), makeSymbol("I")))), list(list(makeSymbol(">="), makeSymbol("I"), makeSymbol("STOP"))), list(makeSymbol("CSETQ"), makeSymbol("DAUGHTER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), makeSymbol("I"))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL"), makeSymbol("PREDICATE"), makeSymbol("DAUGHTER")), list(makeSymbol("CPUSH"), makeSymbol("DAUGHTER"), makeSymbol("FOUND")))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), makeSymbol("FOUND")))));

    public static final SubLSymbol $sym252$OUTER_CATCH_FOR_LINK_PHRASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-PHRASE-METHOD");

    private static final SubLString $str253$start__A__after_stop__A__when_fin = makeString("start(~A) after stop(~A) when finding ~S in ~S~%");

    private static final SubLSymbol LINK_PHRASE_FIND_METHOD = makeSymbol("LINK-PHRASE-FIND-METHOD");



    public static final SubLList $list256 = list(makeSymbol("PREDICATE"), makeSymbol("&OPTIONAL"), list(makeSymbol("START"), ZERO_INTEGER));

    private static final SubLList $list257 = list(makeString("@param PREDICATE symbolp\n   @return link-tree-p; the first daughter of this phrase passing PREDICATE, \n     starting at daughter START"), list(makeSymbol("CLET"), list(makeSymbol("DAUGHTER")), list(makeSymbol("CDO"), list(list(makeSymbol("I"), makeSymbol("START"), list(makeSymbol("1+"), makeSymbol("I")))), list(list(makeSymbol(">="), makeSymbol("I"), list(makeSymbol("LENGTH"), makeSymbol("DAUGHTERS")))), list(makeSymbol("CSETQ"), makeSymbol("DAUGHTER"), list(makeSymbol("GET-DAUGHTER"), makeSymbol("SELF"), makeSymbol("I"))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL"), makeSymbol("PREDICATE"), makeSymbol("DAUGHTER")), list(makeSymbol("RET"), makeSymbol("DAUGHTER"), makeSymbol("I")))), list(makeSymbol("RET"), NIL)));

    private static final SubLSymbol $sym258$OUTER_CATCH_FOR_LINK_PHRASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-PHRASE-METHOD");

    private static final SubLSymbol LINK_PHRASE_FIND_FIRST_METHOD = makeSymbol("LINK-PHRASE-FIND-FIRST-METHOD");



    private static final SubLList $list261 = list(makeSymbol("PREDICATE"), makeSymbol("&OPTIONAL"), makeSymbol("END"));

    private static final SubLList $list262 = list(makeString("@param PREDICATE symbolp\n   @return parse-tree-p; the last daughter of this phrase passing PREDICATE, \n     ending at daughter END"), list(makeSymbol("CLET"), list(makeSymbol("DAUGHTER")), list(makeSymbol("CDO"), list(list(makeSymbol("I"), list(makeSymbol("FIF"), makeSymbol("END"), makeSymbol("END"), list(makeSymbol("1-"), list(makeSymbol("LENGTH"), makeSymbol("DAUGHTERS")))), list(makeSymbol("1-"), makeSymbol("I")))), list(list(makeSymbol("MINUSP"), makeSymbol("I"))), list(makeSymbol("CSETQ"), makeSymbol("DAUGHTER"), list(makeSymbol("GET-DAUGHTER"), makeSymbol("SELF"), makeSymbol("I"))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL"), makeSymbol("PREDICATE"), makeSymbol("DAUGHTER")), list(makeSymbol("RET"), makeSymbol("DAUGHTER")))), list(makeSymbol("RET"), NIL)));

    private static final SubLSymbol $sym263$OUTER_CATCH_FOR_LINK_PHRASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-PHRASE-METHOD");

    private static final SubLSymbol LINK_PHRASE_FIND_LAST_METHOD = makeSymbol("LINK-PHRASE-FIND-LAST-METHOD");

    private static final SubLString $str265$__LP_ = makeString("#<LP(");

    private static final SubLString $str266$__ = makeString("):");

    private static final SubLString $str267$__LW_ = makeString("#<LW(");

    private static final SubLString $str268$_ = makeString(")");



    private static final SubLString $str270$_ = makeString("*");

    private static final SubLString $str271$_word_cat___a__class___a___a__wor = makeString("<word cat=\"~a\" class=\"~a\">~a</word>~%");



    private static final SubLString $str273$_link_name___a__left___a__right__ = makeString("<link name=\"~a\" left=\"~a\" right=\"~a\"/>~%");

    private static final SubLSymbol GET_ABS_INDEX = makeSymbol("GET-ABS-INDEX");

    private static final SubLString $str275$_phrase_cat___a____ = makeString("<phrase cat=\"~a\">~%");

    private static final SubLString $str276$__phrase___ = makeString("</phrase>~%");

    private static final SubLSymbol ABS_INDEX = makeSymbol("ABS-INDEX");



    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str280$__ = makeString(" ,");

    private static final SubLString $str281$_ = makeString(",");

    private static final SubLString $str282$__ = makeString(" .");

    private static final SubLString $str283$__ = makeString("$ ");

    private static final SubLString $str284$_ = makeString("$");











    private static final SubLSymbol LINK_LEFT_WORD_EQUAL = makeSymbol("LINK-LEFT-WORD-EQUAL");

    private static final SubLSymbol LINK_RIGHT_WORD_EQUAL = makeSymbol("LINK-RIGHT-WORD-EQUAL");





    public static final SubLList $list294 = list(cons(makeKeyword("S"), makeSymbol("SENTENTIAL-LINK-PHRASE")), cons(makeKeyword("VP"), makeSymbol("VERBAL-LINK-PHRASE")), cons(makeKeyword("PP"), makeSymbol("PREPOSITIONAL-LINK-PHRASE")), cons(makeKeyword("NP"), makeSymbol("NOMINAL-LINK-PHRASE")));



    public static final SubLList $list296 = list(makeKeyword("S-PATTERN"), makeKeyword("P-PATTERN"));

    private static final SubLSymbol VERBAL_LINK_TREE = makeSymbol("VERBAL-LINK-TREE");

    private static final SubLSymbol VERBAL_LINK_PHRASE = makeSymbol("VERBAL-LINK-PHRASE");

    private static final SubLList $list299 = list(makeSymbol("CYCLIFIABLE-VERB-PHRASE"), makeSymbol("VERBAL-LINK-TREE"));

    private static final SubLList $list300 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-SUBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VERBAL-COMPLEMENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-HEAD-DAUGHTERS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VP-COORDINATE-PHRASE-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-INT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-INT-VP"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-INT-VP-COORDINATION"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")));



    private static final SubLList $list302 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SCYCLS"), list(makeSymbol("SUBCYCLIFIER-CYCLIFY"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("SCYCLS"), list(makeSymbol("RET"), makeSymbol("SCYCLS")))), list(makeSymbol("CLET"), list(list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT")))), list(makeSymbol("SUBJ-CYCLS"), list(makeSymbol("FWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SUBJECT"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))))), list(makeSymbol("CONJUNCTION"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONJUNCTION")))), list(makeSymbol("VPS"), list(makeSymbol("FIM"), makeSymbol("CONJUNCTION"), list(makeSymbol("QUOTE"), makeSymbol("GET-COMPLEMENTS")))), list(makeSymbol("CYCLS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("VP"), makeSymbol("VPS")), list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), makeSymbol("VP"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT-VP"))), makeSymbol("CYCLS"))), list(makeSymbol("RET"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), list(makeSymbol("CONS"), makeSymbol("SUBJ-CYCLS"), makeSymbol("CYCLS")))))));







    private static final SubLSymbol VERBAL_LINK_PHRASE_CYCLIFY_INT_VP_COORDINATION_METHOD = makeSymbol("VERBAL-LINK-PHRASE-CYCLIFY-INT-VP-COORDINATION-METHOD");

    private static final SubLList $list307 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SCYCLS"), list(makeSymbol("SUBCYCLIFIER-CYCLIFY"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("SCYCLS"), list(makeSymbol("RET"), makeSymbol("SCYCLS")))), list(makeSymbol("CLET"), list(list(makeSymbol("HEADS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-HEADS")))), list(makeSymbol("ALL-CONJUNCTION-CYCLS"), NIL), list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT")))), list(makeSymbol("COMPLEMENTS"), list(makeSymbol("FWHEN"), makeSymbol("HEADS"), list(makeSymbol("FIM"), list(makeSymbol("FIRST"), makeSymbol("HEADS")), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-COMPLEMENTS"))))), list(makeSymbol("COMP-CYCLS"), NIL), list(makeSymbol("CYCLS"), NIL)), list(makeSymbol("CSETQ"), makeSymbol("COMPLEMENTS"), list(makeSymbol("DELETE-CYCLIFIABLE"), makeSymbol("SUBJECT"), makeSymbol("COMPLEMENTS"))), list(makeSymbol("WITHOUT-RECURSIVE-CYCLIFICATION"), list(makeSymbol("CLET"), list(list(makeSymbol("*CYCLIFICATION-IN-PROGRESS*"), list(makeSymbol("APPEND"), makeSymbol("HEADS"), makeSymbol("*CYCLIFICATION-IN-PROGRESS*")))), list(makeSymbol("CDOLIST"), list(makeSymbol("HEAD"), makeSymbol("HEADS")), list(makeSymbol("CLET"), list(list(makeSymbol("ALL-HEAD-CYCLS"), NIL), list(makeSymbol("MOD-CYCLS"), list(makeSymbol("GET-MOD-CYCLS"), makeSymbol("HEAD"))), list(makeSymbol("RENAMINGS"), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-KEYWORD-RENAMINGS")), list(makeSymbol("REQUIRED-KEYWORDS"), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-RANKED-LEXES"))))))), list(makeSymbol("CDOLIST"), list(makeSymbol("CONJUNCTION"), makeSymbol("RENAMINGS")), list(makeSymbol("CLET"), list(list(makeSymbol("ALL-RLE-CYCLS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-RANKED-LEXES")))), list(makeSymbol("CLET"), list(list(makeSymbol("COMPOSITE-VERBAL-CYCLS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("RENAMING"), makeSymbol("CONJUNCTION")), list(makeSymbol("CLET"), list(list(makeSymbol("RENAMED0"), list(makeSymbol("APPLY-LEX-RENAMING"), makeSymbol("HEAD"), makeSymbol("RLE"), makeSymbol("RENAMING"))), list(makeSymbol("RENAMED"), list(makeSymbol("FWHEN"), makeSymbol("RENAMED0"), list(makeSymbol("LIST"), list(makeSymbol("QUANTIFY-IMPLICIT-SUBJECT"), makeSymbol("RENAMED0")))))), list(makeSymbol("ALIST-CPUSHNEW"), makeSymbol("COMPOSITE-VERBAL-CYCLS"), list(makeSymbol("RENAMING-KEY"), makeSymbol("RENAMING")), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), list(makeSymbol("CONS"), makeSymbol("RENAMED"), makeSymbol("MOD-CYCLS"))))))), list(makeSymbol("CLET"), list(list(makeSymbol("SENSE-CYCLS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("VALUE"), list(makeSymbol("ALIST-VALUES"), makeSymbol("COMPOSITE-VERBAL-CYCLS"))), list(makeSymbol("CPUSH"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("INDEXED-PRODUCTS"), makeSymbol("VALUE"))), makeSymbol("SENSE-CYCLS"))), list(makeSymbol("CPUSH"), makeSymbol("SENSE-CYCLS"), makeSymbol("ALL-RLE-CYCLS"))))), list(makeSymbol("CPUSH"), list(makeSymbol("INDEXED-PRODUCTS"), makeSymbol("ALL-RLE-CYCLS")), makeSymbol("ALL-HEAD-CYCLS")))), list(makeSymbol("CPUSH"), makeSymbol("ALL-HEAD-CYCLS"), makeSymbol("ALL-CONJUNCTION-CYCLS")))), list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), makeSymbol("COMPLEMENTS")), list(makeSymbol("CLET"), list(list(makeSymbol("COMP-CYCL"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))))), list(makeSymbol("PWHEN"), makeSymbol("COMP-CYCL"), list(makeSymbol("CPUSH"), makeSymbol("COMP-CYCL"), makeSymbol("COMP-CYCLS"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("ALL-HEAD-CYCLS"), list(makeSymbol("INDEXED-PRODUCTS"), makeSymbol("ALL-CONJUNCTION-CYCLS"))), list(makeSymbol("CLET"), list(list(makeSymbol("CYCLS0"), NIL), list(makeSymbol("ALL-SUBJECTS-WITH-OBJECTS-CYCLS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("ITEM"), list(makeSymbol("INDEXED-PRODUCTS"), makeSymbol("ALL-HEAD-CYCLS"))), list(makeSymbol("CLET"), list(list(makeSymbol("COMPLETE-CYCL-FOR-ONE-SUBJECT"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("ITEM2"), list(makeSymbol("CROSS-PRODUCTS"), makeSymbol("ITEM"))), list(makeSymbol("CSETQ"), makeSymbol("COMPLETE-CYCL-FOR-ONE-SUBJECT"), list(makeSymbol("APPEND"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("INDEXED-PRODUCTS"), makeSymbol("ITEM2"))), makeSymbol("COMPLETE-CYCL-FOR-ONE-SUBJECT")))), list(makeSymbol("CPUSH"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), list(makeSymbol("CONS"), makeSymbol("COMPLETE-CYCL-FOR-ONE-SUBJECT"), makeSymbol("COMP-CYCLS")))), makeSymbol("ALL-SUBJECTS-WITH-OBJECTS-CYCLS")))), list(makeSymbol("CSETQ"), makeSymbol("CYCLS0"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("INDEXED-PRODUCTS"), makeSymbol("ALL-SUBJECTS-WITH-OBJECTS-CYCLS")))), list(makeSymbol("CSETQ"), makeSymbol("CYCLS"), list(makeSymbol("APPEND"), makeSymbol("CYCLS0"), makeSymbol("CYCLS"))))))), list(makeSymbol("RET"), makeSymbol("CYCLS"))));

    private static final SubLSymbol $sym308$OUTER_CATCH_FOR_VERBAL_LINK_PHRASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-LINK-PHRASE-METHOD");





    private static final SubLSymbol VERBAL_LINK_PHRASE_CYCLIFY_INT_VP_METHOD = makeSymbol("VERBAL-LINK-PHRASE-CYCLIFY-INT-VP-METHOD");

    private static final SubLList $list312 = list(list(makeSymbol("WITHOUT-DUPLICATE-CYCLIFICATION"), list(makeSymbol("CLET"), list(list(makeSymbol("SCYCLS"), list(makeSymbol("SUBCYCLIFIER-CYCLIFY"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("SCYCLS"), list(makeSymbol("RET"), makeSymbol("SCYCLS")))), list(makeSymbol("PCOND"), list(list(makeSymbol("CYCLIFIABLE-SENTENTIAL-PHRASE-P"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("HEAD-DTR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD-DAUGHTER"))))), list(makeSymbol("PWHEN"), makeSymbol("HEAD-DTR"), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("HEAD-DTR"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))))))), list(list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("VP-COORDINATE-PHRASE-P"))), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT-VP-COORDINATION"))))), list(T, list(makeSymbol("CLET"), list(list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT")))), list(makeSymbol("SUBJ-CYCLS"), list(makeSymbol("FWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SUBJECT"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))))), list(makeSymbol("VP-CYCLS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT-VP")))), list(makeSymbol("SUBJ-VP-CYCLS"), list(makeSymbol("FWHEN"), makeSymbol("SUBJ-CYCLS"), list(makeSymbol("LIST"), makeSymbol("SUBJ-CYCLS"))))), list(makeSymbol("PWHEN"), makeSymbol("VP-CYCLS"), list(makeSymbol("CPUSH"), makeSymbol("VP-CYCLS"), makeSymbol("SUBJ-VP-CYCLS"))), list(makeSymbol("RET"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), makeSymbol("SUBJ-VP-CYCLS")))))))));



    private static final SubLSymbol VERBAL_LINK_PHRASE_CYCLIFY_INT_METHOD = makeSymbol("VERBAL-LINK-PHRASE-CYCLIFY-INT-METHOD");

    private static final SubLList $list315 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTION"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONJUNCTION"))))), list(makeSymbol("RET"), list(makeSymbol("CAND"), makeSymbol("CONJUNCTION"), list(makeSymbol("CNOT"), list(makeSymbol("MEMBER-IF-NOT"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFIABLE-VERB-PHRASE-P")), list(makeSymbol("FIM"), makeSymbol("CONJUNCTION"), list(makeSymbol("QUOTE"), makeSymbol("GET-COMPLEMENTS")))))))));

    private static final SubLSymbol CYCLIFIABLE_VERB_PHRASE_P = makeSymbol("CYCLIFIABLE-VERB-PHRASE-P");

    private static final SubLSymbol VERBAL_LINK_PHRASE_VP_COORDINATE_PHRASE_P_METHOD = makeSymbol("VERBAL-LINK-PHRASE-VP-COORDINATE-PHRASE-P-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VERBAL_LINK_PHRASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VERBAL-LINK-PHRASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VERBAL_LINK_PHRASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VERBAL-LINK-PHRASE-INSTANCE");

    public static final SubLList $list320 = list(makeString("@return link-phrase-p; the subject phrase of this verbal phrase"), list(makeSymbol("CLET"), list(list(makeSymbol("VERB"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEADS")))))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), list(makeSymbol("VERB-LINK-WORD-P"), makeSymbol("VERB")), list(makeSymbol("FIM"), makeSymbol("VERB"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT")))))));

    private static final SubLSymbol VERBAL_LINK_PHRASE_GET_SUBJECT_METHOD = makeSymbol("VERBAL-LINK-PHRASE-GET-SUBJECT-METHOD");



    public static final SubLList $list323 = list(makeString("@return link-phrase-p; the semantic subject of this verbal phrase"), list(makeSymbol("CLET"), list(list(makeSymbol("HEAD"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEADS")))))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), list(makeSymbol("VERB-LINK-WORD-P"), makeSymbol("HEAD")), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-SUBJECT")))))));

    private static final SubLSymbol VERBAL_LINK_PHRASE_GET_SEMANTIC_SUBJECT_METHOD = makeSymbol("VERBAL-LINK-PHRASE-GET-SEMANTIC-SUBJECT-METHOD");



    private static final SubLList $list326 = list(makeString("@return link-phrase-p; the verbal complement of this link-phrase"), list(makeSymbol("CLET"), list(list(makeSymbol("VERB"), list(makeSymbol("FIRST"), makeSymbol("HEADS")))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), list(makeSymbol("VERB-LINK-WORD-P"), makeSymbol("VERB")), list(makeSymbol("FIM"), makeSymbol("VERB"), list(makeSymbol("QUOTE"), makeSymbol("GET-VERBAL-COMPLEMENT")))))));

    private static final SubLSymbol $sym327$OUTER_CATCH_FOR_VERBAL_LINK_PHRASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-LINK-PHRASE-METHOD");

    private static final SubLSymbol VERBAL_LINK_PHRASE_GET_VERBAL_COMPLEMENT_METHOD = makeSymbol("VERBAL-LINK-PHRASE-GET-VERBAL-COMPLEMENT-METHOD");

    private static final SubLList $list329 = list(makeString("@return listp; the list of head daughters of this verb phrase"), list(makeSymbol("CLET"), list(list(makeSymbol("HEAD-DAUGHTERS"), NIL)), list(makeSymbol("DO-VECTOR"), list(makeSymbol("DAUGHTER"), makeSymbol("DAUGHTERS")), list(makeSymbol("PWHEN"), list(makeSymbol("VERBAL-LINK-TREE-P"), makeSymbol("DAUGHTER")), list(makeSymbol("CPUSH"), makeSymbol("DAUGHTER"), makeSymbol("HEAD-DAUGHTERS")))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), makeSymbol("HEAD-DAUGHTERS")))));

    private static final SubLSymbol $sym330$OUTER_CATCH_FOR_VERBAL_LINK_PHRASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-LINK-PHRASE-METHOD");

    private static final SubLSymbol VERBAL_LINK_PHRASE_GET_HEAD_DAUGHTERS_METHOD = makeSymbol("VERBAL-LINK-PHRASE-GET-HEAD-DAUGHTERS-METHOD");

    private static final SubLSymbol SENTENTIAL_LINK_PHRASE = makeSymbol("SENTENTIAL-LINK-PHRASE");

    public static final SubLList $list333 = list(makeSymbol("CYCLIFIABLE-SENTENTIAL-PHRASE"));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SENTENTIAL_LINK_PHRASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SENTENTIAL-LINK-PHRASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SENTENTIAL_LINK_PHRASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SENTENTIAL-LINK-PHRASE-INSTANCE");

    private static final SubLSymbol PREPOSITIONAL_LINK_TREE = makeSymbol("PREPOSITIONAL-LINK-TREE");

    private static final SubLSymbol PREPOSITIONAL_LINK_PHRASE = makeSymbol("PREPOSITIONAL-LINK-PHRASE");

    private static final SubLList $list338 = list(makeSymbol("CYCLIFIABLE-PREPOSITIONAL-PHRASE"), makeSymbol("PREPOSITIONAL-LINK-TREE"));

    private static final SubLList $list339 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-HEAD-DAUGHTERS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OBLIQUE-OBJECT"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_LINK_PHRASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-LINK-PHRASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_LINK_PHRASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-LINK-PHRASE-INSTANCE");

    private static final SubLList $list342 = list(makeString("@return listp; the list of head daughters of this prepositional phrase"), list(makeSymbol("CLET"), list(list(makeSymbol("HEAD-DAUGHTERS"), NIL)), list(makeSymbol("DO-VECTOR"), list(makeSymbol("DAUGHTER"), makeSymbol("DAUGHTERS")), list(makeSymbol("PWHEN"), list(makeSymbol("PREPOSITIONAL-LINK-TREE-P"), makeSymbol("DAUGHTER")), list(makeSymbol("CPUSH"), makeSymbol("DAUGHTER"), makeSymbol("HEAD-DAUGHTERS")))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), makeSymbol("HEAD-DAUGHTERS")))));

    private static final SubLSymbol $sym343$OUTER_CATCH_FOR_PREPOSITIONAL_LINK_PHRASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PREPOSITIONAL-LINK-PHRASE-METHOD");

    private static final SubLSymbol PREPOSITIONAL_LINK_PHRASE_GET_HEAD_DAUGHTERS_METHOD = makeSymbol("PREPOSITIONAL-LINK-PHRASE-GET-HEAD-DAUGHTERS-METHOD");



    private static final SubLList $list346 = list(makeString("@return link-phrase-p; the oblique object of this prepositional phrase"), list(makeSymbol("CLET"), list(list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBLIQUE-OBJECT")))))));

    private static final SubLSymbol PREPOSITIONAL_LINK_PHRASE_GET_OBLIQUE_OBJECT_METHOD = makeSymbol("PREPOSITIONAL-LINK-PHRASE-GET-OBLIQUE-OBJECT-METHOD");

    private static final SubLSymbol NOMINAL_LINK_TREE = makeSymbol("NOMINAL-LINK-TREE");

    private static final SubLSymbol NOMINAL_LINK_PHRASE = makeSymbol("NOMINAL-LINK-PHRASE");

    private static final SubLList $list350 = list(makeSymbol("NOMINAL-LINK-TREE"), makeSymbol("CYCLIFIABLE-NOUN-PHRASE"));

    private static final SubLList $list351 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-HEAD-DAUGHTERS"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NOMINAL_LINK_PHRASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NOMINAL-LINK-PHRASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NOMINAL_LINK_PHRASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NOMINAL-LINK-PHRASE-INSTANCE");

    public static final SubLList $list354 = list(makeString("@return listp; a list of the all head daughters of this phrase"), list(makeSymbol("PCOND"), list(list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("COORDINATE-PHRASE-P"))), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("FIND")), list(makeSymbol("QUOTE"), makeSymbol("NOMINAL-LINK-TREE-P"))))), list(list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PRETERMINAL-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("HEAD-DAUGHTER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("FIND-LAST")), list(makeSymbol("QUOTE"), makeSymbol("NOUN-LINK-WORD-P"))))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("HEAD-DAUGHTER"), list(makeSymbol("LIST"), makeSymbol("HEAD-DAUGHTER")))))), list(T, list(makeSymbol("CLET"), list(list(makeSymbol("HEAD-DAUGHTER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("FIND-LAST")), list(makeSymbol("QUOTE"), makeSymbol("NOUN-LINK-WORD-P"))))), list(makeSymbol("PIF"), makeSymbol("HEAD-DAUGHTER"), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("HEAD-DAUGHTER"))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("HEAD-DAUGHTER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("FIND-FIRST")), list(makeSymbol("QUOTE"), makeSymbol("NOMINAL-LINK-PHRASE-P")))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("HEAD-DAUGHTER"), list(makeSymbol("LIST"), makeSymbol("HEAD-DAUGHTER"))))))))));

    private static final SubLSymbol NOMINAL_LINK_TREE_P = makeSymbol("NOMINAL-LINK-TREE-P");

    private static final SubLSymbol NOUN_LINK_WORD_P = makeSymbol("NOUN-LINK-WORD-P");

    private static final SubLSymbol NOMINAL_LINK_PHRASE_P = makeSymbol("NOMINAL-LINK-PHRASE-P");

    private static final SubLSymbol NOMINAL_LINK_PHRASE_GET_HEAD_DAUGHTERS_METHOD = makeSymbol("NOMINAL-LINK-PHRASE-GET-HEAD-DAUGHTERS-METHOD");

    private static final SubLSymbol LINK_WORD = makeSymbol("LINK-WORD");

    private static final SubLList $list360 = list(makeSymbol("CYCLIFIABLE-WORD"));

    private static final SubLList $list361 = list(new SubLObject[]{ list(makeSymbol("LINKAGE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("STRING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("REF"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ABS-INDEX"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LEFT-LINKS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("RIGHT-LINKS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LEXES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONTEXT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STRING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ABS-INDEX"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REFS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LINKAGE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTEXT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-HEAD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-HEADS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-COMPLEMENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARTITION-SEMANTIC-COMPLEMENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PP-COMPLEMENT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OBLIQUE-OBJECT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-INT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-NUCLEUS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POS-FILTER-LEXES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PP-COMP-FILTER-LEXES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FRAME-FILTER-LEXES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TREE-KEYWORD-EQ-CLASSES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MODIFIED-DEPENDENT-MEANING-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RANKED-LEXES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LEXES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LEXIFY"), list(makeSymbol("LEXICON")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LEFT-LINKS"), list(makeSymbol("LINK-NAME")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RIGHT-LINKS"), list(makeSymbol("LINK-NAME")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LINKS"), list(makeSymbol("LINK-NAME")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECTLY-RELATED"), list(makeSymbol("LINK-NAME")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RELATED"), list(makeSymbol("LINK-PATH")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PPS"), NIL, makeKeyword("PROTECTED")) });















    private static final SubLList $list369 = list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS"));

    private static final SubLList $list370 = list(list(makeSymbol("IGNORE"), makeSymbol("KEYWORDS")), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol LINK_WORD_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol("LINK-WORD-GET-KEYWORD-RENAMINGS-METHOD");

    private static final SubLSymbol MODIFIED_DEPENDENT_MEANING_P = makeSymbol("MODIFIED-DEPENDENT-MEANING-P");

    private static final SubLList $list373 = list(list(makeSymbol("CLET"), list(makeSymbol("SEMTRANS")), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RANKED-LEXES")))), list(makeSymbol("CSETQ"), makeSymbol("SEMTRANS"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("SEMTRANS"))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("REPLACE"), list(makeSymbol("FORMULA-KEYWORDS"), makeSymbol("SEMTRANS"))), list(makeSymbol("RET"), T))), list(makeSymbol("RET"), NIL)));





    private static final SubLSymbol LINK_WORD_MODIFIED_DEPENDENT_MEANING_P_METHOD = makeSymbol("LINK-WORD-MODIFIED-DEPENDENT-MEANING-P-METHOD");



    private static final SubLList $list378 = list(list(makeSymbol("RET"), list(makeSymbol("KEYWORD-EQ-CLASSES"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("CAR")), list(makeSymbol("FIRST"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-KEYWORD-RENAMINGS")))))))));



    private static final SubLSymbol LINK_WORD_TREE_KEYWORD_EQ_CLASSES_METHOD = makeSymbol("LINK-WORD-TREE-KEYWORD-EQ-CLASSES-METHOD");



    private static final SubLList $list382 = list(list(makeSymbol("CLET"), list(list(makeSymbol("FILTERED"), NIL), list(makeSymbol("TREE-KEYWORDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("TREE-KEYWORD-EQ-CLASSES")))), list(makeSymbol("LEX-SCORES"), NIL), list(makeSymbol("MAX-SCORE"), makeInteger(-5))), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RANKED-LEXES")))), list(makeSymbol("CLET"), list(list(makeSymbol("LEX-SCORE"), list(makeSymbol("LEX-ENTRY-SCORE"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), makeSymbol("TREE-KEYWORDS")))), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), makeSymbol("LEX-SCORE")), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("LEX-SCORES")), list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("LEX-SCORE"), makeSymbol("MAX-SCORE")), list(makeSymbol("CSETQ"), makeSymbol("MAX-SCORE"), makeSymbol("LEX-SCORE"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEX-SCORES")), list(makeSymbol("PWHEN"), list(makeSymbol("="), list(makeSymbol("RLE-CONFIDENCE"), makeSymbol("RLE")), makeSymbol("MAX-SCORE")), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED")))), list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("FILTERED")), list(makeSymbol("RET"), makeSymbol("LEXES"))));

    private static final SubLSymbol $sym383$OUTER_CATCH_FOR_LINK_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-WORD-METHOD");

    private static final SubLInteger $int$_5 = makeInteger(-5);

    private static final SubLSymbol LINK_WORD_FRAME_FILTER_LEXES_METHOD = makeSymbol("LINK-WORD-FRAME-FILTER-LEXES-METHOD");



    private static final SubLList $list387 = list(list(makeSymbol("CLET"), list(list(makeSymbol("FILTERED"), NIL), list(makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-PP-COMPLEMENT")))), list(makeSymbol("PP-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("PP"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))))), makeSymbol("FRAME")), list(makeSymbol("PWHEN"), makeSymbol("PP-HEAD"), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEXES")), list(makeSymbol("CSETQ"), makeSymbol("FRAME"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("FRAME"))), list(makeSymbol("PIF"), list(makeSymbol("CAND"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME")), list(makeSymbol("ISA?"), makeSymbol("FRAME"), reader_make_constant_shell(makeString("PPCompFrame")), reader_make_constant_shell(makeString("EverythingPSC")))), list(makeSymbol("CLET"), list(list(makeSymbol("PREPOSITION"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME"))), list(makeSymbol("PREP-STRING"), list(makeSymbol("FIRST"), list(makeSymbol("GET-STRINGS-OF-TYPE"), makeSymbol("PREPOSITION"), reader_make_constant_shell(makeString("Preposition")))))), list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("PREP-STRING"), list(makeSymbol("FIM"), makeSymbol("PP-HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING")))), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), ONE_INTEGER), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED")))), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED")))), list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("FILTERED"))), list(makeSymbol("RET"), makeSymbol("LEXES"))));

    private static final SubLSymbol $sym388$OUTER_CATCH_FOR_LINK_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-WORD-METHOD");





    private static final SubLObject $$PPCompFrame = reader_make_constant_shell(makeString("PPCompFrame"));

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$Preposition = reader_make_constant_shell(makeString("Preposition"));

    private static final SubLSymbol LINK_WORD_PP_COMP_FILTER_LEXES_METHOD = makeSymbol("LINK-WORD-PP-COMP-FILTER-LEXES-METHOD");



    public static final SubLList $list396 = list(list(makeSymbol("CLET"), list(list(makeSymbol("FILTERED"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEXES")), list(makeSymbol("PCOND"), list(list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("PENN-TAGS"))), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), ONE_INTEGER), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED"))), list(list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("BACKOFF-PENN-TAGS"))), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), makeDouble(0.75)), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED"))))), list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("FILTERED")), list(makeSymbol("RET"), makeSymbol("LEXES"))));

    private static final SubLSymbol $sym397$OUTER_CATCH_FOR_LINK_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-WORD-METHOD");

    private static final SubLSymbol $BACKOFF_PENN_TAGS = makeKeyword("BACKOFF-PENN-TAGS");

    private static final SubLFloat $float$0_75 = makeDouble(0.75);

    private static final SubLSymbol LINK_WORD_POS_FILTER_LEXES_METHOD = makeSymbol("LINK-WORD-POS-FILTER-LEXES-METHOD");



    public static final SubLList $list402 = list(makeSymbol("&OPTIONAL"), makeSymbol("RENAMINGS"));

    private static final SubLList $list403 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NDISTR-COMP-CYCLS"), NIL), list(makeSymbol("DISTR-COMP-CYCLS"), NIL), list(makeSymbol("MOD-CYCLS"), NIL), list(makeSymbol("CYCLS"), NIL)), list(makeSymbol("WITHOUT-RECURSIVE-CYCLIFICATION"), list(makeSymbol("PUNLESS"), makeSymbol("RENAMINGS"), list(makeSymbol("CSETQ"), makeSymbol("RENAMINGS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-KEYWORD-RENAMINGS")), list(makeSymbol("REQUIRED-KEYWORDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RANKED-LEXES"))))))), list(makeSymbol("CSETQ"), makeSymbol("RENAMINGS"), list(makeSymbol("GROUP-DISJUNCTIVE-RENAMINGS"), makeSymbol("RENAMINGS"))), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("NON-DISTRIBUTING"), makeSymbol("DISTRIBUTING")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PARTITION-SEMANTIC-COMPLEMENTS"))), list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), makeSymbol("NON-DISTRIBUTING")), list(makeSymbol("CLET"), list(list(makeSymbol("COMP-CYCL"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))))), list(makeSymbol("PWHEN"), makeSymbol("COMP-CYCL"), list(makeSymbol("CPUSH"), makeSymbol("COMP-CYCL"), makeSymbol("NDISTR-COMP-CYCLS"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), makeSymbol("DISTRIBUTING")), list(makeSymbol("CLET"), list(list(makeSymbol("COMP-CYCL"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))))), list(makeSymbol("PWHEN"), makeSymbol("COMP-CYCL"), list(makeSymbol("CPUSH"), makeSymbol("COMP-CYCL"), makeSymbol("DISTR-COMP-CYCLS"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("MODIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MODIFIERS")))), list(makeSymbol("CLET"), list(list(makeSymbol("MOD-CYCL"), list(makeSymbol("FIM"), makeSymbol("MODIFIER"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))))), list(makeSymbol("PWHEN"), makeSymbol("MOD-CYCL"), list(makeSymbol("CPUSH"), makeSymbol("MOD-CYCL"), makeSymbol("MOD-CYCLS"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("CONJUNCTION"), makeSymbol("RENAMINGS")), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RANKED-LEXES")))), list(makeSymbol("CLET"), list(list(makeSymbol("MY-CYCLS0"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("GROUPING"), makeSymbol("CONJUNCTION")), list(makeSymbol("CLET"), list(list(makeSymbol("THIS-AND-MODS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("RENAMING"), makeSymbol("GROUPING")), list(makeSymbol("CPUSH"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), list(makeSymbol("CONS"), list(makeSymbol("LIST"), list(makeSymbol("APPLY-LEX-RENAMING"), makeSymbol("SELF"), makeSymbol("RLE"), makeSymbol("RENAMING"))), makeSymbol("MOD-CYCLS")))), makeSymbol("THIS-AND-MODS"))), list(makeSymbol("CPUSH"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), list(makeSymbol("CONS"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("INDEXED-PRODUCTS"), makeSymbol("THIS-AND-MODS"))), makeSymbol("NDISTR-COMP-CYCLS")))), makeSymbol("MY-CYCLS0")))), list(makeSymbol("CSETQ"), makeSymbol("CYCLS"), list(makeSymbol("APPEND"), makeSymbol("CYCLS"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("INDEXED-PRODUCTS"), makeSymbol("MY-CYCLS0")))))))))), list(makeSymbol("RET"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), list(makeSymbol("CONS"), makeSymbol("CYCLS"), makeSymbol("DISTR-COMP-CYCLS")))))));



    private static final SubLSymbol LINK_WORD_CYCLIFY_NUCLEUS_METHOD = makeSymbol("LINK-WORD-CYCLIFY-NUCLEUS-METHOD");

    public static final SubLList $list406 = list(list(makeSymbol("WITHOUT-DUPLICATE-CYCLIFICATION"), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-NUCLEUS"))))));

    private static final SubLSymbol LINK_WORD_CYCLIFY_INT_METHOD = makeSymbol("LINK-WORD-CYCLIFY-INT-METHOD");

    private static final SubLList $list408 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-PP-COMPLEMENT")))), list(makeSymbol("OBL-OBJ"), list(makeSymbol("FWHEN"), makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("PP"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBLIQUE-OBJECT")))))), list(makeSymbol("RET"), makeSymbol("OBL-OBJ"))));

    private static final SubLSymbol LINK_WORD_GET_OBLIQUE_OBJECT_METHOD = makeSymbol("LINK-WORD-GET-OBLIQUE-OBJECT-METHOD");

    public static final SubLList $list410 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-PPS")))), list(makeSymbol("CLET"), list(list(makeSymbol("PP-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("PP"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))))), list(makeSymbol("PP-HEAD-STRING"), list(makeSymbol("FWHEN"), makeSymbol("PP-HEAD"), list(makeSymbol("FIM"), makeSymbol("PP-HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING")))))), list(makeSymbol("PWHEN"), makeSymbol("PP-HEAD-STRING"), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RANKED-LEXES")))), list(makeSymbol("CLET"), list(list(makeSymbol("CYCL"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("SEMTRANS"))), list(makeSymbol("KEYWORDS"), list(makeSymbol("FORMULA-KEYWORDS"), makeSymbol("CYCL"))), list(makeSymbol("FRAME"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("FRAME")))), list(makeSymbol("PCOND"), list(list(makeSymbol("CAND"), list(makeSymbol("MEMBER?"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME")), list(makeSymbol("ISA?"), makeSymbol("FRAME"), reader_make_constant_shell(makeString("PPCompFrame")), reader_make_constant_shell(makeString("EverythingPSC")))), list(makeSymbol("CLET"), list(list(makeSymbol("PREPOSITION"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME"))), list(makeSymbol("PREP-STRING"), list(makeSymbol("FIRST"), list(makeSymbol("GET-STRINGS-OF-TYPE"), makeSymbol("PREPOSITION"), reader_make_constant_shell(makeString("Preposition")))))), list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("PREP-STRING"), makeSymbol("PP-HEAD-STRING")), list(makeSymbol("RET"), makeSymbol("PP"))))), list(list(makeSymbol("CAND"), list(makeSymbol("INTERSECTION"), list(makeSymbol("QUOTE"), list(makeKeyword("POSSESSOR"), makeKeyword("POSS-COL"))), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL)), list(EQUALP, makeString("of"), makeSymbol("PP-HEAD-STRING"))), list(makeSymbol("RET"), makeSymbol("PP"))))))))));



    public static final SubLList $list412 = list(makeKeyword("POSSESSOR"), makeKeyword("POSS-COL"));

    private static final SubLString $$$of = makeString("of");



    private static final SubLSymbol LINK_WORD_GET_PP_COMPLEMENT_METHOD = makeSymbol("LINK-WORD-GET-PP-COMPLEMENT-METHOD");

    public static final SubLList $list416 = list(list(makeSymbol("RET"), list(makeSymbol("VALUES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-COMPLEMENTS"))), NIL)));

    private static final SubLSymbol LINK_WORD_PARTITION_SEMANTIC_COMPLEMENTS_METHOD = makeSymbol("LINK-WORD-PARTITION-SEMANTIC-COMPLEMENTS-METHOD");

    private static final SubLList $list418 = list(list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-COMPLEMENTS")))));

    private static final SubLSymbol LINK_WORD_GET_SEMANTIC_COMPLEMENTS_METHOD = makeSymbol("LINK-WORD-GET-SEMANTIC-COMPLEMENTS-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LINK-WORD-INSTANCE");

    private static final SubLList $list422 = list(new SubLObject[]{ makeString("Prints this link word to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<LW"), makeSymbol("STREAM")), list(makeSymbol("PWHEN"), makeSymbol("LEXES"), list(makeSymbol("WRITE-STRING"), makeString("*"), makeSymbol("STREAM"))), list(makeSymbol("WRITE-STRING"), makeString("("), makeSymbol("STREAM")), list(makeSymbol("PRINC"), makeSymbol("POS"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString("): "), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeSymbol("STRING"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")), list(makeSymbol("RET"), makeSymbol("SELF")) });

    private static final SubLSymbol $sym423$OUTER_CATCH_FOR_LINK_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-WORD-METHOD");

    private static final SubLString $str424$__LW = makeString("#<LW");

    private static final SubLString $str425$_ = makeString("(");

    private static final SubLString $str426$___ = makeString("): ");

    private static final SubLSymbol LINK_WORD_PRINT_METHOD = makeSymbol("LINK-WORD-PRINT-METHOD");

    private static final SubLSymbol $split_link_word_caching_state$ = makeSymbol("*SPLIT-LINK-WORD-CACHING-STATE*");





    private static final SubLList $list431 = list(makeString("@return string; the surface string of this link word"), list(makeSymbol("RET"), makeSymbol("STRING")));

    private static final SubLSymbol $sym432$OUTER_CATCH_FOR_LINK_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-WORD-METHOD");

    private static final SubLSymbol LINK_WORD_GET_STRING_METHOD = makeSymbol("LINK-WORD-GET-STRING-METHOD");

    private static final SubLSymbol GET_POS = makeSymbol("GET-POS");

    public static final SubLList $list435 = list(makeString("@return pos; the part-of-speech of this link word"), list(makeSymbol("RET"), makeSymbol("POS")));

    public static final SubLSymbol $sym436$OUTER_CATCH_FOR_LINK_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-WORD-METHOD");

    private static final SubLSymbol LINK_WORD_GET_POS_METHOD = makeSymbol("LINK-WORD-GET-POS-METHOD");

    public static final SubLList $list438 = list(makeString("@return numberp; the absolute index of this word"), list(makeSymbol("RET"), makeSymbol("ABS-INDEX")));

    public static final SubLSymbol $sym439$OUTER_CATCH_FOR_LINK_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-WORD-METHOD");

    private static final SubLSymbol LINK_WORD_GET_ABS_INDEX_METHOD = makeSymbol("LINK-WORD-GET-ABS-INDEX-METHOD");

    public static final SubLList $list441 = list(makeString("@return listp; a list of the referents of this word"), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("REF"))));

    public static final SubLSymbol $sym442$OUTER_CATCH_FOR_LINK_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-WORD-METHOD");

    private static final SubLSymbol LINK_WORD_GET_REFS_METHOD = makeSymbol("LINK-WORD-GET-REFS-METHOD");

    public static final SubLList $list444 = list(makeString("@return linkage-p; the linkage this word is a part of"), list(makeSymbol("RET"), makeSymbol("LINKAGE")));

    private static final SubLSymbol $sym445$OUTER_CATCH_FOR_LINK_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-WORD-METHOD");

    private static final SubLSymbol LINK_WORD_GET_LINKAGE_METHOD = makeSymbol("LINK-WORD-GET-LINKAGE-METHOD");

    private static final SubLList $list447 = list(makeString("@return parse-tree-context-p; the context of this word"), list(makeSymbol("RET"), makeSymbol("CONTEXT")));

    private static final SubLSymbol $sym448$OUTER_CATCH_FOR_LINK_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-WORD-METHOD");

    private static final SubLSymbol LINK_WORD_GET_CONTEXT_METHOD = makeSymbol("LINK-WORD-GET-CONTEXT-METHOD");

    public static final SubLList $list450 = list(makeString("@return link-word; the head of this word"), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol LINK_WORD_GET_HEAD_METHOD = makeSymbol("LINK-WORD-GET-HEAD-METHOD");

    public static final SubLList $list452 = list(makeString("@return link-word; the head of this word"), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("SELF"))));

    private static final SubLSymbol LINK_WORD_GET_HEADS_METHOD = makeSymbol("LINK-WORD-GET-HEADS-METHOD");

    private static final SubLList $list454 = list(makeString("@return listp; a list containing the semantic head of this word"), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEADS")))));

    private static final SubLSymbol LINK_WORD_GET_SEMANTIC_HEADS_METHOD = makeSymbol("LINK-WORD-GET-SEMANTIC-HEADS-METHOD");

    public static final SubLList $list456 = list(makeString("@return listp; the list of all complements of this word"), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol LINK_WORD_GET_COMPLEMENTS_METHOD = makeSymbol("LINK-WORD-GET-COMPLEMENTS-METHOD");

    public static final SubLList $list458 = list(makeString("@return list; the list of ranked lex entries associated with this word"), list(makeSymbol("RET"), makeSymbol("LEXES")));

    private static final SubLSymbol $sym459$OUTER_CATCH_FOR_LINK_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-WORD-METHOD");

    private static final SubLSymbol LINK_WORD_GET_RANKED_LEXES_METHOD = makeSymbol("LINK-WORD-GET-RANKED-LEXES-METHOD");



    public static final SubLList $list462 = list(makeString("@return listp; the list of lexical entries of this word"), list(makeSymbol("RET"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("CAR")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RANKED-LEXES"))))));

    private static final SubLSymbol LINK_WORD_GET_LEXES_METHOD = makeSymbol("LINK-WORD-GET-LEXES-METHOD");

    private static final SubLList $list464 = list(makeString("@return listp; this word\'s PPs\n   @note default; override this method for specific parts-of-speech"), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol LINK_WORD_GET_PPS_METHOD = makeSymbol("LINK-WORD-GET-PPS-METHOD");



    private static final SubLList $list467 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));

    private static final SubLList $list468 = list(makeSymbol("LEXICON"));

    private static final SubLList $list469 = list(makeString("@param LEXICON semtrans-lexicon-p; the lexicon to lexify this word with\n   @return listp; the list of lex entries used to lexify this word\n   @side-effects alters this word\'s lexes slot"), list(makeSymbol("CLET"), list(list(makeSymbol("FILTERED"), NIL), list(makeSymbol("STRING"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("STRING"))))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("LEXES")), list(makeSymbol("NEW-EVEN-LEX-ENTRY-DISTRIBUTION"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeSymbol("STRING")))), list(makeSymbol("PWHEN"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("LEXES"))), list(makeSymbol("CSETQ"), makeSymbol("FILTERED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("POS-FILTER-LEXES")))), list(makeSymbol("CSETQ"), makeSymbol("FILTERED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PP-COMP-FILTER-LEXES")))), list(makeSymbol("PWHEN"), list(makeSymbol("MAIN-VERB-LINK-WORD-P"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("FILTERED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PARTICLE-FILTER-LEXES"))))), list(makeSymbol("CSETQ"), makeSymbol("FILTERED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("FRAME-FILTER-LEXES"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), makeSymbol("FILTERED"), list(makeSymbol("WALL-LINK-WORD-P"), makeSymbol("SELF")), list(makeSymbol("CNOT"), list(makeSymbol("KEYWORDP"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY")))))), list(makeSymbol("CLET"), list(list(makeSymbol("FABRICATED-LEXES"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(makeSymbol("QUOTE"), makeSymbol("FABRICATE")), makeSymbol("STRING"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("CAR")), list(makeSymbol("FIRST"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-KEYWORD-RENAMINGS")))))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY")))))), list(makeSymbol("PWHEN"), makeSymbol("FABRICATED-LEXES"), list(makeSymbol("CSETQ"), makeSymbol("FILTERED"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("NEW-RANKED-LEX-ENTRY")), makeSymbol("FABRICATED-LEXES")))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("LEXES")), makeSymbol("FILTERED")))), list(makeSymbol("PWHEN"), list(makeSymbol("NOUN-LINK-WORD-P"), makeSymbol("SELF")), list(makeSymbol("PCOND"), list(list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("DEFINITE-DESCRIPTION-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("AUGMENTED-LEXES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RANKED-LEXES")))), list(makeSymbol("CLET"), list(list(makeSymbol("LEX"), list(makeSymbol("FWHEN"), makeSymbol("RLE"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("INTRODUCES-TERM?"), makeSymbol("LEX")), list(makeSymbol("CLET"), list(list(makeSymbol("INSTANCE"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTEXT"))), list(makeSymbol("QUOTE"), makeSymbol("GET-INSTANCE")), makeSymbol("SELF"))), list(makeSymbol("SEMTRANS"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("SEMTRANS")))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("CONJOIN"), list(makeSymbol("LIST"), makeSymbol("SEMTRANS"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("equals")), makeKeyword("NOUN"), makeSymbol("INSTANCE"))))), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), ONE_INTEGER))), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("AUGMENTED-LEXES")))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("LEXES")), makeSymbol("AUGMENTED-LEXES")))), list(list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("APPOSITIVE-P"))), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("FILTERED")), list(makeSymbol("CLET"), list(list(makeSymbol("LEX"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("CONJOIN"), list(makeSymbol("LIST"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("equals")), makeKeyword("NOUN"), makeKeyword("MODIFIED"))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("SEMTRANS")))))))))), list(makeSymbol("RET"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("LEXES"))))));





    private static final SubLSymbol NEW_RANKED_LEX_ENTRY = makeSymbol("NEW-RANKED-LEX-ENTRY");



    private static final SubLSymbol GET_INSTANCE = makeSymbol("GET-INSTANCE");



    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));



    private static final SubLSymbol APPOSITIVE_P = makeSymbol("APPOSITIVE-P");

    private static final SubLList $list479 = list(reader_make_constant_shell(makeString("equals")), makeKeyword("NOUN"), makeKeyword("MODIFIED"));

    private static final SubLSymbol LINK_WORD_LEXIFY_METHOD = makeSymbol("LINK-WORD-LEXIFY-METHOD");

    private static final SubLList $list481 = list(makeSymbol("&OPTIONAL"), makeSymbol("LINK-PATTERN"));

    private static final SubLList $list482 = list(makeString("@param LINK-NAME stringp\n   @return list; a list of left links of this word with name LINK-NAME"), list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("LINK-PATTERN"), makeSymbol("REGEX-PATTERN-P")), list(makeSymbol("PUNLESS"), makeSymbol("LINK-PATTERN"), list(makeSymbol("RET"), makeSymbol("LEFT-LINKS"))), list(makeSymbol("CLET"), list(list(makeSymbol("LINKS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("LINK"), makeSymbol("LEFT-LINKS")), list(makeSymbol("PWHEN"), list(makeSymbol("REGEX-MATCH?"), makeSymbol("LINK-PATTERN"), list(makeSymbol("LINK-NAME"), makeSymbol("LINK"))), list(makeSymbol("CPUSH"), makeSymbol("LINK"), makeSymbol("LINKS")))), list(makeSymbol("RET"), makeSymbol("LINKS"))));

    private static final SubLSymbol $sym483$OUTER_CATCH_FOR_LINK_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-WORD-METHOD");



    private static final SubLSymbol LINK_WORD_GET_LEFT_LINKS_METHOD = makeSymbol("LINK-WORD-GET-LEFT-LINKS-METHOD");

    public static final SubLList $list486 = list(makeString("@param LINK-NAME stringp\n   @return list; a list of right links of this word with name LINK-NAME"), list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("LINK-PATTERN"), makeSymbol("REGEX-PATTERN-P")), list(makeSymbol("PUNLESS"), makeSymbol("LINK-PATTERN"), list(makeSymbol("RET"), makeSymbol("RIGHT-LINKS"))), list(makeSymbol("CLET"), list(list(makeSymbol("LINKS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("LINK"), makeSymbol("RIGHT-LINKS")), list(makeSymbol("PWHEN"), list(makeSymbol("REGEX-MATCH?"), makeSymbol("LINK-PATTERN"), list(makeSymbol("LINK-NAME"), makeSymbol("LINK"))), list(makeSymbol("CPUSH"), makeSymbol("LINK"), makeSymbol("LINKS")))), list(makeSymbol("RET"), makeSymbol("LINKS"))));

    private static final SubLSymbol $sym487$OUTER_CATCH_FOR_LINK_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINK-WORD-METHOD");

    private static final SubLSymbol LINK_WORD_GET_RIGHT_LINKS_METHOD = makeSymbol("LINK-WORD-GET-RIGHT-LINKS-METHOD");

    private static final SubLSymbol GET_LINKS = makeSymbol("GET-LINKS");

    public static final SubLList $list490 = list(makeString("@param LINK-NAME stringp\n   @return list; a list of links of this word with name LINK-NAME"), list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("LINK-PATTERN"), makeSymbol("REGEX-PATTERN-P")), list(makeSymbol("RET"), list(makeSymbol("APPEND"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-LEFT-LINKS")), makeSymbol("LINK-PATTERN")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RIGHT-LINKS")), makeSymbol("LINK-PATTERN")))));

    private static final SubLSymbol LINK_WORD_GET_LINKS_METHOD = makeSymbol("LINK-WORD-GET-LINKS-METHOD");

    private static final SubLList $list492 = list(makeSymbol("PATTERN-KEYWORD"), makeSymbol("&OPTIONAL"), makeSymbol("DIRECTION"));

    private static final SubLList $list493 = list(makeString("@param PATTERN-KEYWORD keywordp;\n   @return list; the list of words that is related to this word via LINK-NAME"), list(makeSymbol("CLET"), list(list(makeSymbol("WORDS"), NIL), list(makeSymbol("LINK-PATTERN"), list(makeSymbol("GET-LINK-PATTERN"), makeSymbol("PATTERN-KEYWORD"))), list(makeSymbol("LINK-GETTER"), list(makeSymbol("FCOND"), list(list(makeSymbol("NULL"), makeSymbol("DIRECTION")), list(makeSymbol("QUOTE"), makeSymbol("GET-LINKS"))), list(list(EQL, makeSymbol("DIRECTION"), makeKeyword("LEFT")), list(makeSymbol("QUOTE"), makeSymbol("GET-LEFT-LINKS"))), list(list(EQL, makeSymbol("DIRECTION"), makeKeyword("RIGHT")), list(makeSymbol("QUOTE"), makeSymbol("GET-RIGHT-LINKS"))), list(T, list(makeSymbol("ERROR"), makeString("Invalid link direction ~a"), makeSymbol("DIRECTION")))))), list(makeSymbol("CDOLIST"), list(makeSymbol("LINK"), list(makeSymbol("FIM"), makeSymbol("SELF"), makeSymbol("LINK-GETTER"), makeSymbol("LINK-PATTERN"))), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("LINK-LEFT-WORD"), makeSymbol("LINK")), makeSymbol("SELF")), list(makeSymbol("CPUSH"), list(makeSymbol("LINK-RIGHT-WORD"), makeSymbol("LINK")), makeSymbol("WORDS")), list(makeSymbol("CPUSH"), list(makeSymbol("LINK-LEFT-WORD"), makeSymbol("LINK")), makeSymbol("WORDS")))), list(makeSymbol("RET"), makeSymbol("WORDS"))));

    private static final SubLString $str494$Invalid_link_direction__a = makeString("Invalid link direction ~a");

    private static final SubLSymbol LINK_WORD_GET_DIRECTLY_RELATED_METHOD = makeSymbol("LINK-WORD-GET-DIRECTLY-RELATED-METHOD");

    public static final SubLList $list496 = list(makeSymbol("LINK-PATH"));

    public static final SubLList $list497 = list(makeString("@param LINK-PATH list; a sequence of link-names\n    @return list; the list of words that is related to this word via LINK-PATH, in that\n    order"), list(makeSymbol("PUNLESS"), makeSymbol("LINK-PATH"), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("SELF")))), list(makeSymbol("CLET"), list(list(makeSymbol("WORDS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("RELATED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), list(makeSymbol("CAR"), makeSymbol("LINK-PATH")))), list(makeSymbol("CSETQ"), makeSymbol("WORDS"), list(makeSymbol("APPEND"), list(makeSymbol("FIM"), makeSymbol("RELATED"), list(makeSymbol("QUOTE"), makeSymbol("GET-RELATED")), list(makeSymbol("CDR"), makeSymbol("LINK-PATH"))), makeSymbol("WORDS")))), list(makeSymbol("RET"), makeSymbol("WORDS"))));

    private static final SubLSymbol LINK_WORD_GET_RELATED_METHOD = makeSymbol("LINK-WORD-GET-RELATED-METHOD");



    private static final SubLList $list500 = list(makeSymbol("VERBAL-LINK-TREE"), makeSymbol("VERBAL-WORD"));

    public static final SubLList $list501 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-SUBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OBJECTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-DIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-OBJECTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VERBAL-COMPLEMENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ADJECTIVAL-COMPLEMENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARTITION-SEMANTIC-COMPLEMENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PPS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-HEAD-DAUGHTERS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INFINITIVE-MARKER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INFINITIVE-P"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BASE-P"), NIL, makeKeyword("PROTECTED")) });

    private static final SubLList $list502 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), list(makeKeyword("ACTION"), makeKeyword("SUBJECT"), makeKeyword("OBJECT"), makeKeyword("OBLIQUE-OBJECT"), makeKeyword("CLAUSE"), makeKeyword("INF-COMP"), makeKeyword("NOUN")))));

    private static final SubLList $list503 = list(list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("DISJUNCTS"), NIL), list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-SUBJECT")))), list(makeSymbol("DIRECT-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-DIRECT-OBJECT")))), list(makeSymbol("INDIRECT-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT")))), list(makeSymbol("OBLIQUE-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBLIQUE-OBJECT")))), list(makeSymbol("CL-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-VERBAL-COMPLEMENT")))), list(makeSymbol("MODIFIED"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MODIFIEDS")))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("MEMBER?"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), list(makeSymbol("QUOTE"), list(makeKeyword("VBN"), makeKeyword("VBG"))), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("CNOT"), makeSymbol("SUBJECT"))), list(makeSymbol("CSETQ"), makeSymbol("SUBJECT"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MODIFIEDS")))))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("ACTION"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("ACTION"), makeSymbol("SELF")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SUBJECT"), list(makeSymbol("MEMBER"), makeKeyword("SUBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("SUBJECT"), makeSymbol("SUBJECT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DIRECT-OBJECT"), list(makeSymbol("MEMBER"), makeKeyword("OBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("OBJECT"), makeSymbol("DIRECT-OBJECT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("INDIRECT-OBJECT"), list(makeSymbol("MEMBER"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("INDIRECT-OBJECT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("OBLIQUE-OBJECT"), list(makeSymbol("MEMBER"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("PREP-OBJECT"), makeSymbol("OBLIQUE-OBJECT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MODIFIED"), list(makeSymbol("MEMBER"), makeKeyword("NOUN"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("NOUN"), makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("CL-COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("CLAUSE"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CLET"), list(list(makeSymbol("CL-CYCLS"), list(makeSymbol("FIM"), makeSymbol("CL-COMPLEMENT"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("CL-CYCL"), makeSymbol("CL-CYCLS")), list(makeSymbol("CSETQ"), makeSymbol("CL-CYCL"), list(makeSymbol("LIFT-CONJUNCTS"), makeSymbol("CL-CYCL"))), list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeKeyword("CLAUSE"), makeSymbol("CL-CYCL")), makeSymbol("DISJUNCTS"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("CL-COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("INF-COMP"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("INF-COMP"), makeSymbol("CL-COMPLEMENT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("RET"), list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), makeSymbol("DISJUNCTS"))) }));

    private static final SubLList $list504 = list(makeKeyword("ACTION"), makeKeyword("SUBJECT"), makeKeyword("OBJECT"), makeKeyword("OBLIQUE-OBJECT"), makeKeyword("CLAUSE"), makeKeyword("INF-COMP"), makeKeyword("NOUN"));





    private static final SubLList $list507 = list(makeKeyword("VBN"), makeKeyword("VBG"));













    private static final SubLSymbol VERB_LINK_WORD_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol("VERB-LINK-WORD-GET-KEYWORD-RENAMINGS-METHOD");

    public static final SubLList $list515 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-SUBJECT")))), list(makeSymbol("NON-DISTRIBUTING"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-COMPLEMENTS"))))), list(makeSymbol("PWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("CSETQ"), makeSymbol("NON-DISTRIBUTING"), list(makeSymbol("DELETE-CYCLIFIABLE"), makeSymbol("SUBJECT"), makeSymbol("NON-DISTRIBUTING")))), list(makeSymbol("RET"), list(makeSymbol("VALUES"), makeSymbol("NON-DISTRIBUTING"), list(makeSymbol("FWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("LIST"), makeSymbol("SUBJECT")))))));

    private static final SubLSymbol VERB_LINK_WORD_PARTITION_SEMANTIC_COMPLEMENTS_METHOD = makeSymbol("VERB-LINK-WORD-PARTITION-SEMANTIC-COMPLEMENTS-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VERB_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VERB-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VERB_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VERB-LINK-WORD-INSTANCE");

    private static final SubLList $list519 = list(makeString("@return link-phrase-p; the syntactic subject of this verb\n   @note default; override in subclasses"), list(makeSymbol("PWHEN"), makeSymbol("*REPORT-DEFAULT-METHOD-CALLS?*"), list(makeSymbol("WARN"), makeString("Default method call ~a on class ~a"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT")), list(makeSymbol("QUOTE"), makeSymbol("VERB-LINK-WORD")))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol VERB_LINK_WORD_GET_SUBJECT_METHOD = makeSymbol("VERB-LINK-WORD-GET-SUBJECT-METHOD");

    private static final SubLList $list521 = list(makeString("@return link-phrase-p; the semantic subject of this verb\n   @note default; override in subclasses"), list(makeSymbol("PWHEN"), makeSymbol("*REPORT-DEFAULT-METHOD-CALLS?*"), list(makeSymbol("WARN"), makeString("Default method call ~a on class ~a"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-SUBJECT")), list(makeSymbol("QUOTE"), makeSymbol("VERB-LINK-WORD")))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol VERB_LINK_WORD_GET_SEMANTIC_SUBJECT_METHOD = makeSymbol("VERB-LINK-WORD-GET-SEMANTIC-SUBJECT-METHOD");



    public static final SubLList $list524 = list(makeString("@return listp; the objects of this verb"), list(makeSymbol("CLET"), list(list(makeSymbol("OBJECTS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("OBJECT"), list(makeSymbol("LIST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBLIQUE-OBJECT"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-INDIRECT-OBJECT"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECT-OBJECT"))))), list(makeSymbol("PWHEN"), makeSymbol("OBJECT"), list(makeSymbol("CPUSH"), makeSymbol("OBJECT"), makeSymbol("OBJECTS")))), list(makeSymbol("RET"), makeSymbol("OBJECTS"))));





    private static final SubLSymbol VERB_LINK_WORD_GET_OBJECTS_METHOD = makeSymbol("VERB-LINK-WORD-GET-OBJECTS-METHOD");

    private static final SubLList $list528 = list(makeString("@return link-word; the semantic direct object of this verb\n   @note default; override in subclasses"), list(makeSymbol("PWHEN"), makeSymbol("*REPORT-DEFAULT-METHOD-CALLS?*"), list(makeSymbol("WARN"), makeString("Default method call ~a on class ~a"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-DIRECT-OBJECT")), list(makeSymbol("QUOTE"), makeSymbol("VERB-LINK-WORD")))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol VERB_LINK_WORD_GET_SEMANTIC_DIRECT_OBJECT_METHOD = makeSymbol("VERB-LINK-WORD-GET-SEMANTIC-DIRECT-OBJECT-METHOD");

    private static final SubLList $list530 = list(makeString("@return link-word; the semantic indirect object of this verb\n   @note default; override in subclasses"), list(makeSymbol("PWHEN"), makeSymbol("*REPORT-DEFAULT-METHOD-CALLS?*"), list(makeSymbol("WARN"), makeString("Default method call ~a on class ~a"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT")), list(makeSymbol("QUOTE"), makeSymbol("VERB-LINK-WORD")))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol VERB_LINK_WORD_GET_SEMANTIC_INDIRECT_OBJECT_METHOD = makeSymbol("VERB-LINK-WORD-GET-SEMANTIC-INDIRECT-OBJECT-METHOD");



    private static final SubLList $list533 = list(makeString("@return listp; the semantic object of this verb"), list(makeSymbol("CLET"), list(list(makeSymbol("SEMANTIC-OBJECTS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("SEM-OBJ"), list(makeSymbol("LIST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBLIQUE-OBJECT"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-DIRECT-OBJECT"))))), list(makeSymbol("PWHEN"), makeSymbol("SEM-OBJ"), list(makeSymbol("CPUSHNEW"), makeSymbol("SEM-OBJ"), makeSymbol("SEMANTIC-OBJECTS"), list(makeSymbol("QUOTE"), EQ)))), list(makeSymbol("RET"), makeSymbol("SEMANTIC-OBJECTS"))));

    private static final SubLSymbol VERB_LINK_WORD_GET_SEMANTIC_OBJECTS_METHOD = makeSymbol("VERB-LINK-WORD-GET-SEMANTIC-OBJECTS-METHOD");

    public static final SubLList $list535 = list(makeString("@return verb-link-word; the verbal complement of this verb\n   @note default; override in subclasses"), list(makeSymbol("PWHEN"), makeSymbol("*REPORT-DEFAULT-METHOD-CALLS?*"), list(makeSymbol("WARN"), makeString("Default method call ~a on class ~a"), list(makeSymbol("QUOTE"), makeSymbol("GET-VERBAL-COMPLEMENT")), list(makeSymbol("QUOTE"), makeSymbol("VERB-LINK-WORD")))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol VERB_LINK_WORD_GET_VERBAL_COMPLEMENT_METHOD = makeSymbol("VERB-LINK-WORD-GET-VERBAL-COMPLEMENT-METHOD");



    private static final SubLList $list538 = list(makeString("@return adjective-link-word; the adjectival complement of this verb"), list(makeSymbol("RET"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("P-A-PATTERN"), makeKeyword("RIGHT")))));

    private static final SubLSymbol $P_A_PATTERN = makeKeyword("P-A-PATTERN");

    private static final SubLSymbol VERB_LINK_WORD_GET_ADJECTIVAL_COMPLEMENT_METHOD = makeSymbol("VERB-LINK-WORD-GET-ADJECTIVAL-COMPLEMENT-METHOD");

    private static final SubLList $list541 = list(makeString("@return listp; this verb's PPs"), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("MV-P-PATTERN"))));

    private static final SubLSymbol $MV_P_PATTERN = makeKeyword("MV-P-PATTERN");

    private static final SubLSymbol VERB_LINK_WORD_GET_PPS_METHOD = makeSymbol("VERB-LINK-WORD-GET-PPS-METHOD");

    private static final SubLSymbol GET_INFINITIVE_MARKER = makeSymbol("GET-INFINITIVE-MARKER");

    private static final SubLList $list545 = list(makeString("@return word-tree-p; this verb's infinitive marker"), list(makeSymbol("CLET"), list(list(makeSymbol("CANDIDATE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("I-PATTERN"), makeKeyword("LEFT")))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), list(makeSymbol("INF-MARKER-LINK-WORD-P"), makeSymbol("CANDIDATE")), makeSymbol("CANDIDATE")))));



    private static final SubLSymbol VERB_LINK_WORD_GET_INFINITIVE_MARKER_METHOD = makeSymbol("VERB-LINK-WORD-GET-INFINITIVE-MARKER-METHOD");

    private static final SubLSymbol INFINITIVE_P = makeSymbol("INFINITIVE-P");

    public static final SubLList $list549 = list(makeString("@return booleanp; t if this verb is in the infinitive form, nil otherwise"), list(makeSymbol("RET"), list(makeSymbol("BOOLEAN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-INFINITIVE-MARKER"))))));

    private static final SubLSymbol VERB_LINK_WORD_INFINITIVE_P_METHOD = makeSymbol("VERB-LINK-WORD-INFINITIVE-P-METHOD");

    private static final SubLSymbol BASE_P = makeSymbol("BASE-P");

    public static final SubLList $list552 = list(makeString("@return booleanp; t if this verb is in its base form, nil otherwise"), list(makeSymbol("RET"), list(makeSymbol("BOOLEAN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("I-PATTERN"), makeKeyword("LEFT")))));

    private static final SubLSymbol VERB_LINK_WORD_BASE_P_METHOD = makeSymbol("VERB-LINK-WORD-BASE-P-METHOD");



    private static final SubLList $list555 = list(makeSymbol("VERBAL-WORD"));

    private static final SubLList $list556 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-INT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARTICLE-FILTER-LEXES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PASSIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-SUBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-DIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INDIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARTITION-SEMANTIC-COMPLEMENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VERBAL-COMPLEMENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AUX-VERB"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARTICLE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MATRIX-CLAUSE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SUBJECT-CONTROLLER-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OBJECT-CONTROLLER-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONTROL-VERB-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTROL-VERB"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTROLLER"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")) });



    private static final SubLList $list558 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CONTROL-VERB"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTROL-VERB"))))), list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("CONTROL-VERB")), list(makeSymbol("RET"), NIL)), list(list(makeSymbol("FIM"), makeSymbol("CONTROL-VERB"), list(makeSymbol("QUOTE"), makeSymbol("SUBJECT-CONTROLLER-P"))), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("CONTROL-VERB"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-SUBJECT"))))), list(list(makeSymbol("FIM"), makeSymbol("CONTROL-VERB"), list(makeSymbol("QUOTE"), makeSymbol("OBJECT-CONTROLLER-P"))), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("CONTROL-VERB"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECT-OBJECT"))))))));







    private static final SubLSymbol MAIN_VERB_LINK_WORD_GET_CONTROLLER_METHOD = makeSymbol("MAIN-VERB-LINK-WORD-GET-CONTROLLER-METHOD");

    public static final SubLList $list563 = list(list(makeSymbol("CLET"), list(list(makeSymbol("MATRIX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MATRIX-CLAUSE")))), list(makeSymbol("MATRIX-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("MATRIX"), list(makeSymbol("FIM"), makeSymbol("MATRIX"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD")))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MATRIX-HEAD"), list(makeSymbol("FIM"), makeSymbol("MATRIX-HEAD"), list(makeSymbol("QUOTE"), makeSymbol("CONTROL-VERB-P")))), list(makeSymbol("RET"), makeSymbol("MATRIX-HEAD")))));





    private static final SubLSymbol MAIN_VERB_LINK_WORD_GET_CONTROL_VERB_METHOD = makeSymbol("MAIN-VERB-LINK-WORD-GET-CONTROL-VERB-METHOD");

    public static final SubLList $list567 = list(list(makeSymbol("RET"), list(makeSymbol("COR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("SUBJECT-CONTROLLER-P"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("OBJECT-CONTROLLER-P"))))));

    private static final SubLSymbol MAIN_VERB_LINK_WORD_CONTROL_VERB_P_METHOD = makeSymbol("MAIN-VERB-LINK-WORD-CONTROL-VERB-P-METHOD");

    public static final SubLList $list569 = list(list(makeSymbol("CLET"), list(makeSymbol("RESULT")), list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-LEXES")))), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("FRAME")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("ObjectControlFrame")))))), list(makeSymbol("PWHEN"), makeSymbol("RESULT"), list(makeSymbol("RET"), list(makeSymbol("BOOLEAN"), makeSymbol("RESULT")))))));

    private static final SubLList $list570 = list(reader_make_constant_shell(makeString("ObjectControlFrame")));

    private static final SubLSymbol MAIN_VERB_LINK_WORD_OBJECT_CONTROLLER_P_METHOD = makeSymbol("MAIN-VERB-LINK-WORD-OBJECT-CONTROLLER-P-METHOD");

    public static final SubLList $list572 = list(list(makeSymbol("CLET"), list(makeSymbol("RESULT")), list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-LEXES")))), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("FRAME")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("IntransitiveSubjectControlFrame")), reader_make_constant_shell(makeString("TransitiveSubjectControlFrame")))))), list(makeSymbol("PWHEN"), makeSymbol("RESULT"), list(makeSymbol("RET"), list(makeSymbol("BOOLEAN"), makeSymbol("RESULT")))))));

    private static final SubLList $list573 = list(reader_make_constant_shell(makeString("IntransitiveSubjectControlFrame")), reader_make_constant_shell(makeString("TransitiveSubjectControlFrame")));

    private static final SubLSymbol MAIN_VERB_LINK_WORD_SUBJECT_CONTROLLER_P_METHOD = makeSymbol("MAIN-VERB-LINK-WORD-SUBJECT-CONTROLLER-P-METHOD");

    private static final SubLList $list575 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("ANCESTOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-ANCESTORS")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("SENTENTIAL-TREE-P"), makeSymbol("ANCESTOR")), list(makeSymbol("CNOT"), list(EQ, list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))), makeSymbol("SELF")))), list(makeSymbol("RET"), makeSymbol("ANCESTOR")))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol MAIN_VERB_LINK_WORD_GET_MATRIX_CLAUSE_METHOD = makeSymbol("MAIN-VERB-LINK-WORD-GET-MATRIX-CLAUSE-METHOD");

    private static final SubLSymbol MAIN_VERB_LINK_WORD_PARTITION_SEMANTIC_COMPLEMENTS_METHOD = makeSymbol("MAIN-VERB-LINK-WORD-PARTITION-SEMANTIC-COMPLEMENTS-METHOD");

    private static final SubLList $list578 = list(list(makeSymbol("CLET"), list(list(makeSymbol("FILTERED"), NIL), list(makeSymbol("SENTENCE-PARTICLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-PARTICLE")))), list(makeSymbol("SENTENCE-PARTICLE-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("SENTENCE-PARTICLE"), list(makeSymbol("FIM"), makeSymbol("SENTENCE-PARTICLE"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))))), makeSymbol("FRAME")), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEXES")), list(makeSymbol("CSETQ"), makeSymbol("FRAME"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("FRAME"))), list(makeSymbol("PIF"), list(makeSymbol("CAND"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME")), list(makeSymbol("ISA?"), makeSymbol("FRAME"), reader_make_constant_shell(makeString("ParticleFrameType")), reader_make_constant_shell(makeString("EverythingPSC")))), list(makeSymbol("PWHEN"), makeSymbol("SENTENCE-PARTICLE-HEAD"), list(makeSymbol("CLET"), list(list(makeSymbol("REQUIRED-PARTICLE-STRING"), list(makeSymbol("FIRST"), list(makeSymbol("GET-STRINGS-OF-TYPE"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME")), reader_make_constant_shell(makeString("VerbParticle")))))), list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("REQUIRED-PARTICLE-STRING"), list(makeSymbol("FIM"), makeSymbol("SENTENCE-PARTICLE-HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING")))), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), ONE_INTEGER), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED"))))), list(makeSymbol("PUNLESS"), makeSymbol("SENTENCE-PARTICLE-HEAD"), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED"))))), list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("FILTERED")), list(makeSymbol("RET"), makeSymbol("LEXES"))));

    private static final SubLSymbol $sym579$OUTER_CATCH_FOR_MAIN_VERB_LINK_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-MAIN-VERB-LINK-WORD-METHOD");



    private static final SubLObject $$ParticleFrameType = reader_make_constant_shell(makeString("ParticleFrameType"));

    private static final SubLObject $$VerbParticle = reader_make_constant_shell(makeString("VerbParticle"));

    private static final SubLSymbol MAIN_VERB_LINK_WORD_PARTICLE_FILTER_LEXES_METHOD = makeSymbol("MAIN-VERB-LINK-WORD-PARTICLE-FILTER-LEXES-METHOD");

    private static final SubLSymbol MAIN_VERB_LINK_WORD_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol("MAIN-VERB-LINK-WORD-GET-KEYWORD-RENAMINGS-METHOD");

    private static final SubLSymbol MAIN_VERB_LINK_WORD_CYCLIFY_INT_METHOD = makeSymbol("MAIN-VERB-LINK-WORD-CYCLIFY-INT-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_MAIN_VERB_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MAIN-VERB-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_MAIN_VERB_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MAIN-VERB-LINK-WORD-INSTANCE");



    private static final SubLList $list589 = list(makeString("@return boolean; whether the sentence is passive"), list(makeSymbol("RET"), list(makeSymbol("BOOLEAN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("P-V-PATTERN")))));

    private static final SubLSymbol $P_V_PATTERN = makeKeyword("P-V-PATTERN");

    private static final SubLSymbol MAIN_VERB_LINK_WORD_PASSIVE_P_METHOD = makeSymbol("MAIN-VERB-LINK-WORD-PASSIVE-P-METHOD");

    private static final SubLList $list592 = list(makeString("@return link-word; the subject of this verb"), list(makeSymbol("CLET"), list(list(makeSymbol("SUBJECTS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("S-PATTERN")))), list(makeSymbol("PWHEN"), makeSymbol("SUBJECTS"), list(makeSymbol("RET"), list(makeSymbol("GET-LINK-PHRASE"), makeSymbol("SUBJECTS"))))), list(makeSymbol("CLET"), list(list(makeSymbol("AUX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-AUX-VERB"))))), list(makeSymbol("PWHEN"), makeSymbol("AUX"), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("AUX"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT")))))), list(makeSymbol("CLET"), list(list(makeSymbol("CONTROLLER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTROLLER"))))), list(makeSymbol("PWHEN"), makeSymbol("CONTROLLER"), list(makeSymbol("RET"), makeSymbol("CONTROLLER")))));





    private static final SubLSymbol MAIN_VERB_LINK_WORD_GET_SUBJECT_METHOD = makeSymbol("MAIN-VERB-LINK-WORD-GET-SUBJECT-METHOD");

    private static final SubLList $list596 = list(makeString("@return link-word; the semantic subject of this verb"), list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PASSIVE-P"))), list(makeSymbol("PROGN"), list(makeSymbol("CDOLIST"), list(makeSymbol("PREPOSITION"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-PPS")))), list(makeSymbol("PWHEN"), list(EQUAL, list(makeSymbol("FIM"), makeSymbol("PREPOSITION"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), makeString("by")), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("PREPOSITION"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBLIQUE-OBJECT")))))), list(makeSymbol("RET"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("AUX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-AUX-VERB"))))), list(makeSymbol("RET"), list(makeSymbol("FIF"), makeSymbol("AUX"), list(makeSymbol("FIM"), makeSymbol("AUX"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT"))))))));

    private static final SubLString $$$by = makeString("by");

    private static final SubLSymbol MAIN_VERB_LINK_WORD_GET_SEMANTIC_SUBJECT_METHOD = makeSymbol("MAIN-VERB-LINK-WORD-GET-SEMANTIC-SUBJECT-METHOD");

    public static final SubLList $list599 = list(makeString("@return link-word; the direct object of this verb"), list(makeSymbol("CLET"), list(list(makeSymbol("OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("O-.-N-PATTERN")))), list(makeSymbol("PWHEN"), makeSymbol("OBJECT"), list(makeSymbol("RET"), list(makeSymbol("GET-LINK-PHRASE"), makeSymbol("OBJECT"))))), list(makeSymbol("CLET"), list(list(makeSymbol("OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("O-PATTERN")))), list(makeSymbol("PWHEN"), makeSymbol("OBJECT"), list(makeSymbol("RET"), list(makeSymbol("GET-LINK-PHRASE"), makeSymbol("OBJECT"))))), list(makeSymbol("CLET"), list(list(makeSymbol("OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("B-PATTERN")))), list(makeSymbol("PWHEN"), makeSymbol("OBJECT"), list(makeSymbol("RET"), list(makeSymbol("GET-LINK-PHRASE"), makeSymbol("OBJECT"))))));

    private static final SubLSymbol $kw600$O___N_PATTERN = makeKeyword("O-.-N-PATTERN");





    private static final SubLSymbol MAIN_VERB_LINK_WORD_GET_DIRECT_OBJECT_METHOD = makeSymbol("MAIN-VERB-LINK-WORD-GET-DIRECT-OBJECT-METHOD");

    private static final SubLList $list604 = list(makeString("@return link-word; the semantic direct object of this verb"), list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PASSIVE-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("OBJECT"), NIL)), list(makeSymbol("CSOME"), list(makeSymbol("PATTERN"), list(makeSymbol("QUOTE"), list(list(makeKeyword("O-PATTERN")), list(makeKeyword("P-V-PATTERN"), makeKeyword("S-PATTERN")), list(makeKeyword("P-V-PATTERN"), makeKeyword("P-G-PATTERN"), makeKeyword("S-PATTERN")))), makeSymbol("OBJECT")), list(makeSymbol("CSETQ"), makeSymbol("OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RELATED")), makeSymbol("PATTERN")))), list(makeSymbol("RET"), list(makeSymbol("GET-LINK-PHRASE"), makeSymbol("OBJECT")))), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECT-OBJECT"))))));

    private static final SubLList $list605 = list(list(makeKeyword("O-PATTERN")), list(makeKeyword("P-V-PATTERN"), makeKeyword("S-PATTERN")), list(makeKeyword("P-V-PATTERN"), makeKeyword("P-G-PATTERN"), makeKeyword("S-PATTERN")));

    private static final SubLSymbol MAIN_VERB_LINK_WORD_GET_SEMANTIC_DIRECT_OBJECT_METHOD = makeSymbol("MAIN-VERB-LINK-WORD-GET-SEMANTIC-DIRECT-OBJECT-METHOD");

    public static final SubLList $list607 = list(makeString("@return link-word; the indirect object of this verb"), list(makeSymbol("CLET"), list(list(makeSymbol("OBL-OBJ"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBLIQUE-OBJECT"))))), list(makeSymbol("PWHEN"), makeSymbol("OBL-OBJ"), list(makeSymbol("RET"), makeSymbol("OBL-OBJ")))), list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("O-.-N-PATTERN")), list(makeSymbol("CLET"), list(list(makeSymbol("OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("O-PATTERN")))), list(makeSymbol("PWHEN"), makeSymbol("OBJECT"), list(makeSymbol("RET"), list(makeSymbol("GET-LINK-PHRASE"), makeSymbol("OBJECT")))))));

    private static final SubLSymbol MAIN_VERB_LINK_WORD_GET_INDIRECT_OBJECT_METHOD = makeSymbol("MAIN-VERB-LINK-WORD-GET-INDIRECT-OBJECT-METHOD");

    public static final SubLList $list609 = list(makeString("@return link-word; the semantic indirect object of this verb"), list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PASSIVE-P"))), list(makeSymbol("PROGN"), list(makeSymbol("CDOLIST"), list(makeSymbol("PREPOSITION"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-PPS")))), list(makeSymbol("PWHEN"), list(EQUAL, list(makeSymbol("FIM"), makeSymbol("PREPOSITION"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), makeString("to")), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("PREPOSITION"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBLIQUE-OBJECT")))))), list(makeSymbol("CLET"), list(list(makeSymbol("AUX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-AUX-VERB"))))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("AUX"), list(makeSymbol("FIM"), makeSymbol("AUX"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT"))))))), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-INDIRECT-OBJECT"))))));

    private static final SubLString $$$to = makeString("to");

    private static final SubLSymbol MAIN_VERB_LINK_WORD_GET_SEMANTIC_INDIRECT_OBJECT_METHOD = makeSymbol("MAIN-VERB-LINK-WORD-GET-SEMANTIC-INDIRECT-OBJECT-METHOD");

    private static final SubLList $list612 = list(makeString("@return verb-link-word; the verbal complement of this verb"), list(makeSymbol("CLET"), list(list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RELATED")), list(makeSymbol("QUOTE"), list(makeKeyword("TH-PATTERN"), makeKeyword("C-E-PATTERN"), makeKeyword("S-PATTERN")))))), list(makeSymbol("PUNLESS"), makeSymbol("COMPLEMENT"), list(makeSymbol("CSETQ"), makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RELATED")), list(makeSymbol("QUOTE"), list(makeKeyword("C-E-PATTERN"), makeKeyword("S-PATTERN")))))), list(makeSymbol("PUNLESS"), makeSymbol("COMPLEMENT"), list(makeSymbol("CSETQ"), makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RELATED")), list(makeSymbol("QUOTE"), list(makeKeyword("TO-PATTERN"), makeKeyword("I-PATTERN")))))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("COMPLEMENT"), list(makeSymbol("GET-LINK-PHRASE"), makeSymbol("COMPLEMENT"))))));

    public static final SubLList $list613 = list(makeKeyword("TH-PATTERN"), makeKeyword("C-E-PATTERN"), makeKeyword("S-PATTERN"));

    public static final SubLList $list614 = list(makeKeyword("C-E-PATTERN"), makeKeyword("S-PATTERN"));

    private static final SubLList $list615 = list(makeKeyword("TO-PATTERN"), makeKeyword("I-PATTERN"));

    private static final SubLSymbol MAIN_VERB_LINK_WORD_GET_VERBAL_COMPLEMENT_METHOD = makeSymbol("MAIN-VERB-LINK-WORD-GET-VERBAL-COMPLEMENT-METHOD");

    private static final SubLList $list617 = list(makeString("@return listp; a list of all complements of this verb"), list(makeSymbol("CLET"), list(list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-SUBJECT")))), list(makeSymbol("DO"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-DIRECT-OBJECT")))), list(makeSymbol("IO"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT")))), list(makeSymbol("COMPLEMENTS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), list(makeSymbol("LIST"), makeSymbol("IO"), makeSymbol("DO"), makeSymbol("SUBJECT"))), list(makeSymbol("PWHEN"), makeSymbol("COMPLEMENT"), list(makeSymbol("CPUSH"), makeSymbol("COMPLEMENT"), makeSymbol("COMPLEMENTS")))), list(makeSymbol("RET"), makeSymbol("COMPLEMENTS"))));

    private static final SubLSymbol MAIN_VERB_LINK_WORD_GET_COMPLEMENTS_METHOD = makeSymbol("MAIN-VERB-LINK-WORD-GET-COMPLEMENTS-METHOD");

    public static final SubLList $list619 = list(makeString("@return aux-verb-link-word-p; the aux verb of this verb"), list(makeSymbol("CLET"), list(list(makeSymbol("AUX"), NIL)), list(makeSymbol("CSOME"), list(makeSymbol("PATTERNS"), list(makeSymbol("QUOTE"), list(list(makeKeyword("P-PATTERN")), list(makeKeyword("P-V-PATTERN"), makeKeyword("P-G-PATTERN")), list(makeKeyword("I-PATTERN")))), makeSymbol("AUX")), list(makeSymbol("CSETQ"), makeSymbol("AUX"), list(makeSymbol("CAR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RELATED")), makeSymbol("PATTERNS"))))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), list(makeSymbol("AUX-VERB-LINK-WORD-P"), makeSymbol("AUX")), makeSymbol("AUX")))));

    private static final SubLList $list620 = list(list(makeKeyword("P-PATTERN")), list(makeKeyword("P-V-PATTERN"), makeKeyword("P-G-PATTERN")), list(makeKeyword("I-PATTERN")));

    private static final SubLSymbol MAIN_VERB_LINK_WORD_GET_AUX_VERB_METHOD = makeSymbol("MAIN-VERB-LINK-WORD-GET-AUX-VERB-METHOD");

    private static final SubLList $list622 = list(makeString("@return link-word-p; this verb's particle, or nil if there is none"), list(makeSymbol("RET"), list(makeSymbol("GET-LINK-PHRASE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("K-PATTERN"), makeKeyword("RIGHT")))));



    private static final SubLSymbol MAIN_VERB_LINK_WORD_GET_PARTICLE_METHOD = makeSymbol("MAIN-VERB-LINK-WORD-GET-PARTICLE-METHOD");

    public static final SubLList $list625 = list(makeString("@return listp; the list of all word this verb modifies"), list(makeSymbol("RET"), list(makeSymbol("APPEND"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("M-PATTERN"), makeKeyword("LEFT")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("A-PATTERN"), makeKeyword("RIGHT")))));





    private static final SubLSymbol MAIN_VERB_LINK_WORD_GET_MODIFIEDS_METHOD = makeSymbol("MAIN-VERB-LINK-WORD-GET-MODIFIEDS-METHOD");



    public static final SubLList $list630 = list(makeSymbol("AUX-VERB-WORD"));

    public static final SubLList $list631 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VERBAL-COMPLEMENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ADJECTIVAL-COMPLEMENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ADVERBIAL-COMPLEMENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PREPOSITIONAL-COMPLEMENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-COMPLEMENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EQUALITY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PASSIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-SUBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-DIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INDIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OBLIQUE-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TENSE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-HEADS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COPULA-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });



    private static final SubLList $list633 = list(list(makeSymbol("RET"), list(makeSymbol("CNOT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-VERBAL-COMPLEMENT"))))));

    private static final SubLSymbol AUX_VERB_LINK_WORD_COPULA_P_METHOD = makeSymbol("AUX-VERB-LINK-WORD-COPULA-P-METHOD");

    private static final SubLList $list635 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), list(makeKeyword("SUBJECT"), makeKeyword("OBJECT"), makeKeyword("COMPLEMENT")))));

    private static final SubLList $list636 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("DISJUNCTS"), NIL), list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-SUBJECT")))), list(makeSymbol("DIRECT-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-DIRECT-OBJECT")))), list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-COMPLEMENTS")))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SUBJECT"), list(makeSymbol("MEMBER"), makeKeyword("SUBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("SUBJECT"), makeSymbol("SUBJECT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DIRECT-OBJECT"), list(makeSymbol("MEMBER"), makeKeyword("OBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("OBJECT"), makeSymbol("DIRECT-OBJECT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("COMPLEMENT"), list(makeSymbol("CAND"), list(makeSymbol("COR"), list(makeSymbol("CNOT"), makeSymbol("SUBJECT")), list(makeSymbol("CNOT"), list(EQ, makeSymbol("COMPLEMENT"), makeSymbol("SUBJECT")))), list(makeSymbol("CNOT"), list(EQ, makeSymbol("COMPLEMENT"), makeSymbol("DIRECT-OBJECT")))), list(makeSymbol("MEMBER"), makeKeyword("COMPLEMENT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CLET"), list(list(makeSymbol("COMP-CYCLS"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))))), list(makeSymbol("PUNLESS"), makeSymbol("COMP-CYCLS"), list(makeSymbol("CPUSH"), NIL, makeSymbol("COMP-CYCLS"))), list(makeSymbol("CDOLIST"), list(makeSymbol("COMP-CYCL"), makeSymbol("COMP-CYCLS")), list(makeSymbol("CSETQ"), makeSymbol("COMP-CYCL"), list(makeSymbol("LIFT-CONJUNCTS"), makeSymbol("COMP-CYCL"))), list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeKeyword("COMPLEMENT"), makeSymbol("COMP-CYCL")), makeSymbol("DISJUNCTS"))))), list(makeSymbol("RET"), list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), makeSymbol("DISJUNCTS")))));

    public static final SubLList $list637 = list(makeKeyword("SUBJECT"), makeKeyword("OBJECT"), makeKeyword("COMPLEMENT"));



    private static final SubLSymbol AUX_VERB_LINK_WORD_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol("AUX-VERB-LINK-WORD-GET-KEYWORD-RENAMINGS-METHOD");

    public static final SubLList $list640 = list(list(makeSymbol("CLET"), list(list(makeSymbol("MAIN-VERB"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-VERBAL-COMPLEMENT"))))), list(makeSymbol("RET"), list(makeSymbol("FIF"), makeSymbol("MAIN-VERB"), list(makeSymbol("FIM"), makeSymbol("MAIN-VERB"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-HEADS"))), list(makeSymbol("LIST"), makeSymbol("SELF"))))));

    private static final SubLSymbol AUX_VERB_LINK_WORD_GET_SEMANTIC_HEADS_METHOD = makeSymbol("AUX-VERB-LINK-WORD-GET-SEMANTIC-HEADS-METHOD");



    private static final SubLList $list643 = list(list(makeSymbol("RET"), list(makeSymbol("FCOND"), list(list(makeSymbol("MEMBER"), list(makeSymbol("GET-STRING"), makeSymbol("SELF")), list(makeSymbol("QUOTE"), list(makeString("is"), makeString("am"), makeString("are"), makeString("have"), makeString("has"), makeString("do"), makeString("does"))), list(makeSymbol("QUOTE"), EQUALP)), makeKeyword("PRESENT")), list(list(makeSymbol("MEMBER"), list(makeSymbol("GET-STRING"), makeSymbol("SELF")), list(makeSymbol("QUOTE"), list(makeString("was"), makeString("were"), makeString("had"), makeString("did"))), list(makeSymbol("QUOTE"), EQUALP)), makeKeyword("PAST")), list(list(makeSymbol("MEMBER"), list(makeSymbol("GET-STRING"), makeSymbol("SELF")), list(makeSymbol("QUOTE"), list(makeString("be"), makeString("do"), makeString("have"))), list(makeSymbol("QUOTE"), EQUALP)), makeKeyword("INFINITIVE")))));

    private static final SubLList $list644 = list(makeString("is"), makeString("am"), makeString("are"), makeString("have"), makeString("has"), makeString("do"), makeString("does"));



    private static final SubLList $list646 = list(makeString("was"), makeString("were"), makeString("had"), makeString("did"));



    private static final SubLList $list648 = list(makeString("be"), makeString("do"), makeString("have"));



    private static final SubLSymbol AUX_VERB_LINK_WORD_GET_TENSE_METHOD = makeSymbol("AUX-VERB-LINK-WORD-GET-TENSE-METHOD");

    private static final SubLList $list651 = list(list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("COPULA-P"))), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-COMPLEMENTS")))), list(makeSymbol("CLET"), list(list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-VERBAL-COMPLEMENT"))))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("COMPLEMENT"), list(makeSymbol("LIST"), makeSymbol("COMPLEMENT")))))));

    private static final SubLSymbol AUX_VERB_LINK_WORD_GET_SEMANTIC_COMPLEMENTS_METHOD = makeSymbol("AUX-VERB-LINK-WORD-GET-SEMANTIC-COMPLEMENTS-METHOD");

    public static final SubLList $list653 = list(list(makeSymbol("CLET"), list(list(makeSymbol("COMPLEMENTS"), NIL), list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-SUBJECT")))), list(makeSymbol("OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-DIRECT-OBJECT")))), list(makeSymbol("VERBAL-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-VERBAL-COMPLEMENT")))), list(makeSymbol("PREP-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-PREPOSITIONAL-COMPLEMENT")))), list(makeSymbol("ADJ-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-ADJECTIVAL-COMPLEMENT")))), list(makeSymbol("ADV-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-ADVERBIAL-COMPLEMENT"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), list(makeSymbol("LIST"), makeSymbol("ADV-COMPLEMENT"), makeSymbol("ADJ-COMPLEMENT"), makeSymbol("PREP-COMPLEMENT"), makeSymbol("VERBAL-COMPLEMENT"), makeSymbol("OBJECT"), makeSymbol("SUBJECT"))), list(makeSymbol("PWHEN"), makeSymbol("COMPLEMENT"), list(makeSymbol("CPUSH"), makeSymbol("COMPLEMENT"), makeSymbol("COMPLEMENTS")))), list(makeSymbol("RET"), makeSymbol("COMPLEMENTS"))));

    private static final SubLSymbol GET_PREPOSITIONAL_COMPLEMENT = makeSymbol("GET-PREPOSITIONAL-COMPLEMENT");

    private static final SubLSymbol GET_ADVERBIAL_COMPLEMENT = makeSymbol("GET-ADVERBIAL-COMPLEMENT");

    private static final SubLSymbol AUX_VERB_LINK_WORD_GET_COMPLEMENTS_METHOD = makeSymbol("AUX-VERB-LINK-WORD-GET-COMPLEMENTS-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_AUX_VERB_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-AUX-VERB-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_AUX_VERB_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-AUX-VERB-LINK-WORD-INSTANCE");

    private static final SubLList $list659 = list(makeString("@return noun-link-word-p; the subject of this aux verb"), list(makeSymbol("RET"), list(makeSymbol("GET-LINK-PHRASE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("S-PATTERN")))));

    private static final SubLSymbol AUX_VERB_LINK_WORD_GET_SUBJECT_METHOD = makeSymbol("AUX-VERB-LINK-WORD-GET-SUBJECT-METHOD");

    private static final SubLList $list661 = list(makeString("@return verb-link-word; this aux verb's verboal complement"), list(makeSymbol("CDOLIST"), list(makeSymbol("PATTERN"), list(makeSymbol("QUOTE"), list(makeKeyword("I-PATTERN"), makeKeyword("P-V-PATTERN"), makeKeyword("P-G-PATTERN"), makeKeyword("PP-PATTERN")))), list(makeSymbol("CLET"), list(makeSymbol("VCOMPS")), list(makeSymbol("CSETQ"), makeSymbol("VCOMPS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeSymbol("PATTERN"), makeKeyword("RIGHT"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("VCOMPS"), list(makeSymbol("VERB-LINK-WORD-P"), list(makeSymbol("FIRST"), makeSymbol("VCOMPS")))), list(makeSymbol("RET"), list(makeSymbol("GET-LINK-PHRASE"), makeSymbol("VCOMPS")))))));

    private static final SubLList $list662 = list(makeKeyword("I-PATTERN"), makeKeyword("P-V-PATTERN"), makeKeyword("P-G-PATTERN"), makeKeyword("PP-PATTERN"));

    private static final SubLSymbol AUX_VERB_LINK_WORD_GET_VERBAL_COMPLEMENT_METHOD = makeSymbol("AUX-VERB-LINK-WORD-GET-VERBAL-COMPLEMENT-METHOD");

    private static final SubLList $list664 = list(makeString("@return adjective-link-word; this aux verb's adjective complement"), list(makeSymbol("CLET"), list(list(makeSymbol("ACOMP"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("P-A-PATTERN"), makeKeyword("RIGHT")))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("ACOMP"), list(makeSymbol("GET-LINK-PHRASE"), makeSymbol("ACOMP"))))));

    private static final SubLSymbol AUX_VERB_LINK_WORD_GET_ADJECTIVAL_COMPLEMENT_METHOD = makeSymbol("AUX-VERB-LINK-WORD-GET-ADJECTIVAL-COMPLEMENT-METHOD");

    private static final SubLList $list666 = list(makeString("@return adverb-link-word; this aux verb's adverbial complement"), list(makeSymbol("CLET"), list(list(makeSymbol("ACOMP"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("PF-PATTERN"), makeKeyword("LEFT")))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("ACOMP"), list(makeSymbol("GET-LINK-PHRASE"), makeSymbol("ACOMP"))))));



    private static final SubLSymbol AUX_VERB_LINK_WORD_GET_ADVERBIAL_COMPLEMENT_METHOD = makeSymbol("AUX-VERB-LINK-WORD-GET-ADVERBIAL-COMPLEMENT-METHOD");

    public static final SubLList $list669 = list(makeString("@return preposition-link-word; this aux verb's preposition complement"), list(makeSymbol("CLET"), list(list(makeSymbol("PCOMP"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("P-P-PATTERN"), makeKeyword("RIGHT")))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("PCOMP"), list(makeSymbol("GET-LINK-PHRASE"), makeSymbol("PCOMP"))))));

    private static final SubLSymbol $P_P_PATTERN = makeKeyword("P-P-PATTERN");

    private static final SubLSymbol AUX_VERB_LINK_WORD_GET_PREPOSITIONAL_COMPLEMENT_METHOD = makeSymbol("AUX-VERB-LINK-WORD-GET-PREPOSITIONAL-COMPLEMENT-METHOD");

    private static final SubLSymbol EQUALITY_P = makeSymbol("EQUALITY-P");

    public static final SubLList $list673 = list(makeString("@return booleanp; t if this verb is being used as a main verb, nil \n   otherwise"), list(makeSymbol("RET"), list(makeSymbol("BOOLEAN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("O-PATTERN")))));

    private static final SubLSymbol AUX_VERB_LINK_WORD_EQUALITY_P_METHOD = makeSymbol("AUX-VERB-LINK-WORD-EQUALITY-P-METHOD");

    public static final SubLList $list675 = list(makeString("@return booleanp; t if this word is the head of a passive clause, nil otherwise"), list(makeSymbol("CLET"), list(list(makeSymbol("MAIN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-VERBAL-COMPLEMENT"))))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("MAIN"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("MAIN"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))), list(makeSymbol("QUOTE"), makeSymbol("PASSIVE-P")))))));

    private static final SubLSymbol AUX_VERB_LINK_WORD_PASSIVE_P_METHOD = makeSymbol("AUX-VERB-LINK-WORD-PASSIVE-P-METHOD");

    public static final SubLList $list677 = list(makeString("@return link-word; the semantic subject of this word"), list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PASSIVE-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("MAIN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-VERBAL-COMPLEMENT"))))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), list(makeSymbol("CAND"), makeSymbol("MAIN"), list(makeSymbol("MAIN-VERB-LINK-WORD-P"), list(makeSymbol("FIM"), makeSymbol("MAIN"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))))), list(makeSymbol("FIM"), makeSymbol("MAIN"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-SUBJECT")))))), list(makeSymbol("CLET"), list(list(makeSymbol("SISTER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SISTER")), ONE_INTEGER))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SISTER"), list(makeSymbol("NOMINAL-LINK-TREE-P"), makeSymbol("SISTER"))), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT"))))))));

    private static final SubLSymbol AUX_VERB_LINK_WORD_GET_SEMANTIC_SUBJECT_METHOD = makeSymbol("AUX-VERB-LINK-WORD-GET-SEMANTIC-SUBJECT-METHOD");

    public static final SubLList $list679 = list(makeString("@return link-word; the direct object of this verb"), list(makeSymbol("CLET"), list(list(makeSymbol("DO"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("O-PATTERN")))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("DO"), list(makeSymbol("GET-LINK-PHRASE"), makeSymbol("DO"))))));

    private static final SubLSymbol AUX_VERB_LINK_WORD_GET_DIRECT_OBJECT_METHOD = makeSymbol("AUX-VERB-LINK-WORD-GET-DIRECT-OBJECT-METHOD");

    public static final SubLList $list681 = list(makeString("@return link-tree-p; this aux verb's semantic direct object"), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECT-OBJECT")))));

    private static final SubLSymbol AUX_VERB_LINK_WORD_GET_SEMANTIC_DIRECT_OBJECT_METHOD = makeSymbol("AUX-VERB-LINK-WORD-GET-SEMANTIC-DIRECT-OBJECT-METHOD");

    private static final SubLList $list683 = list(makeString("@return link-tree-p; this aux verb's indirect object"), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol AUX_VERB_LINK_WORD_GET_INDIRECT_OBJECT_METHOD = makeSymbol("AUX-VERB-LINK-WORD-GET-INDIRECT-OBJECT-METHOD");

    private static final SubLList $list685 = list(makeString("@return link-tree-p; this aux verb's semantic indirect object"), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol AUX_VERB_LINK_WORD_GET_SEMANTIC_INDIRECT_OBJECT_METHOD = makeSymbol("AUX-VERB-LINK-WORD-GET-SEMANTIC-INDIRECT-OBJECT-METHOD");

    private static final SubLList $list687 = list(makeString("@return link-tree-p; this aux verb's oblique object"), list(makeSymbol("CLET"), list(list(makeSymbol("VERBAL-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-VERBAL-COMPLEMENT"))))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("VERBAL-COMPLEMENT"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("VERBAL-COMPLEMENT"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))), list(makeSymbol("QUOTE"), makeSymbol("GET-OBLIQUE-OBJECT")))))));

    private static final SubLSymbol AUX_VERB_LINK_WORD_GET_OBLIQUE_OBJECT_METHOD = makeSymbol("AUX-VERB-LINK-WORD-GET-OBLIQUE-OBJECT-METHOD");

    private static final SubLSymbol MODAL_LINK_WORD = makeSymbol("MODAL-LINK-WORD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_MODAL_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MODAL-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_MODAL_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MODAL-LINK-WORD-INSTANCE");

    private static final SubLSymbol PARTICIPLE_LINK_WORD = makeSymbol("PARTICIPLE-LINK-WORD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PARTICIPLE_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARTICIPLE-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PARTICIPLE_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARTICIPLE-LINK-WORD-INSTANCE");



    private static final SubLList $list696 = list(makeSymbol("NOMINAL-WORD"), makeSymbol("NOMINAL-LINK-TREE"));

    private static final SubLList $list697 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DETERMINER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CARDINAL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-QUANTIFIER"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OVERT-QUANTIFIER"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSSESSOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SPECIFIER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PPS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SINGULAR-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PLURAL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPOSITIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RELATIONAL-NOUN-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-INT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-NUCLEUS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXISTENTIAL-NULL-DETERMINER"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEFINITE-DESCRIPTION-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });

    private static final SubLList $list698 = list(list(makeSymbol("CLET"), list(list(makeSymbol("DET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DETERMINER"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DET"), list(EQUALP, list(makeSymbol("FIM"), makeSymbol("DET"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), makeString("the"))), list(makeSymbol("RET"), T))), list(makeSymbol("CLET"), list(list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("HEAD"), list(makeSymbol("NAME-WORD-P"), makeSymbol("HEAD")), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(makeSymbol("QUOTE"), makeSymbol("SINGULAR-P")))), list(makeSymbol("RET"), T))), list(makeSymbol("CLET"), list(list(makeSymbol("POS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-POSSESSOR"))))), list(makeSymbol("PWHEN"), makeSymbol("POS"), list(makeSymbol("RET"), T))));

    private static final SubLSymbol $sym699$OUTER_CATCH_FOR_NOUN_LINK_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NOUN-LINK-WORD-METHOD");



    private static final SubLString $$$the = makeString("the");





    private static final SubLSymbol NOUN_LINK_WORD_DEFINITE_DESCRIPTION_P_METHOD = makeSymbol("NOUN-LINK-WORD-DEFINITE-DESCRIPTION-P-METHOD");

    private static final SubLList $list705 = list(makeSymbol("&OPTIONAL"), makeSymbol("RENAMINGS-DISJ"));

    public static final SubLList $list706 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CYCLS"), NIL), makeSymbol("INDEPENDENT-MODS"), makeSymbol("DEPENDENT-MODS"), list(makeSymbol("COMP-MOD-CYCLS"), NIL)), list(makeSymbol("CMULTIPLE-VALUE-SETQ"), list(makeSymbol("INDEPENDENT-MODS"), makeSymbol("DEPENDENT-MODS")), list(makeSymbol("PARTITION-MODIFIERS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MODIFIERS"))))), list(makeSymbol("WITHOUT-RECURSIVE-CYCLIFICATION"), list(makeSymbol("PUNLESS"), makeSymbol("RENAMINGS-DISJ"), list(makeSymbol("CSETQ"), makeSymbol("RENAMINGS-DISJ"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-KEYWORD-RENAMINGS")), list(makeSymbol("REQUIRED-KEYWORDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RANKED-LEXES"))))))), list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-COMPLEMENTS")))), list(makeSymbol("CLET"), list(list(makeSymbol("COMP-CYCL"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))))), list(makeSymbol("PWHEN"), makeSymbol("COMP-CYCL"), list(makeSymbol("CPUSH"), makeSymbol("COMP-CYCL"), makeSymbol("COMP-MOD-CYCLS"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("MODIFIER"), makeSymbol("INDEPENDENT-MODS")), list(makeSymbol("CLET"), list(list(makeSymbol("MOD-CYCL"), list(makeSymbol("FIM"), makeSymbol("MODIFIER"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))))), list(makeSymbol("PWHEN"), makeSymbol("MOD-CYCL"), list(makeSymbol("CPUSH"), makeSymbol("MOD-CYCL"), makeSymbol("COMP-MOD-CYCLS"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("RENAMINGS-CONJ"), makeSymbol("RENAMINGS-DISJ")), list(makeSymbol("CLET"), list(list(makeSymbol("CYCLS-CONJ"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RANKED-LEXES")))), list(makeSymbol("CLET"), list(list(makeSymbol("CYCLS-DISJ"), NIL), list(makeSymbol("TERM"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("TERM")))), list(makeSymbol("CDOLIST"), list(makeSymbol("RENAMING"), makeSymbol("RENAMINGS-CONJ")), list(makeSymbol("CLET"), list(list(makeSymbol("MY-CYCLS-WITH-MODS"), list(makeSymbol("LIST"), list(makeSymbol("LIST"), list(makeSymbol("APPLY-LEX-RENAMING"), makeSymbol("SELF"), makeSymbol("RLE"), makeSymbol("RENAMING")))))), list(makeSymbol("CDOLIST"), list(makeSymbol("MOD"), makeSymbol("DEPENDENT-MODS")), list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), makeSymbol("MOD"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-NUCLEUS")), list(makeSymbol("UPDATE-KEYWORD-RENAMINGS"), list(makeSymbol("FIM"), makeSymbol("MOD"), list(makeSymbol("QUOTE"), makeSymbol("GET-KEYWORD-RENAMINGS"))), makeKeyword("REPLACE"), makeSymbol("TERM"))), makeSymbol("MY-CYCLS-WITH-MODS"))), list(makeSymbol("CSETQ"), makeSymbol("CYCLS-DISJ"), list(makeSymbol("APPEND"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), makeSymbol("MY-CYCLS-WITH-MODS"))), makeSymbol("CYCLS-DISJ"))))), list(makeSymbol("PWHEN"), makeSymbol("CYCLS-DISJ"), list(makeSymbol("CSETQ"), makeSymbol("CYCLS-CONJ"), list(makeSymbol("APPEND"), makeSymbol("CYCLS-DISJ"), makeSymbol("CYCLS-CONJ")))))), list(makeSymbol("CSETQ"), makeSymbol("CYCLS"), list(makeSymbol("APPEND"), makeSymbol("CYCLS"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), list(makeSymbol("CONS"), makeSymbol("CYCLS-CONJ"), makeSymbol("COMP-MOD-CYCLS"))))))))), list(makeSymbol("RET"), makeSymbol("CYCLS"))));



    private static final SubLSymbol NOUN_LINK_WORD_CYCLIFY_NUCLEUS_METHOD = makeSymbol("NOUN-LINK-WORD-CYCLIFY-NUCLEUS-METHOD");

    private static final SubLList $list709 = list(list(makeSymbol("WITHOUT-DUPLICATE-CYCLIFICATION"), list(makeSymbol("CLET"), list(list(makeSymbol("QUANTIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-QUANTIFIER")))), makeSymbol("RESULT")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("FIF"), makeSymbol("QUANTIFIER"), list(makeSymbol("FIM"), makeSymbol("QUANTIFIER"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-NUCLEUS"))))), list(makeSymbol("RET"), makeSymbol("RESULT")))));



    private static final SubLSymbol NOUN_LINK_WORD_CYCLIFY_INT_METHOD = makeSymbol("NOUN-LINK-WORD-CYCLIFY-INT-METHOD");

    private static final SubLList $list712 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), list(makeKeyword("NOUN"), makeKeyword("POSSESSOR"), makeKeyword("OBLIQUE-OBJECT"), makeKeyword("MODIFIED"), makeKeyword("POSS-COL"), makeKeyword("NUMBER")))));

    private static final SubLList $list713 = list(list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("DISJUNCTS"), NIL), list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-COMPLEMENTS"))))), list(makeSymbol("QUANTIFIER0"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-OVERT-QUANTIFIER")))), list(makeSymbol("QUANTIFIER"), list(makeSymbol("FWHEN"), makeSymbol("QUANTIFIER0"), list(makeSymbol("FIM"), makeSymbol("QUANTIFIER0"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))))), list(makeSymbol("MODIFIED"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MODIFIEDS")))))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("NOUN"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("NOUN"), makeSymbol("SELF")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("PREP-OBJECT"), makeSymbol("COMPLEMENT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("POSSESSOR"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("POSSESSOR"), makeSymbol("COMPLEMENT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MODIFIED"), list(makeSymbol("MEMBER"), makeKeyword("MODIFIED"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("MODIFIED"), makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("QUANTIFIER"), list(EQL, list(makeSymbol("FIM"), makeSymbol("QUANTIFIER"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("CD")), list(makeSymbol("MEMBER"), makeKeyword("NUMBER"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("NUMBER"), makeSymbol("QUANTIFIER")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("POSS-COL"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CLET"), list(list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD")))), makeSymbol("CYCL"), makeSymbol("COL")), list(makeSymbol("PWHEN"), makeSymbol("HEAD"), list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-LEXES")))), list(makeSymbol("CSETQ"), makeSymbol("CYCL"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("SEMTRANS"))), list(makeSymbol("CSETQ"), makeSymbol("COL"), list(makeSymbol("MAIN-COLLECTION"), makeSymbol("CYCL"), makeKeyword("NOUN"))), list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeKeyword("POSS-COL"), makeSymbol("COL")), makeSymbol("DISJUNCTS"))), list(makeSymbol("PUNLESS"), makeSymbol("DISJUNCTS"), list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeKeyword("POSS-COL"), reader_make_constant_shell(makeString("Thing"))), makeSymbol("DISJUNCTS")))))), list(makeSymbol("RET"), list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), makeSymbol("DISJUNCTS"))) }));

    private static final SubLList $list714 = list(makeKeyword("NOUN"), makeKeyword("POSSESSOR"), makeKeyword("OBLIQUE-OBJECT"), makeKeyword("MODIFIED"), makeKeyword("POSS-COL"), makeKeyword("NUMBER"));













    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLSymbol NOUN_LINK_WORD_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol("NOUN-LINK-WORD-GET-KEYWORD-RENAMINGS-METHOD");



    private static final SubLList $list724 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RANKED-LEXES")))), list(makeSymbol("CLET"), list(list(makeSymbol("DENOT"), list(makeSymbol("RENAME-VARIABLES"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("SEMTRANS")), list(makeSymbol("FRAME-RENAMING"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("FRAME"))))), list(makeSymbol("KEYWORDS"), list(makeSymbol("FORMULA-KEYWORDS"), makeSymbol("DENOT")))), list(makeSymbol("CDOLIST"), list(makeSymbol("KEYWORD"), list(makeSymbol("QUOTE"), list(makeKeyword("POSSESSOR"), makeKeyword("POSS-COL")))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeSymbol("KEYWORD"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQ)), list(makeSymbol("RET"), T))))));

    private static final SubLSymbol NOUN_LINK_WORD_RELATIONAL_NOUN_P_METHOD = makeSymbol("NOUN-LINK-WORD-RELATIONAL-NOUN-P-METHOD");

    public static final SubLList $list726 = list(list(makeSymbol("CLET"), list(list(makeSymbol("QUANTIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-OVERT-QUANTIFIER"))))), list(makeSymbol("PCOND"), list(makeSymbol("QUANTIFIER"), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), list(makeSymbol("CNOT"), list(EQUALP, list(makeSymbol("FIM"), makeSymbol("QUANTIFIER"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), makeString("the"))), makeSymbol("QUANTIFIER")))), list(list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-POSSESSOR")))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("SINGULAR-P")))), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-EXISTENTIAL-NULL-DETERMINER"))))), list(list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-POSSESSOR")))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PLURAL-P")))), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-EXISTENTIAL-NULL-DETERMINER"))))), list(list(makeSymbol("CNOT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-POSSESSOR")))), list(makeSymbol("RET"), NIL)))));





    private static final SubLSymbol NOUN_LINK_WORD_GET_QUANTIFIER_METHOD = makeSymbol("NOUN-LINK-WORD-GET-QUANTIFIER-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NOUN_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NOUN-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NOUN_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NOUN-LINK-WORD-INSTANCE");

    private static final SubLList $list732 = list(makeString("@return listp; the complements of this noun"), list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("RELATIONAL-NOUN-P"))), list(makeSymbol("CLET"), list(makeSymbol("COMPLEMENT"), makeSymbol("POSSESSOR"), makeSymbol("PREPOSITION")), list(makeSymbol("CSETQ"), makeSymbol("POSSESSOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-POSSESSOR")))), list(makeSymbol("PWHEN"), makeSymbol("POSSESSOR"), list(makeSymbol("CSETQ"), makeSymbol("COMPLEMENT"), makeSymbol("POSSESSOR"))), list(makeSymbol("PUNLESS"), makeSymbol("COMPLEMENT"), list(makeSymbol("CLET"), list(list(makeSymbol("PP"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-PPS")))))), list(makeSymbol("PWHEN"), makeSymbol("PP"), list(makeSymbol("CSETQ"), makeSymbol("PREPOSITION"), list(makeSymbol("FIM"), makeSymbol("PP"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD")))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("PREPOSITION"), list(EQUALP, list(makeSymbol("FIM"), makeSymbol("PREPOSITION"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), makeString("of"))), list(makeSymbol("CSETQ"), makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("PREPOSITION"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBLIQUE-OBJECT")))))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("COMPLEMENT"), list(makeSymbol("LIST"), makeSymbol("COMPLEMENT")))))));

    private static final SubLSymbol NOUN_LINK_WORD_GET_COMPLEMENTS_METHOD = makeSymbol("NOUN-LINK-WORD-GET-COMPLEMENTS-METHOD");

    private static final SubLList $list734 = list(makeString("@return listp; the list of words this noun modifies"), list(makeSymbol("RET"), list(makeSymbol("APPEND"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("MX-PATTERN"), makeKeyword("LEFT")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("GN-PATTERN"), makeKeyword("RIGHT")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("AN-PATTERN"), makeKeyword("RIGHT")))));







    private static final SubLSymbol NOUN_LINK_WORD_GET_MODIFIEDS_METHOD = makeSymbol("NOUN-LINK-WORD-GET-MODIFIEDS-METHOD");

    private static final SubLList $list739 = list(makeString("@return link-word-p; the determiner of this noun"), list(makeSymbol("CLET"), list(list(makeSymbol("DET"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("D-S-PATTERN"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DET"), list(makeSymbol("CNOT"), list(makeSymbol("MEMBER?"), list(makeSymbol("FIM"), makeSymbol("DET"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), list(makeSymbol("QUOTE"), list(makeKeyword("PRP$"), makeKeyword("POS")))))), list(makeSymbol("RET"), makeSymbol("DET")))));

    private static final SubLSymbol $D_S_PATTERN = makeKeyword("D-S-PATTERN");

    public static final SubLList $list741 = list(makeKeyword("PRP$"), makeKeyword("POS"));

    private static final SubLSymbol NOUN_LINK_WORD_GET_DETERMINER_METHOD = makeSymbol("NOUN-LINK-WORD-GET-DETERMINER-METHOD");

    private static final SubLSymbol GET_CARDINAL = makeSymbol("GET-CARDINAL");

    private static final SubLList $list744 = list(makeString("@return link-word-p; the cardinal of this noun"), list(makeSymbol("RET"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("D-MC-PATTERN")))));

    private static final SubLSymbol $D_MC_PATTERN = makeKeyword("D-MC-PATTERN");

    private static final SubLSymbol NOUN_LINK_WORD_GET_CARDINAL_METHOD = makeSymbol("NOUN-LINK-WORD-GET-CARDINAL-METHOD");

    public static final SubLList $list747 = list(makeString("@return link-word-p; the quantifier of this noun"), list(makeSymbol("CLET"), list(list(makeSymbol("QUANT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DETERMINER"))))), list(makeSymbol("PWHEN"), makeSymbol("QUANT"), list(makeSymbol("RET"), makeSymbol("QUANT"))), list(makeSymbol("CSETQ"), makeSymbol("QUANT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CARDINAL")))), list(makeSymbol("PWHEN"), makeSymbol("QUANT"), list(makeSymbol("RET"), makeSymbol("QUANT")))));

    private static final SubLSymbol NOUN_LINK_WORD_GET_OVERT_QUANTIFIER_METHOD = makeSymbol("NOUN-LINK-WORD-GET-OVERT-QUANTIFIER-METHOD");

    public static final SubLList $list749 = list(makeString("@return link-word-p; the possessor of this noun"), list(makeSymbol("CLET"), list(list(makeSymbol("DET"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("D-PATTERN"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DET"), list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("DET"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), list(makeSymbol("QUOTE"), list(makeKeyword("PRP$"), makeKeyword("POS"))))), list(makeSymbol("RET"), makeSymbol("DET")))));



    private static final SubLSymbol NOUN_LINK_WORD_GET_POSSESSOR_METHOD = makeSymbol("NOUN-LINK-WORD-GET-POSSESSOR-METHOD");



    private static final SubLList $list753 = list(makeString("@return quantifier-link-word-p; the quantifier of this noun, or nil if there is none."), list(makeSymbol("CLET"), list(list(makeSymbol("SPEC"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("D-PATTERN")))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("SPEC"), list(makeSymbol("GET-LINK-PHRASE"), makeSymbol("SPEC"))))));

    private static final SubLSymbol NOUN_LINK_WORD_GET_SPECIFIER_METHOD = makeSymbol("NOUN-LINK-WORD-GET-SPECIFIER-METHOD");

    private static final SubLList $list755 = list(makeString("@return listp; this noun's PPs"), list(makeSymbol("RET"), list(makeSymbol("GET-LINK-PHRASES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("M-P-PATTERN"), makeKeyword("RIGHT")))));

    private static final SubLSymbol $M_P_PATTERN = makeKeyword("M-P-PATTERN");

    private static final SubLSymbol NOUN_LINK_WORD_GET_PPS_METHOD = makeSymbol("NOUN-LINK-WORD-GET-PPS-METHOD");

    private static final SubLList $list758 = list(makeString("@return link-word-p; an empty (null) determiner for this word"), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("LEX"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY")))), list(makeSymbol("LINK"), list(makeSymbol("NEW-LINK"), makeString("D"))), makeSymbol("DET")), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), makeString("")), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("CYC-POS"), reader_make_constant_shell(makeString("Determiner"))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("thereExists")), makeKeyword("NOUN"), list(reader_make_constant_shell(makeString("and")), makeKeyword("RESTR"), makeKeyword("SCOPE"))))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell(makeString("DeterminerFrame"))), list(makeSymbol("CSETQ"), makeSymbol("DET"), list(makeSymbol("NEW-LINK-WORD"), makeSymbol("LINKAGE"), makeString(""), ZERO_INTEGER, NIL, list(makeSymbol("LIST"), makeSymbol("LINK")), makeKeyword("DT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTEXT"))))), list(makeSymbol("SET-SLOT"), makeSymbol("DET"), list(makeSymbol("QUOTE"), makeSymbol("LEXES")), list(makeSymbol("NEW-EVEN-LEX-ENTRY-DISTRIBUTION"), list(makeSymbol("LIST"), makeSymbol("LEX")))), list(makeSymbol("CSETF"), list(makeSymbol("LINK-RIGHT-WORD"), makeSymbol("LINK")), makeSymbol("SELF")), list(makeSymbol("CSETF"), list(makeSymbol("LINK-LEFT-WORD"), makeSymbol("LINK")), makeSymbol("DET")), list(makeSymbol("CPUSH"), makeSymbol("LINK"), makeSymbol("LEFT-LINKS")), list(makeSymbol("RET"), makeSymbol("DET")) }));

    private static final SubLSymbol $sym759$OUTER_CATCH_FOR_NOUN_LINK_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NOUN-LINK-WORD-METHOD");



    private static final SubLString $$$D = makeString("D");



    private static final SubLString $str763$ = makeString("");



    private static final SubLObject $$Determiner = reader_make_constant_shell(makeString("Determiner"));

    private static final SubLList $list766 = list(reader_make_constant_shell(makeString("thereExists")), makeKeyword("NOUN"), list(reader_make_constant_shell(makeString("and")), makeKeyword("RESTR"), makeKeyword("SCOPE")));

    private static final SubLObject $$DeterminerFrame = reader_make_constant_shell(makeString("DeterminerFrame"));



    private static final SubLSymbol NOUN_LINK_WORD_GET_EXISTENTIAL_NULL_DETERMINER_METHOD = makeSymbol("NOUN-LINK-WORD-GET-EXISTENTIAL-NULL-DETERMINER-METHOD");

    public static final SubLList $list770 = list(makeString("@return boolean; t if this noun is singular, nil otherwise"), list(makeSymbol("RET"), list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), list(makeSymbol("QUOTE"), list(makeKeyword("NN"), makeKeyword("NNP"), makeKeyword("WP"))))));

    private static final SubLList $list771 = list(makeKeyword("NN"), makeKeyword("NNP"), makeKeyword("WP"));

    private static final SubLSymbol NOUN_LINK_WORD_SINGULAR_P_METHOD = makeSymbol("NOUN-LINK-WORD-SINGULAR-P-METHOD");

    private static final SubLList $list773 = list(makeString("@return boolean; t if this noun is plural, nil otherwise"), list(makeSymbol("RET"), list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), list(makeSymbol("QUOTE"), list(makeKeyword("NNS"), makeKeyword("NNPS"))))));

    private static final SubLList $list774 = list(makeKeyword("NNS"), makeKeyword("NNPS"));

    private static final SubLSymbol NOUN_LINK_WORD_PLURAL_P_METHOD = makeSymbol("NOUN-LINK-WORD-PLURAL-P-METHOD");

    public static final SubLList $list776 = list(makeString("@return boolean; t if this noun is an appositive, nil otherwise"), list(makeSymbol("RET"), list(makeSymbol("BOOLEAN"), list(makeSymbol("COR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("MX-PATTERN"), makeKeyword("LEFT")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("GN-PATTERN"), makeKeyword("RIGHT"))))));

    private static final SubLSymbol NOUN_LINK_WORD_APPOSITIVE_P_METHOD = makeSymbol("NOUN-LINK-WORD-APPOSITIVE-P-METHOD");



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_COMMON_NOUN_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COMMON-NOUN-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_COMMON_NOUN_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COMMON-NOUN-LINK-WORD-INSTANCE");



    private static final SubLList $list782 = list(makeSymbol("NAME-WORD"));

    private static final SubLList $list783 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-QUANTIFIER"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")));

    private static final SubLList $list784 = list(list(makeSymbol("CLET"), list(list(makeSymbol("QUANTIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-OVERT-QUANTIFIER"))))), list(makeSymbol("RET"), list(makeSymbol("FIF"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), makeSymbol("QUANTIFIER")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PLURAL-P")))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-EXISTENTIAL-NULL-DETERMINER"))), makeSymbol("QUANTIFIER")))));

    private static final SubLSymbol PROPER_NOUN_LINK_WORD_GET_QUANTIFIER_METHOD = makeSymbol("PROPER-NOUN-LINK-WORD-GET-QUANTIFIER-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PROPER_NOUN_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PROPER-NOUN-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PROPER_NOUN_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PROPER-NOUN-LINK-WORD-INSTANCE");

    private static final SubLSymbol GERUND_LINK_WORD = makeSymbol("GERUND-LINK-WORD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GERUND_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GERUND-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GERUND_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GERUND-LINK-WORD-INSTANCE");

    private static final SubLSymbol PRONOUN_LINK_WORD = makeSymbol("PRONOUN-LINK-WORD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PRONOUN_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PRONOUN-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PRONOUN_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PRONOUN-LINK-WORD-INSTANCE");

    private static final SubLSymbol W_PRONOUN_LINK_WORD = makeSymbol("W-PRONOUN-LINK-WORD");

    private static final SubLList $list795 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REFS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ANTECEDENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPOSITIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-QUANTIFIER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_W_PRONOUN_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-W-PRONOUN-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_W_PRONOUN_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-W-PRONOUN-LINK-WORD-INSTANCE");

    public static final SubLList $list798 = list(makeString("@return listp; the unique referents of this phrase"), list(makeSymbol("CLET"), list(list(makeSymbol("ANTECEDENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-ANTECEDENT"))))), list(makeSymbol("RET"), list(makeSymbol("FIF"), makeSymbol("ANTECEDENT"), list(makeSymbol("FIM"), makeSymbol("ANTECEDENT"), list(makeSymbol("QUOTE"), makeSymbol("GET-REFS"))), list(makeSymbol("LIST"), makeSymbol("REF"))))));

    private static final SubLSymbol $sym799$OUTER_CATCH_FOR_W_PRONOUN_LINK_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-W-PRONOUN-LINK-WORD-METHOD");



    private static final SubLSymbol W_PRONOUN_LINK_WORD_GET_REFS_METHOD = makeSymbol("W-PRONOUN-LINK-WORD-GET-REFS-METHOD");

    public static final SubLList $list802 = list(makeString("@return parse-tree-p; the tree that serves as an antecedent to this wh word"), list(makeSymbol("CLET"), list(list(makeSymbol("ANTECEDENTS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("MX-PATTERN"), makeKeyword("LEFT")))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("ANTECEDENTS"), list(makeSymbol("GET-LINK-PHRASE"), makeSymbol("ANTECEDENTS"))))));

    private static final SubLSymbol W_PRONOUN_LINK_WORD_GET_ANTECEDENT_METHOD = makeSymbol("W-PRONOUN-LINK-WORD-GET-ANTECEDENT-METHOD");

    private static final SubLList $list804 = list(makeString("@return boolean; t if this noun is an appositive, nil otherwise"), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol W_PRONOUN_LINK_WORD_APPOSITIVE_P_METHOD = makeSymbol("W-PRONOUN-LINK-WORD-APPOSITIVE-P-METHOD");

    private static final SubLList $list806 = list(makeString("@return word-tree-p; the quantifier of this name, or nil if there is none"), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol W_PRONOUN_LINK_WORD_GET_QUANTIFIER_METHOD = makeSymbol("W-PRONOUN-LINK-WORD-GET-QUANTIFIER-METHOD");

    private static final SubLList $list808 = list(makeString("@return noun-link-word-p; the noun modivied by this relative pronoun"), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("R-PATTERN"), makeKeyword("LEFT"))));



    private static final SubLSymbol W_PRONOUN_LINK_WORD_GET_MODIFIEDS_METHOD = makeSymbol("W-PRONOUN-LINK-WORD-GET-MODIFIEDS-METHOD");

    private static final SubLSymbol REL_PRONOUN_LINK_WORD = makeSymbol("REL-PRONOUN-LINK-WORD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_REL_PRONOUN_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-REL-PRONOUN-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_REL_PRONOUN_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-REL-PRONOUN-LINK-WORD-INSTANCE");

    private static final SubLSymbol PERSONAL_PRONOUN_LINK_WORD = makeSymbol("PERSONAL-PRONOUN-LINK-WORD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PERSONAL_PRONOUN_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PERSONAL-PRONOUN-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PERSONAL_PRONOUN_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PERSONAL-PRONOUN-LINK-WORD-INSTANCE");



    public static final SubLList $list818 = list(makeSymbol("ADJECTIVAL-WORD"));

    private static final SubLList $list819 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PPS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")));

    private static final SubLList $list820 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), list(makeKeyword("NOUN"), makeKeyword("ACTION"), makeKeyword("REPLACE"), makeKeyword("OBLIQUE-OBJECT")))));

    private static final SubLList $list821 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("MODIFIED"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MODIFIEDS"))))), list(makeSymbol("OBL-OBJ"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBLIQUE-OBJECT")))), list(makeSymbol("OBL-OBJ-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("OBL-OBJ"), list(makeSymbol("FIM"), makeSymbol("OBL-OBJ"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD")))))), list(makeSymbol("PWHEN"), makeSymbol("MODIFIED"), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("NOUN"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("NOUN"), makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("ACTION"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("ACTION"), makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("REPLACE"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), list(makeSymbol("CONS"), makeKeyword("REPLACE"), NIL)), makeSymbol("CONJUNCTS")))), list(makeSymbol("PWHEN"), makeSymbol("OBL-OBJ-HEAD"), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("PREP-OBJECT"), makeSymbol("OBL-OBJ-HEAD")), makeSymbol("CONJUNCTS")))), list(makeSymbol("RET"), list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), NIL))));

    public static final SubLList $list822 = list(makeKeyword("NOUN"), makeKeyword("ACTION"), makeKeyword("REPLACE"), makeKeyword("OBLIQUE-OBJECT"));

    private static final SubLSymbol ADJECTIVE_LINK_WORD_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol("ADJECTIVE-LINK-WORD-GET-KEYWORD-RENAMINGS-METHOD");

    private static final SubLList $list824 = list(list(makeSymbol("CLET"), list(list(makeSymbol("MODIFIEDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MODIFIEDS")))), list(makeSymbol("OBL-OBJ"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBLIQUE-OBJECT"))))), list(makeSymbol("RET"), list(makeSymbol("APPEND"), makeSymbol("MODIFIEDS"), list(makeSymbol("FWHEN"), makeSymbol("OBL-OBJ"), list(makeSymbol("LIST"), makeSymbol("OBL-OBJ")))))));

    private static final SubLSymbol ADJECTIVE_LINK_WORD_GET_COMPLEMENTS_METHOD = makeSymbol("ADJECTIVE-LINK-WORD-GET-COMPLEMENTS-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ADJECTIVE_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ADJECTIVE-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ADJECTIVE_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ADJECTIVE-LINK-WORD-INSTANCE");

    public static final SubLList $list828 = list(makeString("@return listp; the list of all words (generally nouns) that are modified by \n   this adjective."), list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("CSOME"), list(makeSymbol("PATTERN"), list(makeSymbol("QUOTE"), list(list(makeKeyword("AA-PATTERN"), makeKeyword("D-PATTERN")), list(makeKeyword("A-PATTERN")), list(makeKeyword("L-PATTERN"), makeKeyword("D-PATTERN")), list(makeKeyword("P-PATTERN"), makeKeyword("S-PATTERN")), list(makeKeyword("TA-PATTERN")), list(makeKeyword("M-PATTERN")))), makeSymbol("RESULT")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RELATED")), makeSymbol("PATTERN")))), list(makeSymbol("RET"), makeSymbol("RESULT"))));

    public static final SubLList $list829 = list(list(makeKeyword("AA-PATTERN"), makeKeyword("D-PATTERN")), list(makeKeyword("A-PATTERN")), list(makeKeyword("L-PATTERN"), makeKeyword("D-PATTERN")), list(makeKeyword("P-PATTERN"), makeKeyword("S-PATTERN")), list(makeKeyword("TA-PATTERN")), list(makeKeyword("M-PATTERN")));

    private static final SubLSymbol ADJECTIVE_LINK_WORD_GET_MODIFIEDS_METHOD = makeSymbol("ADJECTIVE-LINK-WORD-GET-MODIFIEDS-METHOD");

    public static final SubLList $list831 = list(makeString("@return listp; this adjective's PPs"), list(makeSymbol("RET"), list(makeSymbol("GET-LINK-PHRASES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("MV-P-PATTERN")))));

    private static final SubLSymbol ADJECTIVE_LINK_WORD_GET_PPS_METHOD = makeSymbol("ADJECTIVE-LINK-WORD-GET-PPS-METHOD");



    private static final SubLList $list834 = list(makeSymbol("ADVERBIAL-WORD"));

    private static final SubLList $list835 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")));

    public static final SubLList $list836 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), list(makeKeyword("ACTION"), makeKeyword("SUBJECT"), makeKeyword("OBJECT")))));

    public static final SubLList $list837 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("MODIFIED"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MODIFIEDS"))))), list(makeSymbol("SUBJECT"), list(makeSymbol("FWHEN"), list(makeSymbol("VERBAL-WORD-P"), makeSymbol("MODIFIED")), list(makeSymbol("FIM"), makeSymbol("MODIFIED"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT"))))), list(makeSymbol("OBJECT"), list(makeSymbol("FWHEN"), list(makeSymbol("VERBAL-WORD-P"), makeSymbol("MODIFIED")), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("MODIFIED"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBJECTS"))))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MODIFIED"), list(makeSymbol("MEMBER"), makeKeyword("ACTION"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("ACTION"), makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SUBJECT"), list(makeSymbol("MEMBER"), makeKeyword("SUBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("SUBJECT"), makeSymbol("SUBJECT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("OBJECT"), list(makeSymbol("MEMBER"), makeKeyword("OBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("OBJECT"), makeSymbol("OBJECT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("RET"), list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), NIL))));

    private static final SubLList $list838 = list(makeKeyword("ACTION"), makeKeyword("SUBJECT"), makeKeyword("OBJECT"));

    private static final SubLSymbol ADVERB_LINK_WORD_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol("ADVERB-LINK-WORD-GET-KEYWORD-RENAMINGS-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ADVERB_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ADVERB-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ADVERB_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ADVERB-LINK-WORD-INSTANCE");

    private static final SubLList $list842 = list(makeString("@return listp; the list of all words that are modified by this adverb."), list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("CSOME"), list(makeSymbol("PATTERN"), list(makeSymbol("QUOTE"), list(list(makeKeyword("EZ-PATTERN"), makeKeyword("E-PATTERN")), list(makeKeyword("MV-PATTERN")), list(makeKeyword("E-PATTERN")))), makeSymbol("RESULT")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RELATED")), makeSymbol("PATTERN")))), list(makeSymbol("PUNLESS"), makeSymbol("RESULT"), list(makeSymbol("CDOLIST"), list(makeSymbol("AUX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("N-PATTERN"))), list(makeSymbol("PWHEN"), list(makeSymbol("AUX-VERB-LINK-WORD-P"), makeSymbol("AUX")), list(makeSymbol("CLET"), list(list(makeSymbol("VERBAL-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("AUX"), list(makeSymbol("QUOTE"), makeSymbol("GET-VERBAL-COMPLEMENT"))))), list(makeSymbol("PWHEN"), makeSymbol("VERBAL-COMPLEMENT"), list(makeSymbol("CLET"), list(list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("VERBAL-COMPLEMENT"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))))), list(makeSymbol("PWHEN"), makeSymbol("HEAD"), list(makeSymbol("CPUSH"), makeSymbol("HEAD"), makeSymbol("RESULT"))))))))), list(makeSymbol("RET"), makeSymbol("RESULT"))));

    public static final SubLList $list843 = list(list(makeKeyword("EZ-PATTERN"), makeKeyword("E-PATTERN")), list(makeKeyword("MV-PATTERN")), list(makeKeyword("E-PATTERN")));



    private static final SubLSymbol ADVERB_LINK_WORD_GET_MODIFIEDS_METHOD = makeSymbol("ADVERB-LINK-WORD-GET-MODIFIEDS-METHOD");

    public static final SubLList $list846 = list(makeString("@return listp; the complements of this adverb"), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MODIFIEDS")))));

    private static final SubLSymbol ADVERB_LINK_WORD_GET_COMPLEMENTS_METHOD = makeSymbol("ADVERB-LINK-WORD-GET-COMPLEMENTS-METHOD");

    private static final SubLSymbol W_ADVERB_LINK_WORD = makeSymbol("W-ADVERB-LINK-WORD");

    private static final SubLList $list849 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_W_ADVERB_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-W-ADVERB-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_W_ADVERB_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-W-ADVERB-LINK-WORD-INSTANCE");

    public static final SubLList $list852 = list(makeString("@return listp; the list of all words that are modified by this adverb."), list(makeSymbol("CLET"), list(list(makeSymbol("VERB"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("Q-PATTERN"), makeKeyword("RIGHT")))), list(makeSymbol("MODIFIEDS"), list(makeSymbol("FWHEN"), makeSymbol("VERB"), list(makeSymbol("FIM"), makeSymbol("VERB"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-HEADS")))))), list(makeSymbol("PUNLESS"), makeSymbol("MODIFIEDS"), list(makeSymbol("CLET"), list(list(makeSymbol("COPULA"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("PF-PATTERN")))), list(makeSymbol("SUBJECT"), list(makeSymbol("FWHEN"), list(makeSymbol("VERB-LINK-WORD-P"), makeSymbol("COPULA")), list(makeSymbol("FIM"), makeSymbol("COPULA"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT")))))), list(makeSymbol("PWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("CPUSH"), makeSymbol("SUBJECT"), makeSymbol("MODIFIEDS"))))), list(makeSymbol("RET"), makeSymbol("MODIFIEDS"))));



    private static final SubLSymbol W_ADVERB_LINK_WORD_GET_MODIFIEDS_METHOD = makeSymbol("W-ADVERB-LINK-WORD-GET-MODIFIEDS-METHOD");



    private static final SubLList $list856 = list(makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD"), makeSymbol("PREPOSITIONAL-LINK-TREE"));

    private static final SubLList $list857 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OBLIQUE-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VERBAL-COMPLEMENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")));

    private static final SubLList $list858 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), list(makeKeyword("NOUN"), makeKeyword("ACTION"), makeKeyword("OBJECT"), makeKeyword("CLAUSE")))));

    public static final SubLList $list859 = list(list(makeSymbol("PUNLESS"), list(EQUALP, list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), makeString("that")), list(makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("MODIFIED"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MODIFIEDS"))))), list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBLIQUE-OBJECT")))), list(makeSymbol("CLAUSE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-VERBAL-COMPLEMENT"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MODIFIED"), list(makeSymbol("MEMBER"), makeKeyword("NOUN"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("NOMINAL-WORD-P"), makeSymbol("MODIFIED"))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("NOUN"), makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MODIFIED"), list(makeSymbol("MEMBER"), makeKeyword("ACTION"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("VERBAL-WORD-P"), makeSymbol("MODIFIED"))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("ACTION"), makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("OBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("OBJECT"), makeSymbol("COMPLEMENT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("CLAUSE"), list(makeSymbol("MEMBER"), makeKeyword("CLAUSE"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("CLAUSE"), makeSymbol("CLAUSE")), makeSymbol("CONJUNCTS"))), list(makeSymbol("RET"), list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), NIL)))));

    private static final SubLList $list860 = list(makeKeyword("NOUN"), makeKeyword("ACTION"), makeKeyword("OBJECT"), makeKeyword("CLAUSE"));

    private static final SubLString $$$that = makeString("that");

    private static final SubLSymbol PREPOSITION_LINK_WORD_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol("PREPOSITION-LINK-WORD-GET-KEYWORD-RENAMINGS-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PREPOSITION_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PREPOSITION-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PREPOSITION_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PREPOSITION-LINK-WORD-INSTANCE");

    private static final SubLList $list865 = list(makeString("@return noun-link-word-p; the object noun of this preposition"), list(makeSymbol("CLET"), list(list(makeSymbol("OBL-OBJ"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("J-PATTERN")))), list(makeSymbol("PUNLESS"), makeSymbol("OBL-OBJ"), list(makeSymbol("CSETQ"), makeSymbol("OBL-OBJ"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("ON-PATTERN")))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("OBL-OBJ"), list(makeSymbol("GET-LINK-PHRASE"), makeSymbol("OBL-OBJ"))))));





    private static final SubLSymbol PREPOSITION_LINK_WORD_GET_OBLIQUE_OBJECT_METHOD = makeSymbol("PREPOSITION-LINK-WORD-GET-OBLIQUE-OBJECT-METHOD");

    private static final SubLList $list869 = list(makeString("@return verbal-tree-p; the verbal complement of this preposition"), list(makeSymbol("CLET"), list(list(makeSymbol("EMBEDDED-SUBJECT"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("C-PATTERN"), makeKeyword("RIGHT")))), list(makeSymbol("EMBEDDED-VERB"), list(makeSymbol("FWHEN"), makeSymbol("EMBEDDED-SUBJECT"), list(makeSymbol("FIM"), makeSymbol("EMBEDDED-SUBJECT"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("S-PATTERN"), makeKeyword("RIGHT"))))), list(makeSymbol("PWHEN"), makeSymbol("EMBEDDED-VERB"), list(makeSymbol("RET"), list(makeSymbol("GET-LINK-PHRASE"), makeSymbol("EMBEDDED-VERB"))))));



    private static final SubLSymbol PREPOSITION_LINK_WORD_GET_VERBAL_COMPLEMENT_METHOD = makeSymbol("PREPOSITION-LINK-WORD-GET-VERBAL-COMPLEMENT-METHOD");

    public static final SubLList $list872 = list(makeString("@return listp; the list of words modified by this preposition"), list(makeSymbol("CLET"), list(list(makeSymbol("COPULA"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("P-PATTERN"), makeKeyword("LEFT"))), list(makeSymbol("SUBJECT"), list(makeSymbol("FWHEN"), list(makeSymbol("AUX-VERB-LINK-WORD-P"), list(makeSymbol("FIRST"), makeSymbol("COPULA"))), list(makeSymbol("FIM"), list(makeSymbol("FIRST"), makeSymbol("COPULA")), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT"))))), list(makeSymbol("SUBJ-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SUBJECT"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))))), list(makeSymbol("CANDIDATES"), list(makeSymbol("APPEND"), list(makeSymbol("FWHEN"), makeSymbol("SUBJ-HEAD"), list(makeSymbol("LIST"), makeSymbol("SUBJ-HEAD"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("MV-PATTERN")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("M-PATTERN")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RELATED")), list(makeSymbol("QUOTE"), list(makeKeyword("Q-D-PATTERN"), makeKeyword("PP-PATTERN")))))), list(makeSymbol("COMPLEMENTS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("CANDIDATE"), makeSymbol("CANDIDATES")), list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIM-NR"), makeSymbol("CANDIDATE"), list(makeSymbol("QUOTE"), makeSymbol("GET-COMPLEMENTS")))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBLIQUE-OBJECT")))), list(makeSymbol("SET-SLOT"), makeSymbol("CANDIDATE"), list(makeSymbol("QUOTE"), makeSymbol("MODIFIERS")), list(makeSymbol("REMOVE"), makeSymbol("SELF"), list(makeSymbol("GET-SLOT"), makeSymbol("CANDIDATE"), list(makeSymbol("QUOTE"), makeSymbol("MODIFIERS"))), list(makeSymbol("QUOTE"), EQ))), list(makeSymbol("CPUSH"), makeSymbol("CANDIDATE"), makeSymbol("COMPLEMENTS"))))), list(makeSymbol("RET"), list(makeSymbol("SET-DIFFERENCE"), makeSymbol("CANDIDATES"), makeSymbol("COMPLEMENTS")))));

    private static final SubLSymbol $sym873$OUTER_CATCH_FOR_PREPOSITION_LINK_WORD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PREPOSITION-LINK-WORD-METHOD");





    public static final SubLList $list876 = list(makeKeyword("Q-D-PATTERN"), makeKeyword("PP-PATTERN"));

    private static final SubLSymbol PREPOSITION_LINK_WORD_GET_MODIFIEDS_METHOD = makeSymbol("PREPOSITION-LINK-WORD-GET-MODIFIEDS-METHOD");

    public static final SubLList $list878 = list(makeString("@return listp; the complements of this preposition"), list(makeSymbol("CLET"), list(list(makeSymbol("MODIFIEDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MODIFIEDS")))), list(makeSymbol("OBJ"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBLIQUE-OBJECT")))), list(makeSymbol("CLAUSE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-VERBAL-COMPLEMENT"))))), list(makeSymbol("RET"), list(makeSymbol("APPEND"), makeSymbol("MODIFIEDS"), list(makeSymbol("FWHEN"), makeSymbol("OBJ"), list(makeSymbol("LIST"), makeSymbol("OBJ"))), list(makeSymbol("FWHEN"), makeSymbol("CLAUSE"), list(makeSymbol("LIST"), makeSymbol("CLAUSE")))))));

    private static final SubLSymbol PREPOSITION_LINK_WORD_GET_COMPLEMENTS_METHOD = makeSymbol("PREPOSITION-LINK-WORD-GET-COMPLEMENTS-METHOD");



    private static final SubLList $list881 = list(makeSymbol("QUANTIFIER-WORD"));

    private static final SubLList $list882 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-QUANTIFIED"), NIL, makeKeyword("PUBLIC")));

    private static final SubLList $list883 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), list(makeKeyword("NOUN"), makeKeyword("RESTR"), makeKeyword("SCOPE")))));

    public static final SubLList $list884 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("DISJUNCTS"), NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("NOUN"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("NOUN"), makeSymbol("SELF")), makeSymbol("CONJUNCTS"))), list(makeSymbol("RET"), list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), makeSymbol("DISJUNCTS")))));

    private static final SubLList $list885 = list(makeKeyword("NOUN"), makeKeyword("RESTR"), makeKeyword("SCOPE"));

    private static final SubLSymbol QUANTIFIER_LINK_WORD_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol("QUANTIFIER-LINK-WORD-GET-KEYWORD-RENAMINGS-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_QUANTIFIER_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUANTIFIER-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_QUANTIFIER_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUANTIFIER-LINK-WORD-INSTANCE");



    private static final SubLList $list890 = list(makeString("@return noun-link-word; the word that restricts the variable that this determiner quantifies"), list(makeSymbol("RET"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("D-PATTERN")))));

    private static final SubLSymbol QUANTIFIER_LINK_WORD_GET_QUANTIFIED_METHOD = makeSymbol("QUANTIFIER-LINK-WORD-GET-QUANTIFIED-METHOD");

    private static final SubLSymbol DETERMINER_LINK_WORD = makeSymbol("DETERMINER-LINK-WORD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DETERMINER_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DETERMINER-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DETERMINER_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DETERMINER-LINK-WORD-INSTANCE");

    private static final SubLSymbol DEFINITE_DETERMINER_LINK_WORD = makeSymbol("DEFINITE-DETERMINER-LINK-WORD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DEFINITE_DETERMINER_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DEFINITE-DETERMINER-LINK-WORD-CLASS");

    private static final SubLSymbol $sym897$SUBLOOP_RESERVED_INITIALIZE_DEFINITE_DETERMINER_LINK_WORD_INSTANC = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DEFINITE-DETERMINER-LINK-WORD-INSTANCE");

    private static final SubLSymbol W_DETERMINER_LINK_WORD = makeSymbol("W-DETERMINER-LINK-WORD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_W_DETERMINER_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-W-DETERMINER-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_W_DETERMINER_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-W-DETERMINER-LINK-WORD-INSTANCE");

    private static final SubLSymbol PREDETERMINER_LINK_WORD = makeSymbol("PREDETERMINER-LINK-WORD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PREDETERMINER_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PREDETERMINER-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PREDETERMINER_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PREDETERMINER-LINK-WORD-INSTANCE");

    private static final SubLSymbol POSSESSIVE_PRONOUN_LINK_WORD = makeSymbol("POSSESSIVE-PRONOUN-LINK-WORD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_POSSESSIVE_PRONOUN_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-POSSESSIVE-PRONOUN-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_POSSESSIVE_PRONOUN_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-POSSESSIVE-PRONOUN-LINK-WORD-INSTANCE");

    private static final SubLSymbol CARDINAL_LINK_WORD = makeSymbol("CARDINAL-LINK-WORD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CARDINAL_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CARDINAL-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CARDINAL_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CARDINAL-LINK-WORD-INSTANCE");



    private static final SubLList $list911 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CONJUNCTION_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CONJUNCTION-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CONJUNCTION_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CONJUNCTION-LINK-WORD-INSTANCE");

    private static final SubLList $list914 = list(makeString("@return list; a list of the conjuncts of this conjunction"), list(makeSymbol("RET"), list(makeSymbol("LIST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SISTER")), MINUS_ONE_INTEGER), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SISTER")), ONE_INTEGER))));

    private static final SubLSymbol CONJUNCTION_LINK_WORD_GET_COMPLEMENTS_METHOD = makeSymbol("CONJUNCTION-LINK-WORD-GET-COMPLEMENTS-METHOD");

    private static final SubLSymbol EXISTENTIAL_LINK_WORD = makeSymbol("EXISTENTIAL-LINK-WORD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_EXISTENTIAL_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-EXISTENTIAL-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_EXISTENTIAL_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-EXISTENTIAL-LINK-WORD-INSTANCE");

    private static final SubLSymbol COMPARATOR_LINK_WORD = makeSymbol("COMPARATOR-LINK-WORD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_COMPARATOR_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COMPARATOR-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_COMPARATOR_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COMPARATOR-LINK-WORD-INSTANCE");

    private static final SubLSymbol INF_MARKER_LINK_WORD = makeSymbol("INF-MARKER-LINK-WORD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INF_MARKER_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INF-MARKER-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INF_MARKER_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INF-MARKER-LINK-WORD-INSTANCE");

    private static final SubLSymbol PARTICLE_LINK_WORD = makeSymbol("PARTICLE-LINK-WORD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PARTICLE_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARTICLE-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PARTICLE_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARTICLE-LINK-WORD-INSTANCE");



    public static final SubLList $list929 = list(makeSymbol("PUNCTUATION-WORD"));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PUNCTUATION_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PUNCTUATION-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PUNCTUATION_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PUNCTUATION-LINK-WORD-INSTANCE");

    private static final SubLSymbol POSS_MARKER_LINK_WORD = makeSymbol("POSS-MARKER-LINK-WORD");

    private static final SubLList $list933 = list(makeSymbol("POSSESSIVE-WORD"));

    private static final SubLList $list934 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSSESSER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSSESSED"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PUBLIC")));

    private static final SubLList $list935 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), list(makeKeyword("POSSESSOR"), makeKeyword("POSSESSED")))));

    private static final SubLList $list936 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("POSSESSOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-POSSESSOR")))), list(makeSymbol("POSSESSED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-POSSESSED"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("POSSESSOR"), list(makeSymbol("MEMBER"), makeKeyword("POSSESSOR"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("POSSESSOR"), makeSymbol("POSSESSOR")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("POSSESSED"), list(makeSymbol("MEMBER"), makeKeyword("POSSESSED"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("POSSESSED"), makeSymbol("POSSESSED")), makeSymbol("CONJUNCTS"))), list(makeSymbol("RET"), list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), NIL))));

    public static final SubLList $list937 = list(makeKeyword("POSSESSOR"), makeKeyword("POSSESSED"));





    private static final SubLSymbol POSS_MARKER_LINK_WORD_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol("POSS-MARKER-LINK-WORD-GET-KEYWORD-RENAMINGS-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_POSS_MARKER_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-POSS-MARKER-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_POSS_MARKER_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-POSS-MARKER-LINK-WORD-INSTANCE");

    private static final SubLList $list943 = list(makeString("@return noun-link-word-p; the possessor indicated by this poss marker"), list(makeSymbol("CLET"), list(list(makeSymbol("POSSESSOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("YS-PATTERN"), makeKeyword("LEFT")))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("POSSESSOR"), list(makeSymbol("FIRST"), makeSymbol("POSSESSOR"))))));



    private static final SubLSymbol POSS_MARKER_LINK_WORD_GET_POSSESSOR_METHOD = makeSymbol("POSS-MARKER-LINK-WORD-GET-POSSESSOR-METHOD");

    private static final SubLList $list946 = list(makeString("@return noun-link-word-p; the thing possessed indicated by this poss marker"), list(makeSymbol("CLET"), list(list(makeSymbol("POSSESSED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("D-PATTERN"), makeKeyword("RIGHT")))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("POSSESSED"), list(makeSymbol("FIRST"), makeSymbol("POSSESSED"))))));

    private static final SubLSymbol POSS_MARKER_LINK_WORD_GET_POSSESSED_METHOD = makeSymbol("POSS-MARKER-LINK-WORD-GET-POSSESSED-METHOD");

    private static final SubLList $list948 = list(makeString("@return listp; a list of all complements of this tree, in surface order"), list(makeSymbol("CLET"), list(list(makeSymbol("COMPLEMENTS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), list(makeSymbol("LIST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-POSSESSOR"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-POSSESSED"))))), list(makeSymbol("PWHEN"), makeSymbol("COMPLEMENT"), list(makeSymbol("CPUSH"), makeSymbol("COMPLEMENT"), makeSymbol("COMPLEMENTS")))), list(makeSymbol("RET"), makeSymbol("COMPLEMENTS"))));

    private static final SubLSymbol POSS_MARKER_LINK_WORD_GET_COMPLEMENTS_METHOD = makeSymbol("POSS-MARKER-LINK-WORD-GET-COMPLEMENTS-METHOD");

    private static final SubLList $list950 = list(makeString("@return listp; the constituents this possessive marker modifies"), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECTLY-RELATED")), makeKeyword("D-PATTERN"), makeKeyword("RIGHT"))));

    private static final SubLSymbol POSS_MARKER_LINK_WORD_GET_MODIFIEDS_METHOD = makeSymbol("POSS-MARKER-LINK-WORD-GET-MODIFIEDS-METHOD");



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_COMPLEMENTIZER_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COMPLEMENTIZER-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_COMPLEMENTIZER_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COMPLEMENTIZER-LINK-WORD-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WALL_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WALL-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WALL_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WALL-LINK-WORD-INSTANCE");

    private static final SubLSymbol LEFT_WALL_LINK_WORD = makeSymbol("LEFT-WALL-LINK-WORD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LEFT_WALL_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEFT-WALL-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LEFT_WALL_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEFT-WALL-LINK-WORD-INSTANCE");

    private static final SubLSymbol RIGHT_WALL_LINK_WORD = makeSymbol("RIGHT-WALL-LINK-WORD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_RIGHT_WALL_LINK_WORD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RIGHT-WALL-LINK-WORD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_RIGHT_WALL_LINK_WORD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RIGHT-WALL-LINK-WORD-INSTANCE");

    private static final SubLList $list963 = list(makeSymbol("CYCLIFIABLE"));

    private static final SubLList $list964 = list(new SubLObject[]{ list(makeSymbol("LINKS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("WORDS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DIAGRAM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TREE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TREE-STRING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("YIELD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("XML"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-DIAGRAM"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LENGTH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TREE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TREE-STRING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DAUGHTER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-WORD"), list(makeSymbol("I")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-HEADS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-HEAD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INDIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CYCLIFIER"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY"), list(makeSymbol("PROPERTIES")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFIABLE-QUESTION-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SEARCH"), list(makeSymbol("WORD")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-INT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LEXIFY"), list(makeSymbol("LEXICON")), makeKeyword("PUBLIC")) });

    private static final SubLSymbol TREE_STRING = makeSymbol("TREE-STRING");



    private static final SubLSymbol DIAGRAM = makeSymbol("DIAGRAM");







    public static final SubLList $list971 = list(makeSymbol("&OPTIONAL"), makeSymbol("PROPERTIES"));

    private static final SubLList $list972 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CYCLIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CYCLIFIER")), makeSymbol("PROPERTIES"))), list(makeSymbol("CYCLS"), NIL)), list(makeSymbol("WHILE"), list(makeSymbol("FIM"), makeSymbol("CYCLIFIER"), list(makeSymbol("QUOTE"), makeSymbol("HAS-NEXT?"))), list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), makeSymbol("CYCLIFIER"), list(makeSymbol("QUOTE"), makeSymbol("NEXT"))), makeSymbol("CYCLS"))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), makeSymbol("CYCLS")))));



    private static final SubLSymbol $sym974$HAS_NEXT_ = makeSymbol("HAS-NEXT?");



    private static final SubLSymbol LINKAGE_CYCLIFY_METHOD = makeSymbol("LINKAGE-CYCLIFY-METHOD");

    private static final SubLList $list977 = list(list(new SubLObject[]{ makeSymbol("CDESTRUCTURING-BIND"), list(new SubLObject[]{ makeSymbol("&KEY"), list(makeSymbol("LEXICON"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFIER-LEXICON")))), list(makeSymbol("SCORE-FUNCTION"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFICATION-SCORE"))), list(makeSymbol("OUTPUT"), makeKeyword("BRIEF")), list(makeSymbol("WFF-CHECK?"), T), makeSymbol("CONTEXT"), list(makeSymbol("DISAMBIGUATOR"), NIL), list(makeSymbol("COREFERENCE-RESOLVER"), NIL), list(makeSymbol("ERROR-HANDLING"), makeKeyword("THROW")), list(makeSymbol("SUBCYCLIFIER-POOL"), list(makeSymbol("NEW-CYCLIFIER-POOL"), list(makeSymbol("LIST"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("DATE-CYCLIFIER")))))), makeSymbol("&ALLOW-OTHER-KEYS") }), makeSymbol("PROPERTIES"), list(makeSymbol("CHECK-TYPE"), makeSymbol("LEXICON"), makeSymbol("CYCLIFIER-LEXICON-P")), list(makeSymbol("CHECK-TYPE"), makeSymbol("SCORE-FUNCTION"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("CHECK-TYPE"), makeSymbol("OUTPUT"), makeSymbol("KEYWORDP")), list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("CONTEXT"), makeSymbol("PARSE-TREE-CONTEXT-P")), list(makeSymbol("CHECK-TYPE"), makeSymbol("WFF-CHECK?"), makeSymbol("BOOLEANP")), list(makeSymbol("MUST"), list(makeSymbol("MEMBER"), makeSymbol("ERROR-HANDLING"), list(makeSymbol("QUOTE"), list(makeKeyword("THROW"), makeKeyword("WARN"), makeKeyword("IGNORE")))), makeString("Invalid error-handling tag ~a"), makeSymbol("ERROR-HANDLING")), list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("SUBCYCLIFIER-POOL"), makeSymbol("CYCLIFIER-POOL-P")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("CYCLIFIER"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFIER"))))), list(makeSymbol("SET-CYCLIFIER-SCORE-FUNCTION"), makeSymbol("CYCLIFIER"), makeSymbol("SCORE-FUNCTION")), list(makeSymbol("SET-CYCLIFIER-OUTPUT"), makeSymbol("CYCLIFIER"), makeSymbol("OUTPUT")), list(makeSymbol("SET-CYCLIFIER-ERROR-HANDLING"), makeSymbol("CYCLIFIER"), makeSymbol("ERROR-HANDLING")), list(makeSymbol("SET-CYCLIFIER-SUBCYCLIFIER-POOL"), makeSymbol("CYCLIFIER"), makeSymbol("SUBCYCLIFIER-POOL")), list(makeSymbol("PWHEN"), makeSymbol("LEXICON"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("LEXIFY")), makeSymbol("LEXICON"))), list(makeSymbol("PWHEN"), makeSymbol("DISAMBIGUATOR"), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("CONTEXT")), list(makeSymbol("CSETQ"), makeSymbol("CONTEXT"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("PARSE-TREE-CONTEXT"))))), list(makeSymbol("FIM"), makeSymbol("DISAMBIGUATOR"), list(makeSymbol("QUOTE"), makeSymbol("DISAMBIGUATE")), makeSymbol("SELF"), makeSymbol("CONTEXT"))), list(makeSymbol("IGNORE"), makeSymbol("COREFERENCE-RESOLVER")), list(makeSymbol("SET-CYCLIFIER-TREE"), makeSymbol("CYCLIFIER"), makeSymbol("SELF")), list(makeSymbol("SET-CYCLIFIER-WFF-CHECK?"), makeSymbol("CYCLIFIER"), makeSymbol("WFF-CHECK?")), list(makeSymbol("PWHEN"), makeSymbol("WFF-CHECK?"), list(makeSymbol("SET-CYCLIFIER-MEMOIZATION-STATE"), makeSymbol("CYCLIFIER"), list(makeSymbol("NEW-MEMOIZATION-STATE"))), list(makeSymbol("SET-CYCLIFIER-SBHL-RESOURCE"), makeSymbol("CYCLIFIER"), list(makeSymbol("NEW-SBHL-MARKING-SPACE-RESOURCE"), TEN_INTEGER))), list(makeSymbol("RET"), makeSymbol("CYCLIFIER")) }) }));





    private static final SubLSymbol CYCLIFICATION_SCORE = makeSymbol("CYCLIFICATION-SCORE");





    private static final SubLSymbol $kw983$WFF_CHECK_ = makeKeyword("WFF-CHECK?");













    private static final SubLSymbol DATE_CYCLIFIER = makeSymbol("DATE-CYCLIFIER");

    private static final SubLSymbol CYCLIFIER_LEXICON_P = makeSymbol("CYCLIFIER-LEXICON-P");





    private static final SubLSymbol PARSE_TREE_CONTEXT_P = makeSymbol("PARSE-TREE-CONTEXT-P");



    private static final SubLList $list996 = list(makeKeyword("THROW"), makeKeyword("WARN"), makeKeyword("IGNORE"));

    private static final SubLString $str997$Invalid_error_handling_tag__a = makeString("Invalid error-handling tag ~a");

    private static final SubLSymbol CYCLIFIER_POOL_P = makeSymbol("CYCLIFIER-POOL-P");





    private static final SubLSymbol DISAMBIGUATE = makeSymbol("DISAMBIGUATE");

    private static final SubLSymbol LINKAGE_GET_CYCLIFIER_METHOD = makeSymbol("LINKAGE-GET-CYCLIFIER-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LINKAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LINKAGE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LINKAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LINKAGE-INSTANCE");

    public static final SubLList $list1005 = list(list(makeSymbol("LINK"), makeSymbol("LINKAGE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list1006 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    public static final SubLList $list1010 = list(list(makeSymbol("QUOTE"), makeSymbol("LINKS")));

    private static final SubLList $list1011 = list(makeSymbol("L"));

    private static final SubLList $list1012 = list(list(makeSymbol("WORD"), makeSymbol("LINKAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol W = makeSymbol("W");

    public static final SubLList $list1014 = list(list(makeSymbol("QUOTE"), makeSymbol("WORDS")));

    public static final SubLList $list1015 = list(makeSymbol("W"));

    public static final SubLList $list1016 = list(makeSymbol("LINKAGE"), makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("PROPERTIES"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym1017$ERROR = makeUninternedSymbol("ERROR");



    private static final SubLSymbol NEW_LINKAGE = makeSymbol("NEW-LINKAGE");

    public static final SubLList $list1020 = list(makeSymbol("ENSURE-LINK-SERVER-RUNNING"));

    private static final SubLList $list1021 = list(makeSymbol("&KEY"), list(makeSymbol("CONTEXT"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("PARSE-TREE-CONTEXT")))), list(makeSymbol("OPTIONS"), makeSymbol("*LINK-PARSE-OPTIONS*")), list(makeSymbol("LEXICON"), NIL), list(makeSymbol("USE-STANDARDIZED-WORD-STRINGS?"), T));

    private static final SubLList $list1022 = list(makeKeyword("CONTEXT"), makeKeyword("OPTIONS"), makeKeyword("LEXICON"), makeKeyword("USE-STANDARDIZED-WORD-STRINGS?"));



    private static final SubLSymbol $kw1024$USE_STANDARDIZED_WORD_STRINGS_ = makeKeyword("USE-STANDARDIZED-WORD-STRINGS?");

    private static final SubLString $str1025$Couldn_t_build_tree_from__a = makeString("Couldn't build tree from ~a");

    public static final SubLList $list1026 = list(makeString("@return listp; the list of all words of this linkage"), list(makeSymbol("CLET"), list(list(makeSymbol("WORDS"), NIL)), list(makeSymbol("DO-LINKAGE-WORDS"), list(makeSymbol("WORD"), makeSymbol("SELF")), list(makeSymbol("CPUSH"), makeSymbol("WORD"), makeSymbol("WORDS"))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), makeSymbol("WORDS")))));

    private static final SubLSymbol $sym1027$OUTER_CATCH_FOR_LINKAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINKAGE-METHOD");

    private static final SubLSymbol LINKAGE_YIELD_METHOD = makeSymbol("LINKAGE-YIELD-METHOD");

    private static final SubLList $list1029 = list(makeString("Prints this linkage to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PPRINT-LINK-TREE"), makeSymbol("TREE"), makeSymbol("STREAM"), ZERO_INTEGER), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol $sym1030$OUTER_CATCH_FOR_LINKAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINKAGE-METHOD");

    private static final SubLSymbol LINKAGE_PRINT_METHOD = makeSymbol("LINKAGE-PRINT-METHOD");

    private static final SubLList $list1032 = list(makeString("@return stringp; the XML string representation of this linkage"), list(makeSymbol("CLET"), list(makeSymbol("XML"), list(makeSymbol("INDENT"), ZERO_INTEGER)), list(new SubLObject[]{ makeSymbol("CWITH-OUTPUT-TO-STRING"), list(makeSymbol("STREAM"), makeSymbol("XML")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("<linkage>~%")), list(makeSymbol("TAB"), list(makeSymbol("+"), makeSymbol("INDENT"), THREE_INTEGER), makeSymbol("STREAM")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("<tree>~%")), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-TREE"))), list(makeSymbol("QUOTE"), makeSymbol("XML")), makeSymbol("STREAM"), list(makeSymbol("+"), makeSymbol("INDENT"), SIX_INTEGER)), list(makeSymbol("TAB"), list(makeSymbol("+"), makeSymbol("INDENT"), THREE_INTEGER), makeSymbol("STREAM")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("</tree>~%")), list(makeSymbol("LINKS-XML"), list(makeSymbol("GET-LINKAGE-LINKS"), makeSymbol("SELF")), makeSymbol("STREAM"), list(makeSymbol("+"), makeSymbol("INDENT"), THREE_INTEGER)), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("</linkage>~%")) }), list(makeSymbol("RET"), makeSymbol("XML"))));

    private static final SubLString $str1033$_linkage___ = makeString("<linkage>~%");

    private static final SubLString $str1034$_tree___ = makeString("<tree>~%");

    private static final SubLSymbol GET_TREE = makeSymbol("GET-TREE");

    private static final SubLString $str1036$__tree___ = makeString("</tree>~%");

    private static final SubLString $str1037$__linkage___ = makeString("</linkage>~%");

    private static final SubLSymbol LINKAGE_XML_METHOD = makeSymbol("LINKAGE-XML-METHOD");

    private static final SubLString $str1039$__a = makeString("(~a");

    private static final SubLString $str1040$_links___ = makeString("<links>~%");

    private static final SubLString $str1041$__links___ = makeString("</links>~%");

    private static final SubLString $str1042$_diagram___ = makeString("<diagram>~%");

    private static final SubLString $str1043$__diagram___ = makeString("</diagram>~%");

    private static final SubLString $str1044$_tree_string___ = makeString("<tree-string>~%");

    private static final SubLString $str1045$__tree_string___ = makeString("</tree-string>~%");

    private static final SubLSymbol PRINT_DIAGRAM = makeSymbol("PRINT-DIAGRAM");

    private static final SubLList $list1047 = list(makeString("Prints this linkage's diagram"), list(makeSymbol("PRINC"), makeSymbol("DIAGRAM")), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol $sym1048$OUTER_CATCH_FOR_LINKAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINKAGE-METHOD");

    private static final SubLSymbol LINKAGE_PRINT_DIAGRAM_METHOD = makeSymbol("LINKAGE-PRINT-DIAGRAM-METHOD");



    private static final SubLList $list1051 = list(makeString("@return integerp; the number of words in this linkage"), list(makeSymbol("RET"), list(makeSymbol("-"), list(makeSymbol("LENGTH"), makeSymbol("WORDS")), TWO_INTEGER)));

    private static final SubLSymbol $sym1052$OUTER_CATCH_FOR_LINKAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINKAGE-METHOD");

    private static final SubLSymbol LINKAGE_LENGTH_METHOD = makeSymbol("LINKAGE-LENGTH-METHOD");

    private static final SubLList $list1054 = list(makeString("@return link-tree-p; the tree of this linkage"), list(makeSymbol("RET"), makeSymbol("TREE")));

    private static final SubLSymbol $sym1055$OUTER_CATCH_FOR_LINKAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINKAGE-METHOD");

    private static final SubLSymbol LINKAGE_GET_TREE_METHOD = makeSymbol("LINKAGE-GET-TREE-METHOD");

    private static final SubLSymbol GET_TREE_STRING = makeSymbol("GET-TREE-STRING");

    private static final SubLList $list1058 = list(makeString("@return stringp; the tree of this linkage, as a string"), list(makeSymbol("RET"), makeSymbol("TREE-STRING")));

    private static final SubLSymbol $sym1059$OUTER_CATCH_FOR_LINKAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINKAGE-METHOD");

    private static final SubLSymbol LINKAGE_GET_TREE_STRING_METHOD = makeSymbol("LINKAGE-GET-TREE-STRING-METHOD");

    private static final SubLList $list1061 = list(makeString("@param I non-negative-integer-p; the index of the daughter to be retrieved\n   @return link-tree-p; the Ith daughter of this linkage"), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), makeSymbol("I"))));

    private static final SubLSymbol $sym1062$OUTER_CATCH_FOR_LINKAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINKAGE-METHOD");

    private static final SubLSymbol LINKAGE_GET_DAUGHTER_METHOD = makeSymbol("LINKAGE-GET-DAUGHTER-METHOD");



    private static final SubLList $list1065 = list(makeString("@param I non-negative-integer\n   @return link-word; the Ith word of this linkage"), list(makeSymbol("CHECK-TYPE"), makeSymbol("I"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeSymbol("PUNLESS"), list(makeSymbol(">"), makeSymbol("I"), list(makeSymbol("1-"), list(makeSymbol("LENGTH"), makeSymbol("WORDS")))), list(makeSymbol("RET"), list(makeSymbol("AREF"), makeSymbol("WORDS"), makeSymbol("I")))));

    private static final SubLSymbol $sym1066$OUTER_CATCH_FOR_LINKAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINKAGE-METHOD");

    private static final SubLSymbol LINKAGE_GET_WORD_METHOD = makeSymbol("LINKAGE-GET-WORD-METHOD");

    public static final SubLList $list1068 = list(makeString("@return link-word; the head of this linkage"), list(makeSymbol("CLET"), list(list(makeSymbol("HEADS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("PATTERNS"), list(makeSymbol("QUOTE"), list(list(makeKeyword("W-PATTERN"), makeKeyword("S-PATTERN")), list(makeKeyword("W-PATTERN"), makeKeyword("D-PATTERN"), makeKeyword("S-PATTERN")), list(makeKeyword("W-PATTERN"), makeKeyword("Q-PATTERN")), list(makeKeyword("W-PATTERN"), makeKeyword("P-PATTERN")), list(makeKeyword("W-PATTERN"), makeKeyword("D-PATTERN"), makeKeyword("B-PATTERN"), makeKeyword("PP-PATTERN"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("HEAD"), list(makeSymbol("FIM"), list(makeSymbol("AREF"), makeSymbol("WORDS"), ZERO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-RELATED")), makeSymbol("PATTERNS"))), list(makeSymbol("PWHEN"), list(makeSymbol("VERB-LINK-WORD-P"), makeSymbol("HEAD")), list(makeSymbol("CPUSHNEW"), makeSymbol("HEAD"), makeSymbol("HEADS"), list(makeSymbol("QUOTE"), EQ))))), list(makeSymbol("RET"), makeSymbol("HEADS"))));

    private static final SubLSymbol $sym1069$OUTER_CATCH_FOR_LINKAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINKAGE-METHOD");

    public static final SubLList $list1070 = list(list(makeKeyword("W-PATTERN"), makeKeyword("S-PATTERN")), list(makeKeyword("W-PATTERN"), makeKeyword("D-PATTERN"), makeKeyword("S-PATTERN")), list(makeKeyword("W-PATTERN"), makeKeyword("Q-PATTERN")), list(makeKeyword("W-PATTERN"), makeKeyword("P-PATTERN")), list(makeKeyword("W-PATTERN"), makeKeyword("D-PATTERN"), makeKeyword("B-PATTERN"), makeKeyword("PP-PATTERN")));

    private static final SubLSymbol LINKAGE_GET_HEADS_METHOD = makeSymbol("LINKAGE-GET-HEADS-METHOD");

    public static final SubLList $list1072 = list(list(makeSymbol("RET"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEADS"))))));

    private static final SubLSymbol LINKAGE_GET_HEAD_METHOD = makeSymbol("LINKAGE-GET-HEAD-METHOD");

    public static final SubLList $list1074 = list(makeString("@return link-word-p; this linkage's subject"), list(makeSymbol("CLET"), list(list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT")))))));

    private static final SubLSymbol LINKAGE_GET_SUBJECT_METHOD = makeSymbol("LINKAGE-GET-SUBJECT-METHOD");

    private static final SubLList $list1076 = list(makeString("@return link-word-p; this linkage's direct-object"), list(makeSymbol("CLET"), list(list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECT-OBJECT")))))));

    private static final SubLSymbol LINKAGE_GET_DIRECT_OBJECT_METHOD = makeSymbol("LINKAGE-GET-DIRECT-OBJECT-METHOD");

    private static final SubLList $list1078 = list(makeString("@return link-word-p; this linkage's indirect-object"), list(makeSymbol("CLET"), list(list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-INDIRECT-OBJECT")))))));

    private static final SubLSymbol LINKAGE_GET_INDIRECT_OBJECT_METHOD = makeSymbol("LINKAGE-GET-INDIRECT-OBJECT-METHOD");

    private static final SubLList $list1080 = list(makeString("@return listp; the CycL representation of the meaning of this linkage"), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT")))));

    private static final SubLSymbol $sym1081$OUTER_CATCH_FOR_LINKAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINKAGE-METHOD");

    private static final SubLSymbol LINKAGE_CYCLIFY_INT_METHOD = makeSymbol("LINKAGE-CYCLIFY-INT-METHOD");

    private static final SubLList $list1083 = list(makeString("@param LEXICON semtrans-lexicon-p; the lexicon to lexify with\n   @return linkage-p; this linkage destructively lexified with lexicon"), list(makeSymbol("CHECK-TYPE"), makeSymbol("LEXICON"), makeSymbol("SEMTRANS-LEXICON-P")), list(makeSymbol("CDOVECTOR"), list(makeSymbol("WORD"), makeSymbol("WORDS")), list(makeSymbol("FIM"), makeSymbol("WORD"), list(makeSymbol("QUOTE"), makeSymbol("LEXIFY")), makeSymbol("LEXICON"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol $sym1084$OUTER_CATCH_FOR_LINKAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINKAGE-METHOD");

    private static final SubLSymbol SEMTRANS_LEXICON_P = makeSymbol("SEMTRANS-LEXICON-P");

    private static final SubLSymbol LINKAGE_LEXIFY_METHOD = makeSymbol("LINKAGE-LEXIFY-METHOD");

    private static final SubLSymbol CYCLIFIABLE_QUESTION_P = makeSymbol("CYCLIFIABLE-QUESTION-P");

    private static final SubLList $list1088 = list(makeString("@return boolean; t if this linkage is a question, nil otherwise"), list(makeSymbol("RET"), list(makeSymbol("BOOLEAN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("SEARCH")), makeString("?")))));



    private static final SubLString $str1090$_ = makeString("?");

    private static final SubLSymbol LINKAGE_CYCLIFIABLE_QUESTION_P_METHOD = makeSymbol("LINKAGE-CYCLIFIABLE-QUESTION-P-METHOD");

    public static final SubLList $list1092 = list(makeSymbol("WORD"), makeSymbol("&OPTIONAL"), list(makeSymbol("N"), ONE_INTEGER));

    private static final SubLList $list1093 = list(makeString("@param WORD stringp\n   @param N non-negative-integer-p\n   @return link-word-p; the Nth word with string WORD"), list(makeSymbol("CHECK-TYPE"), makeSymbol("WORD"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("N"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeSymbol("CLET"), list(list(makeSymbol("COUNTER"), ZERO_INTEGER)), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), list(makeSymbol("LENGTH"), makeSymbol("WORDS"))), list(makeSymbol("PWHEN"), list(EQUALP, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-WORD")), makeSymbol("I")), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), makeSymbol("WORD")), list(makeSymbol("CINC"), makeSymbol("COUNTER")), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("COUNTER"), makeSymbol("N")), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-WORD")), makeSymbol("I")))))), list(makeSymbol("RET"), NIL)));

    private static final SubLSymbol $sym1094$OUTER_CATCH_FOR_LINKAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LINKAGE-METHOD");

    private static final SubLSymbol LINKAGE_SEARCH_METHOD = makeSymbol("LINKAGE-SEARCH-METHOD");

    private static final SubLString $str1096$No_regex_pattern_for__a = makeString("No regex pattern for ~a");



    private static final SubLList $list1098 = list(list(makeSymbol("LINK-WORD")));

    private static final SubLString $str1099$Inconsistent_class_evidence_from_ = makeString("Inconsistent class evidence from link parser: ~a for ~s (pos ~a, llinks ~a, rlinks ~a");

    private static final SubLString $str1100$Couldn_t_strengthen_link_required = makeString("Couldn't strengthen link required class ~a for ~a~%");

    private static final SubLString $str1101$Disjunctive_class_evidence__a_for = makeString("Disjunctive class evidence ~a for ~s (pos ~a, llinks ~a, rlinks ~a, penn-pos ~a");

    private static final SubLInteger $int$45 = makeInteger(45);

    private static final SubLString $str1103$data_pos_tagging_index_to_state_t = makeString("data/pos-tagging/index-to-state.txt");



    private static final SubLString $str1105$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLList $list1106 = list(CHAR_caret);







    private static final SubLSymbol $sym1110$_ = makeSymbol(">");

    private static final SubLList $list1111 = list(makeKeyword("CATEGORY"), makeKeyword("AUX"));

    private static final SubLString $$$linkage = makeString("linkage");

    private static final SubLString $str1113$_a_is_not_a_linkage_xml_string = makeString("~a is not a linkage xml string");

    private static final SubLString $$$links = makeString("links");

    private static final SubLString $$$tree = makeString("tree");

    private static final SubLString $str1116$LEFT_WALL = makeString("LEFT-WALL");

    private static final SubLString $str1117$RIGHT_WALL = makeString("RIGHT-WALL");

    private static final SubLString $$$name = makeString("name");

    private static final SubLString $$$left = makeString("left");

    private static final SubLString $$$right = makeString("right");

    private static final SubLString $$$phrase = makeString("phrase");

    private static final SubLString $str1122$_a_is_not_a_valid_xml_sexpr_tree_ = makeString("~a is not a valid xml sexpr tree specification");

    private static final SubLString $$$cat = makeString("cat");

    private static final SubLString $$$class = makeString("class");



    private static final SubLString $$$word = makeString("word");

    private static final SubLString $str1127$__ = makeString("(:");

    private static final SubLString $str1128$__W__ = makeString("(:W \"");

    private static final SubLString $str1129$__ = makeString("\")");

    private static final SubLList $list1130 = list(CHAR_rparen);

    private static final SubLList $list1131 = list(CHAR_space, CHAR_newline);

    private static final SubLSymbol TEST_LINKAGE_WITH_RETOKENIZATION = makeSymbol("TEST-LINKAGE-WITH-RETOKENIZATION");



    private static final SubLSymbol SOME_LINKAGE_RESULTS = makeSymbol("SOME-LINKAGE-RESULTS");











    private static final SubLList $list1140 = list(list(list(makeString("Bush didn't realize that Austin, TX is a banana-boat in December, 2003")), T), list(list(makeString("Bush didn't realize blarge that is a banana-boat in December, 2003")), T), list(list(makeString("Bush didn't realize that Afghanistan is land-locked")), T), list(list(makeString("The cat sat on the mat")), T), list(list(makeString("template from test query fn test query fn #$CST-ISSomeoneWithCerebralPalsyCapableOfCoordinatedBodyMovement is a formula template")), T));

    private static final SubLSymbol $sym1141$LINKS_HAVE_NAMES_ = makeSymbol("LINKS-HAVE-NAMES?");

    private static final SubLList $list1142 = list(list(list(makeString("The Hazaras even boasted a prime minister, Sultan Ali Keshtmand, in the mid-1980s.")), T));

    static final boolean assertionsDisabledSynth = true;

    public static SubLObject link_pos_p(final SubLObject v_object) {
        return makeBoolean(v_object.isChar() && (NIL != find(v_object, $link_poses$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject link_parser_annotational_suffixes() {
        return list($link_parser_unknown_string_suffix$.getGlobalValue(), $link_parser_guessed_string_suffix$.getGlobalValue());
    }

    public static SubLObject link_ping(SubLObject server, SubLObject port, SubLObject version) {
        if (server == UNPROVIDED) {
            server = $link_parser$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $link_port$.getDynamicValue();
        }
        if (version == UNPROVIDED) {
            version = $cyc_link_interface$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = interpret_link_response(link_execute(listS($CYC_LINK_INTERFACE, version, $list26), server, port), UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
        return NIL != result ? list_utilities.sublisp_boolean(string_utilities.substringP($str27$parseSentence_c, result, UNPROVIDED, UNPROVIDED, UNPROVIDED)) : NIL;
    }

    public static SubLObject link_parse(final SubLObject sentence, SubLObject options, SubLObject lexicon, SubLObject use_standardized_word_stringsP) {
        if (options == UNPROVIDED) {
            options = $link_parse_options$.getDynamicValue();
        }
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        if (use_standardized_word_stringsP == UNPROVIDED) {
            use_standardized_word_stringsP = T;
        }
        return interpret_link_response(link_execute(append(list($COMMAND, $$$parse, $SENTENCE, sentence), options), UNPROVIDED, UNPROVIDED), lexicon, sentence, use_standardized_word_stringsP);
    }

    public static SubLObject link_lex(final SubLObject lex, SubLObject options) {
        if (options == UNPROVIDED) {
            options = $link_parse_options$.getDynamicValue();
        }
        assert NIL != stringp(lex) : "Types.stringp(lex) " + "CommonSymbols.NIL != Types.stringp(lex) " + lex;
        return interpret_link_response(link_execute(append(list($COMMAND, $$$lex, $LEX, lex), options), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject link_execute(final SubLObject parameters, SubLObject server, SubLObject port) {
        if (server == UNPROVIDED) {
            server = $link_parser$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $link_port$.getDynamicValue();
        }
        return copy_list(link_execute_int(parameters, server, port));
    }

    public static SubLObject clear_link_execute_int() {
        final SubLObject cs = $link_execute_int_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_link_execute_int(final SubLObject parameters, SubLObject server, SubLObject port) {
        if (server == UNPROVIDED) {
            server = $link_parser$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $link_port$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($link_execute_int_caching_state$.getGlobalValue(), list(parameters, server, port), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject link_execute_int_internal(final SubLObject parameters, final SubLObject server, final SubLObject port) {
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            stream = subl_promotions.open_tcp_stream_with_timeout(server, port, NIL, $PUBLIC);
            if (NIL != validate_tcp_connection(stream, server, port)) {
                write_link_parameters(parameters, stream);
                terpri(stream);
                finish_output(stream);
                result = read(stream, NIL, $list37, UNPROVIDED);
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

    public static SubLObject link_execute_int(final SubLObject parameters, SubLObject server, SubLObject port) {
        if (server == UNPROVIDED) {
            server = $link_parser$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = $link_port$.getDynamicValue();
        }
        SubLObject caching_state = $link_execute_int_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(LINK_EXECUTE_INT, $link_execute_int_caching_state$, $int$10000, EQUAL, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(parameters, server, port);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (parameters.equal(cached_args.first())) {
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
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(link_execute_int_internal(parameters, server, port)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(parameters, server, port));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject link_structure_spec_p(final SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, $list40);
    }

    public static SubLObject copy_link_structure_spec(final SubLObject link_structure_spec) {
        assert NIL != link_structure_spec_p(link_structure_spec) : "linkage.link_structure_spec_p(link_structure_spec) " + "CommonSymbols.NIL != linkage.link_structure_spec_p(link_structure_spec) " + link_structure_spec;
        final SubLObject new_link_structure_spec = make_list(FIVE_INTEGER, UNPROVIDED);
        set_nth(ZERO_INTEGER, new_link_structure_spec, $LINKAGE);
        SubLObject current;
        final SubLObject datum = current = link_structure_spec.rest();
        SubLObject words = NIL;
        SubLObject links = NIL;
        SubLObject diagram = NIL;
        SubLObject tree = NIL;
        destructuring_bind_must_consp(current, datum, $list43);
        words = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        links = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        diagram = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list43);
        tree = current.first();
        current = current.rest();
        if (NIL == current) {
            set_nth(ONE_INTEGER, new_link_structure_spec, vector_utilities.copy_vector(words));
            print(new_link_structure_spec, UNPROVIDED);
            for (SubLObject sequence_var = words, end_index = (sequence_var.isList()) ? NIL : length(sequence_var), i = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(i, end_index, sequence_var); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(i, end_index, sequence_var)) {
                final SubLObject word = subl_macros.do_sequence_index_valueP(i, sequence_var);
                set_aref(words, i, string_utilities.copy_string(word));
                sequence_var = subl_macros.do_sequence_index_update(sequence_var);
                i = add(i, ONE_INTEGER);
            }
            print(new_link_structure_spec, UNPROVIDED);
            set_nth(TWO_INTEGER, new_link_structure_spec, vector_utilities.copy_vector(links));
            print(new_link_structure_spec, UNPROVIDED);
            set_nth(THREE_INTEGER, new_link_structure_spec, string_utilities.copy_string(diagram));
            print(new_link_structure_spec, UNPROVIDED);
            set_nth(FOUR_INTEGER, new_link_structure_spec, string_utilities.copy_string(tree));
            print(new_link_structure_spec, UNPROVIDED);
        } else {
            cdestructuring_bind_error(datum, $list43);
        }
        return new_link_structure_spec;
    }

    public static SubLObject clear_link_execute_cached() {
        final SubLObject cs = $link_execute_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_link_execute_cached(final SubLObject parameters, final SubLObject server, final SubLObject port) {
        return memoization_state.caching_state_remove_function_results_with_args($link_execute_cached_caching_state$.getGlobalValue(), list(parameters, server, port), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject link_execute_cached_internal(final SubLObject parameters, final SubLObject server, final SubLObject port) {
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            stream = subl_promotions.open_tcp_stream_with_timeout(server, port, NIL, $PUBLIC);
            if (NIL != validate_tcp_connection(stream, server, port)) {
                write_link_parameters(parameters, stream);
                terpri(stream);
                finish_output(stream);
                result = read(stream, NIL, $list37, UNPROVIDED);
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

    public static SubLObject link_execute_cached(final SubLObject parameters, final SubLObject server, final SubLObject port) {
        SubLObject caching_state = $link_execute_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(LINK_EXECUTE_CACHED, $link_execute_cached_caching_state$, $int$500, EQUAL, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(parameters, server, port);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (parameters.equal(cached_args.first())) {
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
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(link_execute_cached_internal(parameters, server, port)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(parameters, server, port));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject write_link_parameters(SubLObject parameters, final SubLObject stream) {
        SubLObject key = NIL;
        SubLObject value = NIL;
        key = parameters.first();
        value = second(parameters);
        while (NIL != parameters) {
            write_string(Strings.string_downcase(symbol_name(key), UNPROVIDED, UNPROVIDED), stream, UNPROVIDED, UNPROVIDED);
            write_string($str47$_, stream, UNPROVIDED, UNPROVIDED);
            prin1(value, stream);
            write_string($str48$_, stream, UNPROVIDED, UNPROVIDED);
            parameters = cddr(parameters);
            key = parameters.first();
            value = second(parameters);
        } 
        return NIL;
    }

    public static SubLObject interpret_link_response(final SubLObject result, SubLObject lexicon, SubLObject input_sentence, SubLObject use_standardized_word_stringsP) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        if (input_sentence == UNPROVIDED) {
            input_sentence = NIL;
        }
        if (use_standardized_word_stringsP == UNPROVIDED) {
            use_standardized_word_stringsP = NIL;
        }
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = result.first();
        if (pcase_var.eql($LINKAGE)) {
            return new_link_structures(result.rest(), lexicon, input_sentence, use_standardized_word_stringsP);
        }
        if (pcase_var.eql($ERROR)) {
            Errors.error(second(result));
        } else {
            if (pcase_var.eql($STATUS)) {
                return second(result);
            }
            if (pcase_var.eql($LEX)) {
                return result.rest();
            }
            if (pcase_var.eql($EOF)) {
                return NIL;
            }
            Errors.error($str52$Unknown_link_response__a, type);
        }
        return NIL;
    }

    public static SubLObject new_link_structures(final SubLObject response, SubLObject lexicon, SubLObject input_sentence, SubLObject use_standardized_word_stringsP) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        if (input_sentence == UNPROVIDED) {
            input_sentence = NIL;
        }
        if (use_standardized_word_stringsP == UNPROVIDED) {
            use_standardized_word_stringsP = NIL;
        }
        SubLObject link_structures = NIL;
        SubLObject remaining;
        SubLObject words;
        SubLObject links;
        SubLObject diagram;
        SubLObject tree;
        for (remaining = NIL, remaining = response; NIL != remaining; remaining = list_utilities.cdddr(remaining).rest()) {
            words = clean_up_link_word_strings(remaining.first());
            links = (NIL != words) ? NIL != lexicon ? update_links(words, second(remaining), lexicon, input_sentence) : second(remaining) : NIL;
            diagram = third(remaining);
            tree = fourth(remaining);
            if (NIL == use_standardized_word_stringsP) {
                post_process_link_words(words, input_sentence);
            }
            link_structures = cons(new_link_structure(words, links, diagram, tree), link_structures);
        }
        return nreverse(link_structures);
    }

    public static SubLObject clean_up_link_word_strings(final SubLObject link_word_strings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == link_word_strings) {
            return NIL;
        }
        final SubLObject clean_link_word_strings = make_vector(length(link_word_strings), UNPROVIDED);
        SubLObject link_parser_failedP = NIL;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject i;
        SubLObject link_word_string;
        SubLObject word_string;
        SubLObject pos;
        for (length = length(link_word_strings), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            i = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            link_word_string = aref(link_word_strings, i);
            thread.resetMultipleValues();
            word_string = split_link_word(link_word_string);
            pos = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != null_link_token_string_p(word_string)) {
                word_string = linkage_assertion.strip_null_link_token_string_brackets(word_string);
                link_parser_failedP = T;
            }
            word_string = link_word_strip_annotational_suffixes(word_string);
            if (NIL != pos) {
                set_aref(clean_link_word_strings, i, cconcatenate(format_nil.format_nil_a_no_copy(word_string), new SubLObject[]{ $str53$_, format_nil.format_nil_a_no_copy(pos) }));
            } else {
                set_aref(clean_link_word_strings, i, word_string);
            }
        }
        return values(clean_link_word_strings, link_parser_failedP);
    }

    public static SubLObject post_process_link_words(final SubLObject words, final SubLObject input_sentence) {
        return restore_link_words_capitalization(words, input_sentence);
    }

    public static SubLObject restore_link_words_capitalization(final SubLObject words, final SubLObject input_sentence) {
        SubLObject target_positionP;
        final SubLObject sentence_has_quoteP = target_positionP = find(CHAR_quotation, input_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject input_sentence_index = ZERO_INTEGER;
        for (SubLObject sequence_var = words, end_index = (sequence_var.isList()) ? NIL : length(sequence_var), i = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(i, end_index, sequence_var); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(i, end_index, sequence_var)) {
            final SubLObject word = subl_macros.do_sequence_index_valueP(i, sequence_var);
            if ((NIL != target_positionP) && (!word_to_class(word).eql(WALL_LINK_WORD))) {
                final SubLObject word_copy = string_utilities.copy_string(word);
                input_sentence_index = try_to_restore_link_word_capitalization(word_copy, input_sentence, input_sentence_index);
                set_aref(words, i, word_copy);
            }
            target_positionP = makeBoolean((NIL != sentence_has_quoteP) || (NIL != link_words_sometimes_downcased_after_word_p(word)));
            sequence_var = subl_macros.do_sequence_index_update(sequence_var);
            i = add(i, ONE_INTEGER);
        }
        return words;
    }

    public static SubLObject try_to_restore_link_word_capitalization(final SubLObject word, final SubLObject input_sentence, SubLObject input_sentence_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word_length = link_word_unannotated_length(word);
        final SubLObject null_link_token_stringP = null_link_token_string_p(word);
        final SubLObject original_start = search(word, input_sentence, symbol_function(EQUALP), symbol_function(IDENTITY), NIL != null_link_token_stringP ? ONE_INTEGER : ZERO_INTEGER, NIL != null_link_token_stringP ? number_utilities.f_1X(word_length) : word_length, input_sentence_index, UNPROVIDED);
        if (NIL != original_start) {
            final SubLObject string_var;
            final SubLObject original = string_var = string_utilities.substring(input_sentence, original_start, add(original_start, word_length));
            SubLObject end_var_$1;
            SubLObject end_var;
            SubLObject n;
            SubLObject v_char;
            for (end_var = end_var_$1 = length(string_var), n = NIL, n = ZERO_INTEGER; !n.numGE(end_var_$1); n = number_utilities.f_1X(n)) {
                v_char = Strings.sublisp_char(string_var, n);
                string_utilities.set_nth_char(NIL != null_link_token_stringP ? number_utilities.f_1X(n) : n, word, v_char, UNPROVIDED);
            }
            input_sentence_index = add(input_sentence_index, length(original));
        } else
            if (NIL != $show_link_warnings$.getDynamicValue(thread)) {
                Errors.warn($str55$Couldn_t_find__S_in__S, word, input_sentence);
            }

        return input_sentence_index;
    }

    public static SubLObject link_word_unannotated_length(final SubLObject word) {
        final SubLObject null_link_token_stringP = null_link_token_string_p(word);
        final SubLObject raw_word_length = (NIL != null_link_token_stringP) ? subtract(length(word), TWO_INTEGER) : length(word);
        SubLObject word_length = (NIL != pos_tagged_link_word_p(word)) ? subtract(raw_word_length, TWO_INTEGER) : raw_word_length;
        SubLObject cdolist_list_var = link_parser_annotational_suffixes();
        SubLObject suffix = NIL;
        suffix = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject suffix_length = length(suffix);
            if (word_length.numG(suffix_length) && suffix.equal(string_utilities.substring(word, subtract(word_length, suffix_length), word_length))) {
                word_length = subtract(word_length, suffix_length);
            }
            cdolist_list_var = cdolist_list_var.rest();
            suffix = cdolist_list_var.first();
        } 
        return word_length;
    }

    public static SubLObject link_word_strip_annotational_suffixes(SubLObject word) {
        assert NIL != stringp(word) : "Types.stringp(word) " + "CommonSymbols.NIL != Types.stringp(word) " + word;
        SubLObject found_oneP;
        for (SubLObject passed_unchangedP = NIL; NIL == passed_unchangedP; passed_unchangedP = makeBoolean(NIL == found_oneP)) {
            found_oneP = NIL;
            if (NIL == found_oneP) {
                SubLObject csome_list_var = link_parser_annotational_suffixes();
                SubLObject suffix = NIL;
                suffix = csome_list_var.first();
                while ((NIL == found_oneP) && (NIL != csome_list_var)) {
                    if (NIL != string_utilities.ends_with(word, suffix, UNPROVIDED)) {
                        word = string_utilities.post_remove(word, suffix, UNPROVIDED);
                        found_oneP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    suffix = csome_list_var.first();
                } 
            }
        }
        return word;
    }

    public static SubLObject link_words_sometimes_downcased_after_word_p(final SubLObject word) {
        return subl_promotions.memberP(word, $list56, symbol_function(EQUALP), UNPROVIDED);
    }

    public static SubLObject null_link_token_string_p(final SubLObject token_string) {
        return makeBoolean(((token_string.isString() && string_utilities.first_char(token_string).eql(CHAR_lbracket)) && string_utilities.last_char(token_string).eql(CHAR_rbracket)) && (NIL != list_utilities.lengthG(token_string, TWO_INTEGER, UNPROVIDED)));
    }

    public static SubLObject new_link_structure(final SubLObject words, final SubLObject links, SubLObject diagram, SubLObject tree) {
        if (diagram == UNPROVIDED) {
            diagram = NIL;
        }
        if (tree == UNPROVIDED) {
            tree = NIL;
        }
        return vector(new SubLObject[]{ words, links, diagram, tree });
    }

    public static SubLObject update_links(final SubLObject strings, final SubLObject links, final SubLObject lexicon, final SubLObject input_sentence) {
        return apply(symbol_function(VECTOR), append(vector_utilities.vector_elements(links, UNPROVIDED), new_id_links(vector_utilities.vector_elements(strings, UNPROVIDED), lexicon, input_sentence)));
    }

    public static SubLObject token_using_lexicon_prefixes(final SubLObject string, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject prefixes_and_maybe_string = methods.funcall_instance_method_with_1_args(lexicon, PREFIX_KEYS_FROM_STRING, string);
        final SubLObject prefixes = prefixes_and_maybe_string.first();
        final SubLObject prefix_string = second(prefixes_and_maybe_string);
        SubLObject err_msg = NIL;
        SubLObject token = NIL;
        if (NIL != string_utilities.starts_with(string, prefix_string)) {
            return prefix_string;
        }
        final SubLObject prefix = prefixes.first();
        if (NIL != prefix) {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        token = string_utilities.bunge_according_to_string(prefix, string, $list59, UNPROVIDED, UNPROVIDED);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != err_msg) {
                Errors.warn($str60$Failed_to_bunge_according_to_stri, err_msg);
            }
        }
        return token;
    }

    public static SubLObject link_subtokenP(final SubLObject subtoken, final SubLObject token) {
        if ((NIL != list_utilities.lengthE(subtoken, ONE_INTEGER, UNPROVIDED)) && (NIL != link_attached_symbolP(string_utilities.first_char(subtoken)))) {
            return string_utilities.substringP(subtoken, token, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return string_utilities.subwordP(subtoken, token, $list61, UNPROVIDED);
    }

    public static SubLObject link_attached_symbolP(final SubLObject v_char) {
        return makeBoolean(v_char.isChar() && ((NIL != string_utilities.punctuation_p(v_char)) || (NIL != find(v_char, $str62$_____, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject new_id_links(final SubLObject strings, final SubLObject lexicon, SubLObject sentence) {
        final SubLObject tokens = Mapping.mapcar(SPLIT_LINK_WORD, strings);
        SubLObject index = ONE_INTEGER;
        SubLObject links = NIL;
        sentence = string_utilities.trim_whitespace(sentence);
        sentence = string_utilities.strip_punctuation(sentence);
        sentence = remove(CHAR_newline, string_utilities.remove_substring(sentence, $str64$_), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        while (NIL != sentence) {
            final SubLObject relevant_tokens = nthcdr(index, tokens);
            SubLObject complex_token = token_using_lexicon_prefixes(sentence, lexicon);
            SubLObject n = ZERO_INTEGER;
            final SubLObject first_relevant_token = relevant_tokens.first();
            if (NIL != complex_token) {
                SubLObject index_inc = NIL;
                if (NIL == index_inc) {
                    SubLObject csome_list_var = relevant_tokens;
                    SubLObject token = NIL;
                    token = csome_list_var.first();
                    while ((NIL == index_inc) && (NIL != csome_list_var)) {
                        if (NIL != link_subtokenP(token, complex_token)) {
                            n = add(n, ONE_INTEGER);
                        } else {
                            index_inc = (n.numG(ZERO_INTEGER)) ? n : ONE_INTEGER;
                        }
                        csome_list_var = csome_list_var.rest();
                        token = csome_list_var.first();
                    } 
                }
                if (n.numG(ONE_INTEGER)) {
                    SubLObject cdotimes_end_var;
                    SubLObject i;
                    for (cdotimes_end_var = number_utilities.f_1_(n), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        links = cons(list($$$IDXX, add(index, i), add(index, i, ONE_INTEGER)), links);
                    }
                }
                index = add(index, index_inc);
            } else {
                index = add(index, ONE_INTEGER);
                complex_token = first_relevant_token;
            }
            if (NIL != list_utilities.greater_length_p(first_relevant_token, complex_token)) {
                complex_token = first_relevant_token;
            }
            if ((NIL != complex_token) && (NIL != list_utilities.greater_length_p(sentence, complex_token))) {
                sentence = string_utilities.trim_whitespace(string_utilities.substring(sentence, length(complex_token), UNPROVIDED));
            } else {
                sentence = NIL;
            }
        } 
        return links;
    }

    public static SubLObject ls_words(final SubLObject ls) {
        return aref(ls, ZERO_INTEGER);
    }

    public static SubLObject ls_links(final SubLObject ls) {
        return aref(ls, ONE_INTEGER);
    }

    public static SubLObject ls_diagram(final SubLObject ls) {
        return aref(ls, TWO_INTEGER);
    }

    public static SubLObject ls_tree(final SubLObject ls) {
        return aref(ls, THREE_INTEGER);
    }

    public static SubLObject ls_number_of_words(final SubLObject ls) {
        return length(ls_words(ls));
    }

    public static SubLObject ls_number_of_links(final SubLObject ls) {
        return length(ls_links(ls));
    }

    public static SubLObject ls_link(final SubLObject ls, final SubLObject i) {
        return aref(ls_links(ls), i);
    }

    public static SubLObject ls_name_of_link(final SubLObject ls, final SubLObject i) {
        return ls_link(ls, i).first();
    }

    public static SubLObject ls_lword_index_of_link(final SubLObject ls, final SubLObject i) {
        return second(ls_link(ls, i));
    }

    public static SubLObject ls_rword_index_of_link(final SubLObject ls, final SubLObject i) {
        return third(ls_link(ls, i));
    }

    public static SubLObject ls_word_of_linkage(final SubLObject ls, final SubLObject i) {
        return aref(ls_words(ls), i);
    }

    public static SubLObject reinitialize_linkage() {
        finalize_linkage();
        initialize_linkage();
        return T;
    }

    public static SubLObject initialize_linkage() {
        initialize_link_regex_patterns();
        initialize_pos_evidence_tables();
        return T;
    }

    public static SubLObject finalize_linkage() {
        finalize_pos_evidence_tables();
        finalize_link_regex_patterns();
        return T;
    }

    public static SubLObject ensure_linkage_initialized() {
        if (NIL == link_regex_patterns_initializedP()) {
            initialize_link_regex_patterns();
        }
        if (NIL == pos_evidence_tables_initializedP()) {
            initialize_pos_evidence_tables();
        }
        return T;
    }

    public static SubLObject link_tree_patterns_initializedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != $category_pattern$.getDynamicValue(thread)) && (NIL != $word_pattern$.getDynamicValue(thread))) && (NIL != $paren_pattern$.getDynamicValue(thread)));
    }

    public static SubLObject initialize_link_regex_patterns() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = $link_patterns$.getDynamicValue(thread);
        SubLObject keyXregex = NIL;
        keyXregex = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            $link_pattern_table$.setDynamicValue(cons(cons(keyXregex.first(), regular_expressions.compile_regular_expression(keyXregex.rest(), UNPROVIDED)), $link_pattern_table$.getDynamicValue(thread)), thread);
            cdolist_list_var = cdolist_list_var.rest();
            keyXregex = cdolist_list_var.first();
        } 
        return $link_pattern_table$.getDynamicValue(thread);
    }

    public static SubLObject finalize_link_regex_patterns() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = $link_pattern_table$.getDynamicValue(thread);
        SubLObject keyXpattern = NIL;
        keyXpattern = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            regular_expressions.discard_regular_expression_pattern(keyXpattern.rest());
            cdolist_list_var = cdolist_list_var.rest();
            keyXpattern = cdolist_list_var.first();
        } 
        $link_pattern_table$.setDynamicValue(NIL, thread);
        return $link_pattern_table$.getDynamicValue(thread);
    }

    public static SubLObject link_regex_patterns_initializedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $link_pattern_table$.getDynamicValue(thread);
    }

    public static SubLObject initialize_pos_evidence_tables() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $llink_table$.setGlobalValue(alist_to_hashtable($left_link_to_class$.getDynamicValue(thread), EQUAL));
        $rlink_table$.setGlobalValue(alist_to_hashtable($right_link_to_class$.getDynamicValue(thread), EQUAL));
        $pos_class_table$.setGlobalValue(alist_to_hashtable($penn_pos_to_classes$.getGlobalValue(), UNPROVIDED));
        $class_pos_table$.setGlobalValue(alist_to_hashtable_reverse($penn_pos_to_classes$.getGlobalValue(), UNPROVIDED));
        $word_pos_probabilities$.setGlobalValue(file_hash_table.open_file_hash_table_read_only($str66$data_pos_tagging_states_fht, symbol_function(EQUAL), $IMAGE_INDEPENDENT_CFASL));
        return NIL;
    }

    public static SubLObject finalize_pos_evidence_tables() {
        $llink_table$.setGlobalValue(NIL);
        $rlink_table$.setGlobalValue(NIL);
        $pos_class_table$.setGlobalValue(NIL);
        $class_pos_table$.setGlobalValue(NIL);
        if (NIL != file_hash_table.file_hash_table_p($word_pos_probabilities$.getGlobalValue())) {
            file_hash_table.finalize_file_hash_table($word_pos_probabilities$.getGlobalValue());
        }
        $word_pos_probabilities$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject pos_evidence_tables_initializedP() {
        return makeBoolean(((((NIL != $llink_table$.getGlobalValue()) && (NIL != $rlink_table$.getGlobalValue())) && (NIL != $pos_class_table$.getGlobalValue())) && (NIL != $class_pos_table$.getGlobalValue())) && (NIL != $word_pos_probabilities$.getGlobalValue()));
    }

    public static SubLObject alist_to_hashtable(final SubLObject list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        assert NIL != listp(list) : "Types.listp(list) " + "CommonSymbols.NIL != Types.listp(list) " + list;
        final SubLObject table = make_hash_table(length(list), test, UNPROVIDED);
        SubLObject cdolist_list_var = list;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sethash(entry.first(), table, entry.rest());
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return table;
    }

    public static SubLObject alist_to_hashtable_reverse(final SubLObject list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        assert NIL != listp(list) : "Types.listp(list) " + "CommonSymbols.NIL != Types.listp(list) " + list;
        final SubLObject table = make_hash_table(length(list), test, UNPROVIDED);
        SubLObject cdolist_list_var = list;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = entry.rest();
            SubLObject key = NIL;
            key = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                SubLObject value = gethash(key, table, UNPROVIDED);
                value = cons(entry.first(), value);
                sethash(key, table, value);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                key = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return table;
    }

    public static SubLObject link_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_linkage_link(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject link_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$link_native.class ? T : NIL;
    }

    public static SubLObject link_name(final SubLObject v_object) {
        assert NIL != link_p(v_object) : "linkage.link_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject link_left_word(final SubLObject v_object) {
        assert NIL != link_p(v_object) : "linkage.link_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject link_right_word(final SubLObject v_object) {
        assert NIL != link_p(v_object) : "linkage.link_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_link_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != link_p(v_object) : "linkage.link_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_link_left_word(final SubLObject v_object, final SubLObject value) {
        assert NIL != link_p(v_object) : "linkage.link_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_link_right_word(final SubLObject v_object, final SubLObject value) {
        assert NIL != link_p(v_object) : "linkage.link_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_link(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $link_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_link_name(v_new, current_value);
            } else
                if (pcase_var.eql($LEFT_WORD)) {
                    _csetf_link_left_word(v_new, current_value);
                } else
                    if (pcase_var.eql($RIGHT_WORD)) {
                        _csetf_link_right_word(v_new, current_value);
                    } else {
                        Errors.error($str87$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_link(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_LINK, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, link_name(obj));
        funcall(visitor_fn, obj, $SLOT, $LEFT_WORD, link_left_word(obj));
        funcall(visitor_fn, obj, $SLOT, $RIGHT_WORD, link_right_word(obj));
        funcall(visitor_fn, obj, $END, MAKE_LINK, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_link_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_link(obj, visitor_fn);
    }

    public static SubLObject print_linkage_link(final SubLObject link, final SubLObject stream, final SubLObject depth) {
        write_string($str93$__LINK_, stream, UNPROVIDED, UNPROVIDED);
        write_string(link_name(link), stream, UNPROVIDED, UNPROVIDED);
        write_string($str94$__, stream, UNPROVIDED, UNPROVIDED);
        if (NIL != link_left_word(link)) {
            write_string(methods.funcall_instance_method_with_0_args(link_left_word(link), GET_STRING), stream, UNPROVIDED, UNPROVIDED);
        }
        write_string($str96$__, stream, UNPROVIDED, UNPROVIDED);
        if (NIL != link_right_word(link)) {
            write_string(methods.funcall_instance_method_with_0_args(link_right_word(link), GET_STRING), stream, UNPROVIDED, UNPROVIDED);
        }
        write_string($str97$_, stream, UNPROVIDED, UNPROVIDED);
        return link;
    }

    public static SubLObject new_link(final SubLObject name) {
        final SubLObject link = make_link(UNPROVIDED);
        _csetf_link_name(link, name);
        return link;
    }

    public static SubLObject link_contains_wall_link_wordP(final SubLObject link) {
        return makeBoolean((NIL != wall_link_word_p(link_left_word(link))) || (NIL != wall_link_word_p(link_right_word(link))));
    }

    public static SubLObject link_contains_wall_word_linkage_wordP(final SubLObject link) {
        return makeBoolean((NIL != word_linkage.wall_word_linkage_wordP(link_left_word(link))) || (NIL != word_linkage.wall_word_linkage_wordP(link_right_word(link))));
    }

    public static SubLObject get_link_tree_modifiers(final SubLObject link_tree) {
        return classes.subloop_get_access_protected_instance_slot(link_tree, FIVE_INTEGER, MODIFIERS);
    }

    public static SubLObject set_link_tree_modifiers(final SubLObject link_tree, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(link_tree, value, FIVE_INTEGER, MODIFIERS);
    }

    public static SubLObject get_link_tree_index(final SubLObject link_tree) {
        return classes.subloop_get_access_protected_instance_slot(link_tree, FOUR_INTEGER, INDEX);
    }

    public static SubLObject set_link_tree_index(final SubLObject link_tree, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(link_tree, value, FOUR_INTEGER, INDEX);
    }

    public static SubLObject get_link_tree_mother(final SubLObject link_tree) {
        return classes.subloop_get_access_protected_instance_slot(link_tree, THREE_INTEGER, MOTHER);
    }

    public static SubLObject set_link_tree_mother(final SubLObject link_tree, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(link_tree, value, THREE_INTEGER, MOTHER);
    }

    public static SubLObject get_link_tree_heads(final SubLObject link_tree) {
        return classes.subloop_get_access_protected_instance_slot(link_tree, TWO_INTEGER, HEADS);
    }

    public static SubLObject set_link_tree_heads(final SubLObject link_tree, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(link_tree, value, TWO_INTEGER, HEADS);
    }

    public static SubLObject get_link_tree_pos(final SubLObject link_tree) {
        return classes.subloop_get_access_protected_instance_slot(link_tree, ONE_INTEGER, POS);
    }

    public static SubLObject set_link_tree_pos(final SubLObject link_tree, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(link_tree, value, ONE_INTEGER, POS);
    }

    public static SubLObject subloop_reserved_initialize_link_tree_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_link_tree_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        return NIL;
    }

    public static SubLObject link_tree_p(final SubLObject link_tree) {
        return classes.subloop_instanceof_class(link_tree, LINK_TREE);
    }

    public static SubLObject link_tree_get_modifiers_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_tree_method = NIL;
        final SubLObject modifiers = get_link_tree_modifiers(self);
        try {
            thread.throwStack.push($sym115$OUTER_CATCH_FOR_LINK_TREE_METHOD);
            try {
                sublisp_throw($sym115$OUTER_CATCH_FOR_LINK_TREE_METHOD, modifiers);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_tree_modifiers(self, modifiers);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_tree_method = Errors.handleThrowable(ccatch_env_var, $sym115$OUTER_CATCH_FOR_LINK_TREE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_tree_method;
    }

    public static SubLObject link_tree_get_modifieds_method(final SubLObject self) {
        return NIL;
    }

    public static SubLObject link_tree_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        return pprint_link_tree(self, stream, ZERO_INTEGER);
    }

    public static SubLObject link_tree_xml_method(final SubLObject self, final SubLObject stream, final SubLObject indent) {
        return link_tree_xml(self, stream, indent);
    }

    public static SubLObject link_tree_get_category_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_tree_method = NIL;
        final SubLObject pos = get_link_tree_pos(self);
        try {
            thread.throwStack.push($sym131$OUTER_CATCH_FOR_LINK_TREE_METHOD);
            try {
                sublisp_throw($sym131$OUTER_CATCH_FOR_LINK_TREE_METHOD, pos);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_tree_pos(self, pos);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_tree_method = Errors.handleThrowable(ccatch_env_var, $sym131$OUTER_CATCH_FOR_LINK_TREE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_tree_method;
    }

    public static SubLObject link_tree_get_root_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, GET_LINKAGE);
    }

    public static SubLObject link_tree_root_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_tree_method = NIL;
        final SubLObject mother = get_link_tree_mother(self);
        try {
            thread.throwStack.push($sym139$OUTER_CATCH_FOR_LINK_TREE_METHOD);
            try {
                sublisp_throw($sym139$OUTER_CATCH_FOR_LINK_TREE_METHOD, makeBoolean(NIL == mother));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_tree_mother(self, mother);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_tree_method = Errors.handleThrowable(ccatch_env_var, $sym139$OUTER_CATCH_FOR_LINK_TREE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_tree_method;
    }

    public static SubLObject link_tree_get_mother_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_tree_method = NIL;
        final SubLObject mother = get_link_tree_mother(self);
        try {
            thread.throwStack.push($sym143$OUTER_CATCH_FOR_LINK_TREE_METHOD);
            try {
                sublisp_throw($sym143$OUTER_CATCH_FOR_LINK_TREE_METHOD, mother);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_tree_mother(self, mother);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_tree_method = Errors.handleThrowable(ccatch_env_var, $sym143$OUTER_CATCH_FOR_LINK_TREE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_tree_method;
    }

    public static SubLObject link_tree_get_refs_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_tree_method = NIL;
        final SubLObject heads = get_link_tree_heads(self);
        try {
            thread.throwStack.push($sym147$OUTER_CATCH_FOR_LINK_TREE_METHOD);
            try {
                SubLObject refs = NIL;
                SubLObject cdolist_list_var = heads;
                SubLObject head = NIL;
                head = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$3 = methods.funcall_instance_method_with_0_args(head, GET_REFS);
                    SubLObject ref = NIL;
                    ref = cdolist_list_var_$3.first();
                    while (NIL != cdolist_list_var_$3) {
                        refs = cons(ref, refs);
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        ref = cdolist_list_var_$3.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    head = cdolist_list_var.first();
                } 
                sublisp_throw($sym147$OUTER_CATCH_FOR_LINK_TREE_METHOD, refs);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_tree_heads(self, heads);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_tree_method = Errors.handleThrowable(ccatch_env_var, $sym147$OUTER_CATCH_FOR_LINK_TREE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_tree_method;
    }

    public static SubLObject link_tree_get_index_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_tree_method = NIL;
        final SubLObject index = get_link_tree_index(self);
        try {
            thread.throwStack.push($sym151$OUTER_CATCH_FOR_LINK_TREE_METHOD);
            try {
                sublisp_throw($sym151$OUTER_CATCH_FOR_LINK_TREE_METHOD, index);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_tree_index(self, index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_tree_method = Errors.handleThrowable(ccatch_env_var, $sym151$OUTER_CATCH_FOR_LINK_TREE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_tree_method;
    }

    public static SubLObject link_tree_get_sister_method(final SubLObject self, final SubLObject i) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_tree_method = NIL;
        final SubLObject index = get_link_tree_index(self);
        final SubLObject mother = get_link_tree_mother(self);
        try {
            thread.throwStack.push($sym156$OUTER_CATCH_FOR_LINK_TREE_METHOD);
            try {
                assert NIL != integerp(i) : "Types.integerp(i) " + "CommonSymbols.NIL != Types.integerp(i) " + i;
                if (NIL != index) {
                    final SubLObject sister_index = add(index, i);
                    sublisp_throw($sym156$OUTER_CATCH_FOR_LINK_TREE_METHOD, (NIL != mother) && (NIL != subl_promotions.non_negative_integer_p(sister_index)) ? methods.funcall_instance_method_with_1_args(mother, GET_DAUGHTER, add(index, i)) : NIL);
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_tree_index(self, index);
                    set_link_tree_mother(self, mother);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_tree_method = Errors.handleThrowable(ccatch_env_var, $sym156$OUTER_CATCH_FOR_LINK_TREE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_tree_method;
    }

    public static SubLObject link_tree_yield_method(final SubLObject self) {
        return NIL;
    }

    public static SubLObject link_tree_get_ancestors_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_tree_method = NIL;
        final SubLObject mother = get_link_tree_mother(self);
        try {
            thread.throwStack.push($sym165$OUTER_CATCH_FOR_LINK_TREE_METHOD);
            try {
                sublisp_throw($sym165$OUTER_CATCH_FOR_LINK_TREE_METHOD, NIL != mother ? cons(mother, methods.funcall_instance_method_with_0_args(mother, GET_ANCESTORS)) : NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_tree_mother(self, mother);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_tree_method = Errors.handleThrowable(ccatch_env_var, $sym165$OUTER_CATCH_FOR_LINK_TREE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_tree_method;
    }

    public static SubLObject link_tree_depth_method(final SubLObject self) {
        SubLObject depth = ZERO_INTEGER;
        for (SubLObject tree = self; NIL == methods.funcall_instance_method_with_0_args(tree, ROOT_P); tree = methods.funcall_instance_method_with_0_args(tree, GET_MOTHER)) {
            depth = add(depth, ONE_INTEGER);
        }
        return depth;
    }

    public static SubLObject get_link_phrase_daughters(final SubLObject link_phrase) {
        return classes.subloop_get_access_protected_instance_slot(link_phrase, SIX_INTEGER, DAUGHTERS);
    }

    public static SubLObject set_link_phrase_daughters(final SubLObject link_phrase, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(link_phrase, value, SIX_INTEGER, DAUGHTERS);
    }

    public static SubLObject subloop_reserved_initialize_link_phrase_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_link_phrase_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_PHRASE, DAUGHTERS, NIL);
        return NIL;
    }

    public static SubLObject link_phrase_p(final SubLObject link_phrase) {
        return classes.subloop_instanceof_class(link_phrase, LINK_PHRASE);
    }

    public static SubLObject do_link_tree_subtrees(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list175);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject subtree = NIL;
        SubLObject phrase = NIL;
        destructuring_bind_must_consp(current, datum, $list175);
        subtree = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list175);
        phrase = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject stack = $sym176$STACK;
            return list(CLET, list(subtree, bq_cons(stack, $list178)), list(STACK_PUSH, phrase, stack), listS(UNTIL, list(STACK_EMPTY_P, stack), list(CSETQ, subtree, list(STACK_POP, stack)), list(PWHEN, list(LINK_PHRASE_P, subtree), list(DO_VECTOR, list(DAUGHTER, listS(GET_SLOT, subtree, $list189)), list(STACK_PUSH, DAUGHTER, stack))), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list175);
        return NIL;
    }

    public static SubLObject link_phrase_get_conjunction_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_phrase_method = NIL;
        final SubLObject daughters = get_link_phrase_daughters(self);
        try {
            thread.throwStack.push($sym192$OUTER_CATCH_FOR_LINK_PHRASE_METHOD);
            try {
                final SubLObject vector_var = daughters;
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject daughter;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    daughter = aref(vector_var, element_num);
                    if (NIL != conjunction_link_word_p(daughter)) {
                        sublisp_throw($sym192$OUTER_CATCH_FOR_LINK_PHRASE_METHOD, daughter);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_phrase_daughters(self, daughters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_phrase_method = Errors.handleThrowable(ccatch_env_var, $sym192$OUTER_CATCH_FOR_LINK_PHRASE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_phrase_method;
    }

    public static SubLObject link_phrase_get_string_method(final SubLObject self) {
        return concatenate_word_strings(methods.funcall_instance_method_with_0_args(self, YIELD));
    }

    public static SubLObject link_phrase_daughter_count_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_phrase_method = NIL;
        final SubLObject daughters = get_link_phrase_daughters(self);
        try {
            thread.throwStack.push($sym198$OUTER_CATCH_FOR_LINK_PHRASE_METHOD);
            try {
                sublisp_throw($sym198$OUTER_CATCH_FOR_LINK_PHRASE_METHOD, length(daughters));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_phrase_daughters(self, daughters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_phrase_method = Errors.handleThrowable(ccatch_env_var, $sym198$OUTER_CATCH_FOR_LINK_PHRASE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_phrase_method;
    }

    public static SubLObject link_phrase_get_daughter_method(final SubLObject self, final SubLObject i) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_phrase_method = NIL;
        final SubLObject daughters = get_link_phrase_daughters(self);
        try {
            thread.throwStack.push($sym201$OUTER_CATCH_FOR_LINK_PHRASE_METHOD);
            try {
                assert NIL != subl_promotions.non_negative_integer_p(i) : "subl_promotions.non_negative_integer_p(i) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(i) " + i;
                sublisp_throw($sym201$OUTER_CATCH_FOR_LINK_PHRASE_METHOD, i.numL(length(daughters)) ? aref(daughters, i) : NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_phrase_daughters(self, daughters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_phrase_method = Errors.handleThrowable(ccatch_env_var, $sym201$OUTER_CATCH_FOR_LINK_PHRASE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_phrase_method;
    }

    public static SubLObject link_phrase_get_head_daughters_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != methods.$report_default_method_callsP$.getDynamicValue(thread)) {
            Errors.warn($str206$Default_method_call__a_on_class__, GET_HEAD_DAUGHTERS, LINK_PHRASE);
        }
        return NIL;
    }

    public static SubLObject link_phrase_get_head_daughter_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, GET_HEAD_DAUGHTERS).first();
    }

    public static SubLObject link_phrase_get_semantic_head_daughters_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, GET_HEAD_DAUGHTERS);
    }

    public static SubLObject link_phrase_cyclify_int_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_phrase_method = NIL;
        final SubLObject heads = get_link_tree_heads(self);
        try {
            thread.throwStack.push($sym216$OUTER_CATCH_FOR_LINK_PHRASE_METHOD);
            try {
                final SubLObject scycls = subcyclifier.subcyclifier_cyclify(self);
                if (NIL != scycls) {
                    sublisp_throw($sym216$OUTER_CATCH_FOR_LINK_PHRASE_METHOD, scycls);
                }
                final SubLObject heads_$4 = methods.funcall_instance_method_with_0_args(self, GET_HEADS);
                SubLObject cycls = NIL;
                SubLObject cdolist_list_var = heads_$4;
                SubLObject head = NIL;
                head = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    cycls = cons(methods.funcall_instance_method_with_0_args(head, CYCLIFY_INT), cycls);
                    cdolist_list_var = cdolist_list_var.rest();
                    head = cdolist_list_var.first();
                } 
                sublisp_throw($sym216$OUTER_CATCH_FOR_LINK_PHRASE_METHOD, Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.cross_products(cycls)));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_tree_heads(self, heads);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_phrase_method = Errors.handleThrowable(ccatch_env_var, $sym216$OUTER_CATCH_FOR_LINK_PHRASE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_phrase_method;
    }

    public static SubLObject link_phrase_yield_method(final SubLObject self) {
        SubLObject yield = NIL;
        SubLObject daughter = NIL;
        final SubLObject stack = stacks.create_stack();
        stacks.stack_push(self, stack);
        while (NIL == stacks.stack_empty_p(stack)) {
            daughter = stacks.stack_pop(stack);
            if (NIL != link_phrase_p(daughter)) {
                final SubLObject vector_var = instances.get_slot(daughter, DAUGHTERS);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject daughter_$5;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    daughter_$5 = aref(vector_var, element_num);
                    stacks.stack_push(daughter_$5, stack);
                }
            }
            if (NIL != link_word_p(daughter)) {
                yield = cons(daughter, yield);
            }
        } 
        return yield;
    }

    public static SubLObject link_phrase_get_heads_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_phrase_method = NIL;
        SubLObject heads = get_link_tree_heads(self);
        try {
            thread.throwStack.push($sym223$OUTER_CATCH_FOR_LINK_PHRASE_METHOD);
            try {
                if (NIL == heads) {
                    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_HEAD_DAUGHTERS);
                    SubLObject head_daughter = NIL;
                    head_daughter = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$6 = methods.funcall_instance_method_with_0_args(head_daughter, GET_HEADS);
                        SubLObject head = NIL;
                        head = cdolist_list_var_$6.first();
                        while (NIL != cdolist_list_var_$6) {
                            heads = cons(head, heads);
                            cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                            head = cdolist_list_var_$6.first();
                        } 
                        cdolist_list_var = cdolist_list_var.rest();
                        head_daughter = cdolist_list_var.first();
                    } 
                    heads = nreverse(heads);
                }
                sublisp_throw($sym223$OUTER_CATCH_FOR_LINK_PHRASE_METHOD, heads);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_tree_heads(self, heads);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_phrase_method = Errors.handleThrowable(ccatch_env_var, $sym223$OUTER_CATCH_FOR_LINK_PHRASE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_phrase_method;
    }

    public static SubLObject link_phrase_get_head_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, GET_HEADS).first();
    }

    public static SubLObject link_phrase_get_semantic_heads_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_phrase_method = NIL;
        final SubLObject heads = get_link_tree_heads(self);
        try {
            thread.throwStack.push($sym230$OUTER_CATCH_FOR_LINK_PHRASE_METHOD);
            try {
                SubLObject heads_$7 = NIL;
                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_HEAD_DAUGHTERS);
                SubLObject head_daughter = NIL;
                head_daughter = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$8 = methods.funcall_instance_method_with_0_args(head_daughter, GET_SEMANTIC_HEADS);
                    SubLObject head = NIL;
                    head = cdolist_list_var_$8.first();
                    while (NIL != cdolist_list_var_$8) {
                        final SubLObject item_var = head;
                        if (NIL == member(item_var, heads_$7, symbol_function(EQL), symbol_function(IDENTITY))) {
                            heads_$7 = cons(item_var, heads_$7);
                        }
                        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                        head = cdolist_list_var_$8.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    head_daughter = cdolist_list_var.first();
                } 
                sublisp_throw($sym230$OUTER_CATCH_FOR_LINK_PHRASE_METHOD, nreverse(heads_$7));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_tree_heads(self, heads);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_phrase_method = Errors.handleThrowable(ccatch_env_var, $sym230$OUTER_CATCH_FOR_LINK_PHRASE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_phrase_method;
    }

    public static SubLObject link_phrase_preterminal_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_phrase_method = NIL;
        final SubLObject daughters = get_link_phrase_daughters(self);
        try {
            thread.throwStack.push($sym234$OUTER_CATCH_FOR_LINK_PHRASE_METHOD);
            try {
                sublisp_throw($sym234$OUTER_CATCH_FOR_LINK_PHRASE_METHOD, makeBoolean(NIL == list_utilities.find_if_not(LINK_WORD_P, daughters, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_phrase_daughters(self, daughters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_phrase_method = Errors.handleThrowable(ccatch_env_var, $sym234$OUTER_CATCH_FOR_LINK_PHRASE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_phrase_method;
    }

    public static SubLObject link_phrase_idiom_p_method(final SubLObject self) {
        final SubLObject words = methods.funcall_instance_method_with_0_args(self, YIELD);
        if (NIL != methods.funcall_instance_method_with_2_args(words.first(), GET_DIRECTLY_RELATED, $ID_PATTERN, $LEFT)) {
            return NIL;
        }
        SubLObject cdolist_list_var = butlast(words, UNPROVIDED);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == methods.funcall_instance_method_with_2_args(word, GET_DIRECTLY_RELATED, $ID_PATTERN, $RIGHT)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return methods.funcall_instance_method_with_2_args(last(words, UNPROVIDED).first(), GET_DIRECTLY_RELATED, $ID_PATTERN, $LEFT);
    }

    public static SubLObject link_phrase_coordinate_phrase_p_method(final SubLObject self) {
        return list_utilities.sublisp_boolean(methods.funcall_instance_method_with_0_args(self, GET_CONJUNCTION));
    }

    public static SubLObject link_phrase_get_linkage_method(final SubLObject self) {
        SubLObject tree;
        for (tree = self; NIL == link_word_p(tree); tree = methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER)) {
        }
        return methods.funcall_instance_method_with_0_args(tree, GET_LINKAGE);
    }

    public static SubLObject link_phrase_find_method(final SubLObject self, final SubLObject predicate, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_phrase_method = NIL;
        final SubLObject daughters = get_link_phrase_daughters(self);
        try {
            thread.throwStack.push($sym252$OUTER_CATCH_FOR_LINK_PHRASE_METHOD);
            try {
                SubLObject daughter = NIL;
                final SubLObject stop = (NIL != end) ? end : length(daughters);
                SubLObject found = NIL;
                if (start.numG(stop)) {
                    Errors.warn($str253$start__A__after_stop__A__when_fin, new SubLObject[]{ start, stop, predicate, self });
                }
                SubLObject i;
                for (i = NIL, i = start; !i.numGE(stop); i = number_utilities.f_1X(i)) {
                    daughter = methods.funcall_instance_method_with_1_args(self, GET_DAUGHTER, i);
                    if (NIL != funcall(predicate, daughter)) {
                        found = cons(daughter, found);
                    }
                }
                sublisp_throw($sym252$OUTER_CATCH_FOR_LINK_PHRASE_METHOD, nreverse(found));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_phrase_daughters(self, daughters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_phrase_method = Errors.handleThrowable(ccatch_env_var, $sym252$OUTER_CATCH_FOR_LINK_PHRASE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_phrase_method;
    }

    public static SubLObject link_phrase_find_first_method(final SubLObject self, final SubLObject predicate, SubLObject start) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_phrase_method = NIL;
        final SubLObject daughters = get_link_phrase_daughters(self);
        try {
            thread.throwStack.push($sym258$OUTER_CATCH_FOR_LINK_PHRASE_METHOD);
            try {
                SubLObject daughter = NIL;
                SubLObject i;
                for (i = NIL, i = start; !i.numGE(length(daughters)); i = number_utilities.f_1X(i)) {
                    daughter = link_phrase_get_daughter_method(self, i);
                    if (NIL != funcall(predicate, daughter)) {
                        sublisp_throw($sym258$OUTER_CATCH_FOR_LINK_PHRASE_METHOD, daughter);
                    }
                }
                sublisp_throw($sym258$OUTER_CATCH_FOR_LINK_PHRASE_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_phrase_daughters(self, daughters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_phrase_method = Errors.handleThrowable(ccatch_env_var, $sym258$OUTER_CATCH_FOR_LINK_PHRASE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_phrase_method;
    }

    public static SubLObject link_phrase_find_last_method(final SubLObject self, final SubLObject predicate, SubLObject end) {
        if (end == UNPROVIDED) {
            end = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_phrase_method = NIL;
        final SubLObject daughters = get_link_phrase_daughters(self);
        try {
            thread.throwStack.push($sym263$OUTER_CATCH_FOR_LINK_PHRASE_METHOD);
            try {
                SubLObject daughter = NIL;
                SubLObject i;
                for (i = NIL, i = (NIL != end) ? end : number_utilities.f_1_(length(daughters)); !i.isNegative(); i = number_utilities.f_1_(i)) {
                    daughter = link_phrase_get_daughter_method(self, i);
                    if (NIL != funcall(predicate, daughter)) {
                        sublisp_throw($sym263$OUTER_CATCH_FOR_LINK_PHRASE_METHOD, daughter);
                    }
                }
                sublisp_throw($sym263$OUTER_CATCH_FOR_LINK_PHRASE_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_phrase_daughters(self, daughters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_phrase_method = Errors.handleThrowable(ccatch_env_var, $sym263$OUTER_CATCH_FOR_LINK_PHRASE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_phrase_method;
    }

    public static SubLObject pprint_link_phrase(final SubLObject lp, final SubLObject stream, final SubLObject level) {
        final SubLObject indent = THREE_INTEGER;
        final SubLObject base_column = multiply(level, indent);
        string_utilities.indent(stream, base_column);
        write_string($str265$__LP_, stream, UNPROVIDED, UNPROVIDED);
        princ(methods.funcall_instance_method_with_0_args(lp, GET_CATEGORY), stream);
        write_string($str266$__, stream, UNPROVIDED, UNPROVIDED);
        terpri(stream);
        final SubLObject vector_var = get_link_phrase_daughters(lp);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            daughter = aref(vector_var, element_num);
            pprint_link_tree(daughter, stream, add(level, ONE_INTEGER));
            terpri(stream);
        }
        string_utilities.indent(stream, base_column);
        write_string($str97$_, stream, UNPROVIDED, UNPROVIDED);
        return lp;
    }

    public static SubLObject pprint_link_word(final SubLObject lw, final SubLObject stream, final SubLObject level) {
        final SubLObject indent = THREE_INTEGER;
        final SubLObject base_column = multiply(level, indent);
        string_utilities.indent(stream, base_column);
        write_string($str267$__LW_, stream, UNPROVIDED, UNPROVIDED);
        if (NIL != lw) {
            princ(methods.funcall_instance_method_with_0_args(lw, GET_CATEGORY), stream);
        }
        write_string($str268$_, stream, UNPROVIDED, UNPROVIDED);
        if ((NIL != lw) && (NIL != methods.funcall_instance_method_with_0_args(lw, GET_RANKED_LEXES))) {
            write_string($str270$_, stream, UNPROVIDED, UNPROVIDED);
        }
        write_string($str94$__, stream, UNPROVIDED, UNPROVIDED);
        if ((NIL != lw) && (NIL != methods.funcall_instance_method_with_0_args(lw, GET_STRING))) {
            write_string(methods.funcall_instance_method_with_0_args(lw, GET_STRING), stream, UNPROVIDED, UNPROVIDED);
        }
        write_string($str97$_, stream, UNPROVIDED, UNPROVIDED);
        return lw;
    }

    public static SubLObject pprint_link_tree(final SubLObject lt, final SubLObject stream, final SubLObject level) {
        return NIL != link_phrase_p(lt) ? pprint_link_phrase(lt, stream, level) : pprint_link_word(lt, stream, level);
    }

    public static SubLObject link_tree_xml(final SubLObject lt, final SubLObject stream, final SubLObject indent) {
        return NIL != link_phrase_p(lt) ? link_phrase_xml(lt, stream, indent) : link_word_xml(lt, stream, indent);
    }

    public static SubLObject link_word_xml(final SubLObject lw, final SubLObject stream, final SubLObject indent) {
        string_utilities.tab(indent, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return format(stream, $str271$_word_cat___a__class___a___a__wor, new SubLObject[]{ methods.funcall_instance_method_with_0_args(lw, GET_CATEGORY), subloop_structures.class_name(methods.funcall_instance_method_with_0_args(lw, CLASS_OF)), methods.funcall_instance_method_with_0_args(lw, GET_STRING) });
    }

    public static SubLObject link_xml(final SubLObject link, final SubLObject stream, final SubLObject indent) {
        string_utilities.tab(indent, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return format(stream, $str273$_link_name___a__left___a__right__, new SubLObject[]{ link_name(link), methods.funcall_instance_method_with_0_args(link_left_word(link), GET_ABS_INDEX), methods.funcall_instance_method_with_0_args(link_right_word(link), GET_ABS_INDEX) });
    }

    public static SubLObject link_phrase_xml(final SubLObject lp, final SubLObject stream, final SubLObject indent) {
        string_utilities.tab(indent, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format(stream, $str275$_phrase_cat___a____, methods.funcall_instance_method_with_0_args(lp, GET_CATEGORY));
        final SubLObject vector_var = get_link_phrase_daughters(lp);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            daughter = aref(vector_var, element_num);
            link_tree_xml(daughter, stream, add(indent, THREE_INTEGER));
        }
        string_utilities.tab(indent, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format(stream, $str276$__phrase___);
        return NIL;
    }

    public static SubLObject link_phrase_expression_p(final SubLObject expr) {
        return list_utilities.proper_list_p(expr);
    }

    public static SubLObject link_word_expression_p(final SubLObject expr) {
        return stringp(expr);
    }

    public static SubLObject link_phrase_expression_category(final SubLObject expr) {
        return expr.first();
    }

    public static SubLObject link_phrase_expression_daughters(final SubLObject expr) {
        return expr.rest();
    }

    public static SubLObject new_counter(SubLObject initial_value) {
        if (initial_value == UNPROVIDED) {
            initial_value = ZERO_INTEGER;
        }
        return list(initial_value);
    }

    public static SubLObject inc_counter(final SubLObject counter, SubLObject increment) {
        if (increment == UNPROVIDED) {
            increment = ONE_INTEGER;
        }
        rplaca(counter, add(counter.first(), increment));
        return counter;
    }

    public static SubLObject counter_value(final SubLObject counter) {
        return counter.first();
    }

    public static SubLObject retokenize_link_tree(final SubLObject tree, final SubLObject lost_tokens) {
        if (NIL != link_phrase_p(tree)) {
            return retokenize_link_phrase(tree, lost_tokens);
        }
        instances.set_slot(tree, ABS_INDEX, subtract(methods.funcall_instance_method_with_0_args(tree, GET_ABS_INDEX), counter_value(lost_tokens)));
        return tree;
    }

    public static SubLObject retokenize_link_phrase(final SubLObject phrase, final SubLObject lost_tokens) {
        if (NIL != methods.funcall_instance_method_with_0_args(phrase, PRETERMINAL_P)) {
            return retokenize_preterminal(phrase, lost_tokens);
        }
        if (NIL != methods.funcall_instance_method_with_0_args(phrase, IDIOM_P)) {
            return retokenize_idiom(phrase, lost_tokens);
        }
        if (((NIL != verbal_link_phrase_p(phrase)) && (NIL == sentential_link_phrase_p(phrase))) && (NIL != vp_verb_in_idiomP(phrase))) {
            return retokenize_vp_with_verb_idiom(phrase, lost_tokens);
        }
        final SubLObject vector_var = get_link_phrase_daughters(phrase);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            daughter = aref(vector_var, element_num);
            retokenize_link_tree(daughter, lost_tokens);
        }
        return phrase;
    }

    public static SubLObject vp_verb_in_idiomP(final SubLObject vp) {
        final SubLObject verb = aref(get_link_phrase_daughters(vp), ZERO_INTEGER);
        if (((NIL != verb_link_word_p(verb)) && (NIL != methods.funcall_instance_method_with_2_args(verb, GET_DIRECTLY_RELATED, $ID_PATTERN, $RIGHT).first())) && (NIL == methods.funcall_instance_method_with_2_args(verb, GET_DIRECTLY_RELATED, $ID_PATTERN, $LEFT).first())) {
            return T;
        }
        return NIL;
    }

    public static SubLObject retokenize_preterminal(final SubLObject phrase, final SubLObject lost_tokens) {
        SubLObject index = ZERO_INTEGER;
        final SubLObject last_index = number_utilities.f_1_(length(get_link_phrase_daughters(phrase)));
        final SubLObject limit = methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(phrase, GET_DAUGHTER, last_index), GET_ABS_INDEX);
        SubLObject new_tokens = NIL;
        while (!index.numG(last_index)) {
            final SubLObject daughter = methods.funcall_instance_method_with_1_args(phrase, GET_DAUGHTER, index);
            SubLObject sub_tokens = list(daughter);
            SubLObject sub_token = next_subtoken(daughter, limit);
            index = add(index, ONE_INTEGER);
            while (NIL != sub_token) {
                index = add(index, ONE_INTEGER);
                sub_tokens = cons(sub_token, sub_tokens);
                sub_token = next_subtoken(sub_token, limit);
            } 
            new_tokens = cons(merge_subtokens(nreverse(sub_tokens), lost_tokens), new_tokens);
        } 
        new_tokens = nreverse(new_tokens);
        SubLObject i = ZERO_INTEGER;
        SubLObject cdolist_list_var = new_tokens;
        SubLObject token = NIL;
        token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            instances.set_slot(token, INDEX, i);
            instances.set_slot(token, MOTHER, phrase);
            i = add(i, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        } 
        set_link_phrase_daughters(phrase, apply(VECTOR, new_tokens));
        return phrase;
    }

    public static SubLObject next_subtoken(final SubLObject token, final SubLObject limit) {
        final SubLObject subtoken = methods.funcall_instance_method_with_2_args(token, GET_DIRECTLY_RELATED, $ID_PATTERN, $RIGHT).first();
        if ((NIL != subtoken) && methods.funcall_instance_method_with_0_args(subtoken, GET_ABS_INDEX).numLE(limit)) {
            return subtoken;
        }
        return NIL;
    }

    public static SubLObject retokenize_idiom(final SubLObject phrase, final SubLObject lost_tokens) {
        final SubLObject only_token = merge_subtokens(methods.funcall_instance_method_with_0_args(phrase, YIELD), lost_tokens);
        final SubLObject new_daughters = vector(new SubLObject[]{ only_token });
        instances.set_slot(phrase, DAUGHTERS, new_daughters);
        instances.set_slot(only_token, MOTHER, phrase);
        return phrase;
    }

    public static SubLObject retokenize_vp_with_verb_idiom(final SubLObject phrase, final SubLObject lost_tokens) {
        final SubLObject dtrs = vector_utilities.vector_elements(get_link_phrase_daughters(phrase), UNPROVIDED);
        SubLObject used_dtrs = list(dtrs.first());
        SubLObject idiom_words = list(dtrs.first());
        SubLObject doneP = NIL;
        SubLObject unused_dtrs = NIL;
        SubLObject idiom = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = dtrs.rest();
            SubLObject dtr = NIL;
            dtr = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                if (NIL != link_phrase_p(dtr)) {
                    final SubLObject dtr_words = methods.funcall_instance_method_with_0_args(dtr, YIELD);
                    SubLObject dtr_in_idiomP = T;
                    SubLObject cdolist_list_var = dtr_words;
                    SubLObject word = NIL;
                    word = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL == methods.funcall_instance_method_with_2_args(word, GET_DIRECTLY_RELATED, $ID_PATTERN, $LEFT)) {
                            dtr_in_idiomP = NIL;
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        word = cdolist_list_var.first();
                    } 
                    if (NIL != dtr_in_idiomP) {
                        idiom_words = cconcatenate(idiom_words, dtr_words);
                        used_dtrs = cons(dtr, used_dtrs);
                    } else {
                        doneP = T;
                    }
                } else
                    if (NIL != methods.funcall_instance_method_with_2_args(dtr, GET_DIRECTLY_RELATED, $ID_PATTERN, $LEFT)) {
                        idiom_words = cconcatenate(idiom_words, list(dtr));
                        used_dtrs = cons(dtr, used_dtrs);
                    } else {
                        doneP = T;
                    }

                csome_list_var = csome_list_var.rest();
                dtr = csome_list_var.first();
            } 
        }
        SubLObject cdolist_list_var2;
        unused_dtrs = cdolist_list_var2 = list_utilities.ordered_set_difference(dtrs, used_dtrs, UNPROVIDED, UNPROVIDED);
        SubLObject dtr = NIL;
        dtr = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            retokenize_link_tree(dtr, lost_tokens);
            cdolist_list_var2 = cdolist_list_var2.rest();
            dtr = cdolist_list_var2.first();
        } 
        if (length(idiom_words).numG(ONE_INTEGER)) {
            idiom = merge_subtokens(idiom_words, lost_tokens);
            instances.set_slot(idiom, INDEX, ZERO_INTEGER);
            instances.set_slot(idiom, MOTHER, phrase);
            set_link_phrase_daughters(phrase, apply(VECTOR, cconcatenate(list(idiom), unused_dtrs)));
        } else {
            retokenize_link_tree(idiom_words.first(), lost_tokens);
        }
        return phrase;
    }

    public static SubLObject merge_subtokens(final SubLObject tokens, final SubLObject lost_tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.singletonP(tokens)) {
            set_link_word_abs_index(tokens.first(), subtract(methods.funcall_instance_method_with_0_args(tokens.first(), GET_ABS_INDEX), counter_value(lost_tokens)));
            return tokens.first();
        }
        SubLObject new_token = NIL;
        final SubLObject penn = get_mw_lexeme_tag(tokens);
        final SubLObject new_string = concatenate_word_strings(tokens);
        final SubLObject new_left_links = get_mw_lexeme_left_links(tokens);
        final SubLObject new_right_links = get_mw_lexeme_right_links(tokens);
        final SubLObject v_linkage = methods.funcall_instance_method_with_0_args(tokens.first(), GET_LINKAGE);
        final SubLObject v_context = methods.funcall_instance_method_with_0_args(tokens.first(), GET_CONTEXT);
        thread.resetMultipleValues();
        final SubLObject v_class = get_link_word_class(new_string, NIL, Mapping.mapcar(LINK_NAME, new_left_links), Mapping.mapcar(LINK_NAME, new_right_links), penn);
        final SubLObject pos = thread.secondMultipleValue();
        thread.resetMultipleValues();
        new_token = object.new_class_instance(v_class);
        SubLObject cdolist_list_var = new_left_links;
        SubLObject left_link = NIL;
        left_link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            _csetf_link_right_word(left_link, new_token);
            cdolist_list_var = cdolist_list_var.rest();
            left_link = cdolist_list_var.first();
        } 
        cdolist_list_var = new_right_links;
        SubLObject right_link = NIL;
        right_link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            _csetf_link_left_word(right_link, new_token);
            cdolist_list_var = cdolist_list_var.rest();
            right_link = cdolist_list_var.first();
        } 
        set_link_tree_pos(new_token, pos);
        set_link_word_linkage(new_token, v_linkage);
        set_link_word_context(new_token, v_context);
        set_link_word_string(new_token, new_string);
        set_link_word_abs_index(new_token, subtract(methods.funcall_instance_method_with_0_args(tokens.first(), GET_ABS_INDEX), counter_value(lost_tokens)));
        set_link_word_left_links(new_token, new_left_links);
        set_link_word_right_links(new_token, new_right_links);
        inc_counter(lost_tokens, number_utilities.f_1_(length(tokens)));
        return new_token;
    }

    public static SubLObject concatenate_word_strings(final SubLObject words) {
        final SubLObject last = last(words, UNPROVIDED).first();
        SubLObject string = NIL;
        SubLObject out = NIL;
        try {
            out = make_private_string_output_stream();
            SubLObject cdolist_list_var = words;
            SubLObject word = NIL;
            word = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                princ(methods.funcall_instance_method_with_0_args(word, GET_STRING), out);
                if (!word.eql(last)) {
                    princ($$$_, out);
                }
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            } 
            string = get_output_stream_string(out);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(out, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        string = string_utilities.replace_substring(string, $str280$__, $str281$_);
        string = string_utilities.replace_substring(string, $str282$__, $str53$_);
        string = string_utilities.replace_substring(string, $str283$__, $str284$_);
        return string;
    }

    public static SubLObject get_mw_lexeme_tag(final SubLObject words) {
        final SubLObject string = concatenate_word_strings(words);
        final SubLObject lexicon = object.new_class_instance(CYCLIFIER_LEXICON);
        methods.funcall_instance_method_with_1_args(lexicon, SET_CASE_SENSITIVITY, $OFF);
        final SubLObject lex = methods.funcall_instance_method_with_1_args(lexicon, GET, string).first();
        final SubLObject penn_tag = (NIL != lex) ? methods.funcall_instance_method_with_1_args(lex, GET, $PENN_TAGS).first() : methods.funcall_instance_method_with_0_args(last(words, UNPROVIDED).first(), GET_CATEGORY);
        return NIL != penn_tag ? penn_tag : NIL;
    }

    public static SubLObject link_left_word_equal(final SubLObject link1, final SubLObject link2) {
        return makeBoolean(link_left_word(link1).eql(link_left_word(link2)) && (NIL != Strings.stringE(link_name(link1), link_name(link2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject link_right_word_equal(final SubLObject link1, final SubLObject link2) {
        return makeBoolean(link_right_word(link1).eql(link_right_word(link2)) && (NIL != Strings.stringE(link_name(link1), link_name(link2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject get_mw_lexeme_left_links(final SubLObject words) {
        if (NIL == words) {
            return NIL;
        }
        SubLObject left_links = NIL;
        final SubLObject start = methods.funcall_instance_method_with_0_args(words.first(), GET_ABS_INDEX);
        SubLObject cdolist_list_var = words;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$9 = get_left_links_ending(word, start);
            SubLObject link = NIL;
            link = cdolist_list_var_$9.first();
            while (NIL != cdolist_list_var_$9) {
                final SubLObject item_var = link;
                if (NIL == member(item_var, left_links, LINK_LEFT_WORD_EQUAL, symbol_function(IDENTITY))) {
                    left_links = cons(item_var, left_links);
                }
                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                link = cdolist_list_var_$9.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return left_links;
    }

    public static SubLObject get_mw_lexeme_right_links(final SubLObject words) {
        if (NIL == words) {
            return NIL;
        }
        SubLObject right_links = NIL;
        final SubLObject end = methods.funcall_instance_method_with_0_args(last(words, UNPROVIDED).first(), GET_ABS_INDEX);
        SubLObject cdolist_list_var = words;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$10 = get_right_links_ending(word, end);
            SubLObject link = NIL;
            link = cdolist_list_var_$10.first();
            while (NIL != cdolist_list_var_$10) {
                final SubLObject item_var = link;
                if (NIL == member(item_var, right_links, LINK_RIGHT_WORD_EQUAL, symbol_function(IDENTITY))) {
                    right_links = cons(item_var, right_links);
                }
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                link = cdolist_list_var_$10.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return right_links;
    }

    public static SubLObject get_right_links_ending(final SubLObject token, final SubLObject end) {
        SubLObject ending = NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(token, GET_RIGHT_LINKS);
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (methods.funcall_instance_method_with_0_args(link_right_word(link), GET_ABS_INDEX).numG(end)) {
                ending = cons(link, ending);
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        } 
        return ending;
    }

    public static SubLObject get_left_links_ending(final SubLObject token, final SubLObject start) {
        SubLObject ending = NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(token, GET_LEFT_LINKS);
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (methods.funcall_instance_method_with_0_args(link_left_word(link), GET_ABS_INDEX).numL(start)) {
                ending = cons(link, ending);
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        } 
        return ending;
    }

    public static SubLObject new_link_tree(final SubLObject phrase_structure_string, final SubLObject words) {
        final SubLObject tree0 = read_from_string_ignoring_errors(phrase_structure_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject tree2 = (NIL != tree0) ? new_link_tree_int(tree0, NIL, new_counter(UNPROVIDED), words) : NIL;
        if (NIL != tree2) {
            instances.set_slot(tree2, INDEX, ZERO_INTEGER);
            return retokenize_link_tree(tree2, new_counter(UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject new_link_tree_int(final SubLObject expr, final SubLObject mother, final SubLObject counter, final SubLObject words) {
        return NIL != link_phrase_expression_p(expr) ? link_phrase_expression_to_tree(expr, mother, counter, words) : link_word_expression_to_tree(expr, mother, counter, words);
    }

    public static SubLObject link_phrase_expression_to_tree(final SubLObject expr, final SubLObject mother, final SubLObject counter, final SubLObject words) {
        final SubLObject category = link_phrase_expression_category(expr);
        final SubLObject v_class = category_to_link_tree_class(category);
        final SubLObject tree = object.new_class_instance(v_class);
        final SubLObject expr_daughters = link_phrase_expression_daughters(expr);
        SubLObject daughters0 = NIL;
        SubLObject i = ZERO_INTEGER;
        instances.set_slot(tree, POS, category);
        instances.set_slot(tree, MOTHER, mother);
        SubLObject cdolist_list_var = expr_daughters;
        SubLObject daughter = NIL;
        daughter = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject d = new_link_tree_int(daughter, tree, counter, words);
            instances.set_slot(d, INDEX, i);
            daughters0 = cons(d, daughters0);
            i = add(i, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            daughter = cdolist_list_var.first();
        } 
        instances.set_slot(tree, DAUGHTERS, apply(VECTOR, nreverse(daughters0)));
        return tree;
    }

    public static SubLObject link_word_expression_to_tree(final SubLObject expr, final SubLObject mother, final SubLObject counter, final SubLObject words) {
        inc_counter(counter, UNPROVIDED);
        final SubLObject word = aref(words, counter_value(counter));
        instances.set_slot(word, ABS_INDEX, counter_value(counter));
        instances.set_slot(word, MOTHER, mother);
        return word;
    }

    public static SubLObject category_to_link_tree_class(final SubLObject category) {
        final SubLObject v_class = assoc(category, $category_to_link_tree_class$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
        return NIL != v_class ? v_class : LINK_PHRASE;
    }

    public static SubLObject get_nearest_common_ancestor(final SubLObject trees) {
        if (NIL != trees) {
            final SubLObject common_ancestors = get_common_ancestors(trees);
            SubLObject max_tree = common_ancestors.first();
            SubLObject max_depth = methods.funcall_instance_method_with_0_args(max_tree, DEPTH);
            SubLObject depth = NIL;
            SubLObject cdolist_list_var = common_ancestors.rest();
            SubLObject ca = NIL;
            ca = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                depth = methods.funcall_instance_method_with_0_args(ca, DEPTH);
                if (depth.numG(max_depth)) {
                    max_depth = depth;
                    max_tree = ca;
                }
                cdolist_list_var = cdolist_list_var.rest();
                ca = cdolist_list_var.first();
            } 
            return max_tree;
        }
        return NIL;
    }

    public static SubLObject get_common_ancestors(final SubLObject trees) {
        if (NIL != trees) {
            SubLObject common_ancestors = methods.funcall_instance_method_with_0_args(trees.first(), GET_ANCESTORS);
            SubLObject cdolist_list_var = trees.rest();
            SubLObject tree = NIL;
            tree = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                common_ancestors = intersection(common_ancestors, methods.funcall_instance_method_with_0_args(tree, GET_ANCESTORS), EQ, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                tree = cdolist_list_var.first();
            } 
            return common_ancestors;
        }
        return NIL;
    }

    public static SubLObject get_link_phrase(final SubLObject heads) {
        if (NIL != heads) {
            SubLObject expanded = heads;
            SubLObject cdolist_list_var = heads;
            SubLObject head = NIL;
            head = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != noun_link_word_p(head)) {
                    SubLObject cdolist_list_var_$11 = set_difference(methods.funcall_instance_method_with_0_args(head, GET_MODIFIERS), methods.funcall_instance_method_with_1_args(head, GET_RELATED, $list296), EQ, UNPROVIDED);
                    SubLObject mod = NIL;
                    mod = cdolist_list_var_$11.first();
                    while (NIL != cdolist_list_var_$11) {
                        SubLObject cdolist_list_var_$12 = methods.funcall_instance_method_with_0_args(mod, GET_HEADS);
                        SubLObject mod_head = NIL;
                        mod_head = cdolist_list_var_$12.first();
                        while (NIL != cdolist_list_var_$12) {
                            final SubLObject item_var = mod_head;
                            if (NIL == member(item_var, expanded, EQ, symbol_function(IDENTITY))) {
                                expanded = cons(item_var, expanded);
                            }
                            cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                            mod_head = cdolist_list_var_$12.first();
                        } 
                        cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                        mod = cdolist_list_var_$11.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                head = cdolist_list_var.first();
            } 
            final SubLObject phrase = get_nearest_common_ancestor(expanded);
            if (NIL != phrase) {
                instances.set_slot(phrase, HEADS, heads);
            }
            return phrase;
        }
        return NIL;
    }

    public static SubLObject get_link_phrases(final SubLObject heads) {
        SubLObject phrases = NIL;
        SubLObject cdolist_list_var = heads;
        SubLObject head = NIL;
        head = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            phrases = cons(get_link_phrase(list(head)), phrases);
            cdolist_list_var = cdolist_list_var.rest();
            head = cdolist_list_var.first();
        } 
        return phrases;
    }

    public static SubLObject verbal_link_tree_p(final SubLObject verbal_link_tree) {
        return interfaces.subloop_instanceof_interface(verbal_link_tree, VERBAL_LINK_TREE);
    }

    public static SubLObject verbal_link_phrase_cyclify_int_vp_coordination_method(final SubLObject self) {
        final SubLObject scycls = subcyclifier.subcyclifier_cyclify(self);
        if (NIL != scycls) {
            return scycls;
        }
        final SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SUBJECT);
        final SubLObject subj_cycls = (NIL != subject) ? methods.funcall_instance_method_with_0_args(subject, CYCLIFY_INT) : NIL;
        final SubLObject conjunction = methods.funcall_instance_method_with_0_args(self, GET_CONJUNCTION);
        final SubLObject vps = methods.funcall_instance_method_with_0_args(conjunction, GET_COMPLEMENTS);
        SubLObject cycls = NIL;
        SubLObject cdolist_list_var = vps;
        SubLObject vp = NIL;
        vp = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cycls = cons(methods.funcall_instance_method_with_0_args(vp, CYCLIFY_INT_VP), cycls);
            cdolist_list_var = cdolist_list_var.rest();
            vp = cdolist_list_var.first();
        } 
        return Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.cross_products(cons(subj_cycls, cycls)));
    }

    public static SubLObject verbal_link_phrase_cyclify_int_vp_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_verbal_link_phrase_method = NIL;
        final SubLObject heads = get_link_tree_heads(self);
        try {
            thread.throwStack.push($sym308$OUTER_CATCH_FOR_VERBAL_LINK_PHRASE_METHOD);
            try {
                final SubLObject scycls = subcyclifier.subcyclifier_cyclify(self);
                if (NIL != scycls) {
                    sublisp_throw($sym308$OUTER_CATCH_FOR_VERBAL_LINK_PHRASE_METHOD, scycls);
                }
                final SubLObject heads_$13 = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_HEADS);
                SubLObject all_conjunction_cycls = NIL;
                final SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SUBJECT);
                SubLObject complements = (NIL != heads_$13) ? methods.funcall_instance_method_with_0_args(heads_$13.first(), GET_SEMANTIC_COMPLEMENTS) : NIL;
                SubLObject comp_cycls = NIL;
                SubLObject cycls = NIL;
                complements = cyclifier_interface.delete_cyclifiable(subject, complements);
                if (NIL == subl_promotions.memberP(self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue(thread), EQ, UNPROVIDED)) {
                    final SubLObject _prev_bind_0 = cyclifier_interface.$cyclification_in_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = cyclifier_interface.$cyclification_in_progress$.currentBinding(thread);
                    try {
                        cyclifier_interface.$cyclification_in_progress$.bind(cons(self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue(thread)), thread);
                        cyclifier_interface.$cyclification_in_progress$.bind(append(heads_$13, cyclifier_interface.$cyclification_in_progress$.getDynamicValue(thread)), thread);
                        SubLObject cdolist_list_var = heads_$13;
                        SubLObject head = NIL;
                        head = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject all_head_cycls = NIL;
                            final SubLObject mod_cycls = cyclifier_interface.get_mod_cycls(head);
                            SubLObject cdolist_list_var_$14;
                            final SubLObject renamings = cdolist_list_var_$14 = methods.funcall_instance_method_with_1_args(head, GET_KEYWORD_RENAMINGS, cyclifier.required_keywords(methods.funcall_instance_method_with_0_args(head, GET_RANKED_LEXES)));
                            SubLObject conjunction = NIL;
                            conjunction = cdolist_list_var_$14.first();
                            while (NIL != cdolist_list_var_$14) {
                                SubLObject all_rle_cycls = NIL;
                                SubLObject cdolist_list_var_$15 = methods.funcall_instance_method_with_0_args(head, GET_RANKED_LEXES);
                                SubLObject rle = NIL;
                                rle = cdolist_list_var_$15.first();
                                while (NIL != cdolist_list_var_$15) {
                                    SubLObject composite_verbal_cycls = NIL;
                                    SubLObject cdolist_list_var_$16 = conjunction;
                                    SubLObject renaming = NIL;
                                    renaming = cdolist_list_var_$16.first();
                                    while (NIL != cdolist_list_var_$16) {
                                        final SubLObject renamed0 = cyclifier_interface.apply_lex_renaming(head, rle, renaming);
                                        final SubLObject renamed2 = (NIL != renamed0) ? list(cyclifier.quantify_implicit_subject(renamed0)) : NIL;
                                        composite_verbal_cycls = list_utilities.alist_pushnew(composite_verbal_cycls, cyclifier_interface.renaming_key(renaming), Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.cross_products(cons(renamed2, mod_cycls))), EQL, UNPROVIDED);
                                        cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                                        renaming = cdolist_list_var_$16.first();
                                    } 
                                    SubLObject sense_cycls = NIL;
                                    SubLObject cdolist_list_var_$17 = list_utilities.alist_values(composite_verbal_cycls);
                                    SubLObject value = NIL;
                                    value = cdolist_list_var_$17.first();
                                    while (NIL != cdolist_list_var_$17) {
                                        sense_cycls = cons(Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.indexed_products(value)), sense_cycls);
                                        cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                                        value = cdolist_list_var_$17.first();
                                    } 
                                    all_rle_cycls = cons(sense_cycls, all_rle_cycls);
                                    cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                                    rle = cdolist_list_var_$15.first();
                                } 
                                all_head_cycls = cons(list_utilities.indexed_products(all_rle_cycls), all_head_cycls);
                                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                                conjunction = cdolist_list_var_$14.first();
                            } 
                            all_conjunction_cycls = cons(all_head_cycls, all_conjunction_cycls);
                            cdolist_list_var = cdolist_list_var.rest();
                            head = cdolist_list_var.first();
                        } 
                        cdolist_list_var = complements;
                        SubLObject complement = NIL;
                        complement = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject comp_cycl = methods.funcall_instance_method_with_0_args(complement, CYCLIFY_INT);
                            if (NIL != comp_cycl) {
                                comp_cycls = cons(comp_cycl, comp_cycls);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            complement = cdolist_list_var.first();
                        } 
                        cdolist_list_var = list_utilities.indexed_products(all_conjunction_cycls);
                        SubLObject all_head_cycls2 = NIL;
                        all_head_cycls2 = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject cycls2 = NIL;
                            SubLObject all_subjects_with_objects_cycls = NIL;
                            SubLObject cdolist_list_var_$18 = list_utilities.indexed_products(all_head_cycls2);
                            SubLObject item = NIL;
                            item = cdolist_list_var_$18.first();
                            while (NIL != cdolist_list_var_$18) {
                                SubLObject complete_cycl_for_one_subject = NIL;
                                SubLObject cdolist_list_var_$19 = list_utilities.cross_products(item);
                                SubLObject item2 = NIL;
                                item2 = cdolist_list_var_$19.first();
                                while (NIL != cdolist_list_var_$19) {
                                    complete_cycl_for_one_subject = append(Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.indexed_products(item2)), complete_cycl_for_one_subject);
                                    cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                                    item2 = cdolist_list_var_$19.first();
                                } 
                                all_subjects_with_objects_cycls = cons(Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.cross_products(cons(complete_cycl_for_one_subject, comp_cycls))), all_subjects_with_objects_cycls);
                                cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                                item = cdolist_list_var_$18.first();
                            } 
                            cycls2 = Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.indexed_products(all_subjects_with_objects_cycls));
                            cycls = append(cycls2, cycls);
                            cdolist_list_var = cdolist_list_var.rest();
                            all_head_cycls2 = cdolist_list_var.first();
                        } 
                    } finally {
                        cyclifier_interface.$cyclification_in_progress$.rebind(_prev_bind_2, thread);
                        cyclifier_interface.$cyclification_in_progress$.rebind(_prev_bind_0, thread);
                    }
                }
                sublisp_throw($sym308$OUTER_CATCH_FOR_VERBAL_LINK_PHRASE_METHOD, cycls);
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_tree_heads(self, heads);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_verbal_link_phrase_method = Errors.handleThrowable(ccatch_env_var, $sym308$OUTER_CATCH_FOR_VERBAL_LINK_PHRASE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_verbal_link_phrase_method;
    }

    public static SubLObject verbal_link_phrase_cyclify_int_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != cyclifier_interface.$allow_duplicate_cyclificationsP$.getDynamicValue(thread)) || (NIL == member(self, cyclifier_interface.$cyclification_complete$.getDynamicValue(thread), EQ, UNPROVIDED))) {
            cyclifier_interface.$cyclification_complete$.setDynamicValue(cons(self, cyclifier_interface.$cyclification_complete$.getDynamicValue(thread)), thread);
            final SubLObject scycls = subcyclifier.subcyclifier_cyclify(self);
            if (NIL != scycls) {
                return scycls;
            }
            if (NIL != cyclifier_interface.cyclifiable_sentential_phrase_p(self)) {
                final SubLObject head_dtr = methods.funcall_instance_method_with_0_args(self, GET_HEAD_DAUGHTER);
                if (NIL != head_dtr) {
                    return methods.funcall_instance_method_with_0_args(head_dtr, CYCLIFY_INT);
                }
            } else {
                if (NIL != methods.funcall_instance_method_with_0_args(self, VP_COORDINATE_PHRASE_P)) {
                    return methods.funcall_instance_method_with_0_args(self, CYCLIFY_INT_VP_COORDINATION);
                }
                final SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SUBJECT);
                final SubLObject subj_cycls = (NIL != subject) ? methods.funcall_instance_method_with_0_args(subject, CYCLIFY_INT) : NIL;
                final SubLObject vp_cycls = methods.funcall_instance_method_with_0_args(self, CYCLIFY_INT_VP);
                SubLObject subj_vp_cycls = (NIL != subj_cycls) ? list(subj_cycls) : NIL;
                if (NIL != vp_cycls) {
                    subj_vp_cycls = cons(vp_cycls, subj_vp_cycls);
                }
                return Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.cross_products(subj_vp_cycls));
            }
        }
        return NIL;
    }

    public static SubLObject verbal_link_phrase_vp_coordinate_phrase_p_method(final SubLObject self) {
        final SubLObject conjunction = methods.funcall_instance_method_with_0_args(self, GET_CONJUNCTION);
        return makeBoolean((NIL != conjunction) && (NIL == list_utilities.member_if_not(CYCLIFIABLE_VERB_PHRASE_P, methods.funcall_instance_method_with_0_args(conjunction, GET_COMPLEMENTS), UNPROVIDED)));
    }

    public static SubLObject subloop_reserved_initialize_verbal_link_phrase_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_verbal_link_phrase_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_PHRASE, DAUGHTERS, NIL);
        return NIL;
    }

    public static SubLObject verbal_link_phrase_p(final SubLObject verbal_link_phrase) {
        return classes.subloop_instanceof_class(verbal_link_phrase, VERBAL_LINK_PHRASE);
    }

    public static SubLObject verbal_link_phrase_get_subject_method(final SubLObject self) {
        final SubLObject verb = methods.funcall_instance_method_with_0_args(self, GET_HEADS).first();
        return NIL != verb_link_word_p(verb) ? methods.funcall_instance_method_with_0_args(verb, GET_SUBJECT) : NIL;
    }

    public static SubLObject verbal_link_phrase_get_semantic_subject_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, GET_HEADS).first();
        return NIL != verb_link_word_p(head) ? methods.funcall_instance_method_with_0_args(head, GET_SEMANTIC_SUBJECT) : NIL;
    }

    public static SubLObject verbal_link_phrase_get_verbal_complement_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_verbal_link_phrase_method = NIL;
        final SubLObject heads = get_link_tree_heads(self);
        try {
            thread.throwStack.push($sym327$OUTER_CATCH_FOR_VERBAL_LINK_PHRASE_METHOD);
            try {
                final SubLObject verb = heads.first();
                sublisp_throw($sym327$OUTER_CATCH_FOR_VERBAL_LINK_PHRASE_METHOD, NIL != verb_link_word_p(verb) ? methods.funcall_instance_method_with_0_args(verb, GET_VERBAL_COMPLEMENT) : NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_tree_heads(self, heads);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_verbal_link_phrase_method = Errors.handleThrowable(ccatch_env_var, $sym327$OUTER_CATCH_FOR_VERBAL_LINK_PHRASE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_verbal_link_phrase_method;
    }

    public static SubLObject verbal_link_phrase_get_head_daughters_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_verbal_link_phrase_method = NIL;
        final SubLObject daughters = get_link_phrase_daughters(self);
        try {
            thread.throwStack.push($sym330$OUTER_CATCH_FOR_VERBAL_LINK_PHRASE_METHOD);
            try {
                SubLObject head_daughters = NIL;
                final SubLObject vector_var = daughters;
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject daughter;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    daughter = aref(vector_var, element_num);
                    if (NIL != verbal_link_tree_p(daughter)) {
                        head_daughters = cons(daughter, head_daughters);
                    }
                }
                sublisp_throw($sym330$OUTER_CATCH_FOR_VERBAL_LINK_PHRASE_METHOD, nreverse(head_daughters));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_phrase_daughters(self, daughters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_verbal_link_phrase_method = Errors.handleThrowable(ccatch_env_var, $sym330$OUTER_CATCH_FOR_VERBAL_LINK_PHRASE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_verbal_link_phrase_method;
    }

    public static SubLObject subloop_reserved_initialize_sentential_link_phrase_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_sentential_link_phrase_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_PHRASE, DAUGHTERS, NIL);
        return NIL;
    }

    public static SubLObject sentential_link_phrase_p(final SubLObject sentential_link_phrase) {
        return classes.subloop_instanceof_class(sentential_link_phrase, SENTENTIAL_LINK_PHRASE);
    }

    public static SubLObject prepositional_link_tree_p(final SubLObject prepositional_link_tree) {
        return interfaces.subloop_instanceof_interface(prepositional_link_tree, PREPOSITIONAL_LINK_TREE);
    }

    public static SubLObject subloop_reserved_initialize_prepositional_link_phrase_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_prepositional_link_phrase_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_PHRASE, DAUGHTERS, NIL);
        return NIL;
    }

    public static SubLObject prepositional_link_phrase_p(final SubLObject prepositional_link_phrase) {
        return classes.subloop_instanceof_class(prepositional_link_phrase, PREPOSITIONAL_LINK_PHRASE);
    }

    public static SubLObject prepositional_link_phrase_get_head_daughters_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_prepositional_link_phrase_method = NIL;
        final SubLObject daughters = get_link_phrase_daughters(self);
        try {
            thread.throwStack.push($sym343$OUTER_CATCH_FOR_PREPOSITIONAL_LINK_PHRASE_METHOD);
            try {
                SubLObject head_daughters = NIL;
                final SubLObject vector_var = daughters;
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject daughter;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    daughter = aref(vector_var, element_num);
                    if (NIL != prepositional_link_tree_p(daughter)) {
                        head_daughters = cons(daughter, head_daughters);
                    }
                }
                sublisp_throw($sym343$OUTER_CATCH_FOR_PREPOSITIONAL_LINK_PHRASE_METHOD, nreverse(head_daughters));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_phrase_daughters(self, daughters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_prepositional_link_phrase_method = Errors.handleThrowable(ccatch_env_var, $sym343$OUTER_CATCH_FOR_PREPOSITIONAL_LINK_PHRASE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_prepositional_link_phrase_method;
    }

    public static SubLObject prepositional_link_phrase_get_oblique_object_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, GET_HEAD);
        return NIL != head ? methods.funcall_instance_method_with_0_args(head, GET_OBLIQUE_OBJECT) : NIL;
    }

    public static SubLObject nominal_link_tree_p(final SubLObject nominal_link_tree) {
        return interfaces.subloop_instanceof_interface(nominal_link_tree, NOMINAL_LINK_TREE);
    }

    public static SubLObject subloop_reserved_initialize_nominal_link_phrase_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_nominal_link_phrase_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_PHRASE, DAUGHTERS, NIL);
        return NIL;
    }

    public static SubLObject nominal_link_phrase_p(final SubLObject nominal_link_phrase) {
        return classes.subloop_instanceof_class(nominal_link_phrase, NOMINAL_LINK_PHRASE);
    }

    public static SubLObject nominal_link_phrase_get_head_daughters_method(final SubLObject self) {
        if (NIL != methods.funcall_instance_method_with_0_args(self, COORDINATE_PHRASE_P)) {
            return methods.funcall_instance_method_with_1_args(self, FIND, NOMINAL_LINK_TREE_P);
        }
        if (NIL != methods.funcall_instance_method_with_0_args(self, PRETERMINAL_P)) {
            final SubLObject head_daughter = methods.funcall_instance_method_with_1_args(self, FIND_LAST, NOUN_LINK_WORD_P);
            return NIL != head_daughter ? list(head_daughter) : NIL;
        }
        SubLObject head_daughter = methods.funcall_instance_method_with_1_args(self, FIND_LAST, NOUN_LINK_WORD_P);
        if (NIL != head_daughter) {
            return list(head_daughter);
        }
        head_daughter = methods.funcall_instance_method_with_1_args(self, FIND_FIRST, NOMINAL_LINK_PHRASE_P);
        return NIL != head_daughter ? list(head_daughter) : NIL;
    }

    public static SubLObject get_link_word_context(final SubLObject link_word) {
        return classes.subloop_get_access_protected_instance_slot(link_word, THIRTEEN_INTEGER, CONTEXT);
    }

    public static SubLObject set_link_word_context(final SubLObject link_word, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(link_word, value, THIRTEEN_INTEGER, CONTEXT);
    }

    public static SubLObject get_link_word_lexes(final SubLObject link_word) {
        return classes.subloop_get_access_protected_instance_slot(link_word, TWELVE_INTEGER, LEXES);
    }

    public static SubLObject set_link_word_lexes(final SubLObject link_word, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(link_word, value, TWELVE_INTEGER, LEXES);
    }

    public static SubLObject get_link_word_right_links(final SubLObject link_word) {
        return classes.subloop_get_access_protected_instance_slot(link_word, ELEVEN_INTEGER, RIGHT_LINKS);
    }

    public static SubLObject set_link_word_right_links(final SubLObject link_word, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(link_word, value, ELEVEN_INTEGER, RIGHT_LINKS);
    }

    public static SubLObject get_link_word_left_links(final SubLObject link_word) {
        return classes.subloop_get_access_protected_instance_slot(link_word, TEN_INTEGER, LEFT_LINKS);
    }

    public static SubLObject set_link_word_left_links(final SubLObject link_word, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(link_word, value, TEN_INTEGER, LEFT_LINKS);
    }

    public static SubLObject get_link_word_abs_index(final SubLObject link_word) {
        return classes.subloop_get_access_protected_instance_slot(link_word, NINE_INTEGER, ABS_INDEX);
    }

    public static SubLObject set_link_word_abs_index(final SubLObject link_word, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(link_word, value, NINE_INTEGER, ABS_INDEX);
    }

    public static SubLObject get_link_word_ref(final SubLObject link_word) {
        return classes.subloop_get_access_protected_instance_slot(link_word, EIGHT_INTEGER, REF);
    }

    public static SubLObject set_link_word_ref(final SubLObject link_word, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(link_word, value, EIGHT_INTEGER, REF);
    }

    public static SubLObject get_link_word_string(final SubLObject link_word) {
        return classes.subloop_get_access_protected_instance_slot(link_word, SEVEN_INTEGER, STRING);
    }

    public static SubLObject set_link_word_string(final SubLObject link_word, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(link_word, value, SEVEN_INTEGER, STRING);
    }

    public static SubLObject get_link_word_linkage(final SubLObject link_word) {
        return classes.subloop_get_access_protected_instance_slot(link_word, SIX_INTEGER, LINKAGE);
    }

    public static SubLObject set_link_word_linkage(final SubLObject link_word, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(link_word, value, SIX_INTEGER, LINKAGE);
    }

    public static SubLObject link_word_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
        if (keywords == UNPROVIDED) {
            keywords = NIL;
        }
        return NIL;
    }

    public static SubLObject link_word_modified_dependent_meaning_p_method(final SubLObject self) {
        SubLObject semtrans = NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES);
        SubLObject rle = NIL;
        rle = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            semtrans = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $SEMTRANS);
            if (NIL != subl_promotions.memberP($REPLACE, cyclifier.formula_keywords(semtrans), UNPROVIDED, UNPROVIDED)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            rle = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject link_word_tree_keyword_eq_classes_method(final SubLObject self) {
        return cyclifier_interface.keyword_eq_classes(Mapping.mapcar(CAR, methods.funcall_instance_method_with_0_args(self, GET_KEYWORD_RENAMINGS).first().first()));
    }

    public static SubLObject link_word_frame_filter_lexes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_word_method = NIL;
        SubLObject lexes = get_link_word_lexes(self);
        try {
            thread.throwStack.push($sym383$OUTER_CATCH_FOR_LINK_WORD_METHOD);
            try {
                SubLObject filtered = NIL;
                final SubLObject tree_keywords = methods.funcall_instance_method_with_0_args(self, TREE_KEYWORD_EQ_CLASSES);
                SubLObject lex_scores = NIL;
                SubLObject max_score = $int$_5;
                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES);
                SubLObject rle = NIL;
                rle = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject lex_score = cyclifier_interface.lex_entry_score(cyclifier.rle_lex(rle), tree_keywords);
                    cyclifier.rle_set_confidence(rle, lex_score);
                    lex_scores = cons(rle, lex_scores);
                    if (lex_score.numG(max_score)) {
                        max_score = lex_score;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    rle = cdolist_list_var.first();
                } 
                cdolist_list_var = lex_scores;
                rle = NIL;
                rle = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (cyclifier.rle_confidence(rle).numE(max_score)) {
                        filtered = cons(rle, filtered);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    rle = cdolist_list_var.first();
                } 
                lexes = filtered;
                sublisp_throw($sym383$OUTER_CATCH_FOR_LINK_WORD_METHOD, lexes);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_word_lexes(self, lexes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_word_method = Errors.handleThrowable(ccatch_env_var, $sym383$OUTER_CATCH_FOR_LINK_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_word_method;
    }

    public static SubLObject link_word_pp_comp_filter_lexes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_word_method = NIL;
        SubLObject lexes = get_link_word_lexes(self);
        try {
            thread.throwStack.push($sym388$OUTER_CATCH_FOR_LINK_WORD_METHOD);
            try {
                SubLObject filtered = NIL;
                final SubLObject pp = methods.funcall_instance_method_with_0_args(self, GET_PP_COMPLEMENT);
                final SubLObject pp_head = (NIL != pp) ? methods.funcall_instance_method_with_0_args(pp, GET_HEAD) : NIL;
                SubLObject frame = NIL;
                if (NIL != pp_head) {
                    SubLObject cdolist_list_var = lexes;
                    SubLObject rle = NIL;
                    rle = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        frame = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $FRAME);
                        if ((NIL != cycl_utilities.formula_arg2(frame, UNPROVIDED)) && (NIL != isa.isaP(frame, $$PPCompFrame, $$EverythingPSC, UNPROVIDED))) {
                            final SubLObject preposition = cycl_utilities.formula_arg2(frame, UNPROVIDED);
                            final SubLObject prep_string = lexicon_accessors.get_strings_of_type(preposition, $$Preposition, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
                            if (prep_string.equalp(methods.funcall_instance_method_with_0_args(pp_head, GET_STRING))) {
                                cyclifier.rle_set_confidence(rle, ONE_INTEGER);
                                filtered = cons(rle, filtered);
                            }
                        } else {
                            filtered = cons(rle, filtered);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        rle = cdolist_list_var.first();
                    } 
                    lexes = filtered;
                }
                sublisp_throw($sym388$OUTER_CATCH_FOR_LINK_WORD_METHOD, lexes);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_word_lexes(self, lexes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_word_method = Errors.handleThrowable(ccatch_env_var, $sym388$OUTER_CATCH_FOR_LINK_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_word_method;
    }

    public static SubLObject link_word_pos_filter_lexes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_word_method = NIL;
        SubLObject lexes = get_link_word_lexes(self);
        try {
            thread.throwStack.push($sym397$OUTER_CATCH_FOR_LINK_WORD_METHOD);
            try {
                SubLObject filtered = NIL;
                SubLObject cdolist_list_var = lexes;
                SubLObject rle = NIL;
                rle = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != member(methods.funcall_instance_method_with_0_args(self, GET_CATEGORY), methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $PENN_TAGS), UNPROVIDED, UNPROVIDED)) {
                        cyclifier.rle_set_confidence(rle, ONE_INTEGER);
                        filtered = cons(rle, filtered);
                    } else
                        if (NIL != member(methods.funcall_instance_method_with_0_args(self, GET_CATEGORY), methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $BACKOFF_PENN_TAGS), UNPROVIDED, UNPROVIDED)) {
                            cyclifier.rle_set_confidence(rle, $float$0_75);
                            filtered = cons(rle, filtered);
                        }

                    cdolist_list_var = cdolist_list_var.rest();
                    rle = cdolist_list_var.first();
                } 
                lexes = filtered;
                sublisp_throw($sym397$OUTER_CATCH_FOR_LINK_WORD_METHOD, lexes);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_word_lexes(self, lexes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_word_method = Errors.handleThrowable(ccatch_env_var, $sym397$OUTER_CATCH_FOR_LINK_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_word_method;
    }

    public static SubLObject link_word_cyclify_nucleus_method(final SubLObject self, SubLObject renamings) {
        if (renamings == UNPROVIDED) {
            renamings = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ndistr_comp_cycls = NIL;
        SubLObject distr_comp_cycls = NIL;
        SubLObject mod_cycls = NIL;
        SubLObject cycls = NIL;
        if (NIL == subl_promotions.memberP(self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue(thread), EQ, UNPROVIDED)) {
            final SubLObject _prev_bind_0 = cyclifier_interface.$cyclification_in_progress$.currentBinding(thread);
            try {
                cyclifier_interface.$cyclification_in_progress$.bind(cons(self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue(thread)), thread);
                if (NIL == renamings) {
                    renamings = methods.funcall_instance_method_with_1_args(self, GET_KEYWORD_RENAMINGS, cyclifier.required_keywords(methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES)));
                }
                renamings = cyclifier_interface.group_disjunctive_renamings(renamings);
                thread.resetMultipleValues();
                final SubLObject non_distributing = methods.funcall_instance_method_with_0_args(self, PARTITION_SEMANTIC_COMPLEMENTS);
                final SubLObject distributing = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var = non_distributing;
                SubLObject complement = NIL;
                complement = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject comp_cycl = methods.funcall_instance_method_with_0_args(complement, CYCLIFY_INT);
                    if (NIL != comp_cycl) {
                        ndistr_comp_cycls = cons(comp_cycl, ndistr_comp_cycls);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    complement = cdolist_list_var.first();
                } 
                cdolist_list_var = distributing;
                complement = NIL;
                complement = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject comp_cycl = methods.funcall_instance_method_with_0_args(complement, CYCLIFY_INT);
                    if (NIL != comp_cycl) {
                        distr_comp_cycls = cons(comp_cycl, distr_comp_cycls);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    complement = cdolist_list_var.first();
                } 
                cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_MODIFIERS);
                SubLObject modifier = NIL;
                modifier = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject mod_cycl = methods.funcall_instance_method_with_0_args(modifier, CYCLIFY_INT);
                    if (NIL != mod_cycl) {
                        mod_cycls = cons(mod_cycl, mod_cycls);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    modifier = cdolist_list_var.first();
                } 
                cdolist_list_var = renamings;
                SubLObject conjunction = NIL;
                conjunction = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$20 = methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES);
                    SubLObject rle = NIL;
                    rle = cdolist_list_var_$20.first();
                    while (NIL != cdolist_list_var_$20) {
                        SubLObject my_cycls0 = NIL;
                        SubLObject cdolist_list_var_$21 = conjunction;
                        SubLObject grouping = NIL;
                        grouping = cdolist_list_var_$21.first();
                        while (NIL != cdolist_list_var_$21) {
                            SubLObject this_and_mods = NIL;
                            SubLObject cdolist_list_var_$22 = grouping;
                            SubLObject renaming = NIL;
                            renaming = cdolist_list_var_$22.first();
                            while (NIL != cdolist_list_var_$22) {
                                this_and_mods = cons(Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.cross_products(cons(list(cyclifier_interface.apply_lex_renaming(self, rle, renaming)), mod_cycls))), this_and_mods);
                                cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                                renaming = cdolist_list_var_$22.first();
                            } 
                            my_cycls0 = cons(Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.cross_products(cons(Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.indexed_products(this_and_mods)), ndistr_comp_cycls))), my_cycls0);
                            cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                            grouping = cdolist_list_var_$21.first();
                        } 
                        cycls = append(cycls, Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.indexed_products(my_cycls0)));
                        cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                        rle = cdolist_list_var_$20.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    conjunction = cdolist_list_var.first();
                } 
            } finally {
                cyclifier_interface.$cyclification_in_progress$.rebind(_prev_bind_0, thread);
            }
        }
        return Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.cross_products(cons(cycls, distr_comp_cycls)));
    }

    public static SubLObject link_word_cyclify_int_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != cyclifier_interface.$allow_duplicate_cyclificationsP$.getDynamicValue(thread)) || (NIL == member(self, cyclifier_interface.$cyclification_complete$.getDynamicValue(thread), EQ, UNPROVIDED))) {
            cyclifier_interface.$cyclification_complete$.setDynamicValue(cons(self, cyclifier_interface.$cyclification_complete$.getDynamicValue(thread)), thread);
            return methods.funcall_instance_method_with_0_args(self, CYCLIFY_NUCLEUS);
        }
        return NIL;
    }

    public static SubLObject link_word_get_oblique_object_method(final SubLObject self) {
        final SubLObject pp = methods.funcall_instance_method_with_0_args(self, GET_PP_COMPLEMENT);
        final SubLObject obl_obj = (NIL != pp) ? methods.funcall_instance_method_with_0_args(pp, GET_OBLIQUE_OBJECT) : NIL;
        return obl_obj;
    }

    public static SubLObject link_word_get_pp_complement_method(final SubLObject self) {
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_PPS);
        SubLObject pp = NIL;
        pp = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pp_head = (NIL != pp) ? methods.funcall_instance_method_with_0_args(pp, GET_HEAD) : NIL;
            final SubLObject pp_head_string = (NIL != pp_head) ? methods.funcall_instance_method_with_0_args(pp_head, GET_STRING) : NIL;
            if (NIL != pp_head_string) {
                SubLObject cdolist_list_var_$23 = methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES);
                SubLObject rle = NIL;
                rle = cdolist_list_var_$23.first();
                while (NIL != cdolist_list_var_$23) {
                    final SubLObject cycl = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $SEMTRANS);
                    final SubLObject keywords = cyclifier.formula_keywords(cycl);
                    final SubLObject frame = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $FRAME);
                    if (((NIL != subl_promotions.memberP($OBLIQUE_OBJECT, keywords, EQL, UNPROVIDED)) && (NIL != cycl_utilities.formula_arg2(frame, UNPROVIDED))) && (NIL != isa.isaP(frame, $$PPCompFrame, $$EverythingPSC, UNPROVIDED))) {
                        final SubLObject preposition = cycl_utilities.formula_arg2(frame, UNPROVIDED);
                        final SubLObject prep_string = lexicon_accessors.get_strings_of_type(preposition, $$Preposition, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
                        if (prep_string.equalp(pp_head_string)) {
                            return pp;
                        }
                    } else
                        if ((NIL != intersection($list412, keywords, EQL, UNPROVIDED)) && $$$of.equalp(pp_head_string)) {
                            return pp;
                        }

                    cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                    rle = cdolist_list_var_$23.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            pp = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject link_word_partition_semantic_complements_method(final SubLObject self) {
        return values(methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_COMPLEMENTS), NIL);
    }

    public static SubLObject link_word_get_semantic_complements_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, GET_COMPLEMENTS);
    }

    public static SubLObject subloop_reserved_initialize_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject link_word_p(final SubLObject link_word) {
        return classes.subloop_instanceof_class(link_word, LINK_WORD);
    }

    public static SubLObject link_word_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_word_method = NIL;
        final SubLObject lexes = get_link_word_lexes(self);
        final SubLObject string = get_link_word_string(self);
        final SubLObject pos = get_link_tree_pos(self);
        try {
            thread.throwStack.push($sym423$OUTER_CATCH_FOR_LINK_WORD_METHOD);
            try {
                write_string($str424$__LW, stream, UNPROVIDED, UNPROVIDED);
                if (NIL != lexes) {
                    write_string($str270$_, stream, UNPROVIDED, UNPROVIDED);
                }
                write_string($str425$_, stream, UNPROVIDED, UNPROVIDED);
                princ(pos, stream);
                write_string($str426$___, stream, UNPROVIDED, UNPROVIDED);
                write_string(string, stream, UNPROVIDED, UNPROVIDED);
                write_string($str97$_, stream, UNPROVIDED, UNPROVIDED);
                sublisp_throw($sym423$OUTER_CATCH_FOR_LINK_WORD_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_word_lexes(self, lexes);
                    set_link_word_string(self, string);
                    set_link_tree_pos(self, pos);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_word_method = Errors.handleThrowable(ccatch_env_var, $sym423$OUTER_CATCH_FOR_LINK_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_word_method;
    }

    public static SubLObject clear_split_link_word() {
        final SubLObject cs = $split_link_word_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_split_link_word(final SubLObject wordXpos) {
        return memoization_state.caching_state_remove_function_results_with_args($split_link_word_caching_state$.getGlobalValue(), list(wordXpos), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject split_link_word_internal(final SubLObject wordXpos) {
        final SubLObject pos = (NIL != pos_tagged_link_word_p(wordXpos)) ? string_utilities.last_char(wordXpos) : NIL;
        final SubLObject word = (NIL != pos) ? string_utilities.remove_last_char(wordXpos, TWO_INTEGER) : wordXpos;
        return values(word, pos);
    }

    public static SubLObject split_link_word(final SubLObject wordXpos) {
        SubLObject caching_state = $split_link_word_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SPLIT_LINK_WORD, $split_link_word_caching_state$, $int$256, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, wordXpos, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(split_link_word_internal(wordXpos)));
            memoization_state.caching_state_put(caching_state, wordXpos, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject pos_tagged_link_word_p(final SubLObject word) {
        return makeBoolean(((word.isString() && (NIL != list_utilities.lengthG(word, TWO_INTEGER, UNPROVIDED))) && CHAR_period.eql(string_utilities.char_from_end(word, ONE_INTEGER))) && (NIL != link_pos_p(string_utilities.last_char(word))));
    }

    public static SubLObject create_link_word(final SubLObject v_linkage, final SubLObject string, final SubLObject index, final SubLObject abs_index, final SubLObject llinks, final SubLObject rlinks, final SubLObject penn_pos, final SubLObject v_context) {
        final SubLObject word = object.new_class_instance(penn_pos_to_classes(penn_pos).first());
        instances.set_slot(word, LINKAGE, v_linkage);
        instances.set_slot(word, STRING, string);
        instances.set_slot(word, POS, penn_pos);
        instances.set_slot(word, INDEX, index);
        instances.set_slot(word, ABS_INDEX, abs_index);
        instances.set_slot(word, REF, methods.funcall_instance_method_with_1_args(v_context, NEW_VARIABLE, string));
        instances.set_slot(word, LEFT_LINKS, llinks);
        instances.set_slot(word, RIGHT_LINKS, rlinks);
        instances.set_slot(word, CONTEXT, v_context);
        SubLObject cdolist_list_var = llinks;
        SubLObject llink = NIL;
        llink = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            _csetf_link_right_word(llink, word);
            cdolist_list_var = cdolist_list_var.rest();
            llink = cdolist_list_var.first();
        } 
        cdolist_list_var = rlinks;
        SubLObject rlink = NIL;
        rlink = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            _csetf_link_left_word(rlink, word);
            cdolist_list_var = cdolist_list_var.rest();
            rlink = cdolist_list_var.first();
        } 
        return word;
    }

    public static SubLObject new_link_word(final SubLObject v_linkage, final SubLObject stringXpos, final SubLObject index, final SubLObject llinks, final SubLObject rlinks, final SubLObject penn_pos, final SubLObject v_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject word = NIL;
        thread.resetMultipleValues();
        final SubLObject string = split_link_word(stringXpos);
        final SubLObject link_pos = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject v_class = get_link_word_class(string, link_pos, Mapping.mapcar(LINK_NAME, llinks), Mapping.mapcar(LINK_NAME, rlinks), penn_pos);
        final SubLObject derived_pos = thread.secondMultipleValue();
        thread.resetMultipleValues();
        word = object.new_class_instance(v_class);
        instances.set_slot(word, LINKAGE, v_linkage);
        instances.set_slot(word, STRING, string);
        instances.set_slot(word, POS, derived_pos);
        instances.set_slot(word, INDEX, index);
        instances.set_slot(word, ABS_INDEX, ZERO_INTEGER);
        instances.set_slot(word, REF, methods.funcall_instance_method_with_1_args(v_context, NEW_VARIABLE, string));
        instances.set_slot(word, LEFT_LINKS, llinks);
        instances.set_slot(word, RIGHT_LINKS, rlinks);
        instances.set_slot(word, CONTEXT, v_context);
        SubLObject cdolist_list_var = llinks;
        SubLObject llink = NIL;
        llink = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            _csetf_link_right_word(llink, word);
            cdolist_list_var = cdolist_list_var.rest();
            llink = cdolist_list_var.first();
        } 
        cdolist_list_var = rlinks;
        SubLObject rlink = NIL;
        rlink = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            _csetf_link_left_word(rlink, word);
            cdolist_list_var = cdolist_list_var.rest();
            rlink = cdolist_list_var.first();
        } 
        return word;
    }

    public static SubLObject link_word_get_string_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_word_method = NIL;
        final SubLObject string = get_link_word_string(self);
        try {
            thread.throwStack.push($sym432$OUTER_CATCH_FOR_LINK_WORD_METHOD);
            try {
                sublisp_throw($sym432$OUTER_CATCH_FOR_LINK_WORD_METHOD, string);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_word_string(self, string);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_word_method = Errors.handleThrowable(ccatch_env_var, $sym432$OUTER_CATCH_FOR_LINK_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_word_method;
    }

    public static SubLObject link_word_get_pos_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_word_method = NIL;
        final SubLObject pos = get_link_tree_pos(self);
        try {
            thread.throwStack.push($sym436$OUTER_CATCH_FOR_LINK_WORD_METHOD);
            try {
                sublisp_throw($sym436$OUTER_CATCH_FOR_LINK_WORD_METHOD, pos);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_tree_pos(self, pos);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_word_method = Errors.handleThrowable(ccatch_env_var, $sym436$OUTER_CATCH_FOR_LINK_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_word_method;
    }

    public static SubLObject link_word_get_abs_index_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_word_method = NIL;
        final SubLObject abs_index = get_link_word_abs_index(self);
        try {
            thread.throwStack.push($sym439$OUTER_CATCH_FOR_LINK_WORD_METHOD);
            try {
                sublisp_throw($sym439$OUTER_CATCH_FOR_LINK_WORD_METHOD, abs_index);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_word_abs_index(self, abs_index);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_word_method = Errors.handleThrowable(ccatch_env_var, $sym439$OUTER_CATCH_FOR_LINK_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_word_method;
    }

    public static SubLObject link_word_get_refs_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_word_method = NIL;
        final SubLObject ref = get_link_word_ref(self);
        try {
            thread.throwStack.push($sym442$OUTER_CATCH_FOR_LINK_WORD_METHOD);
            try {
                sublisp_throw($sym442$OUTER_CATCH_FOR_LINK_WORD_METHOD, list(ref));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_word_ref(self, ref);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_word_method = Errors.handleThrowable(ccatch_env_var, $sym442$OUTER_CATCH_FOR_LINK_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_word_method;
    }

    public static SubLObject link_word_get_linkage_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_word_method = NIL;
        final SubLObject v_linkage = get_link_word_linkage(self);
        try {
            thread.throwStack.push($sym445$OUTER_CATCH_FOR_LINK_WORD_METHOD);
            try {
                sublisp_throw($sym445$OUTER_CATCH_FOR_LINK_WORD_METHOD, v_linkage);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_word_linkage(self, v_linkage);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_word_method = Errors.handleThrowable(ccatch_env_var, $sym445$OUTER_CATCH_FOR_LINK_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_word_method;
    }

    public static SubLObject link_word_get_context_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_word_method = NIL;
        final SubLObject v_context = get_link_word_context(self);
        try {
            thread.throwStack.push($sym448$OUTER_CATCH_FOR_LINK_WORD_METHOD);
            try {
                sublisp_throw($sym448$OUTER_CATCH_FOR_LINK_WORD_METHOD, v_context);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_word_context(self, v_context);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_word_method = Errors.handleThrowable(ccatch_env_var, $sym448$OUTER_CATCH_FOR_LINK_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_word_method;
    }

    public static SubLObject link_word_get_head_method(final SubLObject self) {
        return self;
    }

    public static SubLObject link_word_get_heads_method(final SubLObject self) {
        return list(self);
    }

    public static SubLObject link_word_get_semantic_heads_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, GET_HEADS);
    }

    public static SubLObject link_word_get_complements_method(final SubLObject self) {
        return NIL;
    }

    public static SubLObject link_word_get_ranked_lexes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_word_method = NIL;
        final SubLObject lexes = get_link_word_lexes(self);
        try {
            thread.throwStack.push($sym459$OUTER_CATCH_FOR_LINK_WORD_METHOD);
            try {
                sublisp_throw($sym459$OUTER_CATCH_FOR_LINK_WORD_METHOD, lexes);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_word_lexes(self, lexes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_word_method = Errors.handleThrowable(ccatch_env_var, $sym459$OUTER_CATCH_FOR_LINK_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_word_method;
    }

    public static SubLObject link_word_get_lexes_method(final SubLObject self) {
        return Mapping.mapcar(CAR, methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES));
    }

    public static SubLObject link_word_get_pps_method(final SubLObject self) {
        return NIL;
    }

    public static SubLObject link_word_after(final SubLObject word1, final SubLObject word2) {
        return numG(methods.funcall_instance_method_with_0_args(word1, GET_INDEX), methods.funcall_instance_method_with_0_args(word2, GET_INDEX));
    }

    public static SubLObject link_word_lexify_method(final SubLObject self, final SubLObject lexicon) {
        SubLObject filtered = NIL;
        final SubLObject string = instances.get_slot(self, STRING);
        instances.set_slot(self, LEXES, cyclifier.new_even_lex_entry_distribution(methods.funcall_instance_method_with_1_args(lexicon, GET, string)));
        if (NIL != instances.get_slot(self, LEXES)) {
            filtered = methods.funcall_instance_method_with_0_args(self, POS_FILTER_LEXES);
            filtered = methods.funcall_instance_method_with_0_args(self, PP_COMP_FILTER_LEXES);
            if (NIL != main_verb_link_word_p(self)) {
                filtered = methods.funcall_instance_method_with_0_args(self, PARTICLE_FILTER_LEXES);
            }
            filtered = methods.funcall_instance_method_with_0_args(self, FRAME_FILTER_LEXES);
        }
        if (((NIL == filtered) && (NIL == wall_link_word_p(self))) && methods.funcall_instance_method_with_0_args(self, GET_CATEGORY).isKeyword()) {
            final SubLObject fabricated_lexes = methods.funcall_instance_method_with_3_args(lexicon, FABRICATE, string, Mapping.mapcar(CAR, methods.funcall_instance_method_with_0_args(self, GET_KEYWORD_RENAMINGS).first().first()), methods.funcall_instance_method_with_0_args(self, GET_CATEGORY));
            if (NIL != fabricated_lexes) {
                filtered = Mapping.mapcar(NEW_RANKED_LEX_ENTRY, fabricated_lexes);
            }
            instances.set_slot(self, LEXES, filtered);
        }
        if (NIL != noun_link_word_p(self)) {
            if (NIL != methods.funcall_instance_method_with_0_args(self, DEFINITE_DESCRIPTION_P)) {
                SubLObject augmented_lexes = NIL;
                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES);
                SubLObject rle = NIL;
                rle = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject lex = (NIL != rle) ? cyclifier.rle_lex(rle) : NIL;
                    if (NIL == parse_tree.introduces_termP(lex)) {
                        final SubLObject instance = methods.funcall_instance_method_with_1_args(methods.funcall_instance_method_with_0_args(self, GET_CONTEXT), GET_INSTANCE, self);
                        final SubLObject semtrans = methods.funcall_instance_method_with_1_args(lex, GET, $SEMTRANS);
                        methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, simplifier.conjoin(list(semtrans, list($$equals, $NOUN, instance)), UNPROVIDED));
                        cyclifier.rle_set_confidence(rle, ONE_INTEGER);
                    }
                    augmented_lexes = cons(rle, augmented_lexes);
                    cdolist_list_var = cdolist_list_var.rest();
                    rle = cdolist_list_var.first();
                } 
                instances.set_slot(self, LEXES, augmented_lexes);
            } else
                if (NIL != methods.funcall_instance_method_with_0_args(self, APPOSITIVE_P)) {
                    SubLObject cdolist_list_var2 = filtered;
                    SubLObject rle2 = NIL;
                    rle2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        final SubLObject lex2 = cyclifier.rle_lex(rle2);
                        methods.funcall_instance_method_with_2_args(lex2, SET, $SEMTRANS, simplifier.conjoin(list($list479, methods.funcall_instance_method_with_1_args(lex2, GET, $SEMTRANS)), UNPROVIDED));
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        rle2 = cdolist_list_var2.first();
                    } 
                }

        }
        return instances.get_slot(self, LEXES);
    }

    public static SubLObject link_word_get_left_links_method(final SubLObject self, SubLObject link_pattern) {
        if (link_pattern == UNPROVIDED) {
            link_pattern = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_word_method = NIL;
        final SubLObject left_links = get_link_word_left_links(self);
        try {
            thread.throwStack.push($sym483$OUTER_CATCH_FOR_LINK_WORD_METHOD);
            try {
                if (((NIL != link_pattern) && (!assertionsDisabledSynth)) && (NIL == regular_expressions.regex_pattern_p(link_pattern))) {
                    throw new AssertionError(link_pattern);
                }
                if (NIL == link_pattern) {
                    sublisp_throw($sym483$OUTER_CATCH_FOR_LINK_WORD_METHOD, left_links);
                }
                SubLObject links = NIL;
                SubLObject cdolist_list_var = left_links;
                SubLObject link = NIL;
                link = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != regular_expression_utilities.regex_matchP(link_pattern, link_name(link))) {
                        links = cons(link, links);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    link = cdolist_list_var.first();
                } 
                sublisp_throw($sym483$OUTER_CATCH_FOR_LINK_WORD_METHOD, links);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_word_left_links(self, left_links);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_word_method = Errors.handleThrowable(ccatch_env_var, $sym483$OUTER_CATCH_FOR_LINK_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_word_method;
    }

    public static SubLObject link_word_get_right_links_method(final SubLObject self, SubLObject link_pattern) {
        if (link_pattern == UNPROVIDED) {
            link_pattern = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_link_word_method = NIL;
        final SubLObject right_links = get_link_word_right_links(self);
        try {
            thread.throwStack.push($sym487$OUTER_CATCH_FOR_LINK_WORD_METHOD);
            try {
                if (((NIL != link_pattern) && (!assertionsDisabledSynth)) && (NIL == regular_expressions.regex_pattern_p(link_pattern))) {
                    throw new AssertionError(link_pattern);
                }
                if (NIL == link_pattern) {
                    sublisp_throw($sym487$OUTER_CATCH_FOR_LINK_WORD_METHOD, right_links);
                }
                SubLObject links = NIL;
                SubLObject cdolist_list_var = right_links;
                SubLObject link = NIL;
                link = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != regular_expression_utilities.regex_matchP(link_pattern, link_name(link))) {
                        links = cons(link, links);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    link = cdolist_list_var.first();
                } 
                sublisp_throw($sym487$OUTER_CATCH_FOR_LINK_WORD_METHOD, links);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_word_right_links(self, right_links);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_link_word_method = Errors.handleThrowable(ccatch_env_var, $sym487$OUTER_CATCH_FOR_LINK_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_link_word_method;
    }

    public static SubLObject link_word_get_links_method(final SubLObject self, SubLObject link_pattern) {
        if (link_pattern == UNPROVIDED) {
            link_pattern = NIL;
        }
        if (((NIL != link_pattern) && (!assertionsDisabledSynth)) && (NIL == regular_expressions.regex_pattern_p(link_pattern))) {
            throw new AssertionError(link_pattern);
        }
        return append(methods.funcall_instance_method_with_1_args(self, GET_LEFT_LINKS, link_pattern), methods.funcall_instance_method_with_1_args(self, GET_RIGHT_LINKS, link_pattern));
    }

    public static SubLObject link_word_get_directly_related_method(final SubLObject self, final SubLObject pattern_keyword, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        SubLObject words = NIL;
        final SubLObject link_pattern = get_link_pattern(pattern_keyword);
        final SubLObject link_getter = (NIL == direction) ? GET_LINKS : direction.eql($LEFT) ? GET_LEFT_LINKS : direction.eql($RIGHT) ? GET_RIGHT_LINKS : Errors.error($str494$Invalid_link_direction__a, direction);
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(self, link_getter, link_pattern);
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (link_left_word(link).eql(self)) {
                words = cons(link_right_word(link), words);
            } else {
                words = cons(link_left_word(link), words);
            }
            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        } 
        return words;
    }

    public static SubLObject link_word_get_related_method(final SubLObject self, final SubLObject link_path) {
        if (NIL == link_path) {
            return list(self);
        }
        SubLObject words = NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, link_path.first());
        SubLObject related = NIL;
        related = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            words = append(methods.funcall_instance_method_with_1_args(related, GET_RELATED, link_path.rest()), words);
            cdolist_list_var = cdolist_list_var.rest();
            related = cdolist_list_var.first();
        } 
        return words;
    }

    public static SubLObject verb_link_word_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
        if (keywords == UNPROVIDED) {
            keywords = $list504;
        }
        SubLObject conjuncts = NIL;
        SubLObject disjuncts = NIL;
        SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_SUBJECT);
        final SubLObject direct_object = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_DIRECT_OBJECT);
        final SubLObject indirect_object = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_INDIRECT_OBJECT);
        final SubLObject oblique_object = methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT);
        final SubLObject cl_complement = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
        final SubLObject modified = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS).first();
        if ((NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(self, GET_CATEGORY), $list507, EQL, UNPROVIDED)) && (NIL == subject)) {
            subject = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS).first();
        }
        if (NIL != subl_promotions.memberP($ACTION, keywords, EQL, UNPROVIDED)) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($ACTION, self), conjuncts);
        }
        if ((NIL != subject) && (NIL != member($SUBJECT, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($SUBJECT, subject), conjuncts);
        }
        if ((NIL != direct_object) && (NIL != member($OBJECT, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($OBJECT, direct_object), conjuncts);
        }
        if ((NIL != indirect_object) && (NIL != member($OBLIQUE_OBJECT, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($OBLIQUE_OBJECT, indirect_object), conjuncts);
        }
        if ((NIL != oblique_object) && (NIL != member($OBLIQUE_OBJECT, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($PREP_OBJECT, oblique_object), conjuncts);
        }
        if ((NIL != modified) && (NIL != member($NOUN, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($NOUN, modified), conjuncts);
        }
        if ((NIL != cl_complement) && (NIL != member($CLAUSE, keywords, EQL, UNPROVIDED))) {
            SubLObject cdolist_list_var;
            final SubLObject cl_cycls = cdolist_list_var = methods.funcall_instance_method_with_0_args(cl_complement, CYCLIFY_INT);
            SubLObject cl_cycl = NIL;
            cl_cycl = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cl_cycl = simplifier.lift_conjuncts(cl_cycl);
                disjuncts = cons(cons($CLAUSE, cl_cycl), disjuncts);
                cdolist_list_var = cdolist_list_var.rest();
                cl_cycl = cdolist_list_var.first();
            } 
        }
        if ((NIL != cl_complement) && (NIL != member($INF_COMP, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($INF_COMP, cl_complement), conjuncts);
        }
        return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, disjuncts);
    }

    public static SubLObject verb_link_word_partition_semantic_complements_method(final SubLObject self) {
        final SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_SUBJECT);
        SubLObject non_distributing = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_COMPLEMENTS);
        if (NIL != subject) {
            non_distributing = cyclifier_interface.delete_cyclifiable(subject, non_distributing);
        }
        return values(non_distributing, NIL != subject ? list(subject) : NIL);
    }

    public static SubLObject subloop_reserved_initialize_verb_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_verb_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject verb_link_word_p(final SubLObject verb_link_word) {
        return classes.subloop_instanceof_class(verb_link_word, VERB_LINK_WORD);
    }

    public static SubLObject verb_link_word_get_subject_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != methods.$report_default_method_callsP$.getDynamicValue(thread)) {
            Errors.warn($str206$Default_method_call__a_on_class__, GET_SUBJECT, VERB_LINK_WORD);
        }
        return NIL;
    }

    public static SubLObject verb_link_word_get_semantic_subject_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != methods.$report_default_method_callsP$.getDynamicValue(thread)) {
            Errors.warn($str206$Default_method_call__a_on_class__, GET_SEMANTIC_SUBJECT, VERB_LINK_WORD);
        }
        return NIL;
    }

    public static SubLObject verb_link_word_get_objects_method(final SubLObject self) {
        SubLObject objects = NIL;
        SubLObject cdolist_list_var = list(methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT), methods.funcall_instance_method_with_0_args(self, GET_INDIRECT_OBJECT), methods.funcall_instance_method_with_0_args(self, GET_DIRECT_OBJECT));
        SubLObject v_object = NIL;
        v_object = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != v_object) {
                objects = cons(v_object, objects);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_object = cdolist_list_var.first();
        } 
        return objects;
    }

    public static SubLObject verb_link_word_get_semantic_direct_object_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != methods.$report_default_method_callsP$.getDynamicValue(thread)) {
            Errors.warn($str206$Default_method_call__a_on_class__, GET_SEMANTIC_DIRECT_OBJECT, VERB_LINK_WORD);
        }
        return NIL;
    }

    public static SubLObject verb_link_word_get_semantic_indirect_object_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != methods.$report_default_method_callsP$.getDynamicValue(thread)) {
            Errors.warn($str206$Default_method_call__a_on_class__, GET_SEMANTIC_INDIRECT_OBJECT, VERB_LINK_WORD);
        }
        return NIL;
    }

    public static SubLObject verb_link_word_get_semantic_objects_method(final SubLObject self) {
        SubLObject semantic_objects = NIL;
        SubLObject cdolist_list_var = list(methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT), methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_INDIRECT_OBJECT), methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_DIRECT_OBJECT));
        SubLObject sem_obj = NIL;
        sem_obj = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != sem_obj) {
                final SubLObject item_var = sem_obj;
                if (NIL == member(item_var, semantic_objects, EQ, symbol_function(IDENTITY))) {
                    semantic_objects = cons(item_var, semantic_objects);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            sem_obj = cdolist_list_var.first();
        } 
        return semantic_objects;
    }

    public static SubLObject verb_link_word_get_verbal_complement_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != methods.$report_default_method_callsP$.getDynamicValue(thread)) {
            Errors.warn($str206$Default_method_call__a_on_class__, GET_VERBAL_COMPLEMENT, VERB_LINK_WORD);
        }
        return NIL;
    }

    public static SubLObject verb_link_word_get_adjectival_complement_method(final SubLObject self) {
        return methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $P_A_PATTERN, $RIGHT).first();
    }

    public static SubLObject verb_link_word_get_pps_method(final SubLObject self) {
        return methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $MV_P_PATTERN);
    }

    public static SubLObject verb_link_word_get_infinitive_marker_method(final SubLObject self) {
        final SubLObject candidate = methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $I_PATTERN, $LEFT);
        return NIL != inf_marker_link_word_p(candidate) ? candidate : NIL;
    }

    public static SubLObject verb_link_word_infinitive_p_method(final SubLObject self) {
        return list_utilities.sublisp_boolean(methods.funcall_instance_method_with_0_args(self, GET_INFINITIVE_MARKER));
    }

    public static SubLObject verb_link_word_base_p_method(final SubLObject self) {
        return list_utilities.sublisp_boolean(methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $I_PATTERN, $LEFT));
    }

    public static SubLObject main_verb_link_word_get_controller_method(final SubLObject self) {
        final SubLObject control_verb = methods.funcall_instance_method_with_0_args(self, GET_CONTROL_VERB);
        if (NIL == control_verb) {
            return NIL;
        }
        if (NIL != methods.funcall_instance_method_with_0_args(control_verb, SUBJECT_CONTROLLER_P)) {
            return methods.funcall_instance_method_with_0_args(control_verb, GET_SEMANTIC_SUBJECT);
        }
        if (NIL != methods.funcall_instance_method_with_0_args(control_verb, OBJECT_CONTROLLER_P)) {
            return methods.funcall_instance_method_with_0_args(control_verb, GET_DIRECT_OBJECT);
        }
        return NIL;
    }

    public static SubLObject main_verb_link_word_get_control_verb_method(final SubLObject self) {
        final SubLObject matrix = methods.funcall_instance_method_with_0_args(self, GET_MATRIX_CLAUSE);
        final SubLObject matrix_head = (NIL != matrix) ? methods.funcall_instance_method_with_0_args(matrix, GET_HEAD) : NIL;
        if ((NIL != matrix_head) && (NIL != methods.funcall_instance_method_with_0_args(matrix_head, CONTROL_VERB_P))) {
            return matrix_head;
        }
        return NIL;
    }

    public static SubLObject main_verb_link_word_control_verb_p_method(final SubLObject self) {
        return makeBoolean((NIL != methods.funcall_instance_method_with_0_args(self, SUBJECT_CONTROLLER_P)) || (NIL != methods.funcall_instance_method_with_0_args(self, OBJECT_CONTROLLER_P)));
    }

    public static SubLObject main_verb_link_word_object_controller_p_method(final SubLObject self) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_LEXES);
        SubLObject lex = NIL;
        lex = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = member(methods.funcall_instance_method_with_1_args(lex, GET, $FRAME), $list570, UNPROVIDED, UNPROVIDED);
            if (NIL != result) {
                return list_utilities.sublisp_boolean(result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject main_verb_link_word_subject_controller_p_method(final SubLObject self) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_LEXES);
        SubLObject lex = NIL;
        lex = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = member(methods.funcall_instance_method_with_1_args(lex, GET, $FRAME), $list573, UNPROVIDED, UNPROVIDED);
            if (NIL != result) {
                return list_utilities.sublisp_boolean(result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject main_verb_link_word_get_matrix_clause_method(final SubLObject self) {
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_ANCESTORS);
        SubLObject ancestor = NIL;
        ancestor = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != parse_tree.sentential_tree_p(ancestor)) && (!methods.funcall_instance_method_with_0_args(ancestor, GET_HEAD).eql(self))) {
                return ancestor;
            }
            cdolist_list_var = cdolist_list_var.rest();
            ancestor = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject main_verb_link_word_partition_semantic_complements_method(final SubLObject self) {
        final SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_SUBJECT);
        SubLObject non_distributing = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_COMPLEMENTS);
        if (NIL != subject) {
            non_distributing = cyclifier_interface.delete_cyclifiable(subject, non_distributing);
        }
        return values(non_distributing, NIL != subject ? list(subject) : NIL);
    }

    public static SubLObject main_verb_link_word_particle_filter_lexes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_main_verb_link_word_method = NIL;
        SubLObject lexes = get_link_word_lexes(self);
        try {
            thread.throwStack.push($sym579$OUTER_CATCH_FOR_MAIN_VERB_LINK_WORD_METHOD);
            try {
                SubLObject filtered = NIL;
                final SubLObject sentence_particle = methods.funcall_instance_method_with_0_args(self, GET_PARTICLE);
                final SubLObject sentence_particle_head = (NIL != sentence_particle) ? methods.funcall_instance_method_with_0_args(sentence_particle, GET_HEAD) : NIL;
                SubLObject frame = NIL;
                SubLObject cdolist_list_var = lexes;
                SubLObject rle = NIL;
                rle = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    frame = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $FRAME);
                    if ((NIL != cycl_utilities.formula_arg2(frame, UNPROVIDED)) && (NIL != isa.isaP(frame, $$ParticleFrameType, $$EverythingPSC, UNPROVIDED))) {
                        if (NIL != sentence_particle_head) {
                            final SubLObject required_particle_string = lexicon_accessors.get_strings_of_type(cycl_utilities.formula_arg2(frame, UNPROVIDED), $$VerbParticle, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
                            if (required_particle_string.equalp(methods.funcall_instance_method_with_0_args(sentence_particle_head, GET_STRING))) {
                                cyclifier.rle_set_confidence(rle, ONE_INTEGER);
                                filtered = cons(rle, filtered);
                            }
                        }
                    } else
                        if (NIL == sentence_particle_head) {
                            filtered = cons(rle, filtered);
                        }

                    cdolist_list_var = cdolist_list_var.rest();
                    rle = cdolist_list_var.first();
                } 
                lexes = filtered;
                sublisp_throw($sym579$OUTER_CATCH_FOR_MAIN_VERB_LINK_WORD_METHOD, lexes);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_word_lexes(self, lexes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_main_verb_link_word_method = Errors.handleThrowable(ccatch_env_var, $sym579$OUTER_CATCH_FOR_MAIN_VERB_LINK_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_main_verb_link_word_method;
    }

    public static SubLObject main_verb_link_word_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
        if (keywords == UNPROVIDED) {
            keywords = $list504;
        }
        SubLObject conjuncts = NIL;
        SubLObject disjuncts = NIL;
        SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_SUBJECT);
        final SubLObject direct_object = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_DIRECT_OBJECT);
        final SubLObject indirect_object = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_INDIRECT_OBJECT);
        final SubLObject oblique_object = methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT);
        final SubLObject cl_complement = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
        final SubLObject modified = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS).first();
        if ((NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(self, GET_CATEGORY), $list507, EQL, UNPROVIDED)) && (NIL == subject)) {
            subject = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS).first();
        }
        if (NIL != subl_promotions.memberP($ACTION, keywords, EQL, UNPROVIDED)) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($ACTION, self), conjuncts);
        }
        if ((NIL != subject) && (NIL != member($SUBJECT, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($SUBJECT, subject), conjuncts);
        }
        if ((NIL != direct_object) && (NIL != member($OBJECT, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($OBJECT, direct_object), conjuncts);
        }
        if ((NIL != indirect_object) && (NIL != member($OBLIQUE_OBJECT, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($OBLIQUE_OBJECT, indirect_object), conjuncts);
        }
        if ((NIL != oblique_object) && (NIL != member($OBLIQUE_OBJECT, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($PREP_OBJECT, oblique_object), conjuncts);
        }
        if ((NIL != modified) && (NIL != member($NOUN, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($NOUN, modified), conjuncts);
        }
        if ((NIL != cl_complement) && (NIL != member($CLAUSE, keywords, EQL, UNPROVIDED))) {
            SubLObject cdolist_list_var;
            final SubLObject cl_cycls = cdolist_list_var = methods.funcall_instance_method_with_0_args(cl_complement, CYCLIFY_INT);
            SubLObject cl_cycl = NIL;
            cl_cycl = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cl_cycl = simplifier.lift_conjuncts(cl_cycl);
                disjuncts = cons(cons($CLAUSE, cl_cycl), disjuncts);
                cdolist_list_var = cdolist_list_var.rest();
                cl_cycl = cdolist_list_var.first();
            } 
        }
        if ((NIL != cl_complement) && (NIL != member($INF_COMP, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($INF_COMP, cl_complement), conjuncts);
        }
        return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, disjuncts);
    }

    public static SubLObject main_verb_link_word_cyclify_int_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != cyclifier_interface.$allow_duplicate_cyclificationsP$.getDynamicValue(thread)) || (NIL == member(self, cyclifier_interface.$cyclification_complete$.getDynamicValue(thread), EQ, UNPROVIDED))) {
            cyclifier_interface.$cyclification_complete$.setDynamicValue(cons(self, cyclifier_interface.$cyclification_complete$.getDynamicValue(thread)), thread);
            return methods.funcall_instance_method_with_0_args(self, CYCLIFY_NUCLEUS);
        }
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_main_verb_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_main_verb_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject main_verb_link_word_p(final SubLObject main_verb_link_word) {
        return classes.subloop_instanceof_class(main_verb_link_word, MAIN_VERB_LINK_WORD);
    }

    public static SubLObject main_verb_link_word_passive_p_method(final SubLObject self) {
        return list_utilities.sublisp_boolean(methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $P_V_PATTERN));
    }

    public static SubLObject main_verb_link_word_get_subject_method(final SubLObject self) {
        final SubLObject subjects = methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $S_PATTERN);
        if (NIL != subjects) {
            return get_link_phrase(subjects);
        }
        final SubLObject aux = methods.funcall_instance_method_with_0_args(self, GET_AUX_VERB);
        if (NIL != aux) {
            return methods.funcall_instance_method_with_0_args(aux, GET_SUBJECT);
        }
        final SubLObject controller = methods.funcall_instance_method_with_0_args(self, GET_CONTROLLER);
        if (NIL != controller) {
            return controller;
        }
        return NIL;
    }

    public static SubLObject main_verb_link_word_get_semantic_subject_method(final SubLObject self) {
        if (NIL != methods.funcall_instance_method_with_0_args(self, PASSIVE_P)) {
            SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_PPS);
            SubLObject preposition = NIL;
            preposition = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (methods.funcall_instance_method_with_0_args(preposition, GET_STRING).equal($$$by)) {
                    return methods.funcall_instance_method_with_0_args(preposition, GET_OBLIQUE_OBJECT);
                }
                cdolist_list_var = cdolist_list_var.rest();
                preposition = cdolist_list_var.first();
            } 
            return NIL;
        }
        final SubLObject aux = methods.funcall_instance_method_with_0_args(self, GET_AUX_VERB);
        return NIL != aux ? methods.funcall_instance_method_with_0_args(aux, GET_SUBJECT) : methods.funcall_instance_method_with_0_args(self, GET_SUBJECT);
    }

    public static SubLObject main_verb_link_word_get_direct_object_method(final SubLObject self) {
        SubLObject v_object = methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $kw600$O___N_PATTERN);
        if (NIL != v_object) {
            return get_link_phrase(v_object);
        }
        v_object = methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $O_PATTERN);
        if (NIL != v_object) {
            return get_link_phrase(v_object);
        }
        v_object = methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $B_PATTERN);
        if (NIL != v_object) {
            return get_link_phrase(v_object);
        }
        return NIL;
    }

    public static SubLObject main_verb_link_word_get_semantic_direct_object_method(final SubLObject self) {
        if (NIL != methods.funcall_instance_method_with_0_args(self, PASSIVE_P)) {
            SubLObject v_object = NIL;
            if (NIL == v_object) {
                SubLObject csome_list_var;
                SubLObject pattern;
                for (csome_list_var = $list605, pattern = NIL, pattern = csome_list_var.first(); (NIL == v_object) && (NIL != csome_list_var); v_object = methods.funcall_instance_method_with_1_args(self, GET_RELATED, pattern) , csome_list_var = csome_list_var.rest() , pattern = csome_list_var.first()) {
                }
            }
            return get_link_phrase(v_object);
        }
        return methods.funcall_instance_method_with_0_args(self, GET_DIRECT_OBJECT);
    }

    public static SubLObject main_verb_link_word_get_indirect_object_method(final SubLObject self) {
        final SubLObject obl_obj = methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT);
        if (NIL != obl_obj) {
            return obl_obj;
        }
        if (NIL != methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $kw600$O___N_PATTERN)) {
            final SubLObject v_object = methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $O_PATTERN);
            if (NIL != v_object) {
                return get_link_phrase(v_object);
            }
        }
        return NIL;
    }

    public static SubLObject main_verb_link_word_get_semantic_indirect_object_method(final SubLObject self) {
        if (NIL != methods.funcall_instance_method_with_0_args(self, PASSIVE_P)) {
            SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_PPS);
            SubLObject preposition = NIL;
            preposition = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (methods.funcall_instance_method_with_0_args(preposition, GET_STRING).equal($$$to)) {
                    return methods.funcall_instance_method_with_0_args(preposition, GET_OBLIQUE_OBJECT);
                }
                cdolist_list_var = cdolist_list_var.rest();
                preposition = cdolist_list_var.first();
            } 
            final SubLObject aux = methods.funcall_instance_method_with_0_args(self, GET_AUX_VERB);
            return NIL != aux ? methods.funcall_instance_method_with_0_args(aux, GET_SUBJECT) : NIL;
        }
        return methods.funcall_instance_method_with_0_args(self, GET_INDIRECT_OBJECT);
    }

    public static SubLObject main_verb_link_word_get_verbal_complement_method(final SubLObject self) {
        SubLObject complement = methods.funcall_instance_method_with_1_args(self, GET_RELATED, $list613);
        if (NIL == complement) {
            complement = methods.funcall_instance_method_with_1_args(self, GET_RELATED, $list614);
        }
        if (NIL == complement) {
            complement = methods.funcall_instance_method_with_1_args(self, GET_RELATED, $list615);
        }
        return NIL != complement ? get_link_phrase(complement) : NIL;
    }

    public static SubLObject main_verb_link_word_get_complements_method(final SubLObject self) {
        final SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_SUBJECT);
        final SubLObject v_do = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_DIRECT_OBJECT);
        final SubLObject io = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_INDIRECT_OBJECT);
        SubLObject complements = NIL;
        SubLObject cdolist_list_var = list(io, v_do, subject);
        SubLObject complement = NIL;
        complement = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != complement) {
                complements = cons(complement, complements);
            }
            cdolist_list_var = cdolist_list_var.rest();
            complement = cdolist_list_var.first();
        } 
        return complements;
    }

    public static SubLObject main_verb_link_word_get_aux_verb_method(final SubLObject self) {
        SubLObject aux = NIL;
        if (NIL == aux) {
            SubLObject csome_list_var;
            SubLObject patterns;
            for (csome_list_var = $list620, patterns = NIL, patterns = csome_list_var.first(); (NIL == aux) && (NIL != csome_list_var); aux = methods.funcall_instance_method_with_1_args(self, GET_RELATED, patterns).first() , csome_list_var = csome_list_var.rest() , patterns = csome_list_var.first()) {
            }
        }
        return NIL != aux_verb_link_word_p(aux) ? aux : NIL;
    }

    public static SubLObject main_verb_link_word_get_particle_method(final SubLObject self) {
        return get_link_phrase(methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $K_PATTERN, $RIGHT));
    }

    public static SubLObject main_verb_link_word_get_modifieds_method(final SubLObject self) {
        return append(methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $M_PATTERN, $LEFT), methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $A_PATTERN, $RIGHT));
    }

    public static SubLObject aux_verb_link_word_copula_p_method(final SubLObject self) {
        return makeBoolean(NIL == methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT));
    }

    public static SubLObject aux_verb_link_word_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
        if (keywords == UNPROVIDED) {
            keywords = $list637;
        }
        SubLObject conjuncts = NIL;
        SubLObject disjuncts = NIL;
        final SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_SUBJECT);
        final SubLObject direct_object = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_DIRECT_OBJECT);
        final SubLObject complement = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_COMPLEMENTS).first();
        if ((NIL != subject) && (NIL != member($SUBJECT, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($SUBJECT, subject), conjuncts);
        }
        if ((NIL != direct_object) && (NIL != member($OBJECT, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($OBJECT, direct_object), conjuncts);
        }
        if ((((NIL != complement) && ((NIL == subject) || (!complement.eql(subject)))) && (!complement.eql(direct_object))) && (NIL != member($COMPLEMENT, keywords, EQL, UNPROVIDED))) {
            SubLObject comp_cycls = methods.funcall_instance_method_with_0_args(complement, CYCLIFY_INT);
            if (NIL == comp_cycls) {
                comp_cycls = cons(NIL, comp_cycls);
            }
            SubLObject cdolist_list_var = comp_cycls;
            SubLObject comp_cycl = NIL;
            comp_cycl = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                comp_cycl = simplifier.lift_conjuncts(comp_cycl);
                disjuncts = cons(cons($COMPLEMENT, comp_cycl), disjuncts);
                cdolist_list_var = cdolist_list_var.rest();
                comp_cycl = cdolist_list_var.first();
            } 
        }
        return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, disjuncts);
    }

    public static SubLObject aux_verb_link_word_get_semantic_heads_method(final SubLObject self) {
        final SubLObject main_verb = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
        return NIL != main_verb ? methods.funcall_instance_method_with_0_args(main_verb, GET_SEMANTIC_HEADS) : list(self);
    }

    public static SubLObject aux_verb_link_word_get_tense_method(final SubLObject self) {
        return NIL != member(link_word_get_string_method(self), $list644, EQUALP, UNPROVIDED) ? $PRESENT : NIL != member(link_word_get_string_method(self), $list646, EQUALP, UNPROVIDED) ? $PAST : NIL != member(link_word_get_string_method(self), $list648, EQUALP, UNPROVIDED) ? $INFINITIVE : NIL;
    }

    public static SubLObject aux_verb_link_word_get_semantic_complements_method(final SubLObject self) {
        if (NIL != methods.funcall_instance_method_with_0_args(self, COPULA_P)) {
            return methods.funcall_instance_method_with_0_args(self, GET_COMPLEMENTS);
        }
        final SubLObject complement = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
        return NIL != complement ? list(complement) : NIL;
    }

    public static SubLObject aux_verb_link_word_get_complements_method(final SubLObject self) {
        SubLObject complements = NIL;
        final SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_SUBJECT);
        final SubLObject v_object = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_DIRECT_OBJECT);
        final SubLObject verbal_complement = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
        final SubLObject prep_complement = methods.funcall_instance_method_with_0_args(self, GET_PREPOSITIONAL_COMPLEMENT);
        final SubLObject adj_complement = methods.funcall_instance_method_with_0_args(self, GET_ADJECTIVAL_COMPLEMENT);
        final SubLObject adv_complement = methods.funcall_instance_method_with_0_args(self, GET_ADVERBIAL_COMPLEMENT);
        SubLObject cdolist_list_var = list(adv_complement, adj_complement, prep_complement, verbal_complement, v_object, subject);
        SubLObject complement = NIL;
        complement = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != complement) {
                complements = cons(complement, complements);
            }
            cdolist_list_var = cdolist_list_var.rest();
            complement = cdolist_list_var.first();
        } 
        return complements;
    }

    public static SubLObject subloop_reserved_initialize_aux_verb_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_aux_verb_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject aux_verb_link_word_p(final SubLObject aux_verb_link_word) {
        return classes.subloop_instanceof_class(aux_verb_link_word, AUX_VERB_LINK_WORD);
    }

    public static SubLObject aux_verb_link_word_get_subject_method(final SubLObject self) {
        return get_link_phrase(methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $S_PATTERN));
    }

    public static SubLObject aux_verb_link_word_get_verbal_complement_method(final SubLObject self) {
        SubLObject cdolist_list_var = $list662;
        SubLObject pattern = NIL;
        pattern = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject vcomps = NIL;
            vcomps = methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, pattern, $RIGHT);
            if ((NIL != vcomps) && (NIL != verb_link_word_p(vcomps.first()))) {
                return get_link_phrase(vcomps);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pattern = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject aux_verb_link_word_get_adjectival_complement_method(final SubLObject self) {
        final SubLObject acomp = methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $P_A_PATTERN, $RIGHT);
        return NIL != acomp ? get_link_phrase(acomp) : NIL;
    }

    public static SubLObject aux_verb_link_word_get_adverbial_complement_method(final SubLObject self) {
        final SubLObject acomp = methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $PF_PATTERN, $LEFT);
        return NIL != acomp ? get_link_phrase(acomp) : NIL;
    }

    public static SubLObject aux_verb_link_word_get_prepositional_complement_method(final SubLObject self) {
        final SubLObject pcomp = methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $P_P_PATTERN, $RIGHT);
        return NIL != pcomp ? get_link_phrase(pcomp) : NIL;
    }

    public static SubLObject aux_verb_link_word_equality_p_method(final SubLObject self) {
        return list_utilities.sublisp_boolean(methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $O_PATTERN));
    }

    public static SubLObject aux_verb_link_word_passive_p_method(final SubLObject self) {
        final SubLObject main = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
        return NIL != main ? methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(main, GET_HEAD), PASSIVE_P) : NIL;
    }

    public static SubLObject aux_verb_link_word_get_semantic_subject_method(final SubLObject self) {
        if (NIL != methods.funcall_instance_method_with_0_args(self, PASSIVE_P)) {
            final SubLObject main = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
            return (NIL != main) && (NIL != main_verb_link_word_p(methods.funcall_instance_method_with_0_args(main, GET_HEAD))) ? methods.funcall_instance_method_with_0_args(main, GET_SEMANTIC_SUBJECT) : NIL;
        }
        final SubLObject sister = methods.funcall_instance_method_with_1_args(self, GET_SISTER, ONE_INTEGER);
        if ((NIL != sister) && (NIL != nominal_link_tree_p(sister))) {
            return methods.funcall_instance_method_with_0_args(self, GET_SUBJECT);
        }
        return NIL;
    }

    public static SubLObject aux_verb_link_word_get_direct_object_method(final SubLObject self) {
        final SubLObject v_do = methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $O_PATTERN);
        return NIL != v_do ? get_link_phrase(v_do) : NIL;
    }

    public static SubLObject aux_verb_link_word_get_semantic_direct_object_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, GET_DIRECT_OBJECT);
    }

    public static SubLObject aux_verb_link_word_get_indirect_object_method(final SubLObject self) {
        return NIL;
    }

    public static SubLObject aux_verb_link_word_get_semantic_indirect_object_method(final SubLObject self) {
        return NIL;
    }

    public static SubLObject aux_verb_link_word_get_oblique_object_method(final SubLObject self) {
        final SubLObject verbal_complement = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
        return NIL != verbal_complement ? methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(verbal_complement, GET_HEAD), GET_OBLIQUE_OBJECT) : NIL;
    }

    public static SubLObject subloop_reserved_initialize_modal_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_modal_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject modal_link_word_p(final SubLObject modal_link_word) {
        return classes.subloop_instanceof_class(modal_link_word, MODAL_LINK_WORD);
    }

    public static SubLObject subloop_reserved_initialize_participle_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_participle_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject participle_link_word_p(final SubLObject participle_link_word) {
        return classes.subloop_instanceof_class(participle_link_word, PARTICIPLE_LINK_WORD);
    }

    public static SubLObject noun_link_word_definite_description_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_noun_link_word_method = NIL;
        final SubLObject pos = get_link_tree_pos(self);
        try {
            thread.throwStack.push($sym699$OUTER_CATCH_FOR_NOUN_LINK_WORD_METHOD);
            try {
                final SubLObject det = methods.funcall_instance_method_with_0_args(self, GET_DETERMINER);
                if ((NIL != det) && methods.funcall_instance_method_with_0_args(det, GET_STRING).equalp($$$the)) {
                    sublisp_throw($sym699$OUTER_CATCH_FOR_NOUN_LINK_WORD_METHOD, T);
                }
                final SubLObject head = methods.funcall_instance_method_with_0_args(self, GET_HEAD);
                if (((NIL != head) && (NIL != cyclifier_interface.name_word_p(head))) && (NIL != methods.funcall_instance_method_with_0_args(head, SINGULAR_P))) {
                    sublisp_throw($sym699$OUTER_CATCH_FOR_NOUN_LINK_WORD_METHOD, T);
                }
                final SubLObject pos_$24 = methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR);
                if (NIL != pos_$24) {
                    sublisp_throw($sym699$OUTER_CATCH_FOR_NOUN_LINK_WORD_METHOD, T);
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_tree_pos(self, pos);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_noun_link_word_method = Errors.handleThrowable(ccatch_env_var, $sym699$OUTER_CATCH_FOR_NOUN_LINK_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_noun_link_word_method;
    }

    public static SubLObject noun_link_word_cyclify_nucleus_method(final SubLObject self, SubLObject renamings_disj) {
        if (renamings_disj == UNPROVIDED) {
            renamings_disj = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cycls = NIL;
        SubLObject independent_mods = NIL;
        SubLObject dependent_mods = NIL;
        SubLObject comp_mod_cycls = NIL;
        thread.resetMultipleValues();
        final SubLObject independent_mods_$25 = cyclifier_interface.partition_modifiers(methods.funcall_instance_method_with_0_args(self, GET_MODIFIERS));
        final SubLObject dependent_mods_$26 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        independent_mods = independent_mods_$25;
        dependent_mods = dependent_mods_$26;
        if (NIL == subl_promotions.memberP(self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue(thread), EQ, UNPROVIDED)) {
            final SubLObject _prev_bind_0 = cyclifier_interface.$cyclification_in_progress$.currentBinding(thread);
            try {
                cyclifier_interface.$cyclification_in_progress$.bind(cons(self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue(thread)), thread);
                if (NIL == renamings_disj) {
                    renamings_disj = methods.funcall_instance_method_with_1_args(self, GET_KEYWORD_RENAMINGS, cyclifier.required_keywords(methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES)));
                }
                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_COMPLEMENTS);
                SubLObject complement = NIL;
                complement = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject comp_cycl = methods.funcall_instance_method_with_0_args(complement, CYCLIFY_INT);
                    if (NIL != comp_cycl) {
                        comp_mod_cycls = cons(comp_cycl, comp_mod_cycls);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    complement = cdolist_list_var.first();
                } 
                cdolist_list_var = independent_mods;
                SubLObject modifier = NIL;
                modifier = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject mod_cycl = methods.funcall_instance_method_with_0_args(modifier, CYCLIFY_INT);
                    if (NIL != mod_cycl) {
                        comp_mod_cycls = cons(mod_cycl, comp_mod_cycls);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    modifier = cdolist_list_var.first();
                } 
                cdolist_list_var = renamings_disj;
                SubLObject renamings_conj = NIL;
                renamings_conj = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cycls_conj = NIL;
                    SubLObject cdolist_list_var_$27 = methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES);
                    SubLObject rle = NIL;
                    rle = cdolist_list_var_$27.first();
                    while (NIL != cdolist_list_var_$27) {
                        SubLObject cycls_disj = NIL;
                        final SubLObject v_term = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $TERM);
                        SubLObject cdolist_list_var_$28 = renamings_conj;
                        SubLObject renaming = NIL;
                        renaming = cdolist_list_var_$28.first();
                        while (NIL != cdolist_list_var_$28) {
                            SubLObject my_cycls_with_mods = list(list(cyclifier_interface.apply_lex_renaming(self, rle, renaming)));
                            SubLObject cdolist_list_var_$29 = dependent_mods;
                            SubLObject mod = NIL;
                            mod = cdolist_list_var_$29.first();
                            while (NIL != cdolist_list_var_$29) {
                                my_cycls_with_mods = cons(methods.funcall_instance_method_with_1_args(mod, CYCLIFY_NUCLEUS, cyclifier_interface.update_keyword_renamings(methods.funcall_instance_method_with_0_args(mod, GET_KEYWORD_RENAMINGS), $REPLACE, v_term)), my_cycls_with_mods);
                                cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                                mod = cdolist_list_var_$29.first();
                            } 
                            cycls_disj = append(Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.cross_products(my_cycls_with_mods)), cycls_disj);
                            cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                            renaming = cdolist_list_var_$28.first();
                        } 
                        if (NIL != cycls_disj) {
                            cycls_conj = append(cycls_disj, cycls_conj);
                        }
                        cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                        rle = cdolist_list_var_$27.first();
                    } 
                    cycls = append(cycls, Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.cross_products(cons(cycls_conj, comp_mod_cycls))));
                    cdolist_list_var = cdolist_list_var.rest();
                    renamings_conj = cdolist_list_var.first();
                } 
            } finally {
                cyclifier_interface.$cyclification_in_progress$.rebind(_prev_bind_0, thread);
            }
        }
        return cycls;
    }

    public static SubLObject noun_link_word_cyclify_int_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != cyclifier_interface.$allow_duplicate_cyclificationsP$.getDynamicValue(thread)) || (NIL == member(self, cyclifier_interface.$cyclification_complete$.getDynamicValue(thread), EQ, UNPROVIDED))) {
            cyclifier_interface.$cyclification_complete$.setDynamicValue(cons(self, cyclifier_interface.$cyclification_complete$.getDynamicValue(thread)), thread);
            final SubLObject quantifier = methods.funcall_instance_method_with_0_args(self, GET_QUANTIFIER);
            SubLObject result = NIL;
            result = (NIL != quantifier) ? methods.funcall_instance_method_with_0_args(quantifier, CYCLIFY_INT) : methods.funcall_instance_method_with_0_args(self, CYCLIFY_NUCLEUS);
            return result;
        }
        return NIL;
    }

    public static SubLObject noun_link_word_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
        if (keywords == UNPROVIDED) {
            keywords = $list714;
        }
        SubLObject conjuncts = NIL;
        SubLObject disjuncts = NIL;
        final SubLObject complement = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_COMPLEMENTS).first();
        final SubLObject quantifier0 = methods.funcall_instance_method_with_0_args(self, GET_OVERT_QUANTIFIER);
        final SubLObject quantifier2 = (NIL != quantifier0) ? methods.funcall_instance_method_with_0_args(quantifier0, GET_HEAD) : NIL;
        final SubLObject modified = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS).first();
        if (NIL != subl_promotions.memberP($NOUN, keywords, EQL, UNPROVIDED)) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($NOUN, self), conjuncts);
        }
        if ((NIL != complement) && (NIL != member($OBLIQUE_OBJECT, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($PREP_OBJECT, complement), conjuncts);
        }
        if ((NIL != complement) && (NIL != member($POSSESSOR, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($POSSESSOR, complement), conjuncts);
        }
        if ((NIL != modified) && (NIL != member($MODIFIED, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($MODIFIED, modified), conjuncts);
        }
        if (((NIL != quantifier2) && methods.funcall_instance_method_with_0_args(quantifier2, GET_CATEGORY).eql($CD)) && (NIL != member($NUMBER, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($NUMBER, quantifier2), conjuncts);
        }
        if ((NIL != complement) && (NIL != member($POSS_COL, keywords, EQL, UNPROVIDED))) {
            final SubLObject head = methods.funcall_instance_method_with_0_args(complement, GET_HEAD);
            SubLObject cycl = NIL;
            SubLObject col = NIL;
            if (NIL != head) {
                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(head, GET_LEXES);
                SubLObject lex = NIL;
                lex = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    cycl = methods.funcall_instance_method_with_1_args(lex, GET, $SEMTRANS);
                    col = parse_tree.main_collection(cycl, $NOUN);
                    disjuncts = cons(cons($POSS_COL, col), disjuncts);
                    cdolist_list_var = cdolist_list_var.rest();
                    lex = cdolist_list_var.first();
                } 
                if (NIL == disjuncts) {
                    disjuncts = cons(cons($POSS_COL, $$Thing), disjuncts);
                }
            }
        }
        return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, disjuncts);
    }

    public static SubLObject noun_link_word_relational_noun_p_method(final SubLObject self) {
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES);
        SubLObject rle = NIL;
        rle = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject denot = cyclifier.rename_variables(methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $SEMTRANS), cyclifier.frame_renaming(methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $FRAME)));
            final SubLObject keywords = cyclifier.formula_keywords(denot);
            SubLObject cdolist_list_var_$30 = $list412;
            SubLObject keyword = NIL;
            keyword = cdolist_list_var_$30.first();
            while (NIL != cdolist_list_var_$30) {
                if (NIL != subl_promotions.memberP(keyword, keywords, EQ, UNPROVIDED)) {
                    return T;
                }
                cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                keyword = cdolist_list_var_$30.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            rle = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject noun_link_word_get_quantifier_method(final SubLObject self) {
        final SubLObject quantifier = methods.funcall_instance_method_with_0_args(self, GET_OVERT_QUANTIFIER);
        if (NIL != quantifier) {
            return methods.funcall_instance_method_with_0_args(quantifier, GET_STRING).equalp($$$the) ? NIL : quantifier;
        }
        if ((NIL == methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR)) && (NIL != methods.funcall_instance_method_with_0_args(self, SINGULAR_P))) {
            return methods.funcall_instance_method_with_0_args(self, GET_EXISTENTIAL_NULL_DETERMINER);
        }
        if ((NIL == methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR)) && (NIL != methods.funcall_instance_method_with_0_args(self, PLURAL_P))) {
            return methods.funcall_instance_method_with_0_args(self, GET_EXISTENTIAL_NULL_DETERMINER);
        }
        if (NIL == methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR)) {
            return NIL;
        }
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_noun_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_noun_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject noun_link_word_p(final SubLObject noun_link_word) {
        return classes.subloop_instanceof_class(noun_link_word, NOUN_LINK_WORD);
    }

    public static SubLObject noun_link_word_get_complements_method(final SubLObject self) {
        if (NIL != methods.funcall_instance_method_with_0_args(self, RELATIONAL_NOUN_P)) {
            SubLObject complement = NIL;
            SubLObject possessor = NIL;
            SubLObject preposition = NIL;
            possessor = methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR);
            if (NIL != possessor) {
                complement = possessor;
            }
            if (NIL == complement) {
                final SubLObject pp = methods.funcall_instance_method_with_0_args(self, GET_PPS).first();
                if (NIL != pp) {
                    preposition = methods.funcall_instance_method_with_0_args(pp, GET_HEAD);
                }
                if ((NIL != preposition) && methods.funcall_instance_method_with_0_args(preposition, GET_STRING).equalp($$$of)) {
                    complement = methods.funcall_instance_method_with_0_args(preposition, GET_OBLIQUE_OBJECT);
                }
            }
            return NIL != complement ? list(complement) : NIL;
        }
        return NIL;
    }

    public static SubLObject noun_link_word_get_modifieds_method(final SubLObject self) {
        return append(methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $MX_PATTERN, $LEFT), methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $GN_PATTERN, $RIGHT), methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $AN_PATTERN, $RIGHT));
    }

    public static SubLObject noun_link_word_get_determiner_method(final SubLObject self) {
        final SubLObject det = methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $D_S_PATTERN).first();
        if ((NIL != det) && (NIL == subl_promotions.memberP(methods.funcall_instance_method_with_0_args(det, GET_CATEGORY), $list741, UNPROVIDED, UNPROVIDED))) {
            return det;
        }
        return NIL;
    }

    public static SubLObject noun_link_word_get_cardinal_method(final SubLObject self) {
        return methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $D_MC_PATTERN).first();
    }

    public static SubLObject noun_link_word_get_overt_quantifier_method(final SubLObject self) {
        SubLObject quant = methods.funcall_instance_method_with_0_args(self, GET_DETERMINER);
        if (NIL != quant) {
            return quant;
        }
        quant = methods.funcall_instance_method_with_0_args(self, GET_CARDINAL);
        if (NIL != quant) {
            return quant;
        }
        return NIL;
    }

    public static SubLObject noun_link_word_get_possessor_method(final SubLObject self) {
        final SubLObject det = methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $D_PATTERN).first();
        if ((NIL != det) && (NIL != member(methods.funcall_instance_method_with_0_args(det, GET_CATEGORY), $list741, UNPROVIDED, UNPROVIDED))) {
            return det;
        }
        return NIL;
    }

    public static SubLObject noun_link_word_get_specifier_method(final SubLObject self) {
        final SubLObject spec = methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $D_PATTERN);
        return NIL != spec ? get_link_phrase(spec) : NIL;
    }

    public static SubLObject noun_link_word_get_pps_method(final SubLObject self) {
        return get_link_phrases(methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $M_P_PATTERN, $RIGHT));
    }

    public static SubLObject noun_link_word_get_existential_null_determiner_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_noun_link_word_method = NIL;
        final SubLObject lexes = get_link_word_lexes(self);
        SubLObject left_links = get_link_word_left_links(self);
        final SubLObject v_linkage = get_link_word_linkage(self);
        try {
            thread.throwStack.push($sym759$OUTER_CATCH_FOR_NOUN_LINK_WORD_METHOD);
            try {
                final SubLObject lex = object.new_class_instance(LEX_ENTRY);
                final SubLObject link = new_link($$$D);
                SubLObject det = NIL;
                methods.funcall_instance_method_with_2_args(lex, SET, $STRING, $str763$);
                methods.funcall_instance_method_with_2_args(lex, SET, $CYC_POS, $$Determiner);
                methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, $list766);
                methods.funcall_instance_method_with_2_args(lex, SET, $FRAME, $$DeterminerFrame);
                det = new_link_word(v_linkage, $str763$, ZERO_INTEGER, NIL, list(link), $DT, methods.funcall_instance_method_with_0_args(self, GET_CONTEXT));
                instances.set_slot(det, LEXES, cyclifier.new_even_lex_entry_distribution(list(lex)));
                _csetf_link_right_word(link, self);
                _csetf_link_left_word(link, det);
                left_links = cons(link, left_links);
                sublisp_throw($sym759$OUTER_CATCH_FOR_NOUN_LINK_WORD_METHOD, det);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_word_lexes(self, lexes);
                    set_link_word_left_links(self, left_links);
                    set_link_word_linkage(self, v_linkage);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_noun_link_word_method = Errors.handleThrowable(ccatch_env_var, $sym759$OUTER_CATCH_FOR_NOUN_LINK_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_noun_link_word_method;
    }

    public static SubLObject noun_link_word_singular_p_method(final SubLObject self) {
        return member(methods.funcall_instance_method_with_0_args(self, GET_CATEGORY), $list771, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject noun_link_word_plural_p_method(final SubLObject self) {
        return member(methods.funcall_instance_method_with_0_args(self, GET_CATEGORY), $list774, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject noun_link_word_appositive_p_method(final SubLObject self) {
        return list_utilities.sublisp_boolean(makeBoolean((NIL != methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $MX_PATTERN, $LEFT)) || (NIL != methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $GN_PATTERN, $RIGHT))));
    }

    public static SubLObject subloop_reserved_initialize_common_noun_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_common_noun_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject common_noun_link_word_p(final SubLObject common_noun_link_word) {
        return classes.subloop_instanceof_class(common_noun_link_word, COMMON_NOUN_LINK_WORD);
    }

    public static SubLObject proper_noun_link_word_get_quantifier_method(final SubLObject self) {
        final SubLObject quantifier = methods.funcall_instance_method_with_0_args(self, GET_OVERT_QUANTIFIER);
        return (NIL == quantifier) && (NIL != methods.funcall_instance_method_with_0_args(self, PLURAL_P)) ? methods.funcall_instance_method_with_0_args(self, GET_EXISTENTIAL_NULL_DETERMINER) : quantifier;
    }

    public static SubLObject subloop_reserved_initialize_proper_noun_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_proper_noun_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject proper_noun_link_word_p(final SubLObject proper_noun_link_word) {
        return classes.subloop_instanceof_class(proper_noun_link_word, PROPER_NOUN_LINK_WORD);
    }

    public static SubLObject subloop_reserved_initialize_gerund_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_gerund_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject gerund_link_word_p(final SubLObject gerund_link_word) {
        return classes.subloop_instanceof_class(gerund_link_word, GERUND_LINK_WORD);
    }

    public static SubLObject subloop_reserved_initialize_pronoun_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_pronoun_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject pronoun_link_word_p(final SubLObject pronoun_link_word) {
        return classes.subloop_instanceof_class(pronoun_link_word, PRONOUN_LINK_WORD);
    }

    public static SubLObject subloop_reserved_initialize_w_pronoun_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_w_pronoun_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject w_pronoun_link_word_p(final SubLObject w_pronoun_link_word) {
        return classes.subloop_instanceof_class(w_pronoun_link_word, W_PRONOUN_LINK_WORD);
    }

    public static SubLObject w_pronoun_link_word_get_refs_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_w_pronoun_link_word_method = NIL;
        final SubLObject ref = get_link_word_ref(self);
        try {
            thread.throwStack.push($sym799$OUTER_CATCH_FOR_W_PRONOUN_LINK_WORD_METHOD);
            try {
                final SubLObject antecedent = methods.funcall_instance_method_with_0_args(self, GET_ANTECEDENT);
                sublisp_throw($sym799$OUTER_CATCH_FOR_W_PRONOUN_LINK_WORD_METHOD, NIL != antecedent ? methods.funcall_instance_method_with_0_args(antecedent, GET_REFS) : list(ref));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_word_ref(self, ref);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_w_pronoun_link_word_method = Errors.handleThrowable(ccatch_env_var, $sym799$OUTER_CATCH_FOR_W_PRONOUN_LINK_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_w_pronoun_link_word_method;
    }

    public static SubLObject w_pronoun_link_word_get_antecedent_method(final SubLObject self) {
        final SubLObject antecedents = methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $MX_PATTERN, $LEFT);
        return NIL != antecedents ? get_link_phrase(antecedents) : NIL;
    }

    public static SubLObject w_pronoun_link_word_appositive_p_method(final SubLObject self) {
        return NIL;
    }

    public static SubLObject w_pronoun_link_word_get_quantifier_method(final SubLObject self) {
        return NIL;
    }

    public static SubLObject w_pronoun_link_word_get_modifieds_method(final SubLObject self) {
        return methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $R_PATTERN, $LEFT);
    }

    public static SubLObject subloop_reserved_initialize_rel_pronoun_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_rel_pronoun_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject rel_pronoun_link_word_p(final SubLObject rel_pronoun_link_word) {
        return classes.subloop_instanceof_class(rel_pronoun_link_word, REL_PRONOUN_LINK_WORD);
    }

    public static SubLObject subloop_reserved_initialize_personal_pronoun_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_personal_pronoun_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject personal_pronoun_link_word_p(final SubLObject personal_pronoun_link_word) {
        return classes.subloop_instanceof_class(personal_pronoun_link_word, PERSONAL_PRONOUN_LINK_WORD);
    }

    public static SubLObject adjective_link_word_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
        if (keywords == UNPROVIDED) {
            keywords = $list822;
        }
        SubLObject conjuncts = NIL;
        final SubLObject modified = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS).first();
        final SubLObject obl_obj = methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT);
        final SubLObject obl_obj_head = (NIL != obl_obj) ? methods.funcall_instance_method_with_0_args(obl_obj, GET_HEAD) : NIL;
        if (NIL != modified) {
            if (NIL != subl_promotions.memberP($NOUN, keywords, EQL, UNPROVIDED)) {
                conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($NOUN, modified), conjuncts);
            }
            if (NIL != subl_promotions.memberP($ACTION, keywords, EQL, UNPROVIDED)) {
                conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($ACTION, modified), conjuncts);
            }
            if (NIL != subl_promotions.memberP($REPLACE, keywords, EQL, UNPROVIDED)) {
                conjuncts = cons(list(cons($REPLACE, NIL)), conjuncts);
            }
        }
        if ((NIL != obl_obj_head) && (NIL != subl_promotions.memberP($OBLIQUE_OBJECT, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($PREP_OBJECT, obl_obj_head), conjuncts);
        }
        return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, NIL);
    }

    public static SubLObject adjective_link_word_get_complements_method(final SubLObject self) {
        final SubLObject modifieds = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS);
        final SubLObject obl_obj = methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT);
        return append(modifieds, NIL != obl_obj ? list(obl_obj) : NIL);
    }

    public static SubLObject subloop_reserved_initialize_adjective_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_adjective_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject adjective_link_word_p(final SubLObject adjective_link_word) {
        return classes.subloop_instanceof_class(adjective_link_word, ADJECTIVE_LINK_WORD);
    }

    public static SubLObject adjective_link_word_get_modifieds_method(final SubLObject self) {
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var;
            SubLObject pattern;
            for (csome_list_var = $list829, pattern = NIL, pattern = csome_list_var.first(); (NIL == result) && (NIL != csome_list_var); result = methods.funcall_instance_method_with_1_args(self, GET_RELATED, pattern) , csome_list_var = csome_list_var.rest() , pattern = csome_list_var.first()) {
            }
        }
        return result;
    }

    public static SubLObject adjective_link_word_get_pps_method(final SubLObject self) {
        return get_link_phrases(methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $MV_P_PATTERN));
    }

    public static SubLObject adverb_link_word_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
        if (keywords == UNPROVIDED) {
            keywords = $list838;
        }
        SubLObject conjuncts = NIL;
        final SubLObject modified = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS).first();
        final SubLObject subject = (NIL != cyclifier_interface.verbal_word_p(modified)) ? methods.funcall_instance_method_with_0_args(modified, GET_SUBJECT) : NIL;
        final SubLObject v_object = (NIL != cyclifier_interface.verbal_word_p(modified)) ? methods.funcall_instance_method_with_0_args(modified, GET_OBJECTS).first() : NIL;
        if ((NIL != modified) && (NIL != member($ACTION, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($ACTION, modified), conjuncts);
        }
        if ((NIL != subject) && (NIL != member($SUBJECT, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($SUBJECT, subject), conjuncts);
        }
        if ((NIL != v_object) && (NIL != member($OBJECT, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($OBJECT, v_object), conjuncts);
        }
        return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, NIL);
    }

    public static SubLObject subloop_reserved_initialize_adverb_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_adverb_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject adverb_link_word_p(final SubLObject adverb_link_word) {
        return classes.subloop_instanceof_class(adverb_link_word, ADVERB_LINK_WORD);
    }

    public static SubLObject adverb_link_word_get_modifieds_method(final SubLObject self) {
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var;
            SubLObject pattern;
            for (csome_list_var = $list843, pattern = NIL, pattern = csome_list_var.first(); (NIL == result) && (NIL != csome_list_var); result = methods.funcall_instance_method_with_1_args(self, GET_RELATED, pattern) , csome_list_var = csome_list_var.rest() , pattern = csome_list_var.first()) {
            }
        }
        if (NIL == result) {
            SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $N_PATTERN);
            SubLObject aux = NIL;
            aux = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != aux_verb_link_word_p(aux)) {
                    final SubLObject verbal_complement = methods.funcall_instance_method_with_0_args(aux, GET_VERBAL_COMPLEMENT);
                    if (NIL != verbal_complement) {
                        final SubLObject head = methods.funcall_instance_method_with_0_args(verbal_complement, GET_HEAD);
                        if (NIL != head) {
                            result = cons(head, result);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                aux = cdolist_list_var.first();
            } 
        }
        return result;
    }

    public static SubLObject adverb_link_word_get_complements_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS);
    }

    public static SubLObject subloop_reserved_initialize_w_adverb_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_w_adverb_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject w_adverb_link_word_p(final SubLObject w_adverb_link_word) {
        return classes.subloop_instanceof_class(w_adverb_link_word, W_ADVERB_LINK_WORD);
    }

    public static SubLObject w_adverb_link_word_get_modifieds_method(final SubLObject self) {
        final SubLObject verb = methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $Q_PATTERN, $RIGHT).first();
        SubLObject modifieds = (NIL != verb) ? methods.funcall_instance_method_with_0_args(verb, GET_SEMANTIC_HEADS) : NIL;
        if (NIL == modifieds) {
            final SubLObject copula = methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $PF_PATTERN).first();
            final SubLObject subject = (NIL != verb_link_word_p(copula)) ? methods.funcall_instance_method_with_0_args(copula, GET_SUBJECT) : NIL;
            if (NIL != subject) {
                modifieds = cons(subject, modifieds);
            }
        }
        return modifieds;
    }

    public static SubLObject preposition_link_word_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
        if (keywords == UNPROVIDED) {
            keywords = $list860;
        }
        if (!methods.funcall_instance_method_with_0_args(self, GET_STRING).equalp($$$that)) {
            SubLObject conjuncts = NIL;
            final SubLObject modified = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS).first();
            final SubLObject complement = methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT);
            final SubLObject clause = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
            if (((NIL != modified) && (NIL != member($NOUN, keywords, EQL, UNPROVIDED))) && (NIL != cyclifier_interface.nominal_word_p(modified))) {
                conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($NOUN, modified), conjuncts);
            }
            if (((NIL != modified) && (NIL != member($ACTION, keywords, EQL, UNPROVIDED))) && (NIL != cyclifier_interface.verbal_word_p(modified))) {
                conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($ACTION, modified), conjuncts);
            }
            if ((NIL != complement) && (NIL != member($OBJECT, keywords, EQL, UNPROVIDED))) {
                conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($OBJECT, complement), conjuncts);
            }
            if ((NIL != clause) && (NIL != member($CLAUSE, keywords, EQL, UNPROVIDED))) {
                conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($CLAUSE, clause), conjuncts);
            }
            return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, NIL);
        }
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_preposition_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_preposition_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject preposition_link_word_p(final SubLObject preposition_link_word) {
        return classes.subloop_instanceof_class(preposition_link_word, PREPOSITION_LINK_WORD);
    }

    public static SubLObject preposition_link_word_get_oblique_object_method(final SubLObject self) {
        SubLObject obl_obj = methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $J_PATTERN);
        if (NIL == obl_obj) {
            obl_obj = methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $ON_PATTERN);
        }
        return NIL != obl_obj ? get_link_phrase(obl_obj) : NIL;
    }

    public static SubLObject preposition_link_word_get_verbal_complement_method(final SubLObject self) {
        final SubLObject embedded_subject = methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $C_PATTERN, $RIGHT).first();
        final SubLObject embedded_verb = (NIL != embedded_subject) ? methods.funcall_instance_method_with_2_args(embedded_subject, GET_DIRECTLY_RELATED, $S_PATTERN, $RIGHT) : NIL;
        if (NIL != embedded_verb) {
            return get_link_phrase(embedded_verb);
        }
        return NIL;
    }

    public static SubLObject preposition_link_word_get_modifieds_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_preposition_link_word_method = NIL;
        final SubLObject modifiers = get_link_tree_modifiers(self);
        try {
            thread.throwStack.push($sym873$OUTER_CATCH_FOR_PREPOSITION_LINK_WORD_METHOD);
            try {
                final SubLObject copula = methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $P_PATTERN, $LEFT);
                final SubLObject subject = (NIL != aux_verb_link_word_p(copula.first())) ? methods.funcall_instance_method_with_0_args(copula.first(), GET_SUBJECT) : NIL;
                final SubLObject subj_head = (NIL != subject) ? methods.funcall_instance_method_with_0_args(subject, GET_HEAD) : NIL;
                final SubLObject candidates = append(NIL != subj_head ? list(subj_head) : NIL, methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $MV_PATTERN), methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $M_PATTERN), methods.funcall_instance_method_with_1_args(self, GET_RELATED, $list876));
                SubLObject complements = NIL;
                SubLObject cdolist_list_var = candidates;
                SubLObject candidate = NIL;
                candidate = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$31 = classes_utilities.funcall_instance_method_wXo_recursion(candidate, GET_COMPLEMENTS, NIL);
                    SubLObject complement = NIL;
                    complement = cdolist_list_var_$31.first();
                    while (NIL != cdolist_list_var_$31) {
                        if (complement.eql(methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT))) {
                            instances.set_slot(candidate, MODIFIERS, remove(self, instances.get_slot(candidate, MODIFIERS), EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                            complements = cons(candidate, complements);
                        }
                        cdolist_list_var_$31 = cdolist_list_var_$31.rest();
                        complement = cdolist_list_var_$31.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    candidate = cdolist_list_var.first();
                } 
                sublisp_throw($sym873$OUTER_CATCH_FOR_PREPOSITION_LINK_WORD_METHOD, set_difference(candidates, complements, UNPROVIDED, UNPROVIDED));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_link_tree_modifiers(self, modifiers);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_preposition_link_word_method = Errors.handleThrowable(ccatch_env_var, $sym873$OUTER_CATCH_FOR_PREPOSITION_LINK_WORD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_preposition_link_word_method;
    }

    public static SubLObject preposition_link_word_get_complements_method(final SubLObject self) {
        final SubLObject modifieds = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS);
        final SubLObject obj = methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT);
        final SubLObject clause = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
        return append(modifieds, NIL != obj ? list(obj) : NIL, NIL != clause ? list(clause) : NIL);
    }

    public static SubLObject quantifier_link_word_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
        if (keywords == UNPROVIDED) {
            keywords = $list885;
        }
        SubLObject conjuncts = NIL;
        final SubLObject disjuncts = NIL;
        if (NIL != subl_promotions.memberP($NOUN, keywords, EQL, UNPROVIDED)) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($NOUN, self), conjuncts);
        }
        return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, disjuncts);
    }

    public static SubLObject subloop_reserved_initialize_quantifier_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_quantifier_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject quantifier_link_word_p(final SubLObject quantifier_link_word) {
        return classes.subloop_instanceof_class(quantifier_link_word, QUANTIFIER_LINK_WORD);
    }

    public static SubLObject quantifier_link_word_get_quantified_method(final SubLObject self) {
        return methods.funcall_instance_method_with_1_args(self, GET_DIRECTLY_RELATED, $D_PATTERN).first();
    }

    public static SubLObject subloop_reserved_initialize_determiner_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_determiner_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject determiner_link_word_p(final SubLObject determiner_link_word) {
        return classes.subloop_instanceof_class(determiner_link_word, DETERMINER_LINK_WORD);
    }

    public static SubLObject subloop_reserved_initialize_definite_determiner_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_definite_determiner_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject definite_determiner_link_word_p(final SubLObject definite_determiner_link_word) {
        return classes.subloop_instanceof_class(definite_determiner_link_word, DEFINITE_DETERMINER_LINK_WORD);
    }

    public static SubLObject subloop_reserved_initialize_w_determiner_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_w_determiner_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject w_determiner_link_word_p(final SubLObject w_determiner_link_word) {
        return classes.subloop_instanceof_class(w_determiner_link_word, W_DETERMINER_LINK_WORD);
    }

    public static SubLObject subloop_reserved_initialize_predeterminer_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_predeterminer_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject predeterminer_link_word_p(final SubLObject predeterminer_link_word) {
        return classes.subloop_instanceof_class(predeterminer_link_word, PREDETERMINER_LINK_WORD);
    }

    public static SubLObject subloop_reserved_initialize_possessive_pronoun_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_possessive_pronoun_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject possessive_pronoun_link_word_p(final SubLObject possessive_pronoun_link_word) {
        return classes.subloop_instanceof_class(possessive_pronoun_link_word, POSSESSIVE_PRONOUN_LINK_WORD);
    }

    public static SubLObject subloop_reserved_initialize_cardinal_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cardinal_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject cardinal_link_word_p(final SubLObject cardinal_link_word) {
        return classes.subloop_instanceof_class(cardinal_link_word, CARDINAL_LINK_WORD);
    }

    public static SubLObject subloop_reserved_initialize_conjunction_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_conjunction_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject conjunction_link_word_p(final SubLObject conjunction_link_word) {
        return classes.subloop_instanceof_class(conjunction_link_word, CONJUNCTION_LINK_WORD);
    }

    public static SubLObject conjunction_link_word_get_complements_method(final SubLObject self) {
        return list(methods.funcall_instance_method_with_1_args(self, GET_SISTER, MINUS_ONE_INTEGER), methods.funcall_instance_method_with_1_args(self, GET_SISTER, ONE_INTEGER));
    }

    public static SubLObject subloop_reserved_initialize_existential_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_existential_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject existential_link_word_p(final SubLObject existential_link_word) {
        return classes.subloop_instanceof_class(existential_link_word, EXISTENTIAL_LINK_WORD);
    }

    public static SubLObject subloop_reserved_initialize_comparator_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_comparator_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject comparator_link_word_p(final SubLObject comparator_link_word) {
        return classes.subloop_instanceof_class(comparator_link_word, COMPARATOR_LINK_WORD);
    }

    public static SubLObject subloop_reserved_initialize_inf_marker_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_inf_marker_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject inf_marker_link_word_p(final SubLObject inf_marker_link_word) {
        return classes.subloop_instanceof_class(inf_marker_link_word, INF_MARKER_LINK_WORD);
    }

    public static SubLObject subloop_reserved_initialize_particle_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_particle_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject particle_link_word_p(final SubLObject particle_link_word) {
        return classes.subloop_instanceof_class(particle_link_word, PARTICLE_LINK_WORD);
    }

    public static SubLObject subloop_reserved_initialize_punctuation_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_punctuation_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject punctuation_link_word_p(final SubLObject punctuation_link_word) {
        return classes.subloop_instanceof_class(punctuation_link_word, PUNCTUATION_LINK_WORD);
    }

    public static SubLObject poss_marker_link_word_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
        if (keywords == UNPROVIDED) {
            keywords = $list937;
        }
        SubLObject conjuncts = NIL;
        final SubLObject possessor = methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR);
        final SubLObject possessed = methods.funcall_instance_method_with_0_args(self, GET_POSSESSED);
        if ((NIL != possessor) && (NIL != member($POSSESSOR, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($POSSESSOR, possessor), conjuncts);
        }
        if ((NIL != possessed) && (NIL != member($POSSESSED, keywords, EQL, UNPROVIDED))) {
            conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($POSSESSED, possessed), conjuncts);
        }
        return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, NIL);
    }

    public static SubLObject subloop_reserved_initialize_poss_marker_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_poss_marker_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject poss_marker_link_word_p(final SubLObject poss_marker_link_word) {
        return classes.subloop_instanceof_class(poss_marker_link_word, POSS_MARKER_LINK_WORD);
    }

    public static SubLObject poss_marker_link_word_get_possessor_method(final SubLObject self) {
        final SubLObject possessor = methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $YS_PATTERN, $LEFT);
        return NIL != possessor ? possessor.first() : NIL;
    }

    public static SubLObject poss_marker_link_word_get_possessed_method(final SubLObject self) {
        final SubLObject possessed = methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $D_PATTERN, $RIGHT);
        return NIL != possessed ? possessed.first() : NIL;
    }

    public static SubLObject poss_marker_link_word_get_complements_method(final SubLObject self) {
        SubLObject complements = NIL;
        SubLObject cdolist_list_var = list(methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR), methods.funcall_instance_method_with_0_args(self, GET_POSSESSED));
        SubLObject complement = NIL;
        complement = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != complement) {
                complements = cons(complement, complements);
            }
            cdolist_list_var = cdolist_list_var.rest();
            complement = cdolist_list_var.first();
        } 
        return complements;
    }

    public static SubLObject poss_marker_link_word_get_modifieds_method(final SubLObject self) {
        return methods.funcall_instance_method_with_2_args(self, GET_DIRECTLY_RELATED, $D_PATTERN, $RIGHT);
    }

    public static SubLObject subloop_reserved_initialize_complementizer_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_complementizer_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject complementizer_link_word_p(final SubLObject complementizer_link_word) {
        return classes.subloop_instanceof_class(complementizer_link_word, COMPLEMENTIZER_LINK_WORD);
    }

    public static SubLObject subloop_reserved_initialize_wall_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_wall_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject wall_link_word_p(final SubLObject wall_link_word) {
        return classes.subloop_instanceof_class(wall_link_word, WALL_LINK_WORD);
    }

    public static SubLObject subloop_reserved_initialize_left_wall_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_left_wall_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject left_wall_link_word_p(final SubLObject left_wall_link_word) {
        return classes.subloop_instanceof_class(left_wall_link_word, LEFT_WALL_LINK_WORD);
    }

    public static SubLObject subloop_reserved_initialize_right_wall_link_word_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_right_wall_link_word_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, POS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, HEADS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MOTHER, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_TREE, MODIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LINKAGE, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, REF, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, ABS_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEFT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, RIGHT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, LEXES, NIL);
        classes.subloop_initialize_slot(new_instance, LINK_WORD, CONTEXT, NIL);
        return NIL;
    }

    public static SubLObject right_wall_link_word_p(final SubLObject right_wall_link_word) {
        return classes.subloop_instanceof_class(right_wall_link_word, RIGHT_WALL_LINK_WORD);
    }

    public static SubLObject get_linkage_tree_string(final SubLObject v_linkage) {
        return classes.subloop_get_access_protected_instance_slot(v_linkage, FIVE_INTEGER, TREE_STRING);
    }

    public static SubLObject set_linkage_tree_string(final SubLObject v_linkage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_linkage, value, FIVE_INTEGER, TREE_STRING);
    }

    public static SubLObject get_linkage_tree(final SubLObject v_linkage) {
        return classes.subloop_get_access_protected_instance_slot(v_linkage, FOUR_INTEGER, TREE);
    }

    public static SubLObject set_linkage_tree(final SubLObject v_linkage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_linkage, value, FOUR_INTEGER, TREE);
    }

    public static SubLObject get_linkage_diagram(final SubLObject v_linkage) {
        return classes.subloop_get_access_protected_instance_slot(v_linkage, THREE_INTEGER, DIAGRAM);
    }

    public static SubLObject set_linkage_diagram(final SubLObject v_linkage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_linkage, value, THREE_INTEGER, DIAGRAM);
    }

    public static SubLObject get_linkage_words(final SubLObject v_linkage) {
        return classes.subloop_get_access_protected_instance_slot(v_linkage, TWO_INTEGER, WORDS);
    }

    public static SubLObject set_linkage_words(final SubLObject v_linkage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_linkage, value, TWO_INTEGER, WORDS);
    }

    public static SubLObject get_linkage_links(final SubLObject v_linkage) {
        return classes.subloop_get_access_protected_instance_slot(v_linkage, ONE_INTEGER, LINKS);
    }

    public static SubLObject set_linkage_links(final SubLObject v_linkage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_linkage, value, ONE_INTEGER, LINKS);
    }

    public static SubLObject linkage_cyclify_method(final SubLObject self, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject v_cyclifier = methods.funcall_instance_method_with_1_args(self, GET_CYCLIFIER, v_properties);
        SubLObject cycls = NIL;
        while (NIL != methods.funcall_instance_method_with_0_args(v_cyclifier, $sym974$HAS_NEXT_)) {
            cycls = cons(methods.funcall_instance_method_with_0_args(v_cyclifier, NEXT), cycls);
        } 
        return nreverse(cycls);
    }

    public static SubLObject linkage_get_cyclifier_method(final SubLObject self, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = v_properties;
        final SubLObject lexicon_tail = property_list_member($LEXICON, current);
        final SubLObject lexicon = (NIL != lexicon_tail) ? cadr(lexicon_tail) : object.new_class_instance(CYCLIFIER_LEXICON);
        final SubLObject score_function_tail = property_list_member($SCORE_FUNCTION, current);
        final SubLObject score_function = (NIL != score_function_tail) ? cadr(score_function_tail) : CYCLIFICATION_SCORE;
        final SubLObject output_tail = property_list_member($OUTPUT, current);
        final SubLObject output = (NIL != output_tail) ? cadr(output_tail) : $BRIEF;
        final SubLObject wff_checkP_tail = property_list_member($kw983$WFF_CHECK_, current);
        final SubLObject wff_checkP = (NIL != wff_checkP_tail) ? cadr(wff_checkP_tail) : T;
        final SubLObject context_tail = property_list_member($CONTEXT, current);
        SubLObject v_context = (NIL != context_tail) ? cadr(context_tail) : NIL;
        final SubLObject disambiguator_tail = property_list_member($DISAMBIGUATOR, current);
        final SubLObject disambiguator = (NIL != disambiguator_tail) ? cadr(disambiguator_tail) : NIL;
        final SubLObject coreference_resolver_tail = property_list_member($COREFERENCE_RESOLVER, current);
        final SubLObject v_coreference_resolver = (NIL != coreference_resolver_tail) ? cadr(coreference_resolver_tail) : NIL;
        final SubLObject error_handling_tail = property_list_member($ERROR_HANDLING, current);
        final SubLObject error_handling = (NIL != error_handling_tail) ? cadr(error_handling_tail) : $THROW;
        final SubLObject subcyclifier_pool_tail = property_list_member($SUBCYCLIFIER_POOL, current);
        final SubLObject subcyclifier_pool = (NIL != subcyclifier_pool_tail) ? cadr(subcyclifier_pool_tail) : subcyclifier.new_cyclifier_pool(list(object.new_class_instance(DATE_CYCLIFIER)));
        assert NIL != cyclifier_lexicon.cyclifier_lexicon_p(lexicon) : "cyclifier_lexicon.cyclifier_lexicon_p(lexicon) " + "CommonSymbols.NIL != cyclifier_lexicon.cyclifier_lexicon_p(lexicon) " + lexicon;
        assert NIL != function_spec_p(score_function) : "Types.function_spec_p(score_function) " + "CommonSymbols.NIL != Types.function_spec_p(score_function) " + score_function;
        assert NIL != keywordp(output) : "Types.keywordp(output) " + "CommonSymbols.NIL != Types.keywordp(output) " + output;
        if (((NIL != v_context) && (!assertionsDisabledSynth)) && (NIL == context.parse_tree_context_p(v_context))) {
            throw new AssertionError(v_context);
        }
        assert NIL != booleanp(wff_checkP) : "Types.booleanp(wff_checkP) " + "CommonSymbols.NIL != Types.booleanp(wff_checkP) " + wff_checkP;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == member(error_handling, $list996, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str997$Invalid_error_handling_tag__a, error_handling);
        }
        if (((NIL != subcyclifier_pool) && (!assertionsDisabledSynth)) && (NIL == subcyclifier.cyclifier_pool_p(subcyclifier_pool))) {
            throw new AssertionError(subcyclifier_pool);
        }
        final SubLObject v_cyclifier = object.new_class_instance(CYCLIFIER);
        cyclifier.set_cyclifier_score_function(v_cyclifier, score_function);
        cyclifier.set_cyclifier_output(v_cyclifier, output);
        cyclifier.set_cyclifier_error_handling(v_cyclifier, error_handling);
        cyclifier.set_cyclifier_subcyclifier_pool(v_cyclifier, subcyclifier_pool);
        if (NIL != lexicon) {
            methods.funcall_instance_method_with_1_args(self, LEXIFY, lexicon);
        }
        if (NIL != disambiguator) {
            if (NIL == v_context) {
                v_context = object.new_class_instance(PARSE_TREE_CONTEXT);
            }
            methods.funcall_instance_method_with_2_args(disambiguator, DISAMBIGUATE, self, v_context);
        }
        cyclifier.set_cyclifier_tree(v_cyclifier, self);
        cyclifier.set_cyclifier_wff_checkP(v_cyclifier, wff_checkP);
        if (NIL != wff_checkP) {
            cyclifier.set_cyclifier_memoization_state(v_cyclifier, memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            cyclifier.set_cyclifier_sbhl_resource(v_cyclifier, sbhl_marking_vars.new_sbhl_marking_space_resource(TEN_INTEGER));
        }
        return v_cyclifier;
    }

    public static SubLObject subloop_reserved_initialize_linkage_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_linkage_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LINKAGE, LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, LINKAGE, WORDS, NIL);
        classes.subloop_initialize_slot(new_instance, LINKAGE, DIAGRAM, NIL);
        classes.subloop_initialize_slot(new_instance, LINKAGE, TREE, NIL);
        classes.subloop_initialize_slot(new_instance, LINKAGE, TREE_STRING, NIL);
        return NIL;
    }

    public static SubLObject linkage_p(final SubLObject v_linkage) {
        return classes.subloop_instanceof_class(v_linkage, LINKAGE);
    }

    public static SubLObject do_linkage_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list1005);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link = NIL;
        SubLObject v_linkage = NIL;
        destructuring_bind_must_consp(current, datum, $list1005);
        link = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1005);
        v_linkage = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$32 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list1005);
            current_$32 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list1005);
            if (NIL == member(current_$32, $list1006, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$32 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list1005);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(CLET, list(link), list(DO_VECTOR, list(L, listS(GET_SLOT, v_linkage, $list1010), $DONE, done), listS(PWHEN, L, listS(CSETQ, link, $list1011), append(body, NIL))));
    }

    public static SubLObject do_linkage_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list1012);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = NIL;
        SubLObject v_linkage = NIL;
        destructuring_bind_must_consp(current, datum, $list1012);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1012);
        v_linkage = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, list(word), listS(DO_VECTOR, list(W, listS(GET_SLOT, v_linkage, $list1014)), listS(CSETQ, word, $list1015), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list1012);
        return NIL;
    }

    public static SubLObject words_to_sentence(final SubLObject words) {
        final SubLObject length = subtract(length(words), TWO_INTEGER);
        final SubLObject sentence = document.new_sentence(UNPROVIDED, UNPROVIDED);
        document._csetf_sign_constituents(sentence, make_vector(length, UNPROVIDED));
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            document.sentence_set(sentence, i, document.new_word(list($STRING, split_link_word(aref(words, number_utilities.f_1X(i))))));
        }
        return sentence;
    }

    public static SubLObject new_linkage(final SubLObject sentence, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return new_linkages(sentence, v_properties).first();
    }

    public static SubLObject set_new_linkage(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_linkage = NIL;
        SubLObject sentence = NIL;
        destructuring_bind_must_consp(current, datum, $list1016);
        v_linkage = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1016);
        sentence = current.first();
        current = current.rest();
        final SubLObject v_properties = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list1016);
        final SubLObject body;
        current = body = current.rest();
        final SubLObject error = $sym1017$ERROR;
        return listS(CLET, list(error), list(CATCH_ERROR_MESSAGE, list(error), list(CSETQ, v_linkage, list(NEW_LINKAGE, sentence, v_properties))), list(PWHEN, error, $list1020, list(CSETQ, v_linkage, list(NEW_LINKAGE, sentence, v_properties))), append(body, NIL));
    }

    public static SubLObject new_linkages(final SubLObject sentence, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = v_properties;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$33 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list1021);
            current_$33 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list1021);
            if (NIL == member(current_$33, $list1022, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$33 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list1021);
        }
        final SubLObject context_tail = property_list_member($CONTEXT, current);
        final SubLObject v_context = (NIL != context_tail) ? cadr(context_tail) : object.new_class_instance(PARSE_TREE_CONTEXT);
        final SubLObject options_tail = property_list_member($OPTIONS, current);
        final SubLObject options = (NIL != options_tail) ? cadr(options_tail) : $link_parse_options$.getDynamicValue(thread);
        final SubLObject lexicon_tail = property_list_member($LEXICON, current);
        final SubLObject lexicon = (NIL != lexicon_tail) ? cadr(lexicon_tail) : NIL;
        final SubLObject use_standardized_word_stringsP_tail = property_list_member($kw1024$USE_STANDARDIZED_WORD_STRINGS_, current);
        final SubLObject use_standardized_word_stringsP = (NIL != use_standardized_word_stringsP_tail) ? cadr(use_standardized_word_stringsP_tail) : T;
        assert NIL != stringp(sentence) : "Types.stringp(sentence) " + "CommonSymbols.NIL != Types.stringp(sentence) " + sentence;
        assert NIL != listp(options) : "Types.listp(options) " + "CommonSymbols.NIL != Types.listp(options) " + options;
        assert NIL != context.parse_tree_context_p(v_context) : "context.parse_tree_context_p(v_context) " + "CommonSymbols.NIL != context.parse_tree_context_p(v_context) " + v_context;
        SubLObject linkages = NIL;
        final SubLObject link_structures = link_parse(sentence, options, lexicon, use_standardized_word_stringsP);
        SubLObject tagged_sent = NIL;
        if (NIL == link_structures) {
            return NIL;
        }
        tagged_sent = words_to_sentence(ls_words(link_structures.first()));
        pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), tagged_sent);
        auxify_sentence(tagged_sent);
        SubLObject cdolist_list_var = link_structures;
        SubLObject link_structure = NIL;
        link_structure = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            linkages = cons(new_linkage_from_link_structure(link_structure, tagged_sent, v_context), linkages);
            cdolist_list_var = cdolist_list_var.rest();
            link_structure = cdolist_list_var.first();
        } 
        return linkages;
    }

    public static SubLObject new_linkage_from_link_structure(final SubLObject link_structure, final SubLObject tagged_sent, final SubLObject v_context) {
        if (NIL == ls_tree(link_structure)) {
            return NIL;
        }
        ensure_linkage_initialized();
        final SubLObject v_linkage = object.new_class_instance(LINKAGE);
        final SubLObject word_count = ls_number_of_words(link_structure);
        final SubLObject link_count = ls_number_of_links(link_structure);
        final SubLObject links = make_vector(link_count, UNPROVIDED);
        SubLObject words = NIL;
        final SubLObject word_links = make_vector(word_count, UNPROVIDED);
        final SubLObject tagged_sent_length = document.sentence_length(tagged_sent);
        SubLObject llinksXrlinks = NIL;
        SubLObject link_name = NIL;
        SubLObject index = NIL;
        SubLObject string = NIL;
        SubLObject pos = NIL;
        SubLObject wi;
        for (wi = NIL, wi = ZERO_INTEGER; wi.numL(word_count); wi = add(wi, ONE_INTEGER)) {
            set_aref(word_links, wi, cons(NIL, NIL));
        }
        SubLObject li;
        for (li = NIL, li = ZERO_INTEGER; li.numL(link_count); li = add(li, ONE_INTEGER)) {
            index = ls_lword_index_of_link(link_structure, li);
            llinksXrlinks = aref(word_links, index);
            rplacd(llinksXrlinks, cons(li, llinksXrlinks.rest()));
            index = ls_rword_index_of_link(link_structure, li);
            llinksXrlinks = aref(word_links, index);
            rplaca(llinksXrlinks, cons(li, llinksXrlinks.first()));
        }
        SubLObject llinks;
        SubLObject rlinks;
        SubLObject llink;
        SubLObject rlink;
        SubLObject cdolist_list_var;
        SubLObject llink_id;
        SubLObject rlink_id;
        for (wi = NIL, wi = ZERO_INTEGER; wi.numL(word_count); wi = add(wi, ONE_INTEGER)) {
            llinks = NIL;
            rlinks = NIL;
            llink = NIL;
            rlink = NIL;
            string = ls_word_of_linkage(link_structure, wi);
            pos = (wi.numL(ONE_INTEGER) || wi.numG(tagged_sent_length)) ? NIL : document.word_category(document.sentence_get(tagged_sent, number_utilities.f_1_(wi)));
            llinksXrlinks = aref(word_links, wi);
            cdolist_list_var = llinksXrlinks.first();
            llink_id = NIL;
            llink_id = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                link_name = ls_name_of_link(link_structure, llink_id);
                llink = aref(links, llink_id);
                if (NIL == llink) {
                    llink = new_link(link_name);
                    set_aref(links, llink_id, llink);
                }
                llinks = cons(llink, llinks);
                cdolist_list_var = cdolist_list_var.rest();
                llink_id = cdolist_list_var.first();
            } 
            cdolist_list_var = llinksXrlinks.rest();
            rlink_id = NIL;
            rlink_id = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                link_name = ls_name_of_link(link_structure, rlink_id);
                rlink = aref(links, rlink_id);
                if (NIL == rlink) {
                    rlink = new_link(link_name);
                    set_aref(links, rlink_id, rlink);
                }
                rlinks = cons(rlink, rlinks);
                cdolist_list_var = cdolist_list_var.rest();
                rlink_id = cdolist_list_var.first();
            } 
            words = cons(new_link_word(v_linkage, string, wi, llinks, rlinks, pos, v_context), words);
        }
        instances.set_slot(v_linkage, DIAGRAM, ls_diagram(link_structure));
        instances.set_slot(v_linkage, TREE, new_link_tree(ls_tree(link_structure), apply(VECTOR, reverse(words))));
        if (NIL == instances.get_slot(v_linkage, TREE)) {
            Errors.warn($str1025$Couldn_t_build_tree_from__a, ls_tree(link_structure));
            return NIL;
        }
        final SubLObject yield = methods.funcall_instance_method_with_0_args(instances.get_slot(v_linkage, TREE), YIELD);
        instances.set_slot(words.first(), ABS_INDEX, number_utilities.f_1X(length(yield)));
        instances.set_slot(v_linkage, WORDS, apply(VECTOR, append(last(words, UNPROVIDED), yield, list(words.first()))));
        SubLObject links_$34 = NIL;
        final SubLObject vector_var = instances.get_slot(v_linkage, WORDS);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject word;
        SubLObject cdolist_list_var2;
        SubLObject link;
        SubLObject item_var;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            word = aref(vector_var, element_num);
            cdolist_list_var2 = methods.funcall_instance_method_with_0_args(word, GET_LINKS);
            link = NIL;
            link = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                item_var = link;
                if (NIL == member(item_var, links_$34, symbol_function(EQL), symbol_function(IDENTITY))) {
                    links_$34 = cons(item_var, links_$34);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                link = cdolist_list_var2.first();
            } 
        }
        instances.set_slot(v_linkage, LINKS, apply(VECTOR, nreverse(links_$34)));
        instances.set_slot(v_linkage, TREE_STRING, ls_tree(link_structure));
        process_linkage_modifiers(v_linkage);
        retag_linkage_aux_verbs(v_linkage);
        return v_linkage;
    }

    public static SubLObject retag_linkage_aux_verbs(final SubLObject v_linkage) {
        SubLObject word = NIL;
        final SubLObject vector_var = instances.get_slot(v_linkage, WORDS);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject w;
        SubLObject new_word;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            w = word = aref(vector_var, element_num);
            if ((NIL != aux_verb_link_word_p(word)) && (NIL == methods.funcall_instance_method_with_0_args(word, GET_VERBAL_COMPLEMENT))) {
                new_word = create_link_word(v_linkage, methods.funcall_instance_method_with_0_args(word, GET_STRING), methods.funcall_instance_method_with_0_args(word, GET_INDEX), methods.funcall_instance_method_with_0_args(word, GET_ABS_INDEX), methods.funcall_instance_method_with_0_args(word, GET_LEFT_LINKS), methods.funcall_instance_method_with_0_args(word, GET_RIGHT_LINKS), cyclifier_interface.compute_main_verb_tag(word), methods.funcall_instance_method_with_0_args(word, GET_CONTEXT));
                set_aref(instances.get_slot(methods.funcall_instance_method_with_0_args(word, GET_MOTHER), DAUGHTERS), methods.funcall_instance_method_with_0_args(word, GET_INDEX), new_word);
                instances.set_slot(new_word, MOTHER, methods.funcall_instance_method_with_0_args(word, GET_MOTHER));
                set_aref(instances.get_slot(v_linkage, WORDS), methods.funcall_instance_method_with_0_args(word, GET_ABS_INDEX), new_word);
            }
        }
        return v_linkage;
    }

    public static SubLObject process_linkage_modifiers(final SubLObject v_linkage) {
        SubLObject word = NIL;
        final SubLObject vector_var = instances.get_slot(v_linkage, WORDS);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject w;
        SubLObject cdolist_list_var;
        SubLObject modified;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            w = word = aref(vector_var, element_num);
            cdolist_list_var = methods.funcall_instance_method_with_0_args(word, GET_MODIFIEDS);
            modified = NIL;
            modified = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                instances.set_slot(modified, MODIFIERS, cons(word, instances.get_slot(modified, MODIFIERS)));
                cdolist_list_var = cdolist_list_var.rest();
                modified = cdolist_list_var.first();
            } 
        }
        return v_linkage;
    }

    public static SubLObject linkage_yield_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_linkage_method = NIL;
        final SubLObject words = get_linkage_words(self);
        try {
            thread.throwStack.push($sym1027$OUTER_CATCH_FOR_LINKAGE_METHOD);
            try {
                SubLObject words_$35 = NIL;
                SubLObject word = NIL;
                final SubLObject vector_var = instances.get_slot(self, WORDS);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject w;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    w = word = aref(vector_var, element_num);
                    words_$35 = cons(word, words_$35);
                }
                sublisp_throw($sym1027$OUTER_CATCH_FOR_LINKAGE_METHOD, nreverse(words_$35));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_linkage_words(self, words);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym1027$OUTER_CATCH_FOR_LINKAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_linkage_method;
    }

    public static SubLObject linkage_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_linkage_method = NIL;
        final SubLObject tree = get_linkage_tree(self);
        try {
            thread.throwStack.push($sym1030$OUTER_CATCH_FOR_LINKAGE_METHOD);
            try {
                pprint_link_tree(tree, stream, ZERO_INTEGER);
                sublisp_throw($sym1030$OUTER_CATCH_FOR_LINKAGE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_linkage_tree(self, tree);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym1030$OUTER_CATCH_FOR_LINKAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_linkage_method;
    }

    public static SubLObject linkage_xml_method(final SubLObject self) {
        SubLObject xml = NIL;
        final SubLObject indent = ZERO_INTEGER;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            format(stream, $str1033$_linkage___);
            string_utilities.tab(add(indent, THREE_INTEGER), stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            format(stream, $str1034$_tree___);
            methods.funcall_instance_method_with_2_args(methods.funcall_instance_method_with_0_args(self, GET_TREE), XML, stream, add(indent, SIX_INTEGER));
            string_utilities.tab(add(indent, THREE_INTEGER), stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            format(stream, $str1036$__tree___);
            links_xml(get_linkage_links(self), stream, add(indent, THREE_INTEGER));
            format(stream, $str1037$__linkage___);
            xml = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return xml;
    }

    public static SubLObject link_tree_string(final SubLObject lt, final SubLObject stream) {
        return NIL != link_phrase_p(lt) ? link_phrase_string(lt, stream) : link_word_string(lt, stream);
    }

    public static SubLObject link_phrase_string(final SubLObject lp, final SubLObject stream) {
        format(stream, $str1039$__a, methods.funcall_instance_method_with_0_args(lp, GET_CATEGORY));
        final SubLObject vector_var = get_link_phrase_daughters(lp);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            daughter = aref(vector_var, element_num);
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
            link_tree_string(daughter, stream);
        }
        write_string($str268$_, stream, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject link_word_string(final SubLObject lw, final SubLObject stream) {
        write_string(methods.funcall_instance_method_with_0_args(lw, GET_STRING), stream, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject links_xml(final SubLObject links, final SubLObject stream, final SubLObject indent) {
        string_utilities.tab(indent, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format(stream, $str1040$_links___);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject link;
        for (length = length(links), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            link = aref(links, element_num);
            if (NIL != link) {
                link_xml(link, stream, add(indent, THREE_INTEGER));
            }
        }
        string_utilities.tab(indent, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format(stream, $str1041$__links___);
        return NIL;
    }

    public static SubLObject diagram_xml(final SubLObject diagram, final SubLObject stream, final SubLObject indent) {
        string_utilities.tab(indent, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format(stream, $str1042$_diagram___);
        string_utilities.tab(add(indent, THREE_INTEGER), stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        write_string(diagram, stream, UNPROVIDED, UNPROVIDED);
        terpri(stream);
        string_utilities.tab(indent, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format(stream, $str1043$__diagram___);
        return NIL;
    }

    public static SubLObject tree_string_xml(final SubLObject tree_string, final SubLObject stream, final SubLObject indent) {
        string_utilities.tab(indent, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format(stream, $str1044$_tree_string___);
        string_utilities.tab(add(indent, THREE_INTEGER), stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        write_string(tree_string, stream, UNPROVIDED, UNPROVIDED);
        terpri(stream);
        string_utilities.tab(indent, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format(stream, $str1045$__tree_string___);
        return NIL;
    }

    public static SubLObject linkage_print_diagram_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_linkage_method = NIL;
        final SubLObject diagram = get_linkage_diagram(self);
        try {
            thread.throwStack.push($sym1048$OUTER_CATCH_FOR_LINKAGE_METHOD);
            try {
                princ(diagram, UNPROVIDED);
                sublisp_throw($sym1048$OUTER_CATCH_FOR_LINKAGE_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_linkage_diagram(self, diagram);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym1048$OUTER_CATCH_FOR_LINKAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_linkage_method;
    }

    public static SubLObject linkage_length_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_linkage_method = NIL;
        final SubLObject words = get_linkage_words(self);
        try {
            thread.throwStack.push($sym1052$OUTER_CATCH_FOR_LINKAGE_METHOD);
            try {
                sublisp_throw($sym1052$OUTER_CATCH_FOR_LINKAGE_METHOD, subtract(length(words), TWO_INTEGER));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_linkage_words(self, words);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym1052$OUTER_CATCH_FOR_LINKAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_linkage_method;
    }

    public static SubLObject linkage_get_tree_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_linkage_method = NIL;
        final SubLObject tree = get_linkage_tree(self);
        try {
            thread.throwStack.push($sym1055$OUTER_CATCH_FOR_LINKAGE_METHOD);
            try {
                sublisp_throw($sym1055$OUTER_CATCH_FOR_LINKAGE_METHOD, tree);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_linkage_tree(self, tree);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym1055$OUTER_CATCH_FOR_LINKAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_linkage_method;
    }

    public static SubLObject linkage_get_tree_string_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_linkage_method = NIL;
        final SubLObject tree_string = get_linkage_tree_string(self);
        try {
            thread.throwStack.push($sym1059$OUTER_CATCH_FOR_LINKAGE_METHOD);
            try {
                sublisp_throw($sym1059$OUTER_CATCH_FOR_LINKAGE_METHOD, tree_string);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_linkage_tree_string(self, tree_string);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym1059$OUTER_CATCH_FOR_LINKAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_linkage_method;
    }

    public static SubLObject linkage_get_daughter_method(final SubLObject self, final SubLObject i) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_linkage_method = NIL;
        final SubLObject tree = get_linkage_tree(self);
        try {
            thread.throwStack.push($sym1062$OUTER_CATCH_FOR_LINKAGE_METHOD);
            try {
                sublisp_throw($sym1062$OUTER_CATCH_FOR_LINKAGE_METHOD, methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, i));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_linkage_tree(self, tree);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym1062$OUTER_CATCH_FOR_LINKAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_linkage_method;
    }

    public static SubLObject linkage_get_word_method(final SubLObject self, final SubLObject i) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_linkage_method = NIL;
        final SubLObject words = get_linkage_words(self);
        try {
            thread.throwStack.push($sym1066$OUTER_CATCH_FOR_LINKAGE_METHOD);
            try {
                assert NIL != subl_promotions.non_negative_integer_p(i) : "subl_promotions.non_negative_integer_p(i) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(i) " + i;
                if (!i.numG(number_utilities.f_1_(length(words)))) {
                    sublisp_throw($sym1066$OUTER_CATCH_FOR_LINKAGE_METHOD, aref(words, i));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_linkage_words(self, words);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym1066$OUTER_CATCH_FOR_LINKAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_linkage_method;
    }

    public static SubLObject linkage_get_heads_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_linkage_method = NIL;
        final SubLObject words = get_linkage_words(self);
        try {
            thread.throwStack.push($sym1069$OUTER_CATCH_FOR_LINKAGE_METHOD);
            try {
                SubLObject heads = NIL;
                SubLObject cdolist_list_var = $list1070;
                SubLObject patterns = NIL;
                patterns = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$36 = methods.funcall_instance_method_with_1_args(aref(words, ZERO_INTEGER), GET_RELATED, patterns);
                    SubLObject head = NIL;
                    head = cdolist_list_var_$36.first();
                    while (NIL != cdolist_list_var_$36) {
                        if (NIL != verb_link_word_p(head)) {
                            final SubLObject item_var = head;
                            if (NIL == member(item_var, heads, EQ, symbol_function(IDENTITY))) {
                                heads = cons(item_var, heads);
                            }
                        }
                        cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                        head = cdolist_list_var_$36.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    patterns = cdolist_list_var.first();
                } 
                sublisp_throw($sym1069$OUTER_CATCH_FOR_LINKAGE_METHOD, heads);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_linkage_words(self, words);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym1069$OUTER_CATCH_FOR_LINKAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_linkage_method;
    }

    public static SubLObject linkage_get_head_method(final SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, GET_HEADS).first();
    }

    public static SubLObject linkage_get_subject_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, GET_HEAD);
        return NIL != head ? methods.funcall_instance_method_with_0_args(head, GET_SUBJECT) : NIL;
    }

    public static SubLObject linkage_get_direct_object_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, GET_HEAD);
        return NIL != head ? methods.funcall_instance_method_with_0_args(head, GET_DIRECT_OBJECT) : NIL;
    }

    public static SubLObject linkage_get_indirect_object_method(final SubLObject self) {
        final SubLObject head = methods.funcall_instance_method_with_0_args(self, GET_HEAD);
        return NIL != head ? methods.funcall_instance_method_with_0_args(head, GET_INDIRECT_OBJECT) : NIL;
    }

    public static SubLObject linkage_cyclify_int_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_linkage_method = NIL;
        final SubLObject tree = get_linkage_tree(self);
        try {
            thread.throwStack.push($sym1081$OUTER_CATCH_FOR_LINKAGE_METHOD);
            try {
                sublisp_throw($sym1081$OUTER_CATCH_FOR_LINKAGE_METHOD, methods.funcall_instance_method_with_0_args(tree, CYCLIFY_INT));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_linkage_tree(self, tree);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym1081$OUTER_CATCH_FOR_LINKAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_linkage_method;
    }

    public static SubLObject linkage_lexify_method(final SubLObject self, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_linkage_method = NIL;
        final SubLObject words = get_linkage_words(self);
        try {
            thread.throwStack.push($sym1084$OUTER_CATCH_FOR_LINKAGE_METHOD);
            try {
                assert NIL != semtrans_lexicon.semtrans_lexicon_p(lexicon) : "semtrans_lexicon.semtrans_lexicon_p(lexicon) " + "CommonSymbols.NIL != semtrans_lexicon.semtrans_lexicon_p(lexicon) " + lexicon;
                final SubLObject vector_var = words;
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject word;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    word = aref(vector_var, element_num);
                    methods.funcall_instance_method_with_1_args(word, LEXIFY, lexicon);
                }
                sublisp_throw($sym1084$OUTER_CATCH_FOR_LINKAGE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_linkage_words(self, words);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym1084$OUTER_CATCH_FOR_LINKAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_linkage_method;
    }

    public static SubLObject linkage_cyclifiable_question_p_method(final SubLObject self) {
        return list_utilities.sublisp_boolean(methods.funcall_instance_method_with_1_args(self, SEARCH, $str1090$_));
    }

    public static SubLObject linkage_search_method(final SubLObject self, final SubLObject word, SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_linkage_method = NIL;
        final SubLObject words = get_linkage_words(self);
        try {
            thread.throwStack.push($sym1094$OUTER_CATCH_FOR_LINKAGE_METHOD);
            try {
                assert NIL != stringp(word) : "Types.stringp(word) " + "CommonSymbols.NIL != Types.stringp(word) " + word;
                assert NIL != subl_promotions.non_negative_integer_p(n) : "subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) " + n;
                SubLObject counter = ZERO_INTEGER;
                SubLObject cdotimes_end_var;
                SubLObject i;
                for (cdotimes_end_var = length(words), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                    if (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(self, GET_WORD, i), GET_STRING).equalp(word)) {
                        counter = add(counter, ONE_INTEGER);
                        if (counter.numE(n)) {
                            sublisp_throw($sym1094$OUTER_CATCH_FOR_LINKAGE_METHOD, methods.funcall_instance_method_with_1_args(self, GET_WORD, i));
                        }
                    }
                }
                sublisp_throw($sym1094$OUTER_CATCH_FOR_LINKAGE_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_linkage_words(self, words);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_linkage_method = Errors.handleThrowable(ccatch_env_var, $sym1094$OUTER_CATCH_FOR_LINKAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_linkage_method;
    }

    public static SubLObject get_link_pattern(final SubLObject keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pattern = assoc(keyword, $link_pattern_table$.getDynamicValue(thread), EQL, UNPROVIDED).rest();
        if (NIL == pattern) {
            Errors.error($str1096$No_regex_pattern_for__a, keyword);
        }
        return pattern;
    }

    public static SubLObject links_to_classes(final SubLObject llinks, final SubLObject rlinks) {
        if (NIL == pos_evidence_tables_initializedP()) {
            initialize_pos_evidence_tables();
        }
        SubLObject classes_conjunction = NIL;
        SubLObject classes_disjunction = NIL;
        SubLObject cdolist_list_var = llinks;
        SubLObject left_link = NIL;
        left_link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            classes_disjunction = link_to_classes(left_link, $llink_table$.getGlobalValue());
            if (NIL != classes_disjunction) {
                classes_conjunction = cons(classes_disjunction, classes_conjunction);
            }
            cdolist_list_var = cdolist_list_var.rest();
            left_link = cdolist_list_var.first();
        } 
        cdolist_list_var = rlinks;
        SubLObject right_link = NIL;
        right_link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            classes_disjunction = link_to_classes(right_link, $rlink_table$.getGlobalValue());
            if (NIL != classes_disjunction) {
                classes_conjunction = cons(classes_disjunction, classes_conjunction);
            }
            cdolist_list_var = cdolist_list_var.rest();
            right_link = cdolist_list_var.first();
        } 
        return classes_conjunction;
    }

    public static SubLObject link_to_classes(final SubLObject link, final SubLObject table) {
        final SubLObject coreXmods = split_link(link);
        final SubLObject mod_table = gethash_without_values(coreXmods.first(), table, UNPROVIDED);
        final SubLObject mods = coreXmods.rest();
        SubLObject mod_classes = NIL;
        SubLObject v_classes = assoc(NIL, mod_table, EQ, UNPROVIDED).rest();
        final SubLObject string_var = mods;
        SubLObject end_var_$37;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject mod;
        for (end_var = end_var_$37 = length(string_var), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$37); char_num = number_utilities.f_1X(char_num)) {
            mod = Strings.sublisp_char(string_var, char_num);
            mod_classes = assoc(mod, mod_table, EQ, UNPROVIDED).rest();
            if (NIL != mod_classes) {
                v_classes = intersection(v_classes, mod_classes, EQ, UNPROVIDED);
            }
        }
        return v_classes;
    }

    public static SubLObject split_link(final SubLObject link) {
        final SubLObject mod_start = list_utilities.position_if_not(UPPER_CASE_P, link, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject v_core = subseq(link, ZERO_INTEGER, mod_start);
        final SubLObject modifier = (NIL != mod_start) ? subseq(link, mod_start, UNPROVIDED) : $str763$;
        return cons(v_core, modifier);
    }

    public static SubLObject strip_link_modifiers(final SubLObject link) {
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = length(link), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            if (NIL == upper_case_p(aref(link, i))) {
                return subseq(link, ZERO_INTEGER, i);
            }
        }
        return link;
    }

    public static SubLObject get_link_word_class(final SubLObject word, final SubLObject pos, final SubLObject llinks, final SubLObject rlinks, final SubLObject penn_pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject classes_conjunction = $list1098;
        SubLObject link_classes = NIL;
        SubLObject link_penn_classes = NIL;
        SubLObject v_class = NIL;
        SubLObject most_specific_class = NIL;
        SubLObject most_specific_count = NIL;
        SubLObject derived_pos = NIL;
        if (NIL != pos) {
            v_class = link_pos_to_class(pos);
            if (NIL != v_class) {
                classes_conjunction = cons(list(v_class), classes_conjunction);
            }
        }
        classes_conjunction = append(classes_conjunction, links_to_classes(llinks, rlinks));
        v_class = word_to_class(word);
        if (NIL != v_class) {
            classes_conjunction = cons(list(v_class), classes_conjunction);
        }
        SubLObject cdolist_list_var = list_utilities.cross_products(classes_conjunction);
        SubLObject class_conjunction = NIL;
        class_conjunction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            most_specific_class = most_specific_class(class_conjunction);
            if (NIL != most_specific_class) {
                link_classes = cons(most_specific_class, link_classes);
            }
            cdolist_list_var = cdolist_list_var.rest();
            class_conjunction = cdolist_list_var.first();
        } 
        final SubLObject pcase_var;
        most_specific_count = pcase_var = length(link_classes);
        if (pcase_var.eql(ZERO_INTEGER)) {
            if (NIL != $show_link_warnings$.getDynamicValue(thread)) {
                Errors.warn($str1099$Inconsistent_class_evidence_from_, new SubLObject[]{ classes_conjunction, word, pos, llinks, rlinks });
            }
            v_class = NIL;
        } else
            if (pcase_var.eql(ONE_INTEGER)) {
                if (NIL == classes.superclassp(WALL_LINK_WORD, link_classes.first())) {
                    thread.resetMultipleValues();
                    final SubLObject v_class_$38 = strengthen_pos_class(word, link_classes.first(), penn_pos);
                    final SubLObject derived_pos_$39 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    v_class = v_class_$38;
                    derived_pos = derived_pos_$39;
                    if (NIL != v_class) {
                        if (NIL == derived_pos) {
                            SubLObject cdolist_list_var2 = list_utilities.cross_products(list(link_classes, penn_pos_to_classes(penn_pos)));
                            SubLObject class_conjunction2 = NIL;
                            class_conjunction2 = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                final SubLObject specific_class = most_specific_class(class_conjunction2);
                                if (NIL != specific_class) {
                                    v_class = specific_class;
                                    derived_pos = penn_pos;
                                }
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                class_conjunction2 = cdolist_list_var2.first();
                            } 
                        }
                    } else {
                        if (NIL != $show_link_warnings$.getDynamicValue(thread)) {
                            Errors.warn($str1100$Couldn_t_strengthen_link_required, link_classes.first(), word);
                        }
                        v_class = link_classes.first();
                    }
                }
            } else
                if (NIL != penn_pos) {
                    SubLObject cdolist_list_var2 = list_utilities.cross_products(list(penn_pos_to_classes(penn_pos), link_classes));
                    SubLObject class_conjunction2 = NIL;
                    class_conjunction2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        most_specific_class = most_specific_class(class_conjunction2);
                        if (NIL != most_specific_class) {
                            link_penn_classes = cons(most_specific_class, link_penn_classes);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        class_conjunction2 = cdolist_list_var2.first();
                    } 
                    final SubLObject pcase_var_$40;
                    most_specific_count = pcase_var_$40 = length(link_penn_classes);
                    if (pcase_var_$40.eql(ZERO_INTEGER)) {
                        v_class = NIL;
                        if (NIL == v_class) {
                            SubLObject csome_list_var = link_classes;
                            SubLObject link_class = NIL;
                            link_class = csome_list_var.first();
                            while ((NIL == v_class) && (NIL != csome_list_var)) {
                                thread.resetMultipleValues();
                                final SubLObject v_class_$39 = strengthen_pos_class(word, link_class, penn_pos);
                                final SubLObject derived_pos_$40 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                v_class = v_class_$39;
                                derived_pos = derived_pos_$40;
                                csome_list_var = csome_list_var.rest();
                                link_class = csome_list_var.first();
                            } 
                        }
                    } else
                        if (pcase_var_$40.eql(ONE_INTEGER)) {
                            v_class = link_penn_classes.first();
                            derived_pos = penn_pos;
                        } else {
                            if (NIL != $show_link_warnings$.getDynamicValue(thread)) {
                                Errors.warn($str1101$Disjunctive_class_evidence__a_for, new SubLObject[]{ classes_conjunction, word, pos, llinks, rlinks, penn_pos });
                            }
                            v_class = NIL;
                        }

                } else {
                    if (NIL != $show_link_warnings$.getDynamicValue(thread)) {
                        Errors.warn($str1101$Disjunctive_class_evidence__a_for, new SubLObject[]{ classes_conjunction, word, pos, llinks, rlinks, penn_pos });
                    }
                    v_class = NIL;
                }


        if (NIL == v_class) {
            v_class = LINK_WORD;
            derived_pos = penn_pos;
        }
        return values(v_class, derived_pos);
    }

    public static SubLObject link_pos_to_class(final SubLObject pos) {
        return assoc(pos, $link_pos_to_class$.getGlobalValue(), EQL, UNPROVIDED).rest();
    }

    public static SubLObject penn_pos_to_classes(final SubLObject pos) {
        return gethash(pos, $pos_class_table$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject word_to_class(final SubLObject word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return assoc(word, $word_to_class$.getDynamicValue(thread), EQUALP, UNPROVIDED).rest();
    }

    public static SubLObject class_to_penn_poss(final SubLObject v_class) {
        return gethash(v_class, $class_pos_table$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject most_specific_class(final SubLObject v_classes) {
        assert NIL != listp(v_classes) : "Types.listp(v_classes) " + "CommonSymbols.NIL != Types.listp(v_classes) " + v_classes;
        SubLObject specific = v_classes.first();
        SubLObject cdolist_list_var = v_classes.rest();
        SubLObject v_class = NIL;
        v_class = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != classes.superclassp(specific, v_class)) {
                specific = v_class;
            } else
                if (NIL == classes.superclassp(v_class, specific)) {
                    return NIL;
                }

            cdolist_list_var = cdolist_list_var.rest();
            v_class = cdolist_list_var.first();
        } 
        return specific;
    }

    public static SubLObject vector_of_pos_tags() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject result = make_vector($int$45, UNPROVIDED);
        SubLObject i = ZERO_INTEGER;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text($str1103$data_pos_tagging_index_to_state_t, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str1105$Unable_to_open__S, $str1103$data_pos_tagging_index_to_state_t);
            }
            final SubLObject infile = stream;
            if (infile.isStream()) {
                SubLObject line;
                for (line = NIL, line = file_utilities.cdolines_get_next_line(infile); NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                    set_aref(result, i, make_keyword(second(string_utilities.split_string(line, $list1106))));
                    i = add(i, ONE_INTEGER);
                }
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return result;
    }

    public static SubLObject initialize_pos_tags() {
        $pos_tags$.setGlobalValue(vector_of_pos_tags());
        return T;
    }

    public static SubLObject strengthen_pos_class(final SubLObject word, final SubLObject pos_class, final SubLObject penn_pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(word) : "Types.stringp(word) " + "CommonSymbols.NIL != Types.stringp(word) " + word;
        assert NIL != symbolp(pos_class) : "Types.symbolp(pos_class) " + "CommonSymbols.NIL != Types.symbolp(pos_class) " + pos_class;
        if ((NIL != classes.superclassp(VERB_LINK_WORD, pos_class)) && (NIL != member(word, parser.$aux_word_strings$.getDynamicValue(thread), EQUAL, UNPROVIDED))) {
            return values(AUX_VERB_LINK_WORD, $AUX);
        }
        thread.resetMultipleValues();
        final SubLObject v_class = statistical_pos_tag(word, pos_class);
        final SubLObject pos_tag = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != pos_tag) {
            return values(v_class, pos_tag);
        }
        final SubLObject derived_poss = class_to_penn_poss(pos_class);
        return values(pos_class, NIL != member(penn_pos, derived_poss, UNPROVIDED, UNPROVIDED) ? penn_pos : derived_poss.first());
    }

    public static SubLObject statistical_pos_tag(final SubLObject word, final SubLObject pos_class) {
        SubLObject alist_of_tags = copy_alist(file_hash_table.get_file_hash_table(word, $word_pos_probabilities$.getGlobalValue(), UNPROVIDED));
        SubLObject cdolist_list_var;
        alist_of_tags = cdolist_list_var = list_utilities.sort_alist_by_values(alist_of_tags, symbol_function($sym1110$_));
        SubLObject tag_value_pair = NIL;
        tag_value_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pos_tag = aref($pos_tags$.getGlobalValue(), tag_value_pair.first());
            SubLObject cdolist_list_var_$43 = penn_pos_to_classes(pos_tag);
            SubLObject v_class = NIL;
            v_class = cdolist_list_var_$43.first();
            while (NIL != cdolist_list_var_$43) {
                if (NIL != classes.superclassp(pos_class, v_class)) {
                    return values(v_class, pos_tag);
                }
                if (NIL != classes.subclassp(pos_class, v_class)) {
                    final SubLObject pos_tags = class_to_penn_poss(pos_class);
                    if (length(pos_tags).numE(ONE_INTEGER)) {
                        return values(pos_class, pos_tags.first());
                    }
                    return values(pos_class, pos_tag);
                } else {
                    cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                    v_class = cdolist_list_var_$43.first();
                }
            } 
            cdolist_list_var = cdolist_list_var.rest();
            tag_value_pair = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject auxify_sentence(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != member(document.word_category(word), abstract_lexicon.$verbal_tags$.getGlobalValue(), EQL, UNPROVIDED)) && (NIL != member(document.word_string(word), parser.$aux_word_strings$.getDynamicValue(thread), EQUAL, UNPROVIDED))) {
                document.word_update(word, $list1111);
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return sentence;
    }

    public static SubLObject search_atmost_n_link_words(final SubLObject v_linkage, final SubLObject word, final SubLObject n) {
        assert NIL != stringp(word) : "Types.stringp(word) " + "CommonSymbols.NIL != Types.stringp(word) " + word;
        SubLObject link_words = NIL;
        SubLObject i;
        SubLObject link_word;
        SubLObject item_var;
        for (i = NIL, i = ONE_INTEGER; !i.numG(n); i = add(i, ONE_INTEGER)) {
            link_word = methods.funcall_instance_method_with_2_args(v_linkage, SEARCH, word, i);
            if (NIL != link_word) {
                item_var = link_word;
                if (NIL == member(item_var, link_words, symbol_function(EQL), symbol_function(IDENTITY))) {
                    link_words = cons(item_var, link_words);
                }
            } else {
                i = n;
            }
        }
        return link_words;
    }

    public static SubLObject link_phrase_phrases_headed_by_string(final SubLObject head_string, final SubLObject link_phrase, SubLObject case_sensitiveP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        assert NIL != stringp(head_string) : "Types.stringp(head_string) " + "CommonSymbols.NIL != Types.stringp(head_string) " + head_string;
        assert NIL != link_phrase_p(link_phrase) : "linkage.link_phrase_p(link_phrase) " + "CommonSymbols.NIL != linkage.link_phrase_p(link_phrase) " + link_phrase;
        SubLObject strings = NIL;
        final SubLObject test = (NIL != case_sensitiveP) ? symbol_function(EQUAL) : symbol_function(EQUALP);
        final SubLObject head_string_length = length(head_string);
        SubLObject subtree = NIL;
        final SubLObject stack = stacks.create_stack();
        stacks.stack_push(link_phrase, stack);
        while (NIL == stacks.stack_empty_p(stack)) {
            subtree = stacks.stack_pop(stack);
            if (NIL != link_phrase_p(subtree)) {
                final SubLObject vector_var = instances.get_slot(subtree, DAUGHTERS);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject daughter;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    daughter = aref(vector_var, element_num);
                    stacks.stack_push(daughter, stack);
                }
            }
            if (NIL != link_phrase_p(subtree)) {
                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(subtree, GET_HEADS);
                SubLObject head = NIL;
                head = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject phrase_string = methods.funcall_instance_method_with_0_args(subtree, GET_STRING);
                    final SubLObject phrase_head_string = methods.funcall_instance_method_with_0_args(head, GET_STRING);
                    if (((NIL != list_utilities.lengthG(phrase_string, head_string_length, UNPROVIDED)) && (NIL != string_utilities.subwordP(phrase_head_string, head_string, NIL, test))) && (NIL != string_utilities.subwordP(head_string, phrase_string, NIL, test))) {
                        final SubLObject item_var = phrase_string;
                        if (NIL == member(item_var, strings, test, symbol_function(IDENTITY))) {
                            strings = cons(item_var, strings);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    head = cdolist_list_var.first();
                } 
            }
        } 
        return strings;
    }

    public static SubLObject xml_to_linkage(final SubLObject xml) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sexpr = xml_parsing_utilities.xml_tokens_to_sexpr(xml_parsing_utilities.xml_string_tokenize(xml, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == Strings.stringE(xml_parsing_utilities.xml_sexpr_type(sexpr), $$$linkage, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str1113$_a_is_not_a_linkage_xml_string, sexpr);
        }
        final SubLObject v_linkage = object.new_class_instance(LINKAGE);
        final SubLObject links_sexpr = xml_parsing_utilities.xml_sexpr_daughter(sexpr, $$$links);
        final SubLObject tree_sexpr = xml_parsing_utilities.xml_sexpr_daughter(sexpr, $$$tree);
        final SubLObject tree = xml_sexpr_to_link_tree(tree_sexpr);
        final SubLObject words = link_tree_word_vector(tree);
        final SubLObject v_context = object.new_class_instance(PARSE_TREE_CONTEXT);
        SubLObject i = ZERO_INTEGER;
        SubLObject links = NIL;
        final SubLObject vector_var = words;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject word;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            word = aref(vector_var, element_num);
            instances.set_slot(word, LINKAGE, v_linkage);
            instances.set_slot(word, ABS_INDEX, i);
            instances.set_slot(word, REF, methods.funcall_instance_method_with_1_args(v_context, NEW_VARIABLE, methods.funcall_instance_method_with_0_args(word, GET_STRING)));
            instances.set_slot(word, CONTEXT, v_context);
            i = add(i, ONE_INTEGER);
        }
        links = xml_sexpr_to_links(links_sexpr, words);
        instances.set_slot(v_linkage, LINKS, links);
        instances.set_slot(v_linkage, WORDS, words);
        instances.set_slot(v_linkage, TREE, tree);
        process_linkage_modifiers(v_linkage);
        return v_linkage;
    }

    public static SubLObject link_tree_word_vector(final SubLObject tree) {
        final SubLObject left_wall = object.new_class_instance(LEFT_WALL_LINK_WORD);
        final SubLObject right_wall = object.new_class_instance(RIGHT_WALL_LINK_WORD);
        final SubLObject words = methods.funcall_instance_method_with_0_args(tree, YIELD);
        final SubLObject last = number_utilities.f_1_(length(words));
        instances.set_slot(left_wall, STRING, $str1116$LEFT_WALL);
        instances.set_slot(left_wall, INDEX, ZERO_INTEGER);
        instances.set_slot(right_wall, STRING, $str1117$RIGHT_WALL);
        instances.set_slot(right_wall, INDEX, last);
        return apply(VECTOR, cons(left_wall, append(words, list(right_wall))));
    }

    public static SubLObject xml_sexpr_to_links(final SubLObject sexpr, final SubLObject words) {
        SubLObject links = NIL;
        SubLObject cdolist_list_var = xml_parsing_utilities.xml_sexpr_daughters(sexpr, UNPROVIDED);
        SubLObject link_sexpr = NIL;
        link_sexpr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            links = cons(xml_sexpr_link_to_link(link_sexpr, words), links);
            cdolist_list_var = cdolist_list_var.rest();
            link_sexpr = cdolist_list_var.first();
        } 
        return apply(VECTOR, nreverse(links));
    }

    public static SubLObject xml_sexpr_link_to_link(final SubLObject sexpr, final SubLObject words) {
        final SubLObject name = xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, $$$name);
        final SubLObject left_word_index = parse_integer(xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, $$$left), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject right_word_index = parse_integer(xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, $$$right), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject left_word = aref(words, left_word_index);
        final SubLObject right_word = aref(words, right_word_index);
        final SubLObject link = new_link(name);
        _csetf_link_left_word(link, left_word);
        _csetf_link_right_word(link, right_word);
        instances.set_slot(left_word, RIGHT_LINKS, cons(link, instances.get_slot(left_word, RIGHT_LINKS)));
        instances.set_slot(right_word, LEFT_LINKS, cons(link, instances.get_slot(right_word, LEFT_LINKS)));
        return link;
    }

    public static SubLObject xml_sexpr_to_link_tree(final SubLObject sexpr) {
        return xml_sexpr_tree_to_link_tree(xml_parsing_utilities.xml_sexpr_daughter(sexpr, $$$phrase));
    }

    public static SubLObject xml_sexpr_tree_to_link_tree(final SubLObject sexpr) {
        if (NIL != xml_sexpr_phrase_p(sexpr)) {
            return xml_sexpr_phrase_to_link_tree(sexpr);
        }
        if (NIL != xml_sexpr_word_p(sexpr)) {
            return xml_sexpr_word_to_link_tree(sexpr);
        }
        Errors.error($str1122$_a_is_not_a_valid_xml_sexpr_tree_);
        return NIL;
    }

    public static SubLObject xml_sexpr_phrase_to_link_tree(final SubLObject sexpr) {
        final SubLObject category = make_keyword(xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, $$$cat));
        final SubLObject v_class = category_to_link_tree_class(category);
        final SubLObject tree = object.new_class_instance(v_class);
        final SubLObject expr_daughters = xml_parsing_utilities.xml_sexpr_daughters(sexpr, UNPROVIDED);
        SubLObject daughters0 = NIL;
        SubLObject i = ZERO_INTEGER;
        instances.set_slot(tree, POS, category);
        SubLObject cdolist_list_var = expr_daughters;
        SubLObject daughter = NIL;
        daughter = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject d = xml_sexpr_tree_to_link_tree(daughter);
            instances.set_slot(d, INDEX, i);
            instances.set_slot(d, MOTHER, tree);
            daughters0 = cons(d, daughters0);
            i = add(i, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            daughter = cdolist_list_var.first();
        } 
        instances.set_slot(tree, DAUGHTERS, apply(VECTOR, nreverse(daughters0)));
        return tree;
    }

    public static SubLObject xml_sexpr_word_to_link_tree(final SubLObject sexpr) {
        final SubLObject pos = xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, $$$cat);
        final SubLObject string = xml_parsing_utilities.xml_sexpr_daughters(sexpr, UNPROVIDED).first();
        final SubLObject v_class = intern(xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, $$$class), $CYC);
        final SubLObject word = object.new_class_instance(v_class);
        instances.set_slot(word, STRING, string);
        instances.set_slot(word, POS, make_keyword(pos));
        return word;
    }

    public static SubLObject xml_sexpr_phrase_p(final SubLObject sexpr) {
        return Strings.stringE(xml_parsing_utilities.xml_sexpr_type(sexpr), $$$phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject xml_sexpr_word_p(final SubLObject sexpr) {
        return Strings.stringE(xml_parsing_utilities.xml_sexpr_type(sexpr), $$$word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject link_constituent_string_to_list(final SubLObject link_constituent_string) {
        assert NIL != stringp(link_constituent_string) : "Types.stringp(link_constituent_string) " + "CommonSymbols.NIL != Types.stringp(link_constituent_string) " + link_constituent_string;
        SubLObject const_new_string = string_utilities.$empty_string$.getGlobalValue();
        SubLObject cdolist_list_var = string_utilities.split_string(link_constituent_string, $list1131);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!v_term.equalp(string_utilities.$empty_string$.getGlobalValue())) {
                if (NIL != search($str425$_, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    v_term = string_utilities.replace_substring(v_term, $str425$_, $str1127$__);
                } else
                    if (NIL != search($str268$_, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        SubLObject cdolist_list_var_$44 = string_utilities.split_string(v_term, $list1130);
                        SubLObject word = NIL;
                        word = cdolist_list_var_$44.first();
                        while (NIL != cdolist_list_var_$44) {
                            if (!word.equalp(string_utilities.$empty_string$.getGlobalValue())) {
                                v_term = string_utilities.replace_substring(v_term, word, cconcatenate($str1128$__W__, new SubLObject[]{ format_nil.format_nil_a_no_copy(word), $str1129$__ }));
                            }
                            cdolist_list_var_$44 = cdolist_list_var_$44.rest();
                            word = cdolist_list_var_$44.first();
                        } 
                    } else {
                        v_term = cconcatenate($str1128$__W__, new SubLObject[]{ format_nil.format_nil_a_no_copy(v_term), $str1129$__ });
                    }

                const_new_string = cconcatenate(format_nil.format_nil_a_no_copy(const_new_string), new SubLObject[]{ $$$_, format_nil.format_nil_a_no_copy(v_term) });
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return read_from_string(const_new_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject parse_link_sentences(final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = NIL;
        SubLObject sentence_count = ZERO_INTEGER;
        SubLObject error_count = ZERO_INTEGER;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str1105$Unable_to_open__S, file);
            }
            final SubLObject infile = stream;
            if (infile.isStream()) {
                SubLObject sent;
                SubLObject _prev_bind_2;
                SubLObject v_linkage;
                SubLObject error_$45;
                SubLObject _prev_bind_0_$46;
                for (sent = NIL, sent = file_utilities.cdolines_get_next_line(infile); NIL != sent; sent = file_utilities.cdolines_get_next_line(infile)) {
                    error = NIL;
                    if (NIL == string_utilities.starts_with(sent, $str270$_)) {
                        sentence_count = add(sentence_count, ONE_INTEGER);
                        try {
                            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                            _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    princ(sent, UNPROVIDED);
                                    terpri(UNPROVIDED);
                                    v_linkage = NIL;
                                    error_$45 = NIL;
                                    try {
                                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                        _prev_bind_0_$46 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                v_linkage = new_linkage(sent, list($LEXICON, object.new_class_instance(CYCLIFIER_LEXICON)));
                                            } catch (final Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$46, thread);
                                        }
                                    } catch (final Throwable ccatch_env_var) {
                                        error_$45 = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                    } finally {
                                        thread.throwStack.pop();
                                    }
                                    if (NIL != error_$45) {
                                        parser.ensure_link_server_running();
                                        v_linkage = new_linkage(sent, list($LEXICON, object.new_class_instance(CYCLIFIER_LEXICON)));
                                    }
                                    print(v_linkage, UNPROVIDED);
                                } catch (final Throwable catch_var2) {
                                    Errors.handleThrowable(catch_var2, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_2, thread);
                            }
                        } catch (final Throwable ccatch_env_var2) {
                            error = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                        } finally {
                            thread.throwStack.pop();
                        }
                        if (NIL != error) {
                            error_count = add(error_count, ONE_INTEGER);
                            Errors.warn(error);
                            terpri(UNPROVIDED);
                        }
                    }
                }
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return values(sentence_count, error_count);
    }

    public static SubLObject test_linkage_with_retokenization(final SubLObject nl_sentence) {
        return new_linkage(nl_sentence, list($LEXICON, object.new_class_instance(CYCLIFIER_LEXICON)));
    }

    public static SubLObject some_linkage_results(final SubLObject result_linkage, final SubLObject linkageP) {
        return equal(linkageP, list_utilities.sublisp_boolean(result_linkage));
    }

    public static SubLObject links_have_namesP(final SubLObject sentence) {
        final SubLObject v_linkage = new_linkage(sentence, list($LEXICON, object.new_class_instance(CYCLIFIER_LEXICON)));
        SubLObject link = NIL;
        final SubLObject vector_var = instances.get_slot(v_linkage, LINKS);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject l;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            l = aref(vector_var, element_num);
            if (NIL != l) {
                link = l;
                if (NIL != Strings.stringE(link_name(link), string_utilities.$empty_string$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return NIL;
                }
            }
        }
        return T;
    }

    public static SubLObject declare_linkage_file() {
        declareFunction(me, "link_pos_p", "LINK-POS-P", 1, 0, false);
        declareFunction(me, "link_parser_annotational_suffixes", "LINK-PARSER-ANNOTATIONAL-SUFFIXES", 0, 0, false);
        declareFunction(me, "link_ping", "LINK-PING", 0, 3, false);
        declareFunction(me, "link_parse", "LINK-PARSE", 1, 3, false);
        declareFunction(me, "link_lex", "LINK-LEX", 1, 1, false);
        declareFunction(me, "link_execute", "LINK-EXECUTE", 1, 2, false);
        declareFunction(me, "clear_link_execute_int", "CLEAR-LINK-EXECUTE-INT", 0, 0, false);
        declareFunction(me, "remove_link_execute_int", "REMOVE-LINK-EXECUTE-INT", 1, 2, false);
        declareFunction(me, "link_execute_int_internal", "LINK-EXECUTE-INT-INTERNAL", 3, 0, false);
        declareFunction(me, "link_execute_int", "LINK-EXECUTE-INT", 1, 2, false);
        declareFunction(me, "link_structure_spec_p", "LINK-STRUCTURE-SPEC-P", 1, 0, false);
        declareFunction(me, "copy_link_structure_spec", "COPY-LINK-STRUCTURE-SPEC", 1, 0, false);
        declareFunction(me, "clear_link_execute_cached", "CLEAR-LINK-EXECUTE-CACHED", 0, 0, false);
        declareFunction(me, "remove_link_execute_cached", "REMOVE-LINK-EXECUTE-CACHED", 3, 0, false);
        declareFunction(me, "link_execute_cached_internal", "LINK-EXECUTE-CACHED-INTERNAL", 3, 0, false);
        declareFunction(me, "link_execute_cached", "LINK-EXECUTE-CACHED", 3, 0, false);
        declareFunction(me, "write_link_parameters", "WRITE-LINK-PARAMETERS", 2, 0, false);
        declareFunction(me, "interpret_link_response", "INTERPRET-LINK-RESPONSE", 1, 3, false);
        declareFunction(me, "new_link_structures", "NEW-LINK-STRUCTURES", 1, 3, false);
        declareFunction(me, "clean_up_link_word_strings", "CLEAN-UP-LINK-WORD-STRINGS", 1, 0, false);
        declareFunction(me, "post_process_link_words", "POST-PROCESS-LINK-WORDS", 2, 0, false);
        declareFunction(me, "restore_link_words_capitalization", "RESTORE-LINK-WORDS-CAPITALIZATION", 2, 0, false);
        declareFunction(me, "try_to_restore_link_word_capitalization", "TRY-TO-RESTORE-LINK-WORD-CAPITALIZATION", 3, 0, false);
        declareFunction(me, "link_word_unannotated_length", "LINK-WORD-UNANNOTATED-LENGTH", 1, 0, false);
        declareFunction(me, "link_word_strip_annotational_suffixes", "LINK-WORD-STRIP-ANNOTATIONAL-SUFFIXES", 1, 0, false);
        declareFunction(me, "link_words_sometimes_downcased_after_word_p", "LINK-WORDS-SOMETIMES-DOWNCASED-AFTER-WORD-P", 1, 0, false);
        declareFunction(me, "null_link_token_string_p", "NULL-LINK-TOKEN-STRING-P", 1, 0, false);
        declareFunction(me, "new_link_structure", "NEW-LINK-STRUCTURE", 2, 2, false);
        declareFunction(me, "update_links", "UPDATE-LINKS", 4, 0, false);
        declareFunction(me, "token_using_lexicon_prefixes", "TOKEN-USING-LEXICON-PREFIXES", 2, 0, false);
        declareFunction(me, "link_subtokenP", "LINK-SUBTOKEN?", 2, 0, false);
        declareFunction(me, "link_attached_symbolP", "LINK-ATTACHED-SYMBOL?", 1, 0, false);
        declareFunction(me, "new_id_links", "NEW-ID-LINKS", 3, 0, false);
        declareFunction(me, "ls_words", "LS-WORDS", 1, 0, false);
        declareFunction(me, "ls_links", "LS-LINKS", 1, 0, false);
        declareFunction(me, "ls_diagram", "LS-DIAGRAM", 1, 0, false);
        declareFunction(me, "ls_tree", "LS-TREE", 1, 0, false);
        declareFunction(me, "ls_number_of_words", "LS-NUMBER-OF-WORDS", 1, 0, false);
        declareFunction(me, "ls_number_of_links", "LS-NUMBER-OF-LINKS", 1, 0, false);
        declareFunction(me, "ls_link", "LS-LINK", 2, 0, false);
        declareFunction(me, "ls_name_of_link", "LS-NAME-OF-LINK", 2, 0, false);
        declareFunction(me, "ls_lword_index_of_link", "LS-LWORD-INDEX-OF-LINK", 2, 0, false);
        declareFunction(me, "ls_rword_index_of_link", "LS-RWORD-INDEX-OF-LINK", 2, 0, false);
        declareFunction(me, "ls_word_of_linkage", "LS-WORD-OF-LINKAGE", 2, 0, false);
        declareFunction(me, "reinitialize_linkage", "REINITIALIZE-LINKAGE", 0, 0, false);
        declareFunction(me, "initialize_linkage", "INITIALIZE-LINKAGE", 0, 0, false);
        declareFunction(me, "finalize_linkage", "FINALIZE-LINKAGE", 0, 0, false);
        declareFunction(me, "ensure_linkage_initialized", "ENSURE-LINKAGE-INITIALIZED", 0, 0, false);
        declareFunction(me, "link_tree_patterns_initializedP", "LINK-TREE-PATTERNS-INITIALIZED?", 0, 0, false);
        declareFunction(me, "initialize_link_regex_patterns", "INITIALIZE-LINK-REGEX-PATTERNS", 0, 0, false);
        declareFunction(me, "finalize_link_regex_patterns", "FINALIZE-LINK-REGEX-PATTERNS", 0, 0, false);
        declareFunction(me, "link_regex_patterns_initializedP", "LINK-REGEX-PATTERNS-INITIALIZED?", 0, 0, false);
        declareFunction(me, "initialize_pos_evidence_tables", "INITIALIZE-POS-EVIDENCE-TABLES", 0, 0, false);
        declareFunction(me, "finalize_pos_evidence_tables", "FINALIZE-POS-EVIDENCE-TABLES", 0, 0, false);
        declareFunction(me, "pos_evidence_tables_initializedP", "POS-EVIDENCE-TABLES-INITIALIZED?", 0, 0, false);
        declareFunction(me, "alist_to_hashtable", "ALIST-TO-HASHTABLE", 1, 1, false);
        declareFunction(me, "alist_to_hashtable_reverse", "ALIST-TO-HASHTABLE-REVERSE", 1, 1, false);
        declareFunction(me, "link_print_function_trampoline", "LINK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "link_p", "LINK-P", 1, 0, false);
        new linkage.$link_p$UnaryFunction();
        declareFunction(me, "link_name", "LINK-NAME", 1, 0, false);
        declareFunction(me, "link_left_word", "LINK-LEFT-WORD", 1, 0, false);
        declareFunction(me, "link_right_word", "LINK-RIGHT-WORD", 1, 0, false);
        declareFunction(me, "_csetf_link_name", "_CSETF-LINK-NAME", 2, 0, false);
        declareFunction(me, "_csetf_link_left_word", "_CSETF-LINK-LEFT-WORD", 2, 0, false);
        declareFunction(me, "_csetf_link_right_word", "_CSETF-LINK-RIGHT-WORD", 2, 0, false);
        declareFunction(me, "make_link", "MAKE-LINK", 0, 1, false);
        declareFunction(me, "visit_defstruct_link", "VISIT-DEFSTRUCT-LINK", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_link_method", "VISIT-DEFSTRUCT-OBJECT-LINK-METHOD", 2, 0, false);
        declareFunction(me, "print_linkage_link", "PRINT-LINKAGE-LINK", 3, 0, false);
        declareFunction(me, "new_link", "NEW-LINK", 1, 0, false);
        declareFunction(me, "link_contains_wall_link_wordP", "LINK-CONTAINS-WALL-LINK-WORD?", 1, 0, false);
        declareFunction(me, "link_contains_wall_word_linkage_wordP", "LINK-CONTAINS-WALL-WORD-LINKAGE-WORD?", 1, 0, false);
        declareFunction(me, "get_link_tree_modifiers", "GET-LINK-TREE-MODIFIERS", 1, 0, false);
        declareFunction(me, "set_link_tree_modifiers", "SET-LINK-TREE-MODIFIERS", 2, 0, false);
        declareFunction(me, "get_link_tree_index", "GET-LINK-TREE-INDEX", 1, 0, false);
        declareFunction(me, "set_link_tree_index", "SET-LINK-TREE-INDEX", 2, 0, false);
        declareFunction(me, "get_link_tree_mother", "GET-LINK-TREE-MOTHER", 1, 0, false);
        declareFunction(me, "set_link_tree_mother", "SET-LINK-TREE-MOTHER", 2, 0, false);
        declareFunction(me, "get_link_tree_heads", "GET-LINK-TREE-HEADS", 1, 0, false);
        declareFunction(me, "set_link_tree_heads", "SET-LINK-TREE-HEADS", 2, 0, false);
        declareFunction(me, "get_link_tree_pos", "GET-LINK-TREE-POS", 1, 0, false);
        declareFunction(me, "set_link_tree_pos", "SET-LINK-TREE-POS", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_link_tree_class", "SUBLOOP-RESERVED-INITIALIZE-LINK-TREE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_link_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-LINK-TREE-INSTANCE", 1, 0, false);
        declareFunction(me, "link_tree_p", "LINK-TREE-P", 1, 0, false);
        declareFunction(me, "link_tree_get_modifiers_method", "LINK-TREE-GET-MODIFIERS-METHOD", 1, 0, false);
        declareFunction(me, "link_tree_get_modifieds_method", "LINK-TREE-GET-MODIFIEDS-METHOD", 1, 0, false);
        declareFunction(me, "link_tree_print_method", "LINK-TREE-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "link_tree_xml_method", "LINK-TREE-XML-METHOD", 3, 0, false);
        declareFunction(me, "link_tree_get_category_method", "LINK-TREE-GET-CATEGORY-METHOD", 1, 0, false);
        declareFunction(me, "link_tree_get_root_method", "LINK-TREE-GET-ROOT-METHOD", 1, 0, false);
        declareFunction(me, "link_tree_root_p_method", "LINK-TREE-ROOT-P-METHOD", 1, 0, false);
        declareFunction(me, "link_tree_get_mother_method", "LINK-TREE-GET-MOTHER-METHOD", 1, 0, false);
        declareFunction(me, "link_tree_get_refs_method", "LINK-TREE-GET-REFS-METHOD", 1, 0, false);
        declareFunction(me, "link_tree_get_index_method", "LINK-TREE-GET-INDEX-METHOD", 1, 0, false);
        declareFunction(me, "link_tree_get_sister_method", "LINK-TREE-GET-SISTER-METHOD", 2, 0, false);
        declareFunction(me, "link_tree_yield_method", "LINK-TREE-YIELD-METHOD", 1, 0, false);
        declareFunction(me, "link_tree_get_ancestors_method", "LINK-TREE-GET-ANCESTORS-METHOD", 1, 0, false);
        declareFunction(me, "link_tree_depth_method", "LINK-TREE-DEPTH-METHOD", 1, 0, false);
        declareFunction(me, "get_link_phrase_daughters", "GET-LINK-PHRASE-DAUGHTERS", 1, 0, false);
        declareFunction(me, "set_link_phrase_daughters", "SET-LINK-PHRASE-DAUGHTERS", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_link_phrase_class", "SUBLOOP-RESERVED-INITIALIZE-LINK-PHRASE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_link_phrase_instance", "SUBLOOP-RESERVED-INITIALIZE-LINK-PHRASE-INSTANCE", 1, 0, false);
        declareFunction(me, "link_phrase_p", "LINK-PHRASE-P", 1, 0, false);
        declareMacro(me, "do_link_tree_subtrees", "DO-LINK-TREE-SUBTREES");
        declareFunction(me, "link_phrase_get_conjunction_method", "LINK-PHRASE-GET-CONJUNCTION-METHOD", 1, 0, false);
        declareFunction(me, "link_phrase_get_string_method", "LINK-PHRASE-GET-STRING-METHOD", 1, 0, false);
        declareFunction(me, "link_phrase_daughter_count_method", "LINK-PHRASE-DAUGHTER-COUNT-METHOD", 1, 0, false);
        declareFunction(me, "link_phrase_get_daughter_method", "LINK-PHRASE-GET-DAUGHTER-METHOD", 2, 0, false);
        declareFunction(me, "link_phrase_get_head_daughters_method", "LINK-PHRASE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false);
        declareFunction(me, "link_phrase_get_head_daughter_method", "LINK-PHRASE-GET-HEAD-DAUGHTER-METHOD", 1, 0, false);
        declareFunction(me, "link_phrase_get_semantic_head_daughters_method", "LINK-PHRASE-GET-SEMANTIC-HEAD-DAUGHTERS-METHOD", 1, 0, false);
        declareFunction(me, "link_phrase_cyclify_int_method", "LINK-PHRASE-CYCLIFY-INT-METHOD", 1, 0, false);
        declareFunction(me, "link_phrase_yield_method", "LINK-PHRASE-YIELD-METHOD", 1, 0, false);
        declareFunction(me, "link_phrase_get_heads_method", "LINK-PHRASE-GET-HEADS-METHOD", 1, 0, false);
        declareFunction(me, "link_phrase_get_head_method", "LINK-PHRASE-GET-HEAD-METHOD", 1, 0, false);
        declareFunction(me, "link_phrase_get_semantic_heads_method", "LINK-PHRASE-GET-SEMANTIC-HEADS-METHOD", 1, 0, false);
        declareFunction(me, "link_phrase_preterminal_p_method", "LINK-PHRASE-PRETERMINAL-P-METHOD", 1, 0, false);
        declareFunction(me, "link_phrase_idiom_p_method", "LINK-PHRASE-IDIOM-P-METHOD", 1, 0, false);
        declareFunction(me, "link_phrase_coordinate_phrase_p_method", "LINK-PHRASE-COORDINATE-PHRASE-P-METHOD", 1, 0, false);
        declareFunction(me, "link_phrase_get_linkage_method", "LINK-PHRASE-GET-LINKAGE-METHOD", 1, 0, false);
        declareFunction(me, "link_phrase_find_method", "LINK-PHRASE-FIND-METHOD", 2, 2, false);
        declareFunction(me, "link_phrase_find_first_method", "LINK-PHRASE-FIND-FIRST-METHOD", 2, 1, false);
        declareFunction(me, "link_phrase_find_last_method", "LINK-PHRASE-FIND-LAST-METHOD", 2, 1, false);
        declareFunction(me, "pprint_link_phrase", "PPRINT-LINK-PHRASE", 3, 0, false);
        declareFunction(me, "pprint_link_word", "PPRINT-LINK-WORD", 3, 0, false);
        declareFunction(me, "pprint_link_tree", "PPRINT-LINK-TREE", 3, 0, false);
        declareFunction(me, "link_tree_xml", "LINK-TREE-XML", 3, 0, false);
        declareFunction(me, "link_word_xml", "LINK-WORD-XML", 3, 0, false);
        declareFunction(me, "link_xml", "LINK-XML", 3, 0, false);
        declareFunction(me, "link_phrase_xml", "LINK-PHRASE-XML", 3, 0, false);
        declareFunction(me, "link_phrase_expression_p", "LINK-PHRASE-EXPRESSION-P", 1, 0, false);
        declareFunction(me, "link_word_expression_p", "LINK-WORD-EXPRESSION-P", 1, 0, false);
        declareFunction(me, "link_phrase_expression_category", "LINK-PHRASE-EXPRESSION-CATEGORY", 1, 0, false);
        declareFunction(me, "link_phrase_expression_daughters", "LINK-PHRASE-EXPRESSION-DAUGHTERS", 1, 0, false);
        declareFunction(me, "new_counter", "NEW-COUNTER", 0, 1, false);
        declareFunction(me, "inc_counter", "INC-COUNTER", 1, 1, false);
        declareFunction(me, "counter_value", "COUNTER-VALUE", 1, 0, false);
        declareFunction(me, "retokenize_link_tree", "RETOKENIZE-LINK-TREE", 2, 0, false);
        declareFunction(me, "retokenize_link_phrase", "RETOKENIZE-LINK-PHRASE", 2, 0, false);
        declareFunction(me, "vp_verb_in_idiomP", "VP-VERB-IN-IDIOM?", 1, 0, false);
        declareFunction(me, "retokenize_preterminal", "RETOKENIZE-PRETERMINAL", 2, 0, false);
        declareFunction(me, "next_subtoken", "NEXT-SUBTOKEN", 2, 0, false);
        declareFunction(me, "retokenize_idiom", "RETOKENIZE-IDIOM", 2, 0, false);
        declareFunction(me, "retokenize_vp_with_verb_idiom", "RETOKENIZE-VP-WITH-VERB-IDIOM", 2, 0, false);
        declareFunction(me, "merge_subtokens", "MERGE-SUBTOKENS", 2, 0, false);
        declareFunction(me, "concatenate_word_strings", "CONCATENATE-WORD-STRINGS", 1, 0, false);
        declareFunction(me, "get_mw_lexeme_tag", "GET-MW-LEXEME-TAG", 1, 0, false);
        declareFunction(me, "link_left_word_equal", "LINK-LEFT-WORD-EQUAL", 2, 0, false);
        declareFunction(me, "link_right_word_equal", "LINK-RIGHT-WORD-EQUAL", 2, 0, false);
        declareFunction(me, "get_mw_lexeme_left_links", "GET-MW-LEXEME-LEFT-LINKS", 1, 0, false);
        declareFunction(me, "get_mw_lexeme_right_links", "GET-MW-LEXEME-RIGHT-LINKS", 1, 0, false);
        declareFunction(me, "get_right_links_ending", "GET-RIGHT-LINKS-ENDING", 2, 0, false);
        declareFunction(me, "get_left_links_ending", "GET-LEFT-LINKS-ENDING", 2, 0, false);
        declareFunction(me, "new_link_tree", "NEW-LINK-TREE", 2, 0, false);
        declareFunction(me, "new_link_tree_int", "NEW-LINK-TREE-INT", 4, 0, false);
        declareFunction(me, "link_phrase_expression_to_tree", "LINK-PHRASE-EXPRESSION-TO-TREE", 4, 0, false);
        declareFunction(me, "link_word_expression_to_tree", "LINK-WORD-EXPRESSION-TO-TREE", 4, 0, false);
        declareFunction(me, "category_to_link_tree_class", "CATEGORY-TO-LINK-TREE-CLASS", 1, 0, false);
        declareFunction(me, "get_nearest_common_ancestor", "GET-NEAREST-COMMON-ANCESTOR", 1, 0, false);
        declareFunction(me, "get_common_ancestors", "GET-COMMON-ANCESTORS", 1, 0, false);
        declareFunction(me, "get_link_phrase", "GET-LINK-PHRASE", 1, 0, false);
        declareFunction(me, "get_link_phrases", "GET-LINK-PHRASES", 1, 0, false);
        declareFunction(me, "verbal_link_tree_p", "VERBAL-LINK-TREE-P", 1, 0, false);
        declareFunction(me, "verbal_link_phrase_cyclify_int_vp_coordination_method", "VERBAL-LINK-PHRASE-CYCLIFY-INT-VP-COORDINATION-METHOD", 1, 0, false);
        declareFunction(me, "verbal_link_phrase_cyclify_int_vp_method", "VERBAL-LINK-PHRASE-CYCLIFY-INT-VP-METHOD", 1, 0, false);
        declareFunction(me, "verbal_link_phrase_cyclify_int_method", "VERBAL-LINK-PHRASE-CYCLIFY-INT-METHOD", 1, 0, false);
        declareFunction(me, "verbal_link_phrase_vp_coordinate_phrase_p_method", "VERBAL-LINK-PHRASE-VP-COORDINATE-PHRASE-P-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_verbal_link_phrase_class", "SUBLOOP-RESERVED-INITIALIZE-VERBAL-LINK-PHRASE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_verbal_link_phrase_instance", "SUBLOOP-RESERVED-INITIALIZE-VERBAL-LINK-PHRASE-INSTANCE", 1, 0, false);
        declareFunction(me, "verbal_link_phrase_p", "VERBAL-LINK-PHRASE-P", 1, 0, false);
        declareFunction(me, "verbal_link_phrase_get_subject_method", "VERBAL-LINK-PHRASE-GET-SUBJECT-METHOD", 1, 0, false);
        declareFunction(me, "verbal_link_phrase_get_semantic_subject_method", "VERBAL-LINK-PHRASE-GET-SEMANTIC-SUBJECT-METHOD", 1, 0, false);
        declareFunction(me, "verbal_link_phrase_get_verbal_complement_method", "VERBAL-LINK-PHRASE-GET-VERBAL-COMPLEMENT-METHOD", 1, 0, false);
        declareFunction(me, "verbal_link_phrase_get_head_daughters_method", "VERBAL-LINK-PHRASE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sentential_link_phrase_class", "SUBLOOP-RESERVED-INITIALIZE-SENTENTIAL-LINK-PHRASE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sentential_link_phrase_instance", "SUBLOOP-RESERVED-INITIALIZE-SENTENTIAL-LINK-PHRASE-INSTANCE", 1, 0, false);
        declareFunction(me, "sentential_link_phrase_p", "SENTENTIAL-LINK-PHRASE-P", 1, 0, false);
        declareFunction(me, "prepositional_link_tree_p", "PREPOSITIONAL-LINK-TREE-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_prepositional_link_phrase_class", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-LINK-PHRASE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_prepositional_link_phrase_instance", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-LINK-PHRASE-INSTANCE", 1, 0, false);
        declareFunction(me, "prepositional_link_phrase_p", "PREPOSITIONAL-LINK-PHRASE-P", 1, 0, false);
        declareFunction(me, "prepositional_link_phrase_get_head_daughters_method", "PREPOSITIONAL-LINK-PHRASE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false);
        declareFunction(me, "prepositional_link_phrase_get_oblique_object_method", "PREPOSITIONAL-LINK-PHRASE-GET-OBLIQUE-OBJECT-METHOD", 1, 0, false);
        declareFunction(me, "nominal_link_tree_p", "NOMINAL-LINK-TREE-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_nominal_link_phrase_class", "SUBLOOP-RESERVED-INITIALIZE-NOMINAL-LINK-PHRASE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_nominal_link_phrase_instance", "SUBLOOP-RESERVED-INITIALIZE-NOMINAL-LINK-PHRASE-INSTANCE", 1, 0, false);
        declareFunction(me, "nominal_link_phrase_p", "NOMINAL-LINK-PHRASE-P", 1, 0, false);
        declareFunction(me, "nominal_link_phrase_get_head_daughters_method", "NOMINAL-LINK-PHRASE-GET-HEAD-DAUGHTERS-METHOD", 1, 0, false);
        declareFunction(me, "get_link_word_context", "GET-LINK-WORD-CONTEXT", 1, 0, false);
        declareFunction(me, "set_link_word_context", "SET-LINK-WORD-CONTEXT", 2, 0, false);
        declareFunction(me, "get_link_word_lexes", "GET-LINK-WORD-LEXES", 1, 0, false);
        declareFunction(me, "set_link_word_lexes", "SET-LINK-WORD-LEXES", 2, 0, false);
        declareFunction(me, "get_link_word_right_links", "GET-LINK-WORD-RIGHT-LINKS", 1, 0, false);
        declareFunction(me, "set_link_word_right_links", "SET-LINK-WORD-RIGHT-LINKS", 2, 0, false);
        declareFunction(me, "get_link_word_left_links", "GET-LINK-WORD-LEFT-LINKS", 1, 0, false);
        declareFunction(me, "set_link_word_left_links", "SET-LINK-WORD-LEFT-LINKS", 2, 0, false);
        declareFunction(me, "get_link_word_abs_index", "GET-LINK-WORD-ABS-INDEX", 1, 0, false);
        declareFunction(me, "set_link_word_abs_index", "SET-LINK-WORD-ABS-INDEX", 2, 0, false);
        declareFunction(me, "get_link_word_ref", "GET-LINK-WORD-REF", 1, 0, false);
        declareFunction(me, "set_link_word_ref", "SET-LINK-WORD-REF", 2, 0, false);
        declareFunction(me, "get_link_word_string", "GET-LINK-WORD-STRING", 1, 0, false);
        declareFunction(me, "set_link_word_string", "SET-LINK-WORD-STRING", 2, 0, false);
        declareFunction(me, "get_link_word_linkage", "GET-LINK-WORD-LINKAGE", 1, 0, false);
        declareFunction(me, "set_link_word_linkage", "SET-LINK-WORD-LINKAGE", 2, 0, false);
        declareFunction(me, "link_word_get_keyword_renamings_method", "LINK-WORD-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
        declareFunction(me, "link_word_modified_dependent_meaning_p_method", "LINK-WORD-MODIFIED-DEPENDENT-MEANING-P-METHOD", 1, 0, false);
        declareFunction(me, "link_word_tree_keyword_eq_classes_method", "LINK-WORD-TREE-KEYWORD-EQ-CLASSES-METHOD", 1, 0, false);
        declareFunction(me, "link_word_frame_filter_lexes_method", "LINK-WORD-FRAME-FILTER-LEXES-METHOD", 1, 0, false);
        declareFunction(me, "link_word_pp_comp_filter_lexes_method", "LINK-WORD-PP-COMP-FILTER-LEXES-METHOD", 1, 0, false);
        declareFunction(me, "link_word_pos_filter_lexes_method", "LINK-WORD-POS-FILTER-LEXES-METHOD", 1, 0, false);
        declareFunction(me, "link_word_cyclify_nucleus_method", "LINK-WORD-CYCLIFY-NUCLEUS-METHOD", 1, 1, false);
        declareFunction(me, "link_word_cyclify_int_method", "LINK-WORD-CYCLIFY-INT-METHOD", 1, 0, false);
        declareFunction(me, "link_word_get_oblique_object_method", "LINK-WORD-GET-OBLIQUE-OBJECT-METHOD", 1, 0, false);
        declareFunction(me, "link_word_get_pp_complement_method", "LINK-WORD-GET-PP-COMPLEMENT-METHOD", 1, 0, false);
        declareFunction(me, "link_word_partition_semantic_complements_method", "LINK-WORD-PARTITION-SEMANTIC-COMPLEMENTS-METHOD", 1, 0, false);
        declareFunction(me, "link_word_get_semantic_complements_method", "LINK-WORD-GET-SEMANTIC-COMPLEMENTS-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "link_word_p", "LINK-WORD-P", 1, 0, false);
        declareFunction(me, "link_word_print_method", "LINK-WORD-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "clear_split_link_word", "CLEAR-SPLIT-LINK-WORD", 0, 0, false);
        declareFunction(me, "remove_split_link_word", "REMOVE-SPLIT-LINK-WORD", 1, 0, false);
        declareFunction(me, "split_link_word_internal", "SPLIT-LINK-WORD-INTERNAL", 1, 0, false);
        declareFunction(me, "split_link_word", "SPLIT-LINK-WORD", 1, 0, false);
        declareFunction(me, "pos_tagged_link_word_p", "POS-TAGGED-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "create_link_word", "CREATE-LINK-WORD", 8, 0, false);
        declareFunction(me, "new_link_word", "NEW-LINK-WORD", 7, 0, false);
        declareFunction(me, "link_word_get_string_method", "LINK-WORD-GET-STRING-METHOD", 1, 0, false);
        declareFunction(me, "link_word_get_pos_method", "LINK-WORD-GET-POS-METHOD", 1, 0, false);
        declareFunction(me, "link_word_get_abs_index_method", "LINK-WORD-GET-ABS-INDEX-METHOD", 1, 0, false);
        declareFunction(me, "link_word_get_refs_method", "LINK-WORD-GET-REFS-METHOD", 1, 0, false);
        declareFunction(me, "link_word_get_linkage_method", "LINK-WORD-GET-LINKAGE-METHOD", 1, 0, false);
        declareFunction(me, "link_word_get_context_method", "LINK-WORD-GET-CONTEXT-METHOD", 1, 0, false);
        declareFunction(me, "link_word_get_head_method", "LINK-WORD-GET-HEAD-METHOD", 1, 0, false);
        declareFunction(me, "link_word_get_heads_method", "LINK-WORD-GET-HEADS-METHOD", 1, 0, false);
        declareFunction(me, "link_word_get_semantic_heads_method", "LINK-WORD-GET-SEMANTIC-HEADS-METHOD", 1, 0, false);
        declareFunction(me, "link_word_get_complements_method", "LINK-WORD-GET-COMPLEMENTS-METHOD", 1, 0, false);
        declareFunction(me, "link_word_get_ranked_lexes_method", "LINK-WORD-GET-RANKED-LEXES-METHOD", 1, 0, false);
        declareFunction(me, "link_word_get_lexes_method", "LINK-WORD-GET-LEXES-METHOD", 1, 0, false);
        declareFunction(me, "link_word_get_pps_method", "LINK-WORD-GET-PPS-METHOD", 1, 0, false);
        declareFunction(me, "link_word_after", "LINK-WORD-AFTER", 2, 0, false);
        declareFunction(me, "link_word_lexify_method", "LINK-WORD-LEXIFY-METHOD", 2, 0, false);
        declareFunction(me, "link_word_get_left_links_method", "LINK-WORD-GET-LEFT-LINKS-METHOD", 1, 1, false);
        declareFunction(me, "link_word_get_right_links_method", "LINK-WORD-GET-RIGHT-LINKS-METHOD", 1, 1, false);
        declareFunction(me, "link_word_get_links_method", "LINK-WORD-GET-LINKS-METHOD", 1, 1, false);
        declareFunction(me, "link_word_get_directly_related_method", "LINK-WORD-GET-DIRECTLY-RELATED-METHOD", 2, 1, false);
        declareFunction(me, "link_word_get_related_method", "LINK-WORD-GET-RELATED-METHOD", 2, 0, false);
        declareFunction(me, "verb_link_word_get_keyword_renamings_method", "VERB-LINK-WORD-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
        declareFunction(me, "verb_link_word_partition_semantic_complements_method", "VERB-LINK-WORD-PARTITION-SEMANTIC-COMPLEMENTS-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_verb_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-VERB-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_verb_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-VERB-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "verb_link_word_p", "VERB-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "verb_link_word_get_subject_method", "VERB-LINK-WORD-GET-SUBJECT-METHOD", 1, 0, false);
        declareFunction(me, "verb_link_word_get_semantic_subject_method", "VERB-LINK-WORD-GET-SEMANTIC-SUBJECT-METHOD", 1, 0, false);
        declareFunction(me, "verb_link_word_get_objects_method", "VERB-LINK-WORD-GET-OBJECTS-METHOD", 1, 0, false);
        declareFunction(me, "verb_link_word_get_semantic_direct_object_method", "VERB-LINK-WORD-GET-SEMANTIC-DIRECT-OBJECT-METHOD", 1, 0, false);
        declareFunction(me, "verb_link_word_get_semantic_indirect_object_method", "VERB-LINK-WORD-GET-SEMANTIC-INDIRECT-OBJECT-METHOD", 1, 0, false);
        declareFunction(me, "verb_link_word_get_semantic_objects_method", "VERB-LINK-WORD-GET-SEMANTIC-OBJECTS-METHOD", 1, 0, false);
        declareFunction(me, "verb_link_word_get_verbal_complement_method", "VERB-LINK-WORD-GET-VERBAL-COMPLEMENT-METHOD", 1, 0, false);
        declareFunction(me, "verb_link_word_get_adjectival_complement_method", "VERB-LINK-WORD-GET-ADJECTIVAL-COMPLEMENT-METHOD", 1, 0, false);
        declareFunction(me, "verb_link_word_get_pps_method", "VERB-LINK-WORD-GET-PPS-METHOD", 1, 0, false);
        declareFunction(me, "verb_link_word_get_infinitive_marker_method", "VERB-LINK-WORD-GET-INFINITIVE-MARKER-METHOD", 1, 0, false);
        declareFunction(me, "verb_link_word_infinitive_p_method", "VERB-LINK-WORD-INFINITIVE-P-METHOD", 1, 0, false);
        declareFunction(me, "verb_link_word_base_p_method", "VERB-LINK-WORD-BASE-P-METHOD", 1, 0, false);
        declareFunction(me, "main_verb_link_word_get_controller_method", "MAIN-VERB-LINK-WORD-GET-CONTROLLER-METHOD", 1, 0, false);
        declareFunction(me, "main_verb_link_word_get_control_verb_method", "MAIN-VERB-LINK-WORD-GET-CONTROL-VERB-METHOD", 1, 0, false);
        declareFunction(me, "main_verb_link_word_control_verb_p_method", "MAIN-VERB-LINK-WORD-CONTROL-VERB-P-METHOD", 1, 0, false);
        declareFunction(me, "main_verb_link_word_object_controller_p_method", "MAIN-VERB-LINK-WORD-OBJECT-CONTROLLER-P-METHOD", 1, 0, false);
        declareFunction(me, "main_verb_link_word_subject_controller_p_method", "MAIN-VERB-LINK-WORD-SUBJECT-CONTROLLER-P-METHOD", 1, 0, false);
        declareFunction(me, "main_verb_link_word_get_matrix_clause_method", "MAIN-VERB-LINK-WORD-GET-MATRIX-CLAUSE-METHOD", 1, 0, false);
        declareFunction(me, "main_verb_link_word_partition_semantic_complements_method", "MAIN-VERB-LINK-WORD-PARTITION-SEMANTIC-COMPLEMENTS-METHOD", 1, 0, false);
        declareFunction(me, "main_verb_link_word_particle_filter_lexes_method", "MAIN-VERB-LINK-WORD-PARTICLE-FILTER-LEXES-METHOD", 1, 0, false);
        declareFunction(me, "main_verb_link_word_get_keyword_renamings_method", "MAIN-VERB-LINK-WORD-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
        declareFunction(me, "main_verb_link_word_cyclify_int_method", "MAIN-VERB-LINK-WORD-CYCLIFY-INT-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_main_verb_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-MAIN-VERB-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_main_verb_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-MAIN-VERB-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "main_verb_link_word_p", "MAIN-VERB-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "main_verb_link_word_passive_p_method", "MAIN-VERB-LINK-WORD-PASSIVE-P-METHOD", 1, 0, false);
        declareFunction(me, "main_verb_link_word_get_subject_method", "MAIN-VERB-LINK-WORD-GET-SUBJECT-METHOD", 1, 0, false);
        declareFunction(me, "main_verb_link_word_get_semantic_subject_method", "MAIN-VERB-LINK-WORD-GET-SEMANTIC-SUBJECT-METHOD", 1, 0, false);
        declareFunction(me, "main_verb_link_word_get_direct_object_method", "MAIN-VERB-LINK-WORD-GET-DIRECT-OBJECT-METHOD", 1, 0, false);
        declareFunction(me, "main_verb_link_word_get_semantic_direct_object_method", "MAIN-VERB-LINK-WORD-GET-SEMANTIC-DIRECT-OBJECT-METHOD", 1, 0, false);
        declareFunction(me, "main_verb_link_word_get_indirect_object_method", "MAIN-VERB-LINK-WORD-GET-INDIRECT-OBJECT-METHOD", 1, 0, false);
        declareFunction(me, "main_verb_link_word_get_semantic_indirect_object_method", "MAIN-VERB-LINK-WORD-GET-SEMANTIC-INDIRECT-OBJECT-METHOD", 1, 0, false);
        declareFunction(me, "main_verb_link_word_get_verbal_complement_method", "MAIN-VERB-LINK-WORD-GET-VERBAL-COMPLEMENT-METHOD", 1, 0, false);
        declareFunction(me, "main_verb_link_word_get_complements_method", "MAIN-VERB-LINK-WORD-GET-COMPLEMENTS-METHOD", 1, 0, false);
        declareFunction(me, "main_verb_link_word_get_aux_verb_method", "MAIN-VERB-LINK-WORD-GET-AUX-VERB-METHOD", 1, 0, false);
        declareFunction(me, "main_verb_link_word_get_particle_method", "MAIN-VERB-LINK-WORD-GET-PARTICLE-METHOD", 1, 0, false);
        declareFunction(me, "main_verb_link_word_get_modifieds_method", "MAIN-VERB-LINK-WORD-GET-MODIFIEDS-METHOD", 1, 0, false);
        declareFunction(me, "aux_verb_link_word_copula_p_method", "AUX-VERB-LINK-WORD-COPULA-P-METHOD", 1, 0, false);
        declareFunction(me, "aux_verb_link_word_get_keyword_renamings_method", "AUX-VERB-LINK-WORD-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
        declareFunction(me, "aux_verb_link_word_get_semantic_heads_method", "AUX-VERB-LINK-WORD-GET-SEMANTIC-HEADS-METHOD", 1, 0, false);
        declareFunction(me, "aux_verb_link_word_get_tense_method", "AUX-VERB-LINK-WORD-GET-TENSE-METHOD", 1, 0, false);
        declareFunction(me, "aux_verb_link_word_get_semantic_complements_method", "AUX-VERB-LINK-WORD-GET-SEMANTIC-COMPLEMENTS-METHOD", 1, 0, false);
        declareFunction(me, "aux_verb_link_word_get_complements_method", "AUX-VERB-LINK-WORD-GET-COMPLEMENTS-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_aux_verb_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-AUX-VERB-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_aux_verb_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-AUX-VERB-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "aux_verb_link_word_p", "AUX-VERB-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "aux_verb_link_word_get_subject_method", "AUX-VERB-LINK-WORD-GET-SUBJECT-METHOD", 1, 0, false);
        declareFunction(me, "aux_verb_link_word_get_verbal_complement_method", "AUX-VERB-LINK-WORD-GET-VERBAL-COMPLEMENT-METHOD", 1, 0, false);
        declareFunction(me, "aux_verb_link_word_get_adjectival_complement_method", "AUX-VERB-LINK-WORD-GET-ADJECTIVAL-COMPLEMENT-METHOD", 1, 0, false);
        declareFunction(me, "aux_verb_link_word_get_adverbial_complement_method", "AUX-VERB-LINK-WORD-GET-ADVERBIAL-COMPLEMENT-METHOD", 1, 0, false);
        declareFunction(me, "aux_verb_link_word_get_prepositional_complement_method", "AUX-VERB-LINK-WORD-GET-PREPOSITIONAL-COMPLEMENT-METHOD", 1, 0, false);
        declareFunction(me, "aux_verb_link_word_equality_p_method", "AUX-VERB-LINK-WORD-EQUALITY-P-METHOD", 1, 0, false);
        declareFunction(me, "aux_verb_link_word_passive_p_method", "AUX-VERB-LINK-WORD-PASSIVE-P-METHOD", 1, 0, false);
        declareFunction(me, "aux_verb_link_word_get_semantic_subject_method", "AUX-VERB-LINK-WORD-GET-SEMANTIC-SUBJECT-METHOD", 1, 0, false);
        declareFunction(me, "aux_verb_link_word_get_direct_object_method", "AUX-VERB-LINK-WORD-GET-DIRECT-OBJECT-METHOD", 1, 0, false);
        declareFunction(me, "aux_verb_link_word_get_semantic_direct_object_method", "AUX-VERB-LINK-WORD-GET-SEMANTIC-DIRECT-OBJECT-METHOD", 1, 0, false);
        declareFunction(me, "aux_verb_link_word_get_indirect_object_method", "AUX-VERB-LINK-WORD-GET-INDIRECT-OBJECT-METHOD", 1, 0, false);
        declareFunction(me, "aux_verb_link_word_get_semantic_indirect_object_method", "AUX-VERB-LINK-WORD-GET-SEMANTIC-INDIRECT-OBJECT-METHOD", 1, 0, false);
        declareFunction(me, "aux_verb_link_word_get_oblique_object_method", "AUX-VERB-LINK-WORD-GET-OBLIQUE-OBJECT-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_modal_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-MODAL-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_modal_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-MODAL-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "modal_link_word_p", "MODAL-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_participle_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-PARTICIPLE-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_participle_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-PARTICIPLE-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "participle_link_word_p", "PARTICIPLE-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "noun_link_word_definite_description_p_method", "NOUN-LINK-WORD-DEFINITE-DESCRIPTION-P-METHOD", 1, 0, false);
        declareFunction(me, "noun_link_word_cyclify_nucleus_method", "NOUN-LINK-WORD-CYCLIFY-NUCLEUS-METHOD", 1, 1, false);
        declareFunction(me, "noun_link_word_cyclify_int_method", "NOUN-LINK-WORD-CYCLIFY-INT-METHOD", 1, 0, false);
        declareFunction(me, "noun_link_word_get_keyword_renamings_method", "NOUN-LINK-WORD-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
        declareFunction(me, "noun_link_word_relational_noun_p_method", "NOUN-LINK-WORD-RELATIONAL-NOUN-P-METHOD", 1, 0, false);
        declareFunction(me, "noun_link_word_get_quantifier_method", "NOUN-LINK-WORD-GET-QUANTIFIER-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_noun_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-NOUN-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_noun_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-NOUN-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "noun_link_word_p", "NOUN-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "noun_link_word_get_complements_method", "NOUN-LINK-WORD-GET-COMPLEMENTS-METHOD", 1, 0, false);
        declareFunction(me, "noun_link_word_get_modifieds_method", "NOUN-LINK-WORD-GET-MODIFIEDS-METHOD", 1, 0, false);
        declareFunction(me, "noun_link_word_get_determiner_method", "NOUN-LINK-WORD-GET-DETERMINER-METHOD", 1, 0, false);
        declareFunction(me, "noun_link_word_get_cardinal_method", "NOUN-LINK-WORD-GET-CARDINAL-METHOD", 1, 0, false);
        declareFunction(me, "noun_link_word_get_overt_quantifier_method", "NOUN-LINK-WORD-GET-OVERT-QUANTIFIER-METHOD", 1, 0, false);
        declareFunction(me, "noun_link_word_get_possessor_method", "NOUN-LINK-WORD-GET-POSSESSOR-METHOD", 1, 0, false);
        declareFunction(me, "noun_link_word_get_specifier_method", "NOUN-LINK-WORD-GET-SPECIFIER-METHOD", 1, 0, false);
        declareFunction(me, "noun_link_word_get_pps_method", "NOUN-LINK-WORD-GET-PPS-METHOD", 1, 0, false);
        declareFunction(me, "noun_link_word_get_existential_null_determiner_method", "NOUN-LINK-WORD-GET-EXISTENTIAL-NULL-DETERMINER-METHOD", 1, 0, false);
        declareFunction(me, "noun_link_word_singular_p_method", "NOUN-LINK-WORD-SINGULAR-P-METHOD", 1, 0, false);
        declareFunction(me, "noun_link_word_plural_p_method", "NOUN-LINK-WORD-PLURAL-P-METHOD", 1, 0, false);
        declareFunction(me, "noun_link_word_appositive_p_method", "NOUN-LINK-WORD-APPOSITIVE-P-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_common_noun_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-COMMON-NOUN-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_common_noun_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-COMMON-NOUN-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "common_noun_link_word_p", "COMMON-NOUN-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "proper_noun_link_word_get_quantifier_method", "PROPER-NOUN-LINK-WORD-GET-QUANTIFIER-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_proper_noun_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-PROPER-NOUN-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_proper_noun_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-PROPER-NOUN-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "proper_noun_link_word_p", "PROPER-NOUN-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_gerund_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-GERUND-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_gerund_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-GERUND-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "gerund_link_word_p", "GERUND-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_pronoun_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-PRONOUN-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_pronoun_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-PRONOUN-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "pronoun_link_word_p", "PRONOUN-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_w_pronoun_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-W-PRONOUN-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_w_pronoun_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-W-PRONOUN-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "w_pronoun_link_word_p", "W-PRONOUN-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "w_pronoun_link_word_get_refs_method", "W-PRONOUN-LINK-WORD-GET-REFS-METHOD", 1, 0, false);
        declareFunction(me, "w_pronoun_link_word_get_antecedent_method", "W-PRONOUN-LINK-WORD-GET-ANTECEDENT-METHOD", 1, 0, false);
        declareFunction(me, "w_pronoun_link_word_appositive_p_method", "W-PRONOUN-LINK-WORD-APPOSITIVE-P-METHOD", 1, 0, false);
        declareFunction(me, "w_pronoun_link_word_get_quantifier_method", "W-PRONOUN-LINK-WORD-GET-QUANTIFIER-METHOD", 1, 0, false);
        declareFunction(me, "w_pronoun_link_word_get_modifieds_method", "W-PRONOUN-LINK-WORD-GET-MODIFIEDS-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_rel_pronoun_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-REL-PRONOUN-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_rel_pronoun_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-REL-PRONOUN-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "rel_pronoun_link_word_p", "REL-PRONOUN-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_personal_pronoun_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-PERSONAL-PRONOUN-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_personal_pronoun_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-PERSONAL-PRONOUN-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "personal_pronoun_link_word_p", "PERSONAL-PRONOUN-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "adjective_link_word_get_keyword_renamings_method", "ADJECTIVE-LINK-WORD-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
        declareFunction(me, "adjective_link_word_get_complements_method", "ADJECTIVE-LINK-WORD-GET-COMPLEMENTS-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_adjective_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-ADJECTIVE-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_adjective_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-ADJECTIVE-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "adjective_link_word_p", "ADJECTIVE-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "adjective_link_word_get_modifieds_method", "ADJECTIVE-LINK-WORD-GET-MODIFIEDS-METHOD", 1, 0, false);
        declareFunction(me, "adjective_link_word_get_pps_method", "ADJECTIVE-LINK-WORD-GET-PPS-METHOD", 1, 0, false);
        declareFunction(me, "adverb_link_word_get_keyword_renamings_method", "ADVERB-LINK-WORD-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
        declareFunction(me, "subloop_reserved_initialize_adverb_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-ADVERB-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_adverb_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-ADVERB-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "adverb_link_word_p", "ADVERB-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "adverb_link_word_get_modifieds_method", "ADVERB-LINK-WORD-GET-MODIFIEDS-METHOD", 1, 0, false);
        declareFunction(me, "adverb_link_word_get_complements_method", "ADVERB-LINK-WORD-GET-COMPLEMENTS-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_w_adverb_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-W-ADVERB-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_w_adverb_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-W-ADVERB-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "w_adverb_link_word_p", "W-ADVERB-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "w_adverb_link_word_get_modifieds_method", "W-ADVERB-LINK-WORD-GET-MODIFIEDS-METHOD", 1, 0, false);
        declareFunction(me, "preposition_link_word_get_keyword_renamings_method", "PREPOSITION-LINK-WORD-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
        declareFunction(me, "subloop_reserved_initialize_preposition_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITION-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_preposition_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITION-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "preposition_link_word_p", "PREPOSITION-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "preposition_link_word_get_oblique_object_method", "PREPOSITION-LINK-WORD-GET-OBLIQUE-OBJECT-METHOD", 1, 0, false);
        declareFunction(me, "preposition_link_word_get_verbal_complement_method", "PREPOSITION-LINK-WORD-GET-VERBAL-COMPLEMENT-METHOD", 1, 0, false);
        declareFunction(me, "preposition_link_word_get_modifieds_method", "PREPOSITION-LINK-WORD-GET-MODIFIEDS-METHOD", 1, 0, false);
        declareFunction(me, "preposition_link_word_get_complements_method", "PREPOSITION-LINK-WORD-GET-COMPLEMENTS-METHOD", 1, 0, false);
        declareFunction(me, "quantifier_link_word_get_keyword_renamings_method", "QUANTIFIER-LINK-WORD-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
        declareFunction(me, "subloop_reserved_initialize_quantifier_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-QUANTIFIER-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_quantifier_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-QUANTIFIER-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "quantifier_link_word_p", "QUANTIFIER-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "quantifier_link_word_get_quantified_method", "QUANTIFIER-LINK-WORD-GET-QUANTIFIED-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_determiner_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-DETERMINER-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_determiner_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-DETERMINER-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "determiner_link_word_p", "DETERMINER-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_definite_determiner_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-DEFINITE-DETERMINER-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_definite_determiner_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-DEFINITE-DETERMINER-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "definite_determiner_link_word_p", "DEFINITE-DETERMINER-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_w_determiner_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-W-DETERMINER-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_w_determiner_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-W-DETERMINER-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "w_determiner_link_word_p", "W-DETERMINER-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_predeterminer_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-PREDETERMINER-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_predeterminer_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-PREDETERMINER-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "predeterminer_link_word_p", "PREDETERMINER-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_possessive_pronoun_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-POSSESSIVE-PRONOUN-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_possessive_pronoun_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-POSSESSIVE-PRONOUN-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "possessive_pronoun_link_word_p", "POSSESSIVE-PRONOUN-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_cardinal_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-CARDINAL-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_cardinal_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-CARDINAL-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "cardinal_link_word_p", "CARDINAL-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_conjunction_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-CONJUNCTION-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_conjunction_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-CONJUNCTION-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "conjunction_link_word_p", "CONJUNCTION-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "conjunction_link_word_get_complements_method", "CONJUNCTION-LINK-WORD-GET-COMPLEMENTS-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_existential_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-EXISTENTIAL-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_existential_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-EXISTENTIAL-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "existential_link_word_p", "EXISTENTIAL-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_comparator_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-COMPARATOR-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_comparator_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-COMPARATOR-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "comparator_link_word_p", "COMPARATOR-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_inf_marker_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-INF-MARKER-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_inf_marker_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-INF-MARKER-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "inf_marker_link_word_p", "INF-MARKER-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_particle_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-PARTICLE-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_particle_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-PARTICLE-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "particle_link_word_p", "PARTICLE-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_punctuation_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-PUNCTUATION-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_punctuation_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-PUNCTUATION-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "punctuation_link_word_p", "PUNCTUATION-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "poss_marker_link_word_get_keyword_renamings_method", "POSS-MARKER-LINK-WORD-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
        declareFunction(me, "subloop_reserved_initialize_poss_marker_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-POSS-MARKER-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_poss_marker_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-POSS-MARKER-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "poss_marker_link_word_p", "POSS-MARKER-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "poss_marker_link_word_get_possessor_method", "POSS-MARKER-LINK-WORD-GET-POSSESSOR-METHOD", 1, 0, false);
        declareFunction(me, "poss_marker_link_word_get_possessed_method", "POSS-MARKER-LINK-WORD-GET-POSSESSED-METHOD", 1, 0, false);
        declareFunction(me, "poss_marker_link_word_get_complements_method", "POSS-MARKER-LINK-WORD-GET-COMPLEMENTS-METHOD", 1, 0, false);
        declareFunction(me, "poss_marker_link_word_get_modifieds_method", "POSS-MARKER-LINK-WORD-GET-MODIFIEDS-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_complementizer_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-COMPLEMENTIZER-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_complementizer_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-COMPLEMENTIZER-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "complementizer_link_word_p", "COMPLEMENTIZER-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_wall_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-WALL-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_wall_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-WALL-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "wall_link_word_p", "WALL-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_left_wall_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-LEFT-WALL-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_left_wall_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-LEFT-WALL-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "left_wall_link_word_p", "LEFT-WALL-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_right_wall_link_word_class", "SUBLOOP-RESERVED-INITIALIZE-RIGHT-WALL-LINK-WORD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_right_wall_link_word_instance", "SUBLOOP-RESERVED-INITIALIZE-RIGHT-WALL-LINK-WORD-INSTANCE", 1, 0, false);
        declareFunction(me, "right_wall_link_word_p", "RIGHT-WALL-LINK-WORD-P", 1, 0, false);
        declareFunction(me, "get_linkage_tree_string", "GET-LINKAGE-TREE-STRING", 1, 0, false);
        declareFunction(me, "set_linkage_tree_string", "SET-LINKAGE-TREE-STRING", 2, 0, false);
        declareFunction(me, "get_linkage_tree", "GET-LINKAGE-TREE", 1, 0, false);
        declareFunction(me, "set_linkage_tree", "SET-LINKAGE-TREE", 2, 0, false);
        declareFunction(me, "get_linkage_diagram", "GET-LINKAGE-DIAGRAM", 1, 0, false);
        declareFunction(me, "set_linkage_diagram", "SET-LINKAGE-DIAGRAM", 2, 0, false);
        declareFunction(me, "get_linkage_words", "GET-LINKAGE-WORDS", 1, 0, false);
        declareFunction(me, "set_linkage_words", "SET-LINKAGE-WORDS", 2, 0, false);
        declareFunction(me, "get_linkage_links", "GET-LINKAGE-LINKS", 1, 0, false);
        declareFunction(me, "set_linkage_links", "SET-LINKAGE-LINKS", 2, 0, false);
        declareFunction(me, "linkage_cyclify_method", "LINKAGE-CYCLIFY-METHOD", 1, 1, false);
        declareFunction(me, "linkage_get_cyclifier_method", "LINKAGE-GET-CYCLIFIER-METHOD", 1, 1, false);
        declareFunction(me, "subloop_reserved_initialize_linkage_class", "SUBLOOP-RESERVED-INITIALIZE-LINKAGE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_linkage_instance", "SUBLOOP-RESERVED-INITIALIZE-LINKAGE-INSTANCE", 1, 0, false);
        declareFunction(me, "linkage_p", "LINKAGE-P", 1, 0, false);
        declareMacro(me, "do_linkage_links", "DO-LINKAGE-LINKS");
        declareMacro(me, "do_linkage_words", "DO-LINKAGE-WORDS");
        declareFunction(me, "words_to_sentence", "WORDS-TO-SENTENCE", 1, 0, false);
        declareFunction(me, "new_linkage", "NEW-LINKAGE", 1, 1, false);
        declareMacro(me, "set_new_linkage", "SET-NEW-LINKAGE");
        declareFunction(me, "new_linkages", "NEW-LINKAGES", 1, 1, false);
        declareFunction(me, "new_linkage_from_link_structure", "NEW-LINKAGE-FROM-LINK-STRUCTURE", 3, 0, false);
        declareFunction(me, "retag_linkage_aux_verbs", "RETAG-LINKAGE-AUX-VERBS", 1, 0, false);
        declareFunction(me, "process_linkage_modifiers", "PROCESS-LINKAGE-MODIFIERS", 1, 0, false);
        declareFunction(me, "linkage_yield_method", "LINKAGE-YIELD-METHOD", 1, 0, false);
        declareFunction(me, "linkage_print_method", "LINKAGE-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "linkage_xml_method", "LINKAGE-XML-METHOD", 1, 0, false);
        declareFunction(me, "link_tree_string", "LINK-TREE-STRING", 2, 0, false);
        declareFunction(me, "link_phrase_string", "LINK-PHRASE-STRING", 2, 0, false);
        declareFunction(me, "link_word_string", "LINK-WORD-STRING", 2, 0, false);
        declareFunction(me, "links_xml", "LINKS-XML", 3, 0, false);
        declareFunction(me, "diagram_xml", "DIAGRAM-XML", 3, 0, false);
        declareFunction(me, "tree_string_xml", "TREE-STRING-XML", 3, 0, false);
        declareFunction(me, "linkage_print_diagram_method", "LINKAGE-PRINT-DIAGRAM-METHOD", 1, 0, false);
        declareFunction(me, "linkage_length_method", "LINKAGE-LENGTH-METHOD", 1, 0, false);
        declareFunction(me, "linkage_get_tree_method", "LINKAGE-GET-TREE-METHOD", 1, 0, false);
        declareFunction(me, "linkage_get_tree_string_method", "LINKAGE-GET-TREE-STRING-METHOD", 1, 0, false);
        declareFunction(me, "linkage_get_daughter_method", "LINKAGE-GET-DAUGHTER-METHOD", 2, 0, false);
        declareFunction(me, "linkage_get_word_method", "LINKAGE-GET-WORD-METHOD", 2, 0, false);
        declareFunction(me, "linkage_get_heads_method", "LINKAGE-GET-HEADS-METHOD", 1, 0, false);
        declareFunction(me, "linkage_get_head_method", "LINKAGE-GET-HEAD-METHOD", 1, 0, false);
        declareFunction(me, "linkage_get_subject_method", "LINKAGE-GET-SUBJECT-METHOD", 1, 0, false);
        declareFunction(me, "linkage_get_direct_object_method", "LINKAGE-GET-DIRECT-OBJECT-METHOD", 1, 0, false);
        declareFunction(me, "linkage_get_indirect_object_method", "LINKAGE-GET-INDIRECT-OBJECT-METHOD", 1, 0, false);
        declareFunction(me, "linkage_cyclify_int_method", "LINKAGE-CYCLIFY-INT-METHOD", 1, 0, false);
        declareFunction(me, "linkage_lexify_method", "LINKAGE-LEXIFY-METHOD", 2, 0, false);
        declareFunction(me, "linkage_cyclifiable_question_p_method", "LINKAGE-CYCLIFIABLE-QUESTION-P-METHOD", 1, 0, false);
        declareFunction(me, "linkage_search_method", "LINKAGE-SEARCH-METHOD", 2, 1, false);
        declareFunction(me, "get_link_pattern", "GET-LINK-PATTERN", 1, 0, false);
        declareFunction(me, "links_to_classes", "LINKS-TO-CLASSES", 2, 0, false);
        declareFunction(me, "link_to_classes", "LINK-TO-CLASSES", 2, 0, false);
        declareFunction(me, "split_link", "SPLIT-LINK", 1, 0, false);
        declareFunction(me, "strip_link_modifiers", "STRIP-LINK-MODIFIERS", 1, 0, false);
        declareFunction(me, "get_link_word_class", "GET-LINK-WORD-CLASS", 5, 0, false);
        declareFunction(me, "link_pos_to_class", "LINK-POS-TO-CLASS", 1, 0, false);
        declareFunction(me, "penn_pos_to_classes", "PENN-POS-TO-CLASSES", 1, 0, false);
        declareFunction(me, "word_to_class", "WORD-TO-CLASS", 1, 0, false);
        declareFunction(me, "class_to_penn_poss", "CLASS-TO-PENN-POSS", 1, 0, false);
        declareFunction(me, "most_specific_class", "MOST-SPECIFIC-CLASS", 1, 0, false);
        declareFunction(me, "vector_of_pos_tags", "VECTOR-OF-POS-TAGS", 0, 0, false);
        declareFunction(me, "initialize_pos_tags", "INITIALIZE-POS-TAGS", 0, 0, false);
        declareFunction(me, "strengthen_pos_class", "STRENGTHEN-POS-CLASS", 3, 0, false);
        declareFunction(me, "statistical_pos_tag", "STATISTICAL-POS-TAG", 2, 0, false);
        declareFunction(me, "auxify_sentence", "AUXIFY-SENTENCE", 1, 0, false);
        declareFunction(me, "search_atmost_n_link_words", "SEARCH-ATMOST-N-LINK-WORDS", 3, 0, false);
        declareFunction(me, "link_phrase_phrases_headed_by_string", "LINK-PHRASE-PHRASES-HEADED-BY-STRING", 2, 1, false);
        declareFunction(me, "xml_to_linkage", "XML-TO-LINKAGE", 1, 0, false);
        declareFunction(me, "link_tree_word_vector", "LINK-TREE-WORD-VECTOR", 1, 0, false);
        declareFunction(me, "xml_sexpr_to_links", "XML-SEXPR-TO-LINKS", 2, 0, false);
        declareFunction(me, "xml_sexpr_link_to_link", "XML-SEXPR-LINK-TO-LINK", 2, 0, false);
        declareFunction(me, "xml_sexpr_to_link_tree", "XML-SEXPR-TO-LINK-TREE", 1, 0, false);
        declareFunction(me, "xml_sexpr_tree_to_link_tree", "XML-SEXPR-TREE-TO-LINK-TREE", 1, 0, false);
        declareFunction(me, "xml_sexpr_phrase_to_link_tree", "XML-SEXPR-PHRASE-TO-LINK-TREE", 1, 0, false);
        declareFunction(me, "xml_sexpr_word_to_link_tree", "XML-SEXPR-WORD-TO-LINK-TREE", 1, 0, false);
        declareFunction(me, "xml_sexpr_phrase_p", "XML-SEXPR-PHRASE-P", 1, 0, false);
        declareFunction(me, "xml_sexpr_word_p", "XML-SEXPR-WORD-P", 1, 0, false);
        declareFunction(me, "link_constituent_string_to_list", "LINK-CONSTITUENT-STRING-TO-LIST", 1, 0, false);
        declareFunction(me, "parse_link_sentences", "PARSE-LINK-SENTENCES", 1, 0, false);
        declareFunction(me, "test_linkage_with_retokenization", "TEST-LINKAGE-WITH-RETOKENIZATION", 1, 0, false);
        declareFunction(me, "some_linkage_results", "SOME-LINKAGE-RESULTS", 2, 0, false);
        declareFunction(me, "links_have_namesP", "LINKS-HAVE-NAMES?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_linkage_file() {
        defparameter("*LINK-PARSER*", red_infrastructure_macros.red_def_helper($list0.isSymbol() ? symbol_value($list0) : $list0, $link_parser$, $str2$linkparser_cyc_com.isSymbol() ? symbol_value($str2$linkparser_cyc_com) : $str2$linkparser_cyc_com, $PARAMETER, UNPROVIDED));
        defparameter("*LINK-PORT*", red_infrastructure_macros.red_def_helper($list4.isSymbol() ? symbol_value($list4) : $list4, $link_port$, $int$4567.isSymbol() ? symbol_value($int$4567) : $int$4567, $PARAMETER, UNPROVIDED));
        defparameter("*CYC-LINK-INTERFACE*", red_infrastructure_macros.red_def_helper($list7.isSymbol() ? symbol_value($list7) : $list7, $cyc_link_interface$, $str9$1_2.isSymbol() ? symbol_value($str9$1_2) : $str9$1_2, $PARAMETER, UNPROVIDED));
        defparameter("*LINK-PARSE-OPTIONS*", list($CYC_LINK_INTERFACE, $cyc_link_interface$.getDynamicValue(), $MAX_LINKAGE, ONE_INTEGER, $DICTIONARY_NICKNAME, $$$default, $MAX_PARSE_TIME, $int$30));
        defparameter("*SHOW-LINK-WARNINGS*", NIL);
        defparameter("*LINK-PATTERN-TABLE*", NIL);
        defparameter("*LINK-PATTERNS*", $list16);
        defparameter("*WORD-TO-CLASS*", $list17);
        deflexical("*LINK-POS-TO-CLASS*", $list18);
        deflexical("*LINK-POSES*", $$$nvaepstidygrcqmzx);
        deflexical("*LINK-PARSER-UNKNOWN-STRING-SUFFIX*", $str20$___);
        deflexical("*LINK-PARSER-GUESSED-STRING-SUFFIX*", $str21$___);
        deflexical("*PENN-POS-TO-CLASSES*", $list22);
        deflexical("*LLINK-TABLE*", NIL);
        deflexical("*RLINK-TABLE*", NIL);
        deflexical("*POS-CLASS-TABLE*", NIL);
        deflexical("*CLASS-POS-TABLE*", NIL);
        defparameter("*LEFT-LINK-TO-CLASS*", $list23);
        defparameter("*RIGHT-LINK-TO-CLASS*", $list24);
        deflexical("*WORD-POS-PROBABILITIES*", NIL);
        deflexical("*LINK-EXECUTE-INT-CACHING-STATE*", NIL);
        deflexical("*LINK-EXECUTE-CACHED-CACHING-STATE*", NIL);
        defparameter("*CATEGORY-PATTERN*", NIL);
        defparameter("*WORD-PATTERN*", NIL);
        defparameter("*PAREN-PATTERN*", NIL);
        defconstant("*DTP-LINK*", LINK);
        deflexical("*CATEGORY-TO-LINK-TREE-CLASS*", $list294);
        deflexical("*SPLIT-LINK-WORD-CACHING-STATE*", NIL);
        deflexical("*POS-TAGS*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject setup_linkage_file() {
        register_external_symbol(LINK_PARSE);
        memoization_state.note_globally_cached_function(LINK_EXECUTE_INT);
        memoization_state.note_globally_cached_function(LINK_EXECUTE_CACHED);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_link$.getGlobalValue(), symbol_function(LINK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list77);
        def_csetf(LINK_NAME, _CSETF_LINK_NAME);
        def_csetf(LINK_LEFT_WORD, _CSETF_LINK_LEFT_WORD);
        def_csetf(LINK_RIGHT_WORD, _CSETF_LINK_RIGHT_WORD);
        identity(LINK);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_link$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_LINK_METHOD));
        classes.subloop_new_class(LINK_TREE, OBJECT, $list100, T, $list101);
        classes.class_set_implements_slot_listeners(LINK_TREE, NIL);
        classes.subloop_note_class_initialization_function(LINK_TREE, SUBLOOP_RESERVED_INITIALIZE_LINK_TREE_CLASS);
        classes.subloop_note_instance_initialization_function(LINK_TREE, SUBLOOP_RESERVED_INITIALIZE_LINK_TREE_INSTANCE);
        subloop_reserved_initialize_link_tree_class(LINK_TREE);
        methods.methods_incorporate_instance_method(GET_MODIFIERS, LINK_TREE, $list113, NIL, $list114);
        methods.subloop_register_instance_method(LINK_TREE, GET_MODIFIERS, LINK_TREE_GET_MODIFIERS_METHOD);
        methods.methods_incorporate_instance_method(GET_MODIFIEDS, LINK_TREE, $list113, NIL, $list118);
        methods.subloop_register_instance_method(LINK_TREE, GET_MODIFIEDS, LINK_TREE_GET_MODIFIEDS_METHOD);
        methods.methods_incorporate_instance_method(PRINT, LINK_TREE, $list121, $list122, $list123);
        methods.subloop_register_instance_method(LINK_TREE, PRINT, LINK_TREE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(XML, LINK_TREE, $list121, $list126, $list127);
        methods.subloop_register_instance_method(LINK_TREE, XML, LINK_TREE_XML_METHOD);
        methods.methods_incorporate_instance_method(GET_CATEGORY, LINK_TREE, $list121, NIL, $list130);
        methods.subloop_register_instance_method(LINK_TREE, GET_CATEGORY, LINK_TREE_GET_CATEGORY_METHOD);
        methods.methods_incorporate_instance_method(GET_ROOT, LINK_TREE, $list113, NIL, $list134);
        methods.subloop_register_instance_method(LINK_TREE, GET_ROOT, LINK_TREE_GET_ROOT_METHOD);
        methods.methods_incorporate_instance_method(ROOT_P, LINK_TREE, $list113, NIL, $list138);
        methods.subloop_register_instance_method(LINK_TREE, ROOT_P, LINK_TREE_ROOT_P_METHOD);
        methods.methods_incorporate_instance_method(GET_MOTHER, LINK_TREE, $list121, NIL, $list142);
        methods.subloop_register_instance_method(LINK_TREE, GET_MOTHER, LINK_TREE_GET_MOTHER_METHOD);
        methods.methods_incorporate_instance_method(GET_REFS, LINK_TREE, $list121, NIL, $list146);
        methods.subloop_register_instance_method(LINK_TREE, GET_REFS, LINK_TREE_GET_REFS_METHOD);
        methods.methods_incorporate_instance_method(GET_INDEX, LINK_TREE, $list113, NIL, $list150);
        methods.subloop_register_instance_method(LINK_TREE, GET_INDEX, LINK_TREE_GET_INDEX_METHOD);
        methods.methods_incorporate_instance_method(GET_SISTER, LINK_TREE, $list113, $list154, $list155);
        methods.subloop_register_instance_method(LINK_TREE, GET_SISTER, LINK_TREE_GET_SISTER_METHOD);
        methods.methods_incorporate_instance_method(YIELD, LINK_TREE, $list121, NIL, $list161);
        methods.subloop_register_instance_method(LINK_TREE, YIELD, LINK_TREE_YIELD_METHOD);
        methods.methods_incorporate_instance_method(GET_ANCESTORS, LINK_TREE, $list121, NIL, $list164);
        methods.subloop_register_instance_method(LINK_TREE, GET_ANCESTORS, LINK_TREE_GET_ANCESTORS_METHOD);
        methods.methods_incorporate_instance_method(DEPTH, LINK_TREE, $list121, NIL, $list168);
        methods.subloop_register_instance_method(LINK_TREE, DEPTH, LINK_TREE_DEPTH_METHOD);
        classes.subloop_new_class(LINK_PHRASE, LINK_TREE, NIL, NIL, $list171);
        classes.class_set_implements_slot_listeners(LINK_PHRASE, NIL);
        classes.subloop_note_class_initialization_function(LINK_PHRASE, SUBLOOP_RESERVED_INITIALIZE_LINK_PHRASE_CLASS);
        classes.subloop_note_instance_initialization_function(LINK_PHRASE, SUBLOOP_RESERVED_INITIALIZE_LINK_PHRASE_INSTANCE);
        subloop_reserved_initialize_link_phrase_class(LINK_PHRASE);
        methods.methods_incorporate_instance_method(GET_CONJUNCTION, LINK_PHRASE, $list113, NIL, $list191);
        methods.subloop_register_instance_method(LINK_PHRASE, GET_CONJUNCTION, LINK_PHRASE_GET_CONJUNCTION_METHOD);
        methods.methods_incorporate_instance_method(GET_STRING, LINK_PHRASE, $list113, NIL, $list194);
        methods.subloop_register_instance_method(LINK_PHRASE, GET_STRING, LINK_PHRASE_GET_STRING_METHOD);
        methods.methods_incorporate_instance_method(DAUGHTER_COUNT, LINK_PHRASE, $list113, NIL, $list197);
        methods.subloop_register_instance_method(LINK_PHRASE, DAUGHTER_COUNT, LINK_PHRASE_DAUGHTER_COUNT_METHOD);
        methods.methods_incorporate_instance_method(GET_DAUGHTER, LINK_PHRASE, $list121, $list154, $list200);
        methods.subloop_register_instance_method(LINK_PHRASE, GET_DAUGHTER, LINK_PHRASE_GET_DAUGHTER_METHOD);
        methods.methods_incorporate_instance_method(GET_HEAD_DAUGHTERS, LINK_PHRASE, $list121, NIL, $list205);
        methods.subloop_register_instance_method(LINK_PHRASE, GET_HEAD_DAUGHTERS, LINK_PHRASE_GET_HEAD_DAUGHTERS_METHOD);
        methods.methods_incorporate_instance_method(GET_HEAD_DAUGHTER, LINK_PHRASE, $list121, NIL, $list209);
        methods.subloop_register_instance_method(LINK_PHRASE, GET_HEAD_DAUGHTER, LINK_PHRASE_GET_HEAD_DAUGHTER_METHOD);
        methods.methods_incorporate_instance_method(GET_SEMANTIC_HEAD_DAUGHTERS, LINK_PHRASE, $list113, NIL, $list212);
        methods.subloop_register_instance_method(LINK_PHRASE, GET_SEMANTIC_HEAD_DAUGHTERS, LINK_PHRASE_GET_SEMANTIC_HEAD_DAUGHTERS_METHOD);
        methods.methods_incorporate_instance_method(CYCLIFY_INT, LINK_PHRASE, $list121, NIL, $list215);
        methods.subloop_register_instance_method(LINK_PHRASE, CYCLIFY_INT, LINK_PHRASE_CYCLIFY_INT_METHOD);
        methods.methods_incorporate_instance_method(YIELD, LINK_PHRASE, $list121, NIL, $list220);
        methods.subloop_register_instance_method(LINK_PHRASE, YIELD, LINK_PHRASE_YIELD_METHOD);
        methods.methods_incorporate_instance_method(GET_HEADS, LINK_PHRASE, $list121, NIL, $list222);
        methods.subloop_register_instance_method(LINK_PHRASE, GET_HEADS, LINK_PHRASE_GET_HEADS_METHOD);
        methods.methods_incorporate_instance_method(GET_HEAD, LINK_PHRASE, $list121, NIL, $list226);
        methods.subloop_register_instance_method(LINK_PHRASE, GET_HEAD, LINK_PHRASE_GET_HEAD_METHOD);
        methods.methods_incorporate_instance_method(GET_SEMANTIC_HEADS, LINK_PHRASE, $list121, NIL, $list229);
        methods.subloop_register_instance_method(LINK_PHRASE, GET_SEMANTIC_HEADS, LINK_PHRASE_GET_SEMANTIC_HEADS_METHOD);
        methods.methods_incorporate_instance_method(PRETERMINAL_P, LINK_PHRASE, $list121, NIL, $list233);
        methods.subloop_register_instance_method(LINK_PHRASE, PRETERMINAL_P, LINK_PHRASE_PRETERMINAL_P_METHOD);
        methods.methods_incorporate_instance_method(IDIOM_P, LINK_PHRASE, $list121, NIL, $list238);
        methods.subloop_register_instance_method(LINK_PHRASE, IDIOM_P, LINK_PHRASE_IDIOM_P_METHOD);
        methods.methods_incorporate_instance_method(COORDINATE_PHRASE_P, LINK_PHRASE, $list113, NIL, $list245);
        methods.subloop_register_instance_method(LINK_PHRASE, COORDINATE_PHRASE_P, LINK_PHRASE_COORDINATE_PHRASE_P_METHOD);
        methods.methods_incorporate_instance_method(GET_LINKAGE, LINK_PHRASE, $list121, NIL, $list247);
        methods.subloop_register_instance_method(LINK_PHRASE, GET_LINKAGE, LINK_PHRASE_GET_LINKAGE_METHOD);
        methods.methods_incorporate_instance_method(FIND, LINK_PHRASE, $list121, $list250, $list251);
        methods.subloop_register_instance_method(LINK_PHRASE, FIND, LINK_PHRASE_FIND_METHOD);
        methods.methods_incorporate_instance_method(FIND_FIRST, LINK_PHRASE, $list121, $list256, $list257);
        methods.subloop_register_instance_method(LINK_PHRASE, FIND_FIRST, LINK_PHRASE_FIND_FIRST_METHOD);
        methods.methods_incorporate_instance_method(FIND_LAST, LINK_PHRASE, $list121, $list261, $list262);
        methods.subloop_register_instance_method(LINK_PHRASE, FIND_LAST, LINK_PHRASE_FIND_LAST_METHOD);
        interfaces.new_interface(VERBAL_LINK_TREE, NIL, NIL, NIL);
        classes.subloop_new_class(VERBAL_LINK_PHRASE, LINK_PHRASE, $list299, NIL, $list300);
        classes.class_set_implements_slot_listeners(VERBAL_LINK_PHRASE, NIL);
        methods.methods_incorporate_instance_method(CYCLIFY_INT_VP_COORDINATION, VERBAL_LINK_PHRASE, $list121, NIL, $list302);
        methods.subloop_register_instance_method(VERBAL_LINK_PHRASE, CYCLIFY_INT_VP_COORDINATION, VERBAL_LINK_PHRASE_CYCLIFY_INT_VP_COORDINATION_METHOD);
        methods.methods_incorporate_instance_method(CYCLIFY_INT_VP, VERBAL_LINK_PHRASE, $list121, NIL, $list307);
        methods.subloop_register_instance_method(VERBAL_LINK_PHRASE, CYCLIFY_INT_VP, VERBAL_LINK_PHRASE_CYCLIFY_INT_VP_METHOD);
        methods.methods_incorporate_instance_method(CYCLIFY_INT, VERBAL_LINK_PHRASE, $list121, NIL, $list312);
        methods.subloop_register_instance_method(VERBAL_LINK_PHRASE, CYCLIFY_INT, VERBAL_LINK_PHRASE_CYCLIFY_INT_METHOD);
        methods.methods_incorporate_instance_method(VP_COORDINATE_PHRASE_P, VERBAL_LINK_PHRASE, NIL, NIL, $list315);
        methods.subloop_register_instance_method(VERBAL_LINK_PHRASE, VP_COORDINATE_PHRASE_P, VERBAL_LINK_PHRASE_VP_COORDINATE_PHRASE_P_METHOD);
        classes.subloop_note_class_initialization_function(VERBAL_LINK_PHRASE, SUBLOOP_RESERVED_INITIALIZE_VERBAL_LINK_PHRASE_CLASS);
        classes.subloop_note_instance_initialization_function(VERBAL_LINK_PHRASE, SUBLOOP_RESERVED_INITIALIZE_VERBAL_LINK_PHRASE_INSTANCE);
        subloop_reserved_initialize_verbal_link_phrase_class(VERBAL_LINK_PHRASE);
        methods.methods_incorporate_instance_method(GET_SUBJECT, VERBAL_LINK_PHRASE, $list113, NIL, $list320);
        methods.subloop_register_instance_method(VERBAL_LINK_PHRASE, GET_SUBJECT, VERBAL_LINK_PHRASE_GET_SUBJECT_METHOD);
        methods.methods_incorporate_instance_method(GET_SEMANTIC_SUBJECT, VERBAL_LINK_PHRASE, $list113, NIL, $list323);
        methods.subloop_register_instance_method(VERBAL_LINK_PHRASE, GET_SEMANTIC_SUBJECT, VERBAL_LINK_PHRASE_GET_SEMANTIC_SUBJECT_METHOD);
        methods.methods_incorporate_instance_method(GET_VERBAL_COMPLEMENT, VERBAL_LINK_PHRASE, $list113, NIL, $list326);
        methods.subloop_register_instance_method(VERBAL_LINK_PHRASE, GET_VERBAL_COMPLEMENT, VERBAL_LINK_PHRASE_GET_VERBAL_COMPLEMENT_METHOD);
        methods.methods_incorporate_instance_method(GET_HEAD_DAUGHTERS, VERBAL_LINK_PHRASE, $list121, NIL, $list329);
        methods.subloop_register_instance_method(VERBAL_LINK_PHRASE, GET_HEAD_DAUGHTERS, VERBAL_LINK_PHRASE_GET_HEAD_DAUGHTERS_METHOD);
        classes.subloop_new_class(SENTENTIAL_LINK_PHRASE, VERBAL_LINK_PHRASE, $list333, NIL, NIL);
        classes.class_set_implements_slot_listeners(SENTENTIAL_LINK_PHRASE, NIL);
        classes.subloop_note_class_initialization_function(SENTENTIAL_LINK_PHRASE, SUBLOOP_RESERVED_INITIALIZE_SENTENTIAL_LINK_PHRASE_CLASS);
        classes.subloop_note_instance_initialization_function(SENTENTIAL_LINK_PHRASE, SUBLOOP_RESERVED_INITIALIZE_SENTENTIAL_LINK_PHRASE_INSTANCE);
        subloop_reserved_initialize_sentential_link_phrase_class(SENTENTIAL_LINK_PHRASE);
        interfaces.new_interface(PREPOSITIONAL_LINK_TREE, NIL, NIL, NIL);
        classes.subloop_new_class(PREPOSITIONAL_LINK_PHRASE, LINK_PHRASE, $list338, NIL, $list339);
        classes.class_set_implements_slot_listeners(PREPOSITIONAL_LINK_PHRASE, NIL);
        classes.subloop_note_class_initialization_function(PREPOSITIONAL_LINK_PHRASE, SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_LINK_PHRASE_CLASS);
        classes.subloop_note_instance_initialization_function(PREPOSITIONAL_LINK_PHRASE, SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_LINK_PHRASE_INSTANCE);
        subloop_reserved_initialize_prepositional_link_phrase_class(PREPOSITIONAL_LINK_PHRASE);
        methods.methods_incorporate_instance_method(GET_HEAD_DAUGHTERS, PREPOSITIONAL_LINK_PHRASE, $list113, NIL, $list342);
        methods.subloop_register_instance_method(PREPOSITIONAL_LINK_PHRASE, GET_HEAD_DAUGHTERS, PREPOSITIONAL_LINK_PHRASE_GET_HEAD_DAUGHTERS_METHOD);
        methods.methods_incorporate_instance_method(GET_OBLIQUE_OBJECT, PREPOSITIONAL_LINK_PHRASE, $list113, NIL, $list346);
        methods.subloop_register_instance_method(PREPOSITIONAL_LINK_PHRASE, GET_OBLIQUE_OBJECT, PREPOSITIONAL_LINK_PHRASE_GET_OBLIQUE_OBJECT_METHOD);
        interfaces.new_interface(NOMINAL_LINK_TREE, NIL, NIL, NIL);
        classes.subloop_new_class(NOMINAL_LINK_PHRASE, LINK_PHRASE, $list350, NIL, $list351);
        classes.class_set_implements_slot_listeners(NOMINAL_LINK_PHRASE, NIL);
        classes.subloop_note_class_initialization_function(NOMINAL_LINK_PHRASE, SUBLOOP_RESERVED_INITIALIZE_NOMINAL_LINK_PHRASE_CLASS);
        classes.subloop_note_instance_initialization_function(NOMINAL_LINK_PHRASE, SUBLOOP_RESERVED_INITIALIZE_NOMINAL_LINK_PHRASE_INSTANCE);
        subloop_reserved_initialize_nominal_link_phrase_class(NOMINAL_LINK_PHRASE);
        methods.methods_incorporate_instance_method(GET_HEAD_DAUGHTERS, NOMINAL_LINK_PHRASE, $list113, NIL, $list354);
        methods.subloop_register_instance_method(NOMINAL_LINK_PHRASE, GET_HEAD_DAUGHTERS, NOMINAL_LINK_PHRASE_GET_HEAD_DAUGHTERS_METHOD);
        classes.subloop_new_class(LINK_WORD, LINK_TREE, $list360, NIL, $list361);
        classes.class_set_implements_slot_listeners(LINK_WORD, NIL);
        methods.methods_incorporate_instance_method(GET_KEYWORD_RENAMINGS, LINK_WORD, $list121, $list369, $list370);
        methods.subloop_register_instance_method(LINK_WORD, GET_KEYWORD_RENAMINGS, LINK_WORD_GET_KEYWORD_RENAMINGS_METHOD);
        methods.methods_incorporate_instance_method(MODIFIED_DEPENDENT_MEANING_P, LINK_WORD, $list121, NIL, $list373);
        methods.subloop_register_instance_method(LINK_WORD, MODIFIED_DEPENDENT_MEANING_P, LINK_WORD_MODIFIED_DEPENDENT_MEANING_P_METHOD);
        methods.methods_incorporate_instance_method(TREE_KEYWORD_EQ_CLASSES, LINK_WORD, $list121, NIL, $list378);
        methods.subloop_register_instance_method(LINK_WORD, TREE_KEYWORD_EQ_CLASSES, LINK_WORD_TREE_KEYWORD_EQ_CLASSES_METHOD);
        methods.methods_incorporate_instance_method(FRAME_FILTER_LEXES, LINK_WORD, $list121, NIL, $list382);
        methods.subloop_register_instance_method(LINK_WORD, FRAME_FILTER_LEXES, LINK_WORD_FRAME_FILTER_LEXES_METHOD);
        methods.methods_incorporate_instance_method(PP_COMP_FILTER_LEXES, LINK_WORD, $list121, NIL, $list387);
        methods.subloop_register_instance_method(LINK_WORD, PP_COMP_FILTER_LEXES, LINK_WORD_PP_COMP_FILTER_LEXES_METHOD);
        methods.methods_incorporate_instance_method(POS_FILTER_LEXES, LINK_WORD, $list121, NIL, $list396);
        methods.subloop_register_instance_method(LINK_WORD, POS_FILTER_LEXES, LINK_WORD_POS_FILTER_LEXES_METHOD);
        methods.methods_incorporate_instance_method(CYCLIFY_NUCLEUS, LINK_WORD, $list121, $list402, $list403);
        methods.subloop_register_instance_method(LINK_WORD, CYCLIFY_NUCLEUS, LINK_WORD_CYCLIFY_NUCLEUS_METHOD);
        methods.methods_incorporate_instance_method(CYCLIFY_INT, LINK_WORD, $list121, NIL, $list406);
        methods.subloop_register_instance_method(LINK_WORD, CYCLIFY_INT, LINK_WORD_CYCLIFY_INT_METHOD);
        methods.methods_incorporate_instance_method(GET_OBLIQUE_OBJECT, LINK_WORD, $list113, NIL, $list408);
        methods.subloop_register_instance_method(LINK_WORD, GET_OBLIQUE_OBJECT, LINK_WORD_GET_OBLIQUE_OBJECT_METHOD);
        methods.methods_incorporate_instance_method(GET_PP_COMPLEMENT, LINK_WORD, $list113, NIL, $list410);
        methods.subloop_register_instance_method(LINK_WORD, GET_PP_COMPLEMENT, LINK_WORD_GET_PP_COMPLEMENT_METHOD);
        methods.methods_incorporate_instance_method(PARTITION_SEMANTIC_COMPLEMENTS, LINK_WORD, $list121, NIL, $list416);
        methods.subloop_register_instance_method(LINK_WORD, PARTITION_SEMANTIC_COMPLEMENTS, LINK_WORD_PARTITION_SEMANTIC_COMPLEMENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_SEMANTIC_COMPLEMENTS, LINK_WORD, $list113, NIL, $list418);
        methods.subloop_register_instance_method(LINK_WORD, GET_SEMANTIC_COMPLEMENTS, LINK_WORD_GET_SEMANTIC_COMPLEMENTS_METHOD);
        classes.subloop_note_class_initialization_function(LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_link_word_class(LINK_WORD);
        methods.methods_incorporate_instance_method(PRINT, LINK_WORD, $list121, $list122, $list422);
        methods.subloop_register_instance_method(LINK_WORD, PRINT, LINK_WORD_PRINT_METHOD);
        memoization_state.note_globally_cached_function(SPLIT_LINK_WORD);
        methods.methods_incorporate_instance_method(GET_STRING, LINK_WORD, $list113, NIL, $list431);
        methods.subloop_register_instance_method(LINK_WORD, GET_STRING, LINK_WORD_GET_STRING_METHOD);
        methods.methods_incorporate_instance_method(GET_POS, LINK_WORD, $list113, NIL, $list435);
        methods.subloop_register_instance_method(LINK_WORD, GET_POS, LINK_WORD_GET_POS_METHOD);
        methods.methods_incorporate_instance_method(GET_ABS_INDEX, LINK_WORD, $list113, NIL, $list438);
        methods.subloop_register_instance_method(LINK_WORD, GET_ABS_INDEX, LINK_WORD_GET_ABS_INDEX_METHOD);
        methods.methods_incorporate_instance_method(GET_REFS, LINK_WORD, $list113, NIL, $list441);
        methods.subloop_register_instance_method(LINK_WORD, GET_REFS, LINK_WORD_GET_REFS_METHOD);
        methods.methods_incorporate_instance_method(GET_LINKAGE, LINK_WORD, $list113, NIL, $list444);
        methods.subloop_register_instance_method(LINK_WORD, GET_LINKAGE, LINK_WORD_GET_LINKAGE_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTEXT, LINK_WORD, $list113, NIL, $list447);
        methods.subloop_register_instance_method(LINK_WORD, GET_CONTEXT, LINK_WORD_GET_CONTEXT_METHOD);
        methods.methods_incorporate_instance_method(GET_HEAD, LINK_WORD, $list113, NIL, $list450);
        methods.subloop_register_instance_method(LINK_WORD, GET_HEAD, LINK_WORD_GET_HEAD_METHOD);
        methods.methods_incorporate_instance_method(GET_HEADS, LINK_WORD, $list113, NIL, $list452);
        methods.subloop_register_instance_method(LINK_WORD, GET_HEADS, LINK_WORD_GET_HEADS_METHOD);
        methods.methods_incorporate_instance_method(GET_SEMANTIC_HEADS, LINK_WORD, $list113, NIL, $list454);
        methods.subloop_register_instance_method(LINK_WORD, GET_SEMANTIC_HEADS, LINK_WORD_GET_SEMANTIC_HEADS_METHOD);
        methods.methods_incorporate_instance_method(GET_COMPLEMENTS, LINK_WORD, $list113, NIL, $list456);
        methods.subloop_register_instance_method(LINK_WORD, GET_COMPLEMENTS, LINK_WORD_GET_COMPLEMENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_RANKED_LEXES, LINK_WORD, $list113, NIL, $list458);
        methods.subloop_register_instance_method(LINK_WORD, GET_RANKED_LEXES, LINK_WORD_GET_RANKED_LEXES_METHOD);
        methods.methods_incorporate_instance_method(GET_LEXES, LINK_WORD, $list113, NIL, $list462);
        methods.subloop_register_instance_method(LINK_WORD, GET_LEXES, LINK_WORD_GET_LEXES_METHOD);
        methods.methods_incorporate_instance_method(GET_PPS, LINK_WORD, $list121, NIL, $list464);
        methods.subloop_register_instance_method(LINK_WORD, GET_PPS, LINK_WORD_GET_PPS_METHOD);
        methods.methods_incorporate_instance_method(LEXIFY, LINK_WORD, $list467, $list468, $list469);
        methods.subloop_register_instance_method(LINK_WORD, LEXIFY, LINK_WORD_LEXIFY_METHOD);
        methods.methods_incorporate_instance_method(GET_LEFT_LINKS, LINK_WORD, $list121, $list481, $list482);
        methods.subloop_register_instance_method(LINK_WORD, GET_LEFT_LINKS, LINK_WORD_GET_LEFT_LINKS_METHOD);
        methods.methods_incorporate_instance_method(GET_RIGHT_LINKS, LINK_WORD, $list121, $list481, $list486);
        methods.subloop_register_instance_method(LINK_WORD, GET_RIGHT_LINKS, LINK_WORD_GET_RIGHT_LINKS_METHOD);
        methods.methods_incorporate_instance_method(GET_LINKS, LINK_WORD, $list121, $list481, $list490);
        methods.subloop_register_instance_method(LINK_WORD, GET_LINKS, LINK_WORD_GET_LINKS_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECTLY_RELATED, LINK_WORD, $list121, $list492, $list493);
        methods.subloop_register_instance_method(LINK_WORD, GET_DIRECTLY_RELATED, LINK_WORD_GET_DIRECTLY_RELATED_METHOD);
        methods.methods_incorporate_instance_method(GET_RELATED, LINK_WORD, $list121, $list496, $list497);
        methods.subloop_register_instance_method(LINK_WORD, GET_RELATED, LINK_WORD_GET_RELATED_METHOD);
        classes.subloop_new_class(VERB_LINK_WORD, LINK_WORD, $list500, NIL, $list501);
        classes.class_set_implements_slot_listeners(VERB_LINK_WORD, NIL);
        methods.methods_incorporate_instance_method(GET_KEYWORD_RENAMINGS, VERB_LINK_WORD, $list121, $list502, $list503);
        methods.subloop_register_instance_method(VERB_LINK_WORD, GET_KEYWORD_RENAMINGS, VERB_LINK_WORD_GET_KEYWORD_RENAMINGS_METHOD);
        methods.methods_incorporate_instance_method(PARTITION_SEMANTIC_COMPLEMENTS, VERB_LINK_WORD, $list121, NIL, $list515);
        methods.subloop_register_instance_method(VERB_LINK_WORD, PARTITION_SEMANTIC_COMPLEMENTS, VERB_LINK_WORD_PARTITION_SEMANTIC_COMPLEMENTS_METHOD);
        classes.subloop_note_class_initialization_function(VERB_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_VERB_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(VERB_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_VERB_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_verb_link_word_class(VERB_LINK_WORD);
        methods.methods_incorporate_instance_method(GET_SUBJECT, VERB_LINK_WORD, $list113, NIL, $list519);
        methods.subloop_register_instance_method(VERB_LINK_WORD, GET_SUBJECT, VERB_LINK_WORD_GET_SUBJECT_METHOD);
        methods.methods_incorporate_instance_method(GET_SEMANTIC_SUBJECT, VERB_LINK_WORD, $list113, NIL, $list521);
        methods.subloop_register_instance_method(VERB_LINK_WORD, GET_SEMANTIC_SUBJECT, VERB_LINK_WORD_GET_SEMANTIC_SUBJECT_METHOD);
        methods.methods_incorporate_instance_method(GET_OBJECTS, VERB_LINK_WORD, $list113, NIL, $list524);
        methods.subloop_register_instance_method(VERB_LINK_WORD, GET_OBJECTS, VERB_LINK_WORD_GET_OBJECTS_METHOD);
        methods.methods_incorporate_instance_method(GET_SEMANTIC_DIRECT_OBJECT, VERB_LINK_WORD, $list113, NIL, $list528);
        methods.subloop_register_instance_method(VERB_LINK_WORD, GET_SEMANTIC_DIRECT_OBJECT, VERB_LINK_WORD_GET_SEMANTIC_DIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method(GET_SEMANTIC_INDIRECT_OBJECT, VERB_LINK_WORD, $list113, NIL, $list530);
        methods.subloop_register_instance_method(VERB_LINK_WORD, GET_SEMANTIC_INDIRECT_OBJECT, VERB_LINK_WORD_GET_SEMANTIC_INDIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method(GET_SEMANTIC_OBJECTS, VERB_LINK_WORD, $list113, NIL, $list533);
        methods.subloop_register_instance_method(VERB_LINK_WORD, GET_SEMANTIC_OBJECTS, VERB_LINK_WORD_GET_SEMANTIC_OBJECTS_METHOD);
        methods.methods_incorporate_instance_method(GET_VERBAL_COMPLEMENT, VERB_LINK_WORD, $list113, NIL, $list535);
        methods.subloop_register_instance_method(VERB_LINK_WORD, GET_VERBAL_COMPLEMENT, VERB_LINK_WORD_GET_VERBAL_COMPLEMENT_METHOD);
        methods.methods_incorporate_instance_method(GET_ADJECTIVAL_COMPLEMENT, VERB_LINK_WORD, $list113, NIL, $list538);
        methods.subloop_register_instance_method(VERB_LINK_WORD, GET_ADJECTIVAL_COMPLEMENT, VERB_LINK_WORD_GET_ADJECTIVAL_COMPLEMENT_METHOD);
        methods.methods_incorporate_instance_method(GET_PPS, VERB_LINK_WORD, $list121, NIL, $list541);
        methods.subloop_register_instance_method(VERB_LINK_WORD, GET_PPS, VERB_LINK_WORD_GET_PPS_METHOD);
        methods.methods_incorporate_instance_method(GET_INFINITIVE_MARKER, VERB_LINK_WORD, $list121, NIL, $list545);
        methods.subloop_register_instance_method(VERB_LINK_WORD, GET_INFINITIVE_MARKER, VERB_LINK_WORD_GET_INFINITIVE_MARKER_METHOD);
        methods.methods_incorporate_instance_method(INFINITIVE_P, VERB_LINK_WORD, $list121, NIL, $list549);
        methods.subloop_register_instance_method(VERB_LINK_WORD, INFINITIVE_P, VERB_LINK_WORD_INFINITIVE_P_METHOD);
        methods.methods_incorporate_instance_method(BASE_P, VERB_LINK_WORD, $list121, NIL, $list552);
        methods.subloop_register_instance_method(VERB_LINK_WORD, BASE_P, VERB_LINK_WORD_BASE_P_METHOD);
        classes.subloop_new_class(MAIN_VERB_LINK_WORD, VERB_LINK_WORD, $list555, NIL, $list556);
        classes.class_set_implements_slot_listeners(MAIN_VERB_LINK_WORD, NIL);
        methods.methods_incorporate_instance_method(GET_CONTROLLER, MAIN_VERB_LINK_WORD, $list121, NIL, $list558);
        methods.subloop_register_instance_method(MAIN_VERB_LINK_WORD, GET_CONTROLLER, MAIN_VERB_LINK_WORD_GET_CONTROLLER_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTROL_VERB, MAIN_VERB_LINK_WORD, $list121, NIL, $list563);
        methods.subloop_register_instance_method(MAIN_VERB_LINK_WORD, GET_CONTROL_VERB, MAIN_VERB_LINK_WORD_GET_CONTROL_VERB_METHOD);
        methods.methods_incorporate_instance_method(CONTROL_VERB_P, MAIN_VERB_LINK_WORD, $list121, NIL, $list567);
        methods.subloop_register_instance_method(MAIN_VERB_LINK_WORD, CONTROL_VERB_P, MAIN_VERB_LINK_WORD_CONTROL_VERB_P_METHOD);
        methods.methods_incorporate_instance_method(OBJECT_CONTROLLER_P, MAIN_VERB_LINK_WORD, $list121, NIL, $list569);
        methods.subloop_register_instance_method(MAIN_VERB_LINK_WORD, OBJECT_CONTROLLER_P, MAIN_VERB_LINK_WORD_OBJECT_CONTROLLER_P_METHOD);
        methods.methods_incorporate_instance_method(SUBJECT_CONTROLLER_P, MAIN_VERB_LINK_WORD, $list121, NIL, $list572);
        methods.subloop_register_instance_method(MAIN_VERB_LINK_WORD, SUBJECT_CONTROLLER_P, MAIN_VERB_LINK_WORD_SUBJECT_CONTROLLER_P_METHOD);
        methods.methods_incorporate_instance_method(GET_MATRIX_CLAUSE, MAIN_VERB_LINK_WORD, $list121, NIL, $list575);
        methods.subloop_register_instance_method(MAIN_VERB_LINK_WORD, GET_MATRIX_CLAUSE, MAIN_VERB_LINK_WORD_GET_MATRIX_CLAUSE_METHOD);
        methods.methods_incorporate_instance_method(PARTITION_SEMANTIC_COMPLEMENTS, MAIN_VERB_LINK_WORD, $list121, NIL, $list515);
        methods.subloop_register_instance_method(MAIN_VERB_LINK_WORD, PARTITION_SEMANTIC_COMPLEMENTS, MAIN_VERB_LINK_WORD_PARTITION_SEMANTIC_COMPLEMENTS_METHOD);
        methods.methods_incorporate_instance_method(PARTICLE_FILTER_LEXES, MAIN_VERB_LINK_WORD, $list121, NIL, $list578);
        methods.subloop_register_instance_method(MAIN_VERB_LINK_WORD, PARTICLE_FILTER_LEXES, MAIN_VERB_LINK_WORD_PARTICLE_FILTER_LEXES_METHOD);
        methods.methods_incorporate_instance_method(GET_KEYWORD_RENAMINGS, MAIN_VERB_LINK_WORD, $list121, $list502, $list503);
        methods.subloop_register_instance_method(MAIN_VERB_LINK_WORD, GET_KEYWORD_RENAMINGS, MAIN_VERB_LINK_WORD_GET_KEYWORD_RENAMINGS_METHOD);
        methods.methods_incorporate_instance_method(CYCLIFY_INT, MAIN_VERB_LINK_WORD, $list121, NIL, $list406);
        methods.subloop_register_instance_method(MAIN_VERB_LINK_WORD, CYCLIFY_INT, MAIN_VERB_LINK_WORD_CYCLIFY_INT_METHOD);
        classes.subloop_note_class_initialization_function(MAIN_VERB_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_MAIN_VERB_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(MAIN_VERB_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_MAIN_VERB_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_main_verb_link_word_class(MAIN_VERB_LINK_WORD);
        methods.methods_incorporate_instance_method(PASSIVE_P, MAIN_VERB_LINK_WORD, $list113, NIL, $list589);
        methods.subloop_register_instance_method(MAIN_VERB_LINK_WORD, PASSIVE_P, MAIN_VERB_LINK_WORD_PASSIVE_P_METHOD);
        methods.methods_incorporate_instance_method(GET_SUBJECT, MAIN_VERB_LINK_WORD, $list113, NIL, $list592);
        methods.subloop_register_instance_method(MAIN_VERB_LINK_WORD, GET_SUBJECT, MAIN_VERB_LINK_WORD_GET_SUBJECT_METHOD);
        methods.methods_incorporate_instance_method(GET_SEMANTIC_SUBJECT, MAIN_VERB_LINK_WORD, $list113, NIL, $list596);
        methods.subloop_register_instance_method(MAIN_VERB_LINK_WORD, GET_SEMANTIC_SUBJECT, MAIN_VERB_LINK_WORD_GET_SEMANTIC_SUBJECT_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECT_OBJECT, MAIN_VERB_LINK_WORD, $list113, NIL, $list599);
        methods.subloop_register_instance_method(MAIN_VERB_LINK_WORD, GET_DIRECT_OBJECT, MAIN_VERB_LINK_WORD_GET_DIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method(GET_SEMANTIC_DIRECT_OBJECT, MAIN_VERB_LINK_WORD, $list113, NIL, $list604);
        methods.subloop_register_instance_method(MAIN_VERB_LINK_WORD, GET_SEMANTIC_DIRECT_OBJECT, MAIN_VERB_LINK_WORD_GET_SEMANTIC_DIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method(GET_INDIRECT_OBJECT, MAIN_VERB_LINK_WORD, $list113, NIL, $list607);
        methods.subloop_register_instance_method(MAIN_VERB_LINK_WORD, GET_INDIRECT_OBJECT, MAIN_VERB_LINK_WORD_GET_INDIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method(GET_SEMANTIC_INDIRECT_OBJECT, MAIN_VERB_LINK_WORD, $list113, NIL, $list609);
        methods.subloop_register_instance_method(MAIN_VERB_LINK_WORD, GET_SEMANTIC_INDIRECT_OBJECT, MAIN_VERB_LINK_WORD_GET_SEMANTIC_INDIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method(GET_VERBAL_COMPLEMENT, MAIN_VERB_LINK_WORD, $list113, NIL, $list612);
        methods.subloop_register_instance_method(MAIN_VERB_LINK_WORD, GET_VERBAL_COMPLEMENT, MAIN_VERB_LINK_WORD_GET_VERBAL_COMPLEMENT_METHOD);
        methods.methods_incorporate_instance_method(GET_COMPLEMENTS, MAIN_VERB_LINK_WORD, $list113, NIL, $list617);
        methods.subloop_register_instance_method(MAIN_VERB_LINK_WORD, GET_COMPLEMENTS, MAIN_VERB_LINK_WORD_GET_COMPLEMENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_AUX_VERB, MAIN_VERB_LINK_WORD, $list113, NIL, $list619);
        methods.subloop_register_instance_method(MAIN_VERB_LINK_WORD, GET_AUX_VERB, MAIN_VERB_LINK_WORD_GET_AUX_VERB_METHOD);
        methods.methods_incorporate_instance_method(GET_PARTICLE, MAIN_VERB_LINK_WORD, $list113, NIL, $list622);
        methods.subloop_register_instance_method(MAIN_VERB_LINK_WORD, GET_PARTICLE, MAIN_VERB_LINK_WORD_GET_PARTICLE_METHOD);
        methods.methods_incorporate_instance_method(GET_MODIFIEDS, MAIN_VERB_LINK_WORD, $list113, NIL, $list625);
        methods.subloop_register_instance_method(MAIN_VERB_LINK_WORD, GET_MODIFIEDS, MAIN_VERB_LINK_WORD_GET_MODIFIEDS_METHOD);
        classes.subloop_new_class(AUX_VERB_LINK_WORD, VERB_LINK_WORD, $list630, NIL, $list631);
        classes.class_set_implements_slot_listeners(AUX_VERB_LINK_WORD, NIL);
        methods.methods_incorporate_instance_method(COPULA_P, AUX_VERB_LINK_WORD, $list113, NIL, $list633);
        methods.subloop_register_instance_method(AUX_VERB_LINK_WORD, COPULA_P, AUX_VERB_LINK_WORD_COPULA_P_METHOD);
        methods.methods_incorporate_instance_method(GET_KEYWORD_RENAMINGS, AUX_VERB_LINK_WORD, $list121, $list635, $list636);
        methods.subloop_register_instance_method(AUX_VERB_LINK_WORD, GET_KEYWORD_RENAMINGS, AUX_VERB_LINK_WORD_GET_KEYWORD_RENAMINGS_METHOD);
        methods.methods_incorporate_instance_method(GET_SEMANTIC_HEADS, AUX_VERB_LINK_WORD, $list113, NIL, $list640);
        methods.subloop_register_instance_method(AUX_VERB_LINK_WORD, GET_SEMANTIC_HEADS, AUX_VERB_LINK_WORD_GET_SEMANTIC_HEADS_METHOD);
        methods.methods_incorporate_instance_method(GET_TENSE, AUX_VERB_LINK_WORD, $list113, NIL, $list643);
        methods.subloop_register_instance_method(AUX_VERB_LINK_WORD, GET_TENSE, AUX_VERB_LINK_WORD_GET_TENSE_METHOD);
        methods.methods_incorporate_instance_method(GET_SEMANTIC_COMPLEMENTS, AUX_VERB_LINK_WORD, $list121, NIL, $list651);
        methods.subloop_register_instance_method(AUX_VERB_LINK_WORD, GET_SEMANTIC_COMPLEMENTS, AUX_VERB_LINK_WORD_GET_SEMANTIC_COMPLEMENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_COMPLEMENTS, AUX_VERB_LINK_WORD, $list121, NIL, $list653);
        methods.subloop_register_instance_method(AUX_VERB_LINK_WORD, GET_COMPLEMENTS, AUX_VERB_LINK_WORD_GET_COMPLEMENTS_METHOD);
        classes.subloop_note_class_initialization_function(AUX_VERB_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_AUX_VERB_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(AUX_VERB_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_AUX_VERB_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_aux_verb_link_word_class(AUX_VERB_LINK_WORD);
        methods.methods_incorporate_instance_method(GET_SUBJECT, AUX_VERB_LINK_WORD, $list113, NIL, $list659);
        methods.subloop_register_instance_method(AUX_VERB_LINK_WORD, GET_SUBJECT, AUX_VERB_LINK_WORD_GET_SUBJECT_METHOD);
        methods.methods_incorporate_instance_method(GET_VERBAL_COMPLEMENT, AUX_VERB_LINK_WORD, $list113, NIL, $list661);
        methods.subloop_register_instance_method(AUX_VERB_LINK_WORD, GET_VERBAL_COMPLEMENT, AUX_VERB_LINK_WORD_GET_VERBAL_COMPLEMENT_METHOD);
        methods.methods_incorporate_instance_method(GET_ADJECTIVAL_COMPLEMENT, AUX_VERB_LINK_WORD, $list113, NIL, $list664);
        methods.subloop_register_instance_method(AUX_VERB_LINK_WORD, GET_ADJECTIVAL_COMPLEMENT, AUX_VERB_LINK_WORD_GET_ADJECTIVAL_COMPLEMENT_METHOD);
        methods.methods_incorporate_instance_method(GET_ADVERBIAL_COMPLEMENT, AUX_VERB_LINK_WORD, $list113, NIL, $list666);
        methods.subloop_register_instance_method(AUX_VERB_LINK_WORD, GET_ADVERBIAL_COMPLEMENT, AUX_VERB_LINK_WORD_GET_ADVERBIAL_COMPLEMENT_METHOD);
        methods.methods_incorporate_instance_method(GET_PREPOSITIONAL_COMPLEMENT, AUX_VERB_LINK_WORD, $list113, NIL, $list669);
        methods.subloop_register_instance_method(AUX_VERB_LINK_WORD, GET_PREPOSITIONAL_COMPLEMENT, AUX_VERB_LINK_WORD_GET_PREPOSITIONAL_COMPLEMENT_METHOD);
        methods.methods_incorporate_instance_method(EQUALITY_P, AUX_VERB_LINK_WORD, $list113, NIL, $list673);
        methods.subloop_register_instance_method(AUX_VERB_LINK_WORD, EQUALITY_P, AUX_VERB_LINK_WORD_EQUALITY_P_METHOD);
        methods.methods_incorporate_instance_method(PASSIVE_P, AUX_VERB_LINK_WORD, $list113, NIL, $list675);
        methods.subloop_register_instance_method(AUX_VERB_LINK_WORD, PASSIVE_P, AUX_VERB_LINK_WORD_PASSIVE_P_METHOD);
        methods.methods_incorporate_instance_method(GET_SEMANTIC_SUBJECT, AUX_VERB_LINK_WORD, $list113, NIL, $list677);
        methods.subloop_register_instance_method(AUX_VERB_LINK_WORD, GET_SEMANTIC_SUBJECT, AUX_VERB_LINK_WORD_GET_SEMANTIC_SUBJECT_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECT_OBJECT, AUX_VERB_LINK_WORD, $list113, NIL, $list679);
        methods.subloop_register_instance_method(AUX_VERB_LINK_WORD, GET_DIRECT_OBJECT, AUX_VERB_LINK_WORD_GET_DIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method(GET_SEMANTIC_DIRECT_OBJECT, AUX_VERB_LINK_WORD, $list113, NIL, $list681);
        methods.subloop_register_instance_method(AUX_VERB_LINK_WORD, GET_SEMANTIC_DIRECT_OBJECT, AUX_VERB_LINK_WORD_GET_SEMANTIC_DIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method(GET_INDIRECT_OBJECT, AUX_VERB_LINK_WORD, $list113, NIL, $list683);
        methods.subloop_register_instance_method(AUX_VERB_LINK_WORD, GET_INDIRECT_OBJECT, AUX_VERB_LINK_WORD_GET_INDIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method(GET_SEMANTIC_INDIRECT_OBJECT, AUX_VERB_LINK_WORD, $list113, NIL, $list685);
        methods.subloop_register_instance_method(AUX_VERB_LINK_WORD, GET_SEMANTIC_INDIRECT_OBJECT, AUX_VERB_LINK_WORD_GET_SEMANTIC_INDIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method(GET_OBLIQUE_OBJECT, AUX_VERB_LINK_WORD, $list113, NIL, $list687);
        methods.subloop_register_instance_method(AUX_VERB_LINK_WORD, GET_OBLIQUE_OBJECT, AUX_VERB_LINK_WORD_GET_OBLIQUE_OBJECT_METHOD);
        classes.subloop_new_class(MODAL_LINK_WORD, AUX_VERB_LINK_WORD, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(MODAL_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(MODAL_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_MODAL_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(MODAL_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_MODAL_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_modal_link_word_class(MODAL_LINK_WORD);
        classes.subloop_new_class(PARTICIPLE_LINK_WORD, VERB_LINK_WORD, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(PARTICIPLE_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(PARTICIPLE_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_PARTICIPLE_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(PARTICIPLE_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_PARTICIPLE_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_participle_link_word_class(PARTICIPLE_LINK_WORD);
        classes.subloop_new_class(NOUN_LINK_WORD, LINK_WORD, $list696, NIL, $list697);
        classes.class_set_implements_slot_listeners(NOUN_LINK_WORD, NIL);
        methods.methods_incorporate_instance_method(DEFINITE_DESCRIPTION_P, NOUN_LINK_WORD, $list113, NIL, $list698);
        methods.subloop_register_instance_method(NOUN_LINK_WORD, DEFINITE_DESCRIPTION_P, NOUN_LINK_WORD_DEFINITE_DESCRIPTION_P_METHOD);
        methods.methods_incorporate_instance_method(CYCLIFY_NUCLEUS, NOUN_LINK_WORD, $list121, $list705, $list706);
        methods.subloop_register_instance_method(NOUN_LINK_WORD, CYCLIFY_NUCLEUS, NOUN_LINK_WORD_CYCLIFY_NUCLEUS_METHOD);
        methods.methods_incorporate_instance_method(CYCLIFY_INT, NOUN_LINK_WORD, $list121, NIL, $list709);
        methods.subloop_register_instance_method(NOUN_LINK_WORD, CYCLIFY_INT, NOUN_LINK_WORD_CYCLIFY_INT_METHOD);
        methods.methods_incorporate_instance_method(GET_KEYWORD_RENAMINGS, NOUN_LINK_WORD, $list121, $list712, $list713);
        methods.subloop_register_instance_method(NOUN_LINK_WORD, GET_KEYWORD_RENAMINGS, NOUN_LINK_WORD_GET_KEYWORD_RENAMINGS_METHOD);
        methods.methods_incorporate_instance_method(RELATIONAL_NOUN_P, NOUN_LINK_WORD, $list113, NIL, $list724);
        methods.subloop_register_instance_method(NOUN_LINK_WORD, RELATIONAL_NOUN_P, NOUN_LINK_WORD_RELATIONAL_NOUN_P_METHOD);
        methods.methods_incorporate_instance_method(GET_QUANTIFIER, NOUN_LINK_WORD, $list113, NIL, $list726);
        methods.subloop_register_instance_method(NOUN_LINK_WORD, GET_QUANTIFIER, NOUN_LINK_WORD_GET_QUANTIFIER_METHOD);
        classes.subloop_note_class_initialization_function(NOUN_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_NOUN_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(NOUN_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_NOUN_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_noun_link_word_class(NOUN_LINK_WORD);
        methods.methods_incorporate_instance_method(GET_COMPLEMENTS, NOUN_LINK_WORD, $list113, NIL, $list732);
        methods.subloop_register_instance_method(NOUN_LINK_WORD, GET_COMPLEMENTS, NOUN_LINK_WORD_GET_COMPLEMENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_MODIFIEDS, NOUN_LINK_WORD, $list113, NIL, $list734);
        methods.subloop_register_instance_method(NOUN_LINK_WORD, GET_MODIFIEDS, NOUN_LINK_WORD_GET_MODIFIEDS_METHOD);
        methods.methods_incorporate_instance_method(GET_DETERMINER, NOUN_LINK_WORD, $list113, NIL, $list739);
        methods.subloop_register_instance_method(NOUN_LINK_WORD, GET_DETERMINER, NOUN_LINK_WORD_GET_DETERMINER_METHOD);
        methods.methods_incorporate_instance_method(GET_CARDINAL, NOUN_LINK_WORD, $list113, NIL, $list744);
        methods.subloop_register_instance_method(NOUN_LINK_WORD, GET_CARDINAL, NOUN_LINK_WORD_GET_CARDINAL_METHOD);
        methods.methods_incorporate_instance_method(GET_OVERT_QUANTIFIER, NOUN_LINK_WORD, $list113, NIL, $list747);
        methods.subloop_register_instance_method(NOUN_LINK_WORD, GET_OVERT_QUANTIFIER, NOUN_LINK_WORD_GET_OVERT_QUANTIFIER_METHOD);
        methods.methods_incorporate_instance_method(GET_POSSESSOR, NOUN_LINK_WORD, $list113, NIL, $list749);
        methods.subloop_register_instance_method(NOUN_LINK_WORD, GET_POSSESSOR, NOUN_LINK_WORD_GET_POSSESSOR_METHOD);
        methods.methods_incorporate_instance_method(GET_SPECIFIER, NOUN_LINK_WORD, $list113, NIL, $list753);
        methods.subloop_register_instance_method(NOUN_LINK_WORD, GET_SPECIFIER, NOUN_LINK_WORD_GET_SPECIFIER_METHOD);
        methods.methods_incorporate_instance_method(GET_PPS, NOUN_LINK_WORD, $list121, NIL, $list755);
        methods.subloop_register_instance_method(NOUN_LINK_WORD, GET_PPS, NOUN_LINK_WORD_GET_PPS_METHOD);
        methods.methods_incorporate_instance_method(GET_EXISTENTIAL_NULL_DETERMINER, NOUN_LINK_WORD, $list121, NIL, $list758);
        methods.subloop_register_instance_method(NOUN_LINK_WORD, GET_EXISTENTIAL_NULL_DETERMINER, NOUN_LINK_WORD_GET_EXISTENTIAL_NULL_DETERMINER_METHOD);
        methods.methods_incorporate_instance_method(SINGULAR_P, NOUN_LINK_WORD, $list113, NIL, $list770);
        methods.subloop_register_instance_method(NOUN_LINK_WORD, SINGULAR_P, NOUN_LINK_WORD_SINGULAR_P_METHOD);
        methods.methods_incorporate_instance_method(PLURAL_P, NOUN_LINK_WORD, $list113, NIL, $list773);
        methods.subloop_register_instance_method(NOUN_LINK_WORD, PLURAL_P, NOUN_LINK_WORD_PLURAL_P_METHOD);
        methods.methods_incorporate_instance_method(APPOSITIVE_P, NOUN_LINK_WORD, $list113, NIL, $list776);
        methods.subloop_register_instance_method(NOUN_LINK_WORD, APPOSITIVE_P, NOUN_LINK_WORD_APPOSITIVE_P_METHOD);
        classes.subloop_new_class(COMMON_NOUN_LINK_WORD, NOUN_LINK_WORD, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(COMMON_NOUN_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(COMMON_NOUN_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_COMMON_NOUN_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(COMMON_NOUN_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_COMMON_NOUN_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_common_noun_link_word_class(COMMON_NOUN_LINK_WORD);
        classes.subloop_new_class(PROPER_NOUN_LINK_WORD, NOUN_LINK_WORD, $list782, NIL, $list783);
        classes.class_set_implements_slot_listeners(PROPER_NOUN_LINK_WORD, NIL);
        methods.methods_incorporate_instance_method(GET_QUANTIFIER, PROPER_NOUN_LINK_WORD, $list113, NIL, $list784);
        methods.subloop_register_instance_method(PROPER_NOUN_LINK_WORD, GET_QUANTIFIER, PROPER_NOUN_LINK_WORD_GET_QUANTIFIER_METHOD);
        classes.subloop_note_class_initialization_function(PROPER_NOUN_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_PROPER_NOUN_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(PROPER_NOUN_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_PROPER_NOUN_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_proper_noun_link_word_class(PROPER_NOUN_LINK_WORD);
        classes.subloop_new_class(GERUND_LINK_WORD, NOUN_LINK_WORD, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(GERUND_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(GERUND_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_GERUND_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(GERUND_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_GERUND_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_gerund_link_word_class(GERUND_LINK_WORD);
        classes.subloop_new_class(PRONOUN_LINK_WORD, NOUN_LINK_WORD, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(PRONOUN_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(PRONOUN_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_PRONOUN_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(PRONOUN_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_PRONOUN_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_pronoun_link_word_class(PRONOUN_LINK_WORD);
        classes.subloop_new_class(W_PRONOUN_LINK_WORD, PRONOUN_LINK_WORD, NIL, NIL, $list795);
        classes.class_set_implements_slot_listeners(W_PRONOUN_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(W_PRONOUN_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_W_PRONOUN_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(W_PRONOUN_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_W_PRONOUN_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_w_pronoun_link_word_class(W_PRONOUN_LINK_WORD);
        methods.methods_incorporate_instance_method(GET_REFS, W_PRONOUN_LINK_WORD, $list113, NIL, $list798);
        methods.subloop_register_instance_method(W_PRONOUN_LINK_WORD, GET_REFS, W_PRONOUN_LINK_WORD_GET_REFS_METHOD);
        methods.methods_incorporate_instance_method(GET_ANTECEDENT, W_PRONOUN_LINK_WORD, $list113, NIL, $list802);
        methods.subloop_register_instance_method(W_PRONOUN_LINK_WORD, GET_ANTECEDENT, W_PRONOUN_LINK_WORD_GET_ANTECEDENT_METHOD);
        methods.methods_incorporate_instance_method(APPOSITIVE_P, W_PRONOUN_LINK_WORD, $list113, NIL, $list804);
        methods.subloop_register_instance_method(W_PRONOUN_LINK_WORD, APPOSITIVE_P, W_PRONOUN_LINK_WORD_APPOSITIVE_P_METHOD);
        methods.methods_incorporate_instance_method(GET_QUANTIFIER, W_PRONOUN_LINK_WORD, $list113, NIL, $list806);
        methods.subloop_register_instance_method(W_PRONOUN_LINK_WORD, GET_QUANTIFIER, W_PRONOUN_LINK_WORD_GET_QUANTIFIER_METHOD);
        methods.methods_incorporate_instance_method(GET_MODIFIEDS, W_PRONOUN_LINK_WORD, $list121, NIL, $list808);
        methods.subloop_register_instance_method(W_PRONOUN_LINK_WORD, GET_MODIFIEDS, W_PRONOUN_LINK_WORD_GET_MODIFIEDS_METHOD);
        classes.subloop_new_class(REL_PRONOUN_LINK_WORD, W_PRONOUN_LINK_WORD, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(REL_PRONOUN_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(REL_PRONOUN_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_REL_PRONOUN_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(REL_PRONOUN_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_REL_PRONOUN_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_rel_pronoun_link_word_class(REL_PRONOUN_LINK_WORD);
        classes.subloop_new_class(PERSONAL_PRONOUN_LINK_WORD, PRONOUN_LINK_WORD, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(PERSONAL_PRONOUN_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(PERSONAL_PRONOUN_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_PERSONAL_PRONOUN_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(PERSONAL_PRONOUN_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_PERSONAL_PRONOUN_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_personal_pronoun_link_word_class(PERSONAL_PRONOUN_LINK_WORD);
        classes.subloop_new_class(ADJECTIVE_LINK_WORD, LINK_WORD, $list818, NIL, $list819);
        classes.class_set_implements_slot_listeners(ADJECTIVE_LINK_WORD, NIL);
        methods.methods_incorporate_instance_method(GET_KEYWORD_RENAMINGS, ADJECTIVE_LINK_WORD, $list121, $list820, $list821);
        methods.subloop_register_instance_method(ADJECTIVE_LINK_WORD, GET_KEYWORD_RENAMINGS, ADJECTIVE_LINK_WORD_GET_KEYWORD_RENAMINGS_METHOD);
        methods.methods_incorporate_instance_method(GET_COMPLEMENTS, ADJECTIVE_LINK_WORD, $list113, NIL, $list824);
        methods.subloop_register_instance_method(ADJECTIVE_LINK_WORD, GET_COMPLEMENTS, ADJECTIVE_LINK_WORD_GET_COMPLEMENTS_METHOD);
        classes.subloop_note_class_initialization_function(ADJECTIVE_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_ADJECTIVE_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(ADJECTIVE_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_ADJECTIVE_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_adjective_link_word_class(ADJECTIVE_LINK_WORD);
        methods.methods_incorporate_instance_method(GET_MODIFIEDS, ADJECTIVE_LINK_WORD, $list113, NIL, $list828);
        methods.subloop_register_instance_method(ADJECTIVE_LINK_WORD, GET_MODIFIEDS, ADJECTIVE_LINK_WORD_GET_MODIFIEDS_METHOD);
        methods.methods_incorporate_instance_method(GET_PPS, ADJECTIVE_LINK_WORD, $list121, NIL, $list831);
        methods.subloop_register_instance_method(ADJECTIVE_LINK_WORD, GET_PPS, ADJECTIVE_LINK_WORD_GET_PPS_METHOD);
        classes.subloop_new_class(ADVERB_LINK_WORD, LINK_WORD, $list834, NIL, $list835);
        classes.class_set_implements_slot_listeners(ADVERB_LINK_WORD, NIL);
        methods.methods_incorporate_instance_method(GET_KEYWORD_RENAMINGS, ADVERB_LINK_WORD, $list121, $list836, $list837);
        methods.subloop_register_instance_method(ADVERB_LINK_WORD, GET_KEYWORD_RENAMINGS, ADVERB_LINK_WORD_GET_KEYWORD_RENAMINGS_METHOD);
        classes.subloop_note_class_initialization_function(ADVERB_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_ADVERB_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(ADVERB_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_ADVERB_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_adverb_link_word_class(ADVERB_LINK_WORD);
        methods.methods_incorporate_instance_method(GET_MODIFIEDS, ADVERB_LINK_WORD, $list113, NIL, $list842);
        methods.subloop_register_instance_method(ADVERB_LINK_WORD, GET_MODIFIEDS, ADVERB_LINK_WORD_GET_MODIFIEDS_METHOD);
        methods.methods_incorporate_instance_method(GET_COMPLEMENTS, ADVERB_LINK_WORD, $list113, NIL, $list846);
        methods.subloop_register_instance_method(ADVERB_LINK_WORD, GET_COMPLEMENTS, ADVERB_LINK_WORD_GET_COMPLEMENTS_METHOD);
        classes.subloop_new_class(W_ADVERB_LINK_WORD, ADVERB_LINK_WORD, NIL, NIL, $list849);
        classes.class_set_implements_slot_listeners(W_ADVERB_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(W_ADVERB_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_W_ADVERB_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(W_ADVERB_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_W_ADVERB_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_w_adverb_link_word_class(W_ADVERB_LINK_WORD);
        methods.methods_incorporate_instance_method(GET_MODIFIEDS, W_ADVERB_LINK_WORD, $list113, NIL, $list852);
        methods.subloop_register_instance_method(W_ADVERB_LINK_WORD, GET_MODIFIEDS, W_ADVERB_LINK_WORD_GET_MODIFIEDS_METHOD);
        classes.subloop_new_class(PREPOSITION_LINK_WORD, LINK_WORD, $list856, NIL, $list857);
        classes.class_set_implements_slot_listeners(PREPOSITION_LINK_WORD, NIL);
        methods.methods_incorporate_instance_method(GET_KEYWORD_RENAMINGS, PREPOSITION_LINK_WORD, $list121, $list858, $list859);
        methods.subloop_register_instance_method(PREPOSITION_LINK_WORD, GET_KEYWORD_RENAMINGS, PREPOSITION_LINK_WORD_GET_KEYWORD_RENAMINGS_METHOD);
        classes.subloop_note_class_initialization_function(PREPOSITION_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_PREPOSITION_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(PREPOSITION_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_PREPOSITION_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_preposition_link_word_class(PREPOSITION_LINK_WORD);
        methods.methods_incorporate_instance_method(GET_OBLIQUE_OBJECT, PREPOSITION_LINK_WORD, $list113, NIL, $list865);
        methods.subloop_register_instance_method(PREPOSITION_LINK_WORD, GET_OBLIQUE_OBJECT, PREPOSITION_LINK_WORD_GET_OBLIQUE_OBJECT_METHOD);
        methods.methods_incorporate_instance_method(GET_VERBAL_COMPLEMENT, PREPOSITION_LINK_WORD, $list113, NIL, $list869);
        methods.subloop_register_instance_method(PREPOSITION_LINK_WORD, GET_VERBAL_COMPLEMENT, PREPOSITION_LINK_WORD_GET_VERBAL_COMPLEMENT_METHOD);
        methods.methods_incorporate_instance_method(GET_MODIFIEDS, PREPOSITION_LINK_WORD, $list113, NIL, $list872);
        methods.subloop_register_instance_method(PREPOSITION_LINK_WORD, GET_MODIFIEDS, PREPOSITION_LINK_WORD_GET_MODIFIEDS_METHOD);
        methods.methods_incorporate_instance_method(GET_COMPLEMENTS, PREPOSITION_LINK_WORD, $list113, NIL, $list878);
        methods.subloop_register_instance_method(PREPOSITION_LINK_WORD, GET_COMPLEMENTS, PREPOSITION_LINK_WORD_GET_COMPLEMENTS_METHOD);
        classes.subloop_new_class(QUANTIFIER_LINK_WORD, LINK_WORD, $list881, NIL, $list882);
        classes.class_set_implements_slot_listeners(QUANTIFIER_LINK_WORD, NIL);
        methods.methods_incorporate_instance_method(GET_KEYWORD_RENAMINGS, QUANTIFIER_LINK_WORD, $list121, $list883, $list884);
        methods.subloop_register_instance_method(QUANTIFIER_LINK_WORD, GET_KEYWORD_RENAMINGS, QUANTIFIER_LINK_WORD_GET_KEYWORD_RENAMINGS_METHOD);
        classes.subloop_note_class_initialization_function(QUANTIFIER_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_QUANTIFIER_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(QUANTIFIER_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_QUANTIFIER_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_quantifier_link_word_class(QUANTIFIER_LINK_WORD);
        methods.methods_incorporate_instance_method(GET_QUANTIFIED, QUANTIFIER_LINK_WORD, $list113, NIL, $list890);
        methods.subloop_register_instance_method(QUANTIFIER_LINK_WORD, GET_QUANTIFIED, QUANTIFIER_LINK_WORD_GET_QUANTIFIED_METHOD);
        classes.subloop_new_class(DETERMINER_LINK_WORD, QUANTIFIER_LINK_WORD, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(DETERMINER_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(DETERMINER_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_DETERMINER_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(DETERMINER_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_DETERMINER_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_determiner_link_word_class(DETERMINER_LINK_WORD);
        classes.subloop_new_class(DEFINITE_DETERMINER_LINK_WORD, DETERMINER_LINK_WORD, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(DEFINITE_DETERMINER_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(DEFINITE_DETERMINER_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_DEFINITE_DETERMINER_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(DEFINITE_DETERMINER_LINK_WORD, $sym897$SUBLOOP_RESERVED_INITIALIZE_DEFINITE_DETERMINER_LINK_WORD_INSTANC);
        subloop_reserved_initialize_definite_determiner_link_word_class(DEFINITE_DETERMINER_LINK_WORD);
        classes.subloop_new_class(W_DETERMINER_LINK_WORD, DETERMINER_LINK_WORD, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(W_DETERMINER_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(W_DETERMINER_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_W_DETERMINER_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(W_DETERMINER_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_W_DETERMINER_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_w_determiner_link_word_class(W_DETERMINER_LINK_WORD);
        classes.subloop_new_class(PREDETERMINER_LINK_WORD, DETERMINER_LINK_WORD, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(PREDETERMINER_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(PREDETERMINER_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_PREDETERMINER_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(PREDETERMINER_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_PREDETERMINER_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_predeterminer_link_word_class(PREDETERMINER_LINK_WORD);
        classes.subloop_new_class(POSSESSIVE_PRONOUN_LINK_WORD, DEFINITE_DETERMINER_LINK_WORD, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(POSSESSIVE_PRONOUN_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(POSSESSIVE_PRONOUN_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_POSSESSIVE_PRONOUN_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(POSSESSIVE_PRONOUN_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_POSSESSIVE_PRONOUN_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_possessive_pronoun_link_word_class(POSSESSIVE_PRONOUN_LINK_WORD);
        classes.subloop_new_class(CARDINAL_LINK_WORD, DETERMINER_LINK_WORD, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(CARDINAL_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(CARDINAL_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_CARDINAL_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(CARDINAL_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_CARDINAL_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_cardinal_link_word_class(CARDINAL_LINK_WORD);
        classes.subloop_new_class(CONJUNCTION_LINK_WORD, LINK_WORD, NIL, NIL, $list911);
        classes.class_set_implements_slot_listeners(CONJUNCTION_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(CONJUNCTION_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_CONJUNCTION_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(CONJUNCTION_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_CONJUNCTION_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_conjunction_link_word_class(CONJUNCTION_LINK_WORD);
        methods.methods_incorporate_instance_method(GET_COMPLEMENTS, CONJUNCTION_LINK_WORD, $list121, NIL, $list914);
        methods.subloop_register_instance_method(CONJUNCTION_LINK_WORD, GET_COMPLEMENTS, CONJUNCTION_LINK_WORD_GET_COMPLEMENTS_METHOD);
        classes.subloop_new_class(EXISTENTIAL_LINK_WORD, LINK_WORD, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(EXISTENTIAL_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(EXISTENTIAL_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_EXISTENTIAL_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(EXISTENTIAL_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_EXISTENTIAL_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_existential_link_word_class(EXISTENTIAL_LINK_WORD);
        classes.subloop_new_class(COMPARATOR_LINK_WORD, LINK_WORD, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(COMPARATOR_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(COMPARATOR_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_COMPARATOR_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(COMPARATOR_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_COMPARATOR_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_comparator_link_word_class(COMPARATOR_LINK_WORD);
        classes.subloop_new_class(INF_MARKER_LINK_WORD, LINK_WORD, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(INF_MARKER_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(INF_MARKER_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_INF_MARKER_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(INF_MARKER_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_INF_MARKER_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_inf_marker_link_word_class(INF_MARKER_LINK_WORD);
        classes.subloop_new_class(PARTICLE_LINK_WORD, LINK_WORD, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(PARTICLE_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(PARTICLE_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_PARTICLE_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(PARTICLE_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_PARTICLE_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_particle_link_word_class(PARTICLE_LINK_WORD);
        classes.subloop_new_class(PUNCTUATION_LINK_WORD, LINK_WORD, $list929, NIL, NIL);
        classes.class_set_implements_slot_listeners(PUNCTUATION_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(PUNCTUATION_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_PUNCTUATION_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(PUNCTUATION_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_PUNCTUATION_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_punctuation_link_word_class(PUNCTUATION_LINK_WORD);
        classes.subloop_new_class(POSS_MARKER_LINK_WORD, LINK_WORD, $list933, NIL, $list934);
        classes.class_set_implements_slot_listeners(POSS_MARKER_LINK_WORD, NIL);
        methods.methods_incorporate_instance_method(GET_KEYWORD_RENAMINGS, POSS_MARKER_LINK_WORD, $list121, $list935, $list936);
        methods.subloop_register_instance_method(POSS_MARKER_LINK_WORD, GET_KEYWORD_RENAMINGS, POSS_MARKER_LINK_WORD_GET_KEYWORD_RENAMINGS_METHOD);
        classes.subloop_note_class_initialization_function(POSS_MARKER_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_POSS_MARKER_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(POSS_MARKER_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_POSS_MARKER_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_poss_marker_link_word_class(POSS_MARKER_LINK_WORD);
        methods.methods_incorporate_instance_method(GET_POSSESSOR, POSS_MARKER_LINK_WORD, $list113, NIL, $list943);
        methods.subloop_register_instance_method(POSS_MARKER_LINK_WORD, GET_POSSESSOR, POSS_MARKER_LINK_WORD_GET_POSSESSOR_METHOD);
        methods.methods_incorporate_instance_method(GET_POSSESSED, POSS_MARKER_LINK_WORD, $list113, NIL, $list946);
        methods.subloop_register_instance_method(POSS_MARKER_LINK_WORD, GET_POSSESSED, POSS_MARKER_LINK_WORD_GET_POSSESSED_METHOD);
        methods.methods_incorporate_instance_method(GET_COMPLEMENTS, POSS_MARKER_LINK_WORD, $list113, NIL, $list948);
        methods.subloop_register_instance_method(POSS_MARKER_LINK_WORD, GET_COMPLEMENTS, POSS_MARKER_LINK_WORD_GET_COMPLEMENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_MODIFIEDS, POSS_MARKER_LINK_WORD, $list113, NIL, $list950);
        methods.subloop_register_instance_method(POSS_MARKER_LINK_WORD, GET_MODIFIEDS, POSS_MARKER_LINK_WORD_GET_MODIFIEDS_METHOD);
        classes.subloop_new_class(COMPLEMENTIZER_LINK_WORD, LINK_WORD, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(COMPLEMENTIZER_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(COMPLEMENTIZER_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_COMPLEMENTIZER_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(COMPLEMENTIZER_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_COMPLEMENTIZER_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_complementizer_link_word_class(COMPLEMENTIZER_LINK_WORD);
        classes.subloop_new_class(WALL_LINK_WORD, LINK_WORD, $list929, NIL, NIL);
        classes.class_set_implements_slot_listeners(WALL_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(WALL_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_WALL_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(WALL_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_WALL_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_wall_link_word_class(WALL_LINK_WORD);
        classes.subloop_new_class(LEFT_WALL_LINK_WORD, WALL_LINK_WORD, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(LEFT_WALL_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(LEFT_WALL_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_LEFT_WALL_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(LEFT_WALL_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_LEFT_WALL_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_left_wall_link_word_class(LEFT_WALL_LINK_WORD);
        classes.subloop_new_class(RIGHT_WALL_LINK_WORD, WALL_LINK_WORD, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(RIGHT_WALL_LINK_WORD, NIL);
        classes.subloop_note_class_initialization_function(RIGHT_WALL_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_RIGHT_WALL_LINK_WORD_CLASS);
        classes.subloop_note_instance_initialization_function(RIGHT_WALL_LINK_WORD, SUBLOOP_RESERVED_INITIALIZE_RIGHT_WALL_LINK_WORD_INSTANCE);
        subloop_reserved_initialize_right_wall_link_word_class(RIGHT_WALL_LINK_WORD);
        classes.subloop_new_class(LINKAGE, OBJECT, $list963, NIL, $list964);
        classes.class_set_implements_slot_listeners(LINKAGE, NIL);
        methods.methods_incorporate_instance_method(CYCLIFY, LINKAGE, $list113, $list971, $list972);
        methods.subloop_register_instance_method(LINKAGE, CYCLIFY, LINKAGE_CYCLIFY_METHOD);
        methods.methods_incorporate_instance_method(GET_CYCLIFIER, LINKAGE, $list113, $list971, $list977);
        methods.subloop_register_instance_method(LINKAGE, GET_CYCLIFIER, LINKAGE_GET_CYCLIFIER_METHOD);
        classes.subloop_note_class_initialization_function(LINKAGE, SUBLOOP_RESERVED_INITIALIZE_LINKAGE_CLASS);
        classes.subloop_note_instance_initialization_function(LINKAGE, SUBLOOP_RESERVED_INITIALIZE_LINKAGE_INSTANCE);
        subloop_reserved_initialize_linkage_class(LINKAGE);
        methods.methods_incorporate_instance_method(YIELD, LINKAGE, $list113, NIL, $list1026);
        methods.subloop_register_instance_method(LINKAGE, YIELD, LINKAGE_YIELD_METHOD);
        methods.methods_incorporate_instance_method(PRINT, LINKAGE, $list113, $list122, $list1029);
        methods.subloop_register_instance_method(LINKAGE, PRINT, LINKAGE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(XML, LINKAGE, $list113, NIL, $list1032);
        methods.subloop_register_instance_method(LINKAGE, XML, LINKAGE_XML_METHOD);
        methods.methods_incorporate_instance_method(PRINT_DIAGRAM, LINKAGE, $list113, NIL, $list1047);
        methods.subloop_register_instance_method(LINKAGE, PRINT_DIAGRAM, LINKAGE_PRINT_DIAGRAM_METHOD);
        methods.methods_incorporate_instance_method(LENGTH, LINKAGE, $list113, NIL, $list1051);
        methods.subloop_register_instance_method(LINKAGE, LENGTH, LINKAGE_LENGTH_METHOD);
        methods.methods_incorporate_instance_method(GET_TREE, LINKAGE, $list113, NIL, $list1054);
        methods.subloop_register_instance_method(LINKAGE, GET_TREE, LINKAGE_GET_TREE_METHOD);
        methods.methods_incorporate_instance_method(GET_TREE_STRING, LINKAGE, $list113, NIL, $list1058);
        methods.subloop_register_instance_method(LINKAGE, GET_TREE_STRING, LINKAGE_GET_TREE_STRING_METHOD);
        methods.methods_incorporate_instance_method(GET_DAUGHTER, LINKAGE, $list113, $list154, $list1061);
        methods.subloop_register_instance_method(LINKAGE, GET_DAUGHTER, LINKAGE_GET_DAUGHTER_METHOD);
        methods.methods_incorporate_instance_method(GET_WORD, LINKAGE, $list113, $list154, $list1065);
        methods.subloop_register_instance_method(LINKAGE, GET_WORD, LINKAGE_GET_WORD_METHOD);
        methods.methods_incorporate_instance_method(GET_HEADS, LINKAGE, $list113, NIL, $list1068);
        methods.subloop_register_instance_method(LINKAGE, GET_HEADS, LINKAGE_GET_HEADS_METHOD);
        methods.methods_incorporate_instance_method(GET_HEAD, LINKAGE, $list113, NIL, $list1072);
        methods.subloop_register_instance_method(LINKAGE, GET_HEAD, LINKAGE_GET_HEAD_METHOD);
        methods.methods_incorporate_instance_method(GET_SUBJECT, LINKAGE, $list113, NIL, $list1074);
        methods.subloop_register_instance_method(LINKAGE, GET_SUBJECT, LINKAGE_GET_SUBJECT_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECT_OBJECT, LINKAGE, $list113, NIL, $list1076);
        methods.subloop_register_instance_method(LINKAGE, GET_DIRECT_OBJECT, LINKAGE_GET_DIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method(GET_INDIRECT_OBJECT, LINKAGE, $list113, NIL, $list1078);
        methods.subloop_register_instance_method(LINKAGE, GET_INDIRECT_OBJECT, LINKAGE_GET_INDIRECT_OBJECT_METHOD);
        methods.methods_incorporate_instance_method(CYCLIFY_INT, LINKAGE, $list113, NIL, $list1080);
        methods.subloop_register_instance_method(LINKAGE, CYCLIFY_INT, LINKAGE_CYCLIFY_INT_METHOD);
        methods.methods_incorporate_instance_method(LEXIFY, LINKAGE, $list113, $list468, $list1083);
        methods.subloop_register_instance_method(LINKAGE, LEXIFY, LINKAGE_LEXIFY_METHOD);
        methods.methods_incorporate_instance_method(CYCLIFIABLE_QUESTION_P, LINKAGE, $list113, NIL, $list1088);
        methods.subloop_register_instance_method(LINKAGE, CYCLIFIABLE_QUESTION_P, LINKAGE_CYCLIFIABLE_QUESTION_P_METHOD);
        methods.methods_incorporate_instance_method(SEARCH, LINKAGE, $list121, $list1092, $list1093);
        methods.subloop_register_instance_method(LINKAGE, SEARCH, LINKAGE_SEARCH_METHOD);
        define_test_case_table_int(TEST_LINKAGE_WITH_RETOKENIZATION, list(new SubLObject[]{ $TEST, SOME_LINKAGE_RESULTS, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list1140);
        define_test_case_table_int($sym1141$LINKS_HAVE_NAMES_, list(new SubLObject[]{ $TEST, EQ, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list1142);
        return NIL;
    }

    private static SubLObject _constant_23_initializer() {
        return list(new SubLObject[]{ list(makeString("A"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("AA"), list(NIL, makeSymbol("QUANTIFIER-LINK-WORD"))), list(makeString("AF"), list(NIL, makeSymbol("AUX-VERB-LINK-WORD"))), list(makeString("AL"), list(NIL, makeSymbol("QUANTIFIER-LINK-WORD"))), list(makeString("AM"), list(NIL, makeSymbol("QUANTIFIER-LINK-WORD"))), list(makeString("AN"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("AZ"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("B"), list(NIL, makeSymbol("VERB-LINK-WORD"), makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("BI"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("BT"), list(NIL, makeSymbol("VERB-LINK-WORD"))), list(makeString("BW"), list(NIL, makeSymbol("VERB-LINK-WORD"))), list(makeString("C"), list(NIL, makeSymbol("NOUN-LINK-WORD"), makeSymbol("QUANTIFIER-LINK-WORD"), makeSymbol("ADVERB-LINK-WORD"), makeSymbol("EXISTENTIAL-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD"))), list(makeString("CC"), list(NIL, makeSymbol("CONJUNCTION-LINK-WORD"))), list(makeString("CO"), list(NIL, makeSymbol("NOUN-LINK-WORD"), makeSymbol("PARTICIPLE-LINK-WORD"))), list(makeString("CP"), list(NIL, makeSymbol("VERB-LINK-WORD"))), list(makeString("CQ"), list(NIL, makeSymbol("AUX-VERB-LINK-WORD"))), list(makeString("CX"), list(NIL, makeSymbol("AUX-VERB-LINK-WORD"))), list(makeString("D"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("DD"), list(NIL, makeSymbol("COMMON-NOUN-LINK-WORD"), makeSymbol("QUANTIFIER-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD"))), list(makeString("DG"), list(NIL, makeSymbol("PROPER-NOUN-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD"))), list(makeString("DP"), list(NIL, makeSymbol("GERUND-LINK-WORD"))), list(makeString("DT"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("E"), list(NIL, makeSymbol("VERB-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD"))), list(makeString("EA"), list(NIL, makeSymbol("ADJECTIVE-LINK-WORD"), makeSymbol("QUANTIFIER-LINK-WORD"))), list(makeString("EB"), list(NIL, makeSymbol("ADVERB-LINK-WORD"))), list(makeString("EC"), list(NIL, makeSymbol("ADJECTIVE-LINK-WORD"), makeSymbol("ADVERB-LINK-WORD"), makeSymbol("QUANTIFIER-LINK-WORD"))), list(makeString("EE"), list(NIL, makeSymbol("ADVERB-LINK-WORD"), makeSymbol("QUANTIFIER-LINK-WORD"))), list(makeString("EF"), list(NIL, makeSymbol("ADVERB-LINK-WORD"))), list(makeString("EI"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("EL"), list(NIL, makeSymbol("ADVERB-LINK-WORD"))), list(makeString("EN"), list(NIL)), list(makeString("ER"), list(NIL, makeSymbol("ADJECTIVE-LINK-WORD"))), list(makeString("EZ"), list(NIL, makeSymbol("ADVERB-LINK-WORD"))), list(makeString("FL"), list(NIL, makeSymbol("ADVERB-LINK-WORD"))), list(makeString("FM"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("G"), list(NIL, makeSymbol("PROPER-NOUN-LINK-WORD"))), list(makeString("GN"), list(NIL, makeSymbol("PROPER-NOUN-LINK-WORD"))), list(makeString("H"), list(NIL, makeSymbol("ADJECTIVE-LINK-WORD"), makeSymbol("QUANTIFIER-LINK-WORD"))), list(makeString("I"), list(NIL, makeSymbol("VERB-LINK-WORD"))), list(makeString("ID"), list(NIL)), list(makeString("IN"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("J"), list(NIL, makeSymbol("NOUN-LINK-WORD"), makeSymbol("QUANTIFIER-LINK-WORD"))), list(makeString("JG"), list(NIL, makeSymbol("PROPER-NOUN-LINK-WORD"))), list(makeString("JQ"), list(NIL, makeSymbol("W-DETERMINER-LINK-WORD"))), list(makeString("JT"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("K"), list(NIL, makeSymbol("PARTICLE-LINK-WORD"), makeSymbol("ADVERB-LINK-WORD"))), list(makeString("L"), list(NIL, makeSymbol("ADJECTIVE-LINK-WORD"))), list(makeString("LE"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("LI"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("M"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"), makeSymbol("VERB-LINK-WORD"), makeSymbol("COMMON-NOUN-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD"))), list(makeString("MF"), list(NIL, makeSymbol("PRONOUN-LINK-WORD"))), list(makeString("MG"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("MV"), list(NIL, makeSymbol("ADVERB-LINK-WORD"), makeSymbol("PREPOSITION-LINK-WORD"), makeSymbol("NOUN-LINK-WORD"), makeSymbol("INF-MARKER-LINK-WORD"))), list(makeString("MX"), list(NIL, makeSymbol("NOUN-LINK-WORD"), makeSymbol("PREPOSITION-LINK-WORD"), makeSymbol("VERB-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD"))), list(makeString("N"), list(NIL, makeSymbol("ADVERB-LINK-WORD"))), list(makeString("ND"), list(NIL, makeSymbol("NOUN-LINK-WORD"), makeSymbol("QUANTIFIER-LINK-WORD"))), list(makeString("NF"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("NI"), list(NIL, makeSymbol("CONJUNCTION-LINK-WORD"), makeSymbol("QUANTIFIER-LINK-WORD"))), list(makeString("NJ"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("NN"), list(NIL, makeSymbol("NOUN-LINK-WORD"), makeSymbol("QUANTIFIER-LINK-WORD"))), list(makeString("NO"), list(NIL)), list(makeString("NR"), list(NIL, makeSymbol("ADJECTIVE-LINK-WORD"))), list(makeString("NS"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("NT"), list(NIL, makeSymbol("INF-MARKER-LINK-WORD"))), list(makeString("NW"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("O"), list(NIL, makeSymbol("NOUN-LINK-WORD"), makeSymbol("QUANTIFIER-LINK-WORD"))), list(makeString("OD"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("OF"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("ON"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("OT"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("OX"), list(NIL, makeSymbol("EXISTENTIAL-LINK-WORD"))), list(makeString("P"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD"), makeSymbol("VERB-LINK-WORD"), makeSymbol("ADVERB-LINK-WORD")), list(CHAR_v, makeSymbol("VERB-LINK-WORD")), list(CHAR_g, makeSymbol("VERB-LINK-WORD")), list(CHAR_p, makeSymbol("PREPOSITION-LINK-WORD")), list(CHAR_a, makeSymbol("ADJECTIVE-LINK-WORD"))), list(makeString("PF"), list(NIL, makeSymbol("AUX-VERB-LINK-WORD"))), list(makeString("PP"), list(NIL, makeSymbol("MAIN-VERB-LINK-WORD"))), list(makeString("Q"), list(NIL, makeSymbol("AUX-VERB-LINK-WORD"))), list(makeString("QI"), list(NIL, makeSymbol("W-PRONOUN-LINK-WORD"), makeSymbol("W-DETERMINER-LINK-WORD"), makeSymbol("W-ADVERB-LINK-WORD"))), list(makeString("R"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("RS"), list(NIL, makeSymbol("VERB-LINK-WORD"))), list(makeString("RW"), list(NIL, makeSymbol("RIGHT-WALL-LINK-WORD"))), list(makeString("S"), list(NIL, makeSymbol("VERB-LINK-WORD"))), list(makeString("SF"), list(NIL, makeSymbol("VERB-LINK-WORD"))), list(makeString("SFI"), list(NIL, makeSymbol("EXISTENTIAL-LINK-WORD"))), list(makeString("SI"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("SX"), list(NIL, makeSymbol("VERB-LINK-WORD"))), list(makeString("SXI"), list(NIL, makeSymbol("PERSONAL-PRONOUN-LINK-WORD"))), list(makeString("TA"), list(NIL, makeSymbol("PROPER-NOUN-LINK-WORD"))), list(makeString("TD"), list(NIL, makeSymbol("COMMON-NOUN-LINK-WORD"))), list(makeString("TH"), list(NIL, makeSymbol("COMPLEMENTIZER-LINK-WORD"))), list(makeString("TI"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("TM"), list(NIL, makeSymbol("CARDINAL-LINK-WORD"))), list(makeString("TO"), list(NIL, makeSymbol("INF-MARKER-LINK-WORD"))), list(makeString("TQ"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("TS"), list(NIL, makeSymbol("COMPLEMENTIZER-LINK-WORD"))), list(makeString("TT"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("TW"), list(NIL, makeSymbol("PROPER-NOUN-LINK-WORD"))), list(makeString("TY"), list(NIL, makeSymbol("CARDINAL-LINK-WORD"))), list(makeString("U"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("UN"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("V"), list(NIL, makeSymbol("ADJECTIVE-LINK-WORD"), makeSymbol("VERB-LINK-WORD"))), list(makeString("W"), list(new SubLObject[]{ NIL, makeSymbol("NOUN-LINK-WORD"), makeSymbol("VERB-LINK-WORD"), makeSymbol("CONJUNCTION-LINK-WORD"), makeSymbol("EXISTENTIAL-LINK-WORD"), makeSymbol("ADVERB-LINK-WORD"), makeSymbol("PREPOSITION-LINK-WORD"), makeSymbol("QUANTIFIER-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD") })), list(makeString("WN"), list(NIL, makeSymbol("W-ADVERB-LINK-WORD"))), list(makeString("WR"), list(NIL, makeSymbol("VERB-LINK-WORD"))), list(makeString("X"), list(NIL)), list(makeString("Y"), list(NIL, makeSymbol("ADVERB-LINK-WORD"), makeSymbol("PREPOSITION-LINK-WORD"), makeSymbol("NOUN-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD"))), list(makeString("YP"), list(NIL, makeSymbol("POSS-MARKER-LINK-WORD"))), list(makeString("YS"), list(NIL, makeSymbol("POSS-MARKER-LINK-WORD"))), list(makeString("Z"), list(NIL, makeSymbol("MAIN-VERB-LINK-WORD"))) });
    }

    private static SubLObject _constant_24_initializer() {
        return list(new SubLObject[]{ list(makeString("A"), list(NIL, makeSymbol("ADJECTIVE-LINK-WORD"), makeSymbol("VERB-LINK-WORD"))), list(makeString("AA"), list(NIL, makeSymbol("ADJECTIVE-LINK-WORD"))), list(makeString("AF"), list(NIL, makeSymbol("ADJECTIVE-LINK-WORD"), makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("AL"), list(NIL, makeSymbol("PREDETERMINER-LINK-WORD"))), list(makeString("AM"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("AN"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("AZ"), list(NIL, makeSymbol("VERB-LINK-WORD"))), list(makeString("B"), list(NIL, makeSymbol("NOUN-LINK-WORD"), makeSymbol("QUANTIFIER-LINK-WORD"), makeSymbol("MAIN-VERB-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD"))), list(makeString("BI"), list(NIL, makeSymbol("VERB-LINK-WORD"))), list(makeString("BT"), list(NIL, makeSymbol("NOUN-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD"))), list(makeString("BW"), list(NIL, makeSymbol("W-PRONOUN-LINK-WORD"))), list(makeString("C"), list(NIL, makeSymbol("ADVERB-LINK-WORD"), makeSymbol("VERB-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD"), makeSymbol("NOUN-LINK-WORD"), makeSymbol("COMPLEMENTIZER-LINK-WORD"), makeSymbol("CONJUNCTION-LINK-WORD"), makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("CC"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("CO"), list(NIL, makeSymbol("ADVERB-LINK-WORD"), makeSymbol("PREPOSITION-LINK-WORD"), makeSymbol("CONJUNCTION-LINK-WORD"), makeSymbol("VERB-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD"), makeSymbol("COMMON-NOUN-LINK-WORD"), makeSymbol("PREDETERMINER-LINK-WORD"))), list(makeString("CP"), list(NIL, makeSymbol("WALL-LINK-WORD"))), list(makeString("CQ"), list(NIL, makeSymbol("COMPARATOR-LINK-WORD"))), list(makeString("CX"), list(NIL, makeSymbol("COMPARATOR-LINK-WORD"), makeSymbol("NOUN-LINK-WORD"))), list(makeString("D"), list(NIL, makeSymbol("QUANTIFIER-LINK-WORD"), makeSymbol("POSS-MARKER-LINK-WORD"))), list(makeString("DD"), list(NIL, makeSymbol("DEFINITE-DETERMINER-LINK-WORD"))), list(makeString("DG"), list(NIL, makeSymbol("DEFINITE-DETERMINER-LINK-WORD"))), list(makeString("DP"), list(NIL, makeSymbol("POSSESSIVE-PRONOUN-LINK-WORD"))), list(makeString("DT"), list(NIL, makeSymbol("QUANTIFIER-LINK-WORD"), makeSymbol("COMMON-NOUN-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD"))), list(makeString("E"), list(NIL, makeSymbol("ADVERB-LINK-WORD"), makeSymbol("AUX-VERB-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD"))), list(makeString("EA"), list(NIL, makeSymbol("ADVERB-LINK-WORD"))), list(makeString("EB"), list(NIL, makeSymbol("VERB-LINK-WORD"), makeSymbol("PUNCTUATION-LINK-WORD"))), list(makeString("EC"), list(NIL, makeSymbol("ADVERB-LINK-WORD"), makeSymbol("QUANTIFIER-LINK-WORD"))), list(makeString("EE"), list(NIL, makeSymbol("ADVERB-LINK-WORD"))), list(makeString("EF"), list(NIL, makeSymbol("ADJECTIVE-LINK-WORD"), makeSymbol("ADVERB-LINK-WORD"))), list(makeString("EI"), list(NIL, makeSymbol("ADVERB-LINK-WORD"))), list(makeString("EL"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("EN"), list(NIL, makeSymbol("ADVERB-LINK-WORD"))), list(makeString("ER"), list(NIL, makeSymbol("ADJECTIVE-LINK-WORD"))), list(makeString("EZ"), list(NIL, makeSymbol("ADVERB-LINK-WORD"))), list(makeString("FL"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("FM"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("G"), list(NIL, makeSymbol("PROPER-NOUN-LINK-WORD"))), list(makeString("GN"), list(NIL, makeSymbol("COMMON-NOUN-LINK-WORD"))), list(makeString("H"), list(NIL, makeSymbol("W-ADVERB-LINK-WORD"))), list(makeString("I"), list(NIL, makeSymbol("INF-MARKER-LINK-WORD"), makeSymbol("VERB-LINK-WORD"), makeSymbol("COMPLEMENTIZER-LINK-WORD"))), list(makeString("ID"), list(NIL)), list(makeString("IN"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("J"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"), makeSymbol("QUANTIFIER-LINK-WORD"), makeSymbol("PUNCTUATION-LINK-WORD"))), list(makeString("JG"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("JQ"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("JT"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("K"), list(NIL, makeSymbol("MAIN-VERB-LINK-WORD"), makeSymbol("ADVERB-LINK-WORD"))), list(makeString("L"), list(NIL, makeSymbol("QUANTIFIER-LINK-WORD"))), list(makeString("LE"), list(NIL, makeSymbol("ADJECTIVE-LINK-WORD"))), list(makeString("LI"), list(NIL, makeSymbol("MAIN-VERB-LINK-WORD"))), list(makeString("M"), list(NIL, makeSymbol("NOUN-LINK-WORD"), makeSymbol("QUANTIFIER-LINK-WORD"), makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("MF"), list(NIL, makeSymbol("QUANTIFIER-LINK-WORD"))), list(makeString("MG"), list(NIL, makeSymbol("PROPER-NOUN-LINK-WORD"))), list(makeString("MV"), list(NIL, makeSymbol("VERB-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD"), makeSymbol("ADVERB-LINK-WORD"))), list(makeString("MX"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("N"), list(NIL, makeSymbol("AUX-VERB-LINK-WORD"))), list(makeString("ND"), list(NIL, makeSymbol("QUANTIFIER-LINK-WORD"))), list(makeString("NF"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("NI"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"), makeSymbol("COMMON-NOUN-LINK-WORD"))), list(makeString("NJ"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("NN"), list(NIL, makeSymbol("CARDINAL-LINK-WORD"))), list(makeString("NO"), list(NIL)), list(makeString("NR"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("NS"), list(NIL, makeSymbol("QUANTIFIER-LINK-WORD"))), list(makeString("NT"), list(NIL, makeSymbol("ADVERB-LINK-WORD"))), list(makeString("NW"), list(NIL, makeSymbol("CARDINAL-LINK-WORD"))), list(makeString("O"), list(NIL, makeSymbol("VERB-LINK-WORD"), makeSymbol("ADVERB-LINK-WORD"))), list(makeString("OD"), list(NIL, makeSymbol("MAIN-VERB-LINK-WORD"))), list(makeString("OF"), list(NIL, makeSymbol("VERB-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD"), makeSymbol("GERUND-LINK-WORD"))), list(makeString("ON"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("OT"), list(NIL, makeSymbol("MAIN-VERB-LINK-WORD"))), list(makeString("OX"), list(NIL, makeSymbol("MAIN-VERB-LINK-WORD"))), list(makeString("P"), list(NIL, makeSymbol("VERB-LINK-WORD"), makeSymbol("PREPOSITION-LINK-WORD"), makeSymbol("ADVERB-LINK-WORD"), makeSymbol("COMMON-NOUN-LINK-WORD"))), list(makeString("PF"), list(NIL, makeSymbol("W-ADVERB-LINK-WORD"), makeSymbol("VERB-LINK-WORD"))), list(makeString("PP"), list(NIL, makeSymbol("AUX-VERB-LINK-WORD"))), list(makeString("Q"), list(NIL, makeSymbol("LEFT-WALL-LINK-WORD"), makeSymbol("ADVERB-LINK-WORD"), makeSymbol("PREPOSITION-LINK-WORD"), makeSymbol("NOUN-LINK-WORD"), makeSymbol("PUNCTUATION-LINK-WORD"))), list(makeString("QI"), list(NIL, makeSymbol("MAIN-VERB-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD"), makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("R"), list(NIL, makeSymbol("NOUN-LINK-WORD"), makeSymbol("ADVERB-LINK-WORD"), makeSymbol("MAIN-VERB-LINK-WORD"))), list(makeString("RS"), list(NIL, makeSymbol("REL-PRONOUN-LINK-WORD"), makeSymbol("VERB-LINK-WORD"))), list(makeString("RW"), list(NIL, makeSymbol("PUNCTUATION-LINK-WORD"), makeSymbol("LEFT-WALL-LINK-WORD"))), list(makeString("S"), list(NIL, makeSymbol("NOUN-LINK-WORD"), makeSymbol("QUANTIFIER-LINK-WORD"), makeSymbol("VERB-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD"))), list(makeString("SF"), list(NIL, makeSymbol("EXISTENTIAL-LINK-WORD"), makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("SFI"), list(NIL, makeSymbol("AUX-VERB-LINK-WORD"), makeSymbol("COMPLEMENTIZER-LINK-WORD"))), list(makeString("SI"), list(NIL, makeSymbol("AUX-VERB-LINK-WORD"), makeSymbol("COMPLEMENTIZER-LINK-WORD"))), list(makeString("SX"), list(NIL, makeSymbol("PERSONAL-PRONOUN-LINK-WORD"))), list(makeString("SXI"), list(NIL, makeSymbol("AUX-VERB-LINK-WORD"))), list(makeString("TA"), list(NIL, makeSymbol("ADJECTIVE-LINK-WORD"))), list(makeString("TD"), list(NIL, makeSymbol("PROPER-NOUN-LINK-WORD"))), list(makeString("TH"), list(NIL, makeSymbol("VERB-LINK-WORD"), makeSymbol("NOUN-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD"), makeSymbol("PREPOSITION-LINK-WORD"), makeSymbol("PUNCTUATION-LINK-WORD"))), list(makeString("TI"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"), makeSymbol("VERB-LINK-WORD"))), list(makeString("TM"), list(NIL, makeSymbol("PROPER-NOUN-LINK-WORD"))), list(makeString("TO"), list(NIL, makeSymbol("VERB-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD"), makeSymbol("NOUN-LINK-WORD"), makeSymbol("PREPOSITION-LINK-WORD"), makeSymbol("PUNCTUATION-LINK-WORD"))), list(makeString("TQ"), list(NIL, makeSymbol("QUANTIFIER-LINK-WORD"))), list(makeString("TS"), list(NIL, makeSymbol("VERB-LINK-WORD"), makeSymbol("NOUN-LINK-WORD"), makeSymbol("ADJECTIVE-LINK-WORD"))), list(makeString("TT"), list(NIL, makeSymbol("ADJECTIVE-LINK-WORD"))), list(makeString("TW"), list(NIL, makeSymbol("PROPER-NOUN-LINK-WORD"))), list(makeString("TY"), list(NIL, makeSymbol("LINK-WORD"))), list(makeString("U"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("UN"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"))), list(makeString("V"), list(NIL, makeSymbol("MAIN-VERB-LINK-WORD"))), list(makeString("W"), list(NIL, makeSymbol("WALL-LINK-WORD"), makeSymbol("CONJUNCTION-LINK-WORD"), makeSymbol("PUNCTUATION-LINK-WORD"))), list(makeString("WN"), list(NIL, makeSymbol("COMMON-NOUN-LINK-WORD"))), list(makeString("WR"), list(NIL, makeSymbol("W-ADVERB-LINK-WORD"))), list(makeString("X"), list(NIL)), list(makeString("Y"), list(NIL, makeSymbol("COMMON-NOUN-LINK-WORD"))), list(makeString("YP"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("YS"), list(NIL, makeSymbol("NOUN-LINK-WORD"))), list(makeString("Z"), list(NIL, makeSymbol("PREPOSITION-LINK-WORD"))) });
    }

    @Override
    public void declareFunctions() {
        declare_linkage_file();
    }

    @Override
    public void initializeVariables() {
        init_linkage_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_linkage_file();
    }

    

    public static final class $link_native extends SubLStructNative {
        public SubLObject $name;

        public SubLObject $left_word;

        public SubLObject $right_word;

        private static final SubLStructDeclNative structDecl;

        private $link_native() {
            this.$name = Lisp.NIL;
            this.$left_word = Lisp.NIL;
            this.$right_word = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$name;
        }

        @Override
        public SubLObject getField3() {
            return this.$left_word;
        }

        @Override
        public SubLObject getField4() {
            return this.$right_word;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$left_word = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$right_word = value;
        }

        static {
            structDecl = makeStructDeclNative($link_native.class, LINK, LINK_P, $list71, $list72, new String[]{ "$name", "$left_word", "$right_word" }, $list73, $list74, PRINT_LINKAGE_LINK);
        }
    }

    public static final class $link_p$UnaryFunction extends UnaryFunction {
        public $link_p$UnaryFunction() {
            super(extractFunctionNamed("LINK-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return link_p(arg1);
        }
    }
}

/**
 * Total time: 10692 ms synthetic
 */
