package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import java.util.Map;
import java.util.Iterator;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class lexicon_accessors extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.lexicon_accessors";
    public static final String myFingerPrint = "cff6f0e453e2d62571677ec198f0293d2be78f7bbaf5f1ef400f1c1af4356775";
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 4034L)
    private static SubLSymbol $genl_lexicon_mtP_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 6970L)
    private static SubLSymbol $max_preds_matching_pos_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 7786L)
    private static SubLSymbol $max_preds_of_pos_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 8068L)
    private static SubLSymbol $max_preds_licensed_by_pos_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9290L)
    private static SubLSymbol $speech_part_pred_min_ceilings_int_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9644L)
    private static SubLSymbol $speech_part_pred_max_floors_int_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9905L)
    private static SubLSymbol $pos_of_pred_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 11534L)
    private static SubLSymbol $derived_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 13396L)
    private static SubLSymbol $speech_part_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 16019L)
    private static SubLSymbol $genl_pos_predP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 16459L)
    private static SubLSymbol $genl_pos_pred_from_mt_infoP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 18231L)
    private static SubLSymbol $get_strings_of_type_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 23989L)
    private static SubLSymbol $pos_for_keyword_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 30628L)
    private static SubLSymbol $preds_of_stringXword_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 35522L)
    private static SubLSymbol $closed_lexical_class_strings$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 35666L)
    private static SubLSymbol $closed_lexical_class_strings_case_insensitive$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 38918L)
    private static SubLSymbol $closed_lexical_class_strings_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 39816L)
    private static SubLSymbol $closed_lexical_classes_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 39962L)
    private static SubLSymbol $preposition_strings$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 41351L)
    private static SubLSymbol $pos_forms_spec_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 42481L)
    private static SubLSymbol $vulgar_words$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 46419L)
    private static SubLSymbol $verb_only_stringP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 91970L)
    private static SubLSymbol $indirect_lexical_assertionP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 102320L)
    private static SubLSymbol $agr_of_det_string_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 104254L)
    private static SubLSymbol $pos_to_semtrans_pred_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 104643L)
    private static SubLSymbol $semtrans_pred_to_pos_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 106257L)
    private static SubLSymbol $speech_parts$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 108049L)
    private static SubLSymbol $genl_posP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 108922L)
    public static SubLSymbol $most_general_speech_part$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 109963L)
    private static SubLSymbol $compositional_pos_nart_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 113298L)
    private static SubLSymbol $relational_noun_denot_templates$;
    private static final SubLObject $const0$UniversalVocabularyMt;
    private static final SubLObject $const1$InferencePSC;
    private static final SubLSymbol $sym2$GENL_LEXICON_MT__CACHED;
    private static final SubLSymbol $sym3$_GENL_LEXICON_MT__CACHED_CACHING_STATE_;
    private static final SubLInteger $int4$4096;
    private static final SubLSymbol $sym5$CLEAR_GENL_LEXICON_MT__CACHED;
    private static final SubLSymbol $kw6$INITIALIZED;
    private static final SubLSymbol $sym7$SPEECH_PART_;
    private static final SubLSymbol $kw8$ALL;
    private static final SubLSymbol $kw9$CLEARED;
    private static final SubLSymbol $sym10$MAX_PREDS_MATCHING_POS_CACHED;
    private static final SubLSymbol $sym11$_MAX_PREDS_MATCHING_POS_CACHED_CACHING_STATE_;
    private static final SubLInteger $int12$32;
    private static final SubLSymbol $sym13$MAX_PREDS_OF_POS;
    private static final SubLSymbol $sym14$_MAX_PREDS_OF_POS_CACHING_STATE_;
    private static final SubLSymbol $sym15$CLEAR_MAX_PREDS_OF_POS;
    private static final SubLSymbol $sym16$MAX_PREDS_LICENSED_BY_POS;
    private static final SubLSymbol $sym17$_MAX_PREDS_LICENSED_BY_POS_CACHING_STATE_;
    private static final SubLSymbol $sym18$CLEAR_MAX_PREDS_LICENSED_BY_POS;
    private static final SubLSymbol $sym19$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const20$EverythingPSC;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$LEX_REMOVE_SPEC_PREDS_HELPER;
    private static final SubLSymbol $sym23$SPEECH_PART_PRED_MIN_CEILINGS_INT;
    private static final SubLSymbol $sym24$_SPEECH_PART_PRED_MIN_CEILINGS_INT_CACHING_STATE_;
    private static final SubLInteger $int25$512;
    private static final SubLSymbol $sym26$CLEAR_SPEECH_PART_PRED_MIN_CEILINGS_INT;
    private static final SubLSymbol $sym27$SPEECH_PART_PRED_MAX_FLOORS_INT;
    private static final SubLSymbol $sym28$_SPEECH_PART_PRED_MAX_FLOORS_INT_CACHING_STATE_;
    private static final SubLSymbol $sym29$CLEAR_SPEECH_PART_PRED_MAX_FLOORS_INT;
    private static final SubLSymbol $sym30$POS_OF_PRED;
    private static final SubLSymbol $sym31$SPEECH_PART_PRED_;
    private static final SubLObject $const32$speechPartPreds;
    private static final SubLSymbol $sym33$SPEC_POS_;
    private static final SubLSymbol $sym34$_POS_OF_PRED_CACHING_STATE_;
    private static final SubLInteger $int35$128;
    private static final SubLObject $const36$Noun;
    private static final SubLObject $const37$singular_Generic;
    private static final SubLObject $const38$plural_Generic;
    private static final SubLSymbol $sym39$_DERIVED_PREDS_;
    private static final SubLInteger $int40$256;
    private static final SubLObject $const41$regularSuffix;
    private static final SubLSymbol $kw42$GAF;
    private static final SubLObject $const43$ProperNoun;
    private static final SubLSymbol $kw44$BREADTH;
    private static final SubLSymbol $kw45$QUEUE;
    private static final SubLSymbol $kw46$STACK;
    private static final SubLSymbol $sym47$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw48$ERROR;
    private static final SubLString $str49$_A_is_not_a__A;
    private static final SubLSymbol $sym50$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw51$CERROR;
    private static final SubLString $str52$continue_anyway;
    private static final SubLSymbol $kw53$WARN;
    private static final SubLString $str54$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const55$genls;
    private static final SubLSymbol $kw56$TRUE;
    private static final SubLString $str57$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str58$attempting_to_bind_direction_link;
    private static final SubLString $str59$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLObject $const60$EnglishMt;
    private static final SubLSymbol $sym61$_SPEECH_PART_PREDS_;
    private static final SubLList $list62;
    private static final SubLList $list63;
    private static final SubLSymbol $kw64$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw65$MT;
    private static final SubLSymbol $kw66$DONE;
    private static final SubLSymbol $sym67$DEFINING_MT;
    private static final SubLSymbol $sym68$PROGN;
    private static final SubLList $list69;
    private static final SubLSymbol $sym70$DO_DICTIONARY;
    private static final SubLSymbol $sym71$PWHEN;
    private static final SubLSymbol $sym72$COR;
    private static final SubLSymbol $sym73$KBEQ;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$GENL_LEXICON_MT_;
    private static final SubLObject $const76$SpeechPartPredicate;
    private static final SubLObject $const77$isa;
    private static final SubLSymbol $sym78$GENL_POS_PRED_;
    private static final SubLSymbol $sym79$_GENL_POS_PRED__CACHING_STATE_;
    private static final SubLSymbol $sym80$CLEAR_GENL_POS_PRED_;
    private static final SubLSymbol $sym81$GENL_POS_PRED_FROM_MT_INFO_;
    private static final SubLSymbol $sym82$RELEVANT_MT_IS_ANY_MT;
    private static final SubLSymbol $sym83$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
    private static final SubLSymbol $sym84$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $sym85$_GENL_POS_PRED_FROM_MT_INFO__CACHING_STATE_;
    private static final SubLSymbol $sym86$CLEAR_GENL_POS_PRED_FROM_MT_INFO_;
    private static final SubLSymbol $sym87$STRINGP;
    private static final SubLSymbol $sym88$STRING_;
    private static final SubLObject $const89$ClosedClassWord;
    private static final SubLObject $const90$partOfSpeech;
    private static final SubLSymbol $sym91$GET_STRINGS_OF_TYPE_CACHED;
    private static final SubLSymbol $sym92$_GET_STRINGS_OF_TYPE_CACHED_CACHING_STATE_;
    private static final SubLSymbol $sym93$STRING_IS_POS_ON_WU_;
    private static final SubLSymbol $sym94$GET_STRINGS_OF_TYPE;
    private static final SubLSymbol $sym95$LEXICAL_WORD_;
    private static final SubLSymbol $sym96$PARSE_MORPHOLOGICALLY_OPTION_P;
    private static final SubLSymbol $kw97$NEVER;
    private static final SubLSymbol $sym98$EQUALS_EL_;
    private static final SubLSymbol $kw99$AS_FALLBACK;
    private static final SubLSymbol $sym100$SPEC_;
    private static final SubLObject $const101$EnglishLexiconMt;
    private static final SubLSymbol $sym102$POS_FOR_KEYWORD;
    private static final SubLSymbol $sym103$KEYWORDP;
    private static final SubLSymbol $kw104$ALL_NOUN_FORMS;
    private static final SubLSymbol $kw105$NOUN;
    private static final SubLList $list106;
    private static final SubLSymbol $kw107$MASS_NOUN;
    private static final SubLList $list108;
    private static final SubLSymbol $kw109$SIMPLE_NOUN;
    private static final SubLObject $const110$CountNoun;
    private static final SubLSymbol $kw111$DEVERBAL_NOUN;
    private static final SubLObject $const112$DeVerbalNoun;
    private static final SubLSymbol $kw113$AGENTIVE_NOUN;
    private static final SubLObject $const114$AgentiveNoun;
    private static final SubLSymbol $kw115$GERUNDIVE_NOUN;
    private static final SubLObject $const116$GerundiveNoun;
    private static final SubLSymbol $kw117$PROPER_NOUN;
    private static final SubLSymbol $kw118$VERB;
    private static final SubLList $list119;
    private static final SubLSymbol $kw120$AUX;
    private static final SubLObject $const121$AuxVerb;
    private static final SubLSymbol $kw122$ADJECTIVE;
    private static final SubLObject $const123$Adjective;
    private static final SubLSymbol $kw124$ADVERB;
    private static final SubLObject $const125$Adverb;
    private static final SubLSymbol $kw126$PREP;
    private static final SubLObject $const127$Preposition;
    private static final SubLSymbol $kw128$DET;
    private static final SubLObject $const129$Determiner;
    private static final SubLSymbol $kw130$CONJ;
    private static final SubLObject $const131$Conjunction;
    private static final SubLSymbol $kw132$ANY;
    private static final SubLSymbol $sym133$_POS_FOR_KEYWORD_CACHING_STATE_;
    private static final SubLInteger $int134$64;
    private static final SubLList $list135;
    private static final SubLSymbol $sym136$PROPER_NOUN_FORM_OF_PRED;
    private static final SubLSymbol $sym137$PREDS_OF_STRING_WORD_CACHED;
    private static final SubLSymbol $sym138$_PREDS_OF_STRING_WORD_CACHED_CACHING_STATE_;
    private static final SubLSymbol $sym139$_STRING;
    private static final SubLSymbol $kw140$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $sym141$_POS;
    private static final SubLObject $const142$Verb;
    private static final SubLObject $const143$GeneralEnglishMt;
    private static final SubLObject $const144$FrameForAdverbs;
    private static final SubLObject $const145$ProperCountNoun;
    private static final SubLList $list146;
    private static final SubLObject $const147$ProperMassNoun;
    private static final SubLObject $const148$FrameForNouns;
    private static final SubLObject $const149$MassNoun;
    private static final SubLObject $const150$ZeroArticleFrame;
    private static final SubLObject $const151$FrameForAdjectives;
    private static final SubLSymbol $sym152$_CLOSED_LEXICAL_CLASS_STRINGS_;
    private static final SubLSymbol $sym153$_CLOSED_LEXICAL_CLASS_STRINGS_CASE_INSENSITIVE_;
    private static final SubLObject $const154$Pronoun;
    private static final SubLSymbol $sym155$NOT_TEST_CHAR;
    private static final SubLSymbol $sym156$CLOSED_LEXICAL_CLASS_STRINGS;
    private static final SubLSymbol $sym157$_CLOSED_LEXICAL_CLASS_STRINGS_CACHING_STATE_;
    private static final SubLSymbol $sym158$CLOSED_LEXICAL_CLASSES;
    private static final SubLSymbol $sym159$_CLOSED_LEXICAL_CLASSES_CACHING_STATE_;
    private static final SubLList $list160;
    private static final SubLList $list161;
    private static final SubLObject $const162$LexicalWord;
    private static final SubLInteger $int163$1000;
    private static final SubLSymbol $sym164$DERIVED_WORD_;
    private static final SubLObject $const165$DerivedWord;
    private static final SubLSymbol $sym166$_VULGAR_WORDS_;
    private static final SubLObject $const167$InherentlyVulgarWord;
    private static final SubLList $list168;
    private static final SubLString $str169$The_word_unit__S_is_neither_a_FOR;
    private static final SubLSymbol $sym170$VERB_ONLY_STRING_;
    private static final SubLSymbol $sym171$_VERB_ONLY_STRING__CACHING_STATE_;
    private static final SubLSymbol $kw172$DENOT;
    private static final SubLSymbol $sym173$EL_FORT_P;
    private static final SubLSymbol $sym174$LISTP;
    private static final SubLSymbol $sym175$BOOLEANP;
    private static final SubLSymbol $sym176$HLMT_;
    private static final SubLSymbol $sym177$SET_P;
    private static final SubLSymbol $sym178$TYPED_DENOTS_OF_STRING;
    private static final SubLList $list179;
    private static final SubLString $str180$_param_STRING_string_____param_TY;
    private static final SubLList $list181;
    private static final SubLList $list182;
    private static final SubLSymbol $sym183$DENOT_HAS_TYPE_;
    private static final SubLSymbol $sym184$DENOT_MIGHT_HAVE_TYPE_;
    private static final SubLSymbol $sym185$MORE_SPECIFIC_P;
    private static final SubLObject $const186$City;
    private static final SubLObject $const187$GeopoliticalEntity;
    private static final SubLObject $const188$CityNamedFn;
    private static final SubLObject $const189$InstanceNamedFn;
    private static final SubLObject $const190$SubcollectionOfWithRelationToFn;
    private static final SubLObject $const191$inRegion;
    private static final SubLObject $const192$GeographicalRegion;
    private static final SubLObject $const193$geopoliticalSubdivision;
    private static final SubLObject $const194$geographicalSubRegions;
    private static final SubLObject $const195$territoryOf;
    private static final SubLString $str196$_;
    private static final SubLList $list197;
    private static final SubLList $list198;
    private static final SubLSymbol $kw199$INFIX;
    private static final SubLString $str200$;
    private static final SubLString $str201$I_should_never_be_called___;
    private static final SubLSymbol $kw202$GREEDY;
    private static final SubLSymbol $sym203$LIST_OF_PREDICATES_P;
    private static final SubLSymbol $sym204$DENOTATION_MAPPER;
    private static final SubLList $list205;
    private static final SubLString $str206$_param_STRING_string__the_string_;
    private static final SubLList $list207;
    private static final SubLList $list208;
    private static final SubLList $list209;
    private static final SubLSymbol $kw210$RELATED;
    private static final SubLSymbol $sym211$CYCL_STRING_P;
    private static final SubLSymbol $sym212$VALID_DENOTS_OF_STRING_LOOKUP_MT_SPECIFICATION_;
    private static final SubLList $list213;
    private static final SubLSymbol $sym214$DENOTS_OF_STRING;
    private static final SubLList $list215;
    private static final SubLString $str216$_param_PARSE_MORPHOLOGICALLY__PAR;
    private static final SubLList $list217;
    private static final SubLSymbol $sym218$DENOTS_MT_FOR_LANGUAGE;
    private static final SubLObject $const219$validatedLexicalPSCForLanguage;
    private static final SubLObject $const220$MtSpace;
    private static final SubLObject $const221$AnytimePSC;
    private static final SubLString $str222$_S_passes_neither_SPEECH_PART_PRE;
    private static final SubLSymbol $sym223$NAME_STRING_PRED_;
    private static final SubLSymbol $kw224$ONLY;
    private static final SubLSymbol $kw225$ALWAYS;
    private static final SubLObject $const226$ProperNamePredicate_Strict;
    private static final SubLSymbol $kw227$JUST_RELATED;
    private static final SubLList $list228;
    private static final SubLSymbol $kw229$JUST_PLACEHOLDER;
    private static final SubLList $list230;
    private static final SubLList $list231;
    private static final SubLList $list232;
    private static final SubLList $list233;
    private static final SubLObject $const234$denotation;
    private static final SubLSymbol $kw235$PLACEHOLDER;
    private static final SubLObject $const236$denotationPlaceholder;
    private static final SubLObject $const237$denotationRelatedTo;
    private static final SubLObject $const238$subcatFrame;
    private static final SubLSymbol $sym239$_;
    private static final SubLSymbol $sym240$FORT_P;
    private static final SubLObject $const241$subcatFrameArity;
    private static final SubLObject $const242$politenessOfWS;
    private static final SubLObject $const243$formalityOfWS;
    private static final SubLSymbol $sym244$_LEVEL;
    private static final SubLList $list245;
    private static final SubLList $list246;
    private static final SubLSymbol $sym247$POTENTIALLY_OFFENSIVE_POLITENESS_LEVEL_;
    private static final SubLObject $const248$SlangSpeech;
    private static final SubLObject $const249$ArchaicSpeech;
    private static final SubLSymbol $sym250$INDIRECT_LEXICAL_ASSERTION_;
    private static final SubLObject $const251$DenotationPredicate_ExcludedFromN;
    private static final SubLSymbol $sym252$_INDIRECT_LEXICAL_ASSERTION__CACHING_STATE_;
    private static final SubLSymbol $sym253$CLEAR_INDIRECT_LEXICAL_ASSERTION_;
    private static final SubLSymbol $sym254$INTEGERP;
    private static final SubLSymbol $sym255$GAF_ASSERTION_;
    private static final SubLObject $const256$Quote;
    private static final SubLSymbol $sym257$CAR;
    private static final SubLSymbol $sym258$CDR;
    private static final SubLObject $const259$TransitivePPFrameType;
    private static final SubLObject $const260$DitransitivePPFrameType;
    private static final SubLSymbol $sym261$AGR_OF_DET_STRING;
    private static final SubLList $list262;
    private static final SubLSymbol $sym263$_AGR_OF_DET_STRING_CACHING_STATE_;
    private static final SubLObject $const264$determinerAgreement;
    private static final SubLSymbol $sym265$POS_TO_SEMTRANS_PRED_CACHED;
    private static final SubLObject $const266$semTransPredForPOS;
    private static final SubLSymbol $sym267$_POS_TO_SEMTRANS_PRED_CACHED_CACHING_STATE_;
    private static final SubLSymbol $sym268$CLEAR_POS_TO_SEMTRANS_PRED_CACHED;
    private static final SubLSymbol $sym269$SEMTRANS_PRED_TO_POS;
    private static final SubLSymbol $sym270$_SEMTRANS_PRED_TO_POS_CACHING_STATE_;
    private static final SubLObject $const271$commonNickname;
    private static final SubLObject $const272$nameSpelling;
    private static final SubLObject $const273$SpeechPart;
    private static final SubLSymbol $sym274$_SPEECH_PARTS_;
    private static final SubLSymbol $sym275$GENL_POS_;
    private static final SubLSymbol $sym276$_GENL_POS__CACHING_STATE_;
    private static final SubLObject $const277$NLWordForm;
    private static final SubLList $list278;
    private static final SubLObject $const279$PhraseFn_Bar1;
    private static final SubLSymbol $sym280$COMPOSITIONAL_POS_NART;
    private static final SubLSymbol $sym281$_COMPOSITIONAL_POS_NART_CACHING_STATE_;
    private static final SubLList $list282;
    private static final SubLList $list283;
    private static final SubLSymbol $kw284$UNDETERMINED;
    private static final SubLSymbol $kw285$POSSESSED_TYPE;
    private static final SubLSymbol $kw286$DENOTED_PRED;
    private static final SubLSymbol $kw287$POSSESSOR;
    private static final SubLSymbol $kw288$POSSESSOR_TYPE;
    private static final SubLList $list289;
    private static final SubLObject $const290$headMedialStringDenotesArgInReln;
    private static final SubLObject $const291$multiWordStringDenotesArgInReln;
    private static final SubLObject $const292$compoundStringDenotesArgInReln;
    private static final SubLObject $const293$denotesArgInReln;
    private static final SubLList $list294;
    private static final SubLSymbol $sym295$_PRED;
    private static final SubLList $list296;
    private static final SubLObject $const297$Thing;
    private static final SubLSymbol $kw298$TEST;
    private static final SubLSymbol $sym299$SETS_EQUAL_EQUAL_;
    private static final SubLSymbol $kw300$OWNER;
    private static final SubLSymbol $kw301$CLASSES;
    private static final SubLSymbol $kw302$KB;
    private static final SubLSymbol $kw303$FULL;
    private static final SubLSymbol $kw304$WORKING_;
    private static final SubLList $list305;
    private static final SubLString $str306$missing___S;
    private static final SubLSymbol $sym307$HL_TERM_WITH_EL_COUNTERPART_P;
    private static final SubLSymbol $sym308$HL_TERM_TO_EL_TERM;
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 3725L)
    public static SubLObject genl_lexicon_mtP(final SubLObject spec_mt, final SubLObject genl_mt) {
        if (spec_mt.equal(genl_mt) || lexicon_accessors.NIL != kb_utilities.kbeq(genl_mt, lexicon_accessors.$const0$UniversalVocabularyMt) || lexicon_accessors.NIL != kb_utilities.kbeq(spec_mt, lexicon_accessors.$const1$InferencePSC)) {
            return (SubLObject)lexicon_accessors.T;
        }
        return genl_lexicon_mtP_cached(spec_mt, genl_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 4034L)
    public static SubLObject clear_genl_lexicon_mtP_cached() {
        final SubLObject cs = lexicon_accessors.$genl_lexicon_mtP_cached_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 4034L)
    public static SubLObject remove_genl_lexicon_mtP_cached(final SubLObject spec_mt, final SubLObject genl_mt) {
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_accessors.$genl_lexicon_mtP_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(spec_mt, genl_mt), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 4034L)
    public static SubLObject genl_lexicon_mtP_cached_internal(final SubLObject spec_mt, final SubLObject genl_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(spec_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = mt_relevance_macros.relevant_mtP(genl_mt);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 4034L)
    public static SubLObject genl_lexicon_mtP_cached(final SubLObject spec_mt, final SubLObject genl_mt) {
        SubLObject caching_state = lexicon_accessors.$genl_lexicon_mtP_cached_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_accessors.$sym2$GENL_LEXICON_MT__CACHED, (SubLObject)lexicon_accessors.$sym3$_GENL_LEXICON_MT__CACHED_CACHING_STATE_, (SubLObject)lexicon_accessors.$int4$4096, (SubLObject)lexicon_accessors.EQUAL, (SubLObject)lexicon_accessors.TWO_INTEGER, (SubLObject)lexicon_accessors.ZERO_INTEGER);
            memoization_state.register_mt_dependent_cache_clear_callback((SubLObject)lexicon_accessors.$sym5$CLEAR_GENL_LEXICON_MT__CACHED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(spec_mt, genl_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)lexicon_accessors.NIL;
            collision = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (spec_mt.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (lexicon_accessors.NIL != cached_args && lexicon_accessors.NIL == cached_args.rest() && genl_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(genl_lexicon_mtP_cached_internal(spec_mt, genl_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(spec_mt, genl_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 4434L)
    public static SubLObject initialize_speech_part_caches() {
        clear_speech_part_pred_caches();
        initialize_derived_preds();
        initialize_closed_lexical_class_strings();
        initialize_speech_parts();
        initialize_speech_part_preds();
        return (SubLObject)lexicon_accessors.$kw6$INITIALIZED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 5146L)
    public static SubLObject preds_matching_pos(SubLObject nl_pred_list, final SubLObject pos, SubLObject include_specsP) {
        if (include_specsP == lexicon_accessors.UNPROVIDED) {
            include_specsP = (SubLObject)lexicon_accessors.NIL;
        }
        assert lexicon_accessors.NIL != speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED) : pos;
        if (nl_pred_list == lexicon_accessors.$kw8$ALL) {
            nl_pred_list = top_level_nl_preds();
        }
        final SubLObject preds = (lexicon_accessors.NIL != include_specsP) ? all_preds_of_pos(pos) : max_preds_of_pos(pos);
        return (SubLObject)((lexicon_accessors.NIL != nl_pred_list && lexicon_accessors.NIL != preds) ? lexicon_utilities.filter_lexicon_preds(nl_pred_list, preds, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED) : lexicon_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 5862L)
    public static SubLObject top_level_nl_preds() {
        return (SubLObject)ConsesLow.list(lexicon_vars.$top_level_nl_pred$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 6011L)
    public static SubLObject clear_speech_part_pred_caches() {
        clear_max_preds_matching_pos_cached();
        clear_max_preds_of_pos();
        clear_max_preds_licensed_by_pos();
        lexicon_utilities.clear_preds_licensed_by_pos();
        clear_speech_part_pred_min_ceilings_int();
        clear_speech_part_pred_max_floors_int();
        clear_derived_preds();
        clear_speech_part_preds();
        return (SubLObject)lexicon_accessors.$kw9$CLEARED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 6468L)
    public static SubLObject max_preds_matching_pos(final SubLObject nl_pred_list, final SubLObject pos, final SubLObject mt, SubLObject include_specsP) {
        if (include_specsP == lexicon_accessors.UNPROVIDED) {
            include_specsP = (SubLObject)lexicon_accessors.NIL;
        }
        return (SubLObject)((lexicon_accessors.NIL != control_vars.kb_loaded()) ? conses_high.copy_list(max_preds_matching_pos_cached(nl_pred_list, pos, mt, include_specsP)) : lexicon_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 6970L)
    public static SubLObject clear_max_preds_matching_pos_cached() {
        final SubLObject cs = lexicon_accessors.$max_preds_matching_pos_cached_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 6970L)
    public static SubLObject remove_max_preds_matching_pos_cached(final SubLObject nl_pred_list, final SubLObject pos, final SubLObject mt, final SubLObject include_specsP) {
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_accessors.$max_preds_matching_pos_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(nl_pred_list, pos, mt, include_specsP), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 6970L)
    public static SubLObject max_preds_matching_pos_cached_internal(final SubLObject nl_pred_list, final SubLObject pos, final SubLObject mt, final SubLObject include_specsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject preds = preds_matching_pos(nl_pred_list, pos, include_specsP);
        SubLObject result = (SubLObject)lexicon_accessors.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            final SubLObject nearest_common_genl_preds = speech_part_pred_min_ceilings(preds, (SubLObject)lexicon_accessors.UNPROVIDED);
            result = ((lexicon_accessors.NIL != nearest_common_genl_preds) ? nearest_common_genl_preds : preds);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 6970L)
    public static SubLObject max_preds_matching_pos_cached(final SubLObject nl_pred_list, final SubLObject pos, final SubLObject mt, final SubLObject include_specsP) {
        SubLObject caching_state = lexicon_accessors.$max_preds_matching_pos_cached_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_accessors.$sym10$MAX_PREDS_MATCHING_POS_CACHED, (SubLObject)lexicon_accessors.$sym11$_MAX_PREDS_MATCHING_POS_CACHED_CACHING_STATE_, (SubLObject)lexicon_accessors.NIL, (SubLObject)lexicon_accessors.EQUAL, (SubLObject)lexicon_accessors.FOUR_INTEGER, (SubLObject)lexicon_accessors.$int12$32);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(nl_pred_list, pos, mt, include_specsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)lexicon_accessors.NIL;
            collision = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (nl_pred_list.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pos.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (lexicon_accessors.NIL != cached_args && lexicon_accessors.NIL == cached_args.rest() && include_specsP.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(max_preds_matching_pos_cached_internal(nl_pred_list, pos, mt, include_specsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(nl_pred_list, pos, mt, include_specsP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 7397L)
    public static SubLObject all_preds_of_pos(final SubLObject pos) {
        assert lexicon_accessors.NIL != speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED) : pos;
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        SubLObject cdolist_list_var = genls.all_specs(pos, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
        SubLObject spec_pos = (SubLObject)lexicon_accessors.NIL;
        spec_pos = cdolist_list_var.first();
        while (lexicon_accessors.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = lexicon_utilities.preds_of_pos(spec_pos, (SubLObject)lexicon_accessors.UNPROVIDED);
            SubLObject pred = (SubLObject)lexicon_accessors.NIL;
            pred = cdolist_list_var_$1.first();
            while (lexicon_accessors.NIL != cdolist_list_var_$1) {
                final SubLObject item_var = pred;
                if (lexicon_accessors.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)lexicon_accessors.EQL), Symbols.symbol_function((SubLObject)lexicon_accessors.IDENTITY))) {
                    ans = (SubLObject)ConsesLow.cons(item_var, ans);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                pred = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec_pos = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 7786L)
    public static SubLObject clear_max_preds_of_pos() {
        final SubLObject cs = lexicon_accessors.$max_preds_of_pos_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 7786L)
    public static SubLObject remove_max_preds_of_pos(final SubLObject pos) {
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_accessors.$max_preds_of_pos_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pos), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 7786L)
    public static SubLObject max_preds_of_pos_internal(final SubLObject pos) {
        assert lexicon_accessors.NIL != speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED) : pos;
        return lex_remove_spec_preds(lexicon_utilities.preds_of_pos(pos, (SubLObject)lexicon_accessors.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 7786L)
    public static SubLObject max_preds_of_pos(final SubLObject pos) {
        SubLObject caching_state = lexicon_accessors.$max_preds_of_pos_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_accessors.$sym13$MAX_PREDS_OF_POS, (SubLObject)lexicon_accessors.$sym14$_MAX_PREDS_OF_POS_CACHING_STATE_, (SubLObject)lexicon_accessors.NIL, (SubLObject)lexicon_accessors.EQL, (SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.ZERO_INTEGER);
            memoization_state.register_genl_preds_dependent_cache_clear_callback((SubLObject)lexicon_accessors.$sym15$CLEAR_MAX_PREDS_OF_POS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pos, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(max_preds_of_pos_internal(pos)));
            memoization_state.caching_state_put(caching_state, pos, results, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 8068L)
    public static SubLObject clear_max_preds_licensed_by_pos() {
        final SubLObject cs = lexicon_accessors.$max_preds_licensed_by_pos_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 8068L)
    public static SubLObject remove_max_preds_licensed_by_pos(final SubLObject pos) {
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_accessors.$max_preds_licensed_by_pos_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pos), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 8068L)
    public static SubLObject max_preds_licensed_by_pos_internal(final SubLObject pos) {
        assert lexicon_accessors.NIL != speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED) : pos;
        return lex_remove_spec_preds(lexicon_utilities.preds_licensed_by_pos(pos));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 8068L)
    public static SubLObject max_preds_licensed_by_pos(final SubLObject pos) {
        SubLObject caching_state = lexicon_accessors.$max_preds_licensed_by_pos_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_accessors.$sym16$MAX_PREDS_LICENSED_BY_POS, (SubLObject)lexicon_accessors.$sym17$_MAX_PREDS_LICENSED_BY_POS_CACHING_STATE_, (SubLObject)lexicon_accessors.NIL, (SubLObject)lexicon_accessors.EQL, (SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.ZERO_INTEGER);
            memoization_state.register_genl_preds_dependent_cache_clear_callback((SubLObject)lexicon_accessors.$sym18$CLEAR_MAX_PREDS_LICENSED_BY_POS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pos, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(max_preds_licensed_by_pos_internal(pos)));
            memoization_state.caching_state_put(caching_state, pos, results, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 8403L)
    public static SubLObject lex_remove_spec_preds(final SubLObject pos_preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject _prev_bind_0_$2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_accessors.$sym19$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(lexicon_accessors.$const20$EverythingPSC, thread);
                    SubLObject remain;
                    SubLObject current;
                    SubLObject datum;
                    SubLObject now;
                    SubLObject later;
                    SubLObject removeP;
                    SubLObject csome_list_var;
                    SubLObject other;
                    for (remain = (SubLObject)lexicon_accessors.NIL, remain = pos_preds; lexicon_accessors.NIL != remain; remain = remain.rest()) {
                        datum = (current = remain);
                        now = (SubLObject)lexicon_accessors.NIL;
                        later = (SubLObject)lexicon_accessors.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_accessors.$list21);
                        now = current.first();
                        current = (later = current.rest());
                        removeP = (SubLObject)lexicon_accessors.NIL;
                        if (lexicon_accessors.NIL == removeP) {
                            csome_list_var = later;
                            other = (SubLObject)lexicon_accessors.NIL;
                            other = csome_list_var.first();
                            while (lexicon_accessors.NIL == removeP && lexicon_accessors.NIL != csome_list_var) {
                                if (lexicon_accessors.NIL != subl_promotions.memberP(now, lex_remove_spec_preds_helper(other), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                    removeP = (SubLObject)lexicon_accessors.T;
                                }
                                csome_list_var = csome_list_var.rest();
                                other = csome_list_var.first();
                            }
                        }
                        if (lexicon_accessors.NIL == removeP) {
                            csome_list_var = ans;
                            other = (SubLObject)lexicon_accessors.NIL;
                            other = csome_list_var.first();
                            while (lexicon_accessors.NIL == removeP && lexicon_accessors.NIL != csome_list_var) {
                                if (lexicon_accessors.NIL != subl_promotions.memberP(now, lex_remove_spec_preds_helper(other), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                    removeP = (SubLObject)lexicon_accessors.T;
                                }
                                csome_list_var = csome_list_var.rest();
                                other = csome_list_var.first();
                            }
                        }
                        if (lexicon_accessors.NIL == removeP) {
                            ans = (SubLObject)ConsesLow.cons(now, ans);
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$2, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9057L)
    public static SubLObject lex_remove_spec_preds_helper_internal(final SubLObject v_term) {
        return genl_predicates.all_spec_preds(v_term, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9057L)
    public static SubLObject lex_remove_spec_preds_helper(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL == v_memoization_state) {
            return lex_remove_spec_preds_helper_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)lexicon_accessors.$sym22$LEX_REMOVE_SPEC_PREDS_HELPER, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)lexicon_accessors.$sym22$LEX_REMOVE_SPEC_PREDS_HELPER, (SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.NIL, (SubLObject)lexicon_accessors.EQL, (SubLObject)lexicon_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)lexicon_accessors.$sym22$LEX_REMOVE_SPEC_PREDS_HELPER, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(lex_remove_spec_preds_helper_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9147L)
    public static SubLObject speech_part_pred_min_ceilings(final SubLObject preds, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return conses_high.copy_list(speech_part_pred_min_ceilings_int(preds, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9290L)
    public static SubLObject clear_speech_part_pred_min_ceilings_int() {
        final SubLObject cs = lexicon_accessors.$speech_part_pred_min_ceilings_int_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9290L)
    public static SubLObject remove_speech_part_pred_min_ceilings_int(final SubLObject preds, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_accessors.$speech_part_pred_min_ceilings_int_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(preds, mt), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9290L)
    public static SubLObject speech_part_pred_min_ceilings_int_internal(final SubLObject preds, final SubLObject mt) {
        return genl_predicates.min_ceiling_predicates(preds, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9290L)
    public static SubLObject speech_part_pred_min_ceilings_int(final SubLObject preds, final SubLObject mt) {
        SubLObject caching_state = lexicon_accessors.$speech_part_pred_min_ceilings_int_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_accessors.$sym23$SPEECH_PART_PRED_MIN_CEILINGS_INT, (SubLObject)lexicon_accessors.$sym24$_SPEECH_PART_PRED_MIN_CEILINGS_INT_CACHING_STATE_, (SubLObject)lexicon_accessors.$int25$512, (SubLObject)lexicon_accessors.EQUAL, (SubLObject)lexicon_accessors.TWO_INTEGER, (SubLObject)lexicon_accessors.ZERO_INTEGER);
            memoization_state.register_genl_preds_dependent_cache_clear_callback((SubLObject)lexicon_accessors.$sym26$CLEAR_SPEECH_PART_PRED_MIN_CEILINGS_INT);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(preds, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)lexicon_accessors.NIL;
            collision = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (preds.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (lexicon_accessors.NIL != cached_args && lexicon_accessors.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(speech_part_pred_min_ceilings_int_internal(preds, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(preds, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9477L)
    public static SubLObject speech_part_pred_max_floors(final SubLObject preds, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLObject ans = speech_part_pred_max_floors_int(preds, mt);
        return conses_high.copy_list(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9644L)
    public static SubLObject clear_speech_part_pred_max_floors_int() {
        final SubLObject cs = lexicon_accessors.$speech_part_pred_max_floors_int_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9644L)
    public static SubLObject remove_speech_part_pred_max_floors_int(final SubLObject preds, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_accessors.$speech_part_pred_max_floors_int_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(preds, mt), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9644L)
    public static SubLObject speech_part_pred_max_floors_int_internal(final SubLObject preds, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = genl_predicates.max_floor_predicates(preds, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9644L)
    public static SubLObject speech_part_pred_max_floors_int(final SubLObject preds, final SubLObject mt) {
        SubLObject caching_state = lexicon_accessors.$speech_part_pred_max_floors_int_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_accessors.$sym27$SPEECH_PART_PRED_MAX_FLOORS_INT, (SubLObject)lexicon_accessors.$sym28$_SPEECH_PART_PRED_MAX_FLOORS_INT_CACHING_STATE_, (SubLObject)lexicon_accessors.$int25$512, (SubLObject)lexicon_accessors.EQUAL, (SubLObject)lexicon_accessors.TWO_INTEGER, (SubLObject)lexicon_accessors.ZERO_INTEGER);
            memoization_state.register_genl_preds_dependent_cache_clear_callback((SubLObject)lexicon_accessors.$sym29$CLEAR_SPEECH_PART_PRED_MAX_FLOORS_INT);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(preds, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)lexicon_accessors.NIL;
            collision = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (preds.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (lexicon_accessors.NIL != cached_args && lexicon_accessors.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(speech_part_pred_max_floors_int_internal(preds, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(preds, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9905L)
    public static SubLObject clear_pos_of_pred() {
        final SubLObject cs = lexicon_accessors.$pos_of_pred_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9905L)
    public static SubLObject remove_pos_of_pred(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_accessors.$pos_of_pred_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9905L)
    public static SubLObject pos_of_pred_internal(final SubLObject pred) {
        assert lexicon_accessors.NIL != speech_part_predP(pred, (SubLObject)lexicon_accessors.UNPROVIDED) : pred;
        return (SubLObject)((lexicon_accessors.NIL != kb_indexing_datastructures.indexed_term_p(pred) && lexicon_accessors.NIL != constant_handles.valid_constantP(lexicon_accessors.$const32$speechPartPreds, (SubLObject)lexicon_accessors.UNPROVIDED)) ? Sort.sort(kb_mapping_utilities.pred_values_in_any_mt(pred, lexicon_accessors.$const32$speechPartPreds, (SubLObject)lexicon_accessors.TWO_INTEGER, (SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.UNPROVIDED), (SubLObject)lexicon_accessors.$sym33$SPEC_POS_, (SubLObject)lexicon_accessors.UNPROVIDED).first() : lexicon_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 9905L)
    public static SubLObject pos_of_pred(final SubLObject pred) {
        SubLObject caching_state = lexicon_accessors.$pos_of_pred_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_accessors.$sym30$POS_OF_PRED, (SubLObject)lexicon_accessors.$sym34$_POS_OF_PRED_CACHING_STATE_, (SubLObject)lexicon_accessors.$int35$128, (SubLObject)lexicon_accessors.EQL, (SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.$int12$32);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pos_of_pred_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 10358L)
    public static SubLObject singular_pred(final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED) : pos;
        if (lexicon_accessors.NIL == constant_handles.valid_constantP(lexicon_accessors.$const36$Noun, (SubLObject)lexicon_accessors.UNPROVIDED) || lexicon_accessors.NIL == genls.genl_in_any_mtP(pos, lexicon_accessors.$const36$Noun)) {
            return (SubLObject)lexicon_accessors.NIL;
        }
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_accessors.$sym19$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(lexicon_accessors.$const20$EverythingPSC, thread);
            if (lexicon_accessors.NIL != constant_handles.valid_constantP(lexicon_accessors.$const37$singular_Generic, (SubLObject)lexicon_accessors.UNPROVIDED) && lexicon_accessors.NIL == ans) {
                SubLObject csome_list_var = lexicon_utilities.preds_of_pos(pos, (SubLObject)lexicon_accessors.UNPROVIDED);
                SubLObject pred = (SubLObject)lexicon_accessors.NIL;
                pred = csome_list_var.first();
                while (lexicon_accessors.NIL == ans && lexicon_accessors.NIL != csome_list_var) {
                    if (lexicon_accessors.NIL != genl_predicates.genl_predP(pred, lexicon_accessors.$const37$singular_Generic, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                        ans = pred;
                    }
                    csome_list_var = csome_list_var.rest();
                    pred = csome_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 10949L)
    public static SubLObject plural_pred(final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED) : pos;
        if (lexicon_accessors.NIL == constant_handles.valid_constantP(lexicon_accessors.$const36$Noun, (SubLObject)lexicon_accessors.UNPROVIDED) || lexicon_accessors.NIL == genls.genl_in_any_mtP(pos, lexicon_accessors.$const36$Noun)) {
            return (SubLObject)lexicon_accessors.NIL;
        }
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_accessors.$sym19$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(lexicon_accessors.$const20$EverythingPSC, thread);
            if (lexicon_accessors.NIL != constant_handles.valid_constantP(lexicon_accessors.$const38$plural_Generic, (SubLObject)lexicon_accessors.UNPROVIDED) && lexicon_accessors.NIL == ans) {
                SubLObject csome_list_var = lexicon_utilities.preds_of_pos(pos, (SubLObject)lexicon_accessors.UNPROVIDED);
                SubLObject pred = (SubLObject)lexicon_accessors.NIL;
                pred = csome_list_var.first();
                while (lexicon_accessors.NIL == ans && lexicon_accessors.NIL != csome_list_var) {
                    if (lexicon_accessors.NIL != genl_predicates.genl_predP(pred, lexicon_accessors.$const38$plural_Generic, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                        ans = pred;
                    }
                    csome_list_var = csome_list_var.rest();
                    pred = csome_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 11635L)
    public static SubLObject derived_preds() {
        return lexicon_accessors.$derived_preds$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 11696L)
    public static SubLObject clear_derived_preds() {
        morphology.clear_pos_preds_derivable_from_pred_int();
        return Hashtables.clrhash(lexicon_accessors.$derived_preds$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 11817L)
    public static SubLObject initialize_derived_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_derived_preds();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_accessors.$sym19$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(lexicon_accessors.$const20$EverythingPSC, thread);
            if (lexicon_accessors.NIL != constant_handles.valid_constantP(lexicon_accessors.$const41$regularSuffix, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                final SubLObject pred_var = lexicon_accessors.$const41$regularSuffix;
                if (lexicon_accessors.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = (SubLObject)lexicon_accessors.NIL;
                    final SubLObject _prev_bind_0_$4 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$5 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)lexicon_accessors.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)lexicon_accessors.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)lexicon_accessors.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)lexicon_accessors.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((lexicon_accessors.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : lexicon_accessors.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = (SubLObject)lexicon_accessors.NIL;
                        final SubLObject token_var = (SubLObject)lexicon_accessors.NIL;
                        while (lexicon_accessors.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (lexicon_accessors.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)lexicon_accessors.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.NIL, (SubLObject)lexicon_accessors.NIL);
                                    SubLObject done_var_$6 = (SubLObject)lexicon_accessors.NIL;
                                    final SubLObject token_var_$7 = (SubLObject)lexicon_accessors.NIL;
                                    while (lexicon_accessors.NIL == done_var_$6) {
                                        final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                                        final SubLObject valid_$8 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$7.eql(as));
                                        if (lexicon_accessors.NIL != valid_$8) {
                                            final SubLObject derived_pred = assertions_high.gaf_arg1(as);
                                            final SubLObject mt = assertions_high.assertion_mt(as);
                                            hash_table_utilities.pushnew_hash(derived_pred, mt, lexicon_accessors.$derived_preds$.getGlobalValue(), (SubLObject)lexicon_accessors.UNPROVIDED);
                                        }
                                        done_var_$6 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$8);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (lexicon_accessors.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$5, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$4, thread);
                    }
                }
            }
            if (lexicon_accessors.NIL != constant_handles.valid_constantP(lexicon_accessors.$const43$ProperNoun, (SubLObject)lexicon_accessors.UNPROVIDED) && lexicon_accessors.NIL != constant_handles.valid_constantP(lexicon_accessors.$const32$speechPartPreds, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                SubLObject node_var = lexicon_accessors.$const43$ProperNoun;
                final SubLObject deck_type = (SubLObject)lexicon_accessors.$kw46$STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$6 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)lexicon_accessors.NIL;
                        final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((lexicon_accessors.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((lexicon_accessors.NIL != tv_var) ? lexicon_accessors.$sym47$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (lexicon_accessors.NIL != tv_var && lexicon_accessors.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && lexicon_accessors.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)lexicon_accessors.$kw48$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)lexicon_accessors.$kw51$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.$str52$continue_anyway, (SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)lexicon_accessors.$kw53$WARN)) {
                                    Errors.warn((SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)lexicon_accessors.$str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)lexicon_accessors.$str52$continue_anyway, (SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_11 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)lexicon_accessors.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls), thread);
                                if (lexicon_accessors.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || lexicon_accessors.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(lexicon_accessors.$const43$ProperNoun, sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$8 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)lexicon_accessors.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)lexicon_accessors.UNPROVIDED);
                                        while (lexicon_accessors.NIL != node_var) {
                                            final SubLObject pos = node_var;
                                            final SubLObject pred_var2 = lexicon_accessors.$const32$speechPartPreds;
                                            if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pos, (SubLObject)lexicon_accessors.NIL, pred_var2)) {
                                                final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pos, (SubLObject)lexicon_accessors.NIL, pred_var2);
                                                SubLObject done_var2 = (SubLObject)lexicon_accessors.NIL;
                                                final SubLObject token_var2 = (SubLObject)lexicon_accessors.NIL;
                                                while (lexicon_accessors.NIL == done_var2) {
                                                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                    final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                                    if (lexicon_accessors.NIL != valid2) {
                                                        SubLObject final_index_iterator2 = (SubLObject)lexicon_accessors.NIL;
                                                        try {
                                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.$kw56$TRUE, (SubLObject)lexicon_accessors.NIL);
                                                            SubLObject done_var_$7 = (SubLObject)lexicon_accessors.NIL;
                                                            final SubLObject token_var_$8 = (SubLObject)lexicon_accessors.NIL;
                                                            while (lexicon_accessors.NIL == done_var_$7) {
                                                                final SubLObject as2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$8);
                                                                final SubLObject valid_$9 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$8.eql(as2));
                                                                if (lexicon_accessors.NIL != valid_$9) {
                                                                    final SubLObject spp = assertions_high.gaf_arg2(as2);
                                                                    final SubLObject mt2 = assertions_high.assertion_mt(as2);
                                                                    hash_table_utilities.pushnew_hash(spp, mt2, lexicon_accessors.$derived_preds$.getGlobalValue(), (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                }
                                                                done_var_$7 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$9);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                                                final SubLObject _values2 = Values.getValuesAsVector();
                                                                if (lexicon_accessors.NIL != final_index_iterator2) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                                }
                                                                Values.restoreValuesFromVector(_values2);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid2);
                                                }
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls));
                                            SubLObject module_var = (SubLObject)lexicon_accessors.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (lexicon_accessors.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$11 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((lexicon_accessors.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (lexicon_accessors.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED));
                                                        if (lexicon_accessors.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED));
                                                            if (lexicon_accessors.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); lexicon_accessors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (lexicon_accessors.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$25;
                                                                            for (iteration_state_$25 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); lexicon_accessors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$25); iteration_state_$25 = dictionary_contents.do_dictionary_contents_next(iteration_state_$25)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$25);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (lexicon_accessors.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (lexicon_accessors.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)lexicon_accessors.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); lexicon_accessors.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (lexicon_accessors.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)lexicon_accessors.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (lexicon_accessors.NIL != csome_list_var) {
                                                                                                if (lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)lexicon_accessors.$str57$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$13, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$25);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$12, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)lexicon_accessors.FIVE_INTEGER, (SubLObject)lexicon_accessors.$str58$attempting_to_bind_direction_link, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (lexicon_accessors.NIL != obsolete.cnat_p(node, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$27;
                                                        final SubLObject new_list = cdolist_list_var_$27 = ((lexicon_accessors.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)lexicon_accessors.NIL;
                                                        generating_fn = cdolist_list_var_$27.first();
                                                        while (lexicon_accessors.NIL != cdolist_list_var_$27) {
                                                            final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (lexicon_accessors.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)lexicon_accessors.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); lexicon_accessors.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (lexicon_accessors.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)lexicon_accessors.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (lexicon_accessors.NIL != csome_list_var2) {
                                                                        if (lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)lexicon_accessors.$str57$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$14, thread);
                                                            }
                                                            cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                                                            generating_fn = cdolist_list_var_$27.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$9, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$11, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$17, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$8, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$9, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)lexicon_accessors.TWO_INTEGER, (SubLObject)lexicon_accessors.$str59$Node__a_does_not_pass_sbhl_type_t, lexicon_accessors.$const43$ProperNoun, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED)), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_11, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_10, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_9, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$7, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$8, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$6, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$7, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                            final SubLObject _values3 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values3);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$6, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return lexicon_accessors.$derived_preds$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 12497L)
    public static SubLObject derived_predP(final SubLObject obj, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_accessors.$const1$InferencePSC;
        }
        if (!Hashtables.hash_table_count(lexicon_accessors.$derived_preds$.getGlobalValue()).isPositive()) {
            initialize_derived_preds();
        }
        final SubLObject mts = Hashtables.gethash(obj, lexicon_accessors.$derived_preds$.getGlobalValue(), (SubLObject)lexicon_accessors.UNPROVIDED);
        SubLObject mt_okP = kb_utilities.kbeq(mt, lexicon_accessors.$const1$InferencePSC);
        if (lexicon_accessors.NIL == mt_okP) {
            SubLObject csome_list_var;
            SubLObject ok_mt;
            for (csome_list_var = mts, ok_mt = (SubLObject)lexicon_accessors.NIL, ok_mt = csome_list_var.first(); lexicon_accessors.NIL == mt_okP && lexicon_accessors.NIL != csome_list_var; mt_okP = genl_lexicon_mtP(mt, ok_mt), csome_list_var = csome_list_var.rest(), ok_mt = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL != mts && lexicon_accessors.NIL != mt_okP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 12901L)
    public static SubLObject base_preds_of_pred(final SubLObject pred, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_accessors.$const60$EnglishMt;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject base_preds = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL != derived_predP(pred, mt)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject pred_var = lexicon_accessors.$const41$regularSuffix;
                if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pred, (SubLObject)lexicon_accessors.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pred, (SubLObject)lexicon_accessors.ONE_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)lexicon_accessors.NIL;
                    final SubLObject token_var = (SubLObject)lexicon_accessors.NIL;
                    while (lexicon_accessors.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (lexicon_accessors.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)lexicon_accessors.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.NIL, (SubLObject)lexicon_accessors.NIL);
                                SubLObject done_var_$30 = (SubLObject)lexicon_accessors.NIL;
                                final SubLObject token_var_$31 = (SubLObject)lexicon_accessors.NIL;
                                while (lexicon_accessors.NIL == done_var_$30) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$31);
                                    final SubLObject valid_$32 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$31.eql(gaf));
                                    if (lexicon_accessors.NIL != valid_$32) {
                                        final SubLObject more_basic_pred = assertions_high.gaf_arg2(gaf);
                                        base_preds = conses_high.union(base_preds, base_preds_of_pred(more_basic_pred, (SubLObject)lexicon_accessors.UNPROVIDED), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                    }
                                    done_var_$30 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$32);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (lexicon_accessors.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid);
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)((lexicon_accessors.NIL != base_preds) ? base_preds : ConsesLow.list(pred));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 13507L)
    public static SubLObject do_speech_part_preds(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_accessors.$list62);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred = (SubLObject)lexicon_accessors.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_accessors.$list62);
        pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)lexicon_accessors.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)lexicon_accessors.NIL;
        SubLObject current_$34 = (SubLObject)lexicon_accessors.NIL;
        while (lexicon_accessors.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)lexicon_accessors.$list62);
            current_$34 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)lexicon_accessors.$list62);
            if (lexicon_accessors.NIL == conses_high.member(current_$34, (SubLObject)lexicon_accessors.$list63, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                bad = (SubLObject)lexicon_accessors.T;
            }
            if (current_$34 == lexicon_accessors.$kw64$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (lexicon_accessors.NIL != bad && lexicon_accessors.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)lexicon_accessors.$list62);
        }
        final SubLObject mt_tail = cdestructuring_bind.property_list_member((SubLObject)lexicon_accessors.$kw65$MT, current);
        final SubLObject mt = (lexicon_accessors.NIL != mt_tail) ? conses_high.cadr(mt_tail) : lexicon_accessors.$const1$InferencePSC;
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)lexicon_accessors.$kw66$DONE, current);
        final SubLObject done = (SubLObject)((lexicon_accessors.NIL != done_tail) ? conses_high.cadr(done_tail) : lexicon_accessors.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject defining_mt = (SubLObject)lexicon_accessors.$sym67$DEFINING_MT;
        return (SubLObject)ConsesLow.list((SubLObject)lexicon_accessors.$sym68$PROGN, (SubLObject)lexicon_accessors.$list69, (SubLObject)ConsesLow.list((SubLObject)lexicon_accessors.$sym70$DO_DICTIONARY, (SubLObject)ConsesLow.list(pred, defining_mt, (SubLObject)lexicon_accessors.$sym61$_SPEECH_PART_PREDS_, done), (SubLObject)ConsesLow.listS((SubLObject)lexicon_accessors.$sym71$PWHEN, (SubLObject)ConsesLow.list((SubLObject)lexicon_accessors.$sym72$COR, (SubLObject)ConsesLow.listS((SubLObject)lexicon_accessors.$sym73$KBEQ, mt, (SubLObject)lexicon_accessors.$list74), (SubLObject)ConsesLow.list((SubLObject)lexicon_accessors.$sym75$GENL_LEXICON_MT_, mt, defining_mt)), ConsesLow.append(body, (SubLObject)lexicon_accessors.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 13874L)
    public static SubLObject speech_part_preds_initializedP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL != dictionary.dictionary_p(lexicon_accessors.$speech_part_preds$.getGlobalValue()) && lexicon_accessors.NIL == dictionary.dictionary_empty_p(lexicon_accessors.$speech_part_preds$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 14035L)
    public static SubLObject clear_speech_part_preds() {
        if (lexicon_accessors.NIL == dictionary.dictionary_p(lexicon_accessors.$speech_part_preds$.getGlobalValue())) {
            lexicon_accessors.$speech_part_preds$.setGlobalValue(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)lexicon_accessors.EQL), (SubLObject)lexicon_accessors.$int40$256));
        }
        return dictionary.clear_dictionary(lexicon_accessors.$speech_part_preds$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 14235L)
    public static SubLObject initialize_speech_part_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_speech_part_preds();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_accessors.$sym19$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(lexicon_accessors.$const20$EverythingPSC, thread);
            if (lexicon_accessors.NIL != constant_handles.valid_constantP(lexicon_accessors.$const76$SpeechPartPredicate, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                SubLObject node_var = lexicon_accessors.$const76$SpeechPartPredicate;
                final SubLObject deck_type = (SubLObject)lexicon_accessors.$kw46$STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$35 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)lexicon_accessors.NIL;
                        final SubLObject _prev_bind_0_$36 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$37 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((lexicon_accessors.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((lexicon_accessors.NIL != tv_var) ? lexicon_accessors.$sym47$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (lexicon_accessors.NIL != tv_var && lexicon_accessors.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && lexicon_accessors.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)lexicon_accessors.$kw48$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)lexicon_accessors.$kw51$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.$str52$continue_anyway, (SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)lexicon_accessors.$kw53$WARN)) {
                                    Errors.warn((SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)lexicon_accessors.$str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)lexicon_accessors.$str52$continue_anyway, (SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$38 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)lexicon_accessors.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls), thread);
                                if (lexicon_accessors.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || lexicon_accessors.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(lexicon_accessors.$const76$SpeechPartPredicate, sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$38 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$39 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$42 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)lexicon_accessors.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)lexicon_accessors.UNPROVIDED);
                                        while (lexicon_accessors.NIL != node_var) {
                                            final SubLObject sp_type = node_var;
                                            final SubLObject pred_var = lexicon_accessors.$const77$isa;
                                            if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(sp_type, (SubLObject)lexicon_accessors.TWO_INTEGER, pred_var)) {
                                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(sp_type, (SubLObject)lexicon_accessors.TWO_INTEGER, pred_var);
                                                SubLObject done_var = (SubLObject)lexicon_accessors.NIL;
                                                final SubLObject token_var = (SubLObject)lexicon_accessors.NIL;
                                                while (lexicon_accessors.NIL == done_var) {
                                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                    if (lexicon_accessors.NIL != valid) {
                                                        SubLObject final_index_iterator = (SubLObject)lexicon_accessors.NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.$kw56$TRUE, (SubLObject)lexicon_accessors.NIL);
                                                            SubLObject done_var_$43 = (SubLObject)lexicon_accessors.NIL;
                                                            final SubLObject token_var_$44 = (SubLObject)lexicon_accessors.NIL;
                                                            while (lexicon_accessors.NIL == done_var_$43) {
                                                                final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$44);
                                                                final SubLObject valid_$45 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$44.eql(as));
                                                                if (lexicon_accessors.NIL != valid_$45) {
                                                                    final SubLObject spp = assertions_high.gaf_arg1(as);
                                                                    final SubLObject mt = assertions_high.assertion_mt(as);
                                                                    dictionary_utilities.dictionary_push(lexicon_accessors.$speech_part_preds$.getGlobalValue(), spp, mt);
                                                                    removal_modules_lexicon.set_up_removal_support_for_speech_part_predicate(spp);
                                                                }
                                                                done_var_$43 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$45);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                                                final SubLObject _values = Values.getValuesAsVector();
                                                                if (lexicon_accessors.NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                                Values.restoreValuesFromVector(_values);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid);
                                                }
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls));
                                            SubLObject module_var = (SubLObject)lexicon_accessors.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (lexicon_accessors.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$40 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$40 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((lexicon_accessors.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (lexicon_accessors.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED));
                                                        if (lexicon_accessors.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED));
                                                            if (lexicon_accessors.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); lexicon_accessors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (lexicon_accessors.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$41 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            SubLObject iteration_state_$50;
                                                                            for (iteration_state_$50 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); lexicon_accessors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$50); iteration_state_$50 = dictionary_contents.do_dictionary_contents_next(iteration_state_$50)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$50);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (lexicon_accessors.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$42 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (lexicon_accessors.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)lexicon_accessors.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); lexicon_accessors.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (lexicon_accessors.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)lexicon_accessors.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (lexicon_accessors.NIL != csome_list_var) {
                                                                                                if (lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)lexicon_accessors.$str57$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$42, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$50);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$41, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)lexicon_accessors.FIVE_INTEGER, (SubLObject)lexicon_accessors.$str58$attempting_to_bind_direction_link, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (lexicon_accessors.NIL != obsolete.cnat_p(node, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$52;
                                                        final SubLObject new_list = cdolist_list_var_$52 = ((lexicon_accessors.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)lexicon_accessors.NIL;
                                                        generating_fn = cdolist_list_var_$52.first();
                                                        while (lexicon_accessors.NIL != cdolist_list_var_$52) {
                                                            final SubLObject _prev_bind_0_$43 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (lexicon_accessors.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)lexicon_accessors.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); lexicon_accessors.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (lexicon_accessors.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)lexicon_accessors.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (lexicon_accessors.NIL != csome_list_var2) {
                                                                        if (lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)lexicon_accessors.$str57$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$43, thread);
                                                            }
                                                            cdolist_list_var_$52 = cdolist_list_var_$52.rest();
                                                            generating_fn = cdolist_list_var_$52.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$40, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$40, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$42, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$39, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$38, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)lexicon_accessors.TWO_INTEGER, (SubLObject)lexicon_accessors.$str59$Node__a_does_not_pass_sbhl_type_t, lexicon_accessors.$const76$SpeechPartPredicate, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED)), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$38, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$37, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$37, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$36, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$35, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return lexicon_accessors.$speech_part_preds$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 14705L)
    public static SubLObject ensure_speech_part_preds_initialized() {
        if (lexicon_accessors.NIL == speech_part_preds_initializedP()) {
            initialize_speech_part_preds();
        }
        return (SubLObject)lexicon_accessors.$kw6$INITIALIZED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 14864L)
    public static SubLObject speech_part_predP(final SubLObject obj, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_accessors.$const1$InferencePSC;
        }
        ensure_speech_part_preds_initialized();
        final SubLObject mts = dictionary.dictionary_lookup_without_values(lexicon_accessors.$speech_part_preds$.getGlobalValue(), obj, (SubLObject)lexicon_accessors.UNPROVIDED);
        SubLObject mt_okP = kb_utilities.kbeq(mt, lexicon_accessors.$const1$InferencePSC);
        if (lexicon_accessors.NIL == mt_okP) {
            SubLObject csome_list_var;
            SubLObject ok_mt;
            for (csome_list_var = mts, ok_mt = (SubLObject)lexicon_accessors.NIL, ok_mt = csome_list_var.first(); lexicon_accessors.NIL == mt_okP && lexicon_accessors.NIL != csome_list_var; mt_okP = genl_lexicon_mtP(mt, ok_mt), csome_list_var = csome_list_var.rest(), ok_mt = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL != mts && lexicon_accessors.NIL != mt_okP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 15252L)
    public static SubLObject all_speech_part_preds(SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_accessors.$const1$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        ensure_speech_part_preds_initialized();
        if (lexicon_accessors.NIL != kb_utilities.kbeq(mt, lexicon_accessors.$const1$InferencePSC)) {
            return dictionary.dictionary_keys(lexicon_accessors.$speech_part_preds$.getGlobalValue());
        }
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lexicon_accessors.$speech_part_preds$.getGlobalValue())); lexicon_accessors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject sp = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject sp_mts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject mt_okP = (SubLObject)lexicon_accessors.NIL;
            if (lexicon_accessors.NIL == mt_okP) {
                SubLObject csome_list_var;
                SubLObject sp_mt;
                for (csome_list_var = sp_mts, sp_mt = (SubLObject)lexicon_accessors.NIL, sp_mt = csome_list_var.first(); lexicon_accessors.NIL == mt_okP && lexicon_accessors.NIL != csome_list_var; mt_okP = genl_lexicon_mtP(mt, sp_mt), csome_list_var = csome_list_var.rest(), sp_mt = csome_list_var.first()) {}
            }
            if (lexicon_accessors.NIL != mt_okP) {
                ans = (SubLObject)ConsesLow.cons(sp, ans);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 15858L)
    public static SubLObject spec_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return genl_pos_predP(pred2, pred1, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 16019L)
    public static SubLObject clear_genl_pos_predP() {
        final SubLObject cs = lexicon_accessors.$genl_pos_predP_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 16019L)
    public static SubLObject remove_genl_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_accessors.$genl_pos_predP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred1, pred2, mt), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 16019L)
    public static SubLObject genl_pos_predP_internal(final SubLObject pred1, final SubLObject pred2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pred1.equal(pred2)) {
            return (SubLObject)lexicon_accessors.T;
        }
        SubLObject result = (SubLObject)lexicon_accessors.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL != forts.fort_p(pred1) && lexicon_accessors.NIL != genl_predicates.genl_predP(pred1, pred2, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 16019L)
    public static SubLObject genl_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = lexicon_accessors.$genl_pos_predP_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_accessors.$sym78$GENL_POS_PRED_, (SubLObject)lexicon_accessors.$sym79$_GENL_POS_PRED__CACHING_STATE_, (SubLObject)lexicon_accessors.$int4$4096, (SubLObject)lexicon_accessors.EQUAL, (SubLObject)lexicon_accessors.THREE_INTEGER, (SubLObject)lexicon_accessors.$int35$128);
            memoization_state.register_genl_preds_dependent_cache_clear_callback((SubLObject)lexicon_accessors.$sym80$CLEAR_GENL_POS_PRED_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(pred1, pred2, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)lexicon_accessors.NIL;
            collision = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred2.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (lexicon_accessors.NIL != cached_args && lexicon_accessors.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(genl_pos_predP_internal(pred1, pred2, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred1, pred2, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 16459L)
    public static SubLObject clear_genl_pos_pred_from_mt_infoP() {
        final SubLObject cs = lexicon_accessors.$genl_pos_pred_from_mt_infoP_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 16459L)
    public static SubLObject remove_genl_pos_pred_from_mt_infoP(final SubLObject pred1, final SubLObject pred2, SubLObject mt_info) {
        if (mt_info == lexicon_accessors.UNPROVIDED) {
            mt_info = lexicon_vars.lexicon_lookup_mt_info();
        }
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_accessors.$genl_pos_pred_from_mt_infoP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred1, pred2, mt_info), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 16459L)
    public static SubLObject genl_pos_pred_from_mt_infoP_internal(final SubLObject pred1, final SubLObject pred2, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)lexicon_accessors.$sym19$RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_accessors.$sym19$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(lexicon_accessors.$const20$EverythingPSC, thread);
                ans = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL != forts.fort_p(pred1) && lexicon_accessors.NIL != genl_predicates.genl_predP(pred1, pred2, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED));
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (lexicon_accessors.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)lexicon_accessors.$sym82$RELEVANT_MT_IS_ANY_MT)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_accessors.$sym82$RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind(lexicon_accessors.$const1$InferencePSC, thread);
                ans = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL != forts.fort_p(pred1) && lexicon_accessors.NIL != genl_predicates.genl_predP(pred1, pred2, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED));
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (lexicon_accessors.NIL != hlmt.mt_union_naut_p(mt_info)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_accessors.$sym83$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                ans = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL != forts.fort_p(pred1) && lexicon_accessors.NIL != genl_predicates.genl_predP(pred1, pred2, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED));
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_accessors.$sym84$RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(mt_info, thread);
                ans = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL != forts.fort_p(pred1) && lexicon_accessors.NIL != genl_predicates.genl_predP(pred1, pred2, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED));
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 16459L)
    public static SubLObject genl_pos_pred_from_mt_infoP(final SubLObject pred1, final SubLObject pred2, SubLObject mt_info) {
        if (mt_info == lexicon_accessors.UNPROVIDED) {
            mt_info = lexicon_vars.lexicon_lookup_mt_info();
        }
        SubLObject caching_state = lexicon_accessors.$genl_pos_pred_from_mt_infoP_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_accessors.$sym81$GENL_POS_PRED_FROM_MT_INFO_, (SubLObject)lexicon_accessors.$sym85$_GENL_POS_PRED_FROM_MT_INFO__CACHING_STATE_, (SubLObject)lexicon_accessors.NIL, (SubLObject)lexicon_accessors.EQUAL, (SubLObject)lexicon_accessors.THREE_INTEGER, (SubLObject)lexicon_accessors.$int35$128);
            memoization_state.register_genl_preds_dependent_cache_clear_callback((SubLObject)lexicon_accessors.$sym86$CLEAR_GENL_POS_PRED_FROM_MT_INFO_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(pred1, pred2, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)lexicon_accessors.NIL;
            collision = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred2.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (lexicon_accessors.NIL != cached_args && lexicon_accessors.NIL == cached_args.rest() && mt_info.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(genl_pos_pred_from_mt_infoP_internal(pred1, pred2, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred1, pred2, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 16847L)
    public static SubLObject word_form_predictableP(final SubLObject word, final SubLObject string, final SubLObject pred, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        assert lexicon_accessors.NIL != Types.stringp(string) : string;
        assert lexicon_accessors.NIL != speech_part_predP(pred, (SubLObject)lexicon_accessors.UNPROVIDED) : pred;
        return subl_promotions.memberP(string, lexicon_cache.generate_regular_strings(word, pred, mt), (SubLObject)lexicon_accessors.$sym88$STRING_, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 17319L)
    public static SubLObject get_strings_of_type(final SubLObject word_unit, final SubLObject pos, SubLObject include, SubLObject exceptions, SubLObject mt) {
        if (include == lexicon_accessors.UNPROVIDED) {
            include = (SubLObject)lexicon_accessors.$kw8$ALL;
        }
        if (exceptions == lexicon_accessors.UNPROVIDED) {
            exceptions = (SubLObject)lexicon_accessors.NIL;
        }
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED) : pos;
        final SubLObject preds = max_preds_matching_pos(include, pos, mt, (SubLObject)lexicon_accessors.NIL);
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (lexicon_accessors.NIL != preds) {
                ans = lexicon_cache.strings_of_word_unit(word_unit, preds, exceptions, (SubLObject)lexicon_accessors.UNPROVIDED);
            }
            if (lexicon_accessors.NIL != constant_handles.valid_constantP(lexicon_accessors.$const89$ClosedClassWord, (SubLObject)lexicon_accessors.UNPROVIDED) && lexicon_accessors.NIL != constant_handles.valid_constantP(lexicon_accessors.$const90$partOfSpeech, (SubLObject)lexicon_accessors.UNPROVIDED) && lexicon_accessors.NIL != closed_lexical_classP(pos, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                SubLObject cdolist_list_var = kb_mapping.gather_gaf_arg_index(word_unit, (SubLObject)lexicon_accessors.ONE_INTEGER, lexicon_accessors.$const90$partOfSpeech, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                SubLObject as = (SubLObject)lexicon_accessors.NIL;
                as = cdolist_list_var.first();
                while (lexicon_accessors.NIL != cdolist_list_var) {
                    if (lexicon_accessors.NIL != genl_posP(assertions_high.gaf_arg2(as), pos, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                        final SubLObject item_var = assertions_high.gaf_arg3(as);
                        if (lexicon_accessors.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)lexicon_accessors.EQUALP), Symbols.symbol_function((SubLObject)lexicon_accessors.IDENTITY))) {
                            ans = (SubLObject)ConsesLow.cons(item_var, ans);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    as = cdolist_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 18231L)
    public static SubLObject clear_get_strings_of_type_cached() {
        final SubLObject cs = lexicon_accessors.$get_strings_of_type_cached_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 18231L)
    public static SubLObject remove_get_strings_of_type_cached(final SubLObject word_unit, final SubLObject pos, SubLObject include, SubLObject exceptions, SubLObject mt) {
        if (include == lexicon_accessors.UNPROVIDED) {
            include = (SubLObject)lexicon_accessors.$kw8$ALL;
        }
        if (exceptions == lexicon_accessors.UNPROVIDED) {
            exceptions = (SubLObject)lexicon_accessors.NIL;
        }
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_accessors.$get_strings_of_type_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(word_unit, pos, include, exceptions, mt), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 18231L)
    public static SubLObject get_strings_of_type_cached_internal(final SubLObject word_unit, final SubLObject pos, final SubLObject include, final SubLObject exceptions, final SubLObject mt) {
        assert lexicon_accessors.NIL != speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED) : pos;
        return get_strings_of_type(word_unit, pos, include, exceptions, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 18231L)
    public static SubLObject get_strings_of_type_cached(final SubLObject word_unit, final SubLObject pos, SubLObject include, SubLObject exceptions, SubLObject mt) {
        if (include == lexicon_accessors.UNPROVIDED) {
            include = (SubLObject)lexicon_accessors.$kw8$ALL;
        }
        if (exceptions == lexicon_accessors.UNPROVIDED) {
            exceptions = (SubLObject)lexicon_accessors.NIL;
        }
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = lexicon_accessors.$get_strings_of_type_cached_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_accessors.$sym91$GET_STRINGS_OF_TYPE_CACHED, (SubLObject)lexicon_accessors.$sym92$_GET_STRINGS_OF_TYPE_CACHED_CACHING_STATE_, (SubLObject)lexicon_accessors.$int25$512, (SubLObject)lexicon_accessors.EQL, (SubLObject)lexicon_accessors.FIVE_INTEGER, (SubLObject)lexicon_accessors.$int40$256);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(word_unit, pos, include, exceptions, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)lexicon_accessors.NIL;
            collision = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (word_unit.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pos.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (include.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (exceptions.eql(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (lexicon_accessors.NIL != cached_args && lexicon_accessors.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_strings_of_type_cached_internal(word_unit, pos, include, exceptions, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(word_unit, pos, include, exceptions, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 18555L)
    public static SubLObject string_is_pos_on_wuP_internal(final SubLObject string, final SubLObject word_unit, final SubLObject pos, SubLObject mt, SubLObject string_lookup_function, SubLObject parse_morphologically) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (string_lookup_function == lexicon_accessors.UNPROVIDED) {
            string_lookup_function = (SubLObject)lexicon_accessors.$sym94$GET_STRINGS_OF_TYPE;
        }
        if (parse_morphologically == lexicon_accessors.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        assert lexicon_accessors.NIL != Types.stringp(string) : string;
        assert lexicon_accessors.NIL != lexical_wordP(word_unit) : word_unit;
        assert lexicon_accessors.NIL != speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED) : pos;
        assert lexicon_accessors.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : parse_morphologically;
        if (lexicon_accessors.NIL == word_has_posP(word_unit, pos, (SubLObject)lexicon_accessors.UNPROVIDED)) {
            return (SubLObject)lexicon_accessors.NIL;
        }
        if (lexicon_accessors.NIL == skip_to_morphological_parsingP(parse_morphologically) && lexicon_accessors.NIL != string_is_pos_on_wuP_asserted(string, word_unit, pos, mt)) {
            return (SubLObject)lexicon_accessors.T;
        }
        SubLObject strings = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL == skip_to_morphological_parsingP(parse_morphologically)) {
            final SubLObject pcase_var = string_lookup_function;
            if (pcase_var.eql((SubLObject)lexicon_accessors.$sym94$GET_STRINGS_OF_TYPE)) {
                strings = get_strings_of_type(word_unit, pos, (SubLObject)lexicon_accessors.$kw8$ALL, (SubLObject)lexicon_accessors.NIL, mt);
            }
            else if (pcase_var.eql((SubLObject)lexicon_accessors.$sym91$GET_STRINGS_OF_TYPE_CACHED)) {
                strings = get_strings_of_type_cached(word_unit, pos, (SubLObject)lexicon_accessors.$kw8$ALL, (SubLObject)lexicon_accessors.NIL, mt);
            }
            else {
                strings = Functions.funcall(string_lookup_function, word_unit, pos, (SubLObject)lexicon_accessors.$kw8$ALL, (SubLObject)lexicon_accessors.NIL, mt);
            }
        }
        if (lexicon_accessors.NIL != subl_promotions.memberP(string, strings, Symbols.symbol_function((SubLObject)lexicon_accessors.EQUALP), (SubLObject)lexicon_accessors.UNPROVIDED)) {
            return (SubLObject)lexicon_accessors.T;
        }
        if (parse_morphologically == lexicon_accessors.$kw97$NEVER) {
            return (SubLObject)lexicon_accessors.NIL;
        }
        final SubLObject words = morphological_word_parser.words_of_complex_word_stringXspeech_part(string, pos);
        return subl_promotions.memberP(word_unit, words, Symbols.symbol_function((SubLObject)lexicon_accessors.$sym98$EQUALS_EL_), (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 18555L)
    public static SubLObject string_is_pos_on_wuP(final SubLObject string, final SubLObject word_unit, final SubLObject pos, SubLObject mt, SubLObject string_lookup_function, SubLObject parse_morphologically) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (string_lookup_function == lexicon_accessors.UNPROVIDED) {
            string_lookup_function = (SubLObject)lexicon_accessors.$sym94$GET_STRINGS_OF_TYPE;
        }
        if (parse_morphologically == lexicon_accessors.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL == v_memoization_state) {
            return string_is_pos_on_wuP_internal(string, word_unit, pos, mt, string_lookup_function, parse_morphologically);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)lexicon_accessors.$sym93$STRING_IS_POS_ON_WU_, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)lexicon_accessors.$sym93$STRING_IS_POS_ON_WU_, (SubLObject)lexicon_accessors.SIX_INTEGER, (SubLObject)lexicon_accessors.NIL, (SubLObject)lexicon_accessors.EQUAL, (SubLObject)lexicon_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)lexicon_accessors.$sym93$STRING_IS_POS_ON_WU_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(string, word_unit, pos, mt, string_lookup_function, parse_morphologically);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)lexicon_accessors.NIL;
            collision = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (word_unit.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (pos.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (string_lookup_function.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (lexicon_accessors.NIL != cached_args && lexicon_accessors.NIL == cached_args.rest() && parse_morphologically.equal(cached_args.first())) {
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
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(string_is_pos_on_wuP_internal(string, word_unit, pos, mt, string_lookup_function, parse_morphologically)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(string, word_unit, pos, mt, string_lookup_function, parse_morphologically));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 19966L)
    public static SubLObject string_is_pos_on_wuP_asserted(final SubLObject string, final SubLObject word_unit, final SubLObject pos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$55 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject _prev_bind_0_$56 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                        ensure_speech_part_preds_initialized();
                        SubLObject iteration_state;
                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lexicon_accessors.$speech_part_preds$.getGlobalValue())); lexicon_accessors.NIL == ans && lexicon_accessors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                            thread.resetMultipleValues();
                            final SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            final SubLObject defining_mt = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (lexicon_accessors.NIL != kb_utilities.kbeq(lexicon_accessors.$const1$InferencePSC, lexicon_accessors.$const1$InferencePSC) || lexicon_accessors.NIL != genl_lexicon_mtP(lexicon_accessors.$const1$InferencePSC, defining_mt)) {
                                final SubLObject pred_var = pred;
                                if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, (SubLObject)lexicon_accessors.ONE_INTEGER, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, (SubLObject)lexicon_accessors.ONE_INTEGER, pred_var);
                                    SubLObject done_var = ans;
                                    final SubLObject token_var = (SubLObject)lexicon_accessors.NIL;
                                    while (lexicon_accessors.NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                        if (lexicon_accessors.NIL != valid) {
                                            SubLObject final_index_iterator = (SubLObject)lexicon_accessors.NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.NIL, (SubLObject)lexicon_accessors.NIL);
                                                SubLObject done_var_$57 = ans;
                                                final SubLObject token_var_$58 = (SubLObject)lexicon_accessors.NIL;
                                                while (lexicon_accessors.NIL == done_var_$57) {
                                                    final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$58);
                                                    final SubLObject valid_$59 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$58.eql(as));
                                                    if (lexicon_accessors.NIL != valid_$59 && assertions_high.gaf_arg2(as).equalp(string)) {
                                                        final SubLObject curr_pos = pos_of_pred(pred);
                                                        final SubLObject okP = (SubLObject)((lexicon_accessors.NIL != pos) ? genl_posP(curr_pos, pos, (SubLObject)lexicon_accessors.UNPROVIDED) : lexicon_accessors.NIL);
                                                        if (lexicon_accessors.NIL != okP) {
                                                            ans = (SubLObject)lexicon_accessors.T;
                                                        }
                                                    }
                                                    done_var_$57 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$59 || lexicon_accessors.NIL != ans);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                                    final SubLObject _values = Values.getValuesAsVector();
                                                    if (lexicon_accessors.NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    Values.restoreValuesFromVector(_values);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                                                }
                                            }
                                        }
                                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid || lexicon_accessors.NIL != ans);
                                    }
                                }
                            }
                        }
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$56, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$58 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$58, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$55, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 20479L)
    public static SubLObject string_is_pred_on_wuP(final SubLObject string, final SubLObject word_unit, final SubLObject pred, SubLObject mt, SubLObject parse_morphologically) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == lexicon_accessors.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != Types.stringp(string) : string;
        assert lexicon_accessors.NIL != lexical_wordP(word_unit) : word_unit;
        assert lexicon_accessors.NIL != speech_part_predP(pred, (SubLObject)lexicon_accessors.UNPROVIDED) : pred;
        assert lexicon_accessors.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : parse_morphologically;
        SubLObject successP = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$62 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (lexicon_accessors.NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                        final SubLObject string_preds = preds_of_stringXword(string, word_unit, lexicon_vars.$misspellingsP$.getDynamicValue(thread), mt, (SubLObject)lexicon_accessors.$kw97$NEVER);
                        if (lexicon_accessors.NIL == successP) {
                            SubLObject csome_list_var = string_preds;
                            SubLObject string_pred = (SubLObject)lexicon_accessors.NIL;
                            string_pred = csome_list_var.first();
                            while (lexicon_accessors.NIL == successP && lexicon_accessors.NIL != csome_list_var) {
                                if (lexicon_accessors.NIL != genl_pos_predP(string_pred, pred, mt)) {
                                    successP = (SubLObject)lexicon_accessors.T;
                                }
                                csome_list_var = csome_list_var.rest();
                                string_pred = csome_list_var.first();
                            }
                        }
                    }
                    if (lexicon_accessors.NIL == successP && parse_morphologically != lexicon_accessors.$kw97$NEVER) {
                        final SubLObject morph_string_preds = morphological_word_parser.preds_of_complex_word_stringXword(string, word_unit);
                        if (lexicon_accessors.NIL == successP) {
                            SubLObject csome_list_var = morph_string_preds;
                            SubLObject string_pred = (SubLObject)lexicon_accessors.NIL;
                            string_pred = csome_list_var.first();
                            while (lexicon_accessors.NIL == successP && lexicon_accessors.NIL != csome_list_var) {
                                if (lexicon_accessors.NIL != genl_pos_predP(string_pred, pred, mt)) {
                                    successP = (SubLObject)lexicon_accessors.T;
                                }
                                csome_list_var = csome_list_var.rest();
                                string_pred = csome_list_var.first();
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$63 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$62, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 21791L)
    public static SubLObject best_wu_for_string(final SubLObject string, final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject words = (SubLObject)lexicon_accessors.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$parse_morphologically$.currentBinding(thread);
        try {
            lexicon_vars.$parse_morphologically$.bind((SubLObject)lexicon_accessors.$kw99$AS_FALLBACK, thread);
            words = words_of_stringXspeech_part(string, pos, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        finally {
            lexicon_vars.$parse_morphologically$.rebind(_prev_bind_0, thread);
        }
        return words.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 22122L)
    public static SubLObject best_pos_for_stringXwuXpos(final SubLObject string, final SubLObject wu, final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject poses = pos_of_stringXword(string, wu, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
        SubLObject result = (SubLObject)lexicon_accessors.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = Sequences.find(pos, poses, (SubLObject)lexicon_accessors.$sym100$SPEC_, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 22533L)
    public static SubLObject words_of_stringXpred(final SubLObject string, final SubLObject pred, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == lexicon_accessors.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != Types.stringp(string) : string;
        assert lexicon_accessors.NIL != speech_part_predP(pred, (SubLObject)lexicon_accessors.UNPROVIDED) : pred;
        assert lexicon_accessors.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : parse_morphologically;
        SubLObject result = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL != string_utilities.non_empty_string_p(string)) {
            final SubLObject current_state = memoization_state.current_memoization_state();
            final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
            try {
                lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
                final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$64 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        if (lexicon_accessors.NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                            result = nl_trie_accessors.nl_trie_words_of_stringXpred(string, pred, misspellingsP, lookup_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
                        }
                        if (lexicon_accessors.NIL != proceed_with_morphological_parsingP(result, parse_morphologically)) {
                            result = Sequences.delete_duplicates(ConsesLow.append(result, morphological_word_parser.words_of_complex_word_stringXpred(string, pred)), Symbols.symbol_function((SubLObject)lexicon_accessors.EQUAL), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                        }
                        if (lexicon_accessors.NIL != Characters.upper_case_p(string_utilities.first_char(string)) && lexicon_accessors.NIL != genl_posP(pos_of_pred(pred), lexicon_accessors.$const43$ProperNoun, lookup_mt)) {
                            result = Sequences.delete_duplicates(ConsesLow.append(result, words_of_stringXpred(Strings.string_downcase(string, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED), lexicon_utilities.common_noun_form_of_pred(pred), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED)), Symbols.symbol_function((SubLObject)lexicon_accessors.EQUAL), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$65 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$65, thread);
                        }
                    }
                }
                finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$64, thread);
                }
            }
            finally {
                lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 23989L)
    public static SubLObject clear_pos_for_keyword() {
        final SubLObject cs = lexicon_accessors.$pos_for_keyword_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 23989L)
    public static SubLObject remove_pos_for_keyword(final SubLObject pos_keyword, SubLObject lexical_mt) {
        if (lexical_mt == lexicon_accessors.UNPROVIDED) {
            lexical_mt = lexicon_accessors.$const101$EnglishLexiconMt;
        }
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_accessors.$pos_for_keyword_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pos_keyword, lexical_mt), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 23989L)
    public static SubLObject pos_for_keyword_internal(final SubLObject pos_keyword, final SubLObject lexical_mt) {
        assert lexicon_accessors.NIL != Types.keywordp(pos_keyword) : pos_keyword;
        SubLObject real_pos = (SubLObject)lexicon_accessors.NIL;
        if (pos_keyword.eql((SubLObject)lexicon_accessors.$kw104$ALL_NOUN_FORMS)) {
            real_pos = genls.all_specs(lexicon_accessors.$const36$Noun, lexical_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        else if (pos_keyword.eql((SubLObject)lexicon_accessors.$kw105$NOUN)) {
            real_pos = (SubLObject)lexicon_accessors.$list106;
        }
        else if (pos_keyword.eql((SubLObject)lexicon_accessors.$kw107$MASS_NOUN)) {
            real_pos = (SubLObject)lexicon_accessors.$list108;
        }
        else if (pos_keyword.eql((SubLObject)lexicon_accessors.$kw109$SIMPLE_NOUN)) {
            real_pos = genls.all_specs(lexicon_accessors.$const110$CountNoun, lexical_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        else if (pos_keyword.eql((SubLObject)lexicon_accessors.$kw111$DEVERBAL_NOUN)) {
            real_pos = genls.all_specs(lexicon_accessors.$const112$DeVerbalNoun, lexical_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        else if (pos_keyword.eql((SubLObject)lexicon_accessors.$kw113$AGENTIVE_NOUN)) {
            real_pos = genls.all_specs(lexicon_accessors.$const114$AgentiveNoun, lexical_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        else if (pos_keyword.eql((SubLObject)lexicon_accessors.$kw115$GERUNDIVE_NOUN)) {
            real_pos = genls.all_specs(lexicon_accessors.$const116$GerundiveNoun, lexical_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        else if (pos_keyword.eql((SubLObject)lexicon_accessors.$kw117$PROPER_NOUN)) {
            real_pos = genls.all_specs(lexicon_accessors.$const43$ProperNoun, lexical_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        else if (pos_keyword.eql((SubLObject)lexicon_accessors.$kw118$VERB)) {
            real_pos = (SubLObject)lexicon_accessors.$list119;
        }
        else if (pos_keyword.eql((SubLObject)lexicon_accessors.$kw120$AUX)) {
            real_pos = genls.all_specs(lexicon_accessors.$const121$AuxVerb, lexical_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        else if (pos_keyword.eql((SubLObject)lexicon_accessors.$kw122$ADJECTIVE)) {
            real_pos = genls.all_specs(lexicon_accessors.$const123$Adjective, lexical_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        else if (pos_keyword.eql((SubLObject)lexicon_accessors.$kw124$ADVERB)) {
            real_pos = genls.all_specs(lexicon_accessors.$const125$Adverb, lexical_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        else if (pos_keyword.eql((SubLObject)lexicon_accessors.$kw126$PREP)) {
            real_pos = genls.all_specs(lexicon_accessors.$const127$Preposition, lexical_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        else if (pos_keyword.eql((SubLObject)lexicon_accessors.$kw128$DET)) {
            real_pos = genls.all_specs(lexicon_accessors.$const129$Determiner, lexical_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        else if (pos_keyword.eql((SubLObject)lexicon_accessors.$kw130$CONJ)) {
            real_pos = genls.all_specs(lexicon_accessors.$const131$Conjunction, lexical_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        else if (pos_keyword.eql((SubLObject)lexicon_accessors.$kw132$ANY)) {
            real_pos = all_speech_parts(lexical_mt);
        }
        return real_pos;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 23989L)
    public static SubLObject pos_for_keyword(final SubLObject pos_keyword, SubLObject lexical_mt) {
        if (lexical_mt == lexicon_accessors.UNPROVIDED) {
            lexical_mt = lexicon_accessors.$const101$EnglishLexiconMt;
        }
        SubLObject caching_state = lexicon_accessors.$pos_for_keyword_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_accessors.$sym102$POS_FOR_KEYWORD, (SubLObject)lexicon_accessors.$sym133$_POS_FOR_KEYWORD_CACHING_STATE_, (SubLObject)lexicon_accessors.$int134$64, (SubLObject)lexicon_accessors.EQL, (SubLObject)lexicon_accessors.TWO_INTEGER, (SubLObject)lexicon_accessors.TWELVE_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pos_keyword, lexical_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)lexicon_accessors.NIL;
            collision = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pos_keyword.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (lexicon_accessors.NIL != cached_args && lexicon_accessors.NIL == cached_args.rest() && lexical_mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pos_for_keyword_internal(pos_keyword, lexical_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pos_keyword, lexical_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 25754L)
    public static SubLObject words_of_stringXpos(final SubLObject string, final SubLObject pos_keyword, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == lexicon_accessors.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != Types.stringp(string) : string;
        assert lexicon_accessors.NIL != Types.keywordp(pos_keyword) : pos_keyword;
        assert lexicon_accessors.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : parse_morphologically;
        SubLObject word_units = (SubLObject)lexicon_accessors.NIL;
        SubLObject preds = (SubLObject)lexicon_accessors.NIL;
        SubLObject lex_preds = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$66 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (lexicon_accessors.NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject word_units_$67 = nl_trie_accessors.nl_trie_words_of_stringXpos(string, pos_keyword, misspellingsP, lookup_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
                        final SubLObject preds_$68 = thread.secondMultipleValue();
                        final SubLObject lex_preds_$69 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        word_units = word_units_$67;
                        preds = preds_$68;
                        lex_preds = lex_preds_$69;
                        if (Sequences.remove_duplicates(lex_preds, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED).equal((SubLObject)lexicon_accessors.$list135)) {
                            word_units = (SubLObject)lexicon_accessors.NIL;
                            preds = (SubLObject)lexicon_accessors.NIL;
                            lex_preds = (SubLObject)lexicon_accessors.NIL;
                        }
                    }
                    if (lexicon_accessors.NIL != proceed_with_morphological_parsingP(word_units, parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject morph_word_units = morphological_word_parser.words_of_complex_word_stringXpos(string, pos_keyword, lookup_mt);
                        final SubLObject morph_preds = thread.secondMultipleValue();
                        final SubLObject morph_lex_preds = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        word_units = ConsesLow.append(word_units, morph_word_units);
                        preds = ConsesLow.append(preds, morph_preds);
                        lex_preds = ConsesLow.append(lex_preds, morph_lex_preds);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$67 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$66, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(word_units, preds, lex_preds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 28079L)
    public static SubLObject words_of_stringXspeech_part(final SubLObject string, final SubLObject pos, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == lexicon_accessors.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != Types.stringp(string) : string;
        assert lexicon_accessors.NIL != speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED) : pos;
        assert lexicon_accessors.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : parse_morphologically;
        SubLObject word_units = (SubLObject)lexicon_accessors.NIL;
        SubLObject preds = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$71 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (lexicon_accessors.NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject word_units_$72 = nl_trie_accessors.nl_trie_words_of_stringXspeech_part(string, pos, misspellingsP, lookup_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
                        final SubLObject preds_$73 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        word_units = word_units_$72;
                        preds = preds_$73;
                    }
                    if (lexicon_accessors.NIL != proceed_with_morphological_parsingP(word_units, parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject morph_word_units = morphological_word_parser.words_of_complex_word_stringXspeech_part(string, pos);
                        final SubLObject morph_preds = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        word_units = ConsesLow.append(word_units, morph_word_units);
                        preds = ConsesLow.append(preds, Mapping.mapcan((SubLObject)lexicon_accessors.IDENTITY, morph_preds, lexicon_accessors.EMPTY_SUBL_OBJECT_ARRAY));
                    }
                    if (lexicon_accessors.NIL != Characters.upper_case_p(string_utilities.first_char(string)) && lexicon_accessors.NIL != genl_posP(pos, lexicon_accessors.$const43$ProperNoun, lookup_mt)) {
                        thread.resetMultipleValues();
                        final SubLObject proper_word_units = words_of_stringXspeech_part(Strings.string_downcase(string, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED), lexicon_utilities.common_noun_form_of_pos(pos), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                        final SubLObject proper_preds = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        word_units = ConsesLow.append(word_units, proper_word_units);
                        preds = ConsesLow.append(preds, Mapping.mapcar((SubLObject)lexicon_accessors.$sym136$PROPER_NOUN_FORM_OF_PRED, proper_preds));
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$72 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$71, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(word_units, preds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 29788L)
    public static SubLObject preds_of_stringXword(final SubLObject string, final SubLObject word, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == lexicon_accessors.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        return (SubLObject)((lexicon_accessors.NIL != control_vars.kb_loaded()) ? conses_high.copy_list(preds_of_stringXword_cached(string, word, misspellingsP, lookup_mt, parse_morphologically)) : lexicon_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 30534L)
    public static SubLObject clear_preds_of_stringXword() {
        return clear_preds_of_stringXword_cached();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 30628L)
    public static SubLObject clear_preds_of_stringXword_cached() {
        final SubLObject cs = lexicon_accessors.$preds_of_stringXword_cached_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 30628L)
    public static SubLObject remove_preds_of_stringXword_cached(final SubLObject string, final SubLObject word, final SubLObject misspellingsP, final SubLObject lookup_mt, final SubLObject parse_morphologically) {
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_accessors.$preds_of_stringXword_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(string, word, misspellingsP, lookup_mt, parse_morphologically), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 30628L)
    public static SubLObject preds_of_stringXword_cached_internal(final SubLObject string, final SubLObject word, final SubLObject misspellingsP, final SubLObject lookup_mt, final SubLObject parse_morphologically) {
        assert lexicon_accessors.NIL != Types.stringp(string) : string;
        assert lexicon_accessors.NIL != lexical_wordP(word) : word;
        assert lexicon_accessors.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : parse_morphologically;
        SubLObject result = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL == skip_to_morphological_parsingP(parse_morphologically)) {
            result = nl_trie_accessors.nl_trie_preds_of_stringXword(string, word, misspellingsP, lookup_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        if (lexicon_accessors.NIL != proceed_with_morphological_parsingP(result, parse_morphologically)) {
            result = Sequences.delete_duplicates(ConsesLow.append(result, morphological_word_parser.preds_of_complex_word_stringXword(string, word)), Symbols.symbol_function((SubLObject)lexicon_accessors.EQL), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 30628L)
    public static SubLObject preds_of_stringXword_cached(final SubLObject string, final SubLObject word, final SubLObject misspellingsP, final SubLObject lookup_mt, final SubLObject parse_morphologically) {
        SubLObject caching_state = lexicon_accessors.$preds_of_stringXword_cached_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_accessors.$sym137$PREDS_OF_STRING_WORD_CACHED, (SubLObject)lexicon_accessors.$sym138$_PREDS_OF_STRING_WORD_CACHED_CACHING_STATE_, (SubLObject)lexicon_accessors.$int40$256, (SubLObject)lexicon_accessors.EQUAL, (SubLObject)lexicon_accessors.FIVE_INTEGER, (SubLObject)lexicon_accessors.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(string, word, misspellingsP, lookup_mt, parse_morphologically);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)lexicon_accessors.NIL;
            collision = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (word.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (misspellingsP.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (lookup_mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (lexicon_accessors.NIL != cached_args && lexicon_accessors.NIL == cached_args.rest() && parse_morphologically.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(preds_of_stringXword_cached_internal(string, word, misspellingsP, lookup_mt, parse_morphologically)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(string, word, misspellingsP, lookup_mt, parse_morphologically));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 31326L)
    public static SubLObject other_strings_of_wu(final SubLObject word_unit, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != lexical_wordP(word_unit) : word_unit;
        SubLObject strings = (SubLObject)lexicon_accessors.NIL;
        final SubLObject string_var = (SubLObject)lexicon_accessors.$sym139$_STRING;
        final SubLObject v_properties = (SubLObject)ConsesLow.list((SubLObject)lexicon_accessors.$kw140$MAX_TRANSFORMATION_DEPTH, (SubLObject)lexicon_accessors.ZERO_INTEGER);
        final SubLObject _prev_bind_0 = lexicon_vars.$misspellingsP$.currentBinding(thread);
        try {
            lexicon_vars.$misspellingsP$.bind(misspellingsP, thread);
            if (lexicon_accessors.NIL != constant_handles.valid_constantP(lexicon_accessors.$const90$partOfSpeech, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                strings = ask_utilities.query_variable(string_var, (SubLObject)ConsesLow.list(lexicon_accessors.$const90$partOfSpeech, word_unit, (SubLObject)lexicon_accessors.$sym141$_POS, string_var), lookup_mt, v_properties);
            }
        }
        finally {
            lexicon_vars.$misspellingsP$.rebind(_prev_bind_0, thread);
        }
        return Sequences.remove_duplicates(strings, Symbols.symbol_function((SubLObject)lexicon_accessors.EQUAL), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 32223L)
    public static SubLObject right_frames_for_pos(final SubLObject pos) {
        assert lexicon_accessors.NIL != speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED) : pos;
        if (pos.eql(lexicon_accessors.$const142$Verb)) {
            return lexicon_vars.verb_frames(lexicon_accessors.$const143$GeneralEnglishMt);
        }
        if (pos.eql(lexicon_accessors.$const125$Adverb)) {
            return isa.all_fort_instances(lexicon_accessors.$const144$FrameForAdverbs, lexicon_accessors.$const143$GeneralEnglishMt, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        if (pos.eql(lexicon_accessors.$const145$ProperCountNoun)) {
            return (SubLObject)lexicon_accessors.$list146;
        }
        if (pos.eql(lexicon_accessors.$const147$ProperMassNoun)) {
            return (SubLObject)lexicon_accessors.$list146;
        }
        if (pos.eql(lexicon_accessors.$const110$CountNoun)) {
            return isa.all_fort_instances(lexicon_accessors.$const148$FrameForNouns, lexicon_accessors.$const143$GeneralEnglishMt, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        if (pos.eql(lexicon_accessors.$const149$MassNoun)) {
            return Sequences.delete(lexicon_accessors.$const150$ZeroArticleFrame, isa.all_fort_instances(lexicon_accessors.$const148$FrameForNouns, lexicon_accessors.$const143$GeneralEnglishMt, (SubLObject)lexicon_accessors.UNPROVIDED), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        if (pos.eql(lexicon_accessors.$const123$Adjective)) {
            return Sequences.delete(lexicon_accessors.$const151$FrameForAdjectives, isa.all_fort_instances(lexicon_accessors.$const151$FrameForAdjectives, lexicon_accessors.$const143$GeneralEnglishMt, (SubLObject)lexicon_accessors.UNPROVIDED), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 33193L)
    public static SubLObject pos_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == lexicon_accessors.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != Types.stringp(string) : string;
        SubLObject result = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$75 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (lexicon_accessors.NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                        result = nl_trie_accessors.nl_trie_pos_of_string(string, misspellingsP, lookup_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
                    }
                    if (lexicon_accessors.NIL != proceed_with_morphological_parsingP(result, parse_morphologically)) {
                        result = Sequences.delete_duplicates(ConsesLow.append(result, morphological_word_parser.pos_of_complex_word_string(string)), Symbols.symbol_function((SubLObject)lexicon_accessors.EQL), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$76 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$75, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 34379L)
    public static SubLObject string_is_posP(final SubLObject string, final SubLObject pos, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == lexicon_accessors.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != Types.stringp(string) : string;
        assert lexicon_accessors.NIL != speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED) : pos;
        assert lexicon_accessors.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : parse_morphologically;
        SubLObject result = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$77 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    result = nl_trie_accessors.nl_trie_string_is_posP(string, pos, misspellingsP, lookup_mt);
                    if (lexicon_accessors.NIL == result && parse_morphologically != lexicon_accessors.$kw97$NEVER) {
                        result = morphological_word_parser.complex_word_string_is_speech_partP(string, pos);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$78 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$78, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$77, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 35328L)
    public static SubLObject string_is_form_of_aux_verbP(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return string_is_posP(string, lexicon_accessors.$const121$AuxVerb, misspellingsP, lookup_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 35828L)
    public static SubLObject clear_closed_lexical_class_hash() {
        Hashtables.clrhash(lexicon_accessors.$closed_lexical_class_strings$.getGlobalValue());
        Hashtables.clrhash(lexicon_accessors.$closed_lexical_class_strings_case_insensitive$.getGlobalValue());
        return lexicon_accessors.$closed_lexical_class_strings$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 36025L)
    public static SubLObject initialize_closed_lexical_class_strings() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_closed_lexical_class_hash();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_accessors.$sym19$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(lexicon_accessors.$const20$EverythingPSC, thread);
            if (lexicon_accessors.NIL != constant_handles.valid_constantP(lexicon_accessors.$const89$ClosedClassWord, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                SubLObject node_var = lexicon_accessors.$const89$ClosedClassWord;
                final SubLObject deck_type = (SubLObject)lexicon_accessors.$kw46$STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$79 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)lexicon_accessors.NIL;
                        final SubLObject _prev_bind_0_$80 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$81 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((lexicon_accessors.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((lexicon_accessors.NIL != tv_var) ? lexicon_accessors.$sym47$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (lexicon_accessors.NIL != tv_var && lexicon_accessors.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && lexicon_accessors.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)lexicon_accessors.$kw48$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)lexicon_accessors.$kw51$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.$str52$continue_anyway, (SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)lexicon_accessors.$kw53$WARN)) {
                                    Errors.warn((SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)lexicon_accessors.$str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)lexicon_accessors.$str52$continue_anyway, (SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$81 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$82 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)lexicon_accessors.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls), thread);
                                if (lexicon_accessors.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || lexicon_accessors.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(lexicon_accessors.$const89$ClosedClassWord, sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$82 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$83 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$86 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)lexicon_accessors.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)lexicon_accessors.UNPROVIDED);
                                        while (lexicon_accessors.NIL != node_var) {
                                            final SubLObject pos = node_var;
                                            final SubLObject pred_var = lexicon_accessors.$const90$partOfSpeech;
                                            if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pos, (SubLObject)lexicon_accessors.TWO_INTEGER, pred_var)) {
                                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pos, (SubLObject)lexicon_accessors.TWO_INTEGER, pred_var);
                                                SubLObject done_var = (SubLObject)lexicon_accessors.NIL;
                                                final SubLObject token_var = (SubLObject)lexicon_accessors.NIL;
                                                while (lexicon_accessors.NIL == done_var) {
                                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                    if (lexicon_accessors.NIL != valid) {
                                                        SubLObject final_index_iterator = (SubLObject)lexicon_accessors.NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.$kw56$TRUE, (SubLObject)lexicon_accessors.NIL);
                                                            SubLObject done_var_$87 = (SubLObject)lexicon_accessors.NIL;
                                                            final SubLObject token_var_$88 = (SubLObject)lexicon_accessors.NIL;
                                                            while (lexicon_accessors.NIL == done_var_$87) {
                                                                final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$88);
                                                                final SubLObject valid_$89 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$88.eql(as));
                                                                if (lexicon_accessors.NIL != valid_$89) {
                                                                    final SubLObject string = assertions_high.gaf_arg3(as);
                                                                    final SubLObject mt = assertions_high.assertion_mt(as);
                                                                    hash_table_utilities.pushnew_hash(string, mt, lexicon_accessors.$closed_lexical_class_strings$.getGlobalValue(), (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                    hash_table_utilities.pushnew_hash(string, mt, lexicon_accessors.$closed_lexical_class_strings_case_insensitive$.getGlobalValue(), (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                }
                                                                done_var_$87 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$89);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$83 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                                                final SubLObject _values = Values.getValuesAsVector();
                                                                if (lexicon_accessors.NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                                Values.restoreValuesFromVector(_values);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid);
                                                }
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls));
                                            SubLObject module_var = (SubLObject)lexicon_accessors.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (lexicon_accessors.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$84 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$84 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((lexicon_accessors.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (lexicon_accessors.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED));
                                                        if (lexicon_accessors.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED));
                                                            if (lexicon_accessors.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); lexicon_accessors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (lexicon_accessors.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$85 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            SubLObject iteration_state_$94;
                                                                            for (iteration_state_$94 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); lexicon_accessors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$94); iteration_state_$94 = dictionary_contents.do_dictionary_contents_next(iteration_state_$94)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$94);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (lexicon_accessors.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$86 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (lexicon_accessors.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)lexicon_accessors.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); lexicon_accessors.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (lexicon_accessors.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)lexicon_accessors.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (lexicon_accessors.NIL != csome_list_var) {
                                                                                                if (lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)lexicon_accessors.$str57$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$86, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$94);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$85, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)lexicon_accessors.FIVE_INTEGER, (SubLObject)lexicon_accessors.$str58$attempting_to_bind_direction_link, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (lexicon_accessors.NIL != obsolete.cnat_p(node, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$96;
                                                        final SubLObject new_list = cdolist_list_var_$96 = ((lexicon_accessors.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)lexicon_accessors.NIL;
                                                        generating_fn = cdolist_list_var_$96.first();
                                                        while (lexicon_accessors.NIL != cdolist_list_var_$96) {
                                                            final SubLObject _prev_bind_0_$87 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (lexicon_accessors.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)lexicon_accessors.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); lexicon_accessors.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (lexicon_accessors.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)lexicon_accessors.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (lexicon_accessors.NIL != csome_list_var2) {
                                                                        if (lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)lexicon_accessors.$str57$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$87, thread);
                                                            }
                                                            cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                                                            generating_fn = cdolist_list_var_$96.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$84, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$84, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$86, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$83, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$82, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)lexicon_accessors.TWO_INTEGER, (SubLObject)lexicon_accessors.$str59$Node__a_does_not_pass_sbhl_type_t, lexicon_accessors.$const89$ClosedClassWord, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED)), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$82, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$81, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$81, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$80, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$88 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$88, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$79, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return lexicon_accessors.$closed_lexical_class_strings$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 36638L)
    public static SubLObject closed_lexical_class_string_intP(final SubLObject string, final SubLObject mt, final SubLObject case_sensitiveP) {
        if (!string.isString()) {
            return (SubLObject)lexicon_accessors.NIL;
        }
        if (!Hashtables.hash_table_count(lexicon_accessors.$closed_lexical_class_strings$.getGlobalValue()).isPositive()) {
            initialize_closed_lexical_class_strings();
        }
        final SubLObject hash = (lexicon_accessors.NIL != case_sensitiveP) ? lexicon_accessors.$closed_lexical_class_strings$.getGlobalValue() : lexicon_accessors.$closed_lexical_class_strings_case_insensitive$.getGlobalValue();
        final SubLObject ok_mts = Hashtables.gethash(string, hash, (SubLObject)lexicon_accessors.UNPROVIDED);
        SubLObject mt_okP = kb_utilities.kbeq(mt, lexicon_accessors.$const1$InferencePSC);
        if (lexicon_accessors.NIL == mt_okP) {
            SubLObject csome_list_var;
            SubLObject ok_mt;
            for (csome_list_var = ok_mts, ok_mt = (SubLObject)lexicon_accessors.NIL, ok_mt = csome_list_var.first(); lexicon_accessors.NIL == mt_okP && lexicon_accessors.NIL != csome_list_var; mt_okP = genl_lexicon_mtP(mt, ok_mt), csome_list_var = csome_list_var.rest(), ok_mt = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL != ok_mts && lexicon_accessors.NIL != mt_okP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 37427L)
    public static SubLObject closed_lexical_class_stringP(final SubLObject string, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_accessors.$const1$InferencePSC;
        }
        return closed_lexical_class_string_intP(string, mt, (SubLObject)lexicon_accessors.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 37820L)
    public static SubLObject closed_lexical_class_string_case_insensitiveP(final SubLObject string, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_accessors.$const1$InferencePSC;
        }
        return closed_lexical_class_string_intP(string, mt, (SubLObject)lexicon_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 38232L)
    public static SubLObject non_pronominal_closed_lexical_class_stringP(final SubLObject string, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_accessors.$const1$InferencePSC;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL != closed_lexical_class_stringP(string, mt) && lexicon_accessors.NIL == string_is_posP(string, lexicon_accessors.$const154$Pronoun, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 38435L)
    public static SubLObject contains_closed_lexical_class_wordP(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject class_member_found = (SubLObject)lexicon_accessors.NIL;
        final SubLObject _prev_bind_0 = string_utilities.$test_char$.currentBinding(thread);
        try {
            string_utilities.$test_char$.bind(string_utilities.$space_char$.getGlobalValue(), thread);
            SubLObject cdolist_list_var;
            final SubLObject word_list_var = cdolist_list_var = string_utilities.break_words(string, (SubLObject)lexicon_accessors.$sym155$NOT_TEST_CHAR, (SubLObject)lexicon_accessors.UNPROVIDED);
            SubLObject word = (SubLObject)lexicon_accessors.NIL;
            word = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                if (lexicon_accessors.NIL != closed_lexical_class_stringP(word, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                    class_member_found = (SubLObject)lexicon_accessors.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            }
        }
        finally {
            string_utilities.$test_char$.rebind(_prev_bind_0, thread);
        }
        return class_member_found;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 38918L)
    public static SubLObject clear_closed_lexical_class_strings() {
        final SubLObject cs = lexicon_accessors.$closed_lexical_class_strings_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 38918L)
    public static SubLObject remove_closed_lexical_class_strings(SubLObject lookup_mt) {
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_accessors.$closed_lexical_class_strings_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(lookup_mt), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 38918L)
    public static SubLObject closed_lexical_class_strings_internal(final SubLObject lookup_mt) {
        SubLObject open_class_strings = (SubLObject)lexicon_accessors.NIL;
        SubLObject open_class_string = (SubLObject)lexicon_accessors.NIL;
        SubLObject mts = (SubLObject)lexicon_accessors.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(lexicon_accessors.$closed_lexical_class_strings$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                open_class_string = Hashtables.getEntryKey(cdohash_entry);
                mts = Hashtables.getEntryValue(cdohash_entry);
                SubLObject mt_okP = kb_utilities.kbeq(lookup_mt, lexicon_accessors.$const1$InferencePSC);
                if (lexicon_accessors.NIL == mt_okP) {
                    SubLObject csome_list_var;
                    SubLObject mt;
                    for (csome_list_var = mts, mt = (SubLObject)lexicon_accessors.NIL, mt = csome_list_var.first(); lexicon_accessors.NIL == mt_okP && lexicon_accessors.NIL != csome_list_var; mt_okP = genl_lexicon_mtP(lookup_mt, mt), csome_list_var = csome_list_var.rest(), mt = csome_list_var.first()) {}
                }
                if (lexicon_accessors.NIL != mt_okP) {
                    open_class_strings = (SubLObject)ConsesLow.cons(open_class_string, open_class_strings);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return open_class_strings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 38918L)
    public static SubLObject closed_lexical_class_strings(SubLObject lookup_mt) {
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = lexicon_accessors.$closed_lexical_class_strings_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_accessors.$sym156$CLOSED_LEXICAL_CLASS_STRINGS, (SubLObject)lexicon_accessors.$sym157$_CLOSED_LEXICAL_CLASS_STRINGS_CACHING_STATE_, (SubLObject)lexicon_accessors.$int12$32, (SubLObject)lexicon_accessors.EQL, (SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.FOUR_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, lookup_mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(closed_lexical_class_strings_internal(lookup_mt)));
            memoization_state.caching_state_put(caching_state, lookup_mt, results, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 39522L)
    public static SubLObject closed_lexical_classP(final SubLObject obj, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return subl_promotions.memberP(obj, closed_lexical_classes(mt), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 39816L)
    public static SubLObject clear_closed_lexical_classes() {
        final SubLObject cs = lexicon_accessors.$closed_lexical_classes_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 39816L)
    public static SubLObject remove_closed_lexical_classes(SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_accessors.$closed_lexical_classes_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(mt), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 39816L)
    public static SubLObject closed_lexical_classes_internal(final SubLObject mt) {
        return genls.all_specs(lexicon_accessors.$const89$ClosedClassWord, mt, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 39816L)
    public static SubLObject closed_lexical_classes(SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = lexicon_accessors.$closed_lexical_classes_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_accessors.$sym158$CLOSED_LEXICAL_CLASSES, (SubLObject)lexicon_accessors.$sym159$_CLOSED_LEXICAL_CLASSES_CACHING_STATE_, (SubLObject)lexicon_accessors.NIL, (SubLObject)lexicon_accessors.EQL, (SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.EIGHT_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(closed_lexical_classes_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 40039L)
    public static SubLObject maybe_initialize_prep_strings() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!Hashtables.hash_table_count(lexicon_accessors.$preposition_strings$.getDynamicValue(thread)).isPositive()) {
            if (lexicon_accessors.NIL != constant_handles.valid_constantP(lexicon_accessors.$const127$Preposition, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_accessors.$sym19$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(lexicon_accessors.$const20$EverythingPSC, thread);
                    SubLObject node_var = lexicon_accessors.$const127$Preposition;
                    final SubLObject deck_type = (SubLObject)lexicon_accessors.$kw46$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$99 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = (SubLObject)lexicon_accessors.NIL;
                            final SubLObject _prev_bind_0_$100 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$101 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((lexicon_accessors.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((lexicon_accessors.NIL != tv_var) ? lexicon_accessors.$sym47$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (lexicon_accessors.NIL != tv_var && lexicon_accessors.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && lexicon_accessors.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)lexicon_accessors.$kw48$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)lexicon_accessors.$kw51$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.$str52$continue_anyway, (SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)lexicon_accessors.$kw53$WARN)) {
                                        Errors.warn((SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)lexicon_accessors.$str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)lexicon_accessors.$str52$continue_anyway, (SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$101 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$102 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)lexicon_accessors.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls), thread);
                                    if (lexicon_accessors.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || lexicon_accessors.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(lexicon_accessors.$const127$Preposition, sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$102 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$103 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$106 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)lexicon_accessors.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)lexicon_accessors.UNPROVIDED);
                                            while (lexicon_accessors.NIL != node_var) {
                                                final SubLObject pos = node_var;
                                                final SubLObject pred_var = lexicon_accessors.$const90$partOfSpeech;
                                                if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pos, (SubLObject)lexicon_accessors.TWO_INTEGER, pred_var)) {
                                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pos, (SubLObject)lexicon_accessors.TWO_INTEGER, pred_var);
                                                    SubLObject done_var = (SubLObject)lexicon_accessors.NIL;
                                                    final SubLObject token_var = (SubLObject)lexicon_accessors.NIL;
                                                    while (lexicon_accessors.NIL == done_var) {
                                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                        if (lexicon_accessors.NIL != valid) {
                                                            SubLObject final_index_iterator = (SubLObject)lexicon_accessors.NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.$kw56$TRUE, (SubLObject)lexicon_accessors.NIL);
                                                                SubLObject done_var_$107 = (SubLObject)lexicon_accessors.NIL;
                                                                final SubLObject token_var_$108 = (SubLObject)lexicon_accessors.NIL;
                                                                while (lexicon_accessors.NIL == done_var_$107) {
                                                                    final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$108);
                                                                    final SubLObject valid_$109 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$108.eql(as));
                                                                    if (lexicon_accessors.NIL != valid_$109) {
                                                                        final SubLObject string = assertions_high.gaf_arg3(as);
                                                                        final SubLObject mt = assertions_high.assertion_mt(as);
                                                                        hash_table_utilities.pushnew_hash(string, mt, lexicon_accessors.$preposition_strings$.getDynamicValue(thread), (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                    }
                                                                    done_var_$107 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$109);
                                                                }
                                                            }
                                                            finally {
                                                                final SubLObject _prev_bind_0_$103 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                                                    final SubLObject _values = Values.getValuesAsVector();
                                                                    if (lexicon_accessors.NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                    Values.restoreValuesFromVector(_values);
                                                                }
                                                                finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$103, thread);
                                                                }
                                                            }
                                                        }
                                                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid);
                                                    }
                                                }
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls));
                                                SubLObject module_var = (SubLObject)lexicon_accessors.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (lexicon_accessors.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$104 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$104 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((lexicon_accessors.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(node_var);
                                                        if (lexicon_accessors.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED));
                                                            if (lexicon_accessors.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED));
                                                                if (lexicon_accessors.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); lexicon_accessors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (lexicon_accessors.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$105 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                SubLObject iteration_state_$114;
                                                                                for (iteration_state_$114 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); lexicon_accessors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$114); iteration_state_$114 = dictionary_contents.do_dictionary_contents_next(iteration_state_$114)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$114);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (lexicon_accessors.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$106 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (lexicon_accessors.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)lexicon_accessors.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); lexicon_accessors.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (lexicon_accessors.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)lexicon_accessors.NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (lexicon_accessors.NIL != csome_list_var) {
                                                                                                    if (lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)lexicon_accessors.$str57$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$106, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$114);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$105, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)lexicon_accessors.FIVE_INTEGER, (SubLObject)lexicon_accessors.$str58$attempting_to_bind_direction_link, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (lexicon_accessors.NIL != obsolete.cnat_p(node, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$116;
                                                            final SubLObject new_list = cdolist_list_var_$116 = ((lexicon_accessors.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)lexicon_accessors.NIL;
                                                            generating_fn = cdolist_list_var_$116.first();
                                                            while (lexicon_accessors.NIL != cdolist_list_var_$116) {
                                                                final SubLObject _prev_bind_0_$107 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (lexicon_accessors.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)lexicon_accessors.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); lexicon_accessors.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (lexicon_accessors.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)lexicon_accessors.NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (lexicon_accessors.NIL != csome_list_var2) {
                                                                            if (lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)lexicon_accessors.$str57$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$107, thread);
                                                                }
                                                                cdolist_list_var_$116 = cdolist_list_var_$116.rest();
                                                                generating_fn = cdolist_list_var_$116.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$104, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$104, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                                node_var = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$106, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$103, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$102, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)lexicon_accessors.TWO_INTEGER, (SubLObject)lexicon_accessors.$str59$Node__a_does_not_pass_sbhl_type_t, lexicon_accessors.$const127$Preposition, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED)), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$102, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$101, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$101, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$100, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$108 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$108, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$99, thread);
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return lexicon_accessors.$preposition_strings$.getDynamicValue(thread);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 40483L)
    public static SubLObject preposition_stringP(final SubLObject string, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_accessors.$const1$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != Types.stringp(string) : string;
        maybe_initialize_prep_strings();
        final SubLObject ok_mts = Hashtables.gethash(string, lexicon_accessors.$preposition_strings$.getDynamicValue(thread), (SubLObject)lexicon_accessors.UNPROVIDED);
        SubLObject mt_okP = kb_utilities.kbeq(mt, lexicon_accessors.$const1$InferencePSC);
        if (lexicon_accessors.NIL == mt_okP) {
            SubLObject csome_list_var;
            SubLObject ok_mt;
            for (csome_list_var = ok_mts, ok_mt = (SubLObject)lexicon_accessors.NIL, ok_mt = csome_list_var.first(); lexicon_accessors.NIL == mt_okP && lexicon_accessors.NIL != csome_list_var; mt_okP = genl_lexicon_mtP(mt, ok_mt), csome_list_var = csome_list_var.rest(), ok_mt = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL != ok_mts && lexicon_accessors.NIL != mt_okP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 41047L)
    public static SubLObject quick_lexical_wordP(final SubLObject obj, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return quick_lexical_wordP_int(obj, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 41425L)
    public static SubLObject quick_lexical_wordP_int(final SubLObject obj, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wordP = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL != forts.fort_p(obj)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                if (lexicon_accessors.NIL == wordP) {
                    SubLObject csome_list_var;
                    SubLObject pred;
                    for (csome_list_var = lexicon_accessors.$pos_forms_spec_preds$.getGlobalValue(), pred = (SubLObject)lexicon_accessors.NIL, pred = csome_list_var.first(); lexicon_accessors.NIL == wordP && lexicon_accessors.NIL != csome_list_var; wordP = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL != somewhere_cache.maybe_some_pred_assertion_somewhereP(pred, obj, (SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.UNPROVIDED) && lexicon_accessors.NIL != kb_mapping_utilities.some_pred_value(obj, pred, (SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.UNPROVIDED)), csome_list_var = csome_list_var.rest(), pred = csome_list_var.first()) {}
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        else if (!obj.isAtom()) {
            wordP = quick_word_nautP(obj);
        }
        return wordP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 41833L)
    public static SubLObject quick_word_nautP(final SubLObject obj) {
        return formula_pattern_match.formula_matches_pattern(obj, (SubLObject)lexicon_accessors.$list161);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 42066L)
    public static SubLObject lexical_wordP_internal(final SubLObject obj) {
        return isa.isa_in_any_mtP(obj, lexicon_accessors.$const162$LexicalWord);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 42066L)
    public static SubLObject lexical_wordP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL == v_memoization_state) {
            return lexical_wordP_internal(obj);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)lexicon_accessors.$sym95$LEXICAL_WORD_, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)lexicon_accessors.$sym95$LEXICAL_WORD_, (SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.$int163$1000, (SubLObject)lexicon_accessors.EQUAL, (SubLObject)lexicon_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)lexicon_accessors.$sym95$LEXICAL_WORD_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(lexical_wordP_internal(obj)));
            memoization_state.caching_state_put(caching_state, obj, results, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 42281L)
    public static SubLObject derived_wordP_internal(final SubLObject obj) {
        return isa.isa_in_any_mtP(obj, lexicon_accessors.$const165$DerivedWord);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 42281L)
    public static SubLObject derived_wordP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL == v_memoization_state) {
            return derived_wordP_internal(obj);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)lexicon_accessors.$sym164$DERIVED_WORD_, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)lexicon_accessors.$sym164$DERIVED_WORD_, (SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.NIL, (SubLObject)lexicon_accessors.EQUAL, (SubLObject)lexicon_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)lexicon_accessors.$sym164$DERIVED_WORD_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(derived_wordP_internal(obj)));
            memoization_state.caching_state_put(caching_state, obj, results, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 42527L)
    public static SubLObject initialize_vulgar_words() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        set.clear_set(lexicon_accessors.$vulgar_words$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_accessors.$sym19$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(lexicon_accessors.$const20$EverythingPSC, thread);
            if (lexicon_accessors.NIL != constant_handles.valid_constantP(lexicon_accessors.$const167$InherentlyVulgarWord, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                final SubLObject node_var = lexicon_accessors.$const167$InherentlyVulgarWord;
                final SubLObject _prev_bind_0_$119 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                final SubLObject _prev_bind_1_$120 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const77$isa), thread);
                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        SubLObject node_var_$121 = node_var;
                        final SubLObject deck_type = (SubLObject)lexicon_accessors.$kw46$STACK;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        final SubLObject _prev_bind_0_$120 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject tv_var = (SubLObject)lexicon_accessors.NIL;
                                final SubLObject _prev_bind_0_$121 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$121 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind((lexicon_accessors.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((lexicon_accessors.NIL != tv_var) ? lexicon_accessors.$sym47$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                    if (lexicon_accessors.NIL != tv_var && lexicon_accessors.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && lexicon_accessors.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql((SubLObject)lexicon_accessors.$kw48$ERROR)) {
                                            sbhl_paranoia.sbhl_error((SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)lexicon_accessors.$kw51$CERROR)) {
                                            sbhl_paranoia.sbhl_cerror((SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.$str52$continue_anyway, (SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)lexicon_accessors.$kw53$WARN)) {
                                            Errors.warn((SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P);
                                        }
                                        else {
                                            Errors.warn((SubLObject)lexicon_accessors.$str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror((SubLObject)lexicon_accessors.$str52$continue_anyway, (SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P);
                                        }
                                    }
                                    final SubLObject _prev_bind_0_$122 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$122 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const77$isa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const77$isa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const77$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)lexicon_accessors.NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const77$isa)), thread);
                                        if (lexicon_accessors.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || lexicon_accessors.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED))) {
                                            final SubLObject _prev_bind_0_$123 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$123 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$129 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const77$isa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)lexicon_accessors.NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$121, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                while (lexicon_accessors.NIL != node_var_$121) {
                                                    final SubLObject tt_node_var = node_var_$121;
                                                    SubLObject cdolist_list_var;
                                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const77$isa));
                                                    SubLObject module_var = (SubLObject)lexicon_accessors.NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (lexicon_accessors.NIL != cdolist_list_var) {
                                                        final SubLObject _prev_bind_0_$124 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$124 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((lexicon_accessors.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                            if (lexicon_accessors.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED));
                                                                if (lexicon_accessors.NIL != d_link) {
                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const77$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED));
                                                                    if (lexicon_accessors.NIL != mt_links) {
                                                                        SubLObject iteration_state;
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); lexicon_accessors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (lexicon_accessors.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                final SubLObject _prev_bind_0_$125 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    SubLObject iteration_state_$133;
                                                                                    for (iteration_state_$133 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); lexicon_accessors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$133); iteration_state_$133 = dictionary_contents.do_dictionary_contents_next(iteration_state_$133)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$133);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (lexicon_accessors.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$126 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (lexicon_accessors.NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject word;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)lexicon_accessors.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); lexicon_accessors.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        word = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if (lexicon_accessors.NIL != set_contents.do_set_contents_element_validP(state, word) && lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(word, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(word, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (lexicon_accessors.NIL != forts.fort_p(word)) {
                                                                                                                set.set_add(word, lexicon_accessors.$vulgar_words$.getGlobalValue());
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject word2 = (SubLObject)lexicon_accessors.NIL;
                                                                                                    word2 = csome_list_var.first();
                                                                                                    while (lexicon_accessors.NIL != csome_list_var) {
                                                                                                        if (lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(word2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(word2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (lexicon_accessors.NIL != forts.fort_p(word2)) {
                                                                                                                set.set_add(word2, lexicon_accessors.$vulgar_words$.getGlobalValue());
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        word2 = csome_list_var.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)lexicon_accessors.$str57$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$126, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$133);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$125, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)lexicon_accessors.FIVE_INTEGER, (SubLObject)lexicon_accessors.$str58$attempting_to_bind_direction_link, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                }
                                                                if (lexicon_accessors.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED))) {
                                                                    SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    SubLObject instance_tuple = (SubLObject)lexicon_accessors.NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while (lexicon_accessors.NIL != csome_list_var2) {
                                                                        SubLObject current;
                                                                        final SubLObject datum = current = instance_tuple;
                                                                        SubLObject link_node = (SubLObject)lexicon_accessors.NIL;
                                                                        SubLObject mt2 = (SubLObject)lexicon_accessors.NIL;
                                                                        SubLObject tv2 = (SubLObject)lexicon_accessors.NIL;
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_accessors.$list168);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_accessors.$list168);
                                                                        mt2 = current.first();
                                                                        current = current.rest();
                                                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_accessors.$list168);
                                                                        tv2 = current.first();
                                                                        current = current.rest();
                                                                        if (lexicon_accessors.NIL == current) {
                                                                            if (lexicon_accessors.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                final SubLObject _prev_bind_0_$127 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                    if (lexicon_accessors.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$128 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol;
                                                                                            final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                            if (lexicon_accessors.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject word;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)lexicon_accessors.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); lexicon_accessors.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    word = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (lexicon_accessors.NIL != set_contents.do_set_contents_element_validP(state, word) && lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(word, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(word, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (lexicon_accessors.NIL != forts.fort_p(word)) {
                                                                                                            set.set_add(word, lexicon_accessors.$vulgar_words$.getGlobalValue());
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$137 = sol;
                                                                                                SubLObject word2 = (SubLObject)lexicon_accessors.NIL;
                                                                                                word2 = csome_list_var_$137.first();
                                                                                                while (lexicon_accessors.NIL != csome_list_var_$137) {
                                                                                                    if (lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(word2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(word2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (lexicon_accessors.NIL != forts.fort_p(word2)) {
                                                                                                            set.set_add(word2, lexicon_accessors.$vulgar_words$.getGlobalValue());
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$137 = csome_list_var_$137.rest();
                                                                                                    word2 = csome_list_var_$137.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)lexicon_accessors.$str57$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$128, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$127, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)lexicon_accessors.$list168);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    }
                                                                }
                                                            }
                                                            else if (lexicon_accessors.NIL != obsolete.cnat_p(node, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$138;
                                                                final SubLObject new_list = cdolist_list_var_$138 = ((lexicon_accessors.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const77$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const77$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED)));
                                                                SubLObject generating_fn = (SubLObject)lexicon_accessors.NIL;
                                                                generating_fn = cdolist_list_var_$138.first();
                                                                while (lexicon_accessors.NIL != cdolist_list_var_$138) {
                                                                    final SubLObject _prev_bind_0_$129 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                        if (lexicon_accessors.NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject word3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)lexicon_accessors.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); lexicon_accessors.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                word3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if (lexicon_accessors.NIL != set_contents.do_set_contents_element_validP(state2, word3) && lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(word3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(word3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (lexicon_accessors.NIL != forts.fort_p(word3)) {
                                                                                        set.set_add(word3, lexicon_accessors.$vulgar_words$.getGlobalValue());
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol2.isList()) {
                                                                            SubLObject csome_list_var3 = sol2;
                                                                            SubLObject word4 = (SubLObject)lexicon_accessors.NIL;
                                                                            word4 = csome_list_var3.first();
                                                                            while (lexicon_accessors.NIL != csome_list_var3) {
                                                                                if (lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(word4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(word4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (lexicon_accessors.NIL != forts.fort_p(word4)) {
                                                                                        set.set_add(word4, lexicon_accessors.$vulgar_words$.getGlobalValue());
                                                                                    }
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                word4 = csome_list_var3.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)lexicon_accessors.$str57$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$129, thread);
                                                                    }
                                                                    cdolist_list_var_$138 = cdolist_list_var_$138.rest();
                                                                    generating_fn = cdolist_list_var_$138.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$124, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$124, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    }
                                                    SubLObject cdolist_list_var2;
                                                    final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const77$isa)));
                                                    SubLObject module_var2 = (SubLObject)lexicon_accessors.NIL;
                                                    module_var2 = cdolist_list_var2.first();
                                                    while (lexicon_accessors.NIL != cdolist_list_var2) {
                                                        final SubLObject _prev_bind_0_$130 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$125 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((lexicon_accessors.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            final SubLObject node2 = function_terms.naut_to_nart(node_var_$121);
                                                            if (lexicon_accessors.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED));
                                                                if (lexicon_accessors.NIL != d_link2) {
                                                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED));
                                                                    if (lexicon_accessors.NIL != mt_links2) {
                                                                        SubLObject iteration_state2;
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); lexicon_accessors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (lexicon_accessors.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                final SubLObject _prev_bind_0_$131 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                    SubLObject iteration_state_$134;
                                                                                    for (iteration_state_$134 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); lexicon_accessors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$134); iteration_state_$134 = dictionary_contents.do_dictionary_contents_next(iteration_state_$134)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$134);
                                                                                        final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (lexicon_accessors.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            final SubLObject _prev_bind_0_$132 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                final SubLObject sol3 = link_nodes4;
                                                                                                if (lexicon_accessors.NIL != set.set_p(sol3)) {
                                                                                                    final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                    SubLObject basis_object3;
                                                                                                    SubLObject state3;
                                                                                                    SubLObject node_vars_link_node;
                                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)lexicon_accessors.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); lexicon_accessors.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                        if (lexicon_accessors.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol3.isList()) {
                                                                                                    SubLObject csome_list_var4 = sol3;
                                                                                                    SubLObject node_vars_link_node2 = (SubLObject)lexicon_accessors.NIL;
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                    while (lexicon_accessors.NIL != csome_list_var4) {
                                                                                                        if (lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var4 = csome_list_var4.rest();
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)lexicon_accessors.$str57$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$132, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$134);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$131, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)lexicon_accessors.FIVE_INTEGER, (SubLObject)lexicon_accessors.$str58$attempting_to_bind_direction_link, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                }
                                                            }
                                                            else if (lexicon_accessors.NIL != obsolete.cnat_p(node2, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$139;
                                                                final SubLObject new_list2 = cdolist_list_var_$139 = ((lexicon_accessors.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED)));
                                                                SubLObject generating_fn2 = (SubLObject)lexicon_accessors.NIL;
                                                                generating_fn2 = cdolist_list_var_$139.first();
                                                                while (lexicon_accessors.NIL != cdolist_list_var_$139) {
                                                                    final SubLObject _prev_bind_0_$133 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                        final SubLObject sol4;
                                                                        final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                        if (lexicon_accessors.NIL != set.set_p(sol4)) {
                                                                            final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                            SubLObject basis_object4;
                                                                            SubLObject state4;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)lexicon_accessors.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); lexicon_accessors.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                if (lexicon_accessors.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol4.isList()) {
                                                                            SubLObject csome_list_var5 = sol4;
                                                                            SubLObject node_vars_link_node4 = (SubLObject)lexicon_accessors.NIL;
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                            while (lexicon_accessors.NIL != csome_list_var5) {
                                                                                if (lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var5 = csome_list_var5.rest();
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)lexicon_accessors.$str57$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$133, thread);
                                                                    }
                                                                    cdolist_list_var_$139 = cdolist_list_var_$139.rest();
                                                                    generating_fn2 = cdolist_list_var_$139.first();
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$125, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$130, thread);
                                                        }
                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                        module_var2 = cdolist_list_var2.first();
                                                    }
                                                    node_var_$121 = deck.deck_pop(recur_deck);
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$129, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$123, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$123, thread);
                                            }
                                        }
                                        else {
                                            sbhl_paranoia.sbhl_warn((SubLObject)lexicon_accessors.TWO_INTEGER, (SubLObject)lexicon_accessors.$str59$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED)), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$122, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$122, thread);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$121, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$121, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$134 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$134, thread);
                                }
                            }
                        }
                        finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$120, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$135 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$135, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$120, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$119, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)lexicon_accessors.$kw6$INITIALIZED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 42783L)
    public static SubLObject vulgar_wordP(final SubLObject obj) {
        if (lexicon_accessors.NIL != set.set_emptyP(lexicon_accessors.$vulgar_words$.getGlobalValue())) {
            initialize_vulgar_words();
        }
        return set.set_memberP(obj, lexicon_accessors.$vulgar_words$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 43066L)
    public static SubLObject pos_of_stringXword(final SubLObject string, final SubLObject word, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == lexicon_accessors.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != Types.stringp(string) : string;
        assert lexicon_accessors.NIL != lexical_wordP(word) : word;
        assert lexicon_accessors.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : parse_morphologically;
        SubLObject result = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$149 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (lexicon_accessors.NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                        result = nl_trie_accessors.nl_trie_pos_of_stringXword(string, word, misspellingsP, lookup_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
                    }
                    if (lexicon_accessors.NIL != proceed_with_morphological_parsingP(result, parse_morphologically)) {
                        result = Sequences.delete_duplicates(ConsesLow.append(result, morphological_word_parser.pos_of_complex_word_stringXword(string, word)), Symbols.symbol_function((SubLObject)lexicon_accessors.EQL), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$150 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$150, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$149, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 44152L)
    public static SubLObject clear_nl_caches() {
        clear_cached_lexical_access_functions();
        pph_main.clear_paraphrase_caches((SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
        clear_nl_parsing_caches();
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 44359L)
    public static SubLObject clear_nl_parsing_caches() {
        psp_main.clear_psp_caches();
        clear_cached_lexical_access_functions();
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 44545L)
    public static SubLObject clear_cached_lexical_access_functions() {
        lexicon_vars.clear_cached_lexical_vars();
        clear_agr_of_det_string();
        lexicon_utilities.clear_preds_licensed_by_pos_cached();
        clear_genl_pos_pred_from_mt_infoP();
        clear_pos_of_pred();
        lexicon_utilities.clear_preds_of_pos_cached();
        clear_closed_lexical_classes();
        rkf_string_weeders.clear_all_rkf_stringP_caches();
        clear_verb_only_stringP();
        lexicon_utilities.clear_bar_level_cached();
        lexicon_utilities.clear_pos_of_cat_cached();
        clear_genl_posP();
        clear_preds_of_stringXword_cached();
        nl_trie.clear_nl_trie_caches();
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 45182L)
    public static SubLObject pos_of_word(final SubLObject word_unit, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != lexical_wordP(word_unit) : word_unit;
        SubLObject result = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$151 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (lexicon_accessors.NIL != forts.fort_p(word_unit)) {
                        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                        final SubLObject _prev_bind_0_$152 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            SubLObject cdolist_list_var = lexicon_accessors.$pos_forms_spec_preds$.getGlobalValue();
                            SubLObject pred = (SubLObject)lexicon_accessors.NIL;
                            pred = cdolist_list_var.first();
                            while (lexicon_accessors.NIL != cdolist_list_var) {
                                if (lexicon_accessors.NIL != kb_indexing_datastructures.indexed_term_p(pred)) {
                                    result = ConsesLow.append(result, kb_mapping_utilities.pred_values(word_unit, pred, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED));
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                pred = cdolist_list_var.first();
                            }
                        }
                        finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$152, thread);
                        }
                    }
                    else if (lexicon_accessors.NIL != narts_high.naut_p(word_unit)) {
                        final SubLObject affix = lexicon_utilities.derived_word_affix(word_unit, (SubLObject)lexicon_accessors.UNPROVIDED);
                        result = mwp_rule.mwp_result_poses_for_reified_affix(affix, (SubLObject)lexicon_accessors.UNPROVIDED);
                    }
                    else {
                        Errors.warn((SubLObject)lexicon_accessors.$str169$The_word_unit__S_is_neither_a_FOR, word_unit);
                        result = (SubLObject)lexicon_accessors.NIL;
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$153 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$153, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$151, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 45941L)
    public static SubLObject word_has_posP(final SubLObject word_unit, final SubLObject pos, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != lexical_wordP(word_unit) : word_unit;
        assert lexicon_accessors.NIL != speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED) : pos;
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (lexicon_accessors.NIL == ans) {
                SubLObject csome_list_var;
                SubLObject word_pos;
                for (csome_list_var = pos_of_word(word_unit, mt), word_pos = (SubLObject)lexicon_accessors.NIL, word_pos = csome_list_var.first(); lexicon_accessors.NIL == ans && lexicon_accessors.NIL != csome_list_var; ans = ((lexicon_accessors.NIL != mt) ? genl_posP(word_pos, pos, mt) : genl_posP(word_pos, pos, mt_relevance_macros.$mt$.getDynamicValue(thread))), csome_list_var = csome_list_var.rest(), word_pos = csome_list_var.first()) {}
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 46419L)
    public static SubLObject clear_verb_only_stringP() {
        final SubLObject cs = lexicon_accessors.$verb_only_stringP_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 46419L)
    public static SubLObject remove_verb_only_stringP(final SubLObject string) {
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_accessors.$verb_only_stringP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(string), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 46419L)
    public static SubLObject verb_only_stringP_internal(final SubLObject string) {
        final SubLObject poses = pos_of_string(string, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (lexicon_accessors.NIL == poses) {
            return (SubLObject)lexicon_accessors.NIL;
        }
        SubLObject cdolist_list_var = poses;
        SubLObject pos = (SubLObject)lexicon_accessors.NIL;
        pos = cdolist_list_var.first();
        while (lexicon_accessors.NIL != cdolist_list_var) {
            if (lexicon_accessors.NIL == genl_posP(pos, lexicon_accessors.$const142$Verb, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                return (SubLObject)lexicon_accessors.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        }
        return (SubLObject)lexicon_accessors.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 46419L)
    public static SubLObject verb_only_stringP(final SubLObject string) {
        SubLObject caching_state = lexicon_accessors.$verb_only_stringP_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_accessors.$sym170$VERB_ONLY_STRING_, (SubLObject)lexicon_accessors.$sym171$_VERB_ONLY_STRING__CACHING_STATE_, (SubLObject)lexicon_accessors.$int25$512, (SubLObject)lexicon_accessors.EQUAL, (SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.$int40$256);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(verb_only_stringP_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 46721L)
    public static SubLObject typed_denots_of_string(final SubLObject string, final SubLObject type, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject skip_namestringsP, SubLObject lookup_mt, SubLObject semantic_mt, SubLObject parse_morphologically, SubLObject excluded_predicates) {
        if (abbrev_types == lexicon_accessors.UNPROVIDED) {
            abbrev_types = (SubLObject)lexicon_accessors.NIL;
        }
        if (denot_type == lexicon_accessors.UNPROVIDED) {
            denot_type = (SubLObject)lexicon_accessors.$kw172$DENOT;
        }
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = (SubLObject)lexicon_accessors.T;
        }
        if (skip_namestringsP == lexicon_accessors.UNPROVIDED) {
            skip_namestringsP = (SubLObject)lexicon_accessors.NIL;
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (semantic_mt == lexicon_accessors.UNPROVIDED) {
            semantic_mt = lexicon_accessors.$const1$InferencePSC;
        }
        if (parse_morphologically == lexicon_accessors.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        if (excluded_predicates == lexicon_accessors.UNPROVIDED) {
            excluded_predicates = lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(string, lexicon_accessors.$sym87$STRINGP);
        enforceType(type, lexicon_accessors.$sym173$EL_FORT_P);
        enforceType(abbrev_types, lexicon_accessors.$sym174$LISTP);
        enforceType(denot_type, lexicon_accessors.$sym103$KEYWORDP);
        enforceType(misspellingsP, lexicon_accessors.$sym175$BOOLEANP);
        enforceType(skip_namestringsP, lexicon_accessors.$sym175$BOOLEANP);
        enforceType(lookup_mt, lexicon_accessors.$sym176$HLMT_);
        enforceType(semantic_mt, lexicon_accessors.$sym176$HLMT_);
        enforceType(parse_morphologically, lexicon_accessors.$sym96$PARSE_MORPHOLOGICALLY_OPTION_P);
        enforceType(excluded_predicates, lexicon_accessors.$sym177$SET_P);
        SubLObject result = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$154 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    thread.resetMultipleValues();
                    final SubLObject denots = denots_of_string(string, abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, parse_morphologically, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                    final SubLObject pred_lists = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject denot = (SubLObject)lexicon_accessors.NIL;
                    SubLObject denot_$155 = (SubLObject)lexicon_accessors.NIL;
                    SubLObject preds = (SubLObject)lexicon_accessors.NIL;
                    SubLObject preds_$156 = (SubLObject)lexicon_accessors.NIL;
                    denot = denots;
                    denot_$155 = denot.first();
                    preds = pred_lists;
                    preds_$156 = preds.first();
                    while (lexicon_accessors.NIL != preds || lexicon_accessors.NIL != denot) {
                        if (lexicon_accessors.NIL != typed_denots_of_string_preds_okP(preds_$156, excluded_predicates)) {
                            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(semantic_mt);
                            final SubLObject _prev_bind_0_$155 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                if (lexicon_accessors.NIL != denot_has_typeP(denot_$155, type, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                    final SubLObject item_var = denot_$155;
                                    if (lexicon_accessors.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)lexicon_accessors.EQUAL), Symbols.symbol_function((SubLObject)lexicon_accessors.IDENTITY))) {
                                        result = (SubLObject)ConsesLow.cons(item_var, result);
                                    }
                                }
                            }
                            finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$155, thread);
                            }
                        }
                        denot = denot.rest();
                        denot_$155 = denot.first();
                        preds = preds.rest();
                        preds_$156 = preds.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$156 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$156, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$154, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 48301L)
    public static SubLObject typed_denots_of_string_preds_okP(final SubLObject preds, final SubLObject excluded_predicates) {
        SubLObject okP = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL == okP) {
            SubLObject csome_list_var = preds;
            SubLObject pred = (SubLObject)lexicon_accessors.NIL;
            pred = csome_list_var.first();
            while (lexicon_accessors.NIL == okP && lexicon_accessors.NIL != csome_list_var) {
                if (lexicon_accessors.NIL == set.set_memberP(pred, excluded_predicates)) {
                    okP = (SubLObject)lexicon_accessors.T;
                }
                csome_list_var = csome_list_var.rest();
                pred = csome_list_var.first();
            }
        }
        return okP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 48514L)
    public static SubLObject denot_has_typeP_internal(final SubLObject denot, final SubLObject type, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (lexicon_accessors.NIL != at_defns.quick_quiet_has_typeP(denot, type, mt)) {
                ans = (SubLObject)lexicon_accessors.T;
            }
            else if (lexicon_accessors.NIL != forts.fort_p(denot) && lexicon_accessors.NIL != isa.instantiationP(denot, type, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                ans = (SubLObject)lexicon_accessors.T;
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 48514L)
    public static SubLObject denot_has_typeP(final SubLObject denot, final SubLObject type, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL == v_memoization_state) {
            return denot_has_typeP_internal(denot, type, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)lexicon_accessors.$sym183$DENOT_HAS_TYPE_, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)lexicon_accessors.$sym183$DENOT_HAS_TYPE_, (SubLObject)lexicon_accessors.THREE_INTEGER, (SubLObject)lexicon_accessors.NIL, (SubLObject)lexicon_accessors.EQUAL, (SubLObject)lexicon_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)lexicon_accessors.$sym183$DENOT_HAS_TYPE_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(denot, type, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)lexicon_accessors.NIL;
            collision = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (denot.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (type.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (lexicon_accessors.NIL != cached_args && lexicon_accessors.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(denot_has_typeP_internal(denot, type, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(denot, type, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 49067L)
    public static SubLObject denot_might_have_typeP_internal(final SubLObject denot, final SubLObject type) {
        if (lexicon_accessors.NIL != denot_has_typeP(denot, type, (SubLObject)lexicon_accessors.UNPROVIDED)) {
            return (SubLObject)lexicon_accessors.T;
        }
        SubLObject badP = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL == badP) {
            SubLObject csome_list_var;
            SubLObject v_isa;
            for (csome_list_var = isa.isa(denot, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED), v_isa = (SubLObject)lexicon_accessors.NIL, v_isa = csome_list_var.first(); lexicon_accessors.NIL == badP && lexicon_accessors.NIL != csome_list_var; badP = disjoint_with.disjoint_withP(v_isa, type, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED), csome_list_var = csome_list_var.rest(), v_isa = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == badP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 49067L)
    public static SubLObject denot_might_have_typeP(final SubLObject denot, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL == v_memoization_state) {
            return denot_might_have_typeP_internal(denot, type);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)lexicon_accessors.$sym184$DENOT_MIGHT_HAVE_TYPE_, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)lexicon_accessors.$sym184$DENOT_MIGHT_HAVE_TYPE_, (SubLObject)lexicon_accessors.TWO_INTEGER, (SubLObject)lexicon_accessors.NIL, (SubLObject)lexicon_accessors.EQUAL, (SubLObject)lexicon_accessors.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)lexicon_accessors.$sym184$DENOT_MIGHT_HAVE_TYPE_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(denot, type);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)lexicon_accessors.NIL;
            collision = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (denot.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (lexicon_accessors.NIL != cached_args && lexicon_accessors.NIL == cached_args.rest() && type.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(denot_might_have_typeP_internal(denot, type)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(denot, type));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 49411L)
    public static SubLObject multi_typed_denots_of_string(final SubLObject string, final SubLObject pos_types, final SubLObject neg_types, SubLObject include_genlP, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject skip_namestringsP, SubLObject lookup_mt, SubLObject semantic_mt, SubLObject excluded_predicates) {
        if (include_genlP == lexicon_accessors.UNPROVIDED) {
            include_genlP = (SubLObject)lexicon_accessors.NIL;
        }
        if (abbrev_types == lexicon_accessors.UNPROVIDED) {
            abbrev_types = (SubLObject)lexicon_accessors.NIL;
        }
        if (denot_type == lexicon_accessors.UNPROVIDED) {
            denot_type = (SubLObject)lexicon_accessors.$kw172$DENOT;
        }
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = (SubLObject)lexicon_accessors.T;
        }
        if (skip_namestringsP == lexicon_accessors.UNPROVIDED) {
            skip_namestringsP = (SubLObject)lexicon_accessors.NIL;
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (semantic_mt == lexicon_accessors.UNPROVIDED) {
            semantic_mt = lexicon_accessors.$const1$InferencePSC;
        }
        if (excluded_predicates == lexicon_accessors.UNPROVIDED) {
            excluded_predicates = lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$159 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    thread.resetMultipleValues();
                    final SubLObject denots = denots_of_string(string, abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                    final SubLObject pred_lists = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject denot = (SubLObject)lexicon_accessors.NIL;
                    SubLObject denot_$160 = (SubLObject)lexicon_accessors.NIL;
                    SubLObject preds = (SubLObject)lexicon_accessors.NIL;
                    SubLObject preds_$161 = (SubLObject)lexicon_accessors.NIL;
                    denot = denots;
                    denot_$160 = denot.first();
                    preds = pred_lists;
                    preds_$161 = preds.first();
                    while (lexicon_accessors.NIL != preds || lexicon_accessors.NIL != denot) {
                        if (lexicon_accessors.NIL != typed_denots_of_string_preds_okP(preds_$161, excluded_predicates)) {
                            final SubLObject fn = (lexicon_accessors.NIL != include_genlP) ? Symbols.symbol_function((SubLObject)lexicon_accessors.$sym185$MORE_SPECIFIC_P) : Symbols.symbol_function((SubLObject)lexicon_accessors.$sym183$DENOT_HAS_TYPE_);
                            SubLObject fail_pos = (SubLObject)lexicon_accessors.NIL;
                            SubLObject fail_neg = (SubLObject)lexicon_accessors.NIL;
                            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(semantic_mt);
                            final SubLObject _prev_bind_0_$160 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                if (lexicon_accessors.NIL == fail_pos) {
                                    SubLObject csome_list_var = pos_types;
                                    SubLObject pos_type = (SubLObject)lexicon_accessors.NIL;
                                    pos_type = csome_list_var.first();
                                    while (lexicon_accessors.NIL == fail_pos && lexicon_accessors.NIL != csome_list_var) {
                                        if (lexicon_accessors.NIL == Functions.funcall(fn, denot_$160, pos_type)) {
                                            fail_pos = (SubLObject)lexicon_accessors.T;
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        pos_type = csome_list_var.first();
                                    }
                                }
                                if (lexicon_accessors.NIL == fail_pos && lexicon_accessors.NIL == fail_neg) {
                                    SubLObject csome_list_var = neg_types;
                                    SubLObject neg_type = (SubLObject)lexicon_accessors.NIL;
                                    neg_type = csome_list_var.first();
                                    while (lexicon_accessors.NIL == fail_neg && lexicon_accessors.NIL != csome_list_var) {
                                        if (lexicon_accessors.NIL != Functions.funcall(fn, denot_$160, neg_type)) {
                                            fail_neg = (SubLObject)lexicon_accessors.T;
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        neg_type = csome_list_var.first();
                                    }
                                }
                            }
                            finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$160, thread);
                            }
                            if (lexicon_accessors.NIL == fail_pos && lexicon_accessors.NIL == fail_neg) {
                                result = (SubLObject)ConsesLow.cons(denot_$160, result);
                            }
                        }
                        denot = denot.rest();
                        denot_$160 = denot.first();
                        preds = preds.rest();
                        preds_$161 = preds.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$161 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$161, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$159, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 51454L)
    public static SubLObject typed_denots_of_string_at_place(final SubLObject string, final SubLObject type, final SubLObject place, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject skip_namestringsP, SubLObject lookup_mt, SubLObject semantic_mt) {
        if (abbrev_types == lexicon_accessors.UNPROVIDED) {
            abbrev_types = (SubLObject)lexicon_accessors.NIL;
        }
        if (denot_type == lexicon_accessors.UNPROVIDED) {
            denot_type = (SubLObject)lexicon_accessors.$kw172$DENOT;
        }
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = (SubLObject)lexicon_accessors.T;
        }
        if (skip_namestringsP == lexicon_accessors.UNPROVIDED) {
            skip_namestringsP = (SubLObject)lexicon_accessors.NIL;
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (semantic_mt == lexicon_accessors.UNPROVIDED) {
            semantic_mt = lexicon_accessors.$const1$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$164 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    SubLObject cdolist_list_var;
                    final SubLObject typed_denots = cdolist_list_var = typed_denots_of_string(string, type, abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, semantic_mt, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                    SubLObject denot = (SubLObject)lexicon_accessors.NIL;
                    denot = cdolist_list_var.first();
                    while (lexicon_accessors.NIL != cdolist_list_var) {
                        if (lexicon_accessors.NIL != in_region_p(denot, place, semantic_mt)) {
                            result = (SubLObject)ConsesLow.cons(denot, result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        denot = cdolist_list_var.first();
                    }
                    if (lexicon_accessors.NIL == result && type.equal(lexicon_accessors.$const186$City) && lexicon_accessors.NIL != genls.genlsP(type, lexicon_accessors.$const187$GeopoliticalEntity, semantic_mt, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(lexicon_accessors.$const188$CityNamedFn, string, place), result);
                    }
                    if (lexicon_accessors.NIL == result) {
                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(lexicon_accessors.$const189$InstanceNamedFn, string, (SubLObject)ConsesLow.list(lexicon_accessors.$const190$SubcollectionOfWithRelationToFn, type, lexicon_accessors.$const191$inRegion, place)), result);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$165 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$165, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$164, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 52504L)
    public static SubLObject in_region_p(final SubLObject place, final SubLObject region, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)lexicon_accessors.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            final SubLObject is_place_a_gpeP = isa.isaP(place, lexicon_accessors.$const187$GeopoliticalEntity, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
            final SubLObject is_region_a_gpeP = isa.isaP(region, lexicon_accessors.$const187$GeopoliticalEntity, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
            final SubLObject is_place_a_geo_regionP = isa.isaP(place, lexicon_accessors.$const192$GeographicalRegion, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
            final SubLObject is_region_a_geo_regionP = isa.isaP(region, lexicon_accessors.$const192$GeographicalRegion, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
            if (lexicon_accessors.NIL != is_region_a_gpeP && lexicon_accessors.NIL != is_place_a_gpeP && lexicon_accessors.NIL != geopolitical_subdivisionP(region, place, mt)) {
                result = (SubLObject)lexicon_accessors.T;
            }
            else if (lexicon_accessors.NIL != is_place_a_geo_regionP && lexicon_accessors.NIL != is_region_a_geo_regionP && lexicon_accessors.NIL != geographical_subregionP(region, place, mt)) {
                result = (SubLObject)lexicon_accessors.T;
            }
            else {
                if (lexicon_accessors.NIL != is_region_a_gpeP && lexicon_accessors.NIL != is_place_a_geo_regionP) {
                    if (lexicon_accessors.NIL == result) {
                        SubLObject csome_list_var;
                        SubLObject region_territory;
                        for (csome_list_var = territories_for_gpe(region), region_territory = (SubLObject)lexicon_accessors.NIL, region_territory = csome_list_var.first(); lexicon_accessors.NIL == result && lexicon_accessors.NIL != csome_list_var; result = geographical_subregionP(region_territory, place, mt), csome_list_var = csome_list_var.rest(), region_territory = csome_list_var.first()) {}
                    }
                    if (lexicon_accessors.NIL == result && lexicon_accessors.NIL == result) {
                        SubLObject csome_list_var;
                        SubLObject place_gpe;
                        for (csome_list_var = gpe_for_territory(place), place_gpe = (SubLObject)lexicon_accessors.NIL, place_gpe = csome_list_var.first(); lexicon_accessors.NIL == result && lexicon_accessors.NIL != csome_list_var; result = geopolitical_subdivisionP(region, place_gpe, mt), csome_list_var = csome_list_var.rest(), place_gpe = csome_list_var.first()) {}
                    }
                }
                if (lexicon_accessors.NIL != is_region_a_geo_regionP && lexicon_accessors.NIL != is_place_a_gpeP && lexicon_accessors.NIL == result) {
                    if (lexicon_accessors.NIL == result) {
                        SubLObject csome_list_var;
                        SubLObject region_territory;
                        for (csome_list_var = gpe_for_territory(region), region_territory = (SubLObject)lexicon_accessors.NIL, region_territory = csome_list_var.first(); lexicon_accessors.NIL == result && lexicon_accessors.NIL != csome_list_var; result = geographical_subregionP(region_territory, place, mt), csome_list_var = csome_list_var.rest(), region_territory = csome_list_var.first()) {}
                    }
                    if (lexicon_accessors.NIL == result && lexicon_accessors.NIL == result) {
                        SubLObject csome_list_var;
                        SubLObject region_gpe;
                        for (csome_list_var = gpe_for_territory(region), region_gpe = (SubLObject)lexicon_accessors.NIL, region_gpe = csome_list_var.first(); lexicon_accessors.NIL == result && lexicon_accessors.NIL != csome_list_var; result = geopolitical_subdivisionP(region_gpe, place, mt), csome_list_var = csome_list_var.rest(), region_gpe = csome_list_var.first()) {}
                    }
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 53870L)
    public static SubLObject geopolitical_subdivisionP(final SubLObject big_place, final SubLObject small_place, final SubLObject mt) {
        return cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(lexicon_accessors.$const193$geopoliticalSubdivision, big_place, small_place), mt, (SubLObject)lexicon_accessors.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 54054L)
    public static SubLObject geographical_subregionP(final SubLObject big_place, final SubLObject small_place, final SubLObject mt) {
        return cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(lexicon_accessors.$const194$geographicalSubRegions, big_place, small_place), mt, (SubLObject)lexicon_accessors.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 54234L)
    public static SubLObject territories_for_gpe(final SubLObject region) {
        return kb_mapping_utilities.pred_values(region, lexicon_accessors.$const195$territoryOf, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 54324L)
    public static SubLObject gpe_for_territory(final SubLObject territory) {
        return kb_mapping_utilities.pred_values(narts_high.nart_substitute(territory), lexicon_accessors.$const195$territoryOf, (SubLObject)lexicon_accessors.TWO_INTEGER, (SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 54440L)
    public static SubLObject denots_of_partial_string(SubLObject string, SubLObject lookup_mt, SubLObject permissiveP, SubLObject test) {
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (permissiveP == lexicon_accessors.UNPROVIDED) {
            permissiveP = (SubLObject)lexicon_accessors.T;
        }
        if (test == lexicon_accessors.UNPROVIDED) {
            test = (SubLObject)lexicon_accessors.EQUALP;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (lexicon_accessors.NIL != permissiveP && !string_utilities.string_last_n((SubLObject)lexicon_accessors.ONE_INTEGER, string).equal((SubLObject)lexicon_accessors.$str196$_)) {
            string = Sequences.cconcatenate(string, (SubLObject)lexicon_accessors.$str196$_);
        }
        SubLObject result = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$166 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject cleaned_string = Strings.string_left_trim((SubLObject)lexicon_accessors.$list197, string);
                    SubLObject tokenized_string = string_utilities.string_tokenize(cleaned_string, (SubLObject)lexicon_accessors.$list198, (SubLObject)lexicon_accessors.NIL, (SubLObject)lexicon_accessors.T, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                    final SubLObject initial_matches = nl_trie_accessors.nl_trie_matching_phrases(tokenized_string.first(), (SubLObject)lexicon_accessors.$kw199$INFIX);
                    final SubLObject first_token = tokenized_string.first();
                    final SubLObject first_token_length = Sequences.length(tokenized_string.first());
                    SubLObject token_count = (SubLObject)lexicon_accessors.NIL;
                    tokenized_string = tokenized_string.rest();
                    if (list_utilities.last_one(tokenized_string).equal((SubLObject)lexicon_accessors.$str200$)) {
                        tokenized_string = conses_high.butlast(tokenized_string, (SubLObject)lexicon_accessors.UNPROVIDED);
                    }
                    token_count = Sequences.length(tokenized_string);
                    SubLObject cdolist_list_var = initial_matches;
                    SubLObject item = (SubLObject)lexicon_accessors.NIL;
                    item = cdolist_list_var.first();
                    while (lexicon_accessors.NIL != cdolist_list_var) {
                        final SubLObject phrase = nl_trie_accessors.nl_trie_index_item_phrase(item);
                        final SubLObject v_term = nl_trie_accessors.nl_trie_index_item_term(item);
                        final SubLObject first_token_location = Sequences.search(first_token, phrase, test, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                        SubLObject current_token_number = (SubLObject)lexicon_accessors.ZERO_INTEGER;
                        SubLObject string_offset = (SubLObject)lexicon_accessors.NIL;
                        SubLObject next_token = (SubLObject)lexicon_accessors.NIL;
                        SubLObject fail = (SubLObject)lexicon_accessors.NIL;
                        if (lexicon_accessors.NIL != first_token_location) {
                            string_offset = Numbers.add(first_token_location, first_token_length);
                        }
                        else {
                            fail = (SubLObject)lexicon_accessors.T;
                        }
                        while (current_token_number.numL(token_count) && lexicon_accessors.NIL == fail) {
                            next_token = ConsesLow.nth(current_token_number, tokenized_string);
                            if (next_token.equal((SubLObject)lexicon_accessors.$str200$)) {
                                current_token_number = Numbers.add(current_token_number, (SubLObject)lexicon_accessors.ONE_INTEGER);
                            }
                            else if (lexicon_accessors.NIL != next_token && !next_token.equal((SubLObject)lexicon_accessors.$str196$_)) {
                                final SubLObject location = Sequences.search(next_token, phrase, test, (SubLObject)lexicon_accessors.IDENTITY, (SubLObject)lexicon_accessors.ZERO_INTEGER, (SubLObject)lexicon_accessors.NIL, string_offset, (SubLObject)lexicon_accessors.UNPROVIDED);
                                if (lexicon_accessors.NIL == location) {
                                    continue;
                                }
                                string_offset = Numbers.add(location, Sequences.length(next_token));
                                current_token_number = Numbers.add(current_token_number, (SubLObject)lexicon_accessors.ONE_INTEGER);
                            }
                            else if (next_token.equal((SubLObject)lexicon_accessors.$str196$_)) {
                                current_token_number = Numbers.add(current_token_number, (SubLObject)lexicon_accessors.ONE_INTEGER);
                                next_token = ConsesLow.nth(current_token_number, tokenized_string);
                                if (lexicon_accessors.NIL == next_token) {
                                    result = (SubLObject)ConsesLow.cons(v_term, result);
                                }
                                else {
                                    final SubLObject location = Sequences.search(next_token, phrase, test, (SubLObject)lexicon_accessors.IDENTITY, (SubLObject)lexicon_accessors.ZERO_INTEGER, (SubLObject)lexicon_accessors.NIL, string_offset, (SubLObject)lexicon_accessors.UNPROVIDED);
                                    if (lexicon_accessors.NIL != location) {
                                        string_offset = Numbers.add(location, Sequences.length(next_token));
                                        current_token_number = Numbers.add(current_token_number, (SubLObject)lexicon_accessors.ONE_INTEGER);
                                    }
                                    else {
                                        fail = (SubLObject)lexicon_accessors.T;
                                    }
                                }
                            }
                            else {
                                if (string_offset.eql(Sequences.length(phrase))) {
                                    continue;
                                }
                                fail = (SubLObject)lexicon_accessors.T;
                                Errors.warn((SubLObject)lexicon_accessors.$str201$I_should_never_be_called___);
                            }
                        }
                        if (token_count.eql(current_token_number) && string_offset.eql(Sequences.length(phrase))) {
                            result = (SubLObject)ConsesLow.cons(v_term, result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$167 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$167, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$166, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Sequences.delete_duplicates(result, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 57354L)
    public static SubLObject denotation_mapper(final SubLObject string, SubLObject excluded_preds, SubLObject mode, SubLObject parse_morphologically) {
        if (excluded_preds == lexicon_accessors.UNPROVIDED) {
            excluded_preds = (SubLObject)lexicon_accessors.NIL;
        }
        if (mode == lexicon_accessors.UNPROVIDED) {
            mode = (SubLObject)lexicon_accessors.$kw202$GREEDY;
        }
        if (parse_morphologically == lexicon_accessors.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(string, lexicon_accessors.$sym87$STRINGP);
        enforceType(excluded_preds, lexicon_accessors.$sym203$LIST_OF_PREDICATES_P);
        enforceType(mode, lexicon_accessors.$sym103$KEYWORDP);
        enforceType(parse_morphologically, lexicon_accessors.$sym96$PARSE_MORPHOLOGICALLY_OPTION_P);
        SubLObject result = (SubLObject)lexicon_accessors.NIL;
        SubLObject failures = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$168 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    SubLObject cdolist_list_var;
                    final SubLObject raw_mapping = cdolist_list_var = nl_trie_accessors.nl_trie_denotation_mapper(string, excluded_preds, mode, parse_morphologically);
                    SubLObject token = (SubLObject)lexicon_accessors.NIL;
                    token = cdolist_list_var.first();
                    while (lexicon_accessors.NIL != cdolist_list_var) {
                        if (lexicon_accessors.NIL != standard_tokenization.string_token_value(token)) {
                            result = (SubLObject)ConsesLow.cons(token, result);
                        }
                        else {
                            final SubLObject number = string_utilities.string_to_number(standard_tokenization.string_token_string(token));
                            if (lexicon_accessors.NIL != number) {
                                result = (SubLObject)ConsesLow.cons(standard_tokenization.new_string_token(standard_tokenization.string_token_string(token), number), result);
                            }
                            else {
                                failures = (SubLObject)ConsesLow.cons(token, failures);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        token = cdolist_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$169 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$169, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$168, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(Sequences.nreverse(result), Sequences.nreverse(failures));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 58891L)
    public static SubLObject all_denots_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = (SubLObject)lexicon_accessors.T;
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == lexicon_accessors.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != Types.stringp(string) : string;
        assert lexicon_accessors.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : parse_morphologically;
        SubLObject denots = (SubLObject)lexicon_accessors.NIL;
        SubLObject predicate_lists = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$170 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (lexicon_accessors.NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject denots_$171 = nl_trie_accessors.nl_trie_all_denots_of_string(string, misspellingsP, lookup_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
                        final SubLObject predicate_lists_$172 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denots = denots_$171;
                        predicate_lists = predicate_lists_$172;
                    }
                    if (lexicon_accessors.NIL != proceed_with_morphological_parsingP(denots, parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject morph_denots = morphological_word_parser.denots_of_complex_word_string(string, (SubLObject)lexicon_accessors.UNPROVIDED);
                        final SubLObject morph_predicate_lists = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denots = ConsesLow.append(denots, morph_denots);
                        predicate_lists = ConsesLow.append(predicate_lists, morph_predicate_lists);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$171 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$171, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$170, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(denots, predicate_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 60187L)
    public static SubLObject most_denots_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = (SubLObject)lexicon_accessors.T;
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == lexicon_accessors.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != Types.stringp(string) : string;
        assert lexicon_accessors.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : parse_morphologically;
        SubLObject denots = (SubLObject)lexicon_accessors.NIL;
        SubLObject predicate_lists = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$174 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (lexicon_accessors.NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject denots_$175 = nl_trie_accessors.nl_trie_denots_of_string(string, (SubLObject)lexicon_accessors.$list209, (SubLObject)lexicon_accessors.$kw210$RELATED, misspellingsP, (SubLObject)lexicon_accessors.NIL, lookup_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
                        final SubLObject predicate_lists_$176 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denots = denots_$175;
                        predicate_lists = predicate_lists_$176;
                    }
                    if (lexicon_accessors.NIL != proceed_with_morphological_parsingP(denots, parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject morph_denots = morphological_word_parser.denots_of_complex_word_string(string, (SubLObject)lexicon_accessors.UNPROVIDED);
                        final SubLObject morph_predicate_lists = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denots = ConsesLow.append(denots, morph_denots);
                        predicate_lists = ConsesLow.append(predicate_lists, morph_predicate_lists);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$175 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$175, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$174, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(denots, predicate_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 61538L)
    public static SubLObject all_parsing_denots_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = (SubLObject)lexicon_accessors.T;
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == lexicon_accessors.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != Types.stringp(string) : string;
        assert lexicon_accessors.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : parse_morphologically;
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject skip_namesP = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$178 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (lexicon_accessors.NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject denots = nl_trie_accessors.nl_trie_denots_of_string(string, (SubLObject)lexicon_accessors.$list209, (SubLObject)lexicon_accessors.$kw172$DENOT, misspellingsP, skip_namesP, lookup_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
                        final SubLObject pred_lists = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        SubLObject denot = (SubLObject)lexicon_accessors.NIL;
                        SubLObject denot_$179 = (SubLObject)lexicon_accessors.NIL;
                        SubLObject pred_list = (SubLObject)lexicon_accessors.NIL;
                        SubLObject pred_list_$180 = (SubLObject)lexicon_accessors.NIL;
                        denot = denots;
                        denot_$179 = denot.first();
                        pred_list = pred_lists;
                        pred_list_$180 = pred_list.first();
                        while (lexicon_accessors.NIL != pred_list || lexicon_accessors.NIL != denot) {
                            SubLObject okP = (SubLObject)lexicon_accessors.NIL;
                            if (lexicon_accessors.NIL == okP) {
                                SubLObject csome_list_var = pred_list_$180;
                                SubLObject pred = (SubLObject)lexicon_accessors.NIL;
                                pred = csome_list_var.first();
                                while (lexicon_accessors.NIL == okP && lexicon_accessors.NIL != csome_list_var) {
                                    if (lexicon_accessors.NIL == parsing_utilities.npp_excluded_name_predP(pred)) {
                                        okP = (SubLObject)lexicon_accessors.T;
                                        ans = (SubLObject)ConsesLow.cons(denot_$179, ans);
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    pred = csome_list_var.first();
                                }
                            }
                            denot = denot.rest();
                            denot_$179 = denot.first();
                            pred_list = pred_list.rest();
                            pred_list_$180 = pred_list.first();
                        }
                        final SubLObject result = reader.read_from_string_ignoring_errors(string, (SubLObject)lexicon_accessors.NIL, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                        if (lexicon_accessors.NIL != collection_defns.cyc_real_number(result)) {
                            ans = (SubLObject)ConsesLow.cons(result, ans);
                        }
                    }
                    if (lexicon_accessors.NIL != proceed_with_morphological_parsingP(ans, parse_morphologically)) {
                        ans = czer_utilities.delete_el_duplicates(ConsesLow.append(ans, morphological_word_parser.denots_of_complex_word_string(string, (SubLObject)lexicon_accessors.UNPROVIDED)));
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$179 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$179, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$178, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 63318L)
    public static SubLObject denots_of_string(final SubLObject string, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject skip_namestringsP, SubLObject lookup_mt, SubLObject parse_morphologically, SubLObject parse_dates_and_numbersP, SubLObject lexicon) {
        if (abbrev_types == lexicon_accessors.UNPROVIDED) {
            abbrev_types = (SubLObject)lexicon_accessors.NIL;
        }
        if (denot_type == lexicon_accessors.UNPROVIDED) {
            denot_type = (SubLObject)lexicon_accessors.$kw172$DENOT;
        }
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = (SubLObject)lexicon_accessors.T;
        }
        if (skip_namestringsP == lexicon_accessors.UNPROVIDED) {
            skip_namestringsP = (SubLObject)lexicon_accessors.NIL;
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == lexicon_accessors.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        if (parse_dates_and_numbersP == lexicon_accessors.UNPROVIDED) {
            parse_dates_and_numbersP = (SubLObject)lexicon_accessors.T;
        }
        if (lexicon == lexicon_accessors.UNPROVIDED) {
            lexicon = (SubLObject)lexicon_accessors.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(string, lexicon_accessors.$sym211$CYCL_STRING_P);
        enforceType(abbrev_types, lexicon_accessors.$sym174$LISTP);
        enforceType(denot_type, lexicon_accessors.$sym103$KEYWORDP);
        enforceType(misspellingsP, lexicon_accessors.$sym175$BOOLEANP);
        enforceType(skip_namestringsP, lexicon_accessors.$sym175$BOOLEANP);
        enforceType(lookup_mt, lexicon_accessors.$sym212$VALID_DENOTS_OF_STRING_LOOKUP_MT_SPECIFICATION_);
        enforceType(parse_morphologically, lexicon_accessors.$sym96$PARSE_MORPHOLOGICALLY_OPTION_P);
        SubLObject denots = (SubLObject)lexicon_accessors.NIL;
        SubLObject predicate_lists = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$182 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (lookup_mt.isString()) {
                        lookup_mt = denots_mt_for_language(lexicon_utilities.get_language_for_code(lookup_mt));
                    }
                    final SubLObject _prev_bind_0_$183 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(lookup_mt, thread);
                        if (lexicon_accessors.NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                            if (lexicon_accessors.NIL == lexicon) {
                                lexicon = denots_of_string_lexicon.lexicon_for_denots_of_string(abbrev_types, denot_type, misspellingsP, skip_namestringsP, lookup_mt, lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue(thread));
                            }
                            thread.resetMultipleValues();
                            final SubLObject denots_$184 = denots_of_string_lexicon.lexicon_denots_of_string(string, lexicon);
                            final SubLObject predicate_lists_$185 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            denots = denots_$184;
                            predicate_lists = predicate_lists_$185;
                            if (lexicon_accessors.NIL != parse_dates_and_numbersP && string.isString()) {
                                final SubLObject date_and_number_denots = date_and_number_denots_of_string(string);
                                thread.resetMultipleValues();
                                final SubLObject denots_$185 = add_denots_of_string_results(denots, predicate_lists, date_and_number_denots, (SubLObject)ConsesLow.make_list(Sequences.length(date_and_number_denots), (SubLObject)lexicon_accessors.$list213));
                                final SubLObject predicate_lists_$186 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                denots = denots_$185;
                                predicate_lists = predicate_lists_$186;
                            }
                        }
                        if (string.isString() && lexicon_accessors.NIL != proceed_with_morphological_parsingP(denots, parse_morphologically)) {
                            thread.resetMultipleValues();
                            final SubLObject morph_denots = morphological_word_parser.denots_of_complex_word_string(string, (SubLObject)lexicon_accessors.UNPROVIDED);
                            final SubLObject morph_predicate_lists = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            thread.resetMultipleValues();
                            final SubLObject denots_$186 = add_denots_of_string_results(denots, predicate_lists, morph_denots, morph_predicate_lists);
                            final SubLObject predicate_lists_$187 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            denots = denots_$186;
                            predicate_lists = predicate_lists_$187;
                        }
                    }
                    finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0_$183, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$184 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$184, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$182, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(denots, predicate_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 66933L)
    public static SubLObject valid_denots_of_string_lookup_mt_specificationP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL != hlmt.hlmt_p(obj) || (obj.isString() && lexicon_accessors.NIL != lexicon_utilities.get_language_for_code(obj)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 67104L)
    public static SubLObject denots_mt_for_language(final SubLObject language) {
        final SubLObject validated_psc = kb_mapping_utilities.fpred_value_in_any_mt(language, lexicon_accessors.$const219$validatedLexicalPSCForLanguage, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
        final SubLObject monad = (lexicon_accessors.NIL != validated_psc) ? validated_psc : lexicon_utilities.lexical_mt_for_language(language);
        return hlmt_czer.canonicalize_hlmt(el_utilities.make_binary_formula(lexicon_accessors.$const220$MtSpace, monad, lexicon_accessors.$const221$AnytimePSC));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 67483L)
    public static SubLObject add_denots_of_string_results(final SubLObject denots, final SubLObject predicate_lists, final SubLObject new_denots, final SubLObject new_predicate_lists) {
        SubLObject all_denots = denots;
        SubLObject all_predicate_lists = predicate_lists;
        SubLObject denot = (SubLObject)lexicon_accessors.NIL;
        SubLObject denot_$191 = (SubLObject)lexicon_accessors.NIL;
        SubLObject predicate_list = (SubLObject)lexicon_accessors.NIL;
        SubLObject predicate_list_$192 = (SubLObject)lexicon_accessors.NIL;
        denot = new_denots;
        denot_$191 = denot.first();
        predicate_list = new_predicate_lists;
        predicate_list_$192 = predicate_list.first();
        while (lexicon_accessors.NIL != predicate_list || lexicon_accessors.NIL != denot) {
            final SubLObject position = Sequences.position(denot_$191, all_denots, Symbols.symbol_function((SubLObject)lexicon_accessors.EQUAL), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
            if (lexicon_accessors.NIL == position) {
                all_denots = list_utilities.add_to_end(denot_$191, all_denots);
                all_predicate_lists = list_utilities.add_to_end(predicate_list_$192, all_predicate_lists);
            }
            else {
                ConsesLow.set_nth(position, all_predicate_lists, conses_high.union(ConsesLow.nth(position, all_predicate_lists), predicate_list_$192, Symbols.symbol_function((SubLObject)lexicon_accessors.EQUAL), (SubLObject)lexicon_accessors.UNPROVIDED));
            }
            denot = denot.rest();
            denot_$191 = denot.first();
            predicate_list = predicate_list.rest();
            predicate_list_$192 = predicate_list.first();
        }
        return Values.values(all_denots, all_predicate_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 68126L)
    public static SubLObject date_and_number_denots_of_string(final SubLObject string) {
        final SubLObject date_parses = date_utilities.parse_date_from_string_fast(string, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
        final SubLObject number_parse = numeral_parser.string_to_interval(string);
        return list_utilities.cons_if(number_parse, date_parses);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 68388L)
    public static SubLObject denots_of_stringXpred(final SubLObject string, final SubLObject pred, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject precise_with_theP, SubLObject parse_morphologically) {
        if (abbrev_types == lexicon_accessors.UNPROVIDED) {
            abbrev_types = (SubLObject)lexicon_accessors.NIL;
        }
        if (denot_type == lexicon_accessors.UNPROVIDED) {
            denot_type = (SubLObject)lexicon_accessors.$kw172$DENOT;
        }
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = (SubLObject)lexicon_accessors.T;
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (precise_with_theP == lexicon_accessors.UNPROVIDED) {
            precise_with_theP = (SubLObject)lexicon_accessors.NIL;
        }
        if (parse_morphologically == lexicon_accessors.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        assert lexicon_accessors.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : parse_morphologically;
        if (lexicon_accessors.NIL != speech_part_predP(pred, (SubLObject)lexicon_accessors.UNPROVIDED)) {
            return denots_of_stringXpos_pred(string, pred, abbrev_types, denot_type, misspellingsP, lookup_mt, parse_morphologically);
        }
        if (lexicon_accessors.NIL != lexicon_vars.name_string_predP(pred)) {
            return denots_of_stringXnamestring_pred(string, pred, misspellingsP, lookup_mt, precise_with_theP);
        }
        Errors.error((SubLObject)lexicon_accessors.$str222$_S_passes_neither_SPEECH_PART_PRE, pred);
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 69099L)
    public static SubLObject denots_of_stringXnamestring_pred(final SubLObject string, final SubLObject namestring_pred, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject precise_with_theP) {
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = (SubLObject)lexicon_accessors.T;
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (precise_with_theP == lexicon_accessors.UNPROVIDED) {
            precise_with_theP = (SubLObject)lexicon_accessors.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != Types.stringp(string) : string;
        assert lexicon_accessors.NIL != lexicon_vars.name_string_predP(namestring_pred) : namestring_pred;
        SubLObject result_denots = (SubLObject)lexicon_accessors.NIL;
        SubLObject result_preds = (SubLObject)lexicon_accessors.NIL;
        thread.resetMultipleValues();
        final SubLObject denots = denots_of_name_string(string, misspellingsP, lookup_mt, precise_with_theP);
        final SubLObject preds = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject denot = (SubLObject)lexicon_accessors.NIL;
        SubLObject denot_$193 = (SubLObject)lexicon_accessors.NIL;
        SubLObject pred_list = (SubLObject)lexicon_accessors.NIL;
        SubLObject pred_list_$194 = (SubLObject)lexicon_accessors.NIL;
        denot = denots;
        denot_$193 = denot.first();
        pred_list = preds;
        pred_list_$194 = pred_list.first();
        while (lexicon_accessors.NIL != pred_list || lexicon_accessors.NIL != denot) {
            SubLObject cdolist_list_var = pred_list_$194;
            SubLObject pred = (SubLObject)lexicon_accessors.NIL;
            pred = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                SubLObject result_pred_list = (SubLObject)lexicon_accessors.NIL;
                if (lexicon_accessors.NIL != genl_pos_predP(pred, namestring_pred, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                    result_pred_list = (SubLObject)ConsesLow.cons(pred, result_pred_list);
                }
                if (lexicon_accessors.NIL != result_pred_list) {
                    result_preds = (SubLObject)ConsesLow.cons(result_pred_list, result_preds);
                    result_denots = (SubLObject)ConsesLow.cons(denot_$193, result_denots);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
            denot = denot.rest();
            denot_$193 = denot.first();
            pred_list = pred_list.rest();
            pred_list_$194 = pred_list.first();
        }
        return Values.values(Sequences.nreverse(result_denots), Sequences.nreverse(result_preds));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 70087L)
    public static SubLObject denots_of_stringXpos_pred(final SubLObject string, final SubLObject pos_pred, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (abbrev_types == lexicon_accessors.UNPROVIDED) {
            abbrev_types = (SubLObject)lexicon_accessors.NIL;
        }
        if (denot_type == lexicon_accessors.UNPROVIDED) {
            denot_type = (SubLObject)lexicon_accessors.$kw172$DENOT;
        }
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = (SubLObject)lexicon_accessors.T;
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == lexicon_accessors.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != Types.stringp(string) : string;
        assert lexicon_accessors.NIL != speech_part_predP(pos_pred, (SubLObject)lexicon_accessors.UNPROVIDED) : pos_pred;
        assert lexicon_accessors.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : parse_morphologically;
        SubLObject denots = (SubLObject)lexicon_accessors.NIL;
        SubLObject predicate_lists = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$195 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (lexicon_accessors.NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject denots_$196 = nl_trie_accessors.nl_trie_denots_of_stringXpred(string, pos_pred, abbrev_types, denot_type, misspellingsP, lookup_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
                        final SubLObject predicate_lists_$197 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denots = denots_$196;
                        predicate_lists = predicate_lists_$197;
                    }
                    if (lexicon_accessors.NIL != proceed_with_morphological_parsingP(denots, parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject morph_denots = morphological_word_parser.denots_of_complex_word_stringXpos_pred(string, pos_pred, lookup_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
                        final SubLObject morph_predicate_lists = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denots = ConsesLow.append(denots, morph_denots);
                        predicate_lists = ConsesLow.append(predicate_lists, morph_predicate_lists);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$196 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$196, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$195, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(denots, predicate_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 71427L)
    public static SubLObject denots_of_stringXspeech_part(final SubLObject string, final SubLObject pos, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (abbrev_types == lexicon_accessors.UNPROVIDED) {
            abbrev_types = (SubLObject)lexicon_accessors.NIL;
        }
        if (denot_type == lexicon_accessors.UNPROVIDED) {
            denot_type = (SubLObject)lexicon_accessors.$kw172$DENOT;
        }
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = (SubLObject)lexicon_accessors.T;
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == lexicon_accessors.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != Types.stringp(string) : string;
        assert lexicon_accessors.NIL != speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED) : pos;
        assert lexicon_accessors.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : parse_morphologically;
        SubLObject denots = (SubLObject)lexicon_accessors.NIL;
        SubLObject predicate_lists = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$199 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (lexicon_accessors.NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject denots_$200 = nl_trie_accessors.nl_trie_denots_of_stringXspeech_part(string, pos, abbrev_types, denot_type, misspellingsP, lookup_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
                        final SubLObject predicate_lists_$201 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denots = denots_$200;
                        predicate_lists = predicate_lists_$201;
                    }
                    if (lexicon_accessors.NIL != proceed_with_morphological_parsingP(denots, parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject morph_denots = morphological_word_parser.denots_of_complex_word_stringXspeech_part(string, pos, (SubLObject)lexicon_accessors.UNPROVIDED);
                        final SubLObject morph_predicate_lists = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denots = ConsesLow.append(denots, morph_denots);
                        predicate_lists = ConsesLow.append(predicate_lists, morph_predicate_lists);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$200 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$200, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$199, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(denots, predicate_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 72775L)
    public static SubLObject denots_of_stringXpos(final SubLObject string, final SubLObject pos_keyword, SubLObject denot_type, SubLObject misspellingsP, SubLObject abbrev_types, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (denot_type == lexicon_accessors.UNPROVIDED) {
            denot_type = (SubLObject)lexicon_accessors.$kw172$DENOT;
        }
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = (SubLObject)lexicon_accessors.T;
        }
        if (abbrev_types == lexicon_accessors.UNPROVIDED) {
            abbrev_types = (SubLObject)lexicon_accessors.NIL;
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == lexicon_accessors.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != Types.stringp(string) : string;
        assert lexicon_accessors.NIL != Types.keywordp(pos_keyword) : pos_keyword;
        assert lexicon_accessors.NIL != lexicon_vars.parse_morphologically_option_p(parse_morphologically) : parse_morphologically;
        SubLObject denots = (SubLObject)lexicon_accessors.NIL;
        SubLObject predicate_lists = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$203 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (lexicon_accessors.NIL == skip_to_morphological_parsingP(parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject denots_$204 = nl_trie_accessors.nl_trie_denots_of_stringXpos(string, pos_keyword, abbrev_types, denot_type, misspellingsP, lookup_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
                        final SubLObject predicate_lists_$205 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denots = denots_$204;
                        predicate_lists = predicate_lists_$205;
                    }
                    if (lexicon_accessors.NIL != proceed_with_morphological_parsingP(denots, parse_morphologically)) {
                        thread.resetMultipleValues();
                        final SubLObject morph_denots = morphological_word_parser.denots_of_complex_word_stringXpos(string, pos_keyword, lookup_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
                        final SubLObject morph_predicate_lists = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        denots = ConsesLow.append(denots, morph_denots);
                        predicate_lists = ConsesLow.append(predicate_lists, morph_predicate_lists);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$204 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$204, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$203, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(denots, predicate_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 74232L)
    public static SubLObject denots_of_name_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject precise_with_theP) {
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (precise_with_theP == lexicon_accessors.UNPROVIDED) {
            precise_with_theP = (SubLObject)lexicon_accessors.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denots = (SubLObject)lexicon_accessors.NIL;
        SubLObject pred_lists = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$207 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    thread.resetMultipleValues();
                    final SubLObject denots_$208 = nl_trie_accessors.nl_trie_denots_of_name_string(string, misspellingsP, lookup_mt, precise_with_theP, (SubLObject)lexicon_accessors.UNPROVIDED);
                    final SubLObject pred_lists_$209 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    denots = denots_$208;
                    pred_lists = pred_lists_$209;
                }
                finally {
                    final SubLObject _prev_bind_0_$208 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$208, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$207, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(denots, pred_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 74861L)
    public static SubLObject denots_of_name_string_precise(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return denots_of_name_string(string, misspellingsP, lookup_mt, (SubLObject)lexicon_accessors.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 75233L)
    public static SubLObject denots_of_wu(final SubLObject wu, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denotations = (SubLObject)lexicon_accessors.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject denot_preds = cdolist_list_var = nl_trie.nl_trie_denotation_predicates();
            SubLObject pred = (SubLObject)lexicon_accessors.NIL;
            pred = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                if (lexicon_accessors.NIL == lexicon_utilities.stringlist_args_of_pred_cached(pred)) {
                    final SubLObject word_index = lexicon_utilities.wu_arg_of_pred_cached(pred);
                    final SubLObject denot_index = lexicon_utilities.denotatum_arg_of_pred_cached(pred);
                    SubLObject cdolist_list_var_$211 = kb_mapping.gather_gaf_arg_index(wu, word_index, pred, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                    SubLObject v_assert = (SubLObject)lexicon_accessors.NIL;
                    v_assert = cdolist_list_var_$211.first();
                    while (lexicon_accessors.NIL != cdolist_list_var_$211) {
                        denotations = (SubLObject)ConsesLow.cons(cycl_utilities.formula_arg(v_assert, denot_index, (SubLObject)lexicon_accessors.UNPROVIDED), denotations);
                        cdolist_list_var_$211 = cdolist_list_var_$211.rest();
                        v_assert = cdolist_list_var_$211.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return denotations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 75826L)
    public static SubLObject proceed_with_morphological_parsingP(final SubLObject results_so_far, final SubLObject parse_morphologically_option) {
        if (parse_morphologically_option.eql((SubLObject)lexicon_accessors.$kw224$ONLY) || parse_morphologically_option.eql((SubLObject)lexicon_accessors.$kw225$ALWAYS)) {
            return (SubLObject)lexicon_accessors.T;
        }
        if (parse_morphologically_option.eql((SubLObject)lexicon_accessors.$kw99$AS_FALLBACK)) {
            return Types.sublisp_null(results_so_far);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 76233L)
    public static SubLObject skip_to_morphological_parsingP(final SubLObject parse_morphologically_option) {
        return Equality.eq(parse_morphologically_option, (SubLObject)lexicon_accessors.$kw224$ONLY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 76504L)
    public static SubLObject denots_of_acronym_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denots = (SubLObject)lexicon_accessors.NIL;
        SubLObject pred_lists = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$212 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    thread.resetMultipleValues();
                    final SubLObject denots_$213 = nl_trie_accessors.nl_trie_denots_of_acronym_string(string, misspellingsP, lookup_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
                    final SubLObject pred_lists_$214 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    denots = denots_$213;
                    pred_lists = pred_lists_$214;
                }
                finally {
                    final SubLObject _prev_bind_0_$213 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$213, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$212, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(denots, pred_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 77002L)
    public static SubLObject names_from_spelling(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denots = (SubLObject)lexicon_accessors.NIL;
        SubLObject pred_lists = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$216 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    thread.resetMultipleValues();
                    final SubLObject denots_$217 = nl_trie_accessors.nl_trie_names_from_spelling(string, misspellingsP, lookup_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
                    final SubLObject pred_lists_$218 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    denots = denots_$217;
                    pred_lists = pred_lists_$218;
                }
                finally {
                    final SubLObject _prev_bind_0_$217 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$217, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$216, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(denots, pred_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 77523L)
    public static SubLObject names_from_nickname(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denots = (SubLObject)lexicon_accessors.NIL;
        SubLObject pred_lists = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$220 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    thread.resetMultipleValues();
                    final SubLObject denots_$221 = nl_trie_accessors.nl_trie_names_from_nickname(string, misspellingsP, lookup_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
                    final SubLObject pred_lists_$222 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    denots = denots_$221;
                    pred_lists = pred_lists_$222;
                }
                finally {
                    final SubLObject _prev_bind_0_$221 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$221, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$220, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(denots, pred_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 78046L)
    public static SubLObject denots_of_abbreviation_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt) {
        if (misspellingsP == lexicon_accessors.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == lexicon_accessors.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denots = (SubLObject)lexicon_accessors.NIL;
        SubLObject pred_lists = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$224 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    thread.resetMultipleValues();
                    final SubLObject denots_$225 = nl_trie_accessors.nl_trie_denots_of_abbreviation_string(string, misspellingsP, lookup_mt, (SubLObject)lexicon_accessors.UNPROVIDED);
                    final SubLObject pred_lists_$226 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    denots = denots_$225;
                    pred_lists = pred_lists_$226;
                }
                finally {
                    final SubLObject _prev_bind_0_$225 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$225, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$224, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(denots, pred_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 78626L)
    public static SubLObject known_proper_noun_phraseP(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != Types.stringp(phrase) : phrase;
        final SubLObject proper_name_preds = isa.all_fort_instances(lexicon_accessors.$const226$ProperNamePredicate_Strict, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
        SubLObject result = (SubLObject)lexicon_accessors.NIL;
        SubLObject denots = (SubLObject)lexicon_accessors.NIL;
        SubLObject predicates = (SubLObject)lexicon_accessors.NIL;
        SubLObject predicate_lists = (SubLObject)lexicon_accessors.NIL;
        final SubLObject current_state = memoization_state.current_memoization_state();
        final SubLObject _prev_bind_0 = lexicon_macros.$lexicon_memoization_state$.currentBinding(thread);
        try {
            lexicon_macros.$lexicon_memoization_state$.bind((lexicon_accessors.NIL != current_state) ? current_state : lexicon_macros.find_or_create_lexicon_memoization_state(), thread);
            final SubLObject local_state = lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$228 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    thread.resetMultipleValues();
                    final SubLObject denots_$229 = denots_of_string(phrase, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                    final SubLObject predicate_lists_$230 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    denots = denots_$229;
                    predicate_lists = predicate_lists_$230;
                    predicates = list_utilities.flatten(predicate_lists);
                    if (lexicon_accessors.NIL != denots && lexicon_accessors.NIL == conses_high.set_difference(predicates, proper_name_preds, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                        result = (SubLObject)lexicon_accessors.T;
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$229 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$229, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$228, thread);
            }
        }
        finally {
            lexicon_macros.$lexicon_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 79576L)
    public static SubLObject determine_denotation_preds(final SubLObject denot_type) {
        if (denot_type.eql((SubLObject)lexicon_accessors.$kw227$JUST_RELATED)) {
            return (SubLObject)lexicon_accessors.$list228;
        }
        if (denot_type.eql((SubLObject)lexicon_accessors.$kw229$JUST_PLACEHOLDER)) {
            return (SubLObject)lexicon_accessors.$list230;
        }
        if (denot_type.eql((SubLObject)lexicon_accessors.$kw210$RELATED)) {
            return (SubLObject)lexicon_accessors.$list231;
        }
        if (denot_type.eql((SubLObject)lexicon_accessors.$kw132$ANY)) {
            return (SubLObject)lexicon_accessors.$list232;
        }
        return (SubLObject)lexicon_accessors.$list233;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 80506L)
    public static SubLObject determine_denotation_pred(final SubLObject denot_type) {
        if (denot_type.eql((SubLObject)lexicon_accessors.$kw172$DENOT)) {
            return lexicon_accessors.$const234$denotation;
        }
        if (denot_type.eql((SubLObject)lexicon_accessors.$kw235$PLACEHOLDER)) {
            return lexicon_accessors.$const236$denotationPlaceholder;
        }
        if (denot_type.eql((SubLObject)lexicon_accessors.$kw210$RELATED)) {
            return lexicon_accessors.$const237$denotationRelatedTo;
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 80913L)
    public static SubLObject meanings_of_sense(final SubLObject denot_type, final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject denot_preds = determine_denotation_preds(denot_type);
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = denot_preds;
            SubLObject denot_pred = (SubLObject)lexicon_accessors.NIL;
            denot_pred = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                final SubLObject pred_var = denot_pred;
                if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, (SubLObject)lexicon_accessors.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, (SubLObject)lexicon_accessors.NIL, pred_var);
                    SubLObject done_var = (SubLObject)lexicon_accessors.NIL;
                    final SubLObject token_var = (SubLObject)lexicon_accessors.NIL;
                    while (lexicon_accessors.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (lexicon_accessors.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)lexicon_accessors.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.$kw56$TRUE, (SubLObject)lexicon_accessors.NIL);
                                SubLObject done_var_$232 = (SubLObject)lexicon_accessors.NIL;
                                final SubLObject token_var_$233 = (SubLObject)lexicon_accessors.NIL;
                                while (lexicon_accessors.NIL == done_var_$232) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$233);
                                    final SubLObject valid_$234 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$233.eql(gaf));
                                    if (lexicon_accessors.NIL != valid_$234 && lexicon_accessors.NIL != kb_utilities.kbeq(assertions_high.gaf_arg2(gaf), pos) && lexicon_accessors.NIL != kb_utilities.kbeq(assertions_high.gaf_arg3(gaf), v_int)) {
                                        final SubLObject item_var = assertions_high.gaf_arg4(gaf);
                                        if (lexicon_accessors.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)lexicon_accessors.EQL), Symbols.symbol_function((SubLObject)lexicon_accessors.IDENTITY))) {
                                            ans = (SubLObject)ConsesLow.cons(item_var, ans);
                                        }
                                    }
                                    done_var_$232 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$234);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$235 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (lexicon_accessors.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$235, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                denot_pred = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 81708L)
    public static SubLObject meaning_has_senseP(final SubLObject meaning, final SubLObject denot_type, final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject denot_preds = determine_denotation_preds(denot_type);
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (lexicon_accessors.NIL == ans) {
                SubLObject csome_list_var = denot_preds;
                SubLObject denot_pred = (SubLObject)lexicon_accessors.NIL;
                denot_pred = csome_list_var.first();
                while (lexicon_accessors.NIL == ans && lexicon_accessors.NIL != csome_list_var) {
                    final SubLObject pred_var = denot_pred;
                    if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, (SubLObject)lexicon_accessors.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, (SubLObject)lexicon_accessors.NIL, pred_var);
                        SubLObject done_var = ans;
                        final SubLObject token_var = (SubLObject)lexicon_accessors.NIL;
                        while (lexicon_accessors.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (lexicon_accessors.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)lexicon_accessors.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.$kw56$TRUE, (SubLObject)lexicon_accessors.NIL);
                                    SubLObject done_var_$236 = ans;
                                    final SubLObject token_var_$237 = (SubLObject)lexicon_accessors.NIL;
                                    while (lexicon_accessors.NIL == done_var_$236) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$237);
                                        final SubLObject valid_$238 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$237.eql(gaf));
                                        if (lexicon_accessors.NIL != valid_$238 && lexicon_accessors.NIL != kb_utilities.kbeq(assertions_high.gaf_arg2(gaf), pos) && lexicon_accessors.NIL != kb_utilities.kbeq(assertions_high.gaf_arg3(gaf), v_int) && assertions_high.gaf_arg4(gaf).equal(meaning)) {
                                            ans = (SubLObject)lexicon_accessors.T;
                                        }
                                        done_var_$236 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$238 || lexicon_accessors.NIL != ans);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$239 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (lexicon_accessors.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$239, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid || lexicon_accessors.NIL != ans);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    denot_pred = csome_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 82562L)
    public static SubLObject denot_has_senseP(final SubLObject denot, final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return meaning_has_senseP(denot, (SubLObject)lexicon_accessors.$kw172$DENOT, word_unit, pos, v_int, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 82916L)
    public static SubLObject denots_of_sense(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return meanings_of_sense((SubLObject)lexicon_accessors.$kw172$DENOT, word_unit, pos, v_int, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 83237L)
    public static SubLObject proper_denots_of_sense(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return denots_of_sense(word_unit, pos, v_int, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 83588L)
    public static SubLObject related_denots_of_sense(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return meanings_of_sense((SubLObject)lexicon_accessors.$kw227$JUST_RELATED, word_unit, pos, v_int, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 83932L)
    public static SubLObject placeholder_denots_of_sense(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return meanings_of_sense((SubLObject)lexicon_accessors.$kw229$JUST_PLACEHOLDER, word_unit, pos, v_int, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 84387L)
    public static SubLObject denots_of_sense_by_mt(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject denot_type) {
        if (denot_type == lexicon_accessors.UNPROVIDED) {
            denot_type = (SubLObject)lexicon_accessors.$kw172$DENOT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject denot_preds = determine_denotation_preds(denot_type);
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        SubLObject cdolist_list_var = denot_preds;
        SubLObject denot_pred = (SubLObject)lexicon_accessors.NIL;
        denot_pred = cdolist_list_var.first();
        while (lexicon_accessors.NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_accessors.$sym19$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(lexicon_accessors.$const20$EverythingPSC, thread);
                final SubLObject pred_var = denot_pred;
                if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, (SubLObject)lexicon_accessors.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, (SubLObject)lexicon_accessors.NIL, pred_var);
                    SubLObject done_var = (SubLObject)lexicon_accessors.NIL;
                    final SubLObject token_var = (SubLObject)lexicon_accessors.NIL;
                    while (lexicon_accessors.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (lexicon_accessors.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)lexicon_accessors.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.$kw56$TRUE, (SubLObject)lexicon_accessors.NIL);
                                SubLObject done_var_$240 = (SubLObject)lexicon_accessors.NIL;
                                final SubLObject token_var_$241 = (SubLObject)lexicon_accessors.NIL;
                                while (lexicon_accessors.NIL == done_var_$240) {
                                    final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$241);
                                    final SubLObject valid_$242 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$241.eql(as));
                                    if (lexicon_accessors.NIL != valid_$242 && lexicon_accessors.NIL != kb_utilities.kbeq(assertions_high.gaf_arg2(as), pos) && lexicon_accessors.NIL != kb_utilities.kbeq(assertions_high.gaf_arg3(as), v_int)) {
                                        final SubLObject item_var = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg4(as), assertions_high.assertion_mt(as));
                                        if (lexicon_accessors.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)lexicon_accessors.EQL), Symbols.symbol_function((SubLObject)lexicon_accessors.IDENTITY))) {
                                            ans = (SubLObject)ConsesLow.cons(item_var, ans);
                                        }
                                    }
                                    done_var_$240 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$242);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$243 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (lexicon_accessors.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$243, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            denot_pred = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 85001L)
    public static SubLObject senses_of_wuXpos(final SubLObject word_unit, final SubLObject pos, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = (SubLObject)lexicon_accessors.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_accessors.$sym19$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(lexicon_accessors.$const20$EverythingPSC, thread);
            SubLObject cdolist_list_var = (SubLObject)ConsesLow.cons(lexicon_accessors.$const238$subcatFrame, determine_denotation_preds((SubLObject)lexicon_accessors.$kw132$ANY));
            SubLObject predicate = (SubLObject)lexicon_accessors.NIL;
            predicate = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                final SubLObject pred_var = predicate;
                if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, (SubLObject)lexicon_accessors.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, (SubLObject)lexicon_accessors.NIL, pred_var);
                    SubLObject done_var = (SubLObject)lexicon_accessors.NIL;
                    final SubLObject token_var = (SubLObject)lexicon_accessors.NIL;
                    while (lexicon_accessors.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (lexicon_accessors.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)lexicon_accessors.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.$kw56$TRUE, (SubLObject)lexicon_accessors.NIL);
                                SubLObject done_var_$244 = (SubLObject)lexicon_accessors.NIL;
                                final SubLObject token_var_$245 = (SubLObject)lexicon_accessors.NIL;
                                while (lexicon_accessors.NIL == done_var_$244) {
                                    final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$245);
                                    final SubLObject valid_$246 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$245.eql(as));
                                    if (lexicon_accessors.NIL != valid_$246 && (lexicon_accessors.NIL == mt || lexicon_accessors.NIL != genl_lexicon_mtP(mt, assertions_high.assertion_mt(as))) && lexicon_accessors.NIL != kb_utilities.kbeq(assertions_high.gaf_arg2(as), pos)) {
                                        final SubLObject item_var = assertions_high.gaf_arg3(as);
                                        if (lexicon_accessors.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)lexicon_accessors.EQL), Symbols.symbol_function((SubLObject)lexicon_accessors.IDENTITY))) {
                                            ans = (SubLObject)ConsesLow.cons(item_var, ans);
                                        }
                                    }
                                    done_var_$244 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$246);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$247 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (lexicon_accessors.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$247, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                predicate = cdolist_list_var.first();
            }
            final SubLObject semtrans_pred = pos_to_semtrans_pred(pos, (SubLObject)lexicon_accessors.UNPROVIDED);
            if (lexicon_accessors.NIL != semtrans_pred) {
                final SubLObject pred_var2 = semtrans_pred;
                if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, (SubLObject)lexicon_accessors.NIL, pred_var2)) {
                    final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, (SubLObject)lexicon_accessors.NIL, pred_var2);
                    SubLObject done_var2 = (SubLObject)lexicon_accessors.NIL;
                    final SubLObject token_var2 = (SubLObject)lexicon_accessors.NIL;
                    while (lexicon_accessors.NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                        if (lexicon_accessors.NIL != valid2) {
                            SubLObject final_index_iterator2 = (SubLObject)lexicon_accessors.NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.$kw56$TRUE, (SubLObject)lexicon_accessors.NIL);
                                SubLObject done_var_$245 = (SubLObject)lexicon_accessors.NIL;
                                final SubLObject token_var_$246 = (SubLObject)lexicon_accessors.NIL;
                                while (lexicon_accessors.NIL == done_var_$245) {
                                    final SubLObject as2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$246);
                                    final SubLObject valid_$247 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$246.eql(as2));
                                    if (lexicon_accessors.NIL != valid_$247 && (lexicon_accessors.NIL == mt || lexicon_accessors.NIL != genl_lexicon_mtP(mt, assertions_high.assertion_mt(as2)))) {
                                        final SubLObject item_var2 = assertions_high.gaf_arg2(as2);
                                        if (lexicon_accessors.NIL == conses_high.member(item_var2, ans, Symbols.symbol_function((SubLObject)lexicon_accessors.EQL), Symbols.symbol_function((SubLObject)lexicon_accessors.IDENTITY))) {
                                            ans = (SubLObject)ConsesLow.cons(item_var2, ans);
                                        }
                                    }
                                    done_var_$245 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$247);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$248 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    if (lexicon_accessors.NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$248, thread);
                                }
                            }
                        }
                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid2);
                    }
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return Sort.sort(ans, (SubLObject)lexicon_accessors.$sym239$_, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 86077L)
    public static SubLObject subcat_frame_arity(final SubLObject frame) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != forts.fort_p(frame) : frame;
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = kb_mapping_utilities.fpred_value(frame, lexicon_accessors.$const241$subcatFrameArity, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 86381L)
    public static SubLObject frames_of_word(final SubLObject word_unit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != forts.fort_p(word_unit) : word_unit;
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL != kb_mapping_utilities.some_pred_value_in_any_mt(word_unit, lexicon_accessors.$const238$subcatFrame, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                ans = kb_mapping_utilities.pred_values(word_unit, lexicon_accessors.$const238$subcatFrame, (SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.FOUR_INTEGER, (SubLObject)lexicon_accessors.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 86790L)
    public static SubLObject frames_of_wordXpos(final SubLObject word_unit, final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != forts.fort_p(word_unit) : word_unit;
        assert lexicon_accessors.NIL != speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED) : pos;
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL != frames_of_word(word_unit)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject pred_var = lexicon_accessors.$const238$subcatFrame;
                if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, (SubLObject)lexicon_accessors.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, (SubLObject)lexicon_accessors.ONE_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)lexicon_accessors.NIL;
                    final SubLObject token_var = (SubLObject)lexicon_accessors.NIL;
                    while (lexicon_accessors.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (lexicon_accessors.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)lexicon_accessors.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.$kw56$TRUE, (SubLObject)lexicon_accessors.NIL);
                                SubLObject done_var_$252 = (SubLObject)lexicon_accessors.NIL;
                                final SubLObject token_var_$253 = (SubLObject)lexicon_accessors.NIL;
                                while (lexicon_accessors.NIL == done_var_$252) {
                                    final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$253);
                                    final SubLObject valid_$254 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$253.eql(as));
                                    if (lexicon_accessors.NIL != valid_$254 && assertions_high.gaf_arg2(as).equal(pos)) {
                                        final SubLObject item_var = assertions_high.gaf_arg4(as);
                                        if (lexicon_accessors.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)lexicon_accessors.EQL), Symbols.symbol_function((SubLObject)lexicon_accessors.IDENTITY))) {
                                            ans = (SubLObject)ConsesLow.cons(item_var, ans);
                                        }
                                    }
                                    done_var_$252 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$254);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$255 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (lexicon_accessors.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$255, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid);
                    }
                }
                final SubLObject semtrans_pred = pos_to_semtrans_pred(pos, (SubLObject)lexicon_accessors.UNPROVIDED);
                if (lexicon_accessors.NIL != semtrans_pred) {
                    final SubLObject pred_var2 = semtrans_pred;
                    if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, (SubLObject)lexicon_accessors.ONE_INTEGER, pred_var2)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, (SubLObject)lexicon_accessors.ONE_INTEGER, pred_var2);
                        SubLObject done_var2 = (SubLObject)lexicon_accessors.NIL;
                        final SubLObject token_var2 = (SubLObject)lexicon_accessors.NIL;
                        while (lexicon_accessors.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (lexicon_accessors.NIL != valid2) {
                                SubLObject final_index_iterator2 = (SubLObject)lexicon_accessors.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.$kw56$TRUE, (SubLObject)lexicon_accessors.NIL);
                                    SubLObject done_var_$253 = (SubLObject)lexicon_accessors.NIL;
                                    final SubLObject token_var_$254 = (SubLObject)lexicon_accessors.NIL;
                                    while (lexicon_accessors.NIL == done_var_$253) {
                                        final SubLObject as2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$254);
                                        final SubLObject valid_$255 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$254.eql(as2));
                                        if (lexicon_accessors.NIL != valid_$255) {
                                            final SubLObject item_var2 = assertions_high.gaf_arg3(as2);
                                            if (lexicon_accessors.NIL == conses_high.member(item_var2, ans, Symbols.symbol_function((SubLObject)lexicon_accessors.EQL), Symbols.symbol_function((SubLObject)lexicon_accessors.IDENTITY))) {
                                                ans = (SubLObject)ConsesLow.cons(item_var2, ans);
                                            }
                                        }
                                        done_var_$253 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$255);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$256 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (lexicon_accessors.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$256, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid2);
                        }
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 87563L)
    public static SubLObject frames_of_word_posXdenot(final SubLObject word_unit, final SubLObject pos, final SubLObject denot) {
        assert lexicon_accessors.NIL != forts.fort_p(word_unit) : word_unit;
        assert lexicon_accessors.NIL != speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED) : pos;
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL != frames_of_word(word_unit)) {
            SubLObject cdolist_list_var = senses_of_wuXpos(word_unit, pos, (SubLObject)lexicon_accessors.UNPROVIDED);
            SubLObject sense = (SubLObject)lexicon_accessors.NIL;
            sense = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                if (lexicon_accessors.NIL != denot_has_senseP(denot, word_unit, pos, sense, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                    SubLObject cdolist_list_var_$260 = frames_of_sense(word_unit, pos, sense, (SubLObject)lexicon_accessors.UNPROVIDED);
                    SubLObject frame = (SubLObject)lexicon_accessors.NIL;
                    frame = cdolist_list_var_$260.first();
                    while (lexicon_accessors.NIL != cdolist_list_var_$260) {
                        final SubLObject item_var = frame;
                        if (lexicon_accessors.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)lexicon_accessors.EQL), Symbols.symbol_function((SubLObject)lexicon_accessors.IDENTITY))) {
                            ans = (SubLObject)ConsesLow.cons(item_var, ans);
                        }
                        cdolist_list_var_$260 = cdolist_list_var_$260.rest();
                        frame = cdolist_list_var_$260.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                sense = cdolist_list_var.first();
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 88263L)
    public static SubLObject frames_of_sense(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != forts.fort_p(word_unit) : word_unit;
        assert lexicon_accessors.NIL != speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED) : pos;
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = lexicon_accessors.$const238$subcatFrame;
            if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, (SubLObject)lexicon_accessors.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, (SubLObject)lexicon_accessors.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)lexicon_accessors.NIL;
                final SubLObject token_var = (SubLObject)lexicon_accessors.NIL;
                while (lexicon_accessors.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (lexicon_accessors.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)lexicon_accessors.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.$kw56$TRUE, (SubLObject)lexicon_accessors.NIL);
                            SubLObject done_var_$261 = (SubLObject)lexicon_accessors.NIL;
                            final SubLObject token_var_$262 = (SubLObject)lexicon_accessors.NIL;
                            while (lexicon_accessors.NIL == done_var_$261) {
                                final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$262);
                                final SubLObject valid_$263 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$262.eql(as));
                                if (lexicon_accessors.NIL != valid_$263 && assertions_high.gaf_arg2(as).equal(pos) && assertions_high.gaf_arg3(as).equal(v_int)) {
                                    final SubLObject item_var = assertions_high.gaf_arg4(as);
                                    if (lexicon_accessors.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)lexicon_accessors.EQL), Symbols.symbol_function((SubLObject)lexicon_accessors.IDENTITY))) {
                                        ans = (SubLObject)ConsesLow.cons(item_var, ans);
                                    }
                                }
                                done_var_$261 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$263);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$264 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (lexicon_accessors.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$264, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 88922L)
    public static SubLObject frames_of_sense_by_mt(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = lexicon_accessors.$const238$subcatFrame;
            if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, (SubLObject)lexicon_accessors.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, (SubLObject)lexicon_accessors.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)lexicon_accessors.NIL;
                final SubLObject token_var = (SubLObject)lexicon_accessors.NIL;
                while (lexicon_accessors.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (lexicon_accessors.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)lexicon_accessors.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.$kw56$TRUE, (SubLObject)lexicon_accessors.NIL);
                            SubLObject done_var_$265 = (SubLObject)lexicon_accessors.NIL;
                            final SubLObject token_var_$266 = (SubLObject)lexicon_accessors.NIL;
                            while (lexicon_accessors.NIL == done_var_$265) {
                                final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$266);
                                final SubLObject valid_$267 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$266.eql(as));
                                if (lexicon_accessors.NIL != valid_$267 && assertions_high.gaf_arg2(as).equal(pos) && assertions_high.gaf_arg3(as).equal(v_int)) {
                                    final SubLObject item_var = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg4(as), assertions_high.assertion_mt(as));
                                    if (lexicon_accessors.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)lexicon_accessors.EQL), Symbols.symbol_function((SubLObject)lexicon_accessors.IDENTITY))) {
                                        ans = (SubLObject)ConsesLow.cons(item_var, ans);
                                    }
                                }
                                done_var_$265 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$267);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$268 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (lexicon_accessors.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$268, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 89531L)
    public static SubLObject politeness_of_ws_pred() {
        return lexicon_accessors.$const242$politenessOfWS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 89601L)
    public static SubLObject formality_of_ws_pred() {
        return lexicon_accessors.$const243$formalityOfWS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 89669L)
    public static SubLObject politeness_levels_of_assertion(final SubLObject assertion, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = assertions_high.assertion_mt(assertion);
        }
        return (SubLObject)((lexicon_accessors.NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) ? backward.removal_ask_variable((SubLObject)lexicon_accessors.$sym244$_LEVEL, (SubLObject)ConsesLow.listS(politeness_of_ws_pred(), assertion, (SubLObject)lexicon_accessors.$list245), mt, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED) : lexicon_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 89967L)
    public static SubLObject formality_levels_of_assertion(final SubLObject assertion, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = assertions_high.assertion_mt(assertion);
        }
        return (SubLObject)((lexicon_accessors.NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) ? backward.removal_ask_variable((SubLObject)lexicon_accessors.$sym244$_LEVEL, (SubLObject)ConsesLow.listS(formality_of_ws_pred(), assertion, (SubLObject)lexicon_accessors.$list245), mt, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED) : lexicon_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 90262L)
    public static SubLObject potentially_offensive_politeness_levelP(final SubLObject level) {
        return subl_promotions.memberP(level, (SubLObject)lexicon_accessors.$list246, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 90617L)
    public static SubLObject includes_potentially_offensive_politeness_levelP(final SubLObject politeness_levels) {
        return list_utilities.sublisp_boolean(Sequences.find_if((SubLObject)lexicon_accessors.$sym247$POTENTIALLY_OFFENSIVE_POLITENESS_LEVEL_, politeness_levels, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 90988L)
    public static SubLObject potentially_offensive_lexical_assertionP(final SubLObject assertion) {
        final SubLObject politeness_levels = politeness_levels_of_assertion(assertion, (SubLObject)lexicon_accessors.UNPROVIDED);
        return includes_potentially_offensive_politeness_levelP(politeness_levels);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 91553L)
    public static SubLObject slang_lexical_assertionP(final SubLObject assertion) {
        return subl_promotions.memberP(lexicon_accessors.$const248$SlangSpeech, formality_levels_of_assertion(assertion, (SubLObject)lexicon_accessors.UNPROVIDED), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 91759L)
    public static SubLObject archaic_lexical_assertionP(final SubLObject assertion) {
        return subl_promotions.memberP(lexicon_accessors.$const249$ArchaicSpeech, formality_levels_of_assertion(assertion, (SubLObject)lexicon_accessors.UNPROVIDED), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 91970L)
    public static SubLObject clear_indirect_lexical_assertionP() {
        final SubLObject cs = lexicon_accessors.$indirect_lexical_assertionP_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 91970L)
    public static SubLObject remove_indirect_lexical_assertionP(final SubLObject assertion) {
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_accessors.$indirect_lexical_assertionP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(assertion), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 91970L)
    public static SubLObject indirect_lexical_assertionP_internal(final SubLObject assertion) {
        return isa.isaP(cycl_utilities.formula_arg0(assertion), lexicon_accessors.$const251$DenotationPredicate_ExcludedFromN, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 91970L)
    public static SubLObject indirect_lexical_assertionP(final SubLObject assertion) {
        SubLObject caching_state = lexicon_accessors.$indirect_lexical_assertionP_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_accessors.$sym250$INDIRECT_LEXICAL_ASSERTION_, (SubLObject)lexicon_accessors.$sym252$_INDIRECT_LEXICAL_ASSERTION__CACHING_STATE_, (SubLObject)lexicon_accessors.NIL, (SubLObject)lexicon_accessors.EQL, (SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)lexicon_accessors.$sym253$CLEAR_INDIRECT_LEXICAL_ASSERTION_);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(indirect_lexical_assertionP_internal(assertion)));
            memoization_state.caching_state_put(caching_state, assertion, results, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 92268L)
    public static SubLObject inappropriate_lexical_assertionP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (lexicon_accessors.NIL != lexicon_vars.$exclude_vulgaritiesP$.getDynamicValue(thread) && lexicon_accessors.NIL != potentially_offensive_lexical_assertionP(assertion)) {
            return (SubLObject)lexicon_accessors.T;
        }
        if (lexicon_accessors.NIL != lexicon_vars.$exclude_slangP$.getDynamicValue(thread) && lexicon_accessors.NIL != slang_lexical_assertionP(assertion)) {
            return (SubLObject)lexicon_accessors.T;
        }
        if (lexicon_accessors.NIL != lexicon_vars.$exclude_archaic_speechP$.getDynamicValue(thread) && lexicon_accessors.NIL != archaic_lexical_assertionP(assertion)) {
            return (SubLObject)lexicon_accessors.T;
        }
        if (lexicon_accessors.NIL != lexicon_vars.$exclude_indirect_relationsP$.getDynamicValue(thread) && lexicon_accessors.NIL != indirect_lexical_assertionP(assertion)) {
            return (SubLObject)lexicon_accessors.T;
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 92817L)
    public static SubLObject gather_denotation_assertions(final SubLObject word, final SubLObject speech_part, final SubLObject sense_num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denot_assertions = (SubLObject)lexicon_accessors.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_accessors.$sym19$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(lexicon_accessors.$const20$EverythingPSC, thread);
            SubLObject cdolist_list_var = determine_denotation_preds((SubLObject)lexicon_accessors.$kw132$ANY);
            SubLObject pred = (SubLObject)lexicon_accessors.NIL;
            pred = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$269 = kb_mapping.gather_gaf_arg_index(word, (SubLObject)lexicon_accessors.ONE_INTEGER, pred, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                SubLObject assertion = (SubLObject)lexicon_accessors.NIL;
                assertion = cdolist_list_var_$269.first();
                while (lexicon_accessors.NIL != cdolist_list_var_$269) {
                    if (lexicon_accessors.NIL != assertions_high.gaf_assertionP(assertion) && lexicon_accessors.NIL != kb_utilities.kbeq(assertion_pos(assertion), speech_part) && lexicon_accessors.NIL != kb_utilities.kbeq(assertion_sense_num(assertion), sense_num)) {
                        denot_assertions = (SubLObject)ConsesLow.cons(assertion, denot_assertions);
                    }
                    cdolist_list_var_$269 = cdolist_list_var_$269.rest();
                    assertion = cdolist_list_var_$269.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return denot_assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 93607L)
    public static SubLObject potentially_offensive_senseP(final SubLObject word, final SubLObject speech_part, final SubLObject sense) {
        assert lexicon_accessors.NIL != forts.fort_p(word) : word;
        assert lexicon_accessors.NIL != speech_partP(speech_part, (SubLObject)lexicon_accessors.UNPROVIDED) : speech_part;
        assert lexicon_accessors.NIL != Types.integerp(sense) : sense;
        SubLObject offensiveP = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL == offensiveP) {
            SubLObject csome_list_var;
            SubLObject assertion;
            for (csome_list_var = gather_denotation_assertions(word, speech_part, sense), assertion = (SubLObject)lexicon_accessors.NIL, assertion = csome_list_var.first(); lexicon_accessors.NIL == offensiveP && lexicon_accessors.NIL != csome_list_var; offensiveP = potentially_offensive_lexical_assertionP(assertion), csome_list_var = csome_list_var.rest(), assertion = csome_list_var.first()) {}
        }
        return offensiveP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 94161L)
    public static SubLObject inappropriate_senseP(final SubLObject word, final SubLObject speech_part, final SubLObject sense) {
        assert lexicon_accessors.NIL != forts.fort_p(word) : word;
        assert lexicon_accessors.NIL != speech_partP(speech_part, (SubLObject)lexicon_accessors.UNPROVIDED) : speech_part;
        assert lexicon_accessors.NIL != Types.integerp(sense) : sense;
        if (lexicon_accessors.NIL == lexicon_vars.lexicon_filters()) {
            return (SubLObject)lexicon_accessors.NIL;
        }
        SubLObject inappropriateP = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL == inappropriateP) {
            SubLObject csome_list_var;
            SubLObject assertion;
            for (csome_list_var = gather_denotation_assertions(word, speech_part, sense), assertion = (SubLObject)lexicon_accessors.NIL, assertion = csome_list_var.first(); lexicon_accessors.NIL == inappropriateP && lexicon_accessors.NIL != csome_list_var; inappropriateP = inappropriate_lexical_assertionP(assertion), csome_list_var = csome_list_var.rest(), assertion = csome_list_var.first()) {}
        }
        return inappropriateP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 94882L)
    public static SubLObject semtrans_of_ws(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int) {
        assert lexicon_accessors.NIL != forts.fort_p(word_unit) : word_unit;
        assert lexicon_accessors.NIL != speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED) : pos;
        assert lexicon_accessors.NIL != Types.integerp(v_int) : v_int;
        return semtrans_lookup_int(word_unit, pos, v_int, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 95322L)
    public static SubLObject semtrans_of_wuXpos(final SubLObject word_unit, final SubLObject pos, SubLObject frame) {
        if (frame == lexicon_accessors.UNPROVIDED) {
            frame = (SubLObject)lexicon_accessors.NIL;
        }
        assert lexicon_accessors.NIL != forts.fort_p(word_unit) : word_unit;
        assert lexicon_accessors.NIL != speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED) : pos;
        return semtrans_lookup_int(word_unit, pos, (SubLObject)lexicon_accessors.NIL, frame);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 95747L)
    public static SubLObject semtrans_lookup_int(final SubLObject word_unit, final SubLObject pos, final SubLObject v_int, SubLObject frame) {
        if (frame == lexicon_accessors.UNPROVIDED) {
            frame = (SubLObject)lexicon_accessors.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = pos_to_semtrans_pred(pos, (SubLObject)lexicon_accessors.UNPROVIDED);
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL != pred) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject pred_var = pred;
                if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, (SubLObject)lexicon_accessors.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, (SubLObject)lexicon_accessors.NIL, pred_var);
                    SubLObject done_var = (SubLObject)lexicon_accessors.NIL;
                    final SubLObject token_var = (SubLObject)lexicon_accessors.NIL;
                    while (lexicon_accessors.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (lexicon_accessors.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)lexicon_accessors.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.$kw56$TRUE, (SubLObject)lexicon_accessors.NIL);
                                SubLObject done_var_$270 = (SubLObject)lexicon_accessors.NIL;
                                final SubLObject token_var_$271 = (SubLObject)lexicon_accessors.NIL;
                                while (lexicon_accessors.NIL == done_var_$270) {
                                    final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$271);
                                    final SubLObject valid_$272 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$271.eql(as));
                                    if (lexicon_accessors.NIL != valid_$272) {
                                        final SubLObject as_sense = assertions_high.gaf_arg2(as);
                                        final SubLObject as_frame = assertions_high.gaf_arg3(as);
                                        if ((lexicon_accessors.NIL == v_int || lexicon_accessors.NIL != kb_utilities.kbeq(as_sense, v_int)) && (lexicon_accessors.NIL == frame || lexicon_accessors.NIL != kb_utilities.kbeq(as_frame, frame)) && lexicon_accessors.NIL == inappropriate_lexical_assertionP(as) && lexicon_accessors.NIL == inappropriate_senseP(word_unit, pos, as_sense)) {
                                            final SubLObject semtransarg = lexicon_utilities.semtrans_arg_of_pred_cached(pred);
                                            final SubLObject template = semtrans_template_from_assertion(as, semtransarg);
                                            final SubLObject item_var = narts_high.nart_substitute(template);
                                            if (lexicon_accessors.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)lexicon_accessors.EQL), Symbols.symbol_function((SubLObject)lexicon_accessors.IDENTITY))) {
                                                ans = (SubLObject)ConsesLow.cons(item_var, ans);
                                            }
                                        }
                                    }
                                    done_var_$270 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$272);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$273 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (lexicon_accessors.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$273, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid);
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 97266L)
    public static SubLObject semtrans_template_from_assertion(final SubLObject as, SubLObject semtrans_arg) {
        if (semtrans_arg == lexicon_accessors.UNPROVIDED) {
            semtrans_arg = (SubLObject)lexicon_accessors.NIL;
        }
        assert lexicon_accessors.NIL != assertions_high.gaf_assertionP(as) : as;
        if (lexicon_accessors.NIL == semtrans_arg) {
            final SubLObject pred = assertions_high.gaf_arg0(as);
            semtrans_arg = lexicon_utilities.semtrans_arg_of_pred_cached(pred);
        }
        final SubLObject raw_template = assertions_high.gaf_arg(as, semtrans_arg);
        return (lexicon_accessors.NIL != el_utilities.el_formula_with_operator_p(raw_template, lexicon_accessors.$const256$Quote)) ? cycl_utilities.formula_arg1(raw_template, (SubLObject)lexicon_accessors.UNPROVIDED) : raw_template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 97845L)
    public static SubLObject semtrans_sentence_infer(final SubLObject word_unit, final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject templates = (SubLObject)lexicon_accessors.NIL;
        final SubLObject semtrans_pred = pos_to_semtrans_pred(pos, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (lexicon_accessors.NIL != kb_indexing_datastructures.indexed_term_p(semtrans_pred) && lexicon_accessors.NIL == semtrans_assertion_lookup(word_unit, pos, (SubLObject)lexicon_accessors.UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject denots = denots_of_word(word_unit, pos);
            final SubLObject senses = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject denot = (SubLObject)lexicon_accessors.NIL;
            SubLObject denot_$274 = (SubLObject)lexicon_accessors.NIL;
            SubLObject sense = (SubLObject)lexicon_accessors.NIL;
            SubLObject sense_$275 = (SubLObject)lexicon_accessors.NIL;
            denot = denots;
            denot_$274 = denot.first();
            sense = senses;
            sense_$275 = sense.first();
            while (lexicon_accessors.NIL != sense || lexicon_accessors.NIL != denot) {
                SubLObject cdolist_list_var = frames_of_sense(word_unit, pos, sense_$275, (SubLObject)lexicon_accessors.UNPROVIDED);
                SubLObject frame = (SubLObject)lexicon_accessors.NIL;
                frame = cdolist_list_var.first();
                while (lexicon_accessors.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$276 = psp_semantics.psp_devise_word_templates(word_unit, pos, (SubLObject)ConsesLow.list(denot_$274), (SubLObject)ConsesLow.list(frame));
                    SubLObject template = (SubLObject)lexicon_accessors.NIL;
                    template = cdolist_list_var_$276.first();
                    while (lexicon_accessors.NIL != cdolist_list_var_$276) {
                        final SubLObject args = (SubLObject)ConsesLow.list(word_unit, sense_$275, frame, template);
                        final SubLObject item_var;
                        final SubLObject semtrans_sentence = item_var = el_utilities.make_el_formula(semtrans_pred, args, (SubLObject)lexicon_accessors.UNPROVIDED);
                        if (lexicon_accessors.NIL == conses_high.member(item_var, templates, Symbols.symbol_function((SubLObject)lexicon_accessors.EQUAL), Symbols.symbol_function((SubLObject)lexicon_accessors.IDENTITY))) {
                            templates = (SubLObject)ConsesLow.cons(item_var, templates);
                        }
                        cdolist_list_var_$276 = cdolist_list_var_$276.rest();
                        template = cdolist_list_var_$276.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    frame = cdolist_list_var.first();
                }
                denot = denot.rest();
                denot_$274 = denot.first();
                sense = sense.rest();
                sense_$275 = sense.first();
            }
        }
        return templates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 98804L)
    public static SubLObject denots_of_word(final SubLObject word_unit, SubLObject pos) {
        if (pos == lexicon_accessors.UNPROVIDED) {
            pos = (SubLObject)lexicon_accessors.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denots = (SubLObject)lexicon_accessors.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = lexicon_accessors.$const234$denotation;
            if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, (SubLObject)lexicon_accessors.NIL, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, (SubLObject)lexicon_accessors.NIL, pred_var);
                SubLObject done_var = (SubLObject)lexicon_accessors.NIL;
                final SubLObject token_var = (SubLObject)lexicon_accessors.NIL;
                while (lexicon_accessors.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (lexicon_accessors.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)lexicon_accessors.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.$kw56$TRUE, (SubLObject)lexicon_accessors.NIL);
                            SubLObject done_var_$277 = (SubLObject)lexicon_accessors.NIL;
                            final SubLObject token_var_$278 = (SubLObject)lexicon_accessors.NIL;
                            while (lexicon_accessors.NIL == done_var_$277) {
                                final SubLObject denot_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$278);
                                final SubLObject valid_$279 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$278.eql(denot_as));
                                if (lexicon_accessors.NIL != valid_$279 && (lexicon_accessors.NIL == pos || lexicon_accessors.NIL != genl_posP(assertions_high.gaf_arg2(denot_as), pos, (SubLObject)lexicon_accessors.UNPROVIDED))) {
                                    final SubLObject item_var = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg4(denot_as), assertions_high.gaf_arg3(denot_as));
                                    if (lexicon_accessors.NIL == conses_high.member(item_var, denots, Symbols.symbol_function((SubLObject)lexicon_accessors.EQUAL), Symbols.symbol_function((SubLObject)lexicon_accessors.IDENTITY))) {
                                        denots = (SubLObject)ConsesLow.cons(item_var, denots);
                                    }
                                }
                                done_var_$277 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$279);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$280 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (lexicon_accessors.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$280, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Values.values(Mapping.mapcar(Symbols.symbol_function((SubLObject)lexicon_accessors.$sym257$CAR), denots), Mapping.mapcar(Symbols.symbol_function((SubLObject)lexicon_accessors.$sym258$CDR), denots));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 99227L)
    public static SubLObject semtrans_assertion_lookup(final SubLObject word_unit, final SubLObject pos, SubLObject v_int) {
        if (v_int == lexicon_accessors.UNPROVIDED) {
            v_int = (SubLObject)lexicon_accessors.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != lexical_wordP(word_unit) : word_unit;
        assert lexicon_accessors.NIL != speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED) : pos;
        final SubLObject pred = pos_to_semtrans_pred(pos, (SubLObject)lexicon_accessors.UNPROVIDED);
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL != pred && lexicon_accessors.NIL != kb_indexing_datastructures.indexed_term_p(word_unit)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject pred_var = pred;
                if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, (SubLObject)lexicon_accessors.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, (SubLObject)lexicon_accessors.NIL, pred_var);
                    SubLObject done_var = (SubLObject)lexicon_accessors.NIL;
                    final SubLObject token_var = (SubLObject)lexicon_accessors.NIL;
                    while (lexicon_accessors.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (lexicon_accessors.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)lexicon_accessors.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.$kw56$TRUE, (SubLObject)lexicon_accessors.NIL);
                                SubLObject done_var_$281 = (SubLObject)lexicon_accessors.NIL;
                                final SubLObject token_var_$282 = (SubLObject)lexicon_accessors.NIL;
                                while (lexicon_accessors.NIL == done_var_$281) {
                                    final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$282);
                                    final SubLObject valid_$283 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$282.eql(as));
                                    if (lexicon_accessors.NIL != valid_$283) {
                                        final SubLObject as_sense = assertions_high.gaf_arg2(as);
                                        if ((lexicon_accessors.NIL == v_int || lexicon_accessors.NIL != kb_utilities.kbeq(as_sense, v_int)) && lexicon_accessors.NIL == inappropriate_lexical_assertionP(as) && lexicon_accessors.NIL == inappropriate_senseP(word_unit, pos, as_sense)) {
                                            final SubLObject item_var = as;
                                            if (lexicon_accessors.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)lexicon_accessors.EQL), Symbols.symbol_function((SubLObject)lexicon_accessors.IDENTITY))) {
                                                ans = (SubLObject)ConsesLow.cons(item_var, ans);
                                            }
                                        }
                                    }
                                    done_var_$281 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$283);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$284 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (lexicon_accessors.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$284, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid);
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 100247L)
    public static SubLObject all_semtrans_assertions(final SubLObject word_unit, final SubLObject pos, SubLObject v_int) {
        if (v_int == lexicon_accessors.UNPROVIDED) {
            v_int = (SubLObject)lexicon_accessors.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_accessors.NIL != forts.fort_p(word_unit) : word_unit;
        assert lexicon_accessors.NIL != speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED) : pos;
        SubLObject assertions = (SubLObject)lexicon_accessors.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$exclude_vulgaritiesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = lexicon_vars.$exclude_slangP$.currentBinding(thread);
        try {
            lexicon_vars.$exclude_vulgaritiesP$.bind((SubLObject)lexicon_accessors.NIL, thread);
            lexicon_vars.$exclude_slangP$.bind((SubLObject)lexicon_accessors.NIL, thread);
            assertions = semtrans_assertion_lookup(word_unit, pos, v_int);
        }
        finally {
            lexicon_vars.$exclude_slangP$.rebind(_prev_bind_2, thread);
            lexicon_vars.$exclude_vulgaritiesP$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 100672L)
    public static SubLObject preposition_of_frame(final SubLObject prep_frame) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = (SubLObject)((lexicon_accessors.NIL != isa.isaP(prep_frame, lexicon_accessors.$const259$TransitivePPFrameType, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED) || lexicon_accessors.NIL != isa.isaP(prep_frame, lexicon_accessors.$const260$DitransitivePPFrameType, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED)) ? lexicon_cache.words_of_string(string_utilities.string_after(constants_high.constant_name(prep_frame), (SubLObject)Characters.CHAR_hyphen), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED) : lexicon_accessors.NIL);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 101071L)
    public static SubLObject assertion_denotation(final SubLObject as) {
        final SubLObject pred = assertions_high.gaf_arg0(as);
        final SubLObject denot_arg = lexicon_utilities.denotatum_arg_of_pred_cached(pred);
        return (SubLObject)((lexicon_accessors.NIL != denot_arg) ? assertions_high.gaf_arg(as, denot_arg) : lexicon_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 101430L)
    public static SubLObject assertion_pos(final SubLObject as) {
        final SubLObject pred = assertions_high.gaf_arg0(as);
        final SubLObject pos_arg = lexicon_utilities.pos_arg_of_pred_cached(pred);
        return (SubLObject)((lexicon_accessors.NIL != pos_arg) ? assertions_high.gaf_arg(as, pos_arg) : lexicon_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 101701L)
    public static SubLObject assertion_sense_num(final SubLObject assertion) {
        final SubLObject pred = assertions_high.gaf_arg0(assertion);
        final SubLObject pos_arg = lexicon_utilities.pos_arg_of_pred_cached(pred);
        final SubLObject sense_arg = (SubLObject)((lexicon_accessors.NIL != pos_arg) ? number_utilities.f_1X(pos_arg) : lexicon_accessors.NIL);
        final SubLObject sense_num = (SubLObject)((lexicon_accessors.NIL != sense_arg) ? assertions_high.gaf_arg(assertion, sense_arg) : lexicon_accessors.NIL);
        return (SubLObject)(sense_num.isInteger() ? sense_num : lexicon_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 102320L)
    public static SubLObject clear_agr_of_det_string() {
        final SubLObject cs = lexicon_accessors.$agr_of_det_string_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 102320L)
    public static SubLObject remove_agr_of_det_string(final SubLObject string) {
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_accessors.$agr_of_det_string_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(string), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 102320L)
    public static SubLObject agr_of_det_string_internal(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (string.equal((SubLObject)lexicon_accessors.$str200$)) {
            return (SubLObject)lexicon_accessors.$list262;
        }
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        SubLObject cdolist_list_var = lexicon_cache.words_of_string(string, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
        SubLObject word = (SubLObject)lexicon_accessors.NIL;
        word = cdolist_list_var.first();
        while (lexicon_accessors.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$285 = agreement_lookup(word);
            SubLObject pos_pred = (SubLObject)lexicon_accessors.NIL;
            pos_pred = cdolist_list_var_$285.first();
            while (lexicon_accessors.NIL != cdolist_list_var_$285) {
                ans = (SubLObject)ConsesLow.cons(pos_pred, ans);
                cdolist_list_var_$285 = cdolist_list_var_$285.rest();
                pos_pred = cdolist_list_var_$285.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject nearest_common_genl_preds = speech_part_pred_min_ceilings(ans, (SubLObject)lexicon_accessors.UNPROVIDED);
            ans = ((lexicon_accessors.NIL != nearest_common_genl_preds) ? nearest_common_genl_preds : ans);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 102320L)
    public static SubLObject agr_of_det_string(final SubLObject string) {
        SubLObject caching_state = lexicon_accessors.$agr_of_det_string_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_accessors.$sym261$AGR_OF_DET_STRING, (SubLObject)lexicon_accessors.$sym263$_AGR_OF_DET_STRING_CACHING_STATE_, (SubLObject)lexicon_accessors.$int134$64, (SubLObject)lexicon_accessors.EQUALP, (SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.SIXTEEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(agr_of_det_string_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 102884L)
    public static SubLObject agreement_lookup(final SubLObject word_unit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL != kb_indexing_datastructures.indexed_term_p(word_unit)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                ans = kb_mapping_utilities.pred_values(word_unit, lexicon_accessors.$const264$determinerAgreement, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 103223L)
    public static SubLObject denot_ws_lookup(final SubLObject word_unit, final SubLObject speech_part, SubLObject denot_type) {
        if (denot_type == lexicon_accessors.UNPROVIDED) {
            denot_type = (SubLObject)lexicon_accessors.$kw172$DENOT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject denot_preds = determine_denotation_preds(denot_type);
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        SubLObject cdolist_list_var = denot_preds;
        SubLObject denot_pred = (SubLObject)lexicon_accessors.NIL;
        denot_pred = cdolist_list_var.first();
        while (lexicon_accessors.NIL != cdolist_list_var) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject pred_var = denot_pred;
                if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word_unit, (SubLObject)lexicon_accessors.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word_unit, (SubLObject)lexicon_accessors.NIL, pred_var);
                    SubLObject done_var = (SubLObject)lexicon_accessors.NIL;
                    final SubLObject token_var = (SubLObject)lexicon_accessors.NIL;
                    while (lexicon_accessors.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (lexicon_accessors.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)lexicon_accessors.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.$kw56$TRUE, (SubLObject)lexicon_accessors.NIL);
                                SubLObject done_var_$286 = (SubLObject)lexicon_accessors.NIL;
                                final SubLObject token_var_$287 = (SubLObject)lexicon_accessors.NIL;
                                while (lexicon_accessors.NIL == done_var_$286) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$287);
                                    final SubLObject valid_$288 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$287.eql(ass));
                                    if (lexicon_accessors.NIL != valid_$288 && lexicon_accessors.NIL != kb_utilities.kbeq(speech_part, assertions_high.gaf_arg2(ass))) {
                                        final SubLObject item_var = assertions_high.gaf_arg3(ass);
                                        if (lexicon_accessors.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)lexicon_accessors.EQL), Symbols.symbol_function((SubLObject)lexicon_accessors.IDENTITY))) {
                                            ans = (SubLObject)ConsesLow.cons(item_var, ans);
                                        }
                                    }
                                    done_var_$286 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$288);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$289 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (lexicon_accessors.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$289, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid);
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            denot_pred = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 103931L)
    public static SubLObject pos_to_semtrans_pred(final SubLObject pos, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (lexicon_accessors.NIL == speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED)) {
            return (SubLObject)lexicon_accessors.NIL;
        }
        return pos_to_semtrans_pred_cached(pos, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 104254L)
    public static SubLObject clear_pos_to_semtrans_pred_cached() {
        final SubLObject cs = lexicon_accessors.$pos_to_semtrans_pred_cached_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 104254L)
    public static SubLObject remove_pos_to_semtrans_pred_cached(final SubLObject pos, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_accessors.$pos_to_semtrans_pred_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pos, mt), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 104254L)
    public static SubLObject pos_to_semtrans_pred_cached_internal(final SubLObject pos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = kb_mapping_utilities.fpred_value(pos, lexicon_accessors.$const266$semTransPredForPOS, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
            if (lexicon_accessors.NIL == ans) {
                SubLObject csome_list_var;
                SubLObject genl_pos;
                for (csome_list_var = kb_mapping_utilities.pred_values(pos, lexicon_accessors.$const55$genls, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED), genl_pos = (SubLObject)lexicon_accessors.NIL, genl_pos = csome_list_var.first(); lexicon_accessors.NIL == ans && lexicon_accessors.NIL != csome_list_var; ans = pos_to_semtrans_pred(genl_pos, mt), csome_list_var = csome_list_var.rest(), genl_pos = csome_list_var.first()) {}
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 104254L)
    public static SubLObject pos_to_semtrans_pred_cached(final SubLObject pos, final SubLObject mt) {
        SubLObject caching_state = lexicon_accessors.$pos_to_semtrans_pred_cached_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_accessors.$sym265$POS_TO_SEMTRANS_PRED_CACHED, (SubLObject)lexicon_accessors.$sym267$_POS_TO_SEMTRANS_PRED_CACHED_CACHING_STATE_, (SubLObject)lexicon_accessors.$int134$64, (SubLObject)lexicon_accessors.EQUAL, (SubLObject)lexicon_accessors.TWO_INTEGER, (SubLObject)lexicon_accessors.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)lexicon_accessors.$sym268$CLEAR_POS_TO_SEMTRANS_PRED_CACHED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pos, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)lexicon_accessors.NIL;
            collision = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pos.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (lexicon_accessors.NIL != cached_args && lexicon_accessors.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pos_to_semtrans_pred_cached_internal(pos, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pos, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 104643L)
    public static SubLObject clear_semtrans_pred_to_pos() {
        final SubLObject cs = lexicon_accessors.$semtrans_pred_to_pos_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 104643L)
    public static SubLObject remove_semtrans_pred_to_pos(final SubLObject pred, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_accessors.$semtrans_pred_to_pos_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred, mt), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 104643L)
    public static SubLObject semtrans_pred_to_pos_internal(final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = Sort.sort(kb_mapping_utilities.pred_values(pred, lexicon_accessors.$const266$semTransPredForPOS, (SubLObject)lexicon_accessors.TWO_INTEGER, (SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.UNPROVIDED), Symbols.symbol_function((SubLObject)lexicon_accessors.$sym100$SPEC_), (SubLObject)lexicon_accessors.UNPROVIDED).first();
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 104643L)
    public static SubLObject semtrans_pred_to_pos(final SubLObject pred, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = lexicon_accessors.$semtrans_pred_to_pos_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_accessors.$sym269$SEMTRANS_PRED_TO_POS, (SubLObject)lexicon_accessors.$sym270$_SEMTRANS_PRED_TO_POS_CACHING_STATE_, (SubLObject)lexicon_accessors.$int35$128, (SubLObject)lexicon_accessors.EQUAL, (SubLObject)lexicon_accessors.TWO_INTEGER, (SubLObject)lexicon_accessors.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)lexicon_accessors.NIL;
            collision = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (lexicon_accessors.NIL != cached_args && lexicon_accessors.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(semtrans_pred_to_pos_internal(pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 105084L)
    public static SubLObject nicknames_of_name(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = kb_mapping_utilities.pred_values(name, lexicon_accessors.$const271$commonNickname, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 105558L)
    public static SubLObject spellings_of_name(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = kb_mapping_utilities.pred_values(name, lexicon_accessors.$const272$nameSpelling, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 105945L)
    public static SubLObject argn_is_speech_partP(final SubLObject reln, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_accessors.$sym19$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(lexicon_accessors.$const20$EverythingPSC, thread);
            ans = subl_promotions.memberP(lexicon_accessors.$const273$SpeechPart, kb_accessors.argn_isa(reln, n, (SubLObject)lexicon_accessors.UNPROVIDED), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 106353L)
    public static SubLObject speech_parts_initializedP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL != dictionary.dictionary_p(lexicon_accessors.$speech_parts$.getGlobalValue()) && lexicon_accessors.NIL == dictionary.dictionary_empty_p(lexicon_accessors.$speech_parts$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 106496L)
    public static SubLObject clear_speech_parts() {
        if (lexicon_accessors.NIL == dictionary.dictionary_p(lexicon_accessors.$speech_parts$.getGlobalValue())) {
            lexicon_accessors.$speech_parts$.setGlobalValue(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)lexicon_accessors.EQL), (SubLObject)lexicon_accessors.$int40$256));
        }
        clear_cached_lexical_access_functions();
        return dictionary.clear_dictionary(lexicon_accessors.$speech_parts$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 106718L)
    public static SubLObject initialize_speech_parts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_speech_parts();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_accessors.$sym19$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(lexicon_accessors.$const20$EverythingPSC, thread);
            if (lexicon_accessors.NIL != constant_handles.valid_constantP(lexicon_accessors.$const273$SpeechPart, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                SubLObject node_var = lexicon_accessors.$const273$SpeechPart;
                final SubLObject deck_type = (SubLObject)lexicon_accessors.$kw46$STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$290 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)lexicon_accessors.NIL;
                        final SubLObject _prev_bind_0_$291 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$292 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((lexicon_accessors.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((lexicon_accessors.NIL != tv_var) ? lexicon_accessors.$sym47$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (lexicon_accessors.NIL != tv_var && lexicon_accessors.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && lexicon_accessors.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)lexicon_accessors.$kw48$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)lexicon_accessors.$kw51$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)lexicon_accessors.ONE_INTEGER, (SubLObject)lexicon_accessors.$str52$continue_anyway, (SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)lexicon_accessors.$kw53$WARN)) {
                                    Errors.warn((SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)lexicon_accessors.$str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)lexicon_accessors.$str52$continue_anyway, (SubLObject)lexicon_accessors.$str49$_A_is_not_a__A, tv_var, (SubLObject)lexicon_accessors.$sym50$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$292 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$293 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)lexicon_accessors.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls), thread);
                                if (lexicon_accessors.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || lexicon_accessors.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(lexicon_accessors.$const273$SpeechPart, sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$293 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$294 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$297 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)lexicon_accessors.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)lexicon_accessors.UNPROVIDED);
                                        while (lexicon_accessors.NIL != node_var) {
                                            final SubLObject sp_type = node_var;
                                            final SubLObject pred_var = lexicon_accessors.$const77$isa;
                                            if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(sp_type, (SubLObject)lexicon_accessors.TWO_INTEGER, pred_var)) {
                                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(sp_type, (SubLObject)lexicon_accessors.TWO_INTEGER, pred_var);
                                                SubLObject done_var = (SubLObject)lexicon_accessors.NIL;
                                                final SubLObject token_var = (SubLObject)lexicon_accessors.NIL;
                                                while (lexicon_accessors.NIL == done_var) {
                                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                    if (lexicon_accessors.NIL != valid) {
                                                        SubLObject final_index_iterator = (SubLObject)lexicon_accessors.NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.$kw56$TRUE, (SubLObject)lexicon_accessors.NIL);
                                                            SubLObject done_var_$298 = (SubLObject)lexicon_accessors.NIL;
                                                            final SubLObject token_var_$299 = (SubLObject)lexicon_accessors.NIL;
                                                            while (lexicon_accessors.NIL == done_var_$298) {
                                                                final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$299);
                                                                final SubLObject valid_$300 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$299.eql(as));
                                                                if (lexicon_accessors.NIL != valid_$300) {
                                                                    final SubLObject sp = assertions_high.gaf_arg1(as);
                                                                    final SubLObject mt = assertions_high.assertion_mt(as);
                                                                    dictionary_utilities.dictionary_push(lexicon_accessors.$speech_parts$.getGlobalValue(), sp, mt);
                                                                }
                                                                done_var_$298 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$300);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$294 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                                                final SubLObject _values = Values.getValuesAsVector();
                                                                if (lexicon_accessors.NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                                Values.restoreValuesFromVector(_values);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$294, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid);
                                                }
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(lexicon_accessors.$const55$genls));
                                            SubLObject module_var = (SubLObject)lexicon_accessors.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (lexicon_accessors.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$295 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$295 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((lexicon_accessors.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (lexicon_accessors.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED));
                                                        if (lexicon_accessors.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED));
                                                            if (lexicon_accessors.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); lexicon_accessors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (lexicon_accessors.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$296 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            SubLObject iteration_state_$305;
                                                                            for (iteration_state_$305 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); lexicon_accessors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$305); iteration_state_$305 = dictionary_contents.do_dictionary_contents_next(iteration_state_$305)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$305);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (lexicon_accessors.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$297 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (lexicon_accessors.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)lexicon_accessors.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); lexicon_accessors.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (lexicon_accessors.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)lexicon_accessors.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (lexicon_accessors.NIL != csome_list_var) {
                                                                                                if (lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)lexicon_accessors.$str57$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$297, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$305);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$296, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)lexicon_accessors.FIVE_INTEGER, (SubLObject)lexicon_accessors.$str58$attempting_to_bind_direction_link, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (lexicon_accessors.NIL != obsolete.cnat_p(node, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$307;
                                                        final SubLObject new_list = cdolist_list_var_$307 = ((lexicon_accessors.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)lexicon_accessors.NIL;
                                                        generating_fn = cdolist_list_var_$307.first();
                                                        while (lexicon_accessors.NIL != cdolist_list_var_$307) {
                                                            final SubLObject _prev_bind_0_$298 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (lexicon_accessors.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)lexicon_accessors.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); lexicon_accessors.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (lexicon_accessors.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)lexicon_accessors.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (lexicon_accessors.NIL != csome_list_var2) {
                                                                        if (lexicon_accessors.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)lexicon_accessors.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)lexicon_accessors.$str57$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$298, thread);
                                                            }
                                                            cdolist_list_var_$307 = cdolist_list_var_$307.rest();
                                                            generating_fn = cdolist_list_var_$307.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$295, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$295, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$297, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$294, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$293, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)lexicon_accessors.TWO_INTEGER, (SubLObject)lexicon_accessors.$str59$Node__a_does_not_pass_sbhl_type_t, lexicon_accessors.$const273$SpeechPart, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_accessors.UNPROVIDED)), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$293, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$292, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$292, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$291, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$299 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$299, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$290, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return lexicon_accessors.$speech_parts$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 107086L)
    public static SubLObject speech_partP(final SubLObject obj, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_accessors.$const1$InferencePSC;
        }
        ensure_speech_parts_initialized();
        final SubLObject mts = dictionary.dictionary_lookup_without_values(lexicon_accessors.$speech_parts$.getGlobalValue(), obj, (SubLObject)lexicon_accessors.UNPROVIDED);
        SubLObject mt_okP = kb_utilities.kbeq(mt, lexicon_accessors.$const1$InferencePSC);
        if (lexicon_accessors.NIL == mt_okP) {
            SubLObject csome_list_var;
            SubLObject ok_mt;
            for (csome_list_var = mts, ok_mt = (SubLObject)lexicon_accessors.NIL, ok_mt = csome_list_var.first(); lexicon_accessors.NIL == mt_okP && lexicon_accessors.NIL != csome_list_var; mt_okP = genl_lexicon_mtP(mt, ok_mt), csome_list_var = csome_list_var.rest(), ok_mt = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL != mts && lexicon_accessors.NIL != mt_okP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 107450L)
    public static SubLObject ensure_speech_parts_initialized() {
        if (lexicon_accessors.NIL == speech_parts_initializedP()) {
            initialize_speech_parts();
        }
        return (SubLObject)lexicon_accessors.$kw6$INITIALIZED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 107594L)
    public static SubLObject all_speech_parts(SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_accessors.$const1$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        ensure_speech_parts_initialized();
        if (lexicon_accessors.NIL != kb_utilities.kbeq(mt, lexicon_accessors.$const1$InferencePSC)) {
            return dictionary.dictionary_keys(lexicon_accessors.$speech_parts$.getGlobalValue());
        }
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lexicon_accessors.$speech_parts$.getGlobalValue())); lexicon_accessors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject sp = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject sp_mts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject mt_okP = (SubLObject)lexicon_accessors.NIL;
            if (lexicon_accessors.NIL == mt_okP) {
                SubLObject csome_list_var;
                SubLObject sp_mt;
                for (csome_list_var = sp_mts, sp_mt = (SubLObject)lexicon_accessors.NIL, sp_mt = csome_list_var.first(); lexicon_accessors.NIL == mt_okP && lexicon_accessors.NIL != csome_list_var; mt_okP = genl_lexicon_mtP(mt, sp_mt), csome_list_var = csome_list_var.rest(), sp_mt = csome_list_var.first()) {}
            }
            if (lexicon_accessors.NIL != mt_okP) {
                ans = (SubLObject)ConsesLow.cons(sp, ans);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 108049L)
    public static SubLObject clear_genl_posP() {
        final SubLObject cs = lexicon_accessors.$genl_posP_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 108049L)
    public static SubLObject remove_genl_posP(final SubLObject spec_pos, final SubLObject genl_pos, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = (SubLObject)lexicon_accessors.NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_accessors.$genl_posP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(spec_pos, genl_pos, mt), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 108049L)
    public static SubLObject genl_posP_internal(final SubLObject spec_pos, final SubLObject genl_pos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL != mt) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                result = genls.genl_ofP(genl_pos, spec_pos, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_5 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_accessors.$sym19$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(lexicon_accessors.$const20$EverythingPSC, thread);
                result = genls.genl_ofP(genl_pos, spec_pos, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_5, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 108049L)
    public static SubLObject genl_posP(final SubLObject spec_pos, final SubLObject genl_pos, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = (SubLObject)lexicon_accessors.NIL;
        }
        SubLObject caching_state = lexicon_accessors.$genl_posP_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_accessors.$sym275$GENL_POS_, (SubLObject)lexicon_accessors.$sym276$_GENL_POS__CACHING_STATE_, (SubLObject)lexicon_accessors.NIL, (SubLObject)lexicon_accessors.EQUAL, (SubLObject)lexicon_accessors.THREE_INTEGER, (SubLObject)lexicon_accessors.$int35$128);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(spec_pos, genl_pos, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)lexicon_accessors.NIL;
            collision = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (spec_pos.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (genl_pos.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (lexicon_accessors.NIL != cached_args && lexicon_accessors.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(genl_posP_internal(spec_pos, genl_pos, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(spec_pos, genl_pos, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 108497L)
    public static SubLObject genl_pos_memberP(final SubLObject spec_pos, final SubLObject pos_list) {
        SubLObject doneP = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL == doneP) {
            SubLObject csome_list_var = pos_list;
            SubLObject pos = (SubLObject)lexicon_accessors.NIL;
            pos = csome_list_var.first();
            while (lexicon_accessors.NIL == doneP && lexicon_accessors.NIL != csome_list_var) {
                if (lexicon_accessors.NIL != genl_posP(spec_pos, pos, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                    doneP = (SubLObject)lexicon_accessors.T;
                }
                csome_list_var = csome_list_var.rest();
                pos = csome_list_var.first();
            }
        }
        return doneP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 108850L)
    public static SubLObject spec_posP(final SubLObject pos1, final SubLObject pos2) {
        return genl_posP(pos2, pos1, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 108986L)
    public static SubLObject adjpP(final SubLObject pos) {
        return Equality.equalp(safe_nart_hl_formula(pos), (SubLObject)lexicon_accessors.$list278);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 109171L)
    public static SubLObject vbarP(final SubLObject pos) {
        return object_is_compositional_pos_termP(pos, lexicon_accessors.$const279$PhraseFn_Bar1, lexicon_accessors.$const142$Verb);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 109344L)
    public static SubLObject nbarP(final SubLObject pos) {
        return object_is_compositional_pos_termP(pos, lexicon_accessors.$const279$PhraseFn_Bar1, lexicon_accessors.$const36$Noun);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 109517L)
    public static SubLObject object_is_compositional_pos_termP(final SubLObject v_object, final SubLObject phrase_fn, final SubLObject genl_pos) {
        if (lexicon_accessors.NIL != narts_high.naut_p(v_object)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL != kb_utilities.kbeq(cycl_utilities.nat_functor(v_object), phrase_fn) && lexicon_accessors.NIL != genl_posP(cycl_utilities.nat_arg1(v_object, (SubLObject)lexicon_accessors.UNPROVIDED), genl_pos, (SubLObject)lexicon_accessors.UNPROVIDED));
        }
        if (lexicon_accessors.NIL != forts.fort_p(v_object)) {
            final SubLObject nart = compositional_pos_nart(phrase_fn, genl_pos);
            return (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL != nart && lexicon_accessors.NIL != genl_posP(v_object, nart, (SubLObject)lexicon_accessors.UNPROVIDED));
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 109963L)
    public static SubLObject clear_compositional_pos_nart() {
        final SubLObject cs = lexicon_accessors.$compositional_pos_nart_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 109963L)
    public static SubLObject remove_compositional_pos_nart(final SubLObject phrase_fn, final SubLObject genl_pos) {
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_accessors.$compositional_pos_nart_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(phrase_fn, genl_pos), (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 109963L)
    public static SubLObject compositional_pos_nart_internal(final SubLObject phrase_fn, final SubLObject genl_pos) {
        return narts_high.find_nart(el_utilities.make_unary_formula(phrase_fn, genl_pos));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 109963L)
    public static SubLObject compositional_pos_nart(final SubLObject phrase_fn, final SubLObject genl_pos) {
        SubLObject caching_state = lexicon_accessors.$compositional_pos_nart_caching_state$.getGlobalValue();
        if (lexicon_accessors.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_accessors.$sym280$COMPOSITIONAL_POS_NART, (SubLObject)lexicon_accessors.$sym281$_COMPOSITIONAL_POS_NART_CACHING_STATE_, (SubLObject)lexicon_accessors.NIL, (SubLObject)lexicon_accessors.EQL, (SubLObject)lexicon_accessors.TWO_INTEGER, (SubLObject)lexicon_accessors.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(phrase_fn, genl_pos);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)lexicon_accessors.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)lexicon_accessors.NIL;
            collision = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (phrase_fn.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (lexicon_accessors.NIL != cached_args && lexicon_accessors.NIL == cached_args.rest() && genl_pos.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(compositional_pos_nart_internal(phrase_fn, genl_pos)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(phrase_fn, genl_pos));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 110109L)
    public static SubLObject npP(final SubLObject pos) {
        return subl_promotions.memberP(safe_nart_hl_formula(pos), (SubLObject)lexicon_accessors.$list282, Symbols.symbol_function((SubLObject)lexicon_accessors.EQUALP), (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 110306L)
    public static SubLObject ppP(final SubLObject pos) {
        return subl_promotions.memberP(safe_nart_hl_formula(pos), (SubLObject)lexicon_accessors.$list283, Symbols.symbol_function((SubLObject)lexicon_accessors.EQUALP), (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 110528L)
    public static SubLObject safe_nart_hl_formula(final SubLObject obj) {
        return (lexicon_accessors.NIL != nart_handles.nart_p(obj)) ? narts_high.nart_hl_formula(obj) : obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 110705L)
    public static SubLObject relational_noun_denots(final SubLObject leading_strings, final SubLObject wu, final SubLObject following_strings, final SubLObject pos, SubLObject possessor, SubLObject pred, SubLObject lexical_mt, SubLObject domain_mt) {
        if (possessor == lexicon_accessors.UNPROVIDED) {
            possessor = (SubLObject)lexicon_accessors.$kw284$UNDETERMINED;
        }
        if (pred == lexicon_accessors.UNPROVIDED) {
            pred = (SubLObject)lexicon_accessors.$kw132$ANY;
        }
        if (lexical_mt == lexicon_accessors.UNPROVIDED) {
            lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (domain_mt == lexicon_accessors.UNPROVIDED) {
            domain_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        assert lexicon_accessors.NIL != Types.listp(leading_strings) : leading_strings;
        assert lexicon_accessors.NIL != forts.fort_p(wu) : wu;
        assert lexicon_accessors.NIL != Types.listp(following_strings) : following_strings;
        assert lexicon_accessors.NIL != speech_partP(pos, (SubLObject)lexicon_accessors.UNPROVIDED) : pos;
        final SubLObject preds = (SubLObject)((pred == lexicon_accessors.$kw132$ANY) ? relational_noun_preds(leading_strings, wu, following_strings, pos, lexical_mt) : ConsesLow.list(pred));
        SubLObject denots = (SubLObject)lexicon_accessors.NIL;
        if (lexicon_accessors.NIL != genl_posP(pos, lexicon_accessors.$const36$Noun, (SubLObject)lexicon_accessors.UNPROVIDED)) {
            SubLObject cdolist_list_var = preds;
            SubLObject denoted_pred = (SubLObject)lexicon_accessors.NIL;
            denoted_pred = cdolist_list_var.first();
            while (lexicon_accessors.NIL != cdolist_list_var) {
                if (lexicon_accessors.NIL != kb_accessors.binary_predicateP(denoted_pred)) {
                    SubLObject cdolist_list_var_$310;
                    final SubLObject possessed_argnums = cdolist_list_var_$310 = relational_noun_possessed_argnums(leading_strings, wu, following_strings, pos, denoted_pred, lexical_mt);
                    SubLObject possessed_argnum = (SubLObject)lexicon_accessors.NIL;
                    possessed_argnum = cdolist_list_var_$310.first();
                    while (lexicon_accessors.NIL != cdolist_list_var_$310) {
                        SubLObject template = (SubLObject)lexicon_accessors.NIL;
                        final SubLObject possessed_type = relational_noun_possessed_type(denoted_pred, possessed_argnum, domain_mt);
                        final SubLObject possessor_argnum = Numbers.subtract((SubLObject)lexicon_accessors.THREE_INTEGER, possessed_argnum);
                        final SubLObject possessor_type = (SubLObject)((possessor == lexicon_accessors.$kw284$UNDETERMINED) ? relational_noun_possessor_type(denoted_pred, possessor_argnum, domain_mt) : lexicon_accessors.NIL);
                        if (lexicon_accessors.NIL != possessed_type) {
                            if (possessor != lexicon_accessors.$kw284$UNDETERMINED) {
                                template = relational_noun_denot_template_lookup((SubLObject)lexicon_accessors.NIL, possessed_argnum);
                            }
                            else if (lexicon_accessors.NIL != possessor_type) {
                                template = relational_noun_denot_template_lookup((SubLObject)lexicon_accessors.T, possessed_argnum);
                            }
                        }
                        if (lexicon_accessors.NIL != template) {
                            final SubLObject swap_alist = (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)lexicon_accessors.$kw285$POSSESSED_TYPE, possessed_type), reader.bq_cons((SubLObject)lexicon_accessors.$kw286$DENOTED_PRED, denoted_pred), reader.bq_cons((SubLObject)lexicon_accessors.$kw287$POSSESSOR, possessor), reader.bq_cons((SubLObject)lexicon_accessors.$kw288$POSSESSOR_TYPE, possessor_type));
                            final SubLObject result = cycl_utilities.expression_sublis(swap_alist, template, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
                            denots = (SubLObject)ConsesLow.cons(result, denots);
                        }
                        cdolist_list_var_$310 = cdolist_list_var_$310.rest();
                        possessed_argnum = cdolist_list_var_$310.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                denoted_pred = cdolist_list_var.first();
            }
            return denots;
        }
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 113811L)
    public static SubLObject relational_noun_denot_template_lookup(final SubLObject type_levelP, final SubLObject possessed_argnum) {
        return list_utilities.alist_lookup(list_utilities.alist_lookup(lexicon_accessors.$relational_noun_denot_templates$.getGlobalValue(), type_levelP, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED), possessed_argnum, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 114002L)
    public static SubLObject relational_noun_possessed_argnums(final SubLObject leading_strings, final SubLObject wu, final SubLObject following_strings, final SubLObject pos, final SubLObject pred, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_accessors.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (lexicon_accessors.NIL != leading_strings && lexicon_accessors.NIL != following_strings) {
                final SubLObject dair_pred = lexicon_accessors.$const290$headMedialStringDenotesArgInReln;
                if (kb_indexing.num_gaf_arg_index(wu, (SubLObject)lexicon_accessors.TWO_INTEGER, dair_pred, (SubLObject)lexicon_accessors.UNPROVIDED).isPositive()) {
                    final SubLObject pred_var = dair_pred;
                    if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pred, (SubLObject)lexicon_accessors.FIVE_INTEGER, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pred, (SubLObject)lexicon_accessors.FIVE_INTEGER, pred_var);
                        SubLObject done_var = (SubLObject)lexicon_accessors.NIL;
                        final SubLObject token_var = (SubLObject)lexicon_accessors.NIL;
                        while (lexicon_accessors.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (lexicon_accessors.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)lexicon_accessors.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.$kw56$TRUE, (SubLObject)lexicon_accessors.NIL);
                                    SubLObject done_var_$311 = (SubLObject)lexicon_accessors.NIL;
                                    final SubLObject token_var_$312 = (SubLObject)lexicon_accessors.NIL;
                                    while (lexicon_accessors.NIL == done_var_$311) {
                                        final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$312);
                                        final SubLObject valid_$313 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$312.eql(as));
                                        if (lexicon_accessors.NIL != valid_$313) {
                                            thread.resetMultipleValues();
                                            final SubLObject as_leading_strings = lexicon_utilities.parse_lexical_semantic_formula(assertions_high.gaf_formula(as), (SubLObject)lexicon_accessors.UNPROVIDED);
                                            final SubLObject as_wu = thread.secondMultipleValue();
                                            final SubLObject as_following_strings = thread.thirdMultipleValue();
                                            final SubLObject as_pos = thread.fourthMultipleValue();
                                            thread.resetMultipleValues();
                                            if (as_pos.eql(pos) && as_wu.eql(wu) && as_leading_strings.equal(leading_strings) && as_following_strings.equal(following_strings)) {
                                                ans = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg(as, (SubLObject)lexicon_accessors.SIX_INTEGER), ans);
                                            }
                                        }
                                        done_var_$311 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$313);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$314 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (lexicon_accessors.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$314, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid);
                        }
                    }
                }
            }
            else if (lexicon_accessors.NIL != leading_strings) {
                final SubLObject dair_pred = lexicon_accessors.$const291$multiWordStringDenotesArgInReln;
                if (kb_indexing.num_gaf_arg_index(wu, (SubLObject)lexicon_accessors.TWO_INTEGER, dair_pred, (SubLObject)lexicon_accessors.UNPROVIDED).isPositive()) {
                    final SubLObject pred_var = dair_pred;
                    if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pred, (SubLObject)lexicon_accessors.FOUR_INTEGER, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pred, (SubLObject)lexicon_accessors.FOUR_INTEGER, pred_var);
                        SubLObject done_var = (SubLObject)lexicon_accessors.NIL;
                        final SubLObject token_var = (SubLObject)lexicon_accessors.NIL;
                        while (lexicon_accessors.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (lexicon_accessors.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)lexicon_accessors.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.$kw56$TRUE, (SubLObject)lexicon_accessors.NIL);
                                    SubLObject done_var_$312 = (SubLObject)lexicon_accessors.NIL;
                                    final SubLObject token_var_$313 = (SubLObject)lexicon_accessors.NIL;
                                    while (lexicon_accessors.NIL == done_var_$312) {
                                        final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$313);
                                        final SubLObject valid_$314 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$313.eql(as));
                                        if (lexicon_accessors.NIL != valid_$314) {
                                            thread.resetMultipleValues();
                                            final SubLObject as_leading_strings = lexicon_utilities.parse_lexical_semantic_formula(assertions_high.gaf_formula(as), (SubLObject)lexicon_accessors.UNPROVIDED);
                                            final SubLObject as_wu = thread.secondMultipleValue();
                                            final SubLObject as_following_strings = thread.thirdMultipleValue();
                                            final SubLObject as_pos = thread.fourthMultipleValue();
                                            thread.resetMultipleValues();
                                            if (as_pos.eql(pos) && as_wu.eql(wu) && as_leading_strings.equal(leading_strings)) {
                                                ans = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg5(as), ans);
                                            }
                                        }
                                        done_var_$312 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$314);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$315 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (lexicon_accessors.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$315, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid);
                        }
                    }
                }
            }
            else if (lexicon_accessors.NIL != following_strings) {
                final SubLObject dair_pred = lexicon_accessors.$const292$compoundStringDenotesArgInReln;
                if (kb_indexing.num_gaf_arg_index(wu, (SubLObject)lexicon_accessors.ONE_INTEGER, dair_pred, (SubLObject)lexicon_accessors.UNPROVIDED).isPositive()) {
                    final SubLObject pred_var = dair_pred;
                    if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pred, (SubLObject)lexicon_accessors.FOUR_INTEGER, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pred, (SubLObject)lexicon_accessors.FOUR_INTEGER, pred_var);
                        SubLObject done_var = (SubLObject)lexicon_accessors.NIL;
                        final SubLObject token_var = (SubLObject)lexicon_accessors.NIL;
                        while (lexicon_accessors.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (lexicon_accessors.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)lexicon_accessors.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.$kw56$TRUE, (SubLObject)lexicon_accessors.NIL);
                                    SubLObject done_var_$313 = (SubLObject)lexicon_accessors.NIL;
                                    final SubLObject token_var_$314 = (SubLObject)lexicon_accessors.NIL;
                                    while (lexicon_accessors.NIL == done_var_$313) {
                                        final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$314);
                                        final SubLObject valid_$315 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$314.eql(as));
                                        if (lexicon_accessors.NIL != valid_$315) {
                                            thread.resetMultipleValues();
                                            final SubLObject as_leading_strings = lexicon_utilities.parse_lexical_semantic_formula(assertions_high.gaf_formula(as), (SubLObject)lexicon_accessors.UNPROVIDED);
                                            final SubLObject as_wu = thread.secondMultipleValue();
                                            final SubLObject as_following_strings = thread.thirdMultipleValue();
                                            final SubLObject as_pos = thread.fourthMultipleValue();
                                            thread.resetMultipleValues();
                                            if (as_pos.eql(pos) && as_wu.eql(wu) && as_following_strings.equal(following_strings)) {
                                                ans = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg5(as), ans);
                                            }
                                        }
                                        done_var_$313 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$315);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$316 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (lexicon_accessors.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$316, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid);
                        }
                    }
                }
            }
            else {
                final SubLObject dair_pred = lexicon_accessors.$const293$denotesArgInReln;
                if (kb_indexing.num_gaf_arg_index(wu, (SubLObject)lexicon_accessors.ONE_INTEGER, dair_pred, (SubLObject)lexicon_accessors.UNPROVIDED).isPositive()) {
                    final SubLObject pred_var = dair_pred;
                    if (lexicon_accessors.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(wu, (SubLObject)lexicon_accessors.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(wu, (SubLObject)lexicon_accessors.NIL, pred_var);
                        SubLObject done_var = (SubLObject)lexicon_accessors.NIL;
                        final SubLObject token_var = (SubLObject)lexicon_accessors.NIL;
                        while (lexicon_accessors.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (lexicon_accessors.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)lexicon_accessors.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_accessors.$kw42$GAF, (SubLObject)lexicon_accessors.$kw56$TRUE, (SubLObject)lexicon_accessors.NIL);
                                    SubLObject done_var_$314 = (SubLObject)lexicon_accessors.NIL;
                                    final SubLObject token_var_$315 = (SubLObject)lexicon_accessors.NIL;
                                    while (lexicon_accessors.NIL == done_var_$314) {
                                        final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$315);
                                        final SubLObject valid_$316 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$315.eql(as));
                                        if (lexicon_accessors.NIL != valid_$316) {
                                            thread.resetMultipleValues();
                                            final SubLObject as_leading_strings = lexicon_utilities.parse_lexical_semantic_formula(assertions_high.gaf_formula(as), (SubLObject)lexicon_accessors.UNPROVIDED);
                                            final SubLObject as_wu = thread.secondMultipleValue();
                                            final SubLObject as_following_strings = thread.thirdMultipleValue();
                                            final SubLObject as_pos = thread.fourthMultipleValue();
                                            final SubLObject as_denot = thread.fifthMultipleValue();
                                            thread.resetMultipleValues();
                                            if (as_pos.eql(pos) && as_denot.equal(pred) && as_wu.eql(wu)) {
                                                ans = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg4(as), ans);
                                            }
                                        }
                                        done_var_$314 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid_$316);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$317 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_accessors.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (lexicon_accessors.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$317, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_accessors.NIL == valid);
                        }
                    }
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (lexicon_accessors.NIL != list_utilities.non_empty_list_p(ans) && lexicon_accessors.NIL != forts.fort_p(pred) && lexicon_accessors.NIL != fort_types_interface.symmetric_binary_predicate_p(pred)) {
            ans = (SubLObject)lexicon_accessors.$list294;
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 116899L)
    public static SubLObject relational_noun_preds(final SubLObject leading_strings, final SubLObject wu, final SubLObject following_strings, final SubLObject pos, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (lexicon_accessors.NIL != leading_strings && lexicon_accessors.NIL != following_strings) {
            return ask_utilities.ask_variable((SubLObject)lexicon_accessors.$sym295$_PRED, (SubLObject)ConsesLow.listS(lexicon_accessors.$const290$headMedialStringDenotesArgInReln, leading_strings, wu, following_strings, pos, (SubLObject)lexicon_accessors.$list296), mt, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        if (lexicon_accessors.NIL != leading_strings) {
            return ask_utilities.ask_variable((SubLObject)lexicon_accessors.$sym295$_PRED, (SubLObject)ConsesLow.listS(lexicon_accessors.$const291$multiWordStringDenotesArgInReln, leading_strings, wu, pos, (SubLObject)lexicon_accessors.$list296), mt, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        if (lexicon_accessors.NIL != following_strings) {
            return ask_utilities.ask_variable((SubLObject)lexicon_accessors.$sym295$_PRED, (SubLObject)ConsesLow.listS(lexicon_accessors.$const292$compoundStringDenotesArgInReln, wu, following_strings, pos, (SubLObject)lexicon_accessors.$list296), mt, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
        }
        return ask_utilities.ask_variable((SubLObject)lexicon_accessors.$sym295$_PRED, (SubLObject)ConsesLow.listS(lexicon_accessors.$const293$denotesArgInReln, wu, pos, (SubLObject)lexicon_accessors.$list296), mt, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 117784L)
    public static SubLObject relational_noun_possessed_type(final SubLObject pred, final SubLObject argnum, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLObject tightest_constraint = kb_accessors.min_argn_isa(pred, argnum, mt).first();
        return (lexicon_accessors.NIL != tightest_constraint) ? tightest_constraint : lexicon_accessors.$const297$Thing;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 118092L)
    public static SubLObject relational_noun_possessor_type(final SubLObject pred, final SubLObject argnum, SubLObject mt) {
        if (mt == lexicon_accessors.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLObject tightest_constraint = kb_accessors.min_argn_isa(pred, argnum, mt).first();
        return (lexicon_accessors.NIL != tightest_constraint) ? tightest_constraint : lexicon_accessors.$const297$Thing;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 119479L)
    public static SubLObject la_test_func(final SubLObject thing1, final SubLObject thing2) {
        SubLObject cdolist_list_var = thing2;
        SubLObject item = (SubLObject)lexicon_accessors.NIL;
        item = cdolist_list_var.first();
        while (lexicon_accessors.NIL != cdolist_list_var) {
            if (lexicon_accessors.NIL == subl_promotions.memberP(narts_high.nart_substitute(item), narts_high.nart_substitute(thing1), (SubLObject)lexicon_accessors.EQUAL, (SubLObject)lexicon_accessors.UNPROVIDED)) {
                Errors.warn((SubLObject)lexicon_accessors.$str306$missing___S, item);
                return (SubLObject)lexicon_accessors.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return (SubLObject)lexicon_accessors.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-accessors.lisp", position = 119712L)
    public static SubLObject denotation_mapper_test(final SubLObject string, SubLObject excluded_preds, SubLObject mode, SubLObject parse_morphologically) {
        if (excluded_preds == lexicon_accessors.UNPROVIDED) {
            excluded_preds = (SubLObject)lexicon_accessors.NIL;
        }
        if (mode == lexicon_accessors.UNPROVIDED) {
            mode = (SubLObject)lexicon_accessors.$kw202$GREEDY;
        }
        if (parse_morphologically == lexicon_accessors.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject result = denotation_mapper(string, excluded_preds, mode, parse_morphologically);
        final SubLObject failure = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = transform_list_utilities.transform(result, (SubLObject)lexicon_accessors.$sym307$HL_TERM_WITH_EL_COUNTERPART_P, (SubLObject)lexicon_accessors.$sym308$HL_TERM_TO_EL_TERM, (SubLObject)lexicon_accessors.UNPROVIDED);
        return Values.values(result, failure);
    }
    
    public static SubLObject declare_lexicon_accessors_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "genl_lexicon_mtP", "GENL-LEXICON-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_genl_lexicon_mtP_cached", "CLEAR-GENL-LEXICON-MT?-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "remove_genl_lexicon_mtP_cached", "REMOVE-GENL-LEXICON-MT?-CACHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "genl_lexicon_mtP_cached_internal", "GENL-LEXICON-MT?-CACHED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "genl_lexicon_mtP_cached", "GENL-LEXICON-MT?-CACHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "initialize_speech_part_caches", "INITIALIZE-SPEECH-PART-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "preds_matching_pos", "PREDS-MATCHING-POS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "top_level_nl_preds", "TOP-LEVEL-NL-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_speech_part_pred_caches", "CLEAR-SPEECH-PART-PRED-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "max_preds_matching_pos", "MAX-PREDS-MATCHING-POS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_max_preds_matching_pos_cached", "CLEAR-MAX-PREDS-MATCHING-POS-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "remove_max_preds_matching_pos_cached", "REMOVE-MAX-PREDS-MATCHING-POS-CACHED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "max_preds_matching_pos_cached_internal", "MAX-PREDS-MATCHING-POS-CACHED-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "max_preds_matching_pos_cached", "MAX-PREDS-MATCHING-POS-CACHED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "all_preds_of_pos", "ALL-PREDS-OF-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_max_preds_of_pos", "CLEAR-MAX-PREDS-OF-POS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "remove_max_preds_of_pos", "REMOVE-MAX-PREDS-OF-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "max_preds_of_pos_internal", "MAX-PREDS-OF-POS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "max_preds_of_pos", "MAX-PREDS-OF-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_max_preds_licensed_by_pos", "CLEAR-MAX-PREDS-LICENSED-BY-POS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "remove_max_preds_licensed_by_pos", "REMOVE-MAX-PREDS-LICENSED-BY-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "max_preds_licensed_by_pos_internal", "MAX-PREDS-LICENSED-BY-POS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "max_preds_licensed_by_pos", "MAX-PREDS-LICENSED-BY-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "lex_remove_spec_preds", "LEX-REMOVE-SPEC-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "lex_remove_spec_preds_helper_internal", "LEX-REMOVE-SPEC-PREDS-HELPER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "lex_remove_spec_preds_helper", "LEX-REMOVE-SPEC-PREDS-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "speech_part_pred_min_ceilings", "SPEECH-PART-PRED-MIN-CEILINGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_speech_part_pred_min_ceilings_int", "CLEAR-SPEECH-PART-PRED-MIN-CEILINGS-INT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "remove_speech_part_pred_min_ceilings_int", "REMOVE-SPEECH-PART-PRED-MIN-CEILINGS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "speech_part_pred_min_ceilings_int_internal", "SPEECH-PART-PRED-MIN-CEILINGS-INT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "speech_part_pred_min_ceilings_int", "SPEECH-PART-PRED-MIN-CEILINGS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "speech_part_pred_max_floors", "SPEECH-PART-PRED-MAX-FLOORS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_speech_part_pred_max_floors_int", "CLEAR-SPEECH-PART-PRED-MAX-FLOORS-INT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "remove_speech_part_pred_max_floors_int", "REMOVE-SPEECH-PART-PRED-MAX-FLOORS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "speech_part_pred_max_floors_int_internal", "SPEECH-PART-PRED-MAX-FLOORS-INT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "speech_part_pred_max_floors_int", "SPEECH-PART-PRED-MAX-FLOORS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_pos_of_pred", "CLEAR-POS-OF-PRED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "remove_pos_of_pred", "REMOVE-POS-OF-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "pos_of_pred_internal", "POS-OF-PRED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "pos_of_pred", "POS-OF-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "singular_pred", "SINGULAR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "plural_pred", "PLURAL-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "derived_preds", "DERIVED-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_derived_preds", "CLEAR-DERIVED-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "initialize_derived_preds", "INITIALIZE-DERIVED-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "derived_predP", "DERIVED-PRED?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "base_preds_of_pred", "BASE-PREDS-OF-PRED", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_accessors", "do_speech_part_preds", "DO-SPEECH-PART-PREDS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "speech_part_preds_initializedP", "SPEECH-PART-PREDS-INITIALIZED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_speech_part_preds", "CLEAR-SPEECH-PART-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "initialize_speech_part_preds", "INITIALIZE-SPEECH-PART-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "ensure_speech_part_preds_initialized", "ENSURE-SPEECH-PART-PREDS-INITIALIZED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "speech_part_predP", "SPEECH-PART-PRED?", 1, 1, false);
        new $speech_part_predP$UnaryFunction();
        new $speech_part_predP$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "all_speech_part_preds", "ALL-SPEECH-PART-PREDS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "spec_pos_predP", "SPEC-POS-PRED?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_genl_pos_predP", "CLEAR-GENL-POS-PRED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "remove_genl_pos_predP", "REMOVE-GENL-POS-PRED?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "genl_pos_predP_internal", "GENL-POS-PRED?-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "genl_pos_predP", "GENL-POS-PRED?", 2, 1, false);
        new $genl_pos_predP$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_genl_pos_pred_from_mt_infoP", "CLEAR-GENL-POS-PRED-FROM-MT-INFO?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "remove_genl_pos_pred_from_mt_infoP", "REMOVE-GENL-POS-PRED-FROM-MT-INFO?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "genl_pos_pred_from_mt_infoP_internal", "GENL-POS-PRED-FROM-MT-INFO?-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "genl_pos_pred_from_mt_infoP", "GENL-POS-PRED-FROM-MT-INFO?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "word_form_predictableP", "WORD-FORM-PREDICTABLE?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "get_strings_of_type", "GET-STRINGS-OF-TYPE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_get_strings_of_type_cached", "CLEAR-GET-STRINGS-OF-TYPE-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "remove_get_strings_of_type_cached", "REMOVE-GET-STRINGS-OF-TYPE-CACHED", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "get_strings_of_type_cached_internal", "GET-STRINGS-OF-TYPE-CACHED-INTERNAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "get_strings_of_type_cached", "GET-STRINGS-OF-TYPE-CACHED", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "string_is_pos_on_wuP_internal", "STRING-IS-POS-ON-WU?-INTERNAL", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "string_is_pos_on_wuP", "STRING-IS-POS-ON-WU?", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "string_is_pos_on_wuP_asserted", "STRING-IS-POS-ON-WU?-ASSERTED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "string_is_pred_on_wuP", "STRING-IS-PRED-ON-WU?", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "best_wu_for_string", "BEST-WU-FOR-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "best_pos_for_stringXwuXpos", "BEST-POS-FOR-STRING&WU&POS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "words_of_stringXpred", "WORDS-OF-STRING&PRED", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_pos_for_keyword", "CLEAR-POS-FOR-KEYWORD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "remove_pos_for_keyword", "REMOVE-POS-FOR-KEYWORD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "pos_for_keyword_internal", "POS-FOR-KEYWORD-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "pos_for_keyword", "POS-FOR-KEYWORD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "words_of_stringXpos", "WORDS-OF-STRING&POS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "words_of_stringXspeech_part", "WORDS-OF-STRING&SPEECH-PART", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "preds_of_stringXword", "PREDS-OF-STRING&WORD", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_preds_of_stringXword", "CLEAR-PREDS-OF-STRING&WORD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_preds_of_stringXword_cached", "CLEAR-PREDS-OF-STRING&WORD-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "remove_preds_of_stringXword_cached", "REMOVE-PREDS-OF-STRING&WORD-CACHED", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "preds_of_stringXword_cached_internal", "PREDS-OF-STRING&WORD-CACHED-INTERNAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "preds_of_stringXword_cached", "PREDS-OF-STRING&WORD-CACHED", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "other_strings_of_wu", "OTHER-STRINGS-OF-WU", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "right_frames_for_pos", "RIGHT-FRAMES-FOR-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "pos_of_string", "POS-OF-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "string_is_posP", "STRING-IS-POS?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "string_is_form_of_aux_verbP", "STRING-IS-FORM-OF-AUX-VERB?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_closed_lexical_class_hash", "CLEAR-CLOSED-LEXICAL-CLASS-HASH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "initialize_closed_lexical_class_strings", "INITIALIZE-CLOSED-LEXICAL-CLASS-STRINGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "closed_lexical_class_string_intP", "CLOSED-LEXICAL-CLASS-STRING-INT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "closed_lexical_class_stringP", "CLOSED-LEXICAL-CLASS-STRING?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "closed_lexical_class_string_case_insensitiveP", "CLOSED-LEXICAL-CLASS-STRING-CASE-INSENSITIVE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "non_pronominal_closed_lexical_class_stringP", "NON-PRONOMINAL-CLOSED-LEXICAL-CLASS-STRING?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "contains_closed_lexical_class_wordP", "CONTAINS-CLOSED-LEXICAL-CLASS-WORD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_closed_lexical_class_strings", "CLEAR-CLOSED-LEXICAL-CLASS-STRINGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "remove_closed_lexical_class_strings", "REMOVE-CLOSED-LEXICAL-CLASS-STRINGS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "closed_lexical_class_strings_internal", "CLOSED-LEXICAL-CLASS-STRINGS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "closed_lexical_class_strings", "CLOSED-LEXICAL-CLASS-STRINGS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "closed_lexical_classP", "CLOSED-LEXICAL-CLASS?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_closed_lexical_classes", "CLEAR-CLOSED-LEXICAL-CLASSES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "remove_closed_lexical_classes", "REMOVE-CLOSED-LEXICAL-CLASSES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "closed_lexical_classes_internal", "CLOSED-LEXICAL-CLASSES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "closed_lexical_classes", "CLOSED-LEXICAL-CLASSES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "maybe_initialize_prep_strings", "MAYBE-INITIALIZE-PREP-STRINGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "preposition_stringP", "PREPOSITION-STRING?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "quick_lexical_wordP", "QUICK-LEXICAL-WORD?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "quick_lexical_wordP_int", "QUICK-LEXICAL-WORD?-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "quick_word_nautP", "QUICK-WORD-NAUT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "lexical_wordP_internal", "LEXICAL-WORD?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "lexical_wordP", "LEXICAL-WORD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "derived_wordP_internal", "DERIVED-WORD?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "derived_wordP", "DERIVED-WORD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "initialize_vulgar_words", "INITIALIZE-VULGAR-WORDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "vulgar_wordP", "VULGAR-WORD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "pos_of_stringXword", "POS-OF-STRING&WORD", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_nl_caches", "CLEAR-NL-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_nl_parsing_caches", "CLEAR-NL-PARSING-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_cached_lexical_access_functions", "CLEAR-CACHED-LEXICAL-ACCESS-FUNCTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "pos_of_word", "POS-OF-WORD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "word_has_posP", "WORD-HAS-POS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_verb_only_stringP", "CLEAR-VERB-ONLY-STRING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "remove_verb_only_stringP", "REMOVE-VERB-ONLY-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "verb_only_stringP_internal", "VERB-ONLY-STRING?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "verb_only_stringP", "VERB-ONLY-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "typed_denots_of_string", "TYPED-DENOTS-OF-STRING", 2, 8, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "typed_denots_of_string_preds_okP", "TYPED-DENOTS-OF-STRING-PREDS-OK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denot_has_typeP_internal", "DENOT-HAS-TYPE?-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denot_has_typeP", "DENOT-HAS-TYPE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denot_might_have_typeP_internal", "DENOT-MIGHT-HAVE-TYPE?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denot_might_have_typeP", "DENOT-MIGHT-HAVE-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "multi_typed_denots_of_string", "MULTI-TYPED-DENOTS-OF-STRING", 3, 8, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "typed_denots_of_string_at_place", "TYPED-DENOTS-OF-STRING-AT-PLACE", 3, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "in_region_p", "IN-REGION-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "geopolitical_subdivisionP", "GEOPOLITICAL-SUBDIVISION?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "geographical_subregionP", "GEOGRAPHICAL-SUBREGION?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "territories_for_gpe", "TERRITORIES-FOR-GPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "gpe_for_territory", "GPE-FOR-TERRITORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denots_of_partial_string", "DENOTS-OF-PARTIAL-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denotation_mapper", "DENOTATION-MAPPER", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "all_denots_of_string", "ALL-DENOTS-OF-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "most_denots_of_string", "MOST-DENOTS-OF-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "all_parsing_denots_of_string", "ALL-PARSING-DENOTS-OF-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denots_of_string", "DENOTS-OF-STRING", 1, 8, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "valid_denots_of_string_lookup_mt_specificationP", "VALID-DENOTS-OF-STRING-LOOKUP-MT-SPECIFICATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denots_mt_for_language", "DENOTS-MT-FOR-LANGUAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "add_denots_of_string_results", "ADD-DENOTS-OF-STRING-RESULTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "date_and_number_denots_of_string", "DATE-AND-NUMBER-DENOTS-OF-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denots_of_stringXpred", "DENOTS-OF-STRING&PRED", 2, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denots_of_stringXnamestring_pred", "DENOTS-OF-STRING&NAMESTRING-PRED", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denots_of_stringXpos_pred", "DENOTS-OF-STRING&POS-PRED", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denots_of_stringXspeech_part", "DENOTS-OF-STRING&SPEECH-PART", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denots_of_stringXpos", "DENOTS-OF-STRING&POS", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denots_of_name_string", "DENOTS-OF-NAME-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denots_of_name_string_precise", "DENOTS-OF-NAME-STRING-PRECISE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denots_of_wu", "DENOTS-OF-WU", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "proceed_with_morphological_parsingP", "PROCEED-WITH-MORPHOLOGICAL-PARSING?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "skip_to_morphological_parsingP", "SKIP-TO-MORPHOLOGICAL-PARSING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denots_of_acronym_string", "DENOTS-OF-ACRONYM-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "names_from_spelling", "NAMES-FROM-SPELLING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "names_from_nickname", "NAMES-FROM-NICKNAME", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denots_of_abbreviation_string", "DENOTS-OF-ABBREVIATION-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "known_proper_noun_phraseP", "KNOWN-PROPER-NOUN-PHRASE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "determine_denotation_preds", "DETERMINE-DENOTATION-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "determine_denotation_pred", "DETERMINE-DENOTATION-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "meanings_of_sense", "MEANINGS-OF-SENSE", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "meaning_has_senseP", "MEANING-HAS-SENSE?", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denot_has_senseP", "DENOT-HAS-SENSE?", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denots_of_sense", "DENOTS-OF-SENSE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "proper_denots_of_sense", "PROPER-DENOTS-OF-SENSE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "related_denots_of_sense", "RELATED-DENOTS-OF-SENSE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "placeholder_denots_of_sense", "PLACEHOLDER-DENOTS-OF-SENSE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denots_of_sense_by_mt", "DENOTS-OF-SENSE-BY-MT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "senses_of_wuXpos", "SENSES-OF-WU&POS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "subcat_frame_arity", "SUBCAT-FRAME-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "frames_of_word", "FRAMES-OF-WORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "frames_of_wordXpos", "FRAMES-OF-WORD&POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "frames_of_word_posXdenot", "FRAMES-OF-WORD-POS&DENOT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "frames_of_sense", "FRAMES-OF-SENSE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "frames_of_sense_by_mt", "FRAMES-OF-SENSE-BY-MT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "politeness_of_ws_pred", "POLITENESS-OF-WS-PRED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "formality_of_ws_pred", "FORMALITY-OF-WS-PRED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "politeness_levels_of_assertion", "POLITENESS-LEVELS-OF-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "formality_levels_of_assertion", "FORMALITY-LEVELS-OF-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "potentially_offensive_politeness_levelP", "POTENTIALLY-OFFENSIVE-POLITENESS-LEVEL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "includes_potentially_offensive_politeness_levelP", "INCLUDES-POTENTIALLY-OFFENSIVE-POLITENESS-LEVEL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "potentially_offensive_lexical_assertionP", "POTENTIALLY-OFFENSIVE-LEXICAL-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "slang_lexical_assertionP", "SLANG-LEXICAL-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "archaic_lexical_assertionP", "ARCHAIC-LEXICAL-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_indirect_lexical_assertionP", "CLEAR-INDIRECT-LEXICAL-ASSERTION?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "remove_indirect_lexical_assertionP", "REMOVE-INDIRECT-LEXICAL-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "indirect_lexical_assertionP_internal", "INDIRECT-LEXICAL-ASSERTION?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "indirect_lexical_assertionP", "INDIRECT-LEXICAL-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "inappropriate_lexical_assertionP", "INAPPROPRIATE-LEXICAL-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "gather_denotation_assertions", "GATHER-DENOTATION-ASSERTIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "potentially_offensive_senseP", "POTENTIALLY-OFFENSIVE-SENSE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "inappropriate_senseP", "INAPPROPRIATE-SENSE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "semtrans_of_ws", "SEMTRANS-OF-WS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "semtrans_of_wuXpos", "SEMTRANS-OF-WU&POS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "semtrans_lookup_int", "SEMTRANS-LOOKUP-INT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "semtrans_template_from_assertion", "SEMTRANS-TEMPLATE-FROM-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "semtrans_sentence_infer", "SEMTRANS-SENTENCE-INFER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denots_of_word", "DENOTS-OF-WORD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "semtrans_assertion_lookup", "SEMTRANS-ASSERTION-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "all_semtrans_assertions", "ALL-SEMTRANS-ASSERTIONS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "preposition_of_frame", "PREPOSITION-OF-FRAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "assertion_denotation", "ASSERTION-DENOTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "assertion_pos", "ASSERTION-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "assertion_sense_num", "ASSERTION-SENSE-NUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_agr_of_det_string", "CLEAR-AGR-OF-DET-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "remove_agr_of_det_string", "REMOVE-AGR-OF-DET-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "agr_of_det_string_internal", "AGR-OF-DET-STRING-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "agr_of_det_string", "AGR-OF-DET-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "agreement_lookup", "AGREEMENT-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denot_ws_lookup", "DENOT-WS-LOOKUP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "pos_to_semtrans_pred", "POS-TO-SEMTRANS-PRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_pos_to_semtrans_pred_cached", "CLEAR-POS-TO-SEMTRANS-PRED-CACHED", 0, 0, false);
        new $clear_pos_to_semtrans_pred_cached$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "remove_pos_to_semtrans_pred_cached", "REMOVE-POS-TO-SEMTRANS-PRED-CACHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "pos_to_semtrans_pred_cached_internal", "POS-TO-SEMTRANS-PRED-CACHED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "pos_to_semtrans_pred_cached", "POS-TO-SEMTRANS-PRED-CACHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_semtrans_pred_to_pos", "CLEAR-SEMTRANS-PRED-TO-POS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "remove_semtrans_pred_to_pos", "REMOVE-SEMTRANS-PRED-TO-POS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "semtrans_pred_to_pos_internal", "SEMTRANS-PRED-TO-POS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "semtrans_pred_to_pos", "SEMTRANS-PRED-TO-POS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "nicknames_of_name", "NICKNAMES-OF-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "spellings_of_name", "SPELLINGS-OF-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "argn_is_speech_partP", "ARGN-IS-SPEECH-PART?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "speech_parts_initializedP", "SPEECH-PARTS-INITIALIZED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_speech_parts", "CLEAR-SPEECH-PARTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "initialize_speech_parts", "INITIALIZE-SPEECH-PARTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "speech_partP", "SPEECH-PART?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "ensure_speech_parts_initialized", "ENSURE-SPEECH-PARTS-INITIALIZED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "all_speech_parts", "ALL-SPEECH-PARTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_genl_posP", "CLEAR-GENL-POS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "remove_genl_posP", "REMOVE-GENL-POS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "genl_posP_internal", "GENL-POS?-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "genl_posP", "GENL-POS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "genl_pos_memberP", "GENL-POS-MEMBER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "spec_posP", "SPEC-POS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "adjpP", "ADJP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "vbarP", "VBAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "nbarP", "NBAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "object_is_compositional_pos_termP", "OBJECT-IS-COMPOSITIONAL-POS-TERM?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "clear_compositional_pos_nart", "CLEAR-COMPOSITIONAL-POS-NART", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "remove_compositional_pos_nart", "REMOVE-COMPOSITIONAL-POS-NART", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "compositional_pos_nart_internal", "COMPOSITIONAL-POS-NART-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "compositional_pos_nart", "COMPOSITIONAL-POS-NART", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "npP", "NP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "ppP", "PP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "safe_nart_hl_formula", "SAFE-NART-HL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "relational_noun_denots", "RELATIONAL-NOUN-DENOTS", 4, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "relational_noun_denot_template_lookup", "RELATIONAL-NOUN-DENOT-TEMPLATE-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "relational_noun_possessed_argnums", "RELATIONAL-NOUN-POSSESSED-ARGNUMS", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "relational_noun_preds", "RELATIONAL-NOUN-PREDS", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "relational_noun_possessed_type", "RELATIONAL-NOUN-POSSESSED-TYPE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "relational_noun_possessor_type", "RELATIONAL-NOUN-POSSESSOR-TYPE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "la_test_func", "LA-TEST-FUNC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_accessors", "denotation_mapper_test", "DENOTATION-MAPPER-TEST", 1, 3, false);
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    public static SubLObject init_lexicon_accessors_file() {
        lexicon_accessors.$genl_lexicon_mtP_cached_caching_state$ = SubLFiles.deflexical("*GENL-LEXICON-MT?-CACHED-CACHING-STATE*", (SubLObject)lexicon_accessors.NIL);
        lexicon_accessors.$max_preds_matching_pos_cached_caching_state$ = SubLFiles.deflexical("*MAX-PREDS-MATCHING-POS-CACHED-CACHING-STATE*", (SubLObject)lexicon_accessors.NIL);
        lexicon_accessors.$max_preds_of_pos_caching_state$ = SubLFiles.deflexical("*MAX-PREDS-OF-POS-CACHING-STATE*", (SubLObject)lexicon_accessors.NIL);
        lexicon_accessors.$max_preds_licensed_by_pos_caching_state$ = SubLFiles.deflexical("*MAX-PREDS-LICENSED-BY-POS-CACHING-STATE*", (SubLObject)lexicon_accessors.NIL);
        lexicon_accessors.$speech_part_pred_min_ceilings_int_caching_state$ = SubLFiles.deflexical("*SPEECH-PART-PRED-MIN-CEILINGS-INT-CACHING-STATE*", (SubLObject)lexicon_accessors.NIL);
        lexicon_accessors.$speech_part_pred_max_floors_int_caching_state$ = SubLFiles.deflexical("*SPEECH-PART-PRED-MAX-FLOORS-INT-CACHING-STATE*", (SubLObject)lexicon_accessors.NIL);
        lexicon_accessors.$pos_of_pred_caching_state$ = SubLFiles.deflexical("*POS-OF-PRED-CACHING-STATE*", (SubLObject)lexicon_accessors.NIL);
        lexicon_accessors.$derived_preds$ = SubLFiles.deflexical("*DERIVED-PREDS*", maybeDefault((SubLObject)lexicon_accessors.$sym39$_DERIVED_PREDS_, lexicon_accessors.$derived_preds$, ()->(Hashtables.make_hash_table((SubLObject)lexicon_accessors.$int40$256, (SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED))));
        lexicon_accessors.$speech_part_preds$ = SubLFiles.deflexical("*SPEECH-PART-PREDS*", maybeDefault((SubLObject)lexicon_accessors.$sym61$_SPEECH_PART_PREDS_, lexicon_accessors.$speech_part_preds$, ()->(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)lexicon_accessors.EQL), (SubLObject)lexicon_accessors.$int40$256))));
        lexicon_accessors.$genl_pos_predP_caching_state$ = SubLFiles.deflexical("*GENL-POS-PRED?-CACHING-STATE*", (SubLObject)lexicon_accessors.NIL);
        lexicon_accessors.$genl_pos_pred_from_mt_infoP_caching_state$ = SubLFiles.deflexical("*GENL-POS-PRED-FROM-MT-INFO?-CACHING-STATE*", (SubLObject)lexicon_accessors.NIL);
        lexicon_accessors.$get_strings_of_type_cached_caching_state$ = SubLFiles.deflexical("*GET-STRINGS-OF-TYPE-CACHED-CACHING-STATE*", (SubLObject)lexicon_accessors.NIL);
        lexicon_accessors.$pos_for_keyword_caching_state$ = SubLFiles.deflexical("*POS-FOR-KEYWORD-CACHING-STATE*", (SubLObject)lexicon_accessors.NIL);
        lexicon_accessors.$preds_of_stringXword_cached_caching_state$ = SubLFiles.deflexical("*PREDS-OF-STRING&WORD-CACHED-CACHING-STATE*", (SubLObject)lexicon_accessors.NIL);
        lexicon_accessors.$closed_lexical_class_strings$ = SubLFiles.deflexical("*CLOSED-LEXICAL-CLASS-STRINGS*", maybeDefault((SubLObject)lexicon_accessors.$sym152$_CLOSED_LEXICAL_CLASS_STRINGS_, lexicon_accessors.$closed_lexical_class_strings$, ()->(Hashtables.make_hash_table((SubLObject)lexicon_accessors.$int25$512, Symbols.symbol_function((SubLObject)lexicon_accessors.EQUAL), (SubLObject)lexicon_accessors.UNPROVIDED))));
        lexicon_accessors.$closed_lexical_class_strings_case_insensitive$ = SubLFiles.deflexical("*CLOSED-LEXICAL-CLASS-STRINGS-CASE-INSENSITIVE*", maybeDefault((SubLObject)lexicon_accessors.$sym153$_CLOSED_LEXICAL_CLASS_STRINGS_CASE_INSENSITIVE_, lexicon_accessors.$closed_lexical_class_strings_case_insensitive$, ()->(Hashtables.make_hash_table((SubLObject)lexicon_accessors.$int25$512, Symbols.symbol_function((SubLObject)lexicon_accessors.EQUALP), (SubLObject)lexicon_accessors.UNPROVIDED))));
        lexicon_accessors.$closed_lexical_class_strings_caching_state$ = SubLFiles.deflexical("*CLOSED-LEXICAL-CLASS-STRINGS-CACHING-STATE*", (SubLObject)lexicon_accessors.NIL);
        lexicon_accessors.$closed_lexical_classes_caching_state$ = SubLFiles.deflexical("*CLOSED-LEXICAL-CLASSES-CACHING-STATE*", (SubLObject)lexicon_accessors.NIL);
        lexicon_accessors.$preposition_strings$ = SubLFiles.defparameter("*PREPOSITION-STRINGS*", Hashtables.make_hash_table((SubLObject)lexicon_accessors.$int134$64, Symbols.symbol_function((SubLObject)lexicon_accessors.EQUALP), (SubLObject)lexicon_accessors.UNPROVIDED));
        lexicon_accessors.$pos_forms_spec_preds$ = SubLFiles.deflexical("*POS-FORMS-SPEC-PREDS*", (SubLObject)lexicon_accessors.$list160);
        lexicon_accessors.$vulgar_words$ = SubLFiles.deflexical("*VULGAR-WORDS*", maybeDefault((SubLObject)lexicon_accessors.$sym166$_VULGAR_WORDS_, lexicon_accessors.$vulgar_words$, ()->(set.new_set((SubLObject)lexicon_accessors.UNPROVIDED, (SubLObject)lexicon_accessors.UNPROVIDED))));
        lexicon_accessors.$verb_only_stringP_caching_state$ = SubLFiles.deflexical("*VERB-ONLY-STRING?-CACHING-STATE*", (SubLObject)lexicon_accessors.NIL);
        lexicon_accessors.$indirect_lexical_assertionP_caching_state$ = SubLFiles.deflexical("*INDIRECT-LEXICAL-ASSERTION?-CACHING-STATE*", (SubLObject)lexicon_accessors.NIL);
        lexicon_accessors.$agr_of_det_string_caching_state$ = SubLFiles.deflexical("*AGR-OF-DET-STRING-CACHING-STATE*", (SubLObject)lexicon_accessors.NIL);
        lexicon_accessors.$pos_to_semtrans_pred_cached_caching_state$ = SubLFiles.deflexical("*POS-TO-SEMTRANS-PRED-CACHED-CACHING-STATE*", (SubLObject)lexicon_accessors.NIL);
        lexicon_accessors.$semtrans_pred_to_pos_caching_state$ = SubLFiles.deflexical("*SEMTRANS-PRED-TO-POS-CACHING-STATE*", (SubLObject)lexicon_accessors.NIL);
        lexicon_accessors.$speech_parts$ = SubLFiles.deflexical("*SPEECH-PARTS*", maybeDefault((SubLObject)lexicon_accessors.$sym274$_SPEECH_PARTS_, lexicon_accessors.$speech_parts$, ()->(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)lexicon_accessors.EQL), (SubLObject)lexicon_accessors.$int40$256))));
        lexicon_accessors.$genl_posP_caching_state$ = SubLFiles.deflexical("*GENL-POS?-CACHING-STATE*", (SubLObject)lexicon_accessors.NIL);
        lexicon_accessors.$most_general_speech_part$ = SubLFiles.deflexical("*MOST-GENERAL-SPEECH-PART*", lexicon_accessors.$const277$NLWordForm);
        lexicon_accessors.$compositional_pos_nart_caching_state$ = SubLFiles.deflexical("*COMPOSITIONAL-POS-NART-CACHING-STATE*", (SubLObject)lexicon_accessors.NIL);
        lexicon_accessors.$relational_noun_denot_templates$ = SubLFiles.deflexical("*RELATIONAL-NOUN-DENOT-TEMPLATES*", (SubLObject)lexicon_accessors.$list289);
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    public static SubLObject setup_lexicon_accessors_file() {
        memoization_state.note_globally_cached_function((SubLObject)lexicon_accessors.$sym2$GENL_LEXICON_MT__CACHED);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_accessors.$sym10$MAX_PREDS_MATCHING_POS_CACHED);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_accessors.$sym13$MAX_PREDS_OF_POS);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_accessors.$sym16$MAX_PREDS_LICENSED_BY_POS);
        memoization_state.note_memoized_function((SubLObject)lexicon_accessors.$sym22$LEX_REMOVE_SPEC_PREDS_HELPER);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_accessors.$sym23$SPEECH_PART_PRED_MIN_CEILINGS_INT);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_accessors.$sym27$SPEECH_PART_PRED_MAX_FLOORS_INT);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_accessors.$sym30$POS_OF_PRED);
        subl_macro_promotions.declare_defglobal((SubLObject)lexicon_accessors.$sym39$_DERIVED_PREDS_);
        subl_macro_promotions.declare_defglobal((SubLObject)lexicon_accessors.$sym61$_SPEECH_PART_PREDS_);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_accessors.$sym78$GENL_POS_PRED_);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_accessors.$sym81$GENL_POS_PRED_FROM_MT_INFO_);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_accessors.$sym91$GET_STRINGS_OF_TYPE_CACHED);
        memoization_state.note_memoized_function((SubLObject)lexicon_accessors.$sym93$STRING_IS_POS_ON_WU_);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_accessors.$sym102$POS_FOR_KEYWORD);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_accessors.$sym137$PREDS_OF_STRING_WORD_CACHED);
        subl_macro_promotions.declare_defglobal((SubLObject)lexicon_accessors.$sym152$_CLOSED_LEXICAL_CLASS_STRINGS_);
        subl_macro_promotions.declare_defglobal((SubLObject)lexicon_accessors.$sym153$_CLOSED_LEXICAL_CLASS_STRINGS_CASE_INSENSITIVE_);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_accessors.$sym156$CLOSED_LEXICAL_CLASS_STRINGS);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_accessors.$sym158$CLOSED_LEXICAL_CLASSES);
        memoization_state.note_memoized_function((SubLObject)lexicon_accessors.$sym95$LEXICAL_WORD_);
        memoization_state.note_memoized_function((SubLObject)lexicon_accessors.$sym164$DERIVED_WORD_);
        subl_macro_promotions.declare_defglobal((SubLObject)lexicon_accessors.$sym166$_VULGAR_WORDS_);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_accessors.$sym170$VERB_ONLY_STRING_);
        utilities_macros.register_cyc_api_function((SubLObject)lexicon_accessors.$sym178$TYPED_DENOTS_OF_STRING, (SubLObject)lexicon_accessors.$list179, (SubLObject)lexicon_accessors.$str180$_param_STRING_string_____param_TY, (SubLObject)lexicon_accessors.$list181, (SubLObject)lexicon_accessors.$list182);
        memoization_state.note_memoized_function((SubLObject)lexicon_accessors.$sym183$DENOT_HAS_TYPE_);
        memoization_state.note_memoized_function((SubLObject)lexicon_accessors.$sym184$DENOT_MIGHT_HAVE_TYPE_);
        utilities_macros.register_cyc_api_function((SubLObject)lexicon_accessors.$sym204$DENOTATION_MAPPER, (SubLObject)lexicon_accessors.$list205, (SubLObject)lexicon_accessors.$str206$_param_STRING_string__the_string_, (SubLObject)lexicon_accessors.$list207, (SubLObject)lexicon_accessors.$list208);
        utilities_macros.register_cyc_api_function((SubLObject)lexicon_accessors.$sym214$DENOTS_OF_STRING, (SubLObject)lexicon_accessors.$list215, (SubLObject)lexicon_accessors.$str216$_param_PARSE_MORPHOLOGICALLY__PAR, (SubLObject)lexicon_accessors.$list217, (SubLObject)lexicon_accessors.NIL);
        access_macros.register_external_symbol((SubLObject)lexicon_accessors.$sym218$DENOTS_MT_FOR_LANGUAGE);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_accessors.$sym250$INDIRECT_LEXICAL_ASSERTION_);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_accessors.$sym261$AGR_OF_DET_STRING);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_accessors.$sym265$POS_TO_SEMTRANS_PRED_CACHED);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_accessors.$sym269$SEMTRANS_PRED_TO_POS);
        subl_macro_promotions.declare_defglobal((SubLObject)lexicon_accessors.$sym274$_SPEECH_PARTS_);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_accessors.$sym275$GENL_POS_);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_accessors.$sym280$COMPOSITIONAL_POS_NART);
        generic_testing.define_test_case_table_int((SubLObject)lexicon_accessors.$sym214$DENOTS_OF_STRING, (SubLObject)ConsesLow.list(new SubLObject[] { lexicon_accessors.$kw298$TEST, lexicon_accessors.$sym299$SETS_EQUAL_EQUAL_, lexicon_accessors.$kw300$OWNER, lexicon_accessors.NIL, lexicon_accessors.$kw301$CLASSES, lexicon_accessors.NIL, lexicon_accessors.$kw302$KB, lexicon_accessors.$kw303$FULL, lexicon_accessors.$kw304$WORKING_, lexicon_accessors.T }), (SubLObject)lexicon_accessors.$list305);
        return (SubLObject)lexicon_accessors.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_lexicon_accessors_file();
    }
    
    @Override
	public void initializeVariables() {
        init_lexicon_accessors_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_lexicon_accessors_file();
    }
    
    static {
        me = (SubLFile)new lexicon_accessors();
        lexicon_accessors.$genl_lexicon_mtP_cached_caching_state$ = null;
        lexicon_accessors.$max_preds_matching_pos_cached_caching_state$ = null;
        lexicon_accessors.$max_preds_of_pos_caching_state$ = null;
        lexicon_accessors.$max_preds_licensed_by_pos_caching_state$ = null;
        lexicon_accessors.$speech_part_pred_min_ceilings_int_caching_state$ = null;
        lexicon_accessors.$speech_part_pred_max_floors_int_caching_state$ = null;
        lexicon_accessors.$pos_of_pred_caching_state$ = null;
        lexicon_accessors.$derived_preds$ = null;
        lexicon_accessors.$speech_part_preds$ = null;
        lexicon_accessors.$genl_pos_predP_caching_state$ = null;
        lexicon_accessors.$genl_pos_pred_from_mt_infoP_caching_state$ = null;
        lexicon_accessors.$get_strings_of_type_cached_caching_state$ = null;
        lexicon_accessors.$pos_for_keyword_caching_state$ = null;
        lexicon_accessors.$preds_of_stringXword_cached_caching_state$ = null;
        lexicon_accessors.$closed_lexical_class_strings$ = null;
        lexicon_accessors.$closed_lexical_class_strings_case_insensitive$ = null;
        lexicon_accessors.$closed_lexical_class_strings_caching_state$ = null;
        lexicon_accessors.$closed_lexical_classes_caching_state$ = null;
        lexicon_accessors.$preposition_strings$ = null;
        lexicon_accessors.$pos_forms_spec_preds$ = null;
        lexicon_accessors.$vulgar_words$ = null;
        lexicon_accessors.$verb_only_stringP_caching_state$ = null;
        lexicon_accessors.$indirect_lexical_assertionP_caching_state$ = null;
        lexicon_accessors.$agr_of_det_string_caching_state$ = null;
        lexicon_accessors.$pos_to_semtrans_pred_cached_caching_state$ = null;
        lexicon_accessors.$semtrans_pred_to_pos_caching_state$ = null;
        lexicon_accessors.$speech_parts$ = null;
        lexicon_accessors.$genl_posP_caching_state$ = null;
        lexicon_accessors.$most_general_speech_part$ = null;
        lexicon_accessors.$compositional_pos_nart_caching_state$ = null;
        lexicon_accessors.$relational_noun_denot_templates$ = null;
        $const0$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $const1$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym2$GENL_LEXICON_MT__CACHED = SubLObjectFactory.makeSymbol("GENL-LEXICON-MT?-CACHED");
        $sym3$_GENL_LEXICON_MT__CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GENL-LEXICON-MT?-CACHED-CACHING-STATE*");
        $int4$4096 = SubLObjectFactory.makeInteger(4096);
        $sym5$CLEAR_GENL_LEXICON_MT__CACHED = SubLObjectFactory.makeSymbol("CLEAR-GENL-LEXICON-MT?-CACHED");
        $kw6$INITIALIZED = SubLObjectFactory.makeKeyword("INITIALIZED");
        $sym7$SPEECH_PART_ = SubLObjectFactory.makeSymbol("SPEECH-PART?");
        $kw8$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw9$CLEARED = SubLObjectFactory.makeKeyword("CLEARED");
        $sym10$MAX_PREDS_MATCHING_POS_CACHED = SubLObjectFactory.makeSymbol("MAX-PREDS-MATCHING-POS-CACHED");
        $sym11$_MAX_PREDS_MATCHING_POS_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*MAX-PREDS-MATCHING-POS-CACHED-CACHING-STATE*");
        $int12$32 = SubLObjectFactory.makeInteger(32);
        $sym13$MAX_PREDS_OF_POS = SubLObjectFactory.makeSymbol("MAX-PREDS-OF-POS");
        $sym14$_MAX_PREDS_OF_POS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*MAX-PREDS-OF-POS-CACHING-STATE*");
        $sym15$CLEAR_MAX_PREDS_OF_POS = SubLObjectFactory.makeSymbol("CLEAR-MAX-PREDS-OF-POS");
        $sym16$MAX_PREDS_LICENSED_BY_POS = SubLObjectFactory.makeSymbol("MAX-PREDS-LICENSED-BY-POS");
        $sym17$_MAX_PREDS_LICENSED_BY_POS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*MAX-PREDS-LICENSED-BY-POS-CACHING-STATE*");
        $sym18$CLEAR_MAX_PREDS_LICENSED_BY_POS = SubLObjectFactory.makeSymbol("CLEAR-MAX-PREDS-LICENSED-BY-POS");
        $sym19$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const20$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $list21 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("NOW"), (SubLObject)SubLObjectFactory.makeSymbol("LATER"));
        $sym22$LEX_REMOVE_SPEC_PREDS_HELPER = SubLObjectFactory.makeSymbol("LEX-REMOVE-SPEC-PREDS-HELPER");
        $sym23$SPEECH_PART_PRED_MIN_CEILINGS_INT = SubLObjectFactory.makeSymbol("SPEECH-PART-PRED-MIN-CEILINGS-INT");
        $sym24$_SPEECH_PART_PRED_MIN_CEILINGS_INT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SPEECH-PART-PRED-MIN-CEILINGS-INT-CACHING-STATE*");
        $int25$512 = SubLObjectFactory.makeInteger(512);
        $sym26$CLEAR_SPEECH_PART_PRED_MIN_CEILINGS_INT = SubLObjectFactory.makeSymbol("CLEAR-SPEECH-PART-PRED-MIN-CEILINGS-INT");
        $sym27$SPEECH_PART_PRED_MAX_FLOORS_INT = SubLObjectFactory.makeSymbol("SPEECH-PART-PRED-MAX-FLOORS-INT");
        $sym28$_SPEECH_PART_PRED_MAX_FLOORS_INT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SPEECH-PART-PRED-MAX-FLOORS-INT-CACHING-STATE*");
        $sym29$CLEAR_SPEECH_PART_PRED_MAX_FLOORS_INT = SubLObjectFactory.makeSymbol("CLEAR-SPEECH-PART-PRED-MAX-FLOORS-INT");
        $sym30$POS_OF_PRED = SubLObjectFactory.makeSymbol("POS-OF-PRED");
        $sym31$SPEECH_PART_PRED_ = SubLObjectFactory.makeSymbol("SPEECH-PART-PRED?");
        $const32$speechPartPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds"));
        $sym33$SPEC_POS_ = SubLObjectFactory.makeSymbol("SPEC-POS?");
        $sym34$_POS_OF_PRED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*POS-OF-PRED-CACHING-STATE*");
        $int35$128 = SubLObjectFactory.makeInteger(128);
        $const36$Noun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"));
        $const37$singular_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular-Generic"));
        $const38$plural_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural-Generic"));
        $sym39$_DERIVED_PREDS_ = SubLObjectFactory.makeSymbol("*DERIVED-PREDS*");
        $int40$256 = SubLObjectFactory.makeInteger(256);
        $const41$regularSuffix = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularSuffix"));
        $kw42$GAF = SubLObjectFactory.makeKeyword("GAF");
        $const43$ProperNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNoun"));
        $kw44$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw45$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw46$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym47$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw48$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str49$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym50$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw51$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str52$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw53$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str54$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const55$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $kw56$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $str57$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str58$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str59$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $const60$EnglishMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt"));
        $sym61$_SPEECH_PART_PREDS_ = SubLObjectFactory.makeSymbol("*SPEECH-PART-PREDS*");
        $list62 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)lexicon_accessors.NIL)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw64$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw65$MT = SubLObjectFactory.makeKeyword("MT");
        $kw66$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym67$DEFINING_MT = SubLObjectFactory.makeUninternedSymbol("DEFINING-MT");
        $sym68$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENSURE-SPEECH-PART-PREDS-INITIALIZED"));
        $sym70$DO_DICTIONARY = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $sym71$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym72$COR = SubLObjectFactory.makeSymbol("COR");
        $sym73$KBEQ = SubLObjectFactory.makeSymbol("KBEQ");
        $list74 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC")));
        $sym75$GENL_LEXICON_MT_ = SubLObjectFactory.makeSymbol("GENL-LEXICON-MT?");
        $const76$SpeechPartPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SpeechPartPredicate"));
        $const77$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym78$GENL_POS_PRED_ = SubLObjectFactory.makeSymbol("GENL-POS-PRED?");
        $sym79$_GENL_POS_PRED__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GENL-POS-PRED?-CACHING-STATE*");
        $sym80$CLEAR_GENL_POS_PRED_ = SubLObjectFactory.makeSymbol("CLEAR-GENL-POS-PRED?");
        $sym81$GENL_POS_PRED_FROM_MT_INFO_ = SubLObjectFactory.makeSymbol("GENL-POS-PRED-FROM-MT-INFO?");
        $sym82$RELEVANT_MT_IS_ANY_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT");
        $sym83$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER");
        $sym84$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $sym85$_GENL_POS_PRED_FROM_MT_INFO__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GENL-POS-PRED-FROM-MT-INFO?-CACHING-STATE*");
        $sym86$CLEAR_GENL_POS_PRED_FROM_MT_INFO_ = SubLObjectFactory.makeSymbol("CLEAR-GENL-POS-PRED-FROM-MT-INFO?");
        $sym87$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym88$STRING_ = SubLObjectFactory.makeSymbol("STRING=");
        $const89$ClosedClassWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ClosedClassWord"));
        $const90$partOfSpeech = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("partOfSpeech"));
        $sym91$GET_STRINGS_OF_TYPE_CACHED = SubLObjectFactory.makeSymbol("GET-STRINGS-OF-TYPE-CACHED");
        $sym92$_GET_STRINGS_OF_TYPE_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-STRINGS-OF-TYPE-CACHED-CACHING-STATE*");
        $sym93$STRING_IS_POS_ON_WU_ = SubLObjectFactory.makeSymbol("STRING-IS-POS-ON-WU?");
        $sym94$GET_STRINGS_OF_TYPE = SubLObjectFactory.makeSymbol("GET-STRINGS-OF-TYPE");
        $sym95$LEXICAL_WORD_ = SubLObjectFactory.makeSymbol("LEXICAL-WORD?");
        $sym96$PARSE_MORPHOLOGICALLY_OPTION_P = SubLObjectFactory.makeSymbol("PARSE-MORPHOLOGICALLY-OPTION-P");
        $kw97$NEVER = SubLObjectFactory.makeKeyword("NEVER");
        $sym98$EQUALS_EL_ = SubLObjectFactory.makeSymbol("EQUALS-EL?");
        $kw99$AS_FALLBACK = SubLObjectFactory.makeKeyword("AS-FALLBACK");
        $sym100$SPEC_ = SubLObjectFactory.makeSymbol("SPEC?");
        $const101$EnglishLexiconMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishLexiconMt"));
        $sym102$POS_FOR_KEYWORD = SubLObjectFactory.makeSymbol("POS-FOR-KEYWORD");
        $sym103$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $kw104$ALL_NOUN_FORMS = SubLObjectFactory.makeKeyword("ALL-NOUN-FORMS");
        $kw105$NOUN = SubLObjectFactory.makeKeyword("NOUN");
        $list106 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AgentiveNoun")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MassNoun")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GerundiveNoun")));
        $kw107$MASS_NOUN = SubLObjectFactory.makeKeyword("MASS-NOUN");
        $list108 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MassNoun")));
        $kw109$SIMPLE_NOUN = SubLObjectFactory.makeKeyword("SIMPLE-NOUN");
        $const110$CountNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun"));
        $kw111$DEVERBAL_NOUN = SubLObjectFactory.makeKeyword("DEVERBAL-NOUN");
        $const112$DeVerbalNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DeVerbalNoun"));
        $kw113$AGENTIVE_NOUN = SubLObjectFactory.makeKeyword("AGENTIVE-NOUN");
        $const114$AgentiveNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AgentiveNoun"));
        $kw115$GERUNDIVE_NOUN = SubLObjectFactory.makeKeyword("GERUNDIVE-NOUN");
        $const116$GerundiveNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GerundiveNoun"));
        $kw117$PROPER_NOUN = SubLObjectFactory.makeKeyword("PROPER-NOUN");
        $kw118$VERB = SubLObjectFactory.makeKeyword("VERB");
        $list119 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")));
        $kw120$AUX = SubLObjectFactory.makeKeyword("AUX");
        $const121$AuxVerb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AuxVerb"));
        $kw122$ADJECTIVE = SubLObjectFactory.makeKeyword("ADJECTIVE");
        $const123$Adjective = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective"));
        $kw124$ADVERB = SubLObjectFactory.makeKeyword("ADVERB");
        $const125$Adverb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adverb"));
        $kw126$PREP = SubLObjectFactory.makeKeyword("PREP");
        $const127$Preposition = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Preposition"));
        $kw128$DET = SubLObjectFactory.makeKeyword("DET");
        $const129$Determiner = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Determiner"));
        $kw130$CONJ = SubLObjectFactory.makeKeyword("CONJ");
        $const131$Conjunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Conjunction"));
        $kw132$ANY = SubLObjectFactory.makeKeyword("ANY");
        $sym133$_POS_FOR_KEYWORD_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*POS-FOR-KEYWORD-CACHING-STATE*");
        $int134$64 = SubLObjectFactory.makeInteger(64);
        $list135 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abbreviationForLexicalWord")));
        $sym136$PROPER_NOUN_FORM_OF_PRED = SubLObjectFactory.makeSymbol("PROPER-NOUN-FORM-OF-PRED");
        $sym137$PREDS_OF_STRING_WORD_CACHED = SubLObjectFactory.makeSymbol("PREDS-OF-STRING&WORD-CACHED");
        $sym138$_PREDS_OF_STRING_WORD_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PREDS-OF-STRING&WORD-CACHED-CACHING-STATE*");
        $sym139$_STRING = SubLObjectFactory.makeSymbol("?STRING");
        $kw140$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $sym141$_POS = SubLObjectFactory.makeSymbol("?POS");
        $const142$Verb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"));
        $const143$GeneralEnglishMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt"));
        $const144$FrameForAdverbs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FrameForAdverbs"));
        $const145$ProperCountNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperCountNoun"));
        $list146 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DefiniteDeterminerFrame")));
        $const147$ProperMassNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperMassNoun"));
        $const148$FrameForNouns = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FrameForNouns"));
        $const149$MassNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MassNoun"));
        $const150$ZeroArticleFrame = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ZeroArticleFrame"));
        $const151$FrameForAdjectives = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FrameForAdjectives"));
        $sym152$_CLOSED_LEXICAL_CLASS_STRINGS_ = SubLObjectFactory.makeSymbol("*CLOSED-LEXICAL-CLASS-STRINGS*");
        $sym153$_CLOSED_LEXICAL_CLASS_STRINGS_CASE_INSENSITIVE_ = SubLObjectFactory.makeSymbol("*CLOSED-LEXICAL-CLASS-STRINGS-CASE-INSENSITIVE*");
        $const154$Pronoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pronoun"));
        $sym155$NOT_TEST_CHAR = SubLObjectFactory.makeSymbol("NOT-TEST-CHAR");
        $sym156$CLOSED_LEXICAL_CLASS_STRINGS = SubLObjectFactory.makeSymbol("CLOSED-LEXICAL-CLASS-STRINGS");
        $sym157$_CLOSED_LEXICAL_CLASS_STRINGS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CLOSED-LEXICAL-CLASS-STRINGS-CACHING-STATE*");
        $sym158$CLOSED_LEXICAL_CLASSES = SubLObjectFactory.makeSymbol("CLOSED-LEXICAL-CLASSES");
        $sym159$_CLOSED_LEXICAL_CLASSES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CLOSED-LEXICAL-CLASSES-CACHING-STATE*");
        $list160 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("posForms")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("posBaseForms")));
        $list161 = (SubLList)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordWithPrefixFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordWithSuffixFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CompoundWordFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CompoundWordFn-HeadMedial")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CompoundWordFn-HeadInitial"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $const162$LexicalWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LexicalWord"));
        $int163$1000 = SubLObjectFactory.makeInteger(1000);
        $sym164$DERIVED_WORD_ = SubLObjectFactory.makeSymbol("DERIVED-WORD?");
        $const165$DerivedWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DerivedWord"));
        $sym166$_VULGAR_WORDS_ = SubLObjectFactory.makeSymbol("*VULGAR-WORDS*");
        $const167$InherentlyVulgarWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InherentlyVulgarWord"));
        $list168 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MT"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("TV"));
        $str169$The_word_unit__S_is_neither_a_FOR = SubLObjectFactory.makeString("The word-unit ~S is neither a FORT nor a NAUT.");
        $sym170$VERB_ONLY_STRING_ = SubLObjectFactory.makeSymbol("VERB-ONLY-STRING?");
        $sym171$_VERB_ONLY_STRING__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*VERB-ONLY-STRING?-CACHING-STATE*");
        $kw172$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $sym173$EL_FORT_P = SubLObjectFactory.makeSymbol("EL-FORT-P");
        $sym174$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym175$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $sym176$HLMT_ = SubLObjectFactory.makeSymbol("HLMT?");
        $sym177$SET_P = SubLObjectFactory.makeSymbol("SET-P");
        $sym178$TYPED_DENOTS_OF_STRING = SubLObjectFactory.makeSymbol("TYPED-DENOTS-OF-STRING");
        $list179 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("&OPTIONAL"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ABBREV-TYPES"), (SubLObject)lexicon_accessors.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DENOT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MISSPELLINGS?"), (SubLObject)lexicon_accessors.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKIP-NAMESTRINGS?"), (SubLObject)lexicon_accessors.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOOKUP-MT"), (SubLObject)SubLObjectFactory.makeSymbol("*LEXICON-LOOKUP-MT*")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMANTIC-MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-MORPHOLOGICALLY"), (SubLObject)SubLObjectFactory.makeSymbol("*PARSE-MORPHOLOGICALLY*")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-PREDICATES"), (SubLObject)SubLObjectFactory.makeSymbol("*SEMANTIC-PREDICATES-EXCLUDED-FROM-LEXICAL-LOOKUP*")) });
        $str180$_param_STRING_string_____param_TY = SubLObjectFactory.makeString("@param STRING string\n   @param TYPE collection\n   @param PARSE-MORPHOLOGICALLY: PARSE-MORPHOLOGICALLY-OPTION-P\n                                  Do we attempt to parse STRING as a complex (multi-morpheme) word?\n   @return list; a list of denotata for STRING that are instances of TYPE\n   note that this function does some parsing, if the type sent in is appropriate");
        $list181 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ABBREV-TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MISSPELLINGS?"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKIP-NAMESTRINGS?"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOOKUP-MT"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT?")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMANTIC-MT"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT?")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-MORPHOLOGICALLY"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-MORPHOLOGICALLY-OPTION-P")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-PREDICATES"), (SubLObject)SubLObjectFactory.makeSymbol("SET-P")) });
        $list182 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $sym183$DENOT_HAS_TYPE_ = SubLObjectFactory.makeSymbol("DENOT-HAS-TYPE?");
        $sym184$DENOT_MIGHT_HAVE_TYPE_ = SubLObjectFactory.makeSymbol("DENOT-MIGHT-HAVE-TYPE?");
        $sym185$MORE_SPECIFIC_P = SubLObjectFactory.makeSymbol("MORE-SPECIFIC-P");
        $const186$City = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("City"));
        $const187$GeopoliticalEntity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeopoliticalEntity"));
        $const188$CityNamedFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CityNamedFn"));
        $const189$InstanceNamedFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn"));
        $const190$SubcollectionOfWithRelationToFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn"));
        $const191$inRegion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inRegion"));
        $const192$GeographicalRegion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeographicalRegion"));
        $const193$geopoliticalSubdivision = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("geopoliticalSubdivision"));
        $const194$geographicalSubRegions = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("geographicalSubRegions"));
        $const195$territoryOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("territoryOf"));
        $str196$_ = SubLObjectFactory.makeString("*");
        $list197 = ConsesLow.list((SubLObject)Characters.CHAR_asterisk);
        $list198 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("*"));
        $kw199$INFIX = SubLObjectFactory.makeKeyword("INFIX");
        $str200$ = SubLObjectFactory.makeString("");
        $str201$I_should_never_be_called___ = SubLObjectFactory.makeString("I should never be called...");
        $kw202$GREEDY = SubLObjectFactory.makeKeyword("GREEDY");
        $sym203$LIST_OF_PREDICATES_P = SubLObjectFactory.makeSymbol("LIST-OF-PREDICATES-P");
        $sym204$DENOTATION_MAPPER = SubLObjectFactory.makeSymbol("DENOTATION-MAPPER");
        $list205 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-PREDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODE"), (SubLObject)SubLObjectFactory.makeKeyword("GREEDY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-MORPHOLOGICALLY"), (SubLObject)SubLObjectFactory.makeSymbol("*PARSE-MORPHOLOGICALLY*")));
        $str206$_param_STRING_string__the_string_ = SubLObjectFactory.makeString("@param STRING string; the string to map to its denotations\n   @param EXCLUDED-PREDS list; a list of semantic predicates which should be ignored when computing mappings \n   @param MODE keyword; :greedy or :diligent\n   @param PARSE-MORPHOLOGICALLY: PARSE-MORPHOLOGICALLY-OPTION-P\n                                  Do we attempt to parse STRING as a complex (multi-morpheme) word?\n   @return 0 LISTP; a list of STRING-TOKENs, each of which contains as its STRING-TOKEN-STRING some substring \n                    of STRING and as its STRING-TOKEN-VALUE a denotatum for that string\n   @return 1 LISTP; a list of STRING-TOKENS for which no denotatum could be found");
        $list207 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXCLUDED-PREDS"), (SubLObject)SubLObjectFactory.makeSymbol("LIST-OF-PREDICATES-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-MORPHOLOGICALLY"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-MORPHOLOGICALLY-OPTION-P")));
        $list208 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-TOKEN-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-TOKEN-P")));
        $list209 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ABBREVS"), (SubLObject)SubLObjectFactory.makeKeyword("ACRONYMS"));
        $kw210$RELATED = SubLObjectFactory.makeKeyword("RELATED");
        $sym211$CYCL_STRING_P = SubLObjectFactory.makeSymbol("CYCL-STRING-P");
        $sym212$VALID_DENOTS_OF_STRING_LOOKUP_MT_SPECIFICATION_ = SubLObjectFactory.makeSymbol("VALID-DENOTS-OF-STRING-LOOKUP-MT-SPECIFICATION?");
        $list213 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")));
        $sym214$DENOTS_OF_STRING = SubLObjectFactory.makeSymbol("DENOTS-OF-STRING");
        $list215 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("&OPTIONAL"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ABBREV-TYPES"), (SubLObject)lexicon_accessors.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DENOT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MISSPELLINGS?"), (SubLObject)lexicon_accessors.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKIP-NAMESTRINGS?"), (SubLObject)lexicon_accessors.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOOKUP-MT"), (SubLObject)SubLObjectFactory.makeSymbol("*LEXICON-LOOKUP-MT*")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-MORPHOLOGICALLY"), (SubLObject)SubLObjectFactory.makeSymbol("*PARSE-MORPHOLOGICALLY*")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-DATES-AND-NUMBERS?"), (SubLObject)lexicon_accessors.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)lexicon_accessors.NIL) });
        $str216$_param_PARSE_MORPHOLOGICALLY__PAR = SubLObjectFactory.makeString("@param PARSE-MORPHOLOGICALLY: PARSE-MORPHOLOGICALLY-OPTION-P\n                                  Do we attempt to parse STRING as a complex (multi-morpheme) word?\n   @param abbrev-types; listp: if it includes :abbrevs, include abbreviations;\n                               if it includes :acronyms, include acronyms\n   @param denot-type; keywordp: \n      :denot =  #$denotation assertions  (parsing)\n      :related = #$denotation and #$denotationRelatedTo (generation)\n      :any = #$denotation, #$denotationRelatedTo, and #$denotationPlaceholder\n   @param LOOKUP-MT: Lexical microtheory or ISO language code such as 'en'.\n   @param PARSE-DATES-AND-NUMBERS? booleanp; if set to NIL, DENOTS-OF-STRING will only perform lexical lookup, and \n      not try to parse any dates or numbers\n   @param LEXICON term-lexicon-p; if present, LOOKUP-MT will be ignored and LEXICON will be used instead.\n   @return 0. LISTP ; CycL denotational terms serving as denotations for the phrase\n   @return 1. LISTP ; list of predicate lists for each denotation");
        $list217 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-STRING-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ABBREV-TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MISSPELLINGS?"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKIP-NAMESTRINGS?"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOOKUP-MT"), (SubLObject)SubLObjectFactory.makeSymbol("VALID-DENOTS-OF-STRING-LOOKUP-MT-SPECIFICATION?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-MORPHOLOGICALLY"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-MORPHOLOGICALLY-OPTION-P")));
        $sym218$DENOTS_MT_FOR_LANGUAGE = SubLObjectFactory.makeSymbol("DENOTS-MT-FOR-LANGUAGE");
        $const219$validatedLexicalPSCForLanguage = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("validatedLexicalPSCForLanguage"));
        $const220$MtSpace = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtSpace"));
        $const221$AnytimePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnytimePSC"));
        $str222$_S_passes_neither_SPEECH_PART_PRE = SubLObjectFactory.makeString("~S passes neither SPEECH-PART-PRED? nor NAME-STRING-PRED?");
        $sym223$NAME_STRING_PRED_ = SubLObjectFactory.makeSymbol("NAME-STRING-PRED?");
        $kw224$ONLY = SubLObjectFactory.makeKeyword("ONLY");
        $kw225$ALWAYS = SubLObjectFactory.makeKeyword("ALWAYS");
        $const226$ProperNamePredicate_Strict = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNamePredicate-Strict"));
        $kw227$JUST_RELATED = SubLObjectFactory.makeKeyword("JUST-RELATED");
        $list228 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationRelatedTo")));
        $kw229$JUST_PLACEHOLDER = SubLObjectFactory.makeKeyword("JUST-PLACEHOLDER");
        $list230 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationPlaceholder")));
        $list231 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationRelatedTo")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation")));
        $list232 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationPlaceholder")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationRelatedTo")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation")));
        $list233 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation")));
        $const234$denotation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation"));
        $kw235$PLACEHOLDER = SubLObjectFactory.makeKeyword("PLACEHOLDER");
        $const236$denotationPlaceholder = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationPlaceholder"));
        $const237$denotationRelatedTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotationRelatedTo"));
        $const238$subcatFrame = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subcatFrame"));
        $sym239$_ = SubLObjectFactory.makeSymbol("<");
        $sym240$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $const241$subcatFrameArity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subcatFrameArity"));
        $const242$politenessOfWS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("politenessOfWS"));
        $const243$formalityOfWS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formalityOfWS"));
        $sym244$_LEVEL = SubLObjectFactory.makeSymbol("?LEVEL");
        $list245 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?LEVEL"));
        $list246 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RudeSpeech")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VulgarSpeech")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ObjectionableSpeech")));
        $sym247$POTENTIALLY_OFFENSIVE_POLITENESS_LEVEL_ = SubLObjectFactory.makeSymbol("POTENTIALLY-OFFENSIVE-POLITENESS-LEVEL?");
        $const248$SlangSpeech = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SlangSpeech"));
        $const249$ArchaicSpeech = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArchaicSpeech"));
        $sym250$INDIRECT_LEXICAL_ASSERTION_ = SubLObjectFactory.makeSymbol("INDIRECT-LEXICAL-ASSERTION?");
        $const251$DenotationPredicate_ExcludedFromN = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DenotationPredicate-ExcludedFromNPParser"));
        $sym252$_INDIRECT_LEXICAL_ASSERTION__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*INDIRECT-LEXICAL-ASSERTION?-CACHING-STATE*");
        $sym253$CLEAR_INDIRECT_LEXICAL_ASSERTION_ = SubLObjectFactory.makeSymbol("CLEAR-INDIRECT-LEXICAL-ASSERTION?");
        $sym254$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym255$GAF_ASSERTION_ = SubLObjectFactory.makeSymbol("GAF-ASSERTION?");
        $const256$Quote = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quote"));
        $sym257$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym258$CDR = SubLObjectFactory.makeSymbol("CDR");
        $const259$TransitivePPFrameType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransitivePPFrameType"));
        $const260$DitransitivePPFrameType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DitransitivePPFrameType"));
        $sym261$AGR_OF_DET_STRING = SubLObjectFactory.makeSymbol("AGR-OF-DET-STRING");
        $list262 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonSingular-Generic")));
        $sym263$_AGR_OF_DET_STRING_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*AGR-OF-DET-STRING-CACHING-STATE*");
        $const264$determinerAgreement = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("determinerAgreement"));
        $sym265$POS_TO_SEMTRANS_PRED_CACHED = SubLObjectFactory.makeSymbol("POS-TO-SEMTRANS-PRED-CACHED");
        $const266$semTransPredForPOS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("semTransPredForPOS"));
        $sym267$_POS_TO_SEMTRANS_PRED_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*POS-TO-SEMTRANS-PRED-CACHED-CACHING-STATE*");
        $sym268$CLEAR_POS_TO_SEMTRANS_PRED_CACHED = SubLObjectFactory.makeSymbol("CLEAR-POS-TO-SEMTRANS-PRED-CACHED");
        $sym269$SEMTRANS_PRED_TO_POS = SubLObjectFactory.makeSymbol("SEMTRANS-PRED-TO-POS");
        $sym270$_SEMTRANS_PRED_TO_POS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SEMTRANS-PRED-TO-POS-CACHING-STATE*");
        $const271$commonNickname = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("commonNickname"));
        $const272$nameSpelling = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameSpelling"));
        $const273$SpeechPart = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SpeechPart"));
        $sym274$_SPEECH_PARTS_ = SubLObjectFactory.makeSymbol("*SPEECH-PARTS*");
        $sym275$GENL_POS_ = SubLObjectFactory.makeSymbol("GENL-POS?");
        $sym276$_GENL_POS__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GENL-POS?-CACHING-STATE*");
        $const277$NLWordForm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLWordForm"));
        $list278 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective")));
        $const279$PhraseFn_Bar1 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn-Bar1"));
        $sym280$COMPOSITIONAL_POS_NART = SubLObjectFactory.makeSymbol("COMPOSITIONAL-POS-NART");
        $sym281$_COMPOSITIONAL_POS_NART_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*COMPOSITIONAL-POS-NART-CACHING-STATE*");
        $list282 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounPhrase")));
        $list283 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Preposition"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrepositionalPhrase")));
        $kw284$UNDETERMINED = SubLObjectFactory.makeKeyword("UNDETERMINED");
        $kw285$POSSESSED_TYPE = SubLObjectFactory.makeKeyword("POSSESSED-TYPE");
        $kw286$DENOTED_PRED = SubLObjectFactory.makeKeyword("DENOTED-PRED");
        $kw287$POSSESSOR = SubLObjectFactory.makeKeyword("POSSESSOR");
        $kw288$POSSESSOR_TYPE = SubLObjectFactory.makeKeyword("POSSESSOR-TYPE");
        $list289 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)lexicon_accessors.T, (SubLObject)ConsesLow.list((SubLObject)lexicon_accessors.ONE_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSED-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DENOTED-PRED"), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSOR-TYPE")), (SubLObject)ConsesLow.list((SubLObject)lexicon_accessors.TWO_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromTypeFn")), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSED-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DENOTED-PRED"), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSOR-TYPE"))), (SubLObject)ConsesLow.list((SubLObject)lexicon_accessors.NIL, (SubLObject)ConsesLow.list((SubLObject)lexicon_accessors.ONE_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSED-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DENOTED-PRED"), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSOR")), (SubLObject)ConsesLow.list((SubLObject)lexicon_accessors.TWO_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromFn")), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSED-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DENOTED-PRED"), (SubLObject)SubLObjectFactory.makeKeyword("POSSESSOR"))));
        $const290$headMedialStringDenotesArgInReln = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("headMedialStringDenotesArgInReln"));
        $const291$multiWordStringDenotesArgInReln = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiWordStringDenotesArgInReln"));
        $const292$compoundStringDenotesArgInReln = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("compoundStringDenotesArgInReln"));
        $const293$denotesArgInReln = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotesArgInReln"));
        $list294 = ConsesLow.list((SubLObject)lexicon_accessors.ONE_INTEGER);
        $sym295$_PRED = SubLObjectFactory.makeSymbol("?PRED");
        $list296 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?ARGNUM"));
        $const297$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $kw298$TEST = SubLObjectFactory.makeKeyword("TEST");
        $sym299$SETS_EQUAL_EQUAL_ = SubLObjectFactory.makeSymbol("SETS-EQUAL-EQUAL?");
        $kw300$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw301$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw302$KB = SubLObjectFactory.makeKeyword("KB");
        $kw303$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw304$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list305 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ABEDA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ABBREV-TYPES"), (SubLObject)SubLObjectFactory.makeKeyword("ACRONYMS"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArabBankForEconomicDevelopmentInAfrica"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("acronymString"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("platform")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Platform-Military")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ComputerProcessor")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PoliticalBeliefSystem")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Platform"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("chemical engineering")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChemicalEngineering"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("massNumber"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("heart attack")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartAttack"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("&u99ac;")), (SubLObject)lexicon_accessors.NIL, (SubLObject)SubLObjectFactory.makeKeyword("DENOT"), (SubLObject)lexicon_accessors.NIL, (SubLObject)lexicon_accessors.NIL, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChineseLexicalMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Horse")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YoYoMa-Cellist"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("familyName"))))));
        $str306$missing___S = SubLObjectFactory.makeString("missing: ~S");
        $sym307$HL_TERM_WITH_EL_COUNTERPART_P = SubLObjectFactory.makeSymbol("HL-TERM-WITH-EL-COUNTERPART-P");
        $sym308$HL_TERM_TO_EL_TERM = SubLObjectFactory.makeSymbol("HL-TERM-TO-EL-TERM");
    }
    
    public static final class $speech_part_predP$UnaryFunction extends UnaryFunction
    {
        public $speech_part_predP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SPEECH-PART-PRED?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return lexicon_accessors.speech_part_predP(arg1, (SubLObject)$speech_part_predP$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $speech_part_predP$BinaryFunction extends BinaryFunction
    {
        public $speech_part_predP$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SPEECH-PART-PRED?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return lexicon_accessors.speech_part_predP(arg1, arg2);
        }
    }
    
    public static final class $genl_pos_predP$BinaryFunction extends BinaryFunction
    {
        public $genl_pos_predP$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GENL-POS-PRED?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return lexicon_accessors.genl_pos_predP(arg1, arg2, (SubLObject)$genl_pos_predP$BinaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $clear_pos_to_semtrans_pred_cached$ZeroArityFunction extends ZeroArityFunction
    {
        public $clear_pos_to_semtrans_pred_cached$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-POS-TO-SEMTRANS-PRED-CACHED"));
        }
        
        @Override
		public SubLObject processItem() {
            return lexicon_accessors.clear_pos_to_semtrans_pred_cached();
        }
    }
}

/*

	Total time: 5747 ms
	
*/