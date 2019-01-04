package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class abstract_lexicon extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.abstract_lexicon";
    public static final String myFingerPrint = "da50b3aa68ed527da23563be9584151c5aa8b78a747ec9c903015e73dac6eff1";
    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 2948L)
    private static SubLSymbol $cyc_to_penn_list$;
    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 3168L)
    private static SubLSymbol $cyc_to_penn_map$;
    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 3212L)
    private static SubLSymbol $cyc_to_supertag_map$;
    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 7203L)
    private static SubLSymbol $cyc_to_supertag_list$;
    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
    public static SubLSymbol $dtp_textract_lemma$;
    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 16143L)
    public static SubLSymbol $nominal_tags$;
    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 16283L)
    public static SubLSymbol $verbal_tags$;
    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 16353L)
    public static SubLSymbol $adjectival_tags$;
    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 16412L)
    public static SubLSymbol $adverbial_tags$;
    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 19722L)
    private static SubLSymbol $penn_tag_backoffs$;
    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 52832L)
    private static SubLSymbol $scalar_functionP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 67152L)
    private static SubLSymbol $lexify_sentence_ignore_pos_for_multiword_tokens$;
    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 84749L)
    private static SubLSymbol $preds_for_lexicon_exclusion_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
    public static SubLSymbol $dtp_abstract_lexicon_iterator_state$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$GENL_IN_ANY_MT_;
    private static final SubLSymbol $sym2$SECOND;
    private static final SubLInteger $int3$500;
    private static final SubLSymbol $sym4$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const5$EverythingPSC;
    private static final SubLObject $const6$partOfSpeech;
    private static final SubLObject $const7$GeneralLexiconMt;
    private static final SubLList $list8;
    private static final SubLObject $const9$GeneralEnglishMt;
    private static final SubLSymbol $sym10$TEXTRACT_LEMMA;
    private static final SubLSymbol $sym11$TEXTRACT_LEMMA_P;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$TEXTRACT_LEMMA_PRINT;
    private static final SubLSymbol $sym17$TEXTRACT_LEMMA_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$TEXTRACT_LEMMA_PARAGRAPH;
    private static final SubLSymbol $sym20$_CSETF_TEXTRACT_LEMMA_PARAGRAPH;
    private static final SubLSymbol $sym21$TEXTRACT_LEMMA_SENTENCE;
    private static final SubLSymbol $sym22$_CSETF_TEXTRACT_LEMMA_SENTENCE;
    private static final SubLSymbol $sym23$TEXTRACT_LEMMA_WORD;
    private static final SubLSymbol $sym24$_CSETF_TEXTRACT_LEMMA_WORD;
    private static final SubLSymbol $sym25$TEXTRACT_LEMMA_STRING;
    private static final SubLSymbol $sym26$_CSETF_TEXTRACT_LEMMA_STRING;
    private static final SubLSymbol $sym27$TEXTRACT_LEMMA_CANON;
    private static final SubLSymbol $sym28$_CSETF_TEXTRACT_LEMMA_CANON;
    private static final SubLSymbol $sym29$TEXTRACT_LEMMA_TYPE;
    private static final SubLSymbol $sym30$_CSETF_TEXTRACT_LEMMA_TYPE;
    private static final SubLSymbol $kw31$PARAGRAPH;
    private static final SubLSymbol $kw32$SENTENCE;
    private static final SubLSymbol $kw33$WORD;
    private static final SubLSymbol $kw34$STRING;
    private static final SubLSymbol $kw35$CANON;
    private static final SubLSymbol $kw36$TYPE;
    private static final SubLString $str37$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw38$BEGIN;
    private static final SubLSymbol $sym39$MAKE_TEXTRACT_LEMMA;
    private static final SubLSymbol $kw40$SLOT;
    private static final SubLSymbol $kw41$END;
    private static final SubLSymbol $sym42$VISIT_DEFSTRUCT_OBJECT_TEXTRACT_LEMMA_METHOD;
    private static final SubLSymbol $sym43$STRINGP;
    private static final SubLSymbol $sym44$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLString $str47$__TEXTRACT_LEMMA_;
    private static final SubLString $str48$_;
    private static final SubLString $str49$_;
    private static final SubLSymbol $sym50$LEX_ENTRY;
    private static final SubLSymbol $sym51$OBJECT;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$PROPERTIES;
    private static final SubLSymbol $sym54$SUPPORTED_PROPERTIES;
    private static final SubLSymbol $sym55$COMPUTED_PROPERTIES;
    private static final SubLSymbol $sym56$STORED_PROPERTIES;
    private static final SubLSymbol $sym57$INSTANCE_COUNT;
    private static final SubLList $list58;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$CAR;
    private static final SubLSymbol $sym61$SUBLOOP_RESERVED_INITIALIZE_LEX_ENTRY_CLASS;
    private static final SubLSymbol $sym62$ISOLATED_P;
    private static final SubLSymbol $sym63$INSTANCE_NUMBER;
    private static final SubLSymbol $sym64$SUBLOOP_RESERVED_INITIALIZE_LEX_ENTRY_INSTANCE;
    private static final SubLSymbol $sym65$INITIALIZE;
    private static final SubLList $list66;
    private static final SubLList $list67;
    private static final SubLSymbol $sym68$OUTER_CATCH_FOR_LEX_ENTRY_METHOD;
    private static final SubLSymbol $sym69$LEX_ENTRY_INITIALIZE_METHOD;
    private static final SubLSymbol $sym70$GET;
    private static final SubLList $list71;
    private static final SubLList $list72;
    private static final SubLList $list73;
    private static final SubLSymbol $sym74$OUTER_CATCH_FOR_LEX_ENTRY_METHOD;
    private static final SubLString $str75$Unsupported_lexical_property__a;
    private static final SubLSymbol $sym76$LEX_ENTRY_GET_METHOD;
    private static final SubLSymbol $kw77$DENOT;
    private static final SubLSymbol $kw78$SEMTRANS;
    private static final SubLSymbol $kw79$TRIE_ENTRY;
    private static final SubLSymbol $sym80$SET;
    private static final SubLList $list81;
    private static final SubLList $list82;
    private static final SubLSymbol $sym83$OUTER_CATCH_FOR_LEX_ENTRY_METHOD;
    private static final SubLSymbol $sym84$FIRST;
    private static final SubLSymbol $sym85$LEX_ENTRY_SET_METHOD;
    private static final SubLSymbol $sym86$COPY;
    private static final SubLList $list87;
    private static final SubLSymbol $sym88$OUTER_CATCH_FOR_LEX_ENTRY_METHOD;
    private static final SubLSymbol $sym89$LEX_ENTRY_COPY_METHOD;
    private static final SubLSymbol $sym90$NOUN_;
    private static final SubLList $list91;
    private static final SubLList $list92;
    private static final SubLList $list93;
    private static final SubLSymbol $kw94$ANY;
    private static final SubLSymbol $kw95$CYC_POS;
    private static final SubLObject $const96$Noun;
    private static final SubLSymbol $sym97$LEX_ENTRY_NOUN__METHOD;
    private static final SubLSymbol $sym98$PRINT;
    private static final SubLList $list99;
    private static final SubLList $list100;
    private static final SubLSymbol $sym101$OUTER_CATCH_FOR_LEX_ENTRY_METHOD;
    private static final SubLString $str102$__LEX_ENTRY_;
    private static final SubLString $str103$____;
    private static final SubLSymbol $sym104$LEX_ENTRY_PRINT_METHOD;
    private static final SubLList $list105;
    private static final SubLList $list106;
    private static final SubLList $list107;
    private static final SubLList $list108;
    private static final SubLSymbol $sym109$NOMINAL_P;
    private static final SubLList $list110;
    private static final SubLSymbol $kw111$PENN_TAGS;
    private static final SubLSymbol $sym112$LEX_ENTRY_NOMINAL_P_METHOD;
    private static final SubLSymbol $sym113$VERBAL_P;
    private static final SubLList $list114;
    private static final SubLSymbol $sym115$LEX_ENTRY_VERBAL_P_METHOD;
    private static final SubLSymbol $sym116$ADJECTIVAL_P;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$LEX_ENTRY_ADJECTIVAL_P_METHOD;
    private static final SubLSymbol $sym119$ADVERBIAL_P;
    private static final SubLList $list120;
    private static final SubLSymbol $sym121$LEX_ENTRY_ADVERBIAL_P_METHOD;
    private static final SubLSymbol $sym122$COMPUTE_TERM;
    private static final SubLList $list123;
    private static final SubLString $str124$Invalid_lexical_property__term_ca;
    private static final SubLObject $const125$equals;
    private static final SubLObject $const126$isa;
    private static final SubLObject $const127$genls;
    private static final SubLSymbol $kw128$NOUN;
    private static final SubLSymbol $kw129$ACTION;
    private static final SubLSymbol $sym130$LEX_ENTRY_COMPUTE_TERM_METHOD;
    private static final SubLSymbol $sym131$COMPUTE_GENDER;
    private static final SubLList $list132;
    private static final SubLString $str133$Invalid_lexical_property__gender_;
    private static final SubLSymbol $kw134$TERM;
    private static final SubLObject $const135$MaleAnimal;
    private static final SubLList $list136;
    private static final SubLObject $const137$FemaleAnimal;
    private static final SubLList $list138;
    private static final SubLObject $const139$Person;
    private static final SubLList $list140;
    private static final SubLObject $const141$SentientAnimal;
    private static final SubLList $list142;
    private static final SubLList $list143;
    private static final SubLSymbol $sym144$LEX_ENTRY_COMPUTE_GENDER_METHOD;
    private static final SubLSymbol $sym145$COMPUTE_PENN_TAGS;
    private static final SubLList $list146;
    private static final SubLSymbol $kw147$INFLECTIONS;
    private static final SubLObject $const148$Preposition;
    private static final SubLString $str149$to;
    private static final SubLSymbol $kw150$TO;
    private static final SubLSymbol $sym151$LEX_ENTRY_COMPUTE_PENN_TAGS_METHOD;
    private static final SubLSymbol $sym152$COMPUTE_BACKOFF_PENN_TAGS;
    private static final SubLList $list153;
    private static final SubLSymbol $sym154$LEX_ENTRY_COMPUTE_BACKOFF_PENN_TAGS_METHOD;
    private static final SubLList $list155;
    private static final SubLSymbol $sym156$COMPUTE_SUPER_TAGS;
    private static final SubLList $list157;
    private static final SubLSymbol $kw158$FRAME;
    private static final SubLSymbol $sym159$LEX_ENTRY_COMPUTE_SUPER_TAGS_METHOD;
    private static final SubLSymbol $sym160$COMPUTE_CYC_POS;
    private static final SubLList $list161;
    private static final SubLSymbol $sym162$LEX_ENTRY_COMPUTE_CYC_POS_METHOD;
    private static final SubLSymbol $sym163$COMPUTE_IS_NER_ENTRY;
    private static final SubLList $list164;
    private static final SubLSymbol $sym165$LEX_ENTRY_COMPUTE_IS_NER_ENTRY_METHOD;
    private static final SubLSymbol $sym166$COMPUTE_CYC_CATEGORY;
    private static final SubLList $list167;
    private static final SubLSymbol $kw168$PREDICATE;
    private static final SubLObject $const169$NounPhrase;
    private static final SubLSymbol $sym170$LEX_ENTRY_COMPUTE_CYC_CATEGORY_METHOD;
    private static final SubLSymbol $sym171$COMPUTE_INFLECTIONS;
    private static final SubLList $list172;
    private static final SubLSymbol $sym173$LEX_ENTRY_COMPUTE_INFLECTIONS_METHOD;
    private static final SubLSymbol $sym174$ABSTRACT_LEXICON;
    private static final SubLObject $list175;
    private static final SubLSymbol $sym176$STOP_WORDS;
    private static final SubLSymbol $sym177$ALLOW_STEMMING;
    private static final SubLSymbol $sym178$ACTIVE_LEARNERS;
    private static final SubLSymbol $sym179$LEARNED;
    private static final SubLSymbol $sym180$ALLOW_FABRICATION_;
    private static final SubLSymbol $sym181$CASE_SENSITIVITY;
    private static final SubLSymbol $sym182$IGNORE_CACHE_;
    private static final SubLSymbol $sym183$CACHE;
    private static final SubLSymbol $sym184$TRIE;
    private static final SubLSymbol $sym185$EXCLUDED_POS_LIST;
    private static final SubLSymbol $sym186$EXCLUDED_PREDS;
    private static final SubLSymbol $sym187$ROOT_MT;
    private static final SubLSymbol $sym188$BASE_MT;
    private static final SubLSymbol $sym189$EXCLUDED_MTS;
    private static final SubLSymbol $sym190$ALLOWED_MTS;
    private static final SubLSymbol $sym191$DEFAULT_KB_SPEC;
    private static final SubLSymbol $sym192$DEFAULT_BASE_MT;
    private static final SubLSymbol $sym193$DEFAULT_EXCLUDE_PREDICATES;
    private static final SubLSymbol $sym194$DEFAULT_EXCLUDE_MTS;
    private static final SubLList $list195;
    private static final SubLObject $const196$AllGeneralEnglishValidatedLexical;
    private static final SubLObject $const197$AbstractLexiconSpecification;
    private static final SubLSymbol $sym198$SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_LEXICON_CLASS;
    private static final SubLSymbol $kw199$UNINITIALIZED;
    private static final SubLSymbol $sym200$SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_LEXICON_INSTANCE;
    private static final SubLList $list201;
    private static final SubLSymbol $sym202$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLInteger $int203$2000;
    private static final SubLSymbol $kw204$ON;
    private static final SubLSymbol $sym205$INITIALIZE_EXCLUDED_PREDS;
    private static final SubLSymbol $sym206$INITIALIZE_ALLOWED_MTS;
    private static final SubLSymbol $sym207$ABSTRACT_LEXICON_INITIALIZE_METHOD;
    private static final SubLSymbol $sym208$ISOLATE;
    private static final SubLList $list209;
    private static final SubLSymbol $sym210$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym211$ABSTRACT_LEXICON_ISOLATE_METHOD;
    private static final SubLSymbol $sym212$IGNORE_CACHE;
    private static final SubLList $list213;
    private static final SubLSymbol $sym214$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym215$ABSTRACT_LEXICON_IGNORE_CACHE_METHOD;
    private static final SubLList $list216;
    private static final SubLSymbol $sym217$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym218$ABSTRACT_LEXICON_IGNORE_CACHE__METHOD;
    private static final SubLList $list219;
    private static final SubLSymbol $sym220$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym221$ABSTRACT_LEXICON_ALLOW_STEMMING_METHOD;
    private static final SubLSymbol $sym222$FORBID_STEMMING;
    private static final SubLList $list223;
    private static final SubLSymbol $sym224$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym225$ABSTRACT_LEXICON_FORBID_STEMMING_METHOD;
    private static final SubLSymbol $sym226$ALLOW_FABRICATION;
    private static final SubLList $list227;
    private static final SubLSymbol $sym228$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym229$ABSTRACT_LEXICON_ALLOW_FABRICATION_METHOD;
    private static final SubLSymbol $sym230$FORBID_FABRICATION;
    private static final SubLList $list231;
    private static final SubLSymbol $sym232$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym233$ABSTRACT_LEXICON_FORBID_FABRICATION_METHOD;
    private static final SubLSymbol $sym234$FABRICATION_FORBIDDEN_;
    private static final SubLList $list235;
    private static final SubLSymbol $sym236$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym237$ABSTRACT_LEXICON_FABRICATION_FORBIDDEN__METHOD;
    private static final SubLSymbol $sym238$FABRICATION_ALLOWED_;
    private static final SubLList $list239;
    private static final SubLSymbol $sym240$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym241$ABSTRACT_LEXICON_FABRICATION_ALLOWED__METHOD;
    private static final SubLSymbol $sym242$VALID_NL_TRIE_ENTRY_;
    private static final SubLList $list243;
    private static final SubLList $list244;
    private static final SubLList $list245;
    private static final SubLSymbol $sym246$STOP_WORD_P;
    private static final SubLSymbol $sym247$ALLOWED_POS_;
    private static final SubLObject $const248$nameSpelling;
    private static final SubLSymbol $sym249$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_;
    private static final SubLSymbol $sym250$ALLOWED_MT_;
    private static final SubLSymbol $sym251$NL_TRIE_ENTRY_HAS_ALLOWED_POS_;
    private static final SubLSymbol $sym252$ABSTRACT_LEXICON_VALID_NL_TRIE_ENTRY__METHOD;
    private static final SubLSymbol $sym253$SET_CASE_SENSITIVITY;
    private static final SubLList $list254;
    private static final SubLList $list255;
    private static final SubLSymbol $sym256$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym257$ABSTRACT_LEXICON_SET_CASE_SENSITIVITY_METHOD;
    private static final SubLSymbol $sym258$GET_CASE_SENSITIVITY;
    private static final SubLList $list259;
    private static final SubLSymbol $sym260$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym261$ABSTRACT_LEXICON_GET_CASE_SENSITIVITY_METHOD;
    private static final SubLList $list262;
    private static final SubLList $list263;
    private static final SubLSymbol $kw264$DEFAULT;
    private static final SubLSymbol $sym265$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym266$ABSTRACT_LEXICON_INITIALIZE_EXCLUDED_PREDS_METHOD;
    private static final SubLSymbol $sym267$ALLOW_PREDICATE;
    private static final SubLList $list268;
    private static final SubLList $list269;
    private static final SubLSymbol $sym270$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym271$ABSTRACT_LEXICON_ALLOW_PREDICATE_METHOD;
    private static final SubLSymbol $sym272$EXCLUDE_PREDICATE;
    private static final SubLList $list273;
    private static final SubLSymbol $sym274$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym275$ABSTRACT_LEXICON_EXCLUDE_PREDICATE_METHOD;
    private static final SubLSymbol $sym276$EXCLUDED_PREDICATE_;
    private static final SubLList $list277;
    private static final SubLSymbol $sym278$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym279$ABSTRACT_LEXICON_EXCLUDED_PREDICATE__METHOD;
    private static final SubLSymbol $sym280$ALLOWED_PREDICATE_;
    private static final SubLList $list281;
    private static final SubLSymbol $sym282$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym283$ABSTRACT_LEXICON_ALLOWED_PREDICATE__METHOD;
    private static final SubLList $list284;
    private static final SubLSymbol $sym285$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym286$ABSTRACT_LEXICON_NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE__METHOD;
    private static final SubLSymbol $sym287$ALLOW_POS;
    private static final SubLList $list288;
    private static final SubLList $list289;
    private static final SubLSymbol $sym290$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym291$ABSTRACT_LEXICON_ALLOW_POS_METHOD;
    private static final SubLSymbol $sym292$EXCLUDE_POS;
    private static final SubLList $list293;
    private static final SubLSymbol $sym294$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym295$ABSTRACT_LEXICON_EXCLUDE_POS_METHOD;
    private static final SubLSymbol $sym296$EXCLUDED_POS_;
    private static final SubLList $list297;
    private static final SubLSymbol $sym298$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym299$ABSTRACT_LEXICON_EXCLUDED_POS__METHOD;
    private static final SubLList $list300;
    private static final SubLSymbol $sym301$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym302$ABSTRACT_LEXICON_ALLOWED_POS__METHOD;
    private static final SubLList $list303;
    private static final SubLSymbol $sym304$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym305$ABSTRACT_LEXICON_NL_TRIE_ENTRY_HAS_ALLOWED_POS__METHOD;
    private static final SubLSymbol $sym306$ADD_LEARNER;
    private static final SubLList $list307;
    private static final SubLList $list308;
    private static final SubLSymbol $sym309$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym310$ABSTRACT_LEXICON_ADD_LEARNER_METHOD;
    private static final SubLSymbol $sym311$REMOVE_LEARNER;
    private static final SubLList $list312;
    private static final SubLSymbol $sym313$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym314$ABSTRACT_LEXICON_REMOVE_LEARNER_METHOD;
    private static final SubLSymbol $sym315$GET_LEARNERS;
    private static final SubLList $list316;
    private static final SubLSymbol $sym317$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym318$ABSTRACT_LEXICON_GET_LEARNERS_METHOD;
    private static final SubLSymbol $sym319$SET_LEARNERS;
    private static final SubLList $list320;
    private static final SubLList $list321;
    private static final SubLSymbol $sym322$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym323$ABSTRACT_LEXICON_SET_LEARNERS_METHOD;
    private static final SubLList $list324;
    private static final SubLList $list325;
    private static final SubLList $list326;
    private static final SubLSymbol $sym327$_MT;
    private static final SubLObject $const328$defaultBaseLexicalMt;
    private static final SubLList $list329;
    private static final SubLObject $const330$InferencePSC;
    private static final SubLList $list331;
    private static final SubLObject $const332$allowedLexicalMt;
    private static final SubLObject $const333$disallowedLexicalMt;
    private static final SubLObject $const334$MtUnionFn;
    private static final SubLSymbol $sym335$ALLOW_MT;
    private static final SubLSymbol $sym336$FORBID_MT;
    private static final SubLSymbol $sym337$ABSTRACT_LEXICON_INITIALIZE_ALLOWED_MTS_METHOD;
    private static final SubLSymbol $sym338$SET_BASE_MT;
    private static final SubLList $list339;
    private static final SubLList $list340;
    private static final SubLSymbol $sym341$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym342$ABSTRACT_LEXICON_SET_BASE_MT_METHOD;
    private static final SubLSymbol $sym343$GET_BASE_MT;
    private static final SubLList $list344;
    private static final SubLSymbol $sym345$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym346$ABSTRACT_LEXICON_GET_BASE_MT_METHOD;
    private static final SubLList $list347;
    private static final SubLSymbol $sym348$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym349$POSSIBLY_HLMT_P;
    private static final SubLSymbol $sym350$ABSTRACT_LEXICON_ALLOW_MT_METHOD;
    private static final SubLSymbol $sym351$ALLOW_GENL_MTS;
    private static final SubLList $list352;
    private static final SubLSymbol $sym353$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym354$_GENLMT;
    private static final SubLObject $const355$genlMt;
    private static final SubLList $list356;
    private static final SubLSymbol $sym357$ABSTRACT_LEXICON_ALLOW_GENL_MTS_METHOD;
    private static final SubLList $list358;
    private static final SubLSymbol $sym359$ABSTRACT_LEXICON_FORBID_MT_METHOD;
    private static final SubLList $list360;
    private static final SubLSymbol $sym361$ABSTRACT_LEXICON_ALLOWED_MT__METHOD;
    private static final SubLList $list362;
    private static final SubLList $list363;
    private static final SubLSymbol $sym364$ABSTRACT_LEXICON_ROOT_MT_METHOD;
    private static final SubLSymbol $sym365$ADD_STOP_WORD;
    private static final SubLList $list366;
    private static final SubLList $list367;
    private static final SubLSymbol $sym368$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym369$ABSTRACT_LEXICON_ADD_STOP_WORD_METHOD;
    private static final SubLList $list370;
    private static final SubLSymbol $sym371$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym372$ABSTRACT_LEXICON_STOP_WORD_P_METHOD;
    private static final SubLSymbol $sym373$GET_STOP_WORDS;
    private static final SubLList $list374;
    private static final SubLSymbol $sym375$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym376$ABSTRACT_LEXICON_GET_STOP_WORDS_METHOD;
    private static final SubLList $list377;
    private static final SubLList $list378;
    private static final SubLSymbol $sym379$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym380$ABSTRACT_LEXICON_P;
    private static final SubLSymbol $sym381$CLONE;
    private static final SubLString $str382$Cloned_instance___S;
    private static final SubLList $list383;
    private static final SubLSymbol $sym384$ABSTRACT_LEXICON_COPY_METHOD;
    private static final SubLList $list385;
    private static final SubLSymbol $sym386$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym387$CYCL_STRING_P;
    private static final SubLSymbol $sym388$CREATE_LEX_ENTRIES;
    private static final SubLSymbol $kw389$PREFERRED;
    private static final SubLSymbol $kw390$OFF;
    private static final SubLSymbol $sym391$ABSTRACT_LEXICON_GET_METHOD;
    private static final SubLSymbol $sym392$LEX_ENTRY_EQUAL_P;
    private static final SubLSymbol $sym393$DELETE;
    private static final SubLList $list394;
    private static final SubLSymbol $sym395$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym396$ABSTRACT_LEXICON_DELETE_METHOD;
    private static final SubLSymbol $sym397$DELETE_ENTRY_FROM_STRING;
    private static final SubLList $list398;
    private static final SubLList $list399;
    private static final SubLSymbol $sym400$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym401$LEX_ENTRY_P;
    private static final SubLSymbol $sym402$ABSTRACT_LEXICON_DELETE_ENTRY_FROM_STRING_METHOD;
    private static final SubLSymbol $sym403$NL_TRIE_LEX_ENTRY_P;
    private static final SubLSymbol $sym404$ADD;
    private static final SubLList $list405;
    private static final SubLList $list406;
    private static final SubLSymbol $sym407$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym408$ABSTRACT_LEXICON_ADD_METHOD;
    private static final SubLSymbol $sym409$LEARNED_;
    private static final SubLList $list410;
    private static final SubLSymbol $sym411$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym412$ABSTRACT_LEXICON_LEARNED__METHOD;
    private static final SubLSymbol $sym413$FORGET;
    private static final SubLList $list414;
    private static final SubLSymbol $sym415$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym416$ABSTRACT_LEXICON_FORGET_METHOD;
    private static final SubLSymbol $sym417$PREFIXES;
    private static final SubLList $list418;
    private static final SubLList $list419;
    private static final SubLSymbol $sym420$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym421$LISTP;
    private static final SubLSymbol $sym422$ABSTRACT_LEXICON_PREFIXES_METHOD;
    private static final SubLSymbol $sym423$PREFIXES_FROM_STRING;
    private static final SubLList $list424;
    private static final SubLSymbol $sym425$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym426$ABSTRACT_LEXICON_PREFIXES_FROM_STRING_METHOD;
    private static final SubLSymbol $kw427$FALLBACK;
    private static final SubLString $str428$Don_t_recognize_lexicon_case_sens;
    private static final SubLSymbol $sym429$PREFIX_KEYS;
    private static final SubLList $list430;
    private static final SubLSymbol $sym431$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym432$ABSTRACT_LEXICON_PREFIX_KEYS_METHOD;
    private static final SubLSymbol $sym433$PREFIX_KEYS_FROM_STRING;
    private static final SubLList $list434;
    private static final SubLSymbol $sym435$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym436$ABSTRACT_LEXICON_PREFIX_KEYS_FROM_STRING_METHOD;
    private static final SubLSymbol $sym437$LEARN;
    private static final SubLList $list438;
    private static final SubLList $list439;
    private static final SubLSymbol $sym440$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym441$ABSTRACT_LEXICON_LEARN_METHOD;
    private static final SubLSymbol $sym442$NUMBER_LEARN;
    private static final SubLList $list443;
    private static final SubLList $list444;
    private static final SubLSymbol $sym445$ABSTRACT_LEXICON_NUMBER_LEARN_METHOD;
    private static final SubLSymbol $kw446$CD;
    private static final SubLString $str447$_;
    private static final SubLObject $const448$ScalarInterval;
    private static final SubLSymbol $sym449$RKF_STANDARD_STRING_WORDIFY;
    private static final SubLString $str450$_;
    private static final SubLSymbol $sym451$WORD_STRING;
    private static final SubLSymbol $sym452$SCALAR_FUNCTION_;
    private static final SubLSymbol $sym453$_SCALAR_FUNCTION__CACHING_STATE_;
    private static final SubLInteger $int454$512;
    private static final SubLSymbol $sym455$NOUN_COMPOUND_LEARN;
    private static final SubLList $list456;
    private static final SubLSymbol $sym457$ABSTRACT_LEXICON_NOUN_COMPOUND_LEARN_METHOD;
    private static final SubLSymbol $kw458$NP;
    private static final SubLSymbol $sym459$COMPOUNDS_FROM_TREE;
    private static final SubLSymbol $kw460$BEST_ONLY;
    private static final SubLList $list461;
    private static final SubLSymbol $sym462$EXTRACT_PARSE_POS_PRED;
    private static final SubLList $list463;
    private static final SubLObject $const464$plural_Generic;
    private static final SubLList $list465;
    private static final SubLObject $const466$singular_Generic;
    private static final SubLList $list467;
    private static final SubLObject $const468$massNumber_Generic;
    private static final SubLObject $const469$nounStrings;
    private static final SubLSymbol $sym470$COOCCURRENCE_STATISTICS_LEARN;
    private static final SubLSymbol $sym471$ABSTRACT_LEXICON_COOCCURRENCE_STATISTICS_LEARN_METHOD;
    private static final SubLSymbol $sym472$LEXIFY_DOCUMENT;
    private static final SubLList $list473;
    private static final SubLList $list474;
    private static final SubLSymbol $sym475$DOCUMENT_P;
    private static final SubLSymbol $sym476$LEXIFY_PARAGRAPH;
    private static final SubLSymbol $sym477$VECTOR;
    private static final SubLSymbol $sym478$ABSTRACT_LEXICON_LEXIFY_DOCUMENT_METHOD;
    private static final SubLSymbol $sym479$LEXIFY_DOCUMENT_EXHAUSTIVELY;
    private static final SubLList $list480;
    private static final SubLSymbol $sym481$LEXIFY_PARAGRAPH_EXHAUSTIVELY;
    private static final SubLSymbol $sym482$ABSTRACT_LEXICON_LEXIFY_DOCUMENT_EXHAUSTIVELY_METHOD;
    private static final SubLList $list483;
    private static final SubLList $list484;
    private static final SubLSymbol $sym485$PARAGRAPH_P;
    private static final SubLSymbol $sym486$LEXIFY_SENTENCE;
    private static final SubLSymbol $sym487$ABSTRACT_LEXICON_LEXIFY_PARAGRAPH_METHOD;
    private static final SubLList $list488;
    private static final SubLSymbol $sym489$LEXIFY_SENTENCE_EXHAUSTIVELY;
    private static final SubLSymbol $sym490$ABSTRACT_LEXICON_LEXIFY_PARAGRAPH_EXHAUSTIVELY_METHOD;
    private static final SubLList $list491;
    private static final SubLList $list492;
    private static final SubLSymbol $sym493$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym494$SENTENCE_P;
    private static final SubLString $str495$20_iterations_hit_inside_abstract;
    private static final SubLSymbol $sym496$ABSTRACT_LEXICON_LEXIFY_SENTENCE_METHOD;
    private static final SubLList $list497;
    private static final SubLSymbol $sym498$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym499$ABSTRACT_LEXICON_LEXIFY_SENTENCE_EXHAUSTIVELY_METHOD;
    private static final SubLString $str500$;
    private static final SubLString $str501$_;
    private static final SubLString $str502$word_has_no_offset;
    private static final SubLSymbol $kw503$CATEGORY;
    private static final SubLSymbol $kw504$MOTHER;
    private static final SubLSymbol $kw505$INFO;
    private static final SubLSymbol $kw506$OFFSET;
    private static final SubLList $list507;
    private static final SubLList $list508;
    private static final SubLObject $const509$multiWordString;
    private static final SubLSymbol $kw510$BACKOFF_PENN_TAGS;
    private static final SubLSymbol $sym511$GET_STRING;
    private static final SubLSymbol $sym512$GET_CATEGORY;
    private static final SubLList $list513;
    private static final SubLSymbol $sym514$LEXIFY_WORDS;
    private static final SubLList $list515;
    private static final SubLList $list516;
    private static final SubLSymbol $sym517$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD;
    private static final SubLSymbol $sym518$GET_PARSE_TREE_STRING;
    private static final SubLSymbol $sym519$ABSTRACT_LEXICON_LEXIFY_WORDS_METHOD;
    private static final SubLString $str520$_;
    private static final SubLSymbol $sym521$TOKENIZE;
    private static final SubLList $list522;
    private static final SubLSymbol $sym523$FST_STRING_WORDIFY;
    private static final SubLSymbol $sym524$ABSTRACT_LEXICON_TOKENIZE_METHOD;
    private static final SubLList $list525;
    private static final SubLSymbol $sym526$ITERATOR;
    private static final SubLSymbol $sym527$CLET;
    private static final SubLSymbol $sym528$NEW_LEXICON_ITERATOR;
    private static final SubLSymbol $sym529$UNTIL;
    private static final SubLSymbol $sym530$ITERATION_DONE;
    private static final SubLSymbol $sym531$ITERATION_NEXT;
    private static final SubLSymbol $sym532$FIM;
    private static final SubLList $list533;
    private static final SubLSymbol $sym534$ITERATOR;
    private static final SubLList $list535;
    private static final SubLSymbol $sym536$ABSTRACT_LEXICON_ITERATOR_METHOD;
    private static final SubLSymbol $sym537$FORT_P;
    private static final SubLSymbol $sym538$NEW_LEXICON_FROM_KB_SPEC;
    private static final SubLList $list539;
    private static final SubLString $str540$_param_KB_SPEC__the_CycL_type_of_;
    private static final SubLList $list541;
    private static final SubLList $list542;
    private static final SubLSymbol $sym543$_CLASS_NAME;
    private static final SubLObject $const544$objectClassName;
    private static final SubLList $list545;
    private static final SubLSymbol $sym546$PREDS_FOR_LEXICON_EXCLUSION;
    private static final SubLSymbol $sym547$_PRED;
    private static final SubLObject $const548$disallowedLexicalPredicate;
    private static final SubLList $list549;
    private static final SubLList $list550;
    private static final SubLSymbol $sym551$_PREDS_FOR_LEXICON_EXCLUSION_CACHING_STATE_;
    private static final SubLSymbol $sym552$CLEAR_PREDS_FOR_LEXICON_EXCLUSION;
    private static final SubLSymbol $sym553$ABSTRACT_LEXICON_ITERATOR_STATE_DONE_P;
    private static final SubLSymbol $sym554$ABSTRACT_LEXICON_ITERATOR_STATE_NEXT;
    private static final SubLSymbol $sym555$ABSTRACT_LEXICON_ITERATOR_STATE;
    private static final SubLSymbol $sym556$ABSTRACT_LEXICON_ITERATOR_STATE_P;
    private static final SubLList $list557;
    private static final SubLList $list558;
    private static final SubLList $list559;
    private static final SubLList $list560;
    private static final SubLSymbol $sym561$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym562$ABSTRACT_LEXICON_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list563;
    private static final SubLSymbol $sym564$ABSTRACT_LEXICON_ITERATOR_STATE_TRIE_ITERATOR;
    private static final SubLSymbol $sym565$_CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_TRIE_ITERATOR;
    private static final SubLSymbol $sym566$ABSTRACT_LEXICON_ITERATOR_STATE_NEXT_ENTRIES;
    private static final SubLSymbol $sym567$_CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_NEXT_ENTRIES;
    private static final SubLSymbol $sym568$ABSTRACT_LEXICON_ITERATOR_STATE_LEXICON;
    private static final SubLSymbol $sym569$_CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_LEXICON;
    private static final SubLSymbol $kw570$TRIE_ITERATOR;
    private static final SubLSymbol $kw571$NEXT_ENTRIES;
    private static final SubLSymbol $kw572$LEXICON;
    private static final SubLSymbol $sym573$MAKE_ABSTRACT_LEXICON_ITERATOR_STATE;
    private static final SubLSymbol $sym574$VISIT_DEFSTRUCT_OBJECT_ABSTRACT_LEXICON_ITERATOR_STATE_METHOD;
    private static final SubLList $list575;
    private static final SubLList $list576;
    private static final SubLSymbol $sym577$STACK;
    private static final SubLSymbol $sym578$ENTRY;
    private static final SubLList $list579;
    private static final SubLSymbol $sym580$STACK_PUSH;
    private static final SubLSymbol $sym581$STACK_EMPTY_P;
    private static final SubLSymbol $sym582$STACK_POP;
    private static final SubLSymbol $sym583$PWHEN;
    private static final SubLSymbol $sym584$FIRST_ORDER_TERM_;
    private static final SubLSymbol $sym585$CSETQ;
    private static final SubLSymbol $sym586$CDOLIST;
    private static final SubLSymbol $sym587$ARG;
    private static final SubLSymbol $sym588$FORMULA_TERMS;
    private static final SubLSymbol $sym589$SCALAR_INTERVAL_MEANINGS;
    private static final SubLSymbol $kw590$TEST;
    private static final SubLSymbol $kw591$OWNER;
    private static final SubLSymbol $kw592$CLASSES;
    private static final SubLSymbol $kw593$KB;
    private static final SubLSymbol $kw594$FULL;
    private static final SubLSymbol $kw595$WORKING_;
    private static final SubLList $list596;
    private static final SubLSymbol $sym597$TEXT_NUMBERS;
    private static final SubLList $list598;
    private static final SubLList $list599;
    private static final SubLList $list600;
    private static final SubLSymbol $sym601$NUMBER_MEANINGS_EQUAL_;
    private static final SubLSymbol $sym602$NUMBER_MEANINGS;
    private static final SubLSymbol $sym603$NUMBER_MEANINGS_RESULTS_EQUAL_;
    private static final SubLList $list604;
    private static final SubLSymbol $sym605$TOKENIZING_TEST_COVERING;
    private static final SubLList $list606;


    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 3259L)
    public static SubLObject get_cyc_to_penn_map() {
        ensure_cyc_to_penn_map();
        return abstract_lexicon.$cyc_to_penn_map$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 3353L)
    public static SubLObject ensure_cyc_to_penn_map() {
        if (abstract_lexicon.NIL == abstract_lexicon.$cyc_to_penn_map$.getGlobalValue()) {
            abstract_lexicon.$cyc_to_penn_map$.setGlobalValue(build_cyc_to_penn_map());
        }
        return abstract_lexicon.$cyc_to_penn_map$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 3503L)
    public static SubLObject reinitialize_cyc_to_penn_map() {
        abstract_lexicon.$cyc_to_penn_map$.setGlobalValue((SubLObject)abstract_lexicon.NIL);
        abstract_lexicon.$cyc_to_penn_list$.setGlobalValue((SubLObject)abstract_lexicon.NIL);
        return get_cyc_to_penn_map();
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 3648L)
    public static SubLObject get_cyc_to_penn_list() {
        ensure_cyc_to_penn_list();
        return abstract_lexicon.$cyc_to_penn_list$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 3745L)
    public static SubLObject ensure_cyc_to_penn_list() {
        if (abstract_lexicon.NIL == abstract_lexicon.$cyc_to_penn_list$.getGlobalValue()) {
            abstract_lexicon.$cyc_to_penn_list$.setGlobalValue(Sequences.nreverse(list_utilities.partial_order_sort((SubLObject)abstract_lexicon.$list0, (SubLObject)abstract_lexicon.$sym1$GENL_IN_ANY_MT_, (SubLObject)abstract_lexicon.$sym2$SECOND)));
        }
        return abstract_lexicon.$cyc_to_penn_list$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 6218L)
    public static SubLObject rebuild_cyc_to_penn_map() {
        abstract_lexicon.$cyc_to_penn_list$.setGlobalValue((SubLObject)abstract_lexicon.NIL);
        abstract_lexicon.$cyc_to_penn_map$.setGlobalValue(build_cyc_to_penn_map());
        return abstract_lexicon.$cyc_to_penn_map$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 6374L)
    public static SubLObject build_cyc_to_penn_map() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cyc_to_penn = Hashtables.make_hash_table((SubLObject)abstract_lexicon.$int3$500, Symbols.symbol_function((SubLObject)abstract_lexicon.EQUAL), (SubLObject)abstract_lexicon.UNPROVIDED);
        SubLObject super_pos = (SubLObject)abstract_lexicon.NIL;
        SubLObject super_pred = (SubLObject)abstract_lexicon.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)abstract_lexicon.$sym4$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(abstract_lexicon.$const5$EverythingPSC, thread);
            final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)abstract_lexicon.SIX_INTEGER), thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)abstract_lexicon.T, thread);
                SubLObject cdolist_list_var = get_cyc_to_penn_list();
                SubLObject mapentry = (SubLObject)abstract_lexicon.NIL;
                mapentry = cdolist_list_var.first();
                while (abstract_lexicon.NIL != cdolist_list_var) {
                    super_pos = conses_high.second(mapentry);
                    super_pred = ((abstract_lexicon.NIL != conses_high.third(mapentry)) ? conses_high.third(mapentry) : abstract_lexicon.$const6$partOfSpeech);
                    SubLObject cdolist_list_var_$3 = genls.all_specs(super_pos, abstract_lexicon.$const7$GeneralLexiconMt, (SubLObject)abstract_lexicon.UNPROVIDED);
                    SubLObject sub_pos = (SubLObject)abstract_lexicon.NIL;
                    sub_pos = cdolist_list_var_$3.first();
                    while (abstract_lexicon.NIL != cdolist_list_var_$3) {
                        SubLObject cdolist_list_var_$4 = genl_predicates.all_spec_predicates(super_pred, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
                        SubLObject sub_pred = (SubLObject)abstract_lexicon.NIL;
                        sub_pred = cdolist_list_var_$4.first();
                        while (abstract_lexicon.NIL != cdolist_list_var_$4) {
                            Hashtables.sethash((SubLObject)ConsesLow.cons(sub_pos, sub_pred), cyc_to_penn, mapentry.first());
                            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                            sub_pred = cdolist_list_var_$4.first();
                        }
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        sub_pos = cdolist_list_var_$3.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    mapentry = cdolist_list_var.first();
                }
            }
            finally {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$2, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return cyc_to_penn;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 8873L)
    public static SubLObject build_cyc_to_supertag_map() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cyc_to_supertag = Hashtables.make_hash_table((SubLObject)abstract_lexicon.$int3$500, Symbols.symbol_function((SubLObject)abstract_lexicon.EQUAL), (SubLObject)abstract_lexicon.UNPROVIDED);
        SubLObject cyc = (SubLObject)abstract_lexicon.NIL;
        SubLObject supertag = (SubLObject)abstract_lexicon.NIL;
        SubLObject super_pos = (SubLObject)abstract_lexicon.NIL;
        SubLObject super_frame = (SubLObject)abstract_lexicon.NIL;
        SubLObject super_pred = (SubLObject)abstract_lexicon.NIL;
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)abstract_lexicon.SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)abstract_lexicon.T, thread);
            SubLObject cdolist_list_var = abstract_lexicon.$cyc_to_supertag_list$.getDynamicValue(thread);
            SubLObject mapentry = (SubLObject)abstract_lexicon.NIL;
            mapentry = cdolist_list_var.first();
            while (abstract_lexicon.NIL != cdolist_list_var) {
                supertag = mapentry.first();
                cyc = mapentry.rest();
                super_pos = cyc.first();
                super_frame = conses_high.second(cyc);
                super_pred = conses_high.third(cyc);
                SubLObject cdolist_list_var_$5 = genls.all_specs(super_pos, abstract_lexicon.$const9$GeneralEnglishMt, (SubLObject)abstract_lexicon.UNPROVIDED);
                SubLObject sub_pos = (SubLObject)abstract_lexicon.NIL;
                sub_pos = cdolist_list_var_$5.first();
                while (abstract_lexicon.NIL != cdolist_list_var_$5) {
                    SubLObject cdolist_list_var_$6 = (SubLObject)ConsesLow.cons(super_frame, isa.all_fort_instances(super_frame, abstract_lexicon.$const9$GeneralEnglishMt, (SubLObject)abstract_lexicon.UNPROVIDED));
                    SubLObject sub_frame = (SubLObject)abstract_lexicon.NIL;
                    sub_frame = cdolist_list_var_$6.first();
                    while (abstract_lexicon.NIL != cdolist_list_var_$6) {
                        SubLObject cdolist_list_var_$7 = (SubLObject)((abstract_lexicon.NIL != super_pred) ? genl_predicates.all_spec_preds(super_pred, abstract_lexicon.$const9$GeneralEnglishMt, (SubLObject)abstract_lexicon.UNPROVIDED) : ConsesLow.list((SubLObject)abstract_lexicon.NIL));
                        SubLObject sub_pred = (SubLObject)abstract_lexicon.NIL;
                        sub_pred = cdolist_list_var_$7.first();
                        while (abstract_lexicon.NIL != cdolist_list_var_$7) {
                            Hashtables.sethash((SubLObject)ConsesLow.list(sub_pos, sub_frame, sub_pred), cyc_to_supertag, supertag);
                            cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                            sub_pred = cdolist_list_var_$7.first();
                        }
                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                        sub_frame = cdolist_list_var_$6.first();
                    }
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    sub_pos = cdolist_list_var_$5.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                mapentry = cdolist_list_var.first();
            }
        }
        finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return cyc_to_supertag;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
    public static SubLObject textract_lemma_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        textract_lemma_print(v_object, stream, (SubLObject)abstract_lexicon.ZERO_INTEGER);
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
    public static SubLObject textract_lemma_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $textract_lemma_native.class) ? abstract_lexicon.T : abstract_lexicon.NIL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
    public static SubLObject textract_lemma_paragraph(final SubLObject v_object) {
        assert abstract_lexicon.NIL != textract_lemma_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
    public static SubLObject textract_lemma_sentence(final SubLObject v_object) {
        assert abstract_lexicon.NIL != textract_lemma_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
    public static SubLObject textract_lemma_word(final SubLObject v_object) {
        assert abstract_lexicon.NIL != textract_lemma_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
    public static SubLObject textract_lemma_string(final SubLObject v_object) {
        assert abstract_lexicon.NIL != textract_lemma_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
    public static SubLObject textract_lemma_canon(final SubLObject v_object) {
        assert abstract_lexicon.NIL != textract_lemma_p(v_object) : v_object;
        return v_object.getField6();
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
    public static SubLObject textract_lemma_type(final SubLObject v_object) {
        assert abstract_lexicon.NIL != textract_lemma_p(v_object) : v_object;
        return v_object.getField7();
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
    public static SubLObject _csetf_textract_lemma_paragraph(final SubLObject v_object, final SubLObject value) {
        assert abstract_lexicon.NIL != textract_lemma_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
    public static SubLObject _csetf_textract_lemma_sentence(final SubLObject v_object, final SubLObject value) {
        assert abstract_lexicon.NIL != textract_lemma_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
    public static SubLObject _csetf_textract_lemma_word(final SubLObject v_object, final SubLObject value) {
        assert abstract_lexicon.NIL != textract_lemma_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
    public static SubLObject _csetf_textract_lemma_string(final SubLObject v_object, final SubLObject value) {
        assert abstract_lexicon.NIL != textract_lemma_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
    public static SubLObject _csetf_textract_lemma_canon(final SubLObject v_object, final SubLObject value) {
        assert abstract_lexicon.NIL != textract_lemma_p(v_object) : v_object;
        return v_object.setField6(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
    public static SubLObject _csetf_textract_lemma_type(final SubLObject v_object, final SubLObject value) {
        assert abstract_lexicon.NIL != textract_lemma_p(v_object) : v_object;
        return v_object.setField7(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
    public static SubLObject make_textract_lemma(SubLObject arglist) {
        if (arglist == abstract_lexicon.UNPROVIDED) {
            arglist = (SubLObject)abstract_lexicon.NIL;
        }
        final SubLObject v_new = (SubLObject)new $textract_lemma_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)abstract_lexicon.NIL, next = arglist; abstract_lexicon.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)abstract_lexicon.$kw31$PARAGRAPH)) {
                _csetf_textract_lemma_paragraph(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)abstract_lexicon.$kw32$SENTENCE)) {
                _csetf_textract_lemma_sentence(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)abstract_lexicon.$kw33$WORD)) {
                _csetf_textract_lemma_word(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)abstract_lexicon.$kw34$STRING)) {
                _csetf_textract_lemma_string(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)abstract_lexicon.$kw35$CANON)) {
                _csetf_textract_lemma_canon(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)abstract_lexicon.$kw36$TYPE)) {
                _csetf_textract_lemma_type(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)abstract_lexicon.$str37$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
    public static SubLObject visit_defstruct_textract_lemma(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)abstract_lexicon.$kw38$BEGIN, (SubLObject)abstract_lexicon.$sym39$MAKE_TEXTRACT_LEMMA, (SubLObject)abstract_lexicon.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)abstract_lexicon.$kw40$SLOT, (SubLObject)abstract_lexicon.$kw31$PARAGRAPH, textract_lemma_paragraph(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)abstract_lexicon.$kw40$SLOT, (SubLObject)abstract_lexicon.$kw32$SENTENCE, textract_lemma_sentence(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)abstract_lexicon.$kw40$SLOT, (SubLObject)abstract_lexicon.$kw33$WORD, textract_lemma_word(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)abstract_lexicon.$kw40$SLOT, (SubLObject)abstract_lexicon.$kw34$STRING, textract_lemma_string(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)abstract_lexicon.$kw40$SLOT, (SubLObject)abstract_lexicon.$kw35$CANON, textract_lemma_canon(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)abstract_lexicon.$kw40$SLOT, (SubLObject)abstract_lexicon.$kw36$TYPE, textract_lemma_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)abstract_lexicon.$kw41$END, (SubLObject)abstract_lexicon.$sym39$MAKE_TEXTRACT_LEMMA, (SubLObject)abstract_lexicon.SIX_INTEGER);
        return obj;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
    public static SubLObject visit_defstruct_object_textract_lemma_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_textract_lemma(obj, visitor_fn);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9962L)
    public static SubLObject new_textract_lemma(final SubLObject line) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert abstract_lexicon.NIL != Types.stringp(line) : line;
        SubLObject lemma = make_textract_lemma((SubLObject)abstract_lexicon.UNPROVIDED);
        final SubLObject coordsXstring = string_utilities.split_string(string_utilities.trim_whitespace(string_utilities.string_upto(line, (SubLObject)Characters.CHAR_lparen)), (SubLObject)abstract_lexicon.UNPROVIDED);
        SubLObject error = (SubLObject)abstract_lexicon.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)abstract_lexicon.$sym44$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    _csetf_textract_lemma_paragraph(lemma, reader.parse_integer(coordsXstring.first(), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED));
                    _csetf_textract_lemma_sentence(lemma, reader.parse_integer(conses_high.second(coordsXstring), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED));
                    _csetf_textract_lemma_word(lemma, reader.parse_integer(conses_high.third(coordsXstring), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED));
                    _csetf_textract_lemma_string(lemma, string_utilities.bunge(conses_high.nthcdr((SubLObject)abstract_lexicon.THREE_INTEGER, coordsXstring), (SubLObject)abstract_lexicon.UNPROVIDED));
                    _csetf_textract_lemma_canon(lemma, string_utilities.trim_whitespace(string_utilities.string_between(line, (SubLObject)abstract_lexicon.$list45, (SubLObject)abstract_lexicon.UNPROVIDED)));
                    _csetf_textract_lemma_type(lemma, Symbols.make_keyword(string_utilities.string_between(line, (SubLObject)abstract_lexicon.$list46, (SubLObject)abstract_lexicon.UNPROVIDED)));
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)abstract_lexicon.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (abstract_lexicon.NIL != error) {
            lemma = (SubLObject)abstract_lexicon.NIL;
        }
        return lemma;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 10855L)
    public static SubLObject textract_lemma_print(final SubLObject lemma, final SubLObject stream, final SubLObject depth) {
        streams_high.write_string((SubLObject)abstract_lexicon.$str47$__TEXTRACT_LEMMA_, stream, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
        print_high.princ(textract_lemma_paragraph(lemma), stream);
        streams_high.write_string((SubLObject)abstract_lexicon.$str48$_, stream, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
        print_high.princ(textract_lemma_sentence(lemma), stream);
        streams_high.write_string((SubLObject)abstract_lexicon.$str48$_, stream, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
        print_high.princ(textract_lemma_word(lemma), stream);
        streams_high.write_string((SubLObject)abstract_lexicon.$str48$_, stream, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
        streams_high.write_string(textract_lemma_string(lemma), stream, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
        streams_high.write_string((SubLObject)abstract_lexicon.$str48$_, stream, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
        streams_high.write_string(textract_lemma_canon(lemma), stream, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
        streams_high.write_string((SubLObject)abstract_lexicon.$str48$_, stream, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
        print_high.princ(textract_lemma_type(lemma), stream);
        streams_high.write_string((SubLObject)abstract_lexicon.$str49$_, stream, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
        return lemma;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 11456L)
    public static SubLObject get_lex_entry_properties(final SubLObject lex_entry) {
        return classes.subloop_get_access_protected_instance_slot(lex_entry, (SubLObject)abstract_lexicon.ONE_INTEGER, (SubLObject)abstract_lexicon.$sym53$PROPERTIES);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 11456L)
    public static SubLObject set_lex_entry_properties(final SubLObject lex_entry, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lex_entry, value, (SubLObject)abstract_lexicon.ONE_INTEGER, (SubLObject)abstract_lexicon.$sym53$PROPERTIES);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 11456L)
    public static SubLObject get_lex_entry_supported_properties(final SubLObject lex_entry) {
        final SubLObject v_class = (SubLObject)(lex_entry.isSymbol() ? classes.classes_retrieve_class(lex_entry) : ((abstract_lexicon.NIL != subloop_structures.class_p(lex_entry)) ? lex_entry : ((abstract_lexicon.NIL != subloop_structures.instance_p(lex_entry)) ? subloop_structures.instance_class(lex_entry) : abstract_lexicon.NIL)));
        if (abstract_lexicon.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)abstract_lexicon.$sym54$SUPPORTED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)abstract_lexicon.THREE_INTEGER);
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 11456L)
    public static SubLObject set_lex_entry_supported_properties(final SubLObject lex_entry, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(lex_entry.isSymbol() ? classes.classes_retrieve_class(lex_entry) : ((abstract_lexicon.NIL != subloop_structures.class_p(lex_entry)) ? lex_entry : ((abstract_lexicon.NIL != subloop_structures.instance_p(lex_entry)) ? subloop_structures.instance_class(lex_entry) : abstract_lexicon.NIL)));
        if (abstract_lexicon.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)abstract_lexicon.$sym54$SUPPORTED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)abstract_lexicon.THREE_INTEGER, value);
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 11456L)
    public static SubLObject get_lex_entry_computed_properties(final SubLObject lex_entry) {
        final SubLObject v_class = (SubLObject)(lex_entry.isSymbol() ? classes.classes_retrieve_class(lex_entry) : ((abstract_lexicon.NIL != subloop_structures.class_p(lex_entry)) ? lex_entry : ((abstract_lexicon.NIL != subloop_structures.instance_p(lex_entry)) ? subloop_structures.instance_class(lex_entry) : abstract_lexicon.NIL)));
        if (abstract_lexicon.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)abstract_lexicon.$sym55$COMPUTED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)abstract_lexicon.TWO_INTEGER);
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 11456L)
    public static SubLObject set_lex_entry_computed_properties(final SubLObject lex_entry, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(lex_entry.isSymbol() ? classes.classes_retrieve_class(lex_entry) : ((abstract_lexicon.NIL != subloop_structures.class_p(lex_entry)) ? lex_entry : ((abstract_lexicon.NIL != subloop_structures.instance_p(lex_entry)) ? subloop_structures.instance_class(lex_entry) : abstract_lexicon.NIL)));
        if (abstract_lexicon.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)abstract_lexicon.$sym55$COMPUTED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)abstract_lexicon.TWO_INTEGER, value);
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 11456L)
    public static SubLObject get_lex_entry_stored_properties(final SubLObject lex_entry) {
        final SubLObject v_class = (SubLObject)(lex_entry.isSymbol() ? classes.classes_retrieve_class(lex_entry) : ((abstract_lexicon.NIL != subloop_structures.class_p(lex_entry)) ? lex_entry : ((abstract_lexicon.NIL != subloop_structures.instance_p(lex_entry)) ? subloop_structures.instance_class(lex_entry) : abstract_lexicon.NIL)));
        if (abstract_lexicon.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)abstract_lexicon.$sym56$STORED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)abstract_lexicon.ONE_INTEGER);
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 11456L)
    public static SubLObject set_lex_entry_stored_properties(final SubLObject lex_entry, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(lex_entry.isSymbol() ? classes.classes_retrieve_class(lex_entry) : ((abstract_lexicon.NIL != subloop_structures.class_p(lex_entry)) ? lex_entry : ((abstract_lexicon.NIL != subloop_structures.instance_p(lex_entry)) ? subloop_structures.instance_class(lex_entry) : abstract_lexicon.NIL)));
        if (abstract_lexicon.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)abstract_lexicon.$sym56$STORED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)abstract_lexicon.ONE_INTEGER, value);
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 11456L)
    public static SubLObject subloop_reserved_initialize_lex_entry_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym51$OBJECT, (SubLObject)abstract_lexicon.$sym57$INSTANCE_COUNT, (SubLObject)abstract_lexicon.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym56$STORED_PROPERTIES, (SubLObject)abstract_lexicon.$list58);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym55$COMPUTED_PROPERTIES, (SubLObject)abstract_lexicon.$list59);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym54$SUPPORTED_PROPERTIES, ConsesLow.append(instances.get_slot((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym56$STORED_PROPERTIES), Mapping.mapcar((SubLObject)abstract_lexicon.$sym60$CAR, instances.get_slot((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym55$COMPUTED_PROPERTIES))));
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 11456L)
    public static SubLObject subloop_reserved_initialize_lex_entry_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym51$OBJECT, (SubLObject)abstract_lexicon.$sym62$ISOLATED_P, (SubLObject)abstract_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym51$OBJECT, (SubLObject)abstract_lexicon.$sym63$INSTANCE_NUMBER, (SubLObject)abstract_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym53$PROPERTIES, (SubLObject)abstract_lexicon.NIL);
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 11456L)
    public static SubLObject lex_entry_p(final SubLObject lex_entry) {
        return classes.subloop_instanceof_class(lex_entry, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 13366L)
    public static SubLObject lex_entry_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lex_entry_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject v_properties = get_lex_entry_properties(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym68$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
            try {
                object.object_initialize_method(self);
                v_properties = (SubLObject)abstract_lexicon.NIL;
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym68$OUTER_CATCH_FOR_LEX_ENTRY_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lex_entry_properties(self, v_properties);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lex_entry_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym68$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lex_entry_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 13591L)
    public static SubLObject lex_entry_get_method(final SubLObject self, final SubLObject property) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lex_entry_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject supported_properties = get_lex_entry_supported_properties(self);
        final SubLObject computed_properties = get_lex_entry_computed_properties(self);
        SubLObject v_properties = get_lex_entry_properties(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym74$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
            try {
                if (abstract_lexicon.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && abstract_lexicon.NIL == conses_high.member(property, instances.get_slot((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym54$SUPPORTED_PROPERTIES), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED)) {
                    Errors.error((SubLObject)abstract_lexicon.$str75$Unsupported_lexical_property__a, property);
                }
                SubLObject value = conses_high.assoc(property, v_properties, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED).rest();
                if (abstract_lexicon.NIL == value) {
                    final SubLObject property_method = conses_high.assoc(property, instances.get_slot((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym55$COMPUTED_PROPERTIES), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED).rest();
                    if (abstract_lexicon.NIL != property_method) {
                        value = methods.funcall_instance_method_with_0_args(self, property_method);
                        if (abstract_lexicon.NIL != value) {
                            v_properties = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(property, value), v_properties);
                        }
                    }
                }
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym74$OUTER_CATCH_FOR_LEX_ENTRY_METHOD, value);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lex_entry_supported_properties(self, supported_properties);
                    set_lex_entry_computed_properties(self, computed_properties);
                    set_lex_entry_properties(self, v_properties);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lex_entry_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym74$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lex_entry_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 14369L)
    public static SubLObject lex_entry_denot(final SubLObject entry) {
        return methods.funcall_instance_method_with_1_args(entry, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw77$DENOT);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 14445L)
    public static SubLObject lex_entry_semtrans(final SubLObject entry) {
        return methods.funcall_instance_method_with_1_args(entry, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw78$SEMTRANS);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 14528L)
    public static SubLObject lex_entry_trie_entry(final SubLObject entry) {
        return methods.funcall_instance_method_with_1_args(entry, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw79$TRIE_ENTRY);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 14615L)
    public static SubLObject lex_entry_set_method(final SubLObject self, final SubLObject property, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lex_entry_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject supported_properties = get_lex_entry_supported_properties(self);
        SubLObject v_properties = get_lex_entry_properties(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym83$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
            try {
                if (abstract_lexicon.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && abstract_lexicon.NIL == conses_high.member(property, instances.get_slot((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym54$SUPPORTED_PROPERTIES), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED)) {
                    Errors.error((SubLObject)abstract_lexicon.$str75$Unsupported_lexical_property__a, property);
                }
                v_properties = Sequences.remove(property, v_properties, (SubLObject)abstract_lexicon.EQ, (SubLObject)abstract_lexicon.$sym84$FIRST, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
                v_properties = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(property, value), v_properties);
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym83$OUTER_CATCH_FOR_LEX_ENTRY_METHOD, value);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lex_entry_supported_properties(self, supported_properties);
                    set_lex_entry_properties(self, v_properties);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lex_entry_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym83$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lex_entry_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 14959L)
    public static SubLObject lex_entry_copy_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lex_entry_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject v_properties = get_lex_entry_properties(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym88$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
            try {
                final SubLObject new_entry = object.new_class_instance((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY);
                SubLObject new_properties = (SubLObject)abstract_lexicon.NIL;
                SubLObject cdolist_list_var = v_properties;
                SubLObject keyXval = (SubLObject)abstract_lexicon.NIL;
                keyXval = cdolist_list_var.first();
                while (abstract_lexicon.NIL != cdolist_list_var) {
                    final SubLObject new_key = keyXval.first();
                    final SubLObject val = keyXval.rest();
                    final SubLObject new_val = val.isList() ? conses_high.copy_list(val) : val;
                    new_properties = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(new_key, new_val), new_properties);
                    cdolist_list_var = cdolist_list_var.rest();
                    keyXval = cdolist_list_var.first();
                }
                instances.set_slot(new_entry, (SubLObject)abstract_lexicon.$sym53$PROPERTIES, new_properties);
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym88$OUTER_CATCH_FOR_LEX_ENTRY_METHOD, new_entry);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lex_entry_properties(self, v_properties);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lex_entry_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym88$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lex_entry_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 15390L)
    public static SubLObject lex_entry_nounP_method(final SubLObject self, SubLObject mt) {
        if (mt == abstract_lexicon.UNPROVIDED) {
            mt = (SubLObject)abstract_lexicon.$kw94$ANY;
        }
        final SubLObject pos = methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw95$CYC_POS);
        if (mt == abstract_lexicon.$kw94$ANY) {
            return genls.genl_in_any_mtP(pos, abstract_lexicon.$const96$Noun);
        }
        return genls.genlP(pos, abstract_lexicon.$const96$Noun, mt, (SubLObject)abstract_lexicon.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 15739L)
    public static SubLObject lex_entry_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lex_entry_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject v_properties = get_lex_entry_properties(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym101$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
            try {
                streams_high.write_string((SubLObject)abstract_lexicon.$str102$__LEX_ENTRY_, stream, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
                streams_high.terpri(stream);
                SubLObject cdolist_list_var = v_properties;
                SubLObject property = (SubLObject)abstract_lexicon.NIL;
                property = cdolist_list_var.first();
                while (abstract_lexicon.NIL != cdolist_list_var) {
                    print_high.prin1(property.first(), stream);
                    streams_high.write_string((SubLObject)abstract_lexicon.$str103$____, stream, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
                    print_high.prin1(property.rest(), stream);
                    streams_high.terpri(stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    property = cdolist_list_var.first();
                }
                streams_high.write_string((SubLObject)abstract_lexicon.$str49$_, stream, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
                streams_high.terpri(stream);
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym101$OUTER_CATCH_FOR_LEX_ENTRY_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lex_entry_properties(self, v_properties);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lex_entry_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym101$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lex_entry_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 16475L)
    public static SubLObject lex_entry_nominal_p_method(final SubLObject self) {
        return conses_high.intersection(methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw111$PENN_TAGS), abstract_lexicon.$nominal_tags$.getGlobalValue(), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 16599L)
    public static SubLObject lex_entry_verbal_p_method(final SubLObject self) {
        return conses_high.intersection(methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw111$PENN_TAGS), abstract_lexicon.$verbal_tags$.getGlobalValue(), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 16721L)
    public static SubLObject lex_entry_adjectival_p_method(final SubLObject self) {
        return conses_high.intersection(methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw111$PENN_TAGS), abstract_lexicon.$adjectival_tags$.getGlobalValue(), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 16851L)
    public static SubLObject lex_entry_adverbial_p_method(final SubLObject self) {
        return conses_high.intersection(methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw111$PENN_TAGS), abstract_lexicon.$adverbial_tags$.getGlobalValue(), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 16979L)
    public static SubLObject lex_entry_compute_term_method(final SubLObject self) {
        if (abstract_lexicon.NIL == methods.funcall_instance_method_with_0_args(self, (SubLObject)abstract_lexicon.$sym109$NOMINAL_P) && abstract_lexicon.NIL == methods.funcall_instance_method_with_0_args(self, (SubLObject)abstract_lexicon.$sym113$VERBAL_P)) {
            Errors.error((SubLObject)abstract_lexicon.$str124$Invalid_lexical_property__term_ca, self);
        }
        SubLObject v_term = methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw77$DENOT);
        if (abstract_lexicon.NIL == v_term) {
            final SubLObject semtrans = methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw78$SEMTRANS);
            if (abstract_lexicon.NIL != semtrans) {
                final SubLObject operator = cycl_utilities.formula_operator(semtrans);
                if (operator.eql(abstract_lexicon.$const125$equals) || operator.eql(abstract_lexicon.$const126$isa) || operator.eql(abstract_lexicon.$const127$genls)) {
                    v_term = cycl_utilities.formula_arg2(semtrans, (SubLObject)abstract_lexicon.UNPROVIDED);
                }
                else if (abstract_lexicon.NIL != fort_types_interface.logical_connective_p(cycl_utilities.formula_operator(semtrans)) || abstract_lexicon.NIL != fort_types_interface.quantifier_p(cycl_utilities.formula_operator(semtrans))) {
                    final SubLObject central_keyword = (SubLObject)((abstract_lexicon.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)abstract_lexicon.$sym109$NOMINAL_P)) ? abstract_lexicon.$kw128$NOUN : ((abstract_lexicon.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)abstract_lexicon.$sym113$VERBAL_P)) ? abstract_lexicon.$kw129$ACTION : abstract_lexicon.NIL));
                    v_term = parse_tree.main_collection(semtrans, central_keyword);
                }
                else {
                    v_term = cycl_utilities.formula_operator(semtrans);
                }
            }
        }
        return v_term;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 17929L)
    public static SubLObject lex_entry_compute_gender_method(final SubLObject self) {
        if (abstract_lexicon.NIL == methods.funcall_instance_method_with_0_args(self, (SubLObject)abstract_lexicon.$sym109$NOMINAL_P)) {
            Errors.error((SubLObject)abstract_lexicon.$str133$Invalid_lexical_property__gender_, self);
        }
        SubLObject genders = (SubLObject)abstract_lexicon.NIL;
        final SubLObject v_term = methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw134$TERM);
        if (abstract_lexicon.NIL != at_utilities.more_specific_p(v_term, abstract_lexicon.$const135$MaleAnimal, abstract_lexicon.$const5$EverythingPSC)) {
            genders = (SubLObject)abstract_lexicon.$list136;
        }
        else if (abstract_lexicon.NIL != at_utilities.more_specific_p(v_term, abstract_lexicon.$const137$FemaleAnimal, abstract_lexicon.$const5$EverythingPSC)) {
            genders = (SubLObject)abstract_lexicon.$list138;
        }
        else if (abstract_lexicon.NIL != at_utilities.more_specific_p(v_term, abstract_lexicon.$const139$Person, abstract_lexicon.$const5$EverythingPSC)) {
            genders = (SubLObject)abstract_lexicon.$list140;
        }
        else if (abstract_lexicon.NIL != at_utilities.more_specific_p(v_term, abstract_lexicon.$const141$SentientAnimal, abstract_lexicon.$const5$EverythingPSC)) {
            genders = (SubLObject)abstract_lexicon.$list142;
        }
        if (abstract_lexicon.NIL == genders) {
            genders = (SubLObject)abstract_lexicon.$list143;
        }
        return genders;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 18753L)
    public static SubLObject lex_entry_compute_penn_tags_method(final SubLObject self) {
        final SubLObject pos = lex_entry_get_method(self, (SubLObject)abstract_lexicon.$kw95$CYC_POS);
        final SubLObject inflections = lex_entry_get_method(self, (SubLObject)abstract_lexicon.$kw147$INFLECTIONS);
        final SubLObject string = lex_entry_get_method(self, (SubLObject)abstract_lexicon.$kw34$STRING);
        SubLObject penn_tags = (SubLObject)abstract_lexicon.NIL;
        if (pos.eql(abstract_lexicon.$const148$Preposition) && string.equalp((SubLObject)abstract_lexicon.$str149$to)) {
            penn_tags = (SubLObject)ConsesLow.cons((SubLObject)abstract_lexicon.$kw150$TO, penn_tags);
        }
        else {
            SubLObject cdolist_list_var = inflections;
            SubLObject inflection = (SubLObject)abstract_lexicon.NIL;
            inflection = cdolist_list_var.first();
            while (abstract_lexicon.NIL != cdolist_list_var) {
                final SubLObject penn_tag = map_from_cyc_to_penn_pos(pos, inflection);
                if (abstract_lexicon.NIL != penn_tag) {
                    penn_tags = (SubLObject)ConsesLow.cons(penn_tag, penn_tags);
                }
                cdolist_list_var = cdolist_list_var.rest();
                inflection = cdolist_list_var.first();
            }
        }
        return Sequences.remove_duplicates(penn_tags, (SubLObject)abstract_lexicon.EQ, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 19309L)
    public static SubLObject lex_entry_compute_backoff_penn_tags_method(final SubLObject self) {
        SubLObject cdolist_list_var;
        SubLObject penn_tags = cdolist_list_var = methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw111$PENN_TAGS);
        SubLObject tag = (SubLObject)abstract_lexicon.NIL;
        tag = cdolist_list_var.first();
        while (abstract_lexicon.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$8 = tag_backoffs(tag);
            SubLObject backoff = (SubLObject)abstract_lexicon.NIL;
            backoff = cdolist_list_var_$8.first();
            while (abstract_lexicon.NIL != cdolist_list_var_$8) {
                if (!backoff.eql(tag)) {
                    penn_tags = (SubLObject)ConsesLow.cons(backoff, penn_tags);
                }
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                backoff = cdolist_list_var_$8.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            tag = cdolist_list_var.first();
        }
        return penn_tags;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 19829L)
    public static SubLObject tag_backoffs(final SubLObject tag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)abstract_lexicon.NIL;
        SubLObject cdolist_list_var = abstract_lexicon.$penn_tag_backoffs$.getDynamicValue(thread);
        SubLObject tags = (SubLObject)abstract_lexicon.NIL;
        tags = cdolist_list_var.first();
        while (abstract_lexicon.NIL != cdolist_list_var) {
            if (abstract_lexicon.NIL != subl_promotions.memberP(tag, tags, (SubLObject)abstract_lexicon.EQ, (SubLObject)abstract_lexicon.UNPROVIDED)) {
                result = Sequences.cconcatenate(tags, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tags = cdolist_list_var.first();
        }
        return Sequences.remove_duplicates(Sequences.remove(tag, result, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 20056L)
    public static SubLObject lex_entry_compute_super_tags_method(final SubLObject self) {
        SubLObject supertags = (SubLObject)abstract_lexicon.NIL;
        SubLObject cdolist_list_var = lex_entry_get_method(self, (SubLObject)abstract_lexicon.$kw147$INFLECTIONS);
        SubLObject infl = (SubLObject)abstract_lexicon.NIL;
        infl = cdolist_list_var.first();
        while (abstract_lexicon.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$9 = Hashtables.gethash((SubLObject)ConsesLow.list(lex_entry_get_method(self, (SubLObject)abstract_lexicon.$kw95$CYC_POS), lex_entry_get_method(self, (SubLObject)abstract_lexicon.$kw158$FRAME), infl), abstract_lexicon.$cyc_to_supertag_map$.getGlobalValue(), (SubLObject)abstract_lexicon.UNPROVIDED);
            SubLObject supertag = (SubLObject)abstract_lexicon.NIL;
            supertag = cdolist_list_var_$9.first();
            while (abstract_lexicon.NIL != cdolist_list_var_$9) {
                final SubLObject item_var = supertag;
                if (abstract_lexicon.NIL == conses_high.member(item_var, supertags, (SubLObject)abstract_lexicon.EQUAL, Symbols.symbol_function((SubLObject)abstract_lexicon.IDENTITY))) {
                    supertags = (SubLObject)ConsesLow.cons(item_var, supertags);
                }
                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                supertag = cdolist_list_var_$9.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            infl = cdolist_list_var.first();
        }
        return supertags;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 20423L)
    public static SubLObject lex_entry_compute_cyc_pos_method(final SubLObject self) {
        final SubLObject trie_entry = methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw79$TRIE_ENTRY);
        if (abstract_lexicon.NIL != trie_entry) {
            return nl_trie.nl_trie_entry_pos(trie_entry);
        }
        if (abstract_lexicon.NIL != methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw147$INFLECTIONS)) {
            SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw147$INFLECTIONS);
            SubLObject pred = (SubLObject)abstract_lexicon.NIL;
            pred = cdolist_list_var.first();
            while (abstract_lexicon.NIL != cdolist_list_var) {
                final SubLObject pos = lexicon_accessors.pos_of_pred(pred);
                if (abstract_lexicon.NIL != pos) {
                    return pos;
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 20776L)
    public static SubLObject lex_entry_compute_is_ner_entry_method(final SubLObject self) {
        final SubLObject trie_entry = methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw79$TRIE_ENTRY);
        return (SubLObject)SubLObjectFactory.makeBoolean(abstract_lexicon.NIL == trie_entry);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 20926L)
    public static SubLObject lex_entry_compute_cyc_category_method(final SubLObject self) {
        final SubLObject pred = methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw168$PREDICATE);
        if (abstract_lexicon.NIL != lexicon_vars.name_string_predP(pred)) {
            return abstract_lexicon.$const169$NounPhrase;
        }
        return methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw95$CYC_POS);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21332L)
    public static SubLObject lex_entry_compute_inflections_method(final SubLObject self) {
        final SubLObject trie_entry = methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw79$TRIE_ENTRY);
        if (abstract_lexicon.NIL != trie_entry) {
            return nl_trie.nl_trie_entry_pos_preds(trie_entry);
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject get_abstract_lexicon_stop_words(final SubLObject v_abstract_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, (SubLObject)abstract_lexicon.FIFTEEN_INTEGER, (SubLObject)abstract_lexicon.$sym176$STOP_WORDS);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject set_abstract_lexicon_stop_words(final SubLObject v_abstract_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, (SubLObject)abstract_lexicon.FIFTEEN_INTEGER, (SubLObject)abstract_lexicon.$sym176$STOP_WORDS);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject get_abstract_lexicon_allow_stemming(final SubLObject v_abstract_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, (SubLObject)abstract_lexicon.FOURTEEN_INTEGER, (SubLObject)abstract_lexicon.$sym177$ALLOW_STEMMING);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject set_abstract_lexicon_allow_stemming(final SubLObject v_abstract_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, (SubLObject)abstract_lexicon.FOURTEEN_INTEGER, (SubLObject)abstract_lexicon.$sym177$ALLOW_STEMMING);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject get_abstract_lexicon_active_learners(final SubLObject v_abstract_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, (SubLObject)abstract_lexicon.THIRTEEN_INTEGER, (SubLObject)abstract_lexicon.$sym178$ACTIVE_LEARNERS);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject set_abstract_lexicon_active_learners(final SubLObject v_abstract_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, (SubLObject)abstract_lexicon.THIRTEEN_INTEGER, (SubLObject)abstract_lexicon.$sym178$ACTIVE_LEARNERS);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject get_abstract_lexicon_learned(final SubLObject v_abstract_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, (SubLObject)abstract_lexicon.TWELVE_INTEGER, (SubLObject)abstract_lexicon.$sym179$LEARNED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject set_abstract_lexicon_learned(final SubLObject v_abstract_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, (SubLObject)abstract_lexicon.TWELVE_INTEGER, (SubLObject)abstract_lexicon.$sym179$LEARNED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject get_abstract_lexicon_allow_fabricationP(final SubLObject v_abstract_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, (SubLObject)abstract_lexicon.ELEVEN_INTEGER, (SubLObject)abstract_lexicon.$sym180$ALLOW_FABRICATION_);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject set_abstract_lexicon_allow_fabricationP(final SubLObject v_abstract_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, (SubLObject)abstract_lexicon.ELEVEN_INTEGER, (SubLObject)abstract_lexicon.$sym180$ALLOW_FABRICATION_);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject get_abstract_lexicon_case_sensitivity(final SubLObject v_abstract_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, (SubLObject)abstract_lexicon.TEN_INTEGER, (SubLObject)abstract_lexicon.$sym181$CASE_SENSITIVITY);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject set_abstract_lexicon_case_sensitivity(final SubLObject v_abstract_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, (SubLObject)abstract_lexicon.TEN_INTEGER, (SubLObject)abstract_lexicon.$sym181$CASE_SENSITIVITY);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject get_abstract_lexicon_ignore_cacheP(final SubLObject v_abstract_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, (SubLObject)abstract_lexicon.NINE_INTEGER, (SubLObject)abstract_lexicon.$sym182$IGNORE_CACHE_);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject set_abstract_lexicon_ignore_cacheP(final SubLObject v_abstract_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, (SubLObject)abstract_lexicon.NINE_INTEGER, (SubLObject)abstract_lexicon.$sym182$IGNORE_CACHE_);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject get_abstract_lexicon_cache(final SubLObject v_abstract_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, (SubLObject)abstract_lexicon.EIGHT_INTEGER, (SubLObject)abstract_lexicon.$sym183$CACHE);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject set_abstract_lexicon_cache(final SubLObject v_abstract_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, (SubLObject)abstract_lexicon.EIGHT_INTEGER, (SubLObject)abstract_lexicon.$sym183$CACHE);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject get_abstract_lexicon_trie(final SubLObject v_abstract_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, (SubLObject)abstract_lexicon.SEVEN_INTEGER, (SubLObject)abstract_lexicon.$sym184$TRIE);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject set_abstract_lexicon_trie(final SubLObject v_abstract_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, (SubLObject)abstract_lexicon.SEVEN_INTEGER, (SubLObject)abstract_lexicon.$sym184$TRIE);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject get_abstract_lexicon_excluded_pos_list(final SubLObject v_abstract_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, (SubLObject)abstract_lexicon.SIX_INTEGER, (SubLObject)abstract_lexicon.$sym185$EXCLUDED_POS_LIST);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject set_abstract_lexicon_excluded_pos_list(final SubLObject v_abstract_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, (SubLObject)abstract_lexicon.SIX_INTEGER, (SubLObject)abstract_lexicon.$sym185$EXCLUDED_POS_LIST);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject get_abstract_lexicon_excluded_preds(final SubLObject v_abstract_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, (SubLObject)abstract_lexicon.FIVE_INTEGER, (SubLObject)abstract_lexicon.$sym186$EXCLUDED_PREDS);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject set_abstract_lexicon_excluded_preds(final SubLObject v_abstract_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, (SubLObject)abstract_lexicon.FIVE_INTEGER, (SubLObject)abstract_lexicon.$sym186$EXCLUDED_PREDS);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject get_abstract_lexicon_root_mt(final SubLObject v_abstract_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, (SubLObject)abstract_lexicon.FOUR_INTEGER, (SubLObject)abstract_lexicon.$sym187$ROOT_MT);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject set_abstract_lexicon_root_mt(final SubLObject v_abstract_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, (SubLObject)abstract_lexicon.FOUR_INTEGER, (SubLObject)abstract_lexicon.$sym187$ROOT_MT);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject get_abstract_lexicon_base_mt(final SubLObject v_abstract_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, (SubLObject)abstract_lexicon.THREE_INTEGER, (SubLObject)abstract_lexicon.$sym188$BASE_MT);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject set_abstract_lexicon_base_mt(final SubLObject v_abstract_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, (SubLObject)abstract_lexicon.THREE_INTEGER, (SubLObject)abstract_lexicon.$sym188$BASE_MT);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject get_abstract_lexicon_excluded_mts(final SubLObject v_abstract_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, (SubLObject)abstract_lexicon.TWO_INTEGER, (SubLObject)abstract_lexicon.$sym189$EXCLUDED_MTS);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject set_abstract_lexicon_excluded_mts(final SubLObject v_abstract_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, (SubLObject)abstract_lexicon.TWO_INTEGER, (SubLObject)abstract_lexicon.$sym189$EXCLUDED_MTS);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject get_abstract_lexicon_allowed_mts(final SubLObject v_abstract_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, (SubLObject)abstract_lexicon.ONE_INTEGER, (SubLObject)abstract_lexicon.$sym190$ALLOWED_MTS);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject set_abstract_lexicon_allowed_mts(final SubLObject v_abstract_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, (SubLObject)abstract_lexicon.ONE_INTEGER, (SubLObject)abstract_lexicon.$sym190$ALLOWED_MTS);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject get_abstract_lexicon_default_kb_spec(final SubLObject v_abstract_lexicon) {
        final SubLObject v_class = (SubLObject)(v_abstract_lexicon.isSymbol() ? classes.classes_retrieve_class(v_abstract_lexicon) : ((abstract_lexicon.NIL != subloop_structures.class_p(v_abstract_lexicon)) ? v_abstract_lexicon : ((abstract_lexicon.NIL != subloop_structures.instance_p(v_abstract_lexicon)) ? subloop_structures.instance_class(v_abstract_lexicon) : abstract_lexicon.NIL)));
        if (abstract_lexicon.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)abstract_lexicon.$sym191$DEFAULT_KB_SPEC, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)abstract_lexicon.FOUR_INTEGER);
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject set_abstract_lexicon_default_kb_spec(final SubLObject v_abstract_lexicon, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_abstract_lexicon.isSymbol() ? classes.classes_retrieve_class(v_abstract_lexicon) : ((abstract_lexicon.NIL != subloop_structures.class_p(v_abstract_lexicon)) ? v_abstract_lexicon : ((abstract_lexicon.NIL != subloop_structures.instance_p(v_abstract_lexicon)) ? subloop_structures.instance_class(v_abstract_lexicon) : abstract_lexicon.NIL)));
        if (abstract_lexicon.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)abstract_lexicon.$sym191$DEFAULT_KB_SPEC, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)abstract_lexicon.FOUR_INTEGER, value);
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject get_abstract_lexicon_default_base_mt(final SubLObject v_abstract_lexicon) {
        final SubLObject v_class = (SubLObject)(v_abstract_lexicon.isSymbol() ? classes.classes_retrieve_class(v_abstract_lexicon) : ((abstract_lexicon.NIL != subloop_structures.class_p(v_abstract_lexicon)) ? v_abstract_lexicon : ((abstract_lexicon.NIL != subloop_structures.instance_p(v_abstract_lexicon)) ? subloop_structures.instance_class(v_abstract_lexicon) : abstract_lexicon.NIL)));
        if (abstract_lexicon.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)abstract_lexicon.$sym192$DEFAULT_BASE_MT, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)abstract_lexicon.THREE_INTEGER);
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject set_abstract_lexicon_default_base_mt(final SubLObject v_abstract_lexicon, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_abstract_lexicon.isSymbol() ? classes.classes_retrieve_class(v_abstract_lexicon) : ((abstract_lexicon.NIL != subloop_structures.class_p(v_abstract_lexicon)) ? v_abstract_lexicon : ((abstract_lexicon.NIL != subloop_structures.instance_p(v_abstract_lexicon)) ? subloop_structures.instance_class(v_abstract_lexicon) : abstract_lexicon.NIL)));
        if (abstract_lexicon.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)abstract_lexicon.$sym192$DEFAULT_BASE_MT, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)abstract_lexicon.THREE_INTEGER, value);
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject get_abstract_lexicon_default_exclude_predicates(final SubLObject v_abstract_lexicon) {
        final SubLObject v_class = (SubLObject)(v_abstract_lexicon.isSymbol() ? classes.classes_retrieve_class(v_abstract_lexicon) : ((abstract_lexicon.NIL != subloop_structures.class_p(v_abstract_lexicon)) ? v_abstract_lexicon : ((abstract_lexicon.NIL != subloop_structures.instance_p(v_abstract_lexicon)) ? subloop_structures.instance_class(v_abstract_lexicon) : abstract_lexicon.NIL)));
        if (abstract_lexicon.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)abstract_lexicon.$sym193$DEFAULT_EXCLUDE_PREDICATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)abstract_lexicon.TWO_INTEGER);
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject set_abstract_lexicon_default_exclude_predicates(final SubLObject v_abstract_lexicon, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_abstract_lexicon.isSymbol() ? classes.classes_retrieve_class(v_abstract_lexicon) : ((abstract_lexicon.NIL != subloop_structures.class_p(v_abstract_lexicon)) ? v_abstract_lexicon : ((abstract_lexicon.NIL != subloop_structures.instance_p(v_abstract_lexicon)) ? subloop_structures.instance_class(v_abstract_lexicon) : abstract_lexicon.NIL)));
        if (abstract_lexicon.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)abstract_lexicon.$sym193$DEFAULT_EXCLUDE_PREDICATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)abstract_lexicon.TWO_INTEGER, value);
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject get_abstract_lexicon_default_exclude_mts(final SubLObject v_abstract_lexicon) {
        final SubLObject v_class = (SubLObject)(v_abstract_lexicon.isSymbol() ? classes.classes_retrieve_class(v_abstract_lexicon) : ((abstract_lexicon.NIL != subloop_structures.class_p(v_abstract_lexicon)) ? v_abstract_lexicon : ((abstract_lexicon.NIL != subloop_structures.instance_p(v_abstract_lexicon)) ? subloop_structures.instance_class(v_abstract_lexicon) : abstract_lexicon.NIL)));
        if (abstract_lexicon.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)abstract_lexicon.$sym194$DEFAULT_EXCLUDE_MTS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)abstract_lexicon.ONE_INTEGER);
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject set_abstract_lexicon_default_exclude_mts(final SubLObject v_abstract_lexicon, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(v_abstract_lexicon.isSymbol() ? classes.classes_retrieve_class(v_abstract_lexicon) : ((abstract_lexicon.NIL != subloop_structures.class_p(v_abstract_lexicon)) ? v_abstract_lexicon : ((abstract_lexicon.NIL != subloop_structures.instance_p(v_abstract_lexicon)) ? subloop_structures.instance_class(v_abstract_lexicon) : abstract_lexicon.NIL)));
        if (abstract_lexicon.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)abstract_lexicon.$sym194$DEFAULT_EXCLUDE_MTS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)abstract_lexicon.ONE_INTEGER, value);
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject subloop_reserved_initialize_abstract_lexicon_class(final SubLObject new_instance) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym51$OBJECT, (SubLObject)abstract_lexicon.$sym57$INSTANCE_COUNT, (SubLObject)abstract_lexicon.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym194$DEFAULT_EXCLUDE_MTS, (SubLObject)abstract_lexicon.$list195);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym193$DEFAULT_EXCLUDE_PREDICATES, set.set_element_list(lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(thread)));
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym192$DEFAULT_BASE_MT, abstract_lexicon.$const196$AllGeneralEnglishValidatedLexical);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym191$DEFAULT_KB_SPEC, abstract_lexicon.$const197$AbstractLexiconSpecification);
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject subloop_reserved_initialize_abstract_lexicon_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym51$OBJECT, (SubLObject)abstract_lexicon.$sym62$ISOLATED_P, (SubLObject)abstract_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym51$OBJECT, (SubLObject)abstract_lexicon.$sym63$INSTANCE_NUMBER, (SubLObject)abstract_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym190$ALLOWED_MTS, (SubLObject)abstract_lexicon.$kw199$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym189$EXCLUDED_MTS, (SubLObject)abstract_lexicon.$kw199$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym188$BASE_MT, (SubLObject)abstract_lexicon.$kw199$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym187$ROOT_MT, (SubLObject)abstract_lexicon.$kw199$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym186$EXCLUDED_PREDS, (SubLObject)abstract_lexicon.$kw199$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym185$EXCLUDED_POS_LIST, (SubLObject)abstract_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym184$TRIE, (SubLObject)abstract_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym183$CACHE, (SubLObject)abstract_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym182$IGNORE_CACHE_, (SubLObject)abstract_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym181$CASE_SENSITIVITY, (SubLObject)abstract_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym180$ALLOW_FABRICATION_, (SubLObject)abstract_lexicon.T);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym179$LEARNED, (SubLObject)abstract_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym178$ACTIVE_LEARNERS, (SubLObject)abstract_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym177$ALLOW_STEMMING, (SubLObject)abstract_lexicon.T);
        classes.subloop_initialize_slot(new_instance, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym176$STOP_WORDS, (SubLObject)abstract_lexicon.NIL);
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
    public static SubLObject abstract_lexicon_p(final SubLObject v_abstract_lexicon) {
        return classes.subloop_instanceof_class(v_abstract_lexicon, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 26390L)
    public static SubLObject abstract_lexicon_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject learned = get_abstract_lexicon_learned(self);
        SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
        SubLObject v_cache = get_abstract_lexicon_cache(self);
        SubLObject trie = get_abstract_lexicon_trie(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym202$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                object.object_initialize_method(self);
                trie = nl_trie.get_nl_trie();
                v_cache = cache.new_cache((SubLObject)abstract_lexicon.$int203$2000, (SubLObject)abstract_lexicon.EQUAL);
                case_sensitivity = (SubLObject)abstract_lexicon.$kw204$ON;
                ensure_cyc_to_penn_map();
                methods.funcall_instance_method_with_0_args(self, (SubLObject)abstract_lexicon.$sym205$INITIALIZE_EXCLUDED_PREDS);
                methods.funcall_instance_method_with_0_args(self, (SubLObject)abstract_lexicon.$sym206$INITIALIZE_ALLOWED_MTS);
                learned = (SubLObject)abstract_lexicon.NIL;
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym202$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_learned(self, learned);
                    set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
                    set_abstract_lexicon_cache(self, v_cache);
                    set_abstract_lexicon_trie(self, trie);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym202$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 27024L)
    public static SubLObject abstract_lexicon_isolate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject v_cache = get_abstract_lexicon_cache(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym210$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                v_cache = (SubLObject)abstract_lexicon.NIL;
                object.object_isolate_method(self);
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym210$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_cache(self, v_cache);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym210$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 27166L)
    public static SubLObject abstract_lexicon_ignore_cache_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject ignore_cacheP = get_abstract_lexicon_ignore_cacheP(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym214$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                ignore_cacheP = (SubLObject)abstract_lexicon.T;
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym214$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_ignore_cacheP(self, ignore_cacheP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym214$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 27271L)
    public static SubLObject abstract_lexicon_ignore_cacheP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject ignore_cacheP = get_abstract_lexicon_ignore_cacheP(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym217$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym217$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, instances.get_slot(self, (SubLObject)abstract_lexicon.$sym182$IGNORE_CACHE_));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_ignore_cacheP(self, ignore_cacheP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym217$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 27380L)
    public static SubLObject abstract_lexicon_allow_stemming_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject allow_stemming = get_abstract_lexicon_allow_stemming(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym220$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                allow_stemming = (SubLObject)abstract_lexicon.T;
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym220$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_allow_stemming(self, allow_stemming);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym220$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 27491L)
    public static SubLObject abstract_lexicon_forbid_stemming_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject allow_stemming = get_abstract_lexicon_allow_stemming(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym224$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                allow_stemming = (SubLObject)abstract_lexicon.NIL;
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym224$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_allow_stemming(self, allow_stemming);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym224$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 27605L)
    public static SubLObject abstract_lexicon_allow_fabrication_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject allow_fabricationP = get_abstract_lexicon_allow_fabricationP(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym228$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                allow_fabricationP = (SubLObject)abstract_lexicon.T;
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym228$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_allow_fabricationP(self, allow_fabricationP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym228$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 27723L)
    public static SubLObject abstract_lexicon_forbid_fabrication_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject allow_fabricationP = get_abstract_lexicon_allow_fabricationP(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym232$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                allow_fabricationP = (SubLObject)abstract_lexicon.NIL;
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym232$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_allow_fabricationP(self, allow_fabricationP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym232$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 27844L)
    public static SubLObject abstract_lexicon_fabrication_forbiddenP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject allow_fabricationP = get_abstract_lexicon_allow_fabricationP(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym236$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym236$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, (SubLObject)SubLObjectFactory.makeBoolean(abstract_lexicon.NIL == allow_fabricationP));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_allow_fabricationP(self, allow_fabricationP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym236$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 27957L)
    public static SubLObject abstract_lexicon_fabrication_allowedP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject allow_fabricationP = get_abstract_lexicon_allow_fabricationP(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym240$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym240$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, allow_fabricationP);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_allow_fabricationP(self, allow_fabricationP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym240$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 28061L)
    public static SubLObject abstract_lexicon_valid_nl_trie_entryP_method(final SubLObject self, final SubLObject nl_trie_entry) {
        if (abstract_lexicon.NIL != methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym246$STOP_WORD_P, nl_trie.nl_trie_entry_string(nl_trie_entry))) {
            return (SubLObject)abstract_lexicon.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean((abstract_lexicon.NIL != lex_entry_p(nl_trie_entry) && abstract_lexicon.NIL != methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym247$ALLOWED_POS_, methods.funcall_instance_method_with_1_args(nl_trie_entry, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw95$CYC_POS))) || (abstract_lexicon.NIL != nl_trie.nl_trie_word_p(nl_trie_entry, (SubLObject)abstract_lexicon.UNPROVIDED) && abstract_lexicon.NIL != conses_high.member(abstract_lexicon.$const248$nameSpelling, nl_trie.nl_trie_word_pos_preds(nl_trie_entry), (SubLObject)abstract_lexicon.EQL, (SubLObject)abstract_lexicon.UNPROVIDED) && abstract_lexicon.NIL != methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym249$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_, nl_trie_entry) && abstract_lexicon.NIL != methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym250$ALLOWED_MT_, nl_trie.nl_trie_entry_semantic_mt(nl_trie_entry))) || (abstract_lexicon.NIL != valid_denotsP(nl_trie_entry) && abstract_lexicon.NIL != methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym249$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_, nl_trie_entry) && abstract_lexicon.NIL != methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym251$NL_TRIE_ENTRY_HAS_ALLOWED_POS_, nl_trie_entry) && abstract_lexicon.NIL != methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym250$ALLOWED_MT_, nl_trie.nl_trie_entry_semantic_mt(nl_trie_entry))));
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 29000L)
    public static SubLObject abstract_lexicon_set_case_sensitivity_method(final SubLObject self, final SubLObject keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym256$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                case_sensitivity = keyword;
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym256$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym256$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 29238L)
    public static SubLObject abstract_lexicon_get_case_sensitivity_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym260$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym260$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, case_sensitivity);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym260$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 29444L)
    public static SubLObject abstract_lexicon_initialize_excluded_preds_method(final SubLObject self, SubLObject preds_to_exclude) {
        if (preds_to_exclude == abstract_lexicon.UNPROVIDED) {
            preds_to_exclude = (SubLObject)abstract_lexicon.$kw264$DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject default_exclude_predicates = get_abstract_lexicon_default_exclude_predicates(self);
        SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym265$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                if (preds_to_exclude == abstract_lexicon.$kw264$DEFAULT) {
                    excluded_preds = default_exclude_predicates;
                }
                else {
                    excluded_preds = preds_to_exclude;
                }
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym265$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_default_exclude_predicates(self, default_exclude_predicates);
                    set_abstract_lexicon_excluded_preds(self, excluded_preds);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym265$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 29929L)
    public static SubLObject abstract_lexicon_allow_predicate_method(final SubLObject self, final SubLObject pos_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym270$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                excluded_preds = Sequences.remove(pos_pred, excluded_preds, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym270$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_excluded_preds(self, excluded_preds);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym270$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 30146L)
    public static SubLObject abstract_lexicon_exclude_predicate_method(final SubLObject self, final SubLObject pos_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym274$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                if (abstract_lexicon.NIL == conses_high.member(pos_pred, excluded_preds, Symbols.symbol_function((SubLObject)abstract_lexicon.EQL), Symbols.symbol_function((SubLObject)abstract_lexicon.IDENTITY))) {
                    excluded_preds = (SubLObject)ConsesLow.cons(pos_pred, excluded_preds);
                }
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym274$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_excluded_preds(self, excluded_preds);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym274$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 30350L)
    public static SubLObject abstract_lexicon_excluded_predicateP_method(final SubLObject self, final SubLObject pos_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym278$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym278$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, conses_high.member(pos_pred, excluded_preds, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_excluded_preds(self, excluded_preds);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym278$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 30546L)
    public static SubLObject abstract_lexicon_allowed_predicateP_method(final SubLObject self, final SubLObject pos_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym282$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym282$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, (SubLObject)SubLObjectFactory.makeBoolean(abstract_lexicon.NIL == subl_promotions.memberP(pos_pred, excluded_preds, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_excluded_preds(self, excluded_preds);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym282$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 30749L)
    public static SubLObject abstract_lexicon_nl_trie_entry_has_allowed_predicateP_method(final SubLObject self, final SubLObject nl_trie_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym285$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym285$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, (SubLObject)SubLObjectFactory.makeBoolean(abstract_lexicon.NIL == excluded_preds || abstract_lexicon.NIL == subl_promotions.memberP(nl_trie.nl_trie_entry_semantic_pred(nl_trie_entry, (SubLObject)abstract_lexicon.UNPROVIDED), excluded_preds, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_excluded_preds(self, excluded_preds);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym285$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 31058L)
    public static SubLObject abstract_lexicon_allow_pos_method(final SubLObject self, final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym290$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                excluded_pos_list = Sequences.remove(pos, excluded_pos_list, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym290$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym290$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 31304L)
    public static SubLObject abstract_lexicon_exclude_pos_method(final SubLObject self, final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym294$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                if (abstract_lexicon.NIL == conses_high.member(pos, excluded_pos_list, Symbols.symbol_function((SubLObject)abstract_lexicon.EQL), Symbols.symbol_function((SubLObject)abstract_lexicon.IDENTITY))) {
                    excluded_pos_list = (SubLObject)ConsesLow.cons(pos, excluded_pos_list);
                }
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym294$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym294$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 31490L)
    public static SubLObject abstract_lexicon_excluded_posP_method(final SubLObject self, final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym298$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym298$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, lexicon_accessors.genl_pos_memberP(pos, excluded_pos_list));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym298$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 31683L)
    public static SubLObject abstract_lexicon_allowed_posP_method(final SubLObject self, final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym301$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym301$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, (SubLObject)SubLObjectFactory.makeBoolean(abstract_lexicon.NIL == lexicon_accessors.genl_pos_memberP(pos, excluded_pos_list)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym301$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 31882L)
    public static SubLObject abstract_lexicon_nl_trie_entry_has_allowed_posP_method(final SubLObject self, final SubLObject nl_trie_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym304$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym304$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, (SubLObject)SubLObjectFactory.makeBoolean(abstract_lexicon.NIL == excluded_pos_list || abstract_lexicon.NIL == lexicon_accessors.genl_pos_memberP(nl_trie.nl_trie_entry_pos(nl_trie_entry), excluded_pos_list)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym304$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 32192L)
    public static SubLObject abstract_lexicon_add_learner_method(final SubLObject self, final SubLObject learner) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject active_learners = get_abstract_lexicon_active_learners(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym309$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                if (abstract_lexicon.NIL == conses_high.member(learner, active_learners, Symbols.symbol_function((SubLObject)abstract_lexicon.EQL), Symbols.symbol_function((SubLObject)abstract_lexicon.IDENTITY))) {
                    active_learners = (SubLObject)ConsesLow.cons(learner, active_learners);
                }
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym309$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_active_learners(self, active_learners);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym309$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 32370L)
    public static SubLObject abstract_lexicon_remove_learner_method(final SubLObject self, final SubLObject learner) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject active_learners = get_abstract_lexicon_active_learners(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym313$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                active_learners = Sequences.remove(learner, active_learners, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym313$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_active_learners(self, active_learners);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym313$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 32582L)
    public static SubLObject abstract_lexicon_get_learners_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject active_learners = get_abstract_lexicon_active_learners(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym317$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym317$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, active_learners);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_active_learners(self, active_learners);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym317$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 32672L)
    public static SubLObject abstract_lexicon_set_learners_method(final SubLObject self, final SubLObject learners) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject active_learners = get_abstract_lexicon_active_learners(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym322$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                active_learners = learners;
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym322$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_active_learners(self, active_learners);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym322$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 32879L)
    public static SubLObject abstract_lexicon_initialize_allowed_mts_method(final SubLObject self, SubLObject kb_spec) {
        if (kb_spec == abstract_lexicon.UNPROVIDED) {
            kb_spec = (SubLObject)abstract_lexicon.$kw264$DEFAULT;
        }
        final SubLObject default_base_mt = get_abstract_lexicon_default_base_mt(self);
        final SubLObject default_exclude_mts = get_abstract_lexicon_default_exclude_mts(self);
        SubLObject base_mt = get_abstract_lexicon_base_mt(self);
        SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
        SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
        allowed_mts = set.new_set(Symbols.symbol_function((SubLObject)abstract_lexicon.EQUAL), (SubLObject)abstract_lexicon.UNPROVIDED);
        set_abstract_lexicon_allowed_mts(self, allowed_mts);
        excluded_mts = set_utilities.construct_set_from_list(default_exclude_mts, Symbols.symbol_function((SubLObject)abstract_lexicon.EQUAL), (SubLObject)abstract_lexicon.UNPROVIDED);
        set_abstract_lexicon_excluded_mts(self, excluded_mts);
        if (abstract_lexicon.$kw264$DEFAULT != kb_spec) {
            final SubLObject base_mts = ask_utilities.query_variable((SubLObject)abstract_lexicon.$sym327$_MT, (SubLObject)ConsesLow.listS(abstract_lexicon.$const328$defaultBaseLexicalMt, kb_spec, (SubLObject)abstract_lexicon.$list329), abstract_lexicon.$const330$InferencePSC, (SubLObject)abstract_lexicon.$list331);
            final SubLObject spec_allowed_mts = ask_utilities.query_variable((SubLObject)abstract_lexicon.$sym327$_MT, (SubLObject)ConsesLow.listS(abstract_lexicon.$const332$allowedLexicalMt, kb_spec, (SubLObject)abstract_lexicon.$list329), abstract_lexicon.$const330$InferencePSC, (SubLObject)abstract_lexicon.$list331);
            final SubLObject spec_disallowed_mts = ask_utilities.query_variable((SubLObject)abstract_lexicon.$sym327$_MT, (SubLObject)ConsesLow.listS(abstract_lexicon.$const333$disallowedLexicalMt, kb_spec, (SubLObject)abstract_lexicon.$list329), abstract_lexicon.$const330$InferencePSC, (SubLObject)abstract_lexicon.$list331);
            if (abstract_lexicon.NIL != list_utilities.singletonP(base_mts)) {
                instances.set_slot(self, (SubLObject)abstract_lexicon.$sym188$BASE_MT, el_utilities.copy_expression(list_utilities.only_one(base_mts)));
            }
            else if (abstract_lexicon.NIL != list_utilities.empty_list_p(base_mts)) {
                instances.set_slot(self, (SubLObject)abstract_lexicon.$sym188$BASE_MT, el_utilities.copy_expression(instances.get_slot(self, (SubLObject)abstract_lexicon.$sym192$DEFAULT_BASE_MT)));
            }
            else {
                base_mt = el_utilities.copy_expression(hlmt_czer.canonicalize_hlmt(el_utilities.make_el_formula(abstract_lexicon.$const334$MtUnionFn, base_mts, (SubLObject)abstract_lexicon.UNPROVIDED)));
                set_abstract_lexicon_base_mt(self, base_mt);
            }
            SubLObject cdolist_list_var = spec_allowed_mts;
            SubLObject mt = (SubLObject)abstract_lexicon.NIL;
            mt = cdolist_list_var.first();
            while (abstract_lexicon.NIL != cdolist_list_var) {
                methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym335$ALLOW_MT, mt);
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            }
            cdolist_list_var = spec_disallowed_mts;
            mt = (SubLObject)abstract_lexicon.NIL;
            mt = cdolist_list_var.first();
            while (abstract_lexicon.NIL != cdolist_list_var) {
                methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym336$FORBID_MT, mt);
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            }
        }
        return self;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 34263L)
    public static SubLObject abstract_lexicon_set_base_mt_method(final SubLObject self, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject base_mt = get_abstract_lexicon_base_mt(self);
        final SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym341$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                base_mt = el_utilities.copy_expression(mt);
                final SubLObject set_contents_var = set.do_set_internal(excluded_mts);
                SubLObject basis_object;
                SubLObject state;
                SubLObject excluded_mt;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)abstract_lexicon.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); abstract_lexicon.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    excluded_mt = set_contents.do_set_contents_next(basis_object, state);
                    if (abstract_lexicon.NIL != set_contents.do_set_contents_element_validP(state, excluded_mt) && abstract_lexicon.NIL != lexicon_accessors.genl_lexicon_mtP(mt, excluded_mt)) {
                        methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym335$ALLOW_MT, excluded_mt);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym341$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_base_mt(self, base_mt);
                    set_abstract_lexicon_excluded_mts(self, excluded_mts);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym341$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 34804L)
    public static SubLObject abstract_lexicon_get_base_mt_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject default_base_mt = get_abstract_lexicon_default_base_mt(self);
        SubLObject base_mt = get_abstract_lexicon_base_mt(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym345$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                if (abstract_lexicon.NIL != misc_utilities.initialized_p(base_mt)) {
                    Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym345$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, base_mt);
                }
                base_mt = default_base_mt;
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym345$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, default_base_mt);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_default_base_mt(self, default_base_mt);
                    set_abstract_lexicon_base_mt(self, base_mt);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym345$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 34982L)
    public static SubLObject abstract_lexicon_allow_mt_method(final SubLObject self, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject root_mt = get_abstract_lexicon_root_mt(self);
        final SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
        final SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym348$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                assert abstract_lexicon.NIL != hlmt.possibly_hlmt_p(mt) : mt;
                set.set_add(mt, allowed_mts);
                set.set_remove(mt, excluded_mts);
                root_mt = (SubLObject)abstract_lexicon.$kw199$UNINITIALIZED;
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym348$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_root_mt(self, root_mt);
                    set_abstract_lexicon_excluded_mts(self, excluded_mts);
                    set_abstract_lexicon_allowed_mts(self, allowed_mts);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym348$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 35265L)
    public static SubLObject abstract_lexicon_allow_genl_mts_method(final SubLObject self, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject root_mt = get_abstract_lexicon_root_mt(self);
        final SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
        final SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym353$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                assert abstract_lexicon.NIL != hlmt.possibly_hlmt_p(mt) : mt;
                set.set_add(mt, allowed_mts);
                set.set_remove(mt, excluded_mts);
                SubLObject cdolist_list_var = ask_utilities.query_variable((SubLObject)abstract_lexicon.$sym354$_GENLMT, (SubLObject)ConsesLow.listS(abstract_lexicon.$const355$genlMt, mt, (SubLObject)abstract_lexicon.$list356), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
                SubLObject genl_mt = (SubLObject)abstract_lexicon.NIL;
                genl_mt = cdolist_list_var.first();
                while (abstract_lexicon.NIL != cdolist_list_var) {
                    set.set_add(genl_mt, allowed_mts);
                    set.set_remove(genl_mt, excluded_mts);
                    cdolist_list_var = cdolist_list_var.rest();
                    genl_mt = cdolist_list_var.first();
                }
                root_mt = (SubLObject)abstract_lexicon.$kw199$UNINITIALIZED;
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym353$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_root_mt(self, root_mt);
                    set_abstract_lexicon_excluded_mts(self, excluded_mts);
                    set_abstract_lexicon_allowed_mts(self, allowed_mts);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym353$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 35724L)
    public static SubLObject abstract_lexicon_forbid_mt_method(final SubLObject self, final SubLObject mt) {
        SubLObject root_mt = get_abstract_lexicon_root_mt(self);
        final SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
        final SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
        assert abstract_lexicon.NIL != hlmt.possibly_hlmt_p(mt) : mt;
        set.set_add(mt, excluded_mts);
        set.set_remove(mt, allowed_mts);
        root_mt = (SubLObject)abstract_lexicon.$kw199$UNINITIALIZED;
        set_abstract_lexicon_root_mt(self, root_mt);
        return self;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 36023L)
    public static SubLObject abstract_lexicon_allowed_mtP_method(final SubLObject self, final SubLObject mt) {
        final SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
        final SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
        if (abstract_lexicon.NIL == mt) {
            return (SubLObject)abstract_lexicon.NIL;
        }
        if (abstract_lexicon.NIL != set.set_memberP(mt, allowed_mts)) {
            return (SubLObject)abstract_lexicon.T;
        }
        if (abstract_lexicon.NIL != set.set_memberP(mt, excluded_mts)) {
            return (SubLObject)abstract_lexicon.NIL;
        }
        if (abstract_lexicon.NIL == hlmt.hlmt_p(methods.funcall_instance_method_with_0_args(self, (SubLObject)abstract_lexicon.$sym343$GET_BASE_MT))) {
            methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym336$FORBID_MT, mt);
            return (SubLObject)abstract_lexicon.NIL;
        }
        if (abstract_lexicon.NIL != lexicon_accessors.genl_lexicon_mtP(methods.funcall_instance_method_with_0_args(self, (SubLObject)abstract_lexicon.$sym343$GET_BASE_MT), mt)) {
            methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym335$ALLOW_MT, mt);
            return (SubLObject)abstract_lexicon.T;
        }
        methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym336$FORBID_MT, mt);
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 36704L)
    public static SubLObject abstract_lexicon_root_mt_method(final SubLObject self) {
        final SubLObject root_mt = get_abstract_lexicon_root_mt(self);
        final SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
        if (abstract_lexicon.NIL == misc_utilities.initialized_p(root_mt)) {
            final SubLObject this_allowed_mts = instances.get_slot(self, (SubLObject)abstract_lexicon.$sym190$ALLOWED_MTS);
            final SubLObject this_base_mt = methods.funcall_instance_method_with_0_args(self, (SubLObject)abstract_lexicon.$sym343$GET_BASE_MT);
            final SubLObject mts = (SubLObject)((abstract_lexicon.NIL != hlmt.possibly_hlmt_p(this_base_mt)) ? ConsesLow.cons(this_base_mt, set.set_element_list(this_allowed_mts)) : set.set_element_list(allowed_mts));
            final SubLObject min_mts = genl_mts.min_mts(mts, (SubLObject)abstract_lexicon.UNPROVIDED);
            instances.set_slot(self, (SubLObject)abstract_lexicon.$sym187$ROOT_MT, hlmt_czer.canonicalize_hlmt(el_utilities.make_el_formula(abstract_lexicon.$const334$MtUnionFn, min_mts, (SubLObject)abstract_lexicon.UNPROVIDED)));
        }
        return root_mt;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 37315L)
    public static SubLObject abstract_lexicon_add_stop_word_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject stop_words = get_abstract_lexicon_stop_words(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym368$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                SubLObject stop_word_set = stop_words;
                if (abstract_lexicon.NIL == set.set_p(stop_word_set)) {
                    stop_word_set = set.new_set((SubLObject)abstract_lexicon.EQUAL, (SubLObject)abstract_lexicon.UNPROVIDED);
                }
                set.set_add(string, stop_word_set);
                stop_words = stop_word_set;
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym368$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, stop_words);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_stop_words(self, stop_words);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym368$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 37603L)
    public static SubLObject abstract_lexicon_stop_word_p_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject stop_words = get_abstract_lexicon_stop_words(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym371$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym371$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, (SubLObject)SubLObjectFactory.makeBoolean(abstract_lexicon.NIL != stop_words && abstract_lexicon.NIL != list_utilities.sublisp_boolean(set.set_memberP(string, stop_words))));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_stop_words(self, stop_words);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym371$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 37751L)
    public static SubLObject abstract_lexicon_get_stop_words_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject stop_words = get_abstract_lexicon_stop_words(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym375$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                if (abstract_lexicon.NIL == set.set_p(stop_words)) {
                    stop_words = set.new_set((SubLObject)abstract_lexicon.EQUAL, (SubLObject)abstract_lexicon.UNPROVIDED);
                }
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym375$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, stop_words);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_stop_words(self, stop_words);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym375$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 37916L)
    public static SubLObject abstract_lexicon_copy_method(final SubLObject self, SubLObject target) {
        if (target == abstract_lexicon.UNPROVIDED) {
            target = (SubLObject)abstract_lexicon.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject active_learners = get_abstract_lexicon_active_learners(self);
        final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
        final SubLObject ignore_cacheP = get_abstract_lexicon_ignore_cacheP(self);
        final SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
        final SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
        final SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
        final SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym379$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                if (abstract_lexicon.NIL != target && !abstract_lexicon.assertionsDisabledInClass && abstract_lexicon.NIL == abstract_lexicon_p(target)) {
                    throw new AssertionError(target);
                }
                if (abstract_lexicon.NIL == target) {
                    target = methods.funcall_instance_method_with_0_args(self, (SubLObject)abstract_lexicon.$sym381$CLONE);
                    Errors.warn((SubLObject)abstract_lexicon.$str382$Cloned_instance___S, target);
                }
                SubLObject cdolist_list_var = (SubLObject)abstract_lexicon.$list383;
                SubLObject slot = (SubLObject)abstract_lexicon.NIL;
                slot = cdolist_list_var.first();
                while (abstract_lexicon.NIL != cdolist_list_var) {
                    final SubLObject value = instances.get_slot(self, slot);
                    if (value.isList()) {
                        instances.set_slot(target, slot, conses_high.copy_list(value));
                    }
                    else {
                        instances.set_slot(target, slot, value);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    slot = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym379$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, target);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_active_learners(self, active_learners);
                    set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
                    set_abstract_lexicon_ignore_cacheP(self, ignore_cacheP);
                    set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
                    set_abstract_lexicon_excluded_preds(self, excluded_preds);
                    set_abstract_lexicon_excluded_mts(self, excluded_mts);
                    set_abstract_lexicon_allowed_mts(self, allowed_mts);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym379$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 38597L)
    public static SubLObject abstract_lexicon_get_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
        final SubLObject ignore_cacheP = get_abstract_lexicon_ignore_cacheP(self);
        final SubLObject v_cache = get_abstract_lexicon_cache(self);
        final SubLObject trie = get_abstract_lexicon_trie(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym386$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                assert abstract_lexicon.NIL != cycl_string.cycl_string_p(string) : string;
                if (abstract_lexicon.NIL != methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym246$STOP_WORD_P, string)) {
                    Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym386$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, (SubLObject)abstract_lexicon.NIL);
                }
                if (abstract_lexicon.NIL == ignore_cacheP) {
                    thread.resetMultipleValues();
                    final SubLObject lex_entries = cache.cache_get(v_cache, string);
                    final SubLObject existsP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (abstract_lexicon.NIL != existsP) {
                        Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym386$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, lex_entries);
                    }
                }
                SubLObject lex_entries = methods.funcall_instance_method_with_2_args(self, (SubLObject)abstract_lexicon.$sym388$CREATE_LEX_ENTRIES, string, (SubLObject)abstract_lexicon.NIL);
                final SubLObject nl_trie_entries = nl_trie.nl_trie_search(string, trie, case_sensitivity);
                lex_entries = add_lex_entries_for_trie_entries(nl_trie_entries, string, self, lex_entries);
                if (abstract_lexicon.NIL == lex_entries && case_sensitivity == abstract_lexicon.$kw389$PREFERRED) {
                    final SubLObject nl_trie_entries_$10 = nl_trie.nl_trie_search(string, trie, (SubLObject)abstract_lexicon.$kw390$OFF);
                    lex_entries = add_lex_entries_for_trie_entries(nl_trie_entries_$10, string, self, lex_entries);
                }
                if (abstract_lexicon.NIL == ignore_cacheP) {
                    cache.cache_set(v_cache, string, lex_entries);
                }
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym386$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, lex_entries);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
                    set_abstract_lexicon_ignore_cacheP(self, ignore_cacheP);
                    set_abstract_lexicon_cache(self, v_cache);
                    set_abstract_lexicon_trie(self, trie);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym386$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 39591L)
    public static SubLObject add_lex_entries_for_trie_entries(final SubLObject trie_entries, final SubLObject string, final SubLObject lexicon, SubLObject lex_entries) {
        SubLObject cdolist_list_var = trie_entries;
        SubLObject nl_trie_entry = (SubLObject)abstract_lexicon.NIL;
        nl_trie_entry = cdolist_list_var.first();
        while (abstract_lexicon.NIL != cdolist_list_var) {
            if (abstract_lexicon.NIL != methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)abstract_lexicon.$sym242$VALID_NL_TRIE_ENTRY_, nl_trie_entry)) {
                SubLObject cdolist_list_var_$11;
                final SubLObject lex_entries2 = cdolist_list_var_$11 = methods.funcall_instance_method_with_2_args(lexicon, (SubLObject)abstract_lexicon.$sym388$CREATE_LEX_ENTRIES, string, nl_trie_entry);
                SubLObject lex_entry = (SubLObject)abstract_lexicon.NIL;
                lex_entry = cdolist_list_var_$11.first();
                while (abstract_lexicon.NIL != cdolist_list_var_$11) {
                    final SubLObject item_var = lex_entry;
                    if (abstract_lexicon.NIL == conses_high.member(item_var, lex_entries, (SubLObject)abstract_lexicon.$sym392$LEX_ENTRY_EQUAL_P, Symbols.symbol_function((SubLObject)abstract_lexicon.IDENTITY))) {
                        lex_entries = (SubLObject)ConsesLow.cons(item_var, lex_entries);
                    }
                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                    lex_entry = cdolist_list_var_$11.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            nl_trie_entry = cdolist_list_var.first();
        }
        return lex_entries;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 39984L)
    public static SubLObject lex_entry_equal_p(final SubLObject lex1, final SubLObject lex2) {
        SubLObject equalP;
        SubLObject properties2;
        SubLObject keyXvalue1;
        SubLObject properties3;
        for (equalP = (SubLObject)abstract_lexicon.T, properties2 = get_lex_entry_properties(lex2), keyXvalue1 = (SubLObject)abstract_lexicon.NIL, properties3 = (SubLObject)abstract_lexicon.NIL, keyXvalue1 = get_lex_entry_properties(lex1).first(), properties3 = get_lex_entry_properties(lex1).rest(); abstract_lexicon.NIL != keyXvalue1 && abstract_lexicon.NIL != equalP; equalP = (SubLObject)SubLObjectFactory.makeBoolean(abstract_lexicon.NIL != equalP && abstract_lexicon.NIL != conses_high.member(keyXvalue1, properties2, (SubLObject)abstract_lexicon.EQUAL, (SubLObject)abstract_lexicon.UNPROVIDED)), keyXvalue1 = properties3.first(), properties3 = properties3.rest()) {}
        return equalP;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 40452L)
    public static SubLObject abstract_lexicon_delete_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject v_cache = get_abstract_lexicon_cache(self);
        final SubLObject trie = get_abstract_lexicon_trie(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym395$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                assert abstract_lexicon.NIL != cycl_string.cycl_string_p(string) : string;
                SubLObject cdolist_list_var;
                final SubLObject trie_entries = cdolist_list_var = nl_trie.nl_trie_search(string, trie, methods.funcall_instance_method_with_0_args(self, (SubLObject)abstract_lexicon.$sym258$GET_CASE_SENSITIVITY));
                SubLObject trie_entry = (SubLObject)abstract_lexicon.NIL;
                trie_entry = cdolist_list_var.first();
                while (abstract_lexicon.NIL != cdolist_list_var) {
                    if (abstract_lexicon.NIL != lex_entry_p(trie_entry)) {
                        SubLObject cdolist_list_var_$12 = nl_trie.nl_trie_entry_keys(trie_entry, (SubLObject)abstract_lexicon.UNPROVIDED);
                        SubLObject trie_key = (SubLObject)abstract_lexicon.NIL;
                        trie_key = cdolist_list_var_$12.first();
                        while (abstract_lexicon.NIL != cdolist_list_var_$12) {
                            nl_trie.nl_trie_delete_entry(trie, trie_key, trie_entry);
                            cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                            trie_key = cdolist_list_var_$12.first();
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    trie_entry = cdolist_list_var.first();
                }
                cache.cache_remove(v_cache, string);
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym395$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_cache(self, v_cache);
                    set_abstract_lexicon_trie(self, trie);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym395$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 40979L)
    public static SubLObject abstract_lexicon_delete_entry_from_string_method(final SubLObject self, final SubLObject lex_entry, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject v_cache = get_abstract_lexicon_cache(self);
        final SubLObject trie = get_abstract_lexicon_trie(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym400$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                assert abstract_lexicon.NIL != Types.stringp(string) : string;
                assert abstract_lexicon.NIL != lex_entry_p(lex_entry) : lex_entry;
                final SubLObject trie_key = nl_trie.nl_trie_string_tokenize(string);
                nl_trie.nl_trie_delete_entry(trie, trie_key, lex_entry);
                final SubLObject cache_entries = Sequences.remove(lex_entry, cache.cache_get(v_cache, string), (SubLObject)abstract_lexicon.EQUAL, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
                cache.cache_set(v_cache, string, cache_entries);
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym400$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_cache(self, v_cache);
                    set_abstract_lexicon_trie(self, trie);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym400$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 41511L)
    public static SubLObject delete_nl_trie_lex_entries_for_string(final SubLObject string) {
        final SubLObject all_entries = nl_trie.nl_trie_search(string, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject lex_entries = cdolist_list_var = list_utilities.remove_if_not((SubLObject)abstract_lexicon.$sym403$NL_TRIE_LEX_ENTRY_P, all_entries, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
        SubLObject entry = (SubLObject)abstract_lexicon.NIL;
        entry = cdolist_list_var.first();
        while (abstract_lexicon.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$13 = nl_trie.nl_trie_entry_keys(entry, (SubLObject)abstract_lexicon.UNPROVIDED);
            SubLObject key = (SubLObject)abstract_lexicon.NIL;
            key = cdolist_list_var_$13.first();
            while (abstract_lexicon.NIL != cdolist_list_var_$13) {
                nl_trie.nl_trie_delete_entry(nl_trie.get_nl_trie(), key, entry);
                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                key = cdolist_list_var_$13.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return lex_entries;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 41902L)
    public static SubLObject abstract_lexicon_add_method(final SubLObject self, final SubLObject lex_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject learned = get_abstract_lexicon_learned(self);
        final SubLObject v_cache = get_abstract_lexicon_cache(self);
        final SubLObject trie = get_abstract_lexicon_trie(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym407$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                assert abstract_lexicon.NIL != lex_entry_p(lex_entry) : lex_entry;
                final SubLObject string = methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw34$STRING);
                SubLObject result = (SubLObject)abstract_lexicon.NIL;
                if (abstract_lexicon.NIL == string_utilities.char_position(strie.$strie_null_key$.getGlobalValue(), string, (SubLObject)abstract_lexicon.UNPROVIDED)) {
                    learned = (SubLObject)ConsesLow.cons(lex_entry, learned);
                    result = nl_trie.nl_trie_insert_entry(trie, nl_trie.nl_trie_string_tokenize(string), lex_entry2nl_trie_entry(lex_entry));
                    cache.cache_remove(v_cache, string);
                    Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym407$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, result);
                }
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym407$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, (SubLObject)abstract_lexicon.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_learned(self, learned);
                    set_abstract_lexicon_cache(self, v_cache);
                    set_abstract_lexicon_trie(self, trie);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym407$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 42457L)
    public static SubLObject abstract_lexicon_learnedP_method(final SubLObject self, final SubLObject lex_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject learned = get_abstract_lexicon_learned(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym411$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym411$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, subl_promotions.memberP(lex_entry, learned, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_learned(self, learned);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym411$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 42627L)
    public static SubLObject abstract_lexicon_forget_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        SubLObject learned = get_abstract_lexicon_learned(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym415$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                final SubLObject deleted = learned;
                SubLObject cdolist_list_var = learned;
                SubLObject lex = (SubLObject)abstract_lexicon.NIL;
                lex = cdolist_list_var.first();
                while (abstract_lexicon.NIL != cdolist_list_var) {
                    methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym393$DELETE, methods.funcall_instance_method_with_1_args(lex, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw34$STRING));
                    cdolist_list_var = cdolist_list_var.rest();
                    lex = cdolist_list_var.first();
                }
                learned = (SubLObject)abstract_lexicon.NIL;
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym415$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, deleted);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_learned(self, learned);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym415$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 42899L)
    public static SubLObject valid_prefixes(final SubLObject prefixes, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)abstract_lexicon.NIL;
        SubLObject cdolist_list_var = prefixes;
        SubLObject prefixXentries = (SubLObject)abstract_lexicon.NIL;
        prefixXentries = cdolist_list_var.first();
        while (abstract_lexicon.NIL != cdolist_list_var) {
            final SubLObject prefix = prefixXentries.first();
            final SubLObject string = string_utilities.bunge(prefix, (SubLObject)abstract_lexicon.UNPROVIDED);
            final SubLObject entries = prefixXentries.rest();
            final SubLObject ignore_cacheP = methods.funcall_instance_method_with_0_args(lexicon, (SubLObject)abstract_lexicon.$sym182$IGNORE_CACHE_);
            final SubLObject v_cache = instances.get_slot(lexicon, (SubLObject)abstract_lexicon.$sym183$CACHE);
            SubLObject lexes = (SubLObject)abstract_lexicon.NIL;
            SubLObject existsP = (SubLObject)abstract_lexicon.NIL;
            if (abstract_lexicon.NIL == ignore_cacheP) {
                thread.resetMultipleValues();
                final SubLObject lexes_$14 = cache.cache_get(v_cache, string);
                final SubLObject existsP_$15 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                lexes = lexes_$14;
                existsP = existsP_$15;
            }
            if (abstract_lexicon.NIL == existsP) {
                SubLObject cdolist_list_var_$16 = entries;
                SubLObject entry = (SubLObject)abstract_lexicon.NIL;
                entry = cdolist_list_var_$16.first();
                while (abstract_lexicon.NIL != cdolist_list_var_$16) {
                    if (abstract_lexicon.NIL != methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)abstract_lexicon.$sym242$VALID_NL_TRIE_ENTRY_, entry)) {
                        SubLObject cdolist_list_var_$17 = methods.funcall_instance_method_with_2_args(lexicon, (SubLObject)abstract_lexicon.$sym388$CREATE_LEX_ENTRIES, string, entry);
                        SubLObject lex = (SubLObject)abstract_lexicon.NIL;
                        lex = cdolist_list_var_$17.first();
                        while (abstract_lexicon.NIL != cdolist_list_var_$17) {
                            lexes = (SubLObject)ConsesLow.cons(lex, lexes);
                            cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                            lex = cdolist_list_var_$17.first();
                        }
                    }
                    cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                    entry = cdolist_list_var_$16.first();
                }
                if (abstract_lexicon.NIL == ignore_cacheP) {
                    cache.cache_set(v_cache, string, lexes);
                }
            }
            SubLObject cdolist_list_var_$18 = lexes;
            SubLObject lex2 = (SubLObject)abstract_lexicon.NIL;
            lex2 = cdolist_list_var_$18.first();
            while (abstract_lexicon.NIL != cdolist_list_var_$18) {
                results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(prefix, lex2), results);
                cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                lex2 = cdolist_list_var_$18.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            prefixXentries = cdolist_list_var.first();
        }
        return Sequences.nreverse(results);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 43806L)
    public static SubLObject abstract_lexicon_prefixes_method(final SubLObject self, final SubLObject strings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
        final SubLObject trie = get_abstract_lexicon_trie(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym420$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                assert abstract_lexicon.NIL != Types.listp(strings) : strings;
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym420$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, valid_prefixes(nl_trie_accessors.nl_trie_prefixes(trie, strings, case_sensitivity), self));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
                    set_abstract_lexicon_trie(self, trie);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym420$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 44178L)
    public static SubLObject abstract_lexicon_prefixes_from_string_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
        final SubLObject trie = get_abstract_lexicon_trie(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym425$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                assert abstract_lexicon.NIL != Types.stringp(string) : string;
                final SubLObject prefix_keys = nl_trie_accessors.nl_trie_prefix_keys_from_string(trie, string, case_sensitivity);
                final SubLObject nl_trie_entry = conses_high.second(prefix_keys.first());
                final SubLObject prefix_string = nl_trie.nl_trie_entry_string(nl_trie_entry);
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym425$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, (SubLObject)ConsesLow.list(valid_prefixes(prefix_keys, self), prefix_string));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
                    set_abstract_lexicon_trie(self, trie);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym425$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 44738L)
    public static SubLObject valid_prefix_keys(final SubLObject prefixes, final SubLObject lexicon, final SubLObject case_sensitivity) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject strings = (SubLObject)abstract_lexicon.NIL;
        SubLObject cdolist_list_var = prefixes;
        SubLObject prefixXentries = (SubLObject)abstract_lexicon.NIL;
        prefixXentries = cdolist_list_var.first();
        while (abstract_lexicon.NIL != cdolist_list_var) {
            final SubLObject prefix = prefixXentries.first();
            final SubLObject string = string_utilities.bunge(prefix, (SubLObject)abstract_lexicon.UNPROVIDED);
            final SubLObject equality = lexicon_equality_from_case_sensitivity(case_sensitivity);
            final SubLObject entries = prefixXentries.rest();
            final SubLObject v_cache = instances.get_slot(lexicon, (SubLObject)abstract_lexicon.$sym183$CACHE);
            SubLObject lexes = (SubLObject)abstract_lexicon.NIL;
            SubLObject existsP = (SubLObject)abstract_lexicon.NIL;
            if (abstract_lexicon.NIL == methods.funcall_instance_method_with_0_args(lexicon, (SubLObject)abstract_lexicon.$sym182$IGNORE_CACHE_)) {
                thread.resetMultipleValues();
                final SubLObject lexes_$19 = cache.cache_get(v_cache, string);
                final SubLObject existsP_$20 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                lexes = lexes_$19;
                existsP = existsP_$20;
            }
            if (abstract_lexicon.NIL != existsP) {
                final SubLObject item_var = prefix;
                if (abstract_lexicon.NIL == conses_high.member(item_var, strings, equality, Symbols.symbol_function((SubLObject)abstract_lexicon.IDENTITY))) {
                    strings = (SubLObject)ConsesLow.cons(item_var, strings);
                }
            }
            else {
                SubLObject cdolist_list_var_$21 = entries;
                SubLObject entry = (SubLObject)abstract_lexicon.NIL;
                entry = cdolist_list_var_$21.first();
                while (abstract_lexicon.NIL != cdolist_list_var_$21) {
                    if (abstract_lexicon.NIL != methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)abstract_lexicon.$sym242$VALID_NL_TRIE_ENTRY_, entry)) {
                        final SubLObject item_var2 = prefix;
                        if (abstract_lexicon.NIL == conses_high.member(item_var2, strings, equality, Symbols.symbol_function((SubLObject)abstract_lexicon.IDENTITY))) {
                            strings = (SubLObject)ConsesLow.cons(item_var2, strings);
                        }
                    }
                    cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                    entry = cdolist_list_var_$21.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            prefixXentries = cdolist_list_var.first();
        }
        return Sequences.nreverse(strings);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 45544L)
    public static SubLObject lexicon_equality_from_case_sensitivity(final SubLObject case_sensitivity) {
        if (case_sensitivity.isFunction()) {
            return case_sensitivity;
        }
        if (case_sensitivity.isKeyword()) {
            if (case_sensitivity.eql((SubLObject)abstract_lexicon.$kw204$ON)) {
                return Symbols.symbol_function((SubLObject)abstract_lexicon.EQUAL);
            }
            if (case_sensitivity.eql((SubLObject)abstract_lexicon.$kw390$OFF)) {
                return Symbols.symbol_function((SubLObject)abstract_lexicon.EQUALP);
            }
            if (case_sensitivity.eql((SubLObject)abstract_lexicon.$kw427$FALLBACK)) {
                return Symbols.symbol_function((SubLObject)abstract_lexicon.EQUALP);
            }
        }
        else {
            Errors.error((SubLObject)abstract_lexicon.$str428$Don_t_recognize_lexicon_case_sens, case_sensitivity);
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 45961L)
    public static SubLObject abstract_lexicon_prefix_keys_method(final SubLObject self, final SubLObject strings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
        final SubLObject trie = get_abstract_lexicon_trie(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym431$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                assert abstract_lexicon.NIL != Types.listp(strings) : strings;
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym431$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, valid_prefix_keys(nl_trie_accessors.nl_trie_prefixes(trie, strings, case_sensitivity), self, case_sensitivity));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
                    set_abstract_lexicon_trie(self, trie);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym431$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 46278L)
    public static SubLObject abstract_lexicon_prefix_keys_from_string_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
        final SubLObject trie = get_abstract_lexicon_trie(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym435$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                assert abstract_lexicon.NIL != Types.stringp(string) : string;
                final SubLObject my_prefix_keys = nl_trie_accessors.nl_trie_prefix_keys_from_string(trie, string, case_sensitivity);
                final SubLObject nl_trie_entry = conses_high.second(my_prefix_keys.first());
                final SubLObject prefix_string = nl_trie.nl_trie_entry_string(nl_trie_entry);
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym435$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, (SubLObject)ConsesLow.list(valid_prefix_keys(my_prefix_keys, self, case_sensitivity), prefix_string));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
                    set_abstract_lexicon_trie(self, trie);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym435$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 46792L)
    public static SubLObject abstract_lexicon_learn_method(final SubLObject self, final SubLObject text, SubLObject learners) {
        if (learners == abstract_lexicon.UNPROVIDED) {
            learners = (SubLObject)abstract_lexicon.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject active_learners = get_abstract_lexicon_active_learners(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym440$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                assert abstract_lexicon.NIL != Types.stringp(text) : text;
                if (abstract_lexicon.NIL == learners) {
                    learners = active_learners;
                }
                SubLObject learned_here = (SubLObject)abstract_lexicon.NIL;
                SubLObject cdolist_list_var = learners;
                SubLObject learner = (SubLObject)abstract_lexicon.NIL;
                learner = cdolist_list_var.first();
                while (abstract_lexicon.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$22 = methods.funcall_instance_method_with_1_args(self, learner, text);
                    SubLObject lex = (SubLObject)abstract_lexicon.NIL;
                    lex = cdolist_list_var_$22.first();
                    while (abstract_lexicon.NIL != cdolist_list_var_$22) {
                        learned_here = (SubLObject)ConsesLow.cons(lex, learned_here);
                        cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                        lex = cdolist_list_var_$22.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    learner = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym440$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, learned_here);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_active_learners(self, active_learners);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym440$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 47504L)
    public static SubLObject abstract_lexicon_number_learn_method(final SubLObject self, final SubLObject text) {
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 47605L)
    public static SubLObject number_meanings(final SubLObject text) {
        SubLObject result = (SubLObject)abstract_lexicon.NIL;
        SubLObject cdolist_list_var;
        final SubLObject number_strings = cdolist_list_var = text_numbers(text);
        SubLObject number_string = (SubLObject)abstract_lexicon.NIL;
        number_string = cdolist_list_var.first();
        while (abstract_lexicon.NIL != cdolist_list_var) {
            final SubLObject number_meaning = numeral_parser.string_to_interval(number_string);
            if (abstract_lexicon.NIL != number_meaning) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(number_string, number_meaning), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            number_string = cdolist_list_var.first();
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 48071L)
    public static SubLObject text_numbers(final SubLObject text) {
        final SubLObject sentence = document.new_sentence(text, (SubLObject)abstract_lexicon.UNPROVIDED);
        SubLObject result = (SubLObject)abstract_lexicon.NIL;
        pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), sentence);
        SubLObject current_word_indices = (SubLObject)abstract_lexicon.NIL;
        SubLObject word_index = (SubLObject)abstract_lexicon.ZERO_INTEGER;
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
        SubLObject word = (SubLObject)abstract_lexicon.NIL;
        word = cdolist_list_var.first();
        while (abstract_lexicon.NIL != cdolist_list_var) {
            if (document.word_category(word) == abstract_lexicon.$kw446$CD && abstract_lexicon.NIL != string_utilities.partially_numeric_stringP(document.word_string(word)) && word_index.numG((SubLObject)abstract_lexicon.ZERO_INTEGER) && abstract_lexicon.NIL != list_utilities.lengthG(current_word_indices, (SubLObject)abstract_lexicon.ZERO_INTEGER, (SubLObject)abstract_lexicon.UNPROVIDED) && !document.word_string(document.sentence_get(sentence, Numbers.subtract(word_index, (SubLObject)abstract_lexicon.ONE_INTEGER))).equal((SubLObject)abstract_lexicon.$str447$_)) {
                result = (SubLObject)ConsesLow.cons(document.sentence_reconstruct_substring(conses_high.last(current_word_indices, (SubLObject)abstract_lexicon.UNPROVIDED).first(), number_utilities.f_1X(current_word_indices.first()), sentence), result);
                current_word_indices = (SubLObject)ConsesLow.list(word_index);
            }
            else if (document.word_category(word) == abstract_lexicon.$kw446$CD) {
                current_word_indices = (SubLObject)ConsesLow.cons(word_index, current_word_indices);
            }
            else if (abstract_lexicon.NIL != current_word_indices) {
                result = (SubLObject)ConsesLow.cons(document.sentence_reconstruct_substring(conses_high.last(current_word_indices, (SubLObject)abstract_lexicon.UNPROVIDED).first(), number_utilities.f_1X(current_word_indices.first()), sentence), result);
                current_word_indices = (SubLObject)abstract_lexicon.NIL;
            }
            word_index = Numbers.add(word_index, (SubLObject)abstract_lexicon.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        if (abstract_lexicon.NIL != current_word_indices) {
            result = (SubLObject)ConsesLow.cons(document.sentence_reconstruct_substring(conses_high.last(current_word_indices, (SubLObject)abstract_lexicon.UNPROVIDED).first(), number_utilities.f_1X(current_word_indices.first()), sentence), result);
        }
        return Sequences.nreverse(result);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 49374L)
    public static SubLObject scalar_interval_meanings(final SubLObject text) {
        SubLObject result = (SubLObject)abstract_lexicon.NIL;
        SubLObject cdolist_list_var;
        final SubLObject scalar_strings = cdolist_list_var = text_scalar_intervals(text);
        SubLObject scalar_string_set = (SubLObject)abstract_lexicon.NIL;
        scalar_string_set = cdolist_list_var.first();
        while (abstract_lexicon.NIL != cdolist_list_var) {
            SubLObject doneP = (SubLObject)abstract_lexicon.NIL;
            if (abstract_lexicon.NIL == doneP) {
                SubLObject csome_list_var = scalar_string_set;
                SubLObject scalar_string = (SubLObject)abstract_lexicon.NIL;
                scalar_string = csome_list_var.first();
                while (abstract_lexicon.NIL == doneP && abstract_lexicon.NIL != csome_list_var) {
                    SubLObject cdolist_list_var_$23 = parsing_utilities.parse_dates_and_numbers(scalar_string, (SubLObject)ConsesLow.list(abstract_lexicon.$const448$ScalarInterval), (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
                    SubLObject scalar_meaning = (SubLObject)abstract_lexicon.NIL;
                    scalar_meaning = cdolist_list_var_$23.first();
                    while (abstract_lexicon.NIL != cdolist_list_var_$23) {
                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(scalar_string, scalar_meaning), result);
                        doneP = (SubLObject)abstract_lexicon.T;
                        cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                        scalar_meaning = cdolist_list_var_$23.first();
                    }
                    csome_list_var = csome_list_var.rest();
                    scalar_string = csome_list_var.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            scalar_string_set = cdolist_list_var.first();
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 49970L)
    public static SubLObject text_scalar_intervals(final SubLObject text) {
        final SubLObject sentence = document.new_sentence(text, (SubLObject)abstract_lexicon.$sym449$RKF_STANDARD_STRING_WORDIFY);
        SubLObject result = (SubLObject)abstract_lexicon.NIL;
        pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), sentence);
        final SubLObject word_vector = document.sentence_yield(sentence);
        SubLObject current_word_index = (SubLObject)abstract_lexicon.ZERO_INTEGER;
        SubLObject current_words = (SubLObject)abstract_lexicon.NIL;
        while (current_word_index.numL(Sequences.length(word_vector))) {
            final SubLObject current_word = Vectors.aref(word_vector, current_word_index);
            SubLObject scalar_word_count = (SubLObject)abstract_lexicon.NIL;
            if (document.word_string(current_word).equal((SubLObject)abstract_lexicon.$str447$_) || document.word_category(current_word) == abstract_lexicon.$kw446$CD || (abstract_lexicon.NIL != string_utilities.starts_with(document.word_string(current_word), (SubLObject)abstract_lexicon.$str450$_) && abstract_lexicon.NIL != number_utilities.number_string_p(document.word_string(current_word)))) {
                current_words = (SubLObject)ConsesLow.cons(current_word, current_words);
                current_word_index = Numbers.add(current_word_index, (SubLObject)abstract_lexicon.ONE_INTEGER);
            }
            else if (abstract_lexicon.NIL != scalar_prefix(word_vector, current_word_index)) {
                SubLObject n;
                for (scalar_word_count = scalar_prefix(word_vector, current_word_index), n = (SubLObject)abstract_lexicon.NIL, n = (SubLObject)abstract_lexicon.ZERO_INTEGER; n.numL(scalar_word_count); n = Numbers.add(n, (SubLObject)abstract_lexicon.ONE_INTEGER)) {
                    current_words = (SubLObject)ConsesLow.cons(Vectors.aref(word_vector, current_word_index), current_words);
                    current_word_index = Numbers.add(current_word_index, (SubLObject)abstract_lexicon.ONE_INTEGER);
                }
            }
            else if (abstract_lexicon.NIL != current_words) {
                result = (SubLObject)ConsesLow.cons(prefix_strings_from_words(Sequences.nreverse(current_words)), result);
                current_words = (SubLObject)abstract_lexicon.NIL;
                current_word_index = Numbers.add(current_word_index, (SubLObject)abstract_lexicon.ONE_INTEGER);
            }
            else {
                current_word_index = Numbers.add(current_word_index, (SubLObject)abstract_lexicon.ONE_INTEGER);
            }
        }
        if (abstract_lexicon.NIL != current_words) {
            result = (SubLObject)ConsesLow.cons(prefix_strings_from_words(Sequences.nreverse(current_words)), result);
        }
        return Sequences.nreverse(result);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 51408L)
    public static SubLObject scalar_prefix(final SubLObject word_vector, final SubLObject start_index) {
        final SubLObject words = vector_utilities.vector_elements(word_vector, start_index);
        final SubLObject strings = Mapping.mapcar((SubLObject)abstract_lexicon.$sym451$WORD_STRING, words);
        SubLObject cdolist_list_var;
        final SubLObject prefix_records = cdolist_list_var = nl_trie_accessors.nl_trie_prefixes(nl_trie.get_nl_trie(), strings, (SubLObject)abstract_lexicon.UNPROVIDED);
        SubLObject record = (SubLObject)abstract_lexicon.NIL;
        record = cdolist_list_var.first();
        while (abstract_lexicon.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$24 = nl_trie.nl_trie_record_entries(record);
            SubLObject trie_entry = (SubLObject)abstract_lexicon.NIL;
            trie_entry = cdolist_list_var_$24.first();
            while (abstract_lexicon.NIL != cdolist_list_var_$24) {
                if (abstract_lexicon.NIL != Sequences.find_if((SubLObject)abstract_lexicon.$sym452$SCALAR_FUNCTION_, nl_trie.nl_trie_entry_denots(trie_entry), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED)) {
                    return Sequences.length(nl_trie.nl_trie_record_key(record));
                }
                cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                trie_entry = cdolist_list_var_$24.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            record = cdolist_list_var.first();
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 51984L)
    public static SubLObject prefix_strings_from_words(final SubLObject word_list) {
        SubLObject prefix_strings = (SubLObject)abstract_lexicon.NIL;
        SubLObject cdotimes_end_var;
        SubLObject n;
        for (cdotimes_end_var = Sequences.length(word_list), n = (SubLObject)abstract_lexicon.NIL, n = (SubLObject)abstract_lexicon.ZERO_INTEGER; n.numL(cdotimes_end_var); n = Numbers.add(n, (SubLObject)abstract_lexicon.ONE_INTEGER)) {
            prefix_strings = (SubLObject)ConsesLow.cons(combine_words_into_string(Sequences.subseq(word_list, (SubLObject)abstract_lexicon.ZERO_INTEGER, number_utilities.f_1X(n))), prefix_strings);
        }
        return prefix_strings;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 52274L)
    public static SubLObject combine_words_into_string(final SubLObject words) {
        SubLObject combined_word_string = document.word_string(words.first());
        SubLObject end_of_last_word = Numbers.add(document.word_offset(words.first()), document.word_length(words.first()));
        SubLObject cdolist_list_var = words.rest();
        SubLObject word = (SubLObject)abstract_lexicon.NIL;
        word = cdolist_list_var.first();
        while (abstract_lexicon.NIL != cdolist_list_var) {
            combined_word_string = Sequences.cconcatenate(combined_word_string, new SubLObject[] { spaces(Numbers.subtract(document.word_offset(word), end_of_last_word)), document.word_string(word) });
            end_of_last_word = Numbers.add(document.word_offset(word), document.word_length(word));
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return combined_word_string;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 52770L)
    public static SubLObject spaces(final SubLObject n) {
        return Strings.make_string(n, (SubLObject)Characters.CHAR_space);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 52832L)
    public static SubLObject clear_scalar_functionP() {
        final SubLObject cs = abstract_lexicon.$scalar_functionP_caching_state$.getGlobalValue();
        if (abstract_lexicon.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 52832L)
    public static SubLObject remove_scalar_functionP(final SubLObject v_term, SubLObject mt) {
        if (mt == abstract_lexicon.UNPROVIDED) {
            mt = abstract_lexicon.$const330$InferencePSC;
        }
        return memoization_state.caching_state_remove_function_results_with_args(abstract_lexicon.$scalar_functionP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term, mt), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 52832L)
    public static SubLObject scalar_functionP_internal(final SubLObject v_term, final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(abstract_lexicon.NIL != fort_types_interface.functionP(v_term) && abstract_lexicon.NIL != isa.result_isa_colP(v_term, abstract_lexicon.$const448$ScalarInterval, mt));
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 52832L)
    public static SubLObject scalar_functionP(final SubLObject v_term, SubLObject mt) {
        if (mt == abstract_lexicon.UNPROVIDED) {
            mt = abstract_lexicon.$const330$InferencePSC;
        }
        SubLObject caching_state = abstract_lexicon.$scalar_functionP_caching_state$.getGlobalValue();
        if (abstract_lexicon.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)abstract_lexicon.$sym452$SCALAR_FUNCTION_, (SubLObject)abstract_lexicon.$sym453$_SCALAR_FUNCTION__CACHING_STATE_, (SubLObject)abstract_lexicon.$int454$512, (SubLObject)abstract_lexicon.EQUAL, (SubLObject)abstract_lexicon.TWO_INTEGER, (SubLObject)abstract_lexicon.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)abstract_lexicon.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)abstract_lexicon.NIL;
            collision = cdolist_list_var.first();
            while (abstract_lexicon.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (abstract_lexicon.NIL != cached_args && abstract_lexicon.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(scalar_functionP_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, mt));
        return memoization_state.caching_results(results3);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 53021L)
    public static SubLObject abstract_lexicon_noun_compound_learn_method(final SubLObject self, final SubLObject text) {
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 53457L)
    public static SubLObject tree_nps(final SubLObject tree, SubLObject allow_trivial_npsP) {
        if (allow_trivial_npsP == abstract_lexicon.UNPROVIDED) {
            allow_trivial_npsP = (SubLObject)abstract_lexicon.NIL;
        }
        SubLObject result = (SubLObject)abstract_lexicon.NIL;
        if (abstract_lexicon.NIL != np_treeP(tree, allow_trivial_npsP)) {
            result = (SubLObject)ConsesLow.cons(tree, result);
        }
        else if (tree.isList()) {
            SubLObject cdolist_list_var = tree.rest();
            SubLObject node = (SubLObject)abstract_lexicon.NIL;
            node = cdolist_list_var.first();
            while (abstract_lexicon.NIL != cdolist_list_var) {
                result = ConsesLow.append(tree_nps(node, allow_trivial_npsP), result);
                cdolist_list_var = cdolist_list_var.rest();
                node = cdolist_list_var.first();
            }
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 53782L)
    public static SubLObject np_treeP(final SubLObject tree, SubLObject allow_trivial_npsP) {
        if (allow_trivial_npsP == abstract_lexicon.UNPROVIDED) {
            allow_trivial_npsP = (SubLObject)abstract_lexicon.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(tree.isList() && tree.first() == abstract_lexicon.$kw458$NP && (abstract_lexicon.NIL != allow_trivial_npsP || Sequences.length(tree).numG((SubLObject)abstract_lexicon.TWO_INTEGER)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 53966L)
    public static SubLObject compounds_from_tree(final SubLObject np_tree) {
        SubLObject compound_strings = (SubLObject)abstract_lexicon.NIL;
        SubLObject current_string = (SubLObject)abstract_lexicon.NIL;
        SubLObject cdolist_list_var = np_tree;
        SubLObject node = (SubLObject)abstract_lexicon.NIL;
        node = cdolist_list_var.first();
        while (abstract_lexicon.NIL != cdolist_list_var) {
            if (node.isList() && conses_high.second(node).isString() && (abstract_lexicon.NIL != subl_promotions.memberP(node.first(), abstract_lexicon.$adjectival_tags$.getGlobalValue(), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED) || abstract_lexicon.NIL != subl_promotions.memberP(node.first(), abstract_lexicon.$nominal_tags$.getGlobalValue(), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED))) {
                current_string = (SubLObject)ConsesLow.cons(conses_high.second(node), current_string);
            }
            else if (node.isList() && abstract_lexicon.NIL != list_utilities.lengthE(node, (SubLObject)abstract_lexicon.TWO_INTEGER, (SubLObject)abstract_lexicon.UNPROVIDED) && conses_high.second(node).isString()) {
                if (abstract_lexicon.NIL != list_utilities.lengthG(current_string, (SubLObject)abstract_lexicon.ONE_INTEGER, (SubLObject)abstract_lexicon.UNPROVIDED)) {
                    compound_strings = (SubLObject)ConsesLow.cons(string_utilities.bunge(Sequences.nreverse(current_string), (SubLObject)abstract_lexicon.UNPROVIDED), compound_strings);
                }
                current_string = (SubLObject)abstract_lexicon.NIL;
            }
            else if (node.isList()) {
                compound_strings = Sequences.cconcatenate(compound_strings, compounds_from_tree(node));
            }
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
        }
        if (abstract_lexicon.NIL != current_string && abstract_lexicon.NIL != list_utilities.lengthG(current_string, (SubLObject)abstract_lexicon.ONE_INTEGER, (SubLObject)abstract_lexicon.UNPROVIDED)) {
            compound_strings = (SubLObject)ConsesLow.cons(string_utilities.bunge(Sequences.nreverse(current_string), (SubLObject)abstract_lexicon.UNPROVIDED), compound_strings);
            current_string = (SubLObject)abstract_lexicon.NIL;
        }
        return compound_strings;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 54976L)
    public static SubLObject text_noun_compounds(final SubLObject str) {
        final SubLObject parse = parser.stanford_parse(str, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
        final SubLObject tree_nps = tree_nps(parse, (SubLObject)abstract_lexicon.UNPROVIDED);
        final SubLObject compounds = Mapping.mapcan((SubLObject)abstract_lexicon.$sym459$COMPOUNDS_FROM_TREE, tree_nps, abstract_lexicon.EMPTY_SUBL_OBJECT_ARRAY);
        return compounds;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 55158L)
    public static SubLObject noun_compound_meanings(final SubLObject str) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject res = (SubLObject)abstract_lexicon.NIL;
        SubLObject cdolist_list_var;
        final SubLObject ncs = cdolist_list_var = text_noun_compounds(str);
        SubLObject nc = (SubLObject)abstract_lexicon.NIL;
        nc = cdolist_list_var.first();
        while (abstract_lexicon.NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
            final SubLObject _prev_bind_2 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
            try {
                parsing_vars.$psp_return_mode$.bind((SubLObject)abstract_lexicon.$kw460$BEST_ONLY, thread);
                parsing_vars.$npp_use_nl_tagsP$.bind((SubLObject)abstract_lexicon.T, thread);
                final SubLObject parses = psp_main.ps_get_cycls_for_phrase(nc, (SubLObject)abstract_lexicon.$list461, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
                res = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(nc, Mapping.mapcar((SubLObject)abstract_lexicon.$sym462$EXTRACT_PARSE_POS_PRED, parses)), res);
            }
            finally {
                parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_2, thread);
                parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            nc = cdolist_list_var.first();
        }
        return res;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 55645L)
    public static SubLObject noun_compound_meanings_of_string(final SubLObject str) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parses = (SubLObject)abstract_lexicon.NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
        try {
            parsing_vars.$psp_return_mode$.bind((SubLObject)abstract_lexicon.$kw460$BEST_ONLY, thread);
            parsing_vars.$npp_use_nl_tagsP$.bind((SubLObject)abstract_lexicon.T, thread);
            parses = psp_main.ps_get_cycls_for_phrase(str, (SubLObject)abstract_lexicon.$list461, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
        }
        finally {
            parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_2, thread);
            parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
        }
        if (abstract_lexicon.NIL != parses) {
            return (SubLObject)ConsesLow.cons(str, Mapping.mapcar((SubLObject)abstract_lexicon.$sym462$EXTRACT_PARSE_POS_PRED, parses));
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 56104L)
    public static SubLObject extract_parse_pos_pred(final SubLObject parse) {
        final SubLObject pos_pred = pos_pred_from_nc_parse(parse);
        return (SubLObject)ConsesLow.list(parsing_utilities.strip_nl_tags(parse, (SubLObject)abstract_lexicon.UNPROVIDED), pos_pred);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 56254L)
    public static SubLObject pos_pred_from_nc_parse(final SubLObject parse) {
        if (abstract_lexicon.NIL != formula_pattern_match.formula_matches_pattern(parse, (SubLObject)abstract_lexicon.$list463)) {
            return abstract_lexicon.$const464$plural_Generic;
        }
        if (abstract_lexicon.NIL != formula_pattern_match.formula_matches_pattern(parse, (SubLObject)abstract_lexicon.$list465)) {
            return abstract_lexicon.$const466$singular_Generic;
        }
        if (abstract_lexicon.NIL != formula_pattern_match.formula_matches_pattern(parse, (SubLObject)abstract_lexicon.$list467)) {
            return abstract_lexicon.$const468$massNumber_Generic;
        }
        return abstract_lexicon.$const469$nounStrings;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 56664L)
    public static SubLObject abstract_lexicon_cooccurrence_statistics_learn_method(final SubLObject self, final SubLObject text) {
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 57115L)
    public static SubLObject abstract_lexicon_lexify_document_method(final SubLObject self, final SubLObject doc) {
        assert abstract_lexicon.NIL != document.document_p(doc) : doc;
        final SubLObject lexified = document.make_document((SubLObject)abstract_lexicon.UNPROVIDED);
        SubLObject paragraphs = (SubLObject)abstract_lexicon.NIL;
        final SubLObject vector_var = document.document_paragraphs(doc);
        final SubLObject backwardP_var = (SubLObject)abstract_lexicon.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)abstract_lexicon.NIL, v_iteration = (SubLObject)abstract_lexicon.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)abstract_lexicon.ONE_INTEGER)) {
            element_num = ((abstract_lexicon.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)abstract_lexicon.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            paragraphs = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym476$LEXIFY_PARAGRAPH, paragraph), paragraphs);
        }
        document._csetf_document_paragraphs(lexified, Functions.apply(Symbols.symbol_function((SubLObject)abstract_lexicon.$sym477$VECTOR), Sequences.nreverse(paragraphs)));
        return lexified;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 57681L)
    public static SubLObject abstract_lexicon_lexify_document_exhaustively_method(final SubLObject self, final SubLObject doc) {
        assert abstract_lexicon.NIL != document.document_p(doc) : doc;
        final SubLObject lexified = document.make_document((SubLObject)abstract_lexicon.UNPROVIDED);
        SubLObject paragraphs = (SubLObject)abstract_lexicon.NIL;
        final SubLObject vector_var = document.document_paragraphs(doc);
        final SubLObject backwardP_var = (SubLObject)abstract_lexicon.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)abstract_lexicon.NIL, v_iteration = (SubLObject)abstract_lexicon.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)abstract_lexicon.ONE_INTEGER)) {
            element_num = ((abstract_lexicon.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)abstract_lexicon.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            paragraphs = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym481$LEXIFY_PARAGRAPH_EXHAUSTIVELY, paragraph), paragraphs);
        }
        document._csetf_document_paragraphs(lexified, Functions.apply(Symbols.symbol_function((SubLObject)abstract_lexicon.$sym477$VECTOR), Sequences.nreverse(paragraphs)));
        return lexified;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 58347L)
    public static SubLObject abstract_lexicon_lexify_paragraph_method(final SubLObject self, final SubLObject par) {
        assert abstract_lexicon.NIL != document.paragraph_p(par) : par;
        final SubLObject lexified = document.make_paragraph((SubLObject)abstract_lexicon.UNPROVIDED);
        SubLObject sentences = (SubLObject)abstract_lexicon.NIL;
        final SubLObject vector_var = document.paragraph_sentences(par);
        final SubLObject backwardP_var = (SubLObject)abstract_lexicon.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sentence;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)abstract_lexicon.NIL, v_iteration = (SubLObject)abstract_lexicon.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)abstract_lexicon.ONE_INTEGER)) {
            element_num = ((abstract_lexicon.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)abstract_lexicon.ONE_INTEGER) : v_iteration);
            sentence = Vectors.aref(vector_var, element_num);
            sentences = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym486$LEXIFY_SENTENCE, sentence), sentences);
        }
        document._csetf_paragraph_sentences(lexified, Functions.apply(Symbols.symbol_function((SubLObject)abstract_lexicon.$sym477$VECTOR), Sequences.nreverse(sentences)));
        return lexified;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 58911L)
    public static SubLObject abstract_lexicon_lexify_paragraph_exhaustively_method(final SubLObject self, final SubLObject par) {
        assert abstract_lexicon.NIL != document.paragraph_p(par) : par;
        final SubLObject lexified = document.make_paragraph((SubLObject)abstract_lexicon.UNPROVIDED);
        SubLObject sentences = (SubLObject)abstract_lexicon.NIL;
        final SubLObject vector_var = document.paragraph_sentences(par);
        final SubLObject backwardP_var = (SubLObject)abstract_lexicon.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sentence;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)abstract_lexicon.NIL, v_iteration = (SubLObject)abstract_lexicon.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)abstract_lexicon.ONE_INTEGER)) {
            element_num = ((abstract_lexicon.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)abstract_lexicon.ONE_INTEGER) : v_iteration);
            sentence = Vectors.aref(vector_var, element_num);
            sentences = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym489$LEXIFY_SENTENCE_EXHAUSTIVELY, sentence), sentences);
        }
        document._csetf_paragraph_sentences(lexified, Functions.apply(Symbols.symbol_function((SubLObject)abstract_lexicon.$sym477$VECTOR), Sequences.nreverse(sentences)));
        return lexified;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 59576L)
    public static SubLObject abstract_lexicon_lexify_sentence_method(final SubLObject self, final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
        final SubLObject trie = get_abstract_lexicon_trie(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym493$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                assert abstract_lexicon.NIL != document.sentence_p(sentence) : sentence;
                if (document.sentence_length(sentence).isZero()) {
                    Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym493$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, sentence);
                }
                final SubLObject lexified = document.new_sentence((SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
                final SubLObject word_vec = document.sentence_yield(sentence);
                final SubLObject first_word = document.word_string(Vectors.aref(word_vec, (SubLObject)abstract_lexicon.ZERO_INTEGER));
                SubLObject record_length = (SubLObject)abstract_lexicon.ZERO_INTEGER;
                SubLObject lexified_tokens = (SubLObject)abstract_lexicon.NIL;
                SubLObject words = (SubLObject)abstract_lexicon.NIL;
                final SubLObject tokenizing_stream = streams_high.make_private_string_output_stream();
                pos_tagger.tagger_normalize_initial_capitalization(pos_tagger.get_tagger(), word_vec);
                words = vector_utilities.vector_elements(word_vec, (SubLObject)abstract_lexicon.UNPROVIDED);
                final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                try {
                    lexicon_vars.$lexicon_lookup_mt$.bind(abstract_lexicon.$const330$InferencePSC, thread);
                    SubLObject index = (SubLObject)abstract_lexicon.NIL;
                    SubLObject tokens = (SubLObject)abstract_lexicon.NIL;
                    index = (SubLObject)abstract_lexicon.ZERO_INTEGER;
                    for (tokens = words; abstract_lexicon.NIL != tokens; tokens = conses_high.nthcdr(record_length, tokens)) {
                        SubLObject new_token_addedP = (SubLObject)abstract_lexicon.NIL;
                        if (abstract_lexicon.NIL == new_token_addedP) {
                            SubLObject csome_list_var = nl_trie.nl_trie_string_tokenize_multiple(document.construct_string_from_words(tokens, (SubLObject)abstract_lexicon.NIL, tokenizing_stream));
                            SubLObject strings = (SubLObject)abstract_lexicon.NIL;
                            strings = csome_list_var.first();
                            while (abstract_lexicon.NIL == new_token_addedP && abstract_lexicon.NIL != csome_list_var) {
                                SubLObject prefixes = nl_trie_accessors.nl_trie_prefixes_memoized(trie, strings, case_sensitivity, (SubLObject)abstract_lexicon.UNPROVIDED);
                                SubLObject new_token = (SubLObject)abstract_lexicon.NIL;
                                SubLObject local_case_sensitivity = case_sensitivity;
                                SubLObject iteration_count = (SubLObject)abstract_lexicon.ZERO_INTEGER;
                                while (abstract_lexicon.NIL == lexified_word_p(new_token) && abstract_lexicon.NIL == list_utilities.empty_list_p(prefixes)) {
                                    iteration_count = Numbers.add(iteration_count, (SubLObject)abstract_lexicon.ONE_INTEGER);
                                    if (iteration_count.numG((SubLObject)abstract_lexicon.TWENTY_INTEGER)) {
                                        Errors.sublisp_break((SubLObject)abstract_lexicon.$str495$20_iterations_hit_inside_abstract, new SubLObject[] { sentence });
                                    }
                                    final SubLObject record = prefixes.first();
                                    prefixes = prefixes.rest();
                                    thread.resetMultipleValues();
                                    final SubLObject new_token_$25 = get_lex_entries_for_prefix(self, tokens, strings, record, lexified, (SubLObject)abstract_lexicon.UNPROVIDED);
                                    final SubLObject record_length_$26 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    new_token = new_token_$25;
                                    record_length = record_length_$26;
                                    if (abstract_lexicon.NIL != list_utilities.empty_list_p(prefixes) && abstract_lexicon.NIL == document.word_info(new_token) && local_case_sensitivity == abstract_lexicon.$kw389$PREFERRED) {
                                        local_case_sensitivity = (SubLObject)abstract_lexicon.$kw390$OFF;
                                        prefixes = nl_trie_accessors.nl_trie_prefixes_memoized(trie, strings, local_case_sensitivity, (SubLObject)abstract_lexicon.UNPROVIDED);
                                    }
                                }
                                if (abstract_lexicon.NIL == document.word_p(new_token)) {
                                    thread.resetMultipleValues();
                                    final SubLObject new_token_$26 = get_lex_entries_for_prefix(self, tokens, strings, (SubLObject)abstract_lexicon.NIL, lexified, (SubLObject)abstract_lexicon.UNPROVIDED);
                                    final SubLObject record_length_$27 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    new_token = new_token_$26;
                                    record_length = record_length_$27;
                                }
                                if (!record_length.numE((SubLObject)abstract_lexicon.ZERO_INTEGER)) {
                                    lexified_tokens = (SubLObject)ConsesLow.cons(new_token, lexified_tokens);
                                    new_token_addedP = (SubLObject)abstract_lexicon.T;
                                }
                                csome_list_var = csome_list_var.rest();
                                strings = csome_list_var.first();
                            }
                        }
                        index = Numbers.add(index, record_length);
                    }
                }
                finally {
                    lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                }
                document._csetf_sign_constituents(lexified, Functions.apply(Symbols.symbol_function((SubLObject)abstract_lexicon.$sym477$VECTOR), Sequences.nreverse(lexified_tokens)));
                if (!document.word_string(document.sentence_get(lexified, (SubLObject)abstract_lexicon.ZERO_INTEGER)).equal(first_word)) {
                    document.word_update(document.sentence_get(lexified, (SubLObject)abstract_lexicon.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.$kw34$STRING, Sequences.replace(document.word_string(document.sentence_get(lexified, (SubLObject)abstract_lexicon.ZERO_INTEGER)), first_word, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED)));
                }
                document._csetf_sign_string(lexified, document.sentence_string(sentence));
                if (abstract_lexicon.NIL != document.sentence_mother(sentence)) {
                    document.paragraph_set(document.sentence_mother(sentence), document.sentence_index(sentence), lexified);
                }
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym493$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, lexified);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
                    set_abstract_lexicon_trie(self, trie);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym493$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 63821L)
    public static SubLObject abstract_lexicon_lexify_sentence_exhaustively_method(final SubLObject self, final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
        final SubLObject trie = get_abstract_lexicon_trie(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym498$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                assert abstract_lexicon.NIL != document.sentence_p(sentence) : sentence;
                if (document.sentence_length(sentence).isZero()) {
                    Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym498$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, sentence);
                }
                final SubLObject lexified = document.new_sentence((SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
                final SubLObject word_vec = document.sentence_yield(sentence);
                final SubLObject first_word = document.word_string(Vectors.aref(word_vec, (SubLObject)abstract_lexicon.ZERO_INTEGER));
                SubLObject exhaustive_words = (SubLObject)abstract_lexicon.NIL;
                SubLObject words = (SubLObject)abstract_lexicon.NIL;
                pos_tagger.tagger_normalize_initial_capitalization(pos_tagger.get_tagger(), word_vec);
                words = vector_utilities.vector_elements(word_vec, (SubLObject)abstract_lexicon.UNPROVIDED);
                final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                try {
                    lexicon_vars.$lexicon_lookup_mt$.bind(abstract_lexicon.$const330$InferencePSC, thread);
                    SubLObject index = (SubLObject)abstract_lexicon.NIL;
                    SubLObject tokens = (SubLObject)abstract_lexicon.NIL;
                    SubLObject strings = (SubLObject)abstract_lexicon.NIL;
                    index = (SubLObject)abstract_lexicon.ZERO_INTEGER;
                    for (tokens = words, strings = Mapping.mapcar(Symbols.symbol_function((SubLObject)abstract_lexicon.$sym451$WORD_STRING), tokens); abstract_lexicon.NIL != tokens; tokens = tokens.rest(), strings = strings.rest()) {
                        final SubLObject prefixes = nl_trie_accessors.nl_trie_prefixes_memoized(trie, strings, case_sensitivity, (SubLObject)abstract_lexicon.UNPROVIDED);
                        final SubLObject parent_word = document.new_exhaustive_word_from_word(tokens.first());
                        final SubLObject prefix_words = get_all_prefix_words(self, prefixes, tokens, strings, lexified, parent_word);
                        document._csetf_sign_constituents(parent_word, Functions.apply(Symbols.symbol_function((SubLObject)abstract_lexicon.$sym477$VECTOR), prefix_words));
                        exhaustive_words = (SubLObject)ConsesLow.cons(parent_word, exhaustive_words);
                        index = Numbers.add(index, (SubLObject)abstract_lexicon.ONE_INTEGER);
                    }
                }
                finally {
                    lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                }
                document._csetf_sign_constituents(lexified, Functions.apply(Symbols.symbol_function((SubLObject)abstract_lexicon.$sym477$VECTOR), Sequences.nreverse(exhaustive_words)));
                SubLObject cdolist_list_var = (SubLObject)ConsesLow.cons(document.sentence_get(lexified, (SubLObject)abstract_lexicon.ZERO_INTEGER), vector_utilities.vector_elements(document.word_constituents(document.sentence_get(lexified, (SubLObject)abstract_lexicon.ZERO_INTEGER)), (SubLObject)abstract_lexicon.UNPROVIDED));
                SubLObject first_word_obj = (SubLObject)abstract_lexicon.NIL;
                first_word_obj = cdolist_list_var.first();
                while (abstract_lexicon.NIL != cdolist_list_var) {
                    document.word_update(first_word_obj, (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.$kw34$STRING, Sequences.replace(document.word_string(first_word_obj), first_word, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED)));
                    cdolist_list_var = cdolist_list_var.rest();
                    first_word_obj = cdolist_list_var.first();
                }
                document._csetf_sign_string(lexified, document.sentence_string(sentence));
                if (abstract_lexicon.NIL != document.sentence_mother(sentence)) {
                    document.paragraph_set(document.sentence_mother(sentence), document.sentence_index(sentence), lexified);
                }
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym498$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, lexified);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
                    set_abstract_lexicon_trie(self, trie);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym498$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 66075L)
    public static SubLObject get_all_prefix_words(final SubLObject self, SubLObject prefixes, final SubLObject tokens, final SubLObject strings, final SubLObject lexified, final SubLObject parent_word) {
        SubLObject prefix_words = (SubLObject)abstract_lexicon.NIL;
        while (abstract_lexicon.NIL == list_utilities.empty_list_p(prefixes)) {
            final SubLObject record = prefixes.first();
            prefixes = prefixes.rest();
            final SubLObject word_for_prefix = get_lex_entries_for_prefix(self, tokens, strings, record, lexified, (SubLObject)abstract_lexicon.NIL);
            if (abstract_lexicon.NIL != word_for_prefix) {
                document._csetf_sign_mother(word_for_prefix, parent_word);
                prefix_words = (SubLObject)ConsesLow.cons(word_for_prefix, prefix_words);
            }
        }
        prefix_words = Sequences.remove((SubLObject)abstract_lexicon.NIL, prefix_words, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
        if (abstract_lexicon.NIL == Sequences.find(document.word_string(parent_word), prefix_words, Symbols.symbol_function((SubLObject)abstract_lexicon.EQUAL), (SubLObject)abstract_lexicon.$sym451$WORD_STRING, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED)) {
            prefix_words = (SubLObject)ConsesLow.cons(document.copy_word(tokens.first()), prefix_words);
        }
        return prefix_words;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 66695L)
    public static SubLObject lexified_word_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(abstract_lexicon.NIL != document.word_p(v_object) && abstract_lexicon.NIL != list_utilities.non_empty_list_p(document.word_info(v_object)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 66820L)
    public static SubLObject possibly_merge_tokens(final SubLObject tokens) {
        SubLObject result_tokens = (SubLObject)abstract_lexicon.NIL;
        SubLObject current_token = (SubLObject)abstract_lexicon.$str500$;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = (SubLObject)abstract_lexicon.NIL;
        token = cdolist_list_var.first();
        while (abstract_lexicon.NIL != cdolist_list_var) {
            if (abstract_lexicon.NIL != Strings.stringE(token, (SubLObject)abstract_lexicon.$str501$_, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED)) {
                current_token = token;
            }
            else {
                result_tokens = (SubLObject)ConsesLow.cons(Sequences.cconcatenate(current_token, token), result_tokens);
                current_token = (SubLObject)abstract_lexicon.$str500$;
            }
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        }
        return Sequences.nreverse(result_tokens);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 67291L)
    public static SubLObject get_lex_entries_for_prefix(final SubLObject lexicon, final SubLObject tokens, final SubLObject strings, SubLObject record, final SubLObject lexified_sentence, SubLObject return_empty_word_if_no_lex_entries) {
        if (return_empty_word_if_no_lex_entries == abstract_lexicon.UNPROVIDED) {
            return_empty_word_if_no_lex_entries = (SubLObject)abstract_lexicon.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_word = (SubLObject)abstract_lexicon.NIL;
        SubLObject string = (SubLObject)abstract_lexicon.NIL;
        SubLObject relevant_tokens = (SubLObject)abstract_lexicon.NIL;
        final SubLObject first_token = tokens.first();
        final SubLObject current_offset = (abstract_lexicon.NIL != document.word_p(first_token)) ? document.word_offset(first_token) : Errors.error((SubLObject)abstract_lexicon.$str502$word_has_no_offset);
        SubLObject record_length = (SubLObject)abstract_lexicon.NIL;
        final SubLObject ignore_cacheP = methods.funcall_instance_method_with_0_args(lexicon, (SubLObject)abstract_lexicon.$sym182$IGNORE_CACHE_);
        final SubLObject v_cache = instances.get_slot(lexicon, (SubLObject)abstract_lexicon.$sym183$CACHE);
        SubLObject categories = (SubLObject)abstract_lexicon.NIL;
        SubLObject categories_orderedP = (SubLObject)abstract_lexicon.NIL;
        SubLObject lex_entries0 = (SubLObject)abstract_lexicon.NIL;
        SubLObject existsP = (SubLObject)abstract_lexicon.NIL;
        if (abstract_lexicon.NIL == record) {
            record = nl_trie.new_nl_trie_record((SubLObject)ConsesLow.list(document.word_string(tokens.first())), (SubLObject)abstract_lexicon.NIL);
        }
        record_length = Sequences.length(nl_trie.nl_trie_record_key(record));
        thread.resetMultipleValues();
        final SubLObject string_$29 = reconstruct_string_from_tokens(list_utilities.first_n(record_length, strings), tokens);
        final SubLObject relevant_tokens_$30 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        string = string_$29;
        relevant_tokens = relevant_tokens_$30;
        if (abstract_lexicon.NIL == ignore_cacheP) {
            thread.resetMultipleValues();
            final SubLObject lex_entries0_$31 = cache.cache_get(v_cache, string);
            final SubLObject existsP_$32 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            lex_entries0 = lex_entries0_$31;
            existsP = existsP_$32;
        }
        if (abstract_lexicon.NIL == existsP) {
            SubLObject cdolist_list_var = nl_trie.nl_trie_record_entries(record);
            SubLObject nl_trie_entry = (SubLObject)abstract_lexicon.NIL;
            nl_trie_entry = cdolist_list_var.first();
            while (abstract_lexicon.NIL != cdolist_list_var) {
                if (abstract_lexicon.NIL != methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)abstract_lexicon.$sym242$VALID_NL_TRIE_ENTRY_, nl_trie_entry)) {
                    lex_entries0 = Sequences.cconcatenate(lex_entries0, methods.funcall_instance_method_with_2_args(lexicon, (SubLObject)abstract_lexicon.$sym388$CREATE_LEX_ENTRIES, string, nl_trie_entry));
                }
                else if (abstract_lexicon.NIL != methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)abstract_lexicon.$sym409$LEARNED_, nl_trie_entry)) {
                    lex_entries0 = (SubLObject)ConsesLow.cons(nl_trie_entry, lex_entries0);
                }
                cdolist_list_var = cdolist_list_var.rest();
                nl_trie_entry = cdolist_list_var.first();
            }
            if (abstract_lexicon.NIL == ignore_cacheP) {
                cache.cache_set(v_cache, string, lex_entries0);
            }
        }
        thread.resetMultipleValues();
        final SubLObject categories_$33 = order_penn_tags(list_utilities.first_n(record_length, tokens), lex_entries0);
        final SubLObject categories_orderedP_$34 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        categories = categories_$33;
        categories_orderedP = categories_orderedP_$34;
        SubLObject lex_entries2 = (SubLObject)abstract_lexicon.NIL;
        SubLObject lex_entry_cat = categories.first();
        SubLObject doneP = (SubLObject)abstract_lexicon.NIL;
        if ((abstract_lexicon.NIL != abstract_lexicon.$lexify_sentence_ignore_pos_for_multiword_tokens$.getDynamicValue(thread) && record_length.numG((SubLObject)abstract_lexicon.ONE_INTEGER)) || abstract_lexicon.NIL == categories) {
            lex_entries2 = lex_entries0;
        }
        else if (abstract_lexicon.NIL == doneP) {
            SubLObject csome_list_var = categories;
            SubLObject category = (SubLObject)abstract_lexicon.NIL;
            category = csome_list_var.first();
            while (abstract_lexicon.NIL == doneP && abstract_lexicon.NIL != csome_list_var) {
                SubLObject cdolist_list_var2 = lex_entries0;
                SubLObject lex_entry = (SubLObject)abstract_lexicon.NIL;
                lex_entry = cdolist_list_var2.first();
                while (abstract_lexicon.NIL != cdolist_list_var2) {
                    if (abstract_lexicon.NIL == category || abstract_lexicon.NIL != conses_high.member(category, methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw111$PENN_TAGS), (SubLObject)abstract_lexicon.EQ, (SubLObject)abstract_lexicon.UNPROVIDED)) {
                        final SubLObject item_var = lex_entry;
                        if (abstract_lexicon.NIL == conses_high.member(item_var, lex_entries2, (SubLObject)abstract_lexicon.$sym392$LEX_ENTRY_EQUAL_P, Symbols.symbol_function((SubLObject)abstract_lexicon.IDENTITY))) {
                            lex_entries2 = (SubLObject)ConsesLow.cons(item_var, lex_entries2);
                        }
                        lex_entry_cat = category;
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    lex_entry = cdolist_list_var2.first();
                }
                doneP = (SubLObject)SubLObjectFactory.makeBoolean(abstract_lexicon.NIL != categories_orderedP && abstract_lexicon.NIL != lex_entries2);
                csome_list_var = csome_list_var.rest();
                category = csome_list_var.first();
            }
        }
        if (abstract_lexicon.NIL != string) {
            new_word = document.new_word((SubLObject)ConsesLow.list(new SubLObject[] { abstract_lexicon.$kw34$STRING, string, abstract_lexicon.$kw503$CATEGORY, lex_entry_cat, abstract_lexicon.$kw504$MOTHER, lexified_sentence, abstract_lexicon.$kw505$INFO, lex_entries2, abstract_lexicon.$kw506$OFFSET, current_offset }));
            if (abstract_lexicon.NIL == lex_entries2 && abstract_lexicon.NIL != instances.get_slot(lexicon, (SubLObject)abstract_lexicon.$sym177$ALLOW_STEMMING)) {
                final SubLObject copy_of_tokens = conses_high.copy_list(tokens);
                thread.resetMultipleValues();
                final SubLObject unstemmed_tokens = unstemmed_tokens_from_tokens(copy_of_tokens, record, strings);
                final SubLObject strings_$35 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (abstract_lexicon.NIL == token_list_equalp(unstemmed_tokens, tokens, (SubLObject)abstract_lexicon.UNPROVIDED)) {
                    final SubLObject record_$36 = nl_trie_accessors.nl_trie_prefixes_memoized(instances.get_slot(lexicon, (SubLObject)abstract_lexicon.$sym184$TRIE), strings_$35, instances.get_slot(lexicon, (SubLObject)abstract_lexicon.$sym181$CASE_SENSITIVITY), (SubLObject)abstract_lexicon.UNPROVIDED).first();
                    SubLObject my_new_word = (SubLObject)abstract_lexicon.NIL;
                    thread.resetMultipleValues();
                    final SubLObject my_new_word_$37 = get_lex_entries_for_prefix(lexicon, unstemmed_tokens, strings_$35, record_$36, lexified_sentence, (SubLObject)abstract_lexicon.UNPROVIDED);
                    final SubLObject record_length_$38 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    my_new_word = my_new_word_$37;
                    record_length = record_length_$38;
                    if (abstract_lexicon.NIL != my_new_word) {
                        document.sign_update(new_word, (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.$kw505$INFO, document.sign_info(my_new_word), (SubLObject)abstract_lexicon.$kw34$STRING, document.sign_string(my_new_word)));
                    }
                }
            }
        }
        if (abstract_lexicon.NIL != document.word_p(new_word) && abstract_lexicon.NIL != document.word_info(new_word) && abstract_lexicon.NIL != relevant_tokens) {
            return Values.values(new_word, Sequences.length(relevant_tokens));
        }
        if (abstract_lexicon.NIL != return_empty_word_if_no_lex_entries) {
            return Values.values(tokens.first(), (SubLObject)abstract_lexicon.ONE_INTEGER);
        }
        return Values.values((SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.ONE_INTEGER);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 71654L)
    public static SubLObject reconstruct_string_from_tokens(final SubLObject strings, final SubLObject tokens) {
        final SubLObject token_string = document.construct_string_from_words(tokens, (SubLObject)abstract_lexicon.T, (SubLObject)abstract_lexicon.UNPROVIDED);
        SubLObject current_search_result = (SubLObject)abstract_lexicon.NIL;
        SubLObject relevant_string = (SubLObject)abstract_lexicon.NIL;
        SubLObject token_count = (SubLObject)abstract_lexicon.ZERO_INTEGER;
        SubLObject current_search_result_$39 = (SubLObject)abstract_lexicon.NIL;
        SubLObject end = (SubLObject)abstract_lexicon.ZERO_INTEGER;
        SubLObject cdolist_list_var = strings;
        SubLObject str = (SubLObject)abstract_lexicon.NIL;
        str = cdolist_list_var.first();
        while (abstract_lexicon.NIL != cdolist_list_var) {
            current_search_result_$39 = Sequences.search(str, token_string, (SubLObject)abstract_lexicon.EQUAL, (SubLObject)abstract_lexicon.IDENTITY, (SubLObject)abstract_lexicon.ZERO_INTEGER, (SubLObject)abstract_lexicon.NIL, end, (SubLObject)abstract_lexicon.UNPROVIDED);
            if (abstract_lexicon.NIL == current_search_result_$39) {
                return (SubLObject)abstract_lexicon.NIL;
            }
            end = Numbers.add(Sequences.length(str), current_search_result_$39);
            cdolist_list_var = cdolist_list_var.rest();
            str = cdolist_list_var.first();
        }
        relevant_string = Sequences.subseq(token_string, (SubLObject)abstract_lexicon.ZERO_INTEGER, end);
        SubLObject token_search_end = (SubLObject)abstract_lexicon.ZERO_INTEGER;
        SubLObject doneP = (SubLObject)abstract_lexicon.NIL;
        if (abstract_lexicon.NIL == doneP) {
            SubLObject csome_list_var = tokens;
            SubLObject token = (SubLObject)abstract_lexicon.NIL;
            token = csome_list_var.first();
            while (abstract_lexicon.NIL == doneP && abstract_lexicon.NIL != csome_list_var) {
                final SubLObject standardized_token_strings = nl_trie.nl_trie_standardize_strings((SubLObject)ConsesLow.list(document.word_string(token))).first();
                final SubLObject standardized_token_string = (abstract_lexicon.NIL == standardized_token_strings) ? document.word_string(token) : standardized_token_strings.first();
                current_search_result = Sequences.search(standardized_token_string, relevant_string, (SubLObject)abstract_lexicon.EQUAL, (SubLObject)abstract_lexicon.IDENTITY, (SubLObject)abstract_lexicon.ZERO_INTEGER, (SubLObject)abstract_lexicon.NIL, token_search_end, (SubLObject)abstract_lexicon.UNPROVIDED);
                if (abstract_lexicon.NIL == doneP && abstract_lexicon.NIL != current_search_result) {
                    token_count = Numbers.add(token_count, (SubLObject)abstract_lexicon.ONE_INTEGER);
                    token_search_end = Numbers.add(Sequences.length(document.word_string(token)), current_search_result);
                }
                else {
                    doneP = (SubLObject)abstract_lexicon.T;
                }
                csome_list_var = csome_list_var.rest();
                token = csome_list_var.first();
            }
        }
        return Values.values(relevant_string, Sequences.subseq(tokens, (SubLObject)abstract_lexicon.ZERO_INTEGER, token_count));
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 73856L)
    public static SubLObject token_list_equalp(final SubLObject token_list1, final SubLObject token_list2, SubLObject test) {
        if (test == abstract_lexicon.UNPROVIDED) {
            test = (SubLObject)abstract_lexicon.EQUAL;
        }
        SubLObject token1 = (SubLObject)abstract_lexicon.NIL;
        SubLObject token1_$40 = (SubLObject)abstract_lexicon.NIL;
        SubLObject token2 = (SubLObject)abstract_lexicon.NIL;
        SubLObject token2_$41 = (SubLObject)abstract_lexicon.NIL;
        token1 = token_list1;
        token1_$40 = token1.first();
        token2 = token_list2;
        token2_$41 = token2.first();
        while (abstract_lexicon.NIL != token2 || abstract_lexicon.NIL != token1) {
            if (abstract_lexicon.NIL == Functions.funcall(test, document.word_string(token1_$40), document.word_string(token2_$41))) {
                return (SubLObject)abstract_lexicon.NIL;
            }
            token1 = token1.rest();
            token1_$40 = token1.first();
            token2 = token2.rest();
            token2_$41 = token2.first();
        }
        return (SubLObject)abstract_lexicon.T;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 74278L)
    public static SubLObject unstemmed_tokens_from_tokens(final SubLObject tokens, final SubLObject record, final SubLObject strings) {
        final SubLObject last_word_string = conses_high.last(nl_trie.nl_trie_record_key(record), (SubLObject)abstract_lexicon.UNPROVIDED).first();
        final SubLObject stemmed_last_word_string = morphology.find_stem_memoized(last_word_string, (SubLObject)abstract_lexicon.UNPROVIDED);
        final SubLObject corresponding_token_list = conses_high.nthcdr(Numbers.subtract(Sequences.length(nl_trie.nl_trie_record_key(record)), (SubLObject)abstract_lexicon.ONE_INTEGER), tokens);
        final SubLObject unstemmed_last_token = document.copy_word(corresponding_token_list.first());
        final SubLObject new_strings = list_utilities.replace_nth(Numbers.subtract(Sequences.length(nl_trie.nl_trie_record_key(record)), (SubLObject)abstract_lexicon.ONE_INTEGER), stemmed_last_word_string, strings);
        document.set_word_string(unstemmed_last_token, stemmed_last_word_string);
        ConsesLow.rplaca(corresponding_token_list, unstemmed_last_token);
        return Values.values(tokens, new_strings);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 75200L)
    public static SubLObject order_penn_tags(final SubLObject tokens, final SubLObject lex_entries) {
        final SubLObject first_word = tokens.first();
        final SubLObject first_tag = document.word_category(first_word);
        final SubLObject last_word = conses_high.last(tokens, (SubLObject)abstract_lexicon.UNPROVIDED).first();
        final SubLObject last_tag = document.word_category(last_word);
        final SubLObject record_tags = entries_tags(lex_entries);
        final SubLObject orderedP = (SubLObject)SubLObjectFactory.makeBoolean(abstract_lexicon.NIL != last_tag || abstract_lexicon.NIL != first_tag);
        if (abstract_lexicon.NIL == subl_promotions.memberP(first_tag, (SubLObject)abstract_lexicon.$list507, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED)) {
            if (abstract_lexicon.NIL != conses_high.member(last_tag, record_tags, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED)) {
                return Values.values((SubLObject)ConsesLow.cons(last_tag, Sequences.remove(last_tag, record_tags, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED)), orderedP);
            }
            if (abstract_lexicon.NIL != conses_high.member(last_tag, (SubLObject)abstract_lexicon.$list508, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED)) {
                return Values.values((SubLObject)ConsesLow.cons(first_tag, Sequences.remove(first_tag, record_tags, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED)), orderedP);
            }
            if (abstract_lexicon.NIL != conses_high.member(last_tag, entries_backoff_tags(lex_entries), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED)) {
                return Values.values(record_tags, orderedP);
            }
            if (abstract_lexicon.NIL != subl_promotions.memberP(first_tag, record_tags, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED) && abstract_lexicon.NIL != some_head_initial_lex_entry_has_tag(lex_entries, first_tag)) {
                return Values.values((SubLObject)ConsesLow.cons(first_tag, Sequences.remove(first_tag, record_tags, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED)), orderedP);
            }
            if (abstract_lexicon.NIL != last_tag) {
                return Values.values((SubLObject)ConsesLow.list(last_tag), orderedP);
            }
            return Values.values(record_tags, orderedP);
        }
        else {
            if (abstract_lexicon.NIL != conses_high.member(first_tag, record_tags, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED)) {
                return Values.values((SubLObject)ConsesLow.cons(first_tag, Sequences.remove(first_tag, record_tags, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED)), orderedP);
            }
            if (abstract_lexicon.NIL != conses_high.member(first_tag, entries_backoff_tags(lex_entries), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED)) {
                return Values.values(tags_matching_backoff_tags(first_tag, lex_entries), orderedP);
            }
            return Values.values((SubLObject)ConsesLow.cons(first_tag, tag_backoffs(first_tag)), orderedP);
        }
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 77778L)
    public static SubLObject some_head_initial_lex_entry_has_tag(final SubLObject lex_entries, final SubLObject tag) {
        SubLObject cdolist_list_var = lex_entries;
        SubLObject lex_entry = (SubLObject)abstract_lexicon.NIL;
        lex_entry = cdolist_list_var.first();
        while (abstract_lexicon.NIL != cdolist_list_var) {
            if (methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw111$PENN_TAGS).eql(tag) && methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw168$PREDICATE).eql(abstract_lexicon.$const509$multiWordString)) {
                return (SubLObject)abstract_lexicon.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex_entry = cdolist_list_var.first();
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 78032L)
    public static SubLObject entries_tags(final SubLObject entries) {
        SubLObject tags = (SubLObject)abstract_lexicon.NIL;
        SubLObject cdolist_list_var = entries;
        SubLObject entry = (SubLObject)abstract_lexicon.NIL;
        entry = cdolist_list_var.first();
        while (abstract_lexicon.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$42 = methods.funcall_instance_method_with_1_args(entry, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw111$PENN_TAGS);
            SubLObject tag = (SubLObject)abstract_lexicon.NIL;
            tag = cdolist_list_var_$42.first();
            while (abstract_lexicon.NIL != cdolist_list_var_$42) {
                final SubLObject item_var = tag;
                if (abstract_lexicon.NIL == conses_high.member(item_var, tags, Symbols.symbol_function((SubLObject)abstract_lexicon.EQL), Symbols.symbol_function((SubLObject)abstract_lexicon.IDENTITY))) {
                    tags = (SubLObject)ConsesLow.cons(item_var, tags);
                }
                cdolist_list_var_$42 = cdolist_list_var_$42.rest();
                tag = cdolist_list_var_$42.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return tags;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 78205L)
    public static SubLObject entries_backoff_tags(final SubLObject entries) {
        SubLObject backoff_tags = (SubLObject)abstract_lexicon.NIL;
        SubLObject cdolist_list_var = entries;
        SubLObject entry = (SubLObject)abstract_lexicon.NIL;
        entry = cdolist_list_var.first();
        while (abstract_lexicon.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$43 = methods.funcall_instance_method_with_1_args(entry, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw510$BACKOFF_PENN_TAGS);
            SubLObject tag = (SubLObject)abstract_lexicon.NIL;
            tag = cdolist_list_var_$43.first();
            while (abstract_lexicon.NIL != cdolist_list_var_$43) {
                final SubLObject item_var = tag;
                if (abstract_lexicon.NIL == conses_high.member(item_var, backoff_tags, Symbols.symbol_function((SubLObject)abstract_lexicon.EQL), Symbols.symbol_function((SubLObject)abstract_lexicon.IDENTITY))) {
                    backoff_tags = (SubLObject)ConsesLow.cons(item_var, backoff_tags);
                }
                cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                tag = cdolist_list_var_$43.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return backoff_tags;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 78420L)
    public static SubLObject tags_matching_backoff_tags(final SubLObject known_tag, final SubLObject lex_entries) {
        SubLObject matching_tags = (SubLObject)abstract_lexicon.NIL;
        SubLObject cdolist_list_var = lex_entries;
        SubLObject lex_entry = (SubLObject)abstract_lexicon.NIL;
        lex_entry = cdolist_list_var.first();
        while (abstract_lexicon.NIL != cdolist_list_var) {
            if (abstract_lexicon.NIL != subl_promotions.memberP(known_tag, methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw510$BACKOFF_PENN_TAGS), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED)) {
                matching_tags = conses_high.union(matching_tags, methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw111$PENN_TAGS), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex_entry = cdolist_list_var.first();
        }
        return matching_tags;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 78729L)
    public static SubLObject guess_category(final SubLObject lexicon, final SubLObject string, final SubLObject tokens) {
        assert abstract_lexicon.NIL != abstract_lexicon_p(lexicon) : lexicon;
        assert abstract_lexicon.NIL != Types.stringp(string) : string;
        assert abstract_lexicon.NIL != Types.listp(tokens) : tokens;
        final SubLObject first_word = tokens.first();
        final SubLObject last_word = conses_high.last(tokens, (SubLObject)abstract_lexicon.UNPROVIDED).first();
        final SubLObject lexes = methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)abstract_lexicon.$sym70$GET, string);
        if (methods.funcall_instance_method_with_0_args(first_word, (SubLObject)abstract_lexicon.$sym511$GET_STRING).equal(string)) {
            return methods.funcall_instance_method_with_0_args(first_word, (SubLObject)abstract_lexicon.$sym512$GET_CATEGORY);
        }
        if (abstract_lexicon.NIL != lexes) {
            return methods.funcall_instance_method_with_1_args(lexes.first(), (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw111$PENN_TAGS).first();
        }
        if (abstract_lexicon.NIL != conses_high.member(methods.funcall_instance_method_with_0_args(first_word, (SubLObject)abstract_lexicon.$sym512$GET_CATEGORY), (SubLObject)abstract_lexicon.$list513, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED) && methods.funcall_instance_method_with_0_args(last_word, (SubLObject)abstract_lexicon.$sym512$GET_CATEGORY).eql((SubLObject)abstract_lexicon.$kw446$CD)) {
            return methods.funcall_instance_method_with_0_args(first_word, (SubLObject)abstract_lexicon.$sym512$GET_CATEGORY);
        }
        return methods.funcall_instance_method_with_0_args(last_word, (SubLObject)abstract_lexicon.$sym512$GET_CATEGORY);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 79606L)
    public static SubLObject abstract_lexicon_lexify_words_method(final SubLObject self, final SubLObject words) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_lexicon_method = (SubLObject)abstract_lexicon.NIL;
        final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
        final SubLObject ignore_cacheP = get_abstract_lexicon_ignore_cacheP(self);
        final SubLObject v_cache = get_abstract_lexicon_cache(self);
        final SubLObject trie = get_abstract_lexicon_trie(self);
        try {
            thread.throwStack.push(abstract_lexicon.$sym517$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
            try {
                assert abstract_lexicon.NIL != Types.listp(words) : words;
                SubLObject record_length = (SubLObject)abstract_lexicon.ZERO_INTEGER;
                SubLObject lexified_tokens = (SubLObject)abstract_lexicon.NIL;
                SubLObject category = (SubLObject)abstract_lexicon.NIL;
                SubLObject string = (SubLObject)abstract_lexicon.NIL;
                SubLObject index = (SubLObject)abstract_lexicon.NIL;
                SubLObject tokens = (SubLObject)abstract_lexicon.NIL;
                SubLObject strings = (SubLObject)abstract_lexicon.NIL;
                SubLObject records = (SubLObject)abstract_lexicon.NIL;
                index = (SubLObject)abstract_lexicon.ZERO_INTEGER;
                tokens = words;
                strings = Mapping.mapcar(Symbols.symbol_function((SubLObject)abstract_lexicon.$sym518$GET_PARSE_TREE_STRING), tokens);
                records = nl_trie_accessors.nl_trie_prefixes(trie, strings, case_sensitivity);
                while (abstract_lexicon.NIL != tokens) {
                    records = list_utilities.add_to_end(nl_trie.new_nl_trie_record((SubLObject)ConsesLow.list(methods.funcall_instance_method_with_0_args(tokens.first(), (SubLObject)abstract_lexicon.$sym511$GET_STRING)), (SubLObject)abstract_lexicon.NIL), records);
                    SubLObject new_token_added_for_prefixe = (SubLObject)abstract_lexicon.NIL;
                    if (abstract_lexicon.NIL == new_token_added_for_prefixe) {
                        SubLObject csome_list_var = records;
                        SubLObject record = (SubLObject)abstract_lexicon.NIL;
                        record = csome_list_var.first();
                        while (abstract_lexicon.NIL == new_token_added_for_prefixe && abstract_lexicon.NIL != csome_list_var) {
                            record_length = Sequences.length(nl_trie.nl_trie_record_key(record));
                            string = build_multi_word_lexeme(list_utilities.first_n(record_length, strings));
                            category = guess_category(self, string, tokens);
                            SubLObject lex_entries = (SubLObject)abstract_lexicon.NIL;
                            SubLObject lex_entries2 = (SubLObject)abstract_lexicon.NIL;
                            SubLObject existsP = (SubLObject)abstract_lexicon.NIL;
                            if (abstract_lexicon.NIL == ignore_cacheP) {
                                thread.resetMultipleValues();
                                final SubLObject lex_entries0_$44 = cache.cache_get(v_cache, string);
                                final SubLObject existsP_$45 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                lex_entries2 = lex_entries0_$44;
                                existsP = existsP_$45;
                            }
                            if (abstract_lexicon.NIL == existsP) {
                                SubLObject cdolist_list_var = nl_trie.nl_trie_record_entries(record);
                                SubLObject nl_trie_entry = (SubLObject)abstract_lexicon.NIL;
                                nl_trie_entry = cdolist_list_var.first();
                                while (abstract_lexicon.NIL != cdolist_list_var) {
                                    if (abstract_lexicon.NIL != methods.funcall_instance_method_with_1_args(self, (SubLObject)abstract_lexicon.$sym242$VALID_NL_TRIE_ENTRY_, nl_trie_entry)) {
                                        SubLObject cdolist_list_var_$46 = methods.funcall_instance_method_with_2_args(self, (SubLObject)abstract_lexicon.$sym388$CREATE_LEX_ENTRIES, string, nl_trie_entry);
                                        SubLObject lex_entry = (SubLObject)abstract_lexicon.NIL;
                                        lex_entry = cdolist_list_var_$46.first();
                                        while (abstract_lexicon.NIL != cdolist_list_var_$46) {
                                            lex_entries2 = (SubLObject)ConsesLow.cons(lex_entry, lex_entries2);
                                            cdolist_list_var_$46 = cdolist_list_var_$46.rest();
                                            lex_entry = cdolist_list_var_$46.first();
                                        }
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    nl_trie_entry = cdolist_list_var.first();
                                }
                                if (abstract_lexicon.NIL == ignore_cacheP) {
                                    cache.cache_set(v_cache, string, lex_entries2);
                                }
                            }
                            SubLObject cdolist_list_var = lex_entries2;
                            SubLObject lex_entry2 = (SubLObject)abstract_lexicon.NIL;
                            lex_entry2 = cdolist_list_var.first();
                            while (abstract_lexicon.NIL != cdolist_list_var) {
                                if (abstract_lexicon.NIL != subl_promotions.memberP(category, methods.funcall_instance_method_with_1_args(lex_entry2, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw111$PENN_TAGS), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED)) {
                                    final SubLObject item_var = lex_entry2;
                                    if (abstract_lexicon.NIL == conses_high.member(item_var, lex_entries, (SubLObject)abstract_lexicon.$sym392$LEX_ENTRY_EQUAL_P, Symbols.symbol_function((SubLObject)abstract_lexicon.IDENTITY))) {
                                        lex_entries = (SubLObject)ConsesLow.cons(item_var, lex_entries);
                                    }
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                lex_entry2 = cdolist_list_var.first();
                            }
                            if (abstract_lexicon.NIL == lex_entries) {
                                cdolist_list_var = lex_entries2;
                                lex_entry2 = (SubLObject)abstract_lexicon.NIL;
                                lex_entry2 = cdolist_list_var.first();
                                while (abstract_lexicon.NIL != cdolist_list_var) {
                                    if (abstract_lexicon.NIL != subl_promotions.memberP(category, methods.funcall_instance_method_with_1_args(lex_entry2, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$kw510$BACKOFF_PENN_TAGS), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED)) {
                                        final SubLObject item_var = lex_entry2;
                                        if (abstract_lexicon.NIL == conses_high.member(item_var, lex_entries, (SubLObject)abstract_lexicon.$sym392$LEX_ENTRY_EQUAL_P, Symbols.symbol_function((SubLObject)abstract_lexicon.IDENTITY))) {
                                            lex_entries = (SubLObject)ConsesLow.cons(item_var, lex_entries);
                                        }
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    lex_entry2 = cdolist_list_var.first();
                                }
                            }
                            if (abstract_lexicon.NIL != lex_entries || abstract_lexicon.NIL == nl_trie.nl_trie_record_entries(record)) {
                                new_token_added_for_prefixe = (SubLObject)abstract_lexicon.T;
                                lexified_tokens = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(string, category, lex_entries), lexified_tokens);
                            }
                            csome_list_var = csome_list_var.rest();
                            record = csome_list_var.first();
                        }
                    }
                    index = Numbers.add(index, record_length);
                    tokens = conses_high.nthcdr(record_length, tokens);
                    strings = conses_high.nthcdr(record_length, strings);
                    records = nl_trie_accessors.nl_trie_prefixes(trie, strings, case_sensitivity);
                }
                Dynamic.sublisp_throw((SubLObject)abstract_lexicon.$sym517$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, Sequences.nreverse(lexified_tokens));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)abstract_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
                    set_abstract_lexicon_ignore_cacheP(self, ignore_cacheP);
                    set_abstract_lexicon_cache(self, v_cache);
                    set_abstract_lexicon_trie(self, trie);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)abstract_lexicon.$sym517$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_lexicon_method;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 82485L)
    public static SubLObject build_multi_word_lexeme(final SubLObject strings) {
        SubLObject result = (SubLObject)abstract_lexicon.NIL;
        SubLObject in = (SubLObject)abstract_lexicon.NIL;
        try {
            in = streams_high.make_private_string_output_stream();
            print_high.princ(strings.first(), in);
            SubLObject cdolist_list_var = strings.rest();
            SubLObject string = (SubLObject)abstract_lexicon.NIL;
            string = cdolist_list_var.first();
            while (abstract_lexicon.NIL != cdolist_list_var) {
                if (abstract_lexicon.NIL == string_utilities.punctuation_string_p(string)) {
                    print_high.princ((SubLObject)abstract_lexicon.$str520$_, in);
                }
                print_high.princ(string, in);
                cdolist_list_var = cdolist_list_var.rest();
                string = cdolist_list_var.first();
            }
            result = streams_high.get_output_stream_string(in);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)abstract_lexicon.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(in, (SubLObject)abstract_lexicon.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 82818L)
    public static SubLObject abstract_lexicon_tokenize_method(final SubLObject self, final SubLObject string) {
        final SubLObject words = abstract_lexicon_lexify_sentence_method(self, document.new_sentence(string, (SubLObject)abstract_lexicon.$sym523$FST_STRING_WORDIFY));
        SubLObject strings = (SubLObject)abstract_lexicon.NIL;
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(words);
        SubLObject word = (SubLObject)abstract_lexicon.NIL;
        word = cdolist_list_var.first();
        while (abstract_lexicon.NIL != cdolist_list_var) {
            strings = (SubLObject)ConsesLow.cons(document.word_string(word), strings);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return Sequences.nreverse(strings);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 83389L)
    public static SubLObject do_lexicon(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)abstract_lexicon.$list525);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject string = (SubLObject)abstract_lexicon.NIL;
        SubLObject lex_entry = (SubLObject)abstract_lexicon.NIL;
        SubLObject lexicon = (SubLObject)abstract_lexicon.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)abstract_lexicon.$list525);
        string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)abstract_lexicon.$list525);
        lex_entry = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)abstract_lexicon.$list525);
        lexicon = current.first();
        current = current.rest();
        if (abstract_lexicon.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject iterator = (SubLObject)abstract_lexicon.$sym526$ITERATOR;
            return (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.$sym527$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(iterator, (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.$sym528$NEW_LEXICON_ITERATOR, lexicon))), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.$sym529$UNTIL, (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.$sym530$ITERATION_DONE, iterator), (SubLObject)ConsesLow.listS((SubLObject)abstract_lexicon.$sym527$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(lex_entry, (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.$sym531$ITERATION_NEXT, iterator)), (SubLObject)ConsesLow.list(string, (SubLObject)ConsesLow.listS((SubLObject)abstract_lexicon.$sym532$FIM, lex_entry, (SubLObject)abstract_lexicon.$list533))), ConsesLow.append(body, (SubLObject)abstract_lexicon.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)abstract_lexicon.$list525);
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 83847L)
    public static SubLObject abstract_lexicon_iterator_method(final SubLObject self) {
        return new_lexicon_iterator(self);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 83998L)
    public static SubLObject new_lexicon_from_kb_spec(final SubLObject kb_spec) {
        enforceType(kb_spec, abstract_lexicon.$sym537$FORT_P);
        final SubLObject class_name = lexicon_spec_class_name(kb_spec);
        final SubLObject lex = object.new_class_instance(class_name);
        methods.funcall_instance_method_with_1_args(lex, (SubLObject)abstract_lexicon.$sym206$INITIALIZE_ALLOWED_MTS, kb_spec);
        methods.funcall_instance_method_with_1_args(lex, (SubLObject)abstract_lexicon.$sym205$INITIALIZE_EXCLUDED_PREDS, preds_for_lexicon_exclusion(kb_spec));
        return lex;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 84579L)
    public static SubLObject lexicon_spec_class_name(final SubLObject kb_spec) {
        return cycl_utilities.formula_arg1(ask_utilities.query_variable((SubLObject)abstract_lexicon.$sym543$_CLASS_NAME, (SubLObject)ConsesLow.listS(abstract_lexicon.$const544$objectClassName, kb_spec, (SubLObject)abstract_lexicon.$list545), abstract_lexicon.$const330$InferencePSC, (SubLObject)abstract_lexicon.UNPROVIDED).first(), (SubLObject)abstract_lexicon.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 84749L)
    public static SubLObject clear_preds_for_lexicon_exclusion() {
        final SubLObject cs = abstract_lexicon.$preds_for_lexicon_exclusion_caching_state$.getGlobalValue();
        if (abstract_lexicon.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 84749L)
    public static SubLObject remove_preds_for_lexicon_exclusion(final SubLObject kb_spec) {
        return memoization_state.caching_state_remove_function_results_with_args(abstract_lexicon.$preds_for_lexicon_exclusion_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(kb_spec), (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 84749L)
    public static SubLObject preds_for_lexicon_exclusion_internal(final SubLObject kb_spec) {
        return ask_utilities.query_variable((SubLObject)abstract_lexicon.$sym547$_PRED, (SubLObject)ConsesLow.listS(abstract_lexicon.$const548$disallowedLexicalPredicate, kb_spec, (SubLObject)abstract_lexicon.$list549), abstract_lexicon.$const330$InferencePSC, (SubLObject)abstract_lexicon.$list550);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 84749L)
    public static SubLObject preds_for_lexicon_exclusion(final SubLObject kb_spec) {
        SubLObject caching_state = abstract_lexicon.$preds_for_lexicon_exclusion_caching_state$.getGlobalValue();
        if (abstract_lexicon.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)abstract_lexicon.$sym546$PREDS_FOR_LEXICON_EXCLUSION, (SubLObject)abstract_lexicon.$sym551$_PREDS_FOR_LEXICON_EXCLUSION_CACHING_STATE_, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.EQL, (SubLObject)abstract_lexicon.ONE_INTEGER, (SubLObject)abstract_lexicon.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)abstract_lexicon.$sym552$CLEAR_PREDS_FOR_LEXICON_EXCLUSION);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, kb_spec, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(preds_for_lexicon_exclusion_internal(kb_spec)));
            memoization_state.caching_state_put(caching_state, kb_spec, results, (SubLObject)abstract_lexicon.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 84969L)
    public static SubLObject new_lexicon_iterator(final SubLObject lexicon) {
        return iteration.new_iterator(new_abstract_lexicon_iterator_state(lexicon), (SubLObject)abstract_lexicon.$sym553$ABSTRACT_LEXICON_ITERATOR_STATE_DONE_P, (SubLObject)abstract_lexicon.$sym554$ABSTRACT_LEXICON_ITERATOR_STATE_NEXT, (SubLObject)abstract_lexicon.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
    public static SubLObject abstract_lexicon_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)abstract_lexicon.ZERO_INTEGER);
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
    public static SubLObject abstract_lexicon_iterator_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $abstract_lexicon_iterator_state_native.class) ? abstract_lexicon.T : abstract_lexicon.NIL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
    public static SubLObject abstract_lexicon_iterator_state_trie_iterator(final SubLObject v_object) {
        assert abstract_lexicon.NIL != abstract_lexicon_iterator_state_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
    public static SubLObject abstract_lexicon_iterator_state_next_entries(final SubLObject v_object) {
        assert abstract_lexicon.NIL != abstract_lexicon_iterator_state_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
    public static SubLObject abstract_lexicon_iterator_state_lexicon(final SubLObject v_object) {
        assert abstract_lexicon.NIL != abstract_lexicon_iterator_state_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
    public static SubLObject _csetf_abstract_lexicon_iterator_state_trie_iterator(final SubLObject v_object, final SubLObject value) {
        assert abstract_lexicon.NIL != abstract_lexicon_iterator_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
    public static SubLObject _csetf_abstract_lexicon_iterator_state_next_entries(final SubLObject v_object, final SubLObject value) {
        assert abstract_lexicon.NIL != abstract_lexicon_iterator_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
    public static SubLObject _csetf_abstract_lexicon_iterator_state_lexicon(final SubLObject v_object, final SubLObject value) {
        assert abstract_lexicon.NIL != abstract_lexicon_iterator_state_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
    public static SubLObject make_abstract_lexicon_iterator_state(SubLObject arglist) {
        if (arglist == abstract_lexicon.UNPROVIDED) {
            arglist = (SubLObject)abstract_lexicon.NIL;
        }
        final SubLObject v_new = (SubLObject)new $abstract_lexicon_iterator_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)abstract_lexicon.NIL, next = arglist; abstract_lexicon.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)abstract_lexicon.$kw570$TRIE_ITERATOR)) {
                _csetf_abstract_lexicon_iterator_state_trie_iterator(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)abstract_lexicon.$kw571$NEXT_ENTRIES)) {
                _csetf_abstract_lexicon_iterator_state_next_entries(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)abstract_lexicon.$kw572$LEXICON)) {
                _csetf_abstract_lexicon_iterator_state_lexicon(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)abstract_lexicon.$str37$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
    public static SubLObject visit_defstruct_abstract_lexicon_iterator_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)abstract_lexicon.$kw38$BEGIN, (SubLObject)abstract_lexicon.$sym573$MAKE_ABSTRACT_LEXICON_ITERATOR_STATE, (SubLObject)abstract_lexicon.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)abstract_lexicon.$kw40$SLOT, (SubLObject)abstract_lexicon.$kw570$TRIE_ITERATOR, abstract_lexicon_iterator_state_trie_iterator(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)abstract_lexicon.$kw40$SLOT, (SubLObject)abstract_lexicon.$kw571$NEXT_ENTRIES, abstract_lexicon_iterator_state_next_entries(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)abstract_lexicon.$kw40$SLOT, (SubLObject)abstract_lexicon.$kw572$LEXICON, abstract_lexicon_iterator_state_lexicon(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)abstract_lexicon.$kw41$END, (SubLObject)abstract_lexicon.$sym573$MAKE_ABSTRACT_LEXICON_ITERATOR_STATE, (SubLObject)abstract_lexicon.THREE_INTEGER);
        return obj;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
    public static SubLObject visit_defstruct_object_abstract_lexicon_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_abstract_lexicon_iterator_state(obj, visitor_fn);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85315L)
    public static SubLObject new_abstract_lexicon_iterator_state(final SubLObject lexicon) {
        final SubLObject iterator = make_abstract_lexicon_iterator_state((SubLObject)abstract_lexicon.UNPROVIDED);
        _csetf_abstract_lexicon_iterator_state_trie_iterator(iterator, nl_trie.new_nl_trie_iterator(get_abstract_lexicon_trie(lexicon)));
        _csetf_abstract_lexicon_iterator_state_lexicon(iterator, lexicon);
        return iterator;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85658L)
    public static SubLObject abstract_lexicon_iterator_state_done_p(final SubLObject state) {
        final SubLObject lexicon = abstract_lexicon_iterator_state_lexicon(state);
        final SubLObject trie_iterator = abstract_lexicon_iterator_state_trie_iterator(state);
        if (abstract_lexicon.NIL != abstract_lexicon_iterator_state_next_entries(state)) {
            return (SubLObject)abstract_lexicon.NIL;
        }
        if (abstract_lexicon.NIL != iteration.iteration_done(trie_iterator)) {
            return (SubLObject)abstract_lexicon.T;
        }
        while (abstract_lexicon.NIL == abstract_lexicon_iterator_state_next_entries(state) && abstract_lexicon.NIL == iteration.iteration_done(trie_iterator)) {
            final SubLObject next_entry = iteration.iteration_next(trie_iterator);
            if (abstract_lexicon.NIL != next_entry) {
                SubLObject current;
                final SubLObject datum = current = next_entry;
                SubLObject key = (SubLObject)abstract_lexicon.NIL;
                SubLObject trie_entries = (SubLObject)abstract_lexicon.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)abstract_lexicon.$list575);
                key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)abstract_lexicon.$list575);
                trie_entries = current.first();
                current = current.rest();
                if (abstract_lexicon.NIL == current) {
                    SubLObject cdolist_list_var = trie_entries;
                    SubLObject trie_entry = (SubLObject)abstract_lexicon.NIL;
                    trie_entry = cdolist_list_var.first();
                    while (abstract_lexicon.NIL != cdolist_list_var) {
                        final SubLObject string = nl_trie.nl_trie_entry_string(trie_entry);
                        if (abstract_lexicon.NIL != methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)abstract_lexicon.$sym242$VALID_NL_TRIE_ENTRY_, trie_entry)) {
                            SubLObject cdolist_list_var_$47 = methods.funcall_instance_method_with_2_args(lexicon, (SubLObject)abstract_lexicon.$sym388$CREATE_LEX_ENTRIES, string, trie_entry);
                            SubLObject lex_entry = (SubLObject)abstract_lexicon.NIL;
                            lex_entry = cdolist_list_var_$47.first();
                            while (abstract_lexicon.NIL != cdolist_list_var_$47) {
                                _csetf_abstract_lexicon_iterator_state_next_entries(state, (SubLObject)ConsesLow.cons(lex_entry, abstract_lexicon_iterator_state_next_entries(state)));
                                cdolist_list_var_$47 = cdolist_list_var_$47.rest();
                                lex_entry = cdolist_list_var_$47.first();
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        trie_entry = cdolist_list_var.first();
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)abstract_lexicon.$list575);
                }
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(abstract_lexicon.NIL == abstract_lexicon_iterator_state_next_entries(state));
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 86650L)
    public static SubLObject abstract_lexicon_iterator_state_next(final SubLObject state) {
        if (abstract_lexicon.NIL != abstract_lexicon_iterator_state_done_p(state)) {
            return Values.values((SubLObject)abstract_lexicon.NIL, state, (SubLObject)abstract_lexicon.T);
        }
        final SubLObject entry = abstract_lexicon_iterator_state_next_entries(state).first();
        _csetf_abstract_lexicon_iterator_state_next_entries(state, abstract_lexicon_iterator_state_next_entries(state).rest());
        return Values.values(entry, state, (SubLObject)abstract_lexicon.NIL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 87049L)
    public static SubLObject valid_denotsP(final SubLObject nl_trie_entry) {
        return (SubLObject)abstract_lexicon.T;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 87233L)
    public static SubLObject lex_entry2nl_trie_entry(final SubLObject lex_entry) {
        return lex_entry;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 87407L)
    public static SubLObject map_from_cyc_to_penn_pos(final SubLObject pos, final SubLObject pred) {
        return Hashtables.gethash((SubLObject)ConsesLow.cons(pos, pred), get_cyc_to_penn_map(), (SubLObject)abstract_lexicon.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 87756L)
    public static SubLObject with_el_formula_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)abstract_lexicon.$list576);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_term = (SubLObject)abstract_lexicon.NIL;
        SubLObject formula = (SubLObject)abstract_lexicon.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)abstract_lexicon.$list576);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)abstract_lexicon.$list576);
        formula = current.first();
        current = current.rest();
        if (abstract_lexicon.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject stack = (SubLObject)abstract_lexicon.$sym577$STACK;
            final SubLObject entry = (SubLObject)abstract_lexicon.$sym578$ENTRY;
            return (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.$sym527$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(stack, (SubLObject)abstract_lexicon.$list579), v_term), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.$sym580$STACK_PUSH, formula, stack), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.$sym529$UNTIL, (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.$sym581$STACK_EMPTY_P, stack), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.$sym527$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(entry, (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.$sym582$STACK_POP, stack))), (SubLObject)ConsesLow.listS((SubLObject)abstract_lexicon.$sym583$PWHEN, (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.$sym584$FIRST_ORDER_TERM_, entry), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.$sym585$CSETQ, v_term, entry), ConsesLow.append(body, (SubLObject)abstract_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.$sym586$CDOLIST, (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.$sym587$ARG, (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.$sym588$FORMULA_TERMS, entry)), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.$sym580$STACK_PUSH, (SubLObject)abstract_lexicon.$sym587$ARG, stack)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)abstract_lexicon.$list576);
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 88270L)
    public static SubLObject number_meanings_equalP(final SubLObject parse1, final SubLObject parse2) {
        SubLObject string1 = (SubLObject)abstract_lexicon.NIL;
        SubLObject number1 = (SubLObject)abstract_lexicon.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(parse1, parse1, (SubLObject)abstract_lexicon.$list599);
        string1 = parse1.first();
        SubLObject current = parse1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, parse1, (SubLObject)abstract_lexicon.$list599);
        number1 = current.first();
        current = current.rest();
        if (abstract_lexicon.NIL == current) {
            SubLObject string2 = (SubLObject)abstract_lexicon.NIL;
            SubLObject number2 = (SubLObject)abstract_lexicon.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(parse2, parse2, (SubLObject)abstract_lexicon.$list600);
            string2 = parse2.first();
            SubLObject current_$49 = parse2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$49, parse2, (SubLObject)abstract_lexicon.$list600);
            number2 = current_$49.first();
            current_$49 = current_$49.rest();
            if (abstract_lexicon.NIL == current_$49) {
                return (SubLObject)SubLObjectFactory.makeBoolean(string1.equal(string2) && number1.numE(number2));
            }
            cdestructuring_bind.cdestructuring_bind_error(parse2, (SubLObject)abstract_lexicon.$list600);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(parse1, (SubLObject)abstract_lexicon.$list599);
        }
        return (SubLObject)abstract_lexicon.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 88270L)
    public static SubLObject number_meanings_results_equalP(final SubLObject results1, final SubLObject results2) {
        return list_utilities.sets_equalP(results1, results2, (SubLObject)abstract_lexicon.$sym601$NUMBER_MEANINGS_EQUAL_);
    }

    @SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 88270L)
    public static SubLObject tokenizing_test_covering(final SubLObject string, final SubLObject cycls) {
        SubLObject word_count = (SubLObject)abstract_lexicon.ZERO_INTEGER;
        final SubLObject vector_var = document.document_paragraphs(document_annotation_widgets.new_tagged_document(string, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED, (SubLObject)abstract_lexicon.UNPROVIDED));
        final SubLObject backwardP_var = (SubLObject)abstract_lexicon.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$50;
        SubLObject backwardP_var_$51;
        SubLObject length_$52;
        SubLObject v_iteration_$53;
        SubLObject element_num_$54;
        SubLObject sentence;
        SubLObject cdolist_list_var;
        SubLObject word;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)abstract_lexicon.NIL, v_iteration = (SubLObject)abstract_lexicon.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)abstract_lexicon.ONE_INTEGER)) {
            element_num = ((abstract_lexicon.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)abstract_lexicon.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            vector_var_$50 = document.paragraph_sentences(paragraph);
            backwardP_var_$51 = (SubLObject)abstract_lexicon.NIL;
            for (length_$52 = Sequences.length(vector_var_$50), v_iteration_$53 = (SubLObject)abstract_lexicon.NIL, v_iteration_$53 = (SubLObject)abstract_lexicon.ZERO_INTEGER; v_iteration_$53.numL(length_$52); v_iteration_$53 = Numbers.add(v_iteration_$53, (SubLObject)abstract_lexicon.ONE_INTEGER)) {
                element_num_$54 = ((abstract_lexicon.NIL != backwardP_var_$51) ? Numbers.subtract(length_$52, v_iteration_$53, (SubLObject)abstract_lexicon.ONE_INTEGER) : v_iteration_$53);
                sentence = Vectors.aref(vector_var_$50, element_num_$54);
                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                word = (SubLObject)abstract_lexicon.NIL;
                word = cdolist_list_var.first();
                while (abstract_lexicon.NIL != cdolist_list_var) {
                    word_count = Numbers.add(word_count, (SubLObject)abstract_lexicon.ONE_INTEGER);
                    if (abstract_lexicon.NIL == list_utilities.same_length_p(conses_high.intersection(cycls, document.word_cycls(word), (SubLObject)abstract_lexicon.EQUAL, (SubLObject)abstract_lexicon.UNPROVIDED), document.word_cycls(word))) {
                        return (SubLObject)abstract_lexicon.NIL;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                }
            }
        }
        return Numbers.numE(word_count, (SubLObject)abstract_lexicon.ONE_INTEGER);
    }

    public static SubLObject declare_abstract_lexicon_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_cyc_to_penn_map", "GET-CYC-TO-PENN-MAP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "ensure_cyc_to_penn_map", "ENSURE-CYC-TO-PENN-MAP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "reinitialize_cyc_to_penn_map", "REINITIALIZE-CYC-TO-PENN-MAP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_cyc_to_penn_list", "GET-CYC-TO-PENN-LIST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "ensure_cyc_to_penn_list", "ENSURE-CYC-TO-PENN-LIST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "rebuild_cyc_to_penn_map", "REBUILD-CYC-TO-PENN-MAP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "build_cyc_to_penn_map", "BUILD-CYC-TO-PENN-MAP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "build_cyc_to_supertag_map", "BUILD-CYC-TO-SUPERTAG-MAP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "textract_lemma_print_function_trampoline", "TEXTRACT-LEMMA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "textract_lemma_p", "TEXTRACT-LEMMA-P", 1, 0, false);
        new $textract_lemma_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "textract_lemma_paragraph", "TEXTRACT-LEMMA-PARAGRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "textract_lemma_sentence", "TEXTRACT-LEMMA-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "textract_lemma_word", "TEXTRACT-LEMMA-WORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "textract_lemma_string", "TEXTRACT-LEMMA-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "textract_lemma_canon", "TEXTRACT-LEMMA-CANON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "textract_lemma_type", "TEXTRACT-LEMMA-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "_csetf_textract_lemma_paragraph", "_CSETF-TEXTRACT-LEMMA-PARAGRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "_csetf_textract_lemma_sentence", "_CSETF-TEXTRACT-LEMMA-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "_csetf_textract_lemma_word", "_CSETF-TEXTRACT-LEMMA-WORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "_csetf_textract_lemma_string", "_CSETF-TEXTRACT-LEMMA-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "_csetf_textract_lemma_canon", "_CSETF-TEXTRACT-LEMMA-CANON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "_csetf_textract_lemma_type", "_CSETF-TEXTRACT-LEMMA-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "make_textract_lemma", "MAKE-TEXTRACT-LEMMA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "visit_defstruct_textract_lemma", "VISIT-DEFSTRUCT-TEXTRACT-LEMMA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "visit_defstruct_object_textract_lemma_method", "VISIT-DEFSTRUCT-OBJECT-TEXTRACT-LEMMA-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "new_textract_lemma", "NEW-TEXTRACT-LEMMA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "textract_lemma_print", "TEXTRACT-LEMMA-PRINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_lex_entry_properties", "GET-LEX-ENTRY-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_lex_entry_properties", "SET-LEX-ENTRY-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_lex_entry_supported_properties", "GET-LEX-ENTRY-SUPPORTED-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_lex_entry_supported_properties", "SET-LEX-ENTRY-SUPPORTED-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_lex_entry_computed_properties", "GET-LEX-ENTRY-COMPUTED-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_lex_entry_computed_properties", "SET-LEX-ENTRY-COMPUTED-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_lex_entry_stored_properties", "GET-LEX-ENTRY-STORED-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_lex_entry_stored_properties", "SET-LEX-ENTRY-STORED-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "subloop_reserved_initialize_lex_entry_class", "SUBLOOP-RESERVED-INITIALIZE-LEX-ENTRY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "subloop_reserved_initialize_lex_entry_instance", "SUBLOOP-RESERVED-INITIALIZE-LEX-ENTRY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_p", "LEX-ENTRY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_initialize_method", "LEX-ENTRY-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_get_method", "LEX-ENTRY-GET-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_denot", "LEX-ENTRY-DENOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_semtrans", "LEX-ENTRY-SEMTRANS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_trie_entry", "LEX-ENTRY-TRIE-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_set_method", "LEX-ENTRY-SET-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_copy_method", "LEX-ENTRY-COPY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_nounP_method", "LEX-ENTRY-NOUN?-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_print_method", "LEX-ENTRY-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_nominal_p_method", "LEX-ENTRY-NOMINAL-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_verbal_p_method", "LEX-ENTRY-VERBAL-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_adjectival_p_method", "LEX-ENTRY-ADJECTIVAL-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_adverbial_p_method", "LEX-ENTRY-ADVERBIAL-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_compute_term_method", "LEX-ENTRY-COMPUTE-TERM-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_compute_gender_method", "LEX-ENTRY-COMPUTE-GENDER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_compute_penn_tags_method", "LEX-ENTRY-COMPUTE-PENN-TAGS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_compute_backoff_penn_tags_method", "LEX-ENTRY-COMPUTE-BACKOFF-PENN-TAGS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "tag_backoffs", "TAG-BACKOFFS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_compute_super_tags_method", "LEX-ENTRY-COMPUTE-SUPER-TAGS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_compute_cyc_pos_method", "LEX-ENTRY-COMPUTE-CYC-POS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_compute_is_ner_entry_method", "LEX-ENTRY-COMPUTE-IS-NER-ENTRY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_compute_cyc_category_method", "LEX-ENTRY-COMPUTE-CYC-CATEGORY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_compute_inflections_method", "LEX-ENTRY-COMPUTE-INFLECTIONS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_abstract_lexicon_stop_words", "GET-ABSTRACT-LEXICON-STOP-WORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_abstract_lexicon_stop_words", "SET-ABSTRACT-LEXICON-STOP-WORDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_abstract_lexicon_allow_stemming", "GET-ABSTRACT-LEXICON-ALLOW-STEMMING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_abstract_lexicon_allow_stemming", "SET-ABSTRACT-LEXICON-ALLOW-STEMMING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_abstract_lexicon_active_learners", "GET-ABSTRACT-LEXICON-ACTIVE-LEARNERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_abstract_lexicon_active_learners", "SET-ABSTRACT-LEXICON-ACTIVE-LEARNERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_abstract_lexicon_learned", "GET-ABSTRACT-LEXICON-LEARNED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_abstract_lexicon_learned", "SET-ABSTRACT-LEXICON-LEARNED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_abstract_lexicon_allow_fabricationP", "GET-ABSTRACT-LEXICON-ALLOW-FABRICATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_abstract_lexicon_allow_fabricationP", "SET-ABSTRACT-LEXICON-ALLOW-FABRICATION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_abstract_lexicon_case_sensitivity", "GET-ABSTRACT-LEXICON-CASE-SENSITIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_abstract_lexicon_case_sensitivity", "SET-ABSTRACT-LEXICON-CASE-SENSITIVITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_abstract_lexicon_ignore_cacheP", "GET-ABSTRACT-LEXICON-IGNORE-CACHE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_abstract_lexicon_ignore_cacheP", "SET-ABSTRACT-LEXICON-IGNORE-CACHE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_abstract_lexicon_cache", "GET-ABSTRACT-LEXICON-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_abstract_lexicon_cache", "SET-ABSTRACT-LEXICON-CACHE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_abstract_lexicon_trie", "GET-ABSTRACT-LEXICON-TRIE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_abstract_lexicon_trie", "SET-ABSTRACT-LEXICON-TRIE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_abstract_lexicon_excluded_pos_list", "GET-ABSTRACT-LEXICON-EXCLUDED-POS-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_abstract_lexicon_excluded_pos_list", "SET-ABSTRACT-LEXICON-EXCLUDED-POS-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_abstract_lexicon_excluded_preds", "GET-ABSTRACT-LEXICON-EXCLUDED-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_abstract_lexicon_excluded_preds", "SET-ABSTRACT-LEXICON-EXCLUDED-PREDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_abstract_lexicon_root_mt", "GET-ABSTRACT-LEXICON-ROOT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_abstract_lexicon_root_mt", "SET-ABSTRACT-LEXICON-ROOT-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_abstract_lexicon_base_mt", "GET-ABSTRACT-LEXICON-BASE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_abstract_lexicon_base_mt", "SET-ABSTRACT-LEXICON-BASE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_abstract_lexicon_excluded_mts", "GET-ABSTRACT-LEXICON-EXCLUDED-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_abstract_lexicon_excluded_mts", "SET-ABSTRACT-LEXICON-EXCLUDED-MTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_abstract_lexicon_allowed_mts", "GET-ABSTRACT-LEXICON-ALLOWED-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_abstract_lexicon_allowed_mts", "SET-ABSTRACT-LEXICON-ALLOWED-MTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_abstract_lexicon_default_kb_spec", "GET-ABSTRACT-LEXICON-DEFAULT-KB-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_abstract_lexicon_default_kb_spec", "SET-ABSTRACT-LEXICON-DEFAULT-KB-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_abstract_lexicon_default_base_mt", "GET-ABSTRACT-LEXICON-DEFAULT-BASE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_abstract_lexicon_default_base_mt", "SET-ABSTRACT-LEXICON-DEFAULT-BASE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_abstract_lexicon_default_exclude_predicates", "GET-ABSTRACT-LEXICON-DEFAULT-EXCLUDE-PREDICATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_abstract_lexicon_default_exclude_predicates", "SET-ABSTRACT-LEXICON-DEFAULT-EXCLUDE-PREDICATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_abstract_lexicon_default_exclude_mts", "GET-ABSTRACT-LEXICON-DEFAULT-EXCLUDE-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "set_abstract_lexicon_default_exclude_mts", "SET-ABSTRACT-LEXICON-DEFAULT-EXCLUDE-MTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "subloop_reserved_initialize_abstract_lexicon_class", "SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-LEXICON-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "subloop_reserved_initialize_abstract_lexicon_instance", "SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-LEXICON-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_p", "ABSTRACT-LEXICON-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_initialize_method", "ABSTRACT-LEXICON-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_isolate_method", "ABSTRACT-LEXICON-ISOLATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_ignore_cache_method", "ABSTRACT-LEXICON-IGNORE-CACHE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_ignore_cacheP_method", "ABSTRACT-LEXICON-IGNORE-CACHE?-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_allow_stemming_method", "ABSTRACT-LEXICON-ALLOW-STEMMING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_forbid_stemming_method", "ABSTRACT-LEXICON-FORBID-STEMMING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_allow_fabrication_method", "ABSTRACT-LEXICON-ALLOW-FABRICATION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_forbid_fabrication_method", "ABSTRACT-LEXICON-FORBID-FABRICATION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_fabrication_forbiddenP_method", "ABSTRACT-LEXICON-FABRICATION-FORBIDDEN?-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_fabrication_allowedP_method", "ABSTRACT-LEXICON-FABRICATION-ALLOWED?-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_valid_nl_trie_entryP_method", "ABSTRACT-LEXICON-VALID-NL-TRIE-ENTRY?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_set_case_sensitivity_method", "ABSTRACT-LEXICON-SET-CASE-SENSITIVITY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_get_case_sensitivity_method", "ABSTRACT-LEXICON-GET-CASE-SENSITIVITY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_initialize_excluded_preds_method", "ABSTRACT-LEXICON-INITIALIZE-EXCLUDED-PREDS-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_allow_predicate_method", "ABSTRACT-LEXICON-ALLOW-PREDICATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_exclude_predicate_method", "ABSTRACT-LEXICON-EXCLUDE-PREDICATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_excluded_predicateP_method", "ABSTRACT-LEXICON-EXCLUDED-PREDICATE?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_allowed_predicateP_method", "ABSTRACT-LEXICON-ALLOWED-PREDICATE?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_nl_trie_entry_has_allowed_predicateP_method", "ABSTRACT-LEXICON-NL-TRIE-ENTRY-HAS-ALLOWED-PREDICATE?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_allow_pos_method", "ABSTRACT-LEXICON-ALLOW-POS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_exclude_pos_method", "ABSTRACT-LEXICON-EXCLUDE-POS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_excluded_posP_method", "ABSTRACT-LEXICON-EXCLUDED-POS?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_allowed_posP_method", "ABSTRACT-LEXICON-ALLOWED-POS?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_nl_trie_entry_has_allowed_posP_method", "ABSTRACT-LEXICON-NL-TRIE-ENTRY-HAS-ALLOWED-POS?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_add_learner_method", "ABSTRACT-LEXICON-ADD-LEARNER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_remove_learner_method", "ABSTRACT-LEXICON-REMOVE-LEARNER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_get_learners_method", "ABSTRACT-LEXICON-GET-LEARNERS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_set_learners_method", "ABSTRACT-LEXICON-SET-LEARNERS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_initialize_allowed_mts_method", "ABSTRACT-LEXICON-INITIALIZE-ALLOWED-MTS-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_set_base_mt_method", "ABSTRACT-LEXICON-SET-BASE-MT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_get_base_mt_method", "ABSTRACT-LEXICON-GET-BASE-MT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_allow_mt_method", "ABSTRACT-LEXICON-ALLOW-MT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_allow_genl_mts_method", "ABSTRACT-LEXICON-ALLOW-GENL-MTS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_forbid_mt_method", "ABSTRACT-LEXICON-FORBID-MT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_allowed_mtP_method", "ABSTRACT-LEXICON-ALLOWED-MT?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_root_mt_method", "ABSTRACT-LEXICON-ROOT-MT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_add_stop_word_method", "ABSTRACT-LEXICON-ADD-STOP-WORD-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_stop_word_p_method", "ABSTRACT-LEXICON-STOP-WORD-P-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_get_stop_words_method", "ABSTRACT-LEXICON-GET-STOP-WORDS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_copy_method", "ABSTRACT-LEXICON-COPY-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_get_method", "ABSTRACT-LEXICON-GET-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "add_lex_entries_for_trie_entries", "ADD-LEX-ENTRIES-FOR-TRIE-ENTRIES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry_equal_p", "LEX-ENTRY-EQUAL-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_delete_method", "ABSTRACT-LEXICON-DELETE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_delete_entry_from_string_method", "ABSTRACT-LEXICON-DELETE-ENTRY-FROM-STRING-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "delete_nl_trie_lex_entries_for_string", "DELETE-NL-TRIE-LEX-ENTRIES-FOR-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_add_method", "ABSTRACT-LEXICON-ADD-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_learnedP_method", "ABSTRACT-LEXICON-LEARNED?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_forget_method", "ABSTRACT-LEXICON-FORGET-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "valid_prefixes", "VALID-PREFIXES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_prefixes_method", "ABSTRACT-LEXICON-PREFIXES-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_prefixes_from_string_method", "ABSTRACT-LEXICON-PREFIXES-FROM-STRING-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "valid_prefix_keys", "VALID-PREFIX-KEYS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lexicon_equality_from_case_sensitivity", "LEXICON-EQUALITY-FROM-CASE-SENSITIVITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_prefix_keys_method", "ABSTRACT-LEXICON-PREFIX-KEYS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_prefix_keys_from_string_method", "ABSTRACT-LEXICON-PREFIX-KEYS-FROM-STRING-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_learn_method", "ABSTRACT-LEXICON-LEARN-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_number_learn_method", "ABSTRACT-LEXICON-NUMBER-LEARN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "number_meanings", "NUMBER-MEANINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "text_numbers", "TEXT-NUMBERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "scalar_interval_meanings", "SCALAR-INTERVAL-MEANINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "text_scalar_intervals", "TEXT-SCALAR-INTERVALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "scalar_prefix", "SCALAR-PREFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "prefix_strings_from_words", "PREFIX-STRINGS-FROM-WORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "combine_words_into_string", "COMBINE-WORDS-INTO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "spaces", "SPACES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "clear_scalar_functionP", "CLEAR-SCALAR-FUNCTION?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "remove_scalar_functionP", "REMOVE-SCALAR-FUNCTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "scalar_functionP_internal", "SCALAR-FUNCTION?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "scalar_functionP", "SCALAR-FUNCTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_noun_compound_learn_method", "ABSTRACT-LEXICON-NOUN-COMPOUND-LEARN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "tree_nps", "TREE-NPS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "np_treeP", "NP-TREE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "compounds_from_tree", "COMPOUNDS-FROM-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "text_noun_compounds", "TEXT-NOUN-COMPOUNDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "noun_compound_meanings", "NOUN-COMPOUND-MEANINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "noun_compound_meanings_of_string", "NOUN-COMPOUND-MEANINGS-OF-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "extract_parse_pos_pred", "EXTRACT-PARSE-POS-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "pos_pred_from_nc_parse", "POS-PRED-FROM-NC-PARSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_cooccurrence_statistics_learn_method", "ABSTRACT-LEXICON-COOCCURRENCE-STATISTICS-LEARN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_lexify_document_method", "ABSTRACT-LEXICON-LEXIFY-DOCUMENT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_lexify_document_exhaustively_method", "ABSTRACT-LEXICON-LEXIFY-DOCUMENT-EXHAUSTIVELY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_lexify_paragraph_method", "ABSTRACT-LEXICON-LEXIFY-PARAGRAPH-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_lexify_paragraph_exhaustively_method", "ABSTRACT-LEXICON-LEXIFY-PARAGRAPH-EXHAUSTIVELY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_lexify_sentence_method", "ABSTRACT-LEXICON-LEXIFY-SENTENCE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_lexify_sentence_exhaustively_method", "ABSTRACT-LEXICON-LEXIFY-SENTENCE-EXHAUSTIVELY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_all_prefix_words", "GET-ALL-PREFIX-WORDS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lexified_word_p", "LEXIFIED-WORD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "possibly_merge_tokens", "POSSIBLY-MERGE-TOKENS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "get_lex_entries_for_prefix", "GET-LEX-ENTRIES-FOR-PREFIX", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "reconstruct_string_from_tokens", "RECONSTRUCT-STRING-FROM-TOKENS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "token_list_equalp", "TOKEN-LIST-EQUALP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "unstemmed_tokens_from_tokens", "UNSTEMMED-TOKENS-FROM-TOKENS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "order_penn_tags", "ORDER-PENN-TAGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "some_head_initial_lex_entry_has_tag", "SOME-HEAD-INITIAL-LEX-ENTRY-HAS-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "entries_tags", "ENTRIES-TAGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "entries_backoff_tags", "ENTRIES-BACKOFF-TAGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "tags_matching_backoff_tags", "TAGS-MATCHING-BACKOFF-TAGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "guess_category", "GUESS-CATEGORY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_lexify_words_method", "ABSTRACT-LEXICON-LEXIFY-WORDS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "build_multi_word_lexeme", "BUILD-MULTI-WORD-LEXEME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_tokenize_method", "ABSTRACT-LEXICON-TOKENIZE-METHOD", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.abstract_lexicon", "do_lexicon", "DO-LEXICON");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_iterator_method", "ABSTRACT-LEXICON-ITERATOR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "new_lexicon_from_kb_spec", "NEW-LEXICON-FROM-KB-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lexicon_spec_class_name", "LEXICON-SPEC-CLASS-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "clear_preds_for_lexicon_exclusion", "CLEAR-PREDS-FOR-LEXICON-EXCLUSION", 0, 0, false);
        new $clear_preds_for_lexicon_exclusion$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "remove_preds_for_lexicon_exclusion", "REMOVE-PREDS-FOR-LEXICON-EXCLUSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "preds_for_lexicon_exclusion_internal", "PREDS-FOR-LEXICON-EXCLUSION-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "preds_for_lexicon_exclusion", "PREDS-FOR-LEXICON-EXCLUSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "new_lexicon_iterator", "NEW-LEXICON-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_iterator_state_print_function_trampoline", "ABSTRACT-LEXICON-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_iterator_state_p", "ABSTRACT-LEXICON-ITERATOR-STATE-P", 1, 0, false);
        new $abstract_lexicon_iterator_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_iterator_state_trie_iterator", "ABSTRACT-LEXICON-ITERATOR-STATE-TRIE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_iterator_state_next_entries", "ABSTRACT-LEXICON-ITERATOR-STATE-NEXT-ENTRIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_iterator_state_lexicon", "ABSTRACT-LEXICON-ITERATOR-STATE-LEXICON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "_csetf_abstract_lexicon_iterator_state_trie_iterator", "_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-TRIE-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "_csetf_abstract_lexicon_iterator_state_next_entries", "_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-NEXT-ENTRIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "_csetf_abstract_lexicon_iterator_state_lexicon", "_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-LEXICON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "make_abstract_lexicon_iterator_state", "MAKE-ABSTRACT-LEXICON-ITERATOR-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "visit_defstruct_abstract_lexicon_iterator_state", "VISIT-DEFSTRUCT-ABSTRACT-LEXICON-ITERATOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "visit_defstruct_object_abstract_lexicon_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-ABSTRACT-LEXICON-ITERATOR-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "new_abstract_lexicon_iterator_state", "NEW-ABSTRACT-LEXICON-ITERATOR-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_iterator_state_done_p", "ABSTRACT-LEXICON-ITERATOR-STATE-DONE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "abstract_lexicon_iterator_state_next", "ABSTRACT-LEXICON-ITERATOR-STATE-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "valid_denotsP", "VALID-DENOTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "lex_entry2nl_trie_entry", "LEX-ENTRY2NL-TRIE-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "map_from_cyc_to_penn_pos", "MAP-FROM-CYC-TO-PENN-POS", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.abstract_lexicon", "with_el_formula_terms", "WITH-EL-FORMULA-TERMS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "number_meanings_equalP", "NUMBER-MEANINGS-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "number_meanings_results_equalP", "NUMBER-MEANINGS-RESULTS-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.abstract_lexicon", "tokenizing_test_covering", "TOKENIZING-TEST-COVERING", 2, 0, false);
        return (SubLObject)abstract_lexicon.NIL;
    }

    public static SubLObject init_abstract_lexicon_file() {
        abstract_lexicon.$cyc_to_penn_list$ = SubLFiles.deflexical("*CYC-TO-PENN-LIST*", (SubLObject)abstract_lexicon.NIL);
        abstract_lexicon.$cyc_to_penn_map$ = SubLFiles.deflexical("*CYC-TO-PENN-MAP*", (SubLObject)abstract_lexicon.NIL);
        abstract_lexicon.$cyc_to_supertag_map$ = SubLFiles.deflexical("*CYC-TO-SUPERTAG-MAP*", (SubLObject)abstract_lexicon.NIL);
        abstract_lexicon.$cyc_to_supertag_list$ = SubLFiles.defparameter("*CYC-TO-SUPERTAG-LIST*", (SubLObject)abstract_lexicon.$list8);
        abstract_lexicon.$dtp_textract_lemma$ = SubLFiles.defconstant("*DTP-TEXTRACT-LEMMA*", (SubLObject)abstract_lexicon.$sym10$TEXTRACT_LEMMA);
        abstract_lexicon.$nominal_tags$ = SubLFiles.defconstant("*NOMINAL-TAGS*", (SubLObject)abstract_lexicon.$list105);
        abstract_lexicon.$verbal_tags$ = SubLFiles.defconstant("*VERBAL-TAGS*", (SubLObject)abstract_lexicon.$list106);
        abstract_lexicon.$adjectival_tags$ = SubLFiles.defconstant("*ADJECTIVAL-TAGS*", (SubLObject)abstract_lexicon.$list107);
        abstract_lexicon.$adverbial_tags$ = SubLFiles.defconstant("*ADVERBIAL-TAGS*", (SubLObject)abstract_lexicon.$list108);
        abstract_lexicon.$penn_tag_backoffs$ = SubLFiles.defparameter("*PENN-TAG-BACKOFFS*", (SubLObject)abstract_lexicon.$list155);
        abstract_lexicon.$scalar_functionP_caching_state$ = SubLFiles.deflexical("*SCALAR-FUNCTION?-CACHING-STATE*", (SubLObject)abstract_lexicon.NIL);
        abstract_lexicon.$lexify_sentence_ignore_pos_for_multiword_tokens$ = SubLFiles.defparameter("*LEXIFY-SENTENCE-IGNORE-POS-FOR-MULTIWORD-TOKENS*", (SubLObject)abstract_lexicon.T);
        abstract_lexicon.$preds_for_lexicon_exclusion_caching_state$ = SubLFiles.deflexical("*PREDS-FOR-LEXICON-EXCLUSION-CACHING-STATE*", (SubLObject)abstract_lexicon.NIL);
        abstract_lexicon.$dtp_abstract_lexicon_iterator_state$ = SubLFiles.defconstant("*DTP-ABSTRACT-LEXICON-ITERATOR-STATE*", (SubLObject)abstract_lexicon.$sym555$ABSTRACT_LEXICON_ITERATOR_STATE);
        return (SubLObject)abstract_lexicon.NIL;
    }

    public static SubLObject setup_abstract_lexicon_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), abstract_lexicon.$dtp_textract_lemma$.getGlobalValue(), Symbols.symbol_function((SubLObject)abstract_lexicon.$sym17$TEXTRACT_LEMMA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)abstract_lexicon.$list18);
        Structures.def_csetf((SubLObject)abstract_lexicon.$sym19$TEXTRACT_LEMMA_PARAGRAPH, (SubLObject)abstract_lexicon.$sym20$_CSETF_TEXTRACT_LEMMA_PARAGRAPH);
        Structures.def_csetf((SubLObject)abstract_lexicon.$sym21$TEXTRACT_LEMMA_SENTENCE, (SubLObject)abstract_lexicon.$sym22$_CSETF_TEXTRACT_LEMMA_SENTENCE);
        Structures.def_csetf((SubLObject)abstract_lexicon.$sym23$TEXTRACT_LEMMA_WORD, (SubLObject)abstract_lexicon.$sym24$_CSETF_TEXTRACT_LEMMA_WORD);
        Structures.def_csetf((SubLObject)abstract_lexicon.$sym25$TEXTRACT_LEMMA_STRING, (SubLObject)abstract_lexicon.$sym26$_CSETF_TEXTRACT_LEMMA_STRING);
        Structures.def_csetf((SubLObject)abstract_lexicon.$sym27$TEXTRACT_LEMMA_CANON, (SubLObject)abstract_lexicon.$sym28$_CSETF_TEXTRACT_LEMMA_CANON);
        Structures.def_csetf((SubLObject)abstract_lexicon.$sym29$TEXTRACT_LEMMA_TYPE, (SubLObject)abstract_lexicon.$sym30$_CSETF_TEXTRACT_LEMMA_TYPE);
        Equality.identity((SubLObject)abstract_lexicon.$sym10$TEXTRACT_LEMMA);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), abstract_lexicon.$dtp_textract_lemma$.getGlobalValue(), Symbols.symbol_function((SubLObject)abstract_lexicon.$sym42$VISIT_DEFSTRUCT_OBJECT_TEXTRACT_LEMMA_METHOD));
        classes.subloop_new_class((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym51$OBJECT, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list52);
        classes.class_set_implements_slot_listeners((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym61$SUBLOOP_RESERVED_INITIALIZE_LEX_ENTRY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym64$SUBLOOP_RESERVED_INITIALIZE_LEX_ENTRY_INSTANCE);
        subloop_reserved_initialize_lex_entry_class((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym65$INITIALIZE, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list67);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym65$INITIALIZE, (SubLObject)abstract_lexicon.$sym69$LEX_ENTRY_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list72, (SubLObject)abstract_lexicon.$list73);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$sym76$LEX_ENTRY_GET_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym80$SET, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list81, (SubLObject)abstract_lexicon.$list82);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym80$SET, (SubLObject)abstract_lexicon.$sym85$LEX_ENTRY_SET_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym86$COPY, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list87);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym86$COPY, (SubLObject)abstract_lexicon.$sym89$LEX_ENTRY_COPY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym90$NOUN_, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$list91, (SubLObject)abstract_lexicon.$list92, (SubLObject)abstract_lexicon.$list93);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym90$NOUN_, (SubLObject)abstract_lexicon.$sym97$LEX_ENTRY_NOUN__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym98$PRINT, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list99, (SubLObject)abstract_lexicon.$list100);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym98$PRINT, (SubLObject)abstract_lexicon.$sym104$LEX_ENTRY_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym109$NOMINAL_P, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list110);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym109$NOMINAL_P, (SubLObject)abstract_lexicon.$sym112$LEX_ENTRY_NOMINAL_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym113$VERBAL_P, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list114);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym113$VERBAL_P, (SubLObject)abstract_lexicon.$sym115$LEX_ENTRY_VERBAL_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym116$ADJECTIVAL_P, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list117);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym116$ADJECTIVAL_P, (SubLObject)abstract_lexicon.$sym118$LEX_ENTRY_ADJECTIVAL_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym119$ADVERBIAL_P, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list120);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym119$ADVERBIAL_P, (SubLObject)abstract_lexicon.$sym121$LEX_ENTRY_ADVERBIAL_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym122$COMPUTE_TERM, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list123);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym122$COMPUTE_TERM, (SubLObject)abstract_lexicon.$sym130$LEX_ENTRY_COMPUTE_TERM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym131$COMPUTE_GENDER, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list132);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym131$COMPUTE_GENDER, (SubLObject)abstract_lexicon.$sym144$LEX_ENTRY_COMPUTE_GENDER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym145$COMPUTE_PENN_TAGS, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list146);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym145$COMPUTE_PENN_TAGS, (SubLObject)abstract_lexicon.$sym151$LEX_ENTRY_COMPUTE_PENN_TAGS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym152$COMPUTE_BACKOFF_PENN_TAGS, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list153);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym152$COMPUTE_BACKOFF_PENN_TAGS, (SubLObject)abstract_lexicon.$sym154$LEX_ENTRY_COMPUTE_BACKOFF_PENN_TAGS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym156$COMPUTE_SUPER_TAGS, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list157);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym156$COMPUTE_SUPER_TAGS, (SubLObject)abstract_lexicon.$sym159$LEX_ENTRY_COMPUTE_SUPER_TAGS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym160$COMPUTE_CYC_POS, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list161);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym160$COMPUTE_CYC_POS, (SubLObject)abstract_lexicon.$sym162$LEX_ENTRY_COMPUTE_CYC_POS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym163$COMPUTE_IS_NER_ENTRY, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list164);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym163$COMPUTE_IS_NER_ENTRY, (SubLObject)abstract_lexicon.$sym165$LEX_ENTRY_COMPUTE_IS_NER_ENTRY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym166$COMPUTE_CYC_CATEGORY, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list167);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym166$COMPUTE_CYC_CATEGORY, (SubLObject)abstract_lexicon.$sym170$LEX_ENTRY_COMPUTE_CYC_CATEGORY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym171$COMPUTE_INFLECTIONS, (SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list172);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym50$LEX_ENTRY, (SubLObject)abstract_lexicon.$sym171$COMPUTE_INFLECTIONS, (SubLObject)abstract_lexicon.$sym173$LEX_ENTRY_COMPUTE_INFLECTIONS_METHOD);
        classes.subloop_new_class((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym51$OBJECT, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.T, abstract_lexicon.$list175);
        classes.class_set_implements_slot_listeners((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym198$SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_LEXICON_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym200$SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_LEXICON_INSTANCE);
        subloop_reserved_initialize_abstract_lexicon_class((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym65$INITIALIZE, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list201);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym65$INITIALIZE, (SubLObject)abstract_lexicon.$sym207$ABSTRACT_LEXICON_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym208$ISOLATE, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list209);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym208$ISOLATE, (SubLObject)abstract_lexicon.$sym211$ABSTRACT_LEXICON_ISOLATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym212$IGNORE_CACHE, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list213);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym212$IGNORE_CACHE, (SubLObject)abstract_lexicon.$sym215$ABSTRACT_LEXICON_IGNORE_CACHE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym182$IGNORE_CACHE_, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list216);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym182$IGNORE_CACHE_, (SubLObject)abstract_lexicon.$sym218$ABSTRACT_LEXICON_IGNORE_CACHE__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym177$ALLOW_STEMMING, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list219);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym177$ALLOW_STEMMING, (SubLObject)abstract_lexicon.$sym221$ABSTRACT_LEXICON_ALLOW_STEMMING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym222$FORBID_STEMMING, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list223);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym222$FORBID_STEMMING, (SubLObject)abstract_lexicon.$sym225$ABSTRACT_LEXICON_FORBID_STEMMING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym226$ALLOW_FABRICATION, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list227);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym226$ALLOW_FABRICATION, (SubLObject)abstract_lexicon.$sym229$ABSTRACT_LEXICON_ALLOW_FABRICATION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym230$FORBID_FABRICATION, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list231);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym230$FORBID_FABRICATION, (SubLObject)abstract_lexicon.$sym233$ABSTRACT_LEXICON_FORBID_FABRICATION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym234$FABRICATION_FORBIDDEN_, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list235);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym234$FABRICATION_FORBIDDEN_, (SubLObject)abstract_lexicon.$sym237$ABSTRACT_LEXICON_FABRICATION_FORBIDDEN__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym238$FABRICATION_ALLOWED_, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list239);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym238$FABRICATION_ALLOWED_, (SubLObject)abstract_lexicon.$sym241$ABSTRACT_LEXICON_FABRICATION_ALLOWED__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym242$VALID_NL_TRIE_ENTRY_, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list243, (SubLObject)abstract_lexicon.$list244, (SubLObject)abstract_lexicon.$list245);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym242$VALID_NL_TRIE_ENTRY_, (SubLObject)abstract_lexicon.$sym252$ABSTRACT_LEXICON_VALID_NL_TRIE_ENTRY__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym253$SET_CASE_SENSITIVITY, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.$list254, (SubLObject)abstract_lexicon.$list255);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym253$SET_CASE_SENSITIVITY, (SubLObject)abstract_lexicon.$sym257$ABSTRACT_LEXICON_SET_CASE_SENSITIVITY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym258$GET_CASE_SENSITIVITY, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list259);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym258$GET_CASE_SENSITIVITY, (SubLObject)abstract_lexicon.$sym261$ABSTRACT_LEXICON_GET_CASE_SENSITIVITY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym205$INITIALIZE_EXCLUDED_PREDS, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.$list262, (SubLObject)abstract_lexicon.$list263);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym205$INITIALIZE_EXCLUDED_PREDS, (SubLObject)abstract_lexicon.$sym266$ABSTRACT_LEXICON_INITIALIZE_EXCLUDED_PREDS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym267$ALLOW_PREDICATE, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.$list268, (SubLObject)abstract_lexicon.$list269);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym267$ALLOW_PREDICATE, (SubLObject)abstract_lexicon.$sym271$ABSTRACT_LEXICON_ALLOW_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym272$EXCLUDE_PREDICATE, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.$list268, (SubLObject)abstract_lexicon.$list273);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym272$EXCLUDE_PREDICATE, (SubLObject)abstract_lexicon.$sym275$ABSTRACT_LEXICON_EXCLUDE_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym276$EXCLUDED_PREDICATE_, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.$list268, (SubLObject)abstract_lexicon.$list277);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym276$EXCLUDED_PREDICATE_, (SubLObject)abstract_lexicon.$sym279$ABSTRACT_LEXICON_EXCLUDED_PREDICATE__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym280$ALLOWED_PREDICATE_, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.$list268, (SubLObject)abstract_lexicon.$list281);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym280$ALLOWED_PREDICATE_, (SubLObject)abstract_lexicon.$sym283$ABSTRACT_LEXICON_ALLOWED_PREDICATE__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym249$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.$list244, (SubLObject)abstract_lexicon.$list284);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym249$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_, (SubLObject)abstract_lexicon.$sym286$ABSTRACT_LEXICON_NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym287$ALLOW_POS, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.$list288, (SubLObject)abstract_lexicon.$list289);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym287$ALLOW_POS, (SubLObject)abstract_lexicon.$sym291$ABSTRACT_LEXICON_ALLOW_POS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym292$EXCLUDE_POS, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.$list288, (SubLObject)abstract_lexicon.$list293);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym292$EXCLUDE_POS, (SubLObject)abstract_lexicon.$sym295$ABSTRACT_LEXICON_EXCLUDE_POS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym296$EXCLUDED_POS_, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.$list288, (SubLObject)abstract_lexicon.$list297);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym296$EXCLUDED_POS_, (SubLObject)abstract_lexicon.$sym299$ABSTRACT_LEXICON_EXCLUDED_POS__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym247$ALLOWED_POS_, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.$list288, (SubLObject)abstract_lexicon.$list300);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym247$ALLOWED_POS_, (SubLObject)abstract_lexicon.$sym302$ABSTRACT_LEXICON_ALLOWED_POS__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym251$NL_TRIE_ENTRY_HAS_ALLOWED_POS_, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.$list244, (SubLObject)abstract_lexicon.$list303);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym251$NL_TRIE_ENTRY_HAS_ALLOWED_POS_, (SubLObject)abstract_lexicon.$sym305$ABSTRACT_LEXICON_NL_TRIE_ENTRY_HAS_ALLOWED_POS__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym306$ADD_LEARNER, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list307, (SubLObject)abstract_lexicon.$list308);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym306$ADD_LEARNER, (SubLObject)abstract_lexicon.$sym310$ABSTRACT_LEXICON_ADD_LEARNER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym311$REMOVE_LEARNER, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list307, (SubLObject)abstract_lexicon.$list312);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym311$REMOVE_LEARNER, (SubLObject)abstract_lexicon.$sym314$ABSTRACT_LEXICON_REMOVE_LEARNER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym315$GET_LEARNERS, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list316);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym315$GET_LEARNERS, (SubLObject)abstract_lexicon.$sym318$ABSTRACT_LEXICON_GET_LEARNERS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym319$SET_LEARNERS, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list320, (SubLObject)abstract_lexicon.$list321);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym319$SET_LEARNERS, (SubLObject)abstract_lexicon.$sym323$ABSTRACT_LEXICON_SET_LEARNERS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym206$INITIALIZE_ALLOWED_MTS, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list324, (SubLObject)abstract_lexicon.$list325, (SubLObject)abstract_lexicon.$list326);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym206$INITIALIZE_ALLOWED_MTS, (SubLObject)abstract_lexicon.$sym337$ABSTRACT_LEXICON_INITIALIZE_ALLOWED_MTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym338$SET_BASE_MT, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list339, (SubLObject)abstract_lexicon.$list340);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym338$SET_BASE_MT, (SubLObject)abstract_lexicon.$sym342$ABSTRACT_LEXICON_SET_BASE_MT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym343$GET_BASE_MT, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list344);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym343$GET_BASE_MT, (SubLObject)abstract_lexicon.$sym346$ABSTRACT_LEXICON_GET_BASE_MT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym335$ALLOW_MT, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list339, (SubLObject)abstract_lexicon.$list347);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym335$ALLOW_MT, (SubLObject)abstract_lexicon.$sym350$ABSTRACT_LEXICON_ALLOW_MT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym351$ALLOW_GENL_MTS, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list339, (SubLObject)abstract_lexicon.$list352);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym351$ALLOW_GENL_MTS, (SubLObject)abstract_lexicon.$sym357$ABSTRACT_LEXICON_ALLOW_GENL_MTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym336$FORBID_MT, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list243, (SubLObject)abstract_lexicon.$list339, (SubLObject)abstract_lexicon.$list358);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym336$FORBID_MT, (SubLObject)abstract_lexicon.$sym359$ABSTRACT_LEXICON_FORBID_MT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym250$ALLOWED_MT_, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list324, (SubLObject)abstract_lexicon.$list339, (SubLObject)abstract_lexicon.$list360);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym250$ALLOWED_MT_, (SubLObject)abstract_lexicon.$sym361$ABSTRACT_LEXICON_ALLOWED_MT__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym187$ROOT_MT, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list362, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list363);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym187$ROOT_MT, (SubLObject)abstract_lexicon.$sym364$ABSTRACT_LEXICON_ROOT_MT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym365$ADD_STOP_WORD, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.$list366, (SubLObject)abstract_lexicon.$list367);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym365$ADD_STOP_WORD, (SubLObject)abstract_lexicon.$sym369$ABSTRACT_LEXICON_ADD_STOP_WORD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym246$STOP_WORD_P, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.$list366, (SubLObject)abstract_lexicon.$list370);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym246$STOP_WORD_P, (SubLObject)abstract_lexicon.$sym372$ABSTRACT_LEXICON_STOP_WORD_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym373$GET_STOP_WORDS, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list374);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym373$GET_STOP_WORDS, (SubLObject)abstract_lexicon.$sym376$ABSTRACT_LEXICON_GET_STOP_WORDS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym86$COPY, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list377, (SubLObject)abstract_lexicon.$list378);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym86$COPY, (SubLObject)abstract_lexicon.$sym384$ABSTRACT_LEXICON_COPY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list366, (SubLObject)abstract_lexicon.$list385);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym70$GET, (SubLObject)abstract_lexicon.$sym391$ABSTRACT_LEXICON_GET_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym393$DELETE, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list366, (SubLObject)abstract_lexicon.$list394);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym393$DELETE, (SubLObject)abstract_lexicon.$sym396$ABSTRACT_LEXICON_DELETE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym397$DELETE_ENTRY_FROM_STRING, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list398, (SubLObject)abstract_lexicon.$list399);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym397$DELETE_ENTRY_FROM_STRING, (SubLObject)abstract_lexicon.$sym402$ABSTRACT_LEXICON_DELETE_ENTRY_FROM_STRING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym404$ADD, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list405, (SubLObject)abstract_lexicon.$list406);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym404$ADD, (SubLObject)abstract_lexicon.$sym408$ABSTRACT_LEXICON_ADD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym409$LEARNED_, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list405, (SubLObject)abstract_lexicon.$list410);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym409$LEARNED_, (SubLObject)abstract_lexicon.$sym412$ABSTRACT_LEXICON_LEARNED__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym413$FORGET, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list414);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym413$FORGET, (SubLObject)abstract_lexicon.$sym416$ABSTRACT_LEXICON_FORGET_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym417$PREFIXES, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list418, (SubLObject)abstract_lexicon.$list419);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym417$PREFIXES, (SubLObject)abstract_lexicon.$sym422$ABSTRACT_LEXICON_PREFIXES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym423$PREFIXES_FROM_STRING, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list366, (SubLObject)abstract_lexicon.$list424);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym423$PREFIXES_FROM_STRING, (SubLObject)abstract_lexicon.$sym426$ABSTRACT_LEXICON_PREFIXES_FROM_STRING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym429$PREFIX_KEYS, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list418, (SubLObject)abstract_lexicon.$list430);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym429$PREFIX_KEYS, (SubLObject)abstract_lexicon.$sym432$ABSTRACT_LEXICON_PREFIX_KEYS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym433$PREFIX_KEYS_FROM_STRING, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list366, (SubLObject)abstract_lexicon.$list434);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym433$PREFIX_KEYS_FROM_STRING, (SubLObject)abstract_lexicon.$sym436$ABSTRACT_LEXICON_PREFIX_KEYS_FROM_STRING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym437$LEARN, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list438, (SubLObject)abstract_lexicon.$list439);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym437$LEARN, (SubLObject)abstract_lexicon.$sym441$ABSTRACT_LEXICON_LEARN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym442$NUMBER_LEARN, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.$list443, (SubLObject)abstract_lexicon.$list444);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym442$NUMBER_LEARN, (SubLObject)abstract_lexicon.$sym445$ABSTRACT_LEXICON_NUMBER_LEARN_METHOD);
        memoization_state.note_globally_cached_function((SubLObject)abstract_lexicon.$sym452$SCALAR_FUNCTION_);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym455$NOUN_COMPOUND_LEARN, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.$list443, (SubLObject)abstract_lexicon.$list456);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym455$NOUN_COMPOUND_LEARN, (SubLObject)abstract_lexicon.$sym457$ABSTRACT_LEXICON_NOUN_COMPOUND_LEARN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym470$COOCCURRENCE_STATISTICS_LEARN, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list66, (SubLObject)abstract_lexicon.$list443, (SubLObject)abstract_lexicon.$list456);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym470$COOCCURRENCE_STATISTICS_LEARN, (SubLObject)abstract_lexicon.$sym471$ABSTRACT_LEXICON_COOCCURRENCE_STATISTICS_LEARN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym472$LEXIFY_DOCUMENT, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list473, (SubLObject)abstract_lexicon.$list474);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym472$LEXIFY_DOCUMENT, (SubLObject)abstract_lexicon.$sym478$ABSTRACT_LEXICON_LEXIFY_DOCUMENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym479$LEXIFY_DOCUMENT_EXHAUSTIVELY, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list473, (SubLObject)abstract_lexicon.$list480);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym479$LEXIFY_DOCUMENT_EXHAUSTIVELY, (SubLObject)abstract_lexicon.$sym482$ABSTRACT_LEXICON_LEXIFY_DOCUMENT_EXHAUSTIVELY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym476$LEXIFY_PARAGRAPH, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list483, (SubLObject)abstract_lexicon.$list484);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym476$LEXIFY_PARAGRAPH, (SubLObject)abstract_lexicon.$sym487$ABSTRACT_LEXICON_LEXIFY_PARAGRAPH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym481$LEXIFY_PARAGRAPH_EXHAUSTIVELY, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list483, (SubLObject)abstract_lexicon.$list488);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym481$LEXIFY_PARAGRAPH_EXHAUSTIVELY, (SubLObject)abstract_lexicon.$sym490$ABSTRACT_LEXICON_LEXIFY_PARAGRAPH_EXHAUSTIVELY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym486$LEXIFY_SENTENCE, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list491, (SubLObject)abstract_lexicon.$list492);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym486$LEXIFY_SENTENCE, (SubLObject)abstract_lexicon.$sym496$ABSTRACT_LEXICON_LEXIFY_SENTENCE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym489$LEXIFY_SENTENCE_EXHAUSTIVELY, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list491, (SubLObject)abstract_lexicon.$list497);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym489$LEXIFY_SENTENCE_EXHAUSTIVELY, (SubLObject)abstract_lexicon.$sym499$ABSTRACT_LEXICON_LEXIFY_SENTENCE_EXHAUSTIVELY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym514$LEXIFY_WORDS, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list515, (SubLObject)abstract_lexicon.$list516);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym514$LEXIFY_WORDS, (SubLObject)abstract_lexicon.$sym519$ABSTRACT_LEXICON_LEXIFY_WORDS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym521$TOKENIZE, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.$list366, (SubLObject)abstract_lexicon.$list522);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym521$TOKENIZE, (SubLObject)abstract_lexicon.$sym524$ABSTRACT_LEXICON_TOKENIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)abstract_lexicon.$sym534$ITERATOR, (SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$list71, (SubLObject)abstract_lexicon.NIL, (SubLObject)abstract_lexicon.$list535);
        methods.subloop_register_instance_method((SubLObject)abstract_lexicon.$sym174$ABSTRACT_LEXICON, (SubLObject)abstract_lexicon.$sym534$ITERATOR, (SubLObject)abstract_lexicon.$sym536$ABSTRACT_LEXICON_ITERATOR_METHOD);
        utilities_macros.register_cyc_api_function((SubLObject)abstract_lexicon.$sym538$NEW_LEXICON_FROM_KB_SPEC, (SubLObject)abstract_lexicon.$list539, (SubLObject)abstract_lexicon.$str540$_param_KB_SPEC__the_CycL_type_of_, (SubLObject)abstract_lexicon.$list541, (SubLObject)abstract_lexicon.$list542);
        memoization_state.note_globally_cached_function((SubLObject)abstract_lexicon.$sym546$PREDS_FOR_LEXICON_EXCLUSION);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), abstract_lexicon.$dtp_abstract_lexicon_iterator_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)abstract_lexicon.$sym562$ABSTRACT_LEXICON_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)abstract_lexicon.$list563);
        Structures.def_csetf((SubLObject)abstract_lexicon.$sym564$ABSTRACT_LEXICON_ITERATOR_STATE_TRIE_ITERATOR, (SubLObject)abstract_lexicon.$sym565$_CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_TRIE_ITERATOR);
        Structures.def_csetf((SubLObject)abstract_lexicon.$sym566$ABSTRACT_LEXICON_ITERATOR_STATE_NEXT_ENTRIES, (SubLObject)abstract_lexicon.$sym567$_CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_NEXT_ENTRIES);
        Structures.def_csetf((SubLObject)abstract_lexicon.$sym568$ABSTRACT_LEXICON_ITERATOR_STATE_LEXICON, (SubLObject)abstract_lexicon.$sym569$_CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_LEXICON);
        Equality.identity((SubLObject)abstract_lexicon.$sym555$ABSTRACT_LEXICON_ITERATOR_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), abstract_lexicon.$dtp_abstract_lexicon_iterator_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)abstract_lexicon.$sym574$VISIT_DEFSTRUCT_OBJECT_ABSTRACT_LEXICON_ITERATOR_STATE_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)abstract_lexicon.$sym553$ABSTRACT_LEXICON_ITERATOR_STATE_DONE_P);
        utilities_macros.note_funcall_helper_function((SubLObject)abstract_lexicon.$sym554$ABSTRACT_LEXICON_ITERATOR_STATE_NEXT);
        generic_testing.define_test_case_table_int((SubLObject)abstract_lexicon.$sym589$SCALAR_INTERVAL_MEANINGS, (SubLObject)ConsesLow.list(new SubLObject[] { abstract_lexicon.$kw590$TEST, abstract_lexicon.EQUALP, abstract_lexicon.$kw591$OWNER, abstract_lexicon.NIL, abstract_lexicon.$kw592$CLASSES, abstract_lexicon.NIL, abstract_lexicon.$kw593$KB, abstract_lexicon.$kw594$FULL, abstract_lexicon.$kw595$WORKING_, abstract_lexicon.T }), (SubLObject)abstract_lexicon.$list596);
        generic_testing.define_test_case_table_int((SubLObject)abstract_lexicon.$sym597$TEXT_NUMBERS, (SubLObject)ConsesLow.list(new SubLObject[] { abstract_lexicon.$kw590$TEST, abstract_lexicon.EQUALP, abstract_lexicon.$kw591$OWNER, abstract_lexicon.NIL, abstract_lexicon.$kw592$CLASSES, abstract_lexicon.NIL, abstract_lexicon.$kw593$KB, abstract_lexicon.$kw594$FULL, abstract_lexicon.$kw595$WORKING_, abstract_lexicon.T }), (SubLObject)abstract_lexicon.$list598);
        generic_testing.define_test_case_table_int((SubLObject)abstract_lexicon.$sym602$NUMBER_MEANINGS, (SubLObject)ConsesLow.list(new SubLObject[] { abstract_lexicon.$kw590$TEST, abstract_lexicon.$sym603$NUMBER_MEANINGS_RESULTS_EQUAL_, abstract_lexicon.$kw591$OWNER, abstract_lexicon.NIL, abstract_lexicon.$kw592$CLASSES, abstract_lexicon.NIL, abstract_lexicon.$kw593$KB, abstract_lexicon.$kw594$FULL, abstract_lexicon.$kw595$WORKING_, abstract_lexicon.T }), (SubLObject)abstract_lexicon.$list604);
        generic_testing.define_test_case_table_int((SubLObject)abstract_lexicon.$sym605$TOKENIZING_TEST_COVERING, (SubLObject)ConsesLow.list(new SubLObject[] { abstract_lexicon.$kw590$TEST, abstract_lexicon.EQUALP, abstract_lexicon.$kw591$OWNER, abstract_lexicon.NIL, abstract_lexicon.$kw592$CLASSES, abstract_lexicon.NIL, abstract_lexicon.$kw593$KB, abstract_lexicon.$kw594$FULL, abstract_lexicon.$kw595$WORKING_, abstract_lexicon.T }), (SubLObject)abstract_lexicon.$list606);
        return (SubLObject)abstract_lexicon.NIL;
    }

    private static SubLObject _constant_175_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-EXCLUDE-MTS"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WebSearchDataMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclistsMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationParaphraseMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetMappingMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PornographyJargonMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CommonEnglishMisspellingsMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ComputereseLexicalMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclishMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporaryLexicalAssertionsMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishWordSenseAssertions-HoldingMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporaryLexicalAssertions-WordNetImportMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RedundantLexicalMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PDATemplateTestMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishParaphraseMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SupplementalDeterminerSemTransLexicalMt")) }))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-EXCLUDE-PREDICATES"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ELEMENT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("*SEMANTIC-PREDICATES-EXCLUDED-FROM-LEXICAL-LOOKUP*"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-BASE-MT"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AllGeneralEnglishValidatedLexicalMicrotheoryPSC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-KB-SPEC"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbstractLexiconSpecification"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALLOWED-MTS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("UNINITIALIZED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-MTS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("UNINITIALIZED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BASE-MT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("UNINITIALIZED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ROOT-MT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("UNINITIALIZED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-PREDS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("UNINITIALIZED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)abstract_lexicon.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRIE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE-CACHE?"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALLOW-FABRICATION?"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)abstract_lexicon.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEARNED"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALLOW-STEMMING"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)abstract_lexicon.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STOP-WORDS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)abstract_lexicon.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RESPORATOR-CYC-POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RESPORATOR-TO-INFLECTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RESPORATOR-TO-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE.STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("VALID-NL-TRIE-ENTRY?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COPY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FORGET"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PREFIXES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PREFIXES-FROM-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-DOCUMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOCUMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-PARAGRAPH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPH")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-SENTENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENIZE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-WORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORDS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ITERATOR"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-ALLOWED-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB-SPEC")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-BASE-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-BASE-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOW-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOW-GENL-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FORBID-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-EXCLUDED-PREDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED-LIST")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOW-PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDE-PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOW-POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDE-POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-LEARNER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEARNER")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE-LEARNER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEARNER")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LEARNERS"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-CACHE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEAN")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-CACHE?"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOW-STEMMING"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CASE-SENSITIVITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENSITIVITY")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CASE-SENSITIVITY"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FORBID-STEMMING"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOW-FABRICATION"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FORBID-FABRICATION"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FABRICATION-FORBIDDEN?"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FABRICATION-ALLOWED?"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NOUN-COMPOUND-LEARN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COOCCURRENCE-STATISTICS-LEARN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
    }

    public void declareFunctions() {
        declare_abstract_lexicon_file();
    }

    public void initializeVariables() {
        init_abstract_lexicon_file();
    }

    public void runTopLevelForms() {
        setup_abstract_lexicon_file();
    }

    static {
        me = (SubLFile)new abstract_lexicon();
        abstract_lexicon.$cyc_to_penn_list$ = null;
        abstract_lexicon.$cyc_to_penn_map$ = null;
        abstract_lexicon.$cyc_to_supertag_map$ = null;
        abstract_lexicon.$cyc_to_supertag_list$ = null;
        abstract_lexicon.$dtp_textract_lemma$ = null;
        abstract_lexicon.$nominal_tags$ = null;
        abstract_lexicon.$verbal_tags$ = null;
        abstract_lexicon.$adjectival_tags$ = null;
        abstract_lexicon.$adverbial_tags$ = null;
        abstract_lexicon.$penn_tag_backoffs$ = null;
        abstract_lexicon.$scalar_functionP_caching_state$ = null;
        abstract_lexicon.$lexify_sentence_ignore_pos_for_multiword_tokens$ = null;
        abstract_lexicon.$preds_for_lexicon_exclusion_caching_state$ = null;
        abstract_lexicon.$dtp_abstract_lexicon_iterator_state$ = null;
        $list0 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("."), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Punctuation-SP")), (SubLObject)abstract_lexicon.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WP"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WHPronoun")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pronounStrings"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("``"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Punctuation-SP")), (SubLObject)abstract_lexicon.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PossessiveMarker")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("possessiveMarkerStrings"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RB"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adverb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularAdverb"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JJ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularDegree"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("''"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Punctuation-SP")), (SubLObject)abstract_lexicon.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MD"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Modal")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("verbStrings"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AUX"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AuxVerb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("verbStrings"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VB"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("infinitive"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Determiner")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("determinerStrings"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VBD"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pastTense-Generic"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NN"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NNS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural-Generic"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VBG"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("presentParticiple"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RP"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VerbParticle")), (SubLObject)abstract_lexicon.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TO"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfinitiveComp")), (SubLObject)abstract_lexicon.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TO"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Preposition")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("prepositionStrings"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CC"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoordinatingConjunction")), (SubLObject)abstract_lexicon.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JJR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comparativeDegree"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RBR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adverb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comparativeAdverb"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VBN"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("perfect"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VBN"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("passiveParticiple"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CD"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Number-SP")), (SubLObject)abstract_lexicon.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JJS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("superlativeDegree"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RBS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adverb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("superlativeAdverb"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PDT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predeterminer")), (SubLObject)abstract_lexicon.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VBP"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonThirdSg-Present"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WRB"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WHAdverb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularAdverb"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WP$"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WHPossessive")), (SubLObject)abstract_lexicon.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NNP"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNoun")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NNP"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNoun")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameSpelling"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NNPS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNoun")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural-Generic"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WDT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WHDeterminer")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("determinerStrings"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRP"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pronoun")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pronounStrings"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VBZ"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Present"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRP$"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PossessivePronoun")), (SubLObject)abstract_lexicon.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("IN"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Preposition")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("prepositionStrings"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("IN"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Complementizer")), (SubLObject)abstract_lexicon.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("IN"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubordinatingConjunction")), (SubLObject)abstract_lexicon.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EX"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("There-Existential")), (SubLObject)abstract_lexicon.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UH"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Interjection-SpeechPart")), (SubLObject)abstract_lexicon.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword(":"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Punctuation-SP")), (SubLObject)abstract_lexicon.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("$"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Punctuation-SP")), (SubLObject)abstract_lexicon.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword(","), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Punctuation-SP")), (SubLObject)abstract_lexicon.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword(")"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Punctuation-SP")), (SubLObject)abstract_lexicon.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("("), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Punctuation-SP")), (SubLObject)abstract_lexicon.NIL) });
        $sym1$GENL_IN_ANY_MT_ = SubLObjectFactory.makeSymbol("GENL-IN-ANY-MT?");
        $sym2$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $int3$500 = SubLObjectFactory.makeInteger(500);
        $sym4$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const5$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const6$partOfSpeech = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("partOfSpeech"));
        $const7$GeneralLexiconMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralLexiconMt"));
        $list8 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("A_nx0V")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntransitiveVerbFrame")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tensed"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("A_nx0V")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MiddleVoiceFrame")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tensed"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("A_nx0Vnx1")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransitiveNPFrame")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tensed"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("A_nx0Vnx1nx2"), (SubLObject)SubLObjectFactory.makeString("A_nx0Vnx2nx1")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DitransitiveNP-NPFrame")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tensed"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("A_nx0Vpnx1"), (SubLObject)SubLObjectFactory.makeString("A_nx0Vpx1")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransitivePPFrameType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tensed"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("A_nx0Vnx1pnx2"), (SubLObject)SubLObjectFactory.makeString("A_nx0Vnx1px2")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DitransitivePPFrameType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tensed"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("A_nx0V")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnderstoodReciprocalObjectFrame")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tensed"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("A_Gnx0V")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntransitiveVerbFrame")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("presentParticiple"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("A_Gnx0Vnx1")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransitiveNPFrame")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("presentParticiple"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("A_Gnx0Vnx1nx2")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DitransitiveNP-NPFrame")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("presentParticiple"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("A_Gnx0Vpnx1"), (SubLObject)SubLObjectFactory.makeString("A_Gnx0Vpx1")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransitivePPFrameType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("presentParticiple"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("A_Gnx0Vnx1pnx2"), (SubLObject)SubLObjectFactory.makeString("A_Gnx0Vnx1px2"), (SubLObject)SubLObjectFactory.makeString("B_Nn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DitransitivePPFrameType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("presentParticiple"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("B_Vvx")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AuxVerb"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("A_NXN"), (SubLObject)SubLObjectFactory.makeString("B_Nn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RegularNounFrame")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nounStrings"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("A_NXN")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GenitiveFrame")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nounStrings"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("B_nxPnx")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Preposition")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Post-NounPhraseModifyingFrame")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("prepositionStrings"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("B_vxPnx")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Preposition")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VerbPhraseModifyingFrame")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("prepositionStrings"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("B_Dnx")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Determiner"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("B_An")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RegularAdjFrame")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("adjStrings"))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("B_vxARB"), (SubLObject)SubLObjectFactory.makeString("B_ARBvx"), (SubLObject)SubLObjectFactory.makeString("B_ARBs")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adverb")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VerbPhraseModifyingFrame")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("adverbStrings"))) });
        $const9$GeneralEnglishMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt"));
        $sym10$TEXTRACT_LEMMA = SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA");
        $sym11$TEXTRACT_LEMMA_P = SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-P");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPH"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("CANON"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"));
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PARAGRAPH"), (SubLObject)SubLObjectFactory.makeKeyword("SENTENCE"), (SubLObject)SubLObjectFactory.makeKeyword("WORD"), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeKeyword("CANON"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-PARAGRAPH"), (SubLObject)SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-WORD"), (SubLObject)SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-CANON"), (SubLObject)SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-TYPE"));
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TEXTRACT-LEMMA-PARAGRAPH"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TEXTRACT-LEMMA-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TEXTRACT-LEMMA-WORD"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TEXTRACT-LEMMA-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TEXTRACT-LEMMA-CANON"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TEXTRACT-LEMMA-TYPE"));
        $sym16$TEXTRACT_LEMMA_PRINT = SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-PRINT");
        $sym17$TEXTRACT_LEMMA_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-PRINT-FUNCTION-TRAMPOLINE");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-P"));
        $sym19$TEXTRACT_LEMMA_PARAGRAPH = SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-PARAGRAPH");
        $sym20$_CSETF_TEXTRACT_LEMMA_PARAGRAPH = SubLObjectFactory.makeSymbol("_CSETF-TEXTRACT-LEMMA-PARAGRAPH");
        $sym21$TEXTRACT_LEMMA_SENTENCE = SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-SENTENCE");
        $sym22$_CSETF_TEXTRACT_LEMMA_SENTENCE = SubLObjectFactory.makeSymbol("_CSETF-TEXTRACT-LEMMA-SENTENCE");
        $sym23$TEXTRACT_LEMMA_WORD = SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-WORD");
        $sym24$_CSETF_TEXTRACT_LEMMA_WORD = SubLObjectFactory.makeSymbol("_CSETF-TEXTRACT-LEMMA-WORD");
        $sym25$TEXTRACT_LEMMA_STRING = SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-STRING");
        $sym26$_CSETF_TEXTRACT_LEMMA_STRING = SubLObjectFactory.makeSymbol("_CSETF-TEXTRACT-LEMMA-STRING");
        $sym27$TEXTRACT_LEMMA_CANON = SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-CANON");
        $sym28$_CSETF_TEXTRACT_LEMMA_CANON = SubLObjectFactory.makeSymbol("_CSETF-TEXTRACT-LEMMA-CANON");
        $sym29$TEXTRACT_LEMMA_TYPE = SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-TYPE");
        $sym30$_CSETF_TEXTRACT_LEMMA_TYPE = SubLObjectFactory.makeSymbol("_CSETF-TEXTRACT-LEMMA-TYPE");
        $kw31$PARAGRAPH = SubLObjectFactory.makeKeyword("PARAGRAPH");
        $kw32$SENTENCE = SubLObjectFactory.makeKeyword("SENTENCE");
        $kw33$WORD = SubLObjectFactory.makeKeyword("WORD");
        $kw34$STRING = SubLObjectFactory.makeKeyword("STRING");
        $kw35$CANON = SubLObjectFactory.makeKeyword("CANON");
        $kw36$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $str37$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw38$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym39$MAKE_TEXTRACT_LEMMA = SubLObjectFactory.makeSymbol("MAKE-TEXTRACT-LEMMA");
        $kw40$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw41$END = SubLObjectFactory.makeKeyword("END");
        $sym42$VISIT_DEFSTRUCT_OBJECT_TEXTRACT_LEMMA_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TEXTRACT-LEMMA-METHOD");
        $sym43$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym44$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $list45 = ConsesLow.list((SubLObject)Characters.CHAR_lparen, (SubLObject)Characters.CHAR_lbracket);
        $list46 = ConsesLow.list((SubLObject)Characters.CHAR_lbracket, (SubLObject)Characters.CHAR_rbracket);
        $str47$__TEXTRACT_LEMMA_ = SubLObjectFactory.makeString("#<TEXTRACT-LEMMA ");
        $str48$_ = SubLObjectFactory.makeString("/");
        $str49$_ = SubLObjectFactory.makeString(">");
        $sym50$LEX_ENTRY = SubLObjectFactory.makeSymbol("LEX-ENTRY");
        $sym51$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list52 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STORED-PROPERTIES"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("STRING"), SubLObjectFactory.makeKeyword("WORD-UNIT"), SubLObjectFactory.makeKeyword("INFLECTIONS"), SubLObjectFactory.makeKeyword("PREDICATE"), SubLObjectFactory.makeKeyword("DENOTS"), SubLObjectFactory.makeKeyword("DENOT"), SubLObjectFactory.makeKeyword("PRAGMATICS"), SubLObjectFactory.makeKeyword("MT"), SubLObjectFactory.makeKeyword("SEMTRANS"), SubLObjectFactory.makeKeyword("FRAME"), SubLObjectFactory.makeKeyword("TRIE-ENTRY") }))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPUTED-PROPERTIES"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PENN-TAGS"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-PENN-TAGS")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("BACKOFF-PENN-TAGS"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-BACKOFF-PENN-TAGS")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-TERM")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("GENDER"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-GENDER")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SUPER-TAGS"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-SUPER-TAGS")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CYC-POS"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-CYC-POS")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CYC-CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-CYC-CATEGORY")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("IS-NER-ENTRY?"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-IS-NER-ENTRY"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORTED-PROPERTIES"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("STORED-PROPERTIES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTED-PROPERTIES")))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COPY"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTY")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-P"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("VERBAL-P"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADJECTIVAL-P"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADVERBIAL-P"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-PENN-TAGS"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-BACKOFF-PENN-TAGS"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-SUPER-TAGS"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NOUN?"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym53$PROPERTIES = SubLObjectFactory.makeSymbol("PROPERTIES");
        $sym54$SUPPORTED_PROPERTIES = SubLObjectFactory.makeSymbol("SUPPORTED-PROPERTIES");
        $sym55$COMPUTED_PROPERTIES = SubLObjectFactory.makeSymbol("COMPUTED-PROPERTIES");
        $sym56$STORED_PROPERTIES = SubLObjectFactory.makeSymbol("STORED-PROPERTIES");
        $sym57$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $list58 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("STRING"), SubLObjectFactory.makeKeyword("WORD-UNIT"), SubLObjectFactory.makeKeyword("INFLECTIONS"), SubLObjectFactory.makeKeyword("PREDICATE"), SubLObjectFactory.makeKeyword("DENOTS"), SubLObjectFactory.makeKeyword("DENOT"), SubLObjectFactory.makeKeyword("PRAGMATICS"), SubLObjectFactory.makeKeyword("MT"), SubLObjectFactory.makeKeyword("SEMTRANS"), SubLObjectFactory.makeKeyword("FRAME"), SubLObjectFactory.makeKeyword("TRIE-ENTRY") });
        $list59 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("PENN-TAGS"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-PENN-TAGS")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("BACKOFF-PENN-TAGS"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-BACKOFF-PENN-TAGS")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-TERM")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("GENDER"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-GENDER")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("SUPER-TAGS"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-SUPER-TAGS")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CYC-POS"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-CYC-POS")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CYC-CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-CYC-CATEGORY")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("IS-NER-ENTRY?"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-IS-NER-ENTRY")));
        $sym60$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym61$SUBLOOP_RESERVED_INITIALIZE_LEX_ENTRY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEX-ENTRY-CLASS");
        $sym62$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym63$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym64$SUBLOOP_RESERVED_INITIALIZE_LEX_ENTRY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEX-ENTRY-INSTANCE");
        $sym65$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return lex-entry-p; a new empty lex-entry"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"), (SubLObject)abstract_lexicon.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym68$OUTER_CATCH_FOR_LEX_ENTRY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LEX-ENTRY-METHOD");
        $sym69$LEX_ENTRY_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-INITIALIZE-METHOD");
        $sym70$GET = SubLObjectFactory.makeSymbol("GET");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTY"));
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return object; the property value associated with PROPERTY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTED-PROPERTIES")))), (SubLObject)SubLObjectFactory.makeString("Unsupported lexical property ~a"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSOC"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTY"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTY-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSOC"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTED-PROPERTIES"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTY-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTY-METHOD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"))));
        $sym74$OUTER_CATCH_FOR_LEX_ENTRY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LEX-ENTRY-METHOD");
        $str75$Unsupported_lexical_property__a = SubLObjectFactory.makeString("Unsupported lexical property ~a");
        $sym76$LEX_ENTRY_GET_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-GET-METHOD");
        $kw77$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $kw78$SEMTRANS = SubLObjectFactory.makeKeyword("SEMTRANS");
        $kw79$TRIE_ENTRY = SubLObjectFactory.makeKeyword("TRIE-ENTRY");
        $sym80$SET = SubLObjectFactory.makeSymbol("SET");
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Sets this lex-entry's PROPERTY to VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTED-PROPERTIES")))), (SubLObject)SubLObjectFactory.makeString("Unsupported lexical property ~a"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTY"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)abstract_lexicon.EQ), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")));
        $sym83$OUTER_CATCH_FOR_LEX_ENTRY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LEX-ENTRY-METHOD");
        $sym84$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym85$LEX_ENTRY_SET_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-SET-METHOD");
        $sym86$COPY = SubLObjectFactory.makeSymbol("COPY");
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("make a deep-copy of self"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PROPERTIES"), (SubLObject)abstract_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY.VAL"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("KEY.VAL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("KEY.VAL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-VAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("VAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("VAL")), (SubLObject)SubLObjectFactory.makeSymbol("VAL")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VAL")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROPERTIES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROPERTIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ENTRY"))));
        $sym88$OUTER_CATCH_FOR_LEX_ENTRY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LEX-ENTRY-METHOD");
        $sym89$LEX_ENTRY_COPY_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-COPY-METHOD");
        $sym90$NOUN_ = SubLObjectFactory.makeSymbol("NOUN?");
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("READ-ONLY"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeKeyword("ANY")));
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; Does this LEX-ENTRY represent a noun?\n                     i.e. Is its :CYC-POS property value a spec of #$Noun?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.EQ, (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeKeyword("ANY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-IN-ANY-MT?"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL?"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun")), (SubLObject)SubLObjectFactory.makeSymbol("MT"))))));
        $kw94$ANY = SubLObjectFactory.makeKeyword("ANY");
        $kw95$CYC_POS = SubLObjectFactory.makeKeyword("CYC-POS");
        $const96$Noun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"));
        $sym97$LEX_ENTRY_NOUN__METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-NOUN?-METHOD");
        $sym98$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Prints this lex-entry to STREAM, ignoring DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("#<LEX-ENTRY "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERPRI"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTY"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIN1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTY")), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(" -> "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIN1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTY")), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERPRI"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(">"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERPRI"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym101$OUTER_CATCH_FOR_LEX_ENTRY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LEX-ENTRY-METHOD");
        $str102$__LEX_ENTRY_ = SubLObjectFactory.makeString("#<LEX-ENTRY ");
        $str103$____ = SubLObjectFactory.makeString(" -> ");
        $sym104$LEX_ENTRY_PRINT_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-PRINT-METHOD");
        $list105 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NN"), (SubLObject)SubLObjectFactory.makeKeyword("NNS"), (SubLObject)SubLObjectFactory.makeKeyword("NNP"), (SubLObject)SubLObjectFactory.makeKeyword("NNPS"), (SubLObject)SubLObjectFactory.makeKeyword("WP"), (SubLObject)SubLObjectFactory.makeKeyword("PP"), (SubLObject)SubLObjectFactory.makeKeyword("PRP"), (SubLObject)SubLObjectFactory.makeKeyword("FW"));
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VBZ"), (SubLObject)SubLObjectFactory.makeKeyword("VBN"), (SubLObject)SubLObjectFactory.makeKeyword("VBD"), (SubLObject)SubLObjectFactory.makeKeyword("VBP"), (SubLObject)SubLObjectFactory.makeKeyword("VB"), (SubLObject)SubLObjectFactory.makeKeyword("VBG"));
        $list107 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JJ"), (SubLObject)SubLObjectFactory.makeKeyword("JJR"), (SubLObject)SubLObjectFactory.makeKeyword("JJS"));
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RB"), (SubLObject)SubLObjectFactory.makeKeyword("RBR"), (SubLObject)SubLObjectFactory.makeKeyword("RBS"), (SubLObject)SubLObjectFactory.makeKeyword("WRB"));
        $sym109$NOMINAL_P = SubLObjectFactory.makeSymbol("NOMINAL-P");
        $list110 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERSECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("PENN-TAGS")), (SubLObject)SubLObjectFactory.makeSymbol("*NOMINAL-TAGS*"))));
        $kw111$PENN_TAGS = SubLObjectFactory.makeKeyword("PENN-TAGS");
        $sym112$LEX_ENTRY_NOMINAL_P_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-NOMINAL-P-METHOD");
        $sym113$VERBAL_P = SubLObjectFactory.makeSymbol("VERBAL-P");
        $list114 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERSECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("PENN-TAGS")), (SubLObject)SubLObjectFactory.makeSymbol("*VERBAL-TAGS*"))));
        $sym115$LEX_ENTRY_VERBAL_P_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-VERBAL-P-METHOD");
        $sym116$ADJECTIVAL_P = SubLObjectFactory.makeSymbol("ADJECTIVAL-P");
        $list117 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERSECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("PENN-TAGS")), (SubLObject)SubLObjectFactory.makeSymbol("*ADJECTIVAL-TAGS*"))));
        $sym118$LEX_ENTRY_ADJECTIVAL_P_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-ADJECTIVAL-P-METHOD");
        $sym119$ADVERBIAL_P = SubLObjectFactory.makeSymbol("ADVERBIAL-P");
        $list120 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERSECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("PENN-TAGS")), (SubLObject)SubLObjectFactory.makeSymbol("*ADVERBIAL-TAGS*"))));
        $sym121$LEX_ENTRY_ADVERBIAL_P_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-ADVERBIAL-P-METHOD");
        $sym122$COMPUTE_TERM = SubLObjectFactory.makeSymbol("COMPUTE-TERM");
        $list123 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return constantp; a single constant derived from this lex entry's\n    semantics"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VERBAL-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Invalid lexical property :term called on ~a"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("DENOT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.EQL, (SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"))), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.EQL, (SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.EQL, (SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-CONNECTIVE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUANTIFIER-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CENTRAL-KEYWORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-P"))), (SubLObject)SubLObjectFactory.makeKeyword("NOUN")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VERBAL-P"))), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAIN-COLLECTION"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"), (SubLObject)SubLObjectFactory.makeSymbol("CENTRAL-KEYWORD"))))), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"))))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"))));
        $str124$Invalid_lexical_property__term_ca = SubLObjectFactory.makeString("Invalid lexical property :term called on ~a");
        $const125$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $const126$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const127$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $kw128$NOUN = SubLObjectFactory.makeKeyword("NOUN");
        $kw129$ACTION = SubLObjectFactory.makeKeyword("ACTION");
        $sym130$LEX_ENTRY_COMPUTE_TERM_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-COMPUTE-TERM-METHOD");
        $sym131$COMPUTE_GENDER = SubLObjectFactory.makeSymbol("COMPUTE-GENDER");
        $list132 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp;  a list of genders of this lex entry with possible gender values \n   :FEMININE, :MASCULINE and :NEUTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Invalid lexical property :gender called on ~a"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENDERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("TERM")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MORE-SPECIFIC-P"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MaleAnimal")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("GENDERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MASCULINE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MORE-SPECIFIC-P"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FemaleAnimal")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("GENDERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FEMININE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MORE-SPECIFIC-P"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("GENDERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MORE-SPECIFIC-P"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SentientAnimal")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("GENDERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTER")))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("GENDERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("GENDERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEUTER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("GENDERS"))));
        $str133$Invalid_lexical_property__gender_ = SubLObjectFactory.makeString("Invalid lexical property :gender called on ~a");
        $kw134$TERM = SubLObjectFactory.makeKeyword("TERM");
        $const135$MaleAnimal = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MaleAnimal"));
        $list136 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"));
        $const137$FemaleAnimal = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FemaleAnimal"));
        $list138 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FEMININE"));
        $const139$Person = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"));
        $list140 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE"));
        $const141$SentientAnimal = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SentientAnimal"));
        $list142 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MASCULINE"), (SubLObject)SubLObjectFactory.makeKeyword("FEMININE"), (SubLObject)SubLObjectFactory.makeKeyword("NEUTER"));
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEUTER"));
        $sym144$LEX_ENTRY_COMPUTE_GENDER_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-COMPUTE-GENDER-METHOD");
        $sym145$COMPUTE_PENN_TAGS = SubLObjectFactory.makeSymbol("COMPUTE-PENN-TAGS");
        $list146 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the Penn part-of-speech tags of this lex-entry"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFLECTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PENN-TAGS"), (SubLObject)abstract_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.EQL, (SubLObject)SubLObjectFactory.makeSymbol("POS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Preposition"))), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeString("to"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeKeyword("TO"), (SubLObject)SubLObjectFactory.makeSymbol("PENN-TAGS"))), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFLECTION"), (SubLObject)SubLObjectFactory.makeSymbol("INFLECTIONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PENN-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAP-FROM-CYC-TO-PENN-POS"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeSymbol("INFLECTION")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PENN-TAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("PENN-TAG"), (SubLObject)SubLObjectFactory.makeSymbol("PENN-TAGS"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE-DUPLICATES"), (SubLObject)SubLObjectFactory.makeSymbol("PENN-TAGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)abstract_lexicon.EQ)))));
        $kw147$INFLECTIONS = SubLObjectFactory.makeKeyword("INFLECTIONS");
        $const148$Preposition = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Preposition"));
        $str149$to = SubLObjectFactory.makeString("to");
        $kw150$TO = SubLObjectFactory.makeKeyword("TO");
        $sym151$LEX_ENTRY_COMPUTE_PENN_TAGS_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-COMPUTE-PENN-TAGS-METHOD");
        $sym152$COMPUTE_BACKOFF_PENN_TAGS = SubLObjectFactory.makeSymbol("COMPUTE-BACKOFF-PENN-TAGS");
        $list153 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the Penn part-of-speech tags of this lex-entry, plus additional tags\n   that are easily confused with the accurate ones"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PENN-TAGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("PENN-TAGS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAG"), (SubLObject)SubLObjectFactory.makeSymbol("PENN-TAGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BACKOFF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAG-BACKOFFS"), (SubLObject)SubLObjectFactory.makeSymbol("TAG"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.EQ, (SubLObject)SubLObjectFactory.makeSymbol("BACKOFF"), (SubLObject)SubLObjectFactory.makeSymbol("TAG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("BACKOFF"), (SubLObject)SubLObjectFactory.makeSymbol("PENN-TAGS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PENN-TAGS"))));
        $sym154$LEX_ENTRY_COMPUTE_BACKOFF_PENN_TAGS_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-COMPUTE-BACKOFF-PENN-TAGS-METHOD");
        $list155 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NN"), (SubLObject)SubLObjectFactory.makeKeyword("VBG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("JJ"), (SubLObject)SubLObjectFactory.makeKeyword("VBN"), (SubLObject)SubLObjectFactory.makeKeyword("VBD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NNP"), (SubLObject)SubLObjectFactory.makeKeyword("NNPS"), (SubLObject)SubLObjectFactory.makeKeyword("NN"), (SubLObject)SubLObjectFactory.makeKeyword("NNS"), (SubLObject)SubLObjectFactory.makeKeyword("$"), (SubLObject)SubLObjectFactory.makeKeyword("CD")));
        $sym156$COMPUTE_SUPER_TAGS = SubLObjectFactory.makeSymbol("COMPUTE-SUPER-TAGS");
        $list157 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; the super tag of this lex-entry"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPERTAGS"), (SubLObject)abstract_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPERTAG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("FRAME")), (SubLObject)SubLObjectFactory.makeSymbol("INFL")), (SubLObject)SubLObjectFactory.makeSymbol("*CYC-TO-SUPERTAG-MAP*"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERTAG"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERTAGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)abstract_lexicon.EQUAL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERTAGS"))));
        $kw158$FRAME = SubLObjectFactory.makeKeyword("FRAME");
        $sym159$LEX_ENTRY_COMPUTE_SUPER_TAGS_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-COMPUTE-SUPER-TAGS-METHOD");
        $sym160$COMPUTE_CYC_POS = SubLObjectFactory.makeSymbol("COMPUTE-CYC-POS");
        $list161 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRIE-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("TRIE-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRIE-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-POS"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS-OF-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("POS"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)abstract_lexicon.NIL)));
        $sym162$LEX_ENTRY_COMPUTE_CYC_POS_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-COMPUTE-CYC-POS-METHOD");
        $sym163$COMPUTE_IS_NER_ENTRY = SubLObjectFactory.makeSymbol("COMPUTE-IS-NER-ENTRY");
        $list164 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRIE-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("TRIE-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-ENTRY")))));
        $sym165$LEX_ENTRY_COMPUTE_IS_NER_ENTRY_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-COMPUTE-IS-NER-ENTRY-METHOD");
        $sym166$COMPUTE_CYC_CATEGORY = SubLObjectFactory.makeSymbol("COMPUTE-CYC-CATEGORY");
        $list167 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("What is the syntactic category of this lexical entry.  Unlike cyc-pos, this does not assume that each \n   entry is a part-of-speech.  In some cases, the category may be a XP, not just an X0"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME-STRING-PRED?"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounPhrase")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS")))));
        $kw168$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $const169$NounPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounPhrase"));
        $sym170$LEX_ENTRY_COMPUTE_CYC_CATEGORY_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-COMPUTE-CYC-CATEGORY-METHOD");
        $sym171$COMPUTE_INFLECTIONS = SubLObjectFactory.makeSymbol("COMPUTE-INFLECTIONS");
        $list172 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRIE-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("TRIE-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-POS-PREDS"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)abstract_lexicon.NIL)));
        $sym173$LEX_ENTRY_COMPUTE_INFLECTIONS_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-COMPUTE-INFLECTIONS-METHOD");
        $sym174$ABSTRACT_LEXICON = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON");
        $list175 = _constant_175_initializer();
        $sym176$STOP_WORDS = SubLObjectFactory.makeSymbol("STOP-WORDS");
        $sym177$ALLOW_STEMMING = SubLObjectFactory.makeSymbol("ALLOW-STEMMING");
        $sym178$ACTIVE_LEARNERS = SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS");
        $sym179$LEARNED = SubLObjectFactory.makeSymbol("LEARNED");
        $sym180$ALLOW_FABRICATION_ = SubLObjectFactory.makeSymbol("ALLOW-FABRICATION?");
        $sym181$CASE_SENSITIVITY = SubLObjectFactory.makeSymbol("CASE-SENSITIVITY");
        $sym182$IGNORE_CACHE_ = SubLObjectFactory.makeSymbol("IGNORE-CACHE?");
        $sym183$CACHE = SubLObjectFactory.makeSymbol("CACHE");
        $sym184$TRIE = SubLObjectFactory.makeSymbol("TRIE");
        $sym185$EXCLUDED_POS_LIST = SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST");
        $sym186$EXCLUDED_PREDS = SubLObjectFactory.makeSymbol("EXCLUDED-PREDS");
        $sym187$ROOT_MT = SubLObjectFactory.makeSymbol("ROOT-MT");
        $sym188$BASE_MT = SubLObjectFactory.makeSymbol("BASE-MT");
        $sym189$EXCLUDED_MTS = SubLObjectFactory.makeSymbol("EXCLUDED-MTS");
        $sym190$ALLOWED_MTS = SubLObjectFactory.makeSymbol("ALLOWED-MTS");
        $sym191$DEFAULT_KB_SPEC = SubLObjectFactory.makeSymbol("DEFAULT-KB-SPEC");
        $sym192$DEFAULT_BASE_MT = SubLObjectFactory.makeSymbol("DEFAULT-BASE-MT");
        $sym193$DEFAULT_EXCLUDE_PREDICATES = SubLObjectFactory.makeSymbol("DEFAULT-EXCLUDE-PREDICATES");
        $sym194$DEFAULT_EXCLUDE_MTS = SubLObjectFactory.makeSymbol("DEFAULT-EXCLUDE-MTS");
        $list195 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WebSearchDataMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclistsMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationParaphraseMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetMappingMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PornographyJargonMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CommonEnglishMisspellingsMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ComputereseLexicalMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclishMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporaryLexicalAssertionsMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishWordSenseAssertions-HoldingMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporaryLexicalAssertions-WordNetImportMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RedundantLexicalMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PDATemplateTestMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishParaphraseMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SupplementalDeterminerSemTransLexicalMt")) });
        $const196$AllGeneralEnglishValidatedLexical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AllGeneralEnglishValidatedLexicalMicrotheoryPSC"));
        $const197$AbstractLexiconSpecification = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbstractLexiconSpecification"));
        $sym198$SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_LEXICON_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-LEXICON-CLASS");
        $kw199$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym200$SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_LEXICON_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-LEXICON-INSTANCE");
        $list201 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("@return lexicon-p; a newly created lexicon"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-NL-TRIE"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CACHE"), (SubLObject)SubLObjectFactory.makeInteger(2000), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)abstract_lexicon.EQUAL))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"), (SubLObject)SubLObjectFactory.makeKeyword("ON")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENSURE-CYC-TO-PENN-MAP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-EXCLUDED-PREDS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-ALLOWED-MTS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEARNED"), (SubLObject)abstract_lexicon.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")) });
        $sym202$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $int203$2000 = SubLObjectFactory.makeInteger(2000);
        $kw204$ON = SubLObjectFactory.makeKeyword("ON");
        $sym205$INITIALIZE_EXCLUDED_PREDS = SubLObjectFactory.makeSymbol("INITIALIZE-EXCLUDED-PREDS");
        $sym206$INITIALIZE_ALLOWED_MTS = SubLObjectFactory.makeSymbol("INITIALIZE-ALLOWED-MTS");
        $sym207$ABSTRACT_LEXICON_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-INITIALIZE-METHOD");
        $sym208$ISOLATE = SubLObjectFactory.makeSymbol("ISOLATE");
        $list209 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Finalizes this lexicon"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE"), (SubLObject)abstract_lexicon.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISOLATE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym210$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym211$ABSTRACT_LEXICON_ISOLATE_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ISOLATE-METHOD");
        $sym212$IGNORE_CACHE = SubLObjectFactory.makeSymbol("IGNORE-CACHE");
        $list213 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-CACHE?"), (SubLObject)abstract_lexicon.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym214$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym215$ABSTRACT_LEXICON_IGNORE_CACHE_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-IGNORE-CACHE-METHOD");
        $list216 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-CACHE?")))));
        $sym217$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym218$ABSTRACT_LEXICON_IGNORE_CACHE__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-IGNORE-CACHE?-METHOD");
        $list219 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOW-STEMMING"), (SubLObject)abstract_lexicon.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym220$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym221$ABSTRACT_LEXICON_ALLOW_STEMMING_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ALLOW-STEMMING-METHOD");
        $sym222$FORBID_STEMMING = SubLObjectFactory.makeSymbol("FORBID-STEMMING");
        $list223 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOW-STEMMING"), (SubLObject)abstract_lexicon.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym224$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym225$ABSTRACT_LEXICON_FORBID_STEMMING_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-FORBID-STEMMING-METHOD");
        $sym226$ALLOW_FABRICATION = SubLObjectFactory.makeSymbol("ALLOW-FABRICATION");
        $list227 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOW-FABRICATION?"), (SubLObject)abstract_lexicon.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym228$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym229$ABSTRACT_LEXICON_ALLOW_FABRICATION_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ALLOW-FABRICATION-METHOD");
        $sym230$FORBID_FABRICATION = SubLObjectFactory.makeSymbol("FORBID-FABRICATION");
        $list231 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOW-FABRICATION?"), (SubLObject)abstract_lexicon.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym232$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym233$ABSTRACT_LEXICON_FORBID_FABRICATION_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-FORBID-FABRICATION-METHOD");
        $sym234$FABRICATION_FORBIDDEN_ = SubLObjectFactory.makeSymbol("FABRICATION-FORBIDDEN?");
        $list235 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOW-FABRICATION?"))));
        $sym236$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym237$ABSTRACT_LEXICON_FABRICATION_FORBIDDEN__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-FABRICATION-FORBIDDEN?-METHOD");
        $sym238$FABRICATION_ALLOWED_ = SubLObjectFactory.makeSymbol("FABRICATION-ALLOWED?");
        $list239 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOW-FABRICATION?")));
        $sym240$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym241$ABSTRACT_LEXICON_FABRICATION_ALLOWED__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-FABRICATION-ALLOWED?-METHOD");
        $sym242$VALID_NL_TRIE_ENTRY_ = SubLObjectFactory.makeSymbol("VALID-NL-TRIE-ENTRY?");
        $list243 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AUTO-UPDATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list244 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"));
        $list245 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Returns t if LEX-ENTRY is a contextually valid nl-trie-entry, nil otherwise\n   Lexicons derived from abstract-lexicon will typically override this method"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("STOP-WORD-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)abstract_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY-P"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOWED-POS?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-P"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameSpelling")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-POS-PREDS"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)abstract_lexicon.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-HAS-ALLOWED-PREDICATE?")), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOWED-MT?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-SEMANTIC-MT"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALID-DENOTS?"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-HAS-ALLOWED-PREDICATE?")), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-HAS-ALLOWED-POS?")), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOWED-MT?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-SEMANTIC-MT"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")))))));
        $sym246$STOP_WORD_P = SubLObjectFactory.makeSymbol("STOP-WORD-P");
        $sym247$ALLOWED_POS_ = SubLObjectFactory.makeSymbol("ALLOWED-POS?");
        $const248$nameSpelling = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameSpelling"));
        $sym249$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_ = SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-HAS-ALLOWED-PREDICATE?");
        $sym250$ALLOWED_MT_ = SubLObjectFactory.makeSymbol("ALLOWED-MT?");
        $sym251$NL_TRIE_ENTRY_HAS_ALLOWED_POS_ = SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-HAS-ALLOWED-POS?");
        $sym252$ABSTRACT_LEXICON_VALID_NL_TRIE_ENTRY__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-VALID-NL-TRIE-ENTRY?-METHOD");
        $sym253$SET_CASE_SENSITIVITY = SubLObjectFactory.makeSymbol("SET-CASE-SENSITIVITY");
        $list254 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"));
        $list255 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Used for setting case-sensitivity of this lexicon.  Acceptable values include :off, :on, :preferred"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym256$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym257$ABSTRACT_LEXICON_SET_CASE_SENSITIVITY_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-SET-CASE-SENSITIVITY-METHOD");
        $sym258$GET_CASE_SENSITIVITY = SubLObjectFactory.makeSymbol("GET-CASE-SENSITIVITY");
        $list259 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Used for getting case-sensitivity of this lexicon.  Acceptable values include :off, :on, :preferred"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY")));
        $sym260$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym261$ABSTRACT_LEXICON_GET_CASE_SENSITIVITY_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-GET-CASE-SENSITIVITY-METHOD");
        $list262 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDS-TO-EXCLUDE"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")));
        $list263 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("exclude assertions using the predicates in PREDS-TO-EXCLUDE from use by this lexicon.\n   If PREDS-TO-EXCLUDE is :default, \n   all preds in the class variable DEFAULT-EXCLUDE-PREDS will be excluded"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.EQ, (SubLObject)SubLObjectFactory.makeSymbol("PREDS-TO-EXCLUDE"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-PREDS"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-EXCLUDE-PREDICATES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-PREDS"), (SubLObject)SubLObjectFactory.makeSymbol("PREDS-TO-EXCLUDE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $kw264$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $sym265$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym266$ABSTRACT_LEXICON_INITIALIZE_EXCLUDED_PREDS_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-INITIALIZE-EXCLUDED-PREDS-METHOD");
        $sym267$ALLOW_PREDICATE = SubLObjectFactory.makeSymbol("ALLOW-PREDICATE");
        $list268 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS-PRED"));
        $list269 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("allow POS-PRED to be used by this lexicon for lexical lookup"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-PREDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("POS-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-PREDS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym270$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym271$ABSTRACT_LEXICON_ALLOW_PREDICATE_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ALLOW-PREDICATE-METHOD");
        $sym272$EXCLUDE_PREDICATE = SubLObjectFactory.makeSymbol("EXCLUDE-PREDICATE");
        $list273 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("do not allow POS-PRED to be used by this lexicon for lexical lookup"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("POS-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-PREDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym274$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym275$ABSTRACT_LEXICON_EXCLUDE_PREDICATE_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-EXCLUDE-PREDICATE-METHOD");
        $sym276$EXCLUDED_PREDICATE_ = SubLObjectFactory.makeSymbol("EXCLUDED-PREDICATE?");
        $list277 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("is POS-PRED a predicate that can not be used in from this lexicon?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("POS-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-PREDS"))));
        $sym278$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym279$ABSTRACT_LEXICON_EXCLUDED_PREDICATE__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-EXCLUDED-PREDICATE?-METHOD");
        $sym280$ALLOWED_PREDICATE_ = SubLObjectFactory.makeSymbol("ALLOWED-PREDICATE?");
        $list281 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("is POS-PRED a predicate that can not be used in from this lexicon?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("POS-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-PREDS")))));
        $sym282$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym283$ABSTRACT_LEXICON_ALLOWED_PREDICATE__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ALLOWED-PREDICATE?-METHOD");
        $list284 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("is POS-PRED of NL-TRIE-ENTRY a predicate that can not be used in from this lexicon?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-PREDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-PREDS"))))));
        $sym285$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym286$ABSTRACT_LEXICON_NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-NL-TRIE-ENTRY-HAS-ALLOWED-PREDICATE?-METHOD");
        $sym287$ALLOW_POS = SubLObjectFactory.makeSymbol("ALLOW-POS");
        $list288 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS"));
        $list289 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("allow POS to be used by this lexicon for lexical lookup"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym290$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym291$ABSTRACT_LEXICON_ALLOW_POS_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ALLOW-POS-METHOD");
        $sym292$EXCLUDE_POS = SubLObjectFactory.makeSymbol("EXCLUDE-POS");
        $list293 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("do not allow POS to be used by this lexicon for lexical lookup"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym294$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym295$ABSTRACT_LEXICON_EXCLUDE_POS_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-EXCLUDE-POS-METHOD");
        $sym296$EXCLUDED_POS_ = SubLObjectFactory.makeSymbol("EXCLUDED-POS?");
        $list297 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("is POS a part of speech that can not be used in from this lexicon?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-POS-MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST"))));
        $sym298$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym299$ABSTRACT_LEXICON_EXCLUDED_POS__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-EXCLUDED-POS?-METHOD");
        $list300 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("is POS a part of speech that can not be used in from this lexicon?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-POS-MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST")))));
        $sym301$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym302$ABSTRACT_LEXICON_ALLOWED_POS__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ALLOWED-POS?-METHOD");
        $list303 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("does NL-TRIE-ENTRY have a part of speech that can not be used in from this lexicon?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-POS-MEMBER?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-POS"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST"))))));
        $sym304$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym305$ABSTRACT_LEXICON_NL_TRIE_ENTRY_HAS_ALLOWED_POS__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-NL-TRIE-ENTRY-HAS-ALLOWED-POS?-METHOD");
        $sym306$ADD_LEARNER = SubLObjectFactory.makeSymbol("ADD-LEARNER");
        $list307 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEARNER"));
        $list308 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("add LEARNER (a method-name) as a learner to lexicon"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("LEARNER"), (SubLObject)SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym309$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym310$ABSTRACT_LEXICON_ADD_LEARNER_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ADD-LEARNER-METHOD");
        $sym311$REMOVE_LEARNER = SubLObjectFactory.makeSymbol("REMOVE-LEARNER");
        $list312 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("remove LEARNER (a method-name) as a learner for this lexicon"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("LEARNER"), (SubLObject)SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym313$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym314$ABSTRACT_LEXICON_REMOVE_LEARNER_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-REMOVE-LEARNER-METHOD");
        $sym315$GET_LEARNERS = SubLObjectFactory.makeSymbol("GET-LEARNERS");
        $list316 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS")));
        $sym317$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym318$ABSTRACT_LEXICON_GET_LEARNERS_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-GET-LEARNERS-METHOD");
        $sym319$SET_LEARNERS = SubLObjectFactory.makeSymbol("SET-LEARNERS");
        $list320 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEARNERS"));
        $list321 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("set learners for lexicon to be all and only those learners specified in LEARNERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS"), (SubLObject)SubLObjectFactory.makeSymbol("LEARNERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym322$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym323$ABSTRACT_LEXICON_SET_LEARNERS_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-SET-LEARNERS-METHOD");
        $list324 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AUTO-UPDATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list325 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB-SPEC"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")));
        $list326 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("allow all mts visible from BASE-MT to be used by this lexicon.  If the value is :default, the value of the class variable DEFAULT-BASE-MT will be\n   used, and all mts in the class variable DEFAULT-EXCLUDED-MTS will be removed"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOWED-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)abstract_lexicon.EQUAL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTRUCT-SET-FROM-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-EXCLUDE-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)abstract_lexicon.EQUAL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.EQ, (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"), (SubLObject)SubLObjectFactory.makeSymbol("KB-SPEC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BASE-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-VARIABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("?MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultBaseLexicalMt")), (SubLObject)SubLObjectFactory.makeSymbol("KB-SPEC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?MT")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-ALLOWED-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-VARIABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("?MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("allowedLexicalMt")), (SubLObject)SubLObjectFactory.makeSymbol("KB-SPEC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?MT")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC-DISALLOWED-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-VARIABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("?MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disallowedLexicalMt")), (SubLObject)SubLObjectFactory.makeSymbol("KB-SPEC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?MT")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SINGLETON?"), (SubLObject)SubLObjectFactory.makeSymbol("BASE-MTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("BASE-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-EXPRESSION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ONLY-ONE"), (SubLObject)SubLObjectFactory.makeSymbol("BASE-MTS"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EMPTY-LIST-P"), (SubLObject)SubLObjectFactory.makeSymbol("BASE-MTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("BASE-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-EXPRESSION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-BASE-MT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("BASE-MTS"))), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("BASE-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-EXPRESSION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANONICALIZE-HLMT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-EL-FORMULA"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtUnionFn")), (SubLObject)SubLObjectFactory.makeSymbol("BASE-MTS"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC-ALLOWED-MTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOW-MT")), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("SPEC-DISALLOWED-MTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FORBID-MT")), (SubLObject)SubLObjectFactory.makeSymbol("MT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym327$_MT = SubLObjectFactory.makeSymbol("?MT");
        $const328$defaultBaseLexicalMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultBaseLexicalMt"));
        $list329 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?MT"));
        $const330$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $list331 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $const332$allowedLexicalMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("allowedLexicalMt"));
        $const333$disallowedLexicalMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disallowedLexicalMt"));
        $const334$MtUnionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtUnionFn"));
        $sym335$ALLOW_MT = SubLObjectFactory.makeSymbol("ALLOW-MT");
        $sym336$FORBID_MT = SubLObjectFactory.makeSymbol("FORBID-MT");
        $sym337$ABSTRACT_LEXICON_INITIALIZE_ALLOWED_MTS_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-INITIALIZE-ALLOWED-MTS-METHOD");
        $sym338$SET_BASE_MT = SubLObjectFactory.makeSymbol("SET-BASE-MT");
        $list339 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $list340 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("base-mt represents the standard mt-reasoning-based Mt for this lexicon. Using allow-mt and forbid-mt allow\n   for minor tweaks to the base-mt, but in general, this is the Mt for this lexicon\n   @note that this method will override any excluded-mts if they are visible from the newly-set base-mt"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("BASE-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-MT"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-MTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-LEXICON-MT?"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOW-MT")), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-MT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym341$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym342$ABSTRACT_LEXICON_SET_BASE_MT_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-SET-BASE-MT-METHOD");
        $sym343$GET_BASE_MT = SubLObjectFactory.makeSymbol("GET-BASE-MT");
        $list344 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZED-P"), (SubLObject)SubLObjectFactory.makeSymbol("BASE-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("BASE-MT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("BASE-MT"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-BASE-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-BASE-MT")));
        $sym345$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym346$ABSTRACT_LEXICON_GET_BASE_MT_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-GET-BASE-MT-METHOD");
        $list347 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param MT possibly-hlmt-p; the mt to be allowed for retrieval of lex entries"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-HLMT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ADD"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOWED-MTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-MTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ROOT-MT"), (SubLObject)SubLObjectFactory.makeKeyword("UNINITIALIZED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym348$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym349$POSSIBLY_HLMT_P = SubLObjectFactory.makeSymbol("POSSIBLY-HLMT-P");
        $sym350$ABSTRACT_LEXICON_ALLOW_MT_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ALLOW-MT-METHOD");
        $sym351$ALLOW_GENL_MTS = SubLObjectFactory.makeSymbol("ALLOW-GENL-MTS");
        $list352 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param MT possibly-hlmt-p; the mt and all its genlMTs to be allowed for \n     retrieval of lex entries"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-HLMT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ADD"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOWED-MTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-MTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-VARIABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("?GENLMT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?GENLMT")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ADD"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-MT"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOWED-MTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-MT"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-MTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ROOT-MT"), (SubLObject)SubLObjectFactory.makeKeyword("UNINITIALIZED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym353$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym354$_GENLMT = SubLObjectFactory.makeSymbol("?GENLMT");
        $const355$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $list356 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?GENLMT"));
        $sym357$ABSTRACT_LEXICON_ALLOW_GENL_MTS_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ALLOW-GENL-MTS-METHOD");
        $list358 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param MT possibly-hlmt-p; the mt to be forbidden for retrieval of lex entries"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-HLMT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ADD"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-MTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOWED-MTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ROOT-MT"), (SubLObject)SubLObjectFactory.makeKeyword("UNINITIALIZED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym359$ABSTRACT_LEXICON_FORBID_MT_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-FORBID-MT-METHOD");
        $list360 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param MT possibly-hlmt-p; are assertions in MT allowed in this lexicon?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)abstract_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOWED-MTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)abstract_lexicon.T)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-MTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)abstract_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HLMT-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-BASE-MT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FORBID-MT")), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)abstract_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-LEXICON-MT?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-BASE-MT"))), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOW-MT")), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)abstract_lexicon.T)), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FORBID-MT")), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)abstract_lexicon.NIL))));
        $sym361$ABSTRACT_LEXICON_ALLOWED_MT__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ALLOWED-MT?-METHOD");
        $list362 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("AUTO-UPDATE"));
        $list363 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("return the one Mt that is the composition of all the allowed/disallowed mts, an MtUnionFn of all the Mts"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZED-P"), (SubLObject)SubLObjectFactory.makeSymbol("ROOT-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THIS-ALLOWED-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOWED-MTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THIS-BASE-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-BASE-MT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-HLMT-P"), (SubLObject)SubLObjectFactory.makeSymbol("THIS-BASE-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("THIS-BASE-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ELEMENT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("THIS-ALLOWED-MTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ELEMENT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOWED-MTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MIN-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MIN-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("MTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ROOT-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANONICALIZE-HLMT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-EL-FORMULA"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtUnionFn")), (SubLObject)SubLObjectFactory.makeSymbol("MIN-MTS")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ROOT-MT")));
        $sym364$ABSTRACT_LEXICON_ROOT_MT_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ROOT-MT-METHOD");
        $sym365$ADD_STOP_WORD = SubLObjectFactory.makeSymbol("ADD-STOP-WORD");
        $list366 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $list367 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STOP-WORD-SET"), (SubLObject)SubLObjectFactory.makeSymbol("STOP-WORDS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-P"), (SubLObject)SubLObjectFactory.makeSymbol("STOP-WORD-SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("STOP-WORD-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)abstract_lexicon.EQUAL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ADD"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STOP-WORD-SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("STOP-WORDS"), (SubLObject)SubLObjectFactory.makeSymbol("STOP-WORD-SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("STOP-WORDS"))));
        $sym368$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym369$ABSTRACT_LEXICON_ADD_STOP_WORD_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ADD-STOP-WORD-METHOD");
        $list370 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("STOP-WORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STOP-WORDS"))))));
        $sym371$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym372$ABSTRACT_LEXICON_STOP_WORD_P_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-STOP-WORD-P-METHOD");
        $sym373$GET_STOP_WORDS = SubLObjectFactory.makeSymbol("GET-STOP-WORDS");
        $list374 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-P"), (SubLObject)SubLObjectFactory.makeSymbol("STOP-WORDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("STOP-WORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)abstract_lexicon.EQUAL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("STOP-WORDS")));
        $sym375$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym376$ABSTRACT_LEXICON_GET_STOP_WORDS_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-GET-STOP-WORDS-METHOD");
        $list377 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"));
        $list378 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return ABSTRACT-LEXICON-P; a copy of this lexicon.\n@note -- list values are copied with copy-list.\n@note -- cache and trie are set to their defaults."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE-IF-PRESENT"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CLONE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("Cloned instance: ~S"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALLOWED-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-PREDS"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-CACHE?"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"), (SubLObject)SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")))), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET")));
        $sym379$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym380$ABSTRACT_LEXICON_P = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-P");
        $sym381$CLONE = SubLObjectFactory.makeSymbol("CLONE");
        $str382$Cloned_instance___S = SubLObjectFactory.makeString("Cloned instance: ~S");
        $list383 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALLOWED-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-PREDS"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-CACHE?"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"), (SubLObject)SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS"));
        $sym384$ABSTRACT_LEXICON_COPY_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-COPY-METHOD");
        $list385 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STRING stringp;\n   @return listp; the list of  lex-entry-p associated with STRING in this lexicon"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-STRING-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("STOP-WORD-P")), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)abstract_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-CACHE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"), (SubLObject)SubLObjectFactory.makeSymbol("EXISTS?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHE-GET"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("EXISTS?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES")), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)abstract_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-SEARCH"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-LEX-ENTRIES-FOR-TRIE-ENTRIES"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRIES"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES")), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.EQ, (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"), (SubLObject)SubLObjectFactory.makeKeyword("PREFERRED"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-SEARCH"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE"), (SubLObject)SubLObjectFactory.makeKeyword("OFF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-LEX-ENTRIES-FOR-TRIE-ENTRIES"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRIES"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-CACHE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHE-SET"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"))));
        $sym386$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym387$CYCL_STRING_P = SubLObjectFactory.makeSymbol("CYCL-STRING-P");
        $sym388$CREATE_LEX_ENTRIES = SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES");
        $kw389$PREFERRED = SubLObjectFactory.makeKeyword("PREFERRED");
        $kw390$OFF = SubLObjectFactory.makeKeyword("OFF");
        $sym391$ABSTRACT_LEXICON_GET_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-GET-METHOD");
        $sym392$LEX_ENTRY_EQUAL_P = SubLObjectFactory.makeSymbol("LEX-ENTRY-EQUAL-P");
        $sym393$DELETE = SubLObjectFactory.makeSymbol("DELETE");
        $list394 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Deletes all entries for STRING from this lexicon"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-STRING-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRIE-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-SEARCH"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CASE-SENSITIVITY")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRIE-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-ENTRIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY-P"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRIE-KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-KEYS"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-DELETE-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-ENTRY")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHE-REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym395$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym396$ABSTRACT_LEXICON_DELETE_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-DELETE-METHOD");
        $sym397$DELETE_ENTRY_FROM_STRING = SubLObjectFactory.makeSymbol("DELETE-ENTRY-FROM-STRING");
        $list398 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $list399 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Deletes the entry associating STRING with LEX-ENTRY from this lexicon"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRIE-KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-STRING-TOKENIZE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-DELETE-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHE-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHE-GET"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)abstract_lexicon.EQUAL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHE-SET"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE-ENTRIES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym400$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym401$LEX_ENTRY_P = SubLObjectFactory.makeSymbol("LEX-ENTRY-P");
        $sym402$ABSTRACT_LEXICON_DELETE_ENTRY_FROM_STRING_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-DELETE-ENTRY-FROM-STRING-METHOD");
        $sym403$NL_TRIE_LEX_ENTRY_P = SubLObjectFactory.makeSymbol("NL-TRIE-LEX-ENTRY-P");
        $sym404$ADD = SubLObjectFactory.makeSymbol("ADD");
        $list405 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"));
        $list406 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Adds LEX-ENTRY to this lexicon"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"))), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHAR-POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("*STRIE-NULL-KEY*"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEARNED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-INSERT-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-STRING-TOKENIZE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY2NL-TRIE-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHE-REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)abstract_lexicon.NIL)));
        $sym407$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym408$ABSTRACT_LEXICON_ADD_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ADD-METHOD");
        $sym409$LEARNED_ = SubLObjectFactory.makeSymbol("LEARNED?");
        $list410 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Check to see if this lex entry was learned by this lexicon"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEARNED"))));
        $sym411$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym412$ABSTRACT_LEXICON_LEARNED__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-LEARNED?-METHOD");
        $sym413$FORGET = SubLObjectFactory.makeSymbol("FORGET");
        $list414 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Delete all entries previously learned from this lexicon"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETED"), (SubLObject)SubLObjectFactory.makeSymbol("LEARNED"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)SubLObjectFactory.makeSymbol("LEARNED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEARNED"), (SubLObject)abstract_lexicon.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DELETED"))));
        $sym415$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym416$ABSTRACT_LEXICON_FORGET_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-FORGET-METHOD");
        $sym417$PREFIXES = SubLObjectFactory.makeSymbol("PREFIXES");
        $list418 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGS"));
        $list419 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STRINGS; listp\n   @return listp; a list of conses whose car is a list of strings which are\n   in this lexicon and a prefix of STRINGS, and whose cdr is a lex entry\n   with that string"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALID-PREFIXES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-PREFIXES"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGS"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym420$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym421$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym422$ABSTRACT_LEXICON_PREFIXES_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-PREFIXES-METHOD");
        $sym423$PREFIXES_FROM_STRING = SubLObjectFactory.makeSymbol("PREFIXES-FROM-STRING");
        $list424 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STRING stringp\n   @return listp; a list of conses whose car is a list of strings which are\n   in this lexicon and a prefix of STRINGS, and whose cdr is a lex entry\n   with that string"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREFIX-KEYS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-PREFIX-KEYS-FROM-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("PREFIX-KEYS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREFIX-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALID-PREFIXES"), (SubLObject)SubLObjectFactory.makeSymbol("PREFIX-KEYS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("PREFIX-STRING")))));
        $sym425$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym426$ABSTRACT_LEXICON_PREFIXES_FROM_STRING_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-PREFIXES-FROM-STRING-METHOD");
        $kw427$FALLBACK = SubLObjectFactory.makeKeyword("FALLBACK");
        $str428$Don_t_recognize_lexicon_case_sens = SubLObjectFactory.makeString("Don't recognize lexicon case sensitivity value of ~S");
        $sym429$PREFIX_KEYS = SubLObjectFactory.makeSymbol("PREFIX-KEYS");
        $list430 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STRINGS; listp\n   @return listp; a list of strings which are both in this lexicon and a prefix of STRINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALID-PREFIX-KEYS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-PREFIXES"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGS"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"))));
        $sym431$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym432$ABSTRACT_LEXICON_PREFIX_KEYS_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-PREFIX-KEYS-METHOD");
        $sym433$PREFIX_KEYS_FROM_STRING = SubLObjectFactory.makeSymbol("PREFIX-KEYS-FROM-STRING");
        $list434 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STRING stringp\n   @return listp; a list of strings which are both in this lexicon and a prefix of STRINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MY-PREFIX-KEYS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-PREFIX-KEYS-FROM-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("MY-PREFIX-KEYS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREFIX-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALID-PREFIX-KEYS"), (SubLObject)SubLObjectFactory.makeSymbol("MY-PREFIX-KEYS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY")), (SubLObject)SubLObjectFactory.makeSymbol("PREFIX-STRING")))));
        $sym435$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym436$ABSTRACT_LEXICON_PREFIX_KEYS_FROM_STRING_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-PREFIX-KEYS-FROM-STRING-METHOD");
        $sym437$LEARN = SubLObjectFactory.makeSymbol("LEARN");
        $list438 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEARNERS")));
        $list439 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TEXT stringp; the text from which to learn lexical entries\n   @param LEARNERS listp; a list of learning methods. Each such method\n   is expected to take a natural language string as input and return a \n   list of lex-entries\n   @return non-negative-integerp; the number of entries learned\n   @note it is the responsibility of each learner to add any entries to the lexicon"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("LEARNERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEARNERS"), (SubLObject)SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEARNED-HERE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEARNER"), (SubLObject)SubLObjectFactory.makeSymbol("LEARNERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LEARNER"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)SubLObjectFactory.makeSymbol("LEARNED-HERE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEARNED-HERE"))));
        $sym440$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym441$ABSTRACT_LEXICON_LEARN_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-LEARN-METHOD");
        $sym442$NUMBER_LEARN = SubLObjectFactory.makeSymbol("NUMBER-LEARN");
        $list443 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEXT"));
        $list444 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)abstract_lexicon.NIL));
        $sym445$ABSTRACT_LEXICON_NUMBER_LEARN_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-NUMBER-LEARN-METHOD");
        $kw446$CD = SubLObjectFactory.makeKeyword("CD");
        $str447$_ = SubLObjectFactory.makeString("-");
        $const448$ScalarInterval = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScalarInterval"));
        $sym449$RKF_STANDARD_STRING_WORDIFY = SubLObjectFactory.makeSymbol("RKF-STANDARD-STRING-WORDIFY");
        $str450$_ = SubLObjectFactory.makeString(".");
        $sym451$WORD_STRING = SubLObjectFactory.makeSymbol("WORD-STRING");
        $sym452$SCALAR_FUNCTION_ = SubLObjectFactory.makeSymbol("SCALAR-FUNCTION?");
        $sym453$_SCALAR_FUNCTION__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SCALAR-FUNCTION?-CACHING-STATE*");
        $int454$512 = SubLObjectFactory.makeInteger(512);
        $sym455$NOUN_COMPOUND_LEARN = SubLObjectFactory.makeSymbol("NOUN-COMPOUND-LEARN");
        $list456 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TEXT stringp; the text from which to learn lexical entries\n   @return listp; a list of lexical entries learned from TEXT\n   This is a stub just to make sure that all subclasses will be have a base\n   implementation of this method, although we don't wish to give it a real\n   implementation as a method of this class."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)abstract_lexicon.NIL));
        $sym457$ABSTRACT_LEXICON_NOUN_COMPOUND_LEARN_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-NOUN-COMPOUND-LEARN-METHOD");
        $kw458$NP = SubLObjectFactory.makeKeyword("NP");
        $sym459$COMPOUNDS_FROM_TREE = SubLObjectFactory.makeSymbol("COMPOUNDS-FROM-TREE");
        $kw460$BEST_ONLY = SubLObjectFactory.makeKeyword("BEST-ONLY");
        $list461 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn-Bar1")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun")));
        $sym462$EXTRACT_PARSE_POS_PRED = SubLObjectFactory.makeSymbol("EXTRACT-PARSE-POS-PRED");
        $list463 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Plural-NLAttr")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $const464$plural_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural-Generic"));
        $list465 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Singular-NLAttr")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $const466$singular_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular-Generic"));
        $list467 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Mass-NLAttr")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $const468$massNumber_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("massNumber-Generic"));
        $const469$nounStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nounStrings"));
        $sym470$COOCCURRENCE_STATISTICS_LEARN = SubLObjectFactory.makeSymbol("COOCCURRENCE-STATISTICS-LEARN");
        $sym471$ABSTRACT_LEXICON_COOCCURRENCE_STATISTICS_LEARN_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-COOCCURRENCE-STATISTICS-LEARN-METHOD");
        $sym472$LEXIFY_DOCUMENT = SubLObjectFactory.makeSymbol("LEXIFY-DOCUMENT");
        $list473 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOC"));
        $list474 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param DOC document-p; \n   @return document-p; a new version of DOC with adjacent words collapsed into\n   single words and nl-trie-entries associated with the words in DOC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DOC"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-DOCUMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPHS"), (SubLObject)abstract_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOCUMENT-DO-PARAGRAPHS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPH"), (SubLObject)SubLObjectFactory.makeSymbol("DOC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-PARAGRAPH")), (SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPH")), (SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPHS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOCUMENT-PARAGRAPHS"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPHS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"))));
        $sym475$DOCUMENT_P = SubLObjectFactory.makeSymbol("DOCUMENT-P");
        $sym476$LEXIFY_PARAGRAPH = SubLObjectFactory.makeSymbol("LEXIFY-PARAGRAPH");
        $sym477$VECTOR = SubLObjectFactory.makeSymbol("VECTOR");
        $sym478$ABSTRACT_LEXICON_LEXIFY_DOCUMENT_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-LEXIFY-DOCUMENT-METHOD");
        $sym479$LEXIFY_DOCUMENT_EXHAUSTIVELY = SubLObjectFactory.makeSymbol("LEXIFY-DOCUMENT-EXHAUSTIVELY");
        $list480 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param DOC document-p; \n   @return document-p; a new version of DOC with all possible lexical matches included.  \n   The document will contain exhaustive-word-p's, each of which will contain zero or more \n   word-p's with attached nl-trie-entries"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DOC"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-DOCUMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPHS"), (SubLObject)abstract_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOCUMENT-DO-PARAGRAPHS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPH"), (SubLObject)SubLObjectFactory.makeSymbol("DOC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-PARAGRAPH-EXHAUSTIVELY")), (SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPH")), (SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPHS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOCUMENT-PARAGRAPHS"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPHS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"))));
        $sym481$LEXIFY_PARAGRAPH_EXHAUSTIVELY = SubLObjectFactory.makeSymbol("LEXIFY-PARAGRAPH-EXHAUSTIVELY");
        $sym482$ABSTRACT_LEXICON_LEXIFY_DOCUMENT_EXHAUSTIVELY_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-LEXIFY-DOCUMENT-EXHAUSTIVELY-METHOD");
        $list483 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PAR"));
        $list484 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param PAR paragraph-p;\n   @return paraphraph-p; a new version of PAR with adjacent words collapsed into\n   single words and nl-trie-entries associated with the words in PAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PAR"), (SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPH-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-PARAGRAPH"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCES"), (SubLObject)abstract_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPH-DO-SENTENCES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("PAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-SENTENCE")), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE")), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPH-SENTENCES"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"))));
        $sym485$PARAGRAPH_P = SubLObjectFactory.makeSymbol("PARAGRAPH-P");
        $sym486$LEXIFY_SENTENCE = SubLObjectFactory.makeSymbol("LEXIFY-SENTENCE");
        $sym487$ABSTRACT_LEXICON_LEXIFY_PARAGRAPH_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-LEXIFY-PARAGRAPH-METHOD");
        $list488 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param PAR paragraph-p;\n   @return paraphraph-p; a new version of PAR with all possible lexical matches included.  \n   The document will contain exhaustive-word-p's, each of which will contain zero or more \n   word-p's with attached nl-trie-entries"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PAR"), (SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPH-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-PARAGRAPH"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCES"), (SubLObject)abstract_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPH-DO-SENTENCES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("PAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-SENTENCE-EXHAUSTIVELY")), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE")), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPH-SENTENCES"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"))));
        $sym489$LEXIFY_SENTENCE_EXHAUSTIVELY = SubLObjectFactory.makeSymbol("LEXIFY-SENTENCE-EXHAUSTIVELY");
        $sym490$ABSTRACT_LEXICON_LEXIFY_PARAGRAPH_EXHAUSTIVELY_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-LEXIFY-PARAGRAPH-EXHAUSTIVELY-METHOD");
        $list491 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"));
        $list492 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param sentence sentence-p;\n   @return sentence-p; a new version of SENTENCE with adjacent words collapsed into\n   single words and nl-trie-entries associated with the words in SENTENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ZEROP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"))), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SENTENCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-VEC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-YIELD"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AREF"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-VEC"), (SubLObject)abstract_lexicon.ZERO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RECORD-LENGTH"), (SubLObject)abstract_lexicon.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED-TOKENS"), (SubLObject)abstract_lexicon.NIL), (SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKENIZING-STREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-PRIVATE-STRING-OUTPUT-STREAM")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAGGER-NORMALIZE-INITIAL-CAPITALIZATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-TAGGER")), (SubLObject)SubLObjectFactory.makeSymbol("WORD-VEC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VECTOR-ELEMENTS"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-VEC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*LEXICON-LOOKUP-MT*"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDO"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)abstract_lexicon.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("RECORD-LENGTH"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKENS"), (SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTHCDR"), (SubLObject)SubLObjectFactory.makeSymbol("RECORD-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TOKEN-ADDED?"), (SubLObject)abstract_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-STRING-TOKENIZE-MULTIPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTRUCT-STRING-FROM-WORDS"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeSymbol("TOKENIZING-STREAM"))), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TOKEN-ADDED?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREFIXES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-PREFIXES-MEMOIZED"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGS"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TOKEN"), (SubLObject)abstract_lexicon.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCAL-CASE-SENSITIVITY"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITERATION-COUNT"), (SubLObject)abstract_lexicon.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNTIL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED-WORD-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TOKEN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EMPTY-LIST-P"), (SubLObject)SubLObjectFactory.makeSymbol("PREFIXES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("ITERATION-COUNT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)SubLObjectFactory.makeSymbol("ITERATION-COUNT"), (SubLObject)abstract_lexicon.TWENTY_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BREAK"), (SubLObject)SubLObjectFactory.makeString("20 iterations hit inside abstract-lexicon:lexify-sentence.  We seem to be stuck.  Please report this problem through standard bug-reporting channels. '~S'"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POP-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RECORD"), (SubLObject)SubLObjectFactory.makeSymbol("PREFIXES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TOKEN"), (SubLObject)SubLObjectFactory.makeSymbol("RECORD-LENGTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LEX-ENTRIES-FOR-PREFIX"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGS"), (SubLObject)SubLObjectFactory.makeSymbol("RECORD"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EMPTY-LIST-P"), (SubLObject)SubLObjectFactory.makeSymbol("PREFIXES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-INFO"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TOKEN"))), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.EQ, (SubLObject)SubLObjectFactory.makeSymbol("LOCAL-CASE-SENSITIVITY"), (SubLObject)SubLObjectFactory.makeKeyword("PREFERRED"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LOCAL-CASE-SENSITIVITY"), (SubLObject)SubLObjectFactory.makeKeyword("OFF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PREFIXES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-PREFIXES-MEMOIZED"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGS"), (SubLObject)SubLObjectFactory.makeSymbol("LOCAL-CASE-SENSITIVITY"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TOKEN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TOKEN"), (SubLObject)SubLObjectFactory.makeSymbol("RECORD-LENGTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LEX-ENTRIES-FOR-PREFIX"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGS"), (SubLObject)abstract_lexicon.NIL, (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("RECORD-LENGTH"), (SubLObject)abstract_lexicon.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TOKEN"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED-TOKENS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TOKEN-ADDED?"), (SubLObject)abstract_lexicon.T))))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIGN-CONSTITUENTS"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED-TOKENS")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)abstract_lexicon.EQUAL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-GET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)abstract_lexicon.ZERO_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-WORD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-UPDATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-GET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)abstract_lexicon.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REPLACE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-GET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)abstract_lexicon.ZERO_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-WORD"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIGN-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-MOTHER"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPH-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-MOTHER"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE")), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED")) }));
        $sym493$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym494$SENTENCE_P = SubLObjectFactory.makeSymbol("SENTENCE-P");
        $str495$20_iterations_hit_inside_abstract = SubLObjectFactory.makeString("20 iterations hit inside abstract-lexicon:lexify-sentence.  We seem to be stuck.  Please report this problem through standard bug-reporting channels. '~S'");
        $sym496$ABSTRACT_LEXICON_LEXIFY_SENTENCE_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-LEXIFY-SENTENCE-METHOD");
        $list497 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param sentence sentence-p;\n   @return sentence-p; a new version of SENTENCE with all possible lexical matches included.  \n   The document will contain exhaustive-word-p's, each of which will contain zero or more \n   word-p's with attached nl-trie-entries"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ZEROP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"))), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SENTENCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-VEC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-YIELD"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AREF"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-VEC"), (SubLObject)abstract_lexicon.ZERO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXHAUSTIVE-WORDS"), (SubLObject)abstract_lexicon.NIL), (SubLObject)SubLObjectFactory.makeSymbol("WORDS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAGGER-NORMALIZE-INITIAL-CAPITALIZATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-TAGGER")), (SubLObject)SubLObjectFactory.makeSymbol("WORD-VEC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VECTOR-ELEMENTS"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-VEC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*LEXICON-LOOKUP-MT*"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDO"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)abstract_lexicon.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)abstract_lexicon.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKENS"), (SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-STRING")), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGS")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREFIXES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-PREFIXES-MEMOIZED"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGS"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARENT-WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-EXHAUSTIVE-WORD-FROM-WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREFIX-WORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ALL-PREFIX-WORDS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("PREFIXES"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGS"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)SubLObjectFactory.makeSymbol("PARENT-WORD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIGN-CONSTITUENTS"), (SubLObject)SubLObjectFactory.makeSymbol("PARENT-WORD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR")), (SubLObject)SubLObjectFactory.makeSymbol("PREFIX-WORDS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("PARENT-WORD"), (SubLObject)SubLObjectFactory.makeSymbol("EXHAUSTIVE-WORDS"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIGN-CONSTITUENTS"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("EXHAUSTIVE-WORDS")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-WORD-OBJ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-GET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)abstract_lexicon.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VECTOR-ELEMENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-CONSTITUENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-GET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)abstract_lexicon.ZERO_INTEGER))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-UPDATE"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-WORD-OBJ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REPLACE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-WORD-OBJ")), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-WORD"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIGN-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-MOTHER"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPH-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-MOTHER"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE")), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED")) }));
        $sym498$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym499$ABSTRACT_LEXICON_LEXIFY_SENTENCE_EXHAUSTIVELY_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-LEXIFY-SENTENCE-EXHAUSTIVELY-METHOD");
        $str500$ = SubLObjectFactory.makeString("");
        $str501$_ = SubLObjectFactory.makeString("'");
        $str502$word_has_no_offset = SubLObjectFactory.makeString("word has no offset");
        $kw503$CATEGORY = SubLObjectFactory.makeKeyword("CATEGORY");
        $kw504$MOTHER = SubLObjectFactory.makeKeyword("MOTHER");
        $kw505$INFO = SubLObjectFactory.makeKeyword("INFO");
        $kw506$OFFSET = SubLObjectFactory.makeKeyword("OFFSET");
        $list507 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VB"), (SubLObject)SubLObjectFactory.makeKeyword("VBN"), (SubLObject)SubLObjectFactory.makeKeyword("VBZ"), (SubLObject)SubLObjectFactory.makeKeyword("VBD"));
        $list508 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CD"));
        $const509$multiWordString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiWordString"));
        $kw510$BACKOFF_PENN_TAGS = SubLObjectFactory.makeKeyword("BACKOFF-PENN-TAGS");
        $sym511$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $sym512$GET_CATEGORY = SubLObjectFactory.makeSymbol("GET-CATEGORY");
        $list513 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NNP"), (SubLObject)SubLObjectFactory.makeKeyword("NNPS"), (SubLObject)SubLObjectFactory.makeKeyword("NN"), (SubLObject)SubLObjectFactory.makeKeyword("NNS"));
        $sym514$LEXIFY_WORDS = SubLObjectFactory.makeSymbol("LEXIFY-WORDS");
        $list515 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORDS"));
        $list516 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param WORDS listp;\n   @return listp; a list of <string, category, lex-entries> triples for WORDS, where\n   STRING may be several of WORDS collapsed into a single entry"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RECORD-LENGTH"), (SubLObject)abstract_lexicon.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED-TOKENS"), (SubLObject)abstract_lexicon.NIL), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDO"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)abstract_lexicon.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("RECORD-LENGTH"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKENS"), (SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTHCDR"), (SubLObject)SubLObjectFactory.makeSymbol("RECORD-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PARSE-TREE-STRING")), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTHCDR"), (SubLObject)SubLObjectFactory.makeSymbol("RECORD-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RECORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-PREFIXES"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGS"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-PREFIXES"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGS"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVITY")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RECORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-END"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NL-TRIE-RECORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))), (SubLObject)abstract_lexicon.NIL), (SubLObject)SubLObjectFactory.makeSymbol("RECORDS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TOKEN-ADDED-FOR-PREFIXE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RECORD"), (SubLObject)SubLObjectFactory.makeSymbol("RECORDS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TOKEN-ADDED-FOR-PREFIXE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RECORD-LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-RECORD-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("RECORD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BUILD-MULTI-WORD-LEXEME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-N"), (SubLObject)SubLObjectFactory.makeSymbol("RECORD-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GUESS-CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TOKENS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"), (SubLObject)abstract_lexicon.NIL), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES0"), (SubLObject)SubLObjectFactory.makeSymbol("EXISTS?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-CACHE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES0"), (SubLObject)SubLObjectFactory.makeSymbol("EXISTS?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHE-GET"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("EXISTS?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-RECORD-ENTRIES"), (SubLObject)SubLObjectFactory.makeSymbol("RECORD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VALID-NL-TRIE-ENTRY?")), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES")), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES0"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-CACHE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CACHE-SET"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES0")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES0")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("PENN-TAGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY-EQUAL-P"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES0")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("BACKOFF-PENN-TAGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY-EQUAL-P")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-RECORD-ENTRIES"), (SubLObject)SubLObjectFactory.makeSymbol("RECORD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TOKEN-ADDED-FOR-PREFIXE"), (SubLObject)abstract_lexicon.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES")), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED-TOKENS")))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED-TOKENS")))));
        $sym517$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
        $sym518$GET_PARSE_TREE_STRING = SubLObjectFactory.makeSymbol("GET-PARSE-TREE-STRING");
        $sym519$ABSTRACT_LEXICON_LEXIFY_WORDS_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-LEXIFY-WORDS-METHOD");
        $str520$_ = SubLObjectFactory.makeString(" ");
        $sym521$TOKENIZE = SubLObjectFactory.makeSymbol("TOKENIZE");
        $list522 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STRING stringp; an English string\n   @return listp; a list of English string tokens from STRING\n   @note Not the most efficient way since words and lexical entries are painfully constructed\n   and then discarded...this should duplicate only the tokenization part of the 'lexify method"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FST-STRING-WORDIFY"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGS"), (SubLObject)abstract_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-DO-WORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("WORDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("WORD")), (SubLObject)SubLObjectFactory.makeSymbol("STRINGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGS")))));
        $sym523$FST_STRING_WORDIFY = SubLObjectFactory.makeSymbol("FST-STRING-WORDIFY");
        $sym524$ABSTRACT_LEXICON_TOKENIZE_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-TOKENIZE-METHOD");
        $list525 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym526$ITERATOR = SubLObjectFactory.makeUninternedSymbol("ITERATOR");
        $sym527$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym528$NEW_LEXICON_ITERATOR = SubLObjectFactory.makeSymbol("NEW-LEXICON-ITERATOR");
        $sym529$UNTIL = SubLObjectFactory.makeSymbol("UNTIL");
        $sym530$ITERATION_DONE = SubLObjectFactory.makeSymbol("ITERATION-DONE");
        $sym531$ITERATION_NEXT = SubLObjectFactory.makeSymbol("ITERATION-NEXT");
        $sym532$FIM = SubLObjectFactory.makeSymbol("FIM");
        $list533 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"));
        $sym534$ITERATOR = SubLObjectFactory.makeSymbol("ITERATOR");
        $list535 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return iterator-p; an iterator for this lexicon"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LEXICON-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym536$ABSTRACT_LEXICON_ITERATOR_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-METHOD");
        $sym537$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym538$NEW_LEXICON_FROM_KB_SPEC = SubLObjectFactory.makeSymbol("NEW-LEXICON-FROM-KB-SPEC");
        $list539 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB-SPEC"));
        $str540$_param_KB_SPEC__the_CycL_type_of_ = SubLObjectFactory.makeString("@param KB-SPEC; the CycL type of the lexicon that you want to create.  This must be a specialization of #$AbstractLexiconSpecification\n   @return ABSTRACT-LEXICON-P; the fully-instantiated lexicon object");
        $list541 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $list542 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-P"));
        $sym543$_CLASS_NAME = SubLObjectFactory.makeSymbol("?CLASS-NAME");
        $const544$objectClassName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectClassName"));
        $list545 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?CLASS-NAME"));
        $sym546$PREDS_FOR_LEXICON_EXCLUSION = SubLObjectFactory.makeSymbol("PREDS-FOR-LEXICON-EXCLUSION");
        $sym547$_PRED = SubLObjectFactory.makeSymbol("?PRED");
        $const548$disallowedLexicalPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disallowedLexicalPredicate"));
        $list549 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PRED"));
        $list550 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)abstract_lexicon.ONE_INTEGER);
        $sym551$_PREDS_FOR_LEXICON_EXCLUSION_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PREDS-FOR-LEXICON-EXCLUSION-CACHING-STATE*");
        $sym552$CLEAR_PREDS_FOR_LEXICON_EXCLUSION = SubLObjectFactory.makeSymbol("CLEAR-PREDS-FOR-LEXICON-EXCLUSION");
        $sym553$ABSTRACT_LEXICON_ITERATOR_STATE_DONE_P = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-DONE-P");
        $sym554$ABSTRACT_LEXICON_ITERATOR_STATE_NEXT = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-NEXT");
        $sym555$ABSTRACT_LEXICON_ITERATOR_STATE = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE");
        $sym556$ABSTRACT_LEXICON_ITERATOR_STATE_P = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-P");
        $list557 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRIE-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-ENTRIES"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"));
        $list558 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRIE-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("NEXT-ENTRIES"), (SubLObject)SubLObjectFactory.makeKeyword("LEXICON"));
        $list559 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-TRIE-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-NEXT-ENTRIES"), (SubLObject)SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-LEXICON"));
        $list560 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-TRIE-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-NEXT-ENTRIES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-LEXICON"));
        $sym561$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym562$ABSTRACT_LEXICON_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list563 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-P"));
        $sym564$ABSTRACT_LEXICON_ITERATOR_STATE_TRIE_ITERATOR = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-TRIE-ITERATOR");
        $sym565$_CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_TRIE_ITERATOR = SubLObjectFactory.makeSymbol("_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-TRIE-ITERATOR");
        $sym566$ABSTRACT_LEXICON_ITERATOR_STATE_NEXT_ENTRIES = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-NEXT-ENTRIES");
        $sym567$_CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_NEXT_ENTRIES = SubLObjectFactory.makeSymbol("_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-NEXT-ENTRIES");
        $sym568$ABSTRACT_LEXICON_ITERATOR_STATE_LEXICON = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-LEXICON");
        $sym569$_CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_LEXICON = SubLObjectFactory.makeSymbol("_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-LEXICON");
        $kw570$TRIE_ITERATOR = SubLObjectFactory.makeKeyword("TRIE-ITERATOR");
        $kw571$NEXT_ENTRIES = SubLObjectFactory.makeKeyword("NEXT-ENTRIES");
        $kw572$LEXICON = SubLObjectFactory.makeKeyword("LEXICON");
        $sym573$MAKE_ABSTRACT_LEXICON_ITERATOR_STATE = SubLObjectFactory.makeSymbol("MAKE-ABSTRACT-LEXICON-ITERATOR-STATE");
        $sym574$VISIT_DEFSTRUCT_OBJECT_ABSTRACT_LEXICON_ITERATOR_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-ABSTRACT-LEXICON-ITERATOR-STATE-METHOD");
        $list575 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-ENTRIES"));
        $list576 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym577$STACK = SubLObjectFactory.makeUninternedSymbol("STACK");
        $sym578$ENTRY = SubLObjectFactory.makeUninternedSymbol("ENTRY");
        $list579 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-STACK")));
        $sym580$STACK_PUSH = SubLObjectFactory.makeSymbol("STACK-PUSH");
        $sym581$STACK_EMPTY_P = SubLObjectFactory.makeSymbol("STACK-EMPTY-P");
        $sym582$STACK_POP = SubLObjectFactory.makeSymbol("STACK-POP");
        $sym583$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym584$FIRST_ORDER_TERM_ = SubLObjectFactory.makeSymbol("FIRST-ORDER-TERM?");
        $sym585$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym586$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym587$ARG = SubLObjectFactory.makeSymbol("ARG");
        $sym588$FORMULA_TERMS = SubLObjectFactory.makeSymbol("FORMULA-TERMS");
        $sym589$SCALAR_INTERVAL_MEANINGS = SubLObjectFactory.makeSymbol("SCALAR-INTERVAL-MEANINGS");
        $kw590$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw591$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw592$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw593$KB = SubLObjectFactory.makeKeyword("KB");
        $kw594$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw595$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list596 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("0.4")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("0.4"), (SubLObject)SubLObjectFactory.makeDouble(0.4)))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("-0.4")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("-0.4"), (SubLObject)SubLObjectFactory.makeDouble(-0.4)))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("-.4")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("-.4"), (SubLObject)SubLObjectFactory.makeDouble(-0.4)))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("0.4%")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("0.4%"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Percent")), (SubLObject)SubLObjectFactory.makeDouble(0.4))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("4%")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("4%"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Percent")), (SubLObject)abstract_lexicon.FOUR_INTEGER)))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(".4%")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString(".4%"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Percent")), (SubLObject)SubLObjectFactory.makeDouble(0.4))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("-0.4%")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("-0.4%"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Percent")), (SubLObject)SubLObjectFactory.makeDouble(-0.4))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("-.4%")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("-.4%"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Percent")), (SubLObject)SubLObjectFactory.makeDouble(-0.4))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("-4%")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("-4%"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Percent")), (SubLObject)SubLObjectFactory.makeInteger(-4))))) });
        $sym597$TEXT_NUMBERS = SubLObjectFactory.makeSymbol("TEXT-NUMBERS");
        $list598 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3.4   billion dogs and 2 cats")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3.4   billion"), (SubLObject)SubLObjectFactory.makeString("2"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3.4   billion 2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3.4   billion"), (SubLObject)SubLObjectFactory.makeString("2"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3.1415926 is pi")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3.1415926"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("November 12 1832")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("12"), (SubLObject)SubLObjectFactory.makeString("1832"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3.1415926, 2.3456789 and 1.3254 are numbers")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3.1415926"), (SubLObject)SubLObjectFactory.makeString("2.3456789"), (SubLObject)SubLObjectFactory.makeString("1.3254"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3.1415926, -2.3456789 and 1.3254 are numbers")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3.1415926"), (SubLObject)SubLObjectFactory.makeString("-2.3456789"), (SubLObject)SubLObjectFactory.makeString("1.3254"))));
        $list599 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING1"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER1"));
        $list600 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING2"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER2"));
        $sym601$NUMBER_MEANINGS_EQUAL_ = SubLObjectFactory.makeSymbol("NUMBER-MEANINGS-EQUAL?");
        $sym602$NUMBER_MEANINGS = SubLObjectFactory.makeSymbol("NUMBER-MEANINGS");
        $sym603$NUMBER_MEANINGS_RESULTS_EQUAL_ = SubLObjectFactory.makeSymbol("NUMBER-MEANINGS-RESULTS-EQUAL?");
        $list604 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3.4   billion dogs and 2 cats")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("2"), (SubLObject)abstract_lexicon.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3.4   billion"), (SubLObject)SubLObjectFactory.makeDouble(3.4E9)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3.1415926 is pi")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3.1415926"), (SubLObject)SubLObjectFactory.makeDouble(3.1415926)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3.1415926, 2.3456789 and 1.3254 are numbers")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.3254"), (SubLObject)SubLObjectFactory.makeDouble(1.3254)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("2.3456789"), (SubLObject)SubLObjectFactory.makeDouble(2.3456789)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3.1415926"), (SubLObject)SubLObjectFactory.makeDouble(3.1415926)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3.1415926, -2.3456789 and 1.3254 are numbers")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.3254"), (SubLObject)SubLObjectFactory.makeDouble(1.3254)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("-2.3456789"), (SubLObject)SubLObjectFactory.makeDouble(-2.3456789)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("3.1415926"), (SubLObject)SubLObjectFactory.makeDouble(3.1415926)))));
        $sym605$TOKENIZING_TEST_COVERING = SubLObjectFactory.makeSymbol("TOKENIZING-TEST-COVERING");
        $list606 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("glyceraldehdyde 3-phosphate (G3P) sleep"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Glyceraldehyde3Phosphate")))), (SubLObject)abstract_lexicon.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("glyceraldehdyde 3-phosphate (G3P)"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Glyceraldehyde3Phosphate")))), (SubLObject)abstract_lexicon.T));
    }

    public static final class $textract_lemma_native extends SubLStructNative
    {
        public SubLObject $paragraph;
        public SubLObject $sentence;
        public SubLObject $word;
        public SubLObject $string;
        public SubLObject $canon;
        public SubLObject $type;
        private static final SubLStructDeclNative structDecl;

        public $textract_lemma_native() {
            this.$paragraph = (SubLObject)CommonSymbols.NIL;
            this.$sentence = (SubLObject)CommonSymbols.NIL;
            this.$word = (SubLObject)CommonSymbols.NIL;
            this.$string = (SubLObject)CommonSymbols.NIL;
            this.$canon = (SubLObject)CommonSymbols.NIL;
            this.$type = (SubLObject)CommonSymbols.NIL;
        }

        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$textract_lemma_native.structDecl;
        }

        public SubLObject getField2() {
            return this.$paragraph;
        }

        public SubLObject getField3() {
            return this.$sentence;
        }

        public SubLObject getField4() {
            return this.$word;
        }

        public SubLObject getField5() {
            return this.$string;
        }

        public SubLObject getField6() {
            return this.$canon;
        }

        public SubLObject getField7() {
            return this.$type;
        }

        public SubLObject setField2(final SubLObject value) {
            return this.$paragraph = value;
        }

        public SubLObject setField3(final SubLObject value) {
            return this.$sentence = value;
        }

        public SubLObject setField4(final SubLObject value) {
            return this.$word = value;
        }

        public SubLObject setField5(final SubLObject value) {
            return this.$string = value;
        }

        public SubLObject setField6(final SubLObject value) {
            return this.$canon = value;
        }

        public SubLObject setField7(final SubLObject value) {
            return this.$type = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative((Class)$textract_lemma_native.class, abstract_lexicon.$sym10$TEXTRACT_LEMMA, abstract_lexicon.$sym11$TEXTRACT_LEMMA_P, abstract_lexicon.$list12, abstract_lexicon.$list13, new String[] { "$paragraph", "$sentence", "$word", "$string", "$canon", "$type" }, abstract_lexicon.$list14, abstract_lexicon.$list15, abstract_lexicon.$sym16$TEXTRACT_LEMMA_PRINT);
        }
    }

    public static final class $textract_lemma_p$UnaryFunction extends UnaryFunction
    {
        public $textract_lemma_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TEXTRACT-LEMMA-P"));
        }

        public SubLObject processItem(final SubLObject arg1) {
            return abstract_lexicon.textract_lemma_p(arg1);
        }
    }

    public static final class $clear_preds_for_lexicon_exclusion$ZeroArityFunction extends ZeroArityFunction
    {
        public $clear_preds_for_lexicon_exclusion$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-PREDS-FOR-LEXICON-EXCLUSION"));
        }

        public SubLObject processItem() {
            return abstract_lexicon.clear_preds_for_lexicon_exclusion();
        }
    }

    public static final class $abstract_lexicon_iterator_state_native extends SubLStructNative
    {
        public SubLObject $trie_iterator;
        public SubLObject $next_entries;
        public SubLObject $lexicon;
        private static final SubLStructDeclNative structDecl;

        public $abstract_lexicon_iterator_state_native() {
            this.$trie_iterator = (SubLObject)CommonSymbols.NIL;
            this.$next_entries = (SubLObject)CommonSymbols.NIL;
            this.$lexicon = (SubLObject)CommonSymbols.NIL;
        }

        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$abstract_lexicon_iterator_state_native.structDecl;
        }

        public SubLObject getField2() {
            return this.$trie_iterator;
        }

        public SubLObject getField3() {
            return this.$next_entries;
        }

        public SubLObject getField4() {
            return this.$lexicon;
        }

        public SubLObject setField2(final SubLObject value) {
            return this.$trie_iterator = value;
        }

        public SubLObject setField3(final SubLObject value) {
            return this.$next_entries = value;
        }

        public SubLObject setField4(final SubLObject value) {
            return this.$lexicon = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative((Class)$abstract_lexicon_iterator_state_native.class, abstract_lexicon.$sym555$ABSTRACT_LEXICON_ITERATOR_STATE, abstract_lexicon.$sym556$ABSTRACT_LEXICON_ITERATOR_STATE_P, abstract_lexicon.$list557, abstract_lexicon.$list558, new String[] { "$trie_iterator", "$next_entries", "$lexicon" }, abstract_lexicon.$list559, abstract_lexicon.$list560, abstract_lexicon.$sym561$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $abstract_lexicon_iterator_state_p$UnaryFunction extends UnaryFunction
    {
        public $abstract_lexicon_iterator_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ABSTRACT-LEXICON-ITERATOR-STATE-P"));
        }

        public SubLObject processItem(final SubLObject arg1) {
            return abstract_lexicon.abstract_lexicon_iterator_state_p(arg1);
        }
    }
}

/*

	Total time: 3214 ms
	 synthetic
*/