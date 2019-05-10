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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class document
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.document";
  public static final String myFingerPrint = "0c990c2d5b2bde35aa873e61ee349c4bd4a0140faac5f391c4d35c84b23a301f";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7422L)
  private static SubLSymbol $text_class_print_length$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7602L)
  private static SubLSymbol $xml_indent_level$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7702L)
  private static SubLSymbol $xml_indent$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7804L)
  private static SubLSymbol $newline$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7881L)
  private static SubLSymbol $xml_string_mapping$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8014L)
  public static SubLSymbol $dtp_sign$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22074L)
  public static SubLSymbol $wordifier$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22254L)
  private static SubLSymbol $fst_string_wordify_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23690L)
  private static SubLSymbol $html_string_wordify_punctuation_chars_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23906L)
  public static SubLSymbol $dtp_html_string_wordify_state$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47508L)
  public static SubLSymbol $dtp_paragraph$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53864L)
  public static SubLSymbol $dtp_document$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55385L)
  public static SubLSymbol $perform_dot_analysis_on_docs$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 65345L)
  private static SubLSymbol $wordifier_fst$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 73104L)
  private static SubLSymbol $sentencifier_fst$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 73793L)
  private static SubLSymbol $paragraphier_fst$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 74342L)
  private static SubLSymbol $eos_char$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 74540L)
  private static SubLSymbol $eos$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 74627L)
  private static SubLSymbol $p$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 74694L)
  private static SubLSymbol $ap$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 74785L)
  private static SubLSymbol $pap$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 74871L)
  private static SubLSymbol $people$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 75018L)
  private static SubLSymbol $army$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 75111L)
  private static SubLSymbol $companies$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 75178L)
  private static SubLSymbol $places$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 75831L)
  private static SubLSymbol $months$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 75950L)
  private static SubLSymbol $misc$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 76005L)
  private static SubLSymbol $abbreviations$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 76110L)
  private static SubLSymbol $mark_eos_regular_expressions$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 76656L)
  private static SubLSymbol $remove_false_eos_regular_expressions1$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 77254L)
  private static SubLSymbol $remove_false_eos_regular_expressions2$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 77641L)
  private static SubLSymbol $split_unsplit_stuff_regular_expressions$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 78361L)
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

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8014L)
  public static SubLObject sign_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    sign_print( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8014L)
  public static SubLObject sign_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sign_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8014L)
  public static SubLObject sign_string(final SubLObject v_object)
  {
    assert NIL != sign_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8014L)
  public static SubLObject sign_type(final SubLObject v_object)
  {
    assert NIL != sign_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8014L)
  public static SubLObject sign_info(final SubLObject v_object)
  {
    assert NIL != sign_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8014L)
  public static SubLObject sign_category(final SubLObject v_object)
  {
    assert NIL != sign_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8014L)
  public static SubLObject sign_constituents(final SubLObject v_object)
  {
    assert NIL != sign_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8014L)
  public static SubLObject sign_offset(final SubLObject v_object)
  {
    assert NIL != sign_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8014L)
  public static SubLObject sign_mother(final SubLObject v_object)
  {
    assert NIL != sign_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8014L)
  public static SubLObject _csetf_sign_string(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sign_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8014L)
  public static SubLObject _csetf_sign_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sign_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8014L)
  public static SubLObject _csetf_sign_info(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sign_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8014L)
  public static SubLObject _csetf_sign_category(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sign_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8014L)
  public static SubLObject _csetf_sign_constituents(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sign_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8014L)
  public static SubLObject _csetf_sign_offset(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sign_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8014L)
  public static SubLObject _csetf_sign_mother(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sign_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8014L)
  public static SubLObject make_sign(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sign_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw24$STRING ) )
      {
        _csetf_sign_string( v_new, current_value );
      }
      else if( pcase_var.eql( $kw25$TYPE ) )
      {
        _csetf_sign_type( v_new, current_value );
      }
      else if( pcase_var.eql( $kw26$INFO ) )
      {
        _csetf_sign_info( v_new, current_value );
      }
      else if( pcase_var.eql( $kw27$CATEGORY ) )
      {
        _csetf_sign_category( v_new, current_value );
      }
      else if( pcase_var.eql( $kw28$CONSTITUENTS ) )
      {
        _csetf_sign_constituents( v_new, current_value );
      }
      else if( pcase_var.eql( $kw29$OFFSET ) )
      {
        _csetf_sign_offset( v_new, current_value );
      }
      else if( pcase_var.eql( $kw30$MOTHER ) )
      {
        _csetf_sign_mother( v_new, current_value );
      }
      else
      {
        Errors.error( $str31$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8014L)
  public static SubLObject visit_defstruct_sign(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw32$BEGIN, $sym33$MAKE_SIGN, SEVEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw34$SLOT, $kw24$STRING, sign_string( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$SLOT, $kw25$TYPE, sign_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$SLOT, $kw26$INFO, sign_info( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$SLOT, $kw27$CATEGORY, sign_category( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$SLOT, $kw28$CONSTITUENTS, sign_constituents( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$SLOT, $kw29$OFFSET, sign_offset( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$SLOT, $kw30$MOTHER, sign_mother( obj ) );
    Functions.funcall( visitor_fn, obj, $kw35$END, $sym33$MAKE_SIGN, SEVEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8014L)
  public static SubLObject visit_defstruct_object_sign_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sign( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8683L)
  public static SubLObject new_sign()
  {
    final SubLObject sign = make_sign( UNPROVIDED );
    _csetf_sign_type( sign, $kw37$SIGN );
    _csetf_sign_string( sign, $str38$ );
    return sign;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8868L)
  public static SubLObject sxhash_sign(final SubLObject sign)
  {
    final SubLObject id = ( NIL != pph_phrase.pph_phrase_p( sign, UNPROVIDED ) ) ? pph_phrase.pph_phrase_suid( sign ) : NIL;
    if( id.isFixnum() )
    {
      return id;
    }
    return Sxhash.sxhash( sign_string( sign ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9103L)
  public static SubLObject sxhash_sign_method(final SubLObject v_object)
  {
    return sxhash_sign( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9172L)
  public static SubLObject sign_print(final SubLObject sign, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != sign_p( sign ) : sign;
    if( NIL != pph_phrase.pph_phrase_p( sign, UNPROVIDED ) )
    {
      if( NIL != pph_vars.verbose_print_pph_phrasesP() )
      {
        pph_phrase.verbose_print_pph_phrase( sign, stream );
      }
      else
      {
        pph_phrase.terse_print_pph_phrase( sign, stream );
      }
    }
    else
    {
      streams_high.write_string( $str40$__, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( sign_type( sign ), stream );
      if( NIL != sign_category( sign ) )
      {
        streams_high.write_string( $str41$_, stream, UNPROVIDED, UNPROVIDED );
        print_high.princ( sign_category( sign ), stream );
        streams_high.write_string( $str42$_, stream, UNPROVIDED, UNPROVIDED );
      }
      streams_high.write_string( $str43$__, stream, UNPROVIDED, UNPROVIDED );
      if( NIL != word_p( sign ) || ( NIL != pph_phrase.pph_phrase_p( sign, UNPROVIDED ) && sign_string( sign ).isString() ) )
      {
        streams_high.write_string( Sequences.cconcatenate( $str44$_, new SubLObject[] { sign_string( sign ), $str44$_
        } ), stream, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        SubLObject cdotimes_end_var;
        SubLObject i;
        for( cdotimes_end_var = Numbers.min( sign_length( sign ), $text_class_print_length$.getDynamicValue( thread ) ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          streams_high.write_string( $str45$_, stream, UNPROVIDED, UNPROVIDED );
          sign_print( sign_get( sign, i ), stream, ZERO_INTEGER );
        }
      }
      if( $text_class_print_length$.getDynamicValue( thread ).numL( sign_length( sign ) ) )
      {
        streams_high.write_string( $str46$____, stream, UNPROVIDED, UNPROVIDED );
      }
      if( NIL != sign_info( sign ) )
      {
        print_high.princ( $str47$_, stream );
        print_high.princ( sign_info( sign ), stream );
      }
      streams_high.write_string( $str48$_, stream, UNPROVIDED, UNPROVIDED );
      streams_high.terpri( stream );
    }
    return sign;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10246L)
  public static SubLObject sign_get(final SubLObject sign, final SubLObject index)
  {
    return Vectors.aref( sign_constituents( sign ), index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10428L)
  public static SubLObject sign_set(final SubLObject sign, final SubLObject index, final SubLObject v_object)
  {
    final SubLObject old_object = Vectors.aref( sign_constituents( sign ), index );
    Vectors.set_aref( sign_constituents( sign ), index, v_object );
    _csetf_sign_mother( v_object, sign );
    return old_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10817L)
  public static SubLObject sign_length(final SubLObject sign)
  {
    return Sequences.length( sign_constituents( sign ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10975L)
  public static SubLObject sign_update(final SubLObject sign, final SubLObject slot_values)
  {
    assert NIL != sign_p( sign ) : sign;
    assert NIL != Types.listp( slot_values ) : slot_values;
    SubLObject remaining_slot_values = NIL;
    SubLObject slot = NIL;
    SubLObject value = NIL;
    remaining_slot_values = slot_values;
    slot = remaining_slot_values.first();
    value = conses_high.second( remaining_slot_values );
    while ( NIL != slot)
    {
      final SubLObject pcase_var = slot;
      if( pcase_var.eql( $kw24$STRING ) )
      {
        assert NIL != Types.stringp( value ) : value;
        _csetf_sign_string( sign, value );
      }
      else if( pcase_var.eql( $kw27$CATEGORY ) )
      {
        _csetf_sign_category( sign, value );
      }
      else if( pcase_var.eql( $kw28$CONSTITUENTS ) )
      {
        assert NIL != Types.vectorp( value ) : value;
        _csetf_sign_constituents( sign, value );
      }
      else if( pcase_var.eql( $kw29$OFFSET ) )
      {
        _csetf_sign_offset( sign, value );
      }
      else if( pcase_var.eql( $kw26$INFO ) )
      {
        _csetf_sign_info( sign, value );
      }
      else if( pcase_var.eql( $kw30$MOTHER ) )
      {
        _csetf_sign_mother( sign, value );
      }
      else
      {
        Errors.error( $str52$Attempt_to_set_the_non_existing_s, slot );
      }
      remaining_slot_values = remaining_slot_values.rest().rest();
      slot = remaining_slot_values.first();
      value = conses_high.second( remaining_slot_values );
    }
    return sign;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12056L)
  public static SubLObject sign_do_constituents(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list53 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject constituent = NIL;
    SubLObject sign = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list53 );
    constituent = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list53 );
    sign = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym54$CDOVECTOR, ConsesLow.list( constituent, ConsesLow.list( $sym18$SIGN_CONSTITUENTS, sign ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list53 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12332L)
  public static SubLObject sign_yield(final SubLObject sign)
  {
    SubLObject words = NIL;
    if( NIL != word_p( sign ) )
    {
      words = ConsesLow.cons( sign, words );
    }
    else
    {
      final SubLObject vector_var = sign_constituents( sign );
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject constituent;
      for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        constituent = Vectors.aref( vector_var, element_num );
        words = ConsesLow.nconc( words, sign_yield( constituent ) );
      }
    }
    return words;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12665L)
  public static SubLObject sign_intervals(final SubLObject sign, SubLObject start)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    assert NIL != sign_p( sign ) : sign;
    assert NIL != subl_promotions.non_negative_integer_p( start ) : start;
    final SubLObject pcase_var = sign_type( sign );
    if( pcase_var.eql( $kw56$W ) )
    {
      return word_intervals( sign, start );
    }
    if( pcase_var.eql( $kw57$P ) )
    {
      return phrase_intervals( sign, start );
    }
    Errors.error( $str58$Unknown_sign_subclass__a, sign_type( sign ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13279L)
  public static SubLObject new_exhaustive_word(SubLObject slot_values)
  {
    if( slot_values == UNPROVIDED )
    {
      slot_values = NIL;
    }
    final SubLObject word = new_word( slot_values );
    _csetf_sign_type( word, $kw59$XW );
    return word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13976L)
  public static SubLObject new_exhaustive_word_from_word(final SubLObject original_word)
  {
    final SubLObject new_word = copy_word( original_word );
    _csetf_sign_type( new_word, $kw59$XW );
    return new_word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14246L)
  public static SubLObject exhaustive_word_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != sign_p( v_object ) && sign_type( v_object ) == $kw59$XW );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14352L)
  public static SubLObject new_word(SubLObject slot_values)
  {
    if( slot_values == UNPROVIDED )
    {
      slot_values = NIL;
    }
    assert NIL != Types.listp( slot_values ) : slot_values;
    final SubLObject word = make_sign( UNPROVIDED );
    _csetf_sign_type( word, $kw56$W );
    word_update( word, slot_values );
    return word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14701L)
  public static SubLObject copy_word(final SubLObject word)
  {
    final SubLObject is_exhaustive = exhaustive_word_p( word );
    final SubLObject new_word = ( NIL != is_exhaustive ) ? new_exhaustive_word( UNPROVIDED ) : new_word( UNPROVIDED );
    SubLObject values = ConsesLow.list( new SubLObject[] { $kw24$STRING, word_string( word ), $kw26$INFO, word_info( word ), $kw27$CATEGORY, word_category( word ), $kw29$OFFSET, word_offset( word ), $kw30$MOTHER,
      word_mother( word )
    } );
    if( NIL != is_exhaustive )
    {
      values = conses_high.putf( values, $kw28$CONSTITUENTS, word_constituents( word ) );
    }
    sign_update( new_word, values );
    return new_word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15198L)
  public static SubLObject word_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != sign_p( v_object ) && NIL != conses_high.member( sign_type( v_object ), $list60, Symbols.symbol_function( EQ ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15376L)
  public static SubLObject set_word_string(final SubLObject word, final SubLObject string)
  {
    return word_update( word, ConsesLow.list( $kw24$STRING, string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15472L)
  public static SubLObject word_string(final SubLObject word)
  {
    assert NIL != word_p( word ) : word;
    return sign_string( word );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15634L)
  public static SubLObject set_word_category(final SubLObject word, final SubLObject category)
  {
    return word_update( word, ConsesLow.list( $kw27$CATEGORY, category ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15738L)
  public static SubLObject word_category(final SubLObject word)
  {
    assert NIL != word_p( word ) : word;
    return sign_category( word );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15898L)
  public static SubLObject word_offset(final SubLObject word)
  {
    assert NIL != word_p( word ) : word;
    return sign_offset( word );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16053L)
  public static SubLObject word_length(final SubLObject word)
  {
    assert NIL != word_p( word ) : word;
    return Sequences.length( word_string( word ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16224L)
  public static SubLObject word_mother(final SubLObject word)
  {
    assert NIL != word_p( word ) : word;
    return sign_mother( word );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16397L)
  public static SubLObject word_info(final SubLObject word)
  {
    assert NIL != word_p( word ) : word;
    return sign_info( word );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16583L)
  public static SubLObject word_constituents(final SubLObject word)
  {
    assert NIL != exhaustive_word_p( word ) : word;
    return sign_constituents( word );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16857L)
  public static SubLObject word_interps(final SubLObject word)
  {
    return conses_high.getf( word_info( word ), $kw63$INTERPS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17147L)
  public static SubLObject word_lex_entries(final SubLObject word)
  {
    return conses_high.getf( word_info( word ), $kw64$LEX_ENTRIES, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17454L)
  public static SubLObject word_cycls(final SubLObject word)
  {
    return Sequences.remove_duplicates( nl_api_datastructures.cycls_from_nl_interps( conses_high.getf( word_info( word ), $kw63$INTERPS, UNPROVIDED ) ), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17818L)
  public static SubLObject word_cyc_pos(final SubLObject word)
  {
    return conses_high.getf( word_info( word ), $kw65$CYC_POS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18100L)
  public static SubLObject word_update(final SubLObject word, final SubLObject slot_values)
  {
    assert NIL != word_p( word ) : word;
    assert NIL != Types.listp( slot_values ) : slot_values;
    return sign_update( word, slot_values );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18517L)
  public static SubLObject word_index(final SubLObject word)
  {
    final SubLObject sentence = word_mother( word );
    SubLObject i = ZERO_INTEGER;
    if( NIL != sentence )
    {
      while ( !i.numG( sentence_length( sentence ) ) && !word.eql( sentence_get( sentence, i ) ))
      {
        i = Numbers.add( i, ONE_INTEGER );
      }
      return i;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18830L)
  public static SubLObject word_intervals(final SubLObject word, SubLObject start)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    assert NIL != word_p( word ) : word;
    assert NIL != Types.integerp( start ) : start;
    return ConsesLow.list( standard_tokenization.new_interval_token( start, Numbers.add( start, ONE_INTEGER ), word ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19107L)
  public static SubLObject word_capitalize(final SubLObject word)
  {
    assert NIL != word_p( word ) : word;
    string_utilities.nupcase_leading( word_string( word ) );
    return word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19375L)
  public static SubLObject word_uncapitalize(final SubLObject word)
  {
    assert NIL != word_p( word ) : word;
    string_utilities.ndowncase_leading( word_string( word ) );
    return word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19651L)
  public static SubLObject build_word_token(final SubLObject fst)
  {
    return new_word( ConsesLow.list( $kw24$STRING, stringify( finite_state_transducer.fst_output( fst ) ), $kw28$CONSTITUENTS, Functions.apply( Symbols.symbol_function( $sym67$VECTOR ), finite_state_transducer
        .fst_output( fst ) ), $kw29$OFFSET, finite_state_transducer.fst_output_start( fst ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19995L)
  public static SubLObject stringify(final SubLObject chars)
  {
    SubLObject string = Strings.make_string( Sequences.length( chars ), UNPROVIDED );
    SubLObject has_unicodeP = NIL;
    SubLObject i = ZERO_INTEGER;
    if( NIL == has_unicodeP )
    {
      SubLObject csome_list_var = chars;
      SubLObject v_char = NIL;
      v_char = csome_list_var.first();
      while ( NIL == has_unicodeP && NIL != csome_list_var)
      {
        if( v_char.isString() )
        {
          has_unicodeP = T;
        }
        else
        {
          Strings.set_char( string, i, v_char );
        }
        i = Numbers.add( i, ONE_INTEGER );
        csome_list_var = csome_list_var.rest();
        v_char = csome_list_var.first();
      }
    }
    if( NIL == has_unicodeP )
    {
      return string;
    }
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      SubLObject cdolist_list_var = chars;
      SubLObject v_char2 = NIL;
      v_char2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        print_high.princ( v_char2, s );
        cdolist_list_var = cdolist_list_var.rest();
        v_char2 = cdolist_list_var.first();
      }
      string = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20599L)
  public static SubLObject no_space_before_following_wordP(final SubLObject word)
  {
    final SubLObject word_end = Numbers.add( word_offset( word ), word_length( word ) );
    final SubLObject next_word_offset = next_word_offset( word );
    return makeBoolean( NIL != next_word_offset && NIL != word_end && next_word_offset.eql( word_end ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20977L)
  public static SubLObject next_word_offset(final SubLObject word)
  {
    final SubLObject sentence = word_mother( word );
    final SubLObject word_index = word_index( word );
    SubLObject next_word = NIL;
    if( word_index.isInteger() && !number_utilities.f_1X( word_index ).numGE( sentence_length( sentence ) ) )
    {
      next_word = sentence_get( sentence, number_utilities.f_1X( word_index ) );
    }
    if( NIL != next_word )
    {
      return word_offset( next_word );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21472L)
  public static SubLObject string_tokenize_via_wordify(final SubLObject string)
  {
    final SubLObject word_array = string_wordify( string, UNPROVIDED );
    SubLObject result = NIL;
    final SubLObject vector_var = word_array;
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject word;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      word = Vectors.aref( vector_var, element_num );
      result = ConsesLow.cons( word_string( word ), result );
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22141L)
  public static SubLObject string_wordify(final SubLObject string, SubLObject wordifier)
  {
    if( wordifier == UNPROVIDED )
    {
      wordifier = $wordifier$.getDynamicValue();
    }
    return Functions.funcall( wordifier, string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22340L)
  public static SubLObject fst_string_wordify(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $fst_string_wordify_lock$.getGlobalValue() );
      return finite_state_transducer.fst_match_global( $wordifier_fst$.getDynamicValue( thread ), unicode_strings.utf8_string_to_unicode_vector( string ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $fst_string_wordify_lock$.getGlobalValue() );
      }
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22517L)
  public static SubLObject rkf_standard_string_wordify(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result_vector = NIL;
    if( NIL == result_vector )
    {
      SubLObject csome_list_var = ConsesLow.list( $sym73$RKF_CH_STRING_TOKENIZE, $sym74$STANDARD_STRING_TOKENIZE, $sym75$SPLIT_STRING );
      SubLObject tokenizer = NIL;
      tokenizer = csome_list_var.first();
      while ( NIL == result_vector && NIL != csome_list_var)
      {
        SubLObject ignore_errors_tag = NIL;
        try
        {
          thread.throwStack.push( $kw71$IGNORE_ERRORS_TARGET );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( Symbols.symbol_function( $sym72$IGNORE_ERRORS_HANDLER ), thread );
            try
            {
              final SubLObject tokens = Functions.funcall( tokenizer, string );
              SubLObject words = NIL;
              SubLObject current_offset = ZERO_INTEGER;
              SubLObject cdolist_list_var = tokens;
              SubLObject token = NIL;
              token = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                current_offset = Sequences.search( token, string, EQUAL, IDENTITY, ZERO_INTEGER, NIL, current_offset, UNPROVIDED );
                SubLObject word_args = ConsesLow.list( $kw24$STRING, token );
                if( current_offset.isNumber() )
                {
                  word_args = conses_high.putf( word_args, $kw29$OFFSET, current_offset );
                  current_offset = Numbers.add( current_offset, Sequences.length( token ) );
                }
                words = ConsesLow.cons( new_word( word_args ), words );
                cdolist_list_var = cdolist_list_var.rest();
                token = cdolist_list_var.first();
              }
              result_vector = Sequences.nreverse( words );
            }
            catch( final Throwable catch_var )
            {
              Errors.handleThrowable( catch_var, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw71$IGNORE_ERRORS_TARGET );
        }
        finally
        {
          thread.throwStack.pop();
        }
        csome_list_var = csome_list_var.rest();
        tokenizer = csome_list_var.first();
      }
    }
    return list_utilities.list2vector( result_vector );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23690L)
  public static SubLObject clear_html_string_wordify_punctuation_chars()
  {
    final SubLObject cs = $html_string_wordify_punctuation_chars_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23690L)
  public static SubLObject remove_html_string_wordify_punctuation_chars()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $html_string_wordify_punctuation_chars_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23690L)
  public static SubLObject html_string_wordify_punctuation_chars_internal()
  {
    return ConsesLow.cons( Characters.CHAR_less, ConsesLow.cons( Characters.CHAR_greater, ConsesLow.cons( Characters.CHAR_space, standard_tokenization.standard_punctuation_chars() ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23690L)
  public static SubLObject html_string_wordify_punctuation_chars()
  {
    SubLObject caching_state = $html_string_wordify_punctuation_chars_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym76$HTML_STRING_WORDIFY_PUNCTUATION_CHARS, $sym77$_HTML_STRING_WORDIFY_PUNCTUATION_CHARS_CACHING_STATE_, NIL, EQL, ZERO_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( html_string_wordify_punctuation_chars_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23906L)
  public static SubLObject html_string_wordify_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_hsw_state( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23906L)
  public static SubLObject html_string_wordify_state_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $html_string_wordify_state_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23906L)
  public static SubLObject hsw_state_state(final SubLObject v_object)
  {
    assert NIL != html_string_wordify_state_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23906L)
  public static SubLObject hsw_state_tag_pieces(final SubLObject v_object)
  {
    assert NIL != html_string_wordify_state_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23906L)
  public static SubLObject hsw_state_string_pieces(final SubLObject v_object)
  {
    assert NIL != html_string_wordify_state_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23906L)
  public static SubLObject hsw_state_punctuation_pieces(final SubLObject v_object)
  {
    assert NIL != html_string_wordify_state_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23906L)
  public static SubLObject hsw_state_leading_tags(final SubLObject v_object)
  {
    assert NIL != html_string_wordify_state_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23906L)
  public static SubLObject hsw_state_following_tags(final SubLObject v_object)
  {
    assert NIL != html_string_wordify_state_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23906L)
  public static SubLObject hsw_state_current_offset(final SubLObject v_object)
  {
    assert NIL != html_string_wordify_state_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23906L)
  public static SubLObject _csetf_hsw_state_state(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != html_string_wordify_state_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23906L)
  public static SubLObject _csetf_hsw_state_tag_pieces(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != html_string_wordify_state_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23906L)
  public static SubLObject _csetf_hsw_state_string_pieces(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != html_string_wordify_state_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23906L)
  public static SubLObject _csetf_hsw_state_punctuation_pieces(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != html_string_wordify_state_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23906L)
  public static SubLObject _csetf_hsw_state_leading_tags(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != html_string_wordify_state_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23906L)
  public static SubLObject _csetf_hsw_state_following_tags(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != html_string_wordify_state_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23906L)
  public static SubLObject _csetf_hsw_state_current_offset(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != html_string_wordify_state_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23906L)
  public static SubLObject make_html_string_wordify_state(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $html_string_wordify_state_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw101$STATE ) )
      {
        _csetf_hsw_state_state( v_new, current_value );
      }
      else if( pcase_var.eql( $kw102$TAG_PIECES ) )
      {
        _csetf_hsw_state_tag_pieces( v_new, current_value );
      }
      else if( pcase_var.eql( $kw103$STRING_PIECES ) )
      {
        _csetf_hsw_state_string_pieces( v_new, current_value );
      }
      else if( pcase_var.eql( $kw104$PUNCTUATION_PIECES ) )
      {
        _csetf_hsw_state_punctuation_pieces( v_new, current_value );
      }
      else if( pcase_var.eql( $kw105$LEADING_TAGS ) )
      {
        _csetf_hsw_state_leading_tags( v_new, current_value );
      }
      else if( pcase_var.eql( $kw106$FOLLOWING_TAGS ) )
      {
        _csetf_hsw_state_following_tags( v_new, current_value );
      }
      else if( pcase_var.eql( $kw107$CURRENT_OFFSET ) )
      {
        _csetf_hsw_state_current_offset( v_new, current_value );
      }
      else
      {
        Errors.error( $str31$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23906L)
  public static SubLObject visit_defstruct_html_string_wordify_state(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw32$BEGIN, $sym108$MAKE_HTML_STRING_WORDIFY_STATE, SEVEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw34$SLOT, $kw101$STATE, hsw_state_state( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$SLOT, $kw102$TAG_PIECES, hsw_state_tag_pieces( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$SLOT, $kw103$STRING_PIECES, hsw_state_string_pieces( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$SLOT, $kw104$PUNCTUATION_PIECES, hsw_state_punctuation_pieces( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$SLOT, $kw105$LEADING_TAGS, hsw_state_leading_tags( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$SLOT, $kw106$FOLLOWING_TAGS, hsw_state_following_tags( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$SLOT, $kw107$CURRENT_OFFSET, hsw_state_current_offset( obj ) );
    Functions.funcall( visitor_fn, obj, $kw35$END, $sym108$MAKE_HTML_STRING_WORDIFY_STATE, SEVEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23906L)
  public static SubLObject visit_defstruct_object_html_string_wordify_state_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_html_string_wordify_state( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24136L)
  public static SubLObject print_hsw_state(final SubLObject state, SubLObject stream, SubLObject depth)
  {
    if( stream == UNPROVIDED )
    {
      stream = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    PrintLow.format( stream, $str110$__S__S_, hsw_state_state( state ), hsw_state_string_pieces( state ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24325L)
  public static SubLObject new_html_string_wordify_state()
  {
    return make_html_string_wordify_state( $list111 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24459L)
  public static SubLObject classify_html_string_token(final SubLObject token, final SubLObject punctuation)
  {
    if( string_utilities.first_char( token ).eql( Characters.CHAR_space ) )
    {
      return $kw112$SPACE;
    }
    if( string_utilities.first_char( token ).eql( Characters.CHAR_greater ) )
    {
      return $kw113$END_OF_TAG;
    }
    if( string_utilities.first_char( token ).eql( Characters.CHAR_less ) )
    {
      return $kw114$START_OF_TAG;
    }
    if( NIL != conses_high.member( string_utilities.first_char( token ), punctuation, UNPROVIDED, UNPROVIDED ) )
    {
      return $kw115$PUNCTUATION;
    }
    return $kw116$DEFAULT;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24790L)
  public static SubLObject html_string_wordify(final SubLObject html_string)
  {
    SubLObject words = NIL;
    final SubLObject white_space_chars = NIL;
    final SubLObject punctuation = html_string_wordify_punctuation_chars();
    final SubLObject chunked;
    final SubLObject raw_tokens = chunked = standard_tokenization.tokenize_sentence( html_string, white_space_chars, punctuation, UNPROVIDED );
    final SubLObject state = new_html_string_wordify_state();
    SubLObject list_var = NIL;
    SubLObject token = NIL;
    SubLObject i = NIL;
    list_var = chunked;
    token = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), token = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      final SubLObject v_class = classify_html_string_token( token, punctuation );
      final SubLObject pcase_var = hsw_state_state( state );
      if( pcase_var.eql( $kw117$INSIDE_TAG ) )
      {
        _csetf_hsw_state_tag_pieces( state, ConsesLow.cons( token, hsw_state_tag_pieces( state ) ) );
        if( v_class == $kw113$END_OF_TAG )
        {
          final SubLObject tag = tag_from_hsw_state( state );
          if( NIL != hsw_state_string_pieces( state ) )
          {
            _csetf_hsw_state_following_tags( state, ConsesLow.cons( tag, hsw_state_following_tags( state ) ) );
          }
          else
          {
            _csetf_hsw_state_leading_tags( state, ConsesLow.cons( tag, hsw_state_leading_tags( state ) ) );
          }
          _csetf_hsw_state_state( state, $kw118$NORMAL );
        }
      }
      else if( pcase_var.eql( $kw118$NORMAL ) )
      {
        if( v_class == $kw114$START_OF_TAG )
        {
          if( NIL != hsw_state_string_pieces( state ) && !Characters.CHAR_slash.eql( string_utilities.first_char( hsw_peek_next_token( i, chunked ) ) ) )
          {
            final SubLObject word = new_word_from_hsw_state( state );
            words = ConsesLow.cons( word, words );
          }
          _csetf_hsw_state_tag_pieces( state, ConsesLow.list( token ) );
          _csetf_hsw_state_state( state, $kw117$INSIDE_TAG );
        }
        else if( v_class == $kw112$SPACE )
        {
          if( NIL != hsw_state_string_pieces( state ) )
          {
            final SubLObject word = new_word_from_hsw_state( state );
            words = ConsesLow.cons( word, words );
          }
          _csetf_hsw_state_punctuation_pieces( state, ConsesLow.cons( token, hsw_state_punctuation_pieces( state ) ) );
        }
        else if( v_class == $kw115$PUNCTUATION && ( !string_utilities.first_char( token ).eql( Characters.CHAR_semicolon ) || NIL == list_utilities.lengthGE( chunked, Numbers.add( TWO_INTEGER, i ), UNPROVIDED )
            || NIL == conses_high.member( classify_html_string_token( hsw_peek_next_token( i, chunked ), punctuation ), $list119, UNPROVIDED, UNPROVIDED ) ) )
        {
          if( NIL != hsw_state_string_pieces( state ) )
          {
            final SubLObject word = new_word_from_hsw_state( state );
            words = ConsesLow.cons( word, words );
          }
          hsw_state_add_string_piece( state, token );
        }
        else
        {
          hsw_state_add_string_piece( state, token );
        }
      }
      else
      {
        Errors.error( $str120$Unknown_state___S, hsw_state_state( state ) );
      }
      _csetf_hsw_state_current_offset( state, Numbers.add( hsw_state_current_offset( state ), Sequences.length( token ) ) );
    }
    if( NIL != hsw_state_string_pieces( state ) )
    {
      final SubLObject word2 = new_word_from_hsw_state( state );
      words = ConsesLow.cons( word2, words );
    }
    else if( NIL != hsw_state_punctuation_pieces( state ) )
    {
      final SubLObject word2 = words.first();
      SubLObject info = word_info( word2 );
      info = conses_high.putf( info, $kw121$FOLLOWING_WHITESPACE, string_utilities.join_strings( Sequences.nreverse( hsw_state_punctuation_pieces( state ) ), string_utilities.$empty_string$.getGlobalValue() ) );
      word_update( word2, ConsesLow.list( $kw26$INFO, info ) );
    }
    return Sequences.nreverse( words );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27515L)
  public static SubLObject hsw_peek_next_token(final SubLObject i, final SubLObject tokens)
  {
    return ConsesLow.nth( number_utilities.f_1X( i ), tokens );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27592L)
  public static SubLObject hsw_state_add_string_piece(final SubLObject state, final SubLObject token)
  {
    _csetf_hsw_state_string_pieces( state, ConsesLow.cons( token, hsw_state_string_pieces( state ) ) );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27713L)
  public static SubLObject hsw_state_clear_string_pieces(final SubLObject state)
  {
    _csetf_hsw_state_string_pieces( state, NIL );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27828L)
  public static SubLObject tag_from_hsw_state(final SubLObject state)
  {
    final SubLObject tag = string_utilities.join_strings( Sequences.nreverse( hsw_state_tag_pieces( state ) ), string_utilities.$empty_string$.getGlobalValue() );
    _csetf_hsw_state_tag_pieces( state, NIL );
    return tag;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28018L)
  public static SubLObject new_word_from_hsw_state(final SubLObject state)
  {
    final SubLObject string = string_utilities.join_strings( Sequences.nreverse( hsw_state_string_pieces( state ) ), string_utilities.$empty_string$.getGlobalValue() );
    final SubLObject leading_tag_string = ( NIL != hsw_state_leading_tags( state ) ) ? string_utilities.join_strings( Sequences.nreverse( hsw_state_leading_tags( state ) ), string_utilities.$empty_string$
        .getGlobalValue() ) : NIL;
    final SubLObject following_tag_string = ( NIL != hsw_state_following_tags( state ) ) ? string_utilities.join_strings( Sequences.nreverse( hsw_state_following_tags( state ) ), string_utilities.$empty_string$
        .getGlobalValue() ) : NIL;
    final SubLObject punctuation_string = ( NIL != hsw_state_punctuation_pieces( state ) ) ? string_utilities.join_strings( Sequences.nreverse( hsw_state_punctuation_pieces( state ) ), string_utilities.$empty_string$
        .getGlobalValue() ) : NIL;
    final SubLObject offset = Numbers.subtract( hsw_state_current_offset( state ), Sequences.length( string ), Sequences.length( following_tag_string ) );
    final SubLObject word = new_word( ConsesLow.list( $kw24$STRING, string, $kw29$OFFSET, offset ) );
    hsw_state_clear_string_pieces( state );
    SubLObject info = word_info( word );
    if( NIL != leading_tag_string )
    {
      info = conses_high.putf( info, $kw105$LEADING_TAGS, leading_tag_string );
      _csetf_hsw_state_leading_tags( state, NIL );
    }
    if( NIL != following_tag_string )
    {
      info = conses_high.putf( info, $kw106$FOLLOWING_TAGS, following_tag_string );
      _csetf_hsw_state_following_tags( state, NIL );
    }
    if( NIL != punctuation_string )
    {
      info = conses_high.putf( info, $kw123$LEADING_WHITESPACE, punctuation_string );
      _csetf_hsw_state_punctuation_pieces( state, NIL );
    }
    word_update( word, ConsesLow.list( $kw26$INFO, info ) );
    return word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29340L)
  public static SubLObject fst_wordify_test(final SubLObject word_vector, SubLObject expected_tokenization)
  {
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject word;
    for( length = Sequences.length( word_vector ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      word = Vectors.aref( word_vector, element_num );
      if( !word_string( word ).equal( expected_tokenization.first() ) )
      {
        return NIL;
      }
      expected_tokenization = expected_tokenization.rest();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30817L)
  public static SubLObject string_to_xml(final SubLObject string)
  {
    return string_utilities.do_string_substitutions( string, $xml_string_mapping$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31027L)
  public static SubLObject word_to_xml(final SubLObject word, SubLObject level)
  {
    if( level == UNPROVIDED )
    {
      level = ZERO_INTEGER;
    }
    return PrintLow.format( NIL, $str133$_a_WRD_a__a__WRD__a, new SubLObject[] { string_utilities.tabstr( level, $xml_indent$.getGlobalValue() ), ( NIL != word_category( word ) ) ? Sequences.cconcatenate( $str134$_tag__,
        new SubLObject[]
        { word_category( word ), $str44$_
        } ) : string_utilities.$empty_string$.getGlobalValue(), string_to_xml( word_string( word ) ), $newline$.getGlobalValue()
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31479L)
  public static SubLObject end_of_sentence_word_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != word_p( v_object ) && NIL != conses_high.member( word_string( v_object ), $list135, EQUALP, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31739L)
  public static SubLObject quote_word_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != word_p( v_object ) && NIL != conses_high.member( word_string( v_object ), $list136, EQUALP, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31947L)
  public static SubLObject newline_word_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != word_p( v_object ) && NIL != Strings.stringE( word_string( v_object ), $str137$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32138L)
  public static SubLObject punctuation_sign_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != sign_p( v_object ) && NIL != conses_high.member( sign_string( v_object ), $list138, EQUALP, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32441L)
  public static SubLObject sentence_final_punctuation_charP(final SubLObject v_char)
  {
    return conses_high.member( v_char, $list139, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32575L)
  public static SubLObject sentence_internal_punctuation_charP(final SubLObject v_char)
  {
    return conses_high.member( v_char, $list140, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32705L)
  public static SubLObject any_punctuation_charP(final SubLObject v_char)
  {
    return makeBoolean( NIL != sentence_final_punctuation_charP( v_char ) || NIL != sentence_internal_punctuation_charP( v_char ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32854L)
  public static SubLObject quote_charP(final SubLObject v_char)
  {
    return conses_high.member( v_char, $list141, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32928L)
  public static SubLObject new_phrase(SubLObject slot_values)
  {
    if( slot_values == UNPROVIDED )
    {
      slot_values = NIL;
    }
    assert NIL != Types.listp( slot_values ) : slot_values;
    final SubLObject phrase = make_sign( UNPROVIDED );
    _csetf_sign_type( phrase, $kw57$P );
    phrase_update( phrase, slot_values );
    return phrase;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33321L)
  public static SubLObject phrase_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != sign_p( v_object ) && sign_type( v_object ) == $kw57$P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33480L)
  public static SubLObject phrase_string(final SubLObject phrase)
  {
    assert NIL != phrase_p( phrase ) : phrase;
    return sign_string( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33650L)
  public static SubLObject phrase_category(final SubLObject phrase)
  {
    assert NIL != phrase_p( phrase ) : phrase;
    return sign_category( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33826L)
  public static SubLObject phrase_yield(final SubLObject phrase)
  {
    assert NIL != phrase_p( phrase ) : phrase;
    return Functions.apply( $sym67$VECTOR, sign_yield( phrase ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34021L)
  public static SubLObject phrase_do_constituents(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list143 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject constituent = NIL;
    SubLObject phrase = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list143 );
    constituent = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list143 );
    phrase = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym144$SIGN_DO_CONSTITUENTS, ConsesLow.list( constituent, phrase ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list143 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34302L)
  public static SubLObject phrase_constituents(final SubLObject phrase)
  {
    assert NIL != phrase_p( phrase ) : phrase;
    return sign_constituents( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34490L)
  public static SubLObject phrase_nodes(final SubLObject phrase)
  {
    assert NIL != phrase_p( phrase ) : phrase;
    SubLObject nodes = ConsesLow.list( phrase );
    final SubLObject vector_var = sign_constituents( phrase );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject daughter;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      daughter = Vectors.aref( vector_var, element_num );
      nodes = ConsesLow.nconc( nodes, ( NIL != phrase_p( daughter ) ) ? phrase_nodes( daughter ) : ConsesLow.list( daughter ) );
    }
    return nodes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34847L)
  public static SubLObject phrase_intervals(final SubLObject phrase, SubLObject start)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    assert NIL != phrase_p( phrase ) : phrase;
    assert NIL != Types.integerp( start ) : start;
    SubLObject nodes = NIL;
    SubLObject daughter_index = start;
    final SubLObject vector_var = sign_constituents( phrase );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject daughter;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      daughter = Vectors.aref( vector_var, element_num );
      nodes = ConsesLow.nconc( ( NIL != phrase_p( daughter ) ) ? phrase_intervals( daughter, daughter_index )
          : ConsesLow.list( standard_tokenization.new_interval_token( daughter_index, Numbers.add( daughter_index, ONE_INTEGER ), daughter ) ), nodes );
      daughter_index = standard_tokenization.interval_token_end( nodes.first() );
    }
    nodes = ConsesLow.cons( standard_tokenization.new_interval_token( start, standard_tokenization.interval_token_end( nodes.first() ), phrase ), nodes );
    return nodes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35631L)
  public static SubLObject phrase_info(final SubLObject phrase)
  {
    assert NIL != phrase_p( phrase ) : phrase;
    return sign_info( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35801L)
  public static SubLObject phrase_update(final SubLObject phrase, final SubLObject slot_values)
  {
    assert NIL != phrase_p( phrase ) : phrase;
    assert NIL != Types.listp( slot_values ) : slot_values;
    return sign_update( phrase, slot_values );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36237L)
  public static SubLObject phrase_get(final SubLObject phrase, final SubLObject index)
  {
    assert NIL != phrase_p( phrase ) : phrase;
    assert NIL != Types.integerp( index ) : index;
    return sign_get( phrase, index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36473L)
  public static SubLObject phrase_set(final SubLObject phrase, final SubLObject index, final SubLObject sign)
  {
    assert NIL != phrase_p( phrase ) : phrase;
    assert NIL != Types.integerp( index ) : index;
    assert NIL != sign_p( sign ) : sign;
    return sign_set( phrase, index, sign );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36822L)
  public static SubLObject phrase_constituent_length(final SubLObject phrase)
  {
    assert NIL != phrase_p( phrase ) : phrase;
    return sign_length( phrase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37023L)
  public static SubLObject phrase_to_xml(final SubLObject phrase, SubLObject level)
  {
    if( level == UNPROVIDED )
    {
      level = ZERO_INTEGER;
    }
    SubLObject daughters_xml = string_utilities.$empty_string$.getGlobalValue();
    final SubLObject vector_var = sign_constituents( phrase );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject daughter;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      daughter = Vectors.aref( vector_var, element_num );
      daughters_xml = Sequences.cconcatenate( daughters_xml, sign_to_xml( daughter, Numbers.add( level, ONE_INTEGER ) ) );
    }
    return PrintLow.format( NIL, $str145$_a_PHR_a__a_a_a__PHR__a, new SubLObject[] { string_utilities.tabstr( level, $xml_indent$.getGlobalValue() ), ( NIL != phrase_category( phrase ) ) ? Sequences.cconcatenate(
        $str146$_cat__, new SubLObject[]
        { print_high.princ_to_string( phrase_category( phrase ) ), $str44$_
        } ) : string_utilities.$empty_string$.getGlobalValue(), $newline$.getGlobalValue(), daughters_xml, string_utilities.tabstr( level, $xml_indent$.getGlobalValue() ), $newline$.getGlobalValue()
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37732L)
  public static SubLObject sentence_do_words(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject word = NIL;
    SubLObject sentence = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    word = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    sentence = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym148$CDOLIST, ConsesLow.list( word, ConsesLow.list( $sym149$SENTENCE_YIELD_EXHAUSTIVE, sentence ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list147 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37999L)
  public static SubLObject sentence_do_minimal_words(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject word = NIL;
    SubLObject sentence = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    word = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    sentence = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym54$CDOVECTOR, ConsesLow.list( word, ConsesLow.list( $sym150$SENTENCE_YIELD, sentence ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list147 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38365L)
  public static SubLObject new_sentence(SubLObject string, SubLObject wordifier)
  {
    if( string == UNPROVIDED )
    {
      string = NIL;
    }
    if( wordifier == UNPROVIDED )
    {
      wordifier = $sym124$FST_STRING_WORDIFY;
    }
    if( NIL != string && !assertionsDisabledInClass && NIL == Types.stringp( string ) )
    {
      throw new AssertionError( string );
    }
    final SubLObject sentence = new_phrase( UNPROVIDED );
    if( NIL != string )
    {
      _csetf_sign_string( sentence, string );
    }
    _csetf_sign_category( sentence, $kw151$S );
    if( NIL != string )
    {
      _csetf_sign_constituents( sentence, string_wordify( string, wordifier ) );
      SubLObject cdolist_list_var = sentence_yield_exhaustive( sentence );
      SubLObject word = NIL;
      word = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        _csetf_sign_mother( word, sentence );
        cdolist_list_var = cdolist_list_var.rest();
        word = cdolist_list_var.first();
      }
    }
    sign_update( sentence, $list152 );
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38937L)
  public static SubLObject sentence_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != phrase_p( v_object ) && phrase_category( v_object ) == $kw151$S );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39111L)
  public static SubLObject sentence_print(final SubLObject sentence, final SubLObject stream, final SubLObject depth)
  {
    return sign_print( sentence, stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39266L)
  public static SubLObject sentence_string(final SubLObject sentence)
  {
    assert NIL != sentence_p( sentence ) : sentence;
    return sign_string( sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39452L)
  public static SubLObject sentence_category(final SubLObject sentence)
  {
    assert NIL != sentence_p( sentence ) : sentence;
    return sign_category( sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39644L)
  public static SubLObject sentence_yield(final SubLObject sentence)
  {
    assert NIL != sentence_p( sentence ) : sentence;
    return phrase_yield( sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39841L)
  public static SubLObject sentence_yield_exhaustive(final SubLObject sentence)
  {
    assert NIL != sentence_p( sentence ) : sentence;
    SubLObject result_yield = NIL;
    final SubLObject vector_var = phrase_yield( sentence );
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
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      word = Vectors.aref( vector_var, element_num );
      if( NIL != exhaustive_word_p( word ) )
      {
        items_var = word_constituents( word );
        if( items_var.isVector() )
        {
          vector_var_$1 = items_var;
          backwardP_var_$2 = NIL;
          for( length_$3 = Sequences.length( vector_var_$1 ), v_iteration_$4 = NIL, v_iteration_$4 = ZERO_INTEGER; v_iteration_$4.numL( length_$3 ); v_iteration_$4 = Numbers.add( v_iteration_$4, ONE_INTEGER ) )
          {
            element_num_$5 = ( ( NIL != backwardP_var_$2 ) ? Numbers.subtract( length_$3, v_iteration_$4, ONE_INTEGER ) : v_iteration_$4 );
            item = Vectors.aref( vector_var_$1, element_num_$5 );
            result_yield = ConsesLow.cons( item, result_yield );
          }
        }
        else
        {
          cdolist_list_var = items_var;
          item2 = NIL;
          item2 = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            result_yield = ConsesLow.cons( item2, result_yield );
            cdolist_list_var = cdolist_list_var.rest();
            item2 = cdolist_list_var.first();
          }
        }
      }
      else
      {
        result_yield = ConsesLow.cons( word, result_yield );
      }
    }
    return Sequences.nreverse( result_yield );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40407L)
  public static SubLObject sentence_constituents(final SubLObject sentence)
  {
    assert NIL != sentence_p( sentence ) : sentence;
    return sign_constituents( sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40611L)
  public static SubLObject sentence_info(final SubLObject sentence)
  {
    assert NIL != sentence_p( sentence ) : sentence;
    return sign_info( sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40797L)
  public static SubLObject sentence_offset(final SubLObject sentence)
  {
    assert NIL != sentence_p( sentence ) : sentence;
    return sign_offset( sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41066L)
  public static SubLObject sentence_index(final SubLObject sentence)
  {
    final SubLObject paragraph = sentence_mother( sentence );
    SubLObject i = ZERO_INTEGER;
    if( NIL != paragraph )
    {
      while ( !sentence.eql( paragraph_get( paragraph, i ) ))
      {
        i = Numbers.add( i, ONE_INTEGER );
      }
      return i;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41361L)
  public static SubLObject sentence_get(final SubLObject sentence, final SubLObject index)
  {
    assert NIL != sentence_p( sentence ) : sentence;
    assert NIL != Types.integerp( index ) : index;
    return sign_get( sentence, index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41587L)
  public static SubLObject sentence_mother(final SubLObject sentence)
  {
    assert NIL != sentence_p( sentence ) : sentence;
    return sign_mother( sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41795L)
  public static SubLObject sentence_set(final SubLObject sentence, final SubLObject index, final SubLObject sign)
  {
    assert NIL != sentence_p( sentence ) : sentence;
    assert NIL != Types.integerp( index ) : index;
    assert NIL != sign_p( sign ) : sign;
    return sign_set( sentence, index, sign );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42198L)
  public static SubLObject sentence_length(final SubLObject sentence)
  {
    assert NIL != sentence_p( sentence ) : sentence;
    return sign_length( sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42404L)
  public static SubLObject sentence_do_constituents(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list154 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject constituent = NIL;
    SubLObject sentence = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list154 );
    constituent = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list154 );
    sentence = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym144$SIGN_DO_CONSTITUENTS, ConsesLow.list( constituent, sentence ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list154 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42639L)
  public static SubLObject sentence_reconstruct_substring(final SubLObject start, final SubLObject end, final SubLObject sentence)
  {
    final SubLObject sentence_string = sentence_string( sentence );
    SubLObject last_index = ZERO_INTEGER;
    SubLObject output_strings = NIL;
    SubLObject i;
    SubLObject word;
    SubLObject word_string;
    SubLObject remaining_sentence_string;
    SubLObject word_start;
    SubLObject first_space;
    SubLObject word_end;
    for( i = NIL, i = ZERO_INTEGER; i.numL( end ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      word = sentence_get( sentence, i );
      word_string = word_string( word );
      remaining_sentence_string = string_utilities.substring( sentence_string, last_index, UNPROVIDED );
      word_start = Sequences.search( word_string, remaining_sentence_string, EQUAL, IDENTITY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      first_space = ( NIL != word_start ) ? NIL : Sequences.search( $str45$_, remaining_sentence_string, EQUAL, IDENTITY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      word_end = word_start.isInteger() ? Numbers.add( word_start, Sequences.length( word_string ) ) : ( first_space.isInteger() ? first_space : ZERO_INTEGER );
      last_index = Numbers.add( last_index, word_end );
      if( i.numGE( start ) )
      {
        if( NIL != output_strings || NIL == word_start )
        {
          word_string = string_utilities.substring( remaining_sentence_string, ZERO_INTEGER, word_end );
        }
        output_strings = ConsesLow.cons( word_string, output_strings );
      }
    }
    return Functions.apply( $sym155$CCONCATENATE, Sequences.nreverse( output_strings ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43883L)
  public static SubLObject construct_string_from_words(final SubLObject words, SubLObject standardizeP, SubLObject stream)
  {
    if( standardizeP == UNPROVIDED )
    {
      standardizeP = NIL;
    }
    if( stream == UNPROVIDED )
    {
      stream = streams_high.make_private_string_output_stream();
    }
    streams_high.clear_output( stream );
    if( NIL != words )
    {
      SubLObject current_end = word_offset( words.first() );
      SubLObject cdolist_list_var = words;
      SubLObject word = NIL;
      word = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( word_offset( word ).numG( current_end ) )
        {
          SubLObject cdotimes_end_var;
          SubLObject n;
          for( cdotimes_end_var = Numbers.subtract( word_offset( word ), current_end ), n = NIL, n = ZERO_INTEGER; n.numL( cdotimes_end_var ); n = Numbers.add( n, ONE_INTEGER ) )
          {
            streams_high.write_string( $str45$_, stream, UNPROVIDED, UNPROVIDED );
            current_end = Numbers.add( current_end, ONE_INTEGER );
          }
        }
        if( NIL != standardizeP )
        {
          final SubLObject standardized = conses_high.caar( nl_trie.nl_trie_standardize_strings( ConsesLow.list( word_string( word ) ) ) );
          streams_high.write_string( ( NIL != standardized ) ? standardized : $str38$, stream, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          streams_high.write_string( word_string( word ), stream, UNPROVIDED, UNPROVIDED );
        }
        current_end = Numbers.add( current_end, Sequences.length( word_string( word ) ) );
        cdolist_list_var = cdolist_list_var.rest();
        word = cdolist_list_var.first();
      }
    }
    return streams_high.get_output_stream_string( stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45017L)
  public static SubLObject sentence_delete_punctuation(final SubLObject sentence)
  {
    assert NIL != sentence_p( sentence ) : sentence;
    Sequences.delete_if( $sym156$PUNCTUATION_SIGN_P, sentence_constituents( sentence ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45359L)
  public static SubLObject sentence_listify(final SubLObject sentence)
  {
    return vector_utilities.vector_elements( sentence_constituents( sentence ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45574L)
  public static SubLObject sentence_stringify(final SubLObject sentence)
  {
    return Mapping.mapcar( $sym10$SIGN_STRING, sentence_listify( sentence ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45773L)
  public static SubLObject build_sentence_token(final SubLObject fst, SubLObject wordifier)
  {
    if( wordifier == UNPROVIDED )
    {
      wordifier = ( NIL != $wordifier$.getDynamicValue() ) ? $wordifier$.getDynamicValue() : $sym124$FST_STRING_WORDIFY;
    }
    final SubLObject sentence = new_sentence( NIL, wordifier );
    SubLObject string = $str38$;
    SubLObject current_index = NIL;
    _csetf_sign_constituents( sentence, Functions.apply( Symbols.symbol_function( $sym67$VECTOR ), finite_state_transducer.fst_output( fst ) ) );
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      SubLObject cdolist_list_var = sentence_yield_exhaustive( sentence );
      SubLObject word = NIL;
      word = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject word_offset = sign_offset( word );
        if( NIL != current_index && current_index.numL( word_offset ) )
        {
          SubLObject cdotimes_end_var;
          SubLObject n;
          for( cdotimes_end_var = Numbers.subtract( word_offset, current_index ), n = NIL, n = ZERO_INTEGER; n.numL( cdotimes_end_var ); n = Numbers.add( n, ONE_INTEGER ) )
          {
            print_high.princ( $str45$_, stream );
          }
        }
        _csetf_sign_mother( word, sentence );
        print_high.princ( word_string( word ), stream );
        current_index = Numbers.add( word_offset, word_length( word ) );
        cdolist_list_var = cdolist_list_var.rest();
        word = cdolist_list_var.first();
      }
      string = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    _csetf_sign_offset( sentence, word_offset( sentence_get( sentence, ZERO_INTEGER ) ) );
    _csetf_sign_string( sentence, string );
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46781L)
  public static SubLObject string_sentencify(final SubLObject string, SubLObject wordifier)
  {
    if( wordifier == UNPROVIDED )
    {
      wordifier = $sym68$RKF_STANDARD_STRING_WORDIFY;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sentences = NIL;
    final SubLObject _prev_bind_0 = $wordifier$.currentBinding( thread );
    try
    {
      $wordifier$.bind( wordifier, thread );
      sentences = finite_state_transducer.fst_match_global( $sentencifier_fst$.getDynamicValue( thread ), string_wordify( string, wordifier ) );
    }
    finally
    {
      $wordifier$.rebind( _prev_bind_0, thread );
    }
    return sentences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47223L)
  public static SubLObject newline_sentence_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != sentence_p( v_object ) && Vectors.aref( word_string( Vectors.aref( sign_constituents( v_object ), ZERO_INTEGER ) ), ZERO_INTEGER ).eql( Characters.CHAR_newline ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47508L)
  public static SubLObject paragraph_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    paragraph_print( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47508L)
  public static SubLObject paragraph_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $paragraph_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47508L)
  public static SubLObject paragraph_sentences(final SubLObject v_object)
  {
    assert NIL != paragraph_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47508L)
  public static SubLObject paragraph_mother(final SubLObject v_object)
  {
    assert NIL != paragraph_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47508L)
  public static SubLObject _csetf_paragraph_sentences(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != paragraph_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47508L)
  public static SubLObject _csetf_paragraph_mother(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != paragraph_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47508L)
  public static SubLObject make_paragraph(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $paragraph_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw170$SENTENCES ) )
      {
        _csetf_paragraph_sentences( v_new, current_value );
      }
      else if( pcase_var.eql( $kw30$MOTHER ) )
      {
        _csetf_paragraph_mother( v_new, current_value );
      }
      else
      {
        Errors.error( $str31$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47508L)
  public static SubLObject visit_defstruct_paragraph(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw32$BEGIN, $sym171$MAKE_PARAGRAPH, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw34$SLOT, $kw170$SENTENCES, paragraph_sentences( obj ) );
    Functions.funcall( visitor_fn, obj, $kw34$SLOT, $kw30$MOTHER, paragraph_mother( obj ) );
    Functions.funcall( visitor_fn, obj, $kw35$END, $sym171$MAKE_PARAGRAPH, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47508L)
  public static SubLObject visit_defstruct_object_paragraph_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_paragraph( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47674L)
  public static SubLObject paragraph_do_sentences(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list173 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sentence = NIL;
    SubLObject paragraph = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list173 );
    sentence = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list173 );
    paragraph = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym54$CDOVECTOR, ConsesLow.list( sentence, ConsesLow.list( $sym166$PARAGRAPH_SENTENCES, paragraph ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list173 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47990L)
  public static SubLObject paragraph_do_words(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list174 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject word = NIL;
    SubLObject paragraph = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list174 );
    word = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list174 );
    paragraph = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject sentence = $sym175$SENTENCE;
      return ConsesLow.list( $sym176$PARAGRAPH_DO_SENTENCES, ConsesLow.list( sentence, paragraph ), ConsesLow.listS( $sym177$SENTENCE_DO_WORDS, ConsesLow.list( word, sentence ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list174 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48324L)
  public static SubLObject paragraph_do_minimal_words(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list174 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject word = NIL;
    SubLObject paragraph = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list174 );
    word = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list174 );
    paragraph = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject sentence = $sym178$SENTENCE;
      return ConsesLow.list( $sym176$PARAGRAPH_DO_SENTENCES, ConsesLow.list( sentence, paragraph ), ConsesLow.listS( $sym179$SENTENCE_DO_MINIMAL_WORDS, ConsesLow.list( word, sentence ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list174 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48674L)
  public static SubLObject new_paragraph(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    final SubLObject paragraph = make_paragraph( UNPROVIDED );
    _csetf_paragraph_sentences( paragraph, string_sentencify( string, UNPROVIDED ) );
    final SubLObject vector_var = paragraph_sentences( paragraph );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject sen;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      sen = Vectors.aref( vector_var, element_num );
      _csetf_sign_mother( sen, paragraph );
    }
    return paragraph;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49116L)
  public static SubLObject paragraph_print(final SubLObject paragraph, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != paragraph_p( paragraph ) : paragraph;
    streams_high.write_string( $str180$__PAR_, stream, UNPROVIDED, UNPROVIDED );
    SubLObject cdotimes_end_var;
    SubLObject i;
    for( cdotimes_end_var = Numbers.min( paragraph_sentence_length( paragraph ), $text_class_print_length$.getDynamicValue( thread ) ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i,
        ONE_INTEGER ) )
    {
      streams_high.terpri( stream );
      sentence_print( paragraph_get( paragraph, i ), stream, ZERO_INTEGER );
    }
    if( $text_class_print_length$.getDynamicValue( thread ).numL( paragraph_sentence_length( paragraph ) ) )
    {
      streams_high.write_string( $str46$____, stream, UNPROVIDED, UNPROVIDED );
    }
    streams_high.write_string( $str48$_, stream, UNPROVIDED, UNPROVIDED );
    return paragraph;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49623L)
  public static SubLObject paragraph_get(final SubLObject paragraph, final SubLObject index)
  {
    assert NIL != paragraph_p( paragraph ) : paragraph;
    assert NIL != Types.integerp( index ) : index;
    return Vectors.aref( paragraph_sentences( paragraph ), index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49905L)
  public static SubLObject paragraph_set(final SubLObject paragraph, final SubLObject index, final SubLObject sentence)
  {
    assert NIL != paragraph_p( paragraph ) : paragraph;
    assert NIL != Types.integerp( index ) : index;
    assert NIL != sentence_p( sentence ) : sentence;
    final SubLObject old_sentence = Vectors.aref( paragraph_sentences( paragraph ), index );
    Vectors.set_aref( paragraph_sentences( paragraph ), index, sentence );
    _csetf_sign_mother( sentence, paragraph );
    return old_sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50482L)
  public static SubLObject paragraph_sentence_length(final SubLObject paragraph)
  {
    assert NIL != paragraph_p( paragraph ) : paragraph;
    return Sequences.length( paragraph_sentences( paragraph ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50773L)
  public static SubLObject paragraph_word_length(final SubLObject paragraph)
  {
    assert NIL != paragraph_p( paragraph ) : paragraph;
    SubLObject length = ZERO_INTEGER;
    final SubLObject vector_var = paragraph_sentences( paragraph );
    final SubLObject backwardP_var = NIL;
    SubLObject length_$6;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject sentence;
    for( length_$6 = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length_$6 ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length_$6, v_iteration, ONE_INTEGER ) : v_iteration );
      sentence = Vectors.aref( vector_var, element_num );
      length = Numbers.add( length, sentence_length( sentence ) );
    }
    return length;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51139L)
  public static SubLObject paragraph_offset(final SubLObject paragraph)
  {
    return sentence_offset( paragraph_get( paragraph, ZERO_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51242L)
  public static SubLObject paragraph_string(final SubLObject paragraph)
  {
    SubLObject output_string = NIL;
    SubLObject current_end = ZERO_INTEGER;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      final SubLObject vector_var = paragraph_sentences( paragraph );
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject sent;
      SubLObject diff;
      for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        sent = Vectors.aref( vector_var, element_num );
        if( current_end.numL( sentence_offset( sent ) ) )
        {
          diff = Numbers.subtract( sentence_offset( sent ), current_end );
          string_utilities.indent( s, diff );
          current_end = Numbers.add( current_end, diff );
        }
        print_high.princ( sentence_string( sent ), s );
        current_end = Numbers.add( current_end, Sequences.length( sentence_string( sent ) ) );
      }
      output_string = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return output_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52009L)
  public static SubLObject paragraph_to_xml(final SubLObject paragraph, SubLObject level)
  {
    if( level == UNPROVIDED )
    {
      level = ZERO_INTEGER;
    }
    assert NIL != paragraph_p( paragraph ) : paragraph;
    SubLObject xml = NIL;
    xml = Sequences.cconcatenate( string_utilities.tabstr( level, $xml_indent$.getGlobalValue() ), new SubLObject[] { $str181$_PAR_, $newline$.getGlobalValue()
    } );
    final SubLObject vector_var = paragraph_sentences( paragraph );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject sentence;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      sentence = Vectors.aref( vector_var, element_num );
      xml = Sequences.cconcatenate( xml, sign_to_xml( sentence, Numbers.add( level, ONE_INTEGER ) ) );
    }
    xml = Sequences.cconcatenate( xml, new SubLObject[] { string_utilities.tabstr( level, $xml_indent$.getGlobalValue() ), $str182$__PAR_, $newline$.getGlobalValue()
    } );
    return xml;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52512L)
  public static SubLObject build_paragraph_token(final SubLObject fst)
  {
    final SubLObject paragraph = make_paragraph( UNPROVIDED );
    _csetf_paragraph_sentences( paragraph, Functions.apply( $sym67$VECTOR, finite_state_transducer.fst_output( fst ) ) );
    final SubLObject vector_var = paragraph_sentences( paragraph );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject sen;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      sen = Vectors.aref( vector_var, element_num );
      _csetf_sign_mother( sen, paragraph );
    }
    return paragraph;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52918L)
  public static SubLObject string_paragraphize(final SubLObject string, SubLObject wordifier, SubLObject sentencifyP)
  {
    if( wordifier == UNPROVIDED )
    {
      wordifier = $sym124$FST_STRING_WORDIFY;
    }
    if( sentencifyP == UNPROVIDED )
    {
      sentencifyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != sentencifyP )
    {
      return finite_state_transducer.fst_match_global( $paragraphier_fst$.getDynamicValue( thread ), string_sentencify( string, wordifier ) );
    }
    final SubLObject paragraph = make_paragraph( UNPROVIDED );
    final SubLObject sentence = new_sentence( string, wordifier );
    _csetf_paragraph_sentences( paragraph, Vectors.make_vector( ONE_INTEGER, sentence ) );
    final SubLObject vector_var = paragraph_sentences( paragraph );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject sen;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      sen = Vectors.aref( vector_var, element_num );
      _csetf_sign_mother( sen, paragraph );
    }
    return Vectors.make_vector( ONE_INTEGER, paragraph );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53563L)
  public static SubLObject sign_to_xml(final SubLObject sign, SubLObject level)
  {
    if( level == UNPROVIDED )
    {
      level = ZERO_INTEGER;
    }
    assert NIL != sign_p( sign ) : sign;
    if( NIL != word_p( sign ) )
    {
      return word_to_xml( sign, level );
    }
    return phrase_to_xml( sign, level );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53864L)
  public static SubLObject document_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    document_print( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53864L)
  public static SubLObject document_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $document_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53864L)
  public static SubLObject document_paragraphs(final SubLObject v_object)
  {
    assert NIL != document_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53864L)
  public static SubLObject _csetf_document_paragraphs(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != document_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53864L)
  public static SubLObject make_document(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $document_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw194$PARAGRAPHS ) )
      {
        _csetf_document_paragraphs( v_new, current_value );
      }
      else
      {
        Errors.error( $str31$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53864L)
  public static SubLObject visit_defstruct_document(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw32$BEGIN, $sym195$MAKE_DOCUMENT, ONE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw34$SLOT, $kw194$PARAGRAPHS, document_paragraphs( obj ) );
    Functions.funcall( visitor_fn, obj, $kw35$END, $sym195$MAKE_DOCUMENT, ONE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53864L)
  public static SubLObject visit_defstruct_object_document_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_document( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 53984L)
  public static SubLObject new_document(final SubLObject input, SubLObject sentencifyP, SubLObject wordifier)
  {
    if( sentencifyP == UNPROVIDED )
    {
      sentencifyP = T;
    }
    if( wordifier == UNPROVIDED )
    {
      wordifier = $sym124$FST_STRING_WORDIFY;
    }
    if( input.isString() )
    {
      return possibly_perform_document_dot_analysis( new_document_from_string( input, wordifier, sentencifyP ) );
    }
    if( input.isStream() )
    {
      return possibly_perform_document_dot_analysis( new_document_from_stream( input, wordifier, sentencifyP ) );
    }
    Errors.error( $str197$_A_is_neither_a_string_nor_a_stre );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54739L)
  public static SubLObject document_do_paragraphs(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list198 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject paragraph = NIL;
    SubLObject v_document = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list198 );
    paragraph = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list198 );
    v_document = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym54$CDOVECTOR, ConsesLow.list( paragraph, ConsesLow.list( $sym192$DOCUMENT_PARAGRAPHS, v_document ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list198 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55026L)
  public static SubLObject document_do_sentences(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sentence = NIL;
    SubLObject v_document = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
    sentence = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
    v_document = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject paragraph = $sym200$PARAGRAPH;
      return ConsesLow.list( $sym201$DOCUMENT_DO_PARAGRAPHS, ConsesLow.list( paragraph, v_document ), ConsesLow.listS( $sym176$PARAGRAPH_DO_SENTENCES, ConsesLow.list( sentence, paragraph ), ConsesLow.append( body,
          NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list199 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55443L)
  public static SubLObject possibly_perform_document_dot_analysis(final SubLObject doc)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != $perform_dot_analysis_on_docs$.getDynamicValue( thread ) ) ? document_perform_dot_analysis( doc ) : doc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55602L)
  public static SubLObject document_perform_dot_analysis(final SubLObject doc)
  {
    final SubLObject vector_var = document_paragraphs( doc );
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
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      paragraph = Vectors.aref( vector_var, element_num );
      vector_var_$7 = paragraph_sentences( paragraph );
      backwardP_var_$8 = NIL;
      length_$9 = Sequences.length( vector_var_$7 );
      v_iteration_$10 = NIL;
      v_iteration_$10 = ZERO_INTEGER;
      if( v_iteration_$10.numL( length_$9 ) )
      {
        element_num_$11 = ( ( NIL != backwardP_var_$8 ) ? Numbers.subtract( length_$9, v_iteration_$10, ONE_INTEGER ) : v_iteration_$10 );
        sent = Vectors.aref( vector_var_$7, element_num_$11 );
        prev_word = NIL;
        combinations = NIL;
        cdolist_list_var = sentence_yield_exhaustive( sent );
        word = NIL;
        word = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != prev_word && NIL != word && ONE_INTEGER.eql( word_length( prev_word ) ) && $str202$_.equal( word_string( word ) ) )
          {
            combinations = ConsesLow.cons( ConsesLow.list( prev_word, word, sent ), combinations );
          }
          prev_word = word;
          cdolist_list_var = cdolist_list_var.rest();
          word = cdolist_list_var.first();
        }
        cdolist_list_var = combinations;
        combo = NIL;
        combo = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          datum = ( current = combo );
          first_word = NIL;
          second_word = NIL;
          sent_$12 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list203 );
          first_word = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list203 );
          second_word = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list203 );
          sent_$12 = current.first();
          current = current.rest();
          if( NIL == current )
          {
            set_word_string( first_word, Sequences.cconcatenate( word_string( first_word ), word_string( second_word ) ) );
            Sequences.delete( second_word, sign_constituents( sent_$12 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list203 );
          }
          cdolist_list_var = cdolist_list_var.rest();
          combo = cdolist_list_var.first();
        }
        return doc;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56217L)
  public static SubLObject new_document_from_string(final SubLObject string, SubLObject wordifier, SubLObject sentencifyP)
  {
    if( wordifier == UNPROVIDED )
    {
      wordifier = $sym124$FST_STRING_WORDIFY;
    }
    if( sentencifyP == UNPROVIDED )
    {
      sentencifyP = T;
    }
    assert NIL != Types.stringp( string ) : string;
    final SubLObject doc = make_document( UNPROVIDED );
    _csetf_document_paragraphs( doc, string_paragraphize( string, wordifier, sentencifyP ) );
    final SubLObject vector_var = document_paragraphs( doc );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject par;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      par = Vectors.aref( vector_var, element_num );
      _csetf_paragraph_mother( par, doc );
    }
    return doc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56722L)
  public static SubLObject new_document_from_file(final SubLObject path, SubLObject sentencifyP, SubLObject wordifier)
  {
    if( sentencifyP == UNPROVIDED )
    {
      sentencifyP = T;
    }
    if( wordifier == UNPROVIDED )
    {
      wordifier = $sym124$FST_STRING_WORDIFY;
    }
    assert NIL != Types.stringp( path ) : path;
    SubLObject doc = make_document( UNPROVIDED );
    if( NIL != Filesys.probe_file( path ) )
    {
      SubLObject stream = NIL;
      try
      {
        stream = compatibility.open_text( path, $kw204$INPUT );
        if( !stream.isStream() )
        {
          Errors.error( $str205$Unable_to_open__S, path );
        }
        final SubLObject stream_$13 = stream;
        doc = new_document( stream_$13, sentencifyP, wordifier );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
    }
    return doc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57184L)
  public static SubLObject new_document_from_stream(final SubLObject in_stream, SubLObject wordifier, SubLObject sentencifyP)
  {
    if( wordifier == UNPROVIDED )
    {
      wordifier = $sym124$FST_STRING_WORDIFY;
    }
    if( sentencifyP == UNPROVIDED )
    {
      sentencifyP = T;
    }
    assert NIL != streams_high.input_stream_p( in_stream ) : in_stream;
    final SubLObject doc = make_document( UNPROVIDED );
    _csetf_document_paragraphs( doc, string_paragraphize( stream_stringify( in_stream ), wordifier, sentencifyP ) );
    final SubLObject vector_var = document_paragraphs( doc );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject par;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      par = Vectors.aref( vector_var, element_num );
      _csetf_paragraph_mother( par, doc );
    }
    return doc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57735L)
  public static SubLObject document_print(final SubLObject v_document, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != document_p( v_document ) : v_document;
    streams_high.write_string( $str207$__DOC_, stream, UNPROVIDED, UNPROVIDED );
    SubLObject cdotimes_end_var;
    SubLObject i;
    for( cdotimes_end_var = Numbers.min( document_paragraph_length( v_document ), $text_class_print_length$.getDynamicValue( thread ) ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i,
        ONE_INTEGER ) )
    {
      streams_high.terpri( stream );
      paragraph_print( document_get( v_document, i ), stream, ZERO_INTEGER );
    }
    if( $text_class_print_length$.getDynamicValue( thread ).numL( document_paragraph_length( v_document ) ) )
    {
      streams_high.write_string( $str46$____, stream, UNPROVIDED, UNPROVIDED );
    }
    streams_high.write_string( $str48$_, stream, UNPROVIDED, UNPROVIDED );
    return v_document;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 58233L)
  public static SubLObject document_get(final SubLObject v_document, final SubLObject index)
  {
    assert NIL != document_p( v_document ) : v_document;
    assert NIL != Types.integerp( index ) : index;
    return Vectors.aref( document_paragraphs( v_document ), index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 58510L)
  public static SubLObject document_set(final SubLObject v_document, final SubLObject index, final SubLObject paragraph)
  {
    assert NIL != document_p( v_document ) : v_document;
    assert NIL != Types.integerp( index ) : index;
    assert NIL != paragraph_p( paragraph ) : paragraph;
    final SubLObject old_paragraph = Vectors.aref( document_paragraphs( v_document ), index );
    Vectors.set_aref( document_paragraphs( v_document ), index, paragraph );
    _csetf_paragraph_mother( paragraph, v_document );
    return old_paragraph;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59091L)
  public static SubLObject document_get_sentence(final SubLObject v_document, final SubLObject index)
  {
    assert NIL != document_p( v_document ) : v_document;
    assert NIL != Types.integerp( index ) : index;
    SubLObject current = ZERO_INTEGER;
    final SubLObject vector_var = document_paragraphs( v_document );
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
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      paragraph = Vectors.aref( vector_var, element_num );
      vector_var_$14 = paragraph_sentences( paragraph );
      backwardP_var_$15 = NIL;
      for( length_$16 = Sequences.length( vector_var_$14 ), v_iteration_$17 = NIL, v_iteration_$17 = ZERO_INTEGER; v_iteration_$17.numL( length_$16 ); v_iteration_$17 = Numbers.add( v_iteration_$17, ONE_INTEGER ) )
      {
        element_num_$18 = ( ( NIL != backwardP_var_$15 ) ? Numbers.subtract( length_$16, v_iteration_$17, ONE_INTEGER ) : v_iteration_$17 );
        sentence = Vectors.aref( vector_var_$14, element_num_$18 );
        if( current.numE( index ) )
        {
          return sentence;
        }
        current = Numbers.add( current, ONE_INTEGER );
      }
    }
    return Errors.error( PrintLow.format( NIL, $str208$Sentence_index__A_out_of_bounds_, index ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59544L)
  public static SubLObject document_get_word(final SubLObject v_document, final SubLObject index)
  {
    assert NIL != document_p( v_document ) : v_document;
    assert NIL != Types.integerp( index ) : index;
    SubLObject current_word_index = ZERO_INTEGER;
    final SubLObject vector_var = document_paragraphs( v_document );
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
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      paragraph = Vectors.aref( vector_var, element_num );
      vector_var_$19 = paragraph_sentences( paragraph );
      backwardP_var_$20 = NIL;
      for( length_$21 = Sequences.length( vector_var_$19 ), v_iteration_$22 = NIL, v_iteration_$22 = ZERO_INTEGER; v_iteration_$22.numL( length_$21 ); v_iteration_$22 = Numbers.add( v_iteration_$22, ONE_INTEGER ) )
      {
        element_num_$23 = ( ( NIL != backwardP_var_$20 ) ? Numbers.subtract( length_$21, v_iteration_$22, ONE_INTEGER ) : v_iteration_$22 );
        sentence = Vectors.aref( vector_var_$19, element_num_$23 );
        if( Numbers.add( current_word_index, sentence_length( sentence ) ).numG( index ) )
        {
          return sentence_get( sentence, Numbers.subtract( index, current_word_index ) );
        }
        current_word_index = Numbers.add( current_word_index, sentence_length( sentence ) );
      }
    }
    return Errors.error( PrintLow.format( NIL, $str208$Sentence_index__A_out_of_bounds_, index ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 60111L)
  public static SubLObject document_to_xml(final SubLObject v_document)
  {
    assert NIL != document_p( v_document ) : v_document;
    SubLObject xml = NIL;
    xml = Sequences.cconcatenate( $str209$_DOC_, $newline$.getGlobalValue() );
    final SubLObject vector_var = document_paragraphs( v_document );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject paragraph;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      paragraph = Vectors.aref( vector_var, element_num );
      xml = Sequences.cconcatenate( xml, paragraph_to_xml( paragraph, ONE_INTEGER ) );
    }
    xml = Sequences.cconcatenate( xml, new SubLObject[] { $str210$__DOC_, $newline$.getGlobalValue()
    } );
    return xml;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 60526L)
  public static SubLObject document_paragraph_length(final SubLObject v_document)
  {
    assert NIL != document_p( v_document ) : v_document;
    return Sequences.length( document_paragraphs( v_document ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 60808L)
  public static SubLObject document_sentence_length(final SubLObject v_document)
  {
    assert NIL != document_p( v_document ) : v_document;
    SubLObject length = ZERO_INTEGER;
    final SubLObject vector_var = document_paragraphs( v_document );
    final SubLObject backwardP_var = NIL;
    SubLObject length_$24;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject paragraph;
    for( length_$24 = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length_$24 ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length_$24, v_iteration, ONE_INTEGER ) : v_iteration );
      paragraph = Vectors.aref( vector_var, element_num );
      length = Numbers.add( length, paragraph_sentence_length( paragraph ) );
    }
    return length;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 61186L)
  public static SubLObject document_word_length(final SubLObject v_document)
  {
    assert NIL != document_p( v_document ) : v_document;
    SubLObject length = ZERO_INTEGER;
    final SubLObject vector_var = document_paragraphs( v_document );
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
    for( length_$25 = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length_$25 ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length_$25, v_iteration, ONE_INTEGER ) : v_iteration );
      paragraph = Vectors.aref( vector_var, element_num );
      vector_var_$26 = paragraph_sentences( paragraph );
      backwardP_var_$27 = NIL;
      for( length_$26 = Sequences.length( vector_var_$26 ), v_iteration_$29 = NIL, v_iteration_$29 = ZERO_INTEGER; v_iteration_$29.numL( length_$26 ); v_iteration_$29 = Numbers.add( v_iteration_$29, ONE_INTEGER ) )
      {
        element_num_$30 = ( ( NIL != backwardP_var_$27 ) ? Numbers.subtract( length_$26, v_iteration_$29, ONE_INTEGER ) : v_iteration_$29 );
        sentence = Vectors.aref( vector_var_$26, element_num_$30 );
        length = Numbers.add( length, sentence_length( sentence ) );
      }
    }
    return length;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 61539L)
  public static SubLObject document_do_minimal_words(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list211 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject word = NIL;
    SubLObject v_document = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list211 );
    word = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list211 );
    v_document = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject sentence = $sym212$SENTENCE;
      return ConsesLow.list( $sym213$DOCUMENT_DO_SENTENCES, ConsesLow.list( sentence, v_document ), ConsesLow.listS( $sym179$SENTENCE_DO_MINIMAL_WORDS, ConsesLow.list( word, sentence ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list211 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 62102L)
  public static SubLObject document_do_words(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list211 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject word = NIL;
    SubLObject v_document = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list211 );
    word = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list211 );
    v_document = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject sentence = $sym214$SENTENCE;
      return ConsesLow.list( $sym213$DOCUMENT_DO_SENTENCES, ConsesLow.list( sentence, v_document ), ConsesLow.listS( $sym177$SENTENCE_DO_WORDS, ConsesLow.list( word, sentence ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list211 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 62428L)
  public static SubLObject document_string(final SubLObject v_document)
  {
    SubLObject output_string = NIL;
    SubLObject current_end = ZERO_INTEGER;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      final SubLObject vector_var = document_paragraphs( v_document );
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
      for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        paragraph = Vectors.aref( vector_var, element_num );
        vector_var_$31 = paragraph_sentences( paragraph );
        backwardP_var_$32 = NIL;
        for( length_$33 = Sequences.length( vector_var_$31 ), v_iteration_$34 = NIL, v_iteration_$34 = ZERO_INTEGER; v_iteration_$34.numL( length_$33 ); v_iteration_$34 = Numbers.add( v_iteration_$34, ONE_INTEGER ) )
        {
          element_num_$35 = ( ( NIL != backwardP_var_$32 ) ? Numbers.subtract( length_$33, v_iteration_$34, ONE_INTEGER ) : v_iteration_$34 );
          sent = Vectors.aref( vector_var_$31, element_num_$35 );
          if( current_end.numL( sentence_offset( sent ) ) )
          {
            diff = Numbers.subtract( sentence_offset( sent ), current_end );
            string_utilities.indent( s, diff );
            current_end = Numbers.add( current_end, diff );
          }
          print_high.princ( sentence_string( sent ), s );
          current_end = Numbers.add( current_end, Sequences.length( sentence_string( sent ) ) );
        }
      }
      output_string = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return output_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63189L)
  public static SubLObject new_sentence_iterator(final SubLObject v_object)
  {
    return ( NIL != document_p( v_object ) ) ? new_document_sentence_iterator( v_object )
        : ( ( NIL != paragraph_p( v_object ) ) ? new_paragraph_sentence_iterator( v_object )
            : ( ( NIL != sentence_p( v_object ) ) ? new_sentence_sentence_iterator( v_object )
                : ( ( NIL != word_p( v_object ) ) ? iteration.new_null_iterator() : Errors.error( $str215$can_t_create_sentence_iterator_fo, v_object ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63624L)
  public static SubLObject new_document_sentence_iterator(final SubLObject doc)
  {
    SubLObject sentences = NIL;
    final SubLObject vector_var = document_paragraphs( doc );
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
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      paragraph = Vectors.aref( vector_var, element_num );
      vector_var_$36 = paragraph_sentences( paragraph );
      backwardP_var_$37 = NIL;
      for( length_$38 = Sequences.length( vector_var_$36 ), v_iteration_$39 = NIL, v_iteration_$39 = ZERO_INTEGER; v_iteration_$39.numL( length_$38 ); v_iteration_$39 = Numbers.add( v_iteration_$39, ONE_INTEGER ) )
      {
        element_num_$40 = ( ( NIL != backwardP_var_$37 ) ? Numbers.subtract( length_$38, v_iteration_$39, ONE_INTEGER ) : v_iteration_$39 );
        s = Vectors.aref( vector_var_$36, element_num_$40 );
        sentences = ConsesLow.cons( s, sentences );
      }
    }
    return iteration.new_list_iterator( Sequences.nreverse( sentences ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63819L)
  public static SubLObject new_paragraph_sentence_iterator(final SubLObject par)
  {
    return iteration.new_vector_iterator( paragraph_sentences( par ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 63931L)
  public static SubLObject new_sentence_sentence_iterator(final SubLObject sen)
  {
    return iteration.new_singleton_iterator( sen );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 64023L)
  public static SubLObject stream_stringify(final SubLObject in_stream)
  {
    assert NIL != streams_high.input_stream_p( in_stream ) : in_stream;
    final SubLObject length = streams_high.file_length( in_stream );
    final SubLObject string = Strings.make_string( length, UNPROVIDED );
    SubLObject i;
    SubLObject v_char;
    for( i = NIL, i = ZERO_INTEGER; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      v_char = streams_high.read_char( in_stream, NIL, $kw216$EOF, UNPROVIDED );
      if( v_char == $kw216$EOF )
      {
        return string_utilities.substring( string, ZERO_INTEGER, i );
      }
      Strings.set_char( string, i, v_char );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 64435L)
  public static SubLObject alphanumeric_char_or_character_code_p(final SubLObject obj)
  {
    return makeBoolean( NIL != string_utilities.alphanumeric_char_p( obj ) || NIL != latin_alphabetic_character_code_p( obj ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 64774L)
  public static SubLObject alphabetic_char_or_character_code_p(final SubLObject obj)
  {
    return makeBoolean( NIL != string_utilities.alphabetic_char_p( obj ) || NIL != latin_alphabetic_character_code_p( obj ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 64917L)
  public static SubLObject latin_alphabetic_character_code_p(final SubLObject obj)
  {
    return makeBoolean( obj.isInteger() && NIL == subl_promotions.memberP( obj, $list217, UNPROVIDED, UNPROVIDED ) && obj.numGE( $int218$192 ) && obj.numLE( $int219$591 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 65089L)
  public static SubLObject character_or_character_code_p(final SubLObject obj)
  {
    return makeBoolean( obj.isChar() || obj.isInteger() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 78511L)
  public static SubLObject sentencifier_initializedP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $sentencifier_patterns$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 78620L)
  public static SubLObject initialize_sentencifier()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    finalize_sentencifier();
    $sentencifier_patterns$.setDynamicValue( ConsesLow.append( new SubLObject[] { compile_regular_expression_substitutions( $mark_eos_regular_expressions$.getDynamicValue( thread ) ),
      compile_regular_expression_substitutions( $remove_false_eos_regular_expressions1$.getDynamicValue( thread ) ), compile_regular_expression_substitutions( generate_abbreviation_regular_expressions() ),
      compile_regular_expression_substitutions( $remove_false_eos_regular_expressions2$.getDynamicValue( thread ) ), compile_regular_expression_substitutions( $split_unsplit_stuff_regular_expressions$.getDynamicValue(
          thread ) )
    } ), thread );
    return Sequences.length( $sentencifier_patterns$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 79376L)
  public static SubLObject finalize_sentencifier()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject count = Sequences.length( $sentencifier_patterns$.getDynamicValue( thread ) );
    SubLObject cdolist_list_var = $sentencifier_patterns$.getDynamicValue( thread );
    SubLObject patternXsubstitution = NIL;
    patternXsubstitution = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = patternXsubstitution;
      SubLObject pattern = NIL;
      SubLObject substitution = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list529 );
      pattern = current.first();
      current = ( substitution = current.rest() );
      if( NIL != regular_expressions.regex_pattern_p( pattern ) )
      {
        regular_expressions.discard_regular_expression_pattern( pattern );
      }
      else
      {
        Errors.warn( $str530$Can_t_finalize__a__not_a_regular_, pattern );
      }
      cdolist_list_var = cdolist_list_var.rest();
      patternXsubstitution = cdolist_list_var.first();
    }
    $sentencifier_patterns$.setDynamicValue( NIL, thread );
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 79982L)
  public static SubLObject sentencify_string(final SubLObject text)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( text ) : text;
    if( NIL == sentencifier_initializedP() )
    {
      initialize_sentencifier();
    }
    SubLObject processed = text;
    SubLObject cdolist_list_var = $sentencifier_patterns$.getDynamicValue( thread );
    SubLObject patternXsubstitution = NIL;
    patternXsubstitution = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = patternXsubstitution;
      SubLObject pattern = NIL;
      SubLObject substitution = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list529 );
      pattern = current.first();
      current = ( substitution = current.rest() );
      processed = regular_expression_utilities.regex_subst( pattern, substitution, processed, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      patternXsubstitution = cdolist_list_var.first();
    }
    return clean_sentences( string_utilities.split_string( processed, ConsesLow.list( $eos_char$.getDynamicValue( thread ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 80605L)
  public static SubLObject sentencify_file(final SubLObject path)
  {
    return sentencify_string( file_utilities.slurp_file( path ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 80801L)
  public static SubLObject generate_abbreviation_regular_expressions()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_regular_expressions = NIL;
    SubLObject cdolist_list_var = $abbreviations$.getDynamicValue( thread );
    SubLObject abrv = NIL;
    abrv = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      v_regular_expressions = ConsesLow.cons( ConsesLow.list( Sequences.cconcatenate( $str532$__b, new SubLObject[] { format_nil.format_nil_a_no_copy( abrv ), format_nil.format_nil_a_no_copy( $pap$.getDynamicValue(
          thread ) ), $str505$_s_, format_nil.format_nil_a_no_copy( $eos$.getDynamicValue( thread ) )
      } ), $str506$_1, $list527 ), v_regular_expressions );
      cdolist_list_var = cdolist_list_var.rest();
      abrv = cdolist_list_var.first();
    }
    return v_regular_expressions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 81104L)
  public static SubLObject compile_regular_expression_substitutions(final SubLObject regular_expression_substitutions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject pattern_substitutions = NIL;
    SubLObject cdolist_list_var = regular_expression_substitutions;
    SubLObject regexXsubstitution = NIL;
    regexXsubstitution = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = regexXsubstitution;
      SubLObject re = NIL;
      SubLObject substitution = NIL;
      SubLObject options = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list533 );
      re = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list533 );
      substitution = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list533 );
      options = current.first();
      current = current.rest();
      if( NIL == current )
      {
        thread.resetMultipleValues();
        final SubLObject pattern = regular_expressions.compile_regular_expression( re, options );
        final SubLObject dummy1 = thread.secondMultipleValue();
        final SubLObject dummy2 = thread.thirdMultipleValue();
        final SubLObject error = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if( NIL != pattern )
        {
          pattern_substitutions = ConsesLow.cons( ConsesLow.cons( pattern, substitution ), pattern_substitutions );
        }
        else
        {
          Errors.error( $str534$Can_t_compile_regular_expression_, re, error );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list533 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      regexXsubstitution = cdolist_list_var.first();
    }
    return Sequences.nreverse( pattern_substitutions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 81872L)
  public static SubLObject clean_sentences(final SubLObject sentences)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = sentences;
    SubLObject sentence = NIL;
    sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject trimmed = string_utilities.trim_whitespace( sentence );
      if( NIL != string_utilities.non_empty_stringP( trimmed ) )
      {
        result = ConsesLow.cons( trimmed, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sentence = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 82116L)
  public static SubLObject document_sentence_countE(final SubLObject v_document, final SubLObject count)
  {
    SubLObject sentence_count = ZERO_INTEGER;
    final SubLObject vector_var = document_paragraphs( v_document );
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
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      paragraph = Vectors.aref( vector_var, element_num );
      vector_var_$41 = paragraph_sentences( paragraph );
      backwardP_var_$42 = NIL;
      for( length_$43 = Sequences.length( vector_var_$41 ), v_iteration_$44 = NIL, v_iteration_$44 = ZERO_INTEGER; v_iteration_$44.numL( length_$43 ); v_iteration_$44 = Numbers.add( v_iteration_$44, ONE_INTEGER ) )
      {
        element_num_$45 = ( ( NIL != backwardP_var_$42 ) ? Numbers.subtract( length_$43, v_iteration_$44, ONE_INTEGER ) : v_iteration_$44 );
        s = Vectors.aref( vector_var_$41, element_num_$45 );
        sentence_count = Numbers.add( sentence_count, ONE_INTEGER );
      }
    }
    return Equality.eq( sentence_count, count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 82595L)
  public static SubLObject test_construct_string_from_words(final SubLObject form, SubLObject standardizeP)
  {
    if( standardizeP == UNPROVIDED )
    {
      standardizeP = NIL;
    }
    return construct_string_from_words( Eval.eval( form ), standardizeP, UNPROVIDED );
  }

  public static SubLObject declare_document_file()
  {
    SubLFiles.declareFunction( me, "sign_print_function_trampoline", "SIGN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sign_p", "SIGN-P", 1, 0, false );
    new $sign_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sign_string", "SIGN-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "sign_type", "SIGN-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "sign_info", "SIGN-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "sign_category", "SIGN-CATEGORY", 1, 0, false );
    SubLFiles.declareFunction( me, "sign_constituents", "SIGN-CONSTITUENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "sign_offset", "SIGN-OFFSET", 1, 0, false );
    SubLFiles.declareFunction( me, "sign_mother", "SIGN-MOTHER", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sign_string", "_CSETF-SIGN-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sign_type", "_CSETF-SIGN-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sign_info", "_CSETF-SIGN-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sign_category", "_CSETF-SIGN-CATEGORY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sign_constituents", "_CSETF-SIGN-CONSTITUENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sign_offset", "_CSETF-SIGN-OFFSET", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sign_mother", "_CSETF-SIGN-MOTHER", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sign", "MAKE-SIGN", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sign", "VISIT-DEFSTRUCT-SIGN", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sign_method", "VISIT-DEFSTRUCT-OBJECT-SIGN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_sign", "NEW-SIGN", 0, 0, false );
    SubLFiles.declareFunction( me, "sxhash_sign", "SXHASH-SIGN", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_sign_method", "SXHASH-SIGN-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sign_print", "SIGN-PRINT", 3, 0, false );
    SubLFiles.declareFunction( me, "sign_get", "SIGN-GET", 2, 0, false );
    SubLFiles.declareFunction( me, "sign_set", "SIGN-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "sign_length", "SIGN-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "sign_update", "SIGN-UPDATE", 2, 0, false );
    SubLFiles.declareMacro( me, "sign_do_constituents", "SIGN-DO-CONSTITUENTS" );
    SubLFiles.declareFunction( me, "sign_yield", "SIGN-YIELD", 1, 0, false );
    SubLFiles.declareFunction( me, "sign_intervals", "SIGN-INTERVALS", 1, 1, false );
    SubLFiles.declareFunction( me, "new_exhaustive_word", "NEW-EXHAUSTIVE-WORD", 0, 1, false );
    SubLFiles.declareFunction( me, "new_exhaustive_word_from_word", "NEW-EXHAUSTIVE-WORD-FROM-WORD", 1, 0, false );
    SubLFiles.declareFunction( me, "exhaustive_word_p", "EXHAUSTIVE-WORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_word", "NEW-WORD", 0, 1, false );
    SubLFiles.declareFunction( me, "copy_word", "COPY-WORD", 1, 0, false );
    SubLFiles.declareFunction( me, "word_p", "WORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "set_word_string", "SET-WORD-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "word_string", "WORD-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_word_category", "SET-WORD-CATEGORY", 2, 0, false );
    SubLFiles.declareFunction( me, "word_category", "WORD-CATEGORY", 1, 0, false );
    SubLFiles.declareFunction( me, "word_offset", "WORD-OFFSET", 1, 0, false );
    SubLFiles.declareFunction( me, "word_length", "WORD-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "word_mother", "WORD-MOTHER", 1, 0, false );
    SubLFiles.declareFunction( me, "word_info", "WORD-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "word_constituents", "WORD-CONSTITUENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "word_interps", "WORD-INTERPS", 1, 0, false );
    SubLFiles.declareFunction( me, "word_lex_entries", "WORD-LEX-ENTRIES", 1, 0, false );
    SubLFiles.declareFunction( me, "word_cycls", "WORD-CYCLS", 1, 0, false );
    SubLFiles.declareFunction( me, "word_cyc_pos", "WORD-CYC-POS", 1, 0, false );
    SubLFiles.declareFunction( me, "word_update", "WORD-UPDATE", 2, 0, false );
    SubLFiles.declareFunction( me, "word_index", "WORD-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "word_intervals", "WORD-INTERVALS", 1, 1, false );
    SubLFiles.declareFunction( me, "word_capitalize", "WORD-CAPITALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "word_uncapitalize", "WORD-UNCAPITALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "build_word_token", "BUILD-WORD-TOKEN", 1, 0, false );
    SubLFiles.declareFunction( me, "stringify", "STRINGIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "no_space_before_following_wordP", "NO-SPACE-BEFORE-FOLLOWING-WORD?", 1, 0, false );
    SubLFiles.declareFunction( me, "next_word_offset", "NEXT-WORD-OFFSET", 1, 0, false );
    SubLFiles.declareFunction( me, "string_tokenize_via_wordify", "STRING-TOKENIZE-VIA-WORDIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "string_wordify", "STRING-WORDIFY", 1, 1, false );
    SubLFiles.declareFunction( me, "fst_string_wordify", "FST-STRING-WORDIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_standard_string_wordify", "RKF-STANDARD-STRING-WORDIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_html_string_wordify_punctuation_chars", "CLEAR-HTML-STRING-WORDIFY-PUNCTUATION-CHARS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_html_string_wordify_punctuation_chars", "REMOVE-HTML-STRING-WORDIFY-PUNCTUATION-CHARS", 0, 0, false );
    SubLFiles.declareFunction( me, "html_string_wordify_punctuation_chars_internal", "HTML-STRING-WORDIFY-PUNCTUATION-CHARS-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "html_string_wordify_punctuation_chars", "HTML-STRING-WORDIFY-PUNCTUATION-CHARS", 0, 0, false );
    SubLFiles.declareFunction( me, "html_string_wordify_state_print_function_trampoline", "HTML-STRING-WORDIFY-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "html_string_wordify_state_p", "HTML-STRING-WORDIFY-STATE-P", 1, 0, false );
    new $html_string_wordify_state_p$UnaryFunction();
    SubLFiles.declareFunction( me, "hsw_state_state", "HSW-STATE-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "hsw_state_tag_pieces", "HSW-STATE-TAG-PIECES", 1, 0, false );
    SubLFiles.declareFunction( me, "hsw_state_string_pieces", "HSW-STATE-STRING-PIECES", 1, 0, false );
    SubLFiles.declareFunction( me, "hsw_state_punctuation_pieces", "HSW-STATE-PUNCTUATION-PIECES", 1, 0, false );
    SubLFiles.declareFunction( me, "hsw_state_leading_tags", "HSW-STATE-LEADING-TAGS", 1, 0, false );
    SubLFiles.declareFunction( me, "hsw_state_following_tags", "HSW-STATE-FOLLOWING-TAGS", 1, 0, false );
    SubLFiles.declareFunction( me, "hsw_state_current_offset", "HSW-STATE-CURRENT-OFFSET", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hsw_state_state", "_CSETF-HSW-STATE-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hsw_state_tag_pieces", "_CSETF-HSW-STATE-TAG-PIECES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hsw_state_string_pieces", "_CSETF-HSW-STATE-STRING-PIECES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hsw_state_punctuation_pieces", "_CSETF-HSW-STATE-PUNCTUATION-PIECES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hsw_state_leading_tags", "_CSETF-HSW-STATE-LEADING-TAGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hsw_state_following_tags", "_CSETF-HSW-STATE-FOLLOWING-TAGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_hsw_state_current_offset", "_CSETF-HSW-STATE-CURRENT-OFFSET", 2, 0, false );
    SubLFiles.declareFunction( me, "make_html_string_wordify_state", "MAKE-HTML-STRING-WORDIFY-STATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_html_string_wordify_state", "VISIT-DEFSTRUCT-HTML-STRING-WORDIFY-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_html_string_wordify_state_method", "VISIT-DEFSTRUCT-OBJECT-HTML-STRING-WORDIFY-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_hsw_state", "PRINT-HSW-STATE", 1, 2, false );
    SubLFiles.declareFunction( me, "new_html_string_wordify_state", "NEW-HTML-STRING-WORDIFY-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "classify_html_string_token", "CLASSIFY-HTML-STRING-TOKEN", 2, 0, false );
    SubLFiles.declareFunction( me, "html_string_wordify", "HTML-STRING-WORDIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "hsw_peek_next_token", "HSW-PEEK-NEXT-TOKEN", 2, 0, false );
    SubLFiles.declareFunction( me, "hsw_state_add_string_piece", "HSW-STATE-ADD-STRING-PIECE", 2, 0, false );
    SubLFiles.declareFunction( me, "hsw_state_clear_string_pieces", "HSW-STATE-CLEAR-STRING-PIECES", 1, 0, false );
    SubLFiles.declareFunction( me, "tag_from_hsw_state", "TAG-FROM-HSW-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_word_from_hsw_state", "NEW-WORD-FROM-HSW-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "fst_wordify_test", "FST-WORDIFY-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "string_to_xml", "STRING-TO-XML", 1, 0, false );
    SubLFiles.declareFunction( me, "word_to_xml", "WORD-TO-XML", 1, 1, false );
    SubLFiles.declareFunction( me, "end_of_sentence_word_p", "END-OF-SENTENCE-WORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "quote_word_p", "QUOTE-WORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "newline_word_p", "NEWLINE-WORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "punctuation_sign_p", "PUNCTUATION-SIGN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_final_punctuation_charP", "SENTENCE-FINAL-PUNCTUATION-CHAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_internal_punctuation_charP", "SENTENCE-INTERNAL-PUNCTUATION-CHAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "any_punctuation_charP", "ANY-PUNCTUATION-CHAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "quote_charP", "QUOTE-CHAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "new_phrase", "NEW-PHRASE", 0, 1, false );
    SubLFiles.declareFunction( me, "phrase_p", "PHRASE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_string", "PHRASE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_category", "PHRASE-CATEGORY", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_yield", "PHRASE-YIELD", 1, 0, false );
    SubLFiles.declareMacro( me, "phrase_do_constituents", "PHRASE-DO-CONSTITUENTS" );
    SubLFiles.declareFunction( me, "phrase_constituents", "PHRASE-CONSTITUENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_nodes", "PHRASE-NODES", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_intervals", "PHRASE-INTERVALS", 1, 1, false );
    SubLFiles.declareFunction( me, "phrase_info", "PHRASE-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_update", "PHRASE-UPDATE", 2, 0, false );
    SubLFiles.declareFunction( me, "phrase_get", "PHRASE-GET", 2, 0, false );
    SubLFiles.declareFunction( me, "phrase_set", "PHRASE-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "phrase_constituent_length", "PHRASE-CONSTITUENT-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "phrase_to_xml", "PHRASE-TO-XML", 1, 1, false );
    SubLFiles.declareMacro( me, "sentence_do_words", "SENTENCE-DO-WORDS" );
    SubLFiles.declareMacro( me, "sentence_do_minimal_words", "SENTENCE-DO-MINIMAL-WORDS" );
    SubLFiles.declareFunction( me, "new_sentence", "NEW-SENTENCE", 0, 2, false );
    SubLFiles.declareFunction( me, "sentence_p", "SENTENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_print", "SENTENCE-PRINT", 3, 0, false );
    SubLFiles.declareFunction( me, "sentence_string", "SENTENCE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_category", "SENTENCE-CATEGORY", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_yield", "SENTENCE-YIELD", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_yield_exhaustive", "SENTENCE-YIELD-EXHAUSTIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_constituents", "SENTENCE-CONSTITUENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_info", "SENTENCE-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_offset", "SENTENCE-OFFSET", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_index", "SENTENCE-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_get", "SENTENCE-GET", 2, 0, false );
    SubLFiles.declareFunction( me, "sentence_mother", "SENTENCE-MOTHER", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_set", "SENTENCE-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "sentence_length", "SENTENCE-LENGTH", 1, 0, false );
    SubLFiles.declareMacro( me, "sentence_do_constituents", "SENTENCE-DO-CONSTITUENTS" );
    SubLFiles.declareFunction( me, "sentence_reconstruct_substring", "SENTENCE-RECONSTRUCT-SUBSTRING", 3, 0, false );
    SubLFiles.declareFunction( me, "construct_string_from_words", "CONSTRUCT-STRING-FROM-WORDS", 1, 2, false );
    SubLFiles.declareFunction( me, "sentence_delete_punctuation", "SENTENCE-DELETE-PUNCTUATION", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_listify", "SENTENCE-LISTIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_stringify", "SENTENCE-STRINGIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "build_sentence_token", "BUILD-SENTENCE-TOKEN", 1, 1, false );
    SubLFiles.declareFunction( me, "string_sentencify", "STRING-SENTENCIFY", 1, 1, false );
    SubLFiles.declareFunction( me, "newline_sentence_p", "NEWLINE-SENTENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "paragraph_print_function_trampoline", "PARAGRAPH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "paragraph_p", "PARAGRAPH-P", 1, 0, false );
    new $paragraph_p$UnaryFunction();
    SubLFiles.declareFunction( me, "paragraph_sentences", "PARAGRAPH-SENTENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "paragraph_mother", "PARAGRAPH-MOTHER", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_paragraph_sentences", "_CSETF-PARAGRAPH-SENTENCES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_paragraph_mother", "_CSETF-PARAGRAPH-MOTHER", 2, 0, false );
    SubLFiles.declareFunction( me, "make_paragraph", "MAKE-PARAGRAPH", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_paragraph", "VISIT-DEFSTRUCT-PARAGRAPH", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_paragraph_method", "VISIT-DEFSTRUCT-OBJECT-PARAGRAPH-METHOD", 2, 0, false );
    SubLFiles.declareMacro( me, "paragraph_do_sentences", "PARAGRAPH-DO-SENTENCES" );
    SubLFiles.declareMacro( me, "paragraph_do_words", "PARAGRAPH-DO-WORDS" );
    SubLFiles.declareMacro( me, "paragraph_do_minimal_words", "PARAGRAPH-DO-MINIMAL-WORDS" );
    SubLFiles.declareFunction( me, "new_paragraph", "NEW-PARAGRAPH", 1, 0, false );
    SubLFiles.declareFunction( me, "paragraph_print", "PARAGRAPH-PRINT", 3, 0, false );
    SubLFiles.declareFunction( me, "paragraph_get", "PARAGRAPH-GET", 2, 0, false );
    SubLFiles.declareFunction( me, "paragraph_set", "PARAGRAPH-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "paragraph_sentence_length", "PARAGRAPH-SENTENCE-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "paragraph_word_length", "PARAGRAPH-WORD-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "paragraph_offset", "PARAGRAPH-OFFSET", 1, 0, false );
    SubLFiles.declareFunction( me, "paragraph_string", "PARAGRAPH-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "paragraph_to_xml", "PARAGRAPH-TO-XML", 1, 1, false );
    SubLFiles.declareFunction( me, "build_paragraph_token", "BUILD-PARAGRAPH-TOKEN", 1, 0, false );
    SubLFiles.declareFunction( me, "string_paragraphize", "STRING-PARAGRAPHIZE", 1, 2, false );
    SubLFiles.declareFunction( me, "sign_to_xml", "SIGN-TO-XML", 1, 1, false );
    SubLFiles.declareFunction( me, "document_print_function_trampoline", "DOCUMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "document_p", "DOCUMENT-P", 1, 0, false );
    new $document_p$UnaryFunction();
    SubLFiles.declareFunction( me, "document_paragraphs", "DOCUMENT-PARAGRAPHS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_document_paragraphs", "_CSETF-DOCUMENT-PARAGRAPHS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_document", "MAKE-DOCUMENT", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_document", "VISIT-DEFSTRUCT-DOCUMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_document_method", "VISIT-DEFSTRUCT-OBJECT-DOCUMENT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_document", "NEW-DOCUMENT", 1, 2, false );
    SubLFiles.declareMacro( me, "document_do_paragraphs", "DOCUMENT-DO-PARAGRAPHS" );
    SubLFiles.declareMacro( me, "document_do_sentences", "DOCUMENT-DO-SENTENCES" );
    SubLFiles.declareFunction( me, "possibly_perform_document_dot_analysis", "POSSIBLY-PERFORM-DOCUMENT-DOT-ANALYSIS", 1, 0, false );
    SubLFiles.declareFunction( me, "document_perform_dot_analysis", "DOCUMENT-PERFORM-DOT-ANALYSIS", 1, 0, false );
    SubLFiles.declareFunction( me, "new_document_from_string", "NEW-DOCUMENT-FROM-STRING", 1, 2, false );
    SubLFiles.declareFunction( me, "new_document_from_file", "NEW-DOCUMENT-FROM-FILE", 1, 2, false );
    SubLFiles.declareFunction( me, "new_document_from_stream", "NEW-DOCUMENT-FROM-STREAM", 1, 2, false );
    SubLFiles.declareFunction( me, "document_print", "DOCUMENT-PRINT", 3, 0, false );
    SubLFiles.declareFunction( me, "document_get", "DOCUMENT-GET", 2, 0, false );
    SubLFiles.declareFunction( me, "document_set", "DOCUMENT-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "document_get_sentence", "DOCUMENT-GET-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "document_get_word", "DOCUMENT-GET-WORD", 2, 0, false );
    SubLFiles.declareFunction( me, "document_to_xml", "DOCUMENT-TO-XML", 1, 0, false );
    SubLFiles.declareFunction( me, "document_paragraph_length", "DOCUMENT-PARAGRAPH-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "document_sentence_length", "DOCUMENT-SENTENCE-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "document_word_length", "DOCUMENT-WORD-LENGTH", 1, 0, false );
    SubLFiles.declareMacro( me, "document_do_minimal_words", "DOCUMENT-DO-MINIMAL-WORDS" );
    SubLFiles.declareMacro( me, "document_do_words", "DOCUMENT-DO-WORDS" );
    SubLFiles.declareFunction( me, "document_string", "DOCUMENT-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sentence_iterator", "NEW-SENTENCE-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_document_sentence_iterator", "NEW-DOCUMENT-SENTENCE-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_paragraph_sentence_iterator", "NEW-PARAGRAPH-SENTENCE-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sentence_sentence_iterator", "NEW-SENTENCE-SENTENCE-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "stream_stringify", "STREAM-STRINGIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "alphanumeric_char_or_character_code_p", "ALPHANUMERIC-CHAR-OR-CHARACTER-CODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "alphabetic_char_or_character_code_p", "ALPHABETIC-CHAR-OR-CHARACTER-CODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "latin_alphabetic_character_code_p", "LATIN-ALPHABETIC-CHARACTER-CODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "character_or_character_code_p", "CHARACTER-OR-CHARACTER-CODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sentencifier_initializedP", "SENTENCIFIER-INITIALIZED?", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_sentencifier", "INITIALIZE-SENTENCIFIER", 0, 0, false );
    SubLFiles.declareFunction( me, "finalize_sentencifier", "FINALIZE-SENTENCIFIER", 0, 0, false );
    SubLFiles.declareFunction( me, "sentencify_string", "SENTENCIFY-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "sentencify_file", "SENTENCIFY-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_abbreviation_regular_expressions", "GENERATE-ABBREVIATION-REGULAR-EXPRESSIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "compile_regular_expression_substitutions", "COMPILE-REGULAR-EXPRESSION-SUBSTITUTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "clean_sentences", "CLEAN-SENTENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "document_sentence_countE", "DOCUMENT-SENTENCE-COUNT=", 2, 0, false );
    SubLFiles.declareFunction( me, "test_construct_string_from_words", "TEST-CONSTRUCT-STRING-FROM-WORDS", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_document_file()
  {
    $text_class_print_length$ = SubLFiles.defparameter( "*TEXT-CLASS-PRINT-LENGTH*", TEN_INTEGER );
    $xml_indent_level$ = SubLFiles.defconstant( "*XML-INDENT-LEVEL*", THREE_INTEGER );
    $xml_indent$ = SubLFiles.defconstant( "*XML-INDENT*", Strings.make_string( $xml_indent_level$.getGlobalValue(), Characters.CHAR_space ) );
    $newline$ = SubLFiles.defconstant( "*NEWLINE*", Strings.make_string( ONE_INTEGER, Characters.CHAR_newline ) );
    $xml_string_mapping$ = SubLFiles.defconstant( "*XML-STRING-MAPPING*", $list0 );
    $dtp_sign$ = SubLFiles.defconstant( "*DTP-SIGN*", $sym1$SIGN );
    $wordifier$ = SubLFiles.defparameter( "*WORDIFIER*", $sym68$RKF_STANDARD_STRING_WORDIFY );
    $fst_string_wordify_lock$ = SubLFiles.deflexical( "*FST-STRING-WORDIFY-LOCK*", Locks.make_lock( $str69$fst_string_wordify_lock ) );
    $html_string_wordify_punctuation_chars_caching_state$ = SubLFiles.deflexical( "*HTML-STRING-WORDIFY-PUNCTUATION-CHARS-CACHING-STATE*", NIL );
    $dtp_html_string_wordify_state$ = SubLFiles.defconstant( "*DTP-HTML-STRING-WORDIFY-STATE*", $sym78$HTML_STRING_WORDIFY_STATE );
    $dtp_paragraph$ = SubLFiles.defconstant( "*DTP-PARAGRAPH*", $sym157$PARAGRAPH );
    $dtp_document$ = SubLFiles.defconstant( "*DTP-DOCUMENT*", $sym183$DOCUMENT );
    $perform_dot_analysis_on_docs$ = SubLFiles.defparameter( "*PERFORM-DOT-ANALYSIS-ON-DOCS*", NIL );
    $wordifier_fst$ = SubLFiles.defparameter( "*WORDIFIER-FST*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list220, ConsesLow.list( new SubLObject[] { $list221, ConsesLow.listS( ZERO_INTEGER,
        Symbols.symbol_function( $sym222$WHITESPACEP ), $list223 ), $list224, $list225, $list226, $list227, $list228, $list229, $list230, $list231, $list232, $list233, ConsesLow.listS( ZERO_INTEGER, Symbols
            .symbol_function( $sym234$ALPHABETIC_CHAR_OR_CHARACTER_CODE_P ), $list235 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym236$ISA_DIGIT_CHAR_ ), $list237 ), $list238, $list239, $list240,
      $list241, ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym242$ANY_PUNCTUATION_CHAR_ ), $list243 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym244$SENTENCE_INTERNAL_PUNCTUATION_CHAR_ ),
          $list235 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list243 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym246$UPPER_CASE_CHAR_P ),
              $list247 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym248$ALPHANUMERIC_CHAR_OR_CHARACTER_CODE_P ), $list235 ), $list249, $list250, ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function(
                  $sym222$WHITESPACEP ), $list251 ), $list252, ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym242$ANY_PUNCTUATION_CHAR_ ), $list253 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function(
                      $sym254$QUOTE_CHAR_ ), $list253 ), $list255, ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list253 ), ConsesLow.listS( THREE_INTEGER, Symbols
                          .symbol_function( $sym248$ALPHANUMERIC_CHAR_OR_CHARACTER_CODE_P ), $list256 ), $list257, ConsesLow.listS( THREE_INTEGER, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ),
                              $list258 ), ConsesLow.listS( FOUR_INTEGER, Symbols.symbol_function( $sym246$UPPER_CASE_CHAR_P ), $list259 ), ConsesLow.listS( FOUR_INTEGER, Symbols.symbol_function(
                                  $sym260$LOWER_CASE_CHAR_P ), $list261 ), $list262, ConsesLow.listS( FOUR_INTEGER, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list258 ), ConsesLow.listS(
                                      FIVE_INTEGER, Symbols.symbol_function( $sym263$SENTENCE_FINAL_PUNCTUATION_CHAR_ ), $list235 ), $list264, ConsesLow.listS( SIX_INTEGER, Symbols.symbol_function(
                                          $sym263$SENTENCE_FINAL_PUNCTUATION_CHAR_ ), $list243 ), $list265, $list266, ConsesLow.listS( EIGHT_INTEGER, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ),
                                              $list267 ), $list268, $list269, $list270, ConsesLow.listS( NINE_INTEGER, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list253 ), $list271, ConsesLow
                                                  .listS( TEN_INTEGER, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list235 ), $list272, $list273, ConsesLow.listS( ELEVEN_INTEGER, Symbols
                                                      .symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list275, $list276, $list277, ConsesLow.listS( TWELVE_INTEGER, Symbols.symbol_function(
                                                          $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list278, $list279, ConsesLow.listS( THIRTEEN_INTEGER, Symbols.symbol_function(
                                                              $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list280, $list281, $list282, $list283, ConsesLow.listS( FOURTEEN_INTEGER, Symbols.symbol_function(
                                                                  $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list284, $list285, ConsesLow.listS( FIFTEEN_INTEGER, Symbols.symbol_function(
                                                                      $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list286, $list287, ConsesLow.listS( SIXTEEN_INTEGER, Symbols.symbol_function(
                                                                          $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list288, $list289, ConsesLow.listS( SEVENTEEN_INTEGER, Symbols.symbol_function(
                                                                              $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list290, $list291, ConsesLow.listS( EIGHTEEN_INTEGER, Symbols.symbol_function(
                                                                                  $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list292, $list293, ConsesLow.listS( NINETEEN_INTEGER, Symbols.symbol_function(
                                                                                      $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list294, $list295, $list296, $list297, $list298, $list299, $list300, $list301,
      ConsesLow.listS( TWENTY_INTEGER, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list253 ), $list302, $list303, ConsesLow.listS( $int304$21, Symbols.symbol_function( $sym222$WHITESPACEP ),
          $list251 ), ConsesLow.listS( $int304$21, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list235 ), $list305, $list306, ConsesLow.listS( $int307$22, Symbols.symbol_function(
              $sym222$WHITESPACEP ), $list251 ), ConsesLow.listS( $int307$22, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list235 ), $list308, $list309, ConsesLow.listS( $int310$23, Symbols
                  .symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list235 ), $list311, $list312, ConsesLow.listS( $int313$24, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ),
      $list314, $list315, $list316, ConsesLow.listS( $int317$25, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list318, $list319, ConsesLow.listS( $int320$26, Symbols.symbol_function(
          $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list321, $list322, ConsesLow.listS( $int323$27, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list324 ), $list325, $list326, ConsesLow
              .listS( $int327$28, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list328 ), $list329, ConsesLow.listS( $int330$29, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ),
                  $list243 ), $list294, $list331, ConsesLow.listS( $int332$30, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list333, $list334, ConsesLow.listS( $int335$31, Symbols
                      .symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list336, $list337, $list338, $list339, ConsesLow.listS( $int340$32, Symbols.symbol_function(
                          $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list341, $list342, ConsesLow.listS( $int343$33, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list344,
      $list345, $list346, $list347, ConsesLow.listS( $int348$34, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list349, $list350, ConsesLow.listS( $int351$35, Symbols.symbol_function(
          $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list352, $list353, $list354, ConsesLow.listS( $int355$36, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list356, $list357,
      ConsesLow.listS( $int358$37, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list359, $list360, ConsesLow.listS( $int361$38, Symbols.symbol_function(
          $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list362, $list363, ConsesLow.listS( $int364$39, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list365, $list366, ConsesLow
              .listS( $int367$40, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list368, $list369, ConsesLow.listS( $int370$41, Symbols.symbol_function(
                  $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list371, $list372, ConsesLow.listS( $int373$42, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list374, $list375,
      ConsesLow.listS( $int376$43, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list377, ConsesLow.listS( $int378$44, Symbols.symbol_function( $sym236$ISA_DIGIT_CHAR_ ), $list237 ),
      $list379, $list380, ConsesLow.listS( $int378$44, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list274 ), $list381, ConsesLow.listS( $int382$45, Symbols.symbol_function(
          $sym236$ISA_DIGIT_CHAR_ ), $list383 ), ConsesLow.listS( $int382$45, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list384 ), $list385, $list386, ConsesLow.listS( $int387$46, Symbols
              .symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list243 ), $list388, $list389, $list390, $list391, ConsesLow.listS( $int392$48, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ),
                  $list274 ), $list393, ConsesLow.listS( $int394$49, Symbols.symbol_function( $sym236$ISA_DIGIT_CHAR_ ), $list395 ), ConsesLow.listS( $int394$49, Symbols.symbol_function( $sym222$WHITESPACEP ),
                      $list259 ), ConsesLow.listS( $int394$49, Symbols.symbol_function( $sym254$QUOTE_CHAR_ ), $list259 ), ConsesLow.listS( $int396$50, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ),
                          $list237 ), ConsesLow.listS( $int397$51, Symbols.symbol_function( $sym248$ALPHANUMERIC_CHAR_OR_CHARACTER_CODE_P ), $list235 ), $list398, $list399, ConsesLow.listS( $int397$51, Symbols
                              .symbol_function( $sym222$WHITESPACEP ), $list251 ), $list400, ConsesLow.listS( $int397$51, Symbols.symbol_function( $sym242$ANY_PUNCTUATION_CHAR_ ), $list253 ), ConsesLow.listS( $int397$51,
                                  Symbols.symbol_function( $sym254$QUOTE_CHAR_ ), $list253 ), $list401, ConsesLow.listS( $int397$51, Symbols.symbol_function( $sym245$CHARACTER_OR_CHARACTER_CODE_P ), $list253 )
    } ), $sym402$BUILD_WORD_TOKEN ) );
    $sentencifier_fst$ = SubLFiles.defparameter( "*SENTENCIFIER-FST*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list220, ConsesLow.list( new SubLObject[] { ConsesLow.listS( ZERO_INTEGER,
        Symbols.symbol_function( $sym403$NEWLINE_WORD_P ), $list243 ), ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym404$END_OF_SENTENCE_WORD_P ), $list243 ), ConsesLow.listS( ZERO_INTEGER, Symbols
            .symbol_function( $sym61$WORD_P ), $list235 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym403$NEWLINE_WORD_P ), $list405 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function(
                $sym404$END_OF_SENTENCE_WORD_P ), $list406 ), ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym61$WORD_P ), $list235 ), $list255, ConsesLow.listS( THREE_INTEGER, Symbols.symbol_function(
                    $sym403$NEWLINE_WORD_P ), $list259 ), $list407, ConsesLow.listS( THREE_INTEGER, Symbols.symbol_function( $sym61$WORD_P ), $list235 ), ConsesLow.listS( FOUR_INTEGER, Symbols.symbol_function(
                        $sym408$QUOTE_WORD_P ), $list243 ), $list409, ConsesLow.listS( FOUR_INTEGER, Symbols.symbol_function( $sym61$WORD_P ), $list253 )
    } ), $sym410$BUILD_SENTENCE_TOKEN ) );
    $paragraphier_fst$ = SubLFiles.defparameter( "*PARAGRAPHIER-FST*", finite_state_transducer.new_finite_state_transducer( ZERO_INTEGER, $list220, ConsesLow.list( new SubLObject[] { ConsesLow.listS( ZERO_INTEGER,
        Symbols.symbol_function( $sym411$NEWLINE_SENTENCE_P ), $list412 ), $list413, ConsesLow.listS( ZERO_INTEGER, Symbols.symbol_function( $sym153$SENTENCE_P ), $list414 ), ConsesLow.listS( ONE_INTEGER, Symbols
            .symbol_function( $sym411$NEWLINE_SENTENCE_P ), $list415 ), $list255, ConsesLow.listS( ONE_INTEGER, Symbols.symbol_function( $sym153$SENTENCE_P ), $list414 ), ConsesLow.listS( THREE_INTEGER, Symbols
                .symbol_function( $sym411$NEWLINE_SENTENCE_P ), $list415 ), $list407, ConsesLow.listS( THREE_INTEGER, Symbols.symbol_function( $sym153$SENTENCE_P ), $list253 )
    } ), $sym416$BUILD_PARAGRAPH_TOKEN ) );
    $eos_char$ = SubLFiles.defparameter( "*EOS-CHAR*", Characters.CHAR_escape );
    $eos$ = SubLFiles.defparameter( "*EOS*", PrintLow.format( NIL, $str417$_C, $eos_char$.getDynamicValue() ) );
    $p$ = SubLFiles.defparameter( "*P*", $str418$______ );
    $ap$ = SubLFiles.defparameter( "*AP*", $str419$____________________ );
    $pap$ = SubLFiles.defparameter( "*PAP*", Sequences.cconcatenate( $p$.getDynamicValue(), $ap$.getDynamicValue() ) );
    $people$ = SubLFiles.defparameter( "*PEOPLE*", $list420 );
    $army$ = SubLFiles.defparameter( "*ARMY*", $list421 );
    $companies$ = SubLFiles.defparameter( "*COMPANIES*", $list422 );
    $places$ = SubLFiles.defparameter( "*PLACES*", ConsesLow.list( new SubLObject[] { $str423$arc, $str424$al, $str425$ave, $str426$blv_d, $str427$cl, $str428$ct, $str429$cres, $str430$dr, $str431$expy_, $str432$dist,
      $str433$mt, $str434$ft, $str435$fw_y, $str436$hwa_y, $str437$la, $str438$pde_, $str439$pl, $str440$plz, $str441$rd, $str442$st, $str443$tce, $str444$Ala, $str445$Ariz, $str446$Ark, $str447$Cal, $str448$Calif,
      $str449$Col, $str450$Colo, $str451$Conn, $str452$Del, $str453$Fed, $str454$Fla, $str455$Ga, $str456$Ida, $str457$Id, $str458$Ill, $str459$Ind, $str460$Ia, $str461$Kan, $str462$Kans, $str463$Ken, $str464$Ky,
      $str465$La, $str466$Me, $str467$Md, $str468$Is, $str469$Mass, $str470$Mich, $str471$Minn, $str472$Miss, $str473$Mo, $str474$Mont, $str475$Neb, $str476$Nebr, $str477$Nev, $str478$Mex, $str479$Okla, $str480$Ok,
      $str481$Ore, $str482$Penna, $str483$Penn, $str484$Pa, $str485$Dak, $str486$Tenn, $str487$Tex, $str488$Ut, $str489$Vt, $str490$Va, $str491$Wash, $str492$Wis, $str493$Wisc, $str494$Wy, $str495$Wyo, $str496$USAFA,
      $str497$Alta, $str498$Man, $str499$Ont, $str500$Sask, $str501$Yuk
    } ) );
    $months$ = SubLFiles.defparameter( "*MONTHS*", $list502 );
    $misc$ = SubLFiles.defparameter( "*MISC*", $list503 );
    $abbreviations$ = SubLFiles.defparameter( "*ABBREVIATIONS*", ConsesLow.append( new SubLObject[] { $people$.getDynamicValue(), $army$.getDynamicValue(), $companies$.getDynamicValue(), $places$.getDynamicValue(),
      $months$.getDynamicValue(), $misc$.getDynamicValue()
    } ) );
    $mark_eos_regular_expressions$ = SubLFiles.defparameter( "*MARK-EOS-REGULAR-EXPRESSIONS*", ConsesLow.list( ConsesLow.list( $str504$_n_s__n, $eos$.getDynamicValue(), NIL ), ConsesLow.list( Sequences.cconcatenate(
        $str41$_, new SubLObject[]
        { format_nil.format_nil_a_no_copy( $pap$.getDynamicValue() ), $str505$_s_
        } ), Sequences.cconcatenate( $str506$_1, format_nil.format_nil_a_no_copy( $eos$.getDynamicValue() ) ), NIL ), ConsesLow.list( Sequences.cconcatenate( $str507$__s_w, new SubLObject[] { format_nil
            .format_nil_a_no_copy( $p$.getDynamicValue() ), $str42$_
    } ), Sequences.cconcatenate( $str506$_1, format_nil.format_nil_a_no_copy( $eos$.getDynamicValue() ) ), NIL ) ) );
    $remove_false_eos_regular_expressions1$ = SubLFiles.defparameter( "*REMOVE-FALSE-EOS-REGULAR-EXPRESSIONS1*", ConsesLow.list( ConsesLow.list( Sequences.cconcatenate( $str508$_____w__w, new SubLObject[] { format_nil
        .format_nil_a_no_copy( $pap$.getDynamicValue() ), $str505$_s_, format_nil.format_nil_a_no_copy( $eos$.getDynamicValue() )
    } ), $str506$_1, NIL ), ConsesLow.list( Sequences.cconcatenate( $str508$_____w__w, new SubLObject[] { format_nil.format_nil_a_no_copy( $p$.getDynamicValue() ), $str42$_, format_nil.format_nil_a_no_copy( $eos$
        .getDynamicValue() )
    } ), $str506$_1, NIL ), ConsesLow.list( Sequences.cconcatenate( $str509$__s_w___s__, format_nil.format_nil_a_no_copy( $eos$.getDynamicValue() ) ), $str506$_1, NIL ), ConsesLow.list( Sequences.cconcatenate(
        $str510$_________, new SubLObject[]
        { format_nil.format_nil_a_no_copy( $eos$.getDynamicValue() ), $str511$____lower____
        } ), $str512$_1_2, NIL ), ConsesLow.list( Sequences.cconcatenate( $str513$_____, new SubLObject[] { format_nil.format_nil_a_no_copy( $p$.getDynamicValue() ), $str514$_____s__, format_nil.format_nil_a_no_copy(
            $eos$.getDynamicValue() )
    } ), $str506$_1, NIL ) ) );
    $remove_false_eos_regular_expressions2$ = SubLFiles.defparameter( "*REMOVE-FALSE-EOS-REGULAR-EXPRESSIONS2*", ConsesLow.list( ConsesLow.list( Sequences.cconcatenate( $str515$______s__, new SubLObject[] { format_nil
        .format_nil_a_no_copy( $eos$.getDynamicValue() ), $str516$__s____lower____
    } ), $str512$_1_2, NIL ), ConsesLow.list( Sequences.cconcatenate( $str517$__s___s_, new SubLObject[] { format_nil.format_nil_a_no_copy( $eos$.getDynamicValue() ), $str518$__s__
    } ), $str512$_1_2, NIL ), ConsesLow.list( Sequences.cconcatenate( $str519$__s, new SubLObject[] { format_nil.format_nil_a_no_copy( $pap$.getDynamicValue() ), $str505$_s_, format_nil.format_nil_a_no_copy( $eos$
        .getDynamicValue() )
    } ), $str506$_1, NIL ) ) );
    $split_unsplit_stuff_regular_expressions$ = SubLFiles.defparameter( "*SPLIT-UNSPLIT-STUFF-REGULAR-EXPRESSIONS*", ConsesLow.list( ConsesLow.list( Sequences.cconcatenate( $str520$__D_d___, new SubLObject[] { format_nil
        .format_nil_a_no_copy( $p$.getDynamicValue() ), $str521$___s__
    } ), Sequences.cconcatenate( $str512$_1_2, new SubLObject[] { format_nil.format_nil_a_no_copy( $eos$.getDynamicValue() ), $str522$_3
    } ), NIL ), ConsesLow.list( Sequences.cconcatenate( $str523$___w, new SubLObject[] { format_nil.format_nil_a_no_copy( $p$.getDynamicValue() ), $str524$___s_
    } ), Sequences.cconcatenate( $str506$_1, new SubLObject[] { format_nil.format_nil_a_no_copy( $eos$.getDynamicValue() ), $str525$_2
    } ), NIL ), ConsesLow.list( $str526$__sno_____s______d_, Sequences.cconcatenate( $str506$_1, new SubLObject[] { format_nil.format_nil_a_no_copy( $eos$.getDynamicValue() ), $str525$_2
    } ), $list527 ), ConsesLow.list( $str528$__ap___m___s______upper____, Sequences.cconcatenate( $str506$_1, new SubLObject[] { format_nil.format_nil_a_no_copy( $eos$.getDynamicValue() ), $str525$_2
    } ), NIL ) ) );
    $sentencifier_patterns$ = SubLFiles.defparameter( "*SENTENCIFIER-PATTERNS*", NIL );
    return NIL;
  }

  public static SubLObject setup_document_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sign$.getGlobalValue(), Symbols.symbol_function( $sym8$SIGN_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list9 );
    Structures.def_csetf( $sym10$SIGN_STRING, $sym11$_CSETF_SIGN_STRING );
    Structures.def_csetf( $sym12$SIGN_TYPE, $sym13$_CSETF_SIGN_TYPE );
    Structures.def_csetf( $sym14$SIGN_INFO, $sym15$_CSETF_SIGN_INFO );
    Structures.def_csetf( $sym16$SIGN_CATEGORY, $sym17$_CSETF_SIGN_CATEGORY );
    Structures.def_csetf( $sym18$SIGN_CONSTITUENTS, $sym19$_CSETF_SIGN_CONSTITUENTS );
    Structures.def_csetf( $sym20$SIGN_OFFSET, $sym21$_CSETF_SIGN_OFFSET );
    Structures.def_csetf( $sym22$SIGN_MOTHER, $sym23$_CSETF_SIGN_MOTHER );
    Equality.identity( $sym1$SIGN );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sign$.getGlobalValue(), Symbols.symbol_function( $sym36$VISIT_DEFSTRUCT_OBJECT_SIGN_METHOD ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_sign$.getGlobalValue(), Symbols.symbol_function( $sym39$SXHASH_SIGN_METHOD ) );
    memoization_state.note_globally_cached_function( $sym76$HTML_STRING_WORDIFY_PUNCTUATION_CHARS );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_html_string_wordify_state$.getGlobalValue(), Symbols.symbol_function(
        $sym85$HTML_STRING_WORDIFY_STATE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list86 );
    Structures.def_csetf( $sym87$HSW_STATE_STATE, $sym88$_CSETF_HSW_STATE_STATE );
    Structures.def_csetf( $sym89$HSW_STATE_TAG_PIECES, $sym90$_CSETF_HSW_STATE_TAG_PIECES );
    Structures.def_csetf( $sym91$HSW_STATE_STRING_PIECES, $sym92$_CSETF_HSW_STATE_STRING_PIECES );
    Structures.def_csetf( $sym93$HSW_STATE_PUNCTUATION_PIECES, $sym94$_CSETF_HSW_STATE_PUNCTUATION_PIECES );
    Structures.def_csetf( $sym95$HSW_STATE_LEADING_TAGS, $sym96$_CSETF_HSW_STATE_LEADING_TAGS );
    Structures.def_csetf( $sym97$HSW_STATE_FOLLOWING_TAGS, $sym98$_CSETF_HSW_STATE_FOLLOWING_TAGS );
    Structures.def_csetf( $sym99$HSW_STATE_CURRENT_OFFSET, $sym100$_CSETF_HSW_STATE_CURRENT_OFFSET );
    Equality.identity( $sym78$HTML_STRING_WORDIFY_STATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_html_string_wordify_state$.getGlobalValue(), Symbols.symbol_function(
        $sym109$VISIT_DEFSTRUCT_OBJECT_HTML_STRING_WORDIFY_STATE_METHOD ) );
    utilities_macros.note_funcall_helper_function( $sym84$PRINT_HSW_STATE );
    utilities_macros.note_funcall_helper_function( $sym122$HTML_STRING_WORDIFY );
    generic_testing.define_test_case_table_int( $sym124$FST_STRING_WORDIFY, ConsesLow.list( new SubLObject[] { $kw125$TEST, $sym126$FST_WORDIFY_TEST, $kw127$OWNER, NIL, $kw128$CLASSES, NIL, $kw129$KB, $kw130$TINY,
      $kw131$WORKING_, T
    } ), $list132 );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_paragraph$.getGlobalValue(), Symbols.symbol_function( $sym164$PARAGRAPH_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list165 );
    Structures.def_csetf( $sym166$PARAGRAPH_SENTENCES, $sym167$_CSETF_PARAGRAPH_SENTENCES );
    Structures.def_csetf( $sym168$PARAGRAPH_MOTHER, $sym169$_CSETF_PARAGRAPH_MOTHER );
    Equality.identity( $sym157$PARAGRAPH );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_paragraph$.getGlobalValue(), Symbols.symbol_function( $sym172$VISIT_DEFSTRUCT_OBJECT_PARAGRAPH_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_document$.getGlobalValue(), Symbols.symbol_function( $sym190$DOCUMENT_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list191 );
    Structures.def_csetf( $sym192$DOCUMENT_PARAGRAPHS, $sym193$_CSETF_DOCUMENT_PARAGRAPHS );
    Equality.identity( $sym183$DOCUMENT );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_document$.getGlobalValue(), Symbols.symbol_function( $sym196$VISIT_DEFSTRUCT_OBJECT_DOCUMENT_METHOD ) );
    access_macros.register_external_symbol( $sym531$SENTENCIFY_STRING );
    generic_testing.define_test_case_table_int( $sym535$NEW_DOCUMENT, ConsesLow.list( new SubLObject[] { $kw125$TEST, $sym536$DOCUMENT_SENTENCE_COUNT_, $kw127$OWNER, NIL, $kw128$CLASSES, NIL, $kw129$KB, $kw537$FULL,
      $kw131$WORKING_, T
    } ), $list538 );
    generic_testing.define_test_case_table_int( $sym539$TEST_CONSTRUCT_STRING_FROM_WORDS, ConsesLow.list( new SubLObject[] { $kw125$TEST, EQUAL, $kw127$OWNER, NIL, $kw128$CLASSES, NIL, $kw129$KB, $kw537$FULL,
      $kw131$WORKING_, T
    } ), $list540 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_document_file();
  }

  @Override
  public void initializeVariables()
  {
    init_document_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_document_file();
  }
  static
  {
    me = new document();
    $text_class_print_length$ = null;
    $xml_indent_level$ = null;
    $xml_indent$ = null;
    $newline$ = null;
    $xml_string_mapping$ = null;
    $dtp_sign$ = null;
    $wordifier$ = null;
    $fst_string_wordify_lock$ = null;
    $html_string_wordify_punctuation_chars_caching_state$ = null;
    $dtp_html_string_wordify_state$ = null;
    $dtp_paragraph$ = null;
    $dtp_document$ = null;
    $perform_dot_analysis_on_docs$ = null;
    $wordifier_fst$ = null;
    $sentencifier_fst$ = null;
    $paragraphier_fst$ = null;
    $eos_char$ = null;
    $eos$ = null;
    $p$ = null;
    $ap$ = null;
    $pap$ = null;
    $people$ = null;
    $army$ = null;
    $companies$ = null;
    $places$ = null;
    $months$ = null;
    $misc$ = null;
    $abbreviations$ = null;
    $mark_eos_regular_expressions$ = null;
    $remove_false_eos_regular_expressions1$ = null;
    $remove_false_eos_regular_expressions2$ = null;
    $split_unsplit_stuff_regular_expressions$ = null;
    $sentencifier_patterns$ = null;
    $list0 = ConsesLow.list( ConsesLow.cons( makeString( "<" ), makeString( "&lt;" ) ), ConsesLow.cons( makeString( "&" ), makeString( "&amp;" ) ), ConsesLow.cons( makeString( ">" ), makeString( "&gt;" ) ), ConsesLow
        .cons( makeString( "\"" ), makeString( "&quot;" ) ), ConsesLow.cons( makeString( "'" ), makeString( "&apos;" ) ) );
    $sym1$SIGN = makeSymbol( "SIGN" );
    $sym2$SIGN_P = makeSymbol( "SIGN-P" );
    $list3 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "TYPE" ), makeSymbol( "INFO" ), makeSymbol( "CATEGORY" ), makeSymbol( "CONSTITUENTS" ), makeSymbol( "OFFSET" ), makeSymbol( "MOTHER" ) );
    $list4 = ConsesLow.list( makeKeyword( "STRING" ), makeKeyword( "TYPE" ), makeKeyword( "INFO" ), makeKeyword( "CATEGORY" ), makeKeyword( "CONSTITUENTS" ), makeKeyword( "OFFSET" ), makeKeyword( "MOTHER" ) );
    $list5 = ConsesLow.list( makeSymbol( "SIGN-STRING" ), makeSymbol( "SIGN-TYPE" ), makeSymbol( "SIGN-INFO" ), makeSymbol( "SIGN-CATEGORY" ), makeSymbol( "SIGN-CONSTITUENTS" ), makeSymbol( "SIGN-OFFSET" ), makeSymbol(
        "SIGN-MOTHER" ) );
    $list6 = ConsesLow.list( makeSymbol( "_CSETF-SIGN-STRING" ), makeSymbol( "_CSETF-SIGN-TYPE" ), makeSymbol( "_CSETF-SIGN-INFO" ), makeSymbol( "_CSETF-SIGN-CATEGORY" ), makeSymbol( "_CSETF-SIGN-CONSTITUENTS" ),
        makeSymbol( "_CSETF-SIGN-OFFSET" ), makeSymbol( "_CSETF-SIGN-MOTHER" ) );
    $sym7$SIGN_PRINT = makeSymbol( "SIGN-PRINT" );
    $sym8$SIGN_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SIGN-PRINT-FUNCTION-TRAMPOLINE" );
    $list9 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SIGN-P" ) );
    $sym10$SIGN_STRING = makeSymbol( "SIGN-STRING" );
    $sym11$_CSETF_SIGN_STRING = makeSymbol( "_CSETF-SIGN-STRING" );
    $sym12$SIGN_TYPE = makeSymbol( "SIGN-TYPE" );
    $sym13$_CSETF_SIGN_TYPE = makeSymbol( "_CSETF-SIGN-TYPE" );
    $sym14$SIGN_INFO = makeSymbol( "SIGN-INFO" );
    $sym15$_CSETF_SIGN_INFO = makeSymbol( "_CSETF-SIGN-INFO" );
    $sym16$SIGN_CATEGORY = makeSymbol( "SIGN-CATEGORY" );
    $sym17$_CSETF_SIGN_CATEGORY = makeSymbol( "_CSETF-SIGN-CATEGORY" );
    $sym18$SIGN_CONSTITUENTS = makeSymbol( "SIGN-CONSTITUENTS" );
    $sym19$_CSETF_SIGN_CONSTITUENTS = makeSymbol( "_CSETF-SIGN-CONSTITUENTS" );
    $sym20$SIGN_OFFSET = makeSymbol( "SIGN-OFFSET" );
    $sym21$_CSETF_SIGN_OFFSET = makeSymbol( "_CSETF-SIGN-OFFSET" );
    $sym22$SIGN_MOTHER = makeSymbol( "SIGN-MOTHER" );
    $sym23$_CSETF_SIGN_MOTHER = makeSymbol( "_CSETF-SIGN-MOTHER" );
    $kw24$STRING = makeKeyword( "STRING" );
    $kw25$TYPE = makeKeyword( "TYPE" );
    $kw26$INFO = makeKeyword( "INFO" );
    $kw27$CATEGORY = makeKeyword( "CATEGORY" );
    $kw28$CONSTITUENTS = makeKeyword( "CONSTITUENTS" );
    $kw29$OFFSET = makeKeyword( "OFFSET" );
    $kw30$MOTHER = makeKeyword( "MOTHER" );
    $str31$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw32$BEGIN = makeKeyword( "BEGIN" );
    $sym33$MAKE_SIGN = makeSymbol( "MAKE-SIGN" );
    $kw34$SLOT = makeKeyword( "SLOT" );
    $kw35$END = makeKeyword( "END" );
    $sym36$VISIT_DEFSTRUCT_OBJECT_SIGN_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SIGN-METHOD" );
    $kw37$SIGN = makeKeyword( "SIGN" );
    $str38$ = makeString( "" );
    $sym39$SXHASH_SIGN_METHOD = makeSymbol( "SXHASH-SIGN-METHOD" );
    $str40$__ = makeString( "#<" );
    $str41$_ = makeString( "(" );
    $str42$_ = makeString( ")" );
    $str43$__ = makeString( ": " );
    $str44$_ = makeString( "\"" );
    $str45$_ = makeString( " " );
    $str46$____ = makeString( " ..." );
    $str47$_ = makeString( "/" );
    $str48$_ = makeString( ">" );
    $sym49$LISTP = makeSymbol( "LISTP" );
    $sym50$STRINGP = makeSymbol( "STRINGP" );
    $sym51$VECTORP = makeSymbol( "VECTORP" );
    $str52$Attempt_to_set_the_non_existing_s = makeString( "Attempt to set the non-existing slot ~a" );
    $list53 = ConsesLow.list( ConsesLow.list( makeSymbol( "CONSTITUENT" ), makeSymbol( "SIGN" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym54$CDOVECTOR = makeSymbol( "CDOVECTOR" );
    $sym55$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $kw56$W = makeKeyword( "W" );
    $kw57$P = makeKeyword( "P" );
    $str58$Unknown_sign_subclass__a = makeString( "Unknown sign subclass ~a" );
    $kw59$XW = makeKeyword( "XW" );
    $list60 = ConsesLow.list( makeKeyword( "W" ), makeKeyword( "XW" ) );
    $sym61$WORD_P = makeSymbol( "WORD-P" );
    $sym62$EXHAUSTIVE_WORD_P = makeSymbol( "EXHAUSTIVE-WORD-P" );
    $kw63$INTERPS = makeKeyword( "INTERPS" );
    $kw64$LEX_ENTRIES = makeKeyword( "LEX-ENTRIES" );
    $kw65$CYC_POS = makeKeyword( "CYC-POS" );
    $sym66$INTEGERP = makeSymbol( "INTEGERP" );
    $sym67$VECTOR = makeSymbol( "VECTOR" );
    $sym68$RKF_STANDARD_STRING_WORDIFY = makeSymbol( "RKF-STANDARD-STRING-WORDIFY" );
    $str69$fst_string_wordify_lock = makeString( "fst-string-wordify-lock" );
    $sym70$_EXIT = makeSymbol( "%EXIT" );
    $kw71$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym72$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym73$RKF_CH_STRING_TOKENIZE = makeSymbol( "RKF-CH-STRING-TOKENIZE" );
    $sym74$STANDARD_STRING_TOKENIZE = makeSymbol( "STANDARD-STRING-TOKENIZE" );
    $sym75$SPLIT_STRING = makeSymbol( "SPLIT-STRING" );
    $sym76$HTML_STRING_WORDIFY_PUNCTUATION_CHARS = makeSymbol( "HTML-STRING-WORDIFY-PUNCTUATION-CHARS" );
    $sym77$_HTML_STRING_WORDIFY_PUNCTUATION_CHARS_CACHING_STATE_ = makeSymbol( "*HTML-STRING-WORDIFY-PUNCTUATION-CHARS-CACHING-STATE*" );
    $sym78$HTML_STRING_WORDIFY_STATE = makeSymbol( "HTML-STRING-WORDIFY-STATE" );
    $sym79$HTML_STRING_WORDIFY_STATE_P = makeSymbol( "HTML-STRING-WORDIFY-STATE-P" );
    $list80 = ConsesLow.list( makeSymbol( "STATE" ), makeSymbol( "TAG-PIECES" ), makeSymbol( "STRING-PIECES" ), makeSymbol( "PUNCTUATION-PIECES" ), makeSymbol( "LEADING-TAGS" ), makeSymbol( "FOLLOWING-TAGS" ),
        makeSymbol( "CURRENT-OFFSET" ) );
    $list81 = ConsesLow.list( makeKeyword( "STATE" ), makeKeyword( "TAG-PIECES" ), makeKeyword( "STRING-PIECES" ), makeKeyword( "PUNCTUATION-PIECES" ), makeKeyword( "LEADING-TAGS" ), makeKeyword( "FOLLOWING-TAGS" ),
        makeKeyword( "CURRENT-OFFSET" ) );
    $list82 = ConsesLow.list( makeSymbol( "HSW-STATE-STATE" ), makeSymbol( "HSW-STATE-TAG-PIECES" ), makeSymbol( "HSW-STATE-STRING-PIECES" ), makeSymbol( "HSW-STATE-PUNCTUATION-PIECES" ), makeSymbol(
        "HSW-STATE-LEADING-TAGS" ), makeSymbol( "HSW-STATE-FOLLOWING-TAGS" ), makeSymbol( "HSW-STATE-CURRENT-OFFSET" ) );
    $list83 = ConsesLow.list( makeSymbol( "_CSETF-HSW-STATE-STATE" ), makeSymbol( "_CSETF-HSW-STATE-TAG-PIECES" ), makeSymbol( "_CSETF-HSW-STATE-STRING-PIECES" ), makeSymbol( "_CSETF-HSW-STATE-PUNCTUATION-PIECES" ),
        makeSymbol( "_CSETF-HSW-STATE-LEADING-TAGS" ), makeSymbol( "_CSETF-HSW-STATE-FOLLOWING-TAGS" ), makeSymbol( "_CSETF-HSW-STATE-CURRENT-OFFSET" ) );
    $sym84$PRINT_HSW_STATE = makeSymbol( "PRINT-HSW-STATE" );
    $sym85$HTML_STRING_WORDIFY_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "HTML-STRING-WORDIFY-STATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list86 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "HTML-STRING-WORDIFY-STATE-P" ) );
    $sym87$HSW_STATE_STATE = makeSymbol( "HSW-STATE-STATE" );
    $sym88$_CSETF_HSW_STATE_STATE = makeSymbol( "_CSETF-HSW-STATE-STATE" );
    $sym89$HSW_STATE_TAG_PIECES = makeSymbol( "HSW-STATE-TAG-PIECES" );
    $sym90$_CSETF_HSW_STATE_TAG_PIECES = makeSymbol( "_CSETF-HSW-STATE-TAG-PIECES" );
    $sym91$HSW_STATE_STRING_PIECES = makeSymbol( "HSW-STATE-STRING-PIECES" );
    $sym92$_CSETF_HSW_STATE_STRING_PIECES = makeSymbol( "_CSETF-HSW-STATE-STRING-PIECES" );
    $sym93$HSW_STATE_PUNCTUATION_PIECES = makeSymbol( "HSW-STATE-PUNCTUATION-PIECES" );
    $sym94$_CSETF_HSW_STATE_PUNCTUATION_PIECES = makeSymbol( "_CSETF-HSW-STATE-PUNCTUATION-PIECES" );
    $sym95$HSW_STATE_LEADING_TAGS = makeSymbol( "HSW-STATE-LEADING-TAGS" );
    $sym96$_CSETF_HSW_STATE_LEADING_TAGS = makeSymbol( "_CSETF-HSW-STATE-LEADING-TAGS" );
    $sym97$HSW_STATE_FOLLOWING_TAGS = makeSymbol( "HSW-STATE-FOLLOWING-TAGS" );
    $sym98$_CSETF_HSW_STATE_FOLLOWING_TAGS = makeSymbol( "_CSETF-HSW-STATE-FOLLOWING-TAGS" );
    $sym99$HSW_STATE_CURRENT_OFFSET = makeSymbol( "HSW-STATE-CURRENT-OFFSET" );
    $sym100$_CSETF_HSW_STATE_CURRENT_OFFSET = makeSymbol( "_CSETF-HSW-STATE-CURRENT-OFFSET" );
    $kw101$STATE = makeKeyword( "STATE" );
    $kw102$TAG_PIECES = makeKeyword( "TAG-PIECES" );
    $kw103$STRING_PIECES = makeKeyword( "STRING-PIECES" );
    $kw104$PUNCTUATION_PIECES = makeKeyword( "PUNCTUATION-PIECES" );
    $kw105$LEADING_TAGS = makeKeyword( "LEADING-TAGS" );
    $kw106$FOLLOWING_TAGS = makeKeyword( "FOLLOWING-TAGS" );
    $kw107$CURRENT_OFFSET = makeKeyword( "CURRENT-OFFSET" );
    $sym108$MAKE_HTML_STRING_WORDIFY_STATE = makeSymbol( "MAKE-HTML-STRING-WORDIFY-STATE" );
    $sym109$VISIT_DEFSTRUCT_OBJECT_HTML_STRING_WORDIFY_STATE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-HTML-STRING-WORDIFY-STATE-METHOD" );
    $str110$__S__S_ = makeString( "<~S ~S>" );
    $list111 = ConsesLow.list( makeKeyword( "STATE" ), makeKeyword( "NORMAL" ), makeKeyword( "CURRENT-OFFSET" ), ZERO_INTEGER );
    $kw112$SPACE = makeKeyword( "SPACE" );
    $kw113$END_OF_TAG = makeKeyword( "END-OF-TAG" );
    $kw114$START_OF_TAG = makeKeyword( "START-OF-TAG" );
    $kw115$PUNCTUATION = makeKeyword( "PUNCTUATION" );
    $kw116$DEFAULT = makeKeyword( "DEFAULT" );
    $kw117$INSIDE_TAG = makeKeyword( "INSIDE-TAG" );
    $kw118$NORMAL = makeKeyword( "NORMAL" );
    $list119 = ConsesLow.list( makeKeyword( "DEFAULT" ), makeKeyword( "START-OF-TAG" ), makeKeyword( "SPACE" ) );
    $str120$Unknown_state___S = makeString( "Unknown state: ~S" );
    $kw121$FOLLOWING_WHITESPACE = makeKeyword( "FOLLOWING-WHITESPACE" );
    $sym122$HTML_STRING_WORDIFY = makeSymbol( "HTML-STRING-WORDIFY" );
    $kw123$LEADING_WHITESPACE = makeKeyword( "LEADING-WHITESPACE" );
    $sym124$FST_STRING_WORDIFY = makeSymbol( "FST-STRING-WORDIFY" );
    $kw125$TEST = makeKeyword( "TEST" );
    $sym126$FST_WORDIFY_TEST = makeSymbol( "FST-WORDIFY-TEST" );
    $kw127$OWNER = makeKeyword( "OWNER" );
    $kw128$CLASSES = makeKeyword( "CLASSES" );
    $kw129$KB = makeKeyword( "KB" );
    $kw130$TINY = makeKeyword( "TINY" );
    $kw131$WORKING_ = makeKeyword( "WORKING?" );
    $list132 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeString( "2.4 cm" ) ), ConsesLow.list( makeString( "2.4" ), makeString( "cm" ) ) ), ConsesLow.list( ConsesLow.list( makeString(
        "Mr. Bill Clinton, president of the Clinton Foundation, met George W. Bush and gave him $400,000.00" ) ), ConsesLow.list( new SubLObject[]
        { makeString( "Mr." ), makeString( "Bill" ), makeString( "Clinton" ), makeString( "," ), makeString( "president" ), makeString( "of" ), makeString( "the" ), makeString( "Clinton" ), makeString( "Foundation" ),
          makeString( "," ), makeString( "met" ), makeString( "George" ), makeString( "W" ), makeString( "." ), makeString( "Bush" ), makeString( "and" ), makeString( "gave" ), makeString( "him" ), makeString( "$" ),
          makeString( "400,000.00" ), makeSymbol( ">" )
        } ) ), ConsesLow.list( ConsesLow.list( makeString( "C.I.A. director Patrick Henry said, \"Give me liberty or give me death!\"" ) ), ConsesLow.list( new SubLObject[] { makeString( "C.I.A." ), makeString(
            "director" ), makeString( "Patrick" ), makeString( "Henry" ), makeString( "said" ), makeString( "," ), makeString( "\"" ), makeString( "Give" ), makeString( "me" ), makeString( "liberty" ), makeString(
                "or" ), makeString( "give" ), makeString( "me" ), makeString( "death" ), makeString( "!" ), makeString( "\"" ), makeSymbol( ">" )
        } ) ), ConsesLow.list( ConsesLow.list( makeString( "I have -1 apples and 1-4 cats" ) ), ConsesLow.list( makeString( "I" ), makeString( "have" ), makeString( "-" ), makeString( "1" ), makeString( "apples" ),
            makeString( "and" ), makeString( "1-4" ), makeString( "cats" ) ) ), ConsesLow.list( ConsesLow.list( makeString( "I like cats.  You like zebras." ) ), ConsesLow.list( new SubLObject[]
            { makeString( "I" ), makeString( "like" ), makeString( "cats" ), makeString( "." ), makeString( "You" ), makeString( "like" ), makeString( "zebras" ), makeString( "." ), makeSymbol( ">" )
        } ) ), ConsesLow.list( ConsesLow.list( makeString( "I work for the C.I.A.  Where do you work?" ) ), ConsesLow.list( new SubLObject[] { makeString( "I" ), makeString( "work" ), makeString( "for" ), makeString(
            "the" ), makeString( "C.I.A." ), makeString( "Where" ), makeString( "do" ), makeString( "you" ), makeString( "work" ), makeString( "?" )
        } ) ), ConsesLow.list( ConsesLow.list( makeString( "couldn't eat" ) ), ConsesLow.list( makeString( "could" ), makeString( "n't" ), makeString( "eat" ) ) ), ConsesLow.list( ConsesLow.list( makeString( "3^4" ) ),
            ConsesLow.list( makeString( "3" ), makeString( "^" ), makeString( "4" ) ) ), ConsesLow.list( ConsesLow.list( makeString( "bit-o'-honey" ) ), ConsesLow.list( makeString( "bit-o" ), makeString( "'" ),
                makeString( "-" ), makeString( "honey" ) ) ), ConsesLow.list( ConsesLow.list( makeString( "can't eat" ) ), ConsesLow.list( makeString( "ca" ), makeString( "n't" ), makeString( "eat" ) ) )
    } );
    $str133$_a_WRD_a__a__WRD__a = makeString( "~a<WRD~a>~a</WRD>~a" );
    $str134$_tag__ = makeString( " tag=\"" );
    $list135 = ConsesLow.list( makeString( "." ), makeString( "!" ), makeString( "?" ) );
    $list136 = ConsesLow.list( makeString( "\"" ), makeString( "'" ), makeString( "`" ) );
    $str137$_ = makeString( "\n" );
    $list138 = ConsesLow.list( new SubLObject[] { makeString( "." ), makeString( "," ), makeString( ";" ), makeString( ":" ), makeString( "?" ), makeString( "!" ), makeString( "-" ), makeString( "--" ), makeString(
        "---" ), makeString( "(" ), makeString( ")" ), makeString( "[" ), makeString( "]" ), makeString( "{" ), makeString( "}" ), makeString( "\"" ), makeString( "'" ), makeString( "`" )
    } );
    $list139 = ConsesLow.list( Characters.CHAR_period, Characters.CHAR_question, Characters.CHAR_exclamation );
    $list140 = ConsesLow.list( new SubLObject[] { Characters.CHAR_comma, Characters.CHAR_semicolon, Characters.CHAR_colon, Characters.CHAR_quote, Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_lbrace,
      Characters.CHAR_rbrace, Characters.CHAR_lbracket, Characters.CHAR_rbracket, Characters.CHAR_hyphen
    } );
    $list141 = ConsesLow.list( Characters.CHAR_quotation, Characters.CHAR_quote, Characters.CHAR_backquote );
    $sym142$PHRASE_P = makeSymbol( "PHRASE-P" );
    $list143 = ConsesLow.list( ConsesLow.list( makeSymbol( "CONSTITUENT" ), makeSymbol( "PHRASE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym144$SIGN_DO_CONSTITUENTS = makeSymbol( "SIGN-DO-CONSTITUENTS" );
    $str145$_a_PHR_a__a_a_a__PHR__a = makeString( "~a<PHR~a>~a~a~a</PHR>~a" );
    $str146$_cat__ = makeString( " cat=\"" );
    $list147 = ConsesLow.list( ConsesLow.list( makeSymbol( "WORD" ), makeSymbol( "SENTENCE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym148$CDOLIST = makeSymbol( "CDOLIST" );
    $sym149$SENTENCE_YIELD_EXHAUSTIVE = makeSymbol( "SENTENCE-YIELD-EXHAUSTIVE" );
    $sym150$SENTENCE_YIELD = makeSymbol( "SENTENCE-YIELD" );
    $kw151$S = makeKeyword( "S" );
    $list152 = ConsesLow.list( makeKeyword( "OFFSET" ), ZERO_INTEGER );
    $sym153$SENTENCE_P = makeSymbol( "SENTENCE-P" );
    $list154 = ConsesLow.list( ConsesLow.list( makeSymbol( "CONSTITUENT" ), makeSymbol( "SENTENCE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym155$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $sym156$PUNCTUATION_SIGN_P = makeSymbol( "PUNCTUATION-SIGN-P" );
    $sym157$PARAGRAPH = makeSymbol( "PARAGRAPH" );
    $sym158$PARAGRAPH_P = makeSymbol( "PARAGRAPH-P" );
    $list159 = ConsesLow.list( makeSymbol( "SENTENCES" ), makeSymbol( "MOTHER" ) );
    $list160 = ConsesLow.list( makeKeyword( "SENTENCES" ), makeKeyword( "MOTHER" ) );
    $list161 = ConsesLow.list( makeSymbol( "PARAGRAPH-SENTENCES" ), makeSymbol( "PARAGRAPH-MOTHER" ) );
    $list162 = ConsesLow.list( makeSymbol( "_CSETF-PARAGRAPH-SENTENCES" ), makeSymbol( "_CSETF-PARAGRAPH-MOTHER" ) );
    $sym163$PARAGRAPH_PRINT = makeSymbol( "PARAGRAPH-PRINT" );
    $sym164$PARAGRAPH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "PARAGRAPH-PRINT-FUNCTION-TRAMPOLINE" );
    $list165 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "PARAGRAPH-P" ) );
    $sym166$PARAGRAPH_SENTENCES = makeSymbol( "PARAGRAPH-SENTENCES" );
    $sym167$_CSETF_PARAGRAPH_SENTENCES = makeSymbol( "_CSETF-PARAGRAPH-SENTENCES" );
    $sym168$PARAGRAPH_MOTHER = makeSymbol( "PARAGRAPH-MOTHER" );
    $sym169$_CSETF_PARAGRAPH_MOTHER = makeSymbol( "_CSETF-PARAGRAPH-MOTHER" );
    $kw170$SENTENCES = makeKeyword( "SENTENCES" );
    $sym171$MAKE_PARAGRAPH = makeSymbol( "MAKE-PARAGRAPH" );
    $sym172$VISIT_DEFSTRUCT_OBJECT_PARAGRAPH_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-PARAGRAPH-METHOD" );
    $list173 = ConsesLow.list( ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "PARAGRAPH" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list174 = ConsesLow.list( ConsesLow.list( makeSymbol( "WORD" ), makeSymbol( "PARAGRAPH" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym175$SENTENCE = makeUninternedSymbol( "SENTENCE" );
    $sym176$PARAGRAPH_DO_SENTENCES = makeSymbol( "PARAGRAPH-DO-SENTENCES" );
    $sym177$SENTENCE_DO_WORDS = makeSymbol( "SENTENCE-DO-WORDS" );
    $sym178$SENTENCE = makeUninternedSymbol( "SENTENCE" );
    $sym179$SENTENCE_DO_MINIMAL_WORDS = makeSymbol( "SENTENCE-DO-MINIMAL-WORDS" );
    $str180$__PAR_ = makeString( "#<PAR:" );
    $str181$_PAR_ = makeString( "<PAR>" );
    $str182$__PAR_ = makeString( "</PAR>" );
    $sym183$DOCUMENT = makeSymbol( "DOCUMENT" );
    $sym184$DOCUMENT_P = makeSymbol( "DOCUMENT-P" );
    $list185 = ConsesLow.list( makeSymbol( "PARAGRAPHS" ) );
    $list186 = ConsesLow.list( makeKeyword( "PARAGRAPHS" ) );
    $list187 = ConsesLow.list( makeSymbol( "DOCUMENT-PARAGRAPHS" ) );
    $list188 = ConsesLow.list( makeSymbol( "_CSETF-DOCUMENT-PARAGRAPHS" ) );
    $sym189$DOCUMENT_PRINT = makeSymbol( "DOCUMENT-PRINT" );
    $sym190$DOCUMENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "DOCUMENT-PRINT-FUNCTION-TRAMPOLINE" );
    $list191 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "DOCUMENT-P" ) );
    $sym192$DOCUMENT_PARAGRAPHS = makeSymbol( "DOCUMENT-PARAGRAPHS" );
    $sym193$_CSETF_DOCUMENT_PARAGRAPHS = makeSymbol( "_CSETF-DOCUMENT-PARAGRAPHS" );
    $kw194$PARAGRAPHS = makeKeyword( "PARAGRAPHS" );
    $sym195$MAKE_DOCUMENT = makeSymbol( "MAKE-DOCUMENT" );
    $sym196$VISIT_DEFSTRUCT_OBJECT_DOCUMENT_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-DOCUMENT-METHOD" );
    $str197$_A_is_neither_a_string_nor_a_stre = makeString( "~A is neither a string nor a stream in NEW-DOCUMENT." );
    $list198 = ConsesLow.list( ConsesLow.list( makeSymbol( "PARAGRAPH" ), makeSymbol( "DOCUMENT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list199 = ConsesLow.list( ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "DOCUMENT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym200$PARAGRAPH = makeUninternedSymbol( "PARAGRAPH" );
    $sym201$DOCUMENT_DO_PARAGRAPHS = makeSymbol( "DOCUMENT-DO-PARAGRAPHS" );
    $str202$_ = makeString( "." );
    $list203 = ConsesLow.list( makeSymbol( "FIRST-WORD" ), makeSymbol( "SECOND-WORD" ), makeSymbol( "SENT" ) );
    $kw204$INPUT = makeKeyword( "INPUT" );
    $str205$Unable_to_open__S = makeString( "Unable to open ~S" );
    $sym206$INPUT_STREAM_P = makeSymbol( "INPUT-STREAM-P" );
    $str207$__DOC_ = makeString( "#<DOC:" );
    $str208$Sentence_index__A_out_of_bounds_ = makeString( "Sentence index ~A out of bounds." );
    $str209$_DOC_ = makeString( "<DOC>" );
    $str210$__DOC_ = makeString( "</DOC>" );
    $list211 = ConsesLow.list( ConsesLow.list( makeSymbol( "WORD" ), makeSymbol( "DOCUMENT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym212$SENTENCE = makeUninternedSymbol( "SENTENCE" );
    $sym213$DOCUMENT_DO_SENTENCES = makeSymbol( "DOCUMENT-DO-SENTENCES" );
    $sym214$SENTENCE = makeUninternedSymbol( "SENTENCE" );
    $str215$can_t_create_sentence_iterator_fo = makeString( "can't create sentence iterator for ~a" );
    $kw216$EOF = makeKeyword( "EOF" );
    $list217 = ConsesLow.list( makeInteger( 247 ), makeInteger( 215 ) );
    $int218$192 = makeInteger( 192 );
    $int219$591 = makeInteger( 591 );
    $list220 = ConsesLow.list( TWO_INTEGER );
    $list221 = ConsesLow.list( ZERO_INTEGER, Characters.CHAR_newline, ConsesLow.list( makeKeyword( "EMIT" ) ), TWO_INTEGER );
    $sym222$WHITESPACEP = makeSymbol( "WHITESPACEP" );
    $list223 = ConsesLow.list( NIL, ZERO_INTEGER );
    $list224 = ConsesLow.list( ZERO_INTEGER, Characters.CHAR_M, ConsesLow.list( makeKeyword( "EMIT" ) ), ELEVEN_INTEGER );
    $list225 = ConsesLow.list( ZERO_INTEGER, Characters.CHAR_D, ConsesLow.list( makeKeyword( "EMIT" ) ), FOURTEEN_INTEGER );
    $list226 = ConsesLow.list( ZERO_INTEGER, Characters.CHAR_P, ConsesLow.list( makeKeyword( "EMIT" ) ), SIXTEEN_INTEGER );
    $list227 = ConsesLow.list( ZERO_INTEGER, Characters.CHAR_L, ConsesLow.list( makeKeyword( "EMIT" ) ), NINETEEN_INTEGER );
    $list228 = ConsesLow.list( ZERO_INTEGER, Characters.CHAR_n, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 30 ) );
    $list229 = ConsesLow.list( ZERO_INTEGER, Characters.CHAR_w, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 32 ) );
    $list230 = ConsesLow.list( ZERO_INTEGER, Characters.CHAR_h, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 33 ) );
    $list231 = ConsesLow.list( ZERO_INTEGER, Characters.CHAR_c, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 36 ) );
    $list232 = ConsesLow.list( ZERO_INTEGER, Characters.CHAR_i, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 40 ) );
    $list233 = ConsesLow.list( ZERO_INTEGER, Characters.CHAR_a, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 48 ) );
    $sym234$ALPHABETIC_CHAR_OR_CHARACTER_CODE_P = makeSymbol( "ALPHABETIC-CHAR-OR-CHARACTER-CODE-P" );
    $list235 = ConsesLow.list( ConsesLow.list( makeKeyword( "EMIT" ) ), ONE_INTEGER );
    $sym236$ISA_DIGIT_CHAR_ = makeSymbol( "ISA-DIGIT-CHAR?" );
    $list237 = ConsesLow.list( ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 44 ) );
    $list238 = ConsesLow.list( ZERO_INTEGER, Characters.CHAR_hyphen, ConsesLow.list( makeKeyword( "EMIT" ) ), NINE_INTEGER );
    $list239 = ConsesLow.list( ZERO_INTEGER, Characters.CHAR_underbar, ConsesLow.list( makeKeyword( "EMIT" ) ), NINE_INTEGER );
    $list240 = ConsesLow.list( ZERO_INTEGER, Characters.CHAR_quote, ConsesLow.list( makeKeyword( "EMIT" ) ), TWENTY_INTEGER );
    $list241 = ConsesLow.list( ZERO_INTEGER, Characters.CHAR_quotation, ConsesLow.list( makeKeyword( "EMIT" ) ), TWO_INTEGER );
    $sym242$ANY_PUNCTUATION_CHAR_ = makeSymbol( "ANY-PUNCTUATION-CHAR?" );
    $list243 = ConsesLow.list( ConsesLow.list( makeKeyword( "EMIT" ) ), TWO_INTEGER );
    $sym244$SENTENCE_INTERNAL_PUNCTUATION_CHAR_ = makeSymbol( "SENTENCE-INTERNAL-PUNCTUATION-CHAR?" );
    $sym245$CHARACTER_OR_CHARACTER_CODE_P = makeSymbol( "CHARACTER-OR-CHARACTER-CODE-P" );
    $sym246$UPPER_CASE_CHAR_P = makeSymbol( "UPPER-CASE-CHAR-P" );
    $list247 = ConsesLow.list( ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 51 ) );
    $sym248$ALPHANUMERIC_CHAR_OR_CHARACTER_CODE_P = makeSymbol( "ALPHANUMERIC-CHAR-OR-CHARACTER-CODE-P" );
    $list249 = ConsesLow.list( ONE_INTEGER, Characters.CHAR_period, ConsesLow.list( makeKeyword( "REMEMBER" ) ), THREE_INTEGER );
    $list250 = ConsesLow.list( ONE_INTEGER, Characters.CHAR_newline, ConsesLow.list( makeKeyword( "REMEMBER" ), makeKeyword( "BACKUP" ) ), TWO_INTEGER );
    $list251 = ConsesLow.list( NIL, TWO_INTEGER );
    $list252 = ConsesLow.list( ONE_INTEGER, Characters.CHAR_hyphen, ConsesLow.list( makeKeyword( "REMEMBER" ) ), EIGHT_INTEGER );
    $list253 = ConsesLow.list( ConsesLow.list( makeKeyword( "REMEMBER" ), makeKeyword( "BACKUP" ) ), TWO_INTEGER );
    $sym254$QUOTE_CHAR_ = makeSymbol( "QUOTE-CHAR?" );
    $list255 = ConsesLow.list( ONE_INTEGER, makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list256 = ConsesLow.list( ConsesLow.list( makeKeyword( "BACKUP" ) ), FIVE_INTEGER );
    $list257 = ConsesLow.list( THREE_INTEGER, makeKeyword( "END" ), ConsesLow.list( makeKeyword( "BACKUP" ) ), TWO_INTEGER );
    $list258 = ConsesLow.list( NIL, FOUR_INTEGER );
    $list259 = ConsesLow.list( ConsesLow.list( makeKeyword( "BACKUP" ) ), TWO_INTEGER );
    $sym260$LOWER_CASE_CHAR_P = makeSymbol( "LOWER-CASE-CHAR-P" );
    $list261 = ConsesLow.list( ConsesLow.list( makeKeyword( "BACKUP" ) ), SIX_INTEGER );
    $list262 = ConsesLow.list( FOUR_INTEGER, makeKeyword( "END" ), ConsesLow.list( makeKeyword( "BACKUP" ) ), TWO_INTEGER );
    $sym263$SENTENCE_FINAL_PUNCTUATION_CHAR_ = makeSymbol( "SENTENCE-FINAL-PUNCTUATION-CHAR?" );
    $list264 = ConsesLow.list( FIVE_INTEGER, makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list265 = ConsesLow.list( SIX_INTEGER, makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list266 = ConsesLow.list( EIGHT_INTEGER, Characters.CHAR_hyphen, ConsesLow.list( makeKeyword( "BACKUP" ) ), TWO_INTEGER );
    $list267 = ConsesLow.list( ConsesLow.list( makeKeyword( "BACKUP" ) ), TEN_INTEGER );
    $list268 = ConsesLow.list( EIGHT_INTEGER, makeKeyword( "END" ), ConsesLow.list( makeKeyword( "BACKUP" ) ), TWO_INTEGER );
    $list269 = ConsesLow.list( NINE_INTEGER, Characters.CHAR_hyphen, ConsesLow.list( makeKeyword( "EMIT" ) ), NINE_INTEGER );
    $list270 = ConsesLow.list( NINE_INTEGER, Characters.CHAR_underbar, ConsesLow.list( makeKeyword( "EMIT" ) ), NINE_INTEGER );
    $list271 = ConsesLow.list( NINE_INTEGER, makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list272 = ConsesLow.list( ELEVEN_INTEGER, Characters.CHAR_s, ConsesLow.list( makeKeyword( "EMIT" ) ), THIRTEEN_INTEGER );
    $list273 = ConsesLow.list( ELEVEN_INTEGER, Characters.CHAR_r, ConsesLow.list( makeKeyword( "EMIT" ) ), TWELVE_INTEGER );
    $list274 = ConsesLow.list( ConsesLow.list( makeKeyword( "REMEMBER" ), makeKeyword( "BACKUP" ) ), ONE_INTEGER );
    $list275 = ConsesLow.list( ELEVEN_INTEGER, makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list276 = ConsesLow.list( TWELVE_INTEGER, Characters.CHAR_s, ConsesLow.list( makeKeyword( "EMIT" ) ), THIRTEEN_INTEGER );
    $list277 = ConsesLow.list( TWELVE_INTEGER, Characters.CHAR_period, ConsesLow.list( makeKeyword( "EMIT" ) ), ONE_INTEGER );
    $list278 = ConsesLow.list( TWELVE_INTEGER, makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list279 = ConsesLow.list( THIRTEEN_INTEGER, Characters.CHAR_period, ConsesLow.list( makeKeyword( "EMIT" ) ), ONE_INTEGER );
    $list280 = ConsesLow.list( THIRTEEN_INTEGER, makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list281 = ConsesLow.list( FOURTEEN_INTEGER, Characters.CHAR_r, ConsesLow.list( makeKeyword( "EMIT" ) ), FIFTEEN_INTEGER );
    $list282 = ConsesLow.list( FOURTEEN_INTEGER, Characters.CHAR_o, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 25 ) );
    $list283 = ConsesLow.list( FOURTEEN_INTEGER, Characters.CHAR_i, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 24 ) );
    $list284 = ConsesLow.list( FOURTEEN_INTEGER, makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list285 = ConsesLow.list( FIFTEEN_INTEGER, Characters.CHAR_period, ConsesLow.list( makeKeyword( "EMIT" ) ), ONE_INTEGER );
    $list286 = ConsesLow.list( FIFTEEN_INTEGER, makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list287 = ConsesLow.list( SIXTEEN_INTEGER, Characters.CHAR_r, ConsesLow.list( makeKeyword( "EMIT" ) ), SEVENTEEN_INTEGER );
    $list288 = ConsesLow.list( SIXTEEN_INTEGER, makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list289 = ConsesLow.list( SEVENTEEN_INTEGER, Characters.CHAR_o, ConsesLow.list( makeKeyword( "EMIT" ) ), EIGHTEEN_INTEGER );
    $list290 = ConsesLow.list( SEVENTEEN_INTEGER, makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list291 = ConsesLow.list( EIGHTEEN_INTEGER, Characters.CHAR_f, ConsesLow.list( makeKeyword( "EMIT" ) ), FIFTEEN_INTEGER );
    $list292 = ConsesLow.list( EIGHTEEN_INTEGER, makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list293 = ConsesLow.list( NINETEEN_INTEGER, Characters.CHAR_t, ConsesLow.list( makeKeyword( "EMIT" ) ), THIRTEEN_INTEGER );
    $list294 = ConsesLow.list( NINETEEN_INTEGER, makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list295 = ConsesLow.list( TWENTY_INTEGER, Characters.CHAR_t, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 21 ) );
    $list296 = ConsesLow.list( TWENTY_INTEGER, Characters.CHAR_m, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 21 ) );
    $list297 = ConsesLow.list( TWENTY_INTEGER, Characters.CHAR_d, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 21 ) );
    $list298 = ConsesLow.list( TWENTY_INTEGER, Characters.CHAR_s, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 21 ) );
    $list299 = ConsesLow.list( TWENTY_INTEGER, Characters.CHAR_r, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 22 ) );
    $list300 = ConsesLow.list( TWENTY_INTEGER, Characters.CHAR_l, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 23 ) );
    $list301 = ConsesLow.list( TWENTY_INTEGER, Characters.CHAR_v, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 47 ) );
    $list302 = ConsesLow.list( TWENTY_INTEGER, makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list303 = ConsesLow.list( makeInteger( 21 ), Characters.CHAR_newline, ConsesLow.list( makeKeyword( "REMEMBER" ), makeKeyword( "BACKUP" ) ), TWO_INTEGER );
    $int304$21 = makeInteger( 21 );
    $list305 = ConsesLow.list( makeInteger( 21 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list306 = ConsesLow.list( makeInteger( 22 ), Characters.CHAR_e, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 21 ) );
    $int307$22 = makeInteger( 22 );
    $list308 = ConsesLow.list( makeInteger( 22 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list309 = ConsesLow.list( makeInteger( 23 ), Characters.CHAR_l, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 21 ) );
    $int310$23 = makeInteger( 23 );
    $list311 = ConsesLow.list( makeInteger( 23 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list312 = ConsesLow.list( makeInteger( 24 ), Characters.CHAR_d, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 25 ) );
    $int313$24 = makeInteger( 24 );
    $list314 = ConsesLow.list( makeInteger( 24 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list315 = ConsesLow.list( makeInteger( 25 ), Characters.CHAR_e, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 26 ) );
    $list316 = ConsesLow.list( makeInteger( 25 ), Characters.CHAR_n, ConsesLow.list( makeKeyword( "REMEMBER" ) ), makeInteger( 27 ) );
    $int317$25 = makeInteger( 25 );
    $list318 = ConsesLow.list( makeInteger( 25 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list319 = ConsesLow.list( makeInteger( 26 ), Characters.CHAR_s, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 25 ) );
    $int320$26 = makeInteger( 26 );
    $list321 = ConsesLow.list( makeInteger( 26 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list322 = ConsesLow.list( makeInteger( 27 ), Characters.CHAR_quote, NIL, makeInteger( 28 ) );
    $int323$27 = makeInteger( 27 );
    $list324 = ConsesLow.list( ConsesLow.list( makeKeyword( "BACKUP" ) ), ONE_INTEGER );
    $list325 = ConsesLow.list( makeInteger( 27 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list326 = ConsesLow.list( makeInteger( 28 ), Characters.CHAR_t, ConsesLow.list( makeKeyword( "BACKUP" ) ), TWO_INTEGER );
    $int327$28 = makeInteger( 28 );
    $list328 = ConsesLow.list( ConsesLow.list( makeKeyword( "BACKUP" ) ), makeInteger( 29 ) );
    $list329 = ConsesLow.list( makeInteger( 28 ), makeKeyword( "END" ), ConsesLow.list( makeKeyword( "BACKUP" ) ), TWO_INTEGER );
    $int330$29 = makeInteger( 29 );
    $list331 = ConsesLow.list( makeInteger( 30 ), Characters.CHAR_quote, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 31 ) );
    $int332$30 = makeInteger( 30 );
    $list333 = ConsesLow.list( makeInteger( 30 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list334 = ConsesLow.list( makeInteger( 31 ), Characters.CHAR_t, ConsesLow.list( makeKeyword( "EMIT" ) ), TWO_INTEGER );
    $int335$31 = makeInteger( 31 );
    $list336 = ConsesLow.list( makeInteger( 31 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list337 = ConsesLow.list( makeInteger( 32 ), Characters.CHAR_o, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 25 ) );
    $list338 = ConsesLow.list( makeInteger( 32 ), Characters.CHAR_a, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 41 ) );
    $list339 = ConsesLow.list( makeInteger( 32 ), Characters.CHAR_e, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 42 ) );
    $int340$32 = makeInteger( 32 );
    $list341 = ConsesLow.list( makeInteger( 32 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list342 = ConsesLow.list( makeInteger( 33 ), Characters.CHAR_a, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 34 ) );
    $int343$33 = makeInteger( 33 );
    $list344 = ConsesLow.list( makeInteger( 33 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list345 = ConsesLow.list( makeInteger( 34 ), Characters.CHAR_d, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 25 ) );
    $list346 = ConsesLow.list( makeInteger( 34 ), Characters.CHAR_s, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 25 ) );
    $list347 = ConsesLow.list( makeInteger( 34 ), Characters.CHAR_v, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 35 ) );
    $int348$34 = makeInteger( 34 );
    $list349 = ConsesLow.list( makeInteger( 34 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list350 = ConsesLow.list( makeInteger( 35 ), Characters.CHAR_e, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 25 ) );
    $int351$35 = makeInteger( 35 );
    $list352 = ConsesLow.list( makeInteger( 35 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list353 = ConsesLow.list( makeInteger( 36 ), Characters.CHAR_a, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 25 ) );
    $list354 = ConsesLow.list( makeInteger( 36 ), Characters.CHAR_o, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 37 ) );
    $int355$36 = makeInteger( 36 );
    $list356 = ConsesLow.list( makeInteger( 36 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list357 = ConsesLow.list( makeInteger( 37 ), Characters.CHAR_u, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 38 ) );
    $int358$37 = makeInteger( 37 );
    $list359 = ConsesLow.list( makeInteger( 37 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list360 = ConsesLow.list( makeInteger( 38 ), Characters.CHAR_l, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 39 ) );
    $int361$38 = makeInteger( 38 );
    $list362 = ConsesLow.list( makeInteger( 38 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list363 = ConsesLow.list( makeInteger( 39 ), Characters.CHAR_d, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 25 ) );
    $int364$39 = makeInteger( 39 );
    $list365 = ConsesLow.list( makeInteger( 39 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list366 = ConsesLow.list( makeInteger( 40 ), Characters.CHAR_s, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 25 ) );
    $int367$40 = makeInteger( 40 );
    $list368 = ConsesLow.list( makeInteger( 40 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list369 = ConsesLow.list( makeInteger( 41 ), Characters.CHAR_s, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 25 ) );
    $int370$41 = makeInteger( 41 );
    $list371 = ConsesLow.list( makeInteger( 41 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list372 = ConsesLow.list( makeInteger( 42 ), Characters.CHAR_r, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 43 ) );
    $int373$42 = makeInteger( 42 );
    $list374 = ConsesLow.list( makeInteger( 42 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list375 = ConsesLow.list( makeInteger( 43 ), Characters.CHAR_e, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 25 ) );
    $int376$43 = makeInteger( 43 );
    $list377 = ConsesLow.list( makeInteger( 43 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $int378$44 = makeInteger( 44 );
    $list379 = ConsesLow.list( makeInteger( 44 ), Characters.CHAR_period, ConsesLow.list( makeKeyword( "REMEMBER" ) ), makeInteger( 45 ) );
    $list380 = ConsesLow.list( makeInteger( 44 ), Characters.CHAR_comma, ConsesLow.list( makeKeyword( "REMEMBER" ) ), makeInteger( 49 ) );
    $list381 = ConsesLow.list( makeInteger( 44 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $int382$45 = makeInteger( 45 );
    $list383 = ConsesLow.list( ConsesLow.list( makeKeyword( "BACKUP" ) ), makeInteger( 46 ) );
    $list384 = ConsesLow.list( ConsesLow.list( makeKeyword( "BACKUP" ) ), THREE_INTEGER );
    $list385 = ConsesLow.list( makeInteger( 45 ), makeKeyword( "END" ), ConsesLow.list( makeKeyword( "BACKUP" ) ), TWO_INTEGER );
    $list386 = ConsesLow.list( makeInteger( 46 ), Characters.CHAR_period, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 44 ) );
    $int387$46 = makeInteger( 46 );
    $list388 = ConsesLow.list( makeInteger( 46 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list389 = ConsesLow.list( makeInteger( 47 ), Characters.CHAR_e, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 21 ) );
    $list390 = ConsesLow.list( makeInteger( 47 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list391 = ConsesLow.list( makeInteger( 48 ), Characters.CHAR_i, ConsesLow.list( makeKeyword( "EMIT" ) ), makeInteger( 25 ) );
    $int392$48 = makeInteger( 48 );
    $list393 = ConsesLow.list( makeInteger( 48 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $int394$49 = makeInteger( 49 );
    $list395 = ConsesLow.list( ConsesLow.list( makeKeyword( "BACKUP" ) ), makeInteger( 50 ) );
    $int396$50 = makeInteger( 50 );
    $int397$51 = makeInteger( 51 );
    $list398 = ConsesLow.list( makeInteger( 51 ), Characters.CHAR_period, ConsesLow.list( makeKeyword( "EMIT" ) ), ONE_INTEGER );
    $list399 = ConsesLow.list( makeInteger( 51 ), Characters.CHAR_newline, ConsesLow.list( makeKeyword( "REMEMBER" ), makeKeyword( "BACKUP" ) ), TWO_INTEGER );
    $list400 = ConsesLow.list( makeInteger( 51 ), Characters.CHAR_hyphen, ConsesLow.list( makeKeyword( "REMEMBER" ) ), EIGHT_INTEGER );
    $list401 = ConsesLow.list( makeInteger( 51 ), makeKeyword( "END" ), NIL, TWO_INTEGER );
    $sym402$BUILD_WORD_TOKEN = makeSymbol( "BUILD-WORD-TOKEN" );
    $sym403$NEWLINE_WORD_P = makeSymbol( "NEWLINE-WORD-P" );
    $sym404$END_OF_SENTENCE_WORD_P = makeSymbol( "END-OF-SENTENCE-WORD-P" );
    $list405 = ConsesLow.list( ConsesLow.list( makeKeyword( "REMEMBER" ) ), THREE_INTEGER );
    $list406 = ConsesLow.list( ConsesLow.list( makeKeyword( "EMIT" ) ), FOUR_INTEGER );
    $list407 = ConsesLow.list( THREE_INTEGER, makeKeyword( "END" ), NIL, TWO_INTEGER );
    $sym408$QUOTE_WORD_P = makeSymbol( "QUOTE-WORD-P" );
    $list409 = ConsesLow.list( FOUR_INTEGER, makeKeyword( "END" ), NIL, TWO_INTEGER );
    $sym410$BUILD_SENTENCE_TOKEN = makeSymbol( "BUILD-SENTENCE-TOKEN" );
    $sym411$NEWLINE_SENTENCE_P = makeSymbol( "NEWLINE-SENTENCE-P" );
    $list412 = ConsesLow.list( NIL, ONE_INTEGER );
    $list413 = ConsesLow.list( ZERO_INTEGER, makeKeyword( "END" ), NIL, TWO_INTEGER );
    $list414 = ConsesLow.list( ConsesLow.list( makeKeyword( "EMIT" ) ), ZERO_INTEGER );
    $list415 = ConsesLow.list( NIL, THREE_INTEGER );
    $sym416$BUILD_PARAGRAPH_TOKEN = makeSymbol( "BUILD-PARAGRAPH-TOKEN" );
    $str417$_C = makeString( "~C" );
    $str418$______ = makeString( "[\\.!?]" );
    $str419$____________________ = makeString( "(?:'|\"|''|\\)|\\]|\\})?" );
    $list420 = ConsesLow.list( new SubLObject[] { makeString( "jr" ), makeString( "mr" ), makeString( "mrs" ), makeString( "ms" ), makeString( "dr" ), makeString( "prof" ), makeString( "sr" ), makeString( "sens?" ),
      makeString( "reps?" ), makeString( "gov" ), makeString( "attys?" ), makeString( "supt" ), makeString( "det" ), makeString( "rev" )
    } );
    $list421 = ConsesLow.list( new SubLObject[] { makeString( "col" ), makeString( "gen" ), makeString( "lt" ), makeString( "cmdr" ), makeString( "adm" ), makeString( "capt" ), makeString( "sgt" ), makeString( "cpl" ),
      makeString( "maj" )
    } );
    $list422 = ConsesLow.list( makeString( "inc" ), makeString( "ltd" ), makeString( "co" ), makeString( "corp" ) );
    $str423$arc = makeString( "arc" );
    $str424$al = makeString( "al" );
    $str425$ave = makeString( "ave" );
    $str426$blv_d = makeString( "blv?d" );
    $str427$cl = makeString( "cl" );
    $str428$ct = makeString( "ct" );
    $str429$cres = makeString( "cres" );
    $str430$dr = makeString( "dr" );
    $str431$expy_ = makeString( "expy?" );
    $str432$dist = makeString( "dist" );
    $str433$mt = makeString( "mt" );
    $str434$ft = makeString( "ft" );
    $str435$fw_y = makeString( "fw?y" );
    $str436$hwa_y = makeString( "hwa?y" );
    $str437$la = makeString( "la" );
    $str438$pde_ = makeString( "pde?" );
    $str439$pl = makeString( "pl" );
    $str440$plz = makeString( "plz" );
    $str441$rd = makeString( "rd" );
    $str442$st = makeString( "st" );
    $str443$tce = makeString( "tce" );
    $str444$Ala = makeString( "Ala" );
    $str445$Ariz = makeString( "Ariz" );
    $str446$Ark = makeString( "Ark" );
    $str447$Cal = makeString( "Cal" );
    $str448$Calif = makeString( "Calif" );
    $str449$Col = makeString( "Col" );
    $str450$Colo = makeString( "Colo" );
    $str451$Conn = makeString( "Conn" );
    $str452$Del = makeString( "Del" );
    $str453$Fed = makeString( "Fed" );
    $str454$Fla = makeString( "Fla" );
    $str455$Ga = makeString( "Ga" );
    $str456$Ida = makeString( "Ida" );
    $str457$Id = makeString( "Id" );
    $str458$Ill = makeString( "Ill" );
    $str459$Ind = makeString( "Ind" );
    $str460$Ia = makeString( "Ia" );
    $str461$Kan = makeString( "Kan" );
    $str462$Kans = makeString( "Kans" );
    $str463$Ken = makeString( "Ken" );
    $str464$Ky = makeString( "Ky" );
    $str465$La = makeString( "La" );
    $str466$Me = makeString( "Me" );
    $str467$Md = makeString( "Md" );
    $str468$Is = makeString( "Is" );
    $str469$Mass = makeString( "Mass" );
    $str470$Mich = makeString( "Mich" );
    $str471$Minn = makeString( "Minn" );
    $str472$Miss = makeString( "Miss" );
    $str473$Mo = makeString( "Mo" );
    $str474$Mont = makeString( "Mont" );
    $str475$Neb = makeString( "Neb" );
    $str476$Nebr = makeString( "Nebr" );
    $str477$Nev = makeString( "Nev" );
    $str478$Mex = makeString( "Mex" );
    $str479$Okla = makeString( "Okla" );
    $str480$Ok = makeString( "Ok" );
    $str481$Ore = makeString( "Ore" );
    $str482$Penna = makeString( "Penna" );
    $str483$Penn = makeString( "Penn" );
    $str484$Pa = makeString( "Pa" );
    $str485$Dak = makeString( "Dak" );
    $str486$Tenn = makeString( "Tenn" );
    $str487$Tex = makeString( "Tex" );
    $str488$Ut = makeString( "Ut" );
    $str489$Vt = makeString( "Vt" );
    $str490$Va = makeString( "Va" );
    $str491$Wash = makeString( "Wash" );
    $str492$Wis = makeString( "Wis" );
    $str493$Wisc = makeString( "Wisc" );
    $str494$Wy = makeString( "Wy" );
    $str495$Wyo = makeString( "Wyo" );
    $str496$USAFA = makeString( "USAFA" );
    $str497$Alta = makeString( "Alta" );
    $str498$Man = makeString( "Man" );
    $str499$Ont = makeString( "Ont" );
    $str500$Sask = makeString( "Sask" );
    $str501$Yuk = makeString( "Yuk" );
    $list502 = ConsesLow.list( new SubLObject[] { makeString( "jan" ), makeString( "feb" ), makeString( "mar" ), makeString( "apr" ), makeString( "may" ), makeString( "jun" ), makeString( "jul" ), makeString( "aug" ),
      makeString( "sep" ), makeString( "oct" ), makeString( "nov" ), makeString( "dec" ), makeString( "sept" )
    } );
    $list503 = ConsesLow.list( makeString( "vs" ), makeString( "sec" ), makeString( "no" ), makeString( "esp" ) );
    $str504$_n_s__n = makeString( "\\n\\s*\\n" );
    $str505$_s_ = makeString( "\\s)" );
    $str506$_1 = makeString( "\\1" );
    $str507$__s_w = makeString( "(\\s\\w" );
    $str508$_____w__w = makeString( "([^-\\w]\\w" );
    $str509$__s_w___s__ = makeString( "(\\s\\w\\.\\s+)" );
    $str510$_________ = makeString( "(\\.\\.\\. )" );
    $str511$____lower____ = makeString( "([[:lower:]])" );
    $str512$_1_2 = makeString( "\\1\\2" );
    $str513$_____ = makeString( "(['\"]" );
    $str514$_____s__ = makeString( "['\"]\\s+)" );
    $str515$______s__ = makeString( "([\"']\\s*)" );
    $str516$__s____lower____ = makeString( "(\\s*[[:lower:]])" );
    $str517$__s___s_ = makeString( "(\\s\\.\\s)" );
    $str518$__s__ = makeString( "(\\s*)" );
    $str519$__s = makeString( "(\\s" );
    $str520$__D_d___ = makeString( "(\\D\\d+)(" );
    $str521$___s__ = makeString( ")(\\s+)" );
    $str522$_3 = makeString( "\\3" );
    $str523$___w = makeString( "('\\w" );
    $str524$___s_ = makeString( ")(\\s)" );
    $str525$_2 = makeString( "\\2" );
    $str526$__sno_____s______d_ = makeString( "(\\sno\\.)(\\s+)(?!\\d)" );
    $list527 = ConsesLow.list( makeKeyword( "CASELESS" ) );
    $str528$__ap___m___s______upper____ = makeString( "([ap]\\.m\\.\\s+)([[:upper:]])" );
    $list529 = ConsesLow.cons( makeSymbol( "PATTERN" ), makeSymbol( "SUBSTITUTION" ) );
    $str530$Can_t_finalize__a__not_a_regular_ = makeString( "Can't finalize ~a: not a regular expression pattern" );
    $sym531$SENTENCIFY_STRING = makeSymbol( "SENTENCIFY-STRING" );
    $str532$__b = makeString( "(\\b" );
    $list533 = ConsesLow.list( makeSymbol( "RE" ), makeSymbol( "SUBSTITUTION" ), makeSymbol( "OPTIONS" ) );
    $str534$Can_t_compile_regular_expression_ = makeString( "Can't compile regular expression ~a: ~a" );
    $sym535$NEW_DOCUMENT = makeSymbol( "NEW-DOCUMENT" );
    $sym536$DOCUMENT_SENTENCE_COUNT_ = makeSymbol( "DOCUMENT-SENTENCE-COUNT=" );
    $kw537$FULL = makeKeyword( "FULL" );
    $list538 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "I love Elmer Fudgsicle's suits.  He had wonderful taste." ), NIL, makeSymbol( "FST-STRING-WORDIFY" ) ), ONE_INTEGER ), ConsesLow.list( ConsesLow
        .list( makeString( "I love Elmer Fudgsicle's suits.  He had wonderful taste." ) ), TWO_INTEGER ) );
    $sym539$TEST_CONSTRUCT_STRING_FROM_WORDS = makeSymbol( "TEST-CONSTRUCT-STRING-FROM-WORDS" );
    $list540 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( makeSymbol( "FIRST-N" ), TWO_INTEGER, ConsesLow.list( makeSymbol( "VECTOR-ELEMENTS" ), ConsesLow.list( makeSymbol( "SENTENCE-YIELD" ),
        ConsesLow.list( makeSymbol( "NEW-SENTENCE" ), makeString( "3.4 billion cats" ) ) ) ) ) ), makeString( "3.4 billion" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list(
            makeSymbol( "SECOND" ), ConsesLow.list( makeSymbol( "VECTOR-ELEMENTS" ), ConsesLow.list( makeSymbol( "SENTENCE-YIELD" ), ConsesLow.list( makeSymbol( "NEW-SENTENCE" ), makeString(
                "3.4 billion cats" ) ) ) ) ) ) ), makeString( "billion" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol(
                    "VECTOR-ELEMENTS" ), ConsesLow.list( makeSymbol( "SENTENCE-YIELD" ), ConsesLow.list( makeSymbol( "NEW-SENTENCE" ), makeString( "U.S." ) ) ) ) ) ), T ), makeString( "US" ) ), ConsesLow.list( ConsesLow
                        .list( ConsesLow.list( makeSymbol( "VECTOR-ELEMENTS" ), ConsesLow.list( makeSymbol( "SENTENCE-YIELD" ), ConsesLow.list( makeSymbol( "NEW-SENTENCE" ), makeString( "U.S. Defense" ) ) ) ), T ),
                        makeString( "US Defense" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeSymbol( "VECTOR-ELEMENTS" ), ConsesLow.list( makeSymbol( "SENTENCE-YIELD" ), ConsesLow.list( makeSymbol(
                            "NEW-SENTENCE" ), makeString( "US Defense" ) ) ) ), T ), makeString( "US Defense" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeSymbol( "VECTOR-ELEMENTS" ), ConsesLow.list(
                                makeSymbol( "SENTENCE-YIELD" ), ConsesLow.list( makeSymbol( "NEW-SENTENCE" ), makeString( "US Defense" ) ) ) ), NIL ), makeString( "US Defense" ) ), ConsesLow.list( ConsesLow.list(
                                    ConsesLow.list( makeSymbol( "VECTOR-ELEMENTS" ), ConsesLow.list( makeSymbol( "SENTENCE-YIELD" ), ConsesLow.list( makeSymbol( "NEW-SENTENCE" ), makeString( "U.S." ) ) ) ), NIL ),
                                    makeString( "U.S." ) ) );
  }

  public static final class $sign_native
      extends
        SubLStructNative
  {
    public SubLObject $string;
    public SubLObject $type;
    public SubLObject $info;
    public SubLObject $category;
    public SubLObject $constituents;
    public SubLObject $offset;
    public SubLObject $mother;
    private static final SubLStructDeclNative structDecl;

    public $sign_native()
    {
      this.$string = CommonSymbols.NIL;
      this.$type = CommonSymbols.NIL;
      this.$info = CommonSymbols.NIL;
      this.$category = CommonSymbols.NIL;
      this.$constituents = CommonSymbols.NIL;
      this.$offset = CommonSymbols.NIL;
      this.$mother = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sign_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$string;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$type;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$info;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$category;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$constituents;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$offset;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$mother;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$string = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$type = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$info = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$category = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$constituents = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$offset = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$mother = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sign_native.class, $sym1$SIGN, $sym2$SIGN_P, $list3, $list4, new String[] { "$string", "$type", "$info", "$category", "$constituents", "$offset", "$mother"
      }, $list5, $list6, $sym7$SIGN_PRINT );
    }
  }

  public static final class $sign_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sign_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SIGN-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sign_p( arg1 );
    }
  }

  public static final class $html_string_wordify_state_native
      extends
        SubLStructNative
  {
    public SubLObject $state;
    public SubLObject $tag_pieces;
    public SubLObject $string_pieces;
    public SubLObject $punctuation_pieces;
    public SubLObject $leading_tags;
    public SubLObject $following_tags;
    public SubLObject $current_offset;
    private static final SubLStructDeclNative structDecl;

    public $html_string_wordify_state_native()
    {
      this.$state = CommonSymbols.NIL;
      this.$tag_pieces = CommonSymbols.NIL;
      this.$string_pieces = CommonSymbols.NIL;
      this.$punctuation_pieces = CommonSymbols.NIL;
      this.$leading_tags = CommonSymbols.NIL;
      this.$following_tags = CommonSymbols.NIL;
      this.$current_offset = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $html_string_wordify_state_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$state;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$tag_pieces;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$string_pieces;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$punctuation_pieces;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$leading_tags;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$following_tags;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$current_offset;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$state = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$tag_pieces = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$string_pieces = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$punctuation_pieces = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$leading_tags = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$following_tags = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$current_offset = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $html_string_wordify_state_native.class, $sym78$HTML_STRING_WORDIFY_STATE, $sym79$HTML_STRING_WORDIFY_STATE_P, $list80, $list81, new String[] { "$state", "$tag_pieces",
        "$string_pieces", "$punctuation_pieces", "$leading_tags", "$following_tags", "$current_offset"
      }, $list82, $list83, $sym84$PRINT_HSW_STATE );
    }
  }

  public static final class $html_string_wordify_state_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $html_string_wordify_state_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "HTML-STRING-WORDIFY-STATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return html_string_wordify_state_p( arg1 );
    }
  }

  public static final class $paragraph_native
      extends
        SubLStructNative
  {
    public SubLObject $sentences;
    public SubLObject $mother;
    private static final SubLStructDeclNative structDecl;

    public $paragraph_native()
    {
      this.$sentences = CommonSymbols.NIL;
      this.$mother = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $paragraph_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$sentences;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$mother;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$sentences = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$mother = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $paragraph_native.class, $sym157$PARAGRAPH, $sym158$PARAGRAPH_P, $list159, $list160, new String[] { "$sentences", "$mother"
      }, $list161, $list162, $sym163$PARAGRAPH_PRINT );
    }
  }

  public static final class $paragraph_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $paragraph_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PARAGRAPH-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return paragraph_p( arg1 );
    }
  }

  public static final class $document_native
      extends
        SubLStructNative
  {
    public SubLObject $paragraphs;
    private static final SubLStructDeclNative structDecl;

    public $document_native()
    {
      this.$paragraphs = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $document_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$paragraphs;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$paragraphs = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $document_native.class, $sym183$DOCUMENT, $sym184$DOCUMENT_P, $list185, $list186, new String[] { "$paragraphs"
      }, $list187, $list188, $sym189$DOCUMENT_PRINT );
    }
  }

  public static final class $document_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $document_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "DOCUMENT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return document_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 1754 ms synthetic
 */