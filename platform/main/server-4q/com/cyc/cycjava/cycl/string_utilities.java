package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLBoolean;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.string_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_0;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_3;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_4;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_5;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_6;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_7;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_8;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_9;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_A;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_B;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_C;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_D;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_E;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_F;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_G;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_H;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_I;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_J;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_K;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_L;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_M;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_N;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_O;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_P;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_Q;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_R;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_S;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_U;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_V;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_W;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_X;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_Y;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_Z;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_a;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_ampersand;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_asterisk;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_b;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_backslash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_c;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_d;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_e;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_exclamation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_f;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_g;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_h;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_i;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_j;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_k;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_l;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lbracket;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_m;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_n;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_o;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_plus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_q;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_question;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_r;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rbracket;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_return;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_s;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_semicolon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_t;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_u;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_underbar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_v;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_w;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_x;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_y;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_z;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ELEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIFTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOURTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NINETEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NINE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVENTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIXTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THIRTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWELVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_base$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


import static com.cyc.cycjava.cycl.string_utilities.*; 
 public final class string_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new string_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.string_utilities";

    public static final String myFingerPrint = "7e85581c2389ffbaf9174f970096aaab4cbeb022873a5c95e9bac95d844e34f2";

    // defconstant
    // Definitions
    public static final SubLSymbol $point_char$ = makeSymbol("*POINT-CHAR*");



    // defconstant
    public static final SubLSymbol $tab_char$ = makeSymbol("*TAB-CHAR*");

    // defconstant
    public static final SubLSymbol $empty_string$ = makeSymbol("*EMPTY-STRING*");

    // defconstant
    public static final SubLSymbol $new_line_string$ = makeSymbol("*NEW-LINE-STRING*");





    // defparameter
    // dynamic variable used only by char-set-position
    public static final SubLSymbol $char_set$ = makeSymbol("*CHAR-SET*");

    // defconstant
    /**
     * The mapping of integers to SubL characters, as specified by the Base64
     * Content-Transfer-Encoding in http://www.freesoft.org/CIE/RFC/1521/7.htm
     */
    private static final SubLSymbol $64_bit_encoding_table$ = makeSymbol("*64-BIT-ENCODING-TABLE*");

    // deflexical
    /**
     * An efficient index from integers in the range 0..63 to their corresponding
     * character according to the Base64 Content-Transfer-Encoding.
     */
    private static final SubLSymbol $64_bit_integer_index$ = makeSymbol("*64-BIT-INTEGER-INDEX*");

    // deflexical
    /**
     * An efficient index from a subset of SubL characters to integers in the range
     * 0..63 according to the Base64 Content-Transfer-Encoding.
     */
    private static final SubLSymbol $64_bit_char_index$ = makeSymbol("*64-BIT-CHAR-INDEX*");

    // deflexical
    // All symbolic names that LISP provides for different types of whitespace.
    private static final SubLSymbol $raw_whitespace_chars$ = makeSymbol("*RAW-WHITESPACE-CHARS*");

    // deflexical
    // The actual set of white space characters in this LISP implementation.
    private static final SubLSymbol $whitespace_chars$ = makeSymbol("*WHITESPACE-CHARS*");

    // deflexical
    /**
     * The list of chars that are syntactic punctuation only (not used inside
     * words). Note -- does not include periods because they can occur inside number
     * expressions.
     */
    private static final SubLSymbol $grammatical_punctuation_chars$ = makeSymbol("*GRAMMATICAL-PUNCTUATION-CHARS*");

    // defparameter
    public static final SubLSymbol $target_characters$ = makeSymbol("*TARGET-CHARACTERS*");

    // defparameter
    // Metric used for string-trigraph-match-p, which is defined below.
    private static final SubLSymbol $trigraph_metric$ = makeSymbol("*TRIGRAPH-METRIC*");

    // defparameter
    /**
     * A list of one or more utility hash tables, used by string-trigraph-match-p,
     * which is defined below.
     */
    private static final SubLSymbol $trigraph_tables$ = makeSymbol("*TRIGRAPH-TABLES*");

    // defvar
    private static final SubLSymbol $cyclify_string_expand_subl_fn_strings$ = makeSymbol("*CYCLIFY-STRING-EXPAND-SUBL-FN-STRINGS*");

    // defvar
    private static final SubLSymbol $cyclify_string_subl_quote_fn_strings$ = makeSymbol("*CYCLIFY-STRING-SUBL-QUOTE-FN-STRINGS*");

    // defvar
    private static final SubLSymbol $cyclify_string_quote_chars$ = makeSymbol("*CYCLIFY-STRING-QUOTE-CHARS*");

    // defconstant
    public static final SubLSymbol $dtp_cyclify_status$ = makeSymbol("*DTP-CYCLIFY-STATUS*");

    // defparameter
    public static final SubLSymbol $string_read_buffer_size$ = makeSymbol("*STRING-READ-BUFFER-SIZE*");

    // defparameter
    public static final SubLSymbol $string_read_buffer$ = makeSymbol("*STRING-READ-BUFFER*");

    // Internal Constants
    public static final SubLString $str0$ = makeString("");

    public static final SubLList $list1 = list(list(makeSymbol("WORD"), makeSymbol("STRING"), makeSymbol("&KEY"), list(makeSymbol("BREAK-CHAR"), list(makeSymbol("QUOTE"), makeSymbol("*SPACE-CHAR*")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list2 = list(makeKeyword("BREAK-CHAR"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    public static final SubLSymbol $space_char$ = makeSymbol("*SPACE-CHAR*");

    public static final SubLSymbol $sym6$WORD_LIST_VAR = makeUninternedSymbol("WORD-LIST-VAR");



    public static final SubLSymbol $test_char$ = makeSymbol("*TEST-CHAR*");

    public static final SubLSymbol BREAK_WORDS = makeSymbol("BREAK-WORDS");

    public static final SubLList $list10 = list(list(makeSymbol("QUOTE"), makeSymbol("NOT-TEST-CHAR")));





    public static final SubLSymbol OBJECT_TO_STRING = makeSymbol("OBJECT-TO-STRING");

    public static final SubLSymbol $object_to_string_caching_state$ = makeSymbol("*OBJECT-TO-STRING-CACHING-STATE*");



    private static final SubLString $str16$_ = makeString(">");

    public static final SubLString $str17$_ = makeString("(");

    public static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str19$___ = makeString("...");

    private static final SubLString $str20$_ = makeString(")");

    public static final SubLString $str21$_ = makeString("\"");

    private static final SubLSymbol READABLE_P = makeSymbol("READABLE-P");





    private static final SubLString $str25$_X = makeString("~X");



    public static final SubLString $str27$_S_is_too_short_to_remove__D_char = makeString("~S is too short to remove ~D characters.");

    public static final SubLSymbol $sym28$NON_EMPTY_STRING_ = makeSymbol("NON-EMPTY-STRING?");

    public static final SubLString $str29$_S_must_be_a_single_word___cannot = makeString("~S must be a single word - cannot contain ~S");

    public static final SubLSymbol NOT_TEST_CHAR = makeSymbol("NOT-TEST-CHAR");









    public static final SubLString $str35$Some_element_of__A_is_not_charact = makeString("Some element of ~A is not characterp.");

    private static final SubLSymbol HTML_ESCAPED_STRING_P = makeSymbol("HTML-ESCAPED-STRING-P");













    private static final SubLList $list43 = list(list(list(makeString("foo &bar; bam")), T), list(list(makeString("PB&#x2014;J")), T), list(list(makeString("PB&J")), NIL), list(list(makeString("PB&amp;J")), T), list(list(makeString("PB&#151;J")), T));



    private static final SubLSymbol $sym45$_ = makeSymbol("<");

    private static final SubLSymbol ENDS_WITH_START_OF = makeSymbol("ENDS-WITH-START-OF");

    private static final SubLList $list47 = list(list(list(makeString("Author Harriet"), makeString("Harriet Beecher Stowe"), EQUALP), makeString("Harriet")), list(list(makeString("Author Harriet Beecher Stowe"), makeString("Harriet Beecher Stowe"), EQUALP), makeString("Harriet Beecher Stowe")), list(list(makeString("Author Harriet Beecher Stowes"), makeString("Harriet Beecher Stowe"), EQUALP), NIL), list(list(makeString("Author Harriet Beecher Sto"), makeString("Harriet Beecher Stowe"), EQUALP), makeString("Harriet Beecher Sto")), list(list(makeString("Author Harriet Beecher Sto"), makeString("riet Beecher Stowe"), EQUALP, list(makeString(" "))), NIL));

    private static final SubLString $str48$_ = makeString(",");

    private static final SubLString $str49$__ = makeString(", ");

    public static final SubLList $list50 = list(CHAR_lparen, CHAR_rparen);

    private static final SubLList $list51 = list(makeString("."), makeString("?"), makeString("!"));

    private static final SubLList $list52 = list(makeSymbol("NON-EMPTY-CYCL-STRING?"), makeSymbol("NON-EMPTY-SUBL-STRING?//////"));

    private static final SubLSymbol CHAR_IN_CHAR_SET = makeSymbol("CHAR-IN-CHAR-SET");







    private static final SubLList $list57 = list(makeString("-"));

    private static final SubLList $list58 = list(makeString(","));

    private static final SubLSymbol $sym59$IS_NUMERIC_ = makeSymbol("IS-NUMERIC?");

    private static final SubLSymbol PARSE_INTEGER = makeSymbol("PARSE-INTEGER");

    private static final SubLString $str61$__R = makeString("~:R");

    private static final SubLList $list62 = list(makeString("st"), makeString("nd"), makeString("rd"), makeString("th"));

    private static final SubLSymbol CONTROL_CHAR_P = makeSymbol("CONTROL-CHAR-P");



    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLList $list66 = list(CHAR_space);



    private static final SubLString $str68$_b = makeString("\\b");

    private static final SubLList $list69 = list(makeKeyword("CASELESS"));

    private static final SubLString $str70$_S_is_not_a_part_of_the_reference = makeString("~S is not a part of the reference string: ~S");

    private static final SubLString $str71$Failed_to_bunge__S_according_to__ = makeString("Failed to bunge ~S according to ~S.  Returning: ~S");



    private static final SubLSymbol UNICODE_NAUT_P = makeSymbol("UNICODE-NAUT-P");



    public static final SubLList $list75 = list(makeString(" "));

    private static final SubLSymbol LOWER_CASE_P = makeSymbol("LOWER-CASE-P");





    private static final SubLSymbol PUNCTUATION_P = makeSymbol("PUNCTUATION-P");

    private static final SubLSymbol EAT_CHAR_P = makeSymbol("EAT-CHAR-P");



    private static final SubLString $$$0123456789ABCDEF = makeString("0123456789ABCDEF");

    private static final SubLSymbol HEX_CHAR_P = makeSymbol("HEX-CHAR-P");

    private static final SubLList $list84 = list(new SubLObject[]{ cons(ZERO_INTEGER, CHAR_A), cons(ONE_INTEGER, CHAR_B), cons(TWO_INTEGER, CHAR_C), cons(THREE_INTEGER, CHAR_D), cons(FOUR_INTEGER, CHAR_E), cons(FIVE_INTEGER, CHAR_F), cons(SIX_INTEGER, CHAR_G), cons(SEVEN_INTEGER, CHAR_H), cons(EIGHT_INTEGER, CHAR_I), cons(NINE_INTEGER, CHAR_J), cons(TEN_INTEGER, CHAR_K), cons(ELEVEN_INTEGER, CHAR_L), cons(TWELVE_INTEGER, CHAR_M), cons(THIRTEEN_INTEGER, CHAR_N), cons(FOURTEEN_INTEGER, CHAR_O), cons(FIFTEEN_INTEGER, CHAR_P), cons(SIXTEEN_INTEGER, CHAR_Q), cons(SEVENTEEN_INTEGER, CHAR_R), cons(EIGHTEEN_INTEGER, CHAR_S), cons(NINETEEN_INTEGER, CHAR_T), cons(TWENTY_INTEGER, CHAR_U), cons(makeInteger(21), CHAR_V), cons(makeInteger(22), CHAR_W), cons(makeInteger(23), CHAR_X), cons(makeInteger(24), CHAR_Y), cons(makeInteger(25), CHAR_Z), cons(makeInteger(26), CHAR_a), cons(makeInteger(27), CHAR_b), cons(makeInteger(28), CHAR_c), cons(makeInteger(29), CHAR_d), cons(makeInteger(30), CHAR_e), cons(makeInteger(31), CHAR_f), cons(makeInteger(32), CHAR_g), cons(makeInteger(33), CHAR_h), cons(makeInteger(34), CHAR_i), cons(makeInteger(35), CHAR_j), cons(makeInteger(36), CHAR_k), cons(makeInteger(37), CHAR_l), cons(makeInteger(38), CHAR_m), cons(makeInteger(39), CHAR_n), cons(makeInteger(40), CHAR_o), cons(makeInteger(41), CHAR_p), cons(makeInteger(42), CHAR_q), cons(makeInteger(43), CHAR_r), cons(makeInteger(44), CHAR_s), cons(makeInteger(45), CHAR_t), cons(makeInteger(46), CHAR_u), cons(makeInteger(47), CHAR_v), cons(makeInteger(48), CHAR_w), cons(makeInteger(49), CHAR_x), cons(makeInteger(50), CHAR_y), cons(makeInteger(51), CHAR_z), cons(makeInteger(52), CHAR_0), cons(makeInteger(53), CHAR_1), cons(makeInteger(54), CHAR_2), cons(makeInteger(55), CHAR_3), cons(makeInteger(56), CHAR_4), cons(makeInteger(57), CHAR_5), cons(makeInteger(58), CHAR_6), cons(makeInteger(59), CHAR_7), cons(makeInteger(60), CHAR_8), cons(makeInteger(61), CHAR_9), cons(makeInteger(62), CHAR_plus), cons(makeInteger(63), CHAR_slash), cons(makeInteger(62), CHAR_hyphen), cons(makeInteger(63), CHAR_underbar) });

    private static final SubLString $str85$____________ = makeString(",.?!&\'\";:()-");

    private static final SubLString $str86$_____________ = makeString(",.?!&\'\";:()-/");

    private static final SubLSymbol PUNCTUATION_EXTENDED_P = makeSymbol("PUNCTUATION-EXTENDED-P");

    public static final SubLList $list88 = list(CHAR_space, CHAR_tab, CHAR_return, CHAR_newline, CHAR_newline);



    private static final SubLList $list90 = list(new SubLObject[]{ CHAR_comma, CHAR_question, CHAR_exclamation, CHAR_ampersand, CHAR_backslash, CHAR_slash, CHAR_quotation, CHAR_semicolon, CHAR_colon, CHAR_lparen, CHAR_rparen, CHAR_plus });

    private static final SubLSymbol UNICODE_SPACE_CHAR_CODE_P = makeSymbol("UNICODE-SPACE-CHAR-CODE-P");

    private static final SubLInteger $int$8192 = makeInteger(8192);

    private static final SubLInteger $int$8203 = makeInteger(8203);















    private static final SubLSymbol NON_EMPTY_STRING_P = makeSymbol("NON-EMPTY-STRING-P");

    private static final SubLList $list102 = list(CHAR_colon, CHAR_slash);



    private static final SubLSymbol $sym104$1_ = makeSymbol("1+");

    private static final SubLList $list105 = list(makeString(" and "), makeString(" or "));

    private static final SubLList $list106 = list(makeString(", "));

    public static final SubLList $list107 = list(CHAR_period, CHAR_question, CHAR_exclamation);

    private static final SubLSymbol TARGET_CHARACTER_FOUND = makeSymbol("TARGET-CHARACTER-FOUND");

    public static final SubLList $list109 = list(CHAR_newline, CHAR_return);

    private static final SubLList $list110 = list(CHAR_quotation, CHAR_backslash, CHAR_asterisk, CHAR_question, CHAR_lbracket, CHAR_rbracket, CHAR_quote);



    private static final SubLSymbol $sym112$CHAR_ = makeSymbol("CHAR=");

    private static final SubLString $$$Unmatched_open_parenthesis = makeString("Unmatched open parenthesis");

    private static final SubLString $$$Unmatched_close_parenthesis = makeString("Unmatched close parenthesis");



    private static final SubLList $list116 = list(makeString("."));

    private static final SubLFloat $float$0_8 = makeDouble(0.8);



    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLString $$$es = makeString("es");

    private static final SubLString $$$s = makeString("s");

    private static final SubLInteger $int$1000000 = makeInteger(1000000);

    private static final SubLSymbol FORT_PRINT_NAME = makeSymbol("FORT-PRINT-NAME");

    private static final SubLSymbol STR_BY_TYPE = makeSymbol("STR-BY-TYPE");

    private static final SubLString $str125$__ = makeString("~%");

    private static final SubLList $list126 = list(makeString("#$ExpandSubLFn"), makeString("ExpandSubLFn"));

    private static final SubLList $list127 = list(makeString("#$SubLQuoteFn"), makeString("SubLQuoteFn"));

    public static final SubLList $list128 = list(CHAR_backslash);

    private static final SubLSymbol CYCLIFY_STATUS = makeSymbol("CYCLIFY-STATUS");

    private static final SubLSymbol CYCLIFY_STATUS_P = makeSymbol("CYCLIFY-STATUS-P");

    private static final SubLList $list131 = list(new SubLObject[]{ makeSymbol("OUT-STRING-LIST"), makeSymbol("REFERENCES-ADDED"), makeSymbol("INSIDE-QUOTE?"), makeSymbol("INSIDE-EL-VAR-NAME?"), makeSymbol("ALREADY-CYCLIFIED?"), makeSymbol("ESCAPE?"), makeSymbol("INSIDE-SUBL-QUOTE-FN?"), makeSymbol("INSIDE-EXPAND-SUBL-FN?"), makeSymbol("INSIDE-EXPAND-SUBL-FN-ARG1?"), makeSymbol("INSIDE-EXPAND-SUBL-FN-ARG2?"), makeSymbol("IMMEDIATELY-FOLLOWING-PAREN?"), makeSymbol("PAREN-COUNT") });

    private static final SubLList $list132 = list(new SubLObject[]{ makeKeyword("OUT-STRING-LIST"), makeKeyword("REFERENCES-ADDED"), makeKeyword("INSIDE-QUOTE?"), makeKeyword("INSIDE-EL-VAR-NAME?"), makeKeyword("ALREADY-CYCLIFIED?"), makeKeyword("ESCAPE?"), makeKeyword("INSIDE-SUBL-QUOTE-FN?"), makeKeyword("INSIDE-EXPAND-SUBL-FN?"), makeKeyword("INSIDE-EXPAND-SUBL-FN-ARG1?"), makeKeyword("INSIDE-EXPAND-SUBL-FN-ARG2?"), makeKeyword("IMMEDIATELY-FOLLOWING-PAREN?"), makeKeyword("PAREN-COUNT") });

    public static final SubLList $list133 = list(new SubLObject[]{ makeSymbol("CYCLIFY-STATUS-OUT-STRING-LIST"), makeSymbol("CYCLIFY-STATUS-REFERENCES-ADDED"), makeSymbol("CYCLIFY-STATUS-INSIDE-QUOTE?"), makeSymbol("CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?"), makeSymbol("CYCLIFY-STATUS-ALREADY-CYCLIFIED?"), makeSymbol("CYCLIFY-STATUS-ESCAPE?"), makeSymbol("CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?"), makeSymbol("CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?"), makeSymbol("CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?"), makeSymbol("CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?"), makeSymbol("CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?"), makeSymbol("CYCLIFY-STATUS-PAREN-COUNT") });

    public static final SubLList $list134 = list(new SubLObject[]{ makeSymbol("_CSETF-CYCLIFY-STATUS-OUT-STRING-LIST"), makeSymbol("_CSETF-CYCLIFY-STATUS-REFERENCES-ADDED"), makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-QUOTE?"), makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?"), makeSymbol("_CSETF-CYCLIFY-STATUS-ALREADY-CYCLIFIED?"), makeSymbol("_CSETF-CYCLIFY-STATUS-ESCAPE?"), makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?"), makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?"), makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?"), makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?"), makeSymbol("_CSETF-CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?"), makeSymbol("_CSETF-CYCLIFY-STATUS-PAREN-COUNT") });



    private static final SubLSymbol CYCLIFY_STATUS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CYCLIFY-STATUS-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list137 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CYCLIFY-STATUS-P"));

    private static final SubLSymbol CYCLIFY_STATUS_OUT_STRING_LIST = makeSymbol("CYCLIFY-STATUS-OUT-STRING-LIST");

    private static final SubLSymbol _CSETF_CYCLIFY_STATUS_OUT_STRING_LIST = makeSymbol("_CSETF-CYCLIFY-STATUS-OUT-STRING-LIST");

    private static final SubLSymbol CYCLIFY_STATUS_REFERENCES_ADDED = makeSymbol("CYCLIFY-STATUS-REFERENCES-ADDED");

    private static final SubLSymbol _CSETF_CYCLIFY_STATUS_REFERENCES_ADDED = makeSymbol("_CSETF-CYCLIFY-STATUS-REFERENCES-ADDED");

    private static final SubLSymbol $sym142$CYCLIFY_STATUS_INSIDE_QUOTE_ = makeSymbol("CYCLIFY-STATUS-INSIDE-QUOTE?");

    private static final SubLSymbol $sym143$_CSETF_CYCLIFY_STATUS_INSIDE_QUOTE_ = makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-QUOTE?");

    private static final SubLSymbol $sym144$CYCLIFY_STATUS_INSIDE_EL_VAR_NAME_ = makeSymbol("CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?");

    private static final SubLSymbol $sym145$_CSETF_CYCLIFY_STATUS_INSIDE_EL_VAR_NAME_ = makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?");

    private static final SubLSymbol $sym146$CYCLIFY_STATUS_ALREADY_CYCLIFIED_ = makeSymbol("CYCLIFY-STATUS-ALREADY-CYCLIFIED?");

    private static final SubLSymbol $sym147$_CSETF_CYCLIFY_STATUS_ALREADY_CYCLIFIED_ = makeSymbol("_CSETF-CYCLIFY-STATUS-ALREADY-CYCLIFIED?");

    private static final SubLSymbol $sym148$CYCLIFY_STATUS_ESCAPE_ = makeSymbol("CYCLIFY-STATUS-ESCAPE?");

    private static final SubLSymbol $sym149$_CSETF_CYCLIFY_STATUS_ESCAPE_ = makeSymbol("_CSETF-CYCLIFY-STATUS-ESCAPE?");

    private static final SubLSymbol $sym150$CYCLIFY_STATUS_INSIDE_SUBL_QUOTE_FN_ = makeSymbol("CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?");

    private static final SubLSymbol $sym151$_CSETF_CYCLIFY_STATUS_INSIDE_SUBL_QUOTE_FN_ = makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?");

    private static final SubLSymbol $sym152$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ = makeSymbol("CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?");

    private static final SubLSymbol $sym153$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ = makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?");

    private static final SubLSymbol $sym154$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG1_ = makeSymbol("CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?");

    private static final SubLSymbol $sym155$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG1_ = makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?");

    private static final SubLSymbol $sym156$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG2_ = makeSymbol("CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?");

    private static final SubLSymbol $sym157$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG2_ = makeSymbol("_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?");

    private static final SubLSymbol $sym158$CYCLIFY_STATUS_IMMEDIATELY_FOLLOWING_PAREN_ = makeSymbol("CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?");

    private static final SubLSymbol $sym159$_CSETF_CYCLIFY_STATUS_IMMEDIATELY_FOLLOWING_PAREN_ = makeSymbol("_CSETF-CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?");

    private static final SubLSymbol CYCLIFY_STATUS_PAREN_COUNT = makeSymbol("CYCLIFY-STATUS-PAREN-COUNT");

    private static final SubLSymbol _CSETF_CYCLIFY_STATUS_PAREN_COUNT = makeSymbol("_CSETF-CYCLIFY-STATUS-PAREN-COUNT");

    private static final SubLSymbol $OUT_STRING_LIST = makeKeyword("OUT-STRING-LIST");



    private static final SubLSymbol $kw164$INSIDE_QUOTE_ = makeKeyword("INSIDE-QUOTE?");

    private static final SubLSymbol $kw165$INSIDE_EL_VAR_NAME_ = makeKeyword("INSIDE-EL-VAR-NAME?");

    private static final SubLSymbol $kw166$ALREADY_CYCLIFIED_ = makeKeyword("ALREADY-CYCLIFIED?");



    private static final SubLSymbol $kw168$INSIDE_SUBL_QUOTE_FN_ = makeKeyword("INSIDE-SUBL-QUOTE-FN?");

    private static final SubLSymbol $kw169$INSIDE_EXPAND_SUBL_FN_ = makeKeyword("INSIDE-EXPAND-SUBL-FN?");

    private static final SubLSymbol $kw170$INSIDE_EXPAND_SUBL_FN_ARG1_ = makeKeyword("INSIDE-EXPAND-SUBL-FN-ARG1?");

    private static final SubLSymbol $kw171$INSIDE_EXPAND_SUBL_FN_ARG2_ = makeKeyword("INSIDE-EXPAND-SUBL-FN-ARG2?");

    private static final SubLSymbol $kw172$IMMEDIATELY_FOLLOWING_PAREN_ = makeKeyword("IMMEDIATELY-FOLLOWING-PAREN?");



    private static final SubLString $str174$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_CYCLIFY_STATUS = makeSymbol("MAKE-CYCLIFY-STATUS");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CYCLIFY_STATUS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CYCLIFY-STATUS-METHOD");

    private static final SubLSymbol CYCLIFY_STRING = makeSymbol("CYCLIFY-STRING");

    private static final SubLString $str181$__ = makeString("_-");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLString $$$quit_reading_file = makeString("quit reading file");

    private static final SubLString $str184$string_read_larger_than_buffer_si = makeString("string read larger than buffer size of ~S");

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLString $str186$_a = makeString("~a");









    private static final SubLString $str191$Unknown_State__S__Flaw_in_state_m = makeString("Unknown State ~S: Flaw in state machine design.");



    private static final SubLString $str193$Unknown_state__S__Design_flaw_in_ = makeString("Unknown state ~S: Design flaw in state machine.");



    private static final SubLSymbol FUNCTION_SYMBOL_P = makeSymbol("FUNCTION-SYMBOL-P");



    private static final SubLString $str197$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str198$Could_not_open_an_input_stream_fo = makeString("Could not open an input stream for ~S.");



    private static final SubLString $str200$__Cannot_open_input_stream_for__A = makeString("~%Cannot open input stream for ~A");

    private static final SubLString $str201$_ = makeString("_");

    private static final SubLInteger $int$97 = makeInteger(97);

    private static final SubLInteger $int$26 = makeInteger(26);

    private static final SubLSymbol ALPHANUMERIC_OR_HYPHEN_P = makeSymbol("ALPHANUMERIC-OR-HYPHEN-P");

    private static final SubLString $str205$_a_is_not_a_number_between_0_and_ = makeString("~a is not a number between 0 and 25");

    private static final SubLSymbol NON_ALPHANUMERIC_P = makeSymbol("NON-ALPHANUMERIC-P");

    private static final SubLSymbol KEYWORD_IMPOSTOR_P = makeSymbol("KEYWORD-IMPOSTOR-P");



    private static final SubLString $str209$__a = makeString(",~a");



    private static final SubLList $list211 = list(new SubLObject[]{ list(list(makeString("")), makeString("")), list(list(makeString("Dog")), makeString("#$Dog")), list(list(makeString("\"Dog\"")), makeString("\"Dog\"")), list(list(makeString("\\\"Dog\\\"")), makeString("\\\"#$Dog\\\"")), list(list(makeString("(comment Dog \"A ... Dog ... Muffet\")")), makeString("(#$comment #$Dog \"A ... Dog ... Muffet\")")), list(list(makeString("(isa Muffet Dog)")), makeString("(#$isa #$Muffet #$Dog)")), list(list(makeString("(isa ?Muffet Dog)")), makeString("(#$isa ?Muffet #$Dog)")), list(list(makeString("Thing")), makeString("#$Thing")), list(list(makeString("\"Thing\"")), makeString("\"Thing\"")), list(list(makeString("Xyzzy")), makeString("Xyzzy")), list(list(makeString("SubLQuoteFn Thing")), makeString("#$SubLQuoteFn #$Thing")), list(list(makeString("ExpandSubLFn () Thing")), makeString("#$ExpandSubLFn () #$Thing")), list(list(makeString("'Dog")), makeString("'#$Dog")) });

    private static final SubLSymbol $sym212$SUBWORD_ = makeSymbol("SUBWORD?");

    public static final SubLList $list213 = list(list(list(makeString("emus"), makeString("Emus are nice"), NIL, EQUALP), T), list(list(makeString("emus"), makeString("Emus are nice"), NIL, EQUAL), NIL), list(list(makeString("emus"), makeString("")), NIL), list(list(makeString("emus"), makeString("e"), list(CHAR_period)), NIL), list(list(makeString("emus"), makeString(".emus."), list(CHAR_period)), T), list(list(makeString("..emus."), makeString("emus"), list(CHAR_period)), T), list(list(makeString("emus"), makeString("I like emus."), list(CHAR_period), EQUALP), T), list(list(makeString(".."), makeString("Emus are nice"), list(CHAR_period), EQUAL), NIL));

    private static final SubLSymbol STRING_DOWNCASE_EXCEPT_ACRONYMS = makeSymbol("STRING-DOWNCASE-EXCEPT-ACRONYMS");

    private static final SubLObject $list215 = _constant_215_initializer();

    private static final SubLSymbol SPACE_DONT_UNCAPITALIZE = makeSymbol("SPACE-DONT-UNCAPITALIZE");

    private static final SubLObject $list217 = _constant_217_initializer();

    private static final SubLSymbol $sym218$QUOTED_STRING_ = makeSymbol("QUOTED-STRING?");

    private static final SubLList $list219 = list(list(list(makeString("")), NIL), list(list(makeString("string")), NIL), list(list(makeString("'string")), NIL), list(list(makeString("'string'")), T));

    private static final SubLSymbol CONCATENATE_ADJACENT_STRINGS = makeSymbol("CONCATENATE-ADJACENT-STRINGS");

    private static final SubLList $list221 = list(list(list(list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), list(list(list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, makeString("a"), makeString("b"), makeString("C"))), list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, makeString("abC"))), list(list(list(new SubLObject[]{ makeString("e"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, makeString("a"), makeString("b"), makeString("C"), FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, makeString("c") })), list(new SubLObject[]{ makeString("e"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, makeString("abC"), FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, makeString("c") })), list(list(list(new SubLObject[]{ makeString("e"), makeString("f"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, makeString("a"), makeString("b"), makeString("C"), FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, makeString("c"), makeString("e") })), list(new SubLObject[]{ makeString("ef"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, makeString("abC"), FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, makeString("ce") })));

    private static final SubLSymbol FORMAT_NIL_TEST = makeSymbol("FORMAT-NIL-TEST");

    private static final SubLList $list223 = list(new SubLObject[]{ list(list(makeString("~7,1F"), makeDouble(1.999)), makeString("    2.0")), list(list(makeString("~2,1F"), makeDouble(1.999)), makeString("2.0")), list(list(makeString("~4,1F"), makeDouble(1.999)), makeString(" 2.0")), list(list(makeString("~4,F"), makeDouble(1.999)), makeString(" 2.0")), list(list(makeString("~4,F"), makeDouble(1.199)), makeString(" 1.2")), list(list(makeString("~2,1F"), makeDouble(19.999)), makeString("20.0")), list(list(makeString("~2,1F"), makeDouble(99.999)), makeString("100.0")), list(list(makeString("~1,1F"), makeDouble(99.999)), makeString("100.0")), list(list(makeString("~2,F"), makeDouble(99.999)), makeString("100.")), list(list(makeString("~2,F"), makeDouble(100.0)), makeString("100.")), list(list(makeString("~2,F"), makeDouble(100.5)), makeString("101.")), list(list(makeString("~2,0F"), makeDouble(100.5111)), makeString("101.")), list(list(makeString("~2,1F"), makeDouble(100.5111)), makeString("100.5")), list(list(makeString("~1,3F"), makeDouble(99.999)), makeString("99.999")), list(list(makeString("~7,3F"), makeDouble(99.9)), makeString(" 99.900")), list(list(makeString("~7,7F"), makeDouble(1.01)), makeString("1.0100000")), list(list(makeString("~7,8F"), makeDouble(99.999)), makeString("99.99900000")), list(list(makeString("~4,2F"), makeDouble(6.375)), makeString("6.38")), list(list(makeString("~2,F"), makeDouble(5.2292)), makeString("5.")), list(list(makeString("~1,F"), makeDouble(5.2292)), makeString("5.")), list(list(makeString("~,F"), makeDouble(5.2292)), makeString("5.2292")), list(list(makeString("~4,F"), makeDouble(33.0)), makeString("33.0")), list(list(makeString("~4,F"), makeDouble(11.330999)), makeString("11.3")), list(list(makeString("~4,F"), makeDouble(0.330999)), makeString(".331")), list(list(makeString("~4,F"), makeDouble(1.0999)), makeString(" 1.1")), list(list(makeString("~5F"), makeDouble(9.9999)), makeString(" 10.0")), list(list(makeString("~5,3F"), makeDouble(9.9999)), makeString("10.000")), list(list(makeString("~,4F"), makeDouble(9.99999)), makeString("10.0000")), list(list(makeString("~,4F"), makeDouble(9.99995)), makeString("10.0000")), list(list(makeString("~,4F"), makeDouble(9.99994)), makeString("9.9999")) });

    private static final SubLSymbol HEX_INT_FROM_STRING = makeSymbol("HEX-INT-FROM-STRING");

    private static final SubLList $list225 = list(list(list(makeString("0x410bf")), makeInteger(266431)));

    public static SubLObject not_test_char(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.not_eql(obj, $test_char$.getDynamicValue(thread));
    }

    public static SubLObject do_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        string = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list1);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list1);
            if (NIL == member(current_$1, $list2, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list1);
        }
        final SubLObject break_char_tail = property_list_member($BREAK_CHAR, current);
        final SubLObject break_char = (NIL != break_char_tail) ? cadr(break_char_tail) : $space_char$;
        final SubLObject body;
        current = body = temp;
        final SubLObject word_list_var = $sym6$WORD_LIST_VAR;
        return list(CLET, list(list($test_char$, break_char), list(word_list_var, listS(BREAK_WORDS, string, $list10))), listS(CDOLIST, list(word, word_list_var), append(body, NIL)));
    }

    public static SubLObject empty_string_p(final SubLObject v_object) {
        return equal($empty_string$.getGlobalValue(), v_object);
    }

    public static SubLObject empty_stringP(final SubLObject string) {
        return empty_string_p(string);
    }

    public static SubLObject non_empty_string_p(final SubLObject v_object) {
        return makeBoolean(v_object.isString() && (NIL == empty_string_p(v_object)));
    }

    public static SubLObject every_in_string(final SubLObject predicate, final SubLObject string, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLObject ans = NIL;
        if (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) {
            final SubLObject end_var = length(string);
            if (NIL == ans) {
                SubLObject end_var_$2;
                SubLObject char_num;
                SubLObject v_char;
                for (end_var_$2 = end_var, char_num = NIL, char_num = ZERO_INTEGER; (NIL == ans) && (!char_num.numGE(end_var_$2)); ans = makeBoolean(NIL == funcall(predicate, v_char)) , char_num = number_utilities.f_1X(char_num)) {
                    v_char = Strings.sublisp_char(string, char_num);
                }
            }
        } else {
            final SubLObject end_var = length(string);
            if (NIL == ans) {
                SubLObject char_num;
                SubLObject v_char;
                SubLObject end_var_$3;
                for (end_var_$3 = end_var, char_num = NIL, char_num = ZERO_INTEGER; (NIL == ans) && (!char_num.numGE(end_var_$3)); ans = makeBoolean(NIL == funcall(predicate, funcall(key, v_char))) , char_num = number_utilities.f_1X(char_num)) {
                    v_char = Strings.sublisp_char(string, char_num);
                }
            }
        }
        return makeBoolean(NIL == ans);
    }

    public static SubLObject any_in_string(final SubLObject predicate, final SubLObject string, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLObject ans = NIL;
        if (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) {
            final SubLObject end_var = length(string);
            if (NIL == ans) {
                SubLObject end_var_$4;
                SubLObject char_num;
                SubLObject v_char;
                for (end_var_$4 = end_var, char_num = NIL, char_num = ZERO_INTEGER; (NIL == ans) && (!char_num.numGE(end_var_$4)); ans = funcall(predicate, v_char) , char_num = number_utilities.f_1X(char_num)) {
                    v_char = Strings.sublisp_char(string, char_num);
                }
            }
        } else {
            final SubLObject end_var = length(string);
            if (NIL == ans) {
                SubLObject char_num;
                SubLObject v_char;
                SubLObject end_var_$5;
                for (end_var_$5 = end_var, char_num = NIL, char_num = ZERO_INTEGER; (NIL == ans) && (!char_num.numGE(end_var_$5)); ans = funcall(predicate, funcall(key, v_char)) , char_num = number_utilities.f_1X(char_num)) {
                    v_char = Strings.sublisp_char(string, char_num);
                }
            }
        }
        return ans;
    }

    public static SubLObject list_of_string_p(final SubLObject v_object) {
        return list_utilities.list_of_type_p(symbol_function(STRINGP), v_object);
    }

    public static SubLObject clear_object_to_string() {
        final SubLObject cs = $object_to_string_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_object_to_string(final SubLObject v_object) {
        return memoization_state.caching_state_remove_function_results_with_args($object_to_string_caching_state$.getGlobalValue(), list(v_object), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject object_to_string_internal(final SubLObject v_object) {
        return princ_to_string(v_object);
    }

    public static SubLObject object_to_string(final SubLObject v_object) {
        SubLObject caching_state = $object_to_string_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(OBJECT_TO_STRING, $object_to_string_caching_state$, $int$1000, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(object_to_string_internal(v_object)));
            memoization_state.caching_state_put(caching_state, v_object, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject fort_to_string(final SubLObject fort) {
        if (NIL != constant_p(fort)) {
            return object_to_string(fort);
        }
        if (NIL != nart_handles.nart_p(fort)) {
            return object_to_string(narts_high.nart_el_formula(fort));
        }
        return NIL;
    }

    public static SubLObject function_to_string(final SubLObject function) {
        if (function.isSymbol()) {
            return symbol_name(function);
        }
        if (function.isFunction()) {
            return post_remove(string_upto(substring(princ_to_string(function), ELEVEN_INTEGER, UNPROVIDED), UNPROVIDED), $str16$_, UNPROVIDED);
        }
        return princ_to_string(function);
    }

    public static SubLObject to_string(final SubLObject value) {
        return princ_to_string(value);
    }

    public static SubLObject non_nil_to_string(final SubLObject value) {
        if (NIL != value) {
            return to_string(value);
        }
        return NIL;
    }

    public static SubLObject to_lisp_string(final SubLObject value) {
        return unquote_string(prin1_to_string(value));
    }

    public static SubLObject to_string_of_length(final SubLObject v_object, final SubLObject length) {
        final SubLObject string = to_string(v_object);
        final SubLObject string_length = length(string);
        return string_length.numGE(length) ? string_first_n(length, string) : cconcatenate(string, Strings.make_string(subtract(length, string_length), UNPROVIDED));
    }

    public static SubLObject first_n_list_items_to_string(final SubLObject list, final SubLObject n) {
        SubLObject result = NIL;
        final SubLObject last_index = number_utilities.f_1_(length(list));
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            write_string($str17$_, stream, UNPROVIDED, UNPROVIDED);
            SubLObject cdotimes_end_var;
            SubLObject index;
            for (cdotimes_end_var = number_utilities.minimum(list(n, length(list)), UNPROVIDED), index = NIL, index = ZERO_INTEGER; index.numL(cdotimes_end_var); index = add(index, ONE_INTEGER)) {
                write_string(to_string(elt(list, index)), stream, UNPROVIDED, UNPROVIDED);
                if (!index.eql(last_index)) {
                    write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
                }
            }
            if (n.numL(length(list))) {
                write_string($str19$___, stream, UNPROVIDED, UNPROVIDED);
            }
            write_string($str20$_, stream, UNPROVIDED, UNPROVIDED);
            result = get_output_stream_string(stream);
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
        return result;
    }

    public static SubLObject char_at(final SubLObject string, final SubLObject index) {
        if (index.numGE(ZERO_INTEGER) && index.numL(length(string))) {
            return Strings.sublisp_char(string, index);
        }
        return NIL;
    }

    public static SubLObject quote_string(final SubLObject string, SubLObject quote_string) {
        if (quote_string == UNPROVIDED) {
            quote_string = $str21$_;
        }
        return pre_fix(post_fix(string, quote_string), quote_string);
    }

    public static SubLObject unquote_string(final SubLObject string) {
        SubLObject result = string;
        if (NIL != quoted_stringP(string)) {
            result = substring(result, ONE_INTEGER, number_utilities.f_1_(length(string)));
        }
        return result;
    }

    public static SubLObject quoted_stringP(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        if (NIL != list_utilities.lengthLE(string, ONE_INTEGER, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject lead_char = first_char(string);
        final SubLObject quotedP = makeBoolean((lead_char.eql(CHAR_quote) || lead_char.eql(CHAR_quotation)) && lead_char.eql(last_char(string)));
        return quotedP;
    }

    public static SubLObject str(final SubLObject v_object) {
        return format_nil.format_nil_a(v_object);
    }

    public static SubLObject printed_forms_equalP(final SubLObject form1, final SubLObject form2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        return funcall(test, transform_list_utilities.quiescent_transform(form1, symbol_function(READABLE_P), symbol_function(READ_FROM_STRING_IGNORING_ERRORS), symbol_function(OBJECT_TO_STRING), UNPROVIDED), transform_list_utilities.quiescent_transform(form2, symbol_function(READABLE_P), symbol_function(READ_FROM_STRING_IGNORING_ERRORS), symbol_function(OBJECT_TO_STRING), UNPROVIDED));
    }

    public static SubLObject readable_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject string = object_to_string(v_object);
        thread.resetMultipleValues();
        final SubLObject read_as = read_from_string_ignoring_errors(string, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject status = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return makeBoolean(!status.eql($ERROR));
    }

    public static SubLObject string_to_number(final SubLObject string) {
        final SubLObject result = read_from_string_ignoring_errors(string, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result.isNumber() ? result : NIL;
    }

    public static SubLObject string_to_integer(final SubLObject string) {
        final SubLObject result = read_from_string_ignoring_errors(string, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result.isInteger() ? result : NIL;
    }

    public static SubLObject integer_string_p(final SubLObject string) {
        return string_to_integer(string);
    }

    public static SubLObject integer_stringL(final SubLObject integer_string1, final SubLObject integer_string2) {
        final SubLObject integer1 = string_to_integer(integer_string1);
        final SubLObject integer2 = string_to_integer(integer_string2);
        if (NIL == integer2) {
            return T;
        }
        if (NIL == integer1) {
            return NIL;
        }
        return numL(integer1, integer2);
    }

    public static SubLObject to_hex_string(final SubLObject integer) {
        return format(NIL, $str25$_X, integer);
    }

    public static SubLObject hex_int_from_string(final SubLObject string) {
        final SubLObject end = length(string);
        return parse_integer(string, TWO_INTEGER, end, SIXTEEN_INTEGER, UNPROVIDED);
    }

    public static SubLObject string_length_L(final SubLObject string1, final SubLObject string2) {
        return numL(length(string1), length(string2));
    }

    public static SubLObject indent(final SubLObject stream, final SubLObject n) {
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
            write_char(CHAR_space, stream);
        }
        return stream;
    }

    public static SubLObject aref_from_end(final SubLObject vector, SubLObject index) {
        assert NIL != fixnump(index) : "Types.fixnump(index) " + "CommonSymbols.NIL != Types.fixnump(index) " + index;
        index = subtract(length(vector), index, ONE_INTEGER);
        return aref(vector, index);
    }

    public static SubLObject char_from_end(final SubLObject string, final SubLObject index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.lengthGE(string, index, UNPROVIDED))) {
            Errors.error($str27$_S_is_too_short_to_remove__D_char, string, index);
        }
        return aref_from_end(string, index);
    }

    public static SubLObject first_char(final SubLObject string) {
        return Strings.sublisp_char(string, ZERO_INTEGER);
    }

    public static SubLObject first_of_string(final SubLObject string) {
        return string_first_n(ONE_INTEGER, string);
    }

    public static SubLObject rest_of_string(final SubLObject string) {
        assert NIL != non_empty_stringP(string) : "string_utilities.non_empty_stringP(string) " + "CommonSymbols.NIL != string_utilities.non_empty_stringP(string) " + string;
        return strip_first(string);
    }

    public static SubLObject last_char(final SubLObject string) {
        return char_from_end(string, ZERO_INTEGER);
    }

    public static SubLObject pre_add_character_to_string(final SubLObject v_char, final SubLObject string) {
        return replace(Strings.make_string(number_utilities.f_1X(length(string)), v_char), string, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject post_add_character_to_string(final SubLObject v_char, final SubLObject string) {
        return replace(Strings.make_string(number_utilities.f_1X(length(string)), v_char), string, ZERO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pre_and_post_add_character_to_string(final SubLObject v_char, final SubLObject string) {
        return replace(Strings.make_string(add(TWO_INTEGER, length(string)), v_char), string, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject copy_string(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        return copy_seq(string);
    }

    public static SubLObject string_substitute(final SubLObject v_new, final SubLObject old, final SubLObject string, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        assert NIL != stringp(v_new) : "Types.stringp(v_new) " + "CommonSymbols.NIL != Types.stringp(v_new) " + v_new;
        assert NIL != stringp(old) : "Types.stringp(old) " + "CommonSymbols.NIL != Types.stringp(old) " + old;
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        if (NIL == search(old, string, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return string;
        }
        final SubLObject old_length = length(old);
        if (ZERO_INTEGER.numE(old_length) && (NIL == funcall(test, old, $str0$))) {
            return string;
        }
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject string_length = length(string);
            if (ZERO_INTEGER.numE(old_length)) {
                SubLObject search_start;
                SubLObject old_position;
                for (search_start = NIL, search_start = ZERO_INTEGER; search_start.numL(string_length); search_start = add(search_start, ONE_INTEGER)) {
                    old_position = add(ONE_INTEGER, search_start);
                    write_string(v_new, stream, UNPROVIDED, UNPROVIDED);
                    write_string(string, stream, search_start, old_position);
                }
                write_string(v_new, stream, UNPROVIDED, UNPROVIDED);
            } else {
                SubLObject search_start;
                SubLObject old_position;
                for (search_start = NIL, old_position = NIL, search_start = ZERO_INTEGER, old_position = search(old, string, test, symbol_function(IDENTITY), ZERO_INTEGER, old_length, search_start, string_length); NIL != old_position; old_position = search(old, string, test, symbol_function(IDENTITY), ZERO_INTEGER, old_length, search_start, string_length)) {
                    write_string(string, stream, search_start, old_position);
                    write_string(v_new, stream, UNPROVIDED, UNPROVIDED);
                    search_start = add(old_position, old_length);
                }
                write_string(string, stream, search_start, UNPROVIDED);
            }
            result = get_output_stream_string(stream);
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
        return result;
    }

    public static SubLObject string_substitute_word(final SubLObject v_new, final SubLObject word, final SubLObject string, SubLObject test, SubLObject word_boundary) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (word_boundary == UNPROVIDED) {
            word_boundary = $space_char$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(v_new) : "Types.stringp(v_new) " + "CommonSymbols.NIL != Types.stringp(v_new) " + v_new;
        assert NIL != stringp(word) : "Types.stringp(word) " + "CommonSymbols.NIL != Types.stringp(word) " + word;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != find(word_boundary, word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str29$_S_must_be_a_single_word___cannot, word, word_boundary);
        }
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = $test_char$.currentBinding(thread);
            try {
                $test_char$.bind(word_boundary, thread);
                SubLObject cdolist_list_var;
                final SubLObject word_list_var = cdolist_list_var = break_words(string, NOT_TEST_CHAR, UNPROVIDED);
                SubLObject this_word = NIL;
                this_word = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != funcall(test, this_word, word)) {
                        write_string(v_new, stream, UNPROVIDED, UNPROVIDED);
                    } else {
                        write_string(this_word, stream, UNPROVIDED, UNPROVIDED);
                    }
                    write_char(word_boundary, stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    this_word = cdolist_list_var.first();
                } 
            } finally {
                $test_char$.rebind(_prev_bind_0, thread);
            }
            result = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return string_butlast(result);
    }

    public static SubLObject do_string_substitutions(final SubLObject string, final SubLObject subst_list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (length(string).numE(ZERO_INTEGER)) {
            return string;
        }
        SubLObject result = Strings.make_string(max($int$100, multiply(FOUR_INTEGER, length(string))), UNPROVIDED);
        SubLObject result_end = ZERO_INTEGER;
        SubLObject index;
        SubLObject start = index = ZERO_INTEGER;
        SubLObject something_copiedP = NIL;
        for (SubLObject done = NIL; NIL == done; done = numGE(index, length(string))) {
            SubLObject found = NIL;
            SubLObject position = NIL;
            if (NIL == found) {
                SubLObject csome_list_var = subst_list;
                SubLObject sub = NIL;
                sub = csome_list_var.first();
                while ((NIL == found) && (NIL != csome_list_var)) {
                    position = search(sub.first(), string, test, symbol_function(IDENTITY), ZERO_INTEGER, NIL, index, NIL);
                    if (NIL != position) {
                        found = sub;
                    }
                    csome_list_var = csome_list_var.rest();
                    sub = csome_list_var.first();
                } 
            }
            if (NIL != found) {
                something_copiedP = T;
                result = replace(result, string, result_end, NIL, start, position);
                result_end = add(result_end, subtract(position, start));
                result = replace(result, found.rest(), result_end, NIL, ZERO_INTEGER, length(found.rest()));
                result_end = add(result_end, length(found.rest()));
                start = index = add(position, length(found.first()));
            } else {
                index = add(index, ONE_INTEGER);
            }
        }
        if (NIL != something_copiedP) {
            replace(result, string, result_end, NIL, start, index);
            result_end = add(result_end, subtract(index, start));
            result = subseq(result, ZERO_INTEGER, result_end);
        } else {
            result = string;
        }
        return result;
    }

    public static SubLObject do_string_substitutions_robust(final SubLObject string, final SubLObject subst_list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (length(string).numE(ZERO_INTEGER)) {
            return string;
        }
        SubLObject result = Strings.make_string(max($int$256, multiply(FOUR_INTEGER, length(string))), UNPROVIDED);
        SubLObject result_end = ZERO_INTEGER;
        SubLObject index;
        SubLObject start = index = ZERO_INTEGER;
        SubLObject something_copiedP = NIL;
        for (SubLObject done = NIL; NIL == done; done = numGE(index, length(string))) {
            SubLObject min = length(string);
            SubLObject found = NIL;
            SubLObject position = NIL;
            SubLObject cdolist_list_var = subst_list;
            SubLObject sub = NIL;
            sub = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                position = search(sub.first(), string, test, symbol_function(IDENTITY), ZERO_INTEGER, NIL, index, NIL);
                if ((NIL != position) && position.numL(min)) {
                    min = position;
                    found = sub;
                }
                cdolist_list_var = cdolist_list_var.rest();
                sub = cdolist_list_var.first();
            } 
            if (NIL != found) {
                something_copiedP = T;
                result = replace(result, string, result_end, NIL, start, min);
                result_end = add(result_end, subtract(min, start));
                result = replace(result, found.rest(), result_end, NIL, ZERO_INTEGER, length(found.rest()));
                result_end = add(result_end, length(found.rest()));
                start = index = add(min, length(found.first()));
            } else {
                index = add(index, ONE_INTEGER);
            }
        }
        if (NIL != something_copiedP) {
            replace(result, string, result_end, NIL, start, index);
            result_end = add(result_end, subtract(index, start));
            result = subseq(result, ZERO_INTEGER, result_end);
        } else {
            result = string;
        }
        return result;
    }

    public static SubLObject insert_escape_for_chars_in_string(final SubLObject chars, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(chars) : "Types.listp(chars) " + "CommonSymbols.NIL != Types.listp(chars) " + chars;
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.every_in_list(symbol_function(CHARACTERP), chars, UNPROVIDED))) {
            Errors.error($str35$Some_element_of__A_is_not_charact, chars);
        }
        if (NIL == chars) {
            return string;
        }
        if (string.equal($str0$)) {
            return string;
        }
        SubLObject increase = ZERO_INTEGER;
        SubLObject end_var_$6;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject string_char;
        for (end_var = end_var_$6 = length(string), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$6); char_num = number_utilities.f_1X(char_num)) {
            string_char = Strings.sublisp_char(string, char_num);
            if (NIL != subl_promotions.memberP(string_char, chars, UNPROVIDED, UNPROVIDED)) {
                increase = add(increase, ONE_INTEGER);
            }
        }
        if (increase.numE(ZERO_INTEGER)) {
            return string;
        }
        final SubLObject new_string = Strings.make_string(add(length(string), increase), UNPROVIDED);
        SubLObject index = ZERO_INTEGER;
        SubLObject drift = ZERO_INTEGER;
        SubLObject end_var_$7;
        SubLObject end_var2;
        SubLObject char_num2;
        SubLObject string_char2;
        for (end_var2 = end_var_$7 = length(string), char_num2 = NIL, char_num2 = ZERO_INTEGER; !char_num2.numGE(end_var_$7); char_num2 = number_utilities.f_1X(char_num2)) {
            string_char2 = Strings.sublisp_char(string, char_num2);
            if (NIL != subl_promotions.memberP(string_char2, chars, UNPROVIDED, UNPROVIDED)) {
                Strings.set_char(new_string, add(index, drift), CHAR_backslash);
                drift = add(drift, ONE_INTEGER);
            }
            Strings.set_char(new_string, add(index, drift), elt(string, index));
            index = add(index, ONE_INTEGER);
        }
        return new_string;
    }

    public static SubLObject html_escaped_string_p(final SubLObject string) {
        SubLObject inside_escapeP = NIL;
        SubLObject numericP = misc_utilities.uninitialized();
        SubLObject hexP = misc_utilities.uninitialized();
        SubLObject found_escapeP = NIL;
        final SubLObject end_var = length(string);
        if (NIL == found_escapeP) {
            SubLObject end_var_$8;
            SubLObject char_num;
            SubLObject v_char;
            for (end_var_$8 = end_var, char_num = NIL, char_num = ZERO_INTEGER; (NIL == found_escapeP) && (!char_num.numGE(end_var_$8)); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(string, char_num);
                if (v_char.eql(CHAR_ampersand)) {
                    inside_escapeP = T;
                    numericP = misc_utilities.uninitialized();
                    hexP = misc_utilities.uninitialized();
                } else
                    if (NIL != inside_escapeP) {
                        if (v_char.eql(CHAR_semicolon)) {
                            found_escapeP = T;
                        } else
                            if (NIL != digit_char_p(v_char, UNPROVIDED)) {
                                if (NIL != misc_utilities.uninitialized_p(numericP)) {
                                    numericP = NIL;
                                } else
                                    if (NIL != misc_utilities.uninitialized_p(hexP)) {
                                        hexP = NIL;
                                    }

                            } else
                                if (((v_char.eql(CHAR_x) && (NIL != misc_utilities.initialized_p(numericP))) && (NIL != numericP)) && (NIL != misc_utilities.uninitialized_p(hexP))) {
                                    hexP = T;
                                } else
                                    if (NIL != alpha_char_p(v_char)) {
                                        if (NIL != misc_utilities.uninitialized_p(numericP)) {
                                            numericP = NIL;
                                        } else
                                            if ((NIL != numericP) && (NIL.eql(hexP) || (NIL == hex_char_p(v_char)))) {
                                                inside_escapeP = NIL;
                                                numericP = misc_utilities.uninitialized();
                                                hexP = misc_utilities.uninitialized();
                                            }

                                    } else
                                        if (CHAR_hash.eql(v_char) && (NIL != misc_utilities.uninitialized_p(numericP))) {
                                            numericP = T;
                                        } else {
                                            inside_escapeP = NIL;
                                            numericP = misc_utilities.uninitialized();
                                            hexP = misc_utilities.uninitialized();
                                        }




                    }

            }
        }
        return found_escapeP;
    }

    public static SubLObject remove_last_char(final SubLObject string, SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        return substring(string, ZERO_INTEGER, subtract(length(string), n));
    }

    public static SubLObject remove_substring(final SubLObject string, final SubLObject substring) {
        if (NIL != substringP(substring, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return do_string_substitutions_robust(string, list(cons(substring, $empty_string$.getGlobalValue())), UNPROVIDED);
        }
        return string;
    }

    public static SubLObject replace_substring(final SubLObject string, final SubLObject substring, final SubLObject v_new) {
        if (NIL != substringP(substring, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return do_string_substitutions_robust(string, list(cons(substring, v_new)), UNPROVIDED);
        }
        return string;
    }

    public static SubLObject replace_substring_once(final SubLObject string, final SubLObject substring, final SubLObject v_new, SubLObject start) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        final SubLObject pos = search(substring, string, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, NIL, start, UNPROVIDED);
        if (NIL != pos) {
            final SubLObject new_string = cconcatenate(substring(string, ZERO_INTEGER, pos), new SubLObject[]{ v_new, substring(string, add(pos, length(substring)), UNPROVIDED) });
            return new_string;
        }
        return NIL;
    }

    public static SubLObject nreplace_substring_at(final SubLObject string, final SubLObject start, final SubLObject length, final SubLObject v_new) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != subl_promotions.non_negative_integer_p(start) : "subl_promotions.non_negative_integer_p(start) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(start) " + start;
        assert NIL != subl_promotions.non_negative_integer_p(length) : "subl_promotions.non_negative_integer_p(length) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(length) " + length;
        assert NIL != stringp(v_new) : "Types.stringp(v_new) " + "CommonSymbols.NIL != Types.stringp(v_new) " + v_new;
        if (NIL != list_utilities.lengthE(v_new, length, UNPROVIDED)) {
            SubLObject end_var_$9;
            SubLObject end_var;
            SubLObject char_num;
            SubLObject v_char;
            for (end_var = end_var_$9 = length(v_new), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$9); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(v_new, char_num);
                Strings.set_char(string, add(start, char_num), v_char);
            }
            return string;
        }
        return cconcatenate(substring(string, ZERO_INTEGER, start), new SubLObject[]{ v_new, substring(string, add(start, length), UNPROVIDED) });
    }

    public static SubLObject infix(final SubLObject str1, final SubLObject str2, final SubLObject place) {
        if (length(str2).numG(place)) {
            return cconcatenate(substring(str2, ZERO_INTEGER, add(place, ONE_INTEGER)), new SubLObject[]{ str1, substring(str2, add(place, ONE_INTEGER), length(str2)) });
        }
        return NIL;
    }

    public static SubLObject post_fix(final SubLObject w, final SubLObject p) {
        return cconcatenate(w, p);
    }

    public static SubLObject pre_fix(final SubLObject w, final SubLObject p) {
        return cconcatenate(p, w);
    }

    public static SubLObject post_remove(final SubLObject w, final SubLObject p, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        final SubLObject lp = length(p);
        final SubLObject lw = length(w);
        return NIL != ends_with(w, p, test) ? substring(w, ZERO_INTEGER, subtract(lw, lp)) : w;
    }

    public static SubLObject pre_remove(final SubLObject w, final SubLObject p, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        return NIL != starts_with_by_test(w, p, test) ? substring(w, length(p), UNPROVIDED) : w;
    }

    public static SubLObject substring(final SubLObject string, final SubLObject start, SubLObject end) {
        if (end == UNPROVIDED) {
            end = NIL;
        }
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        return subseq(string, start, end);
    }

    public static SubLObject string_first_n(final SubLObject n, final SubLObject string) {
        final SubLObject end = min(n, length(string));
        return substring(string, ZERO_INTEGER, end);
    }

    public static SubLObject string_last_n(final SubLObject n, final SubLObject string) {
        final SubLObject len = length(string);
        final SubLObject start = subtract(len, min(n, len));
        return substring(string, start, len);
    }

    public static SubLObject string_butlast(final SubLObject string) {
        return strip_final(string, UNPROVIDED);
    }

    public static SubLObject ends_with(final SubLObject w, final SubLObject ending, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        return makeBoolean((NIL != list_utilities.greater_or_same_length_p(w, ending)) && (NIL != substring_matchP(w, ending, subtract(length(w), length(ending)), test)));
    }

    public static SubLObject ends_with_one_of(final SubLObject string, final SubLObject ending_strings) {
        SubLObject v_boolean = NIL;
        SubLObject matching_string = NIL;
        if (NIL == v_boolean) {
            SubLObject csome_list_var = ending_strings;
            SubLObject s = NIL;
            s = csome_list_var.first();
            while ((NIL == v_boolean) && (NIL != csome_list_var)) {
                v_boolean = ends_with(string, s, UNPROVIDED);
                if (NIL != v_boolean) {
                    matching_string = s;
                }
                csome_list_var = csome_list_var.rest();
                s = csome_list_var.first();
            } 
        }
        return values(v_boolean, matching_string);
    }

    public static SubLObject ends_with_punctuation_p(final SubLObject stryng) {
        final SubLObject string_length = length(stryng);
        final SubLObject end_char = Strings.sublisp_char(stryng, subtract(string_length, ONE_INTEGER));
        return punctuation_p(end_char);
    }

    public static SubLObject ends_with_number_p(final SubLObject str) {
        return digit_char_p(last_char(str), UNPROVIDED);
    }

    public static SubLObject ends_with_number(final SubLObject str) {
        SubLObject last_num_index = NIL;
        SubLObject done = NIL;
        final SubLObject string_var = reverse(str);
        final SubLObject end_var = length(string_var);
        if (NIL == done) {
            SubLObject end_var_$10;
            SubLObject char_num;
            SubLObject v_char;
            for (end_var_$10 = end_var, char_num = NIL, char_num = ZERO_INTEGER; (NIL == done) && (!char_num.numGE(end_var_$10)); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(string_var, char_num);
                if (NIL != digit_char_p(v_char, UNPROVIDED)) {
                    last_num_index = char_num;
                } else {
                    done = T;
                }
            }
        }
        if (NIL == last_num_index) {
            return NIL;
        }
        final SubLObject number_string = subseq(str, subtract(length(str), ONE_INTEGER, last_num_index), UNPROVIDED);
        final SubLObject number = read_from_string(number_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return number;
    }

    public static SubLObject starts_with(final SubLObject w, final SubLObject starting) {
        return makeBoolean((NIL != list_utilities.greater_or_same_length_p(w, starting)) && (NIL != substring_matchP(w, starting, ZERO_INTEGER, symbol_function(EQUAL))));
    }

    public static SubLObject starts_with_one_of(final SubLObject string, final SubLObject starting_strings) {
        SubLObject v_boolean = NIL;
        if (NIL == v_boolean) {
            SubLObject csome_list_var;
            SubLObject s;
            for (csome_list_var = starting_strings, s = NIL, s = csome_list_var.first(); (NIL == v_boolean) && (NIL != csome_list_var); v_boolean = starts_with(string, s) , csome_list_var = csome_list_var.rest() , s = csome_list_var.first()) {
            }
        }
        return v_boolean;
    }

    public static SubLObject starts_with_by_test(final SubLObject string, final SubLObject starting, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        return makeBoolean((NIL != list_utilities.greater_or_same_length_p(string, starting)) && (NIL != substring_matchP(string, starting, ZERO_INTEGER, test)));
    }

    public static SubLObject starts_with_one_of_by_test(final SubLObject string, final SubLObject starting_strings, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        SubLObject v_boolean = NIL;
        if (NIL == v_boolean) {
            SubLObject csome_list_var;
            SubLObject x;
            for (csome_list_var = starting_strings, x = NIL, x = csome_list_var.first(); (NIL == v_boolean) && (NIL != csome_list_var); v_boolean = starts_with_by_test(string, x, test) , csome_list_var = csome_list_var.rest() , x = csome_list_var.first()) {
            }
        }
        return v_boolean;
    }

    public static SubLObject starting_string(final SubLObject string, final SubLObject starting_string, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        return NIL != starts_with_by_test(string, starting_string, test) ? starting_string : NIL;
    }

    public static SubLObject ends_with_start_of(final SubLObject string1, final SubLObject string2, SubLObject test, SubLObject split_strings) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        if (split_strings == UNPROVIDED) {
            split_strings = NIL;
        }
        SubLObject search_starting_points = list(ZERO_INTEGER);
        if (NIL != split_strings) {
            SubLObject cdolist_list_var = split_strings;
            SubLObject split_string = NIL;
            split_string = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject this_split_string_length = length(split_string);
                SubLObject cdolist_list_var_$11 = search_all(split_string, string1, test, UNPROVIDED);
                SubLObject search_result = NIL;
                search_result = cdolist_list_var_$11.first();
                while (NIL != cdolist_list_var_$11) {
                    search_starting_points = cons(add(search_result, this_split_string_length), search_starting_points);
                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                    search_result = cdolist_list_var_$11.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                split_string = cdolist_list_var.first();
            } 
            search_starting_points = Sort.sort(search_starting_points, $sym45$_, UNPROVIDED);
        } else {
            search_starting_points = list_utilities.num_list(length(string2), UNPROVIDED);
        }
        SubLObject cdolist_list_var = search_starting_points;
        SubLObject position = NIL;
        position = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject end_string = substring(string1, position, UNPROVIDED);
            if (NIL != starting_string(string2, end_string, test)) {
                return end_string;
            }
            cdolist_list_var = cdolist_list_var.rest();
            position = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject number_of_commas(final SubLObject string) {
        SubLObject result = ZERO_INTEGER;
        SubLObject end_var_$12;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject v_char;
        for (end_var = end_var_$12 = length(string), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$12); char_num = number_utilities.f_1X(char_num)) {
            v_char = Strings.sublisp_char(string, char_num);
            if (v_char.eql(CHAR_comma)) {
                result = add(result, ONE_INTEGER);
            }
        }
        return result;
    }

    public static SubLObject comma_sub_string(final SubLObject string) {
        SubLObject result = NIL;
        if (number_of_commas(string).numG(ZERO_INTEGER)) {
            final SubLObject comma_pos_list = search_all($str48$_, string, UNPROVIDED, UNPROVIDED);
            final SubLObject comma_pos = comma_pos_list.first();
            final SubLObject raw_substring = strip_first_n(string, add(comma_pos, ONE_INTEGER));
            final SubLObject substring = result = Strings.string_left_trim($str49$__, raw_substring);
            return result;
        }
        return NIL;
    }

    public static SubLObject concatenate_adjacent_strings(final SubLObject items) {
        SubLObject new_items = NIL;
        SubLObject current_string = NIL;
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (item.isString()) {
                if (NIL != current_string) {
                    current_string = cconcatenate(current_string, item);
                } else {
                    current_string = item;
                }
            } else {
                final SubLObject var = current_string;
                if (NIL != var) {
                    new_items = cons(var, new_items);
                }
                new_items = cons(item, new_items);
                current_string = NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        final SubLObject var = current_string;
        if (NIL != var) {
            new_items = cons(var, new_items);
        }
        return nreverse(new_items);
    }

    public static SubLObject string_starts_with_constant_reader_prefix_p(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        return starts_with(string, constant_reader.constant_reader_prefix());
    }

    public static SubLObject string_contains_constant_reader_prefix_p(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        return substringP(constant_reader.constant_reader_prefix(), string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject string_add_constant_reader_prefix(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        return cconcatenate(constant_reader.constant_reader_prefix(), string);
    }

    public static SubLObject string_remove_constant_reader_prefix(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        return pre_remove(string, constant_reader.constant_reader_prefix(), UNPROVIDED);
    }

    public static SubLObject string_remove_constant_reader_prefixes(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        return string_subst($empty_string$.getGlobalValue(), constant_reader.constant_reader_prefix(), string, UNPROVIDED);
    }

    public static SubLObject one_is_starting_string(final SubLObject string, final SubLObject starting_strings, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        SubLObject ans = NIL;
        if (NIL == ans) {
            SubLObject csome_list_var;
            SubLObject x;
            for (csome_list_var = starting_strings, x = NIL, x = csome_list_var.first(); (NIL == ans) && (NIL != csome_list_var); ans = starting_string(string, x, test) , csome_list_var = csome_list_var.rest() , x = csome_list_var.first()) {
            }
        }
        return ans;
    }

    public static SubLObject strings_common_prefix(final SubLObject strings, SubLObject key, SubLObject start) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        final SubLObject first_string = funcall(key, strings.first());
        SubLObject rest_strings = strings.rest();
        assert NIL != stringp(first_string) : "Types.stringp(first_string) " + "CommonSymbols.NIL != Types.stringp(first_string) " + first_string;
        final SubLObject prefix = first_string;
        final SubLObject prefix_start = start;
        SubLObject prefix_end = length(prefix);
        while ((!prefix_start.numE(prefix_end)) && (NIL != rest_strings)) {
            final SubLObject next_string = funcall(key, rest_strings.first());
            assert NIL != stringp(next_string) : "Types.stringp(next_string) " + "CommonSymbols.NIL != Types.stringp(next_string) " + next_string;
            rest_strings = rest_strings.rest();
            final SubLObject first_mismatch = Strings.stringNE(prefix, next_string, prefix_start, prefix_end, prefix_start, length(next_string));
            if (!first_mismatch.isNumber()) {
                continue;
            }
            prefix_end = first_mismatch;
        } 
        return substring(prefix, prefix_start, prefix_end);
    }

    public static SubLObject char_position(final SubLObject v_char, final SubLObject string, SubLObject n) {
        if (n == UNPROVIDED) {
            n = ZERO_INTEGER;
        }
        return position(v_char, string, symbol_function(EQL), symbol_function(IDENTITY), n, UNPROVIDED);
    }

    public static SubLObject string_upto(final SubLObject string, SubLObject v_char) {
        if (v_char == UNPROVIDED) {
            v_char = CHAR_space;
        }
        final SubLObject pos = char_position(v_char, string, UNPROVIDED);
        if (NIL != pos) {
            return subseq(string, ZERO_INTEGER, pos);
        }
        return string;
    }

    public static SubLObject string_after(final SubLObject string, SubLObject v_char) {
        if (v_char == UNPROVIDED) {
            v_char = CHAR_space;
        }
        final SubLObject pos = char_position(v_char, string, UNPROVIDED);
        if (NIL != pos) {
            return subseq(string, add(pos, ONE_INTEGER), UNPROVIDED);
        }
        return $empty_string$.getGlobalValue();
    }

    public static SubLObject string_between(final SubLObject string, SubLObject between_chars, SubLObject start) {
        if (between_chars == UNPROVIDED) {
            between_chars = $list50;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        final SubLObject start_pos = char_position(between_chars.first(), string, start);
        final SubLObject end_pos = (NIL != start_pos) ? char_position(cadr(between_chars), string, start_pos) : NIL;
        if ((NIL != end_pos) && end_pos.numL(length(string))) {
            return subseq(string, add(ONE_INTEGER, start_pos), end_pos);
        }
        return NIL;
    }

    public static SubLObject get_substring_between_tags(final SubLObject string, final SubLObject start_tag, final SubLObject end_tag, SubLObject start_pos, SubLObject end_pos) {
        if (start_pos == UNPROVIDED) {
            start_pos = ZERO_INTEGER;
        }
        if (end_pos == UNPROVIDED) {
            end_pos = NIL;
        }
        SubLObject data_string = NIL;
        SubLObject test_pos = NIL;
        start_pos = search(start_tag, string, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, NIL, start_pos, end_pos);
        if (NIL == start_pos) {
            return values(NIL, NIL);
        }
        if (NIL != end_tag) {
            test_pos = search(end_tag, string, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, NIL, add(length(start_tag), start_pos), end_pos);
        }
        if (NIL == test_pos) {
            return values(NIL, NIL);
        }
        end_pos = get_end_pos(end_tag, test_pos, end_pos, length(string));
        data_string = substring(string, add(start_pos, length(start_tag)), end_pos);
        return values(data_string, end_pos);
    }

    public static SubLObject get_substring_between_tags_list(final SubLObject string, final SubLObject start_tag, final SubLObject end_tag, SubLObject start_pos, SubLObject end_pos) {
        if (start_pos == UNPROVIDED) {
            start_pos = ZERO_INTEGER;
        }
        if (end_pos == UNPROVIDED) {
            end_pos = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject data_string = get_substring_between_tags(string, start_tag, end_tag, start_pos, end_pos);
        final SubLObject test_pos = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return list(data_string, test_pos);
    }

    public static SubLObject get_end_pos(final SubLObject end_tag, final SubLObject true_end, final SubLObject arg_end, final SubLObject string_end) {
        return (NIL != true_end) && (NIL != end_tag) ? true_end : NIL != arg_end ? arg_end : string_end;
    }

    public static SubLObject strip_header(final SubLObject string, final SubLObject header) {
        if (NIL != starts_with(string, header)) {
            return subseq(string, length(header), UNPROVIDED);
        }
        return string;
    }

    public static SubLObject strip_trailer(final SubLObject string, final SubLObject trailer) {
        if (NIL != ends_with(string, trailer, UNPROVIDED)) {
            return subseq(string, ZERO_INTEGER, subtract(length(string), length(trailer)));
        }
        return string;
    }

    public static SubLObject strip_first(final SubLObject string) {
        if (length(string).numG(ZERO_INTEGER)) {
            return subseq(string, ONE_INTEGER, length(string));
        }
        return NIL;
    }

    public static SubLObject strip_final(final SubLObject string, SubLObject n) {
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        if (NIL != list_utilities.lengthGE(string, n, UNPROVIDED)) {
            return subseq(string, ZERO_INTEGER, subtract(length(string), n));
        }
        return NIL;
    }

    public static SubLObject strip_first_if_char(final SubLObject string, final SubLObject v_char) {
        if (length(string).numG(ZERO_INTEGER) && (NIL != charE(v_char, Strings.sublisp_char(string, ZERO_INTEGER)))) {
            return subseq(string, ONE_INTEGER, length(string));
        }
        return string;
    }

    public static SubLObject strip_final_if_char(final SubLObject string, final SubLObject v_char) {
        if (length(string).numG(ZERO_INTEGER) && (NIL != charE(v_char, Strings.sublisp_char(string, subtract(length(string), ONE_INTEGER))))) {
            return subseq(string, ZERO_INTEGER, subtract(length(string), ONE_INTEGER));
        }
        return string;
    }

    public static SubLObject strip_first_n(final SubLObject string, final SubLObject n) {
        final SubLObject length_of_string = length(string);
        if (length_of_string.numGE(n)) {
            return subseq(string, n, length_of_string);
        }
        return NIL;
    }

    public static SubLObject strip_final_n(final SubLObject string, final SubLObject n) {
        final SubLObject length_of_string = length(string);
        if (length_of_string.numGE(n)) {
            return subseq(string, ZERO_INTEGER, subtract(length_of_string, n));
        }
        return NIL;
    }

    public static SubLObject strip_punctuation(SubLObject string) {
        while ((NIL != non_empty_string_p(string)) && (NIL != punctuation_p(first_char(string)))) {
            string = strip_first(string);
        } 
        while ((NIL != non_empty_string_p(string)) && (NIL != punctuation_p(last_char(string)))) {
            string = strip_final(string, UNPROVIDED);
        } 
        return string;
    }

    public static SubLObject strip_sentential_punctuation(final SubLObject sentence_string) {
        if (NIL != ends_with_one_of(sentence_string, $list51)) {
            return strip_final(sentence_string, UNPROVIDED);
        }
        return sentence_string;
    }

    public static SubLObject ends_in_geminateP(final SubLObject string) {
        final SubLObject last_n = subtract(length(string), ONE_INTEGER);
        final SubLObject second_last_n = subtract(length(string), TWO_INTEGER);
        if (last_n.numG(ZERO_INTEGER) && aref(string, last_n).eql(aref(string, second_last_n))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject null_stringP(final SubLObject v_object) {
        return empty_string_p(v_object);
    }

    public static SubLObject non_empty_stringP(final SubLObject v_object) {
        return non_empty_subl_stringP(v_object);
    }

    public static SubLObject non_empty_cycl_stringP(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_string.cycl_string_p(v_object)) && (NIL == empty_string_p(v_object)));
    }

    public static SubLObject non_empty_subl_stringP(final SubLObject v_object) {
        return makeBoolean(v_object.isString() && (NIL == empty_string_p(v_object)));
    }

    public static SubLObject char_set_position(final SubLObject char_set, final SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $char_set$.currentBinding(thread);
        try {
            $char_set$.bind(char_set, thread);
            ans = position_if(symbol_function(CHAR_IN_CHAR_SET), string, symbol_function(IDENTITY), start, end);
        } finally {
            $char_set$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject char_type_position(final SubLObject char_type, final SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        return position_if(char_type, string, symbol_function(IDENTITY), start, end);
    }

    public static SubLObject space_p(final SubLObject v_object) {
        return eql($space_char$.getGlobalValue(), v_object);
    }

    public static SubLObject non_space_char_p(final SubLObject v_object) {
        return makeBoolean(v_object.isChar() && (NIL == space_p(v_object)));
    }

    public static SubLObject tab_p(final SubLObject v_object) {
        return eql($tab_char$.getGlobalValue(), v_object);
    }

    public static SubLObject non_tab_char_p(final SubLObject v_object) {
        return makeBoolean(v_object.isChar() && (NIL == tab_p(v_object)));
    }

    public static SubLObject not_digit_char_p(final SubLObject thing) {
        return makeBoolean(NIL == digit_char_p(thing, UNPROVIDED));
    }

    public static SubLObject isa_digit_charP(final SubLObject thing) {
        return makeBoolean(thing.isChar() && (NIL != digit_char_p(thing, UNPROVIDED)));
    }

    public static SubLObject digit_stringP(final SubLObject v_object) {
        return makeBoolean(v_object.isString() && (NIL == list_utilities.find_if_not(DIGIT_CHAR_P, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject alphanumeric_stringP(final SubLObject v_object) {
        return makeBoolean(v_object.isString() && (NIL == list_utilities.find_if_not(ALPHANUMERICP, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject alphanumeric_char_p(final SubLObject v_object) {
        return makeBoolean(v_object.isChar() && (NIL != alphanumericp(v_object)));
    }

    public static SubLObject alphabetic_char_p(final SubLObject v_object) {
        return makeBoolean(v_object.isChar() && (NIL != alpha_char_p(v_object)));
    }

    public static SubLObject partially_numeric_stringP(final SubLObject v_object) {
        return makeBoolean(v_object.isString() && (NIL != find_if(DIGIT_CHAR_P, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject alphabetic_stringP(final SubLObject v_object) {
        return makeBoolean(v_object.isString() && (NIL != find_if(ALPHA_CHAR_P, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject non_alphabetic_stringP(final SubLObject v_object) {
        return makeBoolean(v_object.isString() && (NIL == find_if(ALPHA_CHAR_P, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject is_numericP(final SubLObject string) {
        return collection_defns.cyc_numeric_string(trim_whitespace(string));
    }

    public static SubLObject is_numeric_rangeP(final SubLObject string) {
        return parse_numeric_range(string);
    }

    public static SubLObject parse_numeric_range(final SubLObject string) {
        SubLObject numeric_list = NIL;
        SubLObject num_list = NIL;
        if (NIL != char_position(CHAR_hyphen, string, UNPROVIDED)) {
            numeric_list = string_tokenize(string, $list57, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (!length(num_list).numE(TWO_INTEGER)) {
                num_list = NIL;
            }
        } else
            if (NIL != char_position(CHAR_comma, string, UNPROVIDED)) {
                numeric_list = string_tokenize(string, $list58, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (NIL != is_numericP(string)) {
                    numeric_list = list(string);
                }


        if ((NIL != numeric_list) && (NIL != list_utilities.every_in_list(symbol_function($sym59$IS_NUMERIC_), numeric_list, UNPROVIDED))) {
            num_list = Mapping.mapcar(symbol_function(PARSE_INTEGER), numeric_list);
        }
        return num_list;
    }

    public static SubLObject ordinal(final SubLObject cardinal) {
        return format(NIL, $str61$__R, cardinal);
    }

    public static SubLObject english_ordinal_number_string_p(final SubLObject string) {
        final SubLObject possibly_ordinal_numberP = ends_with_one_of(string, $list62);
        return NIL != possibly_ordinal_numberP ? number_utilities.number_string_p(english_ordinal_string_to_cardinal_string(string)) : NIL;
    }

    public static SubLObject english_ordinal_string_to_cardinal_string(final SubLObject string) {
        return strip_final_n(string, TWO_INTEGER);
    }

    public static SubLObject integer_suffix(final SubLObject string) {
        SubLObject last_digit_pos = NIL;
        SubLObject doneP;
        SubLObject i;
        SubLObject v_char;
        for (doneP = NIL, i = NIL, i = subtract(length(string), ONE_INTEGER); (NIL == doneP) && (!i.numL(ZERO_INTEGER)); i = subtract(i, ONE_INTEGER)) {
            v_char = aref(string, i);
            if (NIL != digit_char_p(v_char, UNPROVIDED)) {
                last_digit_pos = i;
            } else {
                doneP = T;
            }
        }
        if (last_digit_pos.isInteger()) {
            return string_to_integer(subseq(string, last_digit_pos, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject set_nth_char(final SubLObject n, final SubLObject string, final SubLObject new_char, SubLObject safeP) {
        if (safeP == UNPROVIDED) {
            safeP = T;
        }
        if (NIL != safeP) {
            assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
            assert NIL != subl_promotions.non_negative_integer_p(n) : "subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) " + n;
            assert NIL != characterp(new_char) : "Types.characterp(new_char) " + "CommonSymbols.NIL != Types.characterp(new_char) " + new_char;
        }
        if ((NIL == safeP) || (NIL != list_utilities.lengthG(string, n, UNPROVIDED))) {
            Strings.set_char(string, n, new_char);
        }
        return string;
    }

    public static SubLObject strip_chars_meeting_test(final SubLObject string, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(CONTROL_CHAR_P);
        }
        return substitute_char_if(string, CHAR_space, test);
    }

    public static SubLObject substitute_char_if(final SubLObject string, final SubLObject new_char, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(CONTROL_CHAR_P);
        }
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        final SubLObject string_var;
        final SubLObject output_string = string_var = copy_string(string);
        SubLObject end_var_$13;
        SubLObject end_var;
        SubLObject i;
        SubLObject ch;
        for (end_var = end_var_$13 = length(string_var), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var_$13); i = number_utilities.f_1X(i)) {
            ch = Strings.sublisp_char(string_var, i);
            if (NIL != funcall(test, ch)) {
                set_nth_char(i, output_string, new_char, UNPROVIDED);
            }
        }
        return output_string;
    }

    public static SubLObject string_wXo_control_charsP(final SubLObject string) {
        return makeBoolean(string.isString() && (NIL == find_if(symbol_function(CONTROL_CHAR_P), string, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject control_char_p(final SubLObject v_char) {
        return makeBoolean(v_char.isChar() && char_code(v_char).numL($int$32));
    }

    public static SubLObject utf_8_combining_character_p(final SubLObject v_object) {
        return makeBoolean(v_object.isChar() && char_code(v_object).numGE($int$128));
    }

    public static SubLObject integer_char_p(final SubLObject v_char) {
        return makeBoolean(v_char.isChar() && (NIL != digit_char_p(v_char, TEN_INTEGER)));
    }

    public static SubLObject contains_charP(final SubLObject string, final SubLObject v_char) {
        return makeBoolean(NIL != position(v_char, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject char_in_char_set(final SubLObject v_char) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return find(v_char, $char_set$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject split_string(final SubLObject string, SubLObject char_set) {
        if (char_set == UNPROVIDED) {
            char_set = $list66;
        }
        SubLObject ans = NIL;
        SubLObject previous;
        SubLObject position;
        for (previous = NIL, position = NIL, previous = NIL, position = char_set_position(char_set, string, ZERO_INTEGER, UNPROVIDED); NIL != position; position = char_set_position(char_set, string, add(previous, ONE_INTEGER), UNPROVIDED)) {
            ans = cons(substring(string, NIL != previous ? add(previous, ONE_INTEGER) : ZERO_INTEGER, position), ans);
            previous = position;
        }
        if (NIL != previous) {
            ans = cons(substring(string, add(previous, ONE_INTEGER), UNPROVIDED), ans);
        } else {
            ans = list(string);
        }
        return nreverse(ans);
    }

    public static SubLObject split_string_on_string(final SubLObject string, final SubLObject delimiter) {
        SubLObject ans = NIL;
        SubLObject remaining = string;
        for (SubLObject pos = search(delimiter, remaining, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED); NIL != pos; pos = search(delimiter, remaining, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            ans = cons(substring(remaining, ZERO_INTEGER, pos), ans);
            remaining = substring(remaining, add(pos, length(delimiter)), UNPROVIDED);
        }
        ans = cons(remaining, ans);
        remaining = NIL;
        return nreverse(ans);
    }

    public static SubLObject string_rotations(final SubLObject string, SubLObject stoplist_trie, SubLObject rotate_about, SubLObject rotate_insert, SubLObject valid_rotation_start_test) {
        if (stoplist_trie == UNPROVIDED) {
            stoplist_trie = NIL;
        }
        if (rotate_about == UNPROVIDED) {
            rotate_about = $list66;
        }
        if (rotate_insert == UNPROVIDED) {
            rotate_insert = $str49$__;
        }
        if (valid_rotation_start_test == UNPROVIDED) {
            valid_rotation_start_test = symbol_function(ALPHA_CHAR_P);
        }
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != stringp(rotate_insert) : "Types.stringp(rotate_insert) " + "CommonSymbols.NIL != Types.stringp(rotate_insert) " + rotate_insert;
        SubLObject answers = NIL;
        SubLObject previous;
        SubLObject position;
        SubLObject rotation;
        for (previous = NIL, position = NIL, previous = NIL, position = char_set_position(rotate_about, string, ZERO_INTEGER, UNPROVIDED); NIL != position; position = char_set_position(rotate_about, string, add(previous, ONE_INTEGER), UNPROVIDED)) {
            rotation = string_rotation_int(string, add(position, ONE_INTEGER), stoplist_trie, rotate_about, rotate_insert, valid_rotation_start_test);
            if (NIL != rotation) {
                answers = cons(rotation, answers);
            }
            previous = position;
        }
        return nreverse(answers);
    }

    public static SubLObject string_rotation_int(final SubLObject string, SubLObject position, final SubLObject stoplist_trie, final SubLObject rotate_about, final SubLObject rotate_insert, final SubLObject valid_rotation_start_test) {
        final SubLObject strlen = length(string);
        final SubLObject rotlen = length(rotate_insert);
        final SubLObject endlen = subtract(length(string), position);
        final SubLObject prelen = add(endlen, rotlen);
        if (position.numGE(strlen)) {
            return NIL;
        }
        if (NIL == funcall(valid_rotation_start_test, Strings.sublisp_char(string, position))) {
            return NIL;
        }
        if (NIL != tries.trie_p(stoplist_trie)) {
            final SubLObject next_position = char_set_position(rotate_about, string, add(position, ONE_INTEGER), UNPROVIDED);
            if (NIL != tries.trie_exact(stoplist_trie, string, NIL, position, next_position)) {
                return NIL;
            }
        }
        final SubLObject rotated_string = Strings.make_string(subtract(add(strlen, rotlen), ONE_INTEGER), UNPROVIDED);
        replace(rotated_string, string, ZERO_INTEGER, endlen, position, NIL);
        replace(rotated_string, rotate_insert, endlen, prelen, ZERO_INTEGER, NIL);
        replace(rotated_string, string, prelen, NIL, ZERO_INTEGER, position);
        return rotated_string;
    }

    public static SubLObject substringP(final SubLObject little, final SubLObject big, SubLObject test, SubLObject start_index, SubLObject end_index) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        if (start_index == UNPROVIDED) {
            start_index = ZERO_INTEGER;
        }
        if (end_index == UNPROVIDED) {
            end_index = NIL;
        }
        if ((!little.isString()) || (!big.isString())) {
            return NIL;
        }
        if (NIL != list_utilities.lengthE(little, ONE_INTEGER, UNPROVIDED)) {
            return find(first_char(little), big, test, symbol_function(IDENTITY), start_index, end_index);
        }
        return search(little, big, test, symbol_function(IDENTITY), ZERO_INTEGER, NIL, start_index, end_index);
    }

    public static SubLObject superstringP(final SubLObject big, final SubLObject little, SubLObject test, SubLObject start_index) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        if (start_index == UNPROVIDED) {
            start_index = ZERO_INTEGER;
        }
        return substringP(little, big, test, start_index, UNPROVIDED);
    }

    public static SubLObject proper_superstringP(final SubLObject big, final SubLObject little, SubLObject test, SubLObject start_index) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        if (start_index == UNPROVIDED) {
            start_index = ZERO_INTEGER;
        }
        return makeBoolean((NIL == funcall(test, big, little)) && (NIL != substringP(little, big, test, start_index, UNPROVIDED)));
    }

    public static SubLObject substring_matchP(final SubLObject big, final SubLObject little, final SubLObject start, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        final SubLObject end = add(start, length(little));
        return makeBoolean((NIL != list_utilities.lengthGE(big, end, UNPROVIDED)) && (NIL != substringP(little, big, test, start, end)));
    }

    public static SubLObject search_all(final SubLObject seq1, final SubLObject seq2, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        final SubLObject seq2_length = length(seq2);
        SubLObject index = ZERO_INTEGER;
        SubLObject doneP = NIL;
        SubLObject result = NIL;
        while (index.numLE(seq2_length) && (NIL == doneP)) {
            final SubLObject position = search(seq1, seq2, test, key, ZERO_INTEGER, NIL, index, UNPROVIDED);
            if (NIL != position) {
                result = cons(position, result);
                index = number_utilities.f_1X(position);
            } else {
                doneP = T;
            }
        } 
        return nreverse(result);
    }

    public static SubLObject count_matches(final SubLObject seq1, final SubLObject seq2, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        final SubLObject seq2_length = length(seq2);
        SubLObject index = ZERO_INTEGER;
        SubLObject result = ZERO_INTEGER;
        SubLObject doneP = NIL;
        if (NIL != empty_string_p(seq1)) {
            return number_utilities.f_1X(seq2_length);
        }
        while (index.numLE(seq2_length) && (NIL == doneP)) {
            final SubLObject position = search(seq1, seq2, test, key, ZERO_INTEGER, NIL, index, UNPROVIDED);
            if (NIL != position) {
                result = add(result, ONE_INTEGER);
                index = number_utilities.f_1X(position);
            } else {
                doneP = T;
            }
        } 
        return result;
    }

    public static SubLObject subwordP(final SubLObject substring, final SubLObject string, SubLObject charseq, SubLObject test) {
        if (charseq == UNPROVIDED) {
            charseq = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; (NIL == list_utilities.lengthLE(substring, i, UNPROVIDED)) && (NIL != find(Strings.sublisp_char(substring, i), charseq, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)); i = add(i, ONE_INTEGER)) {
        }
        SubLObject mod_sub;
        for (mod_sub = substring(substring, i, UNPROVIDED), i = NIL, i = subtract(length(mod_sub), ONE_INTEGER); (!i.numLE(ZERO_INTEGER)) && (NIL != find(Strings.sublisp_char(mod_sub, i), charseq, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)); i = subtract(i, ONE_INTEGER)) {
        }
        mod_sub = substring(mod_sub, ZERO_INTEGER, number_utilities.f_1X(i));
        if ((NIL != null_stringP(string)) || (NIL != null_stringP(mod_sub))) {
            return NIL;
        }
        final SubLObject strend = length(string);
        final SubLObject subend = length(mod_sub);
        SubLObject retval = NIL;
        SubLObject temp = NIL;
        SubLObject start = NIL;
        SubLObject end = NIL;
        temp = search(mod_sub, string, test, symbol_function(IDENTITY), ZERO_INTEGER, subend, ZERO_INTEGER, strend);
        start = (NIL != temp) ? temp : strend;
        end = add(subend, start);
        while (!start.numGE(strend)) {
            retval = makeBoolean((NIL != (start.numE(ZERO_INTEGER) ? T : makeBoolean((NIL != find(Strings.sublisp_char(string, subtract(start, ONE_INTEGER)), charseq, test, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != whitespacep(Strings.sublisp_char(string, subtract(start, ONE_INTEGER))))))) && (NIL != (end.numE(strend) ? T : makeBoolean((NIL != find(Strings.sublisp_char(string, end), charseq, test, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != whitespacep(Strings.sublisp_char(string, end)))))));
            if (NIL != retval) {
                return T;
            }
            temp = search(mod_sub, string, test, symbol_function(IDENTITY), ZERO_INTEGER, subend, end, strend);
            start = (NIL != temp) ? temp : strend;
            end = add(subend, start);
        } 
        return retval;
    }

    public static SubLObject bunge(SubLObject strings, SubLObject v_char) {
        if (v_char == UNPROVIDED) {
            v_char = CHAR_space;
        }
        assert NIL != characterp(v_char) : "Types.characterp(v_char) " + "CommonSymbols.NIL != Types.characterp(v_char) " + v_char;
        strings = delete($empty_string$.getGlobalValue(), delete(NIL, strings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject num_strings = length(strings);
        if (num_strings.numE(ZERO_INTEGER)) {
            return $empty_string$.getGlobalValue();
        }
        if (num_strings.numE(ONE_INTEGER)) {
            return strings.first();
        }
        SubLObject total_length = ZERO_INTEGER;
        SubLObject cdolist_list_var = strings;
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            total_length = add(total_length, length(string));
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        total_length = add(total_length, subtract(num_strings, ONE_INTEGER));
        final SubLObject new_string = Strings.make_string(total_length, v_char);
        SubLObject index = ZERO_INTEGER;
        replace(new_string, strings.first(), index, NIL, ZERO_INTEGER, NIL);
        index = add(index, length(strings.first()));
        SubLObject cdolist_list_var2 = strings.rest();
        SubLObject string2 = NIL;
        string2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            index = add(index, ONE_INTEGER);
            replace(new_string, string2, index, NIL, ZERO_INTEGER, NIL);
            index = add(index, length(string2));
            cdolist_list_var2 = cdolist_list_var2.rest();
            string2 = cdolist_list_var2.first();
        } 
        return new_string;
    }

    public static SubLObject bunge_with_string(SubLObject strings, SubLObject spacer) {
        if (spacer == UNPROVIDED) {
            spacer = $$$_;
        }
        assert NIL != Strings.string(spacer) : "Strings.string(spacer) " + "CommonSymbols.NIL != Strings.string(spacer) " + spacer;
        strings = delete($empty_string$.getGlobalValue(), delete(NIL, strings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject num_strings = length(strings);
        if (num_strings.numE(ZERO_INTEGER)) {
            return $empty_string$.getGlobalValue();
        }
        if (num_strings.numE(ONE_INTEGER)) {
            return strings.first();
        }
        SubLObject total_length = ZERO_INTEGER;
        final SubLObject spacer_length = length(spacer);
        SubLObject cdolist_list_var = strings;
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            total_length = add(total_length, length(string));
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        total_length = add(total_length, multiply(spacer_length, subtract(num_strings, ONE_INTEGER)));
        final SubLObject new_string = Strings.make_string(total_length, UNPROVIDED);
        SubLObject index = ZERO_INTEGER;
        replace(new_string, strings.first(), index, NIL, ZERO_INTEGER, NIL);
        index = add(index, length(strings.first()));
        SubLObject cdolist_list_var2 = strings.rest();
        SubLObject string2 = NIL;
        string2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            replace(new_string, spacer, index, NIL, ZERO_INTEGER, NIL);
            index = add(index, spacer_length);
            replace(new_string, string2, index, NIL, ZERO_INTEGER, NIL);
            index = add(index, length(string2));
            cdolist_list_var2 = cdolist_list_var2.rest();
            string2 = cdolist_list_var2.first();
        } 
        return new_string;
    }

    public static SubLObject offsets_of_token(final SubLObject token, final SubLObject string) {
        if ((NIL != list_utilities.lengthE(token, ONE_INTEGER, UNPROVIDED)) && (NIL != punctuation_p(first_char(token)))) {
            return search_all(token, string, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject escaped_token = regular_expression_utilities.escape_regex_special_chars(token);
        SubLObject regex = cconcatenate($str68$_b, new SubLObject[]{ format_nil.format_nil_a_no_copy(escaped_token), $str68$_b });
        SubLObject offsets = list_utilities.alist_keys(regular_expression_utilities.offsets_of_regex_matches(regex, string, $list69, UNPROVIDED));
        if (NIL == offsets) {
            regex = format_nil.format_nil_a(escaped_token);
            offsets = list_utilities.alist_keys(regular_expression_utilities.offsets_of_regex_matches(regex, string, $list69, UNPROVIDED));
        }
        return offsets;
    }

    public static SubLObject string_of_allowed_charsP(final SubLObject string, final SubLObject allowed_chars) {
        SubLObject end_var_$14;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject v_char;
        for (end_var = end_var_$14 = length(string), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$14); char_num = number_utilities.f_1X(char_num)) {
            v_char = Strings.sublisp_char(string, char_num);
            if (NIL == subl_promotions.memberP(v_char, allowed_chars, UNPROVIDED, UNPROVIDED)) {
                return NIL;
            }
        }
        return T;
    }

    public static SubLObject bunge_according_to_string(SubLObject parts, final SubLObject string, SubLObject chars_allowed_bXw_words, SubLObject v_char, SubLObject warnP) {
        if (chars_allowed_bXw_words == UNPROVIDED) {
            chars_allowed_bXw_words = $list66;
        }
        if (v_char == UNPROVIDED) {
            v_char = CHAR_space;
        }
        if (warnP == UNPROVIDED) {
            warnP = NIL;
        }
        assert NIL != listp(parts) : "Types.listp(parts) " + "CommonSymbols.NIL != Types.listp(parts) " + parts;
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        parts = delete($empty_string$.getGlobalValue(), delete(NIL, parts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == parts) {
            return $str0$;
        }
        if (NIL != list_utilities.singletonP(parts)) {
            return parts.first();
        }
        final SubLObject first_part = parts.first();
        SubLObject previous_part_length = length(first_part);
        SubLObject starting_points = offsets_of_token(first_part, string);
        if (NIL == starting_points) {
            Errors.error($str70$_S_is_not_a_part_of_the_reference, first_part, string);
        }
        SubLObject cdolist_list_var = parts.rest();
        SubLObject part = NIL;
        part = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject part_offsets = offsets_of_token(part, string);
            SubLObject bunged_string_length = NIL;
            SubLObject valid_starts = NIL;
            if (NIL == part_offsets) {
                Errors.error($str70$_S_is_not_a_part_of_the_reference, part, string);
            }
            SubLObject cdolist_list_var_$15 = part_offsets;
            SubLObject offset = NIL;
            offset = cdolist_list_var_$15.first();
            while (NIL != cdolist_list_var_$15) {
                SubLObject cdolist_list_var_$16 = starting_points;
                SubLObject starting_point = NIL;
                starting_point = cdolist_list_var_$16.first();
                while (NIL != cdolist_list_var_$16) {
                    final SubLObject current_pointer = add(starting_point, previous_part_length);
                    if (offset.numGE(current_pointer) && (NIL != string_of_allowed_charsP(substring(string, current_pointer, offset), chars_allowed_bXw_words))) {
                        final SubLObject item_var = starting_point;
                        if (NIL == member(item_var, valid_starts, symbol_function(EQL), symbol_function(IDENTITY))) {
                            valid_starts = cons(item_var, valid_starts);
                        }
                        if (NIL == bunged_string_length) {
                            bunged_string_length = add(subtract(offset, starting_point), length(part));
                        }
                    }
                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                    starting_point = cdolist_list_var_$16.first();
                } 
                cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                offset = cdolist_list_var_$15.first();
            } 
            starting_points = valid_starts;
            previous_part_length = bunged_string_length;
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        } 
        if ((NIL == starting_points) && (NIL == previous_part_length)) {
            final SubLObject result = (NIL != v_char) ? bunge(parts, v_char) : NIL;
            if (NIL != warnP) {
                Errors.warn($str71$Failed_to_bunge__S_according_to__, parts, string, result);
            }
            return result;
        }
        final SubLObject start = starting_points.first();
        final SubLObject end = add(start, previous_part_length);
        return substring(string, start, end);
    }

    public static SubLObject bunge_according_to_string_ignoring_errors(final SubLObject word_list, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = bunge_according_to_string(word_list, string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
        if ((NIL != error) || (NIL == result)) {
            result = bunge(word_list, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject concatenate_strings(final SubLObject strings) {
        final SubLObject unicodeP = find_if(UNICODE_NAUT_P, strings, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject stringy_strings = (NIL != unicodeP) ? strings_to_display_vector_strings(strings) : strings;
        final SubLObject big_string = (NIL != stringy_strings) ? apply(symbol_function(CCONCATENATE), stringy_strings) : $str0$;
        return NIL != unicodeP ? unicode_nauts.make_unicode_naut(big_string) : big_string;
    }

    public static SubLObject strings_to_display_vector_strings(final SubLObject strings) {
        final SubLObject display_vector_strings = copy_list(strings);
        SubLObject list_var = NIL;
        SubLObject string = NIL;
        SubLObject i = NIL;
        list_var = strings;
        string = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , string = list_var.first() , i = add(ONE_INTEGER, i)) {
            if (NIL != unicode_nauts.unicode_naut_p(string, UNPROVIDED)) {
                set_nth(i, display_vector_strings, cycl_utilities.nat_arg1(string, UNPROVIDED));
            } else {
                set_nth(i, display_vector_strings, subl_string_to_display_vector_string(string));
            }
        }
        return display_vector_strings;
    }

    public static SubLObject join_strings(final SubLObject string_list, SubLObject separator_text) {
        if (separator_text == UNPROVIDED) {
            separator_text = $str49$__;
        }
        final SubLObject first_string = string_list.first();
        final SubLObject other_strings = string_list.rest();
        SubLObject joined_text = (NIL != first_string) ? first_string : $str0$;
        SubLObject cdolist_list_var = other_strings;
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            joined_text = cconcatenate(joined_text, new SubLObject[]{ separator_text, string });
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return joined_text;
    }

    public static SubLObject quoted_join_strings(final SubLObject string_list, SubLObject quote_char, SubLObject separator_text) {
        if (quote_char == UNPROVIDED) {
            quote_char = CHAR_quotation;
        }
        if (separator_text == UNPROVIDED) {
            separator_text = $str49$__;
        }
        SubLObject quoted_result = $str0$;
        if (NIL != string_list) {
            final SubLObject quote_string = Strings.string(quote_char);
            final SubLObject full_separator_text = cconcatenate(quote_string, new SubLObject[]{ separator_text, quote_string });
            final SubLObject result = join_strings(string_list, full_separator_text);
            quoted_result = cconcatenate(quote_string, new SubLObject[]{ result, quote_string });
        }
        return quoted_result;
    }

    public static SubLObject camel_case_to_underscores(final SubLObject string) {
        SubLObject prev_char = CHAR_A;
        SubLObject result = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            SubLObject end_var_$17;
            SubLObject end_var;
            SubLObject char_num;
            SubLObject v_char;
            for (end_var = end_var_$17 = length(string), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$17); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(string, char_num);
                if (NIL != upper_case_p(v_char)) {
                    if (NIL != lower_case_p(prev_char)) {
                        write_char(CHAR_underbar, s);
                    }
                    write_char(char_downcase(v_char), s);
                } else {
                    write_char(v_char, s);
                }
                prev_char = v_char;
            }
            result = get_output_stream_string(s);
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
        return result;
    }

    public static SubLObject capitalize_first(final SubLObject string) {
        return cconcatenate(str(char_upcase(Strings.sublisp_char(string, ZERO_INTEGER))), substring(string, ONE_INTEGER, UNPROVIDED));
    }

    public static SubLObject uncapitalize_first(final SubLObject string) {
        return cconcatenate(str(char_downcase(Strings.sublisp_char(string, ZERO_INTEGER))), substring(string, ONE_INTEGER, UNPROVIDED));
    }

    public static SubLObject nth_word_of_string(final SubLObject num, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_pos = ZERO_INTEGER;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $test_char$.currentBinding(thread);
        try {
            $test_char$.bind($space_char$.getGlobalValue(), thread);
            SubLObject cdolist_list_var;
            final SubLObject word_list_var = cdolist_list_var = break_words(string, NOT_TEST_CHAR, UNPROVIDED);
            SubLObject word = NIL;
            word = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL == result) && num.numE(current_pos)) {
                    result = word;
                }
                current_pos = add(current_pos, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            } 
        } finally {
            $test_char$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject capitalize_smart(final SubLObject string) {
        final SubLObject words = cycl_string.cycl_string_tokenize(string, $list75);
        if (words.first().isString()) {
            nstring_proper(words.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject cdolist_list_var = words.rest();
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (word.isString() && (NIL != lexicon_utilities.smart_to_capitalizeP(word))) {
                nstring_proper(word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return cycl_string.cycl_string_bunge(words, UNPROVIDED);
    }

    public static SubLObject uncapitalize_smart(final SubLObject string) {
        final SubLObject uncapped = Strings.string_downcase(string, UNPROVIDED, UNPROVIDED);
        return capitalize_smart(uncapped);
    }

    public static SubLObject properly_capitalized_stringP(final SubLObject string) {
        final SubLObject cap_string = capitalize_smart(string);
        return equal(string, cap_string);
    }

    public static SubLObject capitalized_string_p(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!string.isString()) {
            return NIL;
        }
        SubLObject uncapitalized_open_class_wordsP = NIL;
        SubLObject capitalized_but_not_enitirely_wordsP = NIL;
        final SubLObject _prev_bind_0 = $test_char$.currentBinding(thread);
        try {
            $test_char$.bind($space_char$.getGlobalValue(), thread);
            SubLObject cdolist_list_var;
            final SubLObject word_list_var = cdolist_list_var = break_words(string, NOT_TEST_CHAR, UNPROVIDED);
            SubLObject word = NIL;
            word = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject first_letter = first_char(word);
                if ((NIL == lexicon_accessors.closed_lexical_class_stringP(word, UNPROVIDED)) && (NIL != lower_case_p(first_letter))) {
                    uncapitalized_open_class_wordsP = T;
                }
                if ((NIL != upper_case_p(first_letter)) && (NIL != find_if(symbol_function(LOWER_CASE_P), word, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    capitalized_but_not_enitirely_wordsP = T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            } 
        } finally {
            $test_char$.rebind(_prev_bind_0, thread);
        }
        return makeBoolean((NIL != capitalized_but_not_enitirely_wordsP) && (NIL == uncapitalized_open_class_wordsP));
    }

    public static SubLObject string_encode_capitalization(final SubLObject string) {
        SubLObject ans = ZERO_INTEGER;
        SubLObject char_value = ONE_INTEGER;
        SubLObject end_var_$18;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject v_char;
        for (end_var = end_var_$18 = length(string), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$18); char_num = number_utilities.f_1X(char_num)) {
            v_char = Strings.sublisp_char(string, char_num);
            if (NIL != upper_case_p(v_char)) {
                ans = add(ans, char_value);
            }
            char_value = multiply(TWO_INTEGER, char_value);
        }
        return ans;
    }

    public static SubLObject string_has_capitalization_p(final SubLObject string, final SubLObject cap_code) {
        return string_has_capitalization_p_mod(string, cap_code);
    }

    public static SubLObject string_has_capitalization_p_mod(final SubLObject string, final SubLObject cap_code) {
        SubLObject remaining_value = cap_code;
        SubLObject char_value = ONE_INTEGER;
        SubLObject mismatchP = NIL;
        final SubLObject end_var = length(string);
        if (NIL == mismatchP) {
            SubLObject end_var_$19;
            SubLObject char_num;
            SubLObject v_char;
            for (end_var_$19 = end_var, char_num = NIL, char_num = ZERO_INTEGER; (NIL == mismatchP) && (!char_num.numGE(end_var_$19)); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(string, char_num);
                if (NIL != upper_case_p(v_char)) {
                    remaining_value = subtract(remaining_value, char_value);
                }
                char_value = multiply(TWO_INTEGER, char_value);
                if (NIL == number_utilities.divides_evenly(remaining_value, char_value)) {
                    mismatchP = T;
                }
            }
        }
        if (!remaining_value.isZero()) {
            mismatchP = T;
        }
        return makeBoolean(NIL == mismatchP);
    }

    public static SubLObject string_has_capitalization_p_expt(final SubLObject string, final SubLObject cap_code) {
        SubLObject remaining_value = cap_code;
        SubLObject char_value = expt(TWO_INTEGER, number_utilities.f_1_(length(string)));
        SubLObject mismatchP = NIL;
        final SubLObject string_var = reverse(string);
        final SubLObject end_var = length(string_var);
        if (NIL == mismatchP) {
            SubLObject end_var_$20;
            SubLObject char_num;
            SubLObject v_char;
            for (end_var_$20 = end_var, char_num = NIL, char_num = ZERO_INTEGER; (NIL == mismatchP) && (!char_num.numGE(end_var_$20)); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(string_var, char_num);
                if (NIL != upper_case_p(v_char)) {
                    remaining_value = subtract(remaining_value, char_value);
                }
                if ((!remaining_value.numGE(ZERO_INTEGER)) || (!remaining_value.numL(char_value))) {
                    mismatchP = T;
                }
                char_value = divide(char_value, TWO_INTEGER);
            }
        }
        if (!remaining_value.isZero()) {
            mismatchP = T;
        }
        return makeBoolean(NIL == mismatchP);
    }

    public static SubLObject nstring_proper(final SubLObject string, SubLObject start, SubLObject end, SubLObject test, SubLObject leading) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(WHITESPACEP);
        }
        if (leading == UNPROVIDED) {
            leading = T;
        }
        SubLObject str_len = length(string);
        if (((NIL != end) && end.isNumber()) && end.numLE(str_len)) {
            str_len = end;
        }
        if (start.numG(str_len)) {
            return string;
        }
        SubLObject i;
        for (i = NIL, i = start; !i.numE(str_len); i = add(i, ONE_INTEGER)) {
            if (NIL != leading) {
                Strings.set_char(string, i, char_upcase(Strings.sublisp_char(string, i)));
                leading = NIL;
            }
            if (NIL != funcall(test, aref(string, i))) {
                leading = T;
            }
        }
        return string;
    }

    public static SubLObject string_proper(final SubLObject string, SubLObject start, SubLObject end, SubLObject test, SubLObject leading) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(WHITESPACEP);
        }
        if (leading == UNPROVIDED) {
            leading = T;
        }
        return nstring_proper(copy_string(string), start, end, test, leading);
    }

    public static SubLObject space_uncapitalize(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        final SubLObject length = length(string);
        if (length.numE(ZERO_INTEGER)) {
            return string;
        }
        final SubLObject capitals = count_if(symbol_function(UPPER_CASE_P), string, symbol_function(IDENTITY), ONE_INTEGER, UNPROVIDED);
        final SubLObject digits = count_if(symbol_function(DIGIT_CHAR_P), string, symbol_function(IDENTITY), ONE_INTEGER, UNPROVIDED);
        final SubLObject punctutation = count_if(symbol_function(PUNCTUATION_P), string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject increase = add(capitals, digits, punctutation);
        if (increase.numE(ZERO_INTEGER)) {
            return string;
        }
        final SubLObject new_length = add(length, increase);
        final SubLObject new_string = Strings.make_string(new_length, UNPROVIDED);
        SubLObject new_index = ZERO_INTEGER;
        SubLObject index = NIL;
        SubLObject prev_i = NIL;
        SubLObject v_char = NIL;
        SubLObject prev = NIL;
        index = prev_i = ZERO_INTEGER;
        v_char = prev = Strings.sublisp_char(string, index);
        while (!index.numE(subtract(length, ONE_INTEGER))) {
            if ((((NIL != upper_case_p(v_char)) || (NIL != punctuation_p(v_char))) || ((NIL != digit_char_p(v_char, UNPROVIDED)) && (NIL == digit_char_p(prev, UNPROVIDED)))) && (!index.numE(ZERO_INTEGER))) {
                new_index = add(new_index, ONE_INTEGER);
            }
            set_nth_char(new_index, new_string, char_downcase(v_char), UNPROVIDED);
            new_index = add(new_index, ONE_INTEGER);
            index = add(index, ONE_INTEGER);
            prev_i = subtract(index, ONE_INTEGER);
            v_char = Strings.sublisp_char(string, index);
            prev = Strings.sublisp_char(string, prev_i);
        } 
        if ((((NIL != upper_case_p(v_char)) || (NIL != punctuation_p(v_char))) || ((NIL != digit_char_p(v_char, UNPROVIDED)) && (NIL == digit_char_p(prev, UNPROVIDED)))) && (!index.numE(ZERO_INTEGER))) {
            new_index = add(new_index, ONE_INTEGER);
        }
        set_nth_char(new_index, new_string, char_downcase(v_char), UNPROVIDED);
        return trim_sides(new_string, UNPROVIDED);
    }

    public static SubLObject space_dont_uncapitalize(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        final SubLObject length = length(string);
        SubLObject ans = (length.isZero()) ? string : NIL;
        if (NIL == ans) {
            final SubLObject capitals = count_if(symbol_function(UPPER_CASE_P), string, symbol_function(IDENTITY), ONE_INTEGER, UNPROVIDED);
            final SubLObject digits = count_if(symbol_function(DIGIT_CHAR_P), string, symbol_function(IDENTITY), ONE_INTEGER, UNPROVIDED);
            final SubLObject doomed = count_if(symbol_function(EAT_CHAR_P), string, symbol_function(IDENTITY), ONE_INTEGER, UNPROVIDED);
            final SubLObject increase = subtract(add(capitals, digits), doomed);
            if (increase.isZero()) {
                ans = string;
            }
            if (NIL == ans) {
                final SubLObject new_length = add(length, increase);
                final SubLObject new_string = Strings.make_string(new_length, UNPROVIDED);
                SubLObject new_index = ZERO_INTEGER;
                SubLObject prev = NIL;
                SubLObject index = NIL;
                SubLObject v_char = NIL;
                SubLObject next = NIL;
                index = ZERO_INTEGER;
                v_char = Strings.sublisp_char(string, index);
                next = Strings.sublisp_char(string, number_utilities.f_1X(index));
                while (!index.numE(subtract(length, ONE_INTEGER))) {
                    if (((NIL != lower_case_p(v_char)) && (NIL == prev)) && (NIL != capitalize_initial_char_p(v_char, next))) {
                        v_char = char_upcase(v_char);
                    }
                    if (NIL == eat_char_p(v_char)) {
                        if ((NIL != add_space_between_chars_p(v_char, prev, next)) && (!index.numE(ZERO_INTEGER))) {
                            new_index = add(new_index, ONE_INTEGER);
                        }
                        set_nth_char(new_index, new_string, v_char, UNPROVIDED);
                        new_index = add(new_index, ONE_INTEGER);
                    }
                    prev = v_char;
                    index = add(index, ONE_INTEGER);
                    v_char = Strings.sublisp_char(string, index);
                    next = (index.numL(number_utilities.f_1_(length))) ? Strings.sublisp_char(string, number_utilities.f_1X(index)) : NIL;
                } 
                if ((NIL != add_space_between_chars_p(v_char, prev, next)) && (!index.numE(ZERO_INTEGER))) {
                    new_index = add(new_index, ONE_INTEGER);
                }
                set_nth_char(new_index, new_string, v_char, UNPROVIDED);
                ans = trim_sides(new_string, UNPROVIDED);
            }
        }
        return ans;
    }

    public static SubLObject add_space_between_chars_p(final SubLObject v_char, final SubLObject prev, final SubLObject next) {
        return makeBoolean(((NIL != upper_case_p(v_char)) && (((NIL != prev) && (NIL == upper_case_p(prev))) || ((next.isChar() && (NIL != lower_case_p(next))) && (!next.eql(CHAR_s))))) || ((NIL != digit_char_p(v_char, UNPROVIDED)) && ((NIL == prev) || (NIL == digit_char_p(prev, UNPROVIDED)))));
    }

    public static SubLObject eat_char_p(final SubLObject v_char) {
        return eq(v_char, CHAR_hyphen);
    }

    public static SubLObject capitalize_initial_char_p(final SubLObject v_char, final SubLObject next) {
        return makeBoolean((NIL != lower_case_p(v_char)) && (NIL != upper_case_p(next)));
    }

    public static SubLObject string_downcase_except_acronyms(final SubLObject string) {
        return string_ndowncase_except_acronyms(copy_string(string));
    }

    public static SubLObject string_ndowncase_except_acronyms(final SubLObject string) {
        SubLObject prev = NIL;
        SubLObject continueP = T;
        while (NIL != continueP) {
            continueP = NIL;
            prev = NIL;
            SubLObject end_var_$21;
            SubLObject end_var;
            SubLObject i;
            SubLObject curr;
            for (end_var = end_var_$21 = length(string), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var_$21); i = number_utilities.f_1X(i)) {
                curr = Strings.sublisp_char(string, i);
                if (prev.isChar()) {
                    if (((NIL != upper_case_p(prev)) && (NIL != lower_case_p(curr))) && ((((!curr.eql(CHAR_s)) || i.numL(TWO_INTEGER)) || (NIL != whitespacep(Strings.sublisp_char(string, subtract(i, TWO_INTEGER))))) || ((NIL == list_utilities.lengthLE(string, number_utilities.f_1X(i), UNPROVIDED)) && (NIL == whitespacep(Strings.sublisp_char(string, number_utilities.f_1X(i))))))) {
                        set_nth_char(number_utilities.f_1_(i), string, char_downcase(prev), UNPROVIDED);
                        continueP = T;
                    } else
                        if ((NIL != upper_case_p(curr)) && (NIL != lower_case_p(prev))) {
                            set_nth_char(i, string, char_downcase(curr), UNPROVIDED);
                            continueP = T;
                        } else
                            if ((((NIL != upper_case_p(curr)) && (NIL != whitespacep(prev))) && (NIL != list_utilities.lengthG(string, number_utilities.f_1X(i), UNPROVIDED))) && (NIL != whitespacep(Strings.sublisp_char(string, number_utilities.f_1X(i))))) {
                                set_nth_char(i, string, char_downcase(curr), UNPROVIDED);
                                continueP = T;
                            }


                }
                prev = curr;
            }
        } 
        return string;
    }

    public static SubLObject hex_char_p(final SubLObject v_object) {
        return makeBoolean(v_object.isChar() && (NIL != list_utilities.sublisp_boolean(digit_char_p(v_object, SIXTEEN_INTEGER))));
    }

    public static SubLObject hex_char(final SubLObject value) {
        assert NIL != integerp(value) : "Types.integerp(value) " + "CommonSymbols.NIL != Types.integerp(value) " + value;
        return Strings.sublisp_char($$$0123456789ABCDEF, value);
    }

    public static SubLObject hex_char_value(final SubLObject hex_char) {
        assert NIL != hex_char_p(hex_char) : "string_utilities.hex_char_p(hex_char) " + "CommonSymbols.NIL != string_utilities.hex_char_p(hex_char) " + hex_char;
        return digit_char_p(hex_char, SIXTEEN_INTEGER);
    }

    public static SubLObject hex_char_string_p(final SubLObject v_object) {
        return hex_string_p_int(v_object, T);
    }

    public static SubLObject hex_string_p(final SubLObject v_object) {
        return hex_string_p_int(v_object, NIL);
    }

    public static SubLObject hex_string_p_int(final SubLObject v_object, final SubLObject enforce_even_lengthP) {
        if (v_object.isString()) {
            final SubLObject length = length(v_object);
            if ((NIL == enforce_even_lengthP) || (NIL != evenp(length))) {
                SubLObject i;
                for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
                    if (NIL == hex_char_p(Strings.sublisp_char(v_object, i))) {
                        return NIL;
                    }
                }
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject integer_to_hex_string(final SubLObject integer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(integer) : "Types.integerp(integer) " + "CommonSymbols.NIL != Types.integerp(integer) " + integer;
        SubLObject hex_string = NIL;
        final SubLObject _prev_bind_0 = $print_base$.currentBinding(thread);
        try {
            $print_base$.bind(SIXTEEN_INTEGER, thread);
            hex_string = princ_to_string(integer);
        } finally {
            $print_base$.rebind(_prev_bind_0, thread);
        }
        return hex_string;
    }

    public static SubLObject f_64_bit_char_p(final SubLObject v_object) {
        return makeBoolean(v_object.isChar() && (NIL != gethash(v_object, $64_bit_char_index$.getGlobalValue(), UNPROVIDED)));
    }

    public static SubLObject f_64_bit_char(final SubLObject value) {
        assert NIL != integerp(value) : "Types.integerp(value) " + "CommonSymbols.NIL != Types.integerp(value) " + value;
        final SubLObject result = gethash(value, $64_bit_integer_index$.getGlobalValue(), UNPROVIDED);
        return result;
    }

    public static SubLObject f_64_bit_char_value(final SubLObject v_char) {
        assert NIL != characterp(v_char) : "Types.characterp(v_char) " + "CommonSymbols.NIL != Types.characterp(v_char) " + v_char;
        final SubLObject result = gethash(v_char, $64_bit_char_index$.getGlobalValue(), UNPROVIDED);
        return result;
    }

    public static SubLObject f_64_bit_string_p(final SubLObject v_object) {
        if (v_object.isString()) {
            SubLObject end_var_$22;
            SubLObject end_var;
            SubLObject char_num;
            SubLObject v_char;
            for (end_var = end_var_$22 = length(v_object), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$22); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(v_object, char_num);
                if ((NIL == f_64_bit_char_p(v_char)) && (!CHAR_equal.eql(v_char))) {
                    return NIL;
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject upper_case_alphanumeric_p(final SubLObject v_object) {
        return makeBoolean((NIL != upper_case_p(v_object)) || (NIL != digit_char_p(v_object, UNPROVIDED)));
    }

    public static SubLObject punctuation_p(final SubLObject v_char) {
        return makeBoolean(v_char.isChar() && (NIL != find(v_char, $str85$____________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject punctuation_extended_p(final SubLObject v_char) {
        return makeBoolean(v_char.isChar() && (NIL != find(v_char, $str86$_____________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject punctuation_string_p(final SubLObject string) {
        return makeBoolean(length(string).numE(ONE_INTEGER) && (NIL != punctuation_p(first_char(string))));
    }

    public static SubLObject remove_punctuation(final SubLObject string) {
        return remove_if(symbol_function(PUNCTUATION_EXTENDED_P), string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject upper_case_char_p(final SubLObject v_char) {
        return makeBoolean(v_char.isChar() && (NIL != upper_case_p(v_char)));
    }

    public static SubLObject lower_case_char_p(final SubLObject v_char) {
        return makeBoolean(v_char.isChar() && (NIL != lower_case_p(v_char)));
    }

    public static SubLObject upper_case_string_p(final SubLObject string) {
        SubLObject end_var_$23;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject ch;
        for (end_var = end_var_$23 = length(string), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$23); char_num = number_utilities.f_1X(char_num)) {
            ch = Strings.sublisp_char(string, char_num);
            if ((NIL != alpha_char_p(ch)) && (NIL != lower_case_p(ch))) {
                return NIL;
            }
        }
        return T;
    }

    public static SubLObject lower_case_string_p(final SubLObject string) {
        SubLObject end_var_$24;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject ch;
        for (end_var = end_var_$24 = length(string), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$24); char_num = number_utilities.f_1X(char_num)) {
            ch = Strings.sublisp_char(string, char_num);
            if ((NIL != alpha_char_p(ch)) && (NIL != upper_case_p(ch))) {
                return NIL;
            }
        }
        return T;
    }

    public static SubLObject string_list_downcase(final SubLObject string_list) {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = string_list;
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (string.isString()) {
                ans = cons(Strings.string_downcase(string, UNPROVIDED, UNPROVIDED), ans);
            } else {
                ans = cons(string, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return nreverse(ans);
    }

    public static SubLObject string_list_upcase(final SubLObject string_list) {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = string_list;
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (string.isString()) {
                ans = cons(Strings.string_upcase(string, UNPROVIDED, UNPROVIDED), ans);
            } else {
                ans = cons(string, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return nreverse(ans);
    }

    public static SubLObject nupcase_nth(final SubLObject string, final SubLObject n, SubLObject safeP) {
        if (safeP == UNPROVIDED) {
            safeP = T;
        }
        if (NIL != safeP) {
            assert NIL != subl_promotions.non_negative_integer_p(n) : "subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) " + n;
            assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        }
        if ((NIL == safeP) || (NIL != list_utilities.lengthG(string, n, UNPROVIDED))) {
            set_nth_char(n, string, char_upcase(Strings.sublisp_char(string, n)), NIL);
        }
        return string;
    }

    public static SubLObject nupcase_leading(final SubLObject string) {
        return nupcase_nth(string, ZERO_INTEGER, UNPROVIDED);
    }

    public static SubLObject upcase_leading(final SubLObject string) {
        return nupcase_leading(copy_string(string));
    }

    public static SubLObject ndowncase_nth(final SubLObject string, final SubLObject n, SubLObject safeP) {
        if (safeP == UNPROVIDED) {
            safeP = T;
        }
        if (NIL != safeP) {
            assert NIL != subl_promotions.non_negative_integer_p(n) : "subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) " + n;
            assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        }
        if ((NIL == safeP) || (NIL != list_utilities.lengthG(string, n, UNPROVIDED))) {
            set_nth_char(n, string, char_downcase(Strings.sublisp_char(string, n)), UNPROVIDED);
        }
        return string;
    }

    public static SubLObject ndowncase_leading(final SubLObject string) {
        return ndowncase_nth(string, ZERO_INTEGER, UNPROVIDED);
    }

    public static SubLObject downcase_leading(final SubLObject string) {
        return ndowncase_leading(copy_string(string));
    }

    public static SubLObject all_chars_EP(final SubLObject ch, final SubLObject string) {
        final SubLObject len = length(string);
        SubLObject v_boolean = T;
        if (len.numG(ZERO_INTEGER)) {
            SubLObject pos;
            for (pos = NIL, pos = ZERO_INTEGER; (!pos.numE(len)) && (NIL != v_boolean); pos = add(pos, ONE_INTEGER)) {
                if (NIL == charE(ch, Strings.sublisp_char(string, pos))) {
                    v_boolean = NIL;
                }
            }
            return v_boolean;
        }
        return NIL;
    }

    public static SubLObject string_contains_only_charsP(final SubLObject string, final SubLObject char_list) {
        SubLObject other_charsP = NIL;
        final SubLObject end_var = length(string);
        if (NIL == other_charsP) {
            SubLObject end_var_$25;
            SubLObject char_num;
            SubLObject v_char;
            for (end_var_$25 = end_var, char_num = NIL, char_num = ZERO_INTEGER; (NIL == other_charsP) && (!char_num.numGE(end_var_$25)); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(string, char_num);
                if (NIL == subl_promotions.memberP(v_char, char_list, UNPROVIDED, UNPROVIDED)) {
                    other_charsP = T;
                }
            }
        }
        return makeBoolean(NIL == other_charsP);
    }

    public static SubLObject whitespace_chars() {
        return copy_list($whitespace_chars$.getGlobalValue());
    }

    public static SubLObject whitespace_charP(final SubLObject v_char) {
        return subl_promotions.memberP(v_char, $whitespace_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject grammatical_punctuation_chars() {
        return copy_list($grammatical_punctuation_chars$.getGlobalValue());
    }

    public static SubLObject grammatical_punctuation_charP(final SubLObject v_char) {
        return subl_promotions.memberP(v_char, $grammatical_punctuation_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject trim_whitespace(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        return Strings.string_trim($whitespace_chars$.getGlobalValue(), string);
    }

    public static SubLObject left_trim_whitespace(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        return Strings.string_left_trim($whitespace_chars$.getGlobalValue(), string);
    }

    public static SubLObject right_trim_whitespace(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        return Strings.string_right_trim($whitespace_chars$.getGlobalValue(), string);
    }

    public static SubLObject trim_whitespace_if_string(final SubLObject v_object) {
        if (v_object.isString()) {
            return Strings.string_trim($whitespace_chars$.getGlobalValue(), v_object);
        }
        return $str0$;
    }

    public static SubLObject nsubst_whitespace(SubLObject string) {
        final SubLObject string_var;
        string = string_var = normalize_spaces(string);
        SubLObject end_var_$26;
        SubLObject end_var;
        SubLObject i;
        SubLObject v_char;
        for (end_var = end_var_$26 = length(string_var), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var_$26); i = number_utilities.f_1X(i)) {
            v_char = Strings.sublisp_char(string_var, i);
            if ((NIL != subl_promotions.memberP(v_char, $whitespace_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) && (!v_char.eql(CHAR_space))) {
                set_nth_char(i, string, CHAR_space, UNPROVIDED);
            }
        }
        return string;
    }

    public static SubLObject normalize_spaces(SubLObject string) {
        if (NIL != unicode_strings.non_ascii_string_p(string)) {
            string = unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(nsubstitute_if($int$32, UNICODE_SPACE_CHAR_CODE_P, unicode_strings.utf8_string_to_unicode_vector(string), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED));
        }
        return string;
    }

    public static SubLObject subst_whitespace(final SubLObject string) {
        return nsubst_whitespace(copy_string(string));
    }

    public static SubLObject whitespacep(final SubLObject v_char) {
        return makeBoolean(v_char.isChar() && ((NIL != find(v_char, $whitespace_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || ((NIL != unicode_strings.non_ascii_char_p(v_char)) && (NIL != unicode_space_char_code_p(char_code(v_char))))));
    }

    public static SubLObject unicode_space_char_code_p(final SubLObject code) {
        return makeBoolean(code.numGE($int$8192) && code.numLE($int$8203));
    }

    public static SubLObject non_whitespace_p(final SubLObject v_char) {
        return makeBoolean(NIL == whitespacep(v_char));
    }

    public static SubLObject read_whitespace_no_hang(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = T;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = NIL;
        }
        SubLObject v_char;
        for (v_char = NIL, v_char = read_char_no_hang(stream, eof_error_p, eof_value, UNPROVIDED); (NIL != v_char) && (NIL != whitespacep(v_char)); v_char = read_char_no_hang(stream, eof_error_p, eof_value, UNPROVIDED)) {
        }
        if (v_char.isChar()) {
            unread_char(v_char, stream);
        }
        return v_char;
    }

    public static SubLObject whitespace_stringP(final SubLObject string) {
        return string_contains_only_charsP(string, $whitespace_chars$.getGlobalValue());
    }

    public static SubLObject trim_quotes(SubLObject string, SubLObject escaped_quote_as_string) {
        if (escaped_quote_as_string == UNPROVIDED) {
            escaped_quote_as_string = $str21$_;
        }
        if (NIL != starts_with(string, escaped_quote_as_string)) {
            string = subseq(string, ONE_INTEGER, UNPROVIDED);
        }
        if (NIL != ends_with(string, escaped_quote_as_string, UNPROVIDED)) {
            string = subseq(string, ZERO_INTEGER, subtract(length(string), ONE_INTEGER));
        }
        return string;
    }

    public static SubLObject remove_whitespace(final SubLObject string) {
        return remove_if(WHITESPACEP, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject equal_modulo_whitespace(final SubLObject string1, final SubLObject string2) {
        return equal(remove_whitespace(string1), remove_whitespace(string2));
    }

    public static SubLObject equalp_modulo_whitespace(final SubLObject string1, final SubLObject string2) {
        return equalp(remove_whitespace(string1), remove_whitespace(string2));
    }

    public static SubLObject substringP_modulo_whitespace(final SubLObject little, final SubLObject big) {
        return substringP(remove_whitespace(little), remove_whitespace(big), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject network_terpri(final SubLObject stream) {
        write_char(code_char(THIRTEEN_INTEGER), stream);
        terpri(stream);
        return NIL;
    }

    public static SubLObject add_to_buffer(final SubLObject v_char, SubLObject buffer, final SubLObject idx) {
        final SubLObject length = length(buffer);
        if (idx.numGE(length)) {
            final SubLObject new_buffer = Strings.make_string(multiply(length, TWO_INTEGER), UNPROVIDED);
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
                set_nth_char(i, new_buffer, Strings.sublisp_char(buffer, i), UNPROVIDED);
            }
            buffer = new_buffer;
        }
        set_nth_char(idx, buffer, v_char, UNPROVIDED);
        return buffer;
    }

    public static SubLObject network_read_line(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value, SubLObject return_partial_lineP) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = T;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = $EOF;
        }
        if (return_partial_lineP == UNPROVIDED) {
            return_partial_lineP = NIL;
        }
        final SubLObject length = $int$64;
        SubLObject buffer = Strings.make_string(length, UNPROVIDED);
        SubLObject idx = ZERO_INTEGER;
        SubLObject state = $NORMAL;
        SubLObject done = NIL;
        while (NIL == done) {
            final SubLObject ch = read_char(stream, eof_error_p, NIL, UNPROVIDED);
            if (NIL != ch) {
                if (NIL != charE(ch, code_char(THIRTEEN_INTEGER))) {
                    final SubLObject pcase_var = state;
                    if (pcase_var.eql($NORMAL)) {
                        state = $CR;
                    } else {
                        if (!pcase_var.eql($CR)) {
                            continue;
                        }
                        buffer = add_to_buffer(code_char(THIRTEEN_INTEGER), buffer, idx);
                        idx = add(idx, ONE_INTEGER);
                    }
                } else
                    if (NIL != charE(ch, code_char(TEN_INTEGER))) {
                        final SubLObject pcase_var = state;
                        if (pcase_var.eql($NORMAL)) {
                            done = T;
                        } else {
                            if (!pcase_var.eql($CR)) {
                                continue;
                            }
                            done = T;
                        }
                    } else {
                        final SubLObject pcase_var = state;
                        if (pcase_var.eql($NORMAL)) {
                            buffer = add_to_buffer(ch, buffer, idx);
                            idx = add(idx, ONE_INTEGER);
                        } else {
                            if (!pcase_var.eql($CR)) {
                                continue;
                            }
                            buffer = add_to_buffer(code_char(THIRTEEN_INTEGER), buffer, idx);
                            idx = add(idx, ONE_INTEGER);
                            buffer = add_to_buffer(ch, buffer, idx);
                            idx = add(idx, ONE_INTEGER);
                            state = $NORMAL;
                        }
                    }

            } else {
                if ((NIL == return_partial_lineP) || (!idx.isPositive())) {
                    return values(eof_value, T);
                }
                done = T;
            }
        } 
        return values(substring(buffer, ZERO_INTEGER, idx), NIL);
    }

    public static SubLObject read_possibly_continued_line(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = T;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = $EOF;
        }
        SubLObject lines = NIL;
        SubLObject state = $NORMAL;
        while (true) {
            final SubLObject line = network_read_line(stream, eof_error_p, NIL, UNPROVIDED);
            if (NIL == line) {
                return values(eof_value, T);
            }
            final SubLObject string_var = line;
            SubLObject end_var_$27;
            SubLObject end_var;
            SubLObject char_num;
            SubLObject ch;
            SubLObject pcase_var;
            SubLObject pcase_var_$28;
            SubLObject pcase_var_$29;
            for (end_var = end_var_$27 = length(string_var), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$27); char_num = number_utilities.f_1X(char_num)) {
                ch = Strings.sublisp_char(string_var, char_num);
                pcase_var = state;
                if (pcase_var.eql($NORMAL)) {
                    pcase_var_$28 = ch;
                    if (pcase_var_$28.eql(CHAR_quotation)) {
                        state = $STRING;
                    }
                } else
                    if (pcase_var.eql($STRING)) {
                        pcase_var_$29 = ch;
                        if (pcase_var_$29.eql(CHAR_quotation)) {
                            state = $NORMAL;
                        } else
                            if (pcase_var_$29.eql(CHAR_backslash)) {
                                state = $SLASH;
                            }

                    } else
                        if (pcase_var.eql($SLASH)) {
                            state = $STRING;
                        }


            }
            if (state == $NORMAL) {
                if (NIL != lines) {
                    SubLObject new_lines = list(line);
                    SubLObject cdolist_list_var = lines;
                    SubLObject old_line = NIL;
                    old_line = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        new_lines = cons(Strings.make_string(ONE_INTEGER, CHAR_newline), new_lines);
                        new_lines = cons(old_line, new_lines);
                        cdolist_list_var = cdolist_list_var.rest();
                        old_line = cdolist_list_var.first();
                    } 
                    return values(apply(symbol_function(CCONCATENATE), new_lines), NIL);
                }
                return values(line, NIL);
            } else {
                lines = cons(line, lines);
            }
        } 
    }

    public static SubLObject find_earliest_string(final SubLObject string, final SubLObject search_strings, SubLObject test, SubLObject start) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        SubLObject earliest_position = length(string);
        SubLObject earliest_string = NIL;
        SubLObject done = NIL;
        if (NIL == done) {
            SubLObject csome_list_var = search_strings;
            SubLObject control_string = NIL;
            control_string = csome_list_var.first();
            while ((NIL == done) && (NIL != csome_list_var)) {
                final SubLObject position = search(control_string, string, test, symbol_function(IDENTITY), ZERO_INTEGER, NIL, start, earliest_position);
                if ((NIL != position) && position.numL(earliest_position)) {
                    earliest_position = position;
                    earliest_string = control_string;
                }
                done = numE(earliest_position, start);
                csome_list_var = csome_list_var.rest();
                control_string = csome_list_var.first();
            } 
        }
        return values(NIL != earliest_string ? earliest_position : NIL, earliest_string);
    }

    public static SubLObject search_last(final SubLObject seq1, final SubLObject seq2, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        return list_utilities.last_one(search_all(seq1, seq2, test, key));
    }

    public static SubLObject princ_substring(final SubLObject string, final SubLObject stream, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        if (NIL == end) {
            end = length(string);
        }
        final SubLObject substring_length = subtract(end, start);
        if (substring_length.isPositive()) {
            SubLObject index;
            for (index = NIL, index = ZERO_INTEGER; index.numL(substring_length); index = add(index, ONE_INTEGER)) {
                write_char(Strings.sublisp_char(string, add(start, index)), stream);
            }
        }
        return NIL;
    }

    public static SubLObject strcat(final SubLObject string_list) {
        if (NIL == string_list) {
            return NIL;
        }
        return apply(symbol_function(CCONCATENATE), string_list);
    }

    public static SubLObject nchar_subst(final SubLObject v_new, final SubLObject old, final SubLObject string) {
        assert NIL != characterp(v_new) : "Types.characterp(v_new) " + "CommonSymbols.NIL != Types.characterp(v_new) " + v_new;
        assert NIL != characterp(old) : "Types.characterp(old) " + "CommonSymbols.NIL != Types.characterp(old) " + old;
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        SubLObject end_var_$30;
        SubLObject end_var;
        SubLObject i;
        SubLObject v_char;
        for (end_var = end_var_$30 = length(string), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var_$30); i = number_utilities.f_1X(i)) {
            v_char = Strings.sublisp_char(string, i);
            if (v_char.eql(old)) {
                set_nth_char(i, string, v_new, UNPROVIDED);
            }
        }
        return string;
    }

    public static SubLObject char_subst(final SubLObject v_new, final SubLObject old, final SubLObject string) {
        return nchar_subst(v_new, old, copy_string(string));
    }

    public static SubLObject nchar_subst_if(final SubLObject v_new, final SubLObject test, final SubLObject string) {
        assert NIL != characterp(v_new) : "Types.characterp(v_new) " + "CommonSymbols.NIL != Types.characterp(v_new) " + v_new;
        assert NIL != fboundp(test) : "Symbols.fboundp(test) " + "CommonSymbols.NIL != Symbols.fboundp(test) " + test;
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        SubLObject end_var_$31;
        SubLObject end_var;
        SubLObject i;
        SubLObject v_char;
        for (end_var = end_var_$31 = length(string), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var_$31); i = number_utilities.f_1X(i)) {
            v_char = Strings.sublisp_char(string, i);
            if (NIL != funcall(test, v_char)) {
                set_nth_char(i, string, v_new, UNPROVIDED);
            }
        }
        return string;
    }

    public static SubLObject char_subst_if(final SubLObject v_new, final SubLObject test, final SubLObject string) {
        return nchar_subst_if(v_new, test, copy_string(string));
    }

    public static SubLObject nchar_subst_if_not(final SubLObject v_new, final SubLObject test, final SubLObject string) {
        assert NIL != characterp(v_new) : "Types.characterp(v_new) " + "CommonSymbols.NIL != Types.characterp(v_new) " + v_new;
        assert NIL != fboundp(test) : "Symbols.fboundp(test) " + "CommonSymbols.NIL != Symbols.fboundp(test) " + test;
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        SubLObject end_var_$32;
        SubLObject end_var;
        SubLObject i;
        SubLObject v_char;
        for (end_var = end_var_$32 = length(string), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var_$32); i = number_utilities.f_1X(i)) {
            v_char = Strings.sublisp_char(string, i);
            if (NIL == funcall(test, v_char)) {
                set_nth_char(i, string, v_new, UNPROVIDED);
            }
        }
        return string;
    }

    public static SubLObject char_subst_if_not(final SubLObject v_new, final SubLObject test, final SubLObject string) {
        return nchar_subst_if_not(v_new, test, copy_string(string));
    }

    public static SubLObject string_subst(final SubLObject v_new, final SubLObject old, final SubLObject string, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        assert NIL != stringp(v_new) : "Types.stringp(v_new) " + "CommonSymbols.NIL != Types.stringp(v_new) " + v_new;
        assert NIL != non_empty_string_p(old) : "string_utilities.non_empty_string_p(old) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(old) " + old;
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        final SubLObject new_length = length(v_new);
        final SubLObject old_length = length(old);
        SubLObject total_occurrences = ZERO_INTEGER;
        SubLObject string_start;
        SubLObject position;
        for (string_start = NIL, position = NIL, string_start = ZERO_INTEGER, position = search(old, string, test, symbol_function(IDENTITY), ZERO_INTEGER, NIL, string_start, NIL); NIL != position; position = search(old, string, test, symbol_function(IDENTITY), ZERO_INTEGER, NIL, string_start, NIL)) {
            total_occurrences = add(total_occurrences, ONE_INTEGER);
            string_start = add(position, old_length);
        }
        if (total_occurrences.numE(ZERO_INTEGER)) {
            return string;
        }
        final SubLObject string_length = length(string);
        final SubLObject delta = multiply(total_occurrences, subtract(new_length, old_length));
        final SubLObject subst_length = add(string_length, delta);
        final SubLObject subst_string = Strings.make_string(subst_length, CHAR_space);
        SubLObject string_index = ZERO_INTEGER;
        SubLObject subst_index = ZERO_INTEGER;
        SubLObject string_start2;
        SubLObject position2;
        SubLObject string_seq_length;
        for (string_start2 = NIL, position2 = NIL, string_start2 = ZERO_INTEGER, position2 = search(old, string, test, symbol_function(IDENTITY), ZERO_INTEGER, NIL, string_start2, NIL); NIL != position2; position2 = search(old, string, test, symbol_function(IDENTITY), ZERO_INTEGER, NIL, string_start2, NIL)) {
            string_seq_length = subtract(position2, string_index);
            replace(subst_string, string, subst_index, add(subst_index, string_seq_length), string_index, position2);
            string_index = add(string_index, string_seq_length);
            subst_index = add(subst_index, string_seq_length);
            replace(subst_string, v_new, subst_index, add(subst_index, new_length), ZERO_INTEGER, new_length);
            string_index = add(string_index, old_length);
            subst_index = add(subst_index, new_length);
            string_start2 = add(position2, old_length);
        }
        if (!subst_index.numE(subst_length)) {
            replace(subst_string, string, subst_index, NIL, string_index, NIL);
        }
        return subst_string;
    }

    public static SubLObject trim_sides(final SubLObject string, SubLObject char_to_trim) {
        if (char_to_trim == UNPROVIDED) {
            char_to_trim = CHAR_space;
        }
        SubLObject result = (string.isString()) ? Strings.string_trim(list(char_to_trim), string) : NIL;
        if (NIL != empty_string_p(result)) {
            result = NIL;
        }
        return result;
    }

    public static SubLObject valid_timestring_charP(final SubLObject ch) {
        return makeBoolean((NIL != digit_char_p(ch, UNPROVIDED)) || (NIL != find(ch, $list102, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject string_trim_symmetric_n(final SubLObject char_list, final SubLObject string, SubLObject n) {
        if (n == UNPROVIDED) {
            n = NIL;
        }
        if (ZERO_INTEGER.eql(n)) {
            return string;
        }
        final SubLObject string_length = length(string);
        if (TWO_INTEGER.numG(string_length)) {
            return string;
        }
        final SubLObject first_char = Strings.sublisp_char(string, ZERO_INTEGER);
        if (NIL != subl_promotions.memberP(first_char, char_list, UNPROVIDED, UNPROVIDED)) {
            final SubLObject last_char = Strings.sublisp_char(string, subtract(string_length, ONE_INTEGER));
            if (NIL != charE(first_char, last_char)) {
                final SubLObject new_string = substring(string, ONE_INTEGER, subtract(string_length, ONE_INTEGER));
                if (NIL == n) {
                    return string_trim_symmetric_n(char_list, new_string, UNPROVIDED);
                }
                if (n.numE(ZERO_INTEGER)) {
                    return new_string;
                }
                return string_trim_symmetric_n(char_list, new_string, subtract(n, ONE_INTEGER));
            }
        }
        return string;
    }

    public static SubLObject break_words(final SubLObject string, SubLObject non_break_char_test, SubLObject leave_embedded_stringsP) {
        if (non_break_char_test == UNPROVIDED) {
            non_break_char_test = symbol_function(VALID_CONSTANT_NAME_CHAR_P);
        }
        if (leave_embedded_stringsP == UNPROVIDED) {
            leave_embedded_stringsP = NIL;
        }
        final SubLObject len = length(string);
        SubLObject p1 = ZERO_INTEGER;
        SubLObject p2 = ONE_INTEGER;
        SubLObject ans = NIL;
        SubLObject inside_dqP = NIL;
        while (!p2.numG(len)) {
            final SubLObject px = subtract(p2, ONE_INTEGER);
            final SubLObject c1 = Strings.sublisp_char(string, p1);
            final SubLObject c2 = (p2.numL(len)) ? Strings.sublisp_char(string, p2) : NIL;
            final SubLObject cx = Strings.sublisp_char(string, px);
            final SubLObject c1_is_breakP = makeBoolean((c1.isChar() && ((NIL == leave_embedded_stringsP) || (NIL == charE(c1, CHAR_quotation)))) && (NIL == funcall(non_break_char_test, c1)));
            final SubLObject c2_is_breakP = makeBoolean((c2.isChar() && ((NIL == leave_embedded_stringsP) || (NIL == charE(c2, CHAR_quotation)))) && (NIL == funcall(non_break_char_test, c2)));
            if ((NIL != charE(c1, CHAR_quotation)) && (NIL != leave_embedded_stringsP)) {
                if (NIL != inside_dqP) {
                    if ((NIL != charE(cx, CHAR_quotation)) && (!p1.numE(px))) {
                        inside_dqP = NIL;
                    }
                } else {
                    inside_dqP = T;
                }
            }
            if (p2.numE(len) && (NIL == c1_is_breakP)) {
                ans = cons(subseq(string, p1, p2), ans);
                p2 = add(p2, ONE_INTEGER);
            } else
                if (NIL != c1_is_breakP) {
                    p1 = add(p1, ONE_INTEGER);
                    p2 = add(p1, ONE_INTEGER);
                } else
                    if ((NIL == c1_is_breakP) && (NIL == c2_is_breakP)) {
                        p2 = add(p2, ONE_INTEGER);
                    } else
                        if (((NIL == c1_is_breakP) && (NIL == inside_dqP)) && (NIL != c2_is_breakP)) {
                            ans = cons(subseq(string, p1, p2), ans);
                            p1 = add(p2, ONE_INTEGER);
                            p2 = add(p1, ONE_INTEGER);
                        } else {
                            if (((NIL != c1_is_breakP) || (NIL == inside_dqP)) || (NIL == c2_is_breakP)) {
                                continue;
                            }
                            p2 = add(p2, ONE_INTEGER);
                        }



        } 
        return nreverse(ans);
    }

    public static SubLObject sub_phrases(final SubLObject string) {
        SubLObject strings = NIL;
        final SubLObject space_positions = list_utilities.all_positions(CHAR_space, string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = cons(ZERO_INTEGER, Mapping.mapcar($sym104$1_, space_positions));
        SubLObject start = NIL;
        start = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$33 = cons(NIL, space_positions);
            SubLObject end = NIL;
            end = cdolist_list_var_$33.first();
            while (NIL != cdolist_list_var_$33) {
                if ((NIL == end) || end.numG(start)) {
                    final SubLObject item_var = substring(string, start, end);
                    if (NIL == member(item_var, strings, symbol_function(EQL), symbol_function(IDENTITY))) {
                        strings = cons(item_var, strings);
                    }
                }
                cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                end = cdolist_list_var_$33.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            start = cdolist_list_var.first();
        } 
        return strings;
    }

    public static SubLObject number_of_words(final SubLObject string) {
        return add(ONE_INTEGER, count_chars_in_string(trim_whitespace(string), CHAR_space));
    }

    public static SubLObject first_word(final SubLObject string, SubLObject word_boundary) {
        if (word_boundary == UNPROVIDED) {
            word_boundary = $space_char$.getGlobalValue();
        }
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != characterp(word_boundary) : "Types.characterp(word_boundary) " + "CommonSymbols.NIL != Types.characterp(word_boundary) " + word_boundary;
        return string_upto(string, word_boundary);
    }

    public static SubLObject substring_positions(final SubLObject string, final SubLObject strings) {
        SubLObject ans = NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject found_one;
        SubLObject csome_list_var;
        SubLObject d;
        for (cdotimes_end_var = length(string), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            found_one = NIL;
            if (NIL == found_one) {
                csome_list_var = strings;
                d = NIL;
                d = csome_list_var.first();
                while ((NIL == found_one) && (NIL != csome_list_var)) {
                    if (NIL != starts_with(subseq(string, i, UNPROVIDED), d)) {
                        ans = cons(list(i, d), ans);
                        found_one = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    d = csome_list_var.first();
                } 
            }
        }
        return nreverse(ans);
    }

    public static SubLObject break_string(final SubLObject string, final SubLObject break_substrings) {
        SubLObject ans = NIL;
        final SubLObject len = length(string);
        final SubLObject substr_positions = substring_positions(string, break_substrings);
        SubLObject i1 = ZERO_INTEGER;
        SubLObject i2 = ZERO_INTEGER;
        while (!i2.numG(len)) {
            final SubLObject pair = assoc(i2, substr_positions, UNPROVIDED, UNPROVIDED);
            final SubLObject str = second(pair);
            final SubLObject strlen = length(str);
            if (i2.numE(len) && i1.numL(i2)) {
                ans = cons(subseq(string, i1, i2), ans);
                i2 = i1 = add(i2, ONE_INTEGER);
            } else
                if (NIL != str) {
                    ans = cons(subseq(string, i1, i2), ans);
                    ans = cons(str, ans);
                    i2 = i1 = add(i2, strlen);
                } else {
                    i2 = add(i2, ONE_INTEGER);
                }

        } 
        return nreverse(ans);
    }

    public static SubLObject first_name_first(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        SubLObject ans = string;
        SubLObject coordP = NIL;
        if (NIL == coordP) {
            SubLObject csome_list_var = $list105;
            SubLObject sub = NIL;
            sub = csome_list_var.first();
            while ((NIL == coordP) && (NIL != csome_list_var)) {
                if (NIL != substringP(sub, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    coordP = T;
                }
                csome_list_var = csome_list_var.rest();
                sub = csome_list_var.first();
            } 
        }
        if (NIL == coordP) {
            final SubLObject strings = string_tokenize(string, $list106, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (length(strings).numE(TWO_INTEGER)) {
                ans = bunge(reverse(strings), UNPROVIDED);
            }
        }
        return ans;
    }

    public static SubLObject char_list_to_string(final SubLObject chars) {
        final SubLObject len = length(chars);
        SubLObject i = ZERO_INTEGER;
        final SubLObject string = Strings.make_string(len, UNPROVIDED);
        SubLObject cdolist_list_var = chars;
        SubLObject c = NIL;
        c = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject char_to_use = (c.isChar()) ? c : CHAR_space;
            set_nth_char(i, string, char_to_use, NIL);
            i = add(i, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            c = cdolist_list_var.first();
        } 
        return string;
    }

    public static SubLObject string_to_char_list(final SubLObject string) {
        SubLObject char_list = NIL;
        SubLObject index;
        for (index = NIL, index = ZERO_INTEGER; !index.eql(length(string)); index = add(index, ONE_INTEGER)) {
            char_list = cons(elt(string, index), char_list);
        }
        return nreverse(char_list);
    }

    public static SubLObject count_chars_in_string(final SubLObject string, final SubLObject character) {
        return count(character, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject some_are_substringsP(final SubLObject stringlist, final SubLObject string, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        SubLObject v_boolean = NIL;
        if (NIL == v_boolean) {
            SubLObject csome_list_var = stringlist;
            SubLObject s = NIL;
            s = csome_list_var.first();
            while ((NIL == v_boolean) && (NIL != csome_list_var)) {
                if (NIL != substringP(s, string, test, UNPROVIDED, UNPROVIDED)) {
                    v_boolean = T;
                }
                csome_list_var = csome_list_var.rest();
                s = csome_list_var.first();
            } 
        }
        return v_boolean;
    }

    public static SubLObject substring_every_in_list(final SubLObject stringlist, final SubLObject string, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        SubLObject failP = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var = stringlist;
            SubLObject s = NIL;
            s = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                if (NIL == substringP(s, string, test, UNPROVIDED, UNPROVIDED)) {
                    failP = T;
                }
                csome_list_var = csome_list_var.rest();
                s = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == failP);
    }

    public static SubLObject target_character_found(final SubLObject v_char) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return member(v_char, $target_characters$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject separate_sentences(final SubLObject string, SubLObject sentence_breaks) {
        if (sentence_breaks == UNPROVIDED) {
            sentence_breaks = $list107;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $target_characters$.currentBinding(thread);
        try {
            $target_characters$.bind(sentence_breaks, thread);
            SubLObject start;
            SubLObject index;
            for (start = NIL, index = NIL, start = ZERO_INTEGER, index = position_if(symbol_function(TARGET_CHARACTER_FOUND), string, symbol_function(IDENTITY), start, UNPROVIDED); (NIL != index) && (!index.eql(length(string))); index = position_if(symbol_function(TARGET_CHARACTER_FOUND), string, symbol_function(IDENTITY), start, UNPROVIDED)) {
                ans = cons(trim_whitespace(subseq(string, start, add(index, ONE_INTEGER))), ans);
                start = add(index, ONE_INTEGER);
            }
            ans = cons(trim_whitespace(subseq(string, start, UNPROVIDED)), ans);
        } finally {
            $target_characters$.rebind(_prev_bind_0, thread);
        }
        return nreverse(delete($empty_string$.getGlobalValue(), ans, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject extract_lines(final SubLObject string) {
        if (NIL != string) {
            final SubLObject lines = split_string(string, $list109);
            SubLObject new_lines = NIL;
            SubLObject cdolist_list_var = lines;
            SubLObject line = NIL;
            line = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject new_line = Strings.string_trim($list66, line);
                if (NIL == empty_string_p(new_line)) {
                    new_lines = cons(new_line, new_lines);
                }
                cdolist_list_var = cdolist_list_var.rest();
                line = cdolist_list_var.first();
            } 
            return nreverse(new_lines);
        }
        return NIL;
    }

    public static SubLObject collapse_lines(final SubLObject lines) {
        SubLObject size = ZERO_INTEGER;
        SubLObject cdolist_list_var = lines;
        SubLObject line = NIL;
        line = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            size = add(size, length(line));
            cdolist_list_var = cdolist_list_var.rest();
            line = cdolist_list_var.first();
        } 
        size = add(size, length(lines));
        final SubLObject v_new = Strings.make_string(size, UNPROVIDED);
        SubLObject new_idx = ZERO_INTEGER;
        SubLObject cdolist_list_var2 = lines;
        SubLObject line2 = NIL;
        line2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject cdotimes_end_var;
            SubLObject line_idx;
            for (cdotimes_end_var = length(line2), line_idx = NIL, line_idx = ZERO_INTEGER; line_idx.numL(cdotimes_end_var); line_idx = add(line_idx, ONE_INTEGER)) {
                set_nth_char(new_idx, v_new, Strings.sublisp_char(line2, line_idx), UNPROVIDED);
                new_idx = add(new_idx, ONE_INTEGER);
            }
            set_nth_char(new_idx, v_new, CHAR_newline, UNPROVIDED);
            new_idx = add(new_idx, ONE_INTEGER);
            cdolist_list_var2 = cdolist_list_var2.rest();
            line2 = cdolist_list_var2.first();
        } 
        return v_new;
    }

    public static SubLObject quotify_string(final SubLObject string) {
        final SubLObject quotables = $list110;
        SubLObject size;
        final SubLObject length = size = length(string);
        SubLObject end_var_$34;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject v_char;
        for (end_var = end_var_$34 = length(string), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$34); char_num = number_utilities.f_1X(char_num)) {
            v_char = Strings.sublisp_char(string, char_num);
            if (NIL != subl_promotions.memberP(v_char, quotables, UNPROVIDED, UNPROVIDED)) {
                size = add(size, ONE_INTEGER);
            }
        }
        final SubLObject ans = Strings.make_string(size, UNPROVIDED);
        SubLObject idx = ZERO_INTEGER;
        SubLObject end_var_$35;
        SubLObject end_var2;
        SubLObject char_num2;
        SubLObject v_char2;
        for (end_var2 = end_var_$35 = length(string), char_num2 = NIL, char_num2 = ZERO_INTEGER; !char_num2.numGE(end_var_$35); char_num2 = number_utilities.f_1X(char_num2)) {
            v_char2 = Strings.sublisp_char(string, char_num2);
            if (NIL != subl_promotions.memberP(v_char2, quotables, UNPROVIDED, UNPROVIDED)) {
                Strings.set_char(ans, idx, CHAR_backslash);
                idx = add(idx, ONE_INTEGER);
            }
            set_nth_char(idx, ans, v_char2, UNPROVIDED);
            idx = add(idx, ONE_INTEGER);
        }
        return ans;
    }

    public static SubLObject string_line_lengths(final SubLObject string) {
        final SubLObject string_length = length(string);
        final SubLObject found_newlines = search_all(Strings.make_string(ONE_INTEGER, CHAR_newline), string, UNPROVIDED, UNPROVIDED);
        SubLObject line_lengths = NIL;
        SubLObject last_pos = ZERO_INTEGER;
        SubLObject cdolist_list_var = found_newlines;
        SubLObject found_newline = NIL;
        found_newline = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            line_lengths = cons(subtract(found_newline, last_pos), line_lengths);
            last_pos = add(found_newline, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            found_newline = cdolist_list_var.first();
        } 
        line_lengths = cons(subtract(string_length, last_pos), line_lengths);
        return nreverse(line_lengths);
    }

    public static SubLObject relevant_substrings(final SubLObject in_string) {
        SubLObject out_strings = NIL;
        SubLObject cur_string_list = NIL;
        SubLObject end_var_$36;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject this_character;
        for (end_var = end_var_$36 = length(in_string), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$36); char_num = number_utilities.f_1X(char_num)) {
            this_character = Strings.sublisp_char(in_string, char_num);
            if ((NIL != upper_case_p(this_character)) || (NIL == alphanumericp(this_character))) {
                if (NIL != cur_string_list) {
                    out_strings = cons(apply(symbol_function(CCONCATENATE), nreverse(cur_string_list)), out_strings);
                    cur_string_list = NIL;
                }
                if (NIL != upper_case_p(this_character)) {
                    this_character = char_downcase(this_character);
                }
            }
            if (NIL != alphanumericp(this_character)) {
                cur_string_list = cons(Strings.make_string(ONE_INTEGER, this_character), cur_string_list);
            }
        }
        if (NIL != cur_string_list) {
            out_strings = cons(apply(symbol_function(CCONCATENATE), nreverse(cur_string_list)), out_strings);
            cur_string_list = NIL;
        }
        return nreverse(out_strings);
    }

    public static SubLObject make_valid_constant_name(final SubLObject in_string, SubLObject upcase_initial_letterP) {
        if (upcase_initial_letterP == UNPROVIDED) {
            upcase_initial_letterP = T;
        }
        SubLObject cur_string_list = NIL;
        SubLObject should_we_upcaseP = upcase_initial_letterP;
        SubLObject end_var_$37;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject this_character;
        for (end_var = end_var_$37 = length(in_string), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$37); char_num = number_utilities.f_1X(char_num)) {
            this_character = Strings.sublisp_char(in_string, char_num);
            if (NIL != constant_completion_high.valid_constant_name_char_p(this_character)) {
                if (NIL != alphanumericp(this_character)) {
                    if (NIL != should_we_upcaseP) {
                        cur_string_list = cons(Strings.string_upcase(Strings.make_string(ONE_INTEGER, this_character), UNPROVIDED, UNPROVIDED), cur_string_list);
                        should_we_upcaseP = NIL;
                    } else {
                        cur_string_list = cons(Strings.make_string(ONE_INTEGER, this_character), cur_string_list);
                    }
                } else {
                    cur_string_list = cons(Strings.make_string(ONE_INTEGER, this_character), cur_string_list);
                    should_we_upcaseP = T;
                }
            } else {
                should_we_upcaseP = T;
            }
        }
        return apply(symbol_function(CCONCATENATE), nreverse(cur_string_list));
    }

    public static SubLObject nl_string_tokenize(final SubLObject in_string, SubLObject break_list, SubLObject embed_list, SubLObject include_stopsP, SubLObject ignore_empty_stringsP, SubLObject quote_chars, SubLObject break_list_to_return) {
        if (break_list == UNPROVIDED) {
            break_list = $whitespace_chars$.getGlobalValue();
        }
        if (embed_list == UNPROVIDED) {
            embed_list = NIL;
        }
        if (include_stopsP == UNPROVIDED) {
            include_stopsP = NIL;
        }
        if (ignore_empty_stringsP == UNPROVIDED) {
            ignore_empty_stringsP = NIL;
        }
        if (quote_chars == UNPROVIDED) {
            quote_chars = NIL;
        }
        if (break_list_to_return == UNPROVIDED) {
            break_list_to_return = $grammatical_punctuation_chars$.getGlobalValue();
        }
        return string_tokenize_int(in_string, break_list, break_list_to_return, embed_list, include_stopsP, ignore_empty_stringsP, quote_chars);
    }

    public static SubLObject string_tokenize(final SubLObject in_string, SubLObject break_list, SubLObject embed_list, SubLObject include_stopsP, SubLObject ignore_empty_stringsP, SubLObject quote_chars, SubLObject break_list_to_return) {
        if (break_list == UNPROVIDED) {
            break_list = $whitespace_chars$.getGlobalValue();
        }
        if (embed_list == UNPROVIDED) {
            embed_list = NIL;
        }
        if (include_stopsP == UNPROVIDED) {
            include_stopsP = NIL;
        }
        if (ignore_empty_stringsP == UNPROVIDED) {
            ignore_empty_stringsP = NIL;
        }
        if (quote_chars == UNPROVIDED) {
            quote_chars = NIL;
        }
        if (break_list_to_return == UNPROVIDED) {
            break_list_to_return = NIL;
        }
        return string_tokenize_int(in_string, break_list, break_list_to_return, embed_list, include_stopsP, ignore_empty_stringsP, quote_chars);
    }

    public static SubLObject string_tokenize_int(final SubLObject in_string, SubLObject break_list, SubLObject break_list_to_return, SubLObject embed_list, SubLObject include_stopsP, SubLObject ignore_empty_stringsP, SubLObject quote_chars) {
        if (break_list == UNPROVIDED) {
            break_list = $whitespace_chars$.getGlobalValue();
        }
        if (break_list_to_return == UNPROVIDED) {
            break_list_to_return = NIL;
        }
        if (embed_list == UNPROVIDED) {
            embed_list = NIL;
        }
        if (include_stopsP == UNPROVIDED) {
            include_stopsP = NIL;
        }
        if (ignore_empty_stringsP == UNPROVIDED) {
            ignore_empty_stringsP = NIL;
        }
        if (quote_chars == UNPROVIDED) {
            quote_chars = NIL;
        }
        if ($DEFAULT.eql(break_list)) {
            break_list = $whitespace_chars$.getGlobalValue();
        }
        SubLObject out_string_list = NIL;
        SubLObject cur_string = $empty_string$.getGlobalValue();
        SubLObject cur_char_list = NIL;
        SubLObject break_satisfiedP = NIL;
        SubLObject this_quotedP = NIL;
        final SubLObject complete_break_list = cconcatenate(break_list_to_return, break_list);
        SubLObject end_var_$38;
        SubLObject end_var;
        SubLObject pos_now;
        SubLObject this_character;
        SubLObject cdolist_list_var;
        SubLObject this_embed;
        SubLObject this_embed_start;
        SubLObject this_embed_end;
        SubLObject pos_find;
        SubLObject quotedP;
        SubLObject doneP;
        SubLObject found_a_breakP;
        SubLObject csome_list_var;
        SubLObject this_break;
        SubLObject this_break_length;
        SubLObject post_break_pos;
        for (end_var = end_var_$38 = length(in_string), pos_now = NIL, pos_now = ZERO_INTEGER; !pos_now.numGE(end_var_$38); pos_now = number_utilities.f_1X(pos_now)) {
            this_character = Strings.sublisp_char(in_string, pos_now);
            if (NIL != this_quotedP) {
                this_quotedP = NIL;
                cur_char_list = cons(this_character, cur_char_list);
            } else
                if (NIL != member(this_character, quote_chars, UNPROVIDED, UNPROVIDED)) {
                    this_quotedP = T;
                    cur_char_list = cons(this_character, cur_char_list);
                } else {
                    cdolist_list_var = embed_list;
                    this_embed = NIL;
                    this_embed = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        this_embed_start = first_char(this_embed.first());
                        this_embed_end = last_char(second(this_embed));
                        if (this_character.eql(this_embed_start)) {
                            pos_find = NIL;
                            quotedP = NIL;
                            doneP = NIL;
                            pos_find = number_utilities.f_1X(pos_now);
                            quotedP = NIL;
                            // , quotedP = quotedP, doneP = doneP
                            for (doneP = NIL; (NIL == doneP) && (NIL == list_utilities.lengthE(in_string, pos_find, UNPROVIDED)); pos_find = number_utilities.f_1X(pos_find)) {
                                cur_char_list = cons(this_character, cur_char_list);
                                pos_now = pos_find;
                                this_character = Strings.sublisp_char(in_string, pos_now);
                                if (NIL != quotedP) {
                                    quotedP = NIL;
                                } else
                                    if (this_character.eql(this_embed_end)) {
                                        doneP = T;
                                    } else
                                        if (NIL != member(this_character, quote_chars, UNPROVIDED, UNPROVIDED)) {
                                            quotedP = T;
                                        }


                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        this_embed = cdolist_list_var.first();
                    } 
                    found_a_breakP = NIL;
                    if (NIL == found_a_breakP) {
                        csome_list_var = complete_break_list;
                        this_break = NIL;
                        this_break = csome_list_var.first();
                        while ((NIL == found_a_breakP) && (NIL != csome_list_var)) {
                            this_break_length = string_tokenize_break_length(this_break);
                            post_break_pos = add(pos_now, this_break_length);
                            if ((this_break_length.isPositive() && (NIL != list_utilities.lengthGE(in_string, post_break_pos, UNPROVIDED))) && (NIL != string_tokenize_break_matchP(in_string, this_break, pos_now))) {
                                found_a_breakP = T;
                                cur_string = char_list_to_string(nreverse(cur_char_list));
                                if ((NIL == ignore_empty_stringsP) || (NIL == empty_string_p(cur_string))) {
                                    out_string_list = cons(cur_string, out_string_list);
                                }
                                cur_char_list = NIL;
                                if ((NIL != include_stopsP) || (NIL != member(this_break, break_list_to_return, UNPROVIDED, UNPROVIDED))) {
                                    out_string_list = cons(format_nil.format_nil_a(this_break), out_string_list);
                                }
                                pos_now = number_utilities.f_1_(post_break_pos);
                                this_character = Strings.sublisp_char(in_string, pos_now);
                                break_satisfiedP = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            this_break = csome_list_var.first();
                        } 
                    }
                    if (NIL != break_satisfiedP) {
                        break_satisfiedP = NIL;
                    } else {
                        cur_char_list = cons(this_character, cur_char_list);
                    }
                }

        }
        cur_string = char_list_to_string(nreverse(cur_char_list));
        if ((NIL == ignore_empty_stringsP) || (NIL == empty_string_p(cur_string))) {
            out_string_list = cons(cur_string, out_string_list);
        }
        if ((NIL == out_string_list) && (NIL == ignore_empty_stringsP)) {
            out_string_list = list($empty_string$.getGlobalValue());
        }
        return nreverse(out_string_list);
    }

    public static SubLObject string_tokenize_break_length(final SubLObject v_break) {
        if (v_break.isChar()) {
            return ONE_INTEGER;
        }
        return length(v_break);
    }

    public static SubLObject string_tokenize_break_matchP(final SubLObject in_string, final SubLObject v_break, final SubLObject pos) {
        if (v_break.isChar()) {
            return charE(Strings.sublisp_char(in_string, pos), v_break);
        }
        return substring_matchP(in_string, v_break, pos, $sym112$CHAR_);
    }

    public static SubLObject listify_string(final SubLObject string, SubLObject break_chars) {
        if (break_chars == UNPROVIDED) {
            break_chars = $whitespace_chars$.getGlobalValue();
        }
        SubLObject next_char_quotedP = NIL;
        SubLObject inside_stringP = NIL;
        SubLObject had_negative_parensP = NIL;
        SubLObject paren_depth = ZERO_INTEGER;
        SubLObject char_list = NIL;
        SubLObject error_list = NIL;
        SubLObject out_list = NIL;
        SubLObject end_var_$39;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject this_char;
        for (end_var = end_var_$39 = length(string), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$39); char_num = number_utilities.f_1X(char_num)) {
            this_char = Strings.sublisp_char(string, char_num);
            if (T.equal(next_char_quotedP)) {
                char_list = cons(this_char, char_list);
                next_char_quotedP = NIL;
            } else
                if (this_char.eql(CHAR_backslash)) {
                    next_char_quotedP = T;
                } else
                    if (T.equal(inside_stringP)) {
                        char_list = cons(this_char, char_list);
                        if (this_char.eql(CHAR_quotation)) {
                            inside_stringP = NIL;
                        }
                    } else
                        if (this_char.eql(CHAR_quotation)) {
                            char_list = cons(this_char, char_list);
                            inside_stringP = T;
                        } else
                            if (this_char.eql(CHAR_lparen)) {
                                paren_depth = add(paren_depth, ONE_INTEGER);
                                if (NIL != char_list) {
                                    out_list = list_utilities.push_on_car(out_list, char_list_to_string(nreverse(char_list)));
                                    char_list = NIL;
                                }
                                out_list = cons(NIL, out_list);
                            } else
                                if (this_char.eql(CHAR_rparen)) {
                                    paren_depth = subtract(paren_depth, ONE_INTEGER);
                                    if (ZERO_INTEGER.numG(paren_depth)) {
                                        had_negative_parensP = T;
                                    }
                                    if (NIL != char_list) {
                                        out_list = list_utilities.push_on_car(out_list, char_list_to_string(nreverse(char_list)));
                                        char_list = NIL;
                                    }
                                    out_list = list_utilities.pop_and_reverse_car_and_push_on_cadr(out_list);
                                } else
                                    if (NIL != subl_promotions.memberP(this_char, break_chars, UNPROVIDED, UNPROVIDED)) {
                                        if (NIL != char_list) {
                                            out_list = list_utilities.push_on_car(out_list, char_list_to_string(nreverse(char_list)));
                                            char_list = NIL;
                                        }
                                    } else {
                                        char_list = cons(this_char, char_list);
                                    }






        }
        if (NIL != char_list) {
            out_list = list_utilities.push_on_car(out_list, char_list_to_string(nreverse(char_list)));
            char_list = NIL;
        }
        if (ZERO_INTEGER.numL(paren_depth)) {
            error_list = cons($$$Unmatched_open_parenthesis, error_list);
        } else
            if ((NIL != had_negative_parensP) || ZERO_INTEGER.numG(paren_depth)) {
                error_list = cons($$$Unmatched_close_parenthesis, error_list);
            }

        if (NIL != error_list) {
            return values(NIL, error_list);
        }
        return values(nreverse(out_list.first()), NIL);
    }

    public static SubLObject all_parens_matchedP(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLObject some_unmatched_parenthesesP = NIL;
        SubLObject paren_depth = ZERO_INTEGER;
        SubLObject within_stringP = NIL;
        SubLObject just_saw_an_escape_charP = NIL;
        final SubLObject end_var = (NIL != end) ? end : length(string);
        if (NIL == some_unmatched_parenthesesP) {
            SubLObject end_var_$40;
            SubLObject char_num;
            SubLObject pcase_var;
            SubLObject v_char;
            for (end_var_$40 = end_var, char_num = NIL, char_num = start; (NIL == some_unmatched_parenthesesP) && (!char_num.numGE(end_var_$40)); char_num = number_utilities.f_1X(char_num)) {
                v_char = pcase_var = Strings.sublisp_char(string, char_num);
                if (pcase_var.eql(CHAR_lparen)) {
                    if (NIL == within_stringP) {
                        paren_depth = add(paren_depth, ONE_INTEGER);
                    }
                    just_saw_an_escape_charP = NIL;
                } else
                    if (pcase_var.eql(CHAR_rparen)) {
                        if (NIL == within_stringP) {
                            if (paren_depth.isPositive()) {
                                paren_depth = subtract(paren_depth, ONE_INTEGER);
                            } else {
                                some_unmatched_parenthesesP = T;
                            }
                        }
                        just_saw_an_escape_charP = NIL;
                    } else
                        if (pcase_var.eql(CHAR_quotation)) {
                            if (NIL == just_saw_an_escape_charP) {
                                within_stringP = makeBoolean(NIL == within_stringP);
                            }
                            just_saw_an_escape_charP = NIL;
                        } else
                            if (pcase_var.eql(CHAR_backslash)) {
                                if (NIL != just_saw_an_escape_charP) {
                                    just_saw_an_escape_charP = NIL;
                                } else {
                                    just_saw_an_escape_charP = T;
                                }
                            } else {
                                just_saw_an_escape_charP = NIL;
                            }



            }
        }
        if (!paren_depth.isZero()) {
            some_unmatched_parenthesesP = T;
        }
        return makeBoolean(NIL == some_unmatched_parenthesesP);
    }

    public static SubLObject unmatched_parentheses(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLObject unmatched_parentheses = NIL;
        final SubLObject paren_stack = stacks.create_stack();
        SubLObject within_stringP = NIL;
        SubLObject just_saw_an_escape_charP = NIL;
        SubLObject end_var_$41;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject pcase_var;
        SubLObject v_char;
        for (end_var = end_var_$41 = (NIL != end) ? end : length(string), char_num = NIL, char_num = start; !char_num.numGE(end_var_$41); char_num = number_utilities.f_1X(char_num)) {
            v_char = pcase_var = Strings.sublisp_char(string, char_num);
            if (pcase_var.eql(CHAR_lparen)) {
                if (NIL == within_stringP) {
                    stacks.stack_push(char_num, paren_stack);
                }
                just_saw_an_escape_charP = NIL;
            } else
                if (pcase_var.eql(CHAR_rparen)) {
                    if (NIL == within_stringP) {
                        if (NIL == stacks.stack_empty_p(paren_stack)) {
                            stacks.stack_pop(paren_stack);
                        } else {
                            unmatched_parentheses = cons(char_num, unmatched_parentheses);
                        }
                    }
                    just_saw_an_escape_charP = NIL;
                } else
                    if (pcase_var.eql(CHAR_quotation)) {
                        if (NIL == just_saw_an_escape_charP) {
                            within_stringP = makeBoolean(NIL == within_stringP);
                        }
                        just_saw_an_escape_charP = NIL;
                    } else
                        if (pcase_var.eql(CHAR_backslash)) {
                            if (NIL != just_saw_an_escape_charP) {
                                just_saw_an_escape_charP = NIL;
                            } else {
                                just_saw_an_escape_charP = T;
                            }
                        } else {
                            just_saw_an_escape_charP = NIL;
                        }



        }
        while (NIL == stacks.stack_empty_p(paren_stack)) {
            unmatched_parentheses = cons(stacks.stack_pop(paren_stack), unmatched_parentheses);
        } 
        return nreverse(unmatched_parentheses);
    }

    public static SubLObject unmatched_parentheses_terse_hint(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        final SubLObject positions = unmatched_parentheses(string, start, end);
        final SubLObject hint = Strings.make_string(length(positions), UNPROVIDED);
        SubLObject list_var = NIL;
        SubLObject position = NIL;
        SubLObject index = NIL;
        list_var = positions;
        position = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , position = list_var.first() , index = add(ONE_INTEGER, index)) {
            Strings.set_char(hint, index, Strings.sublisp_char(string, position));
        }
        return hint;
    }

    public static SubLObject byte_string_p(final SubLObject v_object) {
        if (v_object.isString()) {
            final SubLObject number = string_to_integer(v_object);
            return makeBoolean(number.numGE(ZERO_INTEGER) && number.numLE($int$255));
        }
        return NIL;
    }

    public static SubLObject ip_address_p(final SubLObject v_object) {
        if (!v_object.isString()) {
            return NIL;
        }
        final SubLObject byte_strings = string_tokenize(v_object, $list116, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == list_utilities.lengthE(byte_strings, FOUR_INTEGER, UNPROVIDED)) {
            return NIL;
        }
        SubLObject cdolist_list_var = byte_strings;
        SubLObject byte_string = NIL;
        byte_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == byte_string_p(byte_string)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            byte_string = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject ip_addressL(final SubLObject ip_address1, final SubLObject ip_address2) {
        final SubLObject ip_address1_strings = string_tokenize(ip_address1, $list116, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject ip_address2_strings = string_tokenize(ip_address2, $list116, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == list_utilities.lengthE(ip_address1_strings, FOUR_INTEGER, UNPROVIDED)) {
            return NIL;
        }
        if (NIL == list_utilities.lengthE(ip_address2_strings, FOUR_INTEGER, UNPROVIDED)) {
            return T;
        }
        SubLObject ip_address1_byte_string = NIL;
        SubLObject ip_address1_byte_string_$42 = NIL;
        SubLObject ip_address2_byte_string = NIL;
        SubLObject ip_address2_byte_string_$43 = NIL;
        ip_address1_byte_string = ip_address1_strings;
        ip_address1_byte_string_$42 = ip_address1_byte_string.first();
        ip_address2_byte_string = ip_address2_strings;
        ip_address2_byte_string_$43 = ip_address2_byte_string.first();
        while ((NIL != ip_address2_byte_string) || (NIL != ip_address1_byte_string)) {
            if (NIL != integer_stringL(ip_address1_byte_string_$42, ip_address2_byte_string_$43)) {
                return T;
            }
            if (!ip_address1_byte_string_$42.equal(ip_address2_byte_string_$43)) {
                return NIL;
            }
            ip_address1_byte_string = ip_address1_byte_string.rest();
            ip_address1_byte_string_$42 = ip_address1_byte_string.first();
            ip_address2_byte_string = ip_address2_byte_string.rest();
            ip_address2_byte_string_$43 = ip_address2_byte_string.first();
        } 
        return NIL;
    }

    public static SubLObject get_trigraph_metric() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $trigraph_metric$.getDynamicValue(thread);
    }

    public static SubLObject set_trigraph_metric(SubLObject n) {
        if (n == UNPROVIDED) {
            n = $float$0_8;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        $trigraph_metric$.setDynamicValue((n.isNumber() && n.numG(ZERO_INTEGER)) && n.numLE(ONE_INTEGER) ? n : $float$0_8, thread);
        return $trigraph_metric$.getDynamicValue(thread);
    }

    public static SubLObject get_trigraph_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL == ans) {
            SubLObject csome_list_var = $trigraph_tables$.getDynamicValue(thread);
            SubLObject table = NIL;
            table = csome_list_var.first();
            while ((NIL == ans) && (NIL != csome_list_var)) {
                if (NIL != gethash($FREE, table, UNPROVIDED)) {
                    sethash($FREE, table, NIL);
                    ans = table;
                }
                csome_list_var = csome_list_var.rest();
                table = csome_list_var.first();
            } 
        }
        if (NIL == ans) {
            final SubLObject v_new = make_hash_table($int$50, UNPROVIDED, UNPROVIDED);
            $trigraph_tables$.setDynamicValue(cons(v_new, $trigraph_tables$.getDynamicValue(thread)), thread);
            ans = v_new;
        }
        return ans;
    }

    public static SubLObject free_trigraph_table(final SubLObject table) {
        if (table.isHashtable()) {
            clrhash(table);
            sethash($FREE, table, T);
            return table;
        }
        return NIL;
    }

    public static SubLObject plural_length_to_subtract(final SubLObject string) {
        final SubLObject len = length(string);
        if (len.numLE(TWO_INTEGER)) {
            return ZERO_INTEGER;
        }
        if (subseq(string, subtract(len, TWO_INTEGER), len).equalp($$$es)) {
            return TWO_INTEGER;
        }
        if (subseq(string, subtract(len, ONE_INTEGER), len).equalp($$$s)) {
            return ONE_INTEGER;
        }
        return ZERO_INTEGER;
    }

    public static SubLObject update_string1_table(final SubLObject trigraph_code, final SubLObject table) {
        SubLObject val = gethash(trigraph_code, table, UNPROVIDED);
        if (val.isInteger()) {
            val = add(val, ONE_INTEGER);
        } else {
            val = ONE_INTEGER;
        }
        sethash(trigraph_code, table, val);
        return trigraph_code;
    }

    public static SubLObject make_trigraph_integer_code(final SubLObject code0, final SubLObject code1, final SubLObject code2) {
        return add(code0, multiply($int$1000, code1), multiply($int$1000000, code2));
    }

    public static SubLObject string_trigraph_match_p(final SubLObject string1, final SubLObject string2, SubLObject case_sensitiveP, SubLObject metric) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (metric == UNPROVIDED) {
            metric = get_trigraph_metric();
        }
        if ((!string1.isString()) || (!string2.isString())) {
            return NIL;
        }
        if (!metric.isNumber()) {
            set_trigraph_metric(UNPROVIDED);
        }
        final SubLObject table = get_trigraph_table();
        final SubLObject l1 = subtract(length(string1), plural_length_to_subtract(string1));
        final SubLObject l2 = subtract(length(string2), plural_length_to_subtract(string2));
        SubLObject s1_count = ZERO_INTEGER;
        SubLObject s2_count = ZERO_INTEGER;
        SubLObject intersection_count = ZERO_INTEGER;
        SubLObject ch_count = ZERO_INTEGER;
        SubLObject code0 = ZERO_INTEGER;
        SubLObject code2 = ZERO_INTEGER;
        SubLObject code3 = ZERO_INTEGER;
        SubLObject i;
        SubLObject ch;
        SubLObject pcase_var;
        for (i = NIL, i = ZERO_INTEGER; i.numL(l1); i = add(i, ONE_INTEGER)) {
            ch = (NIL != case_sensitiveP) ? Strings.sublisp_char(string1, i) : char_downcase(Strings.sublisp_char(string1, i));
            if (NIL != alphanumericp(ch)) {
                pcase_var = ch_count;
                if (pcase_var.eql(ZERO_INTEGER)) {
                    code0 = char_code(ch);
                    ch_count = add(ch_count, ONE_INTEGER);
                } else
                    if (pcase_var.eql(ONE_INTEGER)) {
                        code2 = char_code(ch);
                        ch_count = add(ch_count, ONE_INTEGER);
                    } else
                        if (pcase_var.eql(TWO_INTEGER)) {
                            code3 = char_code(ch);
                            update_string1_table(make_trigraph_integer_code(code0, code2, code3), table);
                            s1_count = add(s1_count, ONE_INTEGER);
                            ch_count = add(ch_count, ONE_INTEGER);
                        } else {
                            code0 = code2;
                            code2 = code3;
                            code3 = char_code(ch);
                            update_string1_table(make_trigraph_integer_code(code0, code2, code3), table);
                            s1_count = add(s1_count, ONE_INTEGER);
                            ch_count = add(ch_count, ONE_INTEGER);
                        }


            }
        }
        if (ch_count.numGE(ZERO_INTEGER) && ch_count.numL(THREE_INTEGER)) {
            update_string1_table(make_trigraph_integer_code(code0, code2, code3), table);
            s1_count = add(s1_count, ONE_INTEGER);
        }
        ch_count = ZERO_INTEGER;
        code0 = ZERO_INTEGER;
        code2 = ZERO_INTEGER;
        code3 = ZERO_INTEGER;
        SubLObject trigraph_code;
        SubLObject val;
        for (i = NIL, i = ZERO_INTEGER; i.numL(l2); i = add(i, ONE_INTEGER)) {
            ch = (NIL != case_sensitiveP) ? Strings.sublisp_char(string2, i) : char_downcase(Strings.sublisp_char(string2, i));
            if (NIL != alphanumericp(ch)) {
                pcase_var = ch_count;
                if (pcase_var.eql(ZERO_INTEGER)) {
                    code0 = char_code(ch);
                    ch_count = add(ch_count, ONE_INTEGER);
                } else
                    if (pcase_var.eql(ONE_INTEGER)) {
                        code2 = char_code(ch);
                        ch_count = add(ch_count, ONE_INTEGER);
                    } else
                        if (pcase_var.eql(TWO_INTEGER)) {
                            code3 = char_code(ch);
                            trigraph_code = make_trigraph_integer_code(code0, code2, code3);
                            val = gethash(trigraph_code, table, UNPROVIDED);
                            if (val.isInteger() && val.numG(ZERO_INTEGER)) {
                                intersection_count = add(intersection_count, ONE_INTEGER);
                                sethash(trigraph_code, table, subtract(val, ONE_INTEGER));
                            }
                            s2_count = add(s2_count, ONE_INTEGER);
                            ch_count = add(ch_count, ONE_INTEGER);
                        } else {
                            code0 = code2;
                            code2 = code3;
                            code3 = char_code(ch);
                            trigraph_code = make_trigraph_integer_code(code0, code2, code3);
                            val = gethash(trigraph_code, table, UNPROVIDED);
                            if (val.isInteger() && val.numG(ZERO_INTEGER)) {
                                intersection_count = add(intersection_count, ONE_INTEGER);
                                sethash(trigraph_code, table, subtract(val, ONE_INTEGER));
                            }
                            s2_count = add(s2_count, ONE_INTEGER);
                            ch_count = add(ch_count, ONE_INTEGER);
                        }


            }
        }
        if (ch_count.numGE(ZERO_INTEGER) && ch_count.numL(THREE_INTEGER)) {
            final SubLObject trigraph_code2 = make_trigraph_integer_code(code0, code2, code3);
            final SubLObject val2 = gethash(trigraph_code2, table, UNPROVIDED);
            if (val2.isInteger() && val2.numG(ZERO_INTEGER)) {
                intersection_count = add(intersection_count, ONE_INTEGER);
                sethash(trigraph_code2, table, subtract(val2, ONE_INTEGER));
            }
            s2_count = add(s2_count, ONE_INTEGER);
        }
        free_trigraph_table(table);
        return makeBoolean(((s1_count.numG(ZERO_INTEGER) && s2_count.numG(ZERO_INTEGER)) && divide(intersection_count, s1_count).numGE(metric)) && divide(intersection_count, s2_count).numGE(metric));
    }

    public static SubLObject stringify_terms(final SubLObject terms, SubLObject separator, SubLObject last_separator) {
        if (separator == UNPROVIDED) {
            separator = $$$_;
        }
        if (last_separator == UNPROVIDED) {
            last_separator = separator;
        }
        return stringify_items(terms, symbol_function(FORT_PRINT_NAME), separator, last_separator);
    }

    public static SubLObject fort_print_name(final SubLObject fort) {
        if (NIL != nart_handles.nart_p(fort)) {
            return str(narts_high.nart_hl_formula(fort));
        }
        if (NIL != constant_p(fort)) {
            return constants_high.constant_name(fort);
        }
        return str(fort);
    }

    public static SubLObject stringify_items(final SubLObject items, SubLObject accessor, SubLObject separator, SubLObject last_separator) {
        if (accessor == UNPROVIDED) {
            accessor = symbol_function(STR_BY_TYPE);
        }
        if (separator == UNPROVIDED) {
            separator = $$$_;
        }
        if (last_separator == UNPROVIDED) {
            last_separator = separator;
        }
        if (NIL == items) {
            return $empty_string$.getGlobalValue();
        }
        if (NIL != list_utilities.singletonP(items)) {
            return str_by_type(funcall(accessor, items.first()));
        }
        final SubLObject names = Mapping.mapcar(symbol_function(STR_BY_TYPE), Mapping.mapcar(accessor, reverse(items)));
        SubLObject result = cconcatenate(second(names), new SubLObject[]{ last_separator, names.first() });
        SubLObject cdolist_list_var = cddr(names);
        SubLObject name = NIL;
        name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cconcatenate(name, new SubLObject[]{ separator, result });
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        } 
        return format(NIL, result);
    }

    public static SubLObject str_by_type(final SubLObject v_object) {
        if (v_object.isString()) {
            return v_object;
        }
        if (NIL != constant_p(v_object)) {
            return constants_high.constant_name(v_object);
        }
        return str(v_object);
    }

    public static SubLObject add_line(final SubLObject line, final SubLObject text, SubLObject nl_margin, SubLObject new_line) {
        if (nl_margin == UNPROVIDED) {
            nl_margin = $empty_string$.getGlobalValue();
        }
        if (new_line == UNPROVIDED) {
            new_line = $str125$__;
        }
        if (NIL != empty_string_p(text)) {
            return line;
        }
        return cconcatenate(text, new SubLObject[]{ new_line, nl_margin, line });
    }

    public static SubLObject cyclify_status_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cyclify_status_p(final SubLObject v_object) {
        return v_object.getClass() == $cyclify_status_native.class ? T : NIL;
    }

    public static SubLObject cyclify_status_out_string_list(final SubLObject v_object) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject cyclify_status_references_added(final SubLObject v_object) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject cyclify_status_inside_quoteP(final SubLObject v_object) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject cyclify_status_inside_el_var_nameP(final SubLObject v_object) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject cyclify_status_already_cyclifiedP(final SubLObject v_object) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject cyclify_status_escapeP(final SubLObject v_object) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject cyclify_status_inside_subl_quote_fnP(final SubLObject v_object) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject cyclify_status_inside_expand_subl_fnP(final SubLObject v_object) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject cyclify_status_inside_expand_subl_fn_arg1P(final SubLObject v_object) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject cyclify_status_inside_expand_subl_fn_arg2P(final SubLObject v_object) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject cyclify_status_immediately_following_parenP(final SubLObject v_object) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.getField12();
    }

    public static SubLObject cyclify_status_paren_count(final SubLObject v_object) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.getField13();
    }

    public static SubLObject _csetf_cyclify_status_out_string_list(final SubLObject v_object, final SubLObject value) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_cyclify_status_references_added(final SubLObject v_object, final SubLObject value) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_cyclify_status_inside_quoteP(final SubLObject v_object, final SubLObject value) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_cyclify_status_inside_el_var_nameP(final SubLObject v_object, final SubLObject value) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_cyclify_status_already_cyclifiedP(final SubLObject v_object, final SubLObject value) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_cyclify_status_escapeP(final SubLObject v_object, final SubLObject value) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_cyclify_status_inside_subl_quote_fnP(final SubLObject v_object, final SubLObject value) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_cyclify_status_inside_expand_subl_fnP(final SubLObject v_object, final SubLObject value) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_cyclify_status_inside_expand_subl_fn_arg1P(final SubLObject v_object, final SubLObject value) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_cyclify_status_inside_expand_subl_fn_arg2P(final SubLObject v_object, final SubLObject value) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_cyclify_status_immediately_following_parenP(final SubLObject v_object, final SubLObject value) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_cyclify_status_paren_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != cyclify_status_p(v_object) : "string_utilities.cyclify_status_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject make_cyclify_status(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $cyclify_status_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($OUT_STRING_LIST)) {
                _csetf_cyclify_status_out_string_list(v_new, current_value);
            } else
                if (pcase_var.eql($REFERENCES_ADDED)) {
                    _csetf_cyclify_status_references_added(v_new, current_value);
                } else
                    if (pcase_var.eql($kw164$INSIDE_QUOTE_)) {
                        _csetf_cyclify_status_inside_quoteP(v_new, current_value);
                    } else
                        if (pcase_var.eql($kw165$INSIDE_EL_VAR_NAME_)) {
                            _csetf_cyclify_status_inside_el_var_nameP(v_new, current_value);
                        } else
                            if (pcase_var.eql($kw166$ALREADY_CYCLIFIED_)) {
                                _csetf_cyclify_status_already_cyclifiedP(v_new, current_value);
                            } else
                                if (pcase_var.eql($ESCAPE_)) {
                                    _csetf_cyclify_status_escapeP(v_new, current_value);
                                } else
                                    if (pcase_var.eql($kw168$INSIDE_SUBL_QUOTE_FN_)) {
                                        _csetf_cyclify_status_inside_subl_quote_fnP(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($kw169$INSIDE_EXPAND_SUBL_FN_)) {
                                            _csetf_cyclify_status_inside_expand_subl_fnP(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($kw170$INSIDE_EXPAND_SUBL_FN_ARG1_)) {
                                                _csetf_cyclify_status_inside_expand_subl_fn_arg1P(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($kw171$INSIDE_EXPAND_SUBL_FN_ARG2_)) {
                                                    _csetf_cyclify_status_inside_expand_subl_fn_arg2P(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($kw172$IMMEDIATELY_FOLLOWING_PAREN_)) {
                                                        _csetf_cyclify_status_immediately_following_parenP(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($PAREN_COUNT)) {
                                                            _csetf_cyclify_status_paren_count(v_new, current_value);
                                                        } else {
                                                            Errors.error($str174$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_cyclify_status(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CYCLIFY_STATUS, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $OUT_STRING_LIST, cyclify_status_out_string_list(obj));
        funcall(visitor_fn, obj, $SLOT, $REFERENCES_ADDED, cyclify_status_references_added(obj));
        funcall(visitor_fn, obj, $SLOT, $kw164$INSIDE_QUOTE_, cyclify_status_inside_quoteP(obj));
        funcall(visitor_fn, obj, $SLOT, $kw165$INSIDE_EL_VAR_NAME_, cyclify_status_inside_el_var_nameP(obj));
        funcall(visitor_fn, obj, $SLOT, $kw166$ALREADY_CYCLIFIED_, cyclify_status_already_cyclifiedP(obj));
        funcall(visitor_fn, obj, $SLOT, $ESCAPE_, cyclify_status_escapeP(obj));
        funcall(visitor_fn, obj, $SLOT, $kw168$INSIDE_SUBL_QUOTE_FN_, cyclify_status_inside_subl_quote_fnP(obj));
        funcall(visitor_fn, obj, $SLOT, $kw169$INSIDE_EXPAND_SUBL_FN_, cyclify_status_inside_expand_subl_fnP(obj));
        funcall(visitor_fn, obj, $SLOT, $kw170$INSIDE_EXPAND_SUBL_FN_ARG1_, cyclify_status_inside_expand_subl_fn_arg1P(obj));
        funcall(visitor_fn, obj, $SLOT, $kw171$INSIDE_EXPAND_SUBL_FN_ARG2_, cyclify_status_inside_expand_subl_fn_arg2P(obj));
        funcall(visitor_fn, obj, $SLOT, $kw172$IMMEDIATELY_FOLLOWING_PAREN_, cyclify_status_immediately_following_parenP(obj));
        funcall(visitor_fn, obj, $SLOT, $PAREN_COUNT, cyclify_status_paren_count(obj));
        funcall(visitor_fn, obj, $END, MAKE_CYCLIFY_STATUS, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_cyclify_status_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cyclify_status(obj, visitor_fn);
    }

    public static SubLObject cyclify_string_initialize_cyclify_status() {
        final SubLObject cyclify_status = make_cyclify_status(UNPROVIDED);
        _csetf_cyclify_status_out_string_list(cyclify_status, NIL);
        _csetf_cyclify_status_references_added(cyclify_status, NIL);
        _csetf_cyclify_status_inside_quoteP(cyclify_status, NIL);
        _csetf_cyclify_status_inside_el_var_nameP(cyclify_status, NIL);
        _csetf_cyclify_status_already_cyclifiedP(cyclify_status, NIL);
        _csetf_cyclify_status_escapeP(cyclify_status, NIL);
        _csetf_cyclify_status_inside_subl_quote_fnP(cyclify_status, NIL);
        _csetf_cyclify_status_inside_expand_subl_fnP(cyclify_status, NIL);
        _csetf_cyclify_status_inside_expand_subl_fn_arg1P(cyclify_status, NIL);
        _csetf_cyclify_status_inside_expand_subl_fn_arg2P(cyclify_status, NIL);
        _csetf_cyclify_status_immediately_following_parenP(cyclify_status, NIL);
        _csetf_cyclify_status_paren_count(cyclify_status, ZERO_INTEGER);
        return cyclify_status;
    }

    public static SubLObject cyclify_string_possibly_cyclify_string(SubLObject cur_string, final SubLObject cyclify_status) {
        if ((((((NIL == cyclify_status_inside_quoteP(cyclify_status)) && (NIL == cyclify_status_inside_el_var_nameP(cyclify_status))) && (NIL == cyclify_status_already_cyclifiedP(cyclify_status))) && (NIL == cyclify_status_inside_expand_subl_fn_arg2P(cyclify_status))) && (NIL == cyclify_status_inside_subl_quote_fnP(cyclify_status))) && (NIL != constant_completion_high.constant_complete_exact(cur_string, UNPROVIDED, UNPROVIDED))) {
            final SubLObject item_var = constants_high.find_constant(cur_string);
            if (NIL == member(item_var, cyclify_status_references_added(cyclify_status), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_cyclify_status_references_added(cyclify_status, cons(item_var, cyclify_status_references_added(cyclify_status)));
            }
            cur_string = string_add_constant_reader_prefix(cur_string);
        }
        return values(cur_string, cyclify_status);
    }

    public static SubLObject cyclify_string_not_inside_quote_and_not_escapedP(final SubLObject cyclify_status) {
        return makeBoolean((NIL == cyclify_status_inside_quoteP(cyclify_status)) && (NIL == cyclify_status_escapeP(cyclify_status)));
    }

    public static SubLObject cyclify_string_found_quoteP(final SubLObject this_character, final SubLObject cyclify_status) {
        return makeBoolean((NIL != charE(this_character, CHAR_quotation)) && (NIL == cyclify_status_escapeP(cyclify_status)));
    }

    public static SubLObject cyclify_string_found_open_parenP(final SubLObject this_character, final SubLObject cyclify_status) {
        return makeBoolean((NIL != cyclify_string_not_inside_quote_and_not_escapedP(cyclify_status)) && (NIL != charE(this_character, CHAR_lparen)));
    }

    public static SubLObject cyclify_string_found_close_parenP(final SubLObject this_character, final SubLObject cyclify_status) {
        return makeBoolean((NIL != cyclify_string_not_inside_quote_and_not_escapedP(cyclify_status)) && (NIL != charE(this_character, CHAR_rparen)));
    }

    public static SubLObject cyclify_string_add_to_out_string_list(final SubLObject string, final SubLObject cyclify_status) {
        _csetf_cyclify_status_out_string_list(cyclify_status, cons(string, cyclify_status_out_string_list(cyclify_status)));
        return cyclify_status;
    }

    public static SubLObject cyclify_string_check_for_escape_to_subl(final SubLObject cur_string, final SubLObject cyclify_status) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((((NIL != cyclify_status_immediately_following_parenP(cyclify_status)) && (NIL == cyclify_status_inside_quoteP(cyclify_status))) && (NIL == cyclify_status_inside_subl_quote_fnP(cyclify_status))) && (NIL == cyclify_status_inside_expand_subl_fn_arg2P(cyclify_status))) {
            if (NIL != subl_promotions.memberP(cur_string, $cyclify_string_subl_quote_fn_strings$.getDynamicValue(thread), EQUAL, UNPROVIDED)) {
                _csetf_cyclify_status_inside_subl_quote_fnP(cyclify_status, T);
                _csetf_cyclify_status_paren_count(cyclify_status, ONE_INTEGER);
            }
            if (NIL != subl_promotions.memberP(cur_string, $cyclify_string_expand_subl_fn_strings$.getDynamicValue(thread), EQUAL, UNPROVIDED)) {
                _csetf_cyclify_status_inside_expand_subl_fnP(cyclify_status, T);
                _csetf_cyclify_status_paren_count(cyclify_status, ONE_INTEGER);
                _csetf_cyclify_status_inside_expand_subl_fn_arg1P(cyclify_status, NIL);
                _csetf_cyclify_status_inside_expand_subl_fn_arg2P(cyclify_status, NIL);
            }
        }
        return cyclify_status;
    }

    public static SubLObject cyclify_string_handle_last_valid_char(SubLObject cyclify_status, final SubLObject in_string, final SubLObject pos_prev) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cur_string = substring(in_string, pos_prev, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject cur_string_$44 = cyclify_string_possibly_cyclify_string(cur_string, cyclify_status);
        final SubLObject cyclify_status_$45 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        cur_string = cur_string_$44;
        cyclify_status = cyclify_status_$45;
        _csetf_cyclify_status_already_cyclifiedP(cyclify_status, NIL);
        cyclify_string_add_to_out_string_list(cur_string, cyclify_status);
        return cyclify_status;
    }

    public static SubLObject cyclify_string_handle_open_paren_int(final SubLObject cyclify_status) {
        _csetf_cyclify_status_paren_count(cyclify_status, add(cyclify_status_paren_count(cyclify_status), ONE_INTEGER));
        _csetf_cyclify_status_immediately_following_parenP(cyclify_status, T);
        if ((NIL != cyclify_status_inside_expand_subl_fnP(cyclify_status)) && cyclify_status_paren_count(cyclify_status).numE(TWO_INTEGER)) {
            if (NIL == cyclify_status_inside_expand_subl_fn_arg1P(cyclify_status)) {
            }
            _csetf_cyclify_status_inside_expand_subl_fn_arg1P(cyclify_status, T);
        }
        return cyclify_status;
    }

    public static SubLObject cyclify_string_handle_close_paren_int(final SubLObject cyclify_status) {
        _csetf_cyclify_status_immediately_following_parenP(cyclify_status, NIL);
        _csetf_cyclify_status_paren_count(cyclify_status, subtract(cyclify_status_paren_count(cyclify_status), ONE_INTEGER));
        if ((NIL != cyclify_status_inside_subl_quote_fnP(cyclify_status)) && cyclify_status_paren_count(cyclify_status).numE(ZERO_INTEGER)) {
            _csetf_cyclify_status_inside_subl_quote_fnP(cyclify_status, NIL);
        }
        if (NIL != cyclify_status_inside_expand_subl_fnP(cyclify_status)) {
            if (cyclify_status_paren_count(cyclify_status).numE(ZERO_INTEGER)) {
                _csetf_cyclify_status_inside_expand_subl_fnP(cyclify_status, NIL);
                _csetf_cyclify_status_inside_expand_subl_fn_arg1P(cyclify_status, NIL);
                _csetf_cyclify_status_inside_expand_subl_fn_arg2P(cyclify_status, NIL);
            } else
                if (cyclify_status_paren_count(cyclify_status).numE(ONE_INTEGER) && (NIL != cyclify_status_inside_expand_subl_fn_arg1P(cyclify_status))) {
                    _csetf_cyclify_status_inside_expand_subl_fn_arg1P(cyclify_status, NIL);
                    _csetf_cyclify_status_inside_expand_subl_fn_arg2P(cyclify_status, T);
                }

        }
        return cyclify_status;
    }

    public static SubLObject cyclify_string_handle_end_of_current_word(SubLObject cyclify_status, final SubLObject in_string, SubLObject pos_prev, final SubLObject pos_now, final SubLObject this_character) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cur_string = substring(in_string, pos_prev, pos_now);
        thread.resetMultipleValues();
        final SubLObject cur_string_$46 = cyclify_string_possibly_cyclify_string(cur_string, cyclify_status);
        final SubLObject cyclify_status_$47 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        cur_string = cur_string_$46;
        cyclify_status = cyclify_status_$47;
        cyclify_status = cyclify_string_check_for_escape_to_subl(cur_string, cyclify_status);
        if (NIL != cyclify_string_found_quoteP(this_character, cyclify_status)) {
            _csetf_cyclify_status_inside_quoteP(cyclify_status, makeBoolean(NIL == cyclify_status_inside_quoteP(cyclify_status)));
        }
        if (NIL != cyclify_string_found_open_parenP(this_character, cyclify_status)) {
            cyclify_status = cyclify_string_handle_open_paren_int(cyclify_status);
        }
        if (NIL != cyclify_string_found_close_parenP(this_character, cyclify_status)) {
            cyclify_status = cyclify_string_handle_close_paren_int(cyclify_status);
        }
        if (NIL == charE(this_character, cycl_variables.el_variable_prefix_char())) {
            _csetf_cyclify_status_inside_el_var_nameP(cyclify_status, NIL);
        }
        _csetf_cyclify_status_already_cyclifiedP(cyclify_status, NIL);
        cur_string = cconcatenate(cur_string, str(this_character));
        cyclify_string_add_to_out_string_list(cur_string, cyclify_status);
        pos_prev = number_utilities.f_1X(pos_now);
        return values(cyclify_status, pos_prev);
    }

    public static SubLObject cyclify_string(final SubLObject in_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(in_string) : "Types.stringp(in_string) " + "CommonSymbols.NIL != Types.stringp(in_string) " + in_string;
        final SubLObject end_pos = number_utilities.f_1_(length(in_string));
        SubLObject pos_prev = ZERO_INTEGER;
        SubLObject cyclify_status = cyclify_string_initialize_cyclify_status();
        SubLObject end_var_$48;
        SubLObject end_var;
        SubLObject pos_now;
        SubLObject this_character;
        SubLObject last_charP;
        SubLObject cyclify_status_$49;
        SubLObject pos_prev_$50;
        SubLObject cur_string;
        for (end_var = end_var_$48 = length(in_string), pos_now = NIL, pos_now = ZERO_INTEGER; !pos_now.numGE(end_var_$48); pos_now = number_utilities.f_1X(pos_now)) {
            this_character = Strings.sublisp_char(in_string, pos_now);
            last_charP = eql(pos_now, end_pos);
            if ((NIL != last_charP) || (NIL == constant_completion_high.valid_constant_name_char_p(this_character))) {
                if (NIL != constant_completion_high.valid_constant_name_char_p(this_character)) {
                    cyclify_status = cyclify_string_handle_last_valid_char(cyclify_status, in_string, pos_prev);
                } else
                    if (pos_now.numG(pos_prev)) {
                        thread.resetMultipleValues();
                        cyclify_status_$49 = cyclify_string_handle_end_of_current_word(cyclify_status, in_string, pos_prev, pos_now, this_character);
                        pos_prev_$50 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        cyclify_status = cyclify_status_$49;
                        pos_prev = pos_prev_$50;
                    } else
                        if (NIL != last_charP) {
                            cyclify_string_add_to_out_string_list(str(this_character), cyclify_status);
                            pos_prev = add(pos_prev, ONE_INTEGER);
                        } else
                            if ((NIL != charE(this_character, CHAR_hash)) && (NIL != charE(Strings.sublisp_char(in_string, number_utilities.f_1X(pos_now)), constant_reader.constant_reader_macro_char()))) {
                                _csetf_cyclify_status_already_cyclifiedP(cyclify_status, T);
                                cyclify_string_add_to_out_string_list(str(this_character), cyclify_status);
                                pos_prev = add(pos_prev, ONE_INTEGER);
                            } else
                                if (NIL != cyclify_string_found_quoteP(this_character, cyclify_status)) {
                                    if (NIL != cyclify_status_inside_quoteP(cyclify_status)) {
                                        cur_string = substring(in_string, pos_prev, pos_now);
                                        _csetf_cyclify_status_inside_quoteP(cyclify_status, NIL);
                                        cyclify_string_add_to_out_string_list(cur_string, cyclify_status);
                                        pos_prev = pos_now;
                                    } else {
                                        _csetf_cyclify_status_inside_quoteP(cyclify_status, T);
                                    }
                                } else
                                    if (NIL != cyclify_string_found_open_parenP(this_character, cyclify_status)) {
                                        cyclify_status = cyclify_string_handle_open_paren_int(cyclify_status);
                                        cyclify_string_add_to_out_string_list(str(this_character), cyclify_status);
                                        pos_prev = add(pos_prev, ONE_INTEGER);
                                    } else
                                        if (NIL != cyclify_string_found_close_parenP(this_character, cyclify_status)) {
                                            cyclify_status = cyclify_string_handle_close_paren_int(cyclify_status);
                                            cyclify_string_add_to_out_string_list(str(this_character), cyclify_status);
                                            pos_prev = add(pos_prev, ONE_INTEGER);
                                        } else
                                            if (NIL != charE(this_character, cycl_variables.el_variable_prefix_char())) {
                                                _csetf_cyclify_status_inside_el_var_nameP(cyclify_status, T);
                                            } else {
                                                cyclify_string_add_to_out_string_list(str(this_character), cyclify_status);
                                                pos_prev = add(pos_prev, ONE_INTEGER);
                                            }







                _csetf_cyclify_status_escapeP(cyclify_status, makeBoolean((NIL != subl_promotions.memberP(this_character, $cyclify_string_quote_chars$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) && (NIL == cyclify_status_escapeP(cyclify_status))));
            }
        }
        return values(NIL != cyclify_status_out_string_list(cyclify_status) ? apply(symbol_function(CCONCATENATE), nreverse(cyclify_status_out_string_list(cyclify_status))) : $empty_string$.getGlobalValue(), nreverse(cyclify_status_references_added(cyclify_status)));
    }

    public static SubLObject constant_names_in_string(final SubLObject string, SubLObject require_exact) {
        if (require_exact == UNPROVIDED) {
            require_exact = NIL;
        }
        final SubLObject length = length(string);
        SubLObject last_idx = ZERO_INTEGER;
        SubLObject valid_names = NIL;
        SubLObject invalid_names = NIL;
        SubLObject hash_idx;
        SubLObject dollar_idx;
        SubLObject token_start;
        SubLObject token_end;
        SubLObject token_last;
        SubLObject possible_constant;
        SubLObject item_var;
        for (hash_idx = NIL, hash_idx = position(CHAR_hash, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED); NIL != hash_idx; hash_idx = position(CHAR_hash, string, symbol_function(EQL), symbol_function(IDENTITY), last_idx, UNPROVIDED)) {
            dollar_idx = add(hash_idx, ONE_INTEGER);
            if (dollar_idx.numE(length) || (!Strings.sublisp_char(string, dollar_idx).eql(constant_reader.constant_reader_macro_char()))) {
                last_idx = dollar_idx;
            } else {
                token_start = add(dollar_idx, ONE_INTEGER);
                token_end = list_utilities.position_if_not(symbol_function(VALID_CONSTANT_NAME_CHAR_P), string, symbol_function(IDENTITY), token_start, UNPROVIDED);
                token_last = NIL;
                possible_constant = NIL;
                if (NIL == token_end) {
                    token_end = length;
                }
                token_last = subtract(token_end, ONE_INTEGER);
                possible_constant = constant_completion_high.constant_complete_exact(string, token_start, token_end);
                if ((NIL == possible_constant) && (NIL == require_exact)) {
                    if (token_last.numG(token_start) && (NIL != char_equal(CHAR_s, Strings.sublisp_char(string, token_last)))) {
                        possible_constant = constant_completion_high.constant_complete_exact(string, token_start, token_last);
                        if (NIL != possible_constant) {
                            token_end = token_last;
                        } else {
                            token_last = subtract(token_last, ONE_INTEGER);
                            if (token_last.numG(token_start) && (NIL != char_equal(CHAR_e, Strings.sublisp_char(string, token_last)))) {
                                possible_constant = constant_completion_high.constant_complete_exact(string, token_start, token_last);
                                if (NIL != possible_constant) {
                                    token_end = token_last;
                                }
                            }
                        }
                    } else
                        if (token_last.numG(token_start) && (NIL != char_equal(CHAR_question, Strings.sublisp_char(string, token_last)))) {
                            possible_constant = constant_completion_high.constant_complete_exact(string, token_start, token_last);
                        }

                }
                if (NIL != possible_constant) {
                    item_var = constants_high.constant_name(possible_constant);
                    if (NIL == member(item_var, valid_names, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        valid_names = cons(item_var, valid_names);
                    }
                } else {
                    item_var = substring(string, token_start, token_end);
                    if (NIL == member(item_var, invalid_names, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        invalid_names = cons(item_var, invalid_names);
                    }
                }
                last_idx = token_end;
            }
        }
        return values(nreverse(valid_names), nreverse(invalid_names));
    }

    public static SubLObject invalid_constant_names_in_string(final SubLObject string, SubLObject require_exactP) {
        if (require_exactP == UNPROVIDED) {
            require_exactP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject valid_references = constant_names_in_string(string, require_exactP);
        final SubLObject invalid_references = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return invalid_references;
    }

    public static SubLObject invalid_constant_names_in_stringP(final SubLObject string, SubLObject require_exactP) {
        if (require_exactP == UNPROVIDED) {
            require_exactP = NIL;
        }
        return list_utilities.sublisp_boolean(invalid_constant_names_in_string(string, require_exactP));
    }

    public static SubLObject nonbreak_char(final SubLObject v_char) {
        if (v_char.isChar()) {
            return makeBoolean((NIL == whitespacep(v_char)) && (NIL == find(v_char, $str181$__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject read_string_until_char(final SubLObject stream, final SubLObject quit_char, SubLObject eof_value) {
        if (eof_value == UNPROVIDED) {
            eof_value = $EOF;
        }
        SubLThread thread;
        SubLObject index;
        SubLObject v_char;
        for (thread = SubLProcess.currentSubLThread(), index = ZERO_INTEGER, v_char = NIL, v_char = read_char(stream, NIL, eof_value, UNPROVIDED); ((!index.eql($string_read_buffer_size$.getDynamicValue(thread))) && (!v_char.eql(eof_value))) && (!v_char.eql(quit_char)); index = add(index, ONE_INTEGER) , v_char = read_char(stream, NIL, eof_value, UNPROVIDED)) {
            set_aref($string_read_buffer$.getDynamicValue(thread), index, v_char);
        }
        if (index.eql($string_read_buffer_size$.getDynamicValue(thread))) {
            Errors.cerror($$$quit_reading_file, $str184$string_read_larger_than_buffer_si, $string_read_buffer_size$.getDynamicValue(thread));
            return eof_value;
        }
        final SubLObject v_answer = Strings.make_string(index, UNPROVIDED);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(index); i = add(i, ONE_INTEGER)) {
            set_nth_char(i, v_answer, aref($string_read_buffer$.getDynamicValue(thread), i), UNPROVIDED);
        }
        if (NIL == empty_string_p(v_answer)) {
            return v_answer;
        }
        if (v_char.eql(eof_value)) {
            return eof_value;
        }
        return v_answer;
    }

    public static SubLObject align_char(SubLObject string, final SubLObject v_char, final SubLObject field_width, final SubLObject char_psn, SubLObject fill) {
        if (fill == UNPROVIDED) {
            fill = $$$_;
        }
        final SubLObject position = char_position(v_char, string, UNPROVIDED);
        final SubLObject length = length(string);
        final SubLObject max = subtract(field_width, length);
        SubLObject cdotimes_end_var;
        SubLObject n;
        for (cdotimes_end_var = min(max, subtract(char_psn, position, ONE_INTEGER)), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
            string = cconcatenate(fill, string);
        }
        for (cdotimes_end_var = min(max, subtract(field_width, add(subtract(length, position, ONE_INTEGER), char_psn))), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
            string = cconcatenate(string, fill);
        }
        return string;
    }

    public static SubLObject right_justify(SubLObject string, final SubLObject field_width, SubLObject fill) {
        if (fill == UNPROVIDED) {
            fill = $$$_;
        }
        SubLObject cdotimes_end_var;
        SubLObject n;
        for (cdotimes_end_var = subtract(field_width, length(string)), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
            string = cconcatenate(fill, string);
        }
        return string;
    }

    public static SubLObject left_justify(SubLObject string, final SubLObject field_width, SubLObject fill) {
        if (fill == UNPROVIDED) {
            fill = $$$_;
        }
        SubLObject cdotimes_end_var;
        SubLObject n;
        for (cdotimes_end_var = subtract(field_width, length(string)), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
            string = cconcatenate(string, fill);
        }
        return string;
    }

    public static SubLObject center_string(SubLObject string, final SubLObject field_width, SubLObject fill) {
        if (fill == UNPROVIDED) {
            fill = $$$_;
        }
        final SubLObject length = length(string);
        final SubLObject left = truncate(add($float$0_5, divide(subtract(field_width, length), TWO_INTEGER)), UNPROVIDED);
        final SubLObject right = subtract(field_width, length, left);
        SubLObject n;
        for (n = NIL, n = ZERO_INTEGER; n.numL(left); n = add(n, ONE_INTEGER)) {
            string = cconcatenate(fill, string);
        }
        for (n = NIL, n = ZERO_INTEGER; n.numL(right); n = add(n, ONE_INTEGER)) {
            string = cconcatenate(string, fill);
        }
        return string;
    }

    public static SubLObject print_length(final SubLObject v_object) {
        if (v_object.isString()) {
            return length(v_object);
        }
        return length(format(NIL, $str186$_a, v_object));
    }

    public static SubLObject tab(final SubLObject indent, SubLObject stream, SubLObject new_lineP, SubLObject fill, SubLObject fill_psn) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (new_lineP == UNPROVIDED) {
            new_lineP = NIL;
        }
        if (fill == UNPROVIDED) {
            fill = $$$_;
        }
        if (fill_psn == UNPROVIDED) {
            fill_psn = ONE_INTEGER;
        }
        if (NIL != new_lineP) {
            format(stream, $str125$__);
        }
        SubLObject n;
        for (n = NIL, n = ZERO_INTEGER; n.numL(indent); n = add(n, ONE_INTEGER)) {
            if (mod(n, fill_psn).eql(ZERO_INTEGER)) {
                format(stream, fill);
            } else {
                format(stream, $$$_);
            }
        }
        return NIL;
    }

    public static SubLObject tabstr(final SubLObject indent, SubLObject fill) {
        if (fill == UNPROVIDED) {
            fill = $$$_;
        }
        SubLObject string = $empty_string$.getGlobalValue();
        SubLObject n;
        for (n = NIL, n = ZERO_INTEGER; n.numL(indent); n = add(n, ONE_INTEGER)) {
            string = cconcatenate(string, fill);
        }
        return string;
    }

    public static SubLObject reduce_whitespace(SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        final SubLObject new_size = compute_reduced_length(string);
        if (!new_size.numE(length(string))) {
            final SubLObject new_string = Strings.make_string(new_size, UNPROVIDED);
            SubLObject state = $BEFORE;
            SubLObject index = ZERO_INTEGER;
            final SubLObject string_var = string;
            SubLObject end_var_$51;
            SubLObject end_var;
            SubLObject char_num;
            SubLObject curr;
            SubLObject blankP;
            for (end_var = end_var_$51 = length(string_var), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$51); char_num = number_utilities.f_1X(char_num)) {
                curr = Strings.sublisp_char(string_var, char_num);
                blankP = whitespacep(curr);
                if (state == $BEFORE) {
                    if (NIL == blankP) {
                        set_nth_char(index, new_string, curr, UNPROVIDED);
                        index = add(index, ONE_INTEGER);
                        state = $WORD;
                    }
                } else
                    if (state == $WORD) {
                        if (NIL != blankP) {
                            state = $KEEP_BLANK;
                        } else {
                            set_nth_char(index, new_string, curr, UNPROVIDED);
                            index = add(index, ONE_INTEGER);
                        }
                    } else
                        if (state == $KEEP_BLANK) {
                            if (NIL != blankP) {
                                state = $SKIP_BLANKS;
                            } else {
                                set_nth_char(index, new_string, CHAR_space, UNPROVIDED);
                                index = add(index, ONE_INTEGER);
                                set_nth_char(index, new_string, curr, UNPROVIDED);
                                index = add(index, ONE_INTEGER);
                                state = $WORD;
                            }
                        } else {
                            if (state != $SKIP_BLANKS) {
                                Errors.cerror($str191$Unknown_State__S__Flaw_in_state_m, state);
                                return string;
                            }
                            if (NIL == blankP) {
                                set_nth_char(index, new_string, CHAR_space, UNPROVIDED);
                                index = add(index, ONE_INTEGER);
                                set_nth_char(index, new_string, curr, UNPROVIDED);
                                index = add(index, ONE_INTEGER);
                                state = $WORD;
                            }
                        }


            }
            string = new_string;
        }
        return string;
    }

    public static SubLObject compute_reduced_length(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        SubLObject state = $BEFORE;
        SubLObject count = ZERO_INTEGER;
        SubLObject end_var_$52;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject v_char;
        SubLObject blankP;
        for (end_var = end_var_$52 = length(string), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$52); char_num = number_utilities.f_1X(char_num)) {
            v_char = Strings.sublisp_char(string, char_num);
            blankP = whitespacep(v_char);
            if (state == $BEFORE) {
                if (NIL != blankP) {
                    count = add(count, ONE_INTEGER);
                } else {
                    state = $WORD;
                }
            } else
                if (state == $WORD) {
                    if (NIL != blankP) {
                        state = $KEEP_BLANK;
                    }
                } else
                    if (state == $KEEP_BLANK) {
                        if (NIL != blankP) {
                            state = $SPACE;
                        } else {
                            state = $WORD;
                        }
                    } else {
                        if (state != $SPACE) {
                            Errors.cerror($str193$Unknown_state__S__Design_flaw_in_, state);
                            return length(string);
                        }
                        count = add(count, ONE_INTEGER);
                        if (NIL == blankP) {
                            state = $WORD;
                        }
                    }


        }
        if (state == $KEEP_BLANK) {
            count = add(count, ONE_INTEGER);
        } else
            if (state == $SPACE) {
                count = add(count, TWO_INTEGER);
            }

        return subtract(length(string), count);
    }

    public static SubLObject single_word_string_p(final SubLObject v_object) {
        return makeBoolean(v_object.isString() && (NIL == multi_word_string(v_object)));
    }

    public static SubLObject multi_word_string(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        final SubLObject first_non_whitespace = list_utilities.position_if_not(symbol_function(WHITESPACEP), string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == first_non_whitespace) {
            return NIL;
        }
        final SubLObject middle_whitespace = position_if(symbol_function(WHITESPACEP), string, symbol_function(IDENTITY), first_non_whitespace, UNPROVIDED);
        if (NIL == middle_whitespace) {
            return NIL;
        }
        return integerp(list_utilities.position_if_not(symbol_function(WHITESPACEP), string, symbol_function(IDENTITY), middle_whitespace, UNPROVIDED));
    }

    public static SubLObject multi_word_quote(final SubLObject string) {
        if (NIL != multi_word_string(string)) {
            return cconcatenate($str21$_, new SubLObject[]{ string, $str21$_ });
        }
        return string;
    }

    public static SubLObject process_file(final SubLObject infile, final SubLObject read_function, final SubLObject process_item_function, SubLObject outfile, SubLObject write_function) {
        if (outfile == UNPROVIDED) {
            outfile = NIL;
        }
        if (write_function == UNPROVIDED) {
            write_function = PRIN1;
        }
        assert NIL != subl_promotions.function_symbol_p(process_item_function) : "subl_promotions.function_symbol_p(process_item_function) " + "CommonSymbols.NIL != subl_promotions.function_symbol_p(process_item_function) " + process_item_function;
        assert NIL != subl_promotions.function_symbol_p(read_function) : "subl_promotions.function_symbol_p(read_function) " + "CommonSymbols.NIL != subl_promotions.function_symbol_p(read_function) " + read_function;
        assert NIL != subl_promotions.function_symbol_p(write_function) : "subl_promotions.function_symbol_p(write_function) " + "CommonSymbols.NIL != subl_promotions.function_symbol_p(write_function) " + write_function;
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(infile, $INPUT);
            if (!stream.isStream()) {
                Errors.error($str197$Unable_to_open__S, infile);
            }
            final SubLObject in = stream;
            if (!in.isStream()) {
                Errors.error($str198$Could_not_open_an_input_stream_fo, infile);
            }
            SubLObject out = NIL;
            try {
                if (outfile.isString()) {
                    out = compatibility.open_text(outfile, $OUTPUT);
                }
                SubLObject done = NIL;
                while (NIL == done) {
                    SubLObject item = NIL;
                    item = funcall(read_function, in);
                    if (item == $EOF) {
                        done = T;
                    } else {
                        SubLObject result = NIL;
                        result = funcall(process_item_function, item);
                        if (!out.isStream()) {
                            continue;
                        }
                        funcall(write_function, result, out);
                    }
                } 
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    if (out.isStream()) {
                        close(out, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        } finally {
            final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_2);
            }
        }
        return NIL;
    }

    public static SubLObject princ_file_to_stream(final SubLObject infile, final SubLObject stream, SubLObject subst_space_for_newlineP, SubLObject ignore_lines) {
        if (subst_space_for_newlineP == UNPROVIDED) {
            subst_space_for_newlineP = NIL;
        }
        if (ignore_lines == UNPROVIDED) {
            ignore_lines = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject newline = (NIL != subst_space_for_newlineP) ? $$$_ : format(NIL, $str125$__);
        SubLObject line = NIL;
        SubLObject done = NIL;
        SubLObject stream_$53 = NIL;
        try {
            stream_$53 = compatibility.open_text(infile, $INPUT);
            if (!stream_$53.isStream()) {
                Errors.error($str197$Unable_to_open__S, infile);
            }
            final SubLObject in = stream_$53;
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!in.isStream())) {
                Errors.error($str200$__Cannot_open_input_stream_for__A, infile);
            }
            if (NIL != subl_promotions.positive_integer_p(ignore_lines)) {
                SubLObject n;
                for (n = NIL, n = ZERO_INTEGER; n.numL(ignore_lines); n = add(n, ONE_INTEGER)) {
                    if (NIL == done) {
                        line = read_line(in, NIL, $EOF, UNPROVIDED);
                        if (line == $EOF) {
                            done = T;
                        }
                    }
                }
            }
            while (NIL == done) {
                line = read_line(in, NIL, $EOF, UNPROVIDED);
                if (line == $EOF) {
                    done = T;
                } else {
                    princ(line, stream);
                    princ(newline, stream);
                }
            } 
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream_$53.isStream()) {
                    close(stream_$53, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return infile;
    }

    public static SubLObject read_string_from_file(final SubLObject infile, SubLObject subst_space_for_newlineP, SubLObject ignore_lines) {
        if (subst_space_for_newlineP == UNPROVIDED) {
            subst_space_for_newlineP = NIL;
        }
        if (ignore_lines == UNPROVIDED) {
            ignore_lines = NIL;
        }
        assert NIL != stringp(infile) : "Types.stringp(infile) " + "CommonSymbols.NIL != Types.stringp(infile) " + infile;
        SubLObject input_string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            princ_file_to_stream(infile, stream, subst_space_for_newlineP, ignore_lines);
            input_string = get_output_stream_string(stream);
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
        return input_string;
    }

    public static SubLObject uniquify_string(final SubLObject string, final SubLObject other_strings, SubLObject test, SubLObject glue_string) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        if (glue_string == UNPROVIDED) {
            glue_string = $str201$_;
        }
        return uniquify_string_via_set(string, set_utilities.construct_set_from_list(other_strings, test, UNPROVIDED), glue_string);
    }

    public static SubLObject uniquify_string_via_set(final SubLObject string, final SubLObject other_string_set, SubLObject glue_string) {
        if (glue_string == UNPROVIDED) {
            glue_string = $str201$_;
        }
        SubLObject curr_string = string;
        for (SubLObject uniquifying_integer = ONE_INTEGER; NIL != set.set_memberP(curr_string, other_string_set); curr_string = cconcatenate(string, new SubLObject[]{ glue_string, str(uniquifying_integer) })) {
            uniquifying_integer = add(uniquifying_integer, ONE_INTEGER);
        }
        return curr_string;
    }

    public static SubLObject possibly_read_from_string_ignoring_errors(final SubLObject string, final SubLObject do_itP) {
        return NIL != do_itP ? read_from_string_ignoring_errors(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : string;
    }

    public static SubLObject random_string(final SubLObject length) {
        final SubLObject string = Strings.make_string(length, UNPROVIDED);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            set_aref(string, i, code_char(add($int$97, random.random($int$26))));
        }
        return string;
    }

    public static SubLObject alphacize(final SubLObject string) {
        return list_utilities.remove_if_not(ALPHA_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject alphanumericize(final SubLObject string) {
        return list_utilities.remove_if_not(ALPHANUMERICP, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject alphanumeric_or_hyphen_p(final SubLObject v_char) {
        return makeBoolean((NIL != alphanumericp(v_char)) || v_char.eql(CHAR_hyphen));
    }

    public static SubLObject alpha_or_underscore_p(final SubLObject v_char) {
        return makeBoolean((NIL != alpha_char_p(v_char)) || v_char.eql(CHAR_underbar));
    }

    public static SubLObject alphanumericize_admitting_hyphens(final SubLObject string) {
        return list_utilities.remove_if_not(ALPHANUMERIC_OR_HYPHEN_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject alphanumeric_or_number_char_p(final SubLObject v_char) {
        return makeBoolean(((NIL != alphanumericp(v_char)) || v_char.eql(CHAR_hyphen)) || v_char.eql(CHAR_period));
    }

    public static SubLObject nth_letter_of_alphabet(final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.non_negative_integer_p(n) : "subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) " + n;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!n.numL($int$26))) {
            Errors.error($str205$_a_is_not_a_number_between_0_and_, n);
        }
        return code_char(add(char_code(CHAR_a), n));
    }

    public static SubLObject nth_letter_of_alphabet_upcase(final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.non_negative_integer_p(n) : "subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) " + n;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!n.numL($int$26))) {
            Errors.error($str205$_a_is_not_a_number_between_0_and_, n);
        }
        return code_char(add(char_code(CHAR_A), n));
    }

    public static SubLObject keyword_from_string(final SubLObject string) {
        if (string.isString() && length(string).numG(ZERO_INTEGER)) {
            return make_keyword(string);
        }
        return NIL;
    }

    public static SubLObject pretty_keyword_from_string(final SubLObject string) {
        final SubLObject upcased_string = Strings.string_upcase(string, UNPROVIDED, UNPROVIDED);
        final SubLObject replaced_string = substitute_char_if(upcased_string, CHAR_hyphen, NON_ALPHANUMERIC_P);
        return keyword_from_string(replaced_string);
    }

    public static SubLObject non_alphanumeric_p(final SubLObject v_char) {
        return makeBoolean(NIL == alphanumericp(v_char));
    }

    public static SubLObject string_from_keyword(final SubLObject keyword) {
        if (keyword.isKeyword()) {
            return symbol_name(keyword);
        }
        return NIL;
    }

    public static SubLObject keyword_impostor_p(final SubLObject v_object) {
        if (v_object.isSymbol() && (!v_object.isKeyword())) {
            final SubLObject name = symbol_name(v_object);
            return makeBoolean(ZERO_INTEGER.numL(length(name)) && (NIL != charE(CHAR_colon, Strings.sublisp_char(name, ZERO_INTEGER))));
        }
        return NIL;
    }

    public static SubLObject keyword_from_impostor(final SubLObject keyword_impostor) {
        assert NIL != keyword_impostor_p(keyword_impostor) : "string_utilities.keyword_impostor_p(keyword_impostor) " + "CommonSymbols.NIL != string_utilities.keyword_impostor_p(keyword_impostor) " + keyword_impostor;
        final SubLObject impostor_name = symbol_name(keyword_impostor);
        return make_keyword(substring(impostor_name, ONE_INTEGER, UNPROVIDED));
    }

    public static SubLObject coerce_to_keyword(final SubLObject v_object) {
        if (v_object.isKeyword()) {
            return v_object;
        }
        if (v_object.isString()) {
            return keyword_from_string(v_object);
        }
        if (NIL != keyword_impostor_p(v_object)) {
            return keyword_from_impostor(v_object);
        }
        if (v_object.isSymbol()) {
            return keyword_from_string(symbol_name(v_object));
        }
        return NIL;
    }

    public static SubLObject cfasl_compile_from_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject forms = NIL;
        SubLObject pos = ZERO_INTEGER;
        SubLObject eof = NIL;
        while (NIL == eof) {
            thread.resetMultipleValues();
            final SubLObject form = read_from_string_ignoring_errors(string, NIL, $EOF, pos, UNPROVIDED);
            final SubLObject new_pos = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (form.eql($EOF)) {
                eof = T;
            } else {
                forms = cons(form, forms);
                pos = new_pos;
            }
        } 
        forms = bq_cons(PROGN, append(nreverse(forms), NIL));
        return forms;
    }

    public static SubLObject weak_string_equal(final SubLObject string_1, final SubLObject string_2) {
        SubLObject index_1 = ZERO_INTEGER;
        SubLObject index_2 = ZERO_INTEGER;
        for (SubLObject total_iterations = add(max(length(string_1), length(string_2)), ONE_INTEGER), curr_iteration = ZERO_INTEGER, doneP = NIL; NIL == doneP; doneP = numL(total_iterations, curr_iteration)) {
            final SubLObject next_1 = position_if(ALPHANUMERICP, string_1, IDENTITY, index_1, UNPROVIDED);
            final SubLObject next_2 = position_if(ALPHANUMERICP, string_2, IDENTITY, index_2, UNPROVIDED);
            if ((NIL == next_1) && (NIL == next_2)) {
                return T;
            }
            if ((NIL == next_1) || (NIL == next_2)) {
                return NIL;
            }
            if (NIL == char_equal(Strings.sublisp_char(string_1, next_1), Strings.sublisp_char(string_2, next_2))) {
                return NIL;
            }
            curr_iteration = add(curr_iteration, ONE_INTEGER);
            index_1 = add(next_1, ONE_INTEGER);
            index_2 = add(next_2, ONE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject comma_separated_string(final SubLObject list) {
        SubLObject result = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            final SubLObject first_elem = list.first();
            format(s, $str186$_a, first_elem);
            SubLObject cdolist_list_var = list.rest();
            SubLObject elem = NIL;
            elem = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(s, $str209$__a, elem);
                cdolist_list_var = cdolist_list_var.rest();
                elem = cdolist_list_var.first();
            } 
            result = get_output_stream_string(s);
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
        return result;
    }

    public static SubLObject format_nil_test(final SubLObject format_control, final SubLObject format_arguments) {
        return format(NIL, format_control, format_arguments);
    }

    public static SubLObject declare_string_utilities_file() {
        declareFunction(me, "not_test_char", "NOT-TEST-CHAR", 1, 0, false);
        declareMacro(me, "do_words", "DO-WORDS");
        declareFunction(me, "empty_string_p", "EMPTY-STRING-P", 1, 0, false);
        declareFunction(me, "empty_stringP", "EMPTY-STRING?", 1, 0, false);
        declareFunction(me, "non_empty_string_p", "NON-EMPTY-STRING-P", 1, 0, false);
        declareFunction(me, "every_in_string", "EVERY-IN-STRING", 2, 1, false);
        declareFunction(me, "any_in_string", "ANY-IN-STRING", 2, 1, false);
        declareFunction(me, "list_of_string_p", "LIST-OF-STRING-P", 1, 0, false);
        declareFunction(me, "clear_object_to_string", "CLEAR-OBJECT-TO-STRING", 0, 0, false);
        declareFunction(me, "remove_object_to_string", "REMOVE-OBJECT-TO-STRING", 1, 0, false);
        declareFunction(me, "object_to_string_internal", "OBJECT-TO-STRING-INTERNAL", 1, 0, false);
        declareFunction(me, "object_to_string", "OBJECT-TO-STRING", 1, 0, false);
        declareFunction(me, "fort_to_string", "FORT-TO-STRING", 1, 0, false);
        declareFunction(me, "function_to_string", "FUNCTION-TO-STRING", 1, 0, false);
        declareFunction(me, "to_string", "TO-STRING", 1, 0, false);
        declareFunction(me, "non_nil_to_string", "NON-NIL-TO-STRING", 1, 0, false);
        declareFunction(me, "to_lisp_string", "TO-LISP-STRING", 1, 0, false);
        declareFunction(me, "to_string_of_length", "TO-STRING-OF-LENGTH", 2, 0, false);
        declareFunction(me, "first_n_list_items_to_string", "FIRST-N-LIST-ITEMS-TO-STRING", 2, 0, false);
        declareFunction(me, "char_at", "CHAR-AT", 2, 0, false);
        declareFunction(me, "quote_string", "QUOTE-STRING", 1, 1, false);
        declareFunction(me, "unquote_string", "UNQUOTE-STRING", 1, 0, false);
        declareFunction(me, "quoted_stringP", "QUOTED-STRING?", 1, 0, false);
        declareFunction(me, "str", "STR", 1, 0, false);
        declareFunction(me, "printed_forms_equalP", "PRINTED-FORMS-EQUAL?", 2, 1, false);
        declareFunction(me, "readable_p", "READABLE-P", 1, 0, false);
        declareFunction(me, "string_to_number", "STRING-TO-NUMBER", 1, 0, false);
        declareFunction(me, "string_to_integer", "STRING-TO-INTEGER", 1, 0, false);
        declareFunction(me, "integer_string_p", "INTEGER-STRING-P", 1, 0, false);
        declareFunction(me, "integer_stringL", "INTEGER-STRING<", 2, 0, false);
        declareFunction(me, "to_hex_string", "TO-HEX-STRING", 1, 0, false);
        declareFunction(me, "hex_int_from_string", "HEX-INT-FROM-STRING", 1, 0, false);
        declareFunction(me, "string_length_L", "STRING-LENGTH-<", 2, 0, false);
        declareFunction(me, "indent", "INDENT", 2, 0, false);
        declareFunction(me, "aref_from_end", "AREF-FROM-END", 2, 0, false);
        declareFunction(me, "char_from_end", "CHAR-FROM-END", 2, 0, false);
        declareFunction(me, "first_char", "FIRST-CHAR", 1, 0, false);
        declareFunction(me, "first_of_string", "FIRST-OF-STRING", 1, 0, false);
        declareFunction(me, "rest_of_string", "REST-OF-STRING", 1, 0, false);
        declareFunction(me, "last_char", "LAST-CHAR", 1, 0, false);
        declareFunction(me, "pre_add_character_to_string", "PRE-ADD-CHARACTER-TO-STRING", 2, 0, false);
        declareFunction(me, "post_add_character_to_string", "POST-ADD-CHARACTER-TO-STRING", 2, 0, false);
        declareFunction(me, "pre_and_post_add_character_to_string", "PRE-AND-POST-ADD-CHARACTER-TO-STRING", 2, 0, false);
        declareFunction(me, "copy_string", "COPY-STRING", 1, 0, false);
        declareFunction(me, "string_substitute", "STRING-SUBSTITUTE", 3, 1, false);
        declareFunction(me, "string_substitute_word", "STRING-SUBSTITUTE-WORD", 3, 2, false);
        declareFunction(me, "do_string_substitutions", "DO-STRING-SUBSTITUTIONS", 2, 1, false);
        declareFunction(me, "do_string_substitutions_robust", "DO-STRING-SUBSTITUTIONS-ROBUST", 2, 1, false);
        declareFunction(me, "insert_escape_for_chars_in_string", "INSERT-ESCAPE-FOR-CHARS-IN-STRING", 2, 0, false);
        declareFunction(me, "html_escaped_string_p", "HTML-ESCAPED-STRING-P", 1, 0, false);
        declareFunction(me, "remove_last_char", "REMOVE-LAST-CHAR", 1, 1, false);
        declareFunction(me, "remove_substring", "REMOVE-SUBSTRING", 2, 0, false);
        declareFunction(me, "replace_substring", "REPLACE-SUBSTRING", 3, 0, false);
        declareFunction(me, "replace_substring_once", "REPLACE-SUBSTRING-ONCE", 3, 1, false);
        declareFunction(me, "nreplace_substring_at", "NREPLACE-SUBSTRING-AT", 4, 0, false);
        declareFunction(me, "infix", "INFIX", 3, 0, false);
        declareFunction(me, "post_fix", "POST-FIX", 2, 0, false);
        declareFunction(me, "pre_fix", "PRE-FIX", 2, 0, false);
        declareFunction(me, "post_remove", "POST-REMOVE", 2, 1, false);
        declareFunction(me, "pre_remove", "PRE-REMOVE", 2, 1, false);
        declareFunction(me, "substring", "SUBSTRING", 2, 1, false);
        declareFunction(me, "string_first_n", "STRING-FIRST-N", 2, 0, false);
        declareFunction(me, "string_last_n", "STRING-LAST-N", 2, 0, false);
        declareFunction(me, "string_butlast", "STRING-BUTLAST", 1, 0, false);
        declareFunction(me, "ends_with", "ENDS-WITH", 2, 1, false);
        declareFunction(me, "ends_with_one_of", "ENDS-WITH-ONE-OF", 2, 0, false);
        declareFunction(me, "ends_with_punctuation_p", "ENDS-WITH-PUNCTUATION-P", 1, 0, false);
        declareFunction(me, "ends_with_number_p", "ENDS-WITH-NUMBER-P", 1, 0, false);
        declareFunction(me, "ends_with_number", "ENDS-WITH-NUMBER", 1, 0, false);
        declareFunction(me, "starts_with", "STARTS-WITH", 2, 0, false);
        declareFunction(me, "starts_with_one_of", "STARTS-WITH-ONE-OF", 2, 0, false);
        declareFunction(me, "starts_with_by_test", "STARTS-WITH-BY-TEST", 2, 1, false);
        declareFunction(me, "starts_with_one_of_by_test", "STARTS-WITH-ONE-OF-BY-TEST", 2, 1, false);
        declareFunction(me, "starting_string", "STARTING-STRING", 2, 1, false);
        declareFunction(me, "ends_with_start_of", "ENDS-WITH-START-OF", 2, 2, false);
        declareFunction(me, "number_of_commas", "NUMBER-OF-COMMAS", 1, 0, false);
        declareFunction(me, "comma_sub_string", "COMMA-SUB-STRING", 1, 0, false);
        declareFunction(me, "concatenate_adjacent_strings", "CONCATENATE-ADJACENT-STRINGS", 1, 0, false);
        declareFunction(me, "string_starts_with_constant_reader_prefix_p", "STRING-STARTS-WITH-CONSTANT-READER-PREFIX-P", 1, 0, false);
        declareFunction(me, "string_contains_constant_reader_prefix_p", "STRING-CONTAINS-CONSTANT-READER-PREFIX-P", 1, 0, false);
        declareFunction(me, "string_add_constant_reader_prefix", "STRING-ADD-CONSTANT-READER-PREFIX", 1, 0, false);
        declareFunction(me, "string_remove_constant_reader_prefix", "STRING-REMOVE-CONSTANT-READER-PREFIX", 1, 0, false);
        declareFunction(me, "string_remove_constant_reader_prefixes", "STRING-REMOVE-CONSTANT-READER-PREFIXES", 1, 0, false);
        declareFunction(me, "one_is_starting_string", "ONE-IS-STARTING-STRING", 2, 1, false);
        declareFunction(me, "strings_common_prefix", "STRINGS-COMMON-PREFIX", 1, 2, false);
        declareFunction(me, "char_position", "CHAR-POSITION", 2, 1, false);
        declareFunction(me, "string_upto", "STRING-UPTO", 1, 1, false);
        declareFunction(me, "string_after", "STRING-AFTER", 1, 1, false);
        declareFunction(me, "string_between", "STRING-BETWEEN", 1, 2, false);
        declareFunction(me, "get_substring_between_tags", "GET-SUBSTRING-BETWEEN-TAGS", 3, 2, false);
        declareFunction(me, "get_substring_between_tags_list", "GET-SUBSTRING-BETWEEN-TAGS-LIST", 3, 2, false);
        declareFunction(me, "get_end_pos", "GET-END-POS", 4, 0, false);
        declareFunction(me, "strip_header", "STRIP-HEADER", 2, 0, false);
        declareFunction(me, "strip_trailer", "STRIP-TRAILER", 2, 0, false);
        declareFunction(me, "strip_first", "STRIP-FIRST", 1, 0, false);
        declareFunction(me, "strip_final", "STRIP-FINAL", 1, 1, false);
        declareFunction(me, "strip_first_if_char", "STRIP-FIRST-IF-CHAR", 2, 0, false);
        declareFunction(me, "strip_final_if_char", "STRIP-FINAL-IF-CHAR", 2, 0, false);
        declareFunction(me, "strip_first_n", "STRIP-FIRST-N", 2, 0, false);
        declareFunction(me, "strip_final_n", "STRIP-FINAL-N", 2, 0, false);
        declareFunction(me, "strip_punctuation", "STRIP-PUNCTUATION", 1, 0, false);
        declareFunction(me, "strip_sentential_punctuation", "STRIP-SENTENTIAL-PUNCTUATION", 1, 0, false);
        declareFunction(me, "ends_in_geminateP", "ENDS-IN-GEMINATE?", 1, 0, false);
        declareFunction(me, "null_stringP", "NULL-STRING?", 1, 0, false);
        declareFunction(me, "non_empty_stringP", "NON-EMPTY-STRING?", 1, 0, false);
        declareFunction(me, "non_empty_cycl_stringP", "NON-EMPTY-CYCL-STRING?", 1, 0, false);
        declareFunction(me, "non_empty_subl_stringP", "NON-EMPTY-SUBL-STRING?", 1, 0, false);
        declareFunction(me, "char_set_position", "CHAR-SET-POSITION", 2, 2, false);
        declareFunction(me, "char_type_position", "CHAR-TYPE-POSITION", 2, 2, false);
        declareFunction(me, "space_p", "SPACE-P", 1, 0, false);
        declareFunction(me, "non_space_char_p", "NON-SPACE-CHAR-P", 1, 0, false);
        declareFunction(me, "tab_p", "TAB-P", 1, 0, false);
        declareFunction(me, "non_tab_char_p", "NON-TAB-CHAR-P", 1, 0, false);
        declareFunction(me, "not_digit_char_p", "NOT-DIGIT-CHAR-P", 1, 0, false);
        new string_utilities.$not_digit_char_p$UnaryFunction();
        declareFunction(me, "isa_digit_charP", "ISA-DIGIT-CHAR?", 1, 0, false);
        declareFunction(me, "digit_stringP", "DIGIT-STRING?", 1, 0, false);
        declareFunction(me, "alphanumeric_stringP", "ALPHANUMERIC-STRING?", 1, 0, false);
        declareFunction(me, "alphanumeric_char_p", "ALPHANUMERIC-CHAR-P", 1, 0, false);
        declareFunction(me, "alphabetic_char_p", "ALPHABETIC-CHAR-P", 1, 0, false);
        declareFunction(me, "partially_numeric_stringP", "PARTIALLY-NUMERIC-STRING?", 1, 0, false);
        declareFunction(me, "alphabetic_stringP", "ALPHABETIC-STRING?", 1, 0, false);
        declareFunction(me, "non_alphabetic_stringP", "NON-ALPHABETIC-STRING?", 1, 0, false);
        declareFunction(me, "is_numericP", "IS-NUMERIC?", 1, 0, false);
        declareFunction(me, "is_numeric_rangeP", "IS-NUMERIC-RANGE?", 1, 0, false);
        declareFunction(me, "parse_numeric_range", "PARSE-NUMERIC-RANGE", 1, 0, false);
        declareFunction(me, "ordinal", "ORDINAL", 1, 0, false);
        declareFunction(me, "english_ordinal_number_string_p", "ENGLISH-ORDINAL-NUMBER-STRING-P", 1, 0, false);
        declareFunction(me, "english_ordinal_string_to_cardinal_string", "ENGLISH-ORDINAL-STRING-TO-CARDINAL-STRING", 1, 0, false);
        declareFunction(me, "integer_suffix", "INTEGER-SUFFIX", 1, 0, false);
        declareFunction(me, "set_nth_char", "SET-NTH-CHAR", 3, 1, false);
        declareFunction(me, "strip_chars_meeting_test", "STRIP-CHARS-MEETING-TEST", 1, 1, false);
        declareFunction(me, "substitute_char_if", "SUBSTITUTE-CHAR-IF", 2, 1, false);
        declareFunction(me, "string_wXo_control_charsP", "STRING-W/O-CONTROL-CHARS?", 1, 0, false);
        new string_utilities.$string_wXo_control_charsP$UnaryFunction();
        declareFunction(me, "control_char_p", "CONTROL-CHAR-P", 1, 0, false);
        declareFunction(me, "utf_8_combining_character_p", "UTF-8-COMBINING-CHARACTER-P", 1, 0, false);
        declareFunction(me, "integer_char_p", "INTEGER-CHAR-P", 1, 0, false);
        declareFunction(me, "contains_charP", "CONTAINS-CHAR?", 2, 0, false);
        declareFunction(me, "char_in_char_set", "CHAR-IN-CHAR-SET", 1, 0, false);
        new string_utilities.$char_in_char_set$UnaryFunction();
        declareFunction(me, "split_string", "SPLIT-STRING", 1, 1, false);
        declareFunction(me, "split_string_on_string", "SPLIT-STRING-ON-STRING", 2, 0, false);
        declareFunction(me, "string_rotations", "STRING-ROTATIONS", 1, 4, false);
        declareFunction(me, "string_rotation_int", "STRING-ROTATION-INT", 6, 0, false);
        declareFunction(me, "substringP", "SUBSTRING?", 2, 3, false);
        declareFunction(me, "superstringP", "SUPERSTRING?", 2, 2, false);
        declareFunction(me, "proper_superstringP", "PROPER-SUPERSTRING?", 2, 2, false);
        declareFunction(me, "substring_matchP", "SUBSTRING-MATCH?", 3, 1, false);
        declareFunction(me, "search_all", "SEARCH-ALL", 2, 2, false);
        declareFunction(me, "count_matches", "COUNT-MATCHES", 2, 2, false);
        declareFunction(me, "subwordP", "SUBWORD?", 2, 2, false);
        declareFunction(me, "bunge", "BUNGE", 1, 1, false);
        declareFunction(me, "bunge_with_string", "BUNGE-WITH-STRING", 1, 1, false);
        declareFunction(me, "offsets_of_token", "OFFSETS-OF-TOKEN", 2, 0, false);
        declareFunction(me, "string_of_allowed_charsP", "STRING-OF-ALLOWED-CHARS?", 2, 0, false);
        declareFunction(me, "bunge_according_to_string", "BUNGE-ACCORDING-TO-STRING", 2, 3, false);
        declareFunction(me, "bunge_according_to_string_ignoring_errors", "BUNGE-ACCORDING-TO-STRING-IGNORING-ERRORS", 2, 0, false);
        declareFunction(me, "concatenate_strings", "CONCATENATE-STRINGS", 1, 0, false);
        declareFunction(me, "strings_to_display_vector_strings", "STRINGS-TO-DISPLAY-VECTOR-STRINGS", 1, 0, false);
        declareFunction(me, "join_strings", "JOIN-STRINGS", 1, 1, false);
        declareFunction(me, "quoted_join_strings", "QUOTED-JOIN-STRINGS", 1, 2, false);
        declareFunction(me, "camel_case_to_underscores", "CAMEL-CASE-TO-UNDERSCORES", 1, 0, false);
        declareFunction(me, "capitalize_first", "CAPITALIZE-FIRST", 1, 0, false);
        declareFunction(me, "uncapitalize_first", "UNCAPITALIZE-FIRST", 1, 0, false);
        declareFunction(me, "nth_word_of_string", "NTH-WORD-OF-STRING", 2, 0, false);
        declareFunction(me, "capitalize_smart", "CAPITALIZE-SMART", 1, 0, false);
        declareFunction(me, "uncapitalize_smart", "UNCAPITALIZE-SMART", 1, 0, false);
        declareFunction(me, "properly_capitalized_stringP", "PROPERLY-CAPITALIZED-STRING?", 1, 0, false);
        declareFunction(me, "capitalized_string_p", "CAPITALIZED-STRING-P", 1, 0, false);
        declareFunction(me, "string_encode_capitalization", "STRING-ENCODE-CAPITALIZATION", 1, 0, false);
        declareFunction(me, "string_has_capitalization_p", "STRING-HAS-CAPITALIZATION-P", 2, 0, false);
        declareFunction(me, "string_has_capitalization_p_mod", "STRING-HAS-CAPITALIZATION-P-MOD", 2, 0, false);
        declareFunction(me, "string_has_capitalization_p_expt", "STRING-HAS-CAPITALIZATION-P-EXPT", 2, 0, false);
        declareFunction(me, "nstring_proper", "NSTRING-PROPER", 1, 4, false);
        declareFunction(me, "string_proper", "STRING-PROPER", 1, 4, false);
        declareFunction(me, "space_uncapitalize", "SPACE-UNCAPITALIZE", 1, 0, false);
        declareFunction(me, "space_dont_uncapitalize", "SPACE-DONT-UNCAPITALIZE", 1, 0, false);
        declareFunction(me, "add_space_between_chars_p", "ADD-SPACE-BETWEEN-CHARS-P", 3, 0, false);
        declareFunction(me, "eat_char_p", "EAT-CHAR-P", 1, 0, false);
        declareFunction(me, "capitalize_initial_char_p", "CAPITALIZE-INITIAL-CHAR-P", 2, 0, false);
        declareFunction(me, "string_downcase_except_acronyms", "STRING-DOWNCASE-EXCEPT-ACRONYMS", 1, 0, false);
        declareFunction(me, "string_ndowncase_except_acronyms", "STRING-NDOWNCASE-EXCEPT-ACRONYMS", 1, 0, false);
        declareFunction(me, "hex_char_p", "HEX-CHAR-P", 1, 0, false);
        declareFunction(me, "hex_char", "HEX-CHAR", 1, 0, false);
        declareFunction(me, "hex_char_value", "HEX-CHAR-VALUE", 1, 0, false);
        declareFunction(me, "hex_char_string_p", "HEX-CHAR-STRING-P", 1, 0, false);
        declareFunction(me, "hex_string_p", "HEX-STRING-P", 1, 0, false);
        declareFunction(me, "hex_string_p_int", "HEX-STRING-P-INT", 2, 0, false);
        declareFunction(me, "integer_to_hex_string", "INTEGER-TO-HEX-STRING", 1, 0, false);
        declareFunction(me, "f_64_bit_char_p", "64-BIT-CHAR-P", 1, 0, false);
        declareFunction(me, "f_64_bit_char", "64-BIT-CHAR", 1, 0, false);
        declareFunction(me, "f_64_bit_char_value", "64-BIT-CHAR-VALUE", 1, 0, false);
        declareFunction(me, "f_64_bit_string_p", "64-BIT-STRING-P", 1, 0, false);
        declareFunction(me, "upper_case_alphanumeric_p", "UPPER-CASE-ALPHANUMERIC-P", 1, 0, false);
        declareFunction(me, "punctuation_p", "PUNCTUATION-P", 1, 0, false);
        declareFunction(me, "punctuation_extended_p", "PUNCTUATION-EXTENDED-P", 1, 0, false);
        declareFunction(me, "punctuation_string_p", "PUNCTUATION-STRING-P", 1, 0, false);
        declareFunction(me, "remove_punctuation", "REMOVE-PUNCTUATION", 1, 0, false);
        declareFunction(me, "upper_case_char_p", "UPPER-CASE-CHAR-P", 1, 0, false);
        declareFunction(me, "lower_case_char_p", "LOWER-CASE-CHAR-P", 1, 0, false);
        declareFunction(me, "upper_case_string_p", "UPPER-CASE-STRING-P", 1, 0, false);
        declareFunction(me, "lower_case_string_p", "LOWER-CASE-STRING-P", 1, 0, false);
        declareFunction(me, "string_list_downcase", "STRING-LIST-DOWNCASE", 1, 0, false);
        declareFunction(me, "string_list_upcase", "STRING-LIST-UPCASE", 1, 0, false);
        declareFunction(me, "nupcase_nth", "NUPCASE-NTH", 2, 1, false);
        declareFunction(me, "nupcase_leading", "NUPCASE-LEADING", 1, 0, false);
        declareFunction(me, "upcase_leading", "UPCASE-LEADING", 1, 0, false);
        declareFunction(me, "ndowncase_nth", "NDOWNCASE-NTH", 2, 1, false);
        declareFunction(me, "ndowncase_leading", "NDOWNCASE-LEADING", 1, 0, false);
        declareFunction(me, "downcase_leading", "DOWNCASE-LEADING", 1, 0, false);
        declareFunction(me, "all_chars_EP", "ALL-CHARS-=?", 2, 0, false);
        declareFunction(me, "string_contains_only_charsP", "STRING-CONTAINS-ONLY-CHARS?", 2, 0, false);
        declareFunction(me, "whitespace_chars", "WHITESPACE-CHARS", 0, 0, false);
        declareFunction(me, "whitespace_charP", "WHITESPACE-CHAR?", 1, 0, false);
        declareFunction(me, "grammatical_punctuation_chars", "GRAMMATICAL-PUNCTUATION-CHARS", 0, 0, false);
        declareFunction(me, "grammatical_punctuation_charP", "GRAMMATICAL-PUNCTUATION-CHAR?", 1, 0, false);
        declareFunction(me, "trim_whitespace", "TRIM-WHITESPACE", 1, 0, false);
        declareFunction(me, "left_trim_whitespace", "LEFT-TRIM-WHITESPACE", 1, 0, false);
        declareFunction(me, "right_trim_whitespace", "RIGHT-TRIM-WHITESPACE", 1, 0, false);
        declareFunction(me, "trim_whitespace_if_string", "TRIM-WHITESPACE-IF-STRING", 1, 0, false);
        declareFunction(me, "nsubst_whitespace", "NSUBST-WHITESPACE", 1, 0, false);
        declareFunction(me, "normalize_spaces", "NORMALIZE-SPACES", 1, 0, false);
        declareFunction(me, "subst_whitespace", "SUBST-WHITESPACE", 1, 0, false);
        declareFunction(me, "whitespacep", "WHITESPACEP", 1, 0, false);
        new string_utilities.$whitespacep$UnaryFunction();
        declareFunction(me, "unicode_space_char_code_p", "UNICODE-SPACE-CHAR-CODE-P", 1, 0, false);
        declareFunction(me, "non_whitespace_p", "NON-WHITESPACE-P", 1, 0, false);
        declareFunction(me, "read_whitespace_no_hang", "READ-WHITESPACE-NO-HANG", 0, 3, false);
        declareFunction(me, "whitespace_stringP", "WHITESPACE-STRING?", 1, 0, false);
        declareFunction(me, "trim_quotes", "TRIM-QUOTES", 1, 1, false);
        declareFunction(me, "remove_whitespace", "REMOVE-WHITESPACE", 1, 0, false);
        declareFunction(me, "equal_modulo_whitespace", "EQUAL-MODULO-WHITESPACE", 2, 0, false);
        declareFunction(me, "equalp_modulo_whitespace", "EQUALP-MODULO-WHITESPACE", 2, 0, false);
        declareFunction(me, "substringP_modulo_whitespace", "SUBSTRING?-MODULO-WHITESPACE", 2, 0, false);
        declareFunction(me, "network_terpri", "NETWORK-TERPRI", 1, 0, false);
        declareFunction(me, "add_to_buffer", "ADD-TO-BUFFER", 3, 0, false);
        declareFunction(me, "network_read_line", "NETWORK-READ-LINE", 0, 4, false);
        declareFunction(me, "read_possibly_continued_line", "READ-POSSIBLY-CONTINUED-LINE", 0, 3, false);
        declareFunction(me, "find_earliest_string", "FIND-EARLIEST-STRING", 2, 2, false);
        declareFunction(me, "search_last", "SEARCH-LAST", 2, 2, false);
        declareFunction(me, "princ_substring", "PRINC-SUBSTRING", 2, 2, false);
        declareFunction(me, "strcat", "STRCAT", 1, 0, false);
        declareFunction(me, "nchar_subst", "NCHAR-SUBST", 3, 0, false);
        declareFunction(me, "char_subst", "CHAR-SUBST", 3, 0, false);
        declareFunction(me, "nchar_subst_if", "NCHAR-SUBST-IF", 3, 0, false);
        declareFunction(me, "char_subst_if", "CHAR-SUBST-IF", 3, 0, false);
        declareFunction(me, "nchar_subst_if_not", "NCHAR-SUBST-IF-NOT", 3, 0, false);
        declareFunction(me, "char_subst_if_not", "CHAR-SUBST-IF-NOT", 3, 0, false);
        declareFunction(me, "string_subst", "STRING-SUBST", 3, 1, false);
        declareFunction(me, "trim_sides", "TRIM-SIDES", 1, 1, false);
        declareFunction(me, "valid_timestring_charP", "VALID-TIMESTRING-CHAR?", 1, 0, false);
        declareFunction(me, "string_trim_symmetric_n", "STRING-TRIM-SYMMETRIC-N", 2, 1, false);
        declareFunction(me, "break_words", "BREAK-WORDS", 1, 2, false);
        declareFunction(me, "sub_phrases", "SUB-PHRASES", 1, 0, false);
        declareFunction(me, "number_of_words", "NUMBER-OF-WORDS", 1, 0, false);
        declareFunction(me, "first_word", "FIRST-WORD", 1, 1, false);
        declareFunction(me, "substring_positions", "SUBSTRING-POSITIONS", 2, 0, false);
        declareFunction(me, "break_string", "BREAK-STRING", 2, 0, false);
        declareFunction(me, "first_name_first", "FIRST-NAME-FIRST", 1, 0, false);
        declareFunction(me, "char_list_to_string", "CHAR-LIST-TO-STRING", 1, 0, false);
        declareFunction(me, "string_to_char_list", "STRING-TO-CHAR-LIST", 1, 0, false);
        declareFunction(me, "count_chars_in_string", "COUNT-CHARS-IN-STRING", 2, 0, false);
        declareFunction(me, "some_are_substringsP", "SOME-ARE-SUBSTRINGS?", 2, 1, false);
        declareFunction(me, "substring_every_in_list", "SUBSTRING-EVERY-IN-LIST", 2, 1, false);
        declareFunction(me, "target_character_found", "TARGET-CHARACTER-FOUND", 1, 0, false);
        declareFunction(me, "separate_sentences", "SEPARATE-SENTENCES", 1, 1, false);
        declareFunction(me, "extract_lines", "EXTRACT-LINES", 1, 0, false);
        declareFunction(me, "collapse_lines", "COLLAPSE-LINES", 1, 0, false);
        declareFunction(me, "quotify_string", "QUOTIFY-STRING", 1, 0, false);
        declareFunction(me, "string_line_lengths", "STRING-LINE-LENGTHS", 1, 0, false);
        declareFunction(me, "relevant_substrings", "RELEVANT-SUBSTRINGS", 1, 0, false);
        declareFunction(me, "make_valid_constant_name", "MAKE-VALID-CONSTANT-NAME", 1, 1, false);
        declareFunction(me, "nl_string_tokenize", "NL-STRING-TOKENIZE", 1, 6, false);
        declareFunction(me, "string_tokenize", "STRING-TOKENIZE", 1, 6, false);
        declareFunction(me, "string_tokenize_int", "STRING-TOKENIZE-INT", 1, 6, false);
        declareFunction(me, "string_tokenize_break_length", "STRING-TOKENIZE-BREAK-LENGTH", 1, 0, false);
        declareFunction(me, "string_tokenize_break_matchP", "STRING-TOKENIZE-BREAK-MATCH?", 3, 0, false);
        declareFunction(me, "listify_string", "LISTIFY-STRING", 1, 1, false);
        declareFunction(me, "all_parens_matchedP", "ALL-PARENS-MATCHED?", 1, 2, false);
        declareFunction(me, "unmatched_parentheses", "UNMATCHED-PARENTHESES", 1, 2, false);
        declareFunction(me, "unmatched_parentheses_terse_hint", "UNMATCHED-PARENTHESES-TERSE-HINT", 1, 2, false);
        declareFunction(me, "byte_string_p", "BYTE-STRING-P", 1, 0, false);
        declareFunction(me, "ip_address_p", "IP-ADDRESS-P", 1, 0, false);
        declareFunction(me, "ip_addressL", "IP-ADDRESS<", 2, 0, false);
        declareFunction(me, "get_trigraph_metric", "GET-TRIGRAPH-METRIC", 0, 0, false);
        declareFunction(me, "set_trigraph_metric", "SET-TRIGRAPH-METRIC", 0, 1, false);
        declareFunction(me, "get_trigraph_table", "GET-TRIGRAPH-TABLE", 0, 0, false);
        declareFunction(me, "free_trigraph_table", "FREE-TRIGRAPH-TABLE", 1, 0, false);
        declareFunction(me, "plural_length_to_subtract", "PLURAL-LENGTH-TO-SUBTRACT", 1, 0, false);
        declareFunction(me, "update_string1_table", "UPDATE-STRING1-TABLE", 2, 0, false);
        declareFunction(me, "make_trigraph_integer_code", "MAKE-TRIGRAPH-INTEGER-CODE", 3, 0, false);
        declareFunction(me, "string_trigraph_match_p", "STRING-TRIGRAPH-MATCH-P", 2, 2, false);
        declareFunction(me, "stringify_terms", "STRINGIFY-TERMS", 1, 2, false);
        declareFunction(me, "fort_print_name", "FORT-PRINT-NAME", 1, 0, false);
        declareFunction(me, "stringify_items", "STRINGIFY-ITEMS", 1, 3, false);
        declareFunction(me, "str_by_type", "STR-BY-TYPE", 1, 0, false);
        declareFunction(me, "add_line", "ADD-LINE", 2, 2, false);
        declareFunction(me, "cyclify_status_print_function_trampoline", "CYCLIFY-STATUS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "cyclify_status_p", "CYCLIFY-STATUS-P", 1, 0, false);
        new string_utilities.$cyclify_status_p$UnaryFunction();
        declareFunction(me, "cyclify_status_out_string_list", "CYCLIFY-STATUS-OUT-STRING-LIST", 1, 0, false);
        declareFunction(me, "cyclify_status_references_added", "CYCLIFY-STATUS-REFERENCES-ADDED", 1, 0, false);
        declareFunction(me, "cyclify_status_inside_quoteP", "CYCLIFY-STATUS-INSIDE-QUOTE?", 1, 0, false);
        declareFunction(me, "cyclify_status_inside_el_var_nameP", "CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?", 1, 0, false);
        declareFunction(me, "cyclify_status_already_cyclifiedP", "CYCLIFY-STATUS-ALREADY-CYCLIFIED?", 1, 0, false);
        declareFunction(me, "cyclify_status_escapeP", "CYCLIFY-STATUS-ESCAPE?", 1, 0, false);
        declareFunction(me, "cyclify_status_inside_subl_quote_fnP", "CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?", 1, 0, false);
        declareFunction(me, "cyclify_status_inside_expand_subl_fnP", "CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?", 1, 0, false);
        declareFunction(me, "cyclify_status_inside_expand_subl_fn_arg1P", "CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?", 1, 0, false);
        declareFunction(me, "cyclify_status_inside_expand_subl_fn_arg2P", "CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?", 1, 0, false);
        declareFunction(me, "cyclify_status_immediately_following_parenP", "CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?", 1, 0, false);
        declareFunction(me, "cyclify_status_paren_count", "CYCLIFY-STATUS-PAREN-COUNT", 1, 0, false);
        declareFunction(me, "_csetf_cyclify_status_out_string_list", "_CSETF-CYCLIFY-STATUS-OUT-STRING-LIST", 2, 0, false);
        declareFunction(me, "_csetf_cyclify_status_references_added", "_CSETF-CYCLIFY-STATUS-REFERENCES-ADDED", 2, 0, false);
        declareFunction(me, "_csetf_cyclify_status_inside_quoteP", "_CSETF-CYCLIFY-STATUS-INSIDE-QUOTE?", 2, 0, false);
        declareFunction(me, "_csetf_cyclify_status_inside_el_var_nameP", "_CSETF-CYCLIFY-STATUS-INSIDE-EL-VAR-NAME?", 2, 0, false);
        declareFunction(me, "_csetf_cyclify_status_already_cyclifiedP", "_CSETF-CYCLIFY-STATUS-ALREADY-CYCLIFIED?", 2, 0, false);
        declareFunction(me, "_csetf_cyclify_status_escapeP", "_CSETF-CYCLIFY-STATUS-ESCAPE?", 2, 0, false);
        declareFunction(me, "_csetf_cyclify_status_inside_subl_quote_fnP", "_CSETF-CYCLIFY-STATUS-INSIDE-SUBL-QUOTE-FN?", 2, 0, false);
        declareFunction(me, "_csetf_cyclify_status_inside_expand_subl_fnP", "_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN?", 2, 0, false);
        declareFunction(me, "_csetf_cyclify_status_inside_expand_subl_fn_arg1P", "_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG1?", 2, 0, false);
        declareFunction(me, "_csetf_cyclify_status_inside_expand_subl_fn_arg2P", "_CSETF-CYCLIFY-STATUS-INSIDE-EXPAND-SUBL-FN-ARG2?", 2, 0, false);
        declareFunction(me, "_csetf_cyclify_status_immediately_following_parenP", "_CSETF-CYCLIFY-STATUS-IMMEDIATELY-FOLLOWING-PAREN?", 2, 0, false);
        declareFunction(me, "_csetf_cyclify_status_paren_count", "_CSETF-CYCLIFY-STATUS-PAREN-COUNT", 2, 0, false);
        declareFunction(me, "make_cyclify_status", "MAKE-CYCLIFY-STATUS", 0, 1, false);
        declareFunction(me, "visit_defstruct_cyclify_status", "VISIT-DEFSTRUCT-CYCLIFY-STATUS", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_cyclify_status_method", "VISIT-DEFSTRUCT-OBJECT-CYCLIFY-STATUS-METHOD", 2, 0, false);
        declareFunction(me, "cyclify_string_initialize_cyclify_status", "CYCLIFY-STRING-INITIALIZE-CYCLIFY-STATUS", 0, 0, false);
        declareFunction(me, "cyclify_string_possibly_cyclify_string", "CYCLIFY-STRING-POSSIBLY-CYCLIFY-STRING", 2, 0, false);
        declareFunction(me, "cyclify_string_not_inside_quote_and_not_escapedP", "CYCLIFY-STRING-NOT-INSIDE-QUOTE-AND-NOT-ESCAPED?", 1, 0, false);
        declareFunction(me, "cyclify_string_found_quoteP", "CYCLIFY-STRING-FOUND-QUOTE?", 2, 0, false);
        declareFunction(me, "cyclify_string_found_open_parenP", "CYCLIFY-STRING-FOUND-OPEN-PAREN?", 2, 0, false);
        declareFunction(me, "cyclify_string_found_close_parenP", "CYCLIFY-STRING-FOUND-CLOSE-PAREN?", 2, 0, false);
        declareFunction(me, "cyclify_string_add_to_out_string_list", "CYCLIFY-STRING-ADD-TO-OUT-STRING-LIST", 2, 0, false);
        declareFunction(me, "cyclify_string_check_for_escape_to_subl", "CYCLIFY-STRING-CHECK-FOR-ESCAPE-TO-SUBL", 2, 0, false);
        declareFunction(me, "cyclify_string_handle_last_valid_char", "CYCLIFY-STRING-HANDLE-LAST-VALID-CHAR", 3, 0, false);
        declareFunction(me, "cyclify_string_handle_open_paren_int", "CYCLIFY-STRING-HANDLE-OPEN-PAREN-INT", 1, 0, false);
        declareFunction(me, "cyclify_string_handle_close_paren_int", "CYCLIFY-STRING-HANDLE-CLOSE-PAREN-INT", 1, 0, false);
        declareFunction(me, "cyclify_string_handle_end_of_current_word", "CYCLIFY-STRING-HANDLE-END-OF-CURRENT-WORD", 5, 0, false);
        declareFunction(me, "cyclify_string", "CYCLIFY-STRING", 1, 0, false);
        declareFunction(me, "constant_names_in_string", "CONSTANT-NAMES-IN-STRING", 1, 1, false);
        declareFunction(me, "invalid_constant_names_in_string", "INVALID-CONSTANT-NAMES-IN-STRING", 1, 1, false);
        declareFunction(me, "invalid_constant_names_in_stringP", "INVALID-CONSTANT-NAMES-IN-STRING?", 1, 1, false);
        declareFunction(me, "nonbreak_char", "NONBREAK-CHAR", 1, 0, false);
        declareFunction(me, "read_string_until_char", "READ-STRING-UNTIL-CHAR", 2, 1, false);
        declareFunction(me, "align_char", "ALIGN-CHAR", 4, 1, false);
        declareFunction(me, "right_justify", "RIGHT-JUSTIFY", 2, 1, false);
        declareFunction(me, "left_justify", "LEFT-JUSTIFY", 2, 1, false);
        declareFunction(me, "center_string", "CENTER-STRING", 2, 1, false);
        declareFunction(me, "print_length", "PRINT-LENGTH", 1, 0, false);
        declareFunction(me, "tab", "TAB", 1, 4, false);
        declareFunction(me, "tabstr", "TABSTR", 1, 1, false);
        declareFunction(me, "reduce_whitespace", "REDUCE-WHITESPACE", 1, 0, false);
        declareFunction(me, "compute_reduced_length", "COMPUTE-REDUCED-LENGTH", 1, 0, false);
        declareFunction(me, "single_word_string_p", "SINGLE-WORD-STRING-P", 1, 0, false);
        declareFunction(me, "multi_word_string", "MULTI-WORD-STRING", 1, 0, false);
        declareFunction(me, "multi_word_quote", "MULTI-WORD-QUOTE", 1, 0, false);
        declareFunction(me, "process_file", "PROCESS-FILE", 3, 2, false);
        declareFunction(me, "princ_file_to_stream", "PRINC-FILE-TO-STREAM", 2, 2, false);
        declareFunction(me, "read_string_from_file", "READ-STRING-FROM-FILE", 1, 2, false);
        declareFunction(me, "uniquify_string", "UNIQUIFY-STRING", 2, 2, false);
        declareFunction(me, "uniquify_string_via_set", "UNIQUIFY-STRING-VIA-SET", 2, 1, false);
        declareFunction(me, "possibly_read_from_string_ignoring_errors", "POSSIBLY-READ-FROM-STRING-IGNORING-ERRORS", 2, 0, false);
        declareFunction(me, "random_string", "RANDOM-STRING", 1, 0, false);
        declareFunction(me, "alphacize", "ALPHACIZE", 1, 0, false);
        declareFunction(me, "alphanumericize", "ALPHANUMERICIZE", 1, 0, false);
        declareFunction(me, "alphanumeric_or_hyphen_p", "ALPHANUMERIC-OR-HYPHEN-P", 1, 0, false);
        declareFunction(me, "alpha_or_underscore_p", "ALPHA-OR-UNDERSCORE-P", 1, 0, false);
        declareFunction(me, "alphanumericize_admitting_hyphens", "ALPHANUMERICIZE-ADMITTING-HYPHENS", 1, 0, false);
        declareFunction(me, "alphanumeric_or_number_char_p", "ALPHANUMERIC-OR-NUMBER-CHAR-P", 1, 0, false);
        declareFunction(me, "nth_letter_of_alphabet", "NTH-LETTER-OF-ALPHABET", 1, 0, false);
        declareFunction(me, "nth_letter_of_alphabet_upcase", "NTH-LETTER-OF-ALPHABET-UPCASE", 1, 0, false);
        declareFunction(me, "keyword_from_string", "KEYWORD-FROM-STRING", 1, 0, false);
        declareFunction(me, "pretty_keyword_from_string", "PRETTY-KEYWORD-FROM-STRING", 1, 0, false);
        declareFunction(me, "non_alphanumeric_p", "NON-ALPHANUMERIC-P", 1, 0, false);
        declareFunction(me, "string_from_keyword", "STRING-FROM-KEYWORD", 1, 0, false);
        declareFunction(me, "keyword_impostor_p", "KEYWORD-IMPOSTOR-P", 1, 0, false);
        declareFunction(me, "keyword_from_impostor", "KEYWORD-FROM-IMPOSTOR", 1, 0, false);
        declareFunction(me, "coerce_to_keyword", "COERCE-TO-KEYWORD", 1, 0, false);
        declareFunction(me, "cfasl_compile_from_string", "CFASL-COMPILE-FROM-STRING", 1, 0, false);
        declareFunction(me, "weak_string_equal", "WEAK-STRING-EQUAL", 2, 0, false);
        declareFunction(me, "comma_separated_string", "COMMA-SEPARATED-STRING", 1, 0, false);
        declareFunction(me, "format_nil_test", "FORMAT-NIL-TEST", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_string_utilities_file() {
        defconstant("*POINT-CHAR*", CHAR_period);
        defconstant("*SPACE-CHAR*", CHAR_space);
        defconstant("*TAB-CHAR*", CHAR_tab);
        defconstant("*EMPTY-STRING*", $str0$);
        defconstant("*NEW-LINE-STRING*", Strings.make_string(ONE_INTEGER, CHAR_newline));
        defvar("*TEST-CHAR*", NIL);
        deflexical("*OBJECT-TO-STRING-CACHING-STATE*", NIL);
        defparameter("*CHAR-SET*", NIL);
        defconstant("*64-BIT-ENCODING-TABLE*", $list84);
        deflexical("*64-BIT-INTEGER-INDEX*", list_utilities.alist_to_hash_table($64_bit_encoding_table$.getGlobalValue(), symbol_function(EQL)));
        deflexical("*64-BIT-CHAR-INDEX*", list_utilities.alist_to_reverse_hash_table($64_bit_encoding_table$.getGlobalValue(), symbol_function(EQL)));
        deflexical("*RAW-WHITESPACE-CHARS*", $list88);
        deflexical("*WHITESPACE-CHARS*", delete_duplicates($raw_whitespace_chars$.getGlobalValue(), symbol_function(CHAR_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        deflexical("*GRAMMATICAL-PUNCTUATION-CHARS*", $list90);
        defparameter("*TARGET-CHARACTERS*", NIL);
        defparameter("*TRIGRAPH-METRIC*", $float$0_8);
        defparameter("*TRIGRAPH-TABLES*", NIL);
        defvar("*CYCLIFY-STRING-EXPAND-SUBL-FN-STRINGS*", $list126);
        defvar("*CYCLIFY-STRING-SUBL-QUOTE-FN-STRINGS*", $list127);
        defvar("*CYCLIFY-STRING-QUOTE-CHARS*", $list128);
        defconstant("*DTP-CYCLIFY-STATUS*", CYCLIFY_STATUS);
        defparameter("*STRING-READ-BUFFER-SIZE*", $int$1024);
        defparameter("*STRING-READ-BUFFER*", make_vector($string_read_buffer_size$.getDynamicValue(), CHAR_space));
        return NIL;
    }

    public static SubLObject setup_string_utilities_file() {
        memoization_state.note_globally_cached_function(OBJECT_TO_STRING);
        define_test_case_table_int(HTML_ESCAPED_STRING_P, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list43);
        define_test_case_table_int(ENDS_WITH_START_OF, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list47);
        define_obsolete_register($sym28$NON_EMPTY_STRING_, $list52);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cyclify_status$.getGlobalValue(), symbol_function(CYCLIFY_STATUS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list137);
        def_csetf(CYCLIFY_STATUS_OUT_STRING_LIST, _CSETF_CYCLIFY_STATUS_OUT_STRING_LIST);
        def_csetf(CYCLIFY_STATUS_REFERENCES_ADDED, _CSETF_CYCLIFY_STATUS_REFERENCES_ADDED);
        def_csetf($sym142$CYCLIFY_STATUS_INSIDE_QUOTE_, $sym143$_CSETF_CYCLIFY_STATUS_INSIDE_QUOTE_);
        def_csetf($sym144$CYCLIFY_STATUS_INSIDE_EL_VAR_NAME_, $sym145$_CSETF_CYCLIFY_STATUS_INSIDE_EL_VAR_NAME_);
        def_csetf($sym146$CYCLIFY_STATUS_ALREADY_CYCLIFIED_, $sym147$_CSETF_CYCLIFY_STATUS_ALREADY_CYCLIFIED_);
        def_csetf($sym148$CYCLIFY_STATUS_ESCAPE_, $sym149$_CSETF_CYCLIFY_STATUS_ESCAPE_);
        def_csetf($sym150$CYCLIFY_STATUS_INSIDE_SUBL_QUOTE_FN_, $sym151$_CSETF_CYCLIFY_STATUS_INSIDE_SUBL_QUOTE_FN_);
        def_csetf($sym152$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_, $sym153$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_);
        def_csetf($sym154$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG1_, $sym155$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG1_);
        def_csetf($sym156$CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG2_, $sym157$_CSETF_CYCLIFY_STATUS_INSIDE_EXPAND_SUBL_FN_ARG2_);
        def_csetf($sym158$CYCLIFY_STATUS_IMMEDIATELY_FOLLOWING_PAREN_, $sym159$_CSETF_CYCLIFY_STATUS_IMMEDIATELY_FOLLOWING_PAREN_);
        def_csetf(CYCLIFY_STATUS_PAREN_COUNT, _CSETF_CYCLIFY_STATUS_PAREN_COUNT);
        identity(CYCLIFY_STATUS);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cyclify_status$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CYCLIFY_STATUS_METHOD));
        register_external_symbol(CYCLIFY_STRING);
        define_test_case_table_int(CYCLIFY_STRING, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list211);
        define_test_case_table_int($sym212$SUBWORD_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list213);
        define_test_case_table_int(STRING_DOWNCASE_EXCEPT_ACRONYMS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list215);
        define_test_case_table_int(SPACE_DONT_UNCAPITALIZE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list217);
        define_test_case_table_int($sym218$QUOTED_STRING_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list219);
        define_test_case_table_int(CONCATENATE_ADJACENT_STRINGS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list221);
        define_test_case_table_int(FORMAT_NIL_TEST, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list223);
        define_test_case_table_int(HEX_INT_FROM_STRING, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list225);
        return NIL;
    }

    private static SubLObject _constant_215_initializer() {
        return list(new SubLObject[]{ list(list(makeString("organization Grants Franchises Of Type")), makeString("organization grants franchises of type")), list(list(makeString("identity Conditions For")), makeString("identity conditions for")), list(list(makeString("date Of Death")), makeString("date of death")), list(list(makeString("developer Of IBT Type")), makeString("developer of IBT type")), list(list(makeString("corresponding Cyc Collection")), makeString("corresponding cyc collection")), list(list(makeString("Inverse Binary Predicate Fn")), makeString("inverse binary predicate fn")), list(list(makeString("toxin Type Produced By Organism Type")), makeString("toxin type produced by organism type")), list(list(makeString("european Discovery By")), makeString("european discovery by")), list(list(makeString("construction Starting Date")), makeString("construction starting date")), list(list(makeString("highest Peak In This Group")), makeString("highest peak in this group")), list(list(makeString("uml Name")), makeString("uml name")), list(list(makeString("program Object Type Represents")), makeString("program object type represents")), list(list(makeString("higher Priority Template Type Immediate")), makeString("higher priority template type immediate")), list(list(makeString("subcat Frame Arity")), makeString("subcat frame arity")), list(list(makeString("field Studies")), makeString("field studies")), list(list(makeString("vulnerability Enables Attack")), makeString("vulnerability enables attack")), list(list(makeString("owl Defining Ontology URI")), makeString("owl defining ontology URI")), list(list(makeString("languages Spoken Here")), makeString("languages spoken here")), list(list(makeString("number Of Hostages Taken")), makeString("number of hostages taken")), list(list(makeString("lowercase Of Letter")), makeString("lowercase of letter")), list(list(makeString("condition Affects Part Type")), makeString("condition affects part type")), list(list(makeString("time Zone Offset To GMT")), makeString("time zone offset to GMT")), list(list(makeString("has Department Types")), makeString("has department types")), list(list(makeString("cyclist Primary Project")), makeString("cyclist primary project")), list(list(makeString("land Area Of Region")), makeString("land area of region")), list(list(makeString("comparative Degree")), makeString("comparative degree")), list(list(makeString("polity Has Transport Means")), makeString("polity has transport means")), list(list(makeString("file Format Has Suffix")), makeString("file format has suffix")), list(list(makeString("drug Of Choice Administered For")), makeString("drug of choice administered for")), list(list(makeString("task Status")), makeString("task status")), list(list(makeString("principal Landmarks Of City")), makeString("principal landmarks of city")), list(list(makeString("infinitive")), makeString("infinitive")), list(list(makeString("performs Acts Of Type")), makeString("performs acts of type")), list(list(makeString("geographical Sub Regions Of Country")), makeString("geographical sub regions of country")), list(list(makeString("television Actors")), makeString("television actors")), list(list(makeString("character Set For Writing System")), makeString("character set for writing system")), list(list(makeString("international Organization Member Countries")), makeString("international organization member countries")), list(list(makeString("builder Query For Template")), makeString("builder query for template")), list(list(makeString("alter Ego Of Hero")), makeString("alter ego of hero")), list(list(makeString("animal Type Makes Sound Type")), makeString("animal type makes sound type")), list(list(makeString("main Color Of Object")), makeString("main color of object")), list(list(makeString("antisymmetric On")), makeString("antisymmetric on")), list(list(makeString("lexical Word Type For Language")), makeString("lexical word type for language")), list(list(makeString("drainage Area")), makeString("drainage area")), list(list(makeString("source Node In System")), makeString("source node in system")), list(list(makeString("complete Extent Enumerable For Arg")), makeString("complete extent enumerable for arg")), list(list(makeString("morphologically Derived From")), makeString("morphologically derived from")), list(list(makeString("cw Series Type")), makeString("cw series type")), list(list(makeString("program Typically Installed With")), makeString("program typically installed with")), list(list(makeString("test Collection Project Responsible")), makeString("test collection project responsible")), list(list(makeString("infection Type Has Vector Type")), makeString("infection type has vector type")), list(list(makeString("state Of Address")), makeString("state of address")), list(list(makeString("default Specialized Type")), makeString("default specialized type")), list(list(makeString("agent Type Provides Service Of Type")), makeString("agent type provides service of type")), list(list(makeString("discovered By Europeans When")), makeString("discovered by europeans when")), list(list(makeString("project Of Department")), makeString("project of department")), list(list(makeString("director Organizational Role")), makeString("director organizational role")), list(list(makeString("regulates Activity Type")), makeString("regulates activity type")), list(list(makeString("task Scheduler Task Date Pattern")), makeString("task scheduler task date pattern")), list(list(makeString("computer MAC Address")), makeString("computer MAC address")), list(list(makeString("derivational Affix Base POS")), makeString("derivational affix base POS")), list(list(makeString("software Designed For Architecture")), makeString("software designed for architecture")), list(list(makeString("region Produces")), makeString("region produces")), list(list(makeString("source Used For Task")), makeString("source used for task")), list(list(makeString("social Quantity Type Expressed By Ins Of Event Type")), makeString("social quantity type expressed by ins of event type")), list(list(makeString("software Parameter Set In Software Object")), makeString("software parameter set in software object")), list(list(makeString("expression Type For Tag")), makeString("expression type for tag")), list(list(makeString("performances Of Work Are")), makeString("performances of work are")), list(list(makeString("bugzilla Bug Report Assigned To")), makeString("bugzilla bug report assigned to")), list(list(makeString("derived Using Prefix")), makeString("derived using prefix")), list(list(makeString("capital City Of State")), makeString("capital city of state")), list(list(makeString("net Migration Rate")), makeString("net migration rate")), list(list(makeString("faces Direction")), makeString("faces direction")), list(list(makeString("program Source Code Written In")), makeString("program source code written in")), list(list(makeString("top In Thesaurus")), makeString("top in thesaurus")), list(list(makeString("important Company")), makeString("important company")), list(list(makeString("clump Syntax List")), makeString("clump syntax list")), list(list(makeString("corresponding KE Interaction Resource")), makeString("corresponding KE interaction resource")), list(list(makeString("former Occupation")), makeString("former occupation")), list(list(makeString("min Quant Value")), makeString("min quant value")), list(list(makeString("ke Genls Induced Weak Suggestion Preds")), makeString("ke genls induced weak suggestion preds")), list(list(makeString("binary Role Type Pred")), makeString("binary role type pred")), list(list(makeString("hour Of Day Index 24 Hour")), makeString("hour of day index 24 hour")), list(list(makeString("type Genl Mt")), makeString("type genl mt")), list(list(makeString("reads Language")), makeString("reads language")), list(list(makeString("empties Into")), makeString("empties into")), list(list(makeString("transport Facility For Type")), makeString("transport facility for type")), list(list(makeString("sem Trans Arg")), makeString("sem trans arg")), list(list(makeString("venture Company")), makeString("venture company")), list(list(makeString("preserves Genls In Arg")), makeString("preserves genls in arg")), list(list(makeString("venture Member")), makeString("venture member")), list(list(makeString("inter Arg Reln 3 2")), makeString("inter arg reln 3 2")), list(list(makeString("base Form")), makeString("base form")), list(list(makeString("first Publication Date CW")), makeString("first publication date CW")), list(list(makeString("number Type Interval Type")), makeString("number type interval type")), list(list(makeString("event Type Implemented By Program Function")), makeString("event type implemented by program function")), list(list(makeString("main Languages Of GPE")), makeString("main languages of GPE")), list(list(makeString("geographical Sub Regions Of State")), makeString("geographical sub regions of state")), list(list(makeString("fan Out Arg")), makeString("fan out arg")), list(list(makeString("sks Schema Translation Mt")), makeString("sks schema translation mt")), list(list(makeString("sub Topic Query Better Words")), makeString("sub topic query better words")), list(list(makeString("succeeding Value Of Munsell Hue")), makeString("succeeding value of munsell hue")), list(list(makeString("runs OS")), makeString("runs OS")), list(list(makeString("works Found In Structure")), makeString("works found in structure")), list(list(makeString("highest Point In Region")), makeString("highest point in region")), list(list(makeString("facet Based On Binary Pred Inverse")), makeString("facet based on binary pred inverse")), list(list(makeString("independent Arg")), makeString("independent arg")), list(list(makeString("node In LAN")), makeString("node in LAN")), list(list(makeString("field Fosters Advanced Artifacts Of Type")), makeString("field fosters advanced artifacts of type")), list(list(makeString("local Chief In Organization")), makeString("local chief in organization")), list(list(makeString("role With Event Type Entails Some Time In Time Index")), makeString("role with event type entails some time in time index")), list(list(makeString("occurs During")), makeString("occurs during")), list(list(makeString("pathogen Type Causes Infection Type")), makeString("pathogen type causes infection type")), list(list(makeString("prefix String")), makeString("prefix string")), list(list(makeString("covering")), makeString("covering")), list(list(makeString("microtheory Designation Argnum")), makeString("microtheory designation argnum")), list(list(makeString("other Common Language Here")), makeString("other common language here")), list(list(makeString("not Equipment Of Unit Type")), makeString("not equipment of unit type")), list(list(makeString("nc Rule Constraint")), makeString("nc rule constraint")), list(list(makeString("holy Site")), makeString("holy site")), list(list(makeString("subcat Frame Example")), makeString("subcat frame example")), list(list(makeString("music Type Is Of Genre")), makeString("music type is of genre")), list(list(makeString("contains Programs")), makeString("contains programs")), list(list(makeString("account Name")), makeString("account name")), list(list(makeString("network Knowledge Predicate For Cyc Secure Component")), makeString("network knowledge predicate for cyc secure component")), list(list(makeString("common Nickname")), makeString("common nickname")), list(list(makeString("within Range Of Fire")), makeString("within range of fire")), list(list(makeString("controlling Suborganizations")), makeString("controlling suborganizations")), list(list(makeString("constrains Arg")), makeString("constrains arg")), list(list(makeString("slots Additive")), makeString("slots additive")), list(list(makeString("moves In Direction Average")), makeString("moves in direction average")), list(list(makeString("temporally Intersects Type Type")), makeString("temporally intersects type type")), list(list(makeString("quantity Ordered Quantity Type")), makeString("quantity ordered quantity type")), list(list(makeString("country Of Nationality")), makeString("country of nationality")), list(list(makeString("assignment Rough Duration")), makeString("assignment rough duration")), list(list(makeString("sources For Topic")), makeString("sources for topic")), list(list(makeString("predicates SBHL Path Marking Function Type")), makeString("predicates SBHL path marking function type")), list(list(makeString("task Scheduler Task Time Pattern")), makeString("task scheduler task time pattern")), list(list(makeString("criterial For Terrain Tactical Role Negative")), makeString("criterial for terrain tactical role negative")), list(list(makeString("parser Test Target")), makeString("parser test target")), list(list(makeString("affix Semantics")), makeString("affix semantics")), list(list(makeString("context Of PCW")), makeString("context of PCW")), list(list(makeString("fault Vulnerability OS")), makeString("fault vulnerability OS")), list(list(makeString("sub Topic Print String")), makeString("sub topic print string")), list(list(makeString("common Language")), makeString("common language")), list(list(makeString("divisor Type For Quantity Type")), makeString("divisor type for quantity type")), list(list(makeString("average Precipitation")), makeString("average precipitation")), list(list(makeString("predicate SBHL Transfers Via Arg")), makeString("predicate SBHL transfers via arg")), list(list(makeString("task Scheduler Task User")), makeString("task scheduler task user")), list(list(makeString("use For")), makeString("use for")), list(list(makeString("industry Facilities")), makeString("industry facilities")), list(list(makeString("predicate SBHL Transfers Through Module")), makeString("predicate SBHL transfers through module")), list(list(makeString("period Of Time Interval Series")), makeString("period of time interval series")), list(list(makeString("ke Weak Suggestion")), makeString("ke weak suggestion")), list(list(makeString("spatially Disjoint")), makeString("spatially disjoint")), list(list(makeString("bugzilla Bug For Product")), makeString("bugzilla bug for product")), list(list(makeString("task Advisor")), makeString("task advisor")), list(list(makeString("body Parts Used Type Type")), makeString("body parts used type type")), list(list(makeString("task Reviewer")), makeString("task reviewer")), list(list(makeString("cn: Is A")), makeString("cn: is A")), list(list(makeString("most")), makeString("most")), list(list(makeString("organization Type Members Active In Field")), makeString("organization type members active in field")), list(list(makeString("maximum Depth")), makeString("maximum depth")), list(list(makeString("ft Deducible From")), makeString("ft deducible from")), list(list(makeString("domain Knowledge Predicate For Cyc Secure Component")), makeString("domain knowledge predicate for cyc secure component")), list(list(makeString("inter Arg Reln 3 1")), makeString("inter arg reln 3 1")), list(list(makeString("addicted To")), makeString("addicted to")), list(list(makeString("provenance Of Media Series Product")), makeString("provenance of media series product")), list(list(makeString("common Genl Preds")), makeString("common genl preds")), list(list(makeString("subcat Frame Head Keyword")), makeString("subcat frame head keyword")), list(list(makeString("government")), makeString("government")), list(list(makeString("native Language")), makeString("native language")), list(list(makeString("granule Of Spatial Stuff")), makeString("granule of spatial stuff")), list(list(makeString("program Type Strings")), makeString("program type strings")), list(list(makeString("cbl Relationship Has Keyword")), makeString("cbl relationship has keyword")), list(list(makeString("sub Event Types")), makeString("sub event types")), list(list(makeString("requires Operating System")), makeString("requires operating system")), list(list(makeString("bio For Proposalshort")), makeString("bio for proposalshort")), list(list(makeString("superlative Degree")), makeString("superlative degree")), list(list(makeString("geographical Sub Regions Of Body Of Water")), makeString("geographical sub regions of body of water")), list(list(makeString("last Proper Sub Event Types")), makeString("last proper sub event types")), list(list(makeString("test Collection For Knowledge Source")), makeString("test collection for knowledge source")), list(list(makeString("role Types For Event Type")), makeString("role types for event type")), list(list(makeString("facet Based On Type Binary Pred Inverse")), makeString("facet based on type binary pred inverse")), list(list(makeString("inter Arg Reln 1 4")), makeString("inter arg reln 1 4")), list(list(makeString("software Parameter Domain")), makeString("software parameter domain")), list(list(makeString("prototypical Activity Type Of Person Type")), makeString("prototypical activity type of person type")), list(list(makeString("program Function Identifier")), makeString("program function identifier")), list(list(makeString("pn Mass Number")), makeString("pn mass number")), list(list(makeString("authentication Source For")), makeString("authentication source for")), list(list(makeString("string Skipped")), makeString("string skipped")), list(list(makeString("program Installed With Package")), makeString("program installed with package")), list(list(makeString("characteristic Activity Type Of Person Type")), makeString("characteristic activity type of person type")), list(list(makeString("biological Weapon Type Basis Type")), makeString("biological weapon type basis type")), list(list(makeString("owl URI")), makeString("owl URI")), list(list(makeString("immediate Precursors Chemical")), makeString("immediate precursors chemical")), list(list(makeString("performance Of Work")), makeString("performance of work")), list(list(makeString("language Prompt For UIA")), makeString("language prompt for UIA")), list(list(makeString("issuer Of CW")), makeString("issuer of CW")), list(list(makeString("genl Works")), makeString("genl works")), list(list(makeString("sub Time Slice Type")), makeString("sub time slice type")), list(list(makeString("product Type Licensed For Treatment Of")), makeString("product type licensed for treatment of")), list(list(makeString("date Of Invention")), makeString("date of invention")), list(list(makeString("agent Type Employed By Org Type")), makeString("agent type employed by org type")), list(list(makeString("constant Copied From")), makeString("constant copied from")), list(list(makeString("negation Quantities")), makeString("negation quantities")), list(list(makeString("based In Region")), makeString("based in region")), list(list(makeString("originally From Region")), makeString("originally from region")), list(list(makeString("genl Programs")), makeString("genl programs")), list(list(makeString("average Discharge")), makeString("average discharge")), list(list(makeString("program Calls Program")), makeString("program calls program")), list(list(makeString("chief Ports")), makeString("chief ports")), list(list(makeString("named After")), makeString("named after")), list(list(makeString("validation Required On Template Position")), makeString("validation required on template position")), list(list(makeString("population Growth Rate")), makeString("population growth rate")), list(list(makeString("test Collection Cyclist Responsible")), makeString("test collection cyclist responsible")), list(list(makeString("file Configures Software")), makeString("file configures software")), list(list(makeString("policy Type Protects Against")), makeString("policy type protects against")), list(list(makeString("arity Max")), makeString("arity max")), list(list(makeString("characteristic Activity Type Of Person Type At Least Once")), makeString("characteristic activity type of person type at least once")), list(list(makeString("developed Product Type")), makeString("developed product type")), list(list(makeString("spans-Bridgelike")), makeString("spans-bridgelike")), list(list(makeString("inter Arg Reln 3 4")), makeString("inter arg reln 3 4")), list(list(makeString("major Religions")), makeString("major religions")), list(list(makeString("candidate Proper Sub Situation Types")), makeString("candidate proper sub situation types")), list(list(makeString("nc Rule Template")), makeString("nc rule template")), list(list(makeString("template Type For Focal Term Type")), makeString("template type for focal term type")), list(list(makeString("regular Degree")), makeString("regular degree")), list(list(makeString("studies")), makeString("studies")), list(list(makeString("cn: Used For")), makeString("cn: used for")), list(list(makeString("software Update Download Link")), makeString("software update download link")), list(list(makeString("unit Type Dimensional Analysis")), makeString("unit type dimensional analysis")), list(list(makeString("school Symbol Name Female")), makeString("school symbol name female")), list(list(makeString("assert Mt For Formula Template")), makeString("assert mt for formula template")), list(list(makeString("query Mt For Topic Assertions")), makeString("query mt for topic assertions")), list(list(makeString("symmetric Physical Part Types")), makeString("symmetric physical part types")), list(list(makeString("predicates SBHL Path Terminating Mark Function")), makeString("predicates SBHL path terminating mark function")), list(list(makeString("construction Existential State")), makeString("construction existential state")), list(list(makeString("event Type Uses Device Type")), makeString("event type uses device type")), list(list(makeString("generate Arg With Outside Scope")), makeString("generate arg with outside scope")), list(list(makeString("noun Learner Sense Gloss")), makeString("noun learner sense gloss")), list(list(makeString("vehicle Load Class")), makeString("vehicle load class")), list(list(makeString("data Type Exploited By")), makeString("data type exploited by")), list(list(makeString("topic Of Database")), makeString("topic of database")), list(list(makeString("syntactic Node Category")), makeString("syntactic node category")), list(list(makeString("software Object Uses Library")), makeString("software object uses library")), list(list(makeString("template Topic Genls")), makeString("template topic genls")), list(list(makeString("typical Armament Of Unit Type")), makeString("typical armament of unit type")), list(list(makeString("greater Than")), makeString("greater than")), list(list(makeString("cn: Property Of")), makeString("cn: property of")), list(list(makeString("filter Collections")), makeString("filter collections")), list(list(makeString("has What As Boundary")), makeString("has what as boundary")), list(list(makeString("terrain Climate Type")), makeString("terrain climate type")), list(list(makeString("software Parameter Has Type")), makeString("software parameter has type")), list(list(makeString("TNT Equivalent Type")), makeString("TNT equivalent type")), list(list(makeString("unit Type Uses Tactical Object Type")), makeString("unit type uses tactical object type")), list(list(makeString("coa Supporting Task")), makeString("coa supporting task")), list(list(makeString("classification Of Report")), makeString("classification of report")), list(list(makeString("street Of Address")), makeString("street of address")), list(list(makeString("formula Template Type Has Topic Type")), makeString("formula template type has topic type")), list(list(makeString("web Site URL")), makeString("web site URL")), list(list(makeString("RAM Size")), makeString("RAM size")), list(list(makeString("senior Executives")), makeString("senior executives")), list(list(makeString("tm Inverse Symbol")), makeString("tm inverse symbol")), list(list(makeString("major City In State")), makeString("major city in state")), list(list(makeString("derivational Affix Result POS")), makeString("derivational affix result POS")), list(list(makeString("employee Status")), makeString("employee status")), list(list(makeString("denotatum Arg")), makeString("denotatum arg")), list(list(makeString("program Implements Protocol")), makeString("program implements protocol")), list(list(makeString("water Area Of Region")), makeString("water area of region")), list(list(makeString("to-Generic")), makeString("to-generic")), list(list(makeString("ke Strong Suggestion Inverse")), makeString("ke strong suggestion inverse")), list(list(makeString("duration Of Type")), makeString("duration of type")), list(list(makeString("test Derived From")), makeString("test derived from")), list(list(makeString("infant Mortality Rate")), makeString("infant mortality rate")), list(list(makeString("type Launches Projectile Type")), makeString("type launches projectile type")), list(list(makeString("national Budget Revenues")), makeString("national budget revenues")), list(list(makeString("max Quant Value")), makeString("max quant value")), list(list(makeString("taxon Members")), makeString("taxon members")), list(list(makeString("national Budget Expenditures")), makeString("national budget expenditures")), list(list(makeString("predicates Cyc L Initialization Module")), makeString("predicates cyc l initialization module")), list(list(makeString("natural Hazards In Region")), makeString("natural hazards in region")), list(list(makeString("linked")), makeString("linked")), list(list(makeString("position In Formula Template Is Replaceable")), makeString("position in formula template is replaceable")), list(list(makeString("mass Number")), makeString("mass number")), list(list(makeString("device Type Used")), makeString("device type used")), list(list(makeString("river End Topography")), makeString("river end topography")), list(list(makeString("object Has Color")), makeString("object has color")), list(list(makeString("regular Adverb")), makeString("regular adverb")), list(list(makeString("condition Affects Org Type")), makeString("condition affects org type")), list(list(makeString("nc Rule Tests")), makeString("nc rule tests")), list(list(makeString("sentence Designation Argnum")), makeString("sentence designation argnum")), list(list(makeString("regulates Object Type")), makeString("regulates object type")), list(list(makeString("consider Specializing")), makeString("consider specializing")), list(list(makeString("genl Mod Features")), makeString("genl mod features")), list(list(makeString("fields Of Competence")), makeString("fields of competence")), list(list(makeString("policy Type Covers Types")), makeString("policy type covers types")), list(list(makeString("topic Of Clump")), makeString("topic of clump")), list(list(makeString("device Type Manipulates")), makeString("device type manipulates")), list(list(makeString("predicate SBHL Index Arg")), makeString("predicate SBHL index arg")), list(list(makeString("sub Information")), makeString("sub information")), list(list(makeString("derived Conceptual Work")), makeString("derived conceptual work")), list(list(makeString("tm Superset")), makeString("tm superset")), list(list(makeString("glf Label For Arcs Based On Expanded Pred")), makeString("glf label for arcs based on expanded pred")), list(list(makeString("source Of Term Person")), makeString("source of term person")), list(list(makeString("orbits")), makeString("orbits")), list(list(makeString("literacy Rate")), makeString("literacy rate")), list(list(makeString("test Type Folder")), makeString("test type folder")), list(list(makeString("suffix String")), makeString("suffix string")), list(list(makeString("has Award")), makeString("has award")), list(list(makeString("topic Of Belief System")), makeString("topic of belief system")), list(list(makeString("sks Physical Schema Description Mt")), makeString("sks physical schema description mt")), list(list(makeString("program Function Operator")), makeString("program function operator")), list(list(makeString("commercially Useful Part Types")), makeString("commercially useful part types")), list(list(makeString("perpendicular Vectors")), makeString("perpendicular vectors")), list(list(makeString("sticks Into 2 D")), makeString("sticks into 2 D")), list(list(makeString("perfect")), makeString("perfect")), list(list(makeString("compass Value Of Direction")), makeString("compass value of direction")), list(list(makeString("bug Causes Bad Paraphrase In Query Library")), makeString("bug causes bad paraphrase in query library")), list(list(makeString("organism Type Existential Threat State")), makeString("organism type existential threat state")), list(list(makeString("correlated Color")), makeString("correlated color")), list(list(makeString("notable Peaks In This Group")), makeString("notable peaks in this group")), list(list(makeString("form Of Disease")), makeString("form of disease")), list(list(makeString("formula Template Has Type")), makeString("formula template has type")), list(list(makeString("starts During")), makeString("starts during")), list(list(makeString("altitude Of Lowest Point Is")), makeString("altitude of lowest point is")), list(list(makeString("where River Starts")), makeString("where river starts")), list(list(makeString("maximum Duration Of Type")), makeString("maximum duration of type")), list(list(makeString("embedded Region")), makeString("embedded region")), list(list(makeString("controls")), makeString("controls")), list(list(makeString("standard Equipment Of Unit Type")), makeString("standard equipment of unit type")), list(list(makeString("agent Supports Agent Generic")), makeString("agent supports agent generic")), list(list(makeString("arg 5 Format")), makeString("arg 5 format")), list(list(makeString("sub Industry Types")), makeString("sub industry types")), list(list(makeString("school Type Attended")), makeString("school type attended")), list(list(makeString("has Portal To Region")), makeString("has portal to region")), list(list(makeString("predicates SBHL Path Unmarking Function Type")), makeString("predicates SBHL path unmarking function type")), list(list(makeString("sks Source Description Mt")), makeString("sks source description mt")), list(list(makeString("serves Cuisine")), makeString("serves cuisine")), list(list(makeString("arg 5 Genl")), makeString("arg 5 genl")), list(list(makeString("key Participants")), makeString("key participants")), list(list(makeString("purpose Of Event Type Sit Type")), makeString("purpose of event type sit type")), list(list(makeString("has Headquarters In Country")), makeString("has headquarters in country")), list(list(makeString("local E Mail Address Text")), makeString("local e mail address text")), list(list(makeString("opposite Collections")), makeString("opposite collections")), list(list(makeString("sem Trans Pred For POS")), makeString("sem trans pred for POS")), list(list(makeString("project Source Fact Entry")), makeString("project source fact entry")), list(list(makeString("type Measures Quantity")), makeString("type measures quantity")), list(list(makeString("intersection Type")), makeString("intersection type")), list(list(makeString("arity Min")), makeString("arity min")), list(list(makeString("facet Based On Binary Pred")), makeString("facet based on binary pred")), list(list(makeString("computer IP")), makeString("computer IP")), list(list(makeString("has Zodiac Sign")), makeString("has zodiac sign")), list(list(makeString("link In System")), makeString("link in system")), list(list(makeString("strictly Functional In Args")), makeString("strictly functional in args")), list(list(makeString("has Personality")), makeString("has personality")), list(list(makeString("html Tag Symbol")), makeString("html tag symbol")), list(list(makeString("bugzilla Bug Report Reporter")), makeString("bugzilla bug report reporter")), list(list(makeString("bug Blocks Query")), makeString("bug blocks query")), list(list(makeString("adjective Of Country")), makeString("adjective of country")), list(list(makeString("unique ID For Type")), makeString("unique ID for type")), list(list(makeString("education Level")), makeString("education level")), list(list(makeString("city In State")), makeString("city in state")), list(list(makeString("bug Causes Spurious Proof")), makeString("bug causes spurious proof")), list(list(makeString("ft Deducible From Dual")), makeString("ft deducible from dual")), list(list(makeString("exclude Replacement Option For Formula Template")), makeString("exclude replacement option for formula template")), list(list(makeString("typical Color Of Type")), makeString("typical color of type")), list(list(makeString("predicates Property Type Of Arg 1")), makeString("predicates property type of arg 1")), list(list(makeString("terrain Type")), makeString("terrain type")), list(list(makeString("proper Physical Part Types")), makeString("proper physical part types")), list(list(makeString("task Type Requires Resource Type")), makeString("task type requires resource type")), list(list(makeString("vaccine Effective Against Microorg Type")), makeString("vaccine effective against microorg type")), list(list(makeString("area This Language Native To")), makeString("area this language native to")), list(list(makeString("has Office")), makeString("has office")), list(list(makeString("dialects")), makeString("dialects")), list(list(makeString("el Inverse")), makeString("el inverse")), list(list(makeString("node In System")), makeString("node in system")), list(list(makeString("performed By Part")), makeString("performed by part")), list(list(makeString("past Tense Universal")), makeString("past tense universal")), list(list(makeString("precondition For Events")), makeString("precondition for events")), list(list(makeString("device Types Commonly Used Together")), makeString("device types commonly used together")), list(list(makeString("agent Type Performs Work Of Type")), makeString("agent type performs work of type")), list(list(makeString("runs Under OS")), makeString("runs under OS")), list(list(makeString("located At Point Surface Geographical")), makeString("located at point surface geographical")), list(list(makeString("population Of Region")), makeString("population of region")), list(list(makeString("cn: Thematic K Line")), makeString("cn: thematic k line")), list(list(makeString("standard Vehicle Of Unit Type")), makeString("standard vehicle of unit type")), list(list(makeString("genl KB Content Tests")), makeString("genl KB content tests")), list(list(makeString("basic Speech Part Pred")), makeString("basic speech part pred")), list(list(makeString("industry Produces Type")), makeString("industry produces type")), list(list(makeString("has Rights Over")), makeString("has rights over")), list(list(makeString("type Used With Cyc Module")), makeString("type used with cyc module")), list(list(makeString("tm Symbol")), makeString("tm symbol")), list(list(makeString("head Of State Of")), makeString("head of state of")), list(list(makeString("post Events")), makeString("post events")), list(list(makeString("causes Sit Type Sit Type")), makeString("causes sit type sit type")), list(list(makeString("focal Term Introduction")), makeString("focal term introduction")), list(list(makeString("title Of Person String")), makeString("title of person string")), list(list(makeString("stufflike WRT Pred")), makeString("stufflike WRT pred")), list(list(makeString("requesting Agent")), makeString("requesting agent")), list(list(makeString("template Replacements Invisible For Position")), makeString("template replacements invisible for position")), list(list(makeString("proper Sub Events")), makeString("proper sub events")), list(list(makeString("temporally Intrinsic Arg")), makeString("temporally intrinsic arg")), list(list(makeString("string Length")), makeString("string length")), list(list(makeString("org Type Facility Type")), makeString("org type facility type")), list(list(makeString("person Hair Color")), makeString("person hair color")), list(list(makeString("national Language")), makeString("national language")), list(list(makeString("reflexive On")), makeString("reflexive on")), list(list(makeString("city Of Address")), makeString("city of address")), list(list(makeString("preferred Name String")), makeString("preferred name string")), list(list(makeString("next Higher Order")), makeString("next higher order")), list(list(makeString("pos Of Phrase Type")), makeString("pos of phrase type")), list(list(makeString("primary Activity Type Of Location")), makeString("primary activity type of location")), list(list(makeString("arg 4 Format")), makeString("arg 4 format")), list(list(makeString("where River Ends")), makeString("where river ends")), list(list(makeString("inhabitant Types")), makeString("inhabitant types")), list(list(makeString("plural")), makeString("plural")), list(list(makeString("inter Arg Reln 2 1")), makeString("inter arg reln 2 1")), list(list(makeString("office In Country")), makeString("office in country")), list(list(makeString("pos For Template Category")), makeString("pos for template category")), list(list(makeString("salient URL")), makeString("salient URL")), list(list(makeString("predicates Cyc L Module Type")), makeString("predicates cyc l module type")), list(list(makeString("suffrage Age")), makeString("suffrage age")), list(list(makeString("report Time")), makeString("report time")), list(list(makeString("sub Topic Ordered Query Words")), makeString("sub topic ordered query words")), list(list(makeString("computer Speed")), makeString("computer speed")), list(list(makeString("founding Date")), makeString("founding date")), list(list(makeString("task Scheduler Task Expression")), makeString("task scheduler task expression")), list(list(makeString("regional Telephone Area Code")), makeString("regional telephone area code")), list(list(makeString("sub Topic Query Restrict Clause")), makeString("sub topic query restrict clause")), list(list(makeString("hobby CW Performed By")), makeString("hobby CW performed by")), list(list(makeString("date Of Publication CW")), makeString("date of publication CW")), list(list(makeString("sks Logical Schema Description Mt")), makeString("sks logical schema description mt")), list(list(makeString("room Faces")), makeString("room faces")), list(list(makeString("has Status With Organization")), makeString("has status with organization")), list(list(makeString("place Joined Jihad")), makeString("place joined jihad")), list(list(makeString("program Author")), makeString("program author")), list(list(makeString("typical Location Of Type")), makeString("typical location of type")), list(list(makeString("from-Generic")), makeString("from-generic")), list(list(makeString("standard Unit")), makeString("standard unit")), list(list(makeString("ke Genls Induced Strong Suggestion Preds")), makeString("ke genls induced strong suggestion preds")), list(list(makeString("predicates Cyc L Graph Type")), makeString("predicates cyc l graph type")), list(list(makeString("task Type Uses Tactical Object Type")), makeString("task type uses tactical object type")), list(list(makeString("negative Vested Interest")), makeString("negative vested interest")), list(list(makeString("required Actor Slots")), makeString("required actor slots")), list(list(makeString("parasite Causes Ailment Condition")), makeString("parasite causes ailment condition")), list(list(makeString("closed Under")), makeString("closed under")), list(list(makeString("incorporated In")), makeString("incorporated in")), list(list(makeString("place Of Death")), makeString("place of death")), list(list(makeString("order Of Collection")), makeString("order of collection")), list(list(makeString("account Logged In On")), makeString("account logged in on")), list(list(makeString("holds In")), makeString("holds in")), list(list(makeString("holiday Celebrated In Polity")), makeString("holiday celebrated in polity")), list(list(makeString("ke Strong Suggestion Preds")), makeString("ke strong suggestion preds")), list(list(makeString("contains Modules")), makeString("contains modules")), list(list(makeString("target Posture")), makeString("target posture")), list(list(makeString("spatially Intersects")), makeString("spatially intersects")), list(list(makeString("inter Arg Reln 2 3")), makeString("inter arg reln 2 3")), list(list(makeString("total Merchant Marine Mass")), makeString("total merchant marine mass")), list(list(makeString("region Lacks Transport Means")), makeString("region lacks transport means")), list(list(makeString("task Uses Contributions Of")), makeString("task uses contributions of")), list(list(makeString("holds Sometime During")), makeString("holds sometime during")), list(list(makeString("affiliated Organizations")), makeString("affiliated organizations")), list(list(makeString("succeeding Interval Type")), makeString("succeeding interval type")), list(list(makeString("quantity Subsumes")), makeString("quantity subsumes")), list(list(makeString("glf Node Semantics Underspecified")), makeString("glf node semantics underspecified")), list(list(makeString("worn With Garment Type")), makeString("worn with garment type")), list(list(makeString("present In Region")), makeString("present in region")), list(list(makeString("participant In")), makeString("participant in")), list(list(makeString("gun Takes Ammunition")), makeString("gun takes ammunition")), list(list(makeString("multiplier Type For Quantity Type")), makeString("multiplier type for quantity type")), list(list(makeString("pos Pred For Template Category")), makeString("pos pred for template category")), list(list(makeString("style Of Music Performer")), makeString("style of music performer")), list(list(makeString("capital City")), makeString("capital city")), list(list(makeString("task Type Commensurate With Op Type")), makeString("task type commensurate with op type")), list(list(makeString("chemical CAS Registry")), makeString("chemical CAS registry")), list(list(makeString("type Associated Payment Plan")), makeString("type associated payment plan")), list(list(makeString("color Has Brightness")), makeString("color has brightness")), list(list(makeString("urge Type Satisfied")), makeString("urge type satisfied")), list(list(makeString("partitioned Into Spec Preds")), makeString("partitioned into spec preds")), list(list(makeString("type Ingredient Types")), makeString("type ingredient types")), list(list(makeString("singular")), makeString("singular")), list(list(makeString("movie Actors")), makeString("movie actors")), list(list(makeString("physical Extent")), makeString("physical extent")), list(list(makeString("version Of Product Brand")), makeString("version of product brand")), list(list(makeString("age Of Agent When Joined Jihad")), makeString("age of agent when joined jihad")), list(list(makeString("ins Marketed As")), makeString("ins marketed as")), list(list(makeString("contemporary In Arg")), makeString("contemporary in arg")), list(list(makeString("predominant Language")), makeString("predominant language")), list(list(makeString("fault Vulnerability Installed")), makeString("fault vulnerability installed")), list(list(makeString("sole Maker Of Product Type")), makeString("sole maker of product type")), list(list(makeString("orthography")), makeString("orthography")), list(list(makeString("inherit All Role Players Sit Type To Sub Sit Type")), makeString("inherit all role players sit type to sub sit type")), list(list(makeString("significant Event Acquaintance")), makeString("significant event acquaintance")), list(list(makeString("penn Tag For Pred")), makeString("penn tag for pred")), list(list(makeString("sub Works")), makeString("sub works")), list(list(makeString("program Running On")), makeString("program running on")), list(list(makeString("ks Term String")), makeString("ks term string")), list(list(makeString("arg 4 Genl")), makeString("arg 4 genl")), list(list(makeString("fields Of Formal Education")), makeString("fields of formal education")), list(list(makeString("permanently Northwest Of")), makeString("permanently northwest of")), list(list(makeString("frequently In Contact With")), makeString("frequently in contact with")), list(list(makeString("minor League Affiliates")), makeString("minor league affiliates")), list(list(makeString("test Query Specification")), makeString("test query specification")), list(list(makeString("parameter Of Program")), makeString("parameter of program")), list(list(makeString("country Of City")), makeString("country of city")), list(list(makeString("information Origin")), makeString("information origin")), list(list(makeString("program Found On Computer")), makeString("program found on computer")), list(list(makeString("eats Willingly")), makeString("eats willingly")), list(list(makeString("means Of Deploying Agent BCW")), makeString("means of deploying agent BCW")), list(list(makeString("exploit Targets Program")), makeString("exploit targets program")), list(list(makeString("characteristic Activity Type Of Organization Type")), makeString("characteristic activity type of organization type")), list(list(makeString("type Genls")), makeString("type genls")), list(list(makeString("ethnicity")), makeString("ethnicity")), list(list(makeString("arg 2 Not Isa")), makeString("arg 2 not isa")), list(list(makeString("episode Type")), makeString("episode type")), list(list(makeString("following Value")), makeString("following value")), list(list(makeString("variant Of Suffix")), makeString("variant of suffix")), list(list(makeString("forms Border Part")), makeString("forms border part")), list(list(makeString("permanently East Of")), makeString("permanently east of")), list(list(makeString("test Metrics To Gather")), makeString("test metrics to gather")), list(list(makeString("speech Part Preds")), makeString("speech part preds")), list(list(makeString("ke Weak Suggestion Preds")), makeString("ke weak suggestion preds")), list(list(makeString("spatially Intrinsic Arg")), makeString("spatially intrinsic arg")), list(list(makeString("required Arg 1 Pred")), makeString("required arg 1 pred")), list(list(makeString("highest Education Level")), makeString("highest education level")), list(list(makeString("occupation")), makeString("occupation")), list(list(makeString("expansion")), makeString("expansion")), list(list(makeString("agent Stays Viable After Deployment BCW")), makeString("agent stays viable after deployment BCW")), list(list(makeString("pathogen With Respect To")), makeString("pathogen with respect to")), list(list(makeString("facet Based On Type Binary Pred")), makeString("facet based on type binary pred")), list(list(makeString("symmetric On")), makeString("symmetric on")), list(list(makeString("date Left Jihad")), makeString("date left jihad")), list(list(makeString("state Of County")), makeString("state of county")), list(list(makeString("agent Type Sells Product Type")), makeString("agent type sells product type")), list(list(makeString("fault Vulnerability Running")), makeString("fault vulnerability running")), list(list(makeString("temporally Subsumes Type Type")), makeString("temporally subsumes type type")), list(list(makeString("proper Sub Situation Types")), makeString("proper sub situation types")), list(list(makeString("intended Target Type Of Weapon Type")), makeString("intended target type of weapon type")), list(list(makeString("last Proper Sub Situation Types")), makeString("last proper sub situation types")), list(list(makeString("homepage")), makeString("homepage")), list(list(makeString("pathogen Sole Cause Of Infection Type")), makeString("pathogen sole cause of infection type")), list(list(makeString("borders On")), makeString("borders on")), list(list(makeString("active Ingredients Of Type")), makeString("active ingredients of type")), list(list(makeString("common Food Type Of Cuisine")), makeString("common food type of cuisine")), list(list(makeString("inter Arg Reln 1 2")), makeString("inter arg reln 1 2")), list(list(makeString("event Type Duration Of Effects")), makeString("event type duration of effects")), list(list(makeString("name String NC")), makeString("name string NC")), list(list(makeString("corresponding Military Task Type")), makeString("corresponding military task type")), list(list(makeString("contains Information About Focally")), makeString("contains information about focally")), list(list(makeString("protects Against Type")), makeString("protects against type")), list(list(makeString("geopolitical Subdivision")), makeString("geopolitical subdivision")), list(list(makeString("domain Example Pred Sentences")), makeString("domain example pred sentences")), list(list(makeString("preferred E Mail Address Text")), makeString("preferred e mail address text")), list(list(makeString("subject Of Report Prop")), makeString("subject of report prop")), list(list(makeString("ke Requirement Preds")), makeString("ke requirement preds")), list(list(makeString("unique Physical Part Types")), makeString("unique physical part types")), list(list(makeString("place In City")), makeString("place in city")), list(list(makeString("temporally Disjoint Action Types")), makeString("temporally disjoint action types")), list(list(makeString("indicated Drug")), makeString("indicated drug")), list(list(makeString("alias")), makeString("alias")), list(list(makeString("central Reference Point")), makeString("central reference point")), list(list(makeString("agentive-Sg")), makeString("agentive-sg")), list(list(makeString("partitioned Into")), makeString("partitioned into")), list(list(makeString("url Of CW")), makeString("url of CW")), list(list(makeString("social Class")), makeString("social class")), list(list(makeString("language Spoken")), makeString("language spoken")), list(list(makeString("fault Vulnerability Remote")), makeString("fault vulnerability remote")), list(list(makeString("total Merchant Marine Volume")), makeString("total merchant marine volume")), list(list(makeString("permanently Northeast Of")), makeString("permanently northeast of")), list(list(makeString("sub L Symbol For Module")), makeString("sub l symbol for module")), list(list(makeString("arg 5 Isa")), makeString("arg 5 isa")), list(list(makeString("date Of Death Event")), makeString("date of death event")), list(list(makeString("altitude Of Highest Point Is")), makeString("altitude of highest point is")), list(list(makeString("event Type Caused Death Of")), makeString("event type caused death of")), list(list(makeString("territories Controlled")), makeString("territories controlled")), list(list(makeString("possessive Relation")), makeString("possessive relation")), list(list(makeString("color Has RGB Red Value")), makeString("color has RGB red value")), list(list(makeString("ke Strong Suggestion")), makeString("ke strong suggestion")), list(list(makeString("characteristic Activity Type Of Person Type Frequently")), makeString("characteristic activity type of person type frequently")), list(list(makeString("architectural Style")), makeString("architectural style")), list(list(makeString("shared Notes")), makeString("shared notes")), list(list(makeString("frequent Prototypical Activity Type Of Person Type")), makeString("frequent prototypical activity type of person type")), list(list(makeString("able To Control")), makeString("able to control")), list(list(makeString("color Has RGB Blue Value")), makeString("color has RGB blue value")), list(list(makeString("distribution Medium")), makeString("distribution medium")), list(list(makeString("sub Orgs Command")), makeString("sub orgs command")), list(list(makeString("cultural Region Of Origin")), makeString("cultural region of origin")), list(list(makeString("qa Web String")), makeString("qa web string")), list(list(makeString("arg 4 Isa")), makeString("arg 4 isa")), list(list(makeString("program Strings")), makeString("program strings")), list(list(makeString("color Has RGB Green Value")), makeString("color has RGB green value")), list(list(makeString("example NATs")), makeString("example NATs")), list(list(makeString("ethnic Groups Here")), makeString("ethnic groups here")), list(list(makeString("unit Definition")), makeString("unit definition")), list(list(makeString("inter Arg Reln 1 3")), makeString("inter arg reln 1 3")), list(list(makeString("action Type Expresses Feeling Type")), makeString("action type expresses feeling type")), list(list(makeString("genre Heyday")), makeString("genre heyday")), list(list(makeString("structure In Area")), makeString("structure in area")), list(list(makeString("uppercase Of Lowercase")), makeString("uppercase of lowercase")), list(list(makeString("E Mail Address Text")), makeString("E mail address text")), list(list(makeString("quoted Argument")), makeString("quoted argument")), list(list(makeString("focal Activity Type")), makeString("focal activity type")), list(list(makeString("modality Features")), makeString("modality features")), list(list(makeString("mandatory Game Equipment Type")), makeString("mandatory game equipment type")), list(list(makeString("test Responsible Cyclist")), makeString("test responsible cyclist")), list(list(makeString("formula For Formula Template")), makeString("formula for formula template")), list(list(makeString("ke Induced Weak Suggestion Preds")), makeString("ke induced weak suggestion preds")), list(list(makeString("specified Subset Of")), makeString("specified subset of")), list(list(makeString("proper Sub Event Types")), makeString("proper sub event types")), list(list(makeString("date Joined Jihad")), makeString("date joined jihad")), list(list(makeString("cyc Subject Clumps")), makeString("cyc subject clumps")), list(list(makeString("president Of Country")), makeString("president of country")), list(list(makeString("sub L Identifier")), makeString("sub l identifier")), list(list(makeString("file Found On Computer")), makeString("file found on computer")), list(list(makeString("in Region")), makeString("in region")), list(list(makeString("country Phone Code")), makeString("country phone code")), list(list(makeString("intended Target Type Of Attack")), makeString("intended target type of attack")), list(list(makeString("polities Border Each Other")), makeString("polities border each other")), list(list(makeString("predicates SBHL Disjoins Module")), makeString("predicates SBHL disjoins module")), list(list(makeString("reified Using Tool")), makeString("reified using tool")), list(list(makeString("arg 3 Isa")), makeString("arg 3 isa")), list(list(makeString("predicates SBHL Type Test")), makeString("predicates SBHL type test")), list(list(makeString("arg 3 Genl")), makeString("arg 3 genl")), list(list(makeString("arg 2 Genl")), makeString("arg 2 genl")), list(list(makeString("middle Name Initial")), makeString("middle name initial")), list(list(makeString("has Authority Over")), makeString("has authority over")), list(list(makeString("temporally Contains")), makeString("temporally contains")), list(list(makeString("super Topics")), makeString("super topics")), list(list(makeString("member Types")), makeString("member types")), list(list(makeString("color Has Hue")), makeString("color has hue")), list(list(makeString("args Isa")), makeString("args isa")), list(list(makeString("arg 1 Not Isa")), makeString("arg 1 not isa")), list(list(makeString("main Topic")), makeString("main topic")), list(list(makeString("open Entry Format In Args")), makeString("open entry format in args")), list(list(makeString("reformulate Template Via Specification")), makeString("reformulate template via specification")), list(list(makeString("terrain Decompositions")), makeString("terrain decompositions")), list(list(makeString("info Transferred")), makeString("info transferred")), list(list(makeString("transported In Types")), makeString("transported in types")), list(list(makeString("contradictory Preds")), makeString("contradictory preds")), list(list(makeString("agent Type Uses Artifact Type")), makeString("agent type uses artifact type")), list(list(makeString("gen Template")), makeString("gen template")), list(list(makeString("system Of Writing")), makeString("system of writing")), list(list(makeString("uppercase Of Letter")), makeString("uppercase of letter")), list(list(makeString("roles For Event Type")), makeString("roles for event type")), list(list(makeString("template Topic Prefix")), makeString("template topic prefix")), list(list(makeString("job Class")), makeString("job class")), list(list(makeString("super Event Types")), makeString("super event types")), list(list(makeString("iterated Proper Sub Situation Types")), makeString("iterated proper sub situation types")), list(list(makeString("ke Induced Strong Suggestion Preds")), makeString("ke induced strong suggestion preds")), list(list(makeString("permanently North Of")), makeString("permanently north of")), list(list(makeString("percent Natural Population Increase")), makeString("percent natural population increase")), list(list(makeString("title For Formula Template Type String")), makeString("title for formula template type string")), list(list(makeString("subcat Frame Keywords")), makeString("subcat frame keywords")), list(list(makeString("rewrite Of")), makeString("rewrite of")), list(list(makeString("residence Of Organization")), makeString("residence of organization")), list(list(makeString("arg 2 Format")), makeString("arg 2 format")), list(list(makeString("surrounds Horizontally")), makeString("surrounds horizontally")), list(list(makeString("most Notable Isa")), makeString("most notable isa")), list(list(makeString("style Of Artist")), makeString("style of artist")), list(list(makeString("specialized Equipment Of Unit Type")), makeString("specialized equipment of unit type")), list(list(makeString("in Topic")), makeString("in topic")), list(list(makeString("disjoint With")), makeString("disjoint with")), list(list(makeString("areas Of Origin")), makeString("areas of origin")), list(list(makeString("conceptually Related")), makeString("conceptually related")), list(list(makeString("inter Arg Reln 2 4")), makeString("inter arg reln 2 4")), list(list(makeString("arg 1 Genl")), makeString("arg 1 genl")), list(list(makeString("arg 3 Format")), makeString("arg 3 format")), list(list(makeString("temporal Bounds Contain")), makeString("temporal bounds contain")), list(list(makeString("agent Type Works At Location Type")), makeString("agent type works at location type")), list(list(makeString("relation Category Type")), makeString("relation category type")), list(list(makeString("main Subject Clump")), makeString("main subject clump")), list(list(makeString("arg 1 Format")), makeString("arg 1 format")), list(list(makeString("conceptually Co Related")), makeString("conceptually co related")), list(list(makeString("genl Functions")), makeString("genl functions")), list(list(makeString("arg 2 Isa")), makeString("arg 2 isa")), list(list(makeString("definitional Mt For Topic Assertions")), makeString("definitional mt for topic assertions")), list(list(makeString("arg 1 Isa")), makeString("arg 1 isa")), list(list(makeString("color Has Chroma")), makeString("color has chroma")), list(list(makeString("indigenous To")), makeString("indigenous to")) });
    }

    private static SubLObject _constant_217_initializer() {
        return list(new SubLObject[]{ list(list(makeString("organizationGrantsFranchisesOfType")), makeString("organization Grants Franchises Of Type")), list(list(makeString("identityConditionsFor")), makeString("identity Conditions For")), list(list(makeString("dateOfDeath")), makeString("date Of Death")), list(list(makeString("developerOfIBTType")), makeString("developer Of IBT Type")), list(list(makeString("correspondingCycCollection")), makeString("corresponding Cyc Collection")), list(list(makeString("InverseBinaryPredicateFn")), makeString("Inverse Binary Predicate Fn")), list(list(makeString("toxinTypeProducedByOrganismType")), makeString("toxin Type Produced By Organism Type")), list(list(makeString("europeanDiscoveryBy")), makeString("european Discovery By")), list(list(makeString("constructionStartingDate")), makeString("construction Starting Date")), list(list(makeString("highestPeakInThisGroup")), makeString("highest Peak In This Group")), list(list(makeString("umlName")), makeString("uml Name")), list(list(makeString("programObjectTypeRepresents")), makeString("program Object Type Represents")), list(list(makeString("higherPriorityTemplateType-Immediate")), makeString("higher Priority Template Type Immediate")), list(list(makeString("subcatFrameArity")), makeString("subcat Frame Arity")), list(list(makeString("fieldStudies")), makeString("field Studies")), list(list(makeString("vulnerabilityEnablesAttack")), makeString("vulnerability Enables Attack")), list(list(makeString("owlDefiningOntologyURI")), makeString("owl Defining Ontology URI")), list(list(makeString("languagesSpokenHere")), makeString("languages Spoken Here")), list(list(makeString("numberOfHostagesTaken")), makeString("number Of Hostages Taken")), list(list(makeString("lowercaseOfLetter")), makeString("lowercase Of Letter")), list(list(makeString("conditionAffectsPartType")), makeString("condition Affects Part Type")), list(list(makeString("timeZoneOffsetToGMT")), makeString("time Zone Offset To GMT")), list(list(makeString("hasDepartmentTypes")), makeString("has Department Types")), list(list(makeString("cyclistPrimaryProject")), makeString("cyclist Primary Project")), list(list(makeString("landAreaOfRegion")), makeString("land Area Of Region")), list(list(makeString("comparativeDegree")), makeString("comparative Degree")), list(list(makeString("polityHasTransportMeans")), makeString("polity Has Transport Means")), list(list(makeString("fileFormatHasSuffix")), makeString("file Format Has Suffix")), list(list(makeString("drugOfChoiceAdministeredFor")), makeString("drug Of Choice Administered For")), list(list(makeString("taskStatus")), makeString("task Status")), list(list(makeString("principalLandmarksOfCity")), makeString("principal Landmarks Of City")), list(list(makeString("infinitive")), makeString("infinitive")), list(list(makeString("performsActsOfType")), makeString("performs Acts Of Type")), list(list(makeString("geographicalSubRegionsOfCountry")), makeString("geographical Sub Regions Of Country")), list(list(makeString("televisionActors")), makeString("television Actors")), list(list(makeString("characterSetForWritingSystem")), makeString("character Set For Writing System")), list(list(makeString("internationalOrganizationMemberCountries")), makeString("international Organization Member Countries")), list(list(makeString("builderQueryForTemplate")), makeString("builder Query For Template")), list(list(makeString("alterEgoOfHero")), makeString("alter Ego Of Hero")), list(list(makeString("animalTypeMakesSoundType")), makeString("animal Type Makes Sound Type")), list(list(makeString("mainColorOfObject")), makeString("main Color Of Object")), list(list(makeString("antisymmetricOn")), makeString("antisymmetric On")), list(list(makeString("lexicalWordTypeForLanguage")), makeString("lexical Word Type For Language")), list(list(makeString("drainageArea")), makeString("drainage Area")), list(list(makeString("sourceNodeInSystem")), makeString("source Node In System")), list(list(makeString("completeExtentEnumerableForArg")), makeString("complete Extent Enumerable For Arg")), list(list(makeString("morphologicallyDerivedFrom")), makeString("morphologically Derived From")), list(list(makeString("cwSeriesType")), makeString("cw Series Type")), list(list(makeString("programTypicallyInstalledWith")), makeString("program Typically Installed With")), list(list(makeString("testCollectionProjectResponsible")), makeString("test Collection Project Responsible")), list(list(makeString("infectionTypeHasVectorType")), makeString("infection Type Has Vector Type")), list(list(makeString("stateOfAddress")), makeString("state Of Address")), list(list(makeString("defaultSpecializedType")), makeString("default Specialized Type")), list(list(makeString("agentTypeProvidesServiceOfType")), makeString("agent Type Provides Service Of Type")), list(list(makeString("discoveredByEuropeansWhen")), makeString("discovered By Europeans When")), list(list(makeString("projectOfDepartment")), makeString("project Of Department")), list(list(makeString("director-OrganizationalRole")), makeString("director Organizational Role")), list(list(makeString("regulatesActivityType")), makeString("regulates Activity Type")), list(list(makeString("taskSchedulerTaskDatePattern")), makeString("task Scheduler Task Date Pattern")), list(list(makeString("computerMACAddress")), makeString("computer MAC Address")), list(list(makeString("derivationalAffixBasePOS")), makeString("derivational Affix Base POS")), list(list(makeString("softwareDesignedForArchitecture")), makeString("software Designed For Architecture")), list(list(makeString("regionProduces")), makeString("region Produces")), list(list(makeString("sourceUsedForTask")), makeString("source Used For Task")), list(list(makeString("socialQuantityTypeExpressedByInsOfEventType")), makeString("social Quantity Type Expressed By Ins Of Event Type")), list(list(makeString("softwareParameterSetInSoftwareObject")), makeString("software Parameter Set In Software Object")), list(list(makeString("expressionTypeForTag")), makeString("expression Type For Tag")), list(list(makeString("performancesOfWorkAre")), makeString("performances Of Work Are")), list(list(makeString("bugzillaBugReportAssignedTo")), makeString("bugzilla Bug Report Assigned To")), list(list(makeString("derivedUsingPrefix")), makeString("derived Using Prefix")), list(list(makeString("capitalCityOfState")), makeString("capital City Of State")), list(list(makeString("netMigrationRate")), makeString("net Migration Rate")), list(list(makeString("facesDirection")), makeString("faces Direction")), list(list(makeString("programSourceCodeWrittenIn")), makeString("program Source Code Written In")), list(list(makeString("topInThesaurus")), makeString("top In Thesaurus")), list(list(makeString("importantCompany")), makeString("important Company")), list(list(makeString("clumpSyntaxList")), makeString("clump Syntax List")), list(list(makeString("correspondingKEInteractionResource")), makeString("corresponding KE Interaction Resource")), list(list(makeString("formerOccupation")), makeString("former Occupation")), list(list(makeString("minQuantValue")), makeString("min Quant Value")), list(list(makeString("keGenlsInducedWeakSuggestionPreds")), makeString("ke Genls Induced Weak Suggestion Preds")), list(list(makeString("binaryRoleTypePred")), makeString("binary Role Type Pred")), list(list(makeString("hourOfDayIndex-24Hour")), makeString("hour Of Day Index 24 Hour")), list(list(makeString("typeGenlMt")), makeString("type Genl Mt")), list(list(makeString("readsLanguage")), makeString("reads Language")), list(list(makeString("emptiesInto")), makeString("empties Into")), list(list(makeString("transportFacilityForType")), makeString("transport Facility For Type")), list(list(makeString("semTransArg")), makeString("sem Trans Arg")), list(list(makeString("ventureCompany")), makeString("venture Company")), list(list(makeString("preservesGenlsInArg")), makeString("preserves Genls In Arg")), list(list(makeString("ventureMember")), makeString("venture Member")), list(list(makeString("interArgReln3-2")), makeString("inter Arg Reln 3 2")), list(list(makeString("baseForm")), makeString("base Form")), list(list(makeString("firstPublicationDate-CW")), makeString("first Publication Date CW")), list(list(makeString("numberTypeIntervalType")), makeString("number Type Interval Type")), list(list(makeString("eventTypeImplementedByProgramFunction")), makeString("event Type Implemented By Program Function")), list(list(makeString("mainLanguagesOfGPE")), makeString("main Languages Of GPE")), list(list(makeString("geographicalSubRegionsOfState")), makeString("geographical Sub Regions Of State")), list(list(makeString("fanOutArg")), makeString("fan Out Arg")), list(list(makeString("sksSchemaTranslationMt")), makeString("sks Schema Translation Mt")), list(list(makeString("subTopicQueryBetterWords")), makeString("sub Topic Query Better Words")), list(list(makeString("succeedingValueOfMunsellHue")), makeString("succeeding Value Of Munsell Hue")), list(list(makeString("runsOS")), makeString("runs OS")), list(list(makeString("worksFoundInStructure")), makeString("works Found In Structure")), list(list(makeString("highestPointInRegion")), makeString("highest Point In Region")), list(list(makeString("facetBasedOnBinaryPredInverse")), makeString("facet Based On Binary Pred Inverse")), list(list(makeString("independentArg")), makeString("independent Arg")), list(list(makeString("nodeInLAN")), makeString("node In LAN")), list(list(makeString("fieldFostersAdvancedArtifactsOfType")), makeString("field Fosters Advanced Artifacts Of Type")), list(list(makeString("localChiefInOrganization")), makeString("local Chief In Organization")), list(list(makeString("roleWithEventTypeEntailsSomeTimeInTimeIndex")), makeString("role With Event Type Entails Some Time In Time Index")), list(list(makeString("occursDuring")), makeString("occurs During")), list(list(makeString("pathogenTypeCausesInfectionType")), makeString("pathogen Type Causes Infection Type")), list(list(makeString("prefixString")), makeString("prefix String")), list(list(makeString("covering")), makeString("covering")), list(list(makeString("microtheoryDesignationArgnum")), makeString("microtheory Designation Argnum")), list(list(makeString("otherCommonLanguageHere")), makeString("other Common Language Here")), list(list(makeString("notEquipmentOfUnitType")), makeString("not Equipment Of Unit Type")), list(list(makeString("ncRuleConstraint")), makeString("nc Rule Constraint")), list(list(makeString("holySite")), makeString("holy Site")), list(list(makeString("subcatFrameExample")), makeString("subcat Frame Example")), list(list(makeString("musicTypeIsOfGenre")), makeString("music Type Is Of Genre")), list(list(makeString("containsPrograms")), makeString("contains Programs")), list(list(makeString("accountName")), makeString("account Name")), list(list(makeString("networkKnowledgePredicateForCycSecureComponent")), makeString("network Knowledge Predicate For Cyc Secure Component")), list(list(makeString("commonNickname")), makeString("common Nickname")), list(list(makeString("withinRangeOfFire")), makeString("within Range Of Fire")), list(list(makeString("controllingSuborganizations")), makeString("controlling Suborganizations")), list(list(makeString("constrainsArg")), makeString("constrains Arg")), list(list(makeString("slotsAdditive")), makeString("slots Additive")), list(list(makeString("movesInDirection-Average")), makeString("moves In Direction Average")), list(list(makeString("temporallyIntersects-TypeType")), makeString("temporally Intersects Type Type")), list(list(makeString("quantityOrderedQuantityType")), makeString("quantity Ordered Quantity Type")), list(list(makeString("countryOfNationality")), makeString("country Of Nationality")), list(list(makeString("assignmentRoughDuration")), makeString("assignment Rough Duration")), list(list(makeString("sourcesForTopic")), makeString("sources For Topic")), list(list(makeString("predicatesSBHLPathMarkingFunctionType")), makeString("predicates SBHL Path Marking Function Type")), list(list(makeString("taskSchedulerTaskTimePattern")), makeString("task Scheduler Task Time Pattern")), list(list(makeString("criterialForTerrainTacticalRole-Negative")), makeString("criterial For Terrain Tactical Role Negative")), list(list(makeString("parserTestTarget")), makeString("parser Test Target")), list(list(makeString("affixSemantics")), makeString("affix Semantics")), list(list(makeString("contextOfPCW")), makeString("context Of PCW")), list(list(makeString("faultVulnerability-OS")), makeString("fault Vulnerability OS")), list(list(makeString("subTopicPrintString")), makeString("sub Topic Print String")), list(list(makeString("commonLanguage")), makeString("common Language")), list(list(makeString("divisorTypeForQuantityType")), makeString("divisor Type For Quantity Type")), list(list(makeString("averagePrecipitation")), makeString("average Precipitation")), list(list(makeString("predicateSBHLTransfersViaArg")), makeString("predicate SBHL Transfers Via Arg")), list(list(makeString("taskSchedulerTaskUser")), makeString("task Scheduler Task User")), list(list(makeString("useFor")), makeString("use For")), list(list(makeString("industryFacilities")), makeString("industry Facilities")), list(list(makeString("predicateSBHLTransfersThroughModule")), makeString("predicate SBHL Transfers Through Module")), list(list(makeString("periodOfTimeIntervalSeries")), makeString("period Of Time Interval Series")), list(list(makeString("keWeakSuggestion")), makeString("ke Weak Suggestion")), list(list(makeString("spatiallyDisjoint")), makeString("spatially Disjoint")), list(list(makeString("bugzillaBugForProduct")), makeString("bugzilla Bug For Product")), list(list(makeString("taskAdvisor")), makeString("task Advisor")), list(list(makeString("bodyPartsUsed-TypeType")), makeString("body Parts Used Type Type")), list(list(makeString("taskReviewer")), makeString("task Reviewer")), list(list(makeString("cn:IsA")), makeString("cn: Is A")), list(list(makeString("most")), makeString("most")), list(list(makeString("organizationTypeMembersActiveInField")), makeString("organization Type Members Active In Field")), list(list(makeString("maximumDepth")), makeString("maximum Depth")), list(list(makeString("ftDeducibleFrom")), makeString("ft Deducible From")), list(list(makeString("domainKnowledgePredicateForCycSecureComponent")), makeString("domain Knowledge Predicate For Cyc Secure Component")), list(list(makeString("interArgReln3-1")), makeString("inter Arg Reln 3 1")), list(list(makeString("addictedTo")), makeString("addicted To")), list(list(makeString("provenanceOfMediaSeriesProduct")), makeString("provenance Of Media Series Product")), list(list(makeString("commonGenlPreds")), makeString("common Genl Preds")), list(list(makeString("subcatFrameHeadKeyword")), makeString("subcat Frame Head Keyword")), list(list(makeString("government")), makeString("government")), list(list(makeString("nativeLanguage")), makeString("native Language")), list(list(makeString("granuleOfSpatialStuff")), makeString("granule Of Spatial Stuff")), list(list(makeString("programTypeStrings")), makeString("program Type Strings")), list(list(makeString("cblRelationshipHasKeyword")), makeString("cbl Relationship Has Keyword")), list(list(makeString("subEventTypes")), makeString("sub Event Types")), list(list(makeString("requiresOperatingSystem")), makeString("requires Operating System")), list(list(makeString("bioForProposal-short")), makeString("bio For Proposalshort")), list(list(makeString("superlativeDegree")), makeString("superlative Degree")), list(list(makeString("geographicalSubRegionsOfBodyOfWater")), makeString("geographical Sub Regions Of Body Of Water")), list(list(makeString("lastProperSubEventTypes")), makeString("last Proper Sub Event Types")), list(list(makeString("testCollectionForKnowledgeSource")), makeString("test Collection For Knowledge Source")), list(list(makeString("roleTypesForEventType")), makeString("role Types For Event Type")), list(list(makeString("facetBasedOnTypeBinaryPredInverse")), makeString("facet Based On Type Binary Pred Inverse")), list(list(makeString("interArgReln1-4")), makeString("inter Arg Reln 1 4")), list(list(makeString("softwareParameterDomain")), makeString("software Parameter Domain")), list(list(makeString("prototypicalActivityTypeOfPersonType")), makeString("prototypical Activity Type Of Person Type")), list(list(makeString("programFunctionIdentifier")), makeString("program Function Identifier")), list(list(makeString("pnMassNumber")), makeString("pn Mass Number")), list(list(makeString("authenticationSourceFor")), makeString("authentication Source For")), list(list(makeString("stringSkipped")), makeString("string Skipped")), list(list(makeString("programInstalledWithPackage")), makeString("program Installed With Package")), list(list(makeString("characteristicActivityTypeOfPersonType")), makeString("characteristic Activity Type Of Person Type")), list(list(makeString("biologicalWeaponTypeBasisType")), makeString("biological Weapon Type Basis Type")), list(list(makeString("owlURI")), makeString("owl URI")), list(list(makeString("immediatePrecursors-Chemical")), makeString("immediate Precursors Chemical")), list(list(makeString("performanceOfWork")), makeString("performance Of Work")), list(list(makeString("languagePromptForUIA")), makeString("language Prompt For UIA")), list(list(makeString("issuerOfCW")), makeString("issuer Of CW")), list(list(makeString("genlWorks")), makeString("genl Works")), list(list(makeString("subTimeSliceType")), makeString("sub Time Slice Type")), list(list(makeString("productTypeLicensedForTreatmentOf")), makeString("product Type Licensed For Treatment Of")), list(list(makeString("dateOfInvention")), makeString("date Of Invention")), list(list(makeString("agentTypeEmployedByOrgType")), makeString("agent Type Employed By Org Type")), list(list(makeString("constantCopiedFrom")), makeString("constant Copied From")), list(list(makeString("negationQuantities")), makeString("negation Quantities")), list(list(makeString("basedInRegion")), makeString("based In Region")), list(list(makeString("originallyFromRegion")), makeString("originally From Region")), list(list(makeString("genlPrograms")), makeString("genl Programs")), list(list(makeString("averageDischarge")), makeString("average Discharge")), list(list(makeString("programCallsProgram")), makeString("program Calls Program")), list(list(makeString("chiefPorts")), makeString("chief Ports")), list(list(makeString("namedAfter")), makeString("named After")), list(list(makeString("validationRequiredOnTemplatePosition")), makeString("validation Required On Template Position")), list(list(makeString("populationGrowthRate")), makeString("population Growth Rate")), list(list(makeString("testCollectionCyclistResponsible")), makeString("test Collection Cyclist Responsible")), list(list(makeString("fileConfiguresSoftware")), makeString("file Configures Software")), list(list(makeString("policyTypeProtectsAgainst")), makeString("policy Type Protects Against")), list(list(makeString("arityMax")), makeString("arity Max")), list(list(makeString("characteristicActivityTypeOfPersonType-AtLeastOnce")), makeString("characteristic Activity Type Of Person Type At Least Once")), list(list(makeString("developedProductType")), makeString("developed Product Type")), list(list(makeString("spans-Bridgelike")), makeString("spans-Bridgelike")), list(list(makeString("interArgReln3-4")), makeString("inter Arg Reln 3 4")), list(list(makeString("majorReligions")), makeString("major Religions")), list(list(makeString("candidateProperSubSituationTypes")), makeString("candidate Proper Sub Situation Types")), list(list(makeString("ncRuleTemplate")), makeString("nc Rule Template")), list(list(makeString("templateTypeForFocalTermType")), makeString("template Type For Focal Term Type")), list(list(makeString("regularDegree")), makeString("regular Degree")), list(list(makeString("studies")), makeString("studies")), list(list(makeString("cn:UsedFor")), makeString("cn: Used For")), list(list(makeString("softwareUpdateDownloadLink")), makeString("software Update Download Link")), list(list(makeString("unitTypeDimensionalAnalysis")), makeString("unit Type Dimensional Analysis")), list(list(makeString("schoolSymbolName-Female")), makeString("school Symbol Name Female")), list(list(makeString("assertMtForFormulaTemplate")), makeString("assert Mt For Formula Template")), list(list(makeString("queryMtForTopicAssertions")), makeString("query Mt For Topic Assertions")), list(list(makeString("symmetricPhysicalPartTypes")), makeString("symmetric Physical Part Types")), list(list(makeString("predicatesSBHLPathTerminatingMarkFunction")), makeString("predicates SBHL Path Terminating Mark Function")), list(list(makeString("constructionExistentialState")), makeString("construction Existential State")), list(list(makeString("eventTypeUsesDeviceType")), makeString("event Type Uses Device Type")), list(list(makeString("generateArgWithOutsideScope")), makeString("generate Arg With Outside Scope")), list(list(makeString("nounLearnerSenseGloss")), makeString("noun Learner Sense Gloss")), list(list(makeString("vehicleLoadClass")), makeString("vehicle Load Class")), list(list(makeString("dataTypeExploitedBy")), makeString("data Type Exploited By")), list(list(makeString("topicOfDatabase")), makeString("topic Of Database")), list(list(makeString("syntacticNodeCategory")), makeString("syntactic Node Category")), list(list(makeString("softwareObjectUsesLibrary")), makeString("software Object Uses Library")), list(list(makeString("templateTopicGenls")), makeString("template Topic Genls")), list(list(makeString("typicalArmamentOfUnitType")), makeString("typical Armament Of Unit Type")), list(list(makeString("greaterThan")), makeString("greater Than")), list(list(makeString("cn:PropertyOf")), makeString("cn: Property Of")), list(list(makeString("filterCollections")), makeString("filter Collections")), list(list(makeString("hasWhatAsBoundary")), makeString("has What As Boundary")), list(list(makeString("terrainClimateType")), makeString("terrain Climate Type")), list(list(makeString("softwareParameterHasType")), makeString("software Parameter Has Type")), list(list(makeString("tNTEquivalent-Type")), makeString("TNT Equivalent Type")), list(list(makeString("unitTypeUsesTacticalObjectType")), makeString("unit Type Uses Tactical Object Type")), list(list(makeString("coaSupportingTask")), makeString("coa Supporting Task")), list(list(makeString("classificationOfReport")), makeString("classification Of Report")), list(list(makeString("streetOfAddress")), makeString("street Of Address")), list(list(makeString("formulaTemplateTypeHasTopicType")), makeString("formula Template Type Has Topic Type")), list(list(makeString("webSiteURL")), makeString("web Site URL")), list(list(makeString("rAMSize")), makeString("RAM Size")), list(list(makeString("seniorExecutives")), makeString("senior Executives")), list(list(makeString("tmInverseSymbol")), makeString("tm Inverse Symbol")), list(list(makeString("majorCityInState")), makeString("major City In State")), list(list(makeString("derivationalAffixResultPOS")), makeString("derivational Affix Result POS")), list(list(makeString("employeeStatus")), makeString("employee Status")), list(list(makeString("denotatumArg")), makeString("denotatum Arg")), list(list(makeString("programImplementsProtocol")), makeString("program Implements Protocol")), list(list(makeString("waterAreaOfRegion")), makeString("water Area Of Region")), list(list(makeString("to-Generic")), makeString("to-Generic")), list(list(makeString("keStrongSuggestionInverse")), makeString("ke Strong Suggestion Inverse")), list(list(makeString("durationOfType")), makeString("duration Of Type")), list(list(makeString("testDerivedFrom")), makeString("test Derived From")), list(list(makeString("infantMortalityRate")), makeString("infant Mortality Rate")), list(list(makeString("typeLaunchesProjectileType")), makeString("type Launches Projectile Type")), list(list(makeString("nationalBudgetRevenues")), makeString("national Budget Revenues")), list(list(makeString("maxQuantValue")), makeString("max Quant Value")), list(list(makeString("taxonMembers")), makeString("taxon Members")), list(list(makeString("nationalBudgetExpenditures")), makeString("national Budget Expenditures")), list(list(makeString("predicatesCycLInitializationModule")), makeString("predicates Cyc L Initialization Module")), list(list(makeString("naturalHazardsInRegion")), makeString("natural Hazards In Region")), list(list(makeString("linked")), makeString("linked")), list(list(makeString("positionInFormulaTemplateIsReplaceable")), makeString("position In Formula Template Is Replaceable")), list(list(makeString("massNumber")), makeString("mass Number")), list(list(makeString("deviceTypeUsed")), makeString("device Type Used")), list(list(makeString("riverEndTopography")), makeString("river End Topography")), list(list(makeString("objectHasColor")), makeString("object Has Color")), list(list(makeString("regularAdverb")), makeString("regular Adverb")), list(list(makeString("conditionAffectsOrgType")), makeString("condition Affects Org Type")), list(list(makeString("ncRuleTests")), makeString("nc Rule Tests")), list(list(makeString("sentenceDesignationArgnum")), makeString("sentence Designation Argnum")), list(list(makeString("regulatesObjectType")), makeString("regulates Object Type")), list(list(makeString("considerSpecializing")), makeString("consider Specializing")), list(list(makeString("genlModFeatures")), makeString("genl Mod Features")), list(list(makeString("fieldsOfCompetence")), makeString("fields Of Competence")), list(list(makeString("policyTypeCoversTypes")), makeString("policy Type Covers Types")), list(list(makeString("topicOfClump")), makeString("topic Of Clump")), list(list(makeString("deviceTypeManipulates")), makeString("device Type Manipulates")), list(list(makeString("predicateSBHLIndexArg")), makeString("predicate SBHL Index Arg")), list(list(makeString("subInformation")), makeString("sub Information")), list(list(makeString("derivedConceptualWork")), makeString("derived Conceptual Work")), list(list(makeString("tmSuperset")), makeString("tm Superset")), list(list(makeString("glfLabelForArcsBasedOnExpandedPred")), makeString("glf Label For Arcs Based On Expanded Pred")), list(list(makeString("sourceOfTerm-Person")), makeString("source Of Term Person")), list(list(makeString("orbits")), makeString("orbits")), list(list(makeString("literacyRate")), makeString("literacy Rate")), list(list(makeString("testTypeFolder")), makeString("test Type Folder")), list(list(makeString("suffixString")), makeString("suffix String")), list(list(makeString("hasAward")), makeString("has Award")), list(list(makeString("topicOfBeliefSystem")), makeString("topic Of Belief System")), list(list(makeString("sksPhysicalSchemaDescriptionMt")), makeString("sks Physical Schema Description Mt")), list(list(makeString("programFunctionOperator")), makeString("program Function Operator")), list(list(makeString("commerciallyUsefulPartTypes")), makeString("commercially Useful Part Types")), list(list(makeString("perpendicularVectors")), makeString("perpendicular Vectors")), list(list(makeString("sticksInto-2D")), makeString("sticks Into 2 D")), list(list(makeString("perfect")), makeString("perfect")), list(list(makeString("compassValueOfDirection")), makeString("compass Value Of Direction")), list(list(makeString("bugCausesBadParaphraseInQueryLibrary")), makeString("bug Causes Bad Paraphrase In Query Library")), list(list(makeString("organismTypeExistentialThreatState")), makeString("organism Type Existential Threat State")), list(list(makeString("correlatedColor")), makeString("correlated Color")), list(list(makeString("notablePeaksInThisGroup")), makeString("notable Peaks In This Group")), list(list(makeString("formOfDisease")), makeString("form Of Disease")), list(list(makeString("formulaTemplateHasType")), makeString("formula Template Has Type")), list(list(makeString("startsDuring")), makeString("starts During")), list(list(makeString("altitudeOfLowestPointIs")), makeString("altitude Of Lowest Point Is")), list(list(makeString("whereRiverStarts")), makeString("where River Starts")), list(list(makeString("maximumDurationOfType")), makeString("maximum Duration Of Type")), list(list(makeString("embeddedRegion")), makeString("embedded Region")), list(list(makeString("controls")), makeString("controls")), list(list(makeString("standardEquipmentOfUnitType")), makeString("standard Equipment Of Unit Type")), list(list(makeString("agentSupportsAgent-Generic")), makeString("agent Supports Agent Generic")), list(list(makeString("arg5Format")), makeString("arg 5 Format")), list(list(makeString("subIndustryTypes")), makeString("sub Industry Types")), list(list(makeString("schoolTypeAttended")), makeString("school Type Attended")), list(list(makeString("hasPortalToRegion")), makeString("has Portal To Region")), list(list(makeString("predicatesSBHLPathUnmarkingFunctionType")), makeString("predicates SBHL Path Unmarking Function Type")), list(list(makeString("sksSourceDescriptionMt")), makeString("sks Source Description Mt")), list(list(makeString("servesCuisine")), makeString("serves Cuisine")), list(list(makeString("arg5Genl")), makeString("arg 5 Genl")), list(list(makeString("keyParticipants")), makeString("key Participants")), list(list(makeString("purposeOf-EventTypeSitType")), makeString("purpose Of Event Type Sit Type")), list(list(makeString("hasHeadquartersInCountry")), makeString("has Headquarters In Country")), list(list(makeString("localEMailAddressText")), makeString("local E Mail Address Text")), list(list(makeString("oppositeCollections")), makeString("opposite Collections")), list(list(makeString("semTransPredForPOS")), makeString("sem Trans Pred For POS")), list(list(makeString("projectSource-FactEntry")), makeString("project Source Fact Entry")), list(list(makeString("typeMeasuresQuantity")), makeString("type Measures Quantity")), list(list(makeString("intersectionType")), makeString("intersection Type")), list(list(makeString("arityMin")), makeString("arity Min")), list(list(makeString("facetBasedOnBinaryPred")), makeString("facet Based On Binary Pred")), list(list(makeString("computerIP")), makeString("computer IP")), list(list(makeString("hasZodiacSign")), makeString("has Zodiac Sign")), list(list(makeString("linkInSystem")), makeString("link In System")), list(list(makeString("strictlyFunctionalInArgs")), makeString("strictly Functional In Args")), list(list(makeString("hasPersonality")), makeString("has Personality")), list(list(makeString("htmlTagSymbol")), makeString("html Tag Symbol")), list(list(makeString("bugzillaBugReportReporter")), makeString("bugzilla Bug Report Reporter")), list(list(makeString("bugBlocksQuery")), makeString("bug Blocks Query")), list(list(makeString("adjectiveOfCountry")), makeString("adjective Of Country")), list(list(makeString("uniqueIDForType")), makeString("unique ID For Type")), list(list(makeString("educationLevel")), makeString("education Level")), list(list(makeString("cityInState")), makeString("city In State")), list(list(makeString("bugCausesSpuriousProof")), makeString("bug Causes Spurious Proof")), list(list(makeString("ftDeducibleFrom-Dual")), makeString("ft Deducible From Dual")), list(list(makeString("excludeReplacementOptionForFormulaTemplate")), makeString("exclude Replacement Option For Formula Template")), list(list(makeString("typicalColorOfType")), makeString("typical Color Of Type")), list(list(makeString("predicatesPropertyTypeOfArg1")), makeString("predicates Property Type Of Arg 1")), list(list(makeString("terrainType")), makeString("terrain Type")), list(list(makeString("properPhysicalPartTypes")), makeString("proper Physical Part Types")), list(list(makeString("taskTypeRequiresResourceType")), makeString("task Type Requires Resource Type")), list(list(makeString("vaccineEffectiveAgainstMicroorgType")), makeString("vaccine Effective Against Microorg Type")), list(list(makeString("areaThisLanguageNativeTo")), makeString("area This Language Native To")), list(list(makeString("hasOffice")), makeString("has Office")), list(list(makeString("dialects")), makeString("dialects")), list(list(makeString("elInverse")), makeString("el Inverse")), list(list(makeString("nodeInSystem")), makeString("node In System")), list(list(makeString("performedByPart")), makeString("performed By Part")), list(list(makeString("pastTense-Universal")), makeString("past Tense Universal")), list(list(makeString("preconditionFor-Events")), makeString("precondition For Events")), list(list(makeString("deviceTypesCommonlyUsedTogether")), makeString("device Types Commonly Used Together")), list(list(makeString("agentTypePerformsWorkOfType")), makeString("agent Type Performs Work Of Type")), list(list(makeString("runsUnderOS")), makeString("runs Under OS")), list(list(makeString("locatedAtPoint-SurfaceGeographical")), makeString("located At Point Surface Geographical")), list(list(makeString("populationOfRegion")), makeString("population Of Region")), list(list(makeString("cn:ThematicKLine")), makeString("cn: Thematic K Line")), list(list(makeString("standardVehicleOfUnitType")), makeString("standard Vehicle Of Unit Type")), list(list(makeString("genlKBContentTests")), makeString("genl KB Content Tests")), list(list(makeString("basicSpeechPartPred")), makeString("basic Speech Part Pred")), list(list(makeString("industryProducesType")), makeString("industry Produces Type")), list(list(makeString("hasRightsOver")), makeString("has Rights Over")), list(list(makeString("typeUsedWithCycModule")), makeString("type Used With Cyc Module")), list(list(makeString("tmSymbol")), makeString("tm Symbol")), list(list(makeString("headOfStateOf")), makeString("head Of State Of")), list(list(makeString("postEvents")), makeString("post Events")), list(list(makeString("causes-SitTypeSitType")), makeString("causes Sit Type Sit Type")), list(list(makeString("focalTermIntroduction")), makeString("focal Term Introduction")), list(list(makeString("titleOfPerson-String")), makeString("title Of Person String")), list(list(makeString("stufflikeWRTPred")), makeString("stufflike WRT Pred")), list(list(makeString("requestingAgent")), makeString("requesting Agent")), list(list(makeString("templateReplacementsInvisibleForPosition")), makeString("template Replacements Invisible For Position")), list(list(makeString("properSubEvents")), makeString("proper Sub Events")), list(list(makeString("temporallyIntrinsicArg")), makeString("temporally Intrinsic Arg")), list(list(makeString("stringLength")), makeString("string Length")), list(list(makeString("orgTypeFacilityType")), makeString("org Type Facility Type")), list(list(makeString("personHairColor")), makeString("person Hair Color")), list(list(makeString("nationalLanguage")), makeString("national Language")), list(list(makeString("reflexiveOn")), makeString("reflexive On")), list(list(makeString("cityOfAddress")), makeString("city Of Address")), list(list(makeString("preferredNameString")), makeString("preferred Name String")), list(list(makeString("nextHigherOrder")), makeString("next Higher Order")), list(list(makeString("posOfPhraseType")), makeString("pos Of Phrase Type")), list(list(makeString("primaryActivityTypeOfLocation")), makeString("primary Activity Type Of Location")), list(list(makeString("arg4Format")), makeString("arg 4 Format")), list(list(makeString("whereRiverEnds")), makeString("where River Ends")), list(list(makeString("inhabitantTypes")), makeString("inhabitant Types")), list(list(makeString("plural")), makeString("plural")), list(list(makeString("interArgReln2-1")), makeString("inter Arg Reln 2 1")), list(list(makeString("officeInCountry")), makeString("office In Country")), list(list(makeString("posForTemplateCategory")), makeString("pos For Template Category")), list(list(makeString("salientURL")), makeString("salient URL")), list(list(makeString("predicatesCycLModuleType")), makeString("predicates Cyc L Module Type")), list(list(makeString("suffrageAge")), makeString("suffrage Age")), list(list(makeString("reportTime")), makeString("report Time")), list(list(makeString("subTopicOrderedQueryWords")), makeString("sub Topic Ordered Query Words")), list(list(makeString("computerSpeed")), makeString("computer Speed")), list(list(makeString("foundingDate")), makeString("founding Date")), list(list(makeString("taskSchedulerTaskExpression")), makeString("task Scheduler Task Expression")), list(list(makeString("regionalTelephoneAreaCode")), makeString("regional Telephone Area Code")), list(list(makeString("subTopicQueryRestrictClause")), makeString("sub Topic Query Restrict Clause")), list(list(makeString("hobbyCWPerformedBy")), makeString("hobby CW Performed By")), list(list(makeString("dateOfPublication-CW")), makeString("date Of Publication CW")), list(list(makeString("sksLogicalSchemaDescriptionMt")), makeString("sks Logical Schema Description Mt")), list(list(makeString("roomFaces")), makeString("room Faces")), list(list(makeString("hasStatusWithOrganization")), makeString("has Status With Organization")), list(list(makeString("placeJoinedJihad")), makeString("place Joined Jihad")), list(list(makeString("programAuthor")), makeString("program Author")), list(list(makeString("typicalLocationOfType")), makeString("typical Location Of Type")), list(list(makeString("from-Generic")), makeString("from-Generic")), list(list(makeString("standardUnit")), makeString("standard Unit")), list(list(makeString("keGenlsInducedStrongSuggestionPreds")), makeString("ke Genls Induced Strong Suggestion Preds")), list(list(makeString("predicatesCycLGraphType")), makeString("predicates Cyc L Graph Type")), list(list(makeString("taskTypeUsesTacticalObjectType")), makeString("task Type Uses Tactical Object Type")), list(list(makeString("negativeVestedInterest")), makeString("negative Vested Interest")), list(list(makeString("requiredActorSlots")), makeString("required Actor Slots")), list(list(makeString("parasiteCausesAilmentCondition")), makeString("parasite Causes Ailment Condition")), list(list(makeString("closedUnder")), makeString("closed Under")), list(list(makeString("incorporatedIn")), makeString("incorporated In")), list(list(makeString("placeOfDeath")), makeString("place Of Death")), list(list(makeString("orderOfCollection")), makeString("order Of Collection")), list(list(makeString("accountLoggedInOn")), makeString("account Logged In On")), list(list(makeString("holdsIn")), makeString("holds In")), list(list(makeString("holidayCelebratedInPolity")), makeString("holiday Celebrated In Polity")), list(list(makeString("keStrongSuggestionPreds")), makeString("ke Strong Suggestion Preds")), list(list(makeString("containsModules")), makeString("contains Modules")), list(list(makeString("targetPosture")), makeString("target Posture")), list(list(makeString("spatiallyIntersects")), makeString("spatially Intersects")), list(list(makeString("interArgReln2-3")), makeString("inter Arg Reln 2 3")), list(list(makeString("totalMerchantMarine-Mass")), makeString("total Merchant Marine Mass")), list(list(makeString("regionLacksTransportMeans")), makeString("region Lacks Transport Means")), list(list(makeString("taskUsesContributionsOf")), makeString("task Uses Contributions Of")), list(list(makeString("holdsSometimeDuring")), makeString("holds Sometime During")), list(list(makeString("affiliatedOrganizations")), makeString("affiliated Organizations")), list(list(makeString("succeedingIntervalType")), makeString("succeeding Interval Type")), list(list(makeString("quantitySubsumes")), makeString("quantity Subsumes")), list(list(makeString("glfNodeSemantics-Underspecified")), makeString("glf Node Semantics Underspecified")), list(list(makeString("wornWithGarmentType")), makeString("worn With Garment Type")), list(list(makeString("presentInRegion")), makeString("present In Region")), list(list(makeString("participantIn")), makeString("participant In")), list(list(makeString("gunTakesAmmunition")), makeString("gun Takes Ammunition")), list(list(makeString("multiplierTypeForQuantityType")), makeString("multiplier Type For Quantity Type")), list(list(makeString("posPredForTemplateCategory")), makeString("pos Pred For Template Category")), list(list(makeString("styleOfMusicPerformer")), makeString("style Of Music Performer")), list(list(makeString("capitalCity")), makeString("capital City")), list(list(makeString("taskTypeCommensurateWithOpType")), makeString("task Type Commensurate With Op Type")), list(list(makeString("chemicalCASRegistry")), makeString("chemical CAS Registry")), list(list(makeString("typeAssociatedPaymentPlan")), makeString("type Associated Payment Plan")), list(list(makeString("colorHasBrightness")), makeString("color Has Brightness")), list(list(makeString("urgeTypeSatisfied")), makeString("urge Type Satisfied")), list(list(makeString("partitionedIntoSpecPreds")), makeString("partitioned Into Spec Preds")), list(list(makeString("typeIngredientTypes")), makeString("type Ingredient Types")), list(list(makeString("singular")), makeString("singular")), list(list(makeString("movieActors")), makeString("movie Actors")), list(list(makeString("physicalExtent")), makeString("physical Extent")), list(list(makeString("versionOfProductBrand")), makeString("version Of Product Brand")), list(list(makeString("ageOfAgentWhenJoinedJihad")), makeString("age Of Agent When Joined Jihad")), list(list(makeString("insMarketedAs")), makeString("ins Marketed As")), list(list(makeString("contemporaryInArg")), makeString("contemporary In Arg")), list(list(makeString("predominantLanguage")), makeString("predominant Language")), list(list(makeString("faultVulnerability-Installed")), makeString("fault Vulnerability Installed")), list(list(makeString("soleMakerOfProductType")), makeString("sole Maker Of Product Type")), list(list(makeString("orthography")), makeString("orthography")), list(list(makeString("inheritAllRolePlayers-SitTypeToSubSitType")), makeString("inherit All Role Players Sit Type To Sub Sit Type")), list(list(makeString("significantEventAcquaintance")), makeString("significant Event Acquaintance")), list(list(makeString("pennTagForPred")), makeString("penn Tag For Pred")), list(list(makeString("subWorks")), makeString("sub Works")), list(list(makeString("programRunningOn")), makeString("program Running On")), list(list(makeString("ksTermString")), makeString("ks Term String")), list(list(makeString("arg4Genl")), makeString("arg 4 Genl")), list(list(makeString("fieldsOfFormalEducation")), makeString("fields Of Formal Education")), list(list(makeString("permanentlyNorthwestOf")), makeString("permanently Northwest Of")), list(list(makeString("frequentlyInContactWith")), makeString("frequently In Contact With")), list(list(makeString("minorLeagueAffiliates")), makeString("minor League Affiliates")), list(list(makeString("testQuerySpecification")), makeString("test Query Specification")), list(list(makeString("parameterOfProgram")), makeString("parameter Of Program")), list(list(makeString("countryOfCity")), makeString("country Of City")), list(list(makeString("informationOrigin")), makeString("information Origin")), list(list(makeString("programFoundOnComputer")), makeString("program Found On Computer")), list(list(makeString("eatsWillingly")), makeString("eats Willingly")), list(list(makeString("meansOfDeployingAgent-BCW")), makeString("means Of Deploying Agent BCW")), list(list(makeString("exploitTargetsProgram")), makeString("exploit Targets Program")), list(list(makeString("characteristicActivityTypeOfOrganizationType")), makeString("characteristic Activity Type Of Organization Type")), list(list(makeString("typeGenls")), makeString("type Genls")), list(list(makeString("ethnicity")), makeString("ethnicity")), list(list(makeString("arg2NotIsa")), makeString("arg 2 Not Isa")), list(list(makeString("episodeType")), makeString("episode Type")), list(list(makeString("followingValue")), makeString("following Value")), list(list(makeString("variantOfSuffix")), makeString("variant Of Suffix")), list(list(makeString("formsBorderPart")), makeString("forms Border Part")), list(list(makeString("permanentlyEastOf")), makeString("permanently East Of")), list(list(makeString("testMetricsToGather")), makeString("test Metrics To Gather")), list(list(makeString("speechPartPreds")), makeString("speech Part Preds")), list(list(makeString("keWeakSuggestionPreds")), makeString("ke Weak Suggestion Preds")), list(list(makeString("spatiallyIntrinsicArg")), makeString("spatially Intrinsic Arg")), list(list(makeString("requiredArg1Pred")), makeString("required Arg 1 Pred")), list(list(makeString("highestEducationLevel")), makeString("highest Education Level")), list(list(makeString("occupation")), makeString("occupation")), list(list(makeString("expansion")), makeString("expansion")), list(list(makeString("agentStaysViableAfterDeployment-BCW")), makeString("agent Stays Viable After Deployment BCW")), list(list(makeString("pathogenWithRespectTo")), makeString("pathogen With Respect To")), list(list(makeString("facetBasedOnTypeBinaryPred")), makeString("facet Based On Type Binary Pred")), list(list(makeString("symmetricOn")), makeString("symmetric On")), list(list(makeString("dateLeftJihad")), makeString("date Left Jihad")), list(list(makeString("stateOfCounty")), makeString("state Of County")), list(list(makeString("agentTypeSellsProductType")), makeString("agent Type Sells Product Type")), list(list(makeString("faultVulnerability-Running")), makeString("fault Vulnerability Running")), list(list(makeString("temporallySubsumes-TypeType")), makeString("temporally Subsumes Type Type")), list(list(makeString("properSubSituationTypes")), makeString("proper Sub Situation Types")), list(list(makeString("intendedTargetTypeOfWeaponType")), makeString("intended Target Type Of Weapon Type")), list(list(makeString("lastProperSubSituationTypes")), makeString("last Proper Sub Situation Types")), list(list(makeString("homepage")), makeString("homepage")), list(list(makeString("pathogenSoleCauseOfInfectionType")), makeString("pathogen Sole Cause Of Infection Type")), list(list(makeString("bordersOn")), makeString("borders On")), list(list(makeString("activeIngredientsOfType")), makeString("active Ingredients Of Type")), list(list(makeString("commonFoodTypeOfCuisine")), makeString("common Food Type Of Cuisine")), list(list(makeString("interArgReln1-2")), makeString("inter Arg Reln 1 2")), list(list(makeString("eventTypeDurationOfEffects")), makeString("event Type Duration Of Effects")), list(list(makeString("nameString-NC")), makeString("name String NC")), list(list(makeString("correspondingMilitaryTaskType")), makeString("corresponding Military Task Type")), list(list(makeString("containsInformationAbout-Focally")), makeString("contains Information About Focally")), list(list(makeString("protectsAgainstType")), makeString("protects Against Type")), list(list(makeString("geopoliticalSubdivision")), makeString("geopolitical Subdivision")), list(list(makeString("domainExamplePredSentences")), makeString("domain Example Pred Sentences")), list(list(makeString("preferredEMailAddressText")), makeString("preferred E Mail Address Text")), list(list(makeString("subjectOfReport-Prop")), makeString("subject Of Report Prop")), list(list(makeString("keRequirementPreds")), makeString("ke Requirement Preds")), list(list(makeString("uniquePhysicalPartTypes")), makeString("unique Physical Part Types")), list(list(makeString("placeInCity")), makeString("place In City")), list(list(makeString("temporallyDisjointActionTypes")), makeString("temporally Disjoint Action Types")), list(list(makeString("indicatedDrug")), makeString("indicated Drug")), list(list(makeString("alias")), makeString("alias")), list(list(makeString("centralReferencePoint")), makeString("central Reference Point")), list(list(makeString("agentive-Sg")), makeString("agentive-Sg")), list(list(makeString("partitionedInto")), makeString("partitioned Into")), list(list(makeString("urlOfCW")), makeString("url Of CW")), list(list(makeString("socialClass")), makeString("social Class")), list(list(makeString("languageSpoken")), makeString("language Spoken")), list(list(makeString("faultVulnerability-Remote")), makeString("fault Vulnerability Remote")), list(list(makeString("totalMerchantMarine-Volume")), makeString("total Merchant Marine Volume")), list(list(makeString("permanentlyNortheastOf")), makeString("permanently Northeast Of")), list(list(makeString("subLSymbolForModule")), makeString("sub L Symbol For Module")), list(list(makeString("arg5Isa")), makeString("arg 5 Isa")), list(list(makeString("dateOfDeathEvent")), makeString("date Of Death Event")), list(list(makeString("altitudeOfHighestPointIs")), makeString("altitude Of Highest Point Is")), list(list(makeString("eventTypeCausedDeathOf")), makeString("event Type Caused Death Of")), list(list(makeString("territoriesControlled")), makeString("territories Controlled")), list(list(makeString("possessiveRelation")), makeString("possessive Relation")), list(list(makeString("colorHasRGBRedValue")), makeString("color Has RGB Red Value")), list(list(makeString("keStrongSuggestion")), makeString("ke Strong Suggestion")), list(list(makeString("characteristicActivityTypeOfPersonType-Frequently")), makeString("characteristic Activity Type Of Person Type Frequently")), list(list(makeString("architecturalStyle")), makeString("architectural Style")), list(list(makeString("sharedNotes")), makeString("shared Notes")), list(list(makeString("frequentPrototypicalActivityTypeOfPersonType")), makeString("frequent Prototypical Activity Type Of Person Type")), list(list(makeString("ableToControl")), makeString("able To Control")), list(list(makeString("colorHasRGBBlueValue")), makeString("color Has RGB Blue Value")), list(list(makeString("distributionMedium")), makeString("distribution Medium")), list(list(makeString("subOrgs-Command")), makeString("sub Orgs Command")), list(list(makeString("culturalRegionOfOrigin")), makeString("cultural Region Of Origin")), list(list(makeString("qaWebString")), makeString("qa Web String")), list(list(makeString("arg4Isa")), makeString("arg 4 Isa")), list(list(makeString("programStrings")), makeString("program Strings")), list(list(makeString("colorHasRGBGreenValue")), makeString("color Has RGB Green Value")), list(list(makeString("exampleNATs")), makeString("example NATs")), list(list(makeString("ethnicGroupsHere")), makeString("ethnic Groups Here")), list(list(makeString("unitDefinition")), makeString("unit Definition")), list(list(makeString("interArgReln1-3")), makeString("inter Arg Reln 1 3")), list(list(makeString("actionTypeExpressesFeelingType")), makeString("action Type Expresses Feeling Type")), list(list(makeString("genreHeyday")), makeString("genre Heyday")), list(list(makeString("structureInArea")), makeString("structure In Area")), list(list(makeString("uppercaseOfLowercase")), makeString("uppercase Of Lowercase")), list(list(makeString("eMailAddressText")), makeString("E Mail Address Text")), list(list(makeString("quotedArgument")), makeString("quoted Argument")), list(list(makeString("focalActivityType")), makeString("focal Activity Type")), list(list(makeString("modalityFeatures")), makeString("modality Features")), list(list(makeString("mandatoryGameEquipmentType")), makeString("mandatory Game Equipment Type")), list(list(makeString("testResponsibleCyclist")), makeString("test Responsible Cyclist")), list(list(makeString("formulaForFormulaTemplate")), makeString("formula For Formula Template")), list(list(makeString("keInducedWeakSuggestionPreds")), makeString("ke Induced Weak Suggestion Preds")), list(list(makeString("specifiedSubsetOf")), makeString("specified Subset Of")), list(list(makeString("properSubEventTypes")), makeString("proper Sub Event Types")), list(list(makeString("dateJoinedJihad")), makeString("date Joined Jihad")), list(list(makeString("cycSubjectClumps")), makeString("cyc Subject Clumps")), list(list(makeString("presidentOfCountry")), makeString("president Of Country")), list(list(makeString("subLIdentifier")), makeString("sub L Identifier")), list(list(makeString("fileFoundOnComputer")), makeString("file Found On Computer")), list(list(makeString("inRegion")), makeString("in Region")), list(list(makeString("countryPhoneCode")), makeString("country Phone Code")), list(list(makeString("intendedTargetTypeOfAttack")), makeString("intended Target Type Of Attack")), list(list(makeString("politiesBorderEachOther")), makeString("polities Border Each Other")), list(list(makeString("predicatesSBHLDisjoinsModule")), makeString("predicates SBHL Disjoins Module")), list(list(makeString("reifiedUsingTool")), makeString("reified Using Tool")), list(list(makeString("arg3Isa")), makeString("arg 3 Isa")), list(list(makeString("predicatesSBHLTypeTest")), makeString("predicates SBHL Type Test")), list(list(makeString("arg3Genl")), makeString("arg 3 Genl")), list(list(makeString("arg2Genl")), makeString("arg 2 Genl")), list(list(makeString("middleNameInitial")), makeString("middle Name Initial")), list(list(makeString("hasAuthorityOver")), makeString("has Authority Over")), list(list(makeString("temporallyContains")), makeString("temporally Contains")), list(list(makeString("superTopics")), makeString("super Topics")), list(list(makeString("memberTypes")), makeString("member Types")), list(list(makeString("colorHasHue")), makeString("color Has Hue")), list(list(makeString("argsIsa")), makeString("args Isa")), list(list(makeString("arg1NotIsa")), makeString("arg 1 Not Isa")), list(list(makeString("mainTopic")), makeString("main Topic")), list(list(makeString("openEntryFormatInArgs")), makeString("open Entry Format In Args")), list(list(makeString("reformulateTemplateViaSpecification")), makeString("reformulate Template Via Specification")), list(list(makeString("terrainDecompositions")), makeString("terrain Decompositions")), list(list(makeString("infoTransferred")), makeString("info Transferred")), list(list(makeString("transportedInTypes")), makeString("transported In Types")), list(list(makeString("contradictoryPreds")), makeString("contradictory Preds")), list(list(makeString("agentTypeUsesArtifactType")), makeString("agent Type Uses Artifact Type")), list(list(makeString("genTemplate")), makeString("gen Template")), list(list(makeString("systemOfWriting")), makeString("system Of Writing")), list(list(makeString("uppercaseOfLetter")), makeString("uppercase Of Letter")), list(list(makeString("rolesForEventType")), makeString("roles For Event Type")), list(list(makeString("templateTopicPrefix")), makeString("template Topic Prefix")), list(list(makeString("jobClass")), makeString("job Class")), list(list(makeString("superEventTypes")), makeString("super Event Types")), list(list(makeString("iteratedProperSubSituationTypes")), makeString("iterated Proper Sub Situation Types")), list(list(makeString("keInducedStrongSuggestionPreds")), makeString("ke Induced Strong Suggestion Preds")), list(list(makeString("permanentlyNorthOf")), makeString("permanently North Of")), list(list(makeString("percentNaturalPopulationIncrease")), makeString("percent Natural Population Increase")), list(list(makeString("titleForFormulaTemplateType-String")), makeString("title For Formula Template Type String")), list(list(makeString("subcatFrameKeywords")), makeString("subcat Frame Keywords")), list(list(makeString("rewriteOf")), makeString("rewrite Of")), list(list(makeString("residenceOfOrganization")), makeString("residence Of Organization")), list(list(makeString("arg2Format")), makeString("arg 2 Format")), list(list(makeString("surroundsHorizontally")), makeString("surrounds Horizontally")), list(list(makeString("mostNotableIsa")), makeString("most Notable Isa")), list(list(makeString("styleOfArtist")), makeString("style Of Artist")), list(list(makeString("specializedEquipmentOfUnitType")), makeString("specialized Equipment Of Unit Type")), list(list(makeString("inTopic")), makeString("in Topic")), list(list(makeString("disjointWith")), makeString("disjoint With")), list(list(makeString("areasOfOrigin")), makeString("areas Of Origin")), list(list(makeString("conceptuallyRelated")), makeString("conceptually Related")), list(list(makeString("interArgReln2-4")), makeString("inter Arg Reln 2 4")), list(list(makeString("arg1Genl")), makeString("arg 1 Genl")), list(list(makeString("arg3Format")), makeString("arg 3 Format")), list(list(makeString("temporalBoundsContain")), makeString("temporal Bounds Contain")), list(list(makeString("agentTypeWorksAtLocationType")), makeString("agent Type Works At Location Type")), list(list(makeString("relationCategoryType")), makeString("relation Category Type")), list(list(makeString("mainSubjectClump")), makeString("main Subject Clump")), list(list(makeString("arg1Format")), makeString("arg 1 Format")), list(list(makeString("conceptuallyCoRelated")), makeString("conceptually Co Related")), list(list(makeString("genlFunctions")), makeString("genl Functions")), list(list(makeString("arg2Isa")), makeString("arg 2 Isa")), list(list(makeString("definitionalMtForTopicAssertions")), makeString("definitional Mt For Topic Assertions")), list(list(makeString("arg1Isa")), makeString("arg 1 Isa")), list(list(makeString("colorHasChroma")), makeString("color Has Chroma")), list(list(makeString("indigenousTo")), makeString("indigenous To")) });
    }

    @Override
    public void declareFunctions() {
        declare_string_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_string_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_string_utilities_file();
    }

    static {


























































































































































































































































    }

    public static final class $not_digit_char_p$UnaryFunction extends UnaryFunction {
        public $not_digit_char_p$UnaryFunction() {
            super(extractFunctionNamed("NOT-DIGIT-CHAR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return not_digit_char_p(arg1);
        }
    }

    public static final class $string_wXo_control_charsP$UnaryFunction extends UnaryFunction {
        public $string_wXo_control_charsP$UnaryFunction() {
            super(extractFunctionNamed("STRING-W/O-CONTROL-CHARS?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return string_wXo_control_charsP(arg1);
        }
    }

    public static final class $char_in_char_set$UnaryFunction extends UnaryFunction {
        public $char_in_char_set$UnaryFunction() {
            super(extractFunctionNamed("CHAR-IN-CHAR-SET"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return char_in_char_set(arg1);
        }
    }

    public static final class $whitespacep$UnaryFunction extends UnaryFunction {
        public $whitespacep$UnaryFunction() {
            super(extractFunctionNamed("WHITESPACEP"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return whitespacep(arg1);
        }
    }

    public static final class $cyclify_status_native extends SubLStructNative {
        public SubLObject $out_string_list;

        public SubLObject $references_added;

        public SubLObject $inside_quoteP;

        public SubLObject $inside_el_var_nameP;

        public SubLObject $already_cyclifiedP;

        public SubLObject $escapeP;

        public SubLObject $inside_subl_quote_fnP;

        public SubLObject $inside_expand_subl_fnP;

        public SubLObject $inside_expand_subl_fn_arg1P;

        public SubLObject $inside_expand_subl_fn_arg2P;

        public SubLObject $immediately_following_parenP;

        public SubLObject $paren_count;

        private static final SubLStructDeclNative structDecl;

        private $cyclify_status_native() {
            this.$out_string_list = Lisp.NIL;
            this.$references_added = Lisp.NIL;
            this.$inside_quoteP = Lisp.NIL;
            this.$inside_el_var_nameP = Lisp.NIL;
            this.$already_cyclifiedP = Lisp.NIL;
            this.$escapeP = Lisp.NIL;
            this.$inside_subl_quote_fnP = Lisp.NIL;
            this.$inside_expand_subl_fnP = Lisp.NIL;
            this.$inside_expand_subl_fn_arg1P = Lisp.NIL;
            this.$inside_expand_subl_fn_arg2P = Lisp.NIL;
            this.$immediately_following_parenP = Lisp.NIL;
            this.$paren_count = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$out_string_list;
        }

        @Override
        public SubLObject getField3() {
            return this.$references_added;
        }

        @Override
        public SubLObject getField4() {
            return this.$inside_quoteP;
        }

        @Override
        public SubLObject getField5() {
            return this.$inside_el_var_nameP;
        }

        @Override
        public SubLObject getField6() {
            return this.$already_cyclifiedP;
        }

        @Override
        public SubLObject getField7() {
            return this.$escapeP;
        }

        @Override
        public SubLObject getField8() {
            return this.$inside_subl_quote_fnP;
        }

        @Override
        public SubLObject getField9() {
            return this.$inside_expand_subl_fnP;
        }

        @Override
        public SubLObject getField10() {
            return this.$inside_expand_subl_fn_arg1P;
        }

        @Override
        public SubLObject getField11() {
            return this.$inside_expand_subl_fn_arg2P;
        }

        @Override
        public SubLObject getField12() {
            return this.$immediately_following_parenP;
        }

        @Override
        public SubLObject getField13() {
            return this.$paren_count;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$out_string_list = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$references_added = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$inside_quoteP = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$inside_el_var_nameP = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$already_cyclifiedP = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$escapeP = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$inside_subl_quote_fnP = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$inside_expand_subl_fnP = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$inside_expand_subl_fn_arg1P = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$inside_expand_subl_fn_arg2P = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$immediately_following_parenP = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$paren_count = value;
        }

        static {
            structDecl = makeStructDeclNative($cyclify_status_native.class, CYCLIFY_STATUS, CYCLIFY_STATUS_P, $list131, $list132, new String[]{ "$out_string_list", "$references_added", "$inside_quoteP", "$inside_el_var_nameP", "$already_cyclifiedP", "$escapeP", "$inside_subl_quote_fnP", "$inside_expand_subl_fnP", "$inside_expand_subl_fn_arg1P", "$inside_expand_subl_fn_arg2P", "$immediately_following_parenP", "$paren_count" }, $list133, $list134, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $cyclify_status_p$UnaryFunction extends UnaryFunction {
        public $cyclify_status_p$UnaryFunction() {
            super(extractFunctionNamed("CYCLIFY-STATUS-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyclify_status_p(arg1);
        }
    }
}

/**
 * Total time: 2805 ms
 */
