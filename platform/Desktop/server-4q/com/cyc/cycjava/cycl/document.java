package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class document extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.document";
    public static final String myFingerPrint = "0c990c2d5b2bde35aa873e61ee349c4bd4a0140faac5f391c4d35c84b23a301f";
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 7422L)
    private static SubLSymbol $text_class_print_length$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 7602L)
    private static SubLSymbol $xml_indent_level$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 7702L)
    private static SubLSymbol $xml_indent$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 7804L)
    private static SubLSymbol $newline$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 7881L)
    private static SubLSymbol $xml_string_mapping$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 8014L)
    public static SubLSymbol $dtp_sign$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 22074L)
    public static SubLSymbol $wordifier$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 22254L)
    private static SubLSymbol $fst_string_wordify_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23690L)
    private static SubLSymbol $html_string_wordify_punctuation_chars_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23906L)
    public static SubLSymbol $dtp_html_string_wordify_state$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 47508L)
    public static SubLSymbol $dtp_paragraph$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 53864L)
    public static SubLSymbol $dtp_document$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 55385L)
    public static SubLSymbol $perform_dot_analysis_on_docs$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 65345L)
    private static SubLSymbol $wordifier_fst$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 73104L)
    private static SubLSymbol $sentencifier_fst$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 73793L)
    private static SubLSymbol $paragraphier_fst$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 74342L)
    private static SubLSymbol $eos_char$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 74540L)
    private static SubLSymbol $eos$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 74627L)
    private static SubLSymbol $p$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 74694L)
    private static SubLSymbol $ap$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 74785L)
    private static SubLSymbol $pap$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 74871L)
    private static SubLSymbol $people$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 75018L)
    private static SubLSymbol $army$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 75111L)
    private static SubLSymbol $companies$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 75178L)
    private static SubLSymbol $places$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 75831L)
    private static SubLSymbol $months$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 75950L)
    private static SubLSymbol $misc$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 76005L)
    private static SubLSymbol $abbreviations$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 76110L)
    private static SubLSymbol $mark_eos_regular_expressions$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 76656L)
    private static SubLSymbol $remove_false_eos_regular_expressions1$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 77254L)
    private static SubLSymbol $remove_false_eos_regular_expressions2$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 77641L)
    private static SubLSymbol $split_unsplit_stuff_regular_expressions$;
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 78361L)
    private static SubLSymbol $sentencifier_patterns$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$SIGN;
    private static final SubLSymbol $sym2$SIGN_P;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$SIGN_PRINT;
    private static final SubLSymbol $sym8$SIGN_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$SIGN_STRING;
    private static final SubLSymbol $sym11$_CSETF_SIGN_STRING;
    private static final SubLSymbol $sym12$SIGN_TYPE;
    private static final SubLSymbol $sym13$_CSETF_SIGN_TYPE;
    private static final SubLSymbol $sym14$SIGN_INFO;
    private static final SubLSymbol $sym15$_CSETF_SIGN_INFO;
    private static final SubLSymbol $sym16$SIGN_CATEGORY;
    private static final SubLSymbol $sym17$_CSETF_SIGN_CATEGORY;
    private static final SubLSymbol $sym18$SIGN_CONSTITUENTS;
    private static final SubLSymbol $sym19$_CSETF_SIGN_CONSTITUENTS;
    private static final SubLSymbol $sym20$SIGN_OFFSET;
    private static final SubLSymbol $sym21$_CSETF_SIGN_OFFSET;
    private static final SubLSymbol $sym22$SIGN_MOTHER;
    private static final SubLSymbol $sym23$_CSETF_SIGN_MOTHER;
    private static final SubLSymbol $kw24$STRING;
    private static final SubLSymbol $kw25$TYPE;
    private static final SubLSymbol $kw26$INFO;
    private static final SubLSymbol $kw27$CATEGORY;
    private static final SubLSymbol $kw28$CONSTITUENTS;
    private static final SubLSymbol $kw29$OFFSET;
    private static final SubLSymbol $kw30$MOTHER;
    private static final SubLString $str31$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw32$BEGIN;
    private static final SubLSymbol $sym33$MAKE_SIGN;
    private static final SubLSymbol $kw34$SLOT;
    private static final SubLSymbol $kw35$END;
    private static final SubLSymbol $sym36$VISIT_DEFSTRUCT_OBJECT_SIGN_METHOD;
    private static final SubLSymbol $kw37$SIGN;
    private static final SubLString $str38$;
    private static final SubLSymbol $sym39$SXHASH_SIGN_METHOD;
    private static final SubLString $str40$__;
    private static final SubLString $str41$_;
    private static final SubLString $str42$_;
    private static final SubLString $str43$__;
    private static final SubLString $str44$_;
    private static final SubLString $str45$_;
    private static final SubLString $str46$____;
    private static final SubLString $str47$_;
    private static final SubLString $str48$_;
    private static final SubLSymbol $sym49$LISTP;
    private static final SubLSymbol $sym50$STRINGP;
    private static final SubLSymbol $sym51$VECTORP;
    private static final SubLString $str52$Attempt_to_set_the_non_existing_s;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$CDOVECTOR;
    private static final SubLSymbol $sym55$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $kw56$W;
    private static final SubLSymbol $kw57$P;
    private static final SubLString $str58$Unknown_sign_subclass__a;
    private static final SubLSymbol $kw59$XW;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$WORD_P;
    private static final SubLSymbol $sym62$EXHAUSTIVE_WORD_P;
    private static final SubLSymbol $kw63$INTERPS;
    private static final SubLSymbol $kw64$LEX_ENTRIES;
    private static final SubLSymbol $kw65$CYC_POS;
    private static final SubLSymbol $sym66$INTEGERP;
    private static final SubLSymbol $sym67$VECTOR;
    private static final SubLSymbol $sym68$RKF_STANDARD_STRING_WORDIFY;
    private static final SubLString $str69$fst_string_wordify_lock;
    private static final SubLSymbol $sym70$_EXIT;
    private static final SubLSymbol $kw71$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym72$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $sym73$RKF_CH_STRING_TOKENIZE;
    private static final SubLSymbol $sym74$STANDARD_STRING_TOKENIZE;
    private static final SubLSymbol $sym75$SPLIT_STRING;
    private static final SubLSymbol $sym76$HTML_STRING_WORDIFY_PUNCTUATION_CHARS;
    private static final SubLSymbol $sym77$_HTML_STRING_WORDIFY_PUNCTUATION_CHARS_CACHING_STATE_;
    private static final SubLSymbol $sym78$HTML_STRING_WORDIFY_STATE;
    private static final SubLSymbol $sym79$HTML_STRING_WORDIFY_STATE_P;
    private static final SubLList $list80;
    private static final SubLList $list81;
    private static final SubLList $list82;
    private static final SubLList $list83;
    private static final SubLSymbol $sym84$PRINT_HSW_STATE;
    private static final SubLSymbol $sym85$HTML_STRING_WORDIFY_STATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list86;
    private static final SubLSymbol $sym87$HSW_STATE_STATE;
    private static final SubLSymbol $sym88$_CSETF_HSW_STATE_STATE;
    private static final SubLSymbol $sym89$HSW_STATE_TAG_PIECES;
    private static final SubLSymbol $sym90$_CSETF_HSW_STATE_TAG_PIECES;
    private static final SubLSymbol $sym91$HSW_STATE_STRING_PIECES;
    private static final SubLSymbol $sym92$_CSETF_HSW_STATE_STRING_PIECES;
    private static final SubLSymbol $sym93$HSW_STATE_PUNCTUATION_PIECES;
    private static final SubLSymbol $sym94$_CSETF_HSW_STATE_PUNCTUATION_PIECES;
    private static final SubLSymbol $sym95$HSW_STATE_LEADING_TAGS;
    private static final SubLSymbol $sym96$_CSETF_HSW_STATE_LEADING_TAGS;
    private static final SubLSymbol $sym97$HSW_STATE_FOLLOWING_TAGS;
    private static final SubLSymbol $sym98$_CSETF_HSW_STATE_FOLLOWING_TAGS;
    private static final SubLSymbol $sym99$HSW_STATE_CURRENT_OFFSET;
    private static final SubLSymbol $sym100$_CSETF_HSW_STATE_CURRENT_OFFSET;
    private static final SubLSymbol $kw101$STATE;
    private static final SubLSymbol $kw102$TAG_PIECES;
    private static final SubLSymbol $kw103$STRING_PIECES;
    private static final SubLSymbol $kw104$PUNCTUATION_PIECES;
    private static final SubLSymbol $kw105$LEADING_TAGS;
    private static final SubLSymbol $kw106$FOLLOWING_TAGS;
    private static final SubLSymbol $kw107$CURRENT_OFFSET;
    private static final SubLSymbol $sym108$MAKE_HTML_STRING_WORDIFY_STATE;
    private static final SubLSymbol $sym109$VISIT_DEFSTRUCT_OBJECT_HTML_STRING_WORDIFY_STATE_METHOD;
    private static final SubLString $str110$__S__S_;
    private static final SubLList $list111;
    private static final SubLSymbol $kw112$SPACE;
    private static final SubLSymbol $kw113$END_OF_TAG;
    private static final SubLSymbol $kw114$START_OF_TAG;
    private static final SubLSymbol $kw115$PUNCTUATION;
    private static final SubLSymbol $kw116$DEFAULT;
    private static final SubLSymbol $kw117$INSIDE_TAG;
    private static final SubLSymbol $kw118$NORMAL;
    private static final SubLList $list119;
    private static final SubLString $str120$Unknown_state___S;
    private static final SubLSymbol $kw121$FOLLOWING_WHITESPACE;
    private static final SubLSymbol $sym122$HTML_STRING_WORDIFY;
    private static final SubLSymbol $kw123$LEADING_WHITESPACE;
    private static final SubLSymbol $sym124$FST_STRING_WORDIFY;
    private static final SubLSymbol $kw125$TEST;
    private static final SubLSymbol $sym126$FST_WORDIFY_TEST;
    private static final SubLSymbol $kw127$OWNER;
    private static final SubLSymbol $kw128$CLASSES;
    private static final SubLSymbol $kw129$KB;
    private static final SubLSymbol $kw130$TINY;
    private static final SubLSymbol $kw131$WORKING_;
    private static final SubLList $list132;
    private static final SubLString $str133$_a_WRD_a__a__WRD__a;
    private static final SubLString $str134$_tag__;
    private static final SubLList $list135;
    private static final SubLList $list136;
    private static final SubLString $str137$_;
    private static final SubLList $list138;
    private static final SubLList $list139;
    private static final SubLList $list140;
    private static final SubLList $list141;
    private static final SubLSymbol $sym142$PHRASE_P;
    private static final SubLList $list143;
    private static final SubLSymbol $sym144$SIGN_DO_CONSTITUENTS;
    private static final SubLString $str145$_a_PHR_a__a_a_a__PHR__a;
    private static final SubLString $str146$_cat__;
    private static final SubLList $list147;
    private static final SubLSymbol $sym148$CDOLIST;
    private static final SubLSymbol $sym149$SENTENCE_YIELD_EXHAUSTIVE;
    private static final SubLSymbol $sym150$SENTENCE_YIELD;
    private static final SubLSymbol $kw151$S;
    private static final SubLList $list152;
    private static final SubLSymbol $sym153$SENTENCE_P;
    private static final SubLList $list154;
    private static final SubLSymbol $sym155$CCONCATENATE;
    private static final SubLSymbol $sym156$PUNCTUATION_SIGN_P;
    private static final SubLSymbol $sym157$PARAGRAPH;
    private static final SubLSymbol $sym158$PARAGRAPH_P;
    private static final SubLList $list159;
    private static final SubLList $list160;
    private static final SubLList $list161;
    private static final SubLList $list162;
    private static final SubLSymbol $sym163$PARAGRAPH_PRINT;
    private static final SubLSymbol $sym164$PARAGRAPH_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list165;
    private static final SubLSymbol $sym166$PARAGRAPH_SENTENCES;
    private static final SubLSymbol $sym167$_CSETF_PARAGRAPH_SENTENCES;
    private static final SubLSymbol $sym168$PARAGRAPH_MOTHER;
    private static final SubLSymbol $sym169$_CSETF_PARAGRAPH_MOTHER;
    private static final SubLSymbol $kw170$SENTENCES;
    private static final SubLSymbol $sym171$MAKE_PARAGRAPH;
    private static final SubLSymbol $sym172$VISIT_DEFSTRUCT_OBJECT_PARAGRAPH_METHOD;
    private static final SubLList $list173;
    private static final SubLList $list174;
    private static final SubLSymbol $sym175$SENTENCE;
    private static final SubLSymbol $sym176$PARAGRAPH_DO_SENTENCES;
    private static final SubLSymbol $sym177$SENTENCE_DO_WORDS;
    private static final SubLSymbol $sym178$SENTENCE;
    private static final SubLSymbol $sym179$SENTENCE_DO_MINIMAL_WORDS;
    private static final SubLString $str180$__PAR_;
    private static final SubLString $str181$_PAR_;
    private static final SubLString $str182$__PAR_;
    private static final SubLSymbol $sym183$DOCUMENT;
    private static final SubLSymbol $sym184$DOCUMENT_P;
    private static final SubLList $list185;
    private static final SubLList $list186;
    private static final SubLList $list187;
    private static final SubLList $list188;
    private static final SubLSymbol $sym189$DOCUMENT_PRINT;
    private static final SubLSymbol $sym190$DOCUMENT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list191;
    private static final SubLSymbol $sym192$DOCUMENT_PARAGRAPHS;
    private static final SubLSymbol $sym193$_CSETF_DOCUMENT_PARAGRAPHS;
    private static final SubLSymbol $kw194$PARAGRAPHS;
    private static final SubLSymbol $sym195$MAKE_DOCUMENT;
    private static final SubLSymbol $sym196$VISIT_DEFSTRUCT_OBJECT_DOCUMENT_METHOD;
    private static final SubLString $str197$_A_is_neither_a_string_nor_a_stre;
    private static final SubLList $list198;
    private static final SubLList $list199;
    private static final SubLSymbol $sym200$PARAGRAPH;
    private static final SubLSymbol $sym201$DOCUMENT_DO_PARAGRAPHS;
    private static final SubLString $str202$_;
    private static final SubLList $list203;
    private static final SubLSymbol $kw204$INPUT;
    private static final SubLString $str205$Unable_to_open__S;
    private static final SubLSymbol $sym206$INPUT_STREAM_P;
    private static final SubLString $str207$__DOC_;
    private static final SubLString $str208$Sentence_index__A_out_of_bounds_;
    private static final SubLString $str209$_DOC_;
    private static final SubLString $str210$__DOC_;
    private static final SubLList $list211;
    private static final SubLSymbol $sym212$SENTENCE;
    private static final SubLSymbol $sym213$DOCUMENT_DO_SENTENCES;
    private static final SubLSymbol $sym214$SENTENCE;
    private static final SubLString $str215$can_t_create_sentence_iterator_fo;
    private static final SubLSymbol $kw216$EOF;
    private static final SubLList $list217;
    private static final SubLInteger $int218$192;
    private static final SubLInteger $int219$591;
    private static final SubLList $list220;
    private static final SubLList $list221;
    private static final SubLSymbol $sym222$WHITESPACEP;
    private static final SubLList $list223;
    private static final SubLList $list224;
    private static final SubLList $list225;
    private static final SubLList $list226;
    private static final SubLList $list227;
    private static final SubLList $list228;
    private static final SubLList $list229;
    private static final SubLList $list230;
    private static final SubLList $list231;
    private static final SubLList $list232;
    private static final SubLList $list233;
    private static final SubLSymbol $sym234$ALPHABETIC_CHAR_OR_CHARACTER_CODE_P;
    private static final SubLList $list235;
    private static final SubLSymbol $sym236$ISA_DIGIT_CHAR_;
    private static final SubLList $list237;
    private static final SubLList $list238;
    private static final SubLList $list239;
    private static final SubLList $list240;
    private static final SubLList $list241;
    private static final SubLSymbol $sym242$ANY_PUNCTUATION_CHAR_;
    private static final SubLList $list243;
    private static final SubLSymbol $sym244$SENTENCE_INTERNAL_PUNCTUATION_CHAR_;
    private static final SubLSymbol $sym245$CHARACTER_OR_CHARACTER_CODE_P;
    private static final SubLSymbol $sym246$UPPER_CASE_CHAR_P;
    private static final SubLList $list247;
    private static final SubLSymbol $sym248$ALPHANUMERIC_CHAR_OR_CHARACTER_CODE_P;
    private static final SubLList $list249;
    private static final SubLList $list250;
    private static final SubLList $list251;
    private static final SubLList $list252;
    private static final SubLList $list253;
    private static final SubLSymbol $sym254$QUOTE_CHAR_;
    private static final SubLList $list255;
    private static final SubLList $list256;
    private static final SubLList $list257;
    private static final SubLList $list258;
    private static final SubLList $list259;
    private static final SubLSymbol $sym260$LOWER_CASE_CHAR_P;
    private static final SubLList $list261;
    private static final SubLList $list262;
    private static final SubLSymbol $sym263$SENTENCE_FINAL_PUNCTUATION_CHAR_;
    private static final SubLList $list264;
    private static final SubLList $list265;
    private static final SubLList $list266;
    private static final SubLList $list267;
    private static final SubLList $list268;
    private static final SubLList $list269;
    private static final SubLList $list270;
    private static final SubLList $list271;
    private static final SubLList $list272;
    private static final SubLList $list273;
    private static final SubLList $list274;
    private static final SubLList $list275;
    private static final SubLList $list276;
    private static final SubLList $list277;
    private static final SubLList $list278;
    private static final SubLList $list279;
    private static final SubLList $list280;
    private static final SubLList $list281;
    private static final SubLList $list282;
    private static final SubLList $list283;
    private static final SubLList $list284;
    private static final SubLList $list285;
    private static final SubLList $list286;
    private static final SubLList $list287;
    private static final SubLList $list288;
    private static final SubLList $list289;
    private static final SubLList $list290;
    private static final SubLList $list291;
    private static final SubLList $list292;
    private static final SubLList $list293;
    private static final SubLList $list294;
    private static final SubLList $list295;
    private static final SubLList $list296;
    private static final SubLList $list297;
    private static final SubLList $list298;
    private static final SubLList $list299;
    private static final SubLList $list300;
    private static final SubLList $list301;
    private static final SubLList $list302;
    private static final SubLList $list303;
    private static final SubLInteger $int304$21;
    private static final SubLList $list305;
    private static final SubLList $list306;
    private static final SubLInteger $int307$22;
    private static final SubLList $list308;
    private static final SubLList $list309;
    private static final SubLInteger $int310$23;
    private static final SubLList $list311;
    private static final SubLList $list312;
    private static final SubLInteger $int313$24;
    private static final SubLList $list314;
    private static final SubLList $list315;
    private static final SubLList $list316;
    private static final SubLInteger $int317$25;
    private static final SubLList $list318;
    private static final SubLList $list319;
    private static final SubLInteger $int320$26;
    private static final SubLList $list321;
    private static final SubLList $list322;
    private static final SubLInteger $int323$27;
    private static final SubLList $list324;
    private static final SubLList $list325;
    private static final SubLList $list326;
    private static final SubLInteger $int327$28;
    private static final SubLList $list328;
    private static final SubLList $list329;
    private static final SubLInteger $int330$29;
    private static final SubLList $list331;
    private static final SubLInteger $int332$30;
    private static final SubLList $list333;
    private static final SubLList $list334;
    private static final SubLInteger $int335$31;
    private static final SubLList $list336;
    private static final SubLList $list337;
    private static final SubLList $list338;
    private static final SubLList $list339;
    private static final SubLInteger $int340$32;
    private static final SubLList $list341;
    private static final SubLList $list342;
    private static final SubLInteger $int343$33;
    private static final SubLList $list344;
    private static final SubLList $list345;
    private static final SubLList $list346;
    private static final SubLList $list347;
    private static final SubLInteger $int348$34;
    private static final SubLList $list349;
    private static final SubLList $list350;
    private static final SubLInteger $int351$35;
    private static final SubLList $list352;
    private static final SubLList $list353;
    private static final SubLList $list354;
    private static final SubLInteger $int355$36;
    private static final SubLList $list356;
    private static final SubLList $list357;
    private static final SubLInteger $int358$37;
    private static final SubLList $list359;
    private static final SubLList $list360;
    private static final SubLInteger $int361$38;
    private static final SubLList $list362;
    private static final SubLList $list363;
    private static final SubLInteger $int364$39;
    private static final SubLList $list365;
    private static final SubLList $list366;
    private static final SubLInteger $int367$40;
    private static final SubLList $list368;
    private static final SubLList $list369;
    private static final SubLInteger $int370$41;
    private static final SubLList $list371;
    private static final SubLList $list372;
    private static final SubLInteger $int373$42;
    private static final SubLList $list374;
    private static final SubLList $list375;
    private static final SubLInteger $int376$43;
    private static final SubLList $list377;
    private static final SubLInteger $int378$44;
    private static final SubLList $list379;
    private static final SubLList $list380;
    private static final SubLList $list381;
    private static final SubLInteger $int382$45;
    private static final SubLList $list383;
    private static final SubLList $list384;
    private static final SubLList $list385;
    private static final SubLList $list386;
    private static final SubLInteger $int387$46;
    private static final SubLList $list388;
    private static final SubLList $list389;
    private static final SubLList $list390;
    private static final SubLList $list391;
    private static final SubLInteger $int392$48;
    private static final SubLList $list393;
    private static final SubLInteger $int394$49;
    private static final SubLList $list395;
    private static final SubLInteger $int396$50;
    private static final SubLInteger $int397$51;
    private static final SubLList $list398;
    private static final SubLList $list399;
    private static final SubLList $list400;
    private static final SubLList $list401;
    private static final SubLSymbol $sym402$BUILD_WORD_TOKEN;
    private static final SubLSymbol $sym403$NEWLINE_WORD_P;
    private static final SubLSymbol $sym404$END_OF_SENTENCE_WORD_P;
    private static final SubLList $list405;
    private static final SubLList $list406;
    private static final SubLList $list407;
    private static final SubLSymbol $sym408$QUOTE_WORD_P;
    private static final SubLList $list409;
    private static final SubLSymbol $sym410$BUILD_SENTENCE_TOKEN;
    private static final SubLSymbol $sym411$NEWLINE_SENTENCE_P;
    private static final SubLList $list412;
    private static final SubLList $list413;
    private static final SubLList $list414;
    private static final SubLList $list415;
    private static final SubLSymbol $sym416$BUILD_PARAGRAPH_TOKEN;
    private static final SubLString $str417$_C;
    private static final SubLString $str418$______;
    private static final SubLString $str419$____________________;
    private static final SubLList $list420;
    private static final SubLList $list421;
    private static final SubLList $list422;
    private static final SubLString $str423$arc;
    private static final SubLString $str424$al;
    private static final SubLString $str425$ave;
    private static final SubLString $str426$blv_d;
    private static final SubLString $str427$cl;
    private static final SubLString $str428$ct;
    private static final SubLString $str429$cres;
    private static final SubLString $str430$dr;
    private static final SubLString $str431$expy_;
    private static final SubLString $str432$dist;
    private static final SubLString $str433$mt;
    private static final SubLString $str434$ft;
    private static final SubLString $str435$fw_y;
    private static final SubLString $str436$hwa_y;
    private static final SubLString $str437$la;
    private static final SubLString $str438$pde_;
    private static final SubLString $str439$pl;
    private static final SubLString $str440$plz;
    private static final SubLString $str441$rd;
    private static final SubLString $str442$st;
    private static final SubLString $str443$tce;
    private static final SubLString $str444$Ala;
    private static final SubLString $str445$Ariz;
    private static final SubLString $str446$Ark;
    private static final SubLString $str447$Cal;
    private static final SubLString $str448$Calif;
    private static final SubLString $str449$Col;
    private static final SubLString $str450$Colo;
    private static final SubLString $str451$Conn;
    private static final SubLString $str452$Del;
    private static final SubLString $str453$Fed;
    private static final SubLString $str454$Fla;
    private static final SubLString $str455$Ga;
    private static final SubLString $str456$Ida;
    private static final SubLString $str457$Id;
    private static final SubLString $str458$Ill;
    private static final SubLString $str459$Ind;
    private static final SubLString $str460$Ia;
    private static final SubLString $str461$Kan;
    private static final SubLString $str462$Kans;
    private static final SubLString $str463$Ken;
    private static final SubLString $str464$Ky;
    private static final SubLString $str465$La;
    private static final SubLString $str466$Me;
    private static final SubLString $str467$Md;
    private static final SubLString $str468$Is;
    private static final SubLString $str469$Mass;
    private static final SubLString $str470$Mich;
    private static final SubLString $str471$Minn;
    private static final SubLString $str472$Miss;
    private static final SubLString $str473$Mo;
    private static final SubLString $str474$Mont;
    private static final SubLString $str475$Neb;
    private static final SubLString $str476$Nebr;
    private static final SubLString $str477$Nev;
    private static final SubLString $str478$Mex;
    private static final SubLString $str479$Okla;
    private static final SubLString $str480$Ok;
    private static final SubLString $str481$Ore;
    private static final SubLString $str482$Penna;
    private static final SubLString $str483$Penn;
    private static final SubLString $str484$Pa;
    private static final SubLString $str485$Dak;
    private static final SubLString $str486$Tenn;
    private static final SubLString $str487$Tex;
    private static final SubLString $str488$Ut;
    private static final SubLString $str489$Vt;
    private static final SubLString $str490$Va;
    private static final SubLString $str491$Wash;
    private static final SubLString $str492$Wis;
    private static final SubLString $str493$Wisc;
    private static final SubLString $str494$Wy;
    private static final SubLString $str495$Wyo;
    private static final SubLString $str496$USAFA;
    private static final SubLString $str497$Alta;
    private static final SubLString $str498$Man;
    private static final SubLString $str499$Ont;
    private static final SubLString $str500$Sask;
    private static final SubLString $str501$Yuk;
    private static final SubLList $list502;
    private static final SubLList $list503;
    private static final SubLString $str504$_n_s__n;
    private static final SubLString $str505$_s_;
    private static final SubLString $str506$_1;
    private static final SubLString $str507$__s_w;
    private static final SubLString $str508$_____w__w;
    private static final SubLString $str509$__s_w___s__;
    private static final SubLString $str510$_________;
    private static final SubLString $str511$____lower____;
    private static final SubLString $str512$_1_2;
    private static final SubLString $str513$_____;
    private static final SubLString $str514$_____s__;
    private static final SubLString $str515$______s__;
    private static final SubLString $str516$__s____lower____;
    private static final SubLString $str517$__s___s_;
    private static final SubLString $str518$__s__;
    private static final SubLString $str519$__s;
    private static final SubLString $str520$__D_d___;
    private static final SubLString $str521$___s__;
    private static final SubLString $str522$_3;
    private static final SubLString $str523$___w;
    private static final SubLString $str524$___s_;
    private static final SubLString $str525$_2;
    private static final SubLString $str526$__sno_____s______d_;
    private static final SubLList $list527;
    private static final SubLString $str528$__ap___m___s______upper____;
    private static final SubLList $list529;
    private static final SubLString $str530$Can_t_finalize__a__not_a_regular_;
    private static final SubLSymbol $sym531$SENTENCIFY_STRING;
    private static final SubLString $str532$__b;
    private static final SubLList $list533;
    private static final SubLString $str534$Can_t_compile_regular_expression_;
    private static final SubLSymbol $sym535$NEW_DOCUMENT;
    private static final SubLSymbol $sym536$DOCUMENT_SENTENCE_COUNT_;
    private static final SubLSymbol $kw537$FULL;
    private static final SubLList $list538;
    private static final SubLSymbol $sym539$TEST_CONSTRUCT_STRING_FROM_WORDS;
    private static final SubLList $list540;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 8014L)
    public static SubLObject sign_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        sign_print(v_object, stream, (SubLObject)document.ZERO_INTEGER);
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 8014L)
    public static SubLObject sign_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sign_native.class) ? document.T : document.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 8014L)
    public static SubLObject sign_string(final SubLObject v_object) {
        assert document.NIL != sign_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 8014L)
    public static SubLObject sign_type(final SubLObject v_object) {
        assert document.NIL != sign_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 8014L)
    public static SubLObject sign_info(final SubLObject v_object) {
        assert document.NIL != sign_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 8014L)
    public static SubLObject sign_category(final SubLObject v_object) {
        assert document.NIL != sign_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 8014L)
    public static SubLObject sign_constituents(final SubLObject v_object) {
        assert document.NIL != sign_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 8014L)
    public static SubLObject sign_offset(final SubLObject v_object) {
        assert document.NIL != sign_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 8014L)
    public static SubLObject sign_mother(final SubLObject v_object) {
        assert document.NIL != sign_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 8014L)
    public static SubLObject _csetf_sign_string(final SubLObject v_object, final SubLObject value) {
        assert document.NIL != sign_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 8014L)
    public static SubLObject _csetf_sign_type(final SubLObject v_object, final SubLObject value) {
        assert document.NIL != sign_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 8014L)
    public static SubLObject _csetf_sign_info(final SubLObject v_object, final SubLObject value) {
        assert document.NIL != sign_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 8014L)
    public static SubLObject _csetf_sign_category(final SubLObject v_object, final SubLObject value) {
        assert document.NIL != sign_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 8014L)
    public static SubLObject _csetf_sign_constituents(final SubLObject v_object, final SubLObject value) {
        assert document.NIL != sign_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 8014L)
    public static SubLObject _csetf_sign_offset(final SubLObject v_object, final SubLObject value) {
        assert document.NIL != sign_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 8014L)
    public static SubLObject _csetf_sign_mother(final SubLObject v_object, final SubLObject value) {
        assert document.NIL != sign_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 8014L)
    public static SubLObject make_sign(SubLObject arglist) {
        if (arglist == document.UNPROVIDED) {
            arglist = (SubLObject)document.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sign_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)document.NIL, next = arglist; document.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)document.$kw24$STRING)) {
                _csetf_sign_string(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)document.$kw25$TYPE)) {
                _csetf_sign_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)document.$kw26$INFO)) {
                _csetf_sign_info(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)document.$kw27$CATEGORY)) {
                _csetf_sign_category(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)document.$kw28$CONSTITUENTS)) {
                _csetf_sign_constituents(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)document.$kw29$OFFSET)) {
                _csetf_sign_offset(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)document.$kw30$MOTHER)) {
                _csetf_sign_mother(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)document.$str31$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 8014L)
    public static SubLObject visit_defstruct_sign(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw32$BEGIN, (SubLObject)document.$sym33$MAKE_SIGN, (SubLObject)document.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw34$SLOT, (SubLObject)document.$kw24$STRING, sign_string(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw34$SLOT, (SubLObject)document.$kw25$TYPE, sign_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw34$SLOT, (SubLObject)document.$kw26$INFO, sign_info(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw34$SLOT, (SubLObject)document.$kw27$CATEGORY, sign_category(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw34$SLOT, (SubLObject)document.$kw28$CONSTITUENTS, sign_constituents(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw34$SLOT, (SubLObject)document.$kw29$OFFSET, sign_offset(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw34$SLOT, (SubLObject)document.$kw30$MOTHER, sign_mother(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw35$END, (SubLObject)document.$sym33$MAKE_SIGN, (SubLObject)document.SEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 8014L)
    public static SubLObject visit_defstruct_object_sign_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sign(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 8683L)
    public static SubLObject new_sign() {
        final SubLObject sign = make_sign((SubLObject)document.UNPROVIDED);
        _csetf_sign_type(sign, (SubLObject)document.$kw37$SIGN);
        _csetf_sign_string(sign, (SubLObject)document.$str38$);
        return sign;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 8868L)
    public static SubLObject sxhash_sign(final SubLObject sign) {
        final SubLObject id = (SubLObject)((document.NIL != pph_phrase.pph_phrase_p(sign, (SubLObject)document.UNPROVIDED)) ? pph_phrase.pph_phrase_suid(sign) : document.NIL);
        if (id.isFixnum()) {
            return id;
        }
        return Sxhash.sxhash(sign_string(sign));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 9103L)
    public static SubLObject sxhash_sign_method(final SubLObject v_object) {
        return sxhash_sign(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 9172L)
    public static SubLObject sign_print(final SubLObject sign, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert document.NIL != sign_p(sign) : sign;
        if (document.NIL != pph_phrase.pph_phrase_p(sign, (SubLObject)document.UNPROVIDED)) {
            if (document.NIL != pph_vars.verbose_print_pph_phrasesP()) {
                pph_phrase.verbose_print_pph_phrase(sign, stream);
            }
            else {
                pph_phrase.terse_print_pph_phrase(sign, stream);
            }
        }
        else {
            streams_high.write_string((SubLObject)document.$str40$__, stream, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
            print_high.princ(sign_type(sign), stream);
            if (document.NIL != sign_category(sign)) {
                streams_high.write_string((SubLObject)document.$str41$_, stream, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
                print_high.princ(sign_category(sign), stream);
                streams_high.write_string((SubLObject)document.$str42$_, stream, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
            }
            streams_high.write_string((SubLObject)document.$str43$__, stream, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
            if (document.NIL != word_p(sign) || (document.NIL != pph_phrase.pph_phrase_p(sign, (SubLObject)document.UNPROVIDED) && sign_string(sign).isString())) {
                streams_high.write_string(Sequences.cconcatenate((SubLObject)document.$str44$_, new SubLObject[] { sign_string(sign), document.$str44$_ }), stream, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
            }
            else {
                SubLObject cdotimes_end_var;
                SubLObject i;
                for (cdotimes_end_var = Numbers.min(sign_length(sign), document.$text_class_print_length$.getDynamicValue(thread)), i = (SubLObject)document.NIL, i = (SubLObject)document.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)document.ONE_INTEGER)) {
                    streams_high.write_string((SubLObject)document.$str45$_, stream, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
                    sign_print(sign_get(sign, i), stream, (SubLObject)document.ZERO_INTEGER);
                }
            }
            if (document.$text_class_print_length$.getDynamicValue(thread).numL(sign_length(sign))) {
                streams_high.write_string((SubLObject)document.$str46$____, stream, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
            }
            if (document.NIL != sign_info(sign)) {
                print_high.princ((SubLObject)document.$str47$_, stream);
                print_high.princ(sign_info(sign), stream);
            }
            streams_high.write_string((SubLObject)document.$str48$_, stream, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
            streams_high.terpri(stream);
        }
        return sign;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 10246L)
    public static SubLObject sign_get(final SubLObject sign, final SubLObject index) {
        return Vectors.aref(sign_constituents(sign), index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 10428L)
    public static SubLObject sign_set(final SubLObject sign, final SubLObject index, final SubLObject v_object) {
        final SubLObject old_object = Vectors.aref(sign_constituents(sign), index);
        Vectors.set_aref(sign_constituents(sign), index, v_object);
        _csetf_sign_mother(v_object, sign);
        return old_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 10817L)
    public static SubLObject sign_length(final SubLObject sign) {
        return Sequences.length(sign_constituents(sign));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 10975L)
    public static SubLObject sign_update(final SubLObject sign, final SubLObject slot_values) {
        assert document.NIL != sign_p(sign) : sign;
        assert document.NIL != Types.listp(slot_values) : slot_values;
        SubLObject remaining_slot_values = (SubLObject)document.NIL;
        SubLObject slot = (SubLObject)document.NIL;
        SubLObject value = (SubLObject)document.NIL;
        remaining_slot_values = slot_values;
        slot = remaining_slot_values.first();
        value = conses_high.second(remaining_slot_values);
        while (document.NIL != slot) {
            final SubLObject pcase_var = slot;
            if (pcase_var.eql((SubLObject)document.$kw24$STRING)) {
                assert document.NIL != Types.stringp(value) : value;
                _csetf_sign_string(sign, value);
            }
            else if (pcase_var.eql((SubLObject)document.$kw27$CATEGORY)) {
                _csetf_sign_category(sign, value);
            }
            else if (pcase_var.eql((SubLObject)document.$kw28$CONSTITUENTS)) {
                assert document.NIL != Types.vectorp(value) : value;
                _csetf_sign_constituents(sign, value);
            }
            else if (pcase_var.eql((SubLObject)document.$kw29$OFFSET)) {
                _csetf_sign_offset(sign, value);
            }
            else if (pcase_var.eql((SubLObject)document.$kw26$INFO)) {
                _csetf_sign_info(sign, value);
            }
            else if (pcase_var.eql((SubLObject)document.$kw30$MOTHER)) {
                _csetf_sign_mother(sign, value);
            }
            else {
                Errors.error((SubLObject)document.$str52$Attempt_to_set_the_non_existing_s, slot);
            }
            remaining_slot_values = remaining_slot_values.rest().rest();
            slot = remaining_slot_values.first();
            value = conses_high.second(remaining_slot_values);
        }
        return sign;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 12056L)
    public static SubLObject sign_do_constituents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list53);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constituent = (SubLObject)document.NIL;
        SubLObject sign = (SubLObject)document.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list53);
        constituent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list53);
        sign = current.first();
        current = current.rest();
        if (document.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)document.$sym54$CDOVECTOR, (SubLObject)ConsesLow.list(constituent, (SubLObject)ConsesLow.list((SubLObject)document.$sym18$SIGN_CONSTITUENTS, sign)), ConsesLow.append(body, (SubLObject)document.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document.$list53);
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 12332L)
    public static SubLObject sign_yield(final SubLObject sign) {
        SubLObject words = (SubLObject)document.NIL;
        if (document.NIL != word_p(sign)) {
            words = (SubLObject)ConsesLow.cons(sign, words);
        }
        else {
            final SubLObject vector_var = sign_constituents(sign);
            final SubLObject backwardP_var = (SubLObject)document.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject constituent;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
                element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
                constituent = Vectors.aref(vector_var, element_num);
                words = ConsesLow.nconc(words, sign_yield(constituent));
            }
        }
        return words;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 12665L)
    public static SubLObject sign_intervals(final SubLObject sign, SubLObject start) {
        if (start == document.UNPROVIDED) {
            start = (SubLObject)document.ZERO_INTEGER;
        }
        assert document.NIL != sign_p(sign) : sign;
        assert document.NIL != subl_promotions.non_negative_integer_p(start) : start;
        final SubLObject pcase_var = sign_type(sign);
        if (pcase_var.eql((SubLObject)document.$kw56$W)) {
            return word_intervals(sign, start);
        }
        if (pcase_var.eql((SubLObject)document.$kw57$P)) {
            return phrase_intervals(sign, start);
        }
        Errors.error((SubLObject)document.$str58$Unknown_sign_subclass__a, sign_type(sign));
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 13279L)
    public static SubLObject new_exhaustive_word(SubLObject slot_values) {
        if (slot_values == document.UNPROVIDED) {
            slot_values = (SubLObject)document.NIL;
        }
        final SubLObject word = new_word(slot_values);
        _csetf_sign_type(word, (SubLObject)document.$kw59$XW);
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 13976L)
    public static SubLObject new_exhaustive_word_from_word(final SubLObject original_word) {
        final SubLObject new_word = copy_word(original_word);
        _csetf_sign_type(new_word, (SubLObject)document.$kw59$XW);
        return new_word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 14246L)
    public static SubLObject exhaustive_word_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(document.NIL != sign_p(v_object) && sign_type(v_object) == document.$kw59$XW);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 14352L)
    public static SubLObject new_word(SubLObject slot_values) {
        if (slot_values == document.UNPROVIDED) {
            slot_values = (SubLObject)document.NIL;
        }
        assert document.NIL != Types.listp(slot_values) : slot_values;
        final SubLObject word = make_sign((SubLObject)document.UNPROVIDED);
        _csetf_sign_type(word, (SubLObject)document.$kw56$W);
        word_update(word, slot_values);
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 14701L)
    public static SubLObject copy_word(final SubLObject word) {
        final SubLObject is_exhaustive = exhaustive_word_p(word);
        final SubLObject new_word = (document.NIL != is_exhaustive) ? new_exhaustive_word((SubLObject)document.UNPROVIDED) : new_word((SubLObject)document.UNPROVIDED);
        SubLObject values = (SubLObject)ConsesLow.list(new SubLObject[] { document.$kw24$STRING, word_string(word), document.$kw26$INFO, word_info(word), document.$kw27$CATEGORY, word_category(word), document.$kw29$OFFSET, word_offset(word), document.$kw30$MOTHER, word_mother(word) });
        if (document.NIL != is_exhaustive) {
            values = conses_high.putf(values, (SubLObject)document.$kw28$CONSTITUENTS, word_constituents(word));
        }
        sign_update(new_word, values);
        return new_word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 15198L)
    public static SubLObject word_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(document.NIL != sign_p(v_object) && document.NIL != conses_high.member(sign_type(v_object), (SubLObject)document.$list60, Symbols.symbol_function((SubLObject)document.EQ), (SubLObject)document.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 15376L)
    public static SubLObject set_word_string(final SubLObject word, final SubLObject string) {
        return word_update(word, (SubLObject)ConsesLow.list((SubLObject)document.$kw24$STRING, string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 15472L)
    public static SubLObject word_string(final SubLObject word) {
        assert document.NIL != word_p(word) : word;
        return sign_string(word);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 15634L)
    public static SubLObject set_word_category(final SubLObject word, final SubLObject category) {
        return word_update(word, (SubLObject)ConsesLow.list((SubLObject)document.$kw27$CATEGORY, category));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 15738L)
    public static SubLObject word_category(final SubLObject word) {
        assert document.NIL != word_p(word) : word;
        return sign_category(word);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 15898L)
    public static SubLObject word_offset(final SubLObject word) {
        assert document.NIL != word_p(word) : word;
        return sign_offset(word);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 16053L)
    public static SubLObject word_length(final SubLObject word) {
        assert document.NIL != word_p(word) : word;
        return Sequences.length(word_string(word));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 16224L)
    public static SubLObject word_mother(final SubLObject word) {
        assert document.NIL != word_p(word) : word;
        return sign_mother(word);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 16397L)
    public static SubLObject word_info(final SubLObject word) {
        assert document.NIL != word_p(word) : word;
        return sign_info(word);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 16583L)
    public static SubLObject word_constituents(final SubLObject word) {
        assert document.NIL != exhaustive_word_p(word) : word;
        return sign_constituents(word);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 16857L)
    public static SubLObject word_interps(final SubLObject word) {
        return conses_high.getf(word_info(word), (SubLObject)document.$kw63$INTERPS, (SubLObject)document.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 17147L)
    public static SubLObject word_lex_entries(final SubLObject word) {
        return conses_high.getf(word_info(word), (SubLObject)document.$kw64$LEX_ENTRIES, (SubLObject)document.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 17454L)
    public static SubLObject word_cycls(final SubLObject word) {
        return Sequences.remove_duplicates(nl_api_datastructures.cycls_from_nl_interps(conses_high.getf(word_info(word), (SubLObject)document.$kw63$INTERPS, (SubLObject)document.UNPROVIDED)), (SubLObject)document.EQUAL, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 17818L)
    public static SubLObject word_cyc_pos(final SubLObject word) {
        return conses_high.getf(word_info(word), (SubLObject)document.$kw65$CYC_POS, (SubLObject)document.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 18100L)
    public static SubLObject word_update(final SubLObject word, final SubLObject slot_values) {
        assert document.NIL != word_p(word) : word;
        assert document.NIL != Types.listp(slot_values) : slot_values;
        return sign_update(word, slot_values);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 18517L)
    public static SubLObject word_index(final SubLObject word) {
        final SubLObject sentence = word_mother(word);
        SubLObject i = (SubLObject)document.ZERO_INTEGER;
        if (document.NIL != sentence) {
            while (!i.numG(sentence_length(sentence)) && !word.eql(sentence_get(sentence, i))) {
                i = Numbers.add(i, (SubLObject)document.ONE_INTEGER);
            }
            return i;
        }
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 18830L)
    public static SubLObject word_intervals(final SubLObject word, SubLObject start) {
        if (start == document.UNPROVIDED) {
            start = (SubLObject)document.ZERO_INTEGER;
        }
        assert document.NIL != word_p(word) : word;
        assert document.NIL != Types.integerp(start) : start;
        return (SubLObject)ConsesLow.list(standard_tokenization.new_interval_token(start, Numbers.add(start, (SubLObject)document.ONE_INTEGER), word));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 19107L)
    public static SubLObject word_capitalize(final SubLObject word) {
        assert document.NIL != word_p(word) : word;
        string_utilities.nupcase_leading(word_string(word));
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 19375L)
    public static SubLObject word_uncapitalize(final SubLObject word) {
        assert document.NIL != word_p(word) : word;
        string_utilities.ndowncase_leading(word_string(word));
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 19651L)
    public static SubLObject build_word_token(final SubLObject fst) {
        return new_word((SubLObject)ConsesLow.list((SubLObject)document.$kw24$STRING, stringify(finite_state_transducer.fst_output(fst)), (SubLObject)document.$kw28$CONSTITUENTS, Functions.apply(Symbols.symbol_function((SubLObject)document.$sym67$VECTOR), finite_state_transducer.fst_output(fst)), (SubLObject)document.$kw29$OFFSET, finite_state_transducer.fst_output_start(fst)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 19995L)
    public static SubLObject stringify(final SubLObject chars) {
        SubLObject string = Strings.make_string(Sequences.length(chars), (SubLObject)document.UNPROVIDED);
        SubLObject has_unicodeP = (SubLObject)document.NIL;
        SubLObject i = (SubLObject)document.ZERO_INTEGER;
        if (document.NIL == has_unicodeP) {
            SubLObject csome_list_var = chars;
            SubLObject v_char = (SubLObject)document.NIL;
            v_char = csome_list_var.first();
            while (document.NIL == has_unicodeP && document.NIL != csome_list_var) {
                if (v_char.isString()) {
                    has_unicodeP = (SubLObject)document.T;
                }
                else {
                    Strings.set_char(string, i, v_char);
                }
                i = Numbers.add(i, (SubLObject)document.ONE_INTEGER);
                csome_list_var = csome_list_var.rest();
                v_char = csome_list_var.first();
            }
        }
        if (document.NIL == has_unicodeP) {
            return string;
        }
        SubLObject s = (SubLObject)document.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            SubLObject cdolist_list_var = chars;
            SubLObject v_char2 = (SubLObject)document.NIL;
            v_char2 = cdolist_list_var.first();
            while (document.NIL != cdolist_list_var) {
                print_high.princ(v_char2, s);
                cdolist_list_var = cdolist_list_var.rest();
                v_char2 = cdolist_list_var.first();
            }
            string = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)document.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)document.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 20599L)
    public static SubLObject no_space_before_following_wordP(final SubLObject word) {
        final SubLObject word_end = Numbers.add(word_offset(word), word_length(word));
        final SubLObject next_word_offset = next_word_offset(word);
        return (SubLObject)SubLObjectFactory.makeBoolean(document.NIL != next_word_offset && document.NIL != word_end && next_word_offset.eql(word_end));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 20977L)
    public static SubLObject next_word_offset(final SubLObject word) {
        final SubLObject sentence = word_mother(word);
        final SubLObject word_index = word_index(word);
        SubLObject next_word = (SubLObject)document.NIL;
        if (word_index.isInteger() && !number_utilities.f_1X(word_index).numGE(sentence_length(sentence))) {
            next_word = sentence_get(sentence, number_utilities.f_1X(word_index));
        }
        if (document.NIL != next_word) {
            return word_offset(next_word);
        }
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 21472L)
    public static SubLObject string_tokenize_via_wordify(final SubLObject string) {
        final SubLObject word_array = string_wordify(string, (SubLObject)document.UNPROVIDED);
        SubLObject result = (SubLObject)document.NIL;
        final SubLObject vector_var = word_array;
        final SubLObject backwardP_var = (SubLObject)document.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject word;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
            element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
            word = Vectors.aref(vector_var, element_num);
            result = (SubLObject)ConsesLow.cons(word_string(word), result);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 22141L)
    public static SubLObject string_wordify(final SubLObject string, SubLObject wordifier) {
        if (wordifier == document.UNPROVIDED) {
            wordifier = document.$wordifier$.getDynamicValue();
        }
        return Functions.funcall(wordifier, string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 22340L)
    public static SubLObject fst_string_wordify(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)document.NIL;
        try {
            release = Locks.seize_lock(document.$fst_string_wordify_lock$.getGlobalValue());
            return finite_state_transducer.fst_match_global(document.$wordifier_fst$.getDynamicValue(thread), unicode_strings.utf8_string_to_unicode_vector(string));
        }
        finally {
            if (document.NIL != release) {
                Locks.release_lock(document.$fst_string_wordify_lock$.getGlobalValue());
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 22517L)
    public static SubLObject rkf_standard_string_wordify(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_vector = (SubLObject)document.NIL;
        if (document.NIL == result_vector) {
            SubLObject csome_list_var = (SubLObject)ConsesLow.list((SubLObject)document.$sym73$RKF_CH_STRING_TOKENIZE, (SubLObject)document.$sym74$STANDARD_STRING_TOKENIZE, (SubLObject)document.$sym75$SPLIT_STRING);
            SubLObject tokenizer = (SubLObject)document.NIL;
            tokenizer = csome_list_var.first();
            while (document.NIL == result_vector && document.NIL != csome_list_var) {
                SubLObject ignore_errors_tag = (SubLObject)document.NIL;
                try {
                    thread.throwStack.push(document.$kw71$IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)document.$sym72$IGNORE_ERRORS_HANDLER), thread);
                        try {
                            final SubLObject tokens = Functions.funcall(tokenizer, string);
                            SubLObject words = (SubLObject)document.NIL;
                            SubLObject current_offset = (SubLObject)document.ZERO_INTEGER;
                            SubLObject cdolist_list_var = tokens;
                            SubLObject token = (SubLObject)document.NIL;
                            token = cdolist_list_var.first();
                            while (document.NIL != cdolist_list_var) {
                                current_offset = Sequences.search(token, string, (SubLObject)document.EQUAL, (SubLObject)document.IDENTITY, (SubLObject)document.ZERO_INTEGER, (SubLObject)document.NIL, current_offset, (SubLObject)document.UNPROVIDED);
                                SubLObject word_args = (SubLObject)ConsesLow.list((SubLObject)document.$kw24$STRING, token);
                                if (current_offset.isNumber()) {
                                    word_args = conses_high.putf(word_args, (SubLObject)document.$kw29$OFFSET, current_offset);
                                    current_offset = Numbers.add(current_offset, Sequences.length(token));
                                }
                                words = (SubLObject)ConsesLow.cons(new_word(word_args), words);
                                cdolist_list_var = cdolist_list_var.rest();
                                token = cdolist_list_var.first();
                            }
                            result_vector = Sequences.nreverse(words);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)document.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)document.$kw71$IGNORE_ERRORS_TARGET);
                }
                finally {
                    thread.throwStack.pop();
                }
                csome_list_var = csome_list_var.rest();
                tokenizer = csome_list_var.first();
            }
        }
        return list_utilities.list2vector(result_vector);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23690L)
    public static SubLObject clear_html_string_wordify_punctuation_chars() {
        final SubLObject cs = document.$html_string_wordify_punctuation_chars_caching_state$.getGlobalValue();
        if (document.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23690L)
    public static SubLObject remove_html_string_wordify_punctuation_chars() {
        return memoization_state.caching_state_remove_function_results_with_args(document.$html_string_wordify_punctuation_chars_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(document.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23690L)
    public static SubLObject html_string_wordify_punctuation_chars_internal() {
        return (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_less, (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_greater, (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_space, standard_tokenization.standard_punctuation_chars())));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23690L)
    public static SubLObject html_string_wordify_punctuation_chars() {
        SubLObject caching_state = document.$html_string_wordify_punctuation_chars_caching_state$.getGlobalValue();
        if (document.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)document.$sym76$HTML_STRING_WORDIFY_PUNCTUATION_CHARS, (SubLObject)document.$sym77$_HTML_STRING_WORDIFY_PUNCTUATION_CHARS_CACHING_STATE_, (SubLObject)document.NIL, (SubLObject)document.EQL, (SubLObject)document.ZERO_INTEGER, (SubLObject)document.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)document.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(html_string_wordify_punctuation_chars_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)document.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23906L)
    public static SubLObject html_string_wordify_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_hsw_state(v_object, stream, (SubLObject)document.ZERO_INTEGER);
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23906L)
    public static SubLObject html_string_wordify_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $html_string_wordify_state_native.class) ? document.T : document.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23906L)
    public static SubLObject hsw_state_state(final SubLObject v_object) {
        assert document.NIL != html_string_wordify_state_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23906L)
    public static SubLObject hsw_state_tag_pieces(final SubLObject v_object) {
        assert document.NIL != html_string_wordify_state_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23906L)
    public static SubLObject hsw_state_string_pieces(final SubLObject v_object) {
        assert document.NIL != html_string_wordify_state_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23906L)
    public static SubLObject hsw_state_punctuation_pieces(final SubLObject v_object) {
        assert document.NIL != html_string_wordify_state_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23906L)
    public static SubLObject hsw_state_leading_tags(final SubLObject v_object) {
        assert document.NIL != html_string_wordify_state_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23906L)
    public static SubLObject hsw_state_following_tags(final SubLObject v_object) {
        assert document.NIL != html_string_wordify_state_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23906L)
    public static SubLObject hsw_state_current_offset(final SubLObject v_object) {
        assert document.NIL != html_string_wordify_state_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23906L)
    public static SubLObject _csetf_hsw_state_state(final SubLObject v_object, final SubLObject value) {
        assert document.NIL != html_string_wordify_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23906L)
    public static SubLObject _csetf_hsw_state_tag_pieces(final SubLObject v_object, final SubLObject value) {
        assert document.NIL != html_string_wordify_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23906L)
    public static SubLObject _csetf_hsw_state_string_pieces(final SubLObject v_object, final SubLObject value) {
        assert document.NIL != html_string_wordify_state_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23906L)
    public static SubLObject _csetf_hsw_state_punctuation_pieces(final SubLObject v_object, final SubLObject value) {
        assert document.NIL != html_string_wordify_state_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23906L)
    public static SubLObject _csetf_hsw_state_leading_tags(final SubLObject v_object, final SubLObject value) {
        assert document.NIL != html_string_wordify_state_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23906L)
    public static SubLObject _csetf_hsw_state_following_tags(final SubLObject v_object, final SubLObject value) {
        assert document.NIL != html_string_wordify_state_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23906L)
    public static SubLObject _csetf_hsw_state_current_offset(final SubLObject v_object, final SubLObject value) {
        assert document.NIL != html_string_wordify_state_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23906L)
    public static SubLObject make_html_string_wordify_state(SubLObject arglist) {
        if (arglist == document.UNPROVIDED) {
            arglist = (SubLObject)document.NIL;
        }
        final SubLObject v_new = (SubLObject)new $html_string_wordify_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)document.NIL, next = arglist; document.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)document.$kw101$STATE)) {
                _csetf_hsw_state_state(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)document.$kw102$TAG_PIECES)) {
                _csetf_hsw_state_tag_pieces(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)document.$kw103$STRING_PIECES)) {
                _csetf_hsw_state_string_pieces(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)document.$kw104$PUNCTUATION_PIECES)) {
                _csetf_hsw_state_punctuation_pieces(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)document.$kw105$LEADING_TAGS)) {
                _csetf_hsw_state_leading_tags(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)document.$kw106$FOLLOWING_TAGS)) {
                _csetf_hsw_state_following_tags(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)document.$kw107$CURRENT_OFFSET)) {
                _csetf_hsw_state_current_offset(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)document.$str31$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23906L)
    public static SubLObject visit_defstruct_html_string_wordify_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw32$BEGIN, (SubLObject)document.$sym108$MAKE_HTML_STRING_WORDIFY_STATE, (SubLObject)document.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw34$SLOT, (SubLObject)document.$kw101$STATE, hsw_state_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw34$SLOT, (SubLObject)document.$kw102$TAG_PIECES, hsw_state_tag_pieces(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw34$SLOT, (SubLObject)document.$kw103$STRING_PIECES, hsw_state_string_pieces(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw34$SLOT, (SubLObject)document.$kw104$PUNCTUATION_PIECES, hsw_state_punctuation_pieces(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw34$SLOT, (SubLObject)document.$kw105$LEADING_TAGS, hsw_state_leading_tags(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw34$SLOT, (SubLObject)document.$kw106$FOLLOWING_TAGS, hsw_state_following_tags(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw34$SLOT, (SubLObject)document.$kw107$CURRENT_OFFSET, hsw_state_current_offset(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw35$END, (SubLObject)document.$sym108$MAKE_HTML_STRING_WORDIFY_STATE, (SubLObject)document.SEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 23906L)
    public static SubLObject visit_defstruct_object_html_string_wordify_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_html_string_wordify_state(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 24136L)
    public static SubLObject print_hsw_state(final SubLObject state, SubLObject stream, SubLObject depth) {
        if (stream == document.UNPROVIDED) {
            stream = (SubLObject)document.NIL;
        }
        if (depth == document.UNPROVIDED) {
            depth = (SubLObject)document.NIL;
        }
        PrintLow.format(stream, (SubLObject)document.$str110$__S__S_, hsw_state_state(state), hsw_state_string_pieces(state));
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 24325L)
    public static SubLObject new_html_string_wordify_state() {
        return make_html_string_wordify_state((SubLObject)document.$list111);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 24459L)
    public static SubLObject classify_html_string_token(final SubLObject token, final SubLObject punctuation) {
        if (string_utilities.first_char(token).eql((SubLObject)Characters.CHAR_space)) {
            return (SubLObject)document.$kw112$SPACE;
        }
        if (string_utilities.first_char(token).eql((SubLObject)Characters.CHAR_greater)) {
            return (SubLObject)document.$kw113$END_OF_TAG;
        }
        if (string_utilities.first_char(token).eql((SubLObject)Characters.CHAR_less)) {
            return (SubLObject)document.$kw114$START_OF_TAG;
        }
        if (document.NIL != conses_high.member(string_utilities.first_char(token), punctuation, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED)) {
            return (SubLObject)document.$kw115$PUNCTUATION;
        }
        return (SubLObject)document.$kw116$DEFAULT;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 24790L)
    public static SubLObject html_string_wordify(final SubLObject html_string) {
        SubLObject words = (SubLObject)document.NIL;
        final SubLObject white_space_chars = (SubLObject)document.NIL;
        final SubLObject punctuation = html_string_wordify_punctuation_chars();
        final SubLObject chunked;
        final SubLObject raw_tokens = chunked = standard_tokenization.tokenize_sentence(html_string, white_space_chars, punctuation, (SubLObject)document.UNPROVIDED);
        final SubLObject state = new_html_string_wordify_state();
        SubLObject list_var = (SubLObject)document.NIL;
        SubLObject token = (SubLObject)document.NIL;
        SubLObject i = (SubLObject)document.NIL;
        list_var = chunked;
        token = list_var.first();
        for (i = (SubLObject)document.ZERO_INTEGER; document.NIL != list_var; list_var = list_var.rest(), token = list_var.first(), i = Numbers.add((SubLObject)document.ONE_INTEGER, i)) {
            final SubLObject v_class = classify_html_string_token(token, punctuation);
            final SubLObject pcase_var = hsw_state_state(state);
            if (pcase_var.eql((SubLObject)document.$kw117$INSIDE_TAG)) {
                _csetf_hsw_state_tag_pieces(state, (SubLObject)ConsesLow.cons(token, hsw_state_tag_pieces(state)));
                if (v_class == document.$kw113$END_OF_TAG) {
                    final SubLObject tag = tag_from_hsw_state(state);
                    if (document.NIL != hsw_state_string_pieces(state)) {
                        _csetf_hsw_state_following_tags(state, (SubLObject)ConsesLow.cons(tag, hsw_state_following_tags(state)));
                    }
                    else {
                        _csetf_hsw_state_leading_tags(state, (SubLObject)ConsesLow.cons(tag, hsw_state_leading_tags(state)));
                    }
                    _csetf_hsw_state_state(state, (SubLObject)document.$kw118$NORMAL);
                }
            }
            else if (pcase_var.eql((SubLObject)document.$kw118$NORMAL)) {
                if (v_class == document.$kw114$START_OF_TAG) {
                    if (document.NIL != hsw_state_string_pieces(state) && !Characters.CHAR_slash.eql(string_utilities.first_char(hsw_peek_next_token(i, chunked)))) {
                        final SubLObject word = new_word_from_hsw_state(state);
                        words = (SubLObject)ConsesLow.cons(word, words);
                    }
                    _csetf_hsw_state_tag_pieces(state, (SubLObject)ConsesLow.list(token));
                    _csetf_hsw_state_state(state, (SubLObject)document.$kw117$INSIDE_TAG);
                }
                else if (v_class == document.$kw112$SPACE) {
                    if (document.NIL != hsw_state_string_pieces(state)) {
                        final SubLObject word = new_word_from_hsw_state(state);
                        words = (SubLObject)ConsesLow.cons(word, words);
                    }
                    _csetf_hsw_state_punctuation_pieces(state, (SubLObject)ConsesLow.cons(token, hsw_state_punctuation_pieces(state)));
                }
                else if (v_class == document.$kw115$PUNCTUATION && (!string_utilities.first_char(token).eql((SubLObject)Characters.CHAR_semicolon) || document.NIL == list_utilities.lengthGE(chunked, Numbers.add((SubLObject)document.TWO_INTEGER, i), (SubLObject)document.UNPROVIDED) || document.NIL == conses_high.member(classify_html_string_token(hsw_peek_next_token(i, chunked), punctuation), (SubLObject)document.$list119, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED))) {
                    if (document.NIL != hsw_state_string_pieces(state)) {
                        final SubLObject word = new_word_from_hsw_state(state);
                        words = (SubLObject)ConsesLow.cons(word, words);
                    }
                    hsw_state_add_string_piece(state, token);
                }
                else {
                    hsw_state_add_string_piece(state, token);
                }
            }
            else {
                Errors.error((SubLObject)document.$str120$Unknown_state___S, hsw_state_state(state));
            }
            _csetf_hsw_state_current_offset(state, Numbers.add(hsw_state_current_offset(state), Sequences.length(token)));
        }
        if (document.NIL != hsw_state_string_pieces(state)) {
            final SubLObject word2 = new_word_from_hsw_state(state);
            words = (SubLObject)ConsesLow.cons(word2, words);
        }
        else if (document.NIL != hsw_state_punctuation_pieces(state)) {
            final SubLObject word2 = words.first();
            SubLObject info = word_info(word2);
            info = conses_high.putf(info, (SubLObject)document.$kw121$FOLLOWING_WHITESPACE, string_utilities.join_strings(Sequences.nreverse(hsw_state_punctuation_pieces(state)), string_utilities.$empty_string$.getGlobalValue()));
            word_update(word2, (SubLObject)ConsesLow.list((SubLObject)document.$kw26$INFO, info));
        }
        return Sequences.nreverse(words);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 27515L)
    public static SubLObject hsw_peek_next_token(final SubLObject i, final SubLObject tokens) {
        return ConsesLow.nth(number_utilities.f_1X(i), tokens);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 27592L)
    public static SubLObject hsw_state_add_string_piece(final SubLObject state, final SubLObject token) {
        _csetf_hsw_state_string_pieces(state, (SubLObject)ConsesLow.cons(token, hsw_state_string_pieces(state)));
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 27713L)
    public static SubLObject hsw_state_clear_string_pieces(final SubLObject state) {
        _csetf_hsw_state_string_pieces(state, (SubLObject)document.NIL);
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 27828L)
    public static SubLObject tag_from_hsw_state(final SubLObject state) {
        final SubLObject tag = string_utilities.join_strings(Sequences.nreverse(hsw_state_tag_pieces(state)), string_utilities.$empty_string$.getGlobalValue());
        _csetf_hsw_state_tag_pieces(state, (SubLObject)document.NIL);
        return tag;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 28018L)
    public static SubLObject new_word_from_hsw_state(final SubLObject state) {
        final SubLObject string = string_utilities.join_strings(Sequences.nreverse(hsw_state_string_pieces(state)), string_utilities.$empty_string$.getGlobalValue());
        final SubLObject leading_tag_string = (SubLObject)((document.NIL != hsw_state_leading_tags(state)) ? string_utilities.join_strings(Sequences.nreverse(hsw_state_leading_tags(state)), string_utilities.$empty_string$.getGlobalValue()) : document.NIL);
        final SubLObject following_tag_string = (SubLObject)((document.NIL != hsw_state_following_tags(state)) ? string_utilities.join_strings(Sequences.nreverse(hsw_state_following_tags(state)), string_utilities.$empty_string$.getGlobalValue()) : document.NIL);
        final SubLObject punctuation_string = (SubLObject)((document.NIL != hsw_state_punctuation_pieces(state)) ? string_utilities.join_strings(Sequences.nreverse(hsw_state_punctuation_pieces(state)), string_utilities.$empty_string$.getGlobalValue()) : document.NIL);
        final SubLObject offset = Numbers.subtract(hsw_state_current_offset(state), Sequences.length(string), Sequences.length(following_tag_string));
        final SubLObject word = new_word((SubLObject)ConsesLow.list((SubLObject)document.$kw24$STRING, string, (SubLObject)document.$kw29$OFFSET, offset));
        hsw_state_clear_string_pieces(state);
        SubLObject info = word_info(word);
        if (document.NIL != leading_tag_string) {
            info = conses_high.putf(info, (SubLObject)document.$kw105$LEADING_TAGS, leading_tag_string);
            _csetf_hsw_state_leading_tags(state, (SubLObject)document.NIL);
        }
        if (document.NIL != following_tag_string) {
            info = conses_high.putf(info, (SubLObject)document.$kw106$FOLLOWING_TAGS, following_tag_string);
            _csetf_hsw_state_following_tags(state, (SubLObject)document.NIL);
        }
        if (document.NIL != punctuation_string) {
            info = conses_high.putf(info, (SubLObject)document.$kw123$LEADING_WHITESPACE, punctuation_string);
            _csetf_hsw_state_punctuation_pieces(state, (SubLObject)document.NIL);
        }
        word_update(word, (SubLObject)ConsesLow.list((SubLObject)document.$kw26$INFO, info));
        return word;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 29340L)
    public static SubLObject fst_wordify_test(final SubLObject word_vector, SubLObject expected_tokenization) {
        final SubLObject backwardP_var = (SubLObject)document.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject word;
        for (length = Sequences.length(word_vector), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
            element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
            word = Vectors.aref(word_vector, element_num);
            if (!word_string(word).equal(expected_tokenization.first())) {
                return (SubLObject)document.NIL;
            }
            expected_tokenization = expected_tokenization.rest();
        }
        return (SubLObject)document.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 30817L)
    public static SubLObject string_to_xml(final SubLObject string) {
        return string_utilities.do_string_substitutions(string, document.$xml_string_mapping$.getGlobalValue(), (SubLObject)document.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 31027L)
    public static SubLObject word_to_xml(final SubLObject word, SubLObject level) {
        if (level == document.UNPROVIDED) {
            level = (SubLObject)document.ZERO_INTEGER;
        }
        return PrintLow.format((SubLObject)document.NIL, (SubLObject)document.$str133$_a_WRD_a__a__WRD__a, new SubLObject[] { string_utilities.tabstr(level, document.$xml_indent$.getGlobalValue()), (document.NIL != word_category(word)) ? Sequences.cconcatenate((SubLObject)document.$str134$_tag__, new SubLObject[] { word_category(word), document.$str44$_ }) : string_utilities.$empty_string$.getGlobalValue(), string_to_xml(word_string(word)), document.$newline$.getGlobalValue() });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 31479L)
    public static SubLObject end_of_sentence_word_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(document.NIL != word_p(v_object) && document.NIL != conses_high.member(word_string(v_object), (SubLObject)document.$list135, (SubLObject)document.EQUALP, (SubLObject)document.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 31739L)
    public static SubLObject quote_word_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(document.NIL != word_p(v_object) && document.NIL != conses_high.member(word_string(v_object), (SubLObject)document.$list136, (SubLObject)document.EQUALP, (SubLObject)document.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 31947L)
    public static SubLObject newline_word_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(document.NIL != word_p(v_object) && document.NIL != Strings.stringE(word_string(v_object), (SubLObject)document.$str137$_, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 32138L)
    public static SubLObject punctuation_sign_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(document.NIL != sign_p(v_object) && document.NIL != conses_high.member(sign_string(v_object), (SubLObject)document.$list138, (SubLObject)document.EQUALP, (SubLObject)document.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 32441L)
    public static SubLObject sentence_final_punctuation_charP(final SubLObject v_char) {
        return conses_high.member(v_char, (SubLObject)document.$list139, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 32575L)
    public static SubLObject sentence_internal_punctuation_charP(final SubLObject v_char) {
        return conses_high.member(v_char, (SubLObject)document.$list140, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 32705L)
    public static SubLObject any_punctuation_charP(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(document.NIL != sentence_final_punctuation_charP(v_char) || document.NIL != sentence_internal_punctuation_charP(v_char));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 32854L)
    public static SubLObject quote_charP(final SubLObject v_char) {
        return conses_high.member(v_char, (SubLObject)document.$list141, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 32928L)
    public static SubLObject new_phrase(SubLObject slot_values) {
        if (slot_values == document.UNPROVIDED) {
            slot_values = (SubLObject)document.NIL;
        }
        assert document.NIL != Types.listp(slot_values) : slot_values;
        final SubLObject phrase = make_sign((SubLObject)document.UNPROVIDED);
        _csetf_sign_type(phrase, (SubLObject)document.$kw57$P);
        phrase_update(phrase, slot_values);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 33321L)
    public static SubLObject phrase_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(document.NIL != sign_p(v_object) && sign_type(v_object) == document.$kw57$P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 33480L)
    public static SubLObject phrase_string(final SubLObject phrase) {
        assert document.NIL != phrase_p(phrase) : phrase;
        return sign_string(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 33650L)
    public static SubLObject phrase_category(final SubLObject phrase) {
        assert document.NIL != phrase_p(phrase) : phrase;
        return sign_category(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 33826L)
    public static SubLObject phrase_yield(final SubLObject phrase) {
        assert document.NIL != phrase_p(phrase) : phrase;
        return Functions.apply((SubLObject)document.$sym67$VECTOR, sign_yield(phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 34021L)
    public static SubLObject phrase_do_constituents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list143);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constituent = (SubLObject)document.NIL;
        SubLObject phrase = (SubLObject)document.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list143);
        constituent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list143);
        phrase = current.first();
        current = current.rest();
        if (document.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)document.$sym144$SIGN_DO_CONSTITUENTS, (SubLObject)ConsesLow.list(constituent, phrase), ConsesLow.append(body, (SubLObject)document.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document.$list143);
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 34302L)
    public static SubLObject phrase_constituents(final SubLObject phrase) {
        assert document.NIL != phrase_p(phrase) : phrase;
        return sign_constituents(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 34490L)
    public static SubLObject phrase_nodes(final SubLObject phrase) {
        assert document.NIL != phrase_p(phrase) : phrase;
        SubLObject nodes = (SubLObject)ConsesLow.list(phrase);
        final SubLObject vector_var = sign_constituents(phrase);
        final SubLObject backwardP_var = (SubLObject)document.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
            element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
            daughter = Vectors.aref(vector_var, element_num);
            nodes = ConsesLow.nconc(nodes, (SubLObject)((document.NIL != phrase_p(daughter)) ? phrase_nodes(daughter) : ConsesLow.list(daughter)));
        }
        return nodes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 34847L)
    public static SubLObject phrase_intervals(final SubLObject phrase, SubLObject start) {
        if (start == document.UNPROVIDED) {
            start = (SubLObject)document.ZERO_INTEGER;
        }
        assert document.NIL != phrase_p(phrase) : phrase;
        assert document.NIL != Types.integerp(start) : start;
        SubLObject nodes = (SubLObject)document.NIL;
        SubLObject daughter_index = start;
        final SubLObject vector_var = sign_constituents(phrase);
        final SubLObject backwardP_var = (SubLObject)document.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
            element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
            daughter = Vectors.aref(vector_var, element_num);
            nodes = ConsesLow.nconc((SubLObject)((document.NIL != phrase_p(daughter)) ? phrase_intervals(daughter, daughter_index) : ConsesLow.list(standard_tokenization.new_interval_token(daughter_index, Numbers.add(daughter_index, (SubLObject)document.ONE_INTEGER), daughter))), nodes);
            daughter_index = standard_tokenization.interval_token_end(nodes.first());
        }
        nodes = (SubLObject)ConsesLow.cons(standard_tokenization.new_interval_token(start, standard_tokenization.interval_token_end(nodes.first()), phrase), nodes);
        return nodes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 35631L)
    public static SubLObject phrase_info(final SubLObject phrase) {
        assert document.NIL != phrase_p(phrase) : phrase;
        return sign_info(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 35801L)
    public static SubLObject phrase_update(final SubLObject phrase, final SubLObject slot_values) {
        assert document.NIL != phrase_p(phrase) : phrase;
        assert document.NIL != Types.listp(slot_values) : slot_values;
        return sign_update(phrase, slot_values);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 36237L)
    public static SubLObject phrase_get(final SubLObject phrase, final SubLObject index) {
        assert document.NIL != phrase_p(phrase) : phrase;
        assert document.NIL != Types.integerp(index) : index;
        return sign_get(phrase, index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 36473L)
    public static SubLObject phrase_set(final SubLObject phrase, final SubLObject index, final SubLObject sign) {
        assert document.NIL != phrase_p(phrase) : phrase;
        assert document.NIL != Types.integerp(index) : index;
        assert document.NIL != sign_p(sign) : sign;
        return sign_set(phrase, index, sign);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 36822L)
    public static SubLObject phrase_constituent_length(final SubLObject phrase) {
        assert document.NIL != phrase_p(phrase) : phrase;
        return sign_length(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 37023L)
    public static SubLObject phrase_to_xml(final SubLObject phrase, SubLObject level) {
        if (level == document.UNPROVIDED) {
            level = (SubLObject)document.ZERO_INTEGER;
        }
        SubLObject daughters_xml = string_utilities.$empty_string$.getGlobalValue();
        final SubLObject vector_var = sign_constituents(phrase);
        final SubLObject backwardP_var = (SubLObject)document.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
            element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
            daughter = Vectors.aref(vector_var, element_num);
            daughters_xml = Sequences.cconcatenate(daughters_xml, sign_to_xml(daughter, Numbers.add(level, (SubLObject)document.ONE_INTEGER)));
        }
        return PrintLow.format((SubLObject)document.NIL, (SubLObject)document.$str145$_a_PHR_a__a_a_a__PHR__a, new SubLObject[] { string_utilities.tabstr(level, document.$xml_indent$.getGlobalValue()), (document.NIL != phrase_category(phrase)) ? Sequences.cconcatenate((SubLObject)document.$str146$_cat__, new SubLObject[] { print_high.princ_to_string(phrase_category(phrase)), document.$str44$_ }) : string_utilities.$empty_string$.getGlobalValue(), document.$newline$.getGlobalValue(), daughters_xml, string_utilities.tabstr(level, document.$xml_indent$.getGlobalValue()), document.$newline$.getGlobalValue() });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 37732L)
    public static SubLObject sentence_do_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = (SubLObject)document.NIL;
        SubLObject sentence = (SubLObject)document.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list147);
        word = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list147);
        sentence = current.first();
        current = current.rest();
        if (document.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)document.$sym148$CDOLIST, (SubLObject)ConsesLow.list(word, (SubLObject)ConsesLow.list((SubLObject)document.$sym149$SENTENCE_YIELD_EXHAUSTIVE, sentence)), ConsesLow.append(body, (SubLObject)document.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document.$list147);
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 37999L)
    public static SubLObject sentence_do_minimal_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list147);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = (SubLObject)document.NIL;
        SubLObject sentence = (SubLObject)document.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list147);
        word = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list147);
        sentence = current.first();
        current = current.rest();
        if (document.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)document.$sym54$CDOVECTOR, (SubLObject)ConsesLow.list(word, (SubLObject)ConsesLow.list((SubLObject)document.$sym150$SENTENCE_YIELD, sentence)), ConsesLow.append(body, (SubLObject)document.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document.$list147);
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 38365L)
    public static SubLObject new_sentence(SubLObject string, SubLObject wordifier) {
        if (string == document.UNPROVIDED) {
            string = (SubLObject)document.NIL;
        }
        if (wordifier == document.UNPROVIDED) {
            wordifier = (SubLObject)document.$sym124$FST_STRING_WORDIFY;
        }
        if (document.NIL != string && !document.assertionsDisabledInClass && document.NIL == Types.stringp(string)) {
            throw new AssertionError(string);
        }
        final SubLObject sentence = new_phrase((SubLObject)document.UNPROVIDED);
        if (document.NIL != string) {
            _csetf_sign_string(sentence, string);
        }
        _csetf_sign_category(sentence, (SubLObject)document.$kw151$S);
        if (document.NIL != string) {
            _csetf_sign_constituents(sentence, string_wordify(string, wordifier));
            SubLObject cdolist_list_var = sentence_yield_exhaustive(sentence);
            SubLObject word = (SubLObject)document.NIL;
            word = cdolist_list_var.first();
            while (document.NIL != cdolist_list_var) {
                _csetf_sign_mother(word, sentence);
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            }
        }
        sign_update(sentence, (SubLObject)document.$list152);
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 38937L)
    public static SubLObject sentence_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(document.NIL != phrase_p(v_object) && phrase_category(v_object) == document.$kw151$S);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 39111L)
    public static SubLObject sentence_print(final SubLObject sentence, final SubLObject stream, final SubLObject depth) {
        return sign_print(sentence, stream, depth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 39266L)
    public static SubLObject sentence_string(final SubLObject sentence) {
        assert document.NIL != sentence_p(sentence) : sentence;
        return sign_string(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 39452L)
    public static SubLObject sentence_category(final SubLObject sentence) {
        assert document.NIL != sentence_p(sentence) : sentence;
        return sign_category(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 39644L)
    public static SubLObject sentence_yield(final SubLObject sentence) {
        assert document.NIL != sentence_p(sentence) : sentence;
        return phrase_yield(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 39841L)
    public static SubLObject sentence_yield_exhaustive(final SubLObject sentence) {
        assert document.NIL != sentence_p(sentence) : sentence;
        SubLObject result_yield = (SubLObject)document.NIL;
        final SubLObject vector_var = phrase_yield(sentence);
        final SubLObject backwardP_var = (SubLObject)document.NIL;
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
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
            element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
            word = Vectors.aref(vector_var, element_num);
            if (document.NIL != exhaustive_word_p(word)) {
                items_var = word_constituents(word);
                if (items_var.isVector()) {
                    vector_var_$1 = items_var;
                    backwardP_var_$2 = (SubLObject)document.NIL;
                    for (length_$3 = Sequences.length(vector_var_$1), v_iteration_$4 = (SubLObject)document.NIL, v_iteration_$4 = (SubLObject)document.ZERO_INTEGER; v_iteration_$4.numL(length_$3); v_iteration_$4 = Numbers.add(v_iteration_$4, (SubLObject)document.ONE_INTEGER)) {
                        element_num_$5 = ((document.NIL != backwardP_var_$2) ? Numbers.subtract(length_$3, v_iteration_$4, (SubLObject)document.ONE_INTEGER) : v_iteration_$4);
                        item = Vectors.aref(vector_var_$1, element_num_$5);
                        result_yield = (SubLObject)ConsesLow.cons(item, result_yield);
                    }
                }
                else {
                    cdolist_list_var = items_var;
                    item2 = (SubLObject)document.NIL;
                    item2 = cdolist_list_var.first();
                    while (document.NIL != cdolist_list_var) {
                        result_yield = (SubLObject)ConsesLow.cons(item2, result_yield);
                        cdolist_list_var = cdolist_list_var.rest();
                        item2 = cdolist_list_var.first();
                    }
                }
            }
            else {
                result_yield = (SubLObject)ConsesLow.cons(word, result_yield);
            }
        }
        return Sequences.nreverse(result_yield);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 40407L)
    public static SubLObject sentence_constituents(final SubLObject sentence) {
        assert document.NIL != sentence_p(sentence) : sentence;
        return sign_constituents(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 40611L)
    public static SubLObject sentence_info(final SubLObject sentence) {
        assert document.NIL != sentence_p(sentence) : sentence;
        return sign_info(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 40797L)
    public static SubLObject sentence_offset(final SubLObject sentence) {
        assert document.NIL != sentence_p(sentence) : sentence;
        return sign_offset(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 41066L)
    public static SubLObject sentence_index(final SubLObject sentence) {
        final SubLObject paragraph = sentence_mother(sentence);
        SubLObject i = (SubLObject)document.ZERO_INTEGER;
        if (document.NIL != paragraph) {
            while (!sentence.eql(paragraph_get(paragraph, i))) {
                i = Numbers.add(i, (SubLObject)document.ONE_INTEGER);
            }
            return i;
        }
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 41361L)
    public static SubLObject sentence_get(final SubLObject sentence, final SubLObject index) {
        assert document.NIL != sentence_p(sentence) : sentence;
        assert document.NIL != Types.integerp(index) : index;
        return sign_get(sentence, index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 41587L)
    public static SubLObject sentence_mother(final SubLObject sentence) {
        assert document.NIL != sentence_p(sentence) : sentence;
        return sign_mother(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 41795L)
    public static SubLObject sentence_set(final SubLObject sentence, final SubLObject index, final SubLObject sign) {
        assert document.NIL != sentence_p(sentence) : sentence;
        assert document.NIL != Types.integerp(index) : index;
        assert document.NIL != sign_p(sign) : sign;
        return sign_set(sentence, index, sign);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 42198L)
    public static SubLObject sentence_length(final SubLObject sentence) {
        assert document.NIL != sentence_p(sentence) : sentence;
        return sign_length(sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 42404L)
    public static SubLObject sentence_do_constituents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list154);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constituent = (SubLObject)document.NIL;
        SubLObject sentence = (SubLObject)document.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list154);
        constituent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list154);
        sentence = current.first();
        current = current.rest();
        if (document.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)document.$sym144$SIGN_DO_CONSTITUENTS, (SubLObject)ConsesLow.list(constituent, sentence), ConsesLow.append(body, (SubLObject)document.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document.$list154);
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 42639L)
    public static SubLObject sentence_reconstruct_substring(final SubLObject start, final SubLObject end, final SubLObject sentence) {
        final SubLObject sentence_string = sentence_string(sentence);
        SubLObject last_index = (SubLObject)document.ZERO_INTEGER;
        SubLObject output_strings = (SubLObject)document.NIL;
        SubLObject i;
        SubLObject word;
        SubLObject word_string;
        SubLObject remaining_sentence_string;
        SubLObject word_start;
        SubLObject first_space;
        SubLObject word_end;
        for (i = (SubLObject)document.NIL, i = (SubLObject)document.ZERO_INTEGER; i.numL(end); i = Numbers.add(i, (SubLObject)document.ONE_INTEGER)) {
            word = sentence_get(sentence, i);
            word_string = word_string(word);
            remaining_sentence_string = string_utilities.substring(sentence_string, last_index, (SubLObject)document.UNPROVIDED);
            word_start = Sequences.search(word_string, remaining_sentence_string, (SubLObject)document.EQUAL, (SubLObject)document.IDENTITY, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
            first_space = (SubLObject)((document.NIL != word_start) ? document.NIL : Sequences.search((SubLObject)document.$str45$_, remaining_sentence_string, (SubLObject)document.EQUAL, (SubLObject)document.IDENTITY, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED));
            word_end = (SubLObject)(word_start.isInteger() ? Numbers.add(word_start, Sequences.length(word_string)) : (first_space.isInteger() ? first_space : document.ZERO_INTEGER));
            last_index = Numbers.add(last_index, word_end);
            if (i.numGE(start)) {
                if (document.NIL != output_strings || document.NIL == word_start) {
                    word_string = string_utilities.substring(remaining_sentence_string, (SubLObject)document.ZERO_INTEGER, word_end);
                }
                output_strings = (SubLObject)ConsesLow.cons(word_string, output_strings);
            }
        }
        return Functions.apply((SubLObject)document.$sym155$CCONCATENATE, Sequences.nreverse(output_strings));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 43883L)
    public static SubLObject construct_string_from_words(final SubLObject words, SubLObject standardizeP, SubLObject stream) {
        if (standardizeP == document.UNPROVIDED) {
            standardizeP = (SubLObject)document.NIL;
        }
        if (stream == document.UNPROVIDED) {
            stream = streams_high.make_private_string_output_stream();
        }
        streams_high.clear_output(stream);
        if (document.NIL != words) {
            SubLObject current_end = word_offset(words.first());
            SubLObject cdolist_list_var = words;
            SubLObject word = (SubLObject)document.NIL;
            word = cdolist_list_var.first();
            while (document.NIL != cdolist_list_var) {
                if (word_offset(word).numG(current_end)) {
                    SubLObject cdotimes_end_var;
                    SubLObject n;
                    for (cdotimes_end_var = Numbers.subtract(word_offset(word), current_end), n = (SubLObject)document.NIL, n = (SubLObject)document.ZERO_INTEGER; n.numL(cdotimes_end_var); n = Numbers.add(n, (SubLObject)document.ONE_INTEGER)) {
                        streams_high.write_string((SubLObject)document.$str45$_, stream, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
                        current_end = Numbers.add(current_end, (SubLObject)document.ONE_INTEGER);
                    }
                }
                if (document.NIL != standardizeP) {
                    final SubLObject standardized = conses_high.caar(nl_trie.nl_trie_standardize_strings((SubLObject)ConsesLow.list(word_string(word))));
                    streams_high.write_string((SubLObject)((document.NIL != standardized) ? standardized : document.$str38$), stream, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
                }
                else {
                    streams_high.write_string(word_string(word), stream, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
                }
                current_end = Numbers.add(current_end, Sequences.length(word_string(word)));
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            }
        }
        return streams_high.get_output_stream_string(stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 45017L)
    public static SubLObject sentence_delete_punctuation(final SubLObject sentence) {
        assert document.NIL != sentence_p(sentence) : sentence;
        Sequences.delete_if((SubLObject)document.$sym156$PUNCTUATION_SIGN_P, sentence_constituents(sentence), (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 45359L)
    public static SubLObject sentence_listify(final SubLObject sentence) {
        return vector_utilities.vector_elements(sentence_constituents(sentence), (SubLObject)document.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 45574L)
    public static SubLObject sentence_stringify(final SubLObject sentence) {
        return Mapping.mapcar((SubLObject)document.$sym10$SIGN_STRING, sentence_listify(sentence));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 45773L)
    public static SubLObject build_sentence_token(final SubLObject fst, SubLObject wordifier) {
        if (wordifier == document.UNPROVIDED) {
            wordifier = (SubLObject)((document.NIL != document.$wordifier$.getDynamicValue()) ? document.$wordifier$.getDynamicValue() : document.$sym124$FST_STRING_WORDIFY);
        }
        final SubLObject sentence = new_sentence((SubLObject)document.NIL, wordifier);
        SubLObject string = (SubLObject)document.$str38$;
        SubLObject current_index = (SubLObject)document.NIL;
        _csetf_sign_constituents(sentence, Functions.apply(Symbols.symbol_function((SubLObject)document.$sym67$VECTOR), finite_state_transducer.fst_output(fst)));
        SubLObject stream = (SubLObject)document.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            SubLObject cdolist_list_var = sentence_yield_exhaustive(sentence);
            SubLObject word = (SubLObject)document.NIL;
            word = cdolist_list_var.first();
            while (document.NIL != cdolist_list_var) {
                final SubLObject word_offset = sign_offset(word);
                if (document.NIL != current_index && current_index.numL(word_offset)) {
                    SubLObject cdotimes_end_var;
                    SubLObject n;
                    for (cdotimes_end_var = Numbers.subtract(word_offset, current_index), n = (SubLObject)document.NIL, n = (SubLObject)document.ZERO_INTEGER; n.numL(cdotimes_end_var); n = Numbers.add(n, (SubLObject)document.ONE_INTEGER)) {
                        print_high.princ((SubLObject)document.$str45$_, stream);
                    }
                }
                _csetf_sign_mother(word, sentence);
                print_high.princ(word_string(word), stream);
                current_index = Numbers.add(word_offset, word_length(word));
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            }
            string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)document.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)document.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        _csetf_sign_offset(sentence, word_offset(sentence_get(sentence, (SubLObject)document.ZERO_INTEGER)));
        _csetf_sign_string(sentence, string);
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 46781L)
    public static SubLObject string_sentencify(final SubLObject string, SubLObject wordifier) {
        if (wordifier == document.UNPROVIDED) {
            wordifier = (SubLObject)document.$sym68$RKF_STANDARD_STRING_WORDIFY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentences = (SubLObject)document.NIL;
        final SubLObject _prev_bind_0 = document.$wordifier$.currentBinding(thread);
        try {
            document.$wordifier$.bind(wordifier, thread);
            sentences = finite_state_transducer.fst_match_global(document.$sentencifier_fst$.getDynamicValue(thread), string_wordify(string, wordifier));
        }
        finally {
            document.$wordifier$.rebind(_prev_bind_0, thread);
        }
        return sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 47223L)
    public static SubLObject newline_sentence_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(document.NIL != sentence_p(v_object) && Vectors.aref(word_string(Vectors.aref(sign_constituents(v_object), (SubLObject)document.ZERO_INTEGER)), (SubLObject)document.ZERO_INTEGER).eql((SubLObject)Characters.CHAR_newline));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 47508L)
    public static SubLObject paragraph_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        paragraph_print(v_object, stream, (SubLObject)document.ZERO_INTEGER);
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 47508L)
    public static SubLObject paragraph_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $paragraph_native.class) ? document.T : document.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 47508L)
    public static SubLObject paragraph_sentences(final SubLObject v_object) {
        assert document.NIL != paragraph_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 47508L)
    public static SubLObject paragraph_mother(final SubLObject v_object) {
        assert document.NIL != paragraph_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 47508L)
    public static SubLObject _csetf_paragraph_sentences(final SubLObject v_object, final SubLObject value) {
        assert document.NIL != paragraph_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 47508L)
    public static SubLObject _csetf_paragraph_mother(final SubLObject v_object, final SubLObject value) {
        assert document.NIL != paragraph_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 47508L)
    public static SubLObject make_paragraph(SubLObject arglist) {
        if (arglist == document.UNPROVIDED) {
            arglist = (SubLObject)document.NIL;
        }
        final SubLObject v_new = (SubLObject)new $paragraph_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)document.NIL, next = arglist; document.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)document.$kw170$SENTENCES)) {
                _csetf_paragraph_sentences(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)document.$kw30$MOTHER)) {
                _csetf_paragraph_mother(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)document.$str31$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 47508L)
    public static SubLObject visit_defstruct_paragraph(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw32$BEGIN, (SubLObject)document.$sym171$MAKE_PARAGRAPH, (SubLObject)document.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw34$SLOT, (SubLObject)document.$kw170$SENTENCES, paragraph_sentences(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw34$SLOT, (SubLObject)document.$kw30$MOTHER, paragraph_mother(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw35$END, (SubLObject)document.$sym171$MAKE_PARAGRAPH, (SubLObject)document.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 47508L)
    public static SubLObject visit_defstruct_object_paragraph_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_paragraph(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 47674L)
    public static SubLObject paragraph_do_sentences(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list173);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sentence = (SubLObject)document.NIL;
        SubLObject paragraph = (SubLObject)document.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list173);
        sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list173);
        paragraph = current.first();
        current = current.rest();
        if (document.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)document.$sym54$CDOVECTOR, (SubLObject)ConsesLow.list(sentence, (SubLObject)ConsesLow.list((SubLObject)document.$sym166$PARAGRAPH_SENTENCES, paragraph)), ConsesLow.append(body, (SubLObject)document.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document.$list173);
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 47990L)
    public static SubLObject paragraph_do_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list174);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = (SubLObject)document.NIL;
        SubLObject paragraph = (SubLObject)document.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list174);
        word = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list174);
        paragraph = current.first();
        current = current.rest();
        if (document.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject sentence = (SubLObject)document.$sym175$SENTENCE;
            return (SubLObject)ConsesLow.list((SubLObject)document.$sym176$PARAGRAPH_DO_SENTENCES, (SubLObject)ConsesLow.list(sentence, paragraph), (SubLObject)ConsesLow.listS((SubLObject)document.$sym177$SENTENCE_DO_WORDS, (SubLObject)ConsesLow.list(word, sentence), ConsesLow.append(body, (SubLObject)document.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document.$list174);
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 48324L)
    public static SubLObject paragraph_do_minimal_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list174);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = (SubLObject)document.NIL;
        SubLObject paragraph = (SubLObject)document.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list174);
        word = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list174);
        paragraph = current.first();
        current = current.rest();
        if (document.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject sentence = (SubLObject)document.$sym178$SENTENCE;
            return (SubLObject)ConsesLow.list((SubLObject)document.$sym176$PARAGRAPH_DO_SENTENCES, (SubLObject)ConsesLow.list(sentence, paragraph), (SubLObject)ConsesLow.listS((SubLObject)document.$sym179$SENTENCE_DO_MINIMAL_WORDS, (SubLObject)ConsesLow.list(word, sentence), ConsesLow.append(body, (SubLObject)document.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document.$list174);
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 48674L)
    public static SubLObject new_paragraph(final SubLObject string) {
        assert document.NIL != Types.stringp(string) : string;
        final SubLObject paragraph = make_paragraph((SubLObject)document.UNPROVIDED);
        _csetf_paragraph_sentences(paragraph, string_sentencify(string, (SubLObject)document.UNPROVIDED));
        final SubLObject vector_var = paragraph_sentences(paragraph);
        final SubLObject backwardP_var = (SubLObject)document.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sen;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
            element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
            sen = Vectors.aref(vector_var, element_num);
            _csetf_sign_mother(sen, paragraph);
        }
        return paragraph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 49116L)
    public static SubLObject paragraph_print(final SubLObject paragraph, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert document.NIL != paragraph_p(paragraph) : paragraph;
        streams_high.write_string((SubLObject)document.$str180$__PAR_, stream, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = Numbers.min(paragraph_sentence_length(paragraph), document.$text_class_print_length$.getDynamicValue(thread)), i = (SubLObject)document.NIL, i = (SubLObject)document.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)document.ONE_INTEGER)) {
            streams_high.terpri(stream);
            sentence_print(paragraph_get(paragraph, i), stream, (SubLObject)document.ZERO_INTEGER);
        }
        if (document.$text_class_print_length$.getDynamicValue(thread).numL(paragraph_sentence_length(paragraph))) {
            streams_high.write_string((SubLObject)document.$str46$____, stream, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
        }
        streams_high.write_string((SubLObject)document.$str48$_, stream, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
        return paragraph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 49623L)
    public static SubLObject paragraph_get(final SubLObject paragraph, final SubLObject index) {
        assert document.NIL != paragraph_p(paragraph) : paragraph;
        assert document.NIL != Types.integerp(index) : index;
        return Vectors.aref(paragraph_sentences(paragraph), index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 49905L)
    public static SubLObject paragraph_set(final SubLObject paragraph, final SubLObject index, final SubLObject sentence) {
        assert document.NIL != paragraph_p(paragraph) : paragraph;
        assert document.NIL != Types.integerp(index) : index;
        assert document.NIL != sentence_p(sentence) : sentence;
        final SubLObject old_sentence = Vectors.aref(paragraph_sentences(paragraph), index);
        Vectors.set_aref(paragraph_sentences(paragraph), index, sentence);
        _csetf_sign_mother(sentence, paragraph);
        return old_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 50482L)
    public static SubLObject paragraph_sentence_length(final SubLObject paragraph) {
        assert document.NIL != paragraph_p(paragraph) : paragraph;
        return Sequences.length(paragraph_sentences(paragraph));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 50773L)
    public static SubLObject paragraph_word_length(final SubLObject paragraph) {
        assert document.NIL != paragraph_p(paragraph) : paragraph;
        SubLObject length = (SubLObject)document.ZERO_INTEGER;
        final SubLObject vector_var = paragraph_sentences(paragraph);
        final SubLObject backwardP_var = (SubLObject)document.NIL;
        SubLObject length_$6;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sentence;
        for (length_$6 = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length_$6); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
            element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length_$6, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
            sentence = Vectors.aref(vector_var, element_num);
            length = Numbers.add(length, sentence_length(sentence));
        }
        return length;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 51139L)
    public static SubLObject paragraph_offset(final SubLObject paragraph) {
        return sentence_offset(paragraph_get(paragraph, (SubLObject)document.ZERO_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 51242L)
    public static SubLObject paragraph_string(final SubLObject paragraph) {
        SubLObject output_string = (SubLObject)document.NIL;
        SubLObject current_end = (SubLObject)document.ZERO_INTEGER;
        SubLObject s = (SubLObject)document.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            final SubLObject vector_var = paragraph_sentences(paragraph);
            final SubLObject backwardP_var = (SubLObject)document.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject sent;
            SubLObject diff;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
                element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
                sent = Vectors.aref(vector_var, element_num);
                if (current_end.numL(sentence_offset(sent))) {
                    diff = Numbers.subtract(sentence_offset(sent), current_end);
                    string_utilities.indent(s, diff);
                    current_end = Numbers.add(current_end, diff);
                }
                print_high.princ(sentence_string(sent), s);
                current_end = Numbers.add(current_end, Sequences.length(sentence_string(sent)));
            }
            output_string = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)document.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)document.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return output_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 52009L)
    public static SubLObject paragraph_to_xml(final SubLObject paragraph, SubLObject level) {
        if (level == document.UNPROVIDED) {
            level = (SubLObject)document.ZERO_INTEGER;
        }
        assert document.NIL != paragraph_p(paragraph) : paragraph;
        SubLObject xml = (SubLObject)document.NIL;
        xml = Sequences.cconcatenate(string_utilities.tabstr(level, document.$xml_indent$.getGlobalValue()), new SubLObject[] { document.$str181$_PAR_, document.$newline$.getGlobalValue() });
        final SubLObject vector_var = paragraph_sentences(paragraph);
        final SubLObject backwardP_var = (SubLObject)document.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sentence;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
            element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
            sentence = Vectors.aref(vector_var, element_num);
            xml = Sequences.cconcatenate(xml, sign_to_xml(sentence, Numbers.add(level, (SubLObject)document.ONE_INTEGER)));
        }
        xml = Sequences.cconcatenate(xml, new SubLObject[] { string_utilities.tabstr(level, document.$xml_indent$.getGlobalValue()), document.$str182$__PAR_, document.$newline$.getGlobalValue() });
        return xml;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 52512L)
    public static SubLObject build_paragraph_token(final SubLObject fst) {
        final SubLObject paragraph = make_paragraph((SubLObject)document.UNPROVIDED);
        _csetf_paragraph_sentences(paragraph, Functions.apply((SubLObject)document.$sym67$VECTOR, finite_state_transducer.fst_output(fst)));
        final SubLObject vector_var = paragraph_sentences(paragraph);
        final SubLObject backwardP_var = (SubLObject)document.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sen;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
            element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
            sen = Vectors.aref(vector_var, element_num);
            _csetf_sign_mother(sen, paragraph);
        }
        return paragraph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 52918L)
    public static SubLObject string_paragraphize(final SubLObject string, SubLObject wordifier, SubLObject sentencifyP) {
        if (wordifier == document.UNPROVIDED) {
            wordifier = (SubLObject)document.$sym124$FST_STRING_WORDIFY;
        }
        if (sentencifyP == document.UNPROVIDED) {
            sentencifyP = (SubLObject)document.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (document.NIL != sentencifyP) {
            return finite_state_transducer.fst_match_global(document.$paragraphier_fst$.getDynamicValue(thread), string_sentencify(string, wordifier));
        }
        final SubLObject paragraph = make_paragraph((SubLObject)document.UNPROVIDED);
        final SubLObject sentence = new_sentence(string, wordifier);
        _csetf_paragraph_sentences(paragraph, Vectors.make_vector((SubLObject)document.ONE_INTEGER, sentence));
        final SubLObject vector_var = paragraph_sentences(paragraph);
        final SubLObject backwardP_var = (SubLObject)document.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sen;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
            element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
            sen = Vectors.aref(vector_var, element_num);
            _csetf_sign_mother(sen, paragraph);
        }
        return Vectors.make_vector((SubLObject)document.ONE_INTEGER, paragraph);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 53563L)
    public static SubLObject sign_to_xml(final SubLObject sign, SubLObject level) {
        if (level == document.UNPROVIDED) {
            level = (SubLObject)document.ZERO_INTEGER;
        }
        assert document.NIL != sign_p(sign) : sign;
        if (document.NIL != word_p(sign)) {
            return word_to_xml(sign, level);
        }
        return phrase_to_xml(sign, level);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 53864L)
    public static SubLObject document_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        document_print(v_object, stream, (SubLObject)document.ZERO_INTEGER);
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 53864L)
    public static SubLObject document_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $document_native.class) ? document.T : document.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 53864L)
    public static SubLObject document_paragraphs(final SubLObject v_object) {
        assert document.NIL != document_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 53864L)
    public static SubLObject _csetf_document_paragraphs(final SubLObject v_object, final SubLObject value) {
        assert document.NIL != document_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 53864L)
    public static SubLObject make_document(SubLObject arglist) {
        if (arglist == document.UNPROVIDED) {
            arglist = (SubLObject)document.NIL;
        }
        final SubLObject v_new = (SubLObject)new $document_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)document.NIL, next = arglist; document.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)document.$kw194$PARAGRAPHS)) {
                _csetf_document_paragraphs(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)document.$str31$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 53864L)
    public static SubLObject visit_defstruct_document(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw32$BEGIN, (SubLObject)document.$sym195$MAKE_DOCUMENT, (SubLObject)document.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw34$SLOT, (SubLObject)document.$kw194$PARAGRAPHS, document_paragraphs(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)document.$kw35$END, (SubLObject)document.$sym195$MAKE_DOCUMENT, (SubLObject)document.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 53864L)
    public static SubLObject visit_defstruct_object_document_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_document(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 53984L)
    public static SubLObject new_document(final SubLObject input, SubLObject sentencifyP, SubLObject wordifier) {
        if (sentencifyP == document.UNPROVIDED) {
            sentencifyP = (SubLObject)document.T;
        }
        if (wordifier == document.UNPROVIDED) {
            wordifier = (SubLObject)document.$sym124$FST_STRING_WORDIFY;
        }
        if (input.isString()) {
            return possibly_perform_document_dot_analysis(new_document_from_string(input, wordifier, sentencifyP));
        }
        if (input.isStream()) {
            return possibly_perform_document_dot_analysis(new_document_from_stream(input, wordifier, sentencifyP));
        }
        Errors.error((SubLObject)document.$str197$_A_is_neither_a_string_nor_a_stre);
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 54739L)
    public static SubLObject document_do_paragraphs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list198);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject paragraph = (SubLObject)document.NIL;
        SubLObject v_document = (SubLObject)document.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list198);
        paragraph = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list198);
        v_document = current.first();
        current = current.rest();
        if (document.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)document.$sym54$CDOVECTOR, (SubLObject)ConsesLow.list(paragraph, (SubLObject)ConsesLow.list((SubLObject)document.$sym192$DOCUMENT_PARAGRAPHS, v_document)), ConsesLow.append(body, (SubLObject)document.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document.$list198);
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 55026L)
    public static SubLObject document_do_sentences(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list199);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sentence = (SubLObject)document.NIL;
        SubLObject v_document = (SubLObject)document.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list199);
        sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list199);
        v_document = current.first();
        current = current.rest();
        if (document.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject paragraph = (SubLObject)document.$sym200$PARAGRAPH;
            return (SubLObject)ConsesLow.list((SubLObject)document.$sym201$DOCUMENT_DO_PARAGRAPHS, (SubLObject)ConsesLow.list(paragraph, v_document), (SubLObject)ConsesLow.listS((SubLObject)document.$sym176$PARAGRAPH_DO_SENTENCES, (SubLObject)ConsesLow.list(sentence, paragraph), ConsesLow.append(body, (SubLObject)document.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document.$list199);
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 55443L)
    public static SubLObject possibly_perform_document_dot_analysis(final SubLObject doc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (document.NIL != document.$perform_dot_analysis_on_docs$.getDynamicValue(thread)) ? document_perform_dot_analysis(doc) : doc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 55602L)
    public static SubLObject document_perform_dot_analysis(final SubLObject doc) {
        final SubLObject vector_var = document_paragraphs(doc);
        final SubLObject backwardP_var = (SubLObject)document.NIL;
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
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
            element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            vector_var_$7 = paragraph_sentences(paragraph);
            backwardP_var_$8 = (SubLObject)document.NIL;
            length_$9 = Sequences.length(vector_var_$7);
            v_iteration_$10 = (SubLObject)document.NIL;
            v_iteration_$10 = (SubLObject)document.ZERO_INTEGER;
            if (v_iteration_$10.numL(length_$9)) {
                element_num_$11 = ((document.NIL != backwardP_var_$8) ? Numbers.subtract(length_$9, v_iteration_$10, (SubLObject)document.ONE_INTEGER) : v_iteration_$10);
                sent = Vectors.aref(vector_var_$7, element_num_$11);
                prev_word = (SubLObject)document.NIL;
                combinations = (SubLObject)document.NIL;
                cdolist_list_var = sentence_yield_exhaustive(sent);
                word = (SubLObject)document.NIL;
                word = cdolist_list_var.first();
                while (document.NIL != cdolist_list_var) {
                    if (document.NIL != prev_word && document.NIL != word && document.ONE_INTEGER.eql(word_length(prev_word)) && document.$str202$_.equal(word_string(word))) {
                        combinations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(prev_word, word, sent), combinations);
                    }
                    prev_word = word;
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                }
                cdolist_list_var = combinations;
                combo = (SubLObject)document.NIL;
                combo = cdolist_list_var.first();
                while (document.NIL != cdolist_list_var) {
                    datum = (current = combo);
                    first_word = (SubLObject)document.NIL;
                    second_word = (SubLObject)document.NIL;
                    sent_$12 = (SubLObject)document.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list203);
                    first_word = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list203);
                    second_word = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list203);
                    sent_$12 = current.first();
                    current = current.rest();
                    if (document.NIL == current) {
                        set_word_string(first_word, Sequences.cconcatenate(word_string(first_word), word_string(second_word)));
                        Sequences.delete(second_word, sign_constituents(sent_$12), (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document.$list203);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    combo = cdolist_list_var.first();
                }
                return doc;
            }
        }
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 56217L)
    public static SubLObject new_document_from_string(final SubLObject string, SubLObject wordifier, SubLObject sentencifyP) {
        if (wordifier == document.UNPROVIDED) {
            wordifier = (SubLObject)document.$sym124$FST_STRING_WORDIFY;
        }
        if (sentencifyP == document.UNPROVIDED) {
            sentencifyP = (SubLObject)document.T;
        }
        assert document.NIL != Types.stringp(string) : string;
        final SubLObject doc = make_document((SubLObject)document.UNPROVIDED);
        _csetf_document_paragraphs(doc, string_paragraphize(string, wordifier, sentencifyP));
        final SubLObject vector_var = document_paragraphs(doc);
        final SubLObject backwardP_var = (SubLObject)document.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject par;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
            element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
            par = Vectors.aref(vector_var, element_num);
            _csetf_paragraph_mother(par, doc);
        }
        return doc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 56722L)
    public static SubLObject new_document_from_file(final SubLObject path, SubLObject sentencifyP, SubLObject wordifier) {
        if (sentencifyP == document.UNPROVIDED) {
            sentencifyP = (SubLObject)document.T;
        }
        if (wordifier == document.UNPROVIDED) {
            wordifier = (SubLObject)document.$sym124$FST_STRING_WORDIFY;
        }
        assert document.NIL != Types.stringp(path) : path;
        SubLObject doc = make_document((SubLObject)document.UNPROVIDED);
        if (document.NIL != Filesys.probe_file(path)) {
            SubLObject stream = (SubLObject)document.NIL;
            try {
                stream = compatibility.open_text(path, (SubLObject)document.$kw204$INPUT);
                if (!stream.isStream()) {
                    Errors.error((SubLObject)document.$str205$Unable_to_open__S, path);
                }
                final SubLObject stream_$13 = stream;
                doc = new_document(stream_$13, sentencifyP, wordifier);
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)document.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)document.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        return doc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 57184L)
    public static SubLObject new_document_from_stream(final SubLObject in_stream, SubLObject wordifier, SubLObject sentencifyP) {
        if (wordifier == document.UNPROVIDED) {
            wordifier = (SubLObject)document.$sym124$FST_STRING_WORDIFY;
        }
        if (sentencifyP == document.UNPROVIDED) {
            sentencifyP = (SubLObject)document.T;
        }
        assert document.NIL != streams_high.input_stream_p(in_stream) : in_stream;
        final SubLObject doc = make_document((SubLObject)document.UNPROVIDED);
        _csetf_document_paragraphs(doc, string_paragraphize(stream_stringify(in_stream), wordifier, sentencifyP));
        final SubLObject vector_var = document_paragraphs(doc);
        final SubLObject backwardP_var = (SubLObject)document.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject par;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
            element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
            par = Vectors.aref(vector_var, element_num);
            _csetf_paragraph_mother(par, doc);
        }
        return doc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 57735L)
    public static SubLObject document_print(final SubLObject v_document, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert document.NIL != document_p(v_document) : v_document;
        streams_high.write_string((SubLObject)document.$str207$__DOC_, stream, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = Numbers.min(document_paragraph_length(v_document), document.$text_class_print_length$.getDynamicValue(thread)), i = (SubLObject)document.NIL, i = (SubLObject)document.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)document.ONE_INTEGER)) {
            streams_high.terpri(stream);
            paragraph_print(document_get(v_document, i), stream, (SubLObject)document.ZERO_INTEGER);
        }
        if (document.$text_class_print_length$.getDynamicValue(thread).numL(document_paragraph_length(v_document))) {
            streams_high.write_string((SubLObject)document.$str46$____, stream, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
        }
        streams_high.write_string((SubLObject)document.$str48$_, stream, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED);
        return v_document;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 58233L)
    public static SubLObject document_get(final SubLObject v_document, final SubLObject index) {
        assert document.NIL != document_p(v_document) : v_document;
        assert document.NIL != Types.integerp(index) : index;
        return Vectors.aref(document_paragraphs(v_document), index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 58510L)
    public static SubLObject document_set(final SubLObject v_document, final SubLObject index, final SubLObject paragraph) {
        assert document.NIL != document_p(v_document) : v_document;
        assert document.NIL != Types.integerp(index) : index;
        assert document.NIL != paragraph_p(paragraph) : paragraph;
        final SubLObject old_paragraph = Vectors.aref(document_paragraphs(v_document), index);
        Vectors.set_aref(document_paragraphs(v_document), index, paragraph);
        _csetf_paragraph_mother(paragraph, v_document);
        return old_paragraph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 59091L)
    public static SubLObject document_get_sentence(final SubLObject v_document, final SubLObject index) {
        assert document.NIL != document_p(v_document) : v_document;
        assert document.NIL != Types.integerp(index) : index;
        SubLObject current = (SubLObject)document.ZERO_INTEGER;
        final SubLObject vector_var = document_paragraphs(v_document);
        final SubLObject backwardP_var = (SubLObject)document.NIL;
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
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
            element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            vector_var_$14 = paragraph_sentences(paragraph);
            backwardP_var_$15 = (SubLObject)document.NIL;
            for (length_$16 = Sequences.length(vector_var_$14), v_iteration_$17 = (SubLObject)document.NIL, v_iteration_$17 = (SubLObject)document.ZERO_INTEGER; v_iteration_$17.numL(length_$16); v_iteration_$17 = Numbers.add(v_iteration_$17, (SubLObject)document.ONE_INTEGER)) {
                element_num_$18 = ((document.NIL != backwardP_var_$15) ? Numbers.subtract(length_$16, v_iteration_$17, (SubLObject)document.ONE_INTEGER) : v_iteration_$17);
                sentence = Vectors.aref(vector_var_$14, element_num_$18);
                if (current.numE(index)) {
                    return sentence;
                }
                current = Numbers.add(current, (SubLObject)document.ONE_INTEGER);
            }
        }
        return Errors.error(PrintLow.format((SubLObject)document.NIL, (SubLObject)document.$str208$Sentence_index__A_out_of_bounds_, index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 59544L)
    public static SubLObject document_get_word(final SubLObject v_document, final SubLObject index) {
        assert document.NIL != document_p(v_document) : v_document;
        assert document.NIL != Types.integerp(index) : index;
        SubLObject current_word_index = (SubLObject)document.ZERO_INTEGER;
        final SubLObject vector_var = document_paragraphs(v_document);
        final SubLObject backwardP_var = (SubLObject)document.NIL;
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
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
            element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            vector_var_$19 = paragraph_sentences(paragraph);
            backwardP_var_$20 = (SubLObject)document.NIL;
            for (length_$21 = Sequences.length(vector_var_$19), v_iteration_$22 = (SubLObject)document.NIL, v_iteration_$22 = (SubLObject)document.ZERO_INTEGER; v_iteration_$22.numL(length_$21); v_iteration_$22 = Numbers.add(v_iteration_$22, (SubLObject)document.ONE_INTEGER)) {
                element_num_$23 = ((document.NIL != backwardP_var_$20) ? Numbers.subtract(length_$21, v_iteration_$22, (SubLObject)document.ONE_INTEGER) : v_iteration_$22);
                sentence = Vectors.aref(vector_var_$19, element_num_$23);
                if (Numbers.add(current_word_index, sentence_length(sentence)).numG(index)) {
                    return sentence_get(sentence, Numbers.subtract(index, current_word_index));
                }
                current_word_index = Numbers.add(current_word_index, sentence_length(sentence));
            }
        }
        return Errors.error(PrintLow.format((SubLObject)document.NIL, (SubLObject)document.$str208$Sentence_index__A_out_of_bounds_, index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 60111L)
    public static SubLObject document_to_xml(final SubLObject v_document) {
        assert document.NIL != document_p(v_document) : v_document;
        SubLObject xml = (SubLObject)document.NIL;
        xml = Sequences.cconcatenate((SubLObject)document.$str209$_DOC_, document.$newline$.getGlobalValue());
        final SubLObject vector_var = document_paragraphs(v_document);
        final SubLObject backwardP_var = (SubLObject)document.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
            element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            xml = Sequences.cconcatenate(xml, paragraph_to_xml(paragraph, (SubLObject)document.ONE_INTEGER));
        }
        xml = Sequences.cconcatenate(xml, new SubLObject[] { document.$str210$__DOC_, document.$newline$.getGlobalValue() });
        return xml;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 60526L)
    public static SubLObject document_paragraph_length(final SubLObject v_document) {
        assert document.NIL != document_p(v_document) : v_document;
        return Sequences.length(document_paragraphs(v_document));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 60808L)
    public static SubLObject document_sentence_length(final SubLObject v_document) {
        assert document.NIL != document_p(v_document) : v_document;
        SubLObject length = (SubLObject)document.ZERO_INTEGER;
        final SubLObject vector_var = document_paragraphs(v_document);
        final SubLObject backwardP_var = (SubLObject)document.NIL;
        SubLObject length_$24;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        for (length_$24 = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length_$24); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
            element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length_$24, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            length = Numbers.add(length, paragraph_sentence_length(paragraph));
        }
        return length;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 61186L)
    public static SubLObject document_word_length(final SubLObject v_document) {
        assert document.NIL != document_p(v_document) : v_document;
        SubLObject length = (SubLObject)document.ZERO_INTEGER;
        final SubLObject vector_var = document_paragraphs(v_document);
        final SubLObject backwardP_var = (SubLObject)document.NIL;
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
        for (length_$25 = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length_$25); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
            element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length_$25, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            vector_var_$26 = paragraph_sentences(paragraph);
            backwardP_var_$27 = (SubLObject)document.NIL;
            for (length_$26 = Sequences.length(vector_var_$26), v_iteration_$29 = (SubLObject)document.NIL, v_iteration_$29 = (SubLObject)document.ZERO_INTEGER; v_iteration_$29.numL(length_$26); v_iteration_$29 = Numbers.add(v_iteration_$29, (SubLObject)document.ONE_INTEGER)) {
                element_num_$30 = ((document.NIL != backwardP_var_$27) ? Numbers.subtract(length_$26, v_iteration_$29, (SubLObject)document.ONE_INTEGER) : v_iteration_$29);
                sentence = Vectors.aref(vector_var_$26, element_num_$30);
                length = Numbers.add(length, sentence_length(sentence));
            }
        }
        return length;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 61539L)
    public static SubLObject document_do_minimal_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list211);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = (SubLObject)document.NIL;
        SubLObject v_document = (SubLObject)document.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list211);
        word = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list211);
        v_document = current.first();
        current = current.rest();
        if (document.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject sentence = (SubLObject)document.$sym212$SENTENCE;
            return (SubLObject)ConsesLow.list((SubLObject)document.$sym213$DOCUMENT_DO_SENTENCES, (SubLObject)ConsesLow.list(sentence, v_document), (SubLObject)ConsesLow.listS((SubLObject)document.$sym179$SENTENCE_DO_MINIMAL_WORDS, (SubLObject)ConsesLow.list(word, sentence), ConsesLow.append(body, (SubLObject)document.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document.$list211);
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 62102L)
    public static SubLObject document_do_words(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list211);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject word = (SubLObject)document.NIL;
        SubLObject v_document = (SubLObject)document.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list211);
        word = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list211);
        v_document = current.first();
        current = current.rest();
        if (document.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject sentence = (SubLObject)document.$sym214$SENTENCE;
            return (SubLObject)ConsesLow.list((SubLObject)document.$sym213$DOCUMENT_DO_SENTENCES, (SubLObject)ConsesLow.list(sentence, v_document), (SubLObject)ConsesLow.listS((SubLObject)document.$sym177$SENTENCE_DO_WORDS, (SubLObject)ConsesLow.list(word, sentence), ConsesLow.append(body, (SubLObject)document.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document.$list211);
        return (SubLObject)document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 62428L)
    public static SubLObject document_string(final SubLObject v_document) {
        SubLObject output_string = (SubLObject)document.NIL;
        SubLObject current_end = (SubLObject)document.ZERO_INTEGER;
        SubLObject s = (SubLObject)document.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            final SubLObject vector_var = document_paragraphs(v_document);
            final SubLObject backwardP_var = (SubLObject)document.NIL;
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
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
                element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
                paragraph = Vectors.aref(vector_var, element_num);
                vector_var_$31 = paragraph_sentences(paragraph);
                backwardP_var_$32 = (SubLObject)document.NIL;
                for (length_$33 = Sequences.length(vector_var_$31), v_iteration_$34 = (SubLObject)document.NIL, v_iteration_$34 = (SubLObject)document.ZERO_INTEGER; v_iteration_$34.numL(length_$33); v_iteration_$34 = Numbers.add(v_iteration_$34, (SubLObject)document.ONE_INTEGER)) {
                    element_num_$35 = ((document.NIL != backwardP_var_$32) ? Numbers.subtract(length_$33, v_iteration_$34, (SubLObject)document.ONE_INTEGER) : v_iteration_$34);
                    sent = Vectors.aref(vector_var_$31, element_num_$35);
                    if (current_end.numL(sentence_offset(sent))) {
                        diff = Numbers.subtract(sentence_offset(sent), current_end);
                        string_utilities.indent(s, diff);
                        current_end = Numbers.add(current_end, diff);
                    }
                    print_high.princ(sentence_string(sent), s);
                    current_end = Numbers.add(current_end, Sequences.length(sentence_string(sent)));
                }
            }
            output_string = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)document.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)document.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return output_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 63189L)
    public static SubLObject new_sentence_iterator(final SubLObject v_object) {
        return (document.NIL != document_p(v_object)) ? new_document_sentence_iterator(v_object) : ((document.NIL != paragraph_p(v_object)) ? new_paragraph_sentence_iterator(v_object) : ((document.NIL != sentence_p(v_object)) ? new_sentence_sentence_iterator(v_object) : ((document.NIL != word_p(v_object)) ? iteration.new_null_iterator() : Errors.error((SubLObject)document.$str215$can_t_create_sentence_iterator_fo, v_object))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 63624L)
    public static SubLObject new_document_sentence_iterator(final SubLObject doc) {
        SubLObject sentences = (SubLObject)document.NIL;
        final SubLObject vector_var = document_paragraphs(doc);
        final SubLObject backwardP_var = (SubLObject)document.NIL;
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
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
            element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            vector_var_$36 = paragraph_sentences(paragraph);
            backwardP_var_$37 = (SubLObject)document.NIL;
            for (length_$38 = Sequences.length(vector_var_$36), v_iteration_$39 = (SubLObject)document.NIL, v_iteration_$39 = (SubLObject)document.ZERO_INTEGER; v_iteration_$39.numL(length_$38); v_iteration_$39 = Numbers.add(v_iteration_$39, (SubLObject)document.ONE_INTEGER)) {
                element_num_$40 = ((document.NIL != backwardP_var_$37) ? Numbers.subtract(length_$38, v_iteration_$39, (SubLObject)document.ONE_INTEGER) : v_iteration_$39);
                s = Vectors.aref(vector_var_$36, element_num_$40);
                sentences = (SubLObject)ConsesLow.cons(s, sentences);
            }
        }
        return iteration.new_list_iterator(Sequences.nreverse(sentences));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 63819L)
    public static SubLObject new_paragraph_sentence_iterator(final SubLObject par) {
        return iteration.new_vector_iterator(paragraph_sentences(par));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 63931L)
    public static SubLObject new_sentence_sentence_iterator(final SubLObject sen) {
        return iteration.new_singleton_iterator(sen);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 64023L)
    public static SubLObject stream_stringify(final SubLObject in_stream) {
        assert document.NIL != streams_high.input_stream_p(in_stream) : in_stream;
        final SubLObject length = streams_high.file_length(in_stream);
        final SubLObject string = Strings.make_string(length, (SubLObject)document.UNPROVIDED);
        SubLObject i;
        SubLObject v_char;
        for (i = (SubLObject)document.NIL, i = (SubLObject)document.ZERO_INTEGER; i.numL(length); i = Numbers.add(i, (SubLObject)document.ONE_INTEGER)) {
            v_char = streams_high.read_char(in_stream, (SubLObject)document.NIL, (SubLObject)document.$kw216$EOF, (SubLObject)document.UNPROVIDED);
            if (v_char == document.$kw216$EOF) {
                return string_utilities.substring(string, (SubLObject)document.ZERO_INTEGER, i);
            }
            Strings.set_char(string, i, v_char);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 64435L)
    public static SubLObject alphanumeric_char_or_character_code_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(document.NIL != string_utilities.alphanumeric_char_p(obj) || document.NIL != latin_alphabetic_character_code_p(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 64774L)
    public static SubLObject alphabetic_char_or_character_code_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(document.NIL != string_utilities.alphabetic_char_p(obj) || document.NIL != latin_alphabetic_character_code_p(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 64917L)
    public static SubLObject latin_alphabetic_character_code_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isInteger() && document.NIL == subl_promotions.memberP(obj, (SubLObject)document.$list217, (SubLObject)document.UNPROVIDED, (SubLObject)document.UNPROVIDED) && obj.numGE((SubLObject)document.$int218$192) && obj.numLE((SubLObject)document.$int219$591));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 65089L)
    public static SubLObject character_or_character_code_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isChar() || obj.isInteger());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 78511L)
    public static SubLObject sentencifier_initializedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return document.$sentencifier_patterns$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 78620L)
    public static SubLObject initialize_sentencifier() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        finalize_sentencifier();
        document.$sentencifier_patterns$.setDynamicValue(ConsesLow.append(new SubLObject[] { compile_regular_expression_substitutions(document.$mark_eos_regular_expressions$.getDynamicValue(thread)), compile_regular_expression_substitutions(document.$remove_false_eos_regular_expressions1$.getDynamicValue(thread)), compile_regular_expression_substitutions(generate_abbreviation_regular_expressions()), compile_regular_expression_substitutions(document.$remove_false_eos_regular_expressions2$.getDynamicValue(thread)), compile_regular_expression_substitutions(document.$split_unsplit_stuff_regular_expressions$.getDynamicValue(thread)) }), thread);
        return Sequences.length(document.$sentencifier_patterns$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 79376L)
    public static SubLObject finalize_sentencifier() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject count = Sequences.length(document.$sentencifier_patterns$.getDynamicValue(thread));
        SubLObject cdolist_list_var = document.$sentencifier_patterns$.getDynamicValue(thread);
        SubLObject patternXsubstitution = (SubLObject)document.NIL;
        patternXsubstitution = cdolist_list_var.first();
        while (document.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = patternXsubstitution;
            SubLObject pattern = (SubLObject)document.NIL;
            SubLObject substitution = (SubLObject)document.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list529);
            pattern = current.first();
            current = (substitution = current.rest());
            if (document.NIL != regular_expressions.regex_pattern_p(pattern)) {
                regular_expressions.discard_regular_expression_pattern(pattern);
            }
            else {
                Errors.warn((SubLObject)document.$str530$Can_t_finalize__a__not_a_regular_, pattern);
            }
            cdolist_list_var = cdolist_list_var.rest();
            patternXsubstitution = cdolist_list_var.first();
        }
        document.$sentencifier_patterns$.setDynamicValue((SubLObject)document.NIL, thread);
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 79982L)
    public static SubLObject sentencify_string(final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert document.NIL != Types.stringp(text) : text;
        if (document.NIL == sentencifier_initializedP()) {
            initialize_sentencifier();
        }
        SubLObject processed = text;
        SubLObject cdolist_list_var = document.$sentencifier_patterns$.getDynamicValue(thread);
        SubLObject patternXsubstitution = (SubLObject)document.NIL;
        patternXsubstitution = cdolist_list_var.first();
        while (document.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = patternXsubstitution;
            SubLObject pattern = (SubLObject)document.NIL;
            SubLObject substitution = (SubLObject)document.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list529);
            pattern = current.first();
            current = (substitution = current.rest());
            processed = regular_expression_utilities.regex_subst(pattern, substitution, processed, (SubLObject)document.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            patternXsubstitution = cdolist_list_var.first();
        }
        return clean_sentences(string_utilities.split_string(processed, (SubLObject)ConsesLow.list(document.$eos_char$.getDynamicValue(thread))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 80605L)
    public static SubLObject sentencify_file(final SubLObject path) {
        return sentencify_string(file_utilities.slurp_file(path));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 80801L)
    public static SubLObject generate_abbreviation_regular_expressions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_regular_expressions = (SubLObject)document.NIL;
        SubLObject cdolist_list_var = document.$abbreviations$.getDynamicValue(thread);
        SubLObject abrv = (SubLObject)document.NIL;
        abrv = cdolist_list_var.first();
        while (document.NIL != cdolist_list_var) {
            v_regular_expressions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(Sequences.cconcatenate((SubLObject)document.$str532$__b, new SubLObject[] { format_nil.format_nil_a_no_copy(abrv), format_nil.format_nil_a_no_copy(document.$pap$.getDynamicValue(thread)), document.$str505$_s_, format_nil.format_nil_a_no_copy(document.$eos$.getDynamicValue(thread)) }), (SubLObject)document.$str506$_1, (SubLObject)document.$list527), v_regular_expressions);
            cdolist_list_var = cdolist_list_var.rest();
            abrv = cdolist_list_var.first();
        }
        return v_regular_expressions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 81104L)
    public static SubLObject compile_regular_expression_substitutions(final SubLObject regular_expression_substitutions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pattern_substitutions = (SubLObject)document.NIL;
        SubLObject cdolist_list_var = regular_expression_substitutions;
        SubLObject regexXsubstitution = (SubLObject)document.NIL;
        regexXsubstitution = cdolist_list_var.first();
        while (document.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = regexXsubstitution;
            SubLObject re = (SubLObject)document.NIL;
            SubLObject substitution = (SubLObject)document.NIL;
            SubLObject options = (SubLObject)document.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list533);
            re = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list533);
            substitution = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)document.$list533);
            options = current.first();
            current = current.rest();
            if (document.NIL == current) {
                thread.resetMultipleValues();
                final SubLObject pattern = regular_expressions.compile_regular_expression(re, options);
                final SubLObject dummy1 = thread.secondMultipleValue();
                final SubLObject dummy2 = thread.thirdMultipleValue();
                final SubLObject error = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (document.NIL != pattern) {
                    pattern_substitutions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(pattern, substitution), pattern_substitutions);
                }
                else {
                    Errors.error((SubLObject)document.$str534$Can_t_compile_regular_expression_, re, error);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)document.$list533);
            }
            cdolist_list_var = cdolist_list_var.rest();
            regexXsubstitution = cdolist_list_var.first();
        }
        return Sequences.nreverse(pattern_substitutions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 81872L)
    public static SubLObject clean_sentences(final SubLObject sentences) {
        SubLObject result = (SubLObject)document.NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = (SubLObject)document.NIL;
        sentence = cdolist_list_var.first();
        while (document.NIL != cdolist_list_var) {
            final SubLObject trimmed = string_utilities.trim_whitespace(sentence);
            if (document.NIL != string_utilities.non_empty_stringP(trimmed)) {
                result = (SubLObject)ConsesLow.cons(trimmed, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 82116L)
    public static SubLObject document_sentence_countE(final SubLObject v_document, final SubLObject count) {
        SubLObject sentence_count = (SubLObject)document.ZERO_INTEGER;
        final SubLObject vector_var = document_paragraphs(v_document);
        final SubLObject backwardP_var = (SubLObject)document.NIL;
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
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)document.NIL, v_iteration = (SubLObject)document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)document.ONE_INTEGER)) {
            element_num = ((document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)document.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            vector_var_$41 = paragraph_sentences(paragraph);
            backwardP_var_$42 = (SubLObject)document.NIL;
            for (length_$43 = Sequences.length(vector_var_$41), v_iteration_$44 = (SubLObject)document.NIL, v_iteration_$44 = (SubLObject)document.ZERO_INTEGER; v_iteration_$44.numL(length_$43); v_iteration_$44 = Numbers.add(v_iteration_$44, (SubLObject)document.ONE_INTEGER)) {
                element_num_$45 = ((document.NIL != backwardP_var_$42) ? Numbers.subtract(length_$43, v_iteration_$44, (SubLObject)document.ONE_INTEGER) : v_iteration_$44);
                s = Vectors.aref(vector_var_$41, element_num_$45);
                sentence_count = Numbers.add(sentence_count, (SubLObject)document.ONE_INTEGER);
            }
        }
        return Equality.eq(sentence_count, count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/document.lisp", position = 82595L)
    public static SubLObject test_construct_string_from_words(final SubLObject form, SubLObject standardizeP) {
        if (standardizeP == document.UNPROVIDED) {
            standardizeP = (SubLObject)document.NIL;
        }
        return construct_string_from_words(Eval.eval(form), standardizeP, (SubLObject)document.UNPROVIDED);
    }
    
    public static SubLObject declare_document_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sign_print_function_trampoline", "SIGN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sign_p", "SIGN-P", 1, 0, false);
        new $sign_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sign_string", "SIGN-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sign_type", "SIGN-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sign_info", "SIGN-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sign_category", "SIGN-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sign_constituents", "SIGN-CONSTITUENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sign_offset", "SIGN-OFFSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sign_mother", "SIGN-MOTHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "_csetf_sign_string", "_CSETF-SIGN-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "_csetf_sign_type", "_CSETF-SIGN-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "_csetf_sign_info", "_CSETF-SIGN-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "_csetf_sign_category", "_CSETF-SIGN-CATEGORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "_csetf_sign_constituents", "_CSETF-SIGN-CONSTITUENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "_csetf_sign_offset", "_CSETF-SIGN-OFFSET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "_csetf_sign_mother", "_CSETF-SIGN-MOTHER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "make_sign", "MAKE-SIGN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "visit_defstruct_sign", "VISIT-DEFSTRUCT-SIGN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "visit_defstruct_object_sign_method", "VISIT-DEFSTRUCT-OBJECT-SIGN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "new_sign", "NEW-SIGN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sxhash_sign", "SXHASH-SIGN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sxhash_sign_method", "SXHASH-SIGN-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sign_print", "SIGN-PRINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sign_get", "SIGN-GET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sign_set", "SIGN-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sign_length", "SIGN-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sign_update", "SIGN-UPDATE", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.document", "sign_do_constituents", "SIGN-DO-CONSTITUENTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sign_yield", "SIGN-YIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sign_intervals", "SIGN-INTERVALS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "new_exhaustive_word", "NEW-EXHAUSTIVE-WORD", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "new_exhaustive_word_from_word", "NEW-EXHAUSTIVE-WORD-FROM-WORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "exhaustive_word_p", "EXHAUSTIVE-WORD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "new_word", "NEW-WORD", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "copy_word", "COPY-WORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "word_p", "WORD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "set_word_string", "SET-WORD-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "word_string", "WORD-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "set_word_category", "SET-WORD-CATEGORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "word_category", "WORD-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "word_offset", "WORD-OFFSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "word_length", "WORD-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "word_mother", "WORD-MOTHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "word_info", "WORD-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "word_constituents", "WORD-CONSTITUENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "word_interps", "WORD-INTERPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "word_lex_entries", "WORD-LEX-ENTRIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "word_cycls", "WORD-CYCLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "word_cyc_pos", "WORD-CYC-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "word_update", "WORD-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "word_index", "WORD-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "word_intervals", "WORD-INTERVALS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "word_capitalize", "WORD-CAPITALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "word_uncapitalize", "WORD-UNCAPITALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "build_word_token", "BUILD-WORD-TOKEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "stringify", "STRINGIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "no_space_before_following_wordP", "NO-SPACE-BEFORE-FOLLOWING-WORD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "next_word_offset", "NEXT-WORD-OFFSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "string_tokenize_via_wordify", "STRING-TOKENIZE-VIA-WORDIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "string_wordify", "STRING-WORDIFY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "fst_string_wordify", "FST-STRING-WORDIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "rkf_standard_string_wordify", "RKF-STANDARD-STRING-WORDIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "clear_html_string_wordify_punctuation_chars", "CLEAR-HTML-STRING-WORDIFY-PUNCTUATION-CHARS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "remove_html_string_wordify_punctuation_chars", "REMOVE-HTML-STRING-WORDIFY-PUNCTUATION-CHARS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "html_string_wordify_punctuation_chars_internal", "HTML-STRING-WORDIFY-PUNCTUATION-CHARS-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "html_string_wordify_punctuation_chars", "HTML-STRING-WORDIFY-PUNCTUATION-CHARS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "html_string_wordify_state_print_function_trampoline", "HTML-STRING-WORDIFY-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "html_string_wordify_state_p", "HTML-STRING-WORDIFY-STATE-P", 1, 0, false);
        new $html_string_wordify_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "hsw_state_state", "HSW-STATE-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "hsw_state_tag_pieces", "HSW-STATE-TAG-PIECES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "hsw_state_string_pieces", "HSW-STATE-STRING-PIECES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "hsw_state_punctuation_pieces", "HSW-STATE-PUNCTUATION-PIECES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "hsw_state_leading_tags", "HSW-STATE-LEADING-TAGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "hsw_state_following_tags", "HSW-STATE-FOLLOWING-TAGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "hsw_state_current_offset", "HSW-STATE-CURRENT-OFFSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "_csetf_hsw_state_state", "_CSETF-HSW-STATE-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "_csetf_hsw_state_tag_pieces", "_CSETF-HSW-STATE-TAG-PIECES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "_csetf_hsw_state_string_pieces", "_CSETF-HSW-STATE-STRING-PIECES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "_csetf_hsw_state_punctuation_pieces", "_CSETF-HSW-STATE-PUNCTUATION-PIECES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "_csetf_hsw_state_leading_tags", "_CSETF-HSW-STATE-LEADING-TAGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "_csetf_hsw_state_following_tags", "_CSETF-HSW-STATE-FOLLOWING-TAGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "_csetf_hsw_state_current_offset", "_CSETF-HSW-STATE-CURRENT-OFFSET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "make_html_string_wordify_state", "MAKE-HTML-STRING-WORDIFY-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "visit_defstruct_html_string_wordify_state", "VISIT-DEFSTRUCT-HTML-STRING-WORDIFY-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "visit_defstruct_object_html_string_wordify_state_method", "VISIT-DEFSTRUCT-OBJECT-HTML-STRING-WORDIFY-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "print_hsw_state", "PRINT-HSW-STATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "new_html_string_wordify_state", "NEW-HTML-STRING-WORDIFY-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "classify_html_string_token", "CLASSIFY-HTML-STRING-TOKEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "html_string_wordify", "HTML-STRING-WORDIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "hsw_peek_next_token", "HSW-PEEK-NEXT-TOKEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "hsw_state_add_string_piece", "HSW-STATE-ADD-STRING-PIECE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "hsw_state_clear_string_pieces", "HSW-STATE-CLEAR-STRING-PIECES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "tag_from_hsw_state", "TAG-FROM-HSW-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "new_word_from_hsw_state", "NEW-WORD-FROM-HSW-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "fst_wordify_test", "FST-WORDIFY-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "string_to_xml", "STRING-TO-XML", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "word_to_xml", "WORD-TO-XML", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "end_of_sentence_word_p", "END-OF-SENTENCE-WORD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "quote_word_p", "QUOTE-WORD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "newline_word_p", "NEWLINE-WORD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "punctuation_sign_p", "PUNCTUATION-SIGN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentence_final_punctuation_charP", "SENTENCE-FINAL-PUNCTUATION-CHAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentence_internal_punctuation_charP", "SENTENCE-INTERNAL-PUNCTUATION-CHAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "any_punctuation_charP", "ANY-PUNCTUATION-CHAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "quote_charP", "QUOTE-CHAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "new_phrase", "NEW-PHRASE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "phrase_p", "PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "phrase_string", "PHRASE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "phrase_category", "PHRASE-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "phrase_yield", "PHRASE-YIELD", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.document", "phrase_do_constituents", "PHRASE-DO-CONSTITUENTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "phrase_constituents", "PHRASE-CONSTITUENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "phrase_nodes", "PHRASE-NODES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "phrase_intervals", "PHRASE-INTERVALS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "phrase_info", "PHRASE-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "phrase_update", "PHRASE-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "phrase_get", "PHRASE-GET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "phrase_set", "PHRASE-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "phrase_constituent_length", "PHRASE-CONSTITUENT-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "phrase_to_xml", "PHRASE-TO-XML", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.document", "sentence_do_words", "SENTENCE-DO-WORDS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.document", "sentence_do_minimal_words", "SENTENCE-DO-MINIMAL-WORDS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "new_sentence", "NEW-SENTENCE", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentence_p", "SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentence_print", "SENTENCE-PRINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentence_string", "SENTENCE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentence_category", "SENTENCE-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentence_yield", "SENTENCE-YIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentence_yield_exhaustive", "SENTENCE-YIELD-EXHAUSTIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentence_constituents", "SENTENCE-CONSTITUENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentence_info", "SENTENCE-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentence_offset", "SENTENCE-OFFSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentence_index", "SENTENCE-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentence_get", "SENTENCE-GET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentence_mother", "SENTENCE-MOTHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentence_set", "SENTENCE-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentence_length", "SENTENCE-LENGTH", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.document", "sentence_do_constituents", "SENTENCE-DO-CONSTITUENTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentence_reconstruct_substring", "SENTENCE-RECONSTRUCT-SUBSTRING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "construct_string_from_words", "CONSTRUCT-STRING-FROM-WORDS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentence_delete_punctuation", "SENTENCE-DELETE-PUNCTUATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentence_listify", "SENTENCE-LISTIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentence_stringify", "SENTENCE-STRINGIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "build_sentence_token", "BUILD-SENTENCE-TOKEN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "string_sentencify", "STRING-SENTENCIFY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "newline_sentence_p", "NEWLINE-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "paragraph_print_function_trampoline", "PARAGRAPH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "paragraph_p", "PARAGRAPH-P", 1, 0, false);
        new $paragraph_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "paragraph_sentences", "PARAGRAPH-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "paragraph_mother", "PARAGRAPH-MOTHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "_csetf_paragraph_sentences", "_CSETF-PARAGRAPH-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "_csetf_paragraph_mother", "_CSETF-PARAGRAPH-MOTHER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "make_paragraph", "MAKE-PARAGRAPH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "visit_defstruct_paragraph", "VISIT-DEFSTRUCT-PARAGRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "visit_defstruct_object_paragraph_method", "VISIT-DEFSTRUCT-OBJECT-PARAGRAPH-METHOD", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.document", "paragraph_do_sentences", "PARAGRAPH-DO-SENTENCES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.document", "paragraph_do_words", "PARAGRAPH-DO-WORDS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.document", "paragraph_do_minimal_words", "PARAGRAPH-DO-MINIMAL-WORDS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "new_paragraph", "NEW-PARAGRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "paragraph_print", "PARAGRAPH-PRINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "paragraph_get", "PARAGRAPH-GET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "paragraph_set", "PARAGRAPH-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "paragraph_sentence_length", "PARAGRAPH-SENTENCE-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "paragraph_word_length", "PARAGRAPH-WORD-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "paragraph_offset", "PARAGRAPH-OFFSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "paragraph_string", "PARAGRAPH-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "paragraph_to_xml", "PARAGRAPH-TO-XML", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "build_paragraph_token", "BUILD-PARAGRAPH-TOKEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "string_paragraphize", "STRING-PARAGRAPHIZE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sign_to_xml", "SIGN-TO-XML", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "document_print_function_trampoline", "DOCUMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "document_p", "DOCUMENT-P", 1, 0, false);
        new $document_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "document_paragraphs", "DOCUMENT-PARAGRAPHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "_csetf_document_paragraphs", "_CSETF-DOCUMENT-PARAGRAPHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "make_document", "MAKE-DOCUMENT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "visit_defstruct_document", "VISIT-DEFSTRUCT-DOCUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "visit_defstruct_object_document_method", "VISIT-DEFSTRUCT-OBJECT-DOCUMENT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "new_document", "NEW-DOCUMENT", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.document", "document_do_paragraphs", "DOCUMENT-DO-PARAGRAPHS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.document", "document_do_sentences", "DOCUMENT-DO-SENTENCES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "possibly_perform_document_dot_analysis", "POSSIBLY-PERFORM-DOCUMENT-DOT-ANALYSIS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "document_perform_dot_analysis", "DOCUMENT-PERFORM-DOT-ANALYSIS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "new_document_from_string", "NEW-DOCUMENT-FROM-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "new_document_from_file", "NEW-DOCUMENT-FROM-FILE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "new_document_from_stream", "NEW-DOCUMENT-FROM-STREAM", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "document_print", "DOCUMENT-PRINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "document_get", "DOCUMENT-GET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "document_set", "DOCUMENT-SET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "document_get_sentence", "DOCUMENT-GET-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "document_get_word", "DOCUMENT-GET-WORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "document_to_xml", "DOCUMENT-TO-XML", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "document_paragraph_length", "DOCUMENT-PARAGRAPH-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "document_sentence_length", "DOCUMENT-SENTENCE-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "document_word_length", "DOCUMENT-WORD-LENGTH", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.document", "document_do_minimal_words", "DOCUMENT-DO-MINIMAL-WORDS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.document", "document_do_words", "DOCUMENT-DO-WORDS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "document_string", "DOCUMENT-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "new_sentence_iterator", "NEW-SENTENCE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "new_document_sentence_iterator", "NEW-DOCUMENT-SENTENCE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "new_paragraph_sentence_iterator", "NEW-PARAGRAPH-SENTENCE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "new_sentence_sentence_iterator", "NEW-SENTENCE-SENTENCE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "stream_stringify", "STREAM-STRINGIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "alphanumeric_char_or_character_code_p", "ALPHANUMERIC-CHAR-OR-CHARACTER-CODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "alphabetic_char_or_character_code_p", "ALPHABETIC-CHAR-OR-CHARACTER-CODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "latin_alphabetic_character_code_p", "LATIN-ALPHABETIC-CHARACTER-CODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "character_or_character_code_p", "CHARACTER-OR-CHARACTER-CODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentencifier_initializedP", "SENTENCIFIER-INITIALIZED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "initialize_sentencifier", "INITIALIZE-SENTENCIFIER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "finalize_sentencifier", "FINALIZE-SENTENCIFIER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentencify_string", "SENTENCIFY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "sentencify_file", "SENTENCIFY-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "generate_abbreviation_regular_expressions", "GENERATE-ABBREVIATION-REGULAR-EXPRESSIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "compile_regular_expression_substitutions", "COMPILE-REGULAR-EXPRESSION-SUBSTITUTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "clean_sentences", "CLEAN-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "document_sentence_countE", "DOCUMENT-SENTENCE-COUNT=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.document", "test_construct_string_from_words", "TEST-CONSTRUCT-STRING-FROM-WORDS", 1, 1, false);
        return (SubLObject)document.NIL;
    }
    
    public static SubLObject init_document_file() {
        document.$text_class_print_length$ = SubLFiles.defparameter("*TEXT-CLASS-PRINT-LENGTH*", (SubLObject)document.TEN_INTEGER);
        document.$xml_indent_level$ = SubLFiles.defconstant("*XML-INDENT-LEVEL*", (SubLObject)document.THREE_INTEGER);
        document.$xml_indent$ = SubLFiles.defconstant("*XML-INDENT*", Strings.make_string(document.$xml_indent_level$.getGlobalValue(), (SubLObject)Characters.CHAR_space));
        document.$newline$ = SubLFiles.defconstant("*NEWLINE*", Strings.make_string((SubLObject)document.ONE_INTEGER, (SubLObject)Characters.CHAR_newline));
        document.$xml_string_mapping$ = SubLFiles.defconstant("*XML-STRING-MAPPING*", (SubLObject)document.$list0);
        document.$dtp_sign$ = SubLFiles.defconstant("*DTP-SIGN*", (SubLObject)document.$sym1$SIGN);
        document.$wordifier$ = SubLFiles.defparameter("*WORDIFIER*", (SubLObject)document.$sym68$RKF_STANDARD_STRING_WORDIFY);
        document.$fst_string_wordify_lock$ = SubLFiles.deflexical("*FST-STRING-WORDIFY-LOCK*", Locks.make_lock((SubLObject)document.$str69$fst_string_wordify_lock));
        document.$html_string_wordify_punctuation_chars_caching_state$ = SubLFiles.deflexical("*HTML-STRING-WORDIFY-PUNCTUATION-CHARS-CACHING-STATE*", (SubLObject)document.NIL);
        document.$dtp_html_string_wordify_state$ = SubLFiles.defconstant("*DTP-HTML-STRING-WORDIFY-STATE*", (SubLObject)document.$sym78$HTML_STRING_WORDIFY_STATE);
        document.$dtp_paragraph$ = SubLFiles.defconstant("*DTP-PARAGRAPH*", (SubLObject)document.$sym157$PARAGRAPH);
        document.$dtp_document$ = SubLFiles.defconstant("*DTP-DOCUMENT*", (SubLObject)document.$sym183$DOCUMENT);
        document.$perform_dot_analysis_on_docs$ = SubLFiles.defparameter("*PERFORM-DOT-ANALYSIS-ON-DOCS*", (SubLObject)document.NIL);
        document.$wordifier_fst$ = SubLFiles.defparameter("*WORDIFIER-FST*", finite_state_transducer.new_finite_state_transducer((SubLObject)document.ZERO_INTEGER, (SubLObject)document.$list220, (SubLObject)ConsesLow.list(new SubLObject[] { document.$list221, ConsesLow.listS((SubLObject)document.ZERO_INTEGER, Symbols.symbol_function((SubLObject)document.$sym222$WHITESPACEP), (SubLObject)document.$list223), document.$list224, document.$list225, document.$list226, document.$list227, document.$list228, document.$list229, document.$list230, document.$list231, document.$list232, document.$list233, ConsesLow.listS((SubLObject)document.ZERO_INTEGER, Symbols.symbol_function((SubLObject)document.$sym234$ALPHABETIC_CHAR_OR_CHARACTER_CODE_P), (SubLObject)document.$list235), ConsesLow.listS((SubLObject)document.ZERO_INTEGER, Symbols.symbol_function((SubLObject)document.$sym236$ISA_DIGIT_CHAR_), (SubLObject)document.$list237), document.$list238, document.$list239, document.$list240, document.$list241, ConsesLow.listS((SubLObject)document.ZERO_INTEGER, Symbols.symbol_function((SubLObject)document.$sym242$ANY_PUNCTUATION_CHAR_), (SubLObject)document.$list243), ConsesLow.listS((SubLObject)document.ZERO_INTEGER, Symbols.symbol_function((SubLObject)document.$sym244$SENTENCE_INTERNAL_PUNCTUATION_CHAR_), (SubLObject)document.$list235), ConsesLow.listS((SubLObject)document.ZERO_INTEGER, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list243), ConsesLow.listS((SubLObject)document.ONE_INTEGER, Symbols.symbol_function((SubLObject)document.$sym246$UPPER_CASE_CHAR_P), (SubLObject)document.$list247), ConsesLow.listS((SubLObject)document.ONE_INTEGER, Symbols.symbol_function((SubLObject)document.$sym248$ALPHANUMERIC_CHAR_OR_CHARACTER_CODE_P), (SubLObject)document.$list235), document.$list249, document.$list250, ConsesLow.listS((SubLObject)document.ONE_INTEGER, Symbols.symbol_function((SubLObject)document.$sym222$WHITESPACEP), (SubLObject)document.$list251), document.$list252, ConsesLow.listS((SubLObject)document.ONE_INTEGER, Symbols.symbol_function((SubLObject)document.$sym242$ANY_PUNCTUATION_CHAR_), (SubLObject)document.$list253), ConsesLow.listS((SubLObject)document.ONE_INTEGER, Symbols.symbol_function((SubLObject)document.$sym254$QUOTE_CHAR_), (SubLObject)document.$list253), document.$list255, ConsesLow.listS((SubLObject)document.ONE_INTEGER, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list253), ConsesLow.listS((SubLObject)document.THREE_INTEGER, Symbols.symbol_function((SubLObject)document.$sym248$ALPHANUMERIC_CHAR_OR_CHARACTER_CODE_P), (SubLObject)document.$list256), document.$list257, ConsesLow.listS((SubLObject)document.THREE_INTEGER, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list258), ConsesLow.listS((SubLObject)document.FOUR_INTEGER, Symbols.symbol_function((SubLObject)document.$sym246$UPPER_CASE_CHAR_P), (SubLObject)document.$list259), ConsesLow.listS((SubLObject)document.FOUR_INTEGER, Symbols.symbol_function((SubLObject)document.$sym260$LOWER_CASE_CHAR_P), (SubLObject)document.$list261), document.$list262, ConsesLow.listS((SubLObject)document.FOUR_INTEGER, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list258), ConsesLow.listS((SubLObject)document.FIVE_INTEGER, Symbols.symbol_function((SubLObject)document.$sym263$SENTENCE_FINAL_PUNCTUATION_CHAR_), (SubLObject)document.$list235), document.$list264, ConsesLow.listS((SubLObject)document.SIX_INTEGER, Symbols.symbol_function((SubLObject)document.$sym263$SENTENCE_FINAL_PUNCTUATION_CHAR_), (SubLObject)document.$list243), document.$list265, document.$list266, ConsesLow.listS((SubLObject)document.EIGHT_INTEGER, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list267), document.$list268, document.$list269, document.$list270, ConsesLow.listS((SubLObject)document.NINE_INTEGER, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list253), document.$list271, ConsesLow.listS((SubLObject)document.TEN_INTEGER, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list235), document.$list272, document.$list273, ConsesLow.listS((SubLObject)document.ELEVEN_INTEGER, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list275, document.$list276, document.$list277, ConsesLow.listS((SubLObject)document.TWELVE_INTEGER, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list278, document.$list279, ConsesLow.listS((SubLObject)document.THIRTEEN_INTEGER, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list280, document.$list281, document.$list282, document.$list283, ConsesLow.listS((SubLObject)document.FOURTEEN_INTEGER, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list284, document.$list285, ConsesLow.listS((SubLObject)document.FIFTEEN_INTEGER, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list286, document.$list287, ConsesLow.listS((SubLObject)document.SIXTEEN_INTEGER, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list288, document.$list289, ConsesLow.listS((SubLObject)document.SEVENTEEN_INTEGER, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list290, document.$list291, ConsesLow.listS((SubLObject)document.EIGHTEEN_INTEGER, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list292, document.$list293, ConsesLow.listS((SubLObject)document.NINETEEN_INTEGER, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list294, document.$list295, document.$list296, document.$list297, document.$list298, document.$list299, document.$list300, document.$list301, ConsesLow.listS((SubLObject)document.TWENTY_INTEGER, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list253), document.$list302, document.$list303, ConsesLow.listS((SubLObject)document.$int304$21, Symbols.symbol_function((SubLObject)document.$sym222$WHITESPACEP), (SubLObject)document.$list251), ConsesLow.listS((SubLObject)document.$int304$21, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list235), document.$list305, document.$list306, ConsesLow.listS((SubLObject)document.$int307$22, Symbols.symbol_function((SubLObject)document.$sym222$WHITESPACEP), (SubLObject)document.$list251), ConsesLow.listS((SubLObject)document.$int307$22, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list235), document.$list308, document.$list309, ConsesLow.listS((SubLObject)document.$int310$23, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list235), document.$list311, document.$list312, ConsesLow.listS((SubLObject)document.$int313$24, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list314, document.$list315, document.$list316, ConsesLow.listS((SubLObject)document.$int317$25, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list318, document.$list319, ConsesLow.listS((SubLObject)document.$int320$26, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list321, document.$list322, ConsesLow.listS((SubLObject)document.$int323$27, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list324), document.$list325, document.$list326, ConsesLow.listS((SubLObject)document.$int327$28, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list328), document.$list329, ConsesLow.listS((SubLObject)document.$int330$29, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list243), document.$list294, document.$list331, ConsesLow.listS((SubLObject)document.$int332$30, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list333, document.$list334, ConsesLow.listS((SubLObject)document.$int335$31, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list336, document.$list337, document.$list338, document.$list339, ConsesLow.listS((SubLObject)document.$int340$32, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list341, document.$list342, ConsesLow.listS((SubLObject)document.$int343$33, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list344, document.$list345, document.$list346, document.$list347, ConsesLow.listS((SubLObject)document.$int348$34, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list349, document.$list350, ConsesLow.listS((SubLObject)document.$int351$35, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list352, document.$list353, document.$list354, ConsesLow.listS((SubLObject)document.$int355$36, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list356, document.$list357, ConsesLow.listS((SubLObject)document.$int358$37, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list359, document.$list360, ConsesLow.listS((SubLObject)document.$int361$38, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list362, document.$list363, ConsesLow.listS((SubLObject)document.$int364$39, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list365, document.$list366, ConsesLow.listS((SubLObject)document.$int367$40, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list368, document.$list369, ConsesLow.listS((SubLObject)document.$int370$41, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list371, document.$list372, ConsesLow.listS((SubLObject)document.$int373$42, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list374, document.$list375, ConsesLow.listS((SubLObject)document.$int376$43, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list377, ConsesLow.listS((SubLObject)document.$int378$44, Symbols.symbol_function((SubLObject)document.$sym236$ISA_DIGIT_CHAR_), (SubLObject)document.$list237), document.$list379, document.$list380, ConsesLow.listS((SubLObject)document.$int378$44, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list381, ConsesLow.listS((SubLObject)document.$int382$45, Symbols.symbol_function((SubLObject)document.$sym236$ISA_DIGIT_CHAR_), (SubLObject)document.$list383), ConsesLow.listS((SubLObject)document.$int382$45, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list384), document.$list385, document.$list386, ConsesLow.listS((SubLObject)document.$int387$46, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list243), document.$list388, document.$list389, document.$list390, document.$list391, ConsesLow.listS((SubLObject)document.$int392$48, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list274), document.$list393, ConsesLow.listS((SubLObject)document.$int394$49, Symbols.symbol_function((SubLObject)document.$sym236$ISA_DIGIT_CHAR_), (SubLObject)document.$list395), ConsesLow.listS((SubLObject)document.$int394$49, Symbols.symbol_function((SubLObject)document.$sym222$WHITESPACEP), (SubLObject)document.$list259), ConsesLow.listS((SubLObject)document.$int394$49, Symbols.symbol_function((SubLObject)document.$sym254$QUOTE_CHAR_), (SubLObject)document.$list259), ConsesLow.listS((SubLObject)document.$int396$50, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list237), ConsesLow.listS((SubLObject)document.$int397$51, Symbols.symbol_function((SubLObject)document.$sym248$ALPHANUMERIC_CHAR_OR_CHARACTER_CODE_P), (SubLObject)document.$list235), document.$list398, document.$list399, ConsesLow.listS((SubLObject)document.$int397$51, Symbols.symbol_function((SubLObject)document.$sym222$WHITESPACEP), (SubLObject)document.$list251), document.$list400, ConsesLow.listS((SubLObject)document.$int397$51, Symbols.symbol_function((SubLObject)document.$sym242$ANY_PUNCTUATION_CHAR_), (SubLObject)document.$list253), ConsesLow.listS((SubLObject)document.$int397$51, Symbols.symbol_function((SubLObject)document.$sym254$QUOTE_CHAR_), (SubLObject)document.$list253), document.$list401, ConsesLow.listS((SubLObject)document.$int397$51, Symbols.symbol_function((SubLObject)document.$sym245$CHARACTER_OR_CHARACTER_CODE_P), (SubLObject)document.$list253) }), (SubLObject)document.$sym402$BUILD_WORD_TOKEN));
        document.$sentencifier_fst$ = SubLFiles.defparameter("*SENTENCIFIER-FST*", finite_state_transducer.new_finite_state_transducer((SubLObject)document.ZERO_INTEGER, (SubLObject)document.$list220, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.listS((SubLObject)document.ZERO_INTEGER, Symbols.symbol_function((SubLObject)document.$sym403$NEWLINE_WORD_P), (SubLObject)document.$list243), ConsesLow.listS((SubLObject)document.ZERO_INTEGER, Symbols.symbol_function((SubLObject)document.$sym404$END_OF_SENTENCE_WORD_P), (SubLObject)document.$list243), ConsesLow.listS((SubLObject)document.ZERO_INTEGER, Symbols.symbol_function((SubLObject)document.$sym61$WORD_P), (SubLObject)document.$list235), ConsesLow.listS((SubLObject)document.ONE_INTEGER, Symbols.symbol_function((SubLObject)document.$sym403$NEWLINE_WORD_P), (SubLObject)document.$list405), ConsesLow.listS((SubLObject)document.ONE_INTEGER, Symbols.symbol_function((SubLObject)document.$sym404$END_OF_SENTENCE_WORD_P), (SubLObject)document.$list406), ConsesLow.listS((SubLObject)document.ONE_INTEGER, Symbols.symbol_function((SubLObject)document.$sym61$WORD_P), (SubLObject)document.$list235), document.$list255, ConsesLow.listS((SubLObject)document.THREE_INTEGER, Symbols.symbol_function((SubLObject)document.$sym403$NEWLINE_WORD_P), (SubLObject)document.$list259), document.$list407, ConsesLow.listS((SubLObject)document.THREE_INTEGER, Symbols.symbol_function((SubLObject)document.$sym61$WORD_P), (SubLObject)document.$list235), ConsesLow.listS((SubLObject)document.FOUR_INTEGER, Symbols.symbol_function((SubLObject)document.$sym408$QUOTE_WORD_P), (SubLObject)document.$list243), document.$list409, ConsesLow.listS((SubLObject)document.FOUR_INTEGER, Symbols.symbol_function((SubLObject)document.$sym61$WORD_P), (SubLObject)document.$list253) }), (SubLObject)document.$sym410$BUILD_SENTENCE_TOKEN));
        document.$paragraphier_fst$ = SubLFiles.defparameter("*PARAGRAPHIER-FST*", finite_state_transducer.new_finite_state_transducer((SubLObject)document.ZERO_INTEGER, (SubLObject)document.$list220, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.listS((SubLObject)document.ZERO_INTEGER, Symbols.symbol_function((SubLObject)document.$sym411$NEWLINE_SENTENCE_P), (SubLObject)document.$list412), document.$list413, ConsesLow.listS((SubLObject)document.ZERO_INTEGER, Symbols.symbol_function((SubLObject)document.$sym153$SENTENCE_P), (SubLObject)document.$list414), ConsesLow.listS((SubLObject)document.ONE_INTEGER, Symbols.symbol_function((SubLObject)document.$sym411$NEWLINE_SENTENCE_P), (SubLObject)document.$list415), document.$list255, ConsesLow.listS((SubLObject)document.ONE_INTEGER, Symbols.symbol_function((SubLObject)document.$sym153$SENTENCE_P), (SubLObject)document.$list414), ConsesLow.listS((SubLObject)document.THREE_INTEGER, Symbols.symbol_function((SubLObject)document.$sym411$NEWLINE_SENTENCE_P), (SubLObject)document.$list415), document.$list407, ConsesLow.listS((SubLObject)document.THREE_INTEGER, Symbols.symbol_function((SubLObject)document.$sym153$SENTENCE_P), (SubLObject)document.$list253) }), (SubLObject)document.$sym416$BUILD_PARAGRAPH_TOKEN));
        document.$eos_char$ = SubLFiles.defparameter("*EOS-CHAR*", (SubLObject)Characters.CHAR_escape);
        document.$eos$ = SubLFiles.defparameter("*EOS*", PrintLow.format((SubLObject)document.NIL, (SubLObject)document.$str417$_C, document.$eos_char$.getDynamicValue()));
        document.$p$ = SubLFiles.defparameter("*P*", (SubLObject)document.$str418$______);
        document.$ap$ = SubLFiles.defparameter("*AP*", (SubLObject)document.$str419$____________________);
        document.$pap$ = SubLFiles.defparameter("*PAP*", Sequences.cconcatenate(document.$p$.getDynamicValue(), document.$ap$.getDynamicValue()));
        document.$people$ = SubLFiles.defparameter("*PEOPLE*", (SubLObject)document.$list420);
        document.$army$ = SubLFiles.defparameter("*ARMY*", (SubLObject)document.$list421);
        document.$companies$ = SubLFiles.defparameter("*COMPANIES*", (SubLObject)document.$list422);
        document.$places$ = SubLFiles.defparameter("*PLACES*", (SubLObject)ConsesLow.list(new SubLObject[] { document.$str423$arc, document.$str424$al, document.$str425$ave, document.$str426$blv_d, document.$str427$cl, document.$str428$ct, document.$str429$cres, document.$str430$dr, document.$str431$expy_, document.$str432$dist, document.$str433$mt, document.$str434$ft, document.$str435$fw_y, document.$str436$hwa_y, document.$str437$la, document.$str438$pde_, document.$str439$pl, document.$str440$plz, document.$str441$rd, document.$str442$st, document.$str443$tce, document.$str444$Ala, document.$str445$Ariz, document.$str446$Ark, document.$str447$Cal, document.$str448$Calif, document.$str449$Col, document.$str450$Colo, document.$str451$Conn, document.$str452$Del, document.$str453$Fed, document.$str454$Fla, document.$str455$Ga, document.$str456$Ida, document.$str457$Id, document.$str458$Ill, document.$str459$Ind, document.$str460$Ia, document.$str461$Kan, document.$str462$Kans, document.$str463$Ken, document.$str464$Ky, document.$str465$La, document.$str466$Me, document.$str467$Md, document.$str468$Is, document.$str469$Mass, document.$str470$Mich, document.$str471$Minn, document.$str472$Miss, document.$str473$Mo, document.$str474$Mont, document.$str475$Neb, document.$str476$Nebr, document.$str477$Nev, document.$str478$Mex, document.$str479$Okla, document.$str480$Ok, document.$str481$Ore, document.$str482$Penna, document.$str483$Penn, document.$str484$Pa, document.$str485$Dak, document.$str486$Tenn, document.$str487$Tex, document.$str488$Ut, document.$str489$Vt, document.$str490$Va, document.$str491$Wash, document.$str492$Wis, document.$str493$Wisc, document.$str494$Wy, document.$str495$Wyo, document.$str496$USAFA, document.$str497$Alta, document.$str498$Man, document.$str499$Ont, document.$str500$Sask, document.$str501$Yuk }));
        document.$months$ = SubLFiles.defparameter("*MONTHS*", (SubLObject)document.$list502);
        document.$misc$ = SubLFiles.defparameter("*MISC*", (SubLObject)document.$list503);
        document.$abbreviations$ = SubLFiles.defparameter("*ABBREVIATIONS*", ConsesLow.append(new SubLObject[] { document.$people$.getDynamicValue(), document.$army$.getDynamicValue(), document.$companies$.getDynamicValue(), document.$places$.getDynamicValue(), document.$months$.getDynamicValue(), document.$misc$.getDynamicValue() }));
        document.$mark_eos_regular_expressions$ = SubLFiles.defparameter("*MARK-EOS-REGULAR-EXPRESSIONS*", (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)document.$str504$_n_s__n, document.$eos$.getDynamicValue(), (SubLObject)document.NIL), (SubLObject)ConsesLow.list(Sequences.cconcatenate((SubLObject)document.$str41$_, new SubLObject[] { format_nil.format_nil_a_no_copy(document.$pap$.getDynamicValue()), document.$str505$_s_ }), Sequences.cconcatenate((SubLObject)document.$str506$_1, format_nil.format_nil_a_no_copy(document.$eos$.getDynamicValue())), (SubLObject)document.NIL), (SubLObject)ConsesLow.list(Sequences.cconcatenate((SubLObject)document.$str507$__s_w, new SubLObject[] { format_nil.format_nil_a_no_copy(document.$p$.getDynamicValue()), document.$str42$_ }), Sequences.cconcatenate((SubLObject)document.$str506$_1, format_nil.format_nil_a_no_copy(document.$eos$.getDynamicValue())), (SubLObject)document.NIL)));
        document.$remove_false_eos_regular_expressions1$ = SubLFiles.defparameter("*REMOVE-FALSE-EOS-REGULAR-EXPRESSIONS1*", (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Sequences.cconcatenate((SubLObject)document.$str508$_____w__w, new SubLObject[] { format_nil.format_nil_a_no_copy(document.$pap$.getDynamicValue()), document.$str505$_s_, format_nil.format_nil_a_no_copy(document.$eos$.getDynamicValue()) }), (SubLObject)document.$str506$_1, (SubLObject)document.NIL), (SubLObject)ConsesLow.list(Sequences.cconcatenate((SubLObject)document.$str508$_____w__w, new SubLObject[] { format_nil.format_nil_a_no_copy(document.$p$.getDynamicValue()), document.$str42$_, format_nil.format_nil_a_no_copy(document.$eos$.getDynamicValue()) }), (SubLObject)document.$str506$_1, (SubLObject)document.NIL), (SubLObject)ConsesLow.list(Sequences.cconcatenate((SubLObject)document.$str509$__s_w___s__, format_nil.format_nil_a_no_copy(document.$eos$.getDynamicValue())), (SubLObject)document.$str506$_1, (SubLObject)document.NIL), (SubLObject)ConsesLow.list(Sequences.cconcatenate((SubLObject)document.$str510$_________, new SubLObject[] { format_nil.format_nil_a_no_copy(document.$eos$.getDynamicValue()), document.$str511$____lower____ }), (SubLObject)document.$str512$_1_2, (SubLObject)document.NIL), (SubLObject)ConsesLow.list(Sequences.cconcatenate((SubLObject)document.$str513$_____, new SubLObject[] { format_nil.format_nil_a_no_copy(document.$p$.getDynamicValue()), document.$str514$_____s__, format_nil.format_nil_a_no_copy(document.$eos$.getDynamicValue()) }), (SubLObject)document.$str506$_1, (SubLObject)document.NIL)));
        document.$remove_false_eos_regular_expressions2$ = SubLFiles.defparameter("*REMOVE-FALSE-EOS-REGULAR-EXPRESSIONS2*", (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Sequences.cconcatenate((SubLObject)document.$str515$______s__, new SubLObject[] { format_nil.format_nil_a_no_copy(document.$eos$.getDynamicValue()), document.$str516$__s____lower____ }), (SubLObject)document.$str512$_1_2, (SubLObject)document.NIL), (SubLObject)ConsesLow.list(Sequences.cconcatenate((SubLObject)document.$str517$__s___s_, new SubLObject[] { format_nil.format_nil_a_no_copy(document.$eos$.getDynamicValue()), document.$str518$__s__ }), (SubLObject)document.$str512$_1_2, (SubLObject)document.NIL), (SubLObject)ConsesLow.list(Sequences.cconcatenate((SubLObject)document.$str519$__s, new SubLObject[] { format_nil.format_nil_a_no_copy(document.$pap$.getDynamicValue()), document.$str505$_s_, format_nil.format_nil_a_no_copy(document.$eos$.getDynamicValue()) }), (SubLObject)document.$str506$_1, (SubLObject)document.NIL)));
        document.$split_unsplit_stuff_regular_expressions$ = SubLFiles.defparameter("*SPLIT-UNSPLIT-STUFF-REGULAR-EXPRESSIONS*", (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Sequences.cconcatenate((SubLObject)document.$str520$__D_d___, new SubLObject[] { format_nil.format_nil_a_no_copy(document.$p$.getDynamicValue()), document.$str521$___s__ }), Sequences.cconcatenate((SubLObject)document.$str512$_1_2, new SubLObject[] { format_nil.format_nil_a_no_copy(document.$eos$.getDynamicValue()), document.$str522$_3 }), (SubLObject)document.NIL), (SubLObject)ConsesLow.list(Sequences.cconcatenate((SubLObject)document.$str523$___w, new SubLObject[] { format_nil.format_nil_a_no_copy(document.$p$.getDynamicValue()), document.$str524$___s_ }), Sequences.cconcatenate((SubLObject)document.$str506$_1, new SubLObject[] { format_nil.format_nil_a_no_copy(document.$eos$.getDynamicValue()), document.$str525$_2 }), (SubLObject)document.NIL), (SubLObject)ConsesLow.list((SubLObject)document.$str526$__sno_____s______d_, Sequences.cconcatenate((SubLObject)document.$str506$_1, new SubLObject[] { format_nil.format_nil_a_no_copy(document.$eos$.getDynamicValue()), document.$str525$_2 }), (SubLObject)document.$list527), (SubLObject)ConsesLow.list((SubLObject)document.$str528$__ap___m___s______upper____, Sequences.cconcatenate((SubLObject)document.$str506$_1, new SubLObject[] { format_nil.format_nil_a_no_copy(document.$eos$.getDynamicValue()), document.$str525$_2 }), (SubLObject)document.NIL)));
        document.$sentencifier_patterns$ = SubLFiles.defparameter("*SENTENCIFIER-PATTERNS*", (SubLObject)document.NIL);
        return (SubLObject)document.NIL;
    }
    
    public static SubLObject setup_document_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), document.$dtp_sign$.getGlobalValue(), Symbols.symbol_function((SubLObject)document.$sym8$SIGN_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)document.$list9);
        Structures.def_csetf((SubLObject)document.$sym10$SIGN_STRING, (SubLObject)document.$sym11$_CSETF_SIGN_STRING);
        Structures.def_csetf((SubLObject)document.$sym12$SIGN_TYPE, (SubLObject)document.$sym13$_CSETF_SIGN_TYPE);
        Structures.def_csetf((SubLObject)document.$sym14$SIGN_INFO, (SubLObject)document.$sym15$_CSETF_SIGN_INFO);
        Structures.def_csetf((SubLObject)document.$sym16$SIGN_CATEGORY, (SubLObject)document.$sym17$_CSETF_SIGN_CATEGORY);
        Structures.def_csetf((SubLObject)document.$sym18$SIGN_CONSTITUENTS, (SubLObject)document.$sym19$_CSETF_SIGN_CONSTITUENTS);
        Structures.def_csetf((SubLObject)document.$sym20$SIGN_OFFSET, (SubLObject)document.$sym21$_CSETF_SIGN_OFFSET);
        Structures.def_csetf((SubLObject)document.$sym22$SIGN_MOTHER, (SubLObject)document.$sym23$_CSETF_SIGN_MOTHER);
        Equality.identity((SubLObject)document.$sym1$SIGN);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), document.$dtp_sign$.getGlobalValue(), Symbols.symbol_function((SubLObject)document.$sym36$VISIT_DEFSTRUCT_OBJECT_SIGN_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), document.$dtp_sign$.getGlobalValue(), Symbols.symbol_function((SubLObject)document.$sym39$SXHASH_SIGN_METHOD));
        memoization_state.note_globally_cached_function((SubLObject)document.$sym76$HTML_STRING_WORDIFY_PUNCTUATION_CHARS);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), document.$dtp_html_string_wordify_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)document.$sym85$HTML_STRING_WORDIFY_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)document.$list86);
        Structures.def_csetf((SubLObject)document.$sym87$HSW_STATE_STATE, (SubLObject)document.$sym88$_CSETF_HSW_STATE_STATE);
        Structures.def_csetf((SubLObject)document.$sym89$HSW_STATE_TAG_PIECES, (SubLObject)document.$sym90$_CSETF_HSW_STATE_TAG_PIECES);
        Structures.def_csetf((SubLObject)document.$sym91$HSW_STATE_STRING_PIECES, (SubLObject)document.$sym92$_CSETF_HSW_STATE_STRING_PIECES);
        Structures.def_csetf((SubLObject)document.$sym93$HSW_STATE_PUNCTUATION_PIECES, (SubLObject)document.$sym94$_CSETF_HSW_STATE_PUNCTUATION_PIECES);
        Structures.def_csetf((SubLObject)document.$sym95$HSW_STATE_LEADING_TAGS, (SubLObject)document.$sym96$_CSETF_HSW_STATE_LEADING_TAGS);
        Structures.def_csetf((SubLObject)document.$sym97$HSW_STATE_FOLLOWING_TAGS, (SubLObject)document.$sym98$_CSETF_HSW_STATE_FOLLOWING_TAGS);
        Structures.def_csetf((SubLObject)document.$sym99$HSW_STATE_CURRENT_OFFSET, (SubLObject)document.$sym100$_CSETF_HSW_STATE_CURRENT_OFFSET);
        Equality.identity((SubLObject)document.$sym78$HTML_STRING_WORDIFY_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), document.$dtp_html_string_wordify_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)document.$sym109$VISIT_DEFSTRUCT_OBJECT_HTML_STRING_WORDIFY_STATE_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)document.$sym84$PRINT_HSW_STATE);
        utilities_macros.note_funcall_helper_function((SubLObject)document.$sym122$HTML_STRING_WORDIFY);
        generic_testing.define_test_case_table_int((SubLObject)document.$sym124$FST_STRING_WORDIFY, (SubLObject)ConsesLow.list(new SubLObject[] { document.$kw125$TEST, document.$sym126$FST_WORDIFY_TEST, document.$kw127$OWNER, document.NIL, document.$kw128$CLASSES, document.NIL, document.$kw129$KB, document.$kw130$TINY, document.$kw131$WORKING_, document.T }), (SubLObject)document.$list132);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), document.$dtp_paragraph$.getGlobalValue(), Symbols.symbol_function((SubLObject)document.$sym164$PARAGRAPH_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)document.$list165);
        Structures.def_csetf((SubLObject)document.$sym166$PARAGRAPH_SENTENCES, (SubLObject)document.$sym167$_CSETF_PARAGRAPH_SENTENCES);
        Structures.def_csetf((SubLObject)document.$sym168$PARAGRAPH_MOTHER, (SubLObject)document.$sym169$_CSETF_PARAGRAPH_MOTHER);
        Equality.identity((SubLObject)document.$sym157$PARAGRAPH);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), document.$dtp_paragraph$.getGlobalValue(), Symbols.symbol_function((SubLObject)document.$sym172$VISIT_DEFSTRUCT_OBJECT_PARAGRAPH_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), document.$dtp_document$.getGlobalValue(), Symbols.symbol_function((SubLObject)document.$sym190$DOCUMENT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)document.$list191);
        Structures.def_csetf((SubLObject)document.$sym192$DOCUMENT_PARAGRAPHS, (SubLObject)document.$sym193$_CSETF_DOCUMENT_PARAGRAPHS);
        Equality.identity((SubLObject)document.$sym183$DOCUMENT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), document.$dtp_document$.getGlobalValue(), Symbols.symbol_function((SubLObject)document.$sym196$VISIT_DEFSTRUCT_OBJECT_DOCUMENT_METHOD));
        access_macros.register_external_symbol((SubLObject)document.$sym531$SENTENCIFY_STRING);
        generic_testing.define_test_case_table_int((SubLObject)document.$sym535$NEW_DOCUMENT, (SubLObject)ConsesLow.list(new SubLObject[] { document.$kw125$TEST, document.$sym536$DOCUMENT_SENTENCE_COUNT_, document.$kw127$OWNER, document.NIL, document.$kw128$CLASSES, document.NIL, document.$kw129$KB, document.$kw537$FULL, document.$kw131$WORKING_, document.T }), (SubLObject)document.$list538);
        generic_testing.define_test_case_table_int((SubLObject)document.$sym539$TEST_CONSTRUCT_STRING_FROM_WORDS, (SubLObject)ConsesLow.list(new SubLObject[] { document.$kw125$TEST, document.EQUAL, document.$kw127$OWNER, document.NIL, document.$kw128$CLASSES, document.NIL, document.$kw129$KB, document.$kw537$FULL, document.$kw131$WORKING_, document.T }), (SubLObject)document.$list540);
        return (SubLObject)document.NIL;
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
    
    static {
        me = (SubLFile)new document();
        document.$text_class_print_length$ = null;
        document.$xml_indent_level$ = null;
        document.$xml_indent$ = null;
        document.$newline$ = null;
        document.$xml_string_mapping$ = null;
        document.$dtp_sign$ = null;
        document.$wordifier$ = null;
        document.$fst_string_wordify_lock$ = null;
        document.$html_string_wordify_punctuation_chars_caching_state$ = null;
        document.$dtp_html_string_wordify_state$ = null;
        document.$dtp_paragraph$ = null;
        document.$dtp_document$ = null;
        document.$perform_dot_analysis_on_docs$ = null;
        document.$wordifier_fst$ = null;
        document.$sentencifier_fst$ = null;
        document.$paragraphier_fst$ = null;
        document.$eos_char$ = null;
        document.$eos$ = null;
        document.$p$ = null;
        document.$ap$ = null;
        document.$pap$ = null;
        document.$people$ = null;
        document.$army$ = null;
        document.$companies$ = null;
        document.$places$ = null;
        document.$months$ = null;
        document.$misc$ = null;
        document.$abbreviations$ = null;
        document.$mark_eos_regular_expressions$ = null;
        document.$remove_false_eos_regular_expressions1$ = null;
        document.$remove_false_eos_regular_expressions2$ = null;
        document.$split_unsplit_stuff_regular_expressions$ = null;
        document.$sentencifier_patterns$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("<"), (SubLObject)SubLObjectFactory.makeString("&lt;")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("&"), (SubLObject)SubLObjectFactory.makeString("&amp;")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString(">"), (SubLObject)SubLObjectFactory.makeString("&gt;")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("\""), (SubLObject)SubLObjectFactory.makeString("&quot;")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("'"), (SubLObject)SubLObjectFactory.makeString("&apos;")));
        $sym1$SIGN = SubLObjectFactory.makeSymbol("SIGN");
        $sym2$SIGN_P = SubLObjectFactory.makeSymbol("SIGN-P");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("INFO"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTITUENTS"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("INFO"), (SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTITUENTS"), (SubLObject)SubLObjectFactory.makeKeyword("OFFSET"), (SubLObject)SubLObjectFactory.makeKeyword("MOTHER"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIGN-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SIGN-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SIGN-INFO"), (SubLObject)SubLObjectFactory.makeSymbol("SIGN-CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("SIGN-CONSTITUENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SIGN-OFFSET"), (SubLObject)SubLObjectFactory.makeSymbol("SIGN-MOTHER"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SIGN-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SIGN-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SIGN-INFO"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SIGN-CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SIGN-CONSTITUENTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SIGN-OFFSET"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SIGN-MOTHER"));
        $sym7$SIGN_PRINT = SubLObjectFactory.makeSymbol("SIGN-PRINT");
        $sym8$SIGN_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SIGN-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SIGN-P"));
        $sym10$SIGN_STRING = SubLObjectFactory.makeSymbol("SIGN-STRING");
        $sym11$_CSETF_SIGN_STRING = SubLObjectFactory.makeSymbol("_CSETF-SIGN-STRING");
        $sym12$SIGN_TYPE = SubLObjectFactory.makeSymbol("SIGN-TYPE");
        $sym13$_CSETF_SIGN_TYPE = SubLObjectFactory.makeSymbol("_CSETF-SIGN-TYPE");
        $sym14$SIGN_INFO = SubLObjectFactory.makeSymbol("SIGN-INFO");
        $sym15$_CSETF_SIGN_INFO = SubLObjectFactory.makeSymbol("_CSETF-SIGN-INFO");
        $sym16$SIGN_CATEGORY = SubLObjectFactory.makeSymbol("SIGN-CATEGORY");
        $sym17$_CSETF_SIGN_CATEGORY = SubLObjectFactory.makeSymbol("_CSETF-SIGN-CATEGORY");
        $sym18$SIGN_CONSTITUENTS = SubLObjectFactory.makeSymbol("SIGN-CONSTITUENTS");
        $sym19$_CSETF_SIGN_CONSTITUENTS = SubLObjectFactory.makeSymbol("_CSETF-SIGN-CONSTITUENTS");
        $sym20$SIGN_OFFSET = SubLObjectFactory.makeSymbol("SIGN-OFFSET");
        $sym21$_CSETF_SIGN_OFFSET = SubLObjectFactory.makeSymbol("_CSETF-SIGN-OFFSET");
        $sym22$SIGN_MOTHER = SubLObjectFactory.makeSymbol("SIGN-MOTHER");
        $sym23$_CSETF_SIGN_MOTHER = SubLObjectFactory.makeSymbol("_CSETF-SIGN-MOTHER");
        $kw24$STRING = SubLObjectFactory.makeKeyword("STRING");
        $kw25$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw26$INFO = SubLObjectFactory.makeKeyword("INFO");
        $kw27$CATEGORY = SubLObjectFactory.makeKeyword("CATEGORY");
        $kw28$CONSTITUENTS = SubLObjectFactory.makeKeyword("CONSTITUENTS");
        $kw29$OFFSET = SubLObjectFactory.makeKeyword("OFFSET");
        $kw30$MOTHER = SubLObjectFactory.makeKeyword("MOTHER");
        $str31$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw32$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym33$MAKE_SIGN = SubLObjectFactory.makeSymbol("MAKE-SIGN");
        $kw34$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw35$END = SubLObjectFactory.makeKeyword("END");
        $sym36$VISIT_DEFSTRUCT_OBJECT_SIGN_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SIGN-METHOD");
        $kw37$SIGN = SubLObjectFactory.makeKeyword("SIGN");
        $str38$ = SubLObjectFactory.makeString("");
        $sym39$SXHASH_SIGN_METHOD = SubLObjectFactory.makeSymbol("SXHASH-SIGN-METHOD");
        $str40$__ = SubLObjectFactory.makeString("#<");
        $str41$_ = SubLObjectFactory.makeString("(");
        $str42$_ = SubLObjectFactory.makeString(")");
        $str43$__ = SubLObjectFactory.makeString(": ");
        $str44$_ = SubLObjectFactory.makeString("\"");
        $str45$_ = SubLObjectFactory.makeString(" ");
        $str46$____ = SubLObjectFactory.makeString(" ...");
        $str47$_ = SubLObjectFactory.makeString("/");
        $str48$_ = SubLObjectFactory.makeString(">");
        $sym49$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym50$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym51$VECTORP = SubLObjectFactory.makeSymbol("VECTORP");
        $str52$Attempt_to_set_the_non_existing_s = SubLObjectFactory.makeString("Attempt to set the non-existing slot ~a");
        $list53 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTITUENT"), (SubLObject)SubLObjectFactory.makeSymbol("SIGN")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym54$CDOVECTOR = SubLObjectFactory.makeSymbol("CDOVECTOR");
        $sym55$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $kw56$W = SubLObjectFactory.makeKeyword("W");
        $kw57$P = SubLObjectFactory.makeKeyword("P");
        $str58$Unknown_sign_subclass__a = SubLObjectFactory.makeString("Unknown sign subclass ~a");
        $kw59$XW = SubLObjectFactory.makeKeyword("XW");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("W"), (SubLObject)SubLObjectFactory.makeKeyword("XW"));
        $sym61$WORD_P = SubLObjectFactory.makeSymbol("WORD-P");
        $sym62$EXHAUSTIVE_WORD_P = SubLObjectFactory.makeSymbol("EXHAUSTIVE-WORD-P");
        $kw63$INTERPS = SubLObjectFactory.makeKeyword("INTERPS");
        $kw64$LEX_ENTRIES = SubLObjectFactory.makeKeyword("LEX-ENTRIES");
        $kw65$CYC_POS = SubLObjectFactory.makeKeyword("CYC-POS");
        $sym66$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym67$VECTOR = SubLObjectFactory.makeSymbol("VECTOR");
        $sym68$RKF_STANDARD_STRING_WORDIFY = SubLObjectFactory.makeSymbol("RKF-STANDARD-STRING-WORDIFY");
        $str69$fst_string_wordify_lock = SubLObjectFactory.makeString("fst-string-wordify-lock");
        $sym70$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $kw71$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym72$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym73$RKF_CH_STRING_TOKENIZE = SubLObjectFactory.makeSymbol("RKF-CH-STRING-TOKENIZE");
        $sym74$STANDARD_STRING_TOKENIZE = SubLObjectFactory.makeSymbol("STANDARD-STRING-TOKENIZE");
        $sym75$SPLIT_STRING = SubLObjectFactory.makeSymbol("SPLIT-STRING");
        $sym76$HTML_STRING_WORDIFY_PUNCTUATION_CHARS = SubLObjectFactory.makeSymbol("HTML-STRING-WORDIFY-PUNCTUATION-CHARS");
        $sym77$_HTML_STRING_WORDIFY_PUNCTUATION_CHARS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*HTML-STRING-WORDIFY-PUNCTUATION-CHARS-CACHING-STATE*");
        $sym78$HTML_STRING_WORDIFY_STATE = SubLObjectFactory.makeSymbol("HTML-STRING-WORDIFY-STATE");
        $sym79$HTML_STRING_WORDIFY_STATE_P = SubLObjectFactory.makeSymbol("HTML-STRING-WORDIFY-STATE-P");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATE"), (SubLObject)SubLObjectFactory.makeSymbol("TAG-PIECES"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-PIECES"), (SubLObject)SubLObjectFactory.makeSymbol("PUNCTUATION-PIECES"), (SubLObject)SubLObjectFactory.makeSymbol("LEADING-TAGS"), (SubLObject)SubLObjectFactory.makeSymbol("FOLLOWING-TAGS"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-OFFSET"));
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STATE"), (SubLObject)SubLObjectFactory.makeKeyword("TAG-PIECES"), (SubLObject)SubLObjectFactory.makeKeyword("STRING-PIECES"), (SubLObject)SubLObjectFactory.makeKeyword("PUNCTUATION-PIECES"), (SubLObject)SubLObjectFactory.makeKeyword("LEADING-TAGS"), (SubLObject)SubLObjectFactory.makeKeyword("FOLLOWING-TAGS"), (SubLObject)SubLObjectFactory.makeKeyword("CURRENT-OFFSET"));
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HSW-STATE-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("HSW-STATE-TAG-PIECES"), (SubLObject)SubLObjectFactory.makeSymbol("HSW-STATE-STRING-PIECES"), (SubLObject)SubLObjectFactory.makeSymbol("HSW-STATE-PUNCTUATION-PIECES"), (SubLObject)SubLObjectFactory.makeSymbol("HSW-STATE-LEADING-TAGS"), (SubLObject)SubLObjectFactory.makeSymbol("HSW-STATE-FOLLOWING-TAGS"), (SubLObject)SubLObjectFactory.makeSymbol("HSW-STATE-CURRENT-OFFSET"));
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HSW-STATE-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HSW-STATE-TAG-PIECES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HSW-STATE-STRING-PIECES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HSW-STATE-PUNCTUATION-PIECES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HSW-STATE-LEADING-TAGS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HSW-STATE-FOLLOWING-TAGS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HSW-STATE-CURRENT-OFFSET"));
        $sym84$PRINT_HSW_STATE = SubLObjectFactory.makeSymbol("PRINT-HSW-STATE");
        $sym85$HTML_STRING_WORDIFY_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("HTML-STRING-WORDIFY-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-STRING-WORDIFY-STATE-P"));
        $sym87$HSW_STATE_STATE = SubLObjectFactory.makeSymbol("HSW-STATE-STATE");
        $sym88$_CSETF_HSW_STATE_STATE = SubLObjectFactory.makeSymbol("_CSETF-HSW-STATE-STATE");
        $sym89$HSW_STATE_TAG_PIECES = SubLObjectFactory.makeSymbol("HSW-STATE-TAG-PIECES");
        $sym90$_CSETF_HSW_STATE_TAG_PIECES = SubLObjectFactory.makeSymbol("_CSETF-HSW-STATE-TAG-PIECES");
        $sym91$HSW_STATE_STRING_PIECES = SubLObjectFactory.makeSymbol("HSW-STATE-STRING-PIECES");
        $sym92$_CSETF_HSW_STATE_STRING_PIECES = SubLObjectFactory.makeSymbol("_CSETF-HSW-STATE-STRING-PIECES");
        $sym93$HSW_STATE_PUNCTUATION_PIECES = SubLObjectFactory.makeSymbol("HSW-STATE-PUNCTUATION-PIECES");
        $sym94$_CSETF_HSW_STATE_PUNCTUATION_PIECES = SubLObjectFactory.makeSymbol("_CSETF-HSW-STATE-PUNCTUATION-PIECES");
        $sym95$HSW_STATE_LEADING_TAGS = SubLObjectFactory.makeSymbol("HSW-STATE-LEADING-TAGS");
        $sym96$_CSETF_HSW_STATE_LEADING_TAGS = SubLObjectFactory.makeSymbol("_CSETF-HSW-STATE-LEADING-TAGS");
        $sym97$HSW_STATE_FOLLOWING_TAGS = SubLObjectFactory.makeSymbol("HSW-STATE-FOLLOWING-TAGS");
        $sym98$_CSETF_HSW_STATE_FOLLOWING_TAGS = SubLObjectFactory.makeSymbol("_CSETF-HSW-STATE-FOLLOWING-TAGS");
        $sym99$HSW_STATE_CURRENT_OFFSET = SubLObjectFactory.makeSymbol("HSW-STATE-CURRENT-OFFSET");
        $sym100$_CSETF_HSW_STATE_CURRENT_OFFSET = SubLObjectFactory.makeSymbol("_CSETF-HSW-STATE-CURRENT-OFFSET");
        $kw101$STATE = SubLObjectFactory.makeKeyword("STATE");
        $kw102$TAG_PIECES = SubLObjectFactory.makeKeyword("TAG-PIECES");
        $kw103$STRING_PIECES = SubLObjectFactory.makeKeyword("STRING-PIECES");
        $kw104$PUNCTUATION_PIECES = SubLObjectFactory.makeKeyword("PUNCTUATION-PIECES");
        $kw105$LEADING_TAGS = SubLObjectFactory.makeKeyword("LEADING-TAGS");
        $kw106$FOLLOWING_TAGS = SubLObjectFactory.makeKeyword("FOLLOWING-TAGS");
        $kw107$CURRENT_OFFSET = SubLObjectFactory.makeKeyword("CURRENT-OFFSET");
        $sym108$MAKE_HTML_STRING_WORDIFY_STATE = SubLObjectFactory.makeSymbol("MAKE-HTML-STRING-WORDIFY-STATE");
        $sym109$VISIT_DEFSTRUCT_OBJECT_HTML_STRING_WORDIFY_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-HTML-STRING-WORDIFY-STATE-METHOD");
        $str110$__S__S_ = SubLObjectFactory.makeString("<~S ~S>");
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STATE"), (SubLObject)SubLObjectFactory.makeKeyword("NORMAL"), (SubLObject)SubLObjectFactory.makeKeyword("CURRENT-OFFSET"), (SubLObject)document.ZERO_INTEGER);
        $kw112$SPACE = SubLObjectFactory.makeKeyword("SPACE");
        $kw113$END_OF_TAG = SubLObjectFactory.makeKeyword("END-OF-TAG");
        $kw114$START_OF_TAG = SubLObjectFactory.makeKeyword("START-OF-TAG");
        $kw115$PUNCTUATION = SubLObjectFactory.makeKeyword("PUNCTUATION");
        $kw116$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw117$INSIDE_TAG = SubLObjectFactory.makeKeyword("INSIDE-TAG");
        $kw118$NORMAL = SubLObjectFactory.makeKeyword("NORMAL");
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"), (SubLObject)SubLObjectFactory.makeKeyword("START-OF-TAG"), (SubLObject)SubLObjectFactory.makeKeyword("SPACE"));
        $str120$Unknown_state___S = SubLObjectFactory.makeString("Unknown state: ~S");
        $kw121$FOLLOWING_WHITESPACE = SubLObjectFactory.makeKeyword("FOLLOWING-WHITESPACE");
        $sym122$HTML_STRING_WORDIFY = SubLObjectFactory.makeSymbol("HTML-STRING-WORDIFY");
        $kw123$LEADING_WHITESPACE = SubLObjectFactory.makeKeyword("LEADING-WHITESPACE");
        $sym124$FST_STRING_WORDIFY = SubLObjectFactory.makeSymbol("FST-STRING-WORDIFY");
        $kw125$TEST = SubLObjectFactory.makeKeyword("TEST");
        $sym126$FST_WORDIFY_TEST = SubLObjectFactory.makeSymbol("FST-WORDIFY-TEST");
        $kw127$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw128$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw129$KB = SubLObjectFactory.makeKeyword("KB");
        $kw130$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw131$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list132 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("2.4 cm")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("2.4"), (SubLObject)SubLObjectFactory.makeString("cm"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Mr. Bill Clinton, president of the Clinton Foundation, met George W. Bush and gave him $400,000.00")), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Mr."), SubLObjectFactory.makeString("Bill"), SubLObjectFactory.makeString("Clinton"), SubLObjectFactory.makeString(","), SubLObjectFactory.makeString("president"), SubLObjectFactory.makeString("of"), SubLObjectFactory.makeString("the"), SubLObjectFactory.makeString("Clinton"), SubLObjectFactory.makeString("Foundation"), SubLObjectFactory.makeString(","), SubLObjectFactory.makeString("met"), SubLObjectFactory.makeString("George"), SubLObjectFactory.makeString("W"), SubLObjectFactory.makeString("."), SubLObjectFactory.makeString("Bush"), SubLObjectFactory.makeString("and"), SubLObjectFactory.makeString("gave"), SubLObjectFactory.makeString("him"), SubLObjectFactory.makeString("$"), SubLObjectFactory.makeString("400,000.00"), SubLObjectFactory.makeSymbol(">") })), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("C.I.A. director Patrick Henry said, \"Give me liberty or give me death!\"")), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("C.I.A."), SubLObjectFactory.makeString("director"), SubLObjectFactory.makeString("Patrick"), SubLObjectFactory.makeString("Henry"), SubLObjectFactory.makeString("said"), SubLObjectFactory.makeString(","), SubLObjectFactory.makeString("\""), SubLObjectFactory.makeString("Give"), SubLObjectFactory.makeString("me"), SubLObjectFactory.makeString("liberty"), SubLObjectFactory.makeString("or"), SubLObjectFactory.makeString("give"), SubLObjectFactory.makeString("me"), SubLObjectFactory.makeString("death"), SubLObjectFactory.makeString("!"), SubLObjectFactory.makeString("\""), SubLObjectFactory.makeSymbol(">") })), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("I have -1 apples and 1-4 cats")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("I"), (SubLObject)SubLObjectFactory.makeString("have"), (SubLObject)SubLObjectFactory.makeString("-"), (SubLObject)SubLObjectFactory.makeString("1"), (SubLObject)SubLObjectFactory.makeString("apples"), (SubLObject)SubLObjectFactory.makeString("and"), (SubLObject)SubLObjectFactory.makeString("1-4"), (SubLObject)SubLObjectFactory.makeString("cats"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("I like cats.  You like zebras.")), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("I"), SubLObjectFactory.makeString("like"), SubLObjectFactory.makeString("cats"), SubLObjectFactory.makeString("."), SubLObjectFactory.makeString("You"), SubLObjectFactory.makeString("like"), SubLObjectFactory.makeString("zebras"), SubLObjectFactory.makeString("."), SubLObjectFactory.makeSymbol(">") })), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("I work for the C.I.A.  Where do you work?")), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("I"), SubLObjectFactory.makeString("work"), SubLObjectFactory.makeString("for"), SubLObjectFactory.makeString("the"), SubLObjectFactory.makeString("C.I.A."), SubLObjectFactory.makeString("Where"), SubLObjectFactory.makeString("do"), SubLObjectFactory.makeString("you"), SubLObjectFactory.makeString("work"), SubLObjectFactory.makeString("?") })), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("couldn't eat")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("could"), (SubLObject)SubLObjectFactory.makeString("n't"), (SubLObject)SubLObjectFactory.makeString("eat"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3^4")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3"), (SubLObject)SubLObjectFactory.makeString("^"), (SubLObject)SubLObjectFactory.makeString("4"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bit-o'-honey")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("bit-o"), (SubLObject)SubLObjectFactory.makeString("'"), (SubLObject)SubLObjectFactory.makeString("-"), (SubLObject)SubLObjectFactory.makeString("honey"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("can't eat")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ca"), (SubLObject)SubLObjectFactory.makeString("n't"), (SubLObject)SubLObjectFactory.makeString("eat"))) });
        $str133$_a_WRD_a__a__WRD__a = SubLObjectFactory.makeString("~a<WRD~a>~a</WRD>~a");
        $str134$_tag__ = SubLObjectFactory.makeString(" tag=\"");
        $list135 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("."), (SubLObject)SubLObjectFactory.makeString("!"), (SubLObject)SubLObjectFactory.makeString("?"));
        $list136 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("\""), (SubLObject)SubLObjectFactory.makeString("'"), (SubLObject)SubLObjectFactory.makeString("`"));
        $str137$_ = SubLObjectFactory.makeString("\n");
        $list138 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("."), SubLObjectFactory.makeString(","), SubLObjectFactory.makeString(";"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeString("?"), SubLObjectFactory.makeString("!"), SubLObjectFactory.makeString("-"), SubLObjectFactory.makeString("--"), SubLObjectFactory.makeString("---"), SubLObjectFactory.makeString("("), SubLObjectFactory.makeString(")"), SubLObjectFactory.makeString("["), SubLObjectFactory.makeString("]"), SubLObjectFactory.makeString("{"), SubLObjectFactory.makeString("}"), SubLObjectFactory.makeString("\""), SubLObjectFactory.makeString("'"), SubLObjectFactory.makeString("`") });
        $list139 = ConsesLow.list((SubLObject)Characters.CHAR_period, (SubLObject)Characters.CHAR_question, (SubLObject)Characters.CHAR_exclamation);
        $list140 = ConsesLow.list(new SubLObject[] { Characters.CHAR_comma, Characters.CHAR_semicolon, Characters.CHAR_colon, Characters.CHAR_quote, Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_lbrace, Characters.CHAR_rbrace, Characters.CHAR_lbracket, Characters.CHAR_rbracket, Characters.CHAR_hyphen });
        $list141 = ConsesLow.list((SubLObject)Characters.CHAR_quotation, (SubLObject)Characters.CHAR_quote, (SubLObject)Characters.CHAR_backquote);
        $sym142$PHRASE_P = SubLObjectFactory.makeSymbol("PHRASE-P");
        $list143 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTITUENT"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym144$SIGN_DO_CONSTITUENTS = SubLObjectFactory.makeSymbol("SIGN-DO-CONSTITUENTS");
        $str145$_a_PHR_a__a_a_a__PHR__a = SubLObjectFactory.makeString("~a<PHR~a>~a~a~a</PHR>~a");
        $str146$_cat__ = SubLObjectFactory.makeString(" cat=\"");
        $list147 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym148$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym149$SENTENCE_YIELD_EXHAUSTIVE = SubLObjectFactory.makeSymbol("SENTENCE-YIELD-EXHAUSTIVE");
        $sym150$SENTENCE_YIELD = SubLObjectFactory.makeSymbol("SENTENCE-YIELD");
        $kw151$S = SubLObjectFactory.makeKeyword("S");
        $list152 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OFFSET"), (SubLObject)document.ZERO_INTEGER);
        $sym153$SENTENCE_P = SubLObjectFactory.makeSymbol("SENTENCE-P");
        $list154 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTITUENT"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym155$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $sym156$PUNCTUATION_SIGN_P = SubLObjectFactory.makeSymbol("PUNCTUATION-SIGN-P");
        $sym157$PARAGRAPH = SubLObjectFactory.makeSymbol("PARAGRAPH");
        $sym158$PARAGRAPH_P = SubLObjectFactory.makeSymbol("PARAGRAPH-P");
        $list159 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCES"), (SubLObject)SubLObjectFactory.makeSymbol("MOTHER"));
        $list160 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENTENCES"), (SubLObject)SubLObjectFactory.makeKeyword("MOTHER"));
        $list161 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPH-SENTENCES"), (SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPH-MOTHER"));
        $list162 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PARAGRAPH-SENTENCES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PARAGRAPH-MOTHER"));
        $sym163$PARAGRAPH_PRINT = SubLObjectFactory.makeSymbol("PARAGRAPH-PRINT");
        $sym164$PARAGRAPH_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PARAGRAPH-PRINT-FUNCTION-TRAMPOLINE");
        $list165 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPH-P"));
        $sym166$PARAGRAPH_SENTENCES = SubLObjectFactory.makeSymbol("PARAGRAPH-SENTENCES");
        $sym167$_CSETF_PARAGRAPH_SENTENCES = SubLObjectFactory.makeSymbol("_CSETF-PARAGRAPH-SENTENCES");
        $sym168$PARAGRAPH_MOTHER = SubLObjectFactory.makeSymbol("PARAGRAPH-MOTHER");
        $sym169$_CSETF_PARAGRAPH_MOTHER = SubLObjectFactory.makeSymbol("_CSETF-PARAGRAPH-MOTHER");
        $kw170$SENTENCES = SubLObjectFactory.makeKeyword("SENTENCES");
        $sym171$MAKE_PARAGRAPH = SubLObjectFactory.makeSymbol("MAKE-PARAGRAPH");
        $sym172$VISIT_DEFSTRUCT_OBJECT_PARAGRAPH_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PARAGRAPH-METHOD");
        $list173 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPH")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list174 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPH")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym175$SENTENCE = SubLObjectFactory.makeUninternedSymbol("SENTENCE");
        $sym176$PARAGRAPH_DO_SENTENCES = SubLObjectFactory.makeSymbol("PARAGRAPH-DO-SENTENCES");
        $sym177$SENTENCE_DO_WORDS = SubLObjectFactory.makeSymbol("SENTENCE-DO-WORDS");
        $sym178$SENTENCE = SubLObjectFactory.makeUninternedSymbol("SENTENCE");
        $sym179$SENTENCE_DO_MINIMAL_WORDS = SubLObjectFactory.makeSymbol("SENTENCE-DO-MINIMAL-WORDS");
        $str180$__PAR_ = SubLObjectFactory.makeString("#<PAR:");
        $str181$_PAR_ = SubLObjectFactory.makeString("<PAR>");
        $str182$__PAR_ = SubLObjectFactory.makeString("</PAR>");
        $sym183$DOCUMENT = SubLObjectFactory.makeSymbol("DOCUMENT");
        $sym184$DOCUMENT_P = SubLObjectFactory.makeSymbol("DOCUMENT-P");
        $list185 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPHS"));
        $list186 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PARAGRAPHS"));
        $list187 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOCUMENT-PARAGRAPHS"));
        $list188 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-DOCUMENT-PARAGRAPHS"));
        $sym189$DOCUMENT_PRINT = SubLObjectFactory.makeSymbol("DOCUMENT-PRINT");
        $sym190$DOCUMENT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("DOCUMENT-PRINT-FUNCTION-TRAMPOLINE");
        $list191 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENT-P"));
        $sym192$DOCUMENT_PARAGRAPHS = SubLObjectFactory.makeSymbol("DOCUMENT-PARAGRAPHS");
        $sym193$_CSETF_DOCUMENT_PARAGRAPHS = SubLObjectFactory.makeSymbol("_CSETF-DOCUMENT-PARAGRAPHS");
        $kw194$PARAGRAPHS = SubLObjectFactory.makeKeyword("PARAGRAPHS");
        $sym195$MAKE_DOCUMENT = SubLObjectFactory.makeSymbol("MAKE-DOCUMENT");
        $sym196$VISIT_DEFSTRUCT_OBJECT_DOCUMENT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-DOCUMENT-METHOD");
        $str197$_A_is_neither_a_string_nor_a_stre = SubLObjectFactory.makeString("~A is neither a string nor a stream in NEW-DOCUMENT.");
        $list198 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPH"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list199 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym200$PARAGRAPH = SubLObjectFactory.makeUninternedSymbol("PARAGRAPH");
        $sym201$DOCUMENT_DO_PARAGRAPHS = SubLObjectFactory.makeSymbol("DOCUMENT-DO-PARAGRAPHS");
        $str202$_ = SubLObjectFactory.makeString(".");
        $list203 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-WORD"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND-WORD"), (SubLObject)SubLObjectFactory.makeSymbol("SENT"));
        $kw204$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str205$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $sym206$INPUT_STREAM_P = SubLObjectFactory.makeSymbol("INPUT-STREAM-P");
        $str207$__DOC_ = SubLObjectFactory.makeString("#<DOC:");
        $str208$Sentence_index__A_out_of_bounds_ = SubLObjectFactory.makeString("Sentence index ~A out of bounds.");
        $str209$_DOC_ = SubLObjectFactory.makeString("<DOC>");
        $str210$__DOC_ = SubLObjectFactory.makeString("</DOC>");
        $list211 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym212$SENTENCE = SubLObjectFactory.makeUninternedSymbol("SENTENCE");
        $sym213$DOCUMENT_DO_SENTENCES = SubLObjectFactory.makeSymbol("DOCUMENT-DO-SENTENCES");
        $sym214$SENTENCE = SubLObjectFactory.makeUninternedSymbol("SENTENCE");
        $str215$can_t_create_sentence_iterator_fo = SubLObjectFactory.makeString("can't create sentence iterator for ~a");
        $kw216$EOF = SubLObjectFactory.makeKeyword("EOF");
        $list217 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(247), (SubLObject)SubLObjectFactory.makeInteger(215));
        $int218$192 = SubLObjectFactory.makeInteger(192);
        $int219$591 = SubLObjectFactory.makeInteger(591);
        $list220 = ConsesLow.list((SubLObject)document.TWO_INTEGER);
        $list221 = ConsesLow.list((SubLObject)document.ZERO_INTEGER, (SubLObject)Characters.CHAR_newline, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.TWO_INTEGER);
        $sym222$WHITESPACEP = SubLObjectFactory.makeSymbol("WHITESPACEP");
        $list223 = ConsesLow.list((SubLObject)document.NIL, (SubLObject)document.ZERO_INTEGER);
        $list224 = ConsesLow.list((SubLObject)document.ZERO_INTEGER, (SubLObject)Characters.CHAR_M, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.ELEVEN_INTEGER);
        $list225 = ConsesLow.list((SubLObject)document.ZERO_INTEGER, (SubLObject)Characters.CHAR_D, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.FOURTEEN_INTEGER);
        $list226 = ConsesLow.list((SubLObject)document.ZERO_INTEGER, (SubLObject)Characters.CHAR_P, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.SIXTEEN_INTEGER);
        $list227 = ConsesLow.list((SubLObject)document.ZERO_INTEGER, (SubLObject)Characters.CHAR_L, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.NINETEEN_INTEGER);
        $list228 = ConsesLow.list((SubLObject)document.ZERO_INTEGER, (SubLObject)Characters.CHAR_n, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(30));
        $list229 = ConsesLow.list((SubLObject)document.ZERO_INTEGER, (SubLObject)Characters.CHAR_w, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(32));
        $list230 = ConsesLow.list((SubLObject)document.ZERO_INTEGER, (SubLObject)Characters.CHAR_h, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(33));
        $list231 = ConsesLow.list((SubLObject)document.ZERO_INTEGER, (SubLObject)Characters.CHAR_c, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(36));
        $list232 = ConsesLow.list((SubLObject)document.ZERO_INTEGER, (SubLObject)Characters.CHAR_i, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(40));
        $list233 = ConsesLow.list((SubLObject)document.ZERO_INTEGER, (SubLObject)Characters.CHAR_a, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(48));
        $sym234$ALPHABETIC_CHAR_OR_CHARACTER_CODE_P = SubLObjectFactory.makeSymbol("ALPHABETIC-CHAR-OR-CHARACTER-CODE-P");
        $list235 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.ONE_INTEGER);
        $sym236$ISA_DIGIT_CHAR_ = SubLObjectFactory.makeSymbol("ISA-DIGIT-CHAR?");
        $list237 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(44));
        $list238 = ConsesLow.list((SubLObject)document.ZERO_INTEGER, (SubLObject)Characters.CHAR_hyphen, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.NINE_INTEGER);
        $list239 = ConsesLow.list((SubLObject)document.ZERO_INTEGER, (SubLObject)Characters.CHAR_underbar, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.NINE_INTEGER);
        $list240 = ConsesLow.list((SubLObject)document.ZERO_INTEGER, (SubLObject)Characters.CHAR_quote, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.TWENTY_INTEGER);
        $list241 = ConsesLow.list((SubLObject)document.ZERO_INTEGER, (SubLObject)Characters.CHAR_quotation, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.TWO_INTEGER);
        $sym242$ANY_PUNCTUATION_CHAR_ = SubLObjectFactory.makeSymbol("ANY-PUNCTUATION-CHAR?");
        $list243 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.TWO_INTEGER);
        $sym244$SENTENCE_INTERNAL_PUNCTUATION_CHAR_ = SubLObjectFactory.makeSymbol("SENTENCE-INTERNAL-PUNCTUATION-CHAR?");
        $sym245$CHARACTER_OR_CHARACTER_CODE_P = SubLObjectFactory.makeSymbol("CHARACTER-OR-CHARACTER-CODE-P");
        $sym246$UPPER_CASE_CHAR_P = SubLObjectFactory.makeSymbol("UPPER-CASE-CHAR-P");
        $list247 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(51));
        $sym248$ALPHANUMERIC_CHAR_OR_CHARACTER_CODE_P = SubLObjectFactory.makeSymbol("ALPHANUMERIC-CHAR-OR-CHARACTER-CODE-P");
        $list249 = ConsesLow.list((SubLObject)document.ONE_INTEGER, (SubLObject)Characters.CHAR_period, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMEMBER")), (SubLObject)document.THREE_INTEGER);
        $list250 = ConsesLow.list((SubLObject)document.ONE_INTEGER, (SubLObject)Characters.CHAR_newline, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("BACKUP")), (SubLObject)document.TWO_INTEGER);
        $list251 = ConsesLow.list((SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list252 = ConsesLow.list((SubLObject)document.ONE_INTEGER, (SubLObject)Characters.CHAR_hyphen, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMEMBER")), (SubLObject)document.EIGHT_INTEGER);
        $list253 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("BACKUP")), (SubLObject)document.TWO_INTEGER);
        $sym254$QUOTE_CHAR_ = SubLObjectFactory.makeSymbol("QUOTE-CHAR?");
        $list255 = ConsesLow.list((SubLObject)document.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list256 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKUP")), (SubLObject)document.FIVE_INTEGER);
        $list257 = ConsesLow.list((SubLObject)document.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKUP")), (SubLObject)document.TWO_INTEGER);
        $list258 = ConsesLow.list((SubLObject)document.NIL, (SubLObject)document.FOUR_INTEGER);
        $list259 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKUP")), (SubLObject)document.TWO_INTEGER);
        $sym260$LOWER_CASE_CHAR_P = SubLObjectFactory.makeSymbol("LOWER-CASE-CHAR-P");
        $list261 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKUP")), (SubLObject)document.SIX_INTEGER);
        $list262 = ConsesLow.list((SubLObject)document.FOUR_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKUP")), (SubLObject)document.TWO_INTEGER);
        $sym263$SENTENCE_FINAL_PUNCTUATION_CHAR_ = SubLObjectFactory.makeSymbol("SENTENCE-FINAL-PUNCTUATION-CHAR?");
        $list264 = ConsesLow.list((SubLObject)document.FIVE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list265 = ConsesLow.list((SubLObject)document.SIX_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list266 = ConsesLow.list((SubLObject)document.EIGHT_INTEGER, (SubLObject)Characters.CHAR_hyphen, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKUP")), (SubLObject)document.TWO_INTEGER);
        $list267 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKUP")), (SubLObject)document.TEN_INTEGER);
        $list268 = ConsesLow.list((SubLObject)document.EIGHT_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKUP")), (SubLObject)document.TWO_INTEGER);
        $list269 = ConsesLow.list((SubLObject)document.NINE_INTEGER, (SubLObject)Characters.CHAR_hyphen, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.NINE_INTEGER);
        $list270 = ConsesLow.list((SubLObject)document.NINE_INTEGER, (SubLObject)Characters.CHAR_underbar, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.NINE_INTEGER);
        $list271 = ConsesLow.list((SubLObject)document.NINE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list272 = ConsesLow.list((SubLObject)document.ELEVEN_INTEGER, (SubLObject)Characters.CHAR_s, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.THIRTEEN_INTEGER);
        $list273 = ConsesLow.list((SubLObject)document.ELEVEN_INTEGER, (SubLObject)Characters.CHAR_r, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.TWELVE_INTEGER);
        $list274 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("BACKUP")), (SubLObject)document.ONE_INTEGER);
        $list275 = ConsesLow.list((SubLObject)document.ELEVEN_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list276 = ConsesLow.list((SubLObject)document.TWELVE_INTEGER, (SubLObject)Characters.CHAR_s, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.THIRTEEN_INTEGER);
        $list277 = ConsesLow.list((SubLObject)document.TWELVE_INTEGER, (SubLObject)Characters.CHAR_period, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.ONE_INTEGER);
        $list278 = ConsesLow.list((SubLObject)document.TWELVE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list279 = ConsesLow.list((SubLObject)document.THIRTEEN_INTEGER, (SubLObject)Characters.CHAR_period, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.ONE_INTEGER);
        $list280 = ConsesLow.list((SubLObject)document.THIRTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list281 = ConsesLow.list((SubLObject)document.FOURTEEN_INTEGER, (SubLObject)Characters.CHAR_r, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.FIFTEEN_INTEGER);
        $list282 = ConsesLow.list((SubLObject)document.FOURTEEN_INTEGER, (SubLObject)Characters.CHAR_o, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(25));
        $list283 = ConsesLow.list((SubLObject)document.FOURTEEN_INTEGER, (SubLObject)Characters.CHAR_i, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(24));
        $list284 = ConsesLow.list((SubLObject)document.FOURTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list285 = ConsesLow.list((SubLObject)document.FIFTEEN_INTEGER, (SubLObject)Characters.CHAR_period, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.ONE_INTEGER);
        $list286 = ConsesLow.list((SubLObject)document.FIFTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list287 = ConsesLow.list((SubLObject)document.SIXTEEN_INTEGER, (SubLObject)Characters.CHAR_r, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.SEVENTEEN_INTEGER);
        $list288 = ConsesLow.list((SubLObject)document.SIXTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list289 = ConsesLow.list((SubLObject)document.SEVENTEEN_INTEGER, (SubLObject)Characters.CHAR_o, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.EIGHTEEN_INTEGER);
        $list290 = ConsesLow.list((SubLObject)document.SEVENTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list291 = ConsesLow.list((SubLObject)document.EIGHTEEN_INTEGER, (SubLObject)Characters.CHAR_f, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.FIFTEEN_INTEGER);
        $list292 = ConsesLow.list((SubLObject)document.EIGHTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list293 = ConsesLow.list((SubLObject)document.NINETEEN_INTEGER, (SubLObject)Characters.CHAR_t, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.THIRTEEN_INTEGER);
        $list294 = ConsesLow.list((SubLObject)document.NINETEEN_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list295 = ConsesLow.list((SubLObject)document.TWENTY_INTEGER, (SubLObject)Characters.CHAR_t, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(21));
        $list296 = ConsesLow.list((SubLObject)document.TWENTY_INTEGER, (SubLObject)Characters.CHAR_m, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(21));
        $list297 = ConsesLow.list((SubLObject)document.TWENTY_INTEGER, (SubLObject)Characters.CHAR_d, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(21));
        $list298 = ConsesLow.list((SubLObject)document.TWENTY_INTEGER, (SubLObject)Characters.CHAR_s, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(21));
        $list299 = ConsesLow.list((SubLObject)document.TWENTY_INTEGER, (SubLObject)Characters.CHAR_r, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(22));
        $list300 = ConsesLow.list((SubLObject)document.TWENTY_INTEGER, (SubLObject)Characters.CHAR_l, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(23));
        $list301 = ConsesLow.list((SubLObject)document.TWENTY_INTEGER, (SubLObject)Characters.CHAR_v, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(47));
        $list302 = ConsesLow.list((SubLObject)document.TWENTY_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list303 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(21), (SubLObject)Characters.CHAR_newline, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("BACKUP")), (SubLObject)document.TWO_INTEGER);
        $int304$21 = SubLObjectFactory.makeInteger(21);
        $list305 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(21), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list306 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(22), (SubLObject)Characters.CHAR_e, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(21));
        $int307$22 = SubLObjectFactory.makeInteger(22);
        $list308 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(22), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list309 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(23), (SubLObject)Characters.CHAR_l, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(21));
        $int310$23 = SubLObjectFactory.makeInteger(23);
        $list311 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(23), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list312 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(24), (SubLObject)Characters.CHAR_d, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(25));
        $int313$24 = SubLObjectFactory.makeInteger(24);
        $list314 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(24), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list315 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(25), (SubLObject)Characters.CHAR_e, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(26));
        $list316 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(25), (SubLObject)Characters.CHAR_n, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMEMBER")), (SubLObject)SubLObjectFactory.makeInteger(27));
        $int317$25 = SubLObjectFactory.makeInteger(25);
        $list318 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(25), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list319 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(26), (SubLObject)Characters.CHAR_s, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(25));
        $int320$26 = SubLObjectFactory.makeInteger(26);
        $list321 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(26), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list322 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(27), (SubLObject)Characters.CHAR_quote, (SubLObject)document.NIL, (SubLObject)SubLObjectFactory.makeInteger(28));
        $int323$27 = SubLObjectFactory.makeInteger(27);
        $list324 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKUP")), (SubLObject)document.ONE_INTEGER);
        $list325 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(27), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list326 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(28), (SubLObject)Characters.CHAR_t, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKUP")), (SubLObject)document.TWO_INTEGER);
        $int327$28 = SubLObjectFactory.makeInteger(28);
        $list328 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKUP")), (SubLObject)SubLObjectFactory.makeInteger(29));
        $list329 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(28), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKUP")), (SubLObject)document.TWO_INTEGER);
        $int330$29 = SubLObjectFactory.makeInteger(29);
        $list331 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(30), (SubLObject)Characters.CHAR_quote, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(31));
        $int332$30 = SubLObjectFactory.makeInteger(30);
        $list333 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(30), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list334 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(31), (SubLObject)Characters.CHAR_t, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.TWO_INTEGER);
        $int335$31 = SubLObjectFactory.makeInteger(31);
        $list336 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(31), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list337 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(32), (SubLObject)Characters.CHAR_o, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(25));
        $list338 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(32), (SubLObject)Characters.CHAR_a, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(41));
        $list339 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(32), (SubLObject)Characters.CHAR_e, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(42));
        $int340$32 = SubLObjectFactory.makeInteger(32);
        $list341 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(32), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list342 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(33), (SubLObject)Characters.CHAR_a, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(34));
        $int343$33 = SubLObjectFactory.makeInteger(33);
        $list344 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(33), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list345 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(34), (SubLObject)Characters.CHAR_d, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(25));
        $list346 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(34), (SubLObject)Characters.CHAR_s, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(25));
        $list347 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(34), (SubLObject)Characters.CHAR_v, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(35));
        $int348$34 = SubLObjectFactory.makeInteger(34);
        $list349 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(34), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list350 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(35), (SubLObject)Characters.CHAR_e, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(25));
        $int351$35 = SubLObjectFactory.makeInteger(35);
        $list352 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(35), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list353 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(36), (SubLObject)Characters.CHAR_a, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(25));
        $list354 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(36), (SubLObject)Characters.CHAR_o, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(37));
        $int355$36 = SubLObjectFactory.makeInteger(36);
        $list356 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(36), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list357 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(37), (SubLObject)Characters.CHAR_u, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(38));
        $int358$37 = SubLObjectFactory.makeInteger(37);
        $list359 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(37), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list360 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(38), (SubLObject)Characters.CHAR_l, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(39));
        $int361$38 = SubLObjectFactory.makeInteger(38);
        $list362 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(38), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list363 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(39), (SubLObject)Characters.CHAR_d, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(25));
        $int364$39 = SubLObjectFactory.makeInteger(39);
        $list365 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(39), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list366 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(40), (SubLObject)Characters.CHAR_s, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(25));
        $int367$40 = SubLObjectFactory.makeInteger(40);
        $list368 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(40), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list369 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(41), (SubLObject)Characters.CHAR_s, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(25));
        $int370$41 = SubLObjectFactory.makeInteger(41);
        $list371 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(41), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list372 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(42), (SubLObject)Characters.CHAR_r, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(43));
        $int373$42 = SubLObjectFactory.makeInteger(42);
        $list374 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(42), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list375 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(43), (SubLObject)Characters.CHAR_e, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(25));
        $int376$43 = SubLObjectFactory.makeInteger(43);
        $list377 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(43), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $int378$44 = SubLObjectFactory.makeInteger(44);
        $list379 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(44), (SubLObject)Characters.CHAR_period, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMEMBER")), (SubLObject)SubLObjectFactory.makeInteger(45));
        $list380 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(44), (SubLObject)Characters.CHAR_comma, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMEMBER")), (SubLObject)SubLObjectFactory.makeInteger(49));
        $list381 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(44), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $int382$45 = SubLObjectFactory.makeInteger(45);
        $list383 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKUP")), (SubLObject)SubLObjectFactory.makeInteger(46));
        $list384 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKUP")), (SubLObject)document.THREE_INTEGER);
        $list385 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(45), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKUP")), (SubLObject)document.TWO_INTEGER);
        $list386 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(46), (SubLObject)Characters.CHAR_period, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(44));
        $int387$46 = SubLObjectFactory.makeInteger(46);
        $list388 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(46), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list389 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(47), (SubLObject)Characters.CHAR_e, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(21));
        $list390 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(47), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list391 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(48), (SubLObject)Characters.CHAR_i, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)SubLObjectFactory.makeInteger(25));
        $int392$48 = SubLObjectFactory.makeInteger(48);
        $list393 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(48), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $int394$49 = SubLObjectFactory.makeInteger(49);
        $list395 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKUP")), (SubLObject)SubLObjectFactory.makeInteger(50));
        $int396$50 = SubLObjectFactory.makeInteger(50);
        $int397$51 = SubLObjectFactory.makeInteger(51);
        $list398 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(51), (SubLObject)Characters.CHAR_period, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.ONE_INTEGER);
        $list399 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(51), (SubLObject)Characters.CHAR_newline, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMEMBER"), (SubLObject)SubLObjectFactory.makeKeyword("BACKUP")), (SubLObject)document.TWO_INTEGER);
        $list400 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(51), (SubLObject)Characters.CHAR_hyphen, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMEMBER")), (SubLObject)document.EIGHT_INTEGER);
        $list401 = ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(51), (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $sym402$BUILD_WORD_TOKEN = SubLObjectFactory.makeSymbol("BUILD-WORD-TOKEN");
        $sym403$NEWLINE_WORD_P = SubLObjectFactory.makeSymbol("NEWLINE-WORD-P");
        $sym404$END_OF_SENTENCE_WORD_P = SubLObjectFactory.makeSymbol("END-OF-SENTENCE-WORD-P");
        $list405 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMEMBER")), (SubLObject)document.THREE_INTEGER);
        $list406 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.FOUR_INTEGER);
        $list407 = ConsesLow.list((SubLObject)document.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $sym408$QUOTE_WORD_P = SubLObjectFactory.makeSymbol("QUOTE-WORD-P");
        $list409 = ConsesLow.list((SubLObject)document.FOUR_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $sym410$BUILD_SENTENCE_TOKEN = SubLObjectFactory.makeSymbol("BUILD-SENTENCE-TOKEN");
        $sym411$NEWLINE_SENTENCE_P = SubLObjectFactory.makeSymbol("NEWLINE-SENTENCE-P");
        $list412 = ConsesLow.list((SubLObject)document.NIL, (SubLObject)document.ONE_INTEGER);
        $list413 = ConsesLow.list((SubLObject)document.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("END"), (SubLObject)document.NIL, (SubLObject)document.TWO_INTEGER);
        $list414 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EMIT")), (SubLObject)document.ZERO_INTEGER);
        $list415 = ConsesLow.list((SubLObject)document.NIL, (SubLObject)document.THREE_INTEGER);
        $sym416$BUILD_PARAGRAPH_TOKEN = SubLObjectFactory.makeSymbol("BUILD-PARAGRAPH-TOKEN");
        $str417$_C = SubLObjectFactory.makeString("~C");
        $str418$______ = SubLObjectFactory.makeString("[\\.!?]");
        $str419$____________________ = SubLObjectFactory.makeString("(?:'|\"|''|\\)|\\]|\\})?");
        $list420 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("jr"), SubLObjectFactory.makeString("mr"), SubLObjectFactory.makeString("mrs"), SubLObjectFactory.makeString("ms"), SubLObjectFactory.makeString("dr"), SubLObjectFactory.makeString("prof"), SubLObjectFactory.makeString("sr"), SubLObjectFactory.makeString("sens?"), SubLObjectFactory.makeString("reps?"), SubLObjectFactory.makeString("gov"), SubLObjectFactory.makeString("attys?"), SubLObjectFactory.makeString("supt"), SubLObjectFactory.makeString("det"), SubLObjectFactory.makeString("rev") });
        $list421 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("col"), SubLObjectFactory.makeString("gen"), SubLObjectFactory.makeString("lt"), SubLObjectFactory.makeString("cmdr"), SubLObjectFactory.makeString("adm"), SubLObjectFactory.makeString("capt"), SubLObjectFactory.makeString("sgt"), SubLObjectFactory.makeString("cpl"), SubLObjectFactory.makeString("maj") });
        $list422 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("inc"), (SubLObject)SubLObjectFactory.makeString("ltd"), (SubLObject)SubLObjectFactory.makeString("co"), (SubLObject)SubLObjectFactory.makeString("corp"));
        $str423$arc = SubLObjectFactory.makeString("arc");
        $str424$al = SubLObjectFactory.makeString("al");
        $str425$ave = SubLObjectFactory.makeString("ave");
        $str426$blv_d = SubLObjectFactory.makeString("blv?d");
        $str427$cl = SubLObjectFactory.makeString("cl");
        $str428$ct = SubLObjectFactory.makeString("ct");
        $str429$cres = SubLObjectFactory.makeString("cres");
        $str430$dr = SubLObjectFactory.makeString("dr");
        $str431$expy_ = SubLObjectFactory.makeString("expy?");
        $str432$dist = SubLObjectFactory.makeString("dist");
        $str433$mt = SubLObjectFactory.makeString("mt");
        $str434$ft = SubLObjectFactory.makeString("ft");
        $str435$fw_y = SubLObjectFactory.makeString("fw?y");
        $str436$hwa_y = SubLObjectFactory.makeString("hwa?y");
        $str437$la = SubLObjectFactory.makeString("la");
        $str438$pde_ = SubLObjectFactory.makeString("pde?");
        $str439$pl = SubLObjectFactory.makeString("pl");
        $str440$plz = SubLObjectFactory.makeString("plz");
        $str441$rd = SubLObjectFactory.makeString("rd");
        $str442$st = SubLObjectFactory.makeString("st");
        $str443$tce = SubLObjectFactory.makeString("tce");
        $str444$Ala = SubLObjectFactory.makeString("Ala");
        $str445$Ariz = SubLObjectFactory.makeString("Ariz");
        $str446$Ark = SubLObjectFactory.makeString("Ark");
        $str447$Cal = SubLObjectFactory.makeString("Cal");
        $str448$Calif = SubLObjectFactory.makeString("Calif");
        $str449$Col = SubLObjectFactory.makeString("Col");
        $str450$Colo = SubLObjectFactory.makeString("Colo");
        $str451$Conn = SubLObjectFactory.makeString("Conn");
        $str452$Del = SubLObjectFactory.makeString("Del");
        $str453$Fed = SubLObjectFactory.makeString("Fed");
        $str454$Fla = SubLObjectFactory.makeString("Fla");
        $str455$Ga = SubLObjectFactory.makeString("Ga");
        $str456$Ida = SubLObjectFactory.makeString("Ida");
        $str457$Id = SubLObjectFactory.makeString("Id");
        $str458$Ill = SubLObjectFactory.makeString("Ill");
        $str459$Ind = SubLObjectFactory.makeString("Ind");
        $str460$Ia = SubLObjectFactory.makeString("Ia");
        $str461$Kan = SubLObjectFactory.makeString("Kan");
        $str462$Kans = SubLObjectFactory.makeString("Kans");
        $str463$Ken = SubLObjectFactory.makeString("Ken");
        $str464$Ky = SubLObjectFactory.makeString("Ky");
        $str465$La = SubLObjectFactory.makeString("La");
        $str466$Me = SubLObjectFactory.makeString("Me");
        $str467$Md = SubLObjectFactory.makeString("Md");
        $str468$Is = SubLObjectFactory.makeString("Is");
        $str469$Mass = SubLObjectFactory.makeString("Mass");
        $str470$Mich = SubLObjectFactory.makeString("Mich");
        $str471$Minn = SubLObjectFactory.makeString("Minn");
        $str472$Miss = SubLObjectFactory.makeString("Miss");
        $str473$Mo = SubLObjectFactory.makeString("Mo");
        $str474$Mont = SubLObjectFactory.makeString("Mont");
        $str475$Neb = SubLObjectFactory.makeString("Neb");
        $str476$Nebr = SubLObjectFactory.makeString("Nebr");
        $str477$Nev = SubLObjectFactory.makeString("Nev");
        $str478$Mex = SubLObjectFactory.makeString("Mex");
        $str479$Okla = SubLObjectFactory.makeString("Okla");
        $str480$Ok = SubLObjectFactory.makeString("Ok");
        $str481$Ore = SubLObjectFactory.makeString("Ore");
        $str482$Penna = SubLObjectFactory.makeString("Penna");
        $str483$Penn = SubLObjectFactory.makeString("Penn");
        $str484$Pa = SubLObjectFactory.makeString("Pa");
        $str485$Dak = SubLObjectFactory.makeString("Dak");
        $str486$Tenn = SubLObjectFactory.makeString("Tenn");
        $str487$Tex = SubLObjectFactory.makeString("Tex");
        $str488$Ut = SubLObjectFactory.makeString("Ut");
        $str489$Vt = SubLObjectFactory.makeString("Vt");
        $str490$Va = SubLObjectFactory.makeString("Va");
        $str491$Wash = SubLObjectFactory.makeString("Wash");
        $str492$Wis = SubLObjectFactory.makeString("Wis");
        $str493$Wisc = SubLObjectFactory.makeString("Wisc");
        $str494$Wy = SubLObjectFactory.makeString("Wy");
        $str495$Wyo = SubLObjectFactory.makeString("Wyo");
        $str496$USAFA = SubLObjectFactory.makeString("USAFA");
        $str497$Alta = SubLObjectFactory.makeString("Alta");
        $str498$Man = SubLObjectFactory.makeString("Man");
        $str499$Ont = SubLObjectFactory.makeString("Ont");
        $str500$Sask = SubLObjectFactory.makeString("Sask");
        $str501$Yuk = SubLObjectFactory.makeString("Yuk");
        $list502 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("jan"), SubLObjectFactory.makeString("feb"), SubLObjectFactory.makeString("mar"), SubLObjectFactory.makeString("apr"), SubLObjectFactory.makeString("may"), SubLObjectFactory.makeString("jun"), SubLObjectFactory.makeString("jul"), SubLObjectFactory.makeString("aug"), SubLObjectFactory.makeString("sep"), SubLObjectFactory.makeString("oct"), SubLObjectFactory.makeString("nov"), SubLObjectFactory.makeString("dec"), SubLObjectFactory.makeString("sept") });
        $list503 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("vs"), (SubLObject)SubLObjectFactory.makeString("sec"), (SubLObject)SubLObjectFactory.makeString("no"), (SubLObject)SubLObjectFactory.makeString("esp"));
        $str504$_n_s__n = SubLObjectFactory.makeString("\\n\\s*\\n");
        $str505$_s_ = SubLObjectFactory.makeString("\\s)");
        $str506$_1 = SubLObjectFactory.makeString("\\1");
        $str507$__s_w = SubLObjectFactory.makeString("(\\s\\w");
        $str508$_____w__w = SubLObjectFactory.makeString("([^-\\w]\\w");
        $str509$__s_w___s__ = SubLObjectFactory.makeString("(\\s\\w\\.\\s+)");
        $str510$_________ = SubLObjectFactory.makeString("(\\.\\.\\. )");
        $str511$____lower____ = SubLObjectFactory.makeString("([[:lower:]])");
        $str512$_1_2 = SubLObjectFactory.makeString("\\1\\2");
        $str513$_____ = SubLObjectFactory.makeString("(['\"]");
        $str514$_____s__ = SubLObjectFactory.makeString("['\"]\\s+)");
        $str515$______s__ = SubLObjectFactory.makeString("([\"']\\s*)");
        $str516$__s____lower____ = SubLObjectFactory.makeString("(\\s*[[:lower:]])");
        $str517$__s___s_ = SubLObjectFactory.makeString("(\\s\\.\\s)");
        $str518$__s__ = SubLObjectFactory.makeString("(\\s*)");
        $str519$__s = SubLObjectFactory.makeString("(\\s");
        $str520$__D_d___ = SubLObjectFactory.makeString("(\\D\\d+)(");
        $str521$___s__ = SubLObjectFactory.makeString(")(\\s+)");
        $str522$_3 = SubLObjectFactory.makeString("\\3");
        $str523$___w = SubLObjectFactory.makeString("('\\w");
        $str524$___s_ = SubLObjectFactory.makeString(")(\\s)");
        $str525$_2 = SubLObjectFactory.makeString("\\2");
        $str526$__sno_____s______d_ = SubLObjectFactory.makeString("(\\sno\\.)(\\s+)(?!\\d)");
        $list527 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CASELESS"));
        $str528$__ap___m___s______upper____ = SubLObjectFactory.makeString("([ap]\\.m\\.\\s+)([[:upper:]])");
        $list529 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBSTITUTION"));
        $str530$Can_t_finalize__a__not_a_regular_ = SubLObjectFactory.makeString("Can't finalize ~a: not a regular expression pattern");
        $sym531$SENTENCIFY_STRING = SubLObjectFactory.makeSymbol("SENTENCIFY-STRING");
        $str532$__b = SubLObjectFactory.makeString("(\\b");
        $list533 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBSTITUTION"), (SubLObject)SubLObjectFactory.makeSymbol("OPTIONS"));
        $str534$Can_t_compile_regular_expression_ = SubLObjectFactory.makeString("Can't compile regular expression ~a: ~a");
        $sym535$NEW_DOCUMENT = SubLObjectFactory.makeSymbol("NEW-DOCUMENT");
        $sym536$DOCUMENT_SENTENCE_COUNT_ = SubLObjectFactory.makeSymbol("DOCUMENT-SENTENCE-COUNT=");
        $kw537$FULL = SubLObjectFactory.makeKeyword("FULL");
        $list538 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("I love Elmer Fudgsicle's suits.  He had wonderful taste."), (SubLObject)document.NIL, (SubLObject)SubLObjectFactory.makeSymbol("FST-STRING-WORDIFY")), (SubLObject)document.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("I love Elmer Fudgsicle's suits.  He had wonderful taste.")), (SubLObject)document.TWO_INTEGER));
        $sym539$TEST_CONSTRUCT_STRING_FROM_WORDS = SubLObjectFactory.makeSymbol("TEST-CONSTRUCT-STRING-FROM-WORDS");
        $list540 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-N"), (SubLObject)document.TWO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VECTOR-ELEMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-YIELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SENTENCE"), (SubLObject)SubLObjectFactory.makeString("3.4 billion cats")))))), (SubLObject)SubLObjectFactory.makeString("3.4 billion")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VECTOR-ELEMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-YIELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SENTENCE"), (SubLObject)SubLObjectFactory.makeString("3.4 billion cats"))))))), (SubLObject)SubLObjectFactory.makeString("billion")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VECTOR-ELEMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-YIELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SENTENCE"), (SubLObject)SubLObjectFactory.makeString("U.S.")))))), (SubLObject)document.T), (SubLObject)SubLObjectFactory.makeString("US")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VECTOR-ELEMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-YIELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SENTENCE"), (SubLObject)SubLObjectFactory.makeString("U.S. Defense")))), (SubLObject)document.T), (SubLObject)SubLObjectFactory.makeString("US Defense")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VECTOR-ELEMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-YIELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SENTENCE"), (SubLObject)SubLObjectFactory.makeString("US Defense")))), (SubLObject)document.T), (SubLObject)SubLObjectFactory.makeString("US Defense")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VECTOR-ELEMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-YIELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SENTENCE"), (SubLObject)SubLObjectFactory.makeString("US Defense")))), (SubLObject)document.NIL), (SubLObject)SubLObjectFactory.makeString("US Defense")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VECTOR-ELEMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-YIELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SENTENCE"), (SubLObject)SubLObjectFactory.makeString("U.S.")))), (SubLObject)document.NIL), (SubLObject)SubLObjectFactory.makeString("U.S.")));
    }
    
    public static final class $sign_native extends SubLStructNative
    {
        public SubLObject $string;
        public SubLObject $type;
        public SubLObject $info;
        public SubLObject $category;
        public SubLObject $constituents;
        public SubLObject $offset;
        public SubLObject $mother;
        private static final SubLStructDeclNative structDecl;
        
        public $sign_native() {
            this.$string = (SubLObject)CommonSymbols.NIL;
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$info = (SubLObject)CommonSymbols.NIL;
            this.$category = (SubLObject)CommonSymbols.NIL;
            this.$constituents = (SubLObject)CommonSymbols.NIL;
            this.$offset = (SubLObject)CommonSymbols.NIL;
            this.$mother = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sign_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$sign_native.class, document.$sym1$SIGN, document.$sym2$SIGN_P, document.$list3, document.$list4, new String[] { "$string", "$type", "$info", "$category", "$constituents", "$offset", "$mother" }, document.$list5, document.$list6, document.$sym7$SIGN_PRINT);
        }
    }
    
    public static final class $sign_p$UnaryFunction extends UnaryFunction
    {
        public $sign_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SIGN-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return document.sign_p(arg1);
        }
    }
    
    public static final class $html_string_wordify_state_native extends SubLStructNative
    {
        public SubLObject $state;
        public SubLObject $tag_pieces;
        public SubLObject $string_pieces;
        public SubLObject $punctuation_pieces;
        public SubLObject $leading_tags;
        public SubLObject $following_tags;
        public SubLObject $current_offset;
        private static final SubLStructDeclNative structDecl;
        
        public $html_string_wordify_state_native() {
            this.$state = (SubLObject)CommonSymbols.NIL;
            this.$tag_pieces = (SubLObject)CommonSymbols.NIL;
            this.$string_pieces = (SubLObject)CommonSymbols.NIL;
            this.$punctuation_pieces = (SubLObject)CommonSymbols.NIL;
            this.$leading_tags = (SubLObject)CommonSymbols.NIL;
            this.$following_tags = (SubLObject)CommonSymbols.NIL;
            this.$current_offset = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$html_string_wordify_state_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$html_string_wordify_state_native.class, document.$sym78$HTML_STRING_WORDIFY_STATE, document.$sym79$HTML_STRING_WORDIFY_STATE_P, document.$list80, document.$list81, new String[] { "$state", "$tag_pieces", "$string_pieces", "$punctuation_pieces", "$leading_tags", "$following_tags", "$current_offset" }, document.$list82, document.$list83, document.$sym84$PRINT_HSW_STATE);
        }
    }
    
    public static final class $html_string_wordify_state_p$UnaryFunction extends UnaryFunction
    {
        public $html_string_wordify_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HTML-STRING-WORDIFY-STATE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return document.html_string_wordify_state_p(arg1);
        }
    }
    
    public static final class $paragraph_native extends SubLStructNative
    {
        public SubLObject $sentences;
        public SubLObject $mother;
        private static final SubLStructDeclNative structDecl;
        
        public $paragraph_native() {
            this.$sentences = (SubLObject)CommonSymbols.NIL;
            this.$mother = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$paragraph_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$paragraph_native.class, document.$sym157$PARAGRAPH, document.$sym158$PARAGRAPH_P, document.$list159, document.$list160, new String[] { "$sentences", "$mother" }, document.$list161, document.$list162, document.$sym163$PARAGRAPH_PRINT);
        }
    }
    
    public static final class $paragraph_p$UnaryFunction extends UnaryFunction
    {
        public $paragraph_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PARAGRAPH-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return document.paragraph_p(arg1);
        }
    }
    
    public static final class $document_native extends SubLStructNative
    {
        public SubLObject $paragraphs;
        private static final SubLStructDeclNative structDecl;
        
        public $document_native() {
            this.$paragraphs = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$document_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$document_native.class, document.$sym183$DOCUMENT, document.$sym184$DOCUMENT_P, document.$list185, document.$list186, new String[] { "$paragraphs" }, document.$list187, document.$list188, document.$sym189$DOCUMENT_PRINT);
        }
    }
    
    public static final class $document_p$UnaryFunction extends UnaryFunction
    {
        public $document_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("DOCUMENT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return document.document_p(arg1);
        }
    }
}

/*

	Total time: 1754 ms
	 synthetic 
*/