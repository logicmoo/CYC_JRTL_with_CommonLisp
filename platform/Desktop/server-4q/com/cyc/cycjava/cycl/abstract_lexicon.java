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
	public static SubLObject get_cyc_to_penn_map()
	{
		ensure_cyc_to_penn_map();
		return $cyc_to_penn_map$.getGlobalValue();
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 3353L)
	public static SubLObject ensure_cyc_to_penn_map()
	{
		if (NIL == $cyc_to_penn_map$.getGlobalValue())
		{
			$cyc_to_penn_map$.setGlobalValue(build_cyc_to_penn_map());
		}
		return $cyc_to_penn_map$.getGlobalValue();
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 3503L)
	public static SubLObject reinitialize_cyc_to_penn_map()
	{
		$cyc_to_penn_map$.setGlobalValue(NIL);
		$cyc_to_penn_list$.setGlobalValue(NIL);
		return get_cyc_to_penn_map();
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 3648L)
	public static SubLObject get_cyc_to_penn_list()
	{
		ensure_cyc_to_penn_list();
		return $cyc_to_penn_list$.getGlobalValue();
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 3745L)
	public static SubLObject ensure_cyc_to_penn_list()
	{
		if (NIL == $cyc_to_penn_list$.getGlobalValue())
		{
			$cyc_to_penn_list$.setGlobalValue(Sequences.nreverse(list_utilities.partial_order_sort($list0, $sym1$GENL_IN_ANY_MT_, $sym2$SECOND)));
		}
		return $cyc_to_penn_list$.getGlobalValue();
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 6218L)
	public static SubLObject rebuild_cyc_to_penn_map()
	{
		$cyc_to_penn_list$.setGlobalValue(NIL);
		$cyc_to_penn_map$.setGlobalValue(build_cyc_to_penn_map());
		return $cyc_to_penn_map$.getGlobalValue();
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 6374L)
	public static SubLObject build_cyc_to_penn_map()
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject cyc_to_penn = Hashtables.make_hash_table($int3$500, Symbols.symbol_function(EQUAL), UNPROVIDED);
		SubLObject super_pos = NIL;
		SubLObject super_pred = NIL;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try
		{
			mt_relevance_macros.$relevant_mt_function$.bind($sym4$RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($const5$EverythingPSC, thread);
			final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
			final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
			final SubLObject _prev_bind_1_$2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
			final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
			try
			{
				sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
				sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
				sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
				SubLObject cdolist_list_var = get_cyc_to_penn_list();
				SubLObject mapentry = NIL;
				mapentry = cdolist_list_var.first();
				while (NIL != cdolist_list_var)
				{
					super_pos = conses_high.second(mapentry);
					super_pred = ((NIL != conses_high.third(mapentry)) ? conses_high.third(mapentry) : $const6$partOfSpeech);
					SubLObject cdolist_list_var_$3 = genls.all_specs(super_pos, $const7$GeneralLexiconMt, UNPROVIDED);
					SubLObject sub_pos = NIL;
					sub_pos = cdolist_list_var_$3.first();
					while (NIL != cdolist_list_var_$3)
					{
						SubLObject cdolist_list_var_$4 = genl_predicates.all_spec_predicates(super_pred, UNPROVIDED, UNPROVIDED);
						SubLObject sub_pred = NIL;
						sub_pred = cdolist_list_var_$4.first();
						while (NIL != cdolist_list_var_$4)
						{
							Hashtables.sethash(ConsesLow.cons(sub_pos, sub_pred), cyc_to_penn, mapentry.first());
							cdolist_list_var_$4 = cdolist_list_var_$4.rest();
							sub_pred = cdolist_list_var_$4.first();
						}
						cdolist_list_var_$3 = cdolist_list_var_$3.rest();
						sub_pos = cdolist_list_var_$3.first();
					}
					cdolist_list_var = cdolist_list_var.rest();
					mapentry = cdolist_list_var.first();
				}
			} finally
			{
				sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
				sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$2, thread);
				sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$1, thread);
			}
		} finally
		{
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return cyc_to_penn;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 8873L)
	public static SubLObject build_cyc_to_supertag_map()
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject cyc_to_supertag = Hashtables.make_hash_table($int3$500, Symbols.symbol_function(EQUAL), UNPROVIDED);
		SubLObject cyc = NIL;
		SubLObject supertag = NIL;
		SubLObject super_pos = NIL;
		SubLObject super_frame = NIL;
		SubLObject super_pred = NIL;
		final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
		final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
		final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
		final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
		try
		{
			sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
			sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
			sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
			SubLObject cdolist_list_var = $cyc_to_supertag_list$.getDynamicValue(thread);
			SubLObject mapentry = NIL;
			mapentry = cdolist_list_var.first();
			while (NIL != cdolist_list_var)
			{
				supertag = mapentry.first();
				cyc = mapentry.rest();
				super_pos = cyc.first();
				super_frame = conses_high.second(cyc);
				super_pred = conses_high.third(cyc);
				SubLObject cdolist_list_var_$5 = genls.all_specs(super_pos, $const9$GeneralEnglishMt, UNPROVIDED);
				SubLObject sub_pos = NIL;
				sub_pos = cdolist_list_var_$5.first();
				while (NIL != cdolist_list_var_$5)
				{
					SubLObject cdolist_list_var_$6 = ConsesLow.cons(super_frame, isa.all_fort_instances(super_frame, $const9$GeneralEnglishMt, UNPROVIDED));
					SubLObject sub_frame = NIL;
					sub_frame = cdolist_list_var_$6.first();
					while (NIL != cdolist_list_var_$6)
					{
						SubLObject cdolist_list_var_$7 = ((NIL != super_pred) ? genl_predicates.all_spec_preds(super_pred, $const9$GeneralEnglishMt, UNPROVIDED) : ConsesLow.list(NIL));
						SubLObject sub_pred = NIL;
						sub_pred = cdolist_list_var_$7.first();
						while (NIL != cdolist_list_var_$7)
						{
							Hashtables.sethash(ConsesLow.list(sub_pos, sub_frame, sub_pred), cyc_to_supertag, supertag);
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
		} finally
		{
			sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
			sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
			sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
		}
		return cyc_to_supertag;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
	public static SubLObject textract_lemma_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
	{
		textract_lemma_print(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
	public static SubLObject textract_lemma_p(final SubLObject v_object)
	{
		return ((v_object.getClass() == $textract_lemma_native.class) ? T : NIL);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
	public static SubLObject textract_lemma_paragraph(final SubLObject v_object)
	{
		assert NIL != textract_lemma_p(v_object) : v_object;
		return v_object.getField2();
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
	public static SubLObject textract_lemma_sentence(final SubLObject v_object)
	{
		assert NIL != textract_lemma_p(v_object) : v_object;
		return v_object.getField3();
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
	public static SubLObject textract_lemma_word(final SubLObject v_object)
	{
		assert NIL != textract_lemma_p(v_object) : v_object;
		return v_object.getField4();
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
	public static SubLObject textract_lemma_string(final SubLObject v_object)
	{
		assert NIL != textract_lemma_p(v_object) : v_object;
		return v_object.getField5();
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
	public static SubLObject textract_lemma_canon(final SubLObject v_object)
	{
		assert NIL != textract_lemma_p(v_object) : v_object;
		return v_object.getField6();
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
	public static SubLObject textract_lemma_type(final SubLObject v_object)
	{
		assert NIL != textract_lemma_p(v_object) : v_object;
		return v_object.getField7();
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
	public static SubLObject _csetf_textract_lemma_paragraph(final SubLObject v_object, final SubLObject value)
	{
		assert NIL != textract_lemma_p(v_object) : v_object;
		return v_object.setField2(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
	public static SubLObject _csetf_textract_lemma_sentence(final SubLObject v_object, final SubLObject value)
	{
		assert NIL != textract_lemma_p(v_object) : v_object;
		return v_object.setField3(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
	public static SubLObject _csetf_textract_lemma_word(final SubLObject v_object, final SubLObject value)
	{
		assert NIL != textract_lemma_p(v_object) : v_object;
		return v_object.setField4(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
	public static SubLObject _csetf_textract_lemma_string(final SubLObject v_object, final SubLObject value)
	{
		assert NIL != textract_lemma_p(v_object) : v_object;
		return v_object.setField5(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
	public static SubLObject _csetf_textract_lemma_canon(final SubLObject v_object, final SubLObject value)
	{
		assert NIL != textract_lemma_p(v_object) : v_object;
		return v_object.setField6(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
	public static SubLObject _csetf_textract_lemma_type(final SubLObject v_object, final SubLObject value)
	{
		assert NIL != textract_lemma_p(v_object) : v_object;
		return v_object.setField7(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
	public static SubLObject make_textract_lemma(SubLObject arglist)
	{
		if (arglist == UNPROVIDED)
		{
			arglist = NIL;
		}
		final SubLObject v_new = new $textract_lemma_native();
		SubLObject next;
		SubLObject current_arg;
		SubLObject current_value;
		SubLObject pcase_var;
		for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next))
		{
			current_arg = next.first();
			current_value = conses_high.cadr(next);
			pcase_var = current_arg;
			if (pcase_var.eql($kw31$PARAGRAPH))
			{
				_csetf_textract_lemma_paragraph(v_new, current_value);
			}
			else if (pcase_var.eql($kw32$SENTENCE))
			{
				_csetf_textract_lemma_sentence(v_new, current_value);
			}
			else if (pcase_var.eql($kw33$WORD))
			{
				_csetf_textract_lemma_word(v_new, current_value);
			}
			else if (pcase_var.eql($kw34$STRING))
			{
				_csetf_textract_lemma_string(v_new, current_value);
			}
			else if (pcase_var.eql($kw35$CANON))
			{
				_csetf_textract_lemma_canon(v_new, current_value);
			}
			else if (pcase_var.eql($kw36$TYPE))
			{
				_csetf_textract_lemma_type(v_new, current_value);
			}
			else
			{
				Errors.error($str37$Invalid_slot__S_for_construction_, current_arg);
			}
		}
		return v_new;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
	public static SubLObject visit_defstruct_textract_lemma(final SubLObject obj, final SubLObject visitor_fn)
	{
		Functions.funcall(visitor_fn, obj, $kw38$BEGIN, $sym39$MAKE_TEXTRACT_LEMMA, SIX_INTEGER);
		Functions.funcall(visitor_fn, obj, $kw40$SLOT, $kw31$PARAGRAPH, textract_lemma_paragraph(obj));
		Functions.funcall(visitor_fn, obj, $kw40$SLOT, $kw32$SENTENCE, textract_lemma_sentence(obj));
		Functions.funcall(visitor_fn, obj, $kw40$SLOT, $kw33$WORD, textract_lemma_word(obj));
		Functions.funcall(visitor_fn, obj, $kw40$SLOT, $kw34$STRING, textract_lemma_string(obj));
		Functions.funcall(visitor_fn, obj, $kw40$SLOT, $kw35$CANON, textract_lemma_canon(obj));
		Functions.funcall(visitor_fn, obj, $kw40$SLOT, $kw36$TYPE, textract_lemma_type(obj));
		Functions.funcall(visitor_fn, obj, $kw41$END, $sym39$MAKE_TEXTRACT_LEMMA, SIX_INTEGER);
		return obj;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9783L)
	public static SubLObject visit_defstruct_object_textract_lemma_method(final SubLObject obj, final SubLObject visitor_fn)
	{
		return visit_defstruct_textract_lemma(obj, visitor_fn);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 9962L)
	public static SubLObject new_textract_lemma(final SubLObject line)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != Types.stringp(line) : line;
		SubLObject lemma = make_textract_lemma(UNPROVIDED);
		final SubLObject coordsXstring = string_utilities.split_string(string_utilities.trim_whitespace(string_utilities.string_upto(line, Characters.CHAR_lparen)), UNPROVIDED);
		SubLObject error = NIL;
		try
		{
			thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
			final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
			try
			{
				Errors.$error_handler$.bind($sym44$CATCH_ERROR_MESSAGE_HANDLER, thread);
				try
				{
					_csetf_textract_lemma_paragraph(lemma, reader.parse_integer(coordsXstring.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
					_csetf_textract_lemma_sentence(lemma, reader.parse_integer(conses_high.second(coordsXstring), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
					_csetf_textract_lemma_word(lemma, reader.parse_integer(conses_high.third(coordsXstring), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
					_csetf_textract_lemma_string(lemma, string_utilities.bunge(conses_high.nthcdr(THREE_INTEGER, coordsXstring), UNPROVIDED));
					_csetf_textract_lemma_canon(lemma, string_utilities.trim_whitespace(string_utilities.string_between(line, $list45, UNPROVIDED)));
					_csetf_textract_lemma_type(lemma, Symbols.make_keyword(string_utilities.string_between(line, $list46, UNPROVIDED)));
				} catch (Throwable catch_var)
				{
					Errors.handleThrowable(catch_var, NIL);
				}
			} finally
			{
				Errors.$error_handler$.rebind(_prev_bind_0, thread);
			}
		} catch (Throwable ccatch_env_var)
		{
			error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
		} finally
		{
			thread.throwStack.pop();
		}
		if (NIL != error)
		{
			lemma = NIL;
		}
		return lemma;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 10855L)
	public static SubLObject textract_lemma_print(final SubLObject lemma, final SubLObject stream, final SubLObject depth)
	{
		streams_high.write_string($str47$__TEXTRACT_LEMMA_, stream, UNPROVIDED, UNPROVIDED);
		print_high.princ(textract_lemma_paragraph(lemma), stream);
		streams_high.write_string($str48$_, stream, UNPROVIDED, UNPROVIDED);
		print_high.princ(textract_lemma_sentence(lemma), stream);
		streams_high.write_string($str48$_, stream, UNPROVIDED, UNPROVIDED);
		print_high.princ(textract_lemma_word(lemma), stream);
		streams_high.write_string($str48$_, stream, UNPROVIDED, UNPROVIDED);
		streams_high.write_string(textract_lemma_string(lemma), stream, UNPROVIDED, UNPROVIDED);
		streams_high.write_string($str48$_, stream, UNPROVIDED, UNPROVIDED);
		streams_high.write_string(textract_lemma_canon(lemma), stream, UNPROVIDED, UNPROVIDED);
		streams_high.write_string($str48$_, stream, UNPROVIDED, UNPROVIDED);
		print_high.princ(textract_lemma_type(lemma), stream);
		streams_high.write_string($str49$_, stream, UNPROVIDED, UNPROVIDED);
		return lemma;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 11456L)
	public static SubLObject get_lex_entry_properties(final SubLObject lex_entry)
	{
		return classes.subloop_get_access_protected_instance_slot(lex_entry, ONE_INTEGER, $sym53$PROPERTIES);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 11456L)
	public static SubLObject set_lex_entry_properties(final SubLObject lex_entry, final SubLObject value)
	{
		return classes.subloop_set_access_protected_instance_slot(lex_entry, value, ONE_INTEGER, $sym53$PROPERTIES);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 11456L)
	public static SubLObject get_lex_entry_supported_properties(final SubLObject lex_entry)
	{
		final SubLObject v_class = (lex_entry.isSymbol() ? classes.classes_retrieve_class(lex_entry) : ((NIL != subloop_structures.class_p(lex_entry)) ? lex_entry : ((NIL != subloop_structures.instance_p(lex_entry)) ? subloop_structures.instance_class(lex_entry) : NIL)));
		if (NIL != v_class)
		{
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc($sym54$SUPPORTED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return Vectors.aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER);
		}
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 11456L)
	public static SubLObject set_lex_entry_supported_properties(final SubLObject lex_entry, final SubLObject value)
	{
		final SubLObject v_class = (lex_entry.isSymbol() ? classes.classes_retrieve_class(lex_entry) : ((NIL != subloop_structures.class_p(lex_entry)) ? lex_entry : ((NIL != subloop_structures.instance_p(lex_entry)) ? subloop_structures.instance_class(lex_entry) : NIL)));
		if (NIL != v_class)
		{
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc($sym54$SUPPORTED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return Vectors.set_aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER, value);
		}
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 11456L)
	public static SubLObject get_lex_entry_computed_properties(final SubLObject lex_entry)
	{
		final SubLObject v_class = (lex_entry.isSymbol() ? classes.classes_retrieve_class(lex_entry) : ((NIL != subloop_structures.class_p(lex_entry)) ? lex_entry : ((NIL != subloop_structures.instance_p(lex_entry)) ? subloop_structures.instance_class(lex_entry) : NIL)));
		if (NIL != v_class)
		{
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc($sym55$COMPUTED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return Vectors.aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
		}
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 11456L)
	public static SubLObject set_lex_entry_computed_properties(final SubLObject lex_entry, final SubLObject value)
	{
		final SubLObject v_class = (lex_entry.isSymbol() ? classes.classes_retrieve_class(lex_entry) : ((NIL != subloop_structures.class_p(lex_entry)) ? lex_entry : ((NIL != subloop_structures.instance_p(lex_entry)) ? subloop_structures.instance_class(lex_entry) : NIL)));
		if (NIL != v_class)
		{
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc($sym55$COMPUTED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return Vectors.set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
		}
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 11456L)
	public static SubLObject get_lex_entry_stored_properties(final SubLObject lex_entry)
	{
		final SubLObject v_class = (lex_entry.isSymbol() ? classes.classes_retrieve_class(lex_entry) : ((NIL != subloop_structures.class_p(lex_entry)) ? lex_entry : ((NIL != subloop_structures.instance_p(lex_entry)) ? subloop_structures.instance_class(lex_entry) : NIL)));
		if (NIL != v_class)
		{
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc($sym56$STORED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return Vectors.aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
		}
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 11456L)
	public static SubLObject set_lex_entry_stored_properties(final SubLObject lex_entry, final SubLObject value)
	{
		final SubLObject v_class = (lex_entry.isSymbol() ? classes.classes_retrieve_class(lex_entry) : ((NIL != subloop_structures.class_p(lex_entry)) ? lex_entry : ((NIL != subloop_structures.instance_p(lex_entry)) ? subloop_structures.instance_class(lex_entry) : NIL)));
		if (NIL != v_class)
		{
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc($sym56$STORED_PROPERTIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return Vectors.set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
		}
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 11456L)
	public static SubLObject subloop_reserved_initialize_lex_entry_class(final SubLObject new_instance)
	{
		classes.subloop_initialize_slot(new_instance, $sym51$OBJECT, $sym57$INSTANCE_COUNT, ZERO_INTEGER);
		classes.subloop_initialize_slot(new_instance, $sym50$LEX_ENTRY, $sym56$STORED_PROPERTIES, $list58);
		classes.subloop_initialize_slot(new_instance, $sym50$LEX_ENTRY, $sym55$COMPUTED_PROPERTIES, $list59);
		classes.subloop_initialize_slot(new_instance, $sym50$LEX_ENTRY, $sym54$SUPPORTED_PROPERTIES, ConsesLow.append(instances.get_slot($sym50$LEX_ENTRY, $sym56$STORED_PROPERTIES), Mapping.mapcar($sym60$CAR, instances.get_slot($sym50$LEX_ENTRY, $sym55$COMPUTED_PROPERTIES))));
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 11456L)
	public static SubLObject subloop_reserved_initialize_lex_entry_instance(final SubLObject new_instance)
	{
		classes.subloop_initialize_slot(new_instance, $sym51$OBJECT, $sym62$ISOLATED_P, NIL);
		classes.subloop_initialize_slot(new_instance, $sym51$OBJECT, $sym63$INSTANCE_NUMBER, NIL);
		classes.subloop_initialize_slot(new_instance, $sym50$LEX_ENTRY, $sym53$PROPERTIES, NIL);
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 11456L)
	public static SubLObject lex_entry_p(final SubLObject lex_entry)
	{
		return classes.subloop_instanceof_class(lex_entry, $sym50$LEX_ENTRY);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 13366L)
	public static SubLObject lex_entry_initialize_method(final SubLObject self)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_lex_entry_method = NIL;
		SubLObject v_properties = get_lex_entry_properties(self);
		try
		{
			thread.throwStack.push($sym68$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
			try
			{
				object.object_initialize_method(self);
				v_properties = NIL;
				Dynamic.sublisp_throw($sym68$OUTER_CATCH_FOR_LEX_ENTRY_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_lex_entry_properties(self, v_properties);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_lex_entry_method = Errors.handleThrowable(ccatch_env_var, $sym68$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_lex_entry_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 13591L)
	public static SubLObject lex_entry_get_method(final SubLObject self, final SubLObject property)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_lex_entry_method = NIL;
		final SubLObject supported_properties = get_lex_entry_supported_properties(self);
		final SubLObject computed_properties = get_lex_entry_computed_properties(self);
		SubLObject v_properties = get_lex_entry_properties(self);
		try
		{
			thread.throwStack.push($sym74$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
			try
			{
				if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == conses_high.member(property, instances.get_slot($sym50$LEX_ENTRY, $sym54$SUPPORTED_PROPERTIES), UNPROVIDED, UNPROVIDED))
				{
					Errors.error($str75$Unsupported_lexical_property__a, property);
				}
				SubLObject value = conses_high.assoc(property, v_properties, UNPROVIDED, UNPROVIDED).rest();
				if (NIL == value)
				{
					final SubLObject property_method = conses_high.assoc(property, instances.get_slot($sym50$LEX_ENTRY, $sym55$COMPUTED_PROPERTIES), UNPROVIDED, UNPROVIDED).rest();
					if (NIL != property_method)
					{
						value = methods.funcall_instance_method_with_0_args(self, property_method);
						if (NIL != value)
						{
							v_properties = ConsesLow.cons(ConsesLow.cons(property, value), v_properties);
						}
					}
				}
				Dynamic.sublisp_throw($sym74$OUTER_CATCH_FOR_LEX_ENTRY_METHOD, value);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_lex_entry_supported_properties(self, supported_properties);
					set_lex_entry_computed_properties(self, computed_properties);
					set_lex_entry_properties(self, v_properties);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_lex_entry_method = Errors.handleThrowable(ccatch_env_var, $sym74$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_lex_entry_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 14369L)
	public static SubLObject lex_entry_denot(final SubLObject entry)
	{
		return methods.funcall_instance_method_with_1_args(entry, $sym70$GET, $kw77$DENOT);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 14445L)
	public static SubLObject lex_entry_semtrans(final SubLObject entry)
	{
		return methods.funcall_instance_method_with_1_args(entry, $sym70$GET, $kw78$SEMTRANS);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 14528L)
	public static SubLObject lex_entry_trie_entry(final SubLObject entry)
	{
		return methods.funcall_instance_method_with_1_args(entry, $sym70$GET, $kw79$TRIE_ENTRY);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 14615L)
	public static SubLObject lex_entry_set_method(final SubLObject self, final SubLObject property, final SubLObject value)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_lex_entry_method = NIL;
		final SubLObject supported_properties = get_lex_entry_supported_properties(self);
		SubLObject v_properties = get_lex_entry_properties(self);
		try
		{
			thread.throwStack.push($sym83$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
			try
			{
				if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == conses_high.member(property, instances.get_slot($sym50$LEX_ENTRY, $sym54$SUPPORTED_PROPERTIES), UNPROVIDED, UNPROVIDED))
				{
					Errors.error($str75$Unsupported_lexical_property__a, property);
				}
				v_properties = Sequences.remove(property, v_properties, EQ, $sym84$FIRST, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				v_properties = ConsesLow.cons(ConsesLow.cons(property, value), v_properties);
				Dynamic.sublisp_throw($sym83$OUTER_CATCH_FOR_LEX_ENTRY_METHOD, value);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_lex_entry_supported_properties(self, supported_properties);
					set_lex_entry_properties(self, v_properties);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_lex_entry_method = Errors.handleThrowable(ccatch_env_var, $sym83$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_lex_entry_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 14959L)
	public static SubLObject lex_entry_copy_method(final SubLObject self)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_lex_entry_method = NIL;
		final SubLObject v_properties = get_lex_entry_properties(self);
		try
		{
			thread.throwStack.push($sym88$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
			try
			{
				final SubLObject new_entry = object.new_class_instance($sym50$LEX_ENTRY);
				SubLObject new_properties = NIL;
				SubLObject cdolist_list_var = v_properties;
				SubLObject keyXval = NIL;
				keyXval = cdolist_list_var.first();
				while (NIL != cdolist_list_var)
				{
					final SubLObject new_key = keyXval.first();
					final SubLObject val = keyXval.rest();
					final SubLObject new_val = val.isList() ? conses_high.copy_list(val) : val;
					new_properties = ConsesLow.cons(ConsesLow.cons(new_key, new_val), new_properties);
					cdolist_list_var = cdolist_list_var.rest();
					keyXval = cdolist_list_var.first();
				}
				instances.set_slot(new_entry, $sym53$PROPERTIES, new_properties);
				Dynamic.sublisp_throw($sym88$OUTER_CATCH_FOR_LEX_ENTRY_METHOD, new_entry);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_lex_entry_properties(self, v_properties);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_lex_entry_method = Errors.handleThrowable(ccatch_env_var, $sym88$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_lex_entry_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 15390L)
	public static SubLObject lex_entry_nounP_method(final SubLObject self, SubLObject mt)
	{
		if (mt == UNPROVIDED)
		{
			mt = $kw94$ANY;
		}
		final SubLObject pos = methods.funcall_instance_method_with_1_args(self, $sym70$GET, $kw95$CYC_POS);
		if (mt == $kw94$ANY) { return genls.genl_in_any_mtP(pos, $const96$Noun); }
		return genls.genlP(pos, $const96$Noun, mt, UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 15739L)
	public static SubLObject lex_entry_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_lex_entry_method = NIL;
		final SubLObject v_properties = get_lex_entry_properties(self);
		try
		{
			thread.throwStack.push($sym101$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
			try
			{
				streams_high.write_string($str102$__LEX_ENTRY_, stream, UNPROVIDED, UNPROVIDED);
				streams_high.terpri(stream);
				SubLObject cdolist_list_var = v_properties;
				SubLObject property = NIL;
				property = cdolist_list_var.first();
				while (NIL != cdolist_list_var)
				{
					print_high.prin1(property.first(), stream);
					streams_high.write_string($str103$____, stream, UNPROVIDED, UNPROVIDED);
					print_high.prin1(property.rest(), stream);
					streams_high.terpri(stream);
					cdolist_list_var = cdolist_list_var.rest();
					property = cdolist_list_var.first();
				}
				streams_high.write_string($str49$_, stream, UNPROVIDED, UNPROVIDED);
				streams_high.terpri(stream);
				Dynamic.sublisp_throw($sym101$OUTER_CATCH_FOR_LEX_ENTRY_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_lex_entry_properties(self, v_properties);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_lex_entry_method = Errors.handleThrowable(ccatch_env_var, $sym101$OUTER_CATCH_FOR_LEX_ENTRY_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_lex_entry_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 16475L)
	public static SubLObject lex_entry_nominal_p_method(final SubLObject self)
	{
		return conses_high.intersection(methods.funcall_instance_method_with_1_args(self, $sym70$GET, $kw111$PENN_TAGS), $nominal_tags$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 16599L)
	public static SubLObject lex_entry_verbal_p_method(final SubLObject self)
	{
		return conses_high.intersection(methods.funcall_instance_method_with_1_args(self, $sym70$GET, $kw111$PENN_TAGS), $verbal_tags$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 16721L)
	public static SubLObject lex_entry_adjectival_p_method(final SubLObject self)
	{
		return conses_high.intersection(methods.funcall_instance_method_with_1_args(self, $sym70$GET, $kw111$PENN_TAGS), $adjectival_tags$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 16851L)
	public static SubLObject lex_entry_adverbial_p_method(final SubLObject self)
	{
		return conses_high.intersection(methods.funcall_instance_method_with_1_args(self, $sym70$GET, $kw111$PENN_TAGS), $adverbial_tags$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 16979L)
	public static SubLObject lex_entry_compute_term_method(final SubLObject self)
	{
		if (NIL == methods.funcall_instance_method_with_0_args(self, $sym109$NOMINAL_P) && NIL == methods.funcall_instance_method_with_0_args(self, $sym113$VERBAL_P))
		{
			Errors.error($str124$Invalid_lexical_property__term_ca, self);
		}
		SubLObject v_term = methods.funcall_instance_method_with_1_args(self, $sym70$GET, $kw77$DENOT);
		if (NIL == v_term)
		{
			final SubLObject semtrans = methods.funcall_instance_method_with_1_args(self, $sym70$GET, $kw78$SEMTRANS);
			if (NIL != semtrans)
			{
				final SubLObject operator = cycl_utilities.formula_operator(semtrans);
				if (operator.eql($const125$equals) || operator.eql($const126$isa) || operator.eql($const127$genls))
				{
					v_term = cycl_utilities.formula_arg2(semtrans, UNPROVIDED);
				}
				else if (NIL != fort_types_interface.logical_connective_p(cycl_utilities.formula_operator(semtrans)) || NIL != fort_types_interface.quantifier_p(cycl_utilities.formula_operator(semtrans)))
				{
					final SubLObject central_keyword = ((NIL != methods.funcall_instance_method_with_0_args(self, $sym109$NOMINAL_P)) ? $kw128$NOUN : ((NIL != methods.funcall_instance_method_with_0_args(self, $sym113$VERBAL_P)) ? $kw129$ACTION : NIL));
					v_term = parse_tree.main_collection(semtrans, central_keyword);
				}
				else
				{
					v_term = cycl_utilities.formula_operator(semtrans);
				}
			}
		}
		return v_term;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 17929L)
	public static SubLObject lex_entry_compute_gender_method(final SubLObject self)
	{
		if (NIL == methods.funcall_instance_method_with_0_args(self, $sym109$NOMINAL_P))
		{
			Errors.error($str133$Invalid_lexical_property__gender_, self);
		}
		SubLObject genders = NIL;
		final SubLObject v_term = methods.funcall_instance_method_with_1_args(self, $sym70$GET, $kw134$TERM);
		if (NIL != at_utilities.more_specific_p(v_term, $const135$MaleAnimal, $const5$EverythingPSC))
		{
			genders = $list136;
		}
		else if (NIL != at_utilities.more_specific_p(v_term, $const137$FemaleAnimal, $const5$EverythingPSC))
		{
			genders = $list138;
		}
		else if (NIL != at_utilities.more_specific_p(v_term, $const139$Person, $const5$EverythingPSC))
		{
			genders = $list140;
		}
		else if (NIL != at_utilities.more_specific_p(v_term, $const141$SentientAnimal, $const5$EverythingPSC))
		{
			genders = $list142;
		}
		if (NIL == genders)
		{
			genders = $list143;
		}
		return genders;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 18753L)
	public static SubLObject lex_entry_compute_penn_tags_method(final SubLObject self)
	{
		final SubLObject pos = lex_entry_get_method(self, $kw95$CYC_POS);
		final SubLObject inflections = lex_entry_get_method(self, $kw147$INFLECTIONS);
		final SubLObject string = lex_entry_get_method(self, $kw34$STRING);
		SubLObject penn_tags = NIL;
		if (pos.eql($const148$Preposition) && string.equalp($str149$to))
		{
			penn_tags = ConsesLow.cons($kw150$TO, penn_tags);
		}
		else
		{
			SubLObject cdolist_list_var = inflections;
			SubLObject inflection = NIL;
			inflection = cdolist_list_var.first();
			while (NIL != cdolist_list_var)
			{
				final SubLObject penn_tag = map_from_cyc_to_penn_pos(pos, inflection);
				if (NIL != penn_tag)
				{
					penn_tags = ConsesLow.cons(penn_tag, penn_tags);
				}
				cdolist_list_var = cdolist_list_var.rest();
				inflection = cdolist_list_var.first();
			}
		}
		return Sequences.remove_duplicates(penn_tags, EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 19309L)
	public static SubLObject lex_entry_compute_backoff_penn_tags_method(final SubLObject self)
	{
		SubLObject cdolist_list_var;
		SubLObject penn_tags = cdolist_list_var = methods.funcall_instance_method_with_1_args(self, $sym70$GET, $kw111$PENN_TAGS);
		SubLObject tag = NIL;
		tag = cdolist_list_var.first();
		while (NIL != cdolist_list_var)
		{
			SubLObject cdolist_list_var_$8 = tag_backoffs(tag);
			SubLObject backoff = NIL;
			backoff = cdolist_list_var_$8.first();
			while (NIL != cdolist_list_var_$8)
			{
				if (!backoff.eql(tag))
				{
					penn_tags = ConsesLow.cons(backoff, penn_tags);
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
	public static SubLObject tag_backoffs(final SubLObject tag)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = NIL;
		SubLObject cdolist_list_var = $penn_tag_backoffs$.getDynamicValue(thread);
		SubLObject tags = NIL;
		tags = cdolist_list_var.first();
		while (NIL != cdolist_list_var)
		{
			if (NIL != subl_promotions.memberP(tag, tags, EQ, UNPROVIDED))
			{
				result = Sequences.cconcatenate(tags, result);
			}
			cdolist_list_var = cdolist_list_var.rest();
			tags = cdolist_list_var.first();
		}
		return Sequences.remove_duplicates(Sequences.remove(tag, result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 20056L)
	public static SubLObject lex_entry_compute_super_tags_method(final SubLObject self)
	{
		SubLObject supertags = NIL;
		SubLObject cdolist_list_var = lex_entry_get_method(self, $kw147$INFLECTIONS);
		SubLObject infl = NIL;
		infl = cdolist_list_var.first();
		while (NIL != cdolist_list_var)
		{
			SubLObject cdolist_list_var_$9 = Hashtables.gethash(ConsesLow.list(lex_entry_get_method(self, $kw95$CYC_POS), lex_entry_get_method(self, $kw158$FRAME), infl), $cyc_to_supertag_map$.getGlobalValue(), UNPROVIDED);
			SubLObject supertag = NIL;
			supertag = cdolist_list_var_$9.first();
			while (NIL != cdolist_list_var_$9)
			{
				final SubLObject item_var = supertag;
				if (NIL == conses_high.member(item_var, supertags, EQUAL, Symbols.symbol_function(IDENTITY)))
				{
					supertags = ConsesLow.cons(item_var, supertags);
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
	public static SubLObject lex_entry_compute_cyc_pos_method(final SubLObject self)
	{
		final SubLObject trie_entry = methods.funcall_instance_method_with_1_args(self, $sym70$GET, $kw79$TRIE_ENTRY);
		if (NIL != trie_entry) { return nl_trie.nl_trie_entry_pos(trie_entry); }
		if (NIL != methods.funcall_instance_method_with_1_args(self, $sym70$GET, $kw147$INFLECTIONS))
		{
			SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(self, $sym70$GET, $kw147$INFLECTIONS);
			SubLObject pred = NIL;
			pred = cdolist_list_var.first();
			while (NIL != cdolist_list_var)
			{
				final SubLObject pos = lexicon_accessors.pos_of_pred(pred);
				if (NIL != pos) { return pos; }
				cdolist_list_var = cdolist_list_var.rest();
				pred = cdolist_list_var.first();
			}
		}
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 20776L)
	public static SubLObject lex_entry_compute_is_ner_entry_method(final SubLObject self)
	{
		final SubLObject trie_entry = methods.funcall_instance_method_with_1_args(self, $sym70$GET, $kw79$TRIE_ENTRY);
		return SubLObjectFactory.makeBoolean(NIL == trie_entry);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 20926L)
	public static SubLObject lex_entry_compute_cyc_category_method(final SubLObject self)
	{
		final SubLObject pred = methods.funcall_instance_method_with_1_args(self, $sym70$GET, $kw168$PREDICATE);
		if (NIL != lexicon_vars.name_string_predP(pred)) { return $const169$NounPhrase; }
		return methods.funcall_instance_method_with_1_args(self, $sym70$GET, $kw95$CYC_POS);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21332L)
	public static SubLObject lex_entry_compute_inflections_method(final SubLObject self)
	{
		final SubLObject trie_entry = methods.funcall_instance_method_with_1_args(self, $sym70$GET, $kw79$TRIE_ENTRY);
		if (NIL != trie_entry) { return nl_trie.nl_trie_entry_pos_preds(trie_entry); }
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject get_abstract_lexicon_stop_words(final SubLObject v_abstract_lexicon)
	{
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, FIFTEEN_INTEGER, $sym176$STOP_WORDS);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject set_abstract_lexicon_stop_words(final SubLObject v_abstract_lexicon, final SubLObject value)
	{
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, FIFTEEN_INTEGER, $sym176$STOP_WORDS);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject get_abstract_lexicon_allow_stemming(final SubLObject v_abstract_lexicon)
	{
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, FOURTEEN_INTEGER, $sym177$ALLOW_STEMMING);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject set_abstract_lexicon_allow_stemming(final SubLObject v_abstract_lexicon, final SubLObject value)
	{
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, FOURTEEN_INTEGER, $sym177$ALLOW_STEMMING);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject get_abstract_lexicon_active_learners(final SubLObject v_abstract_lexicon)
	{
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, THIRTEEN_INTEGER, $sym178$ACTIVE_LEARNERS);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject set_abstract_lexicon_active_learners(final SubLObject v_abstract_lexicon, final SubLObject value)
	{
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, THIRTEEN_INTEGER, $sym178$ACTIVE_LEARNERS);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject get_abstract_lexicon_learned(final SubLObject v_abstract_lexicon)
	{
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, TWELVE_INTEGER, $sym179$LEARNED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject set_abstract_lexicon_learned(final SubLObject v_abstract_lexicon, final SubLObject value)
	{
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, TWELVE_INTEGER, $sym179$LEARNED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject get_abstract_lexicon_allow_fabricationP(final SubLObject v_abstract_lexicon)
	{
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, ELEVEN_INTEGER, $sym180$ALLOW_FABRICATION_);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject set_abstract_lexicon_allow_fabricationP(final SubLObject v_abstract_lexicon, final SubLObject value)
	{
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, ELEVEN_INTEGER, $sym180$ALLOW_FABRICATION_);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject get_abstract_lexicon_case_sensitivity(final SubLObject v_abstract_lexicon)
	{
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, TEN_INTEGER, $sym181$CASE_SENSITIVITY);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject set_abstract_lexicon_case_sensitivity(final SubLObject v_abstract_lexicon, final SubLObject value)
	{
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, TEN_INTEGER, $sym181$CASE_SENSITIVITY);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject get_abstract_lexicon_ignore_cacheP(final SubLObject v_abstract_lexicon)
	{
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, NINE_INTEGER, $sym182$IGNORE_CACHE_);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject set_abstract_lexicon_ignore_cacheP(final SubLObject v_abstract_lexicon, final SubLObject value)
	{
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, NINE_INTEGER, $sym182$IGNORE_CACHE_);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject get_abstract_lexicon_cache(final SubLObject v_abstract_lexicon)
	{
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, EIGHT_INTEGER, $sym183$CACHE);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject set_abstract_lexicon_cache(final SubLObject v_abstract_lexicon, final SubLObject value)
	{
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, EIGHT_INTEGER, $sym183$CACHE);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject get_abstract_lexicon_trie(final SubLObject v_abstract_lexicon)
	{
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, SEVEN_INTEGER, $sym184$TRIE);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject set_abstract_lexicon_trie(final SubLObject v_abstract_lexicon, final SubLObject value)
	{
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, SEVEN_INTEGER, $sym184$TRIE);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject get_abstract_lexicon_excluded_pos_list(final SubLObject v_abstract_lexicon)
	{
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, SIX_INTEGER, $sym185$EXCLUDED_POS_LIST);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject set_abstract_lexicon_excluded_pos_list(final SubLObject v_abstract_lexicon, final SubLObject value)
	{
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, SIX_INTEGER, $sym185$EXCLUDED_POS_LIST);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject get_abstract_lexicon_excluded_preds(final SubLObject v_abstract_lexicon)
	{
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, FIVE_INTEGER, $sym186$EXCLUDED_PREDS);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject set_abstract_lexicon_excluded_preds(final SubLObject v_abstract_lexicon, final SubLObject value)
	{
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, FIVE_INTEGER, $sym186$EXCLUDED_PREDS);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject get_abstract_lexicon_root_mt(final SubLObject v_abstract_lexicon)
	{
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, FOUR_INTEGER, $sym187$ROOT_MT);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject set_abstract_lexicon_root_mt(final SubLObject v_abstract_lexicon, final SubLObject value)
	{
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, FOUR_INTEGER, $sym187$ROOT_MT);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject get_abstract_lexicon_base_mt(final SubLObject v_abstract_lexicon)
	{
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, THREE_INTEGER, $sym188$BASE_MT);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject set_abstract_lexicon_base_mt(final SubLObject v_abstract_lexicon, final SubLObject value)
	{
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, THREE_INTEGER, $sym188$BASE_MT);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject get_abstract_lexicon_excluded_mts(final SubLObject v_abstract_lexicon)
	{
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, TWO_INTEGER, $sym189$EXCLUDED_MTS);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject set_abstract_lexicon_excluded_mts(final SubLObject v_abstract_lexicon, final SubLObject value)
	{
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, TWO_INTEGER, $sym189$EXCLUDED_MTS);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject get_abstract_lexicon_allowed_mts(final SubLObject v_abstract_lexicon)
	{
		return classes.subloop_get_access_protected_instance_slot(v_abstract_lexicon, ONE_INTEGER, $sym190$ALLOWED_MTS);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject set_abstract_lexicon_allowed_mts(final SubLObject v_abstract_lexicon, final SubLObject value)
	{
		return classes.subloop_set_access_protected_instance_slot(v_abstract_lexicon, value, ONE_INTEGER, $sym190$ALLOWED_MTS);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject get_abstract_lexicon_default_kb_spec(final SubLObject v_abstract_lexicon)
	{
		final SubLObject v_class = (v_abstract_lexicon.isSymbol() ? classes.classes_retrieve_class(v_abstract_lexicon) : ((NIL != subloop_structures.class_p(v_abstract_lexicon)) ? v_abstract_lexicon : ((NIL != subloop_structures.instance_p(v_abstract_lexicon)) ? subloop_structures.instance_class(v_abstract_lexicon) : NIL)));
		if (NIL != v_class)
		{
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc($sym191$DEFAULT_KB_SPEC, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return Vectors.aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER);
		}
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject set_abstract_lexicon_default_kb_spec(final SubLObject v_abstract_lexicon, final SubLObject value)
	{
		final SubLObject v_class = (v_abstract_lexicon.isSymbol() ? classes.classes_retrieve_class(v_abstract_lexicon) : ((NIL != subloop_structures.class_p(v_abstract_lexicon)) ? v_abstract_lexicon : ((NIL != subloop_structures.instance_p(v_abstract_lexicon)) ? subloop_structures.instance_class(v_abstract_lexicon) : NIL)));
		if (NIL != v_class)
		{
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc($sym191$DEFAULT_KB_SPEC, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return Vectors.set_aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER, value);
		}
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject get_abstract_lexicon_default_base_mt(final SubLObject v_abstract_lexicon)
	{
		final SubLObject v_class = (v_abstract_lexicon.isSymbol() ? classes.classes_retrieve_class(v_abstract_lexicon) : ((NIL != subloop_structures.class_p(v_abstract_lexicon)) ? v_abstract_lexicon : ((NIL != subloop_structures.instance_p(v_abstract_lexicon)) ? subloop_structures.instance_class(v_abstract_lexicon) : NIL)));
		if (NIL != v_class)
		{
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc($sym192$DEFAULT_BASE_MT, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return Vectors.aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER);
		}
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject set_abstract_lexicon_default_base_mt(final SubLObject v_abstract_lexicon, final SubLObject value)
	{
		final SubLObject v_class = (v_abstract_lexicon.isSymbol() ? classes.classes_retrieve_class(v_abstract_lexicon) : ((NIL != subloop_structures.class_p(v_abstract_lexicon)) ? v_abstract_lexicon : ((NIL != subloop_structures.instance_p(v_abstract_lexicon)) ? subloop_structures.instance_class(v_abstract_lexicon) : NIL)));
		if (NIL != v_class)
		{
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc($sym192$DEFAULT_BASE_MT, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return Vectors.set_aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER, value);
		}
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject get_abstract_lexicon_default_exclude_predicates(final SubLObject v_abstract_lexicon)
	{
		final SubLObject v_class = (v_abstract_lexicon.isSymbol() ? classes.classes_retrieve_class(v_abstract_lexicon) : ((NIL != subloop_structures.class_p(v_abstract_lexicon)) ? v_abstract_lexicon : ((NIL != subloop_structures.instance_p(v_abstract_lexicon)) ? subloop_structures.instance_class(v_abstract_lexicon) : NIL)));
		if (NIL != v_class)
		{
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc($sym193$DEFAULT_EXCLUDE_PREDICATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return Vectors.aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
		}
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject set_abstract_lexicon_default_exclude_predicates(final SubLObject v_abstract_lexicon, final SubLObject value)
	{
		final SubLObject v_class = (v_abstract_lexicon.isSymbol() ? classes.classes_retrieve_class(v_abstract_lexicon) : ((NIL != subloop_structures.class_p(v_abstract_lexicon)) ? v_abstract_lexicon : ((NIL != subloop_structures.instance_p(v_abstract_lexicon)) ? subloop_structures.instance_class(v_abstract_lexicon) : NIL)));
		if (NIL != v_class)
		{
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc($sym193$DEFAULT_EXCLUDE_PREDICATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return Vectors.set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
		}
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject get_abstract_lexicon_default_exclude_mts(final SubLObject v_abstract_lexicon)
	{
		final SubLObject v_class = (v_abstract_lexicon.isSymbol() ? classes.classes_retrieve_class(v_abstract_lexicon) : ((NIL != subloop_structures.class_p(v_abstract_lexicon)) ? v_abstract_lexicon : ((NIL != subloop_structures.instance_p(v_abstract_lexicon)) ? subloop_structures.instance_class(v_abstract_lexicon) : NIL)));
		if (NIL != v_class)
		{
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc($sym194$DEFAULT_EXCLUDE_MTS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return Vectors.aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
		}
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject set_abstract_lexicon_default_exclude_mts(final SubLObject v_abstract_lexicon, final SubLObject value)
	{
		final SubLObject v_class = (v_abstract_lexicon.isSymbol() ? classes.classes_retrieve_class(v_abstract_lexicon) : ((NIL != subloop_structures.class_p(v_abstract_lexicon)) ? v_abstract_lexicon : ((NIL != subloop_structures.instance_p(v_abstract_lexicon)) ? subloop_structures.instance_class(v_abstract_lexicon) : NIL)));
		if (NIL != v_class)
		{
			classes.classes_access_check_class_slot(v_class, slots.slot_assoc($sym194$DEFAULT_EXCLUDE_MTS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
			return Vectors.set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
		}
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject subloop_reserved_initialize_abstract_lexicon_class(final SubLObject new_instance)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		classes.subloop_initialize_slot(new_instance, $sym51$OBJECT, $sym57$INSTANCE_COUNT, ZERO_INTEGER);
		classes.subloop_initialize_slot(new_instance, $sym174$ABSTRACT_LEXICON, $sym194$DEFAULT_EXCLUDE_MTS, $list195);
		classes.subloop_initialize_slot(new_instance, $sym174$ABSTRACT_LEXICON, $sym193$DEFAULT_EXCLUDE_PREDICATES, set.set_element_list(lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(thread)));
		classes.subloop_initialize_slot(new_instance, $sym174$ABSTRACT_LEXICON, $sym192$DEFAULT_BASE_MT, $const196$AllGeneralEnglishValidatedLexical);
		classes.subloop_initialize_slot(new_instance, $sym174$ABSTRACT_LEXICON, $sym191$DEFAULT_KB_SPEC, $const197$AbstractLexiconSpecification);
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject subloop_reserved_initialize_abstract_lexicon_instance(final SubLObject new_instance)
	{
		classes.subloop_initialize_slot(new_instance, $sym51$OBJECT, $sym62$ISOLATED_P, NIL);
		classes.subloop_initialize_slot(new_instance, $sym51$OBJECT, $sym63$INSTANCE_NUMBER, NIL);
		classes.subloop_initialize_slot(new_instance, $sym174$ABSTRACT_LEXICON, $sym190$ALLOWED_MTS, $kw199$UNINITIALIZED);
		classes.subloop_initialize_slot(new_instance, $sym174$ABSTRACT_LEXICON, $sym189$EXCLUDED_MTS, $kw199$UNINITIALIZED);
		classes.subloop_initialize_slot(new_instance, $sym174$ABSTRACT_LEXICON, $sym188$BASE_MT, $kw199$UNINITIALIZED);
		classes.subloop_initialize_slot(new_instance, $sym174$ABSTRACT_LEXICON, $sym187$ROOT_MT, $kw199$UNINITIALIZED);
		classes.subloop_initialize_slot(new_instance, $sym174$ABSTRACT_LEXICON, $sym186$EXCLUDED_PREDS, $kw199$UNINITIALIZED);
		classes.subloop_initialize_slot(new_instance, $sym174$ABSTRACT_LEXICON, $sym185$EXCLUDED_POS_LIST, NIL);
		classes.subloop_initialize_slot(new_instance, $sym174$ABSTRACT_LEXICON, $sym184$TRIE, NIL);
		classes.subloop_initialize_slot(new_instance, $sym174$ABSTRACT_LEXICON, $sym183$CACHE, NIL);
		classes.subloop_initialize_slot(new_instance, $sym174$ABSTRACT_LEXICON, $sym182$IGNORE_CACHE_, NIL);
		classes.subloop_initialize_slot(new_instance, $sym174$ABSTRACT_LEXICON, $sym181$CASE_SENSITIVITY, NIL);
		classes.subloop_initialize_slot(new_instance, $sym174$ABSTRACT_LEXICON, $sym180$ALLOW_FABRICATION_, T);
		classes.subloop_initialize_slot(new_instance, $sym174$ABSTRACT_LEXICON, $sym179$LEARNED, NIL);
		classes.subloop_initialize_slot(new_instance, $sym174$ABSTRACT_LEXICON, $sym178$ACTIVE_LEARNERS, NIL);
		classes.subloop_initialize_slot(new_instance, $sym174$ABSTRACT_LEXICON, $sym177$ALLOW_STEMMING, T);
		classes.subloop_initialize_slot(new_instance, $sym174$ABSTRACT_LEXICON, $sym176$STOP_WORDS, NIL);
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 21539L)
	public static SubLObject abstract_lexicon_p(final SubLObject v_abstract_lexicon)
	{
		return classes.subloop_instanceof_class(v_abstract_lexicon, $sym174$ABSTRACT_LEXICON);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 26390L)
	public static SubLObject abstract_lexicon_initialize_method(final SubLObject self)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject learned = get_abstract_lexicon_learned(self);
		SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		SubLObject v_cache = get_abstract_lexicon_cache(self);
		SubLObject trie = get_abstract_lexicon_trie(self);
		try
		{
			thread.throwStack.push($sym202$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				object.object_initialize_method(self);
				trie = nl_trie.get_nl_trie();
				v_cache = cache.new_cache($int203$2000, EQUAL);
				case_sensitivity = $kw204$ON;
				ensure_cyc_to_penn_map();
				methods.funcall_instance_method_with_0_args(self, $sym205$INITIALIZE_EXCLUDED_PREDS);
				methods.funcall_instance_method_with_0_args(self, $sym206$INITIALIZE_ALLOWED_MTS);
				learned = NIL;
				Dynamic.sublisp_throw($sym202$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_learned(self, learned);
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					set_abstract_lexicon_cache(self, v_cache);
					set_abstract_lexicon_trie(self, trie);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym202$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 27024L)
	public static SubLObject abstract_lexicon_isolate_method(final SubLObject self)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject v_cache = get_abstract_lexicon_cache(self);
		try
		{
			thread.throwStack.push($sym210$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				v_cache = NIL;
				object.object_isolate_method(self);
				Dynamic.sublisp_throw($sym210$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_cache(self, v_cache);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym210$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 27166L)
	public static SubLObject abstract_lexicon_ignore_cache_method(final SubLObject self)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject ignore_cacheP = get_abstract_lexicon_ignore_cacheP(self);
		try
		{
			thread.throwStack.push($sym214$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				ignore_cacheP = T;
				Dynamic.sublisp_throw($sym214$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_ignore_cacheP(self, ignore_cacheP);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym214$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 27271L)
	public static SubLObject abstract_lexicon_ignore_cacheP_method(final SubLObject self)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject ignore_cacheP = get_abstract_lexicon_ignore_cacheP(self);
		try
		{
			thread.throwStack.push($sym217$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				Dynamic.sublisp_throw($sym217$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, instances.get_slot(self, $sym182$IGNORE_CACHE_));
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_ignore_cacheP(self, ignore_cacheP);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym217$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 27380L)
	public static SubLObject abstract_lexicon_allow_stemming_method(final SubLObject self)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject allow_stemming = get_abstract_lexicon_allow_stemming(self);
		try
		{
			thread.throwStack.push($sym220$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				allow_stemming = T;
				Dynamic.sublisp_throw($sym220$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_allow_stemming(self, allow_stemming);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym220$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 27491L)
	public static SubLObject abstract_lexicon_forbid_stemming_method(final SubLObject self)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject allow_stemming = get_abstract_lexicon_allow_stemming(self);
		try
		{
			thread.throwStack.push($sym224$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				allow_stemming = NIL;
				Dynamic.sublisp_throw($sym224$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_allow_stemming(self, allow_stemming);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym224$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 27605L)
	public static SubLObject abstract_lexicon_allow_fabrication_method(final SubLObject self)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject allow_fabricationP = get_abstract_lexicon_allow_fabricationP(self);
		try
		{
			thread.throwStack.push($sym228$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				allow_fabricationP = T;
				Dynamic.sublisp_throw($sym228$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_allow_fabricationP(self, allow_fabricationP);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym228$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 27723L)
	public static SubLObject abstract_lexicon_forbid_fabrication_method(final SubLObject self)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject allow_fabricationP = get_abstract_lexicon_allow_fabricationP(self);
		try
		{
			thread.throwStack.push($sym232$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				allow_fabricationP = NIL;
				Dynamic.sublisp_throw($sym232$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_allow_fabricationP(self, allow_fabricationP);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym232$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 27844L)
	public static SubLObject abstract_lexicon_fabrication_forbiddenP_method(final SubLObject self)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject allow_fabricationP = get_abstract_lexicon_allow_fabricationP(self);
		try
		{
			thread.throwStack.push($sym236$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				Dynamic.sublisp_throw($sym236$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, SubLObjectFactory.makeBoolean(NIL == allow_fabricationP));
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_allow_fabricationP(self, allow_fabricationP);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym236$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 27957L)
	public static SubLObject abstract_lexicon_fabrication_allowedP_method(final SubLObject self)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject allow_fabricationP = get_abstract_lexicon_allow_fabricationP(self);
		try
		{
			thread.throwStack.push($sym240$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				Dynamic.sublisp_throw($sym240$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, allow_fabricationP);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_allow_fabricationP(self, allow_fabricationP);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym240$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 28061L)
	public static SubLObject abstract_lexicon_valid_nl_trie_entryP_method(final SubLObject self, final SubLObject nl_trie_entry)
	{
		if (NIL != methods.funcall_instance_method_with_1_args(self, $sym246$STOP_WORD_P, nl_trie.nl_trie_entry_string(nl_trie_entry))) { return NIL; }
		return SubLObjectFactory.makeBoolean((NIL != lex_entry_p(nl_trie_entry) && NIL != methods.funcall_instance_method_with_1_args(self, $sym247$ALLOWED_POS_, methods.funcall_instance_method_with_1_args(nl_trie_entry, $sym70$GET, $kw95$CYC_POS))) || (NIL != nl_trie.nl_trie_word_p(nl_trie_entry, UNPROVIDED) && NIL != conses_high.member($const248$nameSpelling, nl_trie.nl_trie_word_pos_preds(nl_trie_entry), EQL, UNPROVIDED) && NIL != methods.funcall_instance_method_with_1_args(self, $sym249$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_, nl_trie_entry) && NIL != methods.funcall_instance_method_with_1_args(self, $sym250$ALLOWED_MT_, nl_trie.nl_trie_entry_semantic_mt(nl_trie_entry))) || (NIL != valid_denotsP(nl_trie_entry) && NIL != methods.funcall_instance_method_with_1_args(self, $sym249$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_, nl_trie_entry) && NIL != methods.funcall_instance_method_with_1_args(self, $sym251$NL_TRIE_ENTRY_HAS_ALLOWED_POS_, nl_trie_entry) && NIL != methods.funcall_instance_method_with_1_args(self, $sym250$ALLOWED_MT_, nl_trie.nl_trie_entry_semantic_mt(nl_trie_entry))));
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 29000L)
	public static SubLObject abstract_lexicon_set_case_sensitivity_method(final SubLObject self, final SubLObject keyword)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		try
		{
			thread.throwStack.push($sym256$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				case_sensitivity = keyword;
				Dynamic.sublisp_throw($sym256$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym256$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 29238L)
	public static SubLObject abstract_lexicon_get_case_sensitivity_method(final SubLObject self)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		try
		{
			thread.throwStack.push($sym260$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				Dynamic.sublisp_throw($sym260$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, case_sensitivity);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym260$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 29444L)
	public static SubLObject abstract_lexicon_initialize_excluded_preds_method(final SubLObject self, SubLObject preds_to_exclude)
	{
		if (preds_to_exclude == UNPROVIDED)
		{
			preds_to_exclude = $kw264$DEFAULT;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject default_exclude_predicates = get_abstract_lexicon_default_exclude_predicates(self);
		SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
		try
		{
			thread.throwStack.push($sym265$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				if (preds_to_exclude == $kw264$DEFAULT)
				{
					excluded_preds = default_exclude_predicates;
				}
				else
				{
					excluded_preds = preds_to_exclude;
				}
				Dynamic.sublisp_throw($sym265$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_default_exclude_predicates(self, default_exclude_predicates);
					set_abstract_lexicon_excluded_preds(self, excluded_preds);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym265$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 29929L)
	public static SubLObject abstract_lexicon_allow_predicate_method(final SubLObject self, final SubLObject pos_pred)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
		try
		{
			thread.throwStack.push($sym270$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				excluded_preds = Sequences.remove(pos_pred, excluded_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				Dynamic.sublisp_throw($sym270$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_excluded_preds(self, excluded_preds);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym270$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 30146L)
	public static SubLObject abstract_lexicon_exclude_predicate_method(final SubLObject self, final SubLObject pos_pred)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
		try
		{
			thread.throwStack.push($sym274$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				if (NIL == conses_high.member(pos_pred, excluded_preds, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))
				{
					excluded_preds = ConsesLow.cons(pos_pred, excluded_preds);
				}
				Dynamic.sublisp_throw($sym274$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_excluded_preds(self, excluded_preds);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym274$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 30350L)
	public static SubLObject abstract_lexicon_excluded_predicateP_method(final SubLObject self, final SubLObject pos_pred)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
		try
		{
			thread.throwStack.push($sym278$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				Dynamic.sublisp_throw($sym278$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, conses_high.member(pos_pred, excluded_preds, UNPROVIDED, UNPROVIDED));
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_excluded_preds(self, excluded_preds);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym278$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 30546L)
	public static SubLObject abstract_lexicon_allowed_predicateP_method(final SubLObject self, final SubLObject pos_pred)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
		try
		{
			thread.throwStack.push($sym282$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				Dynamic.sublisp_throw($sym282$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, SubLObjectFactory.makeBoolean(NIL == subl_promotions.memberP(pos_pred, excluded_preds, UNPROVIDED, UNPROVIDED)));
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_excluded_preds(self, excluded_preds);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym282$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 30749L)
	public static SubLObject abstract_lexicon_nl_trie_entry_has_allowed_predicateP_method(final SubLObject self, final SubLObject nl_trie_entry)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
		try
		{
			thread.throwStack.push($sym285$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				Dynamic.sublisp_throw($sym285$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, SubLObjectFactory.makeBoolean(NIL == excluded_preds || NIL == subl_promotions.memberP(nl_trie.nl_trie_entry_semantic_pred(nl_trie_entry, UNPROVIDED), excluded_preds, UNPROVIDED, UNPROVIDED)));
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_excluded_preds(self, excluded_preds);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym285$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 31058L)
	public static SubLObject abstract_lexicon_allow_pos_method(final SubLObject self, final SubLObject pos)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
		try
		{
			thread.throwStack.push($sym290$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				excluded_pos_list = Sequences.remove(pos, excluded_pos_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				Dynamic.sublisp_throw($sym290$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym290$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 31304L)
	public static SubLObject abstract_lexicon_exclude_pos_method(final SubLObject self, final SubLObject pos)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
		try
		{
			thread.throwStack.push($sym294$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				if (NIL == conses_high.member(pos, excluded_pos_list, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))
				{
					excluded_pos_list = ConsesLow.cons(pos, excluded_pos_list);
				}
				Dynamic.sublisp_throw($sym294$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym294$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 31490L)
	public static SubLObject abstract_lexicon_excluded_posP_method(final SubLObject self, final SubLObject pos)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
		try
		{
			thread.throwStack.push($sym298$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				Dynamic.sublisp_throw($sym298$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, lexicon_accessors.genl_pos_memberP(pos, excluded_pos_list));
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym298$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 31683L)
	public static SubLObject abstract_lexicon_allowed_posP_method(final SubLObject self, final SubLObject pos)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
		try
		{
			thread.throwStack.push($sym301$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				Dynamic.sublisp_throw($sym301$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, SubLObjectFactory.makeBoolean(NIL == lexicon_accessors.genl_pos_memberP(pos, excluded_pos_list)));
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym301$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 31882L)
	public static SubLObject abstract_lexicon_nl_trie_entry_has_allowed_posP_method(final SubLObject self, final SubLObject nl_trie_entry)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
		try
		{
			thread.throwStack.push($sym304$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				Dynamic.sublisp_throw($sym304$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, SubLObjectFactory.makeBoolean(NIL == excluded_pos_list || NIL == lexicon_accessors.genl_pos_memberP(nl_trie.nl_trie_entry_pos(nl_trie_entry), excluded_pos_list)));
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym304$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 32192L)
	public static SubLObject abstract_lexicon_add_learner_method(final SubLObject self, final SubLObject learner)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject active_learners = get_abstract_lexicon_active_learners(self);
		try
		{
			thread.throwStack.push($sym309$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				if (NIL == conses_high.member(learner, active_learners, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))
				{
					active_learners = ConsesLow.cons(learner, active_learners);
				}
				Dynamic.sublisp_throw($sym309$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_active_learners(self, active_learners);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym309$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 32370L)
	public static SubLObject abstract_lexicon_remove_learner_method(final SubLObject self, final SubLObject learner)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject active_learners = get_abstract_lexicon_active_learners(self);
		try
		{
			thread.throwStack.push($sym313$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				active_learners = Sequences.remove(learner, active_learners, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				Dynamic.sublisp_throw($sym313$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_active_learners(self, active_learners);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym313$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 32582L)
	public static SubLObject abstract_lexicon_get_learners_method(final SubLObject self)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject active_learners = get_abstract_lexicon_active_learners(self);
		try
		{
			thread.throwStack.push($sym317$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				Dynamic.sublisp_throw($sym317$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, active_learners);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_active_learners(self, active_learners);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym317$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 32672L)
	public static SubLObject abstract_lexicon_set_learners_method(final SubLObject self, final SubLObject learners)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject active_learners = get_abstract_lexicon_active_learners(self);
		try
		{
			thread.throwStack.push($sym322$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				active_learners = learners;
				Dynamic.sublisp_throw($sym322$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_active_learners(self, active_learners);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym322$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 32879L)
	public static SubLObject abstract_lexicon_initialize_allowed_mts_method(final SubLObject self, SubLObject kb_spec)
	{
		if (kb_spec == UNPROVIDED)
		{
			kb_spec = $kw264$DEFAULT;
		}
		final SubLObject default_base_mt = get_abstract_lexicon_default_base_mt(self);
		final SubLObject default_exclude_mts = get_abstract_lexicon_default_exclude_mts(self);
		SubLObject base_mt = get_abstract_lexicon_base_mt(self);
		SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
		SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
		allowed_mts = set.new_set(Symbols.symbol_function(EQUAL), UNPROVIDED);
		set_abstract_lexicon_allowed_mts(self, allowed_mts);
		excluded_mts = set_utilities.construct_set_from_list(default_exclude_mts, Symbols.symbol_function(EQUAL), UNPROVIDED);
		set_abstract_lexicon_excluded_mts(self, excluded_mts);
		if ($kw264$DEFAULT != kb_spec)
		{
			final SubLObject base_mts = ask_utilities.query_variable($sym327$_MT, ConsesLow.listS($const328$defaultBaseLexicalMt, kb_spec, $list329), $const330$InferencePSC, $list331);
			final SubLObject spec_allowed_mts = ask_utilities.query_variable($sym327$_MT, ConsesLow.listS($const332$allowedLexicalMt, kb_spec, $list329), $const330$InferencePSC, $list331);
			final SubLObject spec_disallowed_mts = ask_utilities.query_variable($sym327$_MT, ConsesLow.listS($const333$disallowedLexicalMt, kb_spec, $list329), $const330$InferencePSC, $list331);
			if (NIL != list_utilities.singletonP(base_mts))
			{
				instances.set_slot(self, $sym188$BASE_MT, el_utilities.copy_expression(list_utilities.only_one(base_mts)));
			}
			else if (NIL != list_utilities.empty_list_p(base_mts))
			{
				instances.set_slot(self, $sym188$BASE_MT, el_utilities.copy_expression(instances.get_slot(self, $sym192$DEFAULT_BASE_MT)));
			}
			else
			{
				base_mt = el_utilities.copy_expression(hlmt_czer.canonicalize_hlmt(el_utilities.make_el_formula($const334$MtUnionFn, base_mts, UNPROVIDED)));
				set_abstract_lexicon_base_mt(self, base_mt);
			}
			SubLObject cdolist_list_var = spec_allowed_mts;
			SubLObject mt = NIL;
			mt = cdolist_list_var.first();
			while (NIL != cdolist_list_var)
			{
				methods.funcall_instance_method_with_1_args(self, $sym335$ALLOW_MT, mt);
				cdolist_list_var = cdolist_list_var.rest();
				mt = cdolist_list_var.first();
			}
			cdolist_list_var = spec_disallowed_mts;
			mt = NIL;
			mt = cdolist_list_var.first();
			while (NIL != cdolist_list_var)
			{
				methods.funcall_instance_method_with_1_args(self, $sym336$FORBID_MT, mt);
				cdolist_list_var = cdolist_list_var.rest();
				mt = cdolist_list_var.first();
			}
		}
		return self;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 34263L)
	public static SubLObject abstract_lexicon_set_base_mt_method(final SubLObject self, final SubLObject mt)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject base_mt = get_abstract_lexicon_base_mt(self);
		final SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
		try
		{
			thread.throwStack.push($sym341$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				base_mt = el_utilities.copy_expression(mt);
				final SubLObject set_contents_var = set.do_set_internal(excluded_mts);
				SubLObject basis_object;
				SubLObject state;
				SubLObject excluded_mt;
				for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state))
				{
					excluded_mt = set_contents.do_set_contents_next(basis_object, state);
					if (NIL != set_contents.do_set_contents_element_validP(state, excluded_mt) && NIL != lexicon_accessors.genl_lexicon_mtP(mt, excluded_mt))
					{
						methods.funcall_instance_method_with_1_args(self, $sym335$ALLOW_MT, excluded_mt);
					}
				}
				Dynamic.sublisp_throw($sym341$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_base_mt(self, base_mt);
					set_abstract_lexicon_excluded_mts(self, excluded_mts);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym341$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 34804L)
	public static SubLObject abstract_lexicon_get_base_mt_method(final SubLObject self)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject default_base_mt = get_abstract_lexicon_default_base_mt(self);
		SubLObject base_mt = get_abstract_lexicon_base_mt(self);
		try
		{
			thread.throwStack.push($sym345$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				if (NIL != misc_utilities.initialized_p(base_mt))
				{
					Dynamic.sublisp_throw($sym345$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, base_mt);
				}
				base_mt = default_base_mt;
				Dynamic.sublisp_throw($sym345$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, default_base_mt);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_default_base_mt(self, default_base_mt);
					set_abstract_lexicon_base_mt(self, base_mt);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym345$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 34982L)
	public static SubLObject abstract_lexicon_allow_mt_method(final SubLObject self, final SubLObject mt)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject root_mt = get_abstract_lexicon_root_mt(self);
		final SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
		final SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
		try
		{
			thread.throwStack.push($sym348$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				assert NIL != hlmt.possibly_hlmt_p(mt) : mt;
				set.set_add(mt, allowed_mts);
				set.set_remove(mt, excluded_mts);
				root_mt = $kw199$UNINITIALIZED;
				Dynamic.sublisp_throw($sym348$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_root_mt(self, root_mt);
					set_abstract_lexicon_excluded_mts(self, excluded_mts);
					set_abstract_lexicon_allowed_mts(self, allowed_mts);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym348$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 35265L)
	public static SubLObject abstract_lexicon_allow_genl_mts_method(final SubLObject self, final SubLObject mt)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject root_mt = get_abstract_lexicon_root_mt(self);
		final SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
		final SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
		try
		{
			thread.throwStack.push($sym353$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				assert NIL != hlmt.possibly_hlmt_p(mt) : mt;
				set.set_add(mt, allowed_mts);
				set.set_remove(mt, excluded_mts);
				SubLObject cdolist_list_var = ask_utilities.query_variable($sym354$_GENLMT, ConsesLow.listS($const355$genlMt, mt, $list356), UNPROVIDED, UNPROVIDED);
				SubLObject genl_mt = NIL;
				genl_mt = cdolist_list_var.first();
				while (NIL != cdolist_list_var)
				{
					set.set_add(genl_mt, allowed_mts);
					set.set_remove(genl_mt, excluded_mts);
					cdolist_list_var = cdolist_list_var.rest();
					genl_mt = cdolist_list_var.first();
				}
				root_mt = $kw199$UNINITIALIZED;
				Dynamic.sublisp_throw($sym353$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_root_mt(self, root_mt);
					set_abstract_lexicon_excluded_mts(self, excluded_mts);
					set_abstract_lexicon_allowed_mts(self, allowed_mts);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym353$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 35724L)
	public static SubLObject abstract_lexicon_forbid_mt_method(final SubLObject self, final SubLObject mt)
	{
		SubLObject root_mt = get_abstract_lexicon_root_mt(self);
		final SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
		final SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
		assert NIL != hlmt.possibly_hlmt_p(mt) : mt;
		set.set_add(mt, excluded_mts);
		set.set_remove(mt, allowed_mts);
		root_mt = $kw199$UNINITIALIZED;
		set_abstract_lexicon_root_mt(self, root_mt);
		return self;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 36023L)
	public static SubLObject abstract_lexicon_allowed_mtP_method(final SubLObject self, final SubLObject mt)
	{
		final SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
		final SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
		if (NIL == mt) { return NIL; }
		if (NIL != set.set_memberP(mt, allowed_mts)) { return T; }
		if (NIL != set.set_memberP(mt, excluded_mts)) { return NIL; }
		if (NIL == hlmt.hlmt_p(methods.funcall_instance_method_with_0_args(self, $sym343$GET_BASE_MT)))
		{
			methods.funcall_instance_method_with_1_args(self, $sym336$FORBID_MT, mt);
			return NIL;
		}
		if (NIL != lexicon_accessors.genl_lexicon_mtP(methods.funcall_instance_method_with_0_args(self, $sym343$GET_BASE_MT), mt))
		{
			methods.funcall_instance_method_with_1_args(self, $sym335$ALLOW_MT, mt);
			return T;
		}
		methods.funcall_instance_method_with_1_args(self, $sym336$FORBID_MT, mt);
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 36704L)
	public static SubLObject abstract_lexicon_root_mt_method(final SubLObject self)
	{
		final SubLObject root_mt = get_abstract_lexicon_root_mt(self);
		final SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
		if (NIL == misc_utilities.initialized_p(root_mt))
		{
			final SubLObject this_allowed_mts = instances.get_slot(self, $sym190$ALLOWED_MTS);
			final SubLObject this_base_mt = methods.funcall_instance_method_with_0_args(self, $sym343$GET_BASE_MT);
			final SubLObject mts = ((NIL != hlmt.possibly_hlmt_p(this_base_mt)) ? ConsesLow.cons(this_base_mt, set.set_element_list(this_allowed_mts)) : set.set_element_list(allowed_mts));
			final SubLObject min_mts = genl_mts.min_mts(mts, UNPROVIDED);
			instances.set_slot(self, $sym187$ROOT_MT, hlmt_czer.canonicalize_hlmt(el_utilities.make_el_formula($const334$MtUnionFn, min_mts, UNPROVIDED)));
		}
		return root_mt;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 37315L)
	public static SubLObject abstract_lexicon_add_stop_word_method(final SubLObject self, final SubLObject string)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject stop_words = get_abstract_lexicon_stop_words(self);
		try
		{
			thread.throwStack.push($sym368$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				SubLObject stop_word_set = stop_words;
				if (NIL == set.set_p(stop_word_set))
				{
					stop_word_set = set.new_set(EQUAL, UNPROVIDED);
				}
				set.set_add(string, stop_word_set);
				stop_words = stop_word_set;
				Dynamic.sublisp_throw($sym368$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, stop_words);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_stop_words(self, stop_words);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym368$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 37603L)
	public static SubLObject abstract_lexicon_stop_word_p_method(final SubLObject self, final SubLObject string)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject stop_words = get_abstract_lexicon_stop_words(self);
		try
		{
			thread.throwStack.push($sym371$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				Dynamic.sublisp_throw($sym371$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, SubLObjectFactory.makeBoolean(NIL != stop_words && NIL != list_utilities.sublisp_boolean(set.set_memberP(string, stop_words))));
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_stop_words(self, stop_words);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym371$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 37751L)
	public static SubLObject abstract_lexicon_get_stop_words_method(final SubLObject self)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject stop_words = get_abstract_lexicon_stop_words(self);
		try
		{
			thread.throwStack.push($sym375$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				if (NIL == set.set_p(stop_words))
				{
					stop_words = set.new_set(EQUAL, UNPROVIDED);
				}
				Dynamic.sublisp_throw($sym375$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, stop_words);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_stop_words(self, stop_words);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym375$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 37916L)
	public static SubLObject abstract_lexicon_copy_method(final SubLObject self, SubLObject target)
	{
		if (target == UNPROVIDED)
		{
			target = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject active_learners = get_abstract_lexicon_active_learners(self);
		final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		final SubLObject ignore_cacheP = get_abstract_lexicon_ignore_cacheP(self);
		final SubLObject excluded_pos_list = get_abstract_lexicon_excluded_pos_list(self);
		final SubLObject excluded_preds = get_abstract_lexicon_excluded_preds(self);
		final SubLObject excluded_mts = get_abstract_lexicon_excluded_mts(self);
		final SubLObject allowed_mts = get_abstract_lexicon_allowed_mts(self);
		try
		{
			thread.throwStack.push($sym379$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				if (NIL != target && !assertionsDisabledInClass && NIL == abstract_lexicon_p(target)) { throw new AssertionError(target); }
				if (NIL == target)
				{
					target = methods.funcall_instance_method_with_0_args(self, $sym381$CLONE);
					Errors.warn($str382$Cloned_instance___S, target);
				}
				SubLObject cdolist_list_var = $list383;
				SubLObject slot = NIL;
				slot = cdolist_list_var.first();
				while (NIL != cdolist_list_var)
				{
					final SubLObject value = instances.get_slot(self, slot);
					if (value.isList())
					{
						instances.set_slot(target, slot, conses_high.copy_list(value));
					}
					else
					{
						instances.set_slot(target, slot, value);
					}
					cdolist_list_var = cdolist_list_var.rest();
					slot = cdolist_list_var.first();
				}
				Dynamic.sublisp_throw($sym379$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, target);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_active_learners(self, active_learners);
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					set_abstract_lexicon_ignore_cacheP(self, ignore_cacheP);
					set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
					set_abstract_lexicon_excluded_preds(self, excluded_preds);
					set_abstract_lexicon_excluded_mts(self, excluded_mts);
					set_abstract_lexicon_allowed_mts(self, allowed_mts);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym379$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 38597L)
	public static SubLObject abstract_lexicon_get_method(final SubLObject self, final SubLObject string)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		final SubLObject ignore_cacheP = get_abstract_lexicon_ignore_cacheP(self);
		final SubLObject v_cache = get_abstract_lexicon_cache(self);
		final SubLObject trie = get_abstract_lexicon_trie(self);
		try
		{
			thread.throwStack.push($sym386$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				assert NIL != cycl_string.cycl_string_p(string) : string;
				if (NIL != methods.funcall_instance_method_with_1_args(self, $sym246$STOP_WORD_P, string))
				{
					Dynamic.sublisp_throw($sym386$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, NIL);
				}
				if (NIL == ignore_cacheP)
				{
					thread.resetMultipleValues();
					final SubLObject lex_entries = cache.cache_get(v_cache, string);
					final SubLObject existsP = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (NIL != existsP)
					{
						Dynamic.sublisp_throw($sym386$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, lex_entries);
					}
				}
				SubLObject lex_entries = methods.funcall_instance_method_with_2_args(self, $sym388$CREATE_LEX_ENTRIES, string, NIL);
				final SubLObject nl_trie_entries = nl_trie.nl_trie_search(string, trie, case_sensitivity);
				lex_entries = add_lex_entries_for_trie_entries(nl_trie_entries, string, self, lex_entries);
				if (NIL == lex_entries && case_sensitivity == $kw389$PREFERRED)
				{
					final SubLObject nl_trie_entries_$10 = nl_trie.nl_trie_search(string, trie, $kw390$OFF);
					lex_entries = add_lex_entries_for_trie_entries(nl_trie_entries_$10, string, self, lex_entries);
				}
				if (NIL == ignore_cacheP)
				{
					cache.cache_set(v_cache, string, lex_entries);
				}
				Dynamic.sublisp_throw($sym386$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, lex_entries);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					set_abstract_lexicon_ignore_cacheP(self, ignore_cacheP);
					set_abstract_lexicon_cache(self, v_cache);
					set_abstract_lexicon_trie(self, trie);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym386$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 39591L)
	public static SubLObject add_lex_entries_for_trie_entries(final SubLObject trie_entries, final SubLObject string, final SubLObject lexicon, SubLObject lex_entries)
	{
		SubLObject cdolist_list_var = trie_entries;
		SubLObject nl_trie_entry = NIL;
		nl_trie_entry = cdolist_list_var.first();
		while (NIL != cdolist_list_var)
		{
			if (NIL != methods.funcall_instance_method_with_1_args(lexicon, $sym242$VALID_NL_TRIE_ENTRY_, nl_trie_entry))
			{
				SubLObject cdolist_list_var_$11;
				final SubLObject lex_entries2 = cdolist_list_var_$11 = methods.funcall_instance_method_with_2_args(lexicon, $sym388$CREATE_LEX_ENTRIES, string, nl_trie_entry);
				SubLObject lex_entry = NIL;
				lex_entry = cdolist_list_var_$11.first();
				while (NIL != cdolist_list_var_$11)
				{
					final SubLObject item_var = lex_entry;
					if (NIL == conses_high.member(item_var, lex_entries, $sym392$LEX_ENTRY_EQUAL_P, Symbols.symbol_function(IDENTITY)))
					{
						lex_entries = ConsesLow.cons(item_var, lex_entries);
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
	public static SubLObject lex_entry_equal_p(final SubLObject lex1, final SubLObject lex2)
	{
		SubLObject equalP;
		SubLObject properties2;
		SubLObject keyXvalue1;
		SubLObject properties3;
		for (equalP = T, properties2 = get_lex_entry_properties(lex2), keyXvalue1 = NIL, properties3 = NIL, keyXvalue1 = get_lex_entry_properties(lex1).first(), properties3 = get_lex_entry_properties(lex1).rest(); NIL != keyXvalue1 && NIL != equalP; equalP = SubLObjectFactory.makeBoolean(NIL != equalP && NIL != conses_high.member(keyXvalue1, properties2, EQUAL, UNPROVIDED)), keyXvalue1 = properties3.first(), properties3 = properties3.rest())
		{
		}
		return equalP;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 40452L)
	public static SubLObject abstract_lexicon_delete_method(final SubLObject self, final SubLObject string)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject v_cache = get_abstract_lexicon_cache(self);
		final SubLObject trie = get_abstract_lexicon_trie(self);
		try
		{
			thread.throwStack.push($sym395$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				assert NIL != cycl_string.cycl_string_p(string) : string;
				SubLObject cdolist_list_var;
				final SubLObject trie_entries = cdolist_list_var = nl_trie.nl_trie_search(string, trie, methods.funcall_instance_method_with_0_args(self, $sym258$GET_CASE_SENSITIVITY));
				SubLObject trie_entry = NIL;
				trie_entry = cdolist_list_var.first();
				while (NIL != cdolist_list_var)
				{
					if (NIL != lex_entry_p(trie_entry))
					{
						SubLObject cdolist_list_var_$12 = nl_trie.nl_trie_entry_keys(trie_entry, UNPROVIDED);
						SubLObject trie_key = NIL;
						trie_key = cdolist_list_var_$12.first();
						while (NIL != cdolist_list_var_$12)
						{
							nl_trie.nl_trie_delete_entry(trie, trie_key, trie_entry);
							cdolist_list_var_$12 = cdolist_list_var_$12.rest();
							trie_key = cdolist_list_var_$12.first();
						}
					}
					cdolist_list_var = cdolist_list_var.rest();
					trie_entry = cdolist_list_var.first();
				}
				cache.cache_remove(v_cache, string);
				Dynamic.sublisp_throw($sym395$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_cache(self, v_cache);
					set_abstract_lexicon_trie(self, trie);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym395$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 40979L)
	public static SubLObject abstract_lexicon_delete_entry_from_string_method(final SubLObject self, final SubLObject lex_entry, final SubLObject string)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject v_cache = get_abstract_lexicon_cache(self);
		final SubLObject trie = get_abstract_lexicon_trie(self);
		try
		{
			thread.throwStack.push($sym400$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				assert NIL != Types.stringp(string) : string;
				assert NIL != lex_entry_p(lex_entry) : lex_entry;
				final SubLObject trie_key = nl_trie.nl_trie_string_tokenize(string);
				nl_trie.nl_trie_delete_entry(trie, trie_key, lex_entry);
				final SubLObject cache_entries = Sequences.remove(lex_entry, cache.cache_get(v_cache, string), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				cache.cache_set(v_cache, string, cache_entries);
				Dynamic.sublisp_throw($sym400$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, self);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_cache(self, v_cache);
					set_abstract_lexicon_trie(self, trie);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym400$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 41511L)
	public static SubLObject delete_nl_trie_lex_entries_for_string(final SubLObject string)
	{
		final SubLObject all_entries = nl_trie.nl_trie_search(string, UNPROVIDED, UNPROVIDED);
		SubLObject cdolist_list_var;
		final SubLObject lex_entries = cdolist_list_var = list_utilities.remove_if_not($sym403$NL_TRIE_LEX_ENTRY_P, all_entries, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject entry = NIL;
		entry = cdolist_list_var.first();
		while (NIL != cdolist_list_var)
		{
			SubLObject cdolist_list_var_$13 = nl_trie.nl_trie_entry_keys(entry, UNPROVIDED);
			SubLObject key = NIL;
			key = cdolist_list_var_$13.first();
			while (NIL != cdolist_list_var_$13)
			{
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
	public static SubLObject abstract_lexicon_add_method(final SubLObject self, final SubLObject lex_entry)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject learned = get_abstract_lexicon_learned(self);
		final SubLObject v_cache = get_abstract_lexicon_cache(self);
		final SubLObject trie = get_abstract_lexicon_trie(self);
		try
		{
			thread.throwStack.push($sym407$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				assert NIL != lex_entry_p(lex_entry) : lex_entry;
				final SubLObject string = methods.funcall_instance_method_with_1_args(lex_entry, $sym70$GET, $kw34$STRING);
				SubLObject result = NIL;
				if (NIL == string_utilities.char_position(strie.$strie_null_key$.getGlobalValue(), string, UNPROVIDED))
				{
					learned = ConsesLow.cons(lex_entry, learned);
					result = nl_trie.nl_trie_insert_entry(trie, nl_trie.nl_trie_string_tokenize(string), lex_entry2nl_trie_entry(lex_entry));
					cache.cache_remove(v_cache, string);
					Dynamic.sublisp_throw($sym407$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, result);
				}
				Dynamic.sublisp_throw($sym407$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, NIL);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_learned(self, learned);
					set_abstract_lexicon_cache(self, v_cache);
					set_abstract_lexicon_trie(self, trie);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym407$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 42457L)
	public static SubLObject abstract_lexicon_learnedP_method(final SubLObject self, final SubLObject lex_entry)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject learned = get_abstract_lexicon_learned(self);
		try
		{
			thread.throwStack.push($sym411$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				Dynamic.sublisp_throw($sym411$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, subl_promotions.memberP(lex_entry, learned, UNPROVIDED, UNPROVIDED));
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_learned(self, learned);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym411$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 42627L)
	public static SubLObject abstract_lexicon_forget_method(final SubLObject self)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		SubLObject learned = get_abstract_lexicon_learned(self);
		try
		{
			thread.throwStack.push($sym415$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				final SubLObject deleted = learned;
				SubLObject cdolist_list_var = learned;
				SubLObject lex = NIL;
				lex = cdolist_list_var.first();
				while (NIL != cdolist_list_var)
				{
					methods.funcall_instance_method_with_1_args(self, $sym393$DELETE, methods.funcall_instance_method_with_1_args(lex, $sym70$GET, $kw34$STRING));
					cdolist_list_var = cdolist_list_var.rest();
					lex = cdolist_list_var.first();
				}
				learned = NIL;
				Dynamic.sublisp_throw($sym415$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, deleted);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_learned(self, learned);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym415$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 42899L)
	public static SubLObject valid_prefixes(final SubLObject prefixes, final SubLObject lexicon)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject results = NIL;
		SubLObject cdolist_list_var = prefixes;
		SubLObject prefixXentries = NIL;
		prefixXentries = cdolist_list_var.first();
		while (NIL != cdolist_list_var)
		{
			final SubLObject prefix = prefixXentries.first();
			final SubLObject string = string_utilities.bunge(prefix, UNPROVIDED);
			final SubLObject entries = prefixXentries.rest();
			final SubLObject ignore_cacheP = methods.funcall_instance_method_with_0_args(lexicon, $sym182$IGNORE_CACHE_);
			final SubLObject v_cache = instances.get_slot(lexicon, $sym183$CACHE);
			SubLObject lexes = NIL;
			SubLObject existsP = NIL;
			if (NIL == ignore_cacheP)
			{
				thread.resetMultipleValues();
				final SubLObject lexes_$14 = cache.cache_get(v_cache, string);
				final SubLObject existsP_$15 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				lexes = lexes_$14;
				existsP = existsP_$15;
			}
			if (NIL == existsP)
			{
				SubLObject cdolist_list_var_$16 = entries;
				SubLObject entry = NIL;
				entry = cdolist_list_var_$16.first();
				while (NIL != cdolist_list_var_$16)
				{
					if (NIL != methods.funcall_instance_method_with_1_args(lexicon, $sym242$VALID_NL_TRIE_ENTRY_, entry))
					{
						SubLObject cdolist_list_var_$17 = methods.funcall_instance_method_with_2_args(lexicon, $sym388$CREATE_LEX_ENTRIES, string, entry);
						SubLObject lex = NIL;
						lex = cdolist_list_var_$17.first();
						while (NIL != cdolist_list_var_$17)
						{
							lexes = ConsesLow.cons(lex, lexes);
							cdolist_list_var_$17 = cdolist_list_var_$17.rest();
							lex = cdolist_list_var_$17.first();
						}
					}
					cdolist_list_var_$16 = cdolist_list_var_$16.rest();
					entry = cdolist_list_var_$16.first();
				}
				if (NIL == ignore_cacheP)
				{
					cache.cache_set(v_cache, string, lexes);
				}
			}
			SubLObject cdolist_list_var_$18 = lexes;
			SubLObject lex2 = NIL;
			lex2 = cdolist_list_var_$18.first();
			while (NIL != cdolist_list_var_$18)
			{
				results = ConsesLow.cons(ConsesLow.cons(prefix, lex2), results);
				cdolist_list_var_$18 = cdolist_list_var_$18.rest();
				lex2 = cdolist_list_var_$18.first();
			}
			cdolist_list_var = cdolist_list_var.rest();
			prefixXentries = cdolist_list_var.first();
		}
		return Sequences.nreverse(results);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 43806L)
	public static SubLObject abstract_lexicon_prefixes_method(final SubLObject self, final SubLObject strings)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		final SubLObject trie = get_abstract_lexicon_trie(self);
		try
		{
			thread.throwStack.push($sym420$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				assert NIL != Types.listp(strings) : strings;
				Dynamic.sublisp_throw($sym420$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, valid_prefixes(nl_trie_accessors.nl_trie_prefixes(trie, strings, case_sensitivity), self));
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					set_abstract_lexicon_trie(self, trie);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym420$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 44178L)
	public static SubLObject abstract_lexicon_prefixes_from_string_method(final SubLObject self, final SubLObject string)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		final SubLObject trie = get_abstract_lexicon_trie(self);
		try
		{
			thread.throwStack.push($sym425$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				assert NIL != Types.stringp(string) : string;
				final SubLObject prefix_keys = nl_trie_accessors.nl_trie_prefix_keys_from_string(trie, string, case_sensitivity);
				final SubLObject nl_trie_entry = conses_high.second(prefix_keys.first());
				final SubLObject prefix_string = nl_trie.nl_trie_entry_string(nl_trie_entry);
				Dynamic.sublisp_throw($sym425$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, ConsesLow.list(valid_prefixes(prefix_keys, self), prefix_string));
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					set_abstract_lexicon_trie(self, trie);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym425$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 44738L)
	public static SubLObject valid_prefix_keys(final SubLObject prefixes, final SubLObject lexicon, final SubLObject case_sensitivity)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject strings = NIL;
		SubLObject cdolist_list_var = prefixes;
		SubLObject prefixXentries = NIL;
		prefixXentries = cdolist_list_var.first();
		while (NIL != cdolist_list_var)
		{
			final SubLObject prefix = prefixXentries.first();
			final SubLObject string = string_utilities.bunge(prefix, UNPROVIDED);
			final SubLObject equality = lexicon_equality_from_case_sensitivity(case_sensitivity);
			final SubLObject entries = prefixXentries.rest();
			final SubLObject v_cache = instances.get_slot(lexicon, $sym183$CACHE);
			SubLObject lexes = NIL;
			SubLObject existsP = NIL;
			if (NIL == methods.funcall_instance_method_with_0_args(lexicon, $sym182$IGNORE_CACHE_))
			{
				thread.resetMultipleValues();
				final SubLObject lexes_$19 = cache.cache_get(v_cache, string);
				final SubLObject existsP_$20 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				lexes = lexes_$19;
				existsP = existsP_$20;
			}
			if (NIL != existsP)
			{
				final SubLObject item_var = prefix;
				if (NIL == conses_high.member(item_var, strings, equality, Symbols.symbol_function(IDENTITY)))
				{
					strings = ConsesLow.cons(item_var, strings);
				}
			}
			else
			{
				SubLObject cdolist_list_var_$21 = entries;
				SubLObject entry = NIL;
				entry = cdolist_list_var_$21.first();
				while (NIL != cdolist_list_var_$21)
				{
					if (NIL != methods.funcall_instance_method_with_1_args(lexicon, $sym242$VALID_NL_TRIE_ENTRY_, entry))
					{
						final SubLObject item_var2 = prefix;
						if (NIL == conses_high.member(item_var2, strings, equality, Symbols.symbol_function(IDENTITY)))
						{
							strings = ConsesLow.cons(item_var2, strings);
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
	public static SubLObject lexicon_equality_from_case_sensitivity(final SubLObject case_sensitivity)
	{
		if (case_sensitivity.isFunction()) { return case_sensitivity; }
		if (case_sensitivity.isKeyword())
		{
			if (case_sensitivity.eql($kw204$ON)) { return Symbols.symbol_function(EQUAL); }
			if (case_sensitivity.eql($kw390$OFF)) { return Symbols.symbol_function(EQUALP); }
			if (case_sensitivity.eql($kw427$FALLBACK)) { return Symbols.symbol_function(EQUALP); }
		}
		else
		{
			Errors.error($str428$Don_t_recognize_lexicon_case_sens, case_sensitivity);
		}
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 45961L)
	public static SubLObject abstract_lexicon_prefix_keys_method(final SubLObject self, final SubLObject strings)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		final SubLObject trie = get_abstract_lexicon_trie(self);
		try
		{
			thread.throwStack.push($sym431$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				assert NIL != Types.listp(strings) : strings;
				Dynamic.sublisp_throw($sym431$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, valid_prefix_keys(nl_trie_accessors.nl_trie_prefixes(trie, strings, case_sensitivity), self, case_sensitivity));
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					set_abstract_lexicon_trie(self, trie);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym431$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 46278L)
	public static SubLObject abstract_lexicon_prefix_keys_from_string_method(final SubLObject self, final SubLObject string)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		final SubLObject trie = get_abstract_lexicon_trie(self);
		try
		{
			thread.throwStack.push($sym435$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				assert NIL != Types.stringp(string) : string;
				final SubLObject my_prefix_keys = nl_trie_accessors.nl_trie_prefix_keys_from_string(trie, string, case_sensitivity);
				final SubLObject nl_trie_entry = conses_high.second(my_prefix_keys.first());
				final SubLObject prefix_string = nl_trie.nl_trie_entry_string(nl_trie_entry);
				Dynamic.sublisp_throw($sym435$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, ConsesLow.list(valid_prefix_keys(my_prefix_keys, self, case_sensitivity), prefix_string));
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					set_abstract_lexicon_trie(self, trie);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym435$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 46792L)
	public static SubLObject abstract_lexicon_learn_method(final SubLObject self, final SubLObject text, SubLObject learners)
	{
		if (learners == UNPROVIDED)
		{
			learners = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject active_learners = get_abstract_lexicon_active_learners(self);
		try
		{
			thread.throwStack.push($sym440$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				assert NIL != Types.stringp(text) : text;
				if (NIL == learners)
				{
					learners = active_learners;
				}
				SubLObject learned_here = NIL;
				SubLObject cdolist_list_var = learners;
				SubLObject learner = NIL;
				learner = cdolist_list_var.first();
				while (NIL != cdolist_list_var)
				{
					SubLObject cdolist_list_var_$22 = methods.funcall_instance_method_with_1_args(self, learner, text);
					SubLObject lex = NIL;
					lex = cdolist_list_var_$22.first();
					while (NIL != cdolist_list_var_$22)
					{
						learned_here = ConsesLow.cons(lex, learned_here);
						cdolist_list_var_$22 = cdolist_list_var_$22.rest();
						lex = cdolist_list_var_$22.first();
					}
					cdolist_list_var = cdolist_list_var.rest();
					learner = cdolist_list_var.first();
				}
				Dynamic.sublisp_throw($sym440$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, learned_here);
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_active_learners(self, active_learners);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym440$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 47504L)
	public static SubLObject abstract_lexicon_number_learn_method(final SubLObject self, final SubLObject text)
	{
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 47605L)
	public static SubLObject number_meanings(final SubLObject text)
	{
		SubLObject result = NIL;
		SubLObject cdolist_list_var;
		final SubLObject number_strings = cdolist_list_var = text_numbers(text);
		SubLObject number_string = NIL;
		number_string = cdolist_list_var.first();
		while (NIL != cdolist_list_var)
		{
			final SubLObject number_meaning = numeral_parser.string_to_interval(number_string);
			if (NIL != number_meaning)
			{
				result = ConsesLow.cons(ConsesLow.list(number_string, number_meaning), result);
			}
			cdolist_list_var = cdolist_list_var.rest();
			number_string = cdolist_list_var.first();
		}
		return result;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 48071L)
	public static SubLObject text_numbers(final SubLObject text)
	{
		final SubLObject sentence = document.new_sentence(text, UNPROVIDED);
		SubLObject result = NIL;
		pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), sentence);
		SubLObject current_word_indices = NIL;
		SubLObject word_index = ZERO_INTEGER;
		SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
		SubLObject word = NIL;
		word = cdolist_list_var.first();
		while (NIL != cdolist_list_var)
		{
			if (document.word_category(word) == $kw446$CD && NIL != string_utilities.partially_numeric_stringP(document.word_string(word)) && word_index.numG(ZERO_INTEGER) && NIL != list_utilities.lengthG(current_word_indices, ZERO_INTEGER, UNPROVIDED) && !document.word_string(document.sentence_get(sentence, Numbers.subtract(word_index, ONE_INTEGER))).equal($str447$_))
			{
				result = ConsesLow.cons(document.sentence_reconstruct_substring(conses_high.last(current_word_indices, UNPROVIDED).first(), number_utilities.f_1X(current_word_indices.first()), sentence), result);
				current_word_indices = ConsesLow.list(word_index);
			}
			else if (document.word_category(word) == $kw446$CD)
			{
				current_word_indices = ConsesLow.cons(word_index, current_word_indices);
			}
			else if (NIL != current_word_indices)
			{
				result = ConsesLow.cons(document.sentence_reconstruct_substring(conses_high.last(current_word_indices, UNPROVIDED).first(), number_utilities.f_1X(current_word_indices.first()), sentence), result);
				current_word_indices = NIL;
			}
			word_index = Numbers.add(word_index, ONE_INTEGER);
			cdolist_list_var = cdolist_list_var.rest();
			word = cdolist_list_var.first();
		}
		if (NIL != current_word_indices)
		{
			result = ConsesLow.cons(document.sentence_reconstruct_substring(conses_high.last(current_word_indices, UNPROVIDED).first(), number_utilities.f_1X(current_word_indices.first()), sentence), result);
		}
		return Sequences.nreverse(result);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 49374L)
	public static SubLObject scalar_interval_meanings(final SubLObject text)
	{
		SubLObject result = NIL;
		SubLObject cdolist_list_var;
		final SubLObject scalar_strings = cdolist_list_var = text_scalar_intervals(text);
		SubLObject scalar_string_set = NIL;
		scalar_string_set = cdolist_list_var.first();
		while (NIL != cdolist_list_var)
		{
			SubLObject doneP = NIL;
			if (NIL == doneP)
			{
				SubLObject csome_list_var = scalar_string_set;
				SubLObject scalar_string = NIL;
				scalar_string = csome_list_var.first();
				while (NIL == doneP && NIL != csome_list_var)
				{
					SubLObject cdolist_list_var_$23 = parsing_utilities.parse_dates_and_numbers(scalar_string, ConsesLow.list($const448$ScalarInterval), NIL, UNPROVIDED, UNPROVIDED);
					SubLObject scalar_meaning = NIL;
					scalar_meaning = cdolist_list_var_$23.first();
					while (NIL != cdolist_list_var_$23)
					{
						result = ConsesLow.cons(ConsesLow.list(scalar_string, scalar_meaning), result);
						doneP = T;
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
	public static SubLObject text_scalar_intervals(final SubLObject text)
	{
		final SubLObject sentence = document.new_sentence(text, $sym449$RKF_STANDARD_STRING_WORDIFY);
		SubLObject result = NIL;
		pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), sentence);
		final SubLObject word_vector = document.sentence_yield(sentence);
		SubLObject current_word_index = ZERO_INTEGER;
		SubLObject current_words = NIL;
		while (current_word_index.numL(Sequences.length(word_vector)))
		{
			final SubLObject current_word = Vectors.aref(word_vector, current_word_index);
			SubLObject scalar_word_count = NIL;
			if (document.word_string(current_word).equal($str447$_) || document.word_category(current_word) == $kw446$CD || (NIL != string_utilities.starts_with(document.word_string(current_word), $str450$_) && NIL != number_utilities.number_string_p(document.word_string(current_word))))
			{
				current_words = ConsesLow.cons(current_word, current_words);
				current_word_index = Numbers.add(current_word_index, ONE_INTEGER);
			}
			else if (NIL != scalar_prefix(word_vector, current_word_index))
			{
				SubLObject n;
				for (scalar_word_count = scalar_prefix(word_vector, current_word_index), n = NIL, n = ZERO_INTEGER; n.numL(scalar_word_count); n = Numbers.add(n, ONE_INTEGER))
				{
					current_words = ConsesLow.cons(Vectors.aref(word_vector, current_word_index), current_words);
					current_word_index = Numbers.add(current_word_index, ONE_INTEGER);
				}
			}
			else if (NIL != current_words)
			{
				result = ConsesLow.cons(prefix_strings_from_words(Sequences.nreverse(current_words)), result);
				current_words = NIL;
				current_word_index = Numbers.add(current_word_index, ONE_INTEGER);
			}
			else
			{
				current_word_index = Numbers.add(current_word_index, ONE_INTEGER);
			}
		}
		if (NIL != current_words)
		{
			result = ConsesLow.cons(prefix_strings_from_words(Sequences.nreverse(current_words)), result);
		}
		return Sequences.nreverse(result);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 51408L)
	public static SubLObject scalar_prefix(final SubLObject word_vector, final SubLObject start_index)
	{
		final SubLObject words = vector_utilities.vector_elements(word_vector, start_index);
		final SubLObject strings = Mapping.mapcar($sym451$WORD_STRING, words);
		SubLObject cdolist_list_var;
		final SubLObject prefix_records = cdolist_list_var = nl_trie_accessors.nl_trie_prefixes(nl_trie.get_nl_trie(), strings, UNPROVIDED);
		SubLObject record = NIL;
		record = cdolist_list_var.first();
		while (NIL != cdolist_list_var)
		{
			SubLObject cdolist_list_var_$24 = nl_trie.nl_trie_record_entries(record);
			SubLObject trie_entry = NIL;
			trie_entry = cdolist_list_var_$24.first();
			while (NIL != cdolist_list_var_$24)
			{
				if (NIL != Sequences.find_if($sym452$SCALAR_FUNCTION_, nl_trie.nl_trie_entry_denots(trie_entry), UNPROVIDED, UNPROVIDED, UNPROVIDED)) { return Sequences.length(nl_trie.nl_trie_record_key(record)); }
				cdolist_list_var_$24 = cdolist_list_var_$24.rest();
				trie_entry = cdolist_list_var_$24.first();
			}
			cdolist_list_var = cdolist_list_var.rest();
			record = cdolist_list_var.first();
		}
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 51984L)
	public static SubLObject prefix_strings_from_words(final SubLObject word_list)
	{
		SubLObject prefix_strings = NIL;
		SubLObject cdotimes_end_var;
		SubLObject n;
		for (cdotimes_end_var = Sequences.length(word_list), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = Numbers.add(n, ONE_INTEGER))
		{
			prefix_strings = ConsesLow.cons(combine_words_into_string(Sequences.subseq(word_list, ZERO_INTEGER, number_utilities.f_1X(n))), prefix_strings);
		}
		return prefix_strings;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 52274L)
	public static SubLObject combine_words_into_string(final SubLObject words)
	{
		SubLObject combined_word_string = document.word_string(words.first());
		SubLObject end_of_last_word = Numbers.add(document.word_offset(words.first()), document.word_length(words.first()));
		SubLObject cdolist_list_var = words.rest();
		SubLObject word = NIL;
		word = cdolist_list_var.first();
		while (NIL != cdolist_list_var)
		{
			combined_word_string = Sequences.cconcatenate(combined_word_string, new SubLObject[] { spaces(Numbers.subtract(document.word_offset(word), end_of_last_word)), document.word_string(word) });
			end_of_last_word = Numbers.add(document.word_offset(word), document.word_length(word));
			cdolist_list_var = cdolist_list_var.rest();
			word = cdolist_list_var.first();
		}
		return combined_word_string;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 52770L)
	public static SubLObject spaces(final SubLObject n)
	{
		return Strings.make_string(n, Characters.CHAR_space);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 52832L)
	public static SubLObject clear_scalar_functionP()
	{
		final SubLObject cs = $scalar_functionP_caching_state$.getGlobalValue();
		if (NIL != cs)
		{
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 52832L)
	public static SubLObject remove_scalar_functionP(final SubLObject v_term, SubLObject mt)
	{
		if (mt == UNPROVIDED)
		{
			mt = $const330$InferencePSC;
		}
		return memoization_state.caching_state_remove_function_results_with_args($scalar_functionP_caching_state$.getGlobalValue(), ConsesLow.list(v_term, mt), UNPROVIDED, UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 52832L)
	public static SubLObject scalar_functionP_internal(final SubLObject v_term, final SubLObject mt)
	{
		return SubLObjectFactory.makeBoolean(NIL != fort_types_interface.functionP(v_term) && NIL != isa.result_isa_colP(v_term, $const448$ScalarInterval, mt));
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 52832L)
	public static SubLObject scalar_functionP(final SubLObject v_term, SubLObject mt)
	{
		if (mt == UNPROVIDED)
		{
			mt = $const330$InferencePSC;
		}
		SubLObject caching_state = $scalar_functionP_caching_state$.getGlobalValue();
		if (NIL == caching_state)
		{
			caching_state = memoization_state.create_global_caching_state_for_name($sym452$SCALAR_FUNCTION_, $sym453$_SCALAR_FUNCTION__CACHING_STATE_, $int454$512, EQUAL, TWO_INTEGER, ZERO_INTEGER);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue()))
		{
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var)
			{
				SubLObject cached_args = collision.first();
				final SubLObject results2 = conses_high.second(collision);
				if (v_term.equal(cached_args.first()))
				{
					cached_args = cached_args.rest();
					if (NIL != cached_args && NIL == cached_args.rest() && mt.equal(cached_args.first())) { return memoization_state.caching_results(results2); }
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(scalar_functionP_internal(v_term, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, ConsesLow.list(v_term, mt));
		return memoization_state.caching_results(results3);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 53021L)
	public static SubLObject abstract_lexicon_noun_compound_learn_method(final SubLObject self, final SubLObject text)
	{
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 53457L)
	public static SubLObject tree_nps(final SubLObject tree, SubLObject allow_trivial_npsP)
	{
		if (allow_trivial_npsP == UNPROVIDED)
		{
			allow_trivial_npsP = NIL;
		}
		SubLObject result = NIL;
		if (NIL != np_treeP(tree, allow_trivial_npsP))
		{
			result = ConsesLow.cons(tree, result);
		}
		else if (tree.isList())
		{
			SubLObject cdolist_list_var = tree.rest();
			SubLObject node = NIL;
			node = cdolist_list_var.first();
			while (NIL != cdolist_list_var)
			{
				result = ConsesLow.append(tree_nps(node, allow_trivial_npsP), result);
				cdolist_list_var = cdolist_list_var.rest();
				node = cdolist_list_var.first();
			}
		}
		return result;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 53782L)
	public static SubLObject np_treeP(final SubLObject tree, SubLObject allow_trivial_npsP)
	{
		if (allow_trivial_npsP == UNPROVIDED)
		{
			allow_trivial_npsP = NIL;
		}
		return SubLObjectFactory.makeBoolean(tree.isList() && tree.first() == $kw458$NP && (NIL != allow_trivial_npsP || Sequences.length(tree).numG(TWO_INTEGER)));
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 53966L)
	public static SubLObject compounds_from_tree(final SubLObject np_tree)
	{
		SubLObject compound_strings = NIL;
		SubLObject current_string = NIL;
		SubLObject cdolist_list_var = np_tree;
		SubLObject node = NIL;
		node = cdolist_list_var.first();
		while (NIL != cdolist_list_var)
		{
			if (node.isList() && conses_high.second(node).isString() && (NIL != subl_promotions.memberP(node.first(), $adjectival_tags$.getGlobalValue(), UNPROVIDED, UNPROVIDED) || NIL != subl_promotions.memberP(node.first(), $nominal_tags$.getGlobalValue(), UNPROVIDED, UNPROVIDED)))
			{
				current_string = ConsesLow.cons(conses_high.second(node), current_string);
			}
			else if (node.isList() && NIL != list_utilities.lengthE(node, TWO_INTEGER, UNPROVIDED) && conses_high.second(node).isString())
			{
				if (NIL != list_utilities.lengthG(current_string, ONE_INTEGER, UNPROVIDED))
				{
					compound_strings = ConsesLow.cons(string_utilities.bunge(Sequences.nreverse(current_string), UNPROVIDED), compound_strings);
				}
				current_string = NIL;
			}
			else if (node.isList())
			{
				compound_strings = Sequences.cconcatenate(compound_strings, compounds_from_tree(node));
			}
			cdolist_list_var = cdolist_list_var.rest();
			node = cdolist_list_var.first();
		}
		if (NIL != current_string && NIL != list_utilities.lengthG(current_string, ONE_INTEGER, UNPROVIDED))
		{
			compound_strings = ConsesLow.cons(string_utilities.bunge(Sequences.nreverse(current_string), UNPROVIDED), compound_strings);
			current_string = NIL;
		}
		return compound_strings;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 54976L)
	public static SubLObject text_noun_compounds(final SubLObject str)
	{
		final SubLObject parse = parser.stanford_parse(str, UNPROVIDED, UNPROVIDED);
		final SubLObject tree_nps = tree_nps(parse, UNPROVIDED);
		final SubLObject compounds = Mapping.mapcan($sym459$COMPOUNDS_FROM_TREE, tree_nps, EMPTY_SUBL_OBJECT_ARRAY);
		return compounds;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 55158L)
	public static SubLObject noun_compound_meanings(final SubLObject str)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject res = NIL;
		SubLObject cdolist_list_var;
		final SubLObject ncs = cdolist_list_var = text_noun_compounds(str);
		SubLObject nc = NIL;
		nc = cdolist_list_var.first();
		while (NIL != cdolist_list_var)
		{
			final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
			final SubLObject _prev_bind_2 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
			try
			{
				parsing_vars.$psp_return_mode$.bind($kw460$BEST_ONLY, thread);
				parsing_vars.$npp_use_nl_tagsP$.bind(T, thread);
				final SubLObject parses = psp_main.ps_get_cycls_for_phrase(nc, $list461, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				res = ConsesLow.cons(ConsesLow.cons(nc, Mapping.mapcar($sym462$EXTRACT_PARSE_POS_PRED, parses)), res);
			} finally
			{
				parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_2, thread);
				parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
			}
			cdolist_list_var = cdolist_list_var.rest();
			nc = cdolist_list_var.first();
		}
		return res;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 55645L)
	public static SubLObject noun_compound_meanings_of_string(final SubLObject str)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject parses = NIL;
		final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
		final SubLObject _prev_bind_2 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
		try
		{
			parsing_vars.$psp_return_mode$.bind($kw460$BEST_ONLY, thread);
			parsing_vars.$npp_use_nl_tagsP$.bind(T, thread);
			parses = psp_main.ps_get_cycls_for_phrase(str, $list461, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		} finally
		{
			parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_2, thread);
			parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
		}
		if (NIL != parses) { return ConsesLow.cons(str, Mapping.mapcar($sym462$EXTRACT_PARSE_POS_PRED, parses)); }
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 56104L)
	public static SubLObject extract_parse_pos_pred(final SubLObject parse)
	{
		final SubLObject pos_pred = pos_pred_from_nc_parse(parse);
		return ConsesLow.list(parsing_utilities.strip_nl_tags(parse, UNPROVIDED), pos_pred);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 56254L)
	public static SubLObject pos_pred_from_nc_parse(final SubLObject parse)
	{
		if (NIL != formula_pattern_match.formula_matches_pattern(parse, $list463)) { return $const464$plural_Generic; }
		if (NIL != formula_pattern_match.formula_matches_pattern(parse, $list465)) { return $const466$singular_Generic; }
		if (NIL != formula_pattern_match.formula_matches_pattern(parse, $list467)) { return $const468$massNumber_Generic; }
		return $const469$nounStrings;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 56664L)
	public static SubLObject abstract_lexicon_cooccurrence_statistics_learn_method(final SubLObject self, final SubLObject text)
	{
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 57115L)
	public static SubLObject abstract_lexicon_lexify_document_method(final SubLObject self, final SubLObject doc)
	{
		assert NIL != document.document_p(doc) : doc;
		final SubLObject lexified = document.make_document(UNPROVIDED);
		SubLObject paragraphs = NIL;
		final SubLObject vector_var = document.document_paragraphs(doc);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject element_num;
		SubLObject paragraph;
		for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER))
		{
			element_num = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
			paragraph = Vectors.aref(vector_var, element_num);
			paragraphs = ConsesLow.cons(methods.funcall_instance_method_with_1_args(self, $sym476$LEXIFY_PARAGRAPH, paragraph), paragraphs);
		}
		document._csetf_document_paragraphs(lexified, Functions.apply(Symbols.symbol_function($sym477$VECTOR), Sequences.nreverse(paragraphs)));
		return lexified;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 57681L)
	public static SubLObject abstract_lexicon_lexify_document_exhaustively_method(final SubLObject self, final SubLObject doc)
	{
		assert NIL != document.document_p(doc) : doc;
		final SubLObject lexified = document.make_document(UNPROVIDED);
		SubLObject paragraphs = NIL;
		final SubLObject vector_var = document.document_paragraphs(doc);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject element_num;
		SubLObject paragraph;
		for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER))
		{
			element_num = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
			paragraph = Vectors.aref(vector_var, element_num);
			paragraphs = ConsesLow.cons(methods.funcall_instance_method_with_1_args(self, $sym481$LEXIFY_PARAGRAPH_EXHAUSTIVELY, paragraph), paragraphs);
		}
		document._csetf_document_paragraphs(lexified, Functions.apply(Symbols.symbol_function($sym477$VECTOR), Sequences.nreverse(paragraphs)));
		return lexified;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 58347L)
	public static SubLObject abstract_lexicon_lexify_paragraph_method(final SubLObject self, final SubLObject par)
	{
		assert NIL != document.paragraph_p(par) : par;
		final SubLObject lexified = document.make_paragraph(UNPROVIDED);
		SubLObject sentences = NIL;
		final SubLObject vector_var = document.paragraph_sentences(par);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject element_num;
		SubLObject sentence;
		for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER))
		{
			element_num = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
			sentence = Vectors.aref(vector_var, element_num);
			sentences = ConsesLow.cons(methods.funcall_instance_method_with_1_args(self, $sym486$LEXIFY_SENTENCE, sentence), sentences);
		}
		document._csetf_paragraph_sentences(lexified, Functions.apply(Symbols.symbol_function($sym477$VECTOR), Sequences.nreverse(sentences)));
		return lexified;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 58911L)
	public static SubLObject abstract_lexicon_lexify_paragraph_exhaustively_method(final SubLObject self, final SubLObject par)
	{
		assert NIL != document.paragraph_p(par) : par;
		final SubLObject lexified = document.make_paragraph(UNPROVIDED);
		SubLObject sentences = NIL;
		final SubLObject vector_var = document.paragraph_sentences(par);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject element_num;
		SubLObject sentence;
		for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER))
		{
			element_num = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
			sentence = Vectors.aref(vector_var, element_num);
			sentences = ConsesLow.cons(methods.funcall_instance_method_with_1_args(self, $sym489$LEXIFY_SENTENCE_EXHAUSTIVELY, sentence), sentences);
		}
		document._csetf_paragraph_sentences(lexified, Functions.apply(Symbols.symbol_function($sym477$VECTOR), Sequences.nreverse(sentences)));
		return lexified;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 59576L)
	public static SubLObject abstract_lexicon_lexify_sentence_method(final SubLObject self, final SubLObject sentence)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		final SubLObject trie = get_abstract_lexicon_trie(self);
		try
		{
			thread.throwStack.push($sym493$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				assert NIL != document.sentence_p(sentence) : sentence;
				if (document.sentence_length(sentence).isZero())
				{
					Dynamic.sublisp_throw($sym493$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, sentence);
				}
				final SubLObject lexified = document.new_sentence(UNPROVIDED, UNPROVIDED);
				final SubLObject word_vec = document.sentence_yield(sentence);
				final SubLObject first_word = document.word_string(Vectors.aref(word_vec, ZERO_INTEGER));
				SubLObject record_length = ZERO_INTEGER;
				SubLObject lexified_tokens = NIL;
				SubLObject words = NIL;
				final SubLObject tokenizing_stream = streams_high.make_private_string_output_stream();
				pos_tagger.tagger_normalize_initial_capitalization(pos_tagger.get_tagger(), word_vec);
				words = vector_utilities.vector_elements(word_vec, UNPROVIDED);
				final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
				try
				{
					lexicon_vars.$lexicon_lookup_mt$.bind($const330$InferencePSC, thread);
					SubLObject index = NIL;
					SubLObject tokens = NIL;
					index = ZERO_INTEGER;
					for (tokens = words; NIL != tokens; tokens = conses_high.nthcdr(record_length, tokens))
					{
						SubLObject new_token_addedP = NIL;
						if (NIL == new_token_addedP)
						{
							SubLObject csome_list_var = nl_trie.nl_trie_string_tokenize_multiple(document.construct_string_from_words(tokens, NIL, tokenizing_stream));
							SubLObject strings = NIL;
							strings = csome_list_var.first();
							while (NIL == new_token_addedP && NIL != csome_list_var)
							{
								SubLObject prefixes = nl_trie_accessors.nl_trie_prefixes_memoized(trie, strings, case_sensitivity, UNPROVIDED);
								SubLObject new_token = NIL;
								SubLObject local_case_sensitivity = case_sensitivity;
								SubLObject iteration_count = ZERO_INTEGER;
								while (NIL == lexified_word_p(new_token) && NIL == list_utilities.empty_list_p(prefixes))
								{
									iteration_count = Numbers.add(iteration_count, ONE_INTEGER);
									if (iteration_count.numG(TWENTY_INTEGER))
									{
										Errors.sublisp_break($str495$20_iterations_hit_inside_abstract, new SubLObject[] { sentence });
									}
									final SubLObject record = prefixes.first();
									prefixes = prefixes.rest();
									thread.resetMultipleValues();
									final SubLObject new_token_$25 = get_lex_entries_for_prefix(self, tokens, strings, record, lexified, UNPROVIDED);
									final SubLObject record_length_$26 = thread.secondMultipleValue();
									thread.resetMultipleValues();
									new_token = new_token_$25;
									record_length = record_length_$26;
									if (NIL != list_utilities.empty_list_p(prefixes) && NIL == document.word_info(new_token) && local_case_sensitivity == $kw389$PREFERRED)
									{
										local_case_sensitivity = $kw390$OFF;
										prefixes = nl_trie_accessors.nl_trie_prefixes_memoized(trie, strings, local_case_sensitivity, UNPROVIDED);
									}
								}
								if (NIL == document.word_p(new_token))
								{
									thread.resetMultipleValues();
									final SubLObject new_token_$26 = get_lex_entries_for_prefix(self, tokens, strings, NIL, lexified, UNPROVIDED);
									final SubLObject record_length_$27 = thread.secondMultipleValue();
									thread.resetMultipleValues();
									new_token = new_token_$26;
									record_length = record_length_$27;
								}
								if (!record_length.numE(ZERO_INTEGER))
								{
									lexified_tokens = ConsesLow.cons(new_token, lexified_tokens);
									new_token_addedP = T;
								}
								csome_list_var = csome_list_var.rest();
								strings = csome_list_var.first();
							}
						}
						index = Numbers.add(index, record_length);
					}
				} finally
				{
					lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
				}
				document._csetf_sign_constituents(lexified, Functions.apply(Symbols.symbol_function($sym477$VECTOR), Sequences.nreverse(lexified_tokens)));
				if (!document.word_string(document.sentence_get(lexified, ZERO_INTEGER)).equal(first_word))
				{
					document.word_update(document.sentence_get(lexified, ZERO_INTEGER), ConsesLow.list($kw34$STRING, Sequences.replace(document.word_string(document.sentence_get(lexified, ZERO_INTEGER)), first_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
				}
				document._csetf_sign_string(lexified, document.sentence_string(sentence));
				if (NIL != document.sentence_mother(sentence))
				{
					document.paragraph_set(document.sentence_mother(sentence), document.sentence_index(sentence), lexified);
				}
				Dynamic.sublisp_throw($sym493$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, lexified);
			} finally
			{
				final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					set_abstract_lexicon_trie(self, trie);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym493$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 63821L)
	public static SubLObject abstract_lexicon_lexify_sentence_exhaustively_method(final SubLObject self, final SubLObject sentence)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		final SubLObject trie = get_abstract_lexicon_trie(self);
		try
		{
			thread.throwStack.push($sym498$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				assert NIL != document.sentence_p(sentence) : sentence;
				if (document.sentence_length(sentence).isZero())
				{
					Dynamic.sublisp_throw($sym498$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, sentence);
				}
				final SubLObject lexified = document.new_sentence(UNPROVIDED, UNPROVIDED);
				final SubLObject word_vec = document.sentence_yield(sentence);
				final SubLObject first_word = document.word_string(Vectors.aref(word_vec, ZERO_INTEGER));
				SubLObject exhaustive_words = NIL;
				SubLObject words = NIL;
				pos_tagger.tagger_normalize_initial_capitalization(pos_tagger.get_tagger(), word_vec);
				words = vector_utilities.vector_elements(word_vec, UNPROVIDED);
				final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
				try
				{
					lexicon_vars.$lexicon_lookup_mt$.bind($const330$InferencePSC, thread);
					SubLObject index = NIL;
					SubLObject tokens = NIL;
					SubLObject strings = NIL;
					index = ZERO_INTEGER;
					for (tokens = words, strings = Mapping.mapcar(Symbols.symbol_function($sym451$WORD_STRING), tokens); NIL != tokens; tokens = tokens.rest(), strings = strings.rest())
					{
						final SubLObject prefixes = nl_trie_accessors.nl_trie_prefixes_memoized(trie, strings, case_sensitivity, UNPROVIDED);
						final SubLObject parent_word = document.new_exhaustive_word_from_word(tokens.first());
						final SubLObject prefix_words = get_all_prefix_words(self, prefixes, tokens, strings, lexified, parent_word);
						document._csetf_sign_constituents(parent_word, Functions.apply(Symbols.symbol_function($sym477$VECTOR), prefix_words));
						exhaustive_words = ConsesLow.cons(parent_word, exhaustive_words);
						index = Numbers.add(index, ONE_INTEGER);
					}
				} finally
				{
					lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
				}
				document._csetf_sign_constituents(lexified, Functions.apply(Symbols.symbol_function($sym477$VECTOR), Sequences.nreverse(exhaustive_words)));
				SubLObject cdolist_list_var = ConsesLow.cons(document.sentence_get(lexified, ZERO_INTEGER), vector_utilities.vector_elements(document.word_constituents(document.sentence_get(lexified, ZERO_INTEGER)), UNPROVIDED));
				SubLObject first_word_obj = NIL;
				first_word_obj = cdolist_list_var.first();
				while (NIL != cdolist_list_var)
				{
					document.word_update(first_word_obj, ConsesLow.list($kw34$STRING, Sequences.replace(document.word_string(first_word_obj), first_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
					cdolist_list_var = cdolist_list_var.rest();
					first_word_obj = cdolist_list_var.first();
				}
				document._csetf_sign_string(lexified, document.sentence_string(sentence));
				if (NIL != document.sentence_mother(sentence))
				{
					document.paragraph_set(document.sentence_mother(sentence), document.sentence_index(sentence), lexified);
				}
				Dynamic.sublisp_throw($sym498$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, lexified);
			} finally
			{
				final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					set_abstract_lexicon_trie(self, trie);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym498$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 66075L)
	public static SubLObject get_all_prefix_words(final SubLObject self, SubLObject prefixes, final SubLObject tokens, final SubLObject strings, final SubLObject lexified, final SubLObject parent_word)
	{
		SubLObject prefix_words = NIL;
		while (NIL == list_utilities.empty_list_p(prefixes))
		{
			final SubLObject record = prefixes.first();
			prefixes = prefixes.rest();
			final SubLObject word_for_prefix = get_lex_entries_for_prefix(self, tokens, strings, record, lexified, NIL);
			if (NIL != word_for_prefix)
			{
				document._csetf_sign_mother(word_for_prefix, parent_word);
				prefix_words = ConsesLow.cons(word_for_prefix, prefix_words);
			}
		}
		prefix_words = Sequences.remove(NIL, prefix_words, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (NIL == Sequences.find(document.word_string(parent_word), prefix_words, Symbols.symbol_function(EQUAL), $sym451$WORD_STRING, UNPROVIDED, UNPROVIDED))
		{
			prefix_words = ConsesLow.cons(document.copy_word(tokens.first()), prefix_words);
		}
		return prefix_words;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 66695L)
	public static SubLObject lexified_word_p(final SubLObject v_object)
	{
		return SubLObjectFactory.makeBoolean(NIL != document.word_p(v_object) && NIL != list_utilities.non_empty_list_p(document.word_info(v_object)));
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 66820L)
	public static SubLObject possibly_merge_tokens(final SubLObject tokens)
	{
		SubLObject result_tokens = NIL;
		SubLObject current_token = $str500$;
		SubLObject cdolist_list_var = tokens;
		SubLObject token = NIL;
		token = cdolist_list_var.first();
		while (NIL != cdolist_list_var)
		{
			if (NIL != Strings.stringE(token, $str501$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))
			{
				current_token = token;
			}
			else
			{
				result_tokens = ConsesLow.cons(Sequences.cconcatenate(current_token, token), result_tokens);
				current_token = $str500$;
			}
			cdolist_list_var = cdolist_list_var.rest();
			token = cdolist_list_var.first();
		}
		return Sequences.nreverse(result_tokens);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 67291L)
	public static SubLObject get_lex_entries_for_prefix(final SubLObject lexicon, final SubLObject tokens, final SubLObject strings, SubLObject record, final SubLObject lexified_sentence, SubLObject return_empty_word_if_no_lex_entries)
	{
		if (return_empty_word_if_no_lex_entries == UNPROVIDED)
		{
			return_empty_word_if_no_lex_entries = T;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject new_word = NIL;
		SubLObject string = NIL;
		SubLObject relevant_tokens = NIL;
		final SubLObject first_token = tokens.first();
		final SubLObject current_offset = (NIL != document.word_p(first_token)) ? document.word_offset(first_token) : Errors.error($str502$word_has_no_offset);
		SubLObject record_length = NIL;
		final SubLObject ignore_cacheP = methods.funcall_instance_method_with_0_args(lexicon, $sym182$IGNORE_CACHE_);
		final SubLObject v_cache = instances.get_slot(lexicon, $sym183$CACHE);
		SubLObject categories = NIL;
		SubLObject categories_orderedP = NIL;
		SubLObject lex_entries0 = NIL;
		SubLObject existsP = NIL;
		if (NIL == record)
		{
			record = nl_trie.new_nl_trie_record(ConsesLow.list(document.word_string(tokens.first())), NIL);
		}
		record_length = Sequences.length(nl_trie.nl_trie_record_key(record));
		thread.resetMultipleValues();
		final SubLObject string_$29 = reconstruct_string_from_tokens(list_utilities.first_n(record_length, strings), tokens);
		final SubLObject relevant_tokens_$30 = thread.secondMultipleValue();
		thread.resetMultipleValues();
		string = string_$29;
		relevant_tokens = relevant_tokens_$30;
		if (NIL == ignore_cacheP)
		{
			thread.resetMultipleValues();
			final SubLObject lex_entries0_$31 = cache.cache_get(v_cache, string);
			final SubLObject existsP_$32 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			lex_entries0 = lex_entries0_$31;
			existsP = existsP_$32;
		}
		if (NIL == existsP)
		{
			SubLObject cdolist_list_var = nl_trie.nl_trie_record_entries(record);
			SubLObject nl_trie_entry = NIL;
			nl_trie_entry = cdolist_list_var.first();
			while (NIL != cdolist_list_var)
			{
				if (NIL != methods.funcall_instance_method_with_1_args(lexicon, $sym242$VALID_NL_TRIE_ENTRY_, nl_trie_entry))
				{
					lex_entries0 = Sequences.cconcatenate(lex_entries0, methods.funcall_instance_method_with_2_args(lexicon, $sym388$CREATE_LEX_ENTRIES, string, nl_trie_entry));
				}
				else if (NIL != methods.funcall_instance_method_with_1_args(lexicon, $sym409$LEARNED_, nl_trie_entry))
				{
					lex_entries0 = ConsesLow.cons(nl_trie_entry, lex_entries0);
				}
				cdolist_list_var = cdolist_list_var.rest();
				nl_trie_entry = cdolist_list_var.first();
			}
			if (NIL == ignore_cacheP)
			{
				cache.cache_set(v_cache, string, lex_entries0);
			}
		}
		thread.resetMultipleValues();
		final SubLObject categories_$33 = order_penn_tags(list_utilities.first_n(record_length, tokens), lex_entries0);
		final SubLObject categories_orderedP_$34 = thread.secondMultipleValue();
		thread.resetMultipleValues();
		categories = categories_$33;
		categories_orderedP = categories_orderedP_$34;
		SubLObject lex_entries2 = NIL;
		SubLObject lex_entry_cat = categories.first();
		SubLObject doneP = NIL;
		if ((NIL != $lexify_sentence_ignore_pos_for_multiword_tokens$.getDynamicValue(thread) && record_length.numG(ONE_INTEGER)) || NIL == categories)
		{
			lex_entries2 = lex_entries0;
		}
		else if (NIL == doneP)
		{
			SubLObject csome_list_var = categories;
			SubLObject category = NIL;
			category = csome_list_var.first();
			while (NIL == doneP && NIL != csome_list_var)
			{
				SubLObject cdolist_list_var2 = lex_entries0;
				SubLObject lex_entry = NIL;
				lex_entry = cdolist_list_var2.first();
				while (NIL != cdolist_list_var2)
				{
					if (NIL == category || NIL != conses_high.member(category, methods.funcall_instance_method_with_1_args(lex_entry, $sym70$GET, $kw111$PENN_TAGS), EQ, UNPROVIDED))
					{
						final SubLObject item_var = lex_entry;
						if (NIL == conses_high.member(item_var, lex_entries2, $sym392$LEX_ENTRY_EQUAL_P, Symbols.symbol_function(IDENTITY)))
						{
							lex_entries2 = ConsesLow.cons(item_var, lex_entries2);
						}
						lex_entry_cat = category;
					}
					cdolist_list_var2 = cdolist_list_var2.rest();
					lex_entry = cdolist_list_var2.first();
				}
				doneP = SubLObjectFactory.makeBoolean(NIL != categories_orderedP && NIL != lex_entries2);
				csome_list_var = csome_list_var.rest();
				category = csome_list_var.first();
			}
		}
		if (NIL != string)
		{
			new_word = document.new_word(ConsesLow.list(new SubLObject[] { $kw34$STRING, string, $kw503$CATEGORY, lex_entry_cat, $kw504$MOTHER, lexified_sentence, $kw505$INFO, lex_entries2, $kw506$OFFSET, current_offset }));
			if (NIL == lex_entries2 && NIL != instances.get_slot(lexicon, $sym177$ALLOW_STEMMING))
			{
				final SubLObject copy_of_tokens = conses_high.copy_list(tokens);
				thread.resetMultipleValues();
				final SubLObject unstemmed_tokens = unstemmed_tokens_from_tokens(copy_of_tokens, record, strings);
				final SubLObject strings_$35 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (NIL == token_list_equalp(unstemmed_tokens, tokens, UNPROVIDED))
				{
					final SubLObject record_$36 = nl_trie_accessors.nl_trie_prefixes_memoized(instances.get_slot(lexicon, $sym184$TRIE), strings_$35, instances.get_slot(lexicon, $sym181$CASE_SENSITIVITY), UNPROVIDED).first();
					SubLObject my_new_word = NIL;
					thread.resetMultipleValues();
					final SubLObject my_new_word_$37 = get_lex_entries_for_prefix(lexicon, unstemmed_tokens, strings_$35, record_$36, lexified_sentence, UNPROVIDED);
					final SubLObject record_length_$38 = thread.secondMultipleValue();
					thread.resetMultipleValues();
					my_new_word = my_new_word_$37;
					record_length = record_length_$38;
					if (NIL != my_new_word)
					{
						document.sign_update(new_word, ConsesLow.list($kw505$INFO, document.sign_info(my_new_word), $kw34$STRING, document.sign_string(my_new_word)));
					}
				}
			}
		}
		if (NIL != document.word_p(new_word) && NIL != document.word_info(new_word) && NIL != relevant_tokens) { return Values.values(new_word, Sequences.length(relevant_tokens)); }
		if (NIL != return_empty_word_if_no_lex_entries) { return Values.values(tokens.first(), ONE_INTEGER); }
		return Values.values(NIL, ONE_INTEGER);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 71654L)
	public static SubLObject reconstruct_string_from_tokens(final SubLObject strings, final SubLObject tokens)
	{
		final SubLObject token_string = document.construct_string_from_words(tokens, T, UNPROVIDED);
		SubLObject current_search_result = NIL;
		SubLObject relevant_string = NIL;
		SubLObject token_count = ZERO_INTEGER;
		SubLObject current_search_result_$39 = NIL;
		SubLObject end = ZERO_INTEGER;
		SubLObject cdolist_list_var = strings;
		SubLObject str = NIL;
		str = cdolist_list_var.first();
		while (NIL != cdolist_list_var)
		{
			current_search_result_$39 = Sequences.search(str, token_string, EQUAL, IDENTITY, ZERO_INTEGER, NIL, end, UNPROVIDED);
			if (NIL == current_search_result_$39) { return NIL; }
			end = Numbers.add(Sequences.length(str), current_search_result_$39);
			cdolist_list_var = cdolist_list_var.rest();
			str = cdolist_list_var.first();
		}
		relevant_string = Sequences.subseq(token_string, ZERO_INTEGER, end);
		SubLObject token_search_end = ZERO_INTEGER;
		SubLObject doneP = NIL;
		if (NIL == doneP)
		{
			SubLObject csome_list_var = tokens;
			SubLObject token = NIL;
			token = csome_list_var.first();
			while (NIL == doneP && NIL != csome_list_var)
			{
				final SubLObject standardized_token_strings = nl_trie.nl_trie_standardize_strings(ConsesLow.list(document.word_string(token))).first();
				final SubLObject standardized_token_string = (NIL == standardized_token_strings) ? document.word_string(token) : standardized_token_strings.first();
				current_search_result = Sequences.search(standardized_token_string, relevant_string, EQUAL, IDENTITY, ZERO_INTEGER, NIL, token_search_end, UNPROVIDED);
				if (NIL == doneP && NIL != current_search_result)
				{
					token_count = Numbers.add(token_count, ONE_INTEGER);
					token_search_end = Numbers.add(Sequences.length(document.word_string(token)), current_search_result);
				}
				else
				{
					doneP = T;
				}
				csome_list_var = csome_list_var.rest();
				token = csome_list_var.first();
			}
		}
		return Values.values(relevant_string, Sequences.subseq(tokens, ZERO_INTEGER, token_count));
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 73856L)
	public static SubLObject token_list_equalp(final SubLObject token_list1, final SubLObject token_list2, SubLObject test)
	{
		if (test == UNPROVIDED)
		{
			test = EQUAL;
		}
		SubLObject token1 = NIL;
		SubLObject token1_$40 = NIL;
		SubLObject token2 = NIL;
		SubLObject token2_$41 = NIL;
		token1 = token_list1;
		token1_$40 = token1.first();
		token2 = token_list2;
		token2_$41 = token2.first();
		while (NIL != token2 || NIL != token1)
		{
			if (NIL == Functions.funcall(test, document.word_string(token1_$40), document.word_string(token2_$41))) { return NIL; }
			token1 = token1.rest();
			token1_$40 = token1.first();
			token2 = token2.rest();
			token2_$41 = token2.first();
		}
		return T;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 74278L)
	public static SubLObject unstemmed_tokens_from_tokens(final SubLObject tokens, final SubLObject record, final SubLObject strings)
	{
		final SubLObject last_word_string = conses_high.last(nl_trie.nl_trie_record_key(record), UNPROVIDED).first();
		final SubLObject stemmed_last_word_string = morphology.find_stem_memoized(last_word_string, UNPROVIDED);
		final SubLObject corresponding_token_list = conses_high.nthcdr(Numbers.subtract(Sequences.length(nl_trie.nl_trie_record_key(record)), ONE_INTEGER), tokens);
		final SubLObject unstemmed_last_token = document.copy_word(corresponding_token_list.first());
		final SubLObject new_strings = list_utilities.replace_nth(Numbers.subtract(Sequences.length(nl_trie.nl_trie_record_key(record)), ONE_INTEGER), stemmed_last_word_string, strings);
		document.set_word_string(unstemmed_last_token, stemmed_last_word_string);
		ConsesLow.rplaca(corresponding_token_list, unstemmed_last_token);
		return Values.values(tokens, new_strings);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 75200L)
	public static SubLObject order_penn_tags(final SubLObject tokens, final SubLObject lex_entries)
	{
		final SubLObject first_word = tokens.first();
		final SubLObject first_tag = document.word_category(first_word);
		final SubLObject last_word = conses_high.last(tokens, UNPROVIDED).first();
		final SubLObject last_tag = document.word_category(last_word);
		final SubLObject record_tags = entries_tags(lex_entries);
		final SubLObject orderedP = SubLObjectFactory.makeBoolean(NIL != last_tag || NIL != first_tag);
		if (NIL == subl_promotions.memberP(first_tag, $list507, UNPROVIDED, UNPROVIDED))
		{
			if (NIL != conses_high.member(last_tag, record_tags, UNPROVIDED, UNPROVIDED)) { return Values.values(ConsesLow.cons(last_tag, Sequences.remove(last_tag, record_tags, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), orderedP); }
			if (NIL != conses_high.member(last_tag, $list508, UNPROVIDED, UNPROVIDED)) { return Values.values(ConsesLow.cons(first_tag, Sequences.remove(first_tag, record_tags, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), orderedP); }
			if (NIL != conses_high.member(last_tag, entries_backoff_tags(lex_entries), UNPROVIDED, UNPROVIDED)) { return Values.values(record_tags, orderedP); }
			if (NIL != subl_promotions.memberP(first_tag, record_tags, UNPROVIDED, UNPROVIDED) && NIL != some_head_initial_lex_entry_has_tag(lex_entries, first_tag)) { return Values.values(ConsesLow.cons(first_tag, Sequences.remove(first_tag, record_tags, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), orderedP); }
			if (NIL != last_tag) { return Values.values(ConsesLow.list(last_tag), orderedP); }
			return Values.values(record_tags, orderedP);
		}
		else
		{
			if (NIL != conses_high.member(first_tag, record_tags, UNPROVIDED, UNPROVIDED)) { return Values.values(ConsesLow.cons(first_tag, Sequences.remove(first_tag, record_tags, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), orderedP); }
			if (NIL != conses_high.member(first_tag, entries_backoff_tags(lex_entries), UNPROVIDED, UNPROVIDED)) { return Values.values(tags_matching_backoff_tags(first_tag, lex_entries), orderedP); }
			return Values.values(ConsesLow.cons(first_tag, tag_backoffs(first_tag)), orderedP);
		}
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 77778L)
	public static SubLObject some_head_initial_lex_entry_has_tag(final SubLObject lex_entries, final SubLObject tag)
	{
		SubLObject cdolist_list_var = lex_entries;
		SubLObject lex_entry = NIL;
		lex_entry = cdolist_list_var.first();
		while (NIL != cdolist_list_var)
		{
			if (methods.funcall_instance_method_with_1_args(lex_entry, $sym70$GET, $kw111$PENN_TAGS).eql(tag) && methods.funcall_instance_method_with_1_args(lex_entry, $sym70$GET, $kw168$PREDICATE).eql($const509$multiWordString)) { return T; }
			cdolist_list_var = cdolist_list_var.rest();
			lex_entry = cdolist_list_var.first();
		}
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 78032L)
	public static SubLObject entries_tags(final SubLObject entries)
	{
		SubLObject tags = NIL;
		SubLObject cdolist_list_var = entries;
		SubLObject entry = NIL;
		entry = cdolist_list_var.first();
		while (NIL != cdolist_list_var)
		{
			SubLObject cdolist_list_var_$42 = methods.funcall_instance_method_with_1_args(entry, $sym70$GET, $kw111$PENN_TAGS);
			SubLObject tag = NIL;
			tag = cdolist_list_var_$42.first();
			while (NIL != cdolist_list_var_$42)
			{
				final SubLObject item_var = tag;
				if (NIL == conses_high.member(item_var, tags, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))
				{
					tags = ConsesLow.cons(item_var, tags);
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
	public static SubLObject entries_backoff_tags(final SubLObject entries)
	{
		SubLObject backoff_tags = NIL;
		SubLObject cdolist_list_var = entries;
		SubLObject entry = NIL;
		entry = cdolist_list_var.first();
		while (NIL != cdolist_list_var)
		{
			SubLObject cdolist_list_var_$43 = methods.funcall_instance_method_with_1_args(entry, $sym70$GET, $kw510$BACKOFF_PENN_TAGS);
			SubLObject tag = NIL;
			tag = cdolist_list_var_$43.first();
			while (NIL != cdolist_list_var_$43)
			{
				final SubLObject item_var = tag;
				if (NIL == conses_high.member(item_var, backoff_tags, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))
				{
					backoff_tags = ConsesLow.cons(item_var, backoff_tags);
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
	public static SubLObject tags_matching_backoff_tags(final SubLObject known_tag, final SubLObject lex_entries)
	{
		SubLObject matching_tags = NIL;
		SubLObject cdolist_list_var = lex_entries;
		SubLObject lex_entry = NIL;
		lex_entry = cdolist_list_var.first();
		while (NIL != cdolist_list_var)
		{
			if (NIL != subl_promotions.memberP(known_tag, methods.funcall_instance_method_with_1_args(lex_entry, $sym70$GET, $kw510$BACKOFF_PENN_TAGS), UNPROVIDED, UNPROVIDED))
			{
				matching_tags = conses_high.union(matching_tags, methods.funcall_instance_method_with_1_args(lex_entry, $sym70$GET, $kw111$PENN_TAGS), UNPROVIDED, UNPROVIDED);
			}
			cdolist_list_var = cdolist_list_var.rest();
			lex_entry = cdolist_list_var.first();
		}
		return matching_tags;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 78729L)
	public static SubLObject guess_category(final SubLObject lexicon, final SubLObject string, final SubLObject tokens)
	{
		assert NIL != abstract_lexicon_p(lexicon) : lexicon;
		assert NIL != Types.stringp(string) : string;
		assert NIL != Types.listp(tokens) : tokens;
		final SubLObject first_word = tokens.first();
		final SubLObject last_word = conses_high.last(tokens, UNPROVIDED).first();
		final SubLObject lexes = methods.funcall_instance_method_with_1_args(lexicon, $sym70$GET, string);
		if (methods.funcall_instance_method_with_0_args(first_word, $sym511$GET_STRING).equal(string)) { return methods.funcall_instance_method_with_0_args(first_word, $sym512$GET_CATEGORY); }
		if (NIL != lexes) { return methods.funcall_instance_method_with_1_args(lexes.first(), $sym70$GET, $kw111$PENN_TAGS).first(); }
		if (NIL != conses_high.member(methods.funcall_instance_method_with_0_args(first_word, $sym512$GET_CATEGORY), $list513, UNPROVIDED, UNPROVIDED) && methods.funcall_instance_method_with_0_args(last_word, $sym512$GET_CATEGORY).eql($kw446$CD)) { return methods.funcall_instance_method_with_0_args(first_word, $sym512$GET_CATEGORY); }
		return methods.funcall_instance_method_with_0_args(last_word, $sym512$GET_CATEGORY);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 79606L)
	public static SubLObject abstract_lexicon_lexify_words_method(final SubLObject self, final SubLObject words)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject catch_var_for_abstract_lexicon_method = NIL;
		final SubLObject case_sensitivity = get_abstract_lexicon_case_sensitivity(self);
		final SubLObject ignore_cacheP = get_abstract_lexicon_ignore_cacheP(self);
		final SubLObject v_cache = get_abstract_lexicon_cache(self);
		final SubLObject trie = get_abstract_lexicon_trie(self);
		try
		{
			thread.throwStack.push($sym517$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
			try
			{
				assert NIL != Types.listp(words) : words;
				SubLObject record_length = ZERO_INTEGER;
				SubLObject lexified_tokens = NIL;
				SubLObject category = NIL;
				SubLObject string = NIL;
				SubLObject index = NIL;
				SubLObject tokens = NIL;
				SubLObject strings = NIL;
				SubLObject records = NIL;
				index = ZERO_INTEGER;
				tokens = words;
				strings = Mapping.mapcar(Symbols.symbol_function($sym518$GET_PARSE_TREE_STRING), tokens);
				records = nl_trie_accessors.nl_trie_prefixes(trie, strings, case_sensitivity);
				while (NIL != tokens)
				{
					records = list_utilities.add_to_end(nl_trie.new_nl_trie_record(ConsesLow.list(methods.funcall_instance_method_with_0_args(tokens.first(), $sym511$GET_STRING)), NIL), records);
					SubLObject new_token_added_for_prefixe = NIL;
					if (NIL == new_token_added_for_prefixe)
					{
						SubLObject csome_list_var = records;
						SubLObject record = NIL;
						record = csome_list_var.first();
						while (NIL == new_token_added_for_prefixe && NIL != csome_list_var)
						{
							record_length = Sequences.length(nl_trie.nl_trie_record_key(record));
							string = build_multi_word_lexeme(list_utilities.first_n(record_length, strings));
							category = guess_category(self, string, tokens);
							SubLObject lex_entries = NIL;
							SubLObject lex_entries2 = NIL;
							SubLObject existsP = NIL;
							if (NIL == ignore_cacheP)
							{
								thread.resetMultipleValues();
								final SubLObject lex_entries0_$44 = cache.cache_get(v_cache, string);
								final SubLObject existsP_$45 = thread.secondMultipleValue();
								thread.resetMultipleValues();
								lex_entries2 = lex_entries0_$44;
								existsP = existsP_$45;
							}
							if (NIL == existsP)
							{
								SubLObject cdolist_list_var = nl_trie.nl_trie_record_entries(record);
								SubLObject nl_trie_entry = NIL;
								nl_trie_entry = cdolist_list_var.first();
								while (NIL != cdolist_list_var)
								{
									if (NIL != methods.funcall_instance_method_with_1_args(self, $sym242$VALID_NL_TRIE_ENTRY_, nl_trie_entry))
									{
										SubLObject cdolist_list_var_$46 = methods.funcall_instance_method_with_2_args(self, $sym388$CREATE_LEX_ENTRIES, string, nl_trie_entry);
										SubLObject lex_entry = NIL;
										lex_entry = cdolist_list_var_$46.first();
										while (NIL != cdolist_list_var_$46)
										{
											lex_entries2 = ConsesLow.cons(lex_entry, lex_entries2);
											cdolist_list_var_$46 = cdolist_list_var_$46.rest();
											lex_entry = cdolist_list_var_$46.first();
										}
									}
									cdolist_list_var = cdolist_list_var.rest();
									nl_trie_entry = cdolist_list_var.first();
								}
								if (NIL == ignore_cacheP)
								{
									cache.cache_set(v_cache, string, lex_entries2);
								}
							}
							SubLObject cdolist_list_var = lex_entries2;
							SubLObject lex_entry2 = NIL;
							lex_entry2 = cdolist_list_var.first();
							while (NIL != cdolist_list_var)
							{
								if (NIL != subl_promotions.memberP(category, methods.funcall_instance_method_with_1_args(lex_entry2, $sym70$GET, $kw111$PENN_TAGS), UNPROVIDED, UNPROVIDED))
								{
									final SubLObject item_var = lex_entry2;
									if (NIL == conses_high.member(item_var, lex_entries, $sym392$LEX_ENTRY_EQUAL_P, Symbols.symbol_function(IDENTITY)))
									{
										lex_entries = ConsesLow.cons(item_var, lex_entries);
									}
								}
								cdolist_list_var = cdolist_list_var.rest();
								lex_entry2 = cdolist_list_var.first();
							}
							if (NIL == lex_entries)
							{
								cdolist_list_var = lex_entries2;
								lex_entry2 = NIL;
								lex_entry2 = cdolist_list_var.first();
								while (NIL != cdolist_list_var)
								{
									if (NIL != subl_promotions.memberP(category, methods.funcall_instance_method_with_1_args(lex_entry2, $sym70$GET, $kw510$BACKOFF_PENN_TAGS), UNPROVIDED, UNPROVIDED))
									{
										final SubLObject item_var = lex_entry2;
										if (NIL == conses_high.member(item_var, lex_entries, $sym392$LEX_ENTRY_EQUAL_P, Symbols.symbol_function(IDENTITY)))
										{
											lex_entries = ConsesLow.cons(item_var, lex_entries);
										}
									}
									cdolist_list_var = cdolist_list_var.rest();
									lex_entry2 = cdolist_list_var.first();
								}
							}
							if (NIL != lex_entries || NIL == nl_trie.nl_trie_record_entries(record))
							{
								new_token_added_for_prefixe = T;
								lexified_tokens = ConsesLow.cons(ConsesLow.list(string, category, lex_entries), lexified_tokens);
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
				Dynamic.sublisp_throw($sym517$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD, Sequences.nreverse(lexified_tokens));
			} finally
			{
				final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try
				{
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = Values.getValuesAsVector();
					set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
					set_abstract_lexicon_ignore_cacheP(self, ignore_cacheP);
					set_abstract_lexicon_cache(self, v_cache);
					set_abstract_lexicon_trie(self, trie);
					Values.restoreValuesFromVector(_values);
				} finally
				{
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
				}
			}
		} catch (Throwable ccatch_env_var)
		{
			catch_var_for_abstract_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym517$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD);
		} finally
		{
			thread.throwStack.pop();
		}
		return catch_var_for_abstract_lexicon_method;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 82485L)
	public static SubLObject build_multi_word_lexeme(final SubLObject strings)
	{
		SubLObject result = NIL;
		SubLObject in = NIL;
		try
		{
			in = streams_high.make_private_string_output_stream();
			print_high.princ(strings.first(), in);
			SubLObject cdolist_list_var = strings.rest();
			SubLObject string = NIL;
			string = cdolist_list_var.first();
			while (NIL != cdolist_list_var)
			{
				if (NIL == string_utilities.punctuation_string_p(string))
				{
					print_high.princ($str520$_, in);
				}
				print_high.princ(string, in);
				cdolist_list_var = cdolist_list_var.rest();
				string = cdolist_list_var.first();
			}
			result = streams_high.get_output_stream_string(in);
		} finally
		{
			final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
			try
			{
				Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
				final SubLObject _values = Values.getValuesAsVector();
				streams_high.close(in, UNPROVIDED);
				Values.restoreValuesFromVector(_values);
			} finally
			{
				Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
			}
		}
		return result;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 82818L)
	public static SubLObject abstract_lexicon_tokenize_method(final SubLObject self, final SubLObject string)
	{
		final SubLObject words = abstract_lexicon_lexify_sentence_method(self, document.new_sentence(string, $sym523$FST_STRING_WORDIFY));
		SubLObject strings = NIL;
		SubLObject cdolist_list_var = document.sentence_yield_exhaustive(words);
		SubLObject word = NIL;
		word = cdolist_list_var.first();
		while (NIL != cdolist_list_var)
		{
			strings = ConsesLow.cons(document.word_string(word), strings);
			cdolist_list_var = cdolist_list_var.rest();
			word = cdolist_list_var.first();
		}
		return Sequences.nreverse(strings);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 83389L)
	public static SubLObject do_lexicon(final SubLObject macroform, final SubLObject environment)
	{
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list525);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject string = NIL;
		SubLObject lex_entry = NIL;
		SubLObject lexicon = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list525);
		string = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list525);
		lex_entry = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list525);
		lexicon = current.first();
		current = current.rest();
		if (NIL == current)
		{
			final SubLObject body;
			current = (body = temp);
			final SubLObject iterator = $sym526$ITERATOR;
			return ConsesLow.list($sym527$CLET, ConsesLow.list(ConsesLow.list(iterator, ConsesLow.list($sym528$NEW_LEXICON_ITERATOR, lexicon))), ConsesLow.list($sym529$UNTIL, ConsesLow.list($sym530$ITERATION_DONE, iterator), ConsesLow.listS($sym527$CLET, ConsesLow.list(ConsesLow.list(lex_entry, ConsesLow.list($sym531$ITERATION_NEXT, iterator)), ConsesLow.list(string, ConsesLow.listS($sym532$FIM, lex_entry, $list533))), ConsesLow.append(body, NIL))));
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, $list525);
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 83847L)
	public static SubLObject abstract_lexicon_iterator_method(final SubLObject self)
	{
		return new_lexicon_iterator(self);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 83998L)
	public static SubLObject new_lexicon_from_kb_spec(final SubLObject kb_spec)
	{
		enforceType(kb_spec, $sym537$FORT_P);
		final SubLObject class_name = lexicon_spec_class_name(kb_spec);
		final SubLObject lex = object.new_class_instance(class_name);
		methods.funcall_instance_method_with_1_args(lex, $sym206$INITIALIZE_ALLOWED_MTS, kb_spec);
		methods.funcall_instance_method_with_1_args(lex, $sym205$INITIALIZE_EXCLUDED_PREDS, preds_for_lexicon_exclusion(kb_spec));
		return lex;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 84579L)
	public static SubLObject lexicon_spec_class_name(final SubLObject kb_spec)
	{
		return cycl_utilities.formula_arg1(ask_utilities.query_variable($sym543$_CLASS_NAME, ConsesLow.listS($const544$objectClassName, kb_spec, $list545), $const330$InferencePSC, UNPROVIDED).first(), UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 84749L)
	public static SubLObject clear_preds_for_lexicon_exclusion()
	{
		final SubLObject cs = $preds_for_lexicon_exclusion_caching_state$.getGlobalValue();
		if (NIL != cs)
		{
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 84749L)
	public static SubLObject remove_preds_for_lexicon_exclusion(final SubLObject kb_spec)
	{
		return memoization_state.caching_state_remove_function_results_with_args($preds_for_lexicon_exclusion_caching_state$.getGlobalValue(), ConsesLow.list(kb_spec), UNPROVIDED, UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 84749L)
	public static SubLObject preds_for_lexicon_exclusion_internal(final SubLObject kb_spec)
	{
		return ask_utilities.query_variable($sym547$_PRED, ConsesLow.listS($const548$disallowedLexicalPredicate, kb_spec, $list549), $const330$InferencePSC, $list550);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 84749L)
	public static SubLObject preds_for_lexicon_exclusion(final SubLObject kb_spec)
	{
		SubLObject caching_state = $preds_for_lexicon_exclusion_caching_state$.getGlobalValue();
		if (NIL == caching_state)
		{
			caching_state = memoization_state.create_global_caching_state_for_name($sym546$PREDS_FOR_LEXICON_EXCLUSION, $sym551$_PREDS_FOR_LEXICON_EXCLUSION_CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
			memoization_state.register_hl_store_cache_clear_callback($sym552$CLEAR_PREDS_FOR_LEXICON_EXCLUSION);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, kb_spec, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue()))
		{
			results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(preds_for_lexicon_exclusion_internal(kb_spec)));
			memoization_state.caching_state_put(caching_state, kb_spec, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 84969L)
	public static SubLObject new_lexicon_iterator(final SubLObject lexicon)
	{
		return iteration.new_iterator(new_abstract_lexicon_iterator_state(lexicon), $sym553$ABSTRACT_LEXICON_ITERATOR_STATE_DONE_P, $sym554$ABSTRACT_LEXICON_ITERATOR_STATE_NEXT, UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
	public static SubLObject abstract_lexicon_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
	{
		compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
	public static SubLObject abstract_lexicon_iterator_state_p(final SubLObject v_object)
	{
		return ((v_object.getClass() == $abstract_lexicon_iterator_state_native.class) ? T : NIL);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
	public static SubLObject abstract_lexicon_iterator_state_trie_iterator(final SubLObject v_object)
	{
		assert NIL != abstract_lexicon_iterator_state_p(v_object) : v_object;
		return v_object.getField2();
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
	public static SubLObject abstract_lexicon_iterator_state_next_entries(final SubLObject v_object)
	{
		assert NIL != abstract_lexicon_iterator_state_p(v_object) : v_object;
		return v_object.getField3();
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
	public static SubLObject abstract_lexicon_iterator_state_lexicon(final SubLObject v_object)
	{
		assert NIL != abstract_lexicon_iterator_state_p(v_object) : v_object;
		return v_object.getField4();
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
	public static SubLObject _csetf_abstract_lexicon_iterator_state_trie_iterator(final SubLObject v_object, final SubLObject value)
	{
		assert NIL != abstract_lexicon_iterator_state_p(v_object) : v_object;
		return v_object.setField2(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
	public static SubLObject _csetf_abstract_lexicon_iterator_state_next_entries(final SubLObject v_object, final SubLObject value)
	{
		assert NIL != abstract_lexicon_iterator_state_p(v_object) : v_object;
		return v_object.setField3(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
	public static SubLObject _csetf_abstract_lexicon_iterator_state_lexicon(final SubLObject v_object, final SubLObject value)
	{
		assert NIL != abstract_lexicon_iterator_state_p(v_object) : v_object;
		return v_object.setField4(value);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
	public static SubLObject make_abstract_lexicon_iterator_state(SubLObject arglist)
	{
		if (arglist == UNPROVIDED)
		{
			arglist = NIL;
		}
		final SubLObject v_new = new $abstract_lexicon_iterator_state_native();
		SubLObject next;
		SubLObject current_arg;
		SubLObject current_value;
		SubLObject pcase_var;
		for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next))
		{
			current_arg = next.first();
			current_value = conses_high.cadr(next);
			pcase_var = current_arg;
			if (pcase_var.eql($kw570$TRIE_ITERATOR))
			{
				_csetf_abstract_lexicon_iterator_state_trie_iterator(v_new, current_value);
			}
			else if (pcase_var.eql($kw571$NEXT_ENTRIES))
			{
				_csetf_abstract_lexicon_iterator_state_next_entries(v_new, current_value);
			}
			else if (pcase_var.eql($kw572$LEXICON))
			{
				_csetf_abstract_lexicon_iterator_state_lexicon(v_new, current_value);
			}
			else
			{
				Errors.error($str37$Invalid_slot__S_for_construction_, current_arg);
			}
		}
		return v_new;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
	public static SubLObject visit_defstruct_abstract_lexicon_iterator_state(final SubLObject obj, final SubLObject visitor_fn)
	{
		Functions.funcall(visitor_fn, obj, $kw38$BEGIN, $sym573$MAKE_ABSTRACT_LEXICON_ITERATOR_STATE, THREE_INTEGER);
		Functions.funcall(visitor_fn, obj, $kw40$SLOT, $kw570$TRIE_ITERATOR, abstract_lexicon_iterator_state_trie_iterator(obj));
		Functions.funcall(visitor_fn, obj, $kw40$SLOT, $kw571$NEXT_ENTRIES, abstract_lexicon_iterator_state_next_entries(obj));
		Functions.funcall(visitor_fn, obj, $kw40$SLOT, $kw572$LEXICON, abstract_lexicon_iterator_state_lexicon(obj));
		Functions.funcall(visitor_fn, obj, $kw41$END, $sym573$MAKE_ABSTRACT_LEXICON_ITERATOR_STATE, THREE_INTEGER);
		return obj;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85222L)
	public static SubLObject visit_defstruct_object_abstract_lexicon_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn)
	{
		return visit_defstruct_abstract_lexicon_iterator_state(obj, visitor_fn);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85315L)
	public static SubLObject new_abstract_lexicon_iterator_state(final SubLObject lexicon)
	{
		final SubLObject iterator = make_abstract_lexicon_iterator_state(UNPROVIDED);
		_csetf_abstract_lexicon_iterator_state_trie_iterator(iterator, nl_trie.new_nl_trie_iterator(get_abstract_lexicon_trie(lexicon)));
		_csetf_abstract_lexicon_iterator_state_lexicon(iterator, lexicon);
		return iterator;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 85658L)
	public static SubLObject abstract_lexicon_iterator_state_done_p(final SubLObject state)
	{
		final SubLObject lexicon = abstract_lexicon_iterator_state_lexicon(state);
		final SubLObject trie_iterator = abstract_lexicon_iterator_state_trie_iterator(state);
		if (NIL != abstract_lexicon_iterator_state_next_entries(state)) { return NIL; }
		if (NIL != iteration.iteration_done(trie_iterator)) { return T; }
		while (NIL == abstract_lexicon_iterator_state_next_entries(state) && NIL == iteration.iteration_done(trie_iterator))
		{
			final SubLObject next_entry = iteration.iteration_next(trie_iterator);
			if (NIL != next_entry)
			{
				SubLObject current;
				final SubLObject datum = current = next_entry;
				SubLObject key = NIL;
				SubLObject trie_entries = NIL;
				cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list575);
				key = current.first();
				current = current.rest();
				cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list575);
				trie_entries = current.first();
				current = current.rest();
				if (NIL == current)
				{
					SubLObject cdolist_list_var = trie_entries;
					SubLObject trie_entry = NIL;
					trie_entry = cdolist_list_var.first();
					while (NIL != cdolist_list_var)
					{
						final SubLObject string = nl_trie.nl_trie_entry_string(trie_entry);
						if (NIL != methods.funcall_instance_method_with_1_args(lexicon, $sym242$VALID_NL_TRIE_ENTRY_, trie_entry))
						{
							SubLObject cdolist_list_var_$47 = methods.funcall_instance_method_with_2_args(lexicon, $sym388$CREATE_LEX_ENTRIES, string, trie_entry);
							SubLObject lex_entry = NIL;
							lex_entry = cdolist_list_var_$47.first();
							while (NIL != cdolist_list_var_$47)
							{
								_csetf_abstract_lexicon_iterator_state_next_entries(state, ConsesLow.cons(lex_entry, abstract_lexicon_iterator_state_next_entries(state)));
								cdolist_list_var_$47 = cdolist_list_var_$47.rest();
								lex_entry = cdolist_list_var_$47.first();
							}
						}
						cdolist_list_var = cdolist_list_var.rest();
						trie_entry = cdolist_list_var.first();
					}
				}
				else
				{
					cdestructuring_bind.cdestructuring_bind_error(datum, $list575);
				}
			}
		}
		return SubLObjectFactory.makeBoolean(NIL == abstract_lexicon_iterator_state_next_entries(state));
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 86650L)
	public static SubLObject abstract_lexicon_iterator_state_next(final SubLObject state)
	{
		if (NIL != abstract_lexicon_iterator_state_done_p(state)) { return Values.values(NIL, state, T); }
		final SubLObject entry = abstract_lexicon_iterator_state_next_entries(state).first();
		_csetf_abstract_lexicon_iterator_state_next_entries(state, abstract_lexicon_iterator_state_next_entries(state).rest());
		return Values.values(entry, state, NIL);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 87049L)
	public static SubLObject valid_denotsP(final SubLObject nl_trie_entry)
	{
		return T;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 87233L)
	public static SubLObject lex_entry2nl_trie_entry(final SubLObject lex_entry)
	{
		return lex_entry;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 87407L)
	public static SubLObject map_from_cyc_to_penn_pos(final SubLObject pos, final SubLObject pred)
	{
		return Hashtables.gethash(ConsesLow.cons(pos, pred), get_cyc_to_penn_map(), UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 87756L)
	public static SubLObject with_el_formula_terms(final SubLObject macroform, final SubLObject environment)
	{
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list576);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject v_term = NIL;
		SubLObject formula = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list576);
		v_term = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list576);
		formula = current.first();
		current = current.rest();
		if (NIL == current)
		{
			final SubLObject body;
			current = (body = temp);
			final SubLObject stack = $sym577$STACK;
			final SubLObject entry = $sym578$ENTRY;
			return ConsesLow.list($sym527$CLET, ConsesLow.list(reader.bq_cons(stack, $list579), v_term), ConsesLow.list($sym580$STACK_PUSH, formula, stack), ConsesLow.list($sym529$UNTIL, ConsesLow.list($sym581$STACK_EMPTY_P, stack), ConsesLow.list($sym527$CLET, ConsesLow.list(ConsesLow.list(entry, ConsesLow.list($sym582$STACK_POP, stack))), ConsesLow.listS($sym583$PWHEN, ConsesLow.list($sym584$FIRST_ORDER_TERM_, entry), ConsesLow.list($sym585$CSETQ, v_term, entry), ConsesLow.append(body, NIL)), ConsesLow.list($sym586$CDOLIST, ConsesLow.list($sym587$ARG, ConsesLow.list($sym588$FORMULA_TERMS, entry)), ConsesLow.list($sym580$STACK_PUSH, $sym587$ARG, stack)))));
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, $list576);
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 88270L)
	public static SubLObject number_meanings_equalP(final SubLObject parse1, final SubLObject parse2)
	{
		SubLObject string1 = NIL;
		SubLObject number1 = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(parse1, parse1, $list599);
		string1 = parse1.first();
		SubLObject current = parse1.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, parse1, $list599);
		number1 = current.first();
		current = current.rest();
		if (NIL == current)
		{
			SubLObject string2 = NIL;
			SubLObject number2 = NIL;
			cdestructuring_bind.destructuring_bind_must_consp(parse2, parse2, $list600);
			string2 = parse2.first();
			SubLObject current_$49 = parse2.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current_$49, parse2, $list600);
			number2 = current_$49.first();
			current_$49 = current_$49.rest();
			if (NIL == current_$49) { return SubLObjectFactory.makeBoolean(string1.equal(string2) && number1.numE(number2)); }
			cdestructuring_bind.cdestructuring_bind_error(parse2, $list600);
		}
		else
		{
			cdestructuring_bind.cdestructuring_bind_error(parse1, $list599);
		}
		return NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 88270L)
	public static SubLObject number_meanings_results_equalP(final SubLObject results1, final SubLObject results2)
	{
		return list_utilities.sets_equalP(results1, results2, $sym601$NUMBER_MEANINGS_EQUAL_);
	}

	@SubLTranslatedFile.SubL(source = "cycl/abstract-lexicon.lisp", position = 88270L)
	public static SubLObject tokenizing_test_covering(final SubLObject string, final SubLObject cycls)
	{
		SubLObject word_count = ZERO_INTEGER;
		final SubLObject vector_var = document.document_paragraphs(document_annotation_widgets.new_tagged_document(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		final SubLObject backwardP_var = NIL;
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
		for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER))
		{
			element_num = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
			paragraph = Vectors.aref(vector_var, element_num);
			vector_var_$50 = document.paragraph_sentences(paragraph);
			backwardP_var_$51 = NIL;
			for (length_$52 = Sequences.length(vector_var_$50), v_iteration_$53 = NIL, v_iteration_$53 = ZERO_INTEGER; v_iteration_$53.numL(length_$52); v_iteration_$53 = Numbers.add(v_iteration_$53, ONE_INTEGER))
			{
				element_num_$54 = ((NIL != backwardP_var_$51) ? Numbers.subtract(length_$52, v_iteration_$53, ONE_INTEGER) : v_iteration_$53);
				sentence = Vectors.aref(vector_var_$50, element_num_$54);
				cdolist_list_var = document.sentence_yield_exhaustive(sentence);
				word = NIL;
				word = cdolist_list_var.first();
				while (NIL != cdolist_list_var)
				{
					word_count = Numbers.add(word_count, ONE_INTEGER);
					if (NIL == list_utilities.same_length_p(conses_high.intersection(cycls, document.word_cycls(word), EQUAL, UNPROVIDED), document.word_cycls(word))) { return NIL; }
					cdolist_list_var = cdolist_list_var.rest();
					word = cdolist_list_var.first();
				}
			}
		}
		return Numbers.numE(word_count, ONE_INTEGER);
	}

	public static SubLObject declare_abstract_lexicon_file()
	{
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
		return NIL;
	}

	public static SubLObject init_abstract_lexicon_file()
	{
		$cyc_to_penn_list$ = SubLFiles.deflexical("*CYC-TO-PENN-LIST*", NIL);
		$cyc_to_penn_map$ = SubLFiles.deflexical("*CYC-TO-PENN-MAP*", NIL);
		$cyc_to_supertag_map$ = SubLFiles.deflexical("*CYC-TO-SUPERTAG-MAP*", NIL);
		$cyc_to_supertag_list$ = SubLFiles.defparameter("*CYC-TO-SUPERTAG-LIST*", $list8);
		$dtp_textract_lemma$ = SubLFiles.defconstant("*DTP-TEXTRACT-LEMMA*", $sym10$TEXTRACT_LEMMA);
		$nominal_tags$ = SubLFiles.defconstant("*NOMINAL-TAGS*", $list105);
		$verbal_tags$ = SubLFiles.defconstant("*VERBAL-TAGS*", $list106);
		$adjectival_tags$ = SubLFiles.defconstant("*ADJECTIVAL-TAGS*", $list107);
		$adverbial_tags$ = SubLFiles.defconstant("*ADVERBIAL-TAGS*", $list108);
		$penn_tag_backoffs$ = SubLFiles.defparameter("*PENN-TAG-BACKOFFS*", $list155);
		$scalar_functionP_caching_state$ = SubLFiles.deflexical("*SCALAR-FUNCTION?-CACHING-STATE*", NIL);
		$lexify_sentence_ignore_pos_for_multiword_tokens$ = SubLFiles.defparameter("*LEXIFY-SENTENCE-IGNORE-POS-FOR-MULTIWORD-TOKENS*", T);
		$preds_for_lexicon_exclusion_caching_state$ = SubLFiles.deflexical("*PREDS-FOR-LEXICON-EXCLUSION-CACHING-STATE*", NIL);
		$dtp_abstract_lexicon_iterator_state$ = SubLFiles.defconstant("*DTP-ABSTRACT-LEXICON-ITERATOR-STATE*", $sym555$ABSTRACT_LEXICON_ITERATOR_STATE);
		return NIL;
	}

	public static SubLObject setup_abstract_lexicon_file()
	{
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_textract_lemma$.getGlobalValue(), Symbols.symbol_function($sym17$TEXTRACT_LEMMA_PRINT_FUNCTION_TRAMPOLINE));
		SubLSpecialOperatorDeclarations.proclaim($list18);
		Structures.def_csetf($sym19$TEXTRACT_LEMMA_PARAGRAPH, $sym20$_CSETF_TEXTRACT_LEMMA_PARAGRAPH);
		Structures.def_csetf($sym21$TEXTRACT_LEMMA_SENTENCE, $sym22$_CSETF_TEXTRACT_LEMMA_SENTENCE);
		Structures.def_csetf($sym23$TEXTRACT_LEMMA_WORD, $sym24$_CSETF_TEXTRACT_LEMMA_WORD);
		Structures.def_csetf($sym25$TEXTRACT_LEMMA_STRING, $sym26$_CSETF_TEXTRACT_LEMMA_STRING);
		Structures.def_csetf($sym27$TEXTRACT_LEMMA_CANON, $sym28$_CSETF_TEXTRACT_LEMMA_CANON);
		Structures.def_csetf($sym29$TEXTRACT_LEMMA_TYPE, $sym30$_CSETF_TEXTRACT_LEMMA_TYPE);
		Equality.identity($sym10$TEXTRACT_LEMMA);
		Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_textract_lemma$.getGlobalValue(), Symbols.symbol_function($sym42$VISIT_DEFSTRUCT_OBJECT_TEXTRACT_LEMMA_METHOD));
		classes.subloop_new_class($sym50$LEX_ENTRY, $sym51$OBJECT, NIL, NIL, $list52);
		classes.class_set_implements_slot_listeners($sym50$LEX_ENTRY, NIL);
		classes.subloop_note_class_initialization_function($sym50$LEX_ENTRY, $sym61$SUBLOOP_RESERVED_INITIALIZE_LEX_ENTRY_CLASS);
		classes.subloop_note_instance_initialization_function($sym50$LEX_ENTRY, $sym64$SUBLOOP_RESERVED_INITIALIZE_LEX_ENTRY_INSTANCE);
		subloop_reserved_initialize_lex_entry_class($sym50$LEX_ENTRY);
		methods.methods_incorporate_instance_method($sym65$INITIALIZE, $sym50$LEX_ENTRY, $list66, NIL, $list67);
		methods.subloop_register_instance_method($sym50$LEX_ENTRY, $sym65$INITIALIZE, $sym69$LEX_ENTRY_INITIALIZE_METHOD);
		methods.methods_incorporate_instance_method($sym70$GET, $sym50$LEX_ENTRY, $list71, $list72, $list73);
		methods.subloop_register_instance_method($sym50$LEX_ENTRY, $sym70$GET, $sym76$LEX_ENTRY_GET_METHOD);
		methods.methods_incorporate_instance_method($sym80$SET, $sym50$LEX_ENTRY, $list71, $list81, $list82);
		methods.subloop_register_instance_method($sym50$LEX_ENTRY, $sym80$SET, $sym85$LEX_ENTRY_SET_METHOD);
		methods.methods_incorporate_instance_method($sym86$COPY, $sym50$LEX_ENTRY, $list71, NIL, $list87);
		methods.subloop_register_instance_method($sym50$LEX_ENTRY, $sym86$COPY, $sym89$LEX_ENTRY_COPY_METHOD);
		methods.methods_incorporate_instance_method($sym90$NOUN_, $sym50$LEX_ENTRY, $list91, $list92, $list93);
		methods.subloop_register_instance_method($sym50$LEX_ENTRY, $sym90$NOUN_, $sym97$LEX_ENTRY_NOUN__METHOD);
		methods.methods_incorporate_instance_method($sym98$PRINT, $sym50$LEX_ENTRY, $list71, $list99, $list100);
		methods.subloop_register_instance_method($sym50$LEX_ENTRY, $sym98$PRINT, $sym104$LEX_ENTRY_PRINT_METHOD);
		methods.methods_incorporate_instance_method($sym109$NOMINAL_P, $sym50$LEX_ENTRY, $list66, NIL, $list110);
		methods.subloop_register_instance_method($sym50$LEX_ENTRY, $sym109$NOMINAL_P, $sym112$LEX_ENTRY_NOMINAL_P_METHOD);
		methods.methods_incorporate_instance_method($sym113$VERBAL_P, $sym50$LEX_ENTRY, $list66, NIL, $list114);
		methods.subloop_register_instance_method($sym50$LEX_ENTRY, $sym113$VERBAL_P, $sym115$LEX_ENTRY_VERBAL_P_METHOD);
		methods.methods_incorporate_instance_method($sym116$ADJECTIVAL_P, $sym50$LEX_ENTRY, $list66, NIL, $list117);
		methods.subloop_register_instance_method($sym50$LEX_ENTRY, $sym116$ADJECTIVAL_P, $sym118$LEX_ENTRY_ADJECTIVAL_P_METHOD);
		methods.methods_incorporate_instance_method($sym119$ADVERBIAL_P, $sym50$LEX_ENTRY, $list66, NIL, $list120);
		methods.subloop_register_instance_method($sym50$LEX_ENTRY, $sym119$ADVERBIAL_P, $sym121$LEX_ENTRY_ADVERBIAL_P_METHOD);
		methods.methods_incorporate_instance_method($sym122$COMPUTE_TERM, $sym50$LEX_ENTRY, $list66, NIL, $list123);
		methods.subloop_register_instance_method($sym50$LEX_ENTRY, $sym122$COMPUTE_TERM, $sym130$LEX_ENTRY_COMPUTE_TERM_METHOD);
		methods.methods_incorporate_instance_method($sym131$COMPUTE_GENDER, $sym50$LEX_ENTRY, $list66, NIL, $list132);
		methods.subloop_register_instance_method($sym50$LEX_ENTRY, $sym131$COMPUTE_GENDER, $sym144$LEX_ENTRY_COMPUTE_GENDER_METHOD);
		methods.methods_incorporate_instance_method($sym145$COMPUTE_PENN_TAGS, $sym50$LEX_ENTRY, $list66, NIL, $list146);
		methods.subloop_register_instance_method($sym50$LEX_ENTRY, $sym145$COMPUTE_PENN_TAGS, $sym151$LEX_ENTRY_COMPUTE_PENN_TAGS_METHOD);
		methods.methods_incorporate_instance_method($sym152$COMPUTE_BACKOFF_PENN_TAGS, $sym50$LEX_ENTRY, $list66, NIL, $list153);
		methods.subloop_register_instance_method($sym50$LEX_ENTRY, $sym152$COMPUTE_BACKOFF_PENN_TAGS, $sym154$LEX_ENTRY_COMPUTE_BACKOFF_PENN_TAGS_METHOD);
		methods.methods_incorporate_instance_method($sym156$COMPUTE_SUPER_TAGS, $sym50$LEX_ENTRY, $list66, NIL, $list157);
		methods.subloop_register_instance_method($sym50$LEX_ENTRY, $sym156$COMPUTE_SUPER_TAGS, $sym159$LEX_ENTRY_COMPUTE_SUPER_TAGS_METHOD);
		methods.methods_incorporate_instance_method($sym160$COMPUTE_CYC_POS, $sym50$LEX_ENTRY, $list66, NIL, $list161);
		methods.subloop_register_instance_method($sym50$LEX_ENTRY, $sym160$COMPUTE_CYC_POS, $sym162$LEX_ENTRY_COMPUTE_CYC_POS_METHOD);
		methods.methods_incorporate_instance_method($sym163$COMPUTE_IS_NER_ENTRY, $sym50$LEX_ENTRY, $list66, NIL, $list164);
		methods.subloop_register_instance_method($sym50$LEX_ENTRY, $sym163$COMPUTE_IS_NER_ENTRY, $sym165$LEX_ENTRY_COMPUTE_IS_NER_ENTRY_METHOD);
		methods.methods_incorporate_instance_method($sym166$COMPUTE_CYC_CATEGORY, $sym50$LEX_ENTRY, $list66, NIL, $list167);
		methods.subloop_register_instance_method($sym50$LEX_ENTRY, $sym166$COMPUTE_CYC_CATEGORY, $sym170$LEX_ENTRY_COMPUTE_CYC_CATEGORY_METHOD);
		methods.methods_incorporate_instance_method($sym171$COMPUTE_INFLECTIONS, $sym50$LEX_ENTRY, $list66, NIL, $list172);
		methods.subloop_register_instance_method($sym50$LEX_ENTRY, $sym171$COMPUTE_INFLECTIONS, $sym173$LEX_ENTRY_COMPUTE_INFLECTIONS_METHOD);
		classes.subloop_new_class($sym174$ABSTRACT_LEXICON, $sym51$OBJECT, NIL, T, $list175);
		classes.class_set_implements_slot_listeners($sym174$ABSTRACT_LEXICON, NIL);
		classes.subloop_note_class_initialization_function($sym174$ABSTRACT_LEXICON, $sym198$SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_LEXICON_CLASS);
		classes.subloop_note_instance_initialization_function($sym174$ABSTRACT_LEXICON, $sym200$SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_LEXICON_INSTANCE);
		subloop_reserved_initialize_abstract_lexicon_class($sym174$ABSTRACT_LEXICON);
		methods.methods_incorporate_instance_method($sym65$INITIALIZE, $sym174$ABSTRACT_LEXICON, $list66, NIL, $list201);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym65$INITIALIZE, $sym207$ABSTRACT_LEXICON_INITIALIZE_METHOD);
		methods.methods_incorporate_instance_method($sym208$ISOLATE, $sym174$ABSTRACT_LEXICON, $list66, NIL, $list209);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym208$ISOLATE, $sym211$ABSTRACT_LEXICON_ISOLATE_METHOD);
		methods.methods_incorporate_instance_method($sym212$IGNORE_CACHE, $sym174$ABSTRACT_LEXICON, $list71, NIL, $list213);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym212$IGNORE_CACHE, $sym215$ABSTRACT_LEXICON_IGNORE_CACHE_METHOD);
		methods.methods_incorporate_instance_method($sym182$IGNORE_CACHE_, $sym174$ABSTRACT_LEXICON, $list66, NIL, $list216);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym182$IGNORE_CACHE_, $sym218$ABSTRACT_LEXICON_IGNORE_CACHE__METHOD);
		methods.methods_incorporate_instance_method($sym177$ALLOW_STEMMING, $sym174$ABSTRACT_LEXICON, $list66, NIL, $list219);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym177$ALLOW_STEMMING, $sym221$ABSTRACT_LEXICON_ALLOW_STEMMING_METHOD);
		methods.methods_incorporate_instance_method($sym222$FORBID_STEMMING, $sym174$ABSTRACT_LEXICON, $list66, NIL, $list223);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym222$FORBID_STEMMING, $sym225$ABSTRACT_LEXICON_FORBID_STEMMING_METHOD);
		methods.methods_incorporate_instance_method($sym226$ALLOW_FABRICATION, $sym174$ABSTRACT_LEXICON, $list66, NIL, $list227);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym226$ALLOW_FABRICATION, $sym229$ABSTRACT_LEXICON_ALLOW_FABRICATION_METHOD);
		methods.methods_incorporate_instance_method($sym230$FORBID_FABRICATION, $sym174$ABSTRACT_LEXICON, $list66, NIL, $list231);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym230$FORBID_FABRICATION, $sym233$ABSTRACT_LEXICON_FORBID_FABRICATION_METHOD);
		methods.methods_incorporate_instance_method($sym234$FABRICATION_FORBIDDEN_, $sym174$ABSTRACT_LEXICON, $list66, NIL, $list235);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym234$FABRICATION_FORBIDDEN_, $sym237$ABSTRACT_LEXICON_FABRICATION_FORBIDDEN__METHOD);
		methods.methods_incorporate_instance_method($sym238$FABRICATION_ALLOWED_, $sym174$ABSTRACT_LEXICON, $list66, NIL, $list239);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym238$FABRICATION_ALLOWED_, $sym241$ABSTRACT_LEXICON_FABRICATION_ALLOWED__METHOD);
		methods.methods_incorporate_instance_method($sym242$VALID_NL_TRIE_ENTRY_, $sym174$ABSTRACT_LEXICON, $list243, $list244, $list245);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym242$VALID_NL_TRIE_ENTRY_, $sym252$ABSTRACT_LEXICON_VALID_NL_TRIE_ENTRY__METHOD);
		methods.methods_incorporate_instance_method($sym253$SET_CASE_SENSITIVITY, $sym174$ABSTRACT_LEXICON, $list66, $list254, $list255);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym253$SET_CASE_SENSITIVITY, $sym257$ABSTRACT_LEXICON_SET_CASE_SENSITIVITY_METHOD);
		methods.methods_incorporate_instance_method($sym258$GET_CASE_SENSITIVITY, $sym174$ABSTRACT_LEXICON, $list66, NIL, $list259);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym258$GET_CASE_SENSITIVITY, $sym261$ABSTRACT_LEXICON_GET_CASE_SENSITIVITY_METHOD);
		methods.methods_incorporate_instance_method($sym205$INITIALIZE_EXCLUDED_PREDS, $sym174$ABSTRACT_LEXICON, $list66, $list262, $list263);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym205$INITIALIZE_EXCLUDED_PREDS, $sym266$ABSTRACT_LEXICON_INITIALIZE_EXCLUDED_PREDS_METHOD);
		methods.methods_incorporate_instance_method($sym267$ALLOW_PREDICATE, $sym174$ABSTRACT_LEXICON, $list66, $list268, $list269);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym267$ALLOW_PREDICATE, $sym271$ABSTRACT_LEXICON_ALLOW_PREDICATE_METHOD);
		methods.methods_incorporate_instance_method($sym272$EXCLUDE_PREDICATE, $sym174$ABSTRACT_LEXICON, $list66, $list268, $list273);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym272$EXCLUDE_PREDICATE, $sym275$ABSTRACT_LEXICON_EXCLUDE_PREDICATE_METHOD);
		methods.methods_incorporate_instance_method($sym276$EXCLUDED_PREDICATE_, $sym174$ABSTRACT_LEXICON, $list66, $list268, $list277);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym276$EXCLUDED_PREDICATE_, $sym279$ABSTRACT_LEXICON_EXCLUDED_PREDICATE__METHOD);
		methods.methods_incorporate_instance_method($sym280$ALLOWED_PREDICATE_, $sym174$ABSTRACT_LEXICON, $list66, $list268, $list281);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym280$ALLOWED_PREDICATE_, $sym283$ABSTRACT_LEXICON_ALLOWED_PREDICATE__METHOD);
		methods.methods_incorporate_instance_method($sym249$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_, $sym174$ABSTRACT_LEXICON, $list66, $list244, $list284);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym249$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_, $sym286$ABSTRACT_LEXICON_NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE__METHOD);
		methods.methods_incorporate_instance_method($sym287$ALLOW_POS, $sym174$ABSTRACT_LEXICON, $list66, $list288, $list289);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym287$ALLOW_POS, $sym291$ABSTRACT_LEXICON_ALLOW_POS_METHOD);
		methods.methods_incorporate_instance_method($sym292$EXCLUDE_POS, $sym174$ABSTRACT_LEXICON, $list66, $list288, $list293);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym292$EXCLUDE_POS, $sym295$ABSTRACT_LEXICON_EXCLUDE_POS_METHOD);
		methods.methods_incorporate_instance_method($sym296$EXCLUDED_POS_, $sym174$ABSTRACT_LEXICON, $list66, $list288, $list297);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym296$EXCLUDED_POS_, $sym299$ABSTRACT_LEXICON_EXCLUDED_POS__METHOD);
		methods.methods_incorporate_instance_method($sym247$ALLOWED_POS_, $sym174$ABSTRACT_LEXICON, $list66, $list288, $list300);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym247$ALLOWED_POS_, $sym302$ABSTRACT_LEXICON_ALLOWED_POS__METHOD);
		methods.methods_incorporate_instance_method($sym251$NL_TRIE_ENTRY_HAS_ALLOWED_POS_, $sym174$ABSTRACT_LEXICON, $list66, $list244, $list303);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym251$NL_TRIE_ENTRY_HAS_ALLOWED_POS_, $sym305$ABSTRACT_LEXICON_NL_TRIE_ENTRY_HAS_ALLOWED_POS__METHOD);
		methods.methods_incorporate_instance_method($sym306$ADD_LEARNER, $sym174$ABSTRACT_LEXICON, $list71, $list307, $list308);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym306$ADD_LEARNER, $sym310$ABSTRACT_LEXICON_ADD_LEARNER_METHOD);
		methods.methods_incorporate_instance_method($sym311$REMOVE_LEARNER, $sym174$ABSTRACT_LEXICON, $list71, $list307, $list312);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym311$REMOVE_LEARNER, $sym314$ABSTRACT_LEXICON_REMOVE_LEARNER_METHOD);
		methods.methods_incorporate_instance_method($sym315$GET_LEARNERS, $sym174$ABSTRACT_LEXICON, $list71, NIL, $list316);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym315$GET_LEARNERS, $sym318$ABSTRACT_LEXICON_GET_LEARNERS_METHOD);
		methods.methods_incorporate_instance_method($sym319$SET_LEARNERS, $sym174$ABSTRACT_LEXICON, $list71, $list320, $list321);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym319$SET_LEARNERS, $sym323$ABSTRACT_LEXICON_SET_LEARNERS_METHOD);
		methods.methods_incorporate_instance_method($sym206$INITIALIZE_ALLOWED_MTS, $sym174$ABSTRACT_LEXICON, $list324, $list325, $list326);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym206$INITIALIZE_ALLOWED_MTS, $sym337$ABSTRACT_LEXICON_INITIALIZE_ALLOWED_MTS_METHOD);
		methods.methods_incorporate_instance_method($sym338$SET_BASE_MT, $sym174$ABSTRACT_LEXICON, $list71, $list339, $list340);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym338$SET_BASE_MT, $sym342$ABSTRACT_LEXICON_SET_BASE_MT_METHOD);
		methods.methods_incorporate_instance_method($sym343$GET_BASE_MT, $sym174$ABSTRACT_LEXICON, $list66, NIL, $list344);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym343$GET_BASE_MT, $sym346$ABSTRACT_LEXICON_GET_BASE_MT_METHOD);
		methods.methods_incorporate_instance_method($sym335$ALLOW_MT, $sym174$ABSTRACT_LEXICON, $list71, $list339, $list347);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym335$ALLOW_MT, $sym350$ABSTRACT_LEXICON_ALLOW_MT_METHOD);
		methods.methods_incorporate_instance_method($sym351$ALLOW_GENL_MTS, $sym174$ABSTRACT_LEXICON, $list71, $list339, $list352);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym351$ALLOW_GENL_MTS, $sym357$ABSTRACT_LEXICON_ALLOW_GENL_MTS_METHOD);
		methods.methods_incorporate_instance_method($sym336$FORBID_MT, $sym174$ABSTRACT_LEXICON, $list243, $list339, $list358);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym336$FORBID_MT, $sym359$ABSTRACT_LEXICON_FORBID_MT_METHOD);
		methods.methods_incorporate_instance_method($sym250$ALLOWED_MT_, $sym174$ABSTRACT_LEXICON, $list324, $list339, $list360);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym250$ALLOWED_MT_, $sym361$ABSTRACT_LEXICON_ALLOWED_MT__METHOD);
		methods.methods_incorporate_instance_method($sym187$ROOT_MT, $sym174$ABSTRACT_LEXICON, $list362, NIL, $list363);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym187$ROOT_MT, $sym364$ABSTRACT_LEXICON_ROOT_MT_METHOD);
		methods.methods_incorporate_instance_method($sym365$ADD_STOP_WORD, $sym174$ABSTRACT_LEXICON, $list66, $list366, $list367);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym365$ADD_STOP_WORD, $sym369$ABSTRACT_LEXICON_ADD_STOP_WORD_METHOD);
		methods.methods_incorporate_instance_method($sym246$STOP_WORD_P, $sym174$ABSTRACT_LEXICON, $list66, $list366, $list370);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym246$STOP_WORD_P, $sym372$ABSTRACT_LEXICON_STOP_WORD_P_METHOD);
		methods.methods_incorporate_instance_method($sym373$GET_STOP_WORDS, $sym174$ABSTRACT_LEXICON, $list66, NIL, $list374);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym373$GET_STOP_WORDS, $sym376$ABSTRACT_LEXICON_GET_STOP_WORDS_METHOD);
		methods.methods_incorporate_instance_method($sym86$COPY, $sym174$ABSTRACT_LEXICON, $list71, $list377, $list378);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym86$COPY, $sym384$ABSTRACT_LEXICON_COPY_METHOD);
		methods.methods_incorporate_instance_method($sym70$GET, $sym174$ABSTRACT_LEXICON, $list71, $list366, $list385);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym70$GET, $sym391$ABSTRACT_LEXICON_GET_METHOD);
		methods.methods_incorporate_instance_method($sym393$DELETE, $sym174$ABSTRACT_LEXICON, $list71, $list366, $list394);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym393$DELETE, $sym396$ABSTRACT_LEXICON_DELETE_METHOD);
		methods.methods_incorporate_instance_method($sym397$DELETE_ENTRY_FROM_STRING, $sym174$ABSTRACT_LEXICON, $list71, $list398, $list399);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym397$DELETE_ENTRY_FROM_STRING, $sym402$ABSTRACT_LEXICON_DELETE_ENTRY_FROM_STRING_METHOD);
		methods.methods_incorporate_instance_method($sym404$ADD, $sym174$ABSTRACT_LEXICON, $list71, $list405, $list406);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym404$ADD, $sym408$ABSTRACT_LEXICON_ADD_METHOD);
		methods.methods_incorporate_instance_method($sym409$LEARNED_, $sym174$ABSTRACT_LEXICON, $list71, $list405, $list410);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym409$LEARNED_, $sym412$ABSTRACT_LEXICON_LEARNED__METHOD);
		methods.methods_incorporate_instance_method($sym413$FORGET, $sym174$ABSTRACT_LEXICON, $list71, NIL, $list414);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym413$FORGET, $sym416$ABSTRACT_LEXICON_FORGET_METHOD);
		methods.methods_incorporate_instance_method($sym417$PREFIXES, $sym174$ABSTRACT_LEXICON, $list71, $list418, $list419);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym417$PREFIXES, $sym422$ABSTRACT_LEXICON_PREFIXES_METHOD);
		methods.methods_incorporate_instance_method($sym423$PREFIXES_FROM_STRING, $sym174$ABSTRACT_LEXICON, $list71, $list366, $list424);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym423$PREFIXES_FROM_STRING, $sym426$ABSTRACT_LEXICON_PREFIXES_FROM_STRING_METHOD);
		methods.methods_incorporate_instance_method($sym429$PREFIX_KEYS, $sym174$ABSTRACT_LEXICON, $list71, $list418, $list430);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym429$PREFIX_KEYS, $sym432$ABSTRACT_LEXICON_PREFIX_KEYS_METHOD);
		methods.methods_incorporate_instance_method($sym433$PREFIX_KEYS_FROM_STRING, $sym174$ABSTRACT_LEXICON, $list71, $list366, $list434);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym433$PREFIX_KEYS_FROM_STRING, $sym436$ABSTRACT_LEXICON_PREFIX_KEYS_FROM_STRING_METHOD);
		methods.methods_incorporate_instance_method($sym437$LEARN, $sym174$ABSTRACT_LEXICON, $list71, $list438, $list439);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym437$LEARN, $sym441$ABSTRACT_LEXICON_LEARN_METHOD);
		methods.methods_incorporate_instance_method($sym442$NUMBER_LEARN, $sym174$ABSTRACT_LEXICON, $list66, $list443, $list444);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym442$NUMBER_LEARN, $sym445$ABSTRACT_LEXICON_NUMBER_LEARN_METHOD);
		memoization_state.note_globally_cached_function($sym452$SCALAR_FUNCTION_);
		methods.methods_incorporate_instance_method($sym455$NOUN_COMPOUND_LEARN, $sym174$ABSTRACT_LEXICON, $list66, $list443, $list456);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym455$NOUN_COMPOUND_LEARN, $sym457$ABSTRACT_LEXICON_NOUN_COMPOUND_LEARN_METHOD);
		methods.methods_incorporate_instance_method($sym470$COOCCURRENCE_STATISTICS_LEARN, $sym174$ABSTRACT_LEXICON, $list66, $list443, $list456);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym470$COOCCURRENCE_STATISTICS_LEARN, $sym471$ABSTRACT_LEXICON_COOCCURRENCE_STATISTICS_LEARN_METHOD);
		methods.methods_incorporate_instance_method($sym472$LEXIFY_DOCUMENT, $sym174$ABSTRACT_LEXICON, $list71, $list473, $list474);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym472$LEXIFY_DOCUMENT, $sym478$ABSTRACT_LEXICON_LEXIFY_DOCUMENT_METHOD);
		methods.methods_incorporate_instance_method($sym479$LEXIFY_DOCUMENT_EXHAUSTIVELY, $sym174$ABSTRACT_LEXICON, $list71, $list473, $list480);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym479$LEXIFY_DOCUMENT_EXHAUSTIVELY, $sym482$ABSTRACT_LEXICON_LEXIFY_DOCUMENT_EXHAUSTIVELY_METHOD);
		methods.methods_incorporate_instance_method($sym476$LEXIFY_PARAGRAPH, $sym174$ABSTRACT_LEXICON, $list71, $list483, $list484);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym476$LEXIFY_PARAGRAPH, $sym487$ABSTRACT_LEXICON_LEXIFY_PARAGRAPH_METHOD);
		methods.methods_incorporate_instance_method($sym481$LEXIFY_PARAGRAPH_EXHAUSTIVELY, $sym174$ABSTRACT_LEXICON, $list71, $list483, $list488);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym481$LEXIFY_PARAGRAPH_EXHAUSTIVELY, $sym490$ABSTRACT_LEXICON_LEXIFY_PARAGRAPH_EXHAUSTIVELY_METHOD);
		methods.methods_incorporate_instance_method($sym486$LEXIFY_SENTENCE, $sym174$ABSTRACT_LEXICON, $list71, $list491, $list492);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym486$LEXIFY_SENTENCE, $sym496$ABSTRACT_LEXICON_LEXIFY_SENTENCE_METHOD);
		methods.methods_incorporate_instance_method($sym489$LEXIFY_SENTENCE_EXHAUSTIVELY, $sym174$ABSTRACT_LEXICON, $list71, $list491, $list497);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym489$LEXIFY_SENTENCE_EXHAUSTIVELY, $sym499$ABSTRACT_LEXICON_LEXIFY_SENTENCE_EXHAUSTIVELY_METHOD);
		methods.methods_incorporate_instance_method($sym514$LEXIFY_WORDS, $sym174$ABSTRACT_LEXICON, $list71, $list515, $list516);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym514$LEXIFY_WORDS, $sym519$ABSTRACT_LEXICON_LEXIFY_WORDS_METHOD);
		methods.methods_incorporate_instance_method($sym521$TOKENIZE, $sym174$ABSTRACT_LEXICON, $list71, $list366, $list522);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym521$TOKENIZE, $sym524$ABSTRACT_LEXICON_TOKENIZE_METHOD);
		methods.methods_incorporate_instance_method($sym534$ITERATOR, $sym174$ABSTRACT_LEXICON, $list71, NIL, $list535);
		methods.subloop_register_instance_method($sym174$ABSTRACT_LEXICON, $sym534$ITERATOR, $sym536$ABSTRACT_LEXICON_ITERATOR_METHOD);
		utilities_macros.register_cyc_api_function($sym538$NEW_LEXICON_FROM_KB_SPEC, $list539, $str540$_param_KB_SPEC__the_CycL_type_of_, $list541, $list542);
		memoization_state.note_globally_cached_function($sym546$PREDS_FOR_LEXICON_EXCLUSION);
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_abstract_lexicon_iterator_state$.getGlobalValue(), Symbols.symbol_function($sym562$ABSTRACT_LEXICON_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
		SubLSpecialOperatorDeclarations.proclaim($list563);
		Structures.def_csetf($sym564$ABSTRACT_LEXICON_ITERATOR_STATE_TRIE_ITERATOR, $sym565$_CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_TRIE_ITERATOR);
		Structures.def_csetf($sym566$ABSTRACT_LEXICON_ITERATOR_STATE_NEXT_ENTRIES, $sym567$_CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_NEXT_ENTRIES);
		Structures.def_csetf($sym568$ABSTRACT_LEXICON_ITERATOR_STATE_LEXICON, $sym569$_CSETF_ABSTRACT_LEXICON_ITERATOR_STATE_LEXICON);
		Equality.identity($sym555$ABSTRACT_LEXICON_ITERATOR_STATE);
		Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_abstract_lexicon_iterator_state$.getGlobalValue(), Symbols.symbol_function($sym574$VISIT_DEFSTRUCT_OBJECT_ABSTRACT_LEXICON_ITERATOR_STATE_METHOD));
		utilities_macros.note_funcall_helper_function($sym553$ABSTRACT_LEXICON_ITERATOR_STATE_DONE_P);
		utilities_macros.note_funcall_helper_function($sym554$ABSTRACT_LEXICON_ITERATOR_STATE_NEXT);
		generic_testing.define_test_case_table_int($sym589$SCALAR_INTERVAL_MEANINGS, ConsesLow.list(new SubLObject[] { $kw590$TEST, EQUALP, $kw591$OWNER, NIL, $kw592$CLASSES, NIL, $kw593$KB, $kw594$FULL, $kw595$WORKING_, T }), $list596);
		generic_testing.define_test_case_table_int($sym597$TEXT_NUMBERS, ConsesLow.list(new SubLObject[] { $kw590$TEST, EQUALP, $kw591$OWNER, NIL, $kw592$CLASSES, NIL, $kw593$KB, $kw594$FULL, $kw595$WORKING_, T }), $list598);
		generic_testing.define_test_case_table_int($sym602$NUMBER_MEANINGS, ConsesLow.list(new SubLObject[] { $kw590$TEST, $sym603$NUMBER_MEANINGS_RESULTS_EQUAL_, $kw591$OWNER, NIL, $kw592$CLASSES, NIL, $kw593$KB, $kw594$FULL, $kw595$WORKING_, T }), $list604);
		generic_testing.define_test_case_table_int($sym605$TOKENIZING_TEST_COVERING, ConsesLow.list(new SubLObject[] { $kw590$TEST, EQUALP, $kw591$OWNER, NIL, $kw592$CLASSES, NIL, $kw593$KB, $kw594$FULL, $kw595$WORKING_, T }), $list606);
		return NIL;
	}

	private static SubLObject _constant_175_initializer()
	{
		return ConsesLow.list(new SubLObject[] {
				ConsesLow.list(SubLObjectFactory.makeSymbol("DEFAULT-EXCLUDE-MTS"), SubLObjectFactory.makeKeyword("CLASS"), SubLObjectFactory.makeKeyword("PROTECTED"), SubLObjectFactory.makeKeyword("VALUE"),
						ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"),
								ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("WebSearchDataMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("CyclistsMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("RelationParaphraseMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("WordNetMappingMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("PornographyJargonMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("CommonEnglishMisspellingsMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("ComputereseLexicalMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("CyclishMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TemporaryLexicalAssertionsMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("EnglishWordSenseAssertions-HoldingMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TemporaryLexicalAssertions-WordNetImportMt")),
										constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("RedundantLexicalMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("PDATemplateTestMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("EnglishParaphraseMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("SupplementalDeterminerSemTransLexicalMt")) }))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("DEFAULT-EXCLUDE-PREDICATES"), SubLObjectFactory.makeKeyword("CLASS"), SubLObjectFactory.makeKeyword("PROTECTED"), SubLObjectFactory.makeKeyword("VALUE"), ConsesLow.list(SubLObjectFactory.makeSymbol("SET-ELEMENT-LIST"), SubLObjectFactory.makeSymbol("*SEMANTIC-PREDICATES-EXCLUDED-FROM-LEXICAL-LOOKUP*"))), ConsesLow.list(SubLObjectFactory.makeSymbol("DEFAULT-BASE-MT"), SubLObjectFactory.makeKeyword("CLASS"), SubLObjectFactory.makeKeyword("PROTECTED"), SubLObjectFactory.makeKeyword("VALUE"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AllGeneralEnglishValidatedLexicalMicrotheoryPSC"))), ConsesLow.list(SubLObjectFactory.makeSymbol("DEFAULT-KB-SPEC"), SubLObjectFactory.makeKeyword("CLASS"), SubLObjectFactory.makeKeyword("PROTECTED"), SubLObjectFactory.makeKeyword("VALUE"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AbstractLexiconSpecification"))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("ALLOWED-MTS"), SubLObjectFactory.makeKeyword("INSTANCE"), SubLObjectFactory.makeKeyword("PROTECTED"), SubLObjectFactory.makeKeyword("VALUE"), SubLObjectFactory.makeKeyword("UNINITIALIZED")), ConsesLow.list(SubLObjectFactory.makeSymbol("EXCLUDED-MTS"), SubLObjectFactory.makeKeyword("INSTANCE"), SubLObjectFactory.makeKeyword("PROTECTED"), SubLObjectFactory.makeKeyword("VALUE"), SubLObjectFactory.makeKeyword("UNINITIALIZED")), ConsesLow.list(SubLObjectFactory.makeSymbol("BASE-MT"), SubLObjectFactory.makeKeyword("INSTANCE"), SubLObjectFactory.makeKeyword("PROTECTED"), SubLObjectFactory.makeKeyword("VALUE"), SubLObjectFactory.makeKeyword("UNINITIALIZED")), ConsesLow.list(SubLObjectFactory.makeSymbol("ROOT-MT"), SubLObjectFactory.makeKeyword("INSTANCE"), SubLObjectFactory.makeKeyword("PROTECTED"), SubLObjectFactory.makeKeyword("VALUE"), SubLObjectFactory.makeKeyword("UNINITIALIZED")), ConsesLow.list(SubLObjectFactory.makeSymbol("EXCLUDED-PREDS"), SubLObjectFactory.makeKeyword("INSTANCE"), SubLObjectFactory.makeKeyword("PROTECTED"), SubLObjectFactory.makeKeyword("VALUE"), SubLObjectFactory.makeKeyword("UNINITIALIZED")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST"), SubLObjectFactory.makeKeyword("INSTANCE"), SubLObjectFactory.makeKeyword("PROTECTED"), SubLObjectFactory.makeKeyword("VALUE"), NIL), ConsesLow.list(SubLObjectFactory.makeSymbol("TRIE"), SubLObjectFactory.makeKeyword("INSTANCE"), SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list(SubLObjectFactory.makeSymbol("CACHE"), SubLObjectFactory.makeKeyword("INSTANCE"), SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list(SubLObjectFactory.makeSymbol("IGNORE-CACHE?"), SubLObjectFactory.makeKeyword("INSTANCE"), SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list(SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"), SubLObjectFactory.makeKeyword("INSTANCE"), SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list(SubLObjectFactory.makeSymbol("ALLOW-FABRICATION?"), SubLObjectFactory.makeKeyword("INSTANCE"), SubLObjectFactory.makeKeyword("PROTECTED"), SubLObjectFactory.makeKeyword("VALUE"), T), ConsesLow.list(SubLObjectFactory.makeSymbol("LEARNED"), SubLObjectFactory.makeKeyword("INSTANCE"), SubLObjectFactory.makeKeyword("PROTECTED")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS"), SubLObjectFactory.makeKeyword("INSTANCE"), SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list(SubLObjectFactory.makeSymbol("ALLOW-STEMMING"), SubLObjectFactory.makeKeyword("INSTANCE"), SubLObjectFactory.makeKeyword("PROTECTED"), SubLObjectFactory.makeKeyword("VALUE"), T), ConsesLow.list(SubLObjectFactory.makeSymbol("STOP-WORDS"), SubLObjectFactory.makeKeyword("INSTANCE"), SubLObjectFactory.makeKeyword("PROTECTED"), SubLObjectFactory.makeKeyword("VALUE"), NIL), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), SubLObjectFactory.makeSymbol("RESPORATOR-CYC-POS"), ConsesLow.list(SubLObjectFactory.makeSymbol("TYPE.STRING")), SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), SubLObjectFactory.makeSymbol("RESPORATOR-TO-INFLECTIONS"), ConsesLow.list(SubLObjectFactory.makeSymbol("TYPE.STRING")), SubLObjectFactory.makeKeyword("PROTECTED")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("RESPORATOR-TO-CYCL"), ConsesLow.list(SubLObjectFactory.makeSymbol("TYPE.STRING")), SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("VALID-NL-TRIE-ENTRY?"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("COPY"), ConsesLow.list(SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("TARGET")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("GET"), ConsesLow.list(SubLObjectFactory.makeSymbol("STRING")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("DELETE"), ConsesLow.list(SubLObjectFactory.makeSymbol("STRING")), SubLObjectFactory.makeKeyword("PUBLIC")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("ADD"), ConsesLow.list(SubLObjectFactory.makeSymbol("LEX-ENTRY")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("FORGET"), NIL, SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("PREFIXES"), ConsesLow.list(SubLObjectFactory.makeSymbol("STRINGS")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("PREFIXES-FROM-STRING"), ConsesLow.list(SubLObjectFactory.makeSymbol("STRING")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("LEXIFY-DOCUMENT"), ConsesLow.list(SubLObjectFactory.makeSymbol("DOCUMENT")), SubLObjectFactory.makeKeyword("PUBLIC")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("LEXIFY-PARAGRAPH"), ConsesLow.list(SubLObjectFactory.makeSymbol("PARAGRAPH")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("LEXIFY-SENTENCE"), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("TOKENIZE"), ConsesLow.list(SubLObjectFactory.makeSymbol("STRING")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("LEXIFY-WORDS"), ConsesLow.list(SubLObjectFactory.makeSymbol("WORDS")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("ITERATOR"), NIL, SubLObjectFactory.makeKeyword("PUBLIC")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("INITIALIZE-ALLOWED-MTS"), ConsesLow.list(SubLObjectFactory.makeSymbol("KB-SPEC")), SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("SET-BASE-MT"), ConsesLow.list(SubLObjectFactory.makeSymbol("MT")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("GET-BASE-MT"), ConsesLow.list(SubLObjectFactory.makeSymbol("MT")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("ALLOW-MT"), ConsesLow.list(SubLObjectFactory.makeSymbol("MT")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("ALLOW-GENL-MTS"), ConsesLow.list(SubLObjectFactory.makeSymbol("MT")), SubLObjectFactory.makeKeyword("PUBLIC")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("FORBID-MT"), ConsesLow.list(SubLObjectFactory.makeSymbol("MT")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("INITIALIZE-EXCLUDED-PREDS"), ConsesLow.list(SubLObjectFactory.makeSymbol("PRED-LIST")), SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("ALLOW-PREDICATE"), ConsesLow.list(SubLObjectFactory.makeSymbol("PRED")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("EXCLUDE-PREDICATE"), ConsesLow.list(SubLObjectFactory.makeSymbol("PRED")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("ALLOW-POS"), ConsesLow.list(SubLObjectFactory.makeSymbol("POS")), SubLObjectFactory.makeKeyword("PUBLIC")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("EXCLUDE-POS"), ConsesLow.list(SubLObjectFactory.makeSymbol("POS")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("ADD-LEARNER"), ConsesLow.list(SubLObjectFactory.makeSymbol("LEARNER")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("REMOVE-LEARNER"), ConsesLow.list(SubLObjectFactory.makeSymbol("LEARNER")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("GET-LEARNERS"), NIL, SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("IGNORE-CACHE"), ConsesLow.list(SubLObjectFactory.makeSymbol("BOOLEAN")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("IGNORE-CACHE?"), NIL, SubLObjectFactory.makeKeyword("PUBLIC")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("ALLOW-STEMMING"), NIL, SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("SET-CASE-SENSITIVITY"), ConsesLow.list(SubLObjectFactory.makeSymbol("SENSITIVITY")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("GET-CASE-SENSITIVITY"), NIL, SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("FORBID-STEMMING"), NIL, SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("ALLOW-FABRICATION"), NIL, SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("FORBID-FABRICATION"), NIL, SubLObjectFactory.makeKeyword("PROTECTED")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("FABRICATION-FORBIDDEN?"), NIL, SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("FABRICATION-ALLOWED?"), NIL, SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES"), ConsesLow.list(SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("NOUN-COMPOUND-LEARN"), ConsesLow.list(SubLObjectFactory.makeSymbol("TEXT")), SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("COOCCURRENCE-STATISTICS-LEARN"), ConsesLow.list(SubLObjectFactory.makeSymbol("TEXT")), SubLObjectFactory.makeKeyword("PROTECTED")) });
	}

	@Override
	public void declareFunctions()
	{
		declare_abstract_lexicon_file();
	}

	@Override
	public void initializeVariables()
	{
		init_abstract_lexicon_file();
	}

	@Override
	public void runTopLevelForms()
	{
		setup_abstract_lexicon_file();
	}

	static
	{
		me = (SubLFile) new abstract_lexicon();
		$cyc_to_penn_list$ = null;
		$cyc_to_penn_map$ = null;
		$cyc_to_supertag_map$ = null;
		$cyc_to_supertag_list$ = null;
		$dtp_textract_lemma$ = null;
		$nominal_tags$ = null;
		$verbal_tags$ = null;
		$adjectival_tags$ = null;
		$adverbial_tags$ = null;
		$penn_tag_backoffs$ = null;
		$scalar_functionP_caching_state$ = null;
		$lexify_sentence_ignore_pos_for_multiword_tokens$ = null;
		$preds_for_lexicon_exclusion_caching_state$ = null;
		$dtp_abstract_lexicon_iterator_state$ = null;
		$list0 = ConsesLow.list(new SubLObject[] { ConsesLow.list(SubLObjectFactory.makeKeyword("."), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Punctuation-SP")), NIL), ConsesLow.list(SubLObjectFactory.makeKeyword("WP"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("WHPronoun")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("pronounStrings"))), ConsesLow.list(SubLObjectFactory.makeKeyword("``"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Punctuation-SP")), NIL), ConsesLow.list(SubLObjectFactory.makeKeyword("POS"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("PossessiveMarker")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("possessiveMarkerStrings"))), ConsesLow.list(SubLObjectFactory.makeKeyword("RB"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Adverb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("regularAdverb"))),
				ConsesLow.list(SubLObjectFactory.makeKeyword("JJ"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Adjective")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("regularDegree"))), ConsesLow.list(SubLObjectFactory.makeKeyword("''"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Punctuation-SP")), NIL), ConsesLow.list(SubLObjectFactory.makeKeyword("MD"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Modal")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("verbStrings"))), ConsesLow.list(SubLObjectFactory.makeKeyword("AUX"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AuxVerb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("verbStrings"))), ConsesLow.list(SubLObjectFactory.makeKeyword("VB"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("infinitive"))),
				ConsesLow.list(SubLObjectFactory.makeKeyword("DT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Determiner")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("determinerStrings"))), ConsesLow.list(SubLObjectFactory.makeKeyword("VBD"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("pastTense-Generic"))), ConsesLow.list(SubLObjectFactory.makeKeyword("NN"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Noun")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("nonPlural-Generic"))), ConsesLow.list(SubLObjectFactory.makeKeyword("NNS"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Noun")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("plural-Generic"))), ConsesLow.list(SubLObjectFactory.makeKeyword("VBG"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("presentParticiple"))),
				ConsesLow.list(SubLObjectFactory.makeKeyword("RP"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("VerbParticle")), NIL), ConsesLow.list(SubLObjectFactory.makeKeyword("TO"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("InfinitiveComp")), NIL), ConsesLow.list(SubLObjectFactory.makeKeyword("TO"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Preposition")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("prepositionStrings"))), ConsesLow.list(SubLObjectFactory.makeKeyword("CC"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("CoordinatingConjunction")), NIL), ConsesLow.list(SubLObjectFactory.makeKeyword("JJR"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Adjective")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("comparativeDegree"))), ConsesLow.list(SubLObjectFactory.makeKeyword("RBR"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Adverb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("comparativeAdverb"))),
				ConsesLow.list(SubLObjectFactory.makeKeyword("VBN"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("perfect"))), ConsesLow.list(SubLObjectFactory.makeKeyword("VBN"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("passiveParticiple"))), ConsesLow.list(SubLObjectFactory.makeKeyword("CD"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Number-SP")), NIL), ConsesLow.list(SubLObjectFactory.makeKeyword("JJS"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Adjective")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("superlativeDegree"))), ConsesLow.list(SubLObjectFactory.makeKeyword("RBS"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Adverb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("superlativeAdverb"))),
				ConsesLow.list(SubLObjectFactory.makeKeyword("PDT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Predeterminer")), NIL), ConsesLow.list(SubLObjectFactory.makeKeyword("VBP"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("nonThirdSg-Present"))), ConsesLow.list(SubLObjectFactory.makeKeyword("WRB"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("WHAdverb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("regularAdverb"))), ConsesLow.list(SubLObjectFactory.makeKeyword("WP$"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("WHPossessive")), NIL), ConsesLow.list(SubLObjectFactory.makeKeyword("NNP"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("ProperNoun")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("nonPlural-Generic"))),
				ConsesLow.list(SubLObjectFactory.makeKeyword("NNP"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("ProperNoun")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("nameSpelling"))), ConsesLow.list(SubLObjectFactory.makeKeyword("NNPS"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("ProperNoun")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("plural-Generic"))), ConsesLow.list(SubLObjectFactory.makeKeyword("WDT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("WHDeterminer")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("determinerStrings"))), ConsesLow.list(SubLObjectFactory.makeKeyword("PRP"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Pronoun")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("pronounStrings"))), ConsesLow.list(SubLObjectFactory.makeKeyword("VBZ"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("thirdPersonSg-Present"))),
				ConsesLow.list(SubLObjectFactory.makeKeyword("PRP$"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("PossessivePronoun")), NIL), ConsesLow.list(SubLObjectFactory.makeKeyword("IN"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Preposition")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("prepositionStrings"))), ConsesLow.list(SubLObjectFactory.makeKeyword("IN"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Complementizer")), NIL), ConsesLow.list(SubLObjectFactory.makeKeyword("IN"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("SubordinatingConjunction")), NIL), ConsesLow.list(SubLObjectFactory.makeKeyword("EX"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("There-Existential")), NIL), ConsesLow.list(SubLObjectFactory.makeKeyword("UH"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Interjection-SpeechPart")), NIL), ConsesLow.list(SubLObjectFactory.makeKeyword(":"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Punctuation-SP")), NIL),
				ConsesLow.list(SubLObjectFactory.makeKeyword("$"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Punctuation-SP")), NIL), ConsesLow.list(SubLObjectFactory.makeKeyword(","), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Punctuation-SP")), NIL), ConsesLow.list(SubLObjectFactory.makeKeyword(")"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Punctuation-SP")), NIL), ConsesLow.list(SubLObjectFactory.makeKeyword("("), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Punctuation-SP")), NIL) });
		$sym1$GENL_IN_ANY_MT_ = SubLObjectFactory.makeSymbol("GENL-IN-ANY-MT?");
		$sym2$SECOND = SubLObjectFactory.makeSymbol("SECOND");
		$int3$500 = SubLObjectFactory.makeInteger(500);
		$sym4$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
		$const5$EverythingPSC = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("EverythingPSC"));
		$const6$partOfSpeech = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("partOfSpeech"));
		$const7$GeneralLexiconMt = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("GeneralLexiconMt"));
		$list8 = ConsesLow.list(new SubLObject[] { ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("A_nx0V")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("IntransitiveVerbFrame")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("tensed"))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("A_nx0V")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("MiddleVoiceFrame")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("tensed"))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("A_nx0Vnx1")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TransitiveNPFrame")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("tensed"))),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("A_nx0Vnx1nx2"), SubLObjectFactory.makeString("A_nx0Vnx2nx1")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("DitransitiveNP-NPFrame")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("tensed"))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("A_nx0Vpnx1"), SubLObjectFactory.makeString("A_nx0Vpx1")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TransitivePPFrameType")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("tensed"))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("A_nx0Vnx1pnx2"), SubLObjectFactory.makeString("A_nx0Vnx1px2")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("DitransitivePPFrameType")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("tensed"))),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("A_nx0V")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("UnderstoodReciprocalObjectFrame")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("tensed"))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("A_Gnx0V")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("IntransitiveVerbFrame")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("presentParticiple"))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("A_Gnx0Vnx1")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TransitiveNPFrame")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("presentParticiple"))),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("A_Gnx0Vnx1nx2")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("DitransitiveNP-NPFrame")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("presentParticiple"))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("A_Gnx0Vpnx1"), SubLObjectFactory.makeString("A_Gnx0Vpx1")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TransitivePPFrameType")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("presentParticiple"))),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("A_Gnx0Vnx1pnx2"), SubLObjectFactory.makeString("A_Gnx0Vnx1px2"), SubLObjectFactory.makeString("B_Nn")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Verb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("DitransitivePPFrameType")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("presentParticiple"))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("B_Vvx")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AuxVerb"))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("A_NXN"), SubLObjectFactory.makeString("B_Nn")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Noun")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("RegularNounFrame")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("nounStrings"))),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("A_NXN")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Noun")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("GenitiveFrame")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("nounStrings"))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("B_nxPnx")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Preposition")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Post-NounPhraseModifyingFrame")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("prepositionStrings"))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("B_vxPnx")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Preposition")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("VerbPhraseModifyingFrame")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("prepositionStrings"))),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("B_Dnx")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Determiner"))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("B_An")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Adjective")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("RegularAdjFrame")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("adjStrings"))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("B_vxARB"), SubLObjectFactory.makeString("B_ARBvx"), SubLObjectFactory.makeString("B_ARBs")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Adverb")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("VerbPhraseModifyingFrame")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("adverbStrings"))) });
		$const9$GeneralEnglishMt = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("GeneralEnglishMt"));
		$sym10$TEXTRACT_LEMMA = SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA");
		$sym11$TEXTRACT_LEMMA_P = SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-P");
		$list12 = ConsesLow.list(SubLObjectFactory.makeSymbol("PARAGRAPH"), SubLObjectFactory.makeSymbol("SENTENCE"), SubLObjectFactory.makeSymbol("WORD"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("CANON"), SubLObjectFactory.makeSymbol("TYPE"));
		$list13 = ConsesLow.list(SubLObjectFactory.makeKeyword("PARAGRAPH"), SubLObjectFactory.makeKeyword("SENTENCE"), SubLObjectFactory.makeKeyword("WORD"), SubLObjectFactory.makeKeyword("STRING"), SubLObjectFactory.makeKeyword("CANON"), SubLObjectFactory.makeKeyword("TYPE"));
		$list14 = ConsesLow.list(SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-PARAGRAPH"), SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-SENTENCE"), SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-WORD"), SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-STRING"), SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-CANON"), SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-TYPE"));
		$list15 = ConsesLow.list(SubLObjectFactory.makeSymbol("_CSETF-TEXTRACT-LEMMA-PARAGRAPH"), SubLObjectFactory.makeSymbol("_CSETF-TEXTRACT-LEMMA-SENTENCE"), SubLObjectFactory.makeSymbol("_CSETF-TEXTRACT-LEMMA-WORD"), SubLObjectFactory.makeSymbol("_CSETF-TEXTRACT-LEMMA-STRING"), SubLObjectFactory.makeSymbol("_CSETF-TEXTRACT-LEMMA-CANON"), SubLObjectFactory.makeSymbol("_CSETF-TEXTRACT-LEMMA-TYPE"));
		$sym16$TEXTRACT_LEMMA_PRINT = SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-PRINT");
		$sym17$TEXTRACT_LEMMA_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-PRINT-FUNCTION-TRAMPOLINE");
		$list18 = ConsesLow.list(SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), SubLObjectFactory.makeSymbol("TEXTRACT-LEMMA-P"));
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
		$list45 = ConsesLow.list(Characters.CHAR_lparen, Characters.CHAR_lbracket);
		$list46 = ConsesLow.list(Characters.CHAR_lbracket, Characters.CHAR_rbracket);
		$str47$__TEXTRACT_LEMMA_ = SubLObjectFactory.makeString("#<TEXTRACT-LEMMA ");
		$str48$_ = SubLObjectFactory.makeString("/");
		$str49$_ = SubLObjectFactory.makeString(">");
		$sym50$LEX_ENTRY = SubLObjectFactory.makeSymbol("LEX-ENTRY");
		$sym51$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
		$list52 = ConsesLow.list(new SubLObject[] { ConsesLow.list(SubLObjectFactory.makeSymbol("STORED-PROPERTIES"), SubLObjectFactory.makeKeyword("CLASS"), SubLObjectFactory.makeKeyword("PROTECTED"), SubLObjectFactory.makeKeyword("VALUE"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("STRING"), SubLObjectFactory.makeKeyword("WORD-UNIT"), SubLObjectFactory.makeKeyword("INFLECTIONS"), SubLObjectFactory.makeKeyword("PREDICATE"), SubLObjectFactory.makeKeyword("DENOTS"), SubLObjectFactory.makeKeyword("DENOT"), SubLObjectFactory.makeKeyword("PRAGMATICS"), SubLObjectFactory.makeKeyword("MT"), SubLObjectFactory.makeKeyword("SEMTRANS"), SubLObjectFactory.makeKeyword("FRAME"), SubLObjectFactory.makeKeyword("TRIE-ENTRY") }))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("COMPUTED-PROPERTIES"), SubLObjectFactory.makeKeyword("CLASS"), SubLObjectFactory.makeKeyword("PROTECTED"), SubLObjectFactory.makeKeyword("VALUE"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(ConsesLow.cons(SubLObjectFactory.makeKeyword("PENN-TAGS"), SubLObjectFactory.makeSymbol("COMPUTE-PENN-TAGS")), ConsesLow.cons(SubLObjectFactory.makeKeyword("BACKOFF-PENN-TAGS"), SubLObjectFactory.makeSymbol("COMPUTE-BACKOFF-PENN-TAGS")), ConsesLow.cons(SubLObjectFactory.makeKeyword("TERM"), SubLObjectFactory.makeSymbol("COMPUTE-TERM")), ConsesLow.cons(SubLObjectFactory.makeKeyword("GENDER"), SubLObjectFactory.makeSymbol("COMPUTE-GENDER")), ConsesLow.cons(SubLObjectFactory.makeKeyword("SUPER-TAGS"), SubLObjectFactory.makeSymbol("COMPUTE-SUPER-TAGS")), ConsesLow.cons(SubLObjectFactory.makeKeyword("CYC-POS"), SubLObjectFactory.makeSymbol("COMPUTE-CYC-POS")), ConsesLow.cons(SubLObjectFactory.makeKeyword("CYC-CATEGORY"), SubLObjectFactory.makeSymbol("COMPUTE-CYC-CATEGORY")), ConsesLow.cons(SubLObjectFactory.makeKeyword("IS-NER-ENTRY?"), SubLObjectFactory.makeSymbol("COMPUTE-IS-NER-ENTRY"))))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("SUPPORTED-PROPERTIES"), SubLObjectFactory.makeKeyword("CLASS"), SubLObjectFactory.makeKeyword("PROTECTED"), SubLObjectFactory.makeKeyword("VALUE"), ConsesLow.list(SubLObjectFactory.makeSymbol("APPEND"), ConsesLow.list(SubLObjectFactory.makeSymbol("GET-SLOT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("LEX-ENTRY")), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("STORED-PROPERTIES"))), ConsesLow.list(SubLObjectFactory.makeSymbol("MAPCAR"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("CAR")), ConsesLow.list(SubLObjectFactory.makeSymbol("GET-SLOT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("LEX-ENTRY")), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("COMPUTED-PROPERTIES")))))), ConsesLow.list(SubLObjectFactory.makeSymbol("PROPERTIES"), SubLObjectFactory.makeKeyword("INSTANCE"), SubLObjectFactory.makeKeyword("PROTECTED")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("INITIALIZE"), NIL, SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("PRINT"), ConsesLow.list(SubLObjectFactory.makeSymbol("STREAM"), SubLObjectFactory.makeSymbol("DEPTH")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("COPY"), NIL, SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("GET"), ConsesLow.list(SubLObjectFactory.makeSymbol("PROPERTY")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("SET"), ConsesLow.list(SubLObjectFactory.makeSymbol("PROPERTY"), SubLObjectFactory.makeSymbol("VALUE")), SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("NOMINAL-P"), NIL, SubLObjectFactory.makeKeyword("PUBLIC")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("VERBAL-P"), NIL, SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("ADJECTIVAL-P"), NIL, SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("ADVERBIAL-P"), NIL, SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("COMPUTE-PENN-TAGS"), NIL, SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("COMPUTE-BACKOFF-PENN-TAGS"), NIL, SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("COMPUTE-SUPER-TAGS"), NIL, SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list(SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("NOUN?"), NIL, SubLObjectFactory.makeKeyword("PUBLIC")) });
		$sym53$PROPERTIES = SubLObjectFactory.makeSymbol("PROPERTIES");
		$sym54$SUPPORTED_PROPERTIES = SubLObjectFactory.makeSymbol("SUPPORTED-PROPERTIES");
		$sym55$COMPUTED_PROPERTIES = SubLObjectFactory.makeSymbol("COMPUTED-PROPERTIES");
		$sym56$STORED_PROPERTIES = SubLObjectFactory.makeSymbol("STORED-PROPERTIES");
		$sym57$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
		$list58 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("STRING"), SubLObjectFactory.makeKeyword("WORD-UNIT"), SubLObjectFactory.makeKeyword("INFLECTIONS"), SubLObjectFactory.makeKeyword("PREDICATE"), SubLObjectFactory.makeKeyword("DENOTS"), SubLObjectFactory.makeKeyword("DENOT"), SubLObjectFactory.makeKeyword("PRAGMATICS"), SubLObjectFactory.makeKeyword("MT"), SubLObjectFactory.makeKeyword("SEMTRANS"), SubLObjectFactory.makeKeyword("FRAME"), SubLObjectFactory.makeKeyword("TRIE-ENTRY") });
		$list59 = ConsesLow.list(ConsesLow.cons(SubLObjectFactory.makeKeyword("PENN-TAGS"), SubLObjectFactory.makeSymbol("COMPUTE-PENN-TAGS")), ConsesLow.cons(SubLObjectFactory.makeKeyword("BACKOFF-PENN-TAGS"), SubLObjectFactory.makeSymbol("COMPUTE-BACKOFF-PENN-TAGS")), ConsesLow.cons(SubLObjectFactory.makeKeyword("TERM"), SubLObjectFactory.makeSymbol("COMPUTE-TERM")), ConsesLow.cons(SubLObjectFactory.makeKeyword("GENDER"), SubLObjectFactory.makeSymbol("COMPUTE-GENDER")), ConsesLow.cons(SubLObjectFactory.makeKeyword("SUPER-TAGS"), SubLObjectFactory.makeSymbol("COMPUTE-SUPER-TAGS")), ConsesLow.cons(SubLObjectFactory.makeKeyword("CYC-POS"), SubLObjectFactory.makeSymbol("COMPUTE-CYC-POS")), ConsesLow.cons(SubLObjectFactory.makeKeyword("CYC-CATEGORY"), SubLObjectFactory.makeSymbol("COMPUTE-CYC-CATEGORY")), ConsesLow.cons(SubLObjectFactory.makeKeyword("IS-NER-ENTRY?"), SubLObjectFactory.makeSymbol("COMPUTE-IS-NER-ENTRY")));
		$sym60$CAR = SubLObjectFactory.makeSymbol("CAR");
		$sym61$SUBLOOP_RESERVED_INITIALIZE_LEX_ENTRY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEX-ENTRY-CLASS");
		$sym62$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
		$sym63$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
		$sym64$SUBLOOP_RESERVED_INITIALIZE_LEX_ENTRY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEX-ENTRY-INSTANCE");
		$sym65$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
		$list66 = ConsesLow.list(SubLObjectFactory.makeKeyword("PROTECTED"));
		$list67 = ConsesLow.list(SubLObjectFactory.makeString("@return lex-entry-p; a new empty lex-entry"), ConsesLow.list(SubLObjectFactory.makeSymbol("INITIALIZE"), SubLObjectFactory.makeSymbol("SUPER")), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("PROPERTIES"), NIL), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym68$OUTER_CATCH_FOR_LEX_ENTRY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LEX-ENTRY-METHOD");
		$sym69$LEX_ENTRY_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-INITIALIZE-METHOD");
		$sym70$GET = SubLObjectFactory.makeSymbol("GET");
		$list71 = ConsesLow.list(SubLObjectFactory.makeKeyword("PUBLIC"));
		$list72 = ConsesLow.list(SubLObjectFactory.makeSymbol("PROPERTY"));
		$list73 = ConsesLow.list(SubLObjectFactory.makeString("@return object; the property value associated with PROPERTY"), ConsesLow.list(SubLObjectFactory.makeSymbol("MUST"), ConsesLow.list(SubLObjectFactory.makeSymbol("MEMBER"), SubLObjectFactory.makeSymbol("PROPERTY"), ConsesLow.list(SubLObjectFactory.makeSymbol("GET-SLOT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("LEX-ENTRY")), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("SUPPORTED-PROPERTIES")))), SubLObjectFactory.makeString("Unsupported lexical property ~a"), SubLObjectFactory.makeSymbol("PROPERTY")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("VALUE"), ConsesLow.list(SubLObjectFactory.makeSymbol("CDR"), ConsesLow.list(SubLObjectFactory.makeSymbol("ASSOC"), SubLObjectFactory.makeSymbol("PROPERTY"), SubLObjectFactory.makeSymbol("PROPERTIES"))))), ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), SubLObjectFactory.makeSymbol("VALUE"), ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("PROPERTY-METHOD"), ConsesLow.list(SubLObjectFactory.makeSymbol("CDR"), ConsesLow.list(SubLObjectFactory.makeSymbol("ASSOC"), SubLObjectFactory.makeSymbol("PROPERTY"), ConsesLow.list(SubLObjectFactory.makeSymbol("GET-SLOT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("LEX-ENTRY")), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("COMPUTED-PROPERTIES"))))))),
						ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), SubLObjectFactory.makeSymbol("PROPERTY-METHOD"), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("VALUE"), ConsesLow.list(SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("SELF"), SubLObjectFactory.makeSymbol("PROPERTY-METHOD"))), ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), SubLObjectFactory.makeSymbol("VALUE"), ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSH"), ConsesLow.list(SubLObjectFactory.makeSymbol("CONS"), SubLObjectFactory.makeSymbol("PROPERTY"), SubLObjectFactory.makeSymbol("VALUE")), SubLObjectFactory.makeSymbol("PROPERTIES")))))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("VALUE"))));
		$sym74$OUTER_CATCH_FOR_LEX_ENTRY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LEX-ENTRY-METHOD");
		$str75$Unsupported_lexical_property__a = SubLObjectFactory.makeString("Unsupported lexical property ~a");
		$sym76$LEX_ENTRY_GET_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-GET-METHOD");
		$kw77$DENOT = SubLObjectFactory.makeKeyword("DENOT");
		$kw78$SEMTRANS = SubLObjectFactory.makeKeyword("SEMTRANS");
		$kw79$TRIE_ENTRY = SubLObjectFactory.makeKeyword("TRIE-ENTRY");
		$sym80$SET = SubLObjectFactory.makeSymbol("SET");
		$list81 = ConsesLow.list(SubLObjectFactory.makeSymbol("PROPERTY"), SubLObjectFactory.makeSymbol("VALUE"));
		$list82 = ConsesLow.list(SubLObjectFactory.makeString("Sets this lex-entry's PROPERTY to VALUE"), ConsesLow.list(SubLObjectFactory.makeSymbol("MUST"), ConsesLow.list(SubLObjectFactory.makeSymbol("MEMBER"), SubLObjectFactory.makeSymbol("PROPERTY"), ConsesLow.list(SubLObjectFactory.makeSymbol("GET-SLOT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("LEX-ENTRY")), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("SUPPORTED-PROPERTIES")))), SubLObjectFactory.makeString("Unsupported lexical property ~a"), SubLObjectFactory.makeSymbol("PROPERTY")), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("PROPERTIES"), ConsesLow.list(SubLObjectFactory.makeSymbol("REMOVE"), SubLObjectFactory.makeSymbol("PROPERTY"), SubLObjectFactory.makeSymbol("PROPERTIES"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), EQ), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("FIRST")))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSH"), ConsesLow.list(SubLObjectFactory.makeSymbol("CONS"), SubLObjectFactory.makeSymbol("PROPERTY"), SubLObjectFactory.makeSymbol("VALUE")), SubLObjectFactory.makeSymbol("PROPERTIES")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("VALUE")));
		$sym83$OUTER_CATCH_FOR_LEX_ENTRY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LEX-ENTRY-METHOD");
		$sym84$FIRST = SubLObjectFactory.makeSymbol("FIRST");
		$sym85$LEX_ENTRY_SET_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-SET-METHOD");
		$sym86$COPY = SubLObjectFactory.makeSymbol("COPY");
		$list87 = ConsesLow.list(SubLObjectFactory.makeString("make a deep-copy of self"),
				ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("NEW-ENTRY"), ConsesLow.list(SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("LEX-ENTRY")))), ConsesLow.list(SubLObjectFactory.makeSymbol("NEW-PROPERTIES"), NIL)),
						ConsesLow.list(SubLObjectFactory.makeSymbol("CDOLIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("KEY.VAL"), SubLObjectFactory.makeSymbol("PROPERTIES")), ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("NEW-KEY"), ConsesLow.list(SubLObjectFactory.makeSymbol("CAR"), SubLObjectFactory.makeSymbol("KEY.VAL"))), ConsesLow.list(SubLObjectFactory.makeSymbol("VAL"), ConsesLow.list(SubLObjectFactory.makeSymbol("CDR"), SubLObjectFactory.makeSymbol("KEY.VAL"))), ConsesLow.list(SubLObjectFactory.makeSymbol("NEW-VAL"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIF"), ConsesLow.list(SubLObjectFactory.makeSymbol("LISTP"), SubLObjectFactory.makeSymbol("VAL")), ConsesLow.list(SubLObjectFactory.makeSymbol("COPY-LIST"), SubLObjectFactory.makeSymbol("VAL")), SubLObjectFactory.makeSymbol("VAL")))), ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSH"), ConsesLow.list(SubLObjectFactory.makeSymbol("CONS"), SubLObjectFactory.makeSymbol("NEW-KEY"), SubLObjectFactory.makeSymbol("NEW-VAL")), SubLObjectFactory.makeSymbol("NEW-PROPERTIES")))),
						ConsesLow.list(SubLObjectFactory.makeSymbol("SET-SLOT"), SubLObjectFactory.makeSymbol("NEW-ENTRY"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("PROPERTIES")), SubLObjectFactory.makeSymbol("NEW-PROPERTIES")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("NEW-ENTRY"))));
		$sym88$OUTER_CATCH_FOR_LEX_ENTRY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LEX-ENTRY-METHOD");
		$sym89$LEX_ENTRY_COPY_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-COPY-METHOD");
		$sym90$NOUN_ = SubLObjectFactory.makeSymbol("NOUN?");
		$list91 = ConsesLow.list(SubLObjectFactory.makeKeyword("READ-ONLY"), SubLObjectFactory.makeKeyword("PUBLIC"));
		$list92 = ConsesLow.list(SubLObjectFactory.makeSymbol("&OPTIONAL"), ConsesLow.list(SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeKeyword("ANY")));
		$list93 = ConsesLow.list(SubLObjectFactory.makeString("@return booleanp; Does this LEX-ENTRY represent a noun?\n                     i.e. Is its :CYC-POS property value a spec of #$Noun?"), ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("POS"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET")), SubLObjectFactory.makeKeyword("CYC-POS")))), ConsesLow.list(SubLObjectFactory.makeSymbol("PIF"), ConsesLow.list(EQ, SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeKeyword("ANY")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("GENL-IN-ANY-MT?"), SubLObjectFactory.makeSymbol("POS"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Noun")))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("GENL?"), SubLObjectFactory.makeSymbol("POS"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Noun")), SubLObjectFactory.makeSymbol("MT"))))));
		$kw94$ANY = SubLObjectFactory.makeKeyword("ANY");
		$kw95$CYC_POS = SubLObjectFactory.makeKeyword("CYC-POS");
		$const96$Noun = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Noun"));
		$sym97$LEX_ENTRY_NOUN__METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-NOUN?-METHOD");
		$sym98$PRINT = SubLObjectFactory.makeSymbol("PRINT");
		$list99 = ConsesLow.list(SubLObjectFactory.makeSymbol("STREAM"), SubLObjectFactory.makeSymbol("DEPTH"));
		$list100 = ConsesLow.list(SubLObjectFactory.makeString("Prints this lex-entry to STREAM, ignoring DEPTH"), ConsesLow.list(SubLObjectFactory.makeSymbol("IGNORE"), SubLObjectFactory.makeSymbol("DEPTH")), ConsesLow.list(SubLObjectFactory.makeSymbol("WRITE-STRING"), SubLObjectFactory.makeString("#<LEX-ENTRY "), SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list(SubLObjectFactory.makeSymbol("TERPRI"), SubLObjectFactory.makeSymbol("STREAM")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("CDOLIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("PROPERTY"), SubLObjectFactory.makeSymbol("PROPERTIES")), ConsesLow.list(SubLObjectFactory.makeSymbol("PRIN1"), ConsesLow.list(SubLObjectFactory.makeSymbol("CAR"), SubLObjectFactory.makeSymbol("PROPERTY")), SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list(SubLObjectFactory.makeSymbol("WRITE-STRING"), SubLObjectFactory.makeString(" -> "), SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list(SubLObjectFactory.makeSymbol("PRIN1"), ConsesLow.list(SubLObjectFactory.makeSymbol("CDR"), SubLObjectFactory.makeSymbol("PROPERTY")), SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list(SubLObjectFactory.makeSymbol("TERPRI"), SubLObjectFactory.makeSymbol("STREAM"))), ConsesLow.list(SubLObjectFactory.makeSymbol("WRITE-STRING"), SubLObjectFactory.makeString(">"), SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list(SubLObjectFactory.makeSymbol("TERPRI"), SubLObjectFactory.makeSymbol("STREAM")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym101$OUTER_CATCH_FOR_LEX_ENTRY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LEX-ENTRY-METHOD");
		$str102$__LEX_ENTRY_ = SubLObjectFactory.makeString("#<LEX-ENTRY ");
		$str103$____ = SubLObjectFactory.makeString(" -> ");
		$sym104$LEX_ENTRY_PRINT_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-PRINT-METHOD");
		$list105 = ConsesLow.list(SubLObjectFactory.makeKeyword("NN"), SubLObjectFactory.makeKeyword("NNS"), SubLObjectFactory.makeKeyword("NNP"), SubLObjectFactory.makeKeyword("NNPS"), SubLObjectFactory.makeKeyword("WP"), SubLObjectFactory.makeKeyword("PP"), SubLObjectFactory.makeKeyword("PRP"), SubLObjectFactory.makeKeyword("FW"));
		$list106 = ConsesLow.list(SubLObjectFactory.makeKeyword("VBZ"), SubLObjectFactory.makeKeyword("VBN"), SubLObjectFactory.makeKeyword("VBD"), SubLObjectFactory.makeKeyword("VBP"), SubLObjectFactory.makeKeyword("VB"), SubLObjectFactory.makeKeyword("VBG"));
		$list107 = ConsesLow.list(SubLObjectFactory.makeKeyword("JJ"), SubLObjectFactory.makeKeyword("JJR"), SubLObjectFactory.makeKeyword("JJS"));
		$list108 = ConsesLow.list(SubLObjectFactory.makeKeyword("RB"), SubLObjectFactory.makeKeyword("RBR"), SubLObjectFactory.makeKeyword("RBS"), SubLObjectFactory.makeKeyword("WRB"));
		$sym109$NOMINAL_P = SubLObjectFactory.makeSymbol("NOMINAL-P");
		$list110 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("INTERSECTION"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET")), SubLObjectFactory.makeKeyword("PENN-TAGS")), SubLObjectFactory.makeSymbol("*NOMINAL-TAGS*"))));
		$kw111$PENN_TAGS = SubLObjectFactory.makeKeyword("PENN-TAGS");
		$sym112$LEX_ENTRY_NOMINAL_P_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-NOMINAL-P-METHOD");
		$sym113$VERBAL_P = SubLObjectFactory.makeSymbol("VERBAL-P");
		$list114 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("INTERSECTION"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET")), SubLObjectFactory.makeKeyword("PENN-TAGS")), SubLObjectFactory.makeSymbol("*VERBAL-TAGS*"))));
		$sym115$LEX_ENTRY_VERBAL_P_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-VERBAL-P-METHOD");
		$sym116$ADJECTIVAL_P = SubLObjectFactory.makeSymbol("ADJECTIVAL-P");
		$list117 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("INTERSECTION"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET")), SubLObjectFactory.makeKeyword("PENN-TAGS")), SubLObjectFactory.makeSymbol("*ADJECTIVAL-TAGS*"))));
		$sym118$LEX_ENTRY_ADJECTIVAL_P_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-ADJECTIVAL-P-METHOD");
		$sym119$ADVERBIAL_P = SubLObjectFactory.makeSymbol("ADVERBIAL-P");
		$list120 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("INTERSECTION"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET")), SubLObjectFactory.makeKeyword("PENN-TAGS")), SubLObjectFactory.makeSymbol("*ADVERBIAL-TAGS*"))));
		$sym121$LEX_ENTRY_ADVERBIAL_P_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-ADVERBIAL-P-METHOD");
		$sym122$COMPUTE_TERM = SubLObjectFactory.makeSymbol("COMPUTE-TERM");
		$list123 = ConsesLow.list(SubLObjectFactory.makeString("@return constantp; a single constant derived from this lex entry's\n    semantics"), ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), ConsesLow.list(SubLObjectFactory.makeSymbol("COR"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("NOMINAL-P"))), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("VERBAL-P")))), ConsesLow.list(SubLObjectFactory.makeSymbol("ERROR"), SubLObjectFactory.makeString("Invalid lexical property :term called on ~a"), SubLObjectFactory.makeSymbol("SELF"))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("TERM"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET")), SubLObjectFactory.makeKeyword("DENOT")))), ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), SubLObjectFactory.makeSymbol("TERM"), ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("SEMTRANS"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET")), SubLObjectFactory.makeKeyword("SEMTRANS")))),
						ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), SubLObjectFactory.makeSymbol("SEMTRANS"), ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("OPERATOR"), ConsesLow.list(SubLObjectFactory.makeSymbol("FORMULA-OPERATOR"), SubLObjectFactory.makeSymbol("SEMTRANS")))), ConsesLow.list(SubLObjectFactory.makeSymbol("PCOND"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("COR"), ConsesLow.list(EQL, SubLObjectFactory.makeSymbol("OPERATOR"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("equals"))), ConsesLow.list(EQL, SubLObjectFactory.makeSymbol("OPERATOR"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("isa"))), ConsesLow.list(EQL, SubLObjectFactory.makeSymbol("OPERATOR"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("genls")))), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("TERM"), ConsesLow.list(SubLObjectFactory.makeSymbol("FORMULA-ARG2"), SubLObjectFactory.makeSymbol("SEMTRANS")))),
								ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("COR"), ConsesLow.list(SubLObjectFactory.makeSymbol("LOGICAL-CONNECTIVE-P"), ConsesLow.list(SubLObjectFactory.makeSymbol("FORMULA-OPERATOR"), SubLObjectFactory.makeSymbol("SEMTRANS"))), ConsesLow.list(SubLObjectFactory.makeSymbol("QUANTIFIER-P"), ConsesLow.list(SubLObjectFactory.makeSymbol("FORMULA-OPERATOR"), SubLObjectFactory.makeSymbol("SEMTRANS")))),
										ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("CENTRAL-KEYWORD"), ConsesLow.list(SubLObjectFactory.makeSymbol("FCOND"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("NOMINAL-P"))), SubLObjectFactory.makeKeyword("NOUN")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("VERBAL-P"))), SubLObjectFactory.makeKeyword("ACTION"))))), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("TERM"), ConsesLow.list(SubLObjectFactory.makeSymbol("MAIN-COLLECTION"), SubLObjectFactory.makeSymbol("SEMTRANS"), SubLObjectFactory.makeSymbol("CENTRAL-KEYWORD"))))),
								ConsesLow.list(T, ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("TERM"), ConsesLow.list(SubLObjectFactory.makeSymbol("FORMULA-OPERATOR"), SubLObjectFactory.makeSymbol("SEMTRANS"))))))))),
						ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("TERM"))));
		$str124$Invalid_lexical_property__term_ca = SubLObjectFactory.makeString("Invalid lexical property :term called on ~a");
		$const125$equals = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("equals"));
		$const126$isa = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("isa"));
		$const127$genls = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("genls"));
		$kw128$NOUN = SubLObjectFactory.makeKeyword("NOUN");
		$kw129$ACTION = SubLObjectFactory.makeKeyword("ACTION");
		$sym130$LEX_ENTRY_COMPUTE_TERM_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-COMPUTE-TERM-METHOD");
		$sym131$COMPUTE_GENDER = SubLObjectFactory.makeSymbol("COMPUTE-GENDER");
		$list132 = ConsesLow.list(SubLObjectFactory.makeString("@return listp;  a list of genders of this lex entry with possible gender values \n   :FEMININE, :MASCULINE and :NEUTER"), ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("NOMINAL-P"))), ConsesLow.list(SubLObjectFactory.makeSymbol("ERROR"), SubLObjectFactory.makeString("Invalid lexical property :gender called on ~a"), SubLObjectFactory.makeSymbol("SELF"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(SubLObjectFactory.makeSymbol("GENDERS"), ConsesLow.list(SubLObjectFactory.makeSymbol("TERM"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET")), SubLObjectFactory.makeKeyword("TERM")))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("PIF"), ConsesLow.list(SubLObjectFactory.makeSymbol("MORE-SPECIFIC-P"), SubLObjectFactory.makeSymbol("TERM"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("MaleAnimal")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("EverythingPSC"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("GENDERS"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeKeyword("MASCULINE")))), ConsesLow.list(SubLObjectFactory.makeSymbol("PIF"), ConsesLow.list(SubLObjectFactory.makeSymbol("MORE-SPECIFIC-P"), SubLObjectFactory.makeSymbol("TERM"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("FemaleAnimal")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("EverythingPSC"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("GENDERS"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeKeyword("FEMININE")))), ConsesLow.list(SubLObjectFactory.makeSymbol("PIF"),
						ConsesLow.list(SubLObjectFactory.makeSymbol("MORE-SPECIFIC-P"), SubLObjectFactory.makeSymbol("TERM"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("EverythingPSC"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("GENDERS"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeKeyword("MASCULINE"), SubLObjectFactory.makeKeyword("FEMININE")))), ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), ConsesLow.list(SubLObjectFactory.makeSymbol("MORE-SPECIFIC-P"), SubLObjectFactory.makeSymbol("TERM"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("SentientAnimal")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("EverythingPSC"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("GENDERS"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeKeyword("MASCULINE"), SubLObjectFactory.makeKeyword("FEMININE"), SubLObjectFactory.makeKeyword("NEUTER")))))))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), SubLObjectFactory.makeSymbol("GENDERS"), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("GENDERS"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeKeyword("NEUTER"))))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("GENDERS"))));
		$str133$Invalid_lexical_property__gender_ = SubLObjectFactory.makeString("Invalid lexical property :gender called on ~a");
		$kw134$TERM = SubLObjectFactory.makeKeyword("TERM");
		$const135$MaleAnimal = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("MaleAnimal"));
		$list136 = ConsesLow.list(SubLObjectFactory.makeKeyword("MASCULINE"));
		$const137$FemaleAnimal = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("FemaleAnimal"));
		$list138 = ConsesLow.list(SubLObjectFactory.makeKeyword("FEMININE"));
		$const139$Person = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Person"));
		$list140 = ConsesLow.list(SubLObjectFactory.makeKeyword("MASCULINE"), SubLObjectFactory.makeKeyword("FEMININE"));
		$const141$SentientAnimal = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("SentientAnimal"));
		$list142 = ConsesLow.list(SubLObjectFactory.makeKeyword("MASCULINE"), SubLObjectFactory.makeKeyword("FEMININE"), SubLObjectFactory.makeKeyword("NEUTER"));
		$list143 = ConsesLow.list(SubLObjectFactory.makeKeyword("NEUTER"));
		$sym144$LEX_ENTRY_COMPUTE_GENDER_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-COMPUTE-GENDER-METHOD");
		$sym145$COMPUTE_PENN_TAGS = SubLObjectFactory.makeSymbol("COMPUTE-PENN-TAGS");
		$list146 = ConsesLow.list(SubLObjectFactory.makeString("@return listp; the Penn part-of-speech tags of this lex-entry"),
				ConsesLow.list(
						SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("POS"), ConsesLow.list(SubLObjectFactory.makeSymbol("GET"), SubLObjectFactory.makeSymbol("SELF"), SubLObjectFactory.makeKeyword("CYC-POS"))), ConsesLow.list(SubLObjectFactory.makeSymbol("INFLECTIONS"), ConsesLow.list(SubLObjectFactory.makeSymbol("GET"), SubLObjectFactory.makeSymbol("SELF"), SubLObjectFactory.makeKeyword("INFLECTIONS"))), ConsesLow.list(SubLObjectFactory.makeSymbol("STRING"), ConsesLow.list(SubLObjectFactory.makeSymbol("GET"), SubLObjectFactory.makeSymbol("SELF"), SubLObjectFactory.makeKeyword("STRING"))), ConsesLow.list(SubLObjectFactory.makeSymbol("PENN-TAGS"), NIL)), ConsesLow.list(SubLObjectFactory.makeSymbol("PCOND"),
								ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("CAND"), ConsesLow.list(EQL, SubLObjectFactory.makeSymbol("POS"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Preposition"))), ConsesLow.list(EQUALP, SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeString("to"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSH"), SubLObjectFactory.makeKeyword("TO"), SubLObjectFactory.makeSymbol("PENN-TAGS"))), ConsesLow.list(T, ConsesLow.list(SubLObjectFactory.makeSymbol("CDOLIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("INFLECTION"), SubLObjectFactory.makeSymbol("INFLECTIONS")), ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("PENN-TAG"), ConsesLow.list(SubLObjectFactory.makeSymbol("MAP-FROM-CYC-TO-PENN-POS"), SubLObjectFactory.makeSymbol("POS"), SubLObjectFactory.makeSymbol("INFLECTION")))), ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), SubLObjectFactory.makeSymbol("PENN-TAG"), ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSH"), SubLObjectFactory.makeSymbol("PENN-TAG"), SubLObjectFactory.makeSymbol("PENN-TAGS"))))))),
						ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("REMOVE-DUPLICATES"), SubLObjectFactory.makeSymbol("PENN-TAGS"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), EQ)))));
		$kw147$INFLECTIONS = SubLObjectFactory.makeKeyword("INFLECTIONS");
		$const148$Preposition = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Preposition"));
		$str149$to = SubLObjectFactory.makeString("to");
		$kw150$TO = SubLObjectFactory.makeKeyword("TO");
		$sym151$LEX_ENTRY_COMPUTE_PENN_TAGS_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-COMPUTE-PENN-TAGS-METHOD");
		$sym152$COMPUTE_BACKOFF_PENN_TAGS = SubLObjectFactory.makeSymbol("COMPUTE-BACKOFF-PENN-TAGS");
		$list153 = ConsesLow.list(SubLObjectFactory.makeString("@return listp; the Penn part-of-speech tags of this lex-entry, plus additional tags\n   that are easily confused with the accurate ones"),
				ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("PENN-TAGS"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET")), SubLObjectFactory.makeKeyword("PENN-TAGS")))), ConsesLow.list(SubLObjectFactory.makeSymbol("CDOLIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("TAG"), SubLObjectFactory.makeSymbol("PENN-TAGS")), ConsesLow.list(SubLObjectFactory.makeSymbol("CDOLIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("BACKOFF"), ConsesLow.list(SubLObjectFactory.makeSymbol("TAG-BACKOFFS"), SubLObjectFactory.makeSymbol("TAG"))), ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), ConsesLow.list(EQ, SubLObjectFactory.makeSymbol("BACKOFF"), SubLObjectFactory.makeSymbol("TAG")), ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSH"), SubLObjectFactory.makeSymbol("BACKOFF"), SubLObjectFactory.makeSymbol("PENN-TAGS"))))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("PENN-TAGS"))));
		$sym154$LEX_ENTRY_COMPUTE_BACKOFF_PENN_TAGS_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-COMPUTE-BACKOFF-PENN-TAGS-METHOD");
		$list155 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("NN"), SubLObjectFactory.makeKeyword("VBG")), ConsesLow.list(SubLObjectFactory.makeKeyword("JJ"), SubLObjectFactory.makeKeyword("VBN"), SubLObjectFactory.makeKeyword("VBD")), ConsesLow.list(SubLObjectFactory.makeKeyword("NNP"), SubLObjectFactory.makeKeyword("NNPS"), SubLObjectFactory.makeKeyword("NN"), SubLObjectFactory.makeKeyword("NNS"), SubLObjectFactory.makeKeyword("$"), SubLObjectFactory.makeKeyword("CD")));
		$sym156$COMPUTE_SUPER_TAGS = SubLObjectFactory.makeSymbol("COMPUTE-SUPER-TAGS");
		$list157 = ConsesLow.list(SubLObjectFactory.makeString("@return stringp; the super tag of this lex-entry"), ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("SUPERTAGS"), NIL)),
				ConsesLow.list(SubLObjectFactory.makeSymbol("CDOLIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("INFL"), ConsesLow.list(SubLObjectFactory.makeSymbol("GET"), SubLObjectFactory.makeSymbol("SELF"), SubLObjectFactory.makeKeyword("INFLECTIONS"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CDOLIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("SUPERTAG"), ConsesLow.list(SubLObjectFactory.makeSymbol("GETHASH"), ConsesLow.list(SubLObjectFactory.makeSymbol("LIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("GET"), SubLObjectFactory.makeSymbol("SELF"), SubLObjectFactory.makeKeyword("CYC-POS")), ConsesLow.list(SubLObjectFactory.makeSymbol("GET"), SubLObjectFactory.makeSymbol("SELF"), SubLObjectFactory.makeKeyword("FRAME")), SubLObjectFactory.makeSymbol("INFL")), SubLObjectFactory.makeSymbol("*CYC-TO-SUPERTAG-MAP*"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSHNEW"), SubLObjectFactory.makeSymbol("SUPERTAG"), SubLObjectFactory.makeSymbol("SUPERTAGS"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), EQUAL)))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SUPERTAGS"))));
		$kw158$FRAME = SubLObjectFactory.makeKeyword("FRAME");
		$sym159$LEX_ENTRY_COMPUTE_SUPER_TAGS_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-COMPUTE-SUPER-TAGS-METHOD");
		$sym160$COMPUTE_CYC_POS = SubLObjectFactory.makeSymbol("COMPUTE-CYC-POS");
		$list161 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("TRIE-ENTRY"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET")), SubLObjectFactory.makeKeyword("TRIE-ENTRY")))), ConsesLow.list(SubLObjectFactory.makeSymbol("PCOND"), ConsesLow.list(SubLObjectFactory.makeSymbol("TRIE-ENTRY"), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-POS"), SubLObjectFactory.makeSymbol("TRIE-ENTRY")))),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET")), SubLObjectFactory.makeKeyword("INFLECTIONS")), ConsesLow.list(SubLObjectFactory.makeSymbol("CDOLIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("PRED"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET")), SubLObjectFactory.makeKeyword("INFLECTIONS"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("POS"), ConsesLow.list(SubLObjectFactory.makeSymbol("POS-OF-PRED"), SubLObjectFactory.makeSymbol("PRED")))), ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), SubLObjectFactory.makeSymbol("POS"), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("POS"))))))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), NIL)));
		$sym162$LEX_ENTRY_COMPUTE_CYC_POS_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-COMPUTE-CYC-POS-METHOD");
		$sym163$COMPUTE_IS_NER_ENTRY = SubLObjectFactory.makeSymbol("COMPUTE-IS-NER-ENTRY");
		$list164 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("TRIE-ENTRY"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET")), SubLObjectFactory.makeKeyword("TRIE-ENTRY")))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("CNOT"), SubLObjectFactory.makeSymbol("TRIE-ENTRY")))));
		$sym165$LEX_ENTRY_COMPUTE_IS_NER_ENTRY_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-COMPUTE-IS-NER-ENTRY-METHOD");
		$sym166$COMPUTE_CYC_CATEGORY = SubLObjectFactory.makeSymbol("COMPUTE-CYC-CATEGORY");
		$list167 = ConsesLow.list(SubLObjectFactory.makeString("What is the syntactic category of this lexical entry.  Unlike cyc-pos, this does not assume that each \n   entry is a part-of-speech.  In some cases, the category may be a XP, not just an X0"), ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("PRED"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET")), SubLObjectFactory.makeKeyword("PREDICATE")))), ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), ConsesLow.list(SubLObjectFactory.makeSymbol("NAME-STRING-PRED?"), SubLObjectFactory.makeSymbol("PRED")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("NounPhrase")))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET")), SubLObjectFactory.makeKeyword("CYC-POS")))));
		$kw168$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
		$const169$NounPhrase = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("NounPhrase"));
		$sym170$LEX_ENTRY_COMPUTE_CYC_CATEGORY_METHOD = SubLObjectFactory.makeSymbol("LEX-ENTRY-COMPUTE-CYC-CATEGORY-METHOD");
		$sym171$COMPUTE_INFLECTIONS = SubLObjectFactory.makeSymbol("COMPUTE-INFLECTIONS");
		$list172 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("TRIE-ENTRY"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET")), SubLObjectFactory.makeKeyword("TRIE-ENTRY")))), ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), SubLObjectFactory.makeSymbol("TRIE-ENTRY"), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-POS-PREDS"), SubLObjectFactory.makeSymbol("TRIE-ENTRY")))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), NIL)));
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
		$list195 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("WebSearchDataMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("CyclistsMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("RelationParaphraseMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("WordNetMappingMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("PornographyJargonMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("CommonEnglishMisspellingsMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("ComputereseLexicalMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("CyclishMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TemporaryLexicalAssertionsMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("EnglishWordSenseAssertions-HoldingMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TemporaryLexicalAssertions-WordNetImportMt")),
				constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("RedundantLexicalMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("PDATemplateTestMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("EnglishParaphraseMt")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("SupplementalDeterminerSemTransLexicalMt")) });
		$const196$AllGeneralEnglishValidatedLexical = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AllGeneralEnglishValidatedLexicalMicrotheoryPSC"));
		$const197$AbstractLexiconSpecification = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AbstractLexiconSpecification"));
		$sym198$SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_LEXICON_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-LEXICON-CLASS");
		$kw199$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
		$sym200$SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_LEXICON_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-LEXICON-INSTANCE");
		$list201 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("@return lexicon-p; a newly created lexicon"), ConsesLow.list(SubLObjectFactory.makeSymbol("INITIALIZE"), SubLObjectFactory.makeSymbol("SUPER")), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("TRIE"), ConsesLow.list(SubLObjectFactory.makeSymbol("GET-NL-TRIE"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("CACHE"), ConsesLow.list(SubLObjectFactory.makeSymbol("NEW-CACHE"), SubLObjectFactory.makeInteger(2000), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), EQUAL))), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"), SubLObjectFactory.makeKeyword("ON")), ConsesLow.list(SubLObjectFactory.makeSymbol("ENSURE-CYC-TO-PENN-MAP")), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("INITIALIZE-EXCLUDED-PREDS"))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("INITIALIZE-ALLOWED-MTS"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("LEARNED"), NIL), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")) });
		$sym202$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$int203$2000 = SubLObjectFactory.makeInteger(2000);
		$kw204$ON = SubLObjectFactory.makeKeyword("ON");
		$sym205$INITIALIZE_EXCLUDED_PREDS = SubLObjectFactory.makeSymbol("INITIALIZE-EXCLUDED-PREDS");
		$sym206$INITIALIZE_ALLOWED_MTS = SubLObjectFactory.makeSymbol("INITIALIZE-ALLOWED-MTS");
		$sym207$ABSTRACT_LEXICON_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-INITIALIZE-METHOD");
		$sym208$ISOLATE = SubLObjectFactory.makeSymbol("ISOLATE");
		$list209 = ConsesLow.list(SubLObjectFactory.makeString("Finalizes this lexicon"), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("CACHE"), NIL), ConsesLow.list(SubLObjectFactory.makeSymbol("ISOLATE"), SubLObjectFactory.makeSymbol("SUPER")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym210$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym211$ABSTRACT_LEXICON_ISOLATE_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ISOLATE-METHOD");
		$sym212$IGNORE_CACHE = SubLObjectFactory.makeSymbol("IGNORE-CACHE");
		$list213 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("IGNORE-CACHE?"), T), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym214$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym215$ABSTRACT_LEXICON_IGNORE_CACHE_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-IGNORE-CACHE-METHOD");
		$list216 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("GET-SLOT"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("IGNORE-CACHE?")))));
		$sym217$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym218$ABSTRACT_LEXICON_IGNORE_CACHE__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-IGNORE-CACHE?-METHOD");
		$list219 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("ALLOW-STEMMING"), T), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym220$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym221$ABSTRACT_LEXICON_ALLOW_STEMMING_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ALLOW-STEMMING-METHOD");
		$sym222$FORBID_STEMMING = SubLObjectFactory.makeSymbol("FORBID-STEMMING");
		$list223 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("ALLOW-STEMMING"), NIL), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym224$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym225$ABSTRACT_LEXICON_FORBID_STEMMING_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-FORBID-STEMMING-METHOD");
		$sym226$ALLOW_FABRICATION = SubLObjectFactory.makeSymbol("ALLOW-FABRICATION");
		$list227 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("ALLOW-FABRICATION?"), T), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym228$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym229$ABSTRACT_LEXICON_ALLOW_FABRICATION_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ALLOW-FABRICATION-METHOD");
		$sym230$FORBID_FABRICATION = SubLObjectFactory.makeSymbol("FORBID-FABRICATION");
		$list231 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("ALLOW-FABRICATION?"), NIL), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym232$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym233$ABSTRACT_LEXICON_FORBID_FABRICATION_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-FORBID-FABRICATION-METHOD");
		$sym234$FABRICATION_FORBIDDEN_ = SubLObjectFactory.makeSymbol("FABRICATION-FORBIDDEN?");
		$list235 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("CNOT"), SubLObjectFactory.makeSymbol("ALLOW-FABRICATION?"))));
		$sym236$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym237$ABSTRACT_LEXICON_FABRICATION_FORBIDDEN__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-FABRICATION-FORBIDDEN?-METHOD");
		$sym238$FABRICATION_ALLOWED_ = SubLObjectFactory.makeSymbol("FABRICATION-ALLOWED?");
		$list239 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("ALLOW-FABRICATION?")));
		$sym240$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym241$ABSTRACT_LEXICON_FABRICATION_ALLOWED__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-FABRICATION-ALLOWED?-METHOD");
		$sym242$VALID_NL_TRIE_ENTRY_ = SubLObjectFactory.makeSymbol("VALID-NL-TRIE-ENTRY?");
		$list243 = ConsesLow.list(SubLObjectFactory.makeKeyword("AUTO-UPDATE"), SubLObjectFactory.makeKeyword("PUBLIC"));
		$list244 = ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"));
		$list245 = ConsesLow.list(SubLObjectFactory.makeString("Returns t if LEX-ENTRY is a contextually valid nl-trie-entry, nil otherwise\n   Lexicons derived from abstract-lexicon will typically override this method"), ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("STOP-WORD-P")), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-STRING"), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), NIL)),
				ConsesLow.list(SubLObjectFactory.makeSymbol("RET"),
						ConsesLow.list(SubLObjectFactory.makeSymbol("COR"), ConsesLow.list(SubLObjectFactory.makeSymbol("CAND"), ConsesLow.list(SubLObjectFactory.makeSymbol("LEX-ENTRY-P"), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("ALLOWED-POS?")), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET")), SubLObjectFactory.makeKeyword("CYC-POS")))),
								ConsesLow.list(SubLObjectFactory.makeSymbol("CAND"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-WORD-P"), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), ConsesLow.list(SubLObjectFactory.makeSymbol("MEMBER"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("nameSpelling")), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-WORD-POS-PREDS"), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), EQL)), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-HAS-ALLOWED-PREDICATE?")), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("ALLOWED-MT?")), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-SEMANTIC-MT"), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")))),
								ConsesLow.list(SubLObjectFactory.makeSymbol("CAND"), ConsesLow.list(SubLObjectFactory.makeSymbol("VALID-DENOTS?"), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-HAS-ALLOWED-PREDICATE?")), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-HAS-ALLOWED-POS?")), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("ALLOWED-MT?")), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-SEMANTIC-MT"), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")))))));
		$sym246$STOP_WORD_P = SubLObjectFactory.makeSymbol("STOP-WORD-P");
		$sym247$ALLOWED_POS_ = SubLObjectFactory.makeSymbol("ALLOWED-POS?");
		$const248$nameSpelling = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("nameSpelling"));
		$sym249$NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE_ = SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-HAS-ALLOWED-PREDICATE?");
		$sym250$ALLOWED_MT_ = SubLObjectFactory.makeSymbol("ALLOWED-MT?");
		$sym251$NL_TRIE_ENTRY_HAS_ALLOWED_POS_ = SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-HAS-ALLOWED-POS?");
		$sym252$ABSTRACT_LEXICON_VALID_NL_TRIE_ENTRY__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-VALID-NL-TRIE-ENTRY?-METHOD");
		$sym253$SET_CASE_SENSITIVITY = SubLObjectFactory.makeSymbol("SET-CASE-SENSITIVITY");
		$list254 = ConsesLow.list(SubLObjectFactory.makeSymbol("KEYWORD"));
		$list255 = ConsesLow.list(SubLObjectFactory.makeString("Used for setting case-sensitivity of this lexicon.  Acceptable values include :off, :on, :preferred"), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"), SubLObjectFactory.makeSymbol("KEYWORD")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym256$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym257$ABSTRACT_LEXICON_SET_CASE_SENSITIVITY_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-SET-CASE-SENSITIVITY-METHOD");
		$sym258$GET_CASE_SENSITIVITY = SubLObjectFactory.makeSymbol("GET-CASE-SENSITIVITY");
		$list259 = ConsesLow.list(SubLObjectFactory.makeString("Used for getting case-sensitivity of this lexicon.  Acceptable values include :off, :on, :preferred"), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("CASE-SENSITIVITY")));
		$sym260$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym261$ABSTRACT_LEXICON_GET_CASE_SENSITIVITY_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-GET-CASE-SENSITIVITY-METHOD");
		$list262 = ConsesLow.list(SubLObjectFactory.makeSymbol("&OPTIONAL"), ConsesLow.list(SubLObjectFactory.makeSymbol("PREDS-TO-EXCLUDE"), SubLObjectFactory.makeKeyword("DEFAULT")));
		$list263 = ConsesLow.list(SubLObjectFactory.makeString("exclude assertions using the predicates in PREDS-TO-EXCLUDE from use by this lexicon.\n   If PREDS-TO-EXCLUDE is :default, \n   all preds in the class variable DEFAULT-EXCLUDE-PREDS will be excluded"), ConsesLow.list(SubLObjectFactory.makeSymbol("PIF"), ConsesLow.list(EQ, SubLObjectFactory.makeSymbol("PREDS-TO-EXCLUDE"), SubLObjectFactory.makeKeyword("DEFAULT")), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("EXCLUDED-PREDS"), SubLObjectFactory.makeSymbol("DEFAULT-EXCLUDE-PREDICATES")), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("EXCLUDED-PREDS"), SubLObjectFactory.makeSymbol("PREDS-TO-EXCLUDE"))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$kw264$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
		$sym265$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym266$ABSTRACT_LEXICON_INITIALIZE_EXCLUDED_PREDS_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-INITIALIZE-EXCLUDED-PREDS-METHOD");
		$sym267$ALLOW_PREDICATE = SubLObjectFactory.makeSymbol("ALLOW-PREDICATE");
		$list268 = ConsesLow.list(SubLObjectFactory.makeSymbol("POS-PRED"));
		$list269 = ConsesLow.list(SubLObjectFactory.makeString("allow POS-PRED to be used by this lexicon for lexical lookup"), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("EXCLUDED-PREDS"), ConsesLow.list(SubLObjectFactory.makeSymbol("REMOVE"), SubLObjectFactory.makeSymbol("POS-PRED"), SubLObjectFactory.makeSymbol("EXCLUDED-PREDS"))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym270$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym271$ABSTRACT_LEXICON_ALLOW_PREDICATE_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ALLOW-PREDICATE-METHOD");
		$sym272$EXCLUDE_PREDICATE = SubLObjectFactory.makeSymbol("EXCLUDE-PREDICATE");
		$list273 = ConsesLow.list(SubLObjectFactory.makeString("do not allow POS-PRED to be used by this lexicon for lexical lookup"), ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSHNEW"), SubLObjectFactory.makeSymbol("POS-PRED"), SubLObjectFactory.makeSymbol("EXCLUDED-PREDS")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym274$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym275$ABSTRACT_LEXICON_EXCLUDE_PREDICATE_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-EXCLUDE-PREDICATE-METHOD");
		$sym276$EXCLUDED_PREDICATE_ = SubLObjectFactory.makeSymbol("EXCLUDED-PREDICATE?");
		$list277 = ConsesLow.list(SubLObjectFactory.makeString("is POS-PRED a predicate that can not be used in from this lexicon?"), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("MEMBER"), SubLObjectFactory.makeSymbol("POS-PRED"), SubLObjectFactory.makeSymbol("EXCLUDED-PREDS"))));
		$sym278$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym279$ABSTRACT_LEXICON_EXCLUDED_PREDICATE__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-EXCLUDED-PREDICATE?-METHOD");
		$sym280$ALLOWED_PREDICATE_ = SubLObjectFactory.makeSymbol("ALLOWED-PREDICATE?");
		$list281 = ConsesLow.list(SubLObjectFactory.makeString("is POS-PRED a predicate that can not be used in from this lexicon?"), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("CNOT"), ConsesLow.list(SubLObjectFactory.makeSymbol("MEMBER?"), SubLObjectFactory.makeSymbol("POS-PRED"), SubLObjectFactory.makeSymbol("EXCLUDED-PREDS")))));
		$sym282$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym283$ABSTRACT_LEXICON_ALLOWED_PREDICATE__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ALLOWED-PREDICATE?-METHOD");
		$list284 = ConsesLow.list(SubLObjectFactory.makeString("is POS-PRED of NL-TRIE-ENTRY a predicate that can not be used in from this lexicon?"), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("COR"), ConsesLow.list(SubLObjectFactory.makeSymbol("NULL"), SubLObjectFactory.makeSymbol("EXCLUDED-PREDS")), ConsesLow.list(SubLObjectFactory.makeSymbol("CNOT"), ConsesLow.list(SubLObjectFactory.makeSymbol("MEMBER?"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), SubLObjectFactory.makeSymbol("EXCLUDED-PREDS"))))));
		$sym285$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym286$ABSTRACT_LEXICON_NL_TRIE_ENTRY_HAS_ALLOWED_PREDICATE__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-NL-TRIE-ENTRY-HAS-ALLOWED-PREDICATE?-METHOD");
		$sym287$ALLOW_POS = SubLObjectFactory.makeSymbol("ALLOW-POS");
		$list288 = ConsesLow.list(SubLObjectFactory.makeSymbol("POS"));
		$list289 = ConsesLow.list(SubLObjectFactory.makeString("allow POS to be used by this lexicon for lexical lookup"), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("REMOVE"), SubLObjectFactory.makeSymbol("POS"), SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST"))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym290$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym291$ABSTRACT_LEXICON_ALLOW_POS_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ALLOW-POS-METHOD");
		$sym292$EXCLUDE_POS = SubLObjectFactory.makeSymbol("EXCLUDE-POS");
		$list293 = ConsesLow.list(SubLObjectFactory.makeString("do not allow POS to be used by this lexicon for lexical lookup"), ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSHNEW"), SubLObjectFactory.makeSymbol("POS"), SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym294$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym295$ABSTRACT_LEXICON_EXCLUDE_POS_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-EXCLUDE-POS-METHOD");
		$sym296$EXCLUDED_POS_ = SubLObjectFactory.makeSymbol("EXCLUDED-POS?");
		$list297 = ConsesLow.list(SubLObjectFactory.makeString("is POS a part of speech that can not be used in from this lexicon?"), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("GENL-POS-MEMBER?"), SubLObjectFactory.makeSymbol("POS"), SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST"))));
		$sym298$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym299$ABSTRACT_LEXICON_EXCLUDED_POS__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-EXCLUDED-POS?-METHOD");
		$list300 = ConsesLow.list(SubLObjectFactory.makeString("is POS a part of speech that can not be used in from this lexicon?"), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("CNOT"), ConsesLow.list(SubLObjectFactory.makeSymbol("GENL-POS-MEMBER?"), SubLObjectFactory.makeSymbol("POS"), SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST")))));
		$sym301$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym302$ABSTRACT_LEXICON_ALLOWED_POS__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ALLOWED-POS?-METHOD");
		$list303 = ConsesLow.list(SubLObjectFactory.makeString("does NL-TRIE-ENTRY have a part of speech that can not be used in from this lexicon?"), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("COR"), ConsesLow.list(SubLObjectFactory.makeSymbol("NULL"), SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST")), ConsesLow.list(SubLObjectFactory.makeSymbol("CNOT"), ConsesLow.list(SubLObjectFactory.makeSymbol("GENL-POS-MEMBER?"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-POS"), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST"))))));
		$sym304$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym305$ABSTRACT_LEXICON_NL_TRIE_ENTRY_HAS_ALLOWED_POS__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-NL-TRIE-ENTRY-HAS-ALLOWED-POS?-METHOD");
		$sym306$ADD_LEARNER = SubLObjectFactory.makeSymbol("ADD-LEARNER");
		$list307 = ConsesLow.list(SubLObjectFactory.makeSymbol("LEARNER"));
		$list308 = ConsesLow.list(SubLObjectFactory.makeString("add LEARNER (a method-name) as a learner to lexicon"), ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSHNEW"), SubLObjectFactory.makeSymbol("LEARNER"), SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym309$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym310$ABSTRACT_LEXICON_ADD_LEARNER_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ADD-LEARNER-METHOD");
		$sym311$REMOVE_LEARNER = SubLObjectFactory.makeSymbol("REMOVE-LEARNER");
		$list312 = ConsesLow.list(SubLObjectFactory.makeString("remove LEARNER (a method-name) as a learner for this lexicon"), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS"), ConsesLow.list(SubLObjectFactory.makeSymbol("REMOVE"), SubLObjectFactory.makeSymbol("LEARNER"), SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS"))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym313$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym314$ABSTRACT_LEXICON_REMOVE_LEARNER_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-REMOVE-LEARNER-METHOD");
		$sym315$GET_LEARNERS = SubLObjectFactory.makeSymbol("GET-LEARNERS");
		$list316 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS")));
		$sym317$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym318$ABSTRACT_LEXICON_GET_LEARNERS_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-GET-LEARNERS-METHOD");
		$sym319$SET_LEARNERS = SubLObjectFactory.makeSymbol("SET-LEARNERS");
		$list320 = ConsesLow.list(SubLObjectFactory.makeSymbol("LEARNERS"));
		$list321 = ConsesLow.list(SubLObjectFactory.makeString("set learners for lexicon to be all and only those learners specified in LEARNERS"), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS"), SubLObjectFactory.makeSymbol("LEARNERS")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym322$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym323$ABSTRACT_LEXICON_SET_LEARNERS_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-SET-LEARNERS-METHOD");
		$list324 = ConsesLow.list(SubLObjectFactory.makeKeyword("AUTO-UPDATE"), SubLObjectFactory.makeKeyword("PROTECTED"));
		$list325 = ConsesLow.list(SubLObjectFactory.makeSymbol("&OPTIONAL"), ConsesLow.list(SubLObjectFactory.makeSymbol("KB-SPEC"), SubLObjectFactory.makeKeyword("DEFAULT")));
		$list326 = ConsesLow.list(SubLObjectFactory.makeString("allow all mts visible from BASE-MT to be used by this lexicon.  If the value is :default, the value of the class variable DEFAULT-BASE-MT will be\n   used, and all mts in the class variable DEFAULT-EXCLUDED-MTS will be removed"), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("ALLOWED-MTS"), ConsesLow.list(SubLObjectFactory.makeSymbol("NEW-SET"), ConsesLow.list(SubLObjectFactory.makeSymbol("FUNCTION"), EQUAL))), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("EXCLUDED-MTS"), ConsesLow.list(SubLObjectFactory.makeSymbol("CONSTRUCT-SET-FROM-LIST"), SubLObjectFactory.makeSymbol("DEFAULT-EXCLUDE-MTS"), ConsesLow.list(SubLObjectFactory.makeSymbol("FUNCTION"), EQUAL))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), ConsesLow.list(EQ, SubLObjectFactory.makeKeyword("DEFAULT"), SubLObjectFactory.makeSymbol("KB-SPEC")),
						ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"),
								ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("BASE-MTS"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUERY-VARIABLE"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("?MT")), ConsesLow.list(SubLObjectFactory.makeSymbol("BQ-LIST*"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("defaultBaseLexicalMt")), SubLObjectFactory.makeSymbol("KB-SPEC"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeSymbol("?MT")))), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("InferencePSC")), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("HL"))))),
										ConsesLow.list(SubLObjectFactory.makeSymbol("SPEC-ALLOWED-MTS"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUERY-VARIABLE"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("?MT")), ConsesLow.list(SubLObjectFactory.makeSymbol("BQ-LIST*"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("allowedLexicalMt")), SubLObjectFactory.makeSymbol("KB-SPEC"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeSymbol("?MT")))), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("InferencePSC")), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("HL"))))),
										ConsesLow.list(SubLObjectFactory.makeSymbol("SPEC-DISALLOWED-MTS"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUERY-VARIABLE"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("?MT")), ConsesLow.list(SubLObjectFactory.makeSymbol("BQ-LIST*"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("disallowedLexicalMt")), SubLObjectFactory.makeSymbol("KB-SPEC"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeSymbol("?MT")))), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("InferencePSC")), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("HL")))))),
								ConsesLow.list(SubLObjectFactory.makeSymbol("PCOND"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("SINGLETON?"), SubLObjectFactory.makeSymbol("BASE-MTS")), ConsesLow.list(SubLObjectFactory.makeSymbol("SET-SLOT"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("BASE-MT")), ConsesLow.list(SubLObjectFactory.makeSymbol("COPY-EXPRESSION"), ConsesLow.list(SubLObjectFactory.makeSymbol("ONLY-ONE"), SubLObjectFactory.makeSymbol("BASE-MTS"))))),
										ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("EMPTY-LIST-P"), SubLObjectFactory.makeSymbol("BASE-MTS")), ConsesLow.list(SubLObjectFactory.makeSymbol("SET-SLOT"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("BASE-MT")), ConsesLow.list(SubLObjectFactory.makeSymbol("COPY-EXPRESSION"), ConsesLow.list(SubLObjectFactory.makeSymbol("GET-SLOT"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("DEFAULT-BASE-MT"))))), ConsesLow.list(SubLObjectFactory.makeSymbol("IGNORE"), SubLObjectFactory.makeSymbol("BASE-MTS"))), ConsesLow.list(T, ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("BASE-MT"), ConsesLow.list(SubLObjectFactory.makeSymbol("COPY-EXPRESSION"), ConsesLow.list(SubLObjectFactory.makeSymbol("CANONICALIZE-HLMT"), ConsesLow.list(SubLObjectFactory.makeSymbol("MAKE-EL-FORMULA"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("MtUnionFn")), SubLObjectFactory.makeSymbol("BASE-MTS"))))))),
								ConsesLow.list(SubLObjectFactory.makeSymbol("CDOLIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("SPEC-ALLOWED-MTS")), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("ALLOW-MT")), SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CDOLIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("SPEC-DISALLOWED-MTS")), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("FORBID-MT")), SubLObjectFactory.makeSymbol("MT"))))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym327$_MT = SubLObjectFactory.makeSymbol("?MT");
		$const328$defaultBaseLexicalMt = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("defaultBaseLexicalMt"));
		$list329 = ConsesLow.list(SubLObjectFactory.makeSymbol("?MT"));
		$const330$InferencePSC = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("InferencePSC"));
		$list331 = ConsesLow.list(SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("HL"));
		$const332$allowedLexicalMt = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("allowedLexicalMt"));
		$const333$disallowedLexicalMt = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("disallowedLexicalMt"));
		$const334$MtUnionFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("MtUnionFn"));
		$sym335$ALLOW_MT = SubLObjectFactory.makeSymbol("ALLOW-MT");
		$sym336$FORBID_MT = SubLObjectFactory.makeSymbol("FORBID-MT");
		$sym337$ABSTRACT_LEXICON_INITIALIZE_ALLOWED_MTS_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-INITIALIZE-ALLOWED-MTS-METHOD");
		$sym338$SET_BASE_MT = SubLObjectFactory.makeSymbol("SET-BASE-MT");
		$list339 = ConsesLow.list(SubLObjectFactory.makeSymbol("MT"));
		$list340 = ConsesLow.list(SubLObjectFactory.makeString("base-mt represents the standard mt-reasoning-based Mt for this lexicon. Using allow-mt and forbid-mt allow\n   for minor tweaks to the base-mt, but in general, this is the Mt for this lexicon\n   @note that this method will override any excluded-mts if they are visible from the newly-set base-mt"), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("BASE-MT"), ConsesLow.list(SubLObjectFactory.makeSymbol("COPY-EXPRESSION"), SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list(SubLObjectFactory.makeSymbol("DO-SET"), ConsesLow.list(SubLObjectFactory.makeSymbol("EXCLUDED-MT"), SubLObjectFactory.makeSymbol("EXCLUDED-MTS")), ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), ConsesLow.list(SubLObjectFactory.makeSymbol("GENL-LEXICON-MT?"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("EXCLUDED-MT")), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("ALLOW-MT")), SubLObjectFactory.makeSymbol("EXCLUDED-MT")))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym341$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym342$ABSTRACT_LEXICON_SET_BASE_MT_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-SET-BASE-MT-METHOD");
		$sym343$GET_BASE_MT = SubLObjectFactory.makeSymbol("GET-BASE-MT");
		$list344 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), ConsesLow.list(SubLObjectFactory.makeSymbol("INITIALIZED-P"), SubLObjectFactory.makeSymbol("BASE-MT")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("BASE-MT"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("BASE-MT"), SubLObjectFactory.makeSymbol("DEFAULT-BASE-MT")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("DEFAULT-BASE-MT")));
		$sym345$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym346$ABSTRACT_LEXICON_GET_BASE_MT_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-GET-BASE-MT-METHOD");
		$list347 = ConsesLow.list(SubLObjectFactory.makeString("@param MT possibly-hlmt-p; the mt to be allowed for retrieval of lex entries"), ConsesLow.list(SubLObjectFactory.makeSymbol("CHECK-TYPE"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("POSSIBLY-HLMT-P")), ConsesLow.list(SubLObjectFactory.makeSymbol("SET-ADD"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("ALLOWED-MTS")), ConsesLow.list(SubLObjectFactory.makeSymbol("SET-REMOVE"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("EXCLUDED-MTS")), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("ROOT-MT"), SubLObjectFactory.makeKeyword("UNINITIALIZED")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym348$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym349$POSSIBLY_HLMT_P = SubLObjectFactory.makeSymbol("POSSIBLY-HLMT-P");
		$sym350$ABSTRACT_LEXICON_ALLOW_MT_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ALLOW-MT-METHOD");
		$sym351$ALLOW_GENL_MTS = SubLObjectFactory.makeSymbol("ALLOW-GENL-MTS");
		$list352 = ConsesLow.list(SubLObjectFactory.makeString("@param MT possibly-hlmt-p; the mt and all its genlMTs to be allowed for \n     retrieval of lex entries"), ConsesLow.list(SubLObjectFactory.makeSymbol("CHECK-TYPE"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("POSSIBLY-HLMT-P")), ConsesLow.list(SubLObjectFactory.makeSymbol("SET-ADD"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("ALLOWED-MTS")), ConsesLow.list(SubLObjectFactory.makeSymbol("SET-REMOVE"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("EXCLUDED-MTS")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("CDOLIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("GENL-MT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUERY-VARIABLE"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("?GENLMT")), ConsesLow.list(SubLObjectFactory.makeSymbol("BQ-LIST*"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("genlMt")), SubLObjectFactory.makeSymbol("MT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeSymbol("?GENLMT")))))), ConsesLow.list(SubLObjectFactory.makeSymbol("SET-ADD"), SubLObjectFactory.makeSymbol("GENL-MT"), SubLObjectFactory.makeSymbol("ALLOWED-MTS")), ConsesLow.list(SubLObjectFactory.makeSymbol("SET-REMOVE"), SubLObjectFactory.makeSymbol("GENL-MT"), SubLObjectFactory.makeSymbol("EXCLUDED-MTS"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("ROOT-MT"), SubLObjectFactory.makeKeyword("UNINITIALIZED")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym353$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym354$_GENLMT = SubLObjectFactory.makeSymbol("?GENLMT");
		$const355$genlMt = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("genlMt"));
		$list356 = ConsesLow.list(SubLObjectFactory.makeSymbol("?GENLMT"));
		$sym357$ABSTRACT_LEXICON_ALLOW_GENL_MTS_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ALLOW-GENL-MTS-METHOD");
		$list358 = ConsesLow.list(SubLObjectFactory.makeString("@param MT possibly-hlmt-p; the mt to be forbidden for retrieval of lex entries"), ConsesLow.list(SubLObjectFactory.makeSymbol("CHECK-TYPE"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("POSSIBLY-HLMT-P")), ConsesLow.list(SubLObjectFactory.makeSymbol("SET-ADD"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("EXCLUDED-MTS")), ConsesLow.list(SubLObjectFactory.makeSymbol("SET-REMOVE"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("ALLOWED-MTS")), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("ROOT-MT"), SubLObjectFactory.makeKeyword("UNINITIALIZED")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym359$ABSTRACT_LEXICON_FORBID_MT_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-FORBID-MT-METHOD");
		$list360 = ConsesLow.list(SubLObjectFactory.makeString("@param MT possibly-hlmt-p; are assertions in MT allowed in this lexicon?"), ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), SubLObjectFactory.makeSymbol("MT"), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), NIL)),
				ConsesLow.list(SubLObjectFactory.makeSymbol("PCOND"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("SET-MEMBER?"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("ALLOWED-MTS")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), T)), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("SET-MEMBER?"), SubLObjectFactory.makeSymbol("MT"), SubLObjectFactory.makeSymbol("EXCLUDED-MTS")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), NIL)), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("CNOT"), ConsesLow.list(SubLObjectFactory.makeSymbol("HLMT-P"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET-BASE-MT"))))), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("FORBID-MT")), SubLObjectFactory.makeSymbol("MT")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), NIL)),
						ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("GENL-LEXICON-MT?"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET-BASE-MT"))), SubLObjectFactory.makeSymbol("MT")), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("ALLOW-MT")), SubLObjectFactory.makeSymbol("MT")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), T)), ConsesLow.list(T, ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("FORBID-MT")), SubLObjectFactory.makeSymbol("MT")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), NIL))));
		$sym361$ABSTRACT_LEXICON_ALLOWED_MT__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ALLOWED-MT?-METHOD");
		$list362 = ConsesLow.list(SubLObjectFactory.makeKeyword("PROTECTED"), SubLObjectFactory.makeKeyword("AUTO-UPDATE"));
		$list363 = ConsesLow.list(SubLObjectFactory.makeString("return the one Mt that is the composition of all the allowed/disallowed mts, an MtUnionFn of all the Mts"),
				ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), ConsesLow.list(SubLObjectFactory.makeSymbol("INITIALIZED-P"), SubLObjectFactory.makeSymbol("ROOT-MT")), ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("THIS-ALLOWED-MTS"), ConsesLow.list(SubLObjectFactory.makeSymbol("GET-SLOT"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("ALLOWED-MTS")))), ConsesLow.list(SubLObjectFactory.makeSymbol("THIS-BASE-MT"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET-BASE-MT")))),
						ConsesLow.list(SubLObjectFactory.makeSymbol("MTS"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIF"), ConsesLow.list(SubLObjectFactory.makeSymbol("POSSIBLY-HLMT-P"), SubLObjectFactory.makeSymbol("THIS-BASE-MT")), ConsesLow.list(SubLObjectFactory.makeSymbol("CONS"), SubLObjectFactory.makeSymbol("THIS-BASE-MT"), ConsesLow.list(SubLObjectFactory.makeSymbol("SET-ELEMENT-LIST"), SubLObjectFactory.makeSymbol("THIS-ALLOWED-MTS"))), ConsesLow.list(SubLObjectFactory.makeSymbol("SET-ELEMENT-LIST"), SubLObjectFactory.makeSymbol("ALLOWED-MTS")))), ConsesLow.list(SubLObjectFactory.makeSymbol("MIN-MTS"), ConsesLow.list(SubLObjectFactory.makeSymbol("MIN-MTS"), SubLObjectFactory.makeSymbol("MTS")))), ConsesLow.list(SubLObjectFactory.makeSymbol("SET-SLOT"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("ROOT-MT")), ConsesLow.list(SubLObjectFactory.makeSymbol("CANONICALIZE-HLMT"), ConsesLow.list(SubLObjectFactory.makeSymbol("MAKE-EL-FORMULA"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("MtUnionFn")), SubLObjectFactory.makeSymbol("MIN-MTS")))))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("ROOT-MT")));
		$sym364$ABSTRACT_LEXICON_ROOT_MT_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ROOT-MT-METHOD");
		$sym365$ADD_STOP_WORD = SubLObjectFactory.makeSymbol("ADD-STOP-WORD");
		$list366 = ConsesLow.list(SubLObjectFactory.makeSymbol("STRING"));
		$list367 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("STOP-WORD-SET"), SubLObjectFactory.makeSymbol("STOP-WORDS"))), ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), ConsesLow.list(SubLObjectFactory.makeSymbol("SET-P"), SubLObjectFactory.makeSymbol("STOP-WORD-SET")), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("STOP-WORD-SET"), ConsesLow.list(SubLObjectFactory.makeSymbol("NEW-SET"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), EQUAL)))), ConsesLow.list(SubLObjectFactory.makeSymbol("SET-ADD"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("STOP-WORD-SET")), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("STOP-WORDS"), SubLObjectFactory.makeSymbol("STOP-WORD-SET")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("STOP-WORDS"))));
		$sym368$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym369$ABSTRACT_LEXICON_ADD_STOP_WORD_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ADD-STOP-WORD-METHOD");
		$list370 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("CAND"), SubLObjectFactory.makeSymbol("STOP-WORDS"), ConsesLow.list(SubLObjectFactory.makeSymbol("BOOLEAN"), ConsesLow.list(SubLObjectFactory.makeSymbol("SET-MEMBER?"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("STOP-WORDS"))))));
		$sym371$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym372$ABSTRACT_LEXICON_STOP_WORD_P_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-STOP-WORD-P-METHOD");
		$sym373$GET_STOP_WORDS = SubLObjectFactory.makeSymbol("GET-STOP-WORDS");
		$list374 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), ConsesLow.list(SubLObjectFactory.makeSymbol("SET-P"), SubLObjectFactory.makeSymbol("STOP-WORDS")), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("STOP-WORDS"), ConsesLow.list(SubLObjectFactory.makeSymbol("NEW-SET"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), EQUAL)))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("STOP-WORDS")));
		$sym375$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym376$ABSTRACT_LEXICON_GET_STOP_WORDS_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-GET-STOP-WORDS-METHOD");
		$list377 = ConsesLow.list(SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("TARGET"));
		$list378 = ConsesLow.list(SubLObjectFactory.makeString("@return ABSTRACT-LEXICON-P; a copy of this lexicon.\n@note -- list values are copied with copy-list.\n@note -- cache and trie are set to their defaults."), ConsesLow.list(SubLObjectFactory.makeSymbol("CHECK-TYPE-IF-PRESENT"), SubLObjectFactory.makeSymbol("TARGET"), SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-P")), ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), SubLObjectFactory.makeSymbol("TARGET"), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("TARGET"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("CLONE")))), ConsesLow.list(SubLObjectFactory.makeSymbol("WARN"), SubLObjectFactory.makeString("Cloned instance: ~S"), SubLObjectFactory.makeSymbol("TARGET"))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("CDOLIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("SLOT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeSymbol("ALLOWED-MTS"), SubLObjectFactory.makeSymbol("EXCLUDED-MTS"), SubLObjectFactory.makeSymbol("EXCLUDED-PREDS"), SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST"), SubLObjectFactory.makeSymbol("IGNORE-CACHE?"), SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"), SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS")))),
						ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("VALUE"), ConsesLow.list(SubLObjectFactory.makeSymbol("GET-SLOT"), SubLObjectFactory.makeSymbol("SELF"), SubLObjectFactory.makeSymbol("SLOT")))), ConsesLow.list(SubLObjectFactory.makeSymbol("PCOND"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("LISTP"), SubLObjectFactory.makeSymbol("VALUE")), ConsesLow.list(SubLObjectFactory.makeSymbol("SET-SLOT"), SubLObjectFactory.makeSymbol("TARGET"), SubLObjectFactory.makeSymbol("SLOT"), ConsesLow.list(SubLObjectFactory.makeSymbol("COPY-LIST"), SubLObjectFactory.makeSymbol("VALUE")))), ConsesLow.list(T, ConsesLow.list(SubLObjectFactory.makeSymbol("SET-SLOT"), SubLObjectFactory.makeSymbol("TARGET"), SubLObjectFactory.makeSymbol("SLOT"), SubLObjectFactory.makeSymbol("VALUE")))))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("TARGET")));
		$sym379$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym380$ABSTRACT_LEXICON_P = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-P");
		$sym381$CLONE = SubLObjectFactory.makeSymbol("CLONE");
		$str382$Cloned_instance___S = SubLObjectFactory.makeString("Cloned instance: ~S");
		$list383 = ConsesLow.list(SubLObjectFactory.makeSymbol("ALLOWED-MTS"), SubLObjectFactory.makeSymbol("EXCLUDED-MTS"), SubLObjectFactory.makeSymbol("EXCLUDED-PREDS"), SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST"), SubLObjectFactory.makeSymbol("IGNORE-CACHE?"), SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"), SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS"));
		$sym384$ABSTRACT_LEXICON_COPY_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-COPY-METHOD");
		$list385 = ConsesLow.list(SubLObjectFactory.makeString("@param STRING stringp;\n   @return listp; the list of  lex-entry-p associated with STRING in this lexicon"), ConsesLow.list(SubLObjectFactory.makeSymbol("CHECK-TYPE"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("CYCL-STRING-P")), ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("STOP-WORD-P")), SubLObjectFactory.makeSymbol("STRING")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), NIL)),
				ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), SubLObjectFactory.makeSymbol("IGNORE-CACHE?"), ConsesLow.list(SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), ConsesLow.list(SubLObjectFactory.makeSymbol("LEX-ENTRIES"), SubLObjectFactory.makeSymbol("EXISTS?")), ConsesLow.list(SubLObjectFactory.makeSymbol("CACHE-GET"), SubLObjectFactory.makeSymbol("CACHE"), SubLObjectFactory.makeSymbol("STRING")), ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), SubLObjectFactory.makeSymbol("EXISTS?"), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("LEX-ENTRIES"))))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("LEX-ENTRIES"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES")), SubLObjectFactory.makeSymbol("STRING"), NIL)), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-ENTRIES"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-SEARCH"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("TRIE"), SubLObjectFactory.makeSymbol("CASE-SENSITIVITY")))), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("LEX-ENTRIES"), ConsesLow.list(SubLObjectFactory.makeSymbol("ADD-LEX-ENTRIES-FOR-TRIE-ENTRIES"), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRIES"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("SELF"), SubLObjectFactory.makeSymbol("LEX-ENTRIES"))),
						ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), ConsesLow.list(SubLObjectFactory.makeSymbol("CAND"), ConsesLow.list(SubLObjectFactory.makeSymbol("NULL"), SubLObjectFactory.makeSymbol("LEX-ENTRIES")), ConsesLow.list(EQ, SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"), SubLObjectFactory.makeKeyword("PREFERRED"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-ENTRIES"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-SEARCH"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("TRIE"), SubLObjectFactory.makeKeyword("OFF")))), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("LEX-ENTRIES"), ConsesLow.list(SubLObjectFactory.makeSymbol("ADD-LEX-ENTRIES-FOR-TRIE-ENTRIES"), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRIES"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("SELF"), SubLObjectFactory.makeSymbol("LEX-ENTRIES"))))),
						ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), SubLObjectFactory.makeSymbol("IGNORE-CACHE?"), ConsesLow.list(SubLObjectFactory.makeSymbol("CACHE-SET"), SubLObjectFactory.makeSymbol("CACHE"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("LEX-ENTRIES"))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("LEX-ENTRIES"))));
		$sym386$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym387$CYCL_STRING_P = SubLObjectFactory.makeSymbol("CYCL-STRING-P");
		$sym388$CREATE_LEX_ENTRIES = SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES");
		$kw389$PREFERRED = SubLObjectFactory.makeKeyword("PREFERRED");
		$kw390$OFF = SubLObjectFactory.makeKeyword("OFF");
		$sym391$ABSTRACT_LEXICON_GET_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-GET-METHOD");
		$sym392$LEX_ENTRY_EQUAL_P = SubLObjectFactory.makeSymbol("LEX-ENTRY-EQUAL-P");
		$sym393$DELETE = SubLObjectFactory.makeSymbol("DELETE");
		$list394 = ConsesLow.list(SubLObjectFactory.makeString("Deletes all entries for STRING from this lexicon"), ConsesLow.list(SubLObjectFactory.makeSymbol("CHECK-TYPE"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("CYCL-STRING-P")), ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("TRIE-ENTRIES"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-SEARCH"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("TRIE"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET-CASE-SENSITIVITY")))))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("CDOLIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("TRIE-ENTRY"), SubLObjectFactory.makeSymbol("TRIE-ENTRIES")), ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), ConsesLow.list(SubLObjectFactory.makeSymbol("LEX-ENTRY-P"), SubLObjectFactory.makeSymbol("TRIE-ENTRY")), ConsesLow.list(SubLObjectFactory.makeSymbol("CDOLIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("TRIE-KEY"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-KEYS"), SubLObjectFactory.makeSymbol("TRIE-ENTRY"))), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-DELETE-ENTRY"), SubLObjectFactory.makeSymbol("TRIE"), SubLObjectFactory.makeSymbol("TRIE-KEY"), SubLObjectFactory.makeSymbol("TRIE-ENTRY")))))), ConsesLow.list(SubLObjectFactory.makeSymbol("CACHE-REMOVE"), SubLObjectFactory.makeSymbol("CACHE"), SubLObjectFactory.makeSymbol("STRING")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym395$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym396$ABSTRACT_LEXICON_DELETE_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-DELETE-METHOD");
		$sym397$DELETE_ENTRY_FROM_STRING = SubLObjectFactory.makeSymbol("DELETE-ENTRY-FROM-STRING");
		$list398 = ConsesLow.list(SubLObjectFactory.makeSymbol("LEX-ENTRY"), SubLObjectFactory.makeSymbol("STRING"));
		$list399 = ConsesLow.list(SubLObjectFactory.makeString("Deletes the entry associating STRING with LEX-ENTRY from this lexicon"), ConsesLow.list(SubLObjectFactory.makeSymbol("CHECK-TYPE"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("STRINGP")), ConsesLow.list(SubLObjectFactory.makeSymbol("CHECK-TYPE"), SubLObjectFactory.makeSymbol("LEX-ENTRY"), SubLObjectFactory.makeSymbol("LEX-ENTRY-P")), ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("TRIE-KEY"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-STRING-TOKENIZE"), SubLObjectFactory.makeSymbol("STRING")))), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-DELETE-ENTRY"), SubLObjectFactory.makeSymbol("TRIE"), SubLObjectFactory.makeSymbol("TRIE-KEY"), SubLObjectFactory.makeSymbol("LEX-ENTRY"))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("CACHE-ENTRIES"), ConsesLow.list(SubLObjectFactory.makeSymbol("REMOVE"), SubLObjectFactory.makeSymbol("LEX-ENTRY"), ConsesLow.list(SubLObjectFactory.makeSymbol("CACHE-GET"), SubLObjectFactory.makeSymbol("CACHE"), SubLObjectFactory.makeSymbol("STRING")), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), EQUAL)))), ConsesLow.list(SubLObjectFactory.makeSymbol("CACHE-SET"), SubLObjectFactory.makeSymbol("CACHE"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("CACHE-ENTRIES"))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SELF")));
		$sym400$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym401$LEX_ENTRY_P = SubLObjectFactory.makeSymbol("LEX-ENTRY-P");
		$sym402$ABSTRACT_LEXICON_DELETE_ENTRY_FROM_STRING_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-DELETE-ENTRY-FROM-STRING-METHOD");
		$sym403$NL_TRIE_LEX_ENTRY_P = SubLObjectFactory.makeSymbol("NL-TRIE-LEX-ENTRY-P");
		$sym404$ADD = SubLObjectFactory.makeSymbol("ADD");
		$list405 = ConsesLow.list(SubLObjectFactory.makeSymbol("LEX-ENTRY"));
		$list406 = ConsesLow.list(SubLObjectFactory.makeString("Adds LEX-ENTRY to this lexicon"), ConsesLow.list(SubLObjectFactory.makeSymbol("CHECK-TYPE"), SubLObjectFactory.makeSymbol("LEX-ENTRY"), SubLObjectFactory.makeSymbol("LEX-ENTRY-P")), ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("STRING"), ConsesLow.list(SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("LEX-ENTRY"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET")), SubLObjectFactory.makeKeyword("STRING"))), SubLObjectFactory.makeSymbol("RESULT")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), ConsesLow.list(SubLObjectFactory.makeSymbol("CHAR-POSITION"), SubLObjectFactory.makeSymbol("*STRIE-NULL-KEY*"), SubLObjectFactory.makeSymbol("STRING")), ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSH"), SubLObjectFactory.makeSymbol("LEX-ENTRY"), SubLObjectFactory.makeSymbol("LEARNED")), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("RESULT"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-INSERT-ENTRY"), SubLObjectFactory.makeSymbol("TRIE"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-STRING-TOKENIZE"), SubLObjectFactory.makeSymbol("STRING")), ConsesLow.list(SubLObjectFactory.makeSymbol("LEX-ENTRY2NL-TRIE-ENTRY"), SubLObjectFactory.makeSymbol("LEX-ENTRY")))), ConsesLow.list(SubLObjectFactory.makeSymbol("CACHE-REMOVE"), SubLObjectFactory.makeSymbol("CACHE"), SubLObjectFactory.makeSymbol("STRING")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("RESULT"))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), NIL)));
		$sym407$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym408$ABSTRACT_LEXICON_ADD_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ADD-METHOD");
		$sym409$LEARNED_ = SubLObjectFactory.makeSymbol("LEARNED?");
		$list410 = ConsesLow.list(SubLObjectFactory.makeString("Check to see if this lex entry was learned by this lexicon"), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("MEMBER?"), SubLObjectFactory.makeSymbol("LEX-ENTRY"), SubLObjectFactory.makeSymbol("LEARNED"))));
		$sym411$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym412$ABSTRACT_LEXICON_LEARNED__METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-LEARNED?-METHOD");
		$sym413$FORGET = SubLObjectFactory.makeSymbol("FORGET");
		$list414 = ConsesLow.list(SubLObjectFactory.makeString("Delete all entries previously learned from this lexicon"), ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("DELETED"), SubLObjectFactory.makeSymbol("LEARNED"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CDOLIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("LEX"), SubLObjectFactory.makeSymbol("LEARNED")), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("DELETE")), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("LEX"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET")), SubLObjectFactory.makeKeyword("STRING")))), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("LEARNED"), NIL), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("DELETED"))));
		$sym415$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym416$ABSTRACT_LEXICON_FORGET_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-FORGET-METHOD");
		$sym417$PREFIXES = SubLObjectFactory.makeSymbol("PREFIXES");
		$list418 = ConsesLow.list(SubLObjectFactory.makeSymbol("STRINGS"));
		$list419 = ConsesLow.list(SubLObjectFactory.makeString("@param STRINGS; listp\n   @return listp; a list of conses whose car is a list of strings which are\n   in this lexicon and a prefix of STRINGS, and whose cdr is a lex entry\n   with that string"), ConsesLow.list(SubLObjectFactory.makeSymbol("CHECK-TYPE"), SubLObjectFactory.makeSymbol("STRINGS"), SubLObjectFactory.makeSymbol("LISTP")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("VALID-PREFIXES"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-PREFIXES"), SubLObjectFactory.makeSymbol("TRIE"), SubLObjectFactory.makeSymbol("STRINGS"), SubLObjectFactory.makeSymbol("CASE-SENSITIVITY")), SubLObjectFactory.makeSymbol("SELF"))));
		$sym420$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym421$LISTP = SubLObjectFactory.makeSymbol("LISTP");
		$sym422$ABSTRACT_LEXICON_PREFIXES_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-PREFIXES-METHOD");
		$sym423$PREFIXES_FROM_STRING = SubLObjectFactory.makeSymbol("PREFIXES-FROM-STRING");
		$list424 = ConsesLow.list(SubLObjectFactory.makeString("@param STRING stringp\n   @return listp; a list of conses whose car is a list of strings which are\n   in this lexicon and a prefix of STRINGS, and whose cdr is a lex entry\n   with that string"), ConsesLow.list(SubLObjectFactory.makeSymbol("CHECK-TYPE"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("STRINGP")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("PREFIX-KEYS"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-PREFIX-KEYS-FROM-STRING"), SubLObjectFactory.makeSymbol("TRIE"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"))), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"), ConsesLow.list(SubLObjectFactory.makeSymbol("SECOND"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIRST"), SubLObjectFactory.makeSymbol("PREFIX-KEYS")))), ConsesLow.list(SubLObjectFactory.makeSymbol("PREFIX-STRING"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-STRING"), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("LIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("VALID-PREFIXES"), SubLObjectFactory.makeSymbol("PREFIX-KEYS"), SubLObjectFactory.makeSymbol("SELF")), SubLObjectFactory.makeSymbol("PREFIX-STRING")))));
		$sym425$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym426$ABSTRACT_LEXICON_PREFIXES_FROM_STRING_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-PREFIXES-FROM-STRING-METHOD");
		$kw427$FALLBACK = SubLObjectFactory.makeKeyword("FALLBACK");
		$str428$Don_t_recognize_lexicon_case_sens = SubLObjectFactory.makeString("Don't recognize lexicon case sensitivity value of ~S");
		$sym429$PREFIX_KEYS = SubLObjectFactory.makeSymbol("PREFIX-KEYS");
		$list430 = ConsesLow.list(SubLObjectFactory.makeString("@param STRINGS; listp\n   @return listp; a list of strings which are both in this lexicon and a prefix of STRINGS"), ConsesLow.list(SubLObjectFactory.makeSymbol("CHECK-TYPE"), SubLObjectFactory.makeSymbol("STRINGS"), SubLObjectFactory.makeSymbol("LISTP")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("VALID-PREFIX-KEYS"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-PREFIXES"), SubLObjectFactory.makeSymbol("TRIE"), SubLObjectFactory.makeSymbol("STRINGS"), SubLObjectFactory.makeSymbol("CASE-SENSITIVITY")), SubLObjectFactory.makeSymbol("SELF"), SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"))));
		$sym431$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym432$ABSTRACT_LEXICON_PREFIX_KEYS_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-PREFIX-KEYS-METHOD");
		$sym433$PREFIX_KEYS_FROM_STRING = SubLObjectFactory.makeSymbol("PREFIX-KEYS-FROM-STRING");
		$list434 = ConsesLow.list(SubLObjectFactory.makeString("@param STRING stringp\n   @return listp; a list of strings which are both in this lexicon and a prefix of STRINGS"), ConsesLow.list(SubLObjectFactory.makeSymbol("CHECK-TYPE"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("STRINGP")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("MY-PREFIX-KEYS"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-PREFIX-KEYS-FROM-STRING"), SubLObjectFactory.makeSymbol("TRIE"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"))), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"), ConsesLow.list(SubLObjectFactory.makeSymbol("SECOND"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIRST"), SubLObjectFactory.makeSymbol("MY-PREFIX-KEYS")))), ConsesLow.list(SubLObjectFactory.makeSymbol("PREFIX-STRING"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-STRING"), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("LIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("VALID-PREFIX-KEYS"), SubLObjectFactory.makeSymbol("MY-PREFIX-KEYS"), SubLObjectFactory.makeSymbol("SELF"), SubLObjectFactory.makeSymbol("CASE-SENSITIVITY")), SubLObjectFactory.makeSymbol("PREFIX-STRING")))));
		$sym435$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym436$ABSTRACT_LEXICON_PREFIX_KEYS_FROM_STRING_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-PREFIX-KEYS-FROM-STRING-METHOD");
		$sym437$LEARN = SubLObjectFactory.makeSymbol("LEARN");
		$list438 = ConsesLow.list(SubLObjectFactory.makeSymbol("TEXT"), SubLObjectFactory.makeSymbol("&OPTIONAL"), ConsesLow.list(SubLObjectFactory.makeSymbol("LEARNERS")));
		$list439 = ConsesLow.list(SubLObjectFactory.makeString("@param TEXT stringp; the text from which to learn lexical entries\n   @param LEARNERS listp; a list of learning methods. Each such method\n   is expected to take a natural language string as input and return a \n   list of lex-entries\n   @return non-negative-integerp; the number of entries learned\n   @note it is the responsibility of each learner to add any entries to the lexicon"), ConsesLow.list(SubLObjectFactory.makeSymbol("CHECK-TYPE"), SubLObjectFactory.makeSymbol("TEXT"), SubLObjectFactory.makeSymbol("STRINGP")), ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), SubLObjectFactory.makeSymbol("LEARNERS"), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("LEARNERS"), SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS"))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(SubLObjectFactory.makeSymbol("LEARNED-HERE")), ConsesLow.list(SubLObjectFactory.makeSymbol("CDOLIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("LEARNER"), SubLObjectFactory.makeSymbol("LEARNERS")), ConsesLow.list(SubLObjectFactory.makeSymbol("CDOLIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("LEX"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), SubLObjectFactory.makeSymbol("LEARNER"), SubLObjectFactory.makeSymbol("TEXT"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSH"), SubLObjectFactory.makeSymbol("LEX"), SubLObjectFactory.makeSymbol("LEARNED-HERE")))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("LEARNED-HERE"))));
		$sym440$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym441$ABSTRACT_LEXICON_LEARN_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-LEARN-METHOD");
		$sym442$NUMBER_LEARN = SubLObjectFactory.makeSymbol("NUMBER-LEARN");
		$list443 = ConsesLow.list(SubLObjectFactory.makeSymbol("TEXT"));
		$list444 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("IGNORE"), SubLObjectFactory.makeSymbol("TEXT")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), NIL));
		$sym445$ABSTRACT_LEXICON_NUMBER_LEARN_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-NUMBER-LEARN-METHOD");
		$kw446$CD = SubLObjectFactory.makeKeyword("CD");
		$str447$_ = SubLObjectFactory.makeString("-");
		$const448$ScalarInterval = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("ScalarInterval"));
		$sym449$RKF_STANDARD_STRING_WORDIFY = SubLObjectFactory.makeSymbol("RKF-STANDARD-STRING-WORDIFY");
		$str450$_ = SubLObjectFactory.makeString(".");
		$sym451$WORD_STRING = SubLObjectFactory.makeSymbol("WORD-STRING");
		$sym452$SCALAR_FUNCTION_ = SubLObjectFactory.makeSymbol("SCALAR-FUNCTION?");
		$sym453$_SCALAR_FUNCTION__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SCALAR-FUNCTION?-CACHING-STATE*");
		$int454$512 = SubLObjectFactory.makeInteger(512);
		$sym455$NOUN_COMPOUND_LEARN = SubLObjectFactory.makeSymbol("NOUN-COMPOUND-LEARN");
		$list456 = ConsesLow.list(SubLObjectFactory.makeString("@param TEXT stringp; the text from which to learn lexical entries\n   @return listp; a list of lexical entries learned from TEXT\n   This is a stub just to make sure that all subclasses will be have a base\n   implementation of this method, although we don't wish to give it a real\n   implementation as a method of this class."), ConsesLow.list(SubLObjectFactory.makeSymbol("IGNORE"), SubLObjectFactory.makeSymbol("TEXT")), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), NIL));
		$sym457$ABSTRACT_LEXICON_NOUN_COMPOUND_LEARN_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-NOUN-COMPOUND-LEARN-METHOD");
		$kw458$NP = SubLObjectFactory.makeKeyword("NP");
		$sym459$COMPOUNDS_FROM_TREE = SubLObjectFactory.makeSymbol("COMPOUNDS-FROM-TREE");
		$kw460$BEST_ONLY = SubLObjectFactory.makeKeyword("BEST-ONLY");
		$list461 = ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("PhraseFn-Bar1")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Noun")));
		$sym462$EXTRACT_PARSE_POS_PRED = SubLObjectFactory.makeSymbol("EXTRACT-PARSE-POS-PRED");
		$list463 = ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("NLNumberFn")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Plural-NLAttr")), SubLObjectFactory.makeKeyword("ANYTHING"));
		$const464$plural_Generic = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("plural-Generic"));
		$list465 = ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("NLNumberFn")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Singular-NLAttr")), SubLObjectFactory.makeKeyword("ANYTHING"));
		$const466$singular_Generic = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("singular-Generic"));
		$list467 = ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("NLNumberFn")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Mass-NLAttr")), SubLObjectFactory.makeKeyword("ANYTHING"));
		$const468$massNumber_Generic = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("massNumber-Generic"));
		$const469$nounStrings = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("nounStrings"));
		$sym470$COOCCURRENCE_STATISTICS_LEARN = SubLObjectFactory.makeSymbol("COOCCURRENCE-STATISTICS-LEARN");
		$sym471$ABSTRACT_LEXICON_COOCCURRENCE_STATISTICS_LEARN_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-COOCCURRENCE-STATISTICS-LEARN-METHOD");
		$sym472$LEXIFY_DOCUMENT = SubLObjectFactory.makeSymbol("LEXIFY-DOCUMENT");
		$list473 = ConsesLow.list(SubLObjectFactory.makeSymbol("DOC"));
		$list474 = ConsesLow.list(SubLObjectFactory.makeString("@param DOC document-p; \n   @return document-p; a new version of DOC with adjacent words collapsed into\n   single words and nl-trie-entries associated with the words in DOC"), ConsesLow.list(SubLObjectFactory.makeSymbol("CHECK-TYPE"), SubLObjectFactory.makeSymbol("DOC"), SubLObjectFactory.makeSymbol("DOCUMENT-P")), ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("LEXIFIED"), ConsesLow.list(SubLObjectFactory.makeSymbol("MAKE-DOCUMENT"))), ConsesLow.list(SubLObjectFactory.makeSymbol("PARAGRAPHS"), NIL)), ConsesLow.list(SubLObjectFactory.makeSymbol("DOCUMENT-DO-PARAGRAPHS"), ConsesLow.list(SubLObjectFactory.makeSymbol("PARAGRAPH"), SubLObjectFactory.makeSymbol("DOC")), ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSH"), ConsesLow.list(SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("LEXIFY-PARAGRAPH")), SubLObjectFactory.makeSymbol("PARAGRAPH")), SubLObjectFactory.makeSymbol("PARAGRAPHS"))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("CSETF"), ConsesLow.list(SubLObjectFactory.makeSymbol("DOCUMENT-PARAGRAPHS"), SubLObjectFactory.makeSymbol("LEXIFIED")), ConsesLow.list(SubLObjectFactory.makeSymbol("APPLY"), ConsesLow.list(SubLObjectFactory.makeSymbol("FUNCTION"), SubLObjectFactory.makeSymbol("VECTOR")), ConsesLow.list(SubLObjectFactory.makeSymbol("NREVERSE"), SubLObjectFactory.makeSymbol("PARAGRAPHS")))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("LEXIFIED"))));
		$sym475$DOCUMENT_P = SubLObjectFactory.makeSymbol("DOCUMENT-P");
		$sym476$LEXIFY_PARAGRAPH = SubLObjectFactory.makeSymbol("LEXIFY-PARAGRAPH");
		$sym477$VECTOR = SubLObjectFactory.makeSymbol("VECTOR");
		$sym478$ABSTRACT_LEXICON_LEXIFY_DOCUMENT_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-LEXIFY-DOCUMENT-METHOD");
		$sym479$LEXIFY_DOCUMENT_EXHAUSTIVELY = SubLObjectFactory.makeSymbol("LEXIFY-DOCUMENT-EXHAUSTIVELY");
		$list480 = ConsesLow.list(SubLObjectFactory.makeString("@param DOC document-p; \n   @return document-p; a new version of DOC with all possible lexical matches included.  \n   The document will contain exhaustive-word-p's, each of which will contain zero or more \n   word-p's with attached nl-trie-entries"), ConsesLow.list(SubLObjectFactory.makeSymbol("CHECK-TYPE"), SubLObjectFactory.makeSymbol("DOC"), SubLObjectFactory.makeSymbol("DOCUMENT-P")), ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("LEXIFIED"), ConsesLow.list(SubLObjectFactory.makeSymbol("MAKE-DOCUMENT"))), ConsesLow.list(SubLObjectFactory.makeSymbol("PARAGRAPHS"), NIL)),
				ConsesLow.list(SubLObjectFactory.makeSymbol("DOCUMENT-DO-PARAGRAPHS"), ConsesLow.list(SubLObjectFactory.makeSymbol("PARAGRAPH"), SubLObjectFactory.makeSymbol("DOC")), ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSH"), ConsesLow.list(SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("LEXIFY-PARAGRAPH-EXHAUSTIVELY")), SubLObjectFactory.makeSymbol("PARAGRAPH")), SubLObjectFactory.makeSymbol("PARAGRAPHS"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETF"), ConsesLow.list(SubLObjectFactory.makeSymbol("DOCUMENT-PARAGRAPHS"), SubLObjectFactory.makeSymbol("LEXIFIED")), ConsesLow.list(SubLObjectFactory.makeSymbol("APPLY"), ConsesLow.list(SubLObjectFactory.makeSymbol("FUNCTION"), SubLObjectFactory.makeSymbol("VECTOR")), ConsesLow.list(SubLObjectFactory.makeSymbol("NREVERSE"), SubLObjectFactory.makeSymbol("PARAGRAPHS")))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("LEXIFIED"))));
		$sym481$LEXIFY_PARAGRAPH_EXHAUSTIVELY = SubLObjectFactory.makeSymbol("LEXIFY-PARAGRAPH-EXHAUSTIVELY");
		$sym482$ABSTRACT_LEXICON_LEXIFY_DOCUMENT_EXHAUSTIVELY_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-LEXIFY-DOCUMENT-EXHAUSTIVELY-METHOD");
		$list483 = ConsesLow.list(SubLObjectFactory.makeSymbol("PAR"));
		$list484 = ConsesLow.list(SubLObjectFactory.makeString("@param PAR paragraph-p;\n   @return paraphraph-p; a new version of PAR with adjacent words collapsed into\n   single words and nl-trie-entries associated with the words in PAR"), ConsesLow.list(SubLObjectFactory.makeSymbol("CHECK-TYPE"), SubLObjectFactory.makeSymbol("PAR"), SubLObjectFactory.makeSymbol("PARAGRAPH-P")), ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("LEXIFIED"), ConsesLow.list(SubLObjectFactory.makeSymbol("MAKE-PARAGRAPH"))), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCES"), NIL)), ConsesLow.list(SubLObjectFactory.makeSymbol("PARAGRAPH-DO-SENTENCES"), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE"), SubLObjectFactory.makeSymbol("PAR")), ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSH"), ConsesLow.list(SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("LEXIFY-SENTENCE")), SubLObjectFactory.makeSymbol("SENTENCE")), SubLObjectFactory.makeSymbol("SENTENCES"))),
				ConsesLow.list(SubLObjectFactory.makeSymbol("CSETF"), ConsesLow.list(SubLObjectFactory.makeSymbol("PARAGRAPH-SENTENCES"), SubLObjectFactory.makeSymbol("LEXIFIED")), ConsesLow.list(SubLObjectFactory.makeSymbol("APPLY"), ConsesLow.list(SubLObjectFactory.makeSymbol("FUNCTION"), SubLObjectFactory.makeSymbol("VECTOR")), ConsesLow.list(SubLObjectFactory.makeSymbol("NREVERSE"), SubLObjectFactory.makeSymbol("SENTENCES")))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("LEXIFIED"))));
		$sym485$PARAGRAPH_P = SubLObjectFactory.makeSymbol("PARAGRAPH-P");
		$sym486$LEXIFY_SENTENCE = SubLObjectFactory.makeSymbol("LEXIFY-SENTENCE");
		$sym487$ABSTRACT_LEXICON_LEXIFY_PARAGRAPH_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-LEXIFY-PARAGRAPH-METHOD");
		$list488 = ConsesLow.list(SubLObjectFactory.makeString("@param PAR paragraph-p;\n   @return paraphraph-p; a new version of PAR with all possible lexical matches included.  \n   The document will contain exhaustive-word-p's, each of which will contain zero or more \n   word-p's with attached nl-trie-entries"), ConsesLow.list(SubLObjectFactory.makeSymbol("CHECK-TYPE"), SubLObjectFactory.makeSymbol("PAR"), SubLObjectFactory.makeSymbol("PARAGRAPH-P")), ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("LEXIFIED"), ConsesLow.list(SubLObjectFactory.makeSymbol("MAKE-PARAGRAPH"))), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCES"), NIL)),
				ConsesLow.list(SubLObjectFactory.makeSymbol("PARAGRAPH-DO-SENTENCES"), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE"), SubLObjectFactory.makeSymbol("PAR")), ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSH"), ConsesLow.list(SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("LEXIFY-SENTENCE-EXHAUSTIVELY")), SubLObjectFactory.makeSymbol("SENTENCE")), SubLObjectFactory.makeSymbol("SENTENCES"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETF"), ConsesLow.list(SubLObjectFactory.makeSymbol("PARAGRAPH-SENTENCES"), SubLObjectFactory.makeSymbol("LEXIFIED")), ConsesLow.list(SubLObjectFactory.makeSymbol("APPLY"), ConsesLow.list(SubLObjectFactory.makeSymbol("FUNCTION"), SubLObjectFactory.makeSymbol("VECTOR")), ConsesLow.list(SubLObjectFactory.makeSymbol("NREVERSE"), SubLObjectFactory.makeSymbol("SENTENCES")))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("LEXIFIED"))));
		$sym489$LEXIFY_SENTENCE_EXHAUSTIVELY = SubLObjectFactory.makeSymbol("LEXIFY-SENTENCE-EXHAUSTIVELY");
		$sym490$ABSTRACT_LEXICON_LEXIFY_PARAGRAPH_EXHAUSTIVELY_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-LEXIFY-PARAGRAPH-EXHAUSTIVELY-METHOD");
		$list491 = ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE"));
		$list492 = ConsesLow.list(SubLObjectFactory.makeString("@param sentence sentence-p;\n   @return sentence-p; a new version of SENTENCE with adjacent words collapsed into\n   single words and nl-trie-entries associated with the words in SENTENCE"), ConsesLow.list(SubLObjectFactory.makeSymbol("CHECK-TYPE"), SubLObjectFactory.makeSymbol("SENTENCE"), SubLObjectFactory.makeSymbol("SENTENCE-P")), ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), ConsesLow.list(SubLObjectFactory.makeSymbol("ZEROP"), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE-LENGTH"), SubLObjectFactory.makeSymbol("SENTENCE"))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SENTENCE"))),
				ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("LEXIFIED"), ConsesLow.list(SubLObjectFactory.makeSymbol("NEW-SENTENCE"))), ConsesLow.list(SubLObjectFactory.makeSymbol("WORD-VEC"), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE-YIELD"), SubLObjectFactory.makeSymbol("SENTENCE"))), ConsesLow.list(SubLObjectFactory.makeSymbol("FIRST-WORD"), ConsesLow.list(SubLObjectFactory.makeSymbol("WORD-STRING"), ConsesLow.list(SubLObjectFactory.makeSymbol("AREF"), SubLObjectFactory.makeSymbol("WORD-VEC"), ZERO_INTEGER))), ConsesLow.list(SubLObjectFactory.makeSymbol("RECORD-LENGTH"), ZERO_INTEGER), ConsesLow.list(SubLObjectFactory.makeSymbol("LEXIFIED-TOKENS"), NIL), SubLObjectFactory.makeSymbol("WORDS"), ConsesLow.list(SubLObjectFactory.makeSymbol("TOKENIZING-STREAM"), ConsesLow.list(SubLObjectFactory.makeSymbol("MAKE-PRIVATE-STRING-OUTPUT-STREAM")))), ConsesLow.list(SubLObjectFactory.makeSymbol("TAGGER-NORMALIZE-INITIAL-CAPITALIZATION"), ConsesLow.list(SubLObjectFactory.makeSymbol("GET-TAGGER")), SubLObjectFactory.makeSymbol("WORD-VEC")),
						ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("WORDS"), ConsesLow.list(SubLObjectFactory.makeSymbol("VECTOR-ELEMENTS"), SubLObjectFactory.makeSymbol("WORD-VEC"))),
						ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("*LEXICON-LOOKUP-MT*"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("InferencePSC")))),
								ConsesLow.list(SubLObjectFactory.makeSymbol("CDO"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("INDEX"), ZERO_INTEGER, ConsesLow.list(SubLObjectFactory.makeSymbol("+"), SubLObjectFactory.makeSymbol("INDEX"), SubLObjectFactory.makeSymbol("RECORD-LENGTH"))), ConsesLow.list(SubLObjectFactory.makeSymbol("TOKENS"), SubLObjectFactory.makeSymbol("WORDS"), ConsesLow.list(SubLObjectFactory.makeSymbol("NTHCDR"), SubLObjectFactory.makeSymbol("RECORD-LENGTH"), SubLObjectFactory.makeSymbol("TOKENS")))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("NULL"), SubLObjectFactory.makeSymbol("TOKENS"))),
										ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("NEW-TOKEN-ADDED?"), NIL)),
												ConsesLow.list(SubLObjectFactory.makeSymbol("CSOME"), ConsesLow.list(SubLObjectFactory.makeSymbol("STRINGS"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-STRING-TOKENIZE-MULTIPLE"), ConsesLow.list(SubLObjectFactory.makeSymbol("CONSTRUCT-STRING-FROM-WORDS"), SubLObjectFactory.makeSymbol("TOKENS"), NIL, SubLObjectFactory.makeSymbol("TOKENIZING-STREAM"))), SubLObjectFactory.makeSymbol("NEW-TOKEN-ADDED?")),
														ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("PREFIXES"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-PREFIXES-MEMOIZED"), SubLObjectFactory.makeSymbol("TRIE"), SubLObjectFactory.makeSymbol("STRINGS"), SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"))), ConsesLow.list(SubLObjectFactory.makeSymbol("NEW-TOKEN"), NIL), ConsesLow.list(SubLObjectFactory.makeSymbol("LOCAL-CASE-SENSITIVITY"), SubLObjectFactory.makeSymbol("CASE-SENSITIVITY")), ConsesLow.list(SubLObjectFactory.makeSymbol("ITERATION-COUNT"), ZERO_INTEGER)),
																ConsesLow.list(SubLObjectFactory.makeSymbol("UNTIL"), ConsesLow.list(SubLObjectFactory.makeSymbol("COR"), ConsesLow.list(SubLObjectFactory.makeSymbol("LEXIFIED-WORD-P"), SubLObjectFactory.makeSymbol("NEW-TOKEN")), ConsesLow.list(SubLObjectFactory.makeSymbol("EMPTY-LIST-P"), SubLObjectFactory.makeSymbol("PREFIXES"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CINC"), SubLObjectFactory.makeSymbol("ITERATION-COUNT")), ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), ConsesLow.list(SubLObjectFactory.makeSymbol(">"), SubLObjectFactory.makeSymbol("ITERATION-COUNT"), TWENTY_INTEGER), ConsesLow.list(SubLObjectFactory.makeSymbol("BREAK"), SubLObjectFactory.makeString("20 iterations hit inside abstract-lexicon:lexify-sentence.  We seem to be stuck.  Please report this problem through standard bug-reporting channels. '~S'"), SubLObjectFactory.makeSymbol("SENTENCE"))),
																		ConsesLow.list(SubLObjectFactory.makeSymbol("POP-BIND"), ConsesLow.list(SubLObjectFactory.makeSymbol("RECORD"), SubLObjectFactory.makeSymbol("PREFIXES")), ConsesLow.list(SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ"), ConsesLow.list(SubLObjectFactory.makeSymbol("NEW-TOKEN"), SubLObjectFactory.makeSymbol("RECORD-LENGTH")), ConsesLow.list(SubLObjectFactory.makeSymbol("GET-LEX-ENTRIES-FOR-PREFIX"), SubLObjectFactory.makeSymbol("SELF"), SubLObjectFactory.makeSymbol("TOKENS"), SubLObjectFactory.makeSymbol("STRINGS"), SubLObjectFactory.makeSymbol("RECORD"), SubLObjectFactory.makeSymbol("LEXIFIED")))),
																		ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), ConsesLow.list(SubLObjectFactory.makeSymbol("CAND"), ConsesLow.list(SubLObjectFactory.makeSymbol("EMPTY-LIST-P"), SubLObjectFactory.makeSymbol("PREFIXES")), ConsesLow.list(SubLObjectFactory.makeSymbol("NULL"), ConsesLow.list(SubLObjectFactory.makeSymbol("WORD-INFO"), SubLObjectFactory.makeSymbol("NEW-TOKEN"))), ConsesLow.list(EQ, SubLObjectFactory.makeSymbol("LOCAL-CASE-SENSITIVITY"), SubLObjectFactory.makeKeyword("PREFERRED"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("LOCAL-CASE-SENSITIVITY"), SubLObjectFactory.makeKeyword("OFF")), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("PREFIXES"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-PREFIXES-MEMOIZED"), SubLObjectFactory.makeSymbol("TRIE"), SubLObjectFactory.makeSymbol("STRINGS"), SubLObjectFactory.makeSymbol("LOCAL-CASE-SENSITIVITY"))))),
																ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), ConsesLow.list(SubLObjectFactory.makeSymbol("WORD-P"), SubLObjectFactory.makeSymbol("NEW-TOKEN")), ConsesLow.list(SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ"), ConsesLow.list(SubLObjectFactory.makeSymbol("NEW-TOKEN"), SubLObjectFactory.makeSymbol("RECORD-LENGTH")), ConsesLow.list(SubLObjectFactory.makeSymbol("GET-LEX-ENTRIES-FOR-PREFIX"), SubLObjectFactory.makeSymbol("SELF"), SubLObjectFactory.makeSymbol("TOKENS"), SubLObjectFactory.makeSymbol("STRINGS"), NIL, SubLObjectFactory.makeSymbol("LEXIFIED")))), ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), ConsesLow.list(SubLObjectFactory.makeSymbol("="), SubLObjectFactory.makeSymbol("RECORD-LENGTH"), ZERO_INTEGER), ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSH"), SubLObjectFactory.makeSymbol("NEW-TOKEN"), SubLObjectFactory.makeSymbol("LEXIFIED-TOKENS")), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("NEW-TOKEN-ADDED?"), T))))))),
						ConsesLow.list(SubLObjectFactory.makeSymbol("CSETF"), ConsesLow.list(SubLObjectFactory.makeSymbol("SIGN-CONSTITUENTS"), SubLObjectFactory.makeSymbol("LEXIFIED")), ConsesLow.list(SubLObjectFactory.makeSymbol("APPLY"), ConsesLow.list(SubLObjectFactory.makeSymbol("FUNCTION"), SubLObjectFactory.makeSymbol("VECTOR")), ConsesLow.list(SubLObjectFactory.makeSymbol("NREVERSE"), SubLObjectFactory.makeSymbol("LEXIFIED-TOKENS")))),
						ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), ConsesLow.list(EQUAL, ConsesLow.list(SubLObjectFactory.makeSymbol("WORD-STRING"), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE-GET"), SubLObjectFactory.makeSymbol("LEXIFIED"), ZERO_INTEGER)), SubLObjectFactory.makeSymbol("FIRST-WORD")), ConsesLow.list(SubLObjectFactory.makeSymbol("WORD-UPDATE"), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE-GET"), SubLObjectFactory.makeSymbol("LEXIFIED"), ZERO_INTEGER), ConsesLow.list(SubLObjectFactory.makeSymbol("LIST"), SubLObjectFactory.makeKeyword("STRING"), ConsesLow.list(SubLObjectFactory.makeSymbol("REPLACE"), ConsesLow.list(SubLObjectFactory.makeSymbol("WORD-STRING"), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE-GET"), SubLObjectFactory.makeSymbol("LEXIFIED"), ZERO_INTEGER)), SubLObjectFactory.makeSymbol("FIRST-WORD"))))), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETF"), ConsesLow.list(SubLObjectFactory.makeSymbol("SIGN-STRING"), SubLObjectFactory.makeSymbol("LEXIFIED")), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE-STRING"), SubLObjectFactory.makeSymbol("SENTENCE"))),
						ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE-MOTHER"), SubLObjectFactory.makeSymbol("SENTENCE")), ConsesLow.list(SubLObjectFactory.makeSymbol("PARAGRAPH-SET"), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE-MOTHER"), SubLObjectFactory.makeSymbol("SENTENCE")), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE-INDEX"), SubLObjectFactory.makeSymbol("SENTENCE")), SubLObjectFactory.makeSymbol("LEXIFIED"))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("LEXIFIED")) }));
		$sym493$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym494$SENTENCE_P = SubLObjectFactory.makeSymbol("SENTENCE-P");
		$str495$20_iterations_hit_inside_abstract = SubLObjectFactory.makeString("20 iterations hit inside abstract-lexicon:lexify-sentence.  We seem to be stuck.  Please report this problem through standard bug-reporting channels. '~S'");
		$sym496$ABSTRACT_LEXICON_LEXIFY_SENTENCE_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-LEXIFY-SENTENCE-METHOD");
		$list497 = ConsesLow.list(SubLObjectFactory.makeString("@param sentence sentence-p;\n   @return sentence-p; a new version of SENTENCE with all possible lexical matches included.  \n   The document will contain exhaustive-word-p's, each of which will contain zero or more \n   word-p's with attached nl-trie-entries"), ConsesLow.list(SubLObjectFactory.makeSymbol("CHECK-TYPE"), SubLObjectFactory.makeSymbol("SENTENCE"), SubLObjectFactory.makeSymbol("SENTENCE-P")), ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), ConsesLow.list(SubLObjectFactory.makeSymbol("ZEROP"), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE-LENGTH"), SubLObjectFactory.makeSymbol("SENTENCE"))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("SENTENCE"))),
				ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("LEXIFIED"), ConsesLow.list(SubLObjectFactory.makeSymbol("NEW-SENTENCE"))), ConsesLow.list(SubLObjectFactory.makeSymbol("WORD-VEC"), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE-YIELD"), SubLObjectFactory.makeSymbol("SENTENCE"))), ConsesLow.list(SubLObjectFactory.makeSymbol("FIRST-WORD"), ConsesLow.list(SubLObjectFactory.makeSymbol("WORD-STRING"), ConsesLow.list(SubLObjectFactory.makeSymbol("AREF"), SubLObjectFactory.makeSymbol("WORD-VEC"), ZERO_INTEGER))), ConsesLow.list(SubLObjectFactory.makeSymbol("EXHAUSTIVE-WORDS"), NIL), SubLObjectFactory.makeSymbol("WORDS")), ConsesLow.list(SubLObjectFactory.makeSymbol("TAGGER-NORMALIZE-INITIAL-CAPITALIZATION"), ConsesLow.list(SubLObjectFactory.makeSymbol("GET-TAGGER")), SubLObjectFactory.makeSymbol("WORD-VEC")), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("WORDS"), ConsesLow.list(SubLObjectFactory.makeSymbol("VECTOR-ELEMENTS"), SubLObjectFactory.makeSymbol("WORD-VEC"))),
						ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("*LEXICON-LOOKUP-MT*"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("InferencePSC")))),
								ConsesLow.list(SubLObjectFactory.makeSymbol("CDO"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("INDEX"), ZERO_INTEGER, ConsesLow.list(SubLObjectFactory.makeSymbol("+"), SubLObjectFactory.makeSymbol("INDEX"), ONE_INTEGER)), ConsesLow.list(SubLObjectFactory.makeSymbol("TOKENS"), SubLObjectFactory.makeSymbol("WORDS"), ConsesLow.list(SubLObjectFactory.makeSymbol("CDR"), SubLObjectFactory.makeSymbol("TOKENS"))), ConsesLow.list(SubLObjectFactory.makeSymbol("STRINGS"), ConsesLow.list(SubLObjectFactory.makeSymbol("MAPCAR"), ConsesLow.list(SubLObjectFactory.makeSymbol("FUNCTION"), SubLObjectFactory.makeSymbol("WORD-STRING")), SubLObjectFactory.makeSymbol("TOKENS")), ConsesLow.list(SubLObjectFactory.makeSymbol("CDR"), SubLObjectFactory.makeSymbol("STRINGS")))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("NULL"), SubLObjectFactory.makeSymbol("TOKENS"))),
										ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("PREFIXES"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-PREFIXES-MEMOIZED"), SubLObjectFactory.makeSymbol("TRIE"), SubLObjectFactory.makeSymbol("STRINGS"), SubLObjectFactory.makeSymbol("CASE-SENSITIVITY"))), ConsesLow.list(SubLObjectFactory.makeSymbol("PARENT-WORD"), ConsesLow.list(SubLObjectFactory.makeSymbol("NEW-EXHAUSTIVE-WORD-FROM-WORD"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIRST"), SubLObjectFactory.makeSymbol("TOKENS")))), ConsesLow.list(SubLObjectFactory.makeSymbol("PREFIX-WORDS"), ConsesLow.list(SubLObjectFactory.makeSymbol("GET-ALL-PREFIX-WORDS"), SubLObjectFactory.makeSymbol("SELF"), SubLObjectFactory.makeSymbol("PREFIXES"), SubLObjectFactory.makeSymbol("TOKENS"), SubLObjectFactory.makeSymbol("STRINGS"), SubLObjectFactory.makeSymbol("LEXIFIED"), SubLObjectFactory.makeSymbol("PARENT-WORD")))),
												ConsesLow.list(SubLObjectFactory.makeSymbol("CSETF"), ConsesLow.list(SubLObjectFactory.makeSymbol("SIGN-CONSTITUENTS"), SubLObjectFactory.makeSymbol("PARENT-WORD")), ConsesLow.list(SubLObjectFactory.makeSymbol("APPLY"), ConsesLow.list(SubLObjectFactory.makeSymbol("FUNCTION"), SubLObjectFactory.makeSymbol("VECTOR")), SubLObjectFactory.makeSymbol("PREFIX-WORDS"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSH"), SubLObjectFactory.makeSymbol("PARENT-WORD"), SubLObjectFactory.makeSymbol("EXHAUSTIVE-WORDS"))))),
						ConsesLow.list(SubLObjectFactory.makeSymbol("CSETF"), ConsesLow.list(SubLObjectFactory.makeSymbol("SIGN-CONSTITUENTS"), SubLObjectFactory.makeSymbol("LEXIFIED")), ConsesLow.list(SubLObjectFactory.makeSymbol("APPLY"), ConsesLow.list(SubLObjectFactory.makeSymbol("FUNCTION"), SubLObjectFactory.makeSymbol("VECTOR")), ConsesLow.list(SubLObjectFactory.makeSymbol("NREVERSE"), SubLObjectFactory.makeSymbol("EXHAUSTIVE-WORDS")))),
						ConsesLow.list(SubLObjectFactory.makeSymbol("CDOLIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIRST-WORD-OBJ"), ConsesLow.list(SubLObjectFactory.makeSymbol("CONS"), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE-GET"), SubLObjectFactory.makeSymbol("LEXIFIED"), ZERO_INTEGER), ConsesLow.list(SubLObjectFactory.makeSymbol("VECTOR-ELEMENTS"), ConsesLow.list(SubLObjectFactory.makeSymbol("WORD-CONSTITUENTS"), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE-GET"), SubLObjectFactory.makeSymbol("LEXIFIED"), ZERO_INTEGER))))), ConsesLow.list(SubLObjectFactory.makeSymbol("WORD-UPDATE"), SubLObjectFactory.makeSymbol("FIRST-WORD-OBJ"), ConsesLow.list(SubLObjectFactory.makeSymbol("LIST"), SubLObjectFactory.makeKeyword("STRING"), ConsesLow.list(SubLObjectFactory.makeSymbol("REPLACE"), ConsesLow.list(SubLObjectFactory.makeSymbol("WORD-STRING"), SubLObjectFactory.makeSymbol("FIRST-WORD-OBJ")), SubLObjectFactory.makeSymbol("FIRST-WORD"))))),
						ConsesLow.list(SubLObjectFactory.makeSymbol("CSETF"), ConsesLow.list(SubLObjectFactory.makeSymbol("SIGN-STRING"), SubLObjectFactory.makeSymbol("LEXIFIED")), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE-STRING"), SubLObjectFactory.makeSymbol("SENTENCE"))), ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE-MOTHER"), SubLObjectFactory.makeSymbol("SENTENCE")), ConsesLow.list(SubLObjectFactory.makeSymbol("PARAGRAPH-SET"), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE-MOTHER"), SubLObjectFactory.makeSymbol("SENTENCE")), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE-INDEX"), SubLObjectFactory.makeSymbol("SENTENCE")), SubLObjectFactory.makeSymbol("LEXIFIED"))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("LEXIFIED")) }));
		$sym498$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym499$ABSTRACT_LEXICON_LEXIFY_SENTENCE_EXHAUSTIVELY_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-LEXIFY-SENTENCE-EXHAUSTIVELY-METHOD");
		$str500$ = SubLObjectFactory.makeString("");
		$str501$_ = SubLObjectFactory.makeString("'");
		$str502$word_has_no_offset = SubLObjectFactory.makeString("word has no offset");
		$kw503$CATEGORY = SubLObjectFactory.makeKeyword("CATEGORY");
		$kw504$MOTHER = SubLObjectFactory.makeKeyword("MOTHER");
		$kw505$INFO = SubLObjectFactory.makeKeyword("INFO");
		$kw506$OFFSET = SubLObjectFactory.makeKeyword("OFFSET");
		$list507 = ConsesLow.list(SubLObjectFactory.makeKeyword("VB"), SubLObjectFactory.makeKeyword("VBN"), SubLObjectFactory.makeKeyword("VBZ"), SubLObjectFactory.makeKeyword("VBD"));
		$list508 = ConsesLow.list(SubLObjectFactory.makeKeyword("CD"));
		$const509$multiWordString = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("multiWordString"));
		$kw510$BACKOFF_PENN_TAGS = SubLObjectFactory.makeKeyword("BACKOFF-PENN-TAGS");
		$sym511$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
		$sym512$GET_CATEGORY = SubLObjectFactory.makeSymbol("GET-CATEGORY");
		$list513 = ConsesLow.list(SubLObjectFactory.makeKeyword("NNP"), SubLObjectFactory.makeKeyword("NNPS"), SubLObjectFactory.makeKeyword("NN"), SubLObjectFactory.makeKeyword("NNS"));
		$sym514$LEXIFY_WORDS = SubLObjectFactory.makeSymbol("LEXIFY-WORDS");
		$list515 = ConsesLow.list(SubLObjectFactory.makeSymbol("WORDS"));
		$list516 = ConsesLow.list(SubLObjectFactory.makeString("@param WORDS listp;\n   @return listp; a list of <string, category, lex-entries> triples for WORDS, where\n   STRING may be several of WORDS collapsed into a single entry"), ConsesLow.list(SubLObjectFactory.makeSymbol("CHECK-TYPE"), SubLObjectFactory.makeSymbol("WORDS"), SubLObjectFactory.makeSymbol("LISTP")),
				ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("RECORD-LENGTH"), ZERO_INTEGER), ConsesLow.list(SubLObjectFactory.makeSymbol("LEXIFIED-TOKENS"), NIL), SubLObjectFactory.makeSymbol("CATEGORY"), SubLObjectFactory.makeSymbol("STRING")),
						ConsesLow.list(SubLObjectFactory.makeSymbol("CDO"),
								ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("INDEX"), ZERO_INTEGER, ConsesLow.list(SubLObjectFactory.makeSymbol("+"), SubLObjectFactory.makeSymbol("INDEX"), SubLObjectFactory.makeSymbol("RECORD-LENGTH"))), ConsesLow.list(SubLObjectFactory.makeSymbol("TOKENS"), SubLObjectFactory.makeSymbol("WORDS"), ConsesLow.list(SubLObjectFactory.makeSymbol("NTHCDR"), SubLObjectFactory.makeSymbol("RECORD-LENGTH"), SubLObjectFactory.makeSymbol("TOKENS"))), ConsesLow.list(SubLObjectFactory.makeSymbol("STRINGS"), ConsesLow.list(SubLObjectFactory.makeSymbol("MAPCAR"), ConsesLow.list(SubLObjectFactory.makeSymbol("FUNCTION"), SubLObjectFactory.makeSymbol("GET-PARSE-TREE-STRING")), SubLObjectFactory.makeSymbol("TOKENS")), ConsesLow.list(SubLObjectFactory.makeSymbol("NTHCDR"), SubLObjectFactory.makeSymbol("RECORD-LENGTH"), SubLObjectFactory.makeSymbol("STRINGS"))),
										ConsesLow.list(SubLObjectFactory.makeSymbol("RECORDS"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-PREFIXES"), SubLObjectFactory.makeSymbol("TRIE"), SubLObjectFactory.makeSymbol("STRINGS"), SubLObjectFactory.makeSymbol("CASE-SENSITIVITY")), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-PREFIXES"), SubLObjectFactory.makeSymbol("TRIE"), SubLObjectFactory.makeSymbol("STRINGS"), SubLObjectFactory.makeSymbol("CASE-SENSITIVITY")))),
								ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("NULL"), SubLObjectFactory.makeSymbol("TOKENS"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("RECORDS"), ConsesLow.list(SubLObjectFactory.makeSymbol("ADD-TO-END"), ConsesLow.list(SubLObjectFactory.makeSymbol("NEW-NL-TRIE-RECORD"), ConsesLow.list(SubLObjectFactory.makeSymbol("LIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIRST"), SubLObjectFactory.makeSymbol("TOKENS")), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET-STRING")))), NIL), SubLObjectFactory.makeSymbol("RECORDS"))),
								ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(SubLObjectFactory.makeSymbol("NEW-TOKEN-ADDED-FOR-PREFIXE")),
										ConsesLow.list(SubLObjectFactory.makeSymbol("CSOME"), ConsesLow.list(SubLObjectFactory.makeSymbol("RECORD"), SubLObjectFactory.makeSymbol("RECORDS"), SubLObjectFactory.makeSymbol("NEW-TOKEN-ADDED-FOR-PREFIXE")), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("RECORD-LENGTH"), ConsesLow.list(SubLObjectFactory.makeSymbol("LENGTH"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-RECORD-KEY"), SubLObjectFactory.makeSymbol("RECORD")))), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("STRING"), ConsesLow.list(SubLObjectFactory.makeSymbol("BUILD-MULTI-WORD-LEXEME"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIRST-N"), SubLObjectFactory.makeSymbol("RECORD-LENGTH"), SubLObjectFactory.makeSymbol("STRINGS")))), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("CATEGORY"), ConsesLow.list(SubLObjectFactory.makeSymbol("GUESS-CATEGORY"), SubLObjectFactory.makeSymbol("SELF"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("TOKENS"))),
												ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("LEX-ENTRIES"), NIL), SubLObjectFactory.makeSymbol("LEX-ENTRIES0"), SubLObjectFactory.makeSymbol("EXISTS?")), ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), SubLObjectFactory.makeSymbol("IGNORE-CACHE?"), ConsesLow.list(SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ"), ConsesLow.list(SubLObjectFactory.makeSymbol("LEX-ENTRIES0"), SubLObjectFactory.makeSymbol("EXISTS?")), ConsesLow.list(SubLObjectFactory.makeSymbol("CACHE-GET"), SubLObjectFactory.makeSymbol("CACHE"), SubLObjectFactory.makeSymbol("STRING")))),
														ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), SubLObjectFactory.makeSymbol("EXISTS?"),
																ConsesLow.list(SubLObjectFactory.makeSymbol("CDOLIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-RECORD-ENTRIES"), SubLObjectFactory.makeSymbol("RECORD"))), ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("VALID-NL-TRIE-ENTRY?")), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), ConsesLow.list(SubLObjectFactory.makeSymbol("CDOLIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("LEX-ENTRY"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES")), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSH"), SubLObjectFactory.makeSymbol("LEX-ENTRY"), SubLObjectFactory.makeSymbol("LEX-ENTRIES0"))))),
																ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), SubLObjectFactory.makeSymbol("IGNORE-CACHE?"), ConsesLow.list(SubLObjectFactory.makeSymbol("CACHE-SET"), SubLObjectFactory.makeSymbol("CACHE"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("LEX-ENTRIES0")))),
														ConsesLow.list(SubLObjectFactory.makeSymbol("CDOLIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("LEX-ENTRY"), SubLObjectFactory.makeSymbol("LEX-ENTRIES0")), ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), ConsesLow.list(SubLObjectFactory.makeSymbol("MEMBER?"), SubLObjectFactory.makeSymbol("CATEGORY"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("LEX-ENTRY"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET")), SubLObjectFactory.makeKeyword("PENN-TAGS"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSHNEW"), SubLObjectFactory.makeSymbol("LEX-ENTRY"), SubLObjectFactory.makeSymbol("LEX-ENTRIES"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("LEX-ENTRY-EQUAL-P"))))),
														ConsesLow.list(SubLObjectFactory.makeSymbol("PUNLESS"), SubLObjectFactory.makeSymbol("LEX-ENTRIES"), ConsesLow.list(SubLObjectFactory.makeSymbol("CDOLIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("LEX-ENTRY"), SubLObjectFactory.makeSymbol("LEX-ENTRIES0")), ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), ConsesLow.list(SubLObjectFactory.makeSymbol("MEMBER?"), SubLObjectFactory.makeSymbol("CATEGORY"), ConsesLow.list(SubLObjectFactory.makeSymbol("FIM"), SubLObjectFactory.makeSymbol("LEX-ENTRY"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET")), SubLObjectFactory.makeKeyword("BACKOFF-PENN-TAGS"))), ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSHNEW"), SubLObjectFactory.makeSymbol("LEX-ENTRY"), SubLObjectFactory.makeSymbol("LEX-ENTRIES"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("LEX-ENTRY-EQUAL-P")))))),
														ConsesLow.list(SubLObjectFactory.makeSymbol("PWHEN"), ConsesLow.list(SubLObjectFactory.makeSymbol("COR"), SubLObjectFactory.makeSymbol("LEX-ENTRIES"), ConsesLow.list(SubLObjectFactory.makeSymbol("NULL"), ConsesLow.list(SubLObjectFactory.makeSymbol("NL-TRIE-RECORD-ENTRIES"), SubLObjectFactory.makeSymbol("RECORD")))), ConsesLow.list(SubLObjectFactory.makeSymbol("PROGN"), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("NEW-TOKEN-ADDED-FOR-PREFIXE"), T), ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSH"), ConsesLow.list(SubLObjectFactory.makeSymbol("LIST"), SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("CATEGORY"), SubLObjectFactory.makeSymbol("LEX-ENTRIES")), SubLObjectFactory.makeSymbol("LEXIFIED-TOKENS")))))))),
						ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("NREVERSE"), SubLObjectFactory.makeSymbol("LEXIFIED-TOKENS")))));
		$sym517$OUTER_CATCH_FOR_ABSTRACT_LEXICON_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-LEXICON-METHOD");
		$sym518$GET_PARSE_TREE_STRING = SubLObjectFactory.makeSymbol("GET-PARSE-TREE-STRING");
		$sym519$ABSTRACT_LEXICON_LEXIFY_WORDS_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-LEXIFY-WORDS-METHOD");
		$str520$_ = SubLObjectFactory.makeString(" ");
		$sym521$TOKENIZE = SubLObjectFactory.makeSymbol("TOKENIZE");
		$list522 = ConsesLow.list(SubLObjectFactory.makeString("@param STRING stringp; an English string\n   @return listp; a list of English string tokens from STRING\n   @note Not the most efficient way since words and lexical entries are painfully constructed\n   and then discarded...this should duplicate only the tokenization part of the 'lexify method"),
				ConsesLow.list(SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("WORDS"), ConsesLow.list(SubLObjectFactory.makeSymbol("LEXIFY-SENTENCE"), SubLObjectFactory.makeSymbol("SELF"), ConsesLow.list(SubLObjectFactory.makeSymbol("NEW-SENTENCE"), SubLObjectFactory.makeSymbol("STRING"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("FST-STRING-WORDIFY"))))), ConsesLow.list(SubLObjectFactory.makeSymbol("STRINGS"), NIL)), ConsesLow.list(SubLObjectFactory.makeSymbol("SENTENCE-DO-WORDS"), ConsesLow.list(SubLObjectFactory.makeSymbol("WORD"), SubLObjectFactory.makeSymbol("WORDS")), ConsesLow.list(SubLObjectFactory.makeSymbol("CPUSH"), ConsesLow.list(SubLObjectFactory.makeSymbol("WORD-STRING"), SubLObjectFactory.makeSymbol("WORD")), SubLObjectFactory.makeSymbol("STRINGS"))), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("NREVERSE"), SubLObjectFactory.makeSymbol("STRINGS")))));
		$sym523$FST_STRING_WORDIFY = SubLObjectFactory.makeSymbol("FST-STRING-WORDIFY");
		$sym524$ABSTRACT_LEXICON_TOKENIZE_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-TOKENIZE-METHOD");
		$list525 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("LEX-ENTRY"), SubLObjectFactory.makeSymbol("LEXICON")), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
		$sym526$ITERATOR = SubLObjectFactory.makeUninternedSymbol("ITERATOR");
		$sym527$CLET = SubLObjectFactory.makeSymbol("CLET");
		$sym528$NEW_LEXICON_ITERATOR = SubLObjectFactory.makeSymbol("NEW-LEXICON-ITERATOR");
		$sym529$UNTIL = SubLObjectFactory.makeSymbol("UNTIL");
		$sym530$ITERATION_DONE = SubLObjectFactory.makeSymbol("ITERATION-DONE");
		$sym531$ITERATION_NEXT = SubLObjectFactory.makeSymbol("ITERATION-NEXT");
		$sym532$FIM = SubLObjectFactory.makeSymbol("FIM");
		$list533 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), SubLObjectFactory.makeSymbol("GET")), SubLObjectFactory.makeKeyword("STRING"));
		$sym534$ITERATOR = SubLObjectFactory.makeSymbol("ITERATOR");
		$list535 = ConsesLow.list(SubLObjectFactory.makeString("@return iterator-p; an iterator for this lexicon"), ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), ConsesLow.list(SubLObjectFactory.makeSymbol("NEW-LEXICON-ITERATOR"), SubLObjectFactory.makeSymbol("SELF"))));
		$sym536$ABSTRACT_LEXICON_ITERATOR_METHOD = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-METHOD");
		$sym537$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
		$sym538$NEW_LEXICON_FROM_KB_SPEC = SubLObjectFactory.makeSymbol("NEW-LEXICON-FROM-KB-SPEC");
		$list539 = ConsesLow.list(SubLObjectFactory.makeSymbol("KB-SPEC"));
		$str540$_param_KB_SPEC__the_CycL_type_of_ = SubLObjectFactory.makeString("@param KB-SPEC; the CycL type of the lexicon that you want to create.  This must be a specialization of #$AbstractLexiconSpecification\n   @return ABSTRACT-LEXICON-P; the fully-instantiated lexicon object");
		$list541 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("KB-SPEC"), SubLObjectFactory.makeSymbol("FORT-P")));
		$list542 = ConsesLow.list(SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-P"));
		$sym543$_CLASS_NAME = SubLObjectFactory.makeSymbol("?CLASS-NAME");
		$const544$objectClassName = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("objectClassName"));
		$list545 = ConsesLow.list(SubLObjectFactory.makeSymbol("?CLASS-NAME"));
		$sym546$PREDS_FOR_LEXICON_EXCLUSION = SubLObjectFactory.makeSymbol("PREDS-FOR-LEXICON-EXCLUSION");
		$sym547$_PRED = SubLObjectFactory.makeSymbol("?PRED");
		$const548$disallowedLexicalPredicate = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("disallowedLexicalPredicate"));
		$list549 = ConsesLow.list(SubLObjectFactory.makeSymbol("?PRED"));
		$list550 = ConsesLow.list(SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER);
		$sym551$_PREDS_FOR_LEXICON_EXCLUSION_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PREDS-FOR-LEXICON-EXCLUSION-CACHING-STATE*");
		$sym552$CLEAR_PREDS_FOR_LEXICON_EXCLUSION = SubLObjectFactory.makeSymbol("CLEAR-PREDS-FOR-LEXICON-EXCLUSION");
		$sym553$ABSTRACT_LEXICON_ITERATOR_STATE_DONE_P = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-DONE-P");
		$sym554$ABSTRACT_LEXICON_ITERATOR_STATE_NEXT = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-NEXT");
		$sym555$ABSTRACT_LEXICON_ITERATOR_STATE = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE");
		$sym556$ABSTRACT_LEXICON_ITERATOR_STATE_P = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-P");
		$list557 = ConsesLow.list(SubLObjectFactory.makeSymbol("TRIE-ITERATOR"), SubLObjectFactory.makeSymbol("NEXT-ENTRIES"), SubLObjectFactory.makeSymbol("LEXICON"));
		$list558 = ConsesLow.list(SubLObjectFactory.makeKeyword("TRIE-ITERATOR"), SubLObjectFactory.makeKeyword("NEXT-ENTRIES"), SubLObjectFactory.makeKeyword("LEXICON"));
		$list559 = ConsesLow.list(SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-TRIE-ITERATOR"), SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-NEXT-ENTRIES"), SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-LEXICON"));
		$list560 = ConsesLow.list(SubLObjectFactory.makeSymbol("_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-TRIE-ITERATOR"), SubLObjectFactory.makeSymbol("_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-NEXT-ENTRIES"), SubLObjectFactory.makeSymbol("_CSETF-ABSTRACT-LEXICON-ITERATOR-STATE-LEXICON"));
		$sym561$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
		$sym562$ABSTRACT_LEXICON_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");
		$list563 = ConsesLow.list(SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON-ITERATOR-STATE-P"));
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
		$list575 = ConsesLow.list(SubLObjectFactory.makeSymbol("KEY"), SubLObjectFactory.makeSymbol("TRIE-ENTRIES"));
		$list576 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("TERM"), SubLObjectFactory.makeSymbol("FORMULA")), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
		$sym577$STACK = SubLObjectFactory.makeUninternedSymbol("STACK");
		$sym578$ENTRY = SubLObjectFactory.makeUninternedSymbol("ENTRY");
		$list579 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("CREATE-STACK")));
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
		$list596 = ConsesLow.list(new SubLObject[] { ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("0.4")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("0.4"), SubLObjectFactory.makeDouble(0.4)))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("-0.4")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("-0.4"), SubLObjectFactory.makeDouble(-0.4)))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("-.4")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("-.4"), SubLObjectFactory.makeDouble(-0.4)))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("0.4%")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("0.4%"), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Percent")), SubLObjectFactory.makeDouble(0.4))))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("4%")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("4%"), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Percent")), FOUR_INTEGER)))),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString(".4%")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString(".4%"), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Percent")), SubLObjectFactory.makeDouble(0.4))))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("-0.4%")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("-0.4%"), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Percent")), SubLObjectFactory.makeDouble(-0.4))))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("-.4%")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("-.4%"), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Percent")), SubLObjectFactory.makeDouble(-0.4))))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("-4%")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("-4%"), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Percent")), SubLObjectFactory.makeInteger(-4))))) });
		$sym597$TEXT_NUMBERS = SubLObjectFactory.makeSymbol("TEXT-NUMBERS");
		$list598 = ConsesLow.list(ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("3.4   billion dogs and 2 cats")), ConsesLow.list(SubLObjectFactory.makeString("3.4   billion"), SubLObjectFactory.makeString("2"))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("3.4   billion 2")), ConsesLow.list(SubLObjectFactory.makeString("3.4   billion"), SubLObjectFactory.makeString("2"))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("3.1415926 is pi")), ConsesLow.list(SubLObjectFactory.makeString("3.1415926"))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("November 12 1832")), ConsesLow.list(SubLObjectFactory.makeString("12"), SubLObjectFactory.makeString("1832"))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("3.1415926, 2.3456789 and 1.3254 are numbers")), ConsesLow.list(SubLObjectFactory.makeString("3.1415926"), SubLObjectFactory.makeString("2.3456789"), SubLObjectFactory.makeString("1.3254"))),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("3.1415926, -2.3456789 and 1.3254 are numbers")), ConsesLow.list(SubLObjectFactory.makeString("3.1415926"), SubLObjectFactory.makeString("-2.3456789"), SubLObjectFactory.makeString("1.3254"))));
		$list599 = ConsesLow.list(SubLObjectFactory.makeSymbol("STRING1"), SubLObjectFactory.makeSymbol("NUMBER1"));
		$list600 = ConsesLow.list(SubLObjectFactory.makeSymbol("STRING2"), SubLObjectFactory.makeSymbol("NUMBER2"));
		$sym601$NUMBER_MEANINGS_EQUAL_ = SubLObjectFactory.makeSymbol("NUMBER-MEANINGS-EQUAL?");
		$sym602$NUMBER_MEANINGS = SubLObjectFactory.makeSymbol("NUMBER-MEANINGS");
		$sym603$NUMBER_MEANINGS_RESULTS_EQUAL_ = SubLObjectFactory.makeSymbol("NUMBER-MEANINGS-RESULTS-EQUAL?");
		$list604 = ConsesLow.list(ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("3.4   billion dogs and 2 cats")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("2"), TWO_INTEGER), ConsesLow.list(SubLObjectFactory.makeString("3.4   billion"), SubLObjectFactory.makeDouble(3.4E9)))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("3.1415926 is pi")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("3.1415926"), SubLObjectFactory.makeDouble(3.1415926)))), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("3.1415926, 2.3456789 and 1.3254 are numbers")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("1.3254"), SubLObjectFactory.makeDouble(1.3254)), ConsesLow.list(SubLObjectFactory.makeString("2.3456789"), SubLObjectFactory.makeDouble(2.3456789)), ConsesLow.list(SubLObjectFactory.makeString("3.1415926"), SubLObjectFactory.makeDouble(3.1415926)))),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("3.1415926, -2.3456789 and 1.3254 are numbers")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("1.3254"), SubLObjectFactory.makeDouble(1.3254)), ConsesLow.list(SubLObjectFactory.makeString("-2.3456789"), SubLObjectFactory.makeDouble(-2.3456789)), ConsesLow.list(SubLObjectFactory.makeString("3.1415926"), SubLObjectFactory.makeDouble(3.1415926)))));
		$sym605$TOKENIZING_TEST_COVERING = SubLObjectFactory.makeSymbol("TOKENIZING-TEST-COVERING");
		$list606 = ConsesLow.list(ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("glyceraldehdyde 3-phosphate (G3P) sleep"), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Glyceraldehyde3Phosphate")))), NIL), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("glyceraldehdyde 3-phosphate (G3P)"), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Glyceraldehyde3Phosphate")))), T));
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

		public $textract_lemma_native()
		{
			this.$paragraph = CommonSymbols.NIL;
			this.$sentence = CommonSymbols.NIL;
			this.$word = CommonSymbols.NIL;
			this.$string = CommonSymbols.NIL;
			this.$canon = CommonSymbols.NIL;
			this.$type = CommonSymbols.NIL;
		}

		@Override
		public SubLStructDecl getStructDecl()
		{
			return (SubLStructDecl) $textract_lemma_native.structDecl;
		}

		@Override
		public SubLObject getField2()
		{
			return this.$paragraph;
		}

		@Override
		public SubLObject getField3()
		{
			return this.$sentence;
		}

		@Override
		public SubLObject getField4()
		{
			return this.$word;
		}

		@Override
		public SubLObject getField5()
		{
			return this.$string;
		}

		@Override
		public SubLObject getField6()
		{
			return this.$canon;
		}

		@Override
		public SubLObject getField7()
		{
			return this.$type;
		}

		@Override
		public SubLObject setField2(final SubLObject value)
		{
			return this.$paragraph = value;
		}

		@Override
		public SubLObject setField3(final SubLObject value)
		{
			return this.$sentence = value;
		}

		@Override
		public SubLObject setField4(final SubLObject value)
		{
			return this.$word = value;
		}

		@Override
		public SubLObject setField5(final SubLObject value)
		{
			return this.$string = value;
		}

		@Override
		public SubLObject setField6(final SubLObject value)
		{
			return this.$canon = value;
		}

		@Override
		public SubLObject setField7(final SubLObject value)
		{
			return this.$type = value;
		}

		static
		{
			structDecl = Structures.makeStructDeclNative((Class) $textract_lemma_native.class, $sym10$TEXTRACT_LEMMA, $sym11$TEXTRACT_LEMMA_P, $list12, $list13, new String[] { "$paragraph", "$sentence", "$word", "$string", "$canon", "$type" }, $list14, $list15, $sym16$TEXTRACT_LEMMA_PRINT);
		}
	}

	public static final class $textract_lemma_p$UnaryFunction extends UnaryFunction
	{
		public $textract_lemma_p$UnaryFunction()
		{
			super(SubLTranslatedFile.extractFunctionNamed("TEXTRACT-LEMMA-P"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1)
		{
			return textract_lemma_p(arg1);
		}
	}

	public static final class $clear_preds_for_lexicon_exclusion$ZeroArityFunction extends ZeroArityFunction
	{
		public $clear_preds_for_lexicon_exclusion$ZeroArityFunction()
		{
			super(SubLTranslatedFile.extractFunctionNamed("CLEAR-PREDS-FOR-LEXICON-EXCLUSION"));
		}

		@Override
		public SubLObject processItem()
		{
			return clear_preds_for_lexicon_exclusion();
		}
	}

	public static final class $abstract_lexicon_iterator_state_native extends SubLStructNative
	{
		public SubLObject $trie_iterator;
		public SubLObject $next_entries;
		public SubLObject $lexicon;
		private static final SubLStructDeclNative structDecl;

		public $abstract_lexicon_iterator_state_native()
		{
			this.$trie_iterator = CommonSymbols.NIL;
			this.$next_entries = CommonSymbols.NIL;
			this.$lexicon = CommonSymbols.NIL;
		}

		@Override
		public SubLStructDecl getStructDecl()
		{
			return (SubLStructDecl) $abstract_lexicon_iterator_state_native.structDecl;
		}

		@Override
		public SubLObject getField2()
		{
			return this.$trie_iterator;
		}

		@Override
		public SubLObject getField3()
		{
			return this.$next_entries;
		}

		@Override
		public SubLObject getField4()
		{
			return this.$lexicon;
		}

		@Override
		public SubLObject setField2(final SubLObject value)
		{
			return this.$trie_iterator = value;
		}

		@Override
		public SubLObject setField3(final SubLObject value)
		{
			return this.$next_entries = value;
		}

		@Override
		public SubLObject setField4(final SubLObject value)
		{
			return this.$lexicon = value;
		}

		static
		{
			structDecl = Structures.makeStructDeclNative((Class) $abstract_lexicon_iterator_state_native.class, $sym555$ABSTRACT_LEXICON_ITERATOR_STATE, $sym556$ABSTRACT_LEXICON_ITERATOR_STATE_P, $list557, $list558, new String[] { "$trie_iterator", "$next_entries", "$lexicon" }, $list559, $list560, $sym561$DEFAULT_STRUCT_PRINT_FUNCTION);
		}
	}

	public static final class $abstract_lexicon_iterator_state_p$UnaryFunction extends UnaryFunction
	{
		public $abstract_lexicon_iterator_state_p$UnaryFunction()
		{
			super(SubLTranslatedFile.extractFunctionNamed("ABSTRACT-LEXICON-ITERATOR-STATE-P"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1)
		{
			return abstract_lexicon_iterator_state_p(arg1);
		}
	}
}

/*

	Total time: 3214 ms
	 synthetic
*/