package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_D;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_L;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_M;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_P;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_a;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_backquote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_c;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_d;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_e;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_escape;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_exclamation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_f;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_h;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_i;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_l;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lbrace;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lbracket;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_less;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_m;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_n;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_o;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_question;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_r;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rbrace;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rbracket;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_s;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_semicolon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_t;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_u;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_underbar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_v;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_w;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.vectorp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.caar;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.clear_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.input_stream_p;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
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
 public final class document extends SubLTranslatedFile {
    public static final SubLFile me = new document();

    public static final String myName = "com.cyc.cycjava.cycl.document";

    public static final String myFingerPrint = "0c990c2d5b2bde35aa873e61ee349c4bd4a0140faac5f391c4d35c84b23a301f";

    // defparameter
    // Definitions
    // The maximal number of NL items printed of the various NL text classes
    private static final SubLSymbol $text_class_print_length$ = makeSymbol("*TEXT-CLASS-PRINT-LENGTH*");

    // defconstant
    // the number of spaces an XML level should be indented
    private static final SubLSymbol $xml_indent_level$ = makeSymbol("*XML-INDENT-LEVEL*");

    // defconstant
    // an XML indent string
    private static final SubLSymbol $xml_indent$ = makeSymbol("*XML-INDENT*");

    // defconstant
    // a newline string
    private static final SubLSymbol $newline$ = makeSymbol("*NEWLINE*");

    // defconstant
    private static final SubLSymbol $xml_string_mapping$ = makeSymbol("*XML-STRING-MAPPING*");

    // defconstant
    public static final SubLSymbol $dtp_sign$ = makeSymbol("*DTP-SIGN*");

    // defparameter
    public static final SubLSymbol $wordifier$ = makeSymbol("*WORDIFIER*");

    // deflexical
    private static final SubLSymbol $fst_string_wordify_lock$ = makeSymbol("*FST-STRING-WORDIFY-LOCK*");



    // defconstant
    public static final SubLSymbol $dtp_html_string_wordify_state$ = makeSymbol("*DTP-HTML-STRING-WORDIFY-STATE*");

    // defconstant
    public static final SubLSymbol $dtp_paragraph$ = makeSymbol("*DTP-PARAGRAPH*");

    // defconstant
    public static final SubLSymbol $dtp_document$ = makeSymbol("*DTP-DOCUMENT*");

    // defparameter
    public static final SubLSymbol $perform_dot_analysis_on_docs$ = makeSymbol("*PERFORM-DOT-ANALYSIS-ON-DOCS*");

    // defparameter
    private static final SubLSymbol $wordifier_fst$ = makeSymbol("*WORDIFIER-FST*");

    // defparameter
    private static final SubLSymbol $sentencifier_fst$ = makeSymbol("*SENTENCIFIER-FST*");

    // defparameter
    private static final SubLSymbol $paragraphier_fst$ = makeSymbol("*PARAGRAPHIER-FST*");

    // defparameter
    // The end of sentence marker
    private static final SubLSymbol $eos_char$ = makeSymbol("*EOS-CHAR*");

    // defparameter
    // The end-of-sentence marker
    private static final SubLSymbol $eos$ = makeSymbol("*EOS*");

    // defparameter
    // sentence-ending punctuation
    private static final SubLSymbol $p$ = makeSymbol("*P*");

    // defparameter
    // after-punctuation sentence enders
    private static final SubLSymbol $ap$ = makeSymbol("*AP*");

    // defparameter
    // punctuation + after punctuation
    private static final SubLSymbol $pap$ = makeSymbol("*PAP*");

    // defparameter
    private static final SubLSymbol $people$ = makeSymbol("*PEOPLE*");

    // defparameter
    private static final SubLSymbol $army$ = makeSymbol("*ARMY*");

    // defparameter
    private static final SubLSymbol $companies$ = makeSymbol("*COMPANIES*");

    // defparameter
    private static final SubLSymbol $places$ = makeSymbol("*PLACES*");

    // defparameter
    private static final SubLSymbol $months$ = makeSymbol("*MONTHS*");

    // defparameter
    private static final SubLSymbol $misc$ = makeSymbol("*MISC*");

    // defparameter
    private static final SubLSymbol $abbreviations$ = makeSymbol("*ABBREVIATIONS*");

    // defparameter
    private static final SubLSymbol $mark_eos_regular_expressions$ = makeSymbol("*MARK-EOS-REGULAR-EXPRESSIONS*");

    // defparameter
    private static final SubLSymbol $remove_false_eos_regular_expressions1$ = makeSymbol("*REMOVE-FALSE-EOS-REGULAR-EXPRESSIONS1*");

    // defparameter
    private static final SubLSymbol $remove_false_eos_regular_expressions2$ = makeSymbol("*REMOVE-FALSE-EOS-REGULAR-EXPRESSIONS2*");

    // defparameter
    private static final SubLSymbol $split_unsplit_stuff_regular_expressions$ = makeSymbol("*SPLIT-UNSPLIT-STUFF-REGULAR-EXPRESSIONS*");

    // defparameter
    // pattern/substitution pairs to be applied to the input text in sequence
    private static final SubLSymbol $sentencifier_patterns$ = makeSymbol("*SENTENCIFIER-PATTERNS*");

    // Internal Constants
    public static final SubLList $list0 = list(cons(makeString("<"), makeString("&lt;")), cons(makeString("&"), makeString("&amp;")), cons(makeString(">"), makeString("&gt;")), cons(makeString("\""), makeString("&quot;")), cons(makeString("'"), makeString("&apos;")));

    public static final SubLSymbol SIGN = makeSymbol("SIGN");

    public static final SubLSymbol SIGN_P = makeSymbol("SIGN-P");

    public static final SubLList $list3 = list(makeSymbol("STRING"), makeSymbol("TYPE"), makeSymbol("INFO"), makeSymbol("CATEGORY"), makeSymbol("CONSTITUENTS"), makeSymbol("OFFSET"), makeSymbol("MOTHER"));

    public static final SubLList $list4 = list(makeKeyword("STRING"), makeKeyword("TYPE"), makeKeyword("INFO"), makeKeyword("CATEGORY"), makeKeyword("CONSTITUENTS"), makeKeyword("OFFSET"), makeKeyword("MOTHER"));

    public static final SubLList $list5 = list(makeSymbol("SIGN-STRING"), makeSymbol("SIGN-TYPE"), makeSymbol("SIGN-INFO"), makeSymbol("SIGN-CATEGORY"), makeSymbol("SIGN-CONSTITUENTS"), makeSymbol("SIGN-OFFSET"), makeSymbol("SIGN-MOTHER"));

    public static final SubLList $list6 = list(makeSymbol("_CSETF-SIGN-STRING"), makeSymbol("_CSETF-SIGN-TYPE"), makeSymbol("_CSETF-SIGN-INFO"), makeSymbol("_CSETF-SIGN-CATEGORY"), makeSymbol("_CSETF-SIGN-CONSTITUENTS"), makeSymbol("_CSETF-SIGN-OFFSET"), makeSymbol("_CSETF-SIGN-MOTHER"));

    public static final SubLSymbol SIGN_PRINT = makeSymbol("SIGN-PRINT");

    public static final SubLSymbol SIGN_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SIGN-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SIGN-P"));

    private static final SubLSymbol SIGN_STRING = makeSymbol("SIGN-STRING");

    private static final SubLSymbol _CSETF_SIGN_STRING = makeSymbol("_CSETF-SIGN-STRING");

    private static final SubLSymbol SIGN_TYPE = makeSymbol("SIGN-TYPE");

    private static final SubLSymbol _CSETF_SIGN_TYPE = makeSymbol("_CSETF-SIGN-TYPE");

    private static final SubLSymbol SIGN_INFO = makeSymbol("SIGN-INFO");

    private static final SubLSymbol _CSETF_SIGN_INFO = makeSymbol("_CSETF-SIGN-INFO");

    private static final SubLSymbol SIGN_CATEGORY = makeSymbol("SIGN-CATEGORY");

    private static final SubLSymbol _CSETF_SIGN_CATEGORY = makeSymbol("_CSETF-SIGN-CATEGORY");

    private static final SubLSymbol SIGN_CONSTITUENTS = makeSymbol("SIGN-CONSTITUENTS");

    private static final SubLSymbol _CSETF_SIGN_CONSTITUENTS = makeSymbol("_CSETF-SIGN-CONSTITUENTS");

    private static final SubLSymbol SIGN_OFFSET = makeSymbol("SIGN-OFFSET");

    private static final SubLSymbol _CSETF_SIGN_OFFSET = makeSymbol("_CSETF-SIGN-OFFSET");

    private static final SubLSymbol SIGN_MOTHER = makeSymbol("SIGN-MOTHER");

    private static final SubLSymbol _CSETF_SIGN_MOTHER = makeSymbol("_CSETF-SIGN-MOTHER");















    private static final SubLString $str31$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_SIGN = makeSymbol("MAKE-SIGN");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SIGN_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SIGN-METHOD");



    private static final SubLString $str38$ = makeString("");

    private static final SubLSymbol SXHASH_SIGN_METHOD = makeSymbol("SXHASH-SIGN-METHOD");

    private static final SubLString $str40$__ = makeString("#<");

    public static final SubLString $str41$_ = makeString("(");

    public static final SubLString $str42$_ = makeString(")");

    private static final SubLString $str43$__ = makeString(": ");

    private static final SubLString $str44$_ = makeString("\"");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str46$____ = makeString(" ...");

    private static final SubLString $str47$_ = makeString("/");

    private static final SubLString $str48$_ = makeString(">");







    private static final SubLString $str52$Attempt_to_set_the_non_existing_s = makeString("Attempt to set the non-existing slot ~a");

    private static final SubLList $list53 = list(list(makeSymbol("CONSTITUENT"), makeSymbol("SIGN")), makeSymbol("&BODY"), makeSymbol("BODY"));









    private static final SubLString $str58$Unknown_sign_subclass__a = makeString("Unknown sign subclass ~a");



    private static final SubLList $list60 = list(makeKeyword("W"), makeKeyword("XW"));

    private static final SubLSymbol WORD_P = makeSymbol("WORD-P");

    private static final SubLSymbol EXHAUSTIVE_WORD_P = makeSymbol("EXHAUSTIVE-WORD-P");











    private static final SubLSymbol RKF_STANDARD_STRING_WORDIFY = makeSymbol("RKF-STANDARD-STRING-WORDIFY");

    private static final SubLString $str69$fst_string_wordify_lock = makeString("fst-string-wordify-lock");

    private static final SubLSymbol $sym70$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol RKF_CH_STRING_TOKENIZE = makeSymbol("RKF-CH-STRING-TOKENIZE");

    private static final SubLSymbol STANDARD_STRING_TOKENIZE = makeSymbol("STANDARD-STRING-TOKENIZE");

    private static final SubLSymbol SPLIT_STRING = makeSymbol("SPLIT-STRING");

    private static final SubLSymbol HTML_STRING_WORDIFY_PUNCTUATION_CHARS = makeSymbol("HTML-STRING-WORDIFY-PUNCTUATION-CHARS");

    private static final SubLSymbol $html_string_wordify_punctuation_chars_caching_state$ = makeSymbol("*HTML-STRING-WORDIFY-PUNCTUATION-CHARS-CACHING-STATE*");

    private static final SubLSymbol HTML_STRING_WORDIFY_STATE = makeSymbol("HTML-STRING-WORDIFY-STATE");

    private static final SubLSymbol HTML_STRING_WORDIFY_STATE_P = makeSymbol("HTML-STRING-WORDIFY-STATE-P");

    private static final SubLList $list80 = list(makeSymbol("STATE"), makeSymbol("TAG-PIECES"), makeSymbol("STRING-PIECES"), makeSymbol("PUNCTUATION-PIECES"), makeSymbol("LEADING-TAGS"), makeSymbol("FOLLOWING-TAGS"), makeSymbol("CURRENT-OFFSET"));

    private static final SubLList $list81 = list(makeKeyword("STATE"), makeKeyword("TAG-PIECES"), makeKeyword("STRING-PIECES"), makeKeyword("PUNCTUATION-PIECES"), makeKeyword("LEADING-TAGS"), makeKeyword("FOLLOWING-TAGS"), makeKeyword("CURRENT-OFFSET"));

    private static final SubLList $list82 = list(makeSymbol("HSW-STATE-STATE"), makeSymbol("HSW-STATE-TAG-PIECES"), makeSymbol("HSW-STATE-STRING-PIECES"), makeSymbol("HSW-STATE-PUNCTUATION-PIECES"), makeSymbol("HSW-STATE-LEADING-TAGS"), makeSymbol("HSW-STATE-FOLLOWING-TAGS"), makeSymbol("HSW-STATE-CURRENT-OFFSET"));

    private static final SubLList $list83 = list(makeSymbol("_CSETF-HSW-STATE-STATE"), makeSymbol("_CSETF-HSW-STATE-TAG-PIECES"), makeSymbol("_CSETF-HSW-STATE-STRING-PIECES"), makeSymbol("_CSETF-HSW-STATE-PUNCTUATION-PIECES"), makeSymbol("_CSETF-HSW-STATE-LEADING-TAGS"), makeSymbol("_CSETF-HSW-STATE-FOLLOWING-TAGS"), makeSymbol("_CSETF-HSW-STATE-CURRENT-OFFSET"));

    private static final SubLSymbol PRINT_HSW_STATE = makeSymbol("PRINT-HSW-STATE");

    private static final SubLSymbol HTML_STRING_WORDIFY_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HTML-STRING-WORDIFY-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list86 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("HTML-STRING-WORDIFY-STATE-P"));

    private static final SubLSymbol HSW_STATE_STATE = makeSymbol("HSW-STATE-STATE");

    private static final SubLSymbol _CSETF_HSW_STATE_STATE = makeSymbol("_CSETF-HSW-STATE-STATE");

    private static final SubLSymbol HSW_STATE_TAG_PIECES = makeSymbol("HSW-STATE-TAG-PIECES");

    private static final SubLSymbol _CSETF_HSW_STATE_TAG_PIECES = makeSymbol("_CSETF-HSW-STATE-TAG-PIECES");

    private static final SubLSymbol HSW_STATE_STRING_PIECES = makeSymbol("HSW-STATE-STRING-PIECES");

    private static final SubLSymbol _CSETF_HSW_STATE_STRING_PIECES = makeSymbol("_CSETF-HSW-STATE-STRING-PIECES");

    private static final SubLSymbol HSW_STATE_PUNCTUATION_PIECES = makeSymbol("HSW-STATE-PUNCTUATION-PIECES");

    private static final SubLSymbol _CSETF_HSW_STATE_PUNCTUATION_PIECES = makeSymbol("_CSETF-HSW-STATE-PUNCTUATION-PIECES");

    private static final SubLSymbol HSW_STATE_LEADING_TAGS = makeSymbol("HSW-STATE-LEADING-TAGS");

    private static final SubLSymbol _CSETF_HSW_STATE_LEADING_TAGS = makeSymbol("_CSETF-HSW-STATE-LEADING-TAGS");

    private static final SubLSymbol HSW_STATE_FOLLOWING_TAGS = makeSymbol("HSW-STATE-FOLLOWING-TAGS");

    private static final SubLSymbol _CSETF_HSW_STATE_FOLLOWING_TAGS = makeSymbol("_CSETF-HSW-STATE-FOLLOWING-TAGS");

    private static final SubLSymbol HSW_STATE_CURRENT_OFFSET = makeSymbol("HSW-STATE-CURRENT-OFFSET");

    private static final SubLSymbol _CSETF_HSW_STATE_CURRENT_OFFSET = makeSymbol("_CSETF-HSW-STATE-CURRENT-OFFSET");















    private static final SubLSymbol MAKE_HTML_STRING_WORDIFY_STATE = makeSymbol("MAKE-HTML-STRING-WORDIFY-STATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_HTML_STRING_WORDIFY_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-HTML-STRING-WORDIFY-STATE-METHOD");

    private static final SubLString $str110$__S__S_ = makeString("<~S ~S>");

    private static final SubLList $list111 = list(makeKeyword("STATE"), makeKeyword("NORMAL"), makeKeyword("CURRENT-OFFSET"), ZERO_INTEGER);



    private static final SubLSymbol $END_OF_TAG = makeKeyword("END-OF-TAG");

    private static final SubLSymbol $START_OF_TAG = makeKeyword("START-OF-TAG");









    public static final SubLList $list119 = list(makeKeyword("DEFAULT"), makeKeyword("START-OF-TAG"), makeKeyword("SPACE"));

    private static final SubLString $str120$Unknown_state___S = makeString("Unknown state: ~S");



    private static final SubLSymbol HTML_STRING_WORDIFY = makeSymbol("HTML-STRING-WORDIFY");



    private static final SubLSymbol FST_STRING_WORDIFY = makeSymbol("FST-STRING-WORDIFY");



    private static final SubLSymbol FST_WORDIFY_TEST = makeSymbol("FST-WORDIFY-TEST");











    private static final SubLList $list132 = list(new SubLObject[]{ list(list(makeString("2.4 cm")), list(makeString("2.4"), makeString("cm"))), list(list(makeString("Mr. Bill Clinton, president of the Clinton Foundation, met George W. Bush and gave him $400,000.00")), list(new SubLObject[]{ makeString("Mr."), makeString("Bill"), makeString("Clinton"), makeString(","), makeString("president"), makeString("of"), makeString("the"), makeString("Clinton"), makeString("Foundation"), makeString(","), makeString("met"), makeString("George"), makeString("W"), makeString("."), makeString("Bush"), makeString("and"), makeString("gave"), makeString("him"), makeString("$"), makeString("400,000.00"), makeSymbol(">") })), list(list(makeString("C.I.A. director Patrick Henry said, \"Give me liberty or give me death!\"")), list(new SubLObject[]{ makeString("C.I.A."), makeString("director"), makeString("Patrick"), makeString("Henry"), makeString("said"), makeString(","), makeString("\""), makeString("Give"), makeString("me"), makeString("liberty"), makeString("or"), makeString("give"), makeString("me"), makeString("death"), makeString("!"), makeString("\""), makeSymbol(">") })), list(list(makeString("I have -1 apples and 1-4 cats")), list(makeString("I"), makeString("have"), makeString("-"), makeString("1"), makeString("apples"), makeString("and"), makeString("1-4"), makeString("cats"))), list(list(makeString("I like cats.  You like zebras.")), list(new SubLObject[]{ makeString("I"), makeString("like"), makeString("cats"), makeString("."), makeString("You"), makeString("like"), makeString("zebras"), makeString("."), makeSymbol(">") })), list(list(makeString("I work for the C.I.A.  Where do you work?")), list(new SubLObject[]{ makeString("I"), makeString("work"), makeString("for"), makeString("the"), makeString("C.I.A."), makeString("Where"), makeString("do"), makeString("you"), makeString("work"), makeString("?") })), list(list(makeString("couldn't eat")), list(makeString("could"), makeString("n't"), makeString("eat"))), list(list(makeString("3^4")), list(makeString("3"), makeString("^"), makeString("4"))), list(list(makeString("bit-o'-honey")), list(makeString("bit-o"), makeString("'"), makeString("-"), makeString("honey"))), list(list(makeString("can't eat")), list(makeString("ca"), makeString("n't"), makeString("eat"))) });

    private static final SubLString $str133$_a_WRD_a__a__WRD__a = makeString("~a<WRD~a>~a</WRD>~a");

    private static final SubLString $str134$_tag__ = makeString(" tag=\"");

    public static final SubLList $list135 = list(makeString("."), makeString("!"), makeString("?"));

    private static final SubLList $list136 = list(makeString("\""), makeString("'"), makeString("`"));

    private static final SubLString $str137$_ = makeString("\n");

    private static final SubLList $list138 = list(new SubLObject[]{ makeString("."), makeString(","), makeString(";"), makeString(":"), makeString("?"), makeString("!"), makeString("-"), makeString("--"), makeString("---"), makeString("("), makeString(")"), makeString("["), makeString("]"), makeString("{"), makeString("}"), makeString("\""), makeString("'"), makeString("`") });

    private static final SubLList $list139 = list(CHAR_period, CHAR_question, CHAR_exclamation);

    public static final SubLList $list140 = list(new SubLObject[]{ CHAR_comma, CHAR_semicolon, CHAR_colon, CHAR_quote, CHAR_lparen, CHAR_rparen, CHAR_lbrace, CHAR_rbrace, CHAR_lbracket, CHAR_rbracket, CHAR_hyphen });

    public static final SubLList $list141 = list(CHAR_quotation, CHAR_quote, CHAR_backquote);

    private static final SubLSymbol PHRASE_P = makeSymbol("PHRASE-P");

    public static final SubLList $list143 = list(list(makeSymbol("CONSTITUENT"), makeSymbol("PHRASE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol SIGN_DO_CONSTITUENTS = makeSymbol("SIGN-DO-CONSTITUENTS");

    private static final SubLString $str145$_a_PHR_a__a_a_a__PHR__a = makeString("~a<PHR~a>~a~a~a</PHR>~a");

    private static final SubLString $str146$_cat__ = makeString(" cat=\"");

    private static final SubLList $list147 = list(list(makeSymbol("WORD"), makeSymbol("SENTENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol SENTENCE_YIELD_EXHAUSTIVE = makeSymbol("SENTENCE-YIELD-EXHAUSTIVE");

    private static final SubLSymbol SENTENCE_YIELD = makeSymbol("SENTENCE-YIELD");



    public static final SubLList $list152 = list(makeKeyword("OFFSET"), ZERO_INTEGER);



    private static final SubLList $list154 = list(list(makeSymbol("CONSTITUENT"), makeSymbol("SENTENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol PUNCTUATION_SIGN_P = makeSymbol("PUNCTUATION-SIGN-P");



    private static final SubLSymbol PARAGRAPH_P = makeSymbol("PARAGRAPH-P");

    private static final SubLList $list159 = list(makeSymbol("SENTENCES"), makeSymbol("MOTHER"));

    private static final SubLList $list160 = list(makeKeyword("SENTENCES"), makeKeyword("MOTHER"));

    public static final SubLList $list161 = list(makeSymbol("PARAGRAPH-SENTENCES"), makeSymbol("PARAGRAPH-MOTHER"));

    public static final SubLList $list162 = list(makeSymbol("_CSETF-PARAGRAPH-SENTENCES"), makeSymbol("_CSETF-PARAGRAPH-MOTHER"));

    private static final SubLSymbol PARAGRAPH_PRINT = makeSymbol("PARAGRAPH-PRINT");

    private static final SubLSymbol PARAGRAPH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PARAGRAPH-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list165 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PARAGRAPH-P"));

    private static final SubLSymbol PARAGRAPH_SENTENCES = makeSymbol("PARAGRAPH-SENTENCES");

    private static final SubLSymbol _CSETF_PARAGRAPH_SENTENCES = makeSymbol("_CSETF-PARAGRAPH-SENTENCES");

    private static final SubLSymbol PARAGRAPH_MOTHER = makeSymbol("PARAGRAPH-MOTHER");

    private static final SubLSymbol _CSETF_PARAGRAPH_MOTHER = makeSymbol("_CSETF-PARAGRAPH-MOTHER");



    private static final SubLSymbol MAKE_PARAGRAPH = makeSymbol("MAKE-PARAGRAPH");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PARAGRAPH_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PARAGRAPH-METHOD");

    private static final SubLList $list173 = list(list(makeSymbol("SENTENCE"), makeSymbol("PARAGRAPH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list174 = list(list(makeSymbol("WORD"), makeSymbol("PARAGRAPH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym175$SENTENCE = makeUninternedSymbol("SENTENCE");

    private static final SubLSymbol PARAGRAPH_DO_SENTENCES = makeSymbol("PARAGRAPH-DO-SENTENCES");

    private static final SubLSymbol SENTENCE_DO_WORDS = makeSymbol("SENTENCE-DO-WORDS");

    private static final SubLSymbol $sym178$SENTENCE = makeUninternedSymbol("SENTENCE");

    private static final SubLSymbol SENTENCE_DO_MINIMAL_WORDS = makeSymbol("SENTENCE-DO-MINIMAL-WORDS");

    private static final SubLString $str180$__PAR_ = makeString("#<PAR:");

    private static final SubLString $str181$_PAR_ = makeString("<PAR>");

    private static final SubLString $str182$__PAR_ = makeString("</PAR>");



    private static final SubLSymbol DOCUMENT_P = makeSymbol("DOCUMENT-P");

    private static final SubLList $list185 = list(makeSymbol("PARAGRAPHS"));

    public static final SubLList $list186 = list(makeKeyword("PARAGRAPHS"));

    public static final SubLList $list187 = list(makeSymbol("DOCUMENT-PARAGRAPHS"));

    private static final SubLList $list188 = list(makeSymbol("_CSETF-DOCUMENT-PARAGRAPHS"));

    private static final SubLSymbol DOCUMENT_PRINT = makeSymbol("DOCUMENT-PRINT");

    private static final SubLSymbol DOCUMENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("DOCUMENT-PRINT-FUNCTION-TRAMPOLINE");

    public static final SubLList $list191 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("DOCUMENT-P"));

    private static final SubLSymbol DOCUMENT_PARAGRAPHS = makeSymbol("DOCUMENT-PARAGRAPHS");

    private static final SubLSymbol _CSETF_DOCUMENT_PARAGRAPHS = makeSymbol("_CSETF-DOCUMENT-PARAGRAPHS");



    private static final SubLSymbol MAKE_DOCUMENT = makeSymbol("MAKE-DOCUMENT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_DOCUMENT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-DOCUMENT-METHOD");

    private static final SubLString $str197$_A_is_neither_a_string_nor_a_stre = makeString("~A is neither a string nor a stream in NEW-DOCUMENT.");

    public static final SubLList $list198 = list(list(makeSymbol("PARAGRAPH"), makeSymbol("DOCUMENT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list199 = list(list(makeSymbol("SENTENCE"), makeSymbol("DOCUMENT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym200$PARAGRAPH = makeUninternedSymbol("PARAGRAPH");

    private static final SubLSymbol DOCUMENT_DO_PARAGRAPHS = makeSymbol("DOCUMENT-DO-PARAGRAPHS");

    private static final SubLString $str202$_ = makeString(".");

    public static final SubLList $list203 = list(makeSymbol("FIRST-WORD"), makeSymbol("SECOND-WORD"), makeSymbol("SENT"));



    private static final SubLString $str205$Unable_to_open__S = makeString("Unable to open ~S");



    private static final SubLString $str207$__DOC_ = makeString("#<DOC:");

    private static final SubLString $str208$Sentence_index__A_out_of_bounds_ = makeString("Sentence index ~A out of bounds.");

    private static final SubLString $str209$_DOC_ = makeString("<DOC>");

    private static final SubLString $str210$__DOC_ = makeString("</DOC>");

    private static final SubLList $list211 = list(list(makeSymbol("WORD"), makeSymbol("DOCUMENT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym212$SENTENCE = makeUninternedSymbol("SENTENCE");

    private static final SubLSymbol DOCUMENT_DO_SENTENCES = makeSymbol("DOCUMENT-DO-SENTENCES");

    private static final SubLSymbol $sym214$SENTENCE = makeUninternedSymbol("SENTENCE");

    private static final SubLString $str215$can_t_create_sentence_iterator_fo = makeString("can't create sentence iterator for ~a");



    public static final SubLList $list217 = list(makeInteger(247), makeInteger(215));

    private static final SubLInteger $int$192 = makeInteger(192);

    private static final SubLInteger $int$591 = makeInteger(591);

    private static final SubLList $list220 = list(TWO_INTEGER);

    public static final SubLList $list221 = list(ZERO_INTEGER, CHAR_newline, list(makeKeyword("EMIT")), TWO_INTEGER);



    public static final SubLList $list223 = list(NIL, ZERO_INTEGER);

    public static final SubLList $list224 = list(ZERO_INTEGER, CHAR_M, list(makeKeyword("EMIT")), ELEVEN_INTEGER);

    public static final SubLList $list225 = list(ZERO_INTEGER, CHAR_D, list(makeKeyword("EMIT")), FOURTEEN_INTEGER);

    private static final SubLList $list226 = list(ZERO_INTEGER, CHAR_P, list(makeKeyword("EMIT")), SIXTEEN_INTEGER);

    public static final SubLList $list227 = list(ZERO_INTEGER, CHAR_L, list(makeKeyword("EMIT")), NINETEEN_INTEGER);

    public static final SubLList $list228 = list(ZERO_INTEGER, CHAR_n, list(makeKeyword("EMIT")), makeInteger(30));

    private static final SubLList $list229 = list(ZERO_INTEGER, CHAR_w, list(makeKeyword("EMIT")), makeInteger(32));

    public static final SubLList $list230 = list(ZERO_INTEGER, CHAR_h, list(makeKeyword("EMIT")), makeInteger(33));

    public static final SubLList $list231 = list(ZERO_INTEGER, CHAR_c, list(makeKeyword("EMIT")), makeInteger(36));

    public static final SubLList $list232 = list(ZERO_INTEGER, CHAR_i, list(makeKeyword("EMIT")), makeInteger(40));

    public static final SubLList $list233 = list(ZERO_INTEGER, CHAR_a, list(makeKeyword("EMIT")), makeInteger(48));

    private static final SubLSymbol ALPHABETIC_CHAR_OR_CHARACTER_CODE_P = makeSymbol("ALPHABETIC-CHAR-OR-CHARACTER-CODE-P");

    public static final SubLList $list235 = list(list(makeKeyword("EMIT")), ONE_INTEGER);

    private static final SubLSymbol $sym236$ISA_DIGIT_CHAR_ = makeSymbol("ISA-DIGIT-CHAR?");

    public static final SubLList $list237 = list(list(makeKeyword("EMIT")), makeInteger(44));

    public static final SubLList $list238 = list(ZERO_INTEGER, CHAR_hyphen, list(makeKeyword("EMIT")), NINE_INTEGER);

    public static final SubLList $list239 = list(ZERO_INTEGER, CHAR_underbar, list(makeKeyword("EMIT")), NINE_INTEGER);

    public static final SubLList $list240 = list(ZERO_INTEGER, CHAR_quote, list(makeKeyword("EMIT")), TWENTY_INTEGER);

    public static final SubLList $list241 = list(ZERO_INTEGER, CHAR_quotation, list(makeKeyword("EMIT")), TWO_INTEGER);

    private static final SubLSymbol $sym242$ANY_PUNCTUATION_CHAR_ = makeSymbol("ANY-PUNCTUATION-CHAR?");

    public static final SubLList $list243 = list(list(makeKeyword("EMIT")), TWO_INTEGER);

    private static final SubLSymbol $sym244$SENTENCE_INTERNAL_PUNCTUATION_CHAR_ = makeSymbol("SENTENCE-INTERNAL-PUNCTUATION-CHAR?");

    private static final SubLSymbol CHARACTER_OR_CHARACTER_CODE_P = makeSymbol("CHARACTER-OR-CHARACTER-CODE-P");

    private static final SubLSymbol UPPER_CASE_CHAR_P = makeSymbol("UPPER-CASE-CHAR-P");

    public static final SubLList $list247 = list(list(makeKeyword("EMIT")), makeInteger(51));

    private static final SubLSymbol ALPHANUMERIC_CHAR_OR_CHARACTER_CODE_P = makeSymbol("ALPHANUMERIC-CHAR-OR-CHARACTER-CODE-P");

    public static final SubLList $list249 = list(ONE_INTEGER, CHAR_period, list(makeKeyword("REMEMBER")), THREE_INTEGER);

    public static final SubLList $list250 = list(ONE_INTEGER, CHAR_newline, list(makeKeyword("REMEMBER"), makeKeyword("BACKUP")), TWO_INTEGER);

    public static final SubLList $list251 = list(NIL, TWO_INTEGER);

    public static final SubLList $list252 = list(ONE_INTEGER, CHAR_hyphen, list(makeKeyword("REMEMBER")), EIGHT_INTEGER);

    public static final SubLList $list253 = list(list(makeKeyword("REMEMBER"), makeKeyword("BACKUP")), TWO_INTEGER);

    private static final SubLSymbol $sym254$QUOTE_CHAR_ = makeSymbol("QUOTE-CHAR?");

    public static final SubLList $list255 = list(ONE_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list256 = list(list(makeKeyword("BACKUP")), FIVE_INTEGER);

    public static final SubLList $list257 = list(THREE_INTEGER, makeKeyword("END"), list(makeKeyword("BACKUP")), TWO_INTEGER);

    public static final SubLList $list258 = list(NIL, FOUR_INTEGER);

    public static final SubLList $list259 = list(list(makeKeyword("BACKUP")), TWO_INTEGER);

    private static final SubLSymbol LOWER_CASE_CHAR_P = makeSymbol("LOWER-CASE-CHAR-P");

    public static final SubLList $list261 = list(list(makeKeyword("BACKUP")), SIX_INTEGER);

    public static final SubLList $list262 = list(FOUR_INTEGER, makeKeyword("END"), list(makeKeyword("BACKUP")), TWO_INTEGER);

    private static final SubLSymbol $sym263$SENTENCE_FINAL_PUNCTUATION_CHAR_ = makeSymbol("SENTENCE-FINAL-PUNCTUATION-CHAR?");

    public static final SubLList $list264 = list(FIVE_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list265 = list(SIX_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list266 = list(EIGHT_INTEGER, CHAR_hyphen, list(makeKeyword("BACKUP")), TWO_INTEGER);

    public static final SubLList $list267 = list(list(makeKeyword("BACKUP")), TEN_INTEGER);

    public static final SubLList $list268 = list(EIGHT_INTEGER, makeKeyword("END"), list(makeKeyword("BACKUP")), TWO_INTEGER);

    public static final SubLList $list269 = list(NINE_INTEGER, CHAR_hyphen, list(makeKeyword("EMIT")), NINE_INTEGER);

    private static final SubLList $list270 = list(NINE_INTEGER, CHAR_underbar, list(makeKeyword("EMIT")), NINE_INTEGER);

    public static final SubLList $list271 = list(NINE_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list272 = list(ELEVEN_INTEGER, CHAR_s, list(makeKeyword("EMIT")), THIRTEEN_INTEGER);

    private static final SubLList $list273 = list(ELEVEN_INTEGER, CHAR_r, list(makeKeyword("EMIT")), TWELVE_INTEGER);

    public static final SubLList $list274 = list(list(makeKeyword("REMEMBER"), makeKeyword("BACKUP")), ONE_INTEGER);

    public static final SubLList $list275 = list(ELEVEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list276 = list(TWELVE_INTEGER, CHAR_s, list(makeKeyword("EMIT")), THIRTEEN_INTEGER);

    public static final SubLList $list277 = list(TWELVE_INTEGER, CHAR_period, list(makeKeyword("EMIT")), ONE_INTEGER);

    public static final SubLList $list278 = list(TWELVE_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list279 = list(THIRTEEN_INTEGER, CHAR_period, list(makeKeyword("EMIT")), ONE_INTEGER);

    public static final SubLList $list280 = list(THIRTEEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list281 = list(FOURTEEN_INTEGER, CHAR_r, list(makeKeyword("EMIT")), FIFTEEN_INTEGER);

    public static final SubLList $list282 = list(FOURTEEN_INTEGER, CHAR_o, list(makeKeyword("EMIT")), makeInteger(25));

    private static final SubLList $list283 = list(FOURTEEN_INTEGER, CHAR_i, list(makeKeyword("EMIT")), makeInteger(24));

    public static final SubLList $list284 = list(FOURTEEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list285 = list(FIFTEEN_INTEGER, CHAR_period, list(makeKeyword("EMIT")), ONE_INTEGER);

    private static final SubLList $list286 = list(FIFTEEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list287 = list(SIXTEEN_INTEGER, CHAR_r, list(makeKeyword("EMIT")), SEVENTEEN_INTEGER);

    public static final SubLList $list288 = list(SIXTEEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list289 = list(SEVENTEEN_INTEGER, CHAR_o, list(makeKeyword("EMIT")), EIGHTEEN_INTEGER);

    public static final SubLList $list290 = list(SEVENTEEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list291 = list(EIGHTEEN_INTEGER, CHAR_f, list(makeKeyword("EMIT")), FIFTEEN_INTEGER);

    public static final SubLList $list292 = list(EIGHTEEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list293 = list(NINETEEN_INTEGER, CHAR_t, list(makeKeyword("EMIT")), THIRTEEN_INTEGER);

    public static final SubLList $list294 = list(NINETEEN_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list295 = list(TWENTY_INTEGER, CHAR_t, list(makeKeyword("EMIT")), makeInteger(21));

    private static final SubLList $list296 = list(TWENTY_INTEGER, CHAR_m, list(makeKeyword("EMIT")), makeInteger(21));

    public static final SubLList $list297 = list(TWENTY_INTEGER, CHAR_d, list(makeKeyword("EMIT")), makeInteger(21));

    private static final SubLList $list298 = list(TWENTY_INTEGER, CHAR_s, list(makeKeyword("EMIT")), makeInteger(21));

    public static final SubLList $list299 = list(TWENTY_INTEGER, CHAR_r, list(makeKeyword("EMIT")), makeInteger(22));

    public static final SubLList $list300 = list(TWENTY_INTEGER, CHAR_l, list(makeKeyword("EMIT")), makeInteger(23));

    private static final SubLList $list301 = list(TWENTY_INTEGER, CHAR_v, list(makeKeyword("EMIT")), makeInteger(47));

    public static final SubLList $list302 = list(TWENTY_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list303 = list(makeInteger(21), CHAR_newline, list(makeKeyword("REMEMBER"), makeKeyword("BACKUP")), TWO_INTEGER);

    private static final SubLInteger $int$21 = makeInteger(21);

    public static final SubLList $list305 = list(makeInteger(21), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list306 = list(makeInteger(22), CHAR_e, list(makeKeyword("EMIT")), makeInteger(21));

    private static final SubLInteger $int$22 = makeInteger(22);

    public static final SubLList $list308 = list(makeInteger(22), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list309 = list(makeInteger(23), CHAR_l, list(makeKeyword("EMIT")), makeInteger(21));

    private static final SubLInteger $int$23 = makeInteger(23);

    public static final SubLList $list311 = list(makeInteger(23), makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list312 = list(makeInteger(24), CHAR_d, list(makeKeyword("EMIT")), makeInteger(25));

    private static final SubLInteger $int$24 = makeInteger(24);

    private static final SubLList $list314 = list(makeInteger(24), makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list315 = list(makeInteger(25), CHAR_e, list(makeKeyword("EMIT")), makeInteger(26));

    public static final SubLList $list316 = list(makeInteger(25), CHAR_n, list(makeKeyword("REMEMBER")), makeInteger(27));

    private static final SubLInteger $int$25 = makeInteger(25);

    public static final SubLList $list318 = list(makeInteger(25), makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list319 = list(makeInteger(26), CHAR_s, list(makeKeyword("EMIT")), makeInteger(25));

    private static final SubLInteger $int$26 = makeInteger(26);

    private static final SubLList $list321 = list(makeInteger(26), makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list322 = list(makeInteger(27), CHAR_quote, NIL, makeInteger(28));

    private static final SubLInteger $int$27 = makeInteger(27);

    private static final SubLList $list324 = list(list(makeKeyword("BACKUP")), ONE_INTEGER);

    public static final SubLList $list325 = list(makeInteger(27), makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list326 = list(makeInteger(28), CHAR_t, list(makeKeyword("BACKUP")), TWO_INTEGER);

    private static final SubLInteger $int$28 = makeInteger(28);

    public static final SubLList $list328 = list(list(makeKeyword("BACKUP")), makeInteger(29));

    public static final SubLList $list329 = list(makeInteger(28), makeKeyword("END"), list(makeKeyword("BACKUP")), TWO_INTEGER);

    private static final SubLInteger $int$29 = makeInteger(29);

    public static final SubLList $list331 = list(makeInteger(30), CHAR_quote, list(makeKeyword("EMIT")), makeInteger(31));

    private static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLList $list333 = list(makeInteger(30), makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list334 = list(makeInteger(31), CHAR_t, list(makeKeyword("EMIT")), TWO_INTEGER);

    private static final SubLInteger $int$31 = makeInteger(31);

    private static final SubLList $list336 = list(makeInteger(31), makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list337 = list(makeInteger(32), CHAR_o, list(makeKeyword("EMIT")), makeInteger(25));

    public static final SubLList $list338 = list(makeInteger(32), CHAR_a, list(makeKeyword("EMIT")), makeInteger(41));

    private static final SubLList $list339 = list(makeInteger(32), CHAR_e, list(makeKeyword("EMIT")), makeInteger(42));



    public static final SubLList $list341 = list(makeInteger(32), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list342 = list(makeInteger(33), CHAR_a, list(makeKeyword("EMIT")), makeInteger(34));

    private static final SubLInteger $int$33 = makeInteger(33);

    private static final SubLList $list344 = list(makeInteger(33), makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list345 = list(makeInteger(34), CHAR_d, list(makeKeyword("EMIT")), makeInteger(25));

    public static final SubLList $list346 = list(makeInteger(34), CHAR_s, list(makeKeyword("EMIT")), makeInteger(25));

    public static final SubLList $list347 = list(makeInteger(34), CHAR_v, list(makeKeyword("EMIT")), makeInteger(35));

    private static final SubLInteger $int$34 = makeInteger(34);

    public static final SubLList $list349 = list(makeInteger(34), makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list350 = list(makeInteger(35), CHAR_e, list(makeKeyword("EMIT")), makeInteger(25));

    private static final SubLInteger $int$35 = makeInteger(35);

    public static final SubLList $list352 = list(makeInteger(35), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list353 = list(makeInteger(36), CHAR_a, list(makeKeyword("EMIT")), makeInteger(25));

    public static final SubLList $list354 = list(makeInteger(36), CHAR_o, list(makeKeyword("EMIT")), makeInteger(37));

    private static final SubLInteger $int$36 = makeInteger(36);

    public static final SubLList $list356 = list(makeInteger(36), makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list357 = list(makeInteger(37), CHAR_u, list(makeKeyword("EMIT")), makeInteger(38));

    private static final SubLInteger $int$37 = makeInteger(37);

    public static final SubLList $list359 = list(makeInteger(37), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list360 = list(makeInteger(38), CHAR_l, list(makeKeyword("EMIT")), makeInteger(39));

    private static final SubLInteger $int$38 = makeInteger(38);

    private static final SubLList $list362 = list(makeInteger(38), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list363 = list(makeInteger(39), CHAR_d, list(makeKeyword("EMIT")), makeInteger(25));

    private static final SubLInteger $int$39 = makeInteger(39);

    public static final SubLList $list365 = list(makeInteger(39), makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list366 = list(makeInteger(40), CHAR_s, list(makeKeyword("EMIT")), makeInteger(25));

    private static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLList $list368 = list(makeInteger(40), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list369 = list(makeInteger(41), CHAR_s, list(makeKeyword("EMIT")), makeInteger(25));

    private static final SubLInteger $int$41 = makeInteger(41);

    public static final SubLList $list371 = list(makeInteger(41), makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list372 = list(makeInteger(42), CHAR_r, list(makeKeyword("EMIT")), makeInteger(43));

    private static final SubLInteger $int$42 = makeInteger(42);

    private static final SubLList $list374 = list(makeInteger(42), makeKeyword("END"), NIL, TWO_INTEGER);

    public static final SubLList $list375 = list(makeInteger(43), CHAR_e, list(makeKeyword("EMIT")), makeInteger(25));

    private static final SubLInteger $int$43 = makeInteger(43);

    private static final SubLList $list377 = list(makeInteger(43), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLInteger $int$44 = makeInteger(44);

    public static final SubLList $list379 = list(makeInteger(44), CHAR_period, list(makeKeyword("REMEMBER")), makeInteger(45));

    public static final SubLList $list380 = list(makeInteger(44), CHAR_comma, list(makeKeyword("REMEMBER")), makeInteger(49));

    public static final SubLList $list381 = list(makeInteger(44), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLInteger $int$45 = makeInteger(45);

    private static final SubLList $list383 = list(list(makeKeyword("BACKUP")), makeInteger(46));

    private static final SubLList $list384 = list(list(makeKeyword("BACKUP")), THREE_INTEGER);

    private static final SubLList $list385 = list(makeInteger(45), makeKeyword("END"), list(makeKeyword("BACKUP")), TWO_INTEGER);

    public static final SubLList $list386 = list(makeInteger(46), CHAR_period, list(makeKeyword("EMIT")), makeInteger(44));

    private static final SubLInteger $int$46 = makeInteger(46);

    public static final SubLList $list388 = list(makeInteger(46), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list389 = list(makeInteger(47), CHAR_e, list(makeKeyword("EMIT")), makeInteger(21));

    private static final SubLList $list390 = list(makeInteger(47), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list391 = list(makeInteger(48), CHAR_i, list(makeKeyword("EMIT")), makeInteger(25));

    private static final SubLInteger $int$48 = makeInteger(48);

    private static final SubLList $list393 = list(makeInteger(48), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLInteger $int$49 = makeInteger(49);

    private static final SubLList $list395 = list(list(makeKeyword("BACKUP")), makeInteger(50));

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLInteger $int$51 = makeInteger(51);

    private static final SubLList $list398 = list(makeInteger(51), CHAR_period, list(makeKeyword("EMIT")), ONE_INTEGER);

    private static final SubLList $list399 = list(makeInteger(51), CHAR_newline, list(makeKeyword("REMEMBER"), makeKeyword("BACKUP")), TWO_INTEGER);

    private static final SubLList $list400 = list(makeInteger(51), CHAR_hyphen, list(makeKeyword("REMEMBER")), EIGHT_INTEGER);

    private static final SubLList $list401 = list(makeInteger(51), makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLSymbol BUILD_WORD_TOKEN = makeSymbol("BUILD-WORD-TOKEN");

    private static final SubLSymbol NEWLINE_WORD_P = makeSymbol("NEWLINE-WORD-P");

    private static final SubLSymbol END_OF_SENTENCE_WORD_P = makeSymbol("END-OF-SENTENCE-WORD-P");

    private static final SubLList $list405 = list(list(makeKeyword("REMEMBER")), THREE_INTEGER);

    private static final SubLList $list406 = list(list(makeKeyword("EMIT")), FOUR_INTEGER);

    private static final SubLList $list407 = list(THREE_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLSymbol QUOTE_WORD_P = makeSymbol("QUOTE-WORD-P");

    private static final SubLList $list409 = list(FOUR_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLSymbol BUILD_SENTENCE_TOKEN = makeSymbol("BUILD-SENTENCE-TOKEN");

    private static final SubLSymbol NEWLINE_SENTENCE_P = makeSymbol("NEWLINE-SENTENCE-P");

    private static final SubLList $list412 = list(NIL, ONE_INTEGER);

    private static final SubLList $list413 = list(ZERO_INTEGER, makeKeyword("END"), NIL, TWO_INTEGER);

    private static final SubLList $list414 = list(list(makeKeyword("EMIT")), ZERO_INTEGER);

    private static final SubLList $list415 = list(NIL, THREE_INTEGER);

    private static final SubLSymbol BUILD_PARAGRAPH_TOKEN = makeSymbol("BUILD-PARAGRAPH-TOKEN");

    private static final SubLString $str417$_C = makeString("~C");

    private static final SubLString $str418$______ = makeString("[\\.!?]");

    private static final SubLString $str419$____________________ = makeString("(?:\'|\"|\'\'|\\)|\\]|\\})?");

    private static final SubLList $list420 = list(new SubLObject[]{ makeString("jr"), makeString("mr"), makeString("mrs"), makeString("ms"), makeString("dr"), makeString("prof"), makeString("sr"), makeString("sens?"), makeString("reps?"), makeString("gov"), makeString("attys?"), makeString("supt"), makeString("det"), makeString("rev") });

    private static final SubLList $list421 = list(new SubLObject[]{ makeString("col"), makeString("gen"), makeString("lt"), makeString("cmdr"), makeString("adm"), makeString("capt"), makeString("sgt"), makeString("cpl"), makeString("maj") });

    private static final SubLList $list422 = list(makeString("inc"), makeString("ltd"), makeString("co"), makeString("corp"));

    private static final SubLString $$$arc = makeString("arc");

    private static final SubLString $$$al = makeString("al");

    private static final SubLString $$$ave = makeString("ave");

    private static final SubLString $str426$blv_d = makeString("blv?d");

    private static final SubLString $$$cl = makeString("cl");

    private static final SubLString $$$ct = makeString("ct");

    private static final SubLString $$$cres = makeString("cres");

    private static final SubLString $$$dr = makeString("dr");

    private static final SubLString $str431$expy_ = makeString("expy?");

    private static final SubLString $$$dist = makeString("dist");

    private static final SubLString $$$mt = makeString("mt");

    private static final SubLString $$$ft = makeString("ft");

    private static final SubLString $str435$fw_y = makeString("fw?y");

    private static final SubLString $str436$hwa_y = makeString("hwa?y");

    private static final SubLString $$$la = makeString("la");

    private static final SubLString $str438$pde_ = makeString("pde?");

    private static final SubLString $$$pl = makeString("pl");

    private static final SubLString $$$plz = makeString("plz");

    private static final SubLString $$$rd = makeString("rd");

    private static final SubLString $$$st = makeString("st");

    private static final SubLString $$$tce = makeString("tce");

    private static final SubLString $$$Ala = makeString("Ala");

    private static final SubLString $$$Ariz = makeString("Ariz");

    private static final SubLString $$$Ark = makeString("Ark");

    private static final SubLString $$$Cal = makeString("Cal");

    private static final SubLString $$$Calif = makeString("Calif");

    private static final SubLString $$$Col = makeString("Col");

    private static final SubLString $$$Colo = makeString("Colo");

    private static final SubLString $$$Conn = makeString("Conn");

    private static final SubLString $$$Del = makeString("Del");

    private static final SubLString $$$Fed = makeString("Fed");

    private static final SubLString $$$Fla = makeString("Fla");

    private static final SubLString $$$Ga = makeString("Ga");

    private static final SubLString $$$Ida = makeString("Ida");

    private static final SubLString $$$Id = makeString("Id");

    private static final SubLString $$$Ill = makeString("Ill");

    private static final SubLString $$$Ind = makeString("Ind");

    private static final SubLString $$$Ia = makeString("Ia");

    private static final SubLString $$$Kan = makeString("Kan");

    private static final SubLString $$$Kans = makeString("Kans");

    private static final SubLString $$$Ken = makeString("Ken");

    private static final SubLString $$$Ky = makeString("Ky");

    private static final SubLString $$$La = makeString("La");

    private static final SubLString $$$Me = makeString("Me");

    private static final SubLString $$$Md = makeString("Md");

    private static final SubLString $$$Is = makeString("Is");

    private static final SubLString $$$Mass = makeString("Mass");

    private static final SubLString $$$Mich = makeString("Mich");

    private static final SubLString $$$Minn = makeString("Minn");

    private static final SubLString $$$Miss = makeString("Miss");

    private static final SubLString $$$Mo = makeString("Mo");

    private static final SubLString $$$Mont = makeString("Mont");

    private static final SubLString $$$Neb = makeString("Neb");

    private static final SubLString $$$Nebr = makeString("Nebr");

    private static final SubLString $$$Nev = makeString("Nev");

    private static final SubLString $$$Mex = makeString("Mex");

    private static final SubLString $$$Okla = makeString("Okla");

    private static final SubLString $$$Ok = makeString("Ok");

    private static final SubLString $$$Ore = makeString("Ore");

    private static final SubLString $$$Penna = makeString("Penna");

    private static final SubLString $$$Penn = makeString("Penn");

    private static final SubLString $$$Pa = makeString("Pa");

    private static final SubLString $$$Dak = makeString("Dak");

    private static final SubLString $$$Tenn = makeString("Tenn");

    private static final SubLString $$$Tex = makeString("Tex");

    private static final SubLString $$$Ut = makeString("Ut");

    private static final SubLString $$$Vt = makeString("Vt");

    private static final SubLString $$$Va = makeString("Va");

    private static final SubLString $$$Wash = makeString("Wash");

    private static final SubLString $$$Wis = makeString("Wis");

    private static final SubLString $$$Wisc = makeString("Wisc");

    private static final SubLString $$$Wy = makeString("Wy");

    private static final SubLString $$$Wyo = makeString("Wyo");

    private static final SubLString $$$USAFA = makeString("USAFA");

    private static final SubLString $$$Alta = makeString("Alta");

    private static final SubLString $$$Man = makeString("Man");

    private static final SubLString $$$Ont = makeString("Ont");

    private static final SubLString $$$Sask = makeString("Sask");

    private static final SubLString $$$Yuk = makeString("Yuk");

    private static final SubLList $list502 = list(new SubLObject[]{ makeString("jan"), makeString("feb"), makeString("mar"), makeString("apr"), makeString("may"), makeString("jun"), makeString("jul"), makeString("aug"), makeString("sep"), makeString("oct"), makeString("nov"), makeString("dec"), makeString("sept") });

    private static final SubLList $list503 = list(makeString("vs"), makeString("sec"), makeString("no"), makeString("esp"));

    private static final SubLString $str504$_n_s__n = makeString("\\n\\s*\\n");

    private static final SubLString $str505$_s_ = makeString("\\s)");

    private static final SubLString $str506$_1 = makeString("\\1");

    private static final SubLString $str507$__s_w = makeString("(\\s\\w");

    private static final SubLString $str508$_____w__w = makeString("([^-\\w]\\w");

    private static final SubLString $str509$__s_w___s__ = makeString("(\\s\\w\\.\\s+)");

    private static final SubLString $str510$_________ = makeString("(\\.\\.\\. )");

    private static final SubLString $str511$____lower____ = makeString("([[:lower:]])");

    private static final SubLString $str512$_1_2 = makeString("\\1\\2");

    private static final SubLString $str513$_____ = makeString("([\'\"]");

    private static final SubLString $str514$_____s__ = makeString("[\'\"]\\s+)");

    private static final SubLString $str515$______s__ = makeString("([\"\']\\s*)");

    private static final SubLString $str516$__s____lower____ = makeString("(\\s*[[:lower:]])");

    private static final SubLString $str517$__s___s_ = makeString("(\\s\\.\\s)");

    private static final SubLString $str518$__s__ = makeString("(\\s*)");

    private static final SubLString $str519$__s = makeString("(\\s");

    private static final SubLString $str520$__D_d___ = makeString("(\\D\\d+)(");

    private static final SubLString $str521$___s__ = makeString(")(\\s+)");

    private static final SubLString $str522$_3 = makeString("\\3");

    private static final SubLString $str523$___w = makeString("(\'\\w");

    private static final SubLString $str524$___s_ = makeString(")(\\s)");

    private static final SubLString $str525$_2 = makeString("\\2");

    private static final SubLString $str526$__sno_____s______d_ = makeString("(\\sno\\.)(\\s+)(?!\\d)");

    private static final SubLList $list527 = list(makeKeyword("CASELESS"));

    private static final SubLString $str528$__ap___m___s______upper____ = makeString("([ap]\\.m\\.\\s+)([[:upper:]])");

    private static final SubLList $list529 = cons(makeSymbol("PATTERN"), makeSymbol("SUBSTITUTION"));

    private static final SubLString $str530$Can_t_finalize__a__not_a_regular_ = makeString("Can't finalize ~a: not a regular expression pattern");

    private static final SubLSymbol SENTENCIFY_STRING = makeSymbol("SENTENCIFY-STRING");

    private static final SubLString $str532$__b = makeString("(\\b");

    private static final SubLList $list533 = list(makeSymbol("RE"), makeSymbol("SUBSTITUTION"), makeSymbol("OPTIONS"));

    private static final SubLString $str534$Can_t_compile_regular_expression_ = makeString("Can't compile regular expression ~a: ~a");

    private static final SubLSymbol NEW_DOCUMENT = makeSymbol("NEW-DOCUMENT");

    private static final SubLSymbol $sym536$DOCUMENT_SENTENCE_COUNT_ = makeSymbol("DOCUMENT-SENTENCE-COUNT=");



    private static final SubLList $list538 = list(list(list(makeString("I love Elmer Fudgsicle's suits.  He had wonderful taste."), NIL, makeSymbol("FST-STRING-WORDIFY")), ONE_INTEGER), list(list(makeString("I love Elmer Fudgsicle's suits.  He had wonderful taste.")), TWO_INTEGER));

    private static final SubLSymbol TEST_CONSTRUCT_STRING_FROM_WORDS = makeSymbol("TEST-CONSTRUCT-STRING-FROM-WORDS");

    private static final SubLList $list540 = list(list(list(list(makeSymbol("FIRST-N"), TWO_INTEGER, list(makeSymbol("VECTOR-ELEMENTS"), list(makeSymbol("SENTENCE-YIELD"), list(makeSymbol("NEW-SENTENCE"), makeString("3.4 billion cats")))))), makeString("3.4 billion")), list(list(list(makeSymbol("LIST"), list(makeSymbol("SECOND"), list(makeSymbol("VECTOR-ELEMENTS"), list(makeSymbol("SENTENCE-YIELD"), list(makeSymbol("NEW-SENTENCE"), makeString("3.4 billion cats"))))))), makeString("billion")), list(list(list(makeSymbol("LIST"), list(makeSymbol("FIRST"), list(makeSymbol("VECTOR-ELEMENTS"), list(makeSymbol("SENTENCE-YIELD"), list(makeSymbol("NEW-SENTENCE"), makeString("U.S.")))))), T), makeString("US")), list(list(list(makeSymbol("VECTOR-ELEMENTS"), list(makeSymbol("SENTENCE-YIELD"), list(makeSymbol("NEW-SENTENCE"), makeString("U.S. Defense")))), T), makeString("US Defense")), list(list(list(makeSymbol("VECTOR-ELEMENTS"), list(makeSymbol("SENTENCE-YIELD"), list(makeSymbol("NEW-SENTENCE"), makeString("US Defense")))), T), makeString("US Defense")), list(list(list(makeSymbol("VECTOR-ELEMENTS"), list(makeSymbol("SENTENCE-YIELD"), list(makeSymbol("NEW-SENTENCE"), makeString("US Defense")))), NIL), makeString("US Defense")), list(list(list(makeSymbol("VECTOR-ELEMENTS"), list(makeSymbol("SENTENCE-YIELD"), list(makeSymbol("NEW-SENTENCE"), makeString("U.S.")))), NIL), makeString("U.S.")));

    public static SubLObject sign_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        sign_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sign_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$sign_native.class ? T : NIL;
    }

    public static SubLObject sign_string(final SubLObject v_object) {
        assert NIL != sign_p(v_object) : "document.sign_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sign_type(final SubLObject v_object) {
        assert NIL != sign_p(v_object) : "document.sign_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sign_info(final SubLObject v_object) {
        assert NIL != sign_p(v_object) : "document.sign_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject sign_category(final SubLObject v_object) {
        assert NIL != sign_p(v_object) : "document.sign_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject sign_constituents(final SubLObject v_object) {
        assert NIL != sign_p(v_object) : "document.sign_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject sign_offset(final SubLObject v_object) {
        assert NIL != sign_p(v_object) : "document.sign_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject sign_mother(final SubLObject v_object) {
        assert NIL != sign_p(v_object) : "document.sign_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject _csetf_sign_string(final SubLObject v_object, final SubLObject value) {
        assert NIL != sign_p(v_object) : "document.sign_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sign_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != sign_p(v_object) : "document.sign_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sign_info(final SubLObject v_object, final SubLObject value) {
        assert NIL != sign_p(v_object) : "document.sign_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sign_category(final SubLObject v_object, final SubLObject value) {
        assert NIL != sign_p(v_object) : "document.sign_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sign_constituents(final SubLObject v_object, final SubLObject value) {
        assert NIL != sign_p(v_object) : "document.sign_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sign_offset(final SubLObject v_object, final SubLObject value) {
        assert NIL != sign_p(v_object) : "document.sign_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sign_mother(final SubLObject v_object, final SubLObject value) {
        assert NIL != sign_p(v_object) : "document.sign_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject make_sign(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sign_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STRING)) {
                _csetf_sign_string(v_new, current_value);
            } else
                if (pcase_var.eql($TYPE)) {
                    _csetf_sign_type(v_new, current_value);
                } else
                    if (pcase_var.eql($INFO)) {
                        _csetf_sign_info(v_new, current_value);
                    } else
                        if (pcase_var.eql($CATEGORY)) {
                            _csetf_sign_category(v_new, current_value);
                        } else
                            if (pcase_var.eql($CONSTITUENTS)) {
                                _csetf_sign_constituents(v_new, current_value);
                            } else
                                if (pcase_var.eql($OFFSET)) {
                                    _csetf_sign_offset(v_new, current_value);
                                } else
                                    if (pcase_var.eql($MOTHER)) {
                                        _csetf_sign_mother(v_new, current_value);
                                    } else {
                                        Errors.error($str31$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sign(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SIGN, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STRING, sign_string(obj));
        funcall(visitor_fn, obj, $SLOT, $TYPE, sign_type(obj));
        funcall(visitor_fn, obj, $SLOT, $INFO, sign_info(obj));
        funcall(visitor_fn, obj, $SLOT, $CATEGORY, sign_category(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTITUENTS, sign_constituents(obj));
        funcall(visitor_fn, obj, $SLOT, $OFFSET, sign_offset(obj));
        funcall(visitor_fn, obj, $SLOT, $MOTHER, sign_mother(obj));
        funcall(visitor_fn, obj, $END, MAKE_SIGN, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sign_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sign(obj, visitor_fn);
    }

    public static SubLObject new_sign() {
        final SubLObject sign = make_sign(UNPROVIDED);
        _csetf_sign_type(sign, $SIGN);
        _csetf_sign_string(sign, $str38$);
        return sign;
    }

    public static SubLObject sxhash_sign(final SubLObject sign) {
        final SubLObject id = (NIL != pph_phrase.pph_phrase_p(sign, UNPROVIDED)) ? pph_phrase.pph_phrase_suid(sign) : NIL;
        if (id.isFixnum()) {
            return id;
        }
        return Sxhash.sxhash(sign_string(sign));
    }

    public static SubLObject sxhash_sign_method(final SubLObject v_object) {
        return sxhash_sign(v_object);
    }

    public static SubLObject sign_print(final SubLObject sign, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sign_p(sign) : "document.sign_p(sign) " + "CommonSymbols.NIL != document.sign_p(sign) " + sign;
        if (NIL != pph_phrase.pph_phrase_p(sign, UNPROVIDED)) {
            if (NIL != pph_vars.verbose_print_pph_phrasesP()) {
                pph_phrase.verbose_print_pph_phrase(sign, stream);
            } else {
                pph_phrase.terse_print_pph_phrase(sign, stream);
            }
        } else {
            write_string($str40$__, stream, UNPROVIDED, UNPROVIDED);
            princ(sign_type(sign), stream);
            if (NIL != sign_category(sign)) {
                write_string($str41$_, stream, UNPROVIDED, UNPROVIDED);
                princ(sign_category(sign), stream);
                write_string($str42$_, stream, UNPROVIDED, UNPROVIDED);
            }
            write_string($str43$__, stream, UNPROVIDED, UNPROVIDED);
            if ((NIL != word_p(sign)) || ((NIL != pph_phrase.pph_phrase_p(sign, UNPROVIDED)) && sign_string(sign).isString())) {
                write_string(cconcatenate($str44$_, new SubLObject[]{ sign_string(sign), $str44$_ }), stream, UNPROVIDED, UNPROVIDED);
            } else {
                SubLObject cdotimes_end_var;
                SubLObject i;
                for (cdotimes_end_var = min(sign_length(sign), $text_class_print_length$.getDynamicValue(thread)), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                    write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
                    sign_print(sign_get(sign, i), stream, ZERO_INTEGER);
                }
            }
            if ($text_class_print_length$.getDynamicValue(thread).numL(sign_length(sign))) {
                write_string($str46$____, stream, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != sign_info(sign)) {
                princ($str47$_, stream);
                princ(sign_info(sign), stream);
            }
            write_string($str48$_, stream, UNPROVIDED, UNPROVIDED);
            terpri(stream);
        }
        return sign;
    }

    public static SubLObject sign_get(final SubLObject sign, final SubLObject index) {
        return aref(sign_constituents(sign), index);
    }

    public static SubLObject sign_set(final SubLObject sign, final SubLObject index, final SubLObject v_object) {
        final SubLObject old_object = aref(sign_constituents(sign), index);
        set_aref(sign_constituents(sign), index, v_object);
        _csetf_sign_mother(v_object, sign);
        return old_object;
    }

    public static SubLObject sign_length(final SubLObject sign) {
        return length(sign_constituents(sign));
    }

    public static SubLObject sign_update(final SubLObject sign, final SubLObject slot_values) {
        assert NIL != sign_p(sign) : "document.sign_p(sign) " + "CommonSymbols.NIL != document.sign_p(sign) " + sign;
        assert NIL != listp(slot_values) : "Types.listp(slot_values) " + "CommonSymbols.NIL != Types.listp(slot_values) " + slot_values;
        SubLObject remaining_slot_values = NIL;
        SubLObject slot = NIL;
        SubLObject value = NIL;
        remaining_slot_values = slot_values;
        slot = remaining_slot_values.first();
        value = second(remaining_slot_values);
        while (NIL != slot) {
            final SubLObject pcase_var = slot;
            if (pcase_var.eql($STRING)) {
                assert NIL != stringp(value) : "Types.stringp(value) " + "CommonSymbols.NIL != Types.stringp(value) " + value;
                _csetf_sign_string(sign, value);
            } else
                if (pcase_var.eql($CATEGORY)) {
                    _csetf_sign_category(sign, value);
                } else
                    if (pcase_var.eql($CONSTITUENTS)) {
                        assert NIL != vectorp(value) : "Types.vectorp(value) " + "CommonSymbols.NIL != Types.vectorp(value) " + value;
                        _csetf_sign_constituents(sign, value);
                    } else
                        if (pcase_var.eql($OFFSET)) {
                            _csetf_sign_offset(sign, value);
                        } else
                            if (pcase_var.eql($INFO)) {
                                _csetf_sign_info(sign, value);
                            } else
                                if (pcase_var.eql($MOTHER)) {
                                    _csetf_sign_mother(sign, value);
                                } else {
                                    Errors.error($str52$Attempt_to_set_the_non_existing_s, slot);
                                }





            remaining_slot_values = remaining_slot_values.rest().rest();
            slot = remaining_slot_values.first();
            value = second(remaining_slot_values);
        } 
        return sign;
    }

    public static SubLObject sign_do_constituents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list53);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constituent = NIL;
        SubLObject sign = NIL;
        destructuring_bind_must_consp(current, datum, $list53);
        constituent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list53);
        sign = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOVECTOR, list(constituent, list(SIGN_CONSTITUENTS, sign)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list53);
        return NIL;
    }

    public static SubLObject sign_yield(final SubLObject sign) {
        SubLObject words = NIL;
        if (NIL != word_p(sign)) {
            words = cons(sign, words);
        } else {
            final SubLObject vector_var = sign_constituents(sign);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject constituent;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                constituent = aref(vector_var, element_num);
                words = nconc(words, sign_yield(constituent));
            }
        }
        return words;
    }

    public static SubLObject sign_intervals(final SubLObject sign, SubLObject start) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        assert NIL != sign_p(sign) : "document.sign_p(sign) " + "CommonSymbols.NIL != document.sign_p(sign) " + sign;
        assert NIL != subl_promotions.non_negative_integer_p(start) : "subl_promotions.non_negative_integer_p(start) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(start) " + start;
        final SubLObject pcase_var = sign_type(sign);
        if (pcase_var.eql($W)) {
            return word_intervals(sign, start);
        }
        if (pcase_var.eql($P)) {
            return phrase_intervals(sign, start);
        }
        Errors.error($str58$Unknown_sign_subclass__a, sign_type(sign));
        return NIL;
    }

    public static SubLObject new_exhaustive_word(SubLObject slot_values) {
        if (slot_values == UNPROVIDED) {
            slot_values = NIL;
        }
        final SubLObject word = new_word(slot_values);
        _csetf_sign_type(word, $XW);
        return word;
    }

    public static SubLObject new_exhaustive_word_from_word(final SubLObject original_word) {
        final SubLObject new_word = copy_word(original_word);
        _csetf_sign_type(new_word, $XW);
        return new_word;
    }

    public static SubLObject exhaustive_word_p(final SubLObject v_object) {
        return makeBoolean((NIL != sign_p(v_object)) && (sign_type(v_object) == $XW));
    }

    public static SubLObject new_word(SubLObject slot_values) {
        if (slot_values == UNPROVIDED) {
            slot_values = NIL;
        }
        assert NIL != listp(slot_values) : "Types.listp(slot_values) " + "CommonSymbols.NIL != Types.listp(slot_values) " + slot_values;
        final SubLObject word = make_sign(UNPROVIDED);
        _csetf_sign_type(word, $W);
        word_update(word, slot_values);
        return word;
    }

    public static SubLObject copy_word(final SubLObject word) {
        final SubLObject is_exhaustive = exhaustive_word_p(word);
        final SubLObject new_word = (NIL != is_exhaustive) ? new_exhaustive_word(UNPROVIDED) : new_word(UNPROVIDED);
        SubLObject values = list(new SubLObject[]{ $STRING, word_string(word), $INFO, word_info(word), $CATEGORY, word_category(word), $OFFSET, word_offset(word), $MOTHER, word_mother(word) });
        if (NIL != is_exhaustive) {
            values = putf(values, $CONSTITUENTS, word_constituents(word));
        }
        sign_update(new_word, values);
        return new_word;
    }

    public static SubLObject word_p(final SubLObject v_object) {
        return makeBoolean((NIL != sign_p(v_object)) && (NIL != member(sign_type(v_object), $list60, symbol_function(EQ), UNPROVIDED)));
    }

    public static SubLObject set_word_string(final SubLObject word, final SubLObject string) {
        return word_update(word, list($STRING, string));
    }

    public static SubLObject word_string(final SubLObject word) {
        assert NIL != word_p(word) : "document.word_p(word) " + "CommonSymbols.NIL != document.word_p(word) " + word;
        return sign_string(word);
    }

    public static SubLObject set_word_category(final SubLObject word, final SubLObject category) {
        return word_update(word, list($CATEGORY, category));
    }

    public static SubLObject word_category(final SubLObject word) {
        assert NIL != word_p(word) : "document.word_p(word) " + "CommonSymbols.NIL != document.word_p(word) " + word;
        return sign_category(word);
    }

    public static SubLObject word_offset(final SubLObject word) {
        assert NIL != word_p(word) : "document.word_p(word) " + "CommonSymbols.NIL != document.word_p(word) " + word;
        return sign_offset(word);
    }

    public static SubLObject word_length(final SubLObject word) {
        assert NIL != word_p(word) : "document.word_p(word) " + "CommonSymbols.NIL != document.word_p(word) " + word;
        return length(word_string(word));
    }

    public static SubLObject word_mother(final SubLObject word) {
        assert NIL != word_p(word) : "document.word_p(word) " + "CommonSymbols.NIL != document.word_p(word) " + word;
        return sign_mother(word);
    }

    public static SubLObject word_info(final SubLObject word) {
        assert NIL != word_p(word) : "document.word_p(word) " + "CommonSymbols.NIL != document.word_p(word) " + word;
        return sign_info(word);
    }

    public static SubLObject word_constituents(final SubLObject word) {
        assert NIL != exhaustive_word_p(word) : "document.exhaustive_word_p(word) " + "CommonSymbols.NIL != document.exhaustive_word_p(word) " + word;
        return sign_constituents(word);
    }

    public static SubLObject word_interps(final SubLObject word) {
        return getf(word_info(word), $INTERPS, UNPROVIDED);
    }

    public static SubLObject word_lex_entries(final SubLObject word) {
        return getf(word_info(word), $LEX_ENTRIES, UNPROVIDED);
    }

    public static SubLObject word_cycls(final SubLObject word) {
        return remove_duplicates(nl_api_datastructures.cycls_from_nl_interps(getf(word_info(word), $INTERPS, UNPROVIDED)), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject word_cyc_pos(final SubLObject word) {
        return getf(word_info(word), $CYC_POS, UNPROVIDED);
    }

    public static SubLObject word_update(final SubLObject word, final SubLObject slot_values) {
        assert NIL != word_p(word) : "document.word_p(word) " + "CommonSymbols.NIL != document.word_p(word) " + word;
        assert NIL != listp(slot_values) : "Types.listp(slot_values) " + "CommonSymbols.NIL != Types.listp(slot_values) " + slot_values;
        return sign_update(word, slot_values);
    }

    public static SubLObject word_index(final SubLObject word) {
        final SubLObject sentence = word_mother(word);
        SubLObject i = ZERO_INTEGER;
        if (NIL != sentence) {
            while ((!i.numG(sentence_length(sentence))) && (!word.eql(sentence_get(sentence, i)))) {
                i = add(i, ONE_INTEGER);
            } 
            return i;
        }
        return NIL;
    }

    public static SubLObject word_intervals(final SubLObject word, SubLObject start) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        assert NIL != word_p(word) : "document.word_p(word) " + "CommonSymbols.NIL != document.word_p(word) " + word;
        assert NIL != integerp(start) : "Types.integerp(start) " + "CommonSymbols.NIL != Types.integerp(start) " + start;
        return list(standard_tokenization.new_interval_token(start, add(start, ONE_INTEGER), word));
    }

    public static SubLObject word_capitalize(final SubLObject word) {
        assert NIL != word_p(word) : "document.word_p(word) " + "CommonSymbols.NIL != document.word_p(word) " + word;
        string_utilities.nupcase_leading(word_string(word));
        return word;
    }

    public static SubLObject word_uncapitalize(final SubLObject word) {
        assert NIL != word_p(word) : "document.word_p(word) " + "CommonSymbols.NIL != document.word_p(word) " + word;
        string_utilities.ndowncase_leading(word_string(word));
        return word;
    }

    public static SubLObject build_word_token(final SubLObject fst) {
        return new_word(list($STRING, stringify(finite_state_transducer.fst_output(fst)), $CONSTITUENTS, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)), $OFFSET, finite_state_transducer.fst_output_start(fst)));
    }

    public static SubLObject stringify(final SubLObject chars) {
        SubLObject string = Strings.make_string(length(chars), UNPROVIDED);
        SubLObject has_unicodeP = NIL;
        SubLObject i = ZERO_INTEGER;
        if (NIL == has_unicodeP) {
            SubLObject csome_list_var = chars;
            SubLObject v_char = NIL;
            v_char = csome_list_var.first();
            while ((NIL == has_unicodeP) && (NIL != csome_list_var)) {
                if (v_char.isString()) {
                    has_unicodeP = T;
                } else {
                    Strings.set_char(string, i, v_char);
                }
                i = add(i, ONE_INTEGER);
                csome_list_var = csome_list_var.rest();
                v_char = csome_list_var.first();
            } 
        }
        if (NIL == has_unicodeP) {
            return string;
        }
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            SubLObject cdolist_list_var = chars;
            SubLObject v_char2 = NIL;
            v_char2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                princ(v_char2, s);
                cdolist_list_var = cdolist_list_var.rest();
                v_char2 = cdolist_list_var.first();
            } 
            string = get_output_stream_string(s);
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
        return string;
    }

    public static SubLObject no_space_before_following_wordP(final SubLObject word) {
        final SubLObject word_end = add(word_offset(word), word_length(word));
        final SubLObject next_word_offset = next_word_offset(word);
        return makeBoolean(((NIL != next_word_offset) && (NIL != word_end)) && next_word_offset.eql(word_end));
    }

    public static SubLObject next_word_offset(final SubLObject word) {
        final SubLObject sentence = word_mother(word);
        final SubLObject word_index = word_index(word);
        SubLObject next_word = NIL;
        if (word_index.isInteger() && (!number_utilities.f_1X(word_index).numGE(sentence_length(sentence)))) {
            next_word = sentence_get(sentence, number_utilities.f_1X(word_index));
        }
        if (NIL != next_word) {
            return word_offset(next_word);
        }
        return NIL;
    }

    public static SubLObject string_tokenize_via_wordify(final SubLObject string) {
        final SubLObject word_array = string_wordify(string, UNPROVIDED);
        SubLObject result = NIL;
        final SubLObject vector_var = word_array;
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject word;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            word = aref(vector_var, element_num);
            result = cons(word_string(word), result);
        }
        return nreverse(result);
    }

    public static SubLObject string_wordify(final SubLObject string, SubLObject wordifier) {
        if (wordifier == UNPROVIDED) {
            wordifier = $wordifier$.getDynamicValue();
        }
        return funcall(wordifier, string);
    }

    public static SubLObject fst_string_wordify(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($fst_string_wordify_lock$.getGlobalValue());
            return finite_state_transducer.fst_match_global($wordifier_fst$.getDynamicValue(thread), unicode_strings.utf8_string_to_unicode_vector(string));
        } finally {
            if (NIL != release) {
                release_lock($fst_string_wordify_lock$.getGlobalValue());
            }
        }
    }

    public static SubLObject rkf_standard_string_wordify(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_vector = NIL;
        if (NIL == result_vector) {
            SubLObject csome_list_var = list(RKF_CH_STRING_TOKENIZE, STANDARD_STRING_TOKENIZE, SPLIT_STRING);
            SubLObject tokenizer = NIL;
            tokenizer = csome_list_var.first();
            while ((NIL == result_vector) && (NIL != csome_list_var)) {
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            final SubLObject tokens = funcall(tokenizer, string);
                            SubLObject words = NIL;
                            SubLObject current_offset = ZERO_INTEGER;
                            SubLObject cdolist_list_var = tokens;
                            SubLObject token = NIL;
                            token = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                current_offset = search(token, string, EQUAL, IDENTITY, ZERO_INTEGER, NIL, current_offset, UNPROVIDED);
                                SubLObject word_args = list($STRING, token);
                                if (current_offset.isNumber()) {
                                    word_args = putf(word_args, $OFFSET, current_offset);
                                    current_offset = add(current_offset, length(token));
                                }
                                words = cons(new_word(word_args), words);
                                cdolist_list_var = cdolist_list_var.rest();
                                token = cdolist_list_var.first();
                            } 
                            result_vector = nreverse(words);
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
                csome_list_var = csome_list_var.rest();
                tokenizer = csome_list_var.first();
            } 
        }
        return list_utilities.list2vector(result_vector);
    }

    public static SubLObject clear_html_string_wordify_punctuation_chars() {
        final SubLObject cs = $html_string_wordify_punctuation_chars_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_html_string_wordify_punctuation_chars() {
        return memoization_state.caching_state_remove_function_results_with_args($html_string_wordify_punctuation_chars_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject html_string_wordify_punctuation_chars_internal() {
        return cons(CHAR_less, cons(CHAR_greater, cons(CHAR_space, standard_tokenization.standard_punctuation_chars())));
    }

    public static SubLObject html_string_wordify_punctuation_chars() {
        SubLObject caching_state = $html_string_wordify_punctuation_chars_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(HTML_STRING_WORDIFY_PUNCTUATION_CHARS, $html_string_wordify_punctuation_chars_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(html_string_wordify_punctuation_chars_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject html_string_wordify_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_hsw_state(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject html_string_wordify_state_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$html_string_wordify_state_native.class ? T : NIL;
    }

    public static SubLObject hsw_state_state(final SubLObject v_object) {
        assert NIL != html_string_wordify_state_p(v_object) : "document.html_string_wordify_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject hsw_state_tag_pieces(final SubLObject v_object) {
        assert NIL != html_string_wordify_state_p(v_object) : "document.html_string_wordify_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject hsw_state_string_pieces(final SubLObject v_object) {
        assert NIL != html_string_wordify_state_p(v_object) : "document.html_string_wordify_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject hsw_state_punctuation_pieces(final SubLObject v_object) {
        assert NIL != html_string_wordify_state_p(v_object) : "document.html_string_wordify_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject hsw_state_leading_tags(final SubLObject v_object) {
        assert NIL != html_string_wordify_state_p(v_object) : "document.html_string_wordify_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject hsw_state_following_tags(final SubLObject v_object) {
        assert NIL != html_string_wordify_state_p(v_object) : "document.html_string_wordify_state_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject hsw_state_current_offset(final SubLObject v_object) {
        assert NIL != html_string_wordify_state_p(v_object) : "document.html_string_wordify_state_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject _csetf_hsw_state_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != html_string_wordify_state_p(v_object) : "document.html_string_wordify_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_hsw_state_tag_pieces(final SubLObject v_object, final SubLObject value) {
        assert NIL != html_string_wordify_state_p(v_object) : "document.html_string_wordify_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_hsw_state_string_pieces(final SubLObject v_object, final SubLObject value) {
        assert NIL != html_string_wordify_state_p(v_object) : "document.html_string_wordify_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_hsw_state_punctuation_pieces(final SubLObject v_object, final SubLObject value) {
        assert NIL != html_string_wordify_state_p(v_object) : "document.html_string_wordify_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_hsw_state_leading_tags(final SubLObject v_object, final SubLObject value) {
        assert NIL != html_string_wordify_state_p(v_object) : "document.html_string_wordify_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_hsw_state_following_tags(final SubLObject v_object, final SubLObject value) {
        assert NIL != html_string_wordify_state_p(v_object) : "document.html_string_wordify_state_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_hsw_state_current_offset(final SubLObject v_object, final SubLObject value) {
        assert NIL != html_string_wordify_state_p(v_object) : "document.html_string_wordify_state_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject make_html_string_wordify_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $html_string_wordify_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STATE)) {
                _csetf_hsw_state_state(v_new, current_value);
            } else
                if (pcase_var.eql($TAG_PIECES)) {
                    _csetf_hsw_state_tag_pieces(v_new, current_value);
                } else
                    if (pcase_var.eql($STRING_PIECES)) {
                        _csetf_hsw_state_string_pieces(v_new, current_value);
                    } else
                        if (pcase_var.eql($PUNCTUATION_PIECES)) {
                            _csetf_hsw_state_punctuation_pieces(v_new, current_value);
                        } else
                            if (pcase_var.eql($LEADING_TAGS)) {
                                _csetf_hsw_state_leading_tags(v_new, current_value);
                            } else
                                if (pcase_var.eql($FOLLOWING_TAGS)) {
                                    _csetf_hsw_state_following_tags(v_new, current_value);
                                } else
                                    if (pcase_var.eql($CURRENT_OFFSET)) {
                                        _csetf_hsw_state_current_offset(v_new, current_value);
                                    } else {
                                        Errors.error($str31$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_html_string_wordify_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_HTML_STRING_WORDIFY_STATE, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STATE, hsw_state_state(obj));
        funcall(visitor_fn, obj, $SLOT, $TAG_PIECES, hsw_state_tag_pieces(obj));
        funcall(visitor_fn, obj, $SLOT, $STRING_PIECES, hsw_state_string_pieces(obj));
        funcall(visitor_fn, obj, $SLOT, $PUNCTUATION_PIECES, hsw_state_punctuation_pieces(obj));
        funcall(visitor_fn, obj, $SLOT, $LEADING_TAGS, hsw_state_leading_tags(obj));
        funcall(visitor_fn, obj, $SLOT, $FOLLOWING_TAGS, hsw_state_following_tags(obj));
        funcall(visitor_fn, obj, $SLOT, $CURRENT_OFFSET, hsw_state_current_offset(obj));
        funcall(visitor_fn, obj, $END, MAKE_HTML_STRING_WORDIFY_STATE, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_html_string_wordify_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_html_string_wordify_state(obj, visitor_fn);
    }

    public static SubLObject print_hsw_state(final SubLObject state, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str110$__S__S_, hsw_state_state(state), hsw_state_string_pieces(state));
        return NIL;
    }

    public static SubLObject new_html_string_wordify_state() {
        return make_html_string_wordify_state($list111);
    }

    public static SubLObject classify_html_string_token(final SubLObject token, final SubLObject punctuation) {
        if (string_utilities.first_char(token).eql(CHAR_space)) {
            return $SPACE;
        }
        if (string_utilities.first_char(token).eql(CHAR_greater)) {
            return $END_OF_TAG;
        }
        if (string_utilities.first_char(token).eql(CHAR_less)) {
            return $START_OF_TAG;
        }
        if (NIL != member(string_utilities.first_char(token), punctuation, UNPROVIDED, UNPROVIDED)) {
            return $PUNCTUATION;
        }
        return $DEFAULT;
    }

    public static SubLObject html_string_wordify(final SubLObject html_string) {
        SubLObject words = NIL;
        final SubLObject white_space_chars = NIL;
        final SubLObject punctuation = html_string_wordify_punctuation_chars();
        final SubLObject chunked;
        final SubLObject raw_tokens = chunked = standard_tokenization.tokenize_sentence(html_string, white_space_chars, punctuation, UNPROVIDED);
        final SubLObject state = new_html_string_wordify_state();
        SubLObject list_var = NIL;
        SubLObject token = NIL;
        SubLObject i = NIL;
        list_var = chunked;
        token = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , token = list_var.first() , i = add(ONE_INTEGER, i)) {
            final SubLObject v_class = classify_html_string_token(token, punctuation);
            final SubLObject pcase_var = hsw_state_state(state);
            if (pcase_var.eql($INSIDE_TAG)) {
                _csetf_hsw_state_tag_pieces(state, cons(token, hsw_state_tag_pieces(state)));
                if (v_class == $END_OF_TAG) {
                    final SubLObject tag = tag_from_hsw_state(state);
                    if (NIL != hsw_state_string_pieces(state)) {
                        _csetf_hsw_state_following_tags(state, cons(tag, hsw_state_following_tags(state)));
                    } else {
                        _csetf_hsw_state_leading_tags(state, cons(tag, hsw_state_leading_tags(state)));
                    }
                    _csetf_hsw_state_state(state, $NORMAL);
                }
            } else
                if (pcase_var.eql($NORMAL)) {
                    if (v_class == $START_OF_TAG) {
                        if ((NIL != hsw_state_string_pieces(state)) && (!CHAR_slash.eql(string_utilities.first_char(hsw_peek_next_token(i, chunked))))) {
                            final SubLObject word = new_word_from_hsw_state(state);
                            words = cons(word, words);
                        }
                        _csetf_hsw_state_tag_pieces(state, list(token));
                        _csetf_hsw_state_state(state, $INSIDE_TAG);
                    } else
                        if (v_class == $SPACE) {
                            if (NIL != hsw_state_string_pieces(state)) {
                                final SubLObject word = new_word_from_hsw_state(state);
                                words = cons(word, words);
                            }
                            _csetf_hsw_state_punctuation_pieces(state, cons(token, hsw_state_punctuation_pieces(state)));
                        } else
                            if ((v_class == $PUNCTUATION) && (((!string_utilities.first_char(token).eql(CHAR_semicolon)) || (NIL == list_utilities.lengthGE(chunked, add(TWO_INTEGER, i), UNPROVIDED))) || (NIL == member(classify_html_string_token(hsw_peek_next_token(i, chunked), punctuation), $list119, UNPROVIDED, UNPROVIDED)))) {
                                if (NIL != hsw_state_string_pieces(state)) {
                                    final SubLObject word = new_word_from_hsw_state(state);
                                    words = cons(word, words);
                                }
                                hsw_state_add_string_piece(state, token);
                            } else {
                                hsw_state_add_string_piece(state, token);
                            }


                } else {
                    Errors.error($str120$Unknown_state___S, hsw_state_state(state));
                }

            _csetf_hsw_state_current_offset(state, add(hsw_state_current_offset(state), length(token)));
        }
        if (NIL != hsw_state_string_pieces(state)) {
            final SubLObject word2 = new_word_from_hsw_state(state);
            words = cons(word2, words);
        } else
            if (NIL != hsw_state_punctuation_pieces(state)) {
                final SubLObject word2 = words.first();
                SubLObject info = word_info(word2);
                info = putf(info, $FOLLOWING_WHITESPACE, string_utilities.join_strings(nreverse(hsw_state_punctuation_pieces(state)), string_utilities.$empty_string$.getGlobalValue()));
                word_update(word2, list($INFO, info));
            }

        return nreverse(words);
    }

    public static SubLObject hsw_peek_next_token(final SubLObject i, final SubLObject tokens) {
        return nth(number_utilities.f_1X(i), tokens);
    }

    public static SubLObject hsw_state_add_string_piece(final SubLObject state, final SubLObject token) {
        _csetf_hsw_state_string_pieces(state, cons(token, hsw_state_string_pieces(state)));
        return state;
    }

    public static SubLObject hsw_state_clear_string_pieces(final SubLObject state) {
        _csetf_hsw_state_string_pieces(state, NIL);
        return state;
    }

    public static SubLObject tag_from_hsw_state(final SubLObject state) {
        final SubLObject tag = string_utilities.join_strings(nreverse(hsw_state_tag_pieces(state)), string_utilities.$empty_string$.getGlobalValue());
        _csetf_hsw_state_tag_pieces(state, NIL);
        return tag;
    }

    public static SubLObject new_word_from_hsw_state(final SubLObject state) {
        final SubLObject string = string_utilities.join_strings(nreverse(hsw_state_string_pieces(state)), string_utilities.$empty_string$.getGlobalValue());
        final SubLObject leading_tag_string = (NIL != hsw_state_leading_tags(state)) ? string_utilities.join_strings(nreverse(hsw_state_leading_tags(state)), string_utilities.$empty_string$.getGlobalValue()) : NIL;
        final SubLObject following_tag_string = (NIL != hsw_state_following_tags(state)) ? string_utilities.join_strings(nreverse(hsw_state_following_tags(state)), string_utilities.$empty_string$.getGlobalValue()) : NIL;
        final SubLObject punctuation_string = (NIL != hsw_state_punctuation_pieces(state)) ? string_utilities.join_strings(nreverse(hsw_state_punctuation_pieces(state)), string_utilities.$empty_string$.getGlobalValue()) : NIL;
        final SubLObject offset = subtract(hsw_state_current_offset(state), length(string), length(following_tag_string));
        final SubLObject word = new_word(list($STRING, string, $OFFSET, offset));
        hsw_state_clear_string_pieces(state);
        SubLObject info = word_info(word);
        if (NIL != leading_tag_string) {
            info = putf(info, $LEADING_TAGS, leading_tag_string);
            _csetf_hsw_state_leading_tags(state, NIL);
        }
        if (NIL != following_tag_string) {
            info = putf(info, $FOLLOWING_TAGS, following_tag_string);
            _csetf_hsw_state_following_tags(state, NIL);
        }
        if (NIL != punctuation_string) {
            info = putf(info, $LEADING_WHITESPACE, punctuation_string);
            _csetf_hsw_state_punctuation_pieces(state, NIL);
        }
        word_update(word, list($INFO, info));
        return word;
    }

    public static SubLObject fst_wordify_test(final SubLObject word_vector, SubLObject expected_tokenization) {
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject word;
        for (length = length(word_vector), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            word = aref(word_vector, element_num);
            if (!word_string(word).equal(expected_tokenization.first())) {
                return NIL;
            }
            expected_tokenization = expected_tokenization.rest();
        }
        return T;
    }

    public static SubLObject string_to_xml(final SubLObject string) {
        return string_utilities.do_string_substitutions(string, $xml_string_mapping$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject word_to_xml(final SubLObject word, SubLObject level) {
        if (level == UNPROVIDED) {
            level = ZERO_INTEGER;
        }
        return format(NIL, $str133$_a_WRD_a__a__WRD__a, new SubLObject[]{ string_utilities.tabstr(level, $xml_indent$.getGlobalValue()), NIL != word_category(word) ? cconcatenate($str134$_tag__, new SubLObject[]{ word_category(word), $str44$_ }) : string_utilities.$empty_string$.getGlobalValue(), string_to_xml(word_string(word)), $newline$.getGlobalValue() });
    }

    public static SubLObject end_of_sentence_word_p(final SubLObject v_object) {
        return makeBoolean((NIL != word_p(v_object)) && (NIL != member(word_string(v_object), $list135, EQUALP, UNPROVIDED)));
    }

    public static SubLObject quote_word_p(final SubLObject v_object) {
        return makeBoolean((NIL != word_p(v_object)) && (NIL != member(word_string(v_object), $list136, EQUALP, UNPROVIDED)));
    }

    public static SubLObject newline_word_p(final SubLObject v_object) {
        return makeBoolean((NIL != word_p(v_object)) && (NIL != Strings.stringE(word_string(v_object), $str137$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject punctuation_sign_p(final SubLObject v_object) {
        return makeBoolean((NIL != sign_p(v_object)) && (NIL != member(sign_string(v_object), $list138, EQUALP, UNPROVIDED)));
    }

    public static SubLObject sentence_final_punctuation_charP(final SubLObject v_char) {
        return member(v_char, $list139, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sentence_internal_punctuation_charP(final SubLObject v_char) {
        return member(v_char, $list140, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject any_punctuation_charP(final SubLObject v_char) {
        return makeBoolean((NIL != sentence_final_punctuation_charP(v_char)) || (NIL != sentence_internal_punctuation_charP(v_char)));
    }

    public static SubLObject quote_charP(final SubLObject v_char) {
        return member(v_char, $list141, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject new_phrase(SubLObject slot_values) {
        if (slot_values == UNPROVIDED) {
            slot_values = NIL;
        }
        assert NIL != listp(slot_values) : "Types.listp(slot_values) " + "CommonSymbols.NIL != Types.listp(slot_values) " + slot_values;
        final SubLObject phrase = make_sign(UNPROVIDED);
        _csetf_sign_type(phrase, $P);
        phrase_update(phrase, slot_values);
        return phrase;
    }

    public static SubLObject phrase_p(final SubLObject v_object) {
        return makeBoolean((NIL != sign_p(v_object)) && (sign_type(v_object) == $P));
    }

    public static SubLObject phrase_string(final SubLObject phrase) {
        assert NIL != phrase_p(phrase) : "document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) " + phrase;
        return sign_string(phrase);
    }

    public static SubLObject phrase_category(final SubLObject phrase) {
        assert NIL != phrase_p(phrase) : "document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) " + phrase;
        return sign_category(phrase);
    }

    public static SubLObject phrase_yield(final SubLObject phrase) {
        assert NIL != phrase_p(phrase) : "document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) " + phrase;
        return apply(VECTOR, sign_yield(phrase));
    }

    public static SubLObject phrase_do_constituents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list143);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constituent = NIL;
        SubLObject phrase = NIL;
        destructuring_bind_must_consp(current, datum, $list143);
        constituent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list143);
        phrase = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(SIGN_DO_CONSTITUENTS, list(constituent, phrase), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list143);
        return NIL;
    }

    public static SubLObject phrase_constituents(final SubLObject phrase) {
        assert NIL != phrase_p(phrase) : "document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) " + phrase;
        return sign_constituents(phrase);
    }

    public static SubLObject phrase_nodes(final SubLObject phrase) {
        assert NIL != phrase_p(phrase) : "document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) " + phrase;
        SubLObject nodes = list(phrase);
        final SubLObject vector_var = sign_constituents(phrase);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            daughter = aref(vector_var, element_num);
            nodes = nconc(nodes, NIL != phrase_p(daughter) ? phrase_nodes(daughter) : list(daughter));
        }
        return nodes;
    }

    public static SubLObject phrase_intervals(final SubLObject phrase, SubLObject start) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        assert NIL != phrase_p(phrase) : "document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) " + phrase;
        assert NIL != integerp(start) : "Types.integerp(start) " + "CommonSymbols.NIL != Types.integerp(start) " + start;
        SubLObject nodes = NIL;
        SubLObject daughter_index = start;
        final SubLObject vector_var = sign_constituents(phrase);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            daughter = aref(vector_var, element_num);
            nodes = nconc(NIL != phrase_p(daughter) ? phrase_intervals(daughter, daughter_index) : list(standard_tokenization.new_interval_token(daughter_index, add(daughter_index, ONE_INTEGER), daughter)), nodes);
            daughter_index = standard_tokenization.interval_token_end(nodes.first());
        }
        nodes = cons(standard_tokenization.new_interval_token(start, standard_tokenization.interval_token_end(nodes.first()), phrase), nodes);
        return nodes;
    }

    public static SubLObject phrase_info(final SubLObject phrase) {
        assert NIL != phrase_p(phrase) : "document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) " + phrase;
        return sign_info(phrase);
    }

    public static SubLObject phrase_update(final SubLObject phrase, final SubLObject slot_values) {
        assert NIL != phrase_p(phrase) : "document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) " + phrase;
        assert NIL != listp(slot_values) : "Types.listp(slot_values) " + "CommonSymbols.NIL != Types.listp(slot_values) " + slot_values;
        return sign_update(phrase, slot_values);
    }

    public static SubLObject phrase_get(final SubLObject phrase, final SubLObject index) {
        assert NIL != phrase_p(phrase) : "document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) " + phrase;
        assert NIL != integerp(index) : "Types.integerp(index) " + "CommonSymbols.NIL != Types.integerp(index) " + index;
        return sign_get(phrase, index);
    }

    public static SubLObject phrase_set(final SubLObject phrase, final SubLObject index, final SubLObject sign) {
        assert NIL != phrase_p(phrase) : "document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) " + phrase;
        assert NIL != integerp(index) : "Types.integerp(index) " + "CommonSymbols.NIL != Types.integerp(index) " + index;
        assert NIL != sign_p(sign) : "document.sign_p(sign) " + "CommonSymbols.NIL != document.sign_p(sign) " + sign;
        return sign_set(phrase, index, sign);
    }

    public static SubLObject phrase_constituent_length(final SubLObject phrase) {
        assert NIL != phrase_p(phrase) : "document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) " + phrase;
        return sign_length(phrase);
    }

    public static SubLObject phrase_to_xml(final SubLObject phrase, SubLObject level) {
        if (level == UNPROVIDED) {
            level = ZERO_INTEGER;
        }
        SubLObject daughters_xml = string_utilities.$empty_string$.getGlobalValue();
        final SubLObject vector_var = sign_constituents(phrase);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            daughter = aref(vector_var, element_num);
            daughters_xml = cconcatenate(daughters_xml, sign_to_xml(daughter, add(level, ONE_INTEGER)));
        }
        return format(NIL, $str145$_a_PHR_a__a_a_a__PHR__a, new SubLObject[]{ string_utilities.tabstr(level, $xml_indent$.getGlobalValue()), NIL != phrase_category(phrase) ? cconcatenate($str146$_cat__, new SubLObject[]{ princ_to_string(phrase_category(phrase)), $str44$_ }) : string_utilities.$empty_string$.getGlobalValue(), $newline$.getGlobalValue(), daughters_xml, string_utilities.tabstr(level, $xml_indent$.getGlobalValue()), $newline$.getGlobalValue() });
    }

    public static SubLObject sentence_do_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = NIL;
        SubLObject sentence = NIL;
        destructuring_bind_must_consp(current, datum, $list147);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list147);
        sentence = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOLIST, list(word, list(SENTENCE_YIELD_EXHAUSTIVE, sentence)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list147);
        return NIL;
    }

    public static SubLObject sentence_do_minimal_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = NIL;
        SubLObject sentence = NIL;
        destructuring_bind_must_consp(current, datum, $list147);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list147);
        sentence = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOVECTOR, list(word, list(SENTENCE_YIELD, sentence)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list147);
        return NIL;
    }

    public static SubLObject new_sentence(SubLObject string, SubLObject wordifier) {
        if (string == UNPROVIDED) {
            string = NIL;
        }
        if (wordifier == UNPROVIDED) {
            wordifier = FST_STRING_WORDIFY;
        }
        if (((NIL != string) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(string))) {
            throw new AssertionError(string);
        }
        final SubLObject sentence = new_phrase(UNPROVIDED);
        if (NIL != string) {
            _csetf_sign_string(sentence, string);
        }
        _csetf_sign_category(sentence, $S);
        if (NIL != string) {
            _csetf_sign_constituents(sentence, string_wordify(string, wordifier));
            SubLObject cdolist_list_var = sentence_yield_exhaustive(sentence);
            SubLObject word = NIL;
            word = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                _csetf_sign_mother(word, sentence);
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            } 
        }
        sign_update(sentence, $list152);
        return sentence;
    }

    public static SubLObject sentence_p(final SubLObject v_object) {
        return makeBoolean((NIL != phrase_p(v_object)) && (phrase_category(v_object) == $S));
    }

    public static SubLObject sentence_print(final SubLObject sentence, final SubLObject stream, final SubLObject depth) {
        return sign_print(sentence, stream, depth);
    }

    public static SubLObject sentence_string(final SubLObject sentence) {
        assert NIL != sentence_p(sentence) : "document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) " + sentence;
        return sign_string(sentence);
    }

    public static SubLObject sentence_category(final SubLObject sentence) {
        assert NIL != sentence_p(sentence) : "document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) " + sentence;
        return sign_category(sentence);
    }

    public static SubLObject sentence_yield(final SubLObject sentence) {
        assert NIL != sentence_p(sentence) : "document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) " + sentence;
        return phrase_yield(sentence);
    }

    public static SubLObject sentence_yield_exhaustive(final SubLObject sentence) {
        assert NIL != sentence_p(sentence) : "document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) " + sentence;
        SubLObject result_yield = NIL;
        final SubLObject vector_var = phrase_yield(sentence);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject word;
        SubLObject items_var;
        SubLObject vector_var_$1;
        SubLObject backwardP_var_$2;
        SubLObject length_$3;
        SubLObject v_iteration_$4;
        SubLObject element_num_$5;
        SubLObject item;
        SubLObject cdolist_list_var;
        SubLObject item2;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            word = aref(vector_var, element_num);
            if (NIL != exhaustive_word_p(word)) {
                items_var = word_constituents(word);
                if (items_var.isVector()) {
                    vector_var_$1 = items_var;
                    backwardP_var_$2 = NIL;
                    for (length_$3 = length(vector_var_$1), v_iteration_$4 = NIL, v_iteration_$4 = ZERO_INTEGER; v_iteration_$4.numL(length_$3); v_iteration_$4 = add(v_iteration_$4, ONE_INTEGER)) {
                        element_num_$5 = (NIL != backwardP_var_$2) ? subtract(length_$3, v_iteration_$4, ONE_INTEGER) : v_iteration_$4;
                        item = aref(vector_var_$1, element_num_$5);
                        result_yield = cons(item, result_yield);
                    }
                } else {
                    cdolist_list_var = items_var;
                    item2 = NIL;
                    item2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        result_yield = cons(item2, result_yield);
                        cdolist_list_var = cdolist_list_var.rest();
                        item2 = cdolist_list_var.first();
                    } 
                }
            } else {
                result_yield = cons(word, result_yield);
            }
        }
        return nreverse(result_yield);
    }

    public static SubLObject sentence_constituents(final SubLObject sentence) {
        assert NIL != sentence_p(sentence) : "document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) " + sentence;
        return sign_constituents(sentence);
    }

    public static SubLObject sentence_info(final SubLObject sentence) {
        assert NIL != sentence_p(sentence) : "document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) " + sentence;
        return sign_info(sentence);
    }

    public static SubLObject sentence_offset(final SubLObject sentence) {
        assert NIL != sentence_p(sentence) : "document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) " + sentence;
        return sign_offset(sentence);
    }

    public static SubLObject sentence_index(final SubLObject sentence) {
        final SubLObject paragraph = sentence_mother(sentence);
        SubLObject i = ZERO_INTEGER;
        if (NIL != paragraph) {
            while (!sentence.eql(paragraph_get(paragraph, i))) {
                i = add(i, ONE_INTEGER);
            } 
            return i;
        }
        return NIL;
    }

    public static SubLObject sentence_get(final SubLObject sentence, final SubLObject index) {
        assert NIL != sentence_p(sentence) : "document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) " + sentence;
        assert NIL != integerp(index) : "Types.integerp(index) " + "CommonSymbols.NIL != Types.integerp(index) " + index;
        return sign_get(sentence, index);
    }

    public static SubLObject sentence_mother(final SubLObject sentence) {
        assert NIL != sentence_p(sentence) : "document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) " + sentence;
        return sign_mother(sentence);
    }

    public static SubLObject sentence_set(final SubLObject sentence, final SubLObject index, final SubLObject sign) {
        assert NIL != sentence_p(sentence) : "document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) " + sentence;
        assert NIL != integerp(index) : "Types.integerp(index) " + "CommonSymbols.NIL != Types.integerp(index) " + index;
        assert NIL != sign_p(sign) : "document.sign_p(sign) " + "CommonSymbols.NIL != document.sign_p(sign) " + sign;
        return sign_set(sentence, index, sign);
    }

    public static SubLObject sentence_length(final SubLObject sentence) {
        assert NIL != sentence_p(sentence) : "document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) " + sentence;
        return sign_length(sentence);
    }

    public static SubLObject sentence_do_constituents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list154);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constituent = NIL;
        SubLObject sentence = NIL;
        destructuring_bind_must_consp(current, datum, $list154);
        constituent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list154);
        sentence = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(SIGN_DO_CONSTITUENTS, list(constituent, sentence), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list154);
        return NIL;
    }

    public static SubLObject sentence_reconstruct_substring(final SubLObject start, final SubLObject end, final SubLObject sentence) {
        final SubLObject sentence_string = sentence_string(sentence);
        SubLObject last_index = ZERO_INTEGER;
        SubLObject output_strings = NIL;
        SubLObject i;
        SubLObject word;
        SubLObject word_string;
        SubLObject remaining_sentence_string;
        SubLObject word_start;
        SubLObject first_space;
        SubLObject word_end;
        for (i = NIL, i = ZERO_INTEGER; i.numL(end); i = add(i, ONE_INTEGER)) {
            word = sentence_get(sentence, i);
            word_string = word_string(word);
            remaining_sentence_string = string_utilities.substring(sentence_string, last_index, UNPROVIDED);
            word_start = search(word_string, remaining_sentence_string, EQUAL, IDENTITY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            first_space = (NIL != word_start) ? NIL : search($$$_, remaining_sentence_string, EQUAL, IDENTITY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            word_end = (word_start.isInteger()) ? add(word_start, length(word_string)) : first_space.isInteger() ? first_space : ZERO_INTEGER;
            last_index = add(last_index, word_end);
            if (i.numGE(start)) {
                if ((NIL != output_strings) || (NIL == word_start)) {
                    word_string = string_utilities.substring(remaining_sentence_string, ZERO_INTEGER, word_end);
                }
                output_strings = cons(word_string, output_strings);
            }
        }
        return apply(CCONCATENATE, nreverse(output_strings));
    }

    public static SubLObject construct_string_from_words(final SubLObject words, SubLObject standardizeP, SubLObject stream) {
        if (standardizeP == UNPROVIDED) {
            standardizeP = NIL;
        }
        if (stream == UNPROVIDED) {
            stream = make_private_string_output_stream();
        }
        clear_output(stream);
        if (NIL != words) {
            SubLObject current_end = word_offset(words.first());
            SubLObject cdolist_list_var = words;
            SubLObject word = NIL;
            word = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (word_offset(word).numG(current_end)) {
                    SubLObject cdotimes_end_var;
                    SubLObject n;
                    for (cdotimes_end_var = subtract(word_offset(word), current_end), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
                        write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
                        current_end = add(current_end, ONE_INTEGER);
                    }
                }
                if (NIL != standardizeP) {
                    final SubLObject standardized = caar(nl_trie.nl_trie_standardize_strings(list(word_string(word))));
                    write_string(NIL != standardized ? standardized : $str38$, stream, UNPROVIDED, UNPROVIDED);
                } else {
                    write_string(word_string(word), stream, UNPROVIDED, UNPROVIDED);
                }
                current_end = add(current_end, length(word_string(word)));
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            } 
        }
        return get_output_stream_string(stream);
    }

    public static SubLObject sentence_delete_punctuation(final SubLObject sentence) {
        assert NIL != sentence_p(sentence) : "document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) " + sentence;
        delete_if(PUNCTUATION_SIGN_P, sentence_constituents(sentence), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return sentence;
    }

    public static SubLObject sentence_listify(final SubLObject sentence) {
        return vector_utilities.vector_elements(sentence_constituents(sentence), UNPROVIDED);
    }

    public static SubLObject sentence_stringify(final SubLObject sentence) {
        return Mapping.mapcar(SIGN_STRING, sentence_listify(sentence));
    }

    public static SubLObject build_sentence_token(final SubLObject fst, SubLObject wordifier) {
        if (wordifier == UNPROVIDED) {
            wordifier = (NIL != $wordifier$.getDynamicValue()) ? $wordifier$.getDynamicValue() : FST_STRING_WORDIFY;
        }
        final SubLObject sentence = new_sentence(NIL, wordifier);
        SubLObject string = $str38$;
        SubLObject current_index = NIL;
        _csetf_sign_constituents(sentence, apply(symbol_function(VECTOR), finite_state_transducer.fst_output(fst)));
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            SubLObject cdolist_list_var = sentence_yield_exhaustive(sentence);
            SubLObject word = NIL;
            word = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject word_offset = sign_offset(word);
                if ((NIL != current_index) && current_index.numL(word_offset)) {
                    SubLObject cdotimes_end_var;
                    SubLObject n;
                    for (cdotimes_end_var = subtract(word_offset, current_index), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
                        princ($$$_, stream);
                    }
                }
                _csetf_sign_mother(word, sentence);
                princ(word_string(word), stream);
                current_index = add(word_offset, word_length(word));
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            } 
            string = get_output_stream_string(stream);
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
        _csetf_sign_offset(sentence, word_offset(sentence_get(sentence, ZERO_INTEGER)));
        _csetf_sign_string(sentence, string);
        return sentence;
    }

    public static SubLObject string_sentencify(final SubLObject string, SubLObject wordifier) {
        if (wordifier == UNPROVIDED) {
            wordifier = RKF_STANDARD_STRING_WORDIFY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentences = NIL;
        final SubLObject _prev_bind_0 = $wordifier$.currentBinding(thread);
        try {
            $wordifier$.bind(wordifier, thread);
            sentences = finite_state_transducer.fst_match_global($sentencifier_fst$.getDynamicValue(thread), string_wordify(string, wordifier));
        } finally {
            $wordifier$.rebind(_prev_bind_0, thread);
        }
        return sentences;
    }

    public static SubLObject newline_sentence_p(final SubLObject v_object) {
        return makeBoolean((NIL != sentence_p(v_object)) && aref(word_string(aref(sign_constituents(v_object), ZERO_INTEGER)), ZERO_INTEGER).eql(CHAR_newline));
    }

    public static SubLObject paragraph_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        paragraph_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject paragraph_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$paragraph_native.class ? T : NIL;
    }

    public static SubLObject paragraph_sentences(final SubLObject v_object) {
        assert NIL != paragraph_p(v_object) : "document.paragraph_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject paragraph_mother(final SubLObject v_object) {
        assert NIL != paragraph_p(v_object) : "document.paragraph_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_paragraph_sentences(final SubLObject v_object, final SubLObject value) {
        assert NIL != paragraph_p(v_object) : "document.paragraph_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_paragraph_mother(final SubLObject v_object, final SubLObject value) {
        assert NIL != paragraph_p(v_object) : "document.paragraph_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_paragraph(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $paragraph_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SENTENCES)) {
                _csetf_paragraph_sentences(v_new, current_value);
            } else
                if (pcase_var.eql($MOTHER)) {
                    _csetf_paragraph_mother(v_new, current_value);
                } else {
                    Errors.error($str31$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_paragraph(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PARAGRAPH, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SENTENCES, paragraph_sentences(obj));
        funcall(visitor_fn, obj, $SLOT, $MOTHER, paragraph_mother(obj));
        funcall(visitor_fn, obj, $END, MAKE_PARAGRAPH, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_paragraph_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_paragraph(obj, visitor_fn);
    }

    public static SubLObject paragraph_do_sentences(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list173);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sentence = NIL;
        SubLObject paragraph = NIL;
        destructuring_bind_must_consp(current, datum, $list173);
        sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list173);
        paragraph = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOVECTOR, list(sentence, list(PARAGRAPH_SENTENCES, paragraph)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list173);
        return NIL;
    }

    public static SubLObject paragraph_do_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list174);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = NIL;
        SubLObject paragraph = NIL;
        destructuring_bind_must_consp(current, datum, $list174);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list174);
        paragraph = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject sentence = $sym175$SENTENCE;
            return list(PARAGRAPH_DO_SENTENCES, list(sentence, paragraph), listS(SENTENCE_DO_WORDS, list(word, sentence), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list174);
        return NIL;
    }

    public static SubLObject paragraph_do_minimal_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list174);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = NIL;
        SubLObject paragraph = NIL;
        destructuring_bind_must_consp(current, datum, $list174);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list174);
        paragraph = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject sentence = $sym178$SENTENCE;
            return list(PARAGRAPH_DO_SENTENCES, list(sentence, paragraph), listS(SENTENCE_DO_MINIMAL_WORDS, list(word, sentence), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list174);
        return NIL;
    }

    public static SubLObject new_paragraph(final SubLObject string) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        final SubLObject paragraph = make_paragraph(UNPROVIDED);
        _csetf_paragraph_sentences(paragraph, string_sentencify(string, UNPROVIDED));
        final SubLObject vector_var = paragraph_sentences(paragraph);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sen;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            sen = aref(vector_var, element_num);
            _csetf_sign_mother(sen, paragraph);
        }
        return paragraph;
    }

    public static SubLObject paragraph_print(final SubLObject paragraph, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != paragraph_p(paragraph) : "document.paragraph_p(paragraph) " + "CommonSymbols.NIL != document.paragraph_p(paragraph) " + paragraph;
        write_string($str180$__PAR_, stream, UNPROVIDED, UNPROVIDED);
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = min(paragraph_sentence_length(paragraph), $text_class_print_length$.getDynamicValue(thread)), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            terpri(stream);
            sentence_print(paragraph_get(paragraph, i), stream, ZERO_INTEGER);
        }
        if ($text_class_print_length$.getDynamicValue(thread).numL(paragraph_sentence_length(paragraph))) {
            write_string($str46$____, stream, UNPROVIDED, UNPROVIDED);
        }
        write_string($str48$_, stream, UNPROVIDED, UNPROVIDED);
        return paragraph;
    }

    public static SubLObject paragraph_get(final SubLObject paragraph, final SubLObject index) {
        assert NIL != paragraph_p(paragraph) : "document.paragraph_p(paragraph) " + "CommonSymbols.NIL != document.paragraph_p(paragraph) " + paragraph;
        assert NIL != integerp(index) : "Types.integerp(index) " + "CommonSymbols.NIL != Types.integerp(index) " + index;
        return aref(paragraph_sentences(paragraph), index);
    }

    public static SubLObject paragraph_set(final SubLObject paragraph, final SubLObject index, final SubLObject sentence) {
        assert NIL != paragraph_p(paragraph) : "document.paragraph_p(paragraph) " + "CommonSymbols.NIL != document.paragraph_p(paragraph) " + paragraph;
        assert NIL != integerp(index) : "Types.integerp(index) " + "CommonSymbols.NIL != Types.integerp(index) " + index;
        assert NIL != sentence_p(sentence) : "document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) " + sentence;
        final SubLObject old_sentence = aref(paragraph_sentences(paragraph), index);
        set_aref(paragraph_sentences(paragraph), index, sentence);
        _csetf_sign_mother(sentence, paragraph);
        return old_sentence;
    }

    public static SubLObject paragraph_sentence_length(final SubLObject paragraph) {
        assert NIL != paragraph_p(paragraph) : "document.paragraph_p(paragraph) " + "CommonSymbols.NIL != document.paragraph_p(paragraph) " + paragraph;
        return length(paragraph_sentences(paragraph));
    }

    public static SubLObject paragraph_word_length(final SubLObject paragraph) {
        assert NIL != paragraph_p(paragraph) : "document.paragraph_p(paragraph) " + "CommonSymbols.NIL != document.paragraph_p(paragraph) " + paragraph;
        SubLObject length = ZERO_INTEGER;
        final SubLObject vector_var = paragraph_sentences(paragraph);
        final SubLObject backwardP_var = NIL;
        SubLObject length_$6;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sentence;
        for (length_$6 = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length_$6); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length_$6, v_iteration, ONE_INTEGER) : v_iteration;
            sentence = aref(vector_var, element_num);
            length = add(length, sentence_length(sentence));
        }
        return length;
    }

    public static SubLObject paragraph_offset(final SubLObject paragraph) {
        return sentence_offset(paragraph_get(paragraph, ZERO_INTEGER));
    }

    public static SubLObject paragraph_string(final SubLObject paragraph) {
        SubLObject output_string = NIL;
        SubLObject current_end = ZERO_INTEGER;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            final SubLObject vector_var = paragraph_sentences(paragraph);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject sent;
            SubLObject diff;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                sent = aref(vector_var, element_num);
                if (current_end.numL(sentence_offset(sent))) {
                    diff = subtract(sentence_offset(sent), current_end);
                    string_utilities.indent(s, diff);
                    current_end = add(current_end, diff);
                }
                princ(sentence_string(sent), s);
                current_end = add(current_end, length(sentence_string(sent)));
            }
            output_string = get_output_stream_string(s);
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
        return output_string;
    }

    public static SubLObject paragraph_to_xml(final SubLObject paragraph, SubLObject level) {
        if (level == UNPROVIDED) {
            level = ZERO_INTEGER;
        }
        assert NIL != paragraph_p(paragraph) : "document.paragraph_p(paragraph) " + "CommonSymbols.NIL != document.paragraph_p(paragraph) " + paragraph;
        SubLObject xml = NIL;
        xml = cconcatenate(string_utilities.tabstr(level, $xml_indent$.getGlobalValue()), new SubLObject[]{ $str181$_PAR_, $newline$.getGlobalValue() });
        final SubLObject vector_var = paragraph_sentences(paragraph);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sentence;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            sentence = aref(vector_var, element_num);
            xml = cconcatenate(xml, sign_to_xml(sentence, add(level, ONE_INTEGER)));
        }
        xml = cconcatenate(xml, new SubLObject[]{ string_utilities.tabstr(level, $xml_indent$.getGlobalValue()), $str182$__PAR_, $newline$.getGlobalValue() });
        return xml;
    }

    public static SubLObject build_paragraph_token(final SubLObject fst) {
        final SubLObject paragraph = make_paragraph(UNPROVIDED);
        _csetf_paragraph_sentences(paragraph, apply(VECTOR, finite_state_transducer.fst_output(fst)));
        final SubLObject vector_var = paragraph_sentences(paragraph);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sen;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            sen = aref(vector_var, element_num);
            _csetf_sign_mother(sen, paragraph);
        }
        return paragraph;
    }

    public static SubLObject string_paragraphize(final SubLObject string, SubLObject wordifier, SubLObject sentencifyP) {
        if (wordifier == UNPROVIDED) {
            wordifier = FST_STRING_WORDIFY;
        }
        if (sentencifyP == UNPROVIDED) {
            sentencifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sentencifyP) {
            return finite_state_transducer.fst_match_global($paragraphier_fst$.getDynamicValue(thread), string_sentencify(string, wordifier));
        }
        final SubLObject paragraph = make_paragraph(UNPROVIDED);
        final SubLObject sentence = new_sentence(string, wordifier);
        _csetf_paragraph_sentences(paragraph, make_vector(ONE_INTEGER, sentence));
        final SubLObject vector_var = paragraph_sentences(paragraph);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sen;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            sen = aref(vector_var, element_num);
            _csetf_sign_mother(sen, paragraph);
        }
        return make_vector(ONE_INTEGER, paragraph);
    }

    public static SubLObject sign_to_xml(final SubLObject sign, SubLObject level) {
        if (level == UNPROVIDED) {
            level = ZERO_INTEGER;
        }
        assert NIL != sign_p(sign) : "document.sign_p(sign) " + "CommonSymbols.NIL != document.sign_p(sign) " + sign;
        if (NIL != word_p(sign)) {
            return word_to_xml(sign, level);
        }
        return phrase_to_xml(sign, level);
    }

    public static SubLObject document_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        document_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject document_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$document_native.class ? T : NIL;
    }

    public static SubLObject document_paragraphs(final SubLObject v_object) {
        assert NIL != document_p(v_object) : "document.document_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_document_paragraphs(final SubLObject v_object, final SubLObject value) {
        assert NIL != document_p(v_object) : "document.document_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_document(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $document_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PARAGRAPHS)) {
                _csetf_document_paragraphs(v_new, current_value);
            } else {
                Errors.error($str31$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_document(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_DOCUMENT, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PARAGRAPHS, document_paragraphs(obj));
        funcall(visitor_fn, obj, $END, MAKE_DOCUMENT, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_document_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_document(obj, visitor_fn);
    }

    public static SubLObject new_document(final SubLObject input, SubLObject sentencifyP, SubLObject wordifier) {
        if (sentencifyP == UNPROVIDED) {
            sentencifyP = T;
        }
        if (wordifier == UNPROVIDED) {
            wordifier = FST_STRING_WORDIFY;
        }
        if (input.isString()) {
            return possibly_perform_document_dot_analysis(new_document_from_string(input, wordifier, sentencifyP));
        }
        if (input.isStream()) {
            return possibly_perform_document_dot_analysis(new_document_from_stream(input, wordifier, sentencifyP));
        }
        Errors.error($str197$_A_is_neither_a_string_nor_a_stre);
        return NIL;
    }

    public static SubLObject document_do_paragraphs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list198);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject paragraph = NIL;
        SubLObject v_document = NIL;
        destructuring_bind_must_consp(current, datum, $list198);
        paragraph = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list198);
        v_document = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOVECTOR, list(paragraph, list(DOCUMENT_PARAGRAPHS, v_document)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list198);
        return NIL;
    }

    public static SubLObject document_do_sentences(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list199);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sentence = NIL;
        SubLObject v_document = NIL;
        destructuring_bind_must_consp(current, datum, $list199);
        sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list199);
        v_document = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject paragraph = $sym200$PARAGRAPH;
            return list(DOCUMENT_DO_PARAGRAPHS, list(paragraph, v_document), listS(PARAGRAPH_DO_SENTENCES, list(sentence, paragraph), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list199);
        return NIL;
    }

    public static SubLObject possibly_perform_document_dot_analysis(final SubLObject doc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $perform_dot_analysis_on_docs$.getDynamicValue(thread) ? document_perform_dot_analysis(doc) : doc;
    }

    public static SubLObject document_perform_dot_analysis(final SubLObject doc) {
        final SubLObject vector_var = document_paragraphs(doc);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$7;
        SubLObject backwardP_var_$8;
        SubLObject length_$9;
        SubLObject v_iteration_$10;
        SubLObject element_num_$11;
        SubLObject sent;
        SubLObject prev_word;
        SubLObject combinations;
        SubLObject cdolist_list_var;
        SubLObject word;
        SubLObject combo;
        SubLObject current;
        SubLObject datum;
        SubLObject first_word;
        SubLObject second_word;
        SubLObject sent_$12;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$7 = paragraph_sentences(paragraph);
            backwardP_var_$8 = NIL;
            length_$9 = length(vector_var_$7);
            v_iteration_$10 = NIL;
            v_iteration_$10 = ZERO_INTEGER;
            if (v_iteration_$10.numL(length_$9)) {
                element_num_$11 = (NIL != backwardP_var_$8) ? subtract(length_$9, v_iteration_$10, ONE_INTEGER) : v_iteration_$10;
                sent = aref(vector_var_$7, element_num_$11);
                prev_word = NIL;
                combinations = NIL;
                cdolist_list_var = sentence_yield_exhaustive(sent);
                word = NIL;
                word = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((((NIL != prev_word) && (NIL != word)) && ONE_INTEGER.eql(word_length(prev_word))) && $str202$_.equal(word_string(word))) {
                        combinations = cons(list(prev_word, word, sent), combinations);
                    }
                    prev_word = word;
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                } 
                cdolist_list_var = combinations;
                combo = NIL;
                combo = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    datum = current = combo;
                    first_word = NIL;
                    second_word = NIL;
                    sent_$12 = NIL;
                    destructuring_bind_must_consp(current, datum, $list203);
                    first_word = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list203);
                    second_word = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list203);
                    sent_$12 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        set_word_string(first_word, cconcatenate(word_string(first_word), word_string(second_word)));
                        delete(second_word, sign_constituents(sent_$12), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        cdestructuring_bind_error(datum, $list203);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    combo = cdolist_list_var.first();
                } 
                return doc;
            }
        }
        return NIL;
    }

    public static SubLObject new_document_from_string(final SubLObject string, SubLObject wordifier, SubLObject sentencifyP) {
        if (wordifier == UNPROVIDED) {
            wordifier = FST_STRING_WORDIFY;
        }
        if (sentencifyP == UNPROVIDED) {
            sentencifyP = T;
        }
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        final SubLObject doc = make_document(UNPROVIDED);
        _csetf_document_paragraphs(doc, string_paragraphize(string, wordifier, sentencifyP));
        final SubLObject vector_var = document_paragraphs(doc);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject par;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            par = aref(vector_var, element_num);
            _csetf_paragraph_mother(par, doc);
        }
        return doc;
    }

    public static SubLObject new_document_from_file(final SubLObject path, SubLObject sentencifyP, SubLObject wordifier) {
        if (sentencifyP == UNPROVIDED) {
            sentencifyP = T;
        }
        if (wordifier == UNPROVIDED) {
            wordifier = FST_STRING_WORDIFY;
        }
        assert NIL != stringp(path) : "Types.stringp(path) " + "CommonSymbols.NIL != Types.stringp(path) " + path;
        SubLObject doc = make_document(UNPROVIDED);
        if (NIL != Filesys.probe_file(path)) {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(path, $INPUT);
                if (!stream.isStream()) {
                    Errors.error($str205$Unable_to_open__S, path);
                }
                final SubLObject stream_$13 = stream;
                doc = new_document(stream_$13, sentencifyP, wordifier);
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
        }
        return doc;
    }

    public static SubLObject new_document_from_stream(final SubLObject in_stream, SubLObject wordifier, SubLObject sentencifyP) {
        if (wordifier == UNPROVIDED) {
            wordifier = FST_STRING_WORDIFY;
        }
        if (sentencifyP == UNPROVIDED) {
            sentencifyP = T;
        }
        assert NIL != input_stream_p(in_stream) : "streams_high.input_stream_p(in_stream) " + "CommonSymbols.NIL != streams_high.input_stream_p(in_stream) " + in_stream;
        final SubLObject doc = make_document(UNPROVIDED);
        _csetf_document_paragraphs(doc, string_paragraphize(stream_stringify(in_stream), wordifier, sentencifyP));
        final SubLObject vector_var = document_paragraphs(doc);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject par;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            par = aref(vector_var, element_num);
            _csetf_paragraph_mother(par, doc);
        }
        return doc;
    }

    public static SubLObject document_print(final SubLObject v_document, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != document_p(v_document) : "document.document_p(v_document) " + "CommonSymbols.NIL != document.document_p(v_document) " + v_document;
        write_string($str207$__DOC_, stream, UNPROVIDED, UNPROVIDED);
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = min(document_paragraph_length(v_document), $text_class_print_length$.getDynamicValue(thread)), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            terpri(stream);
            paragraph_print(document_get(v_document, i), stream, ZERO_INTEGER);
        }
        if ($text_class_print_length$.getDynamicValue(thread).numL(document_paragraph_length(v_document))) {
            write_string($str46$____, stream, UNPROVIDED, UNPROVIDED);
        }
        write_string($str48$_, stream, UNPROVIDED, UNPROVIDED);
        return v_document;
    }

    public static SubLObject document_get(final SubLObject v_document, final SubLObject index) {
        assert NIL != document_p(v_document) : "document.document_p(v_document) " + "CommonSymbols.NIL != document.document_p(v_document) " + v_document;
        assert NIL != integerp(index) : "Types.integerp(index) " + "CommonSymbols.NIL != Types.integerp(index) " + index;
        return aref(document_paragraphs(v_document), index);
    }

    public static SubLObject document_set(final SubLObject v_document, final SubLObject index, final SubLObject paragraph) {
        assert NIL != document_p(v_document) : "document.document_p(v_document) " + "CommonSymbols.NIL != document.document_p(v_document) " + v_document;
        assert NIL != integerp(index) : "Types.integerp(index) " + "CommonSymbols.NIL != Types.integerp(index) " + index;
        assert NIL != paragraph_p(paragraph) : "document.paragraph_p(paragraph) " + "CommonSymbols.NIL != document.paragraph_p(paragraph) " + paragraph;
        final SubLObject old_paragraph = aref(document_paragraphs(v_document), index);
        set_aref(document_paragraphs(v_document), index, paragraph);
        _csetf_paragraph_mother(paragraph, v_document);
        return old_paragraph;
    }

    public static SubLObject document_get_sentence(final SubLObject v_document, final SubLObject index) {
        assert NIL != document_p(v_document) : "document.document_p(v_document) " + "CommonSymbols.NIL != document.document_p(v_document) " + v_document;
        assert NIL != integerp(index) : "Types.integerp(index) " + "CommonSymbols.NIL != Types.integerp(index) " + index;
        SubLObject current = ZERO_INTEGER;
        final SubLObject vector_var = document_paragraphs(v_document);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$14;
        SubLObject backwardP_var_$15;
        SubLObject length_$16;
        SubLObject v_iteration_$17;
        SubLObject element_num_$18;
        SubLObject sentence;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$14 = paragraph_sentences(paragraph);
            backwardP_var_$15 = NIL;
            for (length_$16 = length(vector_var_$14), v_iteration_$17 = NIL, v_iteration_$17 = ZERO_INTEGER; v_iteration_$17.numL(length_$16); v_iteration_$17 = add(v_iteration_$17, ONE_INTEGER)) {
                element_num_$18 = (NIL != backwardP_var_$15) ? subtract(length_$16, v_iteration_$17, ONE_INTEGER) : v_iteration_$17;
                sentence = aref(vector_var_$14, element_num_$18);
                if (current.numE(index)) {
                    return sentence;
                }
                current = add(current, ONE_INTEGER);
            }
        }
        return Errors.error(format(NIL, $str208$Sentence_index__A_out_of_bounds_, index));
    }

    public static SubLObject document_get_word(final SubLObject v_document, final SubLObject index) {
        assert NIL != document_p(v_document) : "document.document_p(v_document) " + "CommonSymbols.NIL != document.document_p(v_document) " + v_document;
        assert NIL != integerp(index) : "Types.integerp(index) " + "CommonSymbols.NIL != Types.integerp(index) " + index;
        SubLObject current_word_index = ZERO_INTEGER;
        final SubLObject vector_var = document_paragraphs(v_document);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$19;
        SubLObject backwardP_var_$20;
        SubLObject length_$21;
        SubLObject v_iteration_$22;
        SubLObject element_num_$23;
        SubLObject sentence;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$19 = paragraph_sentences(paragraph);
            backwardP_var_$20 = NIL;
            for (length_$21 = length(vector_var_$19), v_iteration_$22 = NIL, v_iteration_$22 = ZERO_INTEGER; v_iteration_$22.numL(length_$21); v_iteration_$22 = add(v_iteration_$22, ONE_INTEGER)) {
                element_num_$23 = (NIL != backwardP_var_$20) ? subtract(length_$21, v_iteration_$22, ONE_INTEGER) : v_iteration_$22;
                sentence = aref(vector_var_$19, element_num_$23);
                if (add(current_word_index, sentence_length(sentence)).numG(index)) {
                    return sentence_get(sentence, subtract(index, current_word_index));
                }
                current_word_index = add(current_word_index, sentence_length(sentence));
            }
        }
        return Errors.error(format(NIL, $str208$Sentence_index__A_out_of_bounds_, index));
    }

    public static SubLObject document_to_xml(final SubLObject v_document) {
        assert NIL != document_p(v_document) : "document.document_p(v_document) " + "CommonSymbols.NIL != document.document_p(v_document) " + v_document;
        SubLObject xml = NIL;
        xml = cconcatenate($str209$_DOC_, $newline$.getGlobalValue());
        final SubLObject vector_var = document_paragraphs(v_document);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            xml = cconcatenate(xml, paragraph_to_xml(paragraph, ONE_INTEGER));
        }
        xml = cconcatenate(xml, new SubLObject[]{ $str210$__DOC_, $newline$.getGlobalValue() });
        return xml;
    }

    public static SubLObject document_paragraph_length(final SubLObject v_document) {
        assert NIL != document_p(v_document) : "document.document_p(v_document) " + "CommonSymbols.NIL != document.document_p(v_document) " + v_document;
        return length(document_paragraphs(v_document));
    }

    public static SubLObject document_sentence_length(final SubLObject v_document) {
        assert NIL != document_p(v_document) : "document.document_p(v_document) " + "CommonSymbols.NIL != document.document_p(v_document) " + v_document;
        SubLObject length = ZERO_INTEGER;
        final SubLObject vector_var = document_paragraphs(v_document);
        final SubLObject backwardP_var = NIL;
        SubLObject length_$24;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        for (length_$24 = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length_$24); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length_$24, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            length = add(length, paragraph_sentence_length(paragraph));
        }
        return length;
    }

    public static SubLObject document_word_length(final SubLObject v_document) {
        assert NIL != document_p(v_document) : "document.document_p(v_document) " + "CommonSymbols.NIL != document.document_p(v_document) " + v_document;
        SubLObject length = ZERO_INTEGER;
        final SubLObject vector_var = document_paragraphs(v_document);
        final SubLObject backwardP_var = NIL;
        SubLObject length_$25;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$26;
        SubLObject backwardP_var_$27;
        SubLObject length_$26;
        SubLObject v_iteration_$29;
        SubLObject element_num_$30;
        SubLObject sentence;
        for (length_$25 = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length_$25); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length_$25, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$26 = paragraph_sentences(paragraph);
            backwardP_var_$27 = NIL;
            for (length_$26 = length(vector_var_$26), v_iteration_$29 = NIL, v_iteration_$29 = ZERO_INTEGER; v_iteration_$29.numL(length_$26); v_iteration_$29 = add(v_iteration_$29, ONE_INTEGER)) {
                element_num_$30 = (NIL != backwardP_var_$27) ? subtract(length_$26, v_iteration_$29, ONE_INTEGER) : v_iteration_$29;
                sentence = aref(vector_var_$26, element_num_$30);
                length = add(length, sentence_length(sentence));
            }
        }
        return length;
    }

    public static SubLObject document_do_minimal_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list211);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = NIL;
        SubLObject v_document = NIL;
        destructuring_bind_must_consp(current, datum, $list211);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list211);
        v_document = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject sentence = $sym212$SENTENCE;
            return list(DOCUMENT_DO_SENTENCES, list(sentence, v_document), listS(SENTENCE_DO_MINIMAL_WORDS, list(word, sentence), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list211);
        return NIL;
    }

    public static SubLObject document_do_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list211);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = NIL;
        SubLObject v_document = NIL;
        destructuring_bind_must_consp(current, datum, $list211);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list211);
        v_document = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject sentence = $sym214$SENTENCE;
            return list(DOCUMENT_DO_SENTENCES, list(sentence, v_document), listS(SENTENCE_DO_WORDS, list(word, sentence), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list211);
        return NIL;
    }

    public static SubLObject document_string(final SubLObject v_document) {
        SubLObject output_string = NIL;
        SubLObject current_end = ZERO_INTEGER;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            final SubLObject vector_var = document_paragraphs(v_document);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject paragraph;
            SubLObject vector_var_$31;
            SubLObject backwardP_var_$32;
            SubLObject length_$33;
            SubLObject v_iteration_$34;
            SubLObject element_num_$35;
            SubLObject sent;
            SubLObject diff;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                paragraph = aref(vector_var, element_num);
                vector_var_$31 = paragraph_sentences(paragraph);
                backwardP_var_$32 = NIL;
                for (length_$33 = length(vector_var_$31), v_iteration_$34 = NIL, v_iteration_$34 = ZERO_INTEGER; v_iteration_$34.numL(length_$33); v_iteration_$34 = add(v_iteration_$34, ONE_INTEGER)) {
                    element_num_$35 = (NIL != backwardP_var_$32) ? subtract(length_$33, v_iteration_$34, ONE_INTEGER) : v_iteration_$34;
                    sent = aref(vector_var_$31, element_num_$35);
                    if (current_end.numL(sentence_offset(sent))) {
                        diff = subtract(sentence_offset(sent), current_end);
                        string_utilities.indent(s, diff);
                        current_end = add(current_end, diff);
                    }
                    princ(sentence_string(sent), s);
                    current_end = add(current_end, length(sentence_string(sent)));
                }
            }
            output_string = get_output_stream_string(s);
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
        return output_string;
    }

    public static SubLObject new_sentence_iterator(final SubLObject v_object) {
        return NIL != document_p(v_object) ? new_document_sentence_iterator(v_object) : NIL != paragraph_p(v_object) ? new_paragraph_sentence_iterator(v_object) : NIL != sentence_p(v_object) ? new_sentence_sentence_iterator(v_object) : NIL != word_p(v_object) ? iteration.new_null_iterator() : Errors.error($str215$can_t_create_sentence_iterator_fo, v_object);
    }

    public static SubLObject new_document_sentence_iterator(final SubLObject doc) {
        SubLObject sentences = NIL;
        final SubLObject vector_var = document_paragraphs(doc);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$36;
        SubLObject backwardP_var_$37;
        SubLObject length_$38;
        SubLObject v_iteration_$39;
        SubLObject element_num_$40;
        SubLObject s;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$36 = paragraph_sentences(paragraph);
            backwardP_var_$37 = NIL;
            for (length_$38 = length(vector_var_$36), v_iteration_$39 = NIL, v_iteration_$39 = ZERO_INTEGER; v_iteration_$39.numL(length_$38); v_iteration_$39 = add(v_iteration_$39, ONE_INTEGER)) {
                element_num_$40 = (NIL != backwardP_var_$37) ? subtract(length_$38, v_iteration_$39, ONE_INTEGER) : v_iteration_$39;
                s = aref(vector_var_$36, element_num_$40);
                sentences = cons(s, sentences);
            }
        }
        return iteration.new_list_iterator(nreverse(sentences));
    }

    public static SubLObject new_paragraph_sentence_iterator(final SubLObject par) {
        return iteration.new_vector_iterator(paragraph_sentences(par));
    }

    public static SubLObject new_sentence_sentence_iterator(final SubLObject sen) {
        return iteration.new_singleton_iterator(sen);
    }

    public static SubLObject stream_stringify(final SubLObject in_stream) {
        assert NIL != input_stream_p(in_stream) : "streams_high.input_stream_p(in_stream) " + "CommonSymbols.NIL != streams_high.input_stream_p(in_stream) " + in_stream;
        final SubLObject length = file_length(in_stream);
        final SubLObject string = Strings.make_string(length, UNPROVIDED);
        SubLObject i;
        SubLObject v_char;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            v_char = read_char(in_stream, NIL, $EOF, UNPROVIDED);
            if (v_char == $EOF) {
                return string_utilities.substring(string, ZERO_INTEGER, i);
            }
            Strings.set_char(string, i, v_char);
        }
        return string;
    }

    public static SubLObject alphanumeric_char_or_character_code_p(final SubLObject obj) {
        return makeBoolean((NIL != string_utilities.alphanumeric_char_p(obj)) || (NIL != latin_alphabetic_character_code_p(obj)));
    }

    public static SubLObject alphabetic_char_or_character_code_p(final SubLObject obj) {
        return makeBoolean((NIL != string_utilities.alphabetic_char_p(obj)) || (NIL != latin_alphabetic_character_code_p(obj)));
    }

    public static SubLObject latin_alphabetic_character_code_p(final SubLObject obj) {
        return makeBoolean(((obj.isInteger() && (NIL == subl_promotions.memberP(obj, $list217, UNPROVIDED, UNPROVIDED))) && obj.numGE($int$192)) && obj.numLE($int$591));
    }

    public static SubLObject character_or_character_code_p(final SubLObject obj) {
        return makeBoolean(obj.isChar() || obj.isInteger());
    }

    public static SubLObject sentencifier_initializedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sentencifier_patterns$.getDynamicValue(thread);
    }

    public static SubLObject initialize_sentencifier() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        finalize_sentencifier();
        $sentencifier_patterns$.setDynamicValue(append(new SubLObject[]{ compile_regular_expression_substitutions($mark_eos_regular_expressions$.getDynamicValue(thread)), compile_regular_expression_substitutions($remove_false_eos_regular_expressions1$.getDynamicValue(thread)), compile_regular_expression_substitutions(generate_abbreviation_regular_expressions()), compile_regular_expression_substitutions($remove_false_eos_regular_expressions2$.getDynamicValue(thread)), compile_regular_expression_substitutions($split_unsplit_stuff_regular_expressions$.getDynamicValue(thread)) }), thread);
        return length($sentencifier_patterns$.getDynamicValue(thread));
    }

    public static SubLObject finalize_sentencifier() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject count = length($sentencifier_patterns$.getDynamicValue(thread));
        SubLObject cdolist_list_var = $sentencifier_patterns$.getDynamicValue(thread);
        SubLObject patternXsubstitution = NIL;
        patternXsubstitution = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = patternXsubstitution;
            SubLObject pattern = NIL;
            SubLObject substitution = NIL;
            destructuring_bind_must_consp(current, datum, $list529);
            pattern = current.first();
            current = substitution = current.rest();
            if (NIL != regular_expressions.regex_pattern_p(pattern)) {
                regular_expressions.discard_regular_expression_pattern(pattern);
            } else {
                Errors.warn($str530$Can_t_finalize__a__not_a_regular_, pattern);
            }
            cdolist_list_var = cdolist_list_var.rest();
            patternXsubstitution = cdolist_list_var.first();
        } 
        $sentencifier_patterns$.setDynamicValue(NIL, thread);
        return count;
    }

    public static SubLObject sentencify_string(final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(text) : "Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) " + text;
        if (NIL == sentencifier_initializedP()) {
            initialize_sentencifier();
        }
        SubLObject processed = text;
        SubLObject cdolist_list_var = $sentencifier_patterns$.getDynamicValue(thread);
        SubLObject patternXsubstitution = NIL;
        patternXsubstitution = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = patternXsubstitution;
            SubLObject pattern = NIL;
            SubLObject substitution = NIL;
            destructuring_bind_must_consp(current, datum, $list529);
            pattern = current.first();
            current = substitution = current.rest();
            processed = regular_expression_utilities.regex_subst(pattern, substitution, processed, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            patternXsubstitution = cdolist_list_var.first();
        } 
        return clean_sentences(string_utilities.split_string(processed, list($eos_char$.getDynamicValue(thread))));
    }

    public static SubLObject sentencify_file(final SubLObject path) {
        return sentencify_string(file_utilities.slurp_file(path));
    }

    public static SubLObject generate_abbreviation_regular_expressions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_regular_expressions = NIL;
        SubLObject cdolist_list_var = $abbreviations$.getDynamicValue(thread);
        SubLObject abrv = NIL;
        abrv = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            v_regular_expressions = cons(list(cconcatenate($str532$__b, new SubLObject[]{ format_nil.format_nil_a_no_copy(abrv), format_nil.format_nil_a_no_copy($pap$.getDynamicValue(thread)), $str505$_s_, format_nil.format_nil_a_no_copy($eos$.getDynamicValue(thread)) }), $str506$_1, $list527), v_regular_expressions);
            cdolist_list_var = cdolist_list_var.rest();
            abrv = cdolist_list_var.first();
        } 
        return v_regular_expressions;
    }

    public static SubLObject compile_regular_expression_substitutions(final SubLObject regular_expression_substitutions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pattern_substitutions = NIL;
        SubLObject cdolist_list_var = regular_expression_substitutions;
        SubLObject regexXsubstitution = NIL;
        regexXsubstitution = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = regexXsubstitution;
            SubLObject re = NIL;
            SubLObject substitution = NIL;
            SubLObject options = NIL;
            destructuring_bind_must_consp(current, datum, $list533);
            re = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list533);
            substitution = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list533);
            options = current.first();
            current = current.rest();
            if (NIL == current) {
                thread.resetMultipleValues();
                final SubLObject pattern = regular_expressions.compile_regular_expression(re, options);
                final SubLObject dummy1 = thread.secondMultipleValue();
                final SubLObject dummy2 = thread.thirdMultipleValue();
                final SubLObject error = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != pattern) {
                    pattern_substitutions = cons(cons(pattern, substitution), pattern_substitutions);
                } else {
                    Errors.error($str534$Can_t_compile_regular_expression_, re, error);
                }
            } else {
                cdestructuring_bind_error(datum, $list533);
            }
            cdolist_list_var = cdolist_list_var.rest();
            regexXsubstitution = cdolist_list_var.first();
        } 
        return nreverse(pattern_substitutions);
    }

    public static SubLObject clean_sentences(final SubLObject sentences) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject trimmed = string_utilities.trim_whitespace(sentence);
            if (NIL != string_utilities.non_empty_stringP(trimmed)) {
                result = cons(trimmed, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject document_sentence_countE(final SubLObject v_document, final SubLObject count) {
        SubLObject sentence_count = ZERO_INTEGER;
        final SubLObject vector_var = document_paragraphs(v_document);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$41;
        SubLObject backwardP_var_$42;
        SubLObject length_$43;
        SubLObject v_iteration_$44;
        SubLObject element_num_$45;
        SubLObject s;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$41 = paragraph_sentences(paragraph);
            backwardP_var_$42 = NIL;
            for (length_$43 = length(vector_var_$41), v_iteration_$44 = NIL, v_iteration_$44 = ZERO_INTEGER; v_iteration_$44.numL(length_$43); v_iteration_$44 = add(v_iteration_$44, ONE_INTEGER)) {
                element_num_$45 = (NIL != backwardP_var_$42) ? subtract(length_$43, v_iteration_$44, ONE_INTEGER) : v_iteration_$44;
                s = aref(vector_var_$41, element_num_$45);
                sentence_count = add(sentence_count, ONE_INTEGER);
            }
        }
        return eq(sentence_count, count);
    }

    public static SubLObject test_construct_string_from_words(final SubLObject form, SubLObject standardizeP) {
        if (standardizeP == UNPROVIDED) {
            standardizeP = NIL;
        }
        return construct_string_from_words(eval(form), standardizeP, UNPROVIDED);
    }

    public static SubLObject declare_document_file() {
        declareFunction(me, "sign_print_function_trampoline", "SIGN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sign_p", "SIGN-P", 1, 0, false);
        new document.$sign_p$UnaryFunction();
        declareFunction(me, "sign_string", "SIGN-STRING", 1, 0, false);
        declareFunction(me, "sign_type", "SIGN-TYPE", 1, 0, false);
        declareFunction(me, "sign_info", "SIGN-INFO", 1, 0, false);
        declareFunction(me, "sign_category", "SIGN-CATEGORY", 1, 0, false);
        declareFunction(me, "sign_constituents", "SIGN-CONSTITUENTS", 1, 0, false);
        declareFunction(me, "sign_offset", "SIGN-OFFSET", 1, 0, false);
        declareFunction(me, "sign_mother", "SIGN-MOTHER", 1, 0, false);
        declareFunction(me, "_csetf_sign_string", "_CSETF-SIGN-STRING", 2, 0, false);
        declareFunction(me, "_csetf_sign_type", "_CSETF-SIGN-TYPE", 2, 0, false);
        declareFunction(me, "_csetf_sign_info", "_CSETF-SIGN-INFO", 2, 0, false);
        declareFunction(me, "_csetf_sign_category", "_CSETF-SIGN-CATEGORY", 2, 0, false);
        declareFunction(me, "_csetf_sign_constituents", "_CSETF-SIGN-CONSTITUENTS", 2, 0, false);
        declareFunction(me, "_csetf_sign_offset", "_CSETF-SIGN-OFFSET", 2, 0, false);
        declareFunction(me, "_csetf_sign_mother", "_CSETF-SIGN-MOTHER", 2, 0, false);
        declareFunction(me, "make_sign", "MAKE-SIGN", 0, 1, false);
        declareFunction(me, "visit_defstruct_sign", "VISIT-DEFSTRUCT-SIGN", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sign_method", "VISIT-DEFSTRUCT-OBJECT-SIGN-METHOD", 2, 0, false);
        declareFunction(me, "new_sign", "NEW-SIGN", 0, 0, false);
        declareFunction(me, "sxhash_sign", "SXHASH-SIGN", 1, 0, false);
        declareFunction(me, "sxhash_sign_method", "SXHASH-SIGN-METHOD", 1, 0, false);
        declareFunction(me, "sign_print", "SIGN-PRINT", 3, 0, false);
        declareFunction(me, "sign_get", "SIGN-GET", 2, 0, false);
        declareFunction(me, "sign_set", "SIGN-SET", 3, 0, false);
        declareFunction(me, "sign_length", "SIGN-LENGTH", 1, 0, false);
        declareFunction(me, "sign_update", "SIGN-UPDATE", 2, 0, false);
        declareMacro(me, "sign_do_constituents", "SIGN-DO-CONSTITUENTS");
        declareFunction(me, "sign_yield", "SIGN-YIELD", 1, 0, false);
        declareFunction(me, "sign_intervals", "SIGN-INTERVALS", 1, 1, false);
        declareFunction(me, "new_exhaustive_word", "NEW-EXHAUSTIVE-WORD", 0, 1, false);
        declareFunction(me, "new_exhaustive_word_from_word", "NEW-EXHAUSTIVE-WORD-FROM-WORD", 1, 0, false);
        declareFunction(me, "exhaustive_word_p", "EXHAUSTIVE-WORD-P", 1, 0, false);
        declareFunction(me, "new_word", "NEW-WORD", 0, 1, false);
        declareFunction(me, "copy_word", "COPY-WORD", 1, 0, false);
        declareFunction(me, "word_p", "WORD-P", 1, 0, false);
        declareFunction(me, "set_word_string", "SET-WORD-STRING", 2, 0, false);
        declareFunction(me, "word_string", "WORD-STRING", 1, 0, false);
        declareFunction(me, "set_word_category", "SET-WORD-CATEGORY", 2, 0, false);
        declareFunction(me, "word_category", "WORD-CATEGORY", 1, 0, false);
        declareFunction(me, "word_offset", "WORD-OFFSET", 1, 0, false);
        declareFunction(me, "word_length", "WORD-LENGTH", 1, 0, false);
        declareFunction(me, "word_mother", "WORD-MOTHER", 1, 0, false);
        declareFunction(me, "word_info", "WORD-INFO", 1, 0, false);
        declareFunction(me, "word_constituents", "WORD-CONSTITUENTS", 1, 0, false);
        declareFunction(me, "word_interps", "WORD-INTERPS", 1, 0, false);
        declareFunction(me, "word_lex_entries", "WORD-LEX-ENTRIES", 1, 0, false);
        declareFunction(me, "word_cycls", "WORD-CYCLS", 1, 0, false);
        declareFunction(me, "word_cyc_pos", "WORD-CYC-POS", 1, 0, false);
        declareFunction(me, "word_update", "WORD-UPDATE", 2, 0, false);
        declareFunction(me, "word_index", "WORD-INDEX", 1, 0, false);
        declareFunction(me, "word_intervals", "WORD-INTERVALS", 1, 1, false);
        declareFunction(me, "word_capitalize", "WORD-CAPITALIZE", 1, 0, false);
        declareFunction(me, "word_uncapitalize", "WORD-UNCAPITALIZE", 1, 0, false);
        declareFunction(me, "build_word_token", "BUILD-WORD-TOKEN", 1, 0, false);
        declareFunction(me, "stringify", "STRINGIFY", 1, 0, false);
        declareFunction(me, "no_space_before_following_wordP", "NO-SPACE-BEFORE-FOLLOWING-WORD?", 1, 0, false);
        declareFunction(me, "next_word_offset", "NEXT-WORD-OFFSET", 1, 0, false);
        declareFunction(me, "string_tokenize_via_wordify", "STRING-TOKENIZE-VIA-WORDIFY", 1, 0, false);
        declareFunction(me, "string_wordify", "STRING-WORDIFY", 1, 1, false);
        declareFunction(me, "fst_string_wordify", "FST-STRING-WORDIFY", 1, 0, false);
        declareFunction(me, "rkf_standard_string_wordify", "RKF-STANDARD-STRING-WORDIFY", 1, 0, false);
        declareFunction(me, "clear_html_string_wordify_punctuation_chars", "CLEAR-HTML-STRING-WORDIFY-PUNCTUATION-CHARS", 0, 0, false);
        declareFunction(me, "remove_html_string_wordify_punctuation_chars", "REMOVE-HTML-STRING-WORDIFY-PUNCTUATION-CHARS", 0, 0, false);
        declareFunction(me, "html_string_wordify_punctuation_chars_internal", "HTML-STRING-WORDIFY-PUNCTUATION-CHARS-INTERNAL", 0, 0, false);
        declareFunction(me, "html_string_wordify_punctuation_chars", "HTML-STRING-WORDIFY-PUNCTUATION-CHARS", 0, 0, false);
        declareFunction(me, "html_string_wordify_state_print_function_trampoline", "HTML-STRING-WORDIFY-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "html_string_wordify_state_p", "HTML-STRING-WORDIFY-STATE-P", 1, 0, false);
        new document.$html_string_wordify_state_p$UnaryFunction();
        declareFunction(me, "hsw_state_state", "HSW-STATE-STATE", 1, 0, false);
        declareFunction(me, "hsw_state_tag_pieces", "HSW-STATE-TAG-PIECES", 1, 0, false);
        declareFunction(me, "hsw_state_string_pieces", "HSW-STATE-STRING-PIECES", 1, 0, false);
        declareFunction(me, "hsw_state_punctuation_pieces", "HSW-STATE-PUNCTUATION-PIECES", 1, 0, false);
        declareFunction(me, "hsw_state_leading_tags", "HSW-STATE-LEADING-TAGS", 1, 0, false);
        declareFunction(me, "hsw_state_following_tags", "HSW-STATE-FOLLOWING-TAGS", 1, 0, false);
        declareFunction(me, "hsw_state_current_offset", "HSW-STATE-CURRENT-OFFSET", 1, 0, false);
        declareFunction(me, "_csetf_hsw_state_state", "_CSETF-HSW-STATE-STATE", 2, 0, false);
        declareFunction(me, "_csetf_hsw_state_tag_pieces", "_CSETF-HSW-STATE-TAG-PIECES", 2, 0, false);
        declareFunction(me, "_csetf_hsw_state_string_pieces", "_CSETF-HSW-STATE-STRING-PIECES", 2, 0, false);
        declareFunction(me, "_csetf_hsw_state_punctuation_pieces", "_CSETF-HSW-STATE-PUNCTUATION-PIECES", 2, 0, false);
        declareFunction(me, "_csetf_hsw_state_leading_tags", "_CSETF-HSW-STATE-LEADING-TAGS", 2, 0, false);
        declareFunction(me, "_csetf_hsw_state_following_tags", "_CSETF-HSW-STATE-FOLLOWING-TAGS", 2, 0, false);
        declareFunction(me, "_csetf_hsw_state_current_offset", "_CSETF-HSW-STATE-CURRENT-OFFSET", 2, 0, false);
        declareFunction(me, "make_html_string_wordify_state", "MAKE-HTML-STRING-WORDIFY-STATE", 0, 1, false);
        declareFunction(me, "visit_defstruct_html_string_wordify_state", "VISIT-DEFSTRUCT-HTML-STRING-WORDIFY-STATE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_html_string_wordify_state_method", "VISIT-DEFSTRUCT-OBJECT-HTML-STRING-WORDIFY-STATE-METHOD", 2, 0, false);
        declareFunction(me, "print_hsw_state", "PRINT-HSW-STATE", 1, 2, false);
        declareFunction(me, "new_html_string_wordify_state", "NEW-HTML-STRING-WORDIFY-STATE", 0, 0, false);
        declareFunction(me, "classify_html_string_token", "CLASSIFY-HTML-STRING-TOKEN", 2, 0, false);
        declareFunction(me, "html_string_wordify", "HTML-STRING-WORDIFY", 1, 0, false);
        declareFunction(me, "hsw_peek_next_token", "HSW-PEEK-NEXT-TOKEN", 2, 0, false);
        declareFunction(me, "hsw_state_add_string_piece", "HSW-STATE-ADD-STRING-PIECE", 2, 0, false);
        declareFunction(me, "hsw_state_clear_string_pieces", "HSW-STATE-CLEAR-STRING-PIECES", 1, 0, false);
        declareFunction(me, "tag_from_hsw_state", "TAG-FROM-HSW-STATE", 1, 0, false);
        declareFunction(me, "new_word_from_hsw_state", "NEW-WORD-FROM-HSW-STATE", 1, 0, false);
        declareFunction(me, "fst_wordify_test", "FST-WORDIFY-TEST", 2, 0, false);
        declareFunction(me, "string_to_xml", "STRING-TO-XML", 1, 0, false);
        declareFunction(me, "word_to_xml", "WORD-TO-XML", 1, 1, false);
        declareFunction(me, "end_of_sentence_word_p", "END-OF-SENTENCE-WORD-P", 1, 0, false);
        declareFunction(me, "quote_word_p", "QUOTE-WORD-P", 1, 0, false);
        declareFunction(me, "newline_word_p", "NEWLINE-WORD-P", 1, 0, false);
        declareFunction(me, "punctuation_sign_p", "PUNCTUATION-SIGN-P", 1, 0, false);
        declareFunction(me, "sentence_final_punctuation_charP", "SENTENCE-FINAL-PUNCTUATION-CHAR?", 1, 0, false);
        declareFunction(me, "sentence_internal_punctuation_charP", "SENTENCE-INTERNAL-PUNCTUATION-CHAR?", 1, 0, false);
        declareFunction(me, "any_punctuation_charP", "ANY-PUNCTUATION-CHAR?", 1, 0, false);
        declareFunction(me, "quote_charP", "QUOTE-CHAR?", 1, 0, false);
        declareFunction(me, "new_phrase", "NEW-PHRASE", 0, 1, false);
        declareFunction(me, "phrase_p", "PHRASE-P", 1, 0, false);
        declareFunction(me, "phrase_string", "PHRASE-STRING", 1, 0, false);
        declareFunction(me, "phrase_category", "PHRASE-CATEGORY", 1, 0, false);
        declareFunction(me, "phrase_yield", "PHRASE-YIELD", 1, 0, false);
        declareMacro(me, "phrase_do_constituents", "PHRASE-DO-CONSTITUENTS");
        declareFunction(me, "phrase_constituents", "PHRASE-CONSTITUENTS", 1, 0, false);
        declareFunction(me, "phrase_nodes", "PHRASE-NODES", 1, 0, false);
        declareFunction(me, "phrase_intervals", "PHRASE-INTERVALS", 1, 1, false);
        declareFunction(me, "phrase_info", "PHRASE-INFO", 1, 0, false);
        declareFunction(me, "phrase_update", "PHRASE-UPDATE", 2, 0, false);
        declareFunction(me, "phrase_get", "PHRASE-GET", 2, 0, false);
        declareFunction(me, "phrase_set", "PHRASE-SET", 3, 0, false);
        declareFunction(me, "phrase_constituent_length", "PHRASE-CONSTITUENT-LENGTH", 1, 0, false);
        declareFunction(me, "phrase_to_xml", "PHRASE-TO-XML", 1, 1, false);
        declareMacro(me, "sentence_do_words", "SENTENCE-DO-WORDS");
        declareMacro(me, "sentence_do_minimal_words", "SENTENCE-DO-MINIMAL-WORDS");
        declareFunction(me, "new_sentence", "NEW-SENTENCE", 0, 2, false);
        declareFunction(me, "sentence_p", "SENTENCE-P", 1, 0, false);
        declareFunction(me, "sentence_print", "SENTENCE-PRINT", 3, 0, false);
        declareFunction(me, "sentence_string", "SENTENCE-STRING", 1, 0, false);
        declareFunction(me, "sentence_category", "SENTENCE-CATEGORY", 1, 0, false);
        declareFunction(me, "sentence_yield", "SENTENCE-YIELD", 1, 0, false);
        declareFunction(me, "sentence_yield_exhaustive", "SENTENCE-YIELD-EXHAUSTIVE", 1, 0, false);
        declareFunction(me, "sentence_constituents", "SENTENCE-CONSTITUENTS", 1, 0, false);
        declareFunction(me, "sentence_info", "SENTENCE-INFO", 1, 0, false);
        declareFunction(me, "sentence_offset", "SENTENCE-OFFSET", 1, 0, false);
        declareFunction(me, "sentence_index", "SENTENCE-INDEX", 1, 0, false);
        declareFunction(me, "sentence_get", "SENTENCE-GET", 2, 0, false);
        declareFunction(me, "sentence_mother", "SENTENCE-MOTHER", 1, 0, false);
        declareFunction(me, "sentence_set", "SENTENCE-SET", 3, 0, false);
        declareFunction(me, "sentence_length", "SENTENCE-LENGTH", 1, 0, false);
        declareMacro(me, "sentence_do_constituents", "SENTENCE-DO-CONSTITUENTS");
        declareFunction(me, "sentence_reconstruct_substring", "SENTENCE-RECONSTRUCT-SUBSTRING", 3, 0, false);
        declareFunction(me, "construct_string_from_words", "CONSTRUCT-STRING-FROM-WORDS", 1, 2, false);
        declareFunction(me, "sentence_delete_punctuation", "SENTENCE-DELETE-PUNCTUATION", 1, 0, false);
        declareFunction(me, "sentence_listify", "SENTENCE-LISTIFY", 1, 0, false);
        declareFunction(me, "sentence_stringify", "SENTENCE-STRINGIFY", 1, 0, false);
        declareFunction(me, "build_sentence_token", "BUILD-SENTENCE-TOKEN", 1, 1, false);
        declareFunction(me, "string_sentencify", "STRING-SENTENCIFY", 1, 1, false);
        declareFunction(me, "newline_sentence_p", "NEWLINE-SENTENCE-P", 1, 0, false);
        declareFunction(me, "paragraph_print_function_trampoline", "PARAGRAPH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "paragraph_p", "PARAGRAPH-P", 1, 0, false);
        new document.$paragraph_p$UnaryFunction();
        declareFunction(me, "paragraph_sentences", "PARAGRAPH-SENTENCES", 1, 0, false);
        declareFunction(me, "paragraph_mother", "PARAGRAPH-MOTHER", 1, 0, false);
        declareFunction(me, "_csetf_paragraph_sentences", "_CSETF-PARAGRAPH-SENTENCES", 2, 0, false);
        declareFunction(me, "_csetf_paragraph_mother", "_CSETF-PARAGRAPH-MOTHER", 2, 0, false);
        declareFunction(me, "make_paragraph", "MAKE-PARAGRAPH", 0, 1, false);
        declareFunction(me, "visit_defstruct_paragraph", "VISIT-DEFSTRUCT-PARAGRAPH", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_paragraph_method", "VISIT-DEFSTRUCT-OBJECT-PARAGRAPH-METHOD", 2, 0, false);
        declareMacro(me, "paragraph_do_sentences", "PARAGRAPH-DO-SENTENCES");
        declareMacro(me, "paragraph_do_words", "PARAGRAPH-DO-WORDS");
        declareMacro(me, "paragraph_do_minimal_words", "PARAGRAPH-DO-MINIMAL-WORDS");
        declareFunction(me, "new_paragraph", "NEW-PARAGRAPH", 1, 0, false);
        declareFunction(me, "paragraph_print", "PARAGRAPH-PRINT", 3, 0, false);
        declareFunction(me, "paragraph_get", "PARAGRAPH-GET", 2, 0, false);
        declareFunction(me, "paragraph_set", "PARAGRAPH-SET", 3, 0, false);
        declareFunction(me, "paragraph_sentence_length", "PARAGRAPH-SENTENCE-LENGTH", 1, 0, false);
        declareFunction(me, "paragraph_word_length", "PARAGRAPH-WORD-LENGTH", 1, 0, false);
        declareFunction(me, "paragraph_offset", "PARAGRAPH-OFFSET", 1, 0, false);
        declareFunction(me, "paragraph_string", "PARAGRAPH-STRING", 1, 0, false);
        declareFunction(me, "paragraph_to_xml", "PARAGRAPH-TO-XML", 1, 1, false);
        declareFunction(me, "build_paragraph_token", "BUILD-PARAGRAPH-TOKEN", 1, 0, false);
        declareFunction(me, "string_paragraphize", "STRING-PARAGRAPHIZE", 1, 2, false);
        declareFunction(me, "sign_to_xml", "SIGN-TO-XML", 1, 1, false);
        declareFunction(me, "document_print_function_trampoline", "DOCUMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "document_p", "DOCUMENT-P", 1, 0, false);
        new document.$document_p$UnaryFunction();
        declareFunction(me, "document_paragraphs", "DOCUMENT-PARAGRAPHS", 1, 0, false);
        declareFunction(me, "_csetf_document_paragraphs", "_CSETF-DOCUMENT-PARAGRAPHS", 2, 0, false);
        declareFunction(me, "make_document", "MAKE-DOCUMENT", 0, 1, false);
        declareFunction(me, "visit_defstruct_document", "VISIT-DEFSTRUCT-DOCUMENT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_document_method", "VISIT-DEFSTRUCT-OBJECT-DOCUMENT-METHOD", 2, 0, false);
        declareFunction(me, "new_document", "NEW-DOCUMENT", 1, 2, false);
        declareMacro(me, "document_do_paragraphs", "DOCUMENT-DO-PARAGRAPHS");
        declareMacro(me, "document_do_sentences", "DOCUMENT-DO-SENTENCES");
        declareFunction(me, "possibly_perform_document_dot_analysis", "POSSIBLY-PERFORM-DOCUMENT-DOT-ANALYSIS", 1, 0, false);
        declareFunction(me, "document_perform_dot_analysis", "DOCUMENT-PERFORM-DOT-ANALYSIS", 1, 0, false);
        declareFunction(me, "new_document_from_string", "NEW-DOCUMENT-FROM-STRING", 1, 2, false);
        declareFunction(me, "new_document_from_file", "NEW-DOCUMENT-FROM-FILE", 1, 2, false);
        declareFunction(me, "new_document_from_stream", "NEW-DOCUMENT-FROM-STREAM", 1, 2, false);
        declareFunction(me, "document_print", "DOCUMENT-PRINT", 3, 0, false);
        declareFunction(me, "document_get", "DOCUMENT-GET", 2, 0, false);
        declareFunction(me, "document_set", "DOCUMENT-SET", 3, 0, false);
        declareFunction(me, "document_get_sentence", "DOCUMENT-GET-SENTENCE", 2, 0, false);
        declareFunction(me, "document_get_word", "DOCUMENT-GET-WORD", 2, 0, false);
        declareFunction(me, "document_to_xml", "DOCUMENT-TO-XML", 1, 0, false);
        declareFunction(me, "document_paragraph_length", "DOCUMENT-PARAGRAPH-LENGTH", 1, 0, false);
        declareFunction(me, "document_sentence_length", "DOCUMENT-SENTENCE-LENGTH", 1, 0, false);
        declareFunction(me, "document_word_length", "DOCUMENT-WORD-LENGTH", 1, 0, false);
        declareMacro(me, "document_do_minimal_words", "DOCUMENT-DO-MINIMAL-WORDS");
        declareMacro(me, "document_do_words", "DOCUMENT-DO-WORDS");
        declareFunction(me, "document_string", "DOCUMENT-STRING", 1, 0, false);
        declareFunction(me, "new_sentence_iterator", "NEW-SENTENCE-ITERATOR", 1, 0, false);
        declareFunction(me, "new_document_sentence_iterator", "NEW-DOCUMENT-SENTENCE-ITERATOR", 1, 0, false);
        declareFunction(me, "new_paragraph_sentence_iterator", "NEW-PARAGRAPH-SENTENCE-ITERATOR", 1, 0, false);
        declareFunction(me, "new_sentence_sentence_iterator", "NEW-SENTENCE-SENTENCE-ITERATOR", 1, 0, false);
        declareFunction(me, "stream_stringify", "STREAM-STRINGIFY", 1, 0, false);
        declareFunction(me, "alphanumeric_char_or_character_code_p", "ALPHANUMERIC-CHAR-OR-CHARACTER-CODE-P", 1, 0, false);
        declareFunction(me, "alphabetic_char_or_character_code_p", "ALPHABETIC-CHAR-OR-CHARACTER-CODE-P", 1, 0, false);
        declareFunction(me, "latin_alphabetic_character_code_p", "LATIN-ALPHABETIC-CHARACTER-CODE-P", 1, 0, false);
        declareFunction(me, "character_or_character_code_p", "CHARACTER-OR-CHARACTER-CODE-P", 1, 0, false);
        declareFunction(me, "sentencifier_initializedP", "SENTENCIFIER-INITIALIZED?", 0, 0, false);
        declareFunction(me, "initialize_sentencifier", "INITIALIZE-SENTENCIFIER", 0, 0, false);
        declareFunction(me, "finalize_sentencifier", "FINALIZE-SENTENCIFIER", 0, 0, false);
        declareFunction(me, "sentencify_string", "SENTENCIFY-STRING", 1, 0, false);
        declareFunction(me, "sentencify_file", "SENTENCIFY-FILE", 1, 0, false);
        declareFunction(me, "generate_abbreviation_regular_expressions", "GENERATE-ABBREVIATION-REGULAR-EXPRESSIONS", 0, 0, false);
        declareFunction(me, "compile_regular_expression_substitutions", "COMPILE-REGULAR-EXPRESSION-SUBSTITUTIONS", 1, 0, false);
        declareFunction(me, "clean_sentences", "CLEAN-SENTENCES", 1, 0, false);
        declareFunction(me, "document_sentence_countE", "DOCUMENT-SENTENCE-COUNT=", 2, 0, false);
        declareFunction(me, "test_construct_string_from_words", "TEST-CONSTRUCT-STRING-FROM-WORDS", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_document_file() {
        defparameter("*TEXT-CLASS-PRINT-LENGTH*", TEN_INTEGER);
        defconstant("*XML-INDENT-LEVEL*", THREE_INTEGER);
        defconstant("*XML-INDENT*", Strings.make_string($xml_indent_level$.getGlobalValue(), CHAR_space));
        defconstant("*NEWLINE*", Strings.make_string(ONE_INTEGER, CHAR_newline));
        defconstant("*XML-STRING-MAPPING*", $list0);
        defconstant("*DTP-SIGN*", SIGN);
        defparameter("*WORDIFIER*", RKF_STANDARD_STRING_WORDIFY);
        deflexical("*FST-STRING-WORDIFY-LOCK*", make_lock($str69$fst_string_wordify_lock));
        deflexical("*HTML-STRING-WORDIFY-PUNCTUATION-CHARS-CACHING-STATE*", NIL);
        defconstant("*DTP-HTML-STRING-WORDIFY-STATE*", HTML_STRING_WORDIFY_STATE);
        defconstant("*DTP-PARAGRAPH*", PARAGRAPH);
        defconstant("*DTP-DOCUMENT*", DOCUMENT);
        defparameter("*PERFORM-DOT-ANALYSIS-ON-DOCS*", NIL);
        defparameter("*WORDIFIER-FST*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list220, list(new SubLObject[]{ $list221, listS(ZERO_INTEGER, symbol_function(WHITESPACEP), $list223), $list224, $list225, $list226, $list227, $list228, $list229, $list230, $list231, $list232, $list233, listS(ZERO_INTEGER, symbol_function(ALPHABETIC_CHAR_OR_CHARACTER_CODE_P), $list235), listS(ZERO_INTEGER, symbol_function($sym236$ISA_DIGIT_CHAR_), $list237), $list238, $list239, $list240, $list241, listS(ZERO_INTEGER, symbol_function($sym242$ANY_PUNCTUATION_CHAR_), $list243), listS(ZERO_INTEGER, symbol_function($sym244$SENTENCE_INTERNAL_PUNCTUATION_CHAR_), $list235), listS(ZERO_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list243), listS(ONE_INTEGER, symbol_function(UPPER_CASE_CHAR_P), $list247), listS(ONE_INTEGER, symbol_function(ALPHANUMERIC_CHAR_OR_CHARACTER_CODE_P), $list235), $list249, $list250, listS(ONE_INTEGER, symbol_function(WHITESPACEP), $list251), $list252, listS(ONE_INTEGER, symbol_function($sym242$ANY_PUNCTUATION_CHAR_), $list253), listS(ONE_INTEGER, symbol_function($sym254$QUOTE_CHAR_), $list253), $list255, listS(ONE_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list253), listS(THREE_INTEGER, symbol_function(ALPHANUMERIC_CHAR_OR_CHARACTER_CODE_P), $list256), $list257, listS(THREE_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list258), listS(FOUR_INTEGER, symbol_function(UPPER_CASE_CHAR_P), $list259), listS(FOUR_INTEGER, symbol_function(LOWER_CASE_CHAR_P), $list261), $list262, listS(FOUR_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list258), listS(FIVE_INTEGER, symbol_function($sym263$SENTENCE_FINAL_PUNCTUATION_CHAR_), $list235), $list264, listS(SIX_INTEGER, symbol_function($sym263$SENTENCE_FINAL_PUNCTUATION_CHAR_), $list243), $list265, $list266, listS(EIGHT_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list267), $list268, $list269, $list270, listS(NINE_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list253), $list271, listS(TEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list235), $list272, $list273, listS(ELEVEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list275, $list276, $list277, listS(TWELVE_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list278, $list279, listS(THIRTEEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list280, $list281, $list282, $list283, listS(FOURTEEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list284, $list285, listS(FIFTEEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list286, $list287, listS(SIXTEEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list288, $list289, listS(SEVENTEEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list290, $list291, listS(EIGHTEEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list292, $list293, listS(NINETEEN_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list294, $list295, $list296, $list297, $list298, $list299, $list300, $list301, listS(TWENTY_INTEGER, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list253), $list302, $list303, listS($int$21, symbol_function(WHITESPACEP), $list251), listS($int$21, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list235), $list305, $list306, listS($int$22, symbol_function(WHITESPACEP), $list251), listS($int$22, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list235), $list308, $list309, listS($int$23, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list235), $list311, $list312, listS($int$24, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list314, $list315, $list316, listS($int$25, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list318, $list319, listS($int$26, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list321, $list322, listS($int$27, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list324), $list325, $list326, listS($int$28, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list328), $list329, listS($int$29, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list243), $list294, $list331, listS($int$30, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list333, $list334, listS($int$31, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list336, $list337, $list338, $list339, listS($int$32, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list341, $list342, listS($int$33, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list344, $list345, $list346, $list347, listS($int$34, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list349, $list350, listS($int$35, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list352, $list353, $list354, listS($int$36, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list356, $list357, listS($int$37, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list359, $list360, listS($int$38, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list362, $list363, listS($int$39, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list365, $list366, listS($int$40, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list368, $list369, listS($int$41, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list371, $list372, listS($int$42, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list374, $list375, listS($int$43, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list377, listS($int$44, symbol_function($sym236$ISA_DIGIT_CHAR_), $list237), $list379, $list380, listS($int$44, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list381, listS($int$45, symbol_function($sym236$ISA_DIGIT_CHAR_), $list383), listS($int$45, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list384), $list385, $list386, listS($int$46, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list243), $list388, $list389, $list390, $list391, listS($int$48, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list274), $list393, listS($int$49, symbol_function($sym236$ISA_DIGIT_CHAR_), $list395), listS($int$49, symbol_function(WHITESPACEP), $list259), listS($int$49, symbol_function($sym254$QUOTE_CHAR_), $list259), listS($int$50, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list237), listS($int$51, symbol_function(ALPHANUMERIC_CHAR_OR_CHARACTER_CODE_P), $list235), $list398, $list399, listS($int$51, symbol_function(WHITESPACEP), $list251), $list400, listS($int$51, symbol_function($sym242$ANY_PUNCTUATION_CHAR_), $list253), listS($int$51, symbol_function($sym254$QUOTE_CHAR_), $list253), $list401, listS($int$51, symbol_function(CHARACTER_OR_CHARACTER_CODE_P), $list253) }), BUILD_WORD_TOKEN));
        defparameter("*SENTENCIFIER-FST*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list220, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function(NEWLINE_WORD_P), $list243), listS(ZERO_INTEGER, symbol_function(END_OF_SENTENCE_WORD_P), $list243), listS(ZERO_INTEGER, symbol_function(WORD_P), $list235), listS(ONE_INTEGER, symbol_function(NEWLINE_WORD_P), $list405), listS(ONE_INTEGER, symbol_function(END_OF_SENTENCE_WORD_P), $list406), listS(ONE_INTEGER, symbol_function(WORD_P), $list235), $list255, listS(THREE_INTEGER, symbol_function(NEWLINE_WORD_P), $list259), $list407, listS(THREE_INTEGER, symbol_function(WORD_P), $list235), listS(FOUR_INTEGER, symbol_function(QUOTE_WORD_P), $list243), $list409, listS(FOUR_INTEGER, symbol_function(WORD_P), $list253) }), BUILD_SENTENCE_TOKEN));
        defparameter("*PARAGRAPHIER-FST*", finite_state_transducer.new_finite_state_transducer(ZERO_INTEGER, $list220, list(new SubLObject[]{ listS(ZERO_INTEGER, symbol_function(NEWLINE_SENTENCE_P), $list412), $list413, listS(ZERO_INTEGER, symbol_function(SENTENCE_P), $list414), listS(ONE_INTEGER, symbol_function(NEWLINE_SENTENCE_P), $list415), $list255, listS(ONE_INTEGER, symbol_function(SENTENCE_P), $list414), listS(THREE_INTEGER, symbol_function(NEWLINE_SENTENCE_P), $list415), $list407, listS(THREE_INTEGER, symbol_function(SENTENCE_P), $list253) }), BUILD_PARAGRAPH_TOKEN));
        defparameter("*EOS-CHAR*", CHAR_escape);
        defparameter("*EOS*", format(NIL, $str417$_C, $eos_char$.getDynamicValue()));
        defparameter("*P*", $str418$______);
        defparameter("*AP*", $str419$____________________);
        defparameter("*PAP*", cconcatenate($p$.getDynamicValue(), $ap$.getDynamicValue()));
        defparameter("*PEOPLE*", $list420);
        defparameter("*ARMY*", $list421);
        defparameter("*COMPANIES*", $list422);
        defparameter("*PLACES*", list(new SubLObject[]{ $$$arc, $$$al, $$$ave, $str426$blv_d, $$$cl, $$$ct, $$$cres, $$$dr, $str431$expy_, $$$dist, $$$mt, $$$ft, $str435$fw_y, $str436$hwa_y, $$$la, $str438$pde_, $$$pl, $$$plz, $$$rd, $$$st, $$$tce, $$$Ala, $$$Ariz, $$$Ark, $$$Cal, $$$Calif, $$$Col, $$$Colo, $$$Conn, $$$Del, $$$Fed, $$$Fla, $$$Ga, $$$Ida, $$$Id, $$$Ill, $$$Ind, $$$Ia, $$$Kan, $$$Kans, $$$Ken, $$$Ky, $$$La, $$$Me, $$$Md, $$$Is, $$$Mass, $$$Mich, $$$Minn, $$$Miss, $$$Mo, $$$Mont, $$$Neb, $$$Nebr, $$$Nev, $$$Mex, $$$Okla, $$$Ok, $$$Ore, $$$Penna, $$$Penn, $$$Pa, $$$Dak, $$$Tenn, $$$Tex, $$$Ut, $$$Vt, $$$Va, $$$Wash, $$$Wis, $$$Wisc, $$$Wy, $$$Wyo, $$$USAFA, $$$Alta, $$$Man, $$$Ont, $$$Sask, $$$Yuk }));
        defparameter("*MONTHS*", $list502);
        defparameter("*MISC*", $list503);
        defparameter("*ABBREVIATIONS*", append(new SubLObject[]{ $people$.getDynamicValue(), $army$.getDynamicValue(), $companies$.getDynamicValue(), $places$.getDynamicValue(), $months$.getDynamicValue(), $misc$.getDynamicValue() }));
        defparameter("*MARK-EOS-REGULAR-EXPRESSIONS*", list(list($str504$_n_s__n, $eos$.getDynamicValue(), NIL), list(cconcatenate($str41$_, new SubLObject[]{ format_nil.format_nil_a_no_copy($pap$.getDynamicValue()), $str505$_s_ }), cconcatenate($str506$_1, format_nil.format_nil_a_no_copy($eos$.getDynamicValue())), NIL), list(cconcatenate($str507$__s_w, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str42$_ }), cconcatenate($str506$_1, format_nil.format_nil_a_no_copy($eos$.getDynamicValue())), NIL)));
        defparameter("*REMOVE-FALSE-EOS-REGULAR-EXPRESSIONS1*", list(list(cconcatenate($str508$_____w__w, new SubLObject[]{ format_nil.format_nil_a_no_copy($pap$.getDynamicValue()), $str505$_s_, format_nil.format_nil_a_no_copy($eos$.getDynamicValue()) }), $str506$_1, NIL), list(cconcatenate($str508$_____w__w, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str42$_, format_nil.format_nil_a_no_copy($eos$.getDynamicValue()) }), $str506$_1, NIL), list(cconcatenate($str509$__s_w___s__, format_nil.format_nil_a_no_copy($eos$.getDynamicValue())), $str506$_1, NIL), list(cconcatenate($str510$_________, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str511$____lower____ }), $str512$_1_2, NIL), list(cconcatenate($str513$_____, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str514$_____s__, format_nil.format_nil_a_no_copy($eos$.getDynamicValue()) }), $str506$_1, NIL)));
        defparameter("*REMOVE-FALSE-EOS-REGULAR-EXPRESSIONS2*", list(list(cconcatenate($str515$______s__, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str516$__s____lower____ }), $str512$_1_2, NIL), list(cconcatenate($str517$__s___s_, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str518$__s__ }), $str512$_1_2, NIL), list(cconcatenate($str519$__s, new SubLObject[]{ format_nil.format_nil_a_no_copy($pap$.getDynamicValue()), $str505$_s_, format_nil.format_nil_a_no_copy($eos$.getDynamicValue()) }), $str506$_1, NIL)));
        defparameter("*SPLIT-UNSPLIT-STUFF-REGULAR-EXPRESSIONS*", list(list(cconcatenate($str520$__D_d___, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str521$___s__ }), cconcatenate($str512$_1_2, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str522$_3 }), NIL), list(cconcatenate($str523$___w, new SubLObject[]{ format_nil.format_nil_a_no_copy($p$.getDynamicValue()), $str524$___s_ }), cconcatenate($str506$_1, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str525$_2 }), NIL), list($str526$__sno_____s______d_, cconcatenate($str506$_1, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str525$_2 }), $list527), list($str528$__ap___m___s______upper____, cconcatenate($str506$_1, new SubLObject[]{ format_nil.format_nil_a_no_copy($eos$.getDynamicValue()), $str525$_2 }), NIL)));
        defparameter("*SENTENCIFIER-PATTERNS*", NIL);
        return NIL;
    }

    public static SubLObject setup_document_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sign$.getGlobalValue(), symbol_function(SIGN_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(SIGN_STRING, _CSETF_SIGN_STRING);
        def_csetf(SIGN_TYPE, _CSETF_SIGN_TYPE);
        def_csetf(SIGN_INFO, _CSETF_SIGN_INFO);
        def_csetf(SIGN_CATEGORY, _CSETF_SIGN_CATEGORY);
        def_csetf(SIGN_CONSTITUENTS, _CSETF_SIGN_CONSTITUENTS);
        def_csetf(SIGN_OFFSET, _CSETF_SIGN_OFFSET);
        def_csetf(SIGN_MOTHER, _CSETF_SIGN_MOTHER);
        identity(SIGN);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sign$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SIGN_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_sign$.getGlobalValue(), symbol_function(SXHASH_SIGN_METHOD));
        memoization_state.note_globally_cached_function(HTML_STRING_WORDIFY_PUNCTUATION_CHARS);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_html_string_wordify_state$.getGlobalValue(), symbol_function(HTML_STRING_WORDIFY_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list86);
        def_csetf(HSW_STATE_STATE, _CSETF_HSW_STATE_STATE);
        def_csetf(HSW_STATE_TAG_PIECES, _CSETF_HSW_STATE_TAG_PIECES);
        def_csetf(HSW_STATE_STRING_PIECES, _CSETF_HSW_STATE_STRING_PIECES);
        def_csetf(HSW_STATE_PUNCTUATION_PIECES, _CSETF_HSW_STATE_PUNCTUATION_PIECES);
        def_csetf(HSW_STATE_LEADING_TAGS, _CSETF_HSW_STATE_LEADING_TAGS);
        def_csetf(HSW_STATE_FOLLOWING_TAGS, _CSETF_HSW_STATE_FOLLOWING_TAGS);
        def_csetf(HSW_STATE_CURRENT_OFFSET, _CSETF_HSW_STATE_CURRENT_OFFSET);
        identity(HTML_STRING_WORDIFY_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_html_string_wordify_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_HTML_STRING_WORDIFY_STATE_METHOD));
        note_funcall_helper_function(PRINT_HSW_STATE);
        note_funcall_helper_function(HTML_STRING_WORDIFY);
        define_test_case_table_int(FST_STRING_WORDIFY, list(new SubLObject[]{ $TEST, FST_WORDIFY_TEST, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list132);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_paragraph$.getGlobalValue(), symbol_function(PARAGRAPH_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list165);
        def_csetf(PARAGRAPH_SENTENCES, _CSETF_PARAGRAPH_SENTENCES);
        def_csetf(PARAGRAPH_MOTHER, _CSETF_PARAGRAPH_MOTHER);
        identity(PARAGRAPH);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_paragraph$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PARAGRAPH_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_document$.getGlobalValue(), symbol_function(DOCUMENT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list191);
        def_csetf(DOCUMENT_PARAGRAPHS, _CSETF_DOCUMENT_PARAGRAPHS);
        identity(DOCUMENT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_document$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_DOCUMENT_METHOD));
        register_external_symbol(SENTENCIFY_STRING);
        define_test_case_table_int(NEW_DOCUMENT, list(new SubLObject[]{ $TEST, $sym536$DOCUMENT_SENTENCE_COUNT_, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list538);
        define_test_case_table_int(TEST_CONSTRUCT_STRING_FROM_WORDS, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list540);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_document_file();
    }

    @Override
    public void initializeVariables() {
        init_document_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_document_file();
    }

    

    public static final class $sign_native extends SubLStructNative {
        public SubLObject $string;

        public SubLObject $type;

        public SubLObject $info;

        public SubLObject $category;

        public SubLObject $constituents;

        public SubLObject $offset;

        public SubLObject $mother;

        private static final SubLStructDeclNative structDecl;

        private $sign_native() {
            this.$string = Lisp.NIL;
            this.$type = Lisp.NIL;
            this.$info = Lisp.NIL;
            this.$category = Lisp.NIL;
            this.$constituents = Lisp.NIL;
            this.$offset = Lisp.NIL;
            this.$mother = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$string;
        }

        @Override
        public SubLObject getField3() {
            return this.$type;
        }

        @Override
        public SubLObject getField4() {
            return this.$info;
        }

        @Override
        public SubLObject getField5() {
            return this.$category;
        }

        @Override
        public SubLObject getField6() {
            return this.$constituents;
        }

        @Override
        public SubLObject getField7() {
            return this.$offset;
        }

        @Override
        public SubLObject getField8() {
            return this.$mother;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$string = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$type = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$info = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$category = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$constituents = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$offset = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$mother = value;
        }

        static {
            structDecl = makeStructDeclNative($sign_native.class, SIGN, SIGN_P, $list3, $list4, new String[]{ "$string", "$type", "$info", "$category", "$constituents", "$offset", "$mother" }, $list5, $list6, SIGN_PRINT);
        }
    }

    public static final class $sign_p$UnaryFunction extends UnaryFunction {
        public $sign_p$UnaryFunction() {
            super(extractFunctionNamed("SIGN-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sign_p(arg1);
        }
    }

    public static final class $html_string_wordify_state_native extends SubLStructNative {
        public SubLObject $state;

        public SubLObject $tag_pieces;

        public SubLObject $string_pieces;

        public SubLObject $punctuation_pieces;

        public SubLObject $leading_tags;

        public SubLObject $following_tags;

        public SubLObject $current_offset;

        private static final SubLStructDeclNative structDecl;

        private $html_string_wordify_state_native() {
            this.$state = Lisp.NIL;
            this.$tag_pieces = Lisp.NIL;
            this.$string_pieces = Lisp.NIL;
            this.$punctuation_pieces = Lisp.NIL;
            this.$leading_tags = Lisp.NIL;
            this.$following_tags = Lisp.NIL;
            this.$current_offset = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$state;
        }

        @Override
        public SubLObject getField3() {
            return this.$tag_pieces;
        }

        @Override
        public SubLObject getField4() {
            return this.$string_pieces;
        }

        @Override
        public SubLObject getField5() {
            return this.$punctuation_pieces;
        }

        @Override
        public SubLObject getField6() {
            return this.$leading_tags;
        }

        @Override
        public SubLObject getField7() {
            return this.$following_tags;
        }

        @Override
        public SubLObject getField8() {
            return this.$current_offset;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$state = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$tag_pieces = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$string_pieces = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$punctuation_pieces = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$leading_tags = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$following_tags = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$current_offset = value;
        }

        static {
            structDecl = makeStructDeclNative($html_string_wordify_state_native.class, HTML_STRING_WORDIFY_STATE, HTML_STRING_WORDIFY_STATE_P, $list80, $list81, new String[]{ "$state", "$tag_pieces", "$string_pieces", "$punctuation_pieces", "$leading_tags", "$following_tags", "$current_offset" }, $list82, $list83, PRINT_HSW_STATE);
        }
    }

    public static final class $html_string_wordify_state_p$UnaryFunction extends UnaryFunction {
        public $html_string_wordify_state_p$UnaryFunction() {
            super(extractFunctionNamed("HTML-STRING-WORDIFY-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return html_string_wordify_state_p(arg1);
        }
    }

    public static final class $paragraph_native extends SubLStructNative {
        public SubLObject $sentences;

        public SubLObject $mother;

        private static final SubLStructDeclNative structDecl;

        private $paragraph_native() {
            this.$sentences = Lisp.NIL;
            this.$mother = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$sentences;
        }

        @Override
        public SubLObject getField3() {
            return this.$mother;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$sentences = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$mother = value;
        }

        static {
            structDecl = makeStructDeclNative($paragraph_native.class, PARAGRAPH, PARAGRAPH_P, $list159, $list160, new String[]{ "$sentences", "$mother" }, $list161, $list162, PARAGRAPH_PRINT);
        }
    }

    public static final class $paragraph_p$UnaryFunction extends UnaryFunction {
        public $paragraph_p$UnaryFunction() {
            super(extractFunctionNamed("PARAGRAPH-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return paragraph_p(arg1);
        }
    }

    public static final class $document_native extends SubLStructNative {
        public SubLObject $paragraphs;

        private static final SubLStructDeclNative structDecl;

        private $document_native() {
            this.$paragraphs = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$paragraphs;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$paragraphs = value;
        }

        static {
            structDecl = makeStructDeclNative($document_native.class, DOCUMENT, DOCUMENT_P, $list185, $list186, new String[]{ "$paragraphs" }, $list187, $list188, DOCUMENT_PRINT);
        }
    }

    public static final class $document_p$UnaryFunction extends UnaryFunction {
        public $document_p$UnaryFunction() {
            super(extractFunctionNamed("DOCUMENT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return document_p(arg1);
        }
    }
}

/**
 * Total time: 1754 ms synthetic
 */
